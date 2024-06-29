import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class73 {

    @OriginalMember(owner = "client!to", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field51;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "[Lo;")
    public static class29[] field52 = new class29[5];

    @OriginalMember(owner = "client!to", name = "G", descriptor = "[I")
    public static int[] field56;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method19(int arg0) {
        field54++;
        int var2 = 111 / ((arg0 + 54) / 41);
        return this.field51;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)Z")
    public final boolean method20(int arg0) {
        if (arg0 == 896) {
            field53++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
    public static void method21(byte arg0) {
        field52 = null;
        if (arg0 > 40) {
            field56 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lsn;Ljava/lang/Object;I)V")
    public class8(class630 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field51 = arg1;
    }

    static {
        for (int var0 = 0; var0 < field52.length; var0++) {
            field52[var0] = new class29();
        }
        field56 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    }
}
