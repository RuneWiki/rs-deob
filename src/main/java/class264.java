import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class264 {

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "[I")
    public static int[] field3579 = new int[25];

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "Lfaa;")
    public static class139 field3581 = new class139(16);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    public int field3580;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILac;)V", line = 6)
    public final void method1610(int arg0, class501 arg1) {
        field3577++;
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    field3581 = null;
                    return;
                }
            }
            this.method1611(arg1, var3, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lac;IB)V", line = 29)
    private final void method1611(class501 arg0, int arg1, byte arg2) {
        field3582++;
        if (arg2 < -122 && arg1 == 1) {
            this.field3580 = arg0.method2845(-1);
            this.field3578 = arg0.method2874((byte) -75);
            this.field3583 = arg0.method2874((byte) -75);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V", line = 51)
    public static final void method1612(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class706.method3954(var3.field5533);
        class706.method3954(var3.field5532);
        if (var3.field5533 != null) {
            var3.field5533 = null;
        }
        if (var3.field5532 != null) {
            var3.field5532 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V", line = 72)
    public static void method1613(byte arg0) {
        field3581 = null;
        field3579 = null;
        int var1 = 117 / ((arg0 + 57) / 54);
    }
}
