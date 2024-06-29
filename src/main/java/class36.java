import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class36 {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field538 = 0;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lr;")
    public static class66 field539 = class93.method641(43, "(U2");

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[Z")
    public static boolean[] field540 = new boolean[100];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[I")
    public static int[] field541;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Llh;I)Luf;")
    public static final class240 method199(class249 arg0, int arg1) {
        field542++;
        class240 var2 = new class240(arg0.method1637(127), arg0.method1637(arg1 + 126), arg0.method1674(1355769544), arg0.method1674(1355769544), arg0.method1652(-5528), arg1 == arg0.method1677(-6677));
        int var3 = arg0.method1677(-6677);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field4182.method866(new class17(arg0.method1674(1355769544), arg0.method1674(1355769544), arg0.method1674(1355769544), arg0.method1674(1355769544)), true);
        }
        var2.method1576(arg1 ^ 0x3201);
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I")
    public static final int method200(int arg0, int arg1, int arg2) {
        field536++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < arg0) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public static final void method201(int arg0, int arg1) {
        for (class49 var2 = (class49) class61.field1032.method1382(-32642); var2 != null; var2 = (class49) class61.field1032.method1386((byte) -119)) {
            if ((var2.field1560 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method560(-17554);
            }
        }
        if (arg1 == 2) {
            field535++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static void method202(boolean arg0) {
        if (!arg0) {
            method203(-40);
        }
        field541 = null;
        field540 = null;
        field539 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method203(int arg0) {
        field537++;
        if (arg0 != -26678) {
            field539 = null;
        }
        class84.field1628.method1614(-6);
    }
}
