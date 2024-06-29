import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class34 {

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field483 = "Starting 3d Library";

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Z")
    public static boolean field487 = false;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lcg;")
    public static class49 field492;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 5)
    public static void method308(int arg0) {
        if (arg0 != 1) {
            method309(81, (class49) null);
        }
        field483 = null;
        field492 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILcg;)V", line = 21)
    public static final void method309(int arg0, class49 arg1) {
        field490++;
        class276.field4397 = arg1;
        if (arg0 != 0) {
            method310(-105, -61);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 48)
    public static final void method310(int arg0, int arg1) {
        field485++;
        class203.field3453.method469(arg1 + 2434, arg0);
        if (arg1 != -14249) {
            method311((byte) -68);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 64)
    public static final void method311(byte arg0) {
        field491++;
        if (arg0 < -27) {
            class200.field3405.method466(-1);
            class262.field4247.method466(-1);
            class253.field4069.method466(-1);
        }
    }
}
