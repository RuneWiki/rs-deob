import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class178 extends class89 {

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    private int field3191 = 2048;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    private int field3195 = 1024;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
    private int field3200 = 3072;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "Lha;")
    public static class46 field3196 = class271.method1828(" loggt sich aus)3", -46);

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "Lha;")
    public static class46 field3194 = class271.method1828("Texturen geladen)3", -46);

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "Z")
    public static boolean field3198 = true;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "Lha;")
    public static class46 field3197 = class271.method1828("blinken2:", -46);

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "Lha;")
    public static class46 field3202 = class271.method1828(" loggt sich ein)3", -46);

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 25) {
            this.method14((class75) null, 92, 13);
        }
        ++field3186;
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028) {
            int[][] var4 = this.method689((byte) 95, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class241.field4284 < ~var11; ++var11) {
                var9[var11] = (var5[var11] * this.field3191 >> 12) + this.field3195;
                var8[var11] = (var6[var11] * this.field3191 >> 12) + this.field3195;
                var10[var11] = (var7[var11] * this.field3191 >> 12) + this.field3195;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        if (arg0) {
            ++field3187;
            this.field3191 = -this.field3195 + this.field3200;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBII)V")
    public static final void method1271(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field3185;
        class58.field967.field1380 = 0;
        class58.field967.method570(156, 15619);
        class58.field967.method570(arg4, 15619);
        class58.field967.method570(arg1, 15619);
        class58.field967.method546((byte) 117, arg0);
        class58.field967.method546((byte) 109, arg3);
        int var5 = -9 % ((arg2 - -13) / 36);
        class105.field1882 = 0;
        class207.field3716 = -3;
        class78.field1481 = 1;
        class69.field1193 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    public static final void method1272(boolean arg0) {
        ++field3192;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~var2 > ~(class242.field4290 + -1); ++var2) {
                if (class215.field3807[var2] < 1000 && class215.field3807[var2 + 1] > 1000) {
                    var1 = false;
                    class46 var3 = class162.field2855[var2];
                    class162.field2855[var2] = class162.field2855[var2 + 1];
                    class162.field2855[var2 - -1] = var3;
                    class46 var4 = class275.field4795[var2];
                    class275.field4795[var2] = class275.field4795[var2 + 1];
                    class275.field4795[var2 - -1] = var4;
                    int var5 = class270.field4706[var2];
                    class270.field4706[var2] = class270.field4706[var2 - -1];
                    class270.field4706[var2 - -1] = var5;
                    int var6 = class4.field69[var2];
                    class4.field69[var2] = class4.field69[var2 + 1];
                    class4.field69[var2 + 1] = var6;
                    short var7 = class215.field3807[var2];
                    class215.field3807[var2] = class215.field3807[var2 + 1];
                    class215.field3807[var2 + 1] = var7;
                    long var8 = class31.field590[var2];
                    class31.field590[var2] = class31.field590[var2 - -1];
                    class31.field590[var2 - -1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLha;)I")
    public static final int method1273(byte arg0, class46 arg1) {
        ++field3188;
        if (class163.field2914 != null && ~arg1.method314(72) != -1) {
            for (int var2 = 0; class163.field2914.field4224 > var2; ++var2) {
                if (class163.field2914.field4232[var2].method324(0, class103.field1864, class16.field229).method329(arg0 ^ -30790, arg1)) {
                    return var2;
                }
            }
            return arg0 != 55 ? 38 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public static void method1274(int arg0) {
        if (arg0 != -15237) {
            field3196 = null;
        }
        field3196 = null;
        field3197 = null;
        field3202 = null;
        field3194 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII)V")
    public static final void method1275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 77) {
            field3196 = null;
        }
        ++field3201;
        if (~arg0 == ~arg5) {
            class107.method837(100, arg4, arg5, arg3, arg2);
        } else if (-arg5 + arg3 >= class135.field2445 && ~class73.field1309 <= ~(arg3 + arg5) && ~class4.field70 >= ~(-arg0 + arg4) && arg0 + arg4 <= class70.field1205) {
            class12.method64(arg5, arg3, arg2, arg0, -1191017215, arg4);
        } else {
            class249.method1692(arg2, arg4, (byte) 127, arg0, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field3193;
        int[] var3 = super.field1688.method936(1, arg0);
        int var4 = -37 % ((arg1 - 51) / 44);
        if (super.field1688.field2200) {
            int[] var5 = this.method685(-128, arg0, 0);
            for (int var6 = 0; class241.field4284 > var6; ++var6) {
                var3[var6] = this.field3195 - -(var5[var6] * this.field3191 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public static final void method1276(int arg0) {
        if (class147.field2655 > 0) {
            --class147.field2655;
        }
        if (class244.field4335 > 1) {
            class273.field4768 = class86.field1635;
            --class244.field4335;
        }
        ++field3189;
        if (class140.field2507) {
            class140.field2507 = false;
            class68.method495(arg0 + -32517);
        } else {
            for (int var1 = 0; var1 < 100 && class85.method666((byte) -126); ++var1) {
            }
            if (class135.field2448 == 30) {
                class206.method1462(arg0 ^ arg0, class58.field967, 203);
                Object var2 = class252.field4439.field24;
                synchronized (class252.field4439.field24) {
                    if (!class229.field3999) {
                        class252.field4439.field28 = 0;
                    } else if (class71.field1270 != 0 || class252.field4439.field28 >= 40) {
                        ++class187.field3342;
                        class58.field967.method285((byte) -90, 45);
                        class58.field967.method570(0, 15619);
                        int var3 = class58.field967.field1380;
                        int var4 = 0;
                        for (int var5 = 0; var5 < class252.field4439.field28 && ~(-var3 + class58.field967.field1380) > -241; ++var5) {
                            int var6 = class252.field4439.field27[var5];
                            ++var4;
                            if (~var6 > -1) {
                                var6 = 0;
                            } else if (var6 > 65534) {
                                var6 = 65534;
                            }
                            boolean var7 = false;
                            int var8 = class252.field4439.field26[var5];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 65534) {
                                var8 = 65534;
                            }
                            if (class252.field4439.field27[var5] == -1 && ~class252.field4439.field26[var5] == 0) {
                                var8 = -1;
                                var6 = -1;
                                var7 = true;
                            }
                            if (class171.field3054 == var8 && class4.field66 == var6) {
                                if (~class251.field4432 > -2048) {
                                    ++class251.field4432;
                                }
                            } else {
                                int var9 = -class171.field3054 + var8;
                                class171.field3054 = var8;
                                int var10 = var6 - class4.field66;
                                class4.field66 = var6;
                                if (class251.field4432 < 8 && ~var9 <= 31 && ~var9 >= -32 && var10 >= -32 && var10 <= 31) {
                                    var10 += 32;
                                    var9 += 32;
                                    class58.field967.method546((byte) 115, (class251.field4432 << 12) - -(var9 << 6) + var10);
                                    class251.field4432 = 0;
                                } else if (~class251.field4432 > -33 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                                    class58.field967.method570(class251.field4432 + 128, 15619);
                                    var9 += 128;
                                    var10 += 128;
                                    class58.field967.method546((byte) 102, (var9 << 8) - -var10);
                                    class251.field4432 = 0;
                                } else if (~class251.field4432 > -33) {
                                    class58.field967.method570(class251.field4432 + 192, 15619);
                                    if (!var7) {
                                        class58.field967.method581(true, var6 << 16 | var8);
                                    } else {
                                        class58.field967.method581(true, Integer.MIN_VALUE);
                                    }
                                    class251.field4432 = 0;
                                } else {
                                    class58.field967.method546((byte) 110, class251.field4432 + 57344);
                                    if (!var7) {
                                        class58.field967.method581(true, var6 << 16 | var8);
                                    } else {
                                        class58.field967.method581(true, Integer.MIN_VALUE);
                                    }
                                    class251.field4432 = 0;
                                }
                            }
                        }
                        class58.field967.method556(-var3 + class58.field967.field1380, 18);
                        if (var4 < class252.field4439.field28) {
                            class252.field4439.field28 -= var4;
                            for (int var11 = 0; class252.field4439.field28 > var11; ++var11) {
                                class252.field4439.field26[var11] = class252.field4439.field26[var4 + var11];
                                class252.field4439.field27[var11] = class252.field4439.field27[var4 + var11];
                            }
                        } else {
                            class252.field4439.field28 = 0;
                        }
                    }
                }
                if (class71.field1270 != 0) {
                    byte var12 = 0;
                    if (class71.field1270 == 2) {
                        var12 = 1;
                    }
                    long var13 = (-class222.field3912 + class146.field2645) / 50L;
                    int var15 = class143.field2607;
                    if (var13 > 32767L) {
                        var13 = 32767L;
                    }
                    class222.field3912 = class146.field2645;
                    ++class65.field1093;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -65536) {
                        var15 = 65535;
                    }
                    int var16 = (int) var13;
                    int var17 = class100.field1850;
                    if (var17 >= 0) {
                        if (~var17 < -65536) {
                            var17 = 65535;
                        }
                    } else {
                        var17 = 0;
                    }
                    class58.field967.method285((byte) -90, 208);
                    class58.field967.method575(var17 | var15 << 16, 125);
                    class58.field967.method582(-95, var16 | var12 << 15);
                }
                if (class162.field2878[96] || class162.field2878[97] || class162.field2878[98] || class162.field2878[99]) {
                    class237.field4193 = true;
                }
                if (class221.field3892 > 0) {
                    --class221.field3892;
                }
                if (class237.field4193 && class221.field3892 <= 0) {
                    class237.field4193 = false;
                    ++class14.field216;
                    class221.field3892 = 20;
                    class58.field967.method285((byte) -90, 235);
                    class58.field967.method547((byte) -67, class249.field4414);
                    class58.field967.method582(-91, class207.field3710);
                }
                if (class216.field3828 && !class58.field973) {
                    ++class230.field4007;
                    class58.field973 = true;
                    class58.field967.method285((byte) -90, 76);
                    class58.field967.method570(1, arg0 + 15588);
                }
                if (!class216.field3828 && class58.field973) {
                    ++class230.field4007;
                    class58.field973 = false;
                    class58.field967.method285((byte) -90, 76);
                    class58.field967.method570(0, 15619);
                }
                if (!field3198) {
                    class58.field967.method285((byte) -90, 87);
                    class58.field967.method581(true, class209.method1476(0));
                    field3198 = true;
                    ++class271.field4723;
                }
                class48.method359(0);
                if (~class135.field2448 == -31) {
                    class173.method1231(arg0 + 169);
                    class118.method947(0);
                    ++class215.field3813;
                    if (~class215.field3813 < -751) {
                        class68.method495(arg0 ^ -32507);
                    } else {
                        class254.method1713(2047);
                        class186.method1353(13897);
                        class66.method458(-29393);
                        if (class188.field3350 != null) {
                            class149.method1100((byte) -112);
                        }
                        for (int var18 = class17.method90(256, true); var18 != -1; var18 = class17.method90(256, false)) {
                            class52.method379(var18, arg0 ^ 831);
                            class105.field1890[class50.method369(class87.field1647++, 31)] = var18;
                        }
                        for (class146 var19 = class48.method358(-1191); var19 != null; var19 = class48.method358(arg0 + -1222)) {
                            int var20 = var19.method1087(true);
                            int var21 = var19.method1086(false);
                            if (~var20 == -2) {
                                class240.field4268[var21] = var19.field2640;
                                class139.field2496[class50.method369(class100.field1841++, 31)] = var21;
                            } else if (~var20 != -3) {
                                if (var20 != 3) {
                                    if (var20 == 4) {
                                        class24 var22 = class13.method73(1506528624, var21);
                                        int var23 = var19.field2640;
                                        int var24 = var19.field2637;
                                        if (~var22.field359 != ~var23 || ~var22.field486 != ~var24) {
                                            var22.field359 = var23;
                                            var22.field486 = var24;
                                            class226.method1549(false, var22);
                                        }
                                    } else if (~var20 == -6) {
                                        class24 var25 = class13.method73(1506528624, var21);
                                        if (~var19.field2640 != ~var25.field352 || var19.field2640 == -1) {
                                            var25.field419 = 0;
                                            var25.field434 = 0;
                                            var25.field352 = var19.field2640;
                                            class226.method1549(false, var25);
                                        }
                                    } else if (~var20 != -7) {
                                        if (~var20 == -8) {
                                            class24 var26 = class13.method73(1506528624, var21);
                                            boolean var27 = var19.field2640 == 1;
                                            if (var27 == !var26.field495) {
                                                var26.field495 = var27;
                                                class226.method1549(false, var26);
                                            }
                                        } else if (var20 != 8) {
                                            if (var20 == 9) {
                                                class24 var28 = class13.method73(arg0 + 1506528593, var21);
                                                if (~var19.field2640 != ~var28.field348 || var19.field2637 != var28.field355) {
                                                    var28.field348 = var19.field2640;
                                                    var28.field355 = var19.field2637;
                                                    class226.method1549(false, var28);
                                                }
                                            } else if (var20 != 10) {
                                                if (var20 == 11) {
                                                    class24 var29 = class13.method73(1506528624, var21);
                                                    var29.field391 = 0;
                                                    var29.field492 = 0;
                                                    var29.field421 = var29.field430 = var19.field2640;
                                                    var29.field501 = var29.field502 = var19.field2637;
                                                    class226.method1549(false, var29);
                                                } else if (var20 == 12) {
                                                    class24 var30 = class13.method73(arg0 + 1506528593, var21);
                                                    int var31 = var19.field2640;
                                                    if (var30 != null && ~var30.field485 == -1) {
                                                        if (-var30.field341 + var30.field350 < var31) {
                                                            var31 = -var30.field341 + var30.field350;
                                                        }
                                                        if (var31 < 0) {
                                                            var31 = 0;
                                                        }
                                                        if (var30.field412 != var31) {
                                                            var30.field412 = var31;
                                                            class226.method1549(false, var30);
                                                        }
                                                    }
                                                } else if (var20 == 13) {
                                                    class24 var32 = class13.method73(1506528624, var21);
                                                    var32.field418 = var19.field2640;
                                                }
                                            } else {
                                                class24 var33 = class13.method73(1506528624, var21);
                                                if (var19.field2640 != var33.field445 || var19.field2637 != var33.field413 || ~var19.field2643 != ~var33.field475) {
                                                    var33.field445 = var19.field2640;
                                                    var33.field475 = var19.field2643;
                                                    var33.field413 = var19.field2637;
                                                    class226.method1549(false, var33);
                                                }
                                            }
                                        } else {
                                            class24 var34 = class13.method73(1506528624, var21);
                                            if (~var19.field2640 != ~var34.field373 || ~var19.field2637 != ~var34.field473 || ~var19.field2643 != ~var34.field345) {
                                                var34.field345 = var19.field2643;
                                                if (var34.field348 != -1) {
                                                    if (~var34.field410 >= -1) {
                                                        if (~var34.field467 < -1) {
                                                            var34.field345 = var34.field345 * 32 / var34.field467;
                                                        }
                                                    } else {
                                                        var34.field345 = var34.field345 * 32 / var34.field410;
                                                    }
                                                }
                                                var34.field373 = var19.field2640;
                                                var34.field473 = var19.field2637;
                                                class226.method1549(false, var34);
                                            }
                                        }
                                    } else {
                                        int var35 = var19.field2640;
                                        int var36 = 31 & var35 >> 5;
                                        int var37 = 31 & var35;
                                        int var38 = (var35 & 32382) >> 10;
                                        class24 var39 = class13.method73(1506528624, var21);
                                        int var40 = (var36 << 11) + (var37 << 3) + (var38 << 19);
                                        if (var39.field344 != var40) {
                                            var39.field344 = var40;
                                            class226.method1549(false, var39);
                                        }
                                    }
                                } else {
                                    class24 var41 = class13.method73(1506528624, var21);
                                    if (!var19.field2642.method340((byte) 97, var41.field411)) {
                                        var41.field411 = var19.field2642;
                                        class226.method1549(false, var41);
                                    }
                                }
                            } else {
                                class2.field31[var21] = var19.field2642;
                                class189.field3381[class50.method369(class85.field1626++, 31)] = var21;
                            }
                        }
                        ++class237.field4202;
                        if (~class126.field2313 != -1) {
                            class58.field964 += 20;
                            if (class58.field964 >= 400) {
                                class126.field2313 = 0;
                            }
                        }
                        if (class5.field81 != null) {
                            ++class194.field3488;
                            if (class194.field3488 >= 15) {
                                class226.method1549(false, class5.field81);
                                class5.field81 = null;
                            }
                        }
                        if (class144.field2622 != null) {
                            class226.method1549(false, class144.field2622);
                            ++class196.field3505;
                            if (class43.field733 + 5 < class7.field116 || ~(class43.field733 + -5) < ~class7.field116 || class208.field3735 > class57.field957 + 5 || class57.field957 - 5 > class208.field3735) {
                                class16.field244 = true;
                            }
                            if (~class177.field3183 == -1) {
                                if (class16.field244 && ~class196.field3505 <= -6) {
                                    if (class169.field3015 == class144.field2622 && ~class53.field917 != ~class4.field76) {
                                        class24 var42 = class144.field2622;
                                        ++class162.field2852;
                                        byte var43 = 0;
                                        if (class277.field4828 == 1 && var42.field407 == 206) {
                                            var43 = 1;
                                        }
                                        if (var42.field498[class53.field917] <= 0) {
                                            var43 = 0;
                                        }
                                        if (class107.method835(0, client.method1811(var42))) {
                                            int var44 = class53.field917;
                                            int var45 = class4.field76;
                                            var42.field498[var44] = var42.field498[var45];
                                            var42.field483[var44] = var42.field483[var45];
                                            var42.field498[var45] = -1;
                                            var42.field483[var45] = 0;
                                        } else if (~var43 == -2) {
                                            int var46 = class4.field76;
                                            int var47 = class53.field917;
                                            while (var46 != var47) {
                                                if (var47 >= var46) {
                                                    if (var46 < var47) {
                                                        var42.method173(var46, -109, var46 - -1);
                                                        ++var46;
                                                    }
                                                } else {
                                                    var42.method173(var46, -119, var46 + -1);
                                                    --var46;
                                                }
                                            }
                                        } else {
                                            var42.method173(class4.field76, -123, class53.field917);
                                        }
                                        class58.field967.method285((byte) -90, 211);
                                        class58.field967.method587(class53.field917, -32389656);
                                        class58.field967.method575(class144.field2622.field374, arg0 ^ 105);
                                        class58.field967.method546((byte) 103, class4.field76);
                                        class58.field967.method570(var43, 15619);
                                    }
                                } else if ((class257.field4476 == 1 || class43.method290(arg0 + -23, class242.field4290 + -1)) && class242.field4290 > 2) {
                                    class150.method1104(2);
                                } else if (~class242.field4290 < -1) {
                                    class221.method1529(0);
                                }
                                class71.field1270 = 0;
                                class194.field3488 = 10;
                                class144.field2622 = null;
                            }
                        }
                        class24 var48 = class216.field3831;
                        class137.field2473 = false;
                        class216.field3831 = null;
                        class24 var49 = class83.field1589;
                        class156.field2787 = 0;
                        class244.field4326 = null;
                        class83.field1589 = null;
                        class130.field2386 = false;
                        while (class114.method925(false) && ~class156.field2787 > -129) {
                            class188.field3355[class156.field2787] = class274.field4784;
                            class126.field2311[class156.field2787] = class244.field4336;
                            ++class156.field2787;
                        }
                        class146.field2641 = null;
                        class188.field3350 = null;
                        if (~class114.field2157 != 0) {
                            class168.method1192(0, (byte) -1, class114.field2157, 0, class163.field2895, 0, class50.field876, 0);
                        }
                        ++class86.field1635;
                        if (class146.field2641 != null) {
                            class71.method512(class146.field2641, false, class203.field3636, class61.field1013);
                            class146.field2641 = null;
                        }
                        while (true) {
                            class275 var50;
                            class24 var51;
                            class24 var52;
                            do {
                                var50 = (class275) class162.field2871.method260((byte) 57);
                                if (var50 == null) {
                                    while (true) {
                                        class275 var53;
                                        class24 var54;
                                        class24 var55;
                                        do {
                                            var53 = (class275) class113.field2133.method260((byte) 57);
                                            if (var53 == null) {
                                                while (true) {
                                                    class275 var56;
                                                    class24 var57;
                                                    class24 var58;
                                                    do {
                                                        var56 = (class275) class271.field4727.method260((byte) 57);
                                                        if (var56 == null) {
                                                            if (class127.field2341 && class188.field3350 == null) {
                                                                class127.field2341 = false;
                                                            }
                                                            if (class259.field4517 != null) {
                                                                class222.method1535((byte) -6);
                                                            }
                                                            if (class245.field4355 > 0 && class162.field2878[82] && class162.field2878[81] && class114.field2152 != 0) {
                                                                int var59 = class135.field2450 - class114.field2152;
                                                                if (var59 >= 0) {
                                                                    if (var59 > 3) {
                                                                        var59 = 3;
                                                                    }
                                                                } else {
                                                                    var59 = 0;
                                                                }
                                                                class237.method1625(var59, (byte) 111, class29.field567 - -class277.field4824.field2523[0], class277.field4824.field2517[0] + class77.field1432);
                                                            }
                                                            if (~class119.field2239 != 0) {
                                                                int var60 = class119.field2239;
                                                                int var61 = class12.field199;
                                                                if (class245.field4355 > 0 && class162.field2878[82] && class162.field2878[81]) {
                                                                    class237.method1625(class135.field2450, (byte) 111, class29.field567 + var60, class77.field1432 + var61);
                                                                } else if (!class83.field1591) {
                                                                    boolean var62 = class112.method916(0, arg0 ^ -10546, class277.field4824.field2523[0], var61, class277.field4824.field2517[0], var60, 0, 0, 0, 0, true, 0);
                                                                    if (var62) {
                                                                        class78.field1493 = class100.field1850;
                                                                        class58.field964 = 0;
                                                                        class277.field4821 = class143.field2607;
                                                                        class126.field2313 = 1;
                                                                    }
                                                                } else {
                                                                    ++class166.field2938;
                                                                    class58.field967.method285((byte) -90, 95);
                                                                    class58.field967.method590(class194.field3477, arg0 + 24);
                                                                    class58.field967.method582(-74, class77.field1432 + var61);
                                                                    class58.field967.method587(class275.field4793, -32389656);
                                                                    class58.field967.method546((byte) 119, class29.field567 + var60);
                                                                    class58.field964 = 0;
                                                                    class126.field2313 = 1;
                                                                    class277.field4821 = class143.field2607;
                                                                    class78.field1493 = class100.field1850;
                                                                }
                                                                class83.field1591 = false;
                                                                class119.field2239 = -1;
                                                            }
                                                            class65.method454(arg0 ^ -66);
                                                            if (class216.field3831 != var48) {
                                                                if (var48 != null) {
                                                                    class226.method1549(false, var48);
                                                                }
                                                                if (class216.field3831 != null) {
                                                                    class226.method1549(false, class216.field3831);
                                                                }
                                                            }
                                                            if (class83.field1589 != var49 && ~class267.field4626 == ~class154.field2727) {
                                                                if (var49 != null) {
                                                                    class226.method1549(false, var49);
                                                                }
                                                                if (class83.field1589 != null) {
                                                                    class226.method1549(false, class83.field1589);
                                                                }
                                                            }
                                                            if (class83.field1589 == null) {
                                                                if (class267.field4626 > 0) {
                                                                    --class267.field4626;
                                                                }
                                                            } else if (class267.field4626 < class154.field2727) {
                                                                ++class267.field4626;
                                                                if (class267.field4626 == class154.field2727) {
                                                                    class226.method1549(false, class83.field1589);
                                                                }
                                                            }
                                                            if (~class154.field2735 == -2) {
                                                                class173.method1239(2);
                                                            } else if (~class154.field2735 == -3) {
                                                                class28.method199(100);
                                                            } else {
                                                                class161.method1175(arg0 ^ 120);
                                                            }
                                                            for (int var63 = 0; var63 < 5; ++var63) {
                                                                int var10002 = class220.field3879[var63]++;
                                                            }
                                                            int var64 = class114.method926(0);
                                                            int var65 = class206.method1456(arg0 + -31);
                                                            if (var64 > 4500 && ~var65 < -4501) {
                                                                class147.field2655 = 250;
                                                                ++class169.field2993;
                                                                class264.method1777((byte) -128, 4000);
                                                                class58.field967.method285((byte) -90, 84);
                                                            }
                                                            if (class12.field193 != null && ~class12.field193.field2925 == -2) {
                                                                if (class12.field193.field2921 != null) {
                                                                    class105.method791((byte) -99, class120.field2247, class236.field4127);
                                                                }
                                                                class12.field193 = null;
                                                                class236.field4127 = false;
                                                                class120.field2247 = null;
                                                            }
                                                            ++class212.field3784;
                                                            ++class277.field4822;
                                                            ++class114.field2161;
                                                            if (class114.field2161 > 500) {
                                                                int var66 = (int) (Math.random() * 8.0D);
                                                                if (~(var66 & 2) == -3) {
                                                                    class6.field102 += class258.field4506;
                                                                }
                                                                class114.field2161 = 0;
                                                                if (~(var66 & 1) == -2) {
                                                                    class31.field593 += class74.field1345;
                                                                }
                                                                if ((var66 & 4) == 4) {
                                                                    class142.field2588 += class15.field227;
                                                                }
                                                            }
                                                            if (~class212.field3784 < -501) {
                                                                class212.field3784 = 0;
                                                                int var67 = (int) (Math.random() * 8.0D);
                                                                if (~(var67 & 2) == -3) {
                                                                    class230.field4003 += class93.field1761;
                                                                }
                                                                if ((var67 & 1) == 1) {
                                                                    class3.field57 += class142.field2591;
                                                                }
                                                            }
                                                            if (class31.field593 < -50) {
                                                                class74.field1345 = 2;
                                                            }
                                                            if (class3.field57 < -60) {
                                                                class142.field2591 = 2;
                                                            }
                                                            if (~class3.field57 < -61) {
                                                                class142.field2591 = -2;
                                                            }
                                                            if (~class6.field102 > 54) {
                                                                class258.field4506 = 2;
                                                            }
                                                            if (class6.field102 > 55) {
                                                                class258.field4506 = -2;
                                                            }
                                                            if (~class31.field593 < -51) {
                                                                class74.field1345 = -2;
                                                            }
                                                            if (~class142.field2588 > 39) {
                                                                class15.field227 = 1;
                                                            }
                                                            if (class230.field4003 < -20) {
                                                                class93.field1761 = 1;
                                                            }
                                                            if (class142.field2588 > 40) {
                                                                class15.field227 = -1;
                                                            }
                                                            if (~class230.field4003 < -11) {
                                                                class93.field1761 = -1;
                                                            }
                                                            if (class277.field4822 > 50) {
                                                                ++class242.field4302;
                                                                class58.field967.method285((byte) -90, 115);
                                                            }
                                                            if (class109.field2060) {
                                                                class259.method1739(14597);
                                                                class109.field2060 = false;
                                                            }
                                                            try {
                                                                if (class71.field1214 != null && ~class58.field967.field1380 < -1) {
                                                                    class71.field1214.method860(0, class58.field967.field1368, class58.field967.field1380, 118);
                                                                    class58.field967.field1380 = 0;
                                                                    class277.field4822 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var68) {
                                                                class68.method495(-32486);
                                                                return;
                                                            }
                                                        }
                                                        var57 = var56.field4792;
                                                        if (var57.field436 < 0) {
                                                            break;
                                                        }
                                                        var58 = class13.method73(1506528624, var57.field440);
                                                    } while (var58 == null || var58.field503 == null || ~var57.field436 <= ~var58.field503.length || var58.field503[var57.field436] != var57);
                                                    class215.method1509(var56, -86);
                                                }
                                            }
                                            var54 = var53.field4792;
                                            if (var54.field436 < 0) {
                                                break;
                                            }
                                            var55 = class13.method73(1506528624, var54.field440);
                                        } while (var55 == null || var55.field503 == null || ~var55.field503.length >= ~var54.field436 || var55.field503[var54.field436] != var54);
                                        class215.method1509(var53, arg0 ^ -46);
                                    }
                                }
                                var51 = var50.field4792;
                                if (~var51.field436 > -1) {
                                    break;
                                }
                                var52 = class13.method73(1506528624, var51.field440);
                            } while (var52 == null || var52.field503 == null || ~var52.field503.length >= ~var51.field436 || var52.field503[var51.field436] != var51);
                            class215.method1509(var50, arg0 ^ 123);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 10) {
            method1276(75);
        }
        ++field3190;
        class146 var5 = class6.method22((byte) 16, 8, arg0);
        var5.method1088(11102);
        var5.field2643 = arg2;
        var5.field2640 = arg4;
        var5.field2637 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1683 = ~arg0.method558(1) == -2;
                }
            } else {
                this.field3200 = arg0.method545((byte) 118);
            }
        } else {
            this.field3195 = arg0.method545((byte) 75);
        }
        ++field3199;
        if (arg1 != -641641492) {
            method1275(-13, -24, -30, 105, 115, -58);
        }
    }
}
