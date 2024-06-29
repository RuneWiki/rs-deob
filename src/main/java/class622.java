import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class622 extends class751 {

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "Ltf;")
    private class524 field8857 = new class524();

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Lml;")
    public class194 field8892;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    private int field8877;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[[[I")
    public int[][][] field8869;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "[[B")
    private byte[][] field8901;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    private int field8861;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "[[[I")
    private int[][][] field8878;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[[B")
    private byte[][] field8865;

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "[[F")
    private float[][] field8900;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "[[S")
    public short[][] field8872;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    public int field8889;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "[[F")
    private float[][] field8899;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "[[F")
    private float[][] field8905;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "[[[I")
    private int[][][] field8885;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "[[[I")
    public int[][][] field8856;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[[[I")
    public int[][][] field8864;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[[[Lki;")
    private class356[][][] field8871;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "Ldfa;")
    private class477 field8897;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Lko;")
    private class1 field8868;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field8907 = new String[] { method4576(method4575("cE\u0016U")), method4576(method4575("|TT~X")), method4576(method4575("v\u001eT\u0017\r")), method4576(method4575("|TT}X")), method4576(method4575("|TTvX")), method4576(method4575("|TTN\u0011%")), method4576(method4575("|TTwX")), method4576(method4575("|TTsX")), method4576(method4575("|TT`1%")), method4576(method4575("|TT\u0005\u0019cY\u000e\u0007X")), method4576(method4575("|TT\u007fX")), method4576(method4575("|TTtX")), method4576(method4575("|TT|X")), method4576(method4575("|TT_\u0011%")), method4576(method4575("|TTxX")), method4576(method4575("|TTzX")), method4576(method4575("|TT{X")), method4576(method4575("|TTpX")), method4576(method4575("|TTlX")), method4576(method4575("|TTz1%")), method4576(method4575("|TTR\u0011%")) };

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Lsb;")
    public static class261 field8860 = new class261(36, 10);

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "F")
    public static float field8884;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
    private int field8873;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    private int field8882;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    private int field8895;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    private int field8903;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lso;")
    public class316 field8896;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lso;")
    public class316 field8902;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Lso;")
    public class316 field8904;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lso;")
    private class316 field8906;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "Llga;")
    public static class47 field8890;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Laj;")
    private class94 field8898;

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "[Lki;")
    private class356[] field8894;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "[[[I")
    private int[][][] field8870;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 3)
    public static void method4570(int arg0) {
        try {
            if (arg0 != 1) {
                method4571(66);
            }
            field8860 = null;
            field8890 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8907[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "ka", descriptor = "(III)V", line = 15)
    public final void method2478(int arg0, int arg1, int arg2) {
        try {
            if (~arg2 < ~(255 & this.field8901[arg0][arg1])) {
                this.field8901[arg0][arg1] = (byte) arg2;
            }
            ++field8876;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8907[20] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 27)
    public static final void method4571(int arg0) {
        try {
            class217.method1837();
            ++field8866;
            for (int var1 = arg0; var1 < 4; ++var1) {
                class195.field2919[var1].method2432(true);
            }
            class489.method3764(-15640);
            class731.method5323(-4245);
            class353.method2822(100);
            System.gc();
            class236.field3418.method225();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8907[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lml;IIII[[I[[II)V", line = 49)
    public class622(class194 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        try {
            this.field8892 = arg0;
            this.field8877 = super.field10692 - 2;
            this.field8869 = new int[arg3][arg4][];
            this.field8901 = new byte[arg3 + 1][arg4 - -1];
            this.field8861 = 1 << this.field8877;
            this.field8878 = new int[arg3][arg4][];
            this.field8865 = new byte[arg3][arg4];
            this.field8900 = new float[super.field10701 + 1][super.field10703 + 1];
            this.field8872 = new short[arg3 * arg4][];
            this.field8889 = arg2;
            this.field8899 = new float[super.field10701 + 1][super.field10703 + 1];
            this.field8905 = new float[super.field10701 + 1][super.field10703 - -1];
            this.field8885 = new int[arg3][arg4][];
            this.field8856 = new int[arg3][arg4][];
            this.field8864 = new int[arg3][arg4][];
            this.field8871 = new class356[arg3][arg4][];
            for (int var9 = 1; var9 < super.field10703; ++var9) {
                for (int var10 = 1; ~super.field10701 < ~var10; ++var10) {
                    int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                    int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + var11 * var11 - -(var12 * var12))));
                    this.field8905[var10][var9] = (float) var11 * var13;
                    this.field8900[var10][var9] = (float) (-arg7 * 2) * var13;
                    this.field8899[var10][var9] = (float) var12 * var13;
                }
            }
            this.field8897 = new class477(128);
            if ((16 & this.field8889) != 0) {
                this.field8868 = new class1(this.field8892, this);
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field8907[9] + (arg0 != null ? field8907[2] : field8907[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8907[2] : field8907[0]) + ',' + (arg6 != null ? field8907[2] : field8907[0]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 111)
    public final void method2474(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        try {
            ++field8881;
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
            for (int var28 = 0; ~var28 > ~var18; ++var28) {
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
            this.method2480(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
        } catch (RuntimeException var33) {
            throw class665.method4799(var33, field8907[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8907[2] : field8907[0]) + ',' + (arg3 != null ? field8907[2] : field8907[0]) + ',' + (arg4 != null ? field8907[2] : field8907[0]) + ',' + (arg5 != null ? field8907[2] : field8907[0]) + ',' + (arg6 != null ? field8907[2] : field8907[0]) + ',' + (arg7 != null ? field8907[2] : field8907[0]) + ',' + (arg8 != null ? field8907[2] : field8907[0]) + ',' + (arg9 != null ? field8907[2] : field8907[0]) + ',' + (arg10 != null ? field8907[2] : field8907[0]) + ',' + (arg11 != null ? field8907[2] : field8907[0]) + ',' + (arg12 != null ? field8907[2] : field8907[0]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 202)
    public final void method2479(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field8893;
            if (this.field8868 != null && arg0 != null) {
                int var7 = arg1 - (this.field8892.field2903 * arg2 >> 8) >> this.field8892.field2760;
                int var8 = -(this.field8892.field2843 * arg2 >> 8) + arg3 >> this.field8892.field2760;
                this.field8868.method2(arg0, var7, false, var8);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8907[19] + (arg0 != null ? field8907[2] : field8907[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 219)
    public final void method2470(int arg0, int arg1) {
        try {
            ++field8875;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8907[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 232)
    public final void method2480(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        try {
            ++field8874;
            class673 var15 = this.field8892.field237;
            if (arg5 != null && this.field8870 == null) {
                this.field8870 = new int[super.field10701][super.field10703][];
            }
            if (arg3 != null && this.field8885 == null) {
                this.field8885 = new int[super.field10701][super.field10703][];
            }
            this.field8864[arg0][arg1] = arg2;
            this.field8869[arg0][arg1] = arg4;
            this.field8856[arg0][arg1] = arg6;
            this.field8878[arg0][arg1] = arg7;
            if (this.field8870 != null) {
                this.field8870[arg0][arg1] = arg5;
            }
            if (this.field8885 != null) {
                this.field8885[arg0][arg1] = arg3;
            }
            class356[] var16 = this.field8871[arg0][arg1] = new class356[arg6.length];
            for (int var17 = 0; var17 < arg6.length; ++var17) {
                int var18 = arg8[var17];
                int var19 = arg9[var17];
                if (~(this.field8889 & 32) != -1 && ~var18 != 0 && var15.method4500(-23641, var18).field9583) {
                    var19 = 128;
                    var18 = -1;
                }
                long var20 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (var19 << 14) | (long) var18;
                class578 var22;
                for (var22 = this.field8897.method3693(false, var20); var22 != null; var22 = this.field8897.method3699(-1)) {
                    class356 var23 = (class356) var22;
                    if (var23.field5184 == var18 && (float) var19 == var23.field5174 && var23.field5175 == arg10 && ~var23.field5177 == ~arg11 && ~var23.field5180 == ~arg12) {
                        break;
                    }
                }
                if (var22 != null) {
                    var16[var17] = (class356) var22;
                } else {
                    var16[var17] = new class356(this, var18, var19, arg10, arg11, arg12);
                    this.field8897.method3691(var16[var17], var20, -1);
                }
            }
            if (arg13) {
                this.field8865[arg0][arg1] = (byte) class10.method71(this.field8865[arg0][arg1], 1);
            }
            if (this.field8903 < arg6.length) {
                this.field8903 = arg6.length;
            }
            this.field8895 += arg6.length;
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field8907[18] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8907[2] : field8907[0]) + ',' + (arg3 != null ? field8907[2] : field8907[0]) + ',' + (arg4 != null ? field8907[2] : field8907[0]) + ',' + (arg5 != null ? field8907[2] : field8907[0]) + ',' + (arg6 != null ? field8907[2] : field8907[0]) + ',' + (arg7 != null ? field8907[2] : field8907[0]) + ',' + (arg8 != null ? field8907[2] : field8907[0]) + ',' + (arg9 != null ? field8907[2] : field8907[0]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[[ZZII)V", line = 311)
    public final void method2471(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        try {
            this.method4574(arg0, arg4, arg5, arg3, arg1, arg6, false, arg2);
            ++field8859;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field8907[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8907[2] : field8907[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 319)
    public static final void method4572(boolean arg0) {
        try {
            if (class482.field7094 == null) {
                if (~class466.field6807 == 0) {
                    class161.method1365(class337.field4888, (byte) 97, class304.field4234, class139.field1812);
                } else {
                    class18.method192(1, class139.field1812);
                }
            } else {
                class172.method1452(false, class139.field1812);
            }
            ++field8891;
            if (arg0) {
                field8884 = 0.05484147F;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8907[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 338)
    public final boolean method2473(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field8879;
            if (this.field8868 != null && arg0 != null) {
                int var7 = -(this.field8892.field2903 * arg2 >> 8) + arg1 >> this.field8892.field2760;
                int var8 = arg3 - (this.field8892.field2843 * arg2 >> 8) >> this.field8892.field2760;
                return this.field8868.method9(8, arg0, var7, var8);
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8907[14] + (arg0 != null ? field8907[2] : field8907[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[[ZZI)V", line = 356)
    public final void method2476(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        try {
            ++field8887;
            this.method4574(arg0, arg4, -1, arg3, arg1, arg5, false, arg2);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8907[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8907[2] : field8907[0]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lta;[I)V", line = 367)
    public final void method2481(class330 arg0, int[] arg1) {
        try {
            this.field8857.method3984(new class247(this.field8892, this, arg0, arg1), 0);
            ++field8880;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8907[12] + (arg0 != null ? field8907[2] : field8907[0]) + ',' + (arg1 != null ? field8907[2] : field8907[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "YA", descriptor = "()V", line = 379)
    public final void method2469() {
        try {
            ++field8863;
            if (~this.field8895 < -1) {
                byte[][] var1 = new byte[super.field10701 + 1][super.field10703 + 1];
                for (int var2 = 1; ~super.field10701 < ~var2; ++var2) {
                    for (int var3 = 1; ~super.field10703 < ~var3; ++var3) {
                        var1[var2][var3] = (byte) ((this.field8901[var2][var3] >> 1) + (this.field8901[var2][var3 + -1] >> 2) + (this.field8901[var2 + 1][var3] >> 3) + (this.field8901[var2][var3 + 1] >> 3) + (this.field8901[var2 - 1][var3] >> 2));
                    }
                }
                this.field8894 = new class356[this.field8897.method3692(21538)];
                this.field8897.method3694((byte) -112, this.field8894);
                for (int var4 = 0; this.field8894.length > var4; ++var4) {
                    this.field8894[var4].method2851(83, this.field8895);
                }
                int var5 = 24;
                if (this.field8870 != null) {
                    var5 += 4;
                }
                if (~(7 & this.field8889) != -1) {
                    var5 += 12;
                }
                NativeHeapBuffer var6 = this.field8892.field2761.method3189(this.field8895 * var5, false);
                Stream var7 = new Stream(var6);
                class356[] var8 = new class356[this.field8895];
                int var9 = class482.method3720((byte) 100, this.field8895 / 4);
                if (~var9 > -2) {
                    var9 = 1;
                }
                class477 var10 = new class477(var9);
                class356[] var11 = new class356[this.field8903];
                for (int var12 = 0; var12 < super.field10701; ++var12) {
                    for (int var13 = 0; ~var13 > ~super.field10703; ++var13) {
                        if (this.field8856[var12][var13] != null) {
                            class356[] var14 = this.field8871[var12][var13];
                            int[] var15 = this.field8864[var12][var13];
                            int[] var16 = this.field8869[var12][var13];
                            int[] var17 = this.field8878[var12][var13];
                            int[] var18 = this.field8856[var12][var13];
                            int[] var19 = this.field8885 != null ? this.field8885[var12][var13] : null;
                            if (var17 == null) {
                                var17 = var18;
                            }
                            int[] var20 = this.field8870 == null ? null : this.field8870[var12][var13];
                            float var21 = this.field8905[var12][var13];
                            float var22 = this.field8900[var12][var13];
                            float var23 = this.field8899[var12][var13];
                            float var24 = this.field8905[var12][var13 + 1];
                            float var25 = this.field8900[var12][var13 - -1];
                            float var26 = this.field8899[var12][var13 - -1];
                            float var27 = this.field8905[var12 - -1][var13 + 1];
                            float var28 = this.field8900[var12 + 1][var13 + 1];
                            float var29 = this.field8899[var12 - -1][var13 + 1];
                            float var30 = this.field8905[var12 + 1][var13];
                            float var31 = this.field8900[var12 + 1][var13];
                            float var32 = this.field8899[var12 - -1][var13];
                            int var33 = var1[var12][var13] & 255;
                            int var34 = 255 & var1[var12][var13 + 1];
                            int var35 = var1[var12 - -1][var13 + 1] & 255;
                            int var36 = var1[var12 + 1][var13] & 255;
                            int var37 = 0;
                            label380: for (int var38 = 0; ~var18.length < ~var38; ++var38) {
                                class356 var39 = var14[var38];
                                for (int var40 = 0; var40 < var37; ++var40) {
                                    if (var11[var40] == var39) {
                                        continue label380;
                                    }
                                }
                                var11[var37++] = var39;
                            }
                            short[] var41 = this.field8872[super.field10701 * var13 + var12] = new short[var18.length];
                            for (int var42 = 0; ~var42 > ~var18.length; ++var42) {
                                int var43 = (var12 << super.field10692) - -var15[var42];
                                int var44 = (var13 << super.field10692) + var16[var42];
                                int var45 = var43 >> this.field8877;
                                int var46 = var44 >> this.field8877;
                                int var47 = var18[var42];
                                int var48 = var17[var42];
                                int var49 = var19 == null ? 0 : var19[var42];
                                long var50 = (long) var47 << 32 | (long) var48 << 48 | (long) (var45 << 16) | (long) var46;
                                int var52 = var15[var42];
                                int var53 = var16[var42];
                                byte var54 = 74;
                                int var55 = 0;
                                float var56 = 1.0F;
                                int var57;
                                float var58;
                                float var59;
                                float var60;
                                if (~var52 == -1 && ~var53 == -1) {
                                    var57 = var54 - var33;
                                    var58 = var22;
                                    var59 = var23;
                                    var60 = var21;
                                } else if (~var52 == -1 && ~super.field10690 == ~var53) {
                                    var58 = var25;
                                    var57 = var54 - var34;
                                    var59 = var26;
                                    var60 = var24;
                                } else if (~super.field10690 == ~var52 && ~super.field10690 == ~var53) {
                                    var60 = var27;
                                    var58 = var28;
                                    var57 = var54 - var35;
                                    var59 = var29;
                                } else if (~super.field10690 == ~var52 && var53 == 0) {
                                    var60 = var30;
                                    var57 = var54 - var36;
                                    var59 = var32;
                                    var58 = var31;
                                } else {
                                    float var61 = (float) var52 / (float) super.field10690;
                                    float var62 = (float) var53 / (float) super.field10690;
                                    float var63 = (-var21 + var30) * var61 + var21;
                                    float var64 = (var31 - var22) * var61 + var22;
                                    float var65 = (-var23 + var32) * var61 + var23;
                                    float var66 = (-var24 + var27) * var61 + var24;
                                    float var67 = (var28 - var25) * var61 + var25;
                                    float var68 = (var29 - var26) * var61 + var26;
                                    var60 = (var66 - var63) * var62 + var63;
                                    var58 = (var67 - var64) * var62 + var64;
                                    var59 = (var68 - var65) * var62 + var65;
                                    int var69 = ((var36 - var33) * var52 >> super.field10692) + var33;
                                    int var70 = ((var35 - var34) * var52 >> super.field10692) + var34;
                                    var57 = var54 - (var69 - -((-var69 + var70) * var53 >> super.field10692));
                                }
                                if (var47 != -1) {
                                    int var71 = (127 & var47) * var57 >> 7;
                                    if (var71 < 2) {
                                        var71 = 2;
                                    } else if (~var71 < -127) {
                                        var71 = 126;
                                    }
                                    if (~(7 & this.field8889) == -1) {
                                        float var72 = this.field8892.field2803[2] * var59 + this.field8892.field2803[1] * var58 + this.field8892.field2803[0] * var60;
                                        var56 = (!(var72 > 0.0F) ? this.field8892.field2817 : this.field8892.field2889) * var72 + this.field8892.field2893;
                                    }
                                    var55 = class360.field5233[65408 & var47 | var71];
                                }
                                class578 var73 = null;
                                if (~(this.field8861 + -1 & var43) == -1 && (this.field8861 + -1 & var44) == 0) {
                                    var73 = var10.method3693(false, var50);
                                }
                                int var84;
                                if (var73 == null) {
                                    int var75;
                                    if (~var47 != ~var48) {
                                        int var74 = (var48 & 127) * var57 >> 7;
                                        if (var74 >= 2) {
                                            if (var74 > 126) {
                                                var74 = 126;
                                            }
                                        } else {
                                            var74 = 2;
                                        }
                                        var75 = class360.field5233[var74 | 65408 & var48];
                                        if (~(this.field8889 & 7) == -1) {
                                            float var76 = this.field8892.field2803[2] * var59 + this.field8892.field2803[0] * var60 + this.field8892.field2803[1] * var58;
                                            float var77 = this.field8892.field2893 + (!(var56 > 0.0F) ? this.field8892.field2817 : this.field8892.field2889) * var56;
                                            int var78 = 255 & var75 >> 16;
                                            int var79 = (65391 & var75) >> 8;
                                            int var80 = 255 & var75;
                                            int var81 = (int) ((float) var78 * var77);
                                            if (~var81 <= -1) {
                                                if (~var81 < -256) {
                                                    var81 = 255;
                                                }
                                            } else {
                                                var81 = 0;
                                            }
                                            int var82 = (int) ((float) var79 * var77);
                                            if (~var82 <= -1) {
                                                if (var82 > 255) {
                                                    var82 = 255;
                                                }
                                            } else {
                                                var82 = 0;
                                            }
                                            int var83 = (int) ((float) var80 * var77);
                                            if (~var83 > -1) {
                                                var83 = 0;
                                            } else if (~var83 < -256) {
                                                var83 = 255;
                                            }
                                            var75 = var83 | var82 << 8 | var81 << 16;
                                        }
                                    } else {
                                        var75 = var55;
                                    }
                                    if (!this.field8892.field2842) {
                                        var7.method3206((float) var43);
                                        var7.method3206((float) (this.method5440((byte) 15, var43, var44) + var49));
                                        var7.method3206((float) var44);
                                        var7.method3203((byte) (var75 >> 16));
                                        var7.method3203((byte) (var75 >> 8));
                                        var7.method3203((byte) var75);
                                        var7.method3203(-1);
                                        var7.method3206((float) var43);
                                        var7.method3206((float) var44);
                                        if (this.field8870 != null) {
                                            var7.method3206((float) (var20 == null ? 0 : var20[var42] - 1));
                                        }
                                        if (~(7 & this.field8889) != -1) {
                                            var7.method3206(var60);
                                            var7.method3206(var58);
                                            var7.method3206(var59);
                                        }
                                    } else {
                                        var7.method3202((float) var43);
                                        var7.method3202((float) (var49 + this.method5440((byte) 15, var43, var44)));
                                        var7.method3202((float) var44);
                                        var7.method3203((byte) (var75 >> 16));
                                        var7.method3203((byte) (var75 >> 8));
                                        var7.method3203((byte) var75);
                                        var7.method3203(-1);
                                        var7.method3202((float) var43);
                                        var7.method3202((float) var44);
                                        if (this.field8870 != null) {
                                            var7.method3202((float) (var20 != null ? var20[var42] + -1 : 0));
                                        }
                                        if (~(this.field8889 & 7) != -1) {
                                            var7.method3202(var60);
                                            var7.method3202(var58);
                                            var7.method3202(var59);
                                        }
                                    }
                                    var84 = this.field8873++;
                                    var41[var42] = (short) var84;
                                    if (~var47 != 0) {
                                        var8[var84] = var14[var42];
                                    }
                                    var10.method3691(new class292(var41[var42]), var50, -1);
                                } else {
                                    var41[var42] = ((class292) var73).field4113;
                                    var84 = 65535 & var41[var42];
                                    if (var47 != -1 && var8[var84].field8378 > var14[var42].field8378) {
                                        var8[var84] = var14[var42];
                                    }
                                }
                                for (int var85 = 0; var37 > var85; ++var85) {
                                    var11[var85].method2852(var84, var56, var55, 1, var57);
                                }
                                ++this.field8882;
                            }
                        }
                    }
                }
                for (int var86 = 0; this.field8873 > var86; ++var86) {
                    class356 var87 = var8[var86];
                    if (var87 != null) {
                        var87.method2845(4, var86);
                    }
                }
                for (int var88 = 0; super.field10701 > var88; ++var88) {
                    for (int var89 = 0; super.field10703 > var89; ++var89) {
                        short[] var90 = this.field8872[super.field10701 * var89 + var88];
                        if (var90 != null) {
                            int var91 = 0;
                            int var92 = 0;
                            while (~var90.length < ~var92) {
                                int var93 = 65535 & var90[var92++];
                                int var94 = var90[var92++] & 65535;
                                int var95 = var90[var92++] & 65535;
                                class356 var96 = var8[var93];
                                class356 var97 = var8[var94];
                                class356 var98 = var8[var95];
                                class356 var99 = null;
                                if (var96 != null) {
                                    var99 = var96;
                                    var96.method2848(var91, -11745, var89, var88);
                                }
                                if (var97 != null) {
                                    var97.method2848(var91, -11745, var89, var88);
                                    if (var99 == null || ~var97.field8378 > ~var99.field8378) {
                                        var99 = var97;
                                    }
                                }
                                if (var98 != null) {
                                    var98.method2848(var91, -11745, var89, var88);
                                    if (var99 == null || ~var98.field8378 > ~var99.field8378) {
                                        var99 = var98;
                                    }
                                }
                                if (var99 != null) {
                                    if (var96 != null) {
                                        var99.method2845(4, var93);
                                    }
                                    if (var97 != null) {
                                        var99.method2845(4, var94);
                                    }
                                    if (var98 != null) {
                                        var99.method2845(4, var95);
                                    }
                                    var99.method2848(var91, -11745, var89, var88);
                                }
                                ++var91;
                            }
                        }
                    }
                }
                var7.method3199();
                this.field8898 = this.field8892.method1617(var7.method3193(), (byte) 51, var5, false, var6);
                this.field8902 = new class316(this.field8898, 5126, 3, 0);
                this.field8906 = new class316(this.field8898, 5121, 4, 12);
                byte var100;
                if (this.field8870 == null) {
                    this.field8896 = new class316(this.field8898, 5126, 2, 16);
                    var100 = 24;
                } else {
                    var100 = 28;
                    this.field8896 = new class316(this.field8898, 5126, 3, 16);
                }
                if ((this.field8889 & 7) != 0) {
                    this.field8904 = new class316(this.field8898, 5126, 3, var100);
                }
                long[] var101 = new long[this.field8894.length];
                for (int var102 = 0; this.field8894.length > var102; ++var102) {
                    class356 var103 = this.field8894[var102];
                    var101[var102] = var103.field8378;
                    var103.method2846(this.field8873, (byte) -100);
                }
                class518.method3946((byte) -87, this.field8894, var101);
                if (this.field8868 != null) {
                    this.field8868.method7(-124);
                }
            } else {
                this.field8868 = null;
            }
            this.field8870 = null;
            this.field8878 = null;
            this.field8856 = null;
            this.field8897 = null;
            this.field8885 = null;
            this.field8864 = this.field8869 = null;
            this.field8905 = this.field8900 = this.field8899 = null;
            this.field8901 = null;
            this.field8871 = null;
        } catch (RuntimeException var105) {
            throw class665.method4799(var105, field8907[8] + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILsc;I)V", line = 960)
    private final void method4573(int arg0, int arg1, class143 arg2, int arg3) {
        try {
            ++field8862;
            int[] var5 = this.field8864[arg3][arg1];
            int[] var6 = this.field8869[arg3][arg1];
            int var7 = var5.length;
            if (arg0 != -21125) {
                this.field8885 = null;
            }
            if (~this.field8892.field2907.length > ~var7) {
                this.field8892.field2908 = new int[var7];
                this.field8892.field2907 = new int[var7];
            }
            int[] var8 = this.field8892.field2907;
            int[] var9 = this.field8892.field2908;
            for (int var10 = 0; var10 < var7; ++var10) {
                var8[var10] = var5[var10] >> this.field8892.field2760;
                var9[var10] = var6[var10] >> this.field8892.field2760;
            }
            int var11 = 0;
            while (~var7 < ~var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if (~((-var14 + var12) * (-var17 + var15) + -((var15 - var13) * (-var14 + var16))) < -1) {
                    arg2.method1235(var12, var16, 1895170224, var15, var14, var13, var17);
                }
            }
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field8907[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8907[2] : field8907[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "fa", descriptor = "(IILr;)Lr;", line = 1023)
    public final class412 method2475(int arg0, int arg1, class412 arg2) {
        try {
            ++field8886;
            if ((1 & this.field8865[arg0][arg1]) == 0) {
                return null;
            } else {
                int var4 = super.field10690 >> this.field8892.field2760;
                class143 var5 = (class143) arg2;
                class143 var6;
                if (var5 != null && var5.method1238(var4, var4, (byte) 27)) {
                    var6 = var5;
                    var5.method1236((byte) -74);
                } else {
                    var6 = new class143(this.field8892, var4, var4);
                }
                var6.method1232(0, (byte) 5, var4, var4, 0);
                this.method4573(-21125, arg1, var6, arg0);
                return var6;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8907[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8907[2] : field8907[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI[[ZIIZI)V", line = 1062)
    private final void method4574(int arg0, boolean arg1, int arg2, boolean[][] arg3, int arg4, int arg5, boolean arg6, int arg7) {
        try {
            if (arg6) {
                this.method2472((class412) null, -24, -54, 95, 90, true);
            }
            if (this.field8894 != null) {
                int var9 = arg7 + 1 + arg7;
                int var10 = var9 * var9;
                if (var10 > this.field8892.field2909.length) {
                    this.field8892.field2909 = new int[var10];
                }
                if (~(this.field8882 * 2) < ~this.field8892.field2890.field9996.length) {
                    this.field8892.field2890 = new class318(this.field8882 * 2);
                }
                int var11 = -arg7 + arg0;
                int var12 = var11;
                if (var11 < 0) {
                    var11 = 0;
                }
                int var13 = -arg7 + arg4;
                int var14 = var13;
                if (var13 < 0) {
                    var13 = 0;
                }
                int var15 = arg0 + arg7;
                if (~(super.field10701 + -1) > ~var15) {
                    var15 = super.field10701 + -1;
                }
                int var16 = arg4 - -arg7;
                if (super.field10703 + -1 < var16) {
                    var16 = super.field10703 - 1;
                }
                int var17 = 0;
                int[] var18 = this.field8892.field2909;
                for (int var19 = var11; var19 <= var15; ++var19) {
                    boolean[] var20 = arg3[-var12 + var19];
                    for (int var21 = var13; ~var16 <= ~var21; ++var21) {
                        if (var20[-var14 + var21]) {
                            var18[var17++] = super.field10701 * var21 + var19;
                        }
                    }
                }
                if (arg2 == -1) {
                    this.field8892.method1636(1);
                } else {
                    this.field8892.method1652(-4, (float) arg2);
                    this.field8892.method1686(105);
                }
                this.field8892.method1684((this.field8889 & 7) != 0, (byte) -51);
                for (int var22 = 0; ~var22 > ~this.field8894.length; ++var22) {
                    this.field8894[var22].method2853(var17, 5888, var18);
                }
                if (!this.field8857.method3974(-22016)) {
                    int var23 = this.field8892.field2827;
                    int var24 = this.field8892.field2828;
                    this.field8892.method232(0, var24, this.field8892.field2869);
                    this.field8892.method1684(false, (byte) -28);
                    this.field8892.method1632(false, true);
                    this.field8892.method1670(128, (byte) 103);
                    this.field8892.method1625(117, -2);
                    this.field8892.method1618((byte) -87, this.field8892.field2833);
                    this.field8892.method1628(7681, 8448, 34162);
                    this.field8892.method1669(770, 0, 34166, (byte) -125);
                    this.field8892.method1650(0, (byte) -109, 770, 34167);
                    for (class578 var25 = this.field8857.method3977((byte) -88); var25 != null; var25 = this.field8857.method3987(0)) {
                        class247 var26 = (class247) var25;
                        var26.method2012(0, arg3, arg4, arg0, arg7);
                    }
                    this.field8892.method1669(768, 0, 5890, (byte) -109);
                    this.field8892.method1650(0, (byte) -109, 770, 5890);
                    this.field8892.method1618((byte) 5, (class469) null);
                    this.field8892.method232(var23, var24, this.field8892.field2869);
                }
                if (this.field8868 != null) {
                    OpenGL.glPushMatrix();
                    OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                    this.field8892.method1653(-3461, (class316) null, this.field8896, (class316) null, this.field8902);
                    this.field8868.method8(arg4, arg0, arg3, arg7, true, arg1);
                    OpenGL.glPopMatrix();
                }
            }
            ++field8883;
        } catch (RuntimeException var28) {
            throw class665.method4799(var28, field8907[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8907[2] : field8907[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1212)
    public final void method2472(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field8858;
            if (this.field8868 != null && arg0 != null) {
                int var7 = -(this.field8892.field2903 * arg2 >> 8) + arg1 >> this.field8892.field2760;
                int var8 = arg3 - (this.field8892.field2843 * arg2 >> 8) >> this.field8892.field2760;
                this.field8868.method5(0, var7, var8, arg0);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8907[5] + (arg0 != null ? field8907[2] : field8907[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1229)
    public final void method2477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        try {
            ++field8867;
            if (this.field8895 > 0) {
                this.field8892.method1616((byte) 61);
                this.field8892.method1673(8, false);
                this.field8892.method1684(false, (byte) -17);
                this.field8892.method1640(false, (byte) -65);
                this.field8892.method1632(false, true);
                this.field8892.method1670(0, (byte) 112);
                this.field8892.method1625(60, -2);
                this.field8892.method1618((byte) 2, (class469) null);
                class654.field9284[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field8892.field2737) + -1.0F;
                class654.field9284[7] = 0.0F;
                class654.field9284[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field8892.field2746;
                class654.field9284[10] = 0.0F;
                class654.field9284[15] = 1.0F;
                class654.field9284[4] = 0.0F;
                class654.field9284[14] = 0.0F;
                class654.field9284[8] = 0.0F;
                class654.field9284[9] = 0.0F;
                class654.field9284[11] = 0.0F;
                class654.field9284[3] = 0.0F;
                class654.field9284[6] = 0.0F;
                class654.field9284[5] = (float) arg2 / ((float) super.field10690 * 128.0F * (float) this.field8892.field2746);
                class654.field9284[1] = 0.0F;
                class654.field9284[0] = (float) arg2 / ((float) super.field10690 * 128.0F * (float) this.field8892.field2737);
                class654.field9284[2] = 0.0F;
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadMatrixf(class654.field9284, 0);
                class654.field9284[0] = 1.0F;
                class654.field9284[6] = 1.0F;
                class654.field9284[1] = 0.0F;
                class654.field9284[2] = 0.0F;
                class654.field9284[4] = 0.0F;
                class654.field9284[7] = 0.0F;
                class654.field9284[13] = 0.0F;
                class654.field9284[5] = 0.0F;
                class654.field9284[11] = 0.0F;
                class654.field9284[10] = 0.0F;
                class654.field9284[15] = 1.0F;
                class654.field9284[8] = 0.0F;
                class654.field9284[9] = 1.0F;
                class654.field9284[3] = 0.0F;
                class654.field9284[12] = 0.0F;
                class654.field9284[14] = 0.0F;
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadMatrixf(class654.field9284, 0);
                if ((7 & this.field8889) != 0) {
                    this.field8892.method1684(true, (byte) -127);
                    this.field8892.method1621(4611);
                } else {
                    this.field8892.method1684(false, (byte) -42);
                }
                this.field8892.method1653(-3461, this.field8906, this.field8896, this.field8904, this.field8902);
                if (~this.field8892.field2890.field9996.length <= ~(this.field8882 * 2)) {
                    this.field8892.field2890.field9945 = 0;
                } else {
                    this.field8892.field2890 = new class318(this.field8882 * 2);
                }
                int var9 = 0;
                class318 var10 = this.field8892.field2890;
                if (this.field8892.field2842) {
                    for (int var11 = arg4; arg6 > var11; ++var11) {
                        int var12 = super.field10701 * var11 + arg3;
                        for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                            if (arg7[-arg3 + var13][-arg4 + var11]) {
                                short[] var14 = this.field8872[var12];
                                if (var14 != null) {
                                    for (int var15 = 0; var15 < var14.length; ++var15) {
                                        var10.method5138((byte) -103, 65535 & var14[var15]);
                                        ++var9;
                                    }
                                }
                            }
                            ++var12;
                        }
                    }
                } else {
                    for (int var16 = arg4; var16 < arg6; ++var16) {
                        int var17 = super.field10701 * var16 + arg3;
                        for (int var18 = arg3; arg5 > var18; ++var18) {
                            if (arg7[-arg3 + var18][-arg4 + var16]) {
                                short[] var19 = this.field8872[var17];
                                if (var19 != null) {
                                    for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                        ++var9;
                                        var10.method5106(65535 & var19[var20], -94);
                                    }
                                }
                            }
                            ++var17;
                        }
                    }
                }
                if (var9 > 0) {
                    class526 var21 = new class526(this.field8892, 5123, var10.field9996, var10.field9945);
                    this.field8892.method1647(0, var9, var21, -127, 4);
                }
            }
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field8907[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field8907[2] : field8907[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4575(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 112);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4576(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 122;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
