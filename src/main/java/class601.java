import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class601 implements class117 {

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
    public int field8405;

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "Ljava/lang/String;")
    public static String field8409 = null;

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "[Z")
    public static boolean[] field8408 = new boolean[8];

    @OriginalMember(owner = "client!eha", name = "h", descriptor = "[I")
    public static int[] field8411 = new int[3];

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "Lqk;")
    public static class1 field8406 = new class1(4, 7);

    @OriginalMember(owner = "client!eha", name = "i", descriptor = "Lv;")
    public static class165 field8412 = new class165();

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!eha", name = "g", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(I)V")
    public static final void method3477(int arg0) {
        field8410++;
        if (class562.field7912) {
            return;
        }
        class497.method2923((byte) 127, class545.field7583);
        if (class530.field7302 != null) {
            class497.method2923((byte) 127, class530.field7302);
        }
        if (arg0 != 7) {
            field8409 = null;
        }
        class562.field7912 = true;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V")
    public static void method3478(byte arg0) {
        field8411 = null;
        field8408 = null;
        field8406 = null;
        field8412 = null;
        if (arg0 <= -35) {
            field8409 = null;
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)Lof;")
    public final class475 method473(int arg0) {
        if (arg0 != 6) {
            method3478((byte) -112);
        }
        field8404++;
        return class181.field2287;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method3479(String arg0, boolean arg1, int arg2) {
        field8407++;
        class637.method3661(-1, (byte) 73, arg0, arg1, -1);
        int var3 = 18 / ((arg2 + 58) / 51);
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(I)V")
    public class601(int arg0) {
        this.field8405 = arg0;
    }
}
