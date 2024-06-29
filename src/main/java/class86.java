import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class86 extends class240 {

    @OriginalMember(owner = "client!th", name = "S", descriptor = "[[I")
    public static int[][] field1321 = new int[104][104];

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Lel;")
    public class119 field1320;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Loc;")
    public class144 field1296;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Lte;")
    public class295 field1318;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Lec;")
    public class39 field1310;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII[I)V", line = 4)
    public static final void method614(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field1300++;
        arg3--;
        if (arg1 != -24891) {
            field1308 = 92;
        }
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg4[var7] = arg0;
            int var8 = var7 + 1;
            arg4[var8] = arg0;
            int var9 = var8 + 1;
            arg4[var9] = arg0;
            int var10 = var9 + 1;
            arg4[var10] = arg0;
            int var11 = var10 + 1;
            arg4[var11] = arg0;
            int var12 = var11 + 1;
            arg4[var12] = arg0;
            int var13 = var12 + 1;
            arg4[var13] = arg0;
            arg3 = var13 + 1;
            arg4[arg3] = arg0;
        }
        while (var6 > arg3) {
            arg3++;
            arg4[arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(BI)I", line = 33)
    public static final int method615(byte arg0, int arg1) {
        field1298++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        int var3 = -97 / ((-arg0 - 12) / 33);
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)I", line = 87)
    public static final int method616(int arg0, int arg1, int arg2, int arg3) {
        field1323++;
        int var4 = 32 % ((-arg1 - 41) / 63);
        int var5 = class174.field2740[class146.method1124(arg3, arg0)];
        if (arg2 > 0) {
            int var6 = class174.field2734.method1471((byte) 126, arg2 & 0xFFFF);
            if (var6 != 0) {
                int var7;
                if (arg0 < 0) {
                    var7 = 0;
                } else if (arg0 > 127) {
                    var7 = 16777215;
                } else {
                    var7 = arg0 * 131586;
                }
                if (var6 == 256) {
                    var5 = var7;
                } else {
                    int var8 = 256 - var6;
                    var5 = ((var5 & 0xFF00) * var8 + (var7 & 0xFF00) * var6 & 0xFF0000) + ((var5 & 0xFF00FF) * var8 + (var7 & 0xFF00FF) * var6 & 0xFF00FF00) >> 8;
                }
            }
            int var10 = class174.field2734.method1481(arg2 & 0xFFFF, -23794);
            if (var10 != 0) {
                var10 += 256;
                int var11 = (var5 >> 16 & 0xFF) * var10;
                int var12 = (var5 & 0xFF) * var10;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (var5 >> 8 & 0xFF) * var10;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                var5 = (var12 >> 8) + (((var11 & 0x900FF00) << 8) + (var13 & 0xFF00));
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ[[FI[[IBI[[FBIIILdb;BI[[F)V", line = 160)
    public static final void method617(int arg0, boolean arg1, float[][] arg2, int arg3, int[][] arg4, byte arg5, int arg6, float[][] arg7, byte arg8, int arg9, int arg10, int arg11, class186 arg12, byte arg13, int arg14, float[][] arg15) {
        field1305++;
        int var16 = (arg10 << 8) + 255;
        int var17 = (arg3 << 8) + 255;
        int var18 = (arg6 << 8) + 255;
        int var19 = (arg11 << 8) + 255;
        if (arg8 <= 4) {
            method624(false);
        }
        int[] var20 = class307.field4823[arg13];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class53.method392(arg7, arg14, (byte) 124, var17, var20[var23 + var23], arg4, var16, arg5, var20[var23 + var23 + 1], 0.0F, var19, arg2, var18, arg15, false, (int[][]) null, arg0, arg12);
        }
        if (arg1) {
            if (arg13 == 1) {
                var21 = new int[6];
                int var42 = class53.method392(arg7, arg14, (byte) 98, var17, 64, arg4, var16, arg5, 128, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                int var43 = class53.method392(arg7, arg14, (byte) -128, var17, 128, arg4, var16, arg5, 64, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[2] = var22[2];
                var21[5] = var22[2];
                var21[0] = var43;
                var21[3] = var42;
                var21[1] = var42;
                var21[4] = var22[0];
            } else if (arg13 == 2) {
                int var40 = class53.method392(arg7, arg14, (byte) -126, var17, 128, arg4, var16, arg5, 128, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21 = new int[6];
                int var41 = class53.method392(arg7, arg14, (byte) 85, var17, 64, arg4, var16, arg5, 0, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[0] = var22[0];
                var21[2] = var40;
                var21[1] = var41;
                var21[5] = var22[0];
                var21[4] = var22[1];
                var21[3] = var40;
            } else if (arg13 == 3) {
                var21 = new int[6];
                int var38 = class53.method392(arg7, arg14, (byte) 25, var17, 0, arg4, var16, arg5, 128, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                int var39 = class53.method392(arg7, arg14, (byte) 24, var17, 64, arg4, var16, arg5, 0, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[0] = var22[2];
                var21[3] = var38;
                var21[2] = var38;
                var21[1] = var22[1];
                var21[4] = var39;
                var21[5] = var22[2];
            } else if (arg13 == 4) {
                var21 = new int[3];
                int var25 = class53.method392(arg7, arg14, (byte) -128, var17, 0, arg4, var16, arg5, 128, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[0] = var22[3];
                var21[1] = var25;
                var21[2] = var22[0];
            } else if (arg13 == 5) {
                var21 = new int[3];
                int var37 = class53.method392(arg7, arg14, (byte) -126, var17, 128, arg4, var16, arg5, 128, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[0] = var22[2];
                var21[2] = var22[3];
                var21[1] = var37;
            } else if (arg13 == 6) {
                var21 = new int[6];
                int var26 = class53.method392(arg7, arg14, (byte) -126, var17, 128, arg4, var16, arg5, 0, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                int var27 = class53.method392(arg7, arg14, (byte) 84, var17, 128, arg4, var16, arg5, 128, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[0] = var22[3];
                var21[2] = var27;
                var21[1] = var26;
                var21[3] = var27;
                var21[4] = var22[0];
                var21[5] = var22[3];
            } else if (arg13 == 7) {
                var21 = new int[6];
                int var35 = class53.method392(arg7, arg14, (byte) 77, var17, 0, arg4, var16, arg5, 128, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                int var36 = class53.method392(arg7, arg14, (byte) -125, var17, 128, arg4, var16, arg5, 0, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[3] = var35;
                var21[2] = var35;
                var21[0] = var22[1];
                var21[4] = var22[2];
                var21[1] = var36;
                var21[5] = var22[1];
            } else if (arg13 == 8) {
                var21 = new int[3];
                int var28 = class53.method392(arg7, arg14, (byte) -127, var17, 0, arg4, var16, arg5, 0, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[0] = var22[3];
                var21[2] = var22[4];
                var21[1] = var28;
            } else if (arg13 == 9) {
                int var29 = class53.method392(arg7, arg14, (byte) 83, var17, 128, arg4, var16, arg5, 64, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                int var30 = class53.method392(arg7, arg14, (byte) -126, var17, 96, arg4, var16, arg5, 32, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21 = new int[15];
                int var31 = class53.method392(arg7, arg14, (byte) -20, var17, 64, arg4, var16, arg5, 0, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[12] = var30;
                var21[2] = var22[4];
                var21[3] = var30;
                var21[10] = var22[2];
                var21[1] = var29;
                var21[4] = var22[4];
                var21[13] = var22[1];
                var21[14] = var31;
                var21[6] = var30;
                var21[8] = var22[2];
                var21[5] = var22[3];
                var21[11] = var22[1];
                var21[0] = var30;
                var21[9] = var30;
                var21[7] = var22[3];
            } else if (arg13 == 10) {
                var21 = new int[9];
                int var32 = class53.method392(arg7, arg14, (byte) -127, var17, 0, arg4, var16, arg5, 128, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[7] = var32;
                var21[0] = var22[2];
                var21[1] = var32;
                var21[8] = var22[0];
                var21[4] = var32;
                var21[5] = var22[4];
                var21[6] = var22[4];
                var21[2] = var22[3];
                var21[3] = var22[3];
            } else if (arg13 == 11) {
                int var33 = class53.method392(arg7, arg14, (byte) 22, var17, 0, arg4, var16, arg5, 64, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21 = new int[12];
                int var34 = class53.method392(arg7, arg14, (byte) -126, var17, 128, arg4, var16, arg5, 64, 0.0F, var19, arg2, var18, arg15, true, (int[][]) null, arg0, arg12);
                var21[1] = var33;
                var21[10] = var22[1];
                var21[11] = var34;
                var21[0] = var22[3];
                var21[3] = var22[3];
                var21[2] = var22[0];
                var21[4] = var22[2];
                var21[9] = var22[2];
                var21[8] = var33;
                var21[6] = var22[2];
                var21[5] = var33;
                var21[7] = var34;
            }
        }
        arg12.method1395(arg9, arg14, arg0, var22, var21, false);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILja;)V", line = 447)
    public static final void method618(int arg0, class64 arg1) {
        class64.field1049 = arg1;
        class328.field5077 = class64.field1049.method465(arg0, arg0 - 16);
        field1309++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 472)
    public static final void method619(int arg0, int arg1) {
        field1311++;
        if (arg0 >= 0 && class145.field2268.length > arg0) {
            class145.field2268[arg0] = !class145.field2268[arg0];
            if (arg1 != -14463) {
                field1294 = 46;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 492)
    public static final void method620(byte arg0) {
        field1313++;
        if (class51.field813 == 211) {
            int var1 = class267.field4132.method731(false);
            int var2 = class267.field4132.method746(-13551);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class63.field1000[var3];
            int var6 = class267.field4132.method769(-128);
            int var7 = (var6 >> 4 & 0x7) + class180.field2884;
            int var8 = class310.field4884 + (var6 & 0x7);
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class152.method1166(30194, -1, var3, class41.field734, var5, var4, var1, 0, var7, var8);
            }
            return;
        }
        if (class51.field813 == 230) {
            int var9 = class267.field4132.method741(arg0 + 60);
            int var10 = var9 & 0x3;
            int var11 = class267.field4132.method733(true);
            byte var12 = class267.field4132.method734(false);
            int var13 = var9 >> 2;
            int var14 = class267.field4132.method731(false);
            byte var15 = class267.field4132.method734(false);
            byte var16 = class267.field4132.method777((byte) -90);
            byte var17 = class267.field4132.method727((byte) 125);
            int var18 = class267.field4132.method769(-128);
            int var19 = ((var18 & 0x76) >> 4) + class180.field2884;
            int var20 = (var18 & 0x7) + class310.field4884;
            int var21 = class267.field4132.method782(false);
            int var22 = class267.field4132.method766(true);
            if (!class265.field4126) {
                class205.method1498(var22, var20, var14, 0, var15, var16, var12, var11, var19, var13, var17, var21, var10);
            }
        }
        if (class51.field813 == 40) {
            int var145 = class267.field4132.method724(-1);
            int var146 = class267.field4132.method769(-128);
            int var147 = ((var146 & 0x75) >> 4) + class180.field2884;
            if (var145 == 65535) {
                var145 = -1;
            }
            int var148 = (var146 & 0x7) + class310.field4884;
            int var149 = class267.field4132.method741(116);
            int var150 = var149 >> 2;
            int var151 = var149 & 0x3;
            int var152 = class63.field1000[var150];
            class251.method1774(var145, var148, var151, var147, 0, var152, var150, class41.field734);
        } else if (class51.field813 == 120) {
            int var23 = class267.field4132.method731(false);
            int var24 = class267.field4132.method759(4087);
            int var25 = class180.field2884 + (var24 >> 4 & 0x7);
            int var26 = (var24 & 0x7) + class310.field4884;
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                class204 var27 = class261.field4050[class41.field734][var25][var26];
                if (var27 != null) {
                    for (class71 var28 = (class71) var27.method1490(200); var28 != null; var28 = (class71) var27.method1487((byte) 117)) {
                        if ((var23 & 0x7FFF) == var28.field1120.field1874) {
                            var28.method1701(-111);
                            break;
                        }
                    }
                    if (var27.method1490(200) == null) {
                        class261.field4050[class41.field734][var25][var26] = null;
                    }
                    class79.method580(var25, (byte) -82, var26);
                }
            }
        } else if (class51.field813 == 2) {
            int var127 = class267.field4132.method741(29);
            int var128 = (var127 & 0xF) + class310.field4884 * 2;
            int var129 = ((var127 & 0xF2) >> 4) + class180.field2884 * 2;
            int var130 = class267.field4132.method727((byte) 117) + var129;
            int var131 = var128 + class267.field4132.method727((byte) 127);
            int var132 = class267.field4132.method780(-17432);
            int var133 = class267.field4132.method731(false);
            int var134 = class267.field4132.method741(arg0 ^ 0xFFFFFFC8) * 4;
            int var135 = class267.field4132.method741(65) * 4;
            int var136 = class267.field4132.method731(false);
            int var137 = class267.field4132.method731(false);
            int var138 = class267.field4132.method741(31);
            if (var138 == 255) {
                var138 = -1;
            }
            int var139 = class267.field4132.method741(arg0 + 120);
            if (var129 >= 0 && var128 >= 0 && var129 < 208 && var128 < 208 && var130 >= 0 && var131 >= 0 && var130 < 208 && var131 < 208 && var133 != 65535) {
                int var140 = var131 * 64;
                int var141 = var130 * 64;
                int var142 = var128 * 64;
                int var143 = var129 * 64;
                class294 var144 = new class294(var133, class41.field734, var143, var142, class48.method374(var142, var143, arg0 + 110, class41.field734) - var134, class205.field3252 + var136, var137 + class205.field3252, var138, var139, var132, var135);
                var144.method2068(var141, var140, class48.method374(var140, var141, 124, class41.field734) - var135, false, class205.field3252 + var136);
                class151.field2427.method1493(-92, new class137(var144));
            }
        } else if (class51.field813 == 134) {
            int var29 = class267.field4132.method741(110);
            int var30 = (var29 & 0x7) + class310.field4884;
            int var31 = ((var29 & 0x79) >> 4) + class180.field2884;
            int var32 = class267.field4132.method731(false);
            int var33 = class267.field4132.method741(14);
            int var34 = class267.field4132.method731(false);
            if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104) {
                int var35 = var31 * 128 + 64;
                int var36 = var30 * 128 + 64;
                class85 var37 = new class85(var32, class41.field734, var35, var36, class48.method374(var36, var35, 92, class41.field734) - var33, var34, class205.field3252);
                class289.field4411.method1493(-97, new class162(var37));
            }
        } else if (class51.field813 == 75) {
            int var38 = class267.field4132.method731(false);
            int var39 = class267.field4132.method741(60);
            int var40 = ((var39 & 0x73) >> 4) + class180.field2884;
            int var41 = class310.field4884 + (var39 & 0x7);
            int var42 = class267.field4132.method731(false);
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                class115 var43 = new class115();
                var43.field1887 = var42;
                var43.field1874 = var38;
                if (class261.field4050[class41.field734][var40][var41] == null) {
                    class261.field4050[class41.field734][var40][var41] = new class204();
                }
                class261.field4050[class41.field734][var40][var41].method1493(-98, new class71(var43));
                class79.method580(var40, (byte) -82, var41);
            }
        } else if (class51.field813 == 156) {
            int var44 = class267.field4132.method741(10);
            int var45 = ((var44 & 0x70) >> 4) + class180.field2884;
            int var46 = (var44 & 0x7) + class310.field4884;
            int var47 = class267.field4132.method731(false);
            if (var47 == 65535) {
                var47 = -1;
            }
            int var48 = class267.field4132.method741(41);
            int var49 = var48 & 0x7;
            int var50 = var48 >> 4 & 0xF;
            int var51 = class267.field4132.method741(93);
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                int var52 = var50 + 1;
                if ((var45 - var52) <= class19.field356.field1386[0] && class19.field356.field1386[0] <= (var45 + var52) && var46 - var52 <= class19.field356.field1388[0] && var46 + var52 >= class19.field356.field1388[0] && class14.field263 != 0 && var49 > 0 && class293.field4617 < 50 && var47 != -1) {
                    class320.field4991[class293.field4617] = var47;
                    class26.field429[class293.field4617] = var49;
                    class264.field4094[class293.field4617] = var51;
                    class40.field716[class293.field4617] = null;
                    class71.field1115[class293.field4617] = (var45 << 16) + (var46 << 8) + var50;
                    class293.field4617++;
                }
            }
        } else {
            if (arg0 != -14) {
                field1294 = 66;
            }
            if (class51.field813 == 142) {
                int var118 = class267.field4132.method741(93);
                int var119 = (var118 & 0x7) + class310.field4884;
                int var120 = ((var118 & 0x76) >> 4) + class180.field2884;
                int var121 = class267.field4132.method731(false);
                int var122 = class267.field4132.method731(false);
                int var123 = class267.field4132.method731(false);
                if (var120 >= 0 && var119 >= 0 && var120 < 104 && var119 < 104) {
                    class204 var124 = class261.field4050[class41.field734][var120][var119];
                    if (var124 != null) {
                        for (class71 var125 = (class71) var124.method1490(200); var125 != null; var125 = (class71) var124.method1487((byte) 117)) {
                            class115 var126 = var125.field1120;
                            if ((var121 & 0x7FFF) == var126.field1874 && var126.field1887 == var122) {
                                var126.field1887 = var123;
                                break;
                            }
                        }
                        class79.method580(var120, (byte) -82, var119);
                    }
                }
            } else if (class51.field813 == 217) {
                int var85 = class267.field4132.method741(40);
                int var86 = ((var85 & 0xF7) >> 4) + class180.field2884 * 2;
                int var87 = (var85 & 0xF) + class310.field4884 * 2;
                int var88 = var86 + class267.field4132.method727((byte) 123);
                int var89 = class267.field4132.method727((byte) 125) + var87;
                int var90 = class267.field4132.method780(-17432);
                int var91 = class267.field4132.method780(-17432);
                int var92 = class267.field4132.method731(false);
                int var93 = class267.field4132.method727((byte) 125);
                int var94 = class267.field4132.method741(114) * 4;
                int var95 = class267.field4132.method731(false);
                int var96 = class267.field4132.method731(false);
                int var97 = class267.field4132.method741(36);
                if (var97 == 255) {
                    var97 = -1;
                }
                int var98 = class267.field4132.method741(124);
                if (var86 >= 0 && var87 >= 0 && var86 < 208 && var87 < 208 && var88 >= 0 && var89 >= 0 && var88 < 208 && var89 < 208 && var92 != 65535) {
                    int var99 = var89 * 64;
                    int var100 = var86 * 64;
                    int var101 = var87 * 64;
                    int var102 = var88 * 64;
                    if (var90 != 0) {
                        int var104;
                        class89 var106;
                        if (var90 >= 0) {
                            int var103 = var90 - 1;
                            var104 = (var103 & 0x78A2) >> 11;
                            int var105 = var103 & 0x7FF;
                            var106 = class138.field2196[var105];
                        } else {
                            int var107 = -var90 - 1;
                            int var108 = var107 & 0x7FF;
                            var104 = (var107 & 0x7B7E) >> 11;
                            if (class60.field943 == var108) {
                                var106 = class19.field356;
                            } else {
                                var106 = class82.field1228[var108];
                            }
                        }
                        if (var106 != null) {
                            class63 var109 = var106.method640(5);
                            if (var109.field1002 != null && var109.field1002[var104] != null) {
                                var93 -= var109.field1002[var104][1];
                                int var110 = var109.field1002[var104][0];
                                int var111 = var109.field1002[var104][2];
                                int var112 = class174.field2731[var106.field1443];
                                int var113 = class174.field2732[var106.field1443];
                                int var114 = var110 * var113 + var111 * var112 >> 16;
                                int var115 = var111 * var113 - var110 * var112 >> 16;
                                var101 += var115;
                                var100 += var114;
                            }
                        }
                    }
                    class294 var117 = new class294(var92, class41.field734, var100, var101, class48.method374(var101, var100, 103, class41.field734) - var93, var95 - -class205.field3252, var96 + class205.field3252, var97, var98, var91, var94);
                    var117.method2068(var102, var99, class48.method374(var99, var102, arg0 ^ 0xFFFFFFAE, class41.field734) - var94, false, class205.field3252 + var95);
                    class151.field2427.method1493(-120, new class137(var117));
                }
            } else if (class51.field813 == 109) {
                int var53 = class267.field4132.method769(-128);
                int var54 = var53 & 0x3;
                int var55 = var53 >> 2;
                int var56 = class63.field1000[var55];
                int var57 = class267.field4132.method759(arg0 + 4101);
                int var58 = ((var57 & 0x7B) >> 4) + class180.field2884;
                int var59 = (var57 & 0x7) + class310.field4884;
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    class152.method1166(30194, -1, var55, class41.field734, var56, var54, -1, 0, var58, var59);
                }
            } else if (class51.field813 == 254) {
                int var60 = class267.field4132.method724(-1);
                int var61 = class267.field4132.method782(false);
                int var62 = class267.field4132.method759(4087);
                int var63 = class310.field4884 + (var62 & 0x7);
                int var64 = ((var62 & 0x7C) >> 4) + class180.field2884;
                int var65 = class267.field4132.method766(true);
                if (var64 >= 0 && var63 >= 0 && var64 < 104 && var63 < 104 && class60.field943 != var60) {
                    class115 var66 = new class115();
                    var66.field1874 = var65;
                    var66.field1887 = var61;
                    if (class261.field4050[class41.field734][var64][var63] == null) {
                        class261.field4050[class41.field734][var64][var63] = new class204();
                    }
                    class261.field4050[class41.field734][var64][var63].method1493(-75, new class71(var66));
                    class79.method580(var64, (byte) -82, var63);
                }
            } else if (class51.field813 == 98) {
                int var67 = class267.field4132.method741(56);
                int var68 = (var67 >> 4 & 0x7) + class180.field2884;
                int var69 = class310.field4884 + (var67 & 0x7);
                int var70 = var68 + class267.field4132.method727((byte) 112);
                int var71 = class267.field4132.method727((byte) 111) + var69;
                int var72 = class267.field4132.method780(-17432);
                int var73 = class267.field4132.method731(false);
                int var74 = class267.field4132.method741(103) * 4;
                int var75 = class267.field4132.method741(72) * 4;
                int var76 = class267.field4132.method731(false);
                int var77 = class267.field4132.method731(false);
                int var78 = class267.field4132.method741(43);
                if (var78 == 255) {
                    var78 = -1;
                }
                int var79 = class267.field4132.method741(106);
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var73 != 65535) {
                    int var80 = var69 * 128 + 64;
                    int var81 = var68 * 128 + 64;
                    int var82 = var71 * 128 + 64;
                    int var83 = var70 * 128 + 64;
                    class294 var84 = new class294(var73, class41.field734, var81, var80, class48.method374(var80, var81, 116, class41.field734) - var74, var76 - -class205.field3252, class205.field3252 + var77, var78, var79, var72, var75);
                    var84.method2068(var83, var82, class48.method374(var82, var83, arg0 ^ 0xFFFFFF9B, class41.field734) - var75, false, class205.field3252 + var76);
                    class151.field2427.method1493(-78, new class137(var84));
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjava/util/Random;I)I", line = 1074)
    public static final int method621(byte arg0, Random arg1, int arg2) {
        int var3 = -80 % ((arg0 - 62) / 39);
        field1302++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class165.method1209(false, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (var5 >= var4);
            return class240.method1706(64, var5, arg2);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 1108)
    public final void method622(byte arg0) {
        this.field1318 = null;
        this.field1320 = null;
        field1315++;
        this.field1296 = null;
        this.field1310 = null;
        if (arg0 < 28) {
            method623(-15);
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V", line = 1122)
    public static final void method623(int arg0) {
        if (arg0 == -9) {
            class240.field3732.method1832((byte) -119);
            field1316++;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 1134)
    public static void method624(boolean arg0) {
        field1321 = (int[][]) null;
        if (!arg0) {
            method621((byte) 121, (Random) null, -45);
        }
    }
}
