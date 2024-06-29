import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class145 {

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    private int field2267;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    private int field2261;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Z")
    private boolean field2264;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    private int field2265;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[I")
    private static int[] field2268 = new int[4];

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    private int field2266;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    private int field2270;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lrc;")
    private static class100 field2263;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lof;")
    private static class421 field2258;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lof;")
    private class421 field2269;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lof;")
    private static class421 field2271;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lja;Lla;)Z")
    public final boolean method1141(class90 arg0, class145 arg1) {
        return this.field2269 != null || this.method1142(arg0, arg1);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Lja;Lla;)Z")
    private final boolean method1142(class90 arg0, class145 arg1) {
        if (this.field2269 == null) {
            if (this.field2254 == 0) {
                if (class369.field5239.method1415((byte) 124, this.field2265)) {
                    int[] var3 = class369.field5239.method1411(this.field2265, (byte) -90, this.field2260, 0.7F, this.field2260, false);
                    this.field2269 = arg0.method715(var3, 0, this.field2260, this.field2260, this.field2260);
                }
            } else if (this.field2254 == 2) {
                this.method1150(arg0, arg1);
            } else if (this.field2254 == 1) {
                this.method1147(arg0, arg1);
            }
        }
        return this.field2269 != null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lja;)V")
    private static final void method1143(class90 arg0) {
        if (field2263 != null) {
            return;
        }
        class382 var1 = new class382(580, 1104, 1);
        var1.method2420(-88, (short) 0, (short) 1024, (short) 32767, (byte) 0, (byte) 0, (short) 0, (short) 1024, (short) 1024, (byte) 0);
        var1.method2421(0, 0, 128, (byte) -72);
        var1.method2421(0, 0, -128, (byte) -85);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class56.field897[var3];
            int var5 = class56.field898[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class56.field898[var12] >> 8;
                int var14 = class56.field897[var12] * var4 >> 23;
                int var15 = class56.field897[var12] * var5 >> 23;
                var1.method2421(-var14, var15, var13, (byte) -66);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2424((byte) 0, -90, var7, (byte) 0, var8, 0, (byte) 0, (short) 127, (short) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2424((byte) 0, 103, var7, (byte) 0, var10, var8, (byte) 0, (short) 127, (short) 0);
                    var1.method2424((byte) 0, -98, var7, (byte) 0, var11, var10, (byte) 0, (short) 127, (short) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2424((byte) 0, 78, 1, (byte) 0, var8, var7, (byte) 0, (short) 127, (short) 0);
            }
        }
        var1.field5434 = var1.field5424;
        var1.field5462 = null;
        var1.field5444 = null;
        var1.field5451 = null;
        field2263 = arg0.method735(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)Z")
    public final boolean method1144(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2264) {
            this.field2262 = 1073741823;
            var8 = this.field2267;
            var9 = this.field2255;
            var10 = this.field2261;
        } else {
            int var5 = this.field2267 - arg0;
            int var6 = this.field2255 - arg1;
            int var7 = this.field2261 - arg2;
            this.field2262 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2262 == 0) {
                this.field2262 = 1;
            }
            var8 = (var5 << 8) / this.field2262;
            var9 = (var6 << 8) / this.field2262;
            var10 = (var7 << 8) / this.field2262;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2270 = this.field2257 * arg3 / (this.field2264 ? 1024 : this.field2262);
        } else {
            this.field2270 = 0;
        }
        if (this.field2270 < 8) {
            this.field2269 = null;
            return false;
        }
        int var12 = class202.method1526(this.field2270, -2092404400);
        if (var12 > arg3) {
            var12 = class321.method2142(-997880092, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2260 != var12) {
            this.field2260 = var12;
        }
        this.field2266 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2256 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2269 = null;
        return true;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Lja;)V")
    private static final void method1145(class90 arg0) {
        if (field2271 != null) {
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
        field2271 = arg0.method715(var2, 0, 128, 128, 128);
        field2258 = arg0.method715(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public static void method1146() {
        field2263 = null;
        field2258 = null;
        field2271 = null;
        field2268 = null;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(Lja;Lla;)V")
    private final void method1147(class90 arg0, class145 arg1) {
        method1143(arg0);
        method1145(arg0);
        arg0.method708(field2268);
        arg0.method752(0, 0, this.field2260, this.field2260);
        arg0.method742();
        arg0.method681(0, 0, this.field2260, this.field2260, this.field2259 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2264) {
                var3 = -arg1.field2267;
                var4 = -arg1.field2255;
                var5 = -arg1.field2261;
            } else {
                var3 = arg1.field2267 - this.field2267;
                var4 = arg1.field2255 - this.field2255;
                var5 = arg1.field2261 - this.field2261;
            }
        }
        if (this.field2266 != 0) {
            int var6 = class56.field897[this.field2266];
            int var7 = class56.field898[this.field2266];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2256 != 0) {
            int var9 = class56.field897[this.field2256];
            int var10 = class56.field898[this.field2256];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class100 var12 = field2263.method518((byte) 0, 25600, true);
        if (arg0.method747()) {
            var12.method570((short) 0, (short) this.field2265);
        } else {
            var12.method554((short) 127, class369.field5239.method1412(this.field2265, (byte) -124).field2918);
            var12.method570((short) 0, (short) -1);
        }
        arg0.method699(1.0F);
        arg0.method712(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2260 * 1024 / (var12.method546() - var12.method561());
        if (this.field2259 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method704(this.field2260 / 2, this.field2260 / 2, var13, var13);
        arg0.method673(arg0.method748());
        class202 var14 = arg0.method748();
        var14.method1527(0, 0, arg0.method744() - var12.method521());
        var12.method531(var14, (class290) null, 1024, 1);
        int var15 = this.field2260 * 13 / 16;
        int var16 = (this.field2260 - var15) / 2;
        field2258.method494(var16, var16, var15, var15, 1, this.field2259 | 0xFF000000, 1);
        this.field2269 = arg0.method686(0, 0, this.field2260, this.field2260, true);
        arg0.method742();
        arg0.method681(0, 0, this.field2260, this.field2260, 0, 0);
        field2271.method494(0, 0, this.field2260, this.field2260, 0, 0, 0);
        this.field2269.method500(0, 0, 0);
        arg0.method752(field2268[0], field2268[1], field2268[2], field2268[3]);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()V")
    public final void method1148() {
        this.field2269 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lja;IIIIII)V")
    public final void method1149(class90 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2269 == null) {
            return;
        }
        int var8 = this.field2266 - arg5 & 0x3FFF;
        int var9 = this.field2256 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2270) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2270) / 2;
        if (var10 < arg4 && this.field2270 + var10 > 0 && var11 < arg3 && this.field2270 + var11 > 0) {
            this.field2269.method2644(arg1 + var11, arg2 + var10, this.field2270, this.field2270);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(Lja;Lla;)V")
    private final void method1150(class90 arg0, class145 arg1) {
        class382 var3 = class265.method1893(this.field2265, class33.field464, 0, (byte) -127);
        if (var3 == null) {
            return;
        }
        arg0.method708(field2268);
        arg0.method752(0, 0, this.field2260, this.field2260);
        arg0.method681(0, 0, this.field2260, this.field2260, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2264) {
                var4 = -arg1.field2267;
                var5 = -arg1.field2255;
                var6 = -arg1.field2261;
            } else {
                var4 = this.field2267 - arg1.field2267;
                var5 = this.field2255 - arg1.field2255;
                var6 = this.field2261 - arg1.field2261;
            }
        }
        if (this.field2266 != 0) {
            int var7 = -this.field2266 & 0x3FFF;
            int var8 = class56.field897[var7];
            int var9 = class56.field898[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2256 != 0) {
            int var11 = -this.field2256 & 0x3FFF;
            int var12 = class56.field897[var11];
            int var13 = class56.field898[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method699(1.0F);
        arg0.method712(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class100 var15 = arg0.method735(var3, 1024, 0, 64, 768);
        int var16 = var15.method546() - var15.method561();
        int var17 = var15.method534() - var15.method541();
        int var18 = var15.method561() + var16 / 2;
        int var19 = var15.method541() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method704(var18, var19, var20, var20);
        arg0.method673(arg0.method748());
        class202 var21 = arg0.method709();
        var21.method1527(0, 0, arg0.method744() - var15.method521());
        var15.method531(var21, (class290) null, arg0.method744(), 1);
        this.field2269 = arg0.method686(0, 0, this.field2260, this.field2260, true);
        this.field2269.method500(0, 0, 3);
        arg0.method752(field2268[0], field2268[1], field2268[2], field2268[3]);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()V")
    public static final void method1151() {
        field2263 = null;
        field2271 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2267 = arg2;
        this.field2255 = arg3;
        this.field2261 = arg4;
        this.field2264 = arg7;
        this.field2265 = arg1;
        this.field2259 = arg6;
        this.field2257 = arg5;
        this.field2254 = arg0;
    }
}
