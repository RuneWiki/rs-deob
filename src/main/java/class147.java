import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class147 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2655 = 0;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2652 = 0;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field2660 = 0;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Llc;")
    public static class143 field2659 = class66.method374("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", -1);

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Llc;")
    private static class143 field2658 = class66.method374("flash1:", -1);

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Llc;")
    public static class143 field2662 = null;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2651 = -1;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Llc;")
    public static class143 field2653 = field2658;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Llc;")
    public static class143 field2657 = field2658;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lkh;")
    public static class12 field2663;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZI)V")
    public static final void method945(int arg0, boolean arg1, int arg2) {
        field2661++;
        if (!arg1) {
            method945(73, false, 105);
        }
        class166 var3 = class262.method1746(118, arg2, 13);
        var3.method1097((byte) -74);
        var3.field2978 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    public static final void method946(int arg0, int arg1) {
        field2654++;
        if (class47.method289((byte) 34, arg0) && arg1 >= 9) {
            class256.method1697(class223.field4045[arg0], -1, 0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method947(byte arg0) {
        field2663 = null;
        field2658 = null;
        field2657 = null;
        field2662 = null;
        field2659 = null;
        field2653 = null;
        if (arg0 != 110) {
            field2651 = -79;
        }
    }
}
