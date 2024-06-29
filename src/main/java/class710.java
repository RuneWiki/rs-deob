import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class710 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Ldba;")
    public static class101 field9999 = new class101(13, 4);

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "F")
    public static float field10001;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public static final void method4020(boolean arg0) {
        field10000++;
        if (class757.field10456 == 3) {
            class374.method2323(4, (byte) -126);
        } else if (class757.field10456 == 7) {
            class374.method2323(8, (byte) -127);
        } else if (class757.field10456 == 10) {
            class374.method2323(11, (byte) 116);
        }
        if (!arg0) {
            field9999 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method4021(int arg0) {
        if (arg0 == 4) {
            field9999 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)Z")
    public static boolean method4022(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
