import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class307 extends class209 {

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lf;")
    public class37 field4923;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "[S")
    public static short[] field4927 = new short[256];

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field4928 = -1;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static volatile int field4929 = 0;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Lcc;")
    public static class222 field4922;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "[I")
    public static int[] field4925;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
    public static final void method2054(int arg0, int arg1, int arg2) {
        if (class175.field2704 == 2) {
            class8.field128 = arg1;
            class82.field1244 = arg2;
        }
        field4924++;
        class50.field818 = (float) arg2;
        class248.field3941 = (float) arg1;
        int var3 = -92 % ((-arg0 - 4) / 52);
        class3.method13(-30070);
        class130.field1929 = true;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)[B")
    public static final byte[] method2055(byte arg0, int arg1) {
        field4926++;
        int var2 = -66 / ((arg0 + 8) / 54);
        class84 var3 = (class84) class246.field3918.method1361((byte) -95, (long) arg1);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class216.method1495(-2, var5, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class84(var4);
            class246.field3918.method1365((long) arg1, (byte) 13, var3);
        }
        return var3.field1261;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V")
    public static void method2056(byte arg0) {
        field4922 = null;
        field4925 = null;
        if (arg0 == 104) {
            field4927 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lf;)V")
    public class307(class37 arg0) {
        this.field4923 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V")
    public static final void method2057(byte arg0) {
        if (arg0 != 29) {
            field4928 = -70;
        }
        field4921++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lhh;IIIIIIIZ)V")
    public static final void method2058(class122 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class42.field713;
        int var11;
        int var12 = var11 = (arg7 << 7) - class14.field178;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class233.field3684[arg1][arg6][arg7] - class178.field2736;
        int var18 = class233.field3684[arg1][arg6 + 1][arg7] - class178.field2736;
        int var19 = class233.field3684[arg1][arg6 + 1][arg7 + 1] - class178.field2736;
        int var20 = class233.field3684[arg1][arg6][arg7 + 1] - class178.field2736;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class224.field3599;
        int var46 = (var24 << 9) / var25 + class224.field3598;
        int var47 = (var27 << 9) / var31 + class224.field3599;
        int var48 = (var30 << 9) / var31 + class224.field3598;
        int var49 = (var33 << 9) / var37 + class224.field3599;
        int var50 = (var36 << 9) / var37 + class224.field3598;
        int var51 = (var39 << 9) / var43 + class224.field3599;
        int var52 = (var42 << 9) / var43 + class224.field3598;
        class224.field3608 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class118.field1789 && class138.method1021(class26.field441 + class224.field3599, class254.field4064 + class224.field3598, var50, var52, var48, var49, var51, var47)) {
                class106.field1659 = arg6;
                class49.field810 = arg7;
            }
            if (!arg8) {
                class224.field3600 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class224.field3610 || var51 > class224.field3610 || var47 > class224.field3610) {
                    class224.field3600 = true;
                }
                if (arg0.field1841 == -1) {
                    if (arg0.field1845 != 12345678) {
                        class224.method1556(var50, var52, var48, var49, var51, var47, arg0.field1845, arg0.field1837, arg0.field1846);
                    }
                } else if (!class106.field1665) {
                    int var53 = class224.field3596.method732(true, arg0.field1841);
                    class224.method1556(var50, var52, var48, var49, var51, var47, class48.method402(var53, arg0.field1845), class48.method402(var53, arg0.field1837), class48.method402(var53, arg0.field1846));
                } else if (arg0.field1834) {
                    class224.method1552(var50, var52, var48, var49, var51, var47, arg0.field1845, arg0.field1837, arg0.field1846, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1841);
                } else {
                    class224.method1552(var50, var52, var48, var49, var51, var47, arg0.field1845, arg0.field1837, arg0.field1846, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1841);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class118.field1789 && class138.method1021(class26.field441 + class224.field3599, class254.field4064 + class224.field3598, var46, var48, var52, var45, var47, var51)) {
            class106.field1659 = arg6;
            class49.field810 = arg7;
        }
        if (arg8) {
            return;
        }
        class224.field3600 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class224.field3610 || var47 > class224.field3610 || var51 > class224.field3610) {
            class224.field3600 = true;
        }
        if (arg0.field1841 != -1) {
            if (class106.field1665) {
                class224.method1552(var46, var48, var52, var45, var47, var51, arg0.field1844, arg0.field1846, arg0.field1837, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1841);
                return;
            }
            int var54 = class224.field3596.method732(true, arg0.field1841);
            class224.method1556(var46, var48, var52, var45, var47, var51, class48.method402(var54, arg0.field1844), class48.method402(var54, arg0.field1846), class48.method402(var54, arg0.field1837));
        } else if (arg0.field1844 != 12345678) {
            class224.method1556(var46, var48, var52, var45, var47, var51, arg0.field1844, arg0.field1846, arg0.field1837);
            return;
        }
    }
}
