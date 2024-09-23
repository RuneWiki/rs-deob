import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CJZJWICI")
public class class5 {

    @OriginalMember(owner = "CJZJWICI", name = "b", descriptor = "I")
    private int field124 = -258;

    @OriginalMember(owner = "CJZJWICI", name = "k", descriptor = "I")
    private int field133 = 4;

    @OriginalMember(owner = "CJZJWICI", name = "F", descriptor = "Z")
    private boolean field154 = false;

    @OriginalMember(owner = "CJZJWICI", name = "y", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "CJZJWICI", name = "z", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "CJZJWICI", name = "s", descriptor = "[[[I")
    private int[][][] field141;

    @OriginalMember(owner = "CJZJWICI", name = "j", descriptor = "[[[B")
    private byte[][][] field132;

    @OriginalMember(owner = "CJZJWICI", name = "w", descriptor = "[[[B")
    private byte[][][] field145;

    @OriginalMember(owner = "CJZJWICI", name = "m", descriptor = "[[[B")
    private byte[][][] field135;

    @OriginalMember(owner = "CJZJWICI", name = "n", descriptor = "[[[B")
    private byte[][][] field136;

    @OriginalMember(owner = "CJZJWICI", name = "c", descriptor = "[[[B")
    private byte[][][] field125;

    @OriginalMember(owner = "CJZJWICI", name = "t", descriptor = "[[[I")
    private int[][][] field142;

    @OriginalMember(owner = "CJZJWICI", name = "l", descriptor = "[[[B")
    private byte[][][] field134;

    @OriginalMember(owner = "CJZJWICI", name = "C", descriptor = "[[I")
    private int[][] field151;

    @OriginalMember(owner = "CJZJWICI", name = "e", descriptor = "[I")
    private int[] field127;

    @OriginalMember(owner = "CJZJWICI", name = "f", descriptor = "[I")
    private int[] field128;

    @OriginalMember(owner = "CJZJWICI", name = "g", descriptor = "[I")
    private int[] field129;

