import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class783 {

    @OriginalMember(owner = "client!fja", name = "d", descriptor = "I")
    private int field10757;

    @OriginalMember(owner = "client!fja", name = "f", descriptor = "I")
    public int field10759;

    @OriginalMember(owner = "client!fja", name = "e", descriptor = "I")
    public static int field10758 = -1;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "I")
    public static int field10754;

    @OriginalMember(owner = "client!fja", name = "h", descriptor = "I")
    public static int field10761;

    @OriginalMember(owner = "client!fja", name = "c", descriptor = "Lnf;")
    public static class604 field10756;

    @OriginalMember(owner = "client!fja", name = "g", descriptor = "Lgj;")
    public static class662 field10760;

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "[[B")
    public static byte[][] field10755;

    @OriginalMember(owner = "client!fja", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10754++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)I")
    public final int method4275(int arg0) {
        field10761++;
        int var2 = 6 / ((arg0 - 41) / 42);
        return this.field10757;
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "(I)V")
    public static void method4276(int arg0) {
        field10756 = null;
        field10755 = null;
        field10760 = null;
        if (arg0 > -8) {
            field10760 = null;
        }
    }

    @OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(II)V")
    public class783(int arg0, int arg1) {
        this.field10757 = arg0;
        this.field10759 = arg1;
    }
}
