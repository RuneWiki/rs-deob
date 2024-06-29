import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class110 extends class104 {

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Le;")
    public static class191 field1822 = class54.method368("Gegenstand f-Ur Mitglieder", 2047);

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field1834 = 500;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field1841 = 1;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "[I")
    public static int[] field1840 = new int[5];

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public int field1857;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "Ltf;")
    public class103 field1853;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "Lbb;")
    public class116 field1843;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Lvk;")
    public class131 field1837;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lte;")
    public class227 field1852;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "Lwk;")
    public static class46 field1849;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Lqk;")
    public static class6 field1831;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "[I")
    public static int[] field1838;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "[Lwa;")
    public static class226[] field1856;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIILeg;)V")
    public static final void method702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class33 arg7) {
        field1839++;
        if (arg2 != 16) {
            return;
        }
        if (class141.field2342) {
            class69.field1222 = 32;
        } else {
            class69.field1222 = 0;
        }
        class141.field2342 = false;
        if (class51.field929 != 0) {
            if (arg6 <= arg0 && arg0 < (arg6 + 16) && arg1 >= arg3 && arg1 < arg3 + 16) {
                arg7.field534 -= 4;
                class184.method1238(arg7, (byte) -58);
            } else if (arg6 <= arg0 && arg0 < arg6 + 16 && arg1 >= arg3 + arg4 - 16 && arg1 < arg3 + arg4) {
                arg7.field534 += 4;
                class184.method1238(arg7, (byte) -113);
            } else if (arg0 >= arg6 - class69.field1222 && class69.field1222 + arg6 + 16 > arg0 && arg3 + 16 <= arg1 && arg1 < arg3 + arg4 - 16) {
                int var8 = (arg4 - 32) * arg4 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = (arg1 - arg3) - var8 / 2 - 16;
                int var10 = arg4 - var8 - 32;
                arg7.field534 = (arg5 - arg4) * var9 / var10;
                class184.method1238(arg7, (byte) -39);
                class141.field2342 = true;
            }
        }
        if (class31.field434 == 0) {
            return;
        }
        int var11 = arg7.field537;
        if (arg0 >= (arg6 - var11) && arg1 >= arg3 && arg0 < arg6 + 16 && arg1 <= (arg3 + arg4)) {
            arg7.field534 += class31.field434 * 45;
            class184.method1238(arg7, (byte) -105);
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public static final void method703(int arg0, int arg1) {
        field1832++;
        if (arg1 == -1 || !class148.field2531[arg1]) {
            return;
        }
        class197.field3513.method819(arg1, -123);
        if (class242.field4325[arg1] == null) {
            return;
        }
        boolean var2 = true;
        if (arg0 != 2) {
            field1856 = null;
        }
        for (int var3 = 0; var3 < class242.field4325[arg1].length; var3++) {
            if (class242.field4325[arg1][var3] != null) {
                if (class242.field4325[arg1][var3].field493 == 2) {
                    var2 = false;
                } else {
                    class242.field4325[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class242.field4325[arg1] = null;
        }
        class148.field2531[arg1] = false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lii;I)V")
    public static final void method704(class202 arg0, int arg1) {
        if (arg0.field3615 != null) {
            arg0.field3615.field4219 = 0;
        }
        if (arg1 != 0) {
            field1856 = null;
        }
        arg0.field3614 = false;
        field1833++;
        for (class202 var2 = arg0.method508(); var2 != null; var2 = arg0.method511()) {
            method704(var2, 0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public final void method705(int arg0) {
        this.field1837 = null;
        this.field1853 = null;
        field1848++;
        this.field1843 = null;
        if (arg0 != 1) {
            field1856 = null;
        }
        this.field1852 = null;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public static final void method706(int arg0) {
        class91.field1495 = 0;
        int var1 = (class175.field2946.field3003 >> 7) + class225.field4061;
        field1828++;
        if (arg0 != 3) {
            method709(false);
        }
        int var2 = (class175.field2946.field2972 >> 7) + class193.field3474;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class91.field1495 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class91.field1495 = 1;
        }
        if (class91.field1495 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class91.field1495 = 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static final void method707(byte arg0) {
        class267.field4724 = new class175();
        if (arg0 <= -126) {
            field1824++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILe;)V")
    public static final void method708(int arg0, int arg1, class191 arg2) {
        field1829++;
        class191 var3 = arg2.method1327((byte) 40).method1345((byte) -18);
        boolean var4 = false;
        for (int var5 = 0; var5 < class260.field4586; var5++) {
            class76 var6 = class245.field4357[class73.field1271[var5]];
            if (var6 != null && var6.field1315 != null && var6.field1315.method1351(-23098, var3)) {
                var4 = true;
                class97.method604(1, var6.field3014[0], class175.field2946.field2953[0], var6.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, arg0 + 85);
                if (arg1 == 1) {
                    class53.field963.method1096(167, arg0 ^ 0x3);
                    class128.field2123++;
                    class53.field963.method1608(class73.field1271[var5], false);
                } else if (arg1 == 4) {
                    class152.field2609++;
                    class53.field963.method1096(47, 0);
                    class53.field963.method1602(class73.field1271[var5], false);
                } else if (arg1 == 5) {
                    class228.field4106++;
                    class53.field963.method1096(3, 0);
                    class53.field963.method1608(class73.field1271[var5], false);
                } else if (arg1 == 6) {
                    class132.field2206++;
                    class53.field963.method1096(5, arg0 ^ 0x3);
                    class53.field963.method1602(class73.field1271[var5], false);
                } else if (arg1 == 7) {
                    class242.field4324++;
                    class53.field963.method1096(193, 0);
                    class53.field963.method1608(class73.field1271[var5], false);
                }
                break;
            }
        }
        if (arg0 != 3) {
            method704((class202) null, -56);
        }
        if (!var4) {
            class47.method320(class228.method1629(new class191[] { class176.field3025, var3 }, (byte) -26), class26.field385, 0, -1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method709(boolean arg0) {
        field1856 = null;
        field1822 = null;
        field1831 = null;
        if (!arg0) {
            field1840 = null;
            field1838 = null;
            field1849 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public static final void method710(int arg0, int arg1, int arg2) {
        field1846++;
        class241 var3 = class14.method97(13, arg2, -49);
        var3.method1694((byte) -90);
        var3.field4301 = arg1;
        if (arg0 >= -111) {
            method710(13, 6, 43);
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static final void method711(int arg0) {
        class232.field4142.method992(-31);
        field1820++;
        if (arg0 != 0) {
            field1831 = null;
        }
    }
}
