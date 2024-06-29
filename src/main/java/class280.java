import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class280 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field4822 = 0;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lig;")
    public static class168 field4824 = new class168(100);

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lig;")
    public static class168 field4825 = new class168(64);

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lcd;")
    public static class64 field4826 = class44.method335((byte) 71, "(U(Y");

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field4827 = 5063219;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lcd;")
    public static class64 field4829 = class44.method335((byte) 71, "null");

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 67)
    public static void method1939(boolean arg0) {
        field4826 = null;
        field4829 = null;
        if (!arg0) {
            field4824 = (class168) null;
        }
        field4825 = null;
        field4824 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I", line = 151)
    public static final int method1940(int arg0, int arg1, int arg2) {
        field4823++;
        int var3 = class46.method349(arg1 - 1, arg0 - 1, 789221) + (class46.method349(arg1 - 1, arg0 + 1, 789221) - (-class46.method349(arg1 + 1, arg0 + -1, 789221) - class46.method349(arg1 + 1, arg0 + 1, 789221)));
        int var4 = class46.method349(arg1, arg0 - 1, 789221) + class46.method349(arg1, arg0 + 1, 789221) + class46.method349(arg1 + -1, arg0, 789221) + class46.method349(arg1 + 1, arg0, 789221);
        int var5 = class46.method349(arg1, arg0, 789221);
        return arg2 < 95 ? 102 : var5 / 4 + (var3 / 16 + (var4 / 8));
    }
}
