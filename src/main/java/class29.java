import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 {

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lod;")
    public static class101 field764 = class46.method335(113, "Hidden)2");

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[J")
    public static long[] field768 = new long[100];

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lud;")
    public static class143 field766 = new class143(4096);

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lod;")
    private static class101 field773 = class46.method335(-85, "glow2:");

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lod;")
    public static class101 field769 = field773;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field774 = 0;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lod;")
    public static class101 field770 = class46.method335(126, "(U2");

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lod;")
    public static class101 field771 = field773;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static final void method228(byte arg0) {
        class137.field3128 = new byte[4][104][104];
        class115.field2562 = new int[104];
        class138.field3182 = new int[4][105][105];
        field767++;
        class35.field894 = new int[105][105];
        if (arg0 >= -50) {
            field770 = null;
        }
        class23.field530 = new int[104];
        class65.field1470 = new int[104];
        class34.field859 = 99;
        class11.field202 = new byte[4][104][104];
        class43.field1036 = new int[104];
        class144.field3329 = new byte[4][104][104];
        class63.field1404 = new byte[4][104][104];
        class56.field1262 = new int[104];
        class83.field1807 = new byte[4][105][105];
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public static void method229(byte arg0) {
        field766 = null;
        field769 = null;
        field768 = null;
        field773 = null;
        field771 = null;
        field764 = null;
        int var1 = -37 / ((47 - arg0) / 38);
        field770 = null;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
    public static final void method230(byte arg0) {
        if (arg0 != -112) {
            return;
        }
        field762++;
        for (class156 var1 = (class156) class17.field345.method523(false); var1 != null; var1 = (class156) class17.field345.method527(true)) {
            if (var1.field3595 > 0) {
                var1.field3595--;
            }
            if (var1.field3595 != 0) {
                if (var1.field3589 > 0) {
                    var1.field3589--;
                }
                if (var1.field3589 == 0 && var1.field3582 >= 1 && var1.field3593 >= 1 && var1.field3582 <= 102 && var1.field3593 <= 102 && (var1.field3586 < 0 || class47.method336(var1.field3586, var1.field3581, -113))) {
                    class64.method441(var1.field3585, var1.field3593, (byte) -1, var1.field3591, var1.field3581, var1.field3590, var1.field3586, var1.field3582);
                    var1.field3589 = -1;
                    if (var1.field3594 == var1.field3586 && var1.field3594 == -1) {
                        var1.method959(11835);
                    } else if (var1.field3594 == var1.field3586 && var1.field3591 == var1.field3583 && var1.field3592 == var1.field3581) {
                        var1.method959(11835);
                    }
                }
            } else if (var1.field3594 < 0 || class47.method336(var1.field3594, var1.field3592, arg0 ^ 0x1E)) {
                class64.method441(var1.field3585, var1.field3593, (byte) -1, var1.field3583, var1.field3592, var1.field3590, var1.field3594, var1.field3582);
                var1.method959(11835);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
    public static final void method231(byte arg0) {
        field765++;
        class93.field1999 = new class143(32);
        int var1 = -110 % ((arg0 + 63) / 42);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLia;)V")
    public static final void method232(byte arg0, class57 arg1) {
        field761++;
        if (arg1.field1279 == 0) {
            return;
        }
        if (arg1.field1339 != -1 && arg1.field1339 < 32768) {
            class62 var2 = class18.field376[arg1.field1339];
            if (var2 != null) {
                int var3 = arg1.field1341 - var2.field1341;
                int var4 = arg1.field1298 - var2.field1298;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1307 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1339 >= 32768) {
            int var5 = arg1.field1339 - 32768;
            if (class115.field2542 == var5) {
                var5 = 2047;
            }
            class13 var6 = class94.field2032[var5];
            if (var6 != null) {
                int var7 = arg1.field1341 - var6.field1341;
                int var8 = arg1.field1298 - var6.field1298;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1307 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1270 != 0 || arg1.field1306 != 0) && (arg1.field1333 == 0 || arg1.field1276 > 0)) {
            int var9 = arg1.field1341 - (arg1.field1270 - class56.field1260 - class56.field1260) * 64;
            int var10 = arg1.field1298 - (arg1.field1306 - class75.field1597 - class75.field1597) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field1307 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1306 = 0;
            arg1.field1270 = 0;
        }
        int var11 = arg1.field1307 - arg1.field1310 & 0x7FF;
        if (arg0 != -44) {
            return;
        }
        if (var11 == 0) {
            arg1.field1284 = 0;
            return;
        }
        arg1.field1284++;
        if (var11 <= 1024) {
            arg1.field1310 += arg1.field1279;
            boolean var12 = true;
            if (var11 < arg1.field1279 || 2048 - arg1.field1279 < var11) {
                var12 = false;
                arg1.field1310 = arg1.field1307;
            }
            if (arg1.field1289 == arg1.field1278 && (arg1.field1284 > 25 || var12)) {
                if (arg1.field1335 == -1) {
                    arg1.field1278 = arg1.field1302;
                } else {
                    arg1.field1278 = arg1.field1335;
                }
            }
        } else {
            arg1.field1310 -= arg1.field1279;
            boolean var13 = true;
            if (var11 < arg1.field1279 || 2048 - arg1.field1279 < var11) {
                arg1.field1310 = arg1.field1307;
                var13 = false;
            }
            if (arg1.field1289 == arg1.field1278 && (arg1.field1284 > 25 || var13)) {
                if (arg1.field1292 == -1) {
                    arg1.field1278 = arg1.field1302;
                } else {
                    arg1.field1278 = arg1.field1292;
                }
            }
        }
        arg1.field1310 &= 0x7FF;
    }
}
