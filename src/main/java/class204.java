import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class204 extends class459 {

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "[I")
    public static int[] field2410 = new int[32];

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Z")
    public static boolean field2414 = false;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field2407 = -1;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "Lrfa;")
    public class199 field2408;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "[B")
    public byte[] field2411;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        if (arg0 != 86) {
            field2410 = null;
        }
        field2410 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)[B")
    public final byte[] method1206(byte arg0) {
        ++field2413;
        if (super.field6563) {
            throw new RuntimeException();
        } else {
            if (arg0 >= -17) {
                field2410 = null;
            }
            return this.field2411;
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)I")
    public final int method1211(int arg0) {
        ++field2406;
        if (arg0 != 100) {
            this.method1206((byte) 93);
        }
        return super.field6563 ? 0 : 100;
    }
}
