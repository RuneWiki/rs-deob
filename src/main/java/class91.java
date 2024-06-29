import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class91 extends class113 {

    @OriginalMember(owner = "client!pa", name = "Tb", descriptor = "Lbb;")
    public static class9 field2062 = new class9();

    @OriginalMember(owner = "client!pa", name = "Ub", descriptor = "Lva;")
    public static class121 field2063 = class107.method797("@or2@", -10983);

    @OriginalMember(owner = "client!pa", name = "Wb", descriptor = "Lva;")
    private static class121 field2065 = class107.method797("Enter name of player to delete from list", -10983);

    @OriginalMember(owner = "client!pa", name = "dc", descriptor = "Lva;")
    public static class121 field2072 = field2065;

    @OriginalMember(owner = "client!pa", name = "Yb", descriptor = "[Z")
    public static boolean[] field2067 = new boolean[5];

    @OriginalMember(owner = "client!pa", name = "bc", descriptor = "Z")
    public static boolean field2070 = false;

    @OriginalMember(owner = "client!pa", name = "ec", descriptor = "I")
    public static int field2073 = -1;

    @OriginalMember(owner = "client!pa", name = "Ib", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!pa", name = "Jb", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!pa", name = "Kb", descriptor = "I")
    private int field2053;

    @OriginalMember(owner = "client!pa", name = "Lb", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!pa", name = "Mb", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!pa", name = "Nb", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!pa", name = "Ob", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!pa", name = "Pb", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!pa", name = "Qb", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!pa", name = "Rb", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!pa", name = "Vb", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!pa", name = "Xb", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!pa", name = "Zb", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!pa", name = "ac", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!pa", name = "Sb", descriptor = "Lhc;")
    private class45 field2061;

    @OriginalMember(owner = "client!pa", name = "cc", descriptor = "[I")
    public static int[] field2071;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "(I)V", line = 8)
    public final void method617(int arg0) {
        this.field2053 = super.field2507 * 8;
        if (arg0 != 17591) {
            method624((byte) 98, (class29) null);
        }
        ++field2069;
    }

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "(I)V", line = 29)
    public static void method618(int arg0) {
        field2062 = null;
        if (arg0 != 0) {
            field2067 = null;
        }
        field2067 = null;
        field2071 = null;
        field2063 = null;
        field2065 = null;
        field2072 = null;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(IB)I", line = 44)
    public final int method619(int arg0, byte arg1) {
        ++field2051;
        int var3 = -91 / ((arg1 - 5) / 51);
        return arg0 * 8 - this.field2053;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V", line = 54)
    public class91(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "(I)V", line = 63)
    public final void method620(int arg0) {
        ++field2059;
        if (arg0 != 0) {
            this.method621(-33);
        }
        super.field2507 = (this.field2053 + 7) / 8;
    }

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "(I)I", line = 89)
    public final int method621(int arg0) {
        if (arg0 >= -33) {
            method625(false);
        }
        ++field2055;
        return super.field2512[super.field2507++] + -this.field2061.method297((byte) 95) & 255;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(IZ)V", line = 100)
    public final void method622(int arg0, boolean arg1) {
        super.field2512[super.field2507++] = (byte) (this.field2061.method297((byte) 75) + arg0);
        ++field2052;
        if (!arg1) {
            this.field2061 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lhe;Lva;Lva;I)[Lm;", line = 111)
    public static final class72[] method623(class47 arg0, class121 arg1, class121 arg2, int arg3) {
        ++field2060;
        int var4 = arg0.method332(arg1, -22814);
        int var5 = arg0.method337(var4, (byte) 57, arg2);
        if (arg3 != -29072) {
            field2064 = 101;
        }
        return class118.method910(var4, 8, var5, arg0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLed;)V", line = 126)
    public static final void method624(byte arg0, class29 arg1) {
        arg1.field782 = false;
        if (arg0 != -106) {
            field2071 = null;
        }
        ++field2054;
        if (~arg1.field777 != 0) {
            class41 var2 = class5.method33(9, arg1.field777);
            ++arg1.field776;
            if (var2.field931.length > arg1.field733 && ~arg1.field776 < ~var2.field939[arg1.field733]) {
                arg1.field776 = 1;
                ++arg1.field733;
            }
            if (~var2.field931.length >= ~arg1.field733) {
                arg1.field733 = 0;
                arg1.field776 = 0;
            }
        }
        if (arg1.field751 != -1 && class115.field2614 >= arg1.field727) {
            if (~arg1.field732 > -1) {
                arg1.field732 = 0;
            }
            int var3 = class61.method446(arg1.field751, -116).field2199;
            if (~var3 == 0) {
                arg1.field751 = -1;
            } else {
                class41 var4 = class5.method33(9, var3);
                ++arg1.field783;
                if (~var4.field931.length < ~arg1.field732 && ~var4.field939[arg1.field732] > ~arg1.field783) {
                    arg1.field783 = 1;
                    ++arg1.field732;
                }
                if (~var4.field931.length >= ~arg1.field732 && (arg1.field732 < 0 || ~arg1.field732 <= ~var4.field931.length)) {
                    arg1.field751 = -1;
                }
            }
        }
        if (~arg1.field793 != 0 && arg1.field778 <= 1) {
            class41 var5 = class5.method33(arg0 + 115, arg1.field793);
            if (~var5.field912 == -2 && arg1.field773 > 0 && ~arg1.field726 >= ~class115.field2614 && class115.field2614 > arg1.field780) {
                arg1.field778 = 1;
                return;
            }
        }
        if (arg1.field793 != -1 && ~arg1.field778 == -1) {
            class41 var6 = class5.method33(9, arg1.field793);
            ++arg1.field746;
            if (var6.field931.length > arg1.field785 && var6.field939[arg1.field785] < arg1.field746) {
                arg1.field746 = 1;
                ++arg1.field785;
            }
            if (arg1.field785 >= var6.field931.length) {
                ++arg1.field734;
                arg1.field785 -= var6.field924;
                if (~var6.field925 >= ~arg1.field734) {
                    arg1.field793 = -1;
                }
                if (arg1.field785 < 0 || ~var6.field931.length >= ~arg1.field785) {
                    arg1.field793 = -1;
                }
            }
            arg1.field782 = var6.field953;
        }
        if (arg1.field778 > 0) {
            --arg1.field778;
        }
    }

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "(Z)V", line = 241)
    public static final void method625(boolean arg0) {
        ++class121.field2782;
        class99.method667(6, arg0);
        class48.method343(true, -37);
        class99.method667(6, false);
        ++field2068;
        class48.method343(false, -127);
        class100.method674(-4653);
        class9.method59(-3934);
        if (!class116.field2632) {
            int var1 = class96.field2149 + class18.field399 & 2047;
            int var2 = class95.field2130;
            if (class15.field302 / 256 > var2) {
                var2 = class15.field302 / 256;
            }
            if (field2067[4] && ~var2 > ~(class1.field5[4] + 128)) {
                var2 = class1.field5[4] + 128;
            }
            class47.method324(var1, class28.field717, class38.field882, var2, -89, var2 * 3 + 600, class47.method340(class62.field1494.field750, -6, class121.field2807, class62.field1494.field742) + -50);
        }
        int var3;
        if (!class116.field2632) {
            var3 = class18.method152(true);
        } else {
            var3 = class40.method266(0);
        }
        int var4 = class116.field2645;
        int var5 = class15.field304;
        int var6 = class37.field860;
        int var7 = field2066;
        int var8 = class48.field1152;
        for (int var9 = 0; var9 < 5; ++var9) {
            if (field2067[var9]) {
                int var10 = (int) ((double) (class69.field1627[var9] * 2 + 1) * Math.random() - (double) class69.field1627[var9] + Math.sin((double) class58.field1350[var9] / 100.0D * (double) class82.field1903[var9]) * (double) class1.field5[var9]);
                if (var9 == 1) {
                    class116.field2645 += var10;
                }
                if (var9 == 2) {
                    class37.field860 += var10;
                }
                if (var9 == 0) {
                    class15.field304 += var10;
                }
                if (var9 == 4) {
                    field2066 += var10;
                    if (field2066 < 128) {
                        field2066 = 128;
                    }
                    if (~field2066 < -384) {
                        field2066 = 383;
                    }
                }
                if (var9 == 3) {
                    class48.field1152 = class48.field1152 + var10 & 2047;
                }
            }
        }
        class53.method379(53);
        class102.field2322 = true;
        class102.field2308 = 0;
        class102.field2325 = class19.field514 + -4;
        class102.field2329 = class34.field822 + -4;
        class55.method395();
        class58.field1348.method731(class15.field304, class116.field2645, class37.field860, field2066, class48.field1152, var3);
        class58.field1348.method745();
        class23.method190((byte) -97);
        class86.method600((byte) -39);
        ((class8) class83.field1935).method44(17, class128.field2955);
        class59.method428(-30911);
        if (class59.field1409 && ~class129.method1004(false, true, true) == -1) {
            class59.field1409 = false;
        }
        if (class59.field1409) {
            class53.method379(83);
            class55.method395();
            class71.method491(false, (class121) null, 1932, class115.field2616);
        }
        class90.method613(4);
        class15.field304 = var5;
        class116.field2645 = var4;
        class37.field860 = var6;
        field2066 = var7;
        class48.field1152 = var8;
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(II)I", line = 356)
    public final int method626(int arg0, int arg1) {
        ++field2057;
        int var3 = 0;
        int var4 = this.field2053 >> 3;
        if (arg1 > -41) {
            this.method627((int[]) null, false);
        }
        int var5 = -(this.field2053 & 7) + 8;
        this.field2053 += arg0;
        while (arg0 > var5) {
            var3 += (super.field2512[var4++] & class58.field1336[var5]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg0 == ~var5) {
            var6 = (class58.field1336[var5] & super.field2512[var4]) + var3;
        } else {
            var6 = (super.field2512[var4] >> -arg0 + var5 & class58.field1336[arg0]) + var3;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IZ)V", line = 386)
    public final void method627(int[] arg0, boolean arg1) {
        ++field2056;
        this.field2061 = new class45(arg0);
        if (arg1) {
            this.method626(53, 102);
        }
    }
}
