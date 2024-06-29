import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class217 extends class261 {

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "[I")
    public static int[] field3678 = new int[25];

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "Lve;")
    public static class255 field3679 = null;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "Lve;")
    public static class255 field3680 = null;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Lwl;")
    public static class81 field3682 = new class81(50);

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Lve;")
    public static class255 field3683 = class87.method607(87, "sch-Utteln:");

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "(B)V", line = 9)
    public static final void method1539(byte arg0) {
        int var1 = 86 % ((arg0 + 22) / 50);
        field3681++;
        class72.field1186.method554(0);
    }

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "(B)V", line = 19)
    public static void method1540(byte arg0) {
        field3682 = null;
        field3679 = null;
        if (arg0 > -82) {
            field3678 = (int[]) null;
        }
        field3683 = null;
        field3678 = null;
        field3680 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)[I", line = 34)
    public final int[] method21(byte arg0, int arg1) {
        field3677++;
        int[] var3 = this.field4425.method906(arg1, 8251);
        int var4 = 92 % ((-arg0 - 49) / 33);
        if (this.field4425.field2043) {
            class36.method218(var3, 0, class92.field1576, class20.field324[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V", line = 58)
    public class217() {
        super(0, true);
    }
}
