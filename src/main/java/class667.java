import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class667 {

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    private int field9285;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    private int field9277;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    private int field9284;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
    private boolean field9289;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    private int field9279;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    private int field9275;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    private int field9282;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    private int field9288;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "[I")
    private static int[] field9283 = new int[4];

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    private int field9273;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public int field9274;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    private int field9280;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    private int field9281;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    private int field9290;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lka;")
    private static class499 field9278;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "Lnf;")
    private class604 field9276;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "Lnf;")
    private static class604 field9286;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "Lnf;")
    private static class604 field9287;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIII)Z", line = 9)
    public final boolean method3769(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field9289) {
            this.field9274 = 1073741823;
            var8 = this.field9285;
            var9 = this.field9277;
            var10 = this.field9284;
        } else {
            int var5 = this.field9285 - arg0;
            int var6 = this.field9277 - arg1;
            int var7 = this.field9284 - arg2;
            this.field9274 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field9274 == 0) {
                this.field9274 = 1;
            }
            var8 = (var5 << 8) / this.field9274;
            var9 = (var6 << 8) / this.field9274;
            var10 = (var7 << 8) / this.field9274;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field9290 = this.field9282 * arg3 / (this.field9289 ? 1024 : this.field9274);
        } else {
            this.field9290 = 0;
        }
        if (this.field9290 < 8) {
            this.field9276 = null;
            return false;
        }
        int var12 = class241.method1609((byte) -99, this.field9290);
        if (var12 > arg3) {
            var12 = class484.method2765(arg3, 94);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field9281 != var12) {
            this.field9281 = var12;
        }
        this.field9280 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field9273 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field9276 = null;
        return true;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lha;Lav;)V", line = 73)
    private final void method3770(class66 arg0, class667 arg1) {
        class5 var3 = class245.method1636(this.field9279, class588.field8300, 0, 2);
        if (var3 == null) {
            return;
        }
        arg0.method580(field9283);
        arg0.method512(0, 0, this.field9281, this.field9281);
        arg0.method537(0, 0, this.field9281, this.field9281, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field9289) {
                var4 = -arg1.field9285;
                var5 = -arg1.field9277;
                var6 = -arg1.field9284;
            } else {
                var4 = this.field9285 - arg1.field9285;
                var5 = this.field9277 - arg1.field9277;
                var6 = this.field9284 - arg1.field9284;
            }
        }
        if (this.field9280 != 0) {
            int var7 = -this.field9280 & 0x3FFF;
            int var8 = class191.field2937[var7];
            int var9 = class191.field2936[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field9273 != 0) {
            int var11 = -this.field9273 & 0x3FFF;
            int var12 = class191.field2937[var11];
            int var13 = class191.field2936[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method480(1.0F);
        arg0.method590(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class499 var15 = arg0.method505(var3, 2048, 0, 64, 768);
        int var16 = var15.method291() - var15.method315();
        int var17 = var15.method297() - var15.method276();
        int var18 = var15.method315() + var16 / 2;
        int var19 = var15.method276() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method521(var18, var19, var20, var20);
        arg0.method503(arg0.method565());
        class650 var21 = arg0.method533();
        var21.method1868(0, 0, arg0.method552() - var15.method283());
        var15.method310(var21, null, arg0.method552(), 1);
        this.field9276 = arg0.method523(0, 0, this.field9281, this.field9281, true);
        this.field9276.method641(0, 0, 3);
        arg0.method512(field9283[0], field9283[1], field9283[2], field9283[3]);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lha;)V", line = 156)
    private static final void method3771(class66 arg0) {
        if (field9286 != null) {
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
        field9286 = arg0.method495(0, 128, var2, 128, 128, true);
        field9287 = arg0.method495(0, 128, var1, 128, 128, true);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "()V", line = 221)
    public final void method3772() {
        this.field9276 = null;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "()V", line = 225)
    public static final void method3773() {
        field9278 = null;
        field9286 = null;
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "()V", line = 229)
    public static void method3774() {
        field9278 = null;
        field9287 = null;
        field9286 = null;
        field9283 = null;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Lha;)V", line = 238)
    private static final void method3775(class66 arg0) {
        if (field9278 != null) {
            return;
        }
        class5 var1 = new class5(580, 1104, 1);
        var1.method28((byte) -115, (byte) 0, (byte) 0, (short) 0, (short) 1024, (short) 32767, (short) 1024, (byte) 0, (short) 0, (short) 1024);
        var1.method36(0, 128, 102, 0);
        var1.method36(0, -128, 108, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class191.field2937[var3];
            int var5 = class191.field2936[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class191.field2936[var12] >> 7;
                int var14 = class191.field2937[var12] * var4 >> 21;
                int var15 = class191.field2937[var12] * var5 >> 21;
                var1.method36(var15, var13, 126, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method37((byte) 0, (byte) 0, -128, (short) 0, (byte) 0, var7, (short) 127, var8, 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method37((byte) 0, (byte) 0, -126, (short) 0, (byte) 0, var7, (short) 127, var10, var8);
                    var1.method37((byte) 0, (byte) 0, -127, (short) 0, (byte) 0, var7, (short) 127, var11, var10);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method37((byte) 0, (byte) 0, -128, (short) 0, (byte) 0, 1, (short) 127, var8, var7);
            }
        }
        var1.field80 = var1.field96;
        var1.field99 = null;
        var1.field100 = null;
        var1.field73 = null;
        field9278 = arg0.method505(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Lha;Lav;)V", line = 321)
    private final void method3776(class66 arg0, class667 arg1) {
        method3775(arg0);
        method3771(arg0);
        arg0.method580(field9283);
        arg0.method512(0, 0, this.field9281, this.field9281);
        arg0.method494();
        arg0.method537(0, 0, this.field9281, this.field9281, this.field9275 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field9289) {
                var3 = -arg1.field9285;
                var4 = -arg1.field9277;
                var5 = -arg1.field9284;
            } else {
                var3 = arg1.field9285 - this.field9285;
                var4 = arg1.field9277 - this.field9277;
                var5 = arg1.field9284 - this.field9284;
            }
        }
        if (this.field9280 != 0) {
            int var6 = class191.field2937[this.field9280];
            int var7 = class191.field2936[this.field9280];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field9273 != 0) {
            int var9 = class191.field2937[this.field9273];
            int var10 = class191.field2936[this.field9273];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class499 var12 = field9278.method324((byte) 0, 51200, true);
        var12.method307((short) 0, (short) this.field9279);
        arg0.method480(1.0F);
        arg0.method590(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field9281 * 1024 / (var12.method291() - var12.method315());
        if (this.field9275 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method521(this.field9281 / 2, this.field9281 / 2, var13, var13);
        arg0.method503(arg0.method565());
        class650 var14 = arg0.method565();
        var14.method1868(0, 0, arg0.method552() - var12.method283());
        var12.method310(var14, null, 1024, 1);
        int var15 = this.field9281 * 13 / 16;
        int var16 = (this.field9281 - var15) / 2;
        field9287.method3433(var16, var16, var15, var15, 0, this.field9275 | 0xFF000000, 1);
        this.field9276 = arg0.method523(0, 0, this.field9281, this.field9281, true);
        arg0.method494();
        arg0.method537(0, 0, this.field9281, this.field9281, 0, 0);
        field9286.method3433(0, 0, this.field9281, this.field9281, 1, 0, 0);
        this.field9276.method641(0, 0, 0);
        arg0.method512(field9283[0], field9283[1], field9283[2], field9283[3]);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lha;IIIIII)V", line = 404)
    public final void method3777(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field9276 == null) {
            return;
        }
        int var8 = this.field9280 - arg5 & 0x3FFF;
        int var9 = this.field9273 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field9290) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field9290) / 2;
        if (var10 < arg4 && this.field9290 + var10 > 0 && var11 < arg3 && this.field9290 + var11 > 0) {
            this.field9276.method3424(arg1 + var11, arg2 + var10, this.field9290, this.field9290);
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(Lha;Lav;)Z", line = 429)
    private final boolean method3778(class66 arg0, class667 arg1) {
        if (this.field9276 == null) {
            if (this.field9288 == 0) {
                if (class699.field9647.method1274(this.field9279, 21532)) {
                    int[] var3 = class699.field9647.method1272(this.field9281, this.field9279, 0.7F, this.field9281, (byte) 81, false);
                    this.field9276 = arg0.method495(0, this.field9281, var3, this.field9281, this.field9281, true);
                }
            } else if (this.field9288 == 2) {
                this.method3770(arg0, arg1);
            } else if (this.field9288 == 1) {
                this.method3776(arg0, arg1);
            }
        }
        return this.field9276 != null;
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(Lha;Lav;)Z", line = 467)
    public final boolean method3779(class66 arg0, class667 arg1) {
        return this.field9276 != null || this.method3778(arg0, arg1);
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 472)
    public class667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field9285 = arg2;
        this.field9277 = arg3;
        this.field9284 = arg4;
        this.field9289 = arg7;
        this.field9279 = arg1;
        this.field9275 = arg6;
        this.field9282 = arg5;
        this.field9288 = arg0;
    }
}
