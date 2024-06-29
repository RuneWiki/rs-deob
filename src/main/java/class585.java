import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class585 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[I")
    public static int[] field8081 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
    public static int[] field8082 = new int[4096];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V")
    public static final void method3241(byte arg0, Object[] arg1, long[] arg2) {
        field8080++;
        class364.method2126(arg1, arg2.length - 1, 32, 0, arg2);
        if (arg0 != 39) {
            method3241((byte) -114, null, null);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method3242(boolean arg0) {
        field8082 = null;
        if (arg0) {
            field8081 = null;
        }
    }
}
