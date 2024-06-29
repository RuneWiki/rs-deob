import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class124 extends class190 {

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "[B")
    public byte[] field2044;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Lqe;")
    public static class168 field2042 = class66.method448("hitmarks", -124);

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
    public static int[] field2047 = new int[1000];

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "Lqe;")
    public static class168 field2048 = class66.method448(" <col=ffff00>", 70);

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field2041 = 1;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "[I")
    public static int[] field2049 = new int[100];

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public static final void method842(int arg0) {
        class197.field3412.method1497((byte) 92);
        field2045++;
        if (arg0 != -14710) {
            field2042 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V")
    public class124(byte[] arg0) {
        this.field2044 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    public static void method843(int arg0) {
        field2042 = null;
        int var1 = 120 % ((arg0 + 20) / 58);
        field2049 = null;
        field2048 = null;
        field2047 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BILoe;I)Lqg;")
    public static final class217 method844(byte arg0, int arg1, class256 arg2, int arg3) {
        if (arg0 != -18) {
            field2046 = -114;
        }
        field2043++;
        return class9.method34(arg3, arg2, (byte) -16, arg1) ? class62.method416(24606) : null;
    }
}
