import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class387 implements Runnable {

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "Lvu;")
    private class680 field5567 = new class680();

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public int field5573 = 0;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "Z")
    private boolean field5572 = false;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field5574;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "[I")
    public static int[] field5563 = new int[32];

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field5569 = 0;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
    public static final void method2429(byte arg0) {
        class524.field7279 = new class67(8);
        field5570++;
        class119.field1572 = 0;
        if (arg0 == 100) {
            for (class689 var1 = (class689) client.field6236.method1638(false); var1 != null; var1 = (class689) client.field6236.method1645(arg0 ^ 0x64)) {
                var1.method3881();
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILkv;)Ldd;")
    public final class147 method2430(int arg0, int arg1, class684 arg2) {
        field5564++;
        class147 var4 = new class147();
        if (arg0 != -21242) {
            return null;
        }
        var4.field9192 = false;
        var4.field2051 = 3;
        var4.field40 = arg1;
        var4.field2056 = arg2;
        this.method2434(var4, arg0 + 6766);
        return var4;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILuv;IBLej;Laa;ILjava/lang/String;Lda;II)V")
    public static final void method2431(int arg0, int arg1, class755 arg2, int arg3, byte arg4, class179 arg5, class573 arg6, int arg7, String arg8, class402 arg9, int arg10, int arg11) {
        field5562++;
        int var12;
        if (class720.field10023 == 4) {
            var12 = (int) class596.field8093 & 0x3FFF;
        } else {
            var12 = (int) class596.field8093 + class439.field6126 & 0x3FFF;
        }
        int var13 = Math.max(arg2.field10393 / 2, arg2.field10501 / 2) + 10;
        int var14 = arg1 * arg1 + arg7 * arg7;
        if (arg4 != -74) {
            field5563 = null;
        }
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class24.field312[var12];
        int var16 = class24.field308[var12];
        if (class720.field10023 != 4) {
            var15 = var15 * 256 / (class31.field372 + 256);
            var16 = var16 * 256 / (class31.field372 + 256);
        }
        int var17 = arg1 * var15 + (arg7 * var16) >> 14;
        int var18 = arg1 * var16 - (arg7 * var15) >> 14;
        int var19 = arg5.method1134(null, arg8, 1839, 100);
        int var20 = var17 - var19 / 2;
        int var21 = arg5.method1132(100, 0, arg8, 6379, null);
        if (-arg2.field10393 <= var20 && arg2.field10393 >= var20 && -arg2.field10501 <= var18 && arg2.field10501 >= var18) {
            arg9.method2503(0, 1, 0, arg0, null, 50, arg6, arg2.field10393 / 2 + arg10 + var20, arg8, 0, arg10, var19, null, 0, arg2.field10501 / 2 + (arg11 - var18 - (arg3 + var21)), arg11);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
    public static void method2432(int arg0) {
        if (arg0 == -30363) {
            field5563 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILkv;B)Ldd;")
    public final class147 method2433(int arg0, class684 arg1, byte arg2) {
        field5566++;
        if (arg2 != 68) {
            this.field5572 = true;
        }
        class147 var4 = new class147();
        var4.field2051 = 1;
        class680 var5 = this.field5567;
        synchronized (this.field5567) {
            class147 var6 = (class147) this.field5567.method3828(116);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field40 && var6.field2056 == arg1 && var6.field2051 == 2) {
                    var4.field2052 = var6.field2052;
                    var4.field9191 = false;
                    return var4;
                }
                var6 = (class147) this.field5567.method3829(-29202);
            }
        }
        var4.field2052 = arg1.method3853((byte) -93, arg0);
        var4.field9191 = false;
        var4.field9192 = true;
        return var4;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Ldd;I)V")
    private final void method2434(class147 arg0, int arg1) {
        field5571++;
        class680 var3 = this.field5567;
        synchronized (this.field5567) {
            if (arg1 != -14476) {
                this.method2435(null, null, -11, 59);
            }
            this.field5567.method3827(arg1 + 14585, arg0);
            this.field5573++;
            this.field5567.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qw", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field5572) {
            class680 var1 = this.field5567;
            class147 var2;
            synchronized (this.field5567) {
                var2 = (class147) this.field5567.method3834((byte) 110);
                if (var2 == null) {
                    try {
                        this.field5567.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5573--;
            }
            try {
                if (var2.field2051 == 2) {
                    var2.field2056.method3854(-26893, (int) var2.field40, var2.field2052.length, var2.field2052);
                } else if (var2.field2051 == 3) {
                    var2.field2052 = var2.field2056.method3853((byte) -119, (int) var2.field40);
                }
            } catch (Exception var6) {
                class31.method172(var6, null, 0);
            }
            var2.field9191 = false;
        }
        field5565++;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([BLkv;II)Ldd;")
    public final class147 method2435(byte[] arg0, class684 arg1, int arg2, int arg3) {
        field5568++;
        class147 var5 = new class147();
        var5.field2052 = arg0;
        int var6 = 19 % ((arg3 - 23) / 41);
        var5.field40 = arg2;
        var5.field2051 = 2;
        var5.field2056 = arg1;
        var5.field9192 = false;
        this.method2434(var5, -14476);
        return var5;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V")
    public final void method2436(int arg0) {
        field5561++;
        this.field5572 = true;
        class680 var2 = this.field5567;
        synchronized (this.field5567) {
            this.field5567.notifyAll();
        }
        try {
            this.field5574.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 == 0) {
            this.field5574 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lrp;)V")
    public class387(class135 arg0) {
        class246 var2 = arg0.method872(5, (byte) -122, this);
        while (var2.field3633 == 0) {
            class688.method3874(10L, -7375);
        }
        if (var2.field3633 == 2) {
            throw new RuntimeException();
        }
        this.field5574 = (Thread) var2.field3638;
    }
}
