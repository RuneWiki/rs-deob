import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class157 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method1137(int arg0, String arg1) {
        field2388++;
        if (class732.field10141 == null || arg0 > -70) {
            return;
        }
        class183.field2761++;
        class583 var2 = class381.method2246(1, class128.field2105, class447.field6129);
        var2.field7637.method3823(-54, class419.method2429(true, arg1));
        var2.field7637.method3795(arg1, (byte) -113);
        class42.method309(var2, 0);
    }
}
