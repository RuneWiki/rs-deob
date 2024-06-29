import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class247 extends class203 {

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Ljw;")
    public static class581 field3684 = new class581(133, 4);

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Ljv;")
    public static class87 field3686 = new class87(16);

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1662(int arg0) {
        field3684 = null;
        if (arg0 != 4096) {
            method1662(-13);
        }
        field3686 = null;
    }
}
