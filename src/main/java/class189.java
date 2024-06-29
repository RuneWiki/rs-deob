import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class189 extends class160 {

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    private int field2919 = 2;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    private int field2926 = 0;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    private int field2924 = 5;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "[S")
    private short[] field2927 = new short[512];

    @OriginalMember(owner = "client!da", name = "U", descriptor = "[B")
    private byte[] field2921 = new byte[512];

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    private int field2932 = 1;

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    private int field2936 = 2048;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "I")
    private int field2937 = 5;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static volatile int field2925 = 0;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field2934 = "Connection lost.";

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "[I")
    public static int[] field2923;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        int[] var3 = super.field2488.method15((byte) 122, arg0);
        if (super.field2488.field42) {
            int var4 = class103.field1713[arg0] * this.field2924 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class240.field3896 < ~var7; ++var7) {
                class291.field4591 = Integer.MAX_VALUE;
                class71.field1128 = Integer.MAX_VALUE;
                class49.field724 = Integer.MAX_VALUE;
                class44.field627 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class190.field2946[var7] * this.field2937);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field2921[(this.field2924 <= var11 ? -this.field2924 + var11 : var11) & 255];
                    for (int var14 = var9 - 1; var10 >= var14; ++var14) {
                        int var15 = (255 & this.field2921[(~var14 > ~this.field2937 ? var14 : -this.field2937 + var14) + var13 & 255]) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - this.field2927[var15] + -(var14 << 12);
                        int var17 = -this.field2927[var27] - (var11 << 12) + var4;
                        int var18 = this.field2932;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class44.field627 <= var19) {
                            if (class49.field724 <= var19) {
                                if (~var19 > ~class71.field1128) {
                                    class291.field4591 = class71.field1128;
                                    class71.field1128 = var19;
                                } else if (class291.field4591 > var19) {
                                    class291.field4591 = var19;
                                }
                            } else {
                                class291.field4591 = class71.field1128;
                                class71.field1128 = class49.field724;
                                class49.field724 = var19;
                            }
                        } else {
                            class291.field4591 = class71.field1128;
                            class71.field1128 = class49.field724;
                            class49.field724 = class44.field627;
                            class44.field627 = var19;
                        }
                    }
                }
                int var12 = this.field2919;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class44.field627 + class49.field724;
                                }
                            } else {
                                var3[var7] = class291.field4591;
                            }
                        } else {
                            var3[var7] = class71.field1128;
                        }
                    } else {
                        var3[var7] = class49.field724;
                    }
                } else {
                    var3[var7] = class44.field627;
                }
            }
        }
        if (arg1 != 57) {
            this.field2919 = -9;
        }
        ++field2928;
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg1 < 11) {
            method1272(24, 59, 125, (class236) null);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field2924 = arg0.method633(83);
                                }
                            } else {
                                this.field2937 = arg0.method633(72);
                            }
                        } else {
                            this.field2932 = arg0.method633(83);
                        }
                    } else {
                        this.field2919 = arg0.method633(54);
                    }
                } else {
                    this.field2936 = arg0.method645(11596);
                }
            } else {
                this.field2926 = arg0.method633(123);
            }
        } else {
            this.field2937 = this.field2924 = arg0.method633(94);
        }
        ++field2931;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILwc;)V")
    public static final void method1272(int arg0, int arg1, int arg2, class236 arg3) {
        if (~(512 & arg1) != -1) {
            arg3.field2210 = class236.field3814.method627(72);
            arg3.field2231 = class236.field3814.method653(false);
            arg3.field2206 = class236.field3814.method633(57);
            arg3.field2254 = class236.field3814.method633(66);
            arg3.field2276 = class236.field3814.method670(-2) + class192.field2978;
            arg3.field2294 = class236.field3814.method645(11596) - -class192.field2978;
            arg3.field2218 = class236.field3814.method633(109);
            arg3.field2281 = 0;
            arg3.field2263 = 1;
        }
        ++field2935;
        if ((2 & arg1) != 0) {
            arg3.field2252 = class236.field3814.method677((byte) -100);
            arg3.field2202 = class236.field3814.method679((byte) 125);
        }
        if ((4 & arg1) != 0) {
            arg3.field2223 = class236.field3814.method670(-2);
            if (~arg3.field2223 == -65536) {
                arg3.field2223 = -1;
            }
        }
        if ((arg1 & 1) != 0) {
            int var4 = class236.field3814.method666(false);
            int var5 = class236.field3814.method682(arg0 + -34049);
            arg3.method976(class192.field2978, var4, var5, false);
            arg3.field2277 = class192.field2978 + 300;
            arg3.field2219 = class236.field3814.method653(false);
        }
        if (~(16 & arg1) != -1) {
            int var6 = class236.field3814.method633(99);
            byte[] var7 = new byte[var6];
            class88 var8 = new class88(var7);
            class236.field3814.method623(arg0 ^ -10454, var7, 0, var6);
            class132.field2075[arg2] = var8;
            arg3.method1621(var8, arg0 ^ 10454);
        }
        if ((arg1 & 256) != 0) {
            int var9 = class236.field3814.method679((byte) -79);
            int var10 = class236.field3814.method641(-1);
            if (var9 == 65535) {
                var9 = -1;
            }
            boolean var11 = true;
            if (var9 != -1 && arg3.field2299 != -1 && ~class148.method996(-84, class16.method158(var9, true).field3852).field440 > ~class148.method996(arg0 + -10537, class16.method158(arg3.field2299, true).field3852).field440) {
                var11 = false;
            }
            if (var11) {
                arg3.field2201 = var10 >> 16;
                arg3.field2261 = 1;
                arg3.field2289 = 0;
                arg3.field2299 = var9;
                arg3.field2203 = 0;
                arg3.field2236 = (65535 & var10) + class192.field2978;
                if (arg3.field2236 > class192.field2978) {
                    arg3.field2289 = -1;
                }
                if (arg3.field2299 != -1 && ~class192.field2978 == ~arg3.field2236) {
                    int var12 = class16.method158(arg3.field2299, true).field3852;
                    if (~var12 != 0) {
                        class30 var13 = class148.method996(-50, var12);
                        if (var13 != null && var13.field439 != null) {
                            class52.method390(class283.field4473 == arg3, var13, 0, 108, arg3.field2278, arg3.field2240);
                        }
                    }
                }
            }
        }
        if (~(arg1 & 2048) != -1) {
            int var14 = class236.field3814.method633(68);
            int[] var15 = new int[var14];
            int[] var16 = new int[var14];
            int[] var17 = new int[var14];
            for (int var18 = 0; var14 > var18; ++var18) {
                int var19 = class236.field3814.method679((byte) 123);
                if (~var19 == -65536) {
                    var19 = -1;
                }
                var15[var18] = var19;
                var16[var18] = class236.field3814.method682(arg0 + -34049);
                var17[var18] = class236.field3814.method677((byte) -100);
            }
            class109.method776(var15, (byte) -122, var17, arg3, var16);
        }
        if (~(arg1 & 1024) != -1) {
            int var20 = class236.field3814.method666(false);
            int var21 = class236.field3814.method633(62);
            arg3.method976(class192.field2978, var20, var21, false);
        }
        if ((8 & arg1) != 0) {
            arg3.field2286 = class236.field3814.method675((byte) 16);
            if (arg3.field2286.charAt(0) != '~') {
                if (class283.field4473 == arg3) {
                    class81.method579(arg0 ^ -10455, arg3.method1620(false), 2, arg3.field2286);
                }
            } else {
                arg3.field2286 = arg3.field2286.substring(1);
                class81.method579(-1, arg3.method1620(false), 2, arg3.field2286);
            }
            arg3.field2274 = 0;
            arg3.field2207 = 150;
            arg3.field2205 = 0;
        }
        if (~(128 & arg1) != -1) {
            int var22 = class236.field3814.method677((byte) -100);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = class236.field3814.method653(false);
            class209.method1403(var22, var23, arg3, arg0 + -10456);
        }
        if (arg0 != 10454) {
            field2925 = -110;
        }
        if (~(arg1 & 32) != -1) {
            int var24 = class236.field3814.method677((byte) -100);
            int var25 = class236.field3814.method633(84);
            int var26 = class236.field3814.method627(47);
            boolean var27 = (32768 & var24) != 0;
            int var28 = class236.field3814.field1535;
            if (arg3.field3803 != null && arg3.field3800 != null) {
                long var29 = class148.method1000(arg3.field3803, 934);
                boolean var31 = false;
                if (~var25 >= -2) {
                    if (!var27 && (class230.field3658 && !class115.field1878 || class179.field2794)) {
                        var31 = true;
                    } else {
                        for (int var32 = 0; ~var32 > ~class268.field4284; ++var32) {
                            if (~class106.field1766[var32] == ~var29) {
                                var31 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var31 && ~class278.field4408 == -1) {
                    class199.field3126.field1535 = 0;
                    class236.field3814.method643(0, arg0 + -10582, var26, class199.field3126.field1471);
                    class199.field3126.field1535 = 0;
                    int var33 = -1;
                    String var34;
                    if (!var27) {
                        var34 = class242.method1675(class216.method1454(class165.method1113((byte) -108, class199.field3126), 0));
                    } else {
                        var24 &= 32767;
                        class110 var35 = class292.method1956(class199.field3126, (byte) -74);
                        var33 = var35.field1809;
                        var34 = var35.field1801.method1154(-8211, class199.field3126);
                    }
                    arg3.field2286 = var34.trim();
                    arg3.field2207 = 150;
                    arg3.field2274 = 255 & var24;
                    arg3.field2205 = var24 >> 8;
                    if (var25 != 2) {
                        if (~var25 != -2) {
                            class240.method1646(var34, (String) null, !var27 ? 2 : 17, arg3.method1620(false), var33, (byte) -120);
                        } else {
                            class240.method1646(var34, (String) null, !var27 ? 1 : 17, "<img=0>" + arg3.method1620(false), var33, (byte) -98);
                        }
                    } else {
                        class240.method1646(var34, (String) null, !var27 ? 1 : 17, "<img=1>" + arg3.method1620(false), var33, (byte) -105);
                    }
                }
            }
            class236.field3814.field1535 = var28 - -var26;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Ldb;")
    public static final class17 method1273(byte arg0, int arg1) {
        class17 var2 = (class17) class203.field3172.method728((long) arg1, (byte) -110);
        if (arg0 >= 0) {
            return null;
        } else {
            ++field2920;
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3;
                if (arg1 >= 32768) {
                    var3 = class181.field2826.method1590(arg1 & 32767, (byte) -25, 0);
                } else {
                    var3 = class160.field2481.method1590(arg1, (byte) -25, 0);
                }
                class17 var4 = new class17();
                if (var3 != null) {
                    var4.method169((byte) -108, new class88(var3));
                }
                if (arg1 >= 32768) {
                    var4.method163(32768);
                }
                class203.field3172.method737((long) arg1, 0, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    private final void method1274(int arg0) {
        ++field2930;
        Random var2 = new Random((long) this.field2926);
        if (arg0 != 0) {
            field2934 = null;
        }
        this.field2927 = new short[512];
        if (~this.field2936 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2927[var3] = (short) class129.method896(this.field2936, var2, false);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(B)V")
    public static void method1275(byte arg0) {
        if (arg0 >= -35) {
            method1272(65, -61, -12, (class236) null);
        }
        field2923 = null;
        field2934 = null;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        ++field2933;
        if (arg0 >= -124) {
            this.method1274(112);
        }
        this.field2921 = class284.method1908(true, this.field2926);
        this.method1274(0);
    }
}
