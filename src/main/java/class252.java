import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class252 {

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method1657(int arg0, int arg1, int arg2) {
        if (arg1 < 31) {
            field3537 = -79;
        }
        field3538++;
        return class102.method886(false, arg2, arg0) & class541.method3055(arg0, arg2, 26);
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(III)V", line = 19)
    public static final void method1658(int arg0, int arg1, int arg2) {
        field3539++;
        if (arg1 < 5) {
            method1659(111, 76);
        }
        class281 var3 = class54.method395((byte) -53, (long) arg2 << 32 | (long) arg0, 19);
        var3.method1818((byte) 116);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)Liea;", line = 34)
    public static final class506 method1659(int arg0, int arg1) {
        field3536++;
        class506 var2 = (class506) class118.field2169.method266((byte) -106, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class790.field10828.method3732(arg1, arg0 + 8906, arg0);
        class506 var4 = new class506();
        if (var3 != null) {
            var4.method2886(new class93(var3), -1);
        }
        var4.method2888(-4);
        class118.field2169.method270(var4, (long) arg1, arg0 ^ 0xFFFFFF84);
        return var4;
    }
}
