import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class108 extends class265 {

    @OriginalMember(owner = "client!vg", name = "Qb", descriptor = "I")
    public static int field1481 = 0;

    @OriginalMember(owner = "client!vg", name = "Vb", descriptor = "I")
    public static int field1486 = -1;

    @OriginalMember(owner = "client!vg", name = "Xb", descriptor = "F")
    public static float field1488;

    @OriginalMember(owner = "client!vg", name = "Eb", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!vg", name = "Fb", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!vg", name = "Gb", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!vg", name = "Hb", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!vg", name = "Jb", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!vg", name = "Lb", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!vg", name = "Mb", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!vg", name = "Nb", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!vg", name = "Ob", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!vg", name = "Pb", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!vg", name = "Rb", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!vg", name = "Sb", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!vg", name = "Tb", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!vg", name = "Ub", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!vg", name = "Yb", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!vg", name = "Ib", descriptor = "Lom;")
    private class128 field1473;

    @OriginalMember(owner = "client!vg", name = "Wb", descriptor = "Lr;")
    public static class63 field1487;

    @OriginalMember(owner = "client!vg", name = "Kb", descriptor = "[[[Lpm;")
    public static class10[][][] field1475;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)I", line = 3)
    public static final int method751(int arg0, boolean arg1) {
        ++field1471;
        long var2 = class55.method375(-3913);
        for (class28 var4 = arg1 ? (class28) class146.field1923.method953(0) : (class28) class146.field1923.method951(0); var4 != null; var4 = (class28) class146.field1923.method951(0)) {
            if ((4611686018427387903L & var4.field492) < var2) {
                if (~(var4.field492 & 4611686018427387904L) != -1L) {
                    int var5 = (int) var4.field5903;
                    class192.field2668[var5] = class315.field4512[var5];
                    var4.method2574((byte) 123);
                    return var5;
                }
                var4.method2574((byte) 121);
            }
        }
        if (arg0 >= -54) {
            method758((byte) -17);
        }
        return -1;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(IB)I", line = 44)
    public final int method752(int arg0, byte arg1) {
        ++field1485;
        if (arg1 < 100) {
            method753(-77L, -49);
        }
        return arg0 * 8 + -this.field1472;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(JI)V", line = 58)
    public static final void method753(long arg0, int arg1) {
        ++field1478;
        int var3 = class42.field651 + class100.field1350.field5284;
        if (arg1 != 2) {
            field1487 = null;
        }
        int var4 = class207.field2982 + class100.field1350.field5298;
        if (~(-var3 + class64.field902) > 499 || ~(-var3 + class64.field902) < -501 || ~(-var4 + class370.field5511) > 499 || ~(class370.field5511 - var4) < -501) {
            class370.field5511 = var4;
            class64.field902 = var3;
        }
        if (~class64.field902 != ~var3) {
            int var5 = -class64.field902 + var3;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 != 0) {
                if (~var5 < ~var6) {
                    var6 = var5;
                }
            } else {
                var6 = -1;
            }
            class64.field902 += var6;
        }
        if (~class370.field5511 != ~var4) {
            int var7 = -class370.field5511 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (~var7 >= -1) {
                if (~var8 != -1) {
                    if (var8 < var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (~var8 < ~var7) {
                var8 = var7;
            }
            class370.field5511 += var8;
        }
        if (!class329.field4714) {
            class155.field2027 += (float) arg0 * class128.field1700 / 6.0F;
            class170.field2244 += (float) arg0 * class6.field51 / 6.0F;
        }
        class134.method903(-4);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III[B)V", line = 152)
    public final void method754(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 == 8156) {
            ++field1489;
            for (int var5 = 0; ~arg1 < ~var5; ++var5) {
                arg3[var5 - -arg0] = (byte) (super.field3879[super.field3915++] + -this.field1473.method873((byte) 119));
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "(I)V", line = 169)
    public final void method755(int arg0) {
        if (arg0 == 320) {
            super.field3915 = (this.field1472 + 7) / 8;
            ++field1477;
        }
    }

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "(II)V", line = 185)
    public final void method756(int arg0, int arg1) {
        if (arg0 == 0) {
            super.field3879[super.field3915++] = (byte) (arg1 + this.field1473.method873((byte) 81));
            ++field1480;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([II)V", line = 196)
    public final void method757(int[] arg0, int arg1) {
        if (arg1 != 3) {
            this.method761(-63);
        }
        this.field1473 = new class128(arg0);
        ++field1479;
    }

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "(B)V", line = 213)
    public static final void method758(byte arg0) {
        if (arg0 == -112) {
            class439.field6430 = 0;
            ++field1469;
            class122.field1630 = 0;
            class91.method569(2);
            class35.method286((byte) 101);
            class103.method697((byte) 120);
            for (int var1 = 0; ~var1 > ~class122.field1630; ++var1) {
                int var3 = class188.field2557[var1];
                if (~class50.field698 != ~class23.field408[var3].field260) {
                    if (class23.field408[var3].field1714.method2463(arg0 + 112)) {
                        class188.method1170(true, class23.field408[var3]);
                    }
                    class23.field408[var3].method877(-126, (class373) null);
                    class23.field408[var3] = null;
                }
            }
            if (~class413.field6176 != ~class114.field1556.field3915) {
                throw new RuntimeException("gnp1 pos:" + class114.field1556.field3915 + " psize:" + class413.field6176);
            } else {
                for (int var2 = 0; ~class191.field2662 < ~var2; ++var2) {
                    if (class23.field408[class416.field6202[var2]] == null) {
                        throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class191.field2662);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIZLro;)V", line = 268)
    public static final void method759(int arg0, int arg1, int arg2, boolean arg3, class249 arg4) {
        ++field1483;
        int var5 = arg4.field3578;
        if (arg4.field3523 == 0) {
            arg4.field3578 = arg4.field3607;
        } else if (~arg4.field3523 != -2) {
            if (arg4.field3523 != 2) {
                if (~arg4.field3523 == -4) {
                    if (arg4.field3637 == 2) {
                        arg4.field3578 = arg4.field3607 * 32 - -((arg4.field3607 + -1) * arg4.field3499);
                    } else if (~arg4.field3637 == -8) {
                        arg4.field3578 = (arg4.field3607 - 1) * arg4.field3499 + arg4.field3607 * 115;
                    }
                }
            } else {
                arg4.field3578 = arg4.field3607 * arg2 >> 14;
            }
        } else {
            arg4.field3578 = -arg4.field3607 + arg2;
        }
        if (arg0 != 255) {
            field1481 = -96;
        }
        int var6 = arg4.field3604;
        if (~arg4.field3508 != -1) {
            if (arg4.field3508 == 1) {
                arg4.field3604 = -arg4.field3489 + arg1;
            } else if (arg4.field3508 != 2) {
                if (arg4.field3508 == 3) {
                    if (~arg4.field3637 == -3) {
                        arg4.field3604 = arg4.field3489 * 32 - -((arg4.field3489 + -1) * arg4.field3581);
                    } else if (~arg4.field3637 == -8) {
                        arg4.field3604 = (arg4.field3489 + -1) * arg4.field3581 + arg4.field3489 * 12;
                    }
                }
            } else {
                arg4.field3604 = arg4.field3489 * arg1 >> 14;
            }
        } else {
            arg4.field3604 = arg4.field3489;
        }
        if (~arg4.field3523 == -5) {
            arg4.field3578 = arg4.field3605 * arg4.field3604 / arg4.field3561;
        }
        if (~arg4.field3508 == -5) {
            arg4.field3604 = arg4.field3578 * arg4.field3561 / arg4.field3605;
        }
        if (class381.field5720 && (client.method1572(arg4).field2514 != 0 || ~arg4.field3637 == -1)) {
            if (arg4.field3604 < 5 && arg4.field3578 < 5) {
                arg4.field3604 = 5;
                arg4.field3578 = 5;
            } else {
                if (arg4.field3578 <= 0) {
                    arg4.field3578 = 5;
                }
                if (arg4.field3604 <= 0) {
                    arg4.field3604 = 5;
                }
            }
        }
        if (~arg4.field3608 == -1338) {
            class144.field1896 = arg4;
        }
        if (arg3 && arg4.field3529 != null) {
            if (arg4.field3578 != var5 || ~arg4.field3604 != ~var6) {
                class228 var7 = new class228();
                var7.field3215 = arg4.field3529;
                var7.field3210 = arg4;
                class130.field1743.method2660((byte) -122, var7);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "(I)I", line = 371)
    public final int method760(int arg0) {
        if (arg0 != 5663) {
            field1481 = 119;
        }
        ++field1484;
        return super.field3879[super.field3915++] - this.field1473.method873((byte) -107) & 255;
    }

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "(I)V", line = 382)
    public final void method761(int arg0) {
        this.field1472 = super.field3915 * 8;
        ++field1470;
        if (arg0 != 115) {
            method759(-123, 59, -65, true, (class249) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lro;I)V", line = 396)
    public static final void method762(class249 arg0, int arg1) {
        ++field1474;
        class249 var2 = class177.method1078(arg0, (byte) 123);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class274.field4034;
            var4 = class345.field5120;
        } else {
            var4 = var2.field3578;
            var3 = var2.field3604;
        }
        method759(255, var3, var4, false, arg0);
        if (arg1 == 0) {
            class321.method1989(var4, true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IZ)I", line = 423)
    public final int method763(int arg0, boolean arg1) {
        ++field1482;
        int var3 = this.field1472 >> 3;
        if (arg1) {
            field1486 = 36;
        }
        int var4 = -(7 & this.field1472) + 8;
        this.field1472 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (class220.field3117[var4] & super.field3879[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (super.field3879[var3] & class220.field3117[var4]) + var5;
        } else {
            var6 = (super.field3879[var3] >> -arg0 + var4 & class220.field3117[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 454)
    public class108(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "(I)V", line = 457)
    public static void method764(int arg0) {
        if (arg0 != 32452) {
            field1481 = -89;
        }
        field1487 = null;
        field1475 = null;
    }
}
