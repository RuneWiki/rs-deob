import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class372 extends class200 {

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lnk;")
    public class501 field5653;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lhm;")
    public class146 field5654;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field5646 = 0;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lpi;")
    public static class342 field5647 = new class342("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public int field5649;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public int field5650;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field5652;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public int field5656;

    static {
        new class342("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field5655 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method2321(byte arg0, int arg1) {
        class272.field3928.method493(false, arg1);
        if (arg0 != 107) {
            return;
        }
        field5651++;
        class283.field4047.method493(false, arg1);
        class132.field2081.method493(false, arg1);
        class420.field6276.method493(false, arg1);
        class259.field3762.method493(false, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V", line = 30)
    public static void method2322(int arg0) {
        field5647 = null;
        int var1 = 88 % ((arg0 + 27) / 35);
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V", line = 60)
    public final void method2323(int arg0) {
        this.field5650 = this.field5653.field7386;
        field5648++;
        this.field5652 = this.field5653.field7395;
        this.field5656 = this.field5653.field7384;
        if (this.field5653.field7391 != null) {
            this.field5653.field7391.method877(this.field5654.field2327, this.field5654.field2332, this.field5654.field2325, class116.field1926);
        }
        this.field5649 = class116.field1926[arg0];
        this.field5645 = class116.field1926[0];
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lnk;Lwk;)V", line = 78)
    public class372(class501 arg0, class94 arg1) {
        this.field5653 = arg0;
        this.field5654 = this.field5653.method2998(73);
        this.method2323(2);
    }
}
