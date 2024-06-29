import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class130 {

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Z")
    public static boolean field2211 = true;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "Lwm;")
    public static class399 field2208 = new class399(8);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 5)
    public static void method1012(byte arg0) {
        field2208 = null;
        int var1 = -92 / ((arg0 + 17) / 42);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IFFF)I", line = 19)
    public static final int method1013(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 != 2) {
            field2208 = null;
        }
        field2210++;
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var5 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var5 > var4 && var6 < var5) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg2 > 0.0F ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ru", name = "toString", descriptor = "()Ljava/lang/String;", line = 66)
    public final String toString() {
        field2209++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(II)V", line = 73)
    public class130(int arg0, int arg1) {
        this.field2207 = arg0;
    }
}
