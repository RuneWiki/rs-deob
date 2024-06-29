import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class72 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    private int field955 = 4;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field964 = 4;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    private int field962 = 0;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    private int field960 = 4;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "[S")
    private short[] field961 = new short[512];

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    private int field967 = 4;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field957 = " has logged out.";

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Lcc;")
    public static class327 field963 = new class327(64);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lfh;")
    public static class140 field959;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "[S")
    private short[] field968;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBII)V", line = 11)
    public final void method532(int arg0, byte arg1, int arg2, int arg3) {
        field956++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg2; var9++) {
            var8[var9] = (var9 << 12) / arg2;
        }
        int var10 = 0;
        if (arg1 < 88) {
            this.field967 = -10;
        }
        while (arg3 > var10) {
            var6[var10] = (var10 << 12) / arg3;
            var10++;
        }
        this.method534(255);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field964; var14++) {
                        int var15 = this.field968[var14] << 12;
                        int var16 = var6[var11] * var15 >> 12;
                        int var17 = this.field955 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field955 * var16;
                        int var20 = this.field967 * var18;
                        int var21 = this.field967 * var15 >> 12;
                        int var22 = var20 >> 12;
                        int var23 = var8[var12] * var15 >> 12;
                        int var24 = var20 & 0xFFF;
                        int var25 = this.field960 * var23;
                        int var26 = this.field960 * var15 >> 12;
                        int var27 = class360.field5618[var24];
                        int var28 = var22 + 1;
                        int var29 = var25 >> 12;
                        int var30 = var29 + 1;
                        int var31 = var24 - 4096;
                        int var32 = var25 & 0xFFF;
                        int var33;
                        if (var21 > var28) {
                            var33 = var28 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var22 & 0xFF;
                        int var35 = class360.field5618[var32];
                        int var36;
                        if (var26 > var30) {
                            var36 = var30 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var29 & 0xFF;
                        int var38 = var32 - 4096;
                        int var39 = var19 >> 12;
                        int var40 = var19 & 0xFFF;
                        int var41 = var40 - 4096;
                        int var42 = class360.field5618[var40];
                        int var43 = var39 + 1;
                        int var44;
                        if (var17 > var43) {
                            var44 = var43 & 0xFF;
                        } else {
                            var44 = 0;
                        }
                        int var45 = var39 & 0xFF;
                        short var46 = this.field961[var44];
                        short var47 = this.field961[var37 + var46];
                        short var48 = this.field961[var36 + var46];
                        short var49 = this.field961[var45];
                        short var50 = this.field961[var37 + var49];
                        short var51 = this.field961[var36 + var49];
                        int var52 = class231.method1651((byte) 102, var32, var24, this.field961[var34 + var50], var40);
                        int var53 = class231.method1651((byte) 102, var32, var31, this.field961[var33 + var50], var40);
                        int var54 = ((var53 - var52) * var27 >> 12) + var52;
                        int var55 = class231.method1651((byte) 102, var38, var24, this.field961[var34 + var51], var40);
                        int var56 = class231.method1651((byte) 102, var38, var31, this.field961[var33 + var51], var40);
                        int var57 = var55 + ((var56 - var55) * var27 >> 12);
                        int var58 = ((var57 - var54) * var35 >> 12) + var54;
                        int var59 = class231.method1651((byte) 102, var32, var24, this.field961[var34 + var47], var41);
                        int var60 = class231.method1651((byte) 102, var32, var31, this.field961[var33 + var47], var41);
                        int var61 = var59 + ((var60 - var59) * var27 >> 12);
                        int var62 = class231.method1651((byte) 102, var38, var24, this.field961[var34 + var48], var41);
                        int var63 = class231.method1651((byte) 102, var38, var31, this.field961[var33 + var48], var41);
                        int var64 = ((var63 - var62) * var27 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var35 >> 12);
                        this.method536(var14, var58 + ((var65 - var58) * var42 >> 12), (byte) -24);
                    }
                    this.method531((byte) -90);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 177)
    private final void method533(boolean arg0) {
        if (!arg0) {
            this.field961 = (short[]) null;
        }
        Random var2 = new Random((long) this.field962);
        field954++;
        for (int var3 = 0; var3 < 255; var3++) {
            this.field961[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class294.method2011(var2, var5, 3);
            short var7 = this.field961[var6];
            this.field961[var6] = this.field961[var5];
            this.field961[var5] = this.field961[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 222)
    private final void method535(int arg0) {
        field965++;
        this.field968 = new short[this.field964];
        if (arg0 != -15508) {
            this.field967 = -110;
        }
        for (int var2 = 0; var2 < this.field964; var2++) {
            this.field968[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)I", line = 253)
    public static final int method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field953++;
        int var7 = arg4 & 0x3;
        if (~(arg2 & 0x1) == arg5) {
            int var8 = arg0;
            arg0 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 + 1 - arg3 - arg0;
        } else {
            return 1 + 7 - arg6 - arg1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIII)V", line = 318)
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field964 = arg1;
        this.field967 = arg2;
        this.field960 = arg3;
        this.field962 = arg0;
        this.field955 = arg4;
        this.method535(-15508);
        this.method533(true);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 297)
    public static void method538(int arg0) {
        field963 = null;
        if (arg0 == 0) {
            field959 = null;
            field957 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([[[BB[[B[[I[[FI[[B[[B[[I[[B[[F[[F)[Lih;", line = 333)
    public static final class70[] method539(byte[][][] arg0, byte arg1, byte[][] arg2, int[][] arg3, float[][] arg4, int arg5, byte[][] arg6, byte[][] arg7, int[][] arg8, byte[][] arg9, float[][] arg10, float[][] arg11) {
        field958++;
        class329 var12 = new class329(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg9[var13][var14] & 0xFF;
                int var16 = arg2[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class216 var17 = class311.method2165((byte) -127, var16 - 1);
                    if (var17.field3050 == -1) {
                        continue;
                    }
                    class70 var18 = class160.method1220(var12, var17, (byte) 118);
                    byte var19 = arg6[var13][var14];
                    int[] var20 = class33.field411[var19];
                    var18.field900 += var20.length / 2;
                    var18.field912++;
                    if (var17.field3049 && var15 != 0) {
                        var18.field900 += class288.field4162[var19];
                    }
                }
                if ((arg9[var13][var14] & 0xFF) != 0 || var16 != 0 && arg6[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg2[var13][var14 + 1] & 0xFF;
                    int var28 = arg2[var13 - 1][var14] & 0xFF;
                    int var29 = arg2[var13][var14 - 1] & 0xFF;
                    int var30 = arg2[var13 + 1][var14] & 0xFF;
                    int var31 = arg2[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg2[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg2[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg2[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class216 var35 = class311.method2165((byte) -128, var31 - 1);
                        if (var35.field3049 && var35.field3050 != -1) {
                            byte var36 = arg6[var13 - 1][var14 + 1];
                            byte var37 = arg7[var13 - 1][var14 + 1];
                            int var38 = class146.field2044[(var37 + 2 & 0x3) + var36 * 4];
                            int var39 = class146.field2044[(var37 + 3 & 0x3) + var36 * 4];
                            if (class292.field4252[var39][1] && class292.field4252[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var23[var21++] = var31;
                                        break;
                                    }
                                    if (var23[var41] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var52 = false;
                    } else {
                        class216 var44 = class311.method2165((byte) -126, var32 - 1);
                        if (var44.field3049 && var44.field3050 != -1) {
                            byte var45 = arg7[var13 - 1][var14 - 1];
                            byte var46 = arg6[var13 - 1][var14 - 1];
                            int var47 = class146.field2044[var46 * 4 + (var45 + 3 & 0x3)];
                            int var48 = class146.field2044[(var45 & 0x3) + var46 * 4];
                            if (class292.field4252[var48][1] && class292.field4252[var47][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var23[var21++] = var32;
                                        break;
                                    }
                                    if (var23[var50] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var61 = false;
                    } else {
                        class216 var53 = class311.method2165((byte) -128, var33 - 1);
                        if (var53.field3049 && var53.field3050 != -1) {
                            byte var54 = arg7[var13 + 1][var14 - 1];
                            byte var55 = arg6[var13 + 1][var14 - 1];
                            int var56 = class146.field2044[var55 * 4 + (var54 + 1 & 0x3)];
                            int var57 = class146.field2044[(var54 & 0x3) + var55 * 4];
                            if (class292.field4252[var56][1] && class292.field4252[var57][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var23[var21++] = var33;
                                        break;
                                    }
                                    if (var23[var59] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var34 == 0 || var16 == var34) {
                        boolean var70 = false;
                    } else {
                        class216 var62 = class311.method2165((byte) -127, var34 - 1);
                        if (var62.field3049 && var62.field3050 != -1) {
                            byte var63 = arg7[var13 + 1][var14 + 1];
                            byte var64 = arg6[var13 + 1][var14 + 1];
                            int var65 = class146.field2044[var64 * 4 + (var63 + 2 & 0x3)];
                            int var66 = class146.field2044[(var63 + 1 & 0x3) + var64 * 4];
                            if (class292.field4252[var65][1] && class292.field4252[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var23[var21++] = var34;
                                        break;
                                    }
                                    if (var23[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class216 var71 = class311.method2165((byte) -128, var27 - 1);
                        if (var71.field3049 && var71.field3050 != -1) {
                            var22 = class146.field2044[(arg7[var13][var14 + 1] + 2 & 0x3) + arg6[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var23[var21++] = var27;
                                    break;
                                }
                                if (var23[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class216 var73 = class311.method2165((byte) -126, var28 - 1);
                        if (var73.field3049 && var73.field3050 != -1) {
                            var24 = class146.field2044[(arg7[var13 - 1][var14] + 3 & 0x3) + arg6[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var23[var21++] = var28;
                                    break;
                                }
                                if (var23[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class216 var75 = class311.method2165((byte) -127, var29 - 1);
                        if (var75.field3049 && var75.field3050 != -1) {
                            var25 = class146.field2044[arg6[var13][var14 - 1] * 4 + (arg7[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var23[var21++] = var29;
                                    break;
                                }
                                if (var23[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class216 var77 = class311.method2165((byte) -128, var30 - 1);
                        if (var77.field3049 && var77.field3050 != -1) {
                            var26 = class146.field2044[arg6[var13 + 1][var14] * 4 + (arg7[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var23[var21++] = var30;
                                    break;
                                }
                                if (var23[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var23[var79];
                        boolean[] var81 = class292.field4252[var28 == var80 ? var24 : 0];
                        boolean[] var82 = class292.field4252[var29 == var80 ? var25 : 0];
                        boolean[] var83 = class292.field4252[var30 == var80 ? var26 : 0];
                        boolean[] var84 = class292.field4252[var27 == var80 ? var22 : 0];
                        class216 var85 = class311.method2165((byte) -128, var80 - 1);
                        class70 var86 = class160.method1220(var12, var85, (byte) 103);
                        var86.field900 += 5;
                        var86.field900 += var84.length - 2;
                        var86.field900 += var81.length - 2;
                        var86.field900 += var82.length - 2;
                        var86.field900 += var83.length - 2;
                        var86.field912++;
                    }
                }
            }
        }
        for (class70 var87 = (class70) var12.method2277(13292); var87 != null; var87 = (class70) var12.method2278((byte) -100)) {
            var87.method520();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg0[arg5][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg0[1][var88][var89] & 0x2) == 2 && arg5 > 0) {
                    var90 = arg5 - 1;
                } else {
                    var90 = arg5;
                }
                int var91 = arg2[var88][var89] & 0xFF;
                int var92 = arg9[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class216 var93 = class311.method2165((byte) -127, var91 - 1);
                    if (var93.field3050 == -1) {
                        continue;
                    }
                    class70 var94 = class160.method1220(var12, var93, (byte) 110);
                    byte var95 = arg6[var88][var89];
                    byte var96 = arg7[var88][var89];
                    int var97 = class179.method1316(arg3[var88][var89], var93.field3059, 13080, var93.field3050);
                    int var98 = class179.method1316(arg3[var88 + 1][var89], var93.field3059, 13080, var93.field3050);
                    int var99 = class179.method1316(arg3[var88 + 1][var89 + 1], var93.field3059, 13080, var93.field3050);
                    int var100 = class179.method1316(arg3[var88][var89 + 1], var93.field3059, 13080, var93.field3050);
                    class271.method1846(arg11, var98, (byte) 123, var90, var100, var99, arg4, var97, var95, var96, var94, var92 != 0 && var93.field3049, arg10, arg8, var88, var89);
                }
                if ((arg9[var88][var89] & 0xFF) != 0 || var91 != 0 && arg6[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg2[var88 - 1][var89] & 0xFF;
                    int var108 = arg2[var88 + 1][var89] & 0xFF;
                    int var109 = arg2[var88][var89 - 1] & 0xFF;
                    int var110 = arg2[var88][var89 + 1] & 0xFF;
                    int var111 = arg2[var88 - 1][var89 - 1] & 0xFF;
                    int var112 = arg2[var88 - 1][var89 + 1] & 0xFF;
                    int var113 = arg2[var88 + 1][var89 - 1] & 0xFF;
                    int var114 = arg2[var88 + 1][var89 + 1] & 0xFF;
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class216 var115 = class311.method2165((byte) -127, var112 - 1);
                        if (var115.field3049 && var115.field3050 != -1) {
                            byte var116 = arg7[var88 - 1][var89 + 1];
                            byte var117 = arg6[var88 - 1][var89 + 1];
                            int var118 = class146.field2044[(var116 + 3 & 0x3) + var117 * 4];
                            int var119 = class146.field2044[(var116 + 2 & 0x3) + var117 * 4];
                            if (class292.field4252[var118][1] && class292.field4252[var119][0]) {
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
                        class216 var121 = class311.method2165((byte) -127, var111 - 1);
                        if (var121.field3049 && var121.field3050 != -1) {
                            byte var122 = arg7[var88 - 1][var89 - 1];
                            byte var123 = arg6[var88 - 1][var89 - 1];
                            int var124 = class146.field2044[var123 * 4 + (var122 & 0x3)];
                            int var125 = class146.field2044[(var122 + 3 & 0x3) + var123 * 4];
                            if (class292.field4252[var124][1] && class292.field4252[var125][0]) {
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
                        class216 var127 = class311.method2165((byte) -126, var113 - 1);
                        if (var127.field3049 && var127.field3050 != -1) {
                            byte var128 = arg7[var88 + 1][var89 - 1];
                            byte var129 = arg6[var88 + 1][var89 - 1];
                            int var130 = class146.field2044[var129 * 4 + (var128 & 0x3)];
                            int var131 = class146.field2044[(var128 + 1 & 0x3) + var129 * 4];
                            if (class292.field4252[var131][1] && class292.field4252[var130][0]) {
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
                        class216 var133 = class311.method2165((byte) -126, var114 - 1);
                        if (var133.field3049 && var133.field3050 != -1) {
                            byte var134 = arg7[var88 + 1][var89 + 1];
                            byte var135 = arg6[var88 + 1][var89 + 1];
                            int var136 = class146.field2044[(var134 + 1 & 0x3) + var135 * 4];
                            int var137 = class146.field2044[(var134 + 2 & 0x3) + var135 * 4];
                            if (class292.field4252[var137][1] && class292.field4252[var136][0]) {
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
                    if (var110 != 0 && var91 != var110) {
                        class216 var139 = class311.method2165((byte) -126, var110 - 1);
                        if (var139.field3049 && var139.field3050 != -1) {
                            var103 = class146.field2044[(arg7[var88][var89 + 1] + 2 & 0x3) + arg6[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var140] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class216 var141 = class311.method2165((byte) -128, var107 - 1);
                        if (var141.field3049 && var141.field3050 != -1) {
                            var104 = class146.field2044[(arg7[var88 - 1][var89] + 3 & 0x3) + arg6[var88 - 1][var89] * 4];
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
                    if (var109 != 0 && var91 != var109) {
                        class216 var143 = class311.method2165((byte) -126, var109 - 1);
                        if (var143.field3049 && var143.field3050 != -1) {
                            var105 = class146.field2044[(arg7[var88][var89 - 1] & 0x3) + arg6[var88][var89 - 1] * 4];
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
                    if (var108 != 0 && var91 != var108) {
                        class216 var145 = class311.method2165((byte) -127, var108 - 1);
                        if (var145.field3049 && var145.field3050 != -1) {
                            var106 = class146.field2044[arg6[var88 + 1][var89] * 4 + (arg7[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var146] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class292.field4252[var110 == var148 ? var103 : 0];
                        boolean[] var150 = class292.field4252[var107 == var148 ? var104 : 0];
                        boolean[] var151 = class292.field4252[var109 == var148 ? var105 : 0];
                        boolean[] var152 = class292.field4252[var108 == var148 ? var106 : 0];
                        class216 var153 = class311.method2165((byte) -127, var148 - 1);
                        class70 var154 = class160.method1220(var12, var153, (byte) 116);
                        int var155 = class179.method1316(arg3[var88][var89], var153.field3059, 13080, var153.field3050) << 8 | 0xFF;
                        int var156 = class179.method1316(arg3[var88 + 1][var89], var153.field3059, 13080, var153.field3050) << 8 | 0xFF;
                        int var157 = class179.method1316(arg3[var88 + 1][var89 + 1], var153.field3059, 13080, var153.field3050) << 8 | 0xFF;
                        byte var158 = 6;
                        int var159 = class179.method1316(arg3[var88][var89 + 1], var153.field3059, 13080, var153.field3050) << 8 | 0xFF;
                        int var160 = var149.length + var158 - 2;
                        int var161 = var150.length + var160 - 2;
                        boolean var162 = var112 != var148 && var150[0] && var149[1];
                        int var163 = var151.length + var161 - 2;
                        int var164 = var152.length + var163 - 2;
                        boolean var165 = var113 != var148 && var152[0] && var151[1];
                        boolean var166 = var111 != var148 && var151[0] && var150[1];
                        int[] var167 = new int[var164];
                        boolean var168 = var114 != var148 && var149[0] && var152[1];
                        byte var169 = 0;
                        int var170 = class310.method2158(arg4, 64, var89, arg8, arg10, (int[][]) null, var154, var156, var88, true, 0.0F, arg11, 0, 64, 103, var159, var157, var155);
                        int var171 = class310.method2158(arg4, 128, var89, arg8, arg10, (int[][]) null, var154, var156, var88, var162, 0.0F, arg11, 0, 0, 92, var159, var157, var155);
                        int var172 = class310.method2158(arg4, 128, var89, arg8, arg10, (int[][]) null, var154, var156, var88, var168, 0.0F, arg11, 0, 128, 26, var159, var157, var155);
                        int var173 = class310.method2158(arg4, 0, var89, arg8, arg10, (int[][]) null, var154, var156, var88, var166, 0.0F, arg11, 0, 0, 80, var159, var157, var155);
                        int var174 = class310.method2158(arg4, 0, var89, arg8, arg10, (int[][]) null, var154, var156, var88, var165, 0.0F, arg11, 0, 128, 71, var159, var157, var155);
                        int var180 = var169 + 1;
                        var167[var169] = var170;
                        var167[var180++] = var172;
                        if (var149.length > 2) {
                            var167[var180++] = class310.method2158(arg4, 128, var89, arg8, arg10, (int[][]) null, var154, var156, var88, var149[2], 0.0F, arg11, 0, 64, 103, var159, var157, var155);
                        }
                        var167[var180++] = var171;
                        if (var150.length > 2) {
                            var167[var180++] = class310.method2158(arg4, 64, var89, arg8, arg10, (int[][]) null, var154, var156, var88, var150[2], 0.0F, arg11, 0, 0, 103, var159, var157, var155);
                        }
                        var167[var180++] = var173;
                        if (var151.length > 2) {
                            var167[var180++] = class310.method2158(arg4, 0, var89, arg8, arg10, (int[][]) null, var154, var156, var88, var151[2], 0.0F, arg11, 0, 64, 69, var159, var157, var155);
                        }
                        var167[var180++] = var174;
                        if (var152.length > 2) {
                            var167[var180++] = class310.method2158(arg4, 64, var89, arg8, arg10, (int[][]) null, var154, var156, var88, var152[2], 0.0F, arg11, 0, 128, 33, var159, var157, var155);
                        }
                        var167[var180++] = var172;
                        var154.method518(var90, var88, var89, var167, (int[]) null, true);
                    }
                }
            }
        }
        for (class70 var175 = (class70) var12.method2277(13292); var175 != null; var175 = (class70) var12.method2278((byte) -79)) {
            if (var175.field920 == 0) {
                var175.method179((byte) 51);
            } else {
                var175.method514();
            }
        }
        int var176 = var12.method2276(0);
        if (arg1 > -81) {
            method538(-64);
        }
        class70[] var177 = new class70[var176];
        long[] var178 = new long[var176];
        var12.method2280(0, var177);
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field304;
        }
        class161.method1230(-4391, var178, var177);
        return var177;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public abstract void method531(byte arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public abstract void method534(int arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)V")
    public abstract void method536(int arg0, int arg1, byte arg2);
}
