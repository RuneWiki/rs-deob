import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class33 {

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
    public int field76 = 0;

    @OriginalMember(owner = "client!ad", name = "wb", descriptor = "[[B")
    private byte[][] field88 = new byte[256][];

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "[I")
    private int[] field68;

    @OriginalMember(owner = "client!ad", name = "Bb", descriptor = "[I")
    private int[] field93;

    @OriginalMember(owner = "client!ad", name = "Jb", descriptor = "[I")
    private int[] field101;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client!ad", name = "Eb", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    private static int field67 = -1;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "Laf;")
    private static class7 field69 = class48.method406(40, ")4shad");

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    private static int field71 = 256;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "Laf;")
    private static class7 field72 = class48.method406(40, "shad");

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "Laf;")
    private static class7 field77 = class48.method406(40, "i");

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "Laf;")
    private static class7 field78 = class48.method406(40, ")4u");

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    private static int field64 = 0;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "Laf;")
    private static class7 field74 = class48.method406(40, "lt");

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "Laf;")
    private static class7 field79 = class48.method406(40, "b");

    @OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
    private static int field84 = -1;

    @OriginalMember(owner = "client!ad", name = "rb", descriptor = "Laf;")
    private static class7 field83 = class48.method406(40, "shad=");

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "Laf;")
    private static class7 field82 = class48.method406(40, ")4i");

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    private static int field81 = 0;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    private static int field65 = -1;

    @OriginalMember(owner = "client!ad", name = "ub", descriptor = "I")
    private static int field86 = 0;

    @OriginalMember(owner = "client!ad", name = "zb", descriptor = "Laf;")
    private static class7 field91 = class48.method406(40, "u=");

    @OriginalMember(owner = "client!ad", name = "yb", descriptor = "Laf;")
    private static class7 field90 = class48.method406(40, "br");

    @OriginalMember(owner = "client!ad", name = "Ab", descriptor = "Laf;")
    private static class7 field92 = class48.method406(40, ")4col");

    @OriginalMember(owner = "client!ad", name = "Gb", descriptor = "Laf;")
    private static class7 field98 = class48.method406(40, ")4str");

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "Laf;")
    private static class7 field80 = class48.method406(40, "gt");

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "Laf;")
    private static class7 field73 = class48.method406(40, ")4b");

    @OriginalMember(owner = "client!ad", name = "Fb", descriptor = "Laf;")
    private static class7 field97 = class48.method406(40, "col=");

    @OriginalMember(owner = "client!ad", name = "tb", descriptor = "I")
    private static int field85 = 0;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "Laf;")
    private static class7 field66 = class48.method406(40, "u");

    @OriginalMember(owner = "client!ad", name = "Db", descriptor = "Laf;")
    private static class7 field95 = class48.method406(40, "str=");

    @OriginalMember(owner = "client!ad", name = "xb", descriptor = "I")
    private static int field89 = -1;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "Laf;")
    private static class7 field75 = class48.method406(40, "str");

    @OriginalMember(owner = "client!ad", name = "Hb", descriptor = "Laf;")
    private static class7 field99 = class48.method406(40, "img=");

    @OriginalMember(owner = "client!ad", name = "vb", descriptor = "Ljava/util/Random;")
    private static Random field87 = new Random();

    @OriginalMember(owner = "client!ad", name = "Ib", descriptor = "[Laf;")
    private static class7[] field100 = new class7[100];

    @OriginalMember(owner = "client!ad", name = "Cb", descriptor = "[Lqc;")
    public static class114[] field94;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method28(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;I)I")
    public final int method29(class7 arg0, int arg1) {
        return this.method39(arg0, new int[] { arg1 }, field100);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;IIIIIIIII)V")
    public final void method30(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        this.method48(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field76;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field96 + this.field70 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method39(arg0, var11, field100);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field70 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field70 - this.field96 - (var12 - 1) * arg9) / 2 + this.field70 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field96 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field70 - this.field96 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field70 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method45(field100[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method45(field100[var15], arg1 + (arg3 - this.method31(field100[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method45(field100[var15], arg1 + arg3 - this.method31(field100[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method45(field100[var15], arg1, var13);
            } else {
                this.method44(field100[var15], arg3);
                this.method45(field100[var15], arg1, var13);
                field64 = 0;
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;)I")
    public final int method31(class7 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.field139; var4++) {
            int var5 = arg0.field162[var4] & 0xFF;
            if (var5 == 60) {
                var2 = var4;
            } else if (var5 == 62 && var2 != -1) {
                class7 var6 = arg0.method77(var2 + 1, 96, var4);
                var2 = -1;
                if (var6.method76(10, field74)) {
                    var3 += this.field93[60];
                } else if (var6.method76(35, field80)) {
                    var3 += this.field93[62];
                } else if (var6.method94((byte) -123, field99)) {
                    try {
                        int var7 = var6.method61(-75, 4).method73((byte) 66);
                        var3 += field94[var7].field2726;
                    } catch (Exception var8) {
                    }
                }
            } else if (var2 == -1) {
                var3 += this.field93[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method32(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;IIIII)V")
    public final void method33(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method48(arg3, arg4);
        field87.setSeed((long) arg5);
        field71 = (field87.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field139];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field139; var9++) {
            var7[var9] = var8;
            if ((field87.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method49(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Laf;)V")
    private final void method34(class7 arg0) {
        try {
            if (arg0.method94((byte) -123, field97)) {
                field81 = arg0.method61(-120, 4).method83(16, 43);
                return;
            }
            if (arg0.method76(-122, field92)) {
                field81 = field85;
                return;
            }
            if (arg0.method94((byte) -123, field95)) {
                field89 = arg0.method61(-78, 4).method83(16, 43);
                return;
            }
            if (arg0.method76(-125, field75)) {
                field89 = 8388608;
                return;
            }
            if (arg0.method76(61, field98)) {
                field89 = -1;
                return;
            }
            if (!arg0.method76(-121, field79) && !arg0.method76(-115, field73) && !arg0.method76(57, field77) && !arg0.method76(-124, field82)) {
                if (arg0.method94((byte) -123, field91)) {
                    field65 = arg0.method61(-123, 2).method83(16, 43);
                    return;
                }
                if (arg0.method76(-116, field66)) {
                    field65 = 0;
                    return;
                }
                if (arg0.method76(-119, field78)) {
                    field65 = -1;
                    return;
                }
                if (arg0.method94((byte) -123, field83)) {
                    field67 = arg0.method61(-76, 5).method83(16, 43);
                    return;
                }
                if (arg0.method76(101, field72)) {
                    field67 = 0;
                    return;
                }
                if (arg0.method76(46, field69)) {
                    field67 = field84;
                    return;
                }
                if (arg0.method76(-120, field90)) {
                    this.method48(field85, field84);
                    return;
                }
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Laf;I)I")
    public final int method35(class7 arg0, int arg1) {
        int var3 = this.method39(arg0, new int[] { arg1 }, field100);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method31(field100[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Laf;IIIII)V")
    public final void method36(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method48(arg3, arg4);
        int[] var7 = new int[arg0.field139];
        int[] var8 = new int[arg0.field139];
        for (int var9 = 0; var9 < arg0.field139; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method49(arg0, arg1 - this.method31(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
    private final int method37(int arg0) {
        return this.field93[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Laf;IIIII)V")
    public final void method38(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method48(arg3, arg4);
        int[] var7 = new int[arg0.field139];
        for (int var8 = 0; var8 < arg0.field139; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method49(arg0, arg1 - this.method31(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;[I[Laf;)I")
    private final int method39(class7 arg0, int[] arg1, class7[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class7 var6 = class10.method112(100, false);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method92(105);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method79(var13, 0);
            if (var14 == 60) {
                var10 = var13;
            } else {
                if (var14 == 62 && var10 != -1) {
                    class7 var15 = arg0.method77(var10 + 1, 73, var13);
                    var10 = -1;
                    var6.method59(60, true);
                    var6.method69(-59, var15);
                    var6.method59(62, true);
                    if (var15.method76(-124, field90)) {
                        arg2[var11++] = var6.method77(var5, 120, var6.method92(-109));
                        var5 = var6.method92(78);
                        var4 = 0;
                        var7 = -1;
                    } else if (var15.method76(83, field74)) {
                        var4 += this.method37(60);
                    } else if (var15.method76(53, field80)) {
                        var4 += this.method37(62);
                    } else if (var15.method94((byte) -123, field99)) {
                        try {
                            int var16 = var15.method61(-67, 4).method73((byte) 111);
                            var4 += field94[var16].field2726;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var10 == -1) {
                    if (var14 != -1) {
                        var6.method59(var14, true);
                        var4 += this.method37(var14);
                    }
                    if (var14 == 32) {
                        var7 = var6.method92(-121);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var7 >= 0) {
                        arg2[var11++] = var6.method77(var5, 60, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                    }
                    if (var14 == 45) {
                        var7 = var6.method92(-126);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method92(56) > var5) {
            arg2[var11++] = var6.method77(var5, 105, var6.method92(65));
        }
        return var11;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Laf;)Laf;")
    public static final class7 method40(class7 arg0) {
        int var1 = arg0.method92(45);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field162[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class7 var4 = new class7();
        var4.field139 = var1 + var2;
        var4.field162 = new byte[var4.field139];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field162[var6];
            if (var7 == 60) {
                var4.field162[var5++] = 60;
                var4.field162[var5++] = 108;
                var4.field162[var5++] = 116;
                var4.field162[var5++] = 62;
            } else if (var7 == 62) {
                var4.field162[var5++] = 60;
                var4.field162[var5++] = 103;
                var4.field162[var5++] = 116;
                var4.field162[var5++] = 62;
            } else {
                var4.field162[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;IIIIII)V")
    public final void method41(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method48(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field139];
        for (int var11 = 0; var11 < arg0.field139; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method49(arg0, arg1 - this.method31(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;IIII)V")
    public final void method42(class7 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method48(arg3, arg4);
            this.method45(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIIIII)V")
    private static final void method43(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class33.field862 * arg2 + arg1;
        int var7 = class33.field862 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class33.field863) {
            int var10 = class33.field863 - arg2;
            arg4 -= var10;
            arg2 = class33.field863;
            var9 += arg3 * var10;
            var6 += class33.field862 * var10;
        }
        if (arg2 + arg4 > class33.field857) {
            arg4 -= arg2 + arg4 - class33.field857;
        }
        if (arg1 < class33.field861) {
            int var11 = class33.field861 - arg1;
            arg3 -= var11;
            arg1 = class33.field861;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class33.field859) {
            int var12 = arg1 + arg3 - class33.field859;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method28(class33.field858, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Laf;I)V")
    private final void method44(class7 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method92(33); var5++) {
            int var6 = arg0.method79(var5, 0);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field64 = (arg1 - this.method31(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;II)V")
    private final void method45(class7 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field76;
        int var5 = -1;
        for (int var6 = 0; var6 < arg0.field139; var6++) {
            int var7 = arg0.field162[var6] & 0xFF;
            if (var7 == 60) {
                var5 = var6;
            } else {
                if (var7 == 62 && var5 != -1) {
                    class7 var8 = arg0.method77(var5 + 1, 103, var6);
                    var5 = -1;
                    if (var8.method76(110, field74)) {
                        var7 = 60;
                    } else {
                        if (!var8.method76(85, field80)) {
                            if (var8.method94((byte) -123, field99)) {
                                try {
                                    int var9 = var8.method61(-69, 4).method73((byte) 120);
                                    class114 var10 = field94[var9];
                                    var10.method896(arg1, this.field76 + var4 - var10.field2727);
                                    arg1 += var10.field2726;
                                } catch (Exception var13) {
                                }
                            } else {
                                this.method34(var8);
                            }
                            continue;
                        }
                        var7 = 62;
                    }
                }
                if (var5 == -1) {
                    int var11 = this.field93[var7];
                    int var12 = this.field101[var7];
                    if (var7 == 32) {
                        if (field64 > 0) {
                            field86 += field64;
                            arg1 += field86 >> 8;
                            field86 &= 0xFF;
                        }
                    } else if (field71 == 256) {
                        if (field67 != -1) {
                            method43(this.field88[var7], arg1 + 1, this.field68[var7] + var4 + 1, var11, var12, field67);
                        }
                        method43(this.field88[var7], arg1, this.field68[var7] + var4, var11, var12, field81);
                    } else {
                        if (field67 != -1) {
                            method51(this.field88[var7], arg1 + 1, this.field68[var7] + var4 + 1, var11, var12, field67, field71);
                        }
                        method51(this.field88[var7], arg1, this.field68[var7] + var4, var11, var12, field81, field71);
                    }
                    if (field89 != -1) {
                        class33.method291(arg1, (int) ((double) this.field76 * 0.7D) + var4, var11, field89);
                    }
                    if (field65 != -1) {
                        class33.method291(arg1, this.field76 + var4 + 1, var11, field65);
                    }
                    arg1 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()V")
    public static void method46() {
        field74 = null;
        field80 = null;
        field99 = null;
        field90 = null;
        field97 = null;
        field92 = null;
        field79 = null;
        field73 = null;
        field77 = null;
        field82 = null;
        field91 = null;
        field66 = null;
        field78 = null;
        field83 = null;
        field72 = null;
        field69 = null;
        field95 = null;
        field75 = null;
        field98 = null;
        field94 = null;
        field87 = null;
        field100 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Laf;IIII)V")
    public final void method47(class7 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method48(arg3, arg4);
            this.method45(arg0, arg1 - this.method31(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
    private final void method48(int arg0, int arg1) {
        field89 = -1;
        field65 = -1;
        field84 = arg1;
        field67 = arg1;
        field85 = arg0;
        field81 = arg0;
        field71 = 256;
        field64 = 0;
        field86 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;II[I[I)V")
    private final void method49(class7 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field76;
        int var7 = -1;
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field139; var9++) {
            int var10 = arg0.field162[var9] & 0xFF;
            if (var10 == 60) {
                var7 = var9;
            } else {
                if (var10 == 62 && var7 != -1) {
                    class7 var11 = arg0.method77(var7 + 1, 122, var9);
                    var7 = -1;
                    if (var11.method76(18, field74)) {
                        var10 = 60;
                    } else {
                        if (!var11.method76(10, field80)) {
                            if (var11.method94((byte) -123, field99)) {
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
                                    int var14 = var11.method61(-115, 4).method73((byte) 95);
                                    class114 var15 = field94[var14];
                                    var15.method896(arg1 + var12, this.field76 + var6 - var15.field2727 + var13);
                                    arg1 += var15.field2726;
                                } catch (Exception var20) {
                                }
                            } else {
                                this.method34(var11);
                            }
                            continue;
                        }
                        var10 = 62;
                    }
                }
                if (var7 == -1) {
                    int var16 = this.field93[var10];
                    int var17 = this.field101[var10];
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
                        if (field64 > 0) {
                            field86 += field64;
                            arg1 += field86 >> 8;
                            field86 &= 0xFF;
                        }
                    } else if (field71 == 256) {
                        if (field67 != -1) {
                            method43(this.field88[var10], arg1 + var18 + 1, this.field68[var10] + var6 + 1 + var19, var16, var17, field67);
                        }
                        method43(this.field88[var10], arg1 + var18, this.field68[var10] + var6 + var19, var16, var17, field81);
                    } else {
                        if (field67 != -1) {
                            method51(this.field88[var10], arg1 + var18 + 1, this.field68[var10] + var6 + 1 + var19, var16, var17, field67, field71);
                        }
                        method51(this.field88[var10], arg1 + var18, this.field68[var10] + var6 + var19, var16, var17, field81, field71);
                    }
                    if (field89 != -1) {
                        class33.method291(arg1, (int) ((double) this.field76 * 0.7D) + var6, var16, field89);
                    }
                    if (field65 != -1) {
                        class33.method291(arg1, this.field76 + var6, var16, field65);
                    }
                    arg1 += var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Laf;IIII)V")
    public final void method50(class7 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method48(arg3, arg4);
            this.method45(arg0, arg1 - this.method31(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIIIIII)V")
    private static final void method51(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class33.field862 * arg2 + arg1;
        int var8 = class33.field862 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class33.field863) {
            int var11 = class33.field863 - arg2;
            arg4 -= var11;
            arg2 = class33.field863;
            var10 += arg3 * var11;
            var7 += class33.field862 * var11;
        }
        if (arg2 + arg4 > class33.field857) {
            arg4 -= arg2 + arg4 - class33.field857;
        }
        if (arg1 < class33.field861) {
            int var12 = class33.field861 - arg1;
            arg3 -= var12;
            arg1 = class33.field861;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class33.field859) {
            int var13 = arg1 + arg3 - class33.field859;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method32(class33.field858, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class5(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field68 = arg0;
        this.field93 = arg1;
        this.field101 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field88 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field68[var10] < var8 && this.field101[var10] != 0) {
                var8 = this.field68[var10];
            }
            if (this.field68[var10] + this.field101[var10] > var9) {
                var9 = this.field68[var10] + this.field101[var10];
            }
            byte[] var11 = this.field88[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field76 = this.field68[32] + this.field101[32];
        this.field70 = this.field76 - var8;
        this.field96 = var9 - this.field76;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
    public class5(byte[] arg0) {
        this.field93 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field93.length; var2++) {
            this.field93[var2] = arg0[var2] & 0xFF;
        }
    }
}
