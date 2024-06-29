import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class266 {

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    private int field3822;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Z")
    private boolean field3827;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    private int field3832;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    private int field3836;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "[I")
    private static int[] field3823 = new int[4];

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    private int field3829;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    private int field3835;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "Lc;")
    private static class121 field3839;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Lf;")
    private static class529 field3824;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Lf;")
    private class529 field3834;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "Lf;")
    private static class529 field3838;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "()V", line = 5)
    public static void method1705() {
        field3839 = null;
        field3838 = null;
        field3824 = null;
        field3823 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lqa;Llp;)Z", line = 15)
    private final boolean method1706(class162 arg0, class266 arg1) {
        if (this.field3834 == null) {
            if (this.field3837 == 0) {
                if (class405.field6073.method959(this.field3832, (byte) 94)) {
                    int[] var3 = class405.field6073.method957(false, this.field3832, this.field3826, 0.7F, this.field3826, 26878);
                    this.field3834 = arg0.method306(var3, 0, this.field3826, this.field3826, this.field3826);
                }
            } else if (this.field3837 == 2) {
                this.method1710(arg0, arg1);
            } else if (this.field3837 == 1) {
                this.method1713(arg0, arg1);
            }
        }
        return this.field3834 != null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lqa;)V", line = 50)
    private static final void method1707(class162 arg0) {
        if (field3824 != null) {
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
        field3824 = arg0.method306(var2, 0, 128, 128, 128);
        field3838 = arg0.method306(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "()V", line = 118)
    public static final void method1708() {
        field3839 = null;
        field3824 = null;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lqa;Llp;)Z", line = 123)
    public final boolean method1709(class162 arg0, class266 arg1) {
        return this.field3834 != null || this.method1706(arg0, arg1);
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(Lqa;Llp;)V", line = 131)
    private final void method1710(class162 arg0, class266 arg1) {
        class380 var3 = class410.method2492(0, true, class159.field2469, this.field3832);
        if (var3 == null) {
            return;
        }
        arg0.method251(field3823);
        arg0.method298(0, 0, this.field3826, this.field3826);
        arg0.method253(0, 0, this.field3826, this.field3826, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3827) {
                var4 = -arg1.field3822;
                var5 = -arg1.field3830;
                var6 = -arg1.field3828;
            } else {
                var4 = this.field3822 - arg1.field3822;
                var5 = this.field3830 - arg1.field3830;
                var6 = this.field3828 - arg1.field3828;
            }
        }
        if (this.field3835 != 0) {
            int var7 = -this.field3835 & 0x3FFF;
            int var8 = class528.field7783[var7];
            int var9 = class528.field7786[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3829 != 0) {
            int var11 = -this.field3829 & 0x3FFF;
            int var12 = class528.field7783[var11];
            int var13 = class528.field7786[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method281(1.0F);
        arg0.method233(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class121 var15 = arg0.method265(var3, 2048, 0, 64, 768);
        int var16 = var15.method911() - var15.method907();
        int var17 = var15.method935() - var15.method930();
        int var18 = var15.method907() + var16 / 2;
        int var19 = var15.method930() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method230(var18, var19, var20, var20);
        arg0.method302(arg0.method231());
        class414 var21 = arg0.method240();
        var21.method868(0, 0, arg0.method200() - var15.method931());
        var15.method899(var21, null, arg0.method200(), 1);
        this.field3834 = arg0.method218(0, 0, this.field3826, this.field3826, true);
        this.field3834.method94(0, 0, 3);
        arg0.method298(field3823[0], field3823[1], field3823[2], field3823[3]);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)Z", line = 217)
    public final boolean method1711(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3827) {
            this.field3833 = 1073741823;
            var8 = this.field3822;
            var9 = this.field3830;
            var10 = this.field3828;
        } else {
            int var5 = this.field3822 - arg0;
            int var6 = this.field3830 - arg1;
            int var7 = this.field3828 - arg2;
            this.field3833 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3833 == 0) {
                this.field3833 = 1;
            }
            var8 = (var5 << 8) / this.field3833;
            var9 = (var6 << 8) / this.field3833;
            var10 = (var7 << 8) / this.field3833;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3825 = this.field3836 * arg3 / (this.field3827 ? 1024 : this.field3833);
        } else {
            this.field3825 = 0;
        }
        if (this.field3825 < 8) {
            this.field3834 = null;
            return false;
        }
        int var12 = class51.method464(1905326856, this.field3825);
        if (var12 > arg3) {
            var12 = class338.method2165(arg3, 1006);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3826 != var12) {
            this.field3826 = var12;
        }
        this.field3835 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3829 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3834 = null;
        return true;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "()V", line = 273)
    public final void method1712() {
        this.field3834 = null;
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(Lqa;Llp;)V", line = 278)
    private final void method1713(class162 arg0, class266 arg1) {
        method1714(arg0);
        method1707(arg0);
        arg0.method251(field3823);
        arg0.method298(0, 0, this.field3826, this.field3826);
        arg0.method291();
        arg0.method253(0, 0, this.field3826, this.field3826, this.field3831 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3827) {
                var3 = -arg1.field3822;
                var4 = -arg1.field3830;
                var5 = -arg1.field3828;
            } else {
                var3 = arg1.field3822 - this.field3822;
                var4 = arg1.field3830 - this.field3830;
                var5 = arg1.field3828 - this.field3828;
            }
        }
        if (this.field3835 != 0) {
            int var6 = class528.field7783[this.field3835];
            int var7 = class528.field7786[this.field3835];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3829 != 0) {
            int var9 = class528.field7783[this.field3829];
            int var10 = class528.field7786[this.field3829];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class121 var12 = field3839.method938((byte) 0, 51200, true);
        if (arg0.method202()) {
            var12.method933((short) 0, (short) this.field3832);
        } else {
            var12.method890((short) 127, class405.field6073.method956(-945, this.field3832).field1432);
            var12.method933((short) 0, (short) -1);
        }
        arg0.method281(1.0F);
        arg0.method233(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3826 * 1024 / (var12.method911() - var12.method907());
        if (this.field3831 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method230(this.field3826 / 2, this.field3826 / 2, var13, var13);
        arg0.method302(arg0.method231());
        class414 var14 = arg0.method231();
        var14.method868(0, 0, arg0.method200() - var12.method931());
        var12.method899(var14, null, 1024, 1);
        int var15 = this.field3826 * 13 / 16;
        int var16 = (this.field3826 - var15) / 2;
        field3838.method105(var16, var16, var15, var15, 0, this.field3831 | 0xFF000000, 1);
        this.field3834 = arg0.method218(0, 0, this.field3826, this.field3826, true);
        arg0.method291();
        arg0.method253(0, 0, this.field3826, this.field3826, 0, 0);
        field3824.method105(0, 0, this.field3826, this.field3826, 1, 0, 0);
        this.field3834.method94(0, 0, 0);
        arg0.method298(field3823[0], field3823[1], field3823[2], field3823[3]);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lqa;)V", line = 370)
    private static final void method1714(class162 arg0) {
        if (field3839 != null) {
            return;
        }
        class380 var1 = new class380(580, 1104, 1);
        var1.method2370((short) 0, (short) 0, (short) 32767, (byte) 0, (byte) 0, (short) 1024, (byte) 0, (short) 1024, -256, (short) 1024);
        var1.method2364(0, 128, 0, -90);
        var1.method2364(0, -128, 0, 59);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class528.field7783[var3];
            int var5 = class528.field7786[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class528.field7786[var12] >> 8;
                int var14 = class528.field7783[var12] * var4 >> 23;
                int var15 = class528.field7783[var12] * var5 >> 23;
                var1.method2364(var15, var13, -var14, 113);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2358(var7, (byte) 0, (short) 127, (byte) 0, 0, 126, (short) 0, var8, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2358(var7, (byte) 0, (short) 127, (byte) 0, var8, -93, (short) 0, var10, (byte) 0);
                    var1.method2358(var7, (byte) 0, (short) 127, (byte) 0, var10, -8, (short) 0, var11, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2358(1, (byte) 0, (short) 127, (byte) 0, var7, -101, (short) 0, var8, (byte) 0);
            }
        }
        var1.field5740 = var1.field5773;
        var1.field5756 = null;
        var1.field5734 = null;
        var1.field5755 = null;
        field3839 = arg0.method265(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 452)
    public class266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3822 = arg2;
        this.field3830 = arg3;
        this.field3828 = arg4;
        this.field3827 = arg7;
        this.field3832 = arg1;
        this.field3831 = arg6;
        this.field3836 = arg5;
        this.field3837 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lqa;IIIIII)V", line = 465)
    public final void method1715(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3834 == null) {
            return;
        }
        int var8 = this.field3835 - arg5 & 0x3FFF;
        int var9 = this.field3829 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3825) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3825) / 2;
        if (var10 < arg4 && this.field3825 + var10 > 0 && var11 < arg3 && this.field3825 + var11 > 0) {
            this.field3834.method3135(arg1 + var11, arg2 + var10, this.field3825, this.field3825);
        }
    }
}
