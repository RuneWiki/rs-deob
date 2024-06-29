import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class129 extends class499 {

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public int field1778 = 0;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Ljm;")
    public static class485 field1764 = new class485(46, 2);

    @OriginalMember(owner = "client!me", name = "H", descriptor = "[I")
    public static int[] field1776 = new int[32];

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lpk;")
    public class132 field1773;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Ltf;")
    public class192 field1781;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lwl;")
    public class280 field1758;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lwl;")
    public class280 field1766;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Luo;")
    public class405 field1777;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "Z")
    public boolean field1772;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "[I")
    public int[] field1761;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
    public final void method844(byte arg0) {
        field1762++;
        int var2 = this.field1767;
        if (this.field1773 != null) {
            class132 var5 = this.field1773.method870(0, class453.field6623);
            if (var5 == null) {
                this.field1767 = -1;
                this.field1761 = null;
                this.field1770 = 0;
                this.field1760 = 0;
                this.field1774 = 0;
                this.field1779 = 0;
            } else {
                this.field1761 = var5.field1824;
                this.field1779 = var5.field1817;
                this.field1760 = var5.field1898;
                this.field1770 = var5.field1862;
                this.field1767 = var5.field1868;
                this.field1774 = var5.field1840 << 7;
            }
        } else if (this.field1777 != null) {
            int var3 = class86.method602(-1, this.field1777);
            if (var2 != var3) {
                this.field1767 = var3;
                class336 var4 = this.field1777.field5623;
                if (var4.field4612 != null) {
                    var4 = var4.method1860(class453.field6623, (byte) -128);
                }
                if (var4 == null) {
                    this.field1779 = this.field1774 = 0;
                } else {
                    this.field1774 = var4.field4595 << 7;
                    this.field1779 = var4.field4574;
                }
            }
        } else if (this.field1781 != null) {
            this.field1767 = class433.method2582(this.field1781, 3);
            this.field1779 = this.field1781.field2698;
            this.field1774 = this.field1781.field2691 << 7;
        }
        if (arg0 == -55 && this.field1767 != var2 && this.field1766 != null) {
            class189.field2623.method942(this.field1766);
            this.field1766 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)I")
    public static final int method845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= -108) {
            return 127;
        }
        field1765++;
        if (class383.field5391 == null) {
            return 0;
        }
        if (arg2 < 3) {
            int var6 = arg4 >> 7;
            int var7 = arg3 >> 7;
            if (arg1 < 0 || arg5 < 0 || arg1 > class442.field6435 - 1 || arg5 > class232.field3217 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class442.field6435 - 1 < var6 || var7 > (class232.field3217 - 1)) {
                return 0;
            }
            boolean var8 = (class456.field6661[1][arg4 >> 7][arg3 >> 7] & 0x2) != 0;
            if ((arg4 & 0x7F) == 0) {
                boolean var9 = (class456.field6661[1][var6 - 1][arg3 >> 7] & 0x2) != 0;
                boolean var10 = (class456.field6661[1][var6][arg3 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class456.field6661[1][arg1][arg5] & 0x2) != 0;
                }
            }
            if ((arg3 & 0x7F) == 0) {
                boolean var11 = (class456.field6661[1][arg4 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class456.field6661[1][arg4 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class456.field6661[1][arg1][arg5] & 0x2) != 0;
                }
            }
            if (var8) {
                arg2++;
            }
        }
        return class383.field5391[arg2].method232(arg4, arg3);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)I")
    public static final int method846(int arg0, byte arg1) {
        field1763++;
        int var2 = 43 % ((-arg1 - 60) / 46);
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public static final void method847(byte arg0) {
        class284.field3822 = new class149(class120.field1630.method590(class105.field1434, -22602), "", class287.field3858, 1008, -1, 0L, 0, 0, true, false);
        if (arg0 <= -36) {
            field1771++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public static void method848(boolean arg0) {
        field1776 = null;
        if (arg0) {
            method847((byte) 49);
        }
        field1764 = null;
    }
}
