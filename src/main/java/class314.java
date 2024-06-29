import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class314 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field4912 = 0;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lqu;")
    public static class219 field4916;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lhw;II)V")
    private final void method2099(class208 arg0, int arg1, int arg2) {
        if (arg1 == 7) {
            if (arg2 == 5) {
                this.field4912 = arg0.method1455(-3387);
            }
            field4913++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4914++;
        class238.method1670(arg8, arg4, 0, arg3, arg5, arg7, arg2, arg1, -7, arg0);
        if (arg6 < 27) {
            field4916 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILhw;)V")
    public final void method2101(int arg0, class208 arg1) {
        field4915++;
        while (true) {
            int var3 = arg1.method1445(61);
            if (var3 == 0) {
                if (arg0 == -21724) {
                    return;
                } else {
                    method2102(-41);
                    return;
                }
            }
            this.method2099(arg1, arg0 ^ 0xFFFFAB23, var3);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method2102(int arg0) {
        if (arg0 > -98) {
            method2100(-12, 40, 98, -90, -111, 74, -17, -12, -63);
        }
        field4916 = null;
    }

    static {
        new class213("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field4916 = new class219(34, 7);
        field4917 = 0;
    }
}
