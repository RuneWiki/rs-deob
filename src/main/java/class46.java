import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 {

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
    public static int[] field948 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lrd;")
    public static class114 field947 = class84.method656("Lade Konfiguration )2 ", (byte) 120);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lrd;")
    public static class114 field951 = class84.method656("Bitte warten Sie eine Minute", (byte) 118);

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lrd;")
    public static class114 field949 = class84.method656("headicons_prayer", (byte) 120);

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field946 = 0;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[I")
    public static int[] field954 = new int[50];

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lrd;")
    private static class114 field956 = class84.method656("Enter name:", (byte) 118);

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field957 = 0;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field955 = 0;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lrd;")
    public static class114 field953 = field956;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ldd;")
    public static class26 field943;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lma;")
    public static class81 field945;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZZ)I")
    public static final int method339(boolean arg0, boolean arg1, boolean arg2) {
        int var3 = 0;
        if (!arg0) {
            method339(false, false, false);
        }
        field942++;
        if (arg2) {
            var3 += class48.field1005 + class145.field3453;
        }
        if (arg1) {
            var3 += class92.field2154 + class120.field2802;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method340(int arg0, int arg1, byte arg2) {
        field952++;
        if (arg1 == 0 && class14.field313 == arg0) {
            return true;
        } else if (arg1 == 1 && class16.field327 == arg0) {
            return true;
        } else if ((arg1 == 2 || arg1 == 3) && class127.field3032 == arg0) {
            return true;
        } else {
            if (arg2 != -125) {
                field948 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public static final void method341(int arg0, int arg1, int arg2) {
        int var3 = -59 / ((37 - arg2) / 56);
        if (class39.field825 != 0 && arg0 != -1) {
            class78.method618(0, arg0, false, class55.field1162, 1, class39.field825, (byte) 124);
            class82.field1828 = arg1;
        }
        field950++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method342(int arg0) {
        field951 = null;
        field948 = null;
        field943 = null;
        field949 = null;
        field945 = null;
        field956 = null;
        field954 = null;
        field947 = null;
        if (arg0 == 8) {
            field953 = null;
        }
    }
}
