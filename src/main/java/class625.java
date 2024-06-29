import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class625 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Ldm;")
    public static class46 field9107 = new class46();

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field9110 = -1;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lcba;")
    public static class471 field9111;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ltl;I)Z")
    public static final boolean method3649(class531 arg0, int arg1) {
        if (arg1 != -1) {
            method3650(124, -115, false);
        }
        field9109++;
        return class494.field6920 == arg0 || class592.field8492 == arg0 || class224.field3214 == arg0 || class487.field6836 == arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLnu;)Lnu;")
    public abstract class509 method2823(boolean arg0, class509 arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V")
    public static final void method3650(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field9108++;
            if (class377.method2232(125, arg1)) {
                class452.method2650(0, arg0, class618.field8850[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method3651(int arg0) {
        int var1 = 1 / ((arg0 + 75) / 38);
        field9111 = null;
        field9107 = null;
    }
}
