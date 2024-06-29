import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 extends class64 {

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Lid;")
    private static class149 field473 = class60.method382("Loading world list data", (byte) 65);

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Lid;")
    public static class149 field474 = class60.method382(":clanreq:", (byte) 125);

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Z")
    public static boolean field481 = false;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Lid;")
    private static class149 field472 = class60.method382("", (byte) 110);

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "Lid;")
    public static class149 field475 = field473;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "[[I")
    public static int[][] field483 = new int[5][5000];

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lid;")
    public static class149 field478 = field472;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "[I")
    public static int[] field484 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "[[S")
    public static short[][] field485 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method189(int arg0) {
        field484 = null;
        if (arg0 > -66) {
            method189(-32);
        }
        field474 = null;
        field473 = null;
        field483 = null;
        field478 = null;
        field485 = null;
        field472 = null;
        field475 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z")
    public final boolean method190(int arg0, int arg1, int arg2) {
        field482++;
        if (arg2 != 16777215) {
            method191(-105);
        }
        return arg1 >= this.field479 && this.field476 >= arg1 && arg0 >= this.field480 && arg0 <= this.field468;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static final void method191(int arg0) {
        field471++;
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class47.field785[var1][var2] = 0;
            }
        }
        if (arg0 != 3658) {
            method192(63, -28);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
    public static final int method192(int arg0, int arg1) {
        if (arg0 != 22255) {
            field472 = null;
        }
        field477++;
        class219 var2 = class15.method94(arg0 + 9218, arg1);
        int var3 = var2.field3866;
        int var4 = var2.field3860;
        int var5 = var2.field3865;
        int var6 = class232.field4080[var5 - var4];
        return var6 & class115.field1953[var3] >> var4;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIII)V")
    public class32(int arg0, int arg1, int arg2, int arg3) {
        this.field468 = arg3;
        this.field479 = arg0;
        this.field476 = arg2;
        this.field480 = arg1;
    }
}
