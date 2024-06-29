import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class167 {

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "Z")
    public static boolean field2739 = false;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILr;Lis;)V")
    public static final void method1260(int arg0, class98 arg1, class101 arg2) {
        field2740++;
        boolean var3 = class430.field6132.method46(arg2.field1494, arg2.field1489, (byte) 13, arg2.field1635 | arg0, arg2.field1601 ? class103.field1708.field3841 : null, arg1, arg2.field1502, arg2.field1565) == null;
        if (var3) {
            class252.field3643.method3904(new class297(arg2.field1565, arg2.field1489, arg2.field1502, arg2.field1635 | 0xFF000000, arg2.field1494, arg2.field1601), 0);
            class326.method1948(1, arg2);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)I")
    public static final int method1261(int arg0, int arg1) {
        field2741++;
        int var2 = -112 % ((28 - arg0) / 50);
        return arg1 & 0xFF;
    }
}
