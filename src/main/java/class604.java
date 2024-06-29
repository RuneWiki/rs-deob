import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class604 {

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field8500 = 0;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Lrm;")
    public static class428 field8497 = new class428();

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "Luu;")
    public static class299 field8501;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "[I")
    public static int[] field8499;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method3486(int arg0, byte arg1) {
        int var2 = 125 / ((arg1 + 57) / 43);
        class49.field707.method2366(arg0, 126);
        field8498++;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V", line = 31)
    public static void method3487(boolean arg0) {
        field8497 = null;
        if (!arg0) {
            field8501 = null;
            field8499 = null;
        }
    }
}
