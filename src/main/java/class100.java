import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class100 extends class117 {

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "Z")
    public static boolean field1609 = true;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1615 = "slide:";

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field1604 = 50;

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "[I")
    public static int[] field1620 = new int[field1604];

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "[I")
    public static int[] field1614 = new int[field1604];

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "[I")
    public static int[] field1616 = new int[field1604];

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "[I")
    public static int[] field1619 = new int[field1604];

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field1613 = new String[field1604];

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "[I")
    public static int[] field1608 = new int[field1604];

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "Z")
    public static boolean field1624 = true;

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "[I")
    public static int[] field1621 = new int[field1604];

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "[I")
    public static int[] field1611 = new int[field1604];

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "Lqd;")
    public static class173 field1605 = new class173(50);

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field1625 = "Use";

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "[Z")
    public static boolean[] field1627 = new boolean[112];

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method680(int arg0, String arg1) {
        ++field1623;
        if (arg0 >= -41) {
            field1626 = 30;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3 = class246.method1649(-8217, arg1.charAt(var4)) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class100() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
    public static void method681(byte arg0) {
        field1614 = null;
        field1616 = null;
        field1620 = null;
        field1619 = null;
        field1625 = null;
        field1627 = null;
        field1615 = null;
        field1611 = null;
        field1621 = null;
        if (arg0 <= 68) {
            field1619 = null;
        }
        field1613 = null;
        field1605 = null;
        field1608 = null;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)V")
    public static final void method682(byte arg0) {
        if (arg0 > 7) {
            ++field1622;
            for (class296 var1 = (class296) class62.field1020.method1643((byte) -91); var1 != null; var1 = (class296) class62.field1020.method1642((byte) 49)) {
                if (~var1.field4739 < -1) {
                    --var1.field4739;
                }
                if (~var1.field4739 != -1) {
                    if (~var1.field4729 < -1) {
                        --var1.field4729;
                    }
                    if (~var1.field4729 == -1 && ~var1.field4730 <= -2 && ~var1.field4731 <= -2 && ~var1.field4730 >= -103 && ~var1.field4731 >= -103 && (~var1.field4727 > -1 || class209.method1456(var1.field4737, 8216, var1.field4727))) {
                        class306.method2046((byte) -84, var1.field4744, var1.field4732, var1.field4727, var1.field4740, var1.field4737, var1.field4730, var1.field4731);
                        var1.field4729 = -1;
                        if (var1.field4727 == var1.field4724 && var1.field4724 == -1) {
                            var1.method913(-3542);
                        } else if (var1.field4727 == var1.field4724 && var1.field4742 == var1.field4732 && ~var1.field4737 == ~var1.field4723) {
                            var1.method913(-3542);
                        }
                    }
                } else if (~var1.field4724 > -1 || class209.method1456(var1.field4723, 8216, var1.field4724)) {
                    class306.method2046((byte) -96, var1.field4744, var1.field4742, var1.field4724, var1.field4740, var1.field4723, var1.field4730, var1.field4731);
                    var1.method913(-3542);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            this.method46(-16, 95);
        }
        if (arg2 == 0) {
            super.field1885 = arg0.method1133((byte) 53) == 1;
        }
        ++field1610;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IJ)V")
    public static final void method683(int arg0, long arg1) {
        class314.field5061.field2568 = 0;
        ++field1603;
        class314.field5061.method1108(21, true);
        class314.field5061.method1156(-31881, arg1);
        class9.field91 = -3;
        class81.field1364 = 0;
        class225.field3653 = arg0;
        class176.field2873 = 1;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V")
    public static final void method684(byte arg0) {
        if (arg0 != -110) {
            method686(-92, -42, 5, -13);
        }
        Container var1;
        if (class259.field4184 != null) {
            var1 = class259.field4184;
        } else if (class92.field1494 != null) {
            var1 = class92.field1494;
        } else {
            var1 = class268.field4323.field751;
        }
        ++field1617;
        class66.field1099 = var1.getSize().width;
        class153.field2387 = var1.getSize().height;
        if (class92.field1494 == var1) {
            Insets var2 = class92.field1494.getInsets();
            class153.field2387 -= var2.top + var2.bottom;
            class66.field1099 -= var2.right + var2.left;
        }
        if (~class56.method383(false) <= -3) {
            class238.field3822 = 0;
            class310.field4964 = class153.field2387;
            class294.field4709 = class66.field1099;
            class6.field59 = 0;
        } else {
            class294.field4709 = 765;
            class238.field3822 = 0;
            class6.field59 = (class66.field1099 + -765) / 2;
            class310.field4964 = 503;
        }
        class131.field2064.setSize(class294.field4709, class310.field4964);
        if (class92.field1494 != var1) {
            class131.field2064.setLocation(class6.field59, class238.field3822);
        } else {
            Insets var3 = class92.field1494.getInsets();
            class131.field2064.setLocation(var3.left - -class6.field59, class238.field3822 + var3.top);
        }
        if (~class22.field284 != 0) {
            class278.method1875(12, true);
        }
        class221.method1518(0);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = super.field1883.method531(arg1, (byte) 86);
        ++field1606;
        if (super.field1883.field1313) {
            int[] var4 = this.method837(0, 0, arg1);
            for (int var5 = 0; var5 < class168.field2737; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return arg0 != 2 ? null : var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZZIIIZ)V")
    public static final void method685(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        ++field1618;
        if (arg3 || ~class19.field226 != ~arg0 || class48.field801 != arg1 || ~class287.field4606 != ~arg4 && !class129.method918(false)) {
            class48.field801 = arg1;
            class19.field226 = arg0;
            class287.field4606 = arg4;
            if (class129.method918(arg7)) {
                class287.field4606 = 0;
            }
            if (arg2) {
                class262.method1760(28, -35);
            } else {
                class262.method1760(25, -125);
            }
            class249.method1660(class47.field797, false, true);
            int var8 = class108.field1732;
            class108.field1732 = (arg1 - 6) * 8;
            int var9 = class276.field4438;
            class276.field4438 = (arg0 + -6) * 8;
            class205.field3266 = class275.method1841(class19.field226 * 8, class48.field801 * 8);
            class287.field4602 = null;
            int var10 = -var8 + class108.field1732;
            int var11 = class108.field1732;
            int var12 = -var9 + class276.field4438;
            int var13 = class276.field4438;
            if (!arg2) {
                for (int var14 = 0; var14 < 32768; ++var14) {
                    class131 var15 = class12.field127[var14];
                    if (var15 != null) {
                        for (int var16 = 0; ~var16 > -11; ++var16) {
                            var15.field709[var16] -= var12;
                            var15.field704[var16] -= var10;
                        }
                        var15.field710 -= var10 * 128;
                        var15.field637 -= var12 * 128;
                    }
                }
            } else {
                class246.field3912 = 0;
                for (int var17 = 0; ~var17 > -32769; ++var17) {
                    class131 var33 = class12.field127[var17];
                    if (var33 != null) {
                        var33.field637 -= var12 * 128;
                        var33.field710 -= var10 * 128;
                        if (var33.field637 >= 0 && var33.field637 <= 13184 && var33.field710 >= 0 && ~var33.field710 >= -13185) {
                            for (int var34 = 0; var34 < 10; ++var34) {
                                var33.field709[var34] -= var12;
                                var33.field704[var34] -= var10;
                            }
                            class184.field3020[class246.field3912++] = var17;
                        } else {
                            class12.field127[var17].method927(true, (class253) null);
                            class12.field127[var17] = null;
                        }
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class299 var31 = class270.field4355[var18];
                if (var31 != null) {
                    for (int var32 = 0; var32 < 10; ++var32) {
                        var31.field709[var32] -= var12;
                        var31.field704[var32] -= var10;
                    }
                    var31.field637 -= var12 * 128;
                    var31.field710 -= var10 * 128;
                }
            }
            byte var19 = 0;
            class56.field941 = arg4;
            byte var20 = 1;
            byte var21 = 104;
            class239.field3829.method1975(arg5, (byte) -67, false, arg6);
            if (var12 < 0) {
                var21 = -1;
                var20 = -1;
                var19 = 103;
            }
            byte var22 = 104;
            byte var23 = 0;
            byte var24 = 1;
            if (~var10 > -1) {
                var23 = 103;
                var22 = -1;
                var24 = -1;
            }
            for (int var25 = var19; ~var21 != ~var25; var25 += var20) {
                for (int var27 = var23; ~var22 != ~var27; var27 += var24) {
                    int var28 = var12 + var25;
                    int var29 = var10 + var27;
                    for (int var30 = 0; ~var30 > -5; ++var30) {
                        if (var28 >= 0 && ~var29 <= -1 && ~var28 > -105 && ~var29 > -105) {
                            class192.field3113[var30][var25][var27] = class192.field3113[var30][var28][var29];
                        } else {
                            class192.field3113[var30][var25][var27] = null;
                        }
                    }
                }
            }
            for (class296 var26 = (class296) class62.field1020.method1643((byte) 115); var26 != null; var26 = (class296) class62.field1020.method1642((byte) 95)) {
                var26.field4730 -= var12;
                var26.field4731 -= var10;
                if (~var26.field4730 > -1 || var26.field4731 < 0 || ~var26.field4730 <= -105 || var26.field4731 >= 104) {
                    var26.method913(-3542);
                }
            }
            if (~class237.field3804 != -1) {
                class237.field3804 -= var12;
                class86.field1418 -= var10;
            }
            class195.field3163 = 0;
            if (!arg2) {
                if (~class120.field1919 == -5) {
                    class162.field2580 -= var12 * 128;
                    class256.field4149 -= var12 * 128;
                    class163.field2646 -= var10 * 128;
                    class95.field1537 -= var10 * 128;
                } else {
                    class120.field1919 = 1;
                }
            } else {
                class148.field2314 -= var12 * 128;
                class104.field1666 -= var10 * 128;
                class170.field2762 -= var10;
                class50.field853 -= var12;
                class132.field2081 -= var12;
                class276.field4442 -= var10;
            }
            class170.method1234(-1);
            class1.field10.method1650((byte) -119);
            class25.field303.method1650((byte) -119);
            class171.method1241();
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Lqg;")
    public static final class97 method686(int arg0, int arg1, int arg2, int arg3) {
        ++field1612;
        class97 var4 = new class97();
        var4.field1554 = arg0;
        var4.field1556 = arg1;
        class244.field3880.method1052((long) arg3, (byte) -65, var4);
        class141.method995(arg1, (byte) -110);
        class211 var5 = class17.method87(arg3, -20055);
        if (var5 != null) {
            class117.method834(var5, (byte) -57);
        }
        if (class61.field994 != null) {
            class117.method834(class61.field994, (byte) -57);
            class61.field994 = null;
        }
        int var6 = class83.field1384;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            if (class305.method2040((byte) -26, class192.field3103[var7])) {
                class73.method498(var7, true);
            }
        }
        if (arg2 > -54) {
            field1615 = null;
        }
        if (class83.field1384 != 1) {
            class236.method1603(class67.field1114, class72.field1211, class169.field2756, class96.field1543, 0);
            int var8 = class59.field967.method634(class211.field3347);
            for (int var9 = 0; ~class83.field1384 < ~var9; ++var9) {
                int var10 = class59.field967.method634(class112.method789(var9, 46));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class72.field1211 = class83.field1384 * 15 - -(class65.field1078 ? 26 : 22);
            class96.field1543 = var8 + 8;
        } else {
            class286.field4537 = false;
            class236.method1603(class67.field1114, class72.field1211, class169.field2756, class96.field1543, 0);
        }
        if (var5 != null) {
            class56.method384(-84, var5, false);
        }
        class81.method557((byte) -72, arg1);
        if (class22.field284 != -1) {
            class258.method1733((byte) 95, class22.field284, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IBI)V")
    public static final void method687(int arg0, byte arg1, int arg2) {
        if (class124.field1967 > 0) {
            class23.method128(256, class124.field1967);
            class124.field1967 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        ++field1602;
        int var5 = class127.field2006 * arg0;
        int var6 = 0;
        for (int var7 = 1; ~(var3 - 1) < ~var7; ++var7) {
            int var8 = (var3 - var7) * class233.field3749[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; ++var9) {
                int var11 = class282.field4509[var4++];
                int var12 = class127.field2007[var5++ + arg2];
                if (var11 != 0) {
                    int var13 = -var11 + 238;
                    int var14 = var11 + 18;
                    int var15 = class101.field1633[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class46.field780.field3733[var6++] = class51.method359(class51.method359(var15, 65280) * var14 - -(class51.method359(var12, 65280) * var13), 16711680) + class51.method359(class51.method359(16711935, var15) * var14 + class51.method359(16711935, var12) * var13, -16711936) >> 8;
                } else {
                    class46.field780.field3733[var6++] = var12;
                }
            }
            for (int var10 = 0; var8 > var10; ++var10) {
                class46.field780.field3733[var6++] = class127.field2007[var5++ + arg2];
            }
            var5 += class127.field2006 + -128;
        }
        if (arg1 >= -127) {
            method680(-93, (String) null);
        }
        class46.field780.method1023(arg2, arg0);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int var3 = 97 / ((arg1 - 37) / 38);
        int[][] var4 = super.field1886.method419(arg0, (byte) -23);
        ++field1607;
        if (super.field1886.field1022) {
            int[][] var5 = this.method838(0, 0, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            for (int var12 = 0; class168.field2737 > var12; ++var12) {
                var11[var12] = -var6[var12] + 4096;
                var9[var12] = -var7[var12] + 4096;
                var10[var12] = 4096 - var8[var12];
            }
        }
        return var4;
    }
}
