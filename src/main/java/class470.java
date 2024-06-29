import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class470 {

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "[I")
    public static int[] field6558 = new int[32];

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "F")
    public static float field6559;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6557;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field6558[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method2811(byte arg0, int arg1) {
        field6557++;
        if (arg0 >= -75) {
            method2812(102);
        }
        class714 var2 = class350.method2072((long) arg1, 12, (byte) 107);
        var2.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 28)
    public static void method2812(int arg0) {
        field6558 = null;
        if (arg0 <= 66) {
            method2812(78);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IC)Z", line = 38)
    public static final boolean method2813(int arg0, char arg1) {
        if (arg0 <= 73) {
            method2813(-75, (char) 65512);
        }
        field6556++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }
}
