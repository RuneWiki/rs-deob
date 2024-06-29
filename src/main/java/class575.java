import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class575 extends class608 {

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field8022 = (int) (class348.method2175(-124) / 1000L);

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Ljava/lang/String;")
    public String field8023;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "S")
    public short field8026;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field8025 = 1407;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Lrh;")
    public static class44 field8024 = new class44(2);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
    public static void method3240(byte arg0) {
        field8024 = null;
        if (arg0 != 90) {
            field8024 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class575(String arg0, int arg1) {
        this.field8023 = arg0;
        this.field8026 = (short) arg1;
    }

    static {
        new class344("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }
}
