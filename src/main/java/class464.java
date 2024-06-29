import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class464 {

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field6910 = 4;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lho;")
    public static class103 field6909 = new class103(0, -1);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[Lo;")
    public static class24[] field6907;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method2842(int arg0) {
        if (arg0 == 255) {
            field6909 = null;
            field6907 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method2843(int arg0) {
        field6908++;
        class391.field5656 = 0;
        class69.field806.method984(false);
        class69.field806.method975(0, class263.field3530);
        if (arg0 != -1) {
            method2842(103);
        }
        class391.field5656++;
    }
}
