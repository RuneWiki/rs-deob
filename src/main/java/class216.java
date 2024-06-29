import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class216 implements Runnable {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    private int field3834 = 0;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Z")
    private boolean field3841 = false;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    private int field3842 = 0;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "Z")
    private boolean field3857 = false;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Ljava/net/Socket;")
    private Socket field3856;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Lla;")
    private class139 field3850;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field3854;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3845;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "Lsf;")
    public static class108 field3853 = class140.method973(255, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[I")
    public static int[] field3848 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lsf;")
    private static class108 field3858 = class140.method973(255, " has logged out)3");

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lsf;")
    public static class108 field3844 = field3858;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lpg;")
    private class205 field3849;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lr;")
    public static class274 field3833;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "[B")
    private byte[] field3843;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[[[B")
    public static byte[][][] field3840;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ[B)V", line = 5)
    public final void method1478(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        if (arg2) {
            return;
        }
        field3847++;
        if (this.field3857) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field3854.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 36)
    public final void method1479(byte arg0) throws IOException {
        field3837++;
        if (this.field3857) {
            return;
        }
        if (arg0 != -11) {
            this.field3854 = (InputStream) null;
        }
        if (this.field3841) {
            this.field3841 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)Z", line = 59)
    public static final boolean method1480(int arg0, int arg1, int arg2, int arg3) {
        if (class84.method576(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class176.method1246(var4 + 1, class278.field4883[arg0][arg1][arg2] + arg3, var5 + 1) && class176.method1246(var4 + 128 - 1, class278.field4883[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class176.method1246(var4 + 128 - 1, class278.field4883[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class176.method1246(var4 + 1, class278.field4883[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 75)
    public static void method1481(int arg0) {
        field3833 = null;
        field3844 = null;
        field3840 = (byte[][][]) null;
        field3853 = null;
        if (arg0 > -33) {
            method1480(97, 55, -128, 124);
        }
        field3858 = null;
        field3848 = null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)I", line = 90)
    public final int method1482(byte arg0) throws IOException {
        field3852++;
        if (arg0 < 124) {
            field3844 = (class108) null;
        }
        return this.field3857 ? 0 : this.field3854.read();
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIZ[B)V", line = 105)
    public final void method1483(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        field3835++;
        if (this.field3857) {
            return;
        }
        if (this.field3841) {
            this.field3841 = false;
            throw new IOException();
        }
        if (this.field3843 == null) {
            this.field3843 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field3843[this.field3834] = arg3[arg1 + var6];
                this.field3834 = (this.field3834 + 1) % 5000;
                if (((this.field3842 + 4900) % 5000) == this.field3834) {
                    throw new IOException();
                }
            }
            if (arg2) {
                field3840 = (byte[][][]) ((byte[][][]) null);
            }
            if (this.field3849 == null) {
                this.field3849 = this.field3850.method954(this, 1, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/net/Socket;Lla;)V", line = 497)
    public class216(Socket arg0, class139 arg1) throws IOException {
        this.field3856 = arg0;
        this.field3850 = arg1;
        this.field3856.setSoTimeout(30000);
        this.field3856.setTcpNoDelay(true);
        this.field3854 = this.field3856.getInputStream();
        this.field3845 = this.field3856.getOutputStream();
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)Z", line = 162)
    public static final boolean method1484(int arg0, int arg1, int arg2, int arg3) {
        if (!class84.method576(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class278.field4883[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class1.field10) {
                    if (!class176.method1246(var4, var6, var5)) {
                        return false;
                    }
                    if (!class176.method1246(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class176.method1246(var4, var7, var5)) {
                        return false;
                    }
                    if (!class176.method1246(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class176.method1246(var4, var8, var5)) {
                    return false;
                }
                if (!class176.method1246(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class311.field5381) {
                    if (!class176.method1246(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class176.method1246(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class176.method1246(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class176.method1246(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class176.method1246(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class176.method1246(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class1.field10) {
                    if (!class176.method1246(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class176.method1246(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class176.method1246(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class176.method1246(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class176.method1246(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class176.method1246(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class311.field5381) {
                    if (!class176.method1246(var4, var6, var5)) {
                        return false;
                    }
                    if (!class176.method1246(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class176.method1246(var4, var7, var5)) {
                        return false;
                    }
                    if (!class176.method1246(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class176.method1246(var4, var8, var5)) {
                    return false;
                }
                if (!class176.method1246(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class176.method1246(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class176.method1246(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class176.method1246(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class176.method1246(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class176.method1246(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V", line = 346)
    protected final void finalize() {
        this.method1487(13881);
        field3836++;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 360)
    public final void method1485(int arg0) {
        if (arg0 != 27319) {
            this.field3857 = true;
        }
        field3851++;
        if (!this.field3857) {
            this.field3854 = new class109();
            this.field3845 = new class53();
        }
    }

    @OriginalMember(owner = "client!ii", name = "run", descriptor = "()V", line = 376)
    public final void run() {
        field3838++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field3842 == this.field3834) {
                        if (this.field3857) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field3842;
                    if (this.field3834 < this.field3842) {
                        var4 = 5000 - this.field3842;
                    } else {
                        var4 = this.field3834 - this.field3842;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field3845.write(this.field3843, var3, var4);
                    } catch (IOException var12) {
                        this.field3841 = true;
                    }
                    this.field3842 = (this.field3842 + var4) % 5000;
                    try {
                        if (this.field3842 == this.field3834) {
                            this.field3845.flush();
                        }
                    } catch (IOException var11) {
                        this.field3841 = true;
                    }
                }
            }
            try {
                if (this.field3854 != null) {
                    this.field3854.close();
                }
                if (this.field3845 != null) {
                    this.field3845.close();
                }
                if (this.field3856 != null) {
                    this.field3856.close();
                }
            } catch (IOException var10) {
            }
            this.field3843 = null;
        } catch (Exception var15) {
            class171.method1188(64, (String) null, var15);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)I", line = 465)
    public final int method1486(int arg0) throws IOException {
        field3859++;
        if (arg0 != 7) {
            this.field3841 = false;
        }
        return this.field3857 ? 0 : this.field3854.available();
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 511)
    public final void method1487(int arg0) {
        field3846++;
        if (this.field3857) {
            return;
        }
        synchronized (this) {
            this.field3857 = true;
            this.notifyAll();
            if (arg0 != 13881) {
                this.run();
            }
        }
        if (this.field3849 != null) {
            while (this.field3849.field3686 == 0) {
                class83.method556(1L, 123);
            }
            if (this.field3849.field3686 == 1) {
                try {
                    ((Thread) this.field3849.field3685).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3849 = null;
    }
}
