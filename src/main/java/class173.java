import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class173 {

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public int field3049 = 0;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3050 = 0;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lr;")
    public static class66 field3051 = class93.method641(43, ")2");

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lr;")
    public static class66 field3052 = class93.method641(43, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3058 = 0;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lr;")
    private static class66 field3056 = class93.method641(43, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lr;")
    public static class66 field3047 = field3056;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lr;")
    public static class66 field3054 = class93.method641(43, "sl_back");

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field3059 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lha;")
    public static class63 field3048;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Llh;II)V")
    private final void method1171(class249 arg0, int arg1, int arg2) {
        field3055++;
        if (~arg1 == arg2) {
            this.field3049 = arg0.method1674(1355769544);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILlh;)V")
    public final void method1172(int arg0, class249 arg1) {
        if (arg0 != 0) {
            return;
        }
        field3053++;
        while (true) {
            int var3 = arg1.method1677(-6677);
            if (var3 == 0) {
                return;
            }
            this.method1171(arg1, var3, -6);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method1173(int arg0) {
        if (class147.field2674 != null) {
            class147.field2674.method1277(-81);
        }
        if (arg0 >= -63) {
            method1174(-12, 100, 4, -112);
        }
        field3057++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)Lbe;")
    public static final class75 method1174(int arg0, int arg1, int arg2, int arg3) {
        field3046++;
        class75 var4 = new class75();
        var4.field1489 = arg0;
        var4.field1492 = arg1;
        class230.field3981.method1380((byte) 127, var4, (long) arg3);
        class127.method879(arg1, (byte) 112);
        class63 var5 = class54.method367(arg3, (byte) -80);
        if (var5 != null) {
            class215.method1385(var5, -116);
        }
        if (class264.field4629 != null) {
            class215.method1385(class264.field4629, -125);
            class264.field4629 = null;
        }
        class176.field3105 = 0;
        class115.field2177 = false;
        class100.method689(class129.field2407, class70.field1405, class187.field3240, class9.field102, (byte) -114);
        if (var5 != null) {
            class69.method503(-1, false, var5);
        }
        class181.method1206(-1, arg1);
        int var6 = -12 / ((arg2 - 65) / 56);
        if (class150.field2702 != -1) {
            class244.method1607(99, class150.field2702, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method1175(byte arg0) {
        field3054 = null;
        field3051 = null;
        field3048 = null;
        field3047 = null;
        if (arg0 >= -21) {
            method1174(13, 66, -29, -26);
        }
        field3052 = null;
        field3056 = null;
    }
}
