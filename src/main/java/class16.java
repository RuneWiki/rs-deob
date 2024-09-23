import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FLUCRVAS")
public class class16 implements Runnable {

    @OriginalMember(owner = "FLUCRVAS", name = "a", descriptor = "I")
    private int field681 = 3;

    @OriginalMember(owner = "FLUCRVAS", name = "b", descriptor = "Z")
    private boolean field682 = false;

    @OriginalMember(owner = "FLUCRVAS", name = "f", descriptor = "Z")
    private boolean field686 = false;

    @OriginalMember(owner = "FLUCRVAS", name = "k", descriptor = "Z")
    private boolean field691 = false;

    @OriginalMember(owner = "FLUCRVAS", name = "l", descriptor = "Z")
    private boolean field692 = false;

    @OriginalMember(owner = "FLUCRVAS", name = "g", descriptor = "LDKKOWNCZ;")
    public class7 field687;

    @OriginalMember(owner = "FLUCRVAS", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field685;

    @OriginalMember(owner = "FLUCRVAS", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field683;

    @OriginalMember(owner = "FLUCRVAS", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field684;

    @OriginalMember(owner = "FLUCRVAS", name = "i", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "FLUCRVAS", name = "j", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "FLUCRVAS", name = "h", descriptor = "[B")
    private byte[] field688;

    @OriginalMember(owner = "FLUCRVAS", name = "<init>", descriptor = "(LDKKOWNCZ;Ljava/net/Socket;B)V")
    public class16(class7 arg0, Socket arg1, byte arg2) throws IOException {
        this.field687 = arg0;
        this.field685 = arg1;
        this.field685.setSoTimeout(30000);
        if (arg2 != 56) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field685.setTcpNoDelay(true);
        this.field683 = this.field685.getInputStream();
        this.field684 = this.field685.getOutputStream();
    }

    @OriginalMember(owner = "FLUCRVAS", name = "a", descriptor = "()V")
    public void method210() {
        this.field686 = true;
        try {
            if (this.field683 != null) {
                this.field683.close();
            }
            if (this.field684 != null) {
                this.field684.close();
            }
            if (this.field685 != null) {
                this.field685.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field691 = false;
        synchronized (this) {
            this.notify();
        }
        this.field688 = null;
    }

    @OriginalMember(owner = "FLUCRVAS", name = "b", descriptor = "()I")
    public int method211() throws IOException {
        return this.field686 ? 0 : this.field683.read();
    }

    @OriginalMember(owner = "FLUCRVAS", name = "c", descriptor = "()I")
    public int method212() throws IOException {
        return this.field686 ? 0 : this.field683.available();
    }

    @OriginalMember(owner = "FLUCRVAS", name = "a", descriptor = "([BII)V")
    public void method213(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field686) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field683.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "FLUCRVAS", name = "a", descriptor = "(II[BZ)V")
    public void method214(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        if (arg3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field686) {
            return;
        }
        if (this.field692) {
            this.field692 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field688 == null) {
            this.field688 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg1; var7++) {
                this.field688[this.field690] = arg2[arg0 + var7];
                this.field690 = (this.field690 + 1) % 5000;
                if ((this.field689 + 4900) % 5000 == this.field690) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field691) {
                this.field691 = true;
                this.field687.method101(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "FLUCRVAS", name = "run", descriptor = "()V")
    public void run() {
        while (this.field691) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field690 == this.field689) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field691) {
                    return;
                }
                var2 = this.field689;
                if (this.field690 >= this.field689) {
                    var3 = this.field690 - this.field689;
                } else {
                    var3 = 5000 - this.field689;
                }
            }
            if (var3 > 0) {
                try {
                    this.field684.write(this.field688, var2, var3);
                } catch (IOException var7) {
                    this.field692 = true;
                }
                this.field689 = (this.field689 + var3) % 5000;
                try {
                    if (this.field690 == this.field689) {
                        this.field684.flush();
                    }
                } catch (IOException var6) {
                    this.field692 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "FLUCRVAS", name = "a", descriptor = "(I)V")
    public void method215(int arg0) {
        System.out.println("dummy:" + this.field686);
        System.out.println("tcycl:" + this.field689);
        System.out.println("tnum:" + this.field690);
        System.out.println("writer:" + this.field691);
        System.out.println("ioerror:" + this.field692);
        if (arg0 != 0) {
            this.field682 = !this.field682;
        }
        try {
            System.out.println("available:" + this.method212());
        } catch (IOException var2) {
        }
    }
}
