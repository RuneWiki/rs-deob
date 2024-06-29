import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class38 extends class618 {

    @OriginalMember(owner = "client!oja", name = "i", descriptor = "Lrn;")
    public static class633 field420 = new class633(39, 18);

    @OriginalMember(owner = "client!oja", name = "l", descriptor = "[I")
    public static int[] field423 = new int[6];

    @OriginalMember(owner = "client!oja", name = "o", descriptor = "Lrn;")
    public static class633 field426 = new class633(84, 5);

    @OriginalMember(owner = "client!oja", name = "g", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!oja", name = "h", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!oja", name = "j", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!oja", name = "k", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!oja", name = "m", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!oja", name = "n", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!oja", name = "q", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!oja", name = "r", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!oja", name = "u", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!oja", name = "v", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!oja", name = "t", descriptor = "Ljr;")
    public static class140 field431;

    @OriginalMember(owner = "client!oja", name = "s", descriptor = "Lam;")
    public static class60 field430;

    @OriginalMember(owner = "client!oja", name = "p", descriptor = "Ljava/lang/String;")
    public String field427;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)V", line = 4)
    public static void method229(byte arg0) {
        field431 = null;
        field423 = null;
        field426 = null;
        field420 = null;
        if (arg0 != -67) {
            method229((byte) 39);
        }
        field430 = null;
    }

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "(B)V", line = 27)
    public static final void method230(byte arg0) {
        field418++;
        if (!class47.field549) {
            return;
        }
        class391 var1 = class752.method4075(class170.field2260, (byte) -91, class777.field10600);
        if (var1 != null && var1.field5061 != null) {
            class244 var2 = new class244();
            var2.field3350 = var1;
            var2.field3349 = var1.field5061;
            class760.method4148(var2);
        }
        class20.field185 = -1;
        class47.field549 = false;
        class358.field4377 = -1;
        if (arg0 >= 28 && var1 != null) {
            class776.method4255(var1, -1007);
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "()V", line = 62)
    public static final void method231() {
        class108.field1468 = class108.field1466;
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIBIIII)V", line = 69)
    public static final void method232(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 56) {
            field423 = null;
        }
        field422++;
        if (class485.field6252.field6946.method1340(false) != 0 && arg6 != 0 && class303.field3823 < 50 && arg0 != -1) {
            class718.field9426[class303.field3823++] = new class327((byte) 1, arg0, arg6, arg4, arg3, arg5, arg1, null);
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(IBIII)V", line = 87)
    public static final void method233(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 78) {
            field420 = null;
        }
        field419++;
        class614 var5 = class497.method2759(10, 5977, (long) arg0);
        var5.method3277(639);
        var5.field7742 = arg3;
        var5.field7746 = arg4;
        var5.field7741 = arg2;
    }
}
