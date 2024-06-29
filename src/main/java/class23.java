import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class124 {

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public int field662 = 0;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "Lrd;")
    private static class117 field658 = class95.method812("Could not complete login)3", (byte) 8);

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field654 = -1;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
    public static int field663 = 0;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "Lrd;")
    public static class117 field661 = class95.method812(" weitere Optionen", (byte) 8);

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "Lrd;")
    public static class117 field664 = field658;

    @OriginalMember(owner = "client!da", name = "mb", descriptor = "I")
    public static int field668 = -1;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "Lrd;")
    public static class117 field666 = class95.method812("Einloggen", (byte) 8);

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "Lrd;")
    public static class117 field665 = class95.method812(" (X", (byte) 8);

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!da", name = "nb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "Lge;")
    public static class47 field656;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "[Ll;")
    public static class76[] field657;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILbf;)V")
    public final void method253(int arg0, class14 arg1) {
        int var3 = 41 % ((arg0 - 68) / 51);
        while (true) {
            int var4 = arg1.method153(true);
            if (var4 == 0) {
                field669++;
                return;
            }
            this.method256(19799, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
    public static void method254(byte arg0) {
        field661 = null;
        field664 = null;
        field666 = null;
        field658 = null;
        field657 = null;
        if (arg0 == -32) {
            field656 = null;
            field665 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
    public static final void method255(int arg0) {
        field659++;
        for (int var1 = arg0; var1 < class24.field678; var1++) {
            int var2 = class95.field2379[var1];
            class36 var3 = class93.field2334[var2];
            if (var3 != null) {
                class22.method251(arg0, var3.field1061.field397, var3);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILbf;I)V")
    private final void method256(int arg0, class14 arg1, int arg2) {
        if (arg0 != 19799) {
            method257(99);
        }
        if (arg2 == 2) {
            this.field662 = arg1.method138((byte) 105);
        }
        field660++;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(I)Z")
    public static final boolean method257(int arg0) {
        if (arg0 < 32) {
            return true;
        }
        field655++;
        try {
            if (class79.field2112 == 2) {
                if (class56.field1567 == null) {
                    class56.field1567 = class8.method58(class32.field944, class71.field2000, class41.field1179);
                    if (class56.field1567 == null) {
                        return false;
                    }
                }
                if (class14.field269 == null) {
                    class14.field269 = new class4(class59.field1657, field656);
                }
                if (class1.field27.method1028(22050, class14.field269, false, class24.field672, class56.field1567)) {
                    class1.field27.method1024(false);
                    class1.field27.method1021(class77.field2108, (byte) -123);
                    class1.field27.method1031(class137.field3285, (byte) 107, class56.field1567);
                    class56.field1567 = null;
                    class79.field2112 = 0;
                    class14.field269 = null;
                    class32.field944 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class1.field27.method1026(-92);
            class56.field1567 = null;
            class79.field2112 = 0;
            class32.field944 = null;
            class14.field269 = null;
        }
        return false;
    }
}
