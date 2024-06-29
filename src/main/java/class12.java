import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class12 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lvm;")
    public static class202 field165 = new class202(100);

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lvm;")
    public static class202 field169 = new class202(64);

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "F")
    public static float field167;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[[[B")
    public static byte[][][] field166;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method76(boolean arg0) {
        if (!arg0) {
            field168 = -115;
        }
        field162++;
        class166.field2704.method1415(-18218);
        class195.field3251.method1415(-18218);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 31)
    public static void method77(byte arg0) {
        field169 = null;
        field165 = null;
        if (arg0 < -64) {
            field166 = (byte[][][]) null;
        }
    }
}
