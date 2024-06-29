import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 extends class111 {

    @OriginalMember(owner = "client!bc", name = "Ub", descriptor = "[[B")
    private byte[][] field355 = new byte[256][];

    @OriginalMember(owner = "client!bc", name = "Qb", descriptor = "I")
    public int field351 = 0;

    @OriginalMember(owner = "client!bc", name = "Ib", descriptor = "Ljava/util/Random;")
    private Random field343 = new Random();

    @OriginalMember(owner = "client!bc", name = "Yb", descriptor = "Z")
    private boolean field359 = false;

    @OriginalMember(owner = "client!bc", name = "Rb", descriptor = "[I")
    private int[] field352;

    @OriginalMember(owner = "client!bc", name = "Nb", descriptor = "[I")
    private int[] field348;

    @OriginalMember(owner = "client!bc", name = "Vb", descriptor = "[I")
    private int[] field356;

    @OriginalMember(owner = "client!bc", name = "ac", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!bc", name = "Zb", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!bc", name = "Db", descriptor = "[La;")
    private static class1[] field338 = new class1[100];

    @OriginalMember(owner = "client!bc", name = "Fb", descriptor = "La;")
    private static class1 field340 = class113.method934(-11538, "dbl");

    @OriginalMember(owner = "client!bc", name = "Ab", descriptor = "La;")
    private static class1 field335 = class113.method934(-11538, "or1");

    @OriginalMember(owner = "client!bc", name = "Cb", descriptor = "La;")
    private static class1 field337 = class113.method934(-11538, "mag");

    @OriginalMember(owner = "client!bc", name = "Jb", descriptor = "La;")
    private static class1 field344 = class113.method934(-11538, "red");

    @OriginalMember(owner = "client!bc", name = "zb", descriptor = "La;")
    private static class1 field334 = class113.method934(-11538, "cya");

    @OriginalMember(owner = "client!bc", name = "Lb", descriptor = "La;")
    private static class1 field346 = class113.method934(-11538, "or2");

    @OriginalMember(owner = "client!bc", name = "Gb", descriptor = "La;")
    private static class1 field341 = class113.method934(-11538, "gr1");

    @OriginalMember(owner = "client!bc", name = "Mb", descriptor = "La;")
    private static class1 field347 = class113.method934(-11538, "bla");

    @OriginalMember(owner = "client!bc", name = "Bb", descriptor = "La;")
    private static class1 field336 = class113.method934(-11538, "blu");

    @OriginalMember(owner = "client!bc", name = "Sb", descriptor = "La;")
    private static class1 field353 = class113.method934(-11538, "lre");

    @OriginalMember(owner = "client!bc", name = "Tb", descriptor = "La;")
    private static class1 field354 = class113.method934(-11538, "dre");

    @OriginalMember(owner = "client!bc", name = "Hb", descriptor = "La;")
    private static class1 field342 = class113.method934(-11538, "gr2");

    @OriginalMember(owner = "client!bc", name = "Ob", descriptor = "La;")
    private static class1 field349 = class113.method934(-11538, "str");

    @OriginalMember(owner = "client!bc", name = "Kb", descriptor = "La;")
    private static class1 field345 = class113.method934(-11538, "gre");

    @OriginalMember(owner = "client!bc", name = "Pb", descriptor = "La;")
    private static class1 field350 = class113.method934(-11538, "or3");

    @OriginalMember(owner = "client!bc", name = "Xb", descriptor = "La;")
    private static class1 field358 = class113.method934(-11538, "yel");

    @OriginalMember(owner = "client!bc", name = "Wb", descriptor = "La;")
    private static class1 field357 = class113.method934(-11538, "gr3");

    @OriginalMember(owner = "client!bc", name = "Eb", descriptor = "La;")
    private static class1 field339 = class113.method934(-11538, "whi");

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(La;)I", line = 4)
    private final int method194(class1 arg0) {
        if (arg0.method5(field344, 122)) {
            return 16711680;
        } else if (arg0.method5(field345, 122)) {
            return 65280;
        } else if (arg0.method5(field336, 122)) {
            return 255;
        } else if (arg0.method5(field358, 122)) {
            return 16776960;
        } else if (arg0.method5(field334, 122)) {
            return 65535;
        } else if (arg0.method5(field337, 122)) {
            return 16711935;
        } else if (arg0.method5(field339, 122)) {
            return 16777215;
        } else if (arg0.method5(field347, 122)) {
            return 0;
        } else if (arg0.method5(field353, 122)) {
            return 16748608;
        } else if (arg0.method5(field354, 122)) {
            return 8388608;
        } else if (arg0.method5(field340, 122)) {
            return 128;
        } else if (arg0.method5(field335, 122)) {
            return 16756736;
        } else if (arg0.method5(field346, 122)) {
            return 16740352;
        } else if (arg0.method5(field350, 122)) {
            return 16723968;
        } else if (arg0.method5(field341, 122)) {
            return 12648192;
        } else if (arg0.method5(field342, 122)) {
            return 8453888;
        } else if (arg0.method5(field357, 122)) {
            return 4259584;
        } else {
            if (arg0.method5(field349, 122)) {
                this.field359 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([I[BIIIIIII)V", line = 64)
    private final void method195(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(La;IIIIIZIII)V", line = 123)
    public final void method196(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class1 var13 = class59.method569(-18596, 100);
        int var14 = -1;
        int var15 = 0;
        class1 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field361;
        }
        boolean var17 = true;
        if (arg4 < this.field361 + this.field360 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method10(-3136);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method6(var20, false);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method6(var20 + 4, false) == 64) {
                var16 = arg0.method19(0, var20, var20 + 5);
                var13.method23(var16, (byte) -87);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method6(var20 + 1, false) == 110) {
                var16 = null;
                field338[var18++] = var13.method19(0, var12, var13.method10(-3136)).method40(false);
                var12 = var13.method10(-3136);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method29(-62, var24);
                var11 += this.method213(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method10(-3136);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field338[var18++] = var13.method19(0, var12, var14).method40(false);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method20(var16, 16039, var12);
                    }
                }
            }
        }
        if (var13.method10(-3136) > var12) {
            field338[var18++] = var13.method19(0, var12, var13.method10(-3136)).method40(false);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field361 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field361 - this.field360 - (var18 - 1) * arg9) / 2 + this.field361 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field360 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field361 - this.field360 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field361 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method207(field338[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method212(field338[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method201(field338[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method207(field338[var23], arg1, var21, arg5, arg6);
            } else {
                this.method204(field338[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(La;IIII)V", line = 262)
    public final void method197(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method209(arg0) / 2;
        int var7 = arg2 - this.field351;
        for (int var8 = 0; var8 < arg0.field26; var8++) {
            int var9 = arg0.field38[var8] & 0xFF;
            if (var9 != 32) {
                this.method206(this.field355[var9], var6, this.field352[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field348[var9], this.field356[var9], arg3);
            }
            var6 += this.field348[var9];
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([I[BIIIIIIII)V", line = 287)
    private final void method198(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(La;IIII)V", line = 318)
    public final void method199(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method209(arg0) / 2;
        int var7 = arg2 - this.field351;
        for (int var8 = 0; var8 < arg0.method10(-3136); var8++) {
            int var9 = arg0.field38[var8] & 0xFF;
            if (var9 != 32) {
                this.method206(this.field355[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field352[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field348[var9], this.field356[var9], arg3);
            }
            var6 += this.field348[var9];
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()V", line = 341)
    public static void method200() {
        field344 = null;
        field345 = null;
        field336 = null;
        field358 = null;
        field334 = null;
        field337 = null;
        field339 = null;
        field347 = null;
        field353 = null;
        field354 = null;
        field340 = null;
        field335 = null;
        field346 = null;
        field350 = null;
        field341 = null;
        field342 = null;
        field357 = null;
        field349 = null;
        field338 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(La;IIIZ)V", line = 371)
    public final void method201(class1 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method207(arg0, arg1 - this.method205(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(La;IIIII)V", line = 374)
    public final void method202(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method209(arg0) / 2;
        int var10 = arg2 - this.field351;
        for (int var11 = 0; var11 < arg0.method10(-3136); var11++) {
            int var12 = arg0.field38[var11] & 0xFF;
            if (var12 != 32) {
                this.method206(this.field355[var12], var9, this.field352[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field348[var12], this.field356[var12], arg3);
            }
            var9 += this.field348[var12];
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BIIIIII)V", line = 404)
    private final void method203(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class111.field2752 * arg2 + arg1;
        int var9 = class111.field2752 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class111.field2751) {
            int var12 = class111.field2751 - arg2;
            arg4 -= var12;
            arg2 = class111.field2751;
            var11 += arg3 * var12;
            var8 += class111.field2752 * var12;
        }
        if (arg2 + arg4 > class111.field2754) {
            arg4 -= arg2 + arg4 - class111.field2754;
        }
        if (arg1 < class111.field2755) {
            int var13 = class111.field2755 - arg1;
            arg3 -= var13;
            arg1 = class111.field2755;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class111.field2756) {
            int var14 = arg1 + arg3 - class111.field2756;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method198(class111.field2750, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(La;IIIZI)V", line = 459)
    private final void method204(class1 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class1 var7 = arg0.method40(false);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method10(-3136); var9++) {
            if (var7.method6(var9, false) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method205(var7)) * 256 / var8;
        }
        this.field359 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field351;
        for (int var14 = 0; var14 < var7.field26; var14++) {
            if (var7.field38[var14] == 64 && var14 + 4 < var7.field26 && var7.field38[var14 + 4] == 64) {
                int var15 = this.method194(var7.method19(0, var14 + 1, var14 + 4));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field38[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method206(this.field355[var16], arg1 + 1, this.field352[var16] + var13 + 1, this.field348[var16], this.field356[var16], 0);
                    }
                    this.method206(this.field355[var16], arg1, this.field352[var16] + var13, this.field348[var16], this.field356[var16], arg3);
                }
                arg1 += this.field348[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field359) {
            class111.method919(var12, (int) ((double) this.field351 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(La;)I", line = 528)
    public final int method205(class1 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field26; var3++) {
            if (arg0.field38[var3] == 64 && var3 + 4 < arg0.field26 && arg0.field38[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field348[arg0.field38[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BIIIII)V", line = 553)
    private final void method206(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class111.field2752 * arg2 + arg1;
        int var8 = class111.field2752 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class111.field2751) {
            int var11 = class111.field2751 - arg2;
            arg4 -= var11;
            arg2 = class111.field2751;
            var10 += arg3 * var11;
            var7 += class111.field2752 * var11;
        }
        if (arg2 + arg4 > class111.field2754) {
            arg4 -= arg2 + arg4 - class111.field2754;
        }
        if (arg1 < class111.field2755) {
            int var12 = class111.field2755 - arg1;
            arg3 -= var12;
            arg1 = class111.field2755;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class111.field2756) {
            int var13 = arg1 + arg3 - class111.field2756;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method195(class111.field2750, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(La;IIIZ)V", line = 601)
    public final void method207(class1 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field359 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field351;
        for (int var8 = 0; var8 < arg0.field26; var8++) {
            if (arg0.field38[var8] == 64 && var8 + 4 < arg0.field26 && arg0.field38[var8 + 4] == 64) {
                int var9 = this.method194(arg0.method19(0, var8 + 1, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field38[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method206(this.field355[var10], arg1 + 1, this.field352[var10] + var7 + 1, this.field348[var10], this.field356[var10], 0);
                    }
                    this.method206(this.field355[var10], arg1, this.field352[var10] + var7, this.field348[var10], this.field356[var10], arg3);
                }
                arg1 += this.field348[var10];
            }
        }
        if (this.field359) {
            class111.method919(var6, (int) ((double) this.field351 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(La;IIIZI)V", line = 644)
    public final void method208(class1 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field343.setSeed((long) arg5);
        int var7 = (this.field343.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field351;
        for (int var9 = 0; var9 < arg0.field26; var9++) {
            if (arg0.field38[var9] == 64 && var9 + 4 < arg0.field26 && arg0.field38[var9 + 4] == 64) {
                int var10 = this.method194(arg0.method19(0, var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field38[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method203(this.field355[var11], arg1 + 1, this.field352[var11] + var8 + 1, this.field348[var11], this.field356[var11], 0, 192);
                    }
                    this.method203(this.field355[var11], arg1, this.field352[var11] + var8, this.field348[var11], this.field356[var11], arg3, var7);
                }
                arg1 += this.field348[var11];
                if ((this.field343.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(La;)I", line = 691)
    public final int method209(class1 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field26; var3++) {
            var2 += this.field348[arg0.field38[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(La;III)V", line = 713)
    public final void method210(class1 arg0, int arg1, int arg2, int arg3) {
        this.method214(arg0, arg1 - this.method209(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(La;III)V", line = 720)
    public final void method211(class1 arg0, int arg1, int arg2, int arg3) {
        this.method214(arg0, arg1 - this.method209(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(La;IIIZ)V", line = 723)
    public final void method212(class1 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method207(arg0, arg1 - this.method205(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 809)
    public class10(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field352 = arg0;
        this.field348 = arg1;
        this.field356 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field355 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field352[var10] < var8) {
                var8 = this.field352[var10];
            }
            if (this.field356[var10] + this.field352[var10] > var9) {
                var9 = this.field356[var10] + this.field352[var10];
            }
            byte[] var11 = this.field355[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field351 = this.field356[32] + this.field352[32];
        this.field361 = this.field351 - var8;
        this.field360 = var9 - this.field351;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)I", line = 764)
    public final int method213(int arg0) {
        return this.field348[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(La;III)V", line = 773)
    public final void method214(class1 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field351;
        for (int var6 = 0; var6 < arg0.field26; var6++) {
            int var7 = arg0.field38[var6] & 0xFF;
            if (var7 != 32) {
                this.method206(this.field355[var7], arg1, this.field352[var7] + var5, this.field348[var7], this.field356[var7], arg3);
            }
            arg1 += this.field348[var7];
        }
    }
}
