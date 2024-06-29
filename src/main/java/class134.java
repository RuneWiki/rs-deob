import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class134 {

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
    private int field1772 = -1;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    private int field1771 = -1;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Z")
    private boolean field1749 = false;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Z")
    private boolean field1765 = false;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    private int field1762 = -32768;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "B")
    private byte field1776;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    private int field1767;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "B")
    private byte field1750;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Z")
    private boolean field1756;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    private int field1752;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    private int field1757;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    private int field1759;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    private int field1768;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!nt", name = "H", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!nt", name = "I", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "Lok;")
    private class153 field1764;

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "Ltm;")
    private class242 field1779;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "Lf;")
    private class491 field1766;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "Lwh;")
    public static class90 field1753;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "Lg;")
    public class97 field1774;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "[Ltr;")
    public static class176[] field1751;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "[Z")
    private boolean[] field1754;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)V")
    public final void method842(int arg0, byte arg1) {
        this.field1765 = true;
        if (arg1 == 51) {
            field1781++;
            this.method849(arg1 ^ 0x73B3, arg0);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)Z")
    public final boolean method843(byte arg0) {
        if (arg0 < 48) {
            this.method843((byte) 38);
        }
        field1780++;
        return this.field1756;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIB)V")
    private final void method844(int arg0, int arg1, byte arg2) {
        field1760++;
        if (arg2 != 81) {
            return;
        }
        label90: while (true) {
            if (this.field1764 == null) {
                if (this.field1765) {
                    return;
                }
                this.method849(29568, -1);
                if (this.field1764 == null) {
                    return;
                }
            }
            int var4 = class353.field5090 - this.field1768;
            if (var4 > 100 && this.field1764.field2255 > 0) {
                int var5 = this.field1764.field2254.length - this.field1764.field2255;
                while (this.field1759 < var5 && this.field1764.field2275[this.field1759] < var4) {
                    var4 -= this.field1764.field2275[this.field1759];
                    this.field1759++;
                }
                if (var5 <= this.field1759) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1764.field2254.length; var7++) {
                        var6 += this.field1764.field2275[var7];
                    }
                    var4 %= var6;
                }
                this.field1752 = this.field1759 + 1;
                if (this.field1764.field2254.length <= this.field1752) {
                    this.field1752 -= this.field1764.field2255;
                    if (this.field1752 < 0 || this.field1764.field2254.length <= this.field1752) {
                        this.field1752 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field1764.field2275[this.field1759]) {
                            this.field1768 = class353.field5090 - var4;
                            this.field1757 = var4;
                            return;
                        }
                        class237.method1508(this.field1750, (byte) 40, arg1, this.field1759, this.field1764, arg0, false);
                        var4 -= this.field1764.field2275[this.field1759];
                        this.field1759++;
                        if (this.field1764.field2254.length <= this.field1759) {
                            this.field1759 -= this.field1764.field2255;
                            if (this.field1759 < 0 || this.field1764.field2254.length <= this.field1759) {
                                this.field1764 = null;
                                continue label90;
                            }
                        }
                        this.field1752 = this.field1759 + 1;
                    } while (this.field1752 < this.field1764.field2254.length);
                    this.field1752 -= this.field1764.field2255;
                } while (this.field1752 >= 0 && this.field1764.field2254.length > this.field1752);
                this.field1752 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIILnp;IILf;I)V")
    public final void method845(boolean arg0, int arg1, int arg2, class313 arg3, int arg4, int arg5, class491 arg6, int arg7) {
        field1769++;
        class295[] var9 = arg6.method1300();
        class168[] var10 = arg6.method1286();
        if ((this.field1774 == null || this.field1774.field1244) && (var9 != null || var10 != null)) {
            class453 var11 = class156.field2325.method808(this.field1770, 0);
            if (var11.field6306 != null) {
                var11 = var11.method2655(97, class140.field1859);
            }
            if (var11 != null) {
                this.field1774 = new class97(class353.field5090);
            }
        }
        if (arg5 != -125) {
            this.method845(true, 69, -4, (class313) null, 116, 19, (class491) null, -125);
        }
        if (this.field1774 == null) {
            return;
        }
        if (arg0) {
            this.field1774.method558(arg3, (long) class353.field5090, var9, var10, false);
        } else {
            this.field1774.method560((long) class353.field5090);
        }
        this.field1774.method548(this.field1750, arg4, arg1, arg7, arg2);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lnp;I)V")
    public final void method846(class313 arg0, int arg1) {
        field1775++;
        if (arg1 < -62) {
            this.method848(this.field1758, true, arg0, 10, true, this.field1767, 131072);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLnp;)V")
    public final void method847(byte arg0, class313 arg1) {
        if (arg0 >= -2) {
            this.field1776 = 126;
        }
        if (this.field1779 != null) {
            class94.method531(this.field1779, this.field1776, this.field1758, this.field1767, this.field1754);
            this.field1779 = null;
            this.field1754 = null;
        }
        field1747++;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZLnp;IZII)Lf;")
    public final class491 method848(int arg0, boolean arg1, class313 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1777++;
        class453 var8 = class156.field2325.method808(this.field1770, arg3 - 10);
        if (var8.field6306 != null) {
            var8 = var8.method2655(66, class140.field1859);
        }
        if (var8 == null) {
            this.method847((byte) -16, arg2);
            this.field1771 = -1;
            this.field1772 = this.field1759;
            return null;
        }
        if (!this.field1765 && this.field1771 != var8.field6343) {
            this.field1766 = null;
            this.method849(29568, -1);
        }
        this.method844(arg5, arg0, (byte) 81);
        boolean var9 = arg4 & this.field1756 & class314.field4438.field5776 != 0;
        boolean var10 = var9 & (this.field1771 != var8.field6343 || (this.field1772 != this.field1759 || this.field1764 != null && (this.field1764.field2277 || class70.field884) && this.field1759 != this.field1752) && class314.field4438.field5776 >= 2);
        if (arg1 && !var10) {
            this.field1772 = this.field1759;
            this.field1771 = var8.field6343;
            return null;
        }
        if (var10) {
            class94.method531(this.field1779, this.field1776, this.field1758, this.field1767, this.field1754);
        }
        class426 var11 = class53.field725[this.field1776];
        class426 var12;
        if (this.field1749) {
            var12 = class178.field2556[0];
        } else {
            var12 = this.field1776 >= 3 ? null : class53.field725[this.field1776 + 1];
        }
        class491 var13 = null;
        if (arg3 != 10) {
            this.field1762 = -117;
        }
        if (this.field1764 != null) {
            if (var10) {
                arg6 |= 0x20000;
            }
            var13 = var8.method2652(var12, this.field1758, this.field1759, this.field1764, var11.method1209(this.field1758, this.field1767), this.field1763 == 11 ? 10 : this.field1763, this.field1757, this.field1752, this.field1767, this.field1763 == 11 ? this.field1755 + 4 : this.field1755, var11, arg2, 117, arg6);
            if (var13 == null) {
                this.field1754 = null;
                this.field1762 = 0;
                this.field1779 = null;
            } else {
                if (var10) {
                    if (this.field1754 == null) {
                        this.field1754 = new boolean[4];
                    }
                    this.field1779 = var13.method1298(this.field1779);
                    class333.method2103(this.field1779, this.field1776, arg0, arg5, this.field1754);
                }
                this.field1762 = var13.method1289();
            }
            this.field1766 = null;
        } else if (this.field1766 != null && (arg6 & this.field1766.method1319()) == arg6 && this.field1771 == var8.field6343) {
            var13 = this.field1766;
        } else {
            if (this.field1766 != null) {
                arg6 |= this.field1766.method1319();
            }
            class284 var14 = var8.method2667(this.field1767, arg6, -4, var10, var11.method1209(this.field1758, this.field1767), this.field1763 == 11 ? this.field1755 + 4 : this.field1755, arg2, this.field1758, var12, var11, this.field1763 == 11 ? 10 : this.field1763);
            if (var14 == null) {
                this.field1779 = null;
                this.field1766 = null;
                this.field1762 = 0;
                this.field1754 = null;
            } else {
                var13 = var14.field4158;
                this.field1766 = var14.field4158;
                if (var10) {
                    this.field1779 = var14.field4154;
                    this.field1754 = null;
                    class333.method2103(this.field1779, this.field1776, arg0, arg5, (boolean[]) null);
                }
                this.field1762 = var13.method1289();
            }
        }
        this.field1767 = arg5;
        this.field1758 = arg0;
        this.field1772 = this.field1759;
        this.field1771 = var8.field6343;
        return var13;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)V")
    private final void method849(int arg0, int arg1) {
        field1761++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class453 var5 = class156.field2325.method808(this.field1770, 0);
            class453 var6 = var5;
            if (var5.field6306 != null) {
                var5 = var5.method2655(arg0 - 29473, class140.field1859);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field6351 != null) {
                if (this.field1764 != null && var5.method2654(this.field1764.field2284, arg0 - 29659)) {
                    return;
                }
                var3 = var5.method2650((byte) -69);
                if (this.field1771 != var5.field6343) {
                    var4 = var5.field6328;
                }
            } else if (var5.field6332 == -1) {
                if (var6 != null && var6.field6351 != null) {
                    if (this.field1764 != null && var6.method2654(this.field1764.field2284, -125)) {
                        return;
                    }
                    var3 = var6.method2650((byte) -69);
                    if (this.field1771 != var6.field6343) {
                        var4 = var6.field6328;
                    }
                } else if (var6 != null && var6.field6332 != -1 && this.field1771 != var6.field6343) {
                    var4 = var6.field6328;
                    var3 = var6.field6332;
                }
            } else if (this.field1771 != var5.field6343) {
                var3 = var5.field6332;
                var4 = var5.field6328;
            }
        }
        if (var3 == -1) {
            this.field1764 = null;
            return;
        }
        this.field1766 = null;
        if (this.field1764 == null || this.field1764.field2284 != var3) {
            this.field1764 = class64.field836.method2081(var3, 0);
        } else if (this.field1764.field2260 == 0) {
            return;
        }
        if (this.field1764.field2254 == null) {
            this.field1764 = null;
            return;
        }
        if (var4) {
            this.field1759 = (int) (Math.random() * (double) this.field1764.field2254.length);
            this.field1757 = (int) (Math.random() * (double) this.field1764.field2275[this.field1759]) + 1;
        } else {
            this.field1759 = 0;
            this.field1757 = 1;
        }
        this.field1752 = this.field1759 + 1;
        if (this.field1752 < 0 || this.field1764.field2254.length <= this.field1752) {
            this.field1752 = -1;
        }
        if (arg0 != 29568) {
            this.field1772 = 67;
        }
        this.field1768 = class353.field5090 - this.field1757;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)I")
    public final int method850(byte arg0) {
        field1773++;
        if (arg0 < 18) {
            field1778 = -65;
        }
        return this.field1762;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method851(int arg0) {
        field1753 = null;
        field1751 = null;
        if (arg0 != -1) {
            field1753 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lnp;Ldq;IIIIIIZI)V")
    public class134(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1763 = arg2;
        this.field1776 = (byte) arg5;
        this.field1767 = arg7;
        this.field1750 = (byte) arg4;
        this.field1755 = arg3;
        this.field1749 = arg8;
        this.field1758 = arg6;
        this.field1770 = arg1.field6343;
        this.field1756 = arg0.method639() && arg1.field6380 && !this.field1749;
        if (arg9 != -1) {
            this.field1765 = true;
        }
        this.method849(29568, arg9);
    }

    @OriginalMember(owner = "client!nt", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1748++;
        if (this.field1774 != null) {
            this.field1774.method554();
        }
    }
}
