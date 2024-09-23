import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "e", name = "a", descriptor = "Z")
    private boolean field131 = true;

    @OriginalMember(owner = "e", name = "e", descriptor = "Z")
    private boolean field135 = false;

    @OriginalMember(owner = "e", name = "j", descriptor = "Z")
    private boolean field140 = false;

    @OriginalMember(owner = "e", name = "k", descriptor = "Z")
    private boolean field141 = false;

    @OriginalMember(owner = "e", name = "f", descriptor = "La;")
    public GameShell field136;

    @OriginalMember(owner = "e", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field134;

    @OriginalMember(owner = "e", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field132;

    @OriginalMember(owner = "e", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field133;

    @OriginalMember(owner = "e", name = "h", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "e", name = "i", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "e", name = "g", descriptor = "[B")
    private byte[] field137;

    @OriginalMember(owner = "e", name = "<init>", descriptor = "(La;Ljava/net/Socket;I)V")
    public ClientStream(GameShell arg0, Socket arg1, int arg2) throws IOException {
        this.field136 = arg0;
        if (arg2 < 7 || arg2 > 7) {
            this.field131 = !this.field131;
        }
        this.field134 = arg1;
        this.field134.setSoTimeout(30000);
        this.field134.setTcpNoDelay(true);
        this.field132 = this.field134.getInputStream();
        this.field133 = this.field134.getOutputStream();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "()V")
    public void method38() {
        this.field135 = true;
        try {
            if (this.field132 != null) {
                this.field132.close();
            }
            if (this.field133 != null) {
                this.field133.close();
            }
            if (this.field134 != null) {
                this.field134.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field140 = false;
        synchronized (this) {
            this.notify();
        }
        this.field137 = null;
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "()I")
    public int method39() throws IOException {
        return this.field135 ? 0 : this.field132.read();
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "()I")
    public int method40() throws IOException {
        return this.field135 ? 0 : this.field132.available();
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "([BII)V")
    public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field135) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field132.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II[BI)V")
    public void method42(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field135) {
            return;
        }
        if (this.field141) {
            this.field141 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field137 == null) {
            this.field137 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg3) {
                    if (!this.field140) {
                        this.field140 = true;
                        this.field136.method12(this, 3);
                    }
                    this.notify();
                    break;
                }
                this.field137[this.field139] = arg2[arg0 + var6];
                this.field139 = (this.field139 + 1) % 5000;
                if ((this.field138 + 4900) % 5000 == this.field139) {
                    throw new IOException("buffer overflow");
                }
                var6++;
            }
        }
        if (arg1 != 7) {
            this.field131 = !this.field131;
        }
    }

    @OriginalMember(owner = "e", name = "run", descriptor = "()V")
    public void run() {
        while (this.field140) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field139 == this.field138) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field140) {
                    return;
                }
                var2 = this.field138;
                if (this.field139 >= this.field138) {
                    var3 = this.field139 - this.field138;
                } else {
                    var3 = 5000 - this.field138;
                }
            }
            if (var3 > 0) {
                try {
                    this.field133.write(this.field137, var2, var3);
                } catch (IOException var7) {
                    this.field141 = true;
                }
                this.field138 = (this.field138 + var3) % 5000;
                try {
                    if (this.field139 == this.field138) {
                        this.field133.flush();
                    }
                } catch (IOException var6) {
                    this.field141 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public void method43(byte arg0) {
        System.out.println("dummy:" + this.field135);
        System.out.println("tcycl:" + this.field138);
        if (arg0 != 6) {
            return;
        }
        boolean var2 = false;
        System.out.println("tnum:" + this.field139);
        System.out.println("writer:" + this.field140);
        System.out.println("ioerror:" + this.field141);
        try {
            System.out.println("available:" + this.method40());
        } catch (IOException var3) {
        }
    }
}
