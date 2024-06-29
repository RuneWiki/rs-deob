import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class216 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    private int field3074;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    private int field3063;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "Z")
    private boolean field3067;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    private int field3066;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    private int field3065;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    private int field3068;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
    private static int[] field3076 = new int[4];

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    private int field3060;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    private int field3062;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    private int field3073;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    private int field3075;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Le;")
    private static class285 field3064;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lo;")
    private static class359 field3061;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "Lo;")
    private static class359 field3069;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "Lo;")
    private class359 field3070;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V", line = 3)
    public static void method1353() {
        field3064 = null;
        field3061 = null;
        field3069 = null;
        field3076 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lza;Lbm;)Z", line = 9)
    public final boolean method1354(class295 arg0, class216 arg1) {
        return this.field3070 != null || this.method1358(arg0, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lza;Lbm;)V", line = 12)
    private final void method1355(class295 arg0, class216 arg1) {
        method1362(arg0);
        method1356(arg0);
        arg0.method495(field3076);
        arg0.method511(0, 0, this.field3075, this.field3075);
        arg0.method532();
        arg0.method508(0, 0, this.field3075, this.field3075, this.field3072 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3067) {
                var3 = -arg1.field3059;
                var4 = -arg1.field3074;
                var5 = -arg1.field3063;
            } else {
                var3 = arg1.field3059 - this.field3059;
                var4 = arg1.field3074 - this.field3074;
                var5 = arg1.field3063 - this.field3063;
            }
        }
        if (this.field3073 != 0) {
            int var6 = class51.field743[this.field3073];
            int var7 = class51.field731[this.field3073];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3060 != 0) {
            int var9 = class51.field743[this.field3060];
            int var10 = class51.field731[this.field3060];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class285 var12 = field3064.method697((byte) 0, 51200, true);
        if (arg0.method475()) {
            var12.method668((short) 0, (short) this.field3066);
        } else {
            var12.method667((short) 127, class423.field6147.method914(false, this.field3066).field3377);
            var12.method668((short) 0, (short) -1);
        }
        arg0.method554(1.0F);
        arg0.method534(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3075 * 1024 / (var12.method681() - var12.method700());
        if (this.field3072 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method471(this.field3075 / 2, this.field3075 / 2, var13, var13);
        arg0.method548(arg0.method489());
        class512 var14 = arg0.method489();
        var14.method955(0, 0, arg0.method520() - var12.method723());
        var12.method666(var14, null, 1024, 1);
        int var15 = this.field3075 * 13 / 16;
        int var16 = (this.field3075 - var15) / 2;
        field3061.method206(var16, var16, var15, var15, 0, this.field3072 | 0xFF000000, 1);
        this.field3070 = arg0.method565(0, 0, this.field3075, this.field3075, true);
        arg0.method532();
        arg0.method508(0, 0, this.field3075, this.field3075, 0, 0);
        field3069.method206(0, 0, this.field3075, this.field3075, 1, 0, 0);
        this.field3070.method201(0, 0, 0);
        arg0.method511(field3076[0], field3076[1], field3076[2], field3076[3]);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lza;)V", line = 105)
    private static final void method1356(class295 arg0) {
        if (field3069 != null) {
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
        field3069 = arg0.method510(var2, 0, 128, 128, 128);
        field3061 = arg0.method510(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lza;IIIIII)V", line = 168)
    public final void method1357(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3070 == null) {
            return;
        }
        int var8 = this.field3073 - arg5 & 0x3FFF;
        int var9 = this.field3060 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3062) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3062) / 2;
        if (var10 < arg4 && this.field3062 + var10 > 0 && var11 < arg3 && this.field3062 + var11 > 0) {
            this.field3070.method2140(arg1 + var11, arg2 + var10, this.field3062, this.field3062);
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(Lza;Lbm;)Z", line = 196)
    private final boolean method1358(class295 arg0, class216 arg1) {
        if (this.field3070 == null) {
            if (this.field3068 == 0) {
                if (class423.field6147.method918(this.field3066, 100)) {
                    int[] var3 = class423.field6147.method917(this.field3075, true, 0.7F, this.field3066, this.field3075, false);
                    this.field3070 = arg0.method510(var3, 0, this.field3075, this.field3075, this.field3075);
                }
            } else if (this.field3068 == 2) {
                this.method1363(arg0, arg1);
            } else if (this.field3068 == 1) {
                this.method1355(arg0, arg1);
            }
        }
        return this.field3070 != null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()V", line = 244)
    public static final void method1359() {
        field3064 = null;
        field3069 = null;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()V", line = 248)
    public final void method1360() {
        this.field3070 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)Z", line = 254)
    public final boolean method1361(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3067) {
            this.field3071 = 1073741823;
            var8 = this.field3059;
            var9 = this.field3074;
            var10 = this.field3063;
        } else {
            int var5 = this.field3059 - arg0;
            int var6 = this.field3074 - arg1;
            int var7 = this.field3063 - arg2;
            this.field3071 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3071 == 0) {
                this.field3071 = 1;
            }
            var8 = (var5 << 8) / this.field3071;
            var9 = (var6 << 8) / this.field3071;
            var10 = (var7 << 8) / this.field3071;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3062 = this.field3065 * arg3 / (this.field3067 ? 1024 : this.field3071);
        } else {
            this.field3062 = 0;
        }
        if (this.field3062 < 8) {
            this.field3070 = null;
            return false;
        }
        int var12 = class274.method1604(this.field3062, (byte) 108);
        if (var12 > arg3) {
            var12 = class166.method1158(true, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3075 != var12) {
            this.field3075 = var12;
        }
        this.field3073 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3060 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3070 = null;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lza;)V", line = 312)
    private static final void method1362(class295 arg0) {
        if (field3064 != null) {
            return;
        }
        class496 var1 = new class496(580, 1104, 1);
        var1.method2949((short) 0, (short) 0, (byte) 0, (short) 1024, (short) 32767, (byte) 0, (byte) 92, (byte) 0, (short) 1024, (short) 1024);
        var1.method2944(0, 0, 15687, 128);
        var1.method2944(0, 0, 15687, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class51.field743[var3];
            int var5 = class51.field731[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class51.field731[var12] >> 8;
                int var14 = class51.field743[var12] * var4 >> 23;
                int var15 = class51.field743[var12] * var5 >> 23;
                var1.method2944(-var14, var15, 15687, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2934((byte) 0, (short) 127, -126, (byte) 0, (byte) 0, 0, var8, (short) 0, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2934((byte) 0, (short) 127, -122, (byte) 0, (byte) 0, var8, var10, (short) 0, var7);
                    var1.method2934((byte) 0, (short) 127, -123, (byte) 0, (byte) 0, var10, var11, (short) 0, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2934((byte) 0, (short) 127, -127, (byte) 0, (byte) 0, var7, var8, (short) 0, 1);
            }
        }
        var1.field7228 = var1.field7234;
        var1.field7210 = null;
        var1.field7264 = null;
        var1.field7259 = null;
        field3064 = arg0.method501(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(Lza;Lbm;)V", line = 392)
    private final void method1363(class295 arg0, class216 arg1) {
        class496 var3 = class44.method299(class399.field5723, this.field3066, -6502, 0);
        if (var3 == null) {
            return;
        }
        arg0.method495(field3076);
        arg0.method511(0, 0, this.field3075, this.field3075);
        arg0.method508(0, 0, this.field3075, this.field3075, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3067) {
                var4 = -arg1.field3059;
                var5 = -arg1.field3074;
                var6 = -arg1.field3063;
            } else {
                var4 = this.field3059 - arg1.field3059;
                var5 = this.field3074 - arg1.field3074;
                var6 = this.field3063 - arg1.field3063;
            }
        }
        if (this.field3073 != 0) {
            int var7 = -this.field3073 & 0x3FFF;
            int var8 = class51.field743[var7];
            int var9 = class51.field731[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3060 != 0) {
            int var11 = -this.field3060 & 0x3FFF;
            int var12 = class51.field743[var11];
            int var13 = class51.field731[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method554(1.0F);
        arg0.method534(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class285 var15 = arg0.method501(var3, 2048, 0, 64, 768);
        int var16 = var15.method681() - var15.method700();
        int var17 = var15.method691() - var15.method670();
        int var18 = var15.method700() + var16 / 2;
        int var19 = var15.method670() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method471(var18, var19, var20, var20);
        arg0.method548(arg0.method489());
        class512 var21 = arg0.method541();
        var21.method955(0, 0, arg0.method520() - var15.method723());
        var15.method666(var21, null, arg0.method520(), 1);
        this.field3070 = arg0.method565(0, 0, this.field3075, this.field3075, true);
        this.field3070.method201(0, 0, 3);
        arg0.method511(field3076[0], field3076[1], field3076[2], field3076[3]);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3059 = arg2;
        this.field3074 = arg3;
        this.field3063 = arg4;
        this.field3067 = arg7;
        this.field3066 = arg1;
        this.field3072 = arg6;
        this.field3065 = arg5;
        this.field3068 = arg0;
    }
}
