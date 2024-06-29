import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class155 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2502 = -1;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
    public static int[] field2500 = new int[4];

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2506 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lqj;")
    public static class147 field2509;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2511;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2510;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[Lml;")
    public static class289[] field2505;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class36 var7 = class230.method1612(1, arg5, arg0);
        if (var7 != null && var7.field592 != null) {
            class213 var8 = new class213();
            var8.field3477 = var7.field592;
            var8.field3480 = var7;
            class89.method645(-114, var8);
        }
        class138.field2268 = arg6;
        field2504++;
        class35.field543 = arg3;
        class212.field3473 = arg4;
        class67.field1111 = arg2;
        class281.field4452 = arg5;
        class253.field4032 = arg0;
        class288.field4560 = true;
        class280.method1886(var7, arg1 ^ 0xF4260);
        if (arg1 != 1000000) {
            method1079(false);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        field2499++;
        if (class52.method399(-73) != 2) {
            return;
        }
        byte var1 = (byte) (class209.field3423 - 4 & 0xFF);
        int var2 = class209.field3423 % 104;
        int var3 = -68 / ((arg0 + 34) / 34);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class227.field3766[var4][var2][var17] = var1;
            }
        }
        if (class250.field3980 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class39.field741[var5] = -1000000;
            class129.field2083[var5] = 1000000;
            class5.field67[var5] = 0;
            class32.field501[var5] = 1000000;
            class29.field471[var5] = 0;
        }
        if (class229.field3786 != 1) {
            int var6 = class225.method1583(class99.field1625, class54.field925, class250.field3980, 0);
            if (var6 - class17.field301 < 800 && (class201.field3198[class250.field3980][class54.field925 >> 7][class99.field1625 >> 7] & 0x4) != 0) {
                class275.method1855(5373952, class54.field925 >> 7, class288.field4563, class99.field1625 >> 7, false, 1);
                return;
            }
            return;
        }
        if ((class201.field3198[class250.field3980][class167.field2655.field3389 >> 7][class167.field2655.field3341 >> 7] & 0x4) != 0) {
            class275.method1855(5373952, class167.field2655.field3389 >> 7, class288.field4563, class167.field2655.field3341 >> 7, false, 0);
        }
        if (class200.field3187 >= 310) {
            return;
        }
        int var7 = class54.field925 >> 7;
        int var8 = class99.field1625 >> 7;
        int var9 = class167.field2655.field3389 >> 7;
        int var10 = class167.field2655.field3341 >> 7;
        int var11;
        if (var7 >= var9) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        int var12;
        if (var8 >= var10) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        if (var12 >= var11) {
            int var13 = var11 * 65536 / var12;
            int var14 = 32768;
            while (var8 != var10) {
                if (var10 > var8) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class201.field3198[class250.field3980][var7][var8] & 0x4) != 0) {
                    class275.method1855(5373952, var7, class288.field4563, var8, false, 1);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var7 < var9) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    var14 -= 65536;
                    if ((class201.field3198[class250.field3980][var7][var8] & 0x4) != 0) {
                        class275.method1855(5373952, var7, class288.field4563, var8, false, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var15 = 32768;
        int var16 = var12 * 65536 / var11;
        while (var7 != var9) {
            if (var9 > var7) {
                var7++;
            } else if (var9 < var7) {
                var7--;
            }
            if ((class201.field3198[class250.field3980][var7][var8] & 0x4) != 0) {
                class275.method1855(5373952, var7, class288.field4563, var8, false, 1);
                return;
            }
            var15 += var16;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class201.field3198[class250.field3980][var7][var8] & 0x4) != 0) {
                    class275.method1855(5373952, var7, class288.field4563, var8, false, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
    public static final void method1078(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2501++;
        class239 var5 = (class239) class214.field3502.method1400((long) arg0, true);
        if (var5 == null) {
            var5 = new class239();
            class214.field3502.method1399(7292, var5, (long) arg0);
        }
        if (arg4 >= var5.field3880.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field3880.length; var8++) {
                var6[var8] = var5.field3880[var8];
                var7[var8] = var5.field3879[var8];
            }
            for (int var9 = var5.field3880.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3880 = var6;
            var5.field3879 = var7;
        }
        var5.field3880[arg4] = arg3;
        if (arg1 == 0) {
            var5.field3879[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public static void method1079(boolean arg0) {
        field2505 = null;
        field2510 = null;
        field2500 = null;
        field2509 = null;
        if (!arg0) {
            field2511 = null;
            field2506 = null;
        }
    }
}
