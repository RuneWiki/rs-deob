import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class413 {

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "Z")
    public static boolean field6123 = false;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "Lpb;")
    public static class2 field6124 = new class2(11, 8);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2520(boolean arg0) {
        if (class128.field1846 != null) {
            class128.field1846.method143((byte) 94);
        }
        field6122++;
        if (arg0) {
            method2522((byte) -120);
        }
        if (class378.field5680 != null) {
            class378.field5680.method143((byte) -114);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Ljava/lang/String;IB)I", line = 28)
    public static final int method2521(String arg0, int arg1, byte arg2) {
        if (arg2 != 31) {
            field6123 = false;
        }
        field6125++;
        return class40.method233(-100, arg0, arg1, true);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V", line = 45)
    public static void method2522(byte arg0) {
        field6124 = null;
        if (arg0 <= 114) {
            method2520(false);
        }
    }
}
