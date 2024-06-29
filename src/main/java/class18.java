import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class18 {

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "Z")
    private boolean field278;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "[I")
    private static int[] field280 = new int[4];

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Lha;")
    private class116 field269;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "Lha;")
    private static class116 field282;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "Lha;")
    private static class116 field283;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "Lr;")
    private static class519 field276;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lqa;)V")
    private static final void method205(class167 arg0) {
        if (field283 != null) {
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
        field283 = arg0.method528(var2, 0, 128, 128, 128);
        field282 = arg0.method528(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "()V")
    public static void method206() {
        field276 = null;
        field282 = null;
        field283 = null;
        field280 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lqa;Lsaa;)V")
    private final void method207(class167 arg0, class18 arg1) {
        method215(arg0);
        method205(arg0);
        arg0.method640(field280);
        arg0.method615(0, 0, this.field270, this.field270);
        arg0.method142();
        arg0.method653(0, 0, this.field270, this.field270, this.field285 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field278) {
                var3 = -arg1.field271;
                var4 = -arg1.field279;
                var5 = -arg1.field268;
            } else {
                var3 = arg1.field271 - this.field271;
                var4 = arg1.field279 - this.field279;
                var5 = arg1.field268 - this.field268;
            }
        }
        if (this.field277 != 0) {
            int var6 = class285.field4154[this.field277];
            int var7 = class285.field4152[this.field277];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field284 != 0) {
            int var9 = class285.field4154[this.field284];
            int var10 = class285.field4152[this.field284];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class519 var12 = field276.method765((byte) 0, 51200, true);
        if (arg0.method629()) {
            var12.method1407((short) 0, (short) this.field281);
        } else {
            var12.method1387((short) 127, class525.field7309.method2387((byte) 127, this.field281).field8209);
            var12.method1407((short) 0, (short) -1);
        }
        arg0.method569(1.0F);
        arg0.method600(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field270 * 1024 / (var12.method1376() - var12.method1392());
        if (this.field285 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method519(this.field270 / 2, this.field270 / 2, var13, var13);
        arg0.method587(arg0.method623());
        class105 var14 = arg0.method623();
        var14.method884(0, 0, arg0.method537() - var12.method1378());
        var12.method1374(var14, null, 1024, 1);
        int var15 = this.field270 * 13 / 16;
        int var16 = (this.field270 - var15) / 2;
        field282.method664(var16, var16, var15, var15, 0, this.field285 | 0xFF000000, 1);
        this.field269 = arg0.method580(0, 0, this.field270, this.field270, true);
        arg0.method142();
        arg0.method653(0, 0, this.field270, this.field270, 0, 0);
        field283.method664(0, 0, this.field270, this.field270, 1, 0, 0);
        this.field269.method666(0, 0, 0);
        arg0.method615(field280[0], field280[1], field280[2], field280[3]);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method208(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field269 == null) {
            return;
        }
        int var8 = this.field277 - arg5 & 0x3FFF;
        int var9 = this.field284 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field275) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field275) / 2;
        if (var10 < arg4 && this.field275 + var10 > 0 && var11 < arg3 && this.field275 + var11 > 0) {
            this.field269.method959(arg1 + var11, arg2 + var10, this.field275, this.field275);
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(Lqa;Lsaa;)Z")
    public final boolean method209(class167 arg0, class18 arg1) {
        return this.field269 != null || this.method213(arg0, arg1);
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(Lqa;Lsaa;)V")
    private final void method210(class167 arg0, class18 arg1) {
        class560 var3 = class307.method1903((byte) 116, this.field281, 0, class416.field6129);
        if (var3 == null) {
            return;
        }
        arg0.method640(field280);
        arg0.method615(0, 0, this.field270, this.field270);
        arg0.method653(0, 0, this.field270, this.field270, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field278) {
                var4 = -arg1.field271;
                var5 = -arg1.field279;
                var6 = -arg1.field268;
            } else {
                var4 = this.field271 - arg1.field271;
                var5 = this.field279 - arg1.field279;
                var6 = this.field268 - arg1.field268;
            }
        }
        if (this.field277 != 0) {
            int var7 = -this.field277 & 0x3FFF;
            int var8 = class285.field4154[var7];
            int var9 = class285.field4152[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field284 != 0) {
            int var11 = -this.field284 & 0x3FFF;
            int var12 = class285.field4154[var11];
            int var13 = class285.field4152[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method569(1.0F);
        arg0.method600(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class519 var15 = arg0.method400(var3, 2048, 0, 64, 768);
        int var16 = var15.method1376() - var15.method1392();
        int var17 = var15.method1406() - var15.method1390();
        int var18 = var15.method1392() + var16 / 2;
        int var19 = var15.method1390() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method519(var18, var19, var20, var20);
        arg0.method587(arg0.method623());
        class105 var21 = arg0.method637();
        var21.method884(0, 0, arg0.method537() - var15.method1378());
        var15.method1374(var21, null, arg0.method537(), 1);
        this.field269 = arg0.method580(0, 0, this.field270, this.field270, true);
        this.field269.method666(0, 0, 3);
        arg0.method615(field280[0], field280[1], field280[2], field280[3]);
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "()V")
    public static final void method211() {
        field276 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII)Z")
    public final boolean method212(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field278) {
            this.field273 = 1073741823;
            var8 = this.field271;
            var9 = this.field279;
            var10 = this.field268;
        } else {
            int var5 = this.field271 - arg0;
            int var6 = this.field279 - arg1;
            int var7 = this.field268 - arg2;
            this.field273 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field273 == 0) {
                this.field273 = 1;
            }
            var8 = (var5 << 8) / this.field273;
            var9 = (var6 << 8) / this.field273;
            var10 = (var7 << 8) / this.field273;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field275 = this.field272 * arg3 / (this.field278 ? 1024 : this.field273);
        } else {
            this.field275 = 0;
        }
        if (this.field275 < 8) {
            this.field269 = null;
            return false;
        }
        int var12 = class243.method1546(-26367, this.field275);
        if (var12 > arg3) {
            var12 = class19.method216(arg3, (byte) -69);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field270 != var12) {
            this.field270 = var12;
        }
        this.field277 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field284 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field269 = null;
        return true;
    }

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "(Lqa;Lsaa;)Z")
    private final boolean method213(class167 arg0, class18 arg1) {
        if (this.field269 == null) {
            if (this.field274 == 0) {
                if (class525.field7309.method2389(-115, this.field281)) {
                    int[] var3 = class525.field7309.method2385(0.7F, this.field270, false, this.field281, true, this.field270);
                    this.field269 = arg0.method528(var3, 0, this.field270, this.field270, this.field270);
                }
            } else if (this.field274 == 2) {
                this.method210(arg0, arg1);
            } else if (this.field274 == 1) {
                this.method207(arg0, arg1);
            }
        }
        return this.field269 != null;
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "()V")
    public final void method214() {
        this.field269 = null;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(Lqa;)V")
    private static final void method215(class167 arg0) {
        if (field276 != null) {
            return;
        }
        class560 var1 = new class560(580, 1104, 1);
        var1.method3157((short) 1024, (short) 0, (byte) 0, (short) 32767, (byte) 0, (byte) 0, (short) 1024, (short) 0, 107, (short) 1024);
        var1.method3149(0, 0, (byte) 107, 128);
        var1.method3149(0, 0, (byte) 107, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class285.field4154[var3];
            int var5 = class285.field4152[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class285.field4152[var12] >> 8;
                int var14 = class285.field4154[var12] * var4 >> 23;
                int var15 = class285.field4154[var12] * var5 >> 23;
                var1.method3149(-var14, var15, (byte) 107, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3160((short) 0, (byte) 0, (short) 127, (byte) 0, 0, var8, var7, 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3160((short) 0, (byte) 0, (short) 127, (byte) 0, 0, var10, var7, var8, (byte) 0);
                    var1.method3160((short) 0, (byte) 0, (short) 127, (byte) 0, 0, var11, var7, var10, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3160((short) 0, (byte) 0, (short) 127, (byte) 0, 0, var8, 1, var7, (byte) 0);
            }
        }
        var1.field7942 = var1.field7938;
        var1.field7957 = null;
        var1.field7936 = null;
        var1.field7939 = null;
        field276 = arg0.method400(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field271 = arg2;
        this.field279 = arg3;
        this.field268 = arg4;
        this.field278 = arg7;
        this.field281 = arg1;
        this.field285 = arg6;
        this.field272 = arg5;
        this.field274 = arg0;
    }
}
