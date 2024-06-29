import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 extends class19 {

    @OriginalMember(owner = "client!mf", name = "Cb", descriptor = "[[B")
    private byte[][] field2125 = new byte[256][];

    @OriginalMember(owner = "client!mf", name = "zb", descriptor = "I")
    public int field2122 = 0;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "[I")
    private int[] field2099;

    @OriginalMember(owner = "client!mf", name = "pb", descriptor = "[I")
    private int[] field2112;

    @OriginalMember(owner = "client!mf", name = "Hb", descriptor = "[I")
    private int[] field2130;

    @OriginalMember(owner = "client!mf", name = "sb", descriptor = "I")
    private int field2115;

    @OriginalMember(owner = "client!mf", name = "Eb", descriptor = "I")
    private int field2127;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lja;")
    private static class62 field2105 = class30.method243(43, ")4i");

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
    private static int field2107 = 0;

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "Lja;")
    private static class62 field2110 = class30.method243(43, ")4str");

    @OriginalMember(owner = "client!mf", name = "tb", descriptor = "Lja;")
    private static class62 field2116 = class30.method243(43, "u=");

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    private static int field2104 = -1;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "Lja;")
    private static class62 field2109 = class30.method243(43, "u");

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "Lja;")
    private static class62 field2111 = class30.method243(43, "img=");

    @OriginalMember(owner = "client!mf", name = "xb", descriptor = "I")
    private static int field2120 = 0;

    @OriginalMember(owner = "client!mf", name = "wb", descriptor = "I")
    private static int field2119 = -1;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "Lja;")
    private static class62 field2102 = class30.method243(43, "gt");

    @OriginalMember(owner = "client!mf", name = "Ab", descriptor = "Lja;")
    private static class62 field2123 = class30.method243(43, "shad=");

    @OriginalMember(owner = "client!mf", name = "rb", descriptor = "Lja;")
    private static class62 field2114 = class30.method243(43, "col=");

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lja;")
    private static class62 field2108 = class30.method243(43, "br");

    @OriginalMember(owner = "client!mf", name = "Gb", descriptor = "I")
    private static int field2129 = 256;

    @OriginalMember(owner = "client!mf", name = "qb", descriptor = "Lja;")
    private static class62 field2113 = class30.method243(43, "str=");

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "Lja;")
    private static class62 field2106 = class30.method243(43, "str");

    @OriginalMember(owner = "client!mf", name = "yb", descriptor = "Lja;")
    private static class62 field2121 = class30.method243(43, ")4shad");

    @OriginalMember(owner = "client!mf", name = "Db", descriptor = "I")
    private static int field2126 = 0;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "Lja;")
    private static class62 field2101 = class30.method243(43, "shad");

    @OriginalMember(owner = "client!mf", name = "vb", descriptor = "I")
    private static int field2118 = -1;

    @OriginalMember(owner = "client!mf", name = "Fb", descriptor = "Lja;")
    private static class62 field2128 = class30.method243(43, "b");

    @OriginalMember(owner = "client!mf", name = "Ib", descriptor = "Lja;")
    private static class62 field2131 = class30.method243(43, ")4u");

    @OriginalMember(owner = "client!mf", name = "Bb", descriptor = "Lja;")
    private static class62 field2124 = class30.method243(43, ")4col");

    @OriginalMember(owner = "client!mf", name = "Kb", descriptor = "I")
    private static int field2133 = -1;

    @OriginalMember(owner = "client!mf", name = "Jb", descriptor = "I")
    private static int field2132 = 0;

    @OriginalMember(owner = "client!mf", name = "Mb", descriptor = "Lja;")
    private static class62 field2135 = class30.method243(43, "i");

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "Lja;")
    private static class62 field2103 = class30.method243(43, ")4b");

    @OriginalMember(owner = "client!mf", name = "Lb", descriptor = "Lja;")
    private static class62 field2134 = class30.method243(43, "lt");

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "Ljava/util/Random;")
    private static Random field2100 = new Random();

    @OriginalMember(owner = "client!mf", name = "Nb", descriptor = "[Lja;")
    private static class62[] field2136 = new class62[100];

    @OriginalMember(owner = "client!mf", name = "ub", descriptor = "[Lq;")
    public static class114[] field2117;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;IIIIIIIII)V")
    public final void method677(class62 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        this.method695(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2122;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2127 + this.field2115 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method692(arg0, var11, field2136);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2115 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2115 - this.field2127 - (var12 - 1) * arg9) / 2 + this.field2115 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2127 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2115 - this.field2127 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2115 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method700(field2136[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method700(field2136[var15], arg1 + (arg3 - this.method681(field2136[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method700(field2136[var15], arg1 + arg3 - this.method681(field2136[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method700(field2136[var15], arg1, var13);
            } else {
                this.method686(field2136[var15], arg3);
                this.method700(field2136[var15], arg1, var13);
                field2132 = 0;
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;II[I[I)V")
    private final void method678(class62 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2122;
        int var7 = -1;
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1538; var9++) {
            int var10 = arg0.field1504[var9] & 0xFF;
            if (var10 == 60) {
                var7 = var9;
            } else {
                if (var10 == 62 && var7 != -1) {
                    class62 var11 = arg0.method445(var9, (byte) -93, var7 + 1);
                    var7 = -1;
                    if (var11.method475(97, field2134)) {
                        var10 = 60;
                    } else {
                        if (!var11.method475(35, field2102)) {
                            if (var11.method450(field2111, (byte) -100)) {
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
                                    int var14 = var11.method471((byte) -110, 4).method439((byte) 106);
                                    class114 var15 = field2117[var14];
                                    var15.method932(arg1 + var12, this.field2122 + var6 - var15.field2622 + var13);
                                    arg1 += var15.field2621;
                                } catch (Exception var20) {
                                }
                            } else {
                                this.method680(var11);
                            }
                            continue;
                        }
                        var10 = 62;
                    }
                }
                if (var7 == -1) {
                    int var16 = this.field2112[var10];
                    int var17 = this.field2130[var10];
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
                        if (field2132 > 0) {
                            field2107 += field2132;
                            arg1 += field2107 >> 8;
                            field2107 &= 0xFF;
                        }
                    } else if (field2129 == 256) {
                        if (field2118 != -1) {
                            method690(this.field2125[var10], arg1 + var18 + 1, this.field2099[var10] + var6 + 1 + var19, var16, var17, field2118);
                        }
                        method690(this.field2125[var10], arg1 + var18, this.field2099[var10] + var6 + var19, var16, var17, field2126);
                    } else {
                        if (field2118 != -1) {
                            method685(this.field2125[var10], arg1 + var18 + 1, this.field2099[var10] + var6 + 1 + var19, var16, var17, field2118, field2129);
                        }
                        method685(this.field2125[var10], arg1 + var18, this.field2099[var10] + var6 + var19, var16, var17, field2126, field2129);
                    }
                    if (field2119 != -1) {
                        class19.method130(arg1, (int) ((double) this.field2122 * 0.7D) + var6, var16, field2119);
                    }
                    if (field2133 != -1) {
                        class19.method130(arg1, this.field2122 + var6, var16, field2133);
                    }
                    arg1 += var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;)Lja;")
    public static final class62 method679(class62 arg0) {
        int var1 = arg0.method460((byte) 38);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field1504[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class62 var4 = new class62();
        var4.field1538 = var1 + var2;
        var4.field1504 = new byte[var4.field1538];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field1504[var6];
            if (var7 == 60) {
                var4.field1504[var5++] = 60;
                var4.field1504[var5++] = 108;
                var4.field1504[var5++] = 116;
                var4.field1504[var5++] = 62;
            } else if (var7 == 62) {
                var4.field1504[var5++] = 60;
                var4.field1504[var5++] = 103;
                var4.field1504[var5++] = 116;
                var4.field1504[var5++] = 62;
            } else {
                var4.field1504[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lja;)V")
    private final void method680(class62 arg0) {
        try {
            if (arg0.method450(field2114, (byte) -111)) {
                field2126 = arg0.method471((byte) -110, 4).method476(16, -37);
                return;
            }
            if (arg0.method475(84, field2124)) {
                field2126 = field2120;
                return;
            }
            if (arg0.method450(field2113, (byte) -76)) {
                field2119 = arg0.method471((byte) -110, 4).method476(16, -37);
                return;
            }
            if (arg0.method475(90, field2106)) {
                field2119 = 8388608;
                return;
            }
            if (arg0.method475(118, field2110)) {
                field2119 = -1;
                return;
            }
            if (!arg0.method475(65, field2128) && !arg0.method475(55, field2103) && !arg0.method475(73, field2135) && !arg0.method475(91, field2105)) {
                if (arg0.method450(field2116, (byte) -92)) {
                    field2133 = arg0.method471((byte) -110, 2).method476(16, -37);
                    return;
                }
                if (arg0.method475(33, field2109)) {
                    field2133 = 0;
                    return;
                }
                if (arg0.method475(25, field2131)) {
                    field2133 = -1;
                    return;
                }
                if (arg0.method450(field2123, (byte) -125)) {
                    field2118 = arg0.method471((byte) -110, 5).method476(16, -37);
                    return;
                }
                if (arg0.method475(25, field2101)) {
                    field2118 = 0;
                    return;
                }
                if (arg0.method475(88, field2121)) {
                    field2118 = field2104;
                    return;
                }
                if (arg0.method475(102, field2108)) {
                    this.method695(field2120, field2104);
                    return;
                }
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Lja;)I")
    public final int method681(class62 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.field1538; var4++) {
            int var5 = arg0.field1504[var4] & 0xFF;
            if (var5 == 60) {
                var2 = var4;
            } else if (var5 == 62 && var2 != -1) {
                class62 var6 = arg0.method445(var4, (byte) -68, var2 + 1);
                var2 = -1;
                if (var6.method475(73, field2134)) {
                    var3 += this.field2112[60];
                } else if (var6.method475(96, field2102)) {
                    var3 += this.field2112[62];
                } else if (var6.method450(field2111, (byte) -104)) {
                    try {
                        int var7 = var6.method471((byte) -110, 4).method439((byte) 77);
                        var3 += field2117[var7].field2621;
                    } catch (Exception var8) {
                    }
                }
            } else if (var2 == -1) {
                var3 += this.field2112[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()V")
    public static void method682() {
        field2134 = null;
        field2102 = null;
        field2111 = null;
        field2108 = null;
        field2114 = null;
        field2124 = null;
        field2128 = null;
        field2103 = null;
        field2135 = null;
        field2105 = null;
        field2116 = null;
        field2109 = null;
        field2131 = null;
        field2123 = null;
        field2101 = null;
        field2121 = null;
        field2113 = null;
        field2106 = null;
        field2110 = null;
        field2117 = null;
        field2100 = null;
        field2136 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;IIIIII)V")
    public final void method683(class62 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method695(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field1538];
        for (int var11 = 0; var11 < arg0.field1538; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method678(arg0, arg1 - this.method681(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method684(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BIIIIII)V")
    private static final void method685(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class19.field424 * arg2 + arg1;
        int var8 = class19.field424 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class19.field425) {
            int var11 = class19.field425 - arg2;
            arg4 -= var11;
            arg2 = class19.field425;
            var10 += arg3 * var11;
            var7 += class19.field424 * var11;
        }
        if (arg2 + arg4 > class19.field426) {
            arg4 -= arg2 + arg4 - class19.field426;
        }
        if (arg1 < class19.field428) {
            int var12 = class19.field428 - arg1;
            arg3 -= var12;
            arg1 = class19.field428;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class19.field422) {
            int var13 = arg1 + arg3 - class19.field422;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method684(class19.field423, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;I)V")
    private final void method686(class62 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method460((byte) 38); var5++) {
            int var6 = arg0.method446((byte) -15, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field2132 = (arg1 - this.method681(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lja;I)I")
    public final int method687(class62 arg0, int arg1) {
        int var3 = this.method692(arg0, new int[] { arg1 }, field2136);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method681(field2136[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;IIII)V")
    public final void method688(class62 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method695(arg3, arg4);
            this.method700(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;IIIII)V")
    public final void method689(class62 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method695(arg3, arg4);
        field2100.setSeed((long) arg5);
        field2129 = (field2100.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field1538];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1538; var9++) {
            var7[var9] = var8;
            if ((field2100.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method678(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BIIIII)V")
    private static final void method690(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class19.field424 * arg2 + arg1;
        int var7 = class19.field424 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class19.field425) {
            int var10 = class19.field425 - arg2;
            arg4 -= var10;
            arg2 = class19.field425;
            var9 += arg3 * var10;
            var6 += class19.field424 * var10;
        }
        if (arg2 + arg4 > class19.field426) {
            arg4 -= arg2 + arg4 - class19.field426;
        }
        if (arg1 < class19.field428) {
            int var11 = class19.field428 - arg1;
            arg3 -= var11;
            arg1 = class19.field428;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class19.field422) {
            int var12 = arg1 + arg3 - class19.field422;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method698(class19.field423, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I")
    private final int method691(int arg0) {
        return this.field2112[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;[I[Lja;)I")
    private final int method692(class62 arg0, int[] arg1, class62[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class62 var6 = class148.method1178(100, 0);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method460((byte) 38);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method446((byte) -15, var13);
            if (var14 == 60) {
                var10 = var13;
            } else {
                if (var14 == 62 && var10 != -1) {
                    class62 var15 = arg0.method445(var13, (byte) -69, var10 + 1);
                    var10 = -1;
                    var6.method453(6381, 60);
                    var6.method451(var15, -66);
                    var6.method453(6381, 62);
                    if (var15.method475(40, field2108)) {
                        arg2[var11++] = var6.method445(var6.method460((byte) 38), (byte) -102, var5);
                        var5 = var6.method460((byte) 38);
                        var4 = 0;
                        var7 = -1;
                    } else if (var15.method475(59, field2134)) {
                        var4 += this.method691(60);
                    } else if (var15.method475(114, field2102)) {
                        var4 += this.method691(62);
                    } else if (var15.method450(field2111, (byte) -90)) {
                        try {
                            int var16 = var15.method471((byte) -110, 4).method439((byte) 112);
                            var4 += field2117[var16].field2621;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var10 == -1) {
                    if (var14 != -1) {
                        var6.method453(6381, var14);
                        var4 += this.method691(var14);
                    }
                    if (var14 == 32) {
                        var7 = var6.method460((byte) 38);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var7 >= 0) {
                        arg2[var11++] = var6.method445(var7 - var9, (byte) -115, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                    }
                    if (var14 == 45) {
                        var7 = var6.method460((byte) 38);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method460((byte) 38) > var5) {
            arg2[var11++] = var6.method445(var6.method460((byte) 38), (byte) 126, var5);
        }
        return var11;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Lja;I)I")
    public final int method693(class62 arg0, int arg1) {
        return this.method692(arg0, new int[] { arg1 }, field2136);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lja;IIIII)V")
    public final void method694(class62 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method695(arg3, arg4);
        int[] var7 = new int[arg0.field1538];
        int[] var8 = new int[arg0.field1538];
        for (int var9 = 0; var9 < arg0.field1538; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method678(arg0, arg1 - this.method681(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)V")
    private final void method695(int arg0, int arg1) {
        field2119 = -1;
        field2133 = -1;
        field2104 = arg1;
        field2118 = arg1;
        field2120 = arg0;
        field2126 = arg0;
        field2129 = 256;
        field2132 = 0;
        field2107 = 0;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lja;IIII)V")
    public final void method696(class62 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method695(arg3, arg4);
            this.method700(arg0, arg1 - this.method681(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Lja;IIIII)V")
    public final void method697(class62 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method695(arg3, arg4);
        int[] var7 = new int[arg0.field1538];
        for (int var8 = 0; var8 < arg0.field1538; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method678(arg0, arg1 - this.method681(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method698(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Lja;IIII)V")
    public final void method699(class62 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method695(arg3, arg4);
            this.method700(arg0, arg1 - this.method681(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class89(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field2099 = arg0;
        this.field2112 = arg1;
        this.field2130 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field2125 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2099[var10] < var8 && this.field2130[var10] != 0) {
                var8 = this.field2099[var10];
            }
            if (this.field2130[var10] + this.field2099[var10] > var9) {
                var9 = this.field2130[var10] + this.field2099[var10];
            }
            byte[] var11 = this.field2125[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field2122 = this.field2130[32] + this.field2099[32];
        this.field2115 = this.field2122 - var8;
        this.field2127 = var9 - this.field2122;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lja;II)V")
    private final void method700(class62 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2122;
        int var5 = -1;
        for (int var6 = 0; var6 < arg0.field1538; var6++) {
            int var7 = arg0.field1504[var6] & 0xFF;
            if (var7 == 60) {
                var5 = var6;
            } else {
                if (var7 == 62 && var5 != -1) {
                    class62 var8 = arg0.method445(var6, (byte) 55, var5 + 1);
                    var5 = -1;
                    if (var8.method475(73, field2134)) {
                        var7 = 60;
                    } else {
                        if (!var8.method475(87, field2102)) {
                            if (var8.method450(field2111, (byte) -123)) {
                                try {
                                    int var9 = var8.method471((byte) -110, 4).method439((byte) 55);
                                    class114 var10 = field2117[var9];
                                    var10.method932(arg1, this.field2122 + var4 - var10.field2622);
                                    arg1 += var10.field2621;
                                } catch (Exception var13) {
                                }
                            } else {
                                this.method680(var8);
                            }
                            continue;
                        }
                        var7 = 62;
                    }
                }
                if (var5 == -1) {
                    int var11 = this.field2112[var7];
                    int var12 = this.field2130[var7];
                    if (var7 == 32) {
                        if (field2132 > 0) {
                            field2107 += field2132;
                            arg1 += field2107 >> 8;
                            field2107 &= 0xFF;
                        }
                    } else if (field2129 == 256) {
                        if (field2118 != -1) {
                            method690(this.field2125[var7], arg1 + 1, this.field2099[var7] + var4 + 1, var11, var12, field2118);
                        }
                        method690(this.field2125[var7], arg1, this.field2099[var7] + var4, var11, var12, field2126);
                    } else {
                        if (field2118 != -1) {
                            method685(this.field2125[var7], arg1 + 1, this.field2099[var7] + var4 + 1, var11, var12, field2118, field2129);
                        }
                        method685(this.field2125[var7], arg1, this.field2099[var7] + var4, var11, var12, field2126, field2129);
                    }
                    if (field2119 != -1) {
                        class19.method130(arg1, (int) ((double) this.field2122 * 0.7D) + var4, var11, field2119);
                    }
                    if (field2133 != -1) {
                        class19.method130(arg1, this.field2122 + var4 + 1, var11, field2133);
                    }
                    arg1 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([B)V")
    public class89(byte[] arg0) {
        this.field2112 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field2112.length; var2++) {
            this.field2112[var2] = arg0[var2] & 0xFF;
        }
    }
}
