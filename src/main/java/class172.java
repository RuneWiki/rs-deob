import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class172 {

    @OriginalMember(owner = "client!op", name = "a", descriptor = "[I")
    public static int[] field2094 = new int[14];

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field2098 = 0;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field2099 = -1;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "[Lna;")
    public static class43[] field2097;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)I")
    public final int method1080(int arg0, int arg1, int arg2) {
        int var4 = -127 % ((13 - arg2) / 36);
        field2096++;
        int var5 = arg1 < class300.field4038 ? class300.field4038 : arg1;
        if (class469.field6560 == this) {
            return 0;
        } else if (class601.field8665 == this) {
            return var5 - arg0;
        } else if (class582.field8477 == this) {
            return (var5 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!op", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2095++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field2094 = null;
        if (arg0 == 2) {
            field2097 = null;
        }
    }
}
