import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class360 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lph;")
    private class459 field5286;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public int field5285;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "[[Lpb;")
    public static class469[][] field5288;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static void method2214(int arg0) {
        field5288 = null;
        if (arg0 != 64) {
            field5288 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILgh;IB)V")
    public static final void method2215(int arg0, class388 arg1, int arg2, byte arg3) {
        class79.field1577 = arg2;
        class447.field6657 = arg0;
        class362.field5300 = arg1;
        field5287++;
        if (arg3 != -42) {
            field5288 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lkp;ILph;)V")
    public class360(class341 arg0, int arg1, class459 arg2) {
        new class399(64);
        this.field5286 = arg2;
        this.field5285 = this.field5286.method2763(15, -3);
    }
}
