import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class127 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lue;")
    public static class496 field1591 = class142.method833(-1);

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "S")
    public static short field1593 = 1;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lwp;")
    public static class453 field1594 = new class453(68, -2);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Luj;")
    public class629 field1592;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
    public int[] field1595;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method677(int arg0) {
        field1591 = null;
        if (arg0 > 66) {
            field1594 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
    public static final boolean method678(int arg0, int arg1, int arg2) {
        field1590++;
        return arg0 == 68 ? (class58.method365(arg2, arg1, false) | class368.method2014(arg1, arg0 ^ 0x45, arg2) | class290.method1630((byte) 87, arg2, arg1)) & class425.method2256(arg2, (byte) 92, arg1) : true;
    }
}
