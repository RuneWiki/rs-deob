import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class724 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "[I")
    public static int[] field10047 = new int[2];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method4046(int arg0) {
        field10047 = null;
        if (arg0 != 2) {
            field10047 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)V")
    public static final void method4047(byte arg0, int arg1) {
        class121.field1601 = arg1;
        field10046++;
        int var2 = -90 / ((arg0 + 38) / 36);
    }
}
