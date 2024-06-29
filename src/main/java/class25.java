import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class25 extends class22 {

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public int field622 = -1;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public int field629 = 0;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Lva;")
    private static class121 field623 = class107.method797("Please wait )2 attempting to reestablish", -10983);

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Lva;")
    public static class121 field628 = field623;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Lva;")
    public static class121 field625 = class107.method797("(Z", -10983);

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lva;")
    public static class121 field619 = class107.method797("compass", -10983);

    @OriginalMember(owner = "client!e", name = "M", descriptor = "[I")
    public static int[] field635 = new int[500];

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Z")
    public static boolean field630 = false;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "[Lrb;")
    public static class102[] field645 = new class102[4];

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field649 = 0;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "Lva;")
    private static class121 field648 = class107.method797("To create a new account you need to", -10983);

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Lva;")
    public static class121 field621 = field648;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Lbe;")
    public static class12 field644;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "[I")
    public static int[] field632;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 20)
    public static void method197(int arg0) {
        field632 = null;
        field648 = null;
        field628 = null;
        field625 = null;
        field621 = null;
        field619 = null;
        field623 = null;
        field635 = null;
        field644 = null;
        if (arg0 != -14531) {
            method202(10);
        }
        field645 = null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lm;", line = 57)
    public static final class72 method198(int arg0) {
        field620++;
        class72 var1 = new class72();
        var1.field1692 = class1.field12;
        var1.field1689 = field643;
        var1.field1693 = class116.field2643[arg0];
        var1.field1691 = class64.field1547[0];
        var1.field1696 = class107.field2450[0];
        var1.field1690 = class86.field1973[0];
        var1.field1694 = class28.field701;
        var1.field1695 = class57.field1320[0];
        class1.method5((byte) 48);
        return var1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V", line = 83)
    public static final void method199(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg1 << 16) + arg0);
        if (arg2 != 1) {
            field644 = null;
        }
        field634++;
        class58 var5 = (class58) class20.field527.method652(var3, -128);
        if (var5 != null) {
            class114.field2573.method518(var5, arg2 + 3);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZI)V", line = 109)
    public static final void method200(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        for (int var5 = arg1; var5 <= arg1 + arg0; var5++) {
            for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class20.field525[0][var6][var5] = 127;
                    if (arg2 == var6 && var6 > 0) {
                        class45.field1058[0][var6][var5] = class45.field1058[0][var6 - 1][var5];
                    }
                    if (arg2 + arg4 == var6 && var6 < 103) {
                        class45.field1058[0][var6][var5] = class45.field1058[0][var6 + 1][var5];
                    }
                    if (arg1 == var5 && var5 > 0) {
                        class45.field1058[0][var6][var5] = class45.field1058[0][var6][var5 - 1];
                    }
                    if (arg0 + arg1 == var5 && var5 < 103) {
                        class45.field1058[0][var6][var5] = class45.field1058[0][var6][var5 + 1];
                    }
                }
            }
        }
        field650++;
        if (arg3) {
            field636 = 64;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 164)
    public static final void method201(int arg0) {
        field638++;
        if (class5.field89 == null) {
            return;
        }
        if (class66.field1594 < arg0) {
            if (class97.field2164 > 0) {
                class97.field2164--;
                if (class97.field2164 == 0) {
                    if (class48.field1162 == null) {
                        class5.field89.method142(256, (byte) 50);
                    } else {
                        class5.field89.method142(class95.field2110, (byte) 50);
                        class66.field1594 = class95.field2110;
                        class5.field89.method139(class95.field2110, class48.field1162, 0, class66.field1591);
                        class48.field1162 = null;
                    }
                    class28.field711 = 0;
                }
            }
        } else if (class97.field2164 > 0) {
            class28.field711 += class77.field1791;
            class5.field89.method143(class66.field1594, class28.field711, (byte) -94);
            class97.field2164--;
            if (class97.field2164 == 0) {
                class5.field89.method140(true);
                class97.field2164 = 20;
                class66.field1594 = -1;
            }
        }
        class5.field89.method145(arg0 - 122);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 219)
    public static final void method202(int arg0) {
        field637++;
        if (class90.field2048 != 0) {
            return;
        }
        class21.field564[0] = class20.field536;
        class35.field844[0] = 1002;
        class26.field654 = 1;
        if (class63.field1525 != -1) {
            class108.field2453 = -1;
            class29.field766 = -1;
            class29.method230(0, 0, class34.field822, 0, 0, 765, -1, class63.field1525, true, 503, class19.field514);
            class127.field2915 = class29.field766;
            class8.field114 = class108.field2453;
            return;
        }
        class18.method149(-64);
        class108.field2453 = -1;
        boolean var1 = false;
        class29.field766 = -1;
        if (class34.field822 > 4 && class19.field514 > 4 && class34.field822 < 516 && class19.field514 < 338) {
            if (class26.field659 == -1) {
                class19.method174(false);
            } else {
                class29.method230(4, 0, class34.field822, 0, 4, 516, -1, class26.field659, true, 338, class19.field514);
            }
        }
        class8.field114 = class108.field2453;
        class108.field2453 = -1;
        class127.field2915 = class29.field766;
        class29.field766 = -1;
        if (class34.field822 > 553 && class19.field514 > 205 && class34.field822 < 743 && class19.field514 < 466) {
            if (class69.field1651 != -1) {
                class29.method230(205, 0, class34.field822, 1, 553, 743, -1, class69.field1651, true, 466, class19.field514);
            } else if (class42.field956[class28.field716] != -1) {
                class29.method230(205, 0, class34.field822, 1, 553, 743, -1, class42.field956[class28.field716], true, 466, class19.field514);
            }
        }
        if (class42.field985 != class108.field2453) {
            class97.field2168 = true;
            class42.field985 = class108.field2453;
        }
        class108.field2453 = -1;
        if (class29.field766 != class116.field2641) {
            class97.field2168 = true;
            class116.field2641 = class29.field766;
        }
        class29.field766 = -1;
        if (class34.field822 > 17 && class19.field514 > 357 && class34.field822 < 496 && class19.field514 < 453) {
            if (class90.field2038 != -1) {
                class29.method230(357, 0, class34.field822, 2, 17, 496, -1, class90.field2038, true, 453, class19.field514);
            } else if (class118.field2676 != -1) {
                class29.method230(357, 0, class34.field822, 3, 17, 496, -1, class118.field2676, true, 453, class19.field514);
            } else if (class19.field514 < 434 && class34.field822 < 426) {
                class127.method993(class19.field514 - 357, -109, class34.field822 - 17);
            }
        }
        if (arg0 <= 42) {
            return;
        }
        if ((class90.field2038 != -1 || class118.field2676 != -1) && class90.field2047 != class108.field2453) {
            class90.field2047 = class108.field2453;
            class9.field140 = true;
        }
        if ((class90.field2038 != -1 || class118.field2676 != -1) && class29.field766 != class21.field569) {
            class21.field569 = class29.field766;
            class9.field140 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class26.field654 - 1; var2++) {
                if (class35.field844[var2] < 1000 && class35.field844[var2 + 1] > 1000) {
                    var1 = false;
                    class121 var3 = class21.field564[var2];
                    class21.field564[var2] = class21.field564[var2 + 1];
                    class21.field564[var2 + 1] = var3;
                    int var4 = class35.field844[var2];
                    class35.field844[var2] = class35.field844[var2 + 1];
                    class35.field844[var2 + 1] = var4;
                    int var5 = class46.field1074[var2];
                    class46.field1074[var2] = class46.field1074[var2 + 1];
                    class46.field1074[var2 + 1] = var5;
                    int var6 = field635[var2];
                    field635[var2] = field635[var2 + 1];
                    field635[var2 + 1] = var6;
                    int var7 = class41.field933[var2];
                    class41.field933[var2] = class41.field933[var2 + 1];
                    class41.field933[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V", line = 364)
    public static final void method203(int arg0, int arg1) {
        if (arg1 <= 6) {
            field630 = false;
        }
        class61.field1478 = arg0;
        field626++;
    }
}
