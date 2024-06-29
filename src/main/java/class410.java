import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class410 extends class339 {

    @OriginalMember(owner = "client!mt", name = "S", descriptor = "Lmr;")
    private class611 field5850 = new class611();

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "Lkw;")
    public class346 field5819;

    @OriginalMember(owner = "client!mt", name = "O", descriptor = "I")
    private int field5846;

    @OriginalMember(owner = "client!mt", name = "db", descriptor = "[[F")
    private float[][] field5861;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "[[[I")
    private int[][][] field5839;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "[[[Lct;")
    private class99[][][] field5843;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public int field5828;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "[[[I")
    public int[][][] field5826;

    @OriginalMember(owner = "client!mt", name = "U", descriptor = "[[B")
    private byte[][] field5852;

    @OriginalMember(owner = "client!mt", name = "cb", descriptor = "[[F")
    private float[][] field5860;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "[[[I")
    public int[][][] field5820;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
    private int field5833;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "[[[I")
    public int[][][] field5821;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "[[S")
    public short[][] field5844;

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "[[B")
    private byte[][] field5834;

    @OriginalMember(owner = "client!mt", name = "W", descriptor = "[[F")
    private float[][] field5854;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "[[[I")
    private int[][][] field5841;

    @OriginalMember(owner = "client!mt", name = "T", descriptor = "Lqp;")
    private class715 field5851;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "Lcea;")
    private class93 field5838;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Z")
    public static boolean field5818 = false;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    private int field5825;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
    private int field5829;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!mt", name = "N", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!mt", name = "P", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!mt", name = "Q", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!mt", name = "R", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!mt", name = "X", descriptor = "I")
    private int field5855;

    @OriginalMember(owner = "client!mt", name = "fb", descriptor = "I")
    private int field5863;

    @OriginalMember(owner = "client!mt", name = "Y", descriptor = "Llca;")
    private class52 field5856;

    @OriginalMember(owner = "client!mt", name = "V", descriptor = "Ljaa;")
    public class745 field5853;

    @OriginalMember(owner = "client!mt", name = "Z", descriptor = "Ljaa;")
    private class745 field5857;

    @OriginalMember(owner = "client!mt", name = "ab", descriptor = "Ljaa;")
    public class745 field5858;

    @OriginalMember(owner = "client!mt", name = "eb", descriptor = "Ljaa;")
    public class745 field5862;

    @OriginalMember(owner = "client!mt", name = "bb", descriptor = "[Lct;")
    private class99[] field5859;

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "[[[I")
    private int[][][] field5837;

    @OriginalMember(owner = "client!mt", name = "fa", descriptor = "(IILr;)Lr;")
    public final class704 method53(int arg0, int arg1, class704 arg2) {
        ++field5827;
        if (~(1 & this.field5834[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field4675 >> this.field5819.field4970;
            class256 var5 = (class256) arg2;
            class256 var6;
            if (var5 != null && var5.method1703(93, var4, var4)) {
                var6 = var5;
                var5.method1704(false);
            } else {
                var6 = new class256(this.field5819, var4, var4);
            }
            var6.method1708((byte) -125, var4, 0, 0, var4);
            this.method2487(arg1, var6, 0, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mt", name = "ka", descriptor = "(III)V")
    public final void method41(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field5852[arg0][arg1] & 255)) {
            this.field5852[arg0][arg1] = (byte) arg2;
        }
        ++field5832;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5842;
        if (~this.field5855 < -1) {
            this.field5819.method2137(-64);
            this.field5819.method2190(true, false);
            this.field5819.method2142(false, (byte) -122);
            this.field5819.method2180((byte) -86, false);
            this.field5819.method2160(false, 114);
            this.field5819.method2138(27032, 0);
            this.field5819.method2176(-2, 94);
            this.field5819.method2164(6, (class158) null);
            class166.field2354[6] = 0.0F;
            class166.field2354[2] = 0.0F;
            class166.field2354[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5819.field4836;
            class166.field2354[15] = 1.0F;
            class166.field2354[1] = 0.0F;
            class166.field2354[9] = 0.0F;
            class166.field2354[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5819.field4763;
            class166.field2354[3] = 0.0F;
            class166.field2354[8] = 0.0F;
            class166.field2354[7] = 0.0F;
            class166.field2354[11] = 0.0F;
            class166.field2354[4] = 0.0F;
            class166.field2354[10] = 0.0F;
            class166.field2354[5] = (float) arg2 / ((float) super.field4675 * 128.0F * (float) this.field5819.field4763);
            class166.field2354[0] = (float) arg2 / ((float) super.field4675 * 128.0F * (float) this.field5819.field4836);
            class166.field2354[14] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class166.field2354, 0);
            class166.field2354[5] = 0.0F;
            class166.field2354[4] = 0.0F;
            class166.field2354[12] = 0.0F;
            class166.field2354[9] = 1.0F;
            class166.field2354[10] = 0.0F;
            class166.field2354[8] = 0.0F;
            class166.field2354[11] = 0.0F;
            class166.field2354[13] = 0.0F;
            class166.field2354[6] = 1.0F;
            class166.field2354[7] = 0.0F;
            class166.field2354[2] = 0.0F;
            class166.field2354[1] = 0.0F;
            class166.field2354[0] = 1.0F;
            class166.field2354[15] = 1.0F;
            class166.field2354[14] = 0.0F;
            class166.field2354[3] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class166.field2354, 0);
            if ((this.field5828 & 7) == 0) {
                this.field5819.method2142(false, (byte) -106);
            } else {
                this.field5819.method2142(true, (byte) -128);
                this.field5819.method2133(8343);
            }
            this.field5819.method2134(this.field5853, this.field5857, this.field5862, this.field5858, 32888);
            if (this.field5819.field5093.field6800.length < this.field5825 * 2) {
                this.field5819.field5093 = new class212(this.field5825 * 2);
            } else {
                this.field5819.field5093.field6864 = 0;
            }
            int var9 = 0;
            class212 var10 = this.field5819.field5093;
            if (!this.field5819.field5047) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field4679 * var11 - -arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field5844[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method2918(65535 & var14[var15], (byte) 70);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field4679 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field5844[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method2862(65535 & var20[var21], -1166933656);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class171 var17 = new class171(this.field5819, 5123, var10.field6800, var10.field6864);
                this.field5819.method2135(4, var17, 0, var9, 100);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method42(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5817;
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
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method39(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III[[ZZII)V")
    public final void method34(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method2488(arg3, arg0, arg4, arg2, arg5, -109, arg1, arg6);
        ++field5849;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lwh;[I)V")
    public final void method37(class40 arg0, int[] arg1) {
        this.field5850.method3559(new class122(this.field5819, this, arg0, arg1), (byte) 12);
        ++field5823;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III[[ZZI)V")
    public final void method46(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field5836;
        this.method2488(arg3, arg0, arg4, arg2, -1, -121, arg1, arg5);
    }

    @OriginalMember(owner = "client!mt", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method39(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field5830;
        if (arg3 != null && this.field5841 == null) {
            this.field5841 = new int[super.field4679][super.field4672][];
        }
        if (arg5 != null && this.field5837 == null) {
            this.field5837 = new int[super.field4679][super.field4672][];
        }
        class267 var15 = this.field5819.field7881;
        this.field5820[arg0][arg1] = arg2;
        this.field5821[arg0][arg1] = arg4;
        this.field5826[arg0][arg1] = arg6;
        this.field5839[arg0][arg1] = arg7;
        if (this.field5837 != null) {
            this.field5837[arg0][arg1] = arg5;
        }
        if (this.field5841 != null) {
            this.field5841[arg0][arg1] = arg3;
        }
        class99[] var16 = this.field5843[arg0][arg1] = new class99[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field5828 & 32) != 0 && var18 != -1 && var15.method962(var18, 2904).field9639) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
            class430 var22;
            for (var22 = this.field5851.method4020(var20, (byte) -124); var22 != null; var22 = this.field5851.method4018((byte) 90)) {
                class99 var23 = (class99) var22;
                if (var23.field1418 == var18 && (float) var19 == var23.field1429 && var23.field1428 == arg10 && var23.field1407 == arg11 && var23.field1425 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class99) var22;
            } else {
                var16[var17] = new class99(this, var18, var19, arg10, arg11, arg12);
                this.field5851.method4022(var16[var17], 103, var20);
            }
        }
        if (arg13) {
            this.field5834[arg0][arg1] = (byte) class430.method2658(this.field5834[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field5863) {
            this.field5863 = arg6.length;
        }
        this.field5855 += arg6.length;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lkw;IIII[[I[[II)V")
    public class410(class346 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5819 = arg0;
        this.field5846 = super.field4674 + -2;
        this.field5861 = new float[super.field4679 + 1][super.field4672 - -1];
        this.field5839 = new int[arg3][arg4][];
        this.field5843 = new class99[arg3][arg4][];
        this.field5828 = arg2;
        this.field5826 = new int[arg3][arg4][];
        this.field5852 = new byte[arg3 + 1][arg4 + 1];
        this.field5860 = new float[super.field4679 - -1][super.field4672 + 1];
        this.field5820 = new int[arg3][arg4][];
        this.field5833 = 1 << this.field5846;
        this.field5821 = new int[arg3][arg4][];
        this.field5844 = new short[arg3 * arg4][];
        this.field5834 = new byte[arg3][arg4];
        this.field5854 = new float[super.field4679 + 1][super.field4672 - -1];
        this.field5841 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field4672; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field4679; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 + var12 * var12)));
                this.field5854[var10][var9] = (float) var11 * var13;
                this.field5860[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5861[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5851 = new class715(128);
        if ((16 & this.field5828) != 0) {
            this.field5838 = new class93(this.field5819, this);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method38(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5835;
        if (this.field5838 != null && arg0 != null) {
            int var7 = -(this.field5819.field5065 * arg2 >> 8) + arg1 >> this.field5819.field4970;
            int var8 = -(this.field5819.field5102 * arg2 >> 8) + arg3 >> this.field5819.field4970;
            return this.field5838.method717(var8, var7, arg0, -67);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
    public final void method33(int arg0, int arg1) {
        ++field5831;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static final void method2486(byte arg0) {
        ++field5848;
        for (class175 var1 = (class175) class597.field8488.method1518((byte) 103); var1 != null; var1 = (class175) class597.field8488.method1518((byte) 103)) {
            class757.method4205(var1, 127);
        }
        int var2;
        int var3;
        if (~class243.field3580.field8002.method2026(false) == -2) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class717.field10118;
            var2 = class717.field10118;
        }
        client.method2736();
        int var4 = var2;
        if (arg0 <= -81) {
            while (var4 <= var3) {
                client.method2729();
                client.method2738(var4);
                client.method2725(var4);
                ++var4;
            }
            client.method2723();
            client.method2737();
        }
    }

    @OriginalMember(owner = "client!mt", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method51(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5845;
        if (this.field5838 != null && arg0 != null) {
            int var7 = -(this.field5819.field5065 * arg2 >> 8) + arg1 >> this.field5819.field4970;
            int var8 = -(this.field5819.field5102 * arg2 >> 8) + arg3 >> this.field5819.field4970;
            this.field5838.method723(var7, arg0, 21494, var8);
        }
    }

    @OriginalMember(owner = "client!mt", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method36(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5840;
        if (this.field5838 != null && arg0 != null) {
            int var7 = arg1 - (this.field5819.field5065 * arg2 >> 8) >> this.field5819.field4970;
            int var8 = -(this.field5819.field5102 * arg2 >> 8) + arg3 >> this.field5819.field4970;
            this.field5838.method720(arg0, var8, (byte) -55, var7);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILeh;II)V")
    private final void method2487(int arg0, class256 arg1, int arg2, int arg3) {
        ++field5824;
        int[] var5 = this.field5820[arg3][arg0];
        int[] var6 = this.field5821[arg3][arg0];
        int var7 = var5.length;
        if (~var7 < ~this.field5819.field5118.length) {
            this.field5819.field5118 = new int[var7];
            this.field5819.field5121 = new int[var7];
        }
        int[] var8 = this.field5819.field5118;
        int[] var9 = this.field5819.field5121;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field5819.field4970;
            var9[var10] = var6[var10] >> this.field5819.field4970;
        }
        int var11 = arg2;
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((var12 - var14) * (var15 - var17) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                arg1.method1705(var14, var16, var15, var17, var13, var12, -1762);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "([[ZIZIIIII)V")
    private final void method2488(boolean[][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -127 % ((arg5 - -16) / 45);
        if (this.field5859 != null) {
            int var10 = arg3 + 1 + arg3;
            int var11 = var10 * var10;
            if (this.field5819.field5117.length < var11) {
                this.field5819.field5117 = new int[var11];
            }
            if (this.field5825 * 2 > this.field5819.field5093.field6800.length) {
                this.field5819.field5093 = new class212(this.field5825 * 2);
            }
            int var12 = -arg3 + arg1;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg3 + arg6;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg1 + arg3;
            if (~var16 < ~(super.field4679 + -1)) {
                var16 = super.field4679 + -1;
            }
            int var17 = arg3 + arg6;
            if (~(super.field4672 - 1) > ~var17) {
                var17 = super.field4672 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field5819.field5117;
            for (int var20 = var12; ~var16 <= ~var20; ++var20) {
                boolean[] var26 = arg0[-var13 + var20];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field4679 * var27 + var20;
                    }
                }
            }
            if (arg4 != -1) {
                this.field5819.method2189(1365, (float) arg4);
                this.field5819.method2187((byte) -85);
            } else {
                this.field5819.method2179(1);
            }
            this.field5819.method2142(~(this.field5828 & 7) != -1, (byte) -123);
            for (int var21 = 0; var21 < this.field5859.length; ++var21) {
                this.field5859[var21].method745(var19, var18, 98);
            }
            if (!this.field5850.method3555(83)) {
                int var22 = this.field5819.field5028;
                int var23 = this.field5819.field5094;
                this.field5819.method388(0, var23, this.field5819.field5085);
                this.field5819.method2142(false, (byte) -109);
                this.field5819.method2160(false, 39);
                this.field5819.method2138(27032, 128);
                this.field5819.method2176(-2, -55);
                this.field5819.method2164(6, this.field5819.field5023);
                this.field5819.method2149(-11771, 7681, 8448);
                this.field5819.method2167(34166, 770, 10603, 0);
                this.field5819.method2136(8960, 34167, 0, 770);
                for (class430 var24 = this.field5850.method3565(-67); var24 != null; var24 = this.field5850.method3561((byte) 76)) {
                    class122 var25 = (class122) var24;
                    var25.method866(arg1, arg6, true, arg3, arg0);
                }
                this.field5819.method2167(5890, 768, 10603, 0);
                this.field5819.method2136(8960, 5890, 0, 770);
                this.field5819.method2164(6, (class158) null);
                this.field5819.method388(var22, var23, this.field5819.field5085);
            }
            if (this.field5838 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field5819.method2134(this.field5853, (class745) null, this.field5862, (class745) null, 32888);
                this.field5838.method721(arg1, arg2, arg0, arg3, 124, arg6);
                OpenGL.glPopMatrix();
            }
        }
        ++field5847;
    }

    @OriginalMember(owner = "client!mt", name = "YA", descriptor = "()V")
    public final void method35() {
        if (this.field5855 <= 0) {
            this.field5838 = null;
        } else {
            byte[][] var1 = new byte[super.field4679 + 1][super.field4672 + 1];
            for (int var2 = 1; ~var2 > ~super.field4679; ++var2) {
                for (int var103 = 1; var103 < super.field4672; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5852[var2][var103] >> 1) + (this.field5852[var2][var103 - -1] >> 3) + (this.field5852[var2][var103 + -1] >> 2) + (this.field5852[var2 - 1][var103] >> 2) + (this.field5852[var2 + 1][var103] >> 3));
                }
            }
            this.field5859 = new class99[this.field5851.method4019(7)];
            this.field5851.method4017(this.field5859, 80);
            for (int var3 = 0; var3 < this.field5859.length; ++var3) {
                this.field5859[var3].method743(4, this.field5855);
            }
            int var4 = 24;
            if (this.field5837 != null) {
                var4 += 4;
            }
            if ((7 & this.field5828) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field5819.field4972.method2568(this.field5855 * var4, false);
            Stream var6 = new Stream(var5);
            class99[] var7 = new class99[this.field5855];
            int var8 = class468.method2829(119, this.field5855 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class715 var9 = new class715(var8);
            class99[] var10 = new class99[this.field5863];
            for (int var11 = 0; super.field4679 > var11; ++var11) {
                for (int var30 = 0; var30 < super.field4672; ++var30) {
                    if (this.field5826[var11][var30] != null) {
                        class99[] var31 = this.field5843[var11][var30];
                        int[] var32 = this.field5820[var11][var30];
                        int[] var33 = this.field5821[var11][var30];
                        int[] var34 = this.field5839[var11][var30];
                        int[] var35 = this.field5826[var11][var30];
                        int[] var36 = this.field5841 == null ? null : this.field5841[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field5837 != null ? this.field5837[var11][var30] : null;
                        float var38 = this.field5854[var11][var30];
                        float var39 = this.field5860[var11][var30];
                        float var40 = this.field5861[var11][var30];
                        float var41 = this.field5854[var11][var30 - -1];
                        float var42 = this.field5860[var11][var30 - -1];
                        float var43 = this.field5861[var11][var30 + 1];
                        float var44 = this.field5854[var11 + 1][var30 - -1];
                        float var45 = this.field5860[var11 + 1][var30 + 1];
                        float var46 = this.field5861[var11 + 1][var30 + 1];
                        float var47 = this.field5854[var11 - -1][var30];
                        float var48 = this.field5860[var11 + 1][var30];
                        float var49 = this.field5861[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class99 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5844[super.field4679 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field4674) + var32[var57];
                            int var59 = (var30 << super.field4674) - -var33[var57];
                            int var60 = var58 >> this.field5846;
                            int var61 = var59 >> this.field5846;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var62 << 32 | (long) var63 << 48 | (long) (var60 << 16) | (long) var61;
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
                                var74 = var38;
                                var75 = var40;
                            } else if (~var67 == -1 && ~super.field4675 == ~var68) {
                                var75 = var43;
                                var72 = var69 - var51;
                                var74 = var41;
                                var73 = var42;
                            } else if (super.field4675 == var67 && ~super.field4675 == ~var68) {
                                var73 = var45;
                                var72 = var69 - var52;
                                var74 = var44;
                                var75 = var46;
                            } else if (super.field4675 == var67 && var68 == 0) {
                                var75 = var49;
                                var74 = var47;
                                var72 = var69 - var53;
                                var73 = var48;
                            } else {
                                float var76 = (float) var67 / (float) super.field4675;
                                float var77 = (float) var68 / (float) super.field4675;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var74 = (var81 - var78) * var77 + var78;
                                var73 = (var82 - var79) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (var83 - var80) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field4674) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field4674) + var51;
                                var72 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field4674));
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class519.field7479[var62 & 65408 | var86];
                                if ((7 & this.field5828) == 0) {
                                    float var87 = this.field5819.field5111[2] * var75 + this.field5819.field5111[0] * var74 + this.field5819.field5111[1] * var73;
                                    var71 = this.field5819.field5063 + var87 * (!(var87 > 0.0F) ? this.field5819.field5019 : this.field5819.field5109);
                                }
                            }
                            class430 var88 = null;
                            if (~(var58 & this.field5833 - 1) == -1 && ~(var59 & this.field5833 + -1) == -1) {
                                var88 = var9.method4020(var65, (byte) -75);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var72 >> 7;
                                    if (var90 >= 2) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var89 = class519.field7479[var90 | var63 & 65408];
                                    if (~(this.field5828 & 7) == -1) {
                                        float var91 = this.field5819.field5111[2] * var75 + this.field5819.field5111[0] * var74 + this.field5819.field5111[1] * var73;
                                        float var92 = this.field5819.field5063 + var71 * (!(var71 > 0.0F) ? this.field5819.field5019 : this.field5819.field5109);
                                        int var93 = var89 >> 16 & 255;
                                        int var94 = (65454 & var89) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        if (var95 >= 0) {
                                            if (var95 > 255) {
                                                var95 = 255;
                                            }
                                        } else {
                                            var95 = 0;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var98 | var95 << 16 | var97 << 8;
                                    }
                                }
                                if (this.field5819.field5047) {
                                    var6.method2557((float) var58);
                                    var6.method2557((float) (this.method2089(26448, var58, var59) - -var64));
                                    var6.method2557((float) var59);
                                    var6.method2555((byte) (var89 >> 16));
                                    var6.method2555((byte) (var89 >> 8));
                                    var6.method2555((byte) var89);
                                    var6.method2555(-1);
                                    var6.method2557((float) var58);
                                    var6.method2557((float) var59);
                                    if (this.field5837 != null) {
                                        var6.method2557((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if ((this.field5828 & 7) != 0) {
                                        var6.method2557(var74);
                                        var6.method2557(var73);
                                        var6.method2557(var75);
                                    }
                                } else {
                                    var6.method2564((float) var58);
                                    var6.method2564((float) (this.method2089(26448, var58, var59) - -var64));
                                    var6.method2564((float) var59);
                                    var6.method2555((byte) (var89 >> 16));
                                    var6.method2555((byte) (var89 >> 8));
                                    var6.method2555((byte) var89);
                                    var6.method2555(-1);
                                    var6.method2564((float) var58);
                                    var6.method2564((float) var59);
                                    if (this.field5837 != null) {
                                        var6.method2564((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field5828 & 7) != 0) {
                                        var6.method2564(var74);
                                        var6.method2564(var73);
                                        var6.method2564(var75);
                                    }
                                }
                                var99 = this.field5829++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method4022(new class219(var56[var57]), 118, var65);
                            } else {
                                var56[var57] = ((class219) var88).field3265;
                                var99 = 65535 & var56[var57];
                                if (var62 != -1 && ~var31[var57].field6188 > ~var7[var99].field6188) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method748(var70, (byte) -122, var71, var99, var72);
                            }
                            ++this.field5825;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field5829 > var12; ++var12) {
                class99 var29 = var7[var12];
                if (var29 != null) {
                    var29.method747(26879, var12);
                }
            }
            for (int var13 = 0; ~super.field4679 < ~var13; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field4672; ++var18) {
                    short[] var19 = this.field5844[super.field4679 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class99 var25 = var7[var22];
                            class99 var26 = var7[var23];
                            class99 var27 = var7[var24];
                            class99 var28 = null;
                            if (var25 != null) {
                                var25.method744(var18, 1, var13, var20);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method744(var18, 1, var13, var20);
                                if (var28 == null || ~var26.field6188 > ~var28.field6188) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method744(var18, 1, var13, var20);
                                if (var28 == null || ~var28.field6188 < ~var27.field6188) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method747(26879, var22);
                                }
                                if (var26 != null) {
                                    var28.method747(26879, var23);
                                }
                                if (var27 != null) {
                                    var28.method747(26879, var24);
                                }
                                var28.method744(var18, 1, var13, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2554();
            this.field5856 = this.field5819.method2168(var4, false, (byte) 115, var6.method2565(), var5);
            this.field5853 = new class745(this.field5856, 5126, 3, 0);
            this.field5857 = new class745(this.field5856, 5121, 4, 12);
            byte var14;
            if (this.field5837 == null) {
                var14 = 24;
                this.field5862 = new class745(this.field5856, 5126, 2, 16);
            } else {
                var14 = 28;
                this.field5862 = new class745(this.field5856, 5126, 3, 16);
            }
            if (~(this.field5828 & 7) != -1) {
                this.field5858 = new class745(this.field5856, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5859.length];
            for (int var16 = 0; ~this.field5859.length < ~var16; ++var16) {
                class99 var17 = this.field5859[var16];
                var15[var16] = var17.field6188;
                var17.method749(this.field5829, (byte) 105);
            }
            class345.method2115(var15, this.field5859, false);
            if (this.field5838 != null) {
                this.field5838.method716(96);
            }
        }
        ++field5822;
        this.field5851 = null;
        this.field5837 = null;
        this.field5820 = this.field5821 = null;
        this.field5843 = null;
        this.field5839 = null;
        this.field5854 = this.field5860 = this.field5861 = null;
        this.field5826 = null;
        this.field5841 = null;
        this.field5852 = null;
    }
}
