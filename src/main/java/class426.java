import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class426 {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field6443;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[Z")
    public static boolean[] field6444;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lbi;")
    public static class104 field6446;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
    public static final void method2695(String arg0, boolean arg1, String arg2) {
        field6442++;
        class270.field4310 = arg2;
        class372.field5719 = arg0;
        if (class334.field5227 != 3 && class372.field5719.equals("") || class270.field4310.equals("")) {
            class319.method2139(true, 3);
            return;
        }
        if (class334.field5227 != 1) {
            class531.field7793 = -1;
            class360.field5581 = 0;
        }
        class386.field5901 = arg1;
        class319.method2139(true, -3);
        class292.field4606 = 0;
        class310.field4842 = 0;
        class46.field606 = 1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method2696(byte arg0) {
        field6446 = null;
        field6444 = null;
        if (arg0 != 113) {
            field6444 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class426(String arg0, int arg1) {
        this.field6443 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Component;)Lhv;")
    public static final class152 method2697(int arg0, Component arg1) {
        field6445++;
        return arg0 == 18541 ? new class255(arg1) : null;
    }

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6448++;
        throw new IllegalStateException();
    }

    static {
        new class213("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field6444 = new boolean[8];
        field6447 = -1;
        field6446 = new class104(78, -1);
    }
}
