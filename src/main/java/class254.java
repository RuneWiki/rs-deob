import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class254 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[Lhn;")
    public static class516[] field3525 = new class516[30];

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lfg;")
    public static class84 field3526 = new class84(11, 0, 1, 2);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3528 = new String[100];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!pa", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field3527++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1645(int arg0) {
        if (arg0 == 1) {
            class56.field809.method2127((byte) -84);
            field3524++;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)[Lwh;", line = 25)
    public static final class101[] method1646(boolean arg0) {
        if (arg0) {
            method1646(false);
        }
        field3523++;
        return new class101[] { class131.field1768, class226.field3200, class112.field1566 };
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 45)
    public static void method1647(int arg0) {
        field3525 = null;
        if (arg0 != 30) {
            method1645(-50);
        }
        field3526 = null;
        field3528 = null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V", line = 57)
    public class254(int arg0, int arg1) {
    }
}
