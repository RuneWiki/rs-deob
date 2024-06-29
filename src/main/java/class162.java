import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class162 extends class227 {

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    private int field2106 = 4096;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    private int field2110 = 3216;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    private int field2109 = 3216;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "[I")
    private int[] field2111 = new int[3];

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field2112 = 20;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Lsn;")
    public static class447 field2108;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        if (arg0 != 15811) {
            return null;
        } else {
            ++field2105;
            int[] var3 = super.field3068.method1970(arg1, (byte) 99);
            if (super.field3068.field4480) {
                int var4 = class161.field2098 * this.field2106 >> 12;
                int[] var5 = this.method1459(arg1 - 1 & class115.field1508, arg0 ^ -15769, 0);
                int[] var6 = this.method1459(arg1, -124, 0);
                int[] var7 = this.method1459(arg1 + 1 & class115.field1508, 112, 0);
                for (int var8 = 0; ~var8 > ~class446.field6486; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class102.field1388 & var8 - 1] - var6[class102.field1388 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (~var11 > -1) {
                        var11 = -var11;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class517.field7628[((var12 - -1) * var12 >> 1) + var11] & 255;
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field2111[1] * var16 >> 12;
                    int var18 = this.field2111[0] * var15 >> 12;
                    int var19 = this.field2111[2] * var14 >> 12;
                    var3[var8] = var18 - -var19 + var17;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "(I)V")
    public static void method953(int arg0) {
        field2108 = null;
        if (arg0 > -20) {
            field2112 = 49;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class162() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2109 = arg0.method2386(-23648);
                }
            } else {
                this.field2110 = arg0.method2386(arg1 + -487238764);
            }
        } else {
            this.field2106 = arg0.method2386(-23648);
        }
        if (arg1 != 487215116) {
            method955(-14);
        }
        ++field2103;
    }

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "(I)V")
    public static final void method954(int arg0) {
        ++field2101;
        class478.method2917(false, (byte) 95);
        class267.field3575 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class31.field318.length; ++var2) {
            if (class318.field4245[var2] != -1 && class31.field318[var2] == null) {
                class31.field318[var2] = class426.field6186.method2130(class318.field4245[var2], 0, -116);
                if (class31.field318[var2] == null) {
                    var1 = false;
                    ++class267.field3575;
                }
            }
            if (class391.field5650[var2] != -1 && class47.field494[var2] == null) {
                class47.field494[var2] = class426.field6186.method2158(0, class48.field496[var2], false, class391.field5650[var2]);
                if (class47.field494[var2] == null) {
                    ++class267.field3575;
                    var1 = false;
                }
            }
            if (class245.field3230[var2] != -1 && class409.field5862[var2] == null) {
                class409.field5862[var2] = class426.field6186.method2130(class245.field3230[var2], 0, -65);
                if (class409.field5862[var2] == null) {
                    ++class267.field3575;
                    var1 = false;
                }
            }
            if (class195.field2507[var2] != -1 && class396.field5734[var2] == null) {
                class396.field5734[var2] = class426.field6186.method2130(class195.field2507[var2], 0, class335.method1958(arg0, -119));
                if (class396.field5734[var2] == null) {
                    ++class267.field3575;
                    var1 = false;
                }
            }
            if (class180.field2346 != null && class68.field775[var2] == null && ~class180.field2346[var2] != 0) {
                class68.field775[var2] = class426.field6186.method2158(0, class48.field496[var2], false, class180.field2346[var2]);
                if (class68.field775[var2] == null) {
                    var1 = false;
                    ++class267.field3575;
                }
            }
        }
        if (class212.field2884 == null) {
            if (class200.field2662 != null && class413.field5904.method2156(class200.field2662.field5697 + "_staticelements", (byte) 86)) {
                if (class413.field5904.method2157(class200.field2662.field5697 + "_staticelements", arg0 + -10)) {
                    class212.field2884 = class321.method1899(class413.field5904, class48.field508, class200.field2662.field5697 + "_staticelements", arg0 ^ 28719);
                } else {
                    ++class267.field3575;
                    var1 = false;
                }
            } else {
                class212.field2884 = new class370(0);
            }
        }
        if (!var1) {
            class17.field164 = 1;
        } else {
            class321.field4274 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class31.field318.length < ~var4; ++var4) {
                byte[] var19 = class47.field494[var4];
                if (var19 != null) {
                    int var20 = (class467.field6937[var4] >> 8) * 64 + -class357.field4867;
                    int var21 = (class467.field6937[var4] & 255) * 64 + -class418.field6074;
                    if (~class116.field1512 != -1) {
                        var20 = 10;
                        var21 = 10;
                    }
                    var3 &= class502.method3008(var20, var21, class426.field6200, var19, (byte) -123, class308.field4128);
                }
                byte[] var22 = class396.field5734[var4];
                if (var22 != null) {
                    int var23 = (class467.field6937[var4] >> 8) * 64 + -class357.field4867;
                    int var24 = (255 & class467.field6937[var4]) * 64 + -class418.field6074;
                    if (class116.field1512 != 0) {
                        var24 = 10;
                        var23 = 10;
                    }
                    var3 &= class502.method3008(var23, var24, class426.field6200, var22, (byte) -95, class308.field4128);
                }
            }
            if (!var3) {
                class17.field164 = 2;
            } else {
                if (class17.field164 != 0) {
                    class31.method176(true, class225.field3028, class279.field3703.method1823(class374.field5072, (byte) -88) + "<br>(100%)", 122);
                }
                class466.method2847(false);
                class377.method2252((byte) 76);
                boolean var5 = false;
                if (class343.field4596.method1149() && class319.field4256.field4665) {
                    for (int var6 = 0; ~class31.field318.length < ~var6; ++var6) {
                        if (class396.field5734[var6] != null || class409.field5862[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class319.field4256.field4653) {
                    var7 = class443.field6449[class178.field2307];
                } else {
                    var7 = class467.field6935[class178.field2307];
                }
                if (class343.field4596.method1168()) {
                    ++var7;
                }
                class151.method907(7, 4, class308.field4128, class426.field6200, var7, var5, class343.field4596.method1176() > 0);
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class96.field1223[var8].method661(-110);
                }
                class334.method1945(0);
                class138.method859(false, true);
                class217.method1380((byte) 118);
                class155.field2027 = null;
                class466.method2847(false);
                System.gc();
                class478.method2917(true, (byte) 97);
                class69.method399(false);
                class151.field1971 = class319.field4256.method2058(class20.field183, arg0 + -9);
                class456.field6809 = class164.field2144 >= 96;
                class325.field4333 = class319.field4256.field4665;
                class179.field2321 = class319.field4256.method2061((byte) 108, class20.field183);
                class35.field357 = !class319.field4256.field4676;
                class443.field6456 = class319.field4256.method1738(0, class20.field183) ? -1 : class253.field3369;
                class510.field7433 = class319.field4256.field4671;
                class534.field7853 = ~class20.field183 == -2 || class319.field4256.field4684;
                class442.field6426 = new class472(4, class308.field4128, class426.field6200, false);
                if (class116.field1512 == 0) {
                    class283.method1709(class31.field318, class442.field6426, (byte) 41);
                } else {
                    class299.method1785(class442.field6426, class31.field318, 5);
                }
                class364.method2169(class308.field4128 >> 4, -77, class426.field6200 >> 4);
                class338.method1969((byte) -114);
                if (var5) {
                    class530.method3141(true);
                    class384.field5590 = new class472(1, class308.field4128, class426.field6200, true);
                    if (~class116.field1512 == -1) {
                        class283.method1709(class409.field5862, class384.field5590, (byte) 41);
                        class478.method2917(true, (byte) 91);
                    } else {
                        class299.method1785(class384.field5590, class409.field5862, 5);
                        class478.method2917(true, (byte) 107);
                    }
                    class384.field5590.method305(0, 1, class442.field6426.field608[0]);
                    class384.field5590.method311(class343.field4596, (int[][][]) null, (class106[]) null, false);
                    class530.method3141(false);
                }
                class442.field6426.method311(class343.field4596, var5 ? class384.field5590.field608 : null, class96.field1223, false);
                if (class116.field1512 == 0) {
                    class478.method2917(true, (byte) 103);
                    class327.method1926(64, class47.field494, class442.field6426);
                    if (class68.field775 != null) {
                        class367.method2182((byte) 111);
                    }
                } else {
                    class478.method2917(true, (byte) 63);
                    class40.method225(class442.field6426, false, class47.field494);
                }
                class377.method2252((byte) 76);
                class478.method2917(true, (byte) 126);
                class442.field6426.method316((byte) 107, !var5 ? null : class378.field5470[0], (class38) null, class343.field4596);
                class442.field6426.method2878((byte) 95, class343.field4596);
                class478.method2917(true, (byte) 82);
                if (var5) {
                    class530.method3141(true);
                    class478.method2917(true, (byte) 93);
                    if (~class116.field1512 == -1) {
                        class327.method1926(56, class396.field5734, class384.field5590);
                    } else {
                        class40.method225(class384.field5590, false, class396.field5734);
                    }
                    class377.method2252((byte) 76);
                    class478.method2917(true, (byte) 116);
                    class384.field5590.method316((byte) -78, (class38) null, class14.field152[0], class343.field4596);
                    class384.field5590.method2878((byte) -116, class343.field4596);
                    class478.method2917(true, (byte) 83);
                    class530.method3141(false);
                }
                class92.method513(true);
                int var9 = class442.field6426.field7000;
                if (~class210.field2808 > ~var9) {
                    var9 = class210.field2808;
                }
                if (~var9 > ~(class210.field2808 - 1)) {
                    var9 = class210.field2808 + -1;
                }
                if (!class319.field4256.method1738(0, class20.field183)) {
                    class423.method2609(var9);
                } else {
                    class423.method2609(0);
                }
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var17 = 0; class308.field4128 > var17; ++var17) {
                        for (int var18 = 0; var18 < class426.field6200; ++var18) {
                            class497.method2995(var10, var18, var17, (byte) -85);
                        }
                    }
                }
                if (arg0 != 10) {
                    field2112 = -72;
                }
                class397.method2452(0);
                class466.method2847(false);
                class95.method529(106);
                class377.method2252((byte) 76);
                class92.field1097 = false;
                class127.method767(-99);
                if (class173.field2224 != null && class446.field6499 != null && class527.field7734 == 10) {
                    class492.method2979(class161.field2097, 39);
                    ++class463.field6906;
                    class106.field1443.method2398(arg0 ^ -29, 1057001181);
                }
                if (~class116.field1512 == -1) {
                    int var11 = (-(class308.field4128 >> 4) + class126.field1634) / 8;
                    int var12 = ((class308.field4128 >> 4) + class126.field1634) / 8;
                    int var13 = (-(class426.field6200 >> 4) + class293.field3882) / 8;
                    int var14 = ((class426.field6200 >> 4) + class293.field3882) / 8;
                    for (int var15 = var11 - 1; ~var15 >= ~(var12 + 1); ++var15) {
                        for (int var16 = var13 + -1; ~var16 >= ~(var14 + 1); ++var16) {
                            if (var15 < var11 || var12 < var15 || ~var16 > ~var13 || ~var16 < ~var14) {
                                class426.field6186.method2151("m" + var15 + "_" + var16, (byte) -119);
                                class426.field6186.method2151("l" + var15 + "_" + var16, (byte) -119);
                            }
                        }
                    }
                }
                if (class527.field7734 == 3) {
                    class57.method345(1, 2);
                } else if (~class527.field7734 == -8) {
                    class57.method345(1, 6);
                } else {
                    class57.method345(1, 9);
                    if (class446.field6499 != null) {
                        class492.method2979(class445.field6479, 108);
                    }
                }
                class314.method1865((byte) -69);
                class466.method2847(false);
                class167.method982(arg0 ^ 42);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V")
    public final void method877(int arg0) {
        if (arg0 != 1) {
            method954(-85);
        }
        ++field2113;
        this.method956(-70);
    }

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "(I)Lql;")
    public static final class519 method955(int arg0) {
        ++field2107;
        if (class416.field5994 != null && class71.field912 != null) {
            if (arg0 > -71) {
                method954(62);
            }
            class71.field912.method64(class416.field5994, false);
            class519 var1 = (class519) class71.field912.method68(-112);
            if (var1 == null) {
                return null;
            } else {
                class48 var2 = class416.field5987.method993(var1.field7646, -21143);
                return var2 != null && var2.field515 && var2.method271(class416.field5985, (byte) 94) ? var1 : class316.method1879(false);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "(I)V")
    private final void method956(int arg0) {
        ++field2102;
        if (arg0 > -42) {
            field2108 = null;
        }
        double var2 = Math.cos((double) ((float) this.field2109 / 4096.0F));
        this.field2111[0] = (int) (var2 * Math.sin((double) ((float) this.field2110 / 4096.0F)) * 4096.0D);
        this.field2111[1] = (int) (4096.0D * Math.cos((double) ((float) this.field2110 / 4096.0F)) * var2);
        this.field2111[2] = (int) (Math.sin((double) ((float) this.field2109 / 4096.0F)) * 4096.0D);
        int var4 = this.field2111[0] * this.field2111[0] >> 12;
        int var5 = this.field2111[1] * this.field2111[1] >> 12;
        int var6 = this.field2111[2] * this.field2111[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - -var5 - -var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field2111[1] = (this.field2111[1] << 12) / var7;
            this.field2111[0] = (this.field2111[0] << 12) / var7;
            this.field2111[2] = (this.field2111[2] << 12) / var7;
        }
    }
}
