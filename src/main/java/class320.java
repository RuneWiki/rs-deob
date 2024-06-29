import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class320 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lsn;")
    public class208 field4847 = new class208();

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Z")
    public boolean field4853 = false;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lrp;")
    public static class277 field4850;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "[Lkt;")
    public static class61[] field4852;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Lpu;")
    public static class179 field4854;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public int field4848;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public int field4849;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "[Lo;")
    public static class363[] field4851;

    static {
        new class179("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field4850 = new class277(1);
        field4852 = new class61[14];
        field4854 = new class179("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 5)
    public static void method2116(byte arg0) {
        field4852 = null;
        field4854 = null;
        if (arg0 == -32) {
            field4851 = null;
            field4850 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V", line = 24)
    public static final void method2117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class295.field4548 != null) {
            class295.field4548[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class341.field5093 != null) {
            class341.field5093[arg0][arg1] = (short) arg3;
        }
        if (class101.field1543 != null) {
            class101.field1543[arg0][arg1] = (byte) arg4;
        }
    }
}
