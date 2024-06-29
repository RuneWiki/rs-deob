import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class759 {

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Lpq;")
    private class194 field10430;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "J")
    public long field10433;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "[I")
    public static int[] field10429 = new int[500];

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field10432 = -1;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field10435;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method4197(int arg0) {
        if (arg0 != 500) {
            method4197(117);
        }
        field10429 = null;
    }

    @OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field10430.method1203(23920, this.field10433);
        field10434++;
        super.finalize();
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lpq;J[Lhh;)V")
    public class759(class194 arg0, long arg1, class190[] arg2) {
        this.field10430 = arg0;
        this.field10433 = arg1;
    }
}
