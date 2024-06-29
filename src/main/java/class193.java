import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class193 {

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lpj;")
    public static class237 field3344 = class33.method353("zap", 81);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method1318(byte arg0) {
        field3344 = null;
        int var1 = 68 / ((arg0 + 57) / 52);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method1319(int arg0, int arg1) {
        class166 var2 = (class166) class232.field4021.method566(0);
        if (arg1 >= -110) {
            field3340 = 109;
        }
        while (var2 != null) {
            if ((var2.field1530 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method629(0);
            }
            var2 = (class166) class232.field4021.method565(76);
        }
        field3343++;
    }
}
