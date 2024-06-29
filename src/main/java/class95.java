import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 extends class114 {

    @OriginalMember(owner = "client!ne", name = "Fb", descriptor = "[[B")
    private byte[][] field2243 = new byte[256][];

    @OriginalMember(owner = "client!ne", name = "nb", descriptor = "I")
    public int field2225 = 0;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "[I")
    private int[] field2221;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "[I")
    private int[] field2222;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "[I")
    private int[] field2216;

    @OriginalMember(owner = "client!ne", name = "zb", descriptor = "I")
    private int field2237;

    @OriginalMember(owner = "client!ne", name = "Db", descriptor = "I")
    private int field2241;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "Ltd;")
    private static class136 field2214 = class145.method1172("u=", 45);

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Ltd;")
    private static class136 field2213 = class145.method1172(")4shad", 45);

    @OriginalMember(owner = "client!ne", name = "mb", descriptor = "Ltd;")
    private static class136 field2224 = class145.method1172(")4str", 45);

    @OriginalMember(owner = "client!ne", name = "ob", descriptor = "Ltd;")
    private static class136 field2226 = class145.method1172(")4u", 45);

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
    private static int field2223 = -1;

    @OriginalMember(owner = "client!ne", name = "ub", descriptor = "Ltd;")
    private static class136 field2232 = class145.method1172("shad", 45);

    @OriginalMember(owner = "client!ne", name = "sb", descriptor = "Ltd;")
    private static class136 field2230 = class145.method1172("str", 45);

    @OriginalMember(owner = "client!ne", name = "qb", descriptor = "I")
    private static int field2228 = 256;

    @OriginalMember(owner = "client!ne", name = "Bb", descriptor = "I")
    private static int field2239 = 0;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "Ltd;")
    private static class136 field2220 = class145.method1172("lt", 45);

    @OriginalMember(owner = "client!ne", name = "Ab", descriptor = "I")
    private static int field2238 = -1;

    @OriginalMember(owner = "client!ne", name = "Cb", descriptor = "Ltd;")
    private static class136 field2240 = class145.method1172("gt", 45);

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "Ltd;")
    private static class136 field2219 = class145.method1172("shad=", 45);

    @OriginalMember(owner = "client!ne", name = "tb", descriptor = "Ltd;")
    private static class136 field2231 = class145.method1172("u", 45);

    @OriginalMember(owner = "client!ne", name = "vb", descriptor = "Ltd;")
    private static class136 field2233 = class145.method1172("img=", 45);

    @OriginalMember(owner = "client!ne", name = "yb", descriptor = "Ltd;")
    private static class136 field2236 = class145.method1172("str=", 45);

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    private static int field2218 = 0;

    @OriginalMember(owner = "client!ne", name = "Eb", descriptor = "Ltd;")
    private static class136 field2242 = class145.method1172("i", 45);

    @OriginalMember(owner = "client!ne", name = "Gb", descriptor = "Ltd;")
    private static class136 field2244 = class145.method1172("b", 45);

    @OriginalMember(owner = "client!ne", name = "Hb", descriptor = "Ltd;")
    private static class136 field2245 = class145.method1172("br", 45);

    @OriginalMember(owner = "client!ne", name = "Jb", descriptor = "Ltd;")
    private static class136 field2247 = class145.method1172(")4col", 45);

    @OriginalMember(owner = "client!ne", name = "pb", descriptor = "I")
    private static int field2227 = -1;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    private static int field2217 = 0;

    @OriginalMember(owner = "client!ne", name = "xb", descriptor = "Ltd;")
    private static class136 field2235 = class145.method1172("col=", 45);

    @OriginalMember(owner = "client!ne", name = "wb", descriptor = "I")
    private static int field2234 = 0;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Ltd;")
    private static class136 field2215 = class145.method1172(")4i", 45);

    @OriginalMember(owner = "client!ne", name = "Lb", descriptor = "I")
    private static int field2249 = -1;

    @OriginalMember(owner = "client!ne", name = "Kb", descriptor = "Ltd;")
    private static class136 field2248 = class145.method1172(")4b", 45);

    @OriginalMember(owner = "client!ne", name = "Ib", descriptor = "Ljava/util/Random;")
    private static Random field2246 = new Random();

    @OriginalMember(owner = "client!ne", name = "Mb", descriptor = "[Ltd;")
    private static class136[] field2250 = new class136[100];

    @OriginalMember(owner = "client!ne", name = "rb", descriptor = "[Lnb;")
    public static class92[] field2229;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BIIIII)V")
    private static final void method701(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class114.field2634 * arg2 + arg1;
        int var7 = class114.field2634 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class114.field2635) {
            int var10 = class114.field2635 - arg2;
            arg4 -= var10;
            arg2 = class114.field2635;
            var9 += arg3 * var10;
            var6 += class114.field2634 * var10;
        }
        if (arg2 + arg4 > class114.field2633) {
            arg4 -= arg2 + arg4 - class114.field2633;
        }
        if (arg1 < class114.field2629) {
            int var11 = class114.field2629 - arg1;
            arg3 -= var11;
            arg1 = class114.field2629;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class114.field2631) {
            int var12 = arg1 + arg3 - class114.field2631;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method716(class114.field2632, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;IIII)V")
    public final void method702(class136 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method718(arg3, arg4);
            this.method711(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;[I[Ltd;)I")
    private final int method703(class136 arg0, int[] arg1, class136[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class136 var6 = class151.method1192(false, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method1119(-10511);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method1094(false, var13);
            if (var14 == 60) {
                var10 = var13;
            } else {
                if (var14 == 62 && var10 != -1) {
                    class136 var15 = arg0.method1105(var10 + 1, (byte) -7, var13);
                    var10 = -1;
                    var6.method1116(60, 2);
                    var6.method1097(var15, (byte) 83);
                    var6.method1116(62, 2);
                    if (var15.method1114(0, field2245)) {
                        arg2[var11++] = var6.method1105(var5, (byte) -7, var6.method1119(-10511));
                        var5 = var6.method1119(-10511);
                        var4 = 0;
                        var7 = -1;
                    } else if (var15.method1114(0, field2220)) {
                        var4 += this.method704(60);
                    } else if (var15.method1114(0, field2240)) {
                        var4 += this.method704(62);
                    } else if (var15.method1120(field2233, 0)) {
                        try {
                            int var16 = var15.method1108(4, -16621).method1126(true);
                            var4 += field2229[var16].field2168;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var10 == -1) {
                    if (var14 != -1) {
                        var6.method1116(var14, 2);
                        var4 += this.method704(var14);
                    }
                    if (var14 == 32) {
                        var7 = var6.method1119(-10511);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var7 >= 0) {
                        arg2[var11++] = var6.method1105(var5, (byte) -7, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                    }
                    if (var14 == 45) {
                        var7 = var6.method1119(-10511);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method1119(-10511) > var5) {
            arg2[var11++] = var6.method1105(var5, (byte) -7, var6.method1119(-10511));
        }
        return var11;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)I")
    private final int method704(int arg0) {
        return this.field2222[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V")
    public static void method705() {
        field2220 = null;
        field2240 = null;
        field2233 = null;
        field2245 = null;
        field2235 = null;
        field2247 = null;
        field2244 = null;
        field2248 = null;
        field2242 = null;
        field2215 = null;
        field2214 = null;
        field2231 = null;
        field2226 = null;
        field2219 = null;
        field2232 = null;
        field2213 = null;
        field2236 = null;
        field2230 = null;
        field2224 = null;
        field2229 = null;
        field2246 = null;
        field2250 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;)I")
    public final int method706(class136 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.field3183; var4++) {
            int var5 = arg0.field3182[var4] & 0xFF;
            if (var5 == 60) {
                var2 = var4;
            } else if (var5 == 62 && var2 != -1) {
                class136 var6 = arg0.method1105(var2 + 1, (byte) -7, var4);
                var2 = -1;
                if (var6.method1114(0, field2220)) {
                    var3 += this.field2222[60];
                } else if (var6.method1114(0, field2240)) {
                    var3 += this.field2222[62];
                } else if (var6.method1120(field2233, 0)) {
                    try {
                        int var7 = var6.method1108(4, -16621).method1126(true);
                        var3 += field2229[var7].field2168;
                    } catch (Exception var8) {
                    }
                }
            } else if (var2 == -1) {
                var3 += this.field2222[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;IIIII)V")
    public final void method707(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method718(arg3, arg4);
        int[] var7 = new int[arg0.field3183];
        int[] var8 = new int[arg0.field3183];
        for (int var9 = 0; var9 < arg0.field3183; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method710(arg0, arg1 - this.method706(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;I)V")
    private final void method708(class136 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method1119(-10511); var5++) {
            int var6 = arg0.method1094(false, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field2234 = (arg1 - this.method706(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ltd;IIII)V")
    public final void method709(class136 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method718(arg3, arg4);
            this.method711(arg0, arg1 - this.method706(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;II[I[I)V")
    private final void method710(class136 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2225;
        int var7 = -1;
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field3183; var9++) {
            int var10 = arg0.field3182[var9] & 0xFF;
            if (var10 == 60) {
                var7 = var9;
            } else {
                if (var10 == 62 && var7 != -1) {
                    class136 var11 = arg0.method1105(var7 + 1, (byte) -7, var9);
                    var7 = -1;
                    if (var11.method1114(0, field2220)) {
                        var10 = 60;
                    } else {
                        if (!var11.method1114(0, field2240)) {
                            if (var11.method1120(field2233, 0)) {
                                try {
                                    int var12;
                                    if (arg3 == null) {
                                        var12 = 0;
                                    } else {
                                        var12 = arg3[var8];
                                    }
                                    int var13;
                                    if (arg4 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg4[var8];
                                    }
                                    var8++;
                                    int var14 = var11.method1108(4, -16621).method1126(true);
                                    class92 var15 = field2229[var14];
                                    var15.method693(arg1 + var12, this.field2225 + var6 - var15.field2164 + var13);
                                    arg1 += var15.field2168;
                                } catch (Exception var20) {
                                }
                            } else {
                                this.method719(var11);
                            }
                            continue;
                        }
                        var10 = 62;
                    }
                }
                if (var7 == -1) {
                    int var16 = this.field2222[var10];
                    int var17 = this.field2216[var10];
                    int var18;
                    if (arg3 == null) {
                        var18 = 0;
                    } else {
                        var18 = arg3[var8];
                    }
                    int var19;
                    if (arg4 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg4[var8];
                    }
                    var8++;
                    if (var10 == 32) {
                        if (field2234 > 0) {
                            field2218 += field2234;
                            arg1 += field2218 >> 8;
                            field2218 &= 0xFF;
                        }
                    } else if (field2228 == 256) {
                        if (field2238 != -1) {
                            method701(this.field2243[var10], arg1 + var18 + 1, this.field2221[var10] + var6 + 1 + var19, var16, var17, field2238);
                        }
                        method701(this.field2243[var10], arg1 + var18, this.field2221[var10] + var6 + var19, var16, var17, field2217);
                    } else {
                        if (field2238 != -1) {
                            method720(this.field2243[var10], arg1 + var18 + 1, this.field2221[var10] + var6 + 1 + var19, var16, var17, field2238, field2228);
                        }
                        method720(this.field2243[var10], arg1 + var18, this.field2221[var10] + var6 + var19, var16, var17, field2217, field2228);
                    }
                    if (field2223 != -1) {
                        class114.method900(arg1, (int) ((double) this.field2225 * 0.7D) + var6, var16, field2223);
                    }
                    if (field2249 != -1) {
                        class114.method900(arg1, this.field2225 + var6, var16, field2249);
                    }
                    arg1 += var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;II)V")
    private final void method711(class136 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2225;
        int var5 = -1;
        for (int var6 = 0; var6 < arg0.field3183; var6++) {
            int var7 = arg0.field3182[var6] & 0xFF;
            if (var7 == 60) {
                var5 = var6;
            } else {
                if (var7 == 62 && var5 != -1) {
                    class136 var8 = arg0.method1105(var5 + 1, (byte) -7, var6);
                    var5 = -1;
                    if (var8.method1114(0, field2220)) {
                        var7 = 60;
                    } else {
                        if (!var8.method1114(0, field2240)) {
                            if (var8.method1120(field2233, 0)) {
                                try {
                                    int var9 = var8.method1108(4, -16621).method1126(true);
                                    class92 var10 = field2229[var9];
                                    var10.method693(arg1, this.field2225 + var4 - var10.field2164);
                                    arg1 += var10.field2168;
                                } catch (Exception var13) {
                                }
                            } else {
                                this.method719(var8);
                            }
                            continue;
                        }
                        var7 = 62;
                    }
                }
                if (var5 == -1) {
                    int var11 = this.field2222[var7];
                    int var12 = this.field2216[var7];
                    if (var7 == 32) {
                        if (field2234 > 0) {
                            field2218 += field2234;
                            arg1 += field2218 >> 8;
                            field2218 &= 0xFF;
                        }
                    } else if (field2228 == 256) {
                        if (field2238 != -1) {
                            method701(this.field2243[var7], arg1 + 1, this.field2221[var7] + var4 + 1, var11, var12, field2238);
                        }
                        method701(this.field2243[var7], arg1, this.field2221[var7] + var4, var11, var12, field2217);
                    } else {
                        if (field2238 != -1) {
                            method720(this.field2243[var7], arg1 + 1, this.field2221[var7] + var4 + 1, var11, var12, field2238, field2228);
                        }
                        method720(this.field2243[var7], arg1, this.field2221[var7] + var4, var11, var12, field2217, field2228);
                    }
                    if (field2223 != -1) {
                        class114.method900(arg1, (int) ((double) this.field2225 * 0.7D) + var4, var11, field2223);
                    }
                    if (field2249 != -1) {
                        class114.method900(arg1, this.field2225 + var4 + 1, var11, field2249);
                    }
                    arg1 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ltd;IIIII)V")
    public final void method712(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method718(arg3, arg4);
        int[] var7 = new int[arg0.field3183];
        for (int var8 = 0; var8 < arg0.field3183; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method710(arg0, arg1 - this.method706(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;IIIIII)V")
    public final void method713(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method718(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field3183];
        for (int var11 = 0; var11 < arg0.field3183; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method710(arg0, arg1 - this.method706(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ltd;I)I")
    public final int method714(class136 arg0, int arg1) {
        int var3 = this.method703(arg0, new int[] { arg1 }, field2250);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method706(field2250[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method715(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method716(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ltd;)Ltd;")
    public static final class136 method717(class136 arg0) {
        int var1 = arg0.method1119(-10511);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field3182[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class136 var4 = new class136();
        var4.field3183 = var1 + var2;
        var4.field3182 = new byte[var4.field3183];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field3182[var6];
            if (var7 == 60) {
                var4.field3182[var5++] = 60;
                var4.field3182[var5++] = 108;
                var4.field3182[var5++] = 116;
                var4.field3182[var5++] = 62;
            } else if (var7 == 62) {
                var4.field3182[var5++] = 60;
                var4.field3182[var5++] = 103;
                var4.field3182[var5++] = 116;
                var4.field3182[var5++] = 62;
            } else {
                var4.field3182[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    private final void method718(int arg0, int arg1) {
        field2223 = -1;
        field2249 = -1;
        field2227 = arg1;
        field2238 = arg1;
        field2239 = arg0;
        field2217 = arg0;
        field2228 = 256;
        field2234 = 0;
        field2218 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Ltd;)V")
    private final void method719(class136 arg0) {
        try {
            if (arg0.method1120(field2235, 0)) {
                field2217 = arg0.method1108(4, -16621).method1122(97, 16);
                return;
            }
            if (arg0.method1114(0, field2247)) {
                field2217 = field2239;
                return;
            }
            if (arg0.method1120(field2236, 0)) {
                field2223 = arg0.method1108(4, -16621).method1122(97, 16);
                return;
            }
            if (arg0.method1114(0, field2230)) {
                field2223 = 8388608;
                return;
            }
            if (arg0.method1114(0, field2224)) {
                field2223 = -1;
                return;
            }
            if (!arg0.method1114(0, field2244) && !arg0.method1114(0, field2248) && !arg0.method1114(0, field2242) && !arg0.method1114(0, field2215)) {
                if (arg0.method1120(field2214, 0)) {
                    field2249 = arg0.method1108(2, -16621).method1122(97, 16);
                    return;
                }
                if (arg0.method1114(0, field2231)) {
                    field2249 = 0;
                    return;
                }
                if (arg0.method1114(0, field2226)) {
                    field2249 = -1;
                    return;
                }
                if (arg0.method1120(field2219, 0)) {
                    field2238 = arg0.method1108(5, -16621).method1122(97, 16);
                    return;
                }
                if (arg0.method1114(0, field2232)) {
                    field2238 = 0;
                    return;
                }
                if (arg0.method1114(0, field2213)) {
                    field2238 = field2227;
                    return;
                }
                if (arg0.method1114(0, field2245)) {
                    this.method718(field2239, field2227);
                    return;
                }
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BIIIIII)V")
    private static final void method720(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class114.field2634 * arg2 + arg1;
        int var8 = class114.field2634 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class114.field2635) {
            int var11 = class114.field2635 - arg2;
            arg4 -= var11;
            arg2 = class114.field2635;
            var10 += arg3 * var11;
            var7 += class114.field2634 * var11;
        }
        if (arg2 + arg4 > class114.field2633) {
            arg4 -= arg2 + arg4 - class114.field2633;
        }
        if (arg1 < class114.field2629) {
            int var12 = class114.field2629 - arg1;
            arg3 -= var12;
            arg1 = class114.field2629;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class114.field2631) {
            int var13 = arg1 + arg3 - class114.field2631;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method715(class114.field2632, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Ltd;IIIII)V")
    public final void method721(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method718(arg3, arg4);
        field2246.setSeed((long) arg5);
        field2228 = (field2246.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field3183];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field3183; var9++) {
            var7[var9] = var8;
            if ((field2246.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method710(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Ltd;I)I")
    public final int method722(class136 arg0, int arg1) {
        return this.method703(arg0, new int[] { arg1 }, field2250);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltd;IIIIIIIII)V")
    public final void method723(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        this.method718(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2225;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2241 + this.field2237 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method703(arg0, var11, field2250);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2237 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2237 - this.field2241 - (var12 - 1) * arg9) / 2 + this.field2237 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2241 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2237 - this.field2241 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2237 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method711(field2250[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method711(field2250[var15], arg1 + (arg3 - this.method706(field2250[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method711(field2250[var15], arg1 + arg3 - this.method706(field2250[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method711(field2250[var15], arg1, var13);
            } else {
                this.method708(field2250[var15], arg3);
                this.method711(field2250[var15], arg1, var13);
                field2234 = 0;
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Ltd;IIII)V")
    public final void method724(class136 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method718(arg3, arg4);
            this.method711(arg0, arg1 - this.method706(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class95(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field2221 = arg0;
        this.field2222 = arg1;
        this.field2216 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field2243 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2221[var10] < var8 && this.field2216[var10] != 0) {
                var8 = this.field2221[var10];
            }
            if (this.field2221[var10] + this.field2216[var10] > var9) {
                var9 = this.field2221[var10] + this.field2216[var10];
            }
            byte[] var11 = this.field2243[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field2225 = this.field2221[32] + this.field2216[32];
        this.field2237 = this.field2225 - var8;
        this.field2241 = var9 - this.field2225;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    public class95(byte[] arg0) {
        this.field2222 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field2222.length; var2++) {
            this.field2222[var2] = arg0[var2] & 0xFF;
        }
    }
}
