import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class393 implements Runnable {

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "Z")
    private boolean field5817 = false;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    private int field5813 = 0;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    private int field5820 = 0;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "Z")
    private boolean field5829 = false;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field5821;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "Lft;")
    private class4 field5822;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field5831;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5819;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "F")
    public static float field5823;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "F")
    public static float field5832;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "Lud;")
    public static class33 field5824;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "Lpga;")
    private class494 field5830;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "[B")
    private byte[] field5826;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I[BII)V", line = 8)
    public final void method2418(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5814++;
        if (this.field5829) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field5831.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
        if (arg0 != 0) {
            field5832 = 0.36503777F;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "([BIII)V", line = 33)
    public final void method2419(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5828++;
        if (this.field5829) {
            return;
        }
        if (this.field5817) {
            this.field5817 = false;
            throw new IOException();
        }
        if (this.field5826 == null) {
            this.field5826 = new byte[5000];
        }
        synchronized (this) {
            int var6 = -15 % ((-arg1 - 49) / 57);
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field5826[this.field5820] = arg0[arg3 + var7];
                this.field5820 = (this.field5820 + 1) % 5000;
                if (((this.field5813 + 4900) % 5000) == this.field5820) {
                    throw new IOException();
                }
            }
            if (this.field5830 == null) {
                this.field5830 = this.field5822.method22(this, 3, (byte) -126);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V", line = 85)
    public final void method2420(boolean arg0) throws IOException {
        field5812++;
        if (arg0) {
            this.field5831 = null;
        }
        if (!this.field5829 && this.field5817) {
            this.field5817 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!mea", name = "finalize", descriptor = "()V", line = 107)
    protected final void finalize() {
        field5816++;
        this.method2426(-2);
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/net/Socket;Lft;)V", line = 316)
    public class393(Socket arg0, class4 arg1) throws IOException {
        this.field5821 = arg0;
        this.field5822 = arg1;
        this.field5821.setSoTimeout(30000);
        this.field5821.setTcpNoDelay(true);
        this.field5831 = this.field5821.getInputStream();
        this.field5819 = this.field5821.getOutputStream();
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V", line = 120)
    public static void method2421(int arg0) {
        int var1 = -19 % ((arg0 - 15) / 48);
        field5824 = null;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V", line = 142)
    public final void method2422(int arg0) {
        field5818++;
        if (this.field5829) {
            return;
        }
        this.field5831 = new class47();
        if (arg0 >= -38) {
            this.field5821 = null;
        }
        this.field5819 = new class361();
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)I", line = 158)
    public final int method2423(int arg0) throws IOException {
        if (arg0 < 4) {
            this.field5819 = null;
        }
        field5833++;
        return this.field5829 ? 0 : this.field5831.read();
    }

    @OriginalMember(owner = "client!mea", name = "run", descriptor = "()V", line = 178)
    public final void run() {
        field5811++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field5820 == this.field5813) {
                        if (this.field5829) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field5820 >= this.field5813) {
                        var2 = this.field5820 - this.field5813;
                    } else {
                        var2 = 5000 - this.field5813;
                    }
                    var3 = this.field5813;
                }
                if (var2 > 0) {
                    try {
                        this.field5819.write(this.field5826, var3, var2);
                    } catch (IOException var9) {
                        this.field5817 = true;
                    }
                    this.field5813 = (this.field5813 + var2) % 5000;
                    try {
                        if (this.field5820 == this.field5813) {
                            this.field5819.flush();
                        }
                    } catch (IOException var8) {
                        this.field5817 = true;
                    }
                }
            }
            try {
                if (this.field5831 != null) {
                    this.field5831.close();
                }
                if (this.field5819 != null) {
                    this.field5819.close();
                }
                if (this.field5821 != null) {
                    this.field5821.close();
                }
            } catch (IOException var7) {
            }
            this.field5826 = null;
        } catch (Exception var12) {
            class699.method3896(69, var12, null);
        }
    }

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "(I)V", line = 251)
    public static final void method2424(int arg0) {
        field5825++;
        if (arg0 >= 77) {
            class394.field5849 = new class46();
        }
    }

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "(I)I", line = 262)
    public final int method2425(int arg0) throws IOException {
        if (arg0 >= -92) {
            this.field5817 = true;
        }
        field5827++;
        return this.field5829 ? 0 : this.field5831.available();
    }

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "(I)V", line = 278)
    public final void method2426(int arg0) {
        field5815++;
        if (this.field5829) {
            return;
        }
        if (arg0 != -2) {
            this.field5821 = null;
        }
        synchronized (this) {
            this.field5829 = true;
            this.notifyAll();
        }
        if (this.field5830 != null) {
            while (this.field5830.field7024 == 0) {
                class561.method3202(1L, (byte) -28);
            }
            if (this.field5830.field7024 == 1) {
                try {
                    ((Thread) this.field5830.field7019).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5830 = null;
    }
}
