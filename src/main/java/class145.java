import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class145 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field2021 = 0;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2025 = 0;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field2022 = -1;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2023 = "Prepared sound engine";

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[Lwf;")
    public static class333[] field2020;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIIZIIZ)V", line = 4)
    public static final void method1132(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field2027++;
        if (arg6) {
            class47.method362();
        }
        if (class117.field1519 != null && (arg5 != 3 || class330.field4838 != arg1 || class214.field3032 != arg4)) {
            class274.method1860(class157.field2216, class117.field1519, true);
            class117.field1519 = null;
        }
        if (arg5 == 3 && class117.field1519 == null) {
            class117.field1519 = class90.method649(0, arg1, arg4, 0, class157.field2216, 24139);
            if (class117.field1519 != null) {
                class330.field4838 = arg1;
                class214.field3032 = arg4;
                class122.method879(-25299, class157.field2216);
            }
        }
        if (arg5 == 3 && class117.field1519 == null) {
            method1132((byte) 49, -1, arg2, true, -1, class118.field1543, true);
            return;
        }
        Container var7;
        if (class117.field1519 != null) {
            var7 = class117.field1519;
        } else if (class288.field4173 == null) {
            var7 = class157.field2216.field883;
        } else {
            var7 = class288.field4173;
        }
        if (arg0 != 49) {
            return;
        }
        class95.field1246 = var7.getSize().width;
        class125.field1665 = var7.getSize().height;
        if (class288.field4173 == var7) {
            Insets var8 = class288.field4173.getInsets();
            class95.field1246 -= var8.right + var8.left;
            class125.field1665 -= var8.top + var8.bottom;
        }
        if (arg5 >= 2) {
            class66.field834 = 0;
            class163.field2314 = class95.field1246;
            class242.field3508 = 0;
            class192.field2660 = class125.field1665;
        } else {
            class242.field3508 = (class95.field1246 - 765) / 2;
            class163.field2314 = 765;
            class192.field2660 = 503;
            class66.field834 = 0;
        }
        if (arg3) {
            class100.method717((byte) -113, class26.field307);
            class143.method1118(class26.field307, 84);
            if (class270.field3877 != null) {
                class270.field3877.method1826(class26.field307, (byte) -64);
            }
            class277.field3969.method1953(true);
            class357.method2477(arg0 - 19, class26.field307);
            class143.method1110((byte) -87, class26.field307);
            if (class270.field3877 != null) {
                class270.field3877.method1827(class26.field307, true);
            }
        } else {
            if (class47.field623) {
                class47.method344(class163.field2314, class192.field2660);
            }
            class26.field307.setSize(class163.field2314, class192.field2660);
            if (class288.field4173 == var7) {
                Insets var9 = class288.field4173.getInsets();
                class26.field307.setLocation(class242.field3508 + var9.left, class66.field834 + var9.top);
            } else {
                class26.field307.setLocation(class242.field3508, class66.field834);
            }
        }
        if (arg5 == 0 && arg2 > 0) {
            class47.method368(class26.field307);
        }
        if (arg6 && arg5 > 0) {
            class26.field307.setIgnoreRepaint(true);
            if (!class290.field4193) {
                class56.method423();
                class283.field4035 = null;
                class283.field4035 = class9.method63((byte) -118, class192.field2660, class163.field2314, class26.field307);
                class37.method253();
                if (class316.field4661 == 5) {
                    class94.method686(true, class186.field2554, false);
                } else {
                    class190.method1383((byte) -90, class207.field2885, false);
                }
                try {
                    Graphics var10 = class26.field307.getGraphics();
                    class283.field4035.method320(0, var10, (byte) -125, 0);
                } catch (Exception var14) {
                }
                class186.method1349(-30965);
                if (arg2 == 0) {
                    class283.field4035 = class9.method63((byte) -97, 503, 765, class26.field307);
                } else {
                    class283.field4035 = null;
                }
                class188 var12 = class157.field2216.method495(-72, class277.field3969.getClass());
                while (var12.field2608 == 0) {
                    class177.method1299((byte) 64, 100L);
                }
                if (var12.field2608 == 1) {
                    class290.field4193 = true;
                }
            }
            if (class290.field4193) {
                class47.method380(class26.field307, class24.field266 * 2);
            }
        }
        if (!class47.field623 && arg5 > 0) {
            method1132((byte) 49, -1, arg2, true, -1, 0, true);
            return;
        }
        if (arg5 > 0 && arg2 == 0) {
            class333.field5061.setPriority(5);
            class283.field4035 = null;
            class332.method2317();
            ((class138) class350.field5467).method1045(200, (byte) -111);
            if (class67.field856) {
                class350.method2422(0.7F);
            }
            if (class25.field295 == null) {
                class25.field295 = new class80[13][13];
            }
            class22.method134(4, 104, 104);
            class151.method1155(104, 104);
            class219.method1583(0);
        } else if (arg5 == 0 && arg2 > 0) {
            class333.field5061.setPriority(1);
            class283.field4035 = class9.method63((byte) -115, 503, 765, class26.field307);
            class332.method2308();
            class187.method1353();
            ((class138) class350.field5467).method1045(20, (byte) -111);
            if (class67.field856) {
                if (class254.field3713 == 1) {
                    class350.method2422(0.9F);
                }
                if (class254.field3713 == 2) {
                    class350.method2422(0.8F);
                }
                if (class254.field3713 == 3) {
                    class350.method2422(0.7F);
                }
                if (class254.field3713 == 4) {
                    class350.method2422(0.6F);
                }
            }
            class70.method516();
            class219.method1583(0);
        }
        class116.field1498 = !class138.method1038(true);
        class187.method1368(class163.field2314, class192.field2660);
        if (arg6) {
            class327.method2263(11650);
        }
        if (arg5 < 2) {
            class212.field2996 = false;
        } else {
            class212.field2996 = true;
        }
        if (class233.field3340 != -1) {
            class313.method2169((byte) 71, true);
        }
        if (class265.field3848 != null && (class316.field4661 == 30 || class316.field4661 == 25)) {
            class321.method2226(false);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class229.field3276[var13] = true;
        }
        class116.field1500 = true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 247)
    public static void method1133(boolean arg0) {
        field2020 = null;
        if (!arg0) {
            method1132((byte) -14, 73, -89, true, 124, -84, true);
        }
        field2023 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public abstract void method937(int arg0, int arg1);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
    public abstract void method939(int arg0, int arg1, int arg2);
}
