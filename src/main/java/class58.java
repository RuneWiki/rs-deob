import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class58 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Lig;")
    public static class206 field665 = new class206(113, 0);

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z")
    public static final boolean method418(int arg0, int arg1, int arg2) {
        if (arg2 != -13) {
            method418(23, 88, 0);
        }
        field667++;
        return (arg1 & 0x60000) != 0 | class585.method3405(1, arg0, arg1) || class251.method1654(arg0, arg1, (byte) 107) || class81.method533((byte) -127, arg0, arg1);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static void method419(int arg0) {
        if (arg0 != 1) {
            field665 = null;
        }
        field665 = null;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)Z")
    public static final boolean method420(int arg0) {
        field666++;
        try {
            return arg0 == 4667 ? class177.method1002(0) : false;
        } catch (IOException var4) {
            class195.method1245(-31856);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class118.field1475 == null ? -1 : class118.field1475.method1318(-103)) + "," + (class379.field5763 == null ? -1 : class379.field5763.method1318(90)) + "," + (class592.field8497 == null ? -1 : class592.field8497.method1318(78)) + " - " + class32.field372 + "," + (class439.field6548.field2515[0] + class287.field3980) + "," + (class439.field6548.field2524[0] + class250.field3549) + " - ";
            for (int var3 = 0; class32.field372 > var3 && var3 < 50; var3++) {
                var2 = var2 + class46.field498.field2622[var3] + ",";
            }
            class630.method3607(arg0 - 4660, var5, var2);
            class177.method1007((byte) -50, false);
            return true;
        }
    }
}
