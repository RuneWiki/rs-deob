import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class107 extends class123 {

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "Lpd;")
    public static class3 field1754 = new class3(16);

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "Lcm;")
    public static class205 field1756;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "[I")
    public static int[] field1755;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "[Z")
    public static boolean[] field1759;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lpk;IIB)Z", line = 23)
    public static final boolean method854(class120 arg0, int arg1, int arg2, byte arg3) {
        byte[] var4 = arg0.method967(arg2, arg1, 65280);
        field1757++;
        if (var4 == null) {
            return false;
        } else {
            class176.method1297(127, var4);
            int var5 = -25 % ((arg3 - 34) / 52);
            return true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V", line = 41)
    public static void method855(int arg0) {
        field1754 = null;
        field1756 = null;
        field1755 = null;
        field1759 = null;
        if (arg0 != 0) {
            method855(100);
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)Z")
    public abstract boolean method485(int arg0);

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method486(int arg0);
}
