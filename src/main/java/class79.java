import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class79 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
    private int[] field1756 = new int[5];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    private int field1758 = 0;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    private int[] field1762 = new int[5];

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    private int field1754 = 100;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[I")
    private int[] field1757 = new int[5];

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field1753 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public int field1761 = 500;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
    private static int[] field1755 = new int[32768];

    @OriginalMember(owner = "client!le", name = "m", descriptor = "[I")
    private static int[] field1763;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
    private static int[] field1760;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
    private static int[] field1767;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "[I")
    private static int[] field1772;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "[I")
    private static int[] field1773;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "[I")
    private static int[] field1774;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[I")
    private static int[] field1775;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Lpc;")
    private class101 field1771;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lcc;")
    private class18 field1751;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lcc;")
    private class18 field1752;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lcc;")
    private class18 field1759;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lcc;")
    private class18 field1764;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lcc;")
    private class18 field1765;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lcc;")
    private class18 field1766;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lcc;")
    private class18 field1768;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Lcc;")
    private class18 field1769;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lcc;")
    private class18 field1770;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lqe;)V")
    public final void method580(class109 arg0) {
        this.field1769 = new class18();
        this.field1769.method163(arg0);
        this.field1759 = new class18();
        this.field1759.method163(arg0);
        int var2 = arg0.method838(255);
        if (var2 != 0) {
            arg0.field2583--;
            this.field1752 = new class18();
            this.field1752.method163(arg0);
            this.field1765 = new class18();
            this.field1765.method163(arg0);
        }
        int var3 = arg0.method838(255);
        if (var3 != 0) {
            arg0.field2583--;
            this.field1770 = new class18();
            this.field1770.method163(arg0);
            this.field1764 = new class18();
            this.field1764.method163(arg0);
        }
        int var4 = arg0.method838(255);
        if (var4 != 0) {
            arg0.field2583--;
            this.field1751 = new class18();
            this.field1751.method163(arg0);
            this.field1768 = new class18();
            this.field1768.method163(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method827(67);
            if (var6 == 0) {
                break;
            }
            this.field1762[var5] = var6;
            this.field1757[var5] = arg0.method830(true);
            this.field1756[var5] = arg0.method827(118);
        }
        this.field1758 = arg0.method827(122);
        this.field1754 = arg0.method827(88);
        this.field1761 = arg0.method835(2);
        this.field1753 = arg0.method835(2);
        this.field1771 = new class101();
        this.field1766 = new class18();
        this.field1771.method738(arg0, this.field1766);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[I")
    public final int[] method581(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1760[var3] = 0;
        }
        if (arg1 < 10) {
            return field1760;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1769.method162();
        this.field1759.method162();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1752 != null) {
            this.field1752.method162();
            this.field1765.method162();
            var6 = (int) ((double) (this.field1752.field379 - this.field1752.field382) * 32.768D / var4);
            var7 = (int) ((double) this.field1752.field382 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1770 != null) {
            this.field1770.method162();
            this.field1764.method162();
            var9 = (int) ((double) (this.field1770.field379 - this.field1770.field382) * 32.768D / var4);
            var10 = (int) ((double) this.field1770.field382 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1762[var12] != 0) {
                field1773[var12] = 0;
                field1772[var12] = (int) ((double) this.field1756[var12] * var4);
                field1774[var12] = (this.field1762[var12] << 14) / 100;
                field1767[var12] = (int) ((double) (this.field1769.field379 - this.field1769.field382) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1757[var12]) / var4);
                field1775[var12] = (int) ((double) this.field1769.field382 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field1769.method161(arg0);
            int var41 = this.field1759.method161(arg0);
            if (this.field1752 != null) {
                int var42 = this.field1752.method161(arg0);
                int var43 = this.field1765.method161(arg0);
                var40 += this.method582(var8, var43, this.field1752.field384) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field1770 != null) {
                int var44 = this.field1770.method161(arg0);
                int var45 = this.field1764.method161(arg0);
                var41 = var41 * ((this.method582(var11, var45, this.field1770.field384) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field1762[var46] != 0) {
                    int var47 = field1772[var46] + var13;
                    if (var47 < arg0) {
                        field1760[var47] += this.method582(field1773[var46], field1774[var46] * var41 >> 15, this.field1769.field384);
                        field1773[var46] += (field1767[var46] * var40 >> 16) + field1775[var46];
                    }
                }
            }
        }
        if (this.field1751 != null) {
            this.field1751.method162();
            this.field1768.method162();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1751.method161(arg0);
                int var19 = this.field1768.method161(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1751.field379 - this.field1751.field382) * var18 >> 8) + this.field1751.field382;
                } else {
                    var20 = ((this.field1751.field379 - this.field1751.field382) * var19 >> 8) + this.field1751.field382;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1760[var17] = 0;
                }
            }
        }
        if (this.field1758 > 0 && this.field1754 > 0) {
            int var21 = (int) ((double) this.field1758 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1760[var22] += field1760[var22 - var21] * this.field1754 / 100;
            }
        }
        if (this.field1771.field2353[0] > 0 || this.field1771.field2353[1] > 0) {
            this.field1766.method162();
            int var23 = this.field1766.method161(arg0 + 1);
            int var24 = this.field1771.method735(0, (float) var23 / 65536.0F);
            int var25 = this.field1771.method735(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field1760[var24 + var26] * (long) class101.field2350 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field1760[var24 + var26 - var37 - 1] * (long) class101.field2351[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field1760[var26 - var38 - 1] * (long) class101.field2351[1][var38] >> 16);
                    }
                    field1760[var26] = var36;
                    var23 = this.field1766.method161(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field1760[var24 + var26] * (long) class101.field2350 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field1760[var24 + var26 - var34 - 1] * (long) class101.field2351[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field1760[var26 - var35 - 1] * (long) class101.field2351[1][var35] >> 16);
                        }
                        field1760[var26] = var33;
                        var23 = this.field1766.method161(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field1760[var24 + var26 - var30 - 1] * (long) class101.field2351[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field1760[var26 - var31 - 1] * (long) class101.field2351[1][var31] >> 16);
                            }
                            field1760[var26] = var29;
                            this.field1766.method161(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1771.method735(0, (float) var23 / 65536.0F);
                    var25 = this.field1771.method735(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field1760[var39] < -32768) {
                field1760[var39] = -32768;
            }
            if (field1760[var39] > 32767) {
                field1760[var39] = 32767;
            }
        }
        return field1760;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
    private final int method582(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1763[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1755[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public static void method583() {
        field1760 = null;
        field1755 = null;
        field1763 = null;
        field1773 = null;
        field1772 = null;
        field1774 = null;
        field1767 = null;
        field1775 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1755[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1763 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1763[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1760 = new int[220500];
        field1767 = new int[5];
        field1772 = new int[5];
        field1773 = new int[5];
        field1774 = new int[5];
        field1775 = new int[5];
    }
}
