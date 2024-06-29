import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class423 extends class185 {

    @OriginalMember(owner = "client!of", name = "Ac", descriptor = "B")
    private byte field5849 = 0;

    @OriginalMember(owner = "client!of", name = "Lc", descriptor = "I")
    public int field5860 = -1;

    @OriginalMember(owner = "client!of", name = "Hc", descriptor = "I")
    public int field5856 = 0;

    @OriginalMember(owner = "client!of", name = "Bc", descriptor = "B")
    private byte field5850 = 0;

    @OriginalMember(owner = "client!of", name = "ed", descriptor = "I")
    public int field5879 = -1;

    @OriginalMember(owner = "client!of", name = "ad", descriptor = "Z")
    public boolean field5875 = false;

    @OriginalMember(owner = "client!of", name = "Jc", descriptor = "I")
    public int field5858 = -1;

    @OriginalMember(owner = "client!of", name = "jd", descriptor = "I")
    public int field5884 = -1;

    @OriginalMember(owner = "client!of", name = "nd", descriptor = "I")
    public int field5888 = 0;

    @OriginalMember(owner = "client!of", name = "Yc", descriptor = "I")
    public int field5873 = -1;

    @OriginalMember(owner = "client!of", name = "od", descriptor = "I")
    public int field5889 = 255;

    @OriginalMember(owner = "client!of", name = "pd", descriptor = "B")
    private byte field5890 = 0;

    @OriginalMember(owner = "client!of", name = "Nc", descriptor = "I")
    public int field5862 = -1;

    @OriginalMember(owner = "client!of", name = "Ec", descriptor = "I")
    public int field5853 = 0;

    @OriginalMember(owner = "client!of", name = "dd", descriptor = "I")
    public int field5878 = 0;

    @OriginalMember(owner = "client!of", name = "Vc", descriptor = "I")
    public int field5870 = -1;

    @OriginalMember(owner = "client!of", name = "Dc", descriptor = "I")
    public int field5852 = 0;

    @OriginalMember(owner = "client!of", name = "gd", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!of", name = "Cc", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!of", name = "Fc", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!of", name = "Gc", descriptor = "I")
    private int field5855;

    @OriginalMember(owner = "client!of", name = "Ic", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!of", name = "Kc", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!of", name = "Mc", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!of", name = "Oc", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!of", name = "Pc", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!of", name = "Qc", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!of", name = "Rc", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!of", name = "Sc", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!of", name = "Tc", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!of", name = "Wc", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!of", name = "Xc", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!of", name = "bd", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!of", name = "cd", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!of", name = "fd", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!of", name = "hd", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!of", name = "kd", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!of", name = "ld", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!of", name = "md", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!of", name = "qd", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!of", name = "Zc", descriptor = "Lcc;")
    public class339 field5874;

    @OriginalMember(owner = "client!of", name = "Uc", descriptor = "Ljava/lang/String;")
    public String field5869;

    @OriginalMember(owner = "client!of", name = "id", descriptor = "Ljava/lang/String;")
    public String field5883;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lea;ZI)Z")
    private final boolean method2608(class58 arg0, boolean arg1, int arg2) {
        ++field5877;
        int var4 = arg2;
        class60 var5 = this.method1283((byte) 120);
        class83 var6 = super.field2619 != -1 && ~super.field2617 == -1 ? class408.method2521((byte) -5, super.field2619) : null;
        class83 var7 = ~super.field2587 == 0 || this.field5875 || super.field2597 && var6 != null ? null : class408.method2521((byte) 44, super.field2587);
        int var8 = var5.field799;
        int var9 = var5.field766;
        if (var8 != 0 || ~var9 != -1 || var5.field777 != 0 || ~var5.field813 != -1) {
            arg2 |= 7;
        }
        super.field2657[0] = this.field5874.method2073(super.field2620, super.field2588, (byte) 12, super.field2621, arg2, var7, arg1, super.field2626, super.field2648, super.field2593, arg0, super.field2634, var6);
        int var10 = class361.method2223(-1);
        if (~class409.field5703 > -97 && ~var10 < -51) {
            class311.method1883(-9083);
        }
        if (~class88.field1248 != -1 && ~var10 > -51) {
            int var11 = 50 - var10;
            while (class362.field4989 < var11) {
                class320.field4360[class362.field4989] = new byte[102400];
                ++class362.field4989;
            }
            while (~class362.field4989 < ~var11) {
                --class362.field4989;
                class320.field4360[class362.field4989] = null;
            }
        } else if (class88.field1248 != 0) {
            class320.field4360 = new byte[50][];
            class362.field4989 = 0;
        }
        if (super.field2657[0] == null) {
            return false;
        } else {
            super.field2601 = super.field2657[0].method889();
            this.method1295((byte) -53, super.field2657[0]);
            int var12 = super.field2609.method129(2);
            super.field2594 = 0;
            super.field2596 = 0;
            super.field2650 = 0;
            if (~var8 == -1 && var9 == 0) {
                this.method1294(this.method1285(-74) << 7, var12, (byte) -108, this.method1285(-74) << 7);
            } else {
                this.method1294(var8, var12, (byte) -110, var9);
                if (~super.field2596 != -1) {
                    super.field2657[0].method910(super.field2596);
                }
                if (super.field2650 != 0) {
                    super.field2657[0].method873(super.field2650);
                }
                if (~super.field2594 != -1) {
                    super.field2657[0].method882(0, super.field2594, 0);
                }
            }
            super.field2657[1] = null;
            if (!this.field5875 && super.field2636 != -1 && ~super.field2643 != 0) {
                class344 var13 = class186.method1296(super.field2636, false);
                class116 var14 = var13.method2088(super.field2643, super.field2599, (byte) 55, arg0, (!var13.field4639 ? 2 : 7) | var4, super.field2584);
                if (var14 != null) {
                    var14.method882(0, -super.field2605, 0);
                    if (var13.field4639 && (~var8 != -1 || ~var9 != -1)) {
                        if (~super.field2596 != -1) {
                            var14.method910(super.field2596);
                        }
                        if (~super.field2650 != -1) {
                            var14.method873(super.field2650);
                        }
                        if (~super.field2594 != -1) {
                            var14.method882(0, super.field2594, 0);
                        }
                    }
                    super.field2657[1] = var14;
                }
            }
            super.field2657[2] = null;
            if (!this.field5875 && super.field2656 != null) {
                if (super.field2667 <= class246.field3467) {
                    super.field2656 = null;
                }
                if (super.field2673 <= class246.field3467 && ~class246.field3467 > ~super.field2667) {
                    class116 var15 = super.field2656.method705(arg0, (byte) -63, var4 | 7);
                    if (var15 != null) {
                        var15.method882(-super.field40 + super.field2665, -super.field45 + super.field2672, super.field2660 - super.field44);
                        if (var12 != 0) {
                            var15.method867(-var12 & 16383);
                        }
                        super.field2657[2] = var15;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIIB)V")
    public final void method2609(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        super.method1280(this.method1285(-88), 92, arg0, arg1, arg3, arg2);
        ++field5880;
        if (arg4 <= 81) {
            this.field5890 = 125;
        }
    }

    @OriginalMember(owner = "client!of", name = "i", descriptor = "(I)I")
    public final int method1293(int arg0) {
        ++field5876;
        if (arg0 != -3) {
            this.method702((byte) -17);
        }
        return -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLea;Lve;IIIILts;)V")
    private final void method2610(boolean arg0, class58 arg1, class309 arg2, int arg3, int arg4, int arg5, int arg6, class116 arg7) {
        ++field5882;
        int var9 = arg3 * arg3 + arg6 * arg6;
        if (var9 >= 16 && ~arg5 <= ~var9) {
            int var10 = (int) (2607.5945876176133D * Math.atan2((double) arg3, (double) arg6)) & 16383;
            class116 var11 = class152.method1122(arg1, super.field40, super.field44, arg7, 121, var10, super.field2594, super.field2596, super.field2650, super.field45, arg4);
            if (!arg0) {
                this.method699(-35, -93, (class58) null, (class216) null, false, 71, -52);
            }
            if (var11 != null) {
                arg1.method235(false);
                var11.method896(arg2, (class153) null, 0);
                arg1.method235(true);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)I")
    public final int method23(int arg0) {
        if (arg0 >= -84) {
            return -32;
        } else {
            ++field5867;
            return super.field2601;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)Z")
    public final boolean method697(int arg0) {
        ++field5865;
        if (arg0 <= 115) {
            this.method23(5);
        }
        return false;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method2611(boolean arg0, int arg1) {
        if (arg1 != 1713894148) {
            this.method2611(false, 74);
        }
        ++field5861;
        return arg0 ? this.field5883 : this.field5869;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(ILea;)Lms;")
    public final class450 method696(int arg0, class58 arg1) {
        ++field5859;
        if (this.field5874 != null && this.method2608(arg1, true, 1024)) {
            class309 var3 = arg1.method210();
            int var4 = super.field2609.method129(2);
            var3.method1870(var4);
            var3.method1869(super.field40, super.field45, super.field44);
            float var5 = arg1.method268();
            float var6 = arg1.method188();
            if (class404.field5593) {
                class60 var7 = this.method1283((byte) -59);
                if (var7.field805 && (this.field5874.field4589 == -1 || class11.method57(arg0 ^ -14758, this.field5874.field4589).field3311)) {
                    class83 var8 = super.field2619 != -1 && super.field2617 == 0 ? class408.method2521((byte) 125, super.field2619) : null;
                    class83 var9 = ~super.field2587 == 0 || this.field5875 || super.field2597 && var8 != null ? null : class408.method2521((byte) -121, super.field2587);
                    class116 var10 = class155.method1131(var4, 1, super.field2657[0], var9 == null ? var8 : var9, super.field2595, false, super.field2650, super.field2594, var9 == null ? super.field2593 : super.field2621, arg1, 0, 0, 160, super.field2596, 240);
                    if (var10 != null) {
                        arg1.method180(var5, var6 - 128.0F);
                        arg1.method235(false);
                        var10.method896(var3, (class153) null, 0);
                        arg1.method235(true);
                    }
                }
            }
            if (class359.field4970 == this) {
                arg1.method180(var5, var6 - 144.0F);
                var3.method1866(super.field40, super.field45, super.field44);
                for (int var11 = class273.field3733.length + -1; var11 >= 0; --var11) {
                    class418 var12 = class273.field3733[var11];
                    if (var12 != null && ~var12.field5793 != 0) {
                        if (~var12.field5792 == -2 && var12.field5786 >= 0 && class428.field5951.length > var12.field5786) {
                            class419 var13 = class428.field5951[var12.field5786];
                            if (var13 != null) {
                                int var14 = var13.field40 / 32 - class359.field4970.field40 / 32;
                                int var15 = var13.field44 / 32 + -(class359.field4970.field44 / 32);
                                this.method2610(true, arg1, var3, var14, var12.field5793, 360000, var15, super.field2657[0]);
                            }
                        }
                        if (var12.field5792 == 2) {
                            int var16 = (-class6.field65 + var12.field5778) * 4 + -(class359.field4970.field40 / 32) + 2;
                            int var17 = (-class371.field5148 + var12.field5785) * 4 + 2 + -(class359.field4970.field44 / 32);
                            int var18 = var12.field5787 * 4;
                            int var19 = var18 * var18;
                            this.method2610(true, arg1, var3, var16, var12.field5793, var19, var17, super.field2657[0]);
                        }
                        if (~var12.field5792 == -11 && var12.field5786 >= 0 && var12.field5786 < class87.field1227.length) {
                            class423 var20 = class87.field1227[var12.field5786];
                            if (var20 != null) {
                                int var21 = var20.field40 / 32 - class359.field4970.field40 / 32;
                                int var22 = var20.field44 / 32 - class359.field4970.field44 / 32;
                                this.method2610(true, arg1, var3, var21, var12.field5793, 360000, var22, super.field2657[0]);
                            }
                        }
                    }
                }
                var3.method1870(var4);
                var3.method1869(super.field40, super.field45, super.field44);
            }
            arg1.method180(var5, var6);
            class450 var23 = class61.method494(arg0 + -43, super.field2657.length);
            if (super.field2658 == null) {
                arg1.method167(super.field2657, var3, var23.field6451, class359.field4970 == this ? 1 : 0);
            } else {
                class174 var24 = super.field2658.method1552();
                arg1.method225(super.field2657, var24, var3, var23.field6451, class359.field4970 != this ? 0 : 1);
            }
            this.method1282(arg0 + arg0, false, super.field2657, arg1);
            if (super.field2657[2] != null) {
                if (~var4 != -1) {
                    super.field2657[2].method867(var4);
                }
                super.field2657[2].method882(-super.field2665 + super.field40, -super.field2672 + super.field45, super.field44 - super.field2660);
            }
            return var23;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)I")
    public final int method1285(int arg0) {
        if (arg0 > -65) {
            return 122;
        } else {
            ++field5863;
            return this.field5874 != null && this.field5874.field4589 != -1 ? class11.method57(-14758, this.field5874.field4589).field3278 : super.method1285(-124);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILea;Lac;ZII)V")
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 != 22546) {
            this.method2616(-62, 45, -28);
        }
        ++field5851;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lea;I)V")
    public final void method707(class58 arg0, int arg1) {
        ++field5891;
        if (this.field5874 != null) {
            if (super.field2670 || this.method2608(arg0, true, 0)) {
                this.method1282(0, super.field2670, super.field2657, arg0);
                if (arg1 >= -99) {
                    this.field5873 = 55;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZB)Ljava/lang/String;")
    public final String method2612(boolean arg0, byte arg1) {
        ++field5868;
        String var3 = "";
        if (class271.field3710 != null) {
            var3 = var3 + class271.field3710[this.field5849];
        }
        int[] var4;
        if (this.field5890 == 1 && class210.field2934 != null) {
            var4 = class210.field2934;
        } else {
            var4 = class185.field2603;
        }
        if (arg1 <= 94) {
            return null;
        } else {
            if (var4 != null && var4[this.field5849] != -1) {
                class394 var5 = class177.method1255(var4[this.field5849], -78);
                if (~var5.field5467 != -116) {
                    class48.method399((byte) 86, new Throwable(), "gdn1");
                    var4[this.field5849] = -1;
                } else {
                    var3 = var3 + var5.method2444(86, this.field5850 & 255);
                }
            }
            String var6;
            if (arg0) {
                var6 = var3 + this.field5883;
            } else {
                var6 = var3 + this.field5869;
            }
            if (class221.field3105 != null) {
                var6 = var6 + class221.field3105[this.field5849];
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!of", name = "j", descriptor = "(I)V")
    public static final void method2613(int arg0) {
        ++field5857;
        class367.field5097.method2530((byte) -62);
        if (arg0 != 7) {
            field5881 = -46;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
    public static final void method2614(boolean arg0) {
        ++field5886;
        if (~class451.field6496 == -20) {
            int var1 = class75.field1068.method2277((byte) 116);
            int var2 = ((115 & var1) >> 4) + class56.field732;
            int var3 = (var1 & 7) + class412.field5730;
            int var4 = class75.field1068.method2266(255);
            int var5 = class75.field1068.method2304(false);
            if (~var2 <= -1 && ~var3 <= -1 && ~var2 > ~class11.field107 && var3 < class264.field3620) {
                class261.method1682(var3, new class278(var5, var4), 1, class343.field4623, var2);
                class177.method1258((byte) -81, var3, class343.field4623, var2);
            }
        } else if (class451.field6496 == 199) {
            int var6 = class75.field1068.method2266(255);
            int var7 = class75.field1068.method2291(-15939);
            int var8 = class75.field1068.method2304(false);
            int var9 = class75.field1068.method2292(true);
            int var10 = (var9 >> 4 & 7) + class56.field732;
            int var11 = class412.field5730 - -(var9 & 7);
            if (~var10 <= -1 && var11 >= 0 && ~class11.field107 < ~var10 && ~class264.field3620 < ~var11 && class217.field3030 != var6) {
                class261.method1682(var11, new class278(var8, var7), 1, class343.field4623, var10);
                class177.method1258((byte) 49, var11, class343.field4623, var10);
            }
        } else if (class451.field6496 == 109) {
            int var12 = class75.field1068.method2277((byte) 122);
            int var13 = (var12 >> 4 & 7) + class56.field732;
            int var14 = (var12 & 7) + class412.field5730;
            int var15 = class75.field1068.method2291(-15939);
            if (~var13 <= -1 && var14 >= 0 && class11.field107 > var13 && var14 < class264.field3620) {
                class119 var16 = (class119) class417.field5771.method837((byte) -72, (long) (var14 << 14 | class343.field4623 << 28 | var13));
                if (var16 != null) {
                    for (class278 var17 = (class278) var16.field1805.method1173(0); var17 != null; var17 = (class278) var16.field1805.method1165(true)) {
                        if ((var15 & 32767) == var17.field3795) {
                            var17.method1884(!arg0);
                            break;
                        }
                    }
                    if (var16.field1805.method1167(-59)) {
                        var16.method1884(false);
                    }
                    class177.method1258((byte) -47, var14, class343.field4623, var13);
                }
            }
        } else if (class451.field6496 == 37) {
            int var18 = class75.field1068.method2297(13352);
            int var19 = class75.field1068.method2306((byte) 41);
            class133.method996((byte) -19, var18).method2764(-31236, var19);
        } else if (class451.field6496 == 127) {
            int var20 = class75.field1068.method2292(true);
            int var21 = var20 >> 2;
            int var22 = var20 & 3;
            int var23 = class160.field2279[var21];
            int var24 = class75.field1068.method2292(true);
            int var25 = class56.field732 - -((var24 & 113) >> 4);
            int var26 = (var24 & 7) + class412.field5730;
            if (~var25 <= -1 && ~var26 <= -1 && ~class11.field107 < ~var25 && ~var26 > ~class264.field3620) {
                class229.method1495(var26, var23, (byte) -53, class343.field4623, var25, -1, 0, var22, -1, var21);
            }
        } else if (~class451.field6496 == -151) {
            int var27 = class75.field1068.method2306((byte) 90);
            int var28 = ((241 & var27) >> 4) + class56.field732 * 2;
            int var29 = (15 & var27) + class412.field5730 * 2;
            int var30 = class75.field1068.method2289((byte) -77) + var28;
            int var31 = class75.field1068.method2289((byte) -77) + var29;
            int var32 = class75.field1068.method2257((byte) 110);
            int var33 = class75.field1068.method2257((byte) 110);
            int var34 = class75.field1068.method2297(13352);
            int var35 = class75.field1068.method2289((byte) -77);
            int var36 = class75.field1068.method2306((byte) 56) * 4;
            int var37 = class75.field1068.method2297(13352);
            int var38 = class75.field1068.method2297(13352);
            int var39 = class75.field1068.method2306((byte) 99);
            int var40 = class75.field1068.method2306((byte) 28);
            if (~var39 == -256) {
                var39 = -1;
            }
            if (var28 >= 0 && var29 >= 0 && ~(class11.field107 * 2) < ~var28 && ~(class11.field107 * 2) < ~var29 && var30 >= 0 && var31 >= 0 && class264.field3620 * 2 > var30 && class264.field3620 * 2 > var31 && ~var34 != -65536) {
                int var41 = var31 * 64;
                int var42 = var29 * 64;
                int var43 = var28 * 64;
                int var44 = var30 * 64;
                if (~var32 != -1) {
                    int var47;
                    class185 var48;
                    if (~var32 <= -1) {
                        int var45 = var32 - 1;
                        int var46 = var45 & 2047;
                        var47 = 15 & var45 >> 11;
                        var48 = class428.field5951[var46];
                    } else {
                        int var49 = -var32 + -1;
                        var47 = (32534 & var49) >> 11;
                        int var50 = 2047 & var49;
                        if (class217.field3030 == var50) {
                            var48 = class359.field4970;
                        } else {
                            var48 = class87.field1227[var50];
                        }
                    }
                    if (var48 != null) {
                        class60 var51 = var48.method1283((byte) -125);
                        if (var51.field788 != null && var51.field788[var47] != null) {
                            int var52 = var51.field788[var47][0];
                            int var53 = var51.field788[var47][2];
                            int var54 = var48.field2609.method129(2);
                            int var55 = class136.field2021[var54];
                            int var56 = class136.field2020[var54];
                            int var57 = var53 * var55 - -(var52 * var56) >> 15;
                            int var58 = var53 * var56 - var52 * var55 >> 15;
                            var35 -= var51.field788[var47][1];
                            var43 += var57;
                            var42 += var58;
                        }
                    }
                }
                class127 var60 = new class127(var34, class343.field4623, var43, var42, class50.method408(class343.field4623, var43, var42, 16) + -var35, class246.field3467 + var37, class246.field3467 + var38, var39, var40, var33, var36);
                var60.method959(var41, var44, -var36 + class50.method408(class343.field4623, var44, var41, 16), 1, var37 - -class246.field3467);
                class48.field612.method1162(125, new class261(var60));
            }
        } else if (~class451.field6496 != -191) {
            if (class451.field6496 == 191) {
                int var69 = class75.field1068.method2306((byte) 38);
                int var70 = (var69 >> 4 & 7) + class56.field732;
                int var71 = (var69 & 7) + class412.field5730;
                int var72 = class75.field1068.method2297(13352);
                int var73 = class75.field1068.method2306((byte) 102);
                int var74 = class75.field1068.method2297(13352);
                if (~var70 <= -1 && var71 >= 0 && class11.field107 > var70 && ~class264.field3620 < ~var71) {
                    int var75 = var70 * 128 + 64;
                    int var76 = var71 * 128 - -64;
                    class427 var77 = new class427(var72, var74, class246.field3467, class343.field4623, var75, -var73 + class50.method408(class343.field4623, var75, var76, 16), var76, var70, var70, var71, var71);
                    class196.field2843.method1162(123, new class284(var77));
                }
            } else if (class451.field6496 == 240) {
                class75.field1068.method2306((byte) 45);
                int var78 = class75.field1068.method2306((byte) 77);
                int var79 = (7 & var78 >> 4) + class56.field732;
                int var80 = (7 & var78) + class412.field5730;
                int var81 = class75.field1068.method2297(13352);
                int var82 = class75.field1068.method2306((byte) 57);
                int var83 = class75.field1068.method2263((byte) 10);
                String var84 = class75.field1068.method2255(-32226);
                class55.method434(var79, var80, var83, var84, var82, var81, 106);
            } else if (~class451.field6496 == -235) {
                int var85 = class75.field1068.method2306((byte) 52);
                int var86 = ((113 & var85) >> 4) + class56.field732;
                int var87 = (var85 & 7) + class412.field5730;
                int var88 = class75.field1068.method2289((byte) -77) + var86;
                int var89 = var87 - -class75.field1068.method2289((byte) -77);
                int var90 = class75.field1068.method2257((byte) 110);
                int var91 = class75.field1068.method2297(13352);
                int var92 = class75.field1068.method2306((byte) 87) * 4;
                int var93 = class75.field1068.method2306((byte) 44) * 4;
                int var94 = class75.field1068.method2297(13352);
                int var95 = class75.field1068.method2297(13352);
                int var96 = class75.field1068.method2306((byte) 121);
                if (~var96 == -256) {
                    var96 = -1;
                }
                int var97 = class75.field1068.method2306((byte) 75);
                if (var86 >= 0 && var87 >= 0 && class11.field107 > var86 && var87 < class264.field3620 && ~var88 <= -1 && var89 >= 0 && var88 < class11.field107 && ~class264.field3620 < ~var89 && ~var91 != -65536) {
                    int var98 = var88 * 128 + 64;
                    int var99 = var86 * 128 + 64;
                    int var100 = var89 * 128 + 64;
                    int var101 = var87 * 128 + 64;
                    class127 var102 = new class127(var91, class343.field4623, var99, var101, -var92 + class50.method408(class343.field4623, var99, var101, 16), class246.field3467 + var94, var95 - -class246.field3467, var96, var97, var90, var93);
                    var102.method959(var100, var98, class50.method408(class343.field4623, var98, var100, 16) - var93, 1, class246.field3467 + var94);
                    class48.field612.method1162(120, new class261(var102));
                }
            } else if (~class451.field6496 == -194) {
                int var103 = class75.field1068.method2291(-15939);
                if (~var103 == -65536) {
                    var103 = -1;
                }
                int var104 = class75.field1068.method2292(true);
                int var105 = var104 >> 2;
                int var106 = var104 & 3;
                int var107 = class160.field2279[var105];
                int var108 = class75.field1068.method2306((byte) 33);
                int var109 = class56.field732 - -(7 & var108 >> 4);
                int var110 = (var108 & 7) + class412.field5730;
                class14.method75(var103, var106, var109, var107, (byte) 11, class343.field4623, var110, var105);
            } else if (~class451.field6496 == -123) {
                int var111 = class75.field1068.method2306((byte) 93);
                int var112 = ((var111 & 122) >> 4) + class56.field732;
                int var113 = (7 & var111) + class412.field5730;
                int var114 = class75.field1068.method2297(13352);
                if (var114 == 65535) {
                    var114 = -1;
                }
                int var115 = class75.field1068.method2306((byte) 109);
                int var116 = 15 & var115 >> 4;
                int var117 = 7 & var115;
                int var118 = class75.field1068.method2306((byte) 105);
                int var119 = class75.field1068.method2306((byte) 101);
                if (~var112 <= -1 && var113 >= 0 && ~class11.field107 < ~var112 && ~var113 > ~class264.field3620) {
                    int var120 = var116 + 1;
                    if (var112 - var120 <= class359.field4970.field2662[0] && ~class359.field4970.field2662[0] >= ~(var112 - -var120) && ~(-var120 + var113) >= ~class359.field4970.field2659[0] && class359.field4970.field2659[0] <= var113 - -var120 && ~class336.field4540 != -1 && var117 > 0 && ~class182.field2561 > -51 && var114 != -1) {
                        class129.field1948[class182.field2561] = var114;
                        class284.field3867[class182.field2561] = var117;
                        class260.field3596[class182.field2561] = var118;
                        class15.field206[class182.field2561] = null;
                        class124.field1875[class182.field2561] = (var113 << 8) + ((var112 << 16) - -var116);
                        class116.field1766[class182.field2561] = var119;
                        ++class182.field2561;
                    }
                }
            } else if (arg0) {
                if (~class451.field6496 == -60) {
                    int var121 = class75.field1068.method2306((byte) 45);
                    int var122 = class56.field732 * 2 - -((253 & var121) >> 4);
                    int var123 = (var121 & 15) + class412.field5730 * 2;
                    int var124 = class75.field1068.method2289((byte) -77) + var122;
                    int var125 = var123 - -class75.field1068.method2289((byte) -77);
                    int var126 = class75.field1068.method2257((byte) 110);
                    int var127 = class75.field1068.method2297(13352);
                    int var128 = 4 * class75.field1068.method2306((byte) 123);
                    int var129 = 4 * class75.field1068.method2306((byte) 77);
                    int var130 = class75.field1068.method2297(13352);
                    int var131 = class75.field1068.method2297(13352);
                    int var132 = class75.field1068.method2306((byte) 115);
                    if (~var132 == -256) {
                        var132 = -1;
                    }
                    int var133 = class75.field1068.method2306((byte) 88);
                    if (var122 >= 0 && var123 >= 0 && ~(class11.field107 * 2) < ~var122 && class11.field107 * 2 > var123 && var124 >= 0 && var125 >= 0 && class264.field3620 * 2 > var124 && ~(class264.field3620 * 2) < ~var125 && var127 != 65535) {
                        int var134 = var124 * 64;
                        int var135 = var123 * 64;
                        int var136 = var125 * 64;
                        int var137 = var122 * 64;
                        class127 var138 = new class127(var127, class343.field4623, var137, var135, -var128 + class50.method408(class343.field4623, var137, var135, 16), class246.field3467 + var130, class246.field3467 + var131, var132, var133, var126, var129);
                        var138.method959(var136, var134, class50.method408(class343.field4623, var134, var136, 16) + -var129, 1, class246.field3467 + var130);
                        class48.field612.method1162(112, new class261(var138));
                    }
                } else {
                    if (~class451.field6496 == -253) {
                        int var139 = class75.field1068.method2266(255);
                        int var140 = class75.field1068.method2304(false);
                        int var141 = class75.field1068.method2291(-15939);
                        int var142 = class75.field1068.method2277((byte) 121);
                        int var143 = class56.field732 - -(7 & var142 >> 4);
                        int var144 = (var142 & 7) + class412.field5730;
                        byte var145 = class75.field1068.method2295(-914108856);
                        byte var146 = class75.field1068.method2246((byte) 73);
                        byte var147 = class75.field1068.method2252(-19684);
                        int var148 = class75.field1068.method2259((byte) -100);
                        int var149 = var148 >> 2;
                        int var150 = var148 & 3;
                        byte var151 = class75.field1068.method2252(-19684);
                        int var152 = class75.field1068.method2264(-30);
                        if (!class354.field4765.method166()) {
                            class166.method1183(var143, var144, var151, var141, var139, var140, var149, var146, var145, var152, var150, var147, -11186);
                        }
                    }
                    if (class451.field6496 == 100) {
                        int var153 = class75.field1068.method2277((byte) 123);
                        int var154 = ((115 & var153) >> 4) + class56.field732;
                        int var155 = (var153 & 7) + class412.field5730;
                        int var156 = class75.field1068.method2266(255);
                        int var157 = class75.field1068.method2259((byte) -100);
                        int var158 = var157 >> 2;
                        int var159 = var157 & 3;
                        int var160 = class160.field2279[var158];
                        if (var154 >= 0 && var155 >= 0 && class11.field107 > var154 && ~var155 > ~class264.field3620) {
                            class229.method1495(var155, var160, (byte) -53, class343.field4623, var154, -1, 0, var159, var156, var158);
                        }
                    }
                }
            }
        } else {
            int var61 = class75.field1068.method2306((byte) 119);
            int var62 = ((120 & var61) >> 4) + class56.field732;
            int var63 = class412.field5730 - -(7 & var61);
            int var64 = class75.field1068.method2297(13352);
            int var65 = class75.field1068.method2297(13352);
            int var66 = class75.field1068.method2297(13352);
            if (class417.field5771 != null && ~var62 <= -1 && var63 >= 0 && ~var62 > ~class11.field107 && var63 < class264.field3620) {
                class119 var67 = (class119) class417.field5771.method837((byte) -72, (long) (class343.field4623 << 28 | var63 << 14 | var62));
                if (var67 != null) {
                    for (class278 var68 = (class278) var67.field1805.method1173(0); var68 != null; var68 = (class278) var67.field1805.method1165(arg0)) {
                        if (~(32767 & var64) == ~var68.field3795 && ~var68.field3793 == ~var65) {
                            var68.method1884(false);
                            var68.field3793 = var66;
                            class261.method1682(var63, var68, 1, class343.field4623, var62);
                            break;
                        }
                    }
                    class177.method1258((byte) -78, var63, class343.field4623, var62);
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)I")
    public final int method1279(byte arg0) {
        ++field5887;
        int var2 = 117 / ((arg0 - -82) / 33);
        return this.field5855;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lrg;B)V")
    public final void method2615(class366 arg0, byte arg1) {
        arg0.field5048 = 0;
        ++field5864;
        int var3 = arg0.method2306((byte) 73);
        this.field5890 = (byte) (1 & var3);
        boolean var4 = ~(2 & var3) != -1;
        boolean var5 = (4 & var3) != 0;
        int var6 = super.method1285(-83);
        this.method1291(((62 & var3) >> 3) + 1, false);
        this.field5849 = (byte) ((214 & var3) >> 6);
        super.field40 += (-var6 + this.method1285(-79)) * 64;
        super.field44 += 64 * (-var6 + this.method1285(-87));
        this.field5850 = arg0.method2289((byte) -77);
        this.field5884 = arg0.method2289((byte) -77);
        this.field5879 = arg0.method2289((byte) -77);
        int var7 = 94 / ((61 - arg1) / 59);
        int var8 = -1;
        this.field5888 = 0;
        int[] var9 = new int[12];
        for (int var10 = 0; ~var10 > -13; ++var10) {
            int var11 = arg0.method2306((byte) 118);
            if (var11 == 0) {
                var9[var10] = 0;
            } else {
                int var12 = arg0.method2306((byte) 34);
                int var13 = (var11 << 8) + var12;
                if (var10 == 0 && ~var13 == -65536) {
                    var8 = arg0.method2297(13352);
                    this.field5888 = arg0.method2306((byte) 92);
                    break;
                }
                if (var13 >= 32768) {
                    int var27 = class194.field2811[var13 - 32768];
                    var9[var10] = class431.method2655(var27, 1073741824);
                    int var28 = class367.method2308(false, var27).field147;
                    if (var28 != 0) {
                        this.field5888 = var28;
                    }
                } else {
                    var9[var10] = class431.method2655(var13 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; ~var15 > -6; ++var15) {
            int var26 = arg0.method2306((byte) 66);
            if (var26 < 0 || ~var26 <= ~class215.field3017[var15].length) {
                var26 = 0;
            }
            var14[var15] = var26;
        }
        this.field5855 = arg0.method2297(13352);
        this.field5883 = arg0.method2255(-32226);
        if (!var4) {
            this.field5869 = this.field5883;
        } else {
            this.field5869 = arg0.method2255(-32226);
        }
        this.field5878 = arg0.method2306((byte) 34);
        if (var5) {
            this.field5856 = arg0.method2297(13352);
            this.field5853 = this.field5878;
            this.field5873 = -1;
        } else {
            this.field5856 = 0;
            this.field5853 = arg0.method2306((byte) 50);
            this.field5873 = arg0.method2306((byte) 31);
            if (this.field5873 == 255) {
                this.field5873 = -1;
            }
        }
        int var16 = this.field5852;
        this.field5852 = arg0.method2306((byte) 119);
        if (~this.field5852 == -1) {
            class35.method316(false, this);
        } else {
            int var17 = this.field5858;
            int var18 = this.field5862;
            int var19 = this.field5870;
            int var20 = this.field5860;
            int var21 = this.field5889;
            this.field5858 = arg0.method2297(13352);
            this.field5862 = arg0.method2297(13352);
            this.field5870 = arg0.method2297(13352);
            this.field5860 = arg0.method2297(13352);
            this.field5889 = arg0.method2306((byte) 48);
            if (~this.field5852 != ~var16 || this.field5858 != var17 || ~this.field5862 != ~var18 || ~this.field5870 != ~var19 || this.field5860 != var20 || this.field5889 != var21) {
                class35.method314(this, (byte) -107);
            }
        }
        if (this.field5874 == null) {
            this.field5874 = new class339();
        }
        int var22 = this.field5874.field4589;
        int[] var23 = this.field5874.field4584;
        this.field5874.method2069(~this.field5890 == -2, var8, var9, -4519, this.method1279((byte) 68), var14);
        if (~var8 != ~var22) {
            super.field40 = super.field2662[0] * 128 - -(64 * this.method1285(-103));
            super.field44 = super.field2659[0] * 128 + 64 * this.method1285(-105);
        }
        if (~super.field2622 == -2048 && var23 != null) {
            for (int var24 = 0; ~var14.length < ~var24; ++var24) {
                if (~var14[var24] != ~var23[var24]) {
                    class393.method2438(0);
                    break;
                }
            }
        }
        if (super.field2658 != null) {
            super.field2658.method1557();
        }
        if (super.field2587 != -1 && super.field2597) {
            class60 var25 = this.method1283((byte) 124);
            if (!var25.method477(super.field2587, (byte) 120)) {
                super.field2597 = false;
                super.field2587 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
    public final void method2616(int arg0, int arg1, int arg2) {
        ++field5885;
        int var4 = super.field2662[0];
        int var5 = super.field2659[0];
        if (~arg1 == -1) {
            --var4;
            ++var5;
        }
        if (arg0 != 22271) {
            this.field5858 = 102;
        }
        if (arg1 == 1) {
            ++var5;
        }
        if (arg1 == 2) {
            ++var5;
            ++var4;
        }
        if (arg1 == 3) {
            --var4;
        }
        if (arg1 == 4) {
            ++var4;
        }
        if (~arg1 == -6) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var5;
        }
        if (~super.field2619 != 0 && class408.method2521((byte) 41, super.field2619).field1149 == 1) {
            super.field2619 = -1;
        }
        if (~arg1 == -8) {
            ++var4;
            --var5;
        }
        if (~super.field2636 != 0) {
            class344 var6 = class186.method1296(super.field2636, false);
            if (var6.field4650 && var6.field4648 != -1 && ~class408.method2521((byte) 30, var6.field4648).field1149 == -2) {
                super.field2636 = -1;
            }
        }
        if (super.field2654 < 9) {
            ++super.field2654;
        }
        for (int var7 = super.field2654; ~var7 < -1; --var7) {
            super.field2662[var7] = super.field2662[var7 + -1];
            super.field2659[var7] = super.field2659[var7 - 1];
            super.field2663[var7] = super.field2663[var7 + -1];
        }
        super.field2662[0] = var4;
        super.field2659[0] = var5;
        super.field2663[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILea;I)Z")
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        ++field5854;
        if (this.field5874 != null && this.method2608(arg2, arg0, 65536)) {
            class309 var5 = arg2.method210();
            int var6 = super.field2609.method129(2);
            if (!arg0) {
                this.field5883 = null;
            }
            var5.method1870(var6);
            var5.method1869(super.field40, super.field45, super.field44);
            for (int var7 = 0; ~super.field2657.length < ~var7; ++var7) {
                if (super.field2657[var7] != null && super.field2657[var7].method898(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        ++field5871;
        if (arg0 == 46) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!of", name = "k", descriptor = "(I)Z")
    public final boolean method2617(int arg0) {
        ++field5872;
        if (this.field5874 == null) {
            return false;
        } else {
            if (arg0 != -1) {
                this.method2612(true, (byte) 29);
            }
            return true;
        }
    }

    static {
        new class368("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field5881 = -1;
    }
}
