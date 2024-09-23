import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OZIFXWPH")
public class class44 {

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "Z")
    private boolean field1214 = true;

    @OriginalMember(owner = "OZIFXWPH", name = "b", descriptor = "I")
    private int field1215 = 534;

    @OriginalMember(owner = "OZIFXWPH", name = "m", descriptor = "Z")
    private boolean field1226 = true;

    @OriginalMember(owner = "OZIFXWPH", name = "A", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "OZIFXWPH", name = "B", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "OZIFXWPH", name = "E", descriptor = "[[[I")
    private int[][][] field1244;

    @OriginalMember(owner = "OZIFXWPH", name = "i", descriptor = "[[[B")
    private byte[][][] field1222;

    @OriginalMember(owner = "OZIFXWPH", name = "w", descriptor = "[[[B")
    private byte[][][] field1236;

    @OriginalMember(owner = "OZIFXWPH", name = "D", descriptor = "[[[B")
    private byte[][][] field1243;

    @OriginalMember(owner = "OZIFXWPH", name = "j", descriptor = "[[[B")
    private byte[][][] field1223;

    @OriginalMember(owner = "OZIFXWPH", name = "r", descriptor = "[[[B")
    private byte[][][] field1231;

    @OriginalMember(owner = "OZIFXWPH", name = "x", descriptor = "[[[I")
    private int[][][] field1237;

    @OriginalMember(owner = "OZIFXWPH", name = "c", descriptor = "[[[B")
    private byte[][][] field1216;

    @OriginalMember(owner = "OZIFXWPH", name = "t", descriptor = "[[I")
    private int[][] field1233;

    @OriginalMember(owner = "OZIFXWPH", name = "d", descriptor = "[I")
    private int[] field1217;

    @OriginalMember(owner = "OZIFXWPH", name = "e", descriptor = "[I")
    private int[] field1218;

    @OriginalMember(owner = "OZIFXWPH", name = "f", descriptor = "[I")
    private int[] field1219;

    @OriginalMember(owner = "OZIFXWPH", name = "g", descriptor = "[I")
    private int[] field1220;

    @OriginalMember(owner = "OZIFXWPH", name = "h", descriptor = "[I")
    private int[] field1221;

    @OriginalMember(owner = "OZIFXWPH", name = "k", descriptor = "I")
    private static int field1224 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "OZIFXWPH", name = "l", descriptor = "[I")
    private static final int[] field1225 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "OZIFXWPH", name = "n", descriptor = "I")
    private static int field1227 = 514;

    @OriginalMember(owner = "OZIFXWPH", name = "o", descriptor = "Z")
    public static boolean field1228 = true;

    @OriginalMember(owner = "OZIFXWPH", name = "p", descriptor = "[I")
    private static final int[] field1229 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "OZIFXWPH", name = "q", descriptor = "I")
    private static int field1230 = -44;

    @OriginalMember(owner = "OZIFXWPH", name = "u", descriptor = "[I")
    private static final int[] field1234 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "OZIFXWPH", name = "v", descriptor = "I")
    private static int field1235 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "OZIFXWPH", name = "y", descriptor = "[I")
    private static final int[] field1238 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "OZIFXWPH", name = "z", descriptor = "I")
    public static int field1239 = 99;

    @OriginalMember(owner = "OZIFXWPH", name = "s", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "OZIFXWPH", name = "C", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(II)I")
    private static final int method416(int arg0, int arg1) {
        int var2 = method431(arg0 + 45365, arg1 + 91923, 4) + (method431(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method431(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(ILEILHLJCE;LYSAVREBH;)V")
    public static final void method417(int arg0, class17 arg1, class71 arg2) {
        int var3 = -1;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var4 = arg1.method238();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class14 var5 = class14.method192(var3);
            var5.method191(arg2, 0);
            while (true) {
                int var6 = arg1.method238();
                if (var6 == 0) {
                    break;
                }
                arg1.method224();
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "b", descriptor = "(II)I")
    private static final int method418(int arg0, int arg1) {
        int var2 = method429(arg0 - 1, arg1 - 1) + method429(arg0 + 1, arg1 - 1) + method429(arg0 - 1, arg1 + 1) + method429(arg0 + 1, arg1 + 1);
        int var3 = method429(arg0 - 1, arg1) + method429(arg0 + 1, arg1) + method429(arg0, arg1 - 1) + method429(arg0, arg1 + 1);
        int var4 = method429(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "OZIFXWPH", name = "c", descriptor = "(II)I")
    private static final int method419(int arg0, int arg1) {
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

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(IIIZ)I")
    public int method420(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field1215 = -23;
        }
        if ((this.field1222[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (this.field1222[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(IIII)I")
    private static final int method421(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class21.field821[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "OZIFXWPH", name = "d", descriptor = "(II)I")
    private final int method422(int arg0, int arg1) {
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

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(IIIIB)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg3; var7 <= arg1 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field1240 && var6 >= 0 && var6 < this.field1241) {
                    this.field1216[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        this.field1244[0][var7][var6] = this.field1244[0][var7 - 1][var6];
                    }
                    if (arg1 + arg3 == var7 && var7 < this.field1240 - 1) {
                        this.field1244[0][var7][var6] = this.field1244[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field1244[0][var7][var6] = this.field1244[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < this.field1241 - 1) {
                        this.field1244[0][var7][var6] = this.field1244[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg4 != 9) {
            this.field1214 = !this.field1214;
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(ILDYTTVJNT;LXOHMKFIT;III[[[IIIII)V")
    public static final void method424(int arg0, class16 arg1, class68 arg2, int arg3, int arg4, int arg5, int[][][] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg6[arg7][arg4][arg8];
        int var12 = arg6[arg7][arg4 + 1][arg8];
        int var13 = arg6[arg7][arg4 + 1][arg8 + 1];
        int var14 = arg6[arg7][arg4][arg8 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class14 var16 = class14.method192(arg3);
        if (arg0 <= 0) {
            for (int var17 = 1; var17 > 0; var17++) {
            }
        }
        int var18 = (arg3 << 14) + (arg8 << 7) + arg4 + 1073741824;
        if (!var16.field699) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg9 << 6) + arg5);
        if (arg5 == 22) {
            class66 var20;
            if (var16.field694 == -1 && var16.field726 == null) {
                var20 = var16.method189(22, arg9, var11, var12, var13, var14, -1);
            } else {
                var20 = new class57(arg3, 22, var12, var16.field694, var14, true, arg9, var13, (byte) -59, var11);
            }
            arg2.method534(var19, (byte) 6, arg8, arg4, var15, arg10, var20, var18);
            if (var16.field698 && var16.field699) {
                arg1.method203(209, arg4, arg8);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class66 var40;
            if (var16.field694 == -1 && var16.field726 == null) {
                var40 = var16.method189(10, arg9, var11, var12, var13, var14, -1);
            } else {
                var40 = new class57(arg3, 10, var12, var16.field694, var14, true, arg9, var13, (byte) -59, var11);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg5 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg9 == 1 || arg9 == 3) {
                    var42 = var16.field703;
                    var43 = var16.field708;
                } else {
                    var42 = var16.field708;
                    var43 = var16.field703;
                }
                arg2.method538(arg10, 0, var43, var42, var19, arg4, var15, var18, var41, var40, arg8);
            }
            if (var16.field698) {
                arg1.method202(var16.field708, var16.field703, false, var16.field705, arg4, arg9, arg8);
            }
        } else if (arg5 >= 12) {
            class66 var21;
            if (var16.field694 == -1 && var16.field726 == null) {
                var21 = var16.method189(arg5, arg9, var11, var12, var13, var14, -1);
            } else {
                var21 = new class57(arg3, arg5, var12, var16.field694, var14, true, arg9, var13, (byte) -59, var11);
            }
            arg2.method538(arg10, 0, 1, 1, var19, arg4, var15, var18, 0, var21, arg8);
            if (var16.field698) {
                arg1.method202(var16.field708, var16.field703, false, var16.field705, arg4, arg9, arg8);
            }
        } else if (arg5 == 0) {
            class66 var22;
            if (var16.field694 == -1 && var16.field726 == null) {
                var22 = var16.method189(0, arg9, var11, var12, var13, var14, -1);
            } else {
                var22 = new class57(arg3, 0, var12, var16.field694, var14, true, arg9, var13, (byte) -59, var11);
            }
            arg2.method536(field1225[arg9], arg8, null, var22, var18, 0, 742, arg10, var15, var19, arg4);
            if (var16.field698) {
                arg1.method201(false, arg5, arg4, var16.field705, arg9, arg8);
            }
        } else if (arg5 == 1) {
            class66 var23;
            if (var16.field694 == -1 && var16.field726 == null) {
                var23 = var16.method189(1, arg9, var11, var12, var13, var14, -1);
            } else {
                var23 = new class57(arg3, 1, var12, var16.field694, var14, true, arg9, var13, (byte) -59, var11);
            }
            arg2.method536(field1234[arg9], arg8, null, var23, var18, 0, 742, arg10, var15, var19, arg4);
            if (var16.field698) {
                arg1.method201(false, arg5, arg4, var16.field705, arg9, arg8);
            }
        } else if (arg5 == 2) {
            int var24 = arg9 + 1 & 0x3;
            class66 var25;
            class66 var26;
            if (var16.field694 == -1 && var16.field726 == null) {
                var25 = var16.method189(2, arg9 + 4, var11, var12, var13, var14, -1);
                var26 = var16.method189(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new class57(arg3, 2, var12, var16.field694, var14, true, arg9 + 4, var13, (byte) -59, var11);
                var26 = new class57(arg3, 2, var12, var16.field694, var14, true, var24, var13, (byte) -59, var11);
            }
            arg2.method536(field1225[arg9], arg8, var26, var25, var18, field1225[var24], 742, arg10, var15, var19, arg4);
            if (var16.field698) {
                arg1.method201(false, arg5, arg4, var16.field705, arg9, arg8);
            }
        } else if (arg5 == 3) {
            class66 var27;
            if (var16.field694 == -1 && var16.field726 == null) {
                var27 = var16.method189(3, arg9, var11, var12, var13, var14, -1);
            } else {
                var27 = new class57(arg3, 3, var12, var16.field694, var14, true, arg9, var13, (byte) -59, var11);
            }
            arg2.method536(field1234[arg9], arg8, null, var27, var18, 0, 742, arg10, var15, var19, arg4);
            if (var16.field698) {
                arg1.method201(false, arg5, arg4, var16.field705, arg9, arg8);
            }
        } else if (arg5 == 9) {
            class66 var28;
            if (var16.field694 == -1 && var16.field726 == null) {
                var28 = var16.method189(arg5, arg9, var11, var12, var13, var14, -1);
            } else {
                var28 = new class57(arg3, arg5, var12, var16.field694, var14, true, arg9, var13, (byte) -59, var11);
            }
            arg2.method538(arg10, 0, 1, 1, var19, arg4, var15, var18, 0, var28, arg8);
            if (var16.field698) {
                arg1.method202(var16.field708, var16.field703, false, var16.field705, arg4, arg9, arg8);
            }
        } else {
            if (var16.field728) {
                if (arg9 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg9 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg9 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg5 == 4) {
                class66 var33;
                if (var16.field694 == -1 && var16.field726 == null) {
                    var33 = var16.method189(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new class57(arg3, 4, var12, var16.field694, var14, true, 0, var13, (byte) -59, var11);
                }
                arg2.method537(0, var15, arg8, field1225[arg9], -691, var18, 0, arg9 * 512, var33, arg4, var19, arg10);
            } else if (arg5 == 5) {
                int var34 = 16;
                int var35 = arg2.method554(arg10, arg4, arg8);
                if (var35 > 0) {
                    var34 = class14.method192(var35 >> 14 & 0x7FFF).field731;
                }
                class66 var36;
                if (var16.field694 == -1 && var16.field726 == null) {
                    var36 = var16.method189(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class57(arg3, 4, var12, var16.field694, var14, true, 0, var13, (byte) -59, var11);
                }
                arg2.method537(field1229[arg9] * var34, var15, arg8, field1225[arg9], -691, var18, field1238[arg9] * var34, arg9 * 512, var36, arg4, var19, arg10);
            } else if (arg5 == 6) {
                class66 var37;
                if (var16.field694 == -1 && var16.field726 == null) {
                    var37 = var16.method189(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class57(arg3, 4, var12, var16.field694, var14, true, 0, var13, (byte) -59, var11);
                }
                arg2.method537(0, var15, arg8, 256, -691, var18, 0, arg9, var37, arg4, var19, arg10);
            } else if (arg5 == 7) {
                class66 var38;
                if (var16.field694 == -1 && var16.field726 == null) {
                    var38 = var16.method189(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class57(arg3, 4, var12, var16.field694, var14, true, 0, var13, (byte) -59, var11);
                }
                arg2.method537(0, var15, arg8, 512, -691, var18, 0, arg9, var38, arg4, var19, arg10);
            } else if (arg5 == 8) {
                class66 var39;
                if (var16.field694 == -1 && var16.field726 == null) {
                    var39 = var16.method189(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new class57(arg3, 4, var12, var16.field694, var14, true, 0, var13, (byte) -59, var11);
                }
                arg2.method537(0, var15, arg8, 768, -691, var18, 0, arg9, var39, arg4, var19, arg10);
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "<init>", descriptor = "([[[III[[[BI)V")
    public class44(int[][][] arg0, int arg1, int arg2, byte[][][] arg3, int arg4) {
        field1239 = 99;
        this.field1240 = arg1;
        if (arg2 != 8) {
            throw new NullPointerException();
        }
        this.field1241 = arg4;
        this.field1244 = arg0;
        this.field1222 = arg3;
        this.field1236 = new byte[4][this.field1240][this.field1241];
        this.field1243 = new byte[4][this.field1240][this.field1241];
        this.field1223 = new byte[4][this.field1240][this.field1241];
        this.field1231 = new byte[4][this.field1240][this.field1241];
        this.field1237 = new int[4][this.field1240 + 1][this.field1241 + 1];
        this.field1216 = new byte[4][this.field1240 + 1][this.field1241 + 1];
        this.field1233 = new int[this.field1240 + 1][this.field1241 + 1];
        this.field1217 = new int[this.field1241];
        this.field1218 = new int[this.field1241];
        this.field1219 = new int[this.field1241];
        this.field1220 = new int[this.field1241];
        this.field1221 = new int[this.field1241];
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(III)I")
    private final int method425(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(IIILXOHMKFIT;II[B[LDYTTVJNT;ZII)V")
    public final void method426(int arg0, int arg1, int arg2, class68 arg3, int arg4, int arg5, byte[] arg6, class16[] arg7, boolean arg8, int arg9, int arg10) {
        class17 var12 = new class17(arg6, -26583);
        int var13 = -1;
        if (arg8) {
            return;
        }
        while (true) {
            int var14 = var12.method238();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method238();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method224();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && var18 >= arg5 && var18 < arg5 + 8 && var17 >= arg4 && var17 < arg4 + 8) {
                    class14 var23 = class14.method192(var13);
                    int var24 = arg0 + class48.method441(arg10, var17 & 0x7, var18 & 0x7, var22, var23.field703, false, var23.field708);
                    int var25 = arg9 + class48.method442(var23.field703, var22, arg10, var18 & 0x7, var23.field708, var17 & 0x7, 825);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg1;
                        if ((this.field1222[1][var24][var25] & 0x2) == 2) {
                            var26 = arg1 - 1;
                        }
                        class16 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg7[var26];
                        }
                        this.method432(arg1, var25, var24, var21, var13, arg10 + var22 & 0x3, arg3, var27, this.field1215);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(BIIILEILHLJCE;III)V")
    private final void method427(byte arg0, int arg1, int arg2, int arg3, class17 arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 3) {
            return;
        }
        boolean var9 = false;
        if (arg2 < 0 || arg2 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var12 = arg4.method224();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg4.method224();
                    return;
                }
                if (var12 <= 49) {
                    arg4.method224();
                }
            }
        }
        this.field1222[arg5][arg2][arg1] = 0;
        while (true) {
            int var10 = arg4.method224();
            if (var10 == 0) {
                if (arg5 == 0) {
                    this.field1244[0][arg2][arg1] = -method416(arg2 + arg6 + 932731, arg1 + 556238 + arg3) * 8;
                    return;
                } else {
                    this.field1244[arg5][arg2][arg1] = this.field1244[arg5 - 1][arg2][arg1] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg4.method224();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg5 == 0) {
                    this.field1244[0][arg2][arg1] = -var11 * 8;
                    return;
                }
                this.field1244[arg5][arg2][arg1] = this.field1244[arg5 - 1][arg2][arg1] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field1243[arg5][arg2][arg1] = arg4.method225();
                this.field1223[arg5][arg2][arg1] = (byte) ((var10 - 2) / 4);
                this.field1231[arg5][arg2][arg1] = (byte) (var10 + arg7 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field1222[arg5][arg2][arg1] = (byte) (var10 - 49);
            } else {
                this.field1236[arg5][arg2][arg1] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(IZI[BLXOHMKFIT;[LDYTTVJNT;)V")
    public final void method428(int arg0, boolean arg1, int arg2, byte[] arg3, class68 arg4, class16[] arg5) {
        class17 var7 = new class17(arg3, -26583);
        if (!arg1) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = -1;
        while (true) {
            int var10 = var7.method238();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method238();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method224();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg0 + var14;
                int var20 = arg2 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field1222[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class16 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg5[var21];
                    }
                    this.method432(var15, var20, var19, var17, var9, var18, arg4, var22, this.field1215);
                }
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "e", descriptor = "(II)I")
    private static final int method429(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "([LDYTTVJNT;ZLXOHMKFIT;)V")
    public final void method430(class16[] arg0, boolean arg1, class68 arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1222[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1222[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method203(209, var110, var111);
                        }
                    }
                }
            }
        }
        field1235 += (int) (Math.random() * 5.0D) - 2;
        if (arg1) {
            this.field1226 = !this.field1226;
        }
        if (field1235 < -8) {
            field1235 = -8;
        }
        if (field1235 > 8) {
            field1235 = 8;
        }
        field1224 += (int) (Math.random() * 5.0D) - 2;
        if (field1224 < -16) {
            field1224 = -16;
        }
        if (field1224 > 16) {
            field1224 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1216[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1241 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1240 - 1; var101++) {
                    int var102 = this.field1244[var5][var101 + 1][var56] - this.field1244[var5][var101 - 1][var56];
                    int var103 = this.field1244[var5][var101][var56 + 1] - this.field1244[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1233[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1241; var57++) {
                this.field1217[var57] = 0;
                this.field1218[var57] = 0;
                this.field1219[var57] = 0;
                this.field1220[var57] = 0;
                this.field1221[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1240 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1241; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1240) {
                        int var96 = this.field1236[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class52 var97 = class52.field1338[var96 - 1];
                            this.field1217[var61] += var97.field1347;
                            this.field1218[var61] += var97.field1345;
                            this.field1219[var61] += var97.field1346;
                            this.field1220[var61] += var97.field1348;
                            var10002 = this.field1221[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1240) {
                        int var99 = this.field1236[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class52 var100 = class52.field1338[var99 - 1];
                            this.field1217[var61] -= var100.field1347;
                            this.field1218[var61] -= var100.field1345;
                            this.field1219[var61] -= var100.field1346;
                            this.field1220[var61] -= var100.field1348;
                            var10002 = this.field1221[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1240 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1241 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1241) {
                            var62 += this.field1217[var68];
                            var63 += this.field1218[var68];
                            var64 += this.field1219[var68];
                            var65 += this.field1220[var68];
                            var66 += this.field1221[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1241) {
                            var62 -= this.field1217[var69];
                            var63 -= this.field1218[var69];
                            var64 -= this.field1219[var69];
                            var65 -= this.field1220[var69];
                            var66 -= this.field1221[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1241 - 1 && (!field1228 || (this.field1222[0][var58][var67] & 0x2) != 0 || (this.field1222[var5][var58][var67] & 0x10) == 0 && this.method420(var58, var67, var5, false) == field1232)) {
                            if (var5 < field1239) {
                                field1239 = var5;
                            }
                            int var70 = this.field1236[var5][var58][var67] & 0xFF;
                            int var71 = this.field1243[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1244[var5][var58][var67];
                                int var73 = this.field1244[var5][var58 + 1][var67];
                                int var74 = this.field1244[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1244[var5][var58][var67 + 1];
                                int var76 = this.field1233[var58][var67];
                                int var77 = this.field1233[var58 + 1][var67];
                                int var78 = this.field1233[var58 + 1][var67 + 1];
                                int var79 = this.field1233[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method425(var82, var83, var84);
                                    int var85 = field1235 + var82 & 0xFF;
                                    int var86 = field1224 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method425(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1223[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class52.field1338[var71 - 1].field1343) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1237[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class21.field832[method419(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method533(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method419(var80, var76), method419(var80, var77), method419(var80, var78), method419(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1223[var5][var58][var67] + 1;
                                    byte var90 = this.field1231[var5][var58][var67];
                                    class52 var91 = class52.field1338[var71 - 1];
                                    int var92 = var91.field1341;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class21.method286(this.field1242, var92);
                                        var94 = -1;
                                    } else if (var91.field1340 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method425(var91.field1344, var91.field1345, var91.field1346);
                                        var93 = class21.field832[this.method422(var91.field1349, 96)];
                                    }
                                    arg2.method533(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method419(var80, var76), method419(var80, var77), method419(var80, var78), method419(var80, var79), this.method422(var94, var76), this.method422(var94, var77), this.method422(var94, var78), this.method422(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1241 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1240 - 1; var60++) {
                    arg2.method532(var5, var60, var59, this.method420(var60, var59, var5, false));
                }
            }
        }
        arg2.method559(126, -50, -50, -10);
        for (int var6 = 0; var6 < this.field1240; var6++) {
            for (int var47 = 0; var47 < this.field1241; var47++) {
                if ((this.field1222[1][var6][var47] & 0x2) == 2) {
                    arg2.method530(var47, var6, 0);
                }
            }
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
                for (int var12 = 0; var12 <= this.field1241; var12++) {
                    for (int var13 = 0; var13 <= this.field1240; var13++) {
                        if ((this.field1237[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1237[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1241 && (this.field1237[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1237[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1237[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1244[var17][var13][var14] - var21;
                                int var23 = this.field1244[var16][var13][var14];
                                class68.method531(var15 * 128 + 128, var22, 1, var13 * 128, var23, var14 * 128, (byte) 5, var13 * 128, var10);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1237[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1237[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1237[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1240 && (this.field1237[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1237[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1237[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1244[var29][var26][var12] - var33;
                                int var35 = this.field1244[var28][var26][var12];
                                class68.method531(var12 * 128, var34, 2, var27 * 128 + 128, var35, var12 * 128, (byte) 5, var26 * 128, var10);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1237[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1237[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1237[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1241 && (this.field1237[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1237[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field1240) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1237[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1244[var11][var38][var40];
                                class68.method531(var41 * 128 + 128, var44, 4, var39 * 128 + 128, var44, var40 * 128, (byte) 5, var38 * 128, var10);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1237[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "b", descriptor = "(III)I")
    private static final int method431(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method418(var3, var5);
        int var8 = method418(var3 + 1, var5);
        int var9 = method418(var3, var5 + 1);
        int var10 = method418(var3 + 1, var5 + 1);
        int var11 = method421(var7, var8, var4, arg2);
        int var12 = method421(var9, var10, var4, arg2);
        return method421(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(IIIIIILXOHMKFIT;LDYTTVJNT;I)V")
    private final void method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class68 arg6, class16 arg7, int arg8) {
        if (field1228 && (this.field1222[0][arg2][arg1] & 0x2) == 0) {
            if ((this.field1222[arg0][arg2][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method420(arg2, arg1, arg0, false) != field1232) {
                return;
            }
        }
        if (arg0 < field1239) {
            field1239 = arg0;
        }
        int var10 = this.field1244[arg0][arg2][arg1];
        int var11 = this.field1244[arg0][arg2 + 1][arg1];
        int var12 = this.field1244[arg0][arg2 + 1][arg1 + 1];
        int var13 = this.field1244[arg0][arg2][arg1 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class14 var15 = class14.method192(arg4);
        int var16 = 92 / arg8;
        int var17 = (arg4 << 14) + (arg1 << 7) + arg2 + 1073741824;
        if (!var15.field699) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg3);
        if (arg3 == 22) {
            if (!field1228 || var15.field699 || var15.field701) {
                class66 var19;
                if (var15.field694 == -1 && var15.field726 == null) {
                    var19 = var15.method189(22, arg5, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class57(arg4, 22, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
                }
                arg6.method534(var18, (byte) 6, arg1, arg2, var14, arg0, var19, var17);
                if (var15.field698 && var15.field699 && arg7 != null) {
                    arg7.method203(209, arg2, arg1);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class66 var39;
            if (var15.field694 == -1 && var15.field726 == null) {
                var39 = var15.method189(10, arg5, var10, var11, var12, var13, -1);
            } else {
                var39 = new class57(arg4, 10, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var15.field703;
                    var42 = var15.field708;
                } else {
                    var41 = var15.field708;
                    var42 = var15.field703;
                }
                if (arg6.method538(arg0, 0, var42, var41, var18, arg2, var14, var17, var40, var39, arg1) && var15.field719) {
                    class31 var43;
                    if (var39 instanceof class31) {
                        var43 = (class31) var39;
                    } else {
                        var43 = var15.method189(10, arg5, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field1024 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field1216[arg0][arg2 + var44][arg1 + var45]) {
                                    this.field1216[arg0][arg2 + var44][arg1 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field698 && arg7 != null) {
                arg7.method202(var15.field708, var15.field703, false, var15.field705, arg2, arg5, arg1);
            }
        } else if (arg3 >= 12) {
            class66 var20;
            if (var15.field694 == -1 && var15.field726 == null) {
                var20 = var15.method189(arg3, arg5, var10, var11, var12, var13, -1);
            } else {
                var20 = new class57(arg4, arg3, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
            }
            arg6.method538(arg0, 0, 1, 1, var18, arg2, var14, var17, 0, var20, arg1);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0) {
                this.field1237[arg0][arg2][arg1] |= 0x924;
            }
            if (var15.field698 && arg7 != null) {
                arg7.method202(var15.field708, var15.field703, false, var15.field705, arg2, arg5, arg1);
            }
        } else if (arg3 == 0) {
            class66 var21;
            if (var15.field694 == -1 && var15.field726 == null) {
                var21 = var15.method189(0, arg5, var10, var11, var12, var13, -1);
            } else {
                var21 = new class57(arg4, 0, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
            }
            arg6.method536(field1225[arg5], arg1, null, var21, var17, 0, 742, arg0, var14, var18, arg2);
            if (arg5 == 0) {
                if (var15.field719) {
                    this.field1216[arg0][arg2][arg1] = 50;
                    this.field1216[arg0][arg2][arg1 + 1] = 50;
                }
                if (var15.field707) {
                    this.field1237[arg0][arg2][arg1] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var15.field719) {
                    this.field1216[arg0][arg2][arg1 + 1] = 50;
                    this.field1216[arg0][arg2 + 1][arg1 + 1] = 50;
                }
                if (var15.field707) {
                    this.field1237[arg0][arg2][arg1 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var15.field719) {
                    this.field1216[arg0][arg2 + 1][arg1] = 50;
                    this.field1216[arg0][arg2 + 1][arg1 + 1] = 50;
                }
                if (var15.field707) {
                    this.field1237[arg0][arg2 + 1][arg1] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var15.field719) {
                    this.field1216[arg0][arg2][arg1] = 50;
                    this.field1216[arg0][arg2 + 1][arg1] = 50;
                }
                if (var15.field707) {
                    this.field1237[arg0][arg2][arg1] |= 0x492;
                }
            }
            if (var15.field698 && arg7 != null) {
                arg7.method201(false, arg3, arg2, var15.field705, arg5, arg1);
            }
            if (var15.field731 != 16) {
                arg6.method544(arg0, arg1, arg2, (byte) 51, var15.field731);
            }
        } else if (arg3 == 1) {
            class66 var22;
            if (var15.field694 == -1 && var15.field726 == null) {
                var22 = var15.method189(1, arg5, var10, var11, var12, var13, -1);
            } else {
                var22 = new class57(arg4, 1, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
            }
            arg6.method536(field1234[arg5], arg1, null, var22, var17, 0, 742, arg0, var14, var18, arg2);
            if (var15.field719) {
                if (arg5 == 0) {
                    this.field1216[arg0][arg2][arg1 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1216[arg0][arg2 + 1][arg1 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1216[arg0][arg2 + 1][arg1] = 50;
                } else if (arg5 == 3) {
                    this.field1216[arg0][arg2][arg1] = 50;
                }
            }
            if (var15.field698 && arg7 != null) {
                arg7.method201(false, arg3, arg2, var15.field705, arg5, arg1);
            }
        } else if (arg3 == 2) {
            int var23 = arg5 + 1 & 0x3;
            class66 var24;
            class66 var25;
            if (var15.field694 == -1 && var15.field726 == null) {
                var24 = var15.method189(2, arg5 + 4, var10, var11, var12, var13, -1);
                var25 = var15.method189(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class57(arg4, 2, var11, var15.field694, var13, true, arg5 + 4, var12, (byte) -59, var10);
                var25 = new class57(arg4, 2, var11, var15.field694, var13, true, var23, var12, (byte) -59, var10);
            }
            arg6.method536(field1225[arg5], arg1, var25, var24, var17, field1225[var23], 742, arg0, var14, var18, arg2);
            if (var15.field707) {
                if (arg5 == 0) {
                    this.field1237[arg0][arg2][arg1] |= 0x249;
                    this.field1237[arg0][arg2][arg1 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field1237[arg0][arg2][arg1 + 1] |= 0x492;
                    this.field1237[arg0][arg2 + 1][arg1] |= 0x249;
                } else if (arg5 == 2) {
                    this.field1237[arg0][arg2 + 1][arg1] |= 0x249;
                    this.field1237[arg0][arg2][arg1] |= 0x492;
                } else if (arg5 == 3) {
                    this.field1237[arg0][arg2][arg1] |= 0x492;
                    this.field1237[arg0][arg2][arg1] |= 0x249;
                }
            }
            if (var15.field698 && arg7 != null) {
                arg7.method201(false, arg3, arg2, var15.field705, arg5, arg1);
            }
            if (var15.field731 != 16) {
                arg6.method544(arg0, arg1, arg2, (byte) 51, var15.field731);
            }
        } else if (arg3 == 3) {
            class66 var26;
            if (var15.field694 == -1 && var15.field726 == null) {
                var26 = var15.method189(3, arg5, var10, var11, var12, var13, -1);
            } else {
                var26 = new class57(arg4, 3, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
            }
            arg6.method536(field1234[arg5], arg1, null, var26, var17, 0, 742, arg0, var14, var18, arg2);
            if (var15.field719) {
                if (arg5 == 0) {
                    this.field1216[arg0][arg2][arg1 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1216[arg0][arg2 + 1][arg1 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1216[arg0][arg2 + 1][arg1] = 50;
                } else if (arg5 == 3) {
                    this.field1216[arg0][arg2][arg1] = 50;
                }
            }
            if (var15.field698 && arg7 != null) {
                arg7.method201(false, arg3, arg2, var15.field705, arg5, arg1);
            }
        } else if (arg3 == 9) {
            class66 var27;
            if (var15.field694 == -1 && var15.field726 == null) {
                var27 = var15.method189(arg3, arg5, var10, var11, var12, var13, -1);
            } else {
                var27 = new class57(arg4, arg3, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
            }
            arg6.method538(arg0, 0, 1, 1, var18, arg2, var14, var17, 0, var27, arg1);
            if (var15.field698 && arg7 != null) {
                arg7.method202(var15.field708, var15.field703, false, var15.field705, arg2, arg5, arg1);
            }
        } else {
            if (var15.field728) {
                if (arg5 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg5 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg5 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg3 == 4) {
                class66 var32;
                if (var15.field694 == -1 && var15.field726 == null) {
                    var32 = var15.method189(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
                }
                arg6.method537(0, var14, arg1, field1225[arg5], -691, var17, 0, arg5 * 512, var32, arg2, var18, arg0);
            } else if (arg3 == 5) {
                int var33 = 16;
                int var34 = arg6.method554(arg0, arg2, arg1);
                if (var34 > 0) {
                    var33 = class14.method192(var34 >> 14 & 0x7FFF).field731;
                }
                class66 var35;
                if (var15.field694 == -1 && var15.field726 == null) {
                    var35 = var15.method189(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
                }
                arg6.method537(field1229[arg5] * var33, var14, arg1, field1225[arg5], -691, var17, field1238[arg5] * var33, arg5 * 512, var35, arg2, var18, arg0);
            } else if (arg3 == 6) {
                class66 var36;
                if (var15.field694 == -1 && var15.field726 == null) {
                    var36 = var15.method189(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
                }
                arg6.method537(0, var14, arg1, 256, -691, var17, 0, arg5, var36, arg2, var18, arg0);
            } else if (arg3 == 7) {
                class66 var37;
                if (var15.field694 == -1 && var15.field726 == null) {
                    var37 = var15.method189(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
                }
                arg6.method537(0, var14, arg1, 512, -691, var17, 0, arg5, var37, arg2, var18, arg0);
            } else if (arg3 == 8) {
                class66 var38;
                if (var15.field694 == -1 && var15.field726 == null) {
                    var38 = var15.method189(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
                }
                arg6.method537(0, var14, arg1, 768, -691, var17, 0, arg5, var38, arg2, var18, arg0);
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method433(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        class17 var5 = new class17(arg1, -26583);
        if (arg0 <= 0) {
            field1227 = -404;
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method238();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method238();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method224() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class14 var17 = class14.method192(var6);
                        if (var14 != 22 || !field1228 || var17.field699 || var17.field701) {
                            var4 &= var17.method188(false);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method238();
                if (var10 == 0) {
                    break;
                }
                var5.method224();
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(IIII[LDYTTVJNT;I[BZII)V")
    public final void method434(int arg0, int arg1, int arg2, int arg3, class16[] arg4, int arg5, byte[] arg6, boolean arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg8 + var11 > 0 && arg8 + var11 < 103 && arg9 + var17 > 0 && arg9 + var17 < 103) {
                    arg4[arg3].field761[arg8 + var11][arg9 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        class17 var12 = new class17(arg6, -26583);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg0 == var13 && var15 >= arg1 && var15 < arg1 + 8 && var16 >= arg5 && var16 < arg5 + 8) {
                        this.method427((byte) 3, arg9 + class48.method440(-454, var15 & 0x7, var16 & 0x7, arg2), arg8 + class48.method439(var16 & 0x7, var15 & 0x7, arg2, -100), 0, var12, arg3, 0, arg2);
                    } else {
                        this.method427((byte) 3, -1, -1, 0, var12, 0, 0, 0);
                    }
                }
            }
        }
        if (arg7) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "a", descriptor = "(I[BIZ[LDYTTVJNT;II)V")
    public final void method435(int arg0, byte[] arg1, int arg2, boolean arg3, class16[] arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 + var13 > 0 && arg6 + var13 < 103 && arg0 + var14 > 0 && arg0 + var14 < 103) {
                        arg4[var8].field761[arg6 + var13][arg0 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (!arg3) {
            return;
        }
        class17 var9 = new class17(arg1, -26583);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method427((byte) 3, arg0 + var12, arg6 + var11, arg5, var9, var10, arg2, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "OZIFXWPH", name = "c", descriptor = "(III)Z")
    public static final boolean method436(int arg0, int arg1, int arg2) {
        if (arg1 != -11550) {
            field1230 = 275;
        }
        class14 var3 = class14.method192(arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method190(401, arg0);
    }
}
