import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class127 extends class288 {

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    private int field2004;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Luc;")
    public static class39 field2007 = new class39(8);

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field2010 = 0;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Lhc;")
    public static class235 field2000;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method882(boolean arg0) {
        if (!arg0) {
            field2000 = null;
            field2007 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        ++field2008;
        int var4 = this.field2004 * arg1 >> 12;
        int var5 = this.field2003 * arg2 >> 12;
        int var6 = this.field2005 * arg1 >> 12;
        if (arg0 == 1429) {
            int var7 = this.field1999 * arg2 >> 12;
            class28.method220(var7, (byte) 5, var5, super.field4569, super.field4567, var6, var4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public static final void method883(int arg0) {
        class217.field3353 = -3;
        class5.field57 = -1;
        if (arg0 >= -29) {
            method883(22);
        }
        client.field2438 = false;
        class235.field3794 = 1;
        class259.field4145 = 0;
        class167.field2619 = 0;
        ++field1997;
        class245.field3988 = 0;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    public static final void method884(int arg0) {
        class205.method1382(false, (byte) 126);
        class253.field4057 = 0;
        ++field2001;
        boolean var1 = true;
        for (int var2 = 0; class90.field1573.length > var2; ++var2) {
            if (class292.field4592[var2] != -1 && class90.field1573[var2] == null) {
                class90.field1573[var2] = class17.field252.method1590(0, (byte) -25, class292.field4592[var2]);
                if (class90.field1573[var2] == null) {
                    var1 = false;
                    ++class253.field4057;
                }
            }
            if (~class240.field3893[var2] != 0 && class249.field4024[var2] == null) {
                class249.field4024[var2] = class17.field252.method1608(class240.field3893[var2], (byte) -44, class143.field2195[var2], 0);
                if (class249.field4024[var2] == null) {
                    var1 = false;
                    ++class253.field4057;
                }
            }
            if (class200.field3139 != null && class15.field233[var2] == null && class200.field3139[var2] != -1) {
                class15.field233[var2] = class17.field252.method1608(class200.field3139[var2], (byte) -44, class143.field2195[var2], 0);
                if (class15.field233[var2] == null) {
                    var1 = false;
                    ++class253.field4057;
                }
            }
        }
        if (class193.field3005 == null) {
            if (class114.field1857 != null && class4.field22.method1604(-17743, class114.field1857.field4139 + "_labels")) {
                if (class4.field22.method1591((byte) -123, class114.field1857.field4139 + "_labels")) {
                    class193.field3005 = class24.method203(class114.field1857.field4139 + "_labels", 0, class4.field22);
                } else {
                    ++class253.field4057;
                    var1 = false;
                }
            } else {
                class193.field3005 = new class208(0);
            }
        }
        if (!var1) {
            class170.field2645 = 1;
        } else {
            class173.field2728 = 0;
            boolean var3 = true;
            for (int var4 = 0; var4 < class90.field1573.length; ++var4) {
                byte[] var20 = class249.field4024[var4];
                if (var20 != null) {
                    int var21 = (class230.field3653[var4] >> 8) * 64 - class46.field656;
                    int var22 = (255 & class230.field3653[var4]) * 64 + -class260.field4162;
                    if (class295.field4663) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class139.method943(var21, -84, var22, var20);
                }
            }
            if (!var3) {
                class170.field2645 = 2;
            } else {
                boolean var5 = false;
                if (~class170.field2645 != -1) {
                    class206.method1384(true, class139.field2125 + "<br>(100%)", arg0 ^ 1);
                }
                class230.method1534(false);
                class167.method1129(14280);
                class275.method1847(4, 104, 104, 25, var5);
                for (int var6 = arg0; var6 < 4; ++var6) {
                    class176.field2765[var6].method346(32);
                }
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    for (int var18 = 0; var18 < 104; ++var18) {
                        for (int var19 = 0; ~var19 > -105; ++var19) {
                            class181.field2827[var7][var18][var19] = 0;
                        }
                    }
                }
                class164.method1111(false, arg0);
                class230.method1534(false);
                System.gc();
                class205.method1382(true, (byte) 124);
                class161.method1093(false, (byte) -49);
                if (!class295.field4663) {
                    class239.method1641((byte) 31, false);
                    class205.method1382(true, (byte) 126);
                    class47.method335(-17604, false);
                    if (class15.field233 != null) {
                        class93.method706((byte) -115);
                    }
                }
                if (class295.field4663) {
                    class287.method1925(false, (byte) 58);
                    class205.method1382(true, (byte) 126);
                    class274.method1843(false, 1735859459);
                }
                class167.method1129(14280);
                class205.method1382(true, (byte) 124);
                class27.method213(false, class176.field2765, !class295.field4663 ? null : class33.field500, -5);
                class205.method1382(true, (byte) 124);
                int var8 = class259.field4137;
                if (~var8 < ~class240.field3892) {
                    var8 = class240.field3892;
                }
                if (~(class240.field3892 + -1) < ~var8) {
                    int var9 = class240.field3892 + -1;
                }
                if (!class191.method1284(-110)) {
                    class186.method1254(class259.field4137);
                } else {
                    class186.method1254(0);
                }
                class51.method379(arg0 ^ 256);
                for (int var10 = 0; ~var10 > -105; ++var10) {
                    for (int var17 = 0; ~var17 > -105; ++var17) {
                        class113.method803(var17, var10, 116);
                    }
                }
                class244.method1685(61);
                class230.method1534(false);
                class18.method172(82);
                class167.method1129(14280);
                if (class47.field685 != null && class249.field4022 != null && ~class39.field551 == -26) {
                    client.field2435.method536((byte) -104, 185);
                    client.field2435.method639(1057001181, (byte) -102);
                    ++class295.field4646;
                }
                if (!class295.field4663) {
                    int var11 = (class219.field3376 + 6) / 8;
                    int var12 = (class3.field14 - 6) / 8;
                    int var13 = (class219.field3376 + -6) / 8;
                    int var14 = (class3.field14 - -6) / 8;
                    for (int var15 = var13 + -1; ~var15 >= ~(var11 - -1); ++var15) {
                        for (int var16 = var12 + -1; ~var16 >= ~(var14 + 1); ++var16) {
                            if (var15 < var13 || ~var11 > ~var15 || ~var16 > ~var12 || var16 > var14) {
                                class17.field252.method1598((byte) 31, "m" + var15 + "_" + var16);
                                class17.field252.method1598((byte) 67, "l" + var15 + "_" + var16);
                            }
                        }
                    }
                }
                if (~class39.field551 != -29) {
                    client.method1042(false, 30);
                    if (class249.field4022 != null) {
                        client.field2435.method536((byte) -104, 41);
                    }
                } else {
                    client.method1042(false, 10);
                }
                class237.method1626((byte) 93);
                class230.method1534(false);
                class272.method1837((byte) 4);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lre;B)Lre;")
    public static final class228 method885(class228 arg0, byte arg1) {
        ++field1998;
        class228 var2 = client.method1047(arg0);
        if (var2 == null) {
            var2 = arg0.field3568;
        }
        int var3 = 38 % ((23 - arg1) / 37);
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)V")
    public final void method105(int arg0, int arg1, int arg2) {
        int var4 = this.field2005 * arg0 >> 12;
        int var5 = this.field2004 * arg0 >> 12;
        int var6 = this.field2003 * arg1 >> 12;
        ++field2006;
        int var7 = this.field1999 * arg1 >> 12;
        if (arg2 <= -11) {
            class128.method889(super.field4569, var7, super.field4567, var5, -28, super.field4559, var6, var4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
    public final void method104(int arg0, int arg1, int arg2) {
        ++field2002;
        int var4 = this.field2004 * arg2 >> 12;
        if (arg0 > -31) {
            this.field2005 = -12;
        }
        int var5 = this.field2005 * arg2 >> 12;
        int var6 = this.field2003 * arg1 >> 12;
        int var7 = this.field1999 * arg1 >> 12;
        class81.method582(var7, var6, var5, super.field4559, var4, -5406);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIIII)V")
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2004 = arg2;
        this.field2005 = arg0;
        this.field2003 = arg1;
        this.field1999 = arg3;
    }
}
