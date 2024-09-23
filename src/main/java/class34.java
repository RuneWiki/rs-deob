import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MBPQTDOR")
public class class34 {

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "B")
    private byte field999 = 6;

    @OriginalMember(owner = "MBPQTDOR", name = "v", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "MBPQTDOR", name = "w", descriptor = "I")
    private int field1021;

    @OriginalMember(owner = "MBPQTDOR", name = "r", descriptor = "[[[I")
    private int[][][] field1016;

    @OriginalMember(owner = "MBPQTDOR", name = "o", descriptor = "[[[B")
    private byte[][][] field1013;

    @OriginalMember(owner = "MBPQTDOR", name = "z", descriptor = "[[[B")
    private byte[][][] field1024;

    @OriginalMember(owner = "MBPQTDOR", name = "q", descriptor = "[[[B")
    private byte[][][] field1015;

    @OriginalMember(owner = "MBPQTDOR", name = "x", descriptor = "[[[B")
    private byte[][][] field1022;

    @OriginalMember(owner = "MBPQTDOR", name = "g", descriptor = "[[[B")
    private byte[][][] field1005;

    @OriginalMember(owner = "MBPQTDOR", name = "t", descriptor = "[[[I")
    private int[][][] field1018;

    @OriginalMember(owner = "MBPQTDOR", name = "A", descriptor = "[[[B")
    private byte[][][] field1025;

    @OriginalMember(owner = "MBPQTDOR", name = "e", descriptor = "[[I")
    private int[][] field1003;

    @OriginalMember(owner = "MBPQTDOR", name = "j", descriptor = "[I")
    private int[] field1008;

    @OriginalMember(owner = "MBPQTDOR", name = "k", descriptor = "[I")
    private int[] field1009;

    @OriginalMember(owner = "MBPQTDOR", name = "l", descriptor = "[I")
    private int[] field1010;

    @OriginalMember(owner = "MBPQTDOR", name = "m", descriptor = "[I")
    private int[] field1011;

    @OriginalMember(owner = "MBPQTDOR", name = "n", descriptor = "[I")
    private int[] field1012;

    @OriginalMember(owner = "MBPQTDOR", name = "c", descriptor = "Z")
    public static boolean field1001 = true;

    @OriginalMember(owner = "MBPQTDOR", name = "d", descriptor = "[I")
    private static final int[] field1002 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "MBPQTDOR", name = "f", descriptor = "[I")
    private static final int[] field1004 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "MBPQTDOR", name = "h", descriptor = "[I")
    private static final int[] field1006 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "MBPQTDOR", name = "i", descriptor = "I")
    private static int field1007 = -32174;

    @OriginalMember(owner = "MBPQTDOR", name = "p", descriptor = "[I")
    private static final int[] field1014 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "MBPQTDOR", name = "s", descriptor = "I")
    private static int field1017 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "MBPQTDOR", name = "u", descriptor = "I")
    public static int field1019 = 99;

    @OriginalMember(owner = "MBPQTDOR", name = "y", descriptor = "I")
    private static int field1023 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "MBPQTDOR", name = "b", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(I[LGDVKBIIV;IIII[B)V")
    public final void method312(int arg0, class22[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        if (arg4 != 0) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 + var13 > 0 && arg2 + var13 < 103 && arg5 + var14 > 0 && arg5 + var14 < 103) {
                        arg1[var8].field813[arg2 + var13][arg5 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class68 var9 = new class68(arg6, -103);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method330(arg0, arg3, -501, arg5 + var12, var10, arg2 + var11, 0, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(IIII)I")
    public int method313(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return field1007;
        } else if ((this.field1013[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (this.field1013[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method314(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        if (arg0 < 9 || arg0 > 9) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        class68 var6 = new class68(arg2, -103);
        int var7 = -1;
        label55: while (true) {
            int var8 = var6.method563();
            if (var8 == 0) {
                return var4;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method563();
                    if (var12 == 0) {
                        continue label55;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var6.method549() >> 2;
                    int var16 = arg3 + var14;
                    int var17 = arg1 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class48 var18 = class48.method410(var7);
                        if (var15 != 22 || !field1001 || var18.field1271 || var18.field1253) {
                            var4 &= var18.method413(8);
                            var10 = true;
                        }
                    }
                }
                int var11 = var6.method563();
                if (var11 == 0) {
                    break;
                }
                var6.method549();
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(II)I")
    private static final int method315(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(III)Z")
    public static final boolean method316(int arg0, int arg1, int arg2) {
        class48 var3 = class48.method410(arg1);
        if (arg2 != -13964) {
            throw new NullPointerException();
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method411(true, arg0);
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(ZLUUFZOKXH;LYOXDZEVD;)V")
    public static final void method317(boolean arg0, class54 arg1, class68 arg2) {
        int var3 = -1;
        if (!arg0) {
            field1007 = 193;
        }
        while (true) {
            int var4 = arg2.method563();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class48 var5 = class48.method410(var3);
            var5.method403(arg1, true);
            while (true) {
                int var6 = arg2.method563();
                if (var6 == 0) {
                    break;
                }
                arg2.method549();
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "b", descriptor = "(II)I")
    private static final int method318(int arg0, int arg1) {
        int var2 = method315(arg0 - 1, arg1 - 1) + method315(arg0 + 1, arg1 - 1) + method315(arg0 - 1, arg1 + 1) + method315(arg0 + 1, arg1 + 1);
        int var3 = method315(arg0 - 1, arg1) + method315(arg0 + 1, arg1) + method315(arg0, arg1 - 1) + method315(arg0, arg1 + 1);
        int var4 = method315(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(I[LGDVKBIIV;IIIIZII[B)V")
    public final void method319(int arg0, class22[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, byte[] arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg5 + var11 > 0 && arg5 + var11 < 103 && arg8 + var17 > 0 && arg8 + var17 < 103) {
                    arg1[arg0].field813[arg5 + var11][arg8 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        class68 var12 = new class68(arg9, -103);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg3 == var13 && var15 >= arg2 && var15 < arg2 + 8 && var16 >= arg4 && var16 < arg4 + 8) {
                        this.method330(0, 0, -501, arg8 + class52.method427(var15 & 0x7, var16 & 0x7, 345, arg7), arg0, arg5 + class52.method426(arg7, var16 & 0x7, -29921, var15 & 0x7), arg7, var12);
                    } else {
                        this.method330(0, 0, -501, -1, 0, -1, 0, var12);
                    }
                }
            }
        }
        if (!arg6) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(II[LGDVKBIIV;[BZLVNYQVBWD;)V")
    public final void method320(int arg0, int arg1, class22[] arg2, byte[] arg3, boolean arg4, class56 arg5) {
        class68 var7 = new class68(arg3, -103);
        if (!arg4) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = -1;
        while (true) {
            int var10 = var7.method563();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method563();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method549();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg1 + var14;
                int var20 = arg0 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field1013[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class22 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg2[var21];
                    }
                    this.method331(arg5, var17, var15, var9, (byte) 10, var22, var18, var19, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "<init>", descriptor = "(I[[[B[[[III)V")
    public class34(int arg0, byte[][][] arg1, int[][][] arg2, int arg3, int arg4) {
        field1019 = 99;
        this.field1020 = arg3;
        this.field1021 = arg4;
        this.field1016 = arg2;
        this.field1013 = arg1;
        this.field1024 = new byte[4][this.field1020][this.field1021];
        this.field1015 = new byte[4][this.field1020][this.field1021];
        this.field1022 = new byte[4][this.field1020][this.field1021];
        this.field1005 = new byte[4][this.field1020][this.field1021];
        this.field1018 = new int[4][this.field1020 + 1][this.field1021 + 1];
        if (field1007 != arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1025 = new byte[4][this.field1020 + 1][this.field1021 + 1];
        this.field1003 = new int[this.field1020 + 1][this.field1021 + 1];
        this.field1008 = new int[this.field1021];
        this.field1009 = new int[this.field1021];
        this.field1010 = new int[this.field1021];
        this.field1011 = new int[this.field1021];
        this.field1012 = new int[this.field1021];
    }

    @OriginalMember(owner = "MBPQTDOR", name = "b", descriptor = "(III)I")
    private static final int method321(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method318(var3, var5);
        int var8 = method318(var3 + 1, var5);
        int var9 = method318(var3, var5 + 1);
        int var10 = method318(var3 + 1, var5 + 1);
        int var11 = method324(var7, var8, var4, arg2);
        int var12 = method324(var9, var10, var4, arg2);
        return method324(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(ILVNYQVBWD;IIIII[B[LGDVKBIIV;II)V")
    public final void method322(int arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class22[] arg8, int arg9, int arg10) {
        class68 var12 = new class68(arg7, -103);
        if (arg0 != 47822) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = -1;
        while (true) {
            int var15 = var12.method563();
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method563();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method549();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg10 == var20 && var19 >= arg4 && var19 < arg4 + 8 && var18 >= arg5 && var18 < arg5 + 8) {
                    class48 var24 = class48.method410(var14);
                    int var25 = arg9 + class52.method428(var24.field1289, false, var19 & 0x7, var24.field1255, arg3, var18 & 0x7);
                    int var26 = arg6 + class52.method429(arg3, var18 & 0x7, var24.field1255, (byte) -71, var19 & 0x7, var24.field1289);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = var20;
                        if ((this.field1013[1][var25][var26] & 0x2) == 2) {
                            var27 = var20 - 1;
                        }
                        class22 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg8[var27];
                        }
                        this.method331(arg1, var22, var20, var14, (byte) 10, var28, arg3 + var23 & 0x3, var25, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(LGDVKBIIV;IIIIILVNYQVBWD;II[[[II)V")
    public static final void method323(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class56 arg6, int arg7, int arg8, int[][][] arg9, int arg10) {
        if (arg7 < 8 || arg7 > 8) {
            field1007 = -157;
        }
        int var11 = arg9[arg4][arg2][arg1];
        int var12 = arg9[arg4][arg2 + 1][arg1];
        int var13 = arg9[arg4][arg2 + 1][arg1 + 1];
        int var14 = arg9[arg4][arg2][arg1 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class48 var16 = class48.method410(arg8);
        int var17 = (arg8 << 14) + (arg1 << 7) + arg2 + 1073741824;
        if (!var16.field1271) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg3 << 6) + arg5);
        if (arg5 == 22) {
            class64 var19;
            if (var16.field1249 == -1 && var16.field1251 == null) {
                var19 = var16.method405(22, arg3, var11, var12, var13, var14, -1);
            } else {
                var19 = new class8(arg3, var13, 22, true, var16.field1249, arg8, var11, var12, var14, 0);
            }
            arg6.method463(arg1, arg2, var17, var19, var18, 664, var15, arg10);
            if (var16.field1254 && var16.field1271) {
                arg0.method218(arg1, arg2, (byte) -97);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class64 var39;
            if (var16.field1249 == -1 && var16.field1251 == null) {
                var39 = var16.method405(10, arg3, var11, var12, var13, var14, -1);
            } else {
                var39 = new class8(arg3, var13, 10, true, var16.field1249, arg8, var11, var12, var14, 0);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg5 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var16.field1255;
                    var42 = var16.field1289;
                } else {
                    var41 = var16.field1289;
                    var42 = var16.field1255;
                }
                arg6.method467(var39, var40, var41, var18, var42, var15, arg10, arg1, arg2, var17, false);
            }
            if (var16.field1254) {
                arg0.method217(arg3, var16.field1255, arg1, var16.field1289, arg2, 0, var16.field1295);
            }
        } else if (arg5 >= 12) {
            class64 var20;
            if (var16.field1249 == -1 && var16.field1251 == null) {
                var20 = var16.method405(arg5, arg3, var11, var12, var13, var14, -1);
            } else {
                var20 = new class8(arg3, var13, arg5, true, var16.field1249, arg8, var11, var12, var14, 0);
            }
            arg6.method467(var20, 0, 1, var18, 1, var15, arg10, arg1, arg2, var17, false);
            if (var16.field1254) {
                arg0.method217(arg3, var16.field1255, arg1, var16.field1289, arg2, 0, var16.field1295);
            }
        } else if (arg5 == 0) {
            class64 var21;
            if (var16.field1249 == -1 && var16.field1251 == null) {
                var21 = var16.method405(0, arg3, var11, var12, var13, var14, -1);
            } else {
                var21 = new class8(arg3, var13, 0, true, var16.field1249, arg8, var11, var12, var14, 0);
            }
            arg6.method465(var18, field1014[arg3], null, arg10, (byte) -128, 0, var15, arg1, var21, arg2, var17);
            if (var16.field1254) {
                arg0.method216(false, arg1, var16.field1295, arg5, arg3, arg2);
            }
        } else if (arg5 == 1) {
            class64 var22;
            if (var16.field1249 == -1 && var16.field1251 == null) {
                var22 = var16.method405(1, arg3, var11, var12, var13, var14, -1);
            } else {
                var22 = new class8(arg3, var13, 1, true, var16.field1249, arg8, var11, var12, var14, 0);
            }
            arg6.method465(var18, field1002[arg3], null, arg10, (byte) -128, 0, var15, arg1, var22, arg2, var17);
            if (var16.field1254) {
                arg0.method216(false, arg1, var16.field1295, arg5, arg3, arg2);
            }
        } else if (arg5 == 2) {
            int var23 = arg3 + 1 & 0x3;
            class64 var24;
            class64 var25;
            if (var16.field1249 == -1 && var16.field1251 == null) {
                var24 = var16.method405(2, arg3 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method405(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class8(arg3 + 4, var13, 2, true, var16.field1249, arg8, var11, var12, var14, 0);
                var25 = new class8(var23, var13, 2, true, var16.field1249, arg8, var11, var12, var14, 0);
            }
            arg6.method465(var18, field1014[arg3], var25, arg10, (byte) -128, field1014[var23], var15, arg1, var24, arg2, var17);
            if (var16.field1254) {
                arg0.method216(false, arg1, var16.field1295, arg5, arg3, arg2);
            }
        } else if (arg5 == 3) {
            class64 var26;
            if (var16.field1249 == -1 && var16.field1251 == null) {
                var26 = var16.method405(3, arg3, var11, var12, var13, var14, -1);
            } else {
                var26 = new class8(arg3, var13, 3, true, var16.field1249, arg8, var11, var12, var14, 0);
            }
            arg6.method465(var18, field1002[arg3], null, arg10, (byte) -128, 0, var15, arg1, var26, arg2, var17);
            if (var16.field1254) {
                arg0.method216(false, arg1, var16.field1295, arg5, arg3, arg2);
            }
        } else if (arg5 == 9) {
            class64 var27;
            if (var16.field1249 == -1 && var16.field1251 == null) {
                var27 = var16.method405(arg5, arg3, var11, var12, var13, var14, -1);
            } else {
                var27 = new class8(arg3, var13, arg5, true, var16.field1249, arg8, var11, var12, var14, 0);
            }
            arg6.method467(var27, 0, 1, var18, 1, var15, arg10, arg1, arg2, var17, false);
            if (var16.field1254) {
                arg0.method217(arg3, var16.field1255, arg1, var16.field1289, arg2, 0, var16.field1295);
            }
        } else {
            if (var16.field1281) {
                if (arg3 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg3 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg3 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg5 == 4) {
                class64 var32;
                if (var16.field1249 == -1 && var16.field1251 == null) {
                    var32 = var16.method405(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class8(0, var13, 4, true, var16.field1249, arg8, var11, var12, var14, 0);
                }
                arg6.method466(var32, field1014[arg3], var17, 0, arg3 * 512, arg2, var18, arg1, 0, false, arg10, var15);
            } else if (arg5 == 5) {
                int var33 = 16;
                int var34 = arg6.method483(arg10, arg2, arg1);
                if (var34 > 0) {
                    var33 = class48.method410(var34 >> 14 & 0x7FFF).field1279;
                }
                class64 var35;
                if (var16.field1249 == -1 && var16.field1251 == null) {
                    var35 = var16.method405(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class8(0, var13, 4, true, var16.field1249, arg8, var11, var12, var14, 0);
                }
                arg6.method466(var35, field1014[arg3], var17, field1004[arg3] * var33, arg3 * 512, arg2, var18, arg1, field1006[arg3] * var33, false, arg10, var15);
            } else if (arg5 == 6) {
                class64 var36;
                if (var16.field1249 == -1 && var16.field1251 == null) {
                    var36 = var16.method405(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class8(0, var13, 4, true, var16.field1249, arg8, var11, var12, var14, 0);
                }
                arg6.method466(var36, 256, var17, 0, arg3, arg2, var18, arg1, 0, false, arg10, var15);
            } else if (arg5 == 7) {
                class64 var37;
                if (var16.field1249 == -1 && var16.field1251 == null) {
                    var37 = var16.method405(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class8(0, var13, 4, true, var16.field1249, arg8, var11, var12, var14, 0);
                }
                arg6.method466(var37, 512, var17, 0, arg3, arg2, var18, arg1, 0, false, arg10, var15);
            } else if (arg5 == 8) {
                class64 var38;
                if (var16.field1249 == -1 && var16.field1251 == null) {
                    var38 = var16.method405(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class8(0, var13, 4, true, var16.field1249, arg8, var11, var12, var14, 0);
                }
                arg6.method466(var38, 768, var17, 0, arg3, arg2, var18, arg1, 0, false, arg10, var15);
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "b", descriptor = "(IIII)I")
    private static final int method324(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class33.field986[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "MBPQTDOR", name = "c", descriptor = "(II)I")
    private static final int method325(int arg0, int arg1) {
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

    @OriginalMember(owner = "MBPQTDOR", name = "c", descriptor = "(III)I")
    private final int method326(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "MBPQTDOR", name = "d", descriptor = "(II)I")
    private final int method327(int arg0, int arg1) {
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

    @OriginalMember(owner = "MBPQTDOR", name = "e", descriptor = "(II)I")
    private static final int method328(int arg0, int arg1) {
        int var2 = method321(arg0 + 45365, arg1 + 91923, 4) + (method321(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method321(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(ZIIII)V")
    public final void method329(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
            for (int var8 = arg4; var8 <= arg1 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field1020 && var6 >= 0 && var6 < this.field1021) {
                    this.field1025[0][var8][var6] = 127;
                    if (arg4 == var8 && var8 > 0) {
                        this.field1016[0][var8][var6] = this.field1016[0][var8 - 1][var6];
                    }
                    if (arg1 + arg4 == var8 && var8 < this.field1020 - 1) {
                        this.field1016[0][var8][var6] = this.field1016[0][var8 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field1016[0][var8][var6] = this.field1016[0][var8][var6 - 1];
                    }
                    if (arg2 + arg3 == var6 && var6 < this.field1021 - 1) {
                        this.field1016[0][var8][var6] = this.field1016[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(IIIIIIILYOXDZEVD;)V")
    private final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class68 arg7) {
        if (arg2 >= 0) {
            return;
        }
        if (arg5 < 0 || arg5 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg7.method549();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method549();
                    return;
                }
                if (var11 <= 49) {
                    arg7.method549();
                }
            }
        }
        this.field1013[arg4][arg5][arg3] = 0;
        while (true) {
            int var9 = arg7.method549();
            if (var9 == 0) {
                if (arg4 == 0) {
                    this.field1016[0][arg5][arg3] = -method328(arg5 + arg1 + 932731, arg3 + 556238 + arg0) * 8;
                    return;
                } else {
                    this.field1016[arg4][arg5][arg3] = this.field1016[arg4 - 1][arg5][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method549();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg4 == 0) {
                    this.field1016[0][arg5][arg3] = -var10 * 8;
                    return;
                }
                this.field1016[arg4][arg5][arg3] = this.field1016[arg4 - 1][arg5][arg3] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1015[arg4][arg5][arg3] = arg7.method550();
                this.field1022[arg4][arg5][arg3] = (byte) ((var9 - 2) / 4);
                this.field1005[arg4][arg5][arg3] = (byte) (var9 + arg6 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1013[arg4][arg5][arg3] = (byte) (var9 - 49);
            } else {
                this.field1024[arg4][arg5][arg3] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(LVNYQVBWD;IIIBLGDVKBIIV;III)V")
    private final void method331(class56 arg0, int arg1, int arg2, int arg3, byte arg4, class22 arg5, int arg6, int arg7, int arg8) {
        if (field1001 && (this.field1013[0][arg7][arg8] & 0x2) == 0) {
            if ((this.field1013[arg2][arg7][arg8] & 0x10) != 0) {
                return;
            }
            if (this.method313(arg7, arg8, arg2, 0) != field1000) {
                return;
            }
        }
        if (arg2 < field1019) {
            field1019 = arg2;
        }
        int var10 = this.field1016[arg2][arg7][arg8];
        int var11 = this.field1016[arg2][arg7 + 1][arg8];
        int var12 = this.field1016[arg2][arg7 + 1][arg8 + 1];
        int var13 = this.field1016[arg2][arg7][arg8 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class48 var15 = class48.method410(arg3);
        int var16 = (arg3 << 14) + (arg8 << 7) + arg7 + 1073741824;
        if (!var15.field1271) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg6 << 6) + arg1);
        if (arg4 != 10) {
            field1007 = 317;
        }
        if (arg1 == 22) {
            if (!field1001 || var15.field1271 || var15.field1253) {
                class64 var18;
                if (var15.field1249 == -1 && var15.field1251 == null) {
                    var18 = var15.method405(22, arg6, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class8(arg6, var12, 22, true, var15.field1249, arg3, var10, var11, var13, 0);
                }
                arg0.method463(arg8, arg7, var16, var18, var17, 664, var14, arg2);
                if (var15.field1254 && var15.field1271 && arg5 != null) {
                    arg5.method218(arg8, arg7, (byte) -97);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class64 var38;
            if (var15.field1249 == -1 && var15.field1251 == null) {
                var38 = var15.method405(10, arg6, var10, var11, var12, var13, -1);
            } else {
                var38 = new class8(arg6, var12, 10, true, var15.field1249, arg3, var10, var11, var13, 0);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg1 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg6 == 1 || arg6 == 3) {
                    var40 = var15.field1255;
                    var41 = var15.field1289;
                } else {
                    var40 = var15.field1289;
                    var41 = var15.field1255;
                }
                if (arg0.method467(var38, var39, var40, var17, var41, var14, arg2, arg8, arg7, var16, false) && var15.field1261) {
                    class39 var42;
                    if (var38 instanceof class39) {
                        var42 = (class39) var38;
                    } else {
                        var42 = var15.method405(10, arg6, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1130 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1025[arg2][arg7 + var43][arg8 + var44]) {
                                    this.field1025[arg2][arg7 + var43][arg8 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1254 && arg5 != null) {
                arg5.method217(arg6, var15.field1255, arg8, var15.field1289, arg7, 0, var15.field1295);
            }
        } else if (arg1 >= 12) {
            class64 var19;
            if (var15.field1249 == -1 && var15.field1251 == null) {
                var19 = var15.method405(arg1, arg6, var10, var11, var12, var13, -1);
            } else {
                var19 = new class8(arg6, var12, arg1, true, var15.field1249, arg3, var10, var11, var13, 0);
            }
            arg0.method467(var19, 0, 1, var17, 1, var14, arg2, arg8, arg7, var16, false);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg2 > 0) {
                this.field1018[arg2][arg7][arg8] |= 0x924;
            }
            if (var15.field1254 && arg5 != null) {
                arg5.method217(arg6, var15.field1255, arg8, var15.field1289, arg7, 0, var15.field1295);
            }
        } else if (arg1 == 0) {
            class64 var20;
            if (var15.field1249 == -1 && var15.field1251 == null) {
                var20 = var15.method405(0, arg6, var10, var11, var12, var13, -1);
            } else {
                var20 = new class8(arg6, var12, 0, true, var15.field1249, arg3, var10, var11, var13, 0);
            }
            arg0.method465(var17, field1014[arg6], null, arg2, (byte) -128, 0, var14, arg8, var20, arg7, var16);
            if (arg6 == 0) {
                if (var15.field1261) {
                    this.field1025[arg2][arg7][arg8] = 50;
                    this.field1025[arg2][arg7][arg8 + 1] = 50;
                }
                if (var15.field1264) {
                    this.field1018[arg2][arg7][arg8] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var15.field1261) {
                    this.field1025[arg2][arg7][arg8 + 1] = 50;
                    this.field1025[arg2][arg7 + 1][arg8 + 1] = 50;
                }
                if (var15.field1264) {
                    this.field1018[arg2][arg7][arg8 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var15.field1261) {
                    this.field1025[arg2][arg7 + 1][arg8] = 50;
                    this.field1025[arg2][arg7 + 1][arg8 + 1] = 50;
                }
                if (var15.field1264) {
                    this.field1018[arg2][arg7 + 1][arg8] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var15.field1261) {
                    this.field1025[arg2][arg7][arg8] = 50;
                    this.field1025[arg2][arg7 + 1][arg8] = 50;
                }
                if (var15.field1264) {
                    this.field1018[arg2][arg7][arg8] |= 0x492;
                }
            }
            if (var15.field1254 && arg5 != null) {
                arg5.method216(false, arg8, var15.field1295, arg1, arg6, arg7);
            }
            if (var15.field1279 != 16) {
                arg0.method473(arg7, 0, arg2, var15.field1279, arg8);
            }
        } else if (arg1 == 1) {
            class64 var21;
            if (var15.field1249 == -1 && var15.field1251 == null) {
                var21 = var15.method405(1, arg6, var10, var11, var12, var13, -1);
            } else {
                var21 = new class8(arg6, var12, 1, true, var15.field1249, arg3, var10, var11, var13, 0);
            }
            arg0.method465(var17, field1002[arg6], null, arg2, (byte) -128, 0, var14, arg8, var21, arg7, var16);
            if (var15.field1261) {
                if (arg6 == 0) {
                    this.field1025[arg2][arg7][arg8 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field1025[arg2][arg7 + 1][arg8 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field1025[arg2][arg7 + 1][arg8] = 50;
                } else if (arg6 == 3) {
                    this.field1025[arg2][arg7][arg8] = 50;
                }
            }
            if (var15.field1254 && arg5 != null) {
                arg5.method216(false, arg8, var15.field1295, arg1, arg6, arg7);
            }
        } else if (arg1 == 2) {
            int var22 = arg6 + 1 & 0x3;
            class64 var23;
            class64 var24;
            if (var15.field1249 == -1 && var15.field1251 == null) {
                var23 = var15.method405(2, arg6 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method405(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class8(arg6 + 4, var12, 2, true, var15.field1249, arg3, var10, var11, var13, 0);
                var24 = new class8(var22, var12, 2, true, var15.field1249, arg3, var10, var11, var13, 0);
            }
            arg0.method465(var17, field1014[arg6], var24, arg2, (byte) -128, field1014[var22], var14, arg8, var23, arg7, var16);
            if (var15.field1264) {
                if (arg6 == 0) {
                    this.field1018[arg2][arg7][arg8] |= 0x249;
                    this.field1018[arg2][arg7][arg8 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field1018[arg2][arg7][arg8 + 1] |= 0x492;
                    this.field1018[arg2][arg7 + 1][arg8] |= 0x249;
                } else if (arg6 == 2) {
                    this.field1018[arg2][arg7 + 1][arg8] |= 0x249;
                    this.field1018[arg2][arg7][arg8] |= 0x492;
                } else if (arg6 == 3) {
                    this.field1018[arg2][arg7][arg8] |= 0x492;
                    this.field1018[arg2][arg7][arg8] |= 0x249;
                }
            }
            if (var15.field1254 && arg5 != null) {
                arg5.method216(false, arg8, var15.field1295, arg1, arg6, arg7);
            }
            if (var15.field1279 != 16) {
                arg0.method473(arg7, 0, arg2, var15.field1279, arg8);
            }
        } else if (arg1 == 3) {
            class64 var25;
            if (var15.field1249 == -1 && var15.field1251 == null) {
                var25 = var15.method405(3, arg6, var10, var11, var12, var13, -1);
            } else {
                var25 = new class8(arg6, var12, 3, true, var15.field1249, arg3, var10, var11, var13, 0);
            }
            arg0.method465(var17, field1002[arg6], null, arg2, (byte) -128, 0, var14, arg8, var25, arg7, var16);
            if (var15.field1261) {
                if (arg6 == 0) {
                    this.field1025[arg2][arg7][arg8 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field1025[arg2][arg7 + 1][arg8 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field1025[arg2][arg7 + 1][arg8] = 50;
                } else if (arg6 == 3) {
                    this.field1025[arg2][arg7][arg8] = 50;
                }
            }
            if (var15.field1254 && arg5 != null) {
                arg5.method216(false, arg8, var15.field1295, arg1, arg6, arg7);
            }
        } else if (arg1 == 9) {
            class64 var26;
            if (var15.field1249 == -1 && var15.field1251 == null) {
                var26 = var15.method405(arg1, arg6, var10, var11, var12, var13, -1);
            } else {
                var26 = new class8(arg6, var12, arg1, true, var15.field1249, arg3, var10, var11, var13, 0);
            }
            arg0.method467(var26, 0, 1, var17, 1, var14, arg2, arg8, arg7, var16, false);
            if (var15.field1254 && arg5 != null) {
                arg5.method217(arg6, var15.field1255, arg8, var15.field1289, arg7, 0, var15.field1295);
            }
        } else {
            if (var15.field1281) {
                if (arg6 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg6 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg6 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg1 == 4) {
                class64 var31;
                if (var15.field1249 == -1 && var15.field1251 == null) {
                    var31 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class8(0, var12, 4, true, var15.field1249, arg3, var10, var11, var13, 0);
                }
                arg0.method466(var31, field1014[arg6], var16, 0, arg6 * 512, arg7, var17, arg8, 0, false, arg2, var14);
            } else if (arg1 == 5) {
                int var32 = 16;
                int var33 = arg0.method483(arg2, arg7, arg8);
                if (var33 > 0) {
                    var32 = class48.method410(var33 >> 14 & 0x7FFF).field1279;
                }
                class64 var34;
                if (var15.field1249 == -1 && var15.field1251 == null) {
                    var34 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class8(0, var12, 4, true, var15.field1249, arg3, var10, var11, var13, 0);
                }
                arg0.method466(var34, field1014[arg6], var16, field1004[arg6] * var32, arg6 * 512, arg7, var17, arg8, field1006[arg6] * var32, false, arg2, var14);
            } else if (arg1 == 6) {
                class64 var35;
                if (var15.field1249 == -1 && var15.field1251 == null) {
                    var35 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class8(0, var12, 4, true, var15.field1249, arg3, var10, var11, var13, 0);
                }
                arg0.method466(var35, 256, var16, 0, arg6, arg7, var17, arg8, 0, false, arg2, var14);
            } else if (arg1 == 7) {
                class64 var36;
                if (var15.field1249 == -1 && var15.field1251 == null) {
                    var36 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class8(0, var12, 4, true, var15.field1249, arg3, var10, var11, var13, 0);
                }
                arg0.method466(var36, 512, var16, 0, arg6, arg7, var17, arg8, 0, false, arg2, var14);
            } else if (arg1 == 8) {
                class64 var37;
                if (var15.field1249 == -1 && var15.field1251 == null) {
                    var37 = var15.method405(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class8(0, var12, 4, true, var15.field1249, arg3, var10, var11, var13, 0);
                }
                arg0.method466(var37, 768, var16, 0, arg6, arg7, var17, arg8, 0, false, arg2, var14);
            }
        }
    }

    @OriginalMember(owner = "MBPQTDOR", name = "a", descriptor = "(LVNYQVBWD;B[LGDVKBIIV;)V")
    public final void method332(class56 arg0, byte arg1, class22[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var112 = 0; var112 < 104; var112++) {
                for (int var113 = 0; var113 < 104; var113++) {
                    if ((this.field1013[var4][var112][var113] & 0x1) == 1) {
                        int var114 = var4;
                        if ((this.field1013[1][var112][var113] & 0x2) == 2) {
                            var114 = var4 - 1;
                        }
                        if (var114 >= 0) {
                            arg2[var114].method218(var113, var112, (byte) -97);
                        }
                    }
                }
            }
        }
        field1023 += (int) (Math.random() * 5.0D) - 2;
        if (field1023 < -8) {
            field1023 = -8;
        }
        if (field1023 > 8) {
            field1023 = 8;
        }
        field1017 += (int) (Math.random() * 5.0D) - 2;
        if (field1017 < -16) {
            field1017 = -16;
        }
        if (field1017 > 16) {
            field1017 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var50 = this.field1025[var5];
            byte var51 = 96;
            short var52 = 768;
            byte var53 = -50;
            byte var54 = -10;
            byte var55 = -50;
            int var56 = (int) Math.sqrt((double) (var55 * var55 + var53 * var53 + var54 * var54));
            int var57 = var52 * var56 >> 8;
            for (int var58 = 1; var58 < this.field1021 - 1; var58++) {
                for (int var103 = 1; var103 < this.field1020 - 1; var103++) {
                    int var104 = this.field1016[var5][var103 + 1][var58] - this.field1016[var5][var103 - 1][var58];
                    int var105 = this.field1016[var5][var103][var58 + 1] - this.field1016[var5][var103][var58 - 1];
                    int var106 = (int) Math.sqrt((double) (var105 * var105 + var104 * var104 + 65536));
                    int var107 = (var104 << 8) / var106;
                    int var108 = 65536 / var106;
                    int var109 = (var105 << 8) / var106;
                    int var110 = (var55 * var109 + var53 * var107 + var54 * var108) / var57 + var51;
                    int var111 = (var50[var103][var58] >> 1) + (var50[var103][var58 + 1] >> 3) + (var50[var103][var58 - 1] >> 2) + (var50[var103 - 1][var58] >> 2) + (var50[var103 + 1][var58] >> 3);
                    this.field1003[var103][var58] = var110 - var111;
                }
            }
            for (int var59 = 0; var59 < this.field1021; var59++) {
                this.field1008[var59] = 0;
                this.field1009[var59] = 0;
                this.field1010[var59] = 0;
                this.field1011[var59] = 0;
                this.field1012[var59] = 0;
            }
            for (int var60 = -5; var60 < this.field1020 + 5; var60++) {
                for (int var63 = 0; var63 < this.field1021; var63++) {
                    int var97 = var60 + 5;
                    int var10002;
                    if (var97 >= 0 && var97 < this.field1020) {
                        int var98 = this.field1024[var5][var97][var63] & 0xFF;
                        if (var98 > 0) {
                            class62 var99 = class62.field1509[var98 - 1];
                            this.field1008[var63] += var99.field1518;
                            this.field1009[var63] += var99.field1516;
                            this.field1010[var63] += var99.field1517;
                            this.field1011[var63] += var99.field1519;
                            var10002 = this.field1012[var63]++;
                        }
                    }
                    int var100 = var60 - 5;
                    if (var100 >= 0 && var100 < this.field1020) {
                        int var101 = this.field1024[var5][var100][var63] & 0xFF;
                        if (var101 > 0) {
                            class62 var102 = class62.field1509[var101 - 1];
                            this.field1008[var63] -= var102.field1518;
                            this.field1009[var63] -= var102.field1516;
                            this.field1010[var63] -= var102.field1517;
                            this.field1011[var63] -= var102.field1519;
                            var10002 = this.field1012[var63]--;
                        }
                    }
                }
                if (var60 >= 1 && var60 < this.field1020 - 1) {
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    int var68 = 0;
                    for (int var69 = -5; var69 < this.field1021 + 5; var69++) {
                        int var70 = var69 + 5;
                        if (var70 >= 0 && var70 < this.field1021) {
                            var64 += this.field1008[var70];
                            var65 += this.field1009[var70];
                            var66 += this.field1010[var70];
                            var67 += this.field1011[var70];
                            var68 += this.field1012[var70];
                        }
                        int var71 = var69 - 5;
                        if (var71 >= 0 && var71 < this.field1021) {
                            var64 -= this.field1008[var71];
                            var65 -= this.field1009[var71];
                            var66 -= this.field1010[var71];
                            var67 -= this.field1011[var71];
                            var68 -= this.field1012[var71];
                        }
                        if (var69 >= 1 && var69 < this.field1021 - 1 && (!field1001 || (this.field1013[0][var60][var69] & 0x2) != 0 || (this.field1013[var5][var60][var69] & 0x10) == 0 && this.method313(var60, var69, var5, 0) == field1000)) {
                            if (var5 < field1019) {
                                field1019 = var5;
                            }
                            int var72 = this.field1024[var5][var60][var69] & 0xFF;
                            int var73 = this.field1015[var5][var60][var69] & 0xFF;
                            if (var72 > 0 || var73 > 0) {
                                int var74 = this.field1016[var5][var60][var69];
                                int var75 = this.field1016[var5][var60 + 1][var69];
                                int var76 = this.field1016[var5][var60 + 1][var69 + 1];
                                int var77 = this.field1016[var5][var60][var69 + 1];
                                int var78 = this.field1003[var60][var69];
                                int var79 = this.field1003[var60 + 1][var69];
                                int var80 = this.field1003[var60 + 1][var69 + 1];
                                int var81 = this.field1003[var60][var69 + 1];
                                int var82 = -1;
                                int var83 = -1;
                                if (var72 > 0) {
                                    int var84 = var64 * 256 / var67;
                                    int var85 = var65 / var68;
                                    int var86 = var66 / var68;
                                    var82 = this.method326(var84, var85, var86);
                                    int var87 = field1023 + var84 & 0xFF;
                                    int var88 = field1017 + var86;
                                    if (var88 < 0) {
                                        var88 = 0;
                                    } else if (var88 > 255) {
                                        var88 = 255;
                                    }
                                    var83 = this.method326(var87, var85, var88);
                                }
                                if (var5 > 0) {
                                    boolean var89 = true;
                                    if (var72 == 0 && this.field1022[var5][var60][var69] != 0) {
                                        var89 = false;
                                    }
                                    if (var73 > 0 && !class62.field1509[var73 - 1].field1514) {
                                        var89 = false;
                                    }
                                    if (var89 && var74 == var75 && var74 == var76 && var74 == var77) {
                                        this.field1018[var5][var60][var69] |= 0x924;
                                    }
                                }
                                int var90 = 0;
                                if (var82 != -1) {
                                    var90 = class33.field997[method325(var83, 96)];
                                }
                                if (var73 == 0) {
                                    arg0.method462(var5, var60, var69, 0, 0, -1, var74, var75, var76, var77, method325(var82, var78), method325(var82, var79), method325(var82, var80), method325(var82, var81), 0, 0, 0, 0, var90, 0);
                                } else {
                                    int var91 = this.field1022[var5][var60][var69] + 1;
                                    byte var92 = this.field1005[var5][var60][var69];
                                    class62 var93 = class62.field1509[var73 - 1];
                                    int var94 = var93.field1512;
                                    int var95;
                                    int var96;
                                    if (var94 >= 0) {
                                        var95 = class33.method301(706, var94);
                                        var96 = -1;
                                    } else if (var93.field1511 == 16711935) {
                                        var95 = 0;
                                        var96 = -2;
                                        var94 = -1;
                                    } else {
                                        var96 = this.method326(var93.field1515, var93.field1516, var93.field1517);
                                        var95 = class33.field997[this.method327(var93.field1520, 96)];
                                    }
                                    arg0.method462(var5, var60, var69, var91, var92, var94, var74, var75, var76, var77, method325(var82, var78), method325(var82, var79), method325(var82, var80), method325(var82, var81), this.method327(var96, var78), this.method327(var96, var79), this.method327(var96, var80), this.method327(var96, var81), var90, var95);
                                }
                            }
                        }
                    }
                }
            }
            for (int var61 = 1; var61 < this.field1021 - 1; var61++) {
                for (int var62 = 1; var62 < this.field1020 - 1; var62++) {
                    arg0.method461(var5, var62, var61, this.method313(var62, var61, var5, 0));
                }
            }
        }
        arg0.method488(-10, 4, -50, -50, 64, 768);
        for (int var6 = 0; var6 < this.field1020; var6++) {
            for (int var49 = 0; var49 < this.field1021; var49++) {
                if ((this.field1013[1][var6][var49] & 0x2) == 2) {
                    arg0.method459(910, var49, var6);
                }
            }
        }
        if (this.field999 == arg1) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = 1;
        int var10 = 2;
        int var11 = 4;
        for (int var12 = 0; var12 < 4; var12++) {
            if (var12 > 0) {
                var9 <<= 0x3;
                var10 <<= 0x3;
                var11 <<= 0x3;
            }
            for (int var13 = 0; var13 <= var12; var13++) {
                for (int var14 = 0; var14 <= this.field1021; var14++) {
                    for (int var15 = 0; var15 <= this.field1020; var15++) {
                        if ((this.field1018[var13][var15][var14] & var9) != 0) {
                            int var16 = var14;
                            int var17 = var14;
                            int var18 = var13;
                            int var19 = var13;
                            while (var16 > 0 && (this.field1018[var13][var15][var16 - 1] & var9) != 0) {
                                var16--;
                            }
                            while (var17 < this.field1021 && (this.field1018[var13][var15][var17 + 1] & var9) != 0) {
                                var17++;
                            }
                            label331: while (var18 > 0) {
                                for (int var20 = var16; var20 <= var17; var20++) {
                                    if ((this.field1018[var18 - 1][var15][var20] & var9) == 0) {
                                        break label331;
                                    }
                                }
                                var18--;
                            }
                            label320: while (var19 < var12) {
                                for (int var21 = var16; var21 <= var17; var21++) {
                                    if ((this.field1018[var19 + 1][var15][var21] & var9) == 0) {
                                        break label320;
                                    }
                                }
                                var19++;
                            }
                            int var22 = (var19 + 1 - var18) * (var17 + 1 - var16);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = this.field1016[var19][var15][var16] - var23;
                                int var25 = this.field1016[var18][var15][var16];
                                class56.method460(var15 * 128, var24, var15 * 128, 1, var12, var17 * 128 + 128, -260, var25, var16 * 128);
                                for (int var26 = var18; var26 <= var19; var26++) {
                                    for (int var27 = var16; var27 <= var17; var27++) {
                                        this.field1018[var26][var15][var27] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field1018[var13][var15][var14] & var10) != 0) {
                            int var28 = var15;
                            int var29 = var15;
                            int var30 = var13;
                            int var31 = var13;
                            while (var28 > 0 && (this.field1018[var13][var28 - 1][var14] & var10) != 0) {
                                var28--;
                            }
                            while (var29 < this.field1020 && (this.field1018[var13][var29 + 1][var14] & var10) != 0) {
                                var29++;
                            }
                            label384: while (var30 > 0) {
                                for (int var32 = var28; var32 <= var29; var32++) {
                                    if ((this.field1018[var30 - 1][var32][var14] & var10) == 0) {
                                        break label384;
                                    }
                                }
                                var30--;
                            }
                            label373: while (var31 < var12) {
                                for (int var33 = var28; var33 <= var29; var33++) {
                                    if ((this.field1018[var31 + 1][var33][var14] & var10) == 0) {
                                        break label373;
                                    }
                                }
                                var31++;
                            }
                            int var34 = (var31 + 1 - var30) * (var29 + 1 - var28);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = this.field1016[var31][var28][var14] - var35;
                                int var37 = this.field1016[var30][var28][var14];
                                class56.method460(var29 * 128 + 128, var36, var28 * 128, 2, var12, var14 * 128, -260, var37, var14 * 128);
                                for (int var38 = var30; var38 <= var31; var38++) {
                                    for (int var39 = var28; var39 <= var29; var39++) {
                                        this.field1018[var38][var39][var14] &= ~var10;
                                    }
                                }
                            }
                        }
                        if ((this.field1018[var13][var15][var14] & var11) != 0) {
                            int var40 = var15;
                            int var41 = var15;
                            int var42 = var14;
                            int var43 = var14;
                            while (var42 > 0 && (this.field1018[var13][var15][var42 - 1] & var11) != 0) {
                                var42--;
                            }
                            while (var43 < this.field1021 && (this.field1018[var13][var15][var43 + 1] & var11) != 0) {
                                var43++;
                            }
                            label437: while (var40 > 0) {
                                for (int var44 = var42; var44 <= var43; var44++) {
                                    if ((this.field1018[var13][var40 - 1][var44] & var11) == 0) {
                                        break label437;
                                    }
                                }
                                var40--;
                            }
                            label426: while (var41 < this.field1020) {
                                for (int var45 = var42; var45 <= var43; var45++) {
                                    if ((this.field1018[var13][var41 + 1][var45] & var11) == 0) {
                                        break label426;
                                    }
                                }
                                var41++;
                            }
                            if ((var41 + 1 - var40) * (var43 + 1 - var42) >= 4) {
                                int var46 = this.field1016[var13][var40][var42];
                                class56.method460(var41 * 128 + 128, var46, var40 * 128, 4, var12, var43 * 128 + 128, -260, var46, var42 * 128);
                                for (int var47 = var40; var47 <= var41; var47++) {
                                    for (int var48 = var42; var48 <= var43; var48++) {
                                        this.field1018[var13][var47][var48] &= ~var11;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
