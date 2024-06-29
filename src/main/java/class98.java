import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class98 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lcm;")
    public static class449 field1412 = new class449(18, 12);

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field1417 = -1;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lui;")
    public static class375 field1416 = new class375("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lob;")
    public static class266 field1418 = new class266("LIVE", 0);

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lui;")
    public static class375 field1419 = new class375(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[[Lbw;")
    public static class20[][] field1415;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method669(String arg0, byte arg1) {
        field1414++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg1 <= 51) {
            field1415 = null;
        }
        while (var2 < class189.field2653) {
            if (arg0.equalsIgnoreCase(class397.field6033[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method670(byte arg0) {
        field1415 = null;
        field1418 = null;
        field1416 = null;
        field1419 = null;
        if (arg0 != -114) {
            field1412 = null;
        }
        field1412 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
    public static final void method671(byte arg0) {
        field1413++;
        if (class274.field3812 >= 0) {
            long var1 = class264.method1698(true);
            class274.field3812 = (int) ((long) class274.field3812 - (var1 - class55.field749));
            if (class274.field3812 > 0) {
                int var3 = (class274.field3812 << 8) / class124.field1778;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class504.field7528 = ((class256.field3547 & 0xFF00FF) * var3 + (class6.field85.field316 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class256.field3547 & 0xFF00) * var3 + (class6.field85.field316 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                float var6 = 1.0F - var5;
                class327.field5014 = class75.field1020 * var3 + class6.field85.field315 * var4 >> 8;
                class197.field2783 = ((class435.field6468 & 0xFF00) * var3 + (class6.field85.field310 & 0xFF00) * var4 & 0xFF0000) + ((class435.field6468 & 0xFF00FF) * var3 + (class6.field85.field310 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class36.field579 = (class6.field85.field304 - class36.field587) * var6 + class36.field587;
                class193.field2741 = (class6.field85.field317 - class162.field2366) * var6 + class162.field2366;
                class163.field2389 = (class6.field85.field318 - class25.field407) * var6 + class25.field407;
                class370.field5683 = (class6.field85.field306 - class16.field265) * var6 + class16.field265;
                class333.field5148 = (class6.field85.field307 - class251.field3478) * var6 + class251.field3478;
                class205.field2895 = (class6.field85.field320 - class103.field1472) * var6 + class103.field1472;
                if (class456.field6695 != class6.field85.field314) {
                    class513.field7615 = class109.field1536.method1081(class456.field6695, class6.field85.field314, var6, class513.field7615);
                }
            } else {
                class370.field5683 = class6.field85.field306;
                class36.field579 = class6.field85.field304;
                class274.field3812 = -1;
                class333.field5148 = class6.field85.field307;
                class327.field5014 = class6.field85.field315;
                class205.field2895 = class6.field85.field320;
                class163.field2389 = class6.field85.field318;
                class197.field2783 = class6.field85.field310;
                class513.field7615 = class6.field85.field314;
                class504.field7528 = class6.field85.field316;
                class193.field2741 = class6.field85.field317;
            }
            class55.field749 = var1;
        }
        if (arg0 != 73) {
            field1417 = 94;
        }
    }
}
