import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class328 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Ljg;")
    public static class241 field4924 = new class241(50);

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lnn;")
    public static class151 field4928 = new class151("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    public static int[] field4929;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
    public static int[] field4931;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILef;)Lcl;")
    public static final class47 method2021(int arg0, class385 arg1) {
        field4930++;
        return arg0 == 50 ? new class47(arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2327((byte) -116), arg1.method2382((byte) -126), arg1.method2343(255)) : null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BC)Z")
    public static final boolean method2022(byte arg0, char arg1) {
        field4926++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            if (arg0 != 86) {
                method2024(false);
            }
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method2023(byte arg0) {
        int var1 = -45 / ((arg0 - 18) / 41);
        field4928 = null;
        field4924 = null;
        field4931 = null;
        field4929 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
    public static final boolean method2024(boolean arg0) {
        field4923++;
        class306 var1 = (class306) class372.field5433.field5946.field1336;
        if (var1 == null || class372.field5433.field5946 == var1) {
            return false;
        }
        if (var1.field4616 >= 2000) {
            var1.field4616 -= 2000;
        }
        if (var1.field4616 == 1006) {
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    static {
        new class151("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
