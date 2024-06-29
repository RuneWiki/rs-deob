import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class320 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Ltr;")
    public static class195 field4813 = new class195(14, 4);

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
    public static boolean field4816 = false;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field4817 = 0;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method2047(int arg0) {
        field4813 = null;
        int var1 = 72 / ((arg0 - 22) / 60);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public static final void method2048(int arg0) {
        if (arg0 != 8) {
            return;
        }
        for (class295 var1 = (class295) class456.field6644.method1004((byte) -89); var1 != null; var1 = (class295) class456.field6644.method996(1)) {
            if (class403.method2525(var1.field4498, -23)) {
                class289.method1863(var1, -123);
            }
        }
        field4814++;
        if (class382.field5752 == 1) {
            class270.method1785(arg0 ^ 0x2);
            return;
        }
        class107.method827(0, class397.field5941, class498.field7158, class521.field7630, class267.field4085);
        int var2 = class380.field5735.method2174(-33, class271.field4152.method1635(class224.field3673, (byte) 35));
        for (class295 var3 = (class295) class456.field6644.method1004((byte) -60); var3 != null; var3 = (class295) class456.field6644.method996(1)) {
            int var4 = class360.method2259(var3, (byte) -94);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class498.field7158 = var2 + 8;
        class267.field4085 = (class432.field6402 ? 26 : 22) + class382.field5752 * 16;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Z")
    public static final boolean method2049(int arg0, int arg1) {
        if (arg0 >= -10) {
            method2047(102);
        }
        class483.field6955 = arg1 + 1 & 0xFFFF;
        class74.field1061 = true;
        field4815++;
        return true;
    }

    static {
        new class234(" days.", " Tage.", " jours.", " dias.");
    }
}
