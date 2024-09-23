import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "Z")
    private boolean field134 = false;

    @OriginalMember(owner = "e", name = "e", descriptor = "Z")
    private boolean field138 = false;

    @OriginalMember(owner = "e", name = "j", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field144 = false;

    @OriginalMember(owner = "e", name = "f", descriptor = "La;")
    public GameShell field139;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field137;

    @OriginalMember(owner = "e", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field135;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field136;

    @OriginalMember(owner = "e", name = "h", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "e", name = "g", descriptor = "[B")
    private byte[] field140;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(Ljava/net/Socket;La;I)V")
    public ClientStream(Socket arg0, GameShell arg1, int arg2) throws IOException {
        this.field139 = arg1;
        this.field137 = arg0;
        this.field137.setSoTimeout(30000);
        if (arg2 != 564) {
            this.field134 = !this.field134;
        }
        this.field137.setTcpNoDelay(true);
        this.field135 = this.field137.getInputStream();
        this.field136 = this.field137.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field138 = true;
        try {
            if (this.field135 != null) {
                this.field135.close();
            }
            if (this.field136 != null) {
                this.field136.close();
            }
            if (this.field137 != null) {
                this.field137.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field143 = false;
        synchronized (this) {
            this.notify();
        }
        this.field140 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field138 ? 0 : this.field135.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field138 ? 0 : this.field135.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field138) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field135.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II[BI)V")
    public void method42(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = 65 / arg0;
        if (this.field138) {
            return;
        }
        if (this.field144) {
            this.field144 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field140 == null) {
            this.field140 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg1; var7++) {
                this.field140[this.field142] = arg2[arg3 + var7];
                this.field142 = (this.field142 + 1) % 5000;
                if ((this.field141 + 4900) % 5000 == this.field142) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field143) {
                this.field143 = true;
                this.field139.method12(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field143) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field142 == this.field141) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field143) {
                    return;
                }
                var2 = this.field141;
                if (this.field142 >= this.field141) {
                    var3 = this.field142 - this.field141;
                } else {
                    var3 = 5000 - this.field141;
                }
            }
            if (var3 > 0) {
                try {
                    this.field136.write(this.field140, var2, var3);
                } catch (IOException var7) {
                    this.field144 = true;
                }
                this.field141 = (this.field141 + var3) % 5000;
                try {
                    if (this.field142 == this.field141) {
                        this.field136.flush();
                    }
                } catch (IOException var6) {
                    this.field144 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public void method43(int arg0) {
        System.out.println("dummy:" + this.field138);
        System.out.println("tcycl:" + this.field141);
        if (arg0 < 6 || arg0 > 6) {
            this.field134 = !this.field134;
        }
        System.out.println("tnum:" + this.field142);
        System.out.println("writer:" + this.field143);
        System.out.println("ioerror:" + this.field144);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var2) {
        }
    }
}
