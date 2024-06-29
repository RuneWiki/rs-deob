import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class124 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2868 = 0;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lvc;")
    public static class137 field2866 = class45.method325("gr-Un:", -46);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2871;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JI)V")
    public static final void method927(long arg0, int arg1) {
        field2870++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != -105) {
            method928((byte) 113, null);
        }
        for (int var3 = 0; var3 < class39.field868; var3++) {
            if (class93.field2212[var3] == arg0) {
                class8.field171++;
                class39.field868--;
                class34.field737 = true;
                for (int var4 = var3; var4 < class39.field868; var4++) {
                    class93.field2212[var4] = class93.field2212[var4 + 1];
                }
                class72.field1527.method845(199, 100);
                class72.field1527.method840(false, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLme;)Z")
    public static final boolean method928(byte arg0, class85 arg1) {
        field2869++;
        int var2 = arg1.field1914;
        if (class46.field1035 == 2) {
            if (var2 == 201) {
                class69.field1462 = true;
                class45.field1012 = class45.field999;
                class80.field1825 = true;
                class33.field703 = 1;
                class92.field2185 = 0;
                class45.field1001 = class126.field2976;
            }
            if (var2 == 202) {
                class92.field2185 = 0;
                class45.field1012 = class45.field999;
                class69.field1462 = true;
                class45.field1001 = class139.field3207;
                class33.field703 = 2;
                class80.field1825 = true;
            }
        }
        if (var2 == 205) {
            class29.field639 = 250;
            return true;
        }
        if (var2 == 501) {
            class92.field2185 = 0;
            class45.field1012 = class45.field999;
            class45.field1001 = class143.field3364;
            class80.field1825 = true;
            class33.field703 = 4;
            class69.field1462 = true;
        }
        if (var2 == 502) {
            class45.field1001 = class80.field1790;
            class92.field2185 = 0;
            class80.field1825 = true;
            class69.field1462 = true;
            class45.field1012 = class45.field999;
            class33.field703 = 5;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class36.field784.method406(var4 == 1, (byte) -89, var3);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class36.field784.method402(var5, var6 == 1, true);
        }
        int var7 = 66 / ((arg0 + 69) / 52);
        if (var2 == 324) {
            class36.field784.method398(-119, false);
        }
        if (var2 == 325) {
            class36.field784.method398(-125, true);
        }
        if (var2 == 326) {
            class123.field2856++;
            class72.field1527.method845(188, 100);
            class36.field784.method407(class72.field1527, 0);
            return true;
        }
        if (var2 == 620) {
            class45.field1022 = !class45.field1022;
        }
        if (var2 >= 601 && var2 <= 613) {
            class2.method18(-1);
            if (class45.field1005.method997(119) > 0) {
                class72.field1527.method845(234, 100);
                class72.field1527.method840(false, class45.field1005.method1030(65));
                class72.field1527.method837(93, var2 - 601);
                class72.field1527.method837(-80, class45.field1022 ? 1 : 0);
                class78.field1727++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method929(boolean arg0) {
        field2866 = null;
        if (!arg0) {
            method930(4, (byte) 25, -87);
        }
        field2871 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)I")
    public static final int method930(int arg0, byte arg1, int arg2) {
        field2865++;
        int var3 = class125.method932(arg0 - 1, 22473, arg2 - 1) + class125.method932(arg0 + 1, 22473, arg2 - 1) + class125.method932(arg0 + -1, 22473, arg2 + 1) + class125.method932(arg0 + 1, 22473, arg2 + 1);
        int var4 = class125.method932(arg0 - 1, 22473, arg2) + class125.method932(arg0 + 1, 22473, arg2) + class125.method932(arg0, 22473, arg2 - 1) + class125.method932(arg0, 22473, arg2 + 1);
        if (arg1 < 105) {
            field2868 = -86;
        }
        int var5 = class125.method932(arg0, 22473, arg2);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }
}
