import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class251 extends class180 {

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    private int field3521;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    private int field3530;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    private int field3523;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    private int field3524;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field3519 = 1;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Lnk;")
    public static class18 field3526;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([IIIB)V")
    public final void method1559(int[] arg0, int arg1, int arg2, byte arg3) {
        field3525++;
        arg0[1] = this.field3531 + arg2 - this.field3530;
        if (arg3 <= 91) {
            this.field3533 = 77;
        }
        arg0[0] = 0;
        arg0[2] = this.field3528 + arg1 - this.field3524;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILqr;B)V")
    public static final void method1560(int arg0, int arg1, int arg2, class23 arg3, byte arg4) {
        field3517++;
        int var5 = class24.method209(arg3.field1140[0], -4, 0, class308.field4209[arg3.field6766], arg2, arg3.field1144[0], true, class2.field21.method206(arg1), 0, class259.field3614, arg0, 0, arg1, class233.field3285, 0);
        if (var5 >= 1) {
            for (int var6 = 0; var6 < var5 - 1; var6++) {
                arg3.method200(class259.field3614[var6], class233.field3285[var6], arg4, 240);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public static void method1561(int arg0) {
        if (arg0 < 53) {
            field3526 = null;
        }
        field3526 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static final void method1562(boolean arg0) {
        if (arg0) {
            class455.field6293 = class96.field1366;
            class317.field4306 = class8.field166;
        } else {
            class455.field6293 = class5.field110;
            class317.field4306 = class366.field5215;
        }
        class109.field1542 = class455.field6293.length;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1563(int arg0, int arg1, boolean arg2) {
        field3518++;
        if (arg2) {
            return true;
        } else {
            return arg1 >= this.field3530 && this.field3516 >= arg1 && this.field3524 <= arg0 && arg0 <= this.field3523;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Z")
    public final boolean method1564(int arg0, int arg1, int arg2) {
        field3532++;
        if (arg0 == -10824) {
            return arg1 >= this.field3531 && arg1 <= this.field3533 && arg2 >= this.field3528 && arg2 <= this.field3520;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)Z")
    public final boolean method1565(int arg0, int arg1, int arg2, int arg3) {
        field3529++;
        if (arg3 != 0) {
            method1561(60);
        }
        return this.field3521 == arg1 && arg2 >= this.field3530 && arg2 <= this.field3516 && this.field3524 <= arg0 && this.field3523 >= arg0;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3533 = arg7;
        this.field3521 = arg0;
        this.field3530 = arg1;
        this.field3520 = arg8;
        this.field3523 = arg4;
        this.field3531 = arg5;
        this.field3516 = arg3;
        this.field3524 = arg2;
        this.field3528 = arg6;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B[III)V")
    public final void method1566(byte arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = this.field3530 + arg2 - this.field3531;
        field3527++;
        if (arg0 == -34) {
            arg1[0] = this.field3521;
            arg1[2] = this.field3524 + arg3 - this.field3528;
        }
    }
}
