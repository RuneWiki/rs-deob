import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class52 extends class339 {

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Z")
    public static boolean field659 = false;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field657 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Lhd;")
    public static class694 field658 = new class694(16);

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 4)
    public static void method300(boolean arg0) {
        field657 = null;
        field658 = null;
        if (arg0) {
            method300(false);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lpfa;ILpfa;Lpfa;Lpfa;)V", line = 17)
    public static final void method301(class275 arg0, int arg1, class275 arg2, class275 arg3, class275 arg4) {
        class136.field1662 = arg2;
        class276.field3526 = arg4;
        field660++;
        class702.field9825 = arg0;
        class325.field4062 = new class337[class276.field3526.method1642(arg1 ^ 0xFFFFFF85)][];
        class492.field6136 = new boolean[class276.field3526.method1642(-52)];
        if (arg1 != 16) {
            field657 = null;
        }
    }
}
