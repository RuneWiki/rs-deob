import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class410 extends class690 {

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public int field5275;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field5268;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public int field5273;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field5266;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field5263;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field5265 = 0;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Ldr;")
    public static class675 field5272 = new class675(58, 0);

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "Ldr;")
    public static class675 field5276 = new class675(87, -2);

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "[I")
    public static int[] field5274;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Ljd;", line = 8)
    public class216 method20(byte arg0) {
        int var2 = -106 % ((-arg0 - 27) / 42);
        field5271++;
        return class146.field1748;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)Z", line = 20)
    public static final boolean method2302(int arg0, int arg1, byte arg2) {
        field5267++;
        if (arg2 == -3) {
            return (arg1 & 0x580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ltl;Lpd;IIIIIIIIIIIII)V", line = 34)
    public class410(class580 arg0, class241 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5275 = arg14;
        this.field5268 = arg11;
        this.field5273 = arg13;
        this.field5264 = arg12;
        this.field5266 = arg10;
        this.field5263 = arg9;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;BI)I", line = 52)
    public static final int method2303(String arg0, byte arg1, int arg2) {
        field5270++;
        return arg1 == -103 ? class253.method1530(8042, true, arg2, arg0) : -61;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V", line = 63)
    public static final void method2304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 87) {
            return;
        }
        if ((arg1 - arg3) >= class292.field3700 && class337.field4186 >= (arg1 + arg3) && class125.field1524 <= (arg6 - arg3) && class377.field4848 >= (arg3 + arg6)) {
            class639.method3587(arg3, 21979, arg5, arg6, arg1, arg0, arg4);
        } else {
            class480.method2625(arg6, arg4, arg5, arg1, arg0, arg3, true);
        }
        field5269++;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 80)
    public static void method2305(byte arg0) {
        field5272 = null;
        if (arg0 != -90) {
            method2304(65, -83, 10, -42, 85, 72, 112);
        }
        field5276 = null;
        field5274 = null;
    }
}
