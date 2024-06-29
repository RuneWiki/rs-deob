import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class336 {

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4992 = "";

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field4995 = -1;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public static int field4993 = -1;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2163(int arg0, String arg1) {
        field4997++;
        int var2 = 0;
        if (arg0 != -1) {
            method2165((byte) -76);
        }
        while (class752.field10428.length > var2) {
            if (class752.field10428[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4996++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)I")
    public final int method2164(int arg0, int arg1, int arg2) {
        field4994++;
        int var4 = arg0 >= class638.field8980 ? arg0 : class638.field8980;
        if (class180.field2729 == this) {
            return 0;
        } else if (class291.field4413 == this) {
            return var4 - arg2;
        } else if (class196.field2877 == this) {
            return (var4 - arg2) / 2;
        } else if (arg1 == 0) {
            return 0;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public static void method2165(byte arg0) {
        field4992 = null;
        int var1 = 109 % ((15 - arg0) / 52);
    }
}
