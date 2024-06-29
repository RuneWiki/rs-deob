import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class280 extends class96 {

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Lra;")
    public class319 field4669;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Lna;")
    public static class26 field4660 = class69.method505("Chargement en cours)3)3)3", (byte) -122);

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Lna;")
    public static class26 field4663 = class69.method505("clignotant1:", (byte) -119);

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field4666 = 0;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Z")
    public static boolean field4670 = false;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lna;")
    public static class26 field4668 = class69.method505(" x ", (byte) -125);

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "[I")
    public static int[] field4671 = new int[32];

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Lgn;")
    public static class5 field4667 = new class5(64);

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Lve;")
    public static class266 field4661;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILbe;)Z", line = 11)
    public static final boolean method1964(int arg0, class297 arg1) {
        field4664++;
        if (arg1.field4990 == arg0) {
            class80.field1262 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 44)
    public static final void method1965(int arg0) {
        class157.field2447.method1987(3);
        field4665++;
        if (arg0 != 14073) {
            method1966(9);
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V", line = 57)
    public static void method1966(int arg0) {
        field4668 = null;
        field4663 = null;
        int var1 = 54 % ((48 - arg0) / 56);
        field4671 = null;
        field4661 = null;
        field4667 = null;
        field4660 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lra;)V", line = 88)
    public class280(class319 arg0) {
        this.field4669 = arg0;
    }
}
