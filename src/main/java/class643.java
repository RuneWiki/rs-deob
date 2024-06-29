import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class643 {

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public int field8728;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "Ljava/lang/String;")
    public String field8727;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "[F")
    public static float[] field8729 = new float[16];

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
    public static int[] field8726;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[S)[S", line = 6)
    public static final short[] method3600(int arg0, int arg1, short[] arg2) {
        field8724++;
        short[] var3 = new short[arg1];
        class70.method552(arg2, 0, var3, arg0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field8725++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 31)
    public static void method3601(int arg0) {
        field8726 = null;
        field8729 = null;
        if (arg0 <= 22) {
            method3601(-19);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 44)
    public class643(String arg0, int arg1) {
        this.field8728 = arg1;
        this.field8727 = arg0;
    }
}
