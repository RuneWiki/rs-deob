import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class520 {

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Z")
    public boolean field7283 = true;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public int field7282 = 512;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public int field7281 = -1;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    private int field7284 = 0;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "Z")
    public boolean field7299 = true;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Lpb;")
    public static class2 field7285 = new class2(10, 7);

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "[I")
    public static int[] field7296 = new int[32];

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "[I")
    public static int[] field7297 = new int[3];

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "[I")
    public static int[] field7292 = new int[8];

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public static int field7295 = 0;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public int field7286;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public int field7289;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public int field7293;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public int field7298;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "Ljava/lang/Object;")
    public static Object field7301;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lgk;I)V")
    public final void method2935(class540 arg0, int arg1) {
        field7287++;
        if (arg1 != -1) {
            this.method2935(null, 45);
        }
        while (true) {
            int var3 = arg0.method3115(29871);
            if (var3 == 0) {
                return;
            }
            this.method2939(var3, -120, arg0);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public static void method2936(byte arg0) {
        field7292 = null;
        field7301 = null;
        field7297 = null;
        if (arg0 < -25) {
            field7296 = null;
            field7285 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
    public static final void method2937(byte arg0) {
        field7300++;
        int var1 = -63 / ((-arg0 - 29) / 63);
        class656.field9370 = false;
        class12.method83((byte) -107);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7290++;
        class285 var10 = null;
        for (class285 var11 = (class285) class556.field8164.method1904(false); var11 != null; var11 = (class285) class556.field8164.method1901(96)) {
            if (var11.field3803 == arg7 && var11.field3808 == arg4 && var11.field3802 == arg3 && var11.field3807 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class285();
            var10.field3803 = arg7;
            var10.field3808 = arg4;
            var10.field3802 = arg3;
            var10.field3807 = arg2;
            if (arg4 >= 0 && arg3 >= 0 && arg4 < class72.field1144 && class668.field9444 > arg3) {
                class588.method3356(var10, 5);
            }
            class556.field8164.method1909(var10, (byte) -81);
        }
        var10.field3799 = arg6;
        var10.field3795 = arg9;
        var10.field3801 = arg5;
        int var12 = -118 / ((arg1 - 17) / 45);
        var10.field3805 = arg0;
        var10.field3797 = arg8;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILgk;)V")
    private final void method2939(int arg0, int arg1, class540 arg2) {
        if (arg0 == 1) {
            this.field7284 = arg2.method3154((byte) -115);
            this.method2940(this.field7284, -14070);
        } else if (arg0 == 2) {
            this.field7281 = arg2.method3169(26488);
            if (this.field7281 == 65535) {
                this.field7281 = -1;
            }
        } else if (arg0 == 3) {
            this.field7282 = arg2.method3169(26488) << 2;
        } else if (arg0 == 4) {
            this.field7299 = false;
        } else if (arg0 == 5) {
            this.field7283 = false;
        }
        field7294++;
        if (arg1 > -35) {
            this.field7293 = 69;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
    private final void method2940(int arg0, int arg1) {
        field7288++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (arg1 != -14070) {
            method2938(94, -127, -100, -3, -82, -49, -51, 21, -43, 40);
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field7293 = (int) (var15 * 256.0D);
        this.field7298 = (int) (var17 * 256.0D);
        if (var17 > 0.5D) {
            this.field7289 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7289 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7293 < 0) {
            this.field7293 = 0;
        } else if (this.field7293 > 255) {
            this.field7293 = 255;
        }
        if (this.field7298 < 0) {
            this.field7298 = 0;
        } else if (this.field7298 > 255) {
            this.field7298 = 255;
        }
        if (this.field7289 < 1) {
            this.field7289 = 1;
        }
        this.field7286 = (int) ((double) this.field7289 * var19);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZI)V")
    public static final void method2941(int arg0, boolean arg1, int arg2) {
        field7291++;
        class453 var3 = class20.field383[arg0][arg2];
        if (var3 != null) {
            class387.field5782 = var3.field6532;
            class202.field2760 = var3.field6529;
            class330.field4791 = var3.field6518;
        }
        if (arg1) {
            field7297 = null;
        }
        class211.method1339(-19150);
    }
}
