import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class118 extends class293 {

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Z")
    private boolean field1784 = false;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    private int field1802 = 0;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    private int field1807 = -32768;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    private int field1810 = 0;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    private int field1778;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    private int field1791;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    private int field1799;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "Lwe;")
    private class56 field1790;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "[I")
    public static int[] field1776 = new int[100];

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field1789 = 0;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "Lck;")
    private static class119 field1792 = class298.method1987((byte) 93, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Lck;")
    public static class119 field1781 = field1792;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "Lvk;")
    public static class67 field1794 = new class67(50);

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "D")
    private double field1772;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "D")
    private double field1774;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "D")
    private double field1783;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "D")
    public double field1788;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "D")
    public double field1800;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "D")
    public double field1803;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "D")
    private double field1806;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "D")
    private double field1809;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    private int field1771;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "Ljava/awt/Frame;")
    public static Frame field1808;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIJ)V", line = 10)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1805++;
        class28 var11 = this.method743(255);
        if (var11 != null) {
            var11.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1807 = var11.method214();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILck;)V", line = 27)
    public static final void method740(int arg0, class119 arg1) {
        class124.field1913 = arg1;
        if (arg0 == 11103) {
            class234.method1508((byte) 117);
            field1804++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()I", line = 39)
    public final int method214() {
        field1811++;
        return this.field1807;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 53)
    public static final void method741(int arg0) {
        field1796++;
        int var1 = class260.field4167.method992(97);
        if (var1 == 0) {
            return;
        }
        class152.field2420++;
        class6.field149.method966(0, 78);
        if (arg0 < 84) {
            field1776 = (int[]) null;
        }
        class6.field149.method32(0, (byte) -99);
        int var2 = class6.field149.field44;
        class204 var3 = (class204) class260.field4167.method991(16771501);
        int var4 = 0;
        class6.field149.method40(var3.field3230, 121);
        int var5 = var3.field3230;
        class204 var6;
        while ((var6 = (class204) class260.field4167.method991(16771501)) != null) {
            if (var4 < 255 && (var5 + 1) == var6.field3230) {
                var4++;
            } else {
                class6.field149.method32(var4, (byte) -99);
                class6.field149.method40(var6.field3230, -31);
                var4 = 0;
            }
            var5 = var6.field3230;
        }
        class6.field149.method32(var4, (byte) -99);
        class6.field149.method39(class6.field149.field44 - var2, (byte) -100);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILva;)V", line = 104)
    public static final void method742(int arg0, class36 arg1) {
        class203.field3223 = arg1;
        if (arg0 <= 30) {
            method745(-28);
        }
        field1787++;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lec;", line = 120)
    private final class28 method743(int arg0) {
        field1773++;
        class240 var2 = class234.method1511(116, this.field1795);
        class28 var3 = var2.method1564(this.field1810, (byte) -74);
        if (var3 == null) {
            return null;
        }
        var3.method221(this.field1771);
        if (arg0 != 255) {
            method741(-68);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V", line = 144)
    public final void method744(int arg0, int arg1) {
        field1793++;
        this.field1803 += (double) arg1 * this.field1774;
        this.field1800 += (double) arg1 * this.field1809;
        this.field1784 = true;
        this.field1788 += this.field1783 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1772;
        this.field1772 += (double) arg1 * this.field1783;
        this.field1797 = (int) (Math.atan2(this.field1809, this.field1774) * 325.949D) + 1024 & 0x7FF;
        this.field1771 = (int) (Math.atan2(this.field1772, this.field1806) * 325.949D) & arg0;
        if (this.field1790 == null) {
            return;
        }
        this.field1802 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1790.field905[this.field1810] >= this.field1802) {
                        return;
                    }
                    this.field1802 -= this.field1790.field905[this.field1810];
                    this.field1810++;
                } while (this.field1810 < this.field1790.field916.length);
                this.field1810 -= this.field1790.field900;
            } while (this.field1810 >= 0 && this.field1790.field916.length > this.field1810);
            this.field1810 = 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 179)
    public static void method745(int arg0) {
        if (arg0 != 0) {
            method741(59);
        }
        field1781 = null;
        field1776 = null;
        field1792 = null;
        field1808 = null;
        field1794 = null;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 281)
    public class118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1795 = arg0;
        this.field1779 = arg5;
        this.field1812 = arg9;
        this.field1786 = arg4;
        this.field1801 = arg10;
        this.field1778 = arg7;
        this.field1777 = arg1;
        this.field1798 = arg3;
        this.field1785 = arg6;
        this.field1791 = arg2;
        this.field1799 = arg8;
        this.field1784 = false;
        int var12 = class234.method1511(103, this.field1795).field3863;
        if (var12 == -1) {
            this.field1790 = null;
        } else {
            this.field1790 = class276.method1818(-20682, var12);
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(IIIII)V", line = 218)
    public final void method746(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1775++;
        if (!this.field1784) {
            double var6 = (double) (arg1 - this.field1791);
            double var8 = (double) (arg3 - this.field1798);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1788 = (double) this.field1786;
            this.field1800 = (double) this.field1799 * var6 / var10 + (double) this.field1791;
            this.field1803 = (double) this.field1799 * var8 / var10 + (double) this.field1798;
        }
        double var12 = (double) (this.field1785 + 1 - arg0);
        this.field1809 = ((double) arg1 - this.field1800) / var12;
        this.field1774 = ((double) arg3 - this.field1803) / var12;
        if (arg2 != 16383) {
            method740(46, (class119) null);
        }
        this.field1806 = Math.sqrt(this.field1809 * this.field1809 + this.field1774 * this.field1774);
        if (!this.field1784) {
            this.field1772 = -this.field1806 * Math.tan((double) this.field1778 * 0.02454369D);
        }
        this.field1783 = ((double) arg4 - this.field1788 - (this.field1772 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V", line = 256)
    public static final void method747(int arg0, boolean arg1) {
        class65.field1020 = arg1;
        if (arg0 == -30439) {
            class266.field4361 = !class64.method479(301989888);
            field1780++;
        }
    }
}
