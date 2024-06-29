import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class516 extends class543 {

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "Lrk;")
    private class419 field7663 = new class419();

    @OriginalMember(owner = "client!eo", name = "S", descriptor = "[[I")
    private int[][] field7665;

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "Lkw;")
    public class174 field7653;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    private int field7661;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "[[[I")
    public int[][][] field7657;

    @OriginalMember(owner = "client!eo", name = "T", descriptor = "[[[I")
    private int[][][] field7666;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "[[B")
    private byte[][] field7649;

    @OriginalMember(owner = "client!eo", name = "Z", descriptor = "[[F")
    private float[][] field7672;

    @OriginalMember(owner = "client!eo", name = "V", descriptor = "[[[Lgd;")
    private class253[][][] field7668;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "[[[I")
    private int[][][] field7639;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public int field7641;

    @OriginalMember(owner = "client!eo", name = "hb", descriptor = "[[F")
    private float[][] field7680;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "[[S")
    public short[][] field7655;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    private int field7658;

    @OriginalMember(owner = "client!eo", name = "cb", descriptor = "[[B")
    private byte[][] field7675;

    @OriginalMember(owner = "client!eo", name = "gb", descriptor = "[[F")
    private float[][] field7679;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "[[[I")
    private int[][][] field7635;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "[[[I")
    public int[][][] field7640;

    @OriginalMember(owner = "client!eo", name = "ib", descriptor = "Lica;")
    private class205 field7681;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Lpr;")
    private class304 field7638;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "Z")
    public static boolean field7637 = false;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
    public static int field7651 = 0;

    @OriginalMember(owner = "client!eo", name = "U", descriptor = "Lpn;")
    public static class68 field7667 = new class68();

    @OriginalMember(owner = "client!eo", name = "bb", descriptor = "[I")
    public static int[] field7674 = new int[256];

    @OriginalMember(owner = "client!eo", name = "ab", descriptor = "Lqu;")
    public static class364 field7673 = new class364(29, 3);

    @OriginalMember(owner = "client!eo", name = "lb", descriptor = "J")
    public static long field7684 = -1L;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    private int field7642;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    private int field7659;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!eo", name = "W", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!eo", name = "db", descriptor = "I")
    private int field7676;

    @OriginalMember(owner = "client!eo", name = "fb", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!eo", name = "kb", descriptor = "I")
    private int field7683;

    @OriginalMember(owner = "client!eo", name = "X", descriptor = "Lvs;")
    public class567 field7670;

    @OriginalMember(owner = "client!eo", name = "Y", descriptor = "Lvs;")
    private class567 field7671;

    @OriginalMember(owner = "client!eo", name = "eb", descriptor = "Ltq;")
    private class90 field7677;

    @OriginalMember(owner = "client!eo", name = "jb", descriptor = "[Lgd;")
    private class253[] field7682;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "[[[I")
    private int[][][] field7633;

    @OriginalMember(owner = "client!eo", name = "aa", descriptor = "(II)I", line = 3)
    public final int method1323(int arg0, int arg1) {
        ++field7644;
        int var3 = arg0 >> super.field8119;
        int var4 = arg1 >> super.field8119;
        if (~var3 <= -1 && ~var4 <= -1 && ~(super.field8121 + -1) <= ~var3 && ~(super.field8118 + -1) <= ~var4) {
            int var5 = super.field8116 + -1 & arg0;
            int var6 = arg1 & super.field8116 - 1;
            int var7 = (-var5 + super.field8116) * this.field7665[var3][var4] + this.field7665[var3 - -1][var4] * var5 >> super.field8119;
            int var8 = (-var5 + super.field8116) * this.field7665[var3][var4 - -1] + this.field7665[var3 - -1][var4 + 1] * var5 >> super.field8119;
            return (-var6 + super.field8116) * var7 + var6 * var8 >> super.field8119;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "(III)V", line = 26)
    public final void method1317(int arg0, int arg1, int arg2) {
        if ((255 & this.field7675[arg0][arg1]) < arg2) {
            this.field7675[arg0][arg1] = (byte) arg2;
        }
        ++field7634;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V", line = 43)
    public static void method3066(byte arg0) {
        if (arg0 < 119) {
            field7684 = -64L;
        }
        field7673 = null;
        field7674 = null;
        field7667 = null;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lkw;IIII[[I[[II)V", line = 58)
    public class516(class174 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7665 = arg5;
        this.field7653 = arg0;
        this.field7661 = super.field8119 + -2;
        this.field7657 = new int[arg3][arg4][];
        this.field7666 = new int[arg3][arg4][];
        this.field7649 = new byte[arg3][arg4];
        this.field7672 = new float[super.field8121 + 1][super.field8118 - -1];
        this.field7668 = new class253[arg3][arg4][];
        this.field7639 = new int[arg3][arg4][];
        this.field7641 = arg2;
        this.field7680 = new float[super.field8121 - -1][super.field8118 - -1];
        this.field7655 = new short[arg3 * arg4][];
        this.field7658 = 1 << this.field7661;
        this.field7675 = new byte[arg3 + 1][arg4 + 1];
        this.field7679 = new float[super.field8121 - -1][super.field8118 + 1];
        this.field7635 = new int[arg3][arg4][];
        this.field7640 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field8118; ++var9) {
            for (int var10 = 1; super.field8121 > var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 - -1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var12 * var12 - -(arg7 * arg7 * 4))));
                this.field7679[var10][var9] = (float) var11 * var13;
                this.field7680[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field7672[var10][var9] = (float) var12 * var13;
            }
        }
        this.field7681 = new class205(128);
        if ((16 & this.field7641) != 0) {
            this.field7638 = new class304(this.field7653, this);
        }
    }

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "(Lk;IIIIZ)V", line = 117)
    public final void method1314(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7646;
        if (this.field7638 != null && arg0 != null) {
            int var7 = arg1 - (this.field7653.field2624 * arg2 >> 8) >> this.field7653.field2580;
            int var8 = -(this.field7653.field2597 * arg2 >> 8) + arg3 >> this.field7653.field2580;
            this.field7638.method1878(var8, var7, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 134)
    public final void method1326(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7643;
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
        this.method1320(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!eo", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 228)
    public final void method1320(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field7633 == null) {
            this.field7633 = new int[super.field8121][super.field8118][];
        }
        if (arg3 != null && this.field7639 == null) {
            this.field7639 = new int[super.field8121][super.field8118][];
        }
        ++field7648;
        this.field7640[arg0][arg1] = arg2;
        this.field7657[arg0][arg1] = arg4;
        this.field7635[arg0][arg1] = arg6;
        this.field7666[arg0][arg1] = arg7;
        if (this.field7633 != null) {
            this.field7633[arg0][arg1] = arg5;
        }
        if (this.field7639 != null) {
            this.field7639[arg0][arg1] = arg3;
        }
        class253[] var15 = this.field7668[arg0][arg1] = new class253[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
            class496 var19;
            for (var19 = this.field7681.method1333(var17, false); var19 != null; var19 = this.field7681.method1338(-1)) {
                class253 var20 = (class253) var19;
                if (arg8[var16] == var20.field3702 && (float) arg9[var16] == var20.field3694 && var20.field3704 == arg10 && var20.field3696 == arg11 && ~var20.field3698 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class253(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field7681.method1341(var15[var16], (byte) -109, var17);
            } else {
                var15[var16] = (class253) var19;
            }
        }
        if (arg13) {
            this.field7649[arg0][arg1] = (byte) class313.method1926(this.field7649[arg0][arg1], 1);
        }
        if (arg6.length > this.field7683) {
            this.field7683 = arg6.length;
        }
        this.field7676 += arg6.length;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lat;[I)V", line = 294)
    public final void method1328(class535 arg0, int[] arg1) {
        this.field7663.method2492(new class566(this.field7653, this, arg0, arg1), (byte) 71);
        ++field7636;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIBII[[ZZ)V", line = 304)
    private final void method3067(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean[][] arg5, boolean arg6) {
        if (arg2 < -34) {
            if (this.field7682 != null) {
                int var8 = arg0 - -1 + arg0;
                int var9 = var8 * var8;
                if (~var9 < ~class590.field8735.length) {
                    class590.field8735 = new int[var9];
                }
                int var10 = -arg0 + arg4;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = -arg0 + arg3;
                int var13 = var12;
                if (var12 < 0) {
                    var12 = 0;
                }
                int var14 = arg0 + arg4;
                if (~var14 < ~(super.field8121 + -1)) {
                    var14 = super.field8121 - 1;
                }
                int var15 = arg0 + arg3;
                class102.field1302 = 0;
                if (var15 > super.field8118 + -1) {
                    var15 = super.field8118 + -1;
                }
                for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                    boolean[] var23 = arg5[-var11 + var16];
                    for (int var24 = var12; var15 >= var24; ++var24) {
                        if (var23[-var13 + var24]) {
                            class590.field8735[class102.field1302++] = super.field8121 * var24 + var16;
                        }
                    }
                }
                if (arg1 == -1) {
                    this.field7653.method1129(true);
                } else {
                    this.field7653.method1164((float) arg1, 123);
                    this.field7653.method1170(16238);
                }
                this.field7653.method1138((byte) -35);
                this.field7653.method1124((this.field7641 & 7) != 0, (byte) 111);
                this.field7653.method1171(false, 0, -1, false);
                this.field7653.method296(0, this.field7677, 38);
                for (int var17 = 0; this.field7682.length > var17; ++var17) {
                    this.field7682[var17].method1608(class590.field8735, class102.field1302, -128);
                }
                class124 var18 = this.field7653.method1137(0);
                var18.method613(0, -1, 0);
                this.field7653.method1099(0);
                if (!this.field7663.method2488((byte) 108)) {
                    int var19 = this.field7653.field2609;
                    int var20 = this.field7653.field2546;
                    this.field7653.method974(0, var20, this.field7653.field2627);
                    this.field7653.method1124(false, (byte) 112);
                    this.field7653.method1146((byte) -87, false);
                    this.field7653.method1098(128, false);
                    this.field7653.method1171(false, 0, -2, false);
                    this.field7653.method1152(this.field7653.field2566, true);
                    this.field7653.method1102(class609.field8962, class43.field527, 127);
                    this.field7653.method1160(0, (byte) -113, class455.field6635);
                    this.field7653.method1097(-14186, class524.field7760, 0);
                    for (class496 var21 = this.field7663.method2496((byte) -124); var21 != null; var21 = this.field7663.method2494(27)) {
                        class566 var22 = (class566) var21;
                        var22.method3309(arg5, arg3, (byte) 109, arg0, arg4);
                    }
                    this.field7653.method1160(0, (byte) -113, class248.field3625);
                    this.field7653.method1097(-14186, class248.field3625, 0);
                    this.field7653.method1152((class60) null, true);
                    this.field7653.method974(var19, var20, this.field7653.field2627);
                }
                if (this.field7638 != null) {
                    this.field7653.method296(0, this.field7677, 39);
                    this.field7653.method326(43, this.field7671);
                    this.field7638.method1877(arg6, arg4, arg5, arg3, arg0, 0);
                }
            }
            ++field7662;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIII[[Z)V", line = 443)
    public final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7652;
        if (~this.field7676 < -1) {
            class512 var9 = this.field7653.method1120(this.field7642, 27);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method410(true, (byte) -56);
                if (var14 != null) {
                    Stream var15 = this.field7653.method1163(var14, -4455);
                    if (!Stream.method3328()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field8121 * var16 + arg3;
                            for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field7655[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                            var15.method3336(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field8121 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field7655[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            var15.method3337(var29);
                                            ++var10;
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
                    var15.method3332();
                    if (var9.method411(-111)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field7653.method1106(-31);
                this.field7653.method1104((byte) 95, false);
                this.field7653.method1124(false, (byte) 96);
                this.field7653.method1157(false, -4515);
                this.field7653.method1146((byte) -87, false);
                this.field7653.method1098(0, false);
                this.field7653.method1171(false, 0, -2, false);
                this.field7653.method1152((class60) null, true);
                class124 var23 = this.field7653.method1137(0);
                float[] var24 = this.field7653.method1110((byte) -93);
                var24[2] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field8116 * 128.0F * (float) this.field7653.field2395);
                var24[3] = 0.0F;
                var24[1] = 0.0F;
                var24[11] = 0.0F;
                var24[6] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field8116 * 128.0F * (float) this.field7653.field2372);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7653.field2372;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field7653.field2395) + -1.0F;
                var24[4] = 0.0F;
                var24[9] = 0.0F;
                var24[8] = 0.0F;
                var24[7] = 0.0F;
                var24[10] = 0.0F;
                var24[14] = 0.0F;
                var24[15] = 1.0F;
                var23.method748(0.0F, 0.0F, 1.0F, false, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                this.field7653.method1153(-117);
                this.field7653.method1099(0);
                if ((7 & this.field7641) != 0) {
                    this.field7653.method1124(true, (byte) 116);
                    this.field7653.method316(4);
                } else {
                    this.field7653.method1124(false, (byte) 111);
                }
                this.field7653.method344((byte) -5, false);
                this.field7653.method326(43, this.field7671);
                this.field7653.method296(0, this.field7677, 38);
                this.field7653.method292(false, var9, 0, class386.field5653, var10 / 3, var11, -var11 + var12 + 1);
                this.field7653.method344((byte) -5, true);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIIII)Z", line = 640)
    public static final boolean method3068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7647;
        if (arg3 != -32360) {
            method3068(-106, 15, -43, -68, 113, -106, -75, -97, 28);
        }
        if (~arg6 > ~(arg4 + arg8) && ~(arg6 + arg7) < ~arg4) {
            return ~(arg1 + arg5) < ~arg2 && ~arg5 > ~(arg0 + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lk;IIIIZ)Z", line = 658)
    public final boolean method1325(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7650;
        if (this.field7638 != null && arg0 != null) {
            int var7 = -(this.field7653.field2624 * arg2 >> 8) + arg1 >> this.field7653.field2580;
            int var8 = -(this.field7653.field2597 * arg2 >> 8) + arg3 >> this.field7653.field2580;
            return this.field7638.method1876(var7, (byte) -83, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "()V", line = 681)
    public final void method1321() {
        ++field7654;
        if (this.field7676 > 0) {
            byte[][] var1 = new byte[super.field8121 - -1][super.field8118 + 1];
            for (int var2 = 1; ~var2 > ~super.field8121; ++var2) {
                for (int var105 = 1; ~super.field8118 < ~var105; ++var105) {
                    var1[var2][var105] = (byte) ((this.field7675[var2][var105] >> 1) + (this.field7675[var2][var105 - -1] >> 3) + (this.field7675[var2][var105 + -1] >> 2) + (this.field7675[var2 + 1][var105] >> 3) + (this.field7675[var2 + -1][var105] >> 2));
                }
            }
            class253[] var3 = new class253[this.field7681.method1337(0)];
            this.field7681.method1335(var3, 0);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method1604(this.field7676, (byte) -41);
            }
            int var5 = 24;
            if (this.field7633 != null) {
                var5 += 4;
            }
            if (~(7 & this.field7641) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7653.field2391.method3320(this.field7676 * var5, false);
            Stream var7 = new Stream(var6);
            class253[] var8 = new class253[this.field7676];
            int var9 = class239.method1537(-24644, this.field7676 / 4);
            if (var9 < 1) {
                var9 = 1;
            }
            class205 var10 = new class205(var9);
            class253[] var11 = new class253[this.field7683];
            for (int var12 = 0; super.field8121 > var12; ++var12) {
                for (int var32 = 0; var32 < super.field8118; ++var32) {
                    if (this.field7635[var12][var32] != null) {
                        class253[] var33 = this.field7668[var12][var32];
                        int[] var34 = this.field7640[var12][var32];
                        int[] var35 = this.field7657[var12][var32];
                        int[] var36 = this.field7666[var12][var32];
                        int[] var37 = this.field7635[var12][var32];
                        int[] var38 = this.field7639 == null ? null : this.field7639[var12][var32];
                        if (var36 == null) {
                            var36 = var37;
                        }
                        int[] var39 = this.field7633 == null ? null : this.field7633[var12][var32];
                        float var40 = this.field7679[var12][var32];
                        float var41 = this.field7680[var12][var32];
                        float var42 = this.field7672[var12][var32];
                        float var43 = this.field7679[var12][var32 + 1];
                        float var44 = this.field7680[var12][var32 + 1];
                        float var45 = this.field7672[var12][var32 + 1];
                        float var46 = this.field7679[var12 - -1][var32 - -1];
                        float var47 = this.field7680[var12 + 1][var32 + 1];
                        float var48 = this.field7672[var12 - -1][var32 + 1];
                        float var49 = this.field7679[var12 + 1][var32];
                        float var50 = this.field7680[var12 + 1][var32];
                        float var51 = this.field7672[var12 + 1][var32];
                        int var52 = var1[var12][var32] & 255;
                        int var53 = 255 & var1[var12][var32 + 1];
                        int var54 = var1[var12 + 1][var32 - -1] & 255;
                        int var55 = var1[var12 + 1][var32] & 255;
                        int var56 = 0;
                        label359: for (int var57 = 0; var57 < var37.length; ++var57) {
                            class253 var103 = var33[var57];
                            for (int var104 = 0; var56 > var104; ++var104) {
                                if (var11[var104] == var103) {
                                    continue label359;
                                }
                            }
                            var11[var56++] = var103;
                        }
                        short[] var58 = this.field7655[super.field8121 * var32 + var12] = new short[var37.length];
                        for (int var59 = 0; ~var59 > ~var37.length; ++var59) {
                            int var60 = (var12 << super.field8119) + var34[var59];
                            int var61 = (var32 << super.field8119) + var35[var59];
                            int var62 = var60 >> this.field7661;
                            int var63 = var61 >> this.field7661;
                            int var64 = var37[var59];
                            int var65 = var36[var59];
                            int var66 = var38 == null ? 0 : var38[var59];
                            long var67 = (long) var63 | (long) var65 << 48 | (long) var64 << 32 | (long) (var62 << 16);
                            int var69 = var34[var59];
                            int var70 = var35[var59];
                            byte var71 = 74;
                            int var72 = 0;
                            int var73;
                            float var74;
                            float var75;
                            float var76;
                            if (var69 == 0 && ~var70 == -1) {
                                var73 = var71 - var52;
                                var74 = var40;
                                var75 = var41;
                                var76 = var42;
                            } else if (~var69 == -1 && super.field8116 == var70) {
                                var75 = var44;
                                var76 = var45;
                                var74 = var43;
                                var73 = var71 - var53;
                            } else if (~super.field8116 == ~var69 && ~super.field8116 == ~var70) {
                                var73 = var71 - var54;
                                var75 = var47;
                                var74 = var46;
                                var76 = var48;
                            } else if (~super.field8116 == ~var69 && var70 == 0) {
                                var74 = var49;
                                var73 = var71 - var55;
                                var76 = var51;
                                var75 = var50;
                            } else {
                                float var77 = (float) var69 / (float) super.field8116;
                                float var78 = (float) var70 / (float) super.field8116;
                                float var79 = (-var40 + var49) * var77 + var40;
                                float var80 = (-var41 + var50) * var77 + var41;
                                float var81 = (var51 - var42) * var77 + var42;
                                float var82 = (-var43 + var46) * var77 + var43;
                                float var83 = (-var44 + var47) * var77 + var44;
                                var74 = (-var79 + var82) * var78 + var79;
                                float var84 = (var48 - var45) * var77 + var45;
                                var75 = (var83 - var80) * var78 + var80;
                                var76 = (-var81 + var84) * var78 + var81;
                                int var85 = ((-var52 + var55) * var69 >> super.field8119) + var52;
                                int var86 = ((-var53 + var54) * var69 >> super.field8119) + var53;
                                var73 = var71 - (((-var85 + var86) * var70 >> super.field8119) + var85);
                            }
                            float var87 = 1.0F;
                            if (var64 != -1) {
                                int var88 = (127 & var64) * var73 >> 7;
                                if (~var88 <= -3) {
                                    if (~var88 < -127) {
                                        var88 = 126;
                                    }
                                } else {
                                    var88 = 2;
                                }
                                var72 = class620.field9045[var88 | var64 & 65408];
                                if ((7 & this.field7641) == 0) {
                                    float var89 = this.field7653.field2603[2] * var76 + this.field7653.field2603[1] * var75 + this.field7653.field2603[0] * var74;
                                    var87 = var89 * (!(var89 > 0.0F) ? this.field7653.field2568 : this.field7653.field2616) + this.field7653.field2555;
                                }
                            }
                            class496 var90 = null;
                            if ((this.field7658 + -1 & var60) == 0 && ~(var61 & this.field7658 + -1) == -1) {
                                var90 = var10.method1333(var67, false);
                            }
                            int var101;
                            if (var90 == null) {
                                int var92;
                                if (var64 != var65) {
                                    int var91 = (var65 & 127) * var73 >> 7;
                                    if (var91 >= 2) {
                                        if (var91 > 126) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var92 = class620.field9045[var65 & 65408 | var91];
                                    if (~(this.field7641 & 7) == -1) {
                                        float var93 = this.field7653.field2603[2] * var76 + this.field7653.field2603[0] * var74 + this.field7653.field2603[1] * var75;
                                        float var94 = var87 * (!(var87 > 0.0F) ? this.field7653.field2568 : this.field7653.field2616) + this.field7653.field2555;
                                        int var95 = var92 >> 16 & 255;
                                        int var96 = (65309 & var92) >> 8;
                                        int var97 = var92 & 255;
                                        int var98 = (int) ((float) var95 * var94);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        int var99 = (int) ((float) var96 * var94);
                                        if (var99 >= 0) {
                                            if (var99 > 255) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        int var100 = (int) ((float) var97 * var94);
                                        if (~var100 <= -1) {
                                            if (var100 > 255) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        var92 = var99 << 8 | var98 << 16 | var100;
                                    }
                                } else {
                                    var92 = var72;
                                }
                                if (!Stream.method3328()) {
                                    var7.method3333((float) var60);
                                    var7.method3333((float) (this.method1323(var60, var61) + var66));
                                    var7.method3333((float) var61);
                                    var7.method3333((float) var60);
                                    var7.method3333((float) var61);
                                    if (this.field7633 != null) {
                                        var7.method3333((float) (var39 != null ? var39[var59] + -1 : 0));
                                    }
                                    if ((7 & this.field7641) != 0) {
                                        var7.method3333(var74);
                                        var7.method3333(var75);
                                        var7.method3333(var76);
                                    }
                                } else {
                                    var7.method3326((float) var60);
                                    var7.method3326((float) (this.method1323(var60, var61) + var66));
                                    var7.method3326((float) var61);
                                    var7.method3326((float) var60);
                                    var7.method3326((float) var61);
                                    if (this.field7633 != null) {
                                        var7.method3326((float) (var39 == null ? 0 : var39[var59] + -1));
                                    }
                                    if ((7 & this.field7641) != 0) {
                                        var7.method3326(var74);
                                        var7.method3326(var75);
                                        var7.method3326(var76);
                                    }
                                }
                                if (~this.field7653.field2639 == -1) {
                                    var7.method3335(var92 | -16777216);
                                } else {
                                    var7.method3334(-16777216 | var92);
                                }
                                var101 = this.field7659++;
                                var58[var59] = (short) var101;
                                if (~var64 != 0) {
                                    var8[var101] = var33[var59];
                                }
                                var10.method1341(new class168(var58[var59]), (byte) -124, var67);
                            } else {
                                var58[var59] = ((class168) var90).field2272;
                                var101 = var58[var59] & 65535;
                                if (~var64 != 0 && ~var33[var59].field7465 > ~var8[var101].field7465) {
                                    var8[var101] = var33[var59];
                                }
                            }
                            for (int var102 = 0; ~var102 > ~var56; ++var102) {
                                var11[var102].method1606(256, var87, var101, var73, var72);
                            }
                            ++this.field7642;
                        }
                    }
                }
            }
            for (int var13 = 0; var13 < this.field7659; ++var13) {
                class253 var31 = var8[var13];
                if (var31 != null) {
                    var31.method1602(var13, (byte) -1);
                }
            }
            for (int var14 = 0; ~super.field8121 < ~var14; ++var14) {
                for (int var20 = 0; ~var20 > ~super.field8118; ++var20) {
                    short[] var21 = this.field7655[super.field8121 * var20 + var14];
                    if (var21 != null) {
                        int var22 = 0;
                        int var23 = 0;
                        while (~var23 > ~var21.length) {
                            int var24 = var21[var23++] & 65535;
                            int var25 = 65535 & var21[var23++];
                            int var26 = var21[var23++] & 65535;
                            class253 var27 = var8[var24];
                            class253 var28 = var8[var25];
                            class253 var29 = var8[var26];
                            class253 var30 = null;
                            if (var27 != null) {
                                var27.method1603(var20, var14, var22, (byte) -103);
                                var30 = var27;
                            }
                            if (var28 != null) {
                                var28.method1603(var20, var14, var22, (byte) -78);
                                if (var30 == null || ~var30.field7465 < ~var28.field7465) {
                                    var30 = var28;
                                }
                            }
                            if (var29 != null) {
                                var29.method1603(var20, var14, var22, (byte) -109);
                                if (var30 == null || ~var30.field7465 < ~var29.field7465) {
                                    var30 = var29;
                                }
                            }
                            if (var30 != null) {
                                if (var27 != null) {
                                    var30.method1602(var24, (byte) -1);
                                }
                                if (var28 != null) {
                                    var30.method1602(var25, (byte) -1);
                                }
                                if (var29 != null) {
                                    var30.method1602(var26, (byte) -1);
                                }
                                var30.method1603(var20, var14, var22, (byte) -126);
                            }
                            ++var22;
                        }
                    }
                }
            }
            var7.method3332();
            this.field7677 = this.field7653.method304(false, false);
            this.field7677.method408(var6, this.field7659 * var5, 6831, var5);
            if (~(7 & this.field7641) != -1) {
                if (this.field7633 != null) {
                    this.field7671 = this.field7653.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679, class176.field2678, class176.field2676, class176.field2677 }) }, (byte) 72);
                    this.field7670 = this.field7653.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679, class176.field2678, class176.field2676 }), new class314(class176.field2677) }, (byte) 72);
                } else {
                    this.field7671 = this.field7653.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679, class176.field2676, class176.field2677 }) }, (byte) 72);
                    this.field7670 = this.field7653.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679, class176.field2676 }), new class314(class176.field2677) }, (byte) 72);
                }
            } else if (this.field7633 == null) {
                this.field7671 = this.field7653.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679, class176.field2677 }) }, (byte) 72);
                this.field7670 = this.field7653.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679 }), new class314(class176.field2677) }, (byte) 72);
            } else {
                this.field7671 = this.field7653.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679, class176.field2678, class176.field2677 }) }, (byte) 72);
                this.field7670 = this.field7653.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2679, class176.field2678 }), new class314(class176.field2677) }, (byte) 72);
            }
            int var15 = 0;
            for (int var16 = 0; var16 < var3.length; ++var16) {
                if (~var3[var16].field3707 < -1) {
                    var3[var15++] = var3[var16];
                }
            }
            this.field7682 = new class253[var15];
            long[] var17 = new long[var15];
            for (int var18 = 0; var18 < var15; ++var18) {
                class253 var19 = var3[var18];
                var17[var18] = var19.field7465;
                this.field7682[var18] = var19;
                var19.method1605(-97, this.field7659);
            }
            class29.method127(var17, (byte) -125, this.field7682);
            if (this.field7638 != null) {
                this.field7638.method1880((byte) 58);
            }
        } else {
            this.field7638 = null;
        }
        this.field7666 = null;
        this.field7639 = null;
        this.field7675 = null;
        this.field7668 = null;
        this.field7635 = null;
        this.field7633 = null;
        this.field7640 = this.field7657 = null;
        this.field7679 = this.field7680 = this.field7672 = null;
        this.field7681 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V", line = 1283)
    public final void method1330(int arg0, int arg1) {
        ++field7645;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III[[ZZ)V", line = 1293)
    public final void method1318(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method3067(arg2, -1, (byte) -60, arg1, arg0, arg3, arg4);
        ++field7678;
    }

    @OriginalMember(owner = "client!eo", name = "X", descriptor = "(IILk;)Lk;", line = 1302)
    public final class88 method1329(int arg0, int arg1, class88 arg2) {
        ++field7664;
        if ((this.field7649[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field8116 >> this.field7653.field2580;
            class249 var5 = (class249) arg2;
            class249 var6;
            if (var5 != null && var5.method1587(var4, var4, true)) {
                var6 = var5;
                var5.method1584(-127);
            } else {
                var6 = new class249(this.field7653, var4, var4);
            }
            var6.method1583(var4, var4, 0, 1126236304, 0);
            this.method3069(arg0, arg1, -32709, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eo", name = "ya", descriptor = "(Lk;IIIIZ)V", line = 1332)
    public final void method1322(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7656;
        if (this.field7638 != null && arg0 != null) {
            int var7 = -(this.field7653.field2624 * arg2 >> 8) + arg1 >> this.field7653.field2580;
            int var8 = arg3 - (this.field7653.field2597 * arg2 >> 8) >> this.field7653.field2580;
            this.field7638.method1874(var8, 128, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILvh;)V", line = 1349)
    private final void method3069(int arg0, int arg1, int arg2, class249 arg3) {
        if (arg2 == -32709) {
            ++field7660;
            int[] var5 = this.field7640[arg0][arg1];
            int[] var6 = this.field7657[arg0][arg1];
            int var7 = var5.length;
            if (var7 > class481.field7294.length) {
                class21.field186 = new int[var7];
                class481.field7294 = new int[var7];
            }
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                class481.field7294[var8] = var5[var8] >> this.field7653.field2580;
                class21.field186[var8] = var6[var8] >> this.field7653.field2580;
            }
            int var9 = 0;
            while (~var9 > ~var7) {
                int var10 = class481.field7294[var9];
                int var11 = class21.field186[var9++];
                int var12 = class481.field7294[var9];
                int var13 = class21.field186[var9++];
                int var14 = class481.field7294[var9];
                int var15 = class21.field186[var9++];
                if (~((var10 - var12) * (-var15 + var13) + -((var13 - var11) * (var14 - var12))) < -1) {
                    arg3.method1585((byte) -16, var14, var11, var10, var12, var15, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z", line = 1425)
    public static final boolean method3070(boolean arg0) {
        for (int var1 = class386.field5658; var1 < class487.field7383; ++var1) {
            class415[][] var2 = class526.field7777[var1];
            for (int var3 = -class67.field763; var3 <= 0; ++var3) {
                int var4 = class365.field5254 + var3;
                int var5 = class365.field5254 - var3;
                if (var4 >= class580.field8548 || var5 < class309.field4509) {
                    for (int var6 = -class67.field763; var6 <= 0; ++var6) {
                        int var7 = class613.field8993 + var6;
                        int var8 = class613.field8993 - var6;
                        if (var4 >= class580.field8548) {
                            if (var7 >= class10.field90) {
                                class415 var9 = var2[var4][var7];
                                if (var9 != null && var9.field5972) {
                                    class232.field3430 = arg0;
                                    class298.field4354.method941((byte) -124, var9);
                                    class298.field4354.method935(5000);
                                }
                            }
                            if (var8 < class605.field8906) {
                                class415 var10 = var2[var4][var8];
                                if (var10 != null && var10.field5972) {
                                    class232.field3430 = arg0;
                                    class298.field4354.method941((byte) -123, var10);
                                    class298.field4354.method935(5000);
                                }
                            }
                        }
                        if (var5 < class309.field4509) {
                            if (var7 >= class10.field90) {
                                class415 var11 = var2[var5][var7];
                                if (var11 != null && var11.field5972) {
                                    class232.field3430 = arg0;
                                    class298.field4354.method941((byte) -127, var11);
                                    class298.field4354.method935(5000);
                                }
                            }
                            if (var8 < class605.field8906) {
                                class415 var12 = var2[var5][var8];
                                if (var12 != null && var12.field5972) {
                                    class232.field3430 = arg0;
                                    class298.field4354.method941((byte) -128, var12);
                                    class298.field4354.method935(5000);
                                }
                            }
                        }
                        if (class57.field699 == 0) {
                            if (class509.field7559) {
                                class298.field4354.method937(24, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eo", name = "ba", descriptor = "(II)I", line = 1542)
    public final int method1319(int arg0, int arg1) {
        ++field7669;
        return this.field7665[arg0][arg1];
    }
}
