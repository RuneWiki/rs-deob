import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class382 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field5255;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    private int field5248;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    private int field5260;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Z")
    private boolean field5253;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    private int field5259;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field5262;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field5258;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    private int field5252;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
    private static int[] field5251 = new int[4];

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    private int field5249;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    private int field5257;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    private int field5265;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lr;")
    private static class159 field5261;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lha;")
    private static class53 field5254;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Lha;")
    private static class53 field5263;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lha;")
    private class53 field5264;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)Z")
    public final boolean method2272(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field5253) {
            this.field5250 = 1073741823;
            var8 = this.field5255;
            var9 = this.field5248;
            var10 = this.field5260;
        } else {
            int var5 = this.field5255 - arg0;
            int var6 = this.field5248 - arg1;
            int var7 = this.field5260 - arg2;
            this.field5250 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field5250 == 0) {
                this.field5250 = 1;
            }
            var8 = (var5 << 8) / this.field5250;
            var9 = (var6 << 8) / this.field5250;
            var10 = (var7 << 8) / this.field5250;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field5265 = this.field5258 * arg3 / (this.field5253 ? 1024 : this.field5250);
        } else {
            this.field5265 = 0;
        }
        if (this.field5265 < 8) {
            this.field5264 = null;
            return false;
        }
        int var12 = class322.method1938(this.field5265, 66);
        if (var12 > arg3) {
            var12 = class496.method2959(arg3, -79);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field5257 != var12) {
            this.field5257 = var12;
        }
        this.field5256 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field5249 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field5264 = null;
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method2273(class208 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5264 == null) {
            return;
        }
        int var8 = this.field5256 - arg5 & 0x3FFF;
        int var9 = this.field5249 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field5265) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field5265) / 2;
        if (var10 < arg4 && this.field5265 + var10 > 0 && var11 < arg3 && this.field5265 + var11 > 0) {
            this.field5264.method317(arg1 + var11, arg2 + var10, this.field5265, this.field5265);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lqa;Luf;)Z")
    public final boolean method2274(class208 arg0, class382 arg1) {
        return this.field5264 != null || this.method2276(arg0, arg1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lqa;)V")
    private static final void method2275(class208 arg0) {
        if (field5254 != null) {
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
        field5254 = arg0.method466(var2, 0, 128, 128, 128);
        field5263 = arg0.method466(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lqa;Luf;)Z")
    private final boolean method2276(class208 arg0, class382 arg1) {
        if (this.field5264 == null) {
            if (this.field5252 == 0) {
                if (class117.field1645.method109(this.field5259, 1680)) {
                    int[] var3 = class117.field1645.method111(this.field5257, false, this.field5257, 6925, this.field5259, 0.7F);
                    this.field5264 = arg0.method466(var3, 0, this.field5257, this.field5257, this.field5257);
                }
            } else if (this.field5252 == 2) {
                this.method2281(arg0, arg1);
            } else if (this.field5252 == 1) {
                this.method2277(arg0, arg1);
            }
        }
        return this.field5264 != null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(Lqa;Luf;)V")
    private final void method2277(class208 arg0, class382 arg1) {
        method2280(arg0);
        method2275(arg0);
        arg0.method431(field5251);
        arg0.method510(0, 0, this.field5257, this.field5257);
        arg0.method465();
        arg0.method498(0, 0, this.field5257, this.field5257, this.field5262 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field5253) {
                var3 = -arg1.field5255;
                var4 = -arg1.field5248;
                var5 = -arg1.field5260;
            } else {
                var3 = arg1.field5255 - this.field5255;
                var4 = arg1.field5248 - this.field5248;
                var5 = arg1.field5260 - this.field5260;
            }
        }
        if (this.field5256 != 0) {
            int var6 = class589.field8742[this.field5256];
            int var7 = class589.field8735[this.field5256];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field5249 != 0) {
            int var9 = class589.field8742[this.field5249];
            int var10 = class589.field8735[this.field5249];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class159 var12 = field5261.method94((byte) 0, 51200, true);
        if (arg0.method430()) {
            var12.method80((short) 0, (short) this.field5259);
        } else {
            var12.method95((short) 127, class117.field1645.method110(this.field5259, (byte) 100).field6642);
            var12.method80((short) 0, (short) -1);
        }
        arg0.method500(1.0F);
        arg0.method520(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field5257 * 1024 / (var12.method58() - var12.method85());
        if (this.field5262 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method516(this.field5257 / 2, this.field5257 / 2, var13, var13);
        arg0.method483(arg0.method522());
        class165 var14 = arg0.method522();
        var14.method353(0, 0, arg0.method524() - var12.method81());
        var12.method74(var14, null, 1024, 1);
        int var15 = this.field5257 * 13 / 16;
        int var16 = (this.field5257 - var15) / 2;
        field5263.method314(var16, var16, var15, var15, 0, this.field5262 | 0xFF000000, 1);
        this.field5264 = arg0.method442(0, 0, this.field5257, this.field5257, true);
        arg0.method465();
        arg0.method498(0, 0, this.field5257, this.field5257, 0, 0);
        field5254.method314(0, 0, this.field5257, this.field5257, 1, 0, 0);
        this.field5264.method321(0, 0, 0);
        arg0.method510(field5251[0], field5251[1], field5251[2], field5251[3]);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
    public static final void method2278() {
        field5261 = null;
        field5254 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
    public static void method2279() {
        field5261 = null;
        field5263 = null;
        field5254 = null;
        field5251 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lqa;)V")
    private static final void method2280(class208 arg0) {
        if (field5261 != null) {
            return;
        }
        class451 var1 = new class451(580, 1104, 1);
        var1.method2736((short) 1024, (short) 1024, (byte) 0, (byte) 74, (byte) 0, (short) 32767, (byte) 0, (short) 1024, (short) 0, (short) 0);
        var1.method2740((byte) 107, 0, 0, 128);
        var1.method2740((byte) 109, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class589.field8742[var3];
            int var5 = class589.field8735[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class589.field8735[var12] >> 8;
                int var14 = class589.field8742[var12] * var4 >> 23;
                int var15 = class589.field8742[var12] * var5 >> 23;
                var1.method2740((byte) 88, -var14, var15, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2741(var7, (short) 0, (short) 127, (byte) 0, -1, (byte) 0, 0, (byte) 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2741(var7, (short) 0, (short) 127, (byte) 0, -1, (byte) 0, var8, (byte) 0, var10);
                    var1.method2741(var7, (short) 0, (short) 127, (byte) 0, -1, (byte) 0, var10, (byte) 0, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2741(1, (short) 0, (short) 127, (byte) 0, -1, (byte) 0, var7, (byte) 0, var8);
            }
        }
        var1.field6367 = var1.field6351;
        var1.field6333 = null;
        var1.field6337 = null;
        var1.field6355 = null;
        field5261 = arg0.method491(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(Lqa;Luf;)V")
    private final void method2281(class208 arg0, class382 arg1) {
        class451 var3 = class537.method3254(this.field5259, (byte) 1, class508.field7219, 0);
        if (var3 == null) {
            return;
        }
        arg0.method431(field5251);
        arg0.method510(0, 0, this.field5257, this.field5257);
        arg0.method498(0, 0, this.field5257, this.field5257, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field5253) {
                var4 = -arg1.field5255;
                var5 = -arg1.field5248;
                var6 = -arg1.field5260;
            } else {
                var4 = this.field5255 - arg1.field5255;
                var5 = this.field5248 - arg1.field5248;
                var6 = this.field5260 - arg1.field5260;
            }
        }
        if (this.field5256 != 0) {
            int var7 = -this.field5256 & 0x3FFF;
            int var8 = class589.field8742[var7];
            int var9 = class589.field8735[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field5249 != 0) {
            int var11 = -this.field5249 & 0x3FFF;
            int var12 = class589.field8742[var11];
            int var13 = class589.field8735[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method500(1.0F);
        arg0.method520(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class159 var15 = arg0.method491(var3, 2048, 0, 64, 768);
        int var16 = var15.method58() - var15.method85();
        int var17 = var15.method88() - var15.method86();
        int var18 = var15.method85() + var16 / 2;
        int var19 = var15.method86() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method516(var18, var19, var20, var20);
        arg0.method483(arg0.method522());
        class165 var21 = arg0.method428();
        var21.method353(0, 0, arg0.method524() - var15.method81());
        var15.method74(var21, null, arg0.method524(), 1);
        this.field5264 = arg0.method442(0, 0, this.field5257, this.field5257, true);
        this.field5264.method321(0, 0, 3);
        arg0.method510(field5251[0], field5251[1], field5251[2], field5251[3]);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
    public final void method2282() {
        this.field5264 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field5255 = arg2;
        this.field5248 = arg3;
        this.field5260 = arg4;
        this.field5253 = arg7;
        this.field5259 = arg1;
        this.field5262 = arg6;
        this.field5258 = arg5;
        this.field5252 = arg0;
    }
}
