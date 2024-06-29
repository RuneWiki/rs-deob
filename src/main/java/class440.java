import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class440 extends class198 {

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    private int field6101;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    private int field6102;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    private int field6103;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    private int field6104;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILlm;)V", line = 6)
    public final void method858(int arg0, class50 arg1) {
        if (arg0 != 3) {
            this.field6101 = -95;
        }
        arg1.method395(this.field6103, this.field6102, arg0 ^ 0xFFFFFFFC, this.field6104, this.field6101);
        field6106++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLol;)V", line = 25)
    public final void method855(boolean arg0, class431 arg1) {
        this.field6102 = arg1.method2526(17);
        field6105++;
        this.field6101 = arg1.method2526(17);
        this.field6103 = arg1.method2557(14929);
        if (!arg0) {
            this.method855(false, null);
        }
        this.field6104 = arg1.method2557(14929);
    }
}
