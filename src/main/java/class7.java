import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CLJPNHPC")
public class class7 implements Runnable {

    @OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "Z")
    private boolean field627 = true;

    @OriginalMember(owner = "client!CLJPNHPC", name = "b", descriptor = "I")
    private int field628 = 192;

    @OriginalMember(owner = "client!CLJPNHPC", name = "f", descriptor = "Z")
    private boolean field632 = false;

    @OriginalMember(owner = "client!CLJPNHPC", name = "k", descriptor = "Z")
    private boolean field637 = false;

    @OriginalMember(owner = "client!CLJPNHPC", name = "l", descriptor = "Z")
    private boolean field638 = false;

    @OriginalMember(owner = "client!CLJPNHPC", name = "g", descriptor = "LUBLCAEEN;")
    public class51 field633;

    @OriginalMember(owner = "client!CLJPNHPC", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field631;

    @OriginalMember(owner = "client!CLJPNHPC", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field629;

    @OriginalMember(owner = "client!CLJPNHPC", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field630;

    @OriginalMember(owner = "client!CLJPNHPC", name = "i", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client!CLJPNHPC", name = "j", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!CLJPNHPC", name = "h", descriptor = "[B")
    private byte[] field634;

    @OriginalMember(owner = "client!CLJPNHPC", name = "<init>", descriptor = "(Ljava/net/Socket;LUBLCAEEN;I)V")
    public class7(Socket arg0, class51 arg1, int arg2) throws IOException {
        this.field633 = arg1;
        this.field631 = arg0;
        this.field631.setSoTimeout(30000);
        this.field631.setTcpNoDelay(true);
        this.field629 = this.field631.getInputStream();
        if (arg2 <= 0) {
            throw new NullPointerException();
        }
        this.field630 = this.field631.getOutputStream();
    }

    @OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "()V")
    public void method187() {
        this.field632 = true;
        try {
            if (this.field629 != null) {
                this.field629.close();
            }
            if (this.field630 != null) {
                this.field630.close();
            }
            if (this.field631 != null) {
                this.field631.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field637 = false;
        synchronized (this) {
            this.notify();
        }
        this.field634 = null;
    }

    @OriginalMember(owner = "client!CLJPNHPC", name = "b", descriptor = "()I")
    public int method188() throws IOException {
        return this.field632 ? 0 : this.field629.read();
    }

    @OriginalMember(owner = "client!CLJPNHPC", name = "c", descriptor = "()I")
    public int method189() throws IOException {
        return this.field632 ? 0 : this.field629.available();
    }

    @OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "([BII)V")
    public void method190(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field632) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field629.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "([BZII)V")
    public void method191(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        if (!arg1) {
            this.field627 = !this.field627;
        }
        if (this.field632) {
            return;
        }
        if (this.field638) {
            this.field638 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field634 == null) {
            this.field634 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field634[this.field636] = arg0[arg2 + var6];
                this.field636 = (this.field636 + 1) % 5000;
                if ((this.field635 + 4900) % 5000 == this.field636) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field637) {
                this.field637 = true;
                this.field633.method185(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!CLJPNHPC", name = "run", descriptor = "()V")
    public void run() {
        while (this.field637) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field636 == this.field635) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field637) {
                    return;
                }
                var2 = this.field635;
                if (this.field636 >= this.field635) {
                    var3 = this.field636 - this.field635;
                } else {
                    var3 = 5000 - this.field635;
                }
            }
            if (var3 > 0) {
                try {
                    this.field630.write(this.field634, var2, var3);
                } catch (IOException var7) {
                    this.field638 = true;
                }
                this.field635 = (this.field635 + var3) % 5000;
                try {
                    if (this.field636 == this.field635) {
                        this.field630.flush();
                    }
                } catch (IOException var6) {
                    this.field638 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "(Z)V")
    public void method192(boolean arg0) {
        System.out.println("dummy:" + this.field632);
        System.out.println("tcycl:" + this.field635);
        System.out.println("tnum:" + this.field636);
        if (!arg0) {
            return;
        }
        System.out.println("writer:" + this.field637);
        System.out.println("ioerror:" + this.field638);
        try {
            System.out.println("available:" + this.method189());
        } catch (IOException var2) {
        }
    }
}
