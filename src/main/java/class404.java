import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class404 {

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    private int field6032;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    private int field6034;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    private int field6028;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Z")
    private boolean field6026;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    private int field6024;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    private int field6029;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field6021;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[I")
    private static int[] field6036 = new int[4];

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    private int field6022;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    private int field6030;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    private int field6031;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public int field6033;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    private int field6037;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lka;")
    private static class497 field6020;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lfs;")
    private class581 field6023;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lfs;")
    private static class581 field6027;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lfs;")
    private static class581 field6035;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(Lha;Lah;)Z")
    public final boolean method3170(class66 arg0, class404 arg1) {
        return this.field6023 != null || this.method3173(arg0, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method3171(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6023 == null) {
            return;
        }
        int var8 = this.field6030 - arg5 & 0x3FFF;
        int var9 = this.field6031 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field6037) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field6037) / 2;
        if (var10 < arg4 && this.field6037 + var10 > 0 && var11 < arg3 && this.field6037 + var11 > 0) {
            this.field6023.method4344(arg1 + var11, arg2 + var10, this.field6037, this.field6037);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lha;Lah;)V")
    private final void method3172(class66 arg0, class404 arg1) {
        class137 var3 = class772.method5596(0, 25329, class90.field1036, this.field6024);
        if (var3 == null) {
            return;
        }
        arg0.method543(field6036);
        arg0.method489(0, 0, this.field6022, this.field6022);
        arg0.method556(0, 0, this.field6022, this.field6022, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field6026) {
                var4 = -arg1.field6032;
                var5 = -arg1.field6034;
                var6 = -arg1.field6028;
            } else {
                var4 = this.field6032 - arg1.field6032;
                var5 = this.field6034 - arg1.field6034;
                var6 = this.field6028 - arg1.field6028;
            }
        }
        if (this.field6030 != 0) {
            int var7 = -this.field6030 & 0x3FFF;
            int var8 = class298.field4704[var7];
            int var9 = class298.field4703[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field6031 != 0) {
            int var11 = -this.field6031 & 0x3FFF;
            int var12 = class298.field4704[var11];
            int var13 = class298.field4703[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method526(1.0F);
        arg0.method516(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class497 var15 = arg0.method552(var3, 2048, 0, 64, 768);
        int var16 = var15.method341() - var15.method335();
        int var17 = var15.method306() - var15.method305();
        int var18 = var15.method335() + var16 / 2;
        int var19 = var15.method305() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method479(var18, var19, var20, var20);
        arg0.method495(arg0.method517());
        class501 var21 = arg0.method511();
        var21.method2389(0, 0, arg0.method583() - var15.method340());
        var15.method323(var21, null, arg0.method583(), 1);
        this.field6023 = arg0.method568(0, 0, this.field6022, this.field6022, true);
        this.field6023.method992(0, 0, 3);
        arg0.method489(field6036[0], field6036[1], field6036[2], field6036[3]);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Lha;Lah;)Z")
    private final boolean method3173(class66 arg0, class404 arg1) {
        if (this.field6023 == null) {
            if (this.field6021 == 0) {
                if (class702.field10199.method1363(this.field6024, (byte) 95)) {
                    int[] var3 = class702.field10199.method1365((byte) -59, this.field6022, false, 0.7F, this.field6024, this.field6022);
                    this.field6023 = arg0.method520(0, this.field6022, var3, (byte) 41, this.field6022, this.field6022);
                }
            } else if (this.field6021 == 2) {
                this.method3172(arg0, arg1);
            } else if (this.field6021 == 1) {
                this.method3175(arg0, arg1);
            }
        }
        return this.field6023 != null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lha;)V")
    private static final void method3174(class66 arg0) {
        if (field6035 != null) {
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
        field6035 = arg0.method520(0, 128, var2, (byte) 41, 128, 128);
        field6027 = arg0.method520(0, 128, var1, (byte) 41, 128, 128);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lha;Lah;)V")
    private final void method3175(class66 arg0, class404 arg1) {
        method3178(arg0);
        method3174(arg0);
        arg0.method543(field6036);
        arg0.method489(0, 0, this.field6022, this.field6022);
        arg0.method586();
        arg0.method556(0, 0, this.field6022, this.field6022, this.field6025 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field6026) {
                var3 = -arg1.field6032;
                var4 = -arg1.field6034;
                var5 = -arg1.field6028;
            } else {
                var3 = arg1.field6032 - this.field6032;
                var4 = arg1.field6034 - this.field6034;
                var5 = arg1.field6028 - this.field6028;
            }
        }
        if (this.field6030 != 0) {
            int var6 = class298.field4704[this.field6030];
            int var7 = class298.field4703[this.field6030];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field6031 != 0) {
            int var9 = class298.field4704[this.field6031];
            int var10 = class298.field4703[this.field6031];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class497 var12 = field6020.method332((byte) 0, 51200, true);
        var12.method329((short) 0, (short) this.field6024);
        arg0.method526(1.0F);
        arg0.method516(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field6022 * 1024 / (var12.method341() - var12.method335());
        if (this.field6025 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method479(this.field6022 / 2, this.field6022 / 2, var13, var13);
        arg0.method495(arg0.method517());
        class501 var14 = arg0.method517();
        var14.method2389(0, 0, arg0.method583() - var12.method340());
        var12.method323(var14, null, 1024, 1);
        int var15 = this.field6022 * 13 / 16;
        int var16 = (this.field6022 - var15) / 2;
        field6027.method4343(var16, var16, var15, var15, 0, this.field6025 | 0xFF000000, 1);
        this.field6023 = arg0.method568(0, 0, this.field6022, this.field6022, true);
        arg0.method586();
        arg0.method556(0, 0, this.field6022, this.field6022, 0, 0);
        field6035.method4343(0, 0, this.field6022, this.field6022, 1, 0, 0);
        this.field6023.method992(0, 0, 0);
        arg0.method489(field6036[0], field6036[1], field6036[2], field6036[3]);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)Z")
    public final boolean method3176(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field6026) {
            this.field6033 = 1073741823;
            var8 = this.field6032;
            var9 = this.field6034;
            var10 = this.field6028;
        } else {
            int var5 = this.field6032 - arg0;
            int var6 = this.field6034 - arg1;
            int var7 = this.field6028 - arg2;
            this.field6033 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field6033 == 0) {
                this.field6033 = 1;
            }
            var8 = (var5 << 8) / this.field6033;
            var9 = (var6 << 8) / this.field6033;
            var10 = (var7 << 8) / this.field6033;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field6037 = this.field6029 * arg3 / (this.field6026 ? 1024 : this.field6033);
        } else {
            this.field6037 = 0;
        }
        if (this.field6037 < 8) {
            this.field6023 = null;
            return false;
        }
        int var12 = class12.method83((byte) -1, this.field6037);
        if (var12 > arg3) {
            var12 = class554.method4172(arg3, 24500);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field6022 != var12) {
            this.field6022 = var12;
        }
        this.field6030 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field6031 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field6023 = null;
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()V")
    public static final void method3177() {
        field6020 = null;
        field6035 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lha;)V")
    private static final void method3178(class66 arg0) {
        if (field6020 != null) {
            return;
        }
        class137 var1 = new class137(580, 1104, 1);
        var1.method1178((byte) 3, (short) 32767, (short) 1024, (short) 0, (byte) 0, (short) 1024, (short) 1024, (short) 0, (byte) 0, (byte) 0);
        var1.method1166(128, (byte) -18, 0, 0);
        var1.method1166(-128, (byte) -38, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class298.field4704[var3];
            int var5 = class298.field4703[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class298.field4703[var12] >> 7;
                int var14 = class298.field4704[var12] * var4 >> 21;
                int var15 = class298.field4704[var12] * var5 >> 21;
                var1.method1166(var13, (byte) -72, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1171((byte) -128, (byte) 0, (byte) 0, (byte) 0, (short) 127, 0, (short) 0, var7, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1171((byte) -115, (byte) 0, (byte) 0, (byte) 0, (short) 127, var8, (short) 0, var7, var10);
                    var1.method1171((byte) 61, (byte) 0, (byte) 0, (byte) 0, (short) 127, var10, (short) 0, var7, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1171((byte) -122, (byte) 0, (byte) 0, (byte) 0, (short) 127, var7, (short) 0, 1, var8);
            }
        }
        var1.field1600 = var1.field1619;
        var1.field1610 = null;
        var1.field1586 = null;
        var1.field1621 = null;
        field6020 = arg0.method552(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
    public final void method3179() {
        this.field6023 = null;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()V")
    public static void method3180() {
        field6020 = null;
        field6027 = null;
        field6035 = null;
        field6036 = null;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field6032 = arg2;
        this.field6034 = arg3;
        this.field6028 = arg4;
        this.field6026 = arg7;
        this.field6024 = arg1;
        this.field6025 = arg6;
        this.field6029 = arg5;
        this.field6021 = arg0;
    }
}
