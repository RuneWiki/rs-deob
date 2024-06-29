import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class217 {

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[I")
    public static int[] field4062 = new int[500];

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[[S")
    public static short[][] field4064 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Li;")
    public static class88 field4071 = class208.method1425(105, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Li;")
    private static class88 field4072 = class208.method1425(105, "Unable to connect)3");

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Li;")
    public static class88 field4058 = field4072;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Li;")
    public static class88 field4059 = field4072;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[I")
    public static int[] field4068 = new int[25];

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lsi;")
    public class205 field4067;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "[I")
    public int[] field4070;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method1471(int arg0) {
        field4071 = null;
        field4064 = null;
        if (arg0 < 51) {
            field4071 = null;
        }
        field4059 = null;
        field4068 = null;
        field4062 = null;
        field4072 = null;
        field4058 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)I")
    public static final int method1472(int arg0, int arg1, int arg2) {
        if (arg2 >= -12) {
            method1471(-118);
        }
        field4061++;
        int var3 = class45.method292(arg1 + 91923, 4, arg0 + 45365, -1) + (class45.method292(arg1 + 37821, 2, arg0 + 10294, -1) - 128 >> 1) + (class45.method292(arg1, 1, arg0, -1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
    public static final void method1473(int arg0, int arg1) {
        field4069++;
        if (class211.method1447(0, arg0)) {
            if (arg1 >= -117) {
                field4059 = null;
            }
            class103.method716(-1, (byte) 126, class78.field1418[arg0]);
        }
    }
}
