import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NSTMHEDV")
public class class41 {

    @OriginalMember(owner = "NSTMHEDV", name = "f", descriptor = "Z")
    private boolean field1197 = true;

    @OriginalMember(owner = "NSTMHEDV", name = "i", descriptor = "Z")
    private boolean field1200 = true;

    @OriginalMember(owner = "NSTMHEDV", name = "t", descriptor = "Z")
    private boolean field1211 = true;

    @OriginalMember(owner = "NSTMHEDV", name = "E", descriptor = "I")
    private int field1222 = -107;

    @OriginalMember(owner = "NSTMHEDV", name = "K", descriptor = "Z")
    private boolean field1228 = true;

    @OriginalMember(owner = "NSTMHEDV", name = "m", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "NSTMHEDV", name = "n", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "NSTMHEDV", name = "u", descriptor = "[[[I")
    private int[][][] field1212;

    @OriginalMember(owner = "NSTMHEDV", name = "J", descriptor = "[[[B")
    private byte[][][] field1227;

    @OriginalMember(owner = "NSTMHEDV", name = "e", descriptor = "[[[B")
    private byte[][][] field1196;

    @OriginalMember(owner = "NSTMHEDV", name = "b", descriptor = "[[[B")
    private byte[][][] field1193;

    @OriginalMember(owner = "NSTMHEDV", name = "d", descriptor = "[[[B")
    private byte[][][] field1195;

    @OriginalMember(owner = "NSTMHEDV", name = "C", descriptor = "[[[B")
    private byte[][][] field1220;

    @OriginalMember(owner = "NSTMHEDV", name = "s", descriptor = "[[[I")
    private int[][][] field1210;

    @OriginalMember(owner = "NSTMHEDV", name = "r", descriptor = "[[[B")
    private byte[][][] field1209;

    @OriginalMember(owner = "NSTMHEDV", name = "q", descriptor = "[[I")
    private int[][] field1208;

    @OriginalMember(owner = "NSTMHEDV", name = "x", descriptor = "[I")
    private int[] field1215;

    @OriginalMember(owner = "NSTMHEDV", name = "y", descriptor = "[I")
    private int[] field1216;

    @OriginalMember(owner = "NSTMHEDV", name = "z", descriptor = "[I")
    private int[] field1217;

    @OriginalMember(owner = "NSTMHEDV", name = "A", descriptor = "[I")
    private int[] field1218;

