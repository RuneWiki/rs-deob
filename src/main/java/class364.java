import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class364 {

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "Z")
    public static boolean field5568 = false;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "[I")
    public static int[] field5570 = new int[3];

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Leda;")
    public static class14 field5565 = new class14(260);

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lcb;")
    public static class631 field5571 = new class631(35, 18);

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "Lha;")
    public static class544 field5573;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "[B")
    public byte[] field5569;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "[S")
    public short[] field5563;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "[S")
    public short[] field5564;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[S")
    public short[] field5567;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2343(int arg0, int arg1, int arg2) {
        if (arg1 > -113) {
            return true;
        } else {
            field5566++;
            return (arg2 & 0x70000) != 0 | class483.method2924(arg2, arg0, 1) || class312.method2057(arg2, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 18)
    public static void method2344(int arg0) {
        field5573 = null;
        field5570 = null;
        field5565 = null;
        if (arg0 > -109) {
            field5574 = -90;
        }
        field5571 = null;
    }
}
