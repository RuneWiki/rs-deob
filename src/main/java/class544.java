import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class544 extends class751 {

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "F")
    private float field7959 = -3.4028235E38F;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "F")
    private float field7970 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "Ltf;")
    private class524 field7954 = new class524();

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "Ljj;")
    public class334 field7976;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    private int field7955;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    private int field7948;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "[[[I")
    public int[][][] field7964;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "[[[I")
    private int[][][] field7980;

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "[[B")
    private byte[][] field7963;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "[[[Lnfa;")
    private class538[][][] field7962;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "[[F")
    private float[][] field7991;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "[[[I")
    private int[][][] field7971;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "[[B")
    private byte[][] field7990;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "[[S")
    public short[][] field7966;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "[[[I")
    public int[][][] field7974;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "[[[I")
    public int[][][] field7969;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public int field7977;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "[[F")
    private float[][] field7983;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[[F")
    private float[][] field7989;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Ldfa;")
    private class477 field7992;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "Lbd;")
    private class591 field7973;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "[Ljava/lang/String;")
    private static final String[] field7993 = new String[] { method4106(method4105("k=foE&")), method4106(method4105("` $Z")), method4106(method4105("u{f\u0018y")), method4106(method4105("k=fuE&")), method4106(method4105("k=fr,")), method4106(method4105("k=fy,")), method4106(method4105("k=fc,")), method4106(method4105("k=f]e&")), method4106(method4105("G;>Whg1hDej<0\f")), method4106(method4105("k=ft,")), method4106(method4105("k=fPe&")), method4106(method4105("k=fx,")), method4106(method4105("k=fAe&")), method4106(method4105("k=fp,")), method4106(method4105("k=f\nm`<<\b,")), method4106(method4105("k=f\u007f,")), method4106(method4105("k=f|,")), method4106(method4105("k=f{,")), method4106(method4105("k=fu,")), method4106(method4105("k=fw,")), method4106(method4105("k=fs,")) };

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field7953 = 0;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "Lfs;")
    public static class796 field7978 = null;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    private int field7951;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    private int field7958;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    private int field7982;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    private int field7987;

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "Lot;")
    public class218 field7986;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "Lbl;")
    private class719 field7985;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "Lbl;")
    private class719 field7988;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "[Lnfa;")
    private class538[] field7984;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "[[[I")
    private int[][][] field7946;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lta;[I)V", line = 4)
    public final void method2481(class330 arg0, int[] arg1) {
        try {
            ++field7968;
            this.field7954.method3984(new class255(this.field7976, this, arg0, arg1), 0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7993[20] + (arg0 != null ? field7993[2] : field7993[1]) + ',' + (arg1 != null ? field7993[2] : field7993[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILug;I)V", line = 13)
    private final void method4101(int arg0, int arg1, class432 arg2, int arg3) {
        try {
            ++field7979;
            int[] var5 = this.field7964[arg3][arg1];
            if (arg0 >= 8) {
                int[] var6 = this.field7974[arg3][arg1];
                int var7 = var5.length;
                if (~class794.field11545.length > ~var7) {
                    class794.field11545 = new int[var7];
                    class611.field8749 = new int[var7];
                }
                for (int var8 = 0; var7 > var8; ++var8) {
                    class794.field11545[var8] = var5[var8] >> this.field7976.field4773;
                    class611.field8749[var8] = var6[var8] >> this.field7976.field4773;
                }
                int var9 = 0;
                while (~var9 > ~var7) {
                    int var10 = class794.field11545[var9];
                    int var11 = class611.field8749[var9++];
                    int var12 = class794.field11545[var9];
                    int var13 = class611.field8749[var9++];
                    int var14 = class794.field11545[var9];
                    int var15 = class611.field8749[var9++];
                    if ((var10 - var12) * (var13 - var15) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                        arg2.method3367(var11, var14, var10, (byte) -15, var13, var12, var15);
                    }
                }
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field7993[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7993[2] : field7993[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 73)
    public final void method2474(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        try {
            ++field7957;
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
                var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            throw class665.method4799(var33, field7993[16] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7993[2] : field7993[1]) + ',' + (arg3 != null ? field7993[2] : field7993[1]) + ',' + (arg4 != null ? field7993[2] : field7993[1]) + ',' + (arg5 != null ? field7993[2] : field7993[1]) + ',' + (arg6 != null ? field7993[2] : field7993[1]) + ',' + (arg7 != null ? field7993[2] : field7993[1]) + ',' + (arg8 != null ? field7993[2] : field7993[1]) + ',' + (arg9 != null ? field7993[2] : field7993[1]) + ',' + (arg10 != null ? field7993[2] : field7993[1]) + ',' + (arg11 != null ? field7993[2] : field7993[1]) + ',' + (arg12 != null ? field7993[2] : field7993[1]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII[[Z)V", line = 157)
    public final void method2477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        try {
            ++field7960;
            if (~this.field7982 < -1) {
                class517 var9 = this.field7976.method2689(this.field7951, false);
                int var10 = 0;
                int var11 = 32767;
                int var12 = -32768;
                for (int var13 = 0; ~var13 > -5; ++var13) {
                    var10 = 0;
                    Buffer var14 = var9.method2343((byte) 54, true);
                    if (var14 != null) {
                        Stream var15 = this.field7976.method2651(var14, 16);
                        if (!Stream.method3200()) {
                            for (int var16 = arg4; arg6 > var16; ++var16) {
                                int var17 = super.field10701 * var16 + arg3;
                                for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                    if (arg7[var18 - arg3][-arg4 + var16]) {
                                        short[] var19 = this.field7966[var17];
                                        if (var19 != null) {
                                            for (int var20 = 0; var20 < var19.length; ++var20) {
                                                int var21 = var19[var20] & 65535;
                                                if (var21 < var11) {
                                                    var11 = var21;
                                                }
                                                ++var10;
                                                var15.method3198(var21);
                                                if (var12 < var21) {
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
                                int var23 = super.field10701 * var22 - -arg3;
                                for (int var24 = arg3; ~var24 > ~arg5; ++var24) {
                                    if (arg7[-arg3 + var24][-arg4 + var22]) {
                                        short[] var25 = this.field7966[var23];
                                        if (var25 != null) {
                                            for (int var26 = 0; var26 < var25.length; ++var26) {
                                                int var27 = var25[var26] & 65535;
                                                var15.method3195(var27);
                                                if (var27 < var11) {
                                                    var11 = var27;
                                                }
                                                ++var10;
                                                if (~var27 < ~var12) {
                                                    var12 = var27;
                                                }
                                            }
                                        }
                                    }
                                    ++var23;
                                }
                            }
                        }
                        var15.method3199();
                        if (var9.method2339(true)) {
                            break;
                        }
                    }
                }
                if (var10 > 0) {
                    this.field7976.method2687(-104);
                    this.field7976.method2685(false, -32);
                    this.field7976.method2647(false, 0);
                    this.field7976.method2669(false, -18819);
                    this.field7976.method2628(1, false);
                    this.field7976.method2619(0, 1);
                    this.field7976.method2664(false, false, 16, -2);
                    this.field7976.method2668(24, (class764) null);
                    class639 var28 = this.field7976.method2618(-121);
                    float[] var29 = this.field7976.method2683((byte) -117);
                    var29[0] = (float) arg2 / ((float) super.field10690 * 128.0F * (float) this.field7976.field4653);
                    var29[14] = -this.field7970 / (this.field7959 - this.field7970);
                    var29[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7976.field4653;
                    var29[6] = 0.0F;
                    var29[3] = 0.0F;
                    var29[5] = (float) arg2 / ((float) super.field10690 * 128.0F * (float) this.field7976.field4646);
                    var29[11] = 0.0F;
                    var29[7] = 0.0F;
                    var29[4] = 0.0F;
                    var29[9] = 0.0F;
                    var29[1] = 0.0F;
                    var29[15] = 1.0F;
                    var29[2] = 0.0F;
                    var29[10] = 1.0F / (-this.field7970 + this.field7959);
                    var29[8] = 0.0F;
                    var29[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7976.field4646;
                    var28.method4670(0.0F, 1.0F, 0.0F, -107, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
                    this.field7976.method2614((byte) 118);
                    this.field7976.method2671((byte) -116);
                    if ((7 & this.field7977) != 0) {
                        this.field7976.method2647(true, 0);
                        this.field7976.method2114(-5072);
                    } else {
                        this.field7976.method2647(false, 0);
                    }
                    this.field7976.method2101((byte) 46, false);
                    this.field7976.method2088(this.field7988, 0, false);
                    this.field7976.method2088(this.field7985, 1, false);
                    this.field7976.method2120(this.field7986, -1);
                    this.field7976.method2074(class12.field163, var11, var12 - var11 + 1, var9, 0, var10 / 3, 21);
                    this.field7976.method2101((byte) 46, true);
                }
            }
        } catch (RuntimeException var31) {
            throw class665.method4799(var31, field7993[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7993[2] : field7993[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "ka", descriptor = "(III)V", line = 353)
    public final void method2478(int arg0, int arg1, int arg2) {
        try {
            if (~(this.field7990[arg0][arg1] & 255) > ~arg2) {
                this.field7990[arg0][arg1] = (byte) arg2;
            }
            ++field7961;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7993[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BII[[ZIZII)V", line = 370)
    private final void method4102(byte arg0, int arg1, int arg2, boolean[][] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            if (arg0 <= 68) {
                this.method4102((byte) 87, -52, -5, (boolean[][]) null, -72, false, 35, -41);
            }
            if (this.field7984 != null) {
                int var9 = arg6 + 1 + arg6;
                int var10 = var9 * var9;
                if (class298.field4162.length < var10) {
                    class298.field4162 = new int[var10];
                }
                int var11 = arg7 - arg6;
                int var12 = var11;
                if (var11 < 0) {
                    var11 = 0;
                }
                int var13 = -arg6 + arg2;
                int var14 = var13;
                if (var13 < 0) {
                    var13 = 0;
                }
                int var15 = arg6 + arg7;
                if (~(super.field10701 + -1) > ~var15) {
                    var15 = super.field10701 - 1;
                }
                int var16 = arg2 + arg6;
                if (super.field10703 + -1 < var16) {
                    var16 = super.field10703 + -1;
                }
                class254.field3634 = 0;
                for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                    boolean[] var18 = arg3[-var12 + var17];
                    for (int var19 = var13; ~var16 <= ~var19; ++var19) {
                        if (var18[var19 - var14]) {
                            class298.field4162[class254.field3634++] = super.field10701 * var19 - -var17;
                        }
                    }
                }
                if (~arg1 != 0) {
                    this.field7976.method2626(true, (float) arg1);
                    this.field7976.method2634(0);
                } else {
                    this.field7976.method2652(1);
                }
                this.field7976.method2644((byte) 64);
                this.field7976.method2647((7 & this.field7977) != 0, 0);
                this.field7976.method2664(false, false, 16, -1);
                this.field7976.method2088(this.field7988, 0, false);
                for (int var20 = 0; ~this.field7984.length < ~var20; ++var20) {
                    this.field7984[var20].method4076(class298.field4162, class254.field3634, 12502);
                }
                class639 var21 = this.field7976.method2618(-112);
                var21.method739(0, -1, 0);
                this.field7976.method2671((byte) -116);
                if (!this.field7954.method3974(-22016)) {
                    int var22 = this.field7976.field4768;
                    int var23 = this.field7976.field4732;
                    this.field7976.method232(0, var23, this.field7976.field4779);
                    this.field7976.method2647(false, 0);
                    this.field7976.method2628(1, false);
                    this.field7976.method2619(128, 1);
                    this.field7976.method2664(false, false, 16, -2);
                    this.field7976.method2668(24, this.field7976.field4751);
                    this.field7976.method2624(class539.field7920, (byte) 107, class256.field3668);
                    this.field7976.method2655(1, 0, class659.field9335);
                    this.field7976.method2670(-128, 0, class801.field11657);
                    for (class578 var24 = this.field7954.method3977((byte) -71); var24 != null; var24 = this.field7954.method3987(0)) {
                        class255 var25 = (class255) var24;
                        var25.method2137(arg2, -108, arg7, arg6, arg3);
                    }
                    this.field7976.method2655(1, 0, class784.field11325);
                    this.field7976.method2670(-128, 0, class784.field11325);
                    this.field7976.method2668(24, (class764) null);
                    this.field7976.method232(var22, var23, this.field7976.field4779);
                }
                if (this.field7973 != null) {
                    this.field7976.method2088(this.field7988, 0, false);
                    this.field7976.method2088(this.field7985, 1, false);
                    this.field7976.method2120(this.field7986, -1);
                    this.field7973.method4362(arg3, arg6, arg7, arg2, arg5, -73);
                }
            }
            ++field7952;
        } catch (RuntimeException var27) {
            throw class665.method4799(var27, field7993[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7993[2] : field7993[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljj;IIII[[I[[II)V", line = 1213)
    public class544(class334 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        try {
            this.field7976 = arg0;
            this.field7955 = super.field10692 + -2;
            this.field7948 = 1 << this.field7955;
            this.field7964 = new int[arg3][arg4][];
            this.field7980 = new int[arg3][arg4][];
            this.field7963 = new byte[arg3][arg4];
            this.field7962 = new class538[arg3][arg4][];
            this.field7991 = new float[super.field10701 + 1][super.field10703 - -1];
            this.field7971 = new int[arg3][arg4][];
            this.field7990 = new byte[arg3 + 1][arg4 + 1];
            this.field7966 = new short[arg3 * arg4][];
            this.field7974 = new int[arg3][arg4][];
            this.field7969 = new int[arg3][arg4][];
            this.field7977 = arg2;
            this.field7983 = new float[super.field10701 - -1][super.field10703 - -1];
            this.field7989 = new float[super.field10701 - -1][super.field10703 + 1];
            for (int var9 = 0; ~super.field10703 <= ~var9; ++var9) {
                for (int var10 = 0; ~super.field10701 <= ~var10; ++var10) {
                    int var11 = super.field10693[var10][var9];
                    if ((float) var11 > this.field7959) {
                        this.field7959 = (float) var11;
                    }
                    if (this.field7970 > (float) var11) {
                        this.field7970 = (float) var11;
                    }
                    if (var10 > 0 && var9 > 0 && ~var10 > ~super.field10701 && ~var9 > ~super.field10703) {
                        int var12 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                        int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                        float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var12 * var12 + var13 * var13)));
                        this.field7989[var10][var9] = (float) var12 * var14;
                        this.field7983[var10][var9] = (float) (-arg7 * 2) * var14;
                        this.field7991[var10][var9] = (float) var13 * var14;
                    }
                }
            }
            --this.field7970;
            ++this.field7959;
            this.field7992 = new class477(128);
            if (~(this.field7977 & 16) != -1) {
                this.field7973 = new class591(this.field7976, this);
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field7993[14] + (arg0 != null ? field7993[2] : field7993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7993[2] : field7993[1]) + ',' + (arg6 != null ? field7993[2] : field7993[1]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "fa", descriptor = "(IILr;)Lr;", line = 517)
    public final class412 method2475(int arg0, int arg1, class412 arg2) {
        try {
            ++field7965;
            if ((this.field7963[arg0][arg1] & 1) == 0) {
                return null;
            } else {
                int var4 = super.field10690 >> this.field7976.field4773;
                class432 var5 = (class432) arg2;
                class432 var6;
                if (var5 != null && var5.method3365(var4, -100, var4)) {
                    var6 = var5;
                    var5.method3366(115);
                } else {
                    var6 = new class432(this.field7976, var4, var4);
                }
                var6.method3363(var4, 0, 0, 0, var4);
                this.method4101(79, arg1, var6, arg0);
                return var6;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7993[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7993[2] : field7993[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 556)
    public final void method2479(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field7975;
            if (this.field7973 != null && arg0 != null) {
                int var7 = -(this.field7976.field4742 * arg2 >> 8) + arg1 >> this.field7976.field4773;
                int var8 = -(this.field7976.field4752 * arg2 >> 8) + arg3 >> this.field7976.field4773;
                this.field7973.method4364(var8, arg0, var7, false);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field7993[3] + (arg0 != null ? field7993[2] : field7993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 571)
    public final void method2472(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field7981;
            if (this.field7973 != null && arg0 != null) {
                int var7 = -(this.field7976.field4742 * arg2 >> 8) + arg1 >> this.field7976.field4773;
                int var8 = -(this.field7976.field4752 * arg2 >> 8) + arg3 >> this.field7976.field4773;
                this.field7973.method4361(arg0, var7, var8, -1436);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field7993[12] + (arg0 != null ? field7993[2] : field7993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[[ZZI)V", line = 588)
    public final void method2476(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        try {
            ++field7945;
            this.method4102((byte) 123, -1, arg1, arg3, arg5, arg4, arg2, arg0);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7993[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7993[2] : field7993[1]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "YA", descriptor = "()V", line = 596)
    public final void method2469() {
        try {
            if (this.field7982 > 0) {
                byte[][] var1 = new byte[super.field10701 - -1][super.field10703 + 1];
                for (int var2 = 1; ~super.field10701 < ~var2; ++var2) {
                    for (int var3 = 1; super.field10703 > var3; ++var3) {
                        var1[var2][var3] = (byte) ((this.field7990[var2][var3 + -1] >> 2) + (this.field7990[var2 + -1][var3] >> 2) + (this.field7990[var2 + 1][var3] >> 3) + (this.field7990[var2][var3 + 1] >> 3) + (this.field7990[var2][var3] >> 1));
                    }
                }
                class538[] var4 = new class538[this.field7992.method3692(21538)];
                this.field7992.method3694((byte) -118, var4);
                for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                    var4[var5].method4079(this.field7982, (byte) -102);
                }
                int var6 = 20;
                if (this.field7946 != null) {
                    var6 += 4;
                }
                if (~(7 & this.field7977) != -1) {
                    var6 += 12;
                }
                NativeHeapBuffer var7 = this.field7976.field4536.method3189(this.field7982 * 4, false);
                NativeHeapBuffer var8 = this.field7976.field4536.method3189(this.field7982 * var6, false);
                Stream var9 = new Stream(var8);
                Stream var10 = new Stream(var7);
                class538[] var11 = new class538[this.field7982];
                int var12 = class482.method3720((byte) 118, this.field7982 / 4);
                if (~var12 > -2) {
                    var12 = 1;
                }
                class477 var13 = new class477(var12);
                class538[] var14 = new class538[this.field7987];
                for (int var15 = 0; ~super.field10701 < ~var15; ++var15) {
                    for (int var16 = 0; ~super.field10703 < ~var16; ++var16) {
                        if (this.field7969[var15][var16] != null) {
                            class538[] var17 = this.field7962[var15][var16];
                            int[] var18 = this.field7964[var15][var16];
                            int[] var19 = this.field7974[var15][var16];
                            int[] var20 = this.field7980[var15][var16];
                            int[] var21 = this.field7969[var15][var16];
                            int[] var22 = this.field7971 != null ? this.field7971[var15][var16] : null;
                            int[] var23 = this.field7946 != null ? this.field7946[var15][var16] : null;
                            if (var20 == null) {
                                var20 = var21;
                            }
                            float var24 = this.field7989[var15][var16];
                            float var25 = this.field7983[var15][var16];
                            float var26 = this.field7991[var15][var16];
                            float var27 = this.field7989[var15][var16 + 1];
                            float var28 = this.field7983[var15][var16 + 1];
                            float var29 = this.field7991[var15][var16 - -1];
                            float var30 = this.field7989[var15 + 1][var16 + 1];
                            float var31 = this.field7983[var15 + 1][var16 + 1];
                            float var32 = this.field7991[var15 - -1][var16 + 1];
                            float var33 = this.field7989[var15 + 1][var16];
                            float var34 = this.field7983[var15 + 1][var16];
                            float var35 = this.field7991[var15 + 1][var16];
                            int var36 = 255 & var1[var15][var16];
                            int var37 = var1[var15][var16 + 1] & 255;
                            int var38 = 255 & var1[var15 + 1][var16 + 1];
                            int var39 = 255 & var1[var15 + 1][var16];
                            int var40 = 0;
                            label407: for (int var41 = 0; ~var21.length < ~var41; ++var41) {
                                class538 var42 = var17[var41];
                                for (int var43 = 0; var43 < var40; ++var43) {
                                    if (var14[var43] == var42) {
                                        continue label407;
                                    }
                                }
                                var14[var40++] = var42;
                            }
                            short[] var44 = this.field7966[super.field10701 * var16 + var15] = new short[var21.length];
                            for (int var45 = 0; ~var21.length < ~var45; ++var45) {
                                int var46 = (var15 << super.field10692) - -var18[var45];
                                int var47 = (var16 << super.field10692) - -var19[var45];
                                int var48 = var46 >> this.field7955;
                                int var49 = var47 >> this.field7955;
                                int var50 = var21[var45];
                                int var51 = var20[var45];
                                int var52 = var22 != null ? var22[var45] : 0;
                                long var53 = (long) var49 | (long) var50 << 32 | (long) var51 << 48 | (long) (var48 << 16);
                                int var55 = var18[var45];
                                int var56 = var19[var45];
                                byte var57 = 74;
                                int var58 = 0;
                                float var59;
                                int var60;
                                float var61;
                                float var62;
                                if (~var55 == -1 && var56 == 0) {
                                    var59 = var25;
                                    var60 = var57 - var36;
                                    var61 = var24;
                                    var62 = var26;
                                } else if (var55 == 0 && ~super.field10690 == ~var56) {
                                    var60 = var57 - var37;
                                    var61 = var27;
                                    var59 = var28;
                                    var62 = var29;
                                } else if (~super.field10690 == ~var55 && ~super.field10690 == ~var56) {
                                    var61 = var30;
                                    var60 = var57 - var38;
                                    var62 = var32;
                                    var59 = var31;
                                } else if (~super.field10690 == ~var55 && ~var56 == -1) {
                                    var62 = var35;
                                    var59 = var34;
                                    var60 = var57 - var39;
                                    var61 = var33;
                                } else {
                                    float var63 = (float) var55 / (float) super.field10690;
                                    float var64 = (float) var56 / (float) super.field10690;
                                    float var65 = (-var24 + var33) * var63 + var24;
                                    float var66 = (var34 - var25) * var63 + var25;
                                    float var67 = (-var26 + var35) * var63 + var26;
                                    float var68 = (-var27 + var30) * var63 + var27;
                                    float var69 = (var31 - var28) * var63 + var28;
                                    var61 = (var68 - var65) * var64 + var65;
                                    float var70 = (-var29 + var32) * var63 + var29;
                                    var59 = (var69 - var66) * var64 + var66;
                                    var62 = (-var67 + var70) * var64 + var67;
                                    int var71 = var36 - -((var39 - var36) * var55 >> super.field10692);
                                    int var72 = var37 - -((-var37 + var38) * var55 >> super.field10692);
                                    var60 = var57 - (var71 - -((-var71 + var72) * var56 >> super.field10692));
                                }
                                float var73 = 1.0F;
                                if (var50 != -1) {
                                    int var74 = (var50 & 127) * var60 >> 7;
                                    if (~var74 <= -3) {
                                        if (var74 > 126) {
                                            var74 = 126;
                                        }
                                    } else {
                                        var74 = 2;
                                    }
                                    var58 = class360.field5233[65408 & var50 | var74];
                                    if ((7 & this.field7977) == 0) {
                                        float var75 = this.field7976.field4746[2] * var62 + this.field7976.field4746[0] * var61 + this.field7976.field4746[1] * var59;
                                        var73 = this.field7976.field4801 + (!(var75 > 0.0F) ? this.field7976.field4736 : this.field7976.field4757) * var75;
                                    }
                                }
                                class578 var76 = null;
                                if (~(this.field7948 - 1 & var46) == -1 && ~(var47 & this.field7948 + -1) == -1) {
                                    var76 = var13.method3693(false, var53);
                                }
                                int var77;
                                if (var76 != null) {
                                    var44[var45] = ((class292) var76).field4113;
                                    var77 = 65535 & var44[var45];
                                    if (var50 != -1 && var11[var77].field8378 > var17[var45].field8378) {
                                        var11[var77] = var17[var45];
                                    }
                                } else {
                                    int var79;
                                    if (var50 != var51) {
                                        int var78 = (var51 & 127) * var60 >> 7;
                                        if (~var78 <= -3) {
                                            if (~var78 < -127) {
                                                var78 = 126;
                                            }
                                        } else {
                                            var78 = 2;
                                        }
                                        var79 = class360.field5233[var78 | var51 & 65408];
                                        if (~(this.field7977 & 7) == -1) {
                                            float var80 = this.field7976.field4746[2] * var62 + this.field7976.field4746[1] * var59 + this.field7976.field4746[0] * var61;
                                            float var81 = var73 * (!(var73 > 0.0F) ? this.field7976.field4736 : this.field7976.field4757) + this.field7976.field4801;
                                            int var82 = (var79 & 16763694) >> 16;
                                            int var83 = (var79 & 65443) >> 8;
                                            int var84 = 255 & var79;
                                            int var85 = (int) ((float) var82 * var81);
                                            if (var85 < 0) {
                                                var85 = 0;
                                            } else if (~var85 < -256) {
                                                var85 = 255;
                                            }
                                            int var86 = (int) ((float) var83 * var81);
                                            if (var86 < 0) {
                                                var86 = 0;
                                            } else if (var86 > 255) {
                                                var86 = 255;
                                            }
                                            int var87 = (int) ((float) var84 * var81);
                                            if (~var87 > -1) {
                                                var87 = 0;
                                            } else if (var87 > 255) {
                                                var87 = 255;
                                            }
                                            var79 = var86 << 8 | var85 << 16 | var87;
                                        }
                                    } else {
                                        var79 = var58;
                                    }
                                    if (!Stream.method3200()) {
                                        var9.method3206((float) var46);
                                        var9.method3206((float) (var52 + this.method5440((byte) 15, var46, var47)));
                                        var9.method3206((float) var47);
                                        var9.method3206((float) var46);
                                        var9.method3206((float) var47);
                                        if (this.field7946 != null) {
                                            var9.method3206((float) (var23 == null ? 0 : var23[var45] + -1));
                                        }
                                        if (~(this.field7977 & 7) != -1) {
                                            var9.method3206(var61);
                                            var9.method3206(var59);
                                            var9.method3206(var62);
                                        }
                                    } else {
                                        var9.method3202((float) var46);
                                        var9.method3202((float) (var52 + this.method5440((byte) 15, var46, var47)));
                                        var9.method3202((float) var47);
                                        var9.method3202((float) var46);
                                        var9.method3202((float) var47);
                                        if (this.field7946 != null) {
                                            var9.method3202((float) (var23 == null ? 0 : var23[var45] + -1));
                                        }
                                        if ((7 & this.field7977) != 0) {
                                            var9.method3202(var61);
                                            var9.method3202(var59);
                                            var9.method3202(var62);
                                        }
                                    }
                                    if (this.field7976.field4775 != 0) {
                                        var10.method3194(-16777216 | var79);
                                    } else {
                                        var10.method3205(var79 | -16777216);
                                    }
                                    var77 = this.field7958++;
                                    var44[var45] = (short) var77;
                                    if (var50 != -1) {
                                        var11[var77] = var17[var45];
                                    }
                                    var13.method3691(new class292(var44[var45]), var53, -1);
                                }
                                for (int var88 = 0; var40 > var88; ++var88) {
                                    var14[var88].method4080(var60, var58, var77, (byte) -118, var73);
                                }
                                ++this.field7951;
                            }
                        }
                    }
                }
                for (int var89 = 0; this.field7958 > var89; ++var89) {
                    class538 var90 = var11[var89];
                    if (var90 != null) {
                        var90.method4077(19239, var89);
                    }
                }
                for (int var91 = 0; super.field10701 > var91; ++var91) {
                    for (int var92 = 0; ~var92 > ~super.field10703; ++var92) {
                        short[] var93 = this.field7966[super.field10701 * var92 - -var91];
                        if (var93 != null) {
                            int var94 = 0;
                            int var95 = 0;
                            while (var95 < var93.length) {
                                int var96 = 65535 & var93[var95++];
                                int var97 = 65535 & var93[var95++];
                                int var98 = 65535 & var93[var95++];
                                class538 var99 = var11[var96];
                                class538 var100 = var11[var97];
                                class538 var101 = var11[var98];
                                class538 var102 = null;
                                if (var99 != null) {
                                    var102 = var99;
                                    var99.method4078(var94, var91, var92, (byte) 53);
                                }
                                if (var100 != null) {
                                    var100.method4078(var94, var91, var92, (byte) 53);
                                    if (var102 == null || var102.field8378 > var100.field8378) {
                                        var102 = var100;
                                    }
                                }
                                if (var101 != null) {
                                    var101.method4078(var94, var91, var92, (byte) 53);
                                    if (var102 == null || ~var102.field8378 < ~var101.field8378) {
                                        var102 = var101;
                                    }
                                }
                                if (var102 != null) {
                                    if (var99 != null) {
                                        var102.method4077(19239, var96);
                                    }
                                    if (var100 != null) {
                                        var102.method4077(19239, var97);
                                    }
                                    if (var101 != null) {
                                        var102.method4077(19239, var98);
                                    }
                                    var102.method4078(var94, var91, var92, (byte) 53);
                                }
                                ++var94;
                            }
                        }
                    }
                }
                var9.method3199();
                var10.method3199();
                this.field7985 = this.field7976.method2117(false, 16);
                this.field7985.method2404((byte) 32, var7, 4, this.field7958 * 4);
                this.field7988 = this.field7976.method2117(false, 16);
                this.field7988.method2404((byte) 32, var8, var6, this.field7958 * var6);
                if (~(this.field7977 & 7) == -1) {
                    if (this.field7946 != null) {
                        this.field7986 = this.field7976.method2080(125, new class121[] { new class121(new class212[] { class212.field3105, class212.field3113, class212.field3112 }), new class121(class212.field3111) });
                    } else {
                        this.field7986 = this.field7976.method2080(119, new class121[] { new class121(new class212[] { class212.field3105, class212.field3113 }), new class121(class212.field3111) });
                    }
                } else if (this.field7946 == null) {
                    this.field7986 = this.field7976.method2080(60, new class121[] { new class121(new class212[] { class212.field3105, class212.field3113, class212.field3110 }), new class121(class212.field3111) });
                } else {
                    this.field7986 = this.field7976.method2080(88, new class121[] { new class121(new class212[] { class212.field3105, class212.field3113, class212.field3112, class212.field3110 }), new class121(class212.field3111) });
                }
                int var103 = 0;
                for (int var104 = 0; var4.length > var104; ++var104) {
                    if (~var4[var104].field7897 < -1) {
                        var4[var103++] = var4[var104];
                    }
                }
                this.field7984 = new class538[var103];
                long[] var105 = new long[var103];
                for (int var106 = 0; ~var106 > ~var103; ++var106) {
                    class538 var107 = var4[var106];
                    var105[var106] = var107.field8378;
                    this.field7984[var106] = var107;
                    var107.method4075(true, this.field7958);
                }
                class518.method3946((byte) -87, this.field7984, var105);
                if (this.field7973 != null) {
                    this.field7973.method4363(-1);
                }
            } else {
                this.field7973 = null;
            }
            ++field7956;
            this.field7946 = null;
            this.field7992 = null;
            this.field7989 = this.field7983 = this.field7991 = null;
            this.field7964 = this.field7974 = null;
            this.field7980 = null;
            this.field7969 = null;
            this.field7990 = null;
            this.field7971 = null;
            this.field7962 = null;
        } catch (RuntimeException var109) {
            throw class665.method4799(var109, field7993[0] + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 1195)
    public final void method2470(int arg0, int arg1) {
        try {
            ++field7967;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7993[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V", line = 1202)
    public static void method4103(boolean arg0) {
        try {
            field7978 = null;
            if (!arg0) {
                field7953 = 122;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7993[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[[ZZII)V", line = 1287)
    public final void method2471(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        try {
            ++field7947;
            this.method4102((byte) 96, arg5, arg1, arg3, arg6, arg4, arg2, arg0);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field7993[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7993[2] : field7993[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1303)
    public final void method2480(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        try {
            ++field7972;
            if (arg3 != null && this.field7971 == null) {
                this.field7971 = new int[super.field10701][super.field10703][];
            }
            class673 var15 = this.field7976.field237;
            if (arg5 != null && this.field7946 == null) {
                this.field7946 = new int[super.field10701][super.field10703][];
            }
            this.field7964[arg0][arg1] = arg2;
            this.field7974[arg0][arg1] = arg4;
            this.field7969[arg0][arg1] = arg6;
            this.field7980[arg0][arg1] = arg7;
            if (this.field7946 != null) {
                this.field7946[arg0][arg1] = arg5;
            }
            if (this.field7971 != null) {
                this.field7971[arg0][arg1] = arg3;
            }
            class538[] var16 = this.field7962[arg0][arg1] = new class538[arg6.length];
            for (int var17 = 0; arg6.length > var17; ++var17) {
                int var18 = arg8[var17];
                int var19 = arg9[var17];
                if (~(this.field7977 & 32) != -1 && ~var18 != 0 && var15.method4500(-23641, var18).field9583) {
                    var19 = 128;
                    var18 = -1;
                }
                long var20 = (long) var18 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (var19 << 14);
                class578 var22;
                for (var22 = this.field7992.method3693(false, var20); var22 != null; var22 = this.field7992.method3699(-1)) {
                    class538 var23 = (class538) var22;
                    if (~var23.field7899 == ~var18 && (float) var19 == var23.field7906 && var23.field7907 == arg10 && ~var23.field7917 == ~arg11 && var23.field7904 == arg12) {
                        break;
                    }
                }
                if (var22 == null) {
                    var16[var17] = new class538(this, var18, var19, arg10, arg11, arg12);
                    this.field7992.method3691(var16[var17], var20, -1);
                } else {
                    var16[var17] = (class538) var22;
                }
            }
            if (arg13) {
                this.field7963[arg0][arg1] = (byte) class10.method71(this.field7963[arg0][arg1], 1);
            }
            if (~this.field7987 > ~arg6.length) {
                this.field7987 = arg6.length;
            }
            this.field7982 += arg6.length;
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field7993[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7993[2] : field7993[1]) + ',' + (arg3 != null ? field7993[2] : field7993[1]) + ',' + (arg4 != null ? field7993[2] : field7993[1]) + ',' + (arg5 != null ? field7993[2] : field7993[1]) + ',' + (arg6 != null ? field7993[2] : field7993[1]) + ',' + (arg7 != null ? field7993[2] : field7993[1]) + ',' + (arg8 != null ? field7993[2] : field7993[1]) + ',' + (arg9 != null ? field7993[2] : field7993[1]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1382)
    public final boolean method2473(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field7950;
            if (this.field7973 != null && arg0 != null) {
                int var7 = -(this.field7976.field4742 * arg2 >> 8) + arg1 >> this.field7976.field4773;
                int var8 = arg3 - (this.field7976.field4752 * arg2 >> 8) >> this.field7976.field4773;
                return this.field7973.method4366(var7, true, var8, arg0);
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field7993[19] + (arg0 != null ? field7993[2] : field7993[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLjava/lang/String;II)Z", line = 1398)
    public static final boolean method4104(boolean arg0, String arg1, int arg2, int arg3) {
        try {
            ++field7949;
            if (~arg3 <= -3 && ~arg3 >= -37) {
                boolean var4 = false;
                boolean var5 = false;
                int var6 = 0;
                int var7 = arg1.length();
                if (arg2 <= 65) {
                    field7978 = null;
                }
                for (int var8 = 0; ~var8 > ~var7; ++var8) {
                    char var9 = arg1.charAt(var8);
                    if (~var8 == -1) {
                        if (~var9 == -46) {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg0) {
                            continue;
                        }
                    }
                    int var13;
                    if (~var9 <= -49 && var9 <= '9') {
                        var13 = var9 - '0';
                    } else if (var9 >= 'A' && ~var9 >= -91) {
                        var13 = var9 - '7';
                    } else {
                        if (~var9 > -98 || ~var9 < -123) {
                            return false;
                        }
                        var13 = var9 - 'W';
                    }
                    if (var13 >= arg3) {
                        return false;
                    }
                    if (var4) {
                        var13 = -var13;
                    }
                    int var10 = arg3 * var6 - -var13;
                    if (var10 / arg3 != var6) {
                        return false;
                    }
                    var5 = true;
                    var6 = var10;
                }
                return var5;
            } else {
                throw new IllegalArgumentException(field7993[8] + arg3);
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field7993[9] + arg0 + ',' + (arg1 != null ? field7993[2] : field7993[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4105(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4106(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
