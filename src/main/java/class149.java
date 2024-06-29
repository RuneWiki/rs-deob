import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class149 extends class172 {

    @OriginalMember(owner = "client!p", name = "T", descriptor = "Z")
    public boolean field2279 = false;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "Z")
    public boolean field2285 = false;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "[I")
    public static int[] field2284 = new int[500];

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "Lci;")
    public static class320 field2287;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BZ)V", line = 9)
    public final void method1043(byte arg0, boolean arg1) {
        super.field2565 = arg1;
        ++field2276;
        if (arg0 <= 121) {
            method1046((byte) 102);
        }
        if (class277.field4139 != null) {
            class277.field4139.method566((byte) 25, !this.method1048(class74.field1211, -97));
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILul;)V", line = 26)
    public final void method1044(int arg0, class411 arg1) {
        ++field2288;
        class536 var3 = null;
        try {
            class81 var4 = arg1.method2463(false, "", true);
            while (var4.field1314 == 0) {
                class477.method2826(1L, 0);
            }
            if (var4.field1314 == arg0) {
                var3 = (class536) var4.field1311;
                class519 var5 = this.method1051(false);
                var3.method3163(var5.field7545, var5.field7558, 0, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method3165(-7527);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Z", line = 60)
    public final boolean method1045(int arg0, int arg1) {
        ++field2286;
        return ~arg0 == arg1 ? super.field2565 : true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 72)
    public static void method1046(byte arg0) {
        if (arg0 != 17) {
            method1052(-57, -66);
        }
        field2284 = null;
        field2287 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lul;)V", line = 464)
    public class149(class411 arg0) {
        super.field2566 = 3;
        this.method1043((byte) 123, true);
        super.field2571 = true;
        super.field2573 = 0;
        super.field2568 = 2;
        super.field2589 = true;
        super.field2550 = 127;
        super.field2587 = true;
        super.field2585 = true;
        super.field2563 = 0;
        super.field2577 = true;
        super.field2590 = true;
        super.field2569 = 127;
        super.field2574 = 1;
        super.field2576 = 0;
        super.field2579 = true;
        super.field2575 = false;
        super.field2549 = 127;
        super.field2588 = 0;
        super.field2562 = true;
        super.field2567 = true;
        super.field2582 = true;
        super.field2584 = 0;
        if (~class414.field5859 <= -97) {
            class179.method1248(-81, 2);
        } else {
            class179.method1248(-76, 0);
        }
        super.field2560 = 0;
        super.field2556 = false;
        super.field2564 = 0;
        super.field2554 = false;
        super.field2586 = true;
        super.field2578 = false;
        super.field2581 = true;
        super.field2580 = 2;
        super.field2561 = class290.field4316 == 1 ? 2 : 4;
        super.field2553 = 2;
        class536 var2 = null;
        try {
            class81 var3 = arg0.method2463(false, "", true);
            while (~var3.field1314 == -1) {
                class477.method2826(1L, 0);
            }
            if (var3.field1314 == 1) {
                var2 = (class536) var3.field1311;
                byte[] var4 = new byte[(int) var2.method3160((byte) 74)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method3161(var4, var4.length + -var5, 121, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method1047(new class519(var4), 19759);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method3165(-7527);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lwn;I)V", line = 89)
    private final void method1047(class519 arg0, int arg1) {
        ++field2280;
        if (arg0.field7545.length - arg0.field7558 >= 1) {
            int var3 = arg0.method3072((byte) -121);
            if (~var3 <= -1 && ~var3 >= -18) {
                byte var4;
                if (~var3 == -18) {
                    var4 = 40;
                } else if (~var3 == -17) {
                    var4 = 38;
                } else if (var3 != 15) {
                    if (~var3 == -15) {
                        var4 = 36;
                    } else if (var3 == 13) {
                        var4 = 35;
                    } else if (var3 == 12) {
                        var4 = 34;
                    } else if (var3 != 11) {
                        if (var3 != 10) {
                            if (~var3 == -10) {
                                var4 = 31;
                            } else if (~var3 != -9) {
                                if (var3 == 7) {
                                    var4 = 29;
                                } else if (var3 == 6) {
                                    var4 = 28;
                                } else if (var3 != 5) {
                                    if (~var3 == -5) {
                                        var4 = 24;
                                    } else if (var3 != 3) {
                                        if (~var3 == -3) {
                                            var4 = 22;
                                        } else if (~var3 == -2) {
                                            var4 = 23;
                                        } else {
                                            var4 = 19;
                                        }
                                    } else {
                                        var4 = 23;
                                    }
                                } else {
                                    var4 = 28;
                                }
                            } else {
                                var4 = 30;
                            }
                        } else {
                            var4 = 32;
                        }
                    } else {
                        var4 = 33;
                    }
                } else {
                    var4 = 37;
                }
                if (~var4 >= ~(arg0.field7545.length + -arg0.field7558)) {
                    super.field2566 = arg0.method3072((byte) -128);
                    if (super.field2566 >= 1) {
                        if (super.field2566 > 4) {
                            super.field2566 = 4;
                        }
                    } else {
                        super.field2566 = 1;
                    }
                    this.method1043((byte) 126, arg0.method3072((byte) -128) == 1);
                    super.field2590 = arg0.method3072((byte) -122) == 1;
                    super.field2577 = ~arg0.method3072((byte) -123) == -2;
                    super.field2585 = arg0.method3072((byte) -120) == 1;
                    super.field2574 = ~arg0.method3072((byte) -125) == -2 ? 1 : 0;
                    super.field2579 = ~arg0.method3072((byte) -127) == -2;
                    super.field2582 = ~arg0.method3072((byte) -122) == -2;
                    super.field2562 = ~arg0.method3072((byte) -124) == -2;
                    super.field2568 = arg0.method3072((byte) -121);
                    if (arg1 != 19759) {
                        method1049((byte) 87, -71, -8);
                    }
                    if (~super.field2568 < -3) {
                        super.field2568 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field2573 = arg0.method3072((byte) -127);
                    }
                    if (~var3 <= -3) {
                        super.field2589 = ~arg0.method3072((byte) -119) == -2;
                        if (var3 >= 17) {
                            super.field2575 = arg0.method3072((byte) -127) == 1;
                        }
                    } else {
                        super.field2589 = arg0.method3072((byte) -127) == 1;
                        arg0.method3072((byte) -128);
                    }
                    super.field2567 = ~arg0.method3072((byte) -122) == -2;
                    super.field2571 = ~arg0.method3072((byte) -123) == -2;
                    super.field2563 = arg0.method3072((byte) -128);
                    if (super.field2563 > 2) {
                        super.field2563 = 2;
                    }
                    super.field2576 = super.field2563;
                    super.field2587 = arg0.method3072((byte) -121) == 1;
                    super.field2549 = arg0.method3072((byte) -125);
                    if (~super.field2549 < -128) {
                        super.field2549 = 127;
                    }
                    super.field2569 = arg0.method3072((byte) -126);
                    super.field2550 = arg0.method3072((byte) -128);
                    if (~super.field2550 < -128) {
                        super.field2550 = 127;
                    }
                    if (var3 >= 1) {
                        super.field2584 = arg0.method3018(566990904);
                        super.field2588 = arg0.method3018(566990904);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg0.method3072((byte) -123);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method3072((byte) -128);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class414.field5859 > -97) {
                            var5 = 0;
                        }
                        class179.method1248(arg1 + -19839, var5);
                    }
                    if (var3 >= 5) {
                        super.field2560 = arg0.method3053(-129);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field2580 = var6 = arg0.method3072((byte) -123);
                    }
                    if (super.field2580 != 1 && super.field2580 != 2) {
                        super.field2580 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field2556 = arg0.method3072((byte) -123) == 1;
                    }
                    if (~var3 <= -9) {
                        super.field2554 = arg0.method3072((byte) -127) == 1;
                    }
                    if (var3 >= 9) {
                        super.field2564 = arg0.method3072((byte) -127);
                    }
                    if (super.field2564 < 0 || super.field2564 > class475.method2818(0, class414.field5859)) {
                        super.field2564 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field2578 = ~arg0.method3072((byte) -127) != -1;
                    }
                    if (var3 >= 11) {
                        super.field2581 = ~arg0.method3072((byte) -128) != -1;
                    }
                    if (var3 >= 12) {
                        super.field2574 = arg0.method3072((byte) -122);
                    }
                    if (super.field2574 < 0 || ~super.field2574 < -3) {
                        super.field2574 = 1;
                    }
                    if (var3 >= 13) {
                        super.field2586 = ~arg0.method3072((byte) -127) == -2;
                    }
                    if (~var3 <= -15) {
                        super.field2553 = arg0.method3072((byte) -126);
                    } else if (var6 == 0) {
                        super.field2553 = 2;
                    } else {
                        super.field2553 = 1;
                    }
                    if (super.field2553 < 0 || super.field2553 > 3) {
                        super.field2553 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field2561 = arg0.method3072((byte) -123);
                        if (~super.field2561 > -1 || super.field2561 > 4) {
                            super.field2561 = class290.field4316 == 1 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field2583 = ~arg0.method3072((byte) -127) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field2583 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && super.field2553 == 0) {
                        super.field2553 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)Z", line = 351)
    public final boolean method1048(int arg0, int arg1) {
        ++field2277;
        int var3 = -101 % ((arg1 - -32) / 36);
        return ~arg0 == -1 && !this.field2285 ? super.field2565 : true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)Z", line = 365)
    public static final boolean method1049(byte arg0, int arg1, int arg2) {
        ++field2283;
        if (arg0 != -23) {
            return false;
        } else if (!((65536 & arg1) != 0 | class350.method2203(arg2, 0, arg1)) && !class358.method2221(arg1, 99, arg2)) {
            return (arg2 & 55) == 0 && class437.method2573(arg2, (byte) -99, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II)I", line = 380)
    public final int method1050(int arg0, int arg1) {
        ++field2281;
        if (this.field2279) {
            return 0;
        } else if (!this.method1048(arg1, arg0 + -31542)) {
            return 1;
        } else {
            if (arg0 != 31659) {
                this.field2279 = true;
            }
            return !super.field2590 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Lwn;", line = 397)
    public final class519 method1051(boolean arg0) {
        ++field2278;
        class519 var2 = new class519(41);
        if (arg0) {
            return null;
        } else {
            var2.method3048(-2034159384, 17);
            var2.method3048(-2034159384, super.field2566);
            var2.method3048(-2034159384, super.field2565 ? 1 : 0);
            var2.method3048(-2034159384, !super.field2590 ? 0 : 1);
            var2.method3048(-2034159384, super.field2577 ? 1 : 0);
            var2.method3048(-2034159384, super.field2585 ? 1 : 0);
            var2.method3048(-2034159384, 0);
            var2.method3048(-2034159384, super.field2579 ? 1 : 0);
            var2.method3048(-2034159384, super.field2582 ? 1 : 0);
            var2.method3048(-2034159384, !super.field2562 ? 0 : 1);
            var2.method3048(-2034159384, super.field2568);
            var2.method3048(-2034159384, super.field2573);
            var2.method3048(-2034159384, !super.field2589 ? 0 : 1);
            var2.method3048(-2034159384, !super.field2575 ? 0 : 1);
            var2.method3048(-2034159384, !super.field2567 ? 0 : 1);
            var2.method3048(-2034159384, !super.field2571 ? 0 : 1);
            var2.method3048(-2034159384, super.field2563);
            var2.method3048(-2034159384, super.field2587 ? 1 : 0);
            var2.method3048(-2034159384, super.field2549);
            var2.method3048(-2034159384, super.field2569);
            var2.method3048(-2034159384, super.field2550);
            var2.method3016(super.field2584, -122);
            var2.method3016(super.field2588, -54);
            var2.method3048(-2034159384, class501.method2925(-113));
            var2.method3019(super.field2560, 11648);
            var2.method3048(-2034159384, super.field2580);
            var2.method3048(-2034159384, super.field2556 ? 1 : 0);
            var2.method3048(-2034159384, super.field2554 ? 1 : 0);
            var2.method3048(-2034159384, super.field2564);
            var2.method3048(-2034159384, !super.field2578 ? 0 : 1);
            var2.method3048(-2034159384, !super.field2581 ? 0 : 1);
            var2.method3048(-2034159384, super.field2574);
            var2.method3048(-2034159384, !super.field2586 ? 0 : 1);
            var2.method3048(-2034159384, super.field2553);
            var2.method3048(-2034159384, super.field2561);
            var2.method3048(-2034159384, !super.field2583 ? 0 : 1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(II)I", line = 447)
    public static final int method1052(int arg0, int arg1) {
        ++field2282;
        return ~arg0 == arg1 ? -1 : class238.method1578(-79, arg0);
    }
}
