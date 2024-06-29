import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class646 extends class596 {

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
    public int[] field8935;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
    public int[] field8937;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field8931 = 0;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field8933 = 0;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field8936 = 0;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[J")
    public static long[] field8932 = new long[100];

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "F")
    public static float field8934;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static void method3591(int arg0) {
        if (arg0 < 0) {
            method3591(33);
        }
        field8932 = null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II[I[I)V")
    public class646(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field8935 = arg2;
        this.field8937 = arg3;
    }
}
