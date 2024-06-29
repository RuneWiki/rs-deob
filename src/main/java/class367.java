import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class367 extends class386 {

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    private int field4939 = 0;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    private int field4941 = 4096;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field4942 = -1;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class367() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 <= 111) {
            this.method359(-79, -88);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field4941 = arg2.method2260(-25);
            }
        } else {
            this.field4939 = arg2.method2260(-36);
        }
        ++field4943;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field4940;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = -50 / ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            int[] var5 = this.method2212((byte) -31, arg0, 0);
            for (int var6 = 0; ~var6 > ~class599.field8643; ++var6) {
                int var7 = var5[var6];
                var3[var6] = ~this.field4939 >= ~var7 && var7 <= this.field4941 ? 4096 : 0;
            }
        }
        return var3;
    }
}
