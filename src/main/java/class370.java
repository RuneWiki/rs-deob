import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class370 {

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    private int field5185;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    private int field5183;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    private int field5190;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Z")
    private boolean field5188;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    private int field5187;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    private int field5180;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    private int field5196;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private int field5192;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[I")
    private static int[] field5195 = new int[4];

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    private int field5181;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    private int field5182;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    private int field5186;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    private int field5191;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public int field5194;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lka;")
    private static class469 field5184;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lkr;")
    private static class743 field5179;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lkr;")
    private class743 field5189;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lkr;")
    private static class743 field5193;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lha;)V")
    private static final void method2316(class58 arg0) {
        if (field5193 != null) {
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
        field5193 = arg0.method561(128, var2, 0, 128, 119, 128);
        field5179 = arg0.method561(128, var1, 0, 128, 52, 128);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static final void method2317() {
        field5184 = null;
        field5193 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public final void method2318() {
        this.field5189 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lha;Lhe;)V")
    private final void method2319(class58 arg0, class370 arg1) {
        class729 var3 = class337.method2148(-14907, this.field5187, class700.field9837, 0);
        if (var3 == null) {
            return;
        }
        arg0.method624(field5195);
        arg0.method584(0, 0, this.field5182, this.field5182);
        arg0.method630(0, 0, this.field5182, this.field5182, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field5188) {
                var4 = -arg1.field5185;
                var5 = -arg1.field5183;
                var6 = -arg1.field5190;
            } else {
                var4 = this.field5185 - arg1.field5185;
                var5 = this.field5183 - arg1.field5183;
                var6 = this.field5190 - arg1.field5190;
            }
        }
        if (this.field5186 != 0) {
            int var7 = -this.field5186 & 0x3FFF;
            int var8 = class316.field4487[var7];
            int var9 = class316.field4490[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field5191 != 0) {
            int var11 = -this.field5191 & 0x3FFF;
            int var12 = class316.field4487[var11];
            int var13 = class316.field4490[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method552(1.0F);
        arg0.method522(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class469 var15 = arg0.method646(var3, 2048, 0, 64, 768);
        int var16 = var15.method356() - var15.method327();
        int var17 = var15.method353() - var15.method338();
        int var18 = var15.method327() + var16 / 2;
        int var19 = var15.method338() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method545(var18, var19, var20, var20);
        arg0.method538(arg0.method558());
        class280 var21 = arg0.method530();
        var21.method157(0, 0, arg0.method534() - var15.method312());
        var15.method343(var21, null, arg0.method534(), 1);
        this.field5189 = arg0.method576(0, 0, this.field5182, this.field5182, true);
        this.field5189.method81(0, 0, 3);
        arg0.method584(field5195[0], field5195[1], field5195[2], field5195[3]);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method2320(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5189 == null) {
            return;
        }
        int var8 = this.field5186 - arg5 & 0x3FFF;
        int var9 = this.field5191 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field5181) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field5181) / 2;
        if (var10 < arg4 && this.field5181 + var10 > 0 && var11 < arg3 && this.field5181 + var11 > 0) {
            this.field5189.method4136(arg1 + var11, arg2 + var10, this.field5181, this.field5181);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lha;Lhe;)Z")
    public final boolean method2321(class58 arg0, class370 arg1) {
        return this.field5189 != null || this.method2322(arg0, arg1);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Lha;Lhe;)Z")
    private final boolean method2322(class58 arg0, class370 arg1) {
        if (this.field5189 == null) {
            if (this.field5192 == 0) {
                if (class264.field3851.method1152(this.field5187, -125)) {
                    int[] var3 = class264.field3851.method1155(this.field5182, false, this.field5187, (byte) 79, 0.7F, this.field5182);
                    this.field5189 = arg0.method561(this.field5182, var3, 0, this.field5182, 74, this.field5182);
                }
            } else if (this.field5192 == 2) {
                this.method2319(arg0, arg1);
            } else if (this.field5192 == 1) {
                this.method2324(arg0, arg1);
            }
        }
        return this.field5189 != null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lha;)V")
    private static final void method2323(class58 arg0) {
        if (field5184 != null) {
            return;
        }
        class729 var1 = new class729(580, 1104, 1);
        var1.method4065((byte) 0, (short) 32767, (short) 1024, (short) 1024, (byte) 0, (short) 0, (short) 1024, (byte) 0, 255, (short) 0);
        var1.method4061(0, 128, true, 0);
        var1.method4061(0, -128, true, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class316.field4487[var3];
            int var5 = class316.field4490[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class316.field4490[var12] >> 7;
                int var14 = class316.field4487[var12] * var4 >> 21;
                int var15 = class316.field4487[var12] * var5 >> 21;
                var1.method4061(var15, var13, true, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method4064(var7, 0, (short) 0, (byte) 0, (short) 127, var8, (byte) 0, false, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method4064(var7, var8, (short) 0, (byte) 0, (short) 127, var10, (byte) 0, false, (byte) 0);
                    var1.method4064(var7, var10, (short) 0, (byte) 0, (short) 127, var11, (byte) 0, false, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method4064(1, var7, (short) 0, (byte) 0, (short) 127, var8, (byte) 0, false, (byte) 0);
            }
        }
        var1.field10180 = var1.field10210;
        var1.field10223 = null;
        var1.field10222 = null;
        var1.field10203 = null;
        field5184 = arg0.method646(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(Lha;Lhe;)V")
    private final void method2324(class58 arg0, class370 arg1) {
        method2323(arg0);
        method2316(arg0);
        arg0.method624(field5195);
        arg0.method584(0, 0, this.field5182, this.field5182);
        arg0.method619();
        arg0.method630(0, 0, this.field5182, this.field5182, this.field5180 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field5188) {
                var3 = -arg1.field5185;
                var4 = -arg1.field5183;
                var5 = -arg1.field5190;
            } else {
                var3 = arg1.field5185 - this.field5185;
                var4 = arg1.field5183 - this.field5183;
                var5 = arg1.field5190 - this.field5190;
            }
        }
        if (this.field5186 != 0) {
            int var6 = class316.field4487[this.field5186];
            int var7 = class316.field4490[this.field5186];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field5191 != 0) {
            int var9 = class316.field4487[this.field5191];
            int var10 = class316.field4490[this.field5191];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class469 var12 = field5184.method325((byte) 0, 51200, true);
        var12.method323((short) 0, (short) this.field5187);
        arg0.method552(1.0F);
        arg0.method522(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field5182 * 1024 / (var12.method356() - var12.method327());
        if (this.field5180 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method545(this.field5182 / 2, this.field5182 / 2, var13, var13);
        arg0.method538(arg0.method558());
        class280 var14 = arg0.method558();
        var14.method157(0, 0, arg0.method534() - var12.method312());
        var12.method343(var14, null, 1024, 1);
        int var15 = this.field5182 * 13 / 16;
        int var16 = (this.field5182 - var15) / 2;
        field5179.method4143(var16, var16, var15, var15, 0, this.field5180 | 0xFF000000, 1);
        this.field5189 = arg0.method576(0, 0, this.field5182, this.field5182, true);
        arg0.method619();
        arg0.method630(0, 0, this.field5182, this.field5182, 0, 0);
        field5193.method4143(0, 0, this.field5182, this.field5182, 1, 0, 0);
        this.field5189.method81(0, 0, 0);
        arg0.method584(field5195[0], field5195[1], field5195[2], field5195[3]);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
    public static void method2325() {
        field5184 = null;
        field5179 = null;
        field5193 = null;
        field5195 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field5185 = arg2;
        this.field5183 = arg3;
        this.field5190 = arg4;
        this.field5188 = arg7;
        this.field5187 = arg1;
        this.field5180 = arg6;
        this.field5196 = arg5;
        this.field5192 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Z")
    public final boolean method2326(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field5188) {
            this.field5194 = 1073741823;
            var8 = this.field5185;
            var9 = this.field5183;
            var10 = this.field5190;
        } else {
            int var5 = this.field5185 - arg0;
            int var6 = this.field5183 - arg1;
            int var7 = this.field5190 - arg2;
            this.field5194 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field5194 == 0) {
                this.field5194 = 1;
            }
            var8 = (var5 << 8) / this.field5194;
            var9 = (var6 << 8) / this.field5194;
            var10 = (var7 << 8) / this.field5194;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field5181 = this.field5196 * arg3 / (this.field5188 ? 1024 : this.field5194);
        } else {
            this.field5181 = 0;
        }
        if (this.field5181 < 8) {
            this.field5189 = null;
            return false;
        }
        int var12 = class613.method3530(false, this.field5181);
        if (var12 > arg3) {
            var12 = class271.method1797(2864, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field5182 != var12) {
            this.field5182 = var12;
        }
        this.field5186 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field5191 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field5189 = null;
        return true;
    }
}
