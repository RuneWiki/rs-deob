import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class265 {

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public static int[] field4614 = new int[5];

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "S")
    public static short field4619 = 256;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lti;")
    public static class155 field4611;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lwg;")
    public static class238 field4609;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
    public static final void method1746(byte arg0, int arg1) {
        field4613++;
        if (arg0 != -52) {
            field4611 = null;
        }
        if (class200.field3427 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class200.field3427 == 0) {
            class113.method827(4);
        }
        if (arg1 == 40) {
            class81.method528(true);
        }
        if (arg1 != 40 && class171.field2984 != null) {
            class171.field2984.method1402(1);
            class171.field2984 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class90.field1530 = 1;
            class110.field1939 = 1;
            class51.field856 = 0;
            class18.field257 = 0;
            class169.field2947 = 0;
            class168.method1153((byte) 108);
        }
        if (arg1 == 5) {
            class164.method1136(class229.field3994, 0);
        } else {
            class197.method1287(11306);
        }
        boolean var3 = class200.field3427 == 5 || class200.field3427 == 10 || class200.field3427 == 28;
        if (var2 != var3) {
            if (var2) {
                class5.field69 = class134.field2385;
                if (class90.field1531 == 0) {
                    class226.method1468(2, 76);
                } else {
                    class108.method805(false, class164.field2859, 1, 255, 2, class134.field2385, 0);
                }
                class187.field3191.method1761(5238, false);
            } else {
                class226.method1468(2, -92);
                class187.field3191.method1761(arg0 ^ 0xFFFFEBBA, true);
            }
        }
        class200.field3427 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V")
    public static final void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4620++;
        int var6 = arg2;
        int var7 = 0;
        int var8 = arg0 * arg0;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        if (arg1 != 1785787169) {
            return;
        }
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 << 2;
        int var15 = var9 - ((var12 - 1) * var11);
        int var16 = ((var7 << 1) + 3) * var10;
        int var17 = var8 << 2;
        int var18 = (var7 + 1) * var14;
        int var19 = ((arg2 << 1) - 3) * var11;
        if (arg5 >= class149.field2603 && class141.field2493 >= arg5) {
            int var20 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4 + arg0);
            int var21 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4 - arg0);
            class36.method216(class19.field280[arg5], var21, arg3, arg1 - 1785787285, var20);
        }
        int var22 = (arg2 - 1) * var17;
        while (var6 > 0) {
            var6--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var18;
                    var7++;
                    var18 += var14;
                    var13 += var16;
                    var16 += var14;
                }
            }
            int var23 = arg5 - var6;
            if (var15 < 0) {
                var15 += var18;
                var13 += var16;
                var7++;
                var18 += var14;
                var16 += var14;
            }
            int var24 = arg5 + var6;
            var13 += -var22;
            if (class149.field2603 <= var24 && class141.field2493 >= var23) {
                int var25 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4 + var7);
                int var26 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4 - var7);
                if (class149.field2603 <= var23) {
                    class36.method216(class19.field280[var23], var26, arg3, -117, var25);
                }
                if (var24 <= class141.field2493) {
                    class36.method216(class19.field280[var24], var26, arg3, arg1 - 1785787295, var25);
                }
            }
            var15 += -var19;
            var19 -= var17;
            var22 -= var17;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method1748(byte arg0) {
        if (arg0 >= -44) {
            field4617 = 16;
        }
        field4611 = null;
        field4614 = null;
        field4609 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
    public static final void method1749(int arg0, byte arg1) {
        field4610++;
        class53.field887.method988(arg0, -108);
        class220.field3744.method988(arg0, -97);
        class36.field587.method988(arg0, -117);
        if (arg1 > -37) {
            field4609 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILma;Lma;)V")
    public static final void method1750(int arg0, class105 arg1, class105 arg2) {
        class210.field3553 = arg2;
        class8.field121 = arg1;
        field4615++;
        if (arg0 != -30345) {
            field4617 = -112;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIIIILk;IIIILhh;II)Lhh;")
    public static final class176 method1751(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class215 arg6, int arg7, int arg8, int arg9, int arg10, class176 arg11, int arg12, int arg13) {
        field4616++;
        long var14 = ((long) arg5 << 48) + ((long) arg2 << 32) + (long) ((arg8 << 24) + arg3 - -(arg7 << 16));
        class176 var16 = (class176) class252.field4474.method990(var14, (byte) 77);
        if (var16 == null) {
            byte var17;
            if (arg3 == 1) {
                var17 = 9;
            } else if (arg3 == 2) {
                var17 = 12;
            } else if (arg3 == 3) {
                var17 = 15;
            } else if (arg3 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class263 var20 = new class263(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int var21 = var20.method1729(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class223.field3769[var33] * var30 + arg4 >> 16;
                    int var35 = class223.field3760[var33] * var31 + arg12 >> 16;
                    var22[var23][var32] = var20.method1729(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg7 * var26 + arg8 * var25 >> 8);
                short var28 = (short) (((arg2 & 0x7F) * var26 + (arg5 & 0x7F) * var25 & 0x7F00) + ((arg2 & 0xFC00) * var26 + (arg5 & 0xFC00) * var25 & 0xFC0000) + ((arg2 & 0x380) * var26 + (arg5 & 0x380) * var25 & 0x38000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1738(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1738(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method1738(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1744(64, 768, -50, -10, -50);
            class252.field4474.method986(0, var14, var16);
        }
        if (arg13 < 59) {
            return null;
        }
        int var36 = arg3 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg11.method942();
        int var42 = arg11.method929();
        if (arg0) {
            if (arg10 > 1664 || arg10 < 384) {
                var38 -= 128;
            }
            if (arg10 > 640 && arg10 < 1408) {
                var40 = var36 + 128;
            }
            if (arg10 > 1152 && arg10 < 1920) {
                var39 = var36 + 128;
            }
            if (arg10 > 128 && arg10 < 896) {
                var37 -= 128;
            }
        }
        if (var42 > var39) {
            var42 = var39;
        }
        int var43 = arg11.method952();
        if (var43 < var38) {
            var43 = var38;
        }
        int var44 = arg11.method935();
        if (var40 < var44) {
            var44 = var40;
        }
        if (var37 > var41) {
            var41 = var37;
        }
        class79 var45 = null;
        if (arg6 != null) {
            int var46 = arg6.field3688[arg9];
            var45 = class51.method320(var46 >> 16, 121);
            arg9 = var46 & 0xFFFF;
        }
        class176 var47;
        if (var45 == null) {
            var47 = var16.method943(true, true);
            var47.method936((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method927((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method943(!var45.method514(0, arg9), true);
            var47.method936((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method927((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method949(var45, arg9);
        }
        if (arg10 != 0) {
            var47.method926(arg10);
        }
        class130 var48 = (class130) var47;
        if (class89.method647(arg12 + var43, class159.field2790, arg4 + var41, -54) != arg1 || class89.method647(arg12 + var44, class159.field2790, arg4 + var42, 119) != arg1) {
            for (int var49 = 0; var49 < var48.field2281; var49++) {
                var48.field2285[var49] += class89.method647(var48.field2292[var49] + arg12, class159.field2790, var48.field2308[var49] + arg4, -50) - arg1;
            }
            var48.field2301 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lfd;I)Lfd;")
    public static final class229 method1752(class229 arg0, int arg1) {
        field4612++;
        class229 var2 = client.method626(arg0);
        if (arg1 != 0) {
            field4609 = null;
        }
        if (var2 == null) {
            var2 = arg0.field3935;
        }
        return var2;
    }
}
