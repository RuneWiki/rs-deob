import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class306 extends class634 {

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    private int field3809 = 2048;

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "I")
    private int field3814 = 10;

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "I")
    private int field3813 = 0;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
    public static int field3815 = 0;

    @OriginalMember(owner = "client!bv", name = "R", descriptor = "F")
    public static float field3819 = 0.25F;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!bv", name = "P", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!bv", name = "Q", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!bv", name = "S", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "[I")
    private int[] field3810;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "[I")
    private int[] field3812;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)V")
    private final void method1834(int arg0) {
        ++field3816;
        int var2 = 0;
        this.field3812 = new int[this.field3814 + 1];
        this.field3810 = new int[this.field3814 - -1];
        int var3 = 4096 / this.field3814;
        int var4 = this.field3809 * var3 >> 12;
        for (int var5 = arg0; ~this.field3814 < ~var5; ++var5) {
            this.field3810[var5] = var2;
            this.field3812[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3810[this.field3814] = 4096;
        this.field3812[this.field3814] = this.field3812[0] + 4096;
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 >= 65) {
            this.method1834(0);
            ++field3820;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field3818;
        if (arg0 > -55) {
            field3819 = -0.35284317F;
        }
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int var4 = class164.field1840[arg1];
            if (~this.field3813 != -1) {
                for (int var5 = 0; ~class635.field9139 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class246.field2980[var5];
                    int var9 = this.field3813;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field3814 > var10; ++var10) {
                        if (~this.field3810[var10] >= ~var6 && var6 < this.field3810[var10 - -1]) {
                            if (~this.field3812[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field3814; ++var12) {
                    if (this.field3810[var12] <= var4 && this.field3810[var12 + 1] > var4) {
                        if (~var4 > ~this.field3812[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class143.method896(var3, 0, class635.field9139, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3813 = arg1.method1423(-16);
                }
            } else {
                this.field3809 = arg1.method1476(64);
            }
        } else {
            this.field3814 = arg1.method1423(-27);
        }
        if (arg2) {
            this.method87((byte) 26);
        }
        ++field3811;
    }
}
