import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class26 extends class123 {

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    private int field492 = 2048;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    private int field494 = 2;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    private int field487 = 5;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "[B")
    private byte[] field496 = new byte[512];

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "[S")
    private short[] field489 = new short[512];

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
    private int field498 = 0;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
    private int field495 = 1;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    private int field488 = 5;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "[I")
    public static int[] field491 = new int[50];

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "[J")
    public static long[] field490 = new long[1000];

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "[[I")
    public static int[][] field497;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        if (arg0 == 0) {
            this.field496 = class210.method1463(this.field498, true);
            ++field500;
            this.method258(true);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    private final void method258(boolean arg0) {
        ++field484;
        if (arg0) {
            Random var2 = new Random((long) this.field498);
            this.field489 = new short[512];
            if (~this.field492 < -1) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field489[var3] = (short) class51.method413(var2, this.field492, Integer.MIN_VALUE);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field485;
        int var3 = 104 / ((arg1 - -24) / 57);
        int[] var4 = super.field2160.method1323((byte) -120, arg0);
        if (super.field2160.field3243) {
            int var5 = class154.field2753[arg0] * this.field487 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; var8 < class140.field2505; ++var8) {
                class71.field1299 = Integer.MAX_VALUE;
                class25.field478 = Integer.MAX_VALUE;
                class206.field3630 = Integer.MAX_VALUE;
                class259.field4575 = Integer.MAX_VALUE;
                int var9 = 2048 - -(class214.field3705[var8] * this.field488);
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; var12 <= var7; ++var12) {
                    int var14 = this.field496[(this.field487 <= var12 ? -this.field487 + var12 : var12) & 255] & 255;
                    for (int var15 = var10 + -1; var15 <= var11; ++var15) {
                        int var16 = 2 * (this.field496[255 & (~var15 <= ~this.field488 ? var15 - this.field488 : var15) + var14] & 255);
                        int var10001 = var15 << 12;
                        int var28 = var16 + 1;
                        int var17 = var9 - (var10001 + this.field489[var16]);
                        int var18 = -(var12 << 12) + var5 + -this.field489[var28];
                        int var19 = this.field495;
                        int var20;
                        if (~var19 != -2) {
                            if (var19 != 3) {
                                if (~var19 != -5) {
                                    if (~var19 != -6) {
                                        if (var19 == 2) {
                                            var20 = (~var17 > -1 ? -var17 : var17) + (var18 >= 0 ? var18 : -var18);
                                        } else {
                                            var20 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var21 = var17 * var17;
                                        int var22 = var18 * var18;
                                        var20 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = (int) (4096.0D * Math.sqrt((double) ((float) (var18 >= 0 ? var18 : -var18) / 4096.0F)));
                                    int var25 = var23 + var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                int var27 = var18 < 0 ? -var18 : var18;
                                var20 = ~var26 >= ~var27 ? var27 : var26;
                            }
                        } else {
                            var20 = var17 * var17 - -(var18 * var18) >> 12;
                        }
                        if (~class259.field4575 < ~var20) {
                            class71.field1299 = class25.field478;
                            class25.field478 = class206.field3630;
                            class206.field3630 = class259.field4575;
                            class259.field4575 = var20;
                        } else if (~class206.field3630 < ~var20) {
                            class71.field1299 = class25.field478;
                            class25.field478 = class206.field3630;
                            class206.field3630 = var20;
                        } else if (~class25.field478 < ~var20) {
                            class71.field1299 = class25.field478;
                            class25.field478 = var20;
                        } else if (var20 < class71.field1299) {
                            class71.field1299 = var20;
                        }
                    }
                }
                int var13 = this.field494;
                if (~var13 != -1) {
                    if (~var13 != -2) {
                        if (~var13 != -4) {
                            if (~var13 != -5) {
                                if (~var13 == -3) {
                                    var4[var8] = -class259.field4575 + class206.field3630;
                                }
                            } else {
                                var4[var8] = class71.field1299;
                            }
                        } else {
                            var4[var8] = class25.field478;
                        }
                    } else {
                        var4[var8] = class206.field3630;
                    }
                } else {
                    var4[var8] = class259.field4575;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public static void method259(int arg0) {
        field490 = null;
        field497 = null;
        int var1 = -84 % ((arg0 - 28) / 32);
        field491 = null;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
    public static final void method260(int arg0, int arg1) {
        ++field493;
        if (~class57.field1057 != ~arg1) {
            if (arg0 != -11) {
                field490 = null;
            }
            boolean var2 = ~arg1 == -6 || ~arg1 == -11 || ~arg1 == -29;
            if (class57.field1057 == 0) {
                class172.method1262(true);
            }
            if (~arg1 == -41) {
                class92.method779(true);
            }
            if (arg1 != 40 && class136.field2457 != null) {
                class136.field2457.method1818(arg0 + 9);
                class136.field2457 = null;
            }
            if (arg1 == 25 || arg1 == 28) {
                class115.field2064 = 1;
                client.field2722 = 0;
                class142.field2566 = 1;
                class85.field1496 = 0;
                class231.field4013 = 0;
                class200.method1411(-72);
            }
            if (arg1 != 5) {
                class21.method239((byte) -127);
            } else {
                class35.method327(-120, class97.field1781);
            }
            boolean var3 = class57.field1057 == 5 || class57.field1057 == 10 || ~class57.field1057 == -29;
            if (!var3 == var2) {
                if (!var2) {
                    class222.method1515((byte) 123, 2);
                    class56.field1040.method1362(-20, true);
                } else {
                    class106.field1927 = class223.field3813;
                    if (~class16.field365 != -1) {
                        class230.method1607(0, -79, 2, 255, class223.field3813, class197.field3528, false);
                    } else {
                        class222.method1515((byte) 65, 2);
                    }
                    class56.field1040.method1362(127, false);
                }
            }
            class57.field1057 = arg1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field499;
        if (arg2 != 1876195788) {
            this.method6(-113, (class14) null, 107);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field487 = arg1.method200(255);
                                }
                            } else {
                                this.field488 = arg1.method200(255);
                            }
                        } else {
                            this.field495 = arg1.method200(255);
                        }
                    } else {
                        this.field494 = arg1.method200(255);
                    }
                } else {
                    this.field492 = arg1.method161(arg2 + -1876195784);
                }
            } else {
                this.field498 = arg1.method200(255);
            }
        } else {
            this.field488 = this.field487 = arg1.method200(arg2 ^ 1876195635);
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
    public static final void method261(boolean arg0) {
        ++field486;
        if (!arg0) {
            field497 = null;
        }
        for (int var1 = 0; ~var1 > ~class105.field1911; ++var1) {
            int var2 = class121.field2132[var1];
            class109 var3 = class168.field2963[var2];
            int var4 = class183.field3182.method200(255);
            if (~(1 & var4) != -1) {
                int var5 = class183.field3182.method151(98);
                int var6 = class183.field3182.method162((byte) 5);
                if (var5 == 65535) {
                    var5 = -1;
                }
                class52.method419(true, var3, var5, var6);
            }
            if (~(2 & var4) != -1) {
                var3.field2310 = class183.field3182.method151(4);
                var3.field2236 = class183.field3182.method196(-110);
            }
            if (~(var4 & 4) != -1) {
                var3.field2280 = class183.field3182.method196(-107);
                if (~var3.field2280 == -65536) {
                    var3.field2280 = -1;
                }
            }
            if (~(var4 & 128) != -1) {
                int var7 = class183.field3182.method162((byte) 5);
                int var8 = class183.field3182.method162((byte) 5);
                var3.method1001(var7, -62, class259.field4584, var8);
            }
            if ((8 & var4) != 0) {
                int var9 = class183.field3182.method168((byte) 95);
                int var10 = class183.field3182.method167(-1);
                var3.method1001(var9, -111, class259.field4584, var10);
                var3.field2288 = class259.field4584 + 300;
                var3.field2258 = class183.field3182.method168((byte) 86);
            }
            if (~(64 & var4) != -1) {
                if (var3.field1956.method826(-115)) {
                    class182.method1308(var3, -4448);
                }
                var3.field1956 = class232.method1640(-125, class183.field3182.method161(4));
                var3.method1009(-1000, var3.field1956.field1769);
                var3.field2283 = var3.field1956.field1791;
                var3.field2298 = var3.field1956.field1796;
                var3.field2270 = var3.field1956.field1755;
                var3.field2301 = var3.field1956.field1777;
                var3.field2291 = var3.field1956.field1784;
                var3.field2293 = var3.field1956.field1770;
                var3.field2252 = var3.field1956.field1794;
                var3.field2305 = var3.field1956.field1768;
                if (var3.field1956.method826(-94)) {
                    class115.method919(var3, var3.field2253[0], var3.field2296[0], 0, (class260) null, class124.field2174, 128, (class194) null);
                }
            }
            if (~(var4 & 16) != -1) {
                var3.field2279 = class183.field3182.method196(-106);
                int var11 = class183.field3182.method199(-2);
                if (~var3.field2279 == -65536) {
                    var3.field2279 = -1;
                }
                var3.field2244 = 0;
                var3.field2261 = (65535 & var11) + class259.field4584;
                var3.field2281 = 0;
                if (~class259.field4584 > ~var3.field2261) {
                    var3.field2281 = -1;
                }
                var3.field2266 = var11 >> 16;
                if (var3.field2279 != -1 && ~class259.field4584 == ~var3.field2261) {
                    int var12 = class162.method1217((byte) 99, var3.field2279).field131;
                    if (~var12 != 0) {
                        class249 var13 = class237.method1667(var12, 68);
                        if (var13 != null && var13.field4408 != null) {
                            class27.method263(var13, var3.field2300, true, var3.field2274, false, 0);
                        }
                    }
                }
            }
            if (~(32 & var4) != -1) {
                var3.field2269 = class183.field3182.method171((byte) 79);
                var3.field2240 = 100;
            }
        }
    }
}
