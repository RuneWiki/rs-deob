import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class542 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lqfa;")
    public static class98 field7573 = new class98(120, 1);

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lgda;")
    public static class53 field7575 = new class53(63, -1);

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field7578 = 0;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lkk;")
    public static class188 field7579 = new class188(16);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lnga;")
    public static class513 field7576;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3146(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method3148((byte) 36);
        }
        field7572++;
        return class210.method1296((byte) -93, arg2, arg1) & class310.method2014(118, arg2, arg1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
    public static final void method3147(int arg0, boolean arg1) {
        if (arg1) {
            if (class457.field6447 != -1) {
                class52.method325(0, class457.field6447);
            }
            for (class47 var2 = (class47) class475.field6744.method1176(24490); var2 != null; var2 = (class47) class475.field6744.method1178((byte) 71)) {
                if (!var2.method1187(0)) {
                    var2 = (class47) class475.field6744.method1176(24490);
                    if (var2 == null) {
                        break;
                    }
                }
                class353.method2275(false, true, var2, -88);
            }
            class457.field6447 = -1;
            class475.field6744 = new class188(8);
            class415.method2553(30695);
            class457.field6447 = class258.field3728;
            class364.method2320(false, -14543);
            class350.method2257(-101);
            class241.method1536(class457.field6447);
        }
        field7574++;
        if (arg0 > -108) {
            field7575 = null;
        }
        class370.field5212 = true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method3148(byte arg0) {
        if (arg0 != -73) {
            method3147(-22, true);
        }
        field7575 = null;
        field7573 = null;
        field7576 = null;
        field7579 = null;
    }
}
