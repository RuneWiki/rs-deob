import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class555 extends class644 implements class427 {

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Lig;")
    private class258 field7479;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "[S")
    public static short[] field7486 = new short[256];

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Lmga;")
    public static class739 field7482 = new class739(67, -1);

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "[I")
    public static int[] field7489 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "[Z")
    public static boolean[] field7488 = new boolean[100];

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V", line = 3)
    public static void method3132(int arg0) {
        field7486 = null;
        field7489 = null;
        if (arg0 <= -63) {
            field7488 = null;
            field7482 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z", line = 17)
    public final boolean method2611(int arg0) {
        ++field7487;
        return arg0 != 26937 ? true : super.method3578(false, super.field8946.field5784);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I", line = 30)
    public final int method2631(byte arg0) {
        if (arg0 < 81) {
            return 88;
        } else {
            ++field7483;
            return super.method2631((byte) 94);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Lig;", line = 41)
    public final class258 method2612(int arg0) {
        ++field7480;
        return arg0 != 21064 ? null : this.field7479;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 55)
    public final Buffer method2613(boolean arg0, int arg1) {
        if (arg1 != 3754) {
            return null;
        } else {
            ++field7481;
            return super.method3577(super.field8946.field5784, arg0, arg1 + -3763);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lpa;Lig;Z)V", line = 67)
    public class555(class391 arg0, class258 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field7479 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V", line = 84)
    public final void method2615(int arg0, byte arg1) {
        super.method2615(this.field7479.field3842 * arg0, arg1);
        ++field7485;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 99)
    public final void method2614(int arg0) {
        ++field7484;
        super.method2614(arg0);
    }
}
