import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class389 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Ldb;")
    public class210 field5869 = new class210();

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Z")
    public boolean field5873 = false;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Z")
    public static boolean field5870 = false;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field5871 = 0;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public int field5874;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public int field5875;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lvg;I)V", line = 3)
    public static final void method2369(class38 arg0, int arg1) {
        field5872++;
        if (!class61.field932) {
            return;
        }
        if (arg1 != 0) {
            field5870 = false;
        }
        class245.field3616++;
        if (arg0.field414 != null) {
            class38 var2 = class229.method1575(class267.field3903, arg1, class266.field3893);
            if (var2 != null) {
                class168 var3 = new class168();
                var3.field2488 = arg0;
                var3.field2484 = arg0.field414;
                var3.field2491 = var2;
                class360.method2238(var3);
            }
        }
        class291.method1861((byte) -104, class450.field6705);
        class356.field5471.method1415(arg0.field467, (byte) -123);
        class356.field5471.method1437(class267.field3903, -97);
        class356.field5471.method1429((byte) 98, class49.field785);
        class356.field5471.method1413(-125, arg0.field535);
        class356.field5471.method1448(-101, class266.field3893);
        class356.field5471.method1429((byte) 101, arg0.field547);
    }
}
