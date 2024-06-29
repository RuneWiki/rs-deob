import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class185 extends RuntimeException {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2532;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Ljava/lang/String;")
    public String field2533;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "[I")
    public static int[] field2530 = new int[3];

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class185(Throwable arg0, String arg1) {
        this.field2532 = arg0;
        this.field2533 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1159(int arg0) {
        field2529++;
        int var1 = 0;
        if (arg0 != -101) {
            field2530 = null;
        }
        while (var1 < 100) {
            class147.field2053[var1] = null;
            var1++;
        }
        class757.field10566 = 0;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field2530 = null;
        if (arg0 != 0) {
            field2530 = null;
        }
    }
}
