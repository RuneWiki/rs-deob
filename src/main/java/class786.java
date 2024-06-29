import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class786 extends class735 {

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    private int field10796 = -1;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field10793;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field10794;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    public static int field10795;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)I")
    public static final int method4287(int arg0, int arg1, int arg2) {
        field10793++;
        int var3 = class22.method149(-30052, arg2 - 1, arg1 - 1) + class22.method149(arg0 ^ 0xFFFF8A9D, arg2 - 1, arg1 - -1) + class22.method149(-30052, arg0 + arg2, arg1 + -1) + class22.method149(-30052, arg2 - -1, arg1 + 1);
        int var4 = class22.method149(-30052, arg2, arg1 - 1) + class22.method149(arg0 ^ 0xFFFF8A9D, arg2, arg1 + 1) + (class22.method149(-30052, arg2 + -1, arg1) - -class22.method149(-30052, arg2 + 1, arg1));
        int var5 = class22.method149(-30052, arg2, arg1);
        return var4 / 8 + (var3 / 16 + (var5 / 4));
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lrh;Z)V")
    public final void method624(class280 arg0, boolean arg1) {
        if (arg1) {
            this.method624(null, true);
        }
        arg0.method1798(this.field10796, true);
        field10794++;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILfca;)V")
    public final void method627(int arg0, class93 arg1) {
        this.field10796 = arg1.method763(-6);
        field10795++;
        if (arg0 != 5) {
            this.method627(112, null);
        }
    }
}
