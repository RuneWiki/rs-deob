import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class508 extends RuntimeException {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7427;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Ljava/lang/String;")
    public String field7430;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field7429 = -1;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field7425 = -60;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ldl;")
    public static class44 field7428;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "[I")
    public static int[] field7424;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method3002(int arg0) {
        field7424 = null;
        field7428 = null;
        if (arg0 != -4833) {
            field7424 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class508(Throwable arg0, String arg1) {
        this.field7427 = arg0;
        this.field7430 = arg1;
    }
}
