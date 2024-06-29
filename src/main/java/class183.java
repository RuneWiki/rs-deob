import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class183 {

    @OriginalMember(owner = "client!k", name = "i", descriptor = "J")
    public long field2766 = 0L;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field2761 = 0;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2770 = "level: ";

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public int field2767;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lsk;")
    public class114 field2768;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lsk;")
    public class114 field2774;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "[I")
    public static int[] field2775;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1138(int arg0, String arg1) {
        field2771++;
        if (class293.field4610 == null || arg1.length() == 0) {
            return -1;
        }
        if (arg0 >= -102) {
            field2775 = null;
        }
        for (int var2 = 0; var2 < class293.field4610.field2734; var2++) {
            if (class248.method1603(class265.method1761("<br>", (byte) -87, class293.field4610.field2750[var2], " "), (byte) 117, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIB)I")
    public static final int method1139(int arg0, int arg1, int arg2, byte arg3) {
        field2772++;
        if (class67.field1072 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        if (arg3 != 117) {
            method1139(102, 78, -26, (byte) 127);
        }
        int var7 = arg0;
        if (arg0 < 3 && (class221.field3333[1][var4][var5] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var6) * class67.field1072[var7][var4][var5 + 1] + class67.field1072[var7][var4 + 1][var5 + 1] * var6 >> 7;
        int var10 = (128 - var6) * class67.field1072[var7][var4][var5] + (class67.field1072[var7][var4 + 1][var5] * var6) >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public static final void method1140(int arg0, int arg1) {
        if (arg1 != -24559) {
            return;
        }
        class227.method1447(arg1 ^ 0xFFFFA014);
        field2776++;
        class40.method239(5250);
        int var2 = class231.method1476((byte) -104, arg0).field3504;
        if (var2 == 0) {
            return;
        }
        int var3 = class35.field494[arg0];
        if (var2 == 9) {
            class140.field2045 = var3;
        }
        if (var2 == 5) {
            class158.field2417 = var3;
        }
        if (var2 == 6) {
            class101.field1594 = var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method1141(int arg0) {
        field2770 = null;
        field2775 = null;
        if (arg0 != 1) {
            field2762 = -115;
        }
    }
}
