import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class51 {

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field590 = 0;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[[S")
    public static short[][] field584 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lkh;")
    public static class11 field589;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lra;")
    public static class57 field587;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[Lkh;")
    public static class11[] field593;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[S")
    public static short[] field592;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)Z", line = 10)
    public static final boolean method305(byte[] arg0, int arg1) {
        field588++;
        class211 var2 = new class211(arg0);
        int var3 = var2.method1342((byte) -126);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1342((byte) -128) == arg1;
        if (var4) {
            class213.method1402(var2, 0);
        }
        class379.method2410(arg1 - 4371, var2);
        return true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 32)
    public static void method306(int arg0) {
        field584 = null;
        field587 = null;
        field592 = null;
        field589 = null;
        if (arg0 != -21204) {
            method305((byte[]) null, -48);
        }
        field593 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V", line = 50)
    public static final void method307(int arg0, byte arg1) {
        if (arg1 != 106) {
            field589 = null;
        }
        class428.field6220.method2054(-43, arg0);
        field585++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)B", line = 64)
    public static final byte method308(int arg0, int arg1, int arg2) {
        if (arg0 != 5281) {
            method306(34);
        }
        field586++;
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
