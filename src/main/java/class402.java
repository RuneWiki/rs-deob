import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class402 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Lmba;")
    private class643 field5751;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "J")
    public long field5752;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "[[Z")
    public static boolean[][] field5754;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lla;Lla;II)V")
    public static final void method2442(class423 arg0, class423 arg1, int arg2, int arg3) {
        class613.field8759 = arg0;
        if (arg2 != -31302) {
            field5754 = null;
        }
        class751.field10461 = arg1;
        field5753++;
    }

    @OriginalMember(owner = "client!ms", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5756++;
        this.field5751.method3706(false, this.field5752);
        super.finalize();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILhga;Ljava/lang/Object;)V")
    public static final void method2443(int arg0, class300 arg1, Object arg2) {
        field5755++;
        if (arg1.field4106 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field4106.peekEvent() != null; var3++) {
            class363.method2283(1L, -24244);
        }
        int var4 = 123 % ((24 - arg0) / 50);
        try {
            if (arg2 != null) {
                arg1.field4106.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lmba;JI)V")
    public class402(class643 arg0, long arg1, int arg2) {
        this.field5751 = arg0;
        this.field5752 = arg1;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method2444(int arg0) {
        field5754 = null;
        if (arg0 != -18154) {
            field5754 = null;
        }
    }
}
