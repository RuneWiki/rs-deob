import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class106 extends RuntimeException {

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "Ljava/lang/String;")
    public String field1550;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1547;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Lcb;")
    public static class631 field1549 = new class631(3, 4);

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public static int field1554 = 7000;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field1553 = field1554;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V")
    public static final void method858(int arg0, byte arg1) {
        field1548++;
        int var2 = class199.field3403 - class657.field9353;
        if (var2 >= 100) {
            class639.field8978 = 1;
            class275.field4202 = -1;
            class87.field1279 = -1;
            return;
        }
        int var3 = (int) class490.field7077;
        if (var3 < (class87.field1282 >> 8)) {
            var3 = class87.field1282 >> 8;
        }
        if (class235.field3785[4] && var3 < class601.field8509[4] + 128) {
            var3 = class601.field8509[4] + 128;
        }
        int var4 = (int) class261.field4064 + class174.field2979 & 0x3FFF;
        class671.method3752(var4, class141.field2213, arg0, class701.field9907, var3, class232.method1611(class145.field2251.field9475, class145.field2251.field9477, class582.field8234, (byte) 34) - 200, true, (var3 >> 3) * 3 + 600 << 2);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class101.field1507 = (int) ((float) (class101.field1507 - class499.field7265) * var5 + (float) class499.field7265);
        class81.field1167 = (int) ((float) (class81.field1167 - class694.field9846) * var5 + (float) class694.field9846);
        class329.field4857 = (int) ((float) (class329.field4857 - class77.field1141) * var5 + (float) class77.field1141);
        if (arg1 != 61) {
            field1551 = -88;
        }
        class497.field7212 = (int) ((float) (class497.field7212 - class540.field7705) * var5 + (float) class540.field7705);
        int var6 = class608.field8587 - class545.field7801;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class608.field8587 = (int) ((float) var6 * var5 + (float) class545.field7801);
        class608.field8587 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)V")
    public static void method859(boolean arg0) {
        if (arg0) {
            field1549 = null;
        }
        field1549 = null;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class106(Throwable arg0, String arg1) {
        this.field1550 = arg1;
        this.field1547 = arg0;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZ)V")
    public static final void method860(int arg0, boolean arg1) {
        if (class654.field9289.field5423.method3493(3) == 0) {
            arg0 = -1;
        }
        field1552++;
        if (class696.field9871 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class94 var2 = class520.field7513.method1415(arg0, -93);
            class726 var3 = var2.method783((byte) 123);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class706.field9962.method4070(new Point(var2.field1410, var2.field1403), var3.method4012(), var3.method4003(), (byte) -68, var3.method4008(), class400.field5941);
                class696.field9871 = arg0;
            }
        }
        if (arg0 == -1 && class696.field9871 != -1) {
            class706.field9962.method4070(new Point(), -1, null, (byte) -88, -1, class400.field5941);
            class696.field9871 = -1;
        }
        if (!arg1) {
            method858(86, (byte) 12);
        }
    }
}
