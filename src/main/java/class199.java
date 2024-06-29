import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class199 extends class41 {

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "Lsc;")
    public class181 field3453;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "[I")
    public static int[] field3448 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Lsc;")
    private static class181 field3447 = class149.method967(255, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "Lsc;")
    public static class181 field3451 = class149.method967(255, ": ");

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "Lsc;")
    public static class181 field3450 = field3447;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field3452 = -1;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lng;")
    public static class46 field3446;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static void method1347(byte arg0) {
        field3448 = null;
        if (arg0 < 90) {
            field3448 = null;
        }
        field3447 = null;
        field3451 = null;
        field3446 = null;
        field3450 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lsc;ZISIJLsc;)V")
    public static final void method1348(class181 arg0, boolean arg1, int arg2, short arg3, int arg4, long arg5, class181 arg6) {
        field3449++;
        if (class33.field534) {
            return;
        }
        if (!arg1) {
            method1347((byte) 79);
        }
        if (class131.field2177 >= 500) {
            return;
        }
        class161.field2749[class131.field2177] = arg6;
        class63.field970[class131.field2177] = arg0;
        class172.field2873[class131.field2177] = arg3;
        class98.field1586[class131.field2177] = arg5;
        class222.field3830[class131.field2177] = arg4;
        class22.field395[class131.field2177] = arg2;
        class131.field2177++;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class199() {
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lsc;)V")
    public class199(class181 arg0) {
        this.field3453 = arg0;
    }
}
