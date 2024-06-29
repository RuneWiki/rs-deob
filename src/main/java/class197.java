import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class197 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Ljl;")
    public static class263 field3073 = new class263(5000);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[S")
    public static short[] field3075;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[[[B")
    public static byte[][][] field3076;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method1401(byte arg0) {
        if (arg0 != 12) {
            field3076 = null;
        }
        field3075 = null;
        field3076 = null;
        field3073 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public static final void method1402(int arg0, int arg1) {
        class20.field319.method1166((byte) 23, arg1);
        if (arg0 != 1) {
            field3076 = null;
        }
        field3072++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILcc;IB)V")
    public static final void method1403(int arg0, int arg1, class222 arg2, int arg3, byte arg4) {
        field3074++;
        if (arg4 > -109) {
            field3076 = null;
        }
        class102.method778(-9546);
        class66.method524(arg3, arg1, arg2.field3408 + arg3, arg2.field3561 + arg1);
        if (class52.field824 == 2 || class52.field824 == 5 || class73.field1119 == null) {
            class66.method522(arg3, arg1, 0, arg2.field3452, arg2.field3523);
        } else {
            int var5 = (class263.field4168.field4725 / 32) + 48;
            int var6 = (int) class50.field818 + class67.field1057 & 0x7FF;
            int var7 = 464 - (class263.field4168.field4709 / 32);
            ((class51) class73.field1119).method442(arg3, arg1, arg2.field3408, arg2.field3561, var5, var7, var6, class285.field4487 + 256, arg2.field3452, arg2.field3523);
            if (class145.field2147 != null) {
                for (int var8 = 0; var8 < class145.field2147.field4783; var8++) {
                    if (class145.field2147.method1998((byte) -98, var8)) {
                        int var9 = (((class145.field2147.field4796[var8] & 0xFFFD82F) >> 14) - class138.field2072) * 4 + 2 - (class263.field4168.field4725 / 32);
                        int var10 = ((class145.field2147.field4796[var8] & 0x3FFF) - class159.field2379) * 4 + 2 - (class263.field4168.field4709 / 32);
                        int var11 = class224.field3601[var6];
                        int var12 = class224.field3597[var6];
                        int var13 = var12 * 256 / (class285.field4487 + 256);
                        int var14 = var11 * 256 / (class285.field4487 + 256);
                        int var15 = var9 * var13 + var10 * var14 >> 16;
                        class267 var16 = class117.field1786;
                        int var17 = var10 * var13 - var9 * var14 >> 16;
                        if (class145.field2147.method1990((byte) -57, var8) == 1) {
                            var16 = class276.field4391;
                        }
                        if (class145.field2147.method1990((byte) -57, var8) == 2) {
                            var16 = class73.field1118;
                        }
                        int var18 = var16.method1802(class145.field2147.field4797[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if ((-arg2.field3408) <= var19 && var19 <= arg2.field3408 && (-arg2.field3561) <= var17 && var17 <= arg2.field3561) {
                            int var20 = 16777215;
                            if (class145.field2147.field4792[var8] != -1) {
                                var20 = class145.field2147.field4792[var8];
                            }
                            class66.method531(arg2.field3452, arg2.field3523);
                            var16.method1793(class145.field2147.field4797[var8], arg2.field3408 / 2 + arg3 + var19, arg2.field3561 / 2 + -var17 + arg1, var18, 50, var20, 0, 256, 1, 0, 0);
                            class66.method526();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class274.field4373; var21++) {
                int var58 = class33.field594[var21] * 4 + 2 - class263.field4168.field4709 / 32;
                int var59 = class14.field175[var21] * 4 + 2 - (class263.field4168.field4725 / 32);
                class295 var60 = class166.method1209(102, class248.field3951[var21]);
                if (var60.field4598 != null) {
                    var60 = var60.method1956(25748);
                    if (var60 == null || var60.field4587 == -1) {
                        continue;
                    }
                }
                class152.method1100(true, class23.field387[var60.field4587], arg3, var59, arg1, arg2, var58);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var54 = 0; var54 < 104; var54++) {
                    class2 var55 = class110.field1695[class130.field1941][var22][var54];
                    if (var55 != null) {
                        int var56 = var22 * 4 + 2 - (class263.field4168.field4725 / 32);
                        int var57 = var54 * 4 + 2 - (class263.field4168.field4709 / 32);
                        class152.method1100(true, class69.field1096[0], arg3, var56, arg1, arg2, var57);
                    }
                }
            }
            for (int var23 = 0; var23 < class117.field1782; var23++) {
                class161 var50 = class116.field1781[class255.field4084[var23]];
                if (var50 != null && var50.method1006(-1)) {
                    class95 var51 = var50.field2421;
                    if (var51 != null && var51.field1547 != null) {
                        var51 = var51.method741(119);
                    }
                    if (var51 != null && var51.field1522 && var51.field1518) {
                        int var52 = var50.field4709 / 32 - (class263.field4168.field4709 / 32);
                        int var53 = var50.field4725 / 32 - (class263.field4168.field4725 / 32);
                        if (var51.field1510 == -1) {
                            class152.method1100(true, class69.field1096[1], arg3, var53, arg1, arg2, var52);
                        } else {
                            class152.method1100(true, class23.field387[var51.field1510], arg3, var53, arg1, arg2, var52);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class259.field4112; var24++) {
                class136 var40 = class233.field3682[class26.field455[var24]];
                if (var40 != null && var40.method1006(-1)) {
                    int var41 = var40.field4709 / 32 - class263.field4168.field4709 / 32;
                    int var42 = var40.field4725 / 32 - (class263.field4168.field4725 / 32);
                    boolean var43 = false;
                    long var44 = class170.method1223(true, var40.field2064);
                    for (int var46 = 0; var46 < class181.field2843; var46++) {
                        if (class238.field3762[var46] == var44 && class143.field2139[var46] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; var48 < class297.field4776; var48++) {
                        if (class83.field1249[var48].field2009 == var44) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (class263.field4168.field2049 != 0 && var40.field2049 != 0 && class263.field4168.field2049 == var40.field2049) {
                        var49 = true;
                    }
                    if (var43) {
                        class152.method1100(true, class69.field1096[3], arg3, var42, arg1, arg2, var41);
                    } else if (var47) {
                        class152.method1100(true, class69.field1096[5], arg3, var42, arg1, arg2, var41);
                    } else if (var49) {
                        class152.method1100(true, class69.field1096[4], arg3, var42, arg1, arg2, var41);
                    } else {
                        class152.method1100(true, class69.field1096[2], arg3, var42, arg1, arg2, var41);
                    }
                }
            }
            class173[] var25 = class136.field2053;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class173 var29 = var25[var26];
                if (var29 != null && var29.field2670 != 0 && (class41.field686 % 20) < 10) {
                    if (var29.field2670 == 1 && var29.field2665 >= 0 && var29.field2665 < class116.field1781.length) {
                        class161 var30 = class116.field1781[var29.field2665];
                        if (var30 != null) {
                            int var31 = var30.field4725 / 32 - class263.field4168.field4725 / 32;
                            int var32 = var30.field4709 / 32 - (class263.field4168.field4709 / 32);
                            class182.method1303(var29.field2662, var32, arg2, arg3, var31, 360000, arg1, 123);
                        }
                    }
                    if (var29.field2670 == 2) {
                        int var33 = (var29.field2667 - class159.field2379) * 4 + 2 - (class263.field4168.field4709 / 32);
                        int var34 = (var29.field2661 - class138.field2072) * 4 + 2 - class263.field4168.field4725 / 32;
                        int var35 = var29.field2664 * 4;
                        int var36 = var35 * var35;
                        class182.method1303(var29.field2662, var33, arg2, arg3, var34, var36, arg1, 120);
                    }
                    if (var29.field2670 == 10 && var29.field2665 >= 0 && var29.field2665 < class233.field3682.length) {
                        class136 var37 = class233.field3682[var29.field2665];
                        if (var37 != null) {
                            int var38 = var37.field4725 / 32 - (class263.field4168.field4725 / 32);
                            int var39 = var37.field4709 / 32 - (class263.field4168.field4709 / 32);
                            class182.method1303(var29.field2662, var39, arg2, arg3, var38, 360000, arg1, 126);
                        }
                    }
                }
            }
            if (class305.field4895 != 0) {
                int var27 = class305.field4895 * 4 - (class263.field4168.field4725 / 32 - ((class263.field4168.method1013(0) + -1) * 2) - 2);
                int var28 = class296.field4669 * 4 + class263.field4168.method1013(0) * 2 + 2 - (class263.field4168.field4709 / 32) - 2;
                class152.method1100(true, class36.field625, arg3, var27, arg1, arg2, var28);
            }
            class66.method532(arg2.field3408 / 2 + arg3 - 1, arg2.field3561 / 2 + arg1 + -1, 3, 3, 16777215);
        }
        class112.field1729[arg0] = true;
    }
}
