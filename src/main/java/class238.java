import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class238 extends class111 {

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Lqe;")
    public static class168 field4079 = class66.method448("mapdots", -128);

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lqe;")
    private static class168 field4076 = class66.method448("Attack", -109);

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "Lqe;")
    public static class168 field4078 = field4076;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "Lqe;")
    public static class168 field4082 = class66.method448("leuchten1:", 33);

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "[I")
    public static int[] field4075;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "[I")
    public static int[] field4077;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
    public static void method1549(byte arg0) {
        field4078 = null;
        field4076 = null;
        if (arg0 == -117) {
            field4082 = null;
            field4079 = null;
            field4077 = null;
            field4075 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Loa;")
    public static final class95 method1550(int arg0, int arg1) {
        field4074++;
        class95 var2 = (class95) class110.field1763.method1499(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class110.field1765.method1712(arg1, arg0, -1);
        class95 var4 = new class95();
        if (var3 != null) {
            var4.method627((byte) 120, arg1, new class112(var3));
        }
        class110.field1763.method1502((byte) -18, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)V")
    public static final void method1551(int arg0, int arg1) {
        class182.field3241 = 1000 / arg0;
        field4080++;
        if (arg1 >= -107) {
            method1552(111);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method1552(int arg0) {
        class142.field2503.method1497((byte) 113);
        field4081++;
        if (arg0 == 1000) {
            class103.field1659.method1497((byte) 93);
        }
    }
}
