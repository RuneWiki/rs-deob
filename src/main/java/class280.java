import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class280 {

    @OriginalMember(owner = "client!on", name = "b", descriptor = "F")
    public static float field3680;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Ldn;")
    public static class438 field3679;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method1593(int arg0) {
        field3679 = null;
        if (arg0 != -1021) {
            field3679 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ldn;BLdn;Ldn;Ldn;)V")
    public static final void method1594(class438 arg0, byte arg1, class438 arg2, class438 arg3, class438 arg4) {
        class236.field2895 = arg0;
        class524.field7347 = arg3;
        class267.field3487 = arg4;
        class564.field8291 = arg2;
        if (arg1 != 58) {
            method1593(116);
        }
        field3681++;
        class459.field6326 = new class509[class267.field3487.method2565((byte) 97)][];
        class565.field8292 = new boolean[class267.field3487.method2565((byte) -106)];
    }
}
