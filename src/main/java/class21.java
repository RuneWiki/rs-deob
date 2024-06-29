import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public abstract class class21 extends class23 {

    @OriginalMember(owner = "mapview!k", name = "K", descriptor = "[[B")
    public byte[][] field186 = new byte[256][];

    @OriginalMember(owner = "mapview!k", name = "Y", descriptor = "I")
    private int field200 = 0;

    @OriginalMember(owner = "mapview!k", name = "L", descriptor = "[I")
    private int[] field187;

    @OriginalMember(owner = "mapview!k", name = "B", descriptor = "[I")
    private int[] field177;

    @OriginalMember(owner = "mapview!k", name = "E", descriptor = "[I")
    private int[] field180;

    @OriginalMember(owner = "mapview!k", name = "db", descriptor = "[I")
    private int[] field205;

    @OriginalMember(owner = "mapview!k", name = "D", descriptor = "I")
    private static int field179 = 0;

    @OriginalMember(owner = "mapview!k", name = "M", descriptor = "Ls;")
    private static class34 field188 = class9.method35("lt", 220);

    @OriginalMember(owner = "mapview!k", name = "Q", descriptor = "Ls;")
    private static class34 field192 = class9.method35(")4col", 220);

    @OriginalMember(owner = "mapview!k", name = "T", descriptor = "Ls;")
    private static class34 field195 = class9.method35("gt", 220);

    @OriginalMember(owner = "mapview!k", name = "O", descriptor = "Ls;")
    private static class34 field190 = class9.method35("shy", 220);

    @OriginalMember(owner = "mapview!k", name = "J", descriptor = "Ls;")
    private static class34 field185 = class9.method35("euro", 220);

    @OriginalMember(owner = "mapview!k", name = "F", descriptor = "Ls;")
    private static class34 field181 = class9.method35("shad=", 220);

    @OriginalMember(owner = "mapview!k", name = "H", descriptor = "I")
    private static int field183 = -1;

    @OriginalMember(owner = "mapview!k", name = "W", descriptor = "Ls;")
    private static class34 field198 = class9.method35("reg", 220);

    @OriginalMember(owner = "mapview!k", name = "bb", descriptor = "Ls;")
    private static class34 field203 = class9.method35("shad", 220);

    @OriginalMember(owner = "mapview!k", name = "U", descriptor = "Ls;")
    private static class34 field196 = class9.method35("br", 220);

    @OriginalMember(owner = "mapview!k", name = "S", descriptor = "Ls;")
    private static class34 field194 = class9.method35("str=", 220);

    @OriginalMember(owner = "mapview!k", name = "X", descriptor = "I")
    private static int field199 = 0;

    @OriginalMember(owner = "mapview!k", name = "eb", descriptor = "I")
    private static int field206 = -1;

    @OriginalMember(owner = "mapview!k", name = "N", descriptor = "Ls;")
    private static class34 field189 = class9.method35("u", 220);

    @OriginalMember(owner = "mapview!k", name = "R", descriptor = "Ls;")
    private static class34 field193 = class9.method35("img=", 220);

    @OriginalMember(owner = "mapview!k", name = "ab", descriptor = "I")
    private static int field202 = 0;

    @OriginalMember(owner = "mapview!k", name = "V", descriptor = "Ls;")
    private static class34 field197 = class9.method35("str", 220);

    @OriginalMember(owner = "mapview!k", name = "kb", descriptor = "Ls;")
    private static class34 field212 = class9.method35("u=", 220);

    @OriginalMember(owner = "mapview!k", name = "ib", descriptor = "Ls;")
    private static class34 field210 = class9.method35(")4u", 220);

    @OriginalMember(owner = "mapview!k", name = "fb", descriptor = "Ls;")
    private static class34 field207 = class9.method35("times", 220);

    @OriginalMember(owner = "mapview!k", name = "hb", descriptor = "I")
    private static int field209 = 0;

    @OriginalMember(owner = "mapview!k", name = "C", descriptor = "I")
    private static int field178 = -1;

    @OriginalMember(owner = "mapview!k", name = "I", descriptor = "Ls;")
    private static class34 field184 = class9.method35("col=", 220);

    @OriginalMember(owner = "mapview!k", name = "lb", descriptor = "Ls;")
    private static class34 field213 = class9.method35(")4shad", 220);

    @OriginalMember(owner = "mapview!k", name = "cb", descriptor = "I")
    private static int field204 = -1;

    @OriginalMember(owner = "mapview!k", name = "jb", descriptor = "Ls;")
    private static class34 field211 = class9.method35("nbsp", 220);

    @OriginalMember(owner = "mapview!k", name = "gb", descriptor = "Ls;")
    private static class34 field208 = class9.method35(")4str", 220);

    @OriginalMember(owner = "mapview!k", name = "nb", descriptor = "I")
    private static int field215 = 256;

    @OriginalMember(owner = "mapview!k", name = "mb", descriptor = "I")
    private static int field214 = 256;

    @OriginalMember(owner = "mapview!k", name = "ob", descriptor = "Ls;")
    private static class34 field216 = class9.method35("copy", 220);

    @OriginalMember(owner = "mapview!k", name = "P", descriptor = "[B")
    private byte[] field191;

    @OriginalMember(owner = "mapview!k", name = "G", descriptor = "[I")
    private int[] field182;

    @OriginalMember(owner = "mapview!k", name = "Z", descriptor = "[Lba;")
    private static class4[] field201;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ls;)V", line = 11)
    private final void method99(class34 arg0) {
        try {
            if (arg0.method234((byte) -115, field184)) {
                field179 = arg0.method240((byte) -127, 4).method231(16, (byte) 80);
            } else if (arg0.method219(field192, 1)) {
                field179 = field199;
            } else if (arg0.method234((byte) -115, field194)) {
                field178 = arg0.method240((byte) -114, 4).method231(16, (byte) -128);
            } else if (arg0.method219(field197, 1)) {
                field178 = 8388608;
            } else if (arg0.method219(field208, 1)) {
                field178 = -1;
            } else if (arg0.method234((byte) -115, field212)) {
                field206 = arg0.method240((byte) -111, 2).method231(16, (byte) -123);
            } else if (arg0.method219(field189, 1)) {
                field206 = 0;
            } else if (arg0.method219(field210, 1)) {
                field206 = -1;
            } else if (arg0.method234((byte) -115, field181)) {
                field183 = arg0.method240((byte) -125, 5).method231(16, (byte) 127);
            } else if (arg0.method219(field203, 1)) {
                field183 = 0;
            } else if (arg0.method219(field213, 1)) {
                field183 = field204;
            } else if (arg0.method219(field196, 1)) {
                this.method100(field199, field204, field214);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(III)V", line = 69)
    private final void method100(int arg0, int arg1, int arg2) {
        field178 = -1;
        field206 = -1;
        field204 = arg1;
        field183 = arg1;
        field199 = arg0;
        field179 = arg0;
        field214 = arg2;
        field215 = arg2;
        field202 = 0;
        field209 = 0;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 88)
    private static final int method101(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([I[BIIIIIIII)V", line = 136)
    public static final void method102(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ls;IIII)V", line = 169)
    public final void method103(class34 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method109(arg3, arg4);
            this.method110(arg0, arg1 - this.method106(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(IIIIIII)V", line = 178)
    private final void method104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class23.field231 * arg2 + arg1;
        int var9 = class23.field231 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class23.field227) {
            int var12 = class23.field227 - arg2;
            arg4 -= var12;
            arg2 = class23.field227;
            var11 += arg3 * var12;
            var8 += class23.field231 * var12;
        }
        if (arg2 + arg4 > class23.field228) {
            arg4 -= arg2 + arg4 - class23.field228;
        }
        if (arg1 < class23.field229) {
            int var13 = class23.field229 - arg1;
            arg3 -= var13;
            arg1 = class23.field229;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class23.field232) {
            int var14 = arg1 + arg3 - class23.field232;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method102(class23.field226, this.field186[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 830)
    public class21(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field187 = arg1;
        this.field177 = arg2;
        this.field180 = arg3;
        this.field205 = arg4;
        this.method107(arg0);
        this.field186 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field177[var10] < var8 && this.field205[var10] != 0) {
                var8 = this.field177[var10];
            }
            if (this.field205[var10] + this.field177[var10] > var9) {
                var9 = this.field205[var10] + this.field177[var10];
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "()V", line = 260)
    public static void method105() {
        field188 = null;
        field195 = null;
        field211 = null;
        field190 = null;
        field207 = null;
        field185 = null;
        field216 = null;
        field198 = null;
        field193 = null;
        field196 = null;
        field184 = null;
        field192 = null;
        field212 = null;
        field189 = null;
        field210 = null;
        field181 = null;
        field203 = null;
        field213 = null;
        field194 = null;
        field197 = null;
        field208 = null;
        field201 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(Ls;)I", line = 294)
    public final int method106(class34 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field478; var5++) {
            int var6 = arg0.field475[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class34 var7 = arg0.method229(var2 + 1, -97, var5);
                    var2 = -1;
                    if (var7.method219(field188, 1)) {
                        var6 = 60;
                    } else if (var7.method219(field195, 1)) {
                        var6 = 62;
                    } else if (var7.method219(field211, 1)) {
                        var6 = 160;
                    } else if (var7.method219(field190, 1)) {
                        var6 = 173;
                    } else if (var7.method219(field207, 1)) {
                        var6 = 215;
                    } else if (var7.method219(field185, 1)) {
                        var6 = 128;
                    } else if (var7.method219(field216, 1)) {
                        var6 = 169;
                    } else {
                        if (!var7.method219(field198, 1)) {
                            if (var7.method234((byte) -115, field193)) {
                                try {
                                    int var8 = var7.method240((byte) -128, 4).method236((byte) -112);
                                    var4 += field201[var8].field34;
                                    var3 = -1;
                                } catch (Exception var10) {
                                }
                            }
                            continue;
                        }
                        var6 = 174;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field182[var6];
                    if (this.field191 != null && var3 != -1) {
                        var4 += this.field191[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([B)V", line = 387)
    private final void method107(byte[] arg0) {
        this.field182 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field182.length; var2++) {
                this.field182[var2] = arg0[var2] & 0xFF;
            }
            this.field200 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field182[var4] = arg0[var3++] & 0xFF;
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
        this.field191 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field191[(var17 << 8) + var18] = (byte) method101(var9, var13, var6, this.field182, var5, var17, var18);
                    }
                }
            }
        }
        this.field200 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(Ls;IIII)V", line = 538)
    public final void method108(class34 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method109(arg3, arg4);
            this.method110(arg0, arg1 - this.method106(arg0), arg2);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(II)V", line = 549)
    private final void method109(int arg0, int arg1) {
        field178 = -1;
        field206 = -1;
        field204 = arg1;
        field183 = arg1;
        field199 = arg0;
        field179 = arg0;
        field214 = 256;
        field215 = 256;
        field202 = 0;
        field209 = 0;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ls;II)V", line = 570)
    private final void method110(class34 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field200;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field478; var7++) {
            int var8 = arg0.field475[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class34 var9 = arg0.method229(var5 + 1, -97, var7);
                    var5 = -1;
                    if (var9.method219(field188, 1)) {
                        var8 = 60;
                    } else if (var9.method219(field195, 1)) {
                        var8 = 62;
                    } else if (var9.method219(field211, 1)) {
                        var8 = 160;
                    } else if (var9.method219(field190, 1)) {
                        var8 = 173;
                    } else if (var9.method219(field207, 1)) {
                        var8 = 215;
                    } else if (var9.method219(field185, 1)) {
                        var8 = 128;
                    } else if (var9.method219(field216, 1)) {
                        var8 = 169;
                    } else {
                        if (!var9.method219(field198, 1)) {
                            if (var9.method234((byte) -115, field193)) {
                                try {
                                    int var10 = var9.method240((byte) -114, 4).method236((byte) -128);
                                    class4 var11 = field201[var10];
                                    if (field215 == 256) {
                                        var11.method12(arg1, this.field200 + var4 - var11.field32);
                                    } else {
                                        var11.method11(arg1, this.field200 + var4 - var11.field32, field215);
                                    }
                                    arg1 += var11.field34;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method99(var9);
                            }
                            continue;
                        }
                        var8 = 174;
                    }
                }
                if (var5 == -1) {
                    if (this.field191 != null && var6 != -1) {
                        arg1 += this.field191[(var6 << 8) + var8];
                    }
                    int var13 = this.field180[var8];
                    int var14 = this.field205[var8];
                    if (var8 == 32) {
                        if (field202 > 0) {
                            field209 += field202;
                            arg1 += field209 >> 8;
                            field209 &= 0xFF;
                        }
                    } else if (field215 == 256) {
                        if (field183 != -1) {
                            this.method112(var8, this.field187[var8] + arg1 + 1, this.field177[var8] + var4 + 1, var13, var14, field183);
                        }
                        this.method97(var8, this.field187[var8] + arg1, this.field177[var8] + var4, var13, var14, field179);
                    } else {
                        if (field183 != -1) {
                            this.method104(var8, this.field187[var8] + arg1 + 1, this.field177[var8] + var4 + 1, var13, var14, field183, field215);
                        }
                        this.method98(var8, this.field187[var8] + arg1, this.field177[var8] + var4, var13, var14, field179, field215);
                    }
                    int var15 = this.field182[var8];
                    if (field178 != -1) {
                        class23.method117(arg1, (int) ((double) this.field200 * 0.7D) + var4, var15, field178);
                    }
                    if (field206 != -1) {
                        class23.method117(arg1, this.field200 + var4 + 1, var15, field206);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(Ls;IIII)V", line = 720)
    public final void method111(class34 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method109(arg3, arg4);
            this.method110(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(IIIIII)V", line = 769)
    private final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class23.field231 * arg2 + arg1;
        int var8 = class23.field231 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class23.field227) {
            int var11 = class23.field227 - arg2;
            arg4 -= var11;
            arg2 = class23.field227;
            var10 += arg3 * var11;
            var7 += class23.field231 * var11;
        }
        if (arg2 + arg4 > class23.field228) {
            arg4 -= arg2 + arg4 - class23.field228;
        }
        if (arg1 < class23.field229) {
            int var12 = class23.field229 - arg1;
            arg3 -= var12;
            arg1 = class23.field229;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class23.field232) {
            int var13 = arg1 + arg3 - class23.field232;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method113(class23.field226, this.field186[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([I[BIIIIIII)V", line = 872)
    public static final void method113(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(IIIIII)V")
    public abstract void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
