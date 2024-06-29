import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class677 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field9550 = 0;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field9552 = 0;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field9551 = -1;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Lwv;")
    public static final class32 method3741(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class32 var4 = var3.field6743;
            var3.field6743 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIII)I")
    public static final int method3742(byte arg0, int arg1, int arg2, int arg3) {
        field9553++;
        if (arg0 != 58) {
            field9549 = 88;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }
}
