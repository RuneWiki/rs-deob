import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class524 {

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "Lrn;")
    public static class633 field6670 = new class633(61, 1);

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "Lwv;")
    public static class246 field6667;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)Z")
    public static final boolean method2882(int arg0) {
        if (arg0 == 16106) {
            field6669++;
            return class382.method2194("jaclib", 31749) ? class382.method2194("hw3d", 31749) : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lel;[[BI)V")
    public static final void method2883(class752 arg0, byte[][] arg1, int arg2) {
        field6668++;
        if (arg2 != 255) {
            return;
        }
        int var3 = class92.field1263.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class644.field8240[var4] >> 8) * 64 - class714.field9407;
                int var7 = (class644.field8240[var4] & 0xFF) * 64 - class240.field3293;
                class204.method1385(52);
                arg0.method4072(class179.field2391, var6, var7, class576.field7320, -27402, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)V")
    public static final void method2884(int arg0) {
        field6666++;
        if (arg0 == 64) {
            class621.field7861 = -1;
            class167.field2221 = -1;
            class380.field4658 = 0;
            class270.field3560 = -1;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V")
    public static void method2885(byte arg0) {
        if (arg0 <= 123) {
            field6672 = -55;
        }
        field6667 = null;
        field6670 = null;
    }
}
