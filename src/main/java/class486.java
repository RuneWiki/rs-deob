import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class486 {

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Lkca;")
    public static class73 field7103 = new class73(4, 2);

    @OriginalMember(owner = "client!po", name = "d", descriptor = "Lea;")
    public static class474 field7104 = new class474("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public static void method2928(byte arg0) {
        if (arg0 < 2) {
            method2928((byte) 67);
        }
        field7104 = null;
        field7103 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public static final void method2929(int arg0, int arg1, int arg2) {
        field7101++;
        class467 var3 = class541.method3144(arg0, (byte) -122, 5);
        if (arg1 <= 61) {
            method2930(true);
        }
        var3.method2851(true);
        var3.field6926 = arg2;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public static final void method2930(boolean arg0) {
        class84.method552(-12752);
        field7102++;
        if (arg0) {
            field7103 = null;
        }
    }
}
