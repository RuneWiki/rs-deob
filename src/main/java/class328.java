import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class328 {

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    private int field4187;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "[I")
    public static int[] field4184 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field4190 = 100;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "[Lac;")
    public static class712[] field4189;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)I", line = 10)
    public final int method1940(byte arg0) {
        if (arg0 <= 67) {
            method1942((byte) -37);
        }
        field4183++;
        return this.field4187;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 23)
    public static final void method1941(int arg0) {
        field4185++;
        class573.field8008.method776((byte) -114);
        class30.field487.method776((byte) -68);
        if (arg0 >= -38) {
            method1941(61);
        }
        class372.field5237.method776((byte) 87);
        class5.field48.method776((byte) 54);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V", line = 37)
    public static void method1942(byte arg0) {
        field4184 = null;
        field4189 = null;
        if (arg0 != -47) {
            field4190 = 39;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(II)V", line = 51)
    public class328(int arg0, int arg1) {
        this.field4187 = arg0;
        this.field4186 = arg1;
    }

    @OriginalMember(owner = "client!us", name = "toString", descriptor = "()Ljava/lang/String;", line = 60)
    public final String toString() {
        field4188++;
        throw new IllegalStateException();
    }
}
