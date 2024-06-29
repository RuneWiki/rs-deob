import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class57 extends class224 {

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field805 = 4096;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    private int field802 = 4096;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    private int field810 = 4096;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field804 = -1;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field811 = -2;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field806 = -1;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field803;
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[][] var4 = this.method1532(39, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class78.field1108 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var8[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var9[var11] = this.field802 * var12 >> 12;
                    var7[var11] = this.field810 * var13 >> 12;
                    var10[var11] = this.field805 * var14 >> 12;
                } else {
                    var9[var11] = this.field802;
                    var7[var11] = this.field810;
                    var10[var11] = this.field805;
                }
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field805 = arg0.method190(-3);
                }
            } else {
                this.field810 = arg0.method190(-3);
            }
        } else {
            this.field802 = arg0.method190(-3);
        }
        if (arg2 > -46) {
            this.method16((class25) null, 61, (byte) -58);
        }
        ++field807;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
    public static final void method416(int arg0, int arg1) {
        ++field809;
        class250 var2 = class39.field526;
        synchronized (class39.field526) {
            if (arg0 != 0) {
                field811 = -23;
            }
            class87.field1375 = arg1;
        }
    }
}
