import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class452 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "J")
    public static long field6182;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
    public static final void method2617(int arg0, byte arg1) {
        field6183++;
        class282.field3914 = arg0;
        class687.field9553.method273(-32);
        if (arg1 != -115) {
            method2617(-14, (byte) -28);
        }
    }
}
