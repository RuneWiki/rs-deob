import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class412 extends class220 {

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Lpu;")
    private class411 field6235 = new class411();

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    private int field6257 = this.field3803 + -2;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "[[I")
    private int[][] field6264;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Lih;")
    public class214 field6242;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "[[[I")
    public int[][][] field6266;

    @OriginalMember(owner = "client!gk", name = "ib", descriptor = "[[F")
    private float[][] field6275;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "[[[Lpg;")
    private class497[][][] field6238;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "[[[I")
    private int[][][] field6260;

    @OriginalMember(owner = "client!gk", name = "fb", descriptor = "[[F")
    private float[][] field6272;

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "[[B")
    private byte[][] field6269;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "[[S")
    public short[][] field6243;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    private int field6231;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "[[[I")
    private int[][][] field6259;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "[[[I")
    public int[][][] field6228;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "[[[I")
    private int[][][] field6246;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "[[F")
    private float[][] field6268;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "[[B")
    private byte[][] field6256;

    @OriginalMember(owner = "client!gk", name = "lb", descriptor = "Lbu;")
    private class407 field6278;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Lqj;")
    private class391 field6241;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "S")
    public static short field6248 = 1;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "I")
    public static int field6262 = -1;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    private int field6226;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    private int field6230;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!gk", name = "eb", descriptor = "I")
    private int field6271;

    @OriginalMember(owner = "client!gk", name = "gb", descriptor = "I")
    private int field6273;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "Lnn;")
    public class45 field6267;

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "Lnn;")
    private class45 field6270;

    @OriginalMember(owner = "client!gk", name = "hb", descriptor = "Lnn;")
    public class45 field6274;

    @OriginalMember(owner = "client!gk", name = "jb", descriptor = "Lnn;")
    public class45 field6276;

    @OriginalMember(owner = "client!gk", name = "kb", descriptor = "Lig;")
    private class92 field6277;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
    public static int[] field6233;

    @OriginalMember(owner = "client!gk", name = "mb", descriptor = "[Lpg;")
    private class497[] field6279;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "[[Lhn;")
    public static class284[][] field6247;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "[[[I")
    private int[][][] field6252;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method2549(byte arg0) {
        int var1 = -124 / ((arg0 - 61) / 36);
        field6247 = null;
        field6233 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lih;IIII[[I[[II)V")
    public class412(class214 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field6264 = arg5;
        this.field6242 = arg0;
        this.field6266 = new int[arg3][arg4][];
        this.field6275 = new float[super.field3801 + 1][super.field3797 + 1];
        this.field6238 = new class497[arg3][arg4][];
        this.field6260 = new int[arg3][arg4][];
        this.field6272 = new float[super.field3801 + 1][super.field3797 + 1];
        this.field6269 = new byte[arg3 + 1][arg4 + 1];
        this.field6243 = new short[arg3 * arg4][];
        this.field6231 = 1 << this.field6257;
        this.field6259 = new int[arg3][arg4][];
        this.field6228 = new int[arg3][arg4][];
        this.field6246 = new int[arg3][arg4][];
        this.field6234 = arg2;
        this.field6268 = new float[super.field3801 + 1][super.field3797 + 1];
        this.field6256 = new byte[arg3][arg4];
        for (int var9 = 1; ~var9 > ~super.field3797; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field3801; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field6268[var10][var9] = (float) var11 * var13;
                this.field6272[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field6275[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6278 = new class407(128);
        if ((16 & this.field6234) != 0) {
            this.field6241 = new class391(this.field6242, this);
        }
    }

    @OriginalMember(owner = "client!gk", name = "OA", descriptor = "(IILi;)Li;")
    public final class515 method1510(int arg0, int arg1, class515 arg2) {
        ++field6253;
        if (~(1 & this.field6256[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3802 >> this.field6242.field3601;
            class289 var5 = (class289) arg2;
            class289 var6;
            if (var5 != null && var5.method1870(var4, 1921660432, var4)) {
                var6 = var5;
                var5.method1872((byte) 0);
            } else {
                var6 = new class289(this.field6242, var4, var4);
            }
            var6.method1873(0, (byte) -56, var4, var4, 0);
            this.method2550(arg0, var6, (byte) -121, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gk", name = "ca", descriptor = "(II)I")
    public final int method1517(int arg0, int arg1) {
        ++field6239;
        int var3 = arg0 >> super.field3803;
        int var4 = arg1 >> super.field3803;
        if (var3 >= 0 && ~var4 <= -1 && var3 <= super.field3801 + -1 && super.field3797 - 1 >= var4) {
            int var5 = super.field3802 + -1 & arg0;
            int var6 = super.field3802 - 1 & arg1;
            int var7 = (-var5 + super.field3802) * this.field6264[var3][var4] + this.field6264[var3 + 1][var4] * var5 >> super.field3803;
            int var8 = (-var5 + super.field3802) * this.field6264[var3][var4 - -1] + this.field6264[var3 + 1][var4 + 1] * var5 >> super.field3803;
            return (super.field3802 - var6) * var7 + var6 * var8 >> super.field3803;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6251;
        if (~this.field6271 < -1) {
            this.field6242.method1408((byte) 6);
            this.field6242.method1405(-44, false);
            this.field6242.method1417(false, false);
            this.field6242.method1481(true, false);
            this.field6242.method1473(-109, false);
            this.field6242.method1486(0, (byte) 122);
            this.field6242.method1463(-2, (byte) 82);
            this.field6242.method1471(true, (class179) null);
            class189.field2958[5] = (float) arg2 / ((float) super.field3802 * 128.0F * (float) this.field6242.field3569);
            class189.field2958[10] = 0.0F;
            class189.field2958[8] = 0.0F;
            class189.field2958[4] = 0.0F;
            class189.field2958[11] = 0.0F;
            class189.field2958[1] = 0.0F;
            class189.field2958[15] = 1.0F;
            class189.field2958[2] = 0.0F;
            class189.field2958[7] = 0.0F;
            class189.field2958[9] = 0.0F;
            class189.field2958[14] = 0.0F;
            class189.field2958[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6242.field3442;
            class189.field2958[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6242.field3569;
            class189.field2958[3] = 0.0F;
            class189.field2958[0] = (float) arg2 / ((float) super.field3802 * 128.0F * (float) this.field6242.field3442);
            class189.field2958[6] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class189.field2958, 0);
            class189.field2958[8] = 0.0F;
            class189.field2958[7] = 0.0F;
            class189.field2958[9] = 1.0F;
            class189.field2958[10] = 0.0F;
            class189.field2958[1] = 0.0F;
            class189.field2958[14] = 0.0F;
            class189.field2958[12] = 0.0F;
            class189.field2958[0] = 1.0F;
            class189.field2958[6] = 1.0F;
            class189.field2958[5] = 0.0F;
            class189.field2958[3] = 0.0F;
            class189.field2958[4] = 0.0F;
            class189.field2958[15] = 1.0F;
            class189.field2958[2] = 0.0F;
            class189.field2958[13] = 0.0F;
            class189.field2958[11] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class189.field2958, 0);
            if ((this.field6234 & 7) != 0) {
                this.field6242.method1417(true, false);
                this.field6242.method1422((byte) -59);
            } else {
                this.field6242.method1417(false, false);
            }
            this.field6242.method1406(32888, this.field6276, this.field6274, this.field6270, this.field6267);
            if (this.field6242.field3656.field302.length >= this.field6230 * 2) {
                this.field6242.field3656.field301 = 0;
            } else {
                this.field6242.field3656 = new class364(this.field6230 * 2);
            }
            int var9 = 0;
            class364 var10 = this.field6242.field3656;
            if (!this.field6242.field3708) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field3801 * var11 - -arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field6243[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method154(var14[var15] & 65535, -857932536);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field3801 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[var19 - arg3][-arg4 + var16]) {
                            short[] var20 = this.field6243[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    var10.method182(var20[var21] & 65535, -123);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class498 var17 = new class498(this.field6242, 5123, var10.field302, var10.field301);
                this.field6242.method1407(var9, (byte) 93, 4, var17, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "qa", descriptor = "(III)V")
    public final void method1511(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field6269[arg0][arg1])) {
            this.field6269[arg0][arg1] = (byte) arg2;
        }
        ++field6258;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILkp;BI)V")
    private final void method2550(int arg0, class289 arg1, byte arg2, int arg3) {
        ++field6229;
        int[] var5 = this.field6228[arg0][arg3];
        int[] var6 = this.field6266[arg0][arg3];
        if (arg2 >= -90) {
            this.field6241 = null;
        }
        int var7 = var5.length;
        if (this.field6242.field3740.length < var7) {
            this.field6242.field3740 = new int[var7];
            this.field6242.field3741 = new int[var7];
        }
        int[] var8 = this.field6242.field3740;
        int[] var9 = this.field6242.field3741;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = class344.method2224(255, var5[var10]) >> this.field6242.field3601;
            var9[var10] = class344.method2224(var6[var10], 255) >> this.field6242.field3601;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((var15 - var17) * (-var14 + var12) - (-var13 + var15) * (-var14 + var16)) < -1) {
                arg1.method1874(var14, -177891024, var16, var12, var17, var15, var13);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lja;[I)V")
    public final void method1513(class450 arg0, int[] arg1) {
        this.field6235.method2541(0, new class79(this.field6242, this, arg0, arg1));
        ++field6249;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI[[ZIIII)V")
    private final void method2551(boolean arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            this.method1509((class515) null, -81, 84, 43, 122, true);
        }
        ++field6232;
        if (this.field6279 != null) {
            float var8 = this.field6242.field3653;
            float var9 = this.field6242.field3645;
            int var10 = arg3 + 1 + arg3;
            int var11 = var10 * var10;
            if (this.field6242.field3745.length < var11) {
                this.field6242.field3745 = new int[var11];
            }
            if (this.field6230 * 2 > this.field6242.field3656.field302.length) {
                this.field6242.field3656 = new class364(this.field6230 * 2);
            }
            int var12 = -arg3 + arg6;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg3 + arg5;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg3 + arg6;
            if (~(super.field3801 + -1) > ~var16) {
                var16 = super.field3801 + -1;
            }
            int var17 = arg3 + arg5;
            if (~(super.field3797 + -1) > ~var17) {
                var17 = super.field3797 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field6242.field3745;
            for (int var20 = var12; var16 >= var20; ++var20) {
                boolean[] var26 = arg2[var20 - var13];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field3801 * var27 - -var20;
                    }
                }
            }
            if (~arg1 == 0) {
                this.field6242.method1445((byte) -79);
            } else {
                this.field6242.method1452(arg4 + -53, (float) arg1);
                this.field6242.method1420(47);
            }
            this.field6242.method1417(~(7 & this.field6234) != -1, false);
            for (int var21 = 0; ~this.field6279.length < ~var21; ++var21) {
                this.field6279[var21].method2950(var18, var19, 65535);
            }
            if (!this.field6235.method2544((byte) 61)) {
                int var22 = this.field6242.field3641;
                int var23 = this.field6242.field3726;
                this.field6242.method847(0, var23, this.field6242.field3729);
                this.field6242.method877(var9, var8 + -4.0F);
                this.field6242.method1417(false, false);
                this.field6242.method1473(-108, false);
                this.field6242.method1486(128, (byte) 123);
                this.field6242.method1463(-2, (byte) 89);
                this.field6242.method1471(true, this.field6242.field3696);
                this.field6242.method1482(8448, 8960, 7681);
                this.field6242.method1474(0, 34166, -5000, 770);
                this.field6242.method1484(34167, 0, 770, arg4 ^ 34184);
                for (class276 var24 = this.field6235.method2538(arg4 + -3); var24 != null; var24 = this.field6235.method2535((byte) -81)) {
                    class79 var25 = (class79) var24;
                    var25.method580(arg4 + -125, arg5, arg6, arg3, arg2);
                }
                this.field6242.method1474(0, 5890, arg4 ^ -5000, 768);
                this.field6242.method1484(5890, 0, 770, 34184);
                this.field6242.method1471(true, (class179) null);
                this.field6242.method847(var22, var23, this.field6242.field3729);
            }
            if (this.field6241 != null) {
                this.field6242.method877(var9, var8 - 8.0F);
                this.field6242.method1445((byte) 120);
                this.field6242.method1406(32888, this.field6276, (class45) null, (class45) null, this.field6267);
                this.field6241.method2448(arg6, arg4 + 2160, arg2, arg0, arg3, arg5);
            }
            this.field6242.method877(var9, var8);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1512(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2551(arg4, -1, arg3, arg2, 0, arg1, arg0);
        ++field6237;
    }

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method1509(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6255;
        if (this.field6241 != null && arg0 != null) {
            int var7 = -(this.field6242.field3703 * arg2 >> 8) + arg1 >> this.field6242.field3601;
            int var8 = -(this.field6242.field3643 * arg2 >> 8) + arg3 >> this.field6242.field3601;
            this.field6241.method2443(arg0, var8, var7, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public final void method1515(int arg0, int arg1) {
        ++field6227;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1520(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6240;
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
        this.method1523(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!gk", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method1518(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6236;
        if (this.field6241 != null && arg0 != null) {
            int var7 = arg1 - (this.field6242.field3703 * arg2 >> 8) >> this.field6242.field3601;
            int var8 = -(this.field6242.field3643 * arg2 >> 8) + arg3 >> this.field6242.field3601;
            this.field6241.method2444((byte) 18, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "aa", descriptor = "()V")
    public final void method1524() {
        if (~this.field6271 < -1) {
            byte[][] var1 = new byte[super.field3801 + 1][super.field3797 + 1];
            for (int var2 = 1; var2 < super.field3801; ++var2) {
                for (int var103 = 1; ~super.field3797 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field6269[var2][var103] >> 1) + (this.field6269[var2][var103 + -1] >> 2) + (this.field6269[var2 + -1][var103] >> 2) + (this.field6269[var2][var103 - -1] >> 3) + (this.field6269[var2 + 1][var103] >> 3));
                }
            }
            this.field6279 = new class497[this.field6278.method2521((byte) -93)];
            this.field6278.method2523(126, this.field6279);
            for (int var3 = 0; var3 < this.field6279.length; ++var3) {
                this.field6279[var3].method2946(4, this.field6271);
            }
            int var4 = 24;
            if (this.field6252 != null) {
                var4 += 4;
            }
            if (~(7 & this.field6234) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field6242.field3603.method105(this.field6271 * var4);
            NativeStream var6 = new NativeStream(var5);
            class497[] var7 = new class497[this.field6271];
            int var8 = class237.method1629(this.field6271 / 4, 89);
            if (~var8 > -2) {
                var8 = 1;
            }
            class407 var9 = new class407(var8);
            class497[] var10 = new class497[this.field6273];
            for (int var11 = 0; ~super.field3801 < ~var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field3797; ++var30) {
                    if (this.field6260[var11][var30] != null) {
                        class497[] var31 = this.field6238[var11][var30];
                        int[] var32 = this.field6228[var11][var30];
                        int[] var33 = this.field6266[var11][var30];
                        int[] var34 = this.field6246[var11][var30];
                        int[] var35 = this.field6260[var11][var30];
                        int[] var36 = this.field6259 == null ? null : this.field6259[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field6252 != null ? this.field6252[var11][var30] : null;
                        float var38 = this.field6268[var11][var30];
                        float var39 = this.field6272[var11][var30];
                        float var40 = this.field6275[var11][var30];
                        float var41 = this.field6268[var11][var30 + 1];
                        float var42 = this.field6272[var11][var30 + 1];
                        float var43 = this.field6275[var11][var30 + 1];
                        float var44 = this.field6268[var11 - -1][var30 + 1];
                        float var45 = this.field6272[var11 + 1][var30 + 1];
                        float var46 = this.field6275[var11 - -1][var30 + 1];
                        float var47 = this.field6268[var11 + 1][var30];
                        float var48 = this.field6272[var11 - -1][var30];
                        float var49 = this.field6275[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label342: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class497 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label342;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field6243[super.field3801 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field3803) - -var32[var57];
                            int var59 = (var30 << super.field3803) + var33[var57];
                            int var60 = var58 >> this.field6257;
                            int var61 = var59 >> this.field6257;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
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
                                var72 = var38;
                                var73 = var69 - var50;
                                var74 = var40;
                                var75 = var39;
                            } else if (~var67 == -1 && super.field3802 == var68) {
                                var74 = var43;
                                var73 = var69 - var51;
                                var72 = var41;
                                var75 = var42;
                            } else if (super.field3802 == var67 && super.field3802 == var68) {
                                var73 = var69 - var52;
                                var74 = var46;
                                var75 = var45;
                                var72 = var44;
                            } else if (super.field3802 == var67 && ~var68 == -1) {
                                var73 = var69 - var53;
                                var74 = var49;
                                var72 = var47;
                                var75 = var48;
                            } else {
                                float var76 = (float) var67 / (float) super.field3802;
                                float var77 = (float) var68 / (float) super.field3802;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (-var79 + var82) * var77 + var79;
                                var72 = (var81 - var78) * var77 + var78;
                                var74 = (-var80 + var83) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field3803) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field3803) + var51;
                                var73 = var69 - (((var85 - var84) * var68 >> super.field3803) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (~var86 <= -3) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if ((this.field6234 & 7) == 0) {
                                    float var87 = this.field6242.field3695[2] * var74 + this.field6242.field3695[1] * var75 + this.field6242.field3695[0] * var72;
                                    var71 = this.field6242.field3712 + var87 * (var87 > 0.0F ? this.field6242.field3731 : this.field6242.field3642);
                                }
                                var70 = class164.field2603[var86 | 65408 & var62];
                            }
                            class276 var88 = null;
                            if (~(var58 & this.field6231 + -1) == -1 && ~(this.field6231 + -1 & var59) == -1) {
                                var88 = var9.method2516(var65, -1);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (var62 != var63) {
                                    int var89 = (var63 & 127) * var73 >> 7;
                                    if (var89 < 2) {
                                        var89 = 2;
                                    } else if (var89 > 126) {
                                        var89 = 126;
                                    }
                                    var90 = class164.field2603[65408 & var63 | var89];
                                    if (~(7 & this.field6234) == -1) {
                                        float var91 = this.field6242.field3695[2] * var74 + this.field6242.field3695[0] * var72 + this.field6242.field3695[1] * var75;
                                        float var92 = var71 * (var71 > 0.0F ? this.field6242.field3731 : this.field6242.field3642) + this.field6242.field3712;
                                        int var93 = (16728927 & var90) >> 16;
                                        int var94 = (var90 & 65514) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var90 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (~var95 < -256) {
                                            var95 = 255;
                                        }
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var90 = var98 | var95 << 16 | var97 << 8;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (!this.field6242.field3708) {
                                    var6.method101((float) var58);
                                    var6.method101((float) (this.method1517(var58, var59) - -var64));
                                    var6.method101((float) var59);
                                    var6.method102((byte) (var90 >> 16));
                                    var6.method102((byte) (var90 >> 8));
                                    var6.method102((byte) var90);
                                    var6.method102(-1);
                                    var6.method101((float) var58);
                                    var6.method101((float) var59);
                                    if (this.field6252 != null) {
                                        var6.method101((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field6234) != 0) {
                                        var6.method101(var72);
                                        var6.method101(var75);
                                        var6.method101(var74);
                                    }
                                } else {
                                    var6.method98((float) var58);
                                    var6.method98((float) (var64 + this.method1517(var58, var59)));
                                    var6.method98((float) var59);
                                    var6.method102((byte) (var90 >> 16));
                                    var6.method102((byte) (var90 >> 8));
                                    var6.method102((byte) var90);
                                    var6.method102(-1);
                                    var6.method98((float) var58);
                                    var6.method98((float) var59);
                                    if (this.field6252 != null) {
                                        var6.method98((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(7 & this.field6234) != -1) {
                                        var6.method98(var72);
                                        var6.method98(var75);
                                        var6.method98(var74);
                                    }
                                }
                                var99 = this.field6226++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2517(new class9(var56[var57]), var65, (byte) 113);
                            } else {
                                var56[var57] = ((class9) var88).field90;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && var7[var99].field4542 > var31[var57].field4542) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method2945(var73, 255, var70, var71, var99);
                            }
                            ++this.field6230;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field6226 < ~var12; ++var12) {
                class497 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2947((byte) -111, var12);
                }
            }
            for (int var13 = 0; super.field3801 > var13; ++var13) {
                for (int var18 = 0; super.field3797 > var18; ++var18) {
                    short[] var19 = this.field6243[super.field3801 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class497 var25 = var7[var22];
                            class497 var26 = var7[var23];
                            class497 var27 = var7[var24];
                            class497 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2949(var13, var20, var18, -116);
                            }
                            if (var26 != null) {
                                var26.method2949(var13, var20, var18, 72);
                                if (var28 == null || ~var28.field4542 < ~var26.field4542) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2949(var13, var20, var18, -31);
                                if (var28 == null || ~var27.field4542 > ~var28.field4542) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2947((byte) -111, var22);
                                }
                                if (var26 != null) {
                                    var28.method2947((byte) -111, var23);
                                }
                                if (var27 != null) {
                                    var28.method2947((byte) -111, var24);
                                }
                                var28.method2949(var13, var20, var18, 88);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method99();
            this.field6277 = this.field6242.method1423(var4, -32527, var6.method100(), false, var5);
            this.field6267 = new class45(this.field6277, 5126, 3, 0);
            this.field6270 = new class45(this.field6277, 5121, 4, 12);
            byte var14;
            if (this.field6252 == null) {
                this.field6276 = new class45(this.field6277, 5126, 2, 16);
                var14 = 24;
            } else {
                var14 = 28;
                this.field6276 = new class45(this.field6277, 5126, 3, 16);
            }
            if ((this.field6234 & 7) != 0) {
                this.field6274 = new class45(this.field6277, 5126, 3, var14);
            }
            long[] var15 = new long[this.field6279.length];
            for (int var16 = 0; ~var16 > ~this.field6279.length; ++var16) {
                class497 var17 = this.field6279[var16];
                var15[var16] = var17.field4542;
                var17.method2948((byte) 126, this.field6226);
            }
            class219.method1507(var15, this.field6279, (byte) 54);
            if (this.field6241 != null) {
                this.field6241.method2445(false);
            }
        } else {
            this.field6241 = null;
        }
        ++field6244;
        this.field6259 = null;
        this.field6268 = this.field6272 = this.field6275 = null;
        this.field6269 = null;
        this.field6260 = null;
        this.field6238 = null;
        this.field6278 = null;
        this.field6228 = this.field6266 = null;
        this.field6252 = null;
        this.field6246 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method1521(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6250;
        if (this.field6241 != null && arg0 != null) {
            int var7 = arg1 - (this.field6242.field3703 * arg2 >> 8) >> this.field6242.field3601;
            int var8 = -(this.field6242.field3643 * arg2 >> 8) + arg3 >> this.field6242.field3601;
            return this.field6241.method2446(var7, var8, 1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1523(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field6252 == null) {
            this.field6252 = new int[super.field3801][super.field3797][];
        }
        if (arg3 != null && this.field6259 == null) {
            this.field6259 = new int[super.field3801][super.field3797][];
        }
        ++field6265;
        this.field6228[arg0][arg1] = arg2;
        this.field6266[arg0][arg1] = arg4;
        this.field6260[arg0][arg1] = arg6;
        this.field6246[arg0][arg1] = arg7;
        if (this.field6252 != null) {
            this.field6252[arg0][arg1] = arg5;
        }
        if (this.field6259 != null) {
            this.field6259[arg0][arg1] = arg3;
        }
        class497[] var15 = this.field6238[arg0][arg1] = new class497[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[var16];
            class276 var19;
            for (var19 = this.field6278.method2516(var17, -1); var19 != null; var19 = this.field6278.method2526(-123)) {
                class497 var20 = (class497) var19;
                if (arg8[var16] == var20.field7289 && (float) arg9[var16] == var20.field7278 && ~var20.field7290 == ~arg10 && var20.field7277 == arg11 && ~var20.field7286 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class497(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field6278.method2517(var15[var16], var17, (byte) -127);
            } else {
                var15[var16] = (class497) var19;
            }
        }
        if (arg13) {
            this.field6256[arg0][arg1] = (byte) class338.method2141(this.field6256[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field6273) {
            this.field6273 = arg6.length;
        }
        this.field6271 += arg6.length;
    }

    @OriginalMember(owner = "client!gk", name = "ua", descriptor = "(II)I")
    public final int method1516(int arg0, int arg1) {
        ++field6261;
        return this.field6264[arg0][arg1];
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2552(int arg0, int arg1, byte arg2) {
        ++field6263;
        int var3 = -59 % ((arg2 - -60) / 56);
        return class440.method2655(5712, arg1, arg0) & class72.method515(arg0, arg1, -25);
    }
}
