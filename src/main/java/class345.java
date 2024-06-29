import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class345 {

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Lnj;")
    public static class162 field4953 = new class162(5);

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[Ll;")
    public static class16[] field4954;

    static {
        new class466("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lya;Lem;I)V", line = 4)
    public static final void method2044(class38 arg0, class150 arg1, int arg2) {
        field4952++;
        boolean var3 = class328.field4480.method3099(arg1.field2266 ? class316.field4324.field6417 : null, 36, arg0, arg1.field2223 | 0xFF000000, arg1.field2237, arg1.field2257, arg1.field2228, arg1.field2324) == null;
        if (arg2 == 5 && var3) {
            class292.field4032.method2809(new class265(arg1.field2237, arg1.field2257, arg1.field2228, arg1.field2223 | 0xFF000000, arg1.field2324, arg1.field2266), 2);
            class370.method2222(0, arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 23)
    public static void method2045(int arg0) {
        if (arg0 <= -70) {
            field4954 = null;
            field4953 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z", line = 39)
    public static final boolean method2046(int arg0, int arg1) {
        field4951++;
        class61 var2 = class310.method1797(false, arg0);
        if (var2 == null) {
            return false;
        } else if (class504.field7417 == 3) {
            int var3 = 118 % ((3 - arg1) / 32);
            String var4 = "";
            if (class404.field5937 != class373.field5469) {
                var4 = ":" + (var2.field760 + 7000);
            }
            String var5 = "";
            if (class194.field2773 != null) {
                var5 = "/p=" + class194.field2773;
            }
            String var6 = "http://" + var2.field762 + var4 + "/l=" + class372.field5455 + "/a=" + class461.field6784 + var5 + "/j" + (class194.field2769 ? "1" : "0") + ",o" + (class438.field6451 ? "1" : "0") + ",a2";
            try {
                class67.field921.getAppletContext().showDocument(new URL(var6), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        } else {
            class316.field4329 = var2.field760;
            class494.field7216 = var2.field762;
            if (class404.field5937 != class373.field5469) {
                class27.field353 = class316.field4329 + 40000;
                class223.field3177 = class316.field4329 + 50000;
                class314.field4277 = class27.field353;
            }
            return true;
        }
    }
}
