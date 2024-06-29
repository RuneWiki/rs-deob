import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class549 implements class480 {

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "Ljava/lang/String;")
    private String field7987;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "Lri;")
    private class97 field7983;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "Z")
    public static boolean field7990 = false;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "Lui;")
    public static class210 field7985 = new class210(2, 4, 4, 0);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(JI)V")
    public static final void method3313(long arg0, int arg1) {
        field7989++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class191.method1525(arg0 - 1L, (byte) -117);
            class191.method1525(1L, (byte) -109);
        } else {
            class191.method1525(arg0, (byte) -119);
        }
        if (arg1 <= 123) {
            field7985 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I")
    public final int method1781(int arg0) {
        field7986++;
        int var2 = 55 / ((29 - arg0) / 57);
        return this.field7983.method947((byte) -100, this.field7987) ? 100 : this.field7983.method935(this.field7987, 127);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)V")
    public static void method3314(boolean arg0) {
        field7985 = null;
        if (!arg0) {
            field7990 = false;
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lri;Ljava/lang/String;)V")
    public class549(class97 arg0, String arg1) {
        this.field7987 = arg1;
        this.field7983 = arg0;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)Lcj;")
    public final class644 method1779(int arg0) {
        int var2 = -73 % ((arg0 + 38) / 40);
        field7984++;
        return class644.field9055;
    }
}
