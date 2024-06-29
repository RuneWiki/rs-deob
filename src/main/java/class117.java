import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class117 extends class290 {

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Lce;")
    public static class126 field1972 = class206.method1445(-7923, "m");

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lce;")
    public static class126 field1970 = class206.method1445(-7923, "mem=");

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
    public static int[] field1977 = new int[128];

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lce;")
    public static class126 field1979 = class206.method1445(-7923, ")3");

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Lce;")
    public static class126 field1982 = class206.method1445(-7923, "brillant1:");

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lce;")
    public static class126 field1976 = class206.method1445(-7923, ",Mcran)2titre charg-B");

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I", line = 8)
    public static final int method765(int arg0, int arg1) {
        field1983++;
        return arg0 <= 108 ? 116 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 20)
    public static final void method766(int arg0) {
        field1973++;
        if (class182.field3181 == 2) {
            if (class322.field5496 == class177.field3120 && class128.field2198 == class116.field1946) {
                class182.field3181 = 0;
                if (class39.field626 && class217.field3655[81] && class173.field3067 > 2) {
                    class300.method2016(false, class173.field3067 - 2);
                } else {
                    class300.method2016(false, class173.field3067 - 1);
                }
            }
        } else if (class53.field804 == class322.field5496 && class152.field2782 == class128.field2198) {
            class182.field3181 = 0;
            if (class39.field626 && class217.field3655[81] && class173.field3067 > 2) {
                class300.method2016(false, class173.field3067 - 2);
            } else {
                class300.method2016(false, class173.field3067 - 1);
            }
        } else {
            class116.field1946 = class152.field2782;
            class182.field3181 = 2;
            class177.field3120 = class53.field804;
        }
        if (arg0 != 8) {
            field1976 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 77)
    public static final void method767(int arg0) {
        class170.field3019.method1178(arg0 ^ 0x458D);
        field1981++;
        if (arg0 != -17863) {
            field1975 = 118;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I", line = 88)
    public static final int method768(boolean arg0) {
        field1971++;
        try {
            if (class69.field1143 == 0) {
                if (class15.field208 > (class261.method1765(16299) - 5000L)) {
                    return 0;
                }
                class82.field1327 = class161.field2907.method1092(class172.field3039, class251.field4201, arg0);
                class120.field2013 = class261.method1765(16299);
                class69.field1143 = 1;
            }
            if (class120.field2013 + 30000L < class261.method1765(16299)) {
                return class243.method1670(1000, (byte) 7);
            }
            if (class69.field1143 == 1) {
                if (class82.field1327.field965 == 2) {
                    return class243.method1670(1001, (byte) 7);
                }
                if (class82.field1327.field965 != 1) {
                    return -1;
                }
                class59.field953 = new class293((Socket) class82.field1327.field967, class161.field2907);
                class103.field1645.field2299 = 0;
                class82.field1327 = null;
                int var1 = 0;
                if (class46.field712) {
                    var1 = class24.field343;
                }
                class103.field1645.method933(-3, 148);
                class103.field1645.method947(var1, (byte) 120);
                class59.field953.method1945(class103.field1645.field2299, true, 0, class103.field1645.field2282);
                if (class118.field1993 != null) {
                    class118.field1993.method1048((byte) 79);
                }
                if (class125.field2109 != null) {
                    class125.field2109.method1048((byte) 126);
                }
                int var2 = class59.field953.method1938((byte) 41);
                if (class118.field1993 != null) {
                    class118.field1993.method1048((byte) 70);
                }
                if (class125.field2109 != null) {
                    class125.field2109.method1048((byte) 121);
                }
                if (var2 != 0) {
                    return class243.method1670(var2, (byte) 7);
                }
                class69.field1143 = 2;
            }
            if (!arg0) {
                return -43;
            }
            if (class69.field1143 == 2) {
                if (class59.field953.method1939((byte) 86) < 2) {
                    return -1;
                }
                class84.field1344 = class59.field953.method1938((byte) 41);
                class84.field1344 <<= 0x8;
                class84.field1344 += class59.field953.method1938((byte) 41);
                class195.field3338 = new byte[class84.field1344];
                class36.field529 = 0;
                class69.field1143 = 3;
            }
            if (class69.field1143 != 3) {
                return -1;
            }
            int var3 = class59.field953.method1939((byte) 86);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class84.field1344 - class36.field529)) {
                var3 = class84.field1344 - class36.field529;
            }
            class59.field953.method1935(class36.field529, class195.field3338, var3, -1);
            class36.field529 += var3;
            if (class84.field1344 > class36.field529) {
                return -1;
            } else if (class224.method1533(255, class195.field3338)) {
                int var4 = 0;
                class140.field2552 = new class88[class28.field393];
                for (int var5 = class12.field167; var5 <= class23.field315; var5++) {
                    class88 var6 = class122.method799((byte) 111, var5);
                    if (var6 != null) {
                        class140.field2552[var4++] = var6;
                    }
                }
                class59.field953.method1941((byte) 75);
                class103.field1651 = 0;
                class195.field3338 = null;
                class69.field1143 = 0;
                class59.field953 = null;
                class15.field208 = class261.method1765(16299);
                return 0;
            } else {
                return class243.method1670(1002, (byte) 7);
            }
        } catch (IOException var8) {
            return class243.method1670(1003, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIBIIIII)V", line = 222)
    public static final void method769(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1978++;
        if (class56.field846) {
            int var8 = arg4 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = class194.field3307 + ((class255.field4286 - class194.field3307) * var8 / 100);
            arg6 = arg6 * var9 >> 8;
        }
        int var10 = 2048 - arg5 & 0x7FF;
        int var11 = 2048 - arg1 & 0x7FF;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg6;
        if (var11 != 0) {
            int var15 = class236.field3985[var11];
            int var16 = class236.field3971[var11];
            var13 = -arg6 * var15 >> 16;
            var14 = arg6 * var16 >> 16;
        }
        if (var10 != 0) {
            int var17 = class236.field3985[var10];
            var12 = var14 * var17 >> 16;
            int var18 = class236.field3971[var10];
            var14 = var14 * var18 >> 16;
        }
        class102.field1640 = arg1;
        class152.field2780 = arg7 - var12;
        class223.field3755 = arg0 - var14;
        if (arg2 < 7) {
            field1977 = (int[]) null;
        }
        class29.field404 = arg5;
        class143.field2600 = arg3 - var13;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V", line = 294)
    public static void method770(int arg0) {
        field1979 = null;
        field1982 = null;
        field1970 = null;
        field1977 = null;
        field1972 = null;
        if (arg0 != 20429) {
            method766(51);
        }
        field1976 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([[I[[B[[B[[BI[[B[[FI[[[B[[F[[F[[I)[Lbi;", line = 317)
    public static final class201[] method771(int[][] arg0, byte[][] arg1, byte[][] arg2, byte[][] arg3, int arg4, byte[][] arg5, float[][] arg6, int arg7, byte[][][] arg8, float[][] arg9, float[][] arg10, int[][] arg11) {
        class237 var12 = new class237(128);
        field1974++;
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg5[var13][var14] & 0xFF;
                int var16 = arg1[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class94 var17 = class111.method734(var16 - 1, false);
                    if (var17.field1468 == -1) {
                        continue;
                    }
                    class201 var18 = class29.method141(var12, var17, true);
                    byte var19 = arg3[var13][var14];
                    int[] var20 = class40.field633[var19];
                    var18.field3416 += var20.length / 2;
                    var18.field3422++;
                    if (var17.field1461 && var15 != 0) {
                        var18.field3416 += class8.field99[var19];
                    }
                }
                if ((arg5[var13][var14] & 0xFF) != 0 || var16 != 0 && arg3[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg1[var13 - 1][var14] & 0xFF;
                    int var28 = arg1[var13][var14 + 1] & 0xFF;
                    int var29 = arg1[var13][var14 - 1] & 0xFF;
                    int var30 = arg1[var13 - 1][var14 - 1] & 0xFF;
                    int var31 = arg1[var13 + 1][var14 + 1] & 0xFF;
                    int var32 = arg1[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg1[var13 + 1][var14] & 0xFF;
                    int var34 = arg1[var13 - 1][var14 + 1] & 0xFF;
                    if (var34 == 0 || var16 == var34) {
                        boolean var43 = false;
                    } else {
                        class94 var35 = class111.method734(var34 - 1, false);
                        if (var35.field1461 && var35.field1468 != -1) {
                            byte var36 = arg2[var13 - 1][var14 + 1];
                            byte var37 = arg3[var13 - 1][var14 + 1];
                            int var38 = class186.field3212[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class186.field3212[var37 * 4 + (var36 + 3 & 0x3)];
                            if (class218.field3656[var39][1] && class218.field3656[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var41] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var30 == 0 || var16 == var30) {
                        boolean var52 = false;
                    } else {
                        class94 var44 = class111.method734(var30 - 1, false);
                        if (var44.field1461 && var44.field1468 != -1) {
                            byte var45 = arg2[var13 - 1][var14 - 1];
                            byte var46 = arg3[var13 - 1][var14 - 1];
                            int var47 = class186.field3212[(var45 & 0x3) + var46 * 4];
                            int var48 = class186.field3212[(var45 + 3 & 0x3) + var46 * 4];
                            if (class218.field3656[var47][1] && class218.field3656[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var50] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var61 = false;
                    } else {
                        class94 var53 = class111.method734(var32 - 1, false);
                        if (var53.field1461 && var53.field1468 != -1) {
                            byte var54 = arg3[var13 + 1][var14 - 1];
                            byte var55 = arg2[var13 + 1][var14 - 1];
                            int var56 = class186.field3212[var54 * 4 + (var55 & 0x3)];
                            int var57 = class186.field3212[(var55 + 1 & 0x3) + var54 * 4];
                            if (class218.field3656[var57][1] && class218.field3656[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var59] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var31 == 0 || var16 == var31) {
                        boolean var70 = false;
                    } else {
                        class94 var62 = class111.method734(var31 - 1, false);
                        if (var62.field1461 && var62.field1468 != -1) {
                            byte var63 = arg3[var13 + 1][var14 + 1];
                            byte var64 = arg2[var13 + 1][var14 + 1];
                            int var65 = class186.field3212[(var64 + 1 & 0x3) + var63 * 4];
                            int var66 = class186.field3212[(var64 + 2 & 0x3) + var63 * 4];
                            if (class218.field3656[var66][1] && class218.field3656[var65][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var68] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class94 var71 = class111.method734(var28 - 1, false);
                        if (var71.field1461 && var71.field1468 != -1) {
                            var24 = class186.field3212[(arg2[var13][var14 + 1] + 2 & 0x3) + arg3[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var72] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class94 var73 = class111.method734(var27 - 1, false);
                        if (var73.field1461 && var73.field1468 != -1) {
                            var23 = class186.field3212[(arg2[var13 - 1][var14] + 3 & 0x3) + arg3[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var74] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class94 var75 = class111.method734(var29 - 1, false);
                        if (var75.field1461 && var75.field1468 != -1) {
                            var26 = class186.field3212[arg3[var13][var14 - 1] * 4 + (arg2[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var33 != 0 && var16 != var33) {
                        class94 var77 = class111.method734(var33 - 1, false);
                        if (var77.field1461 && var77.field1468 != -1) {
                            var25 = class186.field3212[arg3[var13 + 1][var14] * 4 + (arg2[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var33;
                                    break;
                                }
                                if (var22[var78] == var33) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class218.field3656[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class218.field3656[var29 == var80 ? var26 : 0];
                        boolean[] var83 = class218.field3656[var28 == var80 ? var24 : 0];
                        boolean[] var84 = class218.field3656[var33 == var80 ? var25 : 0];
                        class94 var85 = class111.method734(var80 - 1, false);
                        class201 var86 = class29.method141(var12, var85, true);
                        var86.field3416 += 5;
                        var86.field3416 += var83.length - 2;
                        var86.field3416 += var81.length - 2;
                        var86.field3416 += var82.length - 2;
                        var86.field3416 += var84.length - 2;
                        var86.field3422++;
                    }
                }
            }
        }
        if (arg4 >= -9) {
            return (class201[]) null;
        }
        for (class201 var87 = (class201) var12.method1630((byte) 56); var87 != null; var87 = (class201) var12.method1632(-62)) {
            var87.method1421();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg8[arg7][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg8[1][var88][var89] & 0x2) == 2 && arg7 > 0) {
                    var90 = arg7 - 1;
                } else {
                    var90 = arg7;
                }
                int var91 = arg5[var88][var89] & 0xFF;
                int var92 = arg1[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class94 var93 = class111.method734(var92 - 1, false);
                    if (var93.field1468 == -1) {
                        continue;
                    }
                    class201 var94 = class29.method141(var12, var93, true);
                    byte var95 = arg3[var88][var89];
                    byte var96 = arg2[var88][var89];
                    int var97 = class285.method1899(arg0[var88][var89], var93.field1468, (byte) -14, var93.field1476);
                    int var98 = class285.method1899(arg0[var88 + 1][var89], var93.field1468, (byte) -20, var93.field1476);
                    int var99 = class285.method1899(arg0[var88 + 1][var89 + 1], var93.field1468, (byte) 110, var93.field1476);
                    int var100 = class285.method1899(arg0[var88][var89 + 1], var93.field1468, (byte) -85, var93.field1476);
                    class132.method919(var99, var97, var98, arg9, (byte) 125, arg10, var90, var88, arg6, var100, var96, var95, var89, var91 != 0 && var93.field1461, arg11, var94);
                }
                if ((arg5[var88][var89] & 0xFF) != 0 || var92 != 0 && arg3[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg1[var88][var89 + 1] & 0xFF;
                    int var108 = arg1[var88 - 1][var89] & 0xFF;
                    int var109 = arg1[var88][var89 - 1] & 0xFF;
                    int var110 = arg1[var88 + 1][var89] & 0xFF;
                    int var111 = arg1[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg1[var88 + 1][var89 - 1] & 0xFF;
                    int var113 = arg1[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg1[var88 - 1][var89 - 1] & 0xFF;
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class94 var115 = class111.method734(var111 - 1, false);
                        if (var115.field1461 && var115.field1468 != -1) {
                            byte var116 = arg2[var88 - 1][var89 + 1];
                            byte var117 = arg3[var88 - 1][var89 + 1];
                            int var118 = class186.field3212[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class186.field3212[(var116 + 3 & 0x3) + var117 * 4];
                            if (class218.field3656[var119][1] && class218.field3656[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var111;
                                        break;
                                    }
                                    if (var102[var120] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class94 var121 = class111.method734(var114 - 1, false);
                        if (var121.field1461 && var121.field1468 != -1) {
                            byte var122 = arg3[var88 - 1][var89 - 1];
                            byte var123 = arg2[var88 - 1][var89 - 1];
                            int var124 = class186.field3212[(var123 + 3 & 0x3) + var122 * 4];
                            int var125 = class186.field3212[(var123 & 0x3) + var122 * 4];
                            if (class218.field3656[var125][1] && class218.field3656[var124][0]) {
                                var114 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var126] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class94 var127 = class111.method734(var112 - 1, false);
                        if (var127.field1461 && var127.field1468 != -1) {
                            byte var128 = arg2[var88 + 1][var89 - 1];
                            byte var129 = arg3[var88 + 1][var89 - 1];
                            int var130 = class186.field3212[var129 * 4 + (var128 & 0x3)];
                            int var131 = class186.field3212[(var128 + 1 & 0x3) + var129 * 4];
                            if (class218.field3656[var131][1] && class218.field3656[var130][0]) {
                                var112 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var132] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class94 var133 = class111.method734(var113 - 1, false);
                        if (var133.field1461 && var133.field1468 != -1) {
                            byte var134 = arg3[var88 + 1][var89 + 1];
                            byte var135 = arg2[var88 + 1][var89 + 1];
                            int var136 = class186.field3212[(var135 + 1 & 0x3) + var134 * 4];
                            int var137 = class186.field3212[(var135 + 2 & 0x3) + var134 * 4];
                            if (class218.field3656[var137][1] && class218.field3656[var136][0]) {
                                var113 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var138] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class94 var139 = class111.method734(var107 - 1, false);
                        if (var139.field1461 && var139.field1468 != -1) {
                            var103 = class186.field3212[(arg2[var88][var89 + 1] + 2 & 0x3) + arg3[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class94 var141 = class111.method734(var108 - 1, false);
                        if (var141.field1461 && var141.field1468 != -1) {
                            var104 = class186.field3212[(arg2[var88 - 1][var89] + 3 & 0x3) + arg3[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class94 var143 = class111.method734(var109 - 1, false);
                        if (var143.field1461 && var143.field1468 != -1) {
                            var105 = class186.field3212[(arg2[var88][var89 - 1] & 0x3) + arg3[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var109;
                                    break;
                                }
                                if (var102[var144] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class94 var145 = class111.method734(var110 - 1, false);
                        if (var145.field1461 && var145.field1468 != -1) {
                            var106 = class186.field3212[(arg2[var88 + 1][var89] + 1 & 0x3) + arg3[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class218.field3656[var107 == var148 ? var103 : 0];
                        boolean[] var150 = class218.field3656[var109 == var148 ? var105 : 0];
                        boolean[] var151 = class218.field3656[var108 == var148 ? var104 : 0];
                        boolean[] var152 = class218.field3656[var110 == var148 ? var106 : 0];
                        class94 var153 = class111.method734(var148 - 1, false);
                        class201 var154 = class29.method141(var12, var153, true);
                        int var155 = class285.method1899(arg0[var88][var89], var153.field1468, (byte) 90, var153.field1476) << 8 | 0xFF;
                        int var156 = class285.method1899(arg0[var88 + 1][var89], var153.field1468, (byte) -71, var153.field1476) << 8 | 0xFF;
                        int var157 = class285.method1899(arg0[var88 + 1][var89 + 1], var153.field1468, (byte) -77, var153.field1476) << 8 | 0xFF;
                        int var158 = class285.method1899(arg0[var88][var89 + 1], var153.field1468, (byte) 84, var153.field1476) << 8 | 0xFF;
                        byte var159 = 6;
                        int var160 = var149.length + var159 - 2;
                        int var161 = var151.length + var160 - 2;
                        int var162 = var150.length + var161 - 2;
                        int var163 = var152.length + var162 - 2;
                        boolean var164 = var111 != var148 && var151[0] && var149[1];
                        boolean var165 = var113 != var148 && var149[0] && var152[1];
                        boolean var166 = var114 != var148 && var150[0] && var151[1];
                        int[] var167 = new int[var163];
                        boolean var168 = var112 != var148 && var152[0] && var150[1];
                        int var169 = class190.method1360(arg6, var88, -105, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 64, var158, var155, arg9, 0, 64, true, var89);
                        byte var170 = 0;
                        int var171 = class190.method1360(arg6, var88, -112, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 128, var158, var155, arg9, 0, 0, var164, var89);
                        int var172 = class190.method1360(arg6, var88, -96, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 128, var158, var155, arg9, 0, 128, var165, var89);
                        int var173 = class190.method1360(arg6, var88, -116, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 0, var158, var155, arg9, 0, 0, var166, var89);
                        int var174 = class190.method1360(arg6, var88, -121, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 0, var158, var155, arg9, 0, 128, var168, var89);
                        int var180 = var170 + 1;
                        var167[var170] = var169;
                        var167[var180++] = var172;
                        if (var149.length > 2) {
                            var167[var180++] = class190.method1360(arg6, var88, -123, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 128, var158, var155, arg9, 0, 64, var149[2], var89);
                        }
                        var167[var180++] = var171;
                        if (var151.length > 2) {
                            var167[var180++] = class190.method1360(arg6, var88, -116, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 64, var158, var155, arg9, 0, 0, var151[2], var89);
                        }
                        var167[var180++] = var173;
                        if (var150.length > 2) {
                            var167[var180++] = class190.method1360(arg6, var88, -103, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 0, var158, var155, arg9, 0, 64, var150[2], var89);
                        }
                        var167[var180++] = var174;
                        if (var152.length > 2) {
                            var167[var180++] = class190.method1360(arg6, var88, -96, var156, var157, 0.0F, (int[][]) null, arg11, arg10, var154, 64, var158, var155, arg9, 0, 128, var152[2], var89);
                        }
                        var167[var180++] = var172;
                        var154.method1420(var90, var88, var89, var167, (int[]) null, true);
                    }
                }
            }
        }
        for (class201 var175 = (class201) var12.method1630((byte) 56); var175 != null; var175 = (class201) var12.method1632(-109)) {
            if (var175.field3438 == 0) {
                var175.method499((byte) 64);
            } else {
                var175.method1417();
            }
        }
        int var176 = var12.method1635((byte) 51);
        class201[] var177 = new class201[var176];
        var12.method1628(var177, 103);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field1117;
        }
        class8.method44(var177, false, var178);
        return var177;
    }
}
