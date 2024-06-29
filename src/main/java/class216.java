import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class216 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[I")
    public static int[] field3401 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3406 = "Please remove ";

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[[Lel;")
    public static class247[][] field3403;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I", line = 7)
    public static final int method1572(byte arg0) {
        field3400++;
        if (arg0 != -14) {
            method1573((byte) -34);
        }
        if (class278.field4290 == null) {
            return -1;
        }
        while (class278.field4290.field4244 > class261.field4102) {
            if (class278.field4290.method1930(arg0 - 25624, class261.field4102)) {
                return class261.field4102++;
            }
            class261.field4102++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 32)
    public static void method1573(byte arg0) {
        field3401 = null;
        int var1 = -43 % ((-arg0 - 17) / 61);
        field3406 = null;
        field3403 = (class247[][]) null;
    }
}
