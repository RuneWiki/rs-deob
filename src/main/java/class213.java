import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class213 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "S")
    public static short field3638 = 256;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field3641 = 0;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lia;")
    public static class257 field3645 = class28.method234(-112, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lia;")
    public static class257 field3646 = class28.method234(120, "Mem:");

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public static final void method1433(int arg0, int arg1, int arg2) {
        field3639++;
        if (arg2 != 256) {
            field3642 = -109;
        }
        class117.field2100[arg1] = arg0;
        class37 var3 = (class37) class75.field1453.method434((byte) -93, (long) arg1);
        if (var3 == null) {
            class37 var4 = new class37(class80.method600(arg2 ^ 0xFFFFFEE2) + 500L);
            class75.field1453.method424(var4, (byte) -40, (long) arg1);
        } else {
            var3.field731 = class80.method600(-96) + 500L;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method1434(int arg0) {
        if (arg0 == 256) {
            field3646 = null;
            field3645 = null;
        }
    }
}
