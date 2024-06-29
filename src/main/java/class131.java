import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class131 extends class49 {

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "I")
    public int field3165 = 0;

    @OriginalMember(owner = "client!wc", name = "ub", descriptor = "[[B")
    private byte[][] field3169 = new byte[256][];

    @OriginalMember(owner = "client!wc", name = "yb", descriptor = "Ljava/util/Random;")
    private Random field3173 = new Random();

    @OriginalMember(owner = "client!wc", name = "Fb", descriptor = "Z")
    private boolean field3180 = false;

    @OriginalMember(owner = "client!wc", name = "Cb", descriptor = "[I")
    private int[] field3177;

    @OriginalMember(owner = "client!wc", name = "tb", descriptor = "[I")
    private int[] field3168;

    @OriginalMember(owner = "client!wc", name = "Ab", descriptor = "[I")
    private int[] field3175;

    @OriginalMember(owner = "client!wc", name = "Gb", descriptor = "I")
    private int field3181;

    @OriginalMember(owner = "client!wc", name = "Eb", descriptor = "I")
    private int field3179;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "Lwb;")
    private static class130 field3161 = class26.method212("or2", -32376);

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "[Lwb;")
    private static class130[] field3160 = new class130[100];

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "Lwb;")
    private static class130 field3163 = class26.method212("cya", -32376);

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lwb;")
    private static class130 field3154 = class26.method212("mag", -32376);

    @OriginalMember(owner = "client!wc", name = "rb", descriptor = "Lwb;")
    private static class130 field3166 = class26.method212("gr1", -32376);

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "Lwb;")
    private static class130 field3155 = class26.method212("str", -32376);

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "Lwb;")
    private static class130 field3162 = class26.method212("whi", -32376);

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "Lwb;")
    private static class130 field3157 = class26.method212("or1", -32376);

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "Lwb;")
    private static class130 field3156 = class26.method212("gr3", -32376);

    @OriginalMember(owner = "client!wc", name = "sb", descriptor = "Lwb;")
    private static class130 field3167 = class26.method212("yel", -32376);

    @OriginalMember(owner = "client!wc", name = "vb", descriptor = "Lwb;")
    private static class130 field3170 = class26.method212("dre", -32376);

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "Lwb;")
    private static class130 field3164 = class26.method212("blu", -32376);

    @OriginalMember(owner = "client!wc", name = "xb", descriptor = "Lwb;")
    private static class130 field3172 = class26.method212("dbl", -32376);

    @OriginalMember(owner = "client!wc", name = "Bb", descriptor = "Lwb;")
    private static class130 field3176 = class26.method212("bla", -32376);

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "Lwb;")
    private static class130 field3158 = class26.method212("gre", -32376);

    @OriginalMember(owner = "client!wc", name = "wb", descriptor = "Lwb;")
    private static class130 field3171 = class26.method212("lre", -32376);

    @OriginalMember(owner = "client!wc", name = "Db", descriptor = "Lwb;")
    private static class130 field3178 = class26.method212("gr2", -32376);

    @OriginalMember(owner = "client!wc", name = "zb", descriptor = "Lwb;")
    private static class130 field3174 = class26.method212("or3", -32376);

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "Lwb;")
    private static class130 field3159 = class26.method212("red", -32376);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BIIIII)V", line = 5)
    private final void method993(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class49.field1302 * arg2 + arg1;
        int var8 = class49.field1302 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class49.field1303) {
            int var11 = class49.field1303 - arg2;
            arg4 -= var11;
            arg2 = class49.field1303;
            var10 += arg3 * var11;
            var7 += class49.field1302 * var11;
        }
        if (arg2 + arg4 > class49.field1306) {
            arg4 -= arg2 + arg4 - class49.field1306;
        }
        if (arg1 < class49.field1304) {
            int var12 = class49.field1304 - arg1;
            arg3 -= var12;
            arg1 = class49.field1304;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class49.field1305) {
            int var13 = arg1 + arg3 - class49.field1305;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method1011(class49.field1308, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwb;IIII)V", line = 55)
    public final void method994(class130 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method1013(arg0) / 2;
        int var7 = arg2 - this.field3165;
        for (int var8 = 0; var8 < arg0.field3079; var8++) {
            int var9 = arg0.field3081[var8] & 0xFF;
            if (var9 != 32) {
                this.method993(this.field3169[var9], var6, this.field3177[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field3168[var9], this.field3175[var9], arg3);
            }
            var6 += this.field3168[var9];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwb;IIIII)V", line = 76)
    public final void method995(class130 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method1013(arg0) / 2;
        int var10 = arg2 - this.field3165;
        for (int var11 = 0; var11 < arg0.method958((byte) -38); var11++) {
            int var12 = arg0.field3081[var11] & 0xFF;
            if (var12 != 32) {
                this.method993(this.field3169[var12], var9, this.field3177[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field3168[var12], this.field3175[var12], arg3);
            }
            var9 += this.field3168[var12];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwb;)I", line = 103)
    public final int method996(class130 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field3079; var3++) {
            if (arg0.field3081[var3] == 64 && var3 + 4 < arg0.field3079 && arg0.field3081[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field3168[arg0.field3081[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwb;III)V", line = 126)
    public final void method997(class130 arg0, int arg1, int arg2, int arg3) {
        this.method1002(arg0, arg1 - this.method1013(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BIIIIII)V", line = 131)
    private final void method998(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class49.field1302 * arg2 + arg1;
        int var9 = class49.field1302 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class49.field1303) {
            int var12 = class49.field1303 - arg2;
            arg4 -= var12;
            arg2 = class49.field1303;
            var11 += arg3 * var12;
            var8 += class49.field1302 * var12;
        }
        if (arg2 + arg4 > class49.field1306) {
            arg4 -= arg2 + arg4 - class49.field1306;
        }
        if (arg1 < class49.field1304) {
            int var13 = class49.field1304 - arg1;
            arg3 -= var13;
            arg1 = class49.field1304;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class49.field1305) {
            int var14 = arg1 + arg3 - class49.field1305;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method1004(class49.field1308, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwb;IIIIIZIII)V", line = 181)
    public final void method999(class130 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class130 var13 = class81.method616(100, 0);
        int var14 = -1;
        int var15 = 0;
        class130 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field3181;
        }
        boolean var17 = true;
        if (arg4 < this.field3181 + this.field3179 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method958((byte) -38);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method964(true, var20);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method964(true, var20 + 4) == 64) {
                var16 = arg0.method970(true, var20 + 5, var20);
                var13.method966(0, var16);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method964(true, var20 + 1) == 110) {
                var16 = null;
                field3160[var18++] = var13.method970(true, var13.method958((byte) -38), var12).method967((byte) 56);
                var12 = var13.method958((byte) -38);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method976(18169, var24);
                var11 += this.method1003(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method958((byte) -38);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field3160[var18++] = var13.method970(true, var14, var12).method967((byte) 56);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method989(var16, var12, -123);
                    }
                }
            }
        }
        if (var13.method958((byte) -38) > var12) {
            field3160[var18++] = var13.method970(true, var13.method958((byte) -38), var12).method967((byte) 56);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field3181 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field3181 - this.field3179 - (var18 - 1) * arg9) / 2 + this.field3181 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field3179 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field3181 - this.field3179 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field3181 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method1000(field3160[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method1006(field3160[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method1007(field3160[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method1000(field3160[var23], arg1, var21, arg5, arg6);
            } else {
                this.method1009(field3160[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwb;IIIZ)V", line = 325)
    public final void method1000(class130 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3180 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field3165;
        for (int var8 = 0; var8 < arg0.field3079; var8++) {
            if (arg0.field3081[var8] == 64 && var8 + 4 < arg0.field3079 && arg0.field3081[var8 + 4] == 64) {
                int var9 = this.method1008(arg0.method970(true, var8 + 4, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field3081[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method993(this.field3169[var10], arg1 + 1, this.field3177[var10] + var7 + 1, this.field3168[var10], this.field3175[var10], 0);
                    }
                    this.method993(this.field3169[var10], arg1, this.field3177[var10] + var7, this.field3168[var10], this.field3175[var10], arg3);
                }
                arg1 += this.field3168[var10];
            }
        }
        if (this.field3180) {
            class49.method438(var6, (int) ((double) this.field3165 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwb;IIIZI)V", line = 371)
    public final void method1001(class130 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field3173.setSeed((long) arg5);
        int var7 = (this.field3173.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field3165;
        for (int var9 = 0; var9 < arg0.field3079; var9++) {
            if (arg0.field3081[var9] == 64 && var9 + 4 < arg0.field3079 && arg0.field3081[var9 + 4] == 64) {
                int var10 = this.method1008(arg0.method970(true, var9 + 4, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field3081[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method998(this.field3169[var11], arg1 + 1, this.field3177[var11] + var8 + 1, this.field3168[var11], this.field3175[var11], 0, 192);
                    }
                    this.method998(this.field3169[var11], arg1, this.field3177[var11] + var8, this.field3168[var11], this.field3175[var11], arg3, var7);
                }
                arg1 += this.field3168[var11];
                if ((this.field3173.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lwb;III)V", line = 424)
    public final void method1002(class130 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field3165;
        for (int var6 = 0; var6 < arg0.field3079; var6++) {
            int var7 = arg0.field3081[var6] & 0xFF;
            if (var7 != 32) {
                this.method993(this.field3169[var7], arg1, this.field3177[var7] + var5, this.field3168[var7], this.field3175[var7], arg3);
            }
            arg1 += this.field3168[var7];
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)I", line = 444)
    public final int method1003(int arg0) {
        return this.field3168[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([I[BIIIIIIII)V", line = 447)
    private final void method1004(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var15 = arg0[arg4];
                    arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()V", line = 478)
    public static void method1005() {
        field3159 = null;
        field3158 = null;
        field3164 = null;
        field3167 = null;
        field3163 = null;
        field3154 = null;
        field3162 = null;
        field3176 = null;
        field3171 = null;
        field3170 = null;
        field3172 = null;
        field3157 = null;
        field3161 = null;
        field3174 = null;
        field3166 = null;
        field3178 = null;
        field3156 = null;
        field3155 = null;
        field3160 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lwb;IIIZ)V", line = 507)
    public final void method1006(class130 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1000(arg0, arg1 - this.method996(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lwb;IIIZ)V", line = 515)
    public final void method1007(class130 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1000(arg0, arg1 - this.method996(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lwb;)I", line = 519)
    private final int method1008(class130 arg0) {
        if (arg0.method979(field3159, 29738)) {
            return 16711680;
        } else if (arg0.method979(field3158, 29738)) {
            return 65280;
        } else if (arg0.method979(field3164, 29738)) {
            return 255;
        } else if (arg0.method979(field3167, 29738)) {
            return 16776960;
        } else if (arg0.method979(field3163, 29738)) {
            return 65535;
        } else if (arg0.method979(field3154, 29738)) {
            return 16711935;
        } else if (arg0.method979(field3162, 29738)) {
            return 16777215;
        } else if (arg0.method979(field3176, 29738)) {
            return 0;
        } else if (arg0.method979(field3171, 29738)) {
            return 16748608;
        } else if (arg0.method979(field3170, 29738)) {
            return 8388608;
        } else if (arg0.method979(field3172, 29738)) {
            return 128;
        } else if (arg0.method979(field3157, 29738)) {
            return 16756736;
        } else if (arg0.method979(field3161, 29738)) {
            return 16740352;
        } else if (arg0.method979(field3174, 29738)) {
            return 16723968;
        } else if (arg0.method979(field3166, 29738)) {
            return 12648192;
        } else if (arg0.method979(field3178, 29738)) {
            return 8453888;
        } else if (arg0.method979(field3156, 29738)) {
            return 4259584;
        } else {
            if (arg0.method979(field3155, 29738)) {
                this.field3180 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lwb;IIIZI)V", line = 576)
    private final void method1009(class130 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class130 var7 = arg0.method967((byte) 56);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method958((byte) -38); var9++) {
            if (var7.method964(true, var9) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method996(var7)) * 256 / var8;
        }
        this.field3180 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field3165;
        for (int var14 = 0; var14 < var7.field3079; var14++) {
            if (var7.field3081[var14] == 64 && var14 + 4 < var7.field3079 && var7.field3081[var14 + 4] == 64) {
                int var15 = this.method1008(var7.method970(true, var14 + 4, var14 + 1));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field3081[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method993(this.field3169[var16], arg1 + 1, this.field3177[var16] + var13 + 1, this.field3168[var16], this.field3175[var16], 0);
                    }
                    this.method993(this.field3169[var16], arg1, this.field3177[var16] + var13, this.field3168[var16], this.field3175[var16], arg3);
                }
                arg1 += this.field3168[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field3180) {
            class49.method438(var12, (int) ((double) this.field3165 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lwb;IIII)V", line = 668)
    public final void method1010(class130 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method1013(arg0) / 2;
        int var7 = arg2 - this.field3165;
        for (int var8 = 0; var8 < arg0.method958((byte) -38); var8++) {
            int var9 = arg0.field3081[var8] & 0xFF;
            if (var9 != 32) {
                this.method993(this.field3169[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field3177[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field3168[var9], this.field3175[var9], arg3);
            }
            var6 += this.field3168[var9];
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 806)
    public class131(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field3177 = arg0;
        this.field3168 = arg1;
        this.field3175 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field3169 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3177[var10] < var8) {
                var8 = this.field3177[var10];
            }
            if (this.field3177[var10] + this.field3175[var10] > var9) {
                var9 = this.field3177[var10] + this.field3175[var10];
            }
            byte[] var11 = this.field3169[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field3165 = this.field3177[32] + this.field3175[32];
        this.field3181 = this.field3165 - var8;
        this.field3179 = var9 - this.field3165;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([I[BIIIIIII)V", line = 697)
    private final void method1011(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
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
            for (int var14 = var11; var14 < 0; var14++) {
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

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lwb;III)V", line = 759)
    public final void method1012(class130 arg0, int arg1, int arg2, int arg3) {
        this.method1002(arg0, arg1 - this.method1013(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lwb;)I", line = 769)
    public final int method1013(class130 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field3079; var3++) {
            var2 += this.field3168[arg0.field3081[var3] & 0xFF];
        }
        return var2;
    }
}
