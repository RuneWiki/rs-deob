import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class419 extends class147 {

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public int field6036;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public int field6031;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    private int field6034;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    private int field6029;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public int field6033;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public int field6042;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    private int field6032;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    private int field6043;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "Z")
    public static boolean field6038 = false;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "Lpn;")
    public static class72 field6037 = new class72(8, 7);

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Lg;")
    public static class470 field6035;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "[[B")
    public static byte[][] field6040;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)Z")
    public final boolean method2490(int arg0, int arg1, byte arg2) {
        field6041++;
        if (arg2 != -67) {
            this.field6032 = 81;
        }
        return arg1 >= this.field6042 && arg1 <= this.field6036 && arg0 >= this.field6033 && this.field6031 >= arg0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)Z")
    public final boolean method2491(byte arg0, int arg1, int arg2) {
        if (arg0 != -28) {
            this.field6036 = 66;
        }
        field6044++;
        return arg2 >= this.field6032 && this.field6029 >= arg2 && this.field6025 <= arg1 && arg1 <= this.field6034;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B[III)V")
    public final void method2492(byte arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = 0;
        arg1[2] = arg3 + this.field6033 - this.field6025;
        field6028++;
        arg1[1] = arg2 + this.field6042 - this.field6032;
        if (arg0 >= -111) {
            this.method2498((int[]) null, -21, false, -113);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z")
    public static final boolean method2493(int arg0, int arg1) {
        field6039++;
        if (arg0 == 19 || arg0 == 12 || arg0 == 20 || arg0 == 58 || arg0 == 17) {
            return true;
        } else {
            if (arg1 != 22383) {
                method2495((byte) 91, -3, -105, 95, -24, 67, -51);
            }
            return arg0 == 3 || arg0 == 1012;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
    public static final void method2494(byte arg0) {
        if (arg0 > -66) {
            field6035 = null;
        }
        field6045++;
        class274.field3912.method1417(class88.field1098, class304.field4495 ? class180.field2275 + 256 : -1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIIIIII)V")
    public static final void method2495(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6027++;
        class256 var7 = class66.method339(arg4, 0, arg5);
        if (var7 == null) {
            return;
        }
        if (var7.field3605 != null) {
            class35 var8 = new class35();
            var8.field435 = var7.field3605;
            var8.field429 = var7;
            class396.method2371(var8);
        }
        int var9 = 69 % ((arg0 - 27) / 46);
        class283.field4126 = arg1;
        class435.field6264 = arg2;
        class208.field2883 = var7.field3585;
        class293.field4359 = true;
        class274.field3905 = arg4;
        class284.field4135 = arg3;
        class206.field2828 = arg6;
        class145.field1749 = arg5;
        class398.method2383(var7, 10);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public static void method2496(int arg0) {
        field6035 = null;
        int var1 = -114 / ((arg0 + 75) / 46);
        field6040 = null;
        field6037 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)Z")
    public final boolean method2497(int arg0, int arg1, int arg2, int arg3) {
        field6030++;
        if (arg2 != 7) {
            this.field6031 = 48;
        }
        return this.field6043 == arg1 && arg3 >= this.field6032 && arg3 <= this.field6029 && this.field6025 <= arg0 && this.field6034 >= arg0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([IIZI)V")
    public final void method2498(int[] arg0, int arg1, boolean arg2, int arg3) {
        arg0[2] = arg3 + this.field6025 - this.field6033;
        arg0[1] = this.field6032 + arg1 - this.field6042;
        if (!arg2) {
            field6026++;
            arg0[0] = this.field6043;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6036 = arg7;
        this.field6031 = arg8;
        this.field6034 = arg4;
        this.field6029 = arg3;
        this.field6033 = arg6;
        this.field6025 = arg2;
        this.field6042 = arg5;
        this.field6032 = arg1;
        this.field6043 = arg0;
    }
}
