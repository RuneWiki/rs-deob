import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class282 extends class270 {

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Lhv;")
    public class150 field4610;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Lnp;")
    public class115 field4613;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Llo;")
    public static class306 field4609 = new class306("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Lnk;")
    public static class326 field4614 = new class326(72, 8);

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field4615 = -1;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public int field4604;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public int field4608;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method1844(int arg0) {
        field4614 = null;
        field4609 = null;
        if (arg0 != 901870944) {
            method1845((byte) -107);
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
    public static final void method1845(byte arg0) {
        field4607++;
        if (arg0 == -98) {
            class533.field7842.method910(((float) class510.field7403.field5108 * 0.1F + 0.7F) * class135.field2292);
            class533.field7842.method859(class91.field1517, class295.field4752, class507.field7383, (float) (class379.field5882 << 0), (float) (class52.field846 << 0), (float) (class280.field4590 << 0));
            class533.field7842.method894(class463.field6884);
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public final void method1846(int arg0) {
        this.field4604 = this.field4610.field2415;
        this.field4612 = this.field4610.field2413;
        this.field4608 = this.field4610.field2410;
        field4611++;
        if (this.field4610.field2412 != null) {
            this.field4610.field2412.method1249(this.field4613.field2038, this.field4613.field2044, this.field4613.field2030, class469.field6964);
        }
        if (arg0 != 3870) {
            method1845((byte) 26);
        }
        this.field4605 = class469.field6964[0];
        this.field4606 = class469.field6964[2];
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lhv;Lcc;)V")
    public class282(class150 arg0, class122 arg1) {
        this.field4610 = arg0;
        this.field4613 = this.field4610.method1071(false);
        this.method1846(3870);
    }

    static {
        new class306("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field4616 = 0;
    }
}
