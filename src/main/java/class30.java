import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KPOYRTLL")
public class class30 {

    @OriginalMember(owner = "client!KPOYRTLL", name = "q", descriptor = "I")
    private int field909 = 823;

    @OriginalMember(owner = "client!KPOYRTLL", name = "y", descriptor = "I")
    private int field917 = 45492;

    @OriginalMember(owner = "client!KPOYRTLL", name = "A", descriptor = "I")
    private int field919 = -17707;

    @OriginalMember(owner = "client!KPOYRTLL", name = "D", descriptor = "Z")
    private boolean field922 = true;

    @OriginalMember(owner = "client!KPOYRTLL", name = "n", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "client!KPOYRTLL", name = "o", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!KPOYRTLL", name = "w", descriptor = "[[[I")
    private int[][][] field915;

    @OriginalMember(owner = "client!KPOYRTLL", name = "C", descriptor = "[[[B")
    private byte[][][] field921;

    @OriginalMember(owner = "client!KPOYRTLL", name = "p", descriptor = "[[[B")
    private byte[][][] field908;

    @OriginalMember(owner = "client!KPOYRTLL", name = "b", descriptor = "[[[B")
    private byte[][][] field894;

    @OriginalMember(owner = "client!KPOYRTLL", name = "l", descriptor = "[[[B")
    private byte[][][] field904;

    @OriginalMember(owner = "client!KPOYRTLL", name = "x", descriptor = "[[[B")
    private byte[][][] field916;

    @OriginalMember(owner = "client!KPOYRTLL", name = "c", descriptor = "[[[I")
    private int[][][] field895;

    @OriginalMember(owner = "client!KPOYRTLL", name = "k", descriptor = "[[[B")
    private byte[][][] field903;

    @OriginalMember(owner = "client!KPOYRTLL", name = "t", descriptor = "[[I")
    private int[][] field912;

    @OriginalMember(owner = "client!KPOYRTLL", name = "e", descriptor = "[I")
    private int[] field897;

    @OriginalMember(owner = "client!KPOYRTLL", name = "f", descriptor = "[I")
    private int[] field898;

    @OriginalMember(owner = "client!KPOYRTLL", name = "g", descriptor = "[I")
    private int[] field899;

    @OriginalMember(owner = "client!KPOYRTLL", name = "h", descriptor = "[I")
    private int[] field900;

    @OriginalMember(owner = "client!KPOYRTLL", name = "i", descriptor = "[I")
    private int[] field901;

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "I")
    private static int field893 = 3;

    @OriginalMember(owner = "client!KPOYRTLL", name = "d", descriptor = "[I")
    private static final int[] field896 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!KPOYRTLL", name = "j", descriptor = "[I")
    private static final int[] field902 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!KPOYRTLL", name = "m", descriptor = "I")
    public static int field905 = 99;

    @OriginalMember(owner = "client!KPOYRTLL", name = "r", descriptor = "Z")
    private static boolean field910 = true;

    @OriginalMember(owner = "client!KPOYRTLL", name = "u", descriptor = "[I")
    private static final int[] field913 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!KPOYRTLL", name = "v", descriptor = "[I")
    private static final int[] field914 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!KPOYRTLL", name = "z", descriptor = "I")
    private static int field918 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!KPOYRTLL", name = "B", descriptor = "I")
    private static int field920 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!KPOYRTLL", name = "E", descriptor = "Z")
    public static boolean field923 = true;

    @OriginalMember(owner = "client!KPOYRTLL", name = "s", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!KPOYRTLL", name = "<init>", descriptor = "(BII[[[B[[[I)V")
    public class30(byte arg0, int arg1, int arg2, byte[][][] arg3, int[][][] arg4) {
        field905 = 99;
        this.field906 = arg1;
        this.field907 = arg2;
        this.field915 = arg4;
        this.field921 = arg3;
        this.field908 = new byte[4][this.field906][this.field907];
        this.field894 = new byte[4][this.field906][this.field907];
        this.field904 = new byte[4][this.field906][this.field907];
        this.field916 = new byte[4][this.field906][this.field907];
        this.field895 = new int[4][this.field906 + 1][this.field907 + 1];
        this.field903 = new byte[4][this.field906 + 1][this.field907 + 1];
        if (arg0 != 102) {
            throw new NullPointerException();
        }
        this.field912 = new int[this.field906 + 1][this.field907 + 1];
        this.field897 = new int[this.field907];
        this.field898 = new int[this.field907];
        this.field899 = new int[this.field907];
        this.field900 = new int[this.field907];
        this.field901 = new int[this.field907];
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(III)I")
    private static final int method243(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method258(var3, var5);
        int var8 = method258(var3 + 1, var5);
        int var9 = method258(var3, var5 + 1);
        int var10 = method258(var3 + 1, var5 + 1);
        int var11 = method257(var7, var8, var4, arg2);
        int var12 = method257(var9, var10, var4, arg2);
        return method257(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIIIIBI[B[LASFXKKJM;I)V")
    public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, byte[] arg7, class3[] arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg0 + var11 > 0 && arg0 + var11 < 103 && arg4 + var16 > 0 && arg4 + var16 < 103) {
                    arg8[arg6].field21[arg0 + var11][arg4 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class53 var12 = new class53(arg7, (byte) -17);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg9 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
                        this.method248(arg6, true, 0, arg4 + class1.method2(arg1, this.field919, var15 & 0x7, var14 & 0x7), 0, arg0 + class1.method1(var15 & 0x7, arg1, (byte) -68, var14 & 0x7), arg1, var12);
                    } else {
                        this.method248(0, true, 0, -1, 0, -1, 0, var12);
                    }
                }
            }
        }
        if (arg5 == -111) {
            ;
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "([LASFXKKJM;[BIIIIIIIILOUUKQIMK;)V")
    public final void method245(class3[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
        class53 var12 = new class53(arg1, (byte) -17);
        if (arg6 != 0) {
            this.field922 = !this.field922;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method469();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method469();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method455();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg4 == var19 && var18 >= arg2 && var18 < arg2 + 8 && var17 >= arg3 && var17 < arg3 + 8) {
                    class39 var23 = class39.method323(var13);
                    int var24 = arg5 + class1.method3(var23.field1145, var17 & 0x7, var23.field1135, (byte) 101, var22, var18 & 0x7, arg9);
                    int var25 = arg8 + class1.method4(var22, var17 & 0x7, true, var23.field1145, arg9, var18 & 0x7, var23.field1135);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg7;
                        if ((this.field921[1][var24][var25] & 0x2) == 2) {
                            var26 = arg7 - 1;
                        }
                        class3 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg0[var26];
                        }
                        this.method254(var21, var27, arg10, var13, var24, arg9 + var22 & 0x3, var25, arg7, -127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "b", descriptor = "(III)I")
    private final int method246(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!KPOYRTLL", name = "c", descriptor = "(III)Z")
    public static final boolean method247(int arg0, int arg1, int arg2) {
        class39 var3 = class39.method323(arg0);
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method329((byte) -113, arg2);
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IZIIIIILRGCGKKUR;)V")
    private final void method248(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class53 arg7) {
        if (!arg1) {
            this.field922 = !this.field922;
        }
        if (arg5 < 0 || arg5 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg7.method455();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method455();
                    return;
                }
                if (var11 <= 49) {
                    arg7.method455();
                }
            }
        }
        this.field921[arg0][arg5][arg3] = 0;
        while (true) {
            int var9 = arg7.method455();
            if (var9 == 0) {
                if (arg0 == 0) {
                    this.field915[0][arg5][arg3] = -method262(arg5 + arg2 + 932731, arg3 + 556238 + arg4) * 8;
                    return;
                } else {
                    this.field915[arg0][arg5][arg3] = this.field915[arg0 - 1][arg5][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method455();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg0 == 0) {
                    this.field915[0][arg5][arg3] = -var10 * 8;
                    return;
                }
                this.field915[arg0][arg5][arg3] = this.field915[arg0 - 1][arg5][arg3] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field894[arg0][arg5][arg3] = arg7.method456();
                this.field904[arg0][arg5][arg3] = (byte) ((var9 - 2) / 4);
                this.field916[arg0][arg5][arg3] = (byte) (var9 + arg6 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field921[arg0][arg5][arg3] = (byte) (var9 - 49);
            } else {
                this.field908[arg0][arg5][arg3] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(II)I")
    private static final int method249(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(ZLRGCGKKUR;LNTGEPOMK;)V")
    public static final void method250(boolean arg0, class53 arg1, class41 arg2) {
        int var3 = -1;
        if (!arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method469();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class39 var5 = class39.method323(var3);
            var5.method324((byte) 8, arg2);
            while (true) {
                int var6 = arg1.method469();
                if (var6 == 0) {
                    break;
                }
                arg1.method455();
            }
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "([BIZILOUUKQIMK;[LASFXKKJM;)V")
    public final void method251(byte[] arg0, int arg1, boolean arg2, int arg3, class45 arg4, class3[] arg5) {
        if (!arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        class53 var8 = new class53(arg0, (byte) -17);
        int var9 = -1;
        while (true) {
            int var10 = var8.method469();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method469();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method455();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg3 + var14;
                int var20 = arg1 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field921[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class3 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg5[var21];
                    }
                    this.method254(var17, var22, arg4, var9, var19, var18, var20, var15, -127);
                }
            }
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIII)I")
    public int method252(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            field893 = -266;
        }
        if ((this.field921[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (this.field921[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(LOUUKQIMK;IIILASFXKKJM;II[[[IIII)V")
    public static final void method253(class45 arg0, int arg1, int arg2, int arg3, class3 arg4, int arg5, int arg6, int[][][] arg7, int arg8, int arg9, int arg10) {
        int var11 = arg7[arg1][arg10][arg9];
        int var12 = arg7[arg1][arg10 + 1][arg9];
        int var13 = arg7[arg1][arg10 + 1][arg9 + 1];
        int var14 = arg7[arg1][arg10][arg9 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class39 var16 = class39.method323(arg8);
        int var17 = (arg8 << 14) + (arg9 << 7) + arg10 + 1073741824;
        if (!var16.field1117) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg3);
        if (arg6 <= 0) {
            for (int var19 = 1; var19 > 0; var19++) {
            }
        }
        if (arg3 == 22) {
            class35 var20;
            if (var16.field1108 == -1 && var16.field1107 == null) {
                var20 = var16.method328(22, arg5, var11, var12, var13, var14, -1);
            } else {
                var20 = new class50(var12, arg5, var13, var14, 22, var11, var16.field1108, true, true, arg8);
            }
            arg0.method370(arg9, var18, arg2, arg10, var20, var15, 3, var17);
            if (var16.field1130 && var16.field1117) {
                arg4.method8(arg10, arg9, true);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class35 var40;
            if (var16.field1108 == -1 && var16.field1107 == null) {
                var40 = var16.method328(10, arg5, var11, var12, var13, var14, -1);
            } else {
                var40 = new class50(var12, arg5, var13, var14, 10, var11, var16.field1108, true, true, arg8);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg3 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg5 == 1 || arg5 == 3) {
                    var42 = var16.field1135;
                    var43 = var16.field1145;
                } else {
                    var42 = var16.field1145;
                    var43 = var16.field1135;
                }
                arg0.method374(arg10, var42, var18, arg2, var43, var41, var15, arg9, (byte) 2, var40, var17);
            }
            if (var16.field1130) {
                arg4.method7(arg9, arg5, arg10, (byte) 2, var16.field1102, var16.field1135, var16.field1145);
            }
        } else if (arg3 >= 12) {
            class35 var21;
            if (var16.field1108 == -1 && var16.field1107 == null) {
                var21 = var16.method328(arg3, arg5, var11, var12, var13, var14, -1);
            } else {
                var21 = new class50(var12, arg5, var13, var14, arg3, var11, var16.field1108, true, true, arg8);
            }
            arg0.method374(arg10, 1, var18, arg2, 1, 0, var15, arg9, (byte) 2, var21, var17);
            if (var16.field1130) {
                arg4.method7(arg9, arg5, arg10, (byte) 2, var16.field1102, var16.field1135, var16.field1145);
            }
        } else if (arg3 == 0) {
            class35 var22;
            if (var16.field1108 == -1 && var16.field1107 == null) {
                var22 = var16.method328(0, arg5, var11, var12, var13, var14, -1);
            } else {
                var22 = new class50(var12, arg5, var13, var14, 0, var11, var16.field1108, true, true, arg8);
            }
            arg0.method372(arg10, arg2, var22, null, var18, 0, field913[arg5], var15, (byte) -82, arg9, var17);
            if (var16.field1130) {
                arg4.method6(field893, arg9, var16.field1102, arg3, arg10, arg5);
            }
        } else if (arg3 == 1) {
            class35 var23;
            if (var16.field1108 == -1 && var16.field1107 == null) {
                var23 = var16.method328(1, arg5, var11, var12, var13, var14, -1);
            } else {
                var23 = new class50(var12, arg5, var13, var14, 1, var11, var16.field1108, true, true, arg8);
            }
            arg0.method372(arg10, arg2, var23, null, var18, 0, field902[arg5], var15, (byte) -82, arg9, var17);
            if (var16.field1130) {
                arg4.method6(field893, arg9, var16.field1102, arg3, arg10, arg5);
            }
        } else if (arg3 == 2) {
            int var24 = arg5 + 1 & 0x3;
            class35 var25;
            class35 var26;
            if (var16.field1108 == -1 && var16.field1107 == null) {
                var25 = var16.method328(2, arg5 + 4, var11, var12, var13, var14, -1);
                var26 = var16.method328(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new class50(var12, arg5 + 4, var13, var14, 2, var11, var16.field1108, true, true, arg8);
                var26 = new class50(var12, var24, var13, var14, 2, var11, var16.field1108, true, true, arg8);
            }
            arg0.method372(arg10, arg2, var25, var26, var18, field913[var24], field913[arg5], var15, (byte) -82, arg9, var17);
            if (var16.field1130) {
                arg4.method6(field893, arg9, var16.field1102, arg3, arg10, arg5);
            }
        } else if (arg3 == 3) {
            class35 var27;
            if (var16.field1108 == -1 && var16.field1107 == null) {
                var27 = var16.method328(3, arg5, var11, var12, var13, var14, -1);
            } else {
                var27 = new class50(var12, arg5, var13, var14, 3, var11, var16.field1108, true, true, arg8);
            }
            arg0.method372(arg10, arg2, var27, null, var18, 0, field902[arg5], var15, (byte) -82, arg9, var17);
            if (var16.field1130) {
                arg4.method6(field893, arg9, var16.field1102, arg3, arg10, arg5);
            }
        } else if (arg3 == 9) {
            class35 var28;
            if (var16.field1108 == -1 && var16.field1107 == null) {
                var28 = var16.method328(arg3, arg5, var11, var12, var13, var14, -1);
            } else {
                var28 = new class50(var12, arg5, var13, var14, arg3, var11, var16.field1108, true, true, arg8);
            }
            arg0.method374(arg10, 1, var18, arg2, 1, 0, var15, arg9, (byte) 2, var28, var17);
            if (var16.field1130) {
                arg4.method7(arg9, arg5, arg10, (byte) 2, var16.field1102, var16.field1135, var16.field1145);
            }
        } else {
            if (var16.field1114) {
                if (arg5 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg5 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg5 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg3 == 4) {
                class35 var33;
                if (var16.field1108 == -1 && var16.field1107 == null) {
                    var33 = var16.method328(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new class50(var12, 0, var13, var14, 4, var11, var16.field1108, true, true, arg8);
                }
                arg0.method373(var33, -816, var18, arg5 * 512, field913[arg5], arg9, arg2, 0, var15, 0, arg10, var17);
            } else if (arg3 == 5) {
                int var34 = 16;
                int var35 = arg0.method390(arg2, arg10, arg9);
                if (var35 > 0) {
                    var34 = class39.method323(var35 >> 14 & 0x7FFF).field1116;
                }
                class35 var36;
                if (var16.field1108 == -1 && var16.field1107 == null) {
                    var36 = var16.method328(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class50(var12, 0, var13, var14, 4, var11, var16.field1108, true, true, arg8);
                }
                arg0.method373(var36, -816, var18, arg5 * 512, field913[arg5], arg9, arg2, field896[arg5] * var34, var15, field914[arg5] * var34, arg10, var17);
            } else if (arg3 == 6) {
                class35 var37;
                if (var16.field1108 == -1 && var16.field1107 == null) {
                    var37 = var16.method328(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class50(var12, 0, var13, var14, 4, var11, var16.field1108, true, true, arg8);
                }
                arg0.method373(var37, -816, var18, arg5, 256, arg9, arg2, 0, var15, 0, arg10, var17);
            } else if (arg3 == 7) {
                class35 var38;
                if (var16.field1108 == -1 && var16.field1107 == null) {
                    var38 = var16.method328(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class50(var12, 0, var13, var14, 4, var11, var16.field1108, true, true, arg8);
                }
                arg0.method373(var38, -816, var18, arg5, 512, arg9, arg2, 0, var15, 0, arg10, var17);
            } else if (arg3 == 8) {
                class35 var39;
                if (var16.field1108 == -1 && var16.field1107 == null) {
                    var39 = var16.method328(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new class50(var12, 0, var13, var14, 4, var11, var16.field1108, true, true, arg8);
                }
                arg0.method373(var39, -816, var18, arg5, 768, arg9, arg2, 0, var15, 0, arg10, var17);
            }
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(ILASFXKKJM;LOUUKQIMK;IIIIII)V")
    private final void method254(int arg0, class3 arg1, class45 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field923 && (this.field921[0][arg4][arg6] & 0x2) == 0) {
            if ((this.field921[arg7][arg4][arg6] & 0x10) != 0) {
                return;
            }
            if (this.method252(arg4, arg6, arg7, 823) != field911) {
                return;
            }
        }
        if (arg7 < field905) {
            field905 = arg7;
        }
        int var10 = this.field915[arg7][arg4][arg6];
        int var11 = this.field915[arg7][arg4 + 1][arg6];
        int var12 = this.field915[arg7][arg4 + 1][arg6 + 1];
        int var13 = this.field915[arg7][arg4][arg6 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class39 var15 = class39.method323(arg3);
        if (arg8 >= 0) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
        int var17 = (arg3 << 14) + (arg6 << 7) + arg4 + 1073741824;
        if (!var15.field1117) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg0);
        if (arg0 == 22) {
            if (!field923 || var15.field1117 || var15.field1100) {
                class35 var19;
                if (var15.field1108 == -1 && var15.field1107 == null) {
                    var19 = var15.method328(22, arg5, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class50(var11, arg5, var12, var13, 22, var10, var15.field1108, true, true, arg3);
                }
                arg2.method370(arg6, var18, arg7, arg4, var19, var14, 3, var17);
                if (var15.field1130 && var15.field1117 && arg1 != null) {
                    arg1.method8(arg4, arg6, true);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class35 var39;
            if (var15.field1108 == -1 && var15.field1107 == null) {
                var39 = var15.method328(10, arg5, var10, var11, var12, var13, -1);
            } else {
                var39 = new class50(var11, arg5, var12, var13, 10, var10, var15.field1108, true, true, arg3);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg0 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var15.field1135;
                    var42 = var15.field1145;
                } else {
                    var41 = var15.field1145;
                    var42 = var15.field1135;
                }
                if (arg2.method374(arg4, var41, var18, arg7, var42, var40, var14, arg6, (byte) 2, var39, var17) && var15.field1150) {
                    class37 var43;
                    if (var39 instanceof class37) {
                        var43 = (class37) var39;
                    } else {
                        var43 = var15.method328(10, arg5, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field1019 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field903[arg7][arg4 + var44][arg6 + var45]) {
                                    this.field903[arg7][arg4 + var44][arg6 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1130 && arg1 != null) {
                arg1.method7(arg6, arg5, arg4, (byte) 2, var15.field1102, var15.field1135, var15.field1145);
            }
        } else if (arg0 >= 12) {
            class35 var20;
            if (var15.field1108 == -1 && var15.field1107 == null) {
                var20 = var15.method328(arg0, arg5, var10, var11, var12, var13, -1);
            } else {
                var20 = new class50(var11, arg5, var12, var13, arg0, var10, var15.field1108, true, true, arg3);
            }
            arg2.method374(arg4, 1, var18, arg7, 1, 0, var14, arg6, (byte) 2, var20, var17);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
                this.field895[arg7][arg4][arg6] |= 0x924;
            }
            if (var15.field1130 && arg1 != null) {
                arg1.method7(arg6, arg5, arg4, (byte) 2, var15.field1102, var15.field1135, var15.field1145);
            }
        } else if (arg0 == 0) {
            class35 var21;
            if (var15.field1108 == -1 && var15.field1107 == null) {
                var21 = var15.method328(0, arg5, var10, var11, var12, var13, -1);
            } else {
                var21 = new class50(var11, arg5, var12, var13, 0, var10, var15.field1108, true, true, arg3);
            }
            arg2.method372(arg4, arg7, var21, null, var18, 0, field913[arg5], var14, (byte) -82, arg6, var17);
            if (arg5 == 0) {
                if (var15.field1150) {
                    this.field903[arg7][arg4][arg6] = 50;
                    this.field903[arg7][arg4][arg6 + 1] = 50;
                }
                if (var15.field1101) {
                    this.field895[arg7][arg4][arg6] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var15.field1150) {
                    this.field903[arg7][arg4][arg6 + 1] = 50;
                    this.field903[arg7][arg4 + 1][arg6 + 1] = 50;
                }
                if (var15.field1101) {
                    this.field895[arg7][arg4][arg6 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var15.field1150) {
                    this.field903[arg7][arg4 + 1][arg6] = 50;
                    this.field903[arg7][arg4 + 1][arg6 + 1] = 50;
                }
                if (var15.field1101) {
                    this.field895[arg7][arg4 + 1][arg6] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var15.field1150) {
                    this.field903[arg7][arg4][arg6] = 50;
                    this.field903[arg7][arg4 + 1][arg6] = 50;
                }
                if (var15.field1101) {
                    this.field895[arg7][arg4][arg6] |= 0x492;
                }
            }
            if (var15.field1130 && arg1 != null) {
                arg1.method6(field893, arg6, var15.field1102, arg0, arg4, arg5);
            }
            if (var15.field1116 != 16) {
                arg2.method380(arg7, arg4, true, var15.field1116, arg6);
            }
        } else if (arg0 == 1) {
            class35 var22;
            if (var15.field1108 == -1 && var15.field1107 == null) {
                var22 = var15.method328(1, arg5, var10, var11, var12, var13, -1);
            } else {
                var22 = new class50(var11, arg5, var12, var13, 1, var10, var15.field1108, true, true, arg3);
            }
            arg2.method372(arg4, arg7, var22, null, var18, 0, field902[arg5], var14, (byte) -82, arg6, var17);
            if (var15.field1150) {
                if (arg5 == 0) {
                    this.field903[arg7][arg4][arg6 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field903[arg7][arg4 + 1][arg6 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field903[arg7][arg4 + 1][arg6] = 50;
                } else if (arg5 == 3) {
                    this.field903[arg7][arg4][arg6] = 50;
                }
            }
            if (var15.field1130 && arg1 != null) {
                arg1.method6(field893, arg6, var15.field1102, arg0, arg4, arg5);
            }
        } else if (arg0 == 2) {
            int var23 = arg5 + 1 & 0x3;
            class35 var24;
            class35 var25;
            if (var15.field1108 == -1 && var15.field1107 == null) {
                var24 = var15.method328(2, arg5 + 4, var10, var11, var12, var13, -1);
                var25 = var15.method328(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class50(var11, arg5 + 4, var12, var13, 2, var10, var15.field1108, true, true, arg3);
                var25 = new class50(var11, var23, var12, var13, 2, var10, var15.field1108, true, true, arg3);
            }
            arg2.method372(arg4, arg7, var24, var25, var18, field913[var23], field913[arg5], var14, (byte) -82, arg6, var17);
            if (var15.field1101) {
                if (arg5 == 0) {
                    this.field895[arg7][arg4][arg6] |= 0x249;
                    this.field895[arg7][arg4][arg6 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field895[arg7][arg4][arg6 + 1] |= 0x492;
                    this.field895[arg7][arg4 + 1][arg6] |= 0x249;
                } else if (arg5 == 2) {
                    this.field895[arg7][arg4 + 1][arg6] |= 0x249;
                    this.field895[arg7][arg4][arg6] |= 0x492;
                } else if (arg5 == 3) {
                    this.field895[arg7][arg4][arg6] |= 0x492;
                    this.field895[arg7][arg4][arg6] |= 0x249;
                }
            }
            if (var15.field1130 && arg1 != null) {
                arg1.method6(field893, arg6, var15.field1102, arg0, arg4, arg5);
            }
            if (var15.field1116 != 16) {
                arg2.method380(arg7, arg4, true, var15.field1116, arg6);
            }
        } else if (arg0 == 3) {
            class35 var26;
            if (var15.field1108 == -1 && var15.field1107 == null) {
                var26 = var15.method328(3, arg5, var10, var11, var12, var13, -1);
            } else {
                var26 = new class50(var11, arg5, var12, var13, 3, var10, var15.field1108, true, true, arg3);
            }
            arg2.method372(arg4, arg7, var26, null, var18, 0, field902[arg5], var14, (byte) -82, arg6, var17);
            if (var15.field1150) {
                if (arg5 == 0) {
                    this.field903[arg7][arg4][arg6 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field903[arg7][arg4 + 1][arg6 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field903[arg7][arg4 + 1][arg6] = 50;
                } else if (arg5 == 3) {
                    this.field903[arg7][arg4][arg6] = 50;
                }
            }
            if (var15.field1130 && arg1 != null) {
                arg1.method6(field893, arg6, var15.field1102, arg0, arg4, arg5);
            }
        } else if (arg0 == 9) {
            class35 var27;
            if (var15.field1108 == -1 && var15.field1107 == null) {
                var27 = var15.method328(arg0, arg5, var10, var11, var12, var13, -1);
            } else {
                var27 = new class50(var11, arg5, var12, var13, arg0, var10, var15.field1108, true, true, arg3);
            }
            arg2.method374(arg4, 1, var18, arg7, 1, 0, var14, arg6, (byte) 2, var27, var17);
            if (var15.field1130 && arg1 != null) {
                arg1.method7(arg6, arg5, arg4, (byte) 2, var15.field1102, var15.field1135, var15.field1145);
            }
        } else {
            if (var15.field1114) {
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
            if (arg0 == 4) {
                class35 var32;
                if (var15.field1108 == -1 && var15.field1107 == null) {
                    var32 = var15.method328(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class50(var11, 0, var12, var13, 4, var10, var15.field1108, true, true, arg3);
                }
                arg2.method373(var32, -816, var18, arg5 * 512, field913[arg5], arg6, arg7, 0, var14, 0, arg4, var17);
            } else if (arg0 == 5) {
                int var33 = 16;
                int var34 = arg2.method390(arg7, arg4, arg6);
                if (var34 > 0) {
                    var33 = class39.method323(var34 >> 14 & 0x7FFF).field1116;
                }
                class35 var35;
                if (var15.field1108 == -1 && var15.field1107 == null) {
                    var35 = var15.method328(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class50(var11, 0, var12, var13, 4, var10, var15.field1108, true, true, arg3);
                }
                arg2.method373(var35, -816, var18, arg5 * 512, field913[arg5], arg6, arg7, field896[arg5] * var33, var14, field914[arg5] * var33, arg4, var17);
            } else if (arg0 == 6) {
                class35 var36;
                if (var15.field1108 == -1 && var15.field1107 == null) {
                    var36 = var15.method328(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class50(var11, 0, var12, var13, 4, var10, var15.field1108, true, true, arg3);
                }
                arg2.method373(var36, -816, var18, arg5, 256, arg6, arg7, 0, var14, 0, arg4, var17);
            } else if (arg0 == 7) {
                class35 var37;
                if (var15.field1108 == -1 && var15.field1107 == null) {
                    var37 = var15.method328(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class50(var11, 0, var12, var13, 4, var10, var15.field1108, true, true, arg3);
                }
                arg2.method373(var37, -816, var18, arg5, 512, arg6, arg7, 0, var14, 0, arg4, var17);
            } else if (arg0 == 8) {
                class35 var38;
                if (var15.field1108 == -1 && var15.field1107 == null) {
                    var38 = var15.method328(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class50(var11, 0, var12, var13, 4, var10, var15.field1108, true, true, arg3);
                }
                arg2.method373(var38, -816, var18, arg5, 768, arg6, arg7, 0, var14, 0, arg4, var17);
            }
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIIB)V")
    public final void method255(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 7) {
            return;
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < 8; var6++) {
            for (int var9 = 0; var9 < 8; var9++) {
                this.field915[arg2][arg0 + var6][arg1 + var9] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field915[arg2][arg0][arg1 + var7] = this.field915[arg2][arg0 - 1][arg1 + var7];
            }
        }
        if (arg1 > 0) {
            for (int var8 = 1; var8 < 8; var8++) {
                this.field915[arg2][arg0 + var8][arg1] = this.field915[arg2][arg0 + var8][arg1 - 1];
            }
        }
        if (arg0 > 0 && this.field915[arg2][arg0 - 1][arg1] != 0) {
            this.field915[arg2][arg0][arg1] = this.field915[arg2][arg0 - 1][arg1];
        } else if (arg1 > 0 && this.field915[arg2][arg0][arg1 - 1] != 0) {
            this.field915[arg2][arg0][arg1] = this.field915[arg2][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && this.field915[arg2][arg0 - 1][arg1 - 1] != 0) {
            this.field915[arg2][arg0][arg1] = this.field915[arg2][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIIBI)V")
    public final void method256(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var6 = arg1; var6 <= arg0 + arg1; var6++) {
            for (int var8 = arg4; var8 <= arg2 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field906 && var6 >= 0 && var6 < this.field907) {
                    this.field903[0][var8][var6] = 127;
                    if (arg4 == var8 && var8 > 0) {
                        this.field915[0][var8][var6] = this.field915[0][var8 - 1][var6];
                    }
                    if (arg2 + arg4 == var8 && var8 < this.field906 - 1) {
                        this.field915[0][var8][var6] = this.field915[0][var8 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        this.field915[0][var8][var6] = this.field915[0][var8][var6 - 1];
                    }
                    if (arg0 + arg1 == var6 && var6 < this.field907 - 1) {
                        this.field915[0][var8][var6] = this.field915[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (arg3 == 1) {
            boolean var7 = false;
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "b", descriptor = "(IIII)I")
    private static final int method257(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class6.field595[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "b", descriptor = "(II)I")
    private static final int method258(int arg0, int arg1) {
        int var2 = method249(arg0 - 1, arg1 - 1) + method249(arg0 + 1, arg1 - 1) + method249(arg0 - 1, arg1 + 1) + method249(arg0 + 1, arg1 + 1);
        int var3 = method249(arg0 - 1, arg1) + method249(arg0 + 1, arg1) + method249(arg0, arg1 - 1) + method249(arg0, arg1 + 1);
        int var4 = method249(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "([LASFXKKJM;LOUUKQIMK;I)V")
    public final void method259(class3[] arg0, class45 arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field921[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field921[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method8(var110, var111, true);
                        }
                    }
                }
            }
        }
        field920 += (int) (Math.random() * 5.0D) - 2;
        if (field920 < -8) {
            field920 = -8;
        }
        if (field920 > 8) {
            field920 = 8;
        }
        field918 += (int) (Math.random() * 5.0D) - 2;
        if (field918 < -16) {
            field918 = -16;
        }
        if (field918 > 16) {
            field918 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field903[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field907 - 1; var56++) {
                for (int var101 = 1; var101 < this.field906 - 1; var101++) {
                    int var102 = this.field915[var5][var101 + 1][var56] - this.field915[var5][var101 - 1][var56];
                    int var103 = this.field915[var5][var101][var56 + 1] - this.field915[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field912[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field907; var57++) {
                this.field897[var57] = 0;
                this.field898[var57] = 0;
                this.field899[var57] = 0;
                this.field900[var57] = 0;
                this.field901[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field906 + 5; var58++) {
                for (int var61 = 0; var61 < this.field907; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field906) {
                        int var96 = this.field908[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class63 var97 = class63.field1641[var96 - 1];
                            this.field897[var61] += var97.field1650;
                            this.field898[var61] += var97.field1648;
                            this.field899[var61] += var97.field1649;
                            this.field900[var61] += var97.field1651;
                            var10002 = this.field901[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field906) {
                        int var99 = this.field908[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class63 var100 = class63.field1641[var99 - 1];
                            this.field897[var61] -= var100.field1650;
                            this.field898[var61] -= var100.field1648;
                            this.field899[var61] -= var100.field1649;
                            this.field900[var61] -= var100.field1651;
                            var10002 = this.field901[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field906 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field907 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field907) {
                            var62 += this.field897[var68];
                            var63 += this.field898[var68];
                            var64 += this.field899[var68];
                            var65 += this.field900[var68];
                            var66 += this.field901[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field907) {
                            var62 -= this.field897[var69];
                            var63 -= this.field898[var69];
                            var64 -= this.field899[var69];
                            var65 -= this.field900[var69];
                            var66 -= this.field901[var69];
                        }
                        if (var67 >= 1 && var67 < this.field907 - 1 && (!field923 || (this.field921[0][var58][var67] & 0x2) != 0 || (this.field921[var5][var58][var67] & 0x10) == 0 && this.method252(var58, var67, var5, 823) == field911)) {
                            if (var5 < field905) {
                                field905 = var5;
                            }
                            int var70 = this.field908[var5][var58][var67] & 0xFF;
                            int var71 = this.field894[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field915[var5][var58][var67];
                                int var73 = this.field915[var5][var58 + 1][var67];
                                int var74 = this.field915[var5][var58 + 1][var67 + 1];
                                int var75 = this.field915[var5][var58][var67 + 1];
                                int var76 = this.field912[var58][var67];
                                int var77 = this.field912[var58 + 1][var67];
                                int var78 = this.field912[var58 + 1][var67 + 1];
                                int var79 = this.field912[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method246(var82, var83, var84);
                                    int var85 = field920 + var82 & 0xFF;
                                    int var86 = field918 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method246(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field904[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class63.field1641[var71 - 1].field1646) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field895[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class6.field606[method260(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method369(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method260(var80, var76), method260(var80, var77), method260(var80, var78), method260(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field904[var5][var58][var67] + 1;
                                    byte var90 = this.field916[var5][var58][var67];
                                    class63 var91 = class63.field1641[var71 - 1];
                                    int var92 = var91.field1644;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class6.method191(-43936, var92);
                                        var94 = -1;
                                    } else if (var91.field1643 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class6.field606[this.method264(var91.field1652, 96)];
                                    } else {
                                        var94 = this.method246(var91.field1647, var91.field1648, var91.field1649);
                                        var93 = class6.field606[this.method264(var91.field1652, 96)];
                                    }
                                    arg1.method369(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method260(var80, var76), method260(var80, var77), method260(var80, var78), method260(var80, var79), this.method264(var94, var76), this.method264(var94, var77), this.method264(var94, var78), this.method264(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field907 - 1; var59++) {
                for (int var60 = 1; var60 < this.field906 - 1; var60++) {
                    arg1.method368(var5, var60, var59, this.method252(var60, var59, var5, 823));
                }
            }
        }
        if (arg2 != -2206) {
            field893 = -463;
        }
        arg1.method395(-50, 9, -10, -50);
        for (int var6 = 0; var6 < this.field906; var6++) {
            for (int var47 = 0; var47 < this.field907; var47++) {
                if ((this.field921[1][var6][var47] & 0x2) == 2) {
                    arg1.method366(var47, (byte) 9, var6);
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
                for (int var12 = 0; var12 <= this.field907; var12++) {
                    for (int var13 = 0; var13 <= this.field906; var13++) {
                        if ((this.field895[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field895[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field907 && (this.field895[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field895[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field895[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field915[var17][var13][var14] - var21;
                                int var23 = this.field915[var16][var13][var14];
                                class45.method367(var13 * 128, var15 * 128 + 128, var23, var10, var22, 1, var13 * 128, var14 * 128, 3);
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
                            while (var27 < this.field906 && (this.field895[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field895[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field895[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field915[var29][var26][var12] - var33;
                                int var35 = this.field915[var28][var26][var12];
                                class45.method367(var26 * 128, var12 * 128, var35, var10, var34, 2, var27 * 128 + 128, var12 * 128, 3);
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
                            while (var41 < this.field907 && (this.field895[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field895[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field906) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field895[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field915[var11][var38][var40];
                                class45.method367(var38 * 128, var41 * 128 + 128, var44, var10, var44, 4, var39 * 128 + 128, var40 * 128, 3);
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

    @OriginalMember(owner = "client!KPOYRTLL", name = "c", descriptor = "(II)I")
    private static final int method260(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIII[LASFXKKJM;[BI)V")
    public final void method261(int arg0, int arg1, int arg2, int arg3, class3[] arg4, byte[] arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 + var13 > 0 && arg0 + var13 < 103 && arg3 + var14 > 0 && arg3 + var14 < 103) {
                        arg4[var8].field21[arg0 + var13][arg3 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg1 != 6) {
            this.field917 = 99;
        }
        class53 var9 = new class53(arg5, (byte) -17);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method248(var10, true, arg6, arg3 + var12, arg2, arg0 + var11, 0, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "d", descriptor = "(II)I")
    private static final int method262(int arg0, int arg1) {
        int var2 = method243(arg0 + 45365, arg1 + 91923, 4) + (method243(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method243(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method263(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        class53 var5 = new class53(arg1, (byte) -17);
        int var6 = -1;
        if (arg0 != 49844) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method469();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method469();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method455() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class39 var17 = class39.method323(var6);
                        if (var14 != 22 || !field923 || var17.field1117 || var17.field1100) {
                            var4 &= var17.method332(field910);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method469();
                if (var10 == 0) {
                    break;
                }
                var5.method455();
            }
        }
    }

    @OriginalMember(owner = "client!KPOYRTLL", name = "e", descriptor = "(II)I")
    private final int method264(int arg0, int arg1) {
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
}
