import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class376 extends class23 {

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Lps;")
    private class63 field5726 = new class63();

    @OriginalMember(owner = "client!e", name = "S", descriptor = "Lnq;")
    public class325 field5738;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    private int field5715;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "[[I")
    private int[][] field5736;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "[[[I")
    private int[][][] field5724;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "[[[I")
    private int[][][] field5719;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "[[F")
    private float[][] field5754;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "[[[Lhj;")
    private class407[][][] field5722;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "[[F")
    private float[][] field5748;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "[[[I")
    private int[][][] field5733;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "[[F")
    private float[][] field5743;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    private int field5710;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "[[[I")
    public int[][][] field5720;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "[[B")
    private byte[][] field5740;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[[[I")
    public int[][][] field5705;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "[[B")
    private byte[][] field5709;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public int field5717;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "[[S")
    public short[][] field5734;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "Llp;")
    private class272 field5749;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Len;")
    private class213 field5716;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field5712 = -1;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Z")
    public static boolean field5725 = true;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    private int field5708;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    private int field5737;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    private int field5750;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    private int field5752;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Lm;")
    private class129 field5742;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Lm;")
    public class129 field5745;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "Lm;")
    public class129 field5746;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "Lm;")
    public class129 field5747;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "Lms;")
    private class541 field5741;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "[Lhj;")
    private class407[] field5744;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "[[[I")
    private int[][][] field5732;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)I")
    public static final int method2363(int arg0, int arg1, int arg2) {
        ++field5706;
        if (arg1 != 3) {
            field5725 = false;
        }
        return arg0 != 1 && arg0 != 3 ? class320.field4628[3 & arg2] : class168.field2265[arg2 & 3];
    }

    @OriginalMember(owner = "client!e", name = "H", descriptor = "(Lia;IIIIZ)V")
    public final void method223(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5723;
        if (this.field5716 != null && arg0 != null) {
            int var7 = -(this.field5738.field4990 * arg2 >> 8) + arg1 >> this.field5738.field4895;
            int var8 = -(this.field5738.field4941 * arg2 >> 8) + arg3 >> this.field5738.field4895;
            this.field5716.method1464(1, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lnq;IIII[[I[[II)V")
    public class376(class325 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5738 = arg0;
        this.field5715 = super.field341 + -2;
        this.field5736 = arg5;
        this.field5724 = new int[arg3][arg4][];
        this.field5719 = new int[arg3][arg4][];
        this.field5754 = new float[super.field340 + 1][super.field337 - -1];
        this.field5722 = new class407[arg3][arg4][];
        this.field5748 = new float[super.field340 + 1][super.field337 - -1];
        this.field5733 = new int[arg3][arg4][];
        this.field5743 = new float[super.field340 - -1][super.field337 + 1];
        this.field5710 = 1 << this.field5715;
        this.field5720 = new int[arg3][arg4][];
        this.field5740 = new byte[arg3 + 1][arg4 + 1];
        this.field5705 = new int[arg3][arg4][];
        this.field5709 = new byte[arg3][arg4];
        this.field5717 = arg2;
        this.field5734 = new short[arg3 * arg4][];
        for (int var9 = 1; super.field337 > var9; ++var9) {
            for (int var10 = 1; super.field340 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                this.field5748[var10][var9] = (float) var11 * var13;
                this.field5754[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5743[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5749 = new class272(128);
        if ((this.field5717 & 16) != 0) {
            this.field5716 = new class213(this.field5738, this);
        }
    }

    @OriginalMember(owner = "client!e", name = "ia", descriptor = "(Lia;IIIIZ)V")
    public final void method209(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5713;
        if (this.field5716 != null && arg0 != null) {
            int var7 = -(this.field5738.field4990 * arg2 >> 8) + arg1 >> this.field5738.field4895;
            int var8 = -(this.field5738.field4941 * arg2 >> 8) + arg3 >> this.field5738.field4895;
            this.field5716.method1469(var7, var8, -37, arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lia;IIIIZ)Z")
    public final boolean method212(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5711;
        if (this.field5716 != null && arg0 != null) {
            int var7 = -(this.field5738.field4990 * arg2 >> 8) + arg1 >> this.field5738.field4895;
            int var8 = -(this.field5738.field4941 * arg2 >> 8) + arg3 >> this.field5738.field4895;
            return this.field5716.method1468(var7, (byte) -110, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5730;
        if (this.field5750 > 0) {
            this.field5738.method2019(101);
            this.field5738.method2069(false, (byte) 120);
            this.field5738.method2018(false, (byte) 99);
            this.field5738.method2064(126, false);
            this.field5738.method2083((byte) -79, false);
            this.field5738.method2087(0, 16711935);
            this.field5738.method2015(-2, (byte) -121);
            this.field5738.method2075((class538) null, 0);
            class216.field3047[3] = 0.0F;
            class216.field3047[11] = 0.0F;
            class216.field3047[15] = 1.0F;
            class216.field3047[2] = 0.0F;
            class216.field3047[14] = 0.0F;
            class216.field3047[9] = 0.0F;
            class216.field3047[10] = 0.0F;
            class216.field3047[5] = (float) arg2 / ((float) super.field336 * 128.0F * (float) this.field5738.field4811);
            class216.field3047[8] = 0.0F;
            class216.field3047[6] = 0.0F;
            class216.field3047[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5738.field4809;
            class216.field3047[0] = (float) arg2 / ((float) super.field336 * 128.0F * (float) this.field5738.field4809);
            class216.field3047[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5738.field4811) + 1.0F;
            class216.field3047[1] = 0.0F;
            class216.field3047[7] = 0.0F;
            class216.field3047[4] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class216.field3047, 0);
            class216.field3047[15] = 1.0F;
            class216.field3047[12] = 0.0F;
            class216.field3047[1] = 0.0F;
            class216.field3047[11] = 0.0F;
            class216.field3047[7] = 0.0F;
            class216.field3047[0] = 1.0F;
            class216.field3047[5] = 0.0F;
            class216.field3047[4] = 0.0F;
            class216.field3047[6] = 1.0F;
            class216.field3047[2] = 0.0F;
            class216.field3047[8] = 0.0F;
            class216.field3047[10] = 0.0F;
            class216.field3047[9] = 1.0F;
            class216.field3047[14] = 0.0F;
            class216.field3047[3] = 0.0F;
            class216.field3047[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class216.field3047, 0);
            if (~(7 & this.field5717) != -1) {
                this.field5738.method2018(true, (byte) 99);
                this.field5738.method2041((byte) -109);
            } else {
                this.field5738.method2018(false, (byte) 99);
            }
            this.field5738.method2092(this.field5747, this.field5745, this.field5746, this.field5742, 18504);
            if (this.field5738.field4943.field2219.length < this.field5708 * 2) {
                this.field5738.field4943 = new class283(this.field5708 * 2);
            } else {
                this.field5738.field4943.field2185 = 0;
            }
            int var9 = 0;
            class283 var10 = this.field5738.field4943;
            if (!this.field5738.field4974) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field340 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field5734[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method1111(65535 & var14[var15], 21251);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field340 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field5734[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    var10.method1114(65535 & var20[var21], 104);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class300 var17 = new class300(this.field5738, 5123, var10.field2219, var10.field2185);
                this.field5738.method2065(4, 0, var9, var17, 104);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "m", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        ++field5753;
        if (arg2 > (255 & this.field5740[arg0][arg1])) {
            this.field5740[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lbe;[I)V")
    public final void method217(class28 arg0, int[] arg1) {
        ++field5704;
        this.field5726.method453((byte) 112, new class229(this.field5738, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!e", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method216(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field5732 == null) {
            this.field5732 = new int[super.field340][super.field337][];
        }
        if (arg3 != null && this.field5719 == null) {
            this.field5719 = new int[super.field340][super.field337][];
        }
        ++field5735;
        this.field5720[arg0][arg1] = arg2;
        this.field5705[arg0][arg1] = arg4;
        this.field5733[arg0][arg1] = arg6;
        this.field5724[arg0][arg1] = arg7;
        if (this.field5732 != null) {
            this.field5732[arg0][arg1] = arg5;
        }
        if (this.field5719 != null) {
            this.field5719[arg0][arg1] = arg3;
        }
        class407[] var15 = this.field5722[arg0][arg1] = new class407[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[var16] << 14);
            class5 var19;
            for (var19 = this.field5749.method1747(var17, false); var19 != null; var19 = this.field5749.method1748(0)) {
                class407 var20 = (class407) var19;
                if (arg8[var16] == var20.field6185 && (float) arg9[var16] == var20.field6184 && ~var20.field6183 == ~arg10 && var20.field6177 == arg11 && ~var20.field6176 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class407(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5749.method1751(var17, -89, var15[var16]);
            } else {
                var15[var16] = (class407) var19;
            }
        }
        if (arg13) {
            this.field5709[arg0][arg1] = (byte) class311.method1956(this.field5709[arg0][arg1], 1);
        }
        if (~this.field5752 > ~arg6.length) {
            this.field5752 = arg6.length;
        }
        this.field5750 += arg6.length;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lgf;III)V")
    private final void method2364(class184 arg0, int arg1, int arg2, int arg3) {
        ++field5718;
        int[] var5 = this.field5720[arg1][arg3];
        int[] var6 = this.field5705[arg1][arg3];
        int var7 = var5.length;
        if (var7 > this.field5738.field5039.length) {
            this.field5738.field5039 = new int[var7];
            this.field5738.field5041 = new int[var7];
        }
        int[] var8 = this.field5738.field5039;
        int[] var9 = this.field5738.field5041;
        for (int var10 = arg2; ~var7 < ~var10; ++var10) {
            var8[var10] = class519.method3092(255, var5[var10]) >> this.field5738.field4895;
            var9[var10] = class519.method3092(var6[var10], 255) >> this.field5738.field4895;
        }
        int var11 = 0;
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                arg0.method1248(var14, var13, var17, (byte) -39, var12, var15, var16);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "q", descriptor = "(IILia;)Lia;")
    public final class423 method215(int arg0, int arg1, class423 arg2) {
        ++field5729;
        if ((1 & this.field5709[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field336 >> this.field5738.field4895;
            class184 var5 = (class184) arg2;
            class184 var6;
            if (var5 != null && var5.method1245(var4, var4, 113)) {
                var6 = var5;
                var5.method1247(-1);
            } else {
                var6 = new class184(this.field5738, var4, var4);
            }
            var6.method1244(0, 0, var4, var4, (byte) -119);
            this.method2364(var6, arg0, 0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!e", name = "R", descriptor = "(II)I")
    public final int method218(int arg0, int arg1) {
        ++field5707;
        int var3 = arg0 >> super.field341;
        int var4 = arg1 >> super.field341;
        if (var3 >= 0 && ~var4 <= -1 && ~var3 >= ~(super.field340 + -1) && ~(super.field337 + -1) <= ~var4) {
            int var5 = arg0 & super.field336 - 1;
            int var6 = super.field336 - 1 & arg1;
            int var7 = (-var5 + super.field336) * this.field5736[var3][var4] + this.field5736[var3 - -1][var4] * var5 >> super.field341;
            int var8 = (-var5 + super.field336) * this.field5736[var3][var4 - -1] + this.field5736[var3 + 1][var4 + 1] * var5 >> super.field341;
            return (-var6 + super.field336) * var7 + var6 * var8 >> super.field341;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)[B")
    public static final byte[] method2365(byte arg0, int arg1) {
        ++field5731;
        class303 var2 = (class303) class268.field3727.method2917(115, (long) arg1);
        if (arg0 != -19) {
            field5712 = -87;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class491.method2931(var4, Integer.MIN_VALUE, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class303(var3);
            class268.field3727.method2916(var2, (long) arg1, arg0 + -26922);
        }
        return var2.field4430;
    }

    @OriginalMember(owner = "client!e", name = "oa", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field5728;
        return this.field5736[arg0][arg1];
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    public final void method210(int arg0, int arg1) {
        ++field5721;
    }

    @OriginalMember(owner = "client!e", name = "U", descriptor = "()V")
    public final void method211() {
        ++field5739;
        if (~this.field5750 < -1) {
            byte[][] var1 = new byte[super.field340 - -1][super.field337 - -1];
            for (int var2 = 1; ~var2 > ~super.field340; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field337; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5740[var2][var103 + 1] >> 3) + (this.field5740[var2 - 1][var103] >> 2) + (this.field5740[var2][var103] >> 1) + (this.field5740[var2][var103 + -1] >> 2) + (this.field5740[var2 + 1][var103] >> 3));
                }
            }
            this.field5744 = new class407[this.field5749.method1749(0)];
            this.field5749.method1741(0, this.field5744);
            for (int var3 = 0; ~var3 > ~this.field5744.length; ++var3) {
                this.field5744[var3].method2518(this.field5750, -24852);
            }
            int var4 = 24;
            if (this.field5732 != null) {
                var4 += 4;
            }
            if (~(this.field5717 & 7) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field5738.field4896.method2734(this.field5750 * var4);
            NativeStream var6 = new NativeStream(var5);
            class407[] var7 = new class407[this.field5750];
            int var8 = class520.method3095((byte) -128, this.field5750 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class272 var9 = new class272(var8);
            class407[] var10 = new class407[this.field5752];
            for (int var11 = 0; var11 < super.field340; ++var11) {
                for (int var30 = 0; ~super.field337 < ~var30; ++var30) {
                    if (this.field5733[var11][var30] != null) {
                        class407[] var31 = this.field5722[var11][var30];
                        int[] var32 = this.field5720[var11][var30];
                        int[] var33 = this.field5705[var11][var30];
                        int[] var34 = this.field5724[var11][var30];
                        int[] var35 = this.field5733[var11][var30];
                        int[] var36 = this.field5719 == null ? null : this.field5719[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field5732 == null ? null : this.field5732[var11][var30];
                        float var38 = this.field5748[var11][var30];
                        float var39 = this.field5754[var11][var30];
                        float var40 = this.field5743[var11][var30];
                        float var41 = this.field5748[var11][var30 + 1];
                        float var42 = this.field5754[var11][var30 + 1];
                        float var43 = this.field5743[var11][var30 + 1];
                        float var44 = this.field5748[var11 + 1][var30 + 1];
                        float var45 = this.field5754[var11 + 1][var30 + 1];
                        float var46 = this.field5743[var11 + 1][var30 + 1];
                        float var47 = this.field5748[var11 + 1][var30];
                        float var48 = this.field5754[var11 + 1][var30];
                        float var49 = this.field5743[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 - -1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label338: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class407 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5734[super.field340 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field341) - -var32[var57];
                            int var59 = (var30 << super.field341) - -var33[var57];
                            int var60 = var58 >> this.field5715;
                            int var61 = var59 >> this.field5715;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var62 << 32 | (long) var63 << 48 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && ~var68 == -1) {
                                var72 = var40;
                                var73 = var69 - var50;
                                var74 = var38;
                                var75 = var39;
                            } else if (var67 == 0 && ~super.field336 == ~var68) {
                                var74 = var41;
                                var73 = var69 - var51;
                                var72 = var43;
                                var75 = var42;
                            } else if (super.field336 == var67 && super.field336 == var68) {
                                var74 = var44;
                                var72 = var46;
                                var73 = var69 - var52;
                                var75 = var45;
                            } else if (~super.field336 == ~var67 && var68 == 0) {
                                var72 = var49;
                                var75 = var48;
                                var73 = var69 - var53;
                                var74 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field336;
                                float var77 = (float) var68 / (float) super.field336;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var74 = (-var78 + var81) * var77 + var78;
                                var75 = (var82 - var79) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var72 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field341) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field341) + var51;
                                var73 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field341));
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                var70 = class401.field6108[65408 & var62 | var86];
                                if (~(this.field5717 & 7) == -1) {
                                    float var87 = this.field5738.field4959[2] * var72 + this.field5738.field4959[1] * var75 + this.field5738.field4959[0] * var74;
                                    var71 = this.field5738.field4953 + (var87 > 0.0F ? this.field5738.field5000 : this.field5738.field4951) * var87;
                                }
                            }
                            class5 var88 = null;
                            if ((this.field5710 + -1 & var58) == 0 && ~(var59 & this.field5710 + -1) == -1) {
                                var88 = var9.method1747(var65, false);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class510) var88).field7492;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var89].field35 > var31[var57].field35) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (var62 == var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (var63 & 127) * var73 >> 7;
                                    if (var91 >= 2) {
                                        if (var91 > 126) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var90 = class401.field6108[var63 & 65408 | var91];
                                    if ((7 & this.field5717) == 0) {
                                        float var92 = this.field5738.field4959[2] * var72 + this.field5738.field4959[1] * var75 + this.field5738.field4959[0] * var74;
                                        float var93 = this.field5738.field4953 + (var71 > 0.0F ? this.field5738.field5000 : this.field5738.field4951) * var71;
                                        int var94 = (var90 & 16759475) >> 16;
                                        int var95 = (65533 & var90) >> 8;
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var99 < 0) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        var90 = var97 << 16 | var98 << 8 | var99;
                                    }
                                }
                                if (!this.field5738.field4974) {
                                    var6.method2731((float) var58);
                                    var6.method2731((float) (var64 + this.method218(var58, var59)));
                                    var6.method2731((float) var59);
                                    var6.method2726((byte) (var90 >> 16));
                                    var6.method2726((byte) (var90 >> 8));
                                    var6.method2726((byte) var90);
                                    var6.method2726(-1);
                                    var6.method2731((float) var58);
                                    var6.method2731((float) var59);
                                    if (this.field5732 != null) {
                                        var6.method2731((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field5717 & 7) != -1) {
                                        var6.method2731(var74);
                                        var6.method2731(var75);
                                        var6.method2731(var72);
                                    }
                                } else {
                                    var6.method2730((float) var58);
                                    var6.method2730((float) (this.method218(var58, var59) + var64));
                                    var6.method2730((float) var59);
                                    var6.method2726((byte) (var90 >> 16));
                                    var6.method2726((byte) (var90 >> 8));
                                    var6.method2726((byte) var90);
                                    var6.method2726(-1);
                                    var6.method2730((float) var58);
                                    var6.method2730((float) var59);
                                    if (this.field5732 != null) {
                                        var6.method2730((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field5717) != -1) {
                                        var6.method2730(var74);
                                        var6.method2730(var75);
                                        var6.method2730(var72);
                                    }
                                }
                                var89 = this.field5737++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1751(var65, -113, new class510(var56[var57]));
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method2515(var89, var73, var71, var70, -62);
                            }
                            ++this.field5708;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field5737; ++var12) {
                class407 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2513(108, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field340; ++var13) {
                for (int var18 = 0; var18 < super.field337; ++var18) {
                    short[] var19 = this.field5734[super.field340 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class407 var25 = var7[var22];
                            class407 var26 = var7[var23];
                            class407 var27 = var7[var24];
                            class407 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2514(var18, 0, var13, var20);
                            }
                            if (var26 != null) {
                                var26.method2514(var18, 0, var13, var20);
                                if (var28 == null || ~var26.field35 > ~var28.field35) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2514(var18, 0, var13, var20);
                                if (var28 == null || var28.field35 > var27.field35) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2513(-103, var22);
                                }
                                if (var26 != null) {
                                    var28.method2513(117, var23);
                                }
                                if (var27 != null) {
                                    var28.method2513(51, var24);
                                }
                                var28.method2514(var18, 0, var13, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2728();
            this.field5741 = this.field5738.method2036((byte) 117, var4, false, var5, var6.method2725());
            this.field5747 = new class129(this.field5741, 5126, 3, 0);
            this.field5742 = new class129(this.field5741, 5121, 4, 12);
            byte var14;
            if (this.field5732 != null) {
                var14 = 28;
                this.field5746 = new class129(this.field5741, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field5746 = new class129(this.field5741, 5126, 2, 16);
            }
            if ((this.field5717 & 7) != 0) {
                this.field5745 = new class129(this.field5741, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5744.length];
            for (int var16 = 0; ~var16 > ~this.field5744.length; ++var16) {
                class407 var17 = this.field5744[var16];
                var15[var16] = var17.field35;
                var17.method2511(this.field5737, (byte) -125);
            }
            class203.method1374(this.field5744, 0, var15);
            if (this.field5716 != null) {
                this.field5716.method1466(63);
            }
        } else {
            this.field5716 = null;
        }
        this.field5748 = this.field5754 = this.field5743 = null;
        this.field5733 = null;
        this.field5732 = null;
        this.field5724 = null;
        this.field5719 = null;
        this.field5720 = this.field5705 = null;
        this.field5722 = null;
        this.field5740 = null;
        this.field5749 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZIII[[Z)V")
    private final void method2366(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean[][] arg6) {
        ++field5727;
        if (arg0 <= 33) {
            this.field5705 = null;
        }
        if (this.field5744 != null) {
            float var8 = this.field5738.field4979;
            float var9 = this.field5738.field5004;
            int var10 = arg5 - -1 + arg5;
            int var11 = var10 * var10;
            if (~this.field5738.field5040.length > ~var11) {
                this.field5738.field5040 = new int[var11];
            }
            if (~this.field5738.field4943.field2219.length > ~(this.field5708 * 2)) {
                this.field5738.field4943 = new class283(this.field5708 * 2);
            }
            int var12 = arg3 - arg5;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg1 - arg5;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg3 + arg5;
            if (~var16 < ~(super.field340 - 1)) {
                var16 = super.field340 + -1;
            }
            int var17 = arg1 + arg5;
            if (super.field337 + -1 < var17) {
                var17 = super.field337 - 1;
            }
            int var18 = 0;
            int[] var19 = this.field5738.field5040;
            for (int var20 = var12; var16 >= var20; ++var20) {
                boolean[] var26 = arg6[-var13 + var20];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field340 * var27 + var20;
                    }
                }
            }
            if (~arg4 == 0) {
                this.field5738.method2078((byte) -60);
            } else {
                this.field5738.method2091((byte) -31, (float) arg4);
                this.field5738.method2013(16);
            }
            this.field5738.method2018((this.field5717 & 7) != 0, (byte) 99);
            for (int var21 = 0; this.field5744.length > var21; ++var21) {
                this.field5744[var21].method2516((byte) 127, var18, var19);
            }
            if (!this.field5726.method455(true)) {
                int var22 = this.field5738.field4984;
                int var23 = this.field5738.field5016;
                this.field5738.method760(0, var23, this.field5738.field5010);
                this.field5738.method748(var9, var8 - 4.0F);
                this.field5738.method2018(false, (byte) 99);
                this.field5738.method2083((byte) 43, false);
                this.field5738.method2087(128, 16711935);
                this.field5738.method2015(-2, (byte) -121);
                this.field5738.method2075(this.field5738.field4926, 0);
                this.field5738.method2030(8448, 7681, (byte) 71);
                this.field5738.method2059(34166, 770, 0, -31277);
                this.field5738.method2044(0, 770, (byte) 64, 34167);
                for (class5 var24 = this.field5726.method445(33); var24 != null; var24 = this.field5726.method451(false)) {
                    class229 var25 = (class229) var24;
                    var25.method1537(arg6, arg3, arg5, arg1, 255);
                }
                this.field5738.method2059(5890, 768, 0, -31277);
                this.field5738.method2044(0, 770, (byte) 64, 5890);
                this.field5738.method2075((class538) null, 0);
                this.field5738.method760(var22, var23, this.field5738.field5010);
            }
            if (this.field5716 != null) {
                this.field5738.method748(var9, var8 - 8.0F);
                this.field5738.method2078((byte) -60);
                this.field5738.method2092(this.field5747, (class129) null, this.field5746, (class129) null, 18504);
                this.field5716.method1465(arg5, arg1, arg2, arg6, arg3, (byte) -98);
            }
            this.field5738.method748(var9, var8);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III[[ZZ)V")
    public final void method213(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field5714;
        this.method2366(109, arg1, arg4, arg0, -1, arg2, arg3);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method221(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5751;
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
        this.method216(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }
}
