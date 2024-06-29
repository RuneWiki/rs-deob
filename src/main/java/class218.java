import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class218 extends class60 {

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static volatile int field3397 = 0;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "Lok;")
    public static class160 field3410 = new class160(128);

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public int field3403;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "Lpk;")
    public static class120 field3393;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "Lrk;")
    public class187 field3404;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "Lt;")
    public class269 field3412;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Ljh;")
    public class284 field3396;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lul;")
    public class49 field3390;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIF[[FLtd;IIII[[I[[IIIZI[[F[[FI)I", line = 5)
    public static final int method1575(int arg0, int arg1, float arg2, float[][] arg3, class256 arg4, int arg5, int arg6, int arg7, int arg8, int[][] arg9, int[][] arg10, int arg11, int arg12, boolean arg13, int arg14, float[][] arg15, float[][] arg16, int arg17) {
        field3386++;
        if (arg11 == 1) {
            int var18 = arg8;
            arg8 = arg7;
            arg7 = 128 - var18;
        } else if (arg11 == 2) {
            arg8 = 128 - arg8;
            arg7 = 128 - arg7;
        } else if (arg11 == 3) {
            int var19 = arg8;
            arg8 = 128 - arg7;
            arg7 = var19;
        }
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg8 == 0 && arg7 == 0) {
            var20 = arg17;
            var21 = arg15[arg14][arg5];
            var22 = arg16[arg14][arg5];
            var23 = arg3[arg14][arg5];
        } else if (arg8 == 128 && arg7 == 0) {
            var22 = arg16[arg14 + 1][arg5];
            var21 = arg15[arg14 + 1][arg5];
            var20 = arg6;
            var23 = arg3[arg14 + 1][arg5];
        } else if (arg8 == 128 && arg7 == 128) {
            var21 = arg15[arg14 + 1][arg5 + 1];
            var20 = arg0;
            var23 = arg3[arg14 + 1][arg5 + 1];
            var22 = arg16[arg14 + 1][arg5 + 1];
        } else if (arg8 == 0 && arg7 == 128) {
            var22 = arg16[arg14][arg5 + 1];
            var23 = arg3[arg14][arg5 + 1];
            var20 = arg1;
            var21 = arg15[arg14][arg5 + 1];
        } else {
            float var24 = arg15[arg14][arg5];
            float var25 = (float) arg8 / 128.0F;
            float var26 = arg3[arg14][arg5];
            float var27 = (arg15[arg14 + 1][arg5] - var24) * var25 + var24;
            float var28 = (arg3[arg14 + 1][arg5] - var26) * var25 + var26;
            float var29 = arg16[arg14][arg5];
            float var30 = (float) arg7 / 128.0F;
            float var31 = (arg16[arg14 + 1][arg5] - var29) * var25 + var29;
            float var32 = arg16[arg14][arg5 + 1];
            float var33 = (arg16[arg14 + 1][arg5 + 1] - var32) * var25 + var32;
            float var34 = arg3[arg14][arg5 + 1];
            float var35 = arg15[arg14][arg5 + 1];
            float var36 = (arg3[arg14 + 1][arg5 + 1] - var34) * var25 + var34;
            var22 = (var33 - var31) * var30 + var31;
            var23 = (var36 - var28) * var30 + var28;
            float var37 = (arg15[arg14 + 1][arg5 + 1] - var35) * var25 + var35;
            int var38 = class95.method775((byte) -126, arg6, arg17, arg8);
            var21 = (var37 - var27) * var30 + var27;
            int var39 = class95.method775((byte) 37, arg0, arg1, arg8);
            var20 = class95.method775((byte) -109, var39, var38, arg7);
        }
        int var40 = (arg14 << 7) + arg8;
        int var41 = (arg5 << 7) + arg7;
        int var42 = class220.method1605(arg12 ^ 0x2142, arg14, arg8, arg10, arg7, arg5);
        if (arg12 != -8515) {
            field3393 = (class120) null;
        }
        return arg4.method1773(var40, var42, var41, var22, var21, var23, arg13 ? var20 & 0xFFFFFF00 : var20, arg9 == null ? 0.0F : (float) (var42 - class220.method1605(-1, arg14, arg8, arg9, arg7, arg5)) / arg2);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 139)
    public final void method1576(byte arg0) {
        this.field3396 = null;
        field3392++;
        this.field3412 = null;
        if (arg0 == 118) {
            this.field3390 = null;
            this.field3404 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIIII)Lk;", line = 154)
    public static final class250 method1577(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3405++;
        long var5 = (long) arg4 & 0xFFFFL | (long) arg2 & 0xFFFFL << 16 | (long) arg1 & 0xFFFFL << 48 | ((long) arg3 & 0xFFFFL) << 32;
        class250 var7 = (class250) class77.field1196.method2288(var5, (byte) 102);
        if (var7 != null) {
            return var7;
        }
        class90 var8 = class92.method732(arg4, (byte) -67);
        class302[] var9 = null;
        if (var8.field1442 != null) {
            var9 = new class302[var8.field1442.length];
            for (int var10 = 0; var10 < var9.length; var10++) {
                class264 var11 = class19.method203(var8.field1442[var10], 124);
                var9[var10] = new class302(var11.field3908, var11.field3912, var11.field3896, var11.field3911, var11.field3900, var11.field3910, var11.field3895, var11.field3902);
            }
        }
        class250 var12 = new class250(var8.field1443, var9, var8.field1437, arg1, arg3, arg2);
        class77.field1196.method2281(0, var5, var12);
        int var13 = 116 / ((18 - arg0) / 45);
        return var12;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZIZLpk;Lpk;)Lwf;", line = 198)
    public static final class64 method1578(boolean arg0, int arg1, boolean arg2, class120 arg3, class120 arg4) {
        boolean var5 = arg2;
        field3407++;
        int[] var6 = arg3.method940(arg1, (byte) -60);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method957(arg1, var6[var7], (byte) 101);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg4.method957(0, var9, (byte) 104);
                } else {
                    var10 = arg4.method957(var9, 0, (byte) 78);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class64(arg3, arg4, arg1, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V", line = 262)
    public static final void method1579(int arg0, int arg1, int arg2) {
        class30.field480 = true;
        class258.field3837 = arg0;
        class257.field3809 = arg1;
        class243.field3638 = arg2;
        class289.field4552 = -1;
        class184.field2923 = -1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V", line = 273)
    public static final void method1580(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3384++;
        if (class162.field2623) {
            class114.method886(arg4, arg3, arg0 + arg4, arg2 + arg3);
            class114.method887(arg4, arg3, arg0, arg2, 0);
        } else {
            class33.method304(arg4, arg3, arg4 + arg0, arg3 - -arg2);
            class33.method288(arg4, arg3, arg0, arg2, 0);
        }
        if (arg1 != 16777215 || class344.field5333 < 100) {
            return;
        }
        if (class277.field4328 == null || class277.field4328.field1412 != arg0 || class277.field4328.field1413 != arg2) {
            class317 var5 = new class317(arg0, arg2);
            class33.method299(var5.field4988, arg0, arg2);
            class343.method2378(arg0, 0, (byte) -127, 0, 0, class113.field1833, arg2, class286.field4473, 0);
            if (class162.field2623) {
                class277.field4328 = new class196(var5);
            } else {
                class277.field4328 = var5;
            }
            if (class162.field2623) {
                class33.field503 = null;
            } else {
                class101.field1666.method1981(18517);
            }
        }
        class277.field4328.method693(arg4, arg3);
        int var6 = class155.field2553 * arg0 / class113.field1833 + arg4;
        int var7 = class84.field1303 * arg2 / class286.field4473;
        int var8 = class259.field3842 * arg2 / class286.field4473 + arg3;
        int var9 = 16711680;
        int var10 = class245.field3662 * arg0 / class113.field1833;
        if (class109.field1773 == 1) {
            var9 = 16777215;
        }
        if (class162.field2623) {
            class114.method893(var6, var8, var10, var7, var9, 128);
            class114.method897(var6, var8, var10, var7, var9);
        } else {
            class33.method302(var6, var8, var10, var7, var9, 128);
            class33.method293(var6, var8, var10, var7, var9);
        }
        if (class160.field2603 <= 0) {
            return;
        }
        int var11;
        if (class157.field2569 > 10) {
            var11 = (20 - class157.field2569) * 25;
        } else {
            var11 = class157.field2569 * 25;
        }
        for (class172 var12 = (class172) class62.field908.method268(-1); var12 != null; var12 = (class172) class62.field908.method278(1)) {
            if (class244.field3657 == var12.field2765) {
                int var13 = arg4 + (var12.field2760 * arg0 / class113.field1833);
                int var14 = arg3 + (var12.field2764 * arg2 / class286.field4473);
                if (class162.field2623) {
                    class114.method893(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                } else {
                    class33.method302(var13 - 2, var14 - 2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 374)
    public static void method1581(int arg0) {
        field3393 = null;
        int var1 = 10 / ((-arg0 - 49) / 45);
        field3410 = null;
    }
}
