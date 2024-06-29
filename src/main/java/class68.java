import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class68 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "[I")
    public static int[] field899 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V", line = 6)
    public static final void method405(int arg0, int arg1) {
        field896++;
        class19 var2 = class364.method2236(1248116640, arg1, arg0);
        var2.method104(10);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZ)I", line = 19)
    public static final int method406(int arg0, int arg1, int arg2, boolean arg3) {
        field897++;
        class149 var4 = class255.method1597(arg2, arg3, 27628);
        if (var4 == null) {
            return 0;
        } else if (arg1 <= arg0 && var4.field1877.length > arg0) {
            return var4.field1877[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 48)
    public static void method407(byte arg0) {
        if (arg0 == -2) {
            field899 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBI)Z", line = 59)
    public static final boolean method408(int arg0, byte arg1, int arg2) {
        field894++;
        return arg1 == 41 ? class524.method2990(arg2, arg0, (byte) 107) & class227.method1390(arg2, (byte) -69, arg0) : true;
    }
}
