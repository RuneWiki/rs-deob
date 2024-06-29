import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class610 {

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public int field8447;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lmq;")
    public static class78 field8446 = new class78(92, -1);

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field8448 = 0;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field8449 = -1;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "[I")
    public static int[] field8445;

    @OriginalMember(owner = "client!em", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8444++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(I)V")
    public class610(int arg0) {
        this.field8447 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    public static void method3339(boolean arg0) {
        field8446 = null;
        field8445 = null;
        if (!arg0) {
            method3339(true);
        }
    }
}
