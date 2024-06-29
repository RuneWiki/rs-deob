import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class102 extends class117 {

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "Lhh;")
    public static class163 field1960 = class137.method1065("<col=ff7000>", 17);

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "Lhh;")
    public static class163 field1961 = class137.method1065("weiss:", 17);

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "[Z")
    public static boolean[] field1964 = new boolean[200];

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field1962 = 0;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "[I")
    public static int[] field1968 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lpg;I)Lpb;")
    public static final class136 method813(class81 arg0, int arg1) {
        ++field1959;
        int var2 = 115 / ((arg1 - -31) / 41);
        return new class136(arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method615(-118), arg0.method615(-105), arg0.method622(true));
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field1966;
        if (arg0 == arg1) {
            super.field2208 = ~arg2.method622(true) == -2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IZ)V")
    public static final void method814(int arg0, boolean arg1) {
        if (!arg1) {
            field1965 = 92;
        }
        ++field1958;
        class18.field272 = arg0;
        class229.field4125 = 50;
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V")
    public static void method815(int arg0) {
        field1960 = null;
        field1961 = null;
        field1968 = null;
        if (arg0 <= -117) {
            field1964 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V")
    public static final void method816(int arg0) {
        class54.method376((byte) 126, false);
        class111.field2106 = 0;
        boolean var1 = true;
        ++field1957;
        for (int var2 = 0; ~var2 > ~class160.field2943.length; ++var2) {
            if (class152.field2847[var2] != -1 && class160.field2943[var2] == null) {
                class160.field2943[var2] = class139.field2667.method973(class152.field2847[var2], true, 0);
                if (class160.field2943[var2] == null) {
                    ++class111.field2106;
                    var1 = false;
                }
            }
            if (class120.field2262[var2] != -1 && class219.field3984[var2] == null) {
                class219.field3984[var2] = class139.field2667.method959(class119.field2243[var2], 0, class120.field2262[var2], true);
                if (class219.field3984[var2] == null) {
                    var1 = false;
                    ++class111.field2106;
                }
            }
            if (class68.field1150 != null && class264.field4593[var2] == null && class68.field1150[var2] != -1) {
                class264.field4593[var2] = class139.field2667.method959(class119.field2243[var2], 0, class68.field1150[var2], true);
                if (class264.field4593[var2] == null) {
                    ++class111.field2106;
                    var1 = false;
                }
            }
        }
        if (class29.field468 != null && class107.field2049.method965((byte) -99, class145.method1101(arg0 + -1, new class163[] { class29.field468.field1438, class226.field4090 }))) {
            if (class107.field2049.method960((byte) -51, class145.method1101(0, new class163[] { class29.field468.field1438, class226.field4090 }))) {
                class160.field2941 = class259.method1754(class107.field2049, 0, class145.method1101(0, new class163[] { class29.field468.field1438, class226.field4090 }));
            } else {
                ++class111.field2106;
                var1 = false;
            }
        } else {
            class160.field2941 = null;
        }
        if (!var1) {
            class236.field4211 = 1;
        } else {
            boolean var3 = true;
            class231.field4154 = 0;
            for (int var4 = 0; var4 < class160.field2943.length; ++var4) {
                byte[] var19 = class219.field3984[var4];
                if (var19 != null) {
                    int var20 = (class199.field3572[var4] >> 8) * 64 - class62.field1035;
                    int var21 = (class199.field3572[var4] & 255) * 64 + -class257.field4500;
                    if (class50.field840) {
                        var20 = 10;
                        var21 = 10;
                    }
                    var3 &= class144.method1094(var19, var20, 112, var21);
                }
            }
            if (!var3) {
                class236.field4211 = 2;
            } else {
                if (~class236.field4211 != -1) {
                    class68.method473(true, class145.method1101(arg0 + -1, new class163[] { class191.field3492, class265.field4617 }), (byte) -99);
                }
                class229.method1593(-105);
                if (arg0 != 1) {
                    method817(4);
                }
                class131.method1037(false);
                class191.method1400();
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    class140.field2670[var5].method8(arg0 ^ 113);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; ~var18 > -105; ++var18) {
                            class123.field2344[var6][var17][var18] = 0;
                        }
                    }
                }
                class260.method1757(false, true);
                class229.method1593(-107);
                System.gc();
                class54.method376((byte) 126, true);
                class16.method108(arg0 + 88, false);
                if (!class50.field840) {
                    class172.method1282(arg0 ^ -258, false);
                    class54.method376((byte) 126, true);
                    class59.method408(false, true);
                    if (class264.field4593 != null) {
                        class97.method768(-1);
                    }
                }
                if (class50.field840) {
                    class103.method822(false, (byte) -126);
                    class54.method376((byte) 126, true);
                    class238.method1648(false, -25241);
                }
                class131.method1037(false);
                class54.method376((byte) 126, true);
                class258.method1744(false, -105, class140.field2670);
                class54.method376((byte) 126, true);
                int var7 = class76.field1429;
                if (var7 > class20.field323) {
                    var7 = class20.field323;
                }
                if (var7 < class20.field323 + -1) {
                    int var8 = class20.field323 + -1;
                }
                if (!class177.method1310(arg0 + 4642)) {
                    class7.method54(class76.field1429);
                } else {
                    class7.method54(0);
                }
                class131.method1040((byte) 127);
                for (int var9 = 0; ~var9 > -105; ++var9) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        class55.method390(var9, 16952, var16);
                    }
                }
                class182.method1337(false);
                class229.method1593(arg0 + -117);
                class129.method1029(-1);
                class131.method1037(false);
                if (class45.field754 != null && class188.field3443 != null && ~class262.field4583 == -26) {
                    class191.field3499.method75(69, 26);
                    class191.field3499.method604(1057001181, 1543219568);
                    ++class219.field3979;
                }
                if (!class50.field840) {
                    int var10 = (field1965 - -6) / 8;
                    int var11 = (field1965 - 6) / 8;
                    int var12 = (class29.field467 - 6) / 8;
                    int var13 = (class29.field467 - -6) / 8;
                    for (int var14 = var11 + -1; ~var14 >= ~(var10 + 1); ++var14) {
                        for (int var15 = var12 + -1; ~(var13 + 1) <= ~var15; ++var15) {
                            if (~var14 > ~var11 || var14 > var10 || var12 > var15 || ~var15 < ~var13) {
                                class139.field2667.method980(true, class145.method1101(arg0 + -1, new class163[] { class55.field921, class136.method1061(var14, (byte) 118), class21.field342, class136.method1061(var15, (byte) 102) }));
                                class139.field2667.method980(true, class145.method1101(arg0 ^ 1, new class163[] { class99.field1901, class136.method1061(var14, (byte) 124), class21.field342, class136.method1061(var15, (byte) 101) }));
                            }
                        }
                    }
                }
                if (~class262.field4583 == -29) {
                    class174.method1292(10, true);
                } else {
                    class174.method1292(30, true);
                    if (class188.field3443 != null) {
                        class191.field3499.method75(219, arg0 + 57);
                    }
                }
                class229.method1593(-118);
                class157.method1165(false);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "(I)V")
    public static final void method817(int arg0) {
        ++field1956;
        class237.field4217.method111((byte) -52);
        class32.field493.method111((byte) -52);
        if (arg0 != -6764) {
            field1968 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int[] var4 = this.method932(arg1, false, 0);
            for (int var5 = 0; ~var5 > ~class143.field2702; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg0 != -21393) {
            return null;
        } else {
            ++field1955;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field1969;
            int[][] var3 = super.field2228.method1304(arg0, (byte) 108);
            if (super.field2228.field3221) {
                int[][] var4 = this.method931(arg0, -106, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[1];
                int[] var8 = var4[2];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                for (int var11 = 0; ~var11 > ~class143.field2702; ++var11) {
                    var10[var11] = 4096 - var5[var11];
                    var7[var11] = -var6[var11] + 4096;
                    var9[var11] = -var8[var11] + 4096;
                }
            }
            return var3;
        }
    }
}
