import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class133 extends class138 {

    @OriginalMember(owner = "client!ta", name = "qb", descriptor = "[[B")
    private byte[][] field3116 = new byte[256][];

    @OriginalMember(owner = "client!ta", name = "Mb", descriptor = "I")
    public int field3138 = 0;

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "[I")
    private int[] field3111;

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "[I")
    private int[] field3110;

    @OriginalMember(owner = "client!ta", name = "tb", descriptor = "[I")
    private int[] field3119;

    @OriginalMember(owner = "client!ta", name = "Bb", descriptor = "[I")
    private int[] field3127;

    @OriginalMember(owner = "client!ta", name = "xb", descriptor = "I")
    private int field3123;

    @OriginalMember(owner = "client!ta", name = "sb", descriptor = "I")
    private int field3118;

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "Lsc;")
    private static class128 field3112 = class129.method1017(false, "br");

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "I")
    private static int field3109 = 0;

    @OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
    private static int field3120 = 0;

    @OriginalMember(owner = "client!ta", name = "yb", descriptor = "Lsc;")
    private static class128 field3124 = class129.method1017(false, ")4col");

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
    private static int field3106 = -1;

    @OriginalMember(owner = "client!ta", name = "Ab", descriptor = "Lsc;")
    private static class128 field3126 = class129.method1017(false, "shad");

    @OriginalMember(owner = "client!ta", name = "Db", descriptor = "I")
    private static int field3129 = -1;

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
    private static int field3108 = 0;

    @OriginalMember(owner = "client!ta", name = "vb", descriptor = "I")
    private static int field3121 = 256;

    @OriginalMember(owner = "client!ta", name = "wb", descriptor = "I")
    private static int field3122 = -1;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "Lsc;")
    private static class128 field3105 = class129.method1017(false, ")4u");

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "Lsc;")
    private static class128 field3107 = class129.method1017(false, "shad=");

    @OriginalMember(owner = "client!ta", name = "Eb", descriptor = "Lsc;")
    private static class128 field3130 = class129.method1017(false, ")4shad");

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    private static int field3104 = -1;

    @OriginalMember(owner = "client!ta", name = "Nb", descriptor = "Lsc;")
    private static class128 field3139 = class129.method1017(false, "gt");

    @OriginalMember(owner = "client!ta", name = "Jb", descriptor = "Lsc;")
    private static class128 field3135 = class129.method1017(false, "u=");

    @OriginalMember(owner = "client!ta", name = "rb", descriptor = "[Lsc;")
    private static class128[] field3117 = new class128[100];

    @OriginalMember(owner = "client!ta", name = "Lb", descriptor = "I")
    private static int field3137 = 0;

    @OriginalMember(owner = "client!ta", name = "Kb", descriptor = "Lsc;")
    private static class128 field3136 = class129.method1017(false, "img=");

    @OriginalMember(owner = "client!ta", name = "zb", descriptor = "Lsc;")
    private static class128 field3125 = class129.method1017(false, ")4str");

    @OriginalMember(owner = "client!ta", name = "Gb", descriptor = "Lsc;")
    private static class128 field3132 = class129.method1017(false, "lt");

    @OriginalMember(owner = "client!ta", name = "Ib", descriptor = "Lsc;")
    private static class128 field3134 = class129.method1017(false, "str");

    @OriginalMember(owner = "client!ta", name = "Hb", descriptor = "Lsc;")
    private static class128 field3133 = class129.method1017(false, "str=");

    @OriginalMember(owner = "client!ta", name = "Cb", descriptor = "Lsc;")
    private static class128 field3128 = class129.method1017(false, "u");

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    private static int field3103 = 256;

    @OriginalMember(owner = "client!ta", name = "Fb", descriptor = "Lsc;")
    private static class128 field3131 = class129.method1017(false, "col=");

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "[B")
    private byte[] field3113;

    @OriginalMember(owner = "client!ta", name = "ob", descriptor = "[I")
    private int[] field3114;

    @OriginalMember(owner = "client!ta", name = "pb", descriptor = "[Li;")
    public static class56[] field3115;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;I)V")
    private final void method1052(class128 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method1014(-9); var5++) {
            int var6 = arg0.method981(false, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field3120 = (arg1 - this.method1079(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;[I[Lsc;)I")
    private final int method1053(class128 arg0, int[] arg1, class128[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class128 var6 = class53.method408(100, -117);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method1014(-9);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method981(false, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class128 var16 = arg0.method974(var10 + 1, (byte) -11, var14);
                    var10 = -1;
                    var6.method972(1, 60);
                    var6.method992(var16, -34);
                    var6.method972(1, 62);
                    if (var16.method991(-1, field3112)) {
                        arg2[var12++] = var6.method974(var5, (byte) -11, var6.method1014(-9));
                        var5 = var6.method1014(-9);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method991(-1, field3132)) {
                        var4 += this.method1066(60);
                        if (this.field3113 != null && var11 != -1) {
                            var4 += this.field3113[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method991(-1, field3139)) {
                        var4 += this.method1066(62);
                        if (this.field3113 != null && var11 != -1) {
                            var4 += this.field3113[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method996(field3136, false)) {
                        try {
                            int var17 = var16.method998((byte) 121, 4).method1007((byte) 58);
                            var4 += field3115[var17].field1235;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method972(1, var15);
                        var4 += this.method1066(var15);
                        if (this.field3113 != null && var11 != -1) {
                            var4 += this.field3113[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method1014(-9);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method974(var5, (byte) -11, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method1014(-9);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method1014(-9) > var5) {
            arg2[var12++] = var6.method974(var5, (byte) -11, var6.method1014(-9));
        }
        return var12;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
    private final void method1054(int arg0, int arg1, int arg2) {
        field3129 = -1;
        field3122 = -1;
        field3106 = arg1;
        field3104 = arg1;
        field3137 = arg0;
        field3108 = arg0;
        field3103 = arg2;
        field3121 = arg2;
        field3120 = 0;
        field3109 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BIIIII)V")
    private static final void method1055(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class138.field3248 * arg2 + arg1;
        int var7 = class138.field3248 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class138.field3249) {
            int var10 = class138.field3249 - arg2;
            arg4 -= var10;
            arg2 = class138.field3249;
            var9 += arg3 * var10;
            var6 += class138.field3248 * var10;
        }
        if (arg2 + arg4 > class138.field3250) {
            arg4 -= arg2 + arg4 - class138.field3250;
        }
        if (arg1 < class138.field3252) {
            int var11 = class138.field3252 - arg1;
            arg3 -= var11;
            arg1 = class138.field3252;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class138.field3251) {
            int var12 = arg1 + arg3 - class138.field3251;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1059(class138.field3254, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;IIIIIIIIII)I")
    private final int method1056(class128 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1054(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field3138;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field3123 + this.field3118 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1053(arg0, var12, field3117);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field3123 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field3123 - this.field3118 - (var13 - 1) * arg10) / 2 + this.field3123 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field3118 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field3123 - this.field3118 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field3123 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1064(field3117[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1064(field3117[var16], arg1 + (arg3 - this.method1079(field3117[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1064(field3117[var16], arg1 + arg3 - this.method1079(field3117[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1064(field3117[var16], arg1, var14);
            } else {
                this.method1052(field3117[var16], arg3);
                this.method1064(field3117[var16], arg1, var14);
                field3120 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1057(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BIIIIII)V")
    private static final void method1058(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class138.field3248 * arg2 + arg1;
        int var8 = class138.field3248 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class138.field3249) {
            int var11 = class138.field3249 - arg2;
            arg4 -= var11;
            arg2 = class138.field3249;
            var10 += arg3 * var11;
            var7 += class138.field3248 * var11;
        }
        if (arg2 + arg4 > class138.field3250) {
            arg4 -= arg2 + arg4 - class138.field3250;
        }
        if (arg1 < class138.field3252) {
            int var12 = class138.field3252 - arg1;
            arg3 -= var12;
            arg1 = class138.field3252;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class138.field3251) {
            int var13 = arg1 + arg3 - class138.field3251;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1073(class138.field3254, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method1059(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;IIIIII)V")
    public final void method1060(class128 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1072(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field2920];
        for (int var11 = 0; var11 < arg0.field2920; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method1074(arg0, arg1 - this.method1079(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;)Lsc;")
    public static final class128 method1061(class128 arg0) {
        int var1 = arg0.method1014(-9);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field2893[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class128 var4 = new class128();
        var4.field2920 = var1 + var2;
        var4.field2893 = new byte[var4.field2920];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field2893[var6];
            if (var7 == 60) {
                var4.field2893[var5++] = 60;
                var4.field2893[var5++] = 108;
                var4.field2893[var5++] = 116;
                var4.field2893[var5++] = 62;
            } else if (var7 == 62) {
                var4.field2893[var5++] = 60;
                var4.field2893[var5++] = 103;
                var4.field2893[var5++] = 116;
                var4.field2893[var5++] = 62;
            } else {
                var4.field2893[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;IIIIIIIII)I")
    public final int method1062(class128 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1056(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lsc;I)I")
    public final int method1063(class128 arg0, int arg1) {
        int var3 = this.method1053(arg0, new int[] { arg1 }, field3117);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1079(field3117[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;II)V")
    private final void method1064(class128 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3138;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field2920; var7++) {
            int var8 = arg0.field2893[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class128 var9 = arg0.method974(var5 + 1, (byte) -11, var7);
                    var5 = -1;
                    if (var9.method991(-1, field3132)) {
                        var8 = 60;
                    } else {
                        if (!var9.method991(-1, field3139)) {
                            if (var9.method996(field3136, false)) {
                                try {
                                    int var10 = var9.method998((byte) 108, 4).method1007((byte) 25);
                                    class56 var11 = field3115[var10];
                                    var11.method430(arg1, this.field3138 + var4 - var11.field1236);
                                    arg1 += var11.field1235;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method1067(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field3113 != null && var6 != -1) {
                        arg1 += this.field3113[(var6 << 8) + var8];
                    }
                    int var12 = this.field3119[var8];
                    int var13 = this.field3127[var8];
                    if (var8 == 32) {
                        if (field3120 > 0) {
                            field3109 += field3120;
                            arg1 += field3109 >> 8;
                            field3109 &= 0xFF;
                        }
                    } else if (field3121 == 256) {
                        if (field3104 != -1) {
                            method1055(this.field3116[var8], this.field3111[var8] + arg1 + 1, this.field3110[var8] + var4 + 1, var12, var13, field3104);
                        }
                        this.method344(this.field3116[var8], this.field3111[var8] + arg1, this.field3110[var8] + var4, var12, var13, field3108);
                    } else {
                        if (field3104 != -1) {
                            method1058(this.field3116[var8], this.field3111[var8] + arg1 + 1, this.field3110[var8] + var4 + 1, var12, var13, field3104, field3121);
                        }
                        this.method345(this.field3116[var8], this.field3111[var8] + arg1, this.field3110[var8] + var4, var12, var13, field3108, field3121);
                    }
                    int var14 = this.field3114[var8];
                    if (field3129 != -1) {
                        class138.method1142(arg1, (int) ((double) this.field3138 * 0.7D) + var4, var14, field3129);
                    }
                    if (field3122 != -1) {
                        class138.method1142(arg1, this.field3138 + var4 + 1, var14, field3122);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;IIII)V")
    public final void method1065(class128 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1072(arg3, arg4);
            this.method1064(arg0, arg1 - this.method1079(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)I")
    private final int method1066(int arg0) {
        return this.field3114[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lsc;)V")
    private final void method1067(class128 arg0) {
        try {
            if (arg0.method996(field3131, false)) {
                field3108 = arg0.method998((byte) 40, 4).method978(36, 16);
                return;
            }
            if (arg0.method991(-1, field3124)) {
                field3108 = field3137;
                return;
            }
            if (arg0.method996(field3133, false)) {
                field3129 = arg0.method998((byte) 24, 4).method978(36, 16);
                return;
            }
            if (arg0.method991(-1, field3134)) {
                field3129 = 8388608;
                return;
            }
            if (arg0.method991(-1, field3125)) {
                field3129 = -1;
                return;
            }
            if (arg0.method996(field3135, false)) {
                field3122 = arg0.method998((byte) 17, 2).method978(36, 16);
                return;
            }
            if (arg0.method991(-1, field3128)) {
                field3122 = 0;
                return;
            }
            if (arg0.method991(-1, field3105)) {
                field3122 = -1;
                return;
            }
            if (arg0.method996(field3107, false)) {
                field3104 = arg0.method998((byte) 115, 5).method978(36, 16);
                return;
            }
            if (arg0.method991(-1, field3126)) {
                field3104 = 0;
                return;
            }
            if (arg0.method991(-1, field3130)) {
                field3104 = field3106;
                return;
            }
            if (arg0.method991(-1, field3112)) {
                this.method1054(field3137, field3106, field3103);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;IIIILjava/util/Random;I)I")
    public final int method1068(class128 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1054(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field2920];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field2920; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method1074(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lsc;I)I")
    public final int method1069(class128 arg0, int arg1) {
        return this.method1053(arg0, new int[] { arg1 }, field3117);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lsc;IIII)V")
    public final void method1070(class128 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1072(arg3, arg4);
            this.method1064(arg0, arg1 - this.method1079(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;IIIII)V")
    public final void method1071(class128 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1072(arg3, arg4);
        int[] var7 = new int[arg0.field2920];
        int[] var8 = new int[arg0.field2920];
        for (int var9 = 0; var9 < arg0.field2920; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method1074(arg0, arg1 - this.method1079(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    private final void method1072(int arg0, int arg1) {
        field3129 = -1;
        field3122 = -1;
        field3106 = arg1;
        field3104 = arg1;
        field3137 = arg0;
        field3108 = arg0;
        field3103 = 256;
        field3121 = 256;
        field3120 = 0;
        field3109 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method1073(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;II[I[I)V")
    private final void method1074(class128 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3138;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field2920; var10++) {
            int var11 = arg0.field2893[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class128 var12 = arg0.method974(var7 + 1, (byte) -11, var10);
                    var7 = -1;
                    if (var12.method991(-1, field3132)) {
                        var11 = 60;
                    } else {
                        if (!var12.method991(-1, field3139)) {
                            if (var12.method996(field3136, false)) {
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
                                    int var15 = var12.method998((byte) 66, 4).method1007((byte) 58);
                                    class56 var16 = field3115[var15];
                                    var16.method430(arg1 + var13, this.field3138 + var6 - var16.field1236 + var14);
                                    arg1 += var16.field1235;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method1067(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field3113 != null && var8 != -1) {
                        arg1 += this.field3113[(var8 << 8) + var11];
                    }
                    int var17 = this.field3119[var11];
                    int var18 = this.field3127[var11];
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
                        if (field3120 > 0) {
                            field3109 += field3120;
                            arg1 += field3109 >> 8;
                            field3109 &= 0xFF;
                        }
                    } else if (field3121 == 256) {
                        if (field3104 != -1) {
                            method1055(this.field3116[var11], this.field3111[var11] + arg1 + var19 + 1, this.field3110[var11] + var6 + 1 + var20, var17, var18, field3104);
                        }
                        this.method344(this.field3116[var11], this.field3111[var11] + arg1 + var19, this.field3110[var11] + var6 + var20, var17, var18, field3108);
                    } else {
                        if (field3104 != -1) {
                            method1058(this.field3116[var11], this.field3111[var11] + arg1 + var19 + 1, this.field3110[var11] + var6 + 1 + var20, var17, var18, field3104, field3121);
                        }
                        this.method345(this.field3116[var11], this.field3111[var11] + arg1 + var19, this.field3110[var11] + var6 + var20, var17, var18, field3108, field3121);
                    }
                    int var21 = this.field3114[var11];
                    if (field3129 != -1) {
                        class138.method1142(arg1, (int) ((double) this.field3138 * 0.7D) + var6, var21, field3129);
                    }
                    if (field3122 != -1) {
                        class138.method1142(arg1, this.field3138 + var6, var21, field3122);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
    public static void method1075() {
        field3132 = null;
        field3139 = null;
        field3136 = null;
        field3112 = null;
        field3131 = null;
        field3124 = null;
        field3135 = null;
        field3128 = null;
        field3105 = null;
        field3107 = null;
        field3126 = null;
        field3130 = null;
        field3133 = null;
        field3134 = null;
        field3125 = null;
        field3115 = null;
        field3117 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lsc;IIIII)V")
    public final void method1076(class128 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1072(arg3, arg4);
        int[] var7 = new int[arg0.field2920];
        for (int var8 = 0; var8 < arg0.field2920; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method1074(arg0, arg1 - this.method1079(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([B)V")
    private final void method1077(byte[] arg0) {
        this.field3114 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3114.length; var2++) {
                this.field3114[var2] = arg0[var2] & 0xFF;
            }
            this.field3138 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3114[var4] = arg0[var3++] & 0xFF;
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
        this.field3113 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field3113[(var13 << 8) + var14] = (byte) method1057(var9, var11, var6, this.field3114, var5, var13, var14);
                    }
                }
            }
        }
        this.field3138 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([BIIIII)V")
    public abstract void method344(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lsc;IIII)V")
    public final void method1078(class128 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1072(arg3, arg4);
            this.method1064(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lsc;)I")
    public final int method1079(class128 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field2920; var5++) {
            int var6 = arg0.field2893[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class128 var7 = arg0.method974(var2 + 1, (byte) -11, var5);
                    var2 = -1;
                    if (var7.method991(-1, field3132)) {
                        var6 = 60;
                    } else {
                        if (!var7.method991(-1, field3139)) {
                            if (var7.method996(field3136, false)) {
                                try {
                                    int var8 = var7.method998((byte) 83, 4).method1007((byte) 20);
                                    var4 += field3115[var8].field1235;
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
                    var4 += this.field3114[var6];
                    if (this.field3113 != null && var3 != -1) {
                        var4 += this.field3113[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class133(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3111 = arg1;
        this.field3110 = arg2;
        this.field3119 = arg3;
        this.field3127 = arg4;
        this.method1077(arg0);
        this.field3116 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3110[var10] < var8 && this.field3127[var10] != 0) {
                var8 = this.field3110[var10];
            }
            if (this.field3127[var10] + this.field3110[var10] > var9) {
                var9 = this.field3127[var10] + this.field3110[var10];
            }
        }
        this.field3123 = this.field3138 - var8;
        this.field3118 = var9 - this.field3138;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V")
    public class133(byte[] arg0) {
        this.method1077(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([BIIIIII)V")
    public abstract void method345(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
