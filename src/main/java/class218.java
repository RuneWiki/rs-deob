import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class218 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lqd;")
    public static class37 field3224 = new class37(64);

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
    public static final void method1404(int arg0, int arg1, int arg2) {
        field3221++;
        class140.field2028 = arg2 - class212.field3040;
        class12.field191 = class63.field1009 + class54.field828 - arg0 - 1;
        if (arg1 < 96) {
            field3225 = -56;
        }
        int var3 = class140.field2028 - ((int) ((float) class204.field2952.field4177 / class276.field4428));
        int var4 = class12.field191 - ((int) ((float) class204.field2952.field4051 / class276.field4428));
        int var5 = class140.field2028 + ((int) ((float) class204.field2952.field4177 / class276.field4428));
        if (var3 < 0) {
            class140.field2028 = (int) ((float) class204.field2952.field4177 / class276.field4428);
        }
        int var6 = class12.field191 + ((int) ((float) class204.field2952.field4051 / class276.field4428));
        if (class99.field1482 < var5) {
            class140.field2028 = class99.field1482 - (int) ((float) class204.field2952.field4177 / class276.field4428);
        }
        if (var4 < 0) {
            class12.field191 = (int) ((float) class204.field2952.field4051 / class276.field4428);
        }
        if (class63.field1009 < var6) {
            class12.field191 = class63.field1009 - (int) ((float) class204.field2952.field4051 / class276.field4428);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method1405(byte arg0) {
        if (arg0 != -121) {
            method1404(-110, 35, -107);
        }
        field3224 = null;
    }
}
