import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 extends class7 {

    @OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
    public int field1041 = 0;

    @OriginalMember(owner = "client!gb", name = "vb", descriptor = "[[B")
    private byte[][] field1034 = new byte[256][];

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "Ljava/util/Random;")
    private Random field1022 = new Random();

    @OriginalMember(owner = "client!gb", name = "Bb", descriptor = "[I")
    private int[] field1040;

    @OriginalMember(owner = "client!gb", name = "tb", descriptor = "[I")
    private int[] field1032;

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "[I")
    private int[] field1021;

    @OriginalMember(owner = "client!gb", name = "Fb", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "client!gb", name = "Gb", descriptor = "I")
    private int field1045;

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "Loa;")
    private static class98 field1023 = class38.method349(255, "lre");

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "Loa;")
    private static class98 field1028 = class38.method349(255, "gr3");

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "Loa;")
    private static class98 field1027 = class38.method349(255, "or1");

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "Loa;")
    private static class98 field1017 = class38.method349(255, "bla");

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "Loa;")
    private static class98 field1019 = class38.method349(255, "gr1");

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "Loa;")
    private static class98 field1026 = class38.method349(255, "or2");

    @OriginalMember(owner = "client!gb", name = "xb", descriptor = "[Loa;")
    private static class98[] field1036 = new class98[100];

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "Loa;")
    private static class98 field1024 = class38.method349(255, "mag");

    @OriginalMember(owner = "client!gb", name = "sb", descriptor = "Loa;")
    private static class98 field1031 = class38.method349(255, "red");

    @OriginalMember(owner = "client!gb", name = "yb", descriptor = "Loa;")
    private static class98 field1037 = class38.method349(255, "cya");

    @OriginalMember(owner = "client!gb", name = "wb", descriptor = "Loa;")
    private static class98 field1035 = class38.method349(255, "blu");

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "Loa;")
    private static class98 field1018 = class38.method349(255, "dbl");

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "Loa;")
    private static class98 field1029 = class38.method349(255, "gr2");

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "Loa;")
    private static class98 field1025 = class38.method349(255, "str");

    @OriginalMember(owner = "client!gb", name = "rb", descriptor = "Loa;")
    private static class98 field1030 = class38.method349(255, "dre");

    @OriginalMember(owner = "client!gb", name = "zb", descriptor = "Loa;")
    private static class98 field1038 = class38.method349(255, "whi");

    @OriginalMember(owner = "client!gb", name = "ub", descriptor = "Loa;")
    private static class98 field1033 = class38.method349(255, "gre");

    @OriginalMember(owner = "client!gb", name = "Eb", descriptor = "Loa;")
    private static class98 field1043 = class38.method349(255, "@str@");

    @OriginalMember(owner = "client!gb", name = "Db", descriptor = "Loa;")
    private static class98 field1042 = class38.method349(255, "or3");

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "Loa;")
    private static class98 field1020 = class38.method349(255, "yel");

    @OriginalMember(owner = "client!gb", name = "Ab", descriptor = "Z")
    private static boolean field1039 = false;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIIIII)V")
    private static final void method379(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class7.field119 * arg2 + arg1;
        int var8 = class7.field119 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class7.field115) {
            int var11 = class7.field115 - arg2;
            arg4 -= var11;
            arg2 = class7.field115;
            var10 += arg3 * var11;
            var7 += class7.field119 * var11;
        }
        if (arg2 + arg4 > class7.field121) {
            arg4 -= arg2 + arg4 - class7.field121;
        }
        if (arg1 < class7.field118) {
            int var12 = class7.field118 - arg1;
            arg3 -= var12;
            arg1 = class7.field118;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class7.field116) {
            int var13 = arg1 + arg3 - class7.field116;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method400(class7.field117, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method380(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;IIIZ)V")
    public final void method381(class98 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method386(arg0, arg1 - this.method384(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Loa;IIIZ)V")
    public final void method382(class98 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method386(arg0, arg1 - this.method384(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;III)V")
    public final void method383(class98 arg0, int arg1, int arg2, int arg3) {
        this.method391(arg0, arg1 - this.method398(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;)I")
    public final int method384(class98 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2277; var3++) {
            if (arg0.field2255[var3] == 64 && var3 + 4 < arg0.field2277 && arg0.field2255[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field1032[arg0.field2255[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIIII)V")
    private static final void method385(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class7.field119 * arg2 + arg1;
        int var7 = class7.field119 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class7.field115) {
            int var10 = class7.field115 - arg2;
            arg4 -= var10;
            arg2 = class7.field115;
            var9 += arg3 * var10;
            var6 += class7.field119 * var10;
        }
        if (arg2 + arg4 > class7.field121) {
            arg4 -= arg2 + arg4 - class7.field121;
        }
        if (arg1 < class7.field118) {
            int var11 = class7.field118 - arg1;
            arg3 -= var11;
            arg1 = class7.field118;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class7.field116) {
            int var12 = arg1 + arg3 - class7.field116;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method380(class7.field117, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Loa;IIIZ)V")
    public final void method386(class98 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1039 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field1041;
        for (int var8 = 0; var8 < arg0.field2277; var8++) {
            if (arg0.field2255[var8] == 64 && var8 + 4 < arg0.field2277 && arg0.field2255[var8 + 4] == 64) {
                int var9 = this.method401(arg0.method815(var8 + 4, 108, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2255[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method385(this.field1034[var10], arg1 + 1, this.field1040[var10] + var7 + 1, this.field1032[var10], this.field1021[var10], 0);
                    }
                    method385(this.field1034[var10], arg1, this.field1040[var10] + var7, this.field1032[var10], this.field1021[var10], arg3);
                }
                arg1 += this.field1032[var10];
            }
        }
        if (field1039) {
            class7.method43(var6, (int) ((double) this.field1041 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;IIIIIZIII)V")
    public final void method387(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field1041;
        }
        boolean var11 = true;
        if (arg4 < this.field1045 + this.field1044 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method394(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field1044 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field1044 - this.field1045 - (var12 - 1) * arg9) / 2 + this.field1044 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field1045 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field1044 - this.field1045 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field1044 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method386(field1036[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method381(field1036[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method382(field1036[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method386(field1036[var15], arg1, var13, arg5, arg6);
            } else {
                this.method395(field1036[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Loa;III)V")
    public final void method388(class98 arg0, int arg1, int arg2, int arg3) {
        this.method391(arg0, arg1 - this.method398(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;IIII)V")
    public final void method389(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method398(arg0) / 2;
        int var7 = arg2 - this.field1041;
        for (int var8 = 0; var8 < arg0.field2277; var8++) {
            int var9 = arg0.field2255[var8] & 0xFF;
            if (var9 != 32) {
                method385(this.field1034[var9], var6, this.field1040[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field1032[var9], this.field1021[var9], arg3);
            }
            var6 += this.field1032[var9];
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Loa;IIII)V")
    public final void method390(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method398(arg0) / 2;
        int var7 = arg2 - this.field1041;
        for (int var8 = 0; var8 < arg0.method790(105); var8++) {
            int var9 = arg0.field2255[var8] & 0xFF;
            if (var9 != 32) {
                method385(this.field1034[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field1040[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field1032[var9], this.field1021[var9], arg3);
            }
            var6 += this.field1032[var9];
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Loa;III)V")
    public final void method391(class98 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field1041;
        for (int var6 = 0; var6 < arg0.field2277; var6++) {
            int var7 = arg0.field2255[var6] & 0xFF;
            if (var7 != 32) {
                method385(this.field1034[var7], arg1, this.field1040[var7] + var5, this.field1032[var7], this.field1021[var7], arg3);
            }
            arg1 += this.field1032[var7];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;I)I")
    public final int method392(class98 arg0, int arg1) {
        return this.method394(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;IIIII)V")
    public final void method393(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method398(arg0) / 2;
        int var10 = arg2 - this.field1041;
        for (int var11 = 0; var11 < arg0.method790(83); var11++) {
            int var12 = arg0.field2255[var11] & 0xFF;
            if (var12 != 32) {
                method385(this.field1034[var12], var9, this.field1040[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field1032[var12], this.field1021[var12], arg3);
            }
            var9 += this.field1032[var12];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;IZ)I")
    private final int method394(class98 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class98 var6 = class88.method721(false, 100);
        int var7 = -1;
        int var8 = 0;
        class98 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method790(105);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method813(var15, -9128);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method813(var15 + 4, -9128) == 64) {
                class98 var17 = arg0.method815(var15 + 5, -86, var15);
                if (var17.method801((byte) -101, field1025)) {
                    var11 = true;
                    var12 = var6.method790(124);
                } else {
                    var9 = var17;
                    var10 = var6.method790(94);
                }
                var6.method798((byte) 62, var17);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method813(var15 + 1, -9128) == 110) {
                field1036[var13++] = var6.method815(var6.method790(91), -82, var5).method789(true);
                var5 = var6.method790(113);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method779(var16, 124);
                var4 += this.method396(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method790(100);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field1036[var13++] = var6.method815(var7, -89, var5).method789(true);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method800((byte) 111, var9, var5);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method800((byte) 52, field1043, var5);
                    }
                }
            }
        }
        if (var6.method790(119) > var5) {
            field1036[var13++] = var6.method815(var6.method790(122), -121, var5).method789(true);
        }
        return var13;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loa;IIIZI)V")
    private final void method395(class98 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class98 var7 = arg0.method789(true);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method790(126); var9++) {
            if (var7.method813(var9, -9128) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method384(var7)) * 256 / var8;
        }
        field1039 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field1041;
        for (int var14 = 0; var14 < var7.field2277; var14++) {
            if (var7.field2255[var14] == 64 && var14 + 4 < var7.field2277 && var7.field2255[var14 + 4] == 64) {
                int var15 = this.method401(var7.method815(var14 + 4, -121, var14 + 1));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2255[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        method385(this.field1034[var16], arg1 + 1, this.field1040[var16] + var13 + 1, this.field1032[var16], this.field1021[var16], 0);
                    }
                    method385(this.field1034[var16], arg1, this.field1040[var16] + var13, this.field1032[var16], this.field1021[var16], arg3);
                }
                arg1 += this.field1032[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (field1039) {
            class7.method43(var12, (int) ((double) this.field1041 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
    public final int method396(int arg0) {
        return this.field1032[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()V")
    public static void method397() {
        field1025 = null;
        field1043 = null;
        field1031 = null;
        field1033 = null;
        field1035 = null;
        field1020 = null;
        field1037 = null;
        field1024 = null;
        field1038 = null;
        field1017 = null;
        field1023 = null;
        field1030 = null;
        field1018 = null;
        field1027 = null;
        field1026 = null;
        field1042 = null;
        field1019 = null;
        field1029 = null;
        field1028 = null;
        field1036 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Loa;)I")
    public final int method398(class98 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2277; var3++) {
            var2 += this.field1032[arg0.field2255[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Loa;IIIZI)V")
    public final void method399(class98 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field1022.setSeed((long) arg5);
        int var7 = (this.field1022.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field1041;
        for (int var9 = 0; var9 < arg0.field2277; var9++) {
            if (arg0.field2255[var9] == 64 && var9 + 4 < arg0.field2277 && arg0.field2255[var9 + 4] == 64) {
                int var10 = this.method401(arg0.method815(var9 + 4, -106, var9 + 1));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2255[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        method379(this.field1034[var11], arg1 + 1, this.field1040[var11] + var8 + 1, this.field1032[var11], this.field1021[var11], 0, 192);
                    }
                    method379(this.field1034[var11], arg1, this.field1040[var11] + var8, this.field1032[var11], this.field1021[var11], arg3, var7);
                }
                arg1 += this.field1032[var11];
                if ((this.field1022.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method400(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Loa;)I")
    private final int method401(class98 arg0) {
        if (arg0.method801((byte) -121, field1031)) {
            return 16711680;
        } else if (arg0.method801((byte) -77, field1033)) {
            return 65280;
        } else if (arg0.method801((byte) -70, field1035)) {
            return 255;
        } else if (arg0.method801((byte) -86, field1020)) {
            return 16776960;
        } else if (arg0.method801((byte) -119, field1037)) {
            return 65535;
        } else if (arg0.method801((byte) -79, field1024)) {
            return 16711935;
        } else if (arg0.method801((byte) -106, field1038)) {
            return 16777215;
        } else if (arg0.method801((byte) -95, field1017)) {
            return 0;
        } else if (arg0.method801((byte) -113, field1023)) {
            return 16748608;
        } else if (arg0.method801((byte) -124, field1030)) {
            return 8388608;
        } else if (arg0.method801((byte) -55, field1018)) {
            return 128;
        } else if (arg0.method801((byte) -99, field1027)) {
            return 16756736;
        } else if (arg0.method801((byte) -128, field1026)) {
            return 16740352;
        } else if (arg0.method801((byte) -93, field1042)) {
            return 16723968;
        } else if (arg0.method801((byte) -72, field1019)) {
            return 12648192;
        } else if (arg0.method801((byte) -123, field1029)) {
            return 8453888;
        } else if (arg0.method801((byte) -83, field1028)) {
            return 4259584;
        } else {
            if (arg0.method801((byte) -80, field1025)) {
                field1039 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Loa;I)I")
    public final int method402(class98 arg0, int arg1) {
        int var3 = this.method394(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method398(field1036[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class45(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field1040 = arg0;
        this.field1032 = arg1;
        this.field1021 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field1034 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1040[var10] < var8 && this.field1021[var10] != 0) {
                var8 = this.field1040[var10];
            }
            if (this.field1040[var10] + this.field1021[var10] > var9) {
                var9 = this.field1040[var10] + this.field1021[var10];
            }
            byte[] var11 = this.field1034[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field1041 = this.field1040[32] + this.field1021[32];
        this.field1044 = this.field1041 - var8;
        this.field1045 = var9 - this.field1041;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
    public class45(byte[] arg0) {
        this.field1032 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field1032.length; var2++) {
            this.field1032[var2] = arg0[var2] & 0xFF;
        }
    }
}
