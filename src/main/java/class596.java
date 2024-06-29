import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class596 {

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
    private int field7889;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    private int field7879;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    private int field7891;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "Z")
    private boolean field7883;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "I")
    private int field7890;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "I")
    private int field7892;

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
    private int field7888;

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "I")
    private int field7884;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "[I")
    private static int[] field7881 = new int[4];

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    private int field7875;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    private int field7877;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public int field7878;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    private int field7880;

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    private int field7882;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "Lba;")
    private static class358 field7876;

    @OriginalMember(owner = "client!tda", name = "k", descriptor = "Lxa;")
    private class468 field7885;

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "Lxa;")
    private static class468 field7886;

    @OriginalMember(owner = "client!tda", name = "m", descriptor = "Lxa;")
    private static class468 field7887;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)Z")
    public final boolean method3282(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field7883) {
            this.field7878 = 1073741823;
            var8 = this.field7889;
            var9 = this.field7879;
            var10 = this.field7891;
        } else {
            int var5 = this.field7889 - arg0;
            int var6 = this.field7879 - arg1;
            int var7 = this.field7891 - arg2;
            this.field7878 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field7878 == 0) {
                this.field7878 = 1;
            }
            var8 = (var5 << 8) / this.field7878;
            var9 = (var6 << 8) / this.field7878;
            var10 = (var7 << 8) / this.field7878;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field7882 = this.field7888 * arg3 / (this.field7883 ? 1024 : this.field7878);
        } else {
            this.field7882 = 0;
        }
        if (this.field7882 < 8) {
            this.field7885 = null;
            return false;
        }
        int var12 = class587.method3231(true, this.field7882);
        if (var12 > arg3) {
            var12 = class132.method996(arg3, -122);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field7877 != var12) {
            this.field7877 = var12;
        }
        this.field7875 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field7880 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field7885 = null;
        return true;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Loa;Ltda;)V")
    private final void method3283(class651 arg0, class596 arg1) {
        class545 var3 = class590.method3240(class72.field1129, this.field7890, 124, 0);
        if (var3 == null) {
            return;
        }
        arg0.method433(field7881);
        arg0.method421(0, 0, this.field7877, this.field7877);
        arg0.method415(0, 0, this.field7877, this.field7877, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field7883) {
                var4 = -arg1.field7889;
                var5 = -arg1.field7879;
                var6 = -arg1.field7891;
            } else {
                var4 = this.field7889 - arg1.field7889;
                var5 = this.field7879 - arg1.field7879;
                var6 = this.field7891 - arg1.field7891;
            }
        }
        if (this.field7875 != 0) {
            int var7 = -this.field7875 & 0x3FFF;
            int var8 = class126.field2116[var7];
            int var9 = class126.field2105[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field7880 != 0) {
            int var11 = -this.field7880 & 0x3FFF;
            int var12 = class126.field2116[var11];
            int var13 = class126.field2105[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method442(1.0F);
        arg0.method371(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class358 var15 = arg0.method443(var3, 2048, 0, 64, 768);
        int var16 = var15.method1936() - var15.method1951();
        int var17 = var15.method1952() - var15.method1939();
        int var18 = var15.method1951() + var16 / 2;
        int var19 = var15.method1939() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method373(var18, var19, var20, var20);
        arg0.method405(arg0.method466());
        class397 var21 = arg0.method455();
        var21.method576(0, 0, arg0.method464() - var15.method1935());
        var15.method1906(var21, null, arg0.method464(), 1);
        this.field7885 = arg0.method426(0, 0, this.field7877, this.field7877, true);
        this.field7885.method272(0, 0, 3);
        arg0.method421(field7881[0], field7881[1], field7881[2], field7881[3]);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "()V")
    public final void method3284() {
        this.field7885 = null;
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(Loa;Ltda;)V")
    private final void method3285(class651 arg0, class596 arg1) {
        method3291(arg0);
        method3290(arg0);
        arg0.method433(field7881);
        arg0.method421(0, 0, this.field7877, this.field7877);
        arg0.method38();
        arg0.method415(0, 0, this.field7877, this.field7877, this.field7892 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field7883) {
                var3 = -arg1.field7889;
                var4 = -arg1.field7879;
                var5 = -arg1.field7891;
            } else {
                var3 = arg1.field7889 - this.field7889;
                var4 = arg1.field7879 - this.field7879;
                var5 = arg1.field7891 - this.field7891;
            }
        }
        if (this.field7875 != 0) {
            int var6 = class126.field2116[this.field7875];
            int var7 = class126.field2105[this.field7875];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field7880 != 0) {
            int var9 = class126.field2116[this.field7880];
            int var10 = class126.field2105[this.field7880];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class358 var12 = field7876.method1519((byte) 0, 51200, true);
        if (arg0.method428()) {
            var12.method1937((short) 0, (short) this.field7890);
        } else {
            var12.method1929((short) 127, class508.field6776.method2760(this.field7890, 21351).field4920);
            var12.method1937((short) 0, (short) -1);
        }
        arg0.method442(1.0F);
        arg0.method371(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field7877 * 1024 / (var12.method1936() - var12.method1951());
        if (this.field7892 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method373(this.field7877 / 2, this.field7877 / 2, var13, var13);
        arg0.method405(arg0.method466());
        class397 var14 = arg0.method466();
        var14.method576(0, 0, arg0.method464() - var12.method1935());
        var12.method1906(var14, null, 1024, 1);
        int var15 = this.field7877 * 13 / 16;
        int var16 = (this.field7877 - var15) / 2;
        field7887.method274(var16, var16, var15, var15, 0, this.field7892 | 0xFF000000, 1);
        this.field7885 = arg0.method426(0, 0, this.field7877, this.field7877, true);
        arg0.method38();
        arg0.method415(0, 0, this.field7877, this.field7877, 0, 0);
        field7886.method274(0, 0, this.field7877, this.field7877, 1, 0, 0);
        this.field7885.method272(0, 0, 0);
        arg0.method421(field7881[0], field7881[1], field7881[2], field7881[3]);
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(Loa;Ltda;)Z")
    private final boolean method3286(class651 arg0, class596 arg1) {
        if (this.field7885 == null) {
            if (this.field7884 == 0) {
                if (class508.field6776.method2759(32700, this.field7890)) {
                    int[] var3 = class508.field6776.method2762(0.7F, this.field7877, false, this.field7890, 7814, this.field7877);
                    this.field7885 = arg0.method374(var3, 0, this.field7877, this.field7877, this.field7877);
                }
            } else if (this.field7884 == 2) {
                this.method3283(arg0, arg1);
            } else if (this.field7884 == 1) {
                this.method3285(arg0, arg1);
            }
        }
        return this.field7885 != null;
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(Loa;Ltda;)Z")
    public final boolean method3287(class651 arg0, class596 arg1) {
        return this.field7885 != null || this.method3286(arg0, arg1);
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "()V")
    public static final void method3288() {
        field7876 = null;
        field7886 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Loa;IIIIII)V")
    public final void method3289(class651 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field7885 == null) {
            return;
        }
        int var8 = this.field7875 - arg5 & 0x3FFF;
        int var9 = this.field7880 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field7882) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field7882) / 2;
        if (var10 < arg4 && this.field7882 + var10 > 0 && var11 < arg3 && this.field7882 + var11 > 0) {
            this.field7885.method2641(arg1 + var11, arg2 + var10, this.field7882, this.field7882);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Loa;)V")
    private static final void method3290(class651 arg0) {
        if (field7886 != null) {
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
        field7886 = arg0.method374(var2, 0, 128, 128, 128);
        field7887 = arg0.method374(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(Loa;)V")
    private static final void method3291(class651 arg0) {
        if (field7876 != null) {
            return;
        }
        class545 var1 = new class545(580, 1104, 1);
        var1.method3029(14918, (byte) 0, (short) 1024, (byte) 0, (short) 0, (short) 1024, (byte) 0, (short) 1024, (short) 0, (short) 32767);
        var1.method3019(0, 0, 0, 128);
        var1.method3019(0, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class126.field2116[var3];
            int var5 = class126.field2105[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class126.field2105[var12] >> 7;
                int var14 = class126.field2116[var12] * var4 >> 21;
                int var15 = class126.field2116[var12] * var5 >> 21;
                var1.method3019(0, -var14, var15, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3023((short) 0, var8, 0, var7, (byte) 0, (byte) 0, (byte) 0, 0, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3023((short) 0, var10, 0, var7, (byte) 0, (byte) 0, (byte) 0, var8, (short) 127);
                    var1.method3023((short) 0, var11, 0, var7, (byte) 0, (byte) 0, (byte) 0, var10, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3023((short) 0, var8, 0, 1, (byte) 0, (byte) 0, (byte) 0, var7, (short) 127);
            }
        }
        var1.field7255 = var1.field7230;
        var1.field7239 = null;
        var1.field7248 = null;
        var1.field7233 = null;
        field7876 = arg0.method443(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "()V")
    public static void method3292() {
        field7876 = null;
        field7887 = null;
        field7886 = null;
        field7881 = null;
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field7889 = arg2;
        this.field7879 = arg3;
        this.field7891 = arg4;
        this.field7883 = arg7;
        this.field7890 = arg1;
        this.field7892 = arg6;
        this.field7888 = arg5;
        this.field7884 = arg0;
    }
}
