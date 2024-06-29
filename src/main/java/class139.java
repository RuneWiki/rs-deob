import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class139 {

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public int field3315 = -1;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lqf;")
    private static class117 field3307 = class72.method514(110, "Choose Option");

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lqf;")
    private static class117 field3296 = class72.method514(127, "flash1:");

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lqf;")
    public static class117 field3297 = class72.method514(107, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lqf;")
    public static class117 field3302 = field3296;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lqf;")
    public static class117 field3295 = field3307;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Lqf;")
    public static class117 field3301 = field3296;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lqf;")
    public static class117 field3311 = class72.method514(124, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Z")
    public static boolean field3310 = false;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field3306 = 1;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Z")
    public static boolean field3314 = false;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lqf;")
    public static class117 field3316 = class72.method514(115, "mapscene");

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
    public static int[] field3300 = new int[2000];

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field3318 = 0;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lqf;")
    public static class117 field3317 = class72.method514(103, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lqf;")
    public static class117 field3313 = class72.method514(102, "p11_full");

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lqf;")
    public static class117 field3319 = class72.method514(118, "Versteckt");

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Ljb;")
    public static class64 field3308;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Ljc;")
    public class65 field3312;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    public int[] field3294;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[Lqf;")
    public class117[] field3303;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field3308 = null;
        field3311 = null;
        if (arg0 != -1) {
            method1081(22, -77, null, 70, null, true, 118);
        }
        field3296 = null;
        field3307 = null;
        field3301 = null;
        field3300 = null;
        field3313 = null;
        field3302 = null;
        field3317 = null;
        field3316 = null;
        field3295 = null;
        field3297 = null;
        field3319 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILqf;ILqf;ZI)V")
    public static final void method1081(int arg0, int arg1, class117 arg2, int arg3, class117 arg4, boolean arg5, int arg6) {
        if (!arg5) {
            field3311 = null;
        }
        field3298++;
        if (class27.field531 >= 500) {
            return;
        }
        if (arg2.method915(27) <= 0) {
            class82.field1884[class27.field531] = arg4;
        } else {
            class82.field1884[class27.field531] = class73.method530((byte) -83, new class117[] { arg4, class102.field2464, arg2 });
        }
        class3.field54[class27.field531] = arg1;
        class60.field1197[class27.field531] = arg6;
        class107.field2552[class27.field531] = arg0;
        class136.field3255[class27.field531] = arg3;
        class27.field531++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljb;Ljb;Ljb;ZLud;)Z")
    public static final boolean method1082(class64 arg0, class64 arg1, class64 arg2, boolean arg3, class141 arg4) {
        class36.field771 = arg4;
        if (arg3) {
            return false;
        }
        class103.field2491 = arg0;
        field3308 = arg2;
        class121.field2880 = arg1;
        field3309++;
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static final void method1083(boolean arg0) {
        if (!arg0) {
            field3319 = null;
        }
        field3305++;
        class8.field129.method537((byte) -91);
        for (int var1 = 0; var1 < 32; var1++) {
            class85.field1930[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class81.field1844[var2] = 0L;
        }
        class77.field1729 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
    public static final int method1084(int arg0) {
        field3299++;
        if (arg0 != 2000) {
            method1084(64);
        }
        int var1 = 3;
        if (class77.field1722 < 310) {
            int var2 = class87.field1959 >> 7;
            int var3 = class141.field3395.field1960 >> 7;
            int var4 = class141.field3395.field1998 >> 7;
            int var5 = class117.field2813 >> 7;
            int var6;
            if (var5 < var3) {
                var6 = var3 - var5;
            } else {
                var6 = var5 - var3;
            }
            int var7;
            if (var4 <= var2) {
                var7 = var2 - var4;
            } else {
                var7 = var4 - var2;
            }
            if ((class73.field1606[class140.field3344][var2][var5] & 0x4) != 0) {
                var1 = class140.field3344;
            }
            if (var7 > var6) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class73.field1606[class140.field3344][var2][var5] & 0x4) != 0) {
                        var1 = class140.field3344;
                    }
                    var9 += var8;
                    if (var9 >= 65536) {
                        if (var3 > var5) {
                            var5++;
                        } else if (var3 < var5) {
                            var5--;
                        }
                        var9 -= 65536;
                        if ((class73.field1606[class140.field3344][var2][var5] & 0x4) != 0) {
                            var1 = class140.field3344;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var7 * 65536 / var6;
                while (var3 != var5) {
                    var10 += var11;
                    if (var5 < var3) {
                        var5++;
                    } else if (var3 < var5) {
                        var5--;
                    }
                    if ((class73.field1606[class140.field3344][var2][var5] & 0x4) != 0) {
                        var1 = class140.field3344;
                    }
                    if (var10 >= 65536) {
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        var10 -= 65536;
                        if ((class73.field1606[class140.field3344][var2][var5] & 0x4) != 0) {
                            var1 = class140.field3344;
                        }
                    }
                }
            }
        }
        if ((class73.field1606[class140.field3344][class141.field3395.field1998 >> 7][class141.field3395.field1960 >> 7] & 0x4) != 0) {
            var1 = class140.field3344;
        }
        return var1;
    }
}
