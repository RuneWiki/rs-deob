import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class289 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field4444 = -1;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "S")
    public static short field4446 = 205;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
    public static int[] field4443 = new int[2048];

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lec;")
    public static class99 field4442;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field4447;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 3)
    public static void method1885(int arg0) {
        field4442 = null;
        field4443 = null;
        if (arg0 < -58) {
            field4447 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V", line = 16)
    public static final void method1886(byte arg0, int arg1) {
        field4445++;
        if (arg0 != 49) {
            return;
        }
        class182.field3080 = arg1;
        class14 var2 = class599.field8488;
        synchronized (class599.field8488) {
            class599.field8488.method76(arg0 ^ 0xFFFFFFB1);
        }
    }
}
