import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class100 extends class35 {

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "Z")
    public boolean field1825 = false;

    @OriginalMember(owner = "client!ka", name = "ob", descriptor = "I")
    private int field1839 = 0;

    @OriginalMember(owner = "client!ka", name = "rb", descriptor = "I")
    private int field1842 = 0;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    private int field1824;

    @OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!ka", name = "sb", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "Lri;")
    private class178 field1831;

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "Lrd;")
    public static class173 field1836 = class133.method843("Lade Eingabe)2Steuerungsprogramm)3)3)3", 78);

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lrd;")
    private static class173 field1834 = class133.method843("flash3:", 108);

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lrd;")
    public static class173 field1830 = field1834;

    @OriginalMember(owner = "client!ka", name = "pb", descriptor = "Lrd;")
    public static class173 field1840 = field1834;

    @OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lrd;")
    public static class173 field1838 = class133.method843("cookiehost", 19);

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field1828 = 0;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
    public static int field1833 = -1;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ka", name = "tb", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ka", name = "ub", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lra;")
    public static class170 field1826;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
    public final void method613(int arg0, int arg1) {
        field1845++;
        if (this.field1825 || arg1 < 58) {
            return;
        }
        this.field1839 += arg0;
        while (this.field1839 > this.field1831.field3498[this.field1842]) {
            this.field1839 -= this.field1831.field3498[this.field1842];
            this.field1842++;
            if (this.field1831.field3496.length <= this.field1842) {
                this.field1825 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)Lvf;")
    public final class213 method274(int arg0) {
        if (arg0 != -32768) {
            field1828 = 77;
        }
        class123 var2 = class219.method1427(this.field1824, -88);
        field1829++;
        class213 var3;
        if (this.field1825) {
            var3 = var2.method790(-1, -114);
        } else {
            var3 = var2.method790(this.field1842, arg0 ^ 0xFFFF8041);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
    public static void method614(int arg0) {
        field1838 = null;
        field1836 = null;
        field1830 = null;
        field1826 = null;
        field1834 = null;
        field1840 = null;
        if (arg0 <= 13) {
            field1830 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILqc;Lqc;)V")
    public static final void method615(int arg0, class162 arg1, class162 arg2) {
        field1844++;
        if (class24.field526) {
            class150.method985(arg2, true, arg1);
            return;
        }
        if (class24.field525 == 0 || class24.field525 == 5) {
            byte var3 = 20;
            arg2.method543(class197.field3847, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class27.method207(230, var4, 304, 34, 9179409);
            class27.method207(231, var4 + 1, 302, 32, 0);
            class27.method219(232, var4 + 2, class87.field1696 * 3, 30, 9179409);
            class27.method219(class87.field1696 * 3 + 232, var4 + 2, 300 - class87.field1696 * 3, 30, 0);
            arg2.method543(class87.field1703, 382, 276 - var3, 16777215, -1);
        }
        if (arg0 != -20) {
            field1826 = null;
        }
        if (class24.field525 == 20) {
            class57.field1144.method291(382 - class57.field1144.field812 / 2, 271 - class57.field1144.field809 / 2);
            short var5 = 211;
            arg2.method543(class87.field1694, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method543(class87.field1693, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method543(class87.field1698, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method534(class173.method1158(-3, new class173[] { class99.field1798, class83.method520(class87.field1686) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method534(class173.method1158(-3, new class173[] { class145.field2725, class87.field1699.method1141(116) }), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class24.field525 == 10) {
            class57.field1144.method291(202, 171);
            if (class183.field3601 == 0) {
                short var6 = 251;
                arg2.method543(class71.field1379, 382, var6, 16776960, 0);
                short var7 = 302;
                short var8 = 291;
                class98.field1790.method291(var7 - 73, var8 - 20);
                int var27 = var6 + 30;
                arg2.method517(class43.field873, var7 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class98.field1790.method291(var9 - 73, var8 + -20);
                arg2.method517(class74.field1455, var9 - 73, var8 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class183.field3601 == 2) {
                short var10 = 321;
                short var11 = 211;
                arg2.method543(class87.field1694, 382, var11, 16776960, 0);
                int var30 = var11 + 15;
                arg2.method543(class87.field1693, 382, var30, 16776960, 0);
                short var12 = 302;
                int var31 = var30 + 15;
                arg2.method543(class87.field1698, 382, var31, 16776960, 0);
                boolean var13;
                if (class43.field879 == 0 && class217.field4203 % 40 < 20 && class135.field2556) {
                    var13 = true;
                } else {
                    var13 = false;
                }
                var30 = var31 + 15;
                var30 += 10;
                arg2.method534(class173.method1158(arg0 + 17, new class173[] { class99.field1798, class83.method520(class87.field1686), var13 ? class114.field2104 : class87.field1688 }), 272, var30, 16777215, 0);
                boolean var14;
                if (class43.field879 == 1 && class217.field4203 % 40 < 20 && class135.field2556) {
                    var14 = true;
                } else {
                    var14 = false;
                }
                var30 += 15;
                arg2.method534(class173.method1158(-3, new class173[] { class145.field2725, class87.field1699.method1141(arg0 + 145), var14 ? class114.field2104 : class87.field1688 }), 274, var30, 16777215, 0);
                var30 += 15;
                class98.field1790.method291(var12 - 73, var10 + -20);
                arg2.method543(class73.field1431, var12, var10 + 5, 16777215, 0);
                short var15 = 462;
                class98.field1790.method291(var15 - 73, var10 + -20);
                arg2.method543(class203.field3963, var15, var10 + 5, 16777215, 0);
            } else if (class183.field3601 == 3) {
                arg2.method543(class116.field2142, 382, 211, 16776960, 0);
                short var16 = 236;
                short var17 = 382;
                arg2.method543(class107.field2000, 382, var16, 16777215, 0);
                int var32 = var16 + 15;
                arg2.method543(class193.field3758, 382, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg2.method543(class92.field1737, 382, var33, 16777215, 0);
                short var18 = 321;
                int var34 = var33 + 15;
                arg2.method543(class17.field360, 382, var34, 16777215, 0);
                int var35 = var34 + 15;
                class98.field1790.method291(var17 - 73, var18 - 20);
                arg2.method543(class203.field3963, var17, var18 + 5, 16777215, 0);
            }
        }
        if (class48.field1022 != 1) {
            if (class121.field2258 > 0) {
                class120.method731(125, class121.field2258);
                class121.field2258 = 0;
            }
            class76.method469(false);
        }
        class109.field2036[class147.field2816 ? 1 : 0].method291(725, 463);
        if (class24.field525 <= 5 || class96.field1770 == 2 || class48.field1013 != 0) {
            return;
        }
        if (class92.field1742 == null) {
            class92.field1742 = class203.method1354(class145.field2700, (byte) 49, 0, class171.field3309);
        }
        if (class92.field1742 == null) {
            return;
        }
        byte var19 = 5;
        short var20 = 463;
        class92.field1742.method291(var19, var20);
        byte var21 = 100;
        byte var22 = 35;
        arg2.method543(class173.method1158(arg0 ^ 0x11, new class173[] { class103.field1915, class59.field1164, class93.method588(class133.field2521, true) }), var21 / 2 + var19, var22 / 2 + var20 + -2, 16777215, 0);
        if (class80.field1583 != null) {
            arg1.method543(class145.field2697, var21 / 2 + var19, var22 / 2 + var20 + 12, 16777215, 0);
            return;
        }
        arg1.method543(class13.field251, var19 + var21 / 2, var22 / 2 + var20 - -12, 16777215, 0);
        return;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public static final void method616(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; var5 < class67.field1297; var5++) {
            if (arg2 < class179.field3520[var5] + class167.field3215[var5] && class179.field3520[var5] < arg2 + arg3 && arg0 < class36.field776[var5] + class145.field2707[var5] && class36.field776[var5] < arg0 + arg4) {
                class70.field1373[var5] = true;
            }
        }
        field1832++;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIII)V")
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1824 = arg0;
        this.field1841 = arg4;
        this.field1827 = arg1;
        this.field1835 = arg2;
        this.field1843 = arg3;
        this.field1837 = arg5 + arg6;
        int var8 = class219.method1427(this.field1824, -101).field2307;
        if (var8 == -1) {
            this.field1825 = true;
        } else {
            this.field1825 = false;
            this.field1831 = class167.method1080(11098, var8);
        }
    }
}
