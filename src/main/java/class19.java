import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public abstract class class19 extends class13 {

    @OriginalMember(owner = "mapview!ja", name = "eb", descriptor = "[[B")
    public byte[][] field202 = new byte[256][];

    @OriginalMember(owner = "mapview!ja", name = "mb", descriptor = "I")
    private int field210 = 0;

    @OriginalMember(owner = "mapview!ja", name = "S", descriptor = "[I")
    private int[] field190;

    @OriginalMember(owner = "mapview!ja", name = "Q", descriptor = "[I")
    private int[] field188;

    @OriginalMember(owner = "mapview!ja", name = "jb", descriptor = "[I")
    private int[] field207;

    @OriginalMember(owner = "mapview!ja", name = "qb", descriptor = "[I")
    private int[] field214;

    @OriginalMember(owner = "mapview!ja", name = "O", descriptor = "I")
    private static int field186 = -1;

    @OriginalMember(owner = "mapview!ja", name = "L", descriptor = "Lna;")
    private static class26 field183 = class33.method219("lt", 122);

    @OriginalMember(owner = "mapview!ja", name = "G", descriptor = "Lna;")
    private static class26 field178 = class33.method219("gt", 100);

    @OriginalMember(owner = "mapview!ja", name = "U", descriptor = "I")
    private static int field192 = -1;

    @OriginalMember(owner = "mapview!ja", name = "D", descriptor = "Lna;")
    private static class26 field175 = class33.method219("u", 108);

    @OriginalMember(owner = "mapview!ja", name = "E", descriptor = "Lna;")
    private static class26 field176 = class33.method219("str", 81);

    @OriginalMember(owner = "mapview!ja", name = "R", descriptor = "I")
    private static int field189 = 0;

    @OriginalMember(owner = "mapview!ja", name = "H", descriptor = "Lna;")
    private static class26 field179 = class33.method219("str=", 105);

    @OriginalMember(owner = "mapview!ja", name = "F", descriptor = "Lna;")
    private static class26 field177 = class33.method219("nbsp", 86);

    @OriginalMember(owner = "mapview!ja", name = "Y", descriptor = "I")
    private static int field196 = 0;

    @OriginalMember(owner = "mapview!ja", name = "W", descriptor = "I")
    private static int field194 = 256;

    @OriginalMember(owner = "mapview!ja", name = "db", descriptor = "Lna;")
    private static class26 field201 = class33.method219(")4shad", 127);

    @OriginalMember(owner = "mapview!ja", name = "M", descriptor = "Lna;")
    private static class26 field184 = class33.method219(")4col", 96);

    @OriginalMember(owner = "mapview!ja", name = "cb", descriptor = "Lna;")
    private static class26 field200 = class33.method219("u=", 104);

    @OriginalMember(owner = "mapview!ja", name = "X", descriptor = "Lna;")
    private static class26 field195 = class33.method219("shad", 110);

    @OriginalMember(owner = "mapview!ja", name = "K", descriptor = "Lna;")
    private static class26 field182 = class33.method219(")4u", 90);

    @OriginalMember(owner = "mapview!ja", name = "N", descriptor = "I")
    private static int field185 = -1;

    @OriginalMember(owner = "mapview!ja", name = "T", descriptor = "Lna;")
    private static class26 field191 = class33.method219("br", 127);

    @OriginalMember(owner = "mapview!ja", name = "V", descriptor = "Lna;")
    private static class26 field193 = class33.method219("col=", 112);

    @OriginalMember(owner = "mapview!ja", name = "Z", descriptor = "Lna;")
    private static class26 field197 = class33.method219("img=", 118);

    @OriginalMember(owner = "mapview!ja", name = "bb", descriptor = "I")
    private static int field199 = -1;

    @OriginalMember(owner = "mapview!ja", name = "P", descriptor = "Lna;")
    private static class26 field187 = class33.method219("shy", 123);

    @OriginalMember(owner = "mapview!ja", name = "ab", descriptor = "Lna;")
    private static class26 field198 = class33.method219("copy", 121);

    @OriginalMember(owner = "mapview!ja", name = "lb", descriptor = "Lna;")
    private static class26 field209 = class33.method219("times", 108);

    @OriginalMember(owner = "mapview!ja", name = "fb", descriptor = "Lna;")
    private static class26 field203 = class33.method219(")4str", 84);

    @OriginalMember(owner = "mapview!ja", name = "ib", descriptor = "I")
    private static int field206 = 0;

    @OriginalMember(owner = "mapview!ja", name = "kb", descriptor = "Lna;")
    private static class26 field208 = class33.method219("reg", 117);

    @OriginalMember(owner = "mapview!ja", name = "hb", descriptor = "I")
    private static int field205 = 0;

    @OriginalMember(owner = "mapview!ja", name = "pb", descriptor = "Lna;")
    private static class26 field213 = class33.method219("shad=", 85);

    @OriginalMember(owner = "mapview!ja", name = "ob", descriptor = "Lna;")
    private static class26 field212 = class33.method219("euro", 127);

    @OriginalMember(owner = "mapview!ja", name = "nb", descriptor = "I")
    private static int field211 = 256;

    @OriginalMember(owner = "mapview!ja", name = "gb", descriptor = "[B")
    private byte[] field204;

    @OriginalMember(owner = "mapview!ja", name = "J", descriptor = "[I")
    private int[] field181;

    @OriginalMember(owner = "mapview!ja", name = "I", descriptor = "[Lea;")
    private static class9[] field180;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIIIIII)V", line = 4)
    private final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class13.field133 * arg2 + arg1;
        int var9 = class13.field133 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class13.field132) {
            int var12 = class13.field132 - arg2;
            arg4 -= var12;
            arg2 = class13.field132;
            var11 += arg3 * var12;
            var8 += class13.field133 * var12;
        }
        if (arg2 + arg4 > class13.field127) {
            arg4 -= arg2 + arg4 - class13.field127;
        }
        if (arg1 < class13.field129) {
            int var13 = class13.field129 - arg1;
            arg3 -= var13;
            arg1 = class13.field129;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class13.field131) {
            int var14 = arg1 + arg3 - class13.field131;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method105(class13.field128, this.field202[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([I[BIIIIIII)V", line = 52)
    public static final void method98(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Lna;IIII)V", line = 107)
    public final void method99(class26 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method108(arg3, arg4);
            this.method102(arg0, arg1 - this.method104(arg0), arg2);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(Lna;IIII)V", line = 116)
    public final void method100(class26 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method108(arg3, arg4);
            this.method102(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "()V", line = 127)
    public static void method101() {
        field183 = null;
        field178 = null;
        field177 = null;
        field187 = null;
        field209 = null;
        field212 = null;
        field198 = null;
        field208 = null;
        field197 = null;
        field191 = null;
        field193 = null;
        field184 = null;
        field200 = null;
        field175 = null;
        field182 = null;
        field213 = null;
        field195 = null;
        field201 = null;
        field179 = null;
        field176 = null;
        field203 = null;
        field180 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Lna;II)V", line = 156)
    private final void method102(class26 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field210;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field404; var7++) {
            int var8 = arg0.field405[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class26 var9 = arg0.method187(var5 + 1, var7, 93);
                    var5 = -1;
                    if (var9.method181(-1, field183)) {
                        var8 = 60;
                    } else if (var9.method181(-1, field178)) {
                        var8 = 62;
                    } else if (var9.method181(-1, field177)) {
                        var8 = 160;
                    } else if (var9.method181(-1, field187)) {
                        var8 = 173;
                    } else if (var9.method181(-1, field209)) {
                        var8 = 215;
                    } else if (var9.method181(-1, field212)) {
                        var8 = 128;
                    } else if (var9.method181(-1, field198)) {
                        var8 = 169;
                    } else {
                        if (!var9.method181(-1, field208)) {
                            if (var9.method189(96, field197)) {
                                try {
                                    int var10 = var9.method178(4, (byte) -127).method165(-24103);
                                    class9 var11 = field180[var10];
                                    if (field211 == 256) {
                                        var11.method44(arg1, this.field210 + var4 - var11.field88);
                                    } else {
                                        var11.method48(arg1, this.field210 + var4 - var11.field88, field211);
                                    }
                                    arg1 += var11.field84;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method109(var9);
                            }
                            continue;
                        }
                        var8 = 174;
                    }
                }
                if (var5 == -1) {
                    if (this.field204 != null && var6 != -1) {
                        arg1 += this.field204[(var6 << 8) + var8];
                    }
                    int var13 = this.field207[var8];
                    int var14 = this.field214[var8];
                    if (var8 == 32) {
                        if (field205 > 0) {
                            field189 += field205;
                            arg1 += field189 >> 8;
                            field189 &= 0xFF;
                        }
                    } else if (field211 == 256) {
                        if (field185 != -1) {
                            this.method103(var8, this.field190[var8] + arg1 + 1, this.field188[var8] + var4 + 1, var13, var14, field185);
                        }
                        this.method112(var8, this.field190[var8] + arg1, this.field188[var8] + var4, var13, var14, field196);
                    } else {
                        if (field185 != -1) {
                            this.method97(var8, this.field190[var8] + arg1 + 1, this.field188[var8] + var4 + 1, var13, var14, field185, field211);
                        }
                        this.method106(var8, this.field190[var8] + arg1, this.field188[var8] + var4, var13, var14, field196, field211);
                    }
                    int var15 = this.field181[var8];
                    if (field192 != -1) {
                        class13.method75(arg1, (int) ((double) this.field210 * 0.7D) + var4, var15, field192);
                    }
                    if (field186 != -1) {
                        class13.method75(arg1, this.field210 + var4 + 1, var15, field186);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(IIIIII)V", line = 295)
    private final void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class13.field133 * arg2 + arg1;
        int var8 = class13.field133 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class13.field132) {
            int var11 = class13.field132 - arg2;
            arg4 -= var11;
            arg2 = class13.field132;
            var10 += arg3 * var11;
            var7 += class13.field133 * var11;
        }
        if (arg2 + arg4 > class13.field127) {
            arg4 -= arg2 + arg4 - class13.field127;
        }
        if (arg1 < class13.field129) {
            int var12 = class13.field129 - arg1;
            arg3 -= var12;
            arg1 = class13.field129;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class13.field131) {
            int var13 = arg1 + arg3 - class13.field131;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method98(class13.field128, this.field202[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Lna;)I", line = 352)
    public final int method104(class26 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field404; var5++) {
            int var6 = arg0.field405[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class26 var7 = arg0.method187(var2 + 1, var5, -70);
                    var2 = -1;
                    if (var7.method181(-1, field183)) {
                        var6 = 60;
                    } else if (var7.method181(-1, field178)) {
                        var6 = 62;
                    } else if (var7.method181(-1, field177)) {
                        var6 = 160;
                    } else if (var7.method181(-1, field187)) {
                        var6 = 173;
                    } else if (var7.method181(-1, field209)) {
                        var6 = 215;
                    } else if (var7.method181(-1, field212)) {
                        var6 = 128;
                    } else if (var7.method181(-1, field198)) {
                        var6 = 169;
                    } else {
                        if (!var7.method181(-1, field208)) {
                            if (var7.method189(-74, field197)) {
                                try {
                                    int var8 = var7.method178(4, (byte) -127).method165(-24103);
                                    var4 += field180[var8].field84;
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
                    var4 += this.field181[var6];
                    if (this.field204 != null && var3 != -1) {
                        var4 += this.field204[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([I[BIIIIIIII)V", line = 447)
    public static final void method105(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(III)V", line = 496)
    private final void method107(int arg0, int arg1, int arg2) {
        field192 = -1;
        field186 = -1;
        field199 = arg1;
        field185 = arg1;
        field206 = arg0;
        field196 = arg0;
        field194 = arg2;
        field211 = arg2;
        field205 = 0;
        field189 = 0;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II)V", line = 510)
    private final void method108(int arg0, int arg1) {
        field192 = -1;
        field186 = -1;
        field199 = arg1;
        field185 = arg1;
        field206 = arg0;
        field196 = arg0;
        field194 = 256;
        field211 = 256;
        field205 = 0;
        field189 = 0;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(Lna;)V", line = 523)
    private final void method109(class26 arg0) {
        try {
            if (arg0.method189(47, field193)) {
                field196 = arg0.method178(4, (byte) -127).method182(-117, 16);
            } else if (arg0.method181(-1, field184)) {
                field196 = field206;
            } else if (arg0.method189(-75, field179)) {
                field192 = arg0.method178(4, (byte) -127).method182(10, 16);
            } else if (arg0.method181(-1, field176)) {
                field192 = 8388608;
            } else if (arg0.method181(-1, field203)) {
                field192 = -1;
            } else if (arg0.method189(82, field200)) {
                field186 = arg0.method178(2, (byte) -127).method182(-83, 16);
            } else if (arg0.method181(-1, field175)) {
                field186 = 0;
            } else if (arg0.method181(-1, field182)) {
                field186 = -1;
            } else if (arg0.method189(-126, field213)) {
                field185 = arg0.method178(5, (byte) -127).method182(100, 16);
            } else if (arg0.method181(-1, field195)) {
                field185 = 0;
            } else if (arg0.method181(-1, field201)) {
                field185 = field199;
            } else if (arg0.method181(-1, field191)) {
                this.method107(field206, field199, field194);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([B)V", line = 586)
    private final void method110(byte[] arg0) {
        this.field181 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field181.length; var2++) {
                this.field181[var2] = arg0[var2] & 0xFF;
            }
            this.field210 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field181[var4] = arg0[var3++] & 0xFF;
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
        this.field204 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field204[(var17 << 8) + var18] = (byte) method111(var9, var13, var6, this.field181, var5, var17, var18);
                    }
                }
            }
        }
        this.field210 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 707)
    private static final int method111(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 887)
    public class19(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field190 = arg1;
        this.field188 = arg2;
        this.field207 = arg3;
        this.field214 = arg4;
        this.method110(arg0);
        this.field202 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field188[var10] < var8 && this.field214[var10] != 0) {
                var8 = this.field188[var10];
            }
            if (this.field214[var10] + this.field188[var10] > var9) {
                var9 = this.field214[var10] + this.field188[var10];
            }
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(Lna;IIII)V", line = 871)
    public final void method113(class26 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method108(arg3, arg4);
            this.method102(arg0, arg1 - this.method104(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(IIIIII)V")
    public abstract void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
