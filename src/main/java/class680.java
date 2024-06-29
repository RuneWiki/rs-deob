import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class680 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field9331 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZBI)I")
    public static final int method3810(boolean arg0, byte arg1, int arg2) {
        field9330++;
        if (arg0) {
            return 0;
        }
        class95 var3 = class71.method589(arg0, arg1 - 9953, arg2);
        if (var3 == null) {
            return class237.field3177.method819(arg2, true).field6373;
        }
        int var4 = 0;
        if (arg1 != 99) {
            field9331 = null;
        }
        for (int var5 = 0; var5 < var3.field1107.length; var5++) {
            if (var3.field1107[var5] == -1) {
                var4++;
            }
        }
        return var4 + class237.field3177.method819(arg2, true).field6373 - var3.field1107.length;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method3811(byte arg0) {
        if (arg0 == 102) {
            field9331 = null;
        }
    }
}
