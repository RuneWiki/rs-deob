import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class306 extends class474 {

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "[I")
    private int[] field3796;

    @OriginalMember(owner = "client!ja", name = "uc", descriptor = "I")
    private int field3882;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    private int field3798;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
    private int field3818;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    private int field3807;

    @OriginalMember(owner = "client!ja", name = "jc", descriptor = "[I")
    private int[] field3871;

    @OriginalMember(owner = "client!ja", name = "Db", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!ja", name = "kc", descriptor = "[S")
    private short[] field3872;

    @OriginalMember(owner = "client!ja", name = "Ib", descriptor = "[I")
    private int[] field3844;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "[I")
    private int[] field3809;

    @OriginalMember(owner = "client!ja", name = "Bb", descriptor = "[Lhi;")
    private class64[] field3837;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "[Lqg;")
    private class214[] field3782;

    @OriginalMember(owner = "client!ja", name = "Wb", descriptor = "I")
    private int field3858;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "[Lmfa;")
    private class576[] field3813;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "[Loh;")
    private class602[] field3804;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "[F")
    private float[] field3797;

    @OriginalMember(owner = "client!ja", name = "Kb", descriptor = "[F")
    private float[] field3846;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "[S")
    private short[] field3811;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "[S")
    private short[] field3803;

    @OriginalMember(owner = "client!ja", name = "Fc", descriptor = "[S")
    private short[] field3893;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "S")
    private short field3823;

    @OriginalMember(owner = "client!ja", name = "sc", descriptor = "[S")
    private short[] field3880;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "[S")
    private short[] field3816;

    @OriginalMember(owner = "client!ja", name = "Qb", descriptor = "S")
    private short field3852;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "[S")
    private short[] field3827;

    @OriginalMember(owner = "client!ja", name = "bc", descriptor = "[S")
    private short[] field3863;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "[S")
    private short[] field3817;

    @OriginalMember(owner = "client!ja", name = "rc", descriptor = "[B")
    private byte[] field3879;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "[S")
    private short[] field3785;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "[S")
    private short[] field3815;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "[S")
    private short[] field3805;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "[S")
    private short[] field3794;

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "[B")
    private byte[] field3826;

    @OriginalMember(owner = "client!ja", name = "tc", descriptor = "[I")
    private int[] field3881;

    @OriginalMember(owner = "client!ja", name = "xb", descriptor = "[I")
    private int[] field3833;

    @OriginalMember(owner = "client!ja", name = "lc", descriptor = "[I")
    private int[] field3873;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!ja", name = "oc", descriptor = "I")
    private int field3876;

    @OriginalMember(owner = "client!ja", name = "Ab", descriptor = "[[I")
    private int[][] field3836;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "[[I")
    private int[][] field3784;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "[[I")
    private int[][] field3812;

    @OriginalMember(owner = "client!ja", name = "vb", descriptor = "Z")
    private boolean field3831;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "Z")
    private boolean field3810;

    @OriginalMember(owner = "client!ja", name = "zc", descriptor = "Z")
    private boolean field3887;

    @OriginalMember(owner = "client!ja", name = "Gc", descriptor = "Z")
    private boolean field3894;

    @OriginalMember(owner = "client!ja", name = "Nb", descriptor = "Len;")
    private class478 field3849;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "Lgm;")
    private class131 field3799;

    @OriginalMember(owner = "client!ja", name = "yb", descriptor = "Lgm;")
    private class131 field3834;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "Lgm;")
    private class131 field3800;

    @OriginalMember(owner = "client!ja", name = "fc", descriptor = "Lgm;")
    private class131 field3867;

    @OriginalMember(owner = "client!ja", name = "Jc", descriptor = "Lfs;")
    private class387 field3897;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3779 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    private int field3793;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ja", name = "sb", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!ja", name = "tb", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ja", name = "ub", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ja", name = "wb", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ja", name = "zb", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ja", name = "Cb", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!ja", name = "Eb", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!ja", name = "Fb", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!ja", name = "Gb", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!ja", name = "Hb", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ja", name = "Jb", descriptor = "I")
    private int field3845;

    @OriginalMember(owner = "client!ja", name = "Lb", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ja", name = "Mb", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ja", name = "Ob", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ja", name = "Pb", descriptor = "I")
    private int field3851;

    @OriginalMember(owner = "client!ja", name = "Rb", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ja", name = "Sb", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ja", name = "Tb", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ja", name = "Ub", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ja", name = "Vb", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ja", name = "Xb", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!ja", name = "Yb", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ja", name = "Zb", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ja", name = "ac", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ja", name = "cc", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!ja", name = "dc", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!ja", name = "ec", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!ja", name = "gc", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!ja", name = "hc", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ja", name = "ic", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ja", name = "mc", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ja", name = "nc", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!ja", name = "pc", descriptor = "I")
    private int field3877;

    @OriginalMember(owner = "client!ja", name = "qc", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!ja", name = "vc", descriptor = "I")
    private int field3883;

    @OriginalMember(owner = "client!ja", name = "wc", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ja", name = "xc", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ja", name = "yc", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ja", name = "Ac", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ja", name = "Bc", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ja", name = "Cc", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ja", name = "Dc", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ja", name = "Ec", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ja", name = "Hc", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ja", name = "Ic", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Luf;")
    private class384 field3786;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "()I", line = 9)
    public final int method757() {
        if (!this.field3810) {
            this.method1762(false);
        }
        field3840++;
        return this.field3883;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lq;Lpba;II)V", line = 22)
    public final void method751(class491 arg0, class151 arg1, int arg2, int arg3) {
        field3774++;
        if (this.field3825 == 0) {
            return;
        }
        class691 var5 = this.field3849.field6234;
        class691 var6 = (class691) arg0;
        if (!this.field3810) {
            this.method1762(false);
        }
        class223.field2790 = var5.field9799 * var6.field9795 + var5.field9822 * var6.field9780 + var5.field9798 * var6.field9791 + var5.field9795;
        class582.field8138 = var5.field9799 * var6.field9822 + var5.field9822 * var6.field9810 + var5.field9798 * var6.field9781;
        float var7 = (float) this.field3883 * class582.field8138 + class223.field2790;
        float var8 = (float) this.field3845 * class582.field8138 + class223.field2790;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) this.field3841 + var7;
            var9 = var8 - (float) this.field3841;
        } else {
            var9 = (float) (-this.field3841) + var7;
            var10 = (float) this.field3841 + var8;
        }
        if ((var9 >= this.field3849.field6320) || ((float) this.field3849.field6318 >= var10)) {
            return;
        }
        class679.field9551 = var5.field9823 * var6.field9822 + var5.field9803 * var6.field9781 + var5.field9781 * var6.field9810;
        class417.field5248 = var5.field9823 * var6.field9795 + var5.field9803 * var6.field9791 + var5.field9781 * var6.field9780 + var5.field9791;
        float var11 = (float) this.field3883 * class679.field9551 + class417.field5248;
        float var12 = (float) this.field3845 * class679.field9551 + class417.field5248;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) (-this.field3841) + var12) * (float) this.field3849.field6240;
            var14 = ((float) this.field3841 + var11) * (float) this.field3849.field6240;
        } else {
            var14 = ((float) this.field3841 + var12) * (float) this.field3849.field6240;
            var13 = ((float) (-this.field3841) + var11) * (float) this.field3849.field6240;
        }
        if ((this.field3849.field6271 <= var13 / (float) arg2) || (this.field3849.field6291 >= var14 / (float) arg2)) {
            return;
        }
        class82.field1099 = var5.field9796 * var6.field9822 + var5.field9819 * var6.field9781 + var5.field9810 * var6.field9810;
        class160.field2103 = var5.field9796 * var6.field9795 + var5.field9819 * var6.field9791 + var5.field9810 * var6.field9780 + var5.field9780;
        float var15 = (float) this.field3883 * class82.field1099 + class160.field2103;
        float var16 = (float) this.field3845 * class82.field1099 + class160.field2103;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var17 = (var16 - (float) this.field3841) * (float) this.field3849.field6297;
            var18 = ((float) this.field3841 + var15) * (float) this.field3849.field6297;
        } else {
            var17 = (var15 - (float) this.field3841) * (float) this.field3849.field6297;
            var18 = ((float) this.field3841 + var16) * (float) this.field3849.field6297;
        }
        if ((var17 / (float) arg2 >= this.field3849.field6252) || (this.field3849.field6280 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field3804 != null) {
            class434.field5436 = var5.field9823 * var6.field9798 + var5.field9803 * var6.field9803 + var5.field9781 * var6.field9819;
            class461.field5857 = var5.field9799 * var6.field9798 + var5.field9822 * var6.field9819 + var5.field9798 * var6.field9803;
            client.field9536 = var5.field9823 * var6.field9799 + var5.field9803 * var6.field9823 + var5.field9781 * var6.field9796;
            class348.field4456 = var5.field9796 * var6.field9799 + var5.field9819 * var6.field9823 + var5.field9810 * var6.field9796;
            class651.field9195 = var5.field9796 * var6.field9798 + var5.field9819 * var6.field9803 + var5.field9810 * var6.field9819;
            class548.field7414 = var5.field9799 * var6.field9799 + var5.field9822 * var6.field9796 + var5.field9798 * var6.field9823;
        }
        if (arg1 != null) {
            int var19 = this.field3877 + this.field3793 >> 1;
            int var20 = this.field3851 + this.field3828 >> 1;
            int var21 = (int) ((float) var20 * client.field9536 + (float) this.field3883 * class679.field9551 + (float) var19 * class434.field5436 + class417.field5248);
            int var22 = (int) ((float) var20 * class348.field4456 + (float) this.field3883 * class82.field1099 + (float) var19 * class651.field9195 + class160.field2103);
            int var23 = (int) ((float) var20 * class548.field7414 + (float) this.field3883 * class582.field8138 + (float) var19 * class461.field5857 + class223.field2790);
            int var24 = (int) ((float) var20 * client.field9536 + (float) this.field3845 * class679.field9551 + (float) var19 * class434.field5436 + class417.field5248);
            int var25 = (int) ((float) var20 * class348.field4456 + (float) this.field3845 * class82.field1099 + (float) var19 * class651.field9195 + class160.field2103);
            arg1.field1931 = this.field3849.field6297 * var25 / arg2 + this.field3849.field6266;
            int var26 = (int) ((float) var20 * class548.field7414 + (float) this.field3845 * class582.field8138 + (float) var19 * class461.field5857 + class223.field2790);
            arg1.field1933 = this.field3849.field6240 * var21 / arg2 + this.field3849.field6323;
            arg1.field1934 = this.field3849.field6240 * var24 / arg2 + this.field3849.field6323;
            arg1.field1929 = this.field3849.field6266 + (this.field3849.field6297 * var22 / arg2);
            if (var23 >= this.field3849.field6318 || this.field3849.field6318 <= var26) {
                arg1.field1930 = true;
                arg1.field1932 = (this.field3841 + var21) * this.field3849.field6240 / arg2 + this.field3849.field6323 - arg1.field1933;
            }
        }
        this.field3849.method2580((float) arg2, (byte) -110);
        this.field3849.method2572(128);
        this.field3849.method2584(-16926, var6);
        this.method1764(29892);
        this.method1765(true);
    }

    @OriginalMember(owner = "client!ja", name = "na", descriptor = "()I", line = 169)
    public final int method754() {
        field3857++;
        return this.field3823;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 177)
    public final void method1752(byte arg0) {
        if (this.field3799 != null) {
            this.field3799.method690(55);
        }
        field3865++;
        if (this.field3834 != null) {
            this.field3834.method690(55);
        }
        if (this.field3800 != null) {
            this.field3800.method690(arg0 ^ 0x15);
        }
        if (this.field3867 != null) {
            this.field3867.method690(55);
        }
        if (arg0 != 34) {
            this.method703();
        }
        if (this.field3897 != null) {
            this.field3897.method2081(23331);
        }
    }

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "(I[IIIIZI[I)V", line = 205)
    public final void method721(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3842++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class352.field4497 = 0;
            class301.field3699 = 0;
            class378.field4786 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field3836.length > var15) {
                    int[] var16 = this.field3836[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3872 == null || (arg6 & this.field3872[var18]) != 0) {
                            class301.field3699 += this.field3809[var18];
                            class352.field4497 += this.field3871[var18];
                            var13++;
                            class378.field4786 += this.field3844[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class352.field4497 = var11;
                class301.field3699 = var10;
                class378.field4786 = var12;
            } else {
                class378.field4786 = class378.field4786 / var13 + var12;
                class301.field3699 = class301.field3699 / var13 + var10;
                class352.field4497 = class352.field4497 / var13 + var11;
                class491.field6488 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 + (arg7[2] * arg4) + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 - (-(arg7[5] * arg4) - 8192) >> 14;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field3836.length > var26) {
                    int[] var27 = this.field3836[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3872 == null || (arg6 & this.field3872[var29]) != 0) {
                            this.field3809[var29] += var22;
                            this.field3871[var29] += var23;
                            this.field3844[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field3836.length > var49) {
                        int[] var50 = this.field3836[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field3872 == null || (this.field3872[var52] & arg6) != 0) {
                                this.field3809[var52] -= class301.field3699;
                                this.field3871[var52] -= class352.field4497;
                                this.field3844[var52] -= class378.field4786;
                                if (arg4 != 0) {
                                    int var53 = class453.field5810[arg4];
                                    int var54 = class453.field5811[arg4];
                                    int var55 = this.field3871[var52] * var53 + (this.field3809[var52] * var54) + 16383 >> 14;
                                    this.field3871[var52] = this.field3871[var52] * var54 + 16383 - (this.field3809[var52] * var53) >> 14;
                                    this.field3809[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class453.field5810[arg2];
                                    int var57 = class453.field5811[arg2];
                                    int var58 = this.field3871[var52] * var57 + 16383 - (this.field3844[var52] * var56) >> 14;
                                    this.field3844[var52] = this.field3871[var52] * var56 + this.field3844[var52] * var57 + 16383 >> 14;
                                    this.field3871[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class453.field5810[arg3];
                                    int var60 = class453.field5811[arg3];
                                    int var61 = this.field3844[var52] * var59 + (this.field3809[var52] * var60) + 16383 >> 14;
                                    this.field3844[var52] = this.field3844[var52] * var60 + 16383 - (this.field3809[var52] * var59) >> 14;
                                    this.field3809[var52] = var61;
                                }
                                this.field3809[var52] += class301.field3699;
                                this.field3871[var52] += class352.field4497;
                                this.field3844[var52] += class378.field4786;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field3836.length > var32) {
                            int[] var33 = this.field3836[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field3872 == null || (arg6 & this.field3872[var35]) != 0) {
                                    int var36 = this.field3796[var35];
                                    int var37 = this.field3796[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field3827[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class453.field5810[arg4];
                                            int var41 = class453.field5811[arg4];
                                            int var42 = this.field3805[var39] * var40 + (this.field3815[var39] * var41) + 16383 >> 14;
                                            this.field3805[var39] = (short) (this.field3805[var39] * var41 + 16383 - (this.field3815[var39] * var40) >> 14);
                                            this.field3815[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class453.field5810[arg2];
                                            int var44 = class453.field5811[arg2];
                                            int var45 = this.field3805[var39] * var44 + 16383 - (this.field3794[var39] * var43) >> 14;
                                            this.field3794[var39] = (short) (this.field3805[var39] * var43 + this.field3794[var39] * var44 + 16383 >> 14);
                                            this.field3805[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class453.field5810[arg3];
                                            int var47 = class453.field5811[arg3];
                                            int var48 = this.field3815[var39] * var47 + this.field3794[var39] * var46 + 16383 >> 14;
                                            this.field3794[var39] = (short) (this.field3794[var39] * var47 + 16383 - (this.field3815[var39] * var46) >> 14);
                                            this.field3815[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method1767(55);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class491.field6488) {
                    int var68 = arg7[3] * class352.field4497 + arg7[6] * class378.field4786 + arg7[0] * class301.field3699 + 8192 >> 14;
                    int var69 = arg7[4] * class352.field4497 + (arg7[1] * class301.field3699 - (-(arg7[7] * class378.field4786) - 8192)) >> 14;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[2] * class301.field3699 + arg7[5] * class352.field4497 + (arg7[8] * class378.field4786) + 8192 >> 14;
                    class301.field3699 = var71;
                    class352.field4497 = var70;
                    int var73 = var67 + var72;
                    class491.field6488 = false;
                    class378.field4786 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class453.field5811[arg2];
                int var76 = class453.field5810[arg2];
                int var77 = class453.field5811[arg3];
                int var78 = class453.field5810[arg3];
                int var79 = class453.field5811[arg4];
                int var80 = class453.field5810[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[5] = -var76;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[0] = var78 * var82 + var77 * var79 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[1] = -var77 * var80 + (var78 * var81) + 8192 >> 14;
                int var83 = var74[0] * -class301.field3699 + (var74[1] * -class352.field4497) + (var74[2] * -class378.field4786) + 8192 >> 14;
                int var84 = var74[3] * -class301.field3699 - (-(var74[4] * -class352.field4497) - (var74[5] * -class378.field4786) - 8192) >> 14;
                int var85 = var74[7] * -class352.field4497 + var74[6] * -class301.field3699 - (-(var74[8] * -class378.field4786) + -8192) >> 14;
                int var86 = var83 + class301.field3699;
                int var87 = var84 + class352.field4497;
                int var88 = class378.field4786 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[1] * var66 + (var74[0] * var65 + (var74[2] * var67)) + 8192 >> 14;
                int var92 = var74[5] * var67 + var74[4] * var66 + var74[3] * var65 + 8192 >> 14;
                int var93 = var86 + var91;
                int var94 = var87 + var92;
                int var95 = var74[7] * var66 + (var74[6] * var65 + (var74[8] * var67)) + 8192 >> 14;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[0] * var93 + arg7[2] * var96 + arg7[1] * var94 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[3] * var93 + arg7[4] * var94 + 8192 >> 14;
                int var101 = var62 + var99;
                int var102 = var63 + var100;
                int var103 = arg7[6] * var93 + (arg7[7] * var94) + (arg7[8] * var96) + 8192 >> 14;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field3836.length > var106) {
                        int[] var107 = this.field3836[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field3872 == null || (arg6 & this.field3872[var109]) != 0) {
                                int var110 = this.field3871[var109] * var97[1] + this.field3844[var109] * var97[2] + this.field3809[var109] * var97[0] + 8192 >> 14;
                                int var111 = this.field3871[var109] * var97[4] + this.field3809[var109] * var97[3] + (this.field3844[var109] * var97[5]) + 8192 >> 14;
                                int var112 = var102 + var111;
                                int var113 = this.field3809[var109] * var97[6] + 8192 - (-(this.field3871[var109] * var97[7]) - (this.field3844[var109] * var97[8])) >> 14;
                                int var114 = var101 + var110;
                                int var115 = var104 + var113;
                                this.field3809[var109] = var114;
                                this.field3871[var109] = var112;
                                this.field3844[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field3836.length) {
                        int[] var124 = this.field3836[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field3872 == null || (this.field3872[var126] & arg6) != 0) {
                                this.field3809[var126] -= class301.field3699;
                                this.field3871[var126] -= class352.field4497;
                                this.field3844[var126] -= class378.field4786;
                                this.field3809[var126] = this.field3809[var126] * arg2 >> 7;
                                this.field3871[var126] = this.field3871[var126] * arg3 >> 7;
                                this.field3844[var126] = this.field3844[var126] * arg4 >> 7;
                                this.field3809[var126] += class301.field3699;
                                this.field3871[var126] += class352.field4497;
                                this.field3844[var126] += class378.field4786;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class491.field6488) {
                    int var133 = arg7[0] * class301.field3699 + (arg7[3] * class352.field4497) - (-(arg7[6] * class378.field4786) + -8192) >> 14;
                    int var134 = arg7[1] * class301.field3699 + arg7[4] * class352.field4497 + arg7[7] * class378.field4786 + 8192 >> 14;
                    int var135 = arg7[2] * class301.field3699 + (arg7[5] * class352.field4497 + (arg7[8] * class378.field4786)) + 8192 >> 14;
                    int var136 = var131 + var134;
                    int var137 = var130 + var133;
                    int var138 = var132 + var135;
                    class301.field3699 = var137;
                    class352.field4497 = var136;
                    class378.field4786 = var138;
                    class491.field6488 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class301.field3699 * var139 + 8192 >> 14;
                int var143 = -class352.field4497 * var140 + 8192 >> 14;
                int var144 = -class378.field4786 * var141 + 8192 >> 14;
                int var145 = var142 + class301.field3699;
                int var146 = var143 + class352.field4497;
                int var147 = class378.field4786 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[0] * var153 + (arg7[1] * var152) + (arg7[2] * var154) + 8192 >> 14;
                int var158 = arg7[3] * var153 + 8192 - (-(arg7[4] * var152) - arg7[5] * var154) >> 14;
                int var159 = var128 + var158;
                int var160 = arg7[8] * var154 + arg7[6] * var153 - (-(arg7[7] * var152) + -8192) >> 14;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field3836.length > var164) {
                        int[] var165 = this.field3836[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field3872 == null || (arg6 & this.field3872[var167]) != 0) {
                                int var168 = this.field3809[var167] * var155[0] + (this.field3871[var167] * var155[1] - (-(this.field3844[var167] * var155[2]) - 8192)) >> 14;
                                int var169 = this.field3809[var167] * var155[3] + (this.field3871[var167] * var155[4]) - (-(this.field3844[var167] * var155[5]) - 8192) >> 14;
                                int var170 = var159 + var169;
                                int var171 = this.field3844[var167] * var155[8] + this.field3871[var167] * var155[7] + this.field3809[var167] * var155[6] + 8192 >> 14;
                                int var172 = var161 + var168;
                                this.field3809[var167] = var172;
                                int var173 = var162 + var171;
                                this.field3871[var167] = var170;
                                this.field3844[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3812 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (this.field3812.length > var182) {
                        int[] var183 = this.field3812[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field3816 == null || (this.field3816[var185] & arg6) != 0) {
                                int var186 = (this.field3826[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field3826[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field3804 != null) {
                        for (int var179 = 0; var179 < this.field3858; var179++) {
                            class602 var180 = this.field3804[var179];
                            class576 var181 = this.field3813[var179];
                            var181.field8050 = var181.field8050 & 0xFFFFFF | 255 - (this.field3826[var180.field8473] & 0xFF) << 24;
                        }
                    }
                    this.method1756(false);
                }
            }
        } else if (arg0 == 7) {
            if (this.field3812 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (var192 < this.field3812.length) {
                        int[] var193 = this.field3812[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field3816 == null || (this.field3816[var195] & arg6) != 0) {
                                int var196 = this.field3893[var195] & 0xFFFF;
                                int var197 = var196 >> 10 & 0x3F;
                                int var198 = var196 >> 7 & 0x7;
                                int var199 = var196 & 0x7F;
                                int var200 = arg2 + var197 & 0x3F;
                                int var201 = arg3 / 4 + var198;
                                if (var201 < 0) {
                                    var201 = 0;
                                } else if (var201 > 7) {
                                    var201 = 7;
                                }
                                int var202 = arg4 + var199;
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field3893[var195] = (short) class444.method2376(class444.method2376(var200 << 10, var201 << 7), var202);
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field3804 != null) {
                        for (int var189 = 0; var189 < this.field3858; var189++) {
                            class602 var190 = this.field3804[var189];
                            class576 var191 = this.field3813[var189];
                            var191.field8050 = var191.field8050 & 0xFF000000 | class344.field4422[this.field3893[var190.field8473] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method1756(false);
                }
            }
        } else if (arg0 == 8) {
            if (this.field3784 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field3784.length) {
                        int[] var205 = this.field3784[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class576 var207 = this.field3813[var205[var206]];
                            var207.field8043 += arg3;
                            var207.field8046 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3784 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (this.field3784.length > var209) {
                        int[] var210 = this.field3784[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class576 var212 = this.field3813[var210[var211]];
                            var212.field8052 = var212.field8052 * arg2 >> 7;
                            var212.field8042 = var212.field8042 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3784 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (this.field3784.length > var214) {
                    int[] var215 = this.field3784[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class576 var217 = this.field3813[var215[var216]];
                        var217.field8051 = var217.field8051 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 1192)
    private final void method1753(int arg0) {
        field3790++;
        if (!this.field3894) {
            return;
        }
        this.field3894 = false;
        if (arg0 >= -51) {
            return;
        }
        if (this.field3837 == null && this.field3782 == null && this.field3804 == null) {
            if (this.field3809 != null && !class354.method1942(this.field3818, this.field3876, -67)) {
                if (this.field3799 == null || this.field3799.method689((byte) -61)) {
                    if (!this.field3810) {
                        this.method1762(false);
                    }
                    this.field3809 = null;
                } else {
                    this.field3894 = true;
                }
            }
            if (this.field3871 != null && !class693.method3909(false, this.field3818, this.field3876)) {
                if (this.field3799 == null || this.field3799.method689((byte) 21)) {
                    if (!this.field3810) {
                        this.method1762(false);
                    }
                    this.field3871 = null;
                } else {
                    this.field3894 = true;
                }
            }
            if (this.field3844 != null && !class352.method1935((byte) -55, this.field3818, this.field3876)) {
                if (this.field3799 == null || this.field3799.method689((byte) 1)) {
                    if (!this.field3810) {
                        this.method1762(false);
                    }
                    this.field3844 = null;
                } else {
                    this.field3894 = true;
                }
            }
        }
        if (this.field3827 != null && this.field3809 == null && this.field3871 == null && this.field3844 == null) {
            this.field3827 = null;
            this.field3796 = null;
        }
        if (this.field3879 != null && !class483.method2627(false, this.field3876, this.field3818)) {
            label204: {
                label203: {
                    boolean var10000;
                    if ((this.field3876 & 0x37) == 0) {
                        if (this.field3800 == null || this.field3800.method689((byte) 123)) {
                            break label203;
                        }
                        var10000 = false;
                    } else {
                        if (this.field3867 == null || this.field3867.method689((byte) -40)) {
                            break label203;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field3894 = true;
                        break label204;
                    }
                }
                this.field3815 = this.field3805 = this.field3794 = null;
                this.field3879 = null;
            }
        }
        if (this.field3893 != null && !class148.method858(-29773, this.field3818, this.field3876)) {
            if (this.field3800 == null || this.field3800.method689((byte) 120)) {
                this.field3893 = null;
            } else {
                this.field3894 = true;
            }
        }
        if (this.field3826 != null && !class668.method3750(this.field3818, 85, this.field3876)) {
            if (this.field3800 == null || this.field3800.method689((byte) -14)) {
                this.field3826 = null;
            } else {
                this.field3894 = true;
            }
        }
        if (this.field3846 != null && !class186.method1148(-998559250, this.field3818, this.field3876)) {
            if (this.field3834 == null || this.field3834.method689((byte) 123)) {
                this.field3846 = this.field3797 = null;
            } else {
                this.field3894 = true;
            }
        }
        if (this.field3863 != null && !class593.method3264(this.field3818, 107, this.field3876)) {
            if (this.field3800 == null || this.field3800.method689((byte) 127)) {
                this.field3863 = null;
            } else {
                this.field3894 = true;
            }
        }
        if (this.field3811 != null && !class226.method1357(this.field3818, 25728, this.field3876)) {
            if ((this.field3897 == null || this.field3897.method2080(61)) && (this.field3800 == null || this.field3800.method689((byte) -90))) {
                this.field3811 = this.field3803 = this.field3880 = null;
            } else {
                this.field3894 = true;
            }
        }
        if (this.field3785 != null) {
            if (this.field3799 == null || this.field3799.method689((byte) 122)) {
                this.field3785 = null;
            } else {
                this.field3894 = true;
            }
        }
        if (this.field3817 != null) {
            if (this.field3800 == null || this.field3800.method689((byte) -81)) {
                this.field3817 = null;
            } else {
                this.field3894 = true;
            }
        }
        if (this.field3812 != null && !class271.method1559(64, this.field3876, this.field3818)) {
            this.field3816 = null;
            this.field3812 = null;
        }
        if (this.field3836 != null && !class225.method1353(this.field3876, false, this.field3818)) {
            this.field3872 = null;
            this.field3836 = null;
        }
        if (this.field3784 != null && !class273.method1567(this.field3818, 1024, this.field3876)) {
            this.field3784 = null;
        }
        if (this.field3833 != null && (this.field3818 & 0x800) == 0 && (this.field3818 & 0x40000) == 0) {
            this.field3881 = null;
            this.field3873 = null;
            this.field3833 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "RA", descriptor = "()I", line = 1376)
    public final int method704() {
        if (!this.field3810) {
            this.method1762(false);
        }
        field3859++;
        return this.field3781;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 1393)
    public static final void method1754(int arg0) {
        field3821++;
        class337.field4338.method1054(((float) class301.field3698.field6649 * 0.1F + 0.7F) * 1.1523438F);
        class337.field4338.method994(class130.field1620, 0.69921875F, 1.2F, -200.0F, (float) arg0, -200.0F);
        class337.field4338.method1075(class317.field4065, -1, 0);
        class337.field4338.method980(class474.field6009);
    }

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "()I", line = 1411)
    public final int method692() {
        field3869++;
        if (!this.field3810) {
            this.method1762(false);
        }
        return this.field3851;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)Z", line = 1424)
    private final boolean method1755(int arg0) {
        field3886++;
        if (this.field3897.field4866) {
            return true;
        }
        if (this.field3897.field4870 == null) {
            this.field3897.field4870 = this.field3849.method1680(this.field3887, 16);
        }
        class666 var2 = this.field3897.field4870;
        if (arg0 < 73) {
            return true;
        }
        var2.method619(27209, this.field3798 * 6);
        Buffer var3 = var2.method1486((byte) -88, true);
        if (var3 != null) {
            Stream var4 = this.field3849.method2573(var3, 110);
            if (Stream.method3420()) {
                for (int var6 = 0; var6 < this.field3798; var6++) {
                    var4.method3422(this.field3811[var6]);
                    var4.method3422(this.field3803[var6]);
                    var4.method3422(this.field3880[var6]);
                }
            } else {
                for (int var5 = 0; var5 < this.field3798; var5++) {
                    var4.method3430(this.field3811[var5]);
                    var4.method3430(this.field3803[var5]);
                    var4.method3430(this.field3880[var5]);
                }
            }
            var4.method3424();
            if (var2.method1485((byte) 62)) {
                this.field3897.field4868 = var2;
                this.field3894 = true;
                this.field3897.field4866 = true;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V", line = 1493)
    private final void method1756(boolean arg0) {
        if (arg0) {
            this.method692();
        }
        field3860++;
        if (this.field3800 != null) {
            this.field3800.field1626 = false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "()I", line = 1510)
    public final int method727() {
        field3838++;
        if (!this.field3810) {
            this.method1762(false);
        }
        return this.field3841;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIFJLeg;IIFIII)S", line = 1522)
    private final short method1757(int arg0, int arg1, float arg2, long arg3, class47 arg4, int arg5, int arg6, float arg7, int arg8, int arg9, int arg10) {
        field3819++;
        if (arg8 != -5073) {
            this.method1753(34);
        }
        int var13 = this.field3796[arg6];
        int var14 = this.field3796[arg6 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field3827[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class362.field4607[var16] == arg3) {
                return (short) (var17 - 1);
            }
        }
        this.field3827[var15] = (short) (this.field3825 + 1);
        class362.field4607[var15] = arg3;
        this.field3817[this.field3825] = (short) arg9;
        this.field3785[this.field3825] = (short) arg6;
        this.field3815[this.field3825] = (short) arg0;
        this.field3805[this.field3825] = (short) arg5;
        this.field3794[this.field3825] = (short) arg10;
        this.field3879[this.field3825] = (byte) arg1;
        this.field3846[this.field3825] = arg2;
        this.field3797[this.field3825] = arg7;
        return (short) (this.field3825++);
    }

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "()I", line = 1575)
    public final int method703() {
        field3835++;
        if (!this.field3810) {
            this.method1762(false);
        }
        return this.field3845;
    }

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "(III)V", line = 1586)
    public final void method746(int arg0, int arg1, int arg2) {
        field3888++;
        for (int var4 = 0; var4 < this.field3839; var4++) {
            if (arg0 != 128) {
                this.field3809[var4] = this.field3809[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3871[var4] = this.field3871[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3844[var4] = this.field3844[var4] * arg2 >> 7;
            }
        }
        this.method1758((byte) 112);
        this.field3810 = false;
    }

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "()V", line = 1616)
    public final void method749() {
        field3847++;
        for (int var1 = 0; var1 < this.field3807; var1++) {
            this.field3809[var1] = this.field3809[var1] + 7 >> 4;
            this.field3871[var1] = this.field3871[var1] + 7 >> 4;
            this.field3844[var1] = this.field3844[var1] + 7 >> 4;
        }
        this.method1758((byte) 112);
        this.field3810 = false;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V", line = 1639)
    private final void method1758(byte arg0) {
        if (this.field3799 != null) {
            this.field3799.field1626 = false;
        }
        if (arg0 != 112) {
            this.field3845 = 107;
        }
        field3870++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILq;Z)Z", line = 1652)
    public final boolean method744(int arg0, int arg1, class491 arg2, boolean arg3) {
        field3874++;
        return this.method1768(-1, arg1, arg3, arg2, arg0, -103);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)Z", line = 1663)
    private final boolean method1759(boolean arg0) {
        field3854++;
        boolean var2 = !this.field3800.field1626;
        boolean var3 = (this.field3876 & 0x37) != 0 && !this.field3867.field1626;
        boolean var4 = !this.field3799.field1626;
        boolean var5 = !this.field3834.field1626;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        if (arg0) {
            this.method1755(-65);
        }
        boolean var6 = true;
        if (var4) {
            if (this.field3799.field1627 == null) {
                this.field3799.field1627 = this.field3849.method1716(false, this.field3887);
            }
            class401 var7 = this.field3799.field1627;
            var7.method324(-58, 12, this.field3825 * 12);
            Buffer var8 = var7.method325(true, 32726);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field3849.field6128.copyPositions(this.field3809, this.field3871, this.field3844, this.field3785, 0, 12, this.field3825, var8.getAddress());
                if (var7.method322(105)) {
                    this.field3799.field1632 = var7;
                    this.field3799.field1626 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field3800.field1627 == null) {
                this.field3800.field1627 = this.field3849.method1716(arg0, this.field3887);
            }
            class401 var9 = this.field3800.field1627;
            var9.method324(-110, 4, this.field3825 * 4);
            Buffer var10 = var9.method325(true, 32726);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field3876 & 0x37) == 0) {
                    short[] var11;
                    short[] var12;
                    short[] var13;
                    byte[] var14;
                    if (this.field3786 == null) {
                        var12 = this.field3815;
                        var13 = this.field3794;
                        var14 = this.field3879;
                        var11 = this.field3805;
                    } else {
                        var11 = this.field3786.field4842;
                        var12 = this.field3786.field4838;
                        var13 = this.field3786.field4840;
                        var14 = this.field3786.field4839;
                    }
                    this.field3849.field6128.copyLighting(this.field3893, this.field3826, this.field3863, var12, var11, var13, var14, this.field3852, this.field3823, this.field3817, 0, 4, this.field3825, var10.getAddress());
                } else {
                    this.field3849.field6128.copyColours(this.field3893, this.field3826, this.field3863, this.field3852, this.field3817, 0, 4, this.field3825, var10.getAddress());
                }
                if (var9.method322(47)) {
                    this.field3800.field1632 = var9;
                    this.field3800.field1626 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field3867.field1627 == null) {
                this.field3867.field1627 = this.field3849.method1716(arg0, this.field3887);
            }
            class401 var15 = this.field3867.field1627;
            var15.method324(-86, 12, this.field3825 * 12);
            Buffer var16 = var15.method325(true, 32726);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                byte[] var18;
                short[] var19;
                short[] var20;
                if (this.field3786 == null) {
                    var19 = this.field3805;
                    var18 = this.field3879;
                    var17 = this.field3815;
                    var20 = this.field3794;
                } else {
                    var17 = this.field3786.field4838;
                    var18 = this.field3786.field4839;
                    var19 = this.field3786.field4842;
                    var20 = this.field3786.field4840;
                }
                this.field3849.field6128.copyNormals(var17, var19, var20, var18, 3.0F / (float) this.field3823, 3.0F / (float) (this.field3823 / 2 + this.field3823), 0, 12, this.field3825, var16.getAddress());
                if (var15.method322(93)) {
                    this.field3867.field1632 = var15;
                    this.field3867.field1626 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field3834.field1627 == null) {
                this.field3834.field1627 = this.field3849.method1716(false, this.field3887);
            }
            class401 var21 = this.field3834.field1627;
            var21.method324(-78, 8, this.field3825 * 8);
            Buffer var22 = var21.method325(true, 32726);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field3849.field6128.copyTexCoords(this.field3846, this.field3797, 0, 8, this.field3825, var22.getAddress());
                if (var21.method322(52)) {
                    this.field3834.field1632 = var21;
                    this.field3834.field1626 = true;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lq;Lpba;I)V", line = 1853)
    public final void method717(class491 arg0, class151 arg1, int arg2) {
        field3889++;
        if (this.field3825 == 0) {
            return;
        }
        class691 var4 = this.field3849.field6234;
        if (!this.field3810) {
            this.method1762(false);
        }
        class691 var5 = (class691) arg0;
        class582.field8138 = var4.field9799 * var5.field9822 + var4.field9822 * var5.field9810 + var4.field9798 * var5.field9781;
        class223.field2790 = var4.field9799 * var5.field9795 + var4.field9822 * var5.field9780 + var4.field9798 * var5.field9791 + var4.field9795;
        float var6 = (float) this.field3883 * class582.field8138 + class223.field2790;
        float var7 = (float) this.field3845 * class582.field8138 + class223.field2790;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field3841 + var6;
            var9 = (float) (-this.field3841) + var7;
        } else {
            var9 = (float) (-this.field3841) + var6;
            var8 = (float) this.field3841 + var7;
        }
        if ((var9 >= this.field3849.field6270) || (var8 <= (float) this.field3849.field6318)) {
            return;
        }
        class417.field5248 = var4.field9823 * var5.field9795 + var4.field9803 * var5.field9791 + var4.field9781 * var5.field9780 + var4.field9791;
        class679.field9551 = var4.field9823 * var5.field9822 + var4.field9803 * var5.field9781 + var4.field9781 * var5.field9810;
        float var10 = (float) this.field3883 * class679.field9551 + class417.field5248;
        float var11 = (float) this.field3845 * class679.field9551 + class417.field5248;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field3841 + var10) * (float) this.field3849.field6240;
            var13 = (var11 - (float) this.field3841) * (float) this.field3849.field6240;
        } else {
            var12 = ((float) this.field3841 + var11) * (float) this.field3849.field6240;
            var13 = ((float) (-this.field3841) + var10) * (float) this.field3849.field6240;
        }
        if ((var13 / var8 >= this.field3849.field6271) || (var12 / var8 <= this.field3849.field6291)) {
            return;
        }
        class160.field2103 = var4.field9796 * var5.field9795 + var4.field9819 * var5.field9791 + var4.field9810 * var5.field9780 + var4.field9780;
        class82.field1099 = var4.field9796 * var5.field9822 + var4.field9819 * var5.field9781 + var4.field9810 * var5.field9810;
        float var14 = (float) this.field3883 * class82.field1099 + class160.field2103;
        float var15 = (float) this.field3845 * class82.field1099 + class160.field2103;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field3841 + var14) * (float) this.field3849.field6297;
            var16 = (var15 - (float) this.field3841) * (float) this.field3849.field6297;
        } else {
            var16 = ((float) (-this.field3841) + var14) * (float) this.field3849.field6297;
            var17 = ((float) this.field3841 + var15) * (float) this.field3849.field6297;
        }
        if ((var16 / var8 >= this.field3849.field6252) || (this.field3849.field6280 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field3804 != null) {
            class548.field7414 = var4.field9799 * var5.field9799 + var4.field9822 * var5.field9796 + var4.field9798 * var5.field9823;
            class348.field4456 = var4.field9796 * var5.field9799 + var4.field9819 * var5.field9823 + var4.field9810 * var5.field9796;
            class461.field5857 = var4.field9799 * var5.field9798 + var4.field9822 * var5.field9819 + var4.field9798 * var5.field9803;
            class434.field5436 = var4.field9823 * var5.field9798 + var4.field9803 * var5.field9803 + var4.field9781 * var5.field9819;
            class651.field9195 = var4.field9796 * var5.field9798 + var4.field9819 * var5.field9803 + var4.field9810 * var5.field9819;
            client.field9536 = var4.field9823 * var5.field9799 + var4.field9803 * var5.field9823 + var4.field9781 * var5.field9796;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3877 + this.field3793 >> 1;
            int var21 = this.field3851 + this.field3828 >> 1;
            int var22 = (int) ((float) var21 * client.field9536 + (float) this.field3883 * class679.field9551 + (float) var20 * class434.field5436 + class417.field5248);
            int var23 = (int) ((float) var21 * class348.field4456 + (float) this.field3883 * class82.field1099 + (float) var20 * class651.field9195 + class160.field2103);
            int var24 = (int) ((float) var21 * class548.field7414 + (float) this.field3883 * class582.field8138 + (float) var20 * class461.field5857 + class223.field2790);
            if (var24 < this.field3849.field6318) {
                var18 = true;
            } else {
                arg1.field1933 = this.field3849.field6240 * var22 / var24 + this.field3849.field6323;
                arg1.field1929 = this.field3849.field6266 + (this.field3849.field6297 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * client.field9536 + (float) this.field3845 * class679.field9551 + (float) var20 * class434.field5436 + class417.field5248);
            int var26 = (int) ((float) var21 * class348.field4456 + (float) this.field3845 * class82.field1099 + (float) var20 * class651.field9195 + class160.field2103);
            int var27 = (int) ((float) var21 * class548.field7414 + (float) this.field3845 * class582.field8138 + (float) var20 * class461.field5857 + class223.field2790);
            if (this.field3849.field6318 <= var27) {
                arg1.field1931 = this.field3849.field6297 * var26 / var27 + this.field3849.field6266;
                arg1.field1934 = this.field3849.field6240 * var25 / var27 + this.field3849.field6323;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field3849.field6318 && this.field3849.field6318 > var27) {
                    var19 = false;
                } else if (var24 < this.field3849.field6318) {
                    int var28 = (var27 - this.field3849.field6318 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field1933 = this.field3849.field6240 * var29 / this.field3849.field6318 + this.field3849.field6323;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field1929 = this.field3849.field6297 * var30 / this.field3849.field6318 + this.field3849.field6266;
                } else if (var27 < this.field3849.field6318) {
                    int var31 = (var24 - this.field3849.field6318 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field1933 = this.field3849.field6240 * var32 / this.field3849.field6318 + this.field3849.field6323;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field1929 = this.field3849.field6297 * var33 / this.field3849.field6318 + this.field3849.field6266;
                }
            }
            if (var19) {
                arg1.field1930 = true;
                if (var27 >= var24) {
                    arg1.field1932 = (this.field3841 + var25) * this.field3849.field6240 / var27 + this.field3849.field6323 - arg1.field1934;
                } else {
                    arg1.field1932 = (this.field3841 + var22) * this.field3849.field6240 / var24 + this.field3849.field6323 - arg1.field1933;
                }
            }
        }
        this.field3849.method2569(8);
        this.field3849.method2584(-16926, var5);
        this.method1764(29892);
        this.method1765(true);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 2049)
    public final void method726() {
        field3884++;
        if (this.field3825 > 0 && this.field3798 > 0) {
            this.method1759(false);
            this.method1755(124);
            this.method1753(-116);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Z", line = 2065)
    public final boolean method736() {
        field3795++;
        if (this.field3863 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3863.length; var1++) {
            if (this.field3863[var1] != -1 && !this.field3849.field7898.method2480(false, this.field3863[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[IIIIIZ)V", line = 2091)
    public final void method732(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3802++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class301.field3699 = 0;
            int var12 = 0;
            class378.field4786 = 0;
            class352.field4497 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field3836.length > var14) {
                    int[] var15 = this.field3836[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class301.field3699 += this.field3809[var17];
                        class352.field4497 += this.field3871[var17];
                        class378.field4786 += this.field3844[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class301.field3699 = class301.field3699 / var12 + var9;
                class378.field4786 = class378.field4786 / var12 + var10;
                class352.field4497 = class352.field4497 / var12 + var11;
            } else {
                class301.field3699 = var9;
                class352.field4497 = var11;
                class378.field4786 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field3836.length) {
                    int[] var23 = this.field3836[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3809[var25] += var18;
                        this.field3871[var25] += var20;
                        this.field3844[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field3836.length > var45) {
                    int[] var46 = this.field3836[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3809[var48] -= class301.field3699;
                            this.field3871[var48] -= class352.field4497;
                            this.field3844[var48] -= class378.field4786;
                            if (arg4 != 0) {
                                int var49 = class453.field5810[arg4];
                                int var50 = class453.field5811[arg4];
                                int var51 = this.field3809[var48] * var50 + (this.field3871[var48] * var49 + 16383) >> 14;
                                this.field3871[var48] = this.field3871[var48] * var50 + 16383 - (this.field3809[var48] * var49) >> 14;
                                this.field3809[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class453.field5810[arg2];
                                int var53 = class453.field5811[arg2];
                                int var54 = this.field3871[var48] * var53 + 16383 - (this.field3844[var48] * var52) >> 14;
                                this.field3844[var48] = this.field3871[var48] * var52 + (this.field3844[var48] * var53) + 16383 >> 14;
                                this.field3871[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class453.field5810[arg3];
                                int var56 = class453.field5811[arg3];
                                int var57 = this.field3844[var48] * var55 + this.field3809[var48] * var56 + 16383 >> 14;
                                this.field3844[var48] = this.field3844[var48] * var56 + 16383 - (this.field3809[var48] * var55) >> 14;
                                this.field3809[var48] = var57;
                            }
                            this.field3809[var48] += class301.field3699;
                            this.field3871[var48] += class352.field4497;
                            this.field3844[var48] += class378.field4786;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3809[var59] -= class301.field3699;
                            this.field3871[var59] -= class352.field4497;
                            this.field3844[var59] -= class378.field4786;
                            if (arg2 != 0) {
                                int var60 = class453.field5810[arg2];
                                int var61 = class453.field5811[arg2];
                                int var62 = this.field3871[var59] * var61 + 16383 - (this.field3844[var59] * var60) >> 14;
                                this.field3844[var59] = this.field3871[var59] * var60 - (-(this.field3844[var59] * var61) - 16383) >> 14;
                                this.field3871[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class453.field5810[arg4];
                                int var64 = class453.field5811[arg4];
                                int var65 = this.field3871[var59] * var63 + this.field3809[var59] * var64 + 16383 >> 14;
                                this.field3871[var59] = this.field3871[var59] * var64 + 16383 - (this.field3809[var59] * var63) >> 14;
                                this.field3809[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class453.field5810[arg3];
                                int var67 = class453.field5811[arg3];
                                int var68 = this.field3844[var59] * var66 + (this.field3809[var59] * var67) + 16383 >> 14;
                                this.field3844[var59] = this.field3844[var59] * var67 + 16383 - (this.field3809[var59] * var66) >> 14;
                                this.field3809[var59] = var68;
                            }
                            this.field3809[var59] += class301.field3699;
                            this.field3871[var59] += class352.field4497;
                            this.field3844[var59] += class378.field4786;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field3836.length > var28) {
                        int[] var29 = this.field3836[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3796[var31];
                            int var33 = this.field3796[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3827[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class453.field5810[arg4];
                                    int var37 = class453.field5811[arg4];
                                    int var38 = this.field3815[var35] * var37 + (this.field3805[var35] * var36 + 16383) >> 14;
                                    this.field3805[var35] = (short) (this.field3805[var35] * var37 + 16383 - (this.field3815[var35] * var36) >> 14);
                                    this.field3815[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class453.field5810[arg2];
                                    int var40 = class453.field5811[arg2];
                                    int var41 = this.field3805[var35] * var40 + 16383 - (this.field3794[var35] * var39) >> 14;
                                    this.field3794[var35] = (short) (this.field3805[var35] * var39 + this.field3794[var35] * var40 + 16383 >> 14);
                                    this.field3805[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class453.field5810[arg3];
                                    int var43 = class453.field5811[arg3];
                                    int var44 = this.field3815[var35] * var43 + this.field3794[var35] * var42 + 16383 >> 14;
                                    this.field3794[var35] = (short) (this.field3794[var35] * var43 + 16383 - (this.field3815[var35] * var42) >> 14);
                                    this.field3815[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method1767(55);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field3836.length) {
                    int[] var71 = this.field3836[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3809[var73] -= class301.field3699;
                        this.field3871[var73] -= class352.field4497;
                        this.field3844[var73] -= class378.field4786;
                        this.field3809[var73] = this.field3809[var73] * arg2 >> 7;
                        this.field3871[var73] = this.field3871[var73] * arg3 >> 7;
                        this.field3844[var73] = this.field3844[var73] * arg4 >> 7;
                        this.field3809[var73] += class301.field3699;
                        this.field3871[var73] += class352.field4497;
                        this.field3844[var73] += class378.field4786;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3812 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (this.field3812.length > var79) {
                        int[] var80 = this.field3812[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field3826[var82] & 0xFF) + (arg2 * 8);
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field3826[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field3804 != null) {
                        for (int var76 = 0; var76 < this.field3858; var76++) {
                            class602 var77 = this.field3804[var76];
                            class576 var78 = this.field3813[var76];
                            var78.field8050 = var78.field8050 & 0xFFFFFF | 255 - (this.field3826[var77.field8473] & 0xFF) << 24;
                        }
                    }
                    this.method1756(false);
                }
            }
        } else if (arg0 == 7) {
            if (this.field3812 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (this.field3812.length > var89) {
                        int[] var90 = this.field3812[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field3893[var92] & 0xFFFF;
                            int var94 = (var93 & 0xFC47) >> 10;
                            int var95 = var93 >> 7 & 0x7;
                            int var96 = arg3 / 4 + var95;
                            int var97 = arg2 + var94 & 0x3F;
                            int var98 = var93 & 0x7F;
                            int var99 = arg4 + var98;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field3893[var92] = (short) class444.method2376(class444.method2376(var96 << 7, var97 << 10), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field3804 != null) {
                        for (int var86 = 0; var86 < this.field3858; var86++) {
                            class602 var87 = this.field3804[var86];
                            class576 var88 = this.field3813[var86];
                            var88.field8050 = class344.field4422[this.field3893[var87.field8473] & 0xFFFF] & 0xFFFFFF | var88.field8050 & 0xFF000000;
                        }
                    }
                    this.method1756(false);
                }
            }
        } else if (arg0 == 8) {
            if (this.field3784 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field3784.length) {
                        int[] var102 = this.field3784[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class576 var104 = this.field3813[var102[var103]];
                            var104.field8043 += arg3;
                            var104.field8046 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3784 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (this.field3784.length > var106) {
                        int[] var107 = this.field3784[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class576 var109 = this.field3813[var107[var108]];
                            var109.field8052 = var109.field8052 * arg2 >> 7;
                            var109.field8042 = var109.field8042 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3784 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (this.field3784.length > var111) {
                    int[] var112 = this.field3784[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class576 var114 = this.field3813[var112[var113]];
                        var114.field8051 = var114.field8051 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "()I", line = 2753)
    public final int method699() {
        field3789++;
        if (!this.field3810) {
            this.method1762(false);
        }
        return this.field3877;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()V", line = 2764)
    public final void method739() {
        field3885++;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Len;IIZZ)V", line = 6336)
    public class306(class478 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field3810 = false;
        this.field3831 = false;
        this.field3807 = 0;
        this.field3839 = 0;
        this.field3825 = 0;
        this.field3887 = false;
        this.field3882 = 0;
        this.field3798 = 0;
        this.field3894 = true;
        this.field3818 = arg1;
        this.field3876 = arg2;
        this.field3887 = arg4;
        this.field3849 = arg0;
        if (arg3 || class425.method2256(this.field3876, (byte) 92, this.field3818)) {
            this.field3799 = new class131(class127.method678(68, this.field3818, this.field3876));
        }
        if (arg3 || class639.method3578(this.field3876, this.field3818, -95)) {
            this.field3834 = new class131(class105.method593(this.field3876, this.field3818, true));
        }
        if (arg3 || class7.method55((byte) 114, this.field3876, this.field3818)) {
            this.field3800 = new class131(class638.method3573(3, this.field3818, this.field3876));
        }
        if (arg3 || class131.method688(this.field3818, 0, this.field3876)) {
            this.field3867 = new class131(class124.method661(this.field3876, this.field3818, -128));
        }
        if (arg3 || class631.method3531(this.field3818, 0, this.field3876)) {
            this.field3897 = new class387(class182.method1136(128, this.field3818, this.field3876));
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lok;B)V", line = 2776)
    private final void method1760(class100 arg0, byte arg1) {
        if (this.field3825 > class635.field8919.length) {
            class184.field2346 = new int[this.field3825];
            class635.field8919 = new int[this.field3825];
        }
        field3791++;
        for (int var3 = 0; var3 < this.field3839; var3++) {
            int var14 = (this.field3809[var3] - (this.field3871[var3] * this.field3849.field6301 >> 8) >> this.field3849.field6241) - arg0.field1349;
            int var15 = (this.field3844[var3] - (this.field3871[var3] * this.field3849.field6282 >> 8) >> this.field3849.field6241) - arg0.field1352;
            int var16 = this.field3796[var3];
            int var17 = this.field3796[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field3827[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class635.field8919[var19] = var14;
                class184.field2346[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field3798; var4++) {
            if (this.field3826 == null || this.field3826[var4] <= 128) {
                short var5 = this.field3811[var4];
                short var6 = this.field3803[var4];
                short var7 = this.field3880[var4];
                int var8 = class635.field8919[var5];
                int var9 = class635.field8919[var6];
                int var10 = class635.field8919[var7];
                int var11 = class184.field2346[var5];
                int var12 = class184.field2346[var6];
                int var13 = class184.field2346[var7];
                if ((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11)) > 0) {
                    arg0.method572(var10, -3417, var11, var13, var8, var9, var12);
                }
            }
        }
        if (arg1 <= 41) {
            this.field3837 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(Z)V", line = 2862)
    private final void method1761(boolean arg0) {
        if (this.field3897 != null) {
            this.field3897.field4866 = false;
        }
        if (arg0) {
            this.method1758((byte) 113);
        }
        field3843++;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(Z)V", line = 2877)
    private final void method1762(boolean arg0) {
        field3861++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        if (arg0) {
            this.field3781 = 20;
        }
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3839; var10++) {
            int var11 = this.field3809[var10];
            int var12 = this.field3871[var10];
            int var13 = this.field3844[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field3845 = var6;
        this.field3793 = var2;
        this.field3877 = var5;
        this.field3828 = var4;
        this.field3883 = var3;
        this.field3851 = var7;
        this.field3841 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field3781 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field3810 = true;
    }

    @OriginalMember(owner = "client!ja", name = "MA", descriptor = "(I)V", line = 2962)
    public final void method762(int arg0) {
        field3830++;
        int var2 = class453.field5810[arg0];
        int var3 = class453.field5811[arg0];
        for (int var4 = 0; var4 < this.field3839; var4++) {
            int var5 = this.field3871[var4] * var3 - (this.field3844[var4] * var2) >> 14;
            this.field3844[var4] = this.field3871[var4] * var2 + (this.field3844[var4] * var3) >> 14;
            this.field3871[var4] = var5;
        }
        this.method1758((byte) 112);
        this.field3810 = false;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILq;ZI)Z", line = 2991)
    public final boolean method738(int arg0, int arg1, class491 arg2, boolean arg3, int arg4) {
        field3783++;
        return this.method1768(arg4, arg1, arg3, arg2, arg0, -118);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lda;IIIZ)V", line = 2999)
    public final void method725(class474 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3853++;
        class306 var6 = (class306) arg0;
        if (this.field3882 == 0 || var6.field3882 == 0) {
            return;
        }
        int var7 = var6.field3839;
        int[] var8 = var6.field3809;
        int[] var9 = var6.field3871;
        int[] var10 = var6.field3844;
        short[] var11 = var6.field3815;
        short[] var12 = var6.field3805;
        short[] var13 = var6.field3794;
        byte[] var14 = var6.field3879;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3786 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var17 = this.field3786.field4838;
            var16 = this.field3786.field4840;
            var18 = this.field3786.field4842;
            var15 = this.field3786.field4839;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3786 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field3786.field4839;
            var19 = var6.field3786.field4842;
            var21 = var6.field3786.field4838;
            var22 = var6.field3786.field4840;
        }
        int[] var23 = var6.field3796;
        short[] var24 = var6.field3827;
        if (!var6.field3810) {
            var6.method1762(false);
        }
        int var25 = var6.field3883;
        int var26 = var6.field3845;
        int var27 = var6.field3793;
        int var28 = var6.field3877;
        int var29 = var6.field3828;
        int var30 = var6.field3851;
        for (int var31 = 0; var31 < this.field3839; var31++) {
            int var32 = this.field3871[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field3809[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field3844[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field3796[var31];
                        int var37 = this.field3796[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3827[var38] - 1;
                            if (var35 == -1 || this.field3879[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = var23[var39 + 1];
                                    int var42 = -1;
                                    for (int var43 = var40; var43 < var41; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var17 == null) {
                                            this.field3786 = new class384();
                                            var17 = this.field3786.field4838 = class5.method40(0, this.field3815);
                                            var18 = this.field3786.field4842 = class5.method40(0, this.field3805);
                                            var16 = this.field3786.field4840 = class5.method40(0, this.field3794);
                                            var15 = this.field3786.field4839 = class252.method1478(true, this.field3879);
                                        }
                                        if (var21 == null) {
                                            class384 var44 = var6.field3786 = new class384();
                                            var21 = var44.field4838 = class5.method40(0, var11);
                                            var19 = var44.field4842 = class5.method40(0, var12);
                                            var22 = var44.field4840 = class5.method40(0, var13);
                                            var20 = var44.field4839 = class252.method1478(true, var14);
                                        }
                                        short var45 = this.field3815[var35];
                                        short var46 = this.field3805[var35];
                                        short var47 = this.field3794[var35];
                                        byte var48 = this.field3879[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var21[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field3796[var31];
                                        short var54 = var12[var42];
                                        int var55 = this.field3796[var31 + 1];
                                        byte var56 = var14[var42];
                                        short var57 = var11[var42];
                                        short var58 = var13[var42];
                                        for (int var59 = var53; var59 < var55; var59++) {
                                            int var60 = this.field3827[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var57;
                                                var18[var60] += var54;
                                                var16[var60] += var58;
                                                var15[var60] += var56;
                                            }
                                        }
                                        var6.method1767(55);
                                        this.method1767(55);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lja;Lja;ZIIZ)Lda;", line = 3254)
    private final class474 method1763(class306 arg0, class306 arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        arg0.field3823 = this.field3823;
        arg0.field3839 = this.field3839;
        field3792++;
        if ((arg3 & 0x100) == 0) {
            arg0.field3831 = this.field3831;
        } else {
            arg0.field3831 = true;
        }
        arg0.field3807 = this.field3807;
        arg0.field3876 = this.field3876;
        arg0.field3882 = this.field3882;
        arg0.field3798 = this.field3798;
        arg0.field3825 = this.field3825;
        arg0.field3852 = this.field3852;
        arg0.field3858 = this.field3858;
        if (arg4 < 107) {
            this.field3839 = -52;
        }
        arg0.field3818 = arg3;
        boolean var7 = class58.method365(this.field3876, arg3, false);
        boolean var8 = class368.method2014(arg3, 1, this.field3876);
        boolean var9 = class290.method1630((byte) 87, this.field3876, arg3);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg0.field3809 = this.field3809;
            } else if (arg1.field3809 == null || this.field3807 > arg1.field3809.length) {
                arg0.field3809 = arg1.field3809 = new int[this.field3807];
            } else {
                arg0.field3809 = arg1.field3809;
            }
            if (!var8) {
                arg0.field3871 = this.field3871;
            } else if (arg1.field3871 == null || this.field3807 > arg1.field3871.length) {
                arg0.field3871 = arg1.field3871 = new int[this.field3807];
            } else {
                arg0.field3871 = arg1.field3871;
            }
            if (!var9) {
                arg0.field3844 = this.field3844;
            } else if (arg1.field3844 == null || this.field3807 > arg1.field3844.length) {
                arg0.field3844 = arg1.field3844 = new int[this.field3807];
            } else {
                arg0.field3844 = arg1.field3844;
            }
            for (int var11 = 0; var11 < this.field3807; var11++) {
                if (var7) {
                    arg0.field3809[var11] = this.field3809[var11];
                }
                if (var8) {
                    arg0.field3871[var11] = this.field3871[var11];
                }
                if (var9) {
                    arg0.field3844[var11] = this.field3844[var11];
                }
            }
        } else {
            arg0.field3871 = this.field3871;
            arg0.field3809 = this.field3809;
            arg0.field3844 = this.field3844;
        }
        if (class127.method678(68, arg3, this.field3876)) {
            arg0.field3799 = arg1.field3799;
            arg0.field3799.field1626 = this.field3799.field1626;
            arg0.field3799.field1632 = this.field3799.field1632;
            arg0.field3799.field1633 = true;
        } else if (class425.method2256(this.field3876, (byte) 92, arg3)) {
            arg0.field3799 = this.field3799;
        } else {
            arg0.field3799 = null;
        }
        if (class512.method2767((byte) 46, this.field3876, arg3)) {
            if (arg1.field3893 == null || this.field3882 > arg1.field3893.length) {
                arg0.field3893 = arg1.field3893 = new short[this.field3882];
            } else {
                arg0.field3893 = arg1.field3893;
            }
            for (int var12 = 0; var12 < this.field3882; var12++) {
                arg0.field3893[var12] = this.field3893[var12];
            }
        } else {
            arg0.field3893 = this.field3893;
        }
        if (class532.method2887(arg3, this.field3876, (byte) 36)) {
            if (arg1.field3826 == null || this.field3882 > arg1.field3826.length) {
                arg0.field3826 = arg1.field3826 = new byte[this.field3882];
            } else {
                arg0.field3826 = arg1.field3826;
            }
            for (int var13 = 0; var13 < this.field3882; var13++) {
                arg0.field3826[var13] = this.field3826[var13];
            }
        } else {
            arg0.field3826 = this.field3826;
        }
        if (class638.method3573(3, arg3, this.field3876)) {
            arg0.field3800 = arg1.field3800;
            arg0.field3800.field1626 = this.field3800.field1626;
            arg0.field3800.field1632 = this.field3800.field1632;
            arg0.field3800.field1633 = true;
        } else if (class7.method55((byte) 77, this.field3876, arg3)) {
            arg0.field3800 = this.field3800;
        } else {
            arg0.field3800 = null;
        }
        if (class177.method1122(this.field3876, -545, arg3)) {
            if (arg1.field3815 == null || this.field3825 > arg1.field3815.length) {
                int var14 = this.field3825;
                arg0.field3805 = arg1.field3805 = new short[var14];
                arg0.field3815 = arg1.field3815 = new short[var14];
                arg0.field3794 = arg1.field3794 = new short[var14];
            } else {
                arg0.field3815 = arg1.field3815;
                arg0.field3794 = arg1.field3794;
                arg0.field3805 = arg1.field3805;
            }
            if (this.field3786 == null) {
                arg0.field3786 = null;
                for (int var15 = 0; var15 < this.field3825; var15++) {
                    arg0.field3815[var15] = this.field3815[var15];
                    arg0.field3805[var15] = this.field3805[var15];
                    arg0.field3794[var15] = this.field3794[var15];
                }
            } else {
                if (arg1.field3786 == null) {
                    arg1.field3786 = new class384();
                }
                class384 var16 = arg0.field3786 = arg1.field3786;
                if (var16.field4838 == null || var16.field4838.length < this.field3825) {
                    int var17 = this.field3825;
                    var16.field4840 = new short[var17];
                    var16.field4842 = new short[var17];
                    var16.field4839 = new byte[var17];
                    var16.field4838 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field3825; var18++) {
                    arg0.field3815[var18] = this.field3815[var18];
                    arg0.field3805[var18] = this.field3805[var18];
                    arg0.field3794[var18] = this.field3794[var18];
                    var16.field4838[var18] = this.field3786.field4838[var18];
                    var16.field4842[var18] = this.field3786.field4842[var18];
                    var16.field4840[var18] = this.field3786.field4840[var18];
                    var16.field4839[var18] = this.field3786.field4839[var18];
                }
            }
            arg0.field3879 = this.field3879;
        } else {
            arg0.field3794 = this.field3794;
            arg0.field3879 = this.field3879;
            arg0.field3815 = this.field3815;
            arg0.field3786 = this.field3786;
            arg0.field3805 = this.field3805;
        }
        if (class124.method661(this.field3876, arg3, -128)) {
            arg0.field3867 = arg1.field3867;
            arg0.field3867.field1633 = true;
            arg0.field3867.field1632 = this.field3867.field1632;
            arg0.field3867.field1626 = this.field3867.field1626;
        } else if (class131.method688(arg3, 0, this.field3876)) {
            arg0.field3867 = this.field3867;
        } else {
            arg0.field3867 = null;
        }
        if (client.method3817((byte) 60, this.field3876, arg3)) {
            if (arg1.field3846 == null || this.field3882 > arg1.field3846.length) {
                int var19 = this.field3825;
                arg0.field3797 = arg1.field3797 = new float[var19];
                arg0.field3846 = arg1.field3846 = new float[var19];
            } else {
                arg0.field3846 = arg1.field3846;
                arg0.field3797 = arg1.field3797;
            }
            for (int var20 = 0; var20 < this.field3825; var20++) {
                arg0.field3846[var20] = this.field3846[var20];
                arg0.field3797[var20] = this.field3797[var20];
            }
        } else {
            arg0.field3846 = this.field3846;
            arg0.field3797 = this.field3797;
        }
        if (class105.method593(this.field3876, arg3, true)) {
            arg0.field3834 = arg1.field3834;
            arg0.field3834.field1626 = this.field3834.field1626;
            arg0.field3834.field1633 = true;
            arg0.field3834.field1632 = this.field3834.field1632;
        } else if (class639.method3578(this.field3876, arg3, -108)) {
            arg0.field3834 = this.field3834;
        } else {
            arg0.field3834 = null;
        }
        if (class346.method1920(arg3, (byte) -93, this.field3876)) {
            if (arg1.field3811 == null || arg1.field3811.length < this.field3882) {
                int var21 = this.field3882;
                arg0.field3880 = arg1.field3880 = new short[var21];
                arg0.field3803 = arg1.field3803 = new short[var21];
                arg0.field3811 = arg1.field3811 = new short[var21];
            } else {
                arg0.field3803 = arg1.field3803;
                arg0.field3811 = arg1.field3811;
                arg0.field3880 = arg1.field3880;
            }
            for (int var22 = 0; var22 < this.field3882; var22++) {
                arg0.field3811[var22] = this.field3811[var22];
                arg0.field3803[var22] = this.field3803[var22];
                arg0.field3880[var22] = this.field3880[var22];
            }
        } else {
            arg0.field3880 = this.field3880;
            arg0.field3811 = this.field3811;
            arg0.field3803 = this.field3803;
        }
        if (class182.method1136(128, arg3, this.field3876)) {
            arg0.field3897 = arg1.field3897;
            arg0.field3897.field4868 = this.field3897.field4868;
            arg0.field3897.field4871 = true;
            arg0.field3897.field4866 = this.field3897.field4866;
        } else if (class631.method3531(arg3, 0, this.field3876)) {
            arg0.field3897 = this.field3897;
        } else {
            arg0.field3897 = null;
        }
        if (class285.method1602((byte) 71, this.field3876, arg3)) {
            if (arg1.field3863 == null || arg1.field3863.length < this.field3882) {
                int var23 = this.field3882;
                arg0.field3863 = arg1.field3863 = new short[var23];
            } else {
                arg0.field3863 = arg1.field3863;
            }
            for (int var24 = 0; var24 < this.field3882; var24++) {
                arg0.field3863[var24] = this.field3863[var24];
            }
        } else {
            arg0.field3863 = this.field3863;
        }
        if (!class231.method1390(arg3, this.field3876, (byte) -36)) {
            arg0.field3813 = this.field3813;
        } else if (arg1.field3813 == null || arg1.field3813.length < this.field3858) {
            int var26 = this.field3858;
            arg0.field3813 = arg1.field3813 = new class576[var26];
            for (int var27 = 0; var27 < this.field3858; var27++) {
                arg0.field3813[var27] = this.field3813[var27].method3175(45);
            }
        } else {
            arg0.field3813 = arg1.field3813;
            for (int var25 = 0; var25 < this.field3858; var25++) {
                arg0.field3813[var25].method3179(this.field3813[var25], 255);
            }
        }
        arg0.field3784 = this.field3784;
        arg0.field3827 = this.field3827;
        arg0.field3873 = this.field3873;
        arg0.field3812 = this.field3812;
        arg0.field3785 = this.field3785;
        if (this.field3810) {
            arg0.field3851 = this.field3851;
            arg0.field3810 = true;
            arg0.field3793 = this.field3793;
            arg0.field3781 = this.field3781;
            arg0.field3877 = this.field3877;
            arg0.field3845 = this.field3845;
            arg0.field3841 = this.field3841;
            arg0.field3883 = this.field3883;
            arg0.field3828 = this.field3828;
        } else {
            arg0.field3810 = false;
        }
        arg0.field3817 = this.field3817;
        arg0.field3881 = this.field3881;
        arg0.field3796 = this.field3796;
        arg0.field3816 = this.field3816;
        arg0.field3837 = this.field3837;
        arg0.field3836 = this.field3836;
        arg0.field3804 = this.field3804;
        arg0.field3782 = this.field3782;
        arg0.field3872 = this.field3872;
        arg0.field3833 = this.field3833;
        return arg0;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 3714)
    private final void method1764(int arg0) {
        field3806++;
        if (arg0 != 29892) {
            this.method752(null);
        }
        if (this.field3798 == 0) {
            return;
        }
        if (this.method1759(false) && this.method1755(123)) {
            this.field3849.method1695((byte) -16, this.field3799.field1632, 0);
            this.field3849.method1695((byte) -16, this.field3800.field1632, 1);
            this.field3849.method1695((byte) -16, this.field3834.field1632, 2);
            boolean var2;
            if ((this.field3876 & 0x37) == 0) {
                this.field3849.method2535(false, 123);
                var2 = false;
                this.field3849.method1709(true, this.field3849.field6340);
            } else {
                var2 = true;
                this.field3849.method2535(true, arg0 - 29818);
                this.field3849.method1695((byte) -16, this.field3867.field1632, 3);
                this.field3849.method1709(true, this.field3849.field6352);
            }
            for (int var3 = 0; var3 < this.field3873.length; var3++) {
                int var4 = this.field3833[var3];
                int var5 = this.field3833[var3 + 1];
                int var6 = this.field3863[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field3849.method2526(0, var6, var2, true);
                this.field3849.method1700(this.field3881[var3], class365.field4648, var4 * 3, 12896, var5 - var4, this.field3873[var3], this.field3897.field4868);
            }
        }
        this.method1753(-94);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Len;Leg;IIII)V", line = 3775)
    public class306(class478 arg0, class47 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class526 var7 = arg0.field7898;
        int[] var8 = new int[arg1.field646];
        this.field3796 = new int[arg1.field625 + 1];
        for (int var9 = 0; var9 < arg1.field646; var9++) {
            if ((arg1.field660 == null || arg1.field660[var9] != 2) && (arg1.field641 == null || arg1.field641[var9] == -1 || !var7.method2486(arg1.field641[var9] & 0xFFFF, (byte) 86).field249)) {
                var8[this.field3882++] = var9;
                this.field3796[arg1.field654[var9]]++;
                this.field3796[arg1.field635[var9]]++;
                this.field3796[arg1.field614[var9]]++;
            }
        }
        this.field3798 = this.field3882;
        long[] var10 = new long[this.field3882];
        boolean var11 = (this.field3818 & 0x100) != 0;
        label505: for (int var12 = 0; var12 < this.field3882; var12++) {
            int var185 = var8[var12];
            class13 var186 = null;
            int var187 = 0;
            byte var188 = 0;
            byte var189 = 0;
            byte var190 = 0;
            if (arg1.field653 != null) {
                for (int var191 = 0; var191 < arg1.field653.length; var191++) {
                    class674 var192 = arg1.field653[var191];
                    if (var192.field9480 == var185) {
                        class177 var193 = class57.method361(var192.field9484, -102);
                        if (var193.field2287) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field3798--;
                            continue label505;
                        }
                    }
                }
            }
            short var194 = -1;
            if (arg1.field641 != null) {
                var194 = arg1.field641[var185];
                if (var194 != -1) {
                    var186 = var7.method2486(var194 & 0xFFFF, (byte) 86);
                    var189 = var186.field234;
                    var190 = var186.field248;
                }
            }
            boolean var195 = arg1.field626 != null && arg1.field626[var185] != 0 || var186 != null && !var186.field230 | var186.field244;
            if ((var11 || var195) && arg1.field636 != null) {
                var187 += arg1.field636[var185] << 17;
            }
            if (var195) {
                var187 += 65536;
            }
            int var196 = (var189 & 0xFF << 8) + var187;
            int var197 = (var190 & 0xFF) + var196;
            int var198 = (var194 & 0xFFFF << 16) + var188;
            int var199 = (var12 & 0xFFFF) + var198;
            var10[var12] = ((long) var197 << 32) + (long) var199;
            this.field3831 |= var195;
        }
        class12.method88((byte) 59, var10, var8);
        this.field3807 = arg1.field639;
        this.field3871 = arg1.field662;
        this.field3839 = arg1.field625;
        this.field3872 = arg1.field619;
        this.field3844 = arg1.field657;
        this.field3809 = arg1.field628;
        class351[] var13 = new class351[this.field3839];
        this.field3837 = arg1.field630;
        this.field3782 = arg1.field622;
        if (arg1.field653 != null) {
            this.field3858 = arg1.field653.length;
            this.field3813 = new class576[this.field3858];
            this.field3804 = new class602[this.field3858];
            for (int var14 = 0; var14 < this.field3858; var14++) {
                class674 var15 = arg1.field653[var14];
                class177 var16 = class57.method361(var15.field9484, -124);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3882; var18++) {
                    if (var8[var18] == var15.field9480) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class344.field4422[arg1.field665[var15.field9480] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field626 == null ? 0 : arg1.field626[var15.field9480]) << 24;
                this.field3804[var14] = new class602(var17, arg1.field654[var15.field9480], arg1.field635[var15.field9480], arg1.field614[var15.field9480], var16.field2290, var16.field2297, var16.field2292, var16.field2289, var16.field2296, var16.field2287, var16.field2285, var15.field9478);
                this.field3813[var14] = new class576(var20);
            }
        }
        int var21 = this.field3882 * 3;
        this.field3797 = new float[var21];
        this.field3846 = new float[var21];
        this.field3811 = new short[this.field3882];
        this.field3803 = new short[this.field3882];
        this.field3893 = new short[this.field3882];
        this.field3823 = (short) arg4;
        this.field3880 = new short[this.field3882];
        if (arg1.field642 != null) {
            this.field3816 = new short[this.field3882];
        }
        this.field3852 = (short) arg3;
        this.field3827 = new short[var21];
        this.field3863 = new short[this.field3882];
        this.field3817 = new short[var21];
        this.field3879 = new byte[var21];
        this.field3785 = new short[var21];
        this.field3815 = new short[var21];
        this.field3805 = new short[var21];
        class362.field4607 = new long[var21];
        this.field3794 = new short[var21];
        this.field3826 = new byte[this.field3882];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field625; var23++) {
            int var184 = this.field3796[var23];
            this.field3796[var23] = var22;
            var22 += var184;
            var13[var23] = new class351();
        }
        this.field3796[arg1.field625] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field618 != null) {
            int var28 = arg1.field651;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field3882; var36++) {
                int var43 = var8[var36];
                if (arg1.field618[var43] != -1) {
                    int var44 = arg1.field618[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field654[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field635[var43];
                        } else {
                            var46 = arg1.field614[var43];
                        }
                        int var47 = arg1.field628[var46];
                        int var48 = arg1.field662[var46];
                        int var49 = arg1.field657[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var25 = new int[var28];
            var24 = new int[var28];
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field645[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field658[var37];
                        var40 = 64.0F / (float) arg1.field623[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 <= 0) {
                            var41 = 1.0F;
                            var42 = (float) (-var39) / 1024.0F;
                        } else {
                            var41 = (float) var39 / 1024.0F;
                            var42 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field623[var37];
                        var42 = 64.0F / (float) arg1.field658[var37];
                        var41 = 64.0F / (float) arg1.field643[var37];
                    } else {
                        var40 = (float) arg1.field623[var37] / 1024.0F;
                        var42 = (float) arg1.field658[var37] / 1024.0F;
                        var41 = (float) arg1.field643[var37] / 1024.0F;
                    }
                    var27[var37] = class644.method3596(var40, var41, class695.method3921(arg1.field664[var37], 255), var42, (byte) -79, arg1.field621[var37], arg1.field637[var37], arg1.field629[var37]);
                }
            }
        }
        class464[] var50 = new class464[arg1.field646];
        for (int var51 = 0; var51 < arg1.field646; var51++) {
            short var163 = arg1.field654[var51];
            short var164 = arg1.field635[var51];
            short var165 = arg1.field614[var51];
            int var166 = this.field3809[var164] - this.field3809[var163];
            int var167 = this.field3871[var164] - this.field3871[var163];
            int var168 = this.field3844[var164] - this.field3844[var163];
            int var169 = this.field3809[var165] - this.field3809[var163];
            int var170 = this.field3871[var165] - this.field3871[var163];
            int var171 = this.field3844[var165] - this.field3844[var163];
            int var172 = var167 * var171 - (var168 * var170);
            int var173 = var168 * var169 - var166 * var171;
            int var174;
            for (var174 = var166 * var170 - var167 * var169; var172 > 8192 || var173 > 8192 || var174 > 8192 || var172 < -8192 || var173 < -8192 || var174 < -8192; var174 >>= 0x1) {
                var173 >>= 0x1;
                var172 >>= 0x1;
            }
            int var175 = (int) Math.sqrt((double) (var174 * var174 + var172 * var172 + var173 * var173));
            if (var175 <= 0) {
                var175 = 1;
            }
            int var176 = var172 * 256 / var175;
            int var177 = var173 * 256 / var175;
            int var178 = var174 * 256 / var175;
            byte var179 = arg1.field660 == null ? 0 : arg1.field660[var51];
            if (var179 == 0) {
                class351 var181 = var13[var163];
                var181.field4487 += var176;
                var181.field4491 += var177;
                var181.field4486 += var178;
                var181.field4489++;
                class351 var182 = var13[var164];
                var182.field4491 += var177;
                var182.field4489++;
                var182.field4487 += var176;
                var182.field4486 += var178;
                class351 var183 = var13[var165];
                var183.field4486 += var178;
                var183.field4487 += var176;
                var183.field4489++;
                var183.field4491 += var177;
            } else if (var179 == 1) {
                class464 var180 = var50[var51] = new class464();
                var180.field5914 = var178;
                var180.field5911 = var176;
                var180.field5909 = var177;
            }
        }
        for (int var52 = 0; var52 < this.field3882; var52++) {
            int var73 = var8[var52];
            int var74 = arg1.field665[var73] & 0xFFFF;
            short var75;
            if (arg1.field641 == null) {
                var75 = -1;
            } else {
                var75 = arg1.field641[var73];
            }
            int var76;
            if (arg1.field618 == null) {
                var76 = -1;
            } else {
                var76 = arg1.field618[var73];
            }
            int var77;
            if (arg1.field626 == null) {
                var77 = 0;
            } else {
                var77 = arg1.field626[var73] & 0xFF;
            }
            float var78 = 0.0F;
            float var79 = 0.0F;
            float var80 = 0.0F;
            float var81 = 0.0F;
            float var82 = 0.0F;
            float var83 = 0.0F;
            byte var84 = 0;
            byte var85 = 0;
            int var86 = 0;
            if (var75 != -1) {
                if (var76 == -1) {
                    var81 = 1.0F;
                    var80 = 1.0F;
                    var83 = 0.0F;
                    var85 = 2;
                    var84 = 1;
                    var79 = 1.0F;
                    var82 = 0.0F;
                    var78 = 0.0F;
                } else {
                    var76 &= 0xFF;
                    byte var87 = arg1.field645[var76];
                    if (var87 == 0) {
                        short var116 = arg1.field654[var73];
                        short var117 = arg1.field635[var73];
                        short var118 = arg1.field614[var73];
                        short var119 = arg1.field629[var76];
                        short var120 = arg1.field621[var76];
                        short var121 = arg1.field637[var76];
                        float var122 = (float) arg1.field628[var119];
                        float var123 = (float) arg1.field662[var119];
                        float var124 = (float) arg1.field657[var119];
                        float var125 = (float) arg1.field628[var120] - var122;
                        float var126 = (float) arg1.field662[var120] - var123;
                        float var127 = (float) arg1.field657[var120] - var124;
                        float var128 = (float) arg1.field628[var121] - var122;
                        float var129 = (float) arg1.field662[var121] - var123;
                        float var130 = (float) arg1.field657[var121] - var124;
                        float var131 = (float) arg1.field628[var116] - var122;
                        float var132 = (float) arg1.field662[var116] - var123;
                        float var133 = (float) arg1.field657[var116] - var124;
                        float var134 = (float) arg1.field628[var117] - var122;
                        float var135 = (float) arg1.field662[var117] - var123;
                        float var136 = (float) arg1.field657[var117] - var124;
                        float var137 = (float) arg1.field628[var118] - var122;
                        float var138 = (float) arg1.field662[var118] - var123;
                        float var139 = (float) arg1.field657[var118] - var124;
                        float var140 = var126 * var130 - var127 * var129;
                        float var141 = var127 * var128 - var125 * var130;
                        float var142 = var125 * var129 - var126 * var128;
                        float var143 = var129 * var142 - var130 * var141;
                        float var144 = var130 * var140 - (var128 * var142);
                        float var145 = var128 * var141 - (var129 * var140);
                        float var146 = 1.0F / (var127 * var145 + var125 * var143 + var126 * var144);
                        var80 = (var136 * var145 + var134 * var143 + var135 * var144) * var146;
                        var82 = (var139 * var145 + var137 * var143 + var138 * var144) * var146;
                        var78 = (var133 * var145 + var131 * var143 + var132 * var144) * var146;
                        float var147 = var125 * var141 - var126 * var140;
                        float var148 = var126 * var142 - (var127 * var141);
                        float var149 = var127 * var140 - (var125 * var142);
                        float var150 = 1.0F / (var130 * var147 + var128 * var148 + var129 * var149);
                        var83 = (var139 * var147 + var137 * var148 + var138 * var149) * var150;
                        var79 = (var133 * var147 + var131 * var148 + var132 * var149) * var150;
                        var81 = (var136 * var147 + var134 * var148 + var135 * var149) * var150;
                    } else {
                        short var88 = arg1.field654[var73];
                        short var89 = arg1.field635[var73];
                        short var90 = arg1.field614[var73];
                        int var91 = var24[var76];
                        int var92 = var25[var76];
                        int var93 = var26[var76];
                        float[] var94 = var27[var76];
                        byte var95 = arg1.field638[var76];
                        float var96 = (float) arg1.field661[var76] / 256.0F;
                        if (var87 == 1) {
                            float var114 = (float) arg1.field643[var76] / 1024.0F;
                            class207.method1246(arg1.field662[var88], var95, var91, var96, arg1.field657[var88], var114, arg1.field628[var88], var93, var94, var92, 4);
                            var78 = class273.field3444;
                            var79 = class204.field2593;
                            class207.method1246(arg1.field662[var89], var95, var91, var96, arg1.field657[var89], var114, arg1.field628[var89], var93, var94, var92, 4);
                            var80 = class273.field3444;
                            var81 = class204.field2593;
                            class207.method1246(arg1.field662[var90], var95, var91, var96, arg1.field657[var90], var114, arg1.field628[var90], var93, var94, var92, 4);
                            var82 = class273.field3444;
                            var83 = class204.field2593;
                            float var115 = var114 / 2.0F;
                            if ((var95 & 0x1) == 0) {
                                if ((var82 - var78 > var115)) {
                                    var82 -= var114;
                                    var85 = 1;
                                } else if (var115 < var78 - var82) {
                                    var85 = 2;
                                    var82 += var114;
                                }
                                if (var115 < var80 - var78) {
                                    var80 -= var114;
                                    var84 = 1;
                                } else if (var115 < var78 - var80) {
                                    var80 += var114;
                                    var84 = 2;
                                }
                            } else {
                                if (var83 - var79 > var115) {
                                    var83 -= var114;
                                    var85 = 1;
                                } else if (var79 - var83 > var115) {
                                    var83 += var114;
                                    var85 = 2;
                                }
                                if (var115 < var81 - var79) {
                                    var81 -= var114;
                                    var84 = 1;
                                } else if (var115 < var79 - var81) {
                                    var81 += var114;
                                    var84 = 2;
                                }
                            }
                        } else if (var87 == 2) {
                            float var97 = (float) arg1.field624[var76] / 256.0F;
                            float var98 = (float) arg1.field617[var76] / 256.0F;
                            int var99 = arg1.field628[var89] - arg1.field628[var88];
                            int var100 = arg1.field662[var89] - arg1.field662[var88];
                            int var101 = arg1.field657[var89] - arg1.field657[var88];
                            int var102 = arg1.field628[var90] - arg1.field628[var88];
                            int var103 = arg1.field662[var90] - arg1.field662[var88];
                            int var104 = arg1.field657[var90] - arg1.field657[var88];
                            int var105 = var100 * var104 - var101 * var103;
                            int var106 = var101 * var102 - var99 * var104;
                            int var107 = var99 * var103 - (var100 * var102);
                            float var108 = 64.0F / (float) arg1.field658[var76];
                            float var109 = 64.0F / (float) arg1.field623[var76];
                            float var110 = 64.0F / (float) arg1.field643[var76];
                            float var111 = (var94[2] * (float) var107 + var94[1] * (float) var106 + var94[0] * (float) var105) / var108;
                            float var112 = (var94[5] * (float) var107 + var94[4] * (float) var106 + var94[3] * (float) var105) / var109;
                            float var113 = (var94[8] * (float) var107 + var94[6] * (float) var105 + var94[7] * (float) var106) / var110;
                            var86 = class405.method2159((byte) -94, var112, var113, var111);
                            class235.method1416(var96, var93, var98, var92, var86, var95, arg1.field662[var88], 8431, var94, var91, arg1.field628[var88], arg1.field657[var88], var97);
                            var79 = class359.field4580;
                            var78 = class181.field2327;
                            class235.method1416(var96, var93, var98, var92, var86, var95, arg1.field662[var89], 8431, var94, var91, arg1.field628[var89], arg1.field657[var89], var97);
                            var80 = class181.field2327;
                            var81 = class359.field4580;
                            class235.method1416(var96, var93, var98, var92, var86, var95, arg1.field662[var90], 8431, var94, var91, arg1.field628[var90], arg1.field657[var90], var97);
                            var83 = class359.field4580;
                            var82 = class181.field2327;
                        } else if (var87 == 3) {
                            class123.method658(var95, var94, (byte) -38, var96, var92, var91, arg1.field657[var88], arg1.field628[var88], arg1.field662[var88], var93);
                            var78 = class32.field461;
                            var79 = class580.field8123;
                            class123.method658(var95, var94, (byte) -66, var96, var92, var91, arg1.field657[var89], arg1.field628[var89], arg1.field662[var89], var93);
                            var80 = class32.field461;
                            var81 = class580.field8123;
                            class123.method658(var95, var94, (byte) -78, var96, var92, var91, arg1.field657[var90], arg1.field628[var90], arg1.field662[var90], var93);
                            var82 = class32.field461;
                            var83 = class580.field8123;
                            if ((var95 & 0x1) == 0) {
                                if (var80 - var78 > 0.5F) {
                                    var84 = 1;
                                    var80--;
                                } else if (var78 - var80 > 0.5F) {
                                    var84 = 2;
                                    var80++;
                                }
                                if (var82 - var78 > 0.5F) {
                                    var82--;
                                    var85 = 1;
                                } else if (var78 - var82 > 0.5F) {
                                    var85 = 2;
                                    var82++;
                                }
                            } else {
                                if ((var83 - var79 > 0.5F)) {
                                    var85 = 1;
                                    var83--;
                                } else if (var79 - var83 > 0.5F) {
                                    var83++;
                                    var85 = 2;
                                }
                                if ((var81 - var79 > 0.5F)) {
                                    var81--;
                                    var84 = 1;
                                } else if (var79 - var81 > 0.5F) {
                                    var84 = 2;
                                    var81++;
                                }
                            }
                        }
                    }
                }
            }
            byte var151;
            if (arg1.field660 == null) {
                var151 = 0;
            } else {
                var151 = arg1.field660[var73];
            }
            if (var151 == 0) {
                long var152 = (long) (var76 << 2) + ((long) (var74 << 8) + (long) (var86 << 24) + (long) var77 << 32);
                short var154 = arg1.field654[var73];
                short var155 = arg1.field635[var73];
                short var156 = arg1.field614[var73];
                class351 var157 = var13[var154];
                this.field3811[var52] = this.method1757(var157.field4487, var157.field4489, var78, var152, arg1, var157.field4491, var154, var79, -5073, var52, var157.field4486);
                class351 var158 = var13[var155];
                this.field3803[var52] = this.method1757(var158.field4487, var158.field4489, var80, (long) var84 + var152, arg1, var158.field4491, var155, var81, -5073, var52, var158.field4486);
                class351 var159 = var13[var156];
                this.field3880[var52] = this.method1757(var159.field4487, var159.field4489, var82, (long) var85 + var152, arg1, var159.field4491, var156, var83, -5073, var52, var159.field4486);
            } else if (var151 == 1) {
                class464 var160 = var50[var73];
                long var161 = (long) ((var160.field5909 + 256 << 12) + (var76 << 2) + ((var160.field5911 > 0 ? 1024 : 2048) - -(var160.field5914 - -256 << 22))) + ((long) (var86 << 24) - (-((long) (var74 << 8)) - (long) var77) << 32);
                this.field3811[var52] = this.method1757(var160.field5911, 0, var78, var161, arg1, var160.field5909, arg1.field654[var73], var79, -5073, var52, var160.field5914);
                this.field3803[var52] = this.method1757(var160.field5911, 0, var80, (long) var84 + var161, arg1, var160.field5909, arg1.field635[var73], var81, -5073, var52, var160.field5914);
                this.field3880[var52] = this.method1757(var160.field5911, 0, var82, (long) var85 + var161, arg1, var160.field5909, arg1.field614[var73], var83, -5073, var52, var160.field5914);
            }
            if (arg1.field641 == null) {
                this.field3863[var52] = -1;
            } else {
                this.field3863[var52] = arg1.field641[var73];
            }
            if (arg1.field626 != null) {
                this.field3826[var52] = arg1.field626[var73];
            }
            if (arg1.field642 != null) {
                this.field3816[var52] = arg1.field642[var73];
            }
            this.field3893[var52] = arg1.field665[var73];
        }
        if (this.field3798 > 0) {
            int var53 = 1;
            short var54 = this.field3863[0];
            for (int var55 = 0; var55 < this.field3798; var55++) {
                short var65 = this.field3863[var55];
                if (var54 != var65) {
                    var54 = var65;
                    var53++;
                }
            }
            this.field3881 = new int[var53];
            this.field3833 = new int[var53 + 1];
            this.field3873 = new int[var53];
            this.field3833[0] = 0;
            int var56 = this.field3825;
            int var57 = 0;
            short var58 = 0;
            short var59 = this.field3863[0];
            for (int var60 = 0; var60 < this.field3798; var60++) {
                short var61 = this.field3863[var60];
                if (var59 != var61) {
                    this.field3873[var57] = var56;
                    this.field3881[var57] = var58 + 1 - var56;
                    var57++;
                    this.field3833[var57] = var60;
                    var56 = this.field3825;
                    var59 = var61;
                    var58 = 0;
                }
                short var62 = this.field3811[var60];
                if (var58 < var62) {
                    var58 = var62;
                }
                if (var56 > var62) {
                    var56 = var62;
                }
                short var63 = this.field3803[var60];
                if (var56 > var63) {
                    var56 = var63;
                }
                if (var63 > var58) {
                    var58 = var63;
                }
                short var64 = this.field3880[var60];
                if (var64 > var58) {
                    var58 = var64;
                }
                if (var56 > var64) {
                    var56 = var64;
                }
            }
            this.field3873[var57] = var56;
            this.field3881[var57] = var58 + 1 - var56;
            var57++;
            this.field3833[var57] = this.field3798;
        }
        class362.field4607 = null;
        this.field3785 = class644.method3597(126, this.field3785, this.field3825);
        this.field3817 = class644.method3597(91, this.field3817, this.field3825);
        this.field3815 = class644.method3597(107, this.field3815, this.field3825);
        this.field3805 = class644.method3597(95, this.field3805, this.field3825);
        this.field3794 = class644.method3597(98, this.field3794, this.field3825);
        this.field3879 = class241.method1441((byte) -85, this.field3825, this.field3879);
        this.field3846 = class2.method8((byte) -85, this.field3825, this.field3846);
        this.field3797 = class2.method8((byte) -119, this.field3825, this.field3797);
        if (arg1.field656 != null && class225.method1353(this.field3876, false, arg2)) {
            this.field3836 = arg1.method290(false, 117);
        }
        if (arg1.field653 != null && class273.method1567(arg2, 1024, this.field3876)) {
            this.field3784 = arg1.method301(106);
        }
        if (arg1.field632 != null && class271.method1559(63, this.field3876, arg2)) {
            int var66 = 0;
            int[] var67 = new int[256];
            for (int var68 = 0; var68 < this.field3882; var68++) {
                int var72 = arg1.field632[var8[var68]];
                if (var72 >= 0) {
                    int var10002 = var67[var72]++;
                    if (var66 < var72) {
                        var66 = var72;
                    }
                }
            }
            this.field3812 = new int[var66 + 1][];
            for (int var69 = 0; var69 <= var66; var69++) {
                this.field3812[var69] = new int[var67[var69]];
                var67[var69] = 0;
            }
            for (int var70 = 0; var70 < this.field3882; var70++) {
                int var71 = arg1.field632[var8[var70]];
                if (var71 >= 0) {
                    this.field3812[var71][var67[var71]++] = var70;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIZ)Lda;", line = 4807)
    public final class474 method711(byte arg0, int arg1, boolean arg2) {
        field3829++;
        class306 var4;
        class306 var5;
        if (arg0 == 1) {
            var4 = this.field3849.field6350;
            var5 = this.field3849.field6347;
        } else if (arg0 == 2) {
            var4 = this.field3849.field6349;
            var5 = this.field3849.field6358;
        } else if (arg0 == 3) {
            var4 = this.field3849.field6353;
            var5 = this.field3849.field6355;
        } else if (arg0 == 4) {
            var5 = this.field3849.field6341;
            var4 = this.field3849.field6344;
        } else if (arg0 == 5) {
            var4 = this.field3849.field6343;
            var5 = this.field3849.field6357;
        } else {
            var4 = var5 = new class306(this.field3849, 0, 0, true, false);
        }
        return this.method1763(var4, var5, arg2, arg1, 122, arg0 != 0);
    }

    @OriginalMember(owner = "client!ja", name = "ba", descriptor = "(IILi;Li;III)V", line = 4855)
    public final void method747(int arg0, int arg1, class272 arg2, class272 arg3, int arg4, int arg5, int arg6) {
        field3850++;
        if (!this.field3810) {
            this.method1762(false);
        }
        int var8 = this.field3793 + arg4;
        int var9 = this.field3877 + arg4;
        int var10 = this.field3828 + arg6;
        int var11 = this.field3851 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3432 + var9 >> arg2.field3437 >= arg2.field3441 || var10 < 0 || (var11 + arg2.field3432 >> arg2.field3437) >= arg2.field3440) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3441 <= arg3.field3432 + var9 >> arg3.field3437 || var10 < 0 || (var11 + arg3.field3432 >> arg3.field3437) >= arg3.field3440) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3437;
            int var13 = arg2.field3432 + var9 - 1 >> arg2.field3437;
            int var14 = var10 >> arg2.field3437;
            int var15 = var11 + arg2.field3432 - 1 >> arg2.field3437;
            if (arg5 == arg2.method1562(var14, (byte) 51, var12) && arg5 == arg2.method1562(var14, (byte) 51, var13) && arg2.method1562(var15, (byte) 51, var12) == arg5 && arg2.method1562(var15, (byte) 51, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field3839; var32++) {
                this.field3871[var32] = this.field3871[var32] + arg2.method1565(this.field3844[var32] + arg6, this.field3809[var32] + arg4, true) - arg5;
            }
        } else if (arg0 == 2) {
            int var29 = this.field3883;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field3839; var30++) {
                int var31 = (this.field3871[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field3871[var30] -= -((arg1 - var31) * (arg2.method1565(this.field3844[var30] + arg6, this.field3809[var30] + arg4, true) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = ((arg1 & 0xFF4B) >> 8) * 4;
            int var18 = arg1 >> 16 & 0xFF << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var16 >> 1)) < 0 || arg2.field3441 << arg2.field3437 <= (var16 >> 1) + arg4 + arg2.field3432 || arg6 - (var17 >> 1) < 0 || ((var17 >> 1) + arg6 + arg2.field3432) >= (arg2.field3440 << arg2.field3437)) {
                return;
            }
            this.method2501(var17, arg2, arg4, var18, 0, var16, arg5, var19, arg6);
        } else if (arg0 == 4) {
            int var27 = this.field3845 - this.field3883;
            for (int var28 = 0; var28 < this.field3839; var28++) {
                this.field3871[var28] = this.field3871[var28] + arg3.method1565(this.field3844[var28] + arg6, this.field3809[var28] + arg4, true) + var27 - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field3845 - this.field3883;
            for (int var21 = 0; var21 < this.field3839; var21++) {
                int var22 = this.field3809[var21] + arg4;
                int var23 = this.field3844[var21] + arg6;
                int var24 = arg2.method1565(var23, var22, true);
                int var25 = arg3.method1565(var23, var22, true);
                int var26 = var24 - arg1 - var25;
                this.field3871[var21] = -arg5 - (-var24 - ((this.field3871[var21] << 8) / var20 * var26 >> 8));
            }
        }
        this.method1758((byte) 112);
        this.field3810 = false;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "()[Lqg;", line = 5009)
    public final class214[] method706() {
        field3808++;
        return this.field3782;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(SS)V", line = 5018)
    public final void method694(short arg0, short arg1) {
        field3820++;
        for (int var3 = 0; var3 < this.field3882; var3++) {
            if (this.field3893[var3] == arg0) {
                this.field3893[var3] = arg1;
            }
        }
        if (this.field3804 != null) {
            for (int var4 = 0; var4 < this.field3858; var4++) {
                class602 var5 = this.field3804[var4];
                class576 var6 = this.field3813[var4];
                var6.field8050 = class344.field4422[this.field3893[var5.field8473] & 0xFFFF] & 0xFFFFFF | var6.field8050 & 0xFF000000;
            }
        }
        this.method1756(false);
    }

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "()Z", line = 5057)
    public final boolean method742() {
        field3778++;
        if (this.field3836 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3807; var1++) {
            this.field3809[var1] <<= 0x4;
            this.field3871[var1] <<= 0x4;
            this.field3844[var1] <<= 0x4;
        }
        class378.field4786 = 0;
        class352.field4497 = 0;
        class301.field3699 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "PA", descriptor = "()I", line = 5091)
    public final int method764() {
        field3775++;
        return this.field3818;
    }

    @OriginalMember(owner = "client!ja", name = "OA", descriptor = "()I", line = 5108)
    public final int method734() {
        if (!this.field3810) {
            this.method1762(false);
        }
        field3864++;
        return this.field3828;
    }

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "(I)V", line = 5121)
    public final void method722(int arg0) {
        field3788++;
        int var2 = class453.field5810[arg0];
        int var3 = class453.field5811[arg0];
        for (int var4 = 0; var4 < this.field3839; var4++) {
            int var5 = this.field3844[var4] * var2 + (this.field3809[var4] * var3) >> 14;
            this.field3844[var4] = this.field3844[var4] * var3 - this.field3809[var4] * var2 >> 14;
            this.field3809[var4] = var5;
        }
        this.method1758((byte) 112);
        this.field3810 = false;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()[Lhi;", line = 5148)
    public final class64[] method728() {
        field3891++;
        return this.field3837;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V", line = 5156)
    public final void method755(int arg0, int arg1, int arg2, int arg3) {
        field3801++;
        for (int var5 = 0; var5 < this.field3882; var5++) {
            int var9 = this.field3893[var5] & 0xFFFF;
            int var10 = (var9 & 0xFCE7) >> 10;
            int var11 = (var9 & 0x3F2) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field3893[var5] = (short) class444.method2376(class444.method2376(var10 << 10, var11 << 7), var12);
        }
        if (this.field3804 != null) {
            for (int var6 = 0; var6 < this.field3858; var6++) {
                class602 var7 = this.field3804[var6];
                class576 var8 = this.field3813[var6];
                var8.field8050 = var8.field8050 & 0xFF000000 | class344.field4422[this.field3893[var7.field8473] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method1756(false);
    }

    @OriginalMember(owner = "client!ja", name = "oa", descriptor = "(III)V", line = 5210)
    public final void method710(int arg0, int arg1, int arg2) {
        field3878++;
        for (int var4 = 0; var4 < this.field3839; var4++) {
            if (arg0 != 0) {
                this.field3809[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3871[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3844[var4] += arg2;
            }
        }
        this.method1758((byte) 112);
        this.field3810 = false;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(Z)V", line = 5244)
    private final void method1765(boolean arg0) {
        if (this.field3804 != null) {
            this.field3849.method1034(false);
            this.field3849.method2535(false, 119);
            this.field3849.method2602(1, 1, class700.field9903);
            this.field3849.method2561(1, class700.field9903, -18836);
            for (int var2 = 0; var2 < this.field3858; var2++) {
                class602 var3 = this.field3804[var2];
                class576 var4 = this.field3813[var2];
                if (!var3.field8478 || !this.field3849.method1006()) {
                    float var5 = (float) (this.field3809[var3.field8477] + this.field3809[var3.field8480] + this.field3809[var3.field8470]) * 0.3333333F;
                    float var6 = (float) (this.field3871[var3.field8477] + this.field3871[var3.field8470] + this.field3871[var3.field8480]) * 0.3333333F;
                    float var7 = (float) (this.field3844[var3.field8477] + this.field3844[var3.field8480] + this.field3844[var3.field8470]) * 0.3333333F;
                    float var8 = client.field9536 * var7 + class679.field9551 * var6 + class434.field5436 * var5 + class417.field5248;
                    float var9 = class348.field4456 * var7 + class82.field1099 * var6 + class651.field9195 * var5 + class160.field2103;
                    float var10 = class548.field7414 * var7 + class582.field8138 * var6 + class461.field5857 * var5 + class223.field2790;
                    class691 var11 = this.field3849.method2598(12083);
                    var11.method3894(var3.field8475 * var4.field8052 >> 7, (float) var4.field8043 + var9, (byte) 100, (float) (-var3.field8485) + var10, (float) var4.field8046 + var8, var3.field8484 * var4.field8042 >> 7, var4.field8051);
                    var11.method3897((byte) -6, this.field3849.field6235);
                    this.field3849.method2588(118);
                    int var12 = var4.field8050;
                    this.field3849.method2526(0, var3.field8481, false, false);
                    this.field3849.method2553((byte) 28, var3.field8472);
                    this.field3849.method2597((byte) 48, var12);
                    this.field3849.method2549(9);
                }
            }
            this.field3849.method2561(1, class141.field1830, -18836);
            this.field3849.method2602(1, 1, class141.field1830);
            this.field3849.method1034(true);
        }
        field3896++;
        if (!arg0) {
            this.method711((byte) 121, -70, true);
        }
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "()V", line = 5313)
    public final void method765() {
        for (int var1 = 0; var1 < this.field3839; var1++) {
            this.field3844[var1] = -this.field3844[var1];
        }
        field3776++;
        for (int var2 = 0; var2 < this.field3825; var2++) {
            this.field3794[var2] = (short) (-this.field3794[var2]);
        }
        for (int var3 = 0; var3 < this.field3882; var3++) {
            short var4 = this.field3811[var3];
            this.field3811[var3] = this.field3880[var3];
            this.field3880[var3] = var4;
        }
        this.method1758((byte) 112);
        this.method1767(55);
        this.method1761(false);
        this.field3810 = false;
    }

    @OriginalMember(owner = "client!ja", name = "DA", descriptor = "(SS)V", line = 5352)
    public final void method705(short arg0, short arg1) {
        field3856++;
        class526 var3 = this.field3849.field7898;
        for (int var4 = 0; var4 < this.field3882; var4++) {
            if (this.field3863[var4] == arg0) {
                this.field3863[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class13 var7 = var3.method2486(arg0 & 0xFFFF, (byte) 86);
            var5 = var7.field242;
            var6 = var7.field231;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class13 var10 = var3.method2486(arg1 & 0xFFFF, (byte) 86);
            var8 = var10.field242;
            var9 = var10.field231;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field3804 != null) {
            for (int var11 = 0; var11 < this.field3858; var11++) {
                class602 var12 = this.field3804[var11];
                class576 var13 = this.field3813[var11];
                var13.field8050 = class344.field4422[this.field3893[var12.field8473] & 0xFFFF] & 0xFFFFFF | var13.field8050 & 0xFF000000;
            }
        }
        this.method1756(false);
    }

    @OriginalMember(owner = "client!ja", name = "ga", descriptor = "(I)V", line = 5421)
    public final void method696(int arg0) {
        this.field3823 = (short) arg0;
        field3787++;
        this.method1758((byte) 112);
        this.method1767(55);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIII)Z", line = 5436)
    private final boolean method1766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3866++;
        if (arg3 < 113) {
            this.method696(104);
        }
        if (arg4 < arg6 && arg0 > arg4 && arg1 > arg4) {
            return false;
        } else if (arg4 > arg6 && arg0 < arg4 && arg1 < arg4) {
            return false;
        } else if (arg7 < arg8 && arg5 > arg7 && arg2 > arg7) {
            return false;
        } else {
            return arg7 <= arg8 || arg7 <= arg5 || arg2 >= arg7;
        }
    }

    @OriginalMember(owner = "client!ja", name = "SA", descriptor = "(I)V", line = 5464)
    public final void method761(int arg0) {
        if (this.field3799 != null) {
            this.field3799.field1633 = class127.method678(68, arg0, this.field3876);
        }
        field3892++;
        if (this.field3834 != null) {
            this.field3834.field1633 = class105.method593(this.field3876, arg0, true);
        }
        if (this.field3800 != null) {
            this.field3800.field1633 = class638.method3573(3, arg0, this.field3876);
        }
        if (this.field3867 != null) {
            this.field3867.field1633 = class124.method661(this.field3876, arg0, -127);
        }
        this.field3818 = arg0;
        this.field3894 = true;
        if (this.field3786 != null && (this.field3818 & 0x10000) == 0) {
            this.field3879 = this.field3786.field4839;
            this.field3815 = this.field3786.field4838;
            this.field3805 = this.field3786.field4842;
            this.field3794 = this.field3786.field4840;
            this.field3786 = null;
        }
        this.method1753(-94);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 5498)
    private final void method1767(int arg0) {
        if ((arg0 & this.field3876) == 0) {
            if (this.field3800 != null) {
                this.field3800.field1626 = false;
            }
        } else if (this.field3867 != null) {
            this.field3867.field1626 = false;
        }
        field3824++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZLq;II)Z", line = 5527)
    private final boolean method1768(int arg0, int arg1, boolean arg2, class491 arg3, int arg4, int arg5) {
        field3832++;
        class691 var7 = (class691) arg3;
        class691 var8 = this.field3849.field6234;
        float var9 = var7.field9795 * var8.field9823 + var7.field9791 * var8.field9803 + var7.field9780 * var8.field9781 + var8.field9791;
        float var10 = var7.field9795 * var8.field9796 + var7.field9791 * var8.field9819 + var7.field9780 * var8.field9810 + var8.field9780;
        class582.field8138 = var7.field9822 * var8.field9799 + var7.field9810 * var8.field9822 + var7.field9781 * var8.field9798;
        float var11 = var7.field9795 * var8.field9799 + var7.field9791 * var8.field9798 + var7.field9780 * var8.field9822 + var8.field9795;
        client.field9536 = var7.field9799 * var8.field9823 + var7.field9823 * var8.field9803 + var7.field9796 * var8.field9781;
        class434.field5436 = var7.field9798 * var8.field9823 + var7.field9819 * var8.field9781 + var7.field9803 * var8.field9803;
        class651.field9195 = var7.field9798 * var8.field9796 + var7.field9819 * var8.field9810 + var7.field9803 * var8.field9819;
        class348.field4456 = var7.field9799 * var8.field9796 + var7.field9823 * var8.field9819 + var7.field9796 * var8.field9810;
        class461.field5857 = var7.field9798 * var8.field9799 + var7.field9819 * var8.field9822 + var7.field9803 * var8.field9798;
        class82.field1099 = var7.field9822 * var8.field9796 + var7.field9810 * var8.field9810 + var7.field9781 * var8.field9819;
        class679.field9551 = var7.field9822 * var8.field9823 + var7.field9810 * var8.field9781 + var7.field9781 * var8.field9803;
        class548.field7414 = var7.field9799 * var8.field9799 + var7.field9823 * var8.field9798 + var7.field9796 * var8.field9822;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field3849.field6240;
        int var18 = this.field3849.field6297;
        if (!this.field3810) {
            this.method1762(false);
        }
        class537.field7218[0] = this.field3793;
        class646.field9087[0] = this.field3883;
        class572.field7985[0] = this.field3828;
        class537.field7218[1] = this.field3877;
        class646.field9087[1] = this.field3883;
        class537.field7218[2] = this.field3793;
        class572.field7985[1] = this.field3828;
        class646.field9087[2] = this.field3845;
        class572.field7985[2] = this.field3828;
        class537.field7218[3] = this.field3877;
        class646.field9087[3] = this.field3845;
        class572.field7985[3] = this.field3828;
        class537.field7218[4] = this.field3793;
        class646.field9087[4] = this.field3883;
        class572.field7985[4] = this.field3851;
        class537.field7218[5] = this.field3877;
        class646.field9087[5] = this.field3883;
        class572.field7985[5] = this.field3851;
        class537.field7218[6] = this.field3793;
        class646.field9087[6] = this.field3845;
        class537.field7218[7] = this.field3877;
        class572.field7985[6] = this.field3851;
        class646.field9087[7] = this.field3845;
        class572.field7985[7] = this.field3851;
        int var19 = 0;
        if (arg5 > -88) {
            this.field3828 = -71;
        }
        while (var19 < 8) {
            float var38 = (float) class537.field7218[var19];
            float var39 = (float) class646.field9087[var19];
            float var40 = (float) class572.field7985[var19];
            float var41 = class548.field7414 * var40 + class582.field8138 * var39 + class461.field5857 * var38 + var11;
            float var42 = client.field9536 * var40 + class679.field9551 * var39 + class434.field5436 * var38 + var9;
            float var43 = class348.field4456 * var40 + class82.field1099 * var39 + class651.field9195 * var38 + var10;
            if (var41 >= (float) this.field3849.field6318) {
                if (arg0 > 0) {
                    var41 = arg0;
                }
                float var44 = (float) var17 * var42 / var41 + (float) this.field3849.field6323;
                float var45 = (float) var18 * var43 / var41 + (float) this.field3849.field6266;
                if (var44 < var13) {
                    var13 = var44;
                }
                if (var14 < var44) {
                    var14 = var44;
                }
                if (var45 > var16) {
                    var16 = var45;
                }
                if (var15 > var45) {
                    var15 = var45;
                }
                var12 = true;
            }
            var19++;
        }
        if (var12 && var13 < (float) arg4 && (float) arg4 < var14 && var15 < (float) arg1 && (float) arg1 < var16) {
            if (arg2) {
                return true;
            }
            if (class635.field8919.length < this.field3825) {
                class184.field2346 = new int[this.field3825];
                class635.field8919 = new int[this.field3825];
            }
            for (int var20 = 0; var20 < this.field3839; var20++) {
                float var22 = (float) this.field3844[var20];
                float var23 = (float) this.field3871[var20];
                float var24 = (float) this.field3809[var20];
                float var25 = class548.field7414 * var22 + class582.field8138 * var23 + class461.field5857 * var24 + var11;
                float var26 = client.field9536 * var22 + class679.field9551 * var23 + class434.field5436 * var24 + var9;
                float var27 = class348.field4456 * var22 + class82.field1099 * var23 + class651.field9195 * var24 + var10;
                if ((var25 >= (float) this.field3849.field6318)) {
                    if (arg0 > 0) {
                        var25 = arg0;
                    }
                    int var32 = (int) ((float) var17 * var26 / var25 + (float) this.field3849.field6323);
                    int var33 = (int) ((float) var18 * var27 / var25 + (float) this.field3849.field6266);
                    int var34 = this.field3796[var20];
                    int var35 = this.field3796[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field3827[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        class635.field8919[var37] = var32;
                        class184.field2346[var37] = var33;
                    }
                } else {
                    int var28 = this.field3796[var20];
                    int var29 = this.field3796[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field3827[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class635.field8919[this.field3827[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field3882; var21++) {
                if (class635.field8919[this.field3811[var21]] != -999999 && class635.field8919[this.field3803[var21]] != -999999 && class635.field8919[this.field3880[var21]] != -999999 && this.method1766(class184.field2346[this.field3803[var21]], class184.field2346[this.field3880[var21]], class635.field8919[this.field3880[var21]], 117, arg1, class635.field8919[this.field3803[var21]], class184.field2346[this.field3811[var21]], arg4, class635.field8919[this.field3811[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "(I)V", line = 5750)
    public final void method715(int arg0) {
        field3822++;
        int var2 = class453.field5810[arg0];
        int var3 = class453.field5811[arg0];
        for (int var4 = 0; var4 < this.field3839; var4++) {
            int var5 = this.field3871[var4] * var2 + (this.field3809[var4] * var3) >> 14;
            this.field3871[var4] = this.field3871[var4] * var3 - (this.field3809[var4] * var2) >> 14;
            this.field3809[var4] = var5;
        }
        this.method1758((byte) 112);
        this.field3810 = false;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "()V", line = 5777)
    public final void method702() {
        field3895++;
    }

    @OriginalMember(owner = "client!ja", name = "KA", descriptor = "()I", line = 5788)
    public final int method758() {
        if (!this.field3810) {
            this.method1762(false);
        }
        field3780++;
        return this.field3793;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lq;)V", line = 5799)
    public final void method720(class491 arg0) {
        field3862++;
        class691 var2 = (class691) arg0;
        if (this.field3837 != null) {
            for (int var3 = 0; var3 < this.field3837.length; var3++) {
                class64 var4 = this.field3837[var3];
                class64 var5 = var4;
                if (var4.field864 != null) {
                    var5 = var4.field864;
                }
                var5.field868 = (int) ((float) this.field3844[var4.field862] * var2.field9823 + (float) this.field3871[var4.field862] * var2.field9781 + (float) this.field3809[var4.field862] * var2.field9803 + var2.field9791);
                var5.field859 = (int) ((float) this.field3844[var4.field862] * var2.field9796 + (float) this.field3871[var4.field862] * var2.field9810 + (float) this.field3809[var4.field862] * var2.field9819 + var2.field9780);
                var5.field870 = (int) ((float) this.field3844[var4.field862] * var2.field9799 + (float) this.field3871[var4.field862] * var2.field9822 + (float) this.field3809[var4.field862] * var2.field9798 + var2.field9795);
                var5.field860 = (int) ((float) this.field3844[var4.field865] * var2.field9823 + (float) this.field3871[var4.field865] * var2.field9781 + (float) this.field3809[var4.field865] * var2.field9803 + var2.field9791);
                var5.field861 = (int) ((float) this.field3844[var4.field865] * var2.field9796 + (float) this.field3871[var4.field865] * var2.field9810 + (float) this.field3809[var4.field865] * var2.field9819 + var2.field9780);
                var5.field871 = (int) ((float) this.field3844[var4.field865] * var2.field9799 + (float) this.field3871[var4.field865] * var2.field9822 + (float) this.field3809[var4.field865] * var2.field9798 + var2.field9795);
                var5.field878 = (int) ((float) this.field3844[var4.field863] * var2.field9823 + (float) this.field3871[var4.field863] * var2.field9781 + (float) this.field3809[var4.field863] * var2.field9803 + var2.field9791);
                var5.field873 = (int) ((float) this.field3844[var4.field863] * var2.field9796 + (float) this.field3871[var4.field863] * var2.field9810 + (float) this.field3809[var4.field863] * var2.field9819 + var2.field9780);
                var5.field872 = (int) ((float) this.field3844[var4.field863] * var2.field9799 + (float) this.field3871[var4.field863] * var2.field9822 + (float) this.field3809[var4.field863] * var2.field9798 + var2.field9795);
            }
        }
        if (this.field3782 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3782.length; var6++) {
            class214 var7 = this.field3782[var6];
            class214 var8 = var7;
            if (var7.field2665 != null) {
                var8 = var7.field2665;
            }
            if (var7.field2667 == null) {
                var7.field2667 = var2.method907();
            } else {
                var7.field2667.method919(var2);
            }
            var8.field2664 = (int) ((float) this.field3844[var7.field2653] * var2.field9823 + (float) this.field3871[var7.field2653] * var2.field9781 + (float) this.field3809[var7.field2653] * var2.field9803 + var2.field9791);
            var8.field2657 = (int) ((float) this.field3844[var7.field2653] * var2.field9796 + (float) this.field3871[var7.field2653] * var2.field9810 + (float) this.field3809[var7.field2653] * var2.field9819 + var2.field9780);
            var8.field2663 = (int) ((float) this.field3844[var7.field2653] * var2.field9799 + (float) this.field3871[var7.field2653] * var2.field9822 + (float) this.field3809[var7.field2653] * var2.field9798 + var2.field9795);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V", line = 5865)
    public static void method1769(byte arg0) {
        if (arg0 <= 98) {
            field3779 = null;
        }
        field3779 = null;
    }

    @OriginalMember(owner = "client!ja", name = "WA", descriptor = "(IIII)V", line = 5891)
    public final void method709(int arg0, int arg1, int arg2, int arg3) {
        field3848++;
        if (arg0 == 0) {
            class352.field4497 = 0;
            class301.field3699 = 0;
            int var5 = 0;
            class378.field4786 = 0;
            for (int var6 = 0; var6 < this.field3839; var6++) {
                class301.field3699 += this.field3809[var6];
                class352.field4497 += this.field3871[var6];
                class378.field4786 += this.field3844[var6];
                var5++;
            }
            if (var5 <= 0) {
                class378.field4786 = arg3;
                class352.field4497 = arg2;
                class301.field3699 = arg1;
            } else {
                class378.field4786 = class378.field4786 / var5 + arg3;
                class301.field3699 = class301.field3699 / var5 + arg1;
                class352.field4497 = class352.field4497 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3839; var7++) {
                this.field3809[var7] += arg1;
                this.field3871[var7] += arg2;
                this.field3844[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3839; var8++) {
                this.field3809[var8] -= class301.field3699;
                this.field3871[var8] -= class352.field4497;
                this.field3844[var8] -= class378.field4786;
                if (arg3 != 0) {
                    int var9 = class453.field5810[arg3];
                    int var10 = class453.field5811[arg3];
                    int var11 = this.field3871[var8] * var9 - (-(this.field3809[var8] * var10) - 16383) >> 14;
                    this.field3871[var8] = this.field3871[var8] * var10 + 16383 - (this.field3809[var8] * var9) >> 14;
                    this.field3809[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class453.field5810[arg1];
                    int var13 = class453.field5811[arg1];
                    int var14 = this.field3871[var8] * var13 + 16383 - (this.field3844[var8] * var12) >> 14;
                    this.field3844[var8] = this.field3871[var8] * var12 + this.field3844[var8] * var13 + 16383 >> 14;
                    this.field3871[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class453.field5810[arg2];
                    int var16 = class453.field5811[arg2];
                    int var17 = this.field3844[var8] * var15 + this.field3809[var8] * var16 + 16383 >> 14;
                    this.field3844[var8] = this.field3844[var8] * var16 + 16383 - (this.field3809[var8] * var15) >> 14;
                    this.field3809[var8] = var17;
                }
                this.field3809[var8] += class301.field3699;
                this.field3871[var8] += class352.field4497;
                this.field3844[var8] += class378.field4786;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3839; var18++) {
                this.field3809[var18] -= class301.field3699;
                this.field3871[var18] -= class352.field4497;
                this.field3844[var18] -= class378.field4786;
                this.field3809[var18] = this.field3809[var18] * arg1 / 128;
                this.field3871[var18] = this.field3871[var18] * arg2 / 128;
                this.field3844[var18] = this.field3844[var18] * arg3 / 128;
                this.field3809[var18] += class301.field3699;
                this.field3871[var18] += class352.field4497;
                this.field3844[var18] += class378.field4786;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3882; var19++) {
                int var23 = (this.field3826[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3826[var19] = (byte) var23;
            }
            if (this.field3804 != null) {
                for (int var20 = 0; var20 < this.field3858; var20++) {
                    class602 var21 = this.field3804[var20];
                    class576 var22 = this.field3813[var20];
                    var22.field8050 = 255 - (this.field3826[var21.field8473] & 0xFF) << 24 | var22.field8050 & 0xFFFFFF;
                }
            }
            this.method1756(false);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3882; var24++) {
                int var28 = this.field3893[var24] & 0xFFFF;
                int var29 = (var28 & 0xFF88) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var29 + arg1 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field3893[var24] = (short) class444.method2376(class444.method2376(var31 << 10, var33 << 7), var34);
            }
            if (this.field3804 != null) {
                for (int var25 = 0; var25 < this.field3858; var25++) {
                    class602 var26 = this.field3804[var25];
                    class576 var27 = this.field3813[var25];
                    var27.field8050 = var27.field8050 & 0xFF000000 | class344.field4422[this.field3893[var26.field8473] & 0xFFFF] & 0xFFFFFF;
                }
            }
            this.method1756(false);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3858; var35++) {
                class576 var36 = this.field3813[var35];
                var36.field8046 += arg1;
                var36.field8043 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3858; var37++) {
                class576 var38 = this.field3813[var37];
                var38.field8052 = var38.field8052 * arg1 >> 7;
                var38.field8042 = var38.field8042 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3858; var39++) {
                class576 var40 = this.field3813[var39];
                var40.field8051 = var40.field8051 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "TA", descriptor = "()I", line = 6194)
    public final int method756() {
        field3855++;
        return this.field3852;
    }

    @OriginalMember(owner = "client!ja", name = "LA", descriptor = "()Z", line = 6205)
    public final boolean method740() {
        field3777++;
        return this.field3831;
    }

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "(Lha;)Lha;", line = 6214)
    public final class119 method752(class119 arg0) {
        field3814++;
        if (this.field3825 == 0) {
            return null;
        }
        if (!this.field3810) {
            this.method1762(false);
        }
        int var2;
        int var3;
        if (this.field3849.field6301 <= 0) {
            var2 = this.field3793 - (this.field3849.field6301 * this.field3883 >> 8) >> this.field3849.field6241;
            var3 = this.field3877 - (this.field3849.field6301 * this.field3845 >> 8) >> this.field3849.field6241;
        } else {
            var2 = this.field3793 - (this.field3849.field6301 * this.field3845 >> 8) >> this.field3849.field6241;
            var3 = this.field3877 - (this.field3849.field6301 * this.field3883 >> 8) >> this.field3849.field6241;
        }
        int var4;
        int var5;
        if (this.field3849.field6282 <= 0) {
            var4 = this.field3828 - (this.field3849.field6282 * this.field3883 >> 8) >> this.field3849.field6241;
            var5 = this.field3851 - (this.field3849.field6282 * this.field3845 >> 8) >> this.field3849.field6241;
        } else {
            var4 = this.field3828 - (this.field3849.field6282 * this.field3845 >> 8) >> this.field3849.field6241;
            var5 = this.field3851 - (this.field3849.field6282 * this.field3883 >> 8) >> this.field3849.field6241;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class100 var8 = (class100) arg0;
        class100 var9;
        if (var8 != null && var8.method570(var6, -104, var7)) {
            var9 = var8;
            var8.method573(38);
        } else {
            var9 = new class100(this.field3849, var6, var7);
        }
        var9.method569(var5, var4, 1831282672, var2, var3);
        this.method1760(var9, (byte) 45);
        return var9;
    }

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "(I)V", line = 6275)
    public final void method731(int arg0) {
        this.field3852 = (short) arg0;
        field3868++;
        this.method1756(false);
    }

    @OriginalMember(owner = "client!ja", name = "fa", descriptor = "(I)V", line = 6289)
    public final void method723(int arg0) {
        field3875++;
        int var2 = class453.field5810[arg0];
        int var3 = class453.field5811[arg0];
        for (int var4 = 0; var4 < this.field3839; var4++) {
            int var7 = this.field3844[var4] * var2 + this.field3809[var4] * var3 >> 14;
            this.field3844[var4] = this.field3844[var4] * var3 - this.field3809[var4] * var2 >> 14;
            this.field3809[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3825; var5++) {
            int var6 = this.field3815[var5] * var3 + this.field3794[var5] * var2 >> 14;
            this.field3794[var5] = (short) (this.field3794[var5] * var3 - (this.field3815[var5] * var2) >> 14);
            this.field3815[var5] = (short) var6;
        }
        this.method1758((byte) 112);
        this.method1767(55);
        this.field3810 = false;
    }
}
