import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class170 {

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Ldg;")
    public static class20 field2258 = new class20();

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2259 = new Hashtable();

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lgp;")
    public static class576 field2261 = new class576(2, 2);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method1076(Object arg0, int arg1, boolean arg2) {
        if (arg1 != 18406) {
            field2260 = -116;
        }
        field2256++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class499.method2770(-43, var3) : var3;
        } else if (arg0 instanceof class521) {
            class521 var4 = (class521) arg0;
            return var4.method2436((byte) -126);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
    public static final void method1077(int arg0, int arg1) {
        field2257++;
        if (arg0 >= 30) {
            class614 var2 = class497.method2759(11, 5977, (long) arg1);
            var2.method3279(false);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method1078(int arg0) {
        field2261 = null;
        field2258 = null;
        field2259 = null;
        if (arg0 != -7616) {
            method1076(null, -81, true);
        }
    }
}
