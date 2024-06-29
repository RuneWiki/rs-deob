import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class274 extends class108 {

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4315 = 0;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[I")
    public static int[] field4317 = new int[14];

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method1843(byte arg0) {
        if (arg0 < -111) {
            field4317 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static final void method1844(int arg0) {
        field4316++;
        if (arg0 != -987) {
            method1843((byte) 96);
        }
        if (class245.field3801) {
            class245.field3801 = false;
            class83.field1370 = null;
            class264.field4163 = null;
        }
    }
}
