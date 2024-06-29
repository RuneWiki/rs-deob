import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class193 {

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    private int field2261;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    private int field2267;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    private int field2265;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "Z")
    private boolean field2274;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    private int field2273;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    private int field2269;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    private int field2271;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    private int field2275;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "[I")
    private static int[] field2259 = new int[4];

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    private int field2264;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    private int field2272;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    private int field2276;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Lge;")
    private static class386 field2268;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "Lc;")
    private static class436 field2262;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "Lc;")
    private class436 field2266;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "Lc;")
    private static class436 field2270;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
    public static final void method1186() {
        field2268 = null;
        field2262 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Luo;IIIIII)V")
    public final void method1187(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2266 == null) {
            return;
        }
        int var8 = this.field2260 - arg5 & 0x3FFF;
        int var9 = this.field2272 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2276) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2276) / 2;
        if (var10 < arg4 && this.field2276 + var10 > 0 && var11 < arg3 && this.field2276 + var11 > 0) {
            this.field2266.method2664(arg1 + var11, arg2 + var10, this.field2276, this.field2276);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "()V")
    public static void method1188() {
        field2268 = null;
        field2270 = null;
        field2262 = null;
        field2259 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Luo;Lcs;)Z")
    public final boolean method1189(class118 arg0, class193 arg1) {
        return this.field2266 != null || this.method1194(arg0, arg1);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Luo;Lcs;)V")
    private final void method1190(class118 arg0, class193 arg1) {
        method1191(arg0);
        method1195(arg0);
        arg0.method722(field2259);
        arg0.method774(0, 0, this.field2264, this.field2264);
        arg0.method725();
        arg0.method789(0, 0, this.field2264, this.field2264, this.field2269 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2274) {
                var3 = -arg1.field2261;
                var4 = -arg1.field2267;
                var5 = -arg1.field2265;
            } else {
                var3 = arg1.field2261 - this.field2261;
                var4 = arg1.field2267 - this.field2267;
                var5 = arg1.field2265 - this.field2265;
            }
        }
        if (this.field2260 != 0) {
            int var6 = class363.field4927[this.field2260];
            int var7 = class363.field4917[this.field2260];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2272 != 0) {
            int var9 = class363.field4927[this.field2272];
            int var10 = class363.field4917[this.field2272];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class386 var12 = field2268.method1459((byte) 0, 25600, true);
        if (arg0.method723()) {
            var12.method1478((short) 0, (short) this.field2273);
        } else {
            var12.method1463((short) 127, class157.field1834.method960(this.field2273, (byte) -40).field4864);
            var12.method1478((short) 0, (short) -1);
        }
        arg0.method688(1.0F);
        arg0.method737(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2264 * 1024 / (var12.method1489() - var12.method1473());
        if (this.field2269 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method790(this.field2264 / 2, this.field2264 / 2, var13, var13);
        arg0.method749(arg0.method769());
        class450 var14 = arg0.method769();
        var14.method929(0, 0, arg0.method771() - var12.method1453());
        var12.method1436(var14, (class34) null, 1024, 1);
        int var15 = this.field2264 * 13 / 16;
        int var16 = (this.field2264 - var15) / 2;
        field2270.method163(var16, var16, var15, var15, 1, this.field2269 | 0xFF000000, 1);
        this.field2266 = arg0.method767(0, 0, this.field2264, this.field2264, true);
        arg0.method725();
        arg0.method789(0, 0, this.field2264, this.field2264, 0, 0);
        field2262.method163(0, 0, this.field2264, this.field2264, 0, 0, 0);
        this.field2266.method164(0, 0, 0);
        arg0.method774(field2259[0], field2259[1], field2259[2], field2259[3]);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Luo;)V")
    private static final void method1191(class118 arg0) {
        if (field2268 != null) {
            return;
        }
        class402 var1 = new class402(580, 1104, 1);
        var1.method2503((byte) 0, (short) 1024, (byte) -119, (short) 0, (short) 1024, (short) 0, (short) 32767, (byte) 0, (short) 1024, (byte) 0);
        var1.method2515(0, 0, 92, 128);
        var1.method2515(0, 0, 91, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class363.field4927[var3];
            int var5 = class363.field4917[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class363.field4917[var12] >> 8;
                int var14 = class363.field4927[var12] * var4 >> 23;
                int var15 = class363.field4927[var12] * var5 >> 23;
                var1.method2515(-var14, var15, -60, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2513((byte) 0, (byte) 0, 125, 0, (byte) 0, (short) 0, var7, (short) 127, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2513((byte) 0, (byte) 0, 77, var8, (byte) 0, (short) 0, var7, (short) 127, var10);
                    var1.method2513((byte) 0, (byte) 0, 112, var10, (byte) 0, (short) 0, var7, (short) 127, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2513((byte) 0, (byte) 0, 105, var7, (byte) 0, (short) 0, 1, (short) 127, var8);
            }
        }
        var1.field5555 = var1.field5562;
        var1.field5590 = null;
        var1.field5546 = null;
        var1.field5551 = null;
        field2268 = arg0.method701(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "()V")
    public final void method1192() {
        this.field2266 = null;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Luo;Lcs;)V")
    private final void method1193(class118 arg0, class193 arg1) {
        class402 var3 = class147.method952((byte) -81, this.field2273, class75.field909, 0);
        if (var3 == null) {
            return;
        }
        arg0.method722(field2259);
        arg0.method774(0, 0, this.field2264, this.field2264);
        arg0.method789(0, 0, this.field2264, this.field2264, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2274) {
                var4 = -arg1.field2261;
                var5 = -arg1.field2267;
                var6 = -arg1.field2265;
            } else {
                var4 = this.field2261 - arg1.field2261;
                var5 = this.field2267 - arg1.field2267;
                var6 = this.field2265 - arg1.field2265;
            }
        }
        if (this.field2260 != 0) {
            int var7 = -this.field2260 & 0x3FFF;
            int var8 = class363.field4927[var7];
            int var9 = class363.field4917[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2272 != 0) {
            int var11 = -this.field2272 & 0x3FFF;
            int var12 = class363.field4927[var11];
            int var13 = class363.field4917[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method688(1.0F);
        arg0.method737(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class386 var15 = arg0.method701(var3, 1024, 0, 64, 768);
        int var16 = var15.method1489() - var15.method1473();
        int var17 = var15.method1452() - var15.method1458();
        int var18 = var15.method1473() + var16 / 2;
        int var19 = var15.method1458() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method790(var18, var19, var20, var20);
        arg0.method749(arg0.method769());
        class450 var21 = arg0.method742();
        var21.method929(0, 0, arg0.method771() - var15.method1453());
        var15.method1436(var21, (class34) null, arg0.method771(), 1);
        this.field2266 = arg0.method767(0, 0, this.field2264, this.field2264, true);
        this.field2266.method164(0, 0, 3);
        arg0.method774(field2259[0], field2259[1], field2259[2], field2259[3]);
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(Luo;Lcs;)Z")
    private final boolean method1194(class118 arg0, class193 arg1) {
        if (this.field2266 == null) {
            if (this.field2275 == 0) {
                if (class157.field1834.method963(this.field2273, true)) {
                    int[] var3 = class157.field1834.method964(this.field2273, this.field2264, -22968, 0.7F, this.field2264, false);
                    this.field2266 = arg0.method703(var3, 0, this.field2264, this.field2264, this.field2264);
                }
            } else if (this.field2275 == 2) {
                this.method1193(arg0, arg1);
            } else if (this.field2275 == 1) {
                this.method1190(arg0, arg1);
            }
        }
        return this.field2266 != null;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Luo;)V")
    private static final void method1195(class118 arg0) {
        if (field2262 != null) {
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
        field2262 = arg0.method703(var2, 0, 128, 128, 128);
        field2270 = arg0.method703(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)Z")
    public final boolean method1196(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2274) {
            this.field2263 = 1073741823;
            var8 = this.field2261;
            var9 = this.field2267;
            var10 = this.field2265;
        } else {
            int var5 = this.field2261 - arg0;
            int var6 = this.field2267 - arg1;
            int var7 = this.field2265 - arg2;
            this.field2263 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2263 == 0) {
                this.field2263 = 1;
            }
            var8 = (var5 << 8) / this.field2263;
            var9 = (var6 << 8) / this.field2263;
            var10 = (var7 << 8) / this.field2263;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2276 = this.field2271 * arg3 / (this.field2274 ? 1024 : this.field2263);
        } else {
            this.field2276 = 0;
        }
        if (this.field2276 < 8) {
            this.field2266 = null;
            return false;
        }
        int var12 = class39.method249(this.field2276, true);
        if (var12 > arg3) {
            var12 = class246.method1611((byte) -60, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2264 != var12) {
            this.field2264 = var12;
        }
        this.field2260 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2272 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2266 = null;
        return true;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2261 = arg2;
        this.field2267 = arg3;
        this.field2265 = arg4;
        this.field2274 = arg7;
        this.field2273 = arg1;
        this.field2269 = arg6;
        this.field2271 = arg5;
        this.field2275 = arg0;
    }
}
