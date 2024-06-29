import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class370 extends class403 {

    @OriginalMember(owner = "client!im", name = "F", descriptor = "Lom;")
    public class230 field5067;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "Lgd;")
    public static class206 field5066 = new class206(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field5068 = 0;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lom;)V", line = 7)
    public class370(class230 arg0) {
        this.field5067 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)V", line = 19)
    public static void method2283(byte arg0) {
        field5066 = null;
        if (arg0 != 10) {
            field5066 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(III)V", line = 30)
    public static final void method2284(int arg0, int arg1, int arg2) {
        field5064++;
        if (class343.field4601 == class243.field3233) {
            if (class302.method1689(false, -2, arg0, 0, 1, arg1, 1, 127, 0)) {
                return;
            }
            class302.method1689(false, -3, arg0, 0, 1, arg1, 1, 124, 0);
        } else if (class302.method1689(false, -3, arg0, 0, 1, arg1, 1, 124, 0)) {
            return;
        } else {
            class302.method1689(false, -2, arg0, 0, 1, arg1, 1, 121, 0);
        }
        if (arg2 != 1) {
            method2284(-113, -28, 6);
        }
    }
}
