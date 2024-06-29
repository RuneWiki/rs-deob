import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class83 extends InputStream {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Ldd;")
    public static class247 field1579 = new class247(64);

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lud;")
    public static class279 field1582 = class130.method1024("Connect-B au serveur de mise -9 jour", 255);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1581 = 2;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lud;")
    private static class279 field1589 = class130.method1024("Loading world list data", 255);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lud;")
    public static class279 field1586 = class130.method1024("Weiter", 255);

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Lud;")
    public static class279 field1588 = field1589;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lbn;")
    public static class66 field1584;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIZI)Lom;", line = 5)
    public static final class70 method722(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1587++;
        int var7 = (arg5 << 19) + (arg4 ? 65536 : 0) + (arg3 << 17) + arg0;
        long var8 = (long) arg1 * 3147483667L + (long) var7 * 3849834839L;
        class70 var10 = (class70) class301.field5356.method1336(var8, 0);
        if (arg2 != -12133) {
            return (class70) null;
        } else if (var10 == null) {
            class27.field652 = false;
            class70 var11 = class35.method313(false, arg5, arg4, (byte) -86, false, arg1, arg0, arg3);
            if (var11 != null && !class27.field652) {
                class301.field5356.method1331(var11, arg2 + 42370, var8);
            }
            return var11;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 33)
    public static void method723(int arg0) {
        field1589 = null;
        if (arg0 != -18605) {
            method723(-29);
        }
        field1586 = null;
        field1579 = null;
        field1582 = null;
        field1584 = null;
        field1588 = null;
    }

    @OriginalMember(owner = "client!ij", name = "read", descriptor = "()I", line = 48)
    public final int read() {
        class204.method1510(30000L, 1);
        field1583++;
        return -1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([[F[[F[[BI[[I[[BI[[B[[[B[[F[[B[[I)[Lvk;", line = 83)
    public static final class168[] method724(float[][] arg0, float[][] arg1, byte[][] arg2, int arg3, int[][] arg4, byte[][] arg5, int arg6, byte[][] arg7, byte[][][] arg8, float[][] arg9, byte[][] arg10, int[][] arg11) {
        class69 var12 = new class69(128);
        field1585++;
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg10[var13][var14] & 0xFF;
                int var16 = arg7[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class231 var17 = class216.method1578(var15 - 1, -125);
                    if (var17.field4046 == -1) {
                        continue;
                    }
                    class168 var18 = class60.method535(var17, var12, 1789864520);
                    byte var19 = arg2[var13][var14];
                    int[] var20 = class20.field577[var19];
                    var18.field3035 += var20.length / 2;
                    var18.field3027++;
                    if (var17.field4051 && var16 != 0) {
                        var18.field3035 += class292.field5213[var19];
                    }
                }
                if ((arg7[var13][var14] & 0xFF) != 0 || var15 != 0 && arg2[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg10[var13][var14 + 1] & 0xFF;
                    int var28 = arg10[var13][var14 - 1] & 0xFF;
                    int var29 = arg10[var13 - 1][var14] & 0xFF;
                    int var30 = arg10[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg10[var13 + 1][var14] & 0xFF;
                    int var32 = arg10[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg10[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg10[var13 + 1][var14 - 1] & 0xFF;
                    if (var30 == 0 || var15 == var30) {
                        boolean var43 = false;
                    } else {
                        class231 var35 = class216.method1578(var30 - 1, arg3 ^ 0xFFFFFF82);
                        if (var35.field4051 && var35.field4046 != -1) {
                            byte var36 = arg5[var13 - 1][var14 + 1];
                            byte var37 = arg2[var13 - 1][var14 + 1];
                            int var38 = class17.field536[(var36 + 3 & 0x3) + var37 * 4];
                            int var39 = class17.field536[(var36 + 2 & 0x3) + var37 * 4];
                            if (class323.field5654[var38][1] && class323.field5654[var39][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var41] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var32 == 0 || var15 == var32) {
                        boolean var52 = false;
                    } else {
                        class231 var44 = class216.method1578(var32 - 1, -126);
                        if (var44.field4051 && var44.field4046 != -1) {
                            byte var45 = arg2[var13 - 1][var14 - 1];
                            byte var46 = arg5[var13 - 1][var14 - 1];
                            int var47 = class17.field536[(var46 + 3 & 0x3) + var45 * 4];
                            int var48 = class17.field536[(var46 & 0x3) + var45 * 4];
                            if (class323.field5654[var48][1] && class323.field5654[var47][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var32;
                                        break;
                                    }
                                    if (var22[var50] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var34 == 0 || var15 == var34) {
                        boolean var61 = false;
                    } else {
                        class231 var53 = class216.method1578(var34 - 1, arg3 ^ 0xFFFFFF80);
                        if (var53.field4051 && var53.field4046 != -1) {
                            byte var54 = arg5[var13 + 1][var14 - 1];
                            byte var55 = arg2[var13 + 1][var14 - 1];
                            int var56 = class17.field536[(var54 & 0x3) + var55 * 4];
                            int var57 = class17.field536[(var54 + 1 & 0x3) + var55 * 4];
                            if (class323.field5654[var57][1] && class323.field5654[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var59] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var15 == var33) {
                        boolean var70 = false;
                    } else {
                        class231 var62 = class216.method1578(var33 - 1, -128);
                        if (var62.field4051 && var62.field4046 != -1) {
                            byte var63 = arg5[var13 + 1][var14 + 1];
                            byte var64 = arg2[var13 + 1][var14 + 1];
                            int var65 = class17.field536[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class17.field536[(var63 + 1 & 0x3) + var64 * 4];
                            if (class323.field5654[var65][1] && class323.field5654[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var15 != var27) {
                        class231 var71 = class216.method1578(var27 - 1, -127);
                        if (var71.field4051 && var71.field4046 != -1) {
                            var23 = class17.field536[(arg5[var13][var14 + 1] + 2 & 0x3) + arg2[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var15 != var29) {
                        class231 var73 = class216.method1578(var29 - 1, arg3 + -128);
                        if (var73.field4051 && var73.field4046 != -1) {
                            var24 = class17.field536[(arg5[var13 - 1][var14] + 3 & 0x3) + arg2[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var74] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var15 != var28) {
                        class231 var75 = class216.method1578(var28 - 1, arg3 + -128);
                        if (var75.field4051 && var75.field4046 != -1) {
                            var26 = class17.field536[arg2[var13][var14 - 1] * 4 + (arg5[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var76] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var31 != 0 && var15 != var31) {
                        class231 var77 = class216.method1578(var31 - 1, -127);
                        if (var77.field4051 && var77.field4046 != -1) {
                            var25 = class17.field536[(arg5[var13 + 1][var14] + 1 & 0x3) + arg2[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var31;
                                    break;
                                }
                                if (var22[var78] == var31) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class323.field5654[var29 == var80 ? var24 : 0];
                        boolean[] var82 = class323.field5654[var27 == var80 ? var23 : 0];
                        boolean[] var83 = class323.field5654[var31 == var80 ? var25 : 0];
                        boolean[] var84 = class323.field5654[var28 == var80 ? var26 : 0];
                        class231 var85 = class216.method1578(var80 - 1, -126);
                        class168 var86 = class60.method535(var85, var12, 1789864520);
                        var86.field3035 += 5;
                        var86.field3035 += var82.length - 2;
                        var86.field3035 += var81.length - 2;
                        var86.field3035 += var84.length - 2;
                        var86.field3035 += var83.length - 2;
                        var86.field3027++;
                    }
                }
            }
        }
        for (class168 var87 = (class168) var12.method609(-26368); var87 != null; var87 = (class168) var12.method604(2)) {
            var87.method1314();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg8[arg6][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg8[1][var88][var89] & 0x2) == 2 && arg6 > 0) {
                    var90 = arg6 - 1;
                } else {
                    var90 = arg6;
                }
                int var91 = arg10[var88][var89] & 0xFF;
                int var92 = arg7[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class231 var93 = class216.method1578(var91 - 1, -128);
                    if (var93.field4046 == -1) {
                        continue;
                    }
                    class168 var94 = class60.method535(var93, var12, 1789864520);
                    byte var95 = arg5[var88][var89];
                    byte var96 = arg2[var88][var89];
                    int var97 = class44.method376(arg11[var88][var89], var93.field4046, (byte) 41, var93.field4035);
                    int var98 = class44.method376(arg11[var88 + 1][var89], var93.field4046, (byte) 41, var93.field4035);
                    int var99 = class44.method376(arg11[var88 + 1][var89 + 1], var93.field4046, (byte) 41, var93.field4035);
                    int var100 = class44.method376(arg11[var88][var89 + 1], var93.field4046, (byte) 41, var93.field4035);
                    class262.method1873(var99, var96, var97, var92 != 0 && var93.field4051, arg1, var94, var98, var88, arg9, var100, arg0, var90, arg4, var89, var95, arg3 ^ 0xFFFFFF82);
                }
                if ((arg7[var88][var89] & 0xFF) != 0 || var91 != 0 && arg2[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = arg10[var88][var89 + 1] & 0xFF;
                    int var107 = arg10[var88 - 1][var89] & 0xFF;
                    int var108 = arg10[var88][var89 - 1] & 0xFF;
                    int var109 = 0;
                    int var110 = arg10[var88 + 1][var89] & 0xFF;
                    int var111 = arg10[var88 - 1][var89 - 1] & 0xFF;
                    int var112 = arg10[var88 - 1][var89 + 1] & 0xFF;
                    int var113 = arg10[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg10[var88 + 1][var89 + 1] & 0xFF;
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class231 var115 = class216.method1578(var112 - 1, arg3 + -131);
                        if (var115.field4051 && var115.field4046 != -1) {
                            byte var116 = arg5[var88 - 1][var89 + 1];
                            byte var117 = arg2[var88 - 1][var89 + 1];
                            int var118 = class17.field536[(var116 + 3 & 0x3) + var117 * 4];
                            int var119 = class17.field536[(var116 + 2 & 0x3) + var117 * 4];
                            if (class323.field5654[var118][1] && class323.field5654[var119][0]) {
                                var112 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var120] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class231 var121 = class216.method1578(var111 - 1, arg3 + -128);
                        if (var121.field4051 && var121.field4046 != -1) {
                            byte var122 = arg2[var88 - 1][var89 - 1];
                            byte var123 = arg5[var88 - 1][var89 - 1];
                            int var124 = class17.field536[(var123 & 0x3) + var122 * 4];
                            int var125 = class17.field536[(var123 + 3 & 0x3) + var122 * 4];
                            if (class323.field5654[var124][1] && class323.field5654[var125][0]) {
                                var111 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var111;
                                        break;
                                    }
                                    if (var102[var126] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var113 == 0 || var91 == var113) {
                        var113 = 0;
                    } else {
                        class231 var127 = class216.method1578(var113 - 1, -128);
                        if (var127.field4051 && var127.field4046 != -1) {
                            byte var128 = arg5[var88 + 1][var89 - 1];
                            byte var129 = arg2[var88 + 1][var89 - 1];
                            int var130 = class17.field536[(var128 & 0x3) + var129 * 4];
                            int var131 = class17.field536[(var128 + 1 & 0x3) + var129 * 4];
                            if (class323.field5654[var131][1] && class323.field5654[var130][0]) {
                                var113 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var132] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var114 == 0 || var91 == var114) {
                        var114 = 0;
                    } else {
                        class231 var133 = class216.method1578(var114 - 1, -125);
                        if (var133.field4051 && var133.field4046 != -1) {
                            byte var134 = arg5[var88 + 1][var89 + 1];
                            byte var135 = arg2[var88 + 1][var89 + 1];
                            int var136 = class17.field536[(var134 + 1 & 0x3) + var135 * 4];
                            int var137 = class17.field536[(var134 + 2 & 0x3) + var135 * 4];
                            if (class323.field5654[var137][1] && class323.field5654[var136][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var106 != 0 && var91 != var106) {
                        class231 var139 = class216.method1578(var106 - 1, arg3 + -130);
                        if (var139.field4051 && var139.field4046 != -1) {
                            var109 = class17.field536[(arg5[var88][var89 + 1] + 2 & 0x3) + arg2[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var106;
                                    break;
                                }
                                if (var102[var140] == var106) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class231 var141 = class216.method1578(var107 - 1, arg3 ^ 0xFFFFFF80);
                        if (var141.field4051 && var141.field4046 != -1) {
                            var103 = class17.field536[arg2[var88 - 1][var89] * 4 + (arg5[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class231 var143 = class216.method1578(var108 - 1, arg3 ^ 0xFFFFFF80);
                        if (var143.field4051 && var143.field4046 != -1) {
                            var105 = class17.field536[arg2[var88][var89 - 1] * 4 + (arg5[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var144] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class231 var145 = class216.method1578(var110 - 1, -128);
                        if (var145.field4051 && var145.field4046 != -1) {
                            var104 = class17.field536[(arg5[var88 + 1][var89] + 1 & 0x3) + arg2[var88 + 1][var89] * 4];
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
                        boolean[] var149 = class323.field5654[var106 == var148 ? var109 : 0];
                        boolean[] var150 = class323.field5654[var107 == var148 ? var103 : 0];
                        boolean[] var151 = class323.field5654[var110 == var148 ? var104 : 0];
                        boolean[] var152 = class323.field5654[var108 == var148 ? var105 : 0];
                        class231 var153 = class216.method1578(var148 - 1, -127);
                        class168 var154 = class60.method535(var153, var12, 1789864520);
                        int var155 = class44.method376(arg11[var88][var89], var153.field4046, (byte) 41, var153.field4035) << 8 | 0xFF;
                        int var156 = class44.method376(arg11[var88 + 1][var89], var153.field4046, (byte) 41, var153.field4035) << 8 | 0xFF;
                        int var157 = class44.method376(arg11[var88 + 1][var89 + 1], var153.field4046, (byte) 41, var153.field4035) << 8 | 0xFF;
                        int var158 = class44.method376(arg11[var88][var89 + 1], var153.field4046, (byte) 41, var153.field4035) << 8 | 0xFF;
                        boolean var159 = var112 != var148 && var150[0] && var149[1];
                        byte var160 = 6;
                        int var161 = var149.length + var160 - 2;
                        int var162 = var150.length + var161 - 2;
                        int var163 = var152.length + var162 - 2;
                        int var164 = var151.length + var163 - 2;
                        boolean var165 = var114 != var148 && var149[0] && var151[1];
                        boolean var166 = var111 != var148 && var152[0] && var150[1];
                        boolean var167 = var113 != var148 && var151[0] && var152[1];
                        int var168 = class166.method1297(64, 1, var88, (int[][]) null, var158, var155, true, var89, arg1, var156, 0, arg9, arg4, var157, 64, arg0, 0.0F, var154);
                        int[] var169 = new int[var164];
                        int var170 = class166.method1297(128, 1, var88, (int[][]) null, var158, var155, var159, var89, arg1, var156, 0, arg9, arg4, var157, 0, arg0, 0.0F, var154);
                        byte var171 = 0;
                        int var172 = class166.method1297(128, 1, var88, (int[][]) null, var158, var155, var165, var89, arg1, var156, 0, arg9, arg4, var157, 128, arg0, 0.0F, var154);
                        int var173 = class166.method1297(0, 1, var88, (int[][]) null, var158, var155, var166, var89, arg1, var156, 0, arg9, arg4, var157, 0, arg0, 0.0F, var154);
                        int var174 = class166.method1297(0, 1, var88, (int[][]) null, var158, var155, var167, var89, arg1, var156, 0, arg9, arg4, var157, 128, arg0, 0.0F, var154);
                        int var180 = var171 + 1;
                        var169[var171] = var168;
                        var169[var180++] = var172;
                        if (var149.length > 2) {
                            var169[var180++] = class166.method1297(128, 1, var88, (int[][]) null, var158, var155, var149[2], var89, arg1, var156, 0, arg9, arg4, var157, 64, arg0, 0.0F, var154);
                        }
                        var169[var180++] = var170;
                        if (var150.length > 2) {
                            var169[var180++] = class166.method1297(64, class13.method92(arg3, 2), var88, (int[][]) null, var158, var155, var150[2], var89, arg1, var156, 0, arg9, arg4, var157, 0, arg0, 0.0F, var154);
                        }
                        var169[var180++] = var173;
                        if (var152.length > 2) {
                            var169[var180++] = class166.method1297(0, 1, var88, (int[][]) null, var158, var155, var152[2], var89, arg1, var156, 0, arg9, arg4, var157, 64, arg0, 0.0F, var154);
                        }
                        var169[var180++] = var174;
                        if (var151.length > 2) {
                            var169[var180++] = class166.method1297(64, 1, var88, (int[][]) null, var158, var155, var151[2], var89, arg1, var156, 0, arg9, arg4, var157, 128, arg0, 0.0F, var154);
                        }
                        var169[var180++] = var172;
                        var154.method1315(var90, var88, var89, var169, (int[]) null, true);
                    }
                }
            }
        }
        class168 var175 = (class168) var12.method609(-26368);
        if (arg3 != 3) {
            method723(-114);
        }
        while (var175 != null) {
            if (var175.field3030 == 0) {
                var175.method2221(true);
            } else {
                var175.method1310();
            }
            var175 = (class168) var12.method604(2);
        }
        int var176 = var12.method608(false);
        long[] var177 = new long[var176];
        class168[] var178 = new class168[var176];
        var12.method611(arg3 ^ 0x7D, var178);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field5539;
        }
        class110.method905(var177, (byte) -127, var178);
        return var178;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)I", line = 1024)
    public static final int method725(int arg0) {
        field1580++;
        if (class62.field1274 == null) {
            return -1;
        }
        while (class62.field1274.field2429 > class139.field2512) {
            if (class62.field1274.method1045(class139.field2512, 0)) {
                return class139.field2512++;
            }
            class139.field2512++;
        }
        int var1 = 75 % ((arg0 - 12) / 32);
        return -1;
    }
}
