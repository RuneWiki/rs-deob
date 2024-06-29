import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class288 extends class317 {

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field4282 = 0;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field4284 = 0;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "[Z")
    public static boolean[] field4285 = new boolean[100];

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "[I")
    public static int[] field4281;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "[[Ltk;")
    public static class268[][] field4283;

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 6)
    public class288() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V", line = 14)
    public static final void method1979(int arg0, int arg1) {
        class113 var2 = (class113) class255.field3648.method111(-111, (long) arg1);
        field4280++;
        if (arg0 < 105) {
            field4284 = 9;
        }
        if (var2 != null) {
            var2.method1274((byte) -26);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I", line = 29)
    public final int[] method140(int arg0, int arg1) {
        field4286++;
        if (arg0 != 542) {
            field4284 = -40;
        }
        return class99.field1360;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 46)
    public static void method1980(int arg0) {
        if (arg0 != 0) {
            field4283 = (class268[][]) ((class268[][]) null);
        }
        field4285 = null;
        field4283 = (class268[][]) null;
        field4281 = null;
    }
}
