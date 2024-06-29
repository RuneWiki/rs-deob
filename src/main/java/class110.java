import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class110 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lcp;")
    public static class470 field1393 = new class470(16);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method707(byte arg0) {
        field1393 = null;
        int var1 = -125 / ((-arg0 - 28) / 53);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhc;BLnp;)I")
    public static final int method708(class84 arg0, byte arg1, class313 arg2) {
        field1392++;
        if (arg1 != -118) {
            method707((byte) 108);
        }
        if (arg0.field1025 != -1) {
            return arg0.field1025;
        }
        if (arg0.field1035 != -1) {
            class279 var3 = arg2.field4432.method703(12095, arg2.method655() ? arg0.field1035 : arg0.field1038);
            if (!var3.field4113) {
                return var3.field4111;
            }
        }
        return arg0.field1027;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljm;B)Ljm;")
    public abstract class448 method709(class448 arg0, byte arg1);
}
