import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public abstract class class545 {

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "Lch;")
    public class38 field7920;

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "[I")
    public static int[] field7927 = new int[1024];

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "Lgr;")
    public static class530 field7925 = new class530(15, 12);

    @OriginalMember(owner = "client!sha", name = "o", descriptor = "I")
    public static int field7931 = -1;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!sha", name = "m", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!sha", name = "n", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!sha", name = "p", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZZ)V")
    public abstract void method454(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7921++;
        if (arg3 <= 56) {
            return;
        }
        class625.method3608(arg5, (byte) 104);
        int var7 = 0;
        int var8 = arg5 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg1 >= class377.field5458 && arg1 <= class362.field5291) {
            int[] var15 = class193.field2839[arg1];
            int var16 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 - arg5);
            int var17 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 + arg5);
            int var18 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 - var8);
            int var19 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 + var8);
            class518.method3153(var18, var16, var15, -7, arg6);
            class518.method3153(var19, var18, var15, -7, arg0);
            class518.method3153(var17, var19, var15, -7, arg6);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class464.field6623[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class377.field5458 <= var21 && class362.field5291 >= var20) {
                    if (var8 > var9) {
                        int var22 = class464.field6623[var9];
                        int var23 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 + var7);
                        int var24 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 - var7);
                        int var25 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 + var22);
                        int var26 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 - var22);
                        if (var21 <= class362.field5291) {
                            int[] var27 = class193.field2839[var21];
                            class518.method3153(var26, var24, var27, -7, arg6);
                            class518.method3153(var25, var26, var27, -7, arg0);
                            class518.method3153(var23, var25, var27, -7, arg6);
                        }
                        if (class377.field5458 <= var20) {
                            int[] var28 = class193.field2839[var20];
                            class518.method3153(var26, var24, var28, -7, arg6);
                            class518.method3153(var25, var26, var28, -7, arg0);
                            class518.method3153(var23, var25, var28, -7, arg6);
                        }
                    } else {
                        int var29 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 + var7);
                        int var30 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 - var7);
                        if (var21 <= class362.field5291) {
                            class518.method3153(var29, var30, class193.field2839[var21], -7, arg6);
                        }
                        if (var20 >= class377.field5458) {
                            class518.method3153(var29, var30, class193.field2839[var20], -7, arg6);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (class377.field5458 <= var32 && class362.field5291 >= var31) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (var33 >= class200.field2976 && class204.field3061 >= var34) {
                    int var35 = class183.method1292(class200.field2976, -1, class204.field3061, var33);
                    int var36 = class183.method1292(class200.field2976, -1, class204.field3061, var34);
                    if (var8 <= var7) {
                        if (var32 <= class362.field5291) {
                            class518.method3153(var35, var36, class193.field2839[var32], -7, arg6);
                        }
                        if (class377.field5458 <= var31) {
                            class518.method3153(var35, var36, class193.field2839[var31], -7, arg6);
                        }
                    } else {
                        int var37 = var7 > var11 ? class464.field6623[var7] : var11;
                        int var38 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 + var37);
                        int var39 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 - var37);
                        if (var32 <= class362.field5291) {
                            int[] var40 = class193.field2839[var32];
                            class518.method3153(var39, var36, var40, -7, arg6);
                            class518.method3153(var38, var39, var40, -7, arg0);
                            class518.method3153(var35, var38, var40, -7, arg6);
                        }
                        if (var31 >= class377.field5458) {
                            int[] var41 = class193.field2839[var31];
                            class518.method3153(var39, var36, var41, -7, arg6);
                            class518.method3153(var38, var39, var41, -7, arg0);
                            class518.method3153(var35, var38, var41, -7, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIII)V")
    public static final void method3277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7929++;
        if (class270.field3833 != 1) {
            return;
        }
        int var5 = arg0 / class381.field5523;
        int var6 = arg2 / class381.field5523;
        if (arg3 > -40) {
            field7931 = 46;
        }
        int var7 = arg1 / class519.field7488;
        int var8 = arg4 / class519.field7488;
        if (var5 >= class565.field8192 || var6 < 0 || class595.field8451 <= var7 || var8 < 0) {
            return;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class565.field8192 <= var6) {
            var6 = class565.field8192 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var8 >= class595.field8451) {
            var8 = class595.field8451 - 1;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class316.method1941(109, class647.field9322 + var9, class595.field8451) * class565.field8192;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = class316.method1941(118, class641.field9120 + var11, class565.field8192) + var10;
                class571.field8229[var12] = class721.field10151;
            }
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljc;I)V")
    public static final void method3278(class168 arg0, int arg1) {
        field7924++;
        arg0.method2926((byte) -126, class241.field3573.method2615(false));
        arg0.method2926((byte) -128, class102.field1458.method2615(false));
        arg0.method2926((byte) -128, class284.field3966.method2615(false));
        arg0.method2926((byte) -120, class225.field3351.method2615(false));
        arg0.method2926((byte) -117, class551.field8040.method2615(false));
        arg0.method2926((byte) -119, class275.field3876.method2615(false));
        arg0.method2926((byte) -118, class505.field7338.method2615(false));
        arg0.method2926((byte) -120, class386.field5586.method2615(false));
        arg0.method2926((byte) -120, class603.field8548.method2615(false));
        arg0.method2926((byte) -125, class223.field3286.method2615(false));
        arg0.method2926((byte) -121, class497.field7147.method2615(false));
        arg0.method2926((byte) -117, class429.field6177.method2615(false));
        arg0.method2926((byte) -126, class151.field2210.method2615(false));
        arg0.method2926((byte) -120, class726.field10209.method2615(false));
        arg0.method2926((byte) -121, class633.field8934.method2615(false));
        arg0.method2926((byte) -116, class372.field5406.method2615(false));
        arg0.method2926((byte) -123, class564.field8184.method2615(false));
        arg0.method2926((byte) -117, class751.field10463.method2615(false));
        arg0.method2926((byte) -122, class499.field7173.method2615(false));
        arg0.method2926((byte) -120, class634.field8938.method2615(false));
        arg0.method2926((byte) -119, class377.field5456.method2615(false));
        arg0.method2926((byte) -117, class717.field10116.method2615(false));
        arg0.method2926((byte) -120, class150.field2195.method2615(false));
        arg0.method2926((byte) -123, class585.field8351.method2615(false));
        arg0.method2926((byte) -124, class133.field1843.method2615(false));
        arg0.method2926((byte) -124, class487.field7026.method2615(false));
        arg0.method2926((byte) -126, class617.field8790.method2615(false));
        if (arg1 != 15) {
            method3281(-117, -11, -33, -100, 69, -111, -77);
        }
        arg0.method2926((byte) -119, class460.field6535.method2615(false));
        arg0.method2926((byte) -121, class310.field4183.method2615(false));
        arg0.method2926((byte) -120, class284.field3965.method2615(false));
        arg0.method2926((byte) -128, class364.field5328.method2615(false));
        arg0.method2926((byte) -118, class481.field6877.method2615(false));
        arg0.method2926((byte) -125, class692.method3907(-108));
        arg0.method2926((byte) -117, class461.method2799(-29709));
        arg0.method2926((byte) -116, class640.field9116.method2615(false));
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
    public abstract void method452(int arg0);

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IILec;)V")
    public abstract void method455(int arg0, int arg1, class101 arg2);

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)Z")
    public abstract boolean method459(int arg0);

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(I)V")
    public static void method3279(int arg0) {
        field7927 = null;
        field7925 = null;
        if (arg0 != 1) {
            field7931 = 61;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLla;IIJZI)V")
    public static final void method3280(byte arg0, class423 arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6) {
        class562.method3365(arg2, arg1, 53, 0, arg3, arg5, arg6, arg4);
        int var8 = -94 / ((-arg0 - 3) / 35);
        field7918++;
    }

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "(I)V")
    public void method456(int arg0) {
        if (arg0 == 0) {
            field7930++;
        }
    }

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "(I)V")
    public void method1741(int arg0) {
        field7923++;
        if (arg0 != 12) {
            this.method1740(true);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)V")
    public void method1740(boolean arg0) {
        field7922++;
        if (arg0) {
            this.method453(70);
        }
    }

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "(I)V")
    public void method1742(int arg0) {
        field7932++;
        if (arg0 != -971) {
            field7927 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lch;)V")
    public class545(class38 arg0) {
        this.field7920 = arg0;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BZ)V")
    public abstract void method457(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(IIIIIII)V")
    public static final void method3281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7926++;
        int var7 = class183.method1292(class377.field5458, arg6 - 1595866466, class362.field5291, arg4);
        int var8 = class183.method1292(class377.field5458, -1, class362.field5291, arg0);
        int var9 = class183.method1292(class200.field2976, -1, class204.field3061, arg2);
        int var10 = class183.method1292(class200.field2976, -1, class204.field3061, arg3);
        int var11 = class183.method1292(class377.field5458, arg6 - 1595866466, class362.field5291, arg1 + arg4);
        int var12 = class183.method1292(class377.field5458, -1, class362.field5291, arg0 - arg1);
        if (arg6 != 1595866465) {
            method3278(null, -117);
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class518.method3153(var10, var9, class193.field2839[var13], -7, arg5);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class518.method3153(var10, var9, class193.field2839[var14], -7, arg5);
        }
        int var15 = class183.method1292(class200.field2976, arg6 ^ 0xA0E1029E, class204.field3061, arg1 + arg2);
        int var16 = class183.method1292(class200.field2976, arg6 ^ 0xA0E1029E, class204.field3061, arg3 - arg1);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class193.field2839[var17];
            class518.method3153(var15, var9, var18, -7, arg5);
            class518.method3153(var10, var16, var18, arg6 ^ 0xA0E10298, arg5);
        }
    }

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "(I)V")
    public void method1739(int arg0) {
        field7917++;
        int var2 = -104 % ((arg0 - 85) / 33);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(III)V")
    public abstract void method451(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "(I)V")
    public void method453(int arg0) {
        field7919++;
        if (arg0 != 0) {
            field7925 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3282(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7928++;
        if (!arg4) {
            field7927 = null;
        }
        class362.field5291 = arg0;
        class204.field3061 = arg2;
        class377.field5458 = arg3;
        class200.field2976 = arg1;
    }
}
