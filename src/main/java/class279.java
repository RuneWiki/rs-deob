import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class279 {

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field3910;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    private int field3914;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    private int field3903;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Z")
    private boolean field3904;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field3905;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    private int field3911;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    private int field3900;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "[I")
    private static int[] field3915 = new int[4];

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    private int field3901;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    private int field3902;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    private int field3907;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lba;")
    private static class352 field3909;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lxa;")
    private class461 field3908;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lxa;")
    private static class461 field3912;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lxa;")
    private static class461 field3916;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Loa;Lce;)V")
    private final void method1687(class638 arg0, class279 arg1) {
        method1690(arg0);
        method1688(arg0);
        arg0.method416(field3915);
        arg0.method442(0, 0, this.field3901, this.field3901);
        arg0.method344();
        arg0.method472(0, 0, this.field3901, this.field3901, this.field3911 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3904) {
                var3 = -arg1.field3910;
                var4 = -arg1.field3914;
                var5 = -arg1.field3903;
            } else {
                var3 = arg1.field3910 - this.field3910;
                var4 = arg1.field3914 - this.field3914;
                var5 = arg1.field3903 - this.field3903;
            }
        }
        if (this.field3917 != 0) {
            int var6 = class675.field9542[this.field3917];
            int var7 = class675.field9541[this.field3917];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field3907 != 0) {
            int var9 = class675.field9542[this.field3907];
            int var10 = class675.field9541[this.field3907];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class352 var12 = field3909.method235((byte) 0, 51200, true);
        if (arg0.method424()) {
            var12.method204((short) 0, (short) this.field3905);
        } else {
            var12.method213((short) 127, class570.field7665.method588(-26679, this.field3905).field3817);
            var12.method204((short) 0, (short) -1);
        }
        arg0.method465(1.0F);
        arg0.method450(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3901 * 1024 / (var12.method229() - var12.method214());
        if (this.field3911 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method404(this.field3901 / 2, this.field3901 / 2, var13, var13);
        arg0.method446(arg0.method459());
        class391 var14 = arg0.method459();
        var14.method1288(0, 0, arg0.method451() - var12.method219());
        var12.method199(var14, null, 1024, 1);
        int var15 = this.field3901 * 13 / 16;
        int var16 = (this.field3901 - var15) / 2;
        field3912.method35(var16, var16, var15, var15, 0, this.field3911 | 0xFF000000, 1);
        this.field3908 = arg0.method420(0, 0, this.field3901, this.field3901, true);
        arg0.method344();
        arg0.method472(0, 0, this.field3901, this.field3901, 0, 0);
        field3916.method35(0, 0, this.field3901, this.field3901, 1, 0, 0);
        this.field3908.method182(0, 0, 0);
        arg0.method442(field3915[0], field3915[1], field3915[2], field3915[3]);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Loa;)V")
    private static final void method1688(class638 arg0) {
        if (field3916 != null) {
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
        field3916 = arg0.method452(var2, 0, 128, 128, 128);
        field3912 = arg0.method452(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Loa;Lce;)V")
    private final void method1689(class638 arg0, class279 arg1) {
        class661 var3 = class383.method2210(false, 0, class423.field5965, this.field3905);
        if (var3 == null) {
            return;
        }
        arg0.method416(field3915);
        arg0.method442(0, 0, this.field3901, this.field3901);
        arg0.method472(0, 0, this.field3901, this.field3901, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3904) {
                var4 = -arg1.field3910;
                var5 = -arg1.field3914;
                var6 = -arg1.field3903;
            } else {
                var4 = this.field3910 - arg1.field3910;
                var5 = this.field3914 - arg1.field3914;
                var6 = this.field3903 - arg1.field3903;
            }
        }
        if (this.field3917 != 0) {
            int var7 = -this.field3917 & 0x3FFF;
            int var8 = class675.field9542[var7];
            int var9 = class675.field9541[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field3907 != 0) {
            int var11 = -this.field3907 & 0x3FFF;
            int var12 = class675.field9542[var11];
            int var13 = class675.field9541[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method465(1.0F);
        arg0.method450(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class352 var15 = arg0.method379(var3, 2048, 0, 64, 768);
        int var16 = var15.method229() - var15.method214();
        int var17 = var15.method239() - var15.method220();
        int var18 = var15.method214() + var16 / 2;
        int var19 = var15.method220() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method404(var18, var19, var20, var20);
        arg0.method446(arg0.method459());
        class391 var21 = arg0.method401();
        var21.method1288(0, 0, arg0.method451() - var15.method219());
        var15.method199(var21, null, arg0.method451(), 1);
        this.field3908 = arg0.method420(0, 0, this.field3901, this.field3901, true);
        this.field3908.method182(0, 0, 3);
        arg0.method442(field3915[0], field3915[1], field3915[2], field3915[3]);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Loa;)V")
    private static final void method1690(class638 arg0) {
        if (field3909 != null) {
            return;
        }
        class661 var1 = new class661(580, 1104, 1);
        var1.method3654((byte) 0, (short) 1024, (short) 0, 14300, (short) 1024, (short) 32767, (byte) 0, (short) 1024, (short) 0, (byte) 0);
        var1.method3656(0, 128, 0, -25336);
        var1.method3656(0, -128, 0, -25336);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class675.field9542[var3];
            int var5 = class675.field9541[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class675.field9541[var12] >> 7;
                int var14 = class675.field9542[var12] * var4 >> 21;
                int var15 = class675.field9542[var12] * var5 >> 21;
                var1.method3656(-var14, var13, var15, -25336);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3668((byte) 0, 0, (short) 127, var8, (short) 0, var7, 1, (byte) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3668((byte) 0, var8, (short) 127, var10, (short) 0, var7, 1, (byte) 0, (byte) 0);
                    var1.method3668((byte) 0, var10, (short) 127, var11, (short) 0, var7, 1, (byte) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3668((byte) 0, var7, (short) 127, var8, (short) 0, 1, 1, (byte) 0, (byte) 0);
            }
        }
        var1.field9318 = var1.field9291;
        var1.field9303 = null;
        var1.field9300 = null;
        var1.field9322 = null;
        field3909 = arg0.method379(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public static void method1691() {
        field3909 = null;
        field3912 = null;
        field3916 = null;
        field3915 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V")
    public static final void method1692() {
        field3909 = null;
        field3916 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)Z")
    public final boolean method1693(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3904) {
            this.field3906 = 1073741823;
            var8 = this.field3910;
            var9 = this.field3914;
            var10 = this.field3903;
        } else {
            int var5 = this.field3910 - arg0;
            int var6 = this.field3914 - arg1;
            int var7 = this.field3903 - arg2;
            this.field3906 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3906 == 0) {
                this.field3906 = 1;
            }
            var8 = (var5 << 8) / this.field3906;
            var9 = (var6 << 8) / this.field3906;
            var10 = (var7 << 8) / this.field3906;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3902 = this.field3900 * arg3 / (this.field3904 ? 1024 : this.field3906);
        } else {
            this.field3902 = 0;
        }
        if (this.field3902 < 8) {
            this.field3908 = null;
            return false;
        }
        int var12 = class350.method2082(126, this.field3902);
        if (var12 > arg3) {
            var12 = class694.method3810(arg3, 71828324);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3901 != var12) {
            this.field3901 = var12;
        }
        this.field3917 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field3907 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field3908 = null;
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(Loa;Lce;)Z")
    private final boolean method1694(class638 arg0, class279 arg1) {
        if (this.field3908 == null) {
            if (this.field3913 == 0) {
                if (class570.field7665.method590(this.field3905, (byte) -50)) {
                    int[] var3 = class570.field7665.method582(this.field3901, this.field3901, 23117, false, this.field3905, 0.7F);
                    this.field3908 = arg0.method452(var3, 0, this.field3901, this.field3901, this.field3901);
                }
            } else if (this.field3913 == 2) {
                this.method1689(arg0, arg1);
            } else if (this.field3913 == 1) {
                this.method1687(arg0, arg1);
            }
        }
        return this.field3908 != null;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(Loa;Lce;)Z")
    public final boolean method1695(class638 arg0, class279 arg1) {
        return this.field3908 != null || this.method1694(arg0, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
    public final void method1696() {
        this.field3908 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Loa;IIIIII)V")
    public final void method1697(class638 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3908 == null) {
            return;
        }
        int var8 = this.field3917 - arg5 & 0x3FFF;
        int var9 = this.field3907 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3902) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3902) / 2;
        if (var10 < arg4 && this.field3902 + var10 > 0 && var11 < arg3 && this.field3902 + var11 > 0) {
            this.field3908.method2659(arg1 + var11, arg2 + var10, this.field3902, this.field3902);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3910 = arg2;
        this.field3914 = arg3;
        this.field3903 = arg4;
        this.field3904 = arg7;
        this.field3905 = arg1;
        this.field3911 = arg6;
        this.field3900 = arg5;
        this.field3913 = arg0;
    }
}
