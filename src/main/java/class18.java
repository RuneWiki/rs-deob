import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class18 extends class98 {

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    public int field284 = 0;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "[I")
    private int[] field278;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "[I")
    private int[] field276;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "[I")
    private int[] field265;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "[I")
    private int[] field261;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "Lmb;")
    private static class96 field256 = class243.method1708("gt", (byte) 97);

    @OriginalMember(owner = "client!i", name = "J", descriptor = "Lmb;")
    private static class96 field264 = class243.method1708("shy", (byte) 95);

    @OriginalMember(owner = "client!i", name = "A", descriptor = "Lmb;")
    private static class96 field255 = class243.method1708("img=", (byte) 113);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Lmb;")
    private static class96 field268 = class243.method1708(")4str", (byte) 122);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "Lmb;")
    private static class96 field263 = class243.method1708(")4col", (byte) 111);

    @OriginalMember(owner = "client!i", name = "S", descriptor = "Lmb;")
    private static class96 field272 = class243.method1708("times", (byte) 92);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Lmb;")
    private static class96 field275 = class243.method1708("copy", (byte) 118);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Lmb;")
    private static class96 field271 = class243.method1708("u=", (byte) 113);

    @OriginalMember(owner = "client!i", name = "N", descriptor = "Lmb;")
    private static class96 field267 = class243.method1708("str=", (byte) 92);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "Lmb;")
    private static class96 field269 = class243.method1708("lt", (byte) 117);

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "Lmb;")
    private static class96 field279 = class243.method1708("col=", (byte) 100);

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Lmb;")
    private static class96 field270 = class243.method1708("shad=", (byte) 100);

    @OriginalMember(owner = "client!i", name = "L", descriptor = "Lmb;")
    private static class96 field266 = class243.method1708("euro", (byte) 102);

    @OriginalMember(owner = "client!i", name = "D", descriptor = "Lmb;")
    private static class96 field258 = class243.method1708("trans=", (byte) 95);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Lmb;")
    private static class96 field262 = class243.method1708(")4trans", (byte) 125);

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "Lmb;")
    private static class96 field280 = class243.method1708("shad", (byte) 103);

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "Lmb;")
    private static class96 field288 = class243.method1708("str", (byte) 101);

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "Lmb;")
    private static class96 field281 = class243.method1708("nbsp", (byte) 106);

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Lmb;")
    private static class96 field274 = class243.method1708(")4shad", (byte) 115);

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "Lmb;")
    private static class96 field285 = class243.method1708(")4u", (byte) 109);

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "Lmb;")
    private static class96 field286 = class243.method1708("br", (byte) 108);

    @OriginalMember(owner = "client!i", name = "db", descriptor = "Lmb;")
    private static class96 field283 = class243.method1708("u", (byte) 125);

    @OriginalMember(owner = "client!i", name = "jb", descriptor = "Lmb;")
    private static class96 field289 = class243.method1708("reg", (byte) 106);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Lmb;")
    private static class96 field257 = class162.method1178(100, 121);

    @OriginalMember(owner = "client!i", name = "mb", descriptor = "[Lmb;")
    private static class96[] field292 = new class96[100];

    @OriginalMember(owner = "client!i", name = "nb", descriptor = "I")
    private static int field293 = -1;

    @OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
    private static int field291 = -1;

    @OriginalMember(owner = "client!i", name = "sb", descriptor = "I")
    private static int field298 = -1;

    @OriginalMember(owner = "client!i", name = "ob", descriptor = "I")
    private static int field294 = 256;

    @OriginalMember(owner = "client!i", name = "kb", descriptor = "I")
    private static int field290 = 0;

    @OriginalMember(owner = "client!i", name = "tb", descriptor = "I")
    private static int field299 = 0;

    @OriginalMember(owner = "client!i", name = "pb", descriptor = "I")
    private static int field295 = 256;

    @OriginalMember(owner = "client!i", name = "rb", descriptor = "I")
    private static int field297 = 0;

    @OriginalMember(owner = "client!i", name = "qb", descriptor = "I")
    private static int field296 = 0;

    @OriginalMember(owner = "client!i", name = "ub", descriptor = "I")
    private static int field300 = -1;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "[B")
    private byte[] field287;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "[I")
    private int[] field277;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "[I")
    private int[] field282;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "[Lnj;")
    private class87[] field259;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;II[I[I)V")
    private final void method116(class96 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field284;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field1600; var10++) {
            int var11 = arg0.field1580[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class96 var12 = arg0.method716(var10, (byte) -13, var7 + 1);
                    var7 = -1;
                    if (var12.method705(0, field269)) {
                        var11 = 60;
                    } else if (var12.method705(0, field256)) {
                        var11 = 62;
                    } else if (var12.method705(0, field281)) {
                        var11 = 160;
                    } else if (var12.method705(0, field264)) {
                        var11 = 173;
                    } else if (var12.method705(0, field272)) {
                        var11 = 215;
                    } else if (var12.method705(0, field266)) {
                        var11 = 128;
                    } else if (var12.method705(0, field275)) {
                        var11 = 169;
                    } else {
                        if (!var12.method705(0, field289)) {
                            if (var12.method703(0, field255)) {
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
                                    int var15 = var12.method710(118, 4).method694(10);
                                    class87 var16 = this.field259[var15];
                                    int var17 = this.field282 == null ? var16.field1461 : this.field282[var15];
                                    if (field294 == 256) {
                                        var16.method197(arg1 + var13, this.field284 + var6 - var17 + var14);
                                    } else {
                                        var16.method196(arg1 + var13, this.field284 + var6 - var17 + var14, field294);
                                    }
                                    arg1 += var16.field1462;
                                    var8 = -1;
                                } catch (Exception var23) {
                                }
                            } else {
                                this.method130(var12);
                            }
                            continue;
                        }
                        var11 = 174;
                    }
                }
                if (var7 == -1) {
                    if (this.field287 != null && var8 != -1) {
                        arg1 += this.field287[(var8 << 8) + var11];
                    }
                    int var18 = this.field265[var11];
                    int var19 = this.field261[var11];
                    int var20;
                    if (arg3 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg3[var9];
                    }
                    int var21;
                    if (arg4 == null) {
                        var21 = 0;
                    } else {
                        var21 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field296 > 0) {
                            field297 += field296;
                            arg1 += field297 >> 8;
                            field297 &= 0xFF;
                        }
                    } else if (field294 == 256) {
                        if (field293 != -1) {
                            this.method102(var11, this.field278[var11] + arg1 + var20 + 1, this.field276[var11] + var6 + 1 + var21, var18, var19, field293, true);
                        }
                        this.method102(var11, this.field278[var11] + arg1 + var20, this.field276[var11] + var6 + var21, var18, var19, field290, false);
                    } else {
                        if (field293 != -1) {
                            this.method98(var11, this.field278[var11] + arg1 + var20 + 1, this.field276[var11] + var6 + 1 + var21, var18, var19, field293, field294, true);
                        }
                        this.method98(var11, this.field278[var11] + arg1 + var20, this.field276[var11] + var6 + var21, var18, var19, field290, field294, false);
                    }
                    int var22 = this.field277[var11];
                    if (field300 != -1) {
                        class84.method595(arg1, (int) ((double) this.field284 * 0.7D) + var6, var22, field300);
                    }
                    if (field291 != -1) {
                        class84.method595(arg1, this.field284 + var6, var22, field291);
                    }
                    arg1 += var22;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;IIII)V")
    public final void method117(class96 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method133(arg3, arg4);
            this.method127(arg0, arg1 - this.method125(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;I)I")
    public final int method118(class96 arg0, int arg1) {
        int var3 = this.method124(arg0, new int[] { arg1 }, field292);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method125(field292[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)I")
    private final int method119(int arg0) {
        return this.field277[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;IIIIII)V")
    public final void method120(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method133(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field1600];
        for (int var11 = 0; var11 < arg0.field1600; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method116(arg0, arg1 - this.method125(arg0) / 2, arg2, (int[]) null, var10);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;IIIIIIIII)I")
    public final int method121(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method126(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Lmb;I)I")
    public final int method122(class96 arg0, int arg1) {
        return this.method124(arg0, new int[] { arg1 }, field292);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(Lmb;I)V")
    private final void method123(class96 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method707(-91); var5++) {
            int var6 = arg0.method687(var5, 0);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field296 = (arg1 - this.method125(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;[I[Lmb;)I")
    public final int method124(class96 arg0, int[] arg1, class96[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        field257.method693(-105, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int var7 = 0;
        byte var8 = 0;
        int var9 = -1;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method707(-4);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method687(var13, 0);
            if (var14 == 60) {
                var9 = var13;
            } else {
                if (var14 == 62 && var9 != -1) {
                    class96 var15 = arg0.method716(var13, (byte) -13, var9 + 1);
                    var9 = -1;
                    field257.method721(60, (byte) 123);
                    field257.method690(var15, 0);
                    field257.method721(62, (byte) 127);
                    if (var15.method705(0, field286)) {
                        if (arg2[var11] == null) {
                            arg2[var11] = field257.method716(field257.method707(-58), (byte) -13, var5);
                        } else {
                            arg2[var11].method693(57, 0);
                            arg2[var11] = arg2[var11].method715(var5, field257.method707(-75), field257, -9);
                        }
                        var11++;
                        var5 = field257.method707(-115);
                        var4 = 0;
                        var6 = -1;
                        var10 = -1;
                    } else if (var15.method705(0, field269)) {
                        var4 += this.method119(60);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + 60];
                        }
                        var10 = 60;
                    } else if (var15.method705(0, field256)) {
                        var4 += this.method119(62);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + 62];
                        }
                        var10 = 62;
                    } else if (var15.method705(0, field281)) {
                        var4 += this.method119(160);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + 160];
                        }
                        var10 = 160;
                    } else if (var15.method705(0, field264)) {
                        var4 += this.method119(173);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + 173];
                        }
                        var10 = 173;
                    } else if (var15.method705(0, field272)) {
                        var4 += this.method119(215);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + 215];
                        }
                        var10 = 215;
                    } else if (var15.method705(0, field266)) {
                        var4 += this.method119(128);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + 128];
                        }
                        var10 = 128;
                    } else if (var15.method705(0, field275)) {
                        var4 += this.method119(169);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + 169];
                        }
                        var10 = 169;
                    } else if (var15.method705(0, field289)) {
                        var4 += this.method119(174);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + 174];
                        }
                        var10 = 174;
                    } else if (var15.method703(0, field255)) {
                        try {
                            int var16 = var15.method710(116, 4).method694(10);
                            var4 += this.field259[var16].field1462;
                            var10 = -1;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var9 == -1) {
                    if (var14 != -1) {
                        field257.method721(var14, (byte) 95);
                        var4 += this.method119(var14);
                        if (this.field287 != null && var10 != -1) {
                            var4 += this.field287[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == 32) {
                        var6 = field257.method707(-53);
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        if (arg2[var11] == null) {
                            arg2[var11] = field257.method716(var6 - var8, (byte) -13, var5);
                        } else {
                            arg2[var11].method693(-120, 0);
                            arg2[var11] = arg2[var11].method715(var5, var6 - var8, field257, 120);
                        }
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = -1;
                    }
                    if (var14 == 45) {
                        var6 = field257.method707(-48);
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field257.method707(-39) > var5) {
            if (arg2[var11] == null) {
                arg2[var11] = field257.method716(field257.method707(-26), (byte) -13, var5);
            } else {
                arg2[var11].method693(41, 0);
                arg2[var11] = arg2[var11].method715(var5, field257.method707(-102), field257, 117);
            }
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;)I")
    public final int method125(class96 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field1600; var5++) {
            int var6 = arg0.field1580[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class96 var7 = arg0.method716(var5, (byte) -13, var2 + 1);
                    var2 = -1;
                    if (var7.method705(0, field269)) {
                        var6 = 60;
                    } else if (var7.method705(0, field256)) {
                        var6 = 62;
                    } else if (var7.method705(0, field281)) {
                        var6 = 160;
                    } else if (var7.method705(0, field264)) {
                        var6 = 173;
                    } else if (var7.method705(0, field272)) {
                        var6 = 215;
                    } else if (var7.method705(0, field266)) {
                        var6 = 128;
                    } else if (var7.method705(0, field275)) {
                        var6 = 169;
                    } else {
                        if (!var7.method705(0, field289)) {
                            if (var7.method703(0, field255)) {
                                try {
                                    int var8 = var7.method710(123, 4).method694(10);
                                    var4 += this.field259[var8].field1462;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 174;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field277[var6];
                    if (this.field287 != null && var3 != -1) {
                        var4 += this.field287[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;IIIIIIIIII)I")
    public final int method126(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method134(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field284;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field273 + this.field260 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method124(arg0, var12, field292);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field273 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field273 - this.field260 - (var13 - 1) * arg10) / 2 + this.field273 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field260 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field273 - this.field260 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field273 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method127(field292[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method127(field292[var16], arg1 + (arg3 - this.method125(field292[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method127(field292[var16], arg1 + arg3 - this.method125(field292[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method127(field292[var16], arg1, var14);
            } else {
                this.method123(field292[var16], arg3);
                this.method127(field292[var16], arg1, var14);
                field296 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;II)V")
    private final void method127(class96 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field284;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field1600; var7++) {
            int var8 = arg0.field1580[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class96 var9 = arg0.method716(var7, (byte) -13, var5 + 1);
                    var5 = -1;
                    if (var9.method705(0, field269)) {
                        var8 = 60;
                    } else if (var9.method705(0, field256)) {
                        var8 = 62;
                    } else if (var9.method705(0, field281)) {
                        var8 = 160;
                    } else if (var9.method705(0, field264)) {
                        var8 = 173;
                    } else if (var9.method705(0, field272)) {
                        var8 = 215;
                    } else if (var9.method705(0, field266)) {
                        var8 = 128;
                    } else if (var9.method705(0, field275)) {
                        var8 = 169;
                    } else {
                        if (!var9.method705(0, field289)) {
                            if (var9.method703(0, field255)) {
                                try {
                                    int var10 = var9.method710(112, 4).method694(10);
                                    class87 var11 = this.field259[var10];
                                    int var12 = this.field282 == null ? var11.field1461 : this.field282[var10];
                                    if (field294 == 256) {
                                        var11.method197(arg1, this.field284 + var4 - var12);
                                    } else {
                                        var11.method196(arg1, this.field284 + var4 - var12, field294);
                                    }
                                    arg1 += var11.field1462;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method130(var9);
                            }
                            continue;
                        }
                        var8 = 174;
                    }
                }
                if (var5 == -1) {
                    if (this.field287 != null && var6 != -1) {
                        arg1 += this.field287[(var6 << 8) + var8];
                    }
                    int var13 = this.field265[var8];
                    int var14 = this.field261[var8];
                    if (var8 == 32) {
                        if (field296 > 0) {
                            field297 += field296;
                            arg1 += field297 >> 8;
                            field297 &= 0xFF;
                        }
                    } else if (field294 == 256) {
                        if (field293 != -1) {
                            this.method102(var8, this.field278[var8] + arg1 + 1, this.field276[var8] + var4 + 1, var13, var14, field293, true);
                        }
                        this.method102(var8, this.field278[var8] + arg1, this.field276[var8] + var4, var13, var14, field290, false);
                    } else {
                        if (field293 != -1) {
                            this.method98(var8, this.field278[var8] + arg1 + 1, this.field276[var8] + var4 + 1, var13, var14, field293, field294, true);
                        }
                        this.method98(var8, this.field278[var8] + arg1, this.field276[var8] + var4, var13, var14, field290, field294, false);
                    }
                    int var15 = this.field277[var8];
                    if (field300 != -1) {
                        class84.method595(arg1, (int) ((double) this.field284 * 0.7D) + var4, var15, field300);
                    }
                    if (field291 != -1) {
                        class84.method595(arg1, this.field284 + var4 + 1, var15, field291);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Lmb;IIII)V")
    public final void method128(class96 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method133(arg3, arg4);
            this.method127(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method129(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Lmb;)V")
    private final void method130(class96 arg0) {
        try {
            if (arg0.method703(0, field279)) {
                field290 = arg0.method710(112, 4).method700((byte) 115, 16);
                return;
            }
            if (arg0.method705(0, field263)) {
                field290 = field299;
                return;
            }
            if (arg0.method703(0, field258)) {
                field294 = arg0.method710(124, 6).method694(10);
                return;
            }
            if (arg0.method705(0, field262)) {
                field294 = field295;
                return;
            }
            if (arg0.method703(0, field267)) {
                field300 = arg0.method710(112, 4).method700((byte) 115, 16);
                return;
            }
            if (arg0.method705(0, field288)) {
                field300 = 8388608;
                return;
            }
            if (arg0.method705(0, field268)) {
                field300 = -1;
                return;
            }
            if (arg0.method703(0, field271)) {
                field291 = arg0.method710(116, 2).method700((byte) 115, 16);
                return;
            }
            if (arg0.method705(0, field283)) {
                field291 = 0;
                return;
            }
            if (arg0.method705(0, field285)) {
                field291 = -1;
                return;
            }
            if (arg0.method703(0, field270)) {
                field293 = arg0.method710(109, 5).method700((byte) 115, 16);
                return;
            }
            if (arg0.method705(0, field280)) {
                field293 = 0;
                return;
            }
            if (arg0.method705(0, field274)) {
                field293 = field298;
                return;
            }
            if (arg0.method705(0, field286)) {
                this.method134(field299, field298, field295);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;IIIILjava/util/Random;I)I")
    public final int method131(class96 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method134(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field1600];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field1600; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method116(arg0, arg1, arg2, var8, (int[]) null);
        return var9;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(Lmb;IIII)V")
    public final void method132(class96 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method133(arg3, arg4);
            this.method127(arg0, arg1 - this.method125(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    private final void method133(int arg0, int arg1) {
        field300 = -1;
        field291 = -1;
        field298 = arg1;
        field293 = arg1;
        field299 = arg0;
        field290 = arg0;
        field295 = 256;
        field294 = 256;
        field296 = 0;
        field297 = 0;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)V")
    private final void method134(int arg0, int arg1, int arg2) {
        field300 = -1;
        field291 = -1;
        field298 = arg1;
        field293 = arg1;
        field299 = arg0;
        field290 = arg0;
        field295 = arg2;
        field294 = arg2;
        field296 = 0;
        field297 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
    public static void method135() {
        field269 = null;
        field256 = null;
        field281 = null;
        field264 = null;
        field272 = null;
        field266 = null;
        field275 = null;
        field289 = null;
        field255 = null;
        field286 = null;
        field279 = null;
        field263 = null;
        field258 = null;
        field262 = null;
        field271 = null;
        field283 = null;
        field285 = null;
        field270 = null;
        field280 = null;
        field274 = null;
        field267 = null;
        field288 = null;
        field268 = null;
        field257 = null;
        field292 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([B)V")
    private final void method136(byte[] arg0) {
        this.field277 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field277.length; var2++) {
                this.field277[var2] = arg0[var2] & 0xFF;
            }
            this.field284 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field277[var4] = arg0[var3++] & 0xFF;
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
        this.field287 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field287[(var13 << 8) + var14] = (byte) method129(var9, var11, var6, this.field277, var5, var13, var14);
                    }
                }
            }
        }
        this.field284 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([Lnj;[I)V")
    public final void method137(class87[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field259 = arg0;
        this.field282 = arg1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmb;IIIII)V")
    public final void method138(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method133(arg3, arg4);
        int[] var7 = new int[arg0.field1600];
        for (int var8 = 0; var8 < arg0.field1600; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method116(arg0, arg1 - this.method125(arg0) / 2, arg2, (int[]) null, var7);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B[I[I[I[I)V")
    public class18(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field278 = arg1;
        this.field276 = arg2;
        this.field265 = arg3;
        this.field261 = arg4;
        this.method136(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field276[var8] < var6 && this.field261[var8] != 0) {
                var6 = this.field276[var8];
            }
            if (this.field276[var8] + this.field261[var8] > var7) {
                var7 = this.field276[var8] + this.field261[var8];
            }
        }
        this.field273 = this.field284 - var6;
        this.field260 = var7 - this.field284;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B)V")
    public class18(byte[] arg0) {
        this.method136(arg0);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(Lmb;)Lmb;")
    public static final class96 method139(class96 arg0) {
        int var1 = arg0.method707(-84);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field1580[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class96 var4 = new class96();
        var4.field1600 = var1 + var2;
        var4.field1580 = new byte[var4.field1600];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field1580[var6];
            if (var7 == 60) {
                var4.field1580[var5++] = 60;
                var4.field1580[var5++] = 108;
                var4.field1580[var5++] = 116;
                var4.field1580[var5++] = 62;
            } else if (var7 == 62) {
                var4.field1580[var5++] = 60;
                var4.field1580[var5++] = 103;
                var4.field1580[var5++] = 116;
                var4.field1580[var5++] = 62;
            } else {
                var4.field1580[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Lmb;IIIII)V")
    public final void method140(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method133(arg3, arg4);
        int[] var7 = new int[arg0.field1600];
        int[] var8 = new int[arg0.field1600];
        for (int var9 = 0; var9 < arg0.field1600; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method116(arg0, arg1 - this.method125(arg0) / 2, arg2, var7, var8);
    }
}
