import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class114 extends class358 {

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "[Z")
    public static boolean[] field1496 = new boolean[100];

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "F")
    public static float field1493;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static void method689(byte arg0) {
        if (arg0 >= 50) {
            field1496 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILfo;IIZ)V")
    public static final void method690(int arg0, int arg1, int arg2, class361 arg3, int arg4, int arg5, boolean arg6) {
        class204.field2703 = arg4;
        class97.field1260 = 1;
        class476.field7045 = arg3;
        class337.field4464 = arg1;
        class435.field6349 = arg5;
        if (arg2 != 0) {
            method690(26, 70, -80, null, 88, -9, false);
        }
        class212.field2841 = arg0;
        field1498++;
        class481.field7112 = arg6;
    }
}
