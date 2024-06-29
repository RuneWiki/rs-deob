import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class634 extends class280 {

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "Lada;")
    private class164 field8879 = new class164();

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    private int field8899 = this.field3955 + -2;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "Lwh;")
    public class148 field8900;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public int field8880;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "[[S")
    public short[][] field8889;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "[[[Lgf;")
    private class277[][][] field8904;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "[[B")
    private byte[][] field8908;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "[[F")
    private float[][] field8906;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "[[[I")
    public int[][][] field8871;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "[[[I")
    public int[][][] field8876;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "[[F")
    private float[][] field8907;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "[[[I")
    private int[][][] field8893;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "[[[I")
    private int[][][] field8888;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    private int field8883;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "[[B")
    private byte[][] field8905;

    @OriginalMember(owner = "client!mh", name = "jb", descriptor = "[[F")
    private float[][] field8916;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "[[[I")
    public int[][][] field8885;

    @OriginalMember(owner = "client!mh", name = "nb", descriptor = "Lhe;")
    private class372 field8920;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "Lwha;")
    private class283 field8881;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "Lmia;")
    public static class63 field8894 = new class63(28, 3);

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    private int field8872;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    private int field8873;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    private int field8911;

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
    private int field8914;

    @OriginalMember(owner = "client!mh", name = "lb", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!mh", name = "mb", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "Lcl;")
    public class268 field8909;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "Lcl;")
    private class268 field8910;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lcl;")
    public class268 field8915;

    @OriginalMember(owner = "client!mh", name = "kb", descriptor = "Lcl;")
    public class268 field8917;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "Lwia;")
    private class761 field8913;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "[Lgf;")
    private class277[] field8912;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[[[I")
    private int[][][] field8875;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 3)
    public final void method957(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field8891;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
        this.method974(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIZI[[ZIZ)V", line = 94)
    private final void method3652(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean[][] arg5, int arg6, boolean arg7) {
        if (this.field8912 != null) {
            int var9 = arg0 + arg0 + 1;
            int var10 = var9 * var9;
            if (this.field8900.field2314.length < var10) {
                this.field8900.field2314 = new int[var10];
            }
            if (~this.field8900.field2313.field9068.length > ~(this.field8872 * 2)) {
                this.field8900.field2313 = new class699(this.field8872 * 2);
            }
            int var11 = arg1 - arg0;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg0 + arg6;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg0 + arg1;
            if (~(super.field3963 + -1) > ~var15) {
                var15 = super.field3963 + -1;
            }
            int var16 = arg0 + arg6;
            if (var16 > super.field3962 - 1) {
                var16 = super.field3962 - 1;
            }
            int var17 = 0;
            int[] var18 = this.field8900.field2314;
            for (int var19 = var11; ~var15 <= ~var19; ++var19) {
                boolean[] var25 = arg5[-var12 + var19];
                for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field3963 * var26 + var19;
                    }
                }
            }
            if (arg2 != -1) {
                this.field8900.method1040(3, (float) arg2);
                this.field8900.method1083(11939);
            } else {
                this.field8900.method1049(arg7);
            }
            this.field8900.method1089((this.field8880 & 7) != 0, 112);
            for (int var20 = 0; ~this.field8912.length < ~var20; ++var20) {
                this.field8912[var20].method1754(var17, var18, 65535);
            }
            if (!this.field8879.method1197(0)) {
                int var21 = this.field8900.field2255;
                int var22 = this.field8900.field2212;
                this.field8900.method526(0, var22, this.field8900.field2312);
                this.field8900.method1089(false, 118);
                this.field8900.method1027(false, true);
                this.field8900.method1039(false, 128);
                this.field8900.method1058(-2, -98);
                this.field8900.method1088(this.field8900.field2219, -27749);
                this.field8900.method1043((byte) -22, 7681, 8448);
                this.field8900.method1052(34166, 34176, 0, 770);
                this.field8900.method1086(34167, 0, 770, 105);
                for (class184 var23 = this.field8879.method1195(0); var23 != null; var23 = this.field8879.method1201(2)) {
                    class175 var24 = (class175) var23;
                    var24.method1244(arg1, 0, arg5, arg0, arg6);
                }
                this.field8900.method1052(5890, 34176, 0, 768);
                this.field8900.method1086(5890, 0, 770, 96);
                this.field8900.method1088((class195) null, -27749);
                this.field8900.method526(var21, var22, this.field8900.field2312);
            }
            if (this.field8881 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field8900.method1048(this.field8909, 16384, (class268) null, this.field8917, (class268) null);
                this.field8881.method1814(arg0, arg1, 77, arg5, arg3, arg6);
                OpenGL.glPopMatrix();
            }
        }
        ++field8898;
        if (arg7) {
            this.method3652(55, -73, -59, true, -121, (boolean[][]) null, 97, false);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[[ZZI)V", line = 244)
    public final void method977(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field8874;
        this.method3652(arg2, arg0, -1, arg4, arg5, arg3, arg1, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII[[Z)V", line = 252)
    public final void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8890;
        if (this.field8911 > 0) {
            this.field8900.method1070(-30559);
            this.field8900.method1026(false, true);
            this.field8900.method1089(false, 115);
            this.field8900.method1021(1, false);
            this.field8900.method1027(false, true);
            this.field8900.method1039(false, 0);
            this.field8900.method1058(-2, 52);
            this.field8900.method1088((class195) null, -27749);
            class110.field1546[14] = 0.0F;
            class110.field1546[10] = 0.0F;
            class110.field1546[15] = 1.0F;
            class110.field1546[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field8900.field2007;
            class110.field1546[6] = 0.0F;
            class110.field1546[3] = 0.0F;
            class110.field1546[8] = 0.0F;
            class110.field1546[11] = 0.0F;
            class110.field1546[7] = 0.0F;
            class110.field1546[9] = 0.0F;
            class110.field1546[5] = (float) arg2 / ((float) super.field3965 * 128.0F * (float) this.field8900.field2007);
            class110.field1546[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field8900.field1991;
            class110.field1546[2] = 0.0F;
            class110.field1546[0] = (float) arg2 / ((float) super.field3965 * 128.0F * (float) this.field8900.field1991);
            class110.field1546[4] = 0.0F;
            class110.field1546[1] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class110.field1546, 0);
            class110.field1546[2] = 0.0F;
            class110.field1546[15] = 1.0F;
            class110.field1546[3] = 0.0F;
            class110.field1546[13] = 0.0F;
            class110.field1546[14] = 0.0F;
            class110.field1546[0] = 1.0F;
            class110.field1546[11] = 0.0F;
            class110.field1546[10] = 0.0F;
            class110.field1546[7] = 0.0F;
            class110.field1546[4] = 0.0F;
            class110.field1546[12] = 0.0F;
            class110.field1546[9] = 1.0F;
            class110.field1546[5] = 0.0F;
            class110.field1546[1] = 0.0F;
            class110.field1546[6] = 1.0F;
            class110.field1546[8] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class110.field1546, 0);
            if ((this.field8880 & 7) == 0) {
                this.field8900.method1089(false, 109);
            } else {
                this.field8900.method1089(true, 120);
                this.field8900.method1020(53);
            }
            this.field8900.method1048(this.field8909, 16384, this.field8910, this.field8917, this.field8915);
            if (this.field8872 * 2 > this.field8900.field2313.field9068.length) {
                this.field8900.field2313 = new class699(this.field8872 * 2);
            } else {
                this.field8900.field2313.field9084 = 0;
            }
            int var9 = 0;
            class699 var10 = this.field8900.field2313;
            if (!this.field8900.field2211) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field3963 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field8889[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method3758(var14[var15] & 65535, 1394247496);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field3963 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field8889[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method3702(var20[var21] & 65535, (byte) -106);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class644 var17 = new class644(this.field8900, 5123, var10.field9068, var10.field9084);
                this.field8900.method1064(false, 4, var17, 0, var9);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lwh;IIII[[I[[II)V", line = 421)
    public class634(class148 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field8900 = arg0;
        this.field8880 = arg2;
        this.field8889 = new short[arg3 * arg4][];
        this.field8904 = new class277[arg3][arg4][];
        this.field8908 = new byte[arg3 + 1][arg4 + 1];
        this.field8906 = new float[super.field3963 + 1][super.field3962 + 1];
        this.field8871 = new int[arg3][arg4][];
        this.field8876 = new int[arg3][arg4][];
        this.field8907 = new float[super.field3963 + 1][super.field3962 - -1];
        this.field8893 = new int[arg3][arg4][];
        this.field8888 = new int[arg3][arg4][];
        this.field8883 = 1 << this.field8899;
        this.field8905 = new byte[arg3][arg4];
        this.field8916 = new float[super.field3963 + 1][super.field3962 - -1];
        this.field8885 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field3962; ++var9) {
            for (int var10 = 1; super.field3963 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + var11 * var11 - -(var12 * var12))));
                this.field8906[var10][var9] = (float) var11 * var13;
                this.field8907[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field8916[var10][var9] = (float) var12 * var13;
            }
        }
        this.field8920 = new class372(128);
        if ((this.field8880 & 16) != 0) {
            this.field8881 = new class283(this.field8900, this);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[[ZZII)V", line = 477)
    public final void method975(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method3652(arg2, arg0, arg5, arg4, arg6, arg3, arg1, false);
        ++field8878;
    }

    @OriginalMember(owner = "client!mh", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 490)
    public final void method963(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8903;
        if (this.field8881 != null && arg0 != null) {
            int var7 = arg1 - (this.field8900.field2230 * arg2 >> 8) >> this.field8900.field2171;
            int var8 = -(this.field8900.field2252 * arg2 >> 8) + arg3 >> this.field8900.field2171;
            this.field8881.method1810(arg0, 0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!mh", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 516)
    public final void method976(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8901;
        if (this.field8881 != null && arg0 != null) {
            int var7 = -(this.field8900.field2230 * arg2 >> 8) + arg1 >> this.field8900.field2171;
            int var8 = arg3 - (this.field8900.field2252 * arg2 >> 8) >> this.field8900.field2171;
            this.field8881.method1811(arg0, var8, var7, 90);
        }
    }

    @OriginalMember(owner = "client!mh", name = "fa", descriptor = "(IILr;)Lr;", line = 536)
    public final class183 method967(int arg0, int arg1, class183 arg2) {
        ++field8918;
        if (~(this.field8905[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field3965 >> this.field8900.field2171;
            class265 var5 = (class265) arg2;
            class265 var6;
            if (var5 != null && var5.method1705(var4, var4, (byte) 48)) {
                var6 = var5;
                var5.method1704(-117);
            } else {
                var6 = new class265(this.field8900, var4, var4);
            }
            var6.method1707(var4, 99, var4, 0, 0);
            this.method3653(arg1, arg0, (byte) -44, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBLoca;)V", line = 564)
    private final void method3653(int arg0, int arg1, byte arg2, class265 arg3) {
        ++field8892;
        int[] var5 = this.field8871[arg1][arg0];
        int[] var6 = this.field8885[arg1][arg0];
        int var7 = var5.length;
        if (this.field8900.field2316.length < var7) {
            this.field8900.field2316 = new int[var7];
            this.field8900.field2319 = new int[var7];
        }
        int[] var8 = this.field8900.field2316;
        int[] var9 = this.field8900.field2319;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = var5[var10] >> this.field8900.field2171;
            var9[var10] = var6[var10] >> this.field8900.field2171;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((var15 - var13) * (-var14 + var16)) > 0) {
                arg3.method1708(var17, var16, var15, (byte) -93, var13, var14, var12);
            }
        }
        if (arg2 != -44) {
            this.method964((class183) null, -84, -111, 93, 27, true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/lang/String;)J", line = 627)
    public static final long method3654(byte arg0, String arg1) {
        ++field8897;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (~var6 <= -66 && var6 <= 'Z') {
                var2 += (long) (var6 + 1 + -65);
            } else if (var6 >= 'a' && ~var6 >= -123) {
                var2 += (long) (1 - -var6 + -97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (-21 - -var6);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && ~var2 != -1L) {
            var2 /= 37L;
        }
        if (arg0 != 0) {
            field8902 = 37;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lraa;[I)V", line = 675)
    public final void method966(class609 arg0, int[] arg1) {
        ++field8882;
        this.field8879.method1203(new class175(this.field8900, this, arg0, arg1), (byte) 124);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 688)
    public final boolean method964(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8895;
        if (this.field8881 != null && arg0 != null) {
            int var7 = arg1 - (this.field8900.field2230 * arg2 >> 8) >> this.field8900.field2171;
            int var8 = -(this.field8900.field2252 * arg2 >> 8) + arg3 >> this.field8900.field2171;
            return this.field8881.method1813(-127, var7, arg0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 705)
    public final void method974(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field8886;
        if (arg3 != null && this.field8893 == null) {
            this.field8893 = new int[super.field3963][super.field3962][];
        }
        class151 var15 = this.field8900.field849;
        if (arg5 != null && this.field8875 == null) {
            this.field8875 = new int[super.field3963][super.field3962][];
        }
        this.field8871[arg0][arg1] = arg2;
        this.field8885[arg0][arg1] = arg4;
        this.field8876[arg0][arg1] = arg6;
        this.field8888[arg0][arg1] = arg7;
        if (this.field8875 != null) {
            this.field8875[arg0][arg1] = arg5;
        }
        if (this.field8893 != null) {
            this.field8893[arg0][arg1] = arg3;
        }
        class277[] var16 = this.field8904[arg0][arg1] = new class277[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field8880) != -1 && ~var18 != 0 && var15.method1124((byte) -86, var18).field4184) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) (var19 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) var18;
            class184 var22;
            for (var22 = this.field8920.method2287(var20, (byte) -117); var22 != null; var22 = this.field8920.method2280(true)) {
                class277 var23 = (class277) var22;
                if (~var23.field3928 == ~var18 && (float) var19 == var23.field3940 && var23.field3924 == arg10 && var23.field3929 == arg11 && ~var23.field3933 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class277) var22;
            } else {
                var16[var17] = new class277(this, var18, var19, arg10, arg11, arg12);
                this.field8920.method2278((byte) -67, var20, var16[var17]);
            }
        }
        if (arg13) {
            this.field8905[arg0][arg1] = (byte) class625.method3600(this.field8905[arg0][arg1], 1);
        }
        if (arg6.length > this.field8914) {
            this.field8914 = arg6.length;
        }
        this.field8911 += arg6.length;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 788)
    public static void method3655(int arg0) {
        if (arg0 == -4255) {
            field8894 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V", line = 800)
    public final void method960(int arg0, int arg1) {
        ++field8884;
    }

    @OriginalMember(owner = "client!mh", name = "YA", descriptor = "()V", line = 807)
    public final void method972() {
        if (this.field8911 > 0) {
            byte[][] var1 = new byte[super.field3963 + 1][super.field3962 + 1];
            for (int var2 = 1; var2 < super.field3963; ++var2) {
                for (int var103 = 1; super.field3962 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field8908[var2 - 1][var103] >> 2) + (this.field8908[var2][var103 - 1] >> 2) + (this.field8908[var2 + 1][var103] >> 3) + (this.field8908[var2][var103 - -1] >> 3) + (this.field8908[var2][var103] >> 1));
                }
            }
            this.field8912 = new class277[this.field8920.method2281(false)];
            this.field8920.method2288(this.field8912, (byte) -71);
            for (int var3 = 0; ~var3 > ~this.field8912.length; ++var3) {
                this.field8912[var3].method1762((byte) -111, this.field8911);
            }
            int var4 = 24;
            if (this.field8875 != null) {
                var4 += 4;
            }
            if ((this.field8880 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field8900.field2166.method3857(this.field8911 * var4, false);
            Stream var6 = new Stream(var5);
            class277[] var7 = new class277[this.field8911];
            int var8 = class505.method2996(this.field8911 / 4, 58);
            if (~var8 > -2) {
                var8 = 1;
            }
            class372 var9 = new class372(var8);
            class277[] var10 = new class277[this.field8914];
            for (int var11 = 0; ~super.field3963 < ~var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field3962; ++var30) {
                    if (this.field8876[var11][var30] != null) {
                        class277[] var31 = this.field8904[var11][var30];
                        int[] var32 = this.field8871[var11][var30];
                        int[] var33 = this.field8885[var11][var30];
                        int[] var34 = this.field8888[var11][var30];
                        int[] var35 = this.field8876[var11][var30];
                        int[] var36 = this.field8893 == null ? null : this.field8893[var11][var30];
                        int[] var37 = this.field8875 == null ? null : this.field8875[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field8906[var11][var30];
                        float var39 = this.field8907[var11][var30];
                        float var40 = this.field8916[var11][var30];
                        float var41 = this.field8906[var11][var30 + 1];
                        float var42 = this.field8907[var11][var30 + 1];
                        float var43 = this.field8916[var11][var30 - -1];
                        float var44 = this.field8906[var11 - -1][var30 + 1];
                        float var45 = this.field8907[var11 + 1][var30 + 1];
                        float var46 = this.field8916[var11 + 1][var30 + 1];
                        float var47 = this.field8906[var11 - -1][var30];
                        float var48 = this.field8907[var11 + 1][var30];
                        float var49 = this.field8916[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 - -1] & 255;
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label341: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class277 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field8889[super.field3963 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field3955) - -var32[var57];
                            int var59 = (var30 << super.field3955) + var33[var57];
                            int var60 = var58 >> this.field8899;
                            int var61 = var59 >> this.field8899;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && ~var68 == -1) {
                                var71 = var39;
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var40;
                            } else if (var67 == 0 && super.field3965 == var68) {
                                var71 = var42;
                                var72 = var69 - var51;
                                var74 = var43;
                                var73 = var41;
                            } else if (super.field3965 == var67 && super.field3965 == var68) {
                                var74 = var46;
                                var71 = var45;
                                var73 = var44;
                                var72 = var69 - var52;
                            } else if (~super.field3965 == ~var67 && ~var68 == -1) {
                                var74 = var49;
                                var73 = var47;
                                var72 = var69 - var53;
                                var71 = var48;
                            } else {
                                float var75 = (float) var67 / (float) super.field3965;
                                float var76 = (float) var68 / (float) super.field3965;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                var73 = (-var77 + var80) * var76 + var77;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var71 = (-var78 + var81) * var76 + var78;
                                var74 = (-var79 + var82) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field3955) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field3955) + var51;
                                var72 = var69 - (((var84 - var83) * var68 >> super.field3955) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                if (~(7 & this.field8880) == -1) {
                                    float var87 = this.field8900.field2269[2] * var74 + this.field8900.field2269[1] * var71 + this.field8900.field2269[0] * var73;
                                    var85 = var87 * (var87 > 0.0F ? this.field8900.field2297 : this.field8900.field2285) + this.field8900.field2259;
                                }
                                var70 = class324.field4632[var62 & 65408 | var86];
                            }
                            class184 var88 = null;
                            if (~(this.field8883 + -1 & var58) == -1 && ~(this.field8883 + -1 & var59) == -1) {
                                var88 = var9.method2287(var65, (byte) -117);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class250) var88).field3618;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && var7[var89].field2810 > var31[var57].field2810) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (var62 == var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (127 & var63) * var72 >> 7;
                                    if (var91 < 2) {
                                        var91 = 2;
                                    } else if (var91 > 126) {
                                        var91 = 126;
                                    }
                                    var90 = class324.field4632[var91 | var63 & 65408];
                                    if (~(this.field8880 & 7) == -1) {
                                        float var92 = this.field8900.field2269[2] * var74 + this.field8900.field2269[1] * var71 + this.field8900.field2269[0] * var73;
                                        float var93 = (!(var85 > 0.0F) ? this.field8900.field2285 : this.field8900.field2297) * var85 + this.field8900.field2259;
                                        int var94 = (var90 & 16750486) >> 16;
                                        int var95 = 255 & var90 >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = var90 & 255;
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (~var96 < -256) {
                                            var96 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var98 >= 0) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var98 << 8 | var96 << 16 | var99;
                                    }
                                }
                                if (!this.field8900.field2211) {
                                    var6.method3864((float) var58);
                                    var6.method3864((float) (this.method1786(var59, (byte) 113, var58) - -var64));
                                    var6.method3864((float) var59);
                                    var6.method3871((byte) (var90 >> 16));
                                    var6.method3871((byte) (var90 >> 8));
                                    var6.method3871((byte) var90);
                                    var6.method3871(-1);
                                    var6.method3864((float) var58);
                                    var6.method3864((float) var59);
                                    if (this.field8875 != null) {
                                        var6.method3864((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field8880) != -1) {
                                        var6.method3864(var73);
                                        var6.method3864(var71);
                                        var6.method3864(var74);
                                    }
                                } else {
                                    var6.method3863((float) var58);
                                    var6.method3863((float) (var64 + this.method1786(var59, (byte) 113, var58)));
                                    var6.method3863((float) var59);
                                    var6.method3871((byte) (var90 >> 16));
                                    var6.method3871((byte) (var90 >> 8));
                                    var6.method3871((byte) var90);
                                    var6.method3871(-1);
                                    var6.method3863((float) var58);
                                    var6.method3863((float) var59);
                                    if (this.field8875 != null) {
                                        var6.method3863((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field8880) != 0) {
                                        var6.method3863(var73);
                                        var6.method3863(var71);
                                        var6.method3863(var74);
                                    }
                                }
                                var89 = this.field8873++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method2278((byte) -121, var65, new class250(var56[var57]));
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method1756(var72, 575, var85, var89, var70);
                            }
                            ++this.field8872;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field8873; ++var12) {
                class277 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1758(var12, -90);
                }
            }
            for (int var13 = 0; var13 < super.field3963; ++var13) {
                for (int var18 = 0; var18 < super.field3962; ++var18) {
                    short[] var19 = this.field8889[super.field3963 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class277 var25 = var7[var22];
                            class277 var26 = var7[var23];
                            class277 var27 = var7[var24];
                            class277 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1755(var18, 3, var20, var13);
                            }
                            if (var26 != null) {
                                var26.method1755(var18, 3, var20, var13);
                                if (var28 == null || ~var26.field2810 > ~var28.field2810) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1755(var18, 3, var20, var13);
                                if (var28 == null || var27.field2810 < var28.field2810) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1758(var22, -116);
                                }
                                if (var26 != null) {
                                    var28.method1758(var23, -125);
                                }
                                if (var27 != null) {
                                    var28.method1758(var24, -115);
                                }
                                var28.method1755(var18, 3, var20, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3872();
            this.field8913 = this.field8900.method1050(var6.method3868(), false, false, var5, var4);
            this.field8909 = new class268(this.field8913, 5126, 3, 0);
            this.field8910 = new class268(this.field8913, 5121, 4, 12);
            byte var14;
            if (this.field8875 == null) {
                this.field8917 = new class268(this.field8913, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field8917 = new class268(this.field8913, 5126, 3, 16);
                var14 = 28;
            }
            if (~(7 & this.field8880) != -1) {
                this.field8915 = new class268(this.field8913, 5126, 3, var14);
            }
            long[] var15 = new long[this.field8912.length];
            for (int var16 = 0; var16 < this.field8912.length; ++var16) {
                class277 var17 = this.field8912[var16];
                var15[var16] = var17.field2810;
                var17.method1757((byte) 11, this.field8873);
            }
            class453.method2776(var15, (byte) -122, this.field8912);
            if (this.field8881 != null) {
                this.field8881.method1815((byte) -43);
            }
        } else {
            this.field8881 = null;
        }
        ++field8896;
        this.field8908 = null;
        this.field8893 = null;
        this.field8888 = null;
        this.field8876 = null;
        this.field8920 = null;
        this.field8906 = this.field8907 = this.field8916 = null;
        this.field8875 = null;
        this.field8871 = this.field8885 = null;
        this.field8904 = null;
    }

    @OriginalMember(owner = "client!mh", name = "ka", descriptor = "(III)V", line = 1382)
    public final void method973(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field8908[arg0][arg1] & 255)) {
            this.field8908[arg0][arg1] = (byte) arg2;
        }
        ++field8919;
    }
}
