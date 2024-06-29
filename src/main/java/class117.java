import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class117 extends class130 {

    @OriginalMember(owner = "client!n", name = "rb", descriptor = "[[B")
    public byte[][] field2171 = new byte[256][];

    @OriginalMember(owner = "client!n", name = "mb", descriptor = "I")
    public int field2166 = 0;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "[I")
    private int[] field2154;

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "[I")
    private int[] field2162;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "[I")
    private int[] field2155;

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "[I")
    private int[] field2161;

    @OriginalMember(owner = "client!n", name = "yb", descriptor = "I")
    private int field2178;

    @OriginalMember(owner = "client!n", name = "sb", descriptor = "I")
    private int field2172;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "I")
    private static int field2157 = -1;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "Lsg;")
    private static class169 field2156 = class165.method1060(")4shad", 1536);

    @OriginalMember(owner = "client!n", name = "X", descriptor = "Lsg;")
    private static class169 field2151 = class165.method1060(")4u", 1536);

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "Lsg;")
    private static class169 field2160 = class165.method1060("str=", 1536);

    @OriginalMember(owner = "client!n", name = "qb", descriptor = "I")
    private static int field2170 = 0;

    @OriginalMember(owner = "client!n", name = "pb", descriptor = "Lsg;")
    private static class169 field2169 = class165.method1060("u", 1536);

    @OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
    private static int field2164 = 256;

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "I")
    private static int field2163 = 0;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "Lsg;")
    private static class169 field2153 = class165.method1060("gt", 1536);

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "Lsg;")
    private static class169 field2152 = class165.method1060("lt", 1536);

    @OriginalMember(owner = "client!n", name = "vb", descriptor = "[Lsg;")
    private static class169[] field2175 = new class169[100];

    @OriginalMember(owner = "client!n", name = "ub", descriptor = "I")
    private static int field2174 = 256;

    @OriginalMember(owner = "client!n", name = "wb", descriptor = "Lsg;")
    private static class169 field2176 = class165.method1060("shad", 1536);

    @OriginalMember(owner = "client!n", name = "zb", descriptor = "I")
    private static int field2179 = -1;

    @OriginalMember(owner = "client!n", name = "ob", descriptor = "Lsg;")
    private static class169 field2168 = class165.method1060("col=", 1536);

    @OriginalMember(owner = "client!n", name = "W", descriptor = "Lsg;")
    private static class169 field2150 = class165.method1060("br", 1536);

    @OriginalMember(owner = "client!n", name = "Bb", descriptor = "I")
    private static int field2181 = 0;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
    private static int field2159 = -1;

    @OriginalMember(owner = "client!n", name = "Cb", descriptor = "Lsg;")
    private static class169 field2182 = class165.method1060("str", 1536);

    @OriginalMember(owner = "client!n", name = "xb", descriptor = "Lsg;")
    private static class169 field2177 = class165.method1060(")4str", 1536);

    @OriginalMember(owner = "client!n", name = "lb", descriptor = "Lsg;")
    private static class169 field2165 = class165.method1060("img=", 1536);

    @OriginalMember(owner = "client!n", name = "nb", descriptor = "Lsg;")
    private static class169 field2167 = class165.method1060(")4col", 1536);

    @OriginalMember(owner = "client!n", name = "Eb", descriptor = "Lsg;")
    private static class169 field2184 = class165.method1060("u=", 1536);

    @OriginalMember(owner = "client!n", name = "Fb", descriptor = "I")
    private static int field2185 = 0;

    @OriginalMember(owner = "client!n", name = "Db", descriptor = "Lsg;")
    private static class169 field2183 = class165.method1060("shad=", 1536);

    @OriginalMember(owner = "client!n", name = "Ab", descriptor = "I")
    private static int field2180 = -1;

    @OriginalMember(owner = "client!n", name = "Gb", descriptor = "[B")
    private byte[] field2186;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "[I")
    private int[] field2158;

    @OriginalMember(owner = "client!n", name = "tb", descriptor = "[Lgd;")
    public static class59[] field2173;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;II[I[I)V")
    private final void method713(class169 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2166;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3253; var10++) {
            int var11 = arg0.field3248[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class169 var12 = arg0.method1132(var7 + 1, 107, var10);
                    var7 = -1;
                    if (var12.method1121(field2152, 75)) {
                        var11 = 60;
                    } else {
                        if (!var12.method1121(field2153, 74)) {
                            if (var12.method1124(field2165, 77)) {
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
                                    int var15 = var12.method1106(false, 4).method1123(false);
                                    class59 var16 = field2173[var15];
                                    if (field2164 == 256) {
                                        var16.method370(arg1 + var13, this.field2166 + var6 - var16.field1106 + var14);
                                    } else {
                                        var16.method371(arg1 + var13, this.field2166 + var6 - var16.field1106 + var14, field2164);
                                    }
                                    arg1 += var16.field1104;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method723(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field2186 != null && var8 != -1) {
                        arg1 += this.field2186[(var8 << 8) + var11];
                    }
                    int var17 = this.field2155[var11];
                    int var18 = this.field2161[var11];
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
                        if (field2181 > 0) {
                            field2170 += field2181;
                            arg1 += field2170 >> 8;
                            field2170 &= 0xFF;
                        }
                    } else if (field2164 == 256) {
                        if (field2159 != -1) {
                            this.method724(var11, this.field2154[var11] + arg1 + var19 + 1, this.field2162[var11] + var6 + 1 + var20, var17, var18, field2159);
                        }
                        this.method437(var11, this.field2154[var11] + arg1 + var19, this.field2162[var11] + var6 + var20, var17, var18, field2185);
                    } else {
                        if (field2159 != -1) {
                            this.method721(var11, this.field2154[var11] + arg1 + var19 + 1, this.field2162[var11] + var6 + 1 + var20, var17, var18, field2159, field2164);
                        }
                        this.method438(var11, this.field2154[var11] + arg1 + var19, this.field2162[var11] + var6 + var20, var17, var18, field2185, field2164);
                    }
                    int var21 = this.field2158[var11];
                    if (field2179 != -1) {
                        class130.method843(arg1, (int) ((double) this.field2166 * 0.7D) + var6, var21, field2179);
                    }
                    if (field2157 != -1) {
                        class130.method843(arg1, this.field2166 + var6, var21, field2157);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
    private final void method714(int arg0, int arg1) {
        field2179 = -1;
        field2157 = -1;
        field2180 = arg1;
        field2159 = arg1;
        field2163 = arg0;
        field2185 = arg0;
        field2174 = 256;
        field2164 = 256;
        field2181 = 0;
        field2170 = 0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;IIIIIIIIII)I")
    private final int method715(class169 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method719(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field2166;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field2178 + this.field2172 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method729(arg0, var12, field2175);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field2178 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field2178 - this.field2172 - (var13 - 1) * arg10) / 2 + this.field2178 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field2172 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field2178 - this.field2172 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field2178 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method716(field2175[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method716(field2175[var16], arg1 + (arg3 - this.method736(field2175[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method716(field2175[var16], arg1 + arg3 - this.method736(field2175[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method716(field2175[var16], arg1, var14);
            } else {
                this.method734(field2175[var16], arg3);
                this.method716(field2175[var16], arg1, var14);
                field2181 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;II)V")
    private final void method716(class169 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2166;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field3253; var7++) {
            int var8 = arg0.field3248[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class169 var9 = arg0.method1132(var5 + 1, 115, var7);
                    var5 = -1;
                    if (var9.method1121(field2152, 93)) {
                        var8 = 60;
                    } else {
                        if (!var9.method1121(field2153, 97)) {
                            if (var9.method1124(field2165, 52)) {
                                try {
                                    int var10 = var9.method1106(false, 4).method1123(false);
                                    class59 var11 = field2173[var10];
                                    if (field2164 == 256) {
                                        var11.method370(arg1, this.field2166 + var4 - var11.field1106);
                                    } else {
                                        var11.method371(arg1, this.field2166 + var4 - var11.field1106, field2164);
                                    }
                                    arg1 += var11.field1104;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method723(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field2186 != null && var6 != -1) {
                        arg1 += this.field2186[(var6 << 8) + var8];
                    }
                    int var12 = this.field2155[var8];
                    int var13 = this.field2161[var8];
                    if (var8 == 32) {
                        if (field2181 > 0) {
                            field2170 += field2181;
                            arg1 += field2170 >> 8;
                            field2170 &= 0xFF;
                        }
                    } else if (field2164 == 256) {
                        if (field2159 != -1) {
                            this.method724(var8, this.field2154[var8] + arg1 + 1, this.field2162[var8] + var4 + 1, var12, var13, field2159);
                        }
                        this.method437(var8, this.field2154[var8] + arg1, this.field2162[var8] + var4, var12, var13, field2185);
                    } else {
                        if (field2159 != -1) {
                            this.method721(var8, this.field2154[var8] + arg1 + 1, this.field2162[var8] + var4 + 1, var12, var13, field2159, field2164);
                        }
                        this.method438(var8, this.field2154[var8] + arg1, this.field2162[var8] + var4, var12, var13, field2185, field2164);
                    }
                    int var14 = this.field2158[var8];
                    if (field2179 != -1) {
                        class130.method843(arg1, (int) ((double) this.field2166 * 0.7D) + var4, var14, field2179);
                    }
                    if (field2157 != -1) {
                        class130.method843(arg1, this.field2166 + var4 + 1, var14, field2157);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;IIII)V")
    public final void method717(class169 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method714(arg3, arg4);
            this.method716(arg0, arg1 - this.method736(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lsg;IIII)V")
    public final void method718(class169 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method714(arg3, arg4);
            this.method716(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    private final void method719(int arg0, int arg1, int arg2) {
        field2179 = -1;
        field2157 = -1;
        field2180 = arg1;
        field2159 = arg1;
        field2163 = arg0;
        field2185 = arg0;
        field2174 = arg2;
        field2164 = arg2;
        field2181 = 0;
        field2170 = 0;
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)I")
    private final int method720(int arg0) {
        return this.field2158[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)V")
    private final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class130.field2424 * arg2 + arg1;
        int var9 = class130.field2424 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class130.field2425) {
            int var12 = class130.field2425 - arg2;
            arg4 -= var12;
            arg2 = class130.field2425;
            var11 += arg3 * var12;
            var8 += class130.field2424 * var12;
        }
        if (arg2 + arg4 > class130.field2428) {
            arg4 -= arg2 + arg4 - class130.field2428;
        }
        if (arg1 < class130.field2422) {
            int var13 = class130.field2422 - arg1;
            arg3 -= var13;
            arg1 = class130.field2422;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class130.field2423) {
            int var14 = arg1 + arg3 - class130.field2423;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method731(class130.field2426, this.field2171[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;IIIII)V")
    public final void method722(class169 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method714(arg3, arg4);
        int[] var7 = new int[arg0.field3253];
        for (int var8 = 0; var8 < arg0.field3253; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method713(arg0, arg1 - this.method736(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(IIIIII)V")
    public abstract void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;)V")
    private final void method723(class169 arg0) {
        try {
            if (arg0.method1124(field2168, 67)) {
                field2185 = arg0.method1106(false, 4).method1125(16, 87);
                return;
            }
            if (arg0.method1121(field2167, 108)) {
                field2185 = field2163;
                return;
            }
            if (arg0.method1124(field2160, 69)) {
                field2179 = arg0.method1106(false, 4).method1125(16, 87);
                return;
            }
            if (arg0.method1121(field2182, 88)) {
                field2179 = 8388608;
                return;
            }
            if (arg0.method1121(field2177, 81)) {
                field2179 = -1;
                return;
            }
            if (arg0.method1124(field2184, 80)) {
                field2157 = arg0.method1106(false, 2).method1125(16, 87);
                return;
            }
            if (arg0.method1121(field2169, 99)) {
                field2157 = 0;
                return;
            }
            if (arg0.method1121(field2151, 104)) {
                field2157 = -1;
                return;
            }
            if (arg0.method1124(field2183, 92)) {
                field2159 = arg0.method1106(false, 5).method1125(16, 87);
                return;
            }
            if (arg0.method1121(field2176, 120)) {
                field2159 = 0;
                return;
            }
            if (arg0.method1121(field2156, 90)) {
                field2159 = field2180;
                return;
            }
            if (arg0.method1121(field2150, 78)) {
                this.method719(field2163, field2180, field2174);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(IIIIII)V")
    private final void method724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class130.field2424 * arg2 + arg1;
        int var8 = class130.field2424 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class130.field2425) {
            int var11 = class130.field2425 - arg2;
            arg4 -= var11;
            arg2 = class130.field2425;
            var10 += arg3 * var11;
            var7 += class130.field2424 * var11;
        }
        if (arg2 + arg4 > class130.field2428) {
            arg4 -= arg2 + arg4 - class130.field2428;
        }
        if (arg1 < class130.field2422) {
            int var12 = class130.field2422 - arg1;
            arg3 -= var12;
            arg1 = class130.field2422;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class130.field2423) {
            int var13 = arg1 + arg3 - class130.field2423;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method728(class130.field2426, this.field2171[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;I)I")
    public final int method725(class169 arg0, int arg1) {
        int var3 = this.method729(arg0, new int[] { arg1 }, field2175);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method736(field2175[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lsg;IIIII)V")
    public final void method726(class169 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method714(arg3, arg4);
        int[] var7 = new int[arg0.field3253];
        int[] var8 = new int[arg0.field3253];
        for (int var9 = 0; var9 < arg0.field3253; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method713(arg0, arg1 - this.method736(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(Lsg;IIII)V")
    public final void method727(class169 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method714(arg3, arg4);
            this.method716(arg0, arg1 - this.method736(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method728(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;[I[Lsg;)I")
    private final int method729(class169 arg0, int[] arg1, class169[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class169 var6 = class103.method604((byte) 120, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method1134(0);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method1128(255, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class169 var16 = arg0.method1132(var10 + 1, 113, var14);
                    var10 = -1;
                    var6.method1140(127, 60);
                    var6.method1105(var16, true);
                    var6.method1140(99, 62);
                    if (var16.method1121(field2150, 114)) {
                        arg2[var12++] = var6.method1132(var5, 125, var6.method1134(0));
                        var5 = var6.method1134(0);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method1121(field2152, 97)) {
                        var4 += this.method720(60);
                        if (this.field2186 != null && var11 != -1) {
                            var4 += this.field2186[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method1121(field2153, 92)) {
                        var4 += this.method720(62);
                        if (this.field2186 != null && var11 != -1) {
                            var4 += this.field2186[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method1124(field2165, 56)) {
                        try {
                            int var17 = var16.method1106(false, 4).method1123(false);
                            var4 += field2173[var17].field1104;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method1140(105, var15);
                        var4 += this.method720(var15);
                        if (this.field2186 != null && var11 != -1) {
                            var4 += this.field2186[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method1134(0);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method1132(var5, 117, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method1134(0);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method1134(0) > var5) {
            arg2[var12++] = var6.method1132(var5, 121, var6.method1134(0));
        }
        return var12;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;IIIILjava/util/Random;I)I")
    public final int method730(class169 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method719(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field3253];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3253; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method713(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method731(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;IIIIIIIII)I")
    public final int method732(class169 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method715(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method733(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lsg;I)V")
    private final void method734(class169 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method1134(0); var5++) {
            int var6 = arg0.method1128(255, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field2181 = (arg1 - this.method736(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()V")
    public static void method735() {
        field2152 = null;
        field2153 = null;
        field2165 = null;
        field2150 = null;
        field2168 = null;
        field2167 = null;
        field2184 = null;
        field2169 = null;
        field2151 = null;
        field2183 = null;
        field2176 = null;
        field2156 = null;
        field2160 = null;
        field2182 = null;
        field2177 = null;
        field2173 = null;
        field2175 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lsg;)I")
    public final int method736(class169 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field3253; var5++) {
            int var6 = arg0.field3248[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class169 var7 = arg0.method1132(var2 + 1, 125, var5);
                    var2 = -1;
                    if (var7.method1121(field2152, 84)) {
                        var6 = 60;
                    } else {
                        if (!var7.method1121(field2153, 73)) {
                            if (var7.method1124(field2165, 99)) {
                                try {
                                    int var8 = var7.method1106(false, 4).method1123(false);
                                    var4 += field2173[var8].field1104;
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
                    var4 += this.field2158[var6];
                    if (this.field2186 != null && var3 != -1) {
                        var4 += this.field2186[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([B)V")
    private final void method737(byte[] arg0) {
        this.field2158 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2158.length; var2++) {
                this.field2158[var2] = arg0[var2] & 0xFF;
            }
            this.field2166 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2158[var4] = arg0[var3++] & 0xFF;
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
        this.field2186 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field2186[(var13 << 8) + var14] = (byte) method733(var9, var11, var6, this.field2158, var5, var13, var14);
                    }
                }
            }
        }
        this.field2166 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(Lsg;I)I")
    public final int method738(class169 arg0, int arg1) {
        return this.method729(arg0, new int[] { arg1 }, field2175);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(Lsg;)Lsg;")
    public static final class169 method739(class169 arg0) {
        int var1 = arg0.method1134(0);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field3248[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class169 var4 = new class169();
        var4.field3253 = var1 + var2;
        var4.field3248 = new byte[var4.field3253];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field3248[var6];
            if (var7 == 60) {
                var4.field3248[var5++] = 60;
                var4.field3248[var5++] = 108;
                var4.field3248[var5++] = 116;
                var4.field3248[var5++] = 62;
            } else if (var7 == 62) {
                var4.field3248[var5++] = 60;
                var4.field3248[var5++] = 103;
                var4.field3248[var5++] = 116;
                var4.field3248[var5++] = 62;
            } else {
                var4.field3248[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsg;IIIIII)V")
    public final void method740(class169 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method714(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field3253];
        for (int var11 = 0; var11 < arg0.field3253; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method713(arg0, arg1 - this.method736(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class117(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2154 = arg1;
        this.field2162 = arg2;
        this.field2155 = arg3;
        this.field2161 = arg4;
        this.method737(arg0);
        this.field2171 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2162[var10] < var8 && this.field2161[var10] != 0) {
                var8 = this.field2162[var10];
            }
            if (this.field2162[var10] + this.field2161[var10] > var9) {
                var9 = this.field2162[var10] + this.field2161[var10];
            }
        }
        this.field2178 = this.field2166 - var8;
        this.field2172 = var9 - this.field2166;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([B)V")
    public class117(byte[] arg0) {
        this.method737(arg0);
    }
}
