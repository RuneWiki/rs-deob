import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class187 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    private int field2273;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    private int field2276;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Z")
    private boolean field2270;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field2269;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    private int field2284;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    private int field2274;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    private static int[] field2272 = new int[4];

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    private int field2279;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    private int field2280;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field2281;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    private int field2285;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lba;")
    private static class350 field2271;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lxa;")
    private static class458 field2278;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lxa;")
    private static class458 field2282;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lxa;")
    private class458 field2283;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V", line = 8)
    public static void method1085() {
        field2271 = null;
        field2278 = null;
        field2282 = null;
        field2272 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()V", line = 18)
    public static final void method1086() {
        field2271 = null;
        field2282 = null;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()V", line = 24)
    public final void method1087() {
        this.field2283 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Loa;)V", line = 29)
    private static final void method1088(class635 arg0) {
        if (field2271 != null) {
            return;
        }
        class90 var1 = new class90(580, 1104, 1);
        var1.method574((byte) 0, (short) 0, (short) 1024, (byte) 0, (short) 1024, (short) 1024, (short) 32767, -16865, (byte) 0, (short) 0);
        var1.method569(-70, 0, 128, 0);
        var1.method569(-41, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class285.field3655[var3];
            int var5 = class285.field3656[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class285.field3656[var12] >> 7;
                int var14 = class285.field3655[var12] * var4 >> 21;
                int var15 = class285.field3655[var12] * var5 >> 21;
                var1.method569(-123, -var14, var13, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method566(1, var7, (short) 0, (byte) 0, var8, (short) 127, (byte) 0, 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method566(1, var7, (short) 0, (byte) 0, var10, (short) 127, (byte) 0, var8, (byte) 0);
                    var1.method566(1, var7, (short) 0, (byte) 0, var11, (short) 127, (byte) 0, var10, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method566(1, 1, (short) 0, (byte) 0, var8, (short) 127, (byte) 0, var7, (byte) 0);
            }
        }
        var1.field1011 = var1.field1034;
        var1.field1006 = null;
        var1.field1008 = null;
        var1.field989 = null;
        field2271 = arg0.method375(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)Z", line = 111)
    public final boolean method1089(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2270) {
            this.field2275 = 1073741823;
            var8 = this.field2273;
            var9 = this.field2286;
            var10 = this.field2276;
        } else {
            int var5 = this.field2273 - arg0;
            int var6 = this.field2286 - arg1;
            int var7 = this.field2276 - arg2;
            this.field2275 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2275 == 0) {
                this.field2275 = 1;
            }
            var8 = (var5 << 8) / this.field2275;
            var9 = (var6 << 8) / this.field2275;
            var10 = (var7 << 8) / this.field2275;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2280 = this.field2277 * arg3 / (this.field2270 ? 1024 : this.field2275);
        } else {
            this.field2280 = 0;
        }
        if (this.field2280 < 8) {
            this.field2283 = null;
            return false;
        }
        int var12 = class146.method799(this.field2280, -112);
        if (var12 > arg3) {
            var12 = class687.method3819(arg3, (byte) 122);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2281 != var12) {
            this.field2281 = var12;
        }
        this.field2285 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field2279 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field2283 = null;
        return true;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Loa;Loc;)V", line = 167)
    private final void method1090(class635 arg0, class187 arg1) {
        method1088(arg0);
        method1091(arg0);
        arg0.method274(field2272);
        arg0.method314(0, 0, this.field2281, this.field2281);
        arg0.method358();
        arg0.method286(0, 0, this.field2281, this.field2281, this.field2284 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2270) {
                var3 = -arg1.field2273;
                var4 = -arg1.field2286;
                var5 = -arg1.field2276;
            } else {
                var3 = arg1.field2273 - this.field2273;
                var4 = arg1.field2286 - this.field2286;
                var5 = arg1.field2276 - this.field2276;
            }
        }
        if (this.field2285 != 0) {
            int var6 = class285.field3655[this.field2285];
            int var7 = class285.field3656[this.field2285];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field2279 != 0) {
            int var9 = class285.field3655[this.field2279];
            int var10 = class285.field3656[this.field2279];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class350 var12 = field2271.method602((byte) 0, 51200, true);
        if (arg0.method276()) {
            var12.method916((short) 0, (short) this.field2269);
        } else {
            var12.method863((short) 127, class525.field7510.method846((byte) -122, this.field2269).field5480);
            var12.method916((short) 0, (short) -1);
        }
        arg0.method368(1.0F);
        arg0.method320(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2281 * 1024 / (var12.method876() - var12.method912());
        if (this.field2284 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method306(this.field2281 / 2, this.field2281 / 2, var13, var13);
        arg0.method311(arg0.method371());
        class389 var14 = arg0.method371();
        var14.method228(0, 0, arg0.method337() - var12.method880());
        var12.method871(var14, null, 1024, 1);
        int var15 = this.field2281 * 13 / 16;
        int var16 = (this.field2281 - var15) / 2;
        field2278.method413(var16, var16, var15, var15, 0, this.field2284 | 0xFF000000, 1);
        this.field2283 = arg0.method279(0, 0, this.field2281, this.field2281, true);
        arg0.method358();
        arg0.method286(0, 0, this.field2281, this.field2281, 0, 0);
        field2282.method413(0, 0, this.field2281, this.field2281, 1, 0, 0);
        this.field2283.method414(0, 0, 0);
        arg0.method314(field2272[0], field2272[1], field2272[2], field2272[3]);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Loa;)V", line = 257)
    private static final void method1091(class635 arg0) {
        if (field2282 != null) {
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
        field2282 = arg0.method326(var2, 0, 128, 128, 128);
        field2278 = arg0.method326(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Loa;Loc;)V", line = 322)
    private final void method1092(class635 arg0, class187 arg1) {
        class90 var3 = class189.method1098(this.field2269, 0, 1, class630.field8950);
        if (var3 == null) {
            return;
        }
        arg0.method274(field2272);
        arg0.method314(0, 0, this.field2281, this.field2281);
        arg0.method286(0, 0, this.field2281, this.field2281, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2270) {
                var4 = -arg1.field2273;
                var5 = -arg1.field2286;
                var6 = -arg1.field2276;
            } else {
                var4 = this.field2273 - arg1.field2273;
                var5 = this.field2286 - arg1.field2286;
                var6 = this.field2276 - arg1.field2276;
            }
        }
        if (this.field2285 != 0) {
            int var7 = -this.field2285 & 0x3FFF;
            int var8 = class285.field3655[var7];
            int var9 = class285.field3656[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field2279 != 0) {
            int var11 = -this.field2279 & 0x3FFF;
            int var12 = class285.field3655[var11];
            int var13 = class285.field3656[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method368(1.0F);
        arg0.method320(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class350 var15 = arg0.method375(var3, 2048, 0, 64, 768);
        int var16 = var15.method876() - var15.method912();
        int var17 = var15.method913() - var15.method864();
        int var18 = var15.method912() + var16 / 2;
        int var19 = var15.method864() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method306(var18, var19, var20, var20);
        arg0.method311(arg0.method371());
        class389 var21 = arg0.method297();
        var21.method228(0, 0, arg0.method337() - var15.method880());
        var15.method871(var21, null, arg0.method337(), 1);
        this.field2283 = arg0.method279(0, 0, this.field2281, this.field2281, true);
        this.field2283.method414(0, 0, 3);
        arg0.method314(field2272[0], field2272[1], field2272[2], field2272[3]);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Loa;IIIIII)V", line = 406)
    public final void method1093(class635 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2283 == null) {
            return;
        }
        int var8 = this.field2285 - arg5 & 0x3FFF;
        int var9 = this.field2279 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2280) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2280) / 2;
        if (var10 < arg4 && this.field2280 + var10 > 0 && var11 < arg3 && this.field2280 + var11 > 0) {
            this.field2283.method2611(arg1 + var11, arg2 + var10, this.field2280, this.field2280);
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Loa;Loc;)Z", line = 431)
    private final boolean method1094(class635 arg0, class187 arg1) {
        if (this.field2283 == null) {
            if (this.field2274 == 0) {
                if (class525.field7510.method843(this.field2269, 31340)) {
                    int[] var3 = class525.field7510.method845(this.field2269, 0.7F, this.field2281, true, this.field2281, false);
                    this.field2283 = arg0.method326(var3, 0, this.field2281, this.field2281, this.field2281);
                }
            } else if (this.field2274 == 2) {
                this.method1092(arg0, arg1);
            } else if (this.field2274 == 1) {
                this.method1090(arg0, arg1);
            }
        }
        return this.field2283 != null;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(Loa;Loc;)Z", line = 476)
    public final boolean method1095(class635 arg0, class187 arg1) {
        return this.field2283 != null || this.method1094(arg0, arg1);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2273 = arg2;
        this.field2286 = arg3;
        this.field2276 = arg4;
        this.field2270 = arg7;
        this.field2269 = arg1;
        this.field2284 = arg6;
        this.field2277 = arg5;
        this.field2274 = arg0;
    }
}