    @OriginalMember(owner = "CJZJWICI", name = "h", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "CJZJWICI", name = "i", descriptor = "[I")
    private int[] field131;

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "[I")
    private static final int[] field123 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "CJZJWICI", name = "d", descriptor = "I")
    private static int field126 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "CJZJWICI", name = "o", descriptor = "[I")
    private static final int[] field137 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "CJZJWICI", name = "p", descriptor = "I")
    private static int field138 = -6346;

    @OriginalMember(owner = "CJZJWICI", name = "q", descriptor = "I")
    private static int field139 = -389;

    @OriginalMember(owner = "CJZJWICI", name = "r", descriptor = "I")
    private static int field140 = 658;

    @OriginalMember(owner = "CJZJWICI", name = "u", descriptor = "Z")
    public static boolean field143 = true;

    @OriginalMember(owner = "CJZJWICI", name = "v", descriptor = "[I")
    private static final int[] field144 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "CJZJWICI", name = "x", descriptor = "I")
    public static int field146 = 99;

    @OriginalMember(owner = "CJZJWICI", name = "B", descriptor = "I")
    private static int field150 = 585;

    @OriginalMember(owner = "CJZJWICI", name = "D", descriptor = "[I")
    private static final int[] field152 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "CJZJWICI", name = "E", descriptor = "I")
    private static int field153 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "CJZJWICI", name = "A", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(IIILMLYYHULT;IIII)V")
    private final void method43(int arg0, int arg1, int arg2, class30 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 6) {
            return;
        }
        if (arg7 < 0 || arg7 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var11 = arg3.method296();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg3.method296();
                    return;
                }
                if (var11 <= 49) {
                    arg3.method296();
                }
            }
        }
        this.field132[arg2][arg7][arg5] = 0;
        while (true) {
            int var9 = arg3.method296();
            if (var9 == 0) {
                if (arg2 == 0) {
                    this.field141[0][arg7][arg5] = -method53(arg7 + arg6 + 932731, arg5 + 556238 + arg1) * 8;
                    return;
                } else {
                    this.field141[arg2][arg7][arg5] = this.field141[arg2 - 1][arg7][arg5] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg3.method296();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg2 == 0) {
                    this.field141[0][arg7][arg5] = -var10 * 8;
                    return;
                }
                this.field141[arg2][arg7][arg5] = this.field141[arg2 - 1][arg7][arg5] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field135[arg2][arg7][arg5] = arg3.method297();
                this.field136[arg2][arg7][arg5] = (byte) ((var9 - 2) / 4);
                this.field125[arg2][arg7][arg5] = (byte) (var9 + arg4 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field132[arg2][arg7][arg5] = (byte) (var9 - 49);
            } else {
                this.field145[arg2][arg7][arg5] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(III)I")
    private static final int method44(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method61(var3, var5);
        int var8 = method61(var3 + 1, var5);
        int var9 = method61(var3, var5 + 1);
        int var10 = method61(var3 + 1, var5 + 1);
        int var11 = method59(var7, var8, var4, arg2);
        int var12 = method59(var9, var10, var4, arg2);
        return method59(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "CJZJWICI", name = "b", descriptor = "(III)I")
    private final int method45(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(II)I")
    private static final int method46(int arg0, int arg1) {
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

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(I[LOTPPFNKL;BLTAWLWNCF;I[B)V")
    public final void method47(int arg0, class36[] arg1, byte arg2, class53 arg3, int arg4, byte[] arg5) {
        if (arg2 != 8) {
            this.field154 = !this.field154;
        }
        class30 var7 = new class30(true, arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method310();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method310();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method296();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg4 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field132[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class36 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method52(var21, 0, var16, arg3, var19, var17, var18, var8, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(IIII[LOTPPFNKL;IIBLTAWLWNCF;[BI)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, class36[] arg4, int arg5, int arg6, byte arg7, class53 arg8, byte[] arg9, int arg10) {
        class30 var12 = new class30(true, arg9);
        int var13 = -1;
        if (arg7 != 3) {
            return;
        }
        boolean var14 = false;
        while (true) {
            int var15 = var12.method310();
            if (var15 == 0) {
                return;
            }
            var13 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method310();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method296();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg0 == var20 && var19 >= arg6 && var19 < arg6 + 8 && var18 >= arg2 && var18 < arg2 + 8) {
                    class27 var24 = class27.method282(var13);
                    int var25 = arg3 + class26.method271(arg5, var24.field985, var18 & 0x7, false, var19 & 0x7, var23, var24.field996);
                    int var26 = arg1 + class26.method272(var24.field985, var18 & 0x7, var24.field996, false, var23, arg5, var19 & 0x7);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg10;
                        if ((this.field132[1][var25][var26] & 0x2) == 2) {
                            var27 = arg10 - 1;
                        }
                        class36 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg4[var27];
                        }
                        this.method52(var28, 0, var22, arg8, var26, arg5 + var23 & 0x3, var25, var13, arg10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "c", descriptor = "(III)Z")
    public static final boolean method49(int arg0, int arg1, int arg2) {
        class27 var3 = class27.method282(arg2);
        if (arg1 != 5) {
            throw new NullPointerException();
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method273(field139, arg0);
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method50(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        class30 var5 = new class30(true, arg1);
        if (arg0 != 0) {
            field140 = -429;
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method310();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method310();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method296() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class27 var17 = class27.method282(var6);
                        if (var14 != 22 || !field143 || var17.field984 || var17.field1011) {
                            var4 &= var17.method276(false);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method310();
                if (var10 == 0) {
                    break;
                }
                var5.method296();
            }
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(ZLFJSXIAWX;LMLYYHULT;)V")
    public static final void method51(boolean arg0, class14 arg1, class30 arg2) {
        int var3 = -1;
        if (!arg0) {
            return;
        }
        while (true) {
            int var4 = arg2.method310();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class27 var5 = class27.method282(var3);
            var5.method280(arg1, 9);
            while (true) {
                int var6 = arg2.method310();
                if (var6 == 0) {
                    break;
                }
                arg2.method296();
            }
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(LOTPPFNKL;IILTAWLWNCF;IIIII)V")
    private final void method52(class36 arg0, int arg1, int arg2, class53 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field143 && (this.field132[0][arg6][arg4] & 0x2) == 0) {
            if ((this.field132[arg8][arg6][arg4] & 0x10) != 0) {
                return;
            }
            if (this.method60(arg6, arg8, 0, arg4) != field149) {
                return;
            }
        }
        if (arg8 < field146) {
            field146 = arg8;
        }
        int var10 = this.field141[arg8][arg6][arg4];
        int var11 = this.field141[arg8][arg6 + 1][arg4];
        int var12 = this.field141[arg8][arg6 + 1][arg4 + 1];
        int var13 = this.field141[arg8][arg6][arg4 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class27 var15 = class27.method282(arg7);
        if (arg1 < 0 || arg1 > 0) {
            return;
        }
        int var16 = (arg7 << 14) + (arg4 << 7) + arg6 + 1073741824;
        if (!var15.field984) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg5 << 6) + arg2);
        if (arg2 == 22) {
            if (!field143 || var15.field984 || var15.field1011) {
                class22 var18;
                if (var15.field986 == -1 && var15.field1016 == null) {
                    var18 = var15.method283(22, arg5, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class11(true, arg5, arg7, (byte) 6, 22, var10, var11, var12, var15.field986, var13);
                }
                arg3.method493(var18, field150, var16, arg6, arg4, arg8, var17, var14);
                if (var15.field1013 && var15.field984 && arg0 != null) {
                    arg0.method356(arg4, 325, arg6);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class22 var38;
            if (var15.field986 == -1 && var15.field1016 == null) {
                var38 = var15.method283(10, arg5, var10, var11, var12, var13, -1);
            } else {
                var38 = new class11(true, arg5, arg7, (byte) 6, 10, var10, var11, var12, var15.field986, var13);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg2 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg5 == 1 || arg5 == 3) {
                    var40 = var15.field996;
                    var41 = var15.field985;
                } else {
                    var40 = var15.field985;
                    var41 = var15.field996;
                }
                if (arg3.method497(var38, arg4, var41, arg6, var17, var16, var39, arg8, var40, var14, true) && var15.field1007) {
                    class3 var42;
                    if (var38 instanceof class3) {
                        var42 = (class3) var38;
                    } else {
                        var42 = var15.method283(10, arg5, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field50 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field134[arg8][arg6 + var43][arg4 + var44]) {
                                    this.field134[arg8][arg6 + var43][arg4 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1013 && arg0 != null) {
                arg0.method355(var15.field1030, var15.field996, arg4, (byte) 108, var15.field985, arg6, arg5);
            }
        } else if (arg2 >= 12) {
            class22 var19;
            if (var15.field986 == -1 && var15.field1016 == null) {
                var19 = var15.method283(arg2, arg5, var10, var11, var12, var13, -1);
            } else {
                var19 = new class11(true, arg5, arg7, (byte) 6, arg2, var10, var11, var12, var15.field986, var13);
            }
            arg3.method497(var19, arg4, 1, arg6, var17, var16, 0, arg8, 1, var14, true);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg8 > 0) {
                this.field142[arg8][arg6][arg4] |= 0x924;
            }
            if (var15.field1013 && arg0 != null) {
                arg0.method355(var15.field1030, var15.field996, arg4, (byte) 108, var15.field985, arg6, arg5);
            }
        } else if (arg2 == 0) {
            class22 var20;
            if (var15.field986 == -1 && var15.field1016 == null) {
                var20 = var15.method283(0, arg5, var10, var11, var12, var13, -1);
            } else {
                var20 = new class11(true, arg5, arg7, (byte) 6, 0, var10, var11, var12, var15.field986, var13);
            }
            arg3.method495(0, field144[arg5], arg8, arg4, arg6, var20, var14, var16, var17, null, 0);
            if (arg5 == 0) {
                if (var15.field1007) {
                    this.field134[arg8][arg6][arg4] = 50;
                    this.field134[arg8][arg6][arg4 + 1] = 50;
                }
                if (var15.field1002) {
                    this.field142[arg8][arg6][arg4] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var15.field1007) {
                    this.field134[arg8][arg6][arg4 + 1] = 50;
                    this.field134[arg8][arg6 + 1][arg4 + 1] = 50;
                }
                if (var15.field1002) {
                    this.field142[arg8][arg6][arg4 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var15.field1007) {
                    this.field134[arg8][arg6 + 1][arg4] = 50;
                    this.field134[arg8][arg6 + 1][arg4 + 1] = 50;
                }
                if (var15.field1002) {
                    this.field142[arg8][arg6 + 1][arg4] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var15.field1007) {
                    this.field134[arg8][arg6][arg4] = 50;
                    this.field134[arg8][arg6 + 1][arg4] = 50;
                }
                if (var15.field1002) {
                    this.field142[arg8][arg6][arg4] |= 0x492;
                }
            }
            if (var15.field1013 && arg0 != null) {
                arg0.method354(var15.field1030, arg2, arg4, -395, arg6, arg5);
            }
            if (var15.field1005 != 16) {
                arg3.method503(arg4, arg6, 0, var15.field1005, arg8);
            }
        } else if (arg2 == 1) {
            class22 var21;
            if (var15.field986 == -1 && var15.field1016 == null) {
                var21 = var15.method283(1, arg5, var10, var11, var12, var13, -1);
            } else {
                var21 = new class11(true, arg5, arg7, (byte) 6, 1, var10, var11, var12, var15.field986, var13);
            }
            arg3.method495(0, field152[arg5], arg8, arg4, arg6, var21, var14, var16, var17, null, 0);
            if (var15.field1007) {
                if (arg5 == 0) {
                    this.field134[arg8][arg6][arg4 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field134[arg8][arg6 + 1][arg4 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field134[arg8][arg6 + 1][arg4] = 50;
                } else if (arg5 == 3) {
                    this.field134[arg8][arg6][arg4] = 50;
                }
            }
            if (var15.field1013 && arg0 != null) {
                arg0.method354(var15.field1030, arg2, arg4, -395, arg6, arg5);
            }
        } else if (arg2 == 2) {
            int var22 = arg5 + 1 & 0x3;
            class22 var23;
            class22 var24;
            if (var15.field986 == -1 && var15.field1016 == null) {
                var23 = var15.method283(2, arg5 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method283(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class11(true, arg5 + 4, arg7, (byte) 6, 2, var10, var11, var12, var15.field986, var13);
                var24 = new class11(true, var22, arg7, (byte) 6, 2, var10, var11, var12, var15.field986, var13);
            }
            arg3.method495(field144[var22], field144[arg5], arg8, arg4, arg6, var23, var14, var16, var17, var24, 0);
            if (var15.field1002) {
                if (arg5 == 0) {
                    this.field142[arg8][arg6][arg4] |= 0x249;
                    this.field142[arg8][arg6][arg4 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field142[arg8][arg6][arg4 + 1] |= 0x492;
                    this.field142[arg8][arg6 + 1][arg4] |= 0x249;
                } else if (arg5 == 2) {
                    this.field142[arg8][arg6 + 1][arg4] |= 0x249;
                    this.field142[arg8][arg6][arg4] |= 0x492;
                } else if (arg5 == 3) {
                    this.field142[arg8][arg6][arg4] |= 0x492;
                    this.field142[arg8][arg6][arg4] |= 0x249;
                }
            }
            if (var15.field1013 && arg0 != null) {
                arg0.method354(var15.field1030, arg2, arg4, -395, arg6, arg5);
            }
            if (var15.field1005 != 16) {
                arg3.method503(arg4, arg6, 0, var15.field1005, arg8);
            }
        } else if (arg2 == 3) {
            class22 var25;
            if (var15.field986 == -1 && var15.field1016 == null) {
                var25 = var15.method283(3, arg5, var10, var11, var12, var13, -1);
            } else {
                var25 = new class11(true, arg5, arg7, (byte) 6, 3, var10, var11, var12, var15.field986, var13);
            }
            arg3.method495(0, field152[arg5], arg8, arg4, arg6, var25, var14, var16, var17, null, 0);
            if (var15.field1007) {
                if (arg5 == 0) {
                    this.field134[arg8][arg6][arg4 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field134[arg8][arg6 + 1][arg4 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field134[arg8][arg6 + 1][arg4] = 50;
                } else if (arg5 == 3) {
                    this.field134[arg8][arg6][arg4] = 50;
                }
            }
            if (var15.field1013 && arg0 != null) {
                arg0.method354(var15.field1030, arg2, arg4, -395, arg6, arg5);
            }
        } else if (arg2 == 9) {
            class22 var26;
            if (var15.field986 == -1 && var15.field1016 == null) {
                var26 = var15.method283(arg2, arg5, var10, var11, var12, var13, -1);
            } else {
                var26 = new class11(true, arg5, arg7, (byte) 6, arg2, var10, var11, var12, var15.field986, var13);
            }
            arg3.method497(var26, arg4, 1, arg6, var17, var16, 0, arg8, 1, var14, true);
            if (var15.field1013 && arg0 != null) {
                arg0.method355(var15.field1030, var15.field996, arg4, (byte) 108, var15.field985, arg6, arg5);
            }
        } else {
            if (var15.field1032) {
                if (arg5 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg5 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg5 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg2 == 4) {
                class22 var31;
                if (var15.field986 == -1 && var15.field1016 == null) {
                    var31 = var15.method283(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class11(true, 0, arg7, (byte) 6, 4, var10, var11, var12, var15.field986, var13);
                }
                arg3.method496(arg4, true, 0, arg8, arg6, var31, 0, arg5 * 512, var16, field144[arg5], var14, var17);
            } else if (arg2 == 5) {
                int var32 = 16;
                int var33 = arg3.method513(arg8, arg6, arg4);
                if (var33 > 0) {
                    var32 = class27.method282(var33 >> 14 & 0x7FFF).field1005;
                }
                class22 var34;
                if (var15.field986 == -1 && var15.field1016 == null) {
                    var34 = var15.method283(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class11(true, 0, arg7, (byte) 6, 4, var10, var11, var12, var15.field986, var13);
                }
                arg3.method496(arg4, true, field137[arg5] * var32, arg8, arg6, var34, field123[arg5] * var32, arg5 * 512, var16, field144[arg5], var14, var17);
            } else if (arg2 == 6) {
                class22 var35;
                if (var15.field986 == -1 && var15.field1016 == null) {
                    var35 = var15.method283(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class11(true, 0, arg7, (byte) 6, 4, var10, var11, var12, var15.field986, var13);
                }
                arg3.method496(arg4, true, 0, arg8, arg6, var35, 0, arg5, var16, 256, var14, var17);
            } else if (arg2 == 7) {
                class22 var36;
                if (var15.field986 == -1 && var15.field1016 == null) {
                    var36 = var15.method283(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class11(true, 0, arg7, (byte) 6, 4, var10, var11, var12, var15.field986, var13);
                }
                arg3.method496(arg4, true, 0, arg8, arg6, var36, 0, arg5, var16, 512, var14, var17);
            } else if (arg2 == 8) {
                class22 var37;
                if (var15.field986 == -1 && var15.field1016 == null) {
                    var37 = var15.method283(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class11(true, 0, arg7, (byte) 6, 4, var10, var11, var12, var15.field986, var13);
                }
                arg3.method496(arg4, true, 0, arg8, arg6, var37, 0, arg5, var16, 768, var14, var17);
            }
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "b", descriptor = "(II)I")
    private static final int method53(int arg0, int arg1) {
        int var2 = method44(arg0 + 45365, arg1 + 91923, 4) + (method44(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method44(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "CJZJWICI", name = "<init>", descriptor = "(I[[[IZ[[[BI)V")
    public class5(int arg0, int[][][] arg1, boolean arg2, byte[][][] arg3, int arg4) {
        field146 = 99;
        this.field147 = arg4;
        this.field148 = arg0;
        this.field141 = arg1;
        if (arg2) {
            this.field124 = 86;
        }
        this.field132 = arg3;
        this.field145 = new byte[4][this.field147][this.field148];
        this.field135 = new byte[4][this.field147][this.field148];
        this.field136 = new byte[4][this.field147][this.field148];
        this.field125 = new byte[4][this.field147][this.field148];
        this.field142 = new int[4][this.field147 + 1][this.field148 + 1];
        this.field134 = new byte[4][this.field147 + 1][this.field148 + 1];
        this.field151 = new int[this.field147 + 1][this.field148 + 1];
        this.field127 = new int[this.field148];
        this.field128 = new int[this.field148];
        this.field129 = new int[this.field148];
        this.field130 = new int[this.field148];
        this.field131 = new int[this.field148];
    }

    @OriginalMember(owner = "CJZJWICI", name = "c", descriptor = "(II)I")
    private final int method54(int arg0, int arg1) {
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

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "([BI[LOTPPFNKL;IIII)V")
    public final void method55(byte[] arg0, int arg1, class36[] arg2, int arg3, int arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 + var13 > 0 && arg1 + var13 < 103 && arg3 + var14 > 0 && arg3 + var14 < 103) {
                        arg2[var8].field1213[arg1 + var13][arg3 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class30 var9 = new class30(true, arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method43(6, arg5, var10, var9, 0, arg3 + var12, arg6, arg1 + var11);
                }
            }
        }
        if (arg4 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(IBI[LOTPPFNKL;II[BIII)V")
    public final void method56(int arg0, byte arg1, int arg2, class36[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg5 + var11 > 0 && arg5 + var11 < 103 && arg4 + var16 > 0 && arg4 + var16 < 103) {
                    arg3[arg7].field1213[arg5 + var11][arg4 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class30 var12 = new class30(true, arg6);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg2 == var13 && var14 >= arg9 && var14 < arg9 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
                        this.method43(6, 0, arg7, var12, arg8, arg4 + class26.method270(arg8, this.field133, var15 & 0x7, var14 & 0x7), 0, arg5 + class26.method269(arg8, false, var15 & 0x7, var14 & 0x7));
                    } else {
                        this.method43(6, 0, 0, var12, 0, -1, 0, -1);
                    }
                }
            }
        }
        if (arg1 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "d", descriptor = "(II)I")
    private static final int method57(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(IIILTAWLWNCF;I[[[IIILOTPPFNKL;II)V")
    public static final void method58(int arg0, int arg1, int arg2, class53 arg3, int arg4, int[][][] arg5, int arg6, int arg7, class36 arg8, int arg9, int arg10) {
        int var11 = arg5[arg0][arg2][arg7];
        int var12 = arg5[arg0][arg2 + 1][arg7];
        int var13 = arg5[arg0][arg2 + 1][arg7 + 1];
        int var14 = arg5[arg0][arg2][arg7 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class27 var16 = class27.method282(arg10);
        int var17 = (arg10 << 14) + (arg7 << 7) + arg2 + 1073741824;
        if (!var16.field984) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg1 << 6) + arg9);
        if (field138 != arg6) {
            return;
        }
        if (arg9 == 22) {
            class22 var19;
            if (var16.field986 == -1 && var16.field1016 == null) {
                var19 = var16.method283(22, arg1, var11, var12, var13, var14, -1);
            } else {
                var19 = new class11(true, arg1, arg10, (byte) 6, 22, var11, var12, var13, var16.field986, var14);
            }
            arg3.method493(var19, field150, var17, arg2, arg7, arg4, var18, var15);
            if (var16.field1013 && var16.field984) {
                arg8.method356(arg7, 325, arg2);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class22 var39;
            if (var16.field986 == -1 && var16.field1016 == null) {
                var39 = var16.method283(10, arg1, var11, var12, var13, var14, -1);
            } else {
                var39 = new class11(true, arg1, arg10, (byte) 6, 10, var11, var12, var13, var16.field986, var14);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg9 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg1 == 1 || arg1 == 3) {
                    var41 = var16.field996;
                    var42 = var16.field985;
                } else {
                    var41 = var16.field985;
                    var42 = var16.field996;
                }
                arg3.method497(var39, arg7, var42, arg2, var18, var17, var40, arg4, var41, var15, true);
            }
            if (var16.field1013) {
                arg8.method355(var16.field1030, var16.field996, arg7, (byte) 108, var16.field985, arg2, arg1);
            }
        } else if (arg9 >= 12) {
            class22 var20;
            if (var16.field986 == -1 && var16.field1016 == null) {
                var20 = var16.method283(arg9, arg1, var11, var12, var13, var14, -1);
            } else {
                var20 = new class11(true, arg1, arg10, (byte) 6, arg9, var11, var12, var13, var16.field986, var14);
            }
            arg3.method497(var20, arg7, 1, arg2, var18, var17, 0, arg4, 1, var15, true);
            if (var16.field1013) {
                arg8.method355(var16.field1030, var16.field996, arg7, (byte) 108, var16.field985, arg2, arg1);
            }
        } else if (arg9 == 0) {
            class22 var21;
            if (var16.field986 == -1 && var16.field1016 == null) {
                var21 = var16.method283(0, arg1, var11, var12, var13, var14, -1);
            } else {
                var21 = new class11(true, arg1, arg10, (byte) 6, 0, var11, var12, var13, var16.field986, var14);
            }
            arg3.method495(0, field144[arg1], arg4, arg7, arg2, var21, var15, var17, var18, null, 0);
            if (var16.field1013) {
                arg8.method354(var16.field1030, arg9, arg7, -395, arg2, arg1);
            }
        } else if (arg9 == 1) {
            class22 var22;
            if (var16.field986 == -1 && var16.field1016 == null) {
                var22 = var16.method283(1, arg1, var11, var12, var13, var14, -1);
            } else {
                var22 = new class11(true, arg1, arg10, (byte) 6, 1, var11, var12, var13, var16.field986, var14);
            }
            arg3.method495(0, field152[arg1], arg4, arg7, arg2, var22, var15, var17, var18, null, 0);
            if (var16.field1013) {
                arg8.method354(var16.field1030, arg9, arg7, -395, arg2, arg1);
            }
        } else if (arg9 == 2) {
            int var23 = arg1 + 1 & 0x3;
            class22 var24;
            class22 var25;
            if (var16.field986 == -1 && var16.field1016 == null) {
                var24 = var16.method283(2, arg1 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method283(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class11(true, arg1 + 4, arg10, (byte) 6, 2, var11, var12, var13, var16.field986, var14);
                var25 = new class11(true, var23, arg10, (byte) 6, 2, var11, var12, var13, var16.field986, var14);
            }
            arg3.method495(field144[var23], field144[arg1], arg4, arg7, arg2, var24, var15, var17, var18, var25, 0);
            if (var16.field1013) {
                arg8.method354(var16.field1030, arg9, arg7, -395, arg2, arg1);
            }
        } else if (arg9 == 3) {
            class22 var26;
            if (var16.field986 == -1 && var16.field1016 == null) {
                var26 = var16.method283(3, arg1, var11, var12, var13, var14, -1);
            } else {
                var26 = new class11(true, arg1, arg10, (byte) 6, 3, var11, var12, var13, var16.field986, var14);
            }
            arg3.method495(0, field152[arg1], arg4, arg7, arg2, var26, var15, var17, var18, null, 0);
            if (var16.field1013) {
                arg8.method354(var16.field1030, arg9, arg7, -395, arg2, arg1);
            }
        } else if (arg9 == 9) {
            class22 var27;
            if (var16.field986 == -1 && var16.field1016 == null) {
                var27 = var16.method283(arg9, arg1, var11, var12, var13, var14, -1);
            } else {
                var27 = new class11(true, arg1, arg10, (byte) 6, arg9, var11, var12, var13, var16.field986, var14);
            }
            arg3.method497(var27, arg7, 1, arg2, var18, var17, 0, arg4, 1, var15, true);
            if (var16.field1013) {
                arg8.method355(var16.field1030, var16.field996, arg7, (byte) 108, var16.field985, arg2, arg1);
            }
        } else {
            if (var16.field1032) {
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
                class22 var32;
                if (var16.field986 == -1 && var16.field1016 == null) {
                    var32 = var16.method283(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class11(true, 0, arg10, (byte) 6, 4, var11, var12, var13, var16.field986, var14);
                }
                arg3.method496(arg7, true, 0, arg4, arg2, var32, 0, arg1 * 512, var17, field144[arg1], var15, var18);
            } else if (arg9 == 5) {
                int var33 = 16;
                int var34 = arg3.method513(arg4, arg2, arg7);
                if (var34 > 0) {
                    var33 = class27.method282(var34 >> 14 & 0x7FFF).field1005;
                }
                class22 var35;
                if (var16.field986 == -1 && var16.field1016 == null) {
                    var35 = var16.method283(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class11(true, 0, arg10, (byte) 6, 4, var11, var12, var13, var16.field986, var14);
                }
                arg3.method496(arg7, true, field137[arg1] * var33, arg4, arg2, var35, field123[arg1] * var33, arg1 * 512, var17, field144[arg1], var15, var18);
            } else if (arg9 == 6) {
                class22 var36;
                if (var16.field986 == -1 && var16.field1016 == null) {
                    var36 = var16.method283(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class11(true, 0, arg10, (byte) 6, 4, var11, var12, var13, var16.field986, var14);
                }
                arg3.method496(arg7, true, 0, arg4, arg2, var36, 0, arg1, var17, 256, var15, var18);
            } else if (arg9 == 7) {
                class22 var37;
                if (var16.field986 == -1 && var16.field1016 == null) {
                    var37 = var16.method283(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class11(true, 0, arg10, (byte) 6, 4, var11, var12, var13, var16.field986, var14);
                }
                arg3.method496(arg7, true, 0, arg4, arg2, var37, 0, arg1, var17, 512, var15, var18);
            } else if (arg9 == 8) {
                class22 var38;
                if (var16.field986 == -1 && var16.field1016 == null) {
                    var38 = var16.method283(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class11(true, 0, arg10, (byte) 6, 4, var11, var12, var13, var16.field986, var14);
                }
                arg3.method496(arg7, true, 0, arg4, arg2, var38, 0, arg1, var17, 768, var15, var18);
            }
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(IIII)I")
    private static final int method59(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class41.field1308[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "CJZJWICI", name = "b", descriptor = "(IIII)I")
    public int method60(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field133 = -413;
        }
        if ((this.field132[arg1][arg0][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (this.field132[1][arg0][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "e", descriptor = "(II)I")
    private static final int method61(int arg0, int arg1) {
        int var2 = method57(arg0 - 1, arg1 - 1) + method57(arg0 + 1, arg1 - 1) + method57(arg0 - 1, arg1 + 1) + method57(arg0 + 1, arg1 + 1);
        int var3 = method57(arg0 - 1, arg1) + method57(arg0 + 1, arg1) + method57(arg0, arg1 - 1) + method57(arg0, arg1 + 1);
        int var4 = method57(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(B[LOTPPFNKL;LTAWLWNCF;)V")
    public final void method62(byte arg0, class36[] arg1, class53 arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field132[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field132[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method356(var111, 325, var110);
                        }
                    }
                }
            }
        }
        field126 += (int) (Math.random() * 5.0D) - 2;
        if (arg0 != 61) {
            field140 = -46;
        }
        if (field126 < -8) {
            field126 = -8;
        }
        if (field126 > 8) {
            field126 = 8;
        }
        field153 += (int) (Math.random() * 5.0D) - 2;
        if (field153 < -16) {
            field153 = -16;
        }
        if (field153 > 16) {
            field153 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field134[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field148 - 1; var56++) {
                for (int var101 = 1; var101 < this.field147 - 1; var101++) {
                    int var102 = this.field141[var5][var101 + 1][var56] - this.field141[var5][var101 - 1][var56];
                    int var103 = this.field141[var5][var101][var56 + 1] - this.field141[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field151[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field148; var57++) {
                this.field127[var57] = 0;
                this.field128[var57] = 0;
                this.field129[var57] = 0;
                this.field130[var57] = 0;
                this.field131[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field147 + 5; var58++) {
                for (int var61 = 0; var61 < this.field148; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field147) {
                        int var96 = this.field145[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class52 var97 = class52.field1444[var96 - 1];
                            this.field127[var61] += var97.field1453;
                            this.field128[var61] += var97.field1451;
                            this.field129[var61] += var97.field1452;
                            this.field130[var61] += var97.field1454;
                            var10002 = this.field131[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field147) {
                        int var99 = this.field145[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class52 var100 = class52.field1444[var99 - 1];
                            this.field127[var61] -= var100.field1453;
                            this.field128[var61] -= var100.field1451;
                            this.field129[var61] -= var100.field1452;
                            this.field130[var61] -= var100.field1454;
                            var10002 = this.field131[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field147 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field148 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field148) {
                            var62 += this.field127[var68];
                            var63 += this.field128[var68];
                            var64 += this.field129[var68];
                            var65 += this.field130[var68];
                            var66 += this.field131[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field148) {
                            var62 -= this.field127[var69];
                            var63 -= this.field128[var69];
                            var64 -= this.field129[var69];
                            var65 -= this.field130[var69];
                            var66 -= this.field131[var69];
                        }
                        if (var67 >= 1 && var67 < this.field148 - 1 && (!field143 || (this.field132[0][var58][var67] & 0x2) != 0 || (this.field132[var5][var58][var67] & 0x10) == 0 && this.method60(var58, var5, 0, var67) == field149)) {
                            if (var5 < field146) {
                                field146 = var5;
                            }
                            int var70 = this.field145[var5][var58][var67] & 0xFF;
                            int var71 = this.field135[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field141[var5][var58][var67];
                                int var73 = this.field141[var5][var58 + 1][var67];
                                int var74 = this.field141[var5][var58 + 1][var67 + 1];
                                int var75 = this.field141[var5][var58][var67 + 1];
                                int var76 = this.field151[var58][var67];
                                int var77 = this.field151[var58 + 1][var67];
                                int var78 = this.field151[var58 + 1][var67 + 1];
                                int var79 = this.field151[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method45(var82, var83, var84);
                                    int var85 = field126 + var82 & 0xFF;
                                    int var86 = field153 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method45(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field136[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class52.field1444[var71 - 1].field1449) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field142[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class41.field1319[method46(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method492(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method46(var80, var76), method46(var80, var77), method46(var80, var78), method46(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field136[var5][var58][var67] + 1;
                                    byte var90 = this.field125[var5][var58][var67];
                                    class52 var91 = class52.field1444[var71 - 1];
                                    int var92 = var91.field1447;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class41.method425(var92, -425);
                                        var94 = -1;
                                    } else if (var91.field1446 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method45(var91.field1450, var91.field1451, var91.field1452);
                                        var93 = class41.field1319[this.method54(var91.field1455, 96)];
                                    }
                                    arg2.method492(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method46(var80, var76), method46(var80, var77), method46(var80, var78), method46(var80, var79), this.method54(var94, var76), this.method54(var94, var77), this.method54(var94, var78), this.method54(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field148 - 1; var59++) {
                for (int var60 = 1; var60 < this.field147 - 1; var60++) {
                    arg2.method491(var5, var60, var59, this.method60(var60, var5, 0, var59));
                }
            }
        }
        arg2.method518(false, -10, -50, -50);
        for (int var6 = 0; var6 < this.field147; var6++) {
            for (int var47 = 0; var47 < this.field148; var47++) {
                if ((this.field132[1][var6][var47] & 0x2) == 2) {
                    arg2.method489(var6, false, var47);
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
                for (int var12 = 0; var12 <= this.field148; var12++) {
                    for (int var13 = 0; var13 <= this.field147; var13++) {
                        if ((this.field142[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field142[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field148 && (this.field142[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field142[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field142[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field141[var17][var13][var14] - var21;
                                int var23 = this.field141[var16][var13][var14];
                                class53.method490(var23, var14 * 128, var13 * 128, var22, var10, var13 * 128, var15 * 128 + 128, false, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field142[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field142[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field142[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field147 && (this.field142[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field142[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field142[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field141[var29][var26][var12] - var33;
                                int var35 = this.field141[var28][var26][var12];
                                class53.method490(var35, var12 * 128, var26 * 128, var34, var10, var27 * 128 + 128, var12 * 128, false, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field142[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field142[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field142[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field148 && (this.field142[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field142[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field147) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field142[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field141[var11][var38][var40];
                                class53.method490(var44, var40 * 128, var38 * 128, var44, var10, var39 * 128 + 128, var41 * 128 + 128, false, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field142[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CJZJWICI", name = "a", descriptor = "(IIIII)V")
    public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg3 + arg4; var6++) {
            for (int var8 = arg2; var8 <= arg0 + arg2; var8++) {
                if (var8 >= 0 && var8 < this.field147 && var6 >= 0 && var6 < this.field148) {
                    this.field134[0][var8][var6] = 127;
                    if (arg2 == var8 && var8 > 0) {
                        this.field141[0][var8][var6] = this.field141[0][var8 - 1][var6];
                    }
                    if (arg0 + arg2 == var8 && var8 < this.field147 - 1) {
                        this.field141[0][var8][var6] = this.field141[0][var8 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field141[0][var8][var6] = this.field141[0][var8][var6 - 1];
                    }
                    if (arg3 + arg4 == var6 && var6 < this.field148 - 1) {
                        this.field141[0][var8][var6] = this.field141[0][var8][var6 + 1];
                    }
                }
            }
        }
        int var7 = 4 / arg1;
    }
}
