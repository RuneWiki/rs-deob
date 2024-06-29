import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class531 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    private int field7630;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field7627;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lal;")
    private class121 field7628;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public int field7631;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lpd;")
    public static class531 field7629 = new class531(0, 3, class121.field1863);

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lpd;")
    public static class531 field7634 = new class531(1, 3, class121.field1863);

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lpd;")
    public static class531 field7635 = new class531(2, 4, class121.field1859);

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lpd;")
    public static class531 field7636 = new class531(3, 1, class121.field1863);

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lpd;")
    public static class531 field7637 = new class531(4, 2, class121.field1863);

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lpd;")
    public static class531 field7638 = new class531(5, 3, class121.field1863);

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lpd;")
    public static class531 field7639 = new class531(6, 4, class121.field1863);

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field7640 = class730.method4052(16, -121);

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lcb;")
    public static class631 field7641 = new class631(12, 4);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 5)
    public static void method3141(byte arg0) {
        field7636 = null;
        field7637 = null;
        field7634 = null;
        field7638 = null;
        field7641 = null;
        field7639 = null;
        field7635 = null;
        if (arg0 < 48) {
            method3142(40, -121);
        }
        field7629 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lpd;", line = 22)
    public static final class531 method3142(int arg0, int arg1) {
        field7632++;
        if (arg1 >= -16) {
            field7638 = null;
        }
        if (arg0 == 0) {
            return field7629;
        } else if (arg0 == 1) {
            return field7634;
        } else if (arg0 == 2) {
            return field7635;
        } else if (arg0 == 3) {
            return field7636;
        } else if (arg0 == 4) {
            return field7637;
        } else if (arg0 == 5) {
            return field7638;
        } else if (arg0 == 6) {
            return field7639;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IILal;)V", line = 97)
    private class531(int arg0, int arg1, class121 arg2) {
        this.field7630 = arg1;
        this.field7627 = arg0;
        this.field7628 = arg2;
        this.field7631 = this.field7628.field1855 * this.field7630;
        if (this.field7627 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;", line = 116)
    public final String toString() {
        field7626++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 127)
    public static final void method3143(byte arg0) {
        field7633++;
        if (!class552.field7867) {
            return;
        }
        class353 var1 = class745.method4165(arg0 + 174, class711.field10004, class436.field6364);
        if (arg0 != -65) {
            field7635 = null;
        }
        if (var1 != null && var1.field5318 != null) {
            class700 var2 = new class700();
            var2.field9891 = var1.field5318;
            var2.field9902 = var1;
            class464.method2838(var2);
        }
        class618.field8708 = -1;
        class289.field4444 = -1;
        class552.field7867 = false;
        if (var1 != null) {
            class717.method3960(var1, (byte) 126);
        }
    }
}
