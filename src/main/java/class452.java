import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class452 extends class38 {

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "Lsr;")
    private class167 field6739 = new class167();

    @OriginalMember(owner = "client!sp", name = "T", descriptor = "[[I")
    private int[][] field6759;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    private int field6755;

    @OriginalMember(owner = "client!sp", name = "Z", descriptor = "Lur;")
    public class377 field6765;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "[[[I")
    private int[][][] field6731;

    @OriginalMember(owner = "client!sp", name = "jb", descriptor = "[[F")
    private float[][] field6775;

    @OriginalMember(owner = "client!sp", name = "db", descriptor = "[[F")
    private float[][] field6769;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    private int field6727;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "[[[Lwn;")
    private class511[][][] field6751;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "[[[I")
    public int[][][] field6730;

    @OriginalMember(owner = "client!sp", name = "fb", descriptor = "[[F")
    private float[][] field6771;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "[[B")
    private byte[][] field6735;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
    public int field6741;

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "[[[I")
    public int[][][] field6756;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "[[S")
    public short[][] field6750;

    @OriginalMember(owner = "client!sp", name = "cb", descriptor = "[[B")
    private byte[][] field6768;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "[[[I")
    private int[][][] field6729;

    @OriginalMember(owner = "client!sp", name = "V", descriptor = "[[[I")
    private int[][][] field6761;

    @OriginalMember(owner = "client!sp", name = "kb", descriptor = "Lqh;")
    private class50 field6776;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "Lru;")
    private class130 field6738;

    @OriginalMember(owner = "client!sp", name = "U", descriptor = "I")
    public static int field6760 = 0;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "Lao;")
    public static class191 field6736 = new class191(81, 8);

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    private int field6737;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!sp", name = "Q", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!sp", name = "R", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!sp", name = "W", descriptor = "I")
    private int field6762;

    @OriginalMember(owner = "client!sp", name = "X", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!sp", name = "Y", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!sp", name = "ab", descriptor = "I")
    private int field6766;

    @OriginalMember(owner = "client!sp", name = "ib", descriptor = "I")
    private int field6774;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "Lhm;")
    public static class149 field6733;

    @OriginalMember(owner = "client!sp", name = "bb", descriptor = "Lse;")
    private class170 field6767;

    @OriginalMember(owner = "client!sp", name = "eb", descriptor = "Ltp;")
    public class374 field6770;

    @OriginalMember(owner = "client!sp", name = "gb", descriptor = "Ltp;")
    private class374 field6772;

    @OriginalMember(owner = "client!sp", name = "hb", descriptor = "Ltp;")
    public class374 field6773;

    @OriginalMember(owner = "client!sp", name = "lb", descriptor = "Ltp;")
    public class374 field6777;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "Lct;")
    public static class99 field6754;

    @OriginalMember(owner = "client!sp", name = "mb", descriptor = "[Lwn;")
    private class511[] field6778;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "[[[I")
    private int[][][] field6753;

    @OriginalMember(owner = "client!sp", name = "ua", descriptor = "(II)I")
    public final int method217(int arg0, int arg1) {
        ++field6746;
        return this.field6759[arg0][arg1];
    }

    @OriginalMember(owner = "client!sp", name = "OA", descriptor = "(IILi;)Li;")
    public final class31 method221(int arg0, int arg1, class31 arg2) {
        ++field6758;
        if (~(this.field6735[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field392 >> this.field6765.field5308;
            class429 var5 = (class429) arg2;
            class429 var6;
            if (var5 != null && var5.method2640(var4, var4, 1633034480)) {
                var6 = var5;
                var5.method2636((byte) 57);
            } else {
                var6 = new class429(this.field6765, var4, var4);
            }
            var6.method2637(0, var4, 125, var4, 0);
            this.method2805(var6, 255, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6748;
        if (this.field6774 > 0) {
            this.field6765.method2272((byte) 121);
            this.field6765.method2298(false, -12481);
            this.field6765.method2230(-13721, false);
            this.field6765.method2235(false, (byte) -46);
            this.field6765.method2289((byte) 117, false);
            this.field6765.method2279(0, (byte) 16);
            this.field6765.method2299(-2, (byte) 113);
            this.field6765.method2236((class252) null, 110);
            class118.field1544[8] = 0.0F;
            class118.field1544[3] = 0.0F;
            class118.field1544[11] = 0.0F;
            class118.field1544[14] = 0.0F;
            class118.field1544[10] = 0.0F;
            class118.field1544[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6765.field5125;
            class118.field1544[2] = 0.0F;
            class118.field1544[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6765.field5220) + -1.0F;
            class118.field1544[4] = 0.0F;
            class118.field1544[5] = (float) arg2 / ((float) super.field392 * 128.0F * (float) this.field6765.field5125);
            class118.field1544[9] = 0.0F;
            class118.field1544[7] = 0.0F;
            class118.field1544[1] = 0.0F;
            class118.field1544[6] = 0.0F;
            class118.field1544[15] = 1.0F;
            class118.field1544[0] = (float) arg2 / ((float) super.field392 * 128.0F * (float) this.field6765.field5220);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class118.field1544, 0);
            class118.field1544[12] = 0.0F;
            class118.field1544[15] = 1.0F;
            class118.field1544[3] = 0.0F;
            class118.field1544[5] = 0.0F;
            class118.field1544[2] = 0.0F;
            class118.field1544[0] = 1.0F;
            class118.field1544[1] = 0.0F;
            class118.field1544[6] = 1.0F;
            class118.field1544[7] = 0.0F;
            class118.field1544[10] = 0.0F;
            class118.field1544[4] = 0.0F;
            class118.field1544[13] = 0.0F;
            class118.field1544[11] = 0.0F;
            class118.field1544[9] = 1.0F;
            class118.field1544[14] = 0.0F;
            class118.field1544[8] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class118.field1544, 0);
            if ((this.field6741 & 7) == 0) {
                this.field6765.method2230(-13721, false);
            } else {
                this.field6765.method2230(-13721, true);
                this.field6765.method2296((byte) 40);
            }
            this.field6765.method2293(this.field6770, this.field6777, this.field6772, 32884, this.field6773);
            if (~this.field6765.field5372.field5761.length > ~(this.field6737 * 2)) {
                this.field6765.field5372 = new class408(this.field6737 * 2);
            } else {
                this.field6765.field5372.field5729 = 0;
            }
            int var9 = 0;
            class408 var10 = this.field6765.field5372;
            if (!this.field6765.field5334) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field391 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field6750[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method2434(-12659, var14[var15] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field391 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field6750[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    ++var9;
                                    var10.method2444((byte) 65, var20[var21] & 65535);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class230 var17 = new class230(this.field6765, 5123, var10.field5761, var10.field5729);
                this.field6765.method2247(var9, (byte) 127, 0, 4, var17);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lur;IIII[[I[[II)V")
    public class452(class377 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field6759 = arg5;
        this.field6755 = super.field387 + -2;
        this.field6765 = arg0;
        this.field6731 = new int[arg3][arg4][];
        this.field6775 = new float[super.field391 + 1][super.field394 - -1];
        this.field6769 = new float[super.field391 - -1][super.field394 + 1];
        this.field6727 = 1 << this.field6755;
        this.field6751 = new class511[arg3][arg4][];
        this.field6730 = new int[arg3][arg4][];
        this.field6771 = new float[super.field391 - -1][super.field394 + 1];
        this.field6735 = new byte[arg3][arg4];
        this.field6741 = arg2;
        this.field6756 = new int[arg3][arg4][];
        this.field6750 = new short[arg3 * arg4][];
        this.field6768 = new byte[arg3 + 1][arg4 - -1];
        this.field6729 = new int[arg3][arg4][];
        this.field6761 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field394 < ~var9; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field391; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * arg7 * 4 + var11 * var11)));
                this.field6775[var10][var9] = (float) var11 * var13;
                this.field6771[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field6769[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6776 = new class50(128);
        if ((this.field6741 & 16) != 0) {
            this.field6738 = new class130(this.field6765, this);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)Z")
    public static final boolean method2802(int arg0, int arg1, int arg2) {
        ++field6764;
        if (arg1 != 0) {
            field6733 = null;
        }
        return class268.method1635(arg0, -1596595220, arg2) & class92.method511(arg2, arg0, 118);
    }

    @OriginalMember(owner = "client!sp", name = "ca", descriptor = "(II)I")
    public final int method216(int arg0, int arg1) {
        ++field6728;
        int var3 = arg0 >> super.field387;
        int var4 = arg1 >> super.field387;
        if (~var3 <= -1 && ~var4 <= -1 && var3 <= super.field391 + -1 && ~var4 >= ~(super.field394 + -1)) {
            int var5 = arg0 & super.field392 + -1;
            int var6 = arg1 & super.field392 - 1;
            int var7 = (-var5 + super.field392) * this.field6759[var3][var4] + this.field6759[var3 + 1][var4] * var5 >> super.field387;
            int var8 = (-var5 + super.field392) * this.field6759[var3][var4 + 1] + this.field6759[var3 - -1][var4 + 1] * var5 >> super.field387;
            return (-var6 + super.field392) * var7 + var6 * var8 >> super.field387;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([[ZZIIIII)V")
    private final void method2803(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6745;
        if (arg3 != 65408) {
            this.method212((class31) null, -19, -12, 127, -71, true);
        }
        if (this.field6778 != null) {
            float var8 = this.field6765.field5447;
            float var9 = this.field6765.field5414;
            int var10 = arg5 - (-arg5 + -1);
            int var11 = var10 * var10;
            if (var11 > this.field6765.field5451.length) {
                this.field6765.field5451 = new int[var11];
            }
            if (this.field6737 * 2 > this.field6765.field5372.field5761.length) {
                this.field6765.field5372 = new class408(this.field6737 * 2);
            }
            int var12 = -arg5 + arg6;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg5 + arg2;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg5 + arg6;
            if (~(super.field391 + -1) > ~var16) {
                var16 = super.field391 + -1;
            }
            int var17 = arg2 + arg5;
            if (var17 > super.field394 + -1) {
                var17 = super.field394 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field6765.field5451;
            for (int var20 = var12; var16 >= var20; ++var20) {
                boolean[] var26 = arg0[-var13 + var20];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field391 * var27 + var20;
                    }
                }
            }
            if (~arg4 == 0) {
                this.field6765.method2282((byte) 20);
            } else {
                this.field6765.method2294(3405, (float) arg4);
                this.field6765.method2248(16);
            }
            this.field6765.method2230(-13721, (this.field6741 & 7) != 0);
            for (int var21 = 0; var21 < this.field6778.length; ++var21) {
                this.field6778[var21].method3054(false, var19, var18);
            }
            if (!this.field6739.method979(2)) {
                int var22 = this.field6765.field5440;
                int var23 = this.field6765.field5387;
                this.field6765.method1167(0, var23, this.field6765.field5367);
                this.field6765.method1140(var9, var8 + -4.0F);
                this.field6765.method2230(-13721, false);
                this.field6765.method2289((byte) 120, false);
                this.field6765.method2279(128, (byte) 11);
                this.field6765.method2299(-2, (byte) 81);
                this.field6765.method2236(this.field6765.field5428, 109);
                this.field6765.method2269(8448, arg3 ^ 56448, 7681);
                this.field6765.method2229(34166, (byte) -18, 0, 770);
                this.field6765.method2277((byte) -1, 770, 0, 34167);
                for (class435 var24 = this.field6739.method970(arg3 ^ 65420); var24 != null; var24 = this.field6739.method976((byte) -121)) {
                    class270 var25 = (class270) var24;
                    var25.method1640(arg5, arg2, arg6, arg0, (byte) -40);
                }
                this.field6765.method2229(5890, (byte) -18, 0, 768);
                this.field6765.method2277((byte) -7, 770, 0, 5890);
                this.field6765.method2236((class252) null, 119);
                this.field6765.method1167(var22, var23, this.field6765.field5367);
            }
            if (this.field6738 != null) {
                this.field6765.method1140(var9, var8 - 8.0F);
                this.field6765.method2282((byte) 33);
                this.field6765.method2293(this.field6770, this.field6777, (class374) null, 32884, (class374) null);
                this.field6738.method781(arg6, (byte) -42, arg0, arg1, arg2, arg5);
            }
            this.field6765.method1140(var9, var8);
        }
    }

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method214(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6749;
        if (this.field6738 != null && arg0 != null) {
            int var7 = -(this.field6765.field5431 * arg2 >> 8) + arg1 >> this.field6765.field5308;
            int var8 = -(this.field6765.field5343 * arg2 >> 8) + arg3 >> this.field6765.field5308;
            this.field6738.method783(var7, (byte) 39, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!sp", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method209(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6743;
        if (this.field6738 != null && arg0 != null) {
            int var7 = arg1 - (this.field6765.field5431 * arg2 >> 8) >> this.field6765.field5308;
            int var8 = -(this.field6765.field5343 * arg2 >> 8) + arg3 >> this.field6765.field5308;
            this.field6738.method784(var8, (byte) 77, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method222(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6734;
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
        this.method207(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!sp", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method207(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field6732;
        if (arg5 != null && this.field6753 == null) {
            this.field6753 = new int[super.field391][super.field394][];
        }
        if (arg3 != null && this.field6729 == null) {
            this.field6729 = new int[super.field391][super.field394][];
        }
        this.field6730[arg0][arg1] = arg2;
        this.field6756[arg0][arg1] = arg4;
        this.field6731[arg0][arg1] = arg6;
        this.field6761[arg0][arg1] = arg7;
        if (this.field6753 != null) {
            this.field6753[arg0][arg1] = arg5;
        }
        if (this.field6729 != null) {
            this.field6729[arg0][arg1] = arg3;
        }
        class511[] var15 = this.field6751[arg0][arg1] = new class511[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class435 var19;
            for (var19 = this.field6776.method295(var17, -106); var19 != null; var19 = this.field6776.method297((byte) 127)) {
                class511 var20 = (class511) var19;
                if (arg8[var16] == var20.field7456 && (float) arg9[var16] == var20.field7452 && ~var20.field7457 == ~arg10 && var20.field7444 == arg11 && var20.field7445 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class511) var19;
            } else {
                var15[var16] = new class511(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field6776.method291(var17, var15[var16], -47);
            }
        }
        if (arg13) {
            this.field6735[arg0][arg1] = (byte) class219.method1381(this.field6735[arg0][arg1], 1);
        }
        if (this.field6766 < arg6.length) {
            this.field6766 = arg6.length;
        }
        this.field6774 += arg6.length;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
    public static void method2804(int arg0) {
        int var1 = -77 % ((-63 - arg0) / 61);
        field6733 = null;
        field6754 = null;
        field6736 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III[[ZZ)V")
    public final void method208(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2803(arg3, arg4, arg1, 65408, -1, arg2, arg0);
        ++field6763;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method212(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6742;
        if (this.field6738 != null && arg0 != null) {
            int var7 = -(this.field6765.field5431 * arg2 >> 8) + arg1 >> this.field6765.field5308;
            int var8 = arg3 - (this.field6765.field5343 * arg2 >> 8) >> this.field6765.field5308;
            return this.field6738.method779(var8, var7, arg0, -1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lre;III)V")
    private final void method2805(class429 arg0, int arg1, int arg2, int arg3) {
        ++field6747;
        int[] var5 = this.field6730[arg2][arg3];
        int[] var6 = this.field6756[arg2][arg3];
        int var7 = var5.length;
        if (var7 > this.field6765.field5454.length) {
            this.field6765.field5455 = new int[var7];
            this.field6765.field5454 = new int[var7];
        }
        int[] var8 = this.field6765.field5454;
        int[] var9 = this.field6765.field5455;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = class95.method534(var5[var10], 255) >> this.field6765.field5308;
            var9[var10] = class95.method534(255, var6[var10]) >> this.field6765.field5308;
        }
        int var11 = 0;
        if (arg1 != 255) {
            this.method207(67, 38, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -90, 116, -82, false);
        }
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((var15 - var17) * (-var14 + var12) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                arg0.method2638(1061320208, var17, var12, var15, var13, var16, var14);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "aa", descriptor = "()V")
    public final void method206() {
        if (this.field6774 > 0) {
            byte[][] var1 = new byte[super.field391 + 1][super.field394 - -1];
            for (int var2 = 1; super.field391 > var2; ++var2) {
                for (int var103 = 1; super.field394 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field6768[var2][var103 + 1] >> 3) + (this.field6768[var2 + -1][var103] >> 2) + (this.field6768[var2][var103] >> 1) + (this.field6768[var2][var103 + -1] >> 2) + (this.field6768[var2 + 1][var103] >> 3));
                }
            }
            this.field6778 = new class511[this.field6776.method298(0)];
            this.field6776.method299(0, this.field6778);
            for (int var3 = 0; this.field6778.length > var3; ++var3) {
                this.field6778[var3].method3058(this.field6774, (byte) 50);
            }
            int var4 = 24;
            if (this.field6753 != null) {
                var4 += 4;
            }
            if ((7 & this.field6741) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field6765.field5312.method2738(this.field6774 * var4);
            NativeStream var6 = new NativeStream(var5);
            class511[] var7 = new class511[this.field6774];
            int var8 = class525.method3127(this.field6774 / 4, 1617667937);
            if (~var8 > -2) {
                var8 = 1;
            }
            class50 var9 = new class50(var8);
            class511[] var10 = new class511[this.field6766];
            for (int var11 = 0; super.field391 > var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field394; ++var30) {
                    if (this.field6731[var11][var30] != null) {
                        class511[] var31 = this.field6751[var11][var30];
                        int[] var32 = this.field6730[var11][var30];
                        int[] var33 = this.field6756[var11][var30];
                        int[] var34 = this.field6761[var11][var30];
                        int[] var35 = this.field6731[var11][var30];
                        int[] var36 = this.field6729 == null ? null : this.field6729[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field6753 == null ? null : this.field6753[var11][var30];
                        float var38 = this.field6775[var11][var30];
                        float var39 = this.field6771[var11][var30];
                        float var40 = this.field6769[var11][var30];
                        float var41 = this.field6775[var11][var30 + 1];
                        float var42 = this.field6771[var11][var30 + 1];
                        float var43 = this.field6769[var11][var30 - -1];
                        float var44 = this.field6775[var11 + 1][var30 + 1];
                        float var45 = this.field6771[var11 + 1][var30 + 1];
                        float var46 = this.field6769[var11 + 1][var30 - -1];
                        float var47 = this.field6775[var11 + 1][var30];
                        float var48 = this.field6771[var11 + 1][var30];
                        float var49 = this.field6769[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 - -1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label339: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class511 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field6750[super.field391 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field387) - -var32[var57];
                            int var59 = (var30 << super.field387) + var33[var57];
                            int var60 = var58 >> this.field6755;
                            int var61 = var59 >> this.field6755;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var40;
                                var73 = var69 - var50;
                                var74 = var38;
                                var75 = var39;
                            } else if (~var67 == -1 && ~super.field392 == ~var68) {
                                var72 = var43;
                                var75 = var42;
                                var73 = var69 - var51;
                                var74 = var41;
                            } else if (super.field392 == var67 && ~super.field392 == ~var68) {
                                var72 = var46;
                                var75 = var45;
                                var73 = var69 - var52;
                                var74 = var44;
                            } else if (super.field392 == var67 && var68 == 0) {
                                var75 = var48;
                                var73 = var69 - var53;
                                var74 = var47;
                                var72 = var49;
                            } else {
                                float var76 = (float) var67 / (float) super.field392;
                                float var77 = (float) var68 / (float) super.field392;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var74 = (var81 - var78) * var77 + var78;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var75 = (-var79 + var82) * var77 + var79;
                                var72 = (-var80 + var83) * var77 + var80;
                                int var84 = var50 - -((var53 - var50) * var67 >> super.field387);
                                int var85 = ((-var51 + var52) * var67 >> super.field387) + var51;
                                var73 = var69 - (((-var84 + var85) * var68 >> super.field387) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (~var86 <= -3) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class413.field5903[var62 & 65408 | var86];
                                if ((this.field6741 & 7) == 0) {
                                    float var87 = this.field6765.field5345[2] * var72 + this.field6765.field5345[0] * var74 + this.field6765.field5345[1] * var75;
                                    var71 = this.field6765.field5337 + var87 * (!(var87 > 0.0F) ? this.field6765.field5434 : this.field6765.field5436);
                                }
                            }
                            class435 var88 = null;
                            if ((var58 & this.field6727 + -1) == 0 && (var59 & this.field6727 - 1) == 0) {
                                var88 = var9.method295(var65, -91);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class267) var88).field3574;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && var31[var57].field6348 < var7[var89].field6348) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (~var62 == ~var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (var63 & 127) * var73 >> 7;
                                    if (~var91 > -3) {
                                        var91 = 2;
                                    } else if (var91 > 126) {
                                        var91 = 126;
                                    }
                                    var90 = class413.field5903[var91 | 65408 & var63];
                                    if ((this.field6741 & 7) == 0) {
                                        float var92 = this.field6765.field5345[2] * var72 + this.field6765.field5345[0] * var74 + this.field6765.field5345[1] * var75;
                                        float var93 = this.field6765.field5337 + (var71 > 0.0F ? this.field6765.field5436 : this.field6765.field5434) * var71;
                                        int var94 = (var90 & 16773449) >> 16;
                                        int var95 = (65443 & var90) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = 255 & var90;
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var96 <= -1) {
                                            if (~var96 < -256) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var99 | var96 << 16 | var98 << 8;
                                    }
                                }
                                if (!this.field6765.field5334) {
                                    var6.method2733((float) var58);
                                    var6.method2733((float) (var64 + this.method216(var58, var59)));
                                    var6.method2733((float) var59);
                                    var6.method2737((byte) (var90 >> 16));
                                    var6.method2737((byte) (var90 >> 8));
                                    var6.method2737((byte) var90);
                                    var6.method2737(-1);
                                    var6.method2733((float) var58);
                                    var6.method2733((float) var59);
                                    if (this.field6753 != null) {
                                        var6.method2733((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field6741) != 0) {
                                        var6.method2733(var74);
                                        var6.method2733(var75);
                                        var6.method2733(var72);
                                    }
                                } else {
                                    var6.method2736((float) var58);
                                    var6.method2736((float) (var64 + this.method216(var58, var59)));
                                    var6.method2736((float) var59);
                                    var6.method2737((byte) (var90 >> 16));
                                    var6.method2737((byte) (var90 >> 8));
                                    var6.method2737((byte) var90);
                                    var6.method2737(-1);
                                    var6.method2736((float) var58);
                                    var6.method2736((float) var59);
                                    if (this.field6753 != null) {
                                        var6.method2736((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field6741) != 0) {
                                        var6.method2736(var74);
                                        var6.method2736(var75);
                                        var6.method2736(var72);
                                    }
                                }
                                var89 = this.field6762++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method291(var65, new class267(var56[var57]), -41);
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method3057(-74, var70, var73, var71, var89);
                            }
                            ++this.field6737;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field6762 > var12; ++var12) {
                class511 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3056((byte) 75, var12);
                }
            }
            for (int var13 = 0; super.field391 > var13; ++var13) {
                for (int var18 = 0; var18 < super.field394; ++var18) {
                    short[] var19 = this.field6750[super.field391 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class511 var25 = var7[var22];
                            class511 var26 = var7[var23];
                            class511 var27 = var7[var24];
                            class511 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method3051(var20, var18, var13, -18458);
                            }
                            if (var26 != null) {
                                var26.method3051(var20, var18, var13, -18458);
                                if (var28 == null || var26.field6348 < var28.field6348) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3051(var20, var18, var13, -18458);
                                if (var28 == null || ~var27.field6348 > ~var28.field6348) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3056((byte) 75, var22);
                                }
                                if (var26 != null) {
                                    var28.method3056((byte) 75, var23);
                                }
                                if (var27 != null) {
                                    var28.method3056((byte) 75, var24);
                                }
                                var28.method3051(var20, var18, var13, -18458);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2734();
            this.field6767 = this.field6765.method2287(var6.method2731(), var4, (byte) -103, var5, false);
            this.field6770 = new class374(this.field6767, 5126, 3, 0);
            this.field6772 = new class374(this.field6767, 5121, 4, 12);
            byte var14;
            if (this.field6753 != null) {
                var14 = 28;
                this.field6777 = new class374(this.field6767, 5126, 3, 16);
            } else {
                this.field6777 = new class374(this.field6767, 5126, 2, 16);
                var14 = 24;
            }
            if ((this.field6741 & 7) != 0) {
                this.field6773 = new class374(this.field6767, 5126, 3, var14);
            }
            long[] var15 = new long[this.field6778.length];
            for (int var16 = 0; ~var16 > ~this.field6778.length; ++var16) {
                class511 var17 = this.field6778[var16];
                var15[var16] = var17.field6348;
                var17.method3053(24090, this.field6762);
            }
            class107.method664(this.field6778, var15, (byte) -120);
            if (this.field6738 != null) {
                this.field6738.method778(1);
            }
        } else {
            this.field6738 = null;
        }
        ++field6740;
        this.field6751 = null;
        this.field6731 = null;
        this.field6768 = null;
        this.field6761 = null;
        this.field6753 = null;
        this.field6729 = null;
        this.field6775 = this.field6771 = this.field6769 = null;
        this.field6776 = null;
        this.field6730 = this.field6756 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lbn;[I)V")
    public final void method215(class309 arg0, int[] arg1) {
        ++field6752;
        this.field6739.method975(0, new class270(this.field6765, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!sp", name = "qa", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(255 & this.field6768[arg0][arg1])) {
            this.field6768[arg0][arg1] = (byte) arg2;
        }
        ++field6757;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)V")
    public final void method211(int arg0, int arg1) {
        ++field6744;
    }
}
