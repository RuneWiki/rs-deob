import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class414 {

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "[I")
    public static int[] field6262;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "B")
    public byte field6265;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public int field6260;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "Ljava/lang/String;")
    public String field6259;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "Ljava/lang/String;")
    public String field6261;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "Ljava/lang/String;")
    public String field6263;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "Ljava/lang/String;")
    public String field6264;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
    public static void method2545(byte arg0) {
        if (arg0 > 46) {
            field6262 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
    public static final void method2546(String arg0, byte arg1, String arg2) {
        class339.field5106 = arg2;
        if (arg1 != -116) {
            field6262 = null;
        }
        class256.field3934 = arg0;
        field6258++;
        if (class68.field1382 != 3 && class339.field5106.equals("") || class256.field3934.equals("")) {
            class252.method1626(3, 121);
            return;
        }
        if (class68.field1382 != 1) {
            class85.field1753 = -1;
            class209.field3342 = 0;
        }
        class270.field4095 = false;
        class252.method1626(-3, -35);
        class73.field1465 = 0;
        class496.field7281 = 0;
        class179.field2910 = 1;
    }

    static {
        new class309("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field6262 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        new class309("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }
}
