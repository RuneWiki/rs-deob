import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class390 extends class35 {

    @OriginalMember(owner = "client!si", name = "H", descriptor = "Lug;")
    private class392 field5884 = new class392();

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[[I")
    private int[][] field5872;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    private int field5868;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "Lvj;")
    public class303 field5880;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "[[[I")
    private int[][][] field5885;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[[B")
    private byte[][] field5870;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "[[S")
    public short[][] field5889;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public int field5875;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "[[F")
    private float[][] field5897;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "[[[I")
    public int[][][] field5882;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    private int field5879;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "[[F")
    private float[][] field5907;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "[[F")
    private float[][] field5899;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "[[[Ljo;")
    private class219[][][] field5890;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "[[[I")
    private int[][][] field5886;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "[[B")
    private byte[][] field5900;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "[[[I")
    private int[][][] field5877;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "[[[I")
    public int[][][] field5895;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "Lan;")
    private class20 field5902;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Llv;")
    private class306 field5861;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "Lmj;")
    public static class463 field5892 = new class463();

    @OriginalMember(owner = "client!si", name = "jb", descriptor = "I")
    public static int field5912 = -1;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    private int field5878;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    private int field5891;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    private int field5903;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "I")
    private int field5908;

    @OriginalMember(owner = "client!si", name = "kb", descriptor = "Lbu;")
    public static class17 field5913;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "Lkd;")
    public class184 field5901;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "Lkd;")
    public class184 field5904;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "Lkd;")
    public class184 field5906;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "Lkd;")
    private class184 field5909;

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "Lvc;")
    public static class206 field5911;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "Lnh;")
    private class525 field5905;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "[I")
    public static int[] field5910;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "[Ljo;")
    private class219[] field5898;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[[[I")
    private int[][][] field5866;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lvj;IIII[[I[[II)V", line = 4)
    public class390(class303 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5872 = arg5;
        this.field5868 = super.field679 + -2;
        this.field5880 = arg0;
        this.field5885 = new int[arg3][arg4][];
        this.field5870 = new byte[arg3][arg4];
        this.field5889 = new short[arg3 * arg4][];
        this.field5875 = arg2;
        this.field5897 = new float[super.field673 - -1][super.field678 + 1];
        this.field5882 = new int[arg3][arg4][];
        this.field5879 = 1 << this.field5868;
        this.field5907 = new float[super.field673 + 1][super.field678 + 1];
        this.field5899 = new float[super.field673 + 1][super.field678 - -1];
        this.field5890 = new class219[arg3][arg4][];
        this.field5886 = new int[arg3][arg4][];
        this.field5900 = new byte[arg3 + 1][arg4 + 1];
        this.field5877 = new int[arg3][arg4][];
        this.field5895 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field678 < ~var9; ++var9) {
            for (int var10 = 1; super.field673 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 + var12 * var12)));
                this.field5899[var10][var9] = (float) var11 * var13;
                this.field5907[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5897[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5902 = new class20(128);
        if ((this.field5875 & 16) != 0) {
            this.field5861 = new class306(this.field5880, this);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V", line = 67)
    public final void method365(int arg0, int arg1) {
        ++field5883;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III[[ZZ)V", line = 77)
    public final void method375(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2408(arg3, arg0, arg2, (byte) 77, arg1, arg4, -1);
        ++field5862;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 86)
    public final void method367(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5896;
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
        for (int var28 = 0; var18 > var28; ++var28) {
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
        this.method370(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 178)
    public static void method2406(int arg0) {
        field5910 = null;
        field5892 = null;
        field5911 = null;
        field5913 = null;
        if (arg0 != 65535) {
            field5911 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "U", descriptor = "(Lj;IIIIZ)V", line = 196)
    public final void method366(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5873;
        if (this.field5861 != null && arg0 != null) {
            int var7 = -(this.field5880.field4567 * arg2 >> 8) + arg1 >> this.field5880.field4492;
            int var8 = arg3 - (this.field5880.field4591 * arg2 >> 8) >> this.field5880.field4492;
            this.field5861.method2010(arg0, var7, var8, 1);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILco;IB)V", line = 214)
    private final void method2407(int arg0, class76 arg1, int arg2, byte arg3) {
        ++field5881;
        int[] var5 = this.field5882[arg2][arg0];
        int[] var6 = this.field5895[arg2][arg0];
        if (arg3 <= -90) {
            int var7 = var5.length;
            if (~class130.field2074.length > ~var7) {
                class106.field1769 = new int[var7];
                class130.field2074 = new int[var7];
            }
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                class130.field2074[var8] = class207.method1405(255, var5[var8]) >> this.field5880.field4492;
                class106.field1769[var8] = class207.method1405(255, var6[var8]) >> this.field5880.field4492;
            }
            int var9 = 0;
            while (var9 < var7) {
                int var10 = class130.field2074[var9];
                int var11 = class106.field1769[var9++];
                int var12 = class130.field2074[var9];
                int var13 = class106.field1769[var9++];
                int var14 = class130.field2074[var9];
                int var15 = class106.field1769[var9++];
                if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                    arg1.method609(var15, var13, var14, var11, var12, (byte) 31, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 272)
    public final boolean method369(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5869;
        if (this.field5861 != null && arg0 != null) {
            int var7 = -(this.field5880.field4567 * arg2 >> 8) + arg1 >> this.field5880.field4492;
            int var8 = arg3 - (this.field5880.field4591 * arg2 >> 8) >> this.field5880.field4492;
            return this.field5861.method2005(arg0, var8, var7, (byte) 65);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII[[Z)V", line = 293)
    public final void method374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5871;
        if (~this.field5903 < -1) {
            this.field5880.method1937(-30401);
            this.field5880.method1943(false, (byte) -60);
            this.field5880.method1941(false, 21282);
            this.field5880.method1983(34161, false);
            this.field5880.method1984(99, false);
            this.field5880.method1934(0, true);
            this.field5880.method1970(7, -2);
            this.field5880.method1990((class492) null, 11864);
            class247.field3567[10] = 0.0F;
            class247.field3567[14] = 0.0F;
            class247.field3567[0] = (float) arg2 / ((float) super.field676 * 128.0F * (float) this.field5880.field4372);
            class247.field3567[4] = 0.0F;
            class247.field3567[11] = 0.0F;
            class247.field3567[9] = 0.0F;
            class247.field3567[8] = 0.0F;
            class247.field3567[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5880.field4387) + 1.0F;
            class247.field3567[15] = 1.0F;
            class247.field3567[1] = 0.0F;
            class247.field3567[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5880.field4372) + -1.0F;
            class247.field3567[5] = (float) arg2 / ((float) super.field676 * 128.0F * (float) this.field5880.field4387);
            class247.field3567[6] = 0.0F;
            class247.field3567[2] = 0.0F;
            class247.field3567[7] = 0.0F;
            class247.field3567[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class247.field3567, 0);
            class247.field3567[8] = 0.0F;
            class247.field3567[6] = 1.0F;
            class247.field3567[14] = 0.0F;
            class247.field3567[5] = 0.0F;
            class247.field3567[13] = 0.0F;
            class247.field3567[15] = 1.0F;
            class247.field3567[11] = 0.0F;
            class247.field3567[2] = 0.0F;
            class247.field3567[4] = 0.0F;
            class247.field3567[0] = 1.0F;
            class247.field3567[12] = 0.0F;
            class247.field3567[7] = 0.0F;
            class247.field3567[9] = 1.0F;
            class247.field3567[10] = 0.0F;
            class247.field3567[3] = 0.0F;
            class247.field3567[1] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class247.field3567, 0);
            if ((7 & this.field5875) == 0) {
                this.field5880.method1941(false, 21282);
            } else {
                this.field5880.method1941(true, 21282);
                this.field5880.method1969((byte) -41);
            }
            this.field5880.method1982(this.field5909, this.field5901, this.field5904, this.field5906, 113);
            if (~(this.field5891 * 2) < ~class494.field7307.field2270.length) {
                class494.field7307 = new class145(this.field5891 * 2);
            } else {
                class494.field7307.field2289 = 0;
            }
            int var9 = 0;
            if (!this.field5880.field4599) {
                for (int var10 = arg4; ~var10 > ~arg6; ++var10) {
                    int var11 = super.field673 * var10 + arg3;
                    for (int var12 = arg3; arg5 > var12; ++var12) {
                        if (arg7[-arg3 + var12][-arg4 + var10]) {
                            short[] var13 = this.field5889[var11];
                            if (var13 != null) {
                                for (int var14 = 0; var14 < var13.length; ++var14) {
                                    class494.field7307.method1066(-2012325976, 65535 & var13[var14]);
                                    ++var9;
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; ~arg6 < ~var15; ++var15) {
                    int var17 = super.field673 * var15 - -arg3;
                    for (int var18 = arg3; arg5 > var18; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field5889[var17];
                            if (var19 != null) {
                                for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                    ++var9;
                                    class494.field7307.method1094(1618659784, var19[var20] & 65535);
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (~var9 < -1) {
                class370 var16 = new class370(this.field5880, 5123, class494.field7307.field2270, class494.field7307.field2289);
                this.field5880.method1988(var9, var16, 0, false, 4);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "O", descriptor = "(IILj;)Lj;", line = 461)
    public final class377 method372(int arg0, int arg1, class377 arg2) {
        ++field5867;
        if (~(this.field5870[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field676 >> this.field5880.field4492;
            class76 var5 = (class76) arg2;
            class76 var6;
            if (var5 != null && var5.method606(var4, 0, var4)) {
                var6 = var5;
                var5.method608((byte) -120);
            } else {
                var6 = new class76(this.field5880, var4, var4);
            }
            var6.method605(0, 0, 0, var4, var4);
            this.method2407(arg1, var6, arg0, (byte) -98);
            return var6;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lfk;[I)V", line = 491)
    public final void method378(class462 arg0, int[] arg1) {
        ++field5876;
        this.field5884.method2417(-126, new class22(this.field5880, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!si", name = "I", descriptor = "(II)I", line = 501)
    public final int method376(int arg0, int arg1) {
        ++field5874;
        return this.field5872[arg0][arg1];
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "()V", line = 511)
    public final void method362() {
        ++field5894;
        if (~this.field5903 >= -1) {
            this.field5861 = null;
        } else {
            byte[][] var1 = new byte[super.field673 + 1][super.field678 + 1];
            for (int var2 = 1; ~super.field673 < ~var2; ++var2) {
                for (int var103 = 1; ~super.field678 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5900[var2 + 1][var103] >> 3) + (this.field5900[var2][var103 - -1] >> 3) + (this.field5900[var2][var103 + -1] >> 2) + (this.field5900[var2 + -1][var103] >> 2) + (this.field5900[var2][var103] >> 1));
                }
            }
            this.field5898 = new class219[this.field5902.method169(0)];
            this.field5902.method161(false, this.field5898);
            for (int var3 = 0; ~var3 > ~this.field5898.length; ++var3) {
                this.field5898[var3].method1464(this.field5903, (byte) -78);
            }
            int var4 = 24;
            if (this.field5866 != null) {
                var4 += 4;
            }
            if (~(this.field5875 & 7) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field5880.field4496.method2636(this.field5903 * var4);
            NativeStream var6 = new NativeStream(var5);
            class219[] var7 = new class219[this.field5903];
            int var8 = class338.method2165(this.field5903 / 4, 1006);
            if (var8 < 1) {
                var8 = 1;
            }
            class20 var9 = new class20(var8);
            class219[] var10 = new class219[this.field5908];
            for (int var11 = 0; ~super.field673 < ~var11; ++var11) {
                for (int var30 = 0; super.field678 > var30; ++var30) {
                    if (this.field5885[var11][var30] != null) {
                        class219[] var31 = this.field5890[var11][var30];
                        int[] var32 = this.field5882[var11][var30];
                        int[] var33 = this.field5895[var11][var30];
                        int[] var34 = this.field5877[var11][var30];
                        int[] var35 = this.field5885[var11][var30];
                        int[] var36 = this.field5886 != null ? this.field5886[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field5866 == null ? null : this.field5866[var11][var30];
                        float var38 = this.field5899[var11][var30];
                        float var39 = this.field5907[var11][var30];
                        float var40 = this.field5897[var11][var30];
                        float var41 = this.field5899[var11][var30 + 1];
                        float var42 = this.field5907[var11][var30 + 1];
                        float var43 = this.field5897[var11][var30 + 1];
                        float var44 = this.field5899[var11 + 1][var30 + 1];
                        float var45 = this.field5907[var11 + 1][var30 + 1];
                        float var46 = this.field5897[var11 + 1][var30 + 1];
                        float var47 = this.field5899[var11 + 1][var30];
                        float var48 = this.field5907[var11 - -1][var30];
                        float var49 = this.field5897[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 + 1][var30 - -1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label340: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class219 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5889[super.field673 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field679) - -var32[var57];
                            int var59 = (var30 << super.field679) - -var33[var57];
                            int var60 = var58 >> this.field5868;
                            int var61 = var59 >> this.field5868;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && ~var68 == -1) {
                                var72 = var69 - var50;
                                var73 = var39;
                                var74 = var40;
                                var75 = var38;
                            } else if (var67 == 0 && super.field676 == var68) {
                                var74 = var43;
                                var73 = var42;
                                var75 = var41;
                                var72 = var69 - var51;
                            } else if (~super.field676 == ~var67 && ~super.field676 == ~var68) {
                                var73 = var45;
                                var75 = var44;
                                var72 = var69 - var52;
                                var74 = var46;
                            } else if (~super.field676 == ~var67 && ~var68 == -1) {
                                var74 = var49;
                                var73 = var48;
                                var72 = var69 - var53;
                                var75 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field676;
                                float var77 = (float) var68 / (float) super.field676;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var73 = (-var79 + var82) * var77 + var79;
                                var75 = (-var78 + var81) * var77 + var78;
                                float var83 = (var46 - var43) * var76 + var43;
                                var74 = (var83 - var80) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field679) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field679) + var51;
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field679) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (var86 >= 2) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(7 & this.field5875) == -1) {
                                    float var87 = this.field5880.field4527[2] * var74 + this.field5880.field4527[1] * var73 + this.field5880.field4527[0] * var75;
                                    var71 = this.field5880.field4545 + (!(var87 > 0.0F) ? this.field5880.field4633 : this.field5880.field4547) * var87;
                                }
                                var70 = class441.field6587[var62 & 65408 | var86];
                            }
                            class320 var88 = null;
                            if ((var58 & this.field5879 + -1) == 0 && (this.field5879 + -1 & var59) == 0) {
                                var88 = var9.method171((byte) -119, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class420) var88).field6282;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var89].field4904 > var31[var57].field4904) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (127 & var63) * var72 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var91 = class441.field6587[var90 | var63 & 65408];
                                    if ((7 & this.field5875) == 0) {
                                        float var92 = this.field5880.field4527[2] * var74 + this.field5880.field4527[1] * var73 + this.field5880.field4527[0] * var75;
                                        float var93 = var71 * (var71 > 0.0F ? this.field5880.field4547 : this.field5880.field4633) + this.field5880.field4545;
                                        int var94 = (16739905 & var91) >> 16;
                                        int var95 = var91 >> 8 & 255;
                                        int var96 = 255 & var91;
                                        int var97 = (int) ((float) var94 * var93);
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        var91 = var99 | var98 << 8 | var97 << 16;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field5880.field4599) {
                                    var6.method2633((float) var58);
                                    var6.method2633((float) (this.method371(var58, var59) + var64));
                                    var6.method2633((float) var59);
                                    var6.method2631((byte) (var91 >> 16));
                                    var6.method2631((byte) (var91 >> 8));
                                    var6.method2631((byte) var91);
                                    var6.method2631(-1);
                                    var6.method2633((float) var58);
                                    var6.method2633((float) var59);
                                    if (this.field5866 != null) {
                                        var6.method2633((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field5875) != 0) {
                                        var6.method2633(var75);
                                        var6.method2633(var73);
                                        var6.method2633(var74);
                                    }
                                } else {
                                    var6.method2635((float) var58);
                                    var6.method2635((float) (var64 + this.method371(var58, var59)));
                                    var6.method2635((float) var59);
                                    var6.method2631((byte) (var91 >> 16));
                                    var6.method2631((byte) (var91 >> 8));
                                    var6.method2631((byte) var91);
                                    var6.method2631(-1);
                                    var6.method2635((float) var58);
                                    var6.method2635((float) var59);
                                    if (this.field5866 != null) {
                                        var6.method2635((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field5875) != -1) {
                                        var6.method2635(var75);
                                        var6.method2635(var73);
                                        var6.method2635(var74);
                                    }
                                }
                                var89 = this.field5878++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method166(new class420(var56[var57]), var65, -97);
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1459(var71, var72, (byte) -22, var89, var70);
                            }
                            ++this.field5891;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field5878 < ~var12; ++var12) {
                class219 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1465(-1, var12);
                }
            }
            for (int var13 = 0; var13 < super.field673; ++var13) {
                for (int var18 = 0; super.field678 > var18; ++var18) {
                    short[] var19 = this.field5889[super.field673 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class219 var25 = var7[var22];
                            class219 var26 = var7[var23];
                            class219 var27 = var7[var24];
                            class219 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1466(var13, var18, var20, (byte) 51);
                            }
                            if (var26 != null) {
                                var26.method1466(var13, var18, var20, (byte) -121);
                                if (var28 == null || var28.field4904 > var26.field4904) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1466(var13, var18, var20, (byte) 13);
                                if (var28 == null || var28.field4904 > var27.field4904) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1465(-1, var22);
                                }
                                if (var26 != null) {
                                    var28.method1465(-1, var23);
                                }
                                if (var27 != null) {
                                    var28.method1465(-1, var24);
                                }
                                var28.method1466(var13, var18, var20, (byte) 116);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2630();
            this.field5905 = this.field5880.method1957(var6.method2632(), 25630, false, var5, var4);
            this.field5904 = new class184(this.field5905, 5126, 3, 0);
            this.field5909 = new class184(this.field5905, 5121, 4, 12);
            byte var14;
            if (this.field5866 == null) {
                var14 = 24;
                this.field5901 = new class184(this.field5905, 5126, 2, 16);
            } else {
                var14 = 28;
                this.field5901 = new class184(this.field5905, 5126, 3, 16);
            }
            if ((this.field5875 & 7) != 0) {
                this.field5906 = new class184(this.field5905, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5898.length];
            for (int var16 = 0; this.field5898.length > var16; ++var16) {
                class219 var17 = this.field5898[var16];
                var15[var16] = var17.field4904;
                var17.method1460(this.field5878, (byte) 74);
            }
            class104.method784(var15, this.field5898, 0);
            if (this.field5861 != null) {
                this.field5861.method2009(128);
            }
        }
        this.field5886 = null;
        this.field5877 = null;
        this.field5885 = null;
        this.field5890 = null;
        this.field5866 = null;
        this.field5902 = null;
        this.field5882 = this.field5895 = null;
        this.field5899 = this.field5907 = this.field5897 = null;
        this.field5900 = null;
    }

    @OriginalMember(owner = "client!si", name = "QA", descriptor = "(III)V", line = 1085)
    public final void method373(int arg0, int arg1, int arg2) {
        ++field5860;
        if ((this.field5900[arg0][arg1] & 255) < arg2) {
            this.field5900[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!si", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1096)
    public final void method370(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field5866 == null) {
            this.field5866 = new int[super.field673][super.field678][];
        }
        ++field5864;
        if (arg3 != null && this.field5886 == null) {
            this.field5886 = new int[super.field673][super.field678][];
        }
        this.field5882[arg0][arg1] = arg2;
        this.field5895[arg0][arg1] = arg4;
        this.field5885[arg0][arg1] = arg6;
        this.field5877[arg0][arg1] = arg7;
        if (this.field5866 != null) {
            this.field5866[arg0][arg1] = arg5;
        }
        if (this.field5886 != null) {
            this.field5886[arg0][arg1] = arg3;
        }
        class219[] var15 = this.field5890[arg0][arg1] = new class219[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
            class320 var19;
            for (var19 = this.field5902.method171((byte) -97, var17); var19 != null; var19 = this.field5902.method165((byte) -125)) {
                class219 var20 = (class219) var19;
                if (~arg8[var16] == ~var20.field3136 && (float) arg9[var16] == var20.field3151 && ~var20.field3149 == ~arg10 && var20.field3155 == arg11 && var20.field3140 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class219(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5902.method166(var15[var16], var17, 80);
            } else {
                var15[var16] = (class219) var19;
            }
        }
        if (arg13) {
            this.field5870[arg0][arg1] = (byte) class121.method909(this.field5870[arg0][arg1], 1);
        }
        if (this.field5908 < arg6.length) {
            this.field5908 = arg6.length;
        }
        this.field5903 += arg6.length;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([[ZIIBIZI)V", line = 1164)
    private final void method2408(boolean[][] arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 != 77) {
            this.method364((class377) null, 46, 67, 126, 121, false);
        }
        ++field5865;
        if (this.field5898 != null) {
            float var8 = this.field5880.field4518;
            float var9 = this.field5880.field4580;
            int var10 = arg2 - -arg2 + 1;
            int var11 = var10 * var10;
            if (~class364.field5516.length > ~var11) {
                class364.field5516 = new int[var11];
            }
            if (class494.field7307.field2270.length < this.field5891 * 2) {
                class494.field7307 = new class145(this.field5891 * 2);
            }
            int var12 = arg1 - arg2;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg2 + arg4;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg1 - -arg2;
            if (var16 > super.field673 - 1) {
                var16 = super.field673 + -1;
            }
            int var17 = arg4 - -arg2;
            class81.field1421 = 0;
            if (~var17 < ~(super.field678 + -1)) {
                var17 = super.field678 + -1;
            }
            for (int var18 = var12; var18 <= var16; ++var18) {
                boolean[] var24 = arg0[-var13 + var18];
                for (int var25 = var14; var25 <= var17; ++var25) {
                    if (var24[-var15 + var25]) {
                        class364.field5516[class81.field1421++] = super.field673 * var25 + var18;
                    }
                }
            }
            if (arg6 != -1) {
                this.field5880.method1940(108, (float) arg6);
                this.field5880.method1958(arg3 ^ 9037);
            } else {
                this.field5880.method1987(87);
            }
            this.field5880.method1941(~(this.field5875 & 7) != -1, 21282);
            for (int var19 = 0; ~this.field5898.length < ~var19; ++var19) {
                this.field5898[var19].method1462(class364.field5516, class81.field1421, arg3 ^ -27136);
            }
            if (!this.field5884.method2430(arg3 + -78)) {
                int var20 = this.field5880.field4588;
                int var21 = this.field5880.field4531;
                this.field5880.method243(0, var21, this.field5880.field4618);
                this.field5880.method300(var9, var8 + -4.0F);
                this.field5880.method1941(false, arg3 + 21205);
                this.field5880.method1984(95, false);
                this.field5880.method1934(128, true);
                this.field5880.method1970(7, -2);
                this.field5880.method1990(this.field5880.field4516, 11864);
                this.field5880.method1951((byte) -39, 8448, 7681);
                this.field5880.method1921(770, 34166, (byte) 31, 0);
                this.field5880.method1952(770, 34167, arg3 ^ 52, 0);
                for (class320 var22 = this.field5884.method2427(111); var22 != null; var22 = this.field5884.method2422(-120)) {
                    class22 var23 = (class22) var22;
                    var23.method185(arg0, arg1, 27964, arg2, arg4);
                }
                this.field5880.method1921(768, 5890, (byte) -116, 0);
                this.field5880.method1952(770, 5890, 127, 0);
                this.field5880.method1990((class492) null, 11864);
                this.field5880.method243(var20, var21, this.field5880.field4618);
            }
            if (this.field5861 != null) {
                this.field5880.method300(var9, var8 + -8.0F);
                this.field5880.method1987(40);
                this.field5880.method1982((class184) null, this.field5901, this.field5904, (class184) null, 102);
                this.field5861.method2006(arg4, arg2, true, arg5, arg0, arg1);
            }
            this.field5880.method300(var9, var8);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lpl;)V", line = 1312)
    public static final void method2409(class459 arg0) {
        if (class161.field2494 < 65535) {
            class462 var1 = arg0.field6877;
            class448.field6723[class161.field2494] = arg0;
            class54.field940[class161.field2494] = false;
            ++class161.field2494;
            int var2 = arg0.field6871;
            if (arg0.field6870) {
                var2 = 0;
            }
            int var3 = arg0.field6871;
            if (arg0.field6868) {
                var3 = class190.field2830 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method2744(-254) - var1.method2749((byte) -91) + class130.field2075 >> class426.field6345;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method2744(-254) + var1.method2749((byte) -94) - class130.field2075 >> class426.field6345;
                if (var7 >= class261.field3792) {
                    var7 = class261.field3792 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field6869[var5++];
                    int var10 = (var1.method2752(-25273) - var1.method2749((byte) -63) + class130.field2075 >> class426.field6345) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class151.field2408) {
                        var11 = class151.field2408 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class217.field3128[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class217.field3128[var4][var12][var8] = var13 | (long) class161.field2494;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class217.field3128[var4][var12][var8] = var13 | (long) class161.field2494 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class217.field3128[var4][var12][var8] = var13 | (long) class161.field2494 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class217.field3128[var4][var12][var8] = var13 | (long) class161.field2494 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "SA", descriptor = "(Lj;IIIIZ)V", line = 1406)
    public final void method364(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5893;
        if (this.field5861 != null && arg0 != null) {
            int var7 = -(this.field5880.field4567 * arg2 >> 8) + arg1 >> this.field5880.field4492;
            int var8 = arg3 - (this.field5880.field4591 * arg2 >> 8) >> this.field5880.field4492;
            this.field5861.method2008(0, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V", line = 1423)
    public static final void method2410(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~(-arg4 + arg1) <= ~class315.field4754 && ~(arg1 + arg4) >= ~class156.field2455 && ~class70.field1213 >= ~(-arg4 + arg0) && ~(arg0 + arg4) >= ~class389.field5859) {
            class451.method2689(arg1, arg4, arg2, arg0, (byte) -118);
        } else {
            class182.method1280(arg4, arg1, arg2, true, arg0);
        }
        ++field5888;
        if (arg3 != 5126) {
            method2411((byte) -64, -119);
        }
    }

    @OriginalMember(owner = "client!si", name = "va", descriptor = "(II)I", line = 1441)
    public final int method371(int arg0, int arg1) {
        ++field5863;
        int var3 = arg0 >> super.field679;
        int var4 = arg1 >> super.field679;
        if (~var3 <= -1 && ~var4 <= -1 && ~var3 >= ~(super.field673 + -1) && ~var4 >= ~(super.field678 + -1)) {
            int var5 = arg0 & super.field676 + -1;
            int var6 = arg1 & super.field676 - 1;
            int var7 = (super.field676 - var5) * this.field5872[var3][var4] - -(this.field5872[var3 - -1][var4] * var5) >> super.field679;
            int var8 = (super.field676 - var5) * this.field5872[var3][var4 + 1] + this.field5872[var3 - -1][var4 + 1] * var5 >> super.field679;
            return (-var6 + super.field676) * var7 + var6 * var8 >> super.field679;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V", line = 1466)
    public static final void method2411(byte arg0, int arg1) {
        if (arg0 == 124) {
            ++field5887;
            class334.field5045 = arg1;
            class6.field130.method488(-3);
        }
    }
}
