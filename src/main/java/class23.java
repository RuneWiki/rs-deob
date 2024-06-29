import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public abstract class class23 extends class27 {

    @OriginalMember(owner = "mapview!la", name = "U", descriptor = "I")
    private int field254 = 0;

    @OriginalMember(owner = "mapview!la", name = "Z", descriptor = "[[B")
    public byte[][] field259 = new byte[256][];

    @OriginalMember(owner = "mapview!la", name = "D", descriptor = "[I")
    private int[] field244;

    @OriginalMember(owner = "mapview!la", name = "nb", descriptor = "[I")
    private int[] field273;

    @OriginalMember(owner = "mapview!la", name = "jb", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "mapview!la", name = "kb", descriptor = "[I")
    private int[] field270;

    @OriginalMember(owner = "mapview!la", name = "F", descriptor = "Lea;")
    private static class10 field245 = class3.method8("shad", -72);

    @OriginalMember(owner = "mapview!la", name = "T", descriptor = "I")
    private static int field253 = 0;

    @OriginalMember(owner = "mapview!la", name = "N", descriptor = "Lea;")
    private static class10 field247 = class3.method8("shad=", -120);

    @OriginalMember(owner = "mapview!la", name = "O", descriptor = "I")
    private static int field248 = 0;

    @OriginalMember(owner = "mapview!la", name = "M", descriptor = "Lea;")
    private static class10 field246 = class3.method8(")4col", -62);

    @OriginalMember(owner = "mapview!la", name = "P", descriptor = "Lea;")
    private static class10 field249 = class3.method8("str", -53);

    @OriginalMember(owner = "mapview!la", name = "Q", descriptor = "I")
    private static int field250 = 0;

    @OriginalMember(owner = "mapview!la", name = "Y", descriptor = "I")
    private static int field258 = -1;

    @OriginalMember(owner = "mapview!la", name = "cb", descriptor = "Lea;")
    private static class10 field262 = class3.method8("img=", 95);

    @OriginalMember(owner = "mapview!la", name = "W", descriptor = "Lea;")
    private static class10 field256 = class3.method8(")4shad", -33);

    @OriginalMember(owner = "mapview!la", name = "db", descriptor = "I")
    private static int field263 = -1;

    @OriginalMember(owner = "mapview!la", name = "fb", descriptor = "I")
    private static int field265 = 256;

    @OriginalMember(owner = "mapview!la", name = "hb", descriptor = "Lea;")
    private static class10 field267 = class3.method8("col=", -91);

    @OriginalMember(owner = "mapview!la", name = "eb", descriptor = "Lea;")
    private static class10 field264 = class3.method8(")4u", 109);

    @OriginalMember(owner = "mapview!la", name = "S", descriptor = "Lea;")
    private static class10 field252 = class3.method8("br", 95);

    @OriginalMember(owner = "mapview!la", name = "gb", descriptor = "Lea;")
    private static class10 field266 = class3.method8("str=", -76);

    @OriginalMember(owner = "mapview!la", name = "R", descriptor = "Lea;")
    private static class10 field251 = class3.method8("u=", -117);

    @OriginalMember(owner = "mapview!la", name = "lb", descriptor = "I")
    private static int field271 = -1;

    @OriginalMember(owner = "mapview!la", name = "mb", descriptor = "I")
    private static int field272 = 256;

    @OriginalMember(owner = "mapview!la", name = "ab", descriptor = "Lea;")
    private static class10 field260 = class3.method8("u", -21);

    @OriginalMember(owner = "mapview!la", name = "V", descriptor = "I")
    private static int field255 = 0;

    @OriginalMember(owner = "mapview!la", name = "ob", descriptor = "Lea;")
    private static class10 field274 = class3.method8("lt", -83);

    @OriginalMember(owner = "mapview!la", name = "bb", descriptor = "I")
    private static int field261 = -1;

    @OriginalMember(owner = "mapview!la", name = "qb", descriptor = "Lea;")
    private static class10 field276 = class3.method8(")4str", -79);

    @OriginalMember(owner = "mapview!la", name = "rb", descriptor = "Lea;")
    private static class10 field277 = class3.method8("gt", 126);

    @OriginalMember(owner = "mapview!la", name = "pb", descriptor = "[B")
    private byte[] field275;

    @OriginalMember(owner = "mapview!la", name = "ib", descriptor = "[I")
    private int[] field268;

    @OriginalMember(owner = "mapview!la", name = "X", descriptor = "[Lm;")
    private static class24[] field257;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Lea;IIII)V", line = 11)
    public final void method155(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method169(arg3, arg4);
            this.method166(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([B)V", line = 28)
    private final void method156(byte[] arg0) {
        this.field268 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field268.length; var2++) {
                this.field268[var2] = arg0[var2] & 0xFF;
            }
            this.field254 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field268[var4] = arg0[var3++] & 0xFF;
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
            byte var11 = 0;
            for (int var12 = 0; var12 < var9[var10].length; var12++) {
                var11 += arg0[var3++];
                var9[var10][var12] = var11;
            }
        }
        byte[][] var13 = new byte[256][];
        for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = new byte[var5[var14]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var13[var14].length; var16++) {
                var15 += arg0[var3++];
                var13[var14][var16] = var15;
            }
        }
        this.field275 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field275[(var17 << 8) + var18] = (byte) method158(var9, var13, var6, this.field268, var5, var17, var18);
                    }
                }
            }
        }
        this.field254 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Lea;)I", line = 150)
    public final int method157(class10 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field83; var5++) {
            int var6 = arg0.field78[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class10 var7 = arg0.method69(var5, -123, var2 + 1);
                    var2 = -1;
                    if (var7.method68(field274, -118)) {
                        var6 = 60;
                    } else {
                        if (!var7.method68(field277, -118)) {
                            if (var7.method61(-33, field262)) {
                                try {
                                    int var8 = var7.method67((byte) -83, 4).method59(10);
                                    var4 += field257[var8].field284;
                                    var3 = -1;
                                } catch (Exception var10) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field268[var6];
                    if (this.field275 != null && var3 != -1) {
                        var4 += this.field275[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 224)
    private static final int method158(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 735)
    public class23(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field244 = arg1;
        this.field273 = arg2;
        this.field269 = arg3;
        this.field270 = arg4;
        this.method156(arg0);
        this.field259 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field273[var10] < var8 && this.field270[var10] != 0) {
                var8 = this.field273[var10];
            }
            if (this.field273[var10] + this.field270[var10] > var9) {
                var9 = this.field273[var10] + this.field270[var10];
            }
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([I[BIIIIIIII)V", line = 296)
    public static final void method160(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(III)V", line = 327)
    private final void method161(int arg0, int arg1, int arg2) {
        field258 = -1;
        field271 = -1;
        field261 = arg1;
        field263 = arg1;
        field248 = arg0;
        field253 = arg0;
        field272 = arg2;
        field265 = arg2;
        field255 = 0;
        field250 = 0;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([I[BIIIIIII)V", line = 337)
    public static final void method162(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(Lea;IIII)V", line = 397)
    public final void method163(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method169(arg3, arg4);
            this.method166(arg0, arg1 - this.method157(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(IIIIIII)V", line = 427)
    private final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class27.field397 * arg2 + arg1;
        int var9 = class27.field397 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class27.field402) {
            int var12 = class27.field402 - arg2;
            arg4 -= var12;
            arg2 = class27.field402;
            var11 += arg3 * var12;
            var8 += class27.field397 * var12;
        }
        if (arg2 + arg4 > class27.field398) {
            arg4 -= arg2 + arg4 - class27.field398;
        }
        if (arg1 < class27.field401) {
            int var13 = class27.field401 - arg1;
            arg3 -= var13;
            arg1 = class27.field401;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class27.field400) {
            int var14 = arg1 + arg3 - class27.field400;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method160(class27.field399, this.field259[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Lea;II)V", line = 474)
    private final void method166(class10 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field254;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field83; var7++) {
            int var8 = arg0.field78[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class10 var9 = arg0.method69(var7, -123, var5 + 1);
                    var5 = -1;
                    if (var9.method68(field274, -118)) {
                        var8 = 60;
                    } else {
                        if (!var9.method68(field277, -118)) {
                            if (var9.method61(-33, field262)) {
                                try {
                                    int var10 = var9.method67((byte) -81, 4).method59(10);
                                    class24 var11 = field257[var10];
                                    var11.method175(arg1, this.field254 + var4 - var11.field280);
                                    arg1 += var11.field284;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method168(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field275 != null && var6 != -1) {
                        arg1 += this.field275[(var6 << 8) + var8];
                    }
                    int var13 = this.field269[var8];
                    int var14 = this.field270[var8];
                    if (var8 == 32) {
                        if (field255 > 0) {
                            field250 += field255;
                            arg1 += field250 >> 8;
                            field250 &= 0xFF;
                        }
                    } else if (field265 == 256) {
                        if (field263 != -1) {
                            this.method170(var8, this.field244[var8] + arg1 + 1, this.field273[var8] + var4 + 1, var13, var14, field263);
                        }
                        this.method164(var8, this.field244[var8] + arg1, this.field273[var8] + var4, var13, var14, field253);
                    } else {
                        if (field263 != -1) {
                            this.method165(var8, this.field244[var8] + arg1 + 1, this.field273[var8] + var4 + 1, var13, var14, field263, field265);
                        }
                        this.method159(var8, this.field244[var8] + arg1, this.field273[var8] + var4, var13, var14, field253, field265);
                    }
                    int var15 = this.field268[var8];
                    if (field258 != -1) {
                        class27.method198(arg1, (int) ((double) this.field254 * 0.7D) + var4, var15, field258);
                    }
                    if (field271 != -1) {
                        class27.method198(arg1, this.field254 + var4 + 1, var15, field271);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "()V", line = 585)
    public static void method167() {
        field274 = null;
        field277 = null;
        field262 = null;
        field252 = null;
        field267 = null;
        field246 = null;
        field251 = null;
        field260 = null;
        field264 = null;
        field247 = null;
        field245 = null;
        field256 = null;
        field266 = null;
        field249 = null;
        field276 = null;
        field257 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(Lea;)V", line = 608)
    private final void method168(class10 arg0) {
        try {
            if (arg0.method61(-33, field267)) {
                field253 = arg0.method67((byte) -111, 4).method63(16, -96);
            } else if (arg0.method68(field246, -118)) {
                field253 = field248;
            } else if (arg0.method61(-33, field266)) {
                field258 = arg0.method67((byte) -79, 4).method63(16, -96);
            } else if (arg0.method68(field249, -118)) {
                field258 = 8388608;
            } else if (arg0.method68(field276, -118)) {
                field258 = -1;
            } else if (arg0.method61(-33, field251)) {
                field271 = arg0.method67((byte) -123, 2).method63(16, -96);
            } else if (arg0.method68(field260, -118)) {
                field271 = 0;
            } else if (arg0.method68(field264, -118)) {
                field271 = -1;
            } else if (arg0.method61(-33, field247)) {
                field263 = arg0.method67((byte) -128, 5).method63(16, -96);
            } else if (arg0.method68(field245, -118)) {
                field263 = 0;
            } else if (arg0.method68(field256, -118)) {
                field263 = field261;
            } else if (arg0.method68(field252, -118)) {
                this.method161(field248, field261, field272);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(II)V", line = 661)
    private final void method169(int arg0, int arg1) {
        field258 = -1;
        field271 = -1;
        field261 = arg1;
        field263 = arg1;
        field248 = arg0;
        field253 = arg0;
        field272 = 256;
        field265 = 256;
        field255 = 0;
        field250 = 0;
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(IIIIII)V", line = 780)
    private final void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class27.field397 * arg2 + arg1;
        int var8 = class27.field397 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class27.field402) {
            int var11 = class27.field402 - arg2;
            arg4 -= var11;
            arg2 = class27.field402;
            var10 += arg3 * var11;
            var7 += class27.field397 * var11;
        }
        if (arg2 + arg4 > class27.field398) {
            arg4 -= arg2 + arg4 - class27.field398;
        }
        if (arg1 < class27.field401) {
            int var12 = class27.field401 - arg1;
            arg3 -= var12;
            arg1 = class27.field401;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class27.field400) {
            int var13 = arg1 + arg3 - class27.field400;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method162(class27.field399, this.field259[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(Lea;IIII)V", line = 829)
    public final void method171(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method169(arg3, arg4);
            this.method166(arg0, arg1 - this.method157(arg0), arg2);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(IIIIII)V")
    public abstract void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
