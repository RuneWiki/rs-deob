import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class208 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lqj;")
    public static class238 field2987;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V", line = 11)
    public static final void method1307(int arg0, int arg1, int arg2) {
        class10 var3 = class343.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field117 != null) {
            var3.field117 = null;
        }
        if (var3.field120 != null) {
            var3.field120 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 29)
    public static void method1308(int arg0) {
        field2987 = null;
        int var1 = 23 % ((arg0 + 58) / 39);
    }
}
