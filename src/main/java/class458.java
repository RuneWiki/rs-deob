import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class458 {

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "[J")
    public static long[] field6750 = new long[32];

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field6753 = new String[100];

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "F")
    public static float field6751;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V")
    public static final void method2798(int arg0) {
        if (arg0 > ~class753.field10517) {
            int var1 = 0;
            for (int var2 = 0; var2 < class146.field1946.length; var2++) {
                if (class146.field1946[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class753.field10517;
                    var1++;
                    if (var10000 == ~var1) {
                        class241.field3505 = class146.field1946[var2].substring(class146.field1946[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class241.field3505 = "";
        }
        field6752++;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
    public static void method2799(byte arg0) {
        if (arg0 != -122) {
            method2799((byte) -52);
        }
        field6753 = null;
        field6750 = null;
    }
}
