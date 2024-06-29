import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class90 {

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1305 = "Loaded title screen";

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[I")
    public static int[] field1306 = new int[2];

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
    public static int[] field1302 = new int[25];

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "F")
    public static float field1303;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 4)
    public static final void method595(int arg0) {
        field1304++;
        for (class177 var1 = (class177) class41.field630.method1081(113); var1 != null; var1 = (class177) class41.field630.method1083((byte) 113)) {
            if (var1.field2767 > 0) {
                var1.field2767--;
            }
            if (var1.field2767 != 0) {
                if (var1.field2755 > 0) {
                    var1.field2755--;
                }
                if (var1.field2755 == 0 && var1.field2762 >= 1 && var1.field2772 >= 1 && var1.field2762 <= 102 && var1.field2772 <= 102 && (var1.field2761 < 0 || class314.method2253(var1.field2761, var1.field2770, (byte) 0))) {
                    class122.method794(var1.field2762, var1.field2763, var1.field2772, var1.field2770, var1.field2761, -10991, var1.field2760, var1.field2756);
                    var1.field2755 = -1;
                    if (var1.field2761 == var1.field2754 && var1.field2754 == -1) {
                        var1.method1131(8);
                    } else if (var1.field2761 == var1.field2754 && var1.field2763 == var1.field2759 && var1.field2771 == var1.field2770) {
                        var1.method1131(8);
                    }
                }
            } else if (var1.field2754 < 0 || class314.method2253(var1.field2754, var1.field2771, (byte) 7)) {
                class122.method794(var1.field2762, var1.field2759, var1.field2772, var1.field2771, var1.field2754, -10991, var1.field2760, var1.field2756);
                var1.method1131(8);
            }
        }
        if (arg0 >= -99) {
            field1305 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 69)
    public static final void method596(int arg0) {
        class216.field3325.method644((byte) -95);
        field1307++;
        if (arg0 != -1) {
            field1305 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I", line = 87)
    public static final int method597(int arg0) {
        field1301++;
        if (arg0 != 0) {
            return 52;
        }
        try {
            if (class221.field3387 == 0) {
                if (class268.field4410 > (class19.method122(-12169) - 5000L)) {
                    return 0;
                }
                class218.field3366 = class96.field1382.method1950(class228.field3581, class171.field2665, 120);
                class224.field3474 = class19.method122(-12169);
                class221.field3387 = 1;
            }
            if (class224.field3474 + 30000L < class19.method122(-12169)) {
                return class115.method752(1000, false);
            }
            if (class221.field3387 == 1) {
                if (class218.field3366.field2542 == 2) {
                    return class115.method752(1001, false);
                }
                if (class218.field3366.field2542 != 1) {
                    return -1;
                }
                class346.field5545 = new class102((Socket) class218.field3366.field2538, class96.field1382);
                class218.field3366 = null;
                class195.field2992.field5137 = 0;
                int var1 = 0;
                if (class25.field379) {
                    var1 = class101.field1460;
                }
                class195.field2992.method2193(23, false);
                class195.field2992.method2222(var1, arg0 ^ 0xFF);
                class346.field5545.method669(0, class195.field2992.field5124, class195.field2992.field5137, (byte) -103);
                if (class291.field4828 != null) {
                    class291.field4828.method1096(false);
                }
                if (class15.field199 != null) {
                    class15.field199.method1096(false);
                }
                int var2 = class346.field5545.method668(0);
                if (class291.field4828 != null) {
                    class291.field4828.method1096(false);
                }
                if (class15.field199 != null) {
                    class15.field199.method1096(false);
                }
                if (var2 != 0) {
                    return class115.method752(var2, false);
                }
                class221.field3387 = 2;
            }
            if (class221.field3387 == 2) {
                if (class346.field5545.method667(true) < 2) {
                    return -1;
                }
                class79.field1173 = class346.field5545.method668(0);
                class79.field1173 <<= 0x8;
                class79.field1173 += class346.field5545.method668(0);
                class221.field3387 = 3;
                class355.field5634 = new byte[class79.field1173];
                class217.field3343 = 0;
            }
            if (class221.field3387 != 3) {
                return -1;
            }
            int var3 = class346.field5545.method667(true);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class79.field1173 - class217.field3343)) {
                var3 = class79.field1173 - class217.field3343;
            }
            class346.field5545.method670(class217.field3343, class355.field5634, (byte) 18, var3);
            class217.field3343 += var3;
            if (class217.field3343 < class79.field1173) {
                return -1;
            } else if (class147.method1045(-2, class355.field5634)) {
                class105.field1524 = new class201[class249.field3967];
                int var4 = 0;
                for (int var5 = class198.field3043; var5 <= class270.field4451; var5++) {
                    class201 var6 = class161.method1138(var5, 2);
                    if (var6 != null) {
                        class105.field1524[var4++] = var6;
                    }
                }
                class346.field5545.method674((byte) -83);
                class221.field3387 = 0;
                class346.field5545 = null;
                class216.field3329 = 0;
                class355.field5634 = null;
                class268.field4410 = class19.method122(-12169);
                return 0;
            } else {
                return class115.method752(1002, false);
            }
        } catch (IOException var8) {
            return class115.method752(1003, false);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 231)
    public static void method598(byte arg0) {
        field1302 = null;
        field1305 = null;
        field1306 = null;
        if (arg0 < 12) {
            field1306 = (int[]) null;
        }
    }
}
