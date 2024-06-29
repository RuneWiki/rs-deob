import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class443 extends class451 {

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    private int field6348;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    private int field6340;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    private int field6351;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    private int field6346;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    private int field6355;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    private int field6349;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    private int field6354;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    private int field6339;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field6343 = -1;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field6347 = 0;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Liq;")
    public static class362 field6352 = new class362(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "[[S")
    public static short[][] field6356 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 4)
    public class443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field6348 = arg5;
        this.field6340 = arg2;
        this.field6351 = arg7;
        this.field6346 = arg4;
        this.field6355 = arg1;
        this.field6349 = arg3;
        this.field6354 = arg0;
        this.field6339 = arg6;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V", line = 21)
    public final void method260(int arg0, int arg1, int arg2) {
        int var4 = 120 / ((arg0 - -78) / 40);
        ++field6353;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIILjh;)V", line = 35)
    public static final void method2760(byte arg0, int arg1, int arg2, int arg3, class88 arg4) {
        ++field6342;
        if (arg0 >= -31) {
            field6352 = null;
        }
        for (class435 var5 = (class435) class273.field3872.method506((byte) -128); var5 != null; var5 = (class435) class273.field3872.method514(true)) {
            if (var5.field6257 == arg2 && ~(arg3 * 128) == ~var5.field6246 && arg1 * 128 == var5.field6255 && var5.field6267.field1026 == arg4.field1026) {
                if (var5.field6263 != null) {
                    class399.field5694.method1137(var5.field6263);
                    var5.field6263 = null;
                }
                if (var5.field6254 != null) {
                    class399.field5694.method1137(var5.field6254);
                    var5.field6254 = null;
                }
                var5.method2594((byte) -22);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V", line = 77)
    public final void method261(int arg0, int arg1, int arg2) {
        ++field6345;
        if (arg1 > -56) {
            method2762((byte) 12);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 89)
    public static final void method2761(int arg0) {
        class305.field4288.method591(class291.field4077, class222.field3110, class160.field2119);
        ++field6344;
        if (arg0 != 3650) {
            field6343 = 33;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I", line = 101)
    public static final int method2762(byte arg0) {
        ++field6341;
        if (class144.field1780) {
            return 0;
        } else {
            int var1 = 75 % ((-7 - arg0) / 59);
            if (!class12.method93(1)) {
                return 1;
            } else {
                return !class286.field4013 ? 1 : 2;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 122)
    public static void method2763(int arg0) {
        if (arg0 != 32058) {
            method2760((byte) 103, 55, -23, -127, (class88) null);
        }
        field6356 = null;
        field6352 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)V", line = 134)
    public final void method259(int arg0, byte arg1, int arg2) {
        ++field6350;
        int var4 = this.field6354 * arg0 >> 12;
        int var5 = this.field6355 * arg2 >> 12;
        int var6 = this.field6340 * arg0 >> 12;
        int var7 = this.field6349 * arg2 >> 12;
        int var8 = this.field6346 * arg0 >> 12;
        if (arg1 == 12) {
            int var9 = this.field6348 * arg2 >> 12;
            int var10 = this.field6339 * arg0 >> 12;
            int var11 = this.field6351 * arg2 >> 12;
            class18.method127(var5, var10, -6960, var11, var8, var6, var9, var4, super.field6457, var7);
        }
    }
}
