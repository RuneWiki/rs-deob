import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class47 {

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public static int[] field566 = new int[500];

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lqj;")
    public static class196 field563 = class80.method502("http:)4)4", -48);

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field569 = 1;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lqj;")
    private static class196 field564 = class80.method502("Walk here", -48);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lqj;")
    public static class196 field560 = field564;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V")
    public static final void method248(int arg0, boolean arg1) {
        class201.field3561.method1535(arg0, 30704);
        if (arg1) {
            method251(64, null, 88);
        }
        field567++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static final void method249(int arg0) {
        if (arg0 != -28276) {
            return;
        }
        field561++;
        for (int var1 = 0; var1 < class122.field1744; var1++) {
            class161 var2 = class210.method1458(123, var1);
            if (var2 != null && var2.field2583 == 0) {
                class214.field3823[var1] = 0;
                class215.field3873[var1] = 0;
            }
        }
        class132.field1887 = new class231(16);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method250(int arg0) {
        field564 = null;
        field560 = null;
        field563 = null;
        int var1 = -84 / ((6 - arg0) / 42);
        field566 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILbk;I)Z")
    public static final boolean method251(int arg0, class136 arg1, int arg2) {
        if (arg0 != 7172) {
            field566 = null;
        }
        field571++;
        byte[] var3 = arg1.method843(arg2, (byte) -124);
        if (var3 == null) {
            return false;
        } else {
            class73.method465(false, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZB)V")
    public static final void method252(boolean arg0, byte arg1) {
        class18.field206 = new int[104];
        field570++;
        class152.field2451 = new int[104];
        int var2 = -105 % ((16 - arg1) / 39);
        class18.field211 = new int[104];
        class258.field4524 = new int[104];
        class101.field1447 = 99;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        class87.field1287 = new byte[var3][104][104];
        class195.field3433 = new byte[var3][104][104];
        class172.field2902 = new int[104];
        class150.field2415 = new byte[var3][104][104];
        class45.field538 = new byte[var3][105][105];
        class10.field107 = new byte[var3][104][104];
        class225.field4038 = new int[var3][105][105];
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static final void method253(int arg0) {
        field568++;
        int var1 = class86.field1273 * 128 + 64;
        int var2 = class209.field3766 * 128 + 64;
        int var3 = class74.method470(var2, class27.field335, 103, var1) - class109.field1557;
        if (class118.field1689 < 100) {
            if (var3 > class132.field1889) {
                class132.field1889 += class78.field1143 + (var3 - class132.field1889) * class118.field1689 / 1000;
                if (class132.field1889 > var3) {
                    class132.field1889 = var3;
                }
            }
            if (class132.field1889 > var3) {
                class132.field1889 -= (class132.field1889 - var3) * class118.field1689 / 1000 + class78.field1143;
                if (var3 > class132.field1889) {
                    class132.field1889 = var3;
                }
            }
            if (var2 > class25.field321) {
                class25.field321 += (var2 - class25.field321) * class118.field1689 / 1000 + class78.field1143;
                if (var2 < class25.field321) {
                    class25.field321 = var2;
                }
            }
            if (var2 < class25.field321) {
                class25.field321 -= (class25.field321 - var2) * class118.field1689 / 1000 + class78.field1143;
                if (var2 > class25.field321) {
                    class25.field321 = var2;
                }
            }
            if (class13.field151 < var1) {
                class13.field151 += (var1 - class13.field151) * class118.field1689 / 1000 + class78.field1143;
                if (var1 < class13.field151) {
                    class13.field151 = var1;
                }
            }
            if (var1 < class13.field151) {
                class13.field151 -= (class13.field151 - var1) * class118.field1689 / 1000 + class78.field1143;
                if (class13.field151 < var1) {
                    class13.field151 = var1;
                }
            }
        } else {
            class25.field321 = class209.field3766 * 128 + 64;
            class13.field151 = class86.field1273 * 128 + 64;
            class132.field1889 = class74.method470(class25.field321, class27.field335, arg0 ^ 0x67, class13.field151) - class109.field1557;
        }
        int var4 = class52.field653 * 128 + 64;
        int var5 = class210.field3788 * 128 + 64;
        int var6 = class74.method470(var4, class27.field335, 103, var5) - class232.field4133;
        int var7 = var5 - class13.field151;
        int var8 = var6 - class132.field1889;
        int var9 = var4 - class25.field321;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class149.field2396) {
            class149.field2396 += (var11 - class149.field2396) * class22.field276 / 1000 + class252.field4461;
            if (var11 < class149.field2396) {
                class149.field2396 = var11;
            }
        }
        if (class149.field2396 > var11) {
            class149.field2396 -= (class149.field2396 - var11) * class22.field276 / 1000 + class252.field4461;
            if (var11 > class149.field2396) {
                class149.field2396 = var11;
            }
        }
        int var13 = var12 - class185.field3232;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (arg0 < var13) {
            class185.field3232 += class22.field276 * var13 / 1000 + class252.field4461;
            class185.field3232 &= 0x7FF;
        }
        if (var13 < 0) {
            class185.field3232 -= -var13 * class22.field276 / 1000 + class252.field4461;
            class185.field3232 &= 0x7FF;
        }
        int var14 = var12 - class185.field3232;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class185.field3232 = var12;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILbk;)V")
    public static final void method254(int arg0, class136 arg1) {
        class253.field4484 = class30.method161(0, arg1, true, class94.field1369);
        class217.field3898 = class229.method1541(0, 0, arg1, class102.field1481);
        class88.field1296 = class22.method134(class246.field4386, 125, arg1, 0);
        class22.method134(class102.field1478, 117, arg1, 0);
        field565++;
        class212.field3804 = class22.method134(class118.field1690, 112, arg1, 0);
        class159.field2555 = class22.method134(class230.field4086, 119, arg1, 0);
        class258.field4520 = class91.method560(0, arg1, class7.field60, 3);
        class13.field143 = class91.method560(0, arg1, class158.field2544, 3);
        class138.field2119 = class256.method1718(0, arg1, (byte) 123, class81.field1179);
        class103.field1487 = class91.method560(0, arg1, class147.field2325, 3);
        class238.field4237 = class91.method560(0, arg1, class70.field996, 3);
        class120.field1732 = class3.method11(class16.field182, arg1, 0, -25635);
        class82.field1188 = class3.method11(class143.field2202, arg1, 0, -25635);
        class76.field1097.method1238(class82.field1188, null);
        class226.field4045.method1238(class82.field1188, null);
        class23.field292.method1238(class82.field1188, null);
        class233 var2 = class63.method397(-114, arg1, class245.field4368, 0);
        var2.method1562();
        class65.field898 = var2;
        class233[] var3 = class229.method1541(0, 0, arg1, class181.field3195);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1562();
        }
        if (arg0 != -16280) {
            return;
        }
        int var5 = (int) (Math.random() * 21.0D) - 10;
        class138.field2120 = var3;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        for (int var9 = 0; var9 < class217.field3898.length; var9++) {
            class217.field3898[var9].method1564(var5 + var8, var6 + var8, var7 + var8);
        }
        class253.field4484[0].method441(var5 + var8, var6 + var8, var7 + var8);
        class251.field4441 = class217.field3898;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lra;IILnb;)V")
    public static final void method255(class69 arg0, int arg1, int arg2, class95 arg3) {
        field562++;
        byte[] var4 = null;
        class243 var5 = class243.field4323;
        synchronized (class243.field4323) {
            class57 var6 = (class57) class243.field4323.method1651((byte) -27);
            if (arg2 > -34) {
                field560 = null;
            }
            while (var6 != null) {
                if ((long) arg1 == var6.field1850 && var6.field774 == arg0 && var6.field761 == 0) {
                    var4 = var6.field759;
                    break;
                }
                var6 = (class57) class243.field4323.method1656(-26);
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method444(52, arg1);
            arg3.method592(true, arg1, arg0, -93, var7);
        } else {
            arg3.method592(true, arg1, arg0, -120, var4);
        }
    }
}
