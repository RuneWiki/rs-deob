import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class381 {

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "Lnn;")
    public static class151 field5554 = new class151("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "Z")
    public static boolean field5557 = true;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "[I")
    public static int[] field5556 = new int[5];

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "Lnn;")
    public static class151 field5558 = new class151("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Lnn;")
    public static class151 field5559;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public static void method2294(int arg0) {
        field5554 = null;
        field5558 = null;
        field5556 = null;
        field5559 = null;
        if (arg0 != 5) {
            field5554 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static final void method2295(byte arg0) {
        int var1 = 90 / ((arg0 - 20) / 33);
        class319.field4812.method1485(-22032);
        field5555++;
        class87.field1234.method1485(-22032);
    }

    static {
        new class151("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field5559 = new class151("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
    }
}
