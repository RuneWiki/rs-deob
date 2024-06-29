import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class136 extends class90 {

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "Lgj;")
    public class202 field1966;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "Z")
    public static boolean field1965 = false;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "J")
    public static long field1972 = 0L;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Lve;")
    public static class233 field1971;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method918(byte arg0, String arg1) {
        if (arg0 < 110) {
            method920((byte) 22);
        }
        field1969++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lgj;)V")
    public class136(class202 arg0) {
        this.field1966 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BC)Z")
    public static final boolean method919(byte arg0, char arg1) {
        field1973++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else {
            if (arg0 != -122) {
                method920((byte) 74);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method920(byte arg0) {
        field1971 = null;
        int var1 = -107 / ((-arg0 - 27) / 53);
    }
}
