import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class531 extends InputStream {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Lki;")
    public static class498 field7821 = new class498(35, 7);

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "Llt;")
    public static class475 field7823 = new class475("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "[I")
    public static int[] field7825 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3133(int arg0) {
        field7824++;
        class509.field7435.method1540(0);
        if (arg0 == -2725) {
            class478.field7022.method1540(arg0 + 2725);
            class352.field5399.method1540(0);
            class111.field1591.method1540(0);
            class500.field7360.method1540(0);
        }
    }

    @OriginalMember(owner = "client!mp", name = "read", descriptor = "()I", line = 18)
    public final int read() {
        class246.method1659((byte) 117, 30000L);
        field7822++;
        return -1;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V", line = 39)
    public static void method3134(byte arg0) {
        field7821 = null;
        field7825 = null;
        if (arg0 != -114) {
            method3135(null, -73);
        }
        field7823 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lse;I)I", line = 51)
    public static final int method3135(class167 arg0, int arg1) {
        field7820++;
        class342 var2 = arg0.field2472;
        if (var2.field4938 != null) {
            var2 = var2.method2094(12, class49.field796);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4868;
        class82 var4 = arg0.method845(0);
        if (arg0.field1963) {
            var3 = var2.field4907;
        } else if (arg0.field1931 == var4.field1267 || arg0.field1931 == var4.field1268 || arg0.field1931 == var4.field1252 || arg0.field1931 == var4.field1235) {
            var3 = var2.field4888;
        } else if (arg0.field1931 == var4.field1260 || arg0.field1931 == var4.field1245 || arg0.field1931 == var4.field1232 || arg0.field1931 == var4.field1242) {
            var3 = var2.field4891;
        }
        return arg1 <= 44 ? -38 : var3;
    }
}
