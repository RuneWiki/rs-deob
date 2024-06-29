import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class278 {

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Leea;")
    public static class114 field3884;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkea;Lkea;II)V")
    public static final void method1813(class203 arg0, class203 arg1, int arg2, int arg3) {
        field3883++;
        class98.field1155 = arg0;
        class1.field2 = arg1;
        if (arg2 != 0) {
            method1815(-122);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lada;BI)Lfv;")
    public static final class104 method1814(class144 arg0, byte arg1, int arg2) {
        field3882++;
        if (arg1 != 65) {
            method1813(null, null, 104, -95);
        }
        class104 var3;
        if (class27.field288 == null) {
            var3 = new class104();
        } else {
            var3 = class27.field288;
            class27.field288 = class27.field288.field1251;
            class96.field1137--;
            var3.field1251 = null;
        }
        var3.field1249 = arg2;
        var3.field1253 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1815(int arg0) {
        field3884 = null;
        if (arg0 != 0) {
            method1815(65);
        }
    }

    static {
        new class474("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field3884 = new class114();
        field3885 = 0;
    }
}
