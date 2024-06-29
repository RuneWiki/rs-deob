import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class218 {

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Lhi;")
    public static class82 field3785 = class95.method664((byte) -96, ")0");

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Lhi;")
    private static class82 field3782 = class95.method664((byte) -35, "flash1:");

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Lhi;")
    public static class82 field3787 = field3782;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "Lhi;")
    public static class82 field3786 = field3782;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Lhi;")
    public static class82 field3783 = class95.method664((byte) -59, "brillant3:");

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "[[[B")
    public static byte[][][] field3781;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 22)
    public static final void method1547(byte arg0) {
        if (arg0 >= -96) {
            method1547((byte) -11);
        }
        field3788++;
        while (class35.field545.method1497(128, class199.field3421) >= 11) {
            int var1 = class35.field545.method1499((byte) 103, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class29.field405[var1] == null) {
                class29.field405[var1] = new class81();
                if (class42.field748[var1] != null) {
                    class29.field405[var1].method524(class42.field748[var1], -13);
                }
                var2 = true;
            }
            class310.field5292[class297.field5054++] = var1;
            class81 var3 = class29.field405[var1];
            var3.field1680 = class212.field3708;
            int var4 = class35.field545.method1499((byte) -122, 1);
            if (var4 == 1) {
                class44.field760[class106.field1877++] = var1;
            }
            int var5 = class35.field545.method1499((byte) -11, 1);
            int var6 = class35.field545.method1499((byte) -32, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class281.field4727[class35.field545.method1499((byte) 112, 3)];
            if (var2) {
                var3.field1673 = var3.field1704 = var7;
            }
            int var8 = class35.field545.method1499((byte) 9, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method521(var5 == 1, class168.field2932.field1723[0] + var8, -1, class168.field2932.field1720[0] + var6);
        }
        class35.field545.method1506(-78);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 85)
    public static void method1548(int arg0) {
        field3781 = (byte[][][]) null;
        field3782 = null;
        field3787 = null;
        field3783 = null;
        if (arg0 != -2) {
            field3783 = (class82) null;
        }
        field3785 = null;
        field3786 = null;
    }
}
