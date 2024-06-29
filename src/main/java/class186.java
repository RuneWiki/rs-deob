import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class186 extends class407 implements class56 {

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "Lrg;")
    public class381 field2551;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Z")
    private boolean field2533;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "Lm;")
    public static class242 field2547 = new class242();

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(ILtj;)V")
    public final void method108(int arg0, class298 arg1) {
        this.field2551.method2478(-18021, arg1);
        ++field2552;
        if (arg0 >= -8) {
            this.method111(-88, (class298) null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
    public final int method122(byte arg0) {
        if (arg0 > -103) {
            return -111;
        } else {
            ++field2548;
            return this.field2551.field5589;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ltj;I)Lri;")
    public final class372 method118(class298 arg0, int arg1) {
        ++field2553;
        class257 var3 = this.field2551.method2477(false, arg0, super.field5921, true, super.field5930, arg1 + -18716, 1024);
        if (var3 == null) {
            return null;
        } else if (arg1 != 18630) {
            return null;
        } else {
            class118 var4 = arg0.method519();
            var4.method274(super.field5921, super.field5932, super.field5930);
            class372 var5 = null;
            if (this.field2533) {
                var5 = class384.method2492(1, (byte) 96);
            }
            if (this.field2551.field5588 != null) {
                class305 var6 = this.field2551.field5588.method2597();
                arg0.method453(var3, var6, var4, var5 == null ? null : var5.field5481[0], 0);
            } else {
                var3.method1661(var4, var5 == null ? null : var5.field5481[0], 0);
            }
            this.field2551.method2484(super.field5917, true, arg0, var3, super.field5920, super.field5918, 5915, super.field5924);
            return var5;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public final void method124(int arg0) {
        ++field2535;
        if (arg0 <= 26) {
            this.method126((byte) -69, (class298) null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLtj;)V")
    public final void method126(byte arg0, class298 arg1) {
        ++field2543;
        class257 var3 = this.field2551.method2477(true, arg1, super.field5921, true, super.field5930, -35, 131072);
        if (var3 != null) {
            this.field2551.method2484(super.field5917, false, arg1, var3, super.field5920, super.field5918, 5915, super.field5924);
        }
        if (arg0 != 50) {
            field2539 = -123;
        }
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)I")
    public final int method345(int arg0) {
        ++field2529;
        return arg0 < 14 ? -92 : this.field2551.method2479(true);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        if (arg0 >= -112) {
            return true;
        } else {
            ++field2546;
            return this.field2551.method2482(true);
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I")
    public final int method116(int arg0) {
        ++field2555;
        return arg0 != 24186 ? -98 : this.field2551.field5562;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILtj;)V")
    public final void method111(int arg0, class298 arg1) {
        if (arg0 >= -68) {
            field2547 = null;
        }
        ++field2537;
        this.field2551.method2485(arg1, 125);
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 != 2) {
            method1244((class185) null, 125);
        }
        ++field2536;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field2530;
        if (arg0 < 119) {
            field2547 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V")
    public static void method1238(int arg0) {
        int var1 = 68 % ((-60 - arg0) / 53);
        field2547 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILtj;II)Z")
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field2540;
        class257 var5 = this.field2551.method2477(false, arg1, super.field5921, false, super.field5930, 107, 65536);
        if (arg3 != 0) {
            field2554 = -114;
        }
        if (var5 == null) {
            return false;
        } else {
            class118 var6 = arg1.method519();
            var6.method274(super.field5921, super.field5932, super.field5930);
            return var5.method1698(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
    public static final boolean method1239(int arg0, int arg1, int arg2) {
        ++field2545;
        if (arg1 != 256) {
            field2554 = -124;
        }
        return ~(2 & class406.field5912[1][arg2][arg0]) != -1;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ltj;Lqr;IIIIIIIZIIIII)V")
    public class186(class298 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field2901 == -2, class136.method962(arg2, arg3, 81));
        this.field2551 = new class381(arg0, arg1, arg2, arg3, super.field5922, arg5, arg6, arg8, arg9, arg14);
        this.field2533 = arg1.field2932 != 0;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(B)V")
    public static final void method1240(byte arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class403.field5875[var1] = false;
        }
        ++field2531;
        class397.field5797 = class47.field716;
        class394.field5734 = class289.field4331;
        class85.field1173 = class326.field4829;
        class432.field6283 = 0;
        class212.field2884 = 5;
        class362.field5354 = class279.field4099;
        class17.field280 = -1;
        class90.field1228 = class231.field3179;
        class124.field1614 = 0;
        if (arg0 != 88) {
            field2547 = null;
        }
        class112.field1441 = -1;
        class48.field721 = class7.field88;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIB)Ljr;")
    public static final class440 method1241(int arg0, int arg1, byte arg2) {
        ++field2550;
        if (arg2 != 56) {
            method1243(-50, -57, 91, 76, (class248) null, 90, 69, (class421) null, 82);
        }
        class440 var3 = (class440) class31.field507.method2826(false, (long) arg0 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class440(arg1, arg0);
            class31.field507.method2815(-1, var3.field6091, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        if (arg0 != 28024) {
            this.field2551 = null;
        }
        ++field2532;
        return this.field2551.field5582;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(B)V")
    public static final void method1242(byte arg0) {
        if (arg0 > -52) {
            method1241(-52, 46, (byte) -18);
        }
        ++field2541;
        class229.field3152.method372(116);
        class136.field1768.method372(127);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIILsj;IILsf;I)V")
    public static final void method1243(int arg0, int arg1, int arg2, int arg3, class248 arg4, int arg5, int arg6, class421 arg7, int arg8) {
        ++field2549;
        int var9 = arg0 * arg0 + arg8 * arg8;
        if (arg2 >= var9) {
            if (arg3 < 96) {
                method1244((class185) null, -107);
            }
            int var10 = Math.min(arg4.field3531 / 2, arg4.field3564 / 2);
            if (var10 * var10 < var9) {
                var10 -= 10;
                int var11;
                if (~class212.field2884 == -5) {
                    var11 = 16383 & (int) class247.field3479;
                } else {
                    var11 = 16383 & (int) class247.field3479 + class93.field1268;
                }
                int var12 = class240.field3364[var11];
                int var13 = class240.field3365[var11];
                if (~class212.field2884 != -5) {
                    var13 = var13 * 256 / (class30.field484 + 256);
                    var12 = var12 * 256 / (class30.field484 + 256);
                }
                int var14 = arg0 * var13 + arg8 * var12 >> 15;
                int var15 = arg8 * var13 - arg0 * var12 >> 15;
                double var16 = Math.atan2((double) var14, (double) var15);
                int var18 = (int) (Math.sin(var16) * (double) var10);
                int var19 = (int) (Math.cos(var16) * (double) var10);
                class145.field1856[arg1].method2067((float) arg4.field3531 / 2.0F + (float) arg6 + (float) var18, (float) arg4.field3564 / 2.0F + (float) arg5 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
            } else {
                client.method393(arg4, arg5, arg6, class276.field4053[arg1], arg8, arg0, 2, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lir;I)V")
    public static final void method1244(class185 arg0, int arg1) {
        class40.field613 = arg0;
        if (arg1 != 256) {
            field2539 = -67;
        }
        ++field2556;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILtj;BIZLkm;I)V")
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        int var8 = 69 % ((arg2 - 46) / 45);
        ++field2542;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ltj;IB)Lqb;")
    public final class257 method117(class298 arg0, int arg1, byte arg2) {
        ++field2534;
        return arg2 < 42 ? null : this.field2551.method2477(false, arg0, 0, false, 0, -60, arg1);
    }
}
