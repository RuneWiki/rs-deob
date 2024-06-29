import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class564 {

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    private int field7832;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    private int field7825;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    private int field7821;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Z")
    private boolean field7834;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    private int field7824;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    private int field7838;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    private int field7831;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    private int field7836;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "[I")
    private static int[] field7823 = new int[4];

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    private int field7822;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    private int field7826;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    private int field7829;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public int field7830;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    private int field7833;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Lka;")
    private static class284 field7827;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lfd;")
    private static class298 field7828;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Lfd;")
    private class298 field7835;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "Lfd;")
    private static class298 field7837;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lha;Lcm;)Z")
    private final boolean method3308(class548 arg0, class564 arg1) {
        if (this.field7835 == null) {
            if (this.field7836 == 0) {
                if (class391.field5627.method517(this.field7824, true)) {
                    int[] var3 = class391.field5627.method520(this.field7833, (byte) 81, this.field7833, false, this.field7824, 0.7F);
                    this.field7835 = arg0.method3244(this.field7833, var3, (byte) -105, this.field7833, 0, this.field7833);
                }
            } else if (this.field7836 == 2) {
                this.method3310(arg0, arg1);
            } else if (this.field7836 == 1) {
                this.method3317(arg0, arg1);
            }
        }
        return this.field7835 != null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V")
    public static final void method3309() {
        field7827 = null;
        field7828 = null;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lha;Lcm;)V")
    private final void method3310(class548 arg0, class564 arg1) {
        class133 var3 = class214.method1266(class102.field1405, 0, this.field7824, 0);
        if (var3 == null) {
            return;
        }
        arg0.method1454(field7823);
        arg0.method1544(0, 0, this.field7833, this.field7833);
        arg0.method1412(0, 0, this.field7833, this.field7833, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field7834) {
                var4 = -arg1.field7832;
                var5 = -arg1.field7825;
                var6 = -arg1.field7821;
            } else {
                var4 = this.field7832 - arg1.field7832;
                var5 = this.field7825 - arg1.field7825;
                var6 = this.field7821 - arg1.field7821;
            }
        }
        if (this.field7829 != 0) {
            int var7 = -this.field7829 & 0x3FFF;
            int var8 = class24.field312[var7];
            int var9 = class24.field308[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field7822 != 0) {
            int var11 = -this.field7822 & 0x3FFF;
            int var12 = class24.field312[var11];
            int var13 = class24.field308[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method1457(1.0F);
        arg0.method1498(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class284 var15 = arg0.method1463(var3, 2048, 0, 64, 768);
        int var16 = var15.method1655() - var15.method1678();
        int var17 = var15.method1681() - var15.method1668();
        int var18 = var15.method1678() + var16 / 2;
        int var19 = var15.method1668() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1421(var18, var19, var20, var20);
        arg0.method1444(arg0.method1495());
        class744 var21 = arg0.method1404();
        var21.method905(0, 0, arg0.method1426() - var15.method1693());
        var15.method1682(var21, null, arg0.method1426(), 1);
        this.field7835 = arg0.method1514(0, 0, this.field7833, this.field7833, true);
        this.field7835.method1014(0, 0, 3);
        arg0.method1544(field7823[0], field7823[1], field7823[2], field7823[3]);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lha;)V")
    private static final void method3311(class548 arg0) {
        if (field7828 != null) {
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
        field7828 = arg0.method3244(128, var2, (byte) -115, 128, 0, 128);
        field7837 = arg0.method3244(128, var1, (byte) -79, 128, 0, 128);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)Z")
    public final boolean method3312(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field7834) {
            this.field7830 = 1073741823;
            var8 = this.field7832;
            var9 = this.field7825;
            var10 = this.field7821;
        } else {
            int var5 = this.field7832 - arg0;
            int var6 = this.field7825 - arg1;
            int var7 = this.field7821 - arg2;
            this.field7830 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field7830 == 0) {
                this.field7830 = 1;
            }
            var8 = (var5 << 8) / this.field7830;
            var9 = (var6 << 8) / this.field7830;
            var10 = (var7 << 8) / this.field7830;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field7826 = this.field7831 * arg3 / (this.field7834 ? 1024 : this.field7830);
        } else {
            this.field7826 = 0;
        }
        if (this.field7826 < 8) {
            this.field7835 = null;
            return false;
        }
        int var12 = class606.method3450(this.field7826, (byte) -25);
        if (var12 > arg3) {
            var12 = class375.method2354(arg3, (byte) -106);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field7833 != var12) {
            this.field7833 = var12;
        }
        this.field7829 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field7822 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field7835 = null;
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()V")
    public final void method3313() {
        this.field7835 = null;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lha;)V")
    private static final void method3314(class548 arg0) {
        if (field7827 != null) {
            return;
        }
        class133 var1 = new class133(580, 1104, 1);
        var1.method831((short) 1024, (byte) 0, (short) 32767, (byte) 0, (short) 0, (short) 1024, -1, (byte) 0, (short) 1024, (short) 0);
        var1.method836(0, 0, (byte) -48, 128);
        var1.method836(0, 0, (byte) -48, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class24.field312[var3];
            int var5 = class24.field308[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class24.field308[var12] >> 7;
                int var14 = class24.field312[var12] * var4 >> 21;
                int var15 = class24.field312[var12] * var5 >> 21;
                var1.method836(-var14, var15, (byte) -48, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method840(-128, 0, (byte) 0, (short) 127, (byte) 0, var8, (byte) 0, (short) 0, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method840(-117, var8, (byte) 0, (short) 127, (byte) 0, var10, (byte) 0, (short) 0, var7);
                    var1.method840(-123, var10, (byte) 0, (short) 127, (byte) 0, var11, (byte) 0, (short) 0, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method840(-96, var7, (byte) 0, (short) 127, (byte) 0, var8, (byte) 0, (short) 0, 1);
            }
        }
        var1.field1852 = var1.field1903;
        var1.field1890 = null;
        var1.field1889 = null;
        var1.field1900 = null;
        field7827 = arg0.method1463(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()V")
    public static void method3315() {
        field7827 = null;
        field7837 = null;
        field7828 = null;
        field7823 = null;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(Lha;Lcm;)Z")
    public final boolean method3316(class548 arg0, class564 arg1) {
        return this.field7835 != null || this.method3308(arg0, arg1);
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(Lha;Lcm;)V")
    private final void method3317(class548 arg0, class564 arg1) {
        method3314(arg0);
        method3311(arg0);
        arg0.method1454(field7823);
        arg0.method1544(0, 0, this.field7833, this.field7833);
        arg0.method346();
        arg0.method1412(0, 0, this.field7833, this.field7833, this.field7838 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field7834) {
                var3 = -arg1.field7832;
                var4 = -arg1.field7825;
                var5 = -arg1.field7821;
            } else {
                var3 = arg1.field7832 - this.field7832;
                var4 = arg1.field7825 - this.field7825;
                var5 = arg1.field7821 - this.field7821;
            }
        }
        if (this.field7829 != 0) {
            int var6 = class24.field312[this.field7829];
            int var7 = class24.field308[this.field7829];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field7822 != 0) {
            int var9 = class24.field312[this.field7822];
            int var10 = class24.field308[this.field7822];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class284 var12 = field7827.method1659((byte) 0, 51200, true);
        var12.method1665((short) 0, (short) this.field7824);
        arg0.method1457(1.0F);
        arg0.method1498(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field7833 * 1024 / (var12.method1655() - var12.method1678());
        if (this.field7838 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1421(this.field7833 / 2, this.field7833 / 2, var13, var13);
        arg0.method1444(arg0.method1495());
        class744 var14 = arg0.method1495();
        var14.method905(0, 0, arg0.method1426() - var12.method1693());
        var12.method1682(var14, null, 1024, 1);
        int var15 = this.field7833 * 13 / 16;
        int var16 = (this.field7833 - var15) / 2;
        field7837.method1969(var16, var16, var15, var15, 0, this.field7838 | 0xFF000000, 1);
        this.field7835 = arg0.method1514(0, 0, this.field7833, this.field7833, true);
        arg0.method346();
        arg0.method1412(0, 0, this.field7833, this.field7833, 0, 0);
        field7828.method1969(0, 0, this.field7833, this.field7833, 1, 0, 0);
        this.field7835.method1014(0, 0, 0);
        arg0.method1544(field7823[0], field7823[1], field7823[2], field7823[3]);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method3318(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field7835 == null) {
            return;
        }
        int var8 = this.field7829 - arg5 & 0x3FFF;
        int var9 = this.field7822 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field7826) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field7826) / 2;
        if (var10 < arg4 && this.field7826 + var10 > 0 && var11 < arg3 && this.field7826 + var11 > 0) {
            this.field7835.method1959(arg1 + var11, arg2 + var10, this.field7826, this.field7826);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field7832 = arg2;
        this.field7825 = arg3;
        this.field7821 = arg4;
        this.field7834 = arg7;
        this.field7824 = arg1;
        this.field7838 = arg6;
        this.field7831 = arg5;
        this.field7836 = arg0;
    }
}
