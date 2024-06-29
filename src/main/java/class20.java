import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 extends class70 {

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[I")
    public static int[] field326 = new int[2048];

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lqf;")
    public static class117 field327 = class72.method514(104, "titlebutton");

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "Lqf;")
    public static class117 field331 = class72.method514(115, "(U5");

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static volatile int field328 = 0;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Lqf;")
    public static class117 field324 = class72.method514(120, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Lqf;")
    private static class117 field329 = class72.method514(121, "Prepared sound engine");

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "Lqf;")
    private static class117 field323 = class72.method514(120, "Loaded sprites");

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "Z")
    public static boolean field334 = false;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "Lqf;")
    public static class117 field333 = class72.method514(120, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Lqf;")
    public static class117 field330 = class72.method514(99, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Lqf;")
    public static class117 field316 = field329;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "Lqf;")
    public static class117 field317 = field323;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "Lqf;")
    private static class117 field337 = class72.method514(123, "Free world");

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Lqf;")
    public static class117 field319 = field337;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Lqf;")
    public class117 field321;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "[I")
    public static int[] field335;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "[Lec;")
    public static class32[] field336;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "[Lma;")
    public static class84[] field325;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static void method156(byte arg0) {
        field316 = null;
        field327 = null;
        field319 = null;
        field329 = null;
        field326 = null;
        field330 = null;
        field336 = null;
        field333 = null;
        field331 = null;
        if (arg0 >= -112) {
            field328 = 63;
        }
        field317 = null;
        field325 = null;
        field337 = null;
        field323 = null;
        field324 = null;
        field335 = null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public static final void method157(byte arg0) {
        field320++;
        if (class130.field3095[98]) {
            class58.field1193 += (12 - class58.field1193) / 2;
        } else if (class130.field3095[99]) {
            class58.field1193 += (-class58.field1193 - 12) / 2;
        } else {
            class58.field1193 /= 2;
        }
        class65.field1354 += class58.field1193 / 2;
        if (class130.field3095[96]) {
            class147.field3594 += (-class147.field3594 - 24) / 2;
        } else if (class130.field3095[97]) {
            class147.field3594 += (24 - class147.field3594) / 2;
        } else {
            class147.field3594 /= 2;
        }
        int var1 = class141.field3395.field1998 + class150.field3730;
        if (class65.field1354 < 128) {
            class65.field1354 = 128;
        }
        class128.field3035 = class147.field3594 / 2 + class128.field3035 & 0x7FF;
        if (arg0 >= -23) {
            field319 = null;
        }
        int var2 = class141.field3395.field1960 + class147.field3581;
        if (class29.field569 - var1 < -500 || class29.field569 - var1 > 500 || class70.field1481 - var2 < -500 || class70.field1481 - var2 > 500) {
            class70.field1481 = var2;
            class29.field569 = var1;
        }
        if (class29.field569 != var1) {
            class29.field569 += (var1 - class29.field569) / 16;
        }
        int var3 = class29.field569 >> 7;
        int var4 = 0;
        if (class65.field1354 > 383) {
            class65.field1354 = 383;
        }
        if (class70.field1481 != var2) {
            class70.field1481 += (var2 - class70.field1481) / 16;
        }
        int var5 = class70.field1481 >> 7;
        int var6 = class80.method626(class29.field569, class140.field3344, class70.field1481, -126);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class140.field3344;
                    if (var9 < 3 && (class73.field1606[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class64.field1306[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class135.field3244 < var11) {
            class135.field3244 += (var11 - class135.field3244) / 24;
        } else if (class135.field3244 > var11) {
            class135.field3244 += (var11 - class135.field3244) / 80;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I")
    public static final int method158(int arg0, int arg1, int arg2) {
        if (arg0 < 47) {
            return -23;
        }
        int var3 = class79.method611(4, -118, arg1 + 91923, arg2 - -45365) + (class79.method611(2, -101, arg1 + 37821, arg2 - -10294) - 128 >> 1) + (class79.method611(1, -108, arg1, arg2) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field322++;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