    @OriginalMember(owner = "NSTMHEDV", name = "B", descriptor = "[I")
    private int[] field1219;

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "I")
    private static int field1192 = 49845;

    @OriginalMember(owner = "NSTMHEDV", name = "c", descriptor = "I")
    private static int field1194 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "NSTMHEDV", name = "h", descriptor = "[I")
    private static final int[] field1199 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "NSTMHEDV", name = "j", descriptor = "I")
    private static int field1201 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "NSTMHEDV", name = "k", descriptor = "Z")
    public static boolean field1202 = true;

    @OriginalMember(owner = "NSTMHEDV", name = "l", descriptor = "I")
    public static int field1203 = 99;

    @OriginalMember(owner = "NSTMHEDV", name = "o", descriptor = "[I")
    private static final int[] field1206 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "NSTMHEDV", name = "p", descriptor = "[I")
    private static final int[] field1207 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "NSTMHEDV", name = "v", descriptor = "I")
    private static int field1213 = 171;

    @OriginalMember(owner = "NSTMHEDV", name = "w", descriptor = "Z")
    private static boolean field1214 = true;

    @OriginalMember(owner = "NSTMHEDV", name = "D", descriptor = "B")
    private static byte field1221 = -102;

    @OriginalMember(owner = "NSTMHEDV", name = "F", descriptor = "I")
    private static int field1223 = 7;

    @OriginalMember(owner = "NSTMHEDV", name = "G", descriptor = "[I")
    private static final int[] field1224 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "NSTMHEDV", name = "H", descriptor = "Z")
    private static boolean field1225 = true;

    @OriginalMember(owner = "NSTMHEDV", name = "I", descriptor = "Z")
    private static boolean field1226 = true;

    @OriginalMember(owner = "NSTMHEDV", name = "g", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(ZLDNRIFKTO;LMWSOISVX;)V")
    public static final void method357(boolean arg0, class11 arg1, class35 arg2) {
        int var3 = -1;
        if (!arg0) {
            field1192 = 214;
        }
        while (true) {
            int var4 = arg1.method203();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class56 var5 = class56.method445(var3);
            var5.method448((byte) 5, arg2);
            while (true) {
                int var6 = arg1.method203();
                if (var6 == 0) {
                    break;
                }
                arg1.method189();
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(LDNRIFKTO;IIIIIII)V")
    private final void method358(class11 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            this.field1222 = -174;
        }
        if (arg7 < 0 || arg7 >= 104 || arg2 < 0 || arg2 >= 104) {
            while (true) {
                int var11 = arg0.method189();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method189();
                    return;
                }
                if (var11 <= 49) {
                    arg0.method189();
                }
            }
        }
        this.field1227[arg4][arg7][arg2] = 0;
        while (true) {
            int var9 = arg0.method189();
            if (var9 == 0) {
                if (arg4 == 0) {
                    this.field1212[0][arg7][arg2] = -method362(arg7 + arg3 + 932731, arg2 + 556238 + arg6) * 8;
                    return;
                } else {
                    this.field1212[arg4][arg7][arg2] = this.field1212[arg4 - 1][arg7][arg2] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method189();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg4 == 0) {
                    this.field1212[0][arg7][arg2] = -var10 * 8;
                    return;
                }
                this.field1212[arg4][arg7][arg2] = this.field1212[arg4 - 1][arg7][arg2] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1193[arg4][arg7][arg2] = arg0.method190();
                this.field1195[arg4][arg7][arg2] = (byte) ((var9 - 2) / 4);
                this.field1220[arg4][arg7][arg2] = (byte) (var9 + arg5 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1227[arg4][arg7][arg2] = (byte) (var9 - 49);
            } else {
                this.field1196[arg4][arg7][arg2] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(IZIII)V")
    public final void method359(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
            for (int var7 = arg4; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field1204 && var6 >= 0 && var6 < this.field1205) {
                    this.field1209[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field1212[0][var7][var6] = this.field1212[0][var7 - 1][var6];
                    }
                    if (arg0 + arg4 == var7 && var7 < this.field1204 - 1) {
                        this.field1212[0][var7][var6] = this.field1212[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field1212[0][var7][var6] = this.field1212[0][var7][var6 - 1];
                    }
                    if (arg2 + arg3 == var6 && var6 < this.field1205 - 1) {
                        this.field1212[0][var7][var6] = this.field1212[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg1) {
            this.field1211 = !this.field1211;
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(III)I")
    private final int method360(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(II)I")
    private final int method361(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "b", descriptor = "(II)I")
    private static final int method362(int arg0, int arg1) {
        int var2 = method367(arg0 + 45365, arg1 + 91923, 4) + (method367(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method367(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(IIII)I")
    private static final int method363(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class4.field35[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(IIIIIIILURWDWMOD;LXSMXYXEY;I[[[I)V")
    public static final void method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class61 arg7, class68 arg8, int arg9, int[][][] arg10) {
        int var11 = arg10[arg6][arg5][arg3];
        int var12 = arg10[arg6][arg5 + 1][arg3];
        int var13 = arg10[arg6][arg5 + 1][arg3 + 1];
        int var14 = arg10[arg6][arg5][arg3 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (arg0 != 0) {
            return;
        }
        class56 var16 = class56.method445(arg4);
        int var17 = (arg4 << 14) + (arg3 << 7) + arg5 + 1073741824;
        if (!var16.field1438) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg1 << 6) + arg9);
        if (arg9 == 22) {
            class66 var19;
            if (var16.field1453 == -1 && var16.field1436 == null) {
                var19 = var16.method446(22, arg1, var11, var12, var13, var14, -1);
            } else {
                var19 = new class45(0, var11, var12, var16.field1453, arg1, var13, arg4, var14, true, 22);
            }
            arg8.method544(var17, var19, var18, field1214, arg5, arg3, arg2, var15);
            if (var16.field1431 && var16.field1438) {
                arg7.method503(arg3, field1221, arg5);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class66 var39;
            if (var16.field1453 == -1 && var16.field1436 == null) {
                var39 = var16.method446(10, arg1, var11, var12, var13, var14, -1);
            } else {
                var39 = new class45(0, var11, var12, var16.field1453, arg1, var13, arg4, var14, true, 10);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg9 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg1 == 1 || arg1 == 3) {
                    var41 = var16.field1426;
                    var42 = var16.field1427;
                } else {
                    var41 = var16.field1427;
                    var42 = var16.field1426;
                }
                arg8.method548(arg5, var41, var17, var39, var40, var42, -428, var15, arg2, var18, arg3);
            }
            if (var16.field1431) {
                arg7.method502(var16.field1426, 0, arg1, var16.field1427, var16.field1432, arg3, arg5);
            }
        } else if (arg9 >= 12) {
            class66 var20;
            if (var16.field1453 == -1 && var16.field1436 == null) {
                var20 = var16.method446(arg9, arg1, var11, var12, var13, var14, -1);
            } else {
                var20 = new class45(0, var11, var12, var16.field1453, arg1, var13, arg4, var14, true, arg9);
            }
            arg8.method548(arg5, 1, var17, var20, 0, 1, -428, var15, arg2, var18, arg3);
            if (var16.field1431) {
                arg7.method502(var16.field1426, 0, arg1, var16.field1427, var16.field1432, arg3, arg5);
            }
        } else if (arg9 == 0) {
            class66 var21;
            if (var16.field1453 == -1 && var16.field1436 == null) {
                var21 = var16.method446(0, arg1, var11, var12, var13, var14, -1);
            } else {
                var21 = new class45(0, var11, var12, var16.field1453, arg1, var13, arg4, var14, true, 0);
            }
            arg8.method546(var17, var18, arg5, var21, null, arg2, arg3, field1207[arg1], 0, var15, 0);
            if (var16.field1431) {
                arg7.method501(var16.field1432, arg9, arg1, arg5, arg3, (byte) -100);
            }
        } else if (arg9 == 1) {
            class66 var22;
            if (var16.field1453 == -1 && var16.field1436 == null) {
                var22 = var16.method446(1, arg1, var11, var12, var13, var14, -1);
            } else {
                var22 = new class45(0, var11, var12, var16.field1453, arg1, var13, arg4, var14, true, 1);
            }
            arg8.method546(var17, var18, arg5, var22, null, arg2, arg3, field1224[arg1], 0, var15, 0);
            if (var16.field1431) {
                arg7.method501(var16.field1432, arg9, arg1, arg5, arg3, (byte) -100);
            }
        } else if (arg9 == 2) {
            int var23 = arg1 + 1 & 0x3;
            class66 var24;
            class66 var25;
            if (var16.field1453 == -1 && var16.field1436 == null) {
                var24 = var16.method446(2, arg1 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method446(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class45(0, var11, var12, var16.field1453, arg1 + 4, var13, arg4, var14, true, 2);
                var25 = new class45(0, var11, var12, var16.field1453, var23, var13, arg4, var14, true, 2);
            }
            arg8.method546(var17, var18, arg5, var24, var25, arg2, arg3, field1207[arg1], field1207[var23], var15, 0);
            if (var16.field1431) {
                arg7.method501(var16.field1432, arg9, arg1, arg5, arg3, (byte) -100);
            }
        } else if (arg9 == 3) {
            class66 var26;
            if (var16.field1453 == -1 && var16.field1436 == null) {
                var26 = var16.method446(3, arg1, var11, var12, var13, var14, -1);
            } else {
                var26 = new class45(0, var11, var12, var16.field1453, arg1, var13, arg4, var14, true, 3);
            }
            arg8.method546(var17, var18, arg5, var26, null, arg2, arg3, field1224[arg1], 0, var15, 0);
            if (var16.field1431) {
                arg7.method501(var16.field1432, arg9, arg1, arg5, arg3, (byte) -100);
            }
        } else if (arg9 == 9) {
            class66 var27;
            if (var16.field1453 == -1 && var16.field1436 == null) {
                var27 = var16.method446(arg9, arg1, var11, var12, var13, var14, -1);
            } else {
                var27 = new class45(0, var11, var12, var16.field1453, arg1, var13, arg4, var14, true, arg9);
            }
            arg8.method548(arg5, 1, var17, var27, 0, 1, -428, var15, arg2, var18, arg3);
            if (var16.field1431) {
                arg7.method502(var16.field1426, 0, arg1, var16.field1427, var16.field1432, arg3, arg5);
            }
        } else {
            if (var16.field1420) {
                if (arg1 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg1 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg1 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg9 == 4) {
                class66 var32;
                if (var16.field1453 == -1 && var16.field1436 == null) {
                    var32 = var16.method446(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class45(0, var11, var12, var16.field1453, 0, var13, arg4, var14, true, 4);
                }
                arg8.method547(arg1 * 512, 0, var18, arg2, arg5, field1213, field1207[arg1], var15, arg3, 0, var32, var17);
            } else if (arg9 == 5) {
                int var33 = 16;
                int var34 = arg8.method564(arg2, arg5, arg3);
                if (var34 > 0) {
                    var33 = class56.method445(var34 >> 14 & 0x7FFF).field1407;
                }
                class66 var35;
                if (var16.field1453 == -1 && var16.field1436 == null) {
                    var35 = var16.method446(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class45(0, var11, var12, var16.field1453, 0, var13, arg4, var14, true, 4);
                }
                arg8.method547(arg1 * 512, field1199[arg1] * var33, var18, arg2, arg5, field1213, field1207[arg1], var15, arg3, field1206[arg1] * var33, var35, var17);
            } else if (arg9 == 6) {
                class66 var36;
                if (var16.field1453 == -1 && var16.field1436 == null) {
                    var36 = var16.method446(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class45(0, var11, var12, var16.field1453, 0, var13, arg4, var14, true, 4);
                }
                arg8.method547(arg1, 0, var18, arg2, arg5, field1213, 256, var15, arg3, 0, var36, var17);
            } else if (arg9 == 7) {
                class66 var37;
                if (var16.field1453 == -1 && var16.field1436 == null) {
                    var37 = var16.method446(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class45(0, var11, var12, var16.field1453, 0, var13, arg4, var14, true, 4);
                }
                arg8.method547(arg1, 0, var18, arg2, arg5, field1213, 512, var15, arg3, 0, var37, var17);
            } else if (arg9 == 8) {
                class66 var38;
                if (var16.field1453 == -1 && var16.field1436 == null) {
                    var38 = var16.method446(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class45(0, var11, var12, var16.field1453, 0, var13, arg4, var14, true, 4);
                }
                arg8.method547(arg1, 0, var18, arg2, arg5, field1213, 768, var15, arg3, 0, var38, var17);
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "c", descriptor = "(II)I")
    private static final int method365(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(ZIIILURWDWMOD;ILXSMXYXEY;II)V")
    private final void method366(boolean arg0, int arg1, int arg2, int arg3, class61 arg4, int arg5, class68 arg6, int arg7, int arg8) {
        if (field1202 && (this.field1227[0][arg3][arg5] & 0x2) == 0) {
            if ((this.field1227[arg8][arg3][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method375(arg5, arg3, arg8, 46887) != field1198) {
                return;
            }
        }
        if (arg8 < field1203) {
            field1203 = arg8;
        }
        int var10 = this.field1212[arg8][arg3][arg5];
        int var11 = this.field1212[arg8][arg3 + 1][arg5];
        int var12 = this.field1212[arg8][arg3 + 1][arg5 + 1];
        int var13 = this.field1212[arg8][arg3][arg5 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class56 var15 = class56.method445(arg1);
        int var16 = (arg1 << 14) + (arg5 << 7) + arg3 + 1073741824;
        if (!arg0) {
            field1192 = -233;
        }
        if (!var15.field1438) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg7 << 6) + arg2);
        if (arg2 == 22) {
            if (!field1202 || var15.field1438 || var15.field1423) {
                class66 var18;
                if (var15.field1453 == -1 && var15.field1436 == null) {
                    var18 = var15.method446(22, arg7, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class45(0, var10, var11, var15.field1453, arg7, var12, arg1, var13, true, 22);
                }
                arg6.method544(var16, var18, var17, field1214, arg3, arg5, arg8, var14);
                if (var15.field1431 && var15.field1438 && arg4 != null) {
                    arg4.method503(arg5, field1221, arg3);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class66 var38;
            if (var15.field1453 == -1 && var15.field1436 == null) {
                var38 = var15.method446(10, arg7, var10, var11, var12, var13, -1);
            } else {
                var38 = new class45(0, var10, var11, var15.field1453, arg7, var12, arg1, var13, true, 10);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg2 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg7 == 1 || arg7 == 3) {
                    var40 = var15.field1426;
                    var41 = var15.field1427;
                } else {
                    var40 = var15.field1427;
                    var41 = var15.field1426;
                }
                if (arg6.method548(arg3, var40, var16, var38, var39, var41, -428, var14, arg8, var17, arg5) && var15.field1416) {
                    class55 var42;
                    if (var38 instanceof class55) {
                        var42 = (class55) var38;
                    } else {
                        var42 = var15.method446(10, arg7, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1362 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1209[arg8][arg3 + var43][arg5 + var44]) {
                                    this.field1209[arg8][arg3 + var43][arg5 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1431 && arg4 != null) {
                arg4.method502(var15.field1426, 0, arg7, var15.field1427, var15.field1432, arg5, arg3);
            }
        } else if (arg2 >= 12) {
            class66 var19;
            if (var15.field1453 == -1 && var15.field1436 == null) {
                var19 = var15.method446(arg2, arg7, var10, var11, var12, var13, -1);
            } else {
                var19 = new class45(0, var10, var11, var15.field1453, arg7, var12, arg1, var13, true, arg2);
            }
            arg6.method548(arg3, 1, var16, var19, 0, 1, -428, var14, arg8, var17, arg5);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg8 > 0) {
                this.field1210[arg8][arg3][arg5] |= 0x924;
            }
            if (var15.field1431 && arg4 != null) {
                arg4.method502(var15.field1426, 0, arg7, var15.field1427, var15.field1432, arg5, arg3);
            }
        } else if (arg2 == 0) {
            class66 var20;
            if (var15.field1453 == -1 && var15.field1436 == null) {
                var20 = var15.method446(0, arg7, var10, var11, var12, var13, -1);
            } else {
                var20 = new class45(0, var10, var11, var15.field1453, arg7, var12, arg1, var13, true, 0);
            }
            arg6.method546(var16, var17, arg3, var20, null, arg8, arg5, field1207[arg7], 0, var14, 0);
            if (arg7 == 0) {
                if (var15.field1416) {
                    this.field1209[arg8][arg3][arg5] = 50;
                    this.field1209[arg8][arg3][arg5 + 1] = 50;
                }
                if (var15.field1448) {
                    this.field1210[arg8][arg3][arg5] |= 0x249;
                }
            } else if (arg7 == 1) {
                if (var15.field1416) {
                    this.field1209[arg8][arg3][arg5 + 1] = 50;
                    this.field1209[arg8][arg3 + 1][arg5 + 1] = 50;
                }
                if (var15.field1448) {
                    this.field1210[arg8][arg3][arg5 + 1] |= 0x492;
                }
            } else if (arg7 == 2) {
                if (var15.field1416) {
                    this.field1209[arg8][arg3 + 1][arg5] = 50;
                    this.field1209[arg8][arg3 + 1][arg5 + 1] = 50;
                }
                if (var15.field1448) {
                    this.field1210[arg8][arg3 + 1][arg5] |= 0x249;
                }
            } else if (arg7 == 3) {
                if (var15.field1416) {
                    this.field1209[arg8][arg3][arg5] = 50;
                    this.field1209[arg8][arg3 + 1][arg5] = 50;
                }
                if (var15.field1448) {
                    this.field1210[arg8][arg3][arg5] |= 0x492;
                }
            }
            if (var15.field1431 && arg4 != null) {
                arg4.method501(var15.field1432, arg2, arg7, arg3, arg5, (byte) -100);
            }
            if (var15.field1407 != 16) {
                arg6.method554(arg5, arg3, var15.field1407, false, arg8);
            }
        } else if (arg2 == 1) {
            class66 var21;
            if (var15.field1453 == -1 && var15.field1436 == null) {
                var21 = var15.method446(1, arg7, var10, var11, var12, var13, -1);
            } else {
                var21 = new class45(0, var10, var11, var15.field1453, arg7, var12, arg1, var13, true, 1);
            }
            arg6.method546(var16, var17, arg3, var21, null, arg8, arg5, field1224[arg7], 0, var14, 0);
            if (var15.field1416) {
                if (arg7 == 0) {
                    this.field1209[arg8][arg3][arg5 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field1209[arg8][arg3 + 1][arg5 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field1209[arg8][arg3 + 1][arg5] = 50;
                } else if (arg7 == 3) {
                    this.field1209[arg8][arg3][arg5] = 50;
                }
            }
            if (var15.field1431 && arg4 != null) {
                arg4.method501(var15.field1432, arg2, arg7, arg3, arg5, (byte) -100);
            }
        } else if (arg2 == 2) {
            int var22 = arg7 + 1 & 0x3;
            class66 var23;
            class66 var24;
            if (var15.field1453 == -1 && var15.field1436 == null) {
                var23 = var15.method446(2, arg7 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method446(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class45(0, var10, var11, var15.field1453, arg7 + 4, var12, arg1, var13, true, 2);
                var24 = new class45(0, var10, var11, var15.field1453, var22, var12, arg1, var13, true, 2);
            }
            arg6.method546(var16, var17, arg3, var23, var24, arg8, arg5, field1207[arg7], field1207[var22], var14, 0);
            if (var15.field1448) {
                if (arg7 == 0) {
                    this.field1210[arg8][arg3][arg5] |= 0x249;
                    this.field1210[arg8][arg3][arg5 + 1] |= 0x492;
                } else if (arg7 == 1) {
                    this.field1210[arg8][arg3][arg5 + 1] |= 0x492;
                    this.field1210[arg8][arg3 + 1][arg5] |= 0x249;
                } else if (arg7 == 2) {
                    this.field1210[arg8][arg3 + 1][arg5] |= 0x249;
                    this.field1210[arg8][arg3][arg5] |= 0x492;
                } else if (arg7 == 3) {
                    this.field1210[arg8][arg3][arg5] |= 0x492;
                    this.field1210[arg8][arg3][arg5] |= 0x249;
                }
            }
            if (var15.field1431 && arg4 != null) {
                arg4.method501(var15.field1432, arg2, arg7, arg3, arg5, (byte) -100);
            }
            if (var15.field1407 != 16) {
                arg6.method554(arg5, arg3, var15.field1407, false, arg8);
            }
        } else if (arg2 == 3) {
            class66 var25;
            if (var15.field1453 == -1 && var15.field1436 == null) {
                var25 = var15.method446(3, arg7, var10, var11, var12, var13, -1);
            } else {
                var25 = new class45(0, var10, var11, var15.field1453, arg7, var12, arg1, var13, true, 3);
            }
            arg6.method546(var16, var17, arg3, var25, null, arg8, arg5, field1224[arg7], 0, var14, 0);
            if (var15.field1416) {
                if (arg7 == 0) {
                    this.field1209[arg8][arg3][arg5 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field1209[arg8][arg3 + 1][arg5 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field1209[arg8][arg3 + 1][arg5] = 50;
                } else if (arg7 == 3) {
                    this.field1209[arg8][arg3][arg5] = 50;
                }
            }
            if (var15.field1431 && arg4 != null) {
                arg4.method501(var15.field1432, arg2, arg7, arg3, arg5, (byte) -100);
            }
        } else if (arg2 == 9) {
            class66 var26;
            if (var15.field1453 == -1 && var15.field1436 == null) {
                var26 = var15.method446(arg2, arg7, var10, var11, var12, var13, -1);
            } else {
                var26 = new class45(0, var10, var11, var15.field1453, arg7, var12, arg1, var13, true, arg2);
            }
            arg6.method548(arg3, 1, var16, var26, 0, 1, -428, var14, arg8, var17, arg5);
            if (var15.field1431 && arg4 != null) {
                arg4.method502(var15.field1426, 0, arg7, var15.field1427, var15.field1432, arg5, arg3);
            }
        } else {
            if (var15.field1420) {
                if (arg7 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg7 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg7 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg2 == 4) {
                class66 var31;
                if (var15.field1453 == -1 && var15.field1436 == null) {
                    var31 = var15.method446(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class45(0, var10, var11, var15.field1453, 0, var12, arg1, var13, true, 4);
                }
                arg6.method547(arg7 * 512, 0, var17, arg8, arg3, field1213, field1207[arg7], var14, arg5, 0, var31, var16);
            } else if (arg2 == 5) {
                int var32 = 16;
                int var33 = arg6.method564(arg8, arg3, arg5);
                if (var33 > 0) {
                    var32 = class56.method445(var33 >> 14 & 0x7FFF).field1407;
                }
                class66 var34;
                if (var15.field1453 == -1 && var15.field1436 == null) {
                    var34 = var15.method446(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class45(0, var10, var11, var15.field1453, 0, var12, arg1, var13, true, 4);
                }
                arg6.method547(arg7 * 512, field1199[arg7] * var32, var17, arg8, arg3, field1213, field1207[arg7], var14, arg5, field1206[arg7] * var32, var34, var16);
            } else if (arg2 == 6) {
                class66 var35;
                if (var15.field1453 == -1 && var15.field1436 == null) {
                    var35 = var15.method446(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class45(0, var10, var11, var15.field1453, 0, var12, arg1, var13, true, 4);
                }
                arg6.method547(arg7, 0, var17, arg8, arg3, field1213, 256, var14, arg5, 0, var35, var16);
            } else if (arg2 == 7) {
                class66 var36;
                if (var15.field1453 == -1 && var15.field1436 == null) {
                    var36 = var15.method446(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class45(0, var10, var11, var15.field1453, 0, var12, arg1, var13, true, 4);
                }
                arg6.method547(arg7, 0, var17, arg8, arg3, field1213, 512, var14, arg5, 0, var36, var16);
            } else if (arg2 == 8) {
                class66 var37;
                if (var15.field1453 == -1 && var15.field1436 == null) {
                    var37 = var15.method446(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class45(0, var10, var11, var15.field1453, 0, var12, arg1, var13, true, 4);
                }
                arg6.method547(arg7, 0, var17, arg8, arg3, field1213, 768, var14, arg5, 0, var37, var16);
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "b", descriptor = "(III)I")
    private static final int method367(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method377(var3, var5);
        int var8 = method377(var3 + 1, var5);
        int var9 = method377(var3, var5 + 1);
        int var10 = method377(var3 + 1, var5 + 1);
        int var11 = method363(var7, var8, var4, arg2);
        int var12 = method363(var9, var10, var4, arg2);
        return method363(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(II[LURWDWMOD;IIIIILXSMXYXEY;I[B)V")
    public final void method368(int arg0, int arg1, class61[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8, int arg9, byte[] arg10) {
        if (arg4 != -2506) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        class11 var13 = new class11(arg10, field1225);
        int var14 = -1;
        while (true) {
            int var15 = var13.method203();
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var13.method203();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var13.method189();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg3 == var20 && var19 >= arg6 && var19 < arg6 + 8 && var18 >= arg0 && var18 < arg0 + 8) {
                    class56 var24 = class56.method445(var14);
                    int var25 = arg5 + class29.method306(var18 & 0x7, -407, var19 & 0x7, var24.field1426, var23, var24.field1427, arg1);
                    int var26 = arg7 + class29.method307(8, var24.field1426, var18 & 0x7, arg1, var24.field1427, var23, var19 & 0x7);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg9;
                        if ((this.field1227[1][var25][var26] & 0x2) == 2) {
                            var27 = arg9 - 1;
                        }
                        class61 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg2[var27];
                        }
                        this.method366(this.field1197, var14, var22, var25, var28, var26, arg8, arg1 + var23 & 0x3, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "<init>", descriptor = "(I[[[BB[[[II)V")
    public class41(int arg0, byte[][][] arg1, byte arg2, int[][][] arg3, int arg4) {
        field1203 = 99;
        this.field1204 = arg4;
        this.field1205 = arg0;
        this.field1212 = arg3;
        this.field1227 = arg1;
        this.field1196 = new byte[4][this.field1204][this.field1205];
        this.field1193 = new byte[4][this.field1204][this.field1205];
        if (arg2 != 71) {
            this.field1228 = !this.field1228;
        }
        this.field1195 = new byte[4][this.field1204][this.field1205];
        this.field1220 = new byte[4][this.field1204][this.field1205];
        this.field1210 = new int[4][this.field1204 + 1][this.field1205 + 1];
        this.field1209 = new byte[4][this.field1204 + 1][this.field1205 + 1];
        this.field1208 = new int[this.field1204 + 1][this.field1205 + 1];
        this.field1215 = new int[this.field1205];
        this.field1216 = new int[this.field1205];
        this.field1217 = new int[this.field1205];
        this.field1218 = new int[this.field1205];
        this.field1219 = new int[this.field1205];
    }

    @OriginalMember(owner = "NSTMHEDV", name = "d", descriptor = "(II)I")
    private static final int method369(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "NSTMHEDV", name = "c", descriptor = "(III)Z")
    public static final boolean method370(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        class56 var4 = class56.method445(arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var4.method454(arg0, false);
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method371(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        if (arg2 < field1223 || arg2 > field1223) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        class11 var6 = new class11(arg1, field1225);
        int var7 = -1;
        label55: while (true) {
            int var8 = var6.method203();
            if (var8 == 0) {
                return var4;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method203();
                    if (var12 == 0) {
                        continue label55;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var6.method189() >> 2;
                    int var16 = arg3 + var14;
                    int var17 = arg0 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class56 var18 = class56.method445(var7);
                        if (var15 != 22 || !field1202 || var18.field1438 || var18.field1423) {
                            var4 &= var18.method444((byte) -58);
                            var10 = true;
                        }
                    }
                }
                int var11 = var6.method203();
                if (var11 == 0) {
                    break;
                }
                var6.method189();
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(III[BLXSMXYXEY;[LURWDWMOD;)V")
    public final void method372(int arg0, int arg1, int arg2, byte[] arg3, class68 arg4, class61[] arg5) {
        class11 var7 = new class11(arg3, field1225);
        if (arg0 != -44739) {
            return;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method203();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method203();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method189();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1227[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class61 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg5[var20];
                    }
                    this.method366(this.field1197, var8, var16, var18, var21, var19, arg4, var17, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(IIIII[LURWDWMOD;I[BII)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, class61[] arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg3 + var11 > 0 && arg3 + var11 < 103 && arg2 + var17 > 0 && arg2 + var17 < 103) {
                    arg5[arg9].field1523[arg3 + var11][arg2 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        class11 var12 = new class11(arg7, field1225);
        if (arg1 >= 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg8 && var15 < arg8 + 8 && var16 >= arg0 && var16 < arg0 + 8) {
                        this.method358(var12, 0, arg2 + class29.method305(arg6, var15 & 0x7, var16 & 0x7, 426), 0, arg9, arg6, 0, arg3 + class29.method304(var16 & 0x7, var15 & 0x7, this.field1222, arg6));
                    } else {
                        this.method358(var12, 0, -1, 0, 0, 0, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "([LURWDWMOD;LXSMXYXEY;I)V")
    public final void method374(class61[] arg0, class68 arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1227[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1227[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method503(var111, field1221, var110);
                        }
                    }
                }
            }
        }
        field1194 += (int) (Math.random() * 5.0D) - 2;
        if (field1194 < -8) {
            field1194 = -8;
        }
        if (field1194 > 8) {
            field1194 = 8;
        }
        field1201 += (int) (Math.random() * 5.0D) - 2;
        if (field1201 < -16) {
            field1201 = -16;
        }
        if (field1201 > 16) {
            field1201 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1209[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1205 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1204 - 1; var101++) {
                    int var102 = this.field1212[var5][var101 + 1][var56] - this.field1212[var5][var101 - 1][var56];
                    int var103 = this.field1212[var5][var101][var56 + 1] - this.field1212[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1208[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1205; var57++) {
                this.field1215[var57] = 0;
                this.field1216[var57] = 0;
                this.field1217[var57] = 0;
                this.field1218[var57] = 0;
                this.field1219[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1204 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1205; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1204) {
                        int var96 = this.field1196[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class19 var97 = class19.field721[var96 - 1];
                            this.field1215[var61] += var97.field730;
                            this.field1216[var61] += var97.field728;
                            this.field1217[var61] += var97.field729;
                            this.field1218[var61] += var97.field731;
                            var10002 = this.field1219[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1204) {
                        int var99 = this.field1196[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class19 var100 = class19.field721[var99 - 1];
                            this.field1215[var61] -= var100.field730;
                            this.field1216[var61] -= var100.field728;
                            this.field1217[var61] -= var100.field729;
                            this.field1218[var61] -= var100.field731;
                            var10002 = this.field1219[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1204 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1205 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1205) {
                            var62 += this.field1215[var68];
                            var63 += this.field1216[var68];
                            var64 += this.field1217[var68];
                            var65 += this.field1218[var68];
                            var66 += this.field1219[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1205) {
                            var62 -= this.field1215[var69];
                            var63 -= this.field1216[var69];
                            var64 -= this.field1217[var69];
                            var65 -= this.field1218[var69];
                            var66 -= this.field1219[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1205 - 1 && (!field1202 || (this.field1227[0][var58][var67] & 0x2) != 0 || (this.field1227[var5][var58][var67] & 0x10) == 0 && this.method375(var67, var58, var5, 46887) == field1198)) {
                            if (var5 < field1203) {
                                field1203 = var5;
                            }
                            int var70 = this.field1196[var5][var58][var67] & 0xFF;
                            int var71 = this.field1193[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1212[var5][var58][var67];
                                int var73 = this.field1212[var5][var58 + 1][var67];
                                int var74 = this.field1212[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1212[var5][var58][var67 + 1];
                                int var76 = this.field1208[var58][var67];
                                int var77 = this.field1208[var58 + 1][var67];
                                int var78 = this.field1208[var58 + 1][var67 + 1];
                                int var79 = this.field1208[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method360(var82, var83, var84);
                                    int var85 = field1194 + var82 & 0xFF;
                                    int var86 = field1201 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method360(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1195[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class19.field721[var71 - 1].field726) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1210[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class4.field46[method369(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method543(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method369(var80, var76), method369(var80, var77), method369(var80, var78), method369(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1195[var5][var58][var67] + 1;
                                    byte var90 = this.field1220[var5][var58][var67];
                                    class19 var91 = class19.field721[var71 - 1];
                                    int var92 = var91.field724;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class4.method8(var92, this.field1200);
                                        var94 = -1;
                                    } else if (var91.field723 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method360(var91.field727, var91.field728, var91.field729);
                                        var93 = class4.field46[this.method361(var91.field732, 96)];
                                    }
                                    arg1.method543(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method369(var80, var76), method369(var80, var77), method369(var80, var78), method369(var80, var79), this.method361(var94, var76), this.method361(var94, var77), this.method361(var94, var78), this.method361(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1205 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1204 - 1; var60++) {
                    arg1.method542(var5, var60, var59, this.method375(var59, var60, var5, 46887));
                }
            }
        }
        arg1.method569(-50, 768, 64, (byte) 0, -10, -50);
        for (int var6 = 0; var6 < this.field1204; var6++) {
            for (int var47 = 0; var47 < this.field1205; var47++) {
                if ((this.field1227[1][var6][var47] & 0x2) == 2) {
                    arg1.method540(var6, var47, 24049);
                }
            }
        }
        if (arg2 != 0) {
            this.field1197 = !this.field1197;
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1205; var12++) {
                    for (int var13 = 0; var13 <= this.field1204; var13++) {
                        if ((this.field1210[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1210[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1205 && (this.field1210[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1210[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1210[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1212[var17][var13][var14] - var21;
                                int var23 = this.field1212[var16][var13][var14];
                                class68.method541(1, var13 * 128, var14 * 128, var13 * 128, -991, var15 * 128 + 128, var23, var22, var10);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1210[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1210[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1210[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1204 && (this.field1210[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1210[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1210[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1212[var29][var26][var12] - var33;
                                int var35 = this.field1212[var28][var26][var12];
                                class68.method541(2, var27 * 128 + 128, var12 * 128, var26 * 128, -991, var12 * 128, var35, var34, var10);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1210[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1210[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1210[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1205 && (this.field1210[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1210[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field1204) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1210[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1212[var11][var38][var40];
                                class68.method541(4, var39 * 128 + 128, var40 * 128, var38 * 128, -991, var41 * 128 + 128, var44, var44, var10);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1210[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "b", descriptor = "(IIII)I")
    public int method375(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 46887) {
            return 0;
        } else if ((this.field1227[arg2][arg1][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (this.field1227[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "a", descriptor = "(III[BB[LURWDWMOD;I)V")
    public final void method376(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, class61[] arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg2 + var14 > 0 && arg2 + var14 < 103 && arg0 + var15 > 0 && arg0 + var15 < 103) {
                        arg5[var8].field1523[arg2 + var14][arg0 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg4 == 2) {
            boolean var9 = false;
        } else {
            field1192 = -103;
        }
        class11 var10 = new class11(arg3, field1225);
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method358(var10, 0, arg0 + var13, arg6, var11, 0, arg1, arg2 + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "NSTMHEDV", name = "e", descriptor = "(II)I")
    private static final int method377(int arg0, int arg1) {
        int var2 = method365(arg0 - 1, arg1 - 1) + method365(arg0 + 1, arg1 - 1) + method365(arg0 - 1, arg1 + 1) + method365(arg0 + 1, arg1 + 1);
        int var3 = method365(arg0 - 1, arg1) + method365(arg0 + 1, arg1) + method365(arg0, arg1 - 1) + method365(arg0, arg1 + 1);
        int var4 = method365(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }
}
