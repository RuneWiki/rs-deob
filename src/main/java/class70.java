import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class70 extends class51 {

    @OriginalMember(owner = "client!hg", name = "gb", descriptor = "I")
    private int field1738 = 10;

    @OriginalMember(owner = "client!hg", name = "hb", descriptor = "I")
    private int field1739 = 0;

    @OriginalMember(owner = "client!hg", name = "sb", descriptor = "I")
    private int field1750 = 2048;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "Lea;")
    public static class38 field1731 = class9.method46((byte) 103, "");

    @OriginalMember(owner = "client!hg", name = "fb", descriptor = "I")
    public static int field1737 = 0;

    @OriginalMember(owner = "client!hg", name = "kb", descriptor = "Lea;")
    public static class38 field1742 = field1731;

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "[S")
    public static short[] field1734 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!hg", name = "jb", descriptor = "Lea;")
    private static class38 field1741 = class9.method46((byte) 123, " seconds)3");

    @OriginalMember(owner = "client!hg", name = "lb", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!hg", name = "nb", descriptor = "Lea;")
    public static class38 field1745 = class9.method46((byte) 117, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!hg", name = "rb", descriptor = "I")
    public static int field1749 = -1;

    @OriginalMember(owner = "client!hg", name = "ub", descriptor = "Lea;")
    public static class38 field1752 = field1741;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!hg", name = "db", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!hg", name = "eb", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!hg", name = "ob", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!hg", name = "qb", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!hg", name = "tb", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!hg", name = "vb", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!hg", name = "ib", descriptor = "[I")
    private int[] field1740;

    @OriginalMember(owner = "client!hg", name = "mb", descriptor = "[I")
    private int[] field1744;

    @OriginalMember(owner = "client!hg", name = "pb", descriptor = "[I")
    public static int[] field1747;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class70() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    private final void method552(byte arg0) {
        this.field1744 = new int[this.field1738 + 1];
        ++field1753;
        this.field1740 = new int[this.field1738 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1738;
        int var4 = this.field1750 * var3 >> 12;
        for (int var5 = 0; ~this.field1738 < ~var5; ++var5) {
            this.field1740[var5] = var2;
            this.field1744[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1740[this.field1738] = 4096;
        this.field1744[this.field1738] = this.field1744[0] + 4096;
        if (arg0 != 83) {
            this.method552((byte) 35);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field1746;
        if (!arg2) {
            this.method55(-37, -64);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1739 = arg0.method509(121);
                }
            } else {
                this.field1750 = arg0.method511(-119);
            }
        } else {
            this.field1738 = arg0.method509(123);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)Llh;")
    public static final class106 method553(int arg0, int arg1) {
        class106 var2 = (class106) class202.field3980.method1078((byte) 125, (long) arg0);
        ++field1748;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class198.field3924.method215(arg0, 6, arg1 ^ 28066);
            class106 var4 = new class106();
            var4.field2408 = arg0;
            if (var3 != null) {
                var4.method866(new class66(var3), (byte) 46);
            }
            var4.method860(arg1 + -27947);
            if (arg1 != 28067) {
                field1752 = null;
            }
            if (var4.field2406) {
                var4.field2362 = false;
                var4.field2402 = 0;
            }
            class202.field3980.method1076((long) arg0, -4, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLdd;BLm;Ldd;)V")
    public static final void method554(boolean arg0, class32 arg1, byte arg2, class107 arg3, class32 arg4) {
        class130.field2783 = arg4;
        if (arg2 <= 51) {
            field1749 = 58;
        }
        class83.field1972 = arg0;
        ++field1732;
        class90.field2057 = arg1;
        class95.field2142 = class90.field2057.method213(10000, 10);
        class103.field2305 = arg3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field1751;
        if (arg0 > -125) {
            field1752 = null;
        }
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int var4 = class170.field3490[arg1];
            if (~this.field1739 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1738; ++var6) {
                    if (~var4 <= ~this.field1740[var6] && ~this.field1740[var6 + 1] < ~var4) {
                        if (this.field1744[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class131.method963(var3, 0, class86.field2008, var5);
            } else {
                for (int var7 = 0; ~class86.field2008 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class196.field3854[var7];
                    int var11 = this.field1739;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (-4096 - -var4 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field1738; ++var12) {
                        if (~var8 <= ~this.field1740[var12] && ~var8 > ~this.field1740[var12 + 1]) {
                            if (~this.field1744[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V")
    public static void method555(int arg0) {
        field1741 = null;
        if (arg0 < 107) {
            field1745 = null;
        }
        field1745 = null;
        field1752 = null;
        field1731 = null;
        field1747 = null;
        field1742 = null;
        field1734 = null;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        ++field1735;
        this.method552((byte) 83);
        if (arg0 != -2) {
            method554(true, (class32) null, (byte) -126, (class107) null, (class32) null);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(JZ)V")
    public static final void method556(long arg0, boolean arg1) {
        ++field1736;
        if (~arg0 != -1L) {
            if ((class22.field468 < 100 || ~class74.field1793 == -2) && ~class22.field468 > -201) {
                class38 var3 = class143.method1034(37, arg0).method268(70);
                for (int var4 = 0; ~class22.field468 < ~var4; ++var4) {
                    if (~class166.field3430[var4] == ~arg0) {
                        class102.method839(field1731, 0, class163.method1168(120, new class38[] { var3, class83.field1956 }), (byte) -18);
                        return;
                    }
                }
                for (int var5 = 0; class43.field951 > var5; ++var5) {
                    if (~class186.field3704[var5] == ~arg0) {
                        class102.method839(field1731, 0, class163.method1168(108, new class38[] { class178.field3610, var3, class106.field2366 }), (byte) -127);
                        return;
                    }
                }
                if (arg1) {
                    field1749 = -105;
                }
                if (var3.method252(-83, class195.field3842.field3022)) {
                    class102.method839(field1731, 0, class9.field200, (byte) -104);
                } else {
                    ++class83.field1969;
                    class161.field3357[class22.field468] = var3;
                    class166.field3430[class22.field468] = arg0;
                    class22.field471[class22.field468] = 0;
                    class178.field3600[class22.field468] = 0;
                    ++class22.field468;
                    class181.field3653 = class192.field3796;
                    class111.field2483.method169(-1494101117, 131);
                    class111.field2483.method480(arg0, (byte) -86);
                }
            } else {
                class102.method839(field1731, 0, class31.field621, (byte) 124);
            }
        }
    }
}
