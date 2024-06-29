import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class199 extends class89 {

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "[I")
    public static int[] field2549 = new int[2048];

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Z")
    public static boolean field2552 = false;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public static void method1243(int arg0) {
        field2549 = null;
        if (arg0 < 105) {
            field2549 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)[Lqi;")
    public static final class669[] method1244(int arg0) {
        ++field2551;
        if (arg0 != 0) {
            field2547 = -37;
        }
        return new class669[] { class508.field7187, class125.field1495, class306.field3931, class567.field7916, class516.field7273, class63.field861, class335.field4308, class6.field66, class480.field6848, class540.field7604 };
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIZ)V")
    public final void method619(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2546;
        int var5 = -82 / ((arg2 - 12) / 43);
        int var6 = this.method618(10000) * super.field1128.field8673 / 10000;
        class458.field6407.method167(arg0, arg1 - -2, var6, super.field1128.field8665 + -2, ((class642) super.field1128).field8865, 0);
        class458.field6407.method167(arg0 - -var6, arg1 - -2, -var6 + super.field1128.field8673, super.field1128.field8665 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lkha;Lkha;Lcm;)V")
    public class199(class687 arg0, class687 arg1, class642 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIZ)V")
    public final void method622(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2548;
        class458.field6407.method136(arg1 + -2, arg0, super.field1128.field8673 - -4, super.field1128.field8665 + arg2, ((class642) super.field1128).field8863, 0);
        class458.field6407.method136(arg1 + -1, arg0 + 1, super.field1128.field8673 + 2, super.field1128.field8665, 0, 0);
    }
}
