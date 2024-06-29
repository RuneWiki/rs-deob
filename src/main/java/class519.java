import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class519 {

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    private int field7279;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    private int field7278;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    private int field7284;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Z")
    private boolean field7271;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    private int field7276;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    private int field7272;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    private int field7277;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "[I")
    private static int[] field7275 = new int[4];

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    private int field7273;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    private int field7274;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    private int field7281;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    private int field7282;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public int field7286;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Lka;")
    private static class474 field7285;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Liea;")
    private static class481 field7280;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Liea;")
    private static class481 field7283;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "Liea;")
    private class481 field7287;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
    public final void method3009() {
        this.field7287 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lha;Ldn;)Z")
    private final boolean method3010(class60 arg0, class519 arg1) {
        if (this.field7287 == null) {
            if (this.field7288 == 0) {
                if (class313.field4094.method1071((byte) 118, this.field7276)) {
                    int[] var3 = class313.field4094.method1068(this.field7274, 0.7F, this.field7276, -22669, false, this.field7274);
                    this.field7287 = arg0.method435(this.field7274, 0, this.field7274, -118, var3, this.field7274);
                }
            } else if (this.field7288 == 2) {
                this.method3012(arg0, arg1);
            } else if (this.field7288 == 1) {
                this.method3011(arg0, arg1);
            }
        }
        return this.field7287 != null;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lha;Ldn;)V")
    private final void method3011(class60 arg0, class519 arg1) {
        method3018(arg0);
        method3016(arg0);
        arg0.method483(field7275);
        arg0.method534(0, 0, this.field7274, this.field7274);
        arg0.method512();
        arg0.method528(0, 0, this.field7274, this.field7274, this.field7272 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field7271) {
                var3 = -arg1.field7279;
                var4 = -arg1.field7278;
                var5 = -arg1.field7284;
            } else {
                var3 = arg1.field7279 - this.field7279;
                var4 = arg1.field7278 - this.field7278;
                var5 = arg1.field7284 - this.field7284;
            }
        }
        if (this.field7273 != 0) {
            int var6 = class16.field320[this.field7273];
            int var7 = class16.field322[this.field7273];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field7281 != 0) {
            int var9 = class16.field320[this.field7281];
            int var10 = class16.field322[this.field7281];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class474 var12 = field7285.method273((byte) 0, 51200, true);
        var12.method293((short) 0, (short) this.field7276);
        arg0.method511(1.0F);
        arg0.method548(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field7274 * 1024 / (var12.method285() - var12.method263());
        if (this.field7272 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method437(this.field7274 / 2, this.field7274 / 2, var13, var13);
        arg0.method505(arg0.method502());
        class631 var14 = arg0.method502();
        var14.method596(0, 0, arg0.method451() - var12.method269());
        var12.method255(var14, null, 1024, 1);
        int var15 = this.field7274 * 13 / 16;
        int var16 = (this.field7274 - var15) / 2;
        field7280.method2761(var16, var16, var15, var15, 0, this.field7272 | 0xFF000000, 1);
        this.field7287 = arg0.method527(0, 0, this.field7274, this.field7274, true);
        arg0.method512();
        arg0.method528(0, 0, this.field7274, this.field7274, 0, 0);
        field7283.method2761(0, 0, this.field7274, this.field7274, 1, 0, 0);
        this.field7287.method145(0, 0, 0);
        arg0.method534(field7275[0], field7275[1], field7275[2], field7275[3]);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(Lha;Ldn;)V")
    private final void method3012(class60 arg0, class519 arg1) {
        class714 var3 = class637.method3572(class510.field7192, this.field7276, 4, 0);
        if (var3 == null) {
            return;
        }
        arg0.method483(field7275);
        arg0.method534(0, 0, this.field7274, this.field7274);
        arg0.method528(0, 0, this.field7274, this.field7274, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field7271) {
                var4 = -arg1.field7279;
                var5 = -arg1.field7278;
                var6 = -arg1.field7284;
            } else {
                var4 = this.field7279 - arg1.field7279;
                var5 = this.field7278 - arg1.field7278;
                var6 = this.field7284 - arg1.field7284;
            }
        }
        if (this.field7273 != 0) {
            int var7 = -this.field7273 & 0x3FFF;
            int var8 = class16.field320[var7];
            int var9 = class16.field322[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field7281 != 0) {
            int var11 = -this.field7281 & 0x3FFF;
            int var12 = class16.field320[var11];
            int var13 = class16.field322[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method511(1.0F);
        arg0.method548(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class474 var15 = arg0.method540(var3, 2048, 0, 64, 768);
        int var16 = var15.method285() - var15.method263();
        int var17 = var15.method280() - var15.method286();
        int var18 = var15.method263() + var16 / 2;
        int var19 = var15.method286() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method437(var18, var19, var20, var20);
        arg0.method505(arg0.method502());
        class631 var21 = arg0.method531();
        var21.method596(0, 0, arg0.method451() - var15.method269());
        var15.method255(var21, null, arg0.method451(), 1);
        this.field7287 = arg0.method527(0, 0, this.field7274, this.field7274, true);
        this.field7287.method145(0, 0, 3);
        arg0.method534(field7275[0], field7275[1], field7275[2], field7275[3]);
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(Lha;Ldn;)Z")
    public final boolean method3013(class60 arg0, class519 arg1) {
        return this.field7287 != null || this.method3010(arg0, arg1);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "()V")
    public static void method3014() {
        field7285 = null;
        field7280 = null;
        field7283 = null;
        field7275 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method3015(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field7287 == null) {
            return;
        }
        int var8 = this.field7273 - arg5 & 0x3FFF;
        int var9 = this.field7281 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field7282) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field7282) / 2;
        if (var10 < arg4 && this.field7282 + var10 > 0 && var11 < arg3 && this.field7282 + var11 > 0) {
            this.field7287.method2760(arg1 + var11, arg2 + var10, this.field7282, this.field7282);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lha;)V")
    private static final void method3016(class60 arg0) {
        if (field7283 != null) {
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
        field7283 = arg0.method435(128, 0, 128, -54, var2, 128);
        field7280 = arg0.method435(128, 0, 128, 120, var1, 128);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "()V")
    public static final void method3017() {
        field7285 = null;
        field7283 = null;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field7279 = arg2;
        this.field7278 = arg3;
        this.field7284 = arg4;
        this.field7271 = arg7;
        this.field7276 = arg1;
        this.field7272 = arg6;
        this.field7277 = arg5;
        this.field7288 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lha;)V")
    private static final void method3018(class60 arg0) {
        if (field7285 != null) {
            return;
        }
        class714 var1 = new class714(580, 1104, 1);
        var1.method3991((short) 0, false, (byte) 0, (short) 32767, (short) 1024, (byte) 0, (short) 1024, (short) 0, (short) 1024, (byte) 0);
        var1.method3995(128, 63, 0, 0);
        var1.method3995(-128, 127, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class16.field320[var3];
            int var5 = class16.field322[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class16.field322[var12] >> 7;
                int var14 = class16.field320[var12] * var4 >> 21;
                int var15 = class16.field320[var12] * var5 >> 21;
                var1.method3995(var13, 60, var15, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3994((short) 0, var7, (byte) 0, (byte) 0, 0, var8, (byte) 0, -23, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3994((short) 0, var7, (byte) 0, (byte) 0, var8, var10, (byte) 0, 125, (short) 127);
                    var1.method3994((short) 0, var7, (byte) 0, (byte) 0, var10, var11, (byte) 0, 127, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3994((short) 0, 1, (byte) 0, (byte) 0, var7, var8, (byte) 0, -121, (short) 127);
            }
        }
        var1.field9935 = var1.field9948;
        var1.field9958 = null;
        var1.field9918 = null;
        var1.field9937 = null;
        field7285 = arg0.method540(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)Z")
    public final boolean method3019(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field7271) {
            this.field7286 = 1073741823;
            var8 = this.field7279;
            var9 = this.field7278;
            var10 = this.field7284;
        } else {
            int var5 = this.field7279 - arg0;
            int var6 = this.field7278 - arg1;
            int var7 = this.field7284 - arg2;
            this.field7286 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field7286 == 0) {
                this.field7286 = 1;
            }
            var8 = (var5 << 8) / this.field7286;
            var9 = (var6 << 8) / this.field7286;
            var10 = (var7 << 8) / this.field7286;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field7282 = this.field7277 * arg3 / (this.field7271 ? 1024 : this.field7286);
        } else {
            this.field7282 = 0;
        }
        if (this.field7282 < 8) {
            this.field7287 = null;
            return false;
        }
        int var12 = class565.method3253(101, this.field7282);
        if (var12 > arg3) {
            var12 = class113.method890(arg3, 2094889633);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field7274 != var12) {
            this.field7274 = var12;
        }
        this.field7273 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field7281 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field7287 = null;
        return true;
    }
}
