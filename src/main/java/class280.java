import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class280 {

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    private int field3971;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    private int field3961;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "Z")
    private boolean field3965;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    private int field3955;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    private int field3960;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    private int field3964;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "[I")
    private static int[] field3954 = new int[4];

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    private int field3963;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "Lbk;")
    private static class210 field3970;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Lgj;")
    private static class381 field3959;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Lgj;")
    private class381 field3966;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "Lgj;")
    private static class381 field3968;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "()V")
    public final void method1843() {
        this.field3966 = null;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "()V")
    public static void method1844() {
        field3970 = null;
        field3968 = null;
        field3959 = null;
        field3954 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lae;)V")
    private static final void method1845(class134 arg0) {
        if (field3970 != null) {
            return;
        }
        class160 var1 = new class160(580, 1104, 1);
        var1.method1022((byte) 0, (byte) 0, (byte) 0, (short) 0, true, (short) 1024, (short) 1024, (short) 1024, (short) 32767, (short) 0);
        var1.method1021(128, 0, 1, 0);
        var1.method1021(-128, 0, 1, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class158.field2055[var3];
            int var5 = class158.field2059[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class158.field2059[var12] >> 8;
                int var14 = class158.field2055[var12] * var4 >> 23;
                int var15 = class158.field2055[var12] * var5 >> 23;
                var1.method1021(var13, var15, 1, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1025(0, (short) 127, (byte) 0, (byte) 0, var8, (short) 0, var7, (byte) 0, true);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1025(var8, (short) 127, (byte) 0, (byte) 0, var10, (short) 0, var7, (byte) 0, true);
                    var1.method1025(var10, (short) 127, (byte) 0, (byte) 0, var11, (short) 0, var7, (byte) 0, true);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1025(var7, (short) 127, (byte) 0, (byte) 0, var8, (short) 0, 1, (byte) 0, true);
            }
        }
        var1.field2083 = var1.field2097;
        var1.field2080 = null;
        var1.field2093 = null;
        var1.field2091 = null;
        field3970 = arg0.method605(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lae;)V")
    private static final void method1846(class134 arg0) {
        if (field3959 != null) {
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
        field3959 = arg0.method610(var2, 0, 128, 128, 128);
        field3968 = arg0.method610(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lae;Lap;)V")
    private final void method1847(class134 arg0, class280 arg1) {
        class160 var3 = class248.method1690(class125.field1533, true, 0, this.field3955);
        if (var3 == null) {
            return;
        }
        arg0.method659(field3954);
        arg0.method660(0, 0, this.field3969, this.field3969);
        arg0.method653(0, 0, this.field3969, this.field3969, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3965) {
                var4 = -arg1.field3971;
                var5 = -arg1.field3957;
                var6 = -arg1.field3961;
            } else {
                var4 = this.field3971 - arg1.field3971;
                var5 = this.field3957 - arg1.field3957;
                var6 = this.field3961 - arg1.field3961;
            }
        }
        if (this.field3963 != 0) {
            int var7 = -this.field3963 & 0x3FFF;
            int var8 = class158.field2055[var7];
            int var9 = class158.field2059[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3958 != 0) {
            int var11 = -this.field3958 & 0x3FFF;
            int var12 = class158.field2055[var11];
            int var13 = class158.field2059[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method644(1.0F);
        arg0.method640(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class210 var15 = arg0.method605(var3, 1024, 0, 64, 768);
        int var16 = var15.method1415() - var15.method1422();
        int var17 = var15.method1400() - var15.method1405();
        int var18 = var15.method1422() + var16 / 2;
        int var19 = var15.method1405() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method652(var18, var19, var20, var20);
        arg0.method628(arg0.method639());
        class18 var21 = arg0.method649();
        var21.method116(0, 0, arg0.method629() - var15.method1395());
        var15.method1412(var21, (class136) null, arg0.method629(), 1);
        this.field3966 = arg0.method614(0, 0, this.field3969, this.field3969, true);
        this.field3966.method764(0, 0, 3);
        arg0.method660(field3954[0], field3954[1], field3954[2], field3954[3]);
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "()V")
    public static final void method1848() {
        field3970 = null;
        field3959 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)Z")
    public final boolean method1849(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3965) {
            this.field3956 = 1073741823;
            var8 = this.field3971;
            var9 = this.field3957;
            var10 = this.field3961;
        } else {
            int var5 = this.field3971 - arg0;
            int var6 = this.field3957 - arg1;
            int var7 = this.field3961 - arg2;
            this.field3956 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3956 == 0) {
                this.field3956 = 1;
            }
            var8 = (var5 << 8) / this.field3956;
            var9 = (var6 << 8) / this.field3956;
            var10 = (var7 << 8) / this.field3956;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3967 = this.field3960 * arg3 / (this.field3965 ? 1024 : this.field3956);
        } else {
            this.field3967 = 0;
        }
        if (this.field3967 < 8) {
            this.field3966 = null;
            return false;
        }
        int var12 = class328.method2123(this.field3967, 20867);
        if (var12 > arg3) {
            var12 = class292.method1933(-583426143, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3969 != var12) {
            this.field3969 = var12;
        }
        this.field3963 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3958 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3966 = null;
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lae;Lap;)V")
    private final void method1850(class134 arg0, class280 arg1) {
        method1845(arg0);
        method1846(arg0);
        arg0.method659(field3954);
        arg0.method660(0, 0, this.field3969, this.field3969);
        arg0.method600();
        arg0.method653(0, 0, this.field3969, this.field3969, this.field3962 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3965) {
                var3 = -arg1.field3971;
                var4 = -arg1.field3957;
                var5 = -arg1.field3961;
            } else {
                var3 = arg1.field3971 - this.field3971;
                var4 = arg1.field3957 - this.field3957;
                var5 = arg1.field3961 - this.field3961;
            }
        }
        if (this.field3963 != 0) {
            int var6 = class158.field2055[this.field3963];
            int var7 = class158.field2059[this.field3963];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3958 != 0) {
            int var9 = class158.field2055[this.field3958];
            int var10 = class158.field2059[this.field3958];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class210 var12 = field3970.method1411((byte) 0, 25600, true);
        if (arg0.method590()) {
            var12.method1376((short) 0, (short) this.field3955);
        } else {
            var12.method1392((short) 127, class347.field4909.method1329((byte) -75, this.field3955).field4778);
            var12.method1376((short) 0, (short) -1);
        }
        arg0.method644(1.0F);
        arg0.method640(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3969 * 1024 / (var12.method1415() - var12.method1422());
        if (this.field3962 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method652(this.field3969 / 2, this.field3969 / 2, var13, var13);
        arg0.method628(arg0.method639());
        class18 var14 = arg0.method639();
        var14.method116(0, 0, arg0.method629() - var12.method1395());
        var12.method1412(var14, (class136) null, 1024, 1);
        int var15 = this.field3969 * 13 / 16;
        int var16 = (this.field3969 - var15) / 2;
        field3968.method752(var16, var16, var15, var15, 1, this.field3962 | 0xFF000000, 1);
        this.field3966 = arg0.method614(0, 0, this.field3969, this.field3969, true);
        arg0.method600();
        arg0.method653(0, 0, this.field3969, this.field3969, 0, 0);
        field3959.method752(0, 0, this.field3969, this.field3969, 0, 0, 0);
        this.field3966.method764(0, 0, 0);
        arg0.method660(field3954[0], field3954[1], field3954[2], field3954[3]);
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(Lae;Lap;)Z")
    private final boolean method1851(class134 arg0, class280 arg1) {
        if (this.field3966 == null) {
            if (this.field3964 == 0) {
                if (class347.field4909.method1328((byte) 97, this.field3955)) {
                    int[] var3 = class347.field4909.method1324(false, this.field3955, this.field3969, 0.7F, 1580, this.field3969);
                    this.field3966 = arg0.method610(var3, 0, this.field3969, this.field3969, this.field3969);
                }
            } else if (this.field3964 == 2) {
                this.method1847(arg0, arg1);
            } else if (this.field3964 == 1) {
                this.method1850(arg0, arg1);
            }
        }
        return this.field3966 != null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lae;IIIIII)V")
    public final void method1852(class134 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3966 == null) {
            return;
        }
        int var8 = this.field3963 - arg5 & 0x3FFF;
        int var9 = this.field3958 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3967) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3967) / 2;
        if (var10 < arg4 && this.field3967 + var10 > 0 && var11 < arg3 && this.field3967 + var11 > 0) {
            this.field3966.method2452(arg1 + var11, arg2 + var10, this.field3967, this.field3967);
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(Lae;Lap;)Z")
    public final boolean method1853(class134 arg0, class280 arg1) {
        return this.field3966 != null || this.method1851(arg0, arg1);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3971 = arg2;
        this.field3957 = arg3;
        this.field3961 = arg4;
        this.field3965 = arg7;
        this.field3955 = arg1;
        this.field3962 = arg6;
        this.field3960 = arg5;
        this.field3964 = arg0;
    }
}
