import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class192 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lch;")
    public static class151 field2866 = new class151("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lcf;")
    public static class92 field2867 = new class92();

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method1342(int arg0) {
        if (arg0 == 1181) {
            field2867 = null;
            field2866 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)J")
    public abstract long method458(int arg0);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)I")
    public abstract int method457(byte arg0, int arg1);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method1343(byte arg0) {
        field2865++;
        if (arg0 != 64) {
            method1343((byte) 122);
        }
        if (class435.method2628(2) || class387.field5306 == class259.field3691) {
            class62.method564(class374.field5152, (byte) 47);
            if (class387.field5306 != class263.field3789) {
                class325.method2051(-65);
            }
        } else {
            class431.method2600(-1, class309.field4391, false, class427.field5961, false);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public abstract void method460(int arg0);
}
