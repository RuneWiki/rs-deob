import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class494 {

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
    public static int[] field6740 = new int[2048];

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "[Lei;")
    public static class161[] field6736;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method2788(byte arg0) {
        if (arg0 != 95) {
            this.method2788((byte) 80);
        }
        field6737++;
        return class329.field4456 == this | class202.field2857 == this;
    }

    @OriginalMember(owner = "client!tp", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        field6739++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 22)
    public static final void method2789(int arg0) {
        class624.field8662.method3749(7648);
        field6738++;
        if (arg0 <= 121) {
            method2790(51);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 33)
    public static void method2790(int arg0) {
        field6740 = null;
        if (arg0 < 101) {
            method2789(-87);
        }
        field6736 = null;
    }
}
