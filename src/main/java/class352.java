import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class352 {

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
    public static int field4559 = 0;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "[I")
    public static int[] field4562 = new int[1024];

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public int field4550;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public int field4553;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public int field4555;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public int field4563;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "[Lln;")
    public static class352[] field4547;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lpfa;IIIIIZ)V", line = 16)
    public static final void method2023(class275 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class15.field150 = arg6;
        class334.field4134 = arg0;
        if (arg1 <= 120) {
            field4547 = null;
        }
        class76.field1000 = 1;
        class618.field8381 = arg4;
        class687.field9410 = arg3;
        class60.field757 = arg2;
        field4542++;
        class662.field8973 = class367.field4751.method1987(-20) / arg5;
        if (class662.field8973 < 1) {
            class662.field8973 = 1;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 41)
    public static void method2024(int arg0) {
        if (arg0 >= 116) {
            field4547 = null;
            field4562 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIB)V", line = 53)
    public static final void method2025(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class125.field1524 <= arg3 && arg3 <= class377.field4848) {
            int var5 = class654.method3659(-7690, arg2, class337.field4186, class292.field3700);
            int var6 = class654.method3659(-7690, arg0, class337.field4186, class292.field3700);
            class380.method2187(arg3, arg1, 468, var6, var5);
        }
        field4560++;
        if (arg4 != 73) {
            field4562 = null;
        }
    }
}
