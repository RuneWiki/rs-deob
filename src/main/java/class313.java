import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class313 extends class210 {

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "[J")
    public static long[] field4592 = new long[32];

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "Z")
    public static boolean field4594;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
    public static void method2067(int arg0) {
        field4592 = null;
        if (arg0 != -97) {
            method2067(-9);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)I")
    public static final int method2068(int arg0, int arg1) {
        field4595++;
        if (arg0 >= -1) {
            field4592 = null;
        }
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class313() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        field4593++;
        return arg1 == -38 ? class430.field6250 : null;
    }
}
