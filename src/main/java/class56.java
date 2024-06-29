import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class56 extends class99 {

    @OriginalMember(owner = "client!f", name = "rb", descriptor = "I")
    public int field1035 = 0;

    @OriginalMember(owner = "client!f", name = "Hb", descriptor = "[[B")
    public byte[][] field1051 = new byte[256][];

    @OriginalMember(owner = "client!f", name = "W", descriptor = "[I")
    private int[] field1014;

    @OriginalMember(owner = "client!f", name = "Ab", descriptor = "[I")
    private int[] field1044;

    @OriginalMember(owner = "client!f", name = "lb", descriptor = "[I")
    private int[] field1029;

    @OriginalMember(owner = "client!f", name = "Kb", descriptor = "[I")
    private int[] field1054;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    private static int field1013 = 0;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "Ldj;")
    private static class44 field1012 = class89.method650(255, "copy");

    @OriginalMember(owner = "client!f", name = "X", descriptor = "Ldj;")
    private static class44 field1015 = class89.method650(255, "br");

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "Ldj;")
    private static class44 field1028 = class89.method650(255, "nbsp");

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "Ldj;")
    private static class44 field1020 = class89.method650(255, ")4shad");

    @OriginalMember(owner = "client!f", name = "pb", descriptor = "Ldj;")
    private static class44 field1033 = class89.method650(255, "times");

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "Ldj;")
    private static class44 field1027 = class89.method650(255, ")4u");

    @OriginalMember(owner = "client!f", name = "ob", descriptor = "I")
    private static int field1032 = 256;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "Ldj;")
    private static class44 field1019 = class89.method650(255, "reg");

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    private static int field1024 = -1;

    @OriginalMember(owner = "client!f", name = "nb", descriptor = "Ldj;")
    private static class44 field1031 = class89.method650(255, "lt");

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    private static int field1009 = 0;

    @OriginalMember(owner = "client!f", name = "sb", descriptor = "I")
    private static int field1036 = 0;

    @OriginalMember(owner = "client!f", name = "zb", descriptor = "[Ldj;")
    private static class44[] field1043 = new class44[100];

    @OriginalMember(owner = "client!f", name = "vb", descriptor = "Ldj;")
    private static class44 field1039 = class89.method650(255, ")4col");

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "Ldj;")
    private static class44 field1018 = class89.method650(255, "img=");

    @OriginalMember(owner = "client!f", name = "yb", descriptor = "Ldj;")
    private static class44 field1042 = class89.method650(255, "trans=");

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "Ldj;")
    private static class44 field1016 = class89.method650(255, ")4trans");

    @OriginalMember(owner = "client!f", name = "db", descriptor = "Ldj;")
    private static class44 field1021 = class89.method650(255, "euro");

    @OriginalMember(owner = "client!f", name = "xb", descriptor = "Ldj;")
    private static class44 field1041 = class89.method650(255, "str");

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "Ldj;")
    private static class44 field1017 = class89.method650(255, "shad");

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "Ldj;")
    private static class44 field1025 = class89.method650(255, "col=");

    @OriginalMember(owner = "client!f", name = "Gb", descriptor = "Ldj;")
    private static class44 field1050 = class89.method650(255, "u=");

    @OriginalMember(owner = "client!f", name = "Ib", descriptor = "Ldj;")
    private static class44 field1052 = class89.method650(255, "str=");

    @OriginalMember(owner = "client!f", name = "Bb", descriptor = "I")
    private static int field1045 = 0;

    @OriginalMember(owner = "client!f", name = "tb", descriptor = "I")
    private static int field1037 = -1;

    @OriginalMember(owner = "client!f", name = "Fb", descriptor = "Ldj;")
    private static class44 field1049 = class89.method650(255, ")4str");

    @OriginalMember(owner = "client!f", name = "Eb", descriptor = "I")
    private static int field1048 = -1;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
    private static int field1023 = 256;

    @OriginalMember(owner = "client!f", name = "Cb", descriptor = "I")
    private static int field1046 = -1;

    @OriginalMember(owner = "client!f", name = "Db", descriptor = "Ldj;")
    private static class44 field1047 = class89.method650(255, "gt");

    @OriginalMember(owner = "client!f", name = "Jb", descriptor = "Ldj;")
    private static class44 field1053 = class89.method650(255, "u");

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "Ldj;")
    private static class44 field1026 = class89.method650(255, "shad=");

    @OriginalMember(owner = "client!f", name = "wb", descriptor = "Ldj;")
    private static class44 field1040 = class89.method650(255, "shy");

    @OriginalMember(owner = "client!f", name = "qb", descriptor = "[B")
    private byte[] field1034;

    @OriginalMember(owner = "client!f", name = "mb", descriptor = "[I")
    private int[] field1030;

    @OriginalMember(owner = "client!f", name = "ub", descriptor = "[I")
    private int[] field1038;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "[Lle;")
    private class125[] field1011;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)I")
    private final int method398(int arg0) {
        return this.field1030[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method399(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(III)V")
    private final void method400(int arg0, int arg1, int arg2) {
        field1024 = -1;
        field1048 = -1;
        field1037 = arg1;
        field1046 = arg1;
        field1013 = arg0;
        field1045 = arg0;
        field1032 = arg2;
        field1023 = arg2;
        field1036 = 0;
        field1009 = 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;IIII)V")
    public final void method401(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method418(arg3, arg4);
            this.method412(arg0, arg1 - this.method424(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method402(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;IIIIIIIII)I")
    public final int method403(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method415(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V")
    private final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class99.field1818 * arg2 + arg1;
        int var9 = class99.field1818 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class99.field1821) {
            int var12 = class99.field1821 - arg2;
            arg4 -= var12;
            arg2 = class99.field1821;
            var11 += arg3 * var12;
            var8 += class99.field1818 * var12;
        }
        if (arg2 + arg4 > class99.field1820) {
            arg4 -= arg2 + arg4 - class99.field1820;
        }
        if (arg1 < class99.field1819) {
            int var13 = class99.field1819 - arg1;
            arg3 -= var13;
            arg1 = class99.field1819;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class99.field1817) {
            int var14 = arg1 + arg3 - class99.field1817;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method399(class99.field1823, this.field1051[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method405(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;[I[Ldj;)I")
    private final int method406(class44 arg0, int[] arg1, class44[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class44 var6 = class136.method918(100, (byte) 109);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method340(3);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method302(-12540, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class44 var16 = arg0.method318(126, var14, var10 + 1);
                    var10 = -1;
                    var6.method307(1, 60);
                    var6.method337(var16, false);
                    var6.method307(1, 62);
                    if (var16.method314(field1015, -31)) {
                        arg2[var12++] = var6.method318(125, var6.method340(3), var5);
                        var5 = var6.method340(3);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method314(field1031, -28)) {
                        var4 += this.method398(60);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method314(field1047, -112)) {
                        var4 += this.method398(62);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method314(field1028, -96)) {
                        var4 += this.method398(160);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + 160];
                        }
                        var11 = 160;
                    } else if (var16.method314(field1040, -80)) {
                        var4 += this.method398(173);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + 173];
                        }
                        var11 = 173;
                    } else if (var16.method314(field1033, -65)) {
                        var4 += this.method398(215);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + 215];
                        }
                        var11 = 215;
                    } else if (var16.method314(field1021, -30)) {
                        var4 += this.method398(128);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + 128];
                        }
                        var11 = 128;
                    } else if (var16.method314(field1012, -118)) {
                        var4 += this.method398(169);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + 169];
                        }
                        var11 = 169;
                    } else if (var16.method314(field1019, -34)) {
                        var4 += this.method398(174);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + 174];
                        }
                        var11 = 174;
                    } else if (var16.method323(true, field1018)) {
                        try {
                            int var17 = var16.method332(4, (byte) 84).method331((byte) -83);
                            var4 += this.field1011[var17].field2272;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method307(1, var15);
                        var4 += this.method398(var15);
                        if (this.field1034 != null && var11 != -1) {
                            var4 += this.field1034[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method340(3);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method318(127, var7 - var9, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method340(3);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method340(3) > var5) {
            arg2[var12++] = var6.method318(125, var6.method340(3), var5);
        }
        return var12;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(IIIIII)V")
    public abstract void method407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;II[I[I)V")
    private final void method409(class44 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field1035;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field849; var10++) {
            int var11 = arg0.field822[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class44 var12 = arg0.method318(126, var10, var7 + 1);
                    var7 = -1;
                    if (var12.method314(field1031, -106)) {
                        var11 = 60;
                    } else if (var12.method314(field1047, -113)) {
                        var11 = 62;
                    } else if (var12.method314(field1028, -75)) {
                        var11 = 160;
                    } else if (var12.method314(field1040, -71)) {
                        var11 = 173;
                    } else if (var12.method314(field1033, -113)) {
                        var11 = 215;
                    } else if (var12.method314(field1021, -110)) {
                        var11 = 128;
                    } else if (var12.method314(field1012, -25)) {
                        var11 = 169;
                    } else {
                        if (!var12.method314(field1019, -91)) {
                            if (var12.method323(true, field1018)) {
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
                                    int var15 = var12.method332(4, (byte) 119).method331((byte) -83);
                                    class125 var16 = this.field1011[var15];
                                    int var17 = this.field1038 == null ? var16.field2267 : this.field1038[var15];
                                    if (field1023 == 256) {
                                        var16.method863(arg1 + var13, this.field1035 + var6 - var17 + var14);
                                    } else {
                                        var16.method861(arg1 + var13, this.field1035 + var6 - var17 + var14, field1023);
                                    }
                                    arg1 += var16.field2272;
                                    var8 = -1;
                                } catch (Exception var23) {
                                }
                            } else {
                                this.method411(var12);
                            }
                            continue;
                        }
                        var11 = 174;
                    }
                }
                if (var7 == -1) {
                    if (this.field1034 != null && var8 != -1) {
                        arg1 += this.field1034[(var8 << 8) + var11];
                    }
                    int var18 = this.field1029[var11];
                    int var19 = this.field1054[var11];
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
                        if (field1036 > 0) {
                            field1009 += field1036;
                            arg1 += field1009 >> 8;
                            field1009 &= 0xFF;
                        }
                    } else if (field1023 == 256) {
                        if (field1046 != -1) {
                            this.method420(var11, this.field1014[var11] + arg1 + var20 + 1, this.field1044[var11] + var6 + 1 + var21, var18, var19, field1046);
                        }
                        this.method407(var11, this.field1014[var11] + arg1 + var20, this.field1044[var11] + var6 + var21, var18, var19, field1045);
                    } else {
                        if (field1046 != -1) {
                            this.method404(var11, this.field1014[var11] + arg1 + var20 + 1, this.field1044[var11] + var6 + 1 + var21, var18, var19, field1046, field1023);
                        }
                        this.method408(var11, this.field1014[var11] + arg1 + var20, this.field1044[var11] + var6 + var21, var18, var19, field1045, field1023);
                    }
                    int var22 = this.field1030[var11];
                    if (field1024 != -1) {
                        class99.method704(arg1, (int) ((double) this.field1035 * 0.7D) + var6, var22, field1024);
                    }
                    if (field1048 != -1) {
                        class99.method704(arg1, this.field1035 + var6, var22, field1048);
                    }
                    arg1 += var22;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;I)I")
    public final int method410(class44 arg0, int arg1) {
        return this.method406(arg0, new int[] { arg1 }, field1043);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;)V")
    private final void method411(class44 arg0) {
        try {
            if (arg0.method323(true, field1025)) {
                field1045 = arg0.method332(4, (byte) 94).method319(-1, 16);
                return;
            }
            if (arg0.method314(field1039, -37)) {
                field1045 = field1013;
                return;
            }
            if (arg0.method323(true, field1042)) {
                field1023 = arg0.method332(6, (byte) 66).method331((byte) -83);
                return;
            }
            if (arg0.method314(field1016, -79)) {
                field1023 = field1032;
                return;
            }
            if (arg0.method323(true, field1052)) {
                field1024 = arg0.method332(4, (byte) 87).method319(-1, 16);
                return;
            }
            if (arg0.method314(field1041, -89)) {
                field1024 = 8388608;
                return;
            }
            if (arg0.method314(field1049, -78)) {
                field1024 = -1;
                return;
            }
            if (arg0.method323(true, field1050)) {
                field1048 = arg0.method332(2, (byte) 9).method319(-1, 16);
                return;
            }
            if (arg0.method314(field1053, -69)) {
                field1048 = 0;
                return;
            }
            if (arg0.method314(field1027, -65)) {
                field1048 = -1;
                return;
            }
            if (arg0.method323(true, field1026)) {
                field1046 = arg0.method332(5, (byte) 46).method319(-1, 16);
                return;
            }
            if (arg0.method314(field1017, -65)) {
                field1046 = 0;
                return;
            }
            if (arg0.method314(field1020, -100)) {
                field1046 = field1037;
                return;
            }
            if (arg0.method314(field1015, -42)) {
                this.method400(field1013, field1037, field1032);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;II)V")
    private final void method412(class44 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1035;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field849; var7++) {
            int var8 = arg0.field822[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class44 var9 = arg0.method318(125, var7, var5 + 1);
                    var5 = -1;
                    if (var9.method314(field1031, -80)) {
                        var8 = 60;
                    } else if (var9.method314(field1047, -57)) {
                        var8 = 62;
                    } else if (var9.method314(field1028, -93)) {
                        var8 = 160;
                    } else if (var9.method314(field1040, -48)) {
                        var8 = 173;
                    } else if (var9.method314(field1033, -31)) {
                        var8 = 215;
                    } else if (var9.method314(field1021, -43)) {
                        var8 = 128;
                    } else if (var9.method314(field1012, -32)) {
                        var8 = 169;
                    } else {
                        if (!var9.method314(field1019, -66)) {
                            if (var9.method323(true, field1018)) {
                                try {
                                    int var10 = var9.method332(4, (byte) 93).method331((byte) -83);
                                    class125 var11 = this.field1011[var10];
                                    int var12 = this.field1038 == null ? var11.field2267 : this.field1038[var10];
                                    if (field1023 == 256) {
                                        var11.method863(arg1, this.field1035 + var4 - var12);
                                    } else {
                                        var11.method861(arg1, this.field1035 + var4 - var12, field1023);
                                    }
                                    arg1 += var11.field2272;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method411(var9);
                            }
                            continue;
                        }
                        var8 = 174;
                    }
                }
                if (var5 == -1) {
                    if (this.field1034 != null && var6 != -1) {
                        arg1 += this.field1034[(var6 << 8) + var8];
                    }
                    int var13 = this.field1029[var8];
                    int var14 = this.field1054[var8];
                    if (var8 == 32) {
                        if (field1036 > 0) {
                            field1009 += field1036;
                            arg1 += field1009 >> 8;
                            field1009 &= 0xFF;
                        }
                    } else if (field1023 == 256) {
                        if (field1046 != -1) {
                            this.method420(var8, this.field1014[var8] + arg1 + 1, this.field1044[var8] + var4 + 1, var13, var14, field1046);
                        }
                        this.method407(var8, this.field1014[var8] + arg1, this.field1044[var8] + var4, var13, var14, field1045);
                    } else {
                        if (field1046 != -1) {
                            this.method404(var8, this.field1014[var8] + arg1 + 1, this.field1044[var8] + var4 + 1, var13, var14, field1046, field1023);
                        }
                        this.method408(var8, this.field1014[var8] + arg1, this.field1044[var8] + var4, var13, var14, field1045, field1023);
                    }
                    int var15 = this.field1030[var8];
                    if (field1024 != -1) {
                        class99.method704(arg1, (int) ((double) this.field1035 * 0.7D) + var4, var15, field1024);
                    }
                    if (field1048 != -1) {
                        class99.method704(arg1, this.field1035 + var4 + 1, var15, field1048);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;IIIII)V")
    public final void method413(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method418(arg3, arg4);
        int[] var7 = new int[arg0.field849];
        int[] var8 = new int[arg0.field849];
        for (int var9 = 0; var9 < arg0.field849; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method409(arg0, arg1 - this.method424(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([B)V")
    private final void method414(byte[] arg0) {
        this.field1030 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field1030.length; var2++) {
                this.field1030[var2] = arg0[var2] & 0xFF;
            }
            this.field1035 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field1030[var4] = arg0[var3++] & 0xFF;
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
        this.field1034 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field1034[(var13 << 8) + var14] = (byte) method405(var9, var11, var6, this.field1030, var5, var13, var14);
                    }
                }
            }
        }
        this.field1035 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;IIIIIIIIII)I")
    private final int method415(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method400(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field1035;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field1022 + this.field1010 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method406(arg0, var12, field1043);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field1022 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field1022 - this.field1010 - (var13 - 1) * arg10) / 2 + this.field1022 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field1010 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field1022 - this.field1010 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field1022 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method412(field1043[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method412(field1043[var16], arg1 + (arg3 - this.method424(field1043[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method412(field1043[var16], arg1 + arg3 - this.method424(field1043[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method412(field1043[var16], arg1, var14);
            } else {
                this.method421(field1043[var16], arg3);
                this.method412(field1043[var16], arg1, var14);
                field1036 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Ldj;I)I")
    public final int method416(class44 arg0, int arg1) {
        int var3 = this.method406(arg0, new int[] { arg1 }, field1043);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method424(field1043[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;IIIILjava/util/Random;I)I")
    public final int method417(class44 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method400(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field849];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field849; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method409(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
    private final void method418(int arg0, int arg1) {
        field1024 = -1;
        field1048 = -1;
        field1037 = arg1;
        field1046 = arg1;
        field1013 = arg0;
        field1045 = arg0;
        field1032 = 256;
        field1023 = 256;
        field1036 = 0;
        field1009 = 0;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Ldj;)Ldj;")
    public static final class44 method419(class44 arg0) {
        int var1 = arg0.method340(3);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field822[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class44 var4 = new class44();
        var4.field849 = var1 + var2;
        var4.field822 = new byte[var4.field849];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field822[var6];
            if (var7 == 60) {
                var4.field822[var5++] = 60;
                var4.field822[var5++] = 108;
                var4.field822[var5++] = 116;
                var4.field822[var5++] = 62;
            } else if (var7 == 62) {
                var4.field822[var5++] = 60;
                var4.field822[var5++] = 103;
                var4.field822[var5++] = 116;
                var4.field822[var5++] = 62;
            } else {
                var4.field822[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(IIIIII)V")
    private final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class99.field1818 * arg2 + arg1;
        int var8 = class99.field1818 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class99.field1821) {
            int var11 = class99.field1821 - arg2;
            arg4 -= var11;
            arg2 = class99.field1821;
            var10 += arg3 * var11;
            var7 += class99.field1818 * var11;
        }
        if (arg2 + arg4 > class99.field1820) {
            arg4 -= arg2 + arg4 - class99.field1820;
        }
        if (arg1 < class99.field1819) {
            int var12 = class99.field1819 - arg1;
            arg3 -= var12;
            arg1 = class99.field1819;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class99.field1817) {
            int var13 = arg1 + arg3 - class99.field1817;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method402(class99.field1823, this.field1051[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Ldj;I)V")
    private final void method421(class44 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method340(3); var5++) {
            int var6 = arg0.method302(-12540, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field1036 = (arg1 - this.method424(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldj;IIIIII)V")
    public final void method422(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method418(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field849];
        for (int var11 = 0; var11 < arg0.field849; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method409(arg0, arg1 - this.method424(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
    public static void method423() {
        field1031 = null;
        field1047 = null;
        field1028 = null;
        field1040 = null;
        field1033 = null;
        field1021 = null;
        field1012 = null;
        field1019 = null;
        field1018 = null;
        field1015 = null;
        field1025 = null;
        field1039 = null;
        field1042 = null;
        field1016 = null;
        field1050 = null;
        field1053 = null;
        field1027 = null;
        field1026 = null;
        field1017 = null;
        field1020 = null;
        field1052 = null;
        field1041 = null;
        field1049 = null;
        field1043 = null;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Ldj;)I")
    public final int method424(class44 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field849; var5++) {
            int var6 = arg0.field822[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class44 var7 = arg0.method318(126, var5, var2 + 1);
                    var2 = -1;
                    if (var7.method314(field1031, -63)) {
                        var6 = 60;
                    } else if (var7.method314(field1047, -81)) {
                        var6 = 62;
                    } else if (var7.method314(field1028, -93)) {
                        var6 = 160;
                    } else if (var7.method314(field1040, -66)) {
                        var6 = 173;
                    } else if (var7.method314(field1033, -58)) {
                        var6 = 215;
                    } else if (var7.method314(field1021, -33)) {
                        var6 = 128;
                    } else if (var7.method314(field1012, -80)) {
                        var6 = 169;
                    } else {
                        if (!var7.method314(field1019, -118)) {
                            if (var7.method323(true, field1018)) {
                                try {
                                    int var8 = var7.method332(4, (byte) 71).method331((byte) -83);
                                    var4 += this.field1011[var8].field2272;
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
                    var4 += this.field1030[var6];
                    if (this.field1034 != null && var3 != -1) {
                        var4 += this.field1034[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Ldj;IIIII)V")
    public final void method425(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method418(arg3, arg4);
        int[] var7 = new int[arg0.field849];
        for (int var8 = 0; var8 < arg0.field849; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method409(arg0, arg1 - this.method424(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Ldj;IIII)V")
    public final void method426(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method418(arg3, arg4);
            this.method412(arg0, arg1 - this.method424(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([Lle;[I)V")
    public final void method427(class125[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field1011 = arg0;
        this.field1038 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Ldj;IIII)V")
    public final void method428(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method418(arg3, arg4);
            this.method412(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class56(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field1014 = arg1;
        this.field1044 = arg2;
        this.field1029 = arg3;
        this.field1054 = arg4;
        this.method414(arg0);
        this.field1051 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1044[var10] < var8 && this.field1054[var10] != 0) {
                var8 = this.field1044[var10];
            }
            if (this.field1054[var10] + this.field1044[var10] > var9) {
                var9 = this.field1054[var10] + this.field1044[var10];
            }
        }
        this.field1022 = this.field1035 - var8;
        this.field1010 = var9 - this.field1035;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
    public class56(byte[] arg0) {
        this.method414(arg0);
    }
}
