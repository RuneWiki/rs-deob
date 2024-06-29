import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class197 {

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field2628 = 0;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2629 = "skill: ";

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 8)
    public static void method1173(byte arg0) {
        if (arg0 != -10) {
            method1175(-100, (String) null);
        }
        field2629 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1174(int arg0) {
        class189 var1 = class211.field2822;
        synchronized (class211.field2822) {
            class211.field2822.method1141(256);
        }
        field2627++;
        class189 var2 = class143.field1939;
        synchronized (class143.field1939) {
            class143.field1939.method1141(256);
            if (arg0 > -22) {
                field2628 = -28;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;)V", line = 49)
    public static final void method1175(int arg0, String arg1) {
        field2631++;
        class171.method1057(arg0, 0, "", arg1, "", -63);
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 57)
    public static final void method1176(int arg0) {
        field2630++;
        if (arg0 != 0) {
            field2629 = null;
        }
        class11.field167.method1141(256);
    }
}
