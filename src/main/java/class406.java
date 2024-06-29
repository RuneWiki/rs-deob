import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class class406 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Lkg;")
    public static class179 field5812 = new class179(37, 2);

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "[I")
    public static int[] field5813 = new int[8];

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1906(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method2401(int arg0) {
        field5812 = null;
        field5813 = null;
        if (arg0 != 8) {
            method2401(-44);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1904(byte arg0);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
    public static final byte[] method2402(boolean arg0, boolean arg1, Object arg2) {
        field5811++;
        if (arg2 == null) {
            return null;
        } else if (arg0) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class196.method1210(var3, 0) : var3;
        } else if (arg2 instanceof class406) {
            class406 var4 = (class406) arg2;
            return var4.method1904((byte) 21);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([BZ)V")
    public abstract void method1905(byte[] arg0, boolean arg1);
}
