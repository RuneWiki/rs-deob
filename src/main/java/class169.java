import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class169 {

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    private int field2280;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    private int field2276;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Z")
    private boolean field2283;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    private int field2275;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    private int field2284;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    private int field2271;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[I")
    private static int[] field2279 = new int[4];

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    private int field2281;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    private int field2285;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    private int field2287;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lka;")
    private static class334 field2272;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Laa;")
    private static class341 field2274;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Laa;")
    private static class341 field2282;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Laa;")
    private class341 field2288;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqa;)V", line = 5)
    private static final void method1141(class165 arg0) {
        if (field2272 != null) {
            return;
        }
        class387 var1 = new class387(580, 1104, 1);
        var1.method2420(-25226, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (short) 0, (byte) 0, (short) 0, (short) 1024, (short) 32767);
        var1.method2428(0, 1724, 0, 128);
        var1.method2428(0, 1724, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class428.field6502[var3];
            int var5 = class428.field6501[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class428.field6501[var12] >> 8;
                int var14 = class428.field6502[var12] * var4 >> 23;
                int var15 = class428.field6502[var12] * var5 >> 23;
                var1.method2428(var15, 1724, -var14, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2426((byte) 0, var7, 0, (byte) 0, (short) 127, (short) 0, -14094, (byte) 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2426((byte) 0, var7, var8, (byte) 0, (short) 127, (short) 0, -14094, (byte) 0, var10);
                    var1.method2426((byte) 0, var7, var10, (byte) 0, (short) 127, (short) 0, -14094, (byte) 0, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2426((byte) 0, 1, var7, (byte) 0, (short) 127, (short) 0, -14094, (byte) 0, var8);
            }
        }
        var1.field5900 = var1.field5888;
        var1.field5899 = null;
        var1.field5898 = null;
        var1.field5902 = null;
        field2272 = arg0.method833(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqa;Lkf;)V", line = 85)
    private final void method1142(class165 arg0, class169 arg1) {
        class387 var3 = class261.method1690(0, class330.field5153, this.field2275, 0);
        if (var3 == null) {
            return;
        }
        arg0.method850(field2279);
        arg0.method739(0, 0, this.field2285, this.field2285);
        arg0.method747(0, 0, this.field2285, this.field2285, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2283) {
                var4 = -arg1.field2280;
                var5 = -arg1.field2277;
                var6 = -arg1.field2276;
            } else {
                var4 = this.field2280 - arg1.field2280;
                var5 = this.field2277 - arg1.field2277;
                var6 = this.field2276 - arg1.field2276;
            }
        }
        if (this.field2287 != 0) {
            int var7 = -this.field2287 & 0x3FFF;
            int var8 = class428.field6502[var7];
            int var9 = class428.field6501[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2278 != 0) {
            int var11 = -this.field2278 & 0x3FFF;
            int var12 = class428.field6502[var11];
            int var13 = class428.field6501[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method829(1.0F);
        arg0.method759(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class334 var15 = arg0.method833(var3, 2048, 0, 64, 768);
        int var16 = var15.method45() - var15.method58();
        int var17 = var15.method65() - var15.method77();
        int var18 = var15.method58() + var16 / 2;
        int var19 = var15.method77() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method762(var18, var19, var20, var20);
        arg0.method821(arg0.method795());
        class14 var21 = arg0.method751();
        var21.method141(0, 0, arg0.method756() - var15.method81());
        var15.method55(var21, null, arg0.method756(), 1);
        this.field2288 = arg0.method816(0, 0, this.field2285, this.field2285, true);
        this.field2288.method307(0, 0, 3);
        arg0.method739(field2279[0], field2279[1], field2279[2], field2279[3]);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 174)
    public static void method1143() {
        field2272 = null;
        field2274 = null;
        field2282 = null;
        field2279 = null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lqa;)V", line = 182)
    private static final void method1144(class165 arg0) {
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
        field2282 = arg0.method767(var2, 0, 128, 128, 128);
        field2274 = arg0.method767(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lqa;Lkf;)V", line = 242)
    private final void method1145(class165 arg0, class169 arg1) {
        method1141(arg0);
        method1144(arg0);
        arg0.method850(field2279);
        arg0.method739(0, 0, this.field2285, this.field2285);
        arg0.method831();
        arg0.method747(0, 0, this.field2285, this.field2285, this.field2286 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2283) {
                var3 = -arg1.field2280;
                var4 = -arg1.field2277;
                var5 = -arg1.field2276;
            } else {
                var3 = arg1.field2280 - this.field2280;
                var4 = arg1.field2277 - this.field2277;
                var5 = arg1.field2276 - this.field2276;
            }
        }
        if (this.field2287 != 0) {
            int var6 = class428.field6502[this.field2287];
            int var7 = class428.field6501[this.field2287];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2278 != 0) {
            int var9 = class428.field6502[this.field2278];
            int var10 = class428.field6501[this.field2278];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class334 var12 = field2272.method47((byte) 0, 51200, true);
        if (arg0.method818()) {
            var12.method57((short) 0, (short) this.field2275);
        } else {
            var12.method29((short) 127, class446.field6695.method157((byte) 114, this.field2275).field1499);
            var12.method57((short) 0, (short) -1);
        }
        arg0.method829(1.0F);
        arg0.method759(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2285 * 1024 / (var12.method45() - var12.method58());
        if (this.field2286 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method762(this.field2285 / 2, this.field2285 / 2, var13, var13);
        arg0.method821(arg0.method795());
        class14 var14 = arg0.method795();
        var14.method141(0, 0, arg0.method756() - var12.method81());
        var12.method55(var14, null, 1024, 1);
        int var15 = this.field2285 * 13 / 16;
        int var16 = (this.field2285 - var15) / 2;
        field2274.method291(var16, var16, var15, var15, 0, this.field2286 | 0xFF000000, 1);
        this.field2288 = arg0.method816(0, 0, this.field2285, this.field2285, true);
        arg0.method831();
        arg0.method747(0, 0, this.field2285, this.field2285, 0, 0);
        field2282.method291(0, 0, this.field2285, this.field2285, 1, 0, 0);
        this.field2288.method307(0, 0, 0);
        arg0.method739(field2279[0], field2279[1], field2279[2], field2279[3]);
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(Lqa;Lkf;)Z", line = 332)
    public final boolean method1146(class165 arg0, class169 arg1) {
        return this.field2288 != null || this.method1151(arg0, arg1);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 337)
    public static final void method1147() {
        field2272 = null;
        field2282 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)Z", line = 349)
    public final boolean method1148(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2283) {
            this.field2273 = 1073741823;
            var8 = this.field2280;
            var9 = this.field2277;
            var10 = this.field2276;
        } else {
            int var5 = this.field2280 - arg0;
            int var6 = this.field2277 - arg1;
            int var7 = this.field2276 - arg2;
            this.field2273 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2273 == 0) {
                this.field2273 = 1;
            }
            var8 = (var5 << 8) / this.field2273;
            var9 = (var6 << 8) / this.field2273;
            var10 = (var7 << 8) / this.field2273;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2281 = this.field2284 * arg3 / (this.field2283 ? 1024 : this.field2273);
        } else {
            this.field2281 = 0;
        }
        if (this.field2281 < 8) {
            this.field2288 = null;
            return false;
        }
        int var12 = class475.method2835(this.field2281, -1);
        if (var12 > arg3) {
            var12 = class520.method3095((byte) -53, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2285 != var12) {
            this.field2285 = var12;
        }
        this.field2287 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2278 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2288 = null;
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqa;IIIIII)V", line = 412)
    public final void method1149(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2288 == null) {
            return;
        }
        int var8 = this.field2287 - arg5 & 0x3FFF;
        int var9 = this.field2278 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2281) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2281) / 2;
        if (var10 < arg4 && this.field2281 + var10 > 0 && var11 < arg3 && this.field2281 + var11 > 0) {
            this.field2288.method2206(arg1 + var11, arg2 + var10, this.field2281, this.field2281);
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V", line = 439)
    public final void method1150() {
        this.field2288 = null;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 441)
    public class169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2280 = arg2;
        this.field2277 = arg3;
        this.field2276 = arg4;
        this.field2283 = arg7;
        this.field2275 = arg1;
        this.field2286 = arg6;
        this.field2284 = arg5;
        this.field2271 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(Lqa;Lkf;)Z", line = 453)
    private final boolean method1151(class165 arg0, class169 arg1) {
        if (this.field2288 == null) {
            if (this.field2271 == 0) {
                if (class446.field6695.method160((byte) 23, this.field2275)) {
                    int[] var3 = class446.field6695.method158(this.field2275, this.field2285, -105, false, this.field2285, 0.7F);
                    this.field2288 = arg0.method767(var3, 0, this.field2285, this.field2285, this.field2285);
                }
            } else if (this.field2271 == 2) {
                this.method1142(arg0, arg1);
            } else if (this.field2271 == 1) {
                this.method1145(arg0, arg1);
            }
        }
        return this.field2288 != null;
    }
}
