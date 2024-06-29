import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class500 {

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method2932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6852++;
        int var8 = arg2 + 1;
        class128.method883(arg0, arg4, arg1, class705.field9804[arg2], 7);
        int var9 = arg5 - 1;
        class128.method883(arg0, arg4, arg1, class705.field9804[arg5], 7);
        if (arg3 >= 126) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class705.field9804[var6];
                var7[arg4] = var7[arg1] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field6849++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Z", line = 43)
    public static final boolean method2933(int arg0, int arg1, int arg2) {
        field6851++;
        if (arg1 != 32) {
            field6848 = -128;
        }
        return (arg2 & 0x20) != 0;
    }
}
