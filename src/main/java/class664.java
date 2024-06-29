import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class664 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field8662 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lwm;")
    public static class30 field8660;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 5)
    public static void method3613(int arg0) {
        int var1 = -105 / ((-arg0 - 57) / 46);
        field8660 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZII)V", line = 15)
    public static final void method3614(boolean arg0, int arg1, int arg2) {
        field8661++;
        if (class683.method3667(arg1, -121) && !arg0) {
            class683.method3664(arg2, class647.field8259[arg1], (byte) 87);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 31)
    public static final void method3615(int arg0) {
        if (arg0 != 14722) {
            method3615(81);
        }
        field8659++;
        int var1 = class20.field189;
        int[] var2 = class503.field6451;
        for (int var3 = 0; var3 < var1; var3++) {
            class33 var4 = class263.field3508[var2[var3]];
            if (var4 != null) {
                class102.method586(false, var4.method190((byte) 67), var4);
            }
        }
    }
}
