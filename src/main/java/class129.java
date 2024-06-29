import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class129 extends class102 {

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field2356 = 0;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "Lqe;")
    public static class179 field2358 = class206.method1380(")4l", (byte) -31);

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "[[I")
    public static int[][] field2357 = new int[104][104];

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "Lqe;")
    public static class179 field2359 = class206.method1380("mapflag", (byte) -127);

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "[I")
    public static int[] field2355;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field2360;
        if (!arg0) {
            field2359 = null;
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            class154.method988(var3, 0, class155.field2796, class94.field1769[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public static void method826(int arg0) {
        field2358 = null;
        field2357 = null;
        field2355 = null;
        if (arg0 != 104) {
            method826(5);
        }
        field2359 = null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }
}
