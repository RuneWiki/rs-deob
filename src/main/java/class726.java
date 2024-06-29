import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class726 extends class278 {

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "F")
    private float field10127 = -3.4028235E38F;

    @OriginalMember(owner = "client!aca", name = "P", descriptor = "F")
    private float field10151 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!aca", name = "L", descriptor = "Lbg;")
    private class464 field10147 = new class464();

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    private int field10124 = this.field3929 + -2;

    @OriginalMember(owner = "client!aca", name = "N", descriptor = "Lsr;")
    public class251 field10149;

    @OriginalMember(owner = "client!aca", name = "hb", descriptor = "[[F")
    private float[][] field10169;

    @OriginalMember(owner = "client!aca", name = "T", descriptor = "[[[I")
    private int[][][] field10155;

    @OriginalMember(owner = "client!aca", name = "Q", descriptor = "[[[Ltm;")
    private class389[][][] field10152;

    @OriginalMember(owner = "client!aca", name = "K", descriptor = "[[[I")
    private int[][][] field10146;

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "[[B")
    private byte[][] field10131;

    @OriginalMember(owner = "client!aca", name = "C", descriptor = "[[[I")
    public int[][][] field10138;

    @OriginalMember(owner = "client!aca", name = "db", descriptor = "[[B")
    private byte[][] field10165;

    @OriginalMember(owner = "client!aca", name = "R", descriptor = "I")
    public int field10153;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "[[[I")
    public int[][][] field10135;

    @OriginalMember(owner = "client!aca", name = "G", descriptor = "I")
    private int field10142;

    @OriginalMember(owner = "client!aca", name = "kb", descriptor = "[[F")
    private float[][] field10172;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "[[S")
    public short[][] field10129;

    @OriginalMember(owner = "client!aca", name = "D", descriptor = "[[[I")
    public int[][][] field10139;

    @OriginalMember(owner = "client!aca", name = "ib", descriptor = "[[F")
    private float[][] field10170;

    @OriginalMember(owner = "client!aca", name = "Z", descriptor = "Lkk;")
    private class188 field10161;

    @OriginalMember(owner = "client!aca", name = "X", descriptor = "Llr;")
    private class750 field10159;

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "Lrb;")
    public static class352 field10132 = new class352("", 11);

    @OriginalMember(owner = "client!aca", name = "bb", descriptor = "I")
    public static int field10163 = 0;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public static int field10125;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
    public static int field10130;

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "I")
    public static int field10133;

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "I")
    private int field10134;

    @OriginalMember(owner = "client!aca", name = "A", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
    private int field10140;

    @OriginalMember(owner = "client!aca", name = "F", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!aca", name = "I", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!aca", name = "J", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!aca", name = "M", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!aca", name = "O", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!aca", name = "S", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!aca", name = "U", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!aca", name = "V", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!aca", name = "W", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!aca", name = "Y", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!aca", name = "fb", descriptor = "I")
    private int field10167;

    @OriginalMember(owner = "client!aca", name = "gb", descriptor = "I")
    private int field10168;

    @OriginalMember(owner = "client!aca", name = "cb", descriptor = "Lada;")
    private class161 field10164;

    @OriginalMember(owner = "client!aca", name = "eb", descriptor = "Lada;")
    private class161 field10166;

    @OriginalMember(owner = "client!aca", name = "ab", descriptor = "Llb;")
    public class542 field10162;

    @OriginalMember(owner = "client!aca", name = "jb", descriptor = "[Ltm;")
    private class389[] field10171;

    @OriginalMember(owner = "client!aca", name = "H", descriptor = "[[[I")
    private int[][][] field10143;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1823(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field10125;
        this.method4085(arg4, (byte) -116, arg5, arg3, arg1, arg6, arg0, arg2);
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lsr;IIII[[I[[II)V")
    public class726(class251 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field10149 = arg0;
        this.field10169 = new float[super.field3935 + 1][super.field3930 + 1];
        this.field10155 = new int[arg3][arg4][];
        this.field10152 = new class389[arg3][arg4][];
        this.field10146 = new int[arg3][arg4][];
        this.field10131 = new byte[arg3][arg4];
        this.field10138 = new int[arg3][arg4][];
        this.field10165 = new byte[arg3 - -1][arg4 - -1];
        this.field10153 = arg2;
        this.field10135 = new int[arg3][arg4][];
        this.field10142 = 1 << this.field10124;
        this.field10172 = new float[super.field3935 + 1][super.field3930 + 1];
        this.field10129 = new short[arg3 * arg4][];
        this.field10139 = new int[arg3][arg4][];
        this.field10170 = new float[super.field3935 - -1][super.field3930 + 1];
        for (int var9 = 0; super.field3930 >= var9; ++var9) {
            for (int var10 = 0; ~super.field3935 <= ~var10; ++var10) {
                int var11 = super.field3932[var10][var9];
                if (this.field10127 < (float) var11) {
                    this.field10127 = (float) var11;
                }
                if (this.field10151 > (float) var11) {
                    this.field10151 = (float) var11;
                }
                if (~var10 < -1 && var9 > 0 && ~var10 > ~super.field3935 && ~super.field3930 < ~var9) {
                    int var12 = arg6[var10 - -1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var12 * var12 - -(var13 * var13))));
                    this.field10169[var10][var9] = (float) var12 * var14;
                    this.field10170[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field10172[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field10151;
        ++this.field10127;
        this.field10161 = new class188(128);
        if ((this.field10153 & 16) != 0) {
            this.field10159 = new class750(this.field10149, this);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1813(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field10123;
        if (this.field10159 != null && arg0 != null) {
            int var7 = arg1 - (this.field10149.field3602 * arg2 >> 8) >> this.field10149.field3625;
            int var8 = -(this.field10149.field3578 * arg2 >> 8) + arg3 >> this.field10149.field3625;
            return this.field10159.method4165(arg0, var7, var8, -7219);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ll;III)V")
    private final void method4081(class18 arg0, int arg1, int arg2, int arg3) {
        ++field10157;
        int[] var5 = this.field10139[arg3][arg2];
        int[] var6 = this.field10138[arg3][arg2];
        int var7 = var5.length;
        if (~class158.field2201.length > ~var7) {
            class158.field2201 = new int[var7];
            class160.field2206 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class158.field2201[var8] = var5[var8] >> this.field10149.field3625;
            class160.field2206[var8] = var6[var8] >> this.field10149.field3625;
        }
        if (arg1 != 255) {
            this.method4085(false, (byte) 23, 123, (boolean[][]) null, -6, -43, -32, 91);
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class158.field2201[var9];
            int var11 = class160.field2206[var9++];
            int var12 = class158.field2201[var9];
            int var13 = class160.field2206[var9++];
            int var14 = class158.field2201[var9];
            int var15 = class160.field2206[var9++];
            if ((var10 - var12) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13)) > 0) {
                arg0.method108(var14, var10, var12, var11, (byte) -34, var13, var15);
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1811(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field10133;
        if (this.field10159 != null && arg0 != null) {
            int var7 = -(this.field10149.field3602 * arg2 >> 8) + arg1 >> this.field10149.field3625;
            int var8 = -(this.field10149.field3578 * arg2 >> 8) + arg3 >> this.field10149.field3625;
            this.field10159.method4170(arg0, 2048, var8, var7);
        }
    }

    @OriginalMember(owner = "client!aca", name = "fa", descriptor = "(IILr;)Lr;")
    public final class180 method1822(int arg0, int arg1, class180 arg2) {
        ++field10154;
        if ((1 & this.field10131[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field3925 >> this.field10149.field3625;
            class18 var5 = (class18) arg2;
            class18 var6;
            if (var5 != null && var5.method112(27928, var4, var4)) {
                var6 = var5;
                var5.method110((byte) 114);
            } else {
                var6 = new class18(this.field10149, var4, var4);
            }
            var6.method111(0, var4, var4, -18678, 0);
            this.method4081(var6, 255, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1825(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field10144;
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1818(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(CB)Z")
    public static final boolean method4082(char arg0, byte arg1) {
        ++field10128;
        if (~arg0 <= -33 && arg0 <= '~') {
            return true;
        } else {
            if (arg1 != -85) {
                field10160 = 75;
            }
            if (arg0 >= 160 && ~arg0 >= -256) {
                return true;
            } else {
                return ~arg0 == -8365 || arg0 == 338 || arg0 == 8212 || ~arg0 == -340 || arg0 == 376;
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1810(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field10156;
        if (this.field10159 != null && arg0 != null) {
            int var7 = -(this.field10149.field3602 * arg2 >> 8) + arg1 >> this.field10149.field3625;
            int var8 = -(this.field10149.field3578 * arg2 >> 8) + arg3 >> this.field10149.field3625;
            this.field10159.method4169(var8, arg0, (byte) 111, var7);
        }
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)V")
    public static void method4083(int arg0) {
        if (arg0 <= 107) {
            method4084(false);
        }
        field10132 = null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method4085(arg4, (byte) 25, -1, arg3, arg1, arg5, arg0, arg2);
        ++field10126;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public static final void method4084(boolean arg0) {
        class103.field1219 = new class464();
        ++field10145;
        if (arg0) {
            method4084(true);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field10141;
        if (this.field10168 > 0) {
            class749 var9 = this.field10149.method1635(-14589, this.field10140);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method2154(27599, true);
                if (var14 != null) {
                    Stream var15 = this.field10149.method1666(var14, true);
                    if (!Stream.method3662()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field3935 * var16 + arg3;
                            for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field10129[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            var15.method3655(var21);
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field3935 * var22 + arg3;
                            for (int var26 = arg3; ~arg5 < ~var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field10129[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            ++var10;
                                            if (var12 < var29) {
                                                var12 = var29;
                                            }
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            var15.method3654(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3656();
                    if (var9.method2156((byte) 106)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field10149.method1617(false);
                this.field10149.method1638(false, 8406);
                this.field10149.method1645(false, -22042);
                this.field10149.method1634(false, -32);
                this.field10149.method1629(false, (byte) -85);
                this.field10149.method1602(-1, 0);
                this.field10149.method1605(false, -2, 32242, false);
                this.field10149.method1663((class12) null, -2);
                class328 var23 = this.field10149.method1587(3);
                float[] var24 = this.field10149.method1661(-10579);
                var24[9] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field3925 * 128.0F * (float) this.field10149.field3384);
                var24[7] = 0.0F;
                var24[1] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field3925 * 128.0F * (float) this.field10149.field3412);
                var24[8] = 0.0F;
                var24[14] = -this.field10151 / (-this.field10151 + this.field10127);
                var24[15] = 1.0F;
                var24[11] = 0.0F;
                var24[2] = 0.0F;
                var24[4] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field10149.field3384) + -1.0F;
                var24[3] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field10149.field3412) + 1.0F;
                var24[10] = 1.0F / (this.field10127 - this.field10151);
                var24[6] = 0.0F;
                var23.method2145(false, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
                this.field10149.method1667((byte) 118);
                this.field10149.method1662(2);
                if ((this.field10153 & 7) != 0) {
                    this.field10149.method1645(true, -22042);
                    this.field10149.method1456(1);
                } else {
                    this.field10149.method1645(false, -22042);
                }
                this.field10149.method1467((byte) 115, false);
                this.field10149.method1460(0, 1, this.field10166);
                this.field10149.method1460(1, 1, this.field10164);
                this.field10149.method1479(this.field10162, 16);
                this.field10149.method1475(-var11 + var12 + 1, var10 / 3, class441.field6289, -17390, var11, var9, 0);
                this.field10149.method1467((byte) 115, true);
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1818(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field10148;
        if (arg3 != null && this.field10146 == null) {
            this.field10146 = new int[super.field3935][super.field3930][];
        }
        class149 var15 = this.field10149.field715;
        if (arg5 != null && this.field10143 == null) {
            this.field10143 = new int[super.field3935][super.field3930][];
        }
        this.field10139[arg0][arg1] = arg2;
        this.field10138[arg0][arg1] = arg4;
        this.field10135[arg0][arg1] = arg6;
        this.field10155[arg0][arg1] = arg7;
        if (this.field10143 != null) {
            this.field10143[arg0][arg1] = arg5;
        }
        if (this.field10146 != null) {
            this.field10146[arg0][arg1] = arg3;
        }
        class389[] var16 = this.field10152[arg0][arg1] = new class389[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field10153) != -1 && var18 != -1 && var15.method532((byte) 127, var18).field7194) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (var19 << 14) | (long) var18;
            class189 var22;
            for (var22 = this.field10161.method1180((byte) 26, var20); var22 != null; var22 = this.field10161.method1174(0)) {
                class389 var23 = (class389) var22;
                if (var23.field5510 == var18 && (float) var19 == var23.field5496 && ~var23.field5501 == ~arg10 && var23.field5499 == arg11 && ~var23.field5495 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class389(this, var18, var19, arg10, arg11, arg12);
                this.field10161.method1179(var20, var16[var17], (byte) -26);
            } else {
                var16[var17] = (class389) var22;
            }
        }
        if (arg13) {
            this.field10131[arg0][arg1] = (byte) class325.method2116(this.field10131[arg0][arg1], 1);
        }
        if (arg6.length > this.field10167) {
            this.field10167 = arg6.length;
        }
        this.field10168 += arg6.length;
    }

    @OriginalMember(owner = "client!aca", name = "YA", descriptor = "()V")
    public final void method1821() {
        ++field10130;
        if (this.field10168 <= 0) {
            this.field10159 = null;
        } else {
            byte[][] var1 = new byte[super.field3935 + 1][super.field3930 + 1];
            for (int var2 = 1; ~super.field3935 < ~var2; ++var2) {
                for (int var107 = 1; var107 < super.field3930; ++var107) {
                    var1[var2][var107] = (byte) ((this.field10165[var2][var107] >> 1) + (this.field10165[var2][var107 + 1] >> 3) + (this.field10165[var2 + 1][var107] >> 3) + (this.field10165[var2][var107 + -1] >> 2) + (this.field10165[var2 - 1][var107] >> 2));
                }
            }
            class389[] var3 = new class389[this.field10161.method1177(58)];
            this.field10161.method1181(var3, -1);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method2449(this.field10168, 31601);
            }
            int var5 = 20;
            if (this.field10143 != null) {
                var5 += 4;
            }
            if (~(this.field10153 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field10149.field3417.method3649(this.field10168 * 4, false);
            NativeHeapBuffer var7 = this.field10149.field3417.method3649(this.field10168 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class389[] var10 = new class389[this.field10168];
            int var11 = class42.method282(-1350259935, this.field10168 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class188 var12 = new class188(var11);
            class389[] var13 = new class389[this.field10167];
            for (int var14 = 0; ~super.field3935 < ~var14; ++var14) {
                for (int var34 = 0; ~super.field3930 < ~var34; ++var34) {
                    if (this.field10135[var14][var34] != null) {
                        class389[] var35 = this.field10152[var14][var34];
                        int[] var36 = this.field10139[var14][var34];
                        int[] var37 = this.field10138[var14][var34];
                        int[] var38 = this.field10155[var14][var34];
                        int[] var39 = this.field10135[var14][var34];
                        int[] var40 = this.field10146 != null ? this.field10146[var14][var34] : null;
                        int[] var41 = this.field10143 != null ? this.field10143[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field10169[var14][var34];
                        float var43 = this.field10170[var14][var34];
                        float var44 = this.field10172[var14][var34];
                        float var45 = this.field10169[var14][var34 + 1];
                        float var46 = this.field10170[var14][var34 + 1];
                        float var47 = this.field10172[var14][var34 + 1];
                        float var48 = this.field10169[var14 + 1][var34 + 1];
                        float var49 = this.field10170[var14 + 1][var34 + 1];
                        float var50 = this.field10172[var14 + 1][var34 + 1];
                        float var51 = this.field10169[var14 + 1][var34];
                        float var52 = this.field10170[var14 - -1][var34];
                        float var53 = this.field10172[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 - -1] & 255;
                        int var56 = var1[var14 + 1][var34 - -1] & 255;
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label359: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class389 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field10129[super.field3935 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field3929) + var36[var61];
                            int var63 = (var34 << super.field3929) + var37[var61];
                            int var64 = var62 >> this.field10124;
                            int var65 = var63 >> this.field10124;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            int var75;
                            float var76;
                            float var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var73 - var54;
                                var76 = var43;
                                var77 = var42;
                                var78 = var44;
                            } else if (var71 == 0 && super.field3925 == var72) {
                                var78 = var47;
                                var75 = var73 - var55;
                                var76 = var46;
                                var77 = var45;
                            } else if (~super.field3925 == ~var71 && ~super.field3925 == ~var72) {
                                var75 = var73 - var56;
                                var77 = var48;
                                var76 = var49;
                                var78 = var50;
                            } else if (~super.field3925 == ~var71 && ~var72 == -1) {
                                var76 = var52;
                                var75 = var73 - var57;
                                var77 = var51;
                                var78 = var53;
                            } else {
                                float var79 = (float) var71 / (float) super.field3925;
                                float var80 = (float) var72 / (float) super.field3925;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (-var44 + var53) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                var76 = (var85 - var82) * var80 + var82;
                                var77 = (-var81 + var84) * var80 + var81;
                                float var86 = (var50 - var47) * var79 + var47;
                                var78 = (var86 - var83) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field3929) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field3929) + var55;
                                var75 = var73 - (((-var87 + var88) * var72 >> super.field3929) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var75 >> 7;
                                if (~var90 <= -3) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if ((7 & this.field10153) == 0) {
                                    float var91 = this.field10149.field3569[2] * var78 + this.field10149.field3569[1] * var76 + this.field10149.field3569[0] * var77;
                                    var89 = this.field10149.field3597 + var91 * (!(var91 > 0.0F) ? this.field10149.field3579 : this.field10149.field3580);
                                }
                                var74 = class295.field4163[var66 & 65408 | var90];
                            }
                            class189 var92 = null;
                            if (~(var62 & this.field10142 + -1) == -1 && (this.field10142 + -1 & var63) == 0) {
                                var92 = var12.method1180((byte) 26, var69);
                            }
                            int var103;
                            if (var92 == null) {
                                int var93;
                                if (~var66 == ~var67) {
                                    var93 = var74;
                                } else {
                                    int var94 = (var67 & 127) * var75 >> 7;
                                    if (var94 >= 2) {
                                        if (var94 > 126) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var93 = class295.field4163[65408 & var67 | var94];
                                    if (~(this.field10153 & 7) == -1) {
                                        float var95 = this.field10149.field3569[2] * var78 + this.field10149.field3569[1] * var76 + this.field10149.field3569[0] * var77;
                                        float var96 = (var89 > 0.0F ? this.field10149.field3580 : this.field10149.field3579) * var89 + this.field10149.field3597;
                                        int var97 = var93 >> 16 & 255;
                                        int var98 = var93 >> 8 & 255;
                                        int var99 = var93 & 255;
                                        int var100 = (int) ((float) var97 * var96);
                                        int var101 = (int) ((float) var98 * var96);
                                        if (~var100 <= -1) {
                                            if (var100 > 255) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        if (~var101 > -1) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var96);
                                        if (~var102 > -1) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        var93 = var100 << 16 | var101 << 8 | var102;
                                    }
                                }
                                if (!Stream.method3662()) {
                                    var8.method3658((float) var62);
                                    var8.method3658((float) (var68 + this.method1815(var63, var62, 108)));
                                    var8.method3658((float) var63);
                                    var8.method3658((float) var62);
                                    var8.method3658((float) var63);
                                    if (this.field10143 != null) {
                                        var8.method3658((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if (~(this.field10153 & 7) != -1) {
                                        var8.method3658(var77);
                                        var8.method3658(var76);
                                        var8.method3658(var78);
                                    }
                                } else {
                                    var8.method3666((float) var62);
                                    var8.method3666((float) (this.method1815(var63, var62, -123) + var68));
                                    var8.method3666((float) var63);
                                    var8.method3666((float) var62);
                                    var8.method3666((float) var63);
                                    if (this.field10143 != null) {
                                        var8.method3666((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((7 & this.field10153) != 0) {
                                        var8.method3666(var77);
                                        var8.method3666(var76);
                                        var8.method3666(var78);
                                    }
                                }
                                if (~this.field10149.field3599 == -1) {
                                    var9.method3653(-16777216 | var93);
                                } else {
                                    var9.method3663(-16777216 | var93);
                                }
                                var103 = this.field10134++;
                                var60[var61] = (short) var103;
                                if (var66 != -1) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method1179(var69, new class65(var60[var61]), (byte) -26);
                            } else {
                                var60[var61] = ((class65) var92).field793;
                                var103 = 65535 & var60[var61];
                                if (~var66 != 0 && var35[var61].field2546 < var10[var103].field2546) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method2444(var89, var103, var74, var75, 125);
                            }
                            ++this.field10140;
                        }
                    }
                }
            }
            for (int var15 = 0; ~this.field10134 < ~var15; ++var15) {
                class389 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2448((byte) -80, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field3935; ++var16) {
                for (int var22 = 0; super.field3930 > var22; ++var22) {
                    short[] var23 = this.field10129[super.field3935 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class389 var29 = var10[var26];
                            class389 var30 = var10[var27];
                            class389 var31 = var10[var28];
                            class389 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method2447(var24, -99, var16, var22);
                            }
                            if (var30 != null) {
                                var30.method2447(var24, -89, var16, var22);
                                if (var32 == null || var30.field2546 < var32.field2546) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2447(var24, -50, var16, var22);
                                if (var32 == null || ~var31.field2546 > ~var32.field2546) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2448((byte) -45, var26);
                                }
                                if (var30 != null) {
                                    var32.method2448((byte) -54, var27);
                                }
                                if (var31 != null) {
                                    var32.method2448((byte) -103, var28);
                                }
                                var32.method2447(var24, -56, var16, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3656();
            var9.method3656();
            this.field10164 = this.field10149.method1429(false, 30519);
            this.field10164.method1062(var6, (byte) -84, this.field10134 * 4, 4);
            this.field10166 = this.field10149.method1429(false, 30519);
            this.field10166.method1062(var7, (byte) 120, this.field10134 * var5, var5);
            if ((7 & this.field10153) != 0) {
                if (this.field10143 == null) {
                    this.field10162 = this.field10149.method1466(new class459[] { new class459(new class295[] { class295.field4149, class295.field4158, class295.field4155 }), new class459(class295.field4156) }, (byte) 70);
                } else {
                    this.field10162 = this.field10149.method1466(new class459[] { new class459(new class295[] { class295.field4149, class295.field4158, class295.field4157, class295.field4155 }), new class459(class295.field4156) }, (byte) 78);
                }
            } else if (this.field10143 != null) {
                this.field10162 = this.field10149.method1466(new class459[] { new class459(new class295[] { class295.field4149, class295.field4158, class295.field4157 }), new class459(class295.field4156) }, (byte) -91);
            } else {
                this.field10162 = this.field10149.method1466(new class459[] { new class459(new class295[] { class295.field4149, class295.field4158 }), new class459(class295.field4156) }, (byte) 94);
            }
            int var17 = 0;
            for (int var18 = 0; ~var18 > ~var3.length; ++var18) {
                if (var3[var18].field5502 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field10171 = new class389[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class389 var21 = var3[var20];
                var19[var20] = var21.field2546;
                this.field10171[var20] = var21;
                var21.method2445(4, this.field10134);
            }
            class135.method964(var19, 0, this.field10171);
            if (this.field10159 != null) {
                this.field10159.method4166((byte) -128);
            }
        }
        this.field10169 = this.field10170 = this.field10172 = null;
        this.field10155 = null;
        this.field10143 = null;
        this.field10139 = this.field10138 = null;
        this.field10146 = null;
        this.field10135 = null;
        this.field10152 = null;
        this.field10165 = null;
        this.field10161 = null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZBI[[ZIIII)V")
    private final void method4085(boolean arg0, byte arg1, int arg2, boolean[][] arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -63 % ((arg1 - -80) / 36);
        ++field10137;
        if (this.field10171 != null) {
            int var10 = arg7 + 1 + arg7;
            int var11 = var10 * var10;
            if (var11 > class716.field9952.length) {
                class716.field9952 = new int[var11];
            }
            int var12 = -arg7 + arg6;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg7 + arg4;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg6 + arg7;
            if (var16 > super.field3935 - 1) {
                var16 = super.field3935 - 1;
            }
            int var17 = arg4 + arg7;
            client.field4239 = 0;
            if (var17 > super.field3930 - 1) {
                var17 = super.field3930 - 1;
            }
            for (int var18 = var12; ~var18 >= ~var16; ++var18) {
                boolean[] var25 = arg3[-var13 + var18];
                for (int var26 = var14; ~var26 >= ~var17; ++var26) {
                    if (var25[-var15 + var26]) {
                        class716.field9952[client.field4239++] = super.field3935 * var26 - -var18;
                    }
                }
            }
            if (~arg2 == 0) {
                this.field10149.method1604(false);
            } else {
                this.field10149.method1646((float) arg2, 31823);
                this.field10149.method1603(1);
            }
            this.field10149.method1659((byte) 115);
            this.field10149.method1645((7 & this.field10153) != 0, -22042);
            this.field10149.method1605(false, -1, 32242, false);
            this.field10149.method1460(0, 1, this.field10166);
            for (int var19 = 0; this.field10171.length > var19; ++var19) {
                this.field10171[var19].method2446(0, class716.field9952, client.field4239);
            }
            class328 var20 = this.field10149.method1587(3);
            var20.method339(0, -1, 0);
            this.field10149.method1662(2);
            if (!this.field10147.method2757((byte) 27)) {
                int var21 = this.field10149.field3627;
                int var22 = this.field10149.field3591;
                this.field10149.method418(0, var22, this.field10149.field3619);
                this.field10149.method1645(false, -22042);
                this.field10149.method1629(false, (byte) -123);
                this.field10149.method1602(-1, 128);
                this.field10149.method1605(false, -2, 32242, false);
                this.field10149.method1663(this.field10149.field3628, -2);
                this.field10149.method1613(-30, class502.field7202, class719.field9987);
                this.field10149.method1664((byte) -91, class679.field9315, 0);
                this.field10149.method1601(class539.field7554, 0, 256);
                for (class189 var23 = this.field10147.method2765(-12261); var23 != null; var23 = this.field10147.method2759(-15361)) {
                    class414 var24 = (class414) var23;
                    var24.method2545(-71, arg6, arg3, arg4, arg7);
                }
                this.field10149.method1664((byte) -111, class597.field8397, 0);
                this.field10149.method1601(class597.field8397, 0, 256);
                this.field10149.method1663((class12) null, -2);
                this.field10149.method418(var21, var22, this.field10149.field3619);
            }
            if (this.field10159 != null) {
                this.field10149.method1460(0, 1, this.field10166);
                this.field10149.method1460(1, 1, this.field10164);
                this.field10149.method1479(this.field10162, 16);
                this.field10159.method4168(arg4, arg7, (byte) 111, arg0, arg3, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)V")
    public final void method1812(int arg0, int arg1) {
        ++field10158;
    }

    @OriginalMember(owner = "client!aca", name = "ka", descriptor = "(III)V")
    public final void method1809(int arg0, int arg1, int arg2) {
        if ((255 & this.field10165[arg0][arg1]) < arg2) {
            this.field10165[arg0][arg1] = (byte) arg2;
        }
        ++field10136;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lwi;[I)V")
    public final void method1824(class465 arg0, int[] arg1) {
        this.field10147.method2770((byte) -13, new class414(this.field10149, this, arg0, arg1));
        ++field10150;
    }
}
