import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class114 extends class94 {

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Z")
    private boolean field1737 = false;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public int field1761 = 0;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "B")
    public byte field1764 = 0;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public int field1766 = 0;

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "I")
    public int field1782 = 0;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "[I")
    public int[] field1767;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "[I")
    public int[] field1757;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "[I")
    public int[] field1754;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "[I")
    public int[] field1776;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "[I")
    public int[] field1738;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "[I")
    public int[] field1749;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "[I")
    public int[] field1777;

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "[B")
    public byte[] field1783;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "[B")
    public byte[] field1769;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "[B")
    public byte[] field1750;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "[S")
    public short[] field1746;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "[S")
    public short[] field1755;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "[B")
    public byte[] field1758;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "[I")
    public int[] field1747;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "[B")
    public byte[] field1763;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[S")
    public short[] field1739;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "[S")
    public short[] field1775;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[S")
    public short[] field1735;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "[S")
    public short[] field1771;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[S")
    public short[] field1744;

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "[S")
    public short[] field1780;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "[B")
    public byte[] field1768;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "[B")
    public byte[] field1759;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[B")
    public byte[] field1732;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "[B")
    public byte[] field1760;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[B")
    public byte[] field1742;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "[S")
    public short[] field1773;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "[S")
    public short[] field1741;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "[[I")
    public int[][] field1756;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "[[I")
    public int[][] field1752;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "[Lqd;")
    public class283[] field1743;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "[Lgm;")
    public class181[] field1753;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "[Lqd;")
    public class283[] field1778;

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "S")
    public short field1781;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "S")
    public short field1733;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "[I")
    private static int[] field1736 = new int[10000];

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "[I")
    private static int[] field1745 = class12.field127;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    private static int field1770 = 0;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "[I")
    private static int[] field1762 = new int[10000];

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "[I")
    private static int[] field1774 = class12.field121;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "S")
    private short field1734;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "S")
    private short field1740;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "S")
    private short field1748;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "S")
    private short field1751;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "S")
    private short field1765;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "S")
    private short field1779;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)V", line = 8)
    public final void method761(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field1774[arg2];
            int var5 = field1745[arg2];
            for (int var6 = 0; var6 < this.field1782; var6++) {
                int var7 = this.field1767[var6] * var5 + this.field1757[var6] * var4 >> 16;
                this.field1757[var6] = this.field1757[var6] * var5 - this.field1767[var6] * var4 >> 16;
                this.field1767[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field1774[arg0];
            int var9 = field1745[arg0];
            for (int var10 = 0; var10 < this.field1782; var10++) {
                int var11 = this.field1757[var10] * var9 - this.field1754[var10] * var8 >> 16;
                this.field1754[var10] = this.field1757[var10] * var8 + this.field1754[var10] * var9 >> 16;
                this.field1757[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field1774[arg1];
        int var13 = field1745[arg1];
        for (int var14 = 0; var14 < this.field1782; var14++) {
            int var15 = this.field1767[var14] * var13 + this.field1754[var14] * var12 >> 16;
            this.field1754[var14] = this.field1754[var14] * var13 - this.field1767[var14] * var12 >> 16;
            this.field1767[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 71)
    private final void method762(int arg0) {
        int var2 = field1774[arg0];
        int var3 = field1745[arg0];
        for (int var4 = 0; var4 < this.field1782; var4++) {
            int var5 = this.field1757[var4] * var3 - this.field1754[var4] * var2 >> 16;
            this.field1754[var4] = this.field1757[var4] * var2 + this.field1754[var4] * var3 >> 16;
            this.field1757[var4] = var5;
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V", line = 94)
    private final void method763(int arg0) {
        int var2 = field1774[arg0];
        int var3 = field1745[arg0];
        for (int var4 = 0; var4 < this.field1782; var4++) {
            int var5 = this.field1767[var4] * var3 + this.field1757[var4] * var2 >> 16;
            this.field1757[var4] = this.field1757[var4] * var3 - this.field1767[var4] * var2 >> 16;
            this.field1767[var4] = var5;
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lfe;IIIZ)V", line = 113)
    public final void method641(class94 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class114 var6 = (class114) arg0;
        var6.method774();
        var6.method775();
        field1770++;
        int var7 = 0;
        int[] var8 = var6.field1767;
        int var9 = var6.field1766;
        for (int var10 = 0; var10 < this.field1766; var10++) {
            class283 var11 = this.field1743[var10];
            if (var11.field4346 != 0) {
                int var12 = this.field1757[var10] - arg2;
                if (var12 >= var6.field1740 && var12 <= var6.field1751) {
                    int var13 = this.field1767[var10] - arg1;
                    if (var13 >= var6.field1765 && var13 <= var6.field1734) {
                        int var14 = this.field1754[var10] - arg3;
                        if (var14 >= var6.field1779 && var14 <= var6.field1748) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class283 var16 = var6.field1743[var15];
                                if (var8[var15] == var13 && var6.field1754[var15] == var14 && var6.field1757[var15] == var12 && var16.field4346 != 0) {
                                    if (this.field1778 == null) {
                                        this.field1778 = new class283[this.field1766];
                                    }
                                    if (var6.field1778 == null) {
                                        var6.field1778 = new class283[var9];
                                    }
                                    class283 var17 = this.field1778[var10];
                                    if (var17 == null) {
                                        var17 = this.field1778[var10] = new class283(var11);
                                    }
                                    class283 var18 = var6.field1778[var15];
                                    if (var18 == null) {
                                        var18 = var6.field1778[var15] = new class283(var16);
                                    }
                                    var17.field4345 += var16.field4345;
                                    var17.field4347 += var16.field4347;
                                    var17.field4344 += var16.field4344;
                                    var17.field4346 += var16.field4346;
                                    var18.field4345 += var11.field4345;
                                    var18.field4347 += var11.field4347;
                                    var18.field4344 += var11.field4344;
                                    var18.field4346 += var11.field4346;
                                    var7++;
                                    field1762[var10] = field1770;
                                    field1736[var15] = field1770;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field1761; var19++) {
            if (field1762[this.field1738[var19]] == field1770 && field1762[this.field1749[var19]] == field1770 && field1762[this.field1777[var19]] == field1770) {
                if (this.field1783 == null) {
                    this.field1783 = new byte[this.field1761];
                }
                this.field1783[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field1761; var20++) {
            if (field1736[var6.field1738[var20]] == field1770 && field1736[var6.field1749[var20]] == field1770 && field1736[var6.field1777[var20]] == field1770) {
                if (var6.field1783 == null) {
                    var6.field1783 = new byte[var6.field1761];
                }
                var6.field1783[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(SS)V", line = 229)
    public final void method764(short arg0, short arg1) {
        if (this.field1755 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1761; var3++) {
            if (this.field1755[var3] == arg0) {
                this.field1755[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "()V", line = 247)
    public final void method765() {
        for (int var1 = 0; var1 < this.field1782; var1++) {
            int var2 = this.field1767[var1];
            this.field1767[var1] = this.field1754[var1];
            this.field1754[var1] = -var2;
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "()V", line = 267)
    public final void method766() {
        for (int var1 = 0; var1 < this.field1782; var1++) {
            this.field1767[var1] = -this.field1767[var1];
            this.field1754[var1] = -this.field1754[var1];
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V", line = 279)
    public final void method767(int arg0) {
        int var2 = field1774[arg0];
        int var3 = field1745[arg0];
        for (int var4 = 0; var4 < this.field1782; var4++) {
            int var5 = this.field1767[var4] * var3 + this.field1754[var4] * var2 >> 16;
            this.field1754[var4] = this.field1754[var4] * var3 - this.field1767[var4] * var2 >> 16;
            this.field1767[var4] = var5;
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V", line = 297)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "()V", line = 301)
    public final void method768() {
        this.field1776 = null;
        this.field1747 = null;
        this.field1756 = (int[][]) null;
        this.field1752 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIIII)Lg;", line = 310)
    public final class295 method769(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class333.field5166) {
            class340 var6 = new class340(this, arg0, arg1, true);
            var6.method2383();
            return var6;
        } else {
            return new class141(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 2193)
    private class114() {
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V", line = 2195)
    private class114(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method773(arg0);
        } else {
            this.method770(arg0);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(III)V", line = 2202)
    public class114(int arg0, int arg1, int arg2) {
        this.field1767 = new int[arg0];
        this.field1757 = new int[arg0];
        this.field1754 = new int[arg0];
        this.field1776 = new int[arg0];
        this.field1738 = new int[arg1];
        this.field1749 = new int[arg1];
        this.field1777 = new int[arg1];
        this.field1783 = new byte[arg1];
        this.field1769 = new byte[arg1];
        this.field1750 = new byte[arg1];
        this.field1746 = new short[arg1];
        this.field1755 = new short[arg1];
        this.field1758 = new byte[arg1];
        this.field1747 = new int[arg1];
        if (arg2 > 0) {
            this.field1763 = new byte[arg2];
            this.field1739 = new short[arg2];
            this.field1775 = new short[arg2];
            this.field1735 = new short[arg2];
            this.field1771 = new short[arg2];
            this.field1744 = new short[arg2];
            this.field1780 = new short[arg2];
            this.field1768 = new byte[arg2];
            this.field1759 = new byte[arg2];
            this.field1732 = new byte[arg2];
            this.field1760 = new byte[arg2];
            this.field1742 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([Lvi;I)V", line = 2235)
    public class114(class114[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1782 = 0;
        this.field1761 = 0;
        this.field1772 = 0;
        byte var9 = 0;
        byte var10 = 0;
        this.field1764 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class114 var12 = arg0[var11];
            if (var12 != null) {
                this.field1782 += var12.field1782;
                this.field1761 += var12.field1761;
                this.field1772 += var12.field1772;
                if (var12.field1769 == null) {
                    if (this.field1764 == -1) {
                        this.field1764 = var12.field1764;
                    }
                    if (this.field1764 != var12.field1764) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field1783 != null;
                var5 |= var12.field1750 != null;
                var6 |= var12.field1747 != null;
                var7 |= var12.field1755 != null;
                var8 |= var12.field1758 != null;
            }
        }
        this.field1767 = new int[this.field1782];
        this.field1757 = new int[this.field1782];
        this.field1754 = new int[this.field1782];
        this.field1776 = new int[this.field1782];
        this.field1773 = new short[this.field1782];
        this.field1738 = new int[this.field1761];
        this.field1749 = new int[this.field1761];
        this.field1777 = new int[this.field1761];
        if (var3) {
            this.field1783 = new byte[this.field1761];
        }
        if (var4) {
            this.field1769 = new byte[this.field1761];
        }
        if (var5) {
            this.field1750 = new byte[this.field1761];
        }
        if (var6) {
            this.field1747 = new int[this.field1761];
        }
        if (var7) {
            this.field1755 = new short[this.field1761];
        }
        if (var8) {
            this.field1758 = new byte[this.field1761];
        }
        if (var9 > 0) {
        }
        if (var10 > 0) {
        }
        this.field1746 = new short[this.field1761];
        this.field1741 = new short[this.field1761];
        if (this.field1772 > 0) {
            this.field1763 = new byte[this.field1772];
            this.field1739 = new short[this.field1772];
            this.field1775 = new short[this.field1772];
            this.field1735 = new short[this.field1772];
            this.field1771 = new short[this.field1772];
            this.field1744 = new short[this.field1772];
            this.field1780 = new short[this.field1772];
            this.field1768 = new byte[this.field1772];
            this.field1759 = new byte[this.field1772];
            this.field1732 = new byte[this.field1772];
            this.field1760 = new byte[this.field1772];
            this.field1742 = new byte[this.field1772];
        }
        this.field1782 = 0;
        this.field1761 = 0;
        this.field1772 = 0;
        boolean var13 = false;
        boolean var14 = false;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class114 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field1761; var18++) {
                    if (var3 && var17.field1783 != null) {
                        this.field1783[this.field1761] = var17.field1783[var18];
                    }
                    if (var4) {
                        if (var17.field1769 == null) {
                            this.field1769[this.field1761] = var17.field1764;
                        } else {
                            this.field1769[this.field1761] = var17.field1769[var18];
                        }
                    }
                    if (var5 && var17.field1750 != null) {
                        this.field1750[this.field1761] = var17.field1750[var18];
                    }
                    if (var6 && var17.field1747 != null) {
                        this.field1747[this.field1761] = var17.field1747[var18];
                    }
                    if (var7) {
                        if (var17.field1755 == null) {
                            this.field1755[this.field1761] = -1;
                        } else {
                            this.field1755[this.field1761] = var17.field1755[var18];
                        }
                    }
                    this.field1746[this.field1761] = var17.field1746[var18];
                    this.field1741[this.field1761] = var16;
                    this.field1738[this.field1761] = this.method771(var17, var17.field1738[var18], var16);
                    this.field1749[this.field1761] = this.method771(var17, var17.field1749[var18], var16);
                    this.field1777[this.field1761] = this.method771(var17, var17.field1777[var18], var16);
                    this.field1761++;
                }
            }
        }
        int var19 = 0;
        this.field1766 = this.field1782;
        for (int var20 = 0; var20 < arg1; var20++) {
            class114 var21 = arg0[var20];
            short var22 = (short) (0x1 << var20);
            if (var21 != null) {
                for (int var23 = 0; var23 < var21.field1761; var23++) {
                    if (var8) {
                        this.field1758[var19++] = (byte) (var21.field1758 == null || var21.field1758[var23] == -1 ? -1 : var21.field1758[var23] + this.field1772);
                    }
                }
                for (int var24 = 0; var24 < var21.field1772; var24++) {
                    byte var25 = this.field1763[this.field1772] = var21.field1763[var24];
                    if (var25 == 0) {
                        this.field1739[this.field1772] = (short) this.method771(var21, var21.field1739[var24], var22);
                        this.field1775[this.field1772] = (short) this.method771(var21, var21.field1775[var24], var22);
                        this.field1735[this.field1772] = (short) this.method771(var21, var21.field1735[var24], var22);
                    }
                    if (var25 >= 1 && var25 <= 3) {
                        this.field1739[this.field1772] = var21.field1739[var24];
                        this.field1775[this.field1772] = var21.field1775[var24];
                        this.field1735[this.field1772] = var21.field1735[var24];
                        this.field1771[this.field1772] = var21.field1771[var24];
                        this.field1744[this.field1772] = var21.field1744[var24];
                        this.field1780[this.field1772] = var21.field1780[var24];
                        this.field1768[this.field1772] = var21.field1768[var24];
                        this.field1759[this.field1772] = var21.field1759[var24];
                        this.field1732[this.field1772] = var21.field1732[var24];
                    }
                    if (var25 == 2) {
                        this.field1760[this.field1772] = var21.field1760[var24];
                        this.field1742[this.field1772] = var21.field1742[var24];
                    }
                    this.field1772++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lvi;ZZZZ)V", line = 2490)
    public class114(class114 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1782 = arg0.field1782;
        this.field1766 = arg0.field1766;
        this.field1761 = arg0.field1761;
        this.field1772 = arg0.field1772;
        if (arg1) {
            this.field1767 = arg0.field1767;
            this.field1757 = arg0.field1757;
            this.field1754 = arg0.field1754;
        } else {
            this.field1767 = new int[this.field1782];
            this.field1757 = new int[this.field1782];
            this.field1754 = new int[this.field1782];
            for (int var6 = 0; var6 < this.field1782; var6++) {
                this.field1767[var6] = arg0.field1767[var6];
                this.field1757[var6] = arg0.field1757[var6];
                this.field1754[var6] = arg0.field1754[var6];
            }
        }
        if (arg2) {
            this.field1746 = arg0.field1746;
        } else {
            this.field1746 = new short[this.field1761];
            for (int var7 = 0; var7 < this.field1761; var7++) {
                this.field1746[var7] = arg0.field1746[var7];
            }
        }
        if (arg3 || arg0.field1755 == null) {
            this.field1755 = arg0.field1755;
        } else {
            this.field1755 = new short[this.field1761];
            for (int var8 = 0; var8 < this.field1761; var8++) {
                this.field1755[var8] = arg0.field1755[var8];
            }
        }
        if (arg4) {
            this.field1750 = arg0.field1750;
        } else {
            this.field1750 = new byte[this.field1761];
            if (arg0.field1750 == null) {
                for (int var9 = 0; var9 < this.field1761; var9++) {
                    this.field1750[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1761; var10++) {
                    this.field1750[var10] = arg0.field1750[var10];
                }
            }
        }
        this.field1738 = arg0.field1738;
        this.field1749 = arg0.field1749;
        this.field1777 = arg0.field1777;
        this.field1783 = arg0.field1783;
        this.field1769 = arg0.field1769;
        this.field1758 = arg0.field1758;
        this.field1764 = arg0.field1764;
        this.field1763 = arg0.field1763;
        this.field1739 = arg0.field1739;
        this.field1775 = arg0.field1775;
        this.field1735 = arg0.field1735;
        this.field1771 = arg0.field1771;
        this.field1744 = arg0.field1744;
        this.field1780 = arg0.field1780;
        this.field1768 = arg0.field1768;
        this.field1759 = arg0.field1759;
        this.field1732 = arg0.field1732;
        this.field1760 = arg0.field1760;
        this.field1742 = arg0.field1742;
        this.field1776 = arg0.field1776;
        this.field1747 = arg0.field1747;
        this.field1756 = arg0.field1756;
        this.field1752 = arg0.field1752;
        this.field1743 = arg0.field1743;
        this.field1753 = arg0.field1753;
        this.field1778 = arg0.field1778;
        this.field1781 = arg0.field1781;
        this.field1733 = arg0.field1733;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([B)V", line = 329)
    private final void method770(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class303 var4 = new class303(arg0);
        class303 var5 = new class303(arg0);
        class303 var6 = new class303(arg0);
        class303 var7 = new class303(arg0);
        class303 var8 = new class303(arg0);
        var4.field4679 = arg0.length - 18;
        int var9 = var4.method1994(false);
        int var10 = var4.method1994(false);
        int var11 = var4.method2043((byte) -121);
        int var12 = var4.method2043((byte) -122);
        int var13 = var4.method2043((byte) -122);
        int var14 = var4.method2043((byte) -124);
        int var15 = var4.method2043((byte) -125);
        int var16 = var4.method2043((byte) -120);
        int var17 = var4.method1994(false);
        int var18 = var4.method1994(false);
        int var19 = var4.method1994(false);
        int var20 = var4.method1994(false);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1782 = var9;
        this.field1761 = var10;
        this.field1772 = var11;
        this.field1767 = new int[var9];
        this.field1757 = new int[var9];
        this.field1754 = new int[var9];
        this.field1738 = new int[var10];
        this.field1749 = new int[var10];
        this.field1777 = new int[var10];
        if (var11 > 0) {
            this.field1763 = new byte[var11];
            this.field1739 = new short[var11];
            this.field1775 = new short[var11];
            this.field1735 = new short[var11];
        }
        if (var16 == 1) {
            this.field1776 = new int[var9];
        }
        if (var12 == 1) {
            this.field1783 = new byte[var10];
            this.field1758 = new byte[var10];
            this.field1755 = new short[var10];
        }
        if (var13 == 255) {
            this.field1769 = new byte[var10];
        } else {
            this.field1764 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1750 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1747 = new int[var10];
        }
        this.field1746 = new short[var10];
        var4.field4679 = var21;
        var5.field4679 = var36;
        var6.field4679 = var38;
        var7.field4679 = var40;
        var8.field4679 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method2043((byte) -119);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method2035(-49152);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method2035(-49152);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method2035(-49152);
            }
            this.field1767[var46] = var43 + var48;
            this.field1757[var46] = var44 + var49;
            this.field1754[var46] = var45 + var50;
            var43 = this.field1767[var46];
            var44 = this.field1757[var46];
            var45 = this.field1754[var46];
            if (var16 == 1) {
                this.field1776[var46] = var8.method2043((byte) -106);
            }
        }
        var4.field4679 = var32;
        var5.field4679 = var28;
        var6.field4679 = var26;
        var7.field4679 = var30;
        var8.field4679 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1746[var51] = (short) var4.method1994(false);
            if (var12 == 1) {
                int var52 = var5.method2043((byte) -123);
                if ((var52 & 0x1) == 1) {
                    this.field1783[var51] = 1;
                    var2 = true;
                } else {
                    this.field1783[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1758[var51] = (byte) (var52 >> 2);
                    this.field1755[var51] = this.field1746[var51];
                    this.field1746[var51] = 127;
                    if (this.field1755[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1758[var51] = -1;
                    this.field1755[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1769[var51] = var6.method2001(-3);
            }
            if (var14 == 1) {
                this.field1750[var51] = var7.method2001(-3);
            }
            if (var15 == 1) {
                this.field1747[var51] = var8.method2043((byte) -113);
            }
        }
        this.field1766 = -1;
        var4.field4679 = var25;
        var5.field4679 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method2043((byte) -122);
            if (var58 == 1) {
                var53 = var4.method2035(-49152) + var56;
                var54 = var4.method2035(-49152) + var53;
                var55 = var4.method2035(-49152) + var54;
                var56 = var55;
                this.field1738[var57] = var53;
                this.field1749[var57] = var54;
                this.field1777[var57] = var55;
                if (var53 > this.field1766) {
                    this.field1766 = var53;
                }
                if (var54 > this.field1766) {
                    this.field1766 = var54;
                }
                if (var55 > this.field1766) {
                    this.field1766 = var55;
                }
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method2035(-49152) + var56;
                var56 = var55;
                this.field1738[var57] = var53;
                this.field1749[var57] = var54;
                this.field1777[var57] = var55;
                if (var55 > this.field1766) {
                    this.field1766 = var55;
                }
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method2035(-49152) + var56;
                var56 = var55;
                this.field1738[var57] = var53;
                this.field1749[var57] = var54;
                this.field1777[var57] = var55;
                if (var55 > this.field1766) {
                    this.field1766 = var55;
                }
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method2035(-49152) + var56;
                var56 = var55;
                this.field1738[var57] = var53;
                this.field1749[var57] = var61;
                this.field1777[var57] = var55;
                if (var55 > this.field1766) {
                    this.field1766 = var55;
                }
            }
        }
        this.field1766++;
        var4.field4679 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1763[var62] = 0;
            this.field1739[var62] = (short) var4.method1994(false);
            this.field1775[var62] = (short) var4.method1994(false);
            this.field1735[var62] = (short) var4.method1994(false);
        }
        if (this.field1758 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1758[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1739[var65] & 0xFFFF) == this.field1738[var64] && (this.field1775[var65] & 0xFFFF) == this.field1749[var64] && (this.field1735[var65] & 0xFFFF) == this.field1777[var64]) {
                        this.field1758[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1758 = null;
            }
        }
        if (!var3) {
            this.field1755 = null;
        }
        if (!var2) {
            this.field1783 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lvi;IS)I", line = 695)
    private final int method771(class114 arg0, int arg1, short arg2) {
        int var4 = arg0.field1767[arg1];
        int var5 = arg0.field1757[arg1];
        int var6 = arg0.field1754[arg1];
        for (int var7 = 0; var7 < this.field1782; var7++) {
            if (this.field1767[var7] == var4 && this.field1757[var7] == var5 && this.field1754[var7] == var6) {
                this.field1773[var7] |= arg2;
                return var7;
            }
        }
        this.field1767[this.field1782] = var4;
        this.field1757[this.field1782] = var5;
        this.field1754[this.field1782] = var6;
        this.field1773[this.field1782] = arg2;
        if (arg0.field1776 != null) {
            this.field1776[this.field1782] = arg0.field1776[arg1];
        }
        return this.field1782++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([[III)I", line = 727)
    private static final int method772(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Lfe;", line = 745)
    public final class94 method642(int arg0, int arg1, int arg2) {
        return this.method769(this.field1781, this.field1733, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "([B)V", line = 750)
    private final void method773(byte[] arg0) {
        class303 var2 = new class303(arg0);
        class303 var3 = new class303(arg0);
        class303 var4 = new class303(arg0);
        class303 var5 = new class303(arg0);
        class303 var6 = new class303(arg0);
        class303 var7 = new class303(arg0);
        class303 var8 = new class303(arg0);
        var2.field4679 = arg0.length - 23;
        int var9 = var2.method1994(false);
        int var10 = var2.method1994(false);
        int var11 = var2.method2043((byte) -112);
        int var12 = var2.method2043((byte) -124);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method2043((byte) -121);
        int var16 = var2.method2043((byte) -108);
        int var17 = var2.method2043((byte) -126);
        int var18 = var2.method2043((byte) -112);
        int var19 = var2.method2043((byte) -106);
        int var20 = var2.method1994(false);
        int var21 = var2.method1994(false);
        int var22 = var2.method1994(false);
        int var23 = var2.method1994(false);
        int var24 = var2.method1994(false);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field1763 = new byte[var11];
            var2.field4679 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field1763[var28] = var2.method2001(-3);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field1782 = var9;
        this.field1761 = var10;
        this.field1772 = var11;
        this.field1767 = new int[var9];
        this.field1757 = new int[var9];
        this.field1754 = new int[var9];
        this.field1738 = new int[var10];
        this.field1749 = new int[var10];
        this.field1777 = new int[var10];
        if (var19 == 1) {
            this.field1776 = new int[var9];
        }
        if (var13) {
            this.field1783 = new byte[var10];
        }
        if (var15 == 255) {
            this.field1769 = new byte[var10];
        } else {
            this.field1764 = (byte) var15;
        }
        if (var16 == 1) {
            this.field1750 = new byte[var10];
        }
        if (var17 == 1) {
            this.field1747 = new int[var10];
        }
        if (var18 == 1) {
            this.field1755 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field1758 = new byte[var10];
        }
        this.field1746 = new short[var10];
        if (var11 > 0) {
            this.field1739 = new short[var11];
            this.field1775 = new short[var11];
            this.field1735 = new short[var11];
            if (var26 > 0) {
                this.field1771 = new short[var26];
                this.field1744 = new short[var26];
                this.field1780 = new short[var26];
                this.field1768 = new byte[var26];
                this.field1759 = new byte[var26];
                this.field1732 = new byte[var26];
            }
            if (var27 > 0) {
                this.field1760 = new byte[var27];
                this.field1742 = new byte[var27];
            }
        }
        var2.field4679 = var11;
        var3.field4679 = var46;
        var4.field4679 = var48;
        var5.field4679 = var50;
        var6.field4679 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method2043((byte) -121);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method2035(-49152);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method2035(-49152);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method2035(-49152);
            }
            this.field1767[var69] = var66 + var71;
            this.field1757[var69] = var67 + var72;
            this.field1754[var69] = var68 + var73;
            var66 = this.field1767[var69];
            var67 = this.field1757[var69];
            var68 = this.field1754[var69];
            if (var19 == 1) {
                this.field1776[var69] = var6.method2043((byte) -112);
            }
        }
        var2.field4679 = var44;
        var3.field4679 = var33;
        var4.field4679 = var36;
        var5.field4679 = var39;
        var6.field4679 = var37;
        var7.field4679 = var42;
        var8.field4679 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field1746[var74] = (short) var2.method1994(false);
            if (var13) {
                this.field1783[var74] = var3.method2001(-3);
            }
            if (var15 == 255) {
                this.field1769[var74] = var4.method2001(-3);
            }
            if (var16 == 1) {
                this.field1750[var74] = var5.method2001(-3);
            }
            if (var17 == 1) {
                this.field1747[var74] = var6.method2043((byte) -106);
            }
            if (var18 == 1) {
                this.field1755[var74] = (short) (var7.method1994(false) - 1);
            }
            if (this.field1758 != null) {
                if (this.field1755[var74] == -1) {
                    this.field1758[var74] = -1;
                } else {
                    this.field1758[var74] = (byte) (var8.method2043((byte) -112) - 1);
                }
            }
        }
        this.field1766 = -1;
        var2.field4679 = var35;
        var3.field4679 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method2043((byte) -113);
            if (var80 == 1) {
                var75 = var2.method2035(-49152) + var78;
                var76 = var2.method2035(-49152) + var75;
                var77 = var2.method2035(-49152) + var76;
                var78 = var77;
                this.field1738[var79] = var75;
                this.field1749[var79] = var76;
                this.field1777[var79] = var77;
                if (var75 > this.field1766) {
                    this.field1766 = var75;
                }
                if (var76 > this.field1766) {
                    this.field1766 = var76;
                }
                if (var77 > this.field1766) {
                    this.field1766 = var77;
                }
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method2035(-49152) + var78;
                var78 = var77;
                this.field1738[var79] = var75;
                this.field1749[var79] = var76;
                this.field1777[var79] = var77;
                if (var77 > this.field1766) {
                    this.field1766 = var77;
                }
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method2035(-49152) + var78;
                var78 = var77;
                this.field1738[var79] = var75;
                this.field1749[var79] = var76;
                this.field1777[var79] = var77;
                if (var77 > this.field1766) {
                    this.field1766 = var77;
                }
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method2035(-49152) + var78;
                var78 = var77;
                this.field1738[var79] = var75;
                this.field1749[var79] = var83;
                this.field1777[var79] = var77;
                if (var77 > this.field1766) {
                    this.field1766 = var77;
                }
            }
        }
        this.field1766++;
        var2.field4679 = var52;
        var3.field4679 = var54;
        var4.field4679 = var56;
        var5.field4679 = var58;
        var6.field4679 = var60;
        var7.field4679 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field1763[var84] & 0xFF;
            if (var85 == 0) {
                this.field1739[var84] = (short) var2.method1994(false);
                this.field1775[var84] = (short) var2.method1994(false);
                this.field1735[var84] = (short) var2.method1994(false);
            }
            if (var85 == 1) {
                this.field1739[var84] = (short) var3.method1994(false);
                this.field1775[var84] = (short) var3.method1994(false);
                this.field1735[var84] = (short) var3.method1994(false);
                this.field1771[var84] = (short) var4.method1994(false);
                this.field1744[var84] = (short) var4.method1994(false);
                this.field1780[var84] = (short) var4.method1994(false);
                this.field1768[var84] = var5.method2001(-3);
                this.field1759[var84] = var6.method2001(-3);
                this.field1732[var84] = var7.method2001(-3);
            }
            if (var85 == 2) {
                this.field1739[var84] = (short) var3.method1994(false);
                this.field1775[var84] = (short) var3.method1994(false);
                this.field1735[var84] = (short) var3.method1994(false);
                this.field1771[var84] = (short) var4.method1994(false);
                this.field1744[var84] = (short) var4.method1994(false);
                this.field1780[var84] = (short) var4.method1994(false);
                this.field1768[var84] = var5.method2001(-3);
                this.field1759[var84] = var6.method2001(-3);
                this.field1732[var84] = var7.method2001(-3);
                this.field1760[var84] = var7.method2001(-3);
                this.field1742[var84] = var7.method2001(-3);
            }
            if (var85 == 3) {
                this.field1739[var84] = (short) var3.method1994(false);
                this.field1775[var84] = (short) var3.method1994(false);
                this.field1735[var84] = (short) var3.method1994(false);
                this.field1771[var84] = (short) var4.method1994(false);
                this.field1744[var84] = (short) var4.method1994(false);
                this.field1780[var84] = (short) var4.method1994(false);
                this.field1768[var84] = var5.method2001(-3);
                this.field1759[var84] = var6.method2001(-3);
                this.field1732[var84] = var7.method2001(-3);
            }
        }
        if (!var14) {
            return;
        }
        var2.field4679 = var64;
        int var86 = var2.method2043((byte) -110);
        if (var86 > 0) {
            var2.field4679 += var86 * 4;
        }
        int var87 = var2.method2043((byte) -109);
        if (var87 > 0) {
            var2.field4679 += var87 * 4;
        }
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "()V", line = 1219)
    private final void method774() {
        if (this.field1737) {
            return;
        }
        this.field1737 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field1766; var7++) {
            int var8 = this.field1767[var7];
            int var9 = this.field1757[var7];
            int var10 = this.field1754[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field1765 = (short) var1;
        this.field1734 = (short) var4;
        this.field1740 = (short) var2;
        this.field1751 = (short) var5;
        this.field1779 = (short) var3;
        this.field1748 = (short) var6;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIIJILcj;)V", line = 1284)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10) {
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "()V", line = 1286)
    public final void method775() {
        if (this.field1743 != null) {
            return;
        }
        this.field1743 = new class283[this.field1766];
        for (int var1 = 0; var1 < this.field1766; var1++) {
            this.field1743[var1] = new class283();
        }
        for (int var2 = 0; var2 < this.field1761; var2++) {
            int var3 = this.field1738[var2];
            int var4 = this.field1749[var2];
            int var5 = this.field1777[var2];
            int var6 = this.field1767[var4] - this.field1767[var3];
            int var7 = this.field1757[var4] - this.field1757[var3];
            int var8 = this.field1754[var4] - this.field1754[var3];
            int var9 = this.field1767[var5] - this.field1767[var3];
            int var10 = this.field1757[var5] - this.field1757[var3];
            int var11 = this.field1754[var5] - this.field1754[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1783 == null) {
                var19 = 0;
            } else {
                var19 = this.field1783[var2];
            }
            if (var19 == 0) {
                class283 var20 = this.field1743[var3];
                var20.field4345 += var16;
                var20.field4347 += var17;
                var20.field4344 += var18;
                var20.field4346++;
                class283 var21 = this.field1743[var4];
                var21.field4345 += var16;
                var21.field4347 += var17;
                var21.field4344 += var18;
                var21.field4346++;
                class283 var22 = this.field1743[var5];
                var22.field4345 += var16;
                var22.field4347 += var17;
                var22.field4344 += var18;
                var22.field4346++;
            } else if (var19 == 1) {
                if (this.field1753 == null) {
                    this.field1753 = new class181[this.field1761];
                }
                class181 var23 = this.field1753[var2] = new class181();
                var23.field2780 = var16;
                var23.field2779 = var17;
                var23.field2774 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([[IIIIII)V", line = 1387)
    private final void method776(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method772(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method772(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method772(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method772(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method762(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method763(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method789(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)V", line = 1456)
    public final void method777(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1782; var4++) {
            this.field1767[var4] = this.field1767[var4] * arg0 / 128;
            this.field1757[var4] = this.field1757[var4] * arg1 / 128;
            this.field1754[var4] = this.field1754[var4] * arg2 / 128;
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "()V", line = 1472)
    public final void method778() {
        for (int var1 = 0; var1 < this.field1782; var1++) {
            int var2 = this.field1754[var1];
            this.field1754[var1] = this.field1767[var1];
            this.field1767[var1] = -var2;
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(IIIII)Ljd;", line = 1486)
    public final class141 method779(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class141(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "()V", line = 1491)
    private final void method780() {
        this.field1743 = null;
        this.field1778 = null;
        this.field1753 = null;
        this.field1737 = false;
    }

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "()Lvi;", line = 1498)
    public final class114 method781() {
        class114 var1 = new class114();
        if (this.field1783 != null) {
            var1.field1783 = new byte[this.field1761];
            for (int var2 = 0; var2 < this.field1761; var2++) {
                var1.field1783[var2] = this.field1783[var2];
            }
        }
        var1.field1782 = this.field1782;
        var1.field1766 = this.field1766;
        var1.field1761 = this.field1761;
        var1.field1772 = this.field1772;
        var1.field1767 = this.field1767;
        var1.field1757 = this.field1757;
        var1.field1754 = this.field1754;
        var1.field1738 = this.field1738;
        var1.field1749 = this.field1749;
        var1.field1777 = this.field1777;
        var1.field1769 = this.field1769;
        var1.field1750 = this.field1750;
        var1.field1758 = this.field1758;
        var1.field1746 = this.field1746;
        var1.field1755 = this.field1755;
        var1.field1764 = this.field1764;
        var1.field1763 = this.field1763;
        var1.field1739 = this.field1739;
        var1.field1775 = this.field1775;
        var1.field1735 = this.field1735;
        var1.field1771 = this.field1771;
        var1.field1744 = this.field1744;
        var1.field1780 = this.field1780;
        var1.field1768 = this.field1768;
        var1.field1759 = this.field1759;
        var1.field1732 = this.field1732;
        var1.field1760 = this.field1760;
        var1.field1742 = this.field1742;
        var1.field1776 = this.field1776;
        var1.field1747 = this.field1747;
        var1.field1756 = this.field1756;
        var1.field1752 = this.field1752;
        var1.field1743 = this.field1743;
        var1.field1753 = this.field1753;
        var1.field1781 = this.field1781;
        var1.field1733 = this.field1733;
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lwf;II)Lvi;", line = 1555)
    public static final class114 method782(class306 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2103(0, arg1, arg2);
        return var3 == null ? null : new class114(var3);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(SS)V", line = 1567)
    public final void method783(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1761; var3++) {
            if (this.field1746[var3] == arg0) {
                this.field1746[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "()V", line = 1584)
    public static void method784() {
        field1762 = null;
        field1736 = null;
        field1774 = null;
        field1745 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()I", line = 1593)
    public final int method112() {
        if (!this.field1737) {
            this.method774();
        }
        return this.field1740;
    }

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "()V", line = 1599)
    public final void method785() {
        int var10002;
        if (this.field1776 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1782; var3++) {
                int var4 = this.field1776[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1756 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1756[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1782) {
                int var7 = this.field1776[var6];
                this.field1756[var7][var1[var7]++] = var6++;
            }
            this.field1776 = null;
        }
        if (this.field1747 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1761; var10++) {
            int var11 = this.field1747[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1752 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1752[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1761) {
            int var14 = this.field1747[var13];
            this.field1752[var14][var8[var14]++] = var13++;
        }
        this.field1747 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIBSB)I", line = 1691)
    public final int method786(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field1738[this.field1761] = arg0;
        this.field1749[this.field1761] = arg1;
        this.field1777[this.field1761] = arg2;
        this.field1783[this.field1761] = arg3;
        this.field1758[this.field1761] = -1;
        this.field1746[this.field1761] = arg4;
        this.field1755[this.field1761] = -1;
        this.field1750[this.field1761] = arg5;
        return this.field1761++;
    }

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "()V", line = 1706)
    public final void method787() {
        for (int var1 = 0; var1 < this.field1782; var1++) {
            this.field1754[var1] = -this.field1754[var1];
        }
        for (int var2 = 0; var2 < this.field1761; var2++) {
            int var3 = this.field1738[var2];
            this.field1738[var2] = this.field1777[var2];
            this.field1777[var2] = var3;
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()Z", line = 1735)
    public final boolean method643() {
        return true;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[[I[[IIIIZZ)Lvi;", line = 1742)
    public final class114 method788(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method774();
        int var10 = this.field1765 + arg4;
        int var11 = this.field1734 + arg4;
        int var12 = this.field1779 + arg6;
        int var13 = this.field1748 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class114 var18;
        if (arg7) {
            var18 = new class114();
            var18.field1782 = this.field1782;
            var18.field1766 = this.field1766;
            var18.field1761 = this.field1761;
            var18.field1772 = this.field1772;
            var18.field1738 = this.field1738;
            var18.field1749 = this.field1749;
            var18.field1777 = this.field1777;
            var18.field1783 = this.field1783;
            var18.field1769 = this.field1769;
            var18.field1750 = this.field1750;
            var18.field1758 = this.field1758;
            var18.field1746 = this.field1746;
            var18.field1755 = this.field1755;
            var18.field1764 = this.field1764;
            var18.field1763 = this.field1763;
            var18.field1739 = this.field1739;
            var18.field1775 = this.field1775;
            var18.field1735 = this.field1735;
            var18.field1771 = this.field1771;
            var18.field1744 = this.field1744;
            var18.field1780 = this.field1780;
            var18.field1768 = this.field1768;
            var18.field1759 = this.field1759;
            var18.field1732 = this.field1732;
            var18.field1760 = this.field1760;
            var18.field1742 = this.field1742;
            var18.field1776 = this.field1776;
            var18.field1747 = this.field1747;
            var18.field1756 = this.field1756;
            var18.field1752 = this.field1752;
            var18.field1781 = this.field1781;
            var18.field1733 = this.field1733;
            var18.field1743 = this.field1743;
            var18.field1753 = this.field1753;
            var18.field1778 = this.field1778;
            if (arg0 == 3) {
                var18.field1767 = class231.method1586(-24773, this.field1767);
                var18.field1757 = class231.method1586(-24773, this.field1757);
                var18.field1754 = class231.method1586(-24773, this.field1754);
            } else {
                var18.field1767 = this.field1767;
                var18.field1757 = new int[var18.field1782];
                var18.field1754 = this.field1754;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field1766; var19++) {
                int var20 = this.field1767[var19] + arg4;
                int var21 = this.field1754[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field1757[var19] = this.field1757[var19] + var28 - arg5;
            }
            for (int var29 = var18.field1766; var29 < var18.field1782; var29++) {
                int var30 = this.field1767[var29] + arg4;
                int var31 = this.field1754[var29] + arg6;
                int var32 = var30 & 0x7F;
                int var33 = var31 & 0x7F;
                int var34 = var30 >> 7;
                int var35 = var31 >> 7;
                if (var34 >= 0 && var34 < arg2.length - 1 && var35 >= 0 && var35 < arg2[0].length - 1) {
                    int var36 = (128 - var32) * arg2[var34][var35] + arg2[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg2[var34][var35 + 1] + arg2[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    var18.field1757[var29] = this.field1757[var29] + var38 - arg5;
                }
            }
        } else if (arg0 == 2) {
            for (int var39 = 0; var39 < var18.field1766; var39++) {
                int var40 = (this.field1757[var39] << 16) / this.field1740;
                if (var40 < arg1) {
                    int var41 = this.field1767[var39] + arg4;
                    int var42 = this.field1754[var39] + arg6;
                    int var43 = var41 & 0x7F;
                    int var44 = var42 & 0x7F;
                    int var45 = var41 >> 7;
                    int var46 = var42 >> 7;
                    int var47 = (128 - var43) * arg2[var45][var46] + arg2[var45 + 1][var46] * var43 >> 7;
                    int var48 = (128 - var43) * arg2[var45][var46 + 1] + arg2[var45 + 1][var46 + 1] * var43 >> 7;
                    int var49 = (128 - var44) * var47 + var44 * var48 >> 7;
                    var18.field1757[var39] = (arg1 - var40) * (var49 - arg5) / arg1 + this.field1757[var39];
                } else {
                    var18.field1757[var39] = this.field1757[var39];
                }
            }
            for (int var50 = var18.field1766; var50 < var18.field1782; var50++) {
                int var51 = (this.field1757[var50] << 16) / this.field1740;
                if (var51 < arg1) {
                    int var52 = this.field1767[var50] + arg4;
                    int var53 = this.field1754[var50] + arg6;
                    int var54 = var52 & 0x7F;
                    int var55 = var53 & 0x7F;
                    int var56 = var52 >> 7;
                    int var57 = var53 >> 7;
                    if (var56 >= 0 && var56 < arg2.length - 1 && var57 >= 0 && var57 < arg2[0].length - 1) {
                        int var58 = (128 - var54) * arg2[var56][var57] + arg2[var56 + 1][var57] * var54 >> 7;
                        int var59 = (128 - var54) * arg2[var56][var57 + 1] + arg2[var56 + 1][var57 + 1] * var54 >> 7;
                        int var60 = (128 - var55) * var58 + var55 * var59 >> 7;
                        var18.field1757[var50] = (arg1 - var51) * (var60 - arg5) / arg1 + this.field1757[var50];
                    }
                } else {
                    var18.field1757[var50] = this.field1757[var50];
                }
            }
        } else if (arg0 == 3) {
            int var61 = (arg1 & 0xFF) * 4;
            int var62 = (arg1 >> 8 & 0xFF) * 4;
            var18.method776(arg2, arg4, arg5, arg6, var61, var62);
        } else if (arg0 == 4) {
            int var63 = this.field1751 - this.field1740;
            for (int var64 = 0; var64 < this.field1766; var64++) {
                int var65 = this.field1767[var64] + arg4;
                int var66 = this.field1754[var64] + arg6;
                int var67 = var65 & 0x7F;
                int var68 = var66 & 0x7F;
                int var69 = var65 >> 7;
                int var70 = var66 >> 7;
                int var71 = (128 - var67) * arg3[var69][var70] + arg3[var69 + 1][var70] * var67 >> 7;
                int var72 = (128 - var67) * arg3[var69][var70 + 1] + arg3[var69 + 1][var70 + 1] * var67 >> 7;
                int var73 = (128 - var68) * var71 + var68 * var72 >> 7;
                var18.field1757[var64] = var73 + this.field1757[var64] + var63 - arg5;
            }
            for (int var74 = var18.field1766; var74 < var18.field1782; var74++) {
                int var75 = this.field1767[var74] + arg4;
                int var76 = this.field1754[var74] + arg6;
                int var77 = var75 & 0x7F;
                int var78 = var76 & 0x7F;
                int var79 = var75 >> 7;
                int var80 = var76 >> 7;
                if (var79 >= 0 && var79 < arg3.length - 1 && var80 >= 0 && var80 < arg3[0].length - 1) {
                    int var81 = (128 - var77) * arg3[var79][var80] + arg3[var79 + 1][var80] * var77 >> 7;
                    int var82 = (128 - var77) * arg3[var79][var80 + 1] + arg3[var79 + 1][var80 + 1] * var77 >> 7;
                    int var83 = (128 - var78) * var81 + var78 * var82 >> 7;
                    var18.field1757[var74] = var83 + this.field1757[var74] + var63 - arg5;
                }
            }
        } else if (arg0 == 5) {
            int var84 = this.field1751 - this.field1740;
            for (int var85 = 0; var85 < this.field1766; var85++) {
                int var86 = this.field1767[var85] + arg4;
                int var87 = this.field1754[var85] + arg6;
                int var88 = var86 & 0x7F;
                int var89 = var87 & 0x7F;
                int var90 = var86 >> 7;
                int var91 = var87 >> 7;
                int var92 = (128 - var88) * arg2[var90][var91] + arg2[var90 + 1][var91] * var88 >> 7;
                int var93 = (128 - var88) * arg2[var90][var91 + 1] + arg2[var90 + 1][var91 + 1] * var88 >> 7;
                int var94 = (128 - var89) * var92 + var89 * var93 >> 7;
                int var95 = (128 - var88) * arg3[var90][var91] + arg3[var90 + 1][var91] * var88 >> 7;
                int var96 = (128 - var88) * arg3[var90][var91 + 1] + arg3[var90 + 1][var91 + 1] * var88 >> 7;
                int var97 = (128 - var89) * var95 + var89 * var96 >> 7;
                int var98 = var94 - var97;
                var18.field1757[var85] = ((this.field1757[var85] << 8) / var84 * var98 >> 8) - (arg5 - var94);
            }
            for (int var99 = var18.field1766; var99 < var18.field1782; var99++) {
                int var100 = this.field1767[var99] + arg4;
                int var101 = this.field1754[var99] + arg6;
                int var102 = var100 & 0x7F;
                int var103 = var101 & 0x7F;
                int var104 = var100 >> 7;
                int var105 = var101 >> 7;
                if (var104 >= 0 && var104 < arg2.length - 1 && var104 < arg3.length - 1 && var105 >= 0 && var105 < arg2[0].length - 1 && var105 < arg3[0].length - 1) {
                    int var106 = (128 - var102) * arg2[var104][var105] + arg2[var104 + 1][var105] * var102 >> 7;
                    int var107 = (128 - var102) * arg2[var104][var105 + 1] + arg2[var104 + 1][var105 + 1] * var102 >> 7;
                    int var108 = (128 - var103) * var106 + var103 * var107 >> 7;
                    int var109 = (128 - var102) * arg3[var104][var105] + arg3[var104 + 1][var105] * var102 >> 7;
                    int var110 = (128 - var102) * arg3[var104][var105 + 1] + arg3[var104 + 1][var105 + 1] * var102 >> 7;
                    int var111 = (128 - var103) * var109 + var103 * var110 >> 7;
                    int var112 = var108 - var111;
                    var18.field1757[var99] = ((this.field1757[var99] << 8) / var84 * var112 >> 8) - (arg5 - var108);
                }
            }
        }
        if (arg8) {
            var18.method780();
        } else {
            this.field1737 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(III)V", line = 2149)
    public final void method789(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1782; var4++) {
            this.field1767[var4] += arg0;
            this.field1757[var4] += arg1;
            this.field1754[var4] += arg2;
        }
        this.method780();
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(III)I", line = 2168)
    public final int method790(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1782; var4++) {
            if (this.field1767[var4] == arg0 && this.field1757[var4] == arg1 && this.field1754[var4] == arg2) {
                return var4;
            }
        }
        this.field1767[this.field1782] = arg0;
        this.field1757[this.field1782] = arg1;
        this.field1754[this.field1782] = arg2;
        this.field1766 = ++this.field1782;
        return this.field1782 - 1;
    }
}
