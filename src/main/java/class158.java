import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class158 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Lbs;")
    public static class111 field2551;

    static {
        new class306("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1102(int arg0, int arg1) {
        if (arg0 <= 2) {
            method1102(-86, -95);
        }
        field2552++;
        class266 var2 = class308.method1961(true, arg1, 5);
        var2.method1778(17991);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Lf;", line = 17)
    public static final class192 method1103(int arg0, int arg1, int arg2) {
        class465 var3 = class66.field977[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6904;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 25)
    public static final void method1104(byte arg0) {
        if (class160.field2564 <= 0) {
            class250.field4263 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class383.field5913.length; var2++) {
                if (class383.field5913[var2].startsWith("--> ")) {
                    int var10000 = ~class160.field2564;
                    var1++;
                    if (var10000 == ~var1) {
                        class250.field4263 = class383.field5913[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (arg0 <= 60) {
            field2549 = 91;
        }
        field2550++;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V", line = 64)
    public static void method1105(byte arg0) {
        if (arg0 <= 67) {
            method1103(113, -119, -70);
        }
        field2551 = null;
    }
}
