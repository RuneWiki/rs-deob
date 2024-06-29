import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class200 extends class470 {

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public int field2918 = -1;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public int field2931 = -1;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "Lho;")
    public static class102 field2923 = new class102(11, 0, 1, 2);

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "Z")
    public static boolean field2932 = true;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
    public static int field2934 = 0;

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "[I")
    public static int[] field2935 = new int[5];

    @OriginalMember(owner = "client!bv", name = "P", descriptor = "Z")
    public static boolean field2936 = false;

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "Lbg;")
    public static class324 field2933 = new class324(69, -1);

    @OriginalMember(owner = "client!bv", name = "Q", descriptor = "Z")
    public static boolean field2937 = true;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Lya;I)V", line = 3)
    public final void method35(class38 arg0, int arg1) {
        ++field2927;
        if (arg1 < 53) {
            method1407(-74);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lfk;I)V", line = 14)
    public static final void method1404(class462 arg0, int arg1) {
        ++field2920;
        arg0.field6799 = null;
        int var2 = arg0.field6800.length;
        if (arg1 == -201) {
            for (int var3 = 0; ~var2 < ~var3; ++var3) {
                arg0.field6800[var3].field4729 = false;
            }
            class493[] var4 = class130.field1868;
            synchronized (class130.field1868) {
                if (~var2 > ~class130.field1868.length && ~class289.field4151[var2] > -201) {
                    class130.field1868[var2].method2948(arg1 + 82, arg0);
                    int var10002 = class289.field4151[var2]++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)V", line = 45)
    public static void method1405(byte arg0) {
        field2933 = null;
        field2923 = null;
        field2935 = null;
        if (arg0 != 81) {
            field2934 = -30;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILcw;IILlh;)V", line = 57)
    public static final void method1406(int arg0, class120 arg1, int arg2, int arg3, class364 arg4) {
        ++field2924;
        byte var5 = -1;
        if (~(64 & arg0) != -1) {
            arg4.field5067 = arg1.method623((byte) 89);
            if (~arg4.field1779 == -1) {
                arg4.method955(arg4.field5067, false);
                arg4.field5067 = -1;
            }
        }
        if (~(arg0 & 1024) != -1) {
            arg4.field1699 = arg1.method624((byte) -40);
            if (arg4.field1699.charAt(0) != '~') {
                if (class435.field6375 == arg4) {
                    class331.method2032(0, 2, arg4.field1699, arg4.method2174(70, true), arg4.method2178(false, arg3 + -1), true);
                }
            } else {
                arg4.field1699 = arg4.field1699.substring(1);
                class331.method2032(0, 2, arg4.field1699, arg4.method2174(-105, true), arg4.method2178(false, 1), true);
            }
            arg4.field1749 = 0;
            arg4.field1764 = 150;
            arg4.field1772 = 0;
        }
        if ((32768 & arg0) != 0) {
            arg4.field1726 = arg1.method621(arg3 ^ 130);
            arg4.field1735 = arg1.method629(false);
            arg4.field1727 = arg1.method621(128);
            arg4.field1759 = arg1.method629(false);
            arg4.field1692 = arg1.method623((byte) 113) - -class263.field3867;
            arg4.field1698 = arg1.method635(arg3 ^ 952968610) - -class263.field3867;
            arg4.field1724 = arg1.method607(arg3 ^ 27572);
            arg4.field1783 = 0;
            if (!arg4.field5076) {
                arg4.field1727 += arg4.field1777[0];
                arg4.field1726 += arg4.field1777[0];
                arg4.field1759 += arg4.field1778[0];
                arg4.field1779 = 1;
                arg4.field1735 += arg4.field1778[0];
            } else {
                arg4.field1779 = 0;
                arg4.field1726 += arg4.field5081;
                arg4.field1735 += arg4.field5056;
                arg4.field1759 += arg4.field5056;
                arg4.field1727 += arg4.field5081;
            }
        }
        if (~(arg0 & 2048) != -1) {
            int var6 = arg1.method635(arg3 + 952968606);
            arg4.field1734 = arg1.method577(arg3 ^ 253);
            arg4.field1737 = arg1.method607(27574);
            arg4.field1684 = ~(var6 & 32768) != -1;
            arg4.field1722 = 32767 & var6;
            arg4.field1714 = class263.field3867 - -arg4.field1722 - -arg4.field1734;
        }
        if (~(arg0 & 65536) != -1) {
            int var7 = arg1.method577(255);
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            for (int var11 = 0; var7 > var11; ++var11) {
                int var12 = arg1.method623((byte) 114);
                if (var12 == 65535) {
                    var12 = -1;
                }
                var8[var11] = var12;
                var9[var11] = arg1.method576((byte) 22);
                var10[var11] = arg1.method625(126);
            }
            class468.method2828(var10, var9, arg4, arg3 + -104, var8);
        }
        if ((262144 & arg0) != 0) {
            int var13 = arg1.method625(123);
            if (~var13 == -65536) {
                var13 = -1;
            }
            int var14 = arg1.method597(31);
            int var15 = arg1.method610(-103);
            arg4.method960(0, var15, var14, true, var13);
        }
        if (~(1 & arg0) != -1) {
            class373.field5539[arg2] = arg1.method594(0);
        }
        if (~(arg3 & arg0) != -1) {
            int var16 = arg1.method602((byte) 55);
            if (var16 == 65535) {
                var16 = -1;
            }
            arg4.field1713 = var16;
        }
        if ((arg0 & 128) != 0) {
            int var17 = arg1.method635(952968608);
            int var18 = arg1.method607(arg3 + 27572);
            int var19 = arg1.method607(27574);
            int var20 = arg1.field827;
            boolean var21 = (var17 & 32768) != 0;
            if (arg4.field5074 != null && arg4.field5065 != null) {
                boolean var22 = false;
                if (~var18 >= -2) {
                    if (!var21 && (class388.field5741 && !class53.field582 || class411.field6107)) {
                        var22 = true;
                    } else if (class88.method778(arg4.field5074, false)) {
                        var22 = true;
                    }
                }
                if (!var22 && ~class368.field5478 == -1) {
                    class109.field1546.field827 = 0;
                    arg1.method595((byte) 22, var19, 0, class109.field1546.field783);
                    class109.field1546.field827 = 0;
                    int var23 = -1;
                    String var25;
                    if (var21) {
                        var17 &= 32767;
                        class321 var24 = class346.method2091(class109.field1546, (byte) -114);
                        var23 = var24.field4522;
                        var25 = var24.field4523.method3069(class109.field1546, -127);
                    } else {
                        var25 = class450.method2723(class405.method2479(false, class109.field1546), (byte) 68);
                    }
                    arg4.field1699 = var25.trim();
                    arg4.field1764 = 150;
                    arg4.field1749 = var17 & 255;
                    arg4.field1772 = var17 >> 8;
                    int var26;
                    if (~var18 != -2 && ~var18 != -3) {
                        var26 = !var21 ? 2 : 17;
                    } else {
                        var26 = !var21 ? 1 : 17;
                    }
                    if (var18 == 2) {
                        class11.method77((byte) 109, var23, "<img=1>" + arg4.method2178(false, arg3 + -1), var25, (String) null, 0, "<img=1>" + arg4.method2174(arg3 ^ -109, true), var26);
                    } else if (~var18 != -2) {
                        class11.method77((byte) 120, var23, arg4.method2178(false, 1), var25, (String) null, 0, arg4.method2174(-113, true), var26);
                    } else {
                        class11.method77((byte) 111, var23, "<img=0>" + arg4.method2178(false, 1), var25, (String) null, 0, "<img=0>" + arg4.method2174(5, true), var26);
                    }
                }
            }
            arg1.field827 = var19 + var20;
        }
        if ((arg0 & 4096) != 0) {
            int var27 = arg1.method625(119);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = arg1.method616((byte) 86);
            int var29 = arg1.method576((byte) 9);
            arg4.method960(0, var29, var28, false, var27);
        }
        if (~(8 & arg0) != -1) {
            int var30 = arg1.method623((byte) -51);
            if (var30 == 65535) {
                var30 = -1;
            }
            int var31 = arg1.method577(255);
            class111.method907(var31, arg4, false, var30);
        }
        if ((131072 & arg0) != 0) {
            arg4.field1761 = arg1.method594(0);
            arg4.field1706 = arg1.method621(128);
            arg4.field1725 = arg1.method629(false);
            arg4.field1695 = (byte) arg1.method576((byte) 127);
            arg4.field1694 = class263.field3867 - -arg1.method635(952968608);
            arg4.field1753 = class263.field3867 - -arg1.method625(arg3 ^ 124);
        }
        if (~(arg0 & 512) != -1) {
            var5 = arg1.method594(0);
        }
        if (~(arg0 & 16) != -1) {
            int var32 = arg1.method593((byte) 82);
            int var33 = arg1.method607(arg3 + 27572);
            arg4.method958(73, var32, class263.field3867, var33);
            arg4.field1757 = class263.field3867 - -300;
            arg4.field1702 = arg1.method607(27574);
        }
        if (~(arg0 & 16384) != -1) {
            arg4.field5063 = arg1.method607(27574) == 1;
        }
        if (~(arg0 & 32) != -1) {
            int var34 = arg1.method577(255);
            byte[] var35 = new byte[var34];
            class65 var36 = new class65(var35);
            arg1.method595((byte) 22, var34, 0, var35);
            class72.field921[arg2] = var36;
            arg4.method2168(var36, Integer.MIN_VALUE);
        }
        if (~(arg0 & 256) != -1) {
            int var37 = class263.field3867;
            int var38 = arg1.method593((byte) 115);
            int var39 = arg1.method576((byte) -66);
            arg4.method958(66, var38, var37, var39);
        }
        if (arg4.field5076) {
            if (~var5 == -128) {
                arg4.method2172(arg4.field5056, arg3 ^ 2, arg4.field5081);
            } else {
                byte var40;
                if (~var5 != 0) {
                    var40 = var5;
                } else {
                    var40 = class373.field5539[arg2];
                }
                arg4.method2169(var40, arg4.field5056, arg4.field5081, 1);
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILya;I)Z", line = 395)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field2919;
        class122 var5 = arg2.method362();
        var5.method249(super.field6946, super.field6938, super.field6936);
        class471 var6 = class270.field3995.method6(22883, this.field2928).method671(0, this.field2929, (class267) null, 131072, -1, (class488) null, arg1, -125, arg2);
        if (var6 != null && var6.method443(arg3, arg0, var5, true)) {
            return true;
        } else {
            if (~this.field2931 != 0) {
                class471 var7 = class270.field3995.method6(22883, this.field2931).method671(0, this.field2925, (class267) null, 131072, -1, (class488) null, 0, arg1 + -128, arg2);
                if (var7 != null && var7.method443(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            if (this.field2918 != -1) {
                class471 var8 = class270.field3995.method6(arg1 ^ 22883, this.field2918).method671(0, this.field2921, (class267) null, 131072, -1, (class488) null, 0, -127, arg2);
                if (var8 != null && var8.method443(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(Lya;I)Lfk;", line = 434)
    public final class462 method38(class38 arg0, int arg1) {
        ++field2922;
        class122 var3 = arg0.method362();
        var3.method249(super.field6946, super.field6938, super.field6936);
        class462 var4 = class482.method2908(3, (byte) -95);
        if (arg1 >= -87) {
            this.field2931 = -11;
        }
        if (~this.field2918 != 0) {
            class471 var5 = class270.field3995.method6(22883, this.field2918).method671(0, this.field2921, (class267) null, 2048, -1, (class488) null, 0, -126, arg0);
            if (var5 != null) {
                var5.method457(var3, var4.field6800[2], 0);
            }
        }
        if (this.field2931 != -1) {
            class471 var6 = class270.field3995.method6(22883, this.field2931).method671(0, this.field2925, (class267) null, 2048, -1, (class488) null, 0, -122, arg0);
            if (var6 != null) {
                var6.method457(var3, var4.field6800[1], 0);
            }
        }
        class471 var7 = class270.field3995.method6(22883, this.field2928).method671(0, this.field2929, (class267) null, 2048, -1, (class488) null, 0, -121, arg0);
        if (var7 != null) {
            var7.method457(var3, var4.field6800[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 478)
    public static final void method1407(int arg0) {
        class454.field6674.method1016(-128);
        ++field2930;
        for (class97 var1 = (class97) class498.field7394.method1018(arg0 ^ -100); var1 != null; var1 = (class97) class498.field7394.method1022((byte) -112)) {
            if (~var1.field1307 > -1001) {
                var1.method1525((byte) 67);
                class454.field6674.method1015(false, var1);
            }
        }
        class454.field6674.method1027(class498.field7394, (byte) -89);
        int var2 = arg0;
        class306 var3 = (class306) class188.field2670.method1018(79);
        if (var3 != null) {
            var2 = var3.method231((byte) 102);
        }
        if (!class500.field7415) {
            if (var2 == 0 && (~class495.field7259 == -2 && ~class291.field4175 < -3 || class358.method2154((byte) -20))) {
                var2 = 2;
            }
            if (~var2 == -3 && ~class291.field4175 < -1 && var3 != null) {
                if (class134.field1943 == null && class495.field7267 == 0) {
                    class420.method2583(arg0 + -66, var3.method236((byte) -72), var3.method233(arg0 ^ -24));
                } else {
                    class353.field4926 = 2;
                }
            }
            if (var2 == 0 && ~class291.field4175 < -1) {
                class527.method3125((byte) -102);
            }
            if (class134.field1943 == null && ~class495.field7267 == -1) {
                class353.field4926 = 0;
                class188.field2725 = null;
                return;
            }
        } else {
            if (var2 == -1) {
                int var4 = class104.field1460.method1268((byte) 58);
                int var5 = class104.field1460.method1280(3045);
                if (~(class389.field5748 + -10) < ~var4 || var4 > class22.field244 + 10 + class389.field5748 || ~(class429.field6318 + -10) < ~var5 || var5 > class429.field6318 - -10 + class518.field7624) {
                    class500.field7415 = false;
                    class410.method2512(class389.field5748, true, class518.field7624, class22.field244, class429.field6318);
                }
            }
            if (~var2 != -1) {
                return;
            }
            int var6 = class389.field5748;
            int var7 = class429.field6318;
            int var8 = class22.field244;
            int var9 = var3.method233(arg0 ^ 90);
            int var10 = var3.method236((byte) -110);
            int var11 = -1;
            for (int var12 = 0; var12 < class291.field4175; ++var12) {
                if (class473.field6974) {
                    int var16 = (-var12 + -1 + class291.field4175) * 16 + var7 + 33;
                    if (~var9 < ~var6 && ~var9 > ~(var6 + var8) && var10 > var16 + -13 && var10 < var16 + 4) {
                        var11 = var12;
                    }
                } else {
                    int var17 = 31 - -((class291.field4175 + -1 - var12) * 16) + var7;
                    if (var6 < var9 && var6 + var8 > var9 && ~(var17 + -13) > ~var10 && var17 + 3 > var10) {
                        var11 = var12;
                    }
                }
            }
            if (~var11 != 0) {
                int var13 = 0;
                class150 var14 = new class150(class498.field7394);
                for (class97 var15 = (class97) var14.method1081(true); var15 != null; var15 = (class97) var14.method1082((byte) 61)) {
                    if (var11 == var13) {
                        class264.method1699(var10, var15, var9, true);
                    }
                    ++var13;
                }
            }
            class500.field7415 = false;
            class410.method2512(class389.field5748, true, class518.field7624, class22.field244, class429.field6318);
        }
    }
}
