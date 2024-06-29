import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class478 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public int[] field7124 = new int[100];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[Lnu;")
    public class417[] field7125 = new class417[100];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    public int[] field7126 = new int[3];

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[Lfk;")
    public class462[] field7128 = new class462[8];

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field7130 = 0;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Liv;")
    public static class64 field7131 = new class64(42, 3);

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public int field7132;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field7127;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBLln;I)V", line = 3)
    public static final void method2853(int arg0, byte arg1, class256 arg2, int arg3) {
        if (arg1 >= -71) {
            field7131 = null;
        }
        field7129++;
        if (arg2.field7642 == arg3 && arg3 != -1) {
            class165 var4 = class431.field6419.method1137(45, arg3);
            int var5 = var4.field2553;
            if (var5 == 1) {
                arg2.field7604 = 0;
                arg2.field7594 = 0;
                arg2.field7607 = 1;
                arg2.field7664 = arg0;
                arg2.field7675 = 0;
                class441.method2642((byte) 76, arg2.field7594, var4, arg2.field6233, class139.field2224 == arg2, arg2.field6228, arg2.field6232);
            }
            if (var5 == 2) {
                arg2.field7604 = 0;
                return;
            }
        } else if (arg3 == -1 || arg2.field7642 == -1 || class431.field6419.method1137(-119, arg3).field2558 >= class431.field6419.method1137(-108, arg2.field7642).field2558) {
            arg2.field7687 = arg2.field7690;
            arg2.field7607 = 1;
            arg2.field7675 = 0;
            arg2.field7664 = arg0;
            arg2.field7594 = 0;
            arg2.field7642 = arg3;
            arg2.field7604 = 0;
            if (arg2.field7642 != -1) {
                class441.method2642((byte) 70, arg2.field7594, class431.field6419.method1137(58, arg2.field7642), arg2.field6233, class139.field2224 == arg2, arg2.field6228, arg2.field6232);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 56)
    public static void method2854(int arg0) {
        int var1 = -68 % ((arg0 + 32) / 45);
        field7131 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lbu;ILbu;Lqa;)V", line = 66)
    public static final void method2855(class17 arg0, int arg1, class17 arg2, class162 arg3) {
        class389.field5853 = class436.method2598((byte) 81, arg0, 0, class272.field3931);
        field7133++;
        class328.field4954 = arg3.method260(class389.field5853, class279.method1779(arg2, class272.field3931, 0), true);
        class8.field140 = class436.method2598((byte) 94, arg0, 0, class228.field3246);
        if (arg1 != 9700) {
            field7131 = null;
        }
        class464.field6944 = arg3.method260(class8.field140, class279.method1779(arg2, class228.field3246, 0), true);
        class501.field7392 = class436.method2598((byte) 67, arg0, 0, class244.field3498);
        class310.field4726 = arg3.method260(class501.field7392, class279.method1779(arg2, class244.field3498, 0), true);
    }
}
