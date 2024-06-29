import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class222 extends class1 {

    @OriginalMember(owner = "client!vd", name = "kb", descriptor = "I")
    private int field3842 = 0;

    @OriginalMember(owner = "client!vd", name = "ob", descriptor = "I")
    private int field3846 = 2048;

    @OriginalMember(owner = "client!vd", name = "pb", descriptor = "I")
    private int field3847 = 10;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "Loc;")
    public static class151 field3839 = class137.method873(2, ")2");

    @OriginalMember(owner = "client!vd", name = "qb", descriptor = "[Loc;")
    public static class151[] field3848 = new class151[1000];

    @OriginalMember(owner = "client!vd", name = "sb", descriptor = "[I")
    public static int[] field3850 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vd", name = "mb", descriptor = "Z")
    public static boolean field3844 = false;

    @OriginalMember(owner = "client!vd", name = "Bb", descriptor = "Loc;")
    public static class151 field3859 = class137.method873(2, "<col=80ff00>");

    @OriginalMember(owner = "client!vd", name = "Cb", descriptor = "Lwd;")
    public static class232 field3860 = null;

    @OriginalMember(owner = "client!vd", name = "Ab", descriptor = "[I")
    public static int[] field3858 = new int[100];

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!vd", name = "ub", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!vd", name = "wb", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!vd", name = "xb", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!vd", name = "yb", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!vd", name = "zb", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!vd", name = "vb", descriptor = "Lnd;")
    public static class142 field3853;

    @OriginalMember(owner = "client!vd", name = "tb", descriptor = "Lwa;")
    public static class229 field3851;

    @OriginalMember(owner = "client!vd", name = "lb", descriptor = "Lcg;")
    public static class30 field3843;

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "[I")
    private int[] field3841;

    @OriginalMember(owner = "client!vd", name = "nb", descriptor = "[I")
    private int[] field3845;

    @OriginalMember(owner = "client!vd", name = "rb", descriptor = "[Lad;")
    public static class5[] field3849;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
    private final void method1395(int arg0) {
        this.field3841 = new int[this.field3847 + 1];
        ++field3852;
        this.field3845 = new int[this.field3847 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field3847;
        int var4 = this.field3846 * var3 >> 12;
        int var5 = 0;
        if (arg0 >= 1) {
            while (~var5 > ~this.field3847) {
                this.field3841[var5] = var2;
                this.field3845[var5] = var2 - -var4;
                var2 += var3;
                ++var5;
            }
            this.field3841[this.field3847] = 4096;
            this.field3845[this.field3847] = this.field3845[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
    public static void method1396(int arg0) {
        field3860 = null;
        field3859 = null;
        field3851 = null;
        field3858 = null;
        field3843 = null;
        field3850 = null;
        if (arg0 != 0) {
            method1396(-118);
        }
        field3853 = null;
        field3848 = null;
        field3849 = null;
        field3839 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (arg0 != 107) {
            this.method1395(-40);
        }
        ++field3840;
        if (super.field21.field3388) {
            int var4 = class23.field509[arg1];
            if (this.field3842 != 0) {
                for (int var5 = 0; ~class202.field3603 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class195.field3477[var5];
                    int var9 = this.field3842;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var8 - -var4 - 4096 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field3847; ++var10) {
                        if (var6 >= this.field3841[var10] && this.field3841[var10 + 1] > var6) {
                            if (var6 < this.field3845[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field3847 > var12; ++var12) {
                    if (this.field3841[var12] <= var4 && var4 < this.field3841[var12 + 1]) {
                        if (~var4 > ~this.field3845[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class145.method923(var3, 0, class202.field3603, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field3855;
        if (arg0 != 0) {
            field3853 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3842 = arg2.method1475(arg0 + 255);
                }
            } else {
                this.field3846 = arg2.method1490((byte) 73);
            }
        } else {
            this.field3847 = arg2.method1475(255);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        this.method1395(107);
        if (arg0 != 3) {
            this.method1395(-23);
        }
        ++field3857;
    }
}
