import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class74 extends class402 {

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "Lqia;")
    private class547 field1005 = new class547();

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    private int field1001 = this.field5570 + -2;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Leq;")
    public class357 field984;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "[[B")
    private byte[][] field998;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "[[[I")
    public int[][][] field979;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "[[F")
    private float[][] field1020;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "[[S")
    public short[][] field983;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "[[B")
    private byte[][] field1017;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "[[[I")
    private int[][][] field980;

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "[[F")
    private float[][] field1019;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "[[F")
    private float[][] field1016;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "[[[Lpga;")
    private class164[][][] field997;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "[[[I")
    public int[][][] field981;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "[[[I")
    private int[][][] field1008;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "[[[I")
    public int[][][] field1000;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "Lsga;")
    private class583 field1018;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "Ljia;")
    private class679 field996;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Lus;")
    public static class328 field990 = new class328(2, 4);

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field1006 = 1339;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "Lus;")
    public static class328 field1007 = new class328(66, 1);

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "Lur;")
    private class355 field1010;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "Lqe;")
    public class88 field1011;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "Lqe;")
    public class88 field1015;

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "Lqe;")
    public class88 field1021;

    @OriginalMember(owner = "client!qh", name = "hb", descriptor = "Lqe;")
    private class88 field1022;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "[Lpga;")
    private class164[] field1013;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "[[[I")
    private int[][][] field1009;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lpk;[I)V", line = 8)
    public final void method539(class621 arg0, int[] arg1) {
        this.field1005.method3110(new class205(this.field984, this, arg0, arg1), 1);
        ++field1003;
    }

    @OriginalMember(owner = "client!qh", name = "ka", descriptor = "(III)V", line = 21)
    public final void method540(int arg0, int arg1, int arg2) {
        ++field994;
        if (~(255 & this.field1017[arg0][arg1]) > ~arg2) {
            this.field1017[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII[[Z)V", line = 35)
    public final void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field993;
        if (~this.field1014 < -1) {
            this.field984.method2193(8448);
            this.field984.method2148(-32, false);
            this.field984.method2188(false, false);
            this.field984.method2139(2929, false);
            this.field984.method2125(0, false);
            this.field984.method2195(-74, 0);
            this.field984.method2140(0, -2);
            this.field984.method2120(-1, (class411) null);
            class354.field4732[11] = 0.0F;
            class354.field4732[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field984.field4882) + 1.0F;
            class354.field4732[2] = 0.0F;
            class354.field4732[14] = 0.0F;
            class354.field4732[4] = 0.0F;
            class354.field4732[6] = 0.0F;
            class354.field4732[7] = 0.0F;
            class354.field4732[5] = (float) arg2 / ((float) super.field5561 * 128.0F * (float) this.field984.field4882);
            class354.field4732[15] = 1.0F;
            class354.field4732[0] = (float) arg2 / ((float) super.field5561 * 128.0F * (float) this.field984.field4917);
            class354.field4732[3] = 0.0F;
            class354.field4732[10] = 0.0F;
            class354.field4732[8] = 0.0F;
            class354.field4732[1] = 0.0F;
            class354.field4732[9] = 0.0F;
            class354.field4732[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field984.field4917) + -1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class354.field4732, 0);
            class354.field4732[15] = 1.0F;
            class354.field4732[10] = 0.0F;
            class354.field4732[8] = 0.0F;
            class354.field4732[4] = 0.0F;
            class354.field4732[7] = 0.0F;
            class354.field4732[9] = 1.0F;
            class354.field4732[1] = 0.0F;
            class354.field4732[0] = 1.0F;
            class354.field4732[3] = 0.0F;
            class354.field4732[13] = 0.0F;
            class354.field4732[11] = 0.0F;
            class354.field4732[12] = 0.0F;
            class354.field4732[5] = 0.0F;
            class354.field4732[14] = 0.0F;
            class354.field4732[6] = 1.0F;
            class354.field4732[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class354.field4732, 0);
            if (~(this.field978 & 7) != -1) {
                this.field984.method2188(false, true);
                this.field984.method2115(0);
            } else {
                this.field984.method2188(false, false);
            }
            this.field984.method2181(this.field1021, this.field1015, this.field1022, this.field1011, 15063);
            if (~this.field984.field5044.field2325.length > ~(this.field985 * 2)) {
                this.field984.field5044 = new class552(this.field985 * 2);
            } else {
                this.field984.field5044.field2354 = 0;
            }
            int var9 = 0;
            class552 var10 = this.field984.field5044;
            if (this.field984.field5025) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field5569 * var11 - -arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field983[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method1157(var14[var15] & 65535, (byte) 118);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field5569 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field983[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    ++var9;
                                    var10.method1098(65535 & var20[var21], (byte) -71);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class584 var17 = new class584(this.field984, 5123, var10.field2325, var10.field2354);
                this.field984.method2183(var9, 0, -30308, 4, var17);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Leq;IIII[[I[[II)V", line = 205)
    public class74(class357 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field984 = arg0;
        this.field998 = new byte[arg3][arg4];
        this.field979 = new int[arg3][arg4][];
        this.field1020 = new float[super.field5569 + 1][super.field5562 + 1];
        this.field983 = new short[arg3 * arg4][];
        this.field1017 = new byte[arg3 + 1][arg4 + 1];
        this.field978 = arg2;
        this.field980 = new int[arg3][arg4][];
        this.field1019 = new float[super.field5569 + 1][super.field5562 + 1];
        this.field1004 = 1 << this.field1001;
        this.field1016 = new float[super.field5569 + 1][super.field5562 + 1];
        this.field997 = new class164[arg3][arg4][];
        this.field981 = new int[arg3][arg4][];
        this.field1008 = new int[arg3][arg4][];
        this.field1000 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field5562 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field5569 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field1019[var10][var9] = (float) var11 * var13;
                this.field1020[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field1016[var10][var9] = (float) var12 * var13;
            }
        }
        this.field1018 = new class583(128);
        if (~(16 & this.field978) != -1) {
            this.field996 = new class679(this.field984, this);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 263)
    public static void method542(byte arg0) {
        field1007 = null;
        if (arg0 != -12) {
            field1006 = 111;
        }
        field990 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lkw;IIB)V", line = 276)
    private final void method543(class8 arg0, int arg1, int arg2, byte arg3) {
        ++field999;
        int[] var5 = this.field1000[arg2][arg1];
        int[] var6 = this.field979[arg2][arg1];
        if (arg3 <= 101) {
            this.method539((class621) null, (int[]) null);
        }
        int var7 = var5.length;
        if (~var7 < ~this.field984.field5107.length) {
            this.field984.field5105 = new int[var7];
            this.field984.field5107 = new int[var7];
        }
        int[] var8 = this.field984.field5107;
        int[] var9 = this.field984.field5105;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field984.field4956;
            var9[var10] = var6[var10] >> this.field984.field4956;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                arg0.method37(var15, var13, var14, var12, -91, var16, var17);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III[[ZZI)V", line = 340)
    public final void method544(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field987;
        this.method554(arg3, arg2, arg1, arg5, arg4, arg0, 0, -1);
    }

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 354)
    public final void method545(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field976;
        if (arg3 != null && this.field980 == null) {
            this.field980 = new int[super.field5569][super.field5562][];
        }
        class96 var15 = this.field984.field6364;
        if (arg5 != null && this.field1009 == null) {
            this.field1009 = new int[super.field5569][super.field5562][];
        }
        this.field1000[arg0][arg1] = arg2;
        this.field979[arg0][arg1] = arg4;
        this.field981[arg0][arg1] = arg6;
        this.field1008[arg0][arg1] = arg7;
        if (this.field1009 != null) {
            this.field1009[arg0][arg1] = arg5;
        }
        if (this.field980 != null) {
            this.field980[arg0][arg1] = arg3;
        }
        class164[] var16 = this.field997[arg0][arg1] = new class164[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field978 & 32) != -1 && ~var18 != 0 && var15.method389(9559, var18).field1167) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) var18;
            class627 var22;
            for (var22 = this.field1018.method3248(var20, 0); var22 != null; var22 = this.field1018.method3246((byte) 60)) {
                class164 var23 = (class164) var22;
                if (~var23.field2096 == ~var18 && (float) var19 == var23.field2086 && ~var23.field2104 == ~arg10 && ~var23.field2095 == ~arg11 && var23.field2092 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class164(this, var18, var19, arg10, arg11, arg12);
                this.field1018.method3249(var20, var16[var17], (byte) -66);
            } else {
                var16[var17] = (class164) var22;
            }
        }
        if (arg13) {
            this.field998[arg0][arg1] = (byte) class216.method1308(this.field998[arg0][arg1], 1);
        }
        if (arg6.length > this.field1012) {
            this.field1012 = arg6.length;
        }
        this.field1014 += arg6.length;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 435)
    public final boolean method546(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field988;
        if (this.field996 != null && arg0 != null) {
            int var7 = -(this.field984.field5035 * arg2 >> 8) + arg1 >> this.field984.field4956;
            int var8 = arg3 - (this.field984.field5023 * arg2 >> 8) >> this.field984.field4956;
            return this.field996.method3644(var7, arg0, -87, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "YA", descriptor = "()V", line = 459)
    public final void method547() {
        ++field992;
        if (~this.field1014 < -1) {
            byte[][] var1 = new byte[super.field5569 + 1][super.field5562 - -1];
            for (int var2 = 1; var2 < super.field5569; ++var2) {
                for (int var103 = 1; ~super.field5562 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field1017[var2][var103] >> 1) + (this.field1017[var2][var103 + 1] >> 3) + (this.field1017[var2][var103 + -1] >> 2) + (this.field1017[var2 + -1][var103] >> 2) + (this.field1017[var2 + 1][var103] >> 3));
                }
            }
            this.field1013 = new class164[this.field1018.method3244((byte) 127)];
            this.field1018.method3250(this.field1013, 0);
            for (int var3 = 0; this.field1013.length > var3; ++var3) {
                this.field1013[var3].method1014(this.field1014, false);
            }
            int var4 = 24;
            if (this.field1009 != null) {
                var4 += 4;
            }
            if (~(7 & this.field978) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field984.field4955.method2221(this.field1014 * var4, false);
            Stream var6 = new Stream(var5);
            class164[] var7 = new class164[this.field1014];
            int var8 = class568.method3199(false, this.field1014 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class583 var9 = new class583(var8);
            class164[] var10 = new class164[this.field1012];
            for (int var11 = 0; ~var11 > ~super.field5569; ++var11) {
                for (int var30 = 0; super.field5562 > var30; ++var30) {
                    if (this.field981[var11][var30] != null) {
                        class164[] var31 = this.field997[var11][var30];
                        int[] var32 = this.field1000[var11][var30];
                        int[] var33 = this.field979[var11][var30];
                        int[] var34 = this.field1008[var11][var30];
                        int[] var35 = this.field981[var11][var30];
                        int[] var36 = this.field980 != null ? this.field980[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field1009 != null ? this.field1009[var11][var30] : null;
                        float var38 = this.field1019[var11][var30];
                        float var39 = this.field1020[var11][var30];
                        float var40 = this.field1016[var11][var30];
                        float var41 = this.field1019[var11][var30 + 1];
                        float var42 = this.field1020[var11][var30 + 1];
                        float var43 = this.field1016[var11][var30 + 1];
                        float var44 = this.field1019[var11 + 1][var30 + 1];
                        float var45 = this.field1020[var11 + 1][var30 - -1];
                        float var46 = this.field1016[var11 + 1][var30 + 1];
                        float var47 = this.field1019[var11 + 1][var30];
                        float var48 = this.field1020[var11 + 1][var30];
                        float var49 = this.field1016[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label339: for (int var55 = 0; var35.length > var55; ++var55) {
                            class164 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field983[super.field5569 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field5570) - -var32[var57];
                            int var59 = (var30 << super.field5570) - -var33[var57];
                            int var60 = var58 >> this.field1001;
                            int var61 = var59 >> this.field1001;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) var62 << 32 | (long) var63 << 48 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var40;
                                var75 = var39;
                            } else if (~var67 == -1 && ~super.field5561 == ~var68) {
                                var73 = var41;
                                var75 = var42;
                                var72 = var69 - var51;
                                var74 = var43;
                            } else if (~super.field5561 == ~var67 && super.field5561 == var68) {
                                var72 = var69 - var52;
                                var73 = var44;
                                var75 = var45;
                                var74 = var46;
                            } else if (~super.field5561 == ~var67 && ~var68 == -1) {
                                var72 = var69 - var53;
                                var73 = var47;
                                var75 = var48;
                                var74 = var49;
                            } else {
                                float var76 = (float) var67 / (float) super.field5561;
                                float var77 = (float) var68 / (float) super.field5561;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var73 = (-var78 + var81) * var77 + var78;
                                var75 = (var82 - var79) * var77 + var79;
                                var74 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field5570) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field5570) + var51;
                                var72 = var69 - (((var85 - var84) * var68 >> super.field5570) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class198.field2542[var62 & 65408 | var86];
                                if ((7 & this.field978) == 0) {
                                    float var87 = this.field984.field5031[2] * var74 + this.field984.field5031[0] * var73 + this.field984.field5031[1] * var75;
                                    var71 = this.field984.field5052 + var87 * (!(var87 > 0.0F) ? this.field984.field5101 : this.field984.field4994);
                                }
                            }
                            class627 var88 = null;
                            if ((var58 & this.field1004 - 1) == 0 && (this.field1004 + -1 & var59) == 0) {
                                var88 = var9.method3248(var65, 0);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (var62 == var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var72 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class198.field2542[65408 & var63 | var90];
                                    if ((7 & this.field978) == 0) {
                                        float var91 = this.field984.field5031[2] * var74 + this.field984.field5031[1] * var75 + this.field984.field5031[0] * var73;
                                        float var92 = this.field984.field5052 + (var71 > 0.0F ? this.field984.field4994 : this.field984.field5101) * var71;
                                        int var93 = (16734240 & var89) >> 16;
                                        int var94 = var89 >> 8 & 255;
                                        int var95 = var89 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var96 <= -1) {
                                            if (var96 > 255) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (~var98 <= -1) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var98 | var97 << 8 | var96 << 16;
                                    }
                                }
                                if (!this.field984.field5025) {
                                    var6.method2237((float) var58);
                                    var6.method2237((float) (var64 + this.method2382((byte) 19, var59, var58)));
                                    var6.method2237((float) var59);
                                    var6.method2227((byte) (var89 >> 16));
                                    var6.method2227((byte) (var89 >> 8));
                                    var6.method2227((byte) var89);
                                    var6.method2227(-1);
                                    var6.method2237((float) var58);
                                    var6.method2237((float) var59);
                                    if (this.field1009 != null) {
                                        var6.method2237((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field978) != -1) {
                                        var6.method2237(var73);
                                        var6.method2237(var75);
                                        var6.method2237(var74);
                                    }
                                } else {
                                    var6.method2229((float) var58);
                                    var6.method2229((float) (this.method2382((byte) 19, var59, var58) - -var64));
                                    var6.method2229((float) var59);
                                    var6.method2227((byte) (var89 >> 16));
                                    var6.method2227((byte) (var89 >> 8));
                                    var6.method2227((byte) var89);
                                    var6.method2227(-1);
                                    var6.method2229((float) var58);
                                    var6.method2229((float) var59);
                                    if (this.field1009 != null) {
                                        var6.method2229((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if ((this.field978 & 7) != 0) {
                                        var6.method2229(var73);
                                        var6.method2229(var75);
                                        var6.method2229(var74);
                                    }
                                }
                                var99 = this.field982++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method3249(var65, new class397(var56[var57]), (byte) 47);
                            } else {
                                var56[var57] = ((class397) var88).field5516;
                                var99 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var31[var57].field8746 > ~var7[var99].field8746) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1010(var71, false, var70, var99, var72);
                            }
                            ++this.field985;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field982 < ~var12; ++var12) {
                class164 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1008(var12, false);
                }
            }
            for (int var13 = 0; ~super.field5569 < ~var13; ++var13) {
                for (int var18 = 0; ~super.field5562 < ~var18; ++var18) {
                    short[] var19 = this.field983[super.field5569 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class164 var25 = var7[var22];
                            class164 var26 = var7[var23];
                            class164 var27 = var7[var24];
                            class164 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1009(true, var13, var18, var20);
                            }
                            if (var26 != null) {
                                var26.method1009(true, var13, var18, var20);
                                if (var28 == null || var28.field8746 > var26.field8746) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1009(true, var13, var18, var20);
                                if (var28 == null || var27.field8746 < var28.field8746) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1008(var22, false);
                                }
                                if (var26 != null) {
                                    var28.method1008(var23, false);
                                }
                                if (var27 != null) {
                                    var28.method1008(var24, false);
                                }
                                var28.method1009(true, var13, var18, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2223();
            this.field1010 = this.field984.method2144(var4, var6.method2231(), var5, false, (byte) -91);
            this.field1015 = new class88(this.field1010, 5126, 3, 0);
            this.field1022 = new class88(this.field1010, 5121, 4, 12);
            byte var14;
            if (this.field1009 == null) {
                this.field1011 = new class88(this.field1010, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field1011 = new class88(this.field1010, 5126, 3, 16);
                var14 = 28;
            }
            if (~(7 & this.field978) != -1) {
                this.field1021 = new class88(this.field1010, 5126, 3, var14);
            }
            long[] var15 = new long[this.field1013.length];
            for (int var16 = 0; ~this.field1013.length < ~var16; ++var16) {
                class164 var17 = this.field1013[var16];
                var15[var16] = var17.field8746;
                var17.method1012(this.field982, 10944);
            }
            class250.method1523(this.field1013, var15, 1);
            if (this.field996 != null) {
                this.field996.method3643((byte) 111);
            }
        } else {
            this.field996 = null;
        }
        this.field1009 = null;
        this.field1000 = this.field979 = null;
        this.field980 = null;
        this.field997 = null;
        this.field1017 = null;
        this.field981 = null;
        this.field1008 = null;
        this.field1018 = null;
        this.field1019 = this.field1020 = this.field1016 = null;
    }

    @OriginalMember(owner = "client!qh", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1034)
    public final void method548(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field975;
        if (this.field996 != null && arg0 != null) {
            int var7 = arg1 - (this.field984.field5035 * arg2 >> 8) >> this.field984.field4956;
            int var8 = -(this.field984.field5023 * arg2 >> 8) + arg3 >> this.field984.field4956;
            this.field996.method3647(var7, -127, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V", line = 1053)
    public final void method549(int arg0, int arg1) {
        ++field989;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III[[ZZII)V", line = 1062)
    public final void method550(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method554(arg3, arg2, arg1, arg6, arg4, arg0, 0, arg5);
        ++field1002;
    }

    @OriginalMember(owner = "client!qh", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1071)
    public final void method551(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field977;
        if (this.field996 != null && arg0 != null) {
            int var7 = -(this.field984.field5035 * arg2 >> 8) + arg1 >> this.field984.field4956;
            int var8 = -(this.field984.field5023 * arg2 >> 8) + arg3 >> this.field984.field4956;
            this.field996.method3646(arg0, -117, var8, var7);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1089)
    public final void method552(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field995;
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
        this.method545(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!qh", name = "fa", descriptor = "(IILr;)Lr;", line = 1177)
    public final class108 method553(int arg0, int arg1, class108 arg2) {
        ++field974;
        if (~(1 & this.field998[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field5561 >> this.field984.field4956;
            class8 var5 = (class8) arg2;
            class8 var6;
            if (var5 != null && var5.method34(var4, (byte) -94, var4)) {
                var6 = var5;
                var5.method38((byte) 52);
            } else {
                var6 = new class8(this.field984, var4, var4);
            }
            var6.method35(0, var4, 0, 0, var4);
            this.method543(var6, arg1, arg0, (byte) 126);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([[ZIIIZIII)V", line = 1207)
    private final void method554(boolean[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field986;
        if (arg6 != 0) {
            this.method546((class108) null, 105, 20, -41, 0, true);
        }
        if (this.field1013 != null) {
            int var9 = arg1 + arg1 - -1;
            int var10 = var9 * var9;
            if (~var10 < ~this.field984.field5109.length) {
                this.field984.field5109 = new int[var10];
            }
            if (~(this.field985 * 2) < ~this.field984.field5044.field2325.length) {
                this.field984.field5044 = new class552(this.field985 * 2);
            }
            int var11 = -arg1 + arg5;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg1 + arg2;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg1 + arg5;
            if (var15 > super.field5569 - 1) {
                var15 = super.field5569 + -1;
            }
            int var16 = arg1 + arg2;
            if (~var16 < ~(super.field5562 - 1)) {
                var16 = super.field5562 - 1;
            }
            int var17 = 0;
            int[] var18 = this.field984.field5109;
            for (int var19 = var11; ~var15 <= ~var19; ++var19) {
                boolean[] var25 = arg0[-var12 + var19];
                for (int var26 = var13; var26 <= var16; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field5569 * var26 - -var19;
                    }
                }
            }
            if (arg7 != -1) {
                this.field984.method2147((byte) 112, (float) arg7);
                this.field984.method2164(true);
            } else {
                this.field984.method2126(1);
            }
            this.field984.method2188(false, (7 & this.field978) != 0);
            for (int var20 = 0; this.field1013.length > var20; ++var20) {
                this.field1013[var20].method1013(arg6 + -128, var17, var18);
            }
            if (!this.field1005.method3112(-4)) {
                int var21 = this.field984.field5024;
                int var22 = this.field984.field5063;
                this.field984.method130(0, var22, this.field984.field5047);
                this.field984.method2188(false, false);
                this.field984.method2125(0, false);
                this.field984.method2195(53, 128);
                this.field984.method2140(arg6, -2);
                this.field984.method2120(-1, this.field984.field5037);
                this.field984.method2165((byte) 74, 7681, 8448);
                this.field984.method2132(770, (byte) -85, 34166, 0);
                this.field984.method2189(34167, true, 0, 770);
                for (class627 var23 = this.field1005.method3111(105); var23 != null; var23 = this.field1005.method3116(-106)) {
                    class205 var24 = (class205) var23;
                    var24.method1265(arg1, arg2, arg0, (byte) 97, arg5);
                }
                this.field984.method2132(768, (byte) 111, 5890, 0);
                this.field984.method2189(5890, true, 0, 770);
                this.field984.method2120(~arg6, (class411) null);
                this.field984.method130(var21, var22, this.field984.field5047);
            }
            if (this.field996 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field984.method2181((class88) null, this.field1015, (class88) null, this.field1011, 15063);
                this.field996.method3649(arg2, arg0, arg1, false, arg4, arg5);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }
}
