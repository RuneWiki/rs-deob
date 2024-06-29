import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class48 {

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "J")
    public long field1056 = 0L;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static volatile int field1039 = 0;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Ljd;")
    public static class92 field1036 = class202.method1325((byte) 90, "");

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Ljd;")
    private static class92 field1035 = class202.method1325((byte) 90, "Apr");

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Ljd;")
    private static class92 field1045 = class202.method1325((byte) 90, "Jul");

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Ljd;")
    private static class92 field1042 = class202.method1325((byte) 90, "Jun");

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field1038 = 0;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Ljd;")
    private static class92 field1029 = class202.method1325((byte) 90, "Oct");

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Ljd;")
    private static class92 field1047 = class202.method1325((byte) 90, "Mar");

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Ljd;")
    private static class92 field1034 = class202.method1325((byte) 90, "Aug");

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Ljd;")
    private static class92 field1052 = class202.method1325((byte) 90, "Dec");

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "Ljd;")
    private static class92 field1050 = class202.method1325((byte) 90, "Jan");

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Ljd;")
    private static class92 field1055 = class202.method1325((byte) 90, "Sep");

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Ljd;")
    private static class92 field1031 = class202.method1325((byte) 90, "Nov");

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Ljd;")
    private static class92 field1037 = class202.method1325((byte) 90, "Feb");

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "Ljd;")
    private static class92 field1049 = class202.method1325((byte) 90, "May");

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[Ljd;")
    public static class92[] field1032 = new class92[] { field1050, field1037, field1047, field1035, field1049, field1042, field1045, field1034, field1055, field1029, field1031, field1052 };

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Ltd;")
    public static class183 field1043;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Ltg;")
    public class186 field1040;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Ltg;")
    public class186 field1053;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method297(byte arg0) {
        field1032 = null;
        field1049 = null;
        field1036 = null;
        field1047 = null;
        field1052 = null;
        field1043 = null;
        if (arg0 != -92) {
            method299(91, 110, -91);
        }
        field1035 = null;
        field1031 = null;
        field1034 = null;
        field1055 = null;
        field1037 = null;
        field1050 = null;
        field1029 = null;
        field1045 = null;
        field1042 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static final void method298(boolean arg0) {
        field1044++;
        if (arg0) {
            field1028 = 80;
        }
        try {
            if (class70.field1446 == null) {
                class70.field1446 = new class189(class140.field2817, class77.method529(-3, new class92[] { class202.field3913, class3.field190, class130.field2609 }).method639((byte) 108));
            } else {
                byte[] var1 = class70.field1446.method1219(4);
                if (var1 != null) {
                    class70 var2 = new class70(var1);
                    class156.field3106 = var2.method442(-21351);
                    class148.field2942 = new class32[class156.field3106];
                    for (int var3 = 0; var3 < class156.field3106; var3++) {
                        class32 var4 = class148.field2942[var3] = new class32();
                        int var5 = var2.method442(-21351);
                        var4.field720 = (var5 & 0x8000) != 0;
                        var4.field730 = var5 & 0x7FFF;
                        var4.field719 = var2.method437((byte) 125);
                        var4.field726 = var2.method417((byte) -126);
                        var4.field722 = var3;
                        var4.field727 = class54.method315(91, var4.field719);
                    }
                    class96.method669(0, class148.field2942, class200.field3901, -2, class148.field2942.length - 1, class166.field3267);
                    class59.field1230 = true;
                    class70.field1446 = null;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class70.field1446 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
    public static final void method299(int arg0, int arg1, int arg2) {
        if (class150.field2985 != arg1) {
            class75.field1574 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class75.field1574[var3] = (var3 << 12) / arg1;
            }
            class101.field2073 = arg1 == 64 ? 2048 : 4096;
            class2.field163 = arg1 - 1;
            class150.field2985 = arg1;
        }
        if (class68.field1385 != arg2) {
            class166.field3271 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class166.field3271[var4] = (var4 << 12) / arg2;
            }
            class5.field279 = arg2 - 1;
            class68.field1385 = arg2;
        }
        field1054++;
        if (arg0 != 0) {
            method297((byte) 69);
        }
    }
}
