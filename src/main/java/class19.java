import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public abstract class class19 extends class32 {

    @OriginalMember(owner = "mapview!k", name = "x", descriptor = "I")
    private int field157 = 0;

    @OriginalMember(owner = "mapview!k", name = "K", descriptor = "[[B")
    public byte[][] field170 = new byte[256][];

    @OriginalMember(owner = "mapview!k", name = "Y", descriptor = "[I")
    private int[] field184;

    @OriginalMember(owner = "mapview!k", name = "X", descriptor = "[I")
    private int[] field183;

    @OriginalMember(owner = "mapview!k", name = "D", descriptor = "[I")
    private int[] field163;

    @OriginalMember(owner = "mapview!k", name = "S", descriptor = "[I")
    private int[] field178;

    @OriginalMember(owner = "mapview!k", name = "J", descriptor = "La;")
    private static class1 field169 = class3.method36("img=", -116);

    @OriginalMember(owner = "mapview!k", name = "z", descriptor = "La;")
    private static class1 field159 = class3.method36(")4col", -119);

    @OriginalMember(owner = "mapview!k", name = "E", descriptor = "I")
    private static int field164 = -1;

    @OriginalMember(owner = "mapview!k", name = "G", descriptor = "La;")
    private static class1 field166 = class3.method36("shad", -90);

    @OriginalMember(owner = "mapview!k", name = "y", descriptor = "La;")
    private static class1 field158 = class3.method36("str", -91);

    @OriginalMember(owner = "mapview!k", name = "C", descriptor = "I")
    private static int field162 = -1;

    @OriginalMember(owner = "mapview!k", name = "A", descriptor = "I")
    private static int field160 = 0;

    @OriginalMember(owner = "mapview!k", name = "O", descriptor = "La;")
    private static class1 field174 = class3.method36("u", -87);

    @OriginalMember(owner = "mapview!k", name = "T", descriptor = "I")
    private static int field179 = -1;

    @OriginalMember(owner = "mapview!k", name = "R", descriptor = "La;")
    private static class1 field177 = class3.method36("col=", -119);

    @OriginalMember(owner = "mapview!k", name = "L", descriptor = "I")
    private static int field171 = 256;

    @OriginalMember(owner = "mapview!k", name = "V", descriptor = "I")
    private static int field181 = 0;

    @OriginalMember(owner = "mapview!k", name = "F", descriptor = "I")
    private static int field165 = 256;

    @OriginalMember(owner = "mapview!k", name = "U", descriptor = "La;")
    private static class1 field180 = class3.method36("shad=", -120);

    @OriginalMember(owner = "mapview!k", name = "W", descriptor = "I")
    private static int field182 = 0;

    @OriginalMember(owner = "mapview!k", name = "P", descriptor = "La;")
    private static class1 field175 = class3.method36(")4shad", -115);

    @OriginalMember(owner = "mapview!k", name = "Q", descriptor = "La;")
    private static class1 field176 = class3.method36("gt", -87);

    @OriginalMember(owner = "mapview!k", name = "B", descriptor = "I")
    private static int field161 = 0;

    @OriginalMember(owner = "mapview!k", name = "ab", descriptor = "La;")
    private static class1 field186 = class3.method36(")4u", -123);

    @OriginalMember(owner = "mapview!k", name = "bb", descriptor = "La;")
    private static class1 field187 = class3.method36("br", -112);

    @OriginalMember(owner = "mapview!k", name = "cb", descriptor = "La;")
    private static class1 field188 = class3.method36("u=", -112);

    @OriginalMember(owner = "mapview!k", name = "M", descriptor = "La;")
    private static class1 field172 = class3.method36(")4str", -87);

    @OriginalMember(owner = "mapview!k", name = "db", descriptor = "I")
    private static int field189 = -1;

    @OriginalMember(owner = "mapview!k", name = "eb", descriptor = "La;")
    private static class1 field190 = class3.method36("lt", -98);

    @OriginalMember(owner = "mapview!k", name = "Z", descriptor = "La;")
    private static class1 field185 = class3.method36("str=", -89);

    @OriginalMember(owner = "mapview!k", name = "H", descriptor = "[B")
    private byte[] field167;

    @OriginalMember(owner = "mapview!k", name = "N", descriptor = "[I")
    private int[] field173;

    @OriginalMember(owner = "mapview!k", name = "I", descriptor = "[Ls;")
    private static class34[] field168;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(La;IIII)V", line = 11)
    public final void method92(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method107(arg3, arg4);
            this.method101(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([I[BIIIIIII)V", line = 19)
    public static final void method93(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(La;IIII)V", line = 76)
    public final void method94(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method107(arg3, arg4);
            this.method101(arg0, arg1 - this.method100(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([B)V", line = 91)
    private final void method95(byte[] arg0) {
        this.field173 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field173.length; var2++) {
                this.field173[var2] = arg0[var2] & 0xFF;
            }
            this.field157 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field173[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var11 = 0;
            for (int var12 = 0; var12 < var9[var10].length; var12++) {
                var11 += arg0[var3++];
                var9[var10][var12] = var11;
            }
        }
        byte[][] var13 = new byte[256][];
        for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = new byte[var5[var14]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var13[var14].length; var16++) {
                var15 += arg0[var3++];
                var13[var14][var16] = var15;
            }
        }
        this.field167 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field167[(var17 << 8) + var18] = (byte) method98(var9, var13, var6, this.field173, var5, var17, var18);
                    }
                }
            }
        }
        this.field157 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([I[BIIIIIIII)V", line = 208)
    public static final void method96(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 802)
    public class19(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field184 = arg1;
        this.field183 = arg2;
        this.field163 = arg3;
        this.field178 = arg4;
        this.method95(arg0);
        this.field170 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field183[var10] < var8 && this.field178[var10] != 0) {
                var8 = this.field183[var10];
            }
            if (this.field183[var10] + this.field178[var10] > var9) {
                var9 = this.field183[var10] + this.field178[var10];
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(La;IIII)V", line = 250)
    public final void method97(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method107(arg3, arg4);
            this.method101(arg0, arg1 - this.method100(arg0), arg2);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 270)
    private static final int method98(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(IIIIII)V", line = 327)
    private final void method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class32.field445 * arg2 + arg1;
        int var8 = class32.field445 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class32.field444) {
            int var11 = class32.field444 - arg2;
            arg4 -= var11;
            arg2 = class32.field444;
            var10 += arg3 * var11;
            var7 += class32.field445 * var11;
        }
        if (arg2 + arg4 > class32.field448) {
            arg4 -= arg2 + arg4 - class32.field448;
        }
        if (arg1 < class32.field442) {
            int var12 = class32.field442 - arg1;
            arg3 -= var12;
            arg1 = class32.field442;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class32.field447) {
            int var13 = arg1 + arg3 - class32.field447;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method93(class32.field446, this.field170[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(La;)I", line = 375)
    public final int method100(class1 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field6; var5++) {
            int var6 = arg0.field5[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class1 var7 = arg0.method23(true, var2 + 1, var5);
                    var2 = -1;
                    if (var7.method15(field190, (byte) -36)) {
                        var6 = 60;
                    } else {
                        if (!var7.method15(field176, (byte) -36)) {
                            if (var7.method7(field169, (byte) 38)) {
                                try {
                                    int var8 = var7.method12((byte) 93, 4).method8((byte) -101);
                                    var4 += field168[var8].field471;
                                    var3 = -1;
                                } catch (Exception var10) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field173[var6];
                    if (this.field167 != null && var3 != -1) {
                        var4 += this.field167[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(La;II)V", line = 455)
    private final void method101(class1 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field157;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field6; var7++) {
            int var8 = arg0.field5[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class1 var9 = arg0.method23(true, var5 + 1, var7);
                    var5 = -1;
                    if (var9.method15(field190, (byte) -36)) {
                        var8 = 60;
                    } else {
                        if (!var9.method15(field176, (byte) -36)) {
                            if (var9.method7(field169, (byte) 38)) {
                                try {
                                    int var10 = var9.method12((byte) 93, 4).method8((byte) -101);
                                    class34 var11 = field168[var10];
                                    var11.method228(arg1, this.field157 + var4 - var11.field472);
                                    arg1 += var11.field471;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method102(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field167 != null && var6 != -1) {
                        arg1 += this.field167[(var6 << 8) + var8];
                    }
                    int var13 = this.field163[var8];
                    int var14 = this.field178[var8];
                    if (var8 == 32) {
                        if (field182 > 0) {
                            field161 += field182;
                            arg1 += field161 >> 8;
                            field161 &= 0xFF;
                        }
                    } else if (field171 == 256) {
                        if (field162 != -1) {
                            this.method99(var8, this.field184[var8] + arg1 + 1, this.field183[var8] + var4 + 1, var13, var14, field162);
                        }
                        this.method91(var8, this.field184[var8] + arg1, this.field183[var8] + var4, var13, var14, field160);
                    } else {
                        if (field162 != -1) {
                            this.method106(var8, this.field184[var8] + arg1 + 1, this.field183[var8] + var4 + 1, var13, var14, field162, field171);
                        }
                        this.method105(var8, this.field184[var8] + arg1, this.field183[var8] + var4, var13, var14, field160, field171);
                    }
                    int var15 = this.field173[var8];
                    if (field164 != -1) {
                        class32.method211(arg1, (int) ((double) this.field157 * 0.7D) + var4, var15, field164);
                    }
                    if (field189 != -1) {
                        class32.method211(arg1, this.field157 + var4 + 1, var15, field189);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(La;)V", line = 571)
    private final void method102(class1 arg0) {
        try {
            if (arg0.method7(field177, (byte) 38)) {
                field160 = arg0.method12((byte) 93, 4).method17(16, false);
            } else if (arg0.method15(field159, (byte) -36)) {
                field160 = field181;
            } else if (arg0.method7(field185, (byte) 38)) {
                field164 = arg0.method12((byte) 93, 4).method17(16, false);
            } else if (arg0.method15(field158, (byte) -36)) {
                field164 = 8388608;
            } else if (arg0.method15(field172, (byte) -36)) {
                field164 = -1;
            } else if (arg0.method7(field188, (byte) 38)) {
                field189 = arg0.method12((byte) 93, 2).method17(16, false);
            } else if (arg0.method15(field174, (byte) -36)) {
                field189 = 0;
            } else if (arg0.method15(field186, (byte) -36)) {
                field189 = -1;
            } else if (arg0.method7(field180, (byte) 38)) {
                field162 = arg0.method12((byte) 93, 5).method17(16, false);
            } else if (arg0.method15(field166, (byte) -36)) {
                field162 = 0;
            } else if (arg0.method15(field175, (byte) -36)) {
                field162 = field179;
            } else if (arg0.method15(field187, (byte) -36)) {
                this.method103(field181, field179, field165);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(III)V", line = 624)
    private final void method103(int arg0, int arg1, int arg2) {
        field164 = -1;
        field189 = -1;
        field179 = arg1;
        field162 = arg1;
        field181 = arg0;
        field160 = arg0;
        field165 = arg2;
        field171 = arg2;
        field182 = 0;
        field161 = 0;
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "()V", line = 649)
    public static void method104() {
        field190 = null;
        field176 = null;
        field169 = null;
        field187 = null;
        field177 = null;
        field159 = null;
        field188 = null;
        field174 = null;
        field186 = null;
        field180 = null;
        field166 = null;
        field175 = null;
        field185 = null;
        field158 = null;
        field172 = null;
        field168 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(IIIIIII)V", line = 682)
    private final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class32.field445 * arg2 + arg1;
        int var9 = class32.field445 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class32.field444) {
            int var12 = class32.field444 - arg2;
            arg4 -= var12;
            arg2 = class32.field444;
            var11 += arg3 * var12;
            var8 += class32.field445 * var12;
        }
        if (arg2 + arg4 > class32.field448) {
            arg4 -= arg2 + arg4 - class32.field448;
        }
        if (arg1 < class32.field442) {
            int var13 = class32.field442 - arg1;
            arg3 -= var13;
            arg1 = class32.field442;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class32.field447) {
            int var14 = arg1 + arg3 - class32.field447;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method96(class32.field446, this.field170[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(II)V", line = 733)
    private final void method107(int arg0, int arg1) {
        field164 = -1;
        field189 = -1;
        field179 = arg1;
        field162 = arg1;
        field181 = arg0;
        field160 = arg0;
        field165 = 256;
        field171 = 256;
        field182 = 0;
        field161 = 0;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(IIIIII)V")
    public abstract void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
