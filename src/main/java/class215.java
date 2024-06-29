import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class215 {

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field2605 = 0;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "Lsb;")
    public static class305 field2606 = new class305(77, -1);

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field2607 = -1;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "[I")
    public static int[] field2608;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 3)
    public static void method1263(int arg0) {
        field2606 = null;
        if (arg0 == 0) {
            field2608 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field2604++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V", line = 40)
    public static final void method1264(int arg0) {
        class486.field6994++;
        field2602++;
        class653 var1 = class699.method3845((byte) 45, class39.field395, class630.field8867);
        if (arg0 != 77) {
            return;
        }
        var1.field9158.method658(class201.method1206(119), (byte) 110);
        var1.field9158.method645(arg0 ^ 0xD7EF86A5, class146.field1618);
        var1.field9158.method645(-672168216, class338.field4244);
        var1.field9158.method658(class639.field9075.field6769, (byte) 70);
        class568.method3220(var1, (byte) 21);
    }
}
