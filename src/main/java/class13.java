import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EDOAEAIN")
public class class13 implements Runnable {

    @OriginalMember(owner = "EDOAEAIN", name = "a", descriptor = "Z")
    private boolean field661 = false;

    @OriginalMember(owner = "EDOAEAIN", name = "b", descriptor = "B")
    private byte field662 = -89;

    @OriginalMember(owner = "EDOAEAIN", name = "c", descriptor = "B")
    private byte field663 = 42;

    @OriginalMember(owner = "EDOAEAIN", name = "g", descriptor = "Z")
    private boolean field667 = false;

    @OriginalMember(owner = "EDOAEAIN", name = "l", descriptor = "Z")
    private boolean field672 = false;

    @OriginalMember(owner = "EDOAEAIN", name = "m", descriptor = "Z")
    private boolean field673 = false;

    @OriginalMember(owner = "EDOAEAIN", name = "h", descriptor = "LHXQNMAEJ;")
    public class29 field668;

    @OriginalMember(owner = "EDOAEAIN", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field666;

    @OriginalMember(owner = "EDOAEAIN", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field664;

    @OriginalMember(owner = "EDOAEAIN", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field665;

    @OriginalMember(owner = "EDOAEAIN", name = "j", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "EDOAEAIN", name = "k", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "EDOAEAIN", name = "i", descriptor = "[B")
    private byte[] field669;

    @OriginalMember(owner = "EDOAEAIN", name = "<init>", descriptor = "(Ljava/net/Socket;LHXQNMAEJ;B)V")
    public class13(Socket arg0, class29 arg1, byte arg2) throws IOException {
        if (this.field662 != arg2) {
            throw new NullPointerException();
        }
        this.field668 = arg1;
        this.field666 = arg0;
        this.field666.setSoTimeout(30000);
        this.field666.setTcpNoDelay(true);
        this.field664 = this.field666.getInputStream();
        this.field665 = this.field666.getOutputStream();
    }

    @OriginalMember(owner = "EDOAEAIN", name = "a", descriptor = "()V")
    public void method227() {
        this.field667 = true;
        try {
            if (this.field664 != null) {
                this.field664.close();
            }
            if (this.field665 != null) {
                this.field665.close();
            }
            if (this.field666 != null) {
                this.field666.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field672 = false;
        synchronized (this) {
            this.notify();
        }
        this.field669 = null;
    }

    @OriginalMember(owner = "EDOAEAIN", name = "b", descriptor = "()I")
    public int method228() throws IOException {
        return this.field667 ? 0 : this.field664.read();
    }

    @OriginalMember(owner = "EDOAEAIN", name = "c", descriptor = "()I")
    public int method229() throws IOException {
        return this.field667 ? 0 : this.field664.available();
    }

    @OriginalMember(owner = "EDOAEAIN", name = "a", descriptor = "([BII)V")
    public void method230(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field667) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field664.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "EDOAEAIN", name = "a", descriptor = "([BIZI)V")
    public void method231(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        if (!arg2) {
            this.field661 = !this.field661;
        }
        if (this.field667) {
            return;
        }
        if (this.field673) {
            this.field673 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field669 == null) {
            this.field669 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field669[this.field671] = arg0[arg3 + var6];
                this.field671 = (this.field671 + 1) % 5000;
                if ((this.field670 + 4900) % 5000 == this.field671) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field672) {
                this.field672 = true;
                this.field668.method64(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "EDOAEAIN", name = "run", descriptor = "()V")
    public void run() {
        while (this.field672) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field671 == this.field670) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field672) {
                    return;
                }
                var2 = this.field670;
                if (this.field671 >= this.field670) {
                    var3 = this.field671 - this.field670;
                } else {
                    var3 = 5000 - this.field670;
                }
            }
            if (var3 > 0) {
                try {
                    this.field665.write(this.field669, var2, var3);
                } catch (IOException var7) {
                    this.field673 = true;
                }
                this.field670 = (this.field670 + var3) % 5000;
                try {
                    if (this.field671 == this.field670) {
                        this.field665.flush();
                    }
                } catch (IOException var6) {
                    this.field673 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "EDOAEAIN", name = "a", descriptor = "(Z)V")
    public void method232(boolean arg0) {
        if (!arg0) {
            return;
        }
        System.out.println("dummy:" + this.field667);
        System.out.println("tcycl:" + this.field670);
        System.out.println("tnum:" + this.field671);
        System.out.println("writer:" + this.field672);
        System.out.println("ioerror:" + this.field673);
        try {
            System.out.println("available:" + this.method229());
        } catch (IOException var2) {
        }
    }
}
