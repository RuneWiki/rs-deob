import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class523 {

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field7732 = 0;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "Lvj;")
    public static class304 field7733 = new class304("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field7734 = 0;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "[S")
    public static short[] field7735 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "[I")
    public static int[] field7736;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lji;I)Lji;")
    public abstract class432 method2274(class432 arg0, int arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static void method3082(byte arg0) {
        field7736 = null;
        if (arg0 <= 38) {
            field7736 = null;
        }
        field7735 = null;
        field7733 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static final void method3083(int arg0) {
        field7731++;
        class283 var1 = (class283) class375.field5093.method1672((byte) -96);
        if (arg0 != -6906) {
            method3084(112, -111, 32);
        }
        while (var1 != null) {
            class373 var2 = var1.field3711;
            if (var2.field5020) {
                var1.method300(false);
                var2.method2158(511);
            } else if (var2.field5023 <= class31.field516) {
                var2.method2156(arg0 + 6905, class128.field1871);
                if (var2.field5020) {
                    var1.method300(false);
                } else {
                    class48.method357(var2, true);
                }
            }
            var1 = (class283) class375.field5093.method1668(arg0 + 6905);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
    public static final boolean method3084(int arg0, int arg1, int arg2) {
        if (arg1 == -21184) {
            field7730++;
            return class445.method2563((byte) -122, arg2, arg0) || class480.method2760(arg0, arg1 ^ 0xFFFFAD29, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lqa;I)V")
    public static final void method3085(class162 arg0, int arg1) {
        field7729++;
        if (~class225.field3033.method1669(32291) == arg1) {
            return;
        }
        if (class166.field2414 == 0) {
            for (class199 var2 = (class199) class225.field3033.method1672((byte) -114); var2 != null; var2 = (class199) class225.field3033.method1668(-1)) {
                class127.field1852.method2399(false, arg0, var2.field2761, var2.field2763, false, var2.field2758, var2.field2759 ? class385.field5232.field7627 : null, arg0, var2.field2767, class30.field508, true, var2.field2762);
                var2.method300(false);
            }
            class260.method1570(127);
            return;
        }
        if (class166.field2412 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class166.field2412 = class162.method1100(class66.field1022, (byte) 124, 0, var3, class389.field5281, 0);
            class514.field7586 = class166.field2412.method589(class321.method1851(class484.field6734, (byte) 50, class201.field2790, 0), class134.method937(class71.field1082, class484.field6734, 0), true);
        }
        for (class199 var4 = (class199) class225.field3033.method1672((byte) -110); var4 != null; var4 = (class199) class225.field3033.method1668(-1)) {
            class127.field1852.method2399(false, arg0, var4.field2761, var4.field2763, false, var4.field2758, var4.field2759 ? class385.field5232.field7627 : null, class166.field2412, var4.field2767, class514.field7586, true, var4.field2762);
            var4.method300(false);
        }
    }
}
