import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 extends class74 {

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public int field184 = 0;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "[[B")
    private byte[][] field182 = new byte[256][];

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "Ljava/util/Random;")
    private Random field185 = new Random();

    @OriginalMember(owner = "client!bb", name = "xb", descriptor = "Z")
    private boolean field210 = false;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "[I")
    private int[] field190;

    @OriginalMember(owner = "client!bb", name = "ub", descriptor = "[I")
    private int[] field207;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "[I")
    private int[] field192;

    @OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lae;")
    private static class6 field191 = class64.method474(106, "mag");

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "Lae;")
    private static class6 field183 = class64.method474(107, "or3");

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "Lae;")
    private static class6 field189 = class64.method474(126, "or2");

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "[Lae;")
    private static class6[] field199 = new class6[100];

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lae;")
    private static class6 field187 = class64.method474(104, "whi");

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lae;")
    private static class6 field194 = class64.method474(104, "@str@");

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "Lae;")
    private static class6 field193 = class64.method474(126, "cya");

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lae;")
    private static class6 field186 = class64.method474(122, "dbl");

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "Lae;")
    private static class6 field200 = class64.method474(121, "gr3");

    @OriginalMember(owner = "client!bb", name = "ob", descriptor = "Lae;")
    private static class6 field201 = class64.method474(116, "gr1");

    @OriginalMember(owner = "client!bb", name = "pb", descriptor = "Lae;")
    private static class6 field202 = class64.method474(122, "or1");

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "Lae;")
    private static class6 field198 = class64.method474(124, "dre");

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lae;")
    private static class6 field188 = class64.method474(126, "str");

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lae;")
    private static class6 field196 = class64.method474(117, "red");

    @OriginalMember(owner = "client!bb", name = "tb", descriptor = "Lae;")
    private static class6 field206 = class64.method474(106, "gre");

    @OriginalMember(owner = "client!bb", name = "sb", descriptor = "Lae;")
    private static class6 field205 = class64.method474(115, "yel");

    @OriginalMember(owner = "client!bb", name = "qb", descriptor = "Lae;")
    private static class6 field203 = class64.method474(120, "lre");

    @OriginalMember(owner = "client!bb", name = "rb", descriptor = "Lae;")
    private static class6 field204 = class64.method474(112, "blu");

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lae;")
    private static class6 field197 = class64.method474(123, "gr2");

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lae;")
    private static class6 field195 = class64.method474(107, "bla");

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 867)
    public class9(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field190 = arg0;
        this.field207 = arg1;
        this.field192 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field182 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field190[var10] < var8) {
                var8 = this.field190[var10];
            }
            if (this.field192[var10] + this.field190[var10] > var9) {
                var9 = this.field192[var10] + this.field190[var10];
            }
            byte[] var11 = this.field182[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field184 = this.field192[32] + this.field190[32];
        this.field209 = this.field184 - var8;
        this.field208 = var9 - this.field184;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V", line = 924)
    public class9(byte[] arg0) {
        this.field207 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field207.length; var2++) {
            this.field207[var2] = arg0[var2] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;IIIIIZIII)V", line = 11)
    public final void method84(class6 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field209;
        }
        boolean var11 = true;
        if (arg4 < this.field209 + this.field208 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method107(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field209 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field209 - this.field208 - (var12 - 1) * arg9) / 2 + this.field209 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field208 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field209 - this.field208 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field209 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method94(field199[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method95(field199[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method86(field199[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method94(field199[var15], arg1, var13, arg5, arg6);
            } else {
                this.method92(field199[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;IIIII)V", line = 79)
    public final void method85(class6 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method96(arg0) / 2;
        int var10 = arg2 - this.field184;
        for (int var11 = 0; var11 < arg0.method41(-8521); var11++) {
            int var12 = arg0.field114[var11] & 0xFF;
            if (var12 != 32) {
                this.method101(this.field182[var12], var9, this.field190[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field207[var12], this.field192[var12], arg3);
            }
            var9 += this.field207[var12];
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;IIIZ)V", line = 105)
    public final void method86(class6 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method94(arg0, arg1 - this.method105(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIIIIII)V", line = 109)
    private final void method87(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class74.field1683 * arg2 + arg1;
        int var9 = class74.field1683 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class74.field1682) {
            int var12 = class74.field1682 - arg2;
            arg4 -= var12;
            arg2 = class74.field1682;
            var11 += arg3 * var12;
            var8 += class74.field1683 * var12;
        }
        if (arg2 + arg4 > class74.field1681) {
            arg4 -= arg2 + arg4 - class74.field1681;
        }
        if (arg1 < class74.field1686) {
            int var13 = class74.field1686 - arg1;
            arg3 -= var13;
            arg1 = class74.field1686;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class74.field1685) {
            int var14 = arg1 + arg3 - class74.field1685;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method99(class74.field1680, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;III)V", line = 161)
    public final void method88(class6 arg0, int arg1, int arg2, int arg3) {
        this.method106(arg0, arg1 - this.method96(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lae;III)V", line = 168)
    public final void method89(class6 arg0, int arg1, int arg2, int arg3) {
        this.method106(arg0, arg1 - this.method96(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;I)I", line = 173)
    public final int method90(class6 arg0, int arg1) {
        int var3 = this.method107(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method96(field199[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;)I", line = 194)
    private final int method91(class6 arg0) {
        if (arg0.method60(field196, (byte) 114)) {
            return 16711680;
        } else if (arg0.method60(field206, (byte) 123)) {
            return 65280;
        } else if (arg0.method60(field204, (byte) 125)) {
            return 255;
        } else if (arg0.method60(field205, (byte) 123)) {
            return 16776960;
        } else if (arg0.method60(field193, (byte) 121)) {
            return 65535;
        } else if (arg0.method60(field191, (byte) 114)) {
            return 16711935;
        } else if (arg0.method60(field187, (byte) 124)) {
            return 16777215;
        } else if (arg0.method60(field195, (byte) 127)) {
            return 0;
        } else if (arg0.method60(field203, (byte) 116)) {
            return 16748608;
        } else if (arg0.method60(field198, (byte) 111)) {
            return 8388608;
        } else if (arg0.method60(field186, (byte) 121)) {
            return 128;
        } else if (arg0.method60(field202, (byte) 125)) {
            return 16756736;
        } else if (arg0.method60(field189, (byte) 122)) {
            return 16740352;
        } else if (arg0.method60(field183, (byte) 111)) {
            return 16723968;
        } else if (arg0.method60(field201, (byte) 116)) {
            return 12648192;
        } else if (arg0.method60(field197, (byte) 126)) {
            return 8453888;
        } else if (arg0.method60(field200, (byte) 116)) {
            return 4259584;
        } else {
            if (arg0.method60(field188, (byte) 122)) {
                this.field210 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;IIIZI)V", line = 251)
    private final void method92(class6 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class6 var7 = arg0.method40((byte) -45);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method41(-8521); var9++) {
            if (var7.method61(var9, -32011) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method105(var7)) * 256 / var8;
        }
        this.field210 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field184;
        for (int var14 = 0; var14 < var7.field93; var14++) {
            if (var7.field114[var14] == 64 && var14 + 4 < var7.field93 && var7.field114[var14 + 4] == 64) {
                int var15 = this.method91(var7.method30(var14 + 1, -1, var14 + 4));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field114[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method101(this.field182[var16], arg1 + 1, this.field190[var16] + var13 + 1, this.field207[var16], this.field192[var16], 0);
                    }
                    this.method101(this.field182[var16], arg1, this.field190[var16] + var13, this.field207[var16], this.field192[var16], arg3);
                }
                arg1 += this.field207[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field210) {
            class74.method584(var12, (int) ((double) this.field184 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lae;I)I", line = 331)
    public final int method93(class6 arg0, int arg1) {
        return this.method107(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lae;IIIZ)V", line = 334)
    public final void method94(class6 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field210 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field184;
        for (int var8 = 0; var8 < arg0.field93; var8++) {
            if (arg0.field114[var8] == 64 && var8 + 4 < arg0.field93 && arg0.field114[var8 + 4] == 64) {
                int var9 = this.method91(arg0.method30(var8 + 1, -1, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field114[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method101(this.field182[var10], arg1 + 1, this.field190[var10] + var7 + 1, this.field207[var10], this.field192[var10], 0);
                    }
                    this.method101(this.field182[var10], arg1, this.field190[var10] + var7, this.field207[var10], this.field192[var10], arg3);
                }
                arg1 += this.field207[var10];
            }
        }
        if (this.field210) {
            class74.method584(var6, (int) ((double) this.field184 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lae;IIIZ)V", line = 381)
    public final void method95(class6 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method94(arg0, arg1 - this.method105(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lae;)I", line = 384)
    public final int method96(class6 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field93; var3++) {
            var2 += this.field207[arg0.field114[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;IIII)V", line = 404)
    public final void method97(class6 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method96(arg0) / 2;
        int var7 = arg2 - this.field184;
        for (int var8 = 0; var8 < arg0.field93; var8++) {
            int var9 = arg0.field114[var8] & 0xFF;
            if (var9 != 32) {
                this.method101(this.field182[var9], var6, this.field190[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field207[var9], this.field192[var9], arg3);
            }
            var6 += this.field207[var9];
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lae;IIIZI)V", line = 436)
    public final void method98(class6 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field185.setSeed((long) arg5);
        int var7 = (this.field185.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field184;
        for (int var9 = 0; var9 < arg0.field93; var9++) {
            if (arg0.field114[var9] == 64 && var9 + 4 < arg0.field93 && arg0.field114[var9 + 4] == 64) {
                int var10 = this.method91(arg0.method30(var9 + 1, -1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field114[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method87(this.field182[var11], arg1 + 1, this.field190[var11] + var8 + 1, this.field207[var11], this.field192[var11], 0, 192);
                    }
                    this.method87(this.field182[var11], arg1, this.field190[var11] + var8, this.field207[var11], this.field192[var11], arg3, var7);
                }
                arg1 += this.field207[var11];
                if ((this.field185.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([I[BIIIIIIII)V", line = 478)
    private final void method99(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var15 = arg0[arg4];
                    arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([I[BIIIIIII)V", line = 517)
    private final void method100(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
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
            for (int var14 = var11; var14 < 0; var14++) {
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

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIIIII)V", line = 574)
    private final void method101(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class74.field1683 * arg2 + arg1;
        int var8 = class74.field1683 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class74.field1682) {
            int var11 = class74.field1682 - arg2;
            arg4 -= var11;
            arg2 = class74.field1682;
            var10 += arg3 * var11;
            var7 += class74.field1683 * var11;
        }
        if (arg2 + arg4 > class74.field1681) {
            arg4 -= arg2 + arg4 - class74.field1681;
        }
        if (arg1 < class74.field1686) {
            int var12 = class74.field1686 - arg1;
            arg3 -= var12;
            arg1 = class74.field1686;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class74.field1685) {
            int var13 = arg1 + arg3 - class74.field1685;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method100(class74.field1680, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()V", line = 624)
    public static void method102() {
        field188 = null;
        field194 = null;
        field196 = null;
        field206 = null;
        field204 = null;
        field205 = null;
        field193 = null;
        field191 = null;
        field187 = null;
        field195 = null;
        field203 = null;
        field198 = null;
        field186 = null;
        field202 = null;
        field189 = null;
        field183 = null;
        field201 = null;
        field197 = null;
        field200 = null;
        field199 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lae;IIII)V", line = 650)
    public final void method103(class6 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method96(arg0) / 2;
        int var7 = arg2 - this.field184;
        for (int var8 = 0; var8 < arg0.method41(-8521); var8++) {
            int var9 = arg0.field114[var8] & 0xFF;
            if (var9 != 32) {
                this.method101(this.field182[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field190[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field207[var9], this.field192[var9], arg3);
            }
            var6 += this.field207[var9];
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)I", line = 688)
    public final int method104(int arg0) {
        return this.field207[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lae;)I", line = 695)
    public final int method105(class6 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field93; var3++) {
            if (arg0.field114[var3] == 64 && var3 + 4 < arg0.field93 && arg0.field114[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field207[arg0.field114[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lae;III)V", line = 724)
    public final void method106(class6 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field184;
        for (int var6 = 0; var6 < arg0.field93; var6++) {
            int var7 = arg0.field114[var6] & 0xFF;
            if (var7 != 32) {
                this.method101(this.field182[var7], arg1, this.field190[var7] + var5, this.field207[var7], this.field192[var7], arg3);
            }
            arg1 += this.field207[var7];
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lae;IZ)I", line = 745)
    private final int method107(class6 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class6 var6 = class54.method419(100, (byte) -105);
        int var7 = -1;
        int var8 = 0;
        class6 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method41(-8521);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method61(var15, -32011);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method61(var15 + 4, -32011) == 64) {
                class6 var17 = arg0.method30(var15, -1, var15 + 5);
                if (var17.method60(field188, (byte) 121)) {
                    var11 = true;
                    var12 = var6.method41(-8521);
                } else {
                    var9 = var17;
                    var10 = var6.method41(-8521);
                }
                var6.method53(27681, var17);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method61(var15 + 1, -32011) == 110) {
                field199[var13++] = var6.method30(var5, -1, var6.method41(-8521)).method40((byte) -45);
                var5 = var6.method41(-8521);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method42(0, var16);
                var4 += this.method104(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method41(-8521);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field199[var13++] = var6.method30(var5, -1, var7).method40((byte) -45);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method34(var5, (byte) 84, var9);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method34(var5, (byte) 84, field194);
                    }
                }
            }
        }
        if (var6.method41(-8521) > var5) {
            field199[var13++] = var6.method30(var5, -1, var6.method41(-8521)).method40((byte) -45);
        }
        return var13;
    }
}
