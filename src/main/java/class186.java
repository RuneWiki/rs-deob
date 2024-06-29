import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class186 {

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
    private int field2315;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    private int field2310;

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
    private int field2324;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "Z")
    private boolean field2314;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "I")
    private int field2323;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!cfa", name = "q", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "[I")
    private static int[] field2311 = new int[4];

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    private int field2312;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    private int field2322;

    @OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!cfa", name = "r", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "Lka;")
    private static class231 field2320;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "Lho;")
    private static class318 field2313;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "Lho;")
    private class318 field2319;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "Lho;")
    private static class318 field2321;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "()V")
    public static final void method1159() {
        field2320 = null;
        field2313 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method1160(class473 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2319 == null) {
            return;
        }
        int var8 = this.field2312 - arg5 & 0x3FFF;
        int var9 = this.field2325 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2317) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2317) / 2;
        if (var10 < arg4 && this.field2317 + var10 > 0 && var11 < arg3 && this.field2317 + var11 > 0) {
            this.field2319.method2033(arg1 + var11, arg2 + var10, this.field2317, this.field2317);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lha;Lcfa;)Z")
    public final boolean method1161(class473 arg0, class186 arg1) {
        return this.field2319 != null || this.method1168(arg0, arg1);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(Lha;Lcfa;)V")
    private final void method1162(class473 arg0, class186 arg1) {
        class534 var3 = class93.method674(this.field2318, 4, 0, class130.field1675);
        if (var3 == null) {
            return;
        }
        arg0.method160(field2311);
        arg0.method225(0, 0, this.field2322, this.field2322);
        arg0.method233(0, 0, this.field2322, this.field2322, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2314) {
                var4 = -arg1.field2315;
                var5 = -arg1.field2310;
                var6 = -arg1.field2324;
            } else {
                var4 = this.field2315 - arg1.field2315;
                var5 = this.field2310 - arg1.field2310;
                var6 = this.field2324 - arg1.field2324;
            }
        }
        if (this.field2312 != 0) {
            int var7 = -this.field2312 & 0x3FFF;
            int var8 = class448.field6265[var7];
            int var9 = class448.field6270[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field2325 != 0) {
            int var11 = -this.field2325 & 0x3FFF;
            int var12 = class448.field6265[var11];
            int var13 = class448.field6270[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method202(1.0F);
        arg0.method154(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class231 var15 = arg0.method231(var3, 2048, 0, 64, 768);
        int var16 = var15.method1583() - var15.method1544();
        int var17 = var15.method1567() - var15.method1576();
        int var18 = var15.method1544() + var16 / 2;
        int var19 = var15.method1576() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method242(var18, var19, var20, var20);
        arg0.method194(arg0.method159());
        class12 var21 = arg0.method153();
        var21.method50(0, 0, arg0.method241() - var15.method1566());
        var15.method1580(var21, null, arg0.method241(), 1);
        this.field2319 = arg0.method228(0, 0, this.field2322, this.field2322, true);
        this.field2319.method992(0, 0, 3);
        arg0.method225(field2311[0], field2311[1], field2311[2], field2311[3]);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "()V")
    public static void method1163() {
        field2320 = null;
        field2321 = null;
        field2313 = null;
        field2311 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII)Z")
    public final boolean method1164(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2314) {
            this.field2327 = 1073741823;
            var8 = this.field2315;
            var9 = this.field2310;
            var10 = this.field2324;
        } else {
            int var5 = this.field2315 - arg0;
            int var6 = this.field2310 - arg1;
            int var7 = this.field2324 - arg2;
            this.field2327 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2327 == 0) {
                this.field2327 = 1;
            }
            var8 = (var5 << 8) / this.field2327;
            var9 = (var6 << 8) / this.field2327;
            var10 = (var7 << 8) / this.field2327;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2317 = this.field2316 * arg3 / (this.field2314 ? 1024 : this.field2327);
        } else {
            this.field2317 = 0;
        }
        if (this.field2317 < 8) {
            this.field2319 = null;
            return false;
        }
        int var12 = class179.method1142(this.field2317, 75);
        if (var12 > arg3) {
            var12 = class47.method385(arg3, -1);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2322 != var12) {
            this.field2322 = var12;
        }
        this.field2312 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field2325 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field2319 = null;
        return true;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lha;)V")
    private static final void method1165(class473 arg0) {
        if (field2313 != null) {
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
        field2313 = arg0.method2815(var2, (byte) -39, 128, 128, 128, 0);
        field2321 = arg0.method2815(var1, (byte) -39, 128, 128, 128, 0);
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(Lha;Lcfa;)V")
    private final void method1166(class473 arg0, class186 arg1) {
        method1169(arg0);
        method1165(arg0);
        arg0.method160(field2311);
        arg0.method225(0, 0, this.field2322, this.field2322);
        arg0.method226();
        arg0.method233(0, 0, this.field2322, this.field2322, this.field2323 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2314) {
                var3 = -arg1.field2315;
                var4 = -arg1.field2310;
                var5 = -arg1.field2324;
            } else {
                var3 = arg1.field2315 - this.field2315;
                var4 = arg1.field2310 - this.field2310;
                var5 = arg1.field2324 - this.field2324;
            }
        }
        if (this.field2312 != 0) {
            int var6 = class448.field6265[this.field2312];
            int var7 = class448.field6270[this.field2312];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field2325 != 0) {
            int var9 = class448.field6265[this.field2325];
            int var10 = class448.field6270[this.field2325];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class231 var12 = field2320.method1584((byte) 0, 51200, true);
        var12.method1557((short) 0, (short) this.field2318);
        arg0.method202(1.0F);
        arg0.method154(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2322 * 1024 / (var12.method1583() - var12.method1544());
        if (this.field2323 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method242(this.field2322 / 2, this.field2322 / 2, var13, var13);
        arg0.method194(arg0.method159());
        class12 var14 = arg0.method159();
        var14.method50(0, 0, arg0.method241() - var12.method1566());
        var12.method1580(var14, null, 1024, 1);
        int var15 = this.field2322 * 13 / 16;
        int var16 = (this.field2322 - var15) / 2;
        field2321.method2028(var16, var16, var15, var15, 0, this.field2323 | 0xFF000000, 1);
        this.field2319 = arg0.method228(0, 0, this.field2322, this.field2322, true);
        arg0.method226();
        arg0.method233(0, 0, this.field2322, this.field2322, 0, 0);
        field2313.method2028(0, 0, this.field2322, this.field2322, 1, 0, 0);
        this.field2319.method992(0, 0, 0);
        arg0.method225(field2311[0], field2311[1], field2311[2], field2311[3]);
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "()V")
    public final void method1167() {
        this.field2319 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(Lha;Lcfa;)Z")
    private final boolean method1168(class473 arg0, class186 arg1) {
        if (this.field2319 == null) {
            if (this.field2326 == 0) {
                if (class785.field10772.method583(12101, this.field2318)) {
                    int[] var3 = class785.field10772.method579(this.field2318, 0.7F, false, 5084, this.field2322, this.field2322);
                    this.field2319 = arg0.method2815(var3, (byte) -39, this.field2322, this.field2322, this.field2322, 0);
                }
            } else if (this.field2326 == 2) {
                this.method1162(arg0, arg1);
            } else if (this.field2326 == 1) {
                this.method1166(arg0, arg1);
            }
        }
        return this.field2319 != null;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2315 = arg2;
        this.field2310 = arg3;
        this.field2324 = arg4;
        this.field2314 = arg7;
        this.field2318 = arg1;
        this.field2323 = arg6;
        this.field2316 = arg5;
        this.field2326 = arg0;
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(Lha;)V")
    private static final void method1169(class473 arg0) {
        if (field2320 != null) {
            return;
        }
        class534 var1 = new class534(580, 1104, 1);
        var1.method3162((short) 32767, (short) 0, (byte) 0, (short) 1024, (byte) 0, (byte) 0, (short) 0, (short) 1024, (byte) -70, (short) 1024);
        var1.method3163(128, 0, 0, false);
        var1.method3163(-128, 0, 0, false);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class448.field6265[var3];
            int var5 = class448.field6270[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class448.field6270[var12] >> 7;
                int var14 = class448.field6265[var12] * var4 >> 21;
                int var15 = class448.field6265[var12] * var5 >> 21;
                var1.method3163(var13, -var14, var15, false);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3164(6118, var7, 0, var8, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3164(6118, var7, var8, var10, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127);
                    var1.method3164(6118, var7, var10, var11, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3164(6118, 1, var7, var8, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127);
            }
        }
        var1.field7354 = var1.field7343;
        var1.field7388 = null;
        var1.field7365 = null;
        var1.field7349 = null;
        field2320 = arg0.method231(var1, 51200, 33, 64, 768);
    }
}
