import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class248 {

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
    public static boolean field4052 = true;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lth;")
    public static class57 field4050;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 5)
    public static void method1908(byte arg0) {
        if (arg0 <= 59) {
            field4051 = 33;
        }
        field4050 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)V", line = 17)
    public static final void method1909(byte arg0, int arg1) {
        if (class6.field46 == arg1 && arg1 != 0) {
            class5 var2 = class308.field4917[arg1];
            var2.method19(class54.field899);
        }
        if (arg0 != -16) {
            field4051 = 125;
        }
        field4054++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB)V", line = 45)
    public static final void method1910(int arg0, int arg1, byte arg2) {
        class66.field1178[arg1] = arg0;
        field4055++;
        class204 var3 = (class204) class279.field4583.method1268(-40, (long) arg1);
        if (var3 == null) {
            class204 var4 = new class204(class47.method371(60) + 500L);
            class279.field4583.method1273(1, (long) arg1, var4);
        } else {
            var3.field3220 = class47.method371(122) + 500L;
        }
        if (arg2 > -92) {
            method1910(-108, -32, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)I", line = 73)
    public static final int method1911(int arg0, int arg1, int arg2) {
        if (arg0 != -5718) {
            field4051 = -22;
        }
        class354 var3 = (class354) class329.field5229.method1268(arg0 + 5602, (long) arg1);
        field4053++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field5622.length) {
            return var3.field5622[arg2];
        } else {
            return 0;
        }
    }
}
