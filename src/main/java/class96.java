import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class96 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Luf;")
    public static class168 field1532 = class148.method1019(-1720, ":tradereq:");

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[[I")
    public static int[][] field1537 = new int[104][104];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Z")
    public static volatile boolean field1534 = true;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Luf;")
    public static class168 field1538 = class148.method1019(-1720, "overlay2");

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Luf;")
    private static class168 field1539 = class148.method1019(-1720, "Select");

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Luf;")
    public static class168 field1533 = field1539;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Luf;")
    public static class168 field1541 = null;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lvf;")
    public static class30 field1530;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILkg;)V", line = 8)
    public static final void method729(int arg0, class22 arg1) {
        field1543++;
        for (class113 var2 = (class113) class14.field146.method442(65293); var2 != null; var2 = (class113) class14.field146.method440(3)) {
            if (var2.field1749 == arg1) {
                if (var2.field1770 != null) {
                    client.field4933.method1533(var2.field1770);
                    var2.field1770 = null;
                }
                var2.method124((byte) 24);
                return;
            }
        }
        if (arg0 <= 56) {
            method729(-61, (class22) null);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 41)
    public static final void method730(byte arg0) {
        class249.field4262.method726(145, 2138389379);
        field1540++;
        class249.field4262.method1053(0L, 11247);
        if (arg0 > -24) {
            method729(-65, (class22) null);
        }
        class19.field218++;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 56)
    public static void method731(byte arg0) {
        field1533 = null;
        if (arg0 != 51) {
            return;
        }
        field1530 = null;
        field1532 = null;
        field1539 = null;
        field1537 = (int[][]) null;
        field1538 = null;
        field1541 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZLjava/lang/Object;)[B", line = 80)
    public static final byte[] method732(boolean arg0, boolean arg1, Object arg2) {
        field1542++;
        if (arg2 == null) {
            return null;
        } else if ((arg2 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg2);
            return arg0 ? client.method2006(0, var4) : var4;
        } else if ((arg2 instanceof class39)) {
            class39 var3 = (class39) arg2;
            return var3.method216(75);
        } else {
            if (!arg1) {
                field1541 = (class168) null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BB)V", line = 116)
    public static final void method733(byte arg0, byte arg1) {
        field1544++;
        if (arg0 > -92) {
            field1534 = true;
        }
        if (class291.field4914 == null) {
            class291.field4914 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class291.field4914[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIZIZZ)Lwa;", line = 155)
    public static final class284 method734(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, boolean arg7) {
        field1531++;
        class238 var8 = class284.method1963((byte) 91, arg1);
        if (arg2 > 1 && var8.field3853 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field3851[var10] <= arg2 && var8.field3851[var10] != 0) {
                    var9 = var8.field3853[var10];
                }
            }
            if (var9 != -1) {
                var8 = class284.method1963((byte) 97, var9);
            }
        }
        class246 var11 = var8.method1601(true);
        if (var11 == null) {
            return null;
        }
        class49 var12 = null;
        if (var8.field3811 != -1) {
            var12 = (class49) method734(0, var8.field3861, 10, 1, true, 32, false, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3855 != -1) {
            var12 = (class49) method734(arg0, var8.field3821, arg2, arg3, false, 32, false, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class277.field4657;
        int var14 = class277.field4652;
        int var15 = class277.field4654;
        int[] var16 = new int[4];
        class277.method1912(var16);
        class49 var17 = new class49(36, arg5);
        class277.method1914(var17.field598, 36, 32);
        class173.method1242();
        class173.method1256(16, 16);
        int var18 = var8.field3841;
        class173.field2810 = false;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class173.field2812[var8.field3827] * var18 >> 16;
        int var20 = class173.field2818[var8.field3827] * var18 >> 16;
        var11.method707(0, var8.field3839, var8.field3825, var8.field3827, var8.field3826, var19 - (var11.method116() / 2 - var8.field3820), var8.field3820 + var20);
        if (arg3 >= 1) {
            var17.method280(1);
            if (arg3 >= 2) {
                var17.method280(16777215);
            }
            class277.method1914(var17.field598, 36, 32);
        }
        if (arg0 != 0) {
            var17.method267(arg0);
        }
        if (var8.field3811 != -1) {
            var12.method151(0, 0);
        } else if (var8.field3855 != -1) {
            class277.method1914(var12.field598, 36, 32);
            var17.method151(0, 0);
            var17 = var12;
        }
        if (arg6 && (var8.field3847 == 1 || arg2 != 1) && arg2 != -1) {
            class182.field2917.method193(class138.method954(33, arg2), 0, 9, 16776960, 1);
        }
        class277.method1914(var13, var14, var15);
        class277.method1907(var16);
        class173.method1242();
        class173.field2810 = true;
        return arg7 ? var17 : new class258(var17);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V", line = 304)
    public static final void method735(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 31) {
            return;
        }
        if (arg1 >= class150.field2331 && class65.field874 >= arg1) {
            int var5 = class54.method301(class44.field538, arg3, class9.field112, -58);
            int var6 = class54.method301(class44.field538, arg2, class9.field112, -48);
            class295.method2027(arg1, var6, var5, -124, arg0);
        }
        field1536++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 324)
    public static final void method736(int arg0) {
        field1535++;
        for (class117 var1 = (class117) class31.field369.method442(65293); var1 != null; var1 = (class117) class31.field369.method440(3)) {
            if (var1.field1831 > 0) {
                var1.field1831--;
            }
            if (var1.field1831 != 0) {
                if (var1.field1817 > 0) {
                    var1.field1817--;
                }
                if (var1.field1817 == 0 && var1.field1828 >= 1 && var1.field1829 >= 1 && var1.field1828 <= 102 && var1.field1829 <= 102 && (var1.field1832 < 0 || class111.method826(var1.field1832, -60, var1.field1833))) {
                    class241.method1644(var1.field1826, var1.field1833, -1, var1.field1832, var1.field1828, var1.field1825, var1.field1827, var1.field1829);
                    var1.field1817 = -1;
                    if (var1.field1832 == var1.field1816 && var1.field1816 == -1) {
                        var1.method124((byte) 30);
                    } else if (var1.field1832 == var1.field1816 && var1.field1825 == var1.field1823 && var1.field1833 == var1.field1819) {
                        var1.method124((byte) 93);
                    }
                }
            } else if (var1.field1816 < 0 || class111.method826(var1.field1816, arg0 + 118, var1.field1819)) {
                class241.method1644(var1.field1826, var1.field1819, -1, var1.field1816, var1.field1828, var1.field1823, var1.field1827, var1.field1829);
                var1.method124((byte) 77);
            }
        }
        if (arg0 != -1) {
            field1538 = (class168) null;
        }
    }
}
