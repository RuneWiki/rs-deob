import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class285 extends class156 {

    @OriginalMember(owner = "client!fr", name = "O", descriptor = "Z")
    public boolean field4284 = false;

    @OriginalMember(owner = "client!fr", name = "Z", descriptor = "Z")
    public boolean field4295 = false;

    @OriginalMember(owner = "client!fr", name = "P", descriptor = "Z")
    public static boolean field4285 = false;

    @OriginalMember(owner = "client!fr", name = "Q", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!fr", name = "R", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!fr", name = "S", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!fr", name = "T", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!fr", name = "U", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!fr", name = "V", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!fr", name = "W", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!fr", name = "X", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!fr", name = "Y", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!fr", name = "ab", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZ)V")
    public final void method1780(int arg0, boolean arg1) {
        ++field4291;
        if (arg0 != -3) {
            method1785(122, false, 106);
        }
        super.field2556 = arg1;
        if (class123.field2142 != null) {
            class123.field2142.method1525(!this.method1783(arg0 + 2, class133.field2236), (byte) -113);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(II)I")
    public final int method1781(int arg0, int arg1) {
        int var3 = 25 % ((arg1 - 82) / 41);
        ++field4289;
        if (this.field4284) {
            return 0;
        } else if (!this.method1783(-1, arg0)) {
            return 1;
        } else {
            return !super.field2548 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)Lnn;")
    public final class289 method1782(int arg0) {
        ++field4293;
        if (arg0 != 1) {
            method1785(-85, false, 78);
        }
        class289 var2 = new class289(41);
        var2.method1814(17, true);
        var2.method1814(super.field2550, true);
        var2.method1814(super.field2556 ? 1 : 0, true);
        var2.method1814(super.field2548 ? 1 : 0, true);
        var2.method1814(!super.field2529 ? 0 : 1, true);
        var2.method1814(!super.field2558 ? 0 : 1, true);
        var2.method1814(0, true);
        var2.method1814(!super.field2543 ? 0 : 1, true);
        var2.method1814(!super.field2541 ? 0 : 1, true);
        var2.method1814(super.field2540 ? 1 : 0, true);
        var2.method1814(super.field2539, true);
        var2.method1814(super.field2555, true);
        var2.method1814(!super.field2534 ? 0 : 1, true);
        var2.method1814(super.field2549 ? 1 : 0, true);
        var2.method1814(!super.field2538 ? 0 : 1, true);
        var2.method1814(!super.field2533 ? 0 : 1, true);
        var2.method1814(super.field2552, true);
        var2.method1814(!super.field2559 ? 0 : 1, true);
        var2.method1814(super.field2532, true);
        var2.method1814(super.field2560, true);
        var2.method1814(super.field2544, true);
        var2.method1865(super.field2565, 812856296);
        var2.method1865(super.field2528, 812856296);
        var2.method1814(class358.method2207(0), true);
        var2.method1862((byte) -115, super.field2535);
        var2.method1814(super.field2536, true);
        var2.method1814(super.field2566 ? 1 : 0, true);
        var2.method1814(super.field2527 ? 1 : 0, true);
        var2.method1814(super.field2545, true);
        var2.method1814(!super.field2530 ? 0 : 1, true);
        var2.method1814(super.field2553 ? 1 : 0, true);
        var2.method1814(super.field2546, true);
        var2.method1814(super.field2557 ? 1 : 0, true);
        var2.method1814(super.field2537, true);
        var2.method1814(super.field2554, true);
        var2.method1814(super.field2531 ? 1 : 0, true);
        return var2;
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(II)Z")
    public final boolean method1783(int arg0, int arg1) {
        ++field4294;
        return ~arg1 == arg0 && !this.field4295 ? super.field2556 : true;
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "(II)Z")
    public final boolean method1784(int arg0, int arg1) {
        if (arg0 != 2002) {
            this.method1787((byte) 109, (class480) null);
        }
        ++field4286;
        return arg1 == 0 ? super.field2556 : true;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(IZI)Z")
    public static final boolean method1785(int arg0, boolean arg1, int arg2) {
        ++field4292;
        if (arg1) {
            method1785(-76, false, -16);
        }
        return class160.method1145(arg2, -119, arg0) || class379.method2332(arg0, arg2, 127);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lnn;I)V")
    private final void method1786(class289 arg0, int arg1) {
        ++field4296;
        if (arg0.field4408.length + -arg0.field4399 >= 1) {
            int var3 = arg0.method1858(-3256);
            if (~var3 <= -1 && var3 <= 17) {
                byte var4;
                if (~var3 != -18) {
                    if (var3 != 16) {
                        if (~var3 != -16) {
                            if (var3 != 14) {
                                if (~var3 != -14) {
                                    if (var3 != 12) {
                                        if (~var3 == -12) {
                                            var4 = 33;
                                        } else if (var3 != 10) {
                                            if (~var3 == -10) {
                                                var4 = 31;
                                            } else if (var3 != 8) {
                                                if (var3 != 7) {
                                                    if (var3 != 6) {
                                                        if (var3 != 5) {
                                                            if (var3 != 4) {
                                                                if (var3 != 3) {
                                                                    if (~var3 == -3) {
                                                                        var4 = 22;
                                                                    } else if (var3 == 1) {
                                                                        var4 = 23;
                                                                    } else {
                                                                        var4 = 19;
                                                                    }
                                                                } else {
                                                                    var4 = 23;
                                                                }
                                                            } else {
                                                                var4 = 24;
                                                            }
                                                        } else {
                                                            var4 = 28;
                                                        }
                                                    } else {
                                                        var4 = 28;
                                                    }
                                                } else {
                                                    var4 = 29;
                                                }
                                            } else {
                                                var4 = 30;
                                            }
                                        } else {
                                            var4 = 32;
                                        }
                                    } else {
                                        var4 = 34;
                                    }
                                } else {
                                    var4 = 35;
                                }
                            } else {
                                var4 = 36;
                            }
                        } else {
                            var4 = 37;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 40;
                }
                if (var4 <= arg0.field4408.length + -arg0.field4399) {
                    super.field2550 = arg0.method1858(arg1 + -3273);
                    if (~super.field2550 > -2) {
                        super.field2550 = 1;
                    } else if (super.field2550 > 4) {
                        super.field2550 = 4;
                    }
                    this.method1780(-3, ~arg0.method1858(-3256) == -2);
                    super.field2548 = ~arg0.method1858(-3256) == -2;
                    super.field2529 = ~arg0.method1858(-3256) == -2;
                    super.field2558 = arg0.method1858(arg1 ^ -3239) == 1;
                    super.field2546 = ~arg0.method1858(-3256) == -2 ? 1 : 0;
                    super.field2543 = ~arg0.method1858(arg1 ^ -3239) == -2;
                    super.field2541 = ~arg0.method1858(arg1 + -3273) == -2;
                    super.field2540 = ~arg0.method1858(-3256) == -2;
                    super.field2539 = arg0.method1858(-3256);
                    if (super.field2539 > 2) {
                        super.field2539 = 2;
                    }
                    if (var3 >= arg1) {
                        super.field2555 = arg0.method1858(arg1 + -3273);
                    }
                    if (var3 < 2) {
                        super.field2534 = arg0.method1858(-3256) == 1;
                        arg0.method1858(-3256);
                    } else {
                        super.field2534 = ~arg0.method1858(-3256) == -2;
                        if (~var3 <= -18) {
                            super.field2549 = arg0.method1858(-3256) == 1;
                        }
                    }
                    super.field2538 = ~arg0.method1858(-3256) == -2;
                    super.field2533 = ~arg0.method1858(-3256) == -2;
                    super.field2552 = arg0.method1858(arg1 + -3273);
                    if (super.field2552 > 2) {
                        super.field2552 = 2;
                    }
                    super.field2542 = super.field2552;
                    super.field2559 = arg0.method1858(-3256) == 1;
                    super.field2532 = arg0.method1858(arg1 + -3273);
                    if (~super.field2532 < -128) {
                        super.field2532 = 127;
                    }
                    super.field2560 = arg0.method1858(arg1 + -3273);
                    super.field2544 = arg0.method1858(-3256);
                    if (super.field2544 > 127) {
                        super.field2544 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field2565 = arg0.method1841((byte) -123);
                        super.field2528 = arg0.method1841((byte) -123);
                    }
                    if (var3 >= 3 && var3 < 6) {
                        arg0.method1858(-3256);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method1858(-3256);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class370.field5418 < 96) {
                            var5 = 0;
                        }
                        class79.method706(var5, 1);
                    }
                    if (var3 >= 5) {
                        super.field2535 = arg0.method1815((byte) -54);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field2536 = var6 = arg0.method1858(arg1 ^ -3239);
                    }
                    if (~super.field2536 != -2 && ~super.field2536 != -3) {
                        super.field2536 = 2;
                    }
                    if (var3 >= 7) {
                        super.field2566 = arg0.method1858(-3256) == 1;
                    }
                    if (var3 >= 8) {
                        super.field2527 = arg0.method1858(-3256) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field2545 = arg0.method1858(-3256);
                    }
                    if (super.field2545 < 0 || super.field2545 > class469.method2803(32, class370.field5418)) {
                        super.field2545 = 0;
                    }
                    if (var3 >= 10) {
                        super.field2530 = ~arg0.method1858(-3256) != -1;
                    }
                    if (var3 >= 11) {
                        super.field2553 = arg0.method1858(arg1 + -3273) != 0;
                    }
                    if (var3 >= 12) {
                        super.field2546 = arg0.method1858(arg1 ^ -3239);
                    }
                    if (~super.field2546 > -1 || ~super.field2546 < -3) {
                        super.field2546 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field2557 = ~arg0.method1858(-3256) == -2;
                    }
                    if (var3 >= 14) {
                        super.field2537 = arg0.method1858(-3256);
                    } else if (var6 == 0) {
                        super.field2537 = 2;
                    } else {
                        super.field2537 = 1;
                    }
                    if (~super.field2537 > -1 || super.field2537 > 3) {
                        super.field2537 = 2;
                    }
                    if (var3 >= 15) {
                        super.field2554 = arg0.method1858(-3256);
                        if (super.field2554 < 0 || super.field2554 > 4) {
                            super.field2554 = class242.field3755 != 1 ? 4 : 2;
                        }
                    }
                    if (var3 >= 16) {
                        super.field2531 = ~arg0.method1858(-3256) == -2;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field2531 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && super.field2537 == 0) {
                        super.field2537 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLlt;)V")
    public final void method1787(byte arg0, class480 arg1) {
        ++field4290;
        class371 var3 = null;
        try {
            class121 var4 = arg1.method2878("", true, 0);
            while (~var4.field2119 == -1) {
                class50.method470(1L, -5);
            }
            if (~var4.field2119 == -2) {
                var3 = (class371) var4.field2115;
                class289 var5 = this.method1782(1);
                var3.method2281(var5.field4408, 0, var5.field4399, 0);
            }
            if (arg0 < 48) {
                this.method1787((byte) -90, (class480) null);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2276(-2771);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Llt;)V")
    public class285(class480 arg0) {
        super.field2550 = 3;
        this.method1780(-3, true);
        super.field2532 = 127;
        super.field2528 = 0;
        super.field2560 = 255;
        super.field2541 = true;
        super.field2552 = 0;
        super.field2544 = 127;
        super.field2543 = true;
        super.field2534 = true;
        super.field2540 = true;
        super.field2546 = 1;
        super.field2529 = true;
        super.field2565 = 0;
        super.field2533 = true;
        super.field2539 = 2;
        super.field2549 = false;
        super.field2559 = true;
        super.field2558 = true;
        super.field2542 = 0;
        super.field2538 = true;
        super.field2548 = true;
        super.field2555 = 0;
        if (class370.field5418 < 96) {
            class79.method706(0, 1);
        } else {
            class79.method706(2, 1);
        }
        super.field2557 = true;
        super.field2530 = false;
        super.field2535 = 0;
        super.field2545 = 0;
        super.field2554 = ~class242.field3755 == -2 ? 2 : 4;
        super.field2566 = false;
        super.field2537 = 2;
        super.field2536 = 2;
        super.field2527 = false;
        super.field2553 = true;
        class371 var2 = null;
        try {
            class121 var3 = arg0.method2878("", true, 0);
            while (var3.field2119 == 0) {
                class50.method470(1L, -5);
            }
            if (~var3.field2119 == -2) {
                var2 = (class371) var3.field2115;
                byte[] var4 = new byte[(int) var2.method2278(false)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method2279(var5, var4, -1, var4.length - var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1786(new class289(var4), 17);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2276(-2771);
            }
        } catch (Exception var7) {
        }
    }
}
