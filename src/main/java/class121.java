import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class121 extends class151 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "F")
    public float field1784;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "F")
    public float field1787;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "F")
    public float field1788;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "F")
    public float field1792;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "F")
    public float field1793;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "F")
    public float field1794;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "F")
    public float field1799;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "F")
    public float field1800;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "F")
    public float field1801;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "F")
    public float field1803;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "F")
    public float field1804;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "F")
    public float field1806;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!nd", name = "na", descriptor = "(IIIIII)V")
    public final void method878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1809++;
        float var7 = class533.field7843[arg3 & 0x3FFF];
        float var8 = class533.field7841[arg3 & 0x3FFF];
        float var9 = class533.field7843[arg4 & 0x3FFF];
        float var10 = class533.field7841[arg4 & 0x3FFF];
        float var11 = class533.field7843[arg5 & 0x3FFF];
        float var12 = class533.field7841[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1792 = var9 * var11 + var10 * var14;
        this.field1806 = var7 * var9;
        this.field1788 = var7 * var10;
        this.field1794 = -var10 * var11 + var9 * var14;
        this.field1801 = var7 * var12;
        this.field1793 = -var8;
        this.field1787 = -var9 * var12 + var10 * var13;
        this.field1800 = var9 * var13 + var10 * var12;
        this.field1804 = var7 * var11;
        this.field1784 = (float) (-arg0) * this.field1787 - (float) arg1 * this.field1804 - ((float) arg2 * this.field1800);
        this.field1799 = (float) (-arg0) * this.field1788 - (float) arg1 * this.field1793 - (float) arg2 * this.field1806;
        this.field1803 = (float) (-arg0) * this.field1792 - (float) arg1 * this.field1801 - ((float) arg2 * this.field1794);
    }

    @OriginalMember(owner = "client!nd", name = "AA", descriptor = "(I)V")
    public final void method879(int arg0) {
        field1810++;
        float var2 = class533.field7843[arg0 & 0x3FFF];
        float var3 = class533.field7841[arg0 & 0x3FFF];
        float var4 = this.field1792;
        float var5 = this.field1801;
        float var6 = this.field1794;
        float var7 = this.field1803;
        this.field1792 = var2 * var4 - (this.field1787 * var3);
        this.field1801 = var2 * var5 - (this.field1804 * var3);
        this.field1787 = this.field1787 * var2 + var3 * var4;
        this.field1794 = var2 * var6 - (this.field1800 * var3);
        this.field1804 = this.field1804 * var2 + var3 * var5;
        this.field1803 = var2 * var7 - (this.field1784 * var3);
        this.field1800 = this.field1800 * var2 + var3 * var6;
        this.field1784 = this.field1784 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!nd", name = "wa", descriptor = "(III[I)V")
    public final void method880(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field1800 + (float) arg0 * this.field1787 + (float) arg1 * this.field1804);
        field1805++;
        arg3[2] = (int) ((float) arg2 * this.field1806 + (float) arg0 * this.field1788 + (float) arg1 * this.field1793);
        arg3[0] = (int) ((float) arg2 * this.field1794 + (float) arg0 * this.field1792 + (float) arg1 * this.field1801);
    }

    @OriginalMember(owner = "client!nd", name = "ZA", descriptor = "(I)V")
    public final void method881(int arg0) {
        field1796++;
        float var2 = class533.field7843[arg0 & 0x3FFF];
        float var3 = class533.field7841[arg0 & 0x3FFF];
        float var4 = this.field1792;
        float var5 = this.field1801;
        float var6 = this.field1794;
        this.field1792 = this.field1788 * var3 + var2 * var4;
        float var7 = this.field1803;
        this.field1801 = this.field1793 * var3 + var2 * var5;
        this.field1788 = this.field1788 * var2 - var3 * var4;
        this.field1793 = this.field1793 * var2 - var3 * var5;
        this.field1794 = this.field1806 * var3 + var2 * var6;
        this.field1806 = this.field1806 * var2 - var3 * var6;
        this.field1803 = this.field1799 * var3 + var2 * var7;
        this.field1799 = this.field1799 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!nd", name = "YA", descriptor = "([I)V")
    public final void method882(int[] arg0) {
        field1791++;
        float var2 = (float) arg0[0] - this.field1803;
        float var3 = (float) arg0[1] - this.field1784;
        float var4 = (float) arg0[2] - this.field1799;
        arg0[2] = (int) (this.field1806 * var4 + this.field1800 * var3 + this.field1794 * var2);
        arg0[0] = (int) (this.field1788 * var4 + this.field1792 * var2 + this.field1787 * var3);
        arg0[1] = (int) (this.field1793 * var4 + this.field1804 * var3 + this.field1801 * var2);
    }

    @OriginalMember(owner = "client!nd", name = "NA", descriptor = "(III)V")
    public final void method883(int arg0, int arg1, int arg2) {
        this.field1792 = this.field1804 = this.field1806 = 1.0F;
        field1798++;
        this.field1799 = arg2;
        this.field1784 = arg1;
        this.field1803 = arg0;
        this.field1787 = this.field1788 = this.field1801 = this.field1793 = this.field1794 = this.field1800 = 0.0F;
    }

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "(I)V")
    public final void method884(int arg0) {
        field1785++;
        float var2 = class533.field7843[arg0 & 0x3FFF];
        float var3 = class533.field7841[arg0 & 0x3FFF];
        float var4 = this.field1787;
        float var5 = this.field1804;
        float var6 = this.field1800;
        this.field1787 = var2 * var4 - (this.field1788 * var3);
        float var7 = this.field1784;
        this.field1788 = this.field1788 * var2 + var3 * var4;
        this.field1804 = var2 * var5 - (this.field1793 * var3);
        this.field1800 = var2 * var6 - (this.field1806 * var3);
        this.field1793 = this.field1793 * var2 + var3 * var5;
        this.field1806 = this.field1806 * var2 + var3 * var6;
        this.field1784 = var2 * var7 - (this.field1799 * var3);
        this.field1799 = this.field1799 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "(III[I)V")
    public final void method885(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field1799);
        field1808++;
        int var6 = (int) ((float) arg0 - this.field1803);
        int var7 = (int) ((float) arg1 - this.field1784);
        arg3[1] = (int) ((float) var5 * this.field1793 + (float) var6 * this.field1801 + (float) var7 * this.field1804);
        arg3[2] = (int) ((float) var5 * this.field1806 + (float) var6 * this.field1794 + (float) var7 * this.field1800);
        arg3[0] = (int) ((float) var5 * this.field1788 + (float) var6 * this.field1792 + (float) var7 * this.field1787);
    }

    @OriginalMember(owner = "client!nd", name = "oa", descriptor = "(I)V")
    public final void method886(int arg0) {
        field1789++;
        this.field1792 = 1.0F;
        this.field1804 = this.field1806 = class533.field7843[arg0 & 0x3FFF];
        this.field1793 = class533.field7841[arg0 & 0x3FFF];
        this.field1801 = this.field1794 = this.field1803 = this.field1787 = this.field1784 = this.field1788 = this.field1799 = 0.0F;
        this.field1800 = -this.field1793;
    }

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "(Lq;)V")
    public final void method887(class151 arg0) {
        field1811++;
        class121 var2 = (class121) arg0;
        this.field1784 = var2.field1784;
        this.field1793 = var2.field1793;
        this.field1799 = var2.field1799;
        this.field1800 = var2.field1800;
        this.field1794 = var2.field1794;
        this.field1792 = var2.field1792;
        this.field1788 = var2.field1788;
        this.field1806 = var2.field1806;
        this.field1804 = var2.field1804;
        this.field1787 = var2.field1787;
        this.field1801 = var2.field1801;
        this.field1803 = var2.field1803;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()Lq;")
    public final class151 method888() {
        field1812++;
        class121 var1 = new class121();
        var1.field1788 = this.field1788;
        var1.field1799 = this.field1799;
        var1.field1800 = this.field1800;
        var1.field1803 = this.field1803;
        var1.field1787 = this.field1787;
        var1.field1804 = this.field1804;
        var1.field1801 = this.field1801;
        var1.field1793 = this.field1793;
        var1.field1784 = this.field1784;
        var1.field1806 = this.field1806;
        var1.field1792 = this.field1792;
        var1.field1794 = this.field1794;
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class121() {
        this.method890();
    }

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "(I)V")
    public final void method889(int arg0) {
        field1802++;
        this.field1804 = 1.0F;
        this.field1792 = this.field1806 = class533.field7843[arg0 & 0x3FFF];
        this.field1794 = class533.field7841[arg0 & 0x3FFF];
        this.field1788 = -this.field1794;
        this.field1801 = this.field1803 = this.field1787 = this.field1800 = this.field1784 = this.field1793 = this.field1799 = 0.0F;
    }

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "()V")
    public final void method890() {
        field1797++;
        this.field1787 = this.field1788 = this.field1801 = this.field1793 = this.field1794 = this.field1800 = this.field1803 = this.field1784 = this.field1799 = 0.0F;
        this.field1792 = this.field1804 = this.field1806 = 1.0F;
    }

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "(I)V")
    public final void method891(int arg0) {
        field1795++;
        this.field1806 = 1.0F;
        this.field1792 = this.field1804 = class533.field7843[arg0 & 0x3FFF];
        this.field1787 = class533.field7841[arg0 & 0x3FFF];
        this.field1801 = -this.field1787;
        this.field1794 = this.field1803 = this.field1800 = this.field1784 = this.field1788 = this.field1793 = this.field1799 = 0.0F;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[I)V")
    public final void method892(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field1794 + (float) arg0 * this.field1792 + (float) arg1 * this.field1801 + this.field1803);
        arg3[1] = (int) ((float) arg2 * this.field1800 + (float) arg0 * this.field1787 + (float) arg1 * this.field1804 + this.field1784);
        arg3[2] = (int) ((float) arg2 * this.field1806 + (float) arg0 * this.field1788 + (float) arg1 * this.field1793 + this.field1799);
        field1790++;
    }

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "(III)V")
    public final void method893(int arg0, int arg1, int arg2) {
        this.field1784 += arg1;
        this.field1799 += arg2;
        field1807++;
        this.field1803 += arg0;
    }
}
