import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class287 extends class411 {

    @OriginalMember(owner = "client!hfa", name = "sc", descriptor = "I")
    public int field4036 = -1;

    @OriginalMember(owner = "client!hfa", name = "Qc", descriptor = "I")
    public int field4060 = -1;

    @OriginalMember(owner = "client!hfa", name = "uc", descriptor = "Lcu;")
    public static class206 field4038 = new class206(60, -1);

    @OriginalMember(owner = "client!hfa", name = "rc", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!hfa", name = "tc", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!hfa", name = "vc", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!hfa", name = "wc", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!hfa", name = "xc", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!hfa", name = "yc", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!hfa", name = "zc", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!hfa", name = "Ac", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!hfa", name = "Bc", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!hfa", name = "Cc", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!hfa", name = "Dc", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!hfa", name = "Ec", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!hfa", name = "Fc", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!hfa", name = "Gc", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!hfa", name = "Hc", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!hfa", name = "Jc", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!hfa", name = "Kc", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!hfa", name = "Lc", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!hfa", name = "Mc", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!hfa", name = "Nc", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!hfa", name = "Oc", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!hfa", name = "Pc", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!hfa", name = "Rc", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!hfa", name = "Sc", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!hfa", name = "Ic", descriptor = "Lci;")
    public class419 field4052;

    @OriginalMember(owner = "client!hfa", name = "Tc", descriptor = "[Ljava/lang/String;")
    public static String[] field4063;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIIZI)V")
    public final void method1768(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field8609 = (byte) arg2;
        ++field4055;
        if (~super.field5575 != 0 && ~class636.field8570.method231(super.field5575, -11764).field8154 == -2) {
            super.field5576 = null;
            super.field5575 = -1;
        }
        if (~super.field5602 != 0) {
            class580 var7 = class120.field2028.method3725(super.field5602, (byte) 81);
            if (var7.field7701 && var7.field7723 != -1 && class636.field8570.method231(var7.field7723, -11764).field8154 == 1) {
                super.field5602 = -1;
            }
        }
        if (~super.field5631 != 0) {
            class580 var8 = class120.field2028.method3725(super.field5631, (byte) 58);
            if (var8.field7701 && ~var8.field7723 != 0 && ~class636.field8570.method231(var8.field7723, -11764).field8154 == -2) {
                super.field5631 = -1;
            }
        }
        if (!arg4) {
            int var9 = -super.field5643[0] + arg3;
            int var10 = -super.field5649[0] + arg5;
            if (var9 >= -8 && ~var9 >= -9 && ~var10 <= 7 && var10 <= 8) {
                if (super.field5642 < 9) {
                    ++super.field5642;
                }
                for (int var11 = super.field5642; var11 > 0; --var11) {
                    super.field5643[var11] = super.field5643[var11 - 1];
                    super.field5649[var11] = super.field5649[var11 + -1];
                    super.field5650[var11] = super.field5650[var11 + -1];
                }
                super.field5643[0] = arg3;
                super.field5650[0] = 1;
                super.field5649[0] = arg5;
                return;
            }
        }
        super.field5641 = 0;
        super.field5644 = 0;
        super.field5643[0] = arg3;
        super.field5642 = 0;
        if (arg1 <= -93) {
            super.field5649[0] = arg5;
            super.field8620 = (super.field5643[0] << 9) + (arg0 << 8);
            super.field8612 = (super.field5649[0] << 9) + (arg0 << 8);
            if (super.field5648 != null) {
                super.field5648.method2707();
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "(I)Z")
    private final boolean method1769(int arg0) {
        if (arg0 != 255) {
            return true;
        } else {
            ++field4045;
            return this.field4052.field5734;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)[Lrt;")
    public static final class212[] method1770(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field4040;
            return new class212[] { class508.field6779, class201.field2926, class410.field5539 };
        }
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(Z)V")
    public static void method1771(boolean arg0) {
        field4038 = null;
        if (!arg0) {
            field4063 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(I)I")
    public final int method1772(int arg0) {
        if (arg0 != 3979) {
            this.field4060 = 71;
        }
        ++field4048;
        if (this.field4052.field5753 != null) {
            class419 var2 = this.field4052.method2401(false, class80.field1261);
            if (var2 != null && ~var2.field5781 != 0) {
                return var2.field5781;
            }
        }
        return this.field4052.field5781;
    }

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "(I)I")
    public final int method1773(int arg0) {
        ++field4042;
        if (arg0 < 23) {
            method1779((byte) -105);
        }
        if (this.field4052.field5753 != null) {
            class419 var2 = this.field4052.method2401(false, class80.field1261);
            if (var2 != null && ~var2.field5801 != 0) {
                return var2.field5801;
            }
        }
        return this.field4052.field5801 != -1 ? this.field4052.field5801 : super.method1773(105);
    }

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field4047;
        if (arg0 != -77) {
            method1779((byte) 100);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IILoa;)Z")
    private final boolean method1774(int arg0, int arg1, class651 arg2) {
        ++field4053;
        int var4 = arg0;
        class543 var5 = this.method2353(arg1);
        class616 var6 = ~super.field5575 != 0 && super.field5611 == 0 ? class636.field8570.method231(super.field5575, -11764) : null;
        class616 var7 = ~super.field5584 == 0 || super.field5609 && var6 != null ? null : class636.field8570.method231(super.field5584, -11764);
        int var8 = var5.field7185;
        int var9 = var5.field7143;
        if (~var8 != -1 || var9 != 0 || ~var5.field7138 != -1 || ~var5.field7154 != -1) {
            arg0 |= 7;
        }
        boolean var10 = super.field5555 != 0 && ~class642.field8626 <= ~super.field5583 && super.field5549 > class642.field8626;
        if (var10) {
            arg0 |= 524288;
        }
        class358 var11 = super.field5640[0] = this.field4052.method2402(super.field5619, class674.field9537, 4, arg0, class80.field1261, super.field5577, super.field5606, var7, super.field5628, super.field5623, class636.field8570, arg2, super.field5605, var6, super.field5554);
        if (var11 == null) {
            return false;
        } else {
            super.field5562 = var11.method1939();
            this.method2361(var11, 113);
            int var12 = super.field5574.method3585(100);
            if (~var8 == -1 && var9 == 0) {
                this.method2358(this.method2317((byte) 40) << 9, this.method2317((byte) 40) << 9, 0, 0, var12, (byte) -77);
            } else {
                this.method2358(var8, var9, var5.field7159, var5.field7167, var12, (byte) -123);
                if (~super.field5560 != -1) {
                    super.field5640[0].method1933(super.field5560);
                }
                if (~super.field5581 != -1) {
                    super.field5640[0].method1904(super.field5581);
                }
                if (~super.field5552 != -1) {
                    super.field5640[0].method1932(0, super.field5552, 0);
                }
            }
            if (var10) {
                var11.method1897(super.field5594, super.field5571, super.field5604, super.field5555 & 255);
            }
            if (~super.field5602 != 0 && ~super.field5598 != 0) {
                class580 var13 = class120.field2028.method3725(super.field5602, (byte) 106);
                boolean var14 = ~var13.field7703 == -4 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field5588 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field5569 != -1) {
                        var15 |= 2;
                    }
                }
                class358 var16 = super.field5640[1] = var13.method3183(var15, class636.field8570, 1, super.field5607, super.field5572, super.field5598, arg2);
                if (var16 != null) {
                    if (super.field5569 != 0) {
                        var16.method1932(0, -super.field5569 << 2, 0);
                    }
                    if (~super.field5588 != -1) {
                        var16.method1898(super.field5588 * 2048);
                    }
                    if (var14) {
                        if (~super.field5560 != -1) {
                            var16.method1933(super.field5560);
                        }
                        if (super.field5581 != 0) {
                            var16.method1904(super.field5581);
                        }
                        if (~super.field5552 != -1) {
                            var16.method1932(0, super.field5552, 0);
                        }
                    }
                }
            } else {
                super.field5640[1] = null;
            }
            if (~super.field5631 != 0 && super.field5546 != -1) {
                class580 var17 = class120.field2028.method3725(super.field5631, (byte) 85);
                boolean var18 = var17.field7703 == 3 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (super.field5582 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field5579 != 0) {
                        var19 |= 2;
                    }
                }
                class358 var20 = super.field5640[3] = var17.method3182(class636.field8570, super.field5546, arg2, super.field5620, 123, super.field5616, var19);
                if (var20 != null) {
                    if (super.field5579 != 0) {
                        var20.method1932(0, -super.field5579 << 2, 0);
                    }
                    if (super.field5582 != 0) {
                        var20.method1898(super.field5582 * 2048);
                    }
                    if (var18) {
                        if (super.field5560 != 0) {
                            var20.method1933(super.field5560);
                        }
                        if (super.field5581 != 0) {
                            var20.method1904(super.field5581);
                        }
                        if (~super.field5552 != -1) {
                            var20.method1932(0, super.field5552, 0);
                        }
                    }
                }
            } else {
                super.field5640[3] = null;
            }
            super.field5640[2] = null;
            if (super.field5646 != null) {
                if (class642.field8626 >= super.field5646.field613) {
                    super.field5646 = null;
                } else if (class642.field8626 >= super.field5646.field619) {
                    class358 var21 = super.field5646.method307(arg2, 7 | var4, 0);
                    if (var21 != null) {
                        var21.method1932(-super.field8620 + super.field5646.field608, super.field5646.field604 + 5 - super.field8616, super.field5646.field611 - super.field8612);
                        if (var12 != 0) {
                            var21.method1898(var12);
                        }
                        super.field5640[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIJB)V")
    public static final void method1775(int arg0, int arg1, long arg2, byte arg3) {
        ++field4039;
        int var5 = 31 & (int) arg2 >> 14;
        int var6 = (int) arg2 >> 20 & 3;
        int var7 = -24 % ((-37 - arg3) / 49);
        int var8 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && ~var5 != -12 && var5 != 22) {
            class157.method1098(0, true, 0, 0, arg1, (byte) 105, arg0, var6, var5);
        } else {
            class58 var9 = class470.field6288.method1258(var8, (byte) -73);
            int var10;
            int var11;
            if (var6 != 0 && ~var6 != -3) {
                var10 = var9.field885;
                var11 = var9.field838;
            } else {
                var11 = var9.field885;
                var10 = var9.field838;
            }
            int var12 = var9.field848;
            if (var6 != 0) {
                var12 = (var12 << var6 & 15) - -(var12 >> -var6 + 4);
            }
            class157.method1098(var10, true, var12, var11, arg1, (byte) 105, arg0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)Z")
    public final boolean method139(int arg0) {
        if (arg0 != 2) {
            this.method142((byte) -125);
        }
        ++field4046;
        return false;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III)V")
    public final void method1776(int arg0, int arg1, int arg2) {
        ++field4051;
        int var4 = super.field5643[0];
        int var5 = super.field5649[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (~arg1 == -4) {
            --var5;
            ++var4;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (arg1 == 5) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (super.field5575 != -1 && ~class636.field8570.method231(super.field5575, -11764).field8154 == -2) {
            super.field5576 = null;
            super.field5575 = -1;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (super.field5602 != -1) {
            class580 var6 = class120.field2028.method3725(super.field5602, (byte) 73);
            if (var6.field7701 && var6.field7723 != -1 && class636.field8570.method231(var6.field7723, arg0 ^ 11763).field8154 == 1) {
                super.field5602 = -1;
            }
        }
        if (super.field5631 != arg0) {
            class580 var7 = class120.field2028.method3725(super.field5631, (byte) 34);
            if (var7.field7701 && ~var7.field7723 != 0 && class636.field8570.method231(var7.field7723, -11764).field8154 == 1) {
                super.field5631 = -1;
            }
        }
        if (~super.field5642 > -10) {
            ++super.field5642;
        }
        for (int var8 = super.field5642; ~var8 < -1; --var8) {
            super.field5643[var8] = super.field5643[var8 - 1];
            super.field5649[var8] = super.field5649[var8 - 1];
            super.field5650[var8] = super.field5650[var8 + -1];
        }
        super.field5643[0] = var4;
        super.field5650[0] = (byte) arg2;
        super.field5649[0] = var5;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Loa;Z)V")
    public final void method147(class651 arg0, boolean arg1) {
        ++field4054;
        if (this.field4052 != null) {
            if (super.field5645 || this.method1774(0, -1, arg0)) {
                class397 var3 = arg0.method455();
                if (!arg1) {
                    field4063 = null;
                }
                var3.method572(super.field5574.method3585(105));
                var3.method571(super.field8620, super.field8616 + -20, super.field8612);
                this.method2352(var3, (byte) -76, super.field5645, arg0, super.field5640);
                super.field5640[0] = super.field5640[1] = super.field5640[2] = super.field5640[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILoa;)Ldd;")
    public final class660 method143(int arg0, class651 arg1) {
        ++field4057;
        if (arg0 != 31358) {
            this.method149((byte) 18, -33, (class651) null, 59);
        }
        return null;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLci;)V")
    public final void method1777(byte arg0, class419 arg1) {
        this.field4052 = arg1;
        ++field4049;
        if (arg0 < -33) {
            if (super.field5648 != null) {
                super.field5648.method2707();
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "(I)Z")
    public final boolean method1778(int arg0) {
        ++field4037;
        if (arg0 != -21653) {
            return false;
        } else {
            return this.field4052 != null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        ++field4043;
        if (this.field4052 != null && this.method1774(131072, -1, arg2)) {
            class397 var5 = arg2.method455();
            int var6 = super.field5574.method3585(112);
            var5.method572(var6);
            var5.method571(super.field8620, super.field8616, super.field8612);
            boolean var7 = false;
            int var8 = 51 / ((arg0 - -26) / 38);
            for (int var9 = 0; super.field5640.length > var9; ++var9) {
                if (super.field5640[var9] != null) {
                    boolean var10 = this.field4052.field5767 != -1 ? this.field4052.field5767 == 1 : this.field4052.field5738 == 1;
                    boolean var11 = super.field5640[var9].method1931(arg3, arg1, var5, var10);
                    if (var11) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field5640[0] = super.field5640[1] = super.field5640[2] = super.field5640[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLoa;)Lpe;")
    public final class571 method145(byte arg0, class651 arg1) {
        ++field4058;
        if (this.field4052 != null && this.method1774(2048, arg0 + -125, arg1)) {
            if (arg0 != 124) {
                return null;
            } else {
                class397 var3 = arg1.method455();
                int var4 = super.field5574.method3585(125);
                var3.method572(var4);
                var3.method571(super.field8620, super.field8616 + -20, super.field8612);
                class543 var5 = this.method2353(arg0 + -125);
                class419 var6 = this.field4052.field5753 == null ? this.field4052 : this.field4052.method2401(false, class80.field1261);
                if (class344.field4718.field5423 && var6.field5763 && var5.field7183) {
                    class616 var7 = ~super.field5575 != 0 && ~super.field5611 == -1 ? class636.field8570.method231(super.field5575, -11764) : null;
                    class616 var8 = super.field5584 == -1 || super.field5609 && var7 != null ? null : class636.field8570.method231(super.field5584, -11764);
                    int var9 = 0;
                    if (super.field5596 != 0) {
                        var9 = this.method2348((byte) 115);
                    }
                    class358 var10 = class99.method763(var8 != null ? var8 : var7, (byte) 34, var9, this.field4052.field5738, super.field5640[0], 255 & this.field4052.field5766, super.field5552, arg1, var8 != null ? super.field5619 : super.field5623, this.field4052.field5757 & 255, this.field4052.field5779 & 65535, 65535 & this.field4052.field5783, super.field5560, super.field5581, var4);
                    if (var10 != null) {
                        arg1.method407(false);
                        var10.method1947(var3, (class552) null, 0);
                        arg1.method407(true);
                    }
                }
                var3.method572(var4);
                var3.method571(super.field8620, super.field8616 + -5, super.field8612);
                class571 var11 = null;
                if (this.method1769(255)) {
                    var11 = class157.method1100((byte) -128, super.field5640.length);
                }
                this.method2352(var3, (byte) 77, false, arg1, super.field5640);
                if (super.field5648 == null) {
                    arg1.method418(super.field5640, var3, var11 == null ? null : var11.field7581, 0);
                } else {
                    class174 var12 = super.field5648.method2711();
                    arg1.method429(super.field5640, var12, var3, var11 == null ? null : var11.field7581, 0);
                }
                super.field5640[0] = super.field5640[1] = super.field5640[2] = super.field5640[3] = null;
                super.field5637 = class20.field321;
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "(B)[Lff;")
    public static final class9[] method1779(byte arg0) {
        ++field4041;
        if (arg0 > -92) {
            field4038 = null;
        }
        return new class9[] { class197.field2878, class667.field9475, class376.field5066 };
    }

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "(B)I")
    public final int method1780(byte arg0) {
        if (arg0 < 68) {
            this.field4060 = -22;
        }
        ++field4061;
        if (this.field4052.field5753 != null) {
            class419 var2 = this.field4052.method2401(false, class80.field1261);
            if (var2 != null && ~var2.field5736 != 0) {
                return var2.field5736;
            }
        }
        return this.field4052.field5736;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIIII)V")
    public static final void method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= class600.field7959 && ~class366.field4956 <= ~arg1 && ~arg3 <= ~class310.field4279 && arg5 <= class442.field6058) {
            class191.method1249(arg3, arg5, 127, arg1, arg4, arg0);
        } else {
            class555.method3072(0, arg3, arg1, arg5, arg4, arg0);
        }
        ++field4059;
        if (arg2 != 0) {
            method1779((byte) -48);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "(Z)I")
    public final int method729(boolean arg0) {
        if (arg0) {
            return -117;
        } else {
            ++field4050;
            return super.field5562;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILoa;ILni;ZZI)V")
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        ++field4035;
        if (!arg5) {
            field4062 = 118;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(II)V")
    public static final void method1782(int arg0, int arg1) {
        if (arg1 == -13805) {
            ++field4044;
            if (class661.field9394 == null || class661.field9394.length < arg0) {
                class661.field9394 = new int[arg0];
            }
        }
    }
}
