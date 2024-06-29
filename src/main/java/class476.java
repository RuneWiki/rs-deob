import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class476 {

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "Loh;")
    private class404 field6781;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "[Lfd;")
    public static class526[] field6778 = new class526[0];

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IZI)V", line = 10)
    public static final void method2858(int arg0, boolean arg1, int arg2) {
        if (class446.field6457 != 0) {
            if (arg0 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class376.field4854[var3] = arg2;
                }
            } else {
                class376.field4854[arg0] = arg2;
            }
        }
        field6780++;
        class41.field465.method1368(0, arg2, arg0);
        if (!arg1) {
            field6777 = 81;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V", line = 46)
    public static void method2859(int arg0) {
        field6778 = null;
        if (arg0 < 52) {
            field6777 = -66;
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 63)
    public class476(class301 arg0, int arg1, class404 arg2) {
        new class620(64);
        this.field6781 = arg2;
        this.field6779 = this.field6781.method2482(0, 15);
    }
}
