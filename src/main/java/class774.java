import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class774 extends class49 {

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public int field10658;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public static int field10657;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Loe;")
    public static class15 field10659;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 3)
    public static void method4275(int arg0) {
        field10659 = null;
        int var1 = 22 / ((arg0 - 72) / 34);
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V", line = 13)
    public class774(int arg0) {
        this.field10658 = arg0;
    }

    @OriginalMember(owner = "client!io", name = "g", descriptor = "(I)Z")
    public abstract boolean method855(int arg0);

    @OriginalMember(owner = "client!io", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method857(int arg0);
}
