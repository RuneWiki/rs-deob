import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class194 extends class60 {

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[[S")
    public static short[][] field3306 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Lub;")
    public static class227 field3299 = class257.method1749("::rebuild", 17263);

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Lub;")
    public static class227 field3298 = class257.method1749(")1 ", 17263);

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public int field3300;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Lub;")
    public class227 field3302;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Lnh;")
    public static class57 field3304;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "[Lub;")
    public class227[] field3309;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public static void method1231(byte arg0) {
        field3304 = null;
        field3306 = null;
        field3299 = null;
        field3298 = null;
        if (arg0 < 1) {
            method1232((byte) -48);
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    public static final void method1232(byte arg0) {
        if (class24.field409 < 128) {
            class24.field409 = 128;
        }
        field3307++;
        int var1 = class251.field4349 >> 7;
        if (class24.field409 > 383) {
            class24.field409 = 383;
        }
        if (arg0 < 9) {
            method1231((byte) 58);
        }
        class29.field476 &= 0x7FF;
        int var2 = 0;
        int var3 = class54.field936 >> 7;
        int var4 = class193.method1227(class54.field936, true, class64.field1171, class251.field4349);
        if (var3 > 3 && var1 > 3 && var3 < 100 && var1 < 100) {
            for (int var5 = var3 - 4; var5 <= var3 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                    int var7 = class64.field1171;
                    if (var7 < 3 && (class40.field654[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class98.field1717[var7][var5][var6];
                    if (var2 < var8) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class59.field1093 < var9) {
            class59.field1093 += (var9 - class59.field1093) / 24;
        } else if (class59.field1093 > var9) {
            class59.field1093 += (var9 - class59.field1093) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static final void method1233(int arg0) {
        if (arg0 != 24466) {
            method1231((byte) -3);
        }
        field3305++;
        class60.field1114.method1723(-4173);
        class59.field1090.method1723(-4173);
        class254.field4472.method1723(-4173);
    }
}
