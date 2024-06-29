import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class197 extends class544 {

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field2381 = 0;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field2379 = -2;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field2385 = 0;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Ljs;")
    public static class275 field2380 = new class275(7, 0, 1, 1);

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
    public static boolean field2383;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 8)
    public static void method1068(int arg0) {
        if (arg0 <= 59) {
            field2380 = null;
        }
        field2380 = null;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V", line = 41)
    public class197(int arg0, int arg1) {
        this.field2386 = arg0;
        this.field2384 = arg1;
    }
}
