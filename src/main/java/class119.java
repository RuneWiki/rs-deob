import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class119 extends class297 {

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Lii;")
    public static class221 field1796 = new class221(new byte[5000]);

    @OriginalMember(owner = "client!le", name = "D", descriptor = "[Lci;")
    public static class177[] field1804 = new class177[32768];

    @OriginalMember(owner = "client!le", name = "F", descriptor = "[S")
    public static short[] field1806 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!le", name = "C", descriptor = "Lma;")
    private static class5 field1803 = class12.method119("Walk here", (byte) 95);

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Lma;")
    public static class5 field1802 = field1803;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field1801 = -1;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Lma;")
    private static class5 field1811 = class12.method119("green:", (byte) 78);

    @OriginalMember(owner = "client!le", name = "H", descriptor = "[I")
    public static int[] field1808 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!le", name = "I", descriptor = "Lma;")
    public static class5 field1809 = field1811;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Lma;")
    public static class5 field1805 = field1811;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lje;")
    public class158 field1797;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Lvi;")
    public class211 field1799;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "[B")
    public byte[] field1795;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "[I")
    public static int[] field1810;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Lfi;", line = 13)
    public static final class222 method796(byte arg0) {
        int var1 = class179.field2718[0] * class112.field1665[0];
        field1794++;
        if (arg0 != 26) {
            method796((byte) 49);
        }
        int[] var2 = new int[var1];
        byte[] var3 = class37.field590[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class268.field4610[class204.method1354(255, var3[var4])];
        }
        class222 var5 = new class222(class282.field4786, class281.field4765, class88.field1315[0], class287.field4836[0], class112.field1665[0], class179.field2718[0], var2);
        class207.method1365(9);
        return var5;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 47)
    public static void method797(int arg0) {
        field1808 = null;
        field1811 = null;
        if (arg0 != 18942) {
            return;
        }
        field1810 = null;
        field1796 = null;
        field1804 = null;
        field1805 = null;
        field1802 = null;
        field1809 = null;
        field1806 = null;
        field1803 = null;
    }
}
