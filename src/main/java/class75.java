import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lec;")
    public static class32 field1756 = class73.method594(" )2> <col=ffff00>", true);

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lec;")
    public static class32 field1769 = class73.method594("<img=1>", true);

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1759 = 0;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lec;")
    public static class32 field1758 = class73.method594("Fehler bei der Verbindung zum Server)3", true);

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lec;")
    public static class32 field1770 = class73.method594(")1", true);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    public static int[] field1760 = new int[4000];

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Ldd;")
    public class26 field1771;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIBI)V")
    public static final void method603(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class141.method1068(arg1, arg4, arg0 + arg1, arg2 + arg4);
        class7.method36();
        field1761++;
        class159.field3660++;
        class15.method103(true, (byte) -35);
        class62.method469(14612, true);
        class15.method103(false, (byte) -35);
        class62.method469(14612, false);
        class142.method1078((byte) 80);
        class102.method829(0);
        if (!class23.field418) {
            int var5 = class133.field3084;
            int var6 = class133.field3056 + class11.field173 & 0x7FF;
            if (var5 < class26.field469 / 256) {
                var5 = class26.field469 / 256;
            }
            if (class33.field700[4] && var5 < class124.field2885[4] + 128) {
                var5 = class124.field2885[4] + 128;
            }
            class143.method1079(var6, class83.method654(-5736, class43.field990, class20.field373.field2749, class20.field373.field2700) - 50, -24253, var5 * 3 + 600, class57.field1320, var5, class107.field2538);
        }
        int var7;
        if (class23.field418) {
            var7 = class50.method393(-21211);
        } else {
            var7 = class5.method21(3);
        }
        int var8 = class105.field2496;
        int var9 = class48.field1127;
        int var10 = class45.field1050;
        int var11 = class73.field1720;
        int var12 = class115.field2720;
        if (arg3 < 114) {
            field1756 = null;
        }
        for (int var13 = 0; var13 < 5; var13++) {
            if (class33.field700[var13]) {
                int var16 = (int) ((double) -class114.field2655[var13] + (double) (class114.field2655[var13] * 2 + 1) * Math.random() + Math.sin((double) class145.field3296[var13] / 100.0D * (double) class17.field351[var13]) * (double) class124.field2885[var13]);
                if (var13 == 4) {
                    class45.field1050 += var16;
                    if (class45.field1050 < 128) {
                        class45.field1050 = 128;
                    }
                    if (class45.field1050 > 383) {
                        class45.field1050 = 383;
                    }
                }
                if (var13 == 3) {
                    class115.field2720 = class115.field2720 + var16 & 0x7FF;
                }
                if (var13 == 1) {
                    class73.field1720 += var16;
                }
                if (var13 == 2) {
                    class48.field1127 += var16;
                }
                if (var13 == 0) {
                    class105.field2496 += var16;
                }
            }
        }
        int var14 = class86.field2002;
        int var15 = class140.field3218;
        if (var14 >= arg1 && arg0 + arg1 > var14 && var15 >= arg4 && arg2 + arg4 > var15) {
            class101.field2384 = 0;
            class101.field2364 = class86.field2002 - arg1;
            class101.field2365 = class140.field3218 - arg4;
            class101.field2375 = true;
        } else {
            class101.field2375 = false;
            class101.field2384 = 0;
        }
        class125.method982(-7);
        class141.method1055(arg1, arg4, arg0, arg2, 0);
        class125.method982(-7);
        class159.field3659.method1169(class105.field2496, class73.field1720, class48.field1127, class45.field1050, class115.field2720, var7);
        class125.method982(-7);
        class159.field3659.method1137();
        class56.method440((byte) -87, arg2, arg4, arg1, arg0);
        class63.method484(arg1, arg4, 28);
        ((class140) class7.field126).method1051((byte) 107, class54.field1283);
        class17.method129(arg4, arg2, 12504, arg1, arg0);
        class105.field2496 = var8;
        class48.field1127 = var9;
        class73.field1720 = var11;
        class45.field1050 = var10;
        class115.field2720 = var12;
        if (class88.field2034 && class34.method294(true, false, -20683) == 0) {
            class88.field2034 = false;
        }
        if (class88.field2034) {
            class141.method1055(arg1, arg4, arg0, arg2, 0);
            class14.method72(class48.field1136, 16777215, false);
        }
        if (!class88.field2034 && !class26.field476 && var14 >= arg1 && var14 < arg0 + arg1 && arg4 <= var15 && arg4 + arg2 > var15) {
            class86.method664(var14, -1, arg4, arg1, var15);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILhd;III)V")
    public static final void method604(int arg0, int arg1, class53 arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -4) {
            method606(106);
        }
        field1764++;
        class98 var6 = new class98();
        var6.field2278 = arg5 * 128;
        var6.field2277 = arg2.field1257;
        var6.field2258 = arg4 * 128;
        var6.field2251 = arg2.field1251;
        var6.field2247 = arg2.field1219;
        int var7 = arg2.field1223;
        var6.field2253 = arg3;
        var6.field2262 = arg2.field1241 * 128;
        var6.field2246 = arg2.field1260;
        int var8 = arg2.field1234;
        if (arg1 == 1 || arg1 == 3) {
            var8 = arg2.field1223;
            var7 = arg2.field1234;
        }
        var6.field2250 = (arg5 + var8) * 128;
        var6.field2257 = (arg4 + var7) * 128;
        if (arg2.field1252 != null) {
            var6.field2252 = arg2;
            var6.method769(13492);
        }
        class63.field1467.method1216(var6, (byte) 45);
        if (var6.field2247 != null) {
            var6.field2271 = (int) ((double) (var6.field2251 - var6.field2246) * Math.random()) + var6.field2246;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)V")
    public static final void method605(boolean arg0, int arg1) {
        class139.field3211 = arg1;
        if (arg0) {
            field1766 = 96;
        }
        field1763++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method606(int arg0) {
        field1770 = null;
        field1758 = null;
        if (arg0 != 256) {
            field1766 = -67;
        }
        field1756 = null;
        field1769 = null;
        field1760 = null;
    }
}
