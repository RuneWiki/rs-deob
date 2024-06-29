import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class292 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lhi;")
    public static class82 field4899 = class95.method664((byte) -85, "hitbar_default");

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lhi;")
    public static class82 field4902 = class95.method664((byte) -122, "settings=");

    @OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
    public static int[] field4903 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lhi;")
    public static class82 field4904 = class95.method664((byte) -57, "hitmarks");

    @OriginalMember(owner = "client!h", name = "e", descriptor = "F")
    public static float field4901;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[[Z")
    public static boolean[][] field4900;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 12)
    public static void method2012(boolean arg0) {
        field4904 = null;
        field4899 = null;
        field4900 = (boolean[][]) null;
        if (!arg0) {
            field4903 = null;
            field4902 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 35)
    public static final void method2013(int arg0) {
        class35.field545.method1495(-88);
        int var1 = class35.field545.method1499((byte) -18, 1);
        field4897++;
        if (arg0 != -20039) {
            method2012(false);
        }
        if (var1 == 0) {
            return;
        }
        int var2 = class35.field545.method1499((byte) -1, 2);
        if (var2 == 0) {
            class44.field760[class106.field1877++] = 2047;
        } else if (var2 == 1) {
            int var3 = class35.field545.method1499((byte) 119, 3);
            class168.field2932.method655(var3, false, (byte) -52);
            int var4 = class35.field545.method1499((byte) -89, 1);
            if (var4 == 1) {
                class44.field760[class106.field1877++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class35.field545.method1499((byte) 119, 3);
            class168.field2932.method655(var5, true, (byte) -118);
            int var6 = class35.field545.method1499((byte) -124, 3);
            class168.field2932.method655(var6, true, (byte) -71);
            int var7 = class35.field545.method1499((byte) 108, 1);
            if (var7 == 1) {
                class44.field760[class106.field1877++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class35.field545.method1499((byte) 108, 1);
            if (var8 == 1) {
                class44.field760[class106.field1877++] = 2047;
            }
            int var9 = class35.field545.method1499((byte) 8, 1);
            int var10 = class35.field545.method1499((byte) -14, 7);
            int var11 = class35.field545.method1499((byte) -122, 7);
            class297.field5058 = class35.field545.method1499((byte) -3, 2);
            class168.field2932.method521(var9 == 1, var11, -1, var10);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V", line = 120)
    public static final void method2014(int arg0, int arg1) {
        field4898++;
        if (class61.field959 == arg1) {
            return;
        }
        if (class61.field959 == 0) {
            class273.method1907((byte) -104);
        }
        if (arg1 == 40) {
            class212.method1522(6127);
        }
        if (arg0 != 28) {
            return;
        }
        if (arg1 != 40 && class324.field5571 != null) {
            class324.field5571.method2085(true);
            class324.field5571 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class171.field2944 = 0;
            class83.field1478 = 0;
            class331.field5647 = 1;
            class272.field4582 = 1;
            class231.field3983 = 0;
            class143.method969((byte) -118, true);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 25 || arg1 == 10) {
            class267.method1886(103);
        }
        if (arg1 == 5) {
            class192.method1337(class182.field3117, (byte) -127);
        } else {
            class87.method609(50);
        }
        boolean var3 = class61.field959 == 5 || class61.field959 == 10 || class61.field959 == 28;
        if (var3 != var2) {
            if (var2) {
                class35.field569 = class63.field984;
                if (class284.field4771 == 0) {
                    class51.method367(2, 92);
                } else {
                    class43.method323(class33.field484, false, class63.field984, 0, 2, 255, (byte) 126);
                }
                class244.field4238.method1378(false, (byte) 77);
            } else {
                class51.method367(2, 87);
                class244.field4238.method1378(true, (byte) 77);
            }
        }
        if (class147.field2485 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class147.method1008();
        }
        class61.field959 = arg1;
    }
}
