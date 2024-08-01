import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fh")
public class class59 {

    @OriginalMember(owner = "fh", name = "b", descriptor = "Llf;")
    public static class109 field1166 = class35.method275("Cabbage", 2);

    @OriginalMember(owner = "fh", name = "d", descriptor = "I")
    public static int field1168 = -1;

    @OriginalMember(owner = "fh", name = "h", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "fh", name = "a", descriptor = "Lrc;")
    public static class160 field1165 = new class160(64);

    @OriginalMember(owner = "fh", name = "c", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "fh", name = "e", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "fh", name = "f", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "fh", name = "g", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "fh", name = "i", descriptor = "[I")
    public static int[] field1173;

    @OriginalMember(owner = "fh", name = "a", descriptor = "(I)V")
    public static void method387(int arg0) {
        field1166 = null;
        field1173 = null;
        field1165 = null;
        if (arg0 != 1) {
            field1173 = null;
        }
    }

    @OriginalMember(owner = "fh", name = "a", descriptor = "(Z)V")
    public static final void method388(boolean arg0) {
        while (true) {
            if (class95.field1934.method1340(class204.field4006, (byte) 79) >= 27) {
                int var1 = class95.field1934.method1341((byte) 121, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class183.field3444[var1] == null) {
                        class183.field3444[var1] = new class139();
                        var2 = true;
                    }
                    class139 var3 = class183.field3444[var1];
                    class1.field8[class1.field10++] = var1;
                    var3.field3613 = class143.field2754;
                    int var4 = class95.field1934.method1341((byte) 68, 1);
                    int var5 = class95.field1934.method1341((byte) 65, 1);
                    if (var5 == 1) {
                        class102.field2018[class98.field1967++] = var1;
                    }
                    int var6 = class95.field1934.method1341((byte) 71, 5);
                    int var7 = class184.field3462[class95.field1934.method1341((byte) 98, 3)];
                    if (var2) {
                        var3.field3600 = var3.field3556 = var7;
                    }
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var8 = class95.field1934.method1341((byte) 127, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field2691 = class192.method1290((byte) -99, class95.field1934.method1341((byte) 116, 14));
                    var3.field3612 = var3.field2691.field3175;
                    var3.field3603 = var3.field2691.field3182;
                    var3.field3569 = var3.field2691.field3155;
                    var3.field3544 = var3.field2691.field3190;
                    var3.field3548 = var3.field2691.field3174;
                    var3.field3574 = var3.field2691.field3166;
                    var3.field3559 = var3.field2691.field3172;
                    var3.field3566 = var3.field2691.field3187;
                    if (var3.field3566 == 0) {
                        var3.field3556 = 0;
                    }
                    var3.field3616 = var3.field2691.field3169;
                    var3.method1268(true, class157.field2955.field3567[0] + var6, var4 == 1, class157.field2955.field3547[0] + var8);
                    continue;
                }
            }
            if (arg0) {
                field1173 = null;
            }
            class95.field1934.method1337(true);
            field1167++;
            return;
        }
    }

    @OriginalMember(owner = "fh", name = "a", descriptor = "(II)I")
    public static final int method389(int arg0, int arg1) {
        int var2 = 0;
        field1170++;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg0 >= ~arg1) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "fh", name = "b", descriptor = "(II)V")
    public static final void method390(int arg0, int arg1) {
        class67.field1303 = arg1;
        field1171++;
        if (arg0 > -83) {
            method389(52, 78);
        }
    }

    @OriginalMember(owner = "fh", name = "a", descriptor = "(ZB)V")
    public static final void method391(boolean arg0, byte arg1) {
        field1169++;
        int var2 = 85 % ((arg1 + 75) / 48);
        class190.method1285((byte) 100);
        class206.field4053++;
        if (class206.field4053 < 50 && !arg0) {
            return;
        }
        class206.field4053 = 0;
        if (class4.field48 || class55.field1114 == null) {
            return;
        }
        class200.field3850.method1339((byte) 106, 20);
        try {
            class55.field1114.method908(-58, 0, class200.field3850.field1773, class200.field3850.field1808);
            class200.field3850.field1773 = 0;
        } catch (IOException var3) {
            class4.field48 = true;
        }
        class24.field531++;
    }
}
