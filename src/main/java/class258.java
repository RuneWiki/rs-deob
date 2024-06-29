import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class258 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4662 = 255;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[Lcc;")
    public static class209[] field4666 = new class209[200];

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lcc;")
    public static class209 field4660 = class95.method669(125, "mapscene");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
    public static int[] field4665 = new int[4096];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I")
    public static final int method1788(int arg0) {
        int var1 = -52 / ((arg0 + 61) / 62);
        field4664++;
        return 0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILcc;)V")
    public static final void method1789(int arg0, int arg1, class209 arg2) {
        if (arg1 != 18869) {
            method1791(59, -15, 62);
        }
        class195 var3 = class178.method1229(arg0, 2, -127);
        field4661++;
        var3.method1338(0);
        var3.field3501 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1790(byte arg0) {
        field4666 = null;
        field4660 = null;
        field4665 = null;
        if (arg0 != -126) {
            method1788(70);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
    public static final int method1791(int arg0, int arg1, int arg2) {
        field4663++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 != -22053) {
            return -102;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4665[var0] = class31.method253(-1102430612, var0);
        }
    }
}
