import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class651 extends InputStream {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
    public static int[] field9184 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method3680(byte arg0) {
        field9184 = null;
        if (arg0 != -30) {
            field9184 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "read", descriptor = "()I")
    public final int read() {
        field9183++;
        class246.method1639(30000L, (byte) -118);
        return -1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V")
    public static final void method3681(int arg0, byte arg1) {
        field9182++;
        if (arg1 >= 36) {
            class354 var2 = class501.method3012(arg0, 9, 2145997216);
            var2.method2216(0);
        }
    }
}
