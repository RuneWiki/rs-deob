import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class407 extends class642 {

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    private int field6072 = 4096;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    private int field6074 = 4096;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    private int field6076 = 4096;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class407() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
    public final int[][] method138(int arg0, int arg1) {
        ++field6075;
        if (arg0 != 21402) {
            this.field6074 = -47;
        }
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (super.field9211.field2131) {
            int[][] var4 = this.method3657(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class338.field4909 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field6074 * var12 >> 12;
                    var9[var11] = this.field6072 * var13 >> 12;
                    var10[var11] = this.field6076 * var14 >> 12;
                } else {
                    var8[var11] = this.field6074;
                    var9[var11] = this.field6072;
                    var10[var11] = this.field6076;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 <= 29) {
            this.method1(18, (class540) null, (byte) 116);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field6076 = arg1.method3169(26488);
                }
            } else {
                this.field6072 = arg1.method3169(26488);
            }
        } else {
            this.field6074 = arg1.method3169(26488);
        }
        ++field6073;
    }
}
