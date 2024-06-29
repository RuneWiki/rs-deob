import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class514 extends RuntimeException {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7339;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Ljava/lang/String;")
    public String field7341;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field7338 = -1;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lh;")
    public static class572 field7340 = new class572("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lkda;")
    public static class328 field7343;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method3051(boolean arg0) {
        field7340 = null;
        if (!arg0) {
            field7343 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class514(Throwable arg0, String arg1) {
        this.field7339 = arg0;
        this.field7341 = arg1;
    }
}
