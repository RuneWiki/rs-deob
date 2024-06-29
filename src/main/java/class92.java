import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class92 extends class320 {

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "J")
    public long field1574;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "Lck;")
    public static class452 field1573 = new class452(5000);

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "Lno;")
    public static class494 field1575 = new class494("", 16);

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "Lbu;")
    public static class17 field1577;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
    public static void method712(int arg0) {
        if (arg0 != 5000) {
            method712(-65);
        }
        field1577 = null;
        field1573 = null;
        field1575 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
    public class92() {
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(J)V")
    public class92(long arg0) {
        this.field1574 = arg0;
    }

    static {
        new class342("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
