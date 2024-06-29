import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class464 extends class544 {

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field6495;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public int field6496;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lvj;")
    public static class373 field6493 = new class373(2, 20);

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lvj;")
    public static class373 field6497 = new class373(26, 2);

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Lui;")
    public static class193 field6498 = new class193();

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZIII)V", line = 10)
    public static final void method2708(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class271.field3513 = arg0;
        if (!arg1) {
            field6497 = null;
        }
        class470.field6589 = arg4;
        class563.field8282 = arg2;
        field6494++;
        class592.field8588 = arg3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V", line = 25)
    public static void method2709(boolean arg0) {
        field6498 = null;
        field6497 = null;
        field6493 = null;
        if (!arg0) {
            method2708(15, true, -40, 89, -98);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V", line = 36)
    public class464(int arg0, int arg1) {
        this.field6495 = arg0;
        this.field6496 = arg1;
    }
}
