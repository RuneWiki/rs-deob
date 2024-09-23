import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MPWDIIUH")
public class class31 {

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "Z")
    private boolean field888 = false;

    @OriginalMember(owner = "MPWDIIUH", name = "j", descriptor = "Z")
    private boolean field897 = false;

    @OriginalMember(owner = "MPWDIIUH", name = "C", descriptor = "I")
    private int field916 = -19755;

    @OriginalMember(owner = "MPWDIIUH", name = "w", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "MPWDIIUH", name = "x", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "MPWDIIUH", name = "c", descriptor = "[[[I")
    private int[][][] field890;

    @OriginalMember(owner = "MPWDIIUH", name = "B", descriptor = "[[[B")
    private byte[][][] field915;

    @OriginalMember(owner = "MPWDIIUH", name = "A", descriptor = "[[[B")
    private byte[][][] field914;

    @OriginalMember(owner = "MPWDIIUH", name = "r", descriptor = "[[[B")
    private byte[][][] field905;

    @OriginalMember(owner = "MPWDIIUH", name = "i", descriptor = "[[[B")
    private byte[][][] field896;

    @OriginalMember(owner = "MPWDIIUH", name = "e", descriptor = "[[[B")
    private byte[][][] field892;

    @OriginalMember(owner = "MPWDIIUH", name = "h", descriptor = "[[[I")
    private int[][][] field895;

    @OriginalMember(owner = "MPWDIIUH", name = "k", descriptor = "[[[B")
    private byte[][][] field898;

    @OriginalMember(owner = "MPWDIIUH", name = "g", descriptor = "[[I")
    private int[][] field894;

    @OriginalMember(owner = "MPWDIIUH", name = "m", descriptor = "[I")
    private int[] field900;

    @OriginalMember(owner = "MPWDIIUH", name = "n", descriptor = "[I")
    private int[] field901;

    @OriginalMember(owner = "MPWDIIUH", name = "o", descriptor = "[I")
    private int[] field902;

    @OriginalMember(owner = "MPWDIIUH", name = "p", descriptor = "[I")
    private int[] field903;

    @OriginalMember(owner = "MPWDIIUH", name = "q", descriptor = "[I")
    private int[] field904;

    @OriginalMember(owner = "MPWDIIUH", name = "b", descriptor = "I")
    private static int field889 = -563;

    @OriginalMember(owner = "MPWDIIUH", name = "d", descriptor = "[I")
    private static final int[] field891 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "MPWDIIUH", name = "f", descriptor = "Z")
    private static boolean field893 = true;

    @OriginalMember(owner = "MPWDIIUH", name = "l", descriptor = "I")
    private static int field899 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "MPWDIIUH", name = "s", descriptor = "[I")
    private static final int[] field906 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "MPWDIIUH", name = "u", descriptor = "[I")
    private static final int[] field908 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "MPWDIIUH", name = "v", descriptor = "I")
    public static int field909 = 99;

    @OriginalMember(owner = "MPWDIIUH", name = "y", descriptor = "[I")
    private static final int[] field912 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "MPWDIIUH", name = "z", descriptor = "I")
    private static int field913 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "MPWDIIUH", name = "D", descriptor = "Z")
    public static boolean field917 = true;

    @OriginalMember(owner = "MPWDIIUH", name = "t", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(II)I")
    private static final int method280(int arg0, int arg1) {
        int var2 = method289(arg0 + 45365, arg1 + 91923, 4) + (method289(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method289(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(III)Z")
    public static final boolean method281(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        class72 var4 = class72.method588(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var4.method585(arg2, 175);
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(III[LMPYOQJPZ;[BII)V")
    public final void method282(int arg0, int arg1, int arg2, class32[] arg3, byte[] arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 + var13 > 0 && arg6 + var13 < 103 && arg1 + var14 > 0 && arg1 + var14 < 103) {
                        arg3[var8].field926[arg6 + var13][arg1 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class33 var9 = new class33(true, arg4);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method283(0, arg1 + var12, -414, arg2, arg5, var9, arg6 + var11, var10);
                }
            }
        }
        if (arg0 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(IIIIILMQZHAILV;II)V")
    private final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, class33 arg5, int arg6, int arg7) {
        if (arg2 >= 0) {
            return;
        }
        if (arg6 < 0 || arg6 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var11 = arg5.method325();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg5.method325();
                    return;
                }
                if (var11 <= 49) {
                    arg5.method325();
                }
            }
        }
        this.field915[arg7][arg6][arg1] = 0;
        while (true) {
            int var9 = arg5.method325();
            if (var9 == 0) {
                if (arg7 == 0) {
                    this.field890[0][arg6][arg1] = -method280(arg6 + arg4 + 932731, arg1 + 556238 + arg3) * 8;
                    return;
                } else {
                    this.field890[arg7][arg6][arg1] = this.field890[arg7 - 1][arg6][arg1] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg5.method325();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 == 0) {
                    this.field890[0][arg6][arg1] = -var10 * 8;
                    return;
                }
                this.field890[arg7][arg6][arg1] = this.field890[arg7 - 1][arg6][arg1] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field905[arg7][arg6][arg1] = arg5.method326();
                this.field896[arg7][arg6][arg1] = (byte) ((var9 - 2) / 4);
                this.field892[arg7][arg6][arg1] = (byte) (var9 + arg0 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field915[arg7][arg6][arg1] = (byte) (var9 - 49);
            } else {
                this.field914[arg7][arg6][arg1] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "b", descriptor = "(II)I")
    private static final int method284(int arg0, int arg1) {
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

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(IIZ[B)Z")
    public static final boolean method285(int arg0, int arg1, boolean arg2, byte[] arg3) {
        boolean var4 = true;
        if (!arg2) {
            throw new NullPointerException();
        }
        class33 var5 = new class33(true, arg3);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method339();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method339();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method325() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class72 var17 = class72.method588(var6);
                        if (var14 != 22 || !field917 || var17.field1681 || var17.field1710) {
                            var4 &= var17.method587(true);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method339();
                if (var10 == 0) {
                    break;
                }
                var5.method325();
            }
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "b", descriptor = "(III)I")
    private final int method286(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(LMQZHAILV;LYCBPJRVN;I)V")
    public static final void method287(class33 arg0, class67 arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method339();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class72 var5 = class72.method588(var3);
            var5.method584(arg1, -778);
            while (true) {
                int var6 = arg0.method339();
                if (var6 == 0) {
                    break;
                }
                arg0.method325();
            }
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "c", descriptor = "(II)I")
    private static final int method288(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "MPWDIIUH", name = "c", descriptor = "(III)I")
    private static final int method289(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method295(var3, var5);
        int var8 = method295(var3 + 1, var5);
        int var9 = method295(var3, var5 + 1);
        int var10 = method295(var3 + 1, var5 + 1);
        int var11 = method299(var7, var8, var4, arg2);
        int var12 = method299(var9, var10, var4, arg2);
        return method299(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(IIIILRGNQYESN;ILMPYOQJPZ;II[[[II)V")
    public static final void method290(int arg0, int arg1, int arg2, int arg3, class46 arg4, int arg5, class32 arg6, int arg7, int arg8, int[][][] arg9, int arg10) {
        int var11 = arg9[arg5][arg10][arg3];
        int var12 = arg9[arg5][arg10 + 1][arg3];
        if (arg8 >= 0) {
            field889 = -85;
        }
        int var13 = arg9[arg5][arg10 + 1][arg3 + 1];
        int var14 = arg9[arg5][arg10][arg3 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class72 var16 = class72.method588(arg2);
        int var17 = (arg2 << 14) + (arg3 << 7) + arg10 + 1073741824;
        if (!var16.field1681) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg7);
        if (arg7 == 22) {
            class1 var19;
            if (var16.field1679 == -1 && var16.field1689 == null) {
                var19 = var16.method586(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var19 = new class58(var12, var14, -486, var16.field1679, arg2, var13, arg0, var11, true, 22);
            }
            arg4.method412(arg3, var15, var19, 30713, var18, arg1, var17, arg10);
            if (var16.field1683 && var16.field1681) {
                arg6.method304(arg10, arg3, (byte) 3);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class1 var39;
            if (var16.field1679 == -1 && var16.field1689 == null) {
                var39 = var16.method586(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var39 = new class58(var12, var14, -486, var16.field1679, arg2, var13, arg0, var11, true, 10);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg7 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg0 == 1 || arg0 == 3) {
                    var41 = var16.field1723;
                    var42 = var16.field1707;
                } else {
                    var41 = var16.field1707;
                    var42 = var16.field1723;
                }
                arg4.method416(var41, arg3, arg10, var18, var39, var42, var40, field893, arg1, var17, var15);
            }
            if (var16.field1683) {
                arg6.method303(arg10, 3, arg0, var16.field1723, var16.field1711, arg3, var16.field1707);
            }
        } else if (arg7 >= 12) {
            class1 var20;
            if (var16.field1679 == -1 && var16.field1689 == null) {
                var20 = var16.method586(arg7, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new class58(var12, var14, -486, var16.field1679, arg2, var13, arg0, var11, true, arg7);
            }
            arg4.method416(1, arg3, arg10, var18, var20, 1, 0, field893, arg1, var17, var15);
            if (var16.field1683) {
                arg6.method303(arg10, 3, arg0, var16.field1723, var16.field1711, arg3, var16.field1707);
            }
        } else if (arg7 == 0) {
            class1 var21;
            if (var16.field1679 == -1 && var16.field1689 == null) {
                var21 = var16.method586(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new class58(var12, var14, -486, var16.field1679, arg2, var13, arg0, var11, true, 0);
            }
            arg4.method414(0, var17, arg1, field906[arg0], arg3, var18, arg10, var21, var15, -511, null);
            if (var16.field1683) {
                arg6.method302(true, arg7, arg3, var16.field1711, arg10, arg0);
            }
        } else if (arg7 == 1) {
            class1 var22;
            if (var16.field1679 == -1 && var16.field1689 == null) {
                var22 = var16.method586(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new class58(var12, var14, -486, var16.field1679, arg2, var13, arg0, var11, true, 1);
            }
            arg4.method414(0, var17, arg1, field912[arg0], arg3, var18, arg10, var22, var15, -511, null);
            if (var16.field1683) {
                arg6.method302(true, arg7, arg3, var16.field1711, arg10, arg0);
            }
        } else if (arg7 == 2) {
            int var23 = arg0 + 1 & 0x3;
            class1 var24;
            class1 var25;
            if (var16.field1679 == -1 && var16.field1689 == null) {
                var24 = var16.method586(2, arg0 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method586(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class58(var12, var14, -486, var16.field1679, arg2, var13, arg0 + 4, var11, true, 2);
                var25 = new class58(var12, var14, -486, var16.field1679, arg2, var13, var23, var11, true, 2);
            }
            arg4.method414(field906[var23], var17, arg1, field906[arg0], arg3, var18, arg10, var24, var15, -511, var25);
            if (var16.field1683) {
                arg6.method302(true, arg7, arg3, var16.field1711, arg10, arg0);
            }
        } else if (arg7 == 3) {
            class1 var26;
            if (var16.field1679 == -1 && var16.field1689 == null) {
                var26 = var16.method586(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var26 = new class58(var12, var14, -486, var16.field1679, arg2, var13, arg0, var11, true, 3);
            }
            arg4.method414(0, var17, arg1, field912[arg0], arg3, var18, arg10, var26, var15, -511, null);
            if (var16.field1683) {
                arg6.method302(true, arg7, arg3, var16.field1711, arg10, arg0);
            }
        } else if (arg7 == 9) {
            class1 var27;
            if (var16.field1679 == -1 && var16.field1689 == null) {
                var27 = var16.method586(arg7, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new class58(var12, var14, -486, var16.field1679, arg2, var13, arg0, var11, true, arg7);
            }
            arg4.method416(1, arg3, arg10, var18, var27, 1, 0, field893, arg1, var17, var15);
            if (var16.field1683) {
                arg6.method303(arg10, 3, arg0, var16.field1723, var16.field1711, arg3, var16.field1707);
            }
        } else {
            if (var16.field1674) {
                if (arg0 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg0 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg0 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg7 == 4) {
                class1 var32;
                if (var16.field1679 == -1 && var16.field1689 == null) {
                    var32 = var16.method586(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class58(var12, var14, -486, var16.field1679, arg2, var13, 0, var11, true, 4);
                }
                arg4.method415(arg3, var17, var15, arg1, arg10, 0, (byte) 1, field906[arg0], 0, arg0 * 512, var18, var32);
            } else if (arg7 == 5) {
                int var33 = 16;
                int var34 = arg4.method432(arg1, arg10, arg3);
                if (var34 > 0) {
                    var33 = class72.method588(var34 >> 14 & 0x7FFF).field1712;
                }
                class1 var35;
                if (var16.field1679 == -1 && var16.field1689 == null) {
                    var35 = var16.method586(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class58(var12, var14, -486, var16.field1679, arg2, var13, 0, var11, true, 4);
                }
                arg4.method415(arg3, var17, var15, arg1, arg10, field891[arg0] * var33, (byte) 1, field906[arg0], field908[arg0] * var33, arg0 * 512, var18, var35);
            } else if (arg7 == 6) {
                class1 var36;
                if (var16.field1679 == -1 && var16.field1689 == null) {
                    var36 = var16.method586(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class58(var12, var14, -486, var16.field1679, arg2, var13, 0, var11, true, 4);
                }
                arg4.method415(arg3, var17, var15, arg1, arg10, 0, (byte) 1, 256, 0, arg0, var18, var36);
            } else if (arg7 == 7) {
                class1 var37;
                if (var16.field1679 == -1 && var16.field1689 == null) {
                    var37 = var16.method586(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class58(var12, var14, -486, var16.field1679, arg2, var13, 0, var11, true, 4);
                }
                arg4.method415(arg3, var17, var15, arg1, arg10, 0, (byte) 1, 512, 0, arg0, var18, var37);
            } else if (arg7 == 8) {
                class1 var38;
                if (var16.field1679 == -1 && var16.field1689 == null) {
                    var38 = var16.method586(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class58(var12, var14, -486, var16.field1679, arg2, var13, 0, var11, true, 4);
                }
                arg4.method415(arg3, var17, var15, arg1, arg10, 0, (byte) 1, 768, 0, arg0, var18, var38);
            }
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(I[BIIIIIII[LMPYOQJPZ;)V")
    public final void method291(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class32[] arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg5 + var11 > 0 && arg5 + var11 < 103 && arg2 + var16 > 0 && arg2 + var16 < 103) {
                    arg9[arg0].field926[arg5 + var11][arg2 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class33 var12 = new class33(true, arg1);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg3 == var13 && var14 >= arg7 && var14 < arg7 + 8 && var15 >= arg4 && var15 < arg4 + 8) {
                        this.method283(arg8, arg2 + class10.method180(var15 & 0x7, var14 & 0x7, field889, arg8), -414, 0, 0, var12, arg5 + class10.method179(var15 & 0x7, -984, arg8, var14 & 0x7), arg0);
                    } else {
                        this.method283(0, -1, -414, 0, 0, var12, -1, 0);
                    }
                }
            }
        }
        if (arg6 != 4) {
            field889 = 217;
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "<init>", descriptor = "([[[III[[[BZ)V")
    public class31(int[][][] arg0, int arg1, int arg2, byte[][][] arg3, boolean arg4) {
        field909 = 99;
        this.field910 = arg2;
        this.field911 = arg1;
        this.field890 = arg0;
        this.field915 = arg3;
        this.field914 = new byte[4][this.field910][this.field911];
        this.field905 = new byte[4][this.field910][this.field911];
        this.field896 = new byte[4][this.field910][this.field911];
        this.field892 = new byte[4][this.field910][this.field911];
        this.field895 = new int[4][this.field910 + 1][this.field911 + 1];
        this.field898 = new byte[4][this.field910 + 1][this.field911 + 1];
        this.field894 = new int[this.field910 + 1][this.field911 + 1];
        this.field900 = new int[this.field911];
        this.field901 = new int[this.field911];
        this.field902 = new int[this.field911];
        if (arg4) {
            this.field916 = -459;
        }
        this.field903 = new int[this.field911];
        this.field904 = new int[this.field911];
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(IILMPYOQJPZ;LRGNQYESN;IIIII)V")
    private final void method292(int arg0, int arg1, class32 arg2, class46 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field917 && (this.field915[0][arg4][arg0] & 0x2) == 0) {
            if ((this.field915[arg1][arg4][arg0] & 0x10) != 0) {
                return;
            }
            if (this.method294(arg1, 31801, arg0, arg4) != field907) {
                return;
            }
        }
        if (arg1 < field909) {
            field909 = arg1;
        }
        int var10 = this.field890[arg1][arg4][arg0];
        int var11 = this.field890[arg1][arg4 + 1][arg0];
        int var12 = this.field890[arg1][arg4 + 1][arg0 + 1];
        int var13 = this.field890[arg1][arg4][arg0 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class72 var15 = class72.method588(arg8);
        int var16 = (arg8 << 14) + (arg0 << 7) + arg4 + 1073741824;
        if (arg5 != 0) {
            return;
        }
        if (!var15.field1681) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg7 << 6) + arg6);
        if (arg6 == 22) {
            if (!field917 || var15.field1681 || var15.field1710) {
                class1 var18;
                if (var15.field1679 == -1 && var15.field1689 == null) {
                    var18 = var15.method586(22, arg7, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class58(var11, var13, -486, var15.field1679, arg8, var12, arg7, var10, true, 22);
                }
                arg3.method412(arg0, var14, var18, 30713, var17, arg1, var16, arg4);
                if (var15.field1683 && var15.field1681 && arg2 != null) {
                    arg2.method304(arg4, arg0, (byte) 3);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class1 var38;
            if (var15.field1679 == -1 && var15.field1689 == null) {
                var38 = var15.method586(10, arg7, var10, var11, var12, var13, -1);
            } else {
                var38 = new class58(var11, var13, -486, var15.field1679, arg8, var12, arg7, var10, true, 10);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg6 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg7 == 1 || arg7 == 3) {
                    var40 = var15.field1723;
                    var41 = var15.field1707;
                } else {
                    var40 = var15.field1707;
                    var41 = var15.field1723;
                }
                if (arg3.method416(var40, arg0, arg4, var17, var38, var41, var39, field893, arg1, var16, var14) && var15.field1686) {
                    class70 var42;
                    if (var38 instanceof class70) {
                        var42 = (class70) var38;
                    } else {
                        var42 = var15.method586(10, arg7, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1595 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field898[arg1][arg4 + var43][arg0 + var44]) {
                                    this.field898[arg1][arg4 + var43][arg0 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1683 && arg2 != null) {
                arg2.method303(arg4, 3, arg7, var15.field1723, var15.field1711, arg0, var15.field1707);
            }
        } else if (arg6 >= 12) {
            class1 var19;
            if (var15.field1679 == -1 && var15.field1689 == null) {
                var19 = var15.method586(arg6, arg7, var10, var11, var12, var13, -1);
            } else {
                var19 = new class58(var11, var13, -486, var15.field1679, arg8, var12, arg7, var10, true, arg6);
            }
            arg3.method416(1, arg0, arg4, var17, var19, 1, 0, field893, arg1, var16, var14);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
                this.field895[arg1][arg4][arg0] |= 0x924;
            }
            if (var15.field1683 && arg2 != null) {
                arg2.method303(arg4, 3, arg7, var15.field1723, var15.field1711, arg0, var15.field1707);
            }
        } else if (arg6 == 0) {
            class1 var20;
            if (var15.field1679 == -1 && var15.field1689 == null) {
                var20 = var15.method586(0, arg7, var10, var11, var12, var13, -1);
            } else {
                var20 = new class58(var11, var13, -486, var15.field1679, arg8, var12, arg7, var10, true, 0);
            }
            arg3.method414(0, var16, arg1, field906[arg7], arg0, var17, arg4, var20, var14, -511, null);
            if (arg7 == 0) {
                if (var15.field1686) {
                    this.field898[arg1][arg4][arg0] = 50;
                    this.field898[arg1][arg4][arg0 + 1] = 50;
                }
                if (var15.field1680) {
                    this.field895[arg1][arg4][arg0] |= 0x249;
                }
            } else if (arg7 == 1) {
                if (var15.field1686) {
                    this.field898[arg1][arg4][arg0 + 1] = 50;
                    this.field898[arg1][arg4 + 1][arg0 + 1] = 50;
                }
                if (var15.field1680) {
                    this.field895[arg1][arg4][arg0 + 1] |= 0x492;
                }
            } else if (arg7 == 2) {
                if (var15.field1686) {
                    this.field898[arg1][arg4 + 1][arg0] = 50;
                    this.field898[arg1][arg4 + 1][arg0 + 1] = 50;
                }
                if (var15.field1680) {
                    this.field895[arg1][arg4 + 1][arg0] |= 0x249;
                }
            } else if (arg7 == 3) {
                if (var15.field1686) {
                    this.field898[arg1][arg4][arg0] = 50;
                    this.field898[arg1][arg4 + 1][arg0] = 50;
                }
                if (var15.field1680) {
                    this.field895[arg1][arg4][arg0] |= 0x492;
                }
            }
            if (var15.field1683 && arg2 != null) {
                arg2.method302(true, arg6, arg0, var15.field1711, arg4, arg7);
            }
            if (var15.field1712 != 16) {
                arg3.method422(false, arg0, arg4, arg1, var15.field1712);
            }
        } else if (arg6 == 1) {
            class1 var21;
            if (var15.field1679 == -1 && var15.field1689 == null) {
                var21 = var15.method586(1, arg7, var10, var11, var12, var13, -1);
            } else {
                var21 = new class58(var11, var13, -486, var15.field1679, arg8, var12, arg7, var10, true, 1);
            }
            arg3.method414(0, var16, arg1, field912[arg7], arg0, var17, arg4, var21, var14, -511, null);
            if (var15.field1686) {
                if (arg7 == 0) {
                    this.field898[arg1][arg4][arg0 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field898[arg1][arg4 + 1][arg0 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field898[arg1][arg4 + 1][arg0] = 50;
                } else if (arg7 == 3) {
                    this.field898[arg1][arg4][arg0] = 50;
                }
            }
            if (var15.field1683 && arg2 != null) {
                arg2.method302(true, arg6, arg0, var15.field1711, arg4, arg7);
            }
        } else if (arg6 == 2) {
            int var22 = arg7 + 1 & 0x3;
            class1 var23;
            class1 var24;
            if (var15.field1679 == -1 && var15.field1689 == null) {
                var23 = var15.method586(2, arg7 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method586(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class58(var11, var13, -486, var15.field1679, arg8, var12, arg7 + 4, var10, true, 2);
                var24 = new class58(var11, var13, -486, var15.field1679, arg8, var12, var22, var10, true, 2);
            }
            arg3.method414(field906[var22], var16, arg1, field906[arg7], arg0, var17, arg4, var23, var14, -511, var24);
            if (var15.field1680) {
                if (arg7 == 0) {
                    this.field895[arg1][arg4][arg0] |= 0x249;
                    this.field895[arg1][arg4][arg0 + 1] |= 0x492;
                } else if (arg7 == 1) {
                    this.field895[arg1][arg4][arg0 + 1] |= 0x492;
                    this.field895[arg1][arg4 + 1][arg0] |= 0x249;
                } else if (arg7 == 2) {
                    this.field895[arg1][arg4 + 1][arg0] |= 0x249;
                    this.field895[arg1][arg4][arg0] |= 0x492;
                } else if (arg7 == 3) {
                    this.field895[arg1][arg4][arg0] |= 0x492;
                    this.field895[arg1][arg4][arg0] |= 0x249;
                }
            }
            if (var15.field1683 && arg2 != null) {
                arg2.method302(true, arg6, arg0, var15.field1711, arg4, arg7);
            }
            if (var15.field1712 != 16) {
                arg3.method422(false, arg0, arg4, arg1, var15.field1712);
            }
        } else if (arg6 == 3) {
            class1 var25;
            if (var15.field1679 == -1 && var15.field1689 == null) {
                var25 = var15.method586(3, arg7, var10, var11, var12, var13, -1);
            } else {
                var25 = new class58(var11, var13, -486, var15.field1679, arg8, var12, arg7, var10, true, 3);
            }
            arg3.method414(0, var16, arg1, field912[arg7], arg0, var17, arg4, var25, var14, -511, null);
            if (var15.field1686) {
                if (arg7 == 0) {
                    this.field898[arg1][arg4][arg0 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field898[arg1][arg4 + 1][arg0 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field898[arg1][arg4 + 1][arg0] = 50;
                } else if (arg7 == 3) {
                    this.field898[arg1][arg4][arg0] = 50;
                }
            }
            if (var15.field1683 && arg2 != null) {
                arg2.method302(true, arg6, arg0, var15.field1711, arg4, arg7);
            }
        } else if (arg6 == 9) {
            class1 var26;
            if (var15.field1679 == -1 && var15.field1689 == null) {
                var26 = var15.method586(arg6, arg7, var10, var11, var12, var13, -1);
            } else {
                var26 = new class58(var11, var13, -486, var15.field1679, arg8, var12, arg7, var10, true, arg6);
            }
            arg3.method416(1, arg0, arg4, var17, var26, 1, 0, field893, arg1, var16, var14);
            if (var15.field1683 && arg2 != null) {
                arg2.method303(arg4, 3, arg7, var15.field1723, var15.field1711, arg0, var15.field1707);
            }
        } else {
            if (var15.field1674) {
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
            if (arg6 == 4) {
                class1 var31;
                if (var15.field1679 == -1 && var15.field1689 == null) {
                    var31 = var15.method586(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class58(var11, var13, -486, var15.field1679, arg8, var12, 0, var10, true, 4);
                }
                arg3.method415(arg0, var16, var14, arg1, arg4, 0, (byte) 1, field906[arg7], 0, arg7 * 512, var17, var31);
            } else if (arg6 == 5) {
                int var32 = 16;
                int var33 = arg3.method432(arg1, arg4, arg0);
                if (var33 > 0) {
                    var32 = class72.method588(var33 >> 14 & 0x7FFF).field1712;
                }
                class1 var34;
                if (var15.field1679 == -1 && var15.field1689 == null) {
                    var34 = var15.method586(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class58(var11, var13, -486, var15.field1679, arg8, var12, 0, var10, true, 4);
                }
                arg3.method415(arg0, var16, var14, arg1, arg4, field891[arg7] * var32, (byte) 1, field906[arg7], field908[arg7] * var32, arg7 * 512, var17, var34);
            } else if (arg6 == 6) {
                class1 var35;
                if (var15.field1679 == -1 && var15.field1689 == null) {
                    var35 = var15.method586(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class58(var11, var13, -486, var15.field1679, arg8, var12, 0, var10, true, 4);
                }
                arg3.method415(arg0, var16, var14, arg1, arg4, 0, (byte) 1, 256, 0, arg7, var17, var35);
            } else if (arg6 == 7) {
                class1 var36;
                if (var15.field1679 == -1 && var15.field1689 == null) {
                    var36 = var15.method586(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class58(var11, var13, -486, var15.field1679, arg8, var12, 0, var10, true, 4);
                }
                arg3.method415(arg0, var16, var14, arg1, arg4, 0, (byte) 1, 512, 0, arg7, var17, var36);
            } else if (arg6 == 8) {
                class1 var37;
                if (var15.field1679 == -1 && var15.field1689 == null) {
                    var37 = var15.method586(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class58(var11, var13, -486, var15.field1679, arg8, var12, 0, var10, true, 4);
                }
                arg3.method415(arg0, var16, var14, arg1, arg4, 0, (byte) 1, 768, 0, arg7, var17, var37);
            }
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "([BIIIILRGNQYESN;IIZI[LMPYOQJPZ;)V")
    public final void method293(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class46 arg5, int arg6, int arg7, boolean arg8, int arg9, class32[] arg10) {
        class33 var12 = new class33(true, arg0);
        if (arg8) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = -1;
        while (true) {
            int var15 = var12.method339();
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method339();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method325();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg4 == var20 && var19 >= arg6 && var19 < arg6 + 8 && var18 >= arg1 && var18 < arg1 + 8) {
                    class72 var24 = class72.method588(var14);
                    int var25 = arg9 + class10.method181(arg2, var24.field1707, var18 & 0x7, (byte) 6, var19 & 0x7, var24.field1723);
                    int var26 = arg3 + class10.method182(var24.field1723, var19 & 0x7, var18 & 0x7, true, var24.field1707, arg2);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg7;
                        if ((this.field915[1][var25][var26] & 0x2) == 2) {
                            var27 = arg7 - 1;
                        }
                        class32 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg10[var27];
                        }
                        this.method292(var26, arg7, var28, arg5, var25, 0, var22, arg2 + var23 & 0x3, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(IIII)I")
    public int method294(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 31801) {
            this.field888 = !this.field888;
        }
        if ((this.field915[arg0][arg3][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (this.field915[1][arg3][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "d", descriptor = "(II)I")
    private static final int method295(int arg0, int arg1) {
        int var2 = method288(arg0 - 1, arg1 - 1) + method288(arg0 + 1, arg1 - 1) + method288(arg0 - 1, arg1 + 1) + method288(arg0 + 1, arg1 + 1);
        int var3 = method288(arg0 - 1, arg1) + method288(arg0 + 1, arg1) + method288(arg0, arg1 - 1) + method288(arg0, arg1 + 1);
        int var4 = method288(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "([BIBI[LMPYOQJPZ;LRGNQYESN;)V")
    public final void method296(byte[] arg0, int arg1, byte arg2, int arg3, class32[] arg4, class46 arg5) {
        class33 var7 = new class33(true, arg0);
        int var8 = -1;
        if (arg2 != 4) {
            return;
        }
        boolean var9 = false;
        while (true) {
            int var10 = var7.method339();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method339();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method325();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg3 + var14;
                int var20 = arg1 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field915[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class32 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg4[var21];
                    }
                    this.method292(var20, var15, var22, arg5, var19, 0, var17, var18, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "(IIIII)V")
    public final void method297(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 24112) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = arg4; var7 <= arg1 + arg4; var7++) {
            for (int var8 = arg3; var8 <= arg2 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field910 && var7 >= 0 && var7 < this.field911) {
                    this.field898[0][var8][var7] = 127;
                    if (arg3 == var8 && var8 > 0) {
                        this.field890[0][var8][var7] = this.field890[0][var8 - 1][var7];
                    }
                    if (arg2 + arg3 == var8 && var8 < this.field910 - 1) {
                        this.field890[0][var8][var7] = this.field890[0][var8 + 1][var7];
                    }
                    if (arg4 == var7 && var7 > 0) {
                        this.field890[0][var8][var7] = this.field890[0][var8][var7 - 1];
                    }
                    if (arg1 + arg4 == var7 && var7 < this.field911 - 1) {
                        this.field890[0][var8][var7] = this.field890[0][var8][var7 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "MPWDIIUH", name = "e", descriptor = "(II)I")
    private final int method298(int arg0, int arg1) {
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

    @OriginalMember(owner = "MPWDIIUH", name = "b", descriptor = "(IIII)I")
    private static final int method299(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class44.field1059[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "MPWDIIUH", name = "a", descriptor = "([LMPYOQJPZ;ILRGNQYESN;)V")
    public final void method300(class32[] arg0, int arg1, class46 arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field915[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field915[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method304(var111, var112, (byte) 3);
                        }
                    }
                }
            }
        }
        field899 += (int) (Math.random() * 5.0D) - 2;
        if (field899 < -8) {
            field899 = -8;
        }
        if (field899 > 8) {
            field899 = 8;
        }
        field913 += (int) (Math.random() * 5.0D) - 2;
        if (field913 < -16) {
            field913 = -16;
        }
        if (field913 > 16) {
            field913 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var49 = this.field898[var5];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field911 - 1; var57++) {
                for (int var102 = 1; var102 < this.field910 - 1; var102++) {
                    int var103 = this.field890[var5][var102 + 1][var57] - this.field890[var5][var102 - 1][var57];
                    int var104 = this.field890[var5][var102][var57 + 1] - this.field890[var5][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field894[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field911; var58++) {
                this.field900[var58] = 0;
                this.field901[var58] = 0;
                this.field902[var58] = 0;
                this.field903[var58] = 0;
                this.field904[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field910 + 5; var59++) {
                for (int var62 = 0; var62 < this.field911; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field910) {
                        int var97 = this.field914[var5][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            class2 var98 = class2.field7[var97 - 1];
                            this.field900[var62] += var98.field16;
                            this.field901[var62] += var98.field14;
                            this.field902[var62] += var98.field15;
                            this.field903[var62] += var98.field17;
                            var10002 = this.field904[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field910) {
                        int var100 = this.field914[var5][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            class2 var101 = class2.field7[var100 - 1];
                            this.field900[var62] -= var101.field16;
                            this.field901[var62] -= var101.field14;
                            this.field902[var62] -= var101.field15;
                            this.field903[var62] -= var101.field17;
                            var10002 = this.field904[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field910 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field911 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field911) {
                            var63 += this.field900[var69];
                            var64 += this.field901[var69];
                            var65 += this.field902[var69];
                            var66 += this.field903[var69];
                            var67 += this.field904[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field911) {
                            var63 -= this.field900[var70];
                            var64 -= this.field901[var70];
                            var65 -= this.field902[var70];
                            var66 -= this.field903[var70];
                            var67 -= this.field904[var70];
                        }
                        if (var68 >= 1 && var68 < this.field911 - 1 && (!field917 || (this.field915[0][var59][var68] & 0x2) != 0 || (this.field915[var5][var59][var68] & 0x10) == 0 && this.method294(var5, 31801, var68, var59) == field907)) {
                            if (var5 < field909) {
                                field909 = var5;
                            }
                            int var71 = this.field914[var5][var59][var68] & 0xFF;
                            int var72 = this.field905[var5][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field890[var5][var59][var68];
                                int var74 = this.field890[var5][var59 + 1][var68];
                                int var75 = this.field890[var5][var59 + 1][var68 + 1];
                                int var76 = this.field890[var5][var59][var68 + 1];
                                int var77 = this.field894[var59][var68];
                                int var78 = this.field894[var59 + 1][var68];
                                int var79 = this.field894[var59 + 1][var68 + 1];
                                int var80 = this.field894[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method286(var83, var84, var85);
                                    int var86 = field899 + var83 & 0xFF;
                                    int var87 = field913 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method286(var86, var84, var87);
                                }
                                if (var5 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field896[var5][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !class2.field7[var72 - 1].field12) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field895[var5][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = class44.field1070[method284(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg2.method411(var5, var59, var68, 0, 0, -1, var73, var74, var75, var76, method284(var81, var77), method284(var81, var78), method284(var81, var79), method284(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field896[var5][var59][var68] + 1;
                                    byte var91 = this.field892[var5][var59][var68];
                                    class2 var92 = class2.field7[var72 - 1];
                                    int var93 = var92.field10;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = class44.method391(0, var93);
                                        var95 = -1;
                                    } else if (var92.field9 == 16711935) {
                                        var94 = 0;
                                        var95 = -2;
                                        var93 = -1;
                                    } else {
                                        var95 = this.method286(var92.field13, var92.field14, var92.field15);
                                        var94 = class44.field1070[this.method298(var92.field18, 96)];
                                    }
                                    arg2.method411(var5, var59, var68, var90, var91, var93, var73, var74, var75, var76, method284(var81, var77), method284(var81, var78), method284(var81, var79), method284(var81, var80), this.method298(var95, var77), this.method298(var95, var78), this.method298(var95, var79), this.method298(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field911 - 1; var60++) {
                for (int var61 = 1; var61 < this.field910 - 1; var61++) {
                    arg2.method410(var5, var61, var60, this.method294(var5, 31801, var60, var61));
                }
            }
        }
        arg2.method437(768, 64, -50, false, -50, -10);
        while (arg1 >= 0) {
            for (int var48 = 1; var48 > 0; var48++) {
            }
        }
        for (int var6 = 0; var6 < this.field910; var6++) {
            for (int var47 = 0; var47 < this.field911; var47++) {
                if ((this.field915[1][var6][var47] & 0x2) == 2) {
                    arg2.method408(var6, 0, var47);
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
                for (int var12 = 0; var12 <= this.field911; var12++) {
                    for (int var13 = 0; var13 <= this.field910; var13++) {
                        if ((this.field895[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field895[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field911 && (this.field895[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label332: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field895[var16 - 1][var13][var18] & var7) == 0) {
                                        break label332;
                                    }
                                }
                                var16--;
                            }
                            label321: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field895[var17 + 1][var13][var19] & var7) == 0) {
                                        break label321;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field890[var17][var13][var14] - var21;
                                int var23 = this.field890[var16][var13][var14];
                                class46.method409(var22, var13 * 128, var10, var23, 29016, var13 * 128, 1, var15 * 128 + 128, var14 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field895[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field895[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field895[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field910 && (this.field895[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label385: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field895[var28 - 1][var30][var12] & var8) == 0) {
                                        break label385;
                                    }
                                }
                                var28--;
                            }
                            label374: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field895[var29 + 1][var31][var12] & var8) == 0) {
                                        break label374;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field890[var29][var26][var12] - var33;
                                int var35 = this.field890[var28][var26][var12];
                                class46.method409(var34, var27 * 128 + 128, var10, var35, 29016, var26 * 128, 2, var12 * 128, var12 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field895[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field895[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field895[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field911 && (this.field895[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label438: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field895[var11][var38 - 1][var42] & var9) == 0) {
                                        break label438;
                                    }
                                }
                                var38--;
                            }
                            label427: while (var39 < this.field910) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field895[var11][var39 + 1][var43] & var9) == 0) {
                                        break label427;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field890[var11][var38][var40];
                                class46.method409(var44, var39 * 128 + 128, var10, var44, 29016, var38 * 128, 4, var41 * 128 + 128, var40 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field895[var11][var45][var46] &= ~var9;
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
