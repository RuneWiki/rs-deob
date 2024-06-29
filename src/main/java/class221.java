import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class221 {

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "Lhj;")
    public static class596 field2578 = new class596(11, -2);

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "Z")
    public static boolean field2579 = false;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V", line = 6)
    public static void method1366(int arg0) {
        field2578 = null;
        if (arg0 != 11) {
            field2578 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V", line = 17)
    public static final void method1367(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class502.method3001(var3.field10173);
        class502.method3001(var3.field10187);
        if (var3.field10173 != null) {
            var3.field10173 = null;
        }
        if (var3.field10187 != null) {
            var3.field10187 = null;
        }
    }
}
