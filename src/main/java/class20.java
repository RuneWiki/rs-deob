import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FKSZIRZG")
public class class20 implements Runnable {

    @OriginalMember(owner = "FKSZIRZG", name = "a", descriptor = "I")
    private int field795 = 44659;

    @OriginalMember(owner = "FKSZIRZG", name = "b", descriptor = "Z")
    private boolean field796 = false;

    @OriginalMember(owner = "FKSZIRZG", name = "c", descriptor = "I")
    private int field797 = -35541;

    @OriginalMember(owner = "FKSZIRZG", name = "g", descriptor = "Z")
    private boolean field801 = false;

    @OriginalMember(owner = "FKSZIRZG", name = "l", descriptor = "Z")
    private boolean field806 = false;

    @OriginalMember(owner = "FKSZIRZG", name = "m", descriptor = "Z")
    private boolean field807 = false;

    @OriginalMember(owner = "FKSZIRZG", name = "h", descriptor = "LPXJVLLTT;")
    public class47 field802;

    @OriginalMember(owner = "FKSZIRZG", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field800;

    @OriginalMember(owner = "FKSZIRZG", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field798;

    @OriginalMember(owner = "FKSZIRZG", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field799;

    @OriginalMember(owner = "FKSZIRZG", name = "j", descriptor = "I")
    private int field804;

    @OriginalMember(owner = "FKSZIRZG", name = "k", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "FKSZIRZG", name = "i", descriptor = "[B")
    private byte[] field803;

    @OriginalMember(owner = "FKSZIRZG", name = "<init>", descriptor = "(BLjava/net/Socket;LPXJVLLTT;)V")
    public class20(byte arg0, Socket arg1, class47 arg2) throws IOException {
        this.field802 = arg2;
        this.field800 = arg1;
        if (arg0 != 1) {
            this.field797 = -491;
        }
        this.field800.setSoTimeout(30000);
        this.field800.setTcpNoDelay(true);
        this.field798 = this.field800.getInputStream();
        this.field799 = this.field800.getOutputStream();
    }

    @OriginalMember(owner = "FKSZIRZG", name = "a", descriptor = "()V")
    public void method225() {
        this.field801 = true;
        try {
            if (this.field798 != null) {
                this.field798.close();
            }
            if (this.field799 != null) {
                this.field799.close();
            }
            if (this.field800 != null) {
                this.field800.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field806 = false;
        synchronized (this) {
            this.notify();
        }
        this.field803 = null;
    }

    @OriginalMember(owner = "FKSZIRZG", name = "b", descriptor = "()I")
    public int method226() throws IOException {
        return this.field801 ? 0 : this.field798.read();
    }

    @OriginalMember(owner = "FKSZIRZG", name = "c", descriptor = "()I")
    public int method227() throws IOException {
        return this.field801 ? 0 : this.field798.available();
    }

    @OriginalMember(owner = "FKSZIRZG", name = "a", descriptor = "([BII)V")
    public void method228(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field801) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field798.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "FKSZIRZG", name = "a", descriptor = "(I[BII)V")
    public void method229(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = 83 / arg3;
        if (this.field801) {
            return;
        }
        if (this.field807) {
            this.field807 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field803 == null) {
            this.field803 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field803[this.field805] = arg1[arg0 + var7];
                this.field805 = (this.field805 + 1) % 5000;
                if ((this.field804 + 4900) % 5000 == this.field805) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field806) {
                this.field806 = true;
                this.field802.method135(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "FKSZIRZG", name = "run", descriptor = "()V")
    public void run() {
        while (this.field806) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field805 == this.field804) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field806) {
                    return;
                }
                var2 = this.field804;
                if (this.field805 >= this.field804) {
                    var3 = this.field805 - this.field804;
                } else {
                    var3 = 5000 - this.field804;
                }
            }
            if (var3 > 0) {
                try {
                    this.field799.write(this.field803, var2, var3);
                } catch (IOException var7) {
                    this.field807 = true;
                }
                this.field804 = (this.field804 + var3) % 5000;
                try {
                    if (this.field805 == this.field804) {
                        this.field799.flush();
                    }
                } catch (IOException var6) {
                    this.field807 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "FKSZIRZG", name = "a", descriptor = "(I)V")
    public void method230(int arg0) {
        System.out.println("dummy:" + this.field801);
        System.out.println("tcycl:" + this.field804);
        System.out.println("tnum:" + this.field805);
        System.out.println("writer:" + this.field806);
        System.out.println("ioerror:" + this.field807);
        if (arg0 != 7) {
            this.field795 = -150;
        }
        try {
            System.out.println("available:" + this.method227());
        } catch (IOException var2) {
        }
    }
}
