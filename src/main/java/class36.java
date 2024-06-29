import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class36 extends class93 {

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    private int field824 = 2048;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    private int field822 = 0;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    private int field836 = 10;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Ljd;")
    public static class92 field821 = class202.method1325((byte) 90, "blinken1:");

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "Ljd;")
    public static class92 field830 = class202.method1325((byte) 90, ":");

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "Lnh;")
    public static class133 field831;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "Lei;")
    public static class50 field833;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "[I")
    private int[] field828;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "[I")
    private int[] field834;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "[Lrf;")
    public static class167[] field835;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "(B)V")
    public static void method228(byte arg0) {
        field821 = null;
        int var1 = -76 / ((-66 - arg0) / 55);
        field830 = null;
        field835 = null;
        field831 = null;
        field833 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lub;Lnh;ILnh;Lnh;)Z")
    public static final boolean method229(class190 arg0, class133 arg1, int arg2, class133 arg3, class133 arg4) {
        ++field832;
        class162.field3176 = arg3;
        class198.field3871 = arg0;
        if (arg2 != 0) {
            return true;
        } else {
            class2.field155 = arg1;
            class157.field3117 = arg4;
            return true;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 != -85) {
            method229((class190) null, (class133) null, -70, (class133) null, (class133) null);
        }
        ++field820;
        this.method231(1949911777);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILa;II)V")
    public static final void method230(int arg0, class1 arg1, int arg2, int arg3) {
        if (~arg1.field38 == -2) {
            class44.method275((byte) -110, (short) 38, 0, 0L, class3.field189, arg1.field100, arg1.field67);
            ++class102.field2095;
        }
        ++field826;
        if (arg1.field38 == 2 && !class95.field1918) {
            class92 var4 = class213.method1384(arg1, 0);
            if (var4 != null) {
                ++class196.field3833;
                class44.method275((byte) -110, (short) 12, -1, 0L, class77.method529(-3, new class92[] { class186.field3515, arg1.field58 }), arg1.field100, var4);
            }
        }
        if (~arg1.field38 == -4) {
            class44.method275((byte) -110, (short) 16, 0, 0L, class3.field189, arg1.field100, class195.field3805);
            ++class53.field1107;
        }
        if (arg1.field38 == 4) {
            ++class79.field1615;
            class44.method275((byte) -110, (short) 3, 0, 0L, class3.field189, arg1.field100, arg1.field67);
        }
        if (~arg1.field38 == -6) {
            class44.method275((byte) -110, (short) 39, 0, 0L, class3.field189, arg1.field100, arg1.field67);
            ++field823;
        }
        if (arg3 != 3) {
            method230(49, (class1) null, -101, -126);
        }
        if (~arg1.field38 == -7 && class93.field1897 == null) {
            class44.method275((byte) -110, (short) 9, -1, 0L, class3.field189, arg1.field100, arg1.field67);
            ++class107.field2197;
        }
        if (arg1.field10 == 2) {
            int var5 = 0;
            for (int var6 = 0; ~arg1.field28 < ~var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg1.field96; ++var7) {
                    int var8 = (arg1.field61 + 32) * var7;
                    int var9 = (arg1.field46 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field65[var5];
                        var8 += arg1.field72[var5];
                    }
                    if (var8 <= arg0 && ~var9 >= ~arg2 && var8 + 32 > arg0 && var9 - -32 > arg2) {
                        class179.field3428 = var5;
                        class159.field3163 = arg1;
                        if (arg1.field133[var5] > 0) {
                            class107 var10 = class92.method626((byte) 59, arg1.field133[var5] - 1);
                            if (~class59.field1235 == -2 && class196.method1302(class114.method766(106, arg1), true)) {
                                if (~class31.field699 != ~arg1.field100 || ~class1.field101 != ~var5) {
                                    class44.method275((byte) -110, (short) 22, var5, (long) var10.field2211, class77.method529(-3, new class92[] { class1.field6, class121.field2450, var10.field2162 }), arg1.field100, class25.field581);
                                    ++class47.field1023;
                                }
                            } else if (class95.field1918 && class196.method1302(class114.method766(-40, arg1), true)) {
                                if (~(class42.field921 & 16) == -17) {
                                    ++class177.field3405;
                                    class44.method275((byte) -110, (short) 49, var5, (long) var10.field2211, class77.method529(-3, new class92[] { class33.field746, class121.field2450, var10.field2162 }), arg1.field100, class124.field2527);
                                }
                            } else {
                                ++class159.field3162;
                                class92[] var11 = var10.field2199;
                                if (class119.field2416) {
                                    var11 = class166.method1078(91, var11);
                                }
                                if (class196.method1302(class114.method766(-88, arg1), true)) {
                                    for (int var12 = 4; var12 >= 3; --var12) {
                                        if (var11 != null && var11[var12] != null) {
                                            ++class204.field3931;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 51;
                                            } else {
                                                var13 = 31;
                                            }
                                            class44.method275((byte) -110, var13, var5, (long) var10.field2211, class77.method529(-3, new class92[] { class51.field1079, var10.field2162 }), arg1.field100, var11[var12]);
                                        } else if (var12 == 4) {
                                            ++class14.field407;
                                            class44.method275((byte) -110, (short) 31, var5, (long) var10.field2211, class77.method529(arg3 ^ -2, new class92[] { class51.field1079, var10.field2162 }), arg1.field100, class114.field2300);
                                        }
                                    }
                                }
                                if (class77.method527(-124, class114.method766(arg3 + -113, arg1))) {
                                    ++class81.field1652;
                                    class44.method275((byte) -110, (short) 29, var5, (long) var10.field2211, class77.method529(-3, new class92[] { class51.field1079, var10.field2162 }), arg1.field100, class25.field581);
                                }
                                if (class196.method1302(class114.method766(arg3 ^ -74, arg1), true) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; --var14) {
                                        if (var11[var14] != null) {
                                            ++class43.field951;
                                            byte var15 = 0;
                                            if (~var14 == -1) {
                                                var15 = 57;
                                            }
                                            if (~var14 == -2) {
                                                var15 = 14;
                                            }
                                            if (var14 == 2) {
                                                var15 = 37;
                                            }
                                            class44.method275((byte) -110, var15, var5, (long) var10.field2211, class77.method529(-3, new class92[] { class51.field1079, var10.field2162 }), arg1.field100, var11[var14]);
                                        }
                                    }
                                }
                                class92[] var16 = arg1.field116;
                                if (class119.field2416) {
                                    var16 = class166.method1078(arg3 ^ 98, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; ~var17 <= -1; --var17) {
                                        if (var16[var17] != null) {
                                            ++class46.field1010;
                                            byte var18 = 0;
                                            if (~var17 == -1) {
                                                var18 = 35;
                                            }
                                            if (~var17 == -2) {
                                                var18 = 46;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 30;
                                            }
                                            if (var17 == 4) {
                                                var18 = 13;
                                            }
                                            class44.method275((byte) -110, var18, var5, (long) var10.field2211, class77.method529(-3, new class92[] { class51.field1079, var10.field2162 }), arg1.field100, var16[var17]);
                                        }
                                    }
                                }
                                class44.method275((byte) -110, (short) 1007, var5, (long) var10.field2211, class77.method529(-3, new class92[] { class51.field1079, var10.field2162 }), arg1.field100, class54.field1129);
                            }
                        }
                    }
                    ++var5;
                }
            }
        }
        if (arg1.field94) {
            if (class95.field1918) {
                if (class80.method544(class114.method766(-121, arg1), (byte) -101) && (class42.field921 & 32) == 32) {
                    class44.method275((byte) -110, (short) 34, arg1.field90, 0L, class77.method529(-3, new class92[] { class33.field746, class72.field1523, arg1.field111 }), arg1.field100, class124.field2527);
                    ++class111.field2265;
                    return;
                }
            } else {
                for (int var19 = 9; var19 >= 5; --var19) {
                    class92 var23 = class159.method1027(true, arg1, var19);
                    if (var23 != null) {
                        class44.method275((byte) -110, (short) 1006, arg1.field90, (long) (var19 + 1), arg1.field111, arg1.field100, var23);
                        ++class88.field1726;
                    }
                }
                class92 var20 = class213.method1384(arg1, 0);
                if (var20 != null) {
                    class44.method275((byte) -110, (short) 12, arg1.field90, 0L, arg1.field111, arg1.field100, var20);
                    ++class196.field3833;
                }
                for (int var21 = 4; ~var21 <= -1; --var21) {
                    class92 var22 = class159.method1027(true, arg1, var21);
                    if (var22 != null) {
                        class44.method275((byte) -110, (short) 17, arg1.field90, (long) (var21 + 1), arg1.field111, arg1.field100, var22);
                        ++class88.field1726;
                    }
                }
                if (!class180.method1179(0, class114.method766(-113, arg1))) {
                    return;
                }
                ++class107.field2197;
                class44.method275((byte) -110, (short) 9, arg1.field90, 0L, class3.field189, arg1.field100, class182.field3459);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field829;
        int[] var3 = super.field1887.method916(arg0, -73);
        if (super.field1887.field2757) {
            int var4 = class166.field3271[arg0];
            if (this.field822 == 0) {
                short var5 = 0;
                for (int var6 = 0; ~this.field836 < ~var6; ++var6) {
                    if (~var4 <= ~this.field828[var6] && ~this.field828[var6 + 1] < ~var4) {
                        if (~this.field834[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class11.method77(var3, 0, class150.field2985, var5);
            } else {
                for (int var7 = 0; var7 < class150.field2985; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class75.field1574[var7];
                    int var11 = this.field822;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = 2048 - -(-var4 + var10 >> 1);
                            }
                        } else {
                            var8 = (var4 + var10 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field836 < ~var12; ++var12) {
                        if (~var8 <= ~this.field828[var12] && var8 < this.field828[var12 + 1]) {
                            if (~this.field834[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        int var13 = 63 / ((arg1 - 67) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
    private final void method231(int arg0) {
        this.field828 = new int[this.field836 - -1];
        this.field834 = new int[this.field836 + 1];
        ++field837;
        int var2 = 0;
        if (arg0 != 1949911777) {
            field835 = null;
        }
        int var3 = 4096 / this.field836;
        int var4 = this.field824 * var3 >> 12;
        for (int var5 = 0; ~this.field836 < ~var5; ++var5) {
            this.field828[var5] = var2;
            this.field834[var5] = var2 + var4;
            var2 += var3;
        }
        this.field828[this.field836] = 4096;
        this.field834[this.field836] = this.field834[0] + 4096;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class36() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field822 = arg1.method443(arg2 + 255);
                }
            } else {
                this.field824 = arg1.method442(-21351);
            }
        } else {
            this.field836 = arg1.method443(255);
        }
        ++field825;
        if (arg2 != 0) {
            method230(58, (class1) null, -27, 35);
        }
    }
}
