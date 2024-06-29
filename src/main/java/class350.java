import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class350 extends InputStream {

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "Llp;")
    public static class393 field5111 = new class393(128);

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "Lmia;")
    public static class63 field5114 = new class63(23, 2);

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "Lqe;")
    public static class469 field5115 = new class469(91, 7);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Lcr;")
    public static class575 field5112;

    @OriginalMember(owner = "client!tu", name = "read", descriptor = "()I", line = 3)
    public final int read() {
        field5110++;
        class277.method1759(30000L, -95);
        return -1;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 14)
    public static void method2208(int arg0) {
        field5112 = null;
        if (arg0 != 13173) {
            method2209(102, -69);
        }
        field5114 = null;
        field5111 = null;
        field5115 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V", line = 31)
    public static final void method2209(int arg0, int arg1) {
        if (arg0 != 30000) {
            method2210(-108);
        }
        class372.field5334.method807(arg1, -1);
        field5113++;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 44)
    public static final void method2210(int arg0) {
        class449 var1 = (class449) class269.field3852.method1195(0);
        int var2 = -76 % ((arg0 + 16) / 51);
        while (var1 != null) {
            if (var1.field6654) {
                var1.method2767(110);
            }
            var1 = (class449) class269.field3852.method1201(2);
        }
        field5109++;
        for (class449 var3 = (class449) class478.field6929.method1195(0); var3 != null; var3 = (class449) class478.field6929.method1201(2)) {
            if (var3.field6654) {
                var3.method2767(125);
            }
        }
    }
}
