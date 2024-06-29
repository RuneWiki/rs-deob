import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class186 {

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Lgd;")
    public static class225 field2599 = new class225(0, 0);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lfs;")
    public static class387 field2600;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1302(byte arg0) {
        field2600 = null;
        int var1 = 28 / ((-arg0 - 34) / 54);
        field2599 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
    public static final byte[] method1303(boolean arg0, byte arg1, Object arg2) {
        field2598++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class247.method1624(var3, 1727) : var3;
        } else if (arg2 instanceof class109) {
            class109 var4 = (class109) arg2;
            return var4.method897((byte) 8);
        } else {
            if (arg1 < 62) {
                method1302((byte) -54);
            }
            throw new IllegalArgumentException();
        }
    }
}
