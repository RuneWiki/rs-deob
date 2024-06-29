import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class468 {

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "Z")
    public static boolean field6608 = false;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "Lau;")
    public static class767 field6609 = null;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2742(int arg0, byte arg1, int arg2) {
        field6611++;
        if (arg1 < 13) {
            return false;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ldt;I)Lqi;")
    public static final class593 method2743(class254 arg0, int arg1) {
        field6607++;
        int var2 = arg0.method1672(-16516);
        return arg1 == -9598 ? new class593(var2) : null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIII)V")
    public static final void method2744(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -6522) {
            field6609 = null;
        }
        field6612++;
        int var4 = class125.field1721.field5173.method1871(43) * arg2 >> 8;
        if (arg3 == -1 && !class72.field973) {
            class423.method2549((byte) -100);
        } else if (arg3 != -1 && (class264.field3886 != arg3 || !class81.method647(-3610)) && var4 != 0 && !class72.field973) {
            class228.method1442(45, 0, var4, arg0, class66.field917, arg3, false);
            class542.method3131(true);
        }
        if (class264.field3886 != arg3) {
            class757.field10247 = null;
        }
        class264.field3886 = arg3;
    }
}
