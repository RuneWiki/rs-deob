import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Loa;")
    private static class99 field542 = class221.method1463(2844, "Starting 3d Library");

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    public static int[] field539 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Loa;")
    public static class99 field538 = class221.method1463(2844, "mem=");

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Loa;")
    public static class99 field544 = field542;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Ltg;")
    public static class182 field540;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method250(int arg0) {
        if (arg0 != -750968352) {
            return;
        }
        field544 = null;
        field538 = null;
        field542 = null;
        field539 = null;
        field540 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B[Loa;)[Loa;")
    public static final class99[] method251(byte arg0, class99[] arg1) {
        class99[] var2 = new class99[5];
        if (arg0 != 66) {
            field541 = -122;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class198.method1332(arg0 + 51, new class99[] { class198.method1333(class28.method249(arg0, -45), var3), class234.field4025 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class198.method1332(arg0 + 8, new class99[] { var2[var3], arg1[var3] });
            }
        }
        field537++;
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)I")
    public static final int method252(int arg0, int arg1, byte arg2) {
        field543++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 >= -34) {
            field542 = null;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
