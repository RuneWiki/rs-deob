import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class335 {

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    private int field4723;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "[I")
    public static int[] field4719 = new int[6];

    @OriginalMember(owner = "client!st", name = "c", descriptor = "Lst;")
    public static class335 field4720 = new class335(31, 4);

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public static void method2134(int arg0) {
        field4719 = null;
        field4720 = null;
        if (arg0 < 103) {
            field4720 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)I")
    public final int method2135(int arg0) {
        if (arg0 != 4) {
            this.toString();
        }
        field4722++;
        return this.field4723;
    }

    @OriginalMember(owner = "client!st", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4721++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(II)V")
    public class335(int arg0, int arg1) {
        this.field4724 = arg1;
        this.field4723 = arg0;
    }
}
