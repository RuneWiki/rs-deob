import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class417 extends class24 {

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "Lgw;")
    private class118 field5905 = new class118();

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    private int field5891 = this.field345 - 2;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "Lbt;")
    public class33 field5901;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "[[I")
    private int[][] field5912;

    @OriginalMember(owner = "client!gu", name = "bb", descriptor = "[[F")
    private float[][] field5931;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "[[[I")
    private int[][][] field5904;

    @OriginalMember(owner = "client!gu", name = "kb", descriptor = "[[F")
    private float[][] field5940;

    @OriginalMember(owner = "client!gu", name = "hb", descriptor = "[[B")
    private byte[][] field5937;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "[[[I")
    public int[][][] field5898;

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
    private int field5913;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "[[S")
    public short[][] field5902;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "[[[I")
    private int[][][] field5899;

    @OriginalMember(owner = "client!gu", name = "W", descriptor = "[[B")
    private byte[][] field5926;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "[[[I")
    public int[][][] field5900;

    @OriginalMember(owner = "client!gu", name = "Q", descriptor = "[[[Lui;")
    private class156[][][] field5920;

    @OriginalMember(owner = "client!gu", name = "cb", descriptor = "[[F")
    private float[][] field5932;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "[[[I")
    private int[][][] field5907;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public int field5889;

    @OriginalMember(owner = "client!gu", name = "fb", descriptor = "Lhl;")
    private class375 field5935;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "Ldg;")
    private class290 field5888;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "[B")
    public static byte[] field5906 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "Lge;")
    public static class511 field5914 = new class511(8);

    @OriginalMember(owner = "client!gu", name = "S", descriptor = "Lqt;")
    public static class459 field5922 = new class459(66, 8);

    @OriginalMember(owner = "client!gu", name = "X", descriptor = "Lhl;")
    public static class375 field5927 = new class375(8);

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    private int field5897;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!gu", name = "R", descriptor = "I")
    private int field5921;

    @OriginalMember(owner = "client!gu", name = "T", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!gu", name = "U", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!gu", name = "V", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!gu", name = "Z", descriptor = "I")
    private int field5929;

    @OriginalMember(owner = "client!gu", name = "lb", descriptor = "I")
    private int field5941;

    @OriginalMember(owner = "client!gu", name = "db", descriptor = "Ljd;")
    public class157 field5933;

    @OriginalMember(owner = "client!gu", name = "eb", descriptor = "Ljd;")
    public class157 field5934;

    @OriginalMember(owner = "client!gu", name = "ib", descriptor = "Ljd;")
    private class157 field5938;

    @OriginalMember(owner = "client!gu", name = "jb", descriptor = "Ljd;")
    public class157 field5939;

    @OriginalMember(owner = "client!gu", name = "gb", descriptor = "Lus;")
    private class1 field5936;

    @OriginalMember(owner = "client!gu", name = "ab", descriptor = "[Lui;")
    private class156[] field5930;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "[[[I")
    private int[][][] field5908;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZZ)V")
    public static final void method2488(boolean arg0, boolean arg1) {
        if (arg1) {
            field5914 = null;
        }
        if (arg0) {
            if (~class188.field2765 != 0) {
                class409.method2430(class188.field2765, -108);
            }
            for (class541 var2 = (class541) class220.field3370.method2285(51); var2 != null; var2 = (class541) class220.field3370.method2283((byte) 11)) {
                if (!var2.method416((byte) -126)) {
                    var2 = (class541) class220.field3370.method2285(74);
                    if (var2 == null) {
                        break;
                    }
                }
                class126.method937(!arg1, var2, true, false);
            }
            class188.field2765 = -1;
            class220.field3370 = new class375(8);
            class69.method540((byte) 90);
            class188.field2765 = class531.field7837;
            class198.method1343(false, -1);
            class531.method3148(-113);
            class281.method1815(class188.field2765);
        }
        ++field5924;
        class161.field2456 = true;
    }

    @OriginalMember(owner = "client!gu", name = "R", descriptor = "(II)I")
    public final int method143(int arg0, int arg1) {
        ++field5895;
        int var3 = arg0 >> super.field345;
        int var4 = arg1 >> super.field345;
        if (var3 >= 0 && ~var4 <= -1 && var3 <= super.field347 - 1 && super.field350 + -1 >= var4) {
            int var5 = super.field346 + -1 & arg0;
            int var6 = arg1 & super.field346 - 1;
            int var7 = (-var5 + super.field346) * this.field5912[var3][var4] + this.field5912[var3 - -1][var4] * var5 >> super.field345;
            int var8 = (-var5 + super.field346) * this.field5912[var3][var4 + 1] + this.field5912[var3 + 1][var4 - -1] * var5 >> super.field345;
            return (-var6 + super.field346) * var7 + var6 * var8 >> super.field345;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lia;IIIIZ)Z")
    public final boolean method154(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5893;
        if (this.field5888 != null && arg0 != null) {
            int var7 = -(this.field5901.field704 * arg2 >> 8) + arg1 >> this.field5901.field622;
            int var8 = -(this.field5901.field752 * arg2 >> 8) + arg3 >> this.field5901.field622;
            return this.field5888.method1858(var7, var8, arg0, -1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III[[ZZ)V")
    public final void method152(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2489(arg4, -1, 7, arg3, arg1, arg0, arg2);
        ++field5896;
    }

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "(III)V")
    public final void method149(int arg0, int arg1, int arg2) {
        if (~(255 & this.field5937[arg0][arg1]) > ~arg2) {
            this.field5937[arg0][arg1] = (byte) arg2;
        }
        ++field5916;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lni;[I)V")
    public final void method157(class369 arg0, int[] arg1) {
        ++field5890;
        this.field5905.method866((byte) 10, new class112(this.field5901, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
    public final void method144(int arg0, int arg1) {
        ++field5925;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII[[ZIII)V")
    private final void method2489(boolean arg0, int arg1, int arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        if (this.field5930 != null) {
            float var8 = this.field5901.field699;
            float var9 = this.field5901.field751;
            int var10 = arg6 + arg6 + 1;
            int var11 = var10 * var10;
            if (~var11 < ~this.field5901.field766.length) {
                this.field5901.field766 = new int[var11];
            }
            if (~(this.field5897 * 2) < ~this.field5901.field719.field7545.length) {
                this.field5901.field719 = new class235(this.field5897 * 2);
            }
            int var12 = -arg6 + arg5;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg4 - arg6;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg5 + arg6;
            if (var16 > super.field347 + -1) {
                var16 = super.field347 + -1;
            }
            int var17 = arg4 + arg6;
            if (~(super.field350 - 1) > ~var17) {
                var17 = super.field350 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field5901.field766;
            for (int var20 = var12; var20 <= var16; ++var20) {
                boolean[] var26 = arg3[-var13 + var20];
                for (int var27 = var14; var27 <= var17; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field347 * var27 + var20;
                    }
                }
            }
            if (~arg1 != 0) {
                this.field5901.method202((float) arg1, (byte) -112);
                this.field5901.method339((byte) -117);
            } else {
                this.field5901.method227(1);
            }
            this.field5901.method230((byte) -99, (7 & this.field5889) != 0);
            for (int var21 = 0; this.field5930.length > var21; ++var21) {
                this.field5930[var21].method1093(false, var18, var19);
            }
            if (!this.field5905.method854(33)) {
                int var22 = this.field5901.field744;
                int var23 = this.field5901.field673;
                this.field5901.method314(0, var23, this.field5901.field679);
                this.field5901.method221(var9, var8 + -4.0F);
                this.field5901.method230((byte) -99, false);
                this.field5901.method286(-1, false);
                this.field5901.method229(128, -69);
                this.field5901.method204(-2, 1);
                this.field5901.method285(false, this.field5901.field682);
                this.field5901.method275(8448, 7681, 124);
                this.field5901.method333(false, 34166, 770, 0);
                this.field5901.method200(34167, 0, 770, (byte) -54);
                for (class42 var24 = this.field5905.method863(-1); var24 != null; var24 = this.field5905.method865(-1)) {
                    class112 var25 = (class112) var24;
                    var25.method795(arg4, arg5, 0, arg6, arg3);
                }
                this.field5901.method333(false, 5890, 768, 0);
                this.field5901.method200(5890, 0, 770, (byte) 126);
                this.field5901.method285(false, (class120) null);
                this.field5901.method314(var22, var23, this.field5901.field679);
            }
            if (this.field5888 != null) {
                this.field5901.method221(var9, var8 - 8.0F);
                this.field5901.method227(arg2 + -6);
                this.field5901.method319((class157) null, (class157) null, this.field5933, 22146, this.field5939);
                this.field5888.method1855(arg0, false, arg4, arg3, arg6, arg5);
            }
            this.field5901.method221(var9, var8);
        }
        ++field5903;
        if (arg2 != 7) {
            this.method153(-95, -98, (class424) null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method151(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field5918;
        if (arg5 != null && this.field5908 == null) {
            this.field5908 = new int[super.field347][super.field350][];
        }
        if (arg3 != null && this.field5899 == null) {
            this.field5899 = new int[super.field347][super.field350][];
        }
        this.field5898[arg0][arg1] = arg2;
        this.field5900[arg0][arg1] = arg4;
        this.field5907[arg0][arg1] = arg6;
        this.field5904[arg0][arg1] = arg7;
        if (this.field5908 != null) {
            this.field5908[arg0][arg1] = arg5;
        }
        if (this.field5899 != null) {
            this.field5899[arg0][arg1] = arg3;
        }
        class156[] var15 = this.field5920[arg0][arg1] = new class156[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class42 var19;
            for (var19 = this.field5935.method2284(true, var17); var19 != null; var19 = this.field5935.method2290((byte) -113)) {
                class156 var20 = (class156) var19;
                if (arg8[var16] == var20.field2371 && (float) arg9[var16] == var20.field2389 && var20.field2393 == arg10 && var20.field2376 == arg11 && ~var20.field2377 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class156(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5935.method2292(var17, var15[var16], (byte) -127);
            } else {
                var15[var16] = (class156) var19;
            }
        }
        if (arg13) {
            this.field5926[arg0][arg1] = (byte) class442.method2600(this.field5926[arg0][arg1], 1);
        }
        if (arg6.length > this.field5929) {
            this.field5929 = arg6.length;
        }
        this.field5941 += arg6.length;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public static void method2490(byte arg0) {
        field5914 = null;
        if (arg0 <= 126) {
            field5914 = null;
        }
        field5906 = null;
        field5927 = null;
        field5922 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILdm;BI)V")
    private final void method2491(int arg0, class37 arg1, byte arg2, int arg3) {
        ++field5910;
        int[] var5 = this.field5898[arg3][arg0];
        int[] var6 = this.field5900[arg3][arg0];
        int var7 = var5.length;
        if (~this.field5901.field765.length > ~var7) {
            this.field5901.field764 = new int[var7];
            this.field5901.field765 = new int[var7];
        }
        if (arg2 < 61) {
            method2488(true, true);
        }
        int[] var8 = this.field5901.field765;
        int[] var9 = this.field5901.field764;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = class168.method1203(255, var5[var10]) >> this.field5901.field622;
            var9[var10] = class168.method1203(var6[var10], 255) >> this.field5901.field622;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((var12 - var14) * (-var17 + var15) + -((var15 - var13) * (-var14 + var16))) < -1) {
                arg1.method395((byte) -44, var13, var12, var14, var15, var17, var16);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5919;
        if (this.field5941 > 0) {
            this.field5901.method349(20397);
            this.field5901.method348(3, false);
            this.field5901.method230((byte) -99, false);
            this.field5901.method296((byte) -115, false);
            this.field5901.method286(-1, false);
            this.field5901.method229(0, -89);
            this.field5901.method204(-2, 1);
            this.field5901.method285(false, (class120) null);
            class141.field2176[8] = 0.0F;
            class141.field2176[5] = (float) arg2 / ((float) super.field346 * 128.0F * (float) this.field5901.field573);
            class141.field2176[10] = 0.0F;
            class141.field2176[9] = 0.0F;
            class141.field2176[6] = 0.0F;
            class141.field2176[0] = (float) arg2 / ((float) super.field346 * 128.0F * (float) this.field5901.field530);
            class141.field2176[3] = 0.0F;
            class141.field2176[15] = 1.0F;
            class141.field2176[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5901.field530) + -1.0F;
            class141.field2176[7] = 0.0F;
            class141.field2176[1] = 0.0F;
            class141.field2176[2] = 0.0F;
            class141.field2176[11] = 0.0F;
            class141.field2176[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5901.field573;
            class141.field2176[4] = 0.0F;
            class141.field2176[14] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class141.field2176, 0);
            class141.field2176[3] = 0.0F;
            class141.field2176[5] = 0.0F;
            class141.field2176[7] = 0.0F;
            class141.field2176[15] = 1.0F;
            class141.field2176[14] = 0.0F;
            class141.field2176[12] = 0.0F;
            class141.field2176[6] = 1.0F;
            class141.field2176[13] = 0.0F;
            class141.field2176[8] = 0.0F;
            class141.field2176[1] = 0.0F;
            class141.field2176[4] = 0.0F;
            class141.field2176[0] = 1.0F;
            class141.field2176[11] = 0.0F;
            class141.field2176[2] = 0.0F;
            class141.field2176[9] = 1.0F;
            class141.field2176[10] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class141.field2176, 0);
            if ((7 & this.field5889) != 0) {
                this.field5901.method230((byte) -99, true);
                this.field5901.method260(-101);
            } else {
                this.field5901.method230((byte) -99, false);
            }
            this.field5901.method319(this.field5938, this.field5934, this.field5933, 22146, this.field5939);
            if (~(this.field5897 * 2) >= ~this.field5901.field719.field7545.length) {
                this.field5901.field719.field7558 = 0;
            } else {
                this.field5901.field719 = new class235(this.field5897 * 2);
            }
            int var9 = 0;
            class235 var10 = this.field5901.field719;
            if (!this.field5901.field713) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field347 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field5902[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    var10.method3062(var14[var15] & 65535, (byte) -53);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field347 * var16 - -arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field5902[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    ++var9;
                                    var10.method3016(var20[var21] & 65535, -70);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class41 var17 = new class41(this.field5901, 5123, var10.field7545, var10.field7558);
                this.field5901.method266(4, (byte) -103, 0, var9, var17);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "U", descriptor = "()V")
    public final void method155() {
        if (this.field5941 > 0) {
            byte[][] var1 = new byte[super.field347 - -1][super.field350 + 1];
            for (int var2 = 1; super.field347 > var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field350; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5937[var2][var103 + 1] >> 3) + (this.field5937[var2 + -1][var103] >> 2) + (this.field5937[var2][var103] >> 1) + (this.field5937[var2][var103 + -1] >> 2) + (this.field5937[var2 + 1][var103] >> 3));
                }
            }
            this.field5930 = new class156[this.field5935.method2294((byte) 76)];
            this.field5935.method2287((byte) 102, this.field5930);
            for (int var3 = 0; var3 < this.field5930.length; ++var3) {
                this.field5930[var3].method1091(this.field5941, 22050);
            }
            int var4 = 24;
            if (this.field5908 != null) {
                var4 += 4;
            }
            if ((7 & this.field5889) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field5901.field623.method2654(this.field5941 * var4);
            NativeStream var6 = new NativeStream(var5);
            class156[] var7 = new class156[this.field5941];
            int var8 = class285.method1834(-92, this.field5941 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class375 var9 = new class375(var8);
            class156[] var10 = new class156[this.field5929];
            for (int var11 = 0; ~var11 > ~super.field347; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field350; ++var30) {
                    if (this.field5907[var11][var30] != null) {
                        class156[] var31 = this.field5920[var11][var30];
                        int[] var32 = this.field5898[var11][var30];
                        int[] var33 = this.field5900[var11][var30];
                        int[] var34 = this.field5904[var11][var30];
                        int[] var35 = this.field5907[var11][var30];
                        int[] var36 = this.field5899 == null ? null : this.field5899[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field5908 == null ? null : this.field5908[var11][var30];
                        float var38 = this.field5931[var11][var30];
                        float var39 = this.field5940[var11][var30];
                        float var40 = this.field5932[var11][var30];
                        float var41 = this.field5931[var11][var30 + 1];
                        float var42 = this.field5940[var11][var30 + 1];
                        float var43 = this.field5932[var11][var30 + 1];
                        float var44 = this.field5931[var11 + 1][var30 + 1];
                        float var45 = this.field5940[var11 + 1][var30 + 1];
                        float var46 = this.field5932[var11 - -1][var30 - -1];
                        float var47 = this.field5931[var11 - -1][var30];
                        float var48 = this.field5940[var11 + 1][var30];
                        float var49 = this.field5932[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 - -1] & 255;
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; var35.length > var55; ++var55) {
                            class156 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5902[super.field347 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field345) - -var32[var57];
                            int var59 = (var30 << super.field345) + var33[var57];
                            int var60 = var58 >> this.field5891;
                            int var61 = var59 >> this.field5891;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48;
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
                            } else if (var67 == 0 && ~super.field346 == ~var68) {
                                var72 = var69 - var51;
                                var74 = var41;
                                var73 = var42;
                                var75 = var43;
                            } else if (~super.field346 == ~var67 && super.field346 == var68) {
                                var73 = var45;
                                var75 = var46;
                                var74 = var44;
                                var72 = var69 - var52;
                            } else if (super.field346 == var67 && ~var68 == -1) {
                                var72 = var69 - var53;
                                var73 = var48;
                                var74 = var47;
                                var75 = var49;
                            } else {
                                float var76 = (float) var67 / (float) super.field346;
                                float var77 = (float) var68 / (float) super.field346;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var74 = (-var78 + var81) * var77 + var78;
                                var73 = (var82 - var79) * var77 + var79;
                                var75 = (var83 - var80) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field345) + var50;
                                int var85 = var51 - -((-var51 + var52) * var67 >> super.field345);
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field345) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (var86 >= 2) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class167.field2517[var86 | var62 & 65408];
                                if ((this.field5889 & 7) == 0) {
                                    float var87 = this.field5901.field675[2] * var75 + this.field5901.field675[0] * var74 + this.field5901.field675[1] * var73;
                                    var71 = this.field5901.field720 + (var87 > 0.0F ? this.field5901.field661 : this.field5901.field737) * var87;
                                }
                            }
                            class42 var88 = null;
                            if ((this.field5913 + -1 & var58) == 0 && (var59 & this.field5913 + -1) == 0) {
                                var88 = var9.method2284(true, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (~var62 != ~var63) {
                                    int var89 = (127 & var63) * var72 >> 7;
                                    if (var89 >= 2) {
                                        if (var89 > 126) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class167.field2517[var89 | 65408 & var63];
                                    if ((7 & this.field5889) == 0) {
                                        float var91 = this.field5901.field675[2] * var75 + this.field5901.field675[0] * var74 + this.field5901.field675[1] * var73;
                                        float var92 = this.field5901.field720 + (!(var71 > 0.0F) ? this.field5901.field737 : this.field5901.field661) * var71;
                                        int var93 = 255 & var90 >> 16;
                                        int var94 = var90 >> 8 & 255;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var95 <= -1) {
                                            if (var95 > 255) {
                                                var95 = 255;
                                            }
                                        } else {
                                            var95 = 0;
                                        }
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var98 <= -1) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var90 = var98 | var95 << 16 | var97 << 8;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (this.field5901.field713) {
                                    var6.method2646((float) var58);
                                    var6.method2646((float) (var64 + this.method143(var58, var59)));
                                    var6.method2646((float) var59);
                                    var6.method2648((byte) (var90 >> 16));
                                    var6.method2648((byte) (var90 >> 8));
                                    var6.method2648((byte) var90);
                                    var6.method2648(-1);
                                    var6.method2646((float) var58);
                                    var6.method2646((float) var59);
                                    if (this.field5908 != null) {
                                        var6.method2646((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(this.field5889 & 7) != -1) {
                                        var6.method2646(var74);
                                        var6.method2646(var73);
                                        var6.method2646(var75);
                                    }
                                } else {
                                    var6.method2647((float) var58);
                                    var6.method2647((float) (var64 + this.method143(var58, var59)));
                                    var6.method2647((float) var59);
                                    var6.method2648((byte) (var90 >> 16));
                                    var6.method2648((byte) (var90 >> 8));
                                    var6.method2648((byte) var90);
                                    var6.method2648(-1);
                                    var6.method2647((float) var58);
                                    var6.method2647((float) var59);
                                    if (this.field5908 != null) {
                                        var6.method2647((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field5889) != -1) {
                                        var6.method2647(var74);
                                        var6.method2647(var73);
                                        var6.method2647(var75);
                                    }
                                }
                                var99 = this.field5921++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2292(var65, new class545(var56[var57]), (byte) -128);
                            } else {
                                var56[var57] = ((class545) var88).field7989;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && var7[var99].field863 > var31[var57].field863) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1095(var71, var70, var72, (byte) -128, var99);
                            }
                            ++this.field5897;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field5921 > var12; ++var12) {
                class156 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1098(var12, (byte) -103);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field347; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field350; ++var18) {
                    short[] var19 = this.field5902[super.field347 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class156 var25 = var7[var22];
                            class156 var26 = var7[var23];
                            class156 var27 = var7[var24];
                            class156 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1099(var20, var13, var18, 59);
                            }
                            if (var26 != null) {
                                var26.method1099(var20, var13, var18, -109);
                                if (var28 == null || ~var28.field863 < ~var26.field863) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1099(var20, var13, var18, 31);
                                if (var28 == null || ~var27.field863 > ~var28.field863) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1098(var22, (byte) -124);
                                }
                                if (var26 != null) {
                                    var28.method1098(var23, (byte) -109);
                                }
                                if (var27 != null) {
                                    var28.method1098(var24, (byte) -122);
                                }
                                var28.method1099(var20, var13, var18, -84);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2650();
            this.field5936 = this.field5901.method353(var6.method2651(), -22, false, var5, var4);
            this.field5939 = new class157(this.field5936, 5126, 3, 0);
            this.field5938 = new class157(this.field5936, 5121, 4, 12);
            byte var14;
            if (this.field5908 != null) {
                var14 = 28;
                this.field5933 = new class157(this.field5936, 5126, 3, 16);
            } else {
                this.field5933 = new class157(this.field5936, 5126, 2, 16);
                var14 = 24;
            }
            if ((7 & this.field5889) != 0) {
                this.field5934 = new class157(this.field5936, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5930.length];
            for (int var16 = 0; this.field5930.length > var16; ++var16) {
                class156 var17 = this.field5930[var16];
                var15[var16] = var17.field863;
                var17.method1094((byte) -87, this.field5921);
            }
            class465.method2761(var15, -64, this.field5930);
            if (this.field5888 != null) {
                this.field5888.method1861(true);
            }
        } else {
            this.field5888 = null;
        }
        ++field5894;
        this.field5937 = null;
        this.field5920 = null;
        this.field5907 = null;
        this.field5931 = this.field5940 = this.field5932 = null;
        this.field5908 = null;
        this.field5935 = null;
        this.field5898 = this.field5900 = null;
        this.field5899 = null;
        this.field5904 = null;
    }

    @OriginalMember(owner = "client!gu", name = "oa", descriptor = "(II)I")
    public final int method156(int arg0, int arg1) {
        ++field5917;
        return this.field5912[arg0][arg1];
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method147(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5928;
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
        this.method151(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!gu", name = "ia", descriptor = "(Lia;IIIIZ)V")
    public final void method148(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5909;
        if (this.field5888 != null && arg0 != null) {
            int var7 = arg1 - (this.field5901.field704 * arg2 >> 8) >> this.field5901.field622;
            int var8 = arg3 - (this.field5901.field752 * arg2 >> 8) >> this.field5901.field622;
            this.field5888.method1856(var8, var7, arg0, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "(Lia;IIIIZ)V")
    public final void method150(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5911;
        if (this.field5888 != null && arg0 != null) {
            int var7 = -(this.field5901.field704 * arg2 >> 8) + arg1 >> this.field5901.field622;
            int var8 = -(this.field5901.field752 * arg2 >> 8) + arg3 >> this.field5901.field622;
            this.field5888.method1860(var8, 101, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "(IILia;)Lia;")
    public final class424 method153(int arg0, int arg1, class424 arg2) {
        ++field5915;
        if ((this.field5926[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field346 >> this.field5901.field622;
            class37 var5 = (class37) arg2;
            class37 var6;
            if (var5 != null && var5.method390(var4, (byte) -43, var4)) {
                var6 = var5;
                var5.method391(-8);
            } else {
                var6 = new class37(this.field5901, var4, var4);
            }
            var6.method394(0, 0, var4, (byte) -94, var4);
            this.method2491(arg1, var6, (byte) 120, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
    public static final void method2492(byte arg0) {
        ++field5892;
        class521.field7593 = null;
        class197.field2881 = null;
        class75.field1225 = null;
        class156.field2391 = null;
        class468.field6798 = null;
        class503.field7264 = null;
        class288.field4263 = null;
        class525.field7661 = null;
        class368.field5317 = null;
        class496.field7175 = null;
        class117.field1816 = null;
        if (arg0 <= 52) {
            field5922 = null;
        }
        class355.field5178 = null;
        class406.field5775 = null;
        class330.field4895 = null;
        class279.field4164 = null;
        class375.field5393 = null;
        class189.field2776 = null;
        class270.field4072 = null;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lbt;IIII[[I[[II)V")
    public class417(class33 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5901 = arg0;
        this.field5912 = arg5;
        this.field5931 = new float[super.field347 + 1][super.field350 + 1];
        this.field5904 = new int[arg3][arg4][];
        this.field5940 = new float[super.field347 + 1][super.field350 + 1];
        this.field5937 = new byte[arg3 - -1][arg4 + 1];
        this.field5898 = new int[arg3][arg4][];
        this.field5913 = 1 << this.field5891;
        this.field5902 = new short[arg3 * arg4][];
        this.field5899 = new int[arg3][arg4][];
        this.field5926 = new byte[arg3][arg4];
        this.field5900 = new int[arg3][arg4][];
        this.field5920 = new class156[arg3][arg4][];
        this.field5932 = new float[super.field347 + 1][super.field350 + 1];
        this.field5907 = new int[arg3][arg4][];
        this.field5889 = arg2;
        for (int var9 = 1; var9 < super.field350; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field347; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * 4 * arg7)))));
                this.field5931[var10][var9] = (float) var11 * var13;
                this.field5940[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5932[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5935 = new class375(128);
        if ((this.field5889 & 16) != 0) {
            this.field5888 = new class290(this.field5901, this);
        }
    }
}
