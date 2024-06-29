import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class113 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lbj;")
    public static class131 field1633 = new class131(5);

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
    public static int[] field1635;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;I)Lnp;")
    public static final class286 method794(Component arg0, int arg1) {
        if (arg1 == -8356) {
            field1634++;
            return new class377(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method795(byte arg0) {
        field1633 = null;
        field1635 = null;
        if (arg0 <= 82) {
            method794((Component) null, -87);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public static final void method796(int arg0, int arg1) {
        field1632++;
        class239 var2 = class436.method2740(5, arg1, -323285792);
        if (arg0 > 14) {
            var2.method1628(14478);
        }
    }

    static {
        new class442("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field1635 = new int[25];
        new class442("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }
}
