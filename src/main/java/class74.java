import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class74 extends RuntimeException {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Ljava/lang/String;")
    public String field788;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field791;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field787 = -1;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[B")
    public static byte[] field792 = new byte[520];

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "F")
    public static float field793;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lqf;II)I", line = 10)
    public static final int method489(class593 arg0, int arg1, int arg2) {
        field789++;
        if (arg1 != -13403) {
            field793 = -0.04878569F;
        }
        if (!client.method1682(arg0).method1779(arg2, (byte) 15) && arg0.field8607 == null) {
            return -1;
        } else if (arg0.field8525 == null || arg2 >= arg0.field8525.length) {
            return -1;
        } else {
            return arg0.field8525[arg2];
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 25)
    public static void method490(byte arg0) {
        if (arg0 == 38) {
            field792 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 38)
    public class74(Throwable arg0, String arg1) {
        this.field788 = arg1;
        this.field791 = arg0;
    }
}
