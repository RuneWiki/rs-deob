import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class163 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[S")
    public static short[] field2238 = new short[256];

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Lkm;")
    public static class133 field2244;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lpn;")
    public static class170 field2241;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Lng;")
    public static class330 field2248;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2243;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
    public String field2242;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "[Z")
    public static boolean[] field2250;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[Lla;II[BZIIII)[I", line = 6)
    public static final int[] method1171(int arg0, int arg1, class72[] arg2, int arg3, int arg4, byte[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field2245++;
        int var11 = (arg10 & 0x7) * 8;
        if (!arg6) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    int var14 = class189.method1323((byte) 36, arg3, var13 & 0x7, var12 & 0x7) + arg8;
                    int var15 = arg4 + class146.method1054(var12 & 0x7, arg3, -2, var13 & 0x7);
                    if (var14 > 0 && var14 < 103 && var15 > 0 && var15 < 103) {
                        arg2[arg1].field988[var14][var15] = class47.method303(arg2[arg1].field988[var14][var15], -2097153);
                    }
                }
            }
        }
        class316 var16 = new class316(arg5);
        int var17 = (arg10 & 0xFFFFFFF8) << 3;
        byte var18;
        if (arg6) {
            var18 = 1;
        } else {
            var18 = 4;
        }
        int var19 = (arg9 & 0x7) * 8;
        int var20 = arg9 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        int var22 = arg0;
        if (arg3 == 1) {
            var22 = 1;
        } else if (arg3 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg3 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg7 != var23 || var24 < var11 || var24 > var11 + 8 || var19 > var25 || var25 > (var19 + 8)) {
                        class252.method1716(0, 0, false, true, -1, 0, 0, -1, var16, 0, arg6, 0);
                    } else if ((var11 + 8) == var24 || (var19 + 8) == var25) {
                        int var32;
                        int var33;
                        if (arg3 == 0) {
                            var33 = var24 + arg8 - var11;
                            var32 = -var19 - (-var25 - arg4);
                        } else if (arg3 == 1) {
                            var32 = var11 + arg4 + 8 - var24;
                            var33 = var25 + arg8 - var19;
                        } else if (arg3 == 2) {
                            var32 = var19 + arg4 + 8 - var25;
                            var33 = arg8 + var11 + 8 - var24;
                        } else {
                            var32 = arg4 + var24 - var11;
                            var33 = arg8 - (-var19 - 8) - var25;
                        }
                        class252.method1716(0, 0, true, true, var33, var17 + var24, var20 + var25, var32, var16, 0, arg6, arg1);
                    } else {
                        int var26 = class189.method1323((byte) 36, arg3, var25 & 0x7, var24 & 0x7) + arg8;
                        int var27 = arg4 + class146.method1054(var24 & 0x7, arg3, arg0 ^ 0xFFFFFFFE, var25 & 0x7);
                        class252.method1716(arg3, var21, false, true, var26, var17 + var24, var20 + var25, var27, var16, var22, arg6, arg1);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg3 == 0) {
                                var31 = var29 + arg4 - var19;
                                var30 = var28 + arg8 - var11;
                            } else if (arg3 == 1) {
                                var30 = var29 - (var19 - arg8);
                                var31 = arg4 + (var11 - var28) + 8;
                            } else if (arg3 == 2) {
                                var30 = arg8 + 8 - (-var11 + var28);
                                var31 = arg4 + var19 + 8 - var29;
                            } else {
                                var30 = var19 + arg8 + 8 - var29;
                                var31 = arg4 - (var11 - var28);
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class333.field5020[arg1][var30][var31] = class333.field5020[arg1][var26 + var21][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var16.field4777 < var16.field4798.length) {
            int var36 = var16.method2219(16448);
            if (var36 == 128) {
                var35 = true;
                class201.field2862[0] = var16.method2220((byte) 97);
                class201.field2862[1] = var16.method2161(28984);
                class201.field2862[2] = var16.method2161(28984);
                class201.field2862[3] = var16.method2161(28984);
                class201.field2862[4] = var16.method2220((byte) 83);
            } else {
                if (var36 != 129) {
                    var16.field4777--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var16.method2192(arg0 ^ 0x3);
                    if (var38 == 0) {
                        if (arg7 >= var37) {
                            int var46 = arg8;
                            if (arg8 < 0) {
                                var46 = 0;
                            } else if (arg8 >= 104) {
                                var46 = 104;
                            }
                            int var47 = arg4;
                            int var48 = arg8 + 7;
                            int var49 = arg4 + 7;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 >= 104) {
                                var49 = 104;
                            }
                            if (arg4 < 0) {
                                var47 = 0;
                            } else if (arg4 >= 104) {
                                var47 = 104;
                            }
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= 104) {
                                var48 = 104;
                            }
                            while (var46 < var48) {
                                while (var49 > var47) {
                                    class307.field4599[arg1][var46][var47] = 0;
                                    var47++;
                                }
                                var46++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var39 = 0; var39 < 64; var39 += 4) {
                            for (int var40 = 0; var40 < 64; var40 += 4) {
                                byte var41 = var16.method2192(3);
                                if (var37 <= arg7) {
                                    for (int var42 = var39; var42 < (var39 + 4); var42++) {
                                        for (int var43 = var40; var43 < var40 + 4; var43++) {
                                            if (var11 <= var42 && (var11 + 8) > var42 && var43 >= var19 && var19 < (var19 + 8)) {
                                                int var44 = arg8 + class189.method1323((byte) 36, arg3, var43 & 0x7, var42 & 0x7);
                                                int var45 = arg4 + class146.method1054(var42 & 0x7, arg3, -2, var43 & 0x7);
                                                if (var44 >= 0 && var44 < 104 && var45 >= 0 && var45 < 104) {
                                                    class307.field4599[arg1][var44][var45] = var41;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 == 2) {
                    }
                }
            }
        }
        if (class67.field908 && !arg6) {
            class85 var50 = null;
            while (true) {
                while (var16.field4798.length > var16.field4777) {
                    int var51 = var16.method2219(16448);
                    if (var51 == 0) {
                        var50 = new class85(var16);
                    } else if (var51 == 1) {
                        int var52 = var16.method2219(arg0 ^ 0x4040);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class270 var54 = new class270(var16);
                                if (var54.field4019 == 31) {
                                    class141 var55 = class243.method1672(var16.method2220((byte) 105), 31);
                                    var54.method1856(arg0 - 1870576501, var55.field1934, var55.field1925, var55.field1932, var55.field1923);
                                }
                                int var56 = var54.field4025 >> 7;
                                int var57 = var54.field4008 >> 7;
                                if (var54.field4010 == arg7 && var56 >= var11 && (var11 + 8) > var56 && var57 >= var19 && var57 < (var19 + 8)) {
                                    int var58 = class316.method2211(var54.field4025 & 0x3FF, arg3, 1023, var54.field4008 & 0x3FF) + (arg8 << 7);
                                    int var59 = (arg4 << 7) + class157.method1136(arg3, var54.field4025 & 0x3FF, 5673, var54.field4008 & 0x3FF);
                                    var54.field4025 = var58;
                                    int var60 = var54.field4025 >> 7;
                                    var54.field4008 = var59;
                                    int var61 = var54.field4008 >> 7;
                                    if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                                        var54.field4029 = (class240.field3406[1][var60][var61] & 0x2) != 0;
                                        var54.field4000 = class333.field5020[var54.field4010][var60][var61] - var54.field4000;
                                        class147.method1071(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class85();
                        }
                        var50.method660(var16, -25667);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class85();
                }
                class181.field2431[arg8 >> 3][arg4 >> 3] = var50;
                break;
            }
        }
        if (!var34) {
            int var62 = arg8 + 7;
            int var63 = arg4 + 7;
            for (int var64 = arg8; var64 < var62; var64++) {
                for (int var65 = arg4; var65 < var63; var65++) {
                    class307.field4599[arg1][var64][var65] = 0;
                }
            }
        }
        return var35 ? class201.field2862 : null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)I", line = 467)
    public static final int method1172(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2249++;
        if (class207.field2985) {
            class207.field2985 = false;
            arg3 = 1000000;
        }
        class85 var5 = class181.field2431[arg0][arg2];
        int var6 = var5.field1233;
        int var7 = var5.field1226;
        if (arg4 != 0) {
            method1171(-124, -37, (class72[]) null, 119, -31, (byte[]) null, false, -71, 72, -25, 42);
        }
        float var8 = var5.field1239;
        class75 var9 = var5.field1230;
        float var10 = var5.field1220;
        int var11 = var5.field1231;
        float var12 = ((float) arg1 * 0.1F + 0.7F) * var5.field1222;
        if (!class287.field4256) {
            var11 = 0;
        }
        float var13 = var5.field1237;
        float var14 = var5.field1218;
        float var15 = var5.field1227;
        if (class106.field1428 != var6 || class44.field533 != var12 || class232.field3282 != var10 || class219.field3148 != var8 || class296.field4388 != var7 || class313.field4725 != var11 || class154.field2133 != var9 || class160.field2189 != var14 || class218.field3125 != var15 || class282.field4227 != var13) {
            class199.field2836 = class164.field2255;
            class204.field2937 = class203.field2901;
            class89.field1256 = class275.field4124;
            class166.field2270 = class243.field3478;
            class43.field502 = class53.field715;
            class230.field3261 = class179.field2407;
            class151.field2103 = class123.field1661;
            class126.field1728 = class28.field349;
            class52.field696 = class65.field860;
            class154.field2134 = class168.field2293;
            if (class153.field2113 == null || class153.field2113 == class151.field2103) {
                class153.field2113 = new class75();
            }
            class232.field3282 = var10;
            class251.field3601 = 0;
            class218.field3125 = var15;
            class282.field4227 = var13;
            class296.field4388 = var7;
            class313.field4725 = var11;
            class160.field2189 = var14;
            class219.field3148 = var8;
            class44.field533 = var12;
            class154.field2133 = var9;
            class106.field1428 = var6;
        }
        if (class251.field3601 < 65536) {
            class251.field3601 += arg3 * 250;
            if (class251.field3601 >= 65536) {
                class123.field1661 = class154.field2133;
                class65.field860 = class282.field4227;
                class275.field4124 = class219.field3148;
                class203.field2901 = class232.field3282;
                class251.field3601 = 65536;
                class53.field715 = class106.field1428;
                class28.field349 = class44.field533;
                class243.field3478 = class296.field4388;
                class164.field2255 = class160.field2189;
                class168.field2293 = class313.field4725;
                class179.field2407 = class218.field3125;
                class151.field2103 = null;
            } else {
                int var16 = class251.field3601 >> 8;
                int var17 = 65536 - class251.field3601 >> 8;
                float var18 = (float) (65536 - class251.field3601) / 65536.0F;
                float var19 = (float) class251.field3601 / 65536.0F;
                class28.field349 = class44.field533 * var19 + class126.field1728 * var18;
                class243.field3478 = ((class296.field4388 & 0xFF00) * var16 + (class166.field2270 & 0xFF00) * var17 & 0xFF0000) + ((class296.field4388 & 0xFF00FF) * var16 + (class166.field2270 & 0xFF00FF) * var17 & 0xFF00FF00) >> 8;
                class203.field2901 = class232.field3282 * var19 + class204.field2937 * var18;
                class53.field715 = ((class43.field502 & 0xFF00FF) * var17 + ((class106.field1428 & 0xFF00FF) * var16) & 0xFF00FF00) + ((class43.field502 & 0xFF00) * var17 + (class106.field1428 & 0xFF00) * var16 & 0xFF0000) >> 8;
                class275.field4124 = class89.field1256 * var18 + class219.field3148 * var19;
                class65.field860 = class52.field696 * var18 + class282.field4227 * var19;
                class168.field2293 = class313.field4725 * var16 + class154.field2134 * var17 >> 8;
                class179.field2407 = class230.field3261 * var18 + class218.field3125 * var19;
                class164.field2255 = class199.field2836 * var18 + class160.field2189 * var19;
                if (class154.field2133 != class151.field2103) {
                    if (class151.field2103 == null || class154.field2133 == null) {
                        class123.field1661 = null;
                    } else {
                        class123.field1661 = class153.field2113.method556(class151.field2103, class154.field2133, (float) class251.field3601 / 65536.0F);
                    }
                }
            }
        }
        return class243.field3478;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 597)
    public static void method1173(int arg0) {
        field2238 = null;
        field2241 = null;
        field2250 = null;
        field2244 = null;
        field2243 = null;
        int var1 = 55 % ((-arg0 - 48) / 37);
        field2248 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)V", line = 614)
    public static final void method1174(int arg0, byte arg1) {
        if (arg1 == -97) {
            class327.field4938.method720(arg0, 1088);
            class289.field4294.method720(arg0, 1088);
            field2239++;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III[I[Ljava/lang/Object;)V", line = 629)
    public static final void method1175(int arg0, int arg1, int arg2, int[] arg3, Object[] arg4) {
        int var5 = -34 % ((-arg2 - 54) / 60);
        field2247++;
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg3[var6];
        arg3[var6] = arg3[arg1];
        arg3[arg1] = var7;
        int var8 = arg0;
        Object var9 = arg4[var6];
        arg4[var6] = arg4[arg1];
        arg4[arg1] = var9;
        for (int var10 = arg0; var10 < arg1; var10++) {
            if (arg3[var10] < ((var10 & 0x1) + var7)) {
                int var11 = arg3[var10];
                arg3[var10] = arg3[var8];
                arg3[var8] = var11;
                Object var12 = arg4[var10];
                arg4[var10] = arg4[var8];
                arg4[var8++] = var12;
            }
        }
        arg3[arg1] = arg3[var8];
        arg3[var8] = var7;
        arg4[arg1] = arg4[var8];
        arg4[var8] = var9;
        method1175(arg0, var8 - 1, 53, arg3, arg4);
        method1175(var8 + 1, arg1, -117, arg3, arg4);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)Lth;", line = 696)
    public static final class143 method1176(byte arg0, int arg1, int arg2) {
        field2240++;
        int var3 = -109 / ((37 - arg0) / 48);
        class143 var4 = (class143) class121.field1628.method111(-5, (long) arg2 << 32 | (long) arg1);
        if (var4 == null) {
            var4 = new class143(arg2, arg1);
            class121.field1628.method120(var4.field2522, var4, -22851);
        }
        return var4;
    }
}
