import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class360 extends class315 {

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lwb;")
    public class360 field4947;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lwb;")
    public class360 field4948;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[Lwt;")
    public static class325[] field4950;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public final void method2212(int arg0) {
        if (arg0 != -2207) {
            return;
        }
        field4949++;
        if (this.field4947 != null) {
            this.field4947.field4948 = this.field4948;
            this.field4948.field4947 = this.field4947;
            this.field4947 = null;
            this.field4948 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method2213(byte arg0) {
        field4950 = null;
        if (arg0 != 55) {
            field4950 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lwr;")
    public static final class52 method2214(int arg0, int arg1, int arg2) {
        if (class385.field5285[arg0][arg1][arg2] == null) {
            boolean var3 = class385.field5285[0][arg1][arg2] != null && class385.field5285[0][arg1][arg2].field757 != null;
            if (var3 && arg0 >= class310.field4398 - 1) {
                return null;
            }
            class143.method1028(arg0, arg1, arg2);
        }
        return class385.field5285[arg0][arg1][arg2];
    }

    static {
        new class151("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }
}
