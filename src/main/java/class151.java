import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class151 extends class168 {

    @OriginalMember(owner = "client!qf", name = "jb", descriptor = "[[B")
    public byte[][] field3064 = new byte[256][];

    @OriginalMember(owner = "client!qf", name = "qb", descriptor = "I")
    public int field3071 = 0;

    @OriginalMember(owner = "client!qf", name = "ob", descriptor = "[I")
    private int[] field3069;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "[I")
    private int[] field3043;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "[I")
    private int[] field3058;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "[I")
    private int[] field3051;

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "I")
    private int field3062;

    @OriginalMember(owner = "client!qf", name = "yb", descriptor = "I")
    private int field3079;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    private static int field3050 = -1;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Led;")
    private static class43 field3046 = class191.method1219("shad", false);

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "Led;")
    private static class43 field3056 = class191.method1219(")4shad", false);

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    private static int field3044 = -1;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    private static int field3055 = 0;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "Led;")
    private static class43 field3053 = class191.method1219(")4u", false);

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "Led;")
    private static class43 field3060 = class191.method1219("img=", false);

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Led;")
    private static class43 field3045 = class191.method1219("gt", false);

    @OriginalMember(owner = "client!qf", name = "lb", descriptor = "I")
    private static int field3066 = 256;

    @OriginalMember(owner = "client!qf", name = "kb", descriptor = "Led;")
    private static class43 field3065 = class191.method1219("br", false);

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    private static int field3052 = 256;

    @OriginalMember(owner = "client!qf", name = "pb", descriptor = "Led;")
    private static class43 field3070 = class191.method1219(")4col", false);

    @OriginalMember(owner = "client!qf", name = "ib", descriptor = "[Led;")
    private static class43[] field3063 = new class43[100];

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "I")
    private static int field3059 = 0;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "Led;")
    private static class43 field3054 = class191.method1219("str", false);

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
    private static int field3061 = -1;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Led;")
    private static class43 field3047 = class191.method1219("u", false);

    @OriginalMember(owner = "client!qf", name = "tb", descriptor = "I")
    private static int field3074 = -1;

    @OriginalMember(owner = "client!qf", name = "nb", descriptor = "Led;")
    private static class43 field3068 = class191.method1219("lt", false);

    @OriginalMember(owner = "client!qf", name = "vb", descriptor = "I")
    private static int field3076 = 0;

    @OriginalMember(owner = "client!qf", name = "mb", descriptor = "Led;")
    private static class43 field3067 = class191.method1219(")4str", false);

    @OriginalMember(owner = "client!qf", name = "ub", descriptor = "I")
    private static int field3075 = 0;

    @OriginalMember(owner = "client!qf", name = "rb", descriptor = "Led;")
    private static class43 field3072 = class191.method1219("col=", false);

    @OriginalMember(owner = "client!qf", name = "xb", descriptor = "Led;")
    private static class43 field3078 = class191.method1219("str=", false);

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Led;")
    private static class43 field3049 = class191.method1219("u=", false);

    @OriginalMember(owner = "client!qf", name = "wb", descriptor = "Led;")
    private static class43 field3077 = class191.method1219("shad=", false);

    @OriginalMember(owner = "client!qf", name = "sb", descriptor = "[B")
    private byte[] field3073;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[I")
    private int[] field3048;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "[Ltg;")
    public static class179[] field3057;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;IIIII)V")
    public final void method931(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method946(arg3, arg4);
        int[] var7 = new int[arg0.field818];
        int[] var8 = new int[arg0.field818];
        for (int var9 = 0; var9 < arg0.field818; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method955(arg0, arg1 - this.method952(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)I")
    private final int method932(int arg0) {
        return this.field3048[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;IIIIII)V")
    public final void method933(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method946(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field818];
        for (int var11 = 0; var11 < arg0.field818; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method955(arg0, arg1 - this.method952(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(IIIIII)V")
    private final void method934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class168.field3338 * arg2 + arg1;
        int var8 = class168.field3338 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class168.field3336) {
            int var11 = class168.field3336 - arg2;
            arg4 -= var11;
            arg2 = class168.field3336;
            var10 += arg3 * var11;
            var7 += class168.field3338 * var11;
        }
        if (arg2 + arg4 > class168.field3339) {
            arg4 -= arg2 + arg4 - class168.field3339;
        }
        if (arg1 < class168.field3340) {
            int var12 = class168.field3340 - arg1;
            arg3 -= var12;
            arg1 = class168.field3340;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class168.field3335) {
            int var13 = arg1 + arg3 - class168.field3335;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method950(class168.field3334, this.field3064[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;IIII)V")
    public final void method935(class43 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method946(arg3, arg4);
            this.method938(arg0, arg1 - this.method952(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;)V")
    private final void method936(class43 arg0) {
        try {
            if (arg0.method240(-1, field3072)) {
                field3059 = arg0.method238(41, 4).method246(16, (byte) -103);
                return;
            }
            if (arg0.method257(field3070, 68)) {
                field3059 = field3076;
                return;
            }
            if (arg0.method240(-1, field3078)) {
                field3074 = arg0.method238(68, 4).method246(16, (byte) -106);
                return;
            }
            if (arg0.method257(field3054, 86)) {
                field3074 = 8388608;
                return;
            }
            if (arg0.method257(field3067, 113)) {
                field3074 = -1;
                return;
            }
            if (arg0.method240(-1, field3049)) {
                field3061 = arg0.method238(11, 2).method246(16, (byte) -113);
                return;
            }
            if (arg0.method257(field3047, 76)) {
                field3061 = 0;
                return;
            }
            if (arg0.method257(field3053, 103)) {
                field3061 = -1;
                return;
            }
            if (arg0.method240(-1, field3077)) {
                field3050 = arg0.method238(35, 5).method246(16, (byte) -125);
                return;
            }
            if (arg0.method257(field3046, 72)) {
                field3050 = 0;
                return;
            }
            if (arg0.method257(field3056, 54)) {
                field3050 = field3044;
                return;
            }
            if (arg0.method257(field3065, 58)) {
                this.method956(field3076, field3044, field3052);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;I)I")
    public final int method937(class43 arg0, int arg1) {
        return this.method943(arg0, new int[] { arg1 }, field3063);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;II)V")
    private final void method938(class43 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3071;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field818; var7++) {
            int var8 = arg0.field844[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class43 var9 = arg0.method241((byte) -59, var5 + 1, var7);
                    var5 = -1;
                    if (var9.method257(field3068, 61)) {
                        var8 = 60;
                    } else {
                        if (!var9.method257(field3045, 114)) {
                            if (var9.method240(-1, field3060)) {
                                try {
                                    int var10 = var9.method238(117, 4).method264(10);
                                    class179 var11 = field3057[var10];
                                    if (field3066 == 256) {
                                        var11.method1163(arg1, this.field3071 + var4 - var11.field3572);
                                    } else {
                                        var11.method1164(arg1, this.field3071 + var4 - var11.field3572, field3066);
                                    }
                                    arg1 += var11.field3578;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method936(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field3073 != null && var6 != -1) {
                        arg1 += this.field3073[(var6 << 8) + var8];
                    }
                    int var12 = this.field3058[var8];
                    int var13 = this.field3051[var8];
                    if (var8 == 32) {
                        if (field3075 > 0) {
                            field3055 += field3075;
                            arg1 += field3055 >> 8;
                            field3055 &= 0xFF;
                        }
                    } else if (field3066 == 256) {
                        if (field3050 != -1) {
                            this.method934(var8, this.field3069[var8] + arg1 + 1, this.field3043[var8] + var4 + 1, var12, var13, field3050);
                        }
                        this.method944(var8, this.field3069[var8] + arg1, this.field3043[var8] + var4, var12, var13, field3059);
                    } else {
                        if (field3050 != -1) {
                            this.method959(var8, this.field3069[var8] + arg1 + 1, this.field3043[var8] + var4 + 1, var12, var13, field3050, field3066);
                        }
                        this.method957(var8, this.field3069[var8] + arg1, this.field3043[var8] + var4, var12, var13, field3059, field3066);
                    }
                    int var14 = this.field3048[var8];
                    if (field3074 != -1) {
                        class168.method1040(arg1, (int) ((double) this.field3071 * 0.7D) + var4, var14, field3074);
                    }
                    if (field3061 != -1) {
                        class168.method1040(arg1, this.field3071 + var4 + 1, var14, field3061);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()V")
    public static void method939() {
        field3068 = null;
        field3045 = null;
        field3060 = null;
        field3065 = null;
        field3072 = null;
        field3070 = null;
        field3049 = null;
        field3047 = null;
        field3053 = null;
        field3077 = null;
        field3046 = null;
        field3056 = null;
        field3078 = null;
        field3054 = null;
        field3067 = null;
        field3057 = null;
        field3063 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;IIIIIIIIII)I")
    private final int method940(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method956(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field3071;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field3079 + this.field3062 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method943(arg0, var12, field3063);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field3062 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field3062 - this.field3079 - (var13 - 1) * arg10) / 2 + this.field3062 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field3079 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field3062 - this.field3079 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field3062 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method938(field3063[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method938(field3063[var16], arg1 + (arg3 - this.method952(field3063[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method938(field3063[var16], arg1 + arg3 - this.method952(field3063[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method938(field3063[var16], arg1, var14);
            } else {
                this.method953(field3063[var16], arg3);
                this.method938(field3063[var16], arg1, var14);
                field3075 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method941(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([B)V")
    private final void method942(byte[] arg0) {
        this.field3048 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3048.length; var2++) {
                this.field3048[var2] = arg0[var2] & 0xFF;
            }
            this.field3071 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3048[var4] = arg0[var3++] & 0xFF;
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
        this.field3073 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field3073[(var13 << 8) + var14] = (byte) method941(var9, var11, var6, this.field3048, var5, var13, var14);
                    }
                }
            }
        }
        this.field3071 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;[I[Led;)I")
    private final int method943(class43 arg0, int[] arg1, class43[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class43 var6 = class41.method227((byte) 83, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method248((byte) 60);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method256(true, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class43 var16 = arg0.method241((byte) 82, var10 + 1, var14);
                    var10 = -1;
                    var6.method267(60, -15788);
                    var6.method269(var16, (byte) 91);
                    var6.method267(62, -15788);
                    if (var16.method257(field3065, 114)) {
                        arg2[var12++] = var6.method241((byte) -29, var5, var6.method248((byte) 60));
                        var5 = var6.method248((byte) 60);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method257(field3068, 96)) {
                        var4 += this.method932(60);
                        if (this.field3073 != null && var11 != -1) {
                            var4 += this.field3073[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method257(field3045, 121)) {
                        var4 += this.method932(62);
                        if (this.field3073 != null && var11 != -1) {
                            var4 += this.field3073[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method240(-1, field3060)) {
                        try {
                            int var17 = var16.method238(95, 4).method264(10);
                            var4 += field3057[var17].field3578;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method267(var15, -15788);
                        var4 += this.method932(var15);
                        if (this.field3073 != null && var11 != -1) {
                            var4 += this.field3073[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method248((byte) 60);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method241((byte) -35, var5, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method248((byte) 60);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method248((byte) 60) > var5) {
            arg2[var12++] = var6.method241((byte) -57, var5, var6.method248((byte) 60));
        }
        return var12;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(IIIIII)V")
    public abstract void method944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Led;)Led;")
    public static final class43 method945(class43 arg0) {
        int var1 = arg0.method248((byte) 60);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field844[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class43 var4 = new class43();
        var4.field818 = var1 + var2;
        var4.field844 = new byte[var4.field818];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field844[var6];
            if (var7 == 60) {
                var4.field844[var5++] = 60;
                var4.field844[var5++] = 108;
                var4.field844[var5++] = 116;
                var4.field844[var5++] = 62;
            } else if (var7 == 62) {
                var4.field844[var5++] = 60;
                var4.field844[var5++] = 103;
                var4.field844[var5++] = 116;
                var4.field844[var5++] = 62;
            } else {
                var4.field844[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    private final void method946(int arg0, int arg1) {
        field3074 = -1;
        field3061 = -1;
        field3044 = arg1;
        field3050 = arg1;
        field3076 = arg0;
        field3059 = arg0;
        field3052 = 256;
        field3066 = 256;
        field3075 = 0;
        field3055 = 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method947(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;IIIIIIIII)I")
    public final int method948(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method940(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Led;IIII)V")
    public final void method949(class43 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method946(arg3, arg4);
            this.method938(arg0, arg1 - this.method952(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method950(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;IIIILjava/util/Random;I)I")
    public final int method951(class43 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method956(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field818];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field818; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method955(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Led;)I")
    public final int method952(class43 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field818; var5++) {
            int var6 = arg0.field844[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class43 var7 = arg0.method241((byte) 89, var2 + 1, var5);
                    var2 = -1;
                    if (var7.method257(field3068, 64)) {
                        var6 = 60;
                    } else {
                        if (!var7.method257(field3045, 84)) {
                            if (var7.method240(-1, field3060)) {
                                try {
                                    int var8 = var7.method238(88, 4).method264(10);
                                    var4 += field3057[var8].field3578;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field3048[var6];
                    if (this.field3073 != null && var3 != -1) {
                        var4 += this.field3073[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Led;I)V")
    private final void method953(class43 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method248((byte) 60); var5++) {
            int var6 = arg0.method256(true, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field3075 = (arg1 - this.method952(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Led;IIII)V")
    public final void method954(class43 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method946(arg3, arg4);
            this.method938(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Led;II[I[I)V")
    private final void method955(class43 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3071;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field818; var10++) {
            int var11 = arg0.field844[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class43 var12 = arg0.method241((byte) -32, var7 + 1, var10);
                    var7 = -1;
                    if (var12.method257(field3068, 77)) {
                        var11 = 60;
                    } else {
                        if (!var12.method257(field3045, 100)) {
                            if (var12.method240(-1, field3060)) {
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
                                    int var15 = var12.method238(81, 4).method264(10);
                                    class179 var16 = field3057[var15];
                                    if (field3066 == 256) {
                                        var16.method1163(arg1 + var13, this.field3071 + var6 - var16.field3572 + var14);
                                    } else {
                                        var16.method1164(arg1 + var13, this.field3071 + var6 - var16.field3572 + var14, field3066);
                                    }
                                    arg1 += var16.field3578;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method936(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field3073 != null && var8 != -1) {
                        arg1 += this.field3073[(var8 << 8) + var11];
                    }
                    int var17 = this.field3058[var11];
                    int var18 = this.field3051[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field3075 > 0) {
                            field3055 += field3075;
                            arg1 += field3055 >> 8;
                            field3055 &= 0xFF;
                        }
                    } else if (field3066 == 256) {
                        if (field3050 != -1) {
                            this.method934(var11, this.field3069[var11] + arg1 + var19 + 1, this.field3043[var11] + var6 + 1 + var20, var17, var18, field3050);
                        }
                        this.method944(var11, this.field3069[var11] + arg1 + var19, this.field3043[var11] + var6 + var20, var17, var18, field3059);
                    } else {
                        if (field3050 != -1) {
                            this.method959(var11, this.field3069[var11] + arg1 + var19 + 1, this.field3043[var11] + var6 + 1 + var20, var17, var18, field3050, field3066);
                        }
                        this.method957(var11, this.field3069[var11] + arg1 + var19, this.field3043[var11] + var6 + var20, var17, var18, field3059, field3066);
                    }
                    int var21 = this.field3048[var11];
                    if (field3074 != -1) {
                        class168.method1040(arg1, (int) ((double) this.field3071 * 0.7D) + var6, var21, field3074);
                    }
                    if (field3061 != -1) {
                        class168.method1040(arg1, this.field3071 + var6, var21, field3061);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)V")
    private final void method956(int arg0, int arg1, int arg2) {
        field3074 = -1;
        field3061 = -1;
        field3044 = arg1;
        field3050 = arg1;
        field3076 = arg0;
        field3059 = arg0;
        field3052 = arg2;
        field3066 = arg2;
        field3075 = 0;
        field3055 = 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Led;I)I")
    public final int method958(class43 arg0, int arg1) {
        int var3 = this.method943(arg0, new int[] { arg1 }, field3063);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method952(field3063[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIII)V")
    private final void method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class168.field3338 * arg2 + arg1;
        int var9 = class168.field3338 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class168.field3336) {
            int var12 = class168.field3336 - arg2;
            arg4 -= var12;
            arg2 = class168.field3336;
            var11 += arg3 * var12;
            var8 += class168.field3338 * var12;
        }
        if (arg2 + arg4 > class168.field3339) {
            arg4 -= arg2 + arg4 - class168.field3339;
        }
        if (arg1 < class168.field3340) {
            int var13 = class168.field3340 - arg1;
            arg3 -= var13;
            arg1 = class168.field3340;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class168.field3335) {
            int var14 = arg1 + arg3 - class168.field3335;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method947(class168.field3334, this.field3064[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class151(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3069 = arg1;
        this.field3043 = arg2;
        this.field3058 = arg3;
        this.field3051 = arg4;
        this.method942(arg0);
        this.field3064 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3043[var10] < var8 && this.field3051[var10] != 0) {
                var8 = this.field3043[var10];
            }
            if (this.field3051[var10] + this.field3043[var10] > var9) {
                var9 = this.field3051[var10] + this.field3043[var10];
            }
        }
        this.field3062 = this.field3071 - var8;
        this.field3079 = var9 - this.field3071;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Led;IIIII)V")
    public final void method960(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method946(arg3, arg4);
        int[] var7 = new int[arg0.field818];
        for (int var8 = 0; var8 < arg0.field818; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method955(arg0, arg1 - this.method952(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
    public class151(byte[] arg0) {
        this.method942(arg0);
    }
}
