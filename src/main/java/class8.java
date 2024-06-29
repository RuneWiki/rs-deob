import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class8 extends class52 {

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "[[B")
    public byte[][] field148 = new byte[256][];

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public int field157 = 0;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "[I")
    private int[] field160;

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "[I")
    private int[] field171;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "[I")
    private int[] field143;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "[I")
    private int[] field164;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "Lr;")
    private static class118 field145 = class153.method1136(120, "shad");

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    private static int field142 = 256;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "[Lr;")
    private static class118[] field155 = new class118[100];

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "Lr;")
    private static class118 field154 = class153.method1136(109, "u=");

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "Lr;")
    private static class118 field156 = class153.method1136(92, "col=");

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "Lr;")
    private static class118 field151 = class153.method1136(109, ")4shad");

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    private static int field146 = -1;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
    private static int field158 = 256;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "Lr;")
    private static class118 field153 = class153.method1136(80, ")4str");

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Lr;")
    private static class118 field149 = class153.method1136(125, "gt");

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
    private static int field165 = -1;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "Lr;")
    private static class118 field168 = class153.method1136(101, "br");

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "Lr;")
    private static class118 field147 = class153.method1136(113, "str");

    @OriginalMember(owner = "client!b", name = "Bb", descriptor = "Lr;")
    private static class118 field174 = class153.method1136(127, "img=");

    @OriginalMember(owner = "client!b", name = "zb", descriptor = "I")
    private static int field172 = 0;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "Lr;")
    private static class118 field161 = class153.method1136(105, ")4u");

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "Lr;")
    private static class118 field166 = class153.method1136(75, ")4col");

    @OriginalMember(owner = "client!b", name = "Ab", descriptor = "I")
    private static int field173 = -1;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    private static int field162 = 0;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "Lr;")
    private static class118 field159 = class153.method1136(74, "shad=");

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    private static int field150 = -1;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "I")
    private static int field169 = 0;

    @OriginalMember(owner = "client!b", name = "Cb", descriptor = "Lr;")
    private static class118 field175 = class153.method1136(124, "u");

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "Lr;")
    private static class118 field167 = class153.method1136(88, "str=");

    @OriginalMember(owner = "client!b", name = "Eb", descriptor = "Lr;")
    private static class118 field177 = class153.method1136(81, "lt");

    @OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
    private static int field176 = 0;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "[B")
    private byte[] field152;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "[I")
    private int[] field141;

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "[Ln;")
    public static class90[] field170;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;)I")
    public final int method33(class118 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field2743; var5++) {
            int var6 = arg0.field2746[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class118 var7 = arg0.method932(var5, (byte) -26, var2 + 1);
                    var2 = -1;
                    if (var7.method938((byte) 110, field177)) {
                        var6 = 60;
                    } else {
                        if (!var7.method938((byte) 110, field149)) {
                            if (var7.method915(field174, (byte) 103)) {
                                try {
                                    int var8 = var7.method926(4, (byte) 117).method906(34);
                                    var4 += field170[var8].field2156;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field141[var6];
                    if (this.field152 != null && var3 != -1) {
                        var4 += this.field152[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(IIIIII)V")
    private final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class52.field1245 * arg2 + arg1;
        int var8 = class52.field1245 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class52.field1246) {
            int var11 = class52.field1246 - arg2;
            arg4 -= var11;
            arg2 = class52.field1246;
            var10 += arg3 * var11;
            var7 += class52.field1245 * var11;
        }
        if (arg2 + arg4 > class52.field1247) {
            arg4 -= arg2 + arg4 - class52.field1247;
        }
        if (arg1 < class52.field1243) {
            int var12 = class52.field1243 - arg1;
            arg3 -= var12;
            arg1 = class52.field1243;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class52.field1241) {
            int var13 = arg1 + arg3 - class52.field1241;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method48(class52.field1242, this.field148[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(IIIIII)V")
    public abstract void method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([B)V")
    private final void method37(byte[] arg0) {
        this.field141 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field141.length; var2++) {
                this.field141[var2] = arg0[var2] & 0xFF;
            }
            this.field157 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field141[var4] = arg0[var3++] & 0xFF;
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
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field152 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field152[(var13 << 8) + var14] = (byte) method38(var9, var11, var6, this.field141, var5, var13, var14);
                    }
                }
            }
        }
        this.field157 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method38(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
    private final void method39(int arg0, int arg1) {
        field165 = -1;
        field173 = -1;
        field146 = arg1;
        field150 = arg1;
        field176 = arg0;
        field172 = arg0;
        field142 = 256;
        field158 = 256;
        field169 = 0;
        field162 = 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;IIIIII)V")
    public final void method40(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method39(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field2743];
        for (int var11 = 0; var11 < arg0.field2743; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method54(arg0, arg1 - this.method33(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;I)I")
    public final int method41(class118 arg0, int arg1) {
        int var3 = this.method60(arg0, new int[] { arg1 }, field155);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method33(field155[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;II)V")
    private final void method42(class118 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field157;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field2743; var7++) {
            int var8 = arg0.field2746[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class118 var9 = arg0.method932(var7, (byte) -123, var5 + 1);
                    var5 = -1;
                    if (var9.method938((byte) 103, field177)) {
                        var8 = 60;
                    } else {
                        if (!var9.method938((byte) 63, field149)) {
                            if (var9.method915(field174, (byte) 125)) {
                                try {
                                    int var10 = var9.method926(4, (byte) 117).method906(34);
                                    class90 var11 = field170[var10];
                                    var11.method719(arg1, this.field157 + var4 - var11.field2153);
                                    arg1 += var11.field2156;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method51(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field152 != null && var6 != -1) {
                        arg1 += this.field152[(var6 << 8) + var8];
                    }
                    int var12 = this.field143[var8];
                    int var13 = this.field164[var8];
                    if (var8 == 32) {
                        if (field169 > 0) {
                            field162 += field169;
                            arg1 += field162 >> 8;
                            field162 &= 0xFF;
                        }
                    } else if (field158 == 256) {
                        if (field150 != -1) {
                            this.method35(var8, this.field160[var8] + arg1 + 1, this.field171[var8] + var4 + 1, var12, var13, field150);
                        }
                        this.method36(var8, this.field160[var8] + arg1, this.field171[var8] + var4, var12, var13, field172);
                    } else {
                        if (field150 != -1) {
                            this.method58(var8, this.field160[var8] + arg1 + 1, this.field171[var8] + var4 + 1, var12, var13, field150, field158);
                        }
                        this.method34(var8, this.field160[var8] + arg1, this.field171[var8] + var4, var12, var13, field172, field158);
                    }
                    int var14 = this.field141[var8];
                    if (field165 != -1) {
                        class52.method477(arg1, (int) ((double) this.field157 * 0.7D) + var4, var14, field165);
                    }
                    if (field173 != -1) {
                        class52.method477(arg1, this.field157 + var4 + 1, var14, field173);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;IIIILjava/util/Random;I)I")
    public final int method43(class118 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method62(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field2743];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field2743; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method54(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;IIII)V")
    public final void method44(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method39(arg3, arg4);
            this.method42(arg0, arg1 - this.method33(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;IIIIIIIIII)I")
    private final int method45(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method62(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field157;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field163 + this.field144 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method60(arg0, var12, field155);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field163 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field163 - this.field144 - (var13 - 1) * arg10) / 2 + this.field163 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field144 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field163 - this.field144 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field163 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method42(field155[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method42(field155[var16], arg1 + (arg3 - this.method33(field155[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method42(field155[var16], arg1 + arg3 - this.method33(field155[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method42(field155[var16], arg1, var14);
            } else {
                this.method61(field155[var16], arg3);
                this.method42(field155[var16], arg1, var14);
                field169 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "()V")
    public static void method46() {
        field177 = null;
        field149 = null;
        field174 = null;
        field168 = null;
        field156 = null;
        field166 = null;
        field154 = null;
        field175 = null;
        field161 = null;
        field159 = null;
        field145 = null;
        field151 = null;
        field167 = null;
        field147 = null;
        field153 = null;
        field170 = null;
        field155 = null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Lr;IIII)V")
    public final void method47(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method39(arg3, arg4);
            this.method42(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method48(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;IIIII)V")
    public final void method49(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method39(arg3, arg4);
        int[] var7 = new int[arg0.field2743];
        for (int var8 = 0; var8 < arg0.field2743; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method54(arg0, arg1 - this.method33(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;IIIIIIIII)I")
    public final int method50(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method45(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Lr;)V")
    private final void method51(class118 arg0) {
        try {
            if (arg0.method915(field156, (byte) 49)) {
                field172 = arg0.method926(4, (byte) 117).method914((byte) 127, 16);
                return;
            }
            if (arg0.method938((byte) 126, field166)) {
                field172 = field176;
                return;
            }
            if (arg0.method915(field167, (byte) 66)) {
                field165 = arg0.method926(4, (byte) 117).method914((byte) 127, 16);
                return;
            }
            if (arg0.method938((byte) 122, field147)) {
                field165 = 8388608;
                return;
            }
            if (arg0.method938((byte) 80, field153)) {
                field165 = -1;
                return;
            }
            if (arg0.method915(field154, (byte) 49)) {
                field173 = arg0.method926(2, (byte) 117).method914((byte) 127, 16);
                return;
            }
            if (arg0.method938((byte) 127, field175)) {
                field173 = 0;
                return;
            }
            if (arg0.method938((byte) 69, field161)) {
                field173 = -1;
                return;
            }
            if (arg0.method915(field159, (byte) 123)) {
                field150 = arg0.method926(5, (byte) 117).method914((byte) 127, 16);
                return;
            }
            if (arg0.method938((byte) 77, field145)) {
                field150 = 0;
                return;
            }
            if (arg0.method938((byte) 77, field151)) {
                field150 = field146;
                return;
            }
            if (arg0.method938((byte) 126, field168)) {
                this.method62(field176, field146, field142);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method52(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
    private final int method53(int arg0) {
        return this.field141[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;II[I[I)V")
    private final void method54(class118 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field157;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field2743; var10++) {
            int var11 = arg0.field2746[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class118 var12 = arg0.method932(var10, (byte) -120, var7 + 1);
                    var7 = -1;
                    if (var12.method938((byte) 77, field177)) {
                        var11 = 60;
                    } else {
                        if (!var12.method938((byte) 83, field149)) {
                            if (var12.method915(field174, (byte) 85)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method926(4, (byte) 117).method906(34);
                                    class90 var16 = field170[var15];
                                    var16.method719(arg1 + var13, this.field157 + var6 - var16.field2153 + var14);
                                    arg1 += var16.field2156;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method51(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field152 != null && var8 != -1) {
                        arg1 += this.field152[(var8 << 8) + var11];
                    }
                    int var17 = this.field143[var11];
                    int var18 = this.field164[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field169 > 0) {
                            field162 += field169;
                            arg1 += field162 >> 8;
                            field162 &= 0xFF;
                        }
                    } else if (field158 == 256) {
                        if (field150 != -1) {
                            this.method35(var11, this.field160[var11] + arg1 + var19 + 1, this.field171[var11] + var6 + 1 + var20, var17, var18, field150);
                        }
                        this.method36(var11, this.field160[var11] + arg1 + var19, this.field171[var11] + var6 + var20, var17, var18, field172);
                    } else {
                        if (field150 != -1) {
                            this.method58(var11, this.field160[var11] + arg1 + var19 + 1, this.field171[var11] + var6 + 1 + var20, var17, var18, field150, field158);
                        }
                        this.method34(var11, this.field160[var11] + arg1 + var19, this.field171[var11] + var6 + var20, var17, var18, field172, field158);
                    }
                    int var21 = this.field141[var11];
                    if (field165 != -1) {
                        class52.method477(arg1, (int) ((double) this.field157 * 0.7D) + var6, var21, field165);
                    }
                    if (field173 != -1) {
                        class52.method477(arg1, this.field157 + var6, var21, field173);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Lr;IIIII)V")
    public final void method55(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method39(arg3, arg4);
        int[] var7 = new int[arg0.field2743];
        int[] var8 = new int[arg0.field2743];
        for (int var9 = 0; var9 < arg0.field2743; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method54(arg0, arg1 - this.method33(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Lr;I)I")
    public final int method56(class118 arg0, int arg1) {
        return this.method60(arg0, new int[] { arg1 }, field155);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Lr;IIII)V")
    public final void method57(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method39(arg3, arg4);
            this.method42(arg0, arg1 - this.method33(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IIIIIII)V")
    private final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class52.field1245 * arg2 + arg1;
        int var9 = class52.field1245 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class52.field1246) {
            int var12 = class52.field1246 - arg2;
            arg4 -= var12;
            arg2 = class52.field1246;
            var11 += arg3 * var12;
            var8 += class52.field1245 * var12;
        }
        if (arg2 + arg4 > class52.field1247) {
            arg4 -= arg2 + arg4 - class52.field1247;
        }
        if (arg1 < class52.field1243) {
            int var13 = class52.field1243 - arg1;
            arg3 -= var13;
            arg1 = class52.field1243;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class52.field1241) {
            int var14 = arg1 + arg3 - class52.field1241;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method52(class52.field1242, this.field148[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Lr;)Lr;")
    public static final class118 method59(class118 arg0) {
        int var1 = arg0.method935(-102);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field2746[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class118 var4 = new class118();
        var4.field2743 = var1 + var2;
        var4.field2746 = new byte[var4.field2743];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field2746[var6];
            if (var7 == 60) {
                var4.field2746[var5++] = 60;
                var4.field2746[var5++] = 108;
                var4.field2746[var5++] = 116;
                var4.field2746[var5++] = 62;
            } else if (var7 == 62) {
                var4.field2746[var5++] = 60;
                var4.field2746[var5++] = 103;
                var4.field2746[var5++] = 116;
                var4.field2746[var5++] = 62;
            } else {
                var4.field2746[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lr;[I[Lr;)I")
    private final int method60(class118 arg0, int[] arg1, class118[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class118 var6 = class30.method256(100, 0);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method935(-79);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method916(-24853, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class118 var16 = arg0.method932(var14, (byte) -16, var10 + 1);
                    var10 = -1;
                    var6.method905(60, (byte) -128);
                    var6.method923(121, var16);
                    var6.method905(62, (byte) -117);
                    if (var16.method938((byte) 93, field168)) {
                        arg2[var12++] = var6.method932(var6.method935(-96), (byte) 34, var5);
                        var5 = var6.method935(-75);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method938((byte) 80, field177)) {
                        var4 += this.method53(60);
                        if (this.field152 != null && var11 != -1) {
                            var4 += this.field152[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method938((byte) 39, field149)) {
                        var4 += this.method53(62);
                        if (this.field152 != null && var11 != -1) {
                            var4 += this.field152[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method915(field174, (byte) 122)) {
                        try {
                            int var17 = var16.method926(4, (byte) 117).method906(34);
                            var4 += field170[var17].field2156;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method905(var15, (byte) -124);
                        var4 += this.method53(var15);
                        if (this.field152 != null && var11 != -1) {
                            var4 += this.field152[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method935(-81);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method932(var7 - var9, (byte) -27, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method935(-97);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method935(-101) > var5) {
            arg2[var12++] = var6.method932(var6.method935(-113), (byte) 123, var5);
        }
        return var12;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Lr;I)V")
    private final void method61(class118 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method935(-117); var5++) {
            int var6 = arg0.method916(-24853, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field169 = (arg1 - this.method33(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
    private final void method62(int arg0, int arg1, int arg2) {
        field165 = -1;
        field173 = -1;
        field146 = arg1;
        field150 = arg1;
        field176 = arg0;
        field172 = arg0;
        field142 = arg2;
        field158 = arg2;
        field169 = 0;
        field162 = 0;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class8(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field160 = arg1;
        this.field171 = arg2;
        this.field143 = arg3;
        this.field164 = arg4;
        this.method37(arg0);
        this.field148 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field171[var10] < var8 && this.field164[var10] != 0) {
                var8 = this.field171[var10];
            }
            if (this.field171[var10] + this.field164[var10] > var9) {
                var9 = this.field171[var10] + this.field164[var10];
            }
        }
        this.field163 = this.field157 - var8;
        this.field144 = var9 - this.field157;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V")
    public class8(byte[] arg0) {
        this.method37(arg0);
    }
}
