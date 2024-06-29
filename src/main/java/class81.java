import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class81 {

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    private int field967;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "Z")
    private boolean field962;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "[I")
    private static int[] field966 = new int[4];

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "Lqh;")
    private static class352 field964;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lrg;")
    private static class395 field961;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lrg;")
    private static class395 field971;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "Lrg;")
    private class395 field975;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Loj;)V", line = 8)
    private static final void method404(class280 arg0) {
        if (field971 != null) {
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
        field971 = arg0.method1355(var2, 0, 128, 128, 128);
        field961 = arg0.method1355(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Loj;IIIIII)V", line = 75)
    public final void method405(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field975 == null) {
            return;
        }
        int var8 = this.field974 - arg5 & 0x3FFF;
        int var9 = this.field968 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field960) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field960) / 2;
        if (var10 < arg4 && this.field960 + var10 > 0 && var11 < arg3 && this.field960 + var11 > 0) {
            this.field975.method2364(arg1 + var11, arg2 + var10, this.field960, this.field960);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Loj;Llq;)Z", line = 103)
    public final boolean method406(class280 arg0, class81 arg1) {
        return this.field975 != null || this.method412(arg0, arg1);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)Z", line = 112)
    public final boolean method407(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field962) {
            this.field965 = 1073741823;
            var8 = this.field970;
            var9 = this.field967;
            var10 = this.field972;
        } else {
            int var5 = this.field970 - arg0;
            int var6 = this.field967 - arg1;
            int var7 = this.field972 - arg2;
            this.field965 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field965 == 0) {
                this.field965 = 1;
            }
            var8 = (var5 << 8) / this.field965;
            var9 = (var6 << 8) / this.field965;
            var10 = (var7 << 8) / this.field965;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field960 = this.field969 * arg3 / (this.field962 ? 1024 : this.field965);
        } else {
            this.field960 = 0;
        }
        if (this.field960 < 8) {
            this.field975 = null;
            return false;
        }
        int var12 = class93.method459(-719824240, this.field960);
        if (var12 > arg3) {
            var12 = class89.method446(-744346942, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field973 != var12) {
            this.field973 = var12;
        }
        this.field974 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field968 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field975 = null;
        return true;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "()V", line = 168)
    public static final void method408() {
        field964 = null;
        field971 = null;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Loj;Llq;)V", line = 172)
    private final void method409(class280 arg0, class81 arg1) {
        method413(arg0);
        method404(arg0);
        arg0.method1500(field966);
        arg0.method1351(0, 0, this.field973, this.field973);
        arg0.method1341();
        arg0.method1483(0, 0, this.field973, this.field973, this.field963 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field962) {
                var3 = -arg1.field970;
                var4 = -arg1.field967;
                var5 = -arg1.field972;
            } else {
                var3 = arg1.field970 - this.field970;
                var4 = arg1.field967 - this.field967;
                var5 = arg1.field972 - this.field972;
            }
        }
        if (this.field974 != 0) {
            int var6 = class16.field212[this.field974];
            int var7 = class16.field214[this.field974];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field968 != 0) {
            int var9 = class16.field212[this.field968];
            int var10 = class16.field214[this.field968];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class352 var12 = field964.method1749((byte) 0, 25600, true);
        if (arg0.method1386()) {
            var12.method1728((short) 0, (short) this.field959);
        } else {
            var12.method1747((short) 127, class128.field1585.method577(this.field959, -124).field2587);
            var12.method1728((short) 0, (short) -1);
        }
        arg0.method1388(1.0F);
        arg0.method1449(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field973 * 1024 / (var12.method1742() - var12.method1739());
        if (this.field963 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1468(this.field973 / 2, this.field973 / 2, var13, var13);
        arg0.method1404(arg0.method1344());
        class327 var14 = arg0.method1344();
        var14.method553(0, 0, arg0.method1470() - var12.method1741());
        var12.method1713(var14, (class465) null, 1024, 1);
        int var15 = this.field973 * 13 / 16;
        int var16 = (this.field973 - var15) / 2;
        field961.method225(var16, var16, var15, var15, 1, this.field963 | 0xFF000000, 1);
        this.field975 = arg0.method1461(0, 0, this.field973, this.field973, true);
        arg0.method1341();
        arg0.method1483(0, 0, this.field973, this.field973, 0, 0);
        field971.method225(0, 0, this.field973, this.field973, 0, 0, 0);
        this.field975.method1962(0, 0, 0);
        arg0.method1351(field966[0], field966[1], field966[2], field966[3]);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "()V", line = 268)
    public static void method410() {
        field964 = null;
        field961 = null;
        field971 = null;
        field966 = null;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "()V", line = 276)
    public final void method411() {
        this.field975 = null;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(Loj;Llq;)Z", line = 280)
    private final boolean method412(class280 arg0, class81 arg1) {
        if (this.field975 == null) {
            if (this.field958 == 0) {
                if (class128.field1585.method575(this.field959, (byte) 127)) {
                    int[] var3 = class128.field1585.method573(false, 55, this.field959, 0.7F, this.field973, this.field973);
                    this.field975 = arg0.method1355(var3, 0, this.field973, this.field973, this.field973);
                }
            } else if (this.field958 == 2) {
                this.method414(arg0, arg1);
            } else if (this.field958 == 1) {
                this.method409(arg0, arg1);
            }
        }
        return this.field975 != null;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Loj;)V", line = 316)
    private static final void method413(class280 arg0) {
        if (field964 != null) {
            return;
        }
        class10 var1 = new class10(580, 1104, 1);
        var1.method81((short) 0, (short) 1024, (byte) 0, (byte) 0, (byte) 0, (short) 0, (short) 1024, true, (short) 1024, (short) 32767);
        var1.method73(0, 0, 128, 0);
        var1.method73(0, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class16.field212[var3];
            int var5 = class16.field214[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class16.field214[var12] >> 8;
                int var14 = class16.field212[var12] * var4 >> 23;
                int var15 = class16.field212[var12] * var5 >> 23;
                var1.method73(0, var15, var13, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method71(-55, (byte) 0, 0, (byte) 0, (short) 0, var8, var7, (short) 127, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method71(119, (byte) 0, var8, (byte) 0, (short) 0, var10, var7, (short) 127, (byte) 0);
                    var1.method71(-64, (byte) 0, var10, (byte) 0, (short) 0, var11, var7, (short) 127, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method71(-94, (byte) 0, var7, (byte) 0, (short) 0, var8, 1, (short) 127, (byte) 0);
            }
        }
        var1.field131 = var1.field114;
        var1.field152 = null;
        var1.field155 = null;
        var1.field118 = null;
        field964 = arg0.method1346(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(Loj;Llq;)V", line = 397)
    private final void method414(class280 arg0, class81 arg1) {
        class10 var3 = class85.method430(0, class362.field5218, -87, this.field959);
        if (var3 == null) {
            return;
        }
        arg0.method1500(field966);
        arg0.method1351(0, 0, this.field973, this.field973);
        arg0.method1483(0, 0, this.field973, this.field973, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field962) {
                var4 = -arg1.field970;
                var5 = -arg1.field967;
                var6 = -arg1.field972;
            } else {
                var4 = this.field970 - arg1.field970;
                var5 = this.field967 - arg1.field967;
                var6 = this.field972 - arg1.field972;
            }
        }
        if (this.field974 != 0) {
            int var7 = -this.field974 & 0x3FFF;
            int var8 = class16.field212[var7];
            int var9 = class16.field214[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field968 != 0) {
            int var11 = -this.field968 & 0x3FFF;
            int var12 = class16.field212[var11];
            int var13 = class16.field214[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1388(1.0F);
        arg0.method1449(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class352 var15 = arg0.method1346(var3, 1024, 0, 64, 768);
        int var16 = var15.method1742() - var15.method1739();
        int var17 = var15.method1702() - var15.method1733();
        int var18 = var15.method1739() + var16 / 2;
        int var19 = var15.method1733() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1468(var18, var19, var20, var20);
        arg0.method1404(arg0.method1344());
        class327 var21 = arg0.method1456();
        var21.method553(0, 0, arg0.method1470() - var15.method1741());
        var15.method1713(var21, (class465) null, arg0.method1470(), 1);
        this.field975 = arg0.method1461(0, 0, this.field973, this.field973, true);
        this.field975.method1962(0, 0, 3);
        arg0.method1351(field966[0], field966[1], field966[2], field966[3]);
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field970 = arg2;
        this.field967 = arg3;
        this.field972 = arg4;
        this.field962 = arg7;
        this.field959 = arg1;
        this.field963 = arg6;
        this.field969 = arg5;
        this.field958 = arg0;
    }
}
