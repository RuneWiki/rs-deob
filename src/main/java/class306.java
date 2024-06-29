import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class306 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lbb;")
    public static class270 field4104 = new class270();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static final void method1941(byte arg0) {
        field4103++;
        for (int var1 = -1; var1 < class450.field6291; var1++) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class304.field4083[var1];
            }
            class131 var4 = class212.field2584[var3];
            if (var4 != null) {
                class382.method2381(var4.method841(true), -129, var4);
            }
        }
        int var2 = -104 % ((70 - arg0) / 37);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILaq;)V")
    public static final void method1942(boolean arg0, int arg1, class453 arg2) {
        field4102++;
        int var3 = arg2.field6339 == 0 ? arg2.field6377 : arg2.field6339;
        int var4 = ~arg2.field6417 == arg1 ? arg2.field6432 : arg2.field6417;
        class115.method672(class362.field4903[arg2.field6475 >> 16], 119, var4, var3, arg2.field6475, arg0);
        if (arg2.field6350 != null) {
            class115.method672(arg2.field6350, 118, var4, var3, arg2.field6475, arg0);
        }
        class244 var5 = (class244) class282.field3678.method2218(1, (long) arg2.field6475);
        if (var5 != null) {
            class391.method2433((byte) -26, var3, var5.field3245, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method1943(int arg0) {
        if (arg0 > -98) {
            field4104 = null;
        }
        field4104 = null;
    }
}
