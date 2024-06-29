import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class443 {

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    private int field5936;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    private int field5933;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    private int field5941;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Z")
    private boolean field5939;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    private int field5935;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    private int field5934;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    private int field5948;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    private int field5938;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "[I")
    private static int[] field5944 = new int[4];

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public int field5932;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    private int field5942;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    private int field5943;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    private int field5945;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    private int field5947;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Ltf;")
    private static class312 field5937;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Ltf;")
    private static class312 field5940;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Ltf;")
    private class312 field5946;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lka;")
    private static class498 field5931;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lha;)V", line = 4)
    private static final void method2604(class66 arg0) {
        if (field5931 != null) {
            return;
        }
        class496 var1 = new class496(580, 1104, 1);
        var1.method2930((byte) 0, (short) 0, (byte) 0, (short) 1024, 0, (short) 0, (short) 1024, (short) 32767, (byte) 0, (short) 1024);
        var1.method2925(0, 0, 128, 0);
        var1.method2925(0, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class789.field10868[var3];
            int var5 = class789.field10864[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class789.field10864[var12] >> 7;
                int var14 = class789.field10868[var12] * var4 >> 21;
                int var15 = class789.field10868[var12] * var5 >> 21;
                var1.method2925(0, var15, var13, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2922((byte) 0, (short) 0, var8, var7, (byte) 92, (byte) 0, (byte) 0, 0, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2922((byte) 0, (short) 0, var10, var7, (byte) 92, (byte) 0, (byte) 0, var8, (short) 127);
                    var1.method2922((byte) 0, (short) 0, var11, var7, (byte) 92, (byte) 0, (byte) 0, var10, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2922((byte) 0, (short) 0, var8, 1, (byte) 92, (byte) 0, (byte) 0, var7, (short) 127);
            }
        }
        var1.field6908 = var1.field6928;
        var1.field6891 = null;
        var1.field6906 = null;
        var1.field6941 = null;
        field5931 = arg0.method567(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lha;Lep;)V", line = 85)
    private final void method2605(class66 arg0, class443 arg1) {
        class496 var3 = class748.method4177(this.field5935, 0, class368.field4577, 4);
        if (var3 == null) {
            return;
        }
        arg0.method566(field5944);
        arg0.method556(0, 0, this.field5942, this.field5942);
        arg0.method645(0, 0, this.field5942, this.field5942, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field5939) {
                var4 = -arg1.field5936;
                var5 = -arg1.field5933;
                var6 = -arg1.field5941;
            } else {
                var4 = this.field5936 - arg1.field5936;
                var5 = this.field5933 - arg1.field5933;
                var6 = this.field5941 - arg1.field5941;
            }
        }
        if (this.field5943 != 0) {
            int var7 = -this.field5943 & 0x3FFF;
            int var8 = class789.field10868[var7];
            int var9 = class789.field10864[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field5945 != 0) {
            int var11 = -this.field5945 & 0x3FFF;
            int var12 = class789.field10868[var11];
            int var13 = class789.field10864[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method626(1.0F);
        arg0.method578(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class498 var15 = arg0.method567(var3, 2048, 0, 64, 768);
        int var16 = var15.method383() - var15.method381();
        int var17 = var15.method400() - var15.method404();
        int var18 = var15.method381() + var16 / 2;
        int var19 = var15.method404() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method565(var18, var19, var20, var20);
        arg0.method628(arg0.method614());
        class778 var21 = arg0.method576();
        var21.method130(0, 0, arg0.method610() - var15.method361());
        var15.method388(var21, null, arg0.method610(), 1);
        this.field5946 = arg0.method644(0, 0, this.field5942, this.field5942, true);
        this.field5946.method233(0, 0, 3);
        arg0.method556(field5944[0], field5944[1], field5944[2], field5944[3]);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lha;Lep;)V", line = 171)
    private final void method2606(class66 arg0, class443 arg1) {
        method2604(arg0);
        method2610(arg0);
        arg0.method566(field5944);
        arg0.method556(0, 0, this.field5942, this.field5942);
        arg0.method6();
        arg0.method645(0, 0, this.field5942, this.field5942, this.field5934 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field5939) {
                var3 = -arg1.field5936;
                var4 = -arg1.field5933;
                var5 = -arg1.field5941;
            } else {
                var3 = arg1.field5936 - this.field5936;
                var4 = arg1.field5933 - this.field5933;
                var5 = arg1.field5941 - this.field5941;
            }
        }
        if (this.field5943 != 0) {
            int var6 = class789.field10868[this.field5943];
            int var7 = class789.field10864[this.field5943];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field5945 != 0) {
            int var9 = class789.field10868[this.field5945];
            int var10 = class789.field10864[this.field5945];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class498 var12 = field5931.method364((byte) 0, 51200, true);
        var12.method399((short) 0, (short) this.field5935);
        arg0.method626(1.0F);
        arg0.method578(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field5942 * 1024 / (var12.method383() - var12.method381());
        if (this.field5934 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method565(this.field5942 / 2, this.field5942 / 2, var13, var13);
        arg0.method628(arg0.method614());
        class778 var14 = arg0.method614();
        var14.method130(0, 0, arg0.method610() - var12.method361());
        var12.method388(var14, null, 1024, 1);
        int var15 = this.field5942 * 13 / 16;
        int var16 = (this.field5942 - var15) / 2;
        field5940.method1843(var16, var16, var15, var15, 0, this.field5934 | 0xFF000000, 1);
        this.field5946 = arg0.method644(0, 0, this.field5942, this.field5942, true);
        arg0.method6();
        arg0.method645(0, 0, this.field5942, this.field5942, 0, 0);
        field5937.method1843(0, 0, this.field5942, this.field5942, 1, 0, 0);
        this.field5946.method233(0, 0, 0);
        arg0.method556(field5944[0], field5944[1], field5944[2], field5944[3]);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "()V", line = 269)
    public static void method2607() {
        field5931 = null;
        field5940 = null;
        field5937 = null;
        field5944 = null;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(Lha;Lep;)Z", line = 279)
    public final boolean method2608(class66 arg0, class443 arg1) {
        return this.field5946 != null || this.method2611(arg0, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "()V", line = 284)
    public static final void method2609() {
        field5931 = null;
        field5937 = null;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lha;)V", line = 289)
    private static final void method2610(class66 arg0) {
        if (field5937 != null) {
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
        field5937 = arg0.method623(var2, 128, 1, 128, 128, 0);
        field5940 = arg0.method623(var1, 128, 1, 128, 128, 0);
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(Lha;Lep;)Z", line = 350)
    private final boolean method2611(class66 arg0, class443 arg1) {
        if (this.field5946 == null) {
            if (this.field5938 == 0) {
                if (class627.field8588.method1137(12429, this.field5935)) {
                    int[] var3 = class627.field8588.method1139(this.field5935, 11196, false, this.field5942, this.field5942, 0.7F);
                    this.field5946 = arg0.method623(var3, this.field5942, 1, this.field5942, this.field5942, 0);
                }
            } else if (this.field5938 == 2) {
                this.method2605(arg0, arg1);
            } else if (this.field5938 == 1) {
                this.method2606(arg0, arg1);
            }
        }
        return this.field5946 != null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lha;IIIIII)V", line = 384)
    public final void method2612(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5946 == null) {
            return;
        }
        int var8 = this.field5943 - arg5 & 0x3FFF;
        int var9 = this.field5945 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field5947) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field5947) / 2;
        if (var10 < arg4 && this.field5947 + var10 > 0 && var11 < arg3 && this.field5947 + var11 > 0) {
            this.field5946.method1837(arg1 + var11, arg2 + var10, this.field5947, this.field5947);
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "()V", line = 408)
    public final void method2613() {
        this.field5946 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)Z", line = 414)
    public final boolean method2614(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field5939) {
            this.field5932 = 1073741823;
            var8 = this.field5936;
            var9 = this.field5933;
            var10 = this.field5941;
        } else {
            int var5 = this.field5936 - arg0;
            int var6 = this.field5933 - arg1;
            int var7 = this.field5941 - arg2;
            this.field5932 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field5932 == 0) {
                this.field5932 = 1;
            }
            var8 = (var5 << 8) / this.field5932;
            var9 = (var6 << 8) / this.field5932;
            var10 = (var7 << 8) / this.field5932;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field5947 = this.field5948 * arg3 / (this.field5939 ? 1024 : this.field5932);
        } else {
            this.field5947 = 0;
        }
        if (this.field5947 < 8) {
            this.field5946 = null;
            return false;
        }
        int var12 = class783.method4337(this.field5947, (byte) 20);
        if (var12 > arg3) {
            var12 = class381.method2234(-128, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field5942 != var12) {
            this.field5942 = var12;
        }
        this.field5943 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field5945 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field5946 = null;
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 472)
    public class443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field5936 = arg2;
        this.field5933 = arg3;
        this.field5941 = arg4;
        this.field5939 = arg7;
        this.field5935 = arg1;
        this.field5934 = arg6;
        this.field5948 = arg5;
        this.field5938 = arg0;
    }
}
