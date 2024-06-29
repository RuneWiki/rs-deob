import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class485 extends class501 {

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field6906 = -1;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field6909 = new Hashtable();

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Llu;")
    public static class610 field6910 = new class610(62, -1);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[[B")
    public static byte[][] field6911;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2911(byte arg0) {
        class103.field1484 = 0;
        field6908++;
        if (arg0 != -31) {
            field6906 = -60;
        }
        class174.field2677.method122((byte) 14);
        class446.field6245 = false;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V", line = 17)
    public static void method2912(byte arg0) {
        field6911 = null;
        field6910 = null;
        if (arg0 <= -89) {
            field6909 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V", line = 38)
    public static final void method2913(byte arg0) {
        field6907++;
        if (class99.field1445.method438()) {
            class99.field1445.method477(class79.field1069);
            class272.method1712((byte) 68);
            class99.field1445.method515(class79.field1069);
            class99.field1445.method444(class79.field1069);
        } else {
            class430.method2521(class526.field7533, -2);
        }
        class504.method2996((byte) 106);
        if (arg0 != 5) {
            method2911((byte) -22);
        }
    }
}
