import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class381 extends class503 {

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Laga;")
    public static class696 field5564 = new class696();

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public int field5559;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public int field5560;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public int field5567;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Lbba;")
    public class124 field5562;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Lwh;")
    public static class158 field5566;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[[B")
    public static byte[][] field5565;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 3)
    public static void method2429(int arg0) {
        int var1 = 91 / ((arg0 - 38) / 38);
        field5565 = null;
        field5564 = null;
        field5566 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)I", line = 18)
    public static final int method2430(int arg0, int arg1) {
        field5563++;
        if (arg1 < 96) {
            return 0;
        } else {
            if (arg0 <= 53) {
                method2429(-72);
            }
            return arg1 < 128 ? 2 : 3;
        }
    }
}
