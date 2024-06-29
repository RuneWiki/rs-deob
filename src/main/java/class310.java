import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class310 {

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "S")
    public static short field4560 = 256;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Lua;")
    public static class581 field4559 = new class581();

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "[F")
    public static float[] field4564 = new float[4];

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "[I")
    public static int[] field4566 = new int[1000];

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "Lig;")
    public static class206 field4563 = new class206(33, 0);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public int field4555;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "Lkea;")
    public static class203 field4565;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIII)V")
    public static final void method2053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 256) {
            method2054(89);
        }
        field4561++;
        if (arg1 == arg3) {
            class365.method2346(110, arg3, arg5, arg2, arg0);
        } else if ((arg5 - arg3) >= class113.field1385 && class4.field43 >= arg3 + arg5 && arg2 - arg1 >= class418.field6298 && (arg1 + arg2) <= class461.field6877) {
            class411.method2602(arg0, (byte) 117, arg1, arg2, arg3, arg5);
        } else {
            class4.method26(arg5, arg3, arg2, -1, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public static void method2054(int arg0) {
        field4564 = null;
        field4559 = null;
        field4565 = null;
        field4566 = null;
        int var1 = -68 % ((65 - arg0) / 40);
        field4563 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILrt;I)V")
    private final void method2055(int arg0, class194 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4556 = arg1.method1220(115);
            this.field4555 = arg1.method1177(255);
            this.field4558 = arg1.method1177(255);
        }
        field4562++;
        int var4 = -101 % ((arg2 + 83) / 32);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lrt;B)V")
    public final void method2056(class194 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                int var4 = -80 / ((-arg1 - 77) / 46);
                field4554++;
                return;
            }
            this.method2055(var3, arg0, 13);
        }
    }
}
