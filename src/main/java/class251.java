import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class251 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[J")
    public static long[] field4098 = new long[256];

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lna;")
    public static class26 field4105;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lna;")
    public static class26 field4104;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "[I")
    public static int[] field4106;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public int field4103;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4098[var0] = var1;
        }
        field4105 = class69.method505("Texturen geladen)3", (byte) -123);
        field4104 = class69.method505("rouge:", (byte) -124);
        field4106 = new int[128];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 28)
    public static void method1722(int arg0) {
        field4106 = null;
        field4105 = null;
        field4104 = null;
        field4098 = null;
        if (arg0 != 12881) {
            method1723((class297) null, (byte) -74, -125);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lbe;BI)Lna;", line = 43)
    public static final class26 method1723(class297 arg0, byte arg1, int arg2) {
        field4099++;
        if (arg1 >= -8) {
            field4106 = (int[]) null;
        }
        if (!client.method1730(arg0).method2283(arg2, (byte) -110) && arg0.field5126 == null) {
            return null;
        } else if (arg0.field4970 == null || arg0.field4970.length <= arg2 || arg0.field4970[arg2] == null || arg0.field4970[arg2].method195(1).method171(-58) == 0) {
            return class299.field5146 ? class236.method1587(new class26[] { class17.field247, class149.method1019((byte) 9, arg2) }, (byte) -101) : null;
        } else {
            return arg0.field4970[arg2];
        }
    }
}
