import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class356 {

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4722 = new String[100];

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "Lrg;")
    public static class596 field4724 = new class596(10, 17);

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "Ljl;")
    public static class245 field4728 = null;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field4729 = 0;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field4730 = 0;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2042(boolean arg0) {
        field4722 = null;
        field4724 = null;
        if (arg0) {
            field4728 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBI)Z", line = 16)
    public static final boolean method2043(int arg0, byte arg1, int arg2) {
        int var3 = -32 / ((-arg1 - 52) / 58);
        field4723++;
        return class483.method2714(arg0, arg2, 32768) | (arg0 & 0x800) != 0 || class66.method559(arg0, arg2, false);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIB)Z", line = 29)
    public static final boolean method2044(int arg0, int arg1, byte arg2) {
        if (arg2 == 94) {
            field4726++;
            return (arg0 & 0x10000) != 0;
        } else {
            return true;
        }
    }
}
