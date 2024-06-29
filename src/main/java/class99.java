import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class99 extends class141 {

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public int field2294 = 0;

    @OriginalMember(owner = "client!ob", name = "xb", descriptor = "[[B")
    private byte[][] field2313 = new byte[256][];

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "[I")
    private int[] field2287;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "[I")
    private int[] field2288;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "[I")
    private int[] field2286;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "[I")
    private int[] field2295;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    private int field2280;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    private int field2300;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "Lec;")
    private static class32 field2281 = class73.method594(")4u", true);

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    private static int field2283 = -1;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lec;")
    private static class32 field2284 = class73.method594("img=", true);

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lec;")
    private static class32 field2292 = class73.method594("lt", true);

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "Lec;")
    private static class32 field2285 = class73.method594("col=", true);

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lec;")
    private static class32 field2290 = class73.method594("shad=", true);

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "Lec;")
    private static class32 field2296 = class73.method594("u=", true);

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "I")
    private static int field2301 = -1;

    @OriginalMember(owner = "client!ob", name = "qb", descriptor = "I")
    private static int field2306 = 0;

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lec;")
    private static class32 field2302 = class73.method594(")4shad", true);

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "Lec;")
    private static class32 field2303 = class73.method594("str=", true);

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lec;")
    private static class32 field2299 = class73.method594("gt", true);

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "Lec;")
    private static class32 field2293 = class73.method594(")4str", true);

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "I")
    private static int field2304 = -1;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    private static int field2282 = 0;

    @OriginalMember(owner = "client!ob", name = "ub", descriptor = "Lec;")
    private static class32 field2310 = class73.method594("u", true);

    @OriginalMember(owner = "client!ob", name = "vb", descriptor = "Lec;")
    private static class32 field2311 = class73.method594("shad", true);

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    private static int field2289 = 0;

    @OriginalMember(owner = "client!ob", name = "tb", descriptor = "Lec;")
    private static class32 field2309 = class73.method594("str", true);

    @OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
    private static int field2307 = -1;

    @OriginalMember(owner = "client!ob", name = "yb", descriptor = "Lec;")
    private static class32 field2314 = class73.method594("br", true);

    @OriginalMember(owner = "client!ob", name = "pb", descriptor = "I")
    private static int field2305 = 256;

    @OriginalMember(owner = "client!ob", name = "wb", descriptor = "I")
    private static int field2312 = 0;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lec;")
    private static class32 field2297 = class73.method594(")4col", true);

    @OriginalMember(owner = "client!ob", name = "zb", descriptor = "Ljava/util/Random;")
    private static Random field2315 = new Random();

    @OriginalMember(owner = "client!ob", name = "Ab", descriptor = "[Lec;")
    private static class32[] field2316 = new class32[100];

    @OriginalMember(owner = "client!ob", name = "sb", descriptor = "[B")
    private byte[] field2308;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
    private int[] field2291;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "[Lhb;")
    public static class51[] field2298;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;IIIIIIIII)I")
    public final int method771(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method783(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2294;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2300 + this.field2280 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method784(arg0, var11, field2316);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2280 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2280 - this.field2300 - (var12 - 1) * arg9) / 2 + this.field2280 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2300 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2280 - this.field2300 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2280 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method788(field2316[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method788(field2316[var15], arg1 + (arg3 - this.method772(field2316[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method788(field2316[var15], arg1 + arg3 - this.method772(field2316[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method788(field2316[var15], arg1, var13);
            } else {
                this.method775(field2316[var15], arg3);
                this.method788(field2316[var15], arg1, var13);
                field2282 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;)I")
    public final int method772(class32 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field674; var5++) {
            int var6 = arg0.field618[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class32 var7 = arg0.method241((byte) -127, var2 + 1, var5);
                    var2 = -1;
                    if (var7.method272(true, field2292)) {
                        var6 = 60;
                    } else {
                        if (!var7.method272(true, field2299)) {
                            if (var7.method262(field2284, true)) {
                                try {
                                    int var8 = var7.method268((byte) -82, 4).method261(-127);
                                    var4 += field2298[var8].field1170;
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
                    var4 += this.field2291[var6];
                    if (this.field2308 != null && var3 != -1) {
                        var4 += this.field2308[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lec;)Lec;")
    public static final class32 method773(class32 arg0) {
        int var1 = arg0.method240((byte) 99);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field618[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class32 var4 = new class32();
        var4.field674 = var1 + var2;
        var4.field618 = new byte[var4.field674];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field618[var6];
            if (var7 == 60) {
                var4.field618[var5++] = 60;
                var4.field618[var5++] = 108;
                var4.field618[var5++] = 116;
                var4.field618[var5++] = 62;
            } else if (var7 == 62) {
                var4.field618[var5++] = 60;
                var4.field618[var5++] = 103;
                var4.field618[var5++] = 116;
                var4.field618[var5++] = 62;
            } else {
                var4.field618[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIII)V")
    private static final void method774(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class141.field3242 * arg2 + arg1;
        int var7 = class141.field3242 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class141.field3238) {
            int var10 = class141.field3238 - arg2;
            arg4 -= var10;
            arg2 = class141.field3238;
            var9 += arg3 * var10;
            var6 += class141.field3242 * var10;
        }
        if (arg2 + arg4 > class141.field3241) {
            arg4 -= arg2 + arg4 - class141.field3241;
        }
        if (arg1 < class141.field3240) {
            int var11 = class141.field3240 - arg1;
            arg3 -= var11;
            arg1 = class141.field3240;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class141.field3243) {
            int var12 = arg1 + arg3 - class141.field3243;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method794(class141.field3239, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;I)V")
    private final void method775(class32 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method240((byte) 114); var5++) {
            int var6 = arg0.method260(-122, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field2282 = (arg1 - this.method772(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIIII)V")
    public abstract void method752(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([B)V")
    private final void method776(byte[] arg0) {
        this.field2291 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2291.length; var2++) {
                this.field2291[var2] = arg0[var2] & 0xFF;
            }
            this.field2294 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2291[var4] = arg0[var3++] & 0xFF;
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
        this.field2308 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field2308[(var13 << 8) + var14] = (byte) method796(var9, var11, var6, this.field2291, var5, var13, var14);
                    }
                }
            }
        }
        this.field2294 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lec;I)I")
    public final int method777(class32 arg0, int arg1) {
        return this.method784(arg0, new int[] { arg1 }, field2316);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)I")
    private final int method778(int arg0) {
        return this.field2291[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;IIII)V")
    public final void method779(class32 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method783(arg3, arg4);
            this.method788(arg0, arg1 - this.method772(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method780(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;IIIII)V")
    public final void method781(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method783(arg3, arg4);
        field2315.setSeed((long) arg5);
        field2305 = (field2315.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field674];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field674; var9++) {
            var7[var9] = var8;
            if ((field2315.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method782(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;II[I[I)V")
    private final void method782(class32 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2294;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field674; var10++) {
            int var11 = arg0.field618[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class32 var12 = arg0.method241((byte) 2, var7 + 1, var10);
                    var7 = -1;
                    if (var12.method272(true, field2292)) {
                        var11 = 60;
                    } else {
                        if (!var12.method272(true, field2299)) {
                            if (var12.method262(field2284, true)) {
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
                                    int var15 = var12.method268((byte) -74, 4).method261(-121);
                                    class51 var16 = field2298[var15];
                                    var16.method400(arg1 + var13, this.field2294 + var6 - var16.field1169 + var14);
                                    arg1 += var16.field1170;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method786(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field2308 != null && var8 != -1) {
                        arg1 += this.field2308[(var8 << 8) + var11];
                    }
                    int var17 = this.field2286[var11];
                    int var18 = this.field2295[var11];
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
                        if (field2282 > 0) {
                            field2306 += field2282;
                            arg1 += field2306 >> 8;
                            field2306 &= 0xFF;
                        }
                    } else if (field2305 == 256) {
                        if (field2283 != -1) {
                            method774(this.field2313[var11], this.field2287[var11] + arg1 + var19 + 1, this.field2288[var11] + var6 + 1 + var20, var17, var18, field2283);
                        }
                        this.method751(this.field2313[var11], this.field2287[var11] + arg1 + var19, this.field2288[var11] + var6 + var20, var17, var18, field2312);
                    } else {
                        if (field2283 != -1) {
                            method787(this.field2313[var11], this.field2287[var11] + arg1 + var19 + 1, this.field2288[var11] + var6 + 1 + var20, var17, var18, field2283, field2305);
                        }
                        this.method752(this.field2313[var11], this.field2287[var11] + arg1 + var19, this.field2288[var11] + var6 + var20, var17, var18, field2312, field2305);
                    }
                    int var21 = this.field2291[var11];
                    if (field2304 != -1) {
                        class141.method1065(arg1, (int) ((double) this.field2294 * 0.7D) + var6, var21, field2304);
                    }
                    if (field2301 != -1) {
                        class141.method1065(arg1, this.field2294 + var6, var21, field2301);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V")
    private final void method783(int arg0, int arg1) {
        field2304 = -1;
        field2301 = -1;
        field2307 = arg1;
        field2283 = arg1;
        field2289 = arg0;
        field2312 = arg0;
        field2305 = 256;
        field2282 = 0;
        field2306 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;[I[Lec;)I")
    private final int method784(class32 arg0, int[] arg1, class32[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class32 var6 = class64.method492(true, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method240((byte) 49);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method260(-122, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class32 var16 = arg0.method241((byte) -117, var10 + 1, var14);
                    var10 = -1;
                    var6.method273(60, -5);
                    var6.method243(var16, (byte) 109);
                    var6.method273(62, -5);
                    if (var16.method272(true, field2314)) {
                        arg2[var12++] = var6.method241((byte) 106, var5, var6.method240((byte) 75));
                        var5 = var6.method240((byte) 37);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method272(true, field2292)) {
                        var4 += this.method778(60);
                        if (this.field2308 != null && var11 != -1) {
                            var4 += this.field2308[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method272(true, field2299)) {
                        var4 += this.method778(62);
                        if (this.field2308 != null && var11 != -1) {
                            var4 += this.field2308[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method262(field2284, true)) {
                        try {
                            int var17 = var16.method268((byte) -92, 4).method261(-121);
                            var4 += field2298[var17].field1170;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method273(var15, -5);
                        var4 += this.method778(var15);
                        if (this.field2308 != null && var11 != -1) {
                            var4 += this.field2308[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method240((byte) 61);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method241((byte) 26, var5, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method240((byte) 57);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method240((byte) 83) > var5) {
            arg2[var12++] = var6.method241((byte) 32, var5, var6.method240((byte) 67));
        }
        return var12;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lec;IIIII)V")
    public final void method785(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method783(arg3, arg4);
        int[] var7 = new int[arg0.field674];
        for (int var8 = 0; var8 < arg0.field674; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method782(arg0, arg1 - this.method772(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lec;)V")
    private final void method786(class32 arg0) {
        try {
            if (arg0.method262(field2285, true)) {
                field2312 = arg0.method268((byte) -30, 4).method256(false, 16);
                return;
            }
            if (arg0.method272(true, field2297)) {
                field2312 = field2289;
                return;
            }
            if (arg0.method262(field2303, true)) {
                field2304 = arg0.method268((byte) -75, 4).method256(false, 16);
                return;
            }
            if (arg0.method272(true, field2309)) {
                field2304 = 8388608;
                return;
            }
            if (arg0.method272(true, field2293)) {
                field2304 = -1;
                return;
            }
            if (arg0.method262(field2296, true)) {
                field2301 = arg0.method268((byte) -61, 2).method256(false, 16);
                return;
            }
            if (arg0.method272(true, field2310)) {
                field2301 = 0;
                return;
            }
            if (arg0.method272(true, field2281)) {
                field2301 = -1;
                return;
            }
            if (arg0.method262(field2290, true)) {
                field2283 = arg0.method268((byte) -40, 5).method256(false, 16);
                return;
            }
            if (arg0.method272(true, field2311)) {
                field2283 = 0;
                return;
            }
            if (arg0.method272(true, field2302)) {
                field2283 = field2307;
                return;
            }
            if (arg0.method272(true, field2314)) {
                this.method783(field2289, field2307);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "([BIIIIII)V")
    private static final void method787(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class141.field3242 * arg2 + arg1;
        int var8 = class141.field3242 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class141.field3238) {
            int var11 = class141.field3238 - arg2;
            arg4 -= var11;
            arg2 = class141.field3238;
            var10 += arg3 * var11;
            var7 += class141.field3242 * var11;
        }
        if (arg2 + arg4 > class141.field3241) {
            arg4 -= arg2 + arg4 - class141.field3241;
        }
        if (arg1 < class141.field3240) {
            int var12 = class141.field3240 - arg1;
            arg3 -= var12;
            arg1 = class141.field3240;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class141.field3243) {
            int var13 = arg1 + arg3 - class141.field3243;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method780(class141.field3239, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;II)V")
    private final void method788(class32 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2294;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field674; var7++) {
            int var8 = arg0.field618[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class32 var9 = arg0.method241((byte) -128, var5 + 1, var7);
                    var5 = -1;
                    if (var9.method272(true, field2292)) {
                        var8 = 60;
                    } else {
                        if (!var9.method272(true, field2299)) {
                            if (var9.method262(field2284, true)) {
                                try {
                                    int var10 = var9.method268((byte) -12, 4).method261(-101);
                                    class51 var11 = field2298[var10];
                                    var11.method400(arg1, this.field2294 + var4 - var11.field1169);
                                    arg1 += var11.field1170;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method786(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field2308 != null && var6 != -1) {
                        arg1 += this.field2308[(var6 << 8) + var8];
                    }
                    int var12 = this.field2286[var8];
                    int var13 = this.field2295[var8];
                    if (var8 == 32) {
                        if (field2282 > 0) {
                            field2306 += field2282;
                            arg1 += field2306 >> 8;
                            field2306 &= 0xFF;
                        }
                    } else if (field2305 == 256) {
                        if (field2283 != -1) {
                            method774(this.field2313[var8], this.field2287[var8] + arg1 + 1, this.field2288[var8] + var4 + 1, var12, var13, field2283);
                        }
                        this.method751(this.field2313[var8], this.field2287[var8] + arg1, this.field2288[var8] + var4, var12, var13, field2312);
                    } else {
                        if (field2283 != -1) {
                            method787(this.field2313[var8], this.field2287[var8] + arg1 + 1, this.field2288[var8] + var4 + 1, var12, var13, field2283, field2305);
                        }
                        this.method752(this.field2313[var8], this.field2287[var8] + arg1, this.field2288[var8] + var4, var12, var13, field2312, field2305);
                    }
                    int var14 = this.field2291[var8];
                    if (field2304 != -1) {
                        class141.method1065(arg1, (int) ((double) this.field2294 * 0.7D) + var4, var14, field2304);
                    }
                    if (field2301 != -1) {
                        class141.method1065(arg1, this.field2294 + var4 + 1, var14, field2301);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "([BIIIII)V")
    public abstract void method751(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lec;IIIII)V")
    public final void method789(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method783(arg3, arg4);
        int[] var7 = new int[arg0.field674];
        int[] var8 = new int[arg0.field674];
        for (int var9 = 0; var9 < arg0.field674; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method782(arg0, arg1 - this.method772(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
    public static void method790() {
        field2292 = null;
        field2299 = null;
        field2284 = null;
        field2314 = null;
        field2285 = null;
        field2297 = null;
        field2296 = null;
        field2310 = null;
        field2281 = null;
        field2290 = null;
        field2311 = null;
        field2302 = null;
        field2303 = null;
        field2309 = null;
        field2293 = null;
        field2298 = null;
        field2315 = null;
        field2316 = null;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lec;I)I")
    public final int method791(class32 arg0, int arg1) {
        int var3 = this.method784(arg0, new int[] { arg1 }, field2316);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method772(field2316[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lec;IIIIII)V")
    public final void method792(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method783(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field674];
        for (int var11 = 0; var11 < arg0.field674; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method782(arg0, arg1 - this.method772(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lec;IIII)V")
    public final void method793(class32 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method783(arg3, arg4);
            this.method788(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method794(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lec;IIII)V")
    public final void method795(class32 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method783(arg3, arg4);
            this.method788(arg0, arg1 - this.method772(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class99(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2287 = arg1;
        this.field2288 = arg2;
        this.field2286 = arg3;
        this.field2295 = arg4;
        this.method776(arg0);
        this.field2313 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2288[var10] < var8 && this.field2295[var10] != 0) {
                var8 = this.field2288[var10];
            }
            if (this.field2295[var10] + this.field2288[var10] > var9) {
                var9 = this.field2295[var10] + this.field2288[var10];
            }
        }
        this.field2280 = this.field2294 - var8;
        this.field2300 = var9 - this.field2294;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
    public class99(byte[] arg0) {
        this.method776(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method796(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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
}
