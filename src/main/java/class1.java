import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class179 {

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "[I")
    public static int[] field6;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "Lbg;")
    public static class310 field7;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V")
    public static final void method1(int arg0) {
        class160.field2517 = class380.field5545.field5780 + class380.field5545.field5779 + 2;
        class360.field5331 = class512.field7764.field5780 + class512.field7764.field5779 - arg0;
        class105.field1855 = new String[500];
        field2++;
        for (int var1 = 0; var1 < class105.field1855.length; var1++) {
            class105.field1855[var1] = "";
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
    public static void method2(int arg0) {
        field6 = null;
        if (arg0 < -108) {
            field7 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(II)V")
    public class1(int arg0, int arg1) {
        this.field1 = arg0;
        this.field3 = arg1;
    }

    static {
        new class423("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field5 = 0;
        field6 = new int[14];
        new class423("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field7 = new class310(15, 7);
    }
}
