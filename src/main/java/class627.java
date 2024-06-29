import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class627 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "Lgp;")
    public static class561 field8841;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3558(int arg0) {
        if (arg0 != -31764) {
            return;
        }
        for (class154 var1 = (class154) class134.field2163.method427(true); var1 != null; var1 = (class154) class134.field2163.method420(false)) {
            if (var1.field2327) {
                var1.method1094(104);
            }
        }
        field8839++;
        for (class154 var2 = (class154) class90.field1611.method427(true); var2 != null; var2 = (class154) class90.field1611.method420(false)) {
            if (var2.field2327) {
                var2.method1094(78);
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V", line = 43)
    public static void method3559(int arg0) {
        if (arg0 != 18024) {
            method3558(53);
        }
        field8841 = null;
    }
}
