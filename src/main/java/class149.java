import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class149 extends Exception {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lkaa;")
    public static class47 field2338 = new class47(84, 4);

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field2339 = 0;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1113(byte arg0) {
        field2338 = null;
        if (arg0 > -33) {
            field2338 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BC)Z")
    public static final boolean method1114(byte arg0, char arg1) {
        int var2 = 5 / ((57 - arg0) / 63);
        field2337++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}
