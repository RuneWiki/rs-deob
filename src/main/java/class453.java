import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public abstract class class453 extends class766 {

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field6201 = 0;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "Lin;")
    public static class380 field6203 = new class380(105, 3);

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "Z")
    public static boolean field6204 = false;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
    public abstract int method1869(byte arg0);

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)I")
    public abstract int method1873(int arg0);

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
    public static void method2661(int arg0) {
        field6203 = null;
        if (arg0 != 5) {
            field6201 = -14;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)J")
    public abstract long method1871(byte arg0);

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(IBI)Z")
    public static final boolean method2662(int arg0, byte arg1, int arg2) {
        field6202++;
        if (arg1 != -45) {
            method2662(-1, (byte) -63, 88);
        }
        return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)I")
    public abstract int method1868(byte arg0);

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(B)I")
    public abstract int method1872(byte arg0);
}
