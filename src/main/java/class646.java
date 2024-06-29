import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class646 extends class544 {

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Ljava/lang/String;")
    public String field9396;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field9399;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "Ljava/lang/Object;")
    public static Object field9398;

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
    public class646() {
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class646(String arg0) {
        this.field9396 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method3727(int arg0) {
        if (arg0 == -18510) {
            field9399 = null;
            field9398 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIII)V")
    public static final void method3728(int arg0, int arg1, int arg2, int arg3) {
        field9397++;
        if (arg2 == 0) {
            class110.field1360++;
            class418.method2378(17984, class515.field7269);
        }
        if (arg2 == 1) {
            class418.method2378(17984, class252.field3253);
            class297.field3819++;
        }
        class136.field1663.method2115(class632.field9113 + arg1, 3324);
        class136.field1663.method2115(class119.field1504 + arg3, 3324);
        class136.field1663.method2142(false, class443.field6109.method185(53, 82) ? 1 : 0);
        class469.field6549 = arg1;
        class251.field3235 = false;
        if (arg0 <= 93) {
            method3727(102);
        }
        class136.field1666 = arg3;
        class351.method1956(-9046);
    }
}
