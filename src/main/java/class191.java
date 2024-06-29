import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class191 extends class42 {

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Lhl;")
    public static class375 field2787 = new class375(64);

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Ldc;")
    public static class5 field2784;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 10)
    public static void method1304(int arg0) {
        field2784 = null;
        int var1 = 28 / ((arg0 - 57) / 52);
        field2787 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILtf;)V", line = 27)
    public static final void method1306(int arg0, class198 arg1) {
        field2785++;
        if (!class219.field3351) {
            return;
        }
        if (arg1.field3014 != null) {
            class198 var2 = class539.method3173(class303.field4494, arg0 + 8, class72.field1164);
            if (var2 != null) {
                class361 var3 = new class361();
                var3.field5260 = var2;
                var3.field5252 = arg1;
                var3.field5256 = arg1.field3014;
                class281.method1805(var3);
            }
        }
        if (arg0 != -6) {
            field2787 = null;
        }
        class369.field5335++;
        class228.method1528(true, class127.field1989);
        class276.field4124.method3019(arg1.field3016, 11648);
        class276.field4124.method3068((byte) 57, arg1.field2952);
        class276.field4124.method3029(-46, class72.field1164);
        class276.field4124.method3073(class303.field4494, 87);
        class276.field4124.method3029(98, class28.field391);
        class276.field4124.method3045(3, arg1.field2969);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)I")
    public abstract int method1300(int arg0);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)I")
    public abstract int method1301(byte arg0);

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)I")
    public abstract int method1302(int arg0);

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)J")
    public abstract long method1303(byte arg0);

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(B)I")
    public abstract int method1305(byte arg0);
}
