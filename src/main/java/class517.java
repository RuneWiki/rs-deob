import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class517 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Leu;")
    public static class333 field7535 = class123.method808((byte) 83);

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Llt;")
    public static class475 field7537 = new class475("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Llt;")
    public static class475 field7538 = new class475("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Llt;")
    public static class475 field7541 = new class475("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
    public static int[] field7539;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[Let;")
    public static class419[] field7540;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lqa;Lic;Lic;I)V")
    public static final void method3045(class162 arg0, class491 arg1, class491 arg2, int arg3) {
        field7533++;
        class343.field4952 = class483.method2865(109, arg2, class407.field6142, 0);
        if (arg3 >= -16) {
            method3047(98);
        }
        class47.field761 = arg0.method1081(class343.field4952, class408.method2460(arg1, class407.field6142, 0), true);
        class202.field2927 = class483.method2865(113, arg2, class180.field2656, 0);
        class147.field2181 = arg0.method1081(class202.field2927, class408.method2460(arg1, class180.field2656, 0), true);
        class163.field2401 = class483.method2865(118, arg2, class142.field2121, 0);
        class294.field4202 = arg0.method1081(class163.field2401, class408.method2460(arg1, class142.field2121, 0), true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
    public static final boolean method3046(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method3046(15, 29, 19);
        }
        field7536++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method3047(int arg0) {
        field7541 = null;
        field7535 = null;
        field7538 = null;
        field7540 = null;
        if (arg0 != 9584) {
            method3045(null, null, null, 21);
        }
        field7537 = null;
        field7539 = null;
    }
}
