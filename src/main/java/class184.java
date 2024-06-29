import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class184 extends class309 {

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    private int field2942 = 0;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "Z")
    public boolean field2949 = false;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public int field2947 = 0;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "B")
    private byte field2956 = 0;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    private int field2964 = 0;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    private int field2968 = 0;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "B")
    private byte field2974 = 0;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "[I")
    private int[] field2951;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "[I")
    public int[] field2955;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "[I")
    public int[] field2948;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "[I")
    public int[] field2954;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[I")
    private int[] field2940;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "[S")
    private short[] field2977;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "[S")
    private short[] field2972;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "[S")
    private short[] field2960;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "[S")
    private short[] field2965;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "[S")
    private short[] field2946;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "[F")
    private float[] field2961;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "[F")
    private float[] field2969;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "[S")
    private short[] field2970;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "[B")
    private byte[] field2980;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "[S")
    private short[] field2973;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "[S")
    private short[] field2966;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "[S")
    private short[] field2967;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "[S")
    private short[] field2975;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "[B")
    private byte[] field2979;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[S")
    private short[] field2945;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Lpf;")
    public class13 field2963;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Ltb;")
    public class219 field2941;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Ltb;")
    private class219 field2952;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Ltb;")
    private class219 field2944;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Ltb;")
    private class219 field2978;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "Ltb;")
    private class219 field2976;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "S")
    private short field2950;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "S")
    private short field2958;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "[S")
    private short[] field2962;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "[I")
    private int[] field2939;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "Lag;")
    private static class202 field2953 = new class202(10000);

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Ls;")
    private static class184 field2982 = new class184();

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Ls;")
    private static class184 field2983 = new class184();

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "Ls;")
    private static class184 field2984 = new class184();

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "Ls;")
    private static class184 field2985 = new class184();

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "Ls;")
    private static class184 field2986 = new class184();

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "Ls;")
    private static class184 field2987 = new class184();

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "[I")
    private static int[] field2993 = new int[1];

    @OriginalMember(owner = "client!s", name = "tb", descriptor = "[I")
    private static int[] field2997 = new int[1];

    @OriginalMember(owner = "client!s", name = "ub", descriptor = "Z")
    private static boolean field2998 = false;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "F")
    private static float field2988;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "F")
    private static float field2990;

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "F")
    private static float field2991;

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "F")
    private static float field2992;

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "F")
    private static float field2994;

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "F")
    private static float field2995;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "I")
    private static int field2989;

    @OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
    private static int field2996;

    @OriginalMember(owner = "client!s", name = "vb", descriptor = "I")
    private static int field2999;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "Lch;")
    private class111 field2971;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Lle;")
    private class231 field2957;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2981;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "[J")
    private static long[] field2959;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[[I")
    private int[][] field2938;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[[I")
    private int[][] field2943;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "()I", line = 7)
    public final int method160() {
        if (!this.field2963.field244) {
            this.method1179();
        }
        return this.field2963.field246;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILs;[[I[[IIII)V", line = 14)
    public final void method1148(int arg0, int arg1, class184 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2963.field244) {
            arg2.method1179();
        }
        int var9 = arg2.field2963.field250 + arg5;
        int var10 = arg2.field2963.field245 + arg5;
        int var11 = arg2.field2963.field249 + arg7;
        int var12 = arg2.field2963.field247 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field2964; var17++) {
                int var18 = this.field2955[var17] + arg5;
                int var19 = this.field2954[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2948[var17] = this.field2948[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2963.field248;
            for (int var28 = 0; var28 < this.field2964; var28++) {
                int var29 = (this.field2948[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2955[var28] + arg5;
                    int var31 = this.field2954[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2948[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method2067(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2963.field246 - arg2.field2963.field248;
            for (int var42 = 0; var42 < this.field2964; var42++) {
                int var43 = this.field2955[var42] + arg5;
                int var44 = this.field2954[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2948[var42] = var51 + this.field2948[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2963.field246 - arg2.field2963.field248;
            for (int var53 = 0; var53 < this.field2964; var53++) {
                int var54 = this.field2955[var53] + arg5;
                int var55 = this.field2954[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field2948[var53] = ((this.field2948[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2941.field3470 = false;
        this.field2963.field244 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lsc;IIIZ)V", line = 214)
    public final void method38(class19 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class184 var6 = (class184) arg0;
        if (this.field2968 == 0 || var6.field2968 == 0) {
            return;
        }
        int var7 = var6.field2964;
        int[] var8 = var6.field2955;
        int[] var9 = var6.field2948;
        int[] var10 = var6.field2954;
        short[] var11 = var6.field2972;
        short[] var12 = var6.field2960;
        short[] var13 = var6.field2965;
        short[] var14 = var6.field2946;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2971 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2971.field1965;
            var16 = this.field2971.field1962;
            var17 = this.field2971.field1964;
            var18 = this.field2971.field1963;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2971 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2971.field1965;
            var20 = var6.field2971.field1962;
            var21 = var6.field2971.field1964;
            var22 = var6.field2971.field1963;
        }
        int[] var23 = var6.field2951;
        short[] var24 = var6.field2962;
        if (!var6.field2963.field244) {
            var6.method1179();
        }
        short var25 = var6.field2963.field248;
        short var26 = var6.field2963.field246;
        short var27 = var6.field2963.field250;
        short var28 = var6.field2963.field245;
        short var29 = var6.field2963.field249;
        short var30 = var6.field2963.field247;
        for (int var31 = 0; var31 < this.field2964; var31++) {
            int var32 = this.field2948[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2955[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2954[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2951[var31];
                        int var37 = this.field2951[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2962[var38] - 1;
                            if (var35 == -1 || this.field2946[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field2971 = new class111();
                                            var15 = this.field2971.field1965 = class202.method1290(this.field2972, 74);
                                            var16 = this.field2971.field1962 = class202.method1290(this.field2960, 116);
                                            var17 = this.field2971.field1964 = class202.method1290(this.field2965, 109);
                                            var18 = this.field2971.field1963 = class202.method1290(this.field2946, 89);
                                        }
                                        if (var19 == null) {
                                            class111 var44 = var6.field2971 = new class111();
                                            var19 = var44.field1965 = class202.method1290(var11, 80);
                                            var20 = var44.field1962 = class202.method1290(var12, 115);
                                            var21 = var44.field1964 = class202.method1290(var13, 85);
                                            var22 = var44.field1963 = class202.method1290(var14, 87);
                                        }
                                        short var45 = this.field2972[var35];
                                        short var46 = this.field2960[var35];
                                        short var47 = this.field2965[var35];
                                        short var48 = this.field2946[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field2951[var31];
                                        int var58 = this.field2951[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2962[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V", line = 454)
    public final void method145(int arg0) {
        int var2 = class284.field4395[arg0];
        int var3 = class284.field4398[arg0];
        for (int var4 = 0; var4 < this.field2947; var4++) {
            int var5 = this.field2948[var4] * var3 - this.field2954[var4] * var2 >> 16;
            this.field2954[var4] = this.field2954[var4] * var3 + this.field2948[var4] * var2 >> 16;
            this.field2948[var4] = var5;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "n", descriptor = "()V", line = 474)
    public static final void method1149() {
        field2982 = new class184();
        field2983 = new class184();
        field2984 = new class184();
        field2985 = new class184();
        field2986 = new class184();
        field2987 = new class184();
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V", line = 484)
    public final void method132(int arg0) {
        int var2 = class284.field4395[arg0];
        int var3 = class284.field4398[arg0];
        for (int var4 = 0; var4 < this.field2947; var4++) {
            int var5 = this.field2955[var4] * var3 + this.field2954[var4] * var2 >> 16;
            this.field2954[var4] = this.field2954[var4] * var3 - this.field2955[var4] * var2 >> 16;
            this.field2955[var4] = var5;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "o", descriptor = "()I", line = 503)
    public final int method1150() {
        return this.field2950;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()Z", line = 508)
    public final boolean method34() {
        return this.field2949 && this.field2955 != null && this.field2972 != null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(SS)V", line = 514)
    public final void method1151(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2968; var3++) {
            if (this.field2970[var3] == arg0) {
                this.field2970[var3] = arg1;
            }
        }
        this.field2952.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(ZZZ)Lbg;", line = 527)
    public final class309 method168(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1167(arg0, arg1, arg2, field2983, field2982);
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "()V", line = 532)
    public final void method131() {
        for (int var1 = 0; var1 < this.field2947; var1++) {
            int var2 = this.field2955[var1];
            this.field2955[var1] = this.field2954[var1];
            this.field2954[var1] = -var2;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "p", descriptor = "()V", line = 546)
    public final void method1152() {
        if (this.field2972 == null) {
            this.method157();
            return;
        }
        for (int var1 = 0; var1 < this.field2947; var1++) {
            this.field2955[var1] = -this.field2955[var1];
            this.field2954[var1] = -this.field2954[var1];
        }
        for (int var2 = 0; var2 < this.field2942; var2++) {
            this.field2972[var2] = (short) (-this.field2972[var2]);
            this.field2965[var2] = (short) (-this.field2965[var2]);
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
        if (this.field2944 != null) {
            this.field2944.field3470 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(FFF)I", line = 580)
    private static final int method1153(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!s", name = "q", descriptor = "()V", line = 615)
    public final void method1154() {
        if (this.field2972 == null) {
            this.method149();
            return;
        }
        for (int var1 = 0; var1 < this.field2947; var1++) {
            int var2 = this.field2954[var1];
            this.field2954[var1] = this.field2955[var1];
            this.field2955[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2942; var3++) {
            short var4 = this.field2965[var3];
            this.field2965[var3] = this.field2972[var3];
            this.field2972[var3] = (short) (-var4);
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
        if (this.field2944 != null) {
            this.field2944.field3470 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V", line = 653)
    public final void method1155(int arg0) {
        if (this.field2972 == null) {
            this.method132(arg0);
            return;
        }
        int var2 = class284.field4395[arg0];
        int var3 = class284.field4398[arg0];
        for (int var4 = 0; var4 < this.field2947; var4++) {
            int var5 = this.field2955[var4] * var3 + this.field2954[var4] * var2 >> 16;
            this.field2954[var4] = this.field2954[var4] * var3 - this.field2955[var4] * var2 >> 16;
            this.field2955[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2942; var6++) {
            int var7 = this.field2972[var6] * var3 + this.field2965[var6] * var2 >> 16;
            this.field2965[var6] = (short) (this.field2965[var6] * var3 - this.field2972[var6] * var2 >> 16);
            this.field2972[var6] = (short) var7;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
        if (this.field2944 != null) {
            this.field2944.field3470 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "r", descriptor = "()I", line = 695)
    public final int method1156() {
        return this.field2958;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 698)
    private static final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field2992 = var18;
        field2994 = var19;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 776)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class275 arg10) {
        if (this.field2942 == 0) {
            return;
        }
        if (!this.field2963.field244) {
            this.method1179();
        }
        short var13 = this.field2963.field251;
        short var14 = this.field2963.field248;
        short var15 = this.field2963.field246;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class39.field760) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class329.field5044) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class191.field3095) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class343.field5334) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class284.field4395[arg0];
            var27 = class284.field4398[arg0];
        }
        if (arg8 > 0L && class328.field5037 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class130.field2202 >= var28 && class130.field2202 <= var29 && class201.field3208 >= var30 && class201.field3208 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field2963.field250;
                short var37 = this.field2963.field245;
                short var38 = this.field2963.field249;
                short var39 = this.field2963.field247;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class130.field2202 >= var32 && class130.field2202 <= var33 && class201.field3208 >= var34 && class201.field3208 <= var35) {
                    if (this.field4704) {
                        class183.field2931[class223.field3520++] = arg8;
                    } else {
                        if (field2997.length < this.field2942) {
                            field2997 = new int[this.field2942];
                            field2993 = new int[this.field2942];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field2964) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field2968) {
                                        break label118;
                                    }
                                    short var80 = this.field2973[var79];
                                    short var81 = this.field2966[var79];
                                    short var82 = this.field2967[var79];
                                    if (this.method1172(class130.field2202, class201.field3208, field2993[var80], field2993[var81], field2993[var82], field2997[var80], field2997[var81], field2997[var82])) {
                                        class183.field2931[class223.field3520++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field2955[var59];
                            int var61 = this.field2948[var59];
                            int var62 = this.field2954[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field2951[var59];
                            int var76 = this.field2951[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field2962[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field2997[var78] = var73;
                                field2993[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class249.field3898;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1168();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lel;IJIIIIFF)S", line = 1051)
    private final short method1158(class3 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2951[arg1];
        int var12 = this.field2951[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2962[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2959[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2962[var13] = (short) (this.field2942 + 1);
        field2959[var13] = arg2;
        this.field2972[this.field2942] = (short) arg3;
        this.field2960[this.field2942] = (short) arg4;
        this.field2965[this.field2942] = (short) arg5;
        this.field2946[this.field2942] = (short) arg6;
        this.field2961[this.field2942] = arg7;
        this.field2969[this.field2942] = arg8;
        return (short) (this.field2942++);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()I", line = 1086)
    public final int method39() {
        if (!this.field2963.field244) {
            this.method1179();
        }
        return this.field2963.field248;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lsc;", line = 1092)
    public final class19 method17(int arg0, int arg1, int arg2) {
        this.field2949 = false;
        if (this.field2971 != null) {
            this.field2972 = this.field2971.field1965;
            this.field2960 = this.field2971.field1962;
            this.field2965 = this.field2971.field1964;
            this.field2946 = this.field2971.field1963;
            this.field2971 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZ)V", line = 1105)
    public final void method1159(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2974 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2942 != 0) {
            if (arg6) {
                boolean var8 = !this.field2952.field3470 && (arg1 || arg2 && !class334.field5115);
                this.method1180(false, !this.field2941.field3470 && arg0, var8, this.field2944 != null && !this.field2944.field3470 && arg2, !this.field2978.field3470 && arg3);
                if (!this.field2976.field3470 && arg4 && arg1) {
                    this.method1161();
                }
            }
            if (arg0) {
                if (this.field2941.field3470) {
                    if (!this.field2963.field244) {
                        this.method1179();
                    }
                    this.field2955 = null;
                    this.field2948 = null;
                    this.field2954 = null;
                    this.field2962 = null;
                    this.field2951 = null;
                } else {
                    this.field2956 = (byte) (this.field2956 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2952.field3470) {
                    this.field2970 = null;
                    this.field2980 = null;
                } else {
                    this.field2956 = (byte) (this.field2956 | 0x2);
                }
            }
            if (arg2 && class334.field5115) {
                if (this.field2944.field3470) {
                    this.field2972 = null;
                    this.field2960 = null;
                    this.field2965 = null;
                    this.field2946 = null;
                } else {
                    this.field2956 = (byte) (this.field2956 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2978.field3470) {
                    this.field2961 = null;
                    this.field2969 = null;
                } else {
                    this.field2956 = (byte) (this.field2956 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2976.field3470 && this.field2952.field3470) {
                    this.field2973 = null;
                    this.field2966 = null;
                    this.field2967 = null;
                } else {
                    this.field2956 = (byte) (this.field2956 | 0x10);
                }
            }
            if (arg5) {
                this.field2940 = null;
                this.field2979 = null;
                this.field2943 = (int[][]) null;
                this.field2938 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V", line = 1200)
    public final void method134(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2989 = 0;
            field2999 = 0;
            field2996 = 0;
            for (int var6 = 0; var6 < this.field2947; var6++) {
                field2989 += this.field2955[var6];
                field2999 += this.field2948[var6];
                field2996 += this.field2954[var6];
                var5++;
            }
            if (var5 > 0) {
                field2989 = field2989 / var5 + arg1;
                field2999 = field2999 / var5 + arg2;
                field2996 = field2996 / var5 + arg3;
            } else {
                field2989 = arg1;
                field2999 = arg2;
                field2996 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2947; var7++) {
                this.field2955[var7] += arg1;
                this.field2948[var7] += arg2;
                this.field2954[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2947; var8++) {
                this.field2955[var8] -= field2989;
                this.field2948[var8] -= field2999;
                this.field2954[var8] -= field2996;
                if (arg3 != 0) {
                    int var9 = class284.field4395[arg3];
                    int var10 = class284.field4398[arg3];
                    int var11 = this.field2955[var8] * var10 + this.field2948[var8] * var9 + 32767 >> 16;
                    this.field2948[var8] = this.field2948[var8] * var10 + 32767 - this.field2955[var8] * var9 >> 16;
                    this.field2955[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class284.field4395[arg1];
                    int var13 = class284.field4398[arg1];
                    int var14 = this.field2948[var8] * var13 + 32767 - this.field2954[var8] * var12 >> 16;
                    this.field2954[var8] = this.field2954[var8] * var13 + this.field2948[var8] * var12 + 32767 >> 16;
                    this.field2948[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class284.field4395[arg2];
                    int var16 = class284.field4398[arg2];
                    int var17 = this.field2955[var8] * var16 + this.field2954[var8] * var15 + 32767 >> 16;
                    this.field2954[var8] = this.field2954[var8] * var16 + 32767 - this.field2955[var8] * var15 >> 16;
                    this.field2955[var8] = var17;
                }
                this.field2955[var8] += field2989;
                this.field2948[var8] += field2999;
                this.field2954[var8] += field2996;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2947; var18++) {
                this.field2955[var18] -= field2989;
                this.field2948[var18] -= field2999;
                this.field2954[var18] -= field2996;
                this.field2955[var18] = this.field2955[var18] * arg1 / 128;
                this.field2948[var18] = this.field2948[var18] * arg2 / 128;
                this.field2954[var18] = this.field2954[var18] * arg3 / 128;
                this.field2955[var18] += field2989;
                this.field2948[var18] += field2999;
                this.field2954[var18] += field2996;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2968; var19++) {
                int var20 = (this.field2980[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2980[var19] = (byte) var20;
            }
            this.field2952.field3470 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field2968; var21++) {
                int var22 = this.field2970[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field2970[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field2952.field3470 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZ)Lbg;", line = 1395)
    public final class309 method144(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1167(arg0, arg1, arg2, field2985, field2984);
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V", line = 1399)
    public final void method1160(int arg0) {
        this.field2958 = (short) arg0;
        if (this.field2944 != null) {
            this.field2944.field3470 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "s", descriptor = "()V", line = 1406)
    private final void method1161() {
        if (field2953.field3273.length < this.field2968 * 12) {
            field2953 = new class202((this.field2968 + 100) * 12);
        } else {
            field2953.field3249 = 0;
        }
        if (class249.field3916) {
            for (int var1 = 0; var1 < this.field2968; var1++) {
                field2953.method1359(16705, this.field2973[var1]);
                field2953.method1359(16705, this.field2966[var1]);
                field2953.method1359(16705, this.field2967[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field2968; var2++) {
                field2953.method1348(this.field2973[var2], true);
                field2953.method1348(this.field2966[var2], true);
                field2953.method1348(this.field2967[var2], true);
            }
        }
        if (!class249.field3877) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2953.field3249);
            var5.put(field2953.field3273, 0, field2953.field3249);
            var5.flip();
            this.field2976.field3470 = true;
            this.field2976.field3472 = var5;
            this.field2976.field3476 = null;
            return;
        }
        class231 var3 = new class231();
        ByteBuffer var4 = ByteBuffer.wrap(field2953.field3273, 0, field2953.field3249);
        var3.method1532(var4);
        this.field2976.field3470 = true;
        this.field2976.field3472 = null;
        this.field2976.field3476 = var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIFFF)[F", line = 1465)
    private static final float[] method1162(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZI[I)V", line = 1531)
    public final void method153(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field2989 = 0;
            field2999 = 0;
            field2996 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2943.length) {
                    int[] var16 = this.field2943[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2977 == null || (arg6 & this.field2977[var18]) != 0) {
                            field2989 += this.field2955[var18];
                            field2999 += this.field2948[var18];
                            field2996 += this.field2954[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field2989 = field2989 / var13 + var10;
                field2999 = field2999 / var13 + var11;
                field2996 = field2996 / var13 + var12;
                field2998 = true;
            } else {
                field2989 = var10;
                field2999 = var11;
                field2996 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2943.length) {
                    int[] var27 = this.field2943[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2977 == null || (arg6 & this.field2977[var29]) != 0) {
                            this.field2955[var29] += var22;
                            this.field2948[var29] += var23;
                            this.field2954[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field2943.length) {
                        int[] var92 = this.field2943[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field2977 == null || (arg6 & this.field2977[var94]) != 0) {
                                this.field2955[var94] -= field2989;
                                this.field2948[var94] -= field2999;
                                this.field2954[var94] -= field2996;
                                if (arg4 != 0) {
                                    int var95 = class284.field4395[arg4];
                                    int var96 = class284.field4398[arg4];
                                    int var97 = this.field2955[var94] * var96 + this.field2948[var94] * var95 + 32767 >> 16;
                                    this.field2948[var94] = this.field2948[var94] * var96 + 32767 - this.field2955[var94] * var95 >> 16;
                                    this.field2955[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class284.field4395[arg2];
                                    int var99 = class284.field4398[arg2];
                                    int var100 = this.field2948[var94] * var99 + 32767 - this.field2954[var94] * var98 >> 16;
                                    this.field2954[var94] = this.field2954[var94] * var99 + this.field2948[var94] * var98 + 32767 >> 16;
                                    this.field2948[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class284.field4395[arg3];
                                    int var102 = class284.field4398[arg3];
                                    int var103 = this.field2955[var94] * var102 + this.field2954[var94] * var101 + 32767 >> 16;
                                    this.field2954[var94] = this.field2954[var94] * var102 + 32767 - this.field2955[var94] * var101 >> 16;
                                    this.field2955[var94] = var103;
                                }
                                this.field2955[var94] += field2989;
                                this.field2948[var94] += field2999;
                                this.field2954[var94] += field2996;
                            }
                        }
                    }
                }
                if (arg5 && this.field2972 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field2943.length) {
                            int[] var106 = this.field2943[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field2977 == null || (arg6 & this.field2977[var108]) != 0) {
                                    int var109 = this.field2951[var108];
                                    int var110 = this.field2951[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field2962[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class284.field4395[arg4];
                                            int var114 = class284.field4398[arg4];
                                            int var115 = this.field2972[var112] * var114 + this.field2960[var112] * var113 + 32767 >> 16;
                                            this.field2960[var112] = (short) (this.field2960[var112] * var114 + 32767 - this.field2972[var112] * var113 >> 16);
                                            this.field2972[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class284.field4395[arg2];
                                            int var117 = class284.field4398[arg2];
                                            int var118 = this.field2960[var112] * var117 + 32767 - this.field2965[var112] * var116 >> 16;
                                            this.field2965[var112] = (short) (this.field2965[var112] * var117 + this.field2960[var112] * var116 + 32767 >> 16);
                                            this.field2960[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class284.field4395[arg3];
                                            int var120 = class284.field4398[arg3];
                                            int var121 = this.field2972[var112] * var120 + this.field2965[var112] * var119 + 32767 >> 16;
                                            this.field2965[var112] = (short) (this.field2965[var112] * var120 + 32767 - this.field2972[var112] * var119 >> 16);
                                            this.field2972[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2944 != null) {
                        this.field2944.field3470 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field2998) {
                    int var36 = arg7[6] * field2996 + arg7[0] * field2989 + arg7[3] * field2999 + 16384 >> 15;
                    int var37 = arg7[7] * field2996 + arg7[1] * field2989 + arg7[4] * field2999 + 16384 >> 15;
                    int var38 = arg7[8] * field2996 + arg7[2] * field2989 + arg7[5] * field2999 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field2989 = var39;
                    field2999 = var40;
                    field2996 = var41;
                    field2998 = false;
                }
                int[] var42 = new int[9];
                int var43 = class284.field4398[arg2] >> 1;
                int var44 = class284.field4395[arg2] >> 1;
                int var45 = class284.field4398[arg3] >> 1;
                int var46 = class284.field4395[arg3] >> 1;
                int var47 = class284.field4398[arg4] >> 1;
                int var48 = class284.field4395[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field2996 + var42[0] * -field2989 + var42[1] * -field2999 + 16384 >> 15;
                int var52 = var42[5] * -field2996 + var42[3] * -field2989 + var42[4] * -field2999 + 16384 >> 15;
                int var53 = var42[8] * -field2996 + var42[6] * -field2989 + var42[7] * -field2999 + 16384 >> 15;
                int var54 = field2989 + var51;
                int var55 = field2999 + var52;
                int var56 = field2996 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field2943.length) {
                        int[] var81 = this.field2943[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field2977 == null || (arg6 & this.field2977[var83]) != 0) {
                                int var84 = this.field2954[var83] * var68[2] + this.field2955[var83] * var68[0] + this.field2948[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field2954[var83] * var68[5] + this.field2955[var83] * var68[3] + this.field2948[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field2954[var83] * var68[8] + this.field2955[var83] * var68[6] + this.field2948[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field2955[var83] = var87;
                                this.field2948[var83] = var88;
                                this.field2954[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field2943.length) {
                        int[] var174 = this.field2943[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field2977 == null || (arg6 & this.field2977[var176]) != 0) {
                                this.field2955[var176] -= field2989;
                                this.field2948[var176] -= field2999;
                                this.field2954[var176] -= field2996;
                                this.field2955[var176] = this.field2955[var176] * arg2 >> 7;
                                this.field2948[var176] = this.field2948[var176] * arg3 >> 7;
                                this.field2954[var176] = this.field2954[var176] * arg4 >> 7;
                                this.field2955[var176] += field2989;
                                this.field2948[var176] += field2999;
                                this.field2954[var176] += field2996;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field2998) {
                    int var128 = arg7[6] * field2996 + arg7[0] * field2989 + arg7[3] * field2999 + 16384 >> 15;
                    int var129 = arg7[7] * field2996 + arg7[1] * field2989 + arg7[4] * field2999 + 16384 >> 15;
                    int var130 = arg7[8] * field2996 + arg7[2] * field2989 + arg7[5] * field2999 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field2989 = var131;
                    field2999 = var132;
                    field2996 = var133;
                    field2998 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field2989 * var134 + 16384 >> 15;
                int var138 = -field2999 * var135 + 16384 >> 15;
                int var139 = -field2996 * var136 + 16384 >> 15;
                int var140 = field2989 + var137;
                int var141 = field2999 + var138;
                int var142 = field2996 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field2943.length) {
                        int[] var163 = this.field2943[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field2977 == null || (arg6 & this.field2977[var165]) != 0) {
                                int var166 = this.field2954[var165] * var150[2] + this.field2955[var165] * var150[0] + this.field2948[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field2954[var165] * var150[5] + this.field2955[var165] * var150[3] + this.field2948[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field2954[var165] * var150[8] + this.field2955[var165] * var150[6] + this.field2948[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field2955[var165] = var169;
                                this.field2948[var165] = var170;
                                this.field2954[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2938 != null && this.field2980 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field2938.length) {
                        int[] var179 = this.field2938[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field2945 == null || (arg6 & this.field2945[var181]) != 0) {
                                int var182 = (this.field2980[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field2980[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field2952.field3470 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2938 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field2938.length) {
                    int[] var185 = this.field2938[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field2945 == null || (arg6 & this.field2945[var187]) != 0) {
                            int var188 = this.field2970[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field2970[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field2952.field3470 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "()V", line = 2325)
    public final void method143() {
        for (int var1 = 0; var1 < this.field2947; var1++) {
            this.field2955[var1] = this.field2955[var1] + 7 >> 4;
            this.field2948[var1] = this.field2948[var1] + 7 >> 4;
            this.field2954[var1] = this.field2954[var1] + 7 >> 4;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "()I", line = 2339)
    public final int method164() {
        if (!this.field2963.field244) {
            this.method1179();
        }
        return this.field2963.field245;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([FI)[F", line = 2346)
    private static final float[] method1163(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class129.method852(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "()V", line = 2353)
    public final void method157() {
        for (int var1 = 0; var1 < this.field2947; var1++) {
            this.field2955[var1] = -this.field2955[var1];
            this.field2954[var1] = -this.field2954[var1];
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 3589)
    private class184() {
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lel;IIZ)V", line = 3999)
    public class184(class3 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field65];
        this.field2951 = new int[arg0.field52 + 1];
        for (int var6 = 0; var6 < arg0.field65; var6++) {
            if ((arg0.field88 == null || arg0.field88[var6] != 2) && (arg0.field82 == null || arg0.field82[var6] == -1 || !class284.field4393.method391(arg0.field82[var6] & 0xFFFF, -95))) {
                var5[this.field2968++] = var6;
                this.field2951[arg0.field68[var6]]++;
                this.field2951[arg0.field75[var6]]++;
                this.field2951[arg0.field60[var6]]++;
            }
        }
        long[] var7 = new long[this.field2968];
        for (int var8 = 0; var8 < this.field2968; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field82 != null) {
                var14 = arg0.field82[var9];
                if (var14 != -1) {
                    var12 = class284.field4393.method398((byte) 58, var14 & 0xFFFF);
                    var13 = class284.field4393.method393(var14 & 0xFFFF, false);
                }
            }
            boolean var15 = arg0.field61 != null && arg0.field61[var9] != 0 || var14 != -1 && !class284.field4393.method395(255, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field93 != null) {
                var10 += arg0.field93[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class335.method2312(33, var7, var5);
        this.field2947 = arg0.field52;
        this.field2964 = arg0.field70;
        this.field2955 = arg0.field49;
        this.field2948 = arg0.field97;
        this.field2954 = arg0.field92;
        this.field2940 = arg0.field69;
        this.field2977 = arg0.field73;
        int var20 = this.field2968 * 3;
        this.field2972 = new short[var20];
        this.field2960 = new short[var20];
        this.field2965 = new short[var20];
        this.field2946 = new short[var20];
        this.field2961 = new float[var20];
        this.field2969 = new float[var20];
        this.field2970 = new short[this.field2968];
        this.field2980 = new byte[this.field2968];
        this.field2973 = new short[this.field2968];
        this.field2966 = new short[this.field2968];
        this.field2967 = new short[this.field2968];
        this.field2975 = new short[this.field2968];
        if (arg0.field76 != null) {
            this.field2979 = new byte[this.field2968];
        }
        if (arg0.field83 != null) {
            this.field2945 = new short[this.field2968];
        }
        this.field2963 = new class13();
        this.field2941 = new class219();
        this.field2952 = new class219();
        if (class334.field5115) {
            this.field2944 = new class219();
        }
        this.field2978 = new class219();
        this.field2976 = new class219();
        this.field2950 = (short) arg1;
        this.field2958 = (short) arg2;
        this.field2962 = new short[var20];
        field2959 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field2964; var22++) {
            int var23 = this.field2951[var22];
            this.field2951[var22] = var21;
            var21 += var23;
        }
        this.field2951[this.field2964] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field78 != null) {
            int var28 = arg0.field58;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field2968; var36++) {
                int var37 = var5[var36];
                if (arg0.field78[var37] != -1) {
                    int var38 = arg0.field78[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field68[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field75[var37];
                        } else {
                            var40 = arg0.field60[var37];
                        }
                        int var41 = arg0.field49[var40];
                        int var42 = arg0.field97[var40];
                        int var43 = arg0.field92[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field96[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field86[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field91[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field86[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field91[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field67[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field86[var44] / 1024.0F;
                        var49 = (float) arg0.field91[var44] / 1024.0F;
                        var48 = (float) arg0.field67[var44] / 1024.0F;
                    }
                    var27[var44] = method1162(arg0.field95[var44], arg0.field71[var44], arg0.field64[var44], arg0.field98[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2968; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field74[var51] & 0xFFFF;
            short var53;
            if (arg0.field82 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field82[var51];
            }
            int var54;
            if (arg0.field78 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field78[var51];
            }
            int var55;
            if (arg0.field61 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field61[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field96[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field68[var51];
                        int var67 = arg0.field75[var51];
                        int var68 = arg0.field60[var51];
                        short var69 = arg0.field95[var54];
                        short var70 = arg0.field71[var54];
                        short var71 = arg0.field64[var54];
                        float var72 = (float) arg0.field49[var69];
                        float var73 = (float) arg0.field97[var69];
                        float var74 = (float) arg0.field92[var69];
                        float var75 = (float) arg0.field49[var70] - var72;
                        float var76 = (float) arg0.field97[var70] - var73;
                        float var77 = (float) arg0.field92[var70] - var74;
                        float var78 = (float) arg0.field49[var71] - var72;
                        float var79 = (float) arg0.field97[var71] - var73;
                        float var80 = (float) arg0.field92[var71] - var74;
                        float var81 = (float) arg0.field49[var66] - var72;
                        float var82 = (float) arg0.field97[var66] - var73;
                        float var83 = (float) arg0.field92[var66] - var74;
                        float var84 = (float) arg0.field49[var67] - var72;
                        float var85 = (float) arg0.field97[var67] - var73;
                        float var86 = (float) arg0.field92[var67] - var74;
                        float var87 = (float) arg0.field49[var68] - var72;
                        float var88 = (float) arg0.field97[var68] - var73;
                        float var89 = (float) arg0.field92[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field68[var51];
                        int var102 = arg0.field75[var51];
                        int var103 = arg0.field60[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field63[var54];
                        float var109 = (float) arg0.field81[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field67[var54] & 0xFFFF) / 1024.0F;
                            method1170(arg0.field49[var101], arg0.field97[var101], arg0.field92[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2990;
                            var57 = field2991;
                            method1170(arg0.field49[var102], arg0.field97[var102], arg0.field92[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2990;
                            var59 = field2991;
                            method1170(arg0.field49[var103], arg0.field97[var103], arg0.field92[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2990;
                            var61 = field2991;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field90[var54] / 256.0F;
                            float var113 = (float) arg0.field79[var54] / 256.0F;
                            int var114 = arg0.field49[var102] - arg0.field49[var101];
                            int var115 = arg0.field97[var102] - arg0.field97[var101];
                            int var116 = arg0.field92[var102] - arg0.field92[var101];
                            int var117 = arg0.field49[var103] - arg0.field49[var101];
                            int var118 = arg0.field97[var103] - arg0.field97[var101];
                            int var119 = arg0.field92[var103] - arg0.field92[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field86[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field91[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field67[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1153(var126, var127, var128);
                            method1157(arg0.field49[var101], arg0.field97[var101], arg0.field92[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2992;
                            var57 = field2994;
                            method1157(arg0.field49[var102], arg0.field97[var102], arg0.field92[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2992;
                            var59 = field2994;
                            method1157(arg0.field49[var103], arg0.field97[var103], arg0.field92[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2992;
                            var61 = field2994;
                        } else if (var65 == 3) {
                            method1175(arg0.field49[var101], arg0.field97[var101], arg0.field92[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2995;
                            var57 = field2988;
                            method1175(arg0.field49[var102], arg0.field97[var102], arg0.field92[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2995;
                            var59 = field2988;
                            method1175(arg0.field49[var103], arg0.field97[var103], arg0.field92[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2995;
                            var61 = field2988;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method22();
            byte var129;
            if (arg0.field88 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field88[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field68[var51];
                class213 var133 = arg0.field80[var132];
                this.field2973[var50] = this.method1158(arg0, var132, var130, var133.field3419, var133.field3421, var133.field3425, var133.field3420, var56, var57);
                int var134 = arg0.field75[var51];
                class213 var135 = arg0.field80[var134];
                this.field2966[var50] = this.method1158(arg0, var134, (long) var62 + var130, var135.field3419, var135.field3421, var135.field3425, var135.field3420, var58, var59);
                int var136 = arg0.field60[var51];
                class213 var137 = arg0.field80[var136];
                this.field2967[var50] = this.method1158(arg0, var136, (long) var63 + var130, var137.field3419, var137.field3421, var137.field3425, var137.field3420, var60, var61);
            } else if (var129 == 1) {
                class116 var138 = arg0.field55[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2039 > 0 ? 1024 : 2048) + (var138.field2038 + 256 << 12) + (var138.field2045 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2973[var50] = this.method1158(arg0, arg0.field68[var51], var139, var138.field2039, var138.field2038, var138.field2045, 0, var56, var57);
                this.field2966[var50] = this.method1158(arg0, arg0.field75[var51], (long) var62 + var139, var138.field2039, var138.field2038, var138.field2045, 0, var58, var59);
                this.field2967[var50] = this.method1158(arg0, arg0.field60[var51], (long) var63 + var139, var138.field2039, var138.field2038, var138.field2045, 0, var60, var61);
            }
            if (arg0.field82 == null) {
                this.field2975[var50] = -1;
            } else {
                this.field2975[var50] = arg0.field82[var51];
            }
            if (this.field2979 != null) {
                this.field2979[var50] = (byte) arg0.field76[var51];
            }
            this.field2970[var50] = arg0.field74[var51];
            if (arg0.field61 != null) {
                this.field2980[var50] = arg0.field61[var51];
            }
            if (arg0.field83 != null) {
                this.field2945[var50] = arg0.field83[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2968; var143++) {
            short var144 = this.field2975[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2939 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2968; var147++) {
            short var148 = this.field2975[var147];
            if (var146 != var148) {
                this.field2939[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2939[var145] = this.field2968;
        field2959 = null;
        this.field2972 = method1178(this.field2972, this.field2942);
        this.field2960 = method1178(this.field2960, this.field2942);
        this.field2965 = method1178(this.field2965, this.field2942);
        this.field2946 = method1178(this.field2946, this.field2942);
        this.field2961 = method1163(this.field2961, this.field2942);
        this.field2969 = method1163(this.field2969, this.field2942);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ISIB)I", line = 2369)
    private static final int method1164(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class284.field4387[class20.method152(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class284.field4393.method402(false, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class284.field4393.method390(true, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V", line = 2427)
    public final void method1165(int arg0) {
        this.field2950 = (short) arg0;
        this.field2952.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V", line = 2434)
    public final void method151(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2947; var4++) {
            this.field2955[var4] = this.field2955[var4] * arg0 >> 7;
            this.field2948[var4] = this.field2948[var4] * arg1 >> 7;
            this.field2954[var4] = this.field2954[var4] * arg2 >> 7;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZZZZZ)Ls;", line = 2448)
    public final class184 method1166(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class184 var12 = new class184();
        var12.field2947 = this.field2947;
        var12.field2964 = this.field2964;
        var12.field2942 = this.field2942;
        var12.field2968 = this.field2968;
        if (arg0) {
            var12.field2955 = this.field2955;
            var12.field2954 = this.field2954;
        } else {
            var12.field2955 = class116.method765((byte) 15, this.field2955);
            var12.field2954 = class116.method765((byte) 15, this.field2954);
        }
        if (arg1) {
            var12.field2948 = this.field2948;
        } else {
            var12.field2948 = class116.method765((byte) 15, this.field2948);
        }
        if (arg0 && arg1) {
            var12.field2941 = this.field2941;
            var12.field2963 = this.field2963;
        } else {
            var12.field2941 = new class219();
            var12.field2963 = new class13();
        }
        if (arg2) {
            var12.field2970 = this.field2970;
        } else {
            var12.field2970 = class202.method1290(this.field2970, 76);
        }
        if (arg3) {
            var12.field2980 = this.field2980;
        } else {
            var12.field2980 = class49.method373((byte) 106, this.field2980);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class334.field5115) {
            var12.field2952 = new class219();
        } else {
            var12.field2952 = this.field2952;
        }
        if (arg5) {
            var12.field2972 = this.field2972;
            var12.field2960 = this.field2960;
            var12.field2965 = this.field2965;
            var12.field2946 = this.field2946;
        } else {
            var12.field2972 = class202.method1290(this.field2972, 114);
            var12.field2960 = class202.method1290(this.field2960, 106);
            var12.field2965 = class202.method1290(this.field2965, 85);
            var12.field2946 = class202.method1290(this.field2946, 75);
        }
        if (!class334.field5115) {
            var12.field2944 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2944 = this.field2944;
        } else {
            var12.field2944 = new class219();
        }
        if (arg8) {
            var12.field2961 = this.field2961;
            var12.field2969 = this.field2969;
            var12.field2978 = this.field2978;
        } else {
            var12.field2961 = class141.method917(this.field2961, 48);
            var12.field2969 = class141.method917(this.field2969, 40);
            var12.field2978 = new class219();
        }
        if (arg9) {
            var12.field2973 = this.field2973;
            var12.field2966 = this.field2966;
            var12.field2967 = this.field2967;
            var12.field2976 = this.field2976;
        } else {
            var12.field2973 = class202.method1290(this.field2973, 120);
            var12.field2966 = class202.method1290(this.field2966, 121);
            var12.field2967 = class202.method1290(this.field2967, 116);
            var12.field2976 = new class219();
        }
        if (arg10) {
            var12.field2975 = this.field2975;
        } else {
            var12.field2975 = class202.method1290(this.field2975, 89);
        }
        var12.field2940 = this.field2940;
        var12.field2943 = this.field2943;
        var12.field2979 = this.field2979;
        var12.field2938 = this.field2938;
        var12.field2939 = this.field2939;
        var12.field2962 = this.field2962;
        var12.field2951 = this.field2951;
        var12.field2950 = this.field2950;
        var12.field2958 = this.field2958;
        var12.field2977 = this.field2977;
        var12.field2945 = this.field2945;
        return var12;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(ZZZ)Lbg;", line = 2586)
    public final class309 method135(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1167(arg0, arg1, arg2, field2987, field2986);
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "()Z", line = 2590)
    public final boolean method159() {
        if (this.field2943 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2947; var1++) {
            this.field2955[var1] <<= 0x4;
            this.field2948[var1] <<= 0x4;
            this.field2954[var1] <<= 0x4;
        }
        field2989 = 0;
        field2999 = 0;
        field2996 = 0;
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZLs;Ls;)Lbg;", line = 2613)
    private final class309 method1167(boolean arg0, boolean arg1, boolean arg2, class184 arg3, class184 arg4) {
        arg3.field2947 = this.field2947;
        arg3.field2964 = this.field2964;
        arg3.field2942 = this.field2942;
        arg3.field2968 = this.field2968;
        arg3.field2950 = this.field2950;
        arg3.field2958 = this.field2958;
        arg3.field2974 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field2955 == null || arg3.field2955.length < this.field2947) {
            arg3.field2955 = new int[this.field2947 + 100];
            arg3.field2948 = new int[this.field2947 + 100];
            arg3.field2954 = new int[this.field2947 + 100];
        }
        for (int var6 = 0; var6 < this.field2947; var6++) {
            arg3.field2955[var6] = this.field2955[var6];
            arg3.field2948[var6] = this.field2948[var6];
            arg3.field2954[var6] = this.field2954[var6];
        }
        if (arg3.field2941 == null) {
            arg3.field2941 = new class219();
        }
        arg3.field2941.field3470 = false;
        if (arg3.field2963 == null) {
            arg3.field2963 = new class13();
        }
        arg3.field2963.field244 = false;
        if (arg0) {
            arg3.field2980 = this.field2980;
        } else {
            if (arg4.field2980 == null || arg4.field2980.length < this.field2968) {
                arg4.field2980 = new byte[this.field2968 + 100];
            }
            arg3.field2980 = arg4.field2980;
            for (int var7 = 0; var7 < this.field2968; var7++) {
                arg3.field2980[var7] = this.field2980[var7];
            }
        }
        if (arg1) {
            arg3.field2970 = this.field2970;
        } else {
            if (arg4.field2970 == null || arg4.field2970.length < this.field2968) {
                arg4.field2970 = new short[this.field2968 + 100];
            }
            arg3.field2970 = arg4.field2970;
            for (int var8 = 0; var8 < this.field2968; var8++) {
                arg3.field2970[var8] = this.field2970[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field2952 = this.field2952;
        } else {
            if (arg4.field2952 == null) {
                arg4.field2952 = new class219();
            }
            arg3.field2952 = arg4.field2952;
            arg3.field2952.field3470 = false;
        }
        if (arg2 || this.field2972 == null) {
            arg3.field2972 = this.field2972;
            arg3.field2960 = this.field2960;
            arg3.field2965 = this.field2965;
            arg3.field2946 = this.field2946;
            arg3.field2944 = this.field2944;
        } else {
            if (arg4.field2972 == null || arg4.field2972.length < this.field2942) {
                arg4.field2972 = new short[this.field2942 + 100];
                arg4.field2960 = new short[this.field2942 + 100];
                arg4.field2965 = new short[this.field2942 + 100];
                arg4.field2946 = new short[this.field2942 + 100];
            }
            arg3.field2972 = arg4.field2972;
            arg3.field2960 = arg4.field2960;
            arg3.field2965 = arg4.field2965;
            arg3.field2946 = arg4.field2946;
            for (int var9 = 0; var9 < this.field2942; var9++) {
                arg3.field2972[var9] = this.field2972[var9];
                arg3.field2960[var9] = this.field2960[var9];
                arg3.field2965[var9] = this.field2965[var9];
                arg3.field2946[var9] = this.field2946[var9];
            }
            if (class334.field5115) {
                if (arg4.field2944 == null) {
                    arg4.field2944 = new class219();
                }
                arg3.field2944 = arg4.field2944;
                arg3.field2944.field3470 = false;
            } else {
                arg3.field2944 = null;
            }
        }
        arg3.field2961 = this.field2961;
        arg3.field2969 = this.field2969;
        arg3.field2940 = this.field2940;
        arg3.field2943 = this.field2943;
        arg3.field2973 = this.field2973;
        arg3.field2966 = this.field2966;
        arg3.field2967 = this.field2967;
        arg3.field2975 = this.field2975;
        arg3.field2979 = this.field2979;
        arg3.field2938 = this.field2938;
        arg3.field2978 = this.field2978;
        arg3.field2976 = this.field2976;
        arg3.field2939 = this.field2939;
        arg3.field2962 = this.field2962;
        arg3.field2951 = this.field2951;
        arg3.field4704 = this.field4704;
        arg3.field2977 = this.field2977;
        arg3.field2945 = this.field2945;
        return arg3;
    }

    @OriginalMember(owner = "client!s", name = "j", descriptor = "()I", line = 2779)
    public final int method162() {
        if (!this.field2963.field244) {
            this.method1179();
        }
        return this.field2963.field247;
    }

    @OriginalMember(owner = "client!s", name = "t", descriptor = "()V", line = 2786)
    private final void method1168() {
        GL var1 = class249.field3898;
        if (this.field2968 == 0) {
            return;
        }
        if (this.field2974 != 0) {
            this.method1180(true, !this.field2941.field3470 && (this.field2974 & 0x1) != 0, !this.field2952.field3470 && (this.field2974 & 0x2) != 0, this.field2944 != null && !this.field2944.field3470 && (this.field2974 & 0x4) != 0, false);
        }
        this.method1180(false, !this.field2941.field3470, !this.field2952.field3470, this.field2944 != null && !this.field2944.field3470, !this.field2978.field3470);
        if (!this.field2976.field3470) {
            this.method1161();
        }
        if (this.field2956 != 0) {
            if ((this.field2956 & 0x1) != 0) {
                this.field2955 = null;
                this.field2948 = null;
                this.field2954 = null;
                this.field2962 = null;
                this.field2951 = null;
            }
            if ((this.field2956 & 0x2) != 0) {
                this.field2970 = null;
                this.field2980 = null;
            }
            if ((this.field2956 & 0x4) != 0) {
                this.field2972 = null;
                this.field2960 = null;
                this.field2965 = null;
                this.field2946 = null;
            }
            if ((this.field2956 & 0x8) != 0) {
                this.field2961 = null;
                this.field2969 = null;
            }
            if ((this.field2956 & 0x10) != 0) {
                this.field2973 = null;
                this.field2966 = null;
                this.field2967 = null;
            }
            this.field2956 = 0;
        }
        class231 var2 = null;
        if (this.field2941.field3476 != null) {
            this.field2941.field3476.method1529();
            var2 = this.field2941.field3476;
            var1.glVertexPointer(3, 5126, this.field2941.field3480, (long) this.field2941.field3475);
        }
        if (this.field2952.field3476 != null) {
            if (this.field2952.field3476 != var2) {
                this.field2952.field3476.method1529();
                var2 = this.field2952.field3476;
            }
            var1.glColorPointer(4, 5121, this.field2952.field3480, (long) this.field2952.field3475);
        }
        if (class334.field5115 && this.field2944.field3476 != null) {
            if (this.field2944.field3476 != var2) {
                this.field2944.field3476.method1529();
                var2 = this.field2944.field3476;
            }
            var1.glNormalPointer(5126, this.field2944.field3480, (long) this.field2944.field3475);
        }
        if (this.field2978.field3476 != null) {
            if (this.field2978.field3476 != var2) {
                this.field2978.field3476.method1529();
                class231 var3 = this.field2978.field3476;
            }
            var1.glTexCoordPointer(2, 5126, this.field2978.field3480, (long) this.field2978.field3475);
        }
        if (this.field2976.field3476 != null) {
            this.field2976.field3476.method1531();
        }
        if (this.field2941.field3476 == null || this.field2952.field3476 == null || class334.field5115 && this.field2944.field3476 == null || this.field2978.field3476 == null) {
            if (class249.field3877) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2941.field3476 == null) {
                this.field2941.field3472.position(this.field2941.field3475);
                var1.glVertexPointer(3, 5126, this.field2941.field3480, this.field2941.field3472);
            }
            if (this.field2952.field3476 == null) {
                this.field2952.field3472.position(this.field2952.field3475);
                var1.glColorPointer(4, 5121, this.field2952.field3480, this.field2952.field3472);
            }
            if (class334.field5115 && this.field2944.field3476 == null) {
                this.field2944.field3472.position(this.field2944.field3475);
                var1.glNormalPointer(5126, this.field2944.field3480, this.field2944.field3472);
            }
            if (this.field2978.field3476 == null) {
                this.field2978.field3472.position(this.field2978.field3475);
                var1.glTexCoordPointer(2, 5126, this.field2978.field3480, this.field2978.field3472);
            }
        }
        if (this.field2976.field3476 == null && class249.field3877) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2939.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2939[var5];
            int var7 = this.field2939[var5 + 1];
            short var8 = this.field2975[var6];
            if (var8 == -1) {
                class249.method1689(-1);
                class128.method844(0, 0, (byte) -118);
            } else {
                class284.field4393.method404((byte) -54, var8 & 0xFFFF);
            }
            if (this.field2976.field3476 == null) {
                this.field2976.field3472.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2976.field3472);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "u", descriptor = "()V", line = 2959)
    public final void method1169() {
        for (int var1 = 0; var1 < this.field2947; var1++) {
            this.field2954[var1] = -this.field2954[var1];
        }
        if (this.field2965 != null) {
            for (int var2 = 0; var2 < this.field2942; var2++) {
                this.field2965[var2] = (short) (-this.field2965[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2968; var3++) {
            short var4 = this.field2973[var3];
            this.field2973[var3] = this.field2967[var3];
            this.field2967[var3] = var4;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
        if (this.field2944 != null) {
            this.field2944.field3470 = false;
        }
        this.field2976.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(III)V", line = 2998)
    public final void method163(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2947; var4++) {
            this.field2955[var4] += arg0;
            this.field2948[var4] += arg1;
            this.field2954[var4] += arg2;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "l", descriptor = "()I", line = 3011)
    public final int method165() {
        if (!this.field2963.field244) {
            this.method1179();
        }
        return this.field2963.field250;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3017)
    private static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2990 = var16;
        field2991 = var17;
    }

    @OriginalMember(owner = "client!s", name = "k", descriptor = "()V", line = 3064)
    public final void method149() {
        for (int var1 = 0; var1 < this.field2947; var1++) {
            int var2 = this.field2954[var1];
            this.field2954[var1] = this.field2955[var1];
            this.field2955[var1] = -var2;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "()I", line = 3080)
    public final int method147() {
        if (!this.field2963.field244) {
            this.method1179();
        }
        return this.field2963.field251;
    }

    @OriginalMember(owner = "client!s", name = "v", descriptor = "()V", line = 3087)
    public final void method1171() {
        int var10002;
        if (this.field2940 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2947; var3++) {
                int var4 = this.field2940[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2943 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2943[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2947) {
                int var7 = this.field2940[var6] & 0xFF;
                this.field2943[var7][var1[var7]++] = var6++;
            }
            this.field2940 = null;
        }
        if (this.field2979 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2968; var10++) {
            int var11 = this.field2979[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2938 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2938[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2968) {
            int var14 = this.field2979[var13] & 0xFF;
            this.field2938[var14][var8[var14]++] = var13++;
        }
        this.field2979 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)Z", line = 3179)
    private final boolean method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!s", name = "w", descriptor = "()V", line = 3194)
    public static void method1173() {
        field2959 = null;
        field2953 = null;
        field2981 = null;
        field2982 = null;
        field2983 = null;
        field2984 = null;
        field2985 = null;
        field2986 = null;
        field2987 = null;
        field2997 = null;
        field2993 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lmg;)Lmg;", line = 3207)
    public final class113 method1174(class113 arg0) {
        if (this.field2942 == 0) {
            return null;
        }
        if (!this.field2963.field244) {
            this.method1179();
        }
        int var2;
        int var3;
        if (class65.field1243 > 0) {
            var2 = this.field2963.field250 - (class65.field1243 * this.field2963.field246 >> 8) >> 3;
            var3 = this.field2963.field245 - (class65.field1243 * this.field2963.field248 >> 8) >> 3;
        } else {
            var2 = this.field2963.field250 - (class65.field1243 * this.field2963.field248 >> 8) >> 3;
            var3 = this.field2963.field245 - (class65.field1243 * this.field2963.field246 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class65.field1246 > 0) {
            var4 = this.field2963.field249 - (class65.field1246 * this.field2963.field246 >> 8) >> 3;
            var5 = this.field2963.field247 - (class65.field1246 * this.field2963.field248 >> 8) >> 3;
        } else {
            var4 = this.field2963.field249 - (class65.field1246 * this.field2963.field248 >> 8) >> 3;
            var5 = this.field2963.field247 - (class65.field1246 * this.field2963.field246 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class113 var8;
        if (arg0 == null || arg0.field1984.length < var6 * var7) {
            var8 = new class113(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field1971 = arg0.field1968 = var6;
            arg0.field1973 = arg0.field1970 = var7;
            arg0.method735();
        }
        var8.field1982 = var2;
        var8.field1969 = var4;
        if (field2997.length < this.field2942) {
            field2997 = new int[this.field2942];
            field2993 = new int[this.field2942];
        }
        for (int var9 = 0; var9 < this.field2964; var9++) {
            int var10 = (this.field2955[var9] - (this.field2948[var9] * class65.field1243 >> 8) >> 3) - var2;
            int var11 = (this.field2954[var9] - (this.field2948[var9] * class65.field1246 >> 8) >> 3) - var4;
            int var12 = this.field2951[var9];
            int var13 = this.field2951[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2962[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2997[var15] = var10;
                field2993[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2968; var16++) {
            if (this.field2980[var16] <= 128) {
                short var17 = this.field2973[var16];
                short var18 = this.field2966[var16];
                short var19 = this.field2967[var16];
                int var20 = field2997[var17];
                int var21 = field2997[var18];
                int var22 = field2997[var19];
                int var23 = field2993[var17];
                int var24 = field2993[var18];
                int var25 = field2993[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class284.method1916(var8.field1984, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!s", name = "m", descriptor = "()I", line = 3337)
    public final int method146() {
        if (!this.field2963.field244) {
            this.method1179();
        }
        return this.field2963.field249;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[FIF)V", line = 3345)
    private static final void method1175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2995 = var16;
        field2988 = var17;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 3391)
    public final void method136(int arg0) {
        int var2 = class284.field4395[arg0];
        int var3 = class284.field4398[arg0];
        for (int var4 = 0; var4 < this.field2947; var4++) {
            int var5 = this.field2955[var4] * var3 + this.field2948[var4] * var2 >> 16;
            this.field2948[var4] = this.field2948[var4] * var3 - this.field2955[var4] * var2 >> 16;
            this.field2955[var4] = var5;
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(SS)V", line = 3412)
    public final void method1176(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2968; var3++) {
            if (this.field2975[var3] == arg0) {
                this.field2975[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class284.field4393.method402(false, arg0 & 0xFFFF);
            var5 = class284.field4393.method390(true, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class284.field4393.method402(false, arg1 & 0xFFFF);
            var7 = class284.field4393.method390(true, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2952.field3470 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "x", descriptor = "()V", line = 3447)
    public final void method1177() {
        if (this.field2972 == null) {
            this.method131();
            return;
        }
        for (int var1 = 0; var1 < this.field2947; var1++) {
            int var2 = this.field2955[var1];
            this.field2955[var1] = this.field2954[var1];
            this.field2954[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2942; var3++) {
            short var4 = this.field2972[var3];
            this.field2972[var3] = this.field2965[var3];
            this.field2965[var3] = (short) (-var4);
        }
        this.field2963.field244 = false;
        this.field2941.field3470 = false;
        if (this.field2944 != null) {
            this.field2944.field3470 = false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([SI)[S", line = 3489)
    private static final short[] method1178(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class129.method856(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIJ)V", line = 3496)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field2942 == 0) {
            return;
        }
        GL var10 = class249.field3898;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1168();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!s", name = "y", descriptor = "()V", line = 3520)
    private final void method1179() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2964; var9++) {
            int var10 = this.field2955[var9];
            int var11 = this.field2948[var9];
            int var12 = this.field2954[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field2963.field250 = (short) var1;
        this.field2963.field245 = (short) var4;
        this.field2963.field248 = (short) var2;
        this.field2963.field246 = (short) var5;
        this.field2963.field249 = (short) var3;
        this.field2963.field247 = (short) var6;
        this.field2963.field251 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2963.field244 = true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZ)V", line = 3593)
    public final void method161(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2989 = 0;
            field2999 = 0;
            field2996 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2943.length) {
                    int[] var14 = this.field2943[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2989 += this.field2955[var16];
                        field2999 += this.field2948[var16];
                        field2996 += this.field2954[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2989 = field2989 / var11 + var8;
                field2999 = field2999 / var11 + var9;
                field2996 = field2996 / var11 + var10;
            } else {
                field2989 = var8;
                field2999 = var9;
                field2996 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2943.length) {
                    int[] var22 = this.field2943[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2955[var24] += var17;
                        this.field2948[var24] += var18;
                        this.field2954[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2943.length) {
                    int[] var27 = this.field2943[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2955[var29] -= field2989;
                        this.field2948[var29] -= field2999;
                        this.field2954[var29] -= field2996;
                        if (arg4 != 0) {
                            int var30 = class284.field4395[arg4];
                            int var31 = class284.field4398[arg4];
                            int var32 = this.field2955[var29] * var31 + this.field2948[var29] * var30 + 32767 >> 16;
                            this.field2948[var29] = this.field2948[var29] * var31 + 32767 - this.field2955[var29] * var30 >> 16;
                            this.field2955[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class284.field4395[arg2];
                            int var34 = class284.field4398[arg2];
                            int var35 = this.field2948[var29] * var34 + 32767 - this.field2954[var29] * var33 >> 16;
                            this.field2954[var29] = this.field2954[var29] * var34 + this.field2948[var29] * var33 + 32767 >> 16;
                            this.field2948[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class284.field4395[arg3];
                            int var37 = class284.field4398[arg3];
                            int var38 = this.field2955[var29] * var37 + this.field2954[var29] * var36 + 32767 >> 16;
                            this.field2954[var29] = this.field2954[var29] * var37 + 32767 - this.field2955[var29] * var36 >> 16;
                            this.field2955[var29] = var38;
                        }
                        this.field2955[var29] += field2989;
                        this.field2948[var29] += field2999;
                        this.field2954[var29] += field2996;
                    }
                }
            }
            if (arg5 && this.field2972 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2943.length) {
                        int[] var41 = this.field2943[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2951[var43];
                            int var45 = this.field2951[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2962[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class284.field4395[arg4];
                                    int var49 = class284.field4398[arg4];
                                    int var50 = this.field2972[var47] * var49 + this.field2960[var47] * var48 + 32767 >> 16;
                                    this.field2960[var47] = (short) (this.field2960[var47] * var49 + 32767 - this.field2972[var47] * var48 >> 16);
                                    this.field2972[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class284.field4395[arg2];
                                    int var52 = class284.field4398[arg2];
                                    int var53 = this.field2960[var47] * var52 + 32767 - this.field2965[var47] * var51 >> 16;
                                    this.field2965[var47] = (short) (this.field2965[var47] * var52 + this.field2960[var47] * var51 + 32767 >> 16);
                                    this.field2960[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class284.field4395[arg3];
                                    int var55 = class284.field4398[arg3];
                                    int var56 = this.field2972[var47] * var55 + this.field2965[var47] * var54 + 32767 >> 16;
                                    this.field2965[var47] = (short) (this.field2965[var47] * var55 + 32767 - this.field2972[var47] * var54 >> 16);
                                    this.field2972[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2944 != null) {
                    this.field2944.field3470 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2943.length) {
                    int[] var59 = this.field2943[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2955[var61] -= field2989;
                        this.field2948[var61] -= field2999;
                        this.field2954[var61] -= field2996;
                        this.field2955[var61] = this.field2955[var61] * arg2 >> 7;
                        this.field2948[var61] = this.field2948[var61] * arg3 >> 7;
                        this.field2954[var61] = this.field2954[var61] * arg4 >> 7;
                        this.field2955[var61] += field2989;
                        this.field2948[var61] += field2999;
                        this.field2954[var61] += field2996;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2938 != null && this.field2980 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field2938.length) {
                        int[] var64 = this.field2938[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field2980[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field2980[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field2952.field3470 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2938 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field2938.length) {
                    int[] var70 = this.field2938[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field2970[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field2970[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field2952.field3470 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZ)V", line = 4762)
    private final void method1180(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2941.field3475 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2952.field3475 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2944.field3475 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2978.field3475 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2953.field3273.length < this.field2942 * var6) {
            field2953 = new class202((this.field2942 + 100) * var6);
        } else {
            field2953.field3249 = 0;
        }
        if (arg1) {
            if (class249.field3916) {
                for (int var7 = 0; var7 < this.field2964; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2955[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2948[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2954[var7]);
                    int var11 = this.field2951[var7];
                    int var12 = this.field2951[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2962[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2953.field3249 = var6 * var14;
                        field2953.method1359(16705, var8);
                        field2953.method1359(16705, var9);
                        field2953.method1359(16705, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2964; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2955[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2948[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2954[var15]);
                    int var19 = this.field2951[var15];
                    int var20 = this.field2951[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2962[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2953.field3249 = var6 * var22;
                        field2953.method1348(var16, true);
                        field2953.method1348(var17, true);
                        field2953.method1348(var18, true);
                    }
                }
            }
        }
        if (arg2) {
            if (class334.field5115) {
                for (int var42 = 0; var42 < this.field2968; var42++) {
                    int var43 = method1164(this.field2970[var42], this.field2975[var42], this.field2950, this.field2980[var42]);
                    field2953.field3249 = this.field2973[var42] * var6 + this.field2952.field3475;
                    field2953.method1359(16705, var43);
                    field2953.field3249 = this.field2966[var42] * var6 + this.field2952.field3475;
                    field2953.method1359(16705, var43);
                    field2953.field3249 = this.field2967[var42] * var6 + this.field2952.field3475;
                    field2953.method1359(16705, var43);
                }
            } else {
                int var23 = (int) class65.field1242[0];
                int var24 = (int) class65.field1242[1];
                int var25 = (int) class65.field1242[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2950 * 1.3F);
                int var28 = this.field2958 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2968; var29++) {
                    short var30 = this.field2973[var29];
                    short var31 = this.field2946[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2965[var30] * var25 + this.field2972[var30] * var23 + this.field2960[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2965[var30] * var25 + this.field2972[var30] * var23 + this.field2960[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2946[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2966[var29];
                    short var34 = this.field2946[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2965[var33] * var25 + this.field2972[var33] * var23 + this.field2960[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2965[var33] * var25 + this.field2972[var33] * var23 + this.field2960[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2946[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2967[var29];
                    short var37 = this.field2946[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2965[var36] * var25 + this.field2972[var36] * var23 + this.field2960[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2965[var36] * var25 + this.field2972[var36] * var23 + this.field2960[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2946[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1164(this.field2970[var29], this.field2975[var29], var32, this.field2980[var29]);
                    int var40 = method1164(this.field2970[var29], this.field2975[var29], var35, this.field2980[var29]);
                    int var41 = method1164(this.field2970[var29], this.field2975[var29], var38, this.field2980[var29]);
                    field2953.field3249 = var6 * var30 + this.field2952.field3475;
                    field2953.method1359(16705, var39);
                    field2953.field3249 = var6 * var33 + this.field2952.field3475;
                    field2953.method1359(16705, var40);
                    field2953.field3249 = var6 * var36 + this.field2952.field3475;
                    field2953.method1359(16705, var41);
                }
                this.field2972 = null;
                this.field2960 = null;
                this.field2965 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2958;
            float var45 = 3.0F / (float) (this.field2958 / 2 + this.field2958);
            field2953.field3249 = this.field2944.field3475;
            if (class249.field3916) {
                for (int var46 = 0; var46 < this.field2942; var46++) {
                    short var47 = this.field2946[var46];
                    if (var47 == 0) {
                        field2953.method1328(27700, (float) this.field2972[var46] * var45);
                        field2953.method1328(27700, (float) this.field2960[var46] * var45);
                        field2953.method1328(27700, (float) this.field2965[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2953.method1328(27700, (float) this.field2972[var46] * var48);
                        field2953.method1328(27700, (float) this.field2960[var46] * var48);
                        field2953.method1328(27700, (float) this.field2965[var46] * var48);
                    }
                    field2953.field3249 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2942; var49++) {
                    short var50 = this.field2946[var49];
                    if (var50 == 0) {
                        field2953.method1301((float) this.field2972[var49] * var45, false);
                        field2953.method1301((float) this.field2960[var49] * var45, false);
                        field2953.method1301((float) this.field2965[var49] * var45, false);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2953.method1301((float) this.field2972[var49] * var51, false);
                        field2953.method1301((float) this.field2960[var49] * var51, false);
                        field2953.method1301((float) this.field2965[var49] * var51, false);
                    }
                    field2953.field3249 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2953.field3249 = this.field2978.field3475;
            if (class249.field3916) {
                for (int var52 = 0; var52 < this.field2942; var52++) {
                    field2953.method1328(27700, this.field2961[var52]);
                    field2953.method1328(27700, this.field2969[var52]);
                    field2953.field3249 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2942; var53++) {
                    field2953.method1301(this.field2961[var53], false);
                    field2953.method1301(this.field2969[var53], false);
                    field2953.field3249 += var6 - 8;
                }
            }
        }
        field2953.field3249 = this.field2942 * var6;
        if (arg0) {
            if (class249.field3874) {
                ByteBuffer var54 = ByteBuffer.wrap(field2953.field3273, 0, field2953.field3249);
                if (this.field2957 == null) {
                    this.field2957 = new class231(true);
                    this.field2957.method1532(var54);
                } else {
                    this.field2957.method1528(var54);
                }
                if (arg1) {
                    this.field2941.field3470 = true;
                    this.field2941.field3472 = null;
                    this.field2941.field3476 = this.field2957;
                    this.field2941.field3480 = var6;
                }
                if (arg2) {
                    this.field2952.field3470 = true;
                    this.field2952.field3472 = null;
                    this.field2952.field3476 = this.field2957;
                    this.field2952.field3480 = var6;
                }
                if (arg3) {
                    this.field2944.field3470 = true;
                    this.field2944.field3472 = null;
                    this.field2944.field3476 = this.field2957;
                    this.field2944.field3480 = var6;
                }
                if (arg4) {
                    this.field2978.field3470 = true;
                    this.field2978.field3472 = null;
                    this.field2978.field3476 = this.field2957;
                    this.field2978.field3480 = var6;
                }
            } else {
                if (field2981 == null || field2981.capacity() < field2953.field3249) {
                    field2981 = ByteBuffer.allocateDirect(var6 * 100 + field2953.field3249);
                } else {
                    field2981.clear();
                }
                field2981.put(field2953.field3273, 0, field2953.field3249);
                field2981.flip();
                if (arg1) {
                    this.field2941.field3470 = true;
                    this.field2941.field3472 = field2981;
                    this.field2941.field3476 = null;
                    this.field2941.field3480 = var6;
                }
                if (arg2) {
                    this.field2952.field3470 = true;
                    this.field2952.field3472 = field2981;
                    this.field2941.field3476 = null;
                    this.field2952.field3480 = var6;
                }
                if (arg3) {
                    this.field2944.field3470 = true;
                    this.field2944.field3472 = field2981;
                    this.field2944.field3476 = null;
                    this.field2944.field3480 = var6;
                }
                if (arg4) {
                    this.field2978.field3470 = true;
                    this.field2978.field3472 = field2981;
                    this.field2978.field3476 = null;
                    this.field2978.field3480 = var6;
                }
            }
        } else if (class249.field3877) {
            class231 var55 = new class231();
            ByteBuffer var56 = ByteBuffer.wrap(field2953.field3273, 0, field2953.field3249);
            var55.method1532(var56);
            if (arg1) {
                this.field2941.field3470 = true;
                this.field2941.field3472 = null;
                this.field2941.field3476 = var55;
                this.field2941.field3480 = var6;
            }
            if (arg2) {
                this.field2952.field3470 = true;
                this.field2952.field3472 = null;
                this.field2952.field3476 = var55;
                this.field2952.field3480 = var6;
            }
            if (arg3) {
                this.field2944.field3470 = true;
                this.field2944.field3472 = null;
                this.field2944.field3476 = var55;
                this.field2944.field3480 = var6;
            }
            if (arg4) {
                this.field2978.field3470 = true;
                this.field2978.field3472 = null;
                this.field2978.field3476 = var55;
                this.field2978.field3480 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2953.field3249);
            var57.put(field2953.field3273, 0, field2953.field3249);
            var57.flip();
            if (arg1) {
                this.field2941.field3470 = true;
                this.field2941.field3472 = var57;
                this.field2941.field3476 = null;
                this.field2941.field3480 = var6;
            }
            if (arg2) {
                this.field2952.field3470 = true;
                this.field2952.field3472 = var57;
                this.field2941.field3476 = null;
                this.field2952.field3480 = var6;
            }
            if (arg3) {
                this.field2944.field3470 = true;
                this.field2944.field3472 = var57;
                this.field2944.field3476 = null;
                this.field2944.field3480 = var6;
            }
            if (arg4) {
                this.field2978.field3470 = true;
                this.field2978.field3472 = var57;
                this.field2978.field3476 = null;
                this.field2978.field3480 = var6;
            }
        }
    }
}
