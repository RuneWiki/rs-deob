import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class138 extends class202 {

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    private int field1889 = 585;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "Lbi;")
    public static class104 field1892 = new class104(93, -1);

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field1893;
        int[] var3 = super.field3064.method2452((byte) 104, arg0);
        if (super.field3064.field5837) {
            int var4 = class521.field7716[arg0];
            for (int var5 = 0; ~var5 > ~class276.field4375; ++var5) {
                int var6 = class476.field7271[var5];
                if (var6 > this.field1889 && ~var6 > ~(-this.field1889 + 4096) && ~(-this.field1889 + 2048) > ~var4 && var4 < this.field1889 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1889 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (-this.field1889 + 2048 < var6 && ~(this.field1889 + 2048) < ~var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1889;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1889);
                } else if (~var4 <= ~this.field1889 && -this.field1889 + 4096 >= var4) {
                    if (this.field1889 <= var6 && ~(-this.field1889 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1889 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field1889;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1889 + 2048);
                }
            }
        }
        if (!arg1) {
            method843(-73);
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)I")
    public static final int method843(int arg0) {
        ++field1890;
        class328 var1 = class211.field3462;
        synchronized (class211.field3462) {
            if (arg0 <= 28) {
                field1892 = null;
            }
            return class211.field3462.method2186(0);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static void method844(byte arg0) {
        if (arg0 != 46) {
            field1892 = null;
        }
        field1892 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class138() {
        super(0, true);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field1889 = arg0.method1455(-3387);
        }
        ++field1891;
        int var5 = 120 % ((-46 - arg1) / 50);
    }
}
