import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private int field123 = 69;

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    private int field124 = -203;

    @OriginalMember(owner = "e", name = "c", descriptor = "Z")
    private boolean field125 = false;

    @OriginalMember(owner = "e", name = "g", descriptor = "Z")
    private boolean field129 = false;

    @OriginalMember(owner = "e", name = "l", descriptor = "Z")
    private boolean field134 = false;

    @OriginalMember(owner = "e", name = "m", descriptor = "Z")
    private boolean field135 = false;

    @OriginalMember(owner = "e", name = "h", descriptor = "La;")
    public GameShell field130;

    @OriginalMember(owner = "e", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field128;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field126;

    @OriginalMember(owner = "e", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field127;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "e", name = "k", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "e", name = "i", descriptor = "[B")
    private byte[] field131;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(Ljava/net/Socket;La;I)V")
    public ClientStream(Socket arg0, GameShell arg1, int arg2) throws IOException {
        this.field130 = arg1;
        this.field128 = arg0;
        if (arg2 != 0) {
            this.field125 = !this.field125;
        }
        this.field128.setSoTimeout(30000);
        this.field128.setTcpNoDelay(true);
        this.field126 = this.field128.getInputStream();
        this.field127 = this.field128.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method37() {
        this.field129 = true;
        try {
            if (this.field126 != null) {
                this.field126.close();
            }
            if (this.field127 != null) {
                this.field127.close();
            }
            if (this.field128 != null) {
                this.field128.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field134 = false;
        synchronized (this) {
            this.notify();
        }
        this.field131 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method38() throws IOException {
        return this.field129 ? 0 : this.field126.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method39() throws IOException {
        return this.field129 ? 0 : this.field126.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method40(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field129) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field126.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(BI[BI)V")
    public void method41(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 == 7) {
            boolean var5 = false;
        } else {
            this.field124 = 227;
        }
        if (this.field129) {
            return;
        }
        if (this.field135) {
            this.field135 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field131 == null) {
            this.field131 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg1; var7++) {
                this.field131[this.field133] = arg2[arg3 + var7];
                this.field133 = (this.field133 + 1) % 5000;
                if ((this.field132 + 4900) % 5000 == this.field133) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field134) {
                this.field134 = true;
                this.field130.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field134) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field133 == this.field132) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field134) {
                    return;
                }
                var2 = this.field132;
                if (this.field133 >= this.field132) {
                    var3 = this.field133 - this.field132;
                } else {
                    var3 = 5000 - this.field132;
                }
            }
            if (var3 > 0) {
                try {
                    this.field127.write(this.field131, var2, var3);
                } catch (IOException var7) {
                    this.field135 = true;
                }
                this.field132 = (this.field132 + var3) % 5000;
                try {
                    if (this.field133 == this.field132) {
                        this.field127.flush();
                    }
                } catch (IOException var6) {
                    this.field135 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public void method42(int arg0) {
        System.out.println("dummy:" + this.field129);
        System.out.println("tcycl:" + this.field132);
        System.out.println("tnum:" + this.field133);
        System.out.println("writer:" + this.field134);
        if (arg0 != 0) {
            return;
        }
        System.out.println("ioerror:" + this.field135);
        try {
            System.out.println("available:" + this.method39());
        } catch (IOException var2) {
        }
    }
}
