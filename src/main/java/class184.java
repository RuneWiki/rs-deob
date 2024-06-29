import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class184 extends class23 {

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    private int field3602 = 0;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    private int field3605 = 0;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    private int field3612 = 1365;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    private int field3615 = 20;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "Li;")
    private static class88 field3604 = class208.method1425(105, "New User");

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "Li;")
    public static class88 field3603 = field3604;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field3606 = 0;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "[I")
    public static int[] field3607;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)I")
    public static final int method1298(boolean arg0, int arg1) {
        ++field3608;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return !arg0 ? 87 : var6 + 1;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
    public static final void method1299(boolean arg0) {
        class134.method895(false, (byte) 49);
        boolean var1 = true;
        ++field3609;
        class196.field3756 = 0;
        for (int var2 = 0; var2 < class167.field3223.length; ++var2) {
            if (class27.field453[var2] != -1 && class167.field3223[var2] == null) {
                class167.field3223[var2] = class27.field451.method941((byte) 56, 0, class27.field453[var2]);
                if (class167.field3223[var2] == null) {
                    var1 = false;
                    ++class196.field3756;
                }
            }
            if (class128.field2404[var2] != -1 && class45.field774[var2] == null) {
                class45.field774[var2] = class27.field451.method951(-14531, class17.field268[var2], class128.field2404[var2], 0);
                if (class45.field774[var2] == null) {
                    var1 = false;
                    ++class196.field3756;
                }
            }
        }
        if (!var1) {
            class203.field3863 = 1;
        } else {
            class113.field2047 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class167.field3223.length < ~var4; ++var4) {
                byte[] var19 = class45.field774[var4];
                if (var19 != null) {
                    int var20 = (class146.field2733[var4] >> 8) * 64 - class223.field4214;
                    int var21 = (class146.field2733[var4] & 255) * 64 + -class190.field3681;
                    if (class137.field2557) {
                        var20 = 10;
                        var21 = 10;
                    }
                    var3 &= class188.method1313(var19, var21, 10880, var20);
                }
            }
            if (!var3) {
                class203.field3863 = 2;
            } else {
                if (~class203.field3863 != -1) {
                    client.method221(class166.method1142(new class88[] { class242.field4480, class222.field4192 }, -3), true, -22717);
                }
                class219.method1481(2);
                class27.method167((byte) 61);
                class85.method579();
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    class166.field3202[var5].method644((byte) 15);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var17 = 0; ~var17 > -105; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            class116.field2100[var6][var17][var18] = 0;
                        }
                    }
                }
                class44.method288(-25844);
                class219.method1481(2);
                System.gc();
                class219.method1481(2);
                class134.method895(true, (byte) 49);
                class208.method1427(1, arg0);
                if (!class137.field2557) {
                    class143.method936(false, 54);
                    class134.method895(true, (byte) 49);
                    class190.method1329(true, false);
                }
                if (class137.field2557) {
                    class36.method239(0, false);
                    class134.method895(true, (byte) 49);
                    class85.method576(false, 22711);
                }
                class27.method167((byte) 61);
                class134.method895(true, (byte) 49);
                class219.method1481(2);
                class78.method523(arg0, false, class166.field3202);
                class134.method895(true, (byte) 49);
                class219.method1481(2);
                int var7 = class28.field468;
                if (~class149.field2909 > ~var7) {
                    var7 = class149.field2909;
                }
                if (~var7 > ~(class149.field2909 + -1)) {
                    int var8 = class149.field2909 + -1;
                }
                if (class245.field4499) {
                    class44.method281(class28.field468);
                } else {
                    class44.method281(0);
                }
                class7.method39(26249);
                for (int var9 = 0; ~var9 > -105; ++var9) {
                    for (int var16 = 0; ~var16 > -105; ++var16) {
                        class29.method175(21280, var9, var16);
                    }
                }
                class219.method1481(2);
                class210.method1439(0);
                class27.method167((byte) 61);
                if (class201.field3834 != null) {
                    class146.field2749.method30((byte) -50, 198);
                    class146.field2749.method338(2112555600, 1057001181);
                    ++class247.field4525;
                }
                if (!class137.field2557) {
                    int var10 = (class140.field2597 + -6) / 8;
                    int var11 = (class110.field2016 + -6) / 8;
                    int var12 = (class140.field2597 + 6) / 8;
                    int var13 = (class110.field2016 + 6) / 8;
                    for (int var14 = var10 + -1; var12 + 1 >= var14; ++var14) {
                        for (int var15 = var11 + -1; var15 <= var13 + 1; ++var15) {
                            if (var10 > var14 || ~var12 > ~var14 || ~var15 > ~var11 || var15 > var13) {
                                class27.field451.method971(class166.method1142(new class88[] { class212.field4020, class170.method1214(var14, 24), class50.field933, class170.method1214(var15, 114) }, -3), -1);
                                class27.field451.method971(class166.method1142(new class88[] { class106.field1930, class170.method1214(var14, -100), class50.field933, class170.method1214(var15, 70) }, -3), -1);
                            }
                        }
                    }
                }
                class131.method883(30, 65536);
                class219.method1481(2);
                class146.field2749.method30((byte) -43, 213);
                class108.method740(false);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 < 19) {
            this.field3602 = 98;
        }
        if (super.field379.field3100) {
            for (int var4 = 0; class70.field1276 > var4; ++var4) {
                int var5 = (class22.field351[var4] << 12) / this.field3612 + this.field3602;
                int var6 = var5;
                int var7 = (class111.field2023[arg0] << 12) / this.field3612 + this.field3605;
                int var8 = var7;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var7;
                int var12 = var7 * var7 >> 12;
                int var13 = 0;
                while (~(var10 + var12) > -16385 && var13 < this.field3615) {
                    var11 = (var9 * var11 >> 12) * 2 - -var8;
                    var9 = -var12 + var10 + var6;
                    ++var13;
                    var12 = var11 * var11 >> 12;
                    var10 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field3615 + -1) < ~var13 ? (var13 << 12) / this.field3615 : 0;
            }
        }
        ++field3613;
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field3605 = arg0.method301(45);
                    }
                } else {
                    this.field3602 = arg0.method301(arg1 ^ -30);
                }
            } else {
                this.field3615 = arg0.method301(28);
            }
        } else {
            this.field3612 = arg0.method301(96);
        }
        if (arg1 != -3) {
            method1300((class144) null, (Component) null, true, (class144) null);
        }
        ++field3614;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lnb;Ljava/awt/Component;ZLnb;)V")
    public static final void method1300(class144 arg0, Component arg1, boolean arg2, class144 arg3) {
        ++field3611;
        if (!class90.field1708) {
            class72.method481();
            byte[] var4 = arg0.method941((byte) 56, 0, class110.field2011);
            class88.field1640 = new class169(var4, arg1);
            class105.field1903 = class88.field1640.method1158();
            class208.field3948 = class122.method828((byte) -70, class151.field2934, arg3);
            class242.field4475 = class122.method828((byte) -70, class104.field1898, arg3);
            class129.field2418 = class122.method828((byte) -70, class157.field3021, arg3);
            class230.field4322 = class122.method832(arg3, 30675, class245.field4504);
            class116.field2097 = class101.method702(arg3, (byte) 30, class150.field2914);
            class3.field32 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                class3.field32[var5] = var5 * 262144;
            }
            for (int var6 = 0; ~var6 > -65; ++var6) {
                class3.field32[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; ++var7) {
                class3.field32[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; ~var8 > -65; ++var8) {
                class3.field32[var8 - -192] = 16777215;
            }
            class15.field234 = new int[256];
            for (int var9 = 0; ~var9 > -65; ++var9) {
                class15.field234[var9] = var9 * 1024;
            }
            for (int var10 = 0; ~var10 > -65; ++var10) {
                class15.field234[var10 - -64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                class15.field234[var11 + 128] = 65535 - -(var11 * 262144);
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                class15.field234[var12 + 192] = 16777215;
            }
            class156.field3016 = new int[256];
            for (int var13 = 0; var13 < 64; ++var13) {
                class156.field3016[var13] = var13 * 4;
            }
            for (int var14 = 0; ~var14 > -65; ++var14) {
                class156.field3016[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                class156.field3016[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                class156.field3016[var16 - -192] = 16777215;
            }
            class157.field3036 = new int[256];
            class221.field4171 = new int[32768];
            class113.field2051 = new int[32768];
            class49.method369((class193) null, 5000);
            class141.field2611 = new int[32768];
            class209.field3972 = class209.field3974;
            class65.field1182 = 0;
            class209.field3961 = false;
            if (class65.field1183 != 0) {
                class131.field2462 = false;
            } else {
                class131.field2462 = true;
            }
            class209.field3969 = class209.field3974;
            class190.field3669 = new int[32768];
            if (!class131.field2462) {
                class106.method732(0, 255, false, class86.field1552, 2, class99.field1816, 0);
            } else {
                class117.method797(25335, 2);
            }
            class147.method990((byte) -112, false);
            class90.field1708 = arg2;
            class221.method1495(35);
            class34.field589 = new class169(128, 254);
            class89.field1676 = new class169(128, 254);
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
    public static void method1301(int arg0) {
        if (arg0 == -1230) {
            field3603 = null;
            field3607 = null;
            field3604 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class184() {
        super(0, true);
    }
}
