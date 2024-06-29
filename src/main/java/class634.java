import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class634 extends class476 {

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "Lfd;")
    public static class143 field9219 = new class143();

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "J")
    public static volatile long field9221 = 0L;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field9222 = 0;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public int field9210;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public int field9214;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public int field9215;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public int field9216;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public int field9218;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    public int field9220;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "Lui;")
    public static class587 field9212;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "Ljava/lang/String;")
    public String field9217;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method3663(int arg0, int arg1) {
        field9209++;
        if (arg0 > -49) {
            return true;
        } else {
            return arg1 == 2 || arg1 == 6 || arg1 == 9;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIBIIIIIIIIII)V", line = 15)
    public static final void method3664(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field9213++;
        if (class88.field1594 == null) {
            return;
        }
        class85 var14 = null;
        if (arg6 >= 0) {
            int var15 = arg6 - 1;
            class181 var16 = (class181) class432.field6368.method740(0, (long) var15);
            if (var16 != null) {
                var14 = var16.field2623;
            }
        } else {
            int var17 = -arg6 - 1;
            if (class323.field4670 == var17) {
                var14 = class644.field9367;
            } else {
                var14 = class39.field536[var17];
            }
        }
        if (var14 == null) {
            return;
        }
        class370 var18 = class552.field7819.method2890(0, arg0);
        int var19;
        int var20;
        if (arg2 == 1 || arg2 == 3) {
            var20 = var18.field5277;
            var19 = var18.field5322;
        } else {
            var19 = var18.field5277;
            var20 = var18.field5322;
        }
        int var21 = (var20 >> 1) + arg13;
        int var22 = (var20 + 1 >> 1) + arg13;
        int var23 = (var19 >> 1) + arg9;
        int var24 = (var19 + 1 >> 1) + arg9;
        class542 var25 = class88.field1594[arg10];
        int var26 = var25.method694(var21, var23) - (-var25.method694(var22, var23) + (-var25.method694(var21, var24) - var25.method694(var22, var24))) >> 2;
        class536 var27 = new class536();
        var27.field7485 = var14.field5116;
        var27.field7488 = arg0;
        var27.field7477 = class310.field4553 + arg11;
        var27.field7473 = class310.field4553 + arg1;
        var27.field7472 = arg13;
        var27.field7475 = arg9;
        var27.field7470 = arg2;
        if (arg5 < arg8) {
            int var28 = arg8;
            arg8 = arg5;
            arg5 = var28;
        }
        var27.field7483 = arg7;
        var27.field7469 = arg8 + arg13;
        if (arg4 > arg12) {
            int var29 = arg4;
            arg4 = arg12;
            arg12 = var29;
        }
        var27.field7474 = arg5 + arg13;
        var27.field7478 = var26;
        var27.field7480 = arg9 + arg12;
        var27.field7482 = (var27.field7475 << 7) + (var19 << 6);
        var27.field7476 = (var27.field7472 << 7) + (var20 << 6);
        var27.field7471 = arg4 + arg9;
        class56.field792.method414(var27, (byte) 116);
        if (arg3 != 55) {
            field9222 = -87;
        }
        var14.field1573 = var27;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)Z", line = 131)
    public static final boolean method3665(int arg0, int arg1) {
        field9211++;
        if (arg0 <= 41) {
            method3665(-90, -69);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V", line = 148)
    public static void method3666(int arg0) {
        field9212 = null;
        if (arg0 >= 56) {
            field9219 = null;
        }
    }
}
