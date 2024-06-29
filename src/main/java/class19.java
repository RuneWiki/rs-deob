import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class19 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lcba;")
    public static class471 field230;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method198(byte arg0) {
        field230 = null;
        if (arg0 != 41) {
            method199((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static final void method199(byte arg0) {
        field229++;
        class351.method2108(class56.field999, -10511);
        class14.field196++;
        class479.field6754.method84(class467.field6578, (byte) -116);
        if (arg0 > -44) {
            method198((byte) 69);
        }
    }

    static {
        new class104("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field230 = new class471(92, 0);
    }
}
