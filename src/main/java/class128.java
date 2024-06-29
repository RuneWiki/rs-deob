import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2894 = -1;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
    public static int[] field2897 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lic;")
    public static class59 field2902 = class59.method433(0, "");

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lic;")
    private static class59 field2898 = class59.method433(0, "glow1:");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lic;")
    public static class59 field2893 = class59.method433(0, "mapfunction");

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lic;")
    public static class59 field2899 = field2898;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lic;")
    public static class59 field2904 = field2898;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Llf;")
    public static class82 field2896 = new class82(30);

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field2905 = 0;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V")
    public static final void method975(int arg0, byte arg1, int arg2) {
        field2903++;
        class125.field2842.method1072(13, arg1 - 71);
        class125.field2842.method1195(arg2, arg1 + 782);
        if (arg1 != 70) {
            field2895 = 67;
        }
        class125.field2842.method1165(62, arg0);
        class53.field1308++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIB)V")
    public static final void method976(int arg0, int arg1, int arg2, byte arg3) {
        field2901++;
        class159 var4 = class76.method632(arg0, 128, arg2);
        if (var4 != null && var4.field3543 != null) {
            class139 var5 = new class139();
            var5.field3096 = var4.field3543;
            var5.field3104 = var4;
            class125.method948(var5, -30164);
        }
        class2.field37 = arg0;
        class34.field907 = true;
        class149.field3267 = arg2;
        class143.field3147 = arg1;
        class42.method320(false, var4);
        if (arg3 > -49) {
            field2897 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        field2898 = null;
        field2896 = null;
        field2902 = null;
        field2904 = null;
        if (arg0 <= 76) {
            field2895 = -30;
        }
        field2897 = null;
        field2899 = null;
        field2893 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILic;I)V")
    public static final void method978(int arg0, class59 arg1, int arg2) {
        field2900++;
        boolean var3 = false;
        class59 var4 = arg1.method448(true).method459(arg2 + 25994);
        if (arg2 != 2458) {
            return;
        }
        for (int var5 = 0; var5 < class43.field1092; var5++) {
            class49 var6 = class91.field2323[class31.field842[var5]];
            if (var6 != null && var6.field1225 != null && var6.field1225.method423(var4, -61)) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, arg2 - 27629, var6.field1719[0], var6.field1704[0], 1, false);
                var3 = true;
                if (arg0 == 1) {
                    class125.field2842.method1072(24, -1);
                    class23.field560++;
                    class125.field2842.method1191(class31.field842[var5], -1806027672);
                } else if (arg0 == 4) {
                    class125.field2842.method1072(19, -1);
                    class158.field3508++;
                    class125.field2842.method1165(arg2 ^ 0x983, class31.field842[var5]);
                } else if (arg0 == 6) {
                    class63.field1613++;
                    class125.field2842.method1072(187, arg2 - 2459);
                    class125.field2842.method1203((byte) 103, class31.field842[var5]);
                } else if (arg0 == 7) {
                    class75.field1849++;
                    class125.field2842.method1072(29, -1);
                    class125.field2842.method1206(class31.field842[var5], true);
                }
                break;
            }
        }
        if (!var3) {
            class127.method972(class46.method358(new class59[] { class9.field178, var4 }, (byte) -75), class38.field1000, 0, 26018);
        }
    }
}
