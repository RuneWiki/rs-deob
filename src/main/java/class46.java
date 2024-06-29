import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class46 {

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "[I")
    public static int[] field483 = new int[2];

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 6)
    public static void method276(int arg0) {
        field483 = null;
        if (arg0 != 0) {
            method277(false, false);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZZ)V", line = 21)
    public static final void method277(boolean arg0, boolean arg1) {
        field485++;
        if (class704.field9878.length() == 0) {
            return;
        }
        class392.method2288("--> " + class704.field9878, -117);
        class244.method1464(class704.field9878, arg0, arg1, (byte) 117);
        class704.field9878 = "";
        class716.field9976 = 0;
        class304.field4125 = 0;
    }
}
