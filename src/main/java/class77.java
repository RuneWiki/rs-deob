import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class77 extends class212 {

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    private final int field1577;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    private final int field1573;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    private final int field1584;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    private final int field1574;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "[[[B")
    public static byte[][][] field1576 = new byte[4][104][104];

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "[Z")
    public static boolean[] field1581 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "[I")
    public static int[] field1580 = new int[2];

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Loh;")
    public static class263 field1571 = class253.method1681(-117, "Hierhin gehen");

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "[[[B")
    public static byte[][][] field1575;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public final void method522(int arg0, int arg1, int arg2) {
        if (arg1 <= -18) {
            ++field1578;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIII)V")
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1577 = arg3;
        this.field1573 = arg0;
        this.field1584 = arg2;
        this.field1574 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method523(int arg0) {
        class49.field1056.method830(50);
        if (arg0 != -26187) {
            field1575 = null;
        }
        ++field1583;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public static final void method524(int arg0) {
        while (true) {
            if (~class189.field3394.method1518(class36.field826, 8) <= -28) {
                int var1 = class189.field3394.method1512(15, 127);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class31.field774[var1] == null) {
                        var2 = true;
                        class31.field774[var1] = new class90();
                    }
                    class90 var3 = class31.field774[var1];
                    class117.field2191[class13.field345++] = var1;
                    var3.field4670 = class228.field4012;
                    if (var3.field1787 != null && var3.field1787.method1414((byte) -116)) {
                        class148.method974(var3, 104);
                    }
                    int var4 = class189.field3394.method1512(1, 126);
                    if (var4 == 1) {
                        class21.field627[class249.field4355++] = var1;
                    }
                    int var5 = class189.field3394.method1512(1, 126);
                    int var6 = class189.field3394.method1512(5, 127);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class189.field3394.method1512(5, 126);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.field1787 = class219.method1492(class189.field3394.method1512(14, 126), 8);
                    int var8 = class254.field4422[class189.field3394.method1512(3, 127)];
                    if (var2) {
                        var3.field4674 = var3.field4700 = var8;
                    }
                    var3.method1807(var3.field1787.field3694, 121);
                    var3.field4690 = var3.field1787.field3688;
                    var3.field4676 = var3.field1787.field3696;
                    var3.field4675 = var3.field1787.field3679;
                    var3.field4651 = var3.field1787.field3700;
                    var3.field4687 = var3.field1787.field3706;
                    var3.field4649 = var3.field1787.field3661;
                    var3.field4661 = var3.field1787.field3692;
                    var3.field4710 = var3.field1787.field3660;
                    if (~var3.field4710 == -1) {
                        var3.field4700 = 0;
                    }
                    var3.method1801((byte) -90, class229.field4018.field4714[0] + var6, class229.field4018.field4713[0] + var7, var3.method898(46), var5 == 1);
                    if (var3.field1787.method1414((byte) -116)) {
                        class128.method835(var3, var3.field4714[0], (class12) null, (class137) null, var3.field4713[0], class12.field321, 0, -102);
                    }
                    continue;
                }
            }
            class189.field3394.method1513(80);
            if (arg0 > -73) {
                method525(-117);
            }
            ++field1569;
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    public static void method525(int arg0) {
        if (arg0 == 4220) {
            field1580 = null;
            field1571 = null;
            field1575 = null;
            field1581 = null;
            field1576 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Z")
    public static final boolean method526(int arg0) {
        if (arg0 != -26670) {
            method530(-109, (class263) null);
        }
        ++field1570;
        return class1.field14;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
    public static final void method527(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class7.field120; ++var3) {
            for (int var4 = 0; var4 < class254.field4425; ++var4) {
                for (int var5 = 0; var5 < class85.field1678; ++var5) {
                    class2 var6 = class18.field417[var3][var4][var5];
                    if (var6 != null) {
                        class22 var7 = var6.field43;
                        if (var7 != null && var7.field633.method905()) {
                            class54.method342(var7.field633, var3, var4, var5, 1, 1);
                            if (var7.field641 != null && var7.field641.method905()) {
                                class54.method342(var7.field641, var3, var4, var5, 1, 1);
                                var7.field633.method909(var7.field641, 0, 0, 0, false);
                                var7.field641 = var7.field641.method910(arg0, arg1, arg2);
                            }
                            var7.field633 = var7.field633.method910(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field27; ++var8) {
                            class70 var10 = var6.field37[var8];
                            if (var10 != null && var10.field1398.method905()) {
                                class54.method342(var10.field1398, var3, var4, var5, var10.field1418 - var10.field1405 + 1, var10.field1413 - var10.field1403 + 1);
                                var10.field1398 = var10.field1398.method910(arg0, arg1, arg2);
                            }
                        }
                        class165 var9 = var6.field52;
                        if (var9 != null && var9.field3002.method905()) {
                            class156.method1023(var9.field3002, var3, var4, var5);
                            var9.field3002 = var9.field3002.method910(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)V")
    public final void method528(byte arg0, int arg1, int arg2) {
        int var4 = -25 / ((-6 - arg0) / 53);
        ++field1572;
        int var5 = this.field1584 * arg2 >> 12;
        int var6 = this.field1574 * arg1 >> 12;
        int var7 = this.field1573 * arg2 >> 12;
        int var8 = this.field1577 * arg1 >> 12;
        class233.method1563(var8, var6, super.field3788, super.field3793, (byte) -127, var5, super.field3784, var7);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public static final int method529(int arg0, int arg1) {
        ++field1568;
        if (arg1 != 0) {
            method525(36);
        }
        if (~arg0 <= -66 && arg0 <= 90 || ~arg0 <= -193 && arg0 <= 222 && ~arg0 != -216) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else {
            return arg0 == 140 ? 156 : arg0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILoh;)V")
    public static final void method530(int arg0, class263 arg1) {
        class276.field4835 = arg1;
        ++field1582;
        if (class95.field1867.field4557 != null) {
            try {
                class263 var2 = class182.field3297.method1776((byte) -63, class95.field1867.field4557);
                class263 var3 = class6.field115.method1776((byte) -89, class95.field1867.field4557);
                class263 var4 = class124.method797(-55, new class263[] { var2, class122.field2273, arg1, class3.field57, var3 });
                if (arg0 >= -61) {
                    method525(-4);
                }
                class263 var5;
                if (~arg1.method1740(-128) != -1) {
                    var5 = class124.method797(-104, new class263[] { var4, class163.field2961, class124.method794(-122, class25.method182(true) + 94608000000L), class8.field164, class98.method674(-25940, 94608000L) });
                } else {
                    var5 = class124.method797(-101, new class263[] { var4, class258.field4475 });
                }
                class124.method797(-118, new class263[] { class236.field4129, var5, class224.field3956 }).method1789(class95.field1867.field4557, (byte) -128);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZ)V")
    public final void method531(int arg0, int arg1, boolean arg2) {
        ++field1567;
        int var4 = this.field1573 * arg0 >> 12;
        int var5 = this.field1584 * arg0 >> 12;
        int var6 = this.field1574 * arg1 >> 12;
        if (!arg2) {
            method530(-44, (class263) null);
        }
        int var7 = this.field1577 * arg1 >> 12;
        class93.method653(var4, var6, super.field3793, var7, 115, var5);
    }
}
