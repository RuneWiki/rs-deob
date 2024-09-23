import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HUWYSFFT")
public class class23 implements Runnable {

    @OriginalMember(owner = "HUWYSFFT", name = "a", descriptor = "Z")
    private boolean field801 = false;

    @OriginalMember(owner = "HUWYSFFT", name = "e", descriptor = "Z")
    private boolean field805 = false;

    @OriginalMember(owner = "HUWYSFFT", name = "j", descriptor = "Z")
    private boolean field810 = false;

    @OriginalMember(owner = "HUWYSFFT", name = "k", descriptor = "Z")
    private boolean field811 = false;

    @OriginalMember(owner = "HUWYSFFT", name = "f", descriptor = "LVZUGTFOW;")
    public class59 field806;

    @OriginalMember(owner = "HUWYSFFT", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field804;

    @OriginalMember(owner = "HUWYSFFT", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field802;

    @OriginalMember(owner = "HUWYSFFT", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field803;

    @OriginalMember(owner = "HUWYSFFT", name = "h", descriptor = "I")
    private int field808;

    @OriginalMember(owner = "HUWYSFFT", name = "i", descriptor = "I")
    private int field809;

    @OriginalMember(owner = "HUWYSFFT", name = "g", descriptor = "[B")
    private byte[] field807;

    @OriginalMember(owner = "HUWYSFFT", name = "<init>", descriptor = "(ZLjava/net/Socket;LVZUGTFOW;)V")
    public class23(boolean arg0, Socket arg1, class59 arg2) throws IOException {
        this.field806 = arg2;
        this.field804 = arg1;
        if (!arg0) {
            this.field801 = !this.field801;
        }
        this.field804.setSoTimeout(30000);
        this.field804.setTcpNoDelay(true);
        this.field802 = this.field804.getInputStream();
        this.field803 = this.field804.getOutputStream();
    }

    @OriginalMember(owner = "HUWYSFFT", name = "a", descriptor = "()V")
    public void method220() {
        this.field805 = true;
        try {
            if (this.field802 != null) {
                this.field802.close();
            }
            if (this.field803 != null) {
                this.field803.close();
            }
            if (this.field804 != null) {
                this.field804.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field810 = false;
        synchronized (this) {
            this.notify();
        }
        this.field807 = null;
    }

    @OriginalMember(owner = "HUWYSFFT", name = "b", descriptor = "()I")
    public int method221() throws IOException {
        return this.field805 ? 0 : this.field802.read();
    }

    @OriginalMember(owner = "HUWYSFFT", name = "c", descriptor = "()I")
    public int method222() throws IOException {
        return this.field805 ? 0 : this.field802.available();
    }

    @OriginalMember(owner = "HUWYSFFT", name = "a", descriptor = "([BII)V")
    public void method223(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field805) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field802.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "HUWYSFFT", name = "a", descriptor = "(IB[BI)V")
    public void method224(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 83) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field805) {
            return;
        }
        if (this.field811) {
            this.field811 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field807 == null) {
            this.field807 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg3; var7++) {
                this.field807[this.field809] = arg2[arg0 + var7];
                this.field809 = (this.field809 + 1) % 5000;
                if ((this.field808 + 4900) % 5000 == this.field809) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field810) {
                this.field810 = true;
                this.field806.method36(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "HUWYSFFT", name = "run", descriptor = "()V")
    public void run() {
        while (this.field810) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field809 == this.field808) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field810) {
                    return;
                }
                var2 = this.field808;
                if (this.field809 >= this.field808) {
                    var3 = this.field809 - this.field808;
                } else {
                    var3 = 5000 - this.field808;
                }
            }
            if (var3 > 0) {
                try {
                    this.field803.write(this.field807, var2, var3);
                } catch (IOException var7) {
                    this.field811 = true;
                }
                this.field808 = (this.field808 + var3) % 5000;
                try {
                    if (this.field809 == this.field808) {
                        this.field803.flush();
                    }
                } catch (IOException var6) {
                    this.field811 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "HUWYSFFT", name = "a", descriptor = "(Z)V")
    public void method225(boolean arg0) {
        System.out.println("dummy:" + this.field805);
        System.out.println("tcycl:" + this.field808);
        System.out.println("tnum:" + this.field809);
        System.out.println("writer:" + this.field810);
        if (!arg0) {
            this.field801 = !this.field801;
        }
        System.out.println("ioerror:" + this.field811);
        try {
            System.out.println("available:" + this.method222());
        } catch (IOException var2) {
        }
    }
}
