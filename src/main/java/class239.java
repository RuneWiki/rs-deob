import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class239 extends class87 {

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field4300 = 0;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "Z")
    public static boolean field4304 = true;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "Ljd;")
    public static class86 field4309 = class122.method868("floorshadows", true);

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public int field4307;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "Lwj;")
    public static class6 field4310;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "Ljd;")
    public class86 field4302;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "Ljd;")
    public class86 field4303;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public static final void method1641(int arg0) {
        ++field4308;
        if (arg0 == -1) {
            for (int var1 = 0; ~var1 > ~class164.field3083; ++var1) {
                int var2 = class271.field4762[var1];
                class224 var3 = class186.field3294[var2];
                int var4 = class168.field3102.method1408((byte) -34);
                if (~(2 & var4) != -1) {
                    var4 += class168.field3102.method1408((byte) -20) << 8;
                }
                class90.method665(var3, var4, -9295, var2);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BIZIII)Lod;")
    public static final class90 method1642(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg3 << 19) + arg4 + (arg2 ? 65536 : 0) - -(arg5 << 17);
        ++field4301;
        long var8 = (long) var6 * 3849834839L + (long) arg1 * 3147483667L;
        if (arg0 != -121) {
            return null;
        } else {
            class90 var10 = (class90) class158.field2973.method701((byte) -128, var8);
            if (var10 != null) {
                return var10;
            } else {
                class145.field2754 = false;
                class90 var11 = class57.method419(arg4, arg3, arg2, arg5, arg1, (byte) 41, false, false);
                if (var11 != null && !class145.field2754) {
                    class158.field2973.method696(var8, var11, (byte) -96);
                }
                return var11;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public static final void method1643(int arg0) {
        ++field4299;
        if (class4.field64 == null) {
            if (arg0 == -5) {
                if (class84.field1637 == null) {
                    int var1 = class143.field2712;
                    if (class195.field3506) {
                        if (~var1 != -2) {
                            int var6 = class90.field1841;
                            int var7 = class6.field207;
                            if (var7 < class202.field3642 - 10 || var7 > class202.field3642 + class108.field2080 + 10 || class112.field2144 + -10 > var6 || ~var6 < ~(class127.field2462 + 10 + class112.field2144)) {
                                class195.field3506 = false;
                                class186.method1280(class202.field3642, true, class112.field2144, class127.field2462, class108.field2080);
                            }
                        }
                        if (var1 != 1) {
                            return;
                        }
                        int var8 = class202.field3642;
                        int var9 = class112.field2144;
                        int var10 = class108.field2080;
                        int var11 = class185.field3288;
                        int var12 = class39.field906;
                        int var13 = -1;
                        for (int var14 = 0; ~class16.field463 < ~var14; ++var14) {
                            int var15 = (class16.field463 - 1 + -var14) * 15 + 31 + var9;
                            if (var11 > var8 && var11 < var8 + var10 && var12 > var15 - 13 && var12 < var15 - -3) {
                                var13 = var14;
                            }
                        }
                        if (var13 != -1) {
                            class260.method1774((byte) 85, var13);
                        }
                        class195.field3506 = false;
                        class186.method1280(class202.field3642, true, class112.field2144, class127.field2462, class108.field2080);
                    } else {
                        if (var1 == 1 && class16.field463 > 0) {
                            short var2 = class273.field4784[class16.field463 + -1];
                            if (var2 == 18 || ~var2 == -15 || ~var2 == -17 || var2 == 39 || var2 == 17 || ~var2 == -5 || var2 == 3 || ~var2 == -41 || var2 == 51 || var2 == 42 || ~var2 == -20 || ~var2 == -1008) {
                                int var3 = class241.field4321[class16.field463 + -1];
                                int var4 = class137.field2612[class16.field463 + -1];
                                class6 var5 = class25.method178(108, var4);
                                if (class90.method674(client.method1111(var5), (byte) -116) || class81.method568((byte) 32, client.method1111(var5))) {
                                    class31.field651 = false;
                                    class226.field4097 = 0;
                                    if (class4.field64 != null) {
                                        class62.method441(-29481, class4.field64);
                                    }
                                    class4.field64 = class25.method178(90, var4);
                                    class274.field4810 = class185.field3288;
                                    class253.field4505 = class39.field906;
                                    class265.field4683 = var3;
                                    class62.method441(arg0 ^ 29484, class4.field64);
                                    return;
                                }
                            }
                        }
                        if (~var1 == -2 && (~class141.field2670 == -2 && class16.field463 > 2 || class156.method1137(-98, class16.field463 + -1))) {
                            var1 = 2;
                        }
                        if (var1 == 2 && ~class16.field463 < -1 || class209.field3776 == 1) {
                            class104.method744((byte) 121);
                        }
                        if (var1 == 1 && class16.field463 > 0 || ~class209.field3776 == -3) {
                            class43.method347(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V")
    public static void method1644(byte arg0) {
        field4310 = null;
        field4309 = null;
        int var1 = -88 % ((arg0 - -19) / 48);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
    public static final int method1645(int arg0, int arg1) {
        ++field4305;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 != 1276611244) {
            method1641(69);
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)Ltj;")
    public final class260 method1646(byte arg0) {
        ++field4306;
        if (arg0 != -19) {
            this.field4303 = null;
        }
        return class186.field3292[super.field1722];
    }
}
