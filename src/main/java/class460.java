import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class460 extends class472 {

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "Z")
    public boolean field6529 = false;

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "Z")
    public boolean field6526 = false;

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "Z")
    public boolean field6531 = false;

    @OriginalMember(owner = "client!rd", name = "yb", descriptor = "Z")
    public boolean field6542 = false;

    @OriginalMember(owner = "client!rd", name = "sb", descriptor = "Z")
    public boolean field6536 = false;

    @OriginalMember(owner = "client!rd", name = "vb", descriptor = "[I")
    public static int[] field6539 = new int[13];

    @OriginalMember(owner = "client!rd", name = "Jb", descriptor = "Z")
    public static boolean field6553 = false;

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!rd", name = "qb", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!rd", name = "rb", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!rd", name = "tb", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!rd", name = "ub", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!rd", name = "wb", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!rd", name = "xb", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!rd", name = "zb", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!rd", name = "Ab", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!rd", name = "Bb", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!rd", name = "Cb", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!rd", name = "Db", descriptor = "I")
    public int field6547;

    @OriginalMember(owner = "client!rd", name = "Eb", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!rd", name = "Fb", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!rd", name = "Gb", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!rd", name = "Hb", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!rd", name = "Ib", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!rd", name = "Kb", descriptor = "Luk;")
    public static class476 field6554;

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "Lqo;")
    public static class550 field6530;

    @OriginalMember(owner = "client!rd", name = "Lb", descriptor = "[Ljava/lang/String;")
    public static String[] field6555;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
    public final void method2632(int arg0, int arg1) {
        ++field6527;
        class359.field4820 = null;
        if (arg0 != -31628) {
            field6554 = null;
        }
        class298.field3721 = true;
        super.field6766 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)I")
    private final int method2633(boolean arg0, int arg1) {
        if (arg0) {
            return -17;
        } else {
            ++field6528;
            byte var3;
            if (arg1 > 12000) {
                this.method2648(22106);
                var3 = 4;
            } else if (~arg1 >= -5001) {
                if (arg1 <= 2000) {
                    this.method2643(true, 0);
                    var3 = 1;
                } else {
                    var3 = 2;
                    this.method2636(0);
                }
            } else {
                var3 = 3;
                this.method2635(false);
            }
            if (class430.field6109 != 2) {
                super.field6777 = 2;
                class434.method2489(2, (byte) -122);
            }
            this.method2642(-2, class353.field4757);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
    public final int method2634(int arg0) {
        ++field6546;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class353.field4757.field6614 && !class353.field4757.field6611) {
            if (!class464.field6624.startsWith("win")) {
                var3 = true;
            } else {
                var3 = true;
                var4 = true;
                if (!class464.field6620.startsWith("amd64") && !class464.field6620.startsWith("x86_64")) {
                    var2 = true;
                }
            }
        }
        if (arg0 <= 119) {
            this.field6529 = true;
        }
        if (this.field6529) {
            var4 = false;
        }
        if (this.field6531) {
            var3 = false;
        }
        if (this.field6526) {
            var2 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method2645(500);
        } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
                try {
                    var5 = class9.method55(1000, 2, true);
                } catch (Exception var16) {
                }
            }
            if (var4) {
                try {
                    var7 = class9.method55(1000, 3, true);
                    if (class430.field6109 == 3) {
                        class286 var8 = class701.field9813.method1037();
                        long var9 = var8.field3573 & 281474976710655L;
                        int var11 = var8.field3569;
                        if (var11 != 4318) {
                            if (var11 == 4098) {
                                var3 &= ~var9 <= -60129613780L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class9.method55(1000, 1, true);
                } catch (Exception var14) {
                }
            }
            if (~var5 == 0 && ~var6 == 0 && var7 == -1) {
                return this.method2645(500);
            } else {
                int var12 = (int) ((float) var6 * 1.1F);
                int var13 = (int) ((float) var7 * 1.1F);
                if (~var13 > ~var5 && ~var12 > ~var5) {
                    return this.method2633(false, var5);
                } else {
                    return var12 >= var13 ? this.method2647(0, 1, var12) : this.method2647(0, 3, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
    public final void method2635(boolean arg0) {
        this.method2650(false, true);
        ++field6533;
        super.field6803 = 1;
        super.field6795 = true;
        super.field6760 = true;
        super.field6786 = super.field6769 = 0;
        super.field6778 = true;
        super.field6775 = true;
        super.field6787 = super.field6802 = 1;
        super.field6796 = true;
        super.field6783 = true;
        super.field6780 = true;
        super.field6794 = arg0;
        super.field6770 = true;
        super.field6765 = false;
        super.field6781 = true;
        if (class689.field9702 <= 95) {
            class274.method1609(120, 0);
        } else {
            class274.method1609(126, 1);
        }
        super.field6792 = true;
        super.field6797 = 0;
        super.field6771 = false;
        this.method2646(40);
        this.method2632(-31628, 1);
        super.field6798 = 3;
        class114.method609(105);
        class173.method1055(1678);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method2636(int arg0) {
        ++field6541;
        this.method2650(false, true);
        super.field6794 = false;
        super.field6770 = false;
        super.field6803 = 0;
        super.field6775 = false;
        super.field6796 = true;
        super.field6760 = false;
        super.field6765 = false;
        super.field6780 = false;
        super.field6781 = false;
        super.field6786 = super.field6769 = 0;
        super.field6783 = false;
        super.field6795 = false;
        super.field6787 = super.field6802 = arg0;
        super.field6778 = false;
        class274.method1609(-36, 0);
        super.field6771 = false;
        super.field6792 = true;
        super.field6797 = 0;
        this.method2646(40);
        this.method2632(-31628, 2);
        super.field6798 = 2;
        class114.method609(arg0 ^ -100);
        class173.method1055(arg0 + 1678);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static void method2637(int arg0) {
        field6539 = null;
        field6555 = null;
        if (arg0 != -13245) {
            field6539 = null;
        }
        field6530 = null;
        field6554 = null;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public static final void method2638(int arg0) {
        ++class334.field4187;
        ++field6550;
        if (arg0 != 2000) {
            method2637(-6);
        }
        class653 var1 = class699.method3845((byte) 45, class39.field395, class614.field8646);
        var1.field9158.method645(arg0 + -672170216, class664.field9290);
        class568.method3220(var1, (byte) 87);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)I")
    public final int method2639(int arg0, int arg1) {
        if (arg1 != 31285) {
            this.method2640((byte) 103, -121);
        }
        ++field6548;
        if (class619.method3453(true, arg0) && !class487.method2807(arg1 + -31286, class421.field5601)) {
            return class689.field9702 < 96 && class649.method3628(-104, arg0) && super.field6766 == 0 ? 1 : super.field6766;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)I")
    public final int method2640(byte arg0, int arg1) {
        ++field6543;
        if (this.field6542) {
            return 0;
        } else if (!this.method2641(arg1, (byte) 34)) {
            return 1;
        } else if (arg0 != 48) {
            return 124;
        } else {
            return super.field6783 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)Z")
    public final boolean method2641(int arg0, byte arg1) {
        if (arg1 != 34) {
            field6530 = null;
        }
        ++field6535;
        return ~arg0 == -1 && !this.field6536 ? super.field6804 : true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILpi;)V")
    public final void method2642(int arg0, class464 arg1) {
        ++field6537;
        class5 var3 = null;
        try {
            class88 var4 = arg1.method2682("", true, (byte) -16);
            while (~var4.field884 == -1) {
                class452.method2602(1L, (byte) -97);
            }
            if (~var4.field884 == arg0) {
                var3 = (class5) var4.field886;
                class115 var5 = new class115(class595.method3344((byte) 82));
                this.method2723(arg0 + 2, var5);
                var3.method38(49, var5.field1218, 0, var5.field1269);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method37(-1);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(ZI)V")
    public final void method2643(boolean arg0, int arg1) {
        this.method2650(false, false);
        ++field6545;
        super.field6780 = false;
        super.field6765 = false;
        super.field6787 = super.field6802 = 0;
        super.field6770 = false;
        super.field6796 = false;
        super.field6794 = false;
        super.field6775 = false;
        super.field6786 = super.field6769 = 0;
        super.field6760 = false;
        super.field6781 = false;
        super.field6795 = false;
        super.field6778 = false;
        super.field6783 = false;
        super.field6803 = 0;
        class274.method1609(-94, arg1);
        super.field6792 = false;
        super.field6771 = false;
        super.field6797 = 0;
        this.method2646(40);
        this.method2632(-31628, 2);
        super.field6798 = 1;
        if (arg0) {
            class114.method609(arg1 + -104);
        }
        class173.method1055(arg1 ^ 1678);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IB)Z")
    public final boolean method2644(int arg0, byte arg1) {
        ++field6538;
        if (arg1 > -50) {
            field6553 = true;
        }
        return ~arg0 == -1 ? super.field6804 : true;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
    private final int method2645(int arg0) {
        ++field6549;
        if (arg0 != 500) {
            return 46;
        } else {
            byte var3;
            if (~class689.field9702 <= -97) {
                int var2 = class115.method614(100);
                if (var2 <= 100) {
                    var3 = 4;
                    this.method2648(22106);
                } else if (var2 > 500) {
                    if (~var2 < -1001) {
                        var3 = 1;
                        this.method2643(true, 0);
                    } else {
                        var3 = 2;
                        this.method2636(0);
                    }
                } else {
                    var3 = 3;
                    this.method2635(false);
                }
            } else {
                var3 = 1;
                this.method2643(true, 0);
            }
            if (~class430.field6109 != -1) {
                super.field6777 = 0;
                class434.method2489(0, (byte) -116);
            }
            this.method2642(-2, class353.field4757);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
    private final void method2646(int arg0) {
        if (class141.field1559 > 1) {
            super.field6789 = 4;
        } else {
            super.field6789 = 2;
        }
        if (arg0 != 40) {
            this.field6542 = false;
        }
        ++field6552;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)I")
    private final int method2647(int arg0, int arg1, int arg2) {
        ++field6551;
        byte var4;
        if (~arg2 < -20001) {
            var4 = 4;
            this.method2648(22106);
        } else if (arg2 > 10000) {
            var4 = 3;
            this.method2635(false);
        } else if (~arg2 >= -5001) {
            this.method2643(true, arg0);
            var4 = 1;
        } else {
            var4 = 2;
            this.method2636(0);
        }
        if (~class430.field6109 != ~arg1) {
            super.field6777 = arg1;
            class434.method2489(arg1, (byte) -111);
        }
        if (arg0 != 0) {
            this.method2641(-82, (byte) 74);
        }
        this.method2642(-2, class353.field4757);
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)V")
    public final void method2648(int arg0) {
        this.method2650(false, true);
        if (arg0 != 22106) {
            this.method2642(-83, (class464) null);
        }
        ++field6540;
        super.field6760 = true;
        super.field6780 = true;
        super.field6781 = true;
        super.field6775 = true;
        super.field6770 = true;
        super.field6787 = super.field6802 = 2;
        super.field6796 = true;
        super.field6778 = true;
        super.field6794 = true;
        super.field6765 = true;
        super.field6786 = super.field6769 = 0;
        super.field6783 = true;
        super.field6795 = true;
        super.field6803 = 1;
        if (~class689.field9702 < -96) {
            class274.method1609(arg0 + -22124, 2);
        } else {
            class274.method1609(arg0 ^ 22061, 0);
        }
        super.field6797 = 0;
        super.field6771 = false;
        super.field6792 = true;
        this.method2646(40);
        this.method2632(arg0 + -53734, 0);
        super.field6798 = 4;
        class114.method609(arg0 ^ 22078);
        class173.method1055(1678);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lnp;I)V")
    private final void method2649(class115 arg0, int arg1) {
        ++field6534;
        if (arg0.field1269.length + -arg0.field1218 >= 1) {
            int var3 = arg0.method620((byte) -1);
            if (var3 >= 0 && var3 <= 22) {
                byte var4;
                if (var3 != 22) {
                    if (var3 == 21) {
                        var4 = 44;
                    } else if (~var3 == -21) {
                        var4 = 43;
                    } else if (var3 == 19) {
                        var4 = 42;
                    } else if (var3 != 18) {
                        if (~var3 != -18) {
                            if (~var3 != -17) {
                                if (~var3 != -16) {
                                    if (var3 == 14) {
                                        var4 = 36;
                                    } else if (~var3 == -14) {
                                        var4 = 35;
                                    } else if (~var3 != -13) {
                                        if (~var3 != -12) {
                                            if (~var3 == -11) {
                                                var4 = 32;
                                            } else if (var3 != 9) {
                                                if (~var3 != -9) {
                                                    if (var3 != 7) {
                                                        if (~var3 != -7) {
                                                            if (var3 == 5) {
                                                                var4 = 28;
                                                            } else if (~var3 != -5) {
                                                                if (~var3 == -4) {
                                                                    var4 = 23;
                                                                } else if (var3 != 2) {
                                                                    if (~var3 == -2) {
                                                                        var4 = 23;
                                                                    } else {
                                                                        var4 = 19;
                                                                    }
                                                                } else {
                                                                    var4 = 22;
                                                                }
                                                            } else {
                                                                var4 = 24;
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
                                                var4 = 31;
                                            }
                                        } else {
                                            var4 = 33;
                                        }
                                    } else {
                                        var4 = 34;
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
                    var4 = 45;
                }
                if (~(arg0.field1269.length + -arg0.field1218) <= ~var4) {
                    super.field6763 = arg0.method620((byte) -126);
                    if (super.field6763 >= 1) {
                        if (~super.field6763 < -5) {
                            super.field6763 = 4;
                        }
                    } else {
                        super.field6763 = 1;
                    }
                    this.method2650(false, arg0.method620((byte) -29) == 1);
                    super.field6783 = ~arg0.method620((byte) 100) == -2;
                    super.field6796 = arg0.method620((byte) -9) == 1;
                    super.field6775 = arg1 == ~arg0.method620((byte) 86);
                    super.field6803 = ~arg0.method620((byte) 104) != -2 ? 0 : 1;
                    super.field6780 = arg0.method620((byte) -10) == 1;
                    super.field6795 = arg0.method620((byte) -126) == 1;
                    super.field6760 = arg0.method620((byte) -7) == 1;
                    super.field6787 = arg0.method620((byte) 91);
                    if (~super.field6787 < -3) {
                        super.field6787 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field6802 = arg0.method620((byte) 51);
                    }
                    if (~var3 > -3) {
                        super.field6778 = ~arg0.method620((byte) -5) == -2;
                        arg0.method620((byte) -9);
                    } else {
                        super.field6778 = arg0.method620((byte) -31) == 1;
                        if (var3 >= 17) {
                            super.field6765 = arg0.method620((byte) 9) == 1;
                        }
                    }
                    super.field6794 = arg0.method620((byte) -127) == 1;
                    super.field6781 = ~arg0.method620((byte) -126) == -2;
                    super.field6786 = arg0.method620((byte) 94);
                    if (~super.field6786 < -3) {
                        super.field6786 = 2;
                    }
                    super.field6769 = super.field6786;
                    super.field6784 = ~arg0.method620((byte) -126) == -2;
                    super.field6773 = arg0.method620((byte) 62);
                    if (~super.field6773 < -128) {
                        super.field6773 = 127;
                    }
                    if (var3 >= 20) {
                        super.field6776 = arg0.method620((byte) -127);
                        if (~super.field6776 < -128) {
                            super.field6776 = 127;
                        }
                    } else {
                        super.field6776 = super.field6773;
                    }
                    super.field6764 = arg0.method620((byte) -128);
                    super.field6809 = arg0.method620((byte) -30);
                    if (super.field6809 > 127) {
                        super.field6809 = 127;
                    }
                    if (var3 < 21) {
                        super.field6767 = super.field6764;
                    } else {
                        super.field6767 = arg0.method620((byte) 70);
                        if (super.field6767 > 127) {
                            super.field6767 = 127;
                        }
                    }
                    if (var3 >= 1) {
                        super.field6790 = arg0.method643((byte) -77);
                        super.field6774 = arg0.method643((byte) -77);
                    }
                    if (var3 >= 3 && var3 < 6) {
                        arg0.method620((byte) -127);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method620((byte) -127);
                        if (var5 < 0 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (class689.field9702 < 96) {
                            var5 = 0;
                        }
                        class274.method1609(arg1 ^ 85, var5);
                    }
                    if (~var3 <= -6) {
                        super.field6801 = arg0.method631(false);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field6791 = var6 = arg0.method620((byte) -32);
                    }
                    if (super.field6791 != 1 && super.field6791 != 2) {
                        super.field6791 = 2;
                    }
                    if (var3 >= 7) {
                        super.field6807 = ~arg0.method620((byte) 66) == -2;
                    }
                    if (var3 >= 8) {
                        super.field6762 = arg0.method620((byte) 19) == 1;
                    }
                    if (var3 >= 9) {
                        super.field6797 = arg0.method620((byte) -128);
                    }
                    if (~super.field6797 > -1 || ~super.field6797 < ~class118.method691(class689.field9702, (byte) -123)) {
                        super.field6797 = 0;
                    }
                    if (var3 >= 10) {
                        super.field6771 = ~arg0.method620((byte) 116) != -1;
                    }
                    if (var3 >= 11) {
                        super.field6785 = arg0.method620((byte) 2) != 0;
                    }
                    if (var3 >= 12) {
                        super.field6803 = arg0.method620((byte) -22);
                    }
                    if (~super.field6803 > -1 || super.field6803 > 2) {
                        super.field6803 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field6792 = ~arg0.method620((byte) -128) == -2;
                    }
                    if (var3 >= 14) {
                        super.field6777 = arg0.method620((byte) -128);
                    } else if (var6 == 0) {
                        super.field6777 = 2;
                    } else {
                        super.field6777 = 1;
                    }
                    if (~super.field6777 > -1 || super.field6777 > 5) {
                        super.field6777 = 2;
                    }
                    if (var3 >= 15) {
                        super.field6789 = arg0.method620((byte) -126);
                        if (super.field6789 < 0 || super.field6789 > 4) {
                            super.field6789 = ~class141.field1559 == -2 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field6770 = arg0.method620((byte) 121) == 1;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field6770 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field6777 == -1) {
                        super.field6777 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field6798 = arg0.method620((byte) -128);
                        if (super.field6798 < 0 || ~super.field6798 < -5) {
                            super.field6798 = 0;
                        }
                    }
                    if (var3 >= 19) {
                        super.field6766 = arg0.method620((byte) -128);
                    } else if (~super.field6798 != -2 && super.field6798 != 2) {
                        if (super.field6798 == 3) {
                            super.field6766 = 1;
                        } else {
                            super.field6766 = 0;
                        }
                    } else {
                        super.field6766 = 2;
                    }
                    if (var3 >= 22) {
                        super.field6761 = arg0.method620((byte) -128);
                    }
                    if (super.field6777 == 0 && ~class689.field9702 > -97 && ~super.field6798 != -2 && ~super.field6798 != -1) {
                        this.method2643(false, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lpi;)V")
    public class460(class464 arg0) {
        super.field6798 = 3;
        super.field6763 = 3;
        this.method2650(false, true);
        super.field6786 = 0;
        super.field6795 = true;
        super.field6769 = 0;
        super.field6765 = false;
        super.field6790 = 0;
        super.field6784 = true;
        super.field6764 = 127;
        super.field6776 = 127;
        super.field6780 = true;
        super.field6809 = 127;
        super.field6773 = 127;
        super.field6783 = true;
        super.field6775 = true;
        super.field6778 = true;
        super.field6767 = 127;
        super.field6796 = true;
        super.field6794 = true;
        super.field6774 = 0;
        super.field6787 = 2;
        super.field6803 = 1;
        super.field6802 = 0;
        super.field6760 = true;
        super.field6781 = true;
        if (~class689.field9702 > -97) {
            class274.method1609(114, 0);
        } else {
            class274.method1609(-44, 2);
        }
        super.field6801 = 0;
        super.field6771 = false;
        super.field6777 = 2;
        super.field6792 = true;
        super.field6797 = 0;
        super.field6766 = 0;
        super.field6791 = 2;
        super.field6789 = ~class141.field1559 == -2 ? 2 : 4;
        super.field6785 = true;
        super.field6762 = false;
        super.field6807 = false;
        class5 var2 = null;
        try {
            class88 var3 = arg0.method2682("", true, (byte) -16);
            while (~var3.field884 == -1) {
                class452.method2602(1L, (byte) -97);
            }
            if (~var3.field884 == -2) {
                var2 = (class5) var3.field886;
                byte[] var4 = new byte[(int) var2.method36(false)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method41(var4, var5, var4.length + -var5, 31558);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method2649(new class115(var4), -2);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method37(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)V")
    public final void method2650(boolean arg0, boolean arg1) {
        ++field6532;
        if (!arg0) {
            super.field6804 = arg1;
            if (class364.field4891 != null) {
                class364.field4891.method2137(4, !this.method2641(class430.field6109, (byte) 34));
            }
        }
    }
}
