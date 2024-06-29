import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 extends class92 {

    @OriginalMember(owner = "client!md", name = "qb", descriptor = "Z")
    private boolean field1686 = false;

    @OriginalMember(owner = "client!md", name = "Ab", descriptor = "I")
    private int field1696 = -1;

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "Z")
    private volatile boolean field1679 = false;

    @OriginalMember(owner = "client!md", name = "zb", descriptor = "Ljc;")
    private class57 field1695;

    @OriginalMember(owner = "client!md", name = "Gb", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "client!md", name = "ob", descriptor = "Ljc;")
    private class57 field1684;

    @OriginalMember(owner = "client!md", name = "kb", descriptor = "Lrc;")
    private static class105 field1680 = class43.method374("Offline", 0);

    @OriginalMember(owner = "client!md", name = "wb", descriptor = "I")
    public static int field1692 = -1;

    @OriginalMember(owner = "client!md", name = "Bb", descriptor = "Lrc;")
    public static class105 field1697 = class43.method374("mapback", 0);

    @OriginalMember(owner = "client!md", name = "Ib", descriptor = "I")
    public static int field1704 = 1;

    @OriginalMember(owner = "client!md", name = "Fb", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!md", name = "Nb", descriptor = "Lrc;")
    public static class105 field1709 = class43.method374("(X", 0);

    @OriginalMember(owner = "client!md", name = "Lb", descriptor = "Lrc;")
    public static class105 field1707 = field1680;

    @OriginalMember(owner = "client!md", name = "Kb", descriptor = "Lgb;")
    public static class39 field1706 = new class39();

    @OriginalMember(owner = "client!md", name = "Ob", descriptor = "Lrc;")
    public static class105 field1710 = class43.method374("::hiddenbuttontest", 0);

    @OriginalMember(owner = "client!md", name = "Qb", descriptor = "Lrc;")
    public static class105 field1712 = class43.method374("k", 0);

    @OriginalMember(owner = "client!md", name = "lb", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!md", name = "nb", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!md", name = "pb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!md", name = "rb", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!md", name = "sb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!md", name = "tb", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!md", name = "ub", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!md", name = "vb", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!md", name = "xb", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!md", name = "yb", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!md", name = "Cb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!md", name = "Db", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!md", name = "Eb", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!md", name = "Jb", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!md", name = "Mb", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!md", name = "Hb", descriptor = "J")
    public static long field1703;

    @OriginalMember(owner = "client!md", name = "Pb", descriptor = "[I")
    public static int[] field1711;

    @OriginalMember(owner = "client!md", name = "mb", descriptor = "[Z")
    private volatile boolean[] field1682;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)I", line = 7)
    public final int method639(int arg0) {
        ++field1683;
        int var2 = 0;
        int var3 = arg0;
        for (int var4 = 0; var4 < super.field2108.length; ++var4) {
            if (~super.field2147[var4] < -1) {
                var2 += 100;
                var3 += this.method648(11638, var4);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V", line = 57)
    public final void method640(int arg0, int arg1) {
        ++field1699;
        if (this.field1695 != null && this.field1682 != null && this.field1682[arg1]) {
            client.method213(arg1, this.field1695, this, -126);
        } else {
            class89.method740(true, this, (byte) 2, arg1, super.field2105[arg1], false, this.field1702);
        }
        if (arg0 > -16) {
            method643(-92, 53, (class92) null);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V", line = 73)
    public final void method641(int arg0, byte arg1) {
        ++field1687;
        this.field1693 = arg0;
        if (this.field1684 == null) {
            class89.method740(true, this, (byte) 0, this.field1702, this.field1693, false, 255);
        } else {
            client.method213(this.field1702, this.field1684, this, -83);
        }
        int var3 = 62 / ((arg1 - 1) / 47);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 89)
    public static final void method642(byte arg0) {
        ++field1700;
        if (class81.field1825 != null) {
            class81.field1825.method114();
            class81.field1825 = null;
        }
        if (arg0 != 99) {
            method652(89, 2, (class15) null, 106);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILpb;)Z", line = 116)
    public static final boolean method643(int arg0, int arg1, class92 arg2) {
        byte[] var3 = arg2.method767((byte) 115, arg0);
        ++field1708;
        if (var3 == null) {
            return false;
        } else {
            if (arg1 != 31645) {
                method644((byte) -31);
            }
            class78.method676((byte) -116, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Ljc;Ljc;IZZZ)V", line = 279)
    public class76(class57 arg0, class57 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1695 = arg0;
        this.field1702 = arg2;
        this.field1684 = arg1;
        this.field1686 = arg5;
        class59.method478((byte) -112, this.field1702, this);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V", line = 144)
    public static void method644(byte arg0) {
        field1710 = null;
        field1706 = null;
        field1680 = null;
        field1712 = null;
        field1697 = null;
        if (arg0 > 109) {
            field1711 = null;
            field1709 = null;
            field1707 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)I", line = 162)
    public final int method645(boolean arg0) {
        ++field1705;
        if (this.field1679) {
            return 100;
        } else {
            if (!arg0) {
                method642((byte) -93);
            }
            if (super.field2108 != null) {
                return 99;
            } else {
                int var2 = class130.method1043(30468, 255, this.field1702);
                if (~var2 <= -101) {
                    var2 = 99;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BZI[BZ)V", line = 189)
    public final void method646(byte arg0, boolean arg1, int arg2, byte[] arg3, boolean arg4) {
        ++field1685;
        if (arg0 == -88) {
            if (!arg4) {
                arg3[arg3.length + -2] = (byte) (super.field2118[arg2] >> 8);
                arg3[arg3.length + -1] = (byte) super.field2118[arg2];
                if (this.field1695 != null) {
                    class10.method132(arg3, true, arg2, this.field1695);
                    this.field1682[arg2] = true;
                }
                if (arg1) {
                    super.field2108[arg2] = arg3;
                    return;
                }
            } else {
                if (this.field1679) {
                    throw new RuntimeException();
                }
                if (this.field1684 != null) {
                    class10.method132(arg3, true, this.field1702, this.field1684);
                }
                this.method768((byte) 74, arg3);
                this.method651((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)V", line = 232)
    public static final void method647(long arg0, int arg1) {
        ++field1688;
        if (~arg0 != -1L) {
            if (arg1 >= -106) {
                field1703 = -72L;
            }
            for (int var3 = 0; ~class81.field1817 < ~var3; ++var3) {
                if (~class12.field238[var3] == ~arg0) {
                    --class81.field1817;
                    ++class122.field3016;
                    class80.field1805 = true;
                    for (int var4 = var3; var4 < class81.field1817; ++var4) {
                        class86.field1938[var4] = class86.field1938[var4 + 1];
                        class122.field2994[var4] = class122.field2994[var4 + 1];
                        class12.field238[var4] = class12.field238[var4 + 1];
                    }
                    class66.field1472.method781(67, (byte) -69);
                    class66.field1472.method64(arg0, -34);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(II)I", line = 291)
    private final int method648(int arg0, int arg1) {
        if (arg0 != 11638) {
            field1698 = 37;
        }
        ++field1689;
        if (super.field2108[arg1] != null) {
            return 100;
        } else {
            return this.field1682[arg1] ? 100 : class130.method1043(30468, this.field1702, arg1);
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(II)V", line = 308)
    public final void method649(int arg0, int arg1) {
        ++field1694;
        class65.method556(arg1, arg0 ^ -353020624, this.field1702);
        if (arg0 != 0) {
            method647(117L, 102);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjc;ZI[B)V", line = 322)
    public final void method650(int arg0, class57 arg1, boolean arg2, int arg3, byte[] arg4) {
        ++field1691;
        if (this.field1684 == arg1) {
            if (this.field1679) {
                throw new RuntimeException();
            }
            if (arg4 == null) {
                class89.method740(true, this, (byte) 0, this.field1702, this.field1693, false, 255);
                return;
            }
            class22.field521.reset();
            class22.field521.update(arg4, 0, arg4.length);
            int var6 = (int) class22.field521.getValue();
            if (~this.field1693 != ~var6) {
                class89.method740(true, this, (byte) 0, this.field1702, this.field1693, false, 255);
                return;
            }
            this.method768((byte) 84, arg4);
            this.method651((byte) -122);
        } else {
            if (!arg2 && ~this.field1696 == ~arg3) {
                this.field1679 = true;
            }
            if (arg4 == null || arg4.length <= 2) {
                this.field1682[arg3] = false;
                if (this.field1686 || arg2) {
                    class89.method740(arg2, this, (byte) 2, arg3, super.field2105[arg3], false, this.field1702);
                }
                return;
            }
            class22.field521.reset();
            class22.field521.update(arg4, 0, arg4.length - 2);
            int var7 = (int) class22.field521.getValue();
            int var8 = (65280 & arg4[arg4.length - 2] << 8) + (arg4[arg4.length - 1] & 255);
            if (super.field2105[arg3] != var7 || super.field2118[arg3] != var8) {
                this.field1682[arg3] = false;
                if (this.field1686 || arg2) {
                    class89.method740(arg2, this, (byte) 2, arg3, super.field2105[arg3], false, this.field1702);
                }
                return;
            }
            this.field1682[arg3] = true;
            if (arg2) {
                super.field2108[arg3] = arg4;
            }
        }
        if (arg0 != 19548) {
            this.method646((byte) 67, true, 22, (byte[]) null, false);
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V", line = 430)
    private final void method651(byte arg0) {
        this.field1682 = new boolean[super.field2108.length];
        for (int var2 = 0; ~this.field1682.length < ~var2; ++var2) {
            this.field1682[var2] = false;
        }
        ++field1690;
        if (this.field1695 == null) {
            this.field1679 = true;
        } else {
            this.field1696 = -1;
            if (arg0 > -118) {
                this.method649(41, 7);
            }
            for (int var3 = 0; this.field1682.length > var3; ++var3) {
                if (super.field2147[var3] > 0) {
                    class113.method925(this.field1695, 62, var3, this);
                    this.field1696 = var3;
                }
            }
            if (~this.field1696 == 0) {
                this.field1679 = true;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILcb;I)V", line = 488)
    public static final void method652(int arg0, int arg1, class15 arg2, int arg3) {
        if (arg1 != -30713) {
            method652(-11, 57, (class15) null, 73);
        }
        ++field1681;
        if (~arg2.field1238 == ~arg0 && ~arg0 != 0) {
            int var4 = class6.method49(arg1 ^ -30624, arg0).field2711;
            if (~var4 == -2) {
                arg2.field1244 = 0;
                arg2.field1230 = arg3;
                arg2.field1262 = 0;
                arg2.field1257 = 0;
            }
            if (var4 == 2) {
                arg2.field1257 = 0;
                return;
            }
        } else if (arg0 == -1 || arg2.field1238 == -1 || class6.method49(103, arg0).field2689 >= class6.method49(103, arg2.field1238).field2689) {
            arg2.field1238 = arg0;
            arg2.field1244 = 0;
            arg2.field1262 = 0;
            arg2.field1270 = arg2.field1266;
            arg2.field1257 = 0;
            arg2.field1230 = arg3;
        }
    }
}
