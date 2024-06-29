import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class220 {

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "[I")
    public static int[] field2953 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!cha", name = "e", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!cha", name = "f", descriptor = "Lnd;")
    public static class547 field2956;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "[I")
    public static int[] field2951;

    @OriginalMember(owner = "client!cha", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field2955++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIIB)V", line = 17)
    public static final void method1429(int arg0, int arg1, int arg2, byte arg3) {
        field2954++;
        int var4 = class332.field4232 + arg2;
        int var5 = class447.field5936 + arg0;
        if (class197.field2689 == null || arg2 < 0 || arg0 < 0 || class409.field5183 <= arg2 || class543.field7597 <= arg0 || class748.field10451.field10412.method1806((byte) 92) == 0 && class380.field4847.field5796 != arg1) {
            return;
        }
        long var6 = (long) (arg1 << 28 | var5 << 14 | var4);
        class133 var8 = (class133) class342.field4322.method1160(var6, 122);
        if (var8 == null) {
            class58.method419(arg1, arg2, arg0);
            return;
        }
        class182 var9 = (class182) var8.field1923.method3672(-1);
        if (var9 == null) {
            class58.method419(arg1, arg2, arg0);
            return;
        }
        class356 var10 = (class356) class58.method419(arg1, arg2, arg0);
        if (var10 == null) {
            var10 = new class356(arg2 << 9, class195.field2669[arg1].method1677(arg0, (byte) 73, arg2), arg0 << 9, arg1, arg1);
        } else {
            var10.field4567 = var10.field4566 = -1;
        }
        var10.field4569 = var9.field2543;
        var10.field4580 = var9.field2544;
        label61: while (true) {
            class182 var11 = (class182) var8.field1923.method3662(-1);
            if (var11 == null) {
                break;
            }
            if (var10.field4569 != var11.field2543) {
                var10.field4583 = var11.field2544;
                var10.field4567 = var11.field2543;
                while (true) {
                    class182 var12 = (class182) var8.field1923.method3662(-1);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field4569 != var12.field2543 && var10.field4567 != var12.field2543) {
                        var10.field4576 = var12.field2544;
                        var10.field4566 = var12.field2543;
                    }
                }
            }
        }
        int var13 = class225.method1448(arg1, (arg2 << 9) + 256, (arg0 << 9) + 256, (byte) 28);
        if (arg3 != -16) {
            return;
        }
        var10.field5797 = arg0 << 9;
        var10.field5801 = arg2 << 9;
        var10.field5793 = (byte) arg1;
        var10.field5800 = var13;
        var10.field5796 = (byte) arg1;
        var10.field4584 = 0;
        if (class99.method797(arg0, 1, arg2)) {
            var10.field5793++;
        }
        class643.method3608(arg1, arg2, arg0, var13, var10);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V", line = 115)
    public static void method1430(int arg0) {
        if (arg0 == 511) {
            field2953 = null;
            field2956 = null;
            field2951 = null;
        }
    }

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "(I)V", line = 128)
    public static final void method1431(int arg0) {
        if (arg0 == 1023) {
            class739.field10303.method463(class546.field7612, class762.field10628, class318.field4113);
            field2952++;
        }
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(II)V", line = 143)
    public class220(int arg0, int arg1) {
    }
}
