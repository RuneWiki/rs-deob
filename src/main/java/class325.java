import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class325 {

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Lbn;")
    public static class160 field4780 = new class160(14, 3);

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field4782 = 1;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Z")
    public static boolean field4783 = true;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lbn;")
    public static class160 field4784 = new class160(59, -1);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Lcq;")
    public static class70 field4781;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 3)
    public static void method2125(byte arg0) {
        field4781 = null;
        field4784 = null;
        int var1 = 66 / ((arg0 - 18) / 39);
        field4780 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILin;III)V", line = 22)
    public static final void method2126(int arg0, class188 arg1, int arg2, int arg3, int arg4) {
        field4779++;
        long var5 = (long) (arg0 | arg2 << 14 | arg3 << 28);
        class447 var7 = (class447) class200.field2828.method609(var5, arg4 + 30885);
        if (var7 == null) {
            class447 var8 = new class447();
            class200.field2828.method606(1, var8, var5);
            var8.field6542.method2484(0, arg1);
            return;
        }
        class427 var9 = class157.field2119.method176((byte) -31, arg1.field2623);
        int var10 = var9.field6181;
        if (var9.field6165 == 1) {
            var10 = (arg1.field2624 + 1) * var10;
        }
        for (class188 var11 = (class188) var7.field6542.method2478(1603); var11 != null; var11 = (class188) var7.field6542.method2486((byte) -82)) {
            class427 var12 = class157.field2119.method176((byte) -26, var11.field2623);
            int var13 = var12.field6181;
            if (var12.field6165 == 1) {
                var13 = (var11.field2624 + 1) * var13;
            }
            if (var13 < var10) {
                class432.method2652(arg1, var11, 16139);
                return;
            }
        }
        if (arg4 != -30807) {
            method2125((byte) -26);
        }
        var7.field6542.method2484(0, arg1);
    }
}
