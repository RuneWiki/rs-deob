import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class179 {

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field2759;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "Lpn;")
    public static class49 field2760;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "Lpn;")
    public static class49 field2762;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "Lew;")
    public static class274 field2761;

    @OriginalMember(owner = "client!pu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2757++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)V")
    public static final void method1264(int arg0, boolean arg1) {
        class280.method1893(class360.field5313, arg1, class134.field2010, class169.field2570, 0);
        field2758++;
        if (arg0 <= 91) {
            field2762 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1265(int arg0, int arg1) {
        field2756++;
        if (arg1 >= -56) {
            method1264(-28, false);
        }
        return this.field2759[arg0];
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class179(String arg0, String arg1, String arg2, String arg3) {
        this.field2759 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    public static void method1266(byte arg0) {
        field2761 = null;
        field2760 = null;
        if (arg0 != 99) {
            method1264(60, true);
        }
        field2762 = null;
    }

    static {
        new class179("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field2760 = new class49(41, 0);
        field2762 = new class49(23, 7);
    }
}
