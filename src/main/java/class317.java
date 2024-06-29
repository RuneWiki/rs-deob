import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class317 {

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
    public static int field4065 = 13156520;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "[I")
    public static int[] field4064 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "Lwp;")
    public static class453 field4066 = new class453(14, 5);

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "Z")
    public static volatile boolean field4067 = true;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1826(byte arg0, String arg1) {
        field4068++;
        if (class516.field7046 == null) {
            return;
        }
        if (arg0 < 73) {
            field4065 = -8;
        }
        class577.field8057++;
        class704 var2 = class314.method1820(class314.field4045, class400.field5014, (byte) 88);
        var2.field9929.method3509(class109.method611(arg1, (byte) 2), (byte) -114);
        var2.field9929.method3489(arg1, -23);
        class122.method654(var2, (byte) -36);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public static void method1827(int arg0) {
        if (arg0 == 0) {
            field4064 = null;
            field4066 = null;
        }
    }
}
