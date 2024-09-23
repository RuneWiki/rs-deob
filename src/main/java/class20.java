import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HHMTQDYM")
public class class20 implements Runnable {

    @OriginalMember(owner = "HHMTQDYM", name = "a", descriptor = "I")
    private int field821 = 559;

    @OriginalMember(owner = "HHMTQDYM", name = "b", descriptor = "I")
    private int field822 = 262;

    @OriginalMember(owner = "HHMTQDYM", name = "c", descriptor = "I")
    private int field823 = -230;

    @OriginalMember(owner = "HHMTQDYM", name = "d", descriptor = "Z")
    private boolean field824 = true;

    @OriginalMember(owner = "HHMTQDYM", name = "h", descriptor = "Z")
    private boolean field828 = false;

    @OriginalMember(owner = "HHMTQDYM", name = "m", descriptor = "Z")
    private boolean field833 = false;

    @OriginalMember(owner = "HHMTQDYM", name = "n", descriptor = "Z")
    private boolean field834 = false;

    @OriginalMember(owner = "HHMTQDYM", name = "i", descriptor = "LOFXQYNOM;")
    public class39 field829;

    @OriginalMember(owner = "HHMTQDYM", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field827;

    @OriginalMember(owner = "HHMTQDYM", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field825;

    @OriginalMember(owner = "HHMTQDYM", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field826;

    @OriginalMember(owner = "HHMTQDYM", name = "k", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "HHMTQDYM", name = "l", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "HHMTQDYM", name = "j", descriptor = "[B")
    private byte[] field830;

    @OriginalMember(owner = "HHMTQDYM", name = "<init>", descriptor = "(LOFXQYNOM;Ljava/net/Socket;I)V")
    public class20(class39 arg0, Socket arg1, int arg2) throws IOException {
        this.field829 = arg0;
        this.field827 = arg1;
        this.field827.setSoTimeout(30000);
        this.field827.setTcpNoDelay(true);
        if (arg2 != 5029) {
            this.field824 = !this.field824;
        }
        this.field825 = this.field827.getInputStream();
        this.field826 = this.field827.getOutputStream();
    }

    @OriginalMember(owner = "HHMTQDYM", name = "a", descriptor = "()V")
    public void method277() {
        this.field828 = true;
        try {
            if (this.field825 != null) {
                this.field825.close();
            }
            if (this.field826 != null) {
                this.field826.close();
            }
            if (this.field827 != null) {
                this.field827.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field833 = false;
        synchronized (this) {
            this.notify();
        }
        this.field830 = null;
    }

    @OriginalMember(owner = "HHMTQDYM", name = "b", descriptor = "()I")
    public int method278() throws IOException {
        return this.field828 ? 0 : this.field825.read();
    }

    @OriginalMember(owner = "HHMTQDYM", name = "c", descriptor = "()I")
    public int method279() throws IOException {
        return this.field828 ? 0 : this.field825.available();
    }

    @OriginalMember(owner = "HHMTQDYM", name = "a", descriptor = "([BII)V")
    public void method280(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field828) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field825.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "HHMTQDYM", name = "a", descriptor = "(I[BII)V")
    public void method281(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 >= 0) {
            this.field821 = 142;
        }
        if (this.field828) {
            return;
        }
        if (this.field834) {
            this.field834 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field830 == null) {
            this.field830 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field830[this.field832] = arg1[arg0 + var6];
                this.field832 = (this.field832 + 1) % 5000;
                if ((this.field831 + 4900) % 5000 == this.field832) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field833) {
                this.field833 = true;
                this.field829.method164(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "HHMTQDYM", name = "run", descriptor = "()V")
    public void run() {
        while (this.field833) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field832 == this.field831) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field833) {
                    return;
                }
                var2 = this.field831;
                if (this.field832 >= this.field831) {
                    var3 = this.field832 - this.field831;
                } else {
                    var3 = 5000 - this.field831;
                }
            }
            if (var3 > 0) {
                try {
                    this.field826.write(this.field830, var2, var3);
                } catch (IOException var7) {
                    this.field834 = true;
                }
                this.field831 = (this.field831 + var3) % 5000;
                try {
                    if (this.field832 == this.field831) {
                        this.field826.flush();
                    }
                } catch (IOException var6) {
                    this.field834 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "HHMTQDYM", name = "a", descriptor = "(Z)V")
    public void method282(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        System.out.println("dummy:" + this.field828);
        System.out.println("tcycl:" + this.field831);
        System.out.println("tnum:" + this.field832);
        System.out.println("writer:" + this.field833);
        System.out.println("ioerror:" + this.field834);
        try {
            System.out.println("available:" + this.method279());
        } catch (IOException var3) {
        }
    }
}
