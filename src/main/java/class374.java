import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class374 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Lwt;")
    public static class194 field5598 = new class194("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lae;B)V")
    public static final void method2272(class156 arg0, byte arg1) {
        field5600++;
        if ((arg0.field2041.length - arg0.field2018) < 1) {
            return;
        }
        int var2 = arg0.method941((byte) 126);
        if (var2 < 0 || var2 > 1 || arg0.field2041.length - arg0.field2018 < 2) {
            return;
        }
        if (arg1 != 1) {
            method2273(28, 49, 13, 58, 53);
        }
        int var3 = arg0.method993((byte) -66);
        if ((var3 * 6) != (arg0.field2041.length - arg0.field2018)) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field2041.length <= arg0.field2018) {
                            return;
                        }
                        var4 = arg0.method993((byte) -71);
                        var5 = arg0.method950(186);
                    } while (var4 >= class115.field1486.length);
                } while (!class420.field6208[var4]);
            } while (class355.field5125.method2300(var4, -116).field2396 == '1' && (var5 < -1 || var5 > 1));
            class115.field1486[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)V")
    public static final void method2273(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5599++;
        float var5 = (float) class249.field3597 / (float) class249.field3588;
        if (arg2 != 30504) {
            method2273(-84, 85, 19, 104, -45);
        }
        int var6 = arg0;
        int var7 = arg3;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg1 - (arg0 - var6) / 2;
        int var9 = arg4 - (arg3 - var7) / 2;
        class261.field3728 = -1;
        class134.field1711 = -1;
        class364.field5477 = class249.field3597 - (class249.field3597 * var9 / var7);
        class192.field2715 = class249.field3588 * var8 / var6;
        class126.method706(4832);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static void method2274(int arg0) {
        field5598 = null;
        if (arg0 != 14200) {
            field5598 = null;
        }
    }

    static {
        new class194("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field5601 = 1;
    }
}
