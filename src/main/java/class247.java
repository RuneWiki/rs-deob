import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class247 extends class343 {

    @OriginalMember(owner = "client!ec", name = "pc", descriptor = "I")
    public int field3762 = 0;

    @OriginalMember(owner = "client!ec", name = "Kb", descriptor = "I")
    public int field3768 = -1000;

    @OriginalMember(owner = "client!ec", name = "Rc", descriptor = "B")
    public byte field3798 = 0;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "[I")
    public int[] field3760 = new int[class411.field6076];

    @OriginalMember(owner = "client!ec", name = "yc", descriptor = "I")
    public int field3796 = -1;

    @OriginalMember(owner = "client!ec", name = "qc", descriptor = "[I")
    public int[] field3761 = new int[class411.field6076];

    @OriginalMember(owner = "client!ec", name = "nb", descriptor = "I")
    public int field3792 = 0;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public int field3787 = -1000;

    @OriginalMember(owner = "client!ec", name = "Cb", descriptor = "[I")
    public int[] field3789 = new int[class411.field6076];

    @OriginalMember(owner = "client!ec", name = "nc", descriptor = "I")
    public int field3808 = 0;

    @OriginalMember(owner = "client!ec", name = "Hc", descriptor = "B")
    private byte field3765 = 0;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public int field3812 = 100;

    @OriginalMember(owner = "client!ec", name = "Zb", descriptor = "I")
    public int field3776 = 0;

    @OriginalMember(owner = "client!ec", name = "mc", descriptor = "[I")
    public int[] field3817 = new int[class411.field6076];

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public int field3801 = 0;

    @OriginalMember(owner = "client!ec", name = "Yb", descriptor = "I")
    public int field3779 = -32768;

    @OriginalMember(owner = "client!ec", name = "Ub", descriptor = "I")
    public int field3806 = 0;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    public int field3810 = 256;

    @OriginalMember(owner = "client!ec", name = "Sb", descriptor = "I")
    public int field3814 = -1;

    @OriginalMember(owner = "client!ec", name = "uc", descriptor = "I")
    public int field3821 = 0;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public int field3763 = -1;

    @OriginalMember(owner = "client!ec", name = "bc", descriptor = "Z")
    public boolean field3800 = true;

    @OriginalMember(owner = "client!ec", name = "vc", descriptor = "I")
    public int field3843 = -1;

    @OriginalMember(owner = "client!ec", name = "Nc", descriptor = "I")
    public int field3842 = -1;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "[I")
    public int[] field3838 = new int[class411.field6076];

    @OriginalMember(owner = "client!ec", name = "zc", descriptor = "I")
    public int field3824 = -1;

    @OriginalMember(owner = "client!ec", name = "Gb", descriptor = "I")
    public int field3836 = 0;

    @OriginalMember(owner = "client!ec", name = "Tb", descriptor = "I")
    public int field3803 = -1;

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "Z")
    public boolean field3846 = false;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "[I")
    public int[] field3841 = null;

    @OriginalMember(owner = "client!ec", name = "Pb", descriptor = "I")
    public int field3794 = 0;

    @OriginalMember(owner = "client!ec", name = "Bb", descriptor = "I")
    public int field3805 = 0;

    @OriginalMember(owner = "client!ec", name = "mb", descriptor = "I")
    public int field3847 = -1;

    @OriginalMember(owner = "client!ec", name = "ac", descriptor = "I")
    public int field3840 = 0;

    @OriginalMember(owner = "client!ec", name = "Bc", descriptor = "I")
    private int field3852 = 1;

    @OriginalMember(owner = "client!ec", name = "Qb", descriptor = "[I")
    public int[] field3853 = new int[class411.field6076];

    @OriginalMember(owner = "client!ec", name = "Ic", descriptor = "Ljava/lang/String;")
    public String field3782 = null;

    @OriginalMember(owner = "client!ec", name = "xb", descriptor = "Z")
    public boolean field3849 = false;

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "I")
    public int field3850 = 0;

    @OriginalMember(owner = "client!ec", name = "Gc", descriptor = "I")
    public int field3790 = 0;

    @OriginalMember(owner = "client!ec", name = "Hb", descriptor = "I")
    public int field3851 = 0;

    @OriginalMember(owner = "client!ec", name = "Lb", descriptor = "Lov;")
    public class199 field3839 = new class199();

    @OriginalMember(owner = "client!ec", name = "Vb", descriptor = "Lov;")
    private class199 field3855 = new class199();

    @OriginalMember(owner = "client!ec", name = "Qc", descriptor = "Lov;")
    private class199 field3856 = new class199();

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "[I")
    public int[] field3859 = new int[10];

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "[B")
    public byte[] field3857 = new byte[10];

    @OriginalMember(owner = "client!ec", name = "Kc", descriptor = "[I")
    public int[] field3863 = new int[10];

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "Z")
    public boolean field3860 = false;

    @OriginalMember(owner = "client!ec", name = "Xb", descriptor = "I")
    public int field3862 = 0;

    @OriginalMember(owner = "client!ec", name = "gc", descriptor = "I")
    public int field3858 = 0;

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "I")
    public int field3867 = 0;

    @OriginalMember(owner = "client!ec", name = "Pc", descriptor = "Z")
    public boolean field3864 = false;

    @OriginalMember(owner = "client!ec", name = "kc", descriptor = "I")
    public int field3866 = 0;

    @OriginalMember(owner = "client!ec", name = "rc", descriptor = "[Lgs;")
    public class49[] field3775;

    @OriginalMember(owner = "client!ec", name = "Ib", descriptor = "[Lka;")
    public class497[] field3865;

    @OriginalMember(owner = "client!ec", name = "Mc", descriptor = "[Laga;")
    public class694[] field3813;

    @OriginalMember(owner = "client!ec", name = "Sc", descriptor = "[Ljava/lang/String;")
    private static final String[] field3868 = new String[] { method2113(method2112("us\u000eV\u0007")), method2113(method2112("us\u000eJ\u0007")), method2113(method2112("~eLp")), method2113(method2112("k>\u000e2R")), method2113(method2112("us\u000eRn8")), method2113(method2112("us\u000e^n8")), method2113(method2112("us\u000eO\u0007")), method2113(method2112("us\u000eI\u0007")), method2113(method2112("us\u000eT\u0007")), method2113(method2112("us\u000ezF~qLuUu8")), method2113(method2112("us\u000eXn8")), method2113(method2112("us\u000eR\u0007")), method2113(method2112("us\u000eH\u0007")), method2113(method2112("us\u000eW\u0007")), method2113(method2112("us\u000eQn8")), method2113(method2112("us\u000eZ\u0007")), method2113(method2112("us\u000e F~yT\"\u0007")), method2113(method2112("us\u000e[n8")), method2113(method2112("us\u000eYn8")), method2113(method2112("us\u000e_n8")), method2113(method2112("us\u000eWn8")), method2113(method2112("us\u000eUn8")), method2113(method2112("us\u000ePn8")), method2113(method2112("us\u000eM\u0007")), method2113(method2112("us\u000eS\u0007")), method2113(method2112("us\u000eZn8")), method2113(method2112("us\u000eQ\u0007")), method2113(method2112("us\u000eN\u0007")) };

    @OriginalMember(owner = "client!ec", name = "xc", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!ec", name = "sc", descriptor = "B")
    public byte field3823;

    @OriginalMember(owner = "client!ec", name = "Ec", descriptor = "B")
    public byte field3831;

    @OriginalMember(owner = "client!ec", name = "tc", descriptor = "B")
    public byte field3837;

    @OriginalMember(owner = "client!ec", name = "Dc", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!ec", name = "qb", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!ec", name = "ob", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!ec", name = "sb", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ec", name = "dc", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!ec", name = "fc", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ec", name = "Ac", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ec", name = "ec", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!ec", name = "lc", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ec", name = "Ob", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ec", name = "Lc", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!ec", name = "Eb", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ec", name = "Wb", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ec", name = "vb", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ec", name = "Mb", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ec", name = "oc", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!ec", name = "ub", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!ec", name = "wc", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ec", name = "jc", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!ec", name = "Fc", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ec", name = "Rb", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ec", name = "Oc", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ec", name = "Jb", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ec", name = "Nb", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ec", name = "rb", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!ec", name = "tb", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ec", name = "zb", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ec", name = "cc", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ec", name = "yb", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!ec", name = "Jc", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!ec", name = "Fb", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!ec", name = "hc", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ec", name = "pb", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ec", name = "Ab", descriptor = "I")
    public int field3845;

    @OriginalMember(owner = "client!ec", name = "ic", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "Lkq;")
    public class619 field3861;

    @OriginalMember(owner = "client!ec", name = "wb", descriptor = "Z")
    public static boolean field3844;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "[I")
    public int[] field3816;

    @OriginalMember(owner = "client!ec", name = "Cc", descriptor = "[I")
    public int[] field3822;

    @OriginalMember(owner = "client!ec", name = "Db", descriptor = "[Ltu;")
    public static class367[] field3848;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)Z", line = 11)
    public final boolean method1098(boolean arg0) {
        try {
            if (arg0) {
                this.method2099(97);
            }
            ++field3807;
            return this.field3860;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3868[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 26)
    public class247() {
        super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        try {
            this.field3775 = new class49[3];
            this.field3865 = new class497[4];
            for (int var1 = 0; ~var1 > -4; ++var1) {
                this.field3775[var1] = new class49(this);
            }
            this.field3813 = new class694[class463.field6746.field1042.length];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3868[16] + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "(I)V", line = 44)
    public final void method1904(int arg0) {
        try {
            ++field3809;
            if (arg0 != 310992073) {
                this.field3823 = 89;
            }
            int var2 = (this.field3852 + -1 << 8) + 240;
            super.field5325 = (short) (super.field6211 + var2 >> 9);
            super.field5330 = (short) (-var2 + super.field6197 >> 9);
            super.field5335 = (short) (super.field6197 + var2 >> 9);
            super.field5329 = (short) (-var2 + super.field6211 >> 9);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3868[27] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V", line = 74)
    public static final void method2091(byte arg0) {
        try {
            ++field3774;
            class546.field8157.method1669((byte) 111);
            class224.field3429.method5418(9733);
            class513.field7378.method4816((byte) -122);
            class417.field6144.method3025((byte) 58);
            class262.field4035.method4255(120);
            class540.field7920.method4997((byte) 66);
            class272.field4122.method2244(64);
            class771.field11208.method2511(28141);
            class369.field5638.method4269(102);
            class289.field4303.method2901((byte) -54);
            class747.field10862.method4700(54);
            class496.field7116.method4852(true);
            int var1 = 37 / ((arg0 - 32) / 38);
            class617.field9073.method4608(10724);
            class643.field9316.method619((byte) 34);
            class329.field5185.method2535(true);
            class566.field8395.method3415(-63);
            class596.field8739.method938((byte) 78);
            class13.field162.method75(0);
            class640.field9301.method355(101);
            class208.field3189.method3059(-107);
            class496.field7133.method3421(0);
            class81.field924.method4984(-91);
            class290.method2354((byte) 102);
            class204.method1816((byte) 47);
            class176.method1546(125);
            class394.method3120((byte) 77);
            class761.method5505(44);
            class608.field8892.method1569(10574);
            class757.field10996.method1569(10574);
            class83.field928.method1569(10574);
            class269.field4096.method1569(10574);
            class782.field11383.method1569(10574);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3868[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "(I)I", line = 115)
    public final int method1088(int arg0) {
        try {
            if (arg0 != -2226) {
                return 53;
            } else {
                ++field3769;
                return ~this.field3779 == 32767 ? 0 : this.field3779;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3868[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 133)
    public final void method2092(byte arg0) {
        try {
            this.field3862 = 0;
            int var2 = 17 % ((arg0 - 8) / 40);
            ++field3815;
            this.field3858 = 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3868[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZ)V", line = 158)
    public final void method2093(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field3783;
            int var7 = super.field5335 - -super.field5330 >> 1;
            int var8 = super.field5329 + super.field5325 >> 1;
            int var9 = class298.field4704[arg1];
            int var10 = class298.field4703[arg1];
            int var11 = -arg4 / 2;
            int var12 = -arg3 / 2;
            int var13 = var9 * var12 + var10 * var11 >> 14;
            int var14 = var10 * var12 - var9 * var11 >> 14;
            int var15 = class473.method3591(super.field6200, (byte) -43, var7, super.field6211 + var14, super.field6197 - -var13, var8);
            int var16 = arg4 / 2;
            int var17 = -arg3 / 2;
            int var18 = var9 * var17 - -(var10 * var16) >> 14;
            int var19 = var10 * var17 + -(var9 * var16) >> 14;
            int var20 = class473.method3591(super.field6200, (byte) 84, var7, super.field6211 + var19, super.field6197 + var18, var8);
            int var21 = -arg4 / 2;
            int var22 = arg3 / 2;
            int var23 = var9 * var22 + var10 * var21 >> 14;
            int var24 = var10 * var22 + -(var9 * var21) >> 14;
            int var25 = class473.method3591(super.field6200, (byte) -87, var7, super.field6211 - -var24, super.field6197 + var23, var8);
            int var26 = arg4 / 2;
            int var27 = arg3 / 2;
            int var28 = var9 * var27 + var10 * var26 >> 14;
            int var29 = var10 * var27 + -(var9 * var26) >> 14;
            int var30 = class473.method3591(super.field6200, (byte) -37, var7, super.field6211 + var29, super.field6197 + var28, var8);
            int var31 = var15 >= var20 ? var20 : var15;
            int var32 = ~var25 <= ~var30 ? var30 : var25;
            int var33 = ~var30 >= ~var20 ? var30 : var20;
            int var34 = ~var25 < ~var15 ? var15 : var25;
            this.field3828 = (int) (Math.atan2((double) (-var32 + var31), (double) arg3) * 2607.5945876176133D) & 16383;
            this.field3773 = (int) (2607.5945876176133D * Math.atan2((double) (var34 - var33), (double) arg4)) & 16383;
            if (~this.field3828 != -1 && ~arg0 != -1) {
                int var35 = -arg0 + 16384;
                if (~this.field3828 >= -8193) {
                    if (~arg0 > ~this.field3828) {
                        this.field3828 = arg0;
                    }
                } else if (var35 > this.field3828) {
                    this.field3828 = var35;
                }
            }
            this.field3830 = var15 - -var30;
            if (!arg5) {
                this.method1088(123);
            }
            if (~this.field3773 != -1 && arg2 != 0) {
                int var36 = 16384 - arg2;
                if (this.field3773 <= 8192) {
                    if (arg2 < this.field3773) {
                        this.field3773 = arg2;
                    }
                } else if (this.field3773 < var36) {
                    this.field3773 = var36;
                }
            }
            if (var20 + var25 < this.field3830) {
                this.field3830 = var20 - -var25;
            }
            this.field3830 = (this.field3830 >> 1) + -super.field6199;
        } catch (RuntimeException var38) {
            throw class759.method5498(var38, field3868[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIZLeea;Lha;I)V", line = 271)
    public final void method2094(int arg0, int arg1, int arg2, boolean arg3, class144 arg4, class66 arg5, int arg6) {
        try {
            if (!arg3) {
                this.field3813 = null;
            }
            for (int var8 = 0; var8 < this.field3775.length; ++var8) {
                byte var9 = 0;
                if (~var8 == -1) {
                    var9 = 2;
                } else if (var8 == 1) {
                    var9 = 5;
                } else if (~var8 == -3) {
                    var9 = 1;
                }
                class49 var10 = this.field3775[var8];
                if (~var10.field563 != 0 && ~var10.field558 != 0) {
                    class217 var11 = class771.field11208.method2509(-122, var10.field563);
                    boolean var12 = ~var11.field3320 == -4 && (arg0 != 0 || ~arg6 != -1);
                    int var13 = arg2;
                    if (!var12) {
                        if (~var10.field557 != -1) {
                            var13 = arg2 | 5;
                        }
                        if (~var10.field555 != -1) {
                            var13 |= 2;
                        }
                        if (~var10.field553 <= -1) {
                            var13 |= 7;
                        }
                    } else {
                        var13 = arg2 | 7;
                    }
                    class497 var14 = this.field3865[var8 + 1] = var11.method1892(var10.field558, var13, var10.field561, class272.field4122, var9, arg5, var10.field554, (byte) 5);
                    if (var14 != null) {
                        if (~var10.field553 <= -1 && arg4.field1769 != null && arg4.field1769[var10.field553] != null) {
                            int var15 = 0;
                            int var16 = 0;
                            int var17 = 0;
                            if (arg4.field1769 != null && arg4.field1769[var10.field553] != null) {
                                var17 += arg4.field1769[var10.field553][2];
                                var15 += arg4.field1769[var10.field553][0];
                                var16 += arg4.field1769[var10.field553][1];
                            }
                            if (arg4.field1777 != null && arg4.field1777[var10.field553] != null) {
                                var15 += arg4.field1777[var10.field553][0];
                                var17 += arg4.field1777[var10.field553][2];
                                var16 += arg4.field1777[var10.field553][1];
                            }
                            if (var17 != 0 || var15 != 0) {
                                int var18 = arg1;
                                if (this.field3816 != null && this.field3816[var10.field553] != -1) {
                                    var18 = this.field3816[var10.field553];
                                }
                                int var19 = 16383 & var10.field557 * 2048 - -var18 + -arg1;
                                if (~var19 != -1) {
                                    var14.method312(var19);
                                }
                                int var20 = class298.field4704[var19];
                                int var21 = class298.field4703[var19];
                                int var22 = var15 * var21 + var17 * var20 >> 14;
                                var17 = var17 * var21 + -(var15 * var20) >> 14;
                                var15 = var22;
                            }
                            var14.method298(var15, var16, var17);
                        } else if (var10.field557 != 0) {
                            var14.method312(var10.field557 * 2048);
                        }
                        if (var10.field555 != 0) {
                            var14.method298(0, -var10.field555 << 2, 0);
                        }
                        if (var12) {
                            if (this.field3828 != 0) {
                                var14.method325(this.field3828);
                            }
                            if (this.field3773 != 0) {
                                var14.method344(this.field3773);
                            }
                            if (this.field3830 != 0) {
                                var14.method298(0, this.field3830, 0);
                            }
                        }
                    }
                } else {
                    this.field3865[var8 + 1] = null;
                }
            }
            ++field3797;
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field3868[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3868[3] : field3868[2]) + ',' + (arg5 != null ? field3868[3] : field3868[2]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V", line = 413)
    public final void method2095(byte arg0, int arg1) {
        try {
            this.field3852 = arg1;
            if (arg0 != -80) {
                this.field3803 = -41;
            }
            ++field3802;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3868[22] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[I[I)V", line = 447)
    public final void method2096(int arg0, int[] arg1, int[] arg2) {
        try {
            ++field3825;
            if (this.field3822 == null && arg2 != null) {
                this.field3822 = new int[class463.field6746.field1042.length];
            } else if (arg2 == null) {
                this.field3822 = null;
                return;
            }
            for (int var4 = 0; this.field3822.length > var4; ++var4) {
                this.field3822[var4] = -1;
            }
            if (arg0 <= 78) {
                this.field3837 = 7;
            }
            for (int var5 = 0; ~var5 > ~arg2.length; ++var5) {
                int var6 = arg1[var5];
                int var7 = 0;
                while (~var7 > ~this.field3822.length) {
                    if ((var6 & 1) != 0) {
                        this.field3822[var7] = arg2[var5];
                    }
                    ++var7;
                    var6 >>= 1;
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3868[26] + arg0 + ',' + (arg1 != null ? field3868[3] : field3868[2]) + ',' + (arg2 != null ? field3868[3] : field3868[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 505)
    public final void method2097(int arg0, int arg1) {
        try {
            if (arg1 != 0) {
                this.method2108((class497) null, (byte) 126);
            }
            ++field3793;
            class144 var3 = this.method2099(arg1 ^ 114);
            if (~var3.field1766 != -1 || ~this.field3810 != -1) {
                this.field3839.method1786(~arg1);
                int var4 = -this.field3839.field3110 + arg0 & 16383;
                if (var4 > 8192) {
                    this.field3845 = -16384 - -var4 + this.field3839.field3110;
                } else {
                    this.field3845 = this.field3839.field3110 + var4;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3868[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Leea;", line = 540)
    public final class144 method2099(int arg0) {
        try {
            if (arg0 <= 96) {
                return null;
            } else {
                ++field3772;
                int var2 = this.method2098(true);
                return var2 != -1 ? class496.field7116.method4847(var2, 32259) : class781.field11367;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3868[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I", line = 562)
    public int method2101(int arg0) {
        try {
            if (arg0 != 31463) {
                return 112;
            } else {
                ++field3835;
                return this.field3852;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3868[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)I", line = 573)
    public int method2102(byte arg0) {
        try {
            if (arg0 < 20) {
                field3844 = false;
            }
            ++field3777;
            class144 var2 = this.method2099(102);
            int var3;
            if (var2.field1740 != -1) {
                var3 = var2.field1740;
            } else if (~this.field3779 != 32767) {
                var3 = -this.field3779;
            } else {
                var3 = 200;
            }
            class96 var4 = class734.field10683[super.field6200][super.field6197 >> class602.field8828][super.field6211 >> class602.field8828];
            return var4 != null && var4.field1081 != null ? var4.field1081.field10900 + var3 : var3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3868[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Z", line = 604)
    public final boolean method1082(byte arg0) {
        try {
            ++field3778;
            if (arg0 != 27) {
                this.field3866 = -37;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3868[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIZ)V", line = 625)
    public final void method2103(int arg0, int arg1, boolean arg2) {
        try {
            ++field3785;
            class144 var4 = this.method2099(arg0 ^ 103);
            if (arg2 || var4.field1766 != 0 || ~this.field3810 != -1) {
                if (arg0 != 0) {
                    this.field3765 = 36;
                }
                this.field3845 = 16383 & arg1;
                this.field3839.method1783(121, this.field3845);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3868[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 664)
    public static void method2104(int arg0) {
        try {
            if (arg0 != 0) {
                field3844 = true;
            }
            field3848 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3868[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "(I)I", line = 678)
    public final int method2105(int arg0) {
        try {
            ++field3799;
            if (arg0 != 1) {
                return -91;
            } else {
                class144 var2 = this.method2099(125);
                int var3 = this.field3839.field3110;
                boolean var4;
                if (var2.field1766 != 0) {
                    var4 = this.field3839.method1784(102, var2.field1766, this.field3845, var2.field1764);
                } else {
                    var4 = this.field3839.method1784(127, this.field3810, this.field3845, this.field3810);
                }
                int var5 = -var3 + this.field3839.field3110;
                if (~var5 != -1) {
                    ++this.field3792;
                } else {
                    this.field3792 = 0;
                    this.field3839.method1783(124, this.field3845);
                }
                if (!var4) {
                    if (var2.field1779 != 0) {
                        this.field3855.method1784(124, var2.field1779, 0, var2.field1767);
                    } else {
                        this.field3855.method1783(arg0 ^ 126, 0);
                    }
                    if (~var2.field1728 == -1) {
                        this.field3856.method1783(123, 0);
                    } else {
                        this.field3856.method1784(112, var2.field1728, 0, var2.field1737);
                    }
                } else {
                    if (var2.field1779 != 0) {
                        if (var5 <= 0) {
                            this.field3855.method1784(113, var2.field1779, -var2.field1741, var2.field1767);
                        } else {
                            this.field3855.method1784(arg0 ^ 117, var2.field1779, var2.field1741, var2.field1767);
                        }
                    }
                    if (var2.field1728 != 0) {
                        this.field3856.method1784(118, var2.field1728, var2.field1778, var2.field1737);
                    }
                }
                return var5;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3868[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V", line = 741)
    protected final void finalize() {
        try {
            if (this.field3861 != null) {
                this.field3861.method4622();
            }
            ++field3781;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3868[9] + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lha;ZLqq;B[Lka;)V", line = 757)
    public final void method2106(class66 arg0, boolean arg1, class501 arg2, byte arg3, class497[] arg4) {
        try {
            if (arg3 >= -119) {
                this.method2108((class497) null, (byte) -64);
            }
            if (arg1) {
                if (this.field3861 != null) {
                    this.field3861.method4627((long) class375.field5711);
                }
            } else {
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                int var10 = -1;
                int var11 = -1;
                class659[][] var12 = new class659[arg4.length][];
                class426[][] var13 = new class426[arg4.length][];
                for (int var14 = 0; ~arg4.length < ~var14; ++var14) {
                    if (arg4[var14] != null) {
                        arg4[var14].method349(arg2);
                        var12[var14] = arg4[var14].method324();
                        var13[var14] = arg4[var14].method345();
                        if (var12[var14] != null) {
                            var6 += var12[var14].length;
                            ++var7;
                            var10 = var14;
                        }
                        if (var13[var14] != null) {
                            var11 = var14;
                            ++var9;
                            var8 += var13[var14].length;
                        }
                    }
                }
                if ((this.field3861 == null || this.field3861.field9095) && (var7 > 0 || ~var9 < -1)) {
                    this.field3861 = class619.method4620(class375.field5711, true);
                }
                if (this.field3861 != null) {
                    Object var15 = null;
                    class659[] var16;
                    if (~var7 != -2) {
                        var16 = new class659[var6];
                        int var17 = 0;
                        for (int var18 = 0; var18 < arg4.length; ++var18) {
                            if (var12[var18] != null) {
                                class467.method3554(var12[var18], 0, var16, var17, var12[var18].length);
                                var17 += var12[var18].length;
                            }
                        }
                    } else {
                        var16 = var12[var10];
                    }
                    Object var19 = null;
                    class426[] var20;
                    if (~var9 != -2) {
                        var20 = new class426[var8];
                        int var21 = 0;
                        for (int var22 = 0; ~arg4.length < ~var22; ++var22) {
                            if (var13[var22] != null) {
                                class467.method3554(var13[var22], 0, var20, var21, var13[var22].length);
                                var21 += var13[var22].length;
                            }
                        }
                    } else {
                        var20 = var13[var11];
                    }
                    this.field3861.method4612(arg0, (long) class375.field5711, var16, var20, false);
                    this.field3864 = true;
                }
            }
            ++field3854;
            if (this.field3861 != null) {
                this.field3861.method4626(super.field6200, super.field5330, super.field5335, super.field5329, super.field5325);
            }
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field3868[4] + (arg0 != null ? field3868[3] : field3868[2]) + ',' + arg1 + ',' + (arg2 != null ? field3868[3] : field3868[2]) + ',' + arg3 + ',' + (arg4 != null ? field3868[3] : field3868[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V", line = 889)
    public final void method2107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field3834;
            class49 var7 = this.field3775[arg4];
            int var8 = var7.field563;
            if (~arg0 != 0 && var8 != -1) {
                if (arg0 == var8) {
                    class217 var9 = class771.field11208.method2509(-98, arg0);
                    if (var9.field3306 && ~var9.field3313 != 0) {
                        class344 var10 = class272.field4122.method2242(var9.field3313, 100);
                        int var11 = var10.field5364;
                        if (var11 == 0) {
                            return;
                        }
                        if (~var11 == -3) {
                            var7.field560 = 0;
                            return;
                        }
                    }
                } else {
                    class217 var12 = class771.field11208.method2509(-103, arg0);
                    class217 var13 = class771.field11208.method2509(-114, var8);
                    if (var12.field3313 != -1 && var13.field3313 != -1) {
                        class344 var14 = class272.field4122.method2242(var12.field3313, 100);
                        class344 var15 = class272.field4122.method2242(var13.field3313, 100);
                        if (var14.field5348 < var15.field5348) {
                            return;
                        }
                    }
                }
            }
            var7.field555 = arg5 >> 16;
            var7.field553 = arg2;
            int var16 = class375.field5711;
            var7.field563 = arg0;
            var7.field561 = 1;
            var7.field554 = 0;
            if (arg1 < -71) {
                var7.field557 = arg3;
                var7.field558 = 0;
                var7.field562 = (65535 & arg5) + var16;
                if (var7.field562 > var16) {
                    var7.field558 = -1;
                }
                if (~var7.field563 != 0 && ~var7.field562 == ~var16) {
                    int var17 = class771.field11208.method2509(-116, var7.field563).field3313;
                    if (~var17 != 0) {
                        class344 var18 = class272.field4122.method2242(var17, 100);
                        if (var18 != null && var18.field5366 != null && !this.field3800) {
                            class418.method3242(-256, var18, this, 0);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field3868[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lka;B)V", line = 987)
    public final void method2108(class497 arg0, byte arg1) {
        try {
            ++field3826;
            if (arg1 != 30) {
                this.field3833 = 53;
            }
            int var3 = this.field3855.field3110;
            int var4 = this.field3856.field3110;
            if (~var3 != -1 || var4 != 0) {
                int var5 = arg0.method305() / 2;
                arg0.method298(0, -var5, 0);
                arg0.method344(16383 & var3);
                arg0.method325(var4 & 16383);
                arg0.method298(0, var5, 0);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3868[20] + (arg0 != null ? field3868[3] : field3868[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIBIIII)V", line = 1012)
    public final void method2109(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            ++field3820;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = -64 / ((-21 - arg3) / 34);
            for (int var12 = 0; class411.field6076 > var12; ++var12) {
                if (~this.field3853[var12] < ~arg7) {
                    var9 = false;
                } else {
                    var10 = false;
                }
            }
            int var13 = -1;
            int var14 = -1;
            int var15 = 0;
            if (arg6 >= 0) {
                class772 var16 = class81.field924.method4987(-21990, arg6);
                var14 = var16.field11214;
                var15 = var16.field11233;
            }
            if (!var10) {
                if (var9) {
                    this.field3765 = 0;
                }
                for (int var17 = 0; ~var17 > ~class411.field6076; ++var17) {
                    byte var18 = this.field3765;
                    this.field3765 = (byte) ((this.field3765 + 1) % class411.field6076);
                    if (arg7 >= this.field3853[var18]) {
                        var13 = var18;
                        break;
                    }
                }
            } else {
                if (~var14 == 0) {
                    return;
                }
                var13 = 0;
                int var19 = 0;
                if (~var14 != -1) {
                    if (var14 == 1) {
                        var19 = this.field3817[0];
                    }
                } else {
                    var19 = this.field3853[0];
                }
                for (int var20 = 1; class411.field6076 > var20; ++var20) {
                    if (var14 != 0) {
                        if (~var14 == -2 && ~var19 < ~this.field3817[var20]) {
                            var19 = this.field3817[var20];
                            var13 = var20;
                        }
                    } else if (~var19 < ~this.field3853[var20]) {
                        var13 = var20;
                        var19 = this.field3853[var20];
                    }
                }
                if (~var14 == -2 && var19 >= arg0) {
                    return;
                }
            }
            if (~var13 <= -1) {
                this.field3838[var13] = arg6;
                this.field3817[var13] = arg0;
                this.field3760[var13] = arg5;
                this.field3761[var13] = arg4;
                this.field3853[var13] = arg7 - (-var15 - arg1);
                this.field3789[var13] = arg2;
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field3868[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z", line = 1147)
    public final boolean method2110(int arg0, int arg1, int arg2) {
        try {
            ++field3784;
            if (this.field3816 == null) {
                if (~arg0 == 0) {
                    return true;
                }
                this.field3816 = new int[class463.field6746.field1042.length];
                for (int var4 = 0; ~var4 > ~class463.field6746.field1042.length; ++var4) {
                    this.field3816[var4] = -1;
                }
            }
            class144 var5 = this.method2099(arg1 + 102);
            int var6 = 256;
            if (var5.field1758 != null && var5.field1758[arg2] > 0) {
                var6 = var5.field1758[arg2];
            }
            if (~arg0 == arg1) {
                if (this.field3816[arg2] == -1) {
                    return true;
                } else {
                    int var7 = this.field3839.method1785(5);
                    int var8 = this.field3816[arg2];
                    int var9 = -var8 + var7;
                    if (~(-var6) >= ~var9 && var6 >= var9) {
                        this.field3816[arg2] = -1;
                        for (int var10 = 0; ~class463.field6746.field1042.length < ~var10; ++var10) {
                            if (~this.field3816[var10] != 0) {
                                return true;
                            }
                        }
                        this.field3816 = null;
                        return true;
                    } else {
                        if ((var9 <= 0 || ~var9 < -8193) && ~var9 < 8191) {
                            this.field3816[arg2] = class291.method2359(16383, -var6 + var8);
                        } else {
                            this.field3816[arg2] = class291.method2359(var6 + var8, 16383);
                        }
                        return false;
                    }
                }
            } else {
                if (~this.field3816[arg2] == 0) {
                    this.field3816[arg2] = this.field3839.method1785(class219.method1916(arg1, 5));
                }
                int var11 = this.field3816[arg2];
                int var12 = -var11 + arg0;
                if (var12 >= -var6 && ~var6 <= ~var12) {
                    this.field3816[arg2] = arg0;
                    return true;
                } else {
                    if ((var12 <= 0 || ~var12 < -8193) && ~var12 < 8191) {
                        this.field3816[arg2] = class291.method2359(16383, -var6 + var11);
                    } else {
                        this.field3816[arg2] = class291.method2359(var6 + var11, 16383);
                    }
                    return false;
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field3868[19] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[B)Lfs;", line = 1247)
    public static final class581 method2111(int arg0, byte[] arg1) {
        try {
            if (arg0 != 4699) {
                return null;
            } else {
                ++field3819;
                if (arg1 == null) {
                    throw new RuntimeException("");
                } else {
                    while (true) {
                        try {
                            Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                            MediaTracker var3 = new MediaTracker(class43.field504);
                            var3.addImage(var2, 0);
                            var3.waitForAll();
                            int var4 = var2.getWidth(class43.field504);
                            int var5 = var2.getHeight(class43.field504);
                            if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                                int[] var6 = new int[var4 * var5];
                                PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                                var7.grabPixels();
                                return class610.field8913.method520(0, var4, var6, (byte) 41, var4, var5);
                            }
                            throw new RuntimeException("");
                        } catch (InterruptedException var9) {
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3868[1] + arg0 + ',' + (arg1 != null ? field3868[3] : field3868[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)I", line = 1310)
    public final int method1093(int arg0) {
        try {
            if (arg0 != -3) {
                this.method2108((class497) null, (byte) -15);
            }
            ++field3786;
            return this.field3836;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3868[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
    public abstract int method2098(boolean arg0);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "(B)I")
    public abstract int method2100(byte arg0);

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2112(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2113(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
