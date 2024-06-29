import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class215 extends RuntimeException {

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "Ljava/lang/String;")
    public String field2960;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2959;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lec;")
    public static class40 field2962 = new class40("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "[I")
    public static int[] field2964 = new int[500];

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field2963 = -1;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "Lmb;")
    public static class281 field2967 = new class281(0, -1);

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lgj;")
    public static class405 field2965;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "[Lab;")
    public static class256[] field2968;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static void method1204(int arg0) {
        field2967 = null;
        field2968 = null;
        field2964 = null;
        field2962 = null;
        if (arg0 >= -48) {
            field2961 = 18;
        }
        field2965 = null;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class215(Throwable arg0, String arg1) {
        this.field2960 = arg1;
        this.field2959 = arg0;
    }
}
