import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class511 extends class426 {

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public int field7475 = -1;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field7473 = -2;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "Lxa;")
    public static class433 field7468;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "Ljava/lang/String;")
    public String field7467;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "Ljava/lang/String;")
    public String field7471;

    static {
        new class474(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V", line = 7)
    public static void method3038(int arg0) {
        field7468 = null;
        if (arg0 != -2) {
            field7468 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBIILqb;II)V", line = 19)
    public static final void method3039(int arg0, byte arg1, int arg2, int arg3, class191 arg4, int arg5, int arg6) {
        class128.method789(arg4.field1768, arg4.field1764, arg0, (byte) 63, arg6, arg2, arg3, arg5, 0, arg4.field1757);
        int var7 = -93 % ((61 - arg1) / 47);
        ++field7470;
    }

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)V", line = 30)
    public static final void method3040(int arg0) {
        ++field7472;
        class108.field1302.method387(class410.field6247, class3.field21, class326.field4704);
        if (arg0 != 0) {
            method3040(-49);
        }
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(B)Lvn;", line = 42)
    public final class263 method3041(byte arg0) {
        if (arg0 >= -26) {
            method3040(-120);
        }
        ++field7474;
        return class453.field6778[super.field6344];
    }
}
