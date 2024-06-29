import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class43 {

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lkr;")
    private class329 field621;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "F")
    public static float field625;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z[BB)V")
    public static final void method238(boolean arg0, byte[] arg1, byte arg2) {
        field622++;
        if (class106.field1377 == null) {
            class106.field1377 = new class551(20000);
        }
        class106.field1377.method3063(arg1, 957, 0, arg1.length);
        if (arg0) {
            class72.method424(class106.field1377.field7693, -23938);
            class447.field6332 = new class272[class588.field8519];
            int var3 = 0;
            for (int var4 = class477.field6713; var4 <= class579.field8066; var4++) {
                class272 var5 = class613.method3502(1, var4);
                if (var5 != null) {
                    class447.field6332[var3++] = var5;
                }
            }
            class212.field2729 = false;
            class431.field5870 = class348.method2175(-124);
            class106.field1377 = null;
        }
        if (arg2 != -110) {
            field625 = -1.0856732F;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLge;)Lar;")
    public static final class4 method239(byte arg0, class551 arg1) {
        if (arg0 != -5) {
            field625 = -0.5679175F;
        }
        arg1.method3045(arg0 ^ 0x79);
        field624++;
        int var2 = arg1.method3045(-127);
        class4 var3 = class178.method1097(var2, arg0 - 110);
        var3.field28 = arg1.method3045(arg0 - 121);
        int var4 = arg1.method3045(-127);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method3045(-127);
            var3.method13(-105, arg1, var6);
        }
        var3.method18(arg0 ^ 0xC);
        return var3;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class43(class513 arg0, int arg1, class329 arg2) {
        new class58(64);
        this.field621 = arg2;
        this.field623 = this.field621.method2064(0, 15);
    }

    static {
        new class344("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
