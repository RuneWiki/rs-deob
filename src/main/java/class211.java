import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class211 {

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "Lmw;")
    public static class517 field2709 = new class517(6, 7);

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "[I")
    public static int[] field2715 = new int[13];

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field2714 = 0;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "Log;")
    public static class673 field2712;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "[Lls;")
    public static class150[] field2713;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)Z", line = 8)
    public static final boolean method1372(byte arg0) {
        if (arg0 > -38) {
            return false;
        }
        field2710++;
        if (class273.field3971) {
            try {
                class376.method2358(class552.field7624, 3860, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)V", line = 30)
    public static final void method1373(int arg0, int arg1) {
        field2711++;
        class778 var2 = class389.method2406(51, (long) arg1, arg0);
        var2.method4276(0);
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)I", line = 41)
    public static final int method1374(int arg0, int arg1) {
        return class455.field6521 == null ? 0 : class455.field6521[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 57)
    public static void method1375(int arg0) {
        field2709 = null;
        field2712 = null;
        field2713 = null;
        field2715 = null;
        if (arg0 >= -126) {
            field2713 = null;
        }
    }
}
