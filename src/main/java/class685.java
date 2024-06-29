import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class685 implements class517 {

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public int field9682;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field9684;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "[I")
    public static int[] field9688;

    @OriginalMember(owner = "client!ew", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9687++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I")
    public static final int method3820(int arg0, int arg1) {
        field9686++;
        if (arg1 < 21) {
            field9685 = -68;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(JJ)J")
    public static long method3821(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class685(String arg0, int arg1) {
        this.field9682 = arg1;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static void method3822(int arg0) {
        field9684 = null;
        field9688 = null;
        if (arg0 != -5324) {
            field9688 = null;
        }
    }
}
