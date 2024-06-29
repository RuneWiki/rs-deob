import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class589 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 5)
    public static final void method3387(String arg0, int arg1) {
        if (arg1 > -79) {
            method3387(null, 104);
        }
        field8312++;
        if (class594.field8345 == null) {
            return;
        }
        class558.field7924++;
        class540 var2 = class257.method1732(true, class245.field3944, class655.field9332);
        var2.field7707.method1926(class16.method101(-43, arg0), 65280);
        var2.field7707.method1931(112, arg0);
        class756.method4211(var2, 108);
    }
}
