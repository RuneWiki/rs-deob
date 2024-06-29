import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class207 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2958 = -1;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Z")
    public static boolean field2963 = false;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    public static int[] field2959 = new int[100];

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;", line = 12)
    public final String toString() {
        field2960++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method1394(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class426.field6401.field1022 != 0 && arg3 != 0 && class299.field4256 < 50 && arg2 != -1) {
            class333.field4700[class299.field4256++] = new class297((byte) 1, arg2, arg3, arg4, arg0, 0);
        }
        field2961++;
        if (arg1 != 100) {
            method1394(31, -119, 63, -20, -17);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 39)
    public static void method1395(int arg0) {
        if (arg0 != 6610) {
            field2959 = null;
        }
        field2959 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 53)
    public class207(String arg0, int arg1) {
        this.field2962 = arg1;
    }
}
