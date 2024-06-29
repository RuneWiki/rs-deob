import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class661 {

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "[S")
    public static short[] field9381 = new short[256];

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I", line = 3)
    public static final int method3672(int arg0, int arg1) {
        field9382++;
        if (arg1 != -6411) {
            method3672(-28, 9);
        }
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V", line = 38)
    public static void method3673(byte arg0) {
        field9381 = null;
        if (arg0 != 100) {
            method3672(120, 45);
        }
    }
}
