import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class166 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[Lbj;")
    public static class130[] field2330;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lte;B)Lte;")
    public abstract class367 method574(class367 arg0, byte arg1);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method1126(byte arg0) {
        field2331++;
        class278 var1 = (class278) class272.field3856.method2512((byte) 46);
        if (arg0 != 78) {
            return;
        }
        while (var1 != null) {
            class73.method414(var1, (byte) -3);
            var1 = (class278) class272.field3856.method2512((byte) 46);
        }
        client.method1113();
        client.method1101();
        client.method1106();
        client.method1112();
        client.method1118();
        client.method1120();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method1127(int arg0) {
        field2330 = null;
        if (arg0 < 75) {
            method1127(-107);
        }
    }

    static {
        new class362("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
