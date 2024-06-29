import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class356 extends class508 {

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field4570 = 0;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "F")
    public static float field4574;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public int field4572;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public int field4573;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "Ldn;")
    public static class201 field4569;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "[I")
    public int[] field4576;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "[I")
    public int[] field4578;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "[I")
    public int[] field4579;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "[Lqd;")
    public class277[] field4577;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "[Lqd;")
    public class277[] field4580;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "[[[B")
    public byte[][][] field4567;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2082(int arg0) {
        field4571++;
        if (!class515.field7573) {
            return;
        }
        class423 var1 = class520.method3091(class172.field2229, (byte) 126, class206.field2687);
        if (var1 != null && var1.field5771 != null) {
            class195 var2 = new class195();
            var2.field2523 = var1.field5771;
            var2.field2516 = var1;
            class490.method2928(var2);
        }
        class501.field7364 = arg0;
        class315.field4065 = -1;
        class515.field7573 = false;
        if (var1 != null) {
            class415.method2440(10, var1);
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 41)
    public static void method2083(int arg0) {
        if (arg0 != 25718) {
            method2082(54);
        }
        field4569 = null;
    }
}
