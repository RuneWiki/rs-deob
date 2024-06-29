import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class280 {

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    private int field3829;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
    private boolean field3836;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    private int field3823;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    private int field3835;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
    private static int[] field3838 = new int[4];

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    private int field3824;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    private int field3833;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field3834;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Ll;")
    private static class16 field3822;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Ll;")
    private class16 field3826;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Ll;")
    private static class16 field3839;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lt;")
    private static class471 field3832;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)Z")
    public final boolean method1661(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3836) {
            this.field3834 = 1073741823;
            var8 = this.field3829;
            var9 = this.field3828;
            var10 = this.field3827;
        } else {
            int var5 = this.field3829 - arg0;
            int var6 = this.field3828 - arg1;
            int var7 = this.field3827 - arg2;
            this.field3834 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3834 == 0) {
                this.field3834 = 1;
            }
            var8 = (var5 << 8) / this.field3834;
            var9 = (var6 << 8) / this.field3834;
            var10 = (var7 << 8) / this.field3834;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3824 = this.field3831 * arg3 / (this.field3836 ? 1024 : this.field3834);
        } else {
            this.field3824 = 0;
        }
        if (this.field3824 < 8) {
            this.field3826 = null;
            return false;
        }
        int var12 = class508.method3034(this.field3824, true);
        if (var12 > arg3) {
            var12 = class498.method2905(arg3, (byte) -122);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3837 != var12) {
            this.field3837 = var12;
        }
        this.field3825 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3833 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3826 = null;
        return true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lya;IIIIII)V")
    public final void method1662(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3826 == null) {
            return;
        }
        int var8 = this.field3825 - arg5 & 0x3FFF;
        int var9 = this.field3833 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3824) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3824) / 2;
        if (var10 < arg4 && this.field3824 + var10 > 0 && var11 < arg3 && this.field3824 + var11 > 0) {
            this.field3826.method99(arg1 + var11, arg2 + var10, this.field3824, this.field3824);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
    public final void method1663() {
        this.field3826 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lya;Lwe;)V")
    private final void method1664(class38 arg0, class280 arg1) {
        method1671(arg0);
        method1665(arg0);
        arg0.method234(field3838);
        arg0.method279(0, 0, this.field3837, this.field3837);
        arg0.method322();
        arg0.method243(0, 0, this.field3837, this.field3837, this.field3830 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3836) {
                var3 = -arg1.field3829;
                var4 = -arg1.field3828;
                var5 = -arg1.field3827;
            } else {
                var3 = arg1.field3829 - this.field3829;
                var4 = arg1.field3828 - this.field3828;
                var5 = arg1.field3827 - this.field3827;
            }
        }
        if (this.field3825 != 0) {
            int var6 = class183.field2684[this.field3825];
            int var7 = class183.field2678[this.field3825];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3833 != 0) {
            int var9 = class183.field2684[this.field3833];
            int var10 = class183.field2678[this.field3833];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class471 var12 = field3832.method381((byte) 0, 51200, true);
        if (arg0.method249()) {
            var12.method400((short) 0, (short) this.field3823);
        } else {
            var12.method408((short) 127, class473.field6916.method1654(98, this.field3823).field2484);
            var12.method400((short) 0, (short) -1);
        }
        arg0.method252(1.0F);
        arg0.method232(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3837 * 1024 / (var12.method394() - var12.method368());
        if (this.field3830 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method296(this.field3837 / 2, this.field3837 / 2, var13, var13);
        arg0.method299(arg0.method310());
        class122 var14 = arg0.method310();
        var14.method182(0, 0, arg0.method224() - var12.method382());
        var12.method384(var14, null, 1024, 1);
        int var15 = this.field3837 * 13 / 16;
        int var16 = (this.field3837 - var15) / 2;
        field3822.method94(var16, var16, var15, var15, 0, this.field3830 | 0xFF000000, 1);
        this.field3826 = arg0.method275(0, 0, this.field3837, this.field3837, true);
        arg0.method322();
        arg0.method243(0, 0, this.field3837, this.field3837, 0, 0);
        field3839.method94(0, 0, this.field3837, this.field3837, 1, 0, 0);
        this.field3826.method89(0, 0, 0);
        arg0.method279(field3838[0], field3838[1], field3838[2], field3838[3]);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lya;)V")
    private static final void method1665(class38 arg0) {
        if (field3839 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field3839 = arg0.method244(var2, 0, 128, 128, 128);
        field3822 = arg0.method244(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V")
    public static final void method1666() {
        field3832 = null;
        field3839 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lya;Lwe;)Z")
    private final boolean method1667(class38 arg0, class280 arg1) {
        if (this.field3826 == null) {
            if (this.field3835 == 0) {
                if (class473.field6916.method1652(this.field3823, 29423)) {
                    int[] var3 = class473.field6916.method1651(this.field3837, (byte) -87, this.field3823, false, 0.7F, this.field3837);
                    this.field3826 = arg0.method244(var3, 0, this.field3837, this.field3837, this.field3837);
                }
            } else if (this.field3835 == 2) {
                this.method1669(arg0, arg1);
            } else if (this.field3835 == 1) {
                this.method1664(arg0, arg1);
            }
        }
        return this.field3826 != null;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()V")
    public static void method1668() {
        field3832 = null;
        field3822 = null;
        field3839 = null;
        field3838 = null;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(Lya;Lwe;)V")
    private final void method1669(class38 arg0, class280 arg1) {
        class419 var3 = class109.method798(class362.field5296, 0, this.field3823, -84);
        if (var3 == null) {
            return;
        }
        arg0.method234(field3838);
        arg0.method279(0, 0, this.field3837, this.field3837);
        arg0.method243(0, 0, this.field3837, this.field3837, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3836) {
                var4 = -arg1.field3829;
                var5 = -arg1.field3828;
                var6 = -arg1.field3827;
            } else {
                var4 = this.field3829 - arg1.field3829;
                var5 = this.field3828 - arg1.field3828;
                var6 = this.field3827 - arg1.field3827;
            }
        }
        if (this.field3825 != 0) {
            int var7 = -this.field3825 & 0x3FFF;
            int var8 = class183.field2684[var7];
            int var9 = class183.field2678[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3833 != 0) {
            int var11 = -this.field3833 & 0x3FFF;
            int var12 = class183.field2684[var11];
            int var13 = class183.field2678[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method252(1.0F);
        arg0.method232(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class471 var15 = arg0.method231(var3, 2048, 0, 64, 768);
        int var16 = var15.method394() - var15.method368();
        int var17 = var15.method395() - var15.method380();
        int var18 = var15.method368() + var16 / 2;
        int var19 = var15.method380() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method296(var18, var19, var20, var20);
        arg0.method299(arg0.method310());
        class122 var21 = arg0.method280();
        var21.method182(0, 0, arg0.method224() - var15.method382());
        var15.method384(var21, null, arg0.method224(), 1);
        this.field3826 = arg0.method275(0, 0, this.field3837, this.field3837, true);
        this.field3826.method89(0, 0, 3);
        arg0.method279(field3838[0], field3838[1], field3838[2], field3838[3]);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(Lya;Lwe;)Z")
    public final boolean method1670(class38 arg0, class280 arg1) {
        return this.field3826 != null || this.method1667(arg0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lya;)V")
    private static final void method1671(class38 arg0) {
        if (field3832 != null) {
            return;
        }
        class419 var1 = new class419(580, 1104, 1);
        var1.method2494((byte) 0, (byte) 0, (short) 0, (short) 32767, (short) 0, (short) 1024, 0, (short) 1024, (short) 1024, (byte) 0);
        var1.method2487(-32324, 0, 0, 128);
        var1.method2487(-32324, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class183.field2684[var3];
            int var5 = class183.field2678[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class183.field2678[var12] >> 8;
                int var14 = class183.field2684[var12] * var4 >> 23;
                int var15 = class183.field2684[var12] * var5 >> 23;
                var1.method2487(-32324, var15, -var14, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2486(var7, (short) 127, 1, (byte) 0, var8, (short) 0, (byte) 0, 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2486(var7, (short) 127, 1, (byte) 0, var10, (short) 0, (byte) 0, var8, (byte) 0);
                    var1.method2486(var7, (short) 127, 1, (byte) 0, var11, (short) 0, (byte) 0, var10, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2486(1, (short) 127, 1, (byte) 0, var8, (short) 0, (byte) 0, var7, (byte) 0);
            }
        }
        var1.field6096 = var1.field6084;
        var1.field6088 = null;
        var1.field6098 = null;
        var1.field6085 = null;
        field3832 = arg0.method231(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3829 = arg2;
        this.field3828 = arg3;
        this.field3827 = arg4;
        this.field3836 = arg7;
        this.field3823 = arg1;
        this.field3830 = arg6;
        this.field3831 = arg5;
        this.field3835 = arg0;
    }
}
