import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class633 extends class540 {

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field8932;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Leo;")
    public static class310 field8933 = new class310();

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Ldba;")
    public static class101 field8934 = new class101(2, -1);

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field8936 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lcb;")
    public static class544 field8937;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 8)
    public static void method3611(int arg0) {
        field8937 = null;
        field8933 = null;
        int var1 = 114 % ((-arg0 - 78) / 39);
        field8934 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 21)
    public class633() {
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V", line = 26)
    public class633(int arg0) {
        this.field8932 = arg0;
    }
}
