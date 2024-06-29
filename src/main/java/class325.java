import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class325 {

    @OriginalMember(owner = "client!np", name = "c", descriptor = "B")
    private byte field4872;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public int field4876;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public int field4873;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public int field4877;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lbg;")
    public static class310 field4870 = new class310(2, 6);

    @OriginalMember(owner = "client!np", name = "k", descriptor = "Lbg;")
    public static class310 field4880 = new class310(67, 2);

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Lsk;")
    public static class423 field4881 = new class423("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!np", name = "m", descriptor = "[I")
    public static int[] field4882 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "[Lig;")
    public static class154[] field4878;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
    public final int method2030(int arg0) {
        int var2 = -106 % ((arg0 + 47) / 59);
        field4879++;
        return (this.field4872 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
    public class325() {
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
    public static void method2031(int arg0) {
        field4878 = null;
        field4880 = null;
        field4870 = null;
        field4882 = null;
        int var1 = 88 % ((arg0 - 73) / 42);
        field4881 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
    public final int method2032(byte arg0) {
        field4874++;
        int var2 = -84 / ((arg0 - 65) / 46);
        return this.field4872 & 0x7;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lha;)V")
    public class325(class40 arg0) {
        this.field4872 = arg0.method262(-2);
        this.field4871 = arg0.method254((byte) -63);
        this.field4876 = arg0.method255((byte) 96);
        this.field4873 = arg0.method255((byte) 96);
        this.field4875 = arg0.method255((byte) 96);
        this.field4877 = arg0.method255((byte) 96);
    }

    static {
        new class423("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }
}
