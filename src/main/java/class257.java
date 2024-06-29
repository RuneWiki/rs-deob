import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class257 extends class281 {

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "Lkba;")
    private class108 field3340 = new class108();

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    private int field3325 = this.field3722 + -2;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "Lac;")
    public class541 field3352;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[[[I")
    public int[][][] field3329;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "[[[I")
    public int[][][] field3358;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[[[I")
    public int[][][] field3326;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "[[S")
    public short[][] field3336;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "[[B")
    private byte[][] field3366;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[[[I")
    private int[][][] field3328;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    private int field3348;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "[[[I")
    private int[][][] field3335;

    @OriginalMember(owner = "client!ok", name = "gb", descriptor = "[[F")
    private float[][] field3372;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "[[F")
    private float[][] field3368;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[[[Liw;")
    private class318[][][] field3324;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "[[B")
    private byte[][] field3342;

    @OriginalMember(owner = "client!ok", name = "lb", descriptor = "[[F")
    private float[][] field3377;

    @OriginalMember(owner = "client!ok", name = "hb", descriptor = "Lwr;")
    private class459 field3373;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "Lcg;")
    private class139 field3356;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "Lrga;")
    public static class242 field3338 = new class242("runescape", 0);

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "Z")
    public static boolean field3353 = true;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "Lea;")
    public static class547 field3349 = new class547(101, 6);

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    private int field3362;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    private int field3367;

    @OriginalMember(owner = "client!ok", name = "fb", descriptor = "I")
    private int field3371;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "Lvaa;")
    public static class469 field3343;

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "Lgk;")
    public class475 field3369;

    @OriginalMember(owner = "client!ok", name = "eb", descriptor = "Lgk;")
    private class475 field3370;

    @OriginalMember(owner = "client!ok", name = "kb", descriptor = "Lgk;")
    public class475 field3376;

    @OriginalMember(owner = "client!ok", name = "mb", descriptor = "Lgk;")
    public class475 field3378;

    @OriginalMember(owner = "client!ok", name = "ib", descriptor = "Lob;")
    private class738 field3374;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "Z")
    public static boolean field3341;

    @OriginalMember(owner = "client!ok", name = "jb", descriptor = "[Liw;")
    private class318[] field3375;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "[[[I")
    private int[][][] field3355;

    @OriginalMember(owner = "client!ok", name = "ka", descriptor = "(III)V", line = 6)
    public final void method1528(int arg0, int arg1, int arg2) {
        ++field3361;
        if ((this.field3366[arg0][arg1] & 255) < arg2) {
            this.field3366[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 18)
    public final void method1529(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3365;
        if (this.field3356 != null && arg0 != null) {
            int var7 = arg1 - (this.field3352.field7609 * arg2 >> 8) >> this.field3352.field7530;
            int var8 = -(this.field3352.field7588 * arg2 >> 8) + arg3 >> this.field3352.field7530;
            this.field3356.method859(var8, var7, false, arg0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 38)
    public final void method1530(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3359;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1544(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIBII)Z", line = 126)
    public static final boolean method1531(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field3347;
        int var7 = arg1 + arg6;
        int var8 = arg0 - -arg2;
        int var9 = arg3 + arg5;
        if (!class563.method3171(var8, arg6, arg5, (byte) 82, var8, var9, var8, var9, var7, arg6)) {
            return false;
        } else if (!class563.method3171(var8, var7, arg5, (byte) 82, var8, var9, var8, arg5, var7, arg6)) {
            return false;
        } else {
            if (arg6 < class211.field2526) {
                if (!class563.method3171(var8, arg6, var9, (byte) 82, arg0, var9, var8, arg5, arg6, arg6)) {
                    return false;
                }
                if (!class563.method3171(arg0, arg6, var9, (byte) 82, arg0, arg5, var8, arg5, arg6, arg6)) {
                    return false;
                }
            } else {
                if (!class563.method3171(var8, var7, var9, (byte) 82, arg0, var9, var8, arg5, var7, var7)) {
                    return false;
                }
                if (!class563.method3171(arg0, var7, var9, (byte) 82, arg0, arg5, var8, arg5, var7, var7)) {
                    return false;
                }
            }
            if (arg4 != 16) {
                return true;
            } else {
                if (class671.field9323 <= arg5) {
                    if (!class563.method3171(var8, arg6, var9, (byte) 82, arg0, var9, var8, var9, var7, arg6)) {
                        return false;
                    }
                    if (!class563.method3171(arg0, var7, var9, (byte) 82, arg0, var9, var8, var9, var7, arg6)) {
                        return false;
                    }
                } else {
                    if (!class563.method3171(var8, arg6, arg5, (byte) 82, arg0, arg5, var8, arg5, var7, arg6)) {
                        return false;
                    }
                    if (!class563.method3171(arg0, var7, arg5, (byte) 82, arg0, arg5, var8, arg5, var7, arg6)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZII[[ZII)V", line = 193)
    private final void method1532(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean[][] arg5, int arg6, int arg7) {
        ++field3327;
        if (this.field3375 != null) {
            int var9 = arg3 + 1 + arg3;
            int var10 = var9 * var9;
            if (~var10 < ~this.field3352.field7679.length) {
                this.field3352.field7679 = new int[var10];
            }
            if (this.field3362 * 2 > this.field3352.field7657.field8529.length) {
                this.field3352.field7657 = new class183(this.field3362 * 2);
            }
            int var11 = -arg3 + arg4;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = arg7 - arg3;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg3 + arg4;
            if (var15 > super.field3727 + -1) {
                var15 = super.field3727 + -1;
            }
            int var16 = arg3 + arg7;
            if (super.field3728 - 1 < var16) {
                var16 = super.field3728 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field3352.field7679;
            for (int var19 = var11; ~var15 <= ~var19; ++var19) {
                boolean[] var25 = arg5[var19 - var12];
                for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field3727 * var26 - -var19;
                    }
                }
            }
            if (arg1 == -1) {
                this.field3352.method3004(19330);
            } else {
                this.field3352.method3033((float) arg1, true);
                this.field3352.method3044((byte) -35);
            }
            this.field3352.method2994(~(this.field3339 & 7) != -1, false);
            for (int var20 = 0; ~var20 > ~this.field3375.length; ++var20) {
                this.field3375[var20].method1903(var18, (byte) 98, var17);
            }
            if (!this.field3340.method726(-126)) {
                int var21 = this.field3352.field7666;
                int var22 = this.field3352.field7652;
                this.field3352.method442(0, var22, this.field3352.field7638);
                this.field3352.method2994(false, false);
                this.field3352.method3018((byte) -123, false);
                this.field3352.method3013((byte) -58, 128);
                this.field3352.method2977(-99, -2);
                this.field3352.method3006(1, this.field3352.field7569);
                this.field3352.method3042(7681, arg6 ^ 4066, 8448);
                this.field3352.method2983(0, 770, 116, 34166);
                this.field3352.method3029(770, 0, 34200, 34167);
                for (class55 var23 = this.field3340.method724(32); var23 != null; var23 = this.field3340.method723(91)) {
                    class395 var24 = (class395) var23;
                    var24.method2297(arg7, arg3, arg4, arg5, (byte) 38);
                }
                this.field3352.method2983(0, 768, arg6 ^ 11400, 5890);
                this.field3352.method3029(770, 0, 34200, 5890);
                this.field3352.method3006(1, (class221) null);
                this.field3352.method442(var21, var22, this.field3352.field7638);
            }
            if (this.field3356 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field3352.method3011((class475) null, (class475) null, this.field3378, this.field3376, arg6 + -11490);
                this.field3356.method857(arg2, arg3, arg4, arg5, (byte) 93, arg7);
                OpenGL.glPopMatrix();
            }
        }
        if (arg6 != 11490) {
            field3341 = false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII[[Z)V", line = 337)
    public final void method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3332;
        if (~this.field3371 < -1) {
            this.field3352.method3010(29458);
            this.field3352.method2999(false, 6914);
            this.field3352.method2994(false, false);
            this.field3352.method3024(false, false);
            this.field3352.method3018((byte) 27, false);
            this.field3352.method3013((byte) -35, 0);
            this.field3352.method2977(-62, -2);
            this.field3352.method3006(1, (class221) null);
            class656.field9151[4] = 0.0F;
            class656.field9151[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3352.field7410;
            class656.field9151[9] = 0.0F;
            class656.field9151[3] = 0.0F;
            class656.field9151[7] = 0.0F;
            class656.field9151[11] = 0.0F;
            class656.field9151[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field3352.field7411;
            class656.field9151[15] = 1.0F;
            class656.field9151[14] = 0.0F;
            class656.field9151[10] = 0.0F;
            class656.field9151[0] = (float) arg2 / ((float) super.field3730 * 128.0F * (float) this.field3352.field7411);
            class656.field9151[6] = 0.0F;
            class656.field9151[8] = 0.0F;
            class656.field9151[1] = 0.0F;
            class656.field9151[2] = 0.0F;
            class656.field9151[5] = (float) arg2 / ((float) super.field3730 * 128.0F * (float) this.field3352.field7410);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class656.field9151, 0);
            class656.field9151[10] = 0.0F;
            class656.field9151[7] = 0.0F;
            class656.field9151[12] = 0.0F;
            class656.field9151[15] = 1.0F;
            class656.field9151[4] = 0.0F;
            class656.field9151[5] = 0.0F;
            class656.field9151[14] = 0.0F;
            class656.field9151[11] = 0.0F;
            class656.field9151[2] = 0.0F;
            class656.field9151[8] = 0.0F;
            class656.field9151[3] = 0.0F;
            class656.field9151[0] = 1.0F;
            class656.field9151[6] = 1.0F;
            class656.field9151[1] = 0.0F;
            class656.field9151[9] = 1.0F;
            class656.field9151[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class656.field9151, 0);
            if (~(this.field3339 & 7) != -1) {
                this.field3352.method2994(true, false);
                this.field3352.method2974(126);
            } else {
                this.field3352.method2994(false, false);
            }
            this.field3352.method3011(this.field3370, this.field3369, this.field3378, this.field3376, 0);
            if (this.field3352.field7657.field8529.length < this.field3362 * 2) {
                this.field3352.field7657 = new class183(this.field3362 * 2);
            } else {
                this.field3352.field7657.field8520 = 0;
            }
            int var9 = 0;
            class183 var10 = this.field3352.field7657;
            if (this.field3352.field7608) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field3727 * var11 - -arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field3336[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method3423(var14[var15] & 65535, 1571862888);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field3727 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field3336[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    var10.method3446(var20[var21] & 65535, 4);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class604 var17 = new class604(this.field3352, 5123, var10.field8529, var10.field8520);
                this.field3352.method3008(var9, 4, var17, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lac;IIII[[I[[II)V", line = 508)
    public class257(class541 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3352 = arg0;
        this.field3329 = new int[arg3][arg4][];
        this.field3358 = new int[arg3][arg4][];
        this.field3326 = new int[arg3][arg4][];
        this.field3336 = new short[arg3 * arg4][];
        this.field3366 = new byte[arg3 + 1][arg4 + 1];
        this.field3328 = new int[arg3][arg4][];
        this.field3348 = 1 << this.field3325;
        this.field3335 = new int[arg3][arg4][];
        this.field3372 = new float[super.field3727 - -1][super.field3728 - -1];
        this.field3339 = arg2;
        this.field3368 = new float[super.field3727 + 1][super.field3728 - -1];
        this.field3324 = new class318[arg3][arg4][];
        this.field3342 = new byte[arg3][arg4];
        this.field3377 = new float[super.field3727 - -1][super.field3728 + 1];
        for (int var9 = 1; super.field3728 > var9; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field3727; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field3372[var10][var9] = (float) var11 * var13;
                this.field3368[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3377[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3373 = new class459(128);
        if ((this.field3339 & 16) != 0) {
            this.field3356 = new class139(this.field3352, this);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 569)
    public final boolean method1534(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3345;
        if (this.field3356 != null && arg0 != null) {
            int var7 = arg1 - (this.field3352.field7609 * arg2 >> 8) >> this.field3352.field7530;
            int var8 = -(this.field3352.field7588 * arg2 >> 8) + arg3 >> this.field3352.field7530;
            return this.field3356.method862(arg0, -115, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 588)
    public final void method1535(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3346;
        if (this.field3356 != null && arg0 != null) {
            int var7 = -(this.field3352.field7609 * arg2 >> 8) + arg1 >> this.field3352.field7530;
            int var8 = arg3 - (this.field3352.field7588 * arg2 >> 8) >> this.field3352.field7530;
            this.field3356.method861((byte) 94, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILen;)V", line = 606)
    private final void method1536(int arg0, int arg1, int arg2, class322 arg3) {
        ++field3334;
        int[] var5 = this.field3326[arg0][arg1];
        int[] var6 = this.field3329[arg0][arg1];
        int var7 = var5.length;
        if (~var7 < ~this.field3352.field7682.length) {
            this.field3352.field7682 = new int[var7];
            this.field3352.field7681 = new int[var7];
        }
        int[] var8 = this.field3352.field7682;
        int[] var9 = this.field3352.field7681;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = var5[var10] >> this.field3352.field7530;
            var9[var10] = var6[var10] >> this.field3352.field7530;
        }
        int var11 = arg2;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) - (var16 - var14) * (-var13 + var15) > 0) {
                arg3.method1927(var13, var14, var12, var17, var15, arg2 + -119, var16);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 666)
    public static final void method1537(String arg0, int arg1) {
        ++field3360;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class540.method2966(-1, arg0);
            if (var2 != null) {
                if (arg1 != -23995) {
                    method1537((String) null, 68);
                }
                for (int var3 = 0; var3 < class148.field1904; ++var3) {
                    String var4 = class554.field7827[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class540.method2966(-1, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class148.field1904;
                        for (int var6 = var3; ~class148.field1904 < ~var6; ++var6) {
                            class554.field7827[var6] = class554.field7827[var6 + 1];
                            class72.field775[var6] = class72.field775[var6 + 1];
                            class270.field3568[var6] = class270.field3568[var6 + 1];
                            class82.field1110[var6] = class82.field1110[var6 + 1];
                            class759.field10584[var6] = class759.field10584[var6 + 1];
                        }
                        ++class607.field8479;
                        class328.field4444 = class292.field3876;
                        class103 var7 = class752.method4186(arg1 + 24255, class193.field2317, class449.field6285);
                        var7.field1379.method3393(class601.method3326(arg0, (byte) 106), arg1 + 24104);
                        var7.field1379.method3387(arg0, (byte) 113);
                        class27.method104(false, var7);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lcba;[I)V", line = 734)
    public final void method1538(class551 arg0, int[] arg1) {
        this.field3340.method725(new class395(this.field3352, this, arg0, arg1), -20911);
        ++field3337;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 744)
    public static void method1539(int arg0) {
        field3338 = null;
        field3349 = null;
        field3343 = null;
        if (arg0 >= -116) {
            field3353 = true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "fa", descriptor = "(IILr;)Lr;", line = 758)
    public final class184 method1540(int arg0, int arg1, class184 arg2) {
        ++field3350;
        if (~(1 & this.field3342[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3730 >> this.field3352.field7530;
            class322 var5 = (class322) arg2;
            class322 var6;
            if (var5 != null && var5.method1926(var4, (byte) -122, var4)) {
                var6 = var5;
                var5.method1925(93);
            } else {
                var6 = new class322(this.field3352, var4, var4);
            }
            var6.method1922(0, var4, var4, 0, -1);
            this.method1536(arg0, arg1, 0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[[ZZII)V", line = 789)
    public final void method1541(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field3351;
        this.method1532(arg6, arg5, arg4, arg2, arg0, arg3, 11490, arg1);
    }

    @OriginalMember(owner = "client!ok", name = "YA", descriptor = "()V", line = 799)
    public final void method1542() {
        ++field3364;
        if (~this.field3371 >= -1) {
            this.field3356 = null;
        } else {
            byte[][] var1 = new byte[super.field3727 + 1][super.field3728 - -1];
            for (int var2 = 1; ~var2 > ~super.field3727; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field3728; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3366[var2][var103 + 1] >> 3) + (this.field3366[var2][var103] >> 1) + (this.field3366[var2 + -1][var103] >> 2) + (this.field3366[var2][var103 - 1] >> 2) + (this.field3366[var2 + 1][var103] >> 3));
                }
            }
            this.field3375 = new class318[this.field3373.method2561((byte) -6)];
            this.field3373.method2554(this.field3375, (byte) 74);
            for (int var3 = 0; ~this.field3375.length < ~var3; ++var3) {
                this.field3375[var3].method1909(this.field3371, (byte) -64);
            }
            int var4 = 24;
            if (this.field3355 != null) {
                var4 += 4;
            }
            if ((this.field3339 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field3352.field7534.method3778(this.field3371 * var4, false);
            Stream var6 = new Stream(var5);
            class318[] var7 = new class318[this.field3371];
            int var8 = class115.method761(47, this.field3371 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class459 var9 = new class459(var8);
            class318[] var10 = new class318[this.field3367];
            for (int var11 = 0; super.field3727 > var11; ++var11) {
                for (int var30 = 0; var30 < super.field3728; ++var30) {
                    if (this.field3358[var11][var30] != null) {
                        class318[] var31 = this.field3324[var11][var30];
                        int[] var32 = this.field3326[var11][var30];
                        int[] var33 = this.field3329[var11][var30];
                        int[] var34 = this.field3335[var11][var30];
                        int[] var35 = this.field3358[var11][var30];
                        int[] var36 = this.field3328 == null ? null : this.field3328[var11][var30];
                        int[] var37 = this.field3355 == null ? null : this.field3355[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field3372[var11][var30];
                        float var39 = this.field3368[var11][var30];
                        float var40 = this.field3377[var11][var30];
                        float var41 = this.field3372[var11][var30 + 1];
                        float var42 = this.field3368[var11][var30 - -1];
                        float var43 = this.field3377[var11][var30 + 1];
                        float var44 = this.field3372[var11 + 1][var30 - -1];
                        float var45 = this.field3368[var11 + 1][var30 + 1];
                        float var46 = this.field3377[var11 - -1][var30 - -1];
                        float var47 = this.field3372[var11 + 1][var30];
                        float var48 = this.field3368[var11 + 1][var30];
                        float var49 = this.field3377[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label341: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class318 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3336[super.field3727 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field3722) + var32[var57];
                            int var59 = (var30 << super.field3722) - -var33[var57];
                            int var60 = var58 >> this.field3325;
                            int var61 = var59 >> this.field3325;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && ~var68 == -1) {
                                var72 = var39;
                                var73 = var69 - var50;
                                var74 = var40;
                                var75 = var38;
                            } else if (~var67 == -1 && ~super.field3730 == ~var68) {
                                var72 = var42;
                                var75 = var41;
                                var74 = var43;
                                var73 = var69 - var51;
                            } else if (~super.field3730 == ~var67 && ~super.field3730 == ~var68) {
                                var72 = var45;
                                var74 = var46;
                                var73 = var69 - var52;
                                var75 = var44;
                            } else if (super.field3730 == var67 && var68 == 0) {
                                var75 = var47;
                                var73 = var69 - var53;
                                var74 = var49;
                                var72 = var48;
                            } else {
                                float var76 = (float) var67 / (float) super.field3730;
                                float var77 = (float) var68 / (float) super.field3730;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var72 = (var82 - var79) * var77 + var79;
                                var75 = (-var78 + var81) * var77 + var78;
                                var74 = (var83 - var80) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field3722) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field3722) + var51;
                                var73 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field3722));
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                if (~(this.field3339 & 7) == -1) {
                                    float var87 = this.field3352.field7649[2] * var74 + this.field3352.field7649[0] * var75 + this.field3352.field7649[1] * var72;
                                    var71 = (var87 > 0.0F ? this.field3352.field7646 : this.field3352.field7618) * var87 + this.field3352.field7624;
                                }
                                var70 = class645.field8982[var86 | 65408 & var62];
                            }
                            class55 var88 = null;
                            if (~(var58 & this.field3348 + -1) == -1 && ~(var59 & this.field3348 + -1) == -1) {
                                var88 = var9.method2552(var65, -1);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class450) var88).field6288;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && var7[var89].field556 > var31[var57].field556) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (127 & var63) * var73 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var91 = class645.field8982[var63 & 65408 | var90];
                                    if ((7 & this.field3339) == 0) {
                                        float var92 = this.field3352.field7649[2] * var74 + this.field3352.field7649[1] * var72 + this.field3352.field7649[0] * var75;
                                        float var93 = var71 * (!(var71 > 0.0F) ? this.field3352.field7618 : this.field3352.field7646) + this.field3352.field7624;
                                        int var94 = (16714929 & var91) >> 16;
                                        int var95 = (var91 & 65479) >> 8;
                                        int var96 = 255 & var91;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var96 * var93);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        if (~var99 <= -1) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var97 << 16 | var98 << 8 | var99;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field3352.field7608) {
                                    var6.method3784((float) var58);
                                    var6.method3784((float) (var64 + this.method1683(var58, var59, true)));
                                    var6.method3784((float) var59);
                                    var6.method3793((byte) (var91 >> 16));
                                    var6.method3793((byte) (var91 >> 8));
                                    var6.method3793((byte) var91);
                                    var6.method3793(-1);
                                    var6.method3784((float) var58);
                                    var6.method3784((float) var59);
                                    if (this.field3355 != null) {
                                        var6.method3784((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field3339) != 0) {
                                        var6.method3784(var75);
                                        var6.method3784(var72);
                                        var6.method3784(var74);
                                    }
                                } else {
                                    var6.method3781((float) var58);
                                    var6.method3781((float) (var64 + this.method1683(var58, var59, true)));
                                    var6.method3781((float) var59);
                                    var6.method3793((byte) (var91 >> 16));
                                    var6.method3793((byte) (var91 >> 8));
                                    var6.method3793((byte) var91);
                                    var6.method3793(-1);
                                    var6.method3781((float) var58);
                                    var6.method3781((float) var59);
                                    if (this.field3355 != null) {
                                        var6.method3781((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(this.field3339 & 7) != -1) {
                                        var6.method3781(var75);
                                        var6.method3781(var72);
                                        var6.method3781(var74);
                                    }
                                }
                                var89 = this.field3344++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method2558(new class450(var56[var57]), var65, -1);
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method1902(var73, (byte) 77, var71, var70, var89);
                            }
                            ++this.field3362;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field3344; ++var12) {
                class318 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1901(var12, true);
                }
            }
            for (int var13 = 0; ~super.field3727 < ~var13; ++var13) {
                for (int var18 = 0; super.field3728 > var18; ++var18) {
                    short[] var19 = this.field3336[super.field3727 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class318 var25 = var7[var22];
                            class318 var26 = var7[var23];
                            class318 var27 = var7[var24];
                            class318 var28 = null;
                            if (var25 != null) {
                                var25.method1908(var20, (byte) 118, var18, var13);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method1908(var20, (byte) 123, var18, var13);
                                if (var28 == null || var26.field556 < var28.field556) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1908(var20, (byte) 125, var18, var13);
                                if (var28 == null || ~var28.field556 < ~var27.field556) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1901(var22, true);
                                }
                                if (var26 != null) {
                                    var28.method1901(var23, true);
                                }
                                if (var27 != null) {
                                    var28.method1901(var24, true);
                                }
                                var28.method1908(var20, (byte) 126, var18, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3795();
            this.field3374 = this.field3352.method2986(var4, (byte) 86, var5, false, var6.method3787());
            this.field3376 = new class475(this.field3374, 5126, 3, 0);
            this.field3370 = new class475(this.field3374, 5121, 4, 12);
            byte var14;
            if (this.field3355 == null) {
                this.field3378 = new class475(this.field3374, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field3378 = new class475(this.field3374, 5126, 3, 16);
                var14 = 28;
            }
            if (~(this.field3339 & 7) != -1) {
                this.field3369 = new class475(this.field3374, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3375.length];
            for (int var16 = 0; ~this.field3375.length < ~var16; ++var16) {
                class318 var17 = this.field3375[var16];
                var15[var16] = var17.field556;
                var17.method1904(true, this.field3344);
            }
            class403.method2332(this.field3375, false, var15);
            if (this.field3356 != null) {
                this.field3356.method858(119);
            }
        }
        this.field3358 = null;
        this.field3366 = null;
        this.field3355 = null;
        this.field3335 = null;
        this.field3326 = this.field3329 = null;
        this.field3328 = null;
        this.field3324 = null;
        this.field3373 = null;
        this.field3372 = this.field3368 = this.field3377 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V", line = 1380)
    public final void method1543(int arg0, int arg1) {
        ++field3330;
    }

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1388)
    public final void method1544(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3354;
        class152 var15 = this.field3352.field636;
        if (arg3 != null && this.field3328 == null) {
            this.field3328 = new int[super.field3727][super.field3728][];
        }
        if (arg5 != null && this.field3355 == null) {
            this.field3355 = new int[super.field3727][super.field3728][];
        }
        this.field3326[arg0][arg1] = arg2;
        this.field3329[arg0][arg1] = arg4;
        this.field3358[arg0][arg1] = arg6;
        this.field3335[arg0][arg1] = arg7;
        if (this.field3355 != null) {
            this.field3355[arg0][arg1] = arg5;
        }
        if (this.field3328 != null) {
            this.field3328[arg0][arg1] = arg3;
        }
        class318[] var16 = this.field3324[arg0][arg1] = new class318[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field3339 & 32) != 0 && ~var18 != 0 && var15.method925(var18, -28755).field4527) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (var19 << 14) | (long) var18;
            class55 var22;
            for (var22 = this.field3373.method2552(var20, -1); var22 != null; var22 = this.field3373.method2555(122)) {
                class318 var23 = (class318) var22;
                if (var23.field4285 == var18 && (float) var19 == var23.field4290 && var23.field4289 == arg10 && ~var23.field4296 == ~arg11 && ~var23.field4298 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class318) var22;
            } else {
                var16[var17] = new class318(this, var18, var19, arg10, arg11, arg12);
                this.field3373.method2558(var16[var17], var20, -1);
            }
        }
        if (arg13) {
            this.field3342[arg0][arg1] = (byte) class344.method2020(this.field3342[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field3367) {
            this.field3367 = arg6.length;
        }
        this.field3371 += arg6.length;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)Z", line = 1470)
    public static final boolean method1545(int arg0, byte arg1, int arg2) {
        ++field3333;
        int var3 = 30 / ((arg1 - 46) / 55);
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)Z", line = 1480)
    public static final boolean method1546(int arg0, int arg1, int arg2) {
        if (arg1 != 15849) {
            return false;
        } else {
            ++field3363;
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lni;ZIIII)V", line = 1498)
    public static final void method1547(class522 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3357;
        class273.method1628(arg2, arg5 + 16527, arg1, arg4, arg0, arg3, 0L);
        if (arg5 != -16523) {
            method1531(26, 118, -88, -119, (byte) -81, -59, -59);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[[ZZI)V", line = 1518)
    public final void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method1532(arg5, -1, arg4, arg2, arg0, arg3, 11490, arg1);
        ++field3331;
    }
}
