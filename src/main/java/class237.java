import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class237 extends class87 {

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    private int field3462 = 16;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    private int field3463 = 2000;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    private int field3467 = 0;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    private int field3471 = 4096;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    private int field3473 = 0;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public static int field3466 = 0;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public static int field3476 = 0;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "[I")
    public static int[] field3464;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field3474;
        if (arg2 != 25645) {
            field3464 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field3471 = arg0.method331(-45);
                        }
                    } else {
                        this.field3467 = arg0.method331(-122);
                    }
                } else {
                    this.field3462 = arg0.method366(-16505);
                }
            } else {
                this.field3463 = arg0.method331(-49);
            }
        } else {
            this.field3473 = arg0.method366(-16505);
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V")
    public static final void method1632(byte arg0) {
        ++field3468;
        class73.method545(false, 30);
        class226.field3323 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~class170.field2576.length < ~var2; ++var2) {
            if (~class279.field4501[var2] != 0 && class170.field2576[var2] == null) {
                class170.field2576[var2] = class296.field4754.method1868(0, class279.field4501[var2], 1);
                if (class170.field2576[var2] == null) {
                    var1 = false;
                    ++class226.field3323;
                }
            }
            if (~class207.field3055[var2] != 0 && class7.field75[var2] == null) {
                class7.field75[var2] = class296.field4754.method1883(0, class207.field3055[var2], 110, class1.field8[var2]);
                if (class7.field75[var2] == null) {
                    ++class226.field3323;
                    var1 = false;
                }
            }
            if (class219.field3199 != null && class128.field2145[var2] == null && ~class219.field3199[var2] != 0) {
                class128.field2145[var2] = class296.field4754.method1883(0, class219.field3199[var2], 65, class1.field8[var2]);
                if (class128.field2145[var2] == null) {
                    ++class226.field3323;
                    var1 = false;
                }
            }
        }
        if (class199.field2937 == null) {
            if (class279.field4502 != null && class147.field2361.method1869((byte) -103, class279.field4502.field3554 + "_labels")) {
                if (!class147.field2361.method1877(class279.field4502.field3554 + "_labels", (byte) -121)) {
                    var1 = false;
                    ++class226.field3323;
                } else {
                    class199.field2937 = class232.method1607(class279.field4502.field3554 + "_labels", class147.field2361, class255.field3857, (byte) -78);
                }
            } else {
                class199.field2937 = new class13(0);
            }
        }
        if (!var1) {
            class52.field722 = 1;
        } else {
            boolean var3 = true;
            class309.field4973 = 0;
            for (int var4 = 0; ~var4 > ~class170.field2576.length; ++var4) {
                byte[] var20 = class7.field75[var4];
                if (var20 != null) {
                    int var21 = (class53.field768[var4] & 255) * 64 + -class149.field2390;
                    int var22 = (class53.field768[var4] >> 8) * 64 + -class163.field2520;
                    if (class308.field4959) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class227.method1571(var20, var21, var22, 6710);
                }
            }
            if (!var3) {
                class52.field722 = 2;
            } else {
                if (arg0 <= 43) {
                    field3466 = 24;
                }
                if (class52.field722 != 0) {
                    class306.method2078(-38, class214.field3146 + "<br>(100%)", true);
                }
                class52.method316((byte) -112);
                class309.method2096(32679);
                boolean var5 = false;
                class68.method512(4, 104, 104, 25, var5);
                for (int var6 = 0; var6 < 4; ++var6) {
                    class235.field3431[var6].method1591(13610);
                }
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    for (int var18 = 0; var18 < 104; ++var18) {
                        for (int var19 = 0; ~var19 > -105; ++var19) {
                            class253.field3806[var7][var18][var19] = 0;
                        }
                    }
                }
                class11.method85(false, (byte) -18);
                class52.method316((byte) -128);
                System.gc();
                class73.method545(true, 30);
                class149.method1114(false, false);
                if (!class308.field4959) {
                    class33.method211(true, false);
                    class73.method545(true, 30);
                    class71.method535(false, 26857);
                    if (class128.field2145 != null) {
                        class128.method972(30004);
                    }
                }
                if (class308.field4959) {
                    class74.method558(false, true);
                    class73.method545(true, 30);
                    class291.method1977(13, false);
                }
                class309.method2096(32679);
                class73.method545(true, 30);
                class296.method2016(class235.field3431, false, 1, class308.field4959 ? class49.field683 : null);
                class73.method545(true, 30);
                int var8 = class259.field4005;
                if (class37.field474 < var8) {
                    var8 = class37.field474;
                }
                if (var8 < class37.field474 + -1) {
                    int var9 = class37.field474 + -1;
                }
                if (!class273.method1903(100)) {
                    class282.method1948(class259.field4005);
                } else {
                    class282.method1948(0);
                }
                class212.method1487(-458444052);
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        class87.method641(var10, 3391, var17);
                    }
                }
                class297.method2019((byte) 118);
                class52.method316((byte) -75);
                class29.method186(8350);
                class309.method2096(32679);
                if (class195.field2881 != null && class281.field4537 != null && class98.field1677 == 25) {
                    class144.field2338.method683(true, 236);
                    ++class107.field1822;
                    class144.field2338.method385(1057001181, 455748840);
                }
                if (!class308.field4959) {
                    int var11 = (class180.field2713 + -6) / 8;
                    int var12 = (class180.field2713 + 6) / 8;
                    int var13 = (class304.field4925 + 6) / 8;
                    int var14 = (class304.field4925 + -6) / 8;
                    for (int var15 = var14 + -1; ~(var13 - -1) <= ~var15; ++var15) {
                        for (int var16 = var11 - 1; var12 - -1 >= var16; ++var16) {
                            if (~var14 < ~var15 || ~var15 < ~var13 || ~var11 < ~var16 || ~var12 > ~var16) {
                                class296.field4754.method1878("m" + var15 + "_" + var16, -1);
                                class296.field4754.method1878("l" + var15 + "_" + var16, -1);
                            }
                        }
                    }
                }
                if (class98.field1677 != 28) {
                    class79.method586(-1, 30);
                    if (class281.field4537 != null) {
                        class144.field2338.method683(true, 113);
                    }
                } else {
                    class79.method586(-1, 10);
                }
                class220.method1534(-8366);
                class52.method316((byte) -79);
                class53.method372((byte) -103);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILlc;)V")
    public static final void method1633(int arg0, class270 arg1) {
        ++field3469;
        class78.field1239 = arg1;
        if (arg0 != 4111) {
            method1632((byte) -50);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBLgg;Lhf;I)V")
    public static final void method1634(int arg0, byte arg1, class66 arg2, class159 arg3, int arg4) {
        ++field3472;
        if (arg2.field990 == null) {
            if (arg3.field2465) {
                return;
            }
        } else {
            int[] var5 = new int[arg2.field990.length];
            boolean var6 = false;
            for (int var7 = 0; ~(var5.length / 2) < ~var7; ++var7) {
                int var12 = arg2.field990[var7 * 2] + arg3.field2476;
                int var13 = -arg2.field990[var7 * 2 + 1] + arg3.field2469;
                int var14 = var5[var7 * 2] = class46.field634 - -((var12 - class46.field630) * (-class46.field634 + class46.field645) / (-class46.field630 + class46.field641));
                int var15 = var5[var7 * 2 + 1] = (-class46.field642 + class46.field640) * (-class46.field638 + var13) / (class46.field633 - class46.field638) + class46.field642;
                if (~class46.field634 > ~var14 && var14 < class46.field645 && var15 > class46.field642 && class46.field640 > var15) {
                    var6 = true;
                }
            }
            if (!var6) {
                return;
            }
            class216.method1506(var5, arg2.field995, arg2.field995 >>> 24);
            for (int var8 = 0; ~var8 > ~(var5.length / 2 + -1); ++var8) {
                class130.method983(var5[var8 * 2], var5[var8 * 2 + 1], var5[(var8 + 1) * 2], var5[var8 * 2 + 1 + 2], arg2.field1021, arg2.field1021 >>> 24);
            }
            class130.method983(var5[var5.length - 2], var5[var5.length + -1], var5[0], var5[1], arg2.field1021, arg2.field1021 >>> 24);
        }
        class1 var9 = new class1(arg3);
        class176 var10 = null;
        if (arg2.field993 != -1) {
            if (arg3.field2470 && arg2.field994 != -1) {
                var10 = (class176) arg2.method499(false, true, true);
            } else {
                var10 = (class176) arg2.method499(false, true, false);
            }
            if (var10 != null) {
                if (~class141.field2276 < -1 && (class131.field2175 != -1 && class131.field2175 == arg3.field2466 || ~class59.field867 != 0 && ~class59.field867 == ~arg2.field987)) {
                    int var11;
                    if (~class284.field4572 >= -51) {
                        var11 = class284.field4572 * 3;
                    } else {
                        var11 = -(class284.field4572 * 3) + 300;
                    }
                    class130.method981(arg3.field2468, arg3.field2474, var10.field2258 / 2 + 7, 16776960, var11);
                    class130.method981(arg3.field2468, arg3.field2474, var10.field2258 / 2 + 5, 16776960, var11);
                    class130.method981(arg3.field2468, arg3.field2474, var10.field2258 / 2 + 3, 16776960, var11);
                    class130.method981(arg3.field2468, arg3.field2474, var10.field2258 / 2 + 1, 16776960, var11);
                    class130.method981(arg3.field2468, arg3.field2474, var10.field2258 / 2, 16776960, var11);
                }
                var10.method1041(-(var10.field2258 >> 1) + arg3.field2468, -(var10.field2255 >> 1) + arg3.field2474);
                var9.field3 = arg3.field2468 + arg4 + -(var10.field2258 >> 1);
                var9.field13 = arg0 - -arg3.field2474 - (var10.field2255 >> 1);
                var9.field1 = arg4 - (-(var10.field2258 >> 1) + -arg3.field2468);
                var9.field14 = arg3.field2474 + arg0 - -(var10.field2255 >> 1);
            }
        }
        if (arg2.field991 != null) {
            if (var10 != null) {
                class241.method1647(arg4, (var10.field2255 >> 1) + 5, arg0, false, (byte) -64, arg2, var9, arg3);
            } else {
                class241.method1647(arg4, 0, arg0, true, (byte) -76, arg2, var9, arg3);
            }
        }
        if (var9.method3(class204.field3017, Integer.MIN_VALUE, class44.field584) && arg2.field1004 != null) {
            if (arg2.field1004[4] != null) {
                class63.method481((long) arg3.field2466, 0, -1, arg2.field987, arg2.field1004[4], (short) 1003, -1, arg2.field1000);
            }
            if (arg2.field1004[3] != null) {
                class63.method481((long) arg3.field2466, 0, -1, arg2.field987, arg2.field1004[3], (short) 1006, -1, arg2.field1000);
            }
            if (arg2.field1004[2] != null) {
                class63.method481((long) arg3.field2466, 0, -1, arg2.field987, arg2.field1004[2], (short) 1011, -1, arg2.field1000);
            }
            if (arg2.field1004[1] != null) {
                class63.method481((long) arg3.field2466, 0, -1, arg2.field987, arg2.field1004[1], (short) 1001, -1, arg2.field1000);
            }
            if (arg2.field1004[0] != null) {
                class63.method481((long) arg3.field2466, 0, -1, arg2.field987, arg2.field1004[0], (short) 1002, -1, arg2.field1000);
            }
        }
        if (arg1 >= 38) {
            class101.field1715.method13(32, var9);
        }
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        ++field3470;
        class272.method1897(110);
        if (arg0 != 0) {
            field3476 = -89;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field3475;
        if (arg1) {
            method1632((byte) -6);
        }
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = this.field3471 >> 1;
            int[][] var5 = super.field1378.method318(false);
            Random var6 = new Random((long) this.field3473);
            for (int var7 = 0; ~var7 > ~this.field3463; ++var7) {
                int var8 = this.field3471 <= 0 ? this.field3467 : this.field3467 + -var4 + class275.method1912(this.field3471, -108, var6);
                int var9 = var8 >> 4 & 255;
                int var10 = class275.method1912(class206.field3032, -91, var6);
                int var11 = class275.method1912(class123.field2045, -85, var6);
                int var12 = (class39.field515[var9] * this.field3462 >> 12) + var11;
                int var13 = (class256.field3870[var9] * this.field3462 >> 12) + var10;
                int var14 = -var11 + var12;
                int var15 = -var10 + var13;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var13;
                        var10 = var11;
                        var11 = var17;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (~var10 < ~var13) {
                        int var19 = var10;
                        var10 = var13;
                        var13 = var19;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = -var10 + var13;
                    int var22 = var11;
                    int var23 = var12 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = 2048 / var21;
                    int var25 = var11 < var12 ? 1 : -1;
                    int var26 = -var21 / 2;
                    int var27 = 1024 - (class275.method1912(4096, -88, var6) >> 2);
                    for (int var28 = var10; ~var28 > ~var13; ++var28) {
                        var26 += var23;
                        int var29 = (var28 - var10) * var24 + var27 + 1024;
                        int var30 = class181.field2722 & var28;
                        int var31 = var22 & class32.field406;
                        if (var26 > 0) {
                            var22 += var25;
                            var26 -= var21;
                        }
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)V")
    public static void method1635(byte arg0) {
        field3464 = null;
        if (arg0 != -90) {
            field3466 = 26;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }
}
