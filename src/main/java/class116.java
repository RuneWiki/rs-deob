import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class116 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field1736 = 500;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[I")
    private int[] field1739 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "[I")
    private int[] field1745 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    private int field1751 = 0;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    private int field1750 = 100;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public int field1752 = 0;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "[I")
    private int[] field1755 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    private static int[] field1744 = new int[32768];

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "[I")
    private static int[] field1754;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
    private static int[] field1741;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "[I")
    private static int[] field1756;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "[I")
    private static int[] field1758;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "[I")
    private static int[] field1757;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "[I")
    private static int[] field1759;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "[I")
    private static int[] field1760;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lle;")
    private class112 field1747;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lbf;")
    private class51 field1737;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lbf;")
    private class51 field1738;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lbf;")
    private class51 field1740;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Lbf;")
    private class51 field1742;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lbf;")
    private class51 field1743;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lbf;")
    private class51 field1746;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lbf;")
    private class51 field1748;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lbf;")
    private class51 field1749;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Lbf;")
    private class51 field1753;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lfj;)V", line = 11)
    public final void method732(class3 arg0) {
        this.field1740 = new class51();
        this.field1740.method391(arg0);
        this.field1737 = new class51();
        this.field1737.method391(arg0);
        int var2 = arg0.method64((byte) -117);
        if (var2 != 0) {
            arg0.field44--;
            this.field1743 = new class51();
            this.field1743.method391(arg0);
            this.field1753 = new class51();
            this.field1753.method391(arg0);
        }
        int var3 = arg0.method64((byte) 32);
        if (var3 != 0) {
            arg0.field44--;
            this.field1738 = new class51();
            this.field1738.method391(arg0);
            this.field1748 = new class51();
            this.field1748.method391(arg0);
        }
        int var4 = arg0.method64((byte) 10);
        if (var4 != 0) {
            arg0.field44--;
            this.field1742 = new class51();
            this.field1742.method391(arg0);
            this.field1746 = new class51();
            this.field1746.method391(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method75(-32768);
            if (var6 == 0) {
                break;
            }
            this.field1755[var5] = var6;
            this.field1739[var5] = arg0.method34(1658959877);
            this.field1745[var5] = arg0.method75(-32768);
        }
        this.field1751 = arg0.method75(-32768);
        this.field1750 = arg0.method75(-32768);
        this.field1736 = arg0.method63((byte) 1);
        this.field1752 = arg0.method63((byte) 1);
        this.field1747 = new class112();
        this.field1749 = new class51();
        this.field1747.method713(arg0, this.field1749);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 71)
    public static void method733() {
        field1741 = null;
        field1744 = null;
        field1754 = null;
        field1759 = null;
        field1757 = null;
        field1756 = null;
        field1758 = null;
        field1760 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I", line = 115)
    public final int[] method734(int arg0, int arg1) {
        class213.method1345(field1741, 0, arg0);
        if (arg1 < 10) {
            return field1741;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1740.method393();
        this.field1737.method393();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1743 != null) {
            this.field1743.method393();
            this.field1753.method393();
            var5 = (int) ((double) (this.field1743.field838 - this.field1743.field842) * 32.768D / var3);
            var6 = (int) ((double) this.field1743.field842 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1738 != null) {
            this.field1738.method393();
            this.field1748.method393();
            var8 = (int) ((double) (this.field1738.field838 - this.field1738.field842) * 32.768D / var3);
            var9 = (int) ((double) this.field1738.field842 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1755[var11] != 0) {
                field1759[var11] = 0;
                field1757[var11] = (int) ((double) this.field1745[var11] * var3);
                field1756[var11] = (this.field1755[var11] << 14) / 100;
                field1758[var11] = (int) ((double) (this.field1740.field838 - this.field1740.field842) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1739[var11]) / var3);
                field1760[var11] = (int) ((double) this.field1740.field842 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1740.method394(arg0);
            int var14 = this.field1737.method394(arg0);
            if (this.field1743 != null) {
                int var15 = this.field1743.method394(arg0);
                int var16 = this.field1753.method394(arg0);
                var13 += this.method735(var7, var16, this.field1743.field843) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1738 != null) {
                int var17 = this.field1738.method394(arg0);
                int var18 = this.field1748.method394(arg0);
                var14 = var14 * ((this.method735(var10, var18, this.field1738.field843) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1755[var19] != 0) {
                    int var20 = field1757[var19] + var12;
                    if (var20 < arg0) {
                        field1741[var20] += this.method735(field1759[var19], field1756[var19] * var14 >> 15, this.field1740.field843);
                        field1759[var19] += (field1758[var19] * var13 >> 16) + field1760[var19];
                    }
                }
            }
        }
        if (this.field1742 != null) {
            this.field1742.method393();
            this.field1746.method393();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1742.method394(arg0);
                int var26 = this.field1746.method394(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1742.field838 - this.field1742.field842) * var25 >> 8) + this.field1742.field842;
                } else {
                    var27 = ((this.field1742.field838 - this.field1742.field842) * var26 >> 8) + this.field1742.field842;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1741[var24] = 0;
                }
            }
        }
        if (this.field1751 > 0 && this.field1750 > 0) {
            int var28 = (int) ((double) this.field1751 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1741[var29] += field1741[var29 - var28] * this.field1750 / 100;
            }
        }
        if (this.field1747.field1710[0] > 0 || this.field1747.field1710[1] > 0) {
            this.field1749.method393();
            int var30 = this.field1749.method394(arg0 + 1);
            int var31 = this.field1747.method718(0, (float) var30 / 65536.0F);
            int var32 = this.field1747.method718(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1741[var31 + var33] * (long) class112.field1712 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1741[var31 + var33 - var36 - 1] * (long) class112.field1713[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1741[var33 - var37 - 1] * (long) class112.field1713[1][var37] >> 16);
                    }
                    field1741[var33] = var35;
                    var30 = this.field1749.method394(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1741[var31 + var33] * (long) class112.field1712 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1741[var31 + var33 - var40 - 1] * (long) class112.field1713[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1741[var33 - var41 - 1] * (long) class112.field1713[1][var41] >> 16);
                        }
                        field1741[var33] = var39;
                        var30 = this.field1749.method394(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1741[var31 + var33 - var43 - 1] * (long) class112.field1713[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1741[var33 - var44 - 1] * (long) class112.field1713[1][var44] >> 16);
                            }
                            field1741[var33] = var42;
                            this.field1749.method394(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1747.method718(0, (float) var30 / 65536.0F);
                    var32 = this.field1747.method718(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1741[var46] < -32768) {
                field1741[var46] = -32768;
            }
            if (field1741[var46] > 32767) {
                field1741[var46] = 32767;
            }
        }
        return field1741;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1744[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1754 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1754[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1741 = new int[220500];
        field1756 = new int[5];
        field1758 = new int[5];
        field1757 = new int[5];
        field1759 = new int[5];
        field1760 = new int[5];
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I", line = 440)
    private final int method735(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1754[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1744[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
