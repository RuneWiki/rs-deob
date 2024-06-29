import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class182 extends class189 {

    @OriginalMember(owner = "client!ub", name = "tb", descriptor = "I")
    private int field3695 = 4096;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    private int field3686 = 409;

    @OriginalMember(owner = "client!ub", name = "ub", descriptor = "I")
    private int field3696 = 4096;

    @OriginalMember(owner = "client!ub", name = "xb", descriptor = "I")
    private int field3699 = 4096;

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "[I")
    private int[] field3688 = new int[3];

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "Lgg;")
    public static class63 field3683 = class116.method911(43, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "Lgg;")
    private static class63 field3685 = class116.method911(43, "The server is being updated)3");

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lgg;")
    private static class63 field3684 = class116.method911(43, "Your account is already logged in)3");

    @OriginalMember(owner = "client!ub", name = "sb", descriptor = "I")
    public static int field3694 = 0;

    @OriginalMember(owner = "client!ub", name = "qb", descriptor = "Lgg;")
    public static class63 field3692 = field3685;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "Lgg;")
    public static class63 field3687 = field3684;

    @OriginalMember(owner = "client!ub", name = "rb", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!ub", name = "ob", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ub", name = "vb", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ub", name = "zb", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ub", name = "wb", descriptor = "Lec;")
    public static class42 field3698;

    @OriginalMember(owner = "client!ub", name = "pb", descriptor = "[I")
    public static int[] field3691;

    @OriginalMember(owner = "client!ub", name = "yb", descriptor = "[I")
    public static int[] field3700;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[BIIII[Lie;)V")
    public static final void method1205(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class79[] arg6) {
        for (int var7 = 0; ~var7 > -5; ++var7) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (arg4 - -var13 > 0 && ~(arg4 - -var13) > -104 && arg2 + var14 > 0 && arg2 + var14 < 103) {
                        arg6[var7].field1909[arg4 - -var13][arg2 + var14] = class110.method881(arg6[var7].field1909[arg4 - -var13][arg2 + var14], -16777217);
                    }
                }
            }
        }
        ++field3697;
        int var8 = -120 % (-arg0 / 48);
        class3 var9 = new class3(arg1);
        for (int var10 = 0; ~var10 > -5; ++var10) {
            for (int var11 = 0; ~var11 > -65; ++var11) {
                for (int var12 = 0; ~var12 > -65; ++var12) {
                    class38.method359(arg2 + var12, 0, arg5, arg3, var10, arg4 + var11, 4, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
    public static void method1206(byte arg0) {
        int var1 = -93 / ((8 - arg0) / 38);
        field3687 = null;
        field3685 = null;
        field3692 = null;
        field3698 = null;
        field3691 = null;
        field3683 = null;
        field3684 = null;
        field3700 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 < 32) {
            this.field3688 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method20((byte) 66);
                            this.field3688[2] = class110.method881(var5 >> 12, 0);
                            this.field3688[0] = class110.method881(267386880, var5 << 4);
                            this.field3688[1] = class110.method881(4080, var5 >> 4);
                        }
                    } else {
                        this.field3699 = arg2.method46((byte) 65);
                    }
                } else {
                    this.field3695 = arg2.method46((byte) 65);
                }
            } else {
                this.field3696 = arg2.method46((byte) 65);
            }
        } else {
            this.field3686 = arg2.method46((byte) 65);
        }
        ++field3701;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field3689;
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int[][] var4 = this.method1244((byte) 20, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class54.field1430; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3688[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > this.field3686) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field3688[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field3686 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3688[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3686 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3699 * var12 >> 12;
                            var9[var11] = this.field3695 * var14 >> 12;
                            var10[var11] = this.field3696 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 <= 34) {
            this.method77(51, (byte) -63, (class3) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, false);
    }
}
