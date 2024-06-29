import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class203 extends class37 {

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "F")
    private float field3285 = -3.4028235E38F;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "F")
    private float field3303 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Lor;")
    private class594 field3276 = new class594();

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
    private int field3307 = this.field515 - 2;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "Lrr;")
    public class332 field3281;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "[[B")
    private byte[][] field3316;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    private int field3296;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "[[[I")
    public int[][][] field3297;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "[[[Lgca;")
    private class229[][][] field3295;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "[[[I")
    public int[][][] field3306;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "[[[I")
    private int[][][] field3282;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!hm", name = "hb", descriptor = "[[F")
    private float[][] field3321;

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "[[F")
    private float[][] field3318;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "[[S")
    public short[][] field3286;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "[[[I")
    private int[][][] field3294;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "[[F")
    private float[][] field3314;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "[[[I")
    public int[][][] field3305;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "[[B")
    private byte[][] field3280;

    @OriginalMember(owner = "client!hm", name = "jb", descriptor = "Lsba;")
    private class200 field3323;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "Lml;")
    private class355 field3298;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "Lmea;")
    public static class395 field3293 = new class395();

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "Los;")
    public static class408 field3311 = new class408(1);

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    private int field3284;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    private int field3290;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "I")
    private int field3313;

    @OriginalMember(owner = "client!hm", name = "ib", descriptor = "I")
    private int field3322;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "Log;")
    private class601 field3315;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "Log;")
    private class601 field3317;

    @OriginalMember(owner = "client!hm", name = "gb", descriptor = "Lqf;")
    public class633 field3320;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "[I")
    public static int[] field3310;

    @OriginalMember(owner = "client!hm", name = "fb", descriptor = "[Lgca;")
    private class229[] field3319;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "[[[I")
    private int[][][] field3300;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B[[ZZIIII)V", line = 4)
    private final void method1570(byte arg0, boolean[][] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 56) {
            this.method476(-20, -12, 122);
        }
        ++field3312;
        if (this.field3319 != null) {
            int var8 = arg4 + 1 + arg4;
            int var9 = var8 * var8;
            if (var9 > class272.field4396.length) {
                class272.field4396 = new int[var9];
            }
            int var10 = -arg4 + arg3;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg4 + arg6;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg3 - -arg4;
            if (~(super.field510 + -1) > ~var14) {
                var14 = super.field510 - 1;
            }
            int var15 = arg4 + arg6;
            if (~var15 < ~(super.field513 - 1)) {
                var15 = super.field513 + -1;
            }
            class276.field4478 = 0;
            for (int var16 = var10; var14 >= var16; ++var16) {
                boolean[] var23 = arg1[-var11 + var16];
                for (int var24 = var12; var15 >= var24; ++var24) {
                    if (var23[var24 - var13]) {
                        class272.field4396[class276.field4478++] = super.field510 * var24 + var16;
                    }
                }
            }
            if (~arg5 != 0) {
                this.field3281.method2279(arg0 + -17264, (float) arg5);
                this.field3281.method2231(true);
            } else {
                this.field3281.method2278((byte) -111);
            }
            this.field3281.method2226(7554);
            this.field3281.method2238((this.field3288 & 7) != 0, -42);
            this.field3281.method2242(false, -14500, -1, false);
            this.field3281.method178(this.field3317, 0, -55);
            for (int var17 = 0; this.field3319.length > var17; ++var17) {
                this.field3319[var17].method1686(-118, class272.field4396, class276.field4478);
            }
            class498 var18 = this.field3281.method2296(0);
            var18.method503(0, -1, 0);
            this.field3281.method2270(arg0 + -138);
            if (!this.field3276.method3464(0)) {
                int var19 = this.field3281.field5411;
                int var20 = this.field3281.field5340;
                this.field3281.method313(0, var20, this.field3281.field5329);
                this.field3281.method2238(false, arg0 ^ -103);
                this.field3281.method2224((byte) -18, false);
                this.field3281.method2259(arg0 ^ -112, 128);
                this.field3281.method2242(false, -14500, -2, false);
                this.field3281.method2271(this.field3281.field5418, arg0 + 5124);
                this.field3281.method2275(class406.field6268, 118, class646.field9074);
                this.field3281.method2287((byte) -76, 0, class471.field6974);
                this.field3281.method2304(class24.field409, 0, -123);
                for (class66 var21 = this.field3276.method3465((byte) -106); var21 != null; var21 = this.field3276.method3469(arg0 + -56)) {
                    class389 var22 = (class389) var21;
                    var22.method2527(arg3, arg4, 31584, arg6, arg1);
                }
                this.field3281.method2287((byte) -98, 0, class622.field8779);
                this.field3281.method2304(class622.field8779, 0, -121);
                this.field3281.method2271((class152) null, arg0 + 5124);
                this.field3281.method313(var19, var20, this.field3281.field5329);
            }
            if (this.field3298 != null) {
                this.field3281.method178(this.field3317, 0, -75);
                this.field3281.method178(this.field3315, 1, arg0 + -152);
                this.field3281.method137(-66, this.field3320);
                this.field3298.method2386(arg4, arg6, arg2, arg1, arg3, (byte) -97);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 149)
    public final void method473(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3278;
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method484(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLpba;Loo;II)V", line = 237)
    public static final void method1571(byte arg0, class304 arg1, class580 arg2, int arg3, int arg4) {
        ++field3273;
        if (~(4096 & arg3) != -1) {
            arg1.field4758 = ~arg2.method77((byte) -124) == -2;
        }
        byte var5 = -1;
        if (~(arg3 & 32768) != -1) {
            int var6 = arg2.method78(true);
            int var7 = arg2.method72(-127);
            if (~var6 == -65536) {
                var6 = -1;
            }
            int var8 = arg2.method33((byte) 99);
            arg1.method1855(var8, var6, true, -1, var7);
        }
        if (~(2 & arg3) != -1) {
            arg1.field4743 = arg2.method39((byte) 127);
            if (arg1.field4267 == 0) {
                arg1.method1835(arg1.field4743, 0);
                arg1.field4743 = -1;
            }
        }
        if ((1 & arg3) != 0) {
            int var9 = arg2.method88((byte) 90);
            int var10 = arg2.method70(-9059);
            arg1.method1857(var10, class562.field8084, var9, (byte) 83);
            arg1.field4190 = class562.field8084 + 300;
            arg1.field4186 = arg2.method33((byte) 99);
        }
        if ((1024 & arg3) != 0) {
            arg1.field4182 = arg2.method42((byte) -24);
            if (~arg1.field4182.charAt(0) == -127) {
                arg1.field4182 = arg1.field4182.substring(1);
                class247.method1763(arg1.field4759, arg1.method2111(true, 0), arg1.field4182, false, 0, 2, arg1.method2105(arg0 + 27033, false));
            } else if (class567.field8141 == arg1) {
                class247.method1763(arg1.field4759, arg1.method2111(true, 0), arg1.field4182, false, 0, 2, arg1.method2105(27069, false));
            }
            arg1.field4252 = 0;
            arg1.field4246 = 150;
            arg1.field4171 = 0;
        }
        if ((8 & arg3) != 0) {
            int var11 = arg2.method78(true);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = arg2.method30(arg0 ^ 71);
            int var13 = arg2.method75(-5);
            arg1.method1855(var13, var11, false, -1, var12);
        }
        if (~(65536 & arg3) != -1) {
            int var14 = arg2.method70(arg0 + -9095);
            int[] var15 = new int[var14];
            int[] var16 = new int[var14];
            for (int var17 = 0; var17 < var14; ++var17) {
                int var18 = arg2.method67(arg0 + 11985);
                if ((var18 & 49152) != 49152) {
                    var15[var17] = var18;
                } else {
                    int var19 = arg2.method78(true);
                    var15[var17] = class81.method769(var19, var18 << 16);
                }
                var16[var17] = arg2.method68(12513);
            }
            arg1.method1849(var16, var15, (byte) 22);
        }
        if (~(2048 & arg3) != -1) {
            int var20 = arg2.method75(-32);
            int[] var21 = new int[var20];
            int[] var22 = new int[var20];
            int[] var23 = new int[var20];
            for (int var24 = 0; var20 > var24; ++var24) {
                int var25 = arg2.method78(true);
                if (~var25 == -65536) {
                    var25 = -1;
                }
                var21[var24] = var25;
                var22[var24] = arg2.method70(-9059);
                var23[var24] = arg2.method78(true);
            }
            class244.method1745(var21, arg1, 0, var22, var23);
        }
        if (~(arg3 & 32) != -1) {
            class545.field7924[arg4] = arg2.method31(-124);
        }
        if (~(128 & arg3) != -1) {
            int var26 = arg2.method78(true);
            if (~var26 == -65536) {
                var26 = -1;
            }
            arg1.field4206 = var26;
        }
        if ((arg3 & 262144) != 0) {
            arg1.field4162 = arg2.method81(true);
            arg1.field4218 = arg2.method85(true);
            arg1.field4251 = arg2.method85(true);
            arg1.field4241 = (byte) arg2.method77((byte) -61);
            arg1.field4198 = class562.field8084 - -arg2.method67(12021);
            arg1.field4172 = class562.field8084 - -arg2.method39((byte) 124);
        }
        if (arg0 != 36) {
            method1574(123, 91, 118);
        }
        if (~(arg3 & 512) != -1) {
            var5 = arg2.method81(true);
        }
        if (~(131072 & arg3) != -1) {
            int var27 = class562.field8084;
            int var28 = arg2.method88((byte) 90);
            int var29 = arg2.method70(arg0 + -9095);
            arg1.method1857(var29, var27, var28, (byte) 83);
        }
        if ((arg3 & 8192) != 0) {
            int var30 = arg2.method68(arg0 ^ 12485);
            arg1.field4248 = arg2.method70(-9059);
            arg1.field4236 = arg2.method33((byte) 99);
            arg1.field4179 = (32768 & var30) != 0;
            arg1.field4250 = var30 & 32767;
            arg1.field4205 = class562.field8084 + arg1.field4250 + arg1.field4248;
        }
        if ((64 & arg3) != 0) {
            int var31 = arg2.method77((byte) -102);
            byte[] var32 = new byte[var31];
            class6 var33 = new class6(var32);
            arg2.method50(var32, 0, var31, (byte) 19);
            class588.field8351[arg4] = var33;
            arg1.method2112(var33, arg0 + -136);
        }
        if (~(4 & arg3) != -1) {
            int[] var34 = new int[4];
            for (int var35 = 0; ~var35 > -5; ++var35) {
                var34[var35] = arg2.method68(12513);
                if (~var34[var35] == -65536) {
                    var34[var35] = -1;
                }
            }
            int var36 = arg2.method77((byte) -67);
            class163.method1324(var34, var36, 0, arg1);
        }
        if (~(16384 & arg3) != -1) {
            arg1.field4226 = arg2.method85(true);
            arg1.field4216 = arg2.method48((byte) -118);
            arg1.field4229 = arg2.method48((byte) -118);
            arg1.field4202 = arg2.method85(true);
            arg1.field4203 = arg2.method68(12513) - -class562.field8084;
            arg1.field4151 = arg2.method68(12513) - -class562.field8084;
            arg1.field4177 = arg2.method70(arg0 ^ -9031);
            if (arg1.field4751) {
                arg1.field4267 = 0;
                arg1.field4229 += arg1.field4790;
                arg1.field4216 += arg1.field4741;
                arg1.field4202 += arg1.field4741;
                arg1.field4226 += arg1.field4790;
            } else {
                arg1.field4216 += arg1.field4265[0];
                arg1.field4202 += arg1.field4265[0];
                arg1.field4226 += arg1.field4264[0];
                arg1.field4267 = 1;
                arg1.field4229 += arg1.field4264[0];
            }
            arg1.field4259 = 0;
        }
        if (arg1.field4751) {
            if (~var5 == -128) {
                arg1.method2110(arg1.field4741, 512, arg1.field4790);
            } else {
                byte var37;
                if (var5 != -1) {
                    var37 = var5;
                } else {
                    var37 = class545.field7924[arg4];
                }
                arg1.method2104(var37, arg1.field4741, (byte) -99, arg1.field4790);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILwp;II)V", line = 539)
    private final void method1572(int arg0, class164 arg1, int arg2, int arg3) {
        ++field3274;
        int[] var5 = this.field3305[arg0][arg3];
        int[] var6 = this.field3306[arg0][arg3];
        int var7 = var5.length;
        if (~class384.field5931.length > ~var7) {
            class173.field2867 = new int[var7];
            class384.field5931 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class384.field5931[var8] = var5[var8] >> this.field3281.field5400;
            class173.field2867[var8] = var6[var8] >> this.field3281.field5400;
        }
        int var9 = 0;
        while (~var9 > ~var7) {
            int var10 = class384.field5931[var9];
            int var11 = class173.field2867[var9++];
            int var12 = class384.field5931[var9];
            int var13 = class173.field2867[var9++];
            int var14 = class384.field5931[var9];
            int var15 = class173.field2867[var9++];
            if (~((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14))) < -1) {
                arg1.method1330(var10, var11, var13, var12, var14, (byte) -109, var15);
            }
        }
        if (arg2 != -15654) {
            this.field3318 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "(Lha;IIIIZ)V", line = 597)
    public final void method480(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3292;
        if (this.field3298 != null && arg0 != null) {
            int var7 = arg1 - (this.field3281.field5424 * arg2 >> 8) >> this.field3281.field5400;
            int var8 = -(this.field3281.field5352 * arg2 >> 8) + arg3 >> this.field3281.field5400;
            this.field3298.method2391(true, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII[[Z)V", line = 612)
    public final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3279;
        if (~this.field3313 < -1) {
            class679 var9 = this.field3281.method2262((byte) -111, this.field3290);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method430(true, (byte) -107);
                if (var14 != null) {
                    Stream var15 = this.field3281.method2286(var14, (byte) -57);
                    if (!Stream.method3620()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field510 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field3286[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            ++var10;
                                            if (~var11 < ~var21) {
                                                var11 = var21;
                                            }
                                            var15.method3623(var21);
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
                            int var25 = super.field510 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field3286[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                            var15.method3628(var29);
                                            if (var12 < var29) {
                                                var12 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3626();
                    if (var9.method425(30899)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field3281.method2240((byte) 126);
                this.field3281.method2288((byte) -126, false);
                this.field3281.method2238(false, -40);
                this.field3281.method2295(false, 128);
                this.field3281.method2224((byte) -18, false);
                this.field3281.method2259(-116, 0);
                this.field3281.method2242(false, -14500, -2, false);
                this.field3281.method2271((class152) null, 5180);
                class498 var23 = this.field3281.method2296(0);
                float[] var24 = this.field3281.method2285(-125);
                var24[7] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3281.field5305) + -1.0F;
                var24[4] = 0.0F;
                var24[10] = 1.0F / (-this.field3303 + this.field3285);
                var24[0] = (float) arg2 / ((float) super.field516 * 128.0F * (float) this.field3281.field5305);
                var24[15] = 1.0F;
                var24[11] = 0.0F;
                var24[3] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3281.field5195) + 1.0F;
                var24[9] = 0.0F;
                var24[2] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field516 * 128.0F * (float) this.field3281.field5195);
                var24[6] = 0.0F;
                var24[14] = -this.field3303 / (this.field3285 - this.field3303);
                var24[8] = 0.0F;
                var24[1] = 0.0F;
                var23.method3023(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, (byte) -100, 0.0F, 0.0F);
                this.field3281.method2248(25416);
                this.field3281.method2270(-28);
                if (~(7 & this.field3288) != -1) {
                    this.field3281.method2238(true, -28);
                    this.field3281.method184(4);
                } else {
                    this.field3281.method2238(false, -50);
                }
                this.field3281.method106(8077, false);
                this.field3281.method178(this.field3317, 0, 75);
                this.field3281.method178(this.field3315, 1, -78);
                this.field3281.method137(-90, this.field3320);
                this.field3281.method120(class646.field9077, var12 - (var11 + -1), var9, 0, 122, var10 / 3, var11);
                this.field3281.method106(8077, true);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "BA", descriptor = "()V", line = 805)
    public final void method483() {
        ++field3289;
        if (this.field3313 > 0) {
            byte[][] var1 = new byte[super.field510 - -1][super.field513 + 1];
            for (int var2 = 1; ~super.field510 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field513; ++var107) {
                    var1[var2][var107] = (byte) ((this.field3316[var2][var107 + 1] >> 3) + (this.field3316[var2 - 1][var107] >> 2) + (this.field3316[var2 + 1][var107] >> 3) + (this.field3316[var2][var107 + -1] >> 2) + (this.field3316[var2][var107] >> 1));
                }
            }
            class229[] var3 = new class229[this.field3323.method1555(0)];
            this.field3323.method1563(var3, 1);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method1680((byte) -53, this.field3313);
            }
            int var5 = 20;
            if (this.field3300 != null) {
                var5 += 4;
            }
            if ((7 & this.field3288) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field3281.field5280.method3617(this.field3313 * 4, false);
            NativeHeapBuffer var7 = this.field3281.field5280.method3617(this.field3313 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class229[] var10 = new class229[this.field3313];
            int var11 = class638.method3708(false, this.field3313 / 4);
            if (~var11 > -2) {
                var11 = 1;
            }
            class200 var12 = new class200(var11);
            class229[] var13 = new class229[this.field3322];
            for (int var14 = 0; var14 < super.field510; ++var14) {
                for (int var34 = 0; super.field513 > var34; ++var34) {
                    if (this.field3297[var14][var34] != null) {
                        class229[] var35 = this.field3295[var14][var34];
                        int[] var36 = this.field3305[var14][var34];
                        int[] var37 = this.field3306[var14][var34];
                        int[] var38 = this.field3294[var14][var34];
                        int[] var39 = this.field3297[var14][var34];
                        int[] var40 = this.field3282 == null ? null : this.field3282[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field3300 != null ? this.field3300[var14][var34] : null;
                        float var42 = this.field3321[var14][var34];
                        float var43 = this.field3314[var14][var34];
                        float var44 = this.field3318[var14][var34];
                        float var45 = this.field3321[var14][var34 + 1];
                        float var46 = this.field3314[var14][var34 + 1];
                        float var47 = this.field3318[var14][var34 + 1];
                        float var48 = this.field3321[var14 + 1][var34 + 1];
                        float var49 = this.field3314[var14 - -1][var34 - -1];
                        float var50 = this.field3318[var14 + 1][var34 - -1];
                        float var51 = this.field3321[var14 - -1][var34];
                        float var52 = this.field3314[var14 + 1][var34];
                        float var53 = this.field3318[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = var1[var14 - -1][var34 - -1] & 255;
                        int var57 = 255 & var1[var14 - -1][var34];
                        int var58 = 0;
                        label360: for (int var59 = 0; var39.length > var59; ++var59) {
                            class229 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label360;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field3286[super.field510 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field515) - -var36[var61];
                            int var63 = (var34 << super.field515) + var37[var61];
                            int var64 = var62 >> this.field3307;
                            int var65 = var63 >> this.field3307;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            float var77;
                            int var78;
                            float var79;
                            if (~var71 == -1 && var72 == 0) {
                                var76 = var43;
                                var77 = var42;
                                var78 = var73 - var54;
                                var79 = var44;
                            } else if (var71 == 0 && ~super.field516 == ~var72) {
                                var77 = var45;
                                var78 = var73 - var55;
                                var76 = var46;
                                var79 = var47;
                            } else if (super.field516 == var71 && super.field516 == var72) {
                                var78 = var73 - var56;
                                var77 = var48;
                                var76 = var49;
                                var79 = var50;
                            } else if (~super.field516 == ~var71 && var72 == 0) {
                                var79 = var53;
                                var78 = var73 - var57;
                                var76 = var52;
                                var77 = var51;
                            } else {
                                float var80 = (float) var71 / (float) super.field516;
                                float var81 = (float) var72 / (float) super.field516;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (var48 - var45) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                var76 = (var86 - var83) * var81 + var83;
                                var77 = (-var82 + var85) * var81 + var82;
                                float var87 = (var50 - var47) * var80 + var47;
                                var79 = (-var84 + var87) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field515) + var54;
                                int var89 = ((-var55 + var56) * var71 >> super.field515) + var55;
                                var78 = var73 - (var88 - -((var89 - var88) * var72 >> super.field515));
                            }
                            if (var66 != -1) {
                                int var90 = (var66 & 127) * var78 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if (~(this.field3288 & 7) == -1) {
                                    float var91 = this.field3281.field5423[2] * var79 + this.field3281.field5423[0] * var77 + this.field3281.field5423[1] * var76;
                                    var75 = (!(var91 > 0.0F) ? this.field3281.field5408 : this.field3281.field5369) * var91 + this.field3281.field5344;
                                }
                                var74 = class63.field819[var66 & 65408 | var90];
                            }
                            class66 var92 = null;
                            if ((this.field3296 + -1 & var62) == 0 && ~(this.field3296 + -1 & var63) == -1) {
                                var92 = var12.method1558(var69, (byte) -93);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class426) var92).field6472;
                                var93 = var60[var61] & 65535;
                                if (var66 != -1 && var10[var93].field844 > var35[var61].field844) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var78 >> 7;
                                    if (var95 >= 2) {
                                        if (var95 > 126) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class63.field819[var95 | 65408 & var67];
                                    if (~(7 & this.field3288) == -1) {
                                        float var96 = this.field3281.field5423[2] * var79 + this.field3281.field5423[1] * var76 + this.field3281.field5423[0] * var77;
                                        float var97 = this.field3281.field5344 + var75 * (var75 > 0.0F ? this.field3281.field5369 : this.field3281.field5408);
                                        int var98 = var94 >> 16 & 255;
                                        int var99 = (var94 & 65435) >> 8;
                                        int var100 = 255 & var94;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (var101 < 0) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (var103 < 0) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var94 = var103 | var101 << 16 | var102 << 8;
                                    }
                                }
                                if (!Stream.method3620()) {
                                    var8.method3630((float) var62);
                                    var8.method3630((float) (var68 + this.method477(-1, var63, var62)));
                                    var8.method3630((float) var63);
                                    var8.method3630((float) var62);
                                    var8.method3630((float) var63);
                                    if (this.field3300 != null) {
                                        var8.method3630((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(7 & this.field3288) != -1) {
                                        var8.method3630(var77);
                                        var8.method3630(var76);
                                        var8.method3630(var79);
                                    }
                                } else {
                                    var8.method3621((float) var62);
                                    var8.method3621((float) (var68 + this.method477(-1, var63, var62)));
                                    var8.method3621((float) var63);
                                    var8.method3621((float) var62);
                                    var8.method3621((float) var63);
                                    if (this.field3300 != null) {
                                        var8.method3621((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if ((7 & this.field3288) != 0) {
                                        var8.method3621(var77);
                                        var8.method3621(var76);
                                        var8.method3621(var79);
                                    }
                                }
                                if (~this.field3281.field5358 != -1) {
                                    var9.method3627(var94 | -16777216);
                                } else {
                                    var9.method3619(var94 | -16777216);
                                }
                                var93 = this.field3284++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method1564(var69, new class426(var60[var61]), (byte) 97);
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method1682(var74, var93, -25573, var78, var75);
                            }
                            ++this.field3290;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field3284; ++var15) {
                class229 var33 = var10[var15];
                if (var33 != null) {
                    var33.method1681((byte) 127, var15);
                }
            }
            for (int var16 = 0; ~super.field510 < ~var16; ++var16) {
                for (int var22 = 0; super.field513 > var22; ++var22) {
                    short[] var23 = this.field3286[super.field510 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class229 var29 = var10[var26];
                            class229 var30 = var10[var27];
                            class229 var31 = var10[var28];
                            class229 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method1679(var24, var22, false, var16);
                            }
                            if (var30 != null) {
                                var30.method1679(var24, var22, false, var16);
                                if (var32 == null || ~var30.field844 > ~var32.field844) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method1679(var24, var22, false, var16);
                                if (var32 == null || var31.field844 < var32.field844) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method1681((byte) 95, var26);
                                }
                                if (var30 != null) {
                                    var32.method1681((byte) 89, var27);
                                }
                                if (var31 != null) {
                                    var32.method1681((byte) 96, var28);
                                }
                                var32.method1679(var24, var22, false, var16);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3626();
            var9.method3626();
            this.field3315 = this.field3281.method174(false, 112);
            this.field3315.method1723(var6, 18869, 4, this.field3284 * 4);
            this.field3317 = this.field3281.method174(false, 112);
            this.field3317.method1723(var7, 18869, var5, this.field3284 * var5);
            if (~(this.field3288 & 7) != -1) {
                if (this.field3300 == null) {
                    this.field3320 = this.field3281.method105((byte) 72, new class108[] { new class108(new class369[] { class369.field5774, class369.field5778, class369.field5775 }), new class108(class369.field5776) });
                } else {
                    this.field3320 = this.field3281.method105((byte) 63, new class108[] { new class108(new class369[] { class369.field5774, class369.field5778, class369.field5777, class369.field5775 }), new class108(class369.field5776) });
                }
            } else if (this.field3300 != null) {
                this.field3320 = this.field3281.method105((byte) 64, new class108[] { new class108(new class369[] { class369.field5774, class369.field5778, class369.field5777 }), new class108(class369.field5776) });
            } else {
                this.field3320 = this.field3281.method105((byte) 100, new class108[] { new class108(new class369[] { class369.field5774, class369.field5778 }), new class108(class369.field5776) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (var3[var18].field3676 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field3319 = new class229[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class229 var21 = var3[var20];
                var19[var20] = var21.field844;
                this.field3319[var20] = var21;
                var21.method1683(this.field3284, 124);
            }
            class316.method2155(this.field3319, (byte) 123, var19);
            if (this.field3298 != null) {
                this.field3298.method2384((byte) -36);
            }
        } else {
            this.field3298 = null;
        }
        this.field3300 = null;
        this.field3323 = null;
        this.field3316 = null;
        this.field3282 = null;
        this.field3305 = this.field3306 = null;
        this.field3295 = null;
        this.field3297 = null;
        this.field3321 = this.field3314 = this.field3318 = null;
        this.field3294 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V", line = 1412)
    public final void method489(int arg0, int arg1) {
        ++field3275;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V", line = 1422)
    public final void method476(int arg0, int arg1, int arg2) {
        if ((this.field3316[arg0][arg1] & 255) < arg2) {
            this.field3316[arg0][arg1] = (byte) arg2;
        }
        ++field3291;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lrr;IIII[[I[[II)V", line = 1433)
    public class203(class332 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3281 = arg0;
        this.field3316 = new byte[arg3 + 1][arg4 - -1];
        this.field3296 = 1 << this.field3307;
        this.field3297 = new int[arg3][arg4][];
        this.field3295 = new class229[arg3][arg4][];
        this.field3306 = new int[arg3][arg4][];
        this.field3282 = new int[arg3][arg4][];
        this.field3288 = arg2;
        this.field3321 = new float[super.field510 - -1][super.field513 + 1];
        this.field3318 = new float[super.field510 + 1][super.field513 + 1];
        this.field3286 = new short[arg3 * arg4][];
        this.field3294 = new int[arg3][arg4][];
        this.field3314 = new float[super.field510 - -1][super.field513 + 1];
        this.field3305 = new int[arg3][arg4][];
        this.field3280 = new byte[arg3][arg4];
        for (int var9 = 0; super.field513 >= var9; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field510; ++var10) {
                int var11 = super.field519[var10][var9];
                if (this.field3303 > (float) var11) {
                    this.field3303 = (float) var11;
                }
                if (this.field3285 < (float) var11) {
                    this.field3285 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && super.field510 > var10 && var9 < super.field513) {
                    int var12 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var13 * var13)));
                    this.field3321[var10][var9] = (float) var12 * var14;
                    this.field3314[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field3318[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field3303;
        ++this.field3285;
        this.field3323 = new class200(128);
        if (~(this.field3288 & 16) != -1) {
            this.field3298 = new class355(this.field3281, this);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 1509)
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg5 >= class576.field8218 && class340.field5510 >= arg5 && class576.field8218 <= arg7 && class340.field5510 >= arg7 && ~class576.field8218 >= ~arg4 && class340.field5510 >= arg4 && arg2 >= class576.field8218 && ~arg2 >= ~class340.field5510 && ~class545.field7931 >= ~arg3 && ~class585.field8331 <= ~arg3 && ~arg6 <= ~class545.field7931 && ~arg6 >= ~class585.field8331 && ~arg8 <= ~class545.field7931 && ~class585.field8331 <= ~arg8 && class545.field7931 <= arg1 && arg1 <= class585.field8331) {
            class321.method2180(arg7, arg3, arg6, arg2, arg4, arg0, -524391476, arg8, arg5, arg1);
        } else {
            class632.method3678(arg6, arg5, arg1, arg4, arg3, arg8, arg0, arg2, (byte) -86, arg7);
        }
        if (arg9) {
            ++field3299;
        }
    }

    @OriginalMember(owner = "client!hm", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 1528)
    public final void method475(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3309;
        if (this.field3298 != null && arg0 != null) {
            int var7 = -(this.field3281.field5424 * arg2 >> 8) + arg1 >> this.field3281.field5400;
            int var8 = -(this.field3281.field5352 * arg2 >> 8) + arg3 >> this.field3281.field5400;
            this.field3298.method2390(var8, (byte) -90, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(III)Lim;", line = 1547)
    public static final class531 method1574(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4026;
    }

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1554)
    public final void method484(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3301;
        if (arg3 != null && this.field3282 == null) {
            this.field3282 = new int[super.field510][super.field513][];
        }
        if (arg5 != null && this.field3300 == null) {
            this.field3300 = new int[super.field510][super.field513][];
        }
        this.field3305[arg0][arg1] = arg2;
        this.field3306[arg0][arg1] = arg4;
        this.field3297[arg0][arg1] = arg6;
        this.field3294[arg0][arg1] = arg7;
        if (this.field3300 != null) {
            this.field3300[arg0][arg1] = arg5;
        }
        if (this.field3282 != null) {
            this.field3282[arg0][arg1] = arg3;
        }
        class229[] var15 = this.field3295[arg0][arg1] = new class229[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class66 var19;
            for (var19 = this.field3323.method1558(var17, (byte) -93); var19 != null; var19 = this.field3323.method1565((byte) 44)) {
                class229 var20 = (class229) var19;
                if (~arg8[var16] == ~var20.field3674 && (float) arg9[var16] == var20.field3669 && var20.field3658 == arg10 && var20.field3662 == arg11 && var20.field3677 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class229(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3323.method1564(var17, var15[var16], (byte) 84);
            } else {
                var15[var16] = (class229) var19;
            }
        }
        if (arg13) {
            this.field3280[arg0][arg1] = (byte) class81.method769(this.field3280[arg0][arg1], 1);
        }
        if (~this.field3322 > ~arg6.length) {
            this.field3322 = arg6.length;
        }
        this.field3313 += arg6.length;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[[ZZ)V", line = 1620)
    public final void method485(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1570((byte) 56, arg3, arg4, arg0, arg2, -1, arg1);
        ++field3283;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[[ZZI)V", line = 1628)
    public final void method490(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method1570((byte) 56, arg3, arg4, arg0, arg2, arg5, arg1);
        ++field3287;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lcp;[I)V", line = 1643)
    public final void method487(class674 arg0, int[] arg1) {
        ++field3308;
        this.field3276.method3463((byte) -87, new class389(this.field3281, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "(IILha;)Lha;", line = 1652)
    public final class54 method482(int arg0, int arg1, class54 arg2) {
        ++field3302;
        if (~(1 & this.field3280[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field516 >> this.field3281.field5400;
            class164 var5 = (class164) arg2;
            class164 var6;
            if (var5 != null && var5.method1329((byte) -123, var4, var4)) {
                var6 = var5;
                var5.method1331((byte) -125);
            } else {
                var6 = new class164(this.field3281, var4, var4);
            }
            var6.method1333(var4, 0, var4, -1204258192, 0);
            this.method1572(arg0, var6, -15654, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 1682)
    public final boolean method481(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3304;
        if (this.field3298 != null && arg0 != null) {
            int var7 = arg1 - (this.field3281.field5424 * arg2 >> 8) >> this.field3281.field5400;
            int var8 = -(this.field3281.field5352 * arg2 >> 8) + arg3 >> this.field3281.field5400;
            return this.field3298.method2388((byte) 38, var8, arg0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 1702)
    public static void method1575(int arg0) {
        field3310 = null;
        field3311 = null;
        if (arg0 == -16958) {
            field3293 = null;
        }
    }
}
