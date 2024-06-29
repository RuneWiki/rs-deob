import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class215 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3474 = "slide:";

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lok;")
    public static class160 field3475 = null;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lkb;")
    public static class39 field3477;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 10)
    public static void method1569(byte arg0) {
        if (arg0 != -55) {
            method1569((byte) 69);
        }
        field3475 = null;
        field3477 = null;
        field3474 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V", line = 25)
    public static final void method1570(int arg0, byte arg1) {
        field3478++;
        class126.field1887--;
        if (class126.field1887 == arg0) {
            return;
        }
        class213.method1559(class284.field4478, arg0 + 1, class284.field4478, arg0, class126.field1887 - arg0);
        class213.method1559(class147.field2199, arg0 + 1, class147.field2199, arg0, class126.field1887 - arg0);
        if (arg1 != -37) {
            field3477 = (class39) null;
        }
        class213.method1554(class56.field746, arg0 + 1, class56.field746, arg0, class126.field1887 - arg0);
        class213.method1558(class50.field686, arg0 + 1, class50.field686, arg0, class126.field1887 - arg0);
        class213.method1557(class214.field3464, arg0 + 1, class214.field3464, arg0, class126.field1887 - arg0);
        class213.method1554(class19.field270, arg0 + 1, class19.field270, arg0, class126.field1887 - arg0);
        class213.method1554(class300.field4675, arg0 + 1, class300.field4675, arg0, class126.field1887 - arg0);
    }
}
