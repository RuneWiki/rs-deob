import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class271 {

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4283 = new String[100];

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "Lpn;")
    public static class49 field4281 = new class49(71, 8);

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "[I")
    public static int[] field4285 = new int[32];

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Lwn;")
    public static class177 field4282;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Lmu;")
    public static class346 field4286;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method1865(byte arg0) {
        field4282 = null;
        field4285 = null;
        field4283 = null;
        if (arg0 == 38) {
            field4281 = null;
            field4286 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1866(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field4279++;
            return arg1 >= 12 && arg1 <= 17;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
    public static final int method1867(int arg0, int arg1) {
        field4280++;
        return arg1 == 255 ? arg0 & 0xFF : 81;
    }

    @OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4284++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(II)V")
    public class271(int arg0, int arg1) {
    }
}
