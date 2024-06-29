import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class class441 extends class270 {

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
    public int field6572;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "[Lhd;")
    public static class239[] field6575 = new class239[0];

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "Lvv;")
    public static class313 field6574 = new class313(55, 6);

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "Lnk;")
    public static class326 field6578 = new class326(50, 2);

    @OriginalMember(owner = "client!ns", name = "G", descriptor = "Lnk;")
    public static class326 field6579 = new class326(17, 3);

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1960(int arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method2657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field6576++;
        class283 var10 = null;
        for (class283 var11 = (class283) class240.field4130.method2538(-3); var11 != null; var11 = (class283) class240.field4130.method2535((byte) -109)) {
            if (var11.field4627 == arg6 && var11.field4621 == arg2 && var11.field4628 == arg4 && var11.field4623 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class283();
            var10.field4623 = arg3;
            var10.field4628 = arg4;
            var10.field4621 = arg2;
            var10.field4627 = arg6;
            if (arg2 >= 0 && arg4 >= 0 && arg2 < class217.field3775 && arg4 < class277.field4548) {
                class4.method11(false, var10);
            }
            class240.field4130.method2541(0, var10);
        }
        var10.field4630 = arg7;
        var10.field4625 = arg0;
        var10.field4629 = arg9;
        if (arg8 <= 72) {
            field6579 = null;
        }
        var10.field4626 = arg5;
        var10.field4618 = arg1;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= class182.field2877 && arg7 <= class235.field4076 && arg6 >= class29.field460 && class472.field6996 >= arg0) {
            class367.method2335(arg6, arg5, arg1, arg7, 0, arg3, arg0, arg4);
        } else {
            class16.method83(arg1, arg4, arg3, arg0, arg6, arg2 ^ 0xFFFFFFFB, arg7, arg5);
        }
        if (arg2 != -1) {
            field6575 = null;
        }
        field6573++;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
    public class441(int arg0) {
        this.field6572 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z")
    public abstract boolean method1959(int arg0);

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V")
    public static void method2659(int arg0) {
        field6575 = null;
        int var1 = 13 % ((arg0 + 70) / 34);
        field6579 = null;
        field6578 = null;
        field6574 = null;
    }
}
