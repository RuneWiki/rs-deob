import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class156 extends class129 {

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "I")
    public int field3392 = 0;

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "[[B")
    public byte[][] field3383 = new byte[256][];

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "[I")
    private int[] field3376;

    @OriginalMember(owner = "client!wc", name = "tb", descriptor = "[I")
    private int[] field3395;

    @OriginalMember(owner = "client!wc", name = "yb", descriptor = "[I")
    private int[] field3400;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "[I")
    private int[] field3378;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
    private int field3379;

    @OriginalMember(owner = "client!wc", name = "Bb", descriptor = "I")
    private int field3403;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "Lic;")
    private static class59 field3377 = class59.method433(0, "img=");

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
    private static int field3385 = 256;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "Lic;")
    private static class59 field3380 = class59.method433(0, "str=");

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "Lic;")
    private static class59 field3382 = class59.method433(0, "gt");

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
    private static int field3389 = 0;

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "Lic;")
    private static class59 field3391 = class59.method433(0, "col=");

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lic;")
    private static class59 field3381 = class59.method433(0, "str");

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "Lic;")
    private static class59 field3384 = class59.method433(0, ")4shad");

    @OriginalMember(owner = "client!wc", name = "sb", descriptor = "I")
    private static int field3394 = 0;

    @OriginalMember(owner = "client!wc", name = "rb", descriptor = "Lic;")
    private static class59 field3393 = class59.method433(0, "u");

    @OriginalMember(owner = "client!wc", name = "Eb", descriptor = "Lic;")
    private static class59 field3406 = class59.method433(0, "br");

    @OriginalMember(owner = "client!wc", name = "wb", descriptor = "I")
    private static int field3398 = 256;

    @OriginalMember(owner = "client!wc", name = "Ab", descriptor = "I")
    private static int field3402 = -1;

    @OriginalMember(owner = "client!wc", name = "Db", descriptor = "I")
    private static int field3405 = 0;

    @OriginalMember(owner = "client!wc", name = "Cb", descriptor = "I")
    private static int field3404 = 0;

    @OriginalMember(owner = "client!wc", name = "vb", descriptor = "I")
    private static int field3397 = -1;

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
    private static int field3387 = -1;

    @OriginalMember(owner = "client!wc", name = "zb", descriptor = "I")
    private static int field3401 = -1;

    @OriginalMember(owner = "client!wc", name = "Fb", descriptor = "[Lic;")
    private static class59[] field3407 = new class59[100];

    @OriginalMember(owner = "client!wc", name = "Gb", descriptor = "Lic;")
    private static class59 field3408 = class59.method433(0, ")4u");

    @OriginalMember(owner = "client!wc", name = "Ib", descriptor = "Lic;")
    private static class59 field3410 = class59.method433(0, ")4col");

    @OriginalMember(owner = "client!wc", name = "ub", descriptor = "Lic;")
    private static class59 field3396 = class59.method433(0, "shad");

    @OriginalMember(owner = "client!wc", name = "Hb", descriptor = "Lic;")
    private static class59 field3409 = class59.method433(0, ")4str");

    @OriginalMember(owner = "client!wc", name = "Jb", descriptor = "Lic;")
    private static class59 field3411 = class59.method433(0, "lt");

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "Lic;")
    private static class59 field3390 = class59.method433(0, "u=");

    @OriginalMember(owner = "client!wc", name = "Kb", descriptor = "Lic;")
    private static class59 field3412 = class59.method433(0, "shad=");

    @OriginalMember(owner = "client!wc", name = "xb", descriptor = "[B")
    private byte[] field3399;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "[I")
    private int[] field3388;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "[Lce;")
    public static class20[] field3386;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method1132(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;IIIIIIIIII)I")
    private final int method1133(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1149(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field3392;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field3403 + this.field3379 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1145(arg0, var12, field3407);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field3379 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field3379 - this.field3403 - (var13 - 1) * arg10) / 2 + this.field3379 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field3403 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field3379 - this.field3403 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field3379 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1137(field3407[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1137(field3407[var16], arg1 + (arg3 - this.method1157(field3407[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1137(field3407[var16], arg1 + arg3 - this.method1157(field3407[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1137(field3407[var16], arg1, var14);
            } else {
                this.method1158(field3407[var16], arg3);
                this.method1137(field3407[var16], arg1, var14);
                field3405 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;IIII)V")
    public final void method1134(class59 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1142(arg3, arg4);
            this.method1137(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lic;IIII)V")
    public final void method1135(class59 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1142(arg3, arg4);
            this.method1137(arg0, arg1 - this.method1157(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;IIIILjava/util/Random;I)I")
    public final int method1136(class59 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1149(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field1418];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field1418; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method1147(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;II)V")
    private final void method1137(class59 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3392;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field1418; var7++) {
            int var8 = arg0.field1448[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class59 var9 = arg0.method427((byte) 41, var7, var5 + 1);
                    var5 = -1;
                    if (var9.method421(field3411, false)) {
                        var8 = 60;
                    } else {
                        if (!var9.method421(field3382, false)) {
                            if (var9.method443((byte) 34, field3377)) {
                                try {
                                    int var10 = var9.method452(-805469788, 4).method440(10);
                                    class20 var11 = field3386[var10];
                                    var11.method111(arg1, this.field3392 + var4 - var11.field444);
                                    arg1 += var11.field439;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method1140(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field3399 != null && var6 != -1) {
                        arg1 += this.field3399[(var6 << 8) + var8];
                    }
                    int var12 = this.field3400[var8];
                    int var13 = this.field3378[var8];
                    if (var8 == 32) {
                        if (field3405 > 0) {
                            field3389 += field3405;
                            arg1 += field3389 >> 8;
                            field3389 &= 0xFF;
                        }
                    } else if (field3385 == 256) {
                        if (field3401 != -1) {
                            this.method1144(var8, this.field3376[var8] + arg1 + 1, this.field3395[var8] + var4 + 1, var12, var13, field3401);
                        }
                        this.method1057(var8, this.field3376[var8] + arg1, this.field3395[var8] + var4, var12, var13, field3394);
                    } else {
                        if (field3401 != -1) {
                            this.method1139(var8, this.field3376[var8] + arg1 + 1, this.field3395[var8] + var4 + 1, var12, var13, field3401, field3385);
                        }
                        this.method1056(var8, this.field3376[var8] + arg1, this.field3395[var8] + var4, var12, var13, field3394, field3385);
                    }
                    int var14 = this.field3388[var8];
                    if (field3397 != -1) {
                        class129.method996(arg1, (int) ((double) this.field3392 * 0.7D) + var4, var14, field3397);
                    }
                    if (field3402 != -1) {
                        class129.method996(arg1, this.field3392 + var4 + 1, var14, field3402);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;IIIII)V")
    public final void method1138(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1142(arg3, arg4);
        int[] var7 = new int[arg0.field1418];
        int[] var8 = new int[arg0.field1418];
        for (int var9 = 0; var9 < arg0.field1418; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method1147(arg0, arg1 - this.method1157(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V")
    private final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class129.field2911 * arg2 + arg1;
        int var9 = class129.field2911 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class129.field2912) {
            int var12 = class129.field2912 - arg2;
            arg4 -= var12;
            arg2 = class129.field2912;
            var11 += arg3 * var12;
            var8 += class129.field2911 * var12;
        }
        if (arg2 + arg4 > class129.field2909) {
            arg4 -= arg2 + arg4 - class129.field2909;
        }
        if (arg1 < class129.field2907) {
            int var13 = class129.field2907 - arg1;
            arg3 -= var13;
            arg1 = class129.field2907;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class129.field2910) {
            int var14 = arg1 + arg3 - class129.field2910;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1148(class129.field2906, this.field3383[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;)V")
    private final void method1140(class59 arg0) {
        try {
            if (arg0.method443((byte) 34, field3391)) {
                field3394 = arg0.method452(-805469788, 4).method428((byte) 116, 16);
                return;
            }
            if (arg0.method421(field3410, false)) {
                field3394 = field3404;
                return;
            }
            if (arg0.method443((byte) 34, field3380)) {
                field3397 = arg0.method452(-805469788, 4).method428((byte) 116, 16);
                return;
            }
            if (arg0.method421(field3381, false)) {
                field3397 = 8388608;
                return;
            }
            if (arg0.method421(field3409, false)) {
                field3397 = -1;
                return;
            }
            if (arg0.method443((byte) 34, field3390)) {
                field3402 = arg0.method452(-805469788, 2).method428((byte) 116, 16);
                return;
            }
            if (arg0.method421(field3393, false)) {
                field3402 = 0;
                return;
            }
            if (arg0.method421(field3408, false)) {
                field3402 = -1;
                return;
            }
            if (arg0.method443((byte) 34, field3412)) {
                field3401 = arg0.method452(-805469788, 5).method428((byte) 116, 16);
                return;
            }
            if (arg0.method421(field3396, false)) {
                field3401 = 0;
                return;
            }
            if (arg0.method421(field3384, false)) {
                field3401 = field3387;
                return;
            }
            if (arg0.method421(field3406, false)) {
                this.method1149(field3404, field3387, field3398);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([B)V")
    private final void method1141(byte[] arg0) {
        this.field3388 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3388.length; var2++) {
                this.field3388[var2] = arg0[var2] & 0xFF;
            }
            this.field3392 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3388[var4] = arg0[var3++] & 0xFF;
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
        this.field3399 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field3399[(var13 << 8) + var14] = (byte) method1159(var9, var11, var6, this.field3388, var5, var13, var14);
                    }
                }
            }
        }
        this.field3392 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    private final void method1142(int arg0, int arg1) {
        field3397 = -1;
        field3402 = -1;
        field3387 = arg1;
        field3401 = arg1;
        field3404 = arg0;
        field3394 = arg0;
        field3398 = 256;
        field3385 = 256;
        field3405 = 0;
        field3389 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
    private final int method1143(int arg0) {
        return this.field3388[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(IIIIII)V")
    private final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class129.field2911 * arg2 + arg1;
        int var8 = class129.field2911 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class129.field2912) {
            int var11 = class129.field2912 - arg2;
            arg4 -= var11;
            arg2 = class129.field2912;
            var10 += arg3 * var11;
            var7 += class129.field2911 * var11;
        }
        if (arg2 + arg4 > class129.field2909) {
            arg4 -= arg2 + arg4 - class129.field2909;
        }
        if (arg1 < class129.field2907) {
            int var12 = class129.field2907 - arg1;
            arg3 -= var12;
            arg1 = class129.field2907;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class129.field2910) {
            int var13 = arg1 + arg3 - class129.field2910;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1132(class129.field2906, this.field3383[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;[I[Lic;)I")
    private final int method1145(class59 arg0, int[] arg1, class59[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class59 var6 = class89.method734(100, 0);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method437((byte) 52);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method425((byte) 105, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class59 var16 = arg0.method427((byte) 41, var14, var10 + 1);
                    var10 = -1;
                    var6.method434(-20362, 60);
                    var6.method424(var16, 2);
                    var6.method434(-20362, 62);
                    if (var16.method421(field3406, false)) {
                        arg2[var12++] = var6.method427((byte) 41, var6.method437((byte) 52), var5);
                        var5 = var6.method437((byte) 52);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method421(field3411, false)) {
                        var4 += this.method1143(60);
                        if (this.field3399 != null && var11 != -1) {
                            var4 += this.field3399[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method421(field3382, false)) {
                        var4 += this.method1143(62);
                        if (this.field3399 != null && var11 != -1) {
                            var4 += this.field3399[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method443((byte) 34, field3377)) {
                        try {
                            int var17 = var16.method452(-805469788, 4).method440(10);
                            var4 += field3386[var17].field439;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method434(-20362, var15);
                        var4 += this.method1143(var15);
                        if (this.field3399 != null && var11 != -1) {
                            var4 += this.field3399[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method437((byte) 52);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method427((byte) 41, var7 - var9, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method437((byte) 52);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method437((byte) 52) > var5) {
            arg2[var12++] = var6.method427((byte) 41, var6.method437((byte) 52), var5);
        }
        return var12;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lic;IIII)V")
    public final void method1146(class59 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1142(arg3, arg4);
            this.method1137(arg0, arg1 - this.method1157(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;II[I[I)V")
    private final void method1147(class59 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3392;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field1418; var10++) {
            int var11 = arg0.field1448[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class59 var12 = arg0.method427((byte) 41, var10, var7 + 1);
                    var7 = -1;
                    if (var12.method421(field3411, false)) {
                        var11 = 60;
                    } else {
                        if (!var12.method421(field3382, false)) {
                            if (var12.method443((byte) 34, field3377)) {
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
                                    int var15 = var12.method452(-805469788, 4).method440(10);
                                    class20 var16 = field3386[var15];
                                    var16.method111(arg1 + var13, this.field3392 + var6 - var16.field444 + var14);
                                    arg1 += var16.field439;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method1140(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field3399 != null && var8 != -1) {
                        arg1 += this.field3399[(var8 << 8) + var11];
                    }
                    int var17 = this.field3400[var11];
                    int var18 = this.field3378[var11];
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
                        if (field3405 > 0) {
                            field3389 += field3405;
                            arg1 += field3389 >> 8;
                            field3389 &= 0xFF;
                        }
                    } else if (field3385 == 256) {
                        if (field3401 != -1) {
                            this.method1144(var11, this.field3376[var11] + arg1 + var19 + 1, this.field3395[var11] + var6 + 1 + var20, var17, var18, field3401);
                        }
                        this.method1057(var11, this.field3376[var11] + arg1 + var19, this.field3395[var11] + var6 + var20, var17, var18, field3394);
                    } else {
                        if (field3401 != -1) {
                            this.method1139(var11, this.field3376[var11] + arg1 + var19 + 1, this.field3395[var11] + var6 + 1 + var20, var17, var18, field3401, field3385);
                        }
                        this.method1056(var11, this.field3376[var11] + arg1 + var19, this.field3395[var11] + var6 + var20, var17, var18, field3394, field3385);
                    }
                    int var21 = this.field3388[var11];
                    if (field3397 != -1) {
                        class129.method996(arg1, (int) ((double) this.field3392 * 0.7D) + var6, var21, field3397);
                    }
                    if (field3402 != -1) {
                        class129.method996(arg1, this.field3392 + var6, var21, field3402);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method1148(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    private final void method1149(int arg0, int arg1, int arg2) {
        field3397 = -1;
        field3402 = -1;
        field3387 = arg1;
        field3401 = arg1;
        field3404 = arg0;
        field3394 = arg0;
        field3398 = arg2;
        field3385 = arg2;
        field3405 = 0;
        field3389 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lic;)Lic;")
    public static final class59 method1150(class59 arg0) {
        int var1 = arg0.method437((byte) 52);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field1448[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class59 var4 = new class59();
        var4.field1418 = var1 + var2;
        var4.field1448 = new byte[var4.field1418];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field1448[var6];
            if (var7 == 60) {
                var4.field1448[var5++] = 60;
                var4.field1448[var5++] = 108;
                var4.field1448[var5++] = 116;
                var4.field1448[var5++] = 62;
            } else if (var7 == 62) {
                var4.field1448[var5++] = 60;
                var4.field1448[var5++] = 103;
                var4.field1448[var5++] = 116;
                var4.field1448[var5++] = 62;
            } else {
                var4.field1448[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;IIIIII)V")
    public final void method1151(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1142(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field1418];
        for (int var11 = 0; var11 < arg0.field1418; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method1147(arg0, arg1 - this.method1157(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;I)I")
    public final int method1152(class59 arg0, int arg1) {
        return this.method1145(arg0, new int[] { arg1 }, field3407);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()V")
    public static void method1153() {
        field3411 = null;
        field3382 = null;
        field3377 = null;
        field3406 = null;
        field3391 = null;
        field3410 = null;
        field3390 = null;
        field3393 = null;
        field3408 = null;
        field3412 = null;
        field3396 = null;
        field3384 = null;
        field3380 = null;
        field3381 = null;
        field3409 = null;
        field3386 = null;
        field3407 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lic;IIIII)V")
    public final void method1154(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1142(arg3, arg4);
        int[] var7 = new int[arg0.field1418];
        for (int var8 = 0; var8 < arg0.field1418; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method1147(arg0, arg1 - this.method1157(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lic;IIIIIIIII)I")
    public final int method1155(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1133(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lic;I)I")
    public final int method1156(class59 arg0, int arg1) {
        int var3 = this.method1145(arg0, new int[] { arg1 }, field3407);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1157(field3407[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(IIIIII)V")
    public abstract void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lic;)I")
    public final int method1157(class59 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field1418; var5++) {
            int var6 = arg0.field1448[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class59 var7 = arg0.method427((byte) 41, var5, var2 + 1);
                    var2 = -1;
                    if (var7.method421(field3411, false)) {
                        var6 = 60;
                    } else {
                        if (!var7.method421(field3382, false)) {
                            if (var7.method443((byte) 34, field3377)) {
                                try {
                                    int var8 = var7.method452(-805469788, 4).method440(10);
                                    var4 += field3386[var8].field439;
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
                    var4 += this.field3388[var6];
                    if (this.field3399 != null && var3 != -1) {
                        var4 += this.field3399[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Lic;I)V")
    private final void method1158(class59 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method437((byte) 52); var5++) {
            int var6 = arg0.method425((byte) 105, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field3405 = (arg1 - this.method1157(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1159(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class156(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3376 = arg1;
        this.field3395 = arg2;
        this.field3400 = arg3;
        this.field3378 = arg4;
        this.method1141(arg0);
        this.field3383 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3395[var10] < var8 && this.field3378[var10] != 0) {
                var8 = this.field3395[var10];
            }
            if (this.field3395[var10] + this.field3378[var10] > var9) {
                var9 = this.field3395[var10] + this.field3378[var10];
            }
        }
        this.field3379 = this.field3392 - var8;
        this.field3403 = var9 - this.field3392;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
    public class156(byte[] arg0) {
        this.method1141(arg0);
    }
}
