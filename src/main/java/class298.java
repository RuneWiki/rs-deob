import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class298 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "[I")
    public static int[] field4070 = new int[13];

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 3)
    public static void method1809(byte arg0) {
        if (arg0 > -93) {
            method1809((byte) 78);
        }
        field4070 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 13)
    public static final void method1810(int arg0) {
        field4069++;
        if (arg0 > -113) {
            method1809((byte) -81);
        }
        class54.method410(-1);
    }
}
