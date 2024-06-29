import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class67 extends class35 {

    @OriginalMember(owner = "client!jt", name = "R", descriptor = "Lwo;")
    private class522 field950 = new class522();

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "Lht;")
    public class410 field933;

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "[[I")
    private int[][] field937;

    @OriginalMember(owner = "client!jt", name = "D", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "[[B")
    private byte[][] field925;

    @OriginalMember(owner = "client!jt", name = "eb", descriptor = "[[F")
    private float[][] field962;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "[[[I")
    private int[][][] field926;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "[[S")
    public short[][] field943;

    @OriginalMember(owner = "client!jt", name = "ab", descriptor = "[[[Luv;")
    private class243[][][] field958;

    @OriginalMember(owner = "client!jt", name = "Y", descriptor = "[[[I")
    private int[][][] field956;

    @OriginalMember(owner = "client!jt", name = "cb", descriptor = "[[F")
    private float[][] field960;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!jt", name = "gb", descriptor = "[[B")
    private byte[][] field964;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "[[[I")
    private int[][][] field941;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "[[[I")
    public int[][][] field942;

    @OriginalMember(owner = "client!jt", name = "nb", descriptor = "[[F")
    private float[][] field971;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "[[[I")
    public int[][][] field930;

    @OriginalMember(owner = "client!jt", name = "jb", descriptor = "Lbj;")
    private class159 field967;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "Lac;")
    private class377 field922;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!jt", name = "Z", descriptor = "Lgu;")
    public static class409 field957 = null;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "Luf;")
    public static class310 field927 = new class310(102, -2);

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!jt", name = "P", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!jt", name = "Q", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!jt", name = "S", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!jt", name = "U", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!jt", name = "W", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!jt", name = "X", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!jt", name = "bb", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!jt", name = "lb", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!jt", name = "mb", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "client!jt", name = "db", descriptor = "Lds;")
    public class12 field961;

    @OriginalMember(owner = "client!jt", name = "hb", descriptor = "Lds;")
    public class12 field965;

    @OriginalMember(owner = "client!jt", name = "ib", descriptor = "Lds;")
    public class12 field966;

    @OriginalMember(owner = "client!jt", name = "ob", descriptor = "Lds;")
    private class12 field972;

    @OriginalMember(owner = "client!jt", name = "kb", descriptor = "Lbm;")
    private class74 field968;

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "Ljava/lang/Object;")
    public static Object field939;

    @OriginalMember(owner = "client!jt", name = "fb", descriptor = "[Luv;")
    private class243[] field963;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "[[[I")
    private int[][][] field945;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public final boolean method230(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field923;
        if (this.field922 != null && arg0 != null) {
            int var7 = -(this.field933.field5945 * arg2 >> 8) + arg1 >> this.field933.field5866;
            int var8 = -(this.field933.field5937 * arg2 >> 8) + arg3 >> this.field933.field5866;
            return this.field922.method2172(arg0, var7, var8, 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jt", name = "U", descriptor = "(Lj;IIIIZ)V")
    public final void method226(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field949;
        if (this.field922 != null && arg0 != null) {
            int var7 = -(this.field933.field5945 * arg2 >> 8) + arg1 >> this.field933.field5866;
            int var8 = -(this.field933.field5937 * arg2 >> 8) + arg3 >> this.field933.field5866;
            this.field922.method2171(var7, arg0, 5598, var8);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method222(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field951;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method223(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "(IILj;)Lj;")
    public final class378 method224(int arg0, int arg1, class378 arg2) {
        ++field946;
        if ((this.field925[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field494 >> this.field933.field5866;
            class418 var5 = (class418) arg2;
            class418 var6;
            if (var5 != null && var5.method2506((byte) -65, var4, var4)) {
                var6 = var5;
                var5.method2504((byte) -6);
            } else {
                var6 = new class418(this.field933, var4, var4);
            }
            var6.method2507(0, var4, 0, var4, (byte) -124);
            this.method417(arg1, -15048, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
    public final void method225(int arg0, int arg1) {
        ++field932;
    }

    @OriginalMember(owner = "client!jt", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method223(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field920;
        if (arg5 != null && this.field945 == null) {
            this.field945 = new int[super.field495][super.field497][];
        }
        if (arg3 != null && this.field941 == null) {
            this.field941 = new int[super.field495][super.field497][];
        }
        this.field942[arg0][arg1] = arg2;
        this.field930[arg0][arg1] = arg4;
        this.field956[arg0][arg1] = arg6;
        this.field926[arg0][arg1] = arg7;
        if (this.field945 != null) {
            this.field945[arg0][arg1] = arg5;
        }
        if (this.field941 != null) {
            this.field941[arg0][arg1] = arg3;
        }
        class243[] var15 = this.field958[arg0][arg1] = new class243[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14);
            class499 var19;
            for (var19 = this.field967.method979((byte) 28, var17); var19 != null; var19 = this.field967.method991((byte) -121)) {
                class243 var20 = (class243) var19;
                if (~arg8[var16] == ~var20.field3380 && (float) arg9[var16] == var20.field3389 && var20.field3376 == arg10 && ~var20.field3377 == ~arg11 && var20.field3375 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class243(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field967.method990(var17, (byte) 127, var15[var16]);
            } else {
                var15[var16] = (class243) var19;
            }
        }
        if (arg13) {
            this.field925[arg0][arg1] = (byte) class25.method183(this.field925[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field970) {
            this.field970 = arg6.length;
        }
        this.field969 += arg6.length;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lpe;[I)V")
    public final void method233(class432 arg0, int[] arg1) {
        ++field947;
        this.field950.method3070(new class133(this.field933, this, arg0, arg1), (byte) -127);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III[[ZZ)V")
    public final void method229(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method419(arg4, arg0, arg2, arg3, -1, 5123, arg1);
        ++field935;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lht;IIII[[I[[II)V")
    public class67(class410 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field933 = arg0;
        this.field937 = arg5;
        this.field936 = super.field492 + -2;
        this.field925 = new byte[arg3][arg4];
        this.field962 = new float[super.field495 + 1][super.field497 + 1];
        this.field919 = arg2;
        this.field926 = new int[arg3][arg4][];
        this.field943 = new short[arg3 * arg4][];
        this.field958 = new class243[arg3][arg4][];
        this.field956 = new int[arg3][arg4][];
        this.field960 = new float[super.field495 + 1][super.field497 + 1];
        this.field921 = 1 << this.field936;
        this.field964 = new byte[arg3 - -1][arg4 + 1];
        this.field941 = new int[arg3][arg4][];
        this.field942 = new int[arg3][arg4][];
        this.field971 = new float[super.field495 + 1][super.field497 + 1];
        this.field930 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field497; ++var9) {
            for (int var10 = 1; ~super.field495 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * arg7 * 4)))));
                this.field962[var10][var9] = (float) var11 * var13;
                this.field971[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field960[var10][var9] = (float) var12 * var13;
            }
        }
        this.field967 = new class159(128);
        if (~(16 & this.field919) != -1) {
            this.field922 = new class377(this.field933, this);
        }
    }

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "(II)I")
    public final int method221(int arg0, int arg1) {
        ++field938;
        return this.field937[arg0][arg1];
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILnu;I)V")
    private final void method417(int arg0, int arg1, class418 arg2, int arg3) {
        ++field955;
        int[] var5 = this.field942[arg3][arg0];
        int[] var6 = this.field930[arg3][arg0];
        int var7 = var5.length;
        if (var7 > class213.field3037.length) {
            class238.field3277 = new int[var7];
            class213.field3037 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class213.field3037[var8] = class118.method750(255, var5[var8]) >> this.field933.field5866;
            class238.field3277[var8] = class118.method750(var6[var8], 255) >> this.field933.field5866;
        }
        if (arg1 == -15048) {
            int var9 = 0;
            while (var7 > var9) {
                int var10 = class213.field3037[var9];
                int var11 = class238.field3277[var9++];
                int var12 = class213.field3037[var9];
                int var13 = class238.field3277[var9++];
                int var14 = class213.field3037[var9];
                int var15 = class238.field3277[var9++];
                if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                    arg2.method2503(var14, var11, false, var13, var10, var12, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "QA", descriptor = "(III)V")
    public final void method231(int arg0, int arg1, int arg2) {
        if ((255 & this.field964[arg0][arg1]) < arg2) {
            this.field964[arg0][arg1] = (byte) arg2;
        }
        ++field944;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)Z")
    public static final boolean method418(int arg0, int arg1) {
        ++field953;
        int var2 = -89 % ((-77 - arg1) / 48);
        if (~arg0 != -61 && arg0 != 11 && arg0 != 47 && arg0 != 58 && arg0 != 1009) {
            return ~arg0 == -10 || arg0 == 1003;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZII[[ZIII)V")
    private final void method419(boolean arg0, int arg1, int arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 5123) {
            field934 = -86;
        }
        if (this.field963 != null) {
            float var8 = this.field933.field5994;
            float var9 = this.field933.field5949;
            int var10 = arg2 + 1 + arg2;
            int var11 = var10 * var10;
            if (~var11 < ~class89.field1222.length) {
                class89.field1222 = new int[var11];
            }
            if (~class170.field2403.field5073.length > ~(this.field959 * 2)) {
                class170.field2403 = new class365(this.field959 * 2);
            }
            int var12 = -arg2 + arg1;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg2 + arg6;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg1 + arg2;
            if (super.field495 + -1 < var16) {
                var16 = super.field495 + -1;
            }
            int var17 = arg2 + arg6;
            class229.field3197 = 0;
            if (super.field497 + -1 < var17) {
                var17 = super.field497 + -1;
            }
            for (int var18 = var12; ~var18 >= ~var16; ++var18) {
                boolean[] var24 = arg3[-var13 + var18];
                for (int var25 = var14; var17 >= var25; ++var25) {
                    if (var24[-var15 + var25]) {
                        class89.field1222[class229.field3197++] = super.field495 * var25 - -var18;
                    }
                }
            }
            if (~arg4 != 0) {
                this.field933.method2371((float) arg4, 111);
                this.field933.method2403(arg5 + -5123);
            } else {
                this.field933.method2388(arg5 ^ -2055);
            }
            this.field933.method2433(~(7 & this.field919) != -1, (byte) -44);
            for (int var19 = 0; var19 < this.field963.length; ++var19) {
                this.field963[var19].method1434(class89.field1222, arg5 ^ 5372, class229.field3197);
            }
            if (!this.field950.method3068(83)) {
                int var20 = this.field933.field5961;
                int var21 = this.field933.field5953;
                this.field933.method448(0, var21, this.field933.field5903);
                this.field933.method440(var9, var8 + -4.0F);
                this.field933.method2433(false, (byte) -74);
                this.field933.method2431(false, -31688);
                this.field933.method2356((byte) -21, 128);
                this.field933.method2366(-2, arg5 ^ 4945);
                this.field933.method2412((byte) 4, this.field933.field5928);
                this.field933.method2383(8448, 86, 7681);
                this.field933.method2362(34166, (byte) 65, 770, 0);
                this.field933.method2379(770, (byte) -103, 34167, 0);
                for (class499 var22 = this.field950.method3072((byte) 22); var22 != null; var22 = this.field950.method3066(2)) {
                    class133 var23 = (class133) var22;
                    var23.method880(arg6, (byte) -32, arg2, arg3, arg1);
                }
                this.field933.method2362(5890, (byte) 65, 768, 0);
                this.field933.method2379(770, (byte) -109, 5890, 0);
                this.field933.method2412((byte) 4, (class188) null);
                this.field933.method448(var20, var21, this.field933.field5903);
            }
            if (this.field922 != null) {
                this.field933.method440(var9, var8 - 8.0F);
                this.field933.method2388(-7174);
                this.field933.method2439(this.field961, (byte) -109, this.field966, (class12) null, (class12) null);
                this.field922.method2177(-109, arg2, arg1, arg3, arg0, arg6);
            }
            this.field933.method440(var9, var8);
        }
        ++field928;
    }

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "()V")
    public final void method235() {
        if (this.field969 <= 0) {
            this.field922 = null;
        } else {
            byte[][] var1 = new byte[super.field495 + 1][super.field497 + 1];
            for (int var2 = 1; var2 < super.field495; ++var2) {
                for (int var102 = 1; super.field497 > var102; ++var102) {
                    var1[var2][var102] = (byte) ((this.field964[var2][var102 + -1] >> 2) + (this.field964[var2 + 1][var102] >> 3) + (this.field964[var2 + -1][var102] >> 2) + (this.field964[var2][var102 + 1] >> 3) + (this.field964[var2][var102] >> 1));
                }
            }
            this.field963 = new class243[this.field967.method987(18791)];
            this.field967.method984(this.field963, 1);
            for (int var3 = 0; var3 < this.field963.length; ++var3) {
                this.field963[var3].method1431((byte) 124, this.field969);
            }
            int var4 = 24;
            if (this.field945 != null) {
                var4 += 4;
            }
            if (~(7 & this.field919) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field933.field5862.method2627(this.field969 * var4);
            NativeStream var6 = new NativeStream(var5);
            class243[] var7 = new class243[this.field969];
            class159 var8 = new class159(class305.method1730(this.field969, 3299));
            class243[] var9 = new class243[this.field970];
            for (int var10 = 0; ~super.field495 < ~var10; ++var10) {
                for (int var29 = 0; super.field497 > var29; ++var29) {
                    if (this.field956[var10][var29] != null) {
                        class243[] var30 = this.field958[var10][var29];
                        int[] var31 = this.field942[var10][var29];
                        int[] var32 = this.field930[var10][var29];
                        int[] var33 = this.field926[var10][var29];
                        int[] var34 = this.field956[var10][var29];
                        int[] var35 = this.field941 != null ? this.field941[var10][var29] : null;
                        if (var33 == null) {
                            var33 = var34;
                        }
                        int[] var36 = this.field945 == null ? null : this.field945[var10][var29];
                        float var37 = this.field962[var10][var29];
                        float var38 = this.field971[var10][var29];
                        float var39 = this.field960[var10][var29];
                        float var40 = this.field962[var10][var29 + 1];
                        float var41 = this.field971[var10][var29 + 1];
                        float var42 = this.field960[var10][var29 + 1];
                        float var43 = this.field962[var10 + 1][var29 + 1];
                        float var44 = this.field971[var10 + 1][var29 + 1];
                        float var45 = this.field960[var10 - -1][var29 + 1];
                        float var46 = this.field962[var10 + 1][var29];
                        float var47 = this.field971[var10 + 1][var29];
                        float var48 = this.field960[var10 + 1][var29];
                        int var49 = var1[var10][var29] & 255;
                        int var50 = 255 & var1[var10][var29 - -1];
                        int var51 = var1[var10 + 1][var29 + 1] & 255;
                        int var52 = var1[var10 + 1][var29] & 255;
                        int var53 = 0;
                        label334: for (int var54 = 0; var34.length > var54; ++var54) {
                            class243 var100 = var30[var54];
                            for (int var101 = 0; ~var101 > ~var53; ++var101) {
                                if (var9[var101] == var100) {
                                    continue label334;
                                }
                            }
                            var9[var53++] = var100;
                        }
                        short[] var55 = this.field943[super.field495 * var29 + var10] = new short[var34.length];
                        for (int var56 = 0; var56 < var34.length; ++var56) {
                            int var57 = (var10 << super.field492) - -var31[var56];
                            int var58 = (var29 << super.field492) - -var32[var56];
                            int var59 = var57 >> this.field936;
                            int var60 = var58 >> this.field936;
                            int var61 = var34[var56];
                            int var62 = var33[var56];
                            int var63 = var35 != null ? var35[var56] : 0;
                            long var64 = (long) var60 | (long) var61 << 32 | (long) var62 << 48 | (long) (var59 << 16);
                            int var66 = var31[var56];
                            int var67 = var32[var56];
                            byte var68 = 74;
                            int var69 = 0;
                            float var70 = 1.0F;
                            int var71;
                            float var72;
                            float var73;
                            float var74;
                            if (var66 == 0 && var67 == 0) {
                                var71 = var68 - var49;
                                var72 = var37;
                                var73 = var38;
                                var74 = var39;
                            } else if (var66 == 0 && super.field494 == var67) {
                                var73 = var41;
                                var71 = var68 - var50;
                                var74 = var42;
                                var72 = var40;
                            } else if (~super.field494 == ~var66 && ~super.field494 == ~var67) {
                                var72 = var43;
                                var74 = var45;
                                var73 = var44;
                                var71 = var68 - var51;
                            } else if (super.field494 == var66 && ~var67 == -1) {
                                var73 = var47;
                                var71 = var68 - var52;
                                var74 = var48;
                                var72 = var46;
                            } else {
                                float var75 = (float) var66 / (float) super.field494;
                                float var76 = (float) var67 / (float) super.field494;
                                float var77 = (var46 - var37) * var75 + var37;
                                float var78 = (-var38 + var47) * var75 + var38;
                                float var79 = (-var39 + var48) * var75 + var39;
                                float var80 = (var43 - var40) * var75 + var40;
                                float var81 = (-var41 + var44) * var75 + var41;
                                var73 = (var81 - var78) * var76 + var78;
                                var72 = (var80 - var77) * var76 + var77;
                                float var82 = (-var42 + var45) * var75 + var42;
                                var74 = (var82 - var79) * var76 + var79;
                                int var83 = ((-var49 + var52) * var66 >> super.field492) + var49;
                                int var84 = var50 - -((-var50 + var51) * var66 >> super.field492);
                                var71 = var68 - (((-var83 + var84) * var67 >> super.field492) + var83);
                            }
                            if (~var61 != 0) {
                                int var85 = (var61 & 127) * var71 >> 7;
                                if (~var85 <= -3) {
                                    if (var85 > 126) {
                                        var85 = 126;
                                    }
                                } else {
                                    var85 = 2;
                                }
                                var69 = class437.field6373[var85 | 65408 & var61];
                                if (~(7 & this.field919) == -1) {
                                    float var86 = this.field933.field5940[2] * var74 + this.field933.field5940[0] * var72 + this.field933.field5940[1] * var73;
                                    var70 = var86 * (var86 > 0.0F ? this.field933.field5892 : this.field933.field5920) + this.field933.field5960;
                                }
                            }
                            class499 var87 = null;
                            if ((this.field921 + -1 & var57) == 0 && (this.field921 + -1 & var58) == 0) {
                                var87 = var8.method979((byte) 28, var64);
                            }
                            int var88;
                            if (var87 != null) {
                                var55[var56] = ((class472) var87).field6897;
                                var88 = var55[var56] & 65535;
                                if (var61 != -1 && var7[var88].field7342 > var30[var56].field7342) {
                                    var7[var88] = var30[var56];
                                }
                            } else {
                                int var89;
                                if (~var61 == ~var62) {
                                    var89 = var69;
                                } else {
                                    int var90 = (var62 & 127) * var71 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var89 = class437.field6373[var90 | 65408 & var62];
                                    if (~(this.field919 & 7) == -1) {
                                        float var91 = this.field933.field5940[2] * var74 + this.field933.field5940[1] * var73 + this.field933.field5940[0] * var72;
                                        float var92 = var70 * (var70 > 0.0F ? this.field933.field5892 : this.field933.field5920) + this.field933.field5960;
                                        int var93 = (var89 & 16761834) >> 16;
                                        int var94 = (var89 & 65318) >> 8;
                                        int var95 = 255 & var89;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (~var96 > -1) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var97 >= 0) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var96 << 16 | var97 << 8 | var98;
                                    }
                                }
                                if (!this.field933.field5931) {
                                    var6.method2622((float) var57);
                                    var6.method2622((float) (var63 + this.method232(var57, var58)));
                                    var6.method2622((float) var58);
                                    var6.method2620((byte) (var89 >> 16));
                                    var6.method2620((byte) (var89 >> 8));
                                    var6.method2620((byte) var89);
                                    var6.method2620(-1);
                                    var6.method2622((float) var57);
                                    var6.method2622((float) var58);
                                    if (this.field945 != null) {
                                        var6.method2622((float) (var36 == null ? 0 : var36[var56] + -1));
                                    }
                                    if (~(7 & this.field919) != -1) {
                                        var6.method2622(var72);
                                        var6.method2622(var73);
                                        var6.method2622(var74);
                                    }
                                } else {
                                    var6.method2624((float) var57);
                                    var6.method2624((float) (var63 + this.method232(var57, var58)));
                                    var6.method2624((float) var58);
                                    var6.method2620((byte) (var89 >> 16));
                                    var6.method2620((byte) (var89 >> 8));
                                    var6.method2620((byte) var89);
                                    var6.method2620(-1);
                                    var6.method2624((float) var57);
                                    var6.method2624((float) var58);
                                    if (this.field945 != null) {
                                        var6.method2624((float) (var36 == null ? 0 : var36[var56] + -1));
                                    }
                                    if ((7 & this.field919) != 0) {
                                        var6.method2624(var72);
                                        var6.method2624(var73);
                                        var6.method2624(var74);
                                    }
                                }
                                var88 = this.field954++;
                                var55[var56] = (short) var88;
                                if (~var61 != 0) {
                                    var7[var88] = var30[var56];
                                }
                                var8.method990(var64, (byte) 59, new class472(var55[var56]));
                            }
                            for (int var99 = 0; ~var99 > ~var53; ++var99) {
                                var9[var99].method1436(var70, var88, var71, (byte) -18, var69);
                            }
                            ++this.field959;
                        }
                    }
                }
            }
            for (int var11 = 0; ~this.field954 < ~var11; ++var11) {
                class243 var28 = var7[var11];
                if (var28 != null) {
                    var28.method1432(122, var11);
                }
            }
            for (int var12 = 0; super.field495 > var12; ++var12) {
                for (int var17 = 0; super.field497 > var17; ++var17) {
                    short[] var18 = this.field943[super.field495 * var17 + var12];
                    if (var18 != null) {
                        int var19 = 0;
                        int var20 = 0;
                        while (var20 < var18.length) {
                            int var21 = 65535 & var18[var20++];
                            int var22 = var18[var20++] & 65535;
                            int var23 = 65535 & var18[var20++];
                            class243 var24 = var7[var21];
                            class243 var25 = var7[var22];
                            class243 var26 = var7[var23];
                            class243 var27 = null;
                            if (var24 != null) {
                                var24.method1438((byte) -95, var12, var17, var19);
                                var27 = var24;
                            }
                            if (var25 != null) {
                                var25.method1438((byte) -121, var12, var17, var19);
                                if (var27 == null || ~var25.field7342 > ~var27.field7342) {
                                    var27 = var25;
                                }
                            }
                            if (var26 != null) {
                                var26.method1438((byte) -87, var12, var17, var19);
                                if (var27 == null || var27.field7342 > var26.field7342) {
                                    var27 = var26;
                                }
                            }
                            if (var27 != null) {
                                if (var24 != null) {
                                    var27.method1432(106, var21);
                                }
                                if (var25 != null) {
                                    var27.method1432(114, var22);
                                }
                                if (var26 != null) {
                                    var27.method1432(124, var23);
                                }
                                var27.method1438((byte) -37, var12, var17, var19);
                            }
                            ++var19;
                        }
                    }
                }
            }
            var6.method2625();
            this.field968 = this.field933.method2368(false, var4, 0, var5, var6.method2621());
            this.field966 = new class12(this.field933, this.field968, 5126, 3, 0);
            this.field972 = new class12(this.field933, this.field968, 5121, 4, 12);
            byte var13;
            if (this.field945 == null) {
                var13 = 24;
                this.field961 = new class12(this.field933, this.field968, 5126, 2, 16);
            } else {
                this.field961 = new class12(this.field933, this.field968, 5126, 3, 16);
                var13 = 28;
            }
            if (~(this.field919 & 7) != -1) {
                this.field965 = new class12(this.field933, this.field968, 5126, 3, var13);
            }
            long[] var14 = new long[this.field963.length];
            for (int var15 = 0; this.field963.length > var15; ++var15) {
                class243 var16 = this.field963[var15];
                var14[var15] = var16.field7342;
                var16.method1439(this.field954, -102);
            }
            class47.method297(var14, 119, this.field963);
            if (this.field922 != null) {
                this.field922.method2173((byte) -77);
            }
        }
        ++field929;
        this.field956 = null;
        this.field945 = null;
        this.field958 = null;
        this.field942 = this.field930 = null;
        this.field926 = null;
        this.field964 = null;
        this.field962 = this.field971 = this.field960 = null;
        this.field941 = null;
        this.field967 = null;
    }

    @OriginalMember(owner = "client!jt", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public final void method227(class378 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field940;
        if (this.field922 != null && arg0 != null) {
            int var7 = -(this.field933.field5945 * arg2 >> 8) + arg1 >> this.field933.field5866;
            int var8 = -(this.field933.field5937 * arg2 >> 8) + arg3 >> this.field933.field5866;
            this.field922.method2179(arg0, var7, var8, true);
        }
    }

    @OriginalMember(owner = "client!jt", name = "va", descriptor = "(II)I")
    public final int method232(int arg0, int arg1) {
        ++field948;
        int var3 = arg0 >> super.field492;
        int var4 = arg1 >> super.field492;
        if (~var3 <= -1 && ~var4 <= -1 && super.field495 - 1 >= var3 && ~(super.field497 + -1) <= ~var4) {
            int var5 = super.field494 + -1 & arg0;
            int var6 = arg1 & super.field494 + -1;
            int var7 = (-var5 + super.field494) * this.field937[var3][var4] + this.field937[var3 + 1][var4] * var5 >> super.field492;
            int var8 = (super.field494 - var5) * this.field937[var3][var4 + 1] - -(this.field937[var3 - -1][var4 + 1] * var5) >> super.field492;
            return (-var6 + super.field494) * var7 - -(var6 * var8) >> super.field492;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
    public static void method420(byte arg0) {
        if (arg0 <= 77) {
            method420((byte) -116);
        }
        field939 = null;
        field927 = null;
        field957 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field931;
        if (~this.field969 < -1) {
            this.field933.method2404(-53);
            this.field933.method2395(73, false);
            this.field933.method2433(false, (byte) -57);
            this.field933.method2411(10217, false);
            this.field933.method2431(false, -31688);
            this.field933.method2356((byte) -21, 0);
            this.field933.method2366(-2, 1874);
            this.field933.method2412((byte) 4, (class188) null);
            class411.field6025[9] = 0.0F;
            class411.field6025[6] = 0.0F;
            class411.field6025[4] = 0.0F;
            class411.field6025[10] = 0.0F;
            class411.field6025[2] = 0.0F;
            class411.field6025[7] = 0.0F;
            class411.field6025[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field933.field5730) + -1.0F;
            class411.field6025[1] = 0.0F;
            class411.field6025[14] = 0.0F;
            class411.field6025[8] = 0.0F;
            class411.field6025[3] = 0.0F;
            class411.field6025[11] = 0.0F;
            class411.field6025[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field933.field5680) + 1.0F;
            class411.field6025[5] = (float) arg2 / ((float) super.field494 * 128.0F * (float) this.field933.field5680);
            class411.field6025[0] = (float) arg2 / ((float) super.field494 * 128.0F * (float) this.field933.field5730);
            class411.field6025[15] = 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class411.field6025, 0);
            class411.field6025[1] = 0.0F;
            class411.field6025[6] = 1.0F;
            class411.field6025[7] = 0.0F;
            class411.field6025[9] = 1.0F;
            class411.field6025[15] = 1.0F;
            class411.field6025[13] = 0.0F;
            class411.field6025[12] = 0.0F;
            class411.field6025[4] = 0.0F;
            class411.field6025[14] = 0.0F;
            class411.field6025[3] = 0.0F;
            class411.field6025[11] = 0.0F;
            class411.field6025[5] = 0.0F;
            class411.field6025[10] = 0.0F;
            class411.field6025[8] = 0.0F;
            class411.field6025[0] = 1.0F;
            class411.field6025[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class411.field6025, 0);
            if ((this.field919 & 7) == 0) {
                this.field933.method2433(false, (byte) 105);
            } else {
                this.field933.method2433(true, (byte) -67);
                this.field933.method2437((byte) 41);
            }
            this.field933.method2439(this.field961, (byte) -11, this.field966, this.field972, this.field965);
            if (class170.field2403.field5073.length >= this.field959 * 2) {
                class170.field2403.field5069 = 0;
            } else {
                class170.field2403 = new class365(this.field959 * 2);
            }
            int var9 = 0;
            if (this.field933.field5931) {
                for (int var10 = arg4; ~arg6 < ~var10; ++var10) {
                    int var11 = super.field495 * var10 + arg3;
                    for (int var12 = arg3; ~var12 > ~arg5; ++var12) {
                        if (arg7[-arg3 + var12][-arg4 + var10]) {
                            short[] var13 = this.field943[var11];
                            if (var13 != null) {
                                for (int var14 = 0; ~var14 > ~var13.length; ++var14) {
                                    class170.field2403.method2070(81954016, 65535 & var13[var14]);
                                    ++var9;
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; arg6 > var15; ++var15) {
                    int var17 = super.field495 * var15 - -arg3;
                    for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field943[var17];
                            if (var19 != null) {
                                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                    ++var9;
                                    class170.field2403.method2115((byte) 62, 65535 & var19[var20]);
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (var9 > 0) {
                class342 var16 = new class342(this.field933, 5123, class170.field2403.field5073, class170.field2403.field5069);
                this.field933.method2420(0, var9, 114, var16, 4);
            }
        }
    }
}
