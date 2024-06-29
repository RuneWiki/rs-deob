import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class293 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[I")
    public static int[] field4276 = new int[8];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public int field4277;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 8)
    public static void method1901(byte arg0) {
        if (arg0 >= -74) {
            field4278 = -63;
        }
        field4276 = null;
    }
}
