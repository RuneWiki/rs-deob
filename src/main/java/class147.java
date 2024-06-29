import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class147 {

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Z")
    public boolean field2666 = false;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "J")
    public long field2656;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lda;")
    public static class143 field2657;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Llc;")
    public static class189 field2663;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lrk;")
    public class255 field2659;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lai;")
    public static class258 field2660;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[[B")
    public static byte[][] field2654;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 6)
    public static void method1167(int arg0) {
        field2663 = null;
        if (arg0 == -1) {
            field2660 = null;
            field2657 = null;
            field2654 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method1168(boolean arg0) {
        field2655++;
        if (arg0) {
            field2657 = (class143) null;
        }
        class288.field4852.method1533(true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BI)Llc;", line = 32)
    public static final class189 method1169(byte[] arg0, int arg1) {
        field2667++;
        if (arg1 != 2) {
            method1169((byte[]) null, -78);
        }
        if (arg0 == null) {
            return null;
        } else {
            class189 var2 = new class189(arg0, class127.field2312, class40.field646, class190.field3253, class260.field4333, class317.field5350);
            class247.method1738(-115);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII)V", line = 57)
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class260.method1796(arg2 - 122, arg4);
        int var7 = 0;
        int var8 = arg4 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        field2653++;
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = arg0 - var8;
        int var15 = arg0 + var8;
        int var16 = arg2;
        int[] var17 = class184.field3180[arg6];
        class3.method14(arg5, arg0 - arg4, var14, var17, -101);
        class3.method14(arg3, var14, var15, var17, -113);
        class3.method14(arg5, var15, arg0 + arg4, var17, -114);
        while (var7 < var9) {
            var13 += 2;
            var16 += 2;
            var10 += var13;
            var12 += var16;
            if (var12 >= 0 && var11 >= 1) {
                class248.field4108[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class184.field3180[arg6 + var9];
                    int[] var19 = class184.field3180[arg6 - var9];
                    int var20 = arg0 + var7;
                    int var21 = arg0 - var7;
                    class3.method14(arg5, var21, var20, var18, arg2 - 104);
                    class3.method14(arg5, var21, var20, var19, -112);
                } else {
                    int[] var22 = class184.field3180[arg6 + var9];
                    int[] var23 = class184.field3180[arg6 - var9];
                    int var24 = arg0 + var7;
                    int var25 = class248.field4108[var9];
                    int var26 = arg0 + var25;
                    int var27 = arg0 - var7;
                    int var28 = arg0 - var25;
                    class3.method14(arg5, var27, var28, var22, arg2 ^ 0x6B);
                    class3.method14(arg3, var28, var26, var22, -121);
                    class3.method14(arg5, var26, var24, var22, -106);
                    class3.method14(arg5, var27, var28, var23, -103);
                    class3.method14(arg3, var28, var26, var23, -118);
                    class3.method14(arg5, var26, var24, var23, -101);
                }
            }
            int var29 = arg0 + var9;
            int[] var30 = class184.field3180[arg6 + var7];
            int[] var31 = class184.field3180[arg6 - var7];
            int var32 = arg0 - var9;
            if (var7 < var8) {
                int var33 = var7 > var11 ? class248.field4108[var7] : var11;
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class3.method14(arg5, var32, var35, var30, -118);
                class3.method14(arg3, var35, var34, var30, -100);
                class3.method14(arg5, var34, var29, var30, -128);
                class3.method14(arg5, var32, var35, var31, -122);
                class3.method14(arg3, var35, var34, var31, -99);
                class3.method14(arg5, var34, var29, var31, -117);
            } else {
                class3.method14(arg5, var32, var29, var30, -124);
                class3.method14(arg5, var32, var29, var31, -123);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIILob;)V", line = 189)
    public static final void method1171(boolean arg0, int arg1, int arg2, int arg3, class78 arg4) {
        class58.method401((byte) 62);
        if (class117.field2159) {
            class16.method133(arg1, arg2, arg4.field1340 + arg1, arg2 - -arg4.field1367);
        } else {
            class316.method2168(arg1, arg2, arg4.field1340 + arg1, arg4.field1367 + arg2);
        }
        if (arg0) {
            field2654 = (byte[][]) ((byte[][]) null);
        }
        field2652++;
        if (class268.field4482 != 2 && class268.field4482 != 5 && class135.field2400 != null) {
            int var5 = class122.field2215.field5013 / 32 + 48;
            int var6 = 464 - (class122.field2215.field5047 / 32);
            int var7 = class265.field4414 + class305.field5137 & 0x7FF;
            if (class117.field2159) {
                ((class140) class135.field2400).method1088(arg1, arg2, arg4.field1340, arg4.field1367, var5, var6, var7, class23.field396 + 256, (class140) arg4.method596(false, 0));
            } else {
                ((class79) class135.field2400).method615(arg1, arg2, arg4.field1340, arg4.field1367, var5, var6, var7, class23.field396 + 256, arg4.field1329, arg4.field1360);
            }
            if (class122.field2202 != null) {
                for (int var8 = 0; var8 < class122.field2202.field536; var8++) {
                    if (class122.field2202.method259((byte) 58, var8)) {
                        int var9 = (class122.field2202.field531[var8] - class178.field3052) * 4 + 2 - (class122.field2215.field5013 / 32);
                        int var10 = (class122.field2202.field535[var8] - class258.field4294) * 4 + 2 - (class122.field2215.field5047 / 32);
                        int var11 = class312.field5262[var7];
                        int var12 = var11 * 256 / (class23.field396 + 256);
                        int var13 = class312.field5269[var7];
                        int var14 = var13 * 256 / (class23.field396 + 256);
                        int var15 = var9 * var14 + var10 * var12 >> 16;
                        int var16 = var10 * var14 - (var9 * var12) >> 16;
                        class276 var17 = class268.field4487;
                        if (class122.field2202.method260(4, var8) == 1) {
                            var17 = class286.field4831;
                        }
                        if (class122.field2202.method260(4, var8) == 2) {
                            var17 = class207.field3507;
                        }
                        int var18 = var17.method1892(class122.field2202.field534[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= (-arg4.field1340) && var19 <= arg4.field1340 && var16 >= (-arg4.field1367) && var16 <= arg4.field1367) {
                            int var20 = 16777215;
                            if (class122.field2202.field528[var8] != -1) {
                                var20 = class122.field2202.field528[var8];
                            }
                            if (class117.field2159) {
                                class16.method127((class140) arg4.method596(false, 0));
                            } else {
                                class316.method2173(arg4.field1329, arg4.field1360);
                            }
                            var17.method1894(class122.field2202.field534[var8], arg4.field1340 / 2 + (var19 + arg1), arg4.field1367 / 2 + arg2 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class117.field2159) {
                                class16.method134();
                            } else {
                                class316.method2166();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class160.field2789; var21++) {
                int var22 = class274.field4552[var21] * 4 + (2 - class122.field2215.field5013 / 32);
                int var23 = class143.field2577[var21] * 4 + (2 - class122.field2215.field5047 / 32);
                class311 var24 = class229.method1637(class46.field738[var21], (byte) 93);
                if (var24.field5191 != null) {
                    var24 = var24.method2105((byte) -126);
                    if (var24 == null || var24.field5239 == -1) {
                        continue;
                    }
                }
                class47.method351(class258.field4284[var24.field5239], arg1, var22, arg4, arg2, var23, 2);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class18 var27 = class212.field3557[class157.field2765][var25][var26];
                    if (var27 != null) {
                        int var28 = var26 * 4 + 2 - class122.field2215.field5047 / 32;
                        int var29 = var25 * 4 + 2 - (class122.field2215.field5013 / 32);
                        class47.method351(class93.field1642[0], arg1, var29, arg4, arg2, var28, 2);
                    }
                }
            }
            for (int var30 = 0; var30 < class31.field520; var30++) {
                class60 var31 = class204.field3446[class278.field4674[var30]];
                if (var31 != null && var31.method289(-10662)) {
                    class83 var32 = var31.field926;
                    if (var32 != null && var32.field1502 != null) {
                        var32 = var32.method643(true);
                    }
                    if (var32 != null && var32.field1476 && var32.field1494) {
                        int var33 = var31.field5013 / 32 - (class122.field2215.field5013 / 32);
                        int var34 = var31.field5047 / 32 - class122.field2215.field5047 / 32;
                        class47.method351(class93.field1642[1], arg1, var33, arg4, arg2, var34, 2);
                    }
                }
            }
            for (int var35 = 0; var35 < class171.field2966; var35++) {
                class39 var36 = class270.field4520[class123.field2233[var35]];
                if (var36 != null && var36.method289(-10662)) {
                    int var37 = var36.field5047 / 32 - (class122.field2215.field5047 / 32);
                    int var38 = var36.field5013 / 32 - (class122.field2215.field5013 / 32);
                    boolean var39 = false;
                    long var40 = var36.field611.method1256(0);
                    for (int var42 = 0; var42 < class264.field4403; var42++) {
                        if (class200.field3405[var42] == var40 && class214.field3586[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class20.field319; var44++) {
                        if (class260.field4330[var44].field2701 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class122.field2215.field636 != 0 && var36.field636 != 0 && class122.field2215.field636 == var36.field636) {
                        var45 = true;
                    }
                    if (var39) {
                        class47.method351(class93.field1642[3], arg1, var38, arg4, arg2, var37, 2);
                    } else if (var43) {
                        class47.method351(class93.field1642[5], arg1, var38, arg4, arg2, var37, 2);
                    } else if (var45) {
                        class47.method351(class93.field1642[4], arg1, var38, arg4, arg2, var37, 2);
                    } else {
                        class47.method351(class93.field1642[2], arg1, var38, arg4, arg2, var37, 2);
                    }
                }
            }
            class222[] var46 = class149.field2679;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class222 var48 = var46[var47];
                if (var48 != null && var48.field3712 != 0 && (class90.field1598 % 20) < 10) {
                    if (var48.field3712 == 1 && var48.field3702 >= 0 && class204.field3446.length > var48.field3702) {
                        class60 var49 = class204.field3446[var48.field3702];
                        if (var49 != null) {
                            int var50 = var49.field5013 / 32 - (class122.field2215.field5013 / 32);
                            int var51 = var49.field5047 / 32 - (class122.field2215.field5047 / 32);
                            class262.method1802(arg4, arg1, 1, var50, arg2, var48.field3717, var51);
                        }
                    }
                    if (var48.field3712 == 2) {
                        int var52 = (var48.field3706 - class178.field3052) * 4 - (class122.field2215.field5013 / 32 - 2);
                        int var53 = (var48.field3705 - class258.field4294) * 4 + 2 - (class122.field2215.field5047 / 32);
                        class262.method1802(arg4, arg1, 1, var52, arg2, var48.field3717, var53);
                    }
                    if (var48.field3712 == 10 && var48.field3702 >= 0 && var48.field3702 < class270.field4520.length) {
                        class39 var54 = class270.field4520[var48.field3702];
                        if (var54 != null) {
                            int var55 = var54.field5013 / 32 - (class122.field2215.field5013 / 32);
                            int var56 = var54.field5047 / 32 - class122.field2215.field5047 / 32;
                            class262.method1802(arg4, arg1, 1, var55, arg2, var48.field3717, var56);
                        }
                    }
                }
            }
            if (class170.field2959 != 0) {
                int var57 = class170.field2959 * 4 + 2 - class122.field2215.field5013 / 32;
                int var58 = class46.field727 * 4 + 2 - (class122.field2215.field5047 / 32);
                class47.method351(class305.field5140, arg1, var57, arg4, arg2, var58, 2);
            }
            if (class117.field2159) {
                class16.method124(arg4.field1340 / 2 + arg1 - 1, arg4.field1367 / 2 + arg2 + -1, 3, 3, 16777215);
            } else {
                class316.method2174(arg4.field1340 / 2 + arg1 - 1, arg4.field1367 / 2 + -1 + arg2, 3, 3, 16777215);
            }
        } else if (class117.field2159) {
            class71 var59 = arg4.method596(false, 0);
            if (var59 != null) {
                var59.method285(arg1, arg2);
            }
        } else {
            class316.method2164(arg1, arg2, 0, arg4.field1329, arg4.field1360);
        }
        class252.field4211[arg3] = true;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 542)
    public static final void method1172(int arg0) {
        field2662++;
        if (class240.field3998 != null) {
            class251 var1 = class240.field3998;
            synchronized (class240.field3998) {
                class240.field3998 = null;
            }
        }
        if (arg0 != -1) {
            method1167(109);
        }
    }
}
