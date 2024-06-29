import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class377 extends class439 {

    @OriginalMember(owner = "client!ti", name = "qb", descriptor = "Z")
    public boolean field5739 = false;

    @OriginalMember(owner = "client!ti", name = "mb", descriptor = "Z")
    public boolean field5735 = false;

    @OriginalMember(owner = "client!ti", name = "rb", descriptor = "Z")
    public boolean field5740 = false;

    @OriginalMember(owner = "client!ti", name = "Ab", descriptor = "Z")
    public boolean field5749 = false;

    @OriginalMember(owner = "client!ti", name = "Gb", descriptor = "Z")
    public boolean field5755 = false;

    @OriginalMember(owner = "client!ti", name = "yb", descriptor = "[I")
    public static int[] field5747 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ti", name = "tb", descriptor = "Lkca;")
    public static class73 field5742 = new class73(18, -1);

    @OriginalMember(owner = "client!ti", name = "Eb", descriptor = "Ldb;")
    public static class272 field5753 = new class272(14, 0, 4, 1);

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ti", name = "gb", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ti", name = "hb", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!ti", name = "ib", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!ti", name = "jb", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!ti", name = "kb", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!ti", name = "lb", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ti", name = "nb", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!ti", name = "ob", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ti", name = "pb", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ti", name = "sb", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ti", name = "ub", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ti", name = "vb", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!ti", name = "wb", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ti", name = "xb", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!ti", name = "zb", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ti", name = "Bb", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!ti", name = "Cb", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!ti", name = "Db", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!ti", name = "Fb", descriptor = "I")
    public int field5754;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    private final void method2422(byte arg0) {
        ++field5752;
        if (arg0 < 106) {
            this.method2430(-64);
        }
        if (~class510.field7466 < -2) {
            super.field6557 = 4;
        } else {
            super.field6557 = 2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    public final void method2423(int arg0) {
        this.method2439(true, -15);
        ++field5750;
        super.field6539 = true;
        super.field6528 = true;
        super.field6564 = true;
        super.field6525 = true;
        super.field6530 = true;
        super.field6531 = super.field6541 = 2;
        super.field6524 = true;
        super.field6542 = 1;
        super.field6555 = true;
        super.field6552 = super.field6538 = 0;
        super.field6556 = true;
        super.field6549 = true;
        super.field6526 = true;
        super.field6561 = true;
        if (class362.field5189 > 95) {
            class62.method441(2, (byte) 2);
        } else {
            class62.method441(0, (byte) 2);
        }
        super.field6537 = 0;
        super.field6523 = false;
        super.field6535 = true;
        this.method2422((byte) 108);
        this.method2432(0, -32280);
        super.field6563 = arg0;
        class170.method982(17526);
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
    public final void method2424(int arg0) {
        ++field5741;
        this.method2439(true, -15);
        super.field6531 = super.field6541 = 1;
        super.field6561 = true;
        super.field6526 = true;
        super.field6556 = false;
        super.field6528 = true;
        super.field6539 = true;
        int var2 = -19 / ((-34 - arg0) / 37);
        super.field6549 = true;
        super.field6555 = true;
        super.field6530 = false;
        super.field6542 = 1;
        super.field6564 = true;
        super.field6552 = super.field6538 = 0;
        super.field6525 = true;
        super.field6524 = true;
        if (class362.field5189 > 95) {
            class62.method441(1, (byte) 2);
        } else {
            class62.method441(0, (byte) 2);
        }
        super.field6535 = true;
        super.field6537 = 0;
        super.field6523 = false;
        this.method2422((byte) 119);
        this.method2432(1, -32280);
        super.field6563 = 3;
        class170.method982(17526);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(IB)I")
    private final int method2425(int arg0, byte arg1) {
        ++field5733;
        if (arg1 != -33) {
            return 72;
        } else {
            byte var3;
            if (arg0 > 12000) {
                var3 = 4;
                this.method2423(arg1 + 37);
            } else if (arg0 > 5000) {
                var3 = 3;
                this.method2424(114);
            } else if (arg0 <= 2000) {
                var3 = 1;
                this.method2430(82);
            } else {
                this.method2437((byte) 56);
                var3 = 2;
            }
            if (~class81.field908 != -3) {
                super.field6558 = 2;
                class418.method2644(2, (byte) 80);
            }
            this.method2440(class20.field197, -104);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
    public final boolean method2426(int arg0, int arg1) {
        ++field5729;
        if (arg1 != -5) {
            field5732 = 0;
        }
        return arg0 == 0 && !this.field5749 ? super.field6540 : true;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I")
    public final int method2427(int arg0, int arg1) {
        if (arg0 < 94) {
            return -72;
        } else {
            ++field5731;
            if (class459.method2829(true, arg1)) {
                return ~class362.field5189 > -97 && class15.method99(arg1, -93) && super.field6565 == 0 ? 1 : super.field6565;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)Z")
    public final boolean method2428(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field5754 = -43;
        }
        ++field5746;
        return ~arg1 == -1 ? super.field6540 : true;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)I")
    public static final int method2429(int arg0, int arg1, byte arg2) {
        int var3 = (127 & arg1) * arg0 >> 7;
        ++field5738;
        if (var3 >= 2) {
            if (~var3 < -127) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return arg2 != 56 ? -6 : (arg1 & 65408) + var3;
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
    public final void method2430(int arg0) {
        ++field5748;
        if (arg0 < 44) {
            field5742 = null;
        }
        this.method2439(false, -15);
        super.field6564 = false;
        super.field6542 = 0;
        super.field6526 = false;
        super.field6525 = false;
        super.field6539 = false;
        super.field6555 = false;
        super.field6530 = false;
        super.field6531 = super.field6541 = 0;
        super.field6549 = false;
        super.field6556 = false;
        super.field6524 = false;
        super.field6552 = super.field6538 = 0;
        super.field6561 = false;
        super.field6528 = false;
        class62.method441(0, (byte) 2);
        super.field6537 = 0;
        super.field6535 = false;
        super.field6523 = false;
        this.method2422((byte) 118);
        this.method2432(2, -32280);
        super.field6563 = 1;
        class170.method982(17526);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
    private final int method2431(int arg0, int arg1, int arg2) {
        ++field5745;
        byte var4;
        if (~arg1 < -20001) {
            this.method2423(4);
            var4 = 4;
        } else if (~arg1 >= -10001) {
            if (~arg1 >= -5001) {
                this.method2430(80);
                var4 = 1;
            } else {
                var4 = 2;
                this.method2437((byte) 49);
            }
        } else {
            this.method2424(-108);
            var4 = 3;
        }
        if (class81.field908 != arg0) {
            super.field6558 = arg0;
            class418.method2644(arg0, (byte) 80);
        }
        if (arg2 > -74) {
            return -62;
        } else {
            this.method2440(class20.field197, -124);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(II)V")
    public final void method2432(int arg0, int arg1) {
        if (arg1 != -32280) {
            this.field5749 = false;
        }
        ++field5728;
        class141.field1740 = true;
        super.field6565 = arg0;
        class156.field1935 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lrt;I)V")
    private final void method2433(class194 arg0, int arg1) {
        ++field5736;
        if (~(arg0.field2622.length - arg0.field2610) <= -2) {
            int var3 = arg0.method1177(arg1 + 236);
            if (~var3 <= -1 && ~var3 >= -22) {
                byte var4;
                if (var3 == 21) {
                    var4 = 44;
                } else if (var3 == 20) {
                    var4 = 43;
                } else if (var3 != 19) {
                    if (var3 != 18) {
                        if (~var3 != -18) {
                            if (~var3 != -17) {
                                if (~var3 != -16) {
                                    if (var3 != 14) {
                                        if (var3 != 13) {
                                            if (~var3 != -13) {
                                                if (~var3 == -12) {
                                                    var4 = 33;
                                                } else if (var3 != 10) {
                                                    if (var3 == 9) {
                                                        var4 = 31;
                                                    } else if (~var3 == -9) {
                                                        var4 = 30;
                                                    } else if (var3 == 7) {
                                                        var4 = 29;
                                                    } else if (var3 != 6) {
                                                        if (var3 != 5) {
                                                            if (~var3 == -5) {
                                                                var4 = 24;
                                                            } else if (~var3 != -4) {
                                                                if (~var3 == -3) {
                                                                    var4 = 22;
                                                                } else if (var3 != 1) {
                                                                    var4 = 19;
                                                                } else {
                                                                    var4 = 23;
                                                                }
                                                            } else {
                                                                var4 = 23;
                                                            }
                                                        } else {
                                                            var4 = 28;
                                                        }
                                                    } else {
                                                        var4 = 28;
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
                    } else {
                        var4 = 41;
                    }
                } else {
                    var4 = 42;
                }
                if (var4 <= arg0.field2622.length - arg0.field2610) {
                    super.field6551 = arg0.method1177(arg1 + 236);
                    if (super.field6551 < 1) {
                        super.field6551 = 1;
                    } else if (super.field6551 > 4) {
                        super.field6551 = 4;
                    }
                    this.method2439(~arg0.method1177(255) == -2, -15);
                    super.field6525 = ~arg0.method1177(arg1 ^ 236) == -2;
                    super.field6549 = arg0.method1177(255) == 1;
                    super.field6564 = ~arg0.method1177(255) == -2;
                    super.field6542 = arg0.method1177(255) != 1 ? 0 : 1;
                    super.field6526 = arg0.method1177(255) == 1;
                    super.field6528 = ~arg0.method1177(255) == -2;
                    super.field6561 = arg0.method1177(255) == 1;
                    super.field6531 = arg0.method1177(255);
                    if (~super.field6531 < -3) {
                        super.field6531 = 2;
                    }
                    if (var3 >= 17) {
                        super.field6541 = arg0.method1177(arg1 + 236);
                    }
                    if (var3 < 2) {
                        super.field6524 = arg0.method1177(255) == 1;
                        arg0.method1177(255);
                    } else {
                        super.field6524 = ~arg0.method1177(255) == -2;
                        if (~var3 <= -18) {
                            super.field6530 = ~arg0.method1177(255) == -2;
                        }
                    }
                    super.field6556 = arg0.method1177(arg1 + 236) == 1;
                    super.field6555 = arg0.method1177(255) == 1;
                    super.field6552 = arg0.method1177(255);
                    if (super.field6552 > 2) {
                        super.field6552 = 2;
                    }
                    super.field6538 = super.field6552;
                    super.field6520 = ~arg0.method1177(255) == -2;
                    super.field6532 = arg0.method1177(arg1 + 236);
                    if (super.field6532 > 127) {
                        super.field6532 = 127;
                    }
                    if (~var3 > -21) {
                        super.field6529 = super.field6532;
                    } else {
                        super.field6529 = arg0.method1177(255);
                        if (super.field6529 > 127) {
                            super.field6529 = 127;
                        }
                    }
                    super.field6562 = arg0.method1177(255);
                    super.field6544 = arg0.method1177(255);
                    if (~super.field6544 < -128) {
                        super.field6544 = 127;
                    }
                    if (~var3 <= -22) {
                        super.field6518 = arg0.method1177(arg1 + 236);
                        if (~super.field6518 < -128) {
                            super.field6518 = 127;
                        }
                    } else {
                        super.field6518 = super.field6562;
                    }
                    if (~var3 <= -2) {
                        super.field6546 = arg0.method1220(-20);
                        super.field6559 = arg0.method1220(arg1 ^ -105);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg0.method1177(255);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method1177(255);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class362.field5189 < 96) {
                            var5 = 0;
                        }
                        class62.method441(var5, (byte) 2);
                    }
                    if (~var3 <= -6) {
                        super.field6533 = arg0.method1178(-230315992);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field6543 = var6 = arg0.method1177(255);
                    }
                    if (~super.field6543 != -2 && ~super.field6543 != -3) {
                        super.field6543 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field6521 = ~arg0.method1177(255) == -2;
                    }
                    if (~var3 <= -9) {
                        super.field6547 = ~arg0.method1177(255) == -2;
                    }
                    if (~var3 <= -10) {
                        super.field6537 = arg0.method1177(arg1 + 236);
                    }
                    if (super.field6537 < 0 || super.field6537 > class41.method222(true, class362.field5189)) {
                        super.field6537 = 0;
                    }
                    if (var3 >= 10) {
                        super.field6523 = ~arg0.method1177(255) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field6522 = arg0.method1177(255) != 0;
                    }
                    if (var3 >= 12) {
                        super.field6542 = arg0.method1177(255);
                    }
                    if (~super.field6542 > -1 || ~super.field6542 < -3) {
                        super.field6542 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field6535 = arg0.method1177(255) == 1;
                    }
                    if (~var3 > -15) {
                        if (~var6 == -1) {
                            super.field6558 = 2;
                        } else {
                            super.field6558 = 1;
                        }
                    } else {
                        super.field6558 = arg0.method1177(255);
                    }
                    if (super.field6558 < 0 || ~super.field6558 < -6) {
                        super.field6558 = 2;
                    }
                    if (var3 >= 15) {
                        super.field6557 = arg0.method1177(255);
                        if (super.field6557 < 0 || ~super.field6557 < -5) {
                            super.field6557 = ~class510.field7466 == -2 ? 2 : 4;
                        }
                    }
                    if (var3 >= 16) {
                        super.field6539 = arg0.method1177(255) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field6539 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && super.field6558 == 0) {
                        super.field6558 = 2;
                    }
                    if (var3 >= 18) {
                        super.field6563 = arg0.method1177(255);
                        if (~super.field6563 > -1 || ~super.field6563 < -5) {
                            super.field6563 = 0;
                        }
                    }
                    if (var3 < arg1) {
                        if (~super.field6563 != -2 && ~super.field6563 != -3) {
                            if (~super.field6563 != -4) {
                                super.field6565 = 0;
                            } else {
                                super.field6565 = 1;
                            }
                        } else {
                            super.field6565 = 2;
                        }
                    } else {
                        super.field6565 = arg0.method1177(255);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
    public final int method2434(byte arg0) {
        ++field5734;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class20.field197.field7804 && !class20.field197.field7802) {
            if (class545.field7788.startsWith("win")) {
                var4 = true;
                var3 = true;
                if (!class545.field7806.startsWith("amd64") && !class545.field7806.startsWith("x86_64")) {
                    var2 = true;
                }
            } else {
                var3 = true;
            }
        }
        if (this.field5740) {
            var3 = false;
        }
        if (this.field5755) {
            var2 = false;
        }
        if (this.field5739) {
            var4 = false;
        }
        int var5 = 105 / ((arg0 - 20) / 58);
        if (!var2 && !var3 && !var4) {
            return this.method2435(2);
        } else {
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            if (var2) {
                try {
                    var6 = class45.method234(2, true, 1000);
                } catch (Exception var15) {
                }
            }
            if (var4) {
                try {
                    var8 = class45.method234(3, true, 1000);
                    if (~class81.field908 == -4) {
                        class479 var9 = class413.field6264.method330();
                        long var10 = var9.field7044 & 281474976710655L;
                        int var12 = var9.field7050;
                        if (~var12 != -4319) {
                            if (~var12 == -4099) {
                                var3 &= var10 >= 60129613779L;
                            }
                        } else {
                            var3 &= ~var10 <= -64425238955L;
                        }
                    }
                } catch (Exception var14) {
                }
            }
            if (var3) {
                try {
                    var7 = class45.method234(1, true, 1000);
                } catch (Exception var13) {
                }
            }
            if (~var6 == 0 && ~var7 == 0 && var8 == -1) {
                return this.method2435(2);
            } else if (~var6 < ~var8 && ~var7 > ~var6) {
                return this.method2425(var6, (byte) -33);
            } else {
                return ~var8 >= ~var7 ? this.method2431(1, var7, -99) : this.method2431(3, var8, -88);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)I")
    private final int method2435(int arg0) {
        if (arg0 != 2) {
            this.method2437((byte) 114);
        }
        ++field5730;
        byte var2;
        if (~class362.field5189 > -97) {
            var2 = 1;
            this.method2430(arg0 + 52);
        } else {
            int var3 = class333.method2165((byte) 46);
            if (var3 <= 100) {
                this.method2423(4);
                var2 = 4;
            } else if (var3 > 500) {
                if (var3 <= 1000) {
                    var2 = 2;
                    this.method2437((byte) 97);
                } else {
                    this.method2430(127);
                    var2 = 1;
                }
            } else {
                var2 = 3;
                this.method2424(arg0 + 8);
            }
        }
        if (~class81.field908 != -1) {
            super.field6558 = 0;
            class418.method2644(0, (byte) 80);
        }
        this.method2440(class20.field197, -113);
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(II)I")
    public final int method2436(int arg0, int arg1) {
        ++field5751;
        if (arg1 != 0) {
            field5747 = null;
        }
        if (this.field5735) {
            return 0;
        } else if (!this.method2426(arg0, -5)) {
            return 1;
        } else {
            return !super.field6525 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
    public final void method2437(byte arg0) {
        this.method2439(true, -15);
        ++field5743;
        super.field6564 = false;
        super.field6524 = false;
        super.field6556 = false;
        super.field6549 = true;
        if (arg0 > 22) {
            super.field6526 = false;
            super.field6542 = 0;
            super.field6561 = false;
            super.field6531 = super.field6541 = 0;
            super.field6528 = false;
            super.field6552 = super.field6538 = 0;
            super.field6555 = false;
            super.field6539 = false;
            super.field6525 = false;
            super.field6530 = false;
            class62.method441(0, (byte) 2);
            super.field6537 = 0;
            super.field6535 = true;
            super.field6523 = false;
            this.method2422((byte) 123);
            this.method2432(2, -32280);
            super.field6563 = 2;
            class170.method982(17526);
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)V")
    public static void method2438(byte arg0) {
        field5753 = null;
        int var1 = -84 / ((arg0 - 21) / 51);
        field5747 = null;
        field5742 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
    public final void method2439(boolean arg0, int arg1) {
        ++field5744;
        super.field6540 = arg0;
        if (arg1 == -15) {
            if (class575.field8301 != null) {
                class575.field8301.method1501((byte) -96, !this.method2426(class81.field908, -5));
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ltq;I)V")
    public final void method2440(class545 arg0, int arg1) {
        ++field5737;
        class393 var3 = null;
        try {
            class175 var4 = arg0.method3161(false, true, "");
            while (var4.field2138 == 0) {
                class646.method3696(1, 1L);
            }
            if (~var4.field2138 == -2) {
                var3 = (class393) var4.field2140;
                class194 var5 = new class194(class301.method2001(-32586));
                this.method2736(20711, var5);
                var3.method2529(var5.field2610, var5.field2622, 0, true);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2528((byte) 92);
            }
            if (arg1 >= -102) {
                this.method2423(-28);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ltq;)V")
    public class377(class545 arg0) {
        super.field6563 = 3;
        super.field6551 = 3;
        this.method2439(true, -15);
        super.field6531 = 2;
        super.field6542 = 1;
        super.field6552 = 0;
        super.field6546 = 0;
        super.field6528 = true;
        super.field6544 = 127;
        super.field6541 = 0;
        super.field6518 = 127;
        super.field6556 = true;
        super.field6564 = true;
        super.field6561 = true;
        super.field6549 = true;
        super.field6526 = true;
        super.field6525 = true;
        super.field6524 = true;
        super.field6530 = false;
        super.field6538 = 0;
        super.field6562 = 127;
        super.field6532 = 127;
        super.field6555 = true;
        super.field6559 = 0;
        super.field6529 = 127;
        super.field6520 = true;
        if (~class362.field5189 > -97) {
            class62.method441(0, (byte) 2);
        } else {
            class62.method441(2, (byte) 2);
        }
        super.field6543 = 2;
        super.field6558 = 2;
        super.field6557 = ~class510.field7466 == -2 ? 2 : 4;
        super.field6521 = false;
        super.field6535 = true;
        super.field6523 = false;
        super.field6533 = 0;
        super.field6547 = false;
        super.field6537 = 0;
        super.field6565 = 0;
        super.field6522 = true;
        class393 var2 = null;
        try {
            class175 var3 = arg0.method3161(false, true, "");
            while (var3.field2138 == 0) {
                class646.method3696(1, 1L);
            }
            if (var3.field2138 == 1) {
                var2 = (class393) var3.field2140;
                byte[] var4 = new byte[(int) var2.method2533((byte) 71)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method2531(var5, var4, -14263, var4.length + -var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method2433(new class194(var4), 19);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2528((byte) 122);
            }
        } catch (Exception var7) {
        }
    }
}
