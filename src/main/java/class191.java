import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class191 {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Ljava/lang/String;")
    public String field2590;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Ljava/lang/String;")
    public String field2588;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljava/lang/String;")
    public String field2584;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    public static int[] field2586 = new int[2048];

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2589 = new String[100];

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "[Leh;")
    public static class203[] field2591;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 9)
    public static void method1252(int arg0) {
        field2589 = null;
        field2591 = null;
        field2586 = null;
        if (arg0 != 100) {
            method1252(-1);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 21)
    public static final void method1253(int arg0, int arg1) {
        if (arg0 <= 65) {
            field2589 = null;
        }
        field2585++;
        class66.field1043.method3900(arg1, 0);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 34)
    public class191(String arg0, String arg1, String arg2) {
        this.field2590 = arg2;
        this.field2588 = arg1;
        this.field2584 = arg0;
    }
}
