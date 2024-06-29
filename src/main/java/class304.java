import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class304 {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lmf;")
    public static class43 field5192 = new class43(64);

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Lcd;")
    public static class64 field5198 = class44.method335((byte) 71, "hint_headicons");

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[Lom;")
    public static class65[] field5197 = new class65[4];

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lcd;")
    private static class64 field5194 = class44.method335((byte) 71, "Started 3d Library");

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field5201 = -1;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lcd;")
    private static class64 field5206 = class44.method335((byte) 71, "wishes to trade with you)3");

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Z")
    public static boolean field5207 = false;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "Lcd;")
    public static class64 field5208 = class44.method335((byte) 71, ":chalreq:");

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Lcd;")
    public static class64 field5205 = field5206;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lcd;")
    public static class64 field5195 = field5194;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field5200 = 0;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "[I")
    public static int[] field5196;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "[[[Lbd;")
    public static class295[][][] field5203;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIB)I", line = 4)
    public static final int method2122(int arg0, int arg1, int arg2, byte arg3) {
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        field5190++;
        return arg3 > -119 ? 83 : (arg0 >> 5 << 7) + ((arg1 >> 2 << 10) + (arg2 >> 1));
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZIIIIIIIIZ)Z", line = 39)
    public static final boolean method2123(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field5187++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class121.field2178[var12][var13] = 0;
                class315.field5330[var12][var13] = 99999999;
            }
        }
        class121.field2178[arg4][arg9] = 99;
        class315.field5330[arg4][arg9] = 0;
        int var14 = arg4;
        int var15 = arg9;
        boolean var16 = false;
        int var17 = 0;
        byte var18 = 0;
        class228.field3873[var18] = arg4;
        int var32 = var18 + 1;
        class88.field1602[var18] = arg9;
        int[][] var19 = class91.field1637[class20.field364].field905;
        while (var17 != var32) {
            var14 = class228.field3873[var17];
            var15 = class88.field1602[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg3 == var14 && arg5 == var15) {
                var16 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class91.field1637[class20.field364].method409(arg0, var14, (byte) -29, arg5, arg8 - 1, 1, var15, arg3)) {
                    var16 = true;
                    break;
                }
                if (arg8 < 10 && class91.field1637[class20.field364].method422(8, arg5, var14, 1, var15, arg3, arg0, arg8 - 1)) {
                    var16 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg10 != 0 && class91.field1637[class20.field364].method421(1, arg6, var15, arg10, arg7, arg3, -1, arg5, var14)) {
                var16 = true;
                break;
            }
            int var20 = class315.field5330[var14][var15] + 1;
            if (var14 > 0 && class121.field2178[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class228.field3873[var32] = var14 - 1;
                class88.field1602[var32] = var15;
                class121.field2178[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class315.field5330[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class121.field2178[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class228.field3873[var32] = var14 + 1;
                class88.field1602[var32] = var15;
                class121.field2178[var14 + 1][var15] = 8;
                class315.field5330[var14 + 1][var15] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && class121.field2178[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class228.field3873[var32] = var14;
                class88.field1602[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class121.field2178[var14][var15 - 1] = 1;
                class315.field5330[var14][var15 - 1] = var20;
            }
            if (var15 < 103 && class121.field2178[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class228.field3873[var32] = var14;
                class88.field1602[var32] = var15 + 1;
                class121.field2178[var14][var15 + 1] = 4;
                class315.field5330[var14][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 > 0 && class121.field2178[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class228.field3873[var32] = var14 - 1;
                class88.field1602[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class121.field2178[var14 - 1][var15 - 1] = 3;
                class315.field5330[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 103 && var15 > 0 && class121.field2178[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class228.field3873[var32] = var14 + 1;
                class88.field1602[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class121.field2178[var14 + 1][var15 - 1] = 9;
                class315.field5330[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 103 && class121.field2178[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class228.field3873[var32] = var14 - 1;
                class88.field1602[var32] = var15 + 1;
                class121.field2178[var14 - 1][var15 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class315.field5330[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 103 && var15 < 103 && class121.field2178[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class228.field3873[var32] = var14 + 1;
                class88.field1602[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class121.field2178[var14 + 1][var15 + 1] = 12;
                class315.field5330[var14 + 1][var15 + 1] = var20;
            }
        }
        class223.field3804 = 0;
        if (!var16) {
            if (!arg11) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg3 - var23; var24 <= (arg3 + var23); var24++) {
                for (int var25 = arg5 - var23; var25 <= arg5 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class315.field5330[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg5 > var25) {
                            var27 = arg5 - var25;
                        } else if (var25 > arg5 - (1 - arg10)) {
                            var27 = var25 + 1 - arg5 - arg10;
                        }
                        if (arg3 > var24) {
                            var26 = arg3 - var24;
                        } else if ((arg7 + arg3 - 1) < var24) {
                            var26 = var24 + 1 - arg3 - arg7;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var22 > class315.field5330[var24][var25]) {
                            var14 = var24;
                            var15 = var25;
                            var22 = class315.field5330[var24][var25];
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg9 == var15) {
                return false;
            }
            class223.field3804 = 1;
        }
        byte var29 = 0;
        class228.field3873[var29] = var14;
        int var33 = var29 + 1;
        class88.field1602[var29] = var15;
        int var30;
        int var31 = var30 = class121.field2178[var14][var15];
        while (arg4 != var14 || arg9 != var15) {
            if (var30 != var31) {
                class228.field3873[var33] = var14;
                var30 = var31;
                class88.field1602[var33++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class121.field2178[var14][var15];
        }
        if (var33 > 0) {
            class195.method1371(arg1, var33, -60);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            if (!arg2) {
                field5198 = (class64) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)V", line = 327)
    public static final void method2124(int arg0, byte arg1, int arg2) {
        if (arg1 >= 50) {
            field5199++;
            class299 var3 = class158.method1135(arg2, -113, 12);
            var3.method2091(84);
            var3.field5153 = arg0;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBLlg;[[F[[F[[FLgj;[[II[II)V", line = 346)
    public static final void method2125(int arg0, byte arg1, class116 arg2, float[][] arg3, float[][] arg4, float[][] arg5, class220 arg6, int[][] arg7, int arg8, int[] arg9, int arg10) {
        field5189++;
        int[] var11 = new int[arg9.length / 2];
        if (arg1 > -34) {
            return;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg9[var12 + var12];
            int var14 = arg9[var12 + var12 + 1];
            if (arg0 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg0 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg0 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg5[arg10][arg8];
                var18 = arg4[arg10][arg8];
                var19 = arg3[arg10][arg8];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg3[arg10 + 1][arg8];
                var18 = arg4[arg10 + 1][arg8];
                var17 = arg5[arg10 + 1][arg8];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg4[arg10 + 1][arg8 + 1];
                var17 = arg5[arg10 + 1][arg8 + 1];
                var19 = arg3[arg10 + 1][arg8 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg3[arg10][arg8 + 1];
                var18 = arg4[arg10][arg8 + 1];
                var17 = arg5[arg10][arg8 + 1];
            } else {
                float var20 = arg5[arg10][arg8];
                float var21 = arg3[arg10][arg8];
                float var22 = (float) var13 / 128.0F;
                float var23 = arg4[arg10][arg8];
                float var24 = (float) var14 / 128.0F;
                float var25 = (arg3[arg10 + 1][arg8] - var21) * var22 + var21;
                float var26 = (arg5[arg10 + 1][arg8] - var20) * var22 + var20;
                float var27 = arg5[arg10][arg8 + 1];
                float var28 = (arg5[arg10 + 1][arg8 + 1] - var27) * var22 + var27;
                float var29 = (arg4[arg10 + 1][arg8] - var23) * var22 + var23;
                float var30 = arg4[arg10][arg8 + 1];
                float var31 = (arg4[arg10 + 1][arg8 + 1] - var30) * var22 + var30;
                float var32 = arg3[arg10][arg8 + 1];
                float var33 = (arg3[arg10 + 1][arg8 + 1] - var32) * var22 + var32;
                var18 = (var31 - var29) * var24 + var29;
                var17 = (var28 - var26) * var24 + var26;
                var19 = (var33 - var25) * var24 + var25;
            }
            int var34 = (arg10 << 7) + var13;
            int var35 = (arg8 << 7) + var14;
            int var36 = class298.method2080(var14, var13, arg10, arg7, arg8, (byte) -122);
            var11[var12] = arg2.method824(arg6, var34, var36, var35, var17, var18, var19);
        }
        arg2.method826(var11);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILkh;)Llb;", line = 471)
    public static final class201 method2126(int arg0, class13 arg1) {
        if (arg0 <= 90) {
            method2122(9, 106, 76, (byte) -19);
        }
        field5191++;
        return new class201(arg1.method153(-77), arg1.method153(63), arg1.method153(78), arg1.method153(52), arg1.method111(1263702152), arg1.method152((byte) -125));
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lqm;ILqm;)V", line = 486)
    public static final void method2127(class222 arg0, int arg1, class222 arg2) {
        class146.field2589 = arg2;
        int var3 = 26 / ((arg1 + 56) / 61);
        class270.field4659 = arg0;
        field5188++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 499)
    public static void method2128(boolean arg0) {
        field5208 = null;
        field5195 = null;
        field5205 = null;
        field5203 = (class295[][][]) null;
        field5197 = null;
        field5196 = null;
        field5194 = null;
        field5192 = null;
        if (!arg0) {
            method2125(15, (byte) -32, (class116) null, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (class220) null, (int[][]) ((int[][]) null), 30, (int[]) null, 100);
        }
        field5206 = null;
        field5198 = null;
    }
}
