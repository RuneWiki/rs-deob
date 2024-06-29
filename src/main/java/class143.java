import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class143 extends class107 {

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    private int field2309 = -1;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Z")
    public static boolean field2307 = true;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "Z")
    public static boolean field2314 = true;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "[I")
    public int[] field2305;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public final void method753(byte arg0) {
        ++field2313;
        super.method753((byte) 87);
        this.field2305 = null;
        if (arg0 <= 62) {
            this.field2309 = 46;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIZI)V")
    public static final void method980(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field2303;
        class94.method676(arg2, arg4, arg0 + arg2, arg1 + arg4);
        class94.method660(arg2, arg4, arg0, arg1, 0);
        if (class92.field1462 >= 100) {
            float var5 = (float) class262.field4278 / (float) class262.field4277;
            int var6 = arg0;
            int var7 = arg1;
            if (var5 < 1.0F) {
                var7 = (int) ((float) arg0 * var5);
            } else {
                var6 = (int) ((float) arg1 / var5);
            }
            int var8 = (-var7 + arg1) / 2 + arg4;
            int var9 = (-var6 + arg0) / 2 + arg2;
            if (class193.field3143 == null || ~class193.field3143.field4784 != ~arg0 || class193.field3143.field4780 != arg1) {
                class67 var10 = new class67(arg0, arg1);
                class94.method682(var10.field1082, arg0, arg1);
                if (class262.field4273.field2742 != -1) {
                    class94.method660(0, 0, arg0, arg1, class262.field4273.field2742);
                }
                class262.method1767(0, 0, class262.field4277, class262.field4278, 0, 0, var6, var7);
                class262.method1766();
                class193.field3143 = var10;
                class296.field4829.method1034((byte) -73);
            }
            class193.field3143.method463(var9, var8);
            int var11 = class183.field3035 * var6 / class262.field4277 + var9;
            if (!arg3) {
                field2314 = false;
            }
            int var12 = class111.field1706 * var7 / class262.field4278 + var8;
            int var13 = class210.field3358 * var6 / class262.field4277;
            int var14 = client.field2676 * var7 / class262.field4278;
            int var15 = 16711680;
            if (class106.field1656 == 1) {
                var15 = 16777215;
            }
            class94.method668(var11, var12, var13, var14, var15, 128);
            class94.method670(var11, var12, var13, var14, var15);
            if (class108.field1685 > 0) {
                int var16;
                if (client.field2660 > 50) {
                    var16 = 500 - client.field2660 * 5;
                } else {
                    var16 = client.field2660 * 5;
                }
                for (class119 var17 = (class119) class262.field4272.method391((byte) 95); var17 != null; var17 = (class119) class262.field4272.method394((byte) 125)) {
                    class125 var18 = class223.method1550((byte) -114, var17.field1877);
                    if (class255.method1728(var18, (byte) 126)) {
                        if (~class66.field1081 != ~var17.field1877) {
                            if (class4.field104 != -1 && class4.field104 == var18.field1983) {
                                int var19 = var17.field1886 * var7 / class262.field4278 + var8;
                                int var20 = var17.field1883 * var6 / class262.field4277 + var9;
                                class94.method668(var20 + -2, var19 - 2, 4, 4, 16776960, var16);
                            }
                        } else {
                            int var21 = var9 - -(var17.field1883 * var6 / class262.field4277);
                            int var22 = var17.field1886 * var7 / class262.field4278 + var8;
                            class94.method668(var21 + -2, var22 + -2, 4, 4, 16776960, var16);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)[[I")
    public int[][] method190(int arg0, byte arg1) {
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063 && this.method985(40)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2311 * (class153.field2452 == this.field2301 ? arg0 : this.field2301 * arg0 / class153.field2452);
            if (class24.field443 != this.field2311) {
                for (int var8 = 0; var8 < class24.field443; ++var8) {
                    int var9 = this.field2311 * var8 / class24.field443;
                    int var10 = this.field2305[var7 + var9];
                    var6[var8] = class233.method1609(4080, var10 << 4);
                    var5[var8] = class233.method1609(4080, var10 >> 4);
                    var4[var8] = class233.method1609(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~class24.field443 < ~var11; ++var11) {
                    int var12 = this.field2305[var7++];
                    var6[var11] = class233.method1609(var12, 255) << 4;
                    var5[var11] = class233.method1609(var12 >> 4, 4080);
                    var4[var11] = class233.method1609(var12, 16711680) >> 12;
                }
            }
        }
        ++field2310;
        if (arg1 != -117) {
            method986(31, (int[]) null, (int[]) null, (class12) null, (int[]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)Z")
    public static final boolean method981(int arg0) {
        ++field2299;
        return arg0 != 22351 ? false : class24.field442;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)Z")
    public static final boolean method982(int arg0, int arg1) {
        ++field2312;
        int var2 = 66 / ((arg0 - 44) / 40);
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I")
    public final int method758(int arg0) {
        if (arg0 != 9633) {
            field2314 = false;
        }
        ++field2298;
        return this.field2309;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)V")
    public static final void method983(int arg0, int arg1) {
        ++field2304;
        if (arg1 == 16590) {
            if (class238.field3741 != arg0) {
                boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
                if (~class238.field3741 == -1) {
                    class290.method1995(-1102255476);
                }
                if (arg0 == 40) {
                    class270.method1794(-20745);
                }
                if (arg0 != 40 && class122.field1921 != null) {
                    class122.field1921.method416(64);
                    class122.field1921 = null;
                }
                if (arg0 == 25 || ~arg0 == -29) {
                    class162.field2637 = 1;
                    class52.field770 = 0;
                    class173.field2904 = 0;
                    class45.field670 = 1;
                    class210.field3345 = 0;
                    class200.method1379(-842114134, true);
                }
                if (arg0 == 25 || ~arg0 == -11) {
                    class139.method960(81);
                }
                if (~arg0 == -6) {
                    class28.method229(class118.field1844, -1);
                } else {
                    class271.method1797(64);
                }
                boolean var3 = class238.field3741 == 5 || class238.field3741 == 10 || class238.field3741 == 28;
                if (var2 == !var3) {
                    if (var2) {
                        class215.field3393 = class306.field4973;
                        if (~class44.field654 == -1) {
                            class253.method1713(2, 0);
                        } else {
                            class272.method1802(arg1 + -16516, class203.field3290, 0, 2, false, 255, class306.field4973);
                        }
                        class102.field1624.method713(false, false);
                    } else {
                        class253.method1713(2, 0);
                        class102.field1624.method713(true, false);
                    }
                }
                class238.field3741 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method984(int arg0, String arg1, String arg2, int arg3) {
        ++field2300;
        class186.field3071 = arg2;
        class211.field3368 = arg1;
        class122.field1937 = arg3;
        if (!class211.field3368.equals("") && !class186.field3071.equals("")) {
            if (~class62.field916 != 0) {
                class270.method1794(arg0 + -20747);
            } else {
                class63.field1027 = 0;
                class191.field3120 = -3;
                class27.field482 = 0;
                class140.field2280 = 1;
                class274 var4 = new class274(128);
                var4.method1865(10, arg0 + 87);
                var4.method1831((int) (9.9999999E7D * Math.random()), 119690440);
                var4.method1840((byte) 47, class162.method1114((byte) -119, class211.field3368));
                var4.method1831((int) (Math.random() * 9.9999999E7D), 119690440);
                var4.method1859((byte) 58, class186.field3071);
                var4.method1831((int) (Math.random() * 9.9999999E7D), 119690440);
                var4.method1818((byte) 62, class285.field4623, class292.field4789);
                class311.field5027.field4458 = 0;
                class311.field5027.method1865(24, arg0 + 62);
                class311.field5027.method1865(var4.field4458 + arg0, -118);
                class311.field5027.method1824(549, arg0 ^ 28359);
                class311.field5027.method1836(var4.field4441, 0, -119, var4.field4458);
            }
        } else {
            class191.field3120 = 3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)Z")
    public final boolean method985(int arg0) {
        if (arg0 != 40) {
            this.field2311 = 24;
        }
        ++field2306;
        if (this.field2305 != null) {
            return true;
        } else if (~this.field2309 <= -1) {
            class67 var2 = ~class273.field4405 <= -1 ? class288.method1960(class274.field4466, this.field2309, 126, class273.field4405) : class242.method1644(class274.field4466, this.field2309, (byte) 68);
            var2.method443();
            this.field2311 = var2.field4784;
            this.field2301 = var2.field4780;
            this.field2305 = var2.field1082;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 == 28) {
            if (~arg0 == -1) {
                this.field2309 = arg1.method1837(252);
            }
            ++field2302;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[I[ILhd;[I)V")
    public static final void method986(int arg0, int[] arg1, int[] arg2, class12 arg3, int[] arg4) {
        if (arg0 < 75) {
            method984(94, (String) null, (String) null, -71);
        }
        for (int var5 = 0; ~var5 > ~arg2.length; ++var5) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (~var6 != -1 && ~var9 > ~arg3.field986.length) {
                if (~(var6 & 1) != -1) {
                    if (~var8 == 0) {
                        arg3.field986[var9] = null;
                    } else {
                        class91 var10 = class159.method1085((byte) -63, var8);
                        int var11 = var10.field1453;
                        class278 var12 = arg3.field986[var9];
                        if (var12 != null) {
                            if (var12.field4544 != var8) {
                                if (~var10.field1447 <= ~class159.method1085((byte) -63, var12.field4544).field1447) {
                                    var12 = arg3.field986[var9] = null;
                                }
                            } else if (~var11 != -1) {
                                if (~var11 != -2) {
                                    if (var11 == 2) {
                                        var12.field4534 = 0;
                                    }
                                } else {
                                    var12.field4543 = var7;
                                    var12.field4535 = 1;
                                    var12.field4534 = 0;
                                    var12.field4537 = 0;
                                    var12.field4532 = 0;
                                    class252.method1710(0, arg3.field929, var10, arg3.field994, class217.field3408 == arg3, 71);
                                }
                            } else {
                                var12 = arg3.field986[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class278 var13 = arg3.field986[var9] = new class278();
                            var13.field4543 = var7;
                            var13.field4544 = var8;
                            var13.field4532 = 0;
                            var13.field4537 = 0;
                            var13.field4535 = 1;
                            var13.field4534 = 0;
                            class252.method1710(0, arg3.field929, var10, arg3.field994, class217.field3408 == arg3, 53);
                        }
                    }
                }
                ++var9;
                var6 >>>= 1;
            }
        }
        ++field2308;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class143() {
        super(0, false);
    }
}
