import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class433 {

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Ldh;")
    public static class321 field5895 = new class321("", 17);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Lr;")
    public class521 field5896;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lk;")
    public class88 field5897;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method2524(byte arg0) {
        field5895 = null;
        if (arg0 < 88) {
            method2528(-88, 100);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)Ljq;")
    public static final class447 method2525(int arg0, int arg1, byte arg2) {
        field5893++;
        if (arg2 >= -99) {
            method2528(7, -111);
        }
        class447 var3 = class609.method3486(arg1, 983030160);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field6194 == null || arg0 >= var3.field6194.length) {
            return null;
        } else {
            return var3.field6194[arg0];
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method2526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field5892++;
        if (class501.field6947 == null) {
            return;
        }
        class23 var14 = null;
        if (arg3 >= 0) {
            int var15 = arg3 - 1;
            class480 var16 = (class480) class131.field1619.method3476((long) var15, (byte) 28);
            if (var16 != null) {
                var14 = var16.field6729;
            }
        } else {
            int var17 = -arg3 - 1;
            if (class182.field2335 == var17) {
                var14 = class147.field1899;
            } else {
                var14 = class364.field5092[var17];
            }
        }
        if (var14 == null || arg0 != -17711) {
            return;
        }
        class137 var18 = class626.field9084.method1093(0, arg8);
        int var19;
        int var20;
        if (arg11 == 1 || arg11 == 3) {
            var20 = var18.field1717;
            var19 = var18.field1670;
        } else {
            var19 = var18.field1717;
            var20 = var18.field1670;
        }
        int var21 = arg9 + (var19 >> 1);
        int var22 = (var19 + 1 >> 1) + arg9;
        int var23 = (var20 >> 1) + arg13;
        int var24 = (var20 + 1 >> 1) + arg13;
        class544 var25 = class501.field6947[arg6];
        int var26 = var25.method1031(var21, var23) + var25.method1031(var22, var23) + var25.method1031(var21, var24) + var25.method1031(var22, var24) >> 2;
        class196 var27 = new class196();
        var27.field2546 = arg8;
        var27.field2552 = arg9;
        var27.field2544 = class7.field61 + arg4;
        var27.field2558 = arg11;
        var27.field2556 = arg13;
        var27.field2550 = class7.field61 + arg1;
        if (arg10 > arg2) {
            int var28 = arg10;
            arg10 = arg2;
            arg2 = var28;
        }
        var27.field2560 = var14.field6358;
        var27.field2554 = arg12;
        if (arg5 < arg7) {
            int var29 = arg7;
            arg7 = arg5;
            arg5 = var29;
        }
        var27.field2542 = arg2 + arg9;
        var27.field2539 = arg9 + arg10;
        var27.field2551 = var26;
        var27.field2553 = (var27.field2556 << 9) + (var20 << 8);
        var27.field2543 = arg5 + arg13;
        var27.field2541 = (var27.field2552 << 9) + (var19 << 8);
        var27.field2547 = arg7 + arg13;
        class558.field7812.method3181(var27, true);
        var14.field423 = var27;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIIII)V")
    public static final void method2527(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5891++;
        if (!arg0) {
            return;
        }
        for (int var5 = 0; var5 < class161.field2051; var5++) {
            Rectangle var6 = class331.field4576[var5];
            if ((var6.x + var6.width) > arg3 && var6.x < arg2 + arg3 && var6.y + var6.height > arg4 && var6.y < arg4 + arg1) {
                class99.field1326[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)S")
    public static final short method2528(int arg0, int arg1) {
        field5894++;
        if (arg1 != 15048) {
            return -12;
        }
        int var2 = (arg0 & 0xFED1) >> 10;
        int var3 = (arg0 & 0x380) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }
}
