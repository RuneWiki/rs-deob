import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class375 extends class339 {

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "Lfha;")
    private class522 field5202 = new class522();

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    private int field5194 = this.field4349 + -2;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "Lep;")
    public class371 field5193;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "[[[I")
    private int[][][] field5180;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "[[[I")
    public int[][][] field5188;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    private int field5181;

    @OriginalMember(owner = "client!dn", name = "X", descriptor = "[[F")
    private float[][] field5211;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "[[[Llj;")
    private class213[][][] field5183;

    @OriginalMember(owner = "client!dn", name = "fb", descriptor = "[[F")
    private float[][] field5219;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "[[S")
    public short[][] field5179;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "[[[I")
    public int[][][] field5185;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "[[[I")
    public int[][][] field5198;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "[[[I")
    private int[][][] field5170;

    @OriginalMember(owner = "client!dn", name = "Z", descriptor = "[[B")
    private byte[][] field5213;

    @OriginalMember(owner = "client!dn", name = "T", descriptor = "[[B")
    private byte[][] field5207;

    @OriginalMember(owner = "client!dn", name = "cb", descriptor = "[[F")
    private float[][] field5216;

    @OriginalMember(owner = "client!dn", name = "W", descriptor = "Lgca;")
    private class209 field5210;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "Lem;")
    private class628 field5196;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "Lqk;")
    public static class148 field5200 = new class148(88, 6);

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "[I")
    public static int[] field5208 = new int[32];

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    private int field5195;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!dn", name = "R", descriptor = "I")
    private int field5205;

    @OriginalMember(owner = "client!dn", name = "S", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!dn", name = "V", descriptor = "I")
    private int field5209;

    @OriginalMember(owner = "client!dn", name = "Y", descriptor = "I")
    private int field5212;

    @OriginalMember(owner = "client!dn", name = "gb", descriptor = "Lhu;")
    private class227 field5220;

    @OriginalMember(owner = "client!dn", name = "eb", descriptor = "Leg;")
    public static class317 field5218;

    @OriginalMember(owner = "client!dn", name = "ab", descriptor = "Leca;")
    public class329 field5214;

    @OriginalMember(owner = "client!dn", name = "db", descriptor = "Leca;")
    public class329 field5217;

    @OriginalMember(owner = "client!dn", name = "hb", descriptor = "Leca;")
    public class329 field5221;

    @OriginalMember(owner = "client!dn", name = "ib", descriptor = "Leca;")
    private class329 field5222;

    @OriginalMember(owner = "client!dn", name = "bb", descriptor = "[Llj;")
    private class213[] field5215;

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "[[[I")
    private int[][][] field5203;

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field5208[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I", line = 4)
    public static final int method2259(int arg0, int arg1) {
        return class326.field4198 != null ? class326.field4198[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 9)
    public final boolean method515(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5191;
        if (this.field5196 != null && arg0 != null) {
            int var7 = -(this.field5193.field5092 * arg2 >> 8) + arg1 >> this.field5193.field4953;
            int var8 = -(this.field5193.field5072 * arg2 >> 8) + arg3 >> this.field5193.field4953;
            return this.field5196.method3670(arg0, var7, var8, -13500);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lkb;[I)V", line = 27)
    public final void method513(class757 arg0, int[] arg1) {
        ++field5199;
        this.field5202.method3116(29066, new class448(this.field5193, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!dn", name = "ka", descriptor = "(III)V", line = 39)
    public final void method516(int arg0, int arg1, int arg2) {
        ++field5190;
        if (arg2 > (255 & this.field5213[arg0][arg1])) {
            this.field5213[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII[[Z)V", line = 58)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5171;
        if (this.field5209 > 0) {
            this.field5193.method2111(-12787);
            this.field5193.method2150(false, 0);
            this.field5193.method2197(false, (byte) -88);
            this.field5193.method2204(false, false);
            this.field5193.method2192(90, false);
            this.field5193.method2121(0, 1);
            this.field5193.method2103((byte) -22, -2);
            this.field5193.method2154((class396) null, -2);
            class120.field1654[11] = 0.0F;
            class120.field1654[14] = 0.0F;
            class120.field1654[1] = 0.0F;
            class120.field1654[0] = (float) arg2 / ((float) super.field4346 * 128.0F * (float) this.field5193.field4820);
            class120.field1654[10] = 0.0F;
            class120.field1654[4] = 0.0F;
            class120.field1654[7] = 0.0F;
            class120.field1654[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5193.field4894;
            class120.field1654[2] = 0.0F;
            class120.field1654[6] = 0.0F;
            class120.field1654[5] = (float) arg2 / ((float) super.field4346 * 128.0F * (float) this.field5193.field4894);
            class120.field1654[15] = 1.0F;
            class120.field1654[8] = 0.0F;
            class120.field1654[3] = 0.0F;
            class120.field1654[9] = 0.0F;
            class120.field1654[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5193.field4820) + -1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class120.field1654, 0);
            class120.field1654[8] = 0.0F;
            class120.field1654[0] = 1.0F;
            class120.field1654[13] = 0.0F;
            class120.field1654[5] = 0.0F;
            class120.field1654[12] = 0.0F;
            class120.field1654[6] = 1.0F;
            class120.field1654[4] = 0.0F;
            class120.field1654[10] = 0.0F;
            class120.field1654[7] = 0.0F;
            class120.field1654[9] = 1.0F;
            class120.field1654[2] = 0.0F;
            class120.field1654[14] = 0.0F;
            class120.field1654[3] = 0.0F;
            class120.field1654[15] = 1.0F;
            class120.field1654[1] = 0.0F;
            class120.field1654[11] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class120.field1654, 0);
            if (~(7 & this.field5197) == -1) {
                this.field5193.method2197(false, (byte) -88);
            } else {
                this.field5193.method2197(true, (byte) -88);
                this.field5193.method2108(0);
            }
            this.field5193.method2172(this.field5222, 32886, this.field5217, this.field5214, this.field5221);
            if (~(this.field5205 * 2) < ~this.field5193.field5033.field279.length) {
                this.field5193.field5033 = new class128(this.field5205 * 2);
            } else {
                this.field5193.field5033.field330 = 0;
            }
            int var9 = 0;
            class128 var10 = this.field5193.field5033;
            if (!this.field5193.field4992) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field4344 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[var13 - arg3][-arg4 + var11]) {
                            short[] var14 = this.field5179[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method139(var14[var15] & 65535, -128);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field4344 * var16 - -arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[var19 - arg3][-arg4 + var16]) {
                            short[] var20 = this.field5179[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    var10.method147((byte) 53, 65535 & var20[var21]);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class319 var17 = new class319(this.field5193, 5123, var10.field279, var10.field330);
                this.field5193.method2229(4, 32, var9, 0, var17);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[[ZZI)V", line = 234)
    public final void method510(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field5192;
        this.method2266(-61, arg5, arg1, -1, arg0, arg4, arg2, arg3);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lep;IIII[[I[[II)V", line = 242)
    public class375(class371 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5193 = arg0;
        this.field5180 = new int[arg3][arg4][];
        this.field5197 = arg2;
        this.field5188 = new int[arg3][arg4][];
        this.field5181 = 1 << this.field5194;
        this.field5211 = new float[super.field4344 - -1][super.field4348 - -1];
        this.field5183 = new class213[arg3][arg4][];
        this.field5219 = new float[super.field4344 + 1][super.field4348 - -1];
        this.field5179 = new short[arg3 * arg4][];
        this.field5185 = new int[arg3][arg4][];
        this.field5198 = new int[arg3][arg4][];
        this.field5170 = new int[arg3][arg4][];
        this.field5213 = new byte[arg3 - -1][arg4 + 1];
        this.field5207 = new byte[arg3][arg4];
        this.field5216 = new float[super.field4344 + 1][super.field4348 + 1];
        for (int var9 = 1; ~super.field4348 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field4344 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 - -(var12 * var12))));
                this.field5216[var10][var9] = (float) var11 * var13;
                this.field5211[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5219[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5210 = new class209(128);
        if ((this.field5197 & 16) != 0) {
            this.field5196 = new class628(this.field5193, this);
        }
    }

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 298)
    public final void method508(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field5189;
        if (arg5 != null && this.field5203 == null) {
            this.field5203 = new int[super.field4344][super.field4348][];
        }
        if (arg3 != null && this.field5170 == null) {
            this.field5170 = new int[super.field4344][super.field4348][];
        }
        class268 var15 = this.field5193.field7694;
        this.field5188[arg0][arg1] = arg2;
        this.field5198[arg0][arg1] = arg4;
        this.field5185[arg0][arg1] = arg6;
        this.field5180[arg0][arg1] = arg7;
        if (this.field5203 != null) {
            this.field5203[arg0][arg1] = arg5;
        }
        if (this.field5170 != null) {
            this.field5170[arg0][arg1] = arg3;
        }
        class213[] var16 = this.field5183[arg0][arg1] = new class213[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((32 & this.field5197) != 0 && ~var18 != 0 && var15.method91(var18, -22805).field6389) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) var18;
            class513 var22;
            for (var22 = this.field5210.method1381(true, var20); var22 != null; var22 = this.field5210.method1391(-1)) {
                class213 var23 = (class213) var22;
                if (var23.field2992 == var18 && (float) var19 == var23.field2993 && var23.field2994 == arg10 && ~var23.field2995 == ~arg11 && ~var23.field3009 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class213(this, var18, var19, arg10, arg11, arg12);
                this.field5210.method1387(var16[var17], var20, (byte) -111);
            } else {
                var16[var17] = (class213) var22;
            }
        }
        if (arg13) {
            this.field5207[arg0][arg1] = (byte) class747.method4153(this.field5207[arg0][arg1], 1);
        }
        if (~this.field5212 > ~arg6.length) {
            this.field5212 = arg6.length;
        }
        this.field5209 += arg6.length;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 378)
    public static void method2260(int arg0) {
        field5218 = null;
        int var1 = 7 % ((arg0 - -10) / 59);
        field5208 = null;
        field5200 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZ)V", line = 390)
    public static final void method2261(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field5200 = null;
        }
        ++field5173;
        class118 var4 = class126.method814(true, arg2, 11);
        var4.method771(-30559);
        var4.field1629 = arg1;
        var4.field1636 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BII)V", line = 407)
    public static final void method2262(byte arg0, int arg1, int arg2) {
        if (arg0 != 24) {
            method2265(6, -3, -84, 121, 39, (class545) null);
        }
        ++field5187;
        class118 var3 = class126.method814(true, arg2, 6);
        var3.method771(-30559);
        var3.field1636 = arg1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[[ZZII)V", line = 421)
    public final void method517(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field5204;
        this.method2266(-109, arg6, arg1, arg5, arg0, arg4, arg2, arg3);
    }

    @OriginalMember(owner = "client!dn", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 430)
    public final void method500(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5172;
        if (this.field5196 != null && arg0 != null) {
            int var7 = -(this.field5193.field5092 * arg2 >> 8) + arg1 >> this.field5193.field4953;
            int var8 = arg3 - (this.field5193.field5072 * arg2 >> 8) >> this.field5193.field4953;
            this.field5196.method3663(arg0, var8, (byte) 96, var7);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIBLov;)V", line = 447)
    private final void method2263(int arg0, int arg1, byte arg2, class668 arg3) {
        ++field5206;
        int[] var5 = this.field5188[arg0][arg1];
        int[] var6 = this.field5198[arg0][arg1];
        int var7 = var5.length;
        if (var7 > this.field5193.field5100.length) {
            this.field5193.field5099 = new int[var7];
            this.field5193.field5100 = new int[var7];
        }
        int[] var8 = this.field5193.field5100;
        int[] var9 = this.field5193.field5099;
        if (arg2 < -122) {
            for (int var10 = 0; var10 < var7; ++var10) {
                var8[var10] = var5[var10] >> this.field5193.field4953;
                var9[var10] = var6[var10] >> this.field5193.field4953;
            }
            int var11 = 0;
            while (~var11 > ~var7) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if ((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                    arg3.method3826(var16, var17, var15, 0, var13, var14, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "YA", descriptor = "()V", line = 517)
    public final void method514() {
        ++field5201;
        if (this.field5209 > 0) {
            byte[][] var1 = new byte[super.field4344 + 1][super.field4348 + 1];
            for (int var2 = 1; ~super.field4344 < ~var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field4348; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5213[var2][var103] >> 1) + (this.field5213[var2][var103 + 1] >> 3) + (this.field5213[var2][var103 + -1] >> 2) + (this.field5213[var2 + -1][var103] >> 2) + (this.field5213[var2 + 1][var103] >> 3));
                }
            }
            this.field5215 = new class213[this.field5210.method1388(false)];
            this.field5210.method1384(0, this.field5215);
            for (int var3 = 0; ~var3 > ~this.field5215.length; ++var3) {
                this.field5215[var3].method1404(this.field5209, -19472);
            }
            int var4 = 24;
            if (this.field5203 != null) {
                var4 += 4;
            }
            if ((this.field5197 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field5193.field4949.method2558(this.field5209 * var4, false);
            Stream var6 = new Stream(var5);
            class213[] var7 = new class213[this.field5209];
            int var8 = class655.method3787((byte) 120, this.field5209 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class209 var9 = new class209(var8);
            class213[] var10 = new class213[this.field5212];
            for (int var11 = 0; super.field4344 > var11; ++var11) {
                for (int var30 = 0; super.field4348 > var30; ++var30) {
                    if (this.field5185[var11][var30] != null) {
                        class213[] var31 = this.field5183[var11][var30];
                        int[] var32 = this.field5188[var11][var30];
                        int[] var33 = this.field5198[var11][var30];
                        int[] var34 = this.field5180[var11][var30];
                        int[] var35 = this.field5185[var11][var30];
                        int[] var36 = this.field5170 != null ? this.field5170[var11][var30] : null;
                        int[] var37 = this.field5203 == null ? null : this.field5203[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field5216[var11][var30];
                        float var39 = this.field5211[var11][var30];
                        float var40 = this.field5219[var11][var30];
                        float var41 = this.field5216[var11][var30 - -1];
                        float var42 = this.field5211[var11][var30 + 1];
                        float var43 = this.field5219[var11][var30 + 1];
                        float var44 = this.field5216[var11 - -1][var30 + 1];
                        float var45 = this.field5211[var11 + 1][var30 + 1];
                        float var46 = this.field5219[var11 + 1][var30 - -1];
                        float var47 = this.field5216[var11 + 1][var30];
                        float var48 = this.field5211[var11 - -1][var30];
                        float var49 = this.field5219[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 + 1][var30 + 1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label342: for (int var55 = 0; var35.length > var55; ++var55) {
                            class213 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label342;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5179[super.field4344 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field4349) - -var32[var57];
                            int var59 = (var30 << super.field4349) + var33[var57];
                            int var60 = var58 >> this.field5194;
                            int var61 = var59 >> this.field5194;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            int var71;
                            float var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && ~var68 == -1) {
                                var71 = var69 - var50;
                                var72 = var39;
                                var73 = var38;
                                var74 = var40;
                            } else if (~var67 == -1 && super.field4346 == var68) {
                                var74 = var43;
                                var71 = var69 - var51;
                                var72 = var42;
                                var73 = var41;
                            } else if (super.field4346 == var67 && super.field4346 == var68) {
                                var71 = var69 - var52;
                                var74 = var46;
                                var73 = var44;
                                var72 = var45;
                            } else if (~super.field4346 == ~var67 && ~var68 == -1) {
                                var73 = var47;
                                var71 = var69 - var53;
                                var72 = var48;
                                var74 = var49;
                            } else {
                                float var75 = (float) var67 / (float) super.field4346;
                                float var76 = (float) var68 / (float) super.field4346;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                var72 = (-var78 + var81) * var76 + var78;
                                var73 = (-var77 + var80) * var76 + var77;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var74 = (var82 - var79) * var76 + var79;
                                int var83 = var50 - -((-var50 + var53) * var67 >> super.field4349);
                                int var84 = ((-var51 + var52) * var67 >> super.field4349) + var51;
                                var71 = var69 - (((-var83 + var84) * var68 >> super.field4349) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var71 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if ((7 & this.field5197) == 0) {
                                    float var87 = this.field5193.field5022[2] * var74 + this.field5193.field5022[0] * var73 + this.field5193.field5022[1] * var72;
                                    var85 = this.field5193.field5046 + (!(var87 > 0.0F) ? this.field5193.field5008 : this.field5193.field4987) * var87;
                                }
                                var70 = class673.field9471[var62 & 65408 | var86];
                            }
                            class513 var88 = null;
                            if ((this.field5181 + -1 & var58) == 0 && (var59 & this.field5181 + -1) == 0) {
                                var88 = var9.method1381(true, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (var62 != var63) {
                                    int var89 = (127 & var63) * var71 >> 7;
                                    if (~var89 > -3) {
                                        var89 = 2;
                                    } else if (var89 > 126) {
                                        var89 = 126;
                                    }
                                    var90 = class673.field9471[var89 | 65408 & var63];
                                    if ((7 & this.field5197) == 0) {
                                        float var91 = this.field5193.field5022[2] * var74 + this.field5193.field5022[0] * var73 + this.field5193.field5022[1] * var72;
                                        float var92 = this.field5193.field5046 + var85 * (var85 > 0.0F ? this.field5193.field4987 : this.field5193.field5008);
                                        int var93 = var90 >> 16 & 255;
                                        int var94 = 255 & var90 >> 8;
                                        int var95 = var90 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (~var96 > -1) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var90 = var97 << 8 | var96 << 16 | var98;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (!this.field5193.field4992) {
                                    var6.method2550((float) var58);
                                    var6.method2550((float) (var64 + this.method1960(var58, var59, 117)));
                                    var6.method2550((float) var59);
                                    var6.method2542((byte) (var90 >> 16));
                                    var6.method2542((byte) (var90 >> 8));
                                    var6.method2542((byte) var90);
                                    var6.method2542(-1);
                                    var6.method2550((float) var58);
                                    var6.method2550((float) var59);
                                    if (this.field5203 != null) {
                                        var6.method2550((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if (~(7 & this.field5197) != -1) {
                                        var6.method2550(var73);
                                        var6.method2550(var72);
                                        var6.method2550(var74);
                                    }
                                } else {
                                    var6.method2552((float) var58);
                                    var6.method2552((float) (this.method1960(var58, var59, 126) + var64));
                                    var6.method2552((float) var59);
                                    var6.method2542((byte) (var90 >> 16));
                                    var6.method2542((byte) (var90 >> 8));
                                    var6.method2542((byte) var90);
                                    var6.method2542(-1);
                                    var6.method2552((float) var58);
                                    var6.method2552((float) var59);
                                    if (this.field5203 != null) {
                                        var6.method2552((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if (~(this.field5197 & 7) != -1) {
                                        var6.method2552(var73);
                                        var6.method2552(var72);
                                        var6.method2552(var74);
                                    }
                                }
                                var99 = this.field5195++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method1387(new class366(var56[var57]), var65, (byte) -118);
                            } else {
                                var56[var57] = ((class366) var88).field4701;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var99].field7166 > var31[var57].field7166) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1405(true, var70, var71, var85, var99);
                            }
                            ++this.field5205;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field5195; ++var12) {
                class213 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1410(true, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field4344; ++var13) {
                for (int var18 = 0; ~super.field4348 < ~var18; ++var18) {
                    short[] var19 = this.field5179[super.field4344 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class213 var25 = var7[var22];
                            class213 var26 = var7[var23];
                            class213 var27 = var7[var24];
                            class213 var28 = null;
                            if (var25 != null) {
                                var25.method1411(var20, var18, var13, (byte) 105);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method1411(var20, var18, var13, (byte) 101);
                                if (var28 == null || ~var28.field7166 < ~var26.field7166) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1411(var20, var18, var13, (byte) 106);
                                if (var28 == null || ~var27.field7166 > ~var28.field7166) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1410(true, var22);
                                }
                                if (var26 != null) {
                                    var28.method1410(true, var23);
                                }
                                if (var27 != null) {
                                    var28.method1410(true, var24);
                                }
                                var28.method1411(var20, var18, var13, (byte) 98);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2551();
            this.field5220 = this.field5193.method2077(false, 98, var5, var6.method2549(), var4);
            this.field5217 = new class329(this.field5220, 5126, 3, 0);
            this.field5222 = new class329(this.field5220, 5121, 4, 12);
            byte var14;
            if (this.field5203 != null) {
                this.field5214 = new class329(this.field5220, 5126, 3, 16);
                var14 = 28;
            } else {
                var14 = 24;
                this.field5214 = new class329(this.field5220, 5126, 2, 16);
            }
            if ((7 & this.field5197) != 0) {
                this.field5221 = new class329(this.field5220, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5215.length];
            for (int var16 = 0; var16 < this.field5215.length; ++var16) {
                class213 var17 = this.field5215[var16];
                var15[var16] = var17.field7166;
                var17.method1403(-12629, this.field5195);
            }
            class487.method2853(-64, var15, this.field5215);
            if (this.field5196 != null) {
                this.field5196.method3669(120);
            }
        } else {
            this.field5196 = null;
        }
        this.field5213 = null;
        this.field5183 = null;
        this.field5185 = null;
        this.field5203 = null;
        this.field5210 = null;
        this.field5188 = this.field5198 = null;
        this.field5170 = null;
        this.field5180 = null;
        this.field5216 = this.field5211 = this.field5219 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[Lcw;)V", line = 1099)
    public static final void method2264(int arg0, class21[] arg1) {
        ++field5184;
        class468.field6402 = arg1.length;
        if (arg0 > -10) {
            method2267(47, (byte) 92, -16);
        }
        class298.field3904 = new class21[class468.field6402 + 10];
        class200.field2888 = new int[class468.field6402 + 10];
        class34.method242(arg1, 0, class298.field3904, 0, class468.field6402);
        for (int var2 = 0; ~class468.field6402 < ~var2; ++var2) {
            class200.field2888[var2] = class298.field3904[var2].method108();
        }
        for (int var3 = class468.field6402; var3 < class298.field3904.length; ++var3) {
            class200.field2888[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIILha;)V", line = 1128)
    public static final void method2265(int arg0, int arg1, int arg2, int arg3, int arg4, class545 arg5) {
        arg5.method2097(arg4, arg2, arg3 + arg4, arg1 + arg2);
        ++field5176;
        arg5.method3255(arg1, arg3, arg4, -16777216, (byte) -102, arg2);
        if (~class265.field3619 <= -101) {
            float var6 = (float) class531.field7449 / (float) class531.field7442;
            int var7 = arg3;
            int var8 = arg1;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg3 * var6);
            } else {
                var7 = (int) ((float) arg1 / var6);
            }
            int var9 = (-var7 + arg3) / 2 + arg4;
            int var10 = (arg1 - var8) / 2 + arg2;
            if (class539.field7546 == null || class539.field7546.method115() != arg3 || class539.field7546.method117() != arg1) {
                class531.method3154(class531.field7447, class531.field7452 + class531.field7449, class531.field7447 + class531.field7442, class531.field7452, var9, var10, var7 + var9, var8 + var10);
                class531.method3170(arg5);
                class539.field7546 = arg5.method2119(var9, var10, var7, var8, false);
            }
            class539.field7546.method101(var9, var10);
            if (arg0 != -2) {
                method2259(-50, -42);
            }
            int var11 = class274.field3685 * var7 / class531.field7442;
            int var12 = class14.field196 * var8 / class531.field7449;
            int var13 = var9 - -(class121.field1660 * var7 / class531.field7442);
            int var14 = -(class186.field2736 * var8 / class531.field7449) + var10 - (-var8 + var12);
            int var15 = -1996554240;
            if (class324.field4159 == class210.field2984) {
                var15 = -1996488705;
            }
            arg5.method2194(var13, var14, var11, var12, var15, 1);
            arg5.method2166(var13, var14, var11, var12, var15, 0);
            if (class536.field7505 > 0) {
                int var16;
                if (class137.field1830 <= 50) {
                    var16 = class137.field1830 * 5;
                } else {
                    var16 = -(class137.field1830 * 5) + 500;
                }
                for (class753 var17 = (class753) class531.field7437.method3118((byte) 73); var17 != null; var17 = (class753) class531.field7437.method3111(123)) {
                    class185 var18 = class531.field7421.method1971(var17.field10459, -23851);
                    if (class228.method1476(var18, 65408)) {
                        if (class387.field5412 != var17.field10459) {
                            if (~class507.field7075 != 0 && ~class507.field7075 == ~var18.field2693) {
                                int var19 = var17.field10465 * var7 / class531.field7442 + var9;
                                int var20 = (class531.field7449 - var17.field10456) * var8 / class531.field7449 + var10;
                                arg5.method3255(4, 4, var19 + -2, var16 << 24 | 16776960, (byte) 110, var20 + -2);
                            }
                        } else {
                            int var21 = var9 - -(var17.field10465 * var7 / class531.field7442);
                            int var22 = (-var17.field10456 + class531.field7449) * var8 / class531.field7449 + var10;
                            arg5.method3255(4, 4, var21 + -2, 16776960 | var16 << 24, (byte) -7, var22 + -2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1224)
    public final void method518(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5177;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
        this.method508(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIZI[[Z)V", line = 1308)
    private final void method2266(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean[][] arg7) {
        if (this.field5215 != null) {
            int var9 = arg6 + arg6 + 1;
            int var10 = var9 * var9;
            if (this.field5193.field5098.length < var10) {
                this.field5193.field5098 = new int[var10];
            }
            if (this.field5205 * 2 > this.field5193.field5033.field279.length) {
                this.field5193.field5033 = new class128(this.field5205 * 2);
            }
            int var11 = arg4 - arg6;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg6 + arg2;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg4 + arg6;
            if (~var15 < ~(super.field4344 + -1)) {
                var15 = super.field4344 - 1;
            }
            int var16 = arg2 + arg6;
            if (var16 > super.field4348 + -1) {
                var16 = super.field4348 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field5193.field5098;
            for (int var19 = var11; var15 >= var19; ++var19) {
                boolean[] var25 = arg7[-var12 + var19];
                for (int var26 = var13; ~var26 >= ~var16; ++var26) {
                    if (var25[var26 - var14]) {
                        var18[var17++] = super.field4344 * var26 + var19;
                    }
                }
            }
            if (arg3 == -1) {
                this.field5193.method2118(-128);
            } else {
                this.field5193.method2075((float) arg3, (byte) -128);
                this.field5193.method2125((byte) -31);
            }
            this.field5193.method2197(~(7 & this.field5197) != -1, (byte) -88);
            for (int var20 = 0; this.field5215.length > var20; ++var20) {
                this.field5215[var20].method1408(var18, var17, -95);
            }
            if (!this.field5202.method3121((byte) 56)) {
                int var21 = this.field5193.field5036;
                int var22 = this.field5193.field5042;
                this.field5193.method2069(0, var22, this.field5193.field5048);
                this.field5193.method2197(false, (byte) -88);
                this.field5193.method2192(117, false);
                this.field5193.method2121(128, 1);
                this.field5193.method2103((byte) 118, -2);
                this.field5193.method2154(this.field5193.field5056, -2);
                this.field5193.method2207(8448, 7681, -25248);
                this.field5193.method2202(390803672, 770, 34166, 0);
                this.field5193.method2190(0, 770, true, 34167);
                for (class513 var23 = this.field5202.method3118((byte) 73); var23 != null; var23 = this.field5202.method3111(124)) {
                    class448 var24 = (class448) var23;
                    var24.method2696(arg7, -107, arg4, arg6, arg2);
                }
                this.field5193.method2202(390803672, 768, 5890, 0);
                this.field5193.method2190(0, 770, true, 5890);
                this.field5193.method2154((class396) null, -2);
                this.field5193.method2069(var21, var22, this.field5193.field5048);
            }
            if (this.field5196 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field5193.method2172((class329) null, 32886, this.field5217, this.field5214, (class329) null);
                this.field5196.method3664(arg2, arg5, arg6, arg7, arg4, 7);
                OpenGL.glPopMatrix();
            }
        }
        ++field5182;
        if (arg0 > -36) {
            this.field5170 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1451)
    public final void method502(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5175;
        if (this.field5196 != null && arg0 != null) {
            int var7 = arg1 - (this.field5193.field5092 * arg2 >> 8) >> this.field5193.field4953;
            int var8 = arg3 - (this.field5193.field5072 * arg2 >> 8) >> this.field5193.field4953;
            this.field5196.method3666(var7, var8, -28, arg0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V", line = 1468)
    public final void method511(int arg0, int arg1) {
        ++field5174;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBI)I", line = 1475)
    public static final int method2267(int arg0, byte arg1, int arg2) {
        ++field5178;
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 - -1376312589;
        if (arg1 >= -19) {
            method2264(-28, (class21[]) null);
        }
        return var5 >> 19 & 255;
    }

    @OriginalMember(owner = "client!dn", name = "fa", descriptor = "(IILr;)Lr;", line = 1492)
    public final class706 method504(int arg0, int arg1, class706 arg2) {
        ++field5186;
        if (~(this.field5207[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field4346 >> this.field5193.field4953;
            class668 var5 = (class668) arg2;
            class668 var6;
            if (var5 != null && var5.method3828(var4, -1155735024, var4)) {
                var6 = var5;
                var5.method3827((byte) 0);
            } else {
                var6 = new class668(this.field5193, var4, var4);
            }
            var6.method3829(var4, 0, 0, false, var4);
            this.method2263(arg0, arg1, (byte) -124, var6);
            return var6;
        }
    }
}
