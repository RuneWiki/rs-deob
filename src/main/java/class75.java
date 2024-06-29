import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class75 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "J")
    public static volatile long field1797 = 0L;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Loc;")
    public static class137 field1799 = new class137(0, 0);

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Ldd;")
    public static class35 field1802 = class180.method1196((byte) -85, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Ldd;")
    private static class35 field1803 = class180.method1196((byte) -6, "Error loading your profile)3");

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Ldd;")
    public static class35 field1801 = field1803;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
    public static int[] field1800;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILdd;)V")
    public static final void method589(int arg0, class35 arg1) {
        if (arg0 >= -97) {
            field1802 = null;
        }
        field1796++;
        if (class28.field579 >= 2) {
            if (arg1.method337(-114, class155.field3195)) {
                System.gc();
            }
            if (arg1.method337(-117, class71.field1706)) {
                class55.method490(19845);
            }
            if (arg1.method337(74, class179.field3674)) {
                class181.field3692 = true;
            }
            if (arg1.method337(104, class56.field1405)) {
                class181.field3692 = false;
            }
            arg1.method337(94, class40.field893);
            arg1.method337(-31, class101.field2231);
            if (arg1.method337(-62, class43.field952)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class167.field3375[var2].field656[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method335(class88.field1974, -77) && class25.field508 != 0) {
                class131.method905((byte) 118, arg1.method344(6, -26886).method330(10));
            }
            if (arg1.method337(102, class59.field1467) && class25.field508 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method335(class38.field851, -120)) {
                class157.field3198 = arg1.method344(12, -26886).method340(53).method330(10);
                class190.method1252(null, 0, class63.method529(new class35[] { class165.field3333, class3.method19(class157.field3198, -29578) }, (byte) 113), 0);
            }
            if (arg1.method337(-128, class56.field1390)) {
                class207.field4117 = true;
            }
        }
        class1.field11.method659(180, true);
        class96.field2127++;
        class1.field11.method257((byte) 126, arg1.method347((byte) -94) - 1);
        class1.field11.method253(arg1.method344(2, -26886), (byte) -39);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1801 = null;
        field1800 = null;
        field1802 = null;
        int var1 = -2 / ((-arg0 - 68) / 58);
        field1799 = null;
        field1803 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static final void method591(int arg0) {
        if (arg0 != 4096) {
            method591(7);
        }
        if (class51.field1155 == null || class3.field43 == null) {
            class3.field43 = new int[256];
            class51.field1155 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class51.field1155[var1] = (int) (Math.sin(var2) * 4096.0D);
                class3.field43[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1795++;
    }
}
