import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class73 extends class111 {

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "Z")
    private volatile boolean field1782 = false;

    @OriginalMember(owner = "client!mb", name = "Ab", descriptor = "I")
    private int field1793 = -1;

    @OriginalMember(owner = "client!mb", name = "Eb", descriptor = "Z")
    private boolean field1797 = false;

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "Lic;")
    private class50 field1785;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    private int field1766;

    @OriginalMember(owner = "client!mb", name = "Gb", descriptor = "Lic;")
    private class50 field1799;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "J")
    public static long field1767 = 0L;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "Lpd;")
    private static class94 field1769 = class28.method249(79, " ");

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "Lpd;")
    public static class94 field1783 = field1769;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lpd;")
    public static class94 field1774 = class28.method249(31, "blinken3:");

    @OriginalMember(owner = "client!mb", name = "ub", descriptor = "[I")
    public static int[] field1787 = new int[25];

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "Z")
    public static boolean field1781 = false;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "Lpd;")
    public static class94 field1778 = class28.method249(82, "Duell akzeptieren");

    @OriginalMember(owner = "client!mb", name = "Fb", descriptor = "Lpd;")
    public static class94 field1798 = class28.method249(104, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!mb", name = "Jb", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!mb", name = "vb", descriptor = "Lpd;")
    public static class94 field1788 = class28.method249(26, "Benutzen");

    @OriginalMember(owner = "client!mb", name = "Cb", descriptor = "Lpd;")
    private static class94 field1795 = class28.method249(-73, "Friends");

    @OriginalMember(owner = "client!mb", name = "Db", descriptor = "I")
    public static int field1796 = -1;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lpd;")
    public static class94 field1777 = field1795;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    private int field1771;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!mb", name = "wb", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!mb", name = "yb", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!mb", name = "Bb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!mb", name = "Hb", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!mb", name = "Ib", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!mb", name = "Kb", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!mb", name = "xb", descriptor = "Lla;")
    public static class66 field1790;

    @OriginalMember(owner = "client!mb", name = "zb", descriptor = "[Z")
    private volatile boolean[] field1792;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I", line = 7)
    public final int method541(int arg0) {
        ++field1768;
        if (this.field1782) {
            return 100;
        } else if (super.field2775 != null) {
            return 99;
        } else {
            int var2 = class19.method148(255, this.field1766, (byte) 127);
            if (~var2 <= -101) {
                var2 = 99;
            }
            if (arg0 >= 0) {
                field1787 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lic;Lic;IZZZ)V", line = 34)
    public class73(class50 arg0, class50 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1785 = arg0;
        this.field1797 = arg5;
        this.field1766 = arg2;
        this.field1799 = arg1;
        class72.method532(this, this.field1766, (byte) 112);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 48)
    public static final void method542(int arg0) {
        class115.field2898.method1013(-1);
        ++field1772;
        if (arg0 != 255) {
            field1774 = null;
        }
        class107.field2652.method1013(-1);
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(II)I", line = 89)
    private final int method543(int arg0, int arg1) {
        ++field1789;
        if (arg1 != 30993) {
            return 51;
        } else if (super.field2775[arg0] != null) {
            return 100;
        } else {
            return this.field1792[arg0] ? 100 : class19.method148(this.field1766, arg0, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)I", line = 108)
    public final int method544(boolean arg0) {
        ++field1803;
        if (arg0) {
            return 23;
        } else {
            int var2 = 0;
            int var3 = 0;
            for (int var4 = 0; ~super.field2775.length < ~var4; ++var4) {
                if (~super.field2787[var4] < -1) {
                    var2 += 100;
                    var3 += this.method543(var4, 30993);
                }
            }
            if (var2 == 0) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V", line = 173)
    private final void method545(int arg0) {
        this.field1792 = new boolean[super.field2775.length];
        ++field1775;
        for (int var2 = 0; this.field1792.length > var2; ++var2) {
            this.field1792[var2] = false;
        }
        if (this.field1785 == null) {
            this.field1782 = true;
        } else {
            this.field1793 = -1;
            for (int var3 = arg0; ~this.field1792.length < ~var3; ++var3) {
                if (super.field2787[var3] > 0) {
                    class120.method908(var3, this, this.field1785, true);
                    this.field1793 = var3;
                }
            }
            if (this.field1793 == -1) {
                this.field1782 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLic;B[B)V", line = 216)
    public final void method546(int arg0, boolean arg1, class50 arg2, byte arg3, byte[] arg4) {
        if (arg3 != -14) {
            this.method549(-39, 0);
        }
        ++field1779;
        if (this.field1799 == arg2) {
            if (this.field1782) {
                throw new RuntimeException();
            } else if (arg4 == null) {
                class86.method625(this.field1766, (byte) 25, this, 255, this.field1771, (byte) 0, true);
            } else {
                class4.field76.reset();
                class4.field76.update(arg4, 0, arg4.length);
                int var6 = (int) class4.field76.getValue();
                if (~this.field1771 != ~var6) {
                    class86.method625(this.field1766, (byte) 25, this, 255, this.field1771, (byte) 0, true);
                } else {
                    this.method807(arg4, 5);
                    this.method545(0);
                }
            }
        } else {
            if (!arg1 && this.field1793 == arg0) {
                this.field1782 = true;
            }
            if (arg4 != null && arg4.length > 2) {
                class4.field76.reset();
                class4.field76.update(arg4, 0, arg4.length + -2);
                int var7 = (int) class4.field76.getValue();
                int var8 = ((255 & arg4[arg4.length + -2]) << 8) + (255 & arg4[arg4.length + -1]);
                if (super.field2799[arg0] == var7 && ~super.field2771[arg0] == ~var8) {
                    this.field1792[arg0] = true;
                    if (arg1) {
                        super.field2775[arg0] = arg4;
                    }
                } else {
                    this.field1792[arg0] = false;
                    if (this.field1797 || arg1) {
                        class86.method625(arg0, (byte) 25, this, this.field1766, super.field2799[arg0], (byte) 2, arg1);
                    }
                }
            } else {
                this.field1792[arg0] = false;
                if (this.field1797 || arg1) {
                    class86.method625(arg0, (byte) 25, this, this.field1766, super.field2799[arg0], (byte) 2, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V", line = 314)
    public final void method547(int arg0, byte arg1) {
        if (this.field1785 != null && this.field1792 != null && this.field1792[arg0]) {
            class38.method291(0, this.field1785, this, arg0);
        } else {
            class86.method625(arg0, (byte) 25, this, this.field1766, super.field2799[arg0], (byte) 2, true);
        }
        if (arg1 >= -78) {
            this.method549(89, 21);
        }
        ++field1776;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ[BIZ)V", line = 339)
    public final void method548(int arg0, boolean arg1, byte[] arg2, int arg3, boolean arg4) {
        if (arg3 != -3508) {
            this.field1771 = 14;
        }
        ++field1773;
        if (!arg4) {
            arg2[arg2.length + -2] = (byte) (super.field2771[arg0] >> 8);
            arg2[arg2.length - 1] = (byte) super.field2771[arg0];
            if (this.field1785 != null) {
                class75.method562(arg2, this.field1785, arg0, 0);
                this.field1792[arg0] = true;
            }
            if (arg1) {
                super.field2775[arg0] = arg2;
                return;
            }
        } else {
            if (this.field1782) {
                throw new RuntimeException();
            }
            if (this.field1799 != null) {
                class75.method562(arg2, this.field1799, this.field1766, 0);
            }
            this.method807(arg2, 5);
            this.method545(0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(II)V", line = 384)
    public final void method549(int arg0, int arg1) {
        if (arg0 != 9505) {
            field1769 = null;
        }
        ++field1780;
        this.field1771 = arg1;
        if (this.field1799 == null) {
            class86.method625(this.field1766, (byte) 25, this, 255, this.field1771, (byte) 0, true);
        } else {
            class38.method291(0, this.field1799, this, this.field1766);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V", line = 413)
    public final void method550(int arg0, int arg1) {
        ++field1770;
        int var3 = 108 % ((31 - arg0) / 32);
        class64.method479(this.field1766, 5752, arg1);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 432)
    public static void method551(boolean arg0) {
        field1790 = null;
        field1783 = null;
        field1769 = null;
        field1777 = null;
        field1788 = null;
        field1774 = null;
        field1787 = null;
        if (!arg0) {
            field1778 = null;
            field1795 = null;
            field1798 = null;
        }
    }
}
