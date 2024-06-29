import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class159 extends class205 {

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
    private int field3030 = 0;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    private int field3032 = 4096;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field3031 = 0;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "Ljava/util/Random;")
    public static Random field3026 = new Random();

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
    public static int field3037 = 10;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "Lvd;")
    public static class222 field3035 = class212.method1357("Der Anmelde)2Server ist offline)3", 10731);

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "Lab;")
    public static class3 field3034;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "Lab;")
    public static class3 field3038;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)V")
    public static void method1005(int arg0) {
        if (arg0 != 11487) {
            field3026 = null;
        }
        field3035 = null;
        field3034 = null;
        field3038 = null;
        field3026 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILgg;)V")
    public static final void method1006(int arg0, class72 arg1) {
        if (arg0 != 4096) {
            method1005(22);
        }
        ++field3029;
        if (class39.field862) {
            class79.method524(13614, arg1);
        } else {
            if (~class222.field4168 == -2 && class64.field1168 >= 715 && ~class153.field2938 <= -454) {
                class31.field659 = !class31.field659;
                if (class31.field659) {
                    class43.method323((byte) -51);
                } else {
                    class109.method713((byte) 113, 255, false, class35.field774, 0, class187.field3466);
                }
            }
            if (~class34.field749 != -6) {
                ++class51.field981;
                if (class34.field749 == 10) {
                    if (class44.field925 != 2) {
                        if (~class222.field4168 == -2) {
                            byte var2 = 5;
                            short var3 = 463;
                            byte var4 = 100;
                            byte var5 = 35;
                            if (~class64.field1168 <= ~var2 && ~(var2 + var4) <= ~class64.field1168 && ~var3 >= ~class153.field2938 && ~(var3 + var5) <= ~class153.field2938) {
                                class135.method850(arg0 + -4174);
                                return;
                            }
                        }
                        if (class68.field1280 != null) {
                            class135.method850(-101);
                        }
                    }
                    int var6 = class222.field4168;
                    int var7 = class153.field2938;
                    int var8 = class64.field1168;
                    if (class116.field2215 != 0) {
                        if (~class116.field2215 != -3) {
                            if (~class116.field2215 == -4) {
                                short var9 = 321;
                                short var10 = 382;
                                if (var6 == 1 && ~var8 <= ~(var10 - 75) && ~var8 >= ~(var10 - -75) && ~(var9 + -20) >= ~var7 && var9 + 20 >= var7) {
                                    class116.field2215 = 0;
                                    return;
                                }
                            }
                        } else {
                            short var11 = 231;
                            int var21 = var11 + 30;
                            short var12 = 321;
                            short var13 = 302;
                            if (~var6 == -2 && var21 + -15 <= var7 && ~var7 > ~var21) {
                                class135.field2609 = 0;
                            }
                            var21 += 15;
                            if (~var6 == -2 && ~(var21 + -15) >= ~var7 && ~var21 < ~var7) {
                                class135.field2609 = 1;
                            }
                            var21 += 15;
                            if (var6 == 1 && var8 >= var13 - 75 && ~(var13 + 75) <= ~var8 && ~var7 <= ~(var12 + -20) && ~(var12 + 20) <= ~var7) {
                                class97.field1819 = class97.field1819.method1412((byte) 58).method1409(-7899);
                                if (class97.field1819.method1444(-75) == 0) {
                                    class1.method1(class76.field1486, class126.field2445, class126.field2410, 0);
                                    return;
                                }
                                if (~class97.field1814.method1444(-23) == -1) {
                                    class1.method1(class32.field672, class126.field2399, class126.field2422, arg0 ^ 4096);
                                    return;
                                }
                                class1.method1(class226.field4233, class126.field2423, class126.field2402, 0);
                                class55.method410(20, arg0 ^ 4096);
                                return;
                            }
                            short var14 = 462;
                            if (var6 == 1 && ~(var14 + -75) >= ~var8 && ~(var14 + 75) <= ~var8 && var12 + -20 <= var7 && var7 <= var12 - -20) {
                                class97.field1814 = class97.field1813;
                                class116.field2215 = 0;
                                class97.field1819 = class97.field1813;
                            }
                            while (true) {
                                while (class99.method619(126)) {
                                    boolean var15 = false;
                                    for (int var16 = 0; ~var16 > ~class64.field1177.method1444(-74); ++var16) {
                                        if (class21.field496 == class64.field1177.method1442(var16, arg0 + -4215)) {
                                            var15 = true;
                                            break;
                                        }
                                    }
                                    if (~class135.field2609 == -1) {
                                        if (~class215.field3992 == -86 && class97.field1819.method1444(-69) > 0) {
                                            class97.field1819 = class97.field1819.method1419(class97.field1819.method1444(-43) + -1, arg0 ^ 4098, 0);
                                        }
                                        if (~class215.field3992 == -85 || ~class215.field3992 == -81) {
                                            class135.field2609 = 1;
                                        }
                                        if (var15 && class97.field1819.method1444(-38) < 12) {
                                            class97.field1819 = class97.field1819.method1453(false, class21.field496);
                                        }
                                    } else if (~class135.field2609 == -2) {
                                        if (class215.field3992 == 85 && class97.field1814.method1444(-35) > 0) {
                                            class97.field1814 = class97.field1814.method1419(class97.field1814.method1444(-38) + -1, 2, 0);
                                        }
                                        if (class215.field3992 == 84 || class215.field3992 == 80) {
                                            class135.field2609 = 0;
                                        }
                                        if (class95.field1781 != 0 && class215.field3992 == 84) {
                                            class97.field1819 = class97.field1819.method1412((byte) 58).method1409(-7899);
                                            if (class97.field1819.method1444(-14) == 0) {
                                                class1.method1(class76.field1486, class126.field2445, class126.field2410, 0);
                                                return;
                                            }
                                            if (~class97.field1814.method1444(arg0 + -4205) == -1) {
                                                class1.method1(class32.field672, class126.field2399, class126.field2422, arg0 + -4096);
                                                return;
                                            }
                                            class1.method1(class226.field4233, class126.field2423, class126.field2402, 0);
                                            class55.method410(20, 0);
                                            return;
                                        }
                                        if (var15 && class97.field1814.method1444(-64) < 20) {
                                            class97.field1814 = class97.field1814.method1453(false, class21.field496);
                                        }
                                    }
                                }
                                return;
                            }
                        }
                    } else {
                        short var17 = 302;
                        short var18 = 291;
                        if (~var6 == -2 && ~var8 <= ~(var17 + -75) && ~var8 >= ~(var17 + 75) && ~(var18 + -20) >= ~var7 && var18 - -20 >= var7) {
                            class135.field2609 = 0;
                            class116.field2215 = 3;
                        }
                        boolean var19 = false;
                        if (~class95.field1781 != -1) {
                            while (class99.method619(126)) {
                                if (~class215.field3992 == -85) {
                                    var19 = true;
                                    break;
                                }
                            }
                        }
                        short var20 = 462;
                        if (var19 || ~var6 == -2 && ~var8 <= ~(var20 - 75) && ~var8 >= ~(var20 - -75) && var18 + -20 <= var7 && ~var7 >= ~(var18 + 20)) {
                            class135.field2609 = 0;
                            class97.field1816 = client.field706;
                            class97.field1805 = class126.field2439;
                            class116.field2215 = 2;
                            class97.field1800 = class126.field2406;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int[] var4 = this.method1322(arg1, (byte) 65, 0);
            for (int var5 = 0; ~class118.field2245 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field3030) {
                    var3[var5] = this.field3030;
                } else if (~var6 < ~this.field3032) {
                    var3[var5] = this.field3032;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0 != 0) {
            return null;
        } else {
            ++field3027;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = 74 / ((-47 - arg1) / 34);
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3812 = ~arg0.method662((byte) -110) == -2;
                }
            } else {
                this.field3032 = arg0.method675(2);
            }
        } else {
            this.field3030 = arg0.method675(2);
        }
        ++field3028;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field3024;
        if (arg1 < 98) {
            return null;
        } else {
            int[][] var3 = super.field3815.method1003(-8357, arg0);
            if (super.field3815.field3015) {
                int[][] var4 = this.method1323(0, arg0, -5920);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class118.field2245; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 <= ~this.field3030) {
                        if (~this.field3032 <= ~var12) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field3032;
                        }
                    } else {
                        var8[var11] = this.field3030;
                    }
                    if (this.field3030 > var13) {
                        var9[var11] = this.field3030;
                    } else if (~var13 >= ~this.field3032) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field3032;
                    }
                    if (this.field3030 > var14) {
                        var10[var11] = this.field3030;
                    } else if (var14 > this.field3032) {
                        var10[var11] = this.field3032;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class159() {
        super(1, false);
    }
}
