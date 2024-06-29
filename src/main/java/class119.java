import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public abstract class class119 extends class644 {

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "Z")
    public volatile boolean field1745 = true;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "[I")
    public static int[] field1742 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "Lnd;")
    public static class547 field1743;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "Z")
    public boolean field1739;

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "Z")
    public boolean field1744;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public static void method919(int arg0) {
        field1743 = null;
        field1742 = null;
        int var1 = 66 % ((58 - arg0) / 56);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
    public static final void method920(boolean arg0) {
        class205.field2726.method3065(arg0);
        field1740++;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)[B")
    public abstract byte[] method921(byte arg0);

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
    public abstract int method922(int arg0);

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILrl;)V")
    public static final void method923(int arg0, class724 arg1) {
        field1741++;
        if (arg0 > -3) {
            return;
        }
        class357 var2 = (class357) class600.field8352.method1160((long) arg1.field189, 122);
        if (var2 == null) {
            class718.method4016(arg1, null, null, (byte) 85, 0, arg1.field5796, arg1.field260[0], arg1.field264[0]);
        } else {
            var2.method2072(0);
        }
    }
}
