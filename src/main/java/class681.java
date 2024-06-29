import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class681 {

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    private int field9573;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    private int field9566;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    private int field9581;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Z")
    private boolean field9570;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    private int field9577;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    private int field9576;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    private int field9574;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    private int field9568;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "[I")
    private static int[] field9578 = new int[4];

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    private int field9565;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    private int field9567;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public int field9571;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    private int field9579;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    private int field9582;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "Lda;")
    private static class474 field9572;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "Lf;")
    private static class536 field9569;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "Lf;")
    private class536 field9575;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Lf;")
    private static class536 field9580;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lr;IIIIII)V", line = 7)
    public final void method3830(class566 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field9575 == null) {
            return;
        }
        int var8 = this.field9567 - arg5 & 0x3FFF;
        int var9 = this.field9579 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field9565) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field9565) / 2;
        if (var10 < arg4 && this.field9565 + var10 > 0 && var11 < arg3 && this.field9565 + var11 > 0) {
            this.field9575.method2899(arg1 + var11, arg2 + var10, this.field9565, this.field9565);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lr;)V", line = 31)
    private static final void method3831(class566 arg0) {
        if (field9569 != null) {
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
        field9569 = arg0.method1025(var2, 0, 128, 128, 128);
        field9580 = arg0.method1025(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(Lr;)V", line = 94)
    private static final void method3832(class566 arg0) {
        if (field9572 != null) {
            return;
        }
        class47 var1 = new class47(580, 1104, 1);
        var1.method287((short) 1024, (byte) 0, (short) 1024, (short) 0, (short) 32767, 0, (byte) 0, (short) 0, (short) 1024, (byte) 0);
        var1.method286(0, 0, 128, -21519);
        var1.method286(0, 0, -128, -21519);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class453.field5810[var3];
            int var5 = class453.field5811[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class453.field5811[var12] >> 7;
                int var14 = class453.field5810[var12] * var4 >> 21;
                int var15 = class453.field5810[var12] * var5 >> 21;
                var1.method286(var15, -var14, var13, -21519);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method292(var7, (short) 127, (byte) 0, (byte) 0, var8, 0, (short) 0, 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method292(var7, (short) 127, (byte) 0, (byte) 0, var10, 0, (short) 0, var8, (byte) 0);
                    var1.method292(var7, (short) 127, (byte) 0, (byte) 0, var11, 0, (short) 0, var10, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method292(1, (short) 127, (byte) 0, (byte) 0, var8, 0, (short) 0, var7, (byte) 0);
            }
        }
        var1.field625 = var1.field639;
        var1.field632 = null;
        var1.field656 = null;
        var1.field636 = null;
        field9572 = arg0.method1019(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lr;Lraa;)Z", line = 178)
    private final boolean method3833(class566 arg0, class681 arg1) {
        if (this.field9575 == null) {
            if (this.field9568 == 0) {
                if (class177.field2288.method2480(false, this.field9577)) {
                    int[] var3 = class177.field2288.method2488(0.7F, this.field9582, (byte) 85, false, this.field9582, this.field9577);
                    this.field9575 = arg0.method1025(var3, 0, this.field9582, this.field9582, this.field9582);
                }
            } else if (this.field9568 == 2) {
                this.method3836(arg0, arg1);
            } else if (this.field9568 == 1) {
                this.method3839(arg0, arg1);
            }
        }
        return this.field9575 != null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "()V", line = 214)
    public static final void method3834() {
        field9572 = null;
        field9569 = null;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(Lr;Lraa;)Z", line = 218)
    public final boolean method3835(class566 arg0, class681 arg1) {
        return this.field9575 != null || this.method3833(arg0, arg1);
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(Lr;Lraa;)V", line = 222)
    private final void method3836(class566 arg0, class681 arg1) {
        class47 var3 = class156.method893(this.field9577, class227.field2829, 0, false);
        if (var3 == null) {
            return;
        }
        arg0.method1060(field9578);
        arg0.method1083(0, 0, this.field9582, this.field9582);
        arg0.method1090(0, 0, this.field9582, this.field9582, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field9570) {
                var4 = -arg1.field9573;
                var5 = -arg1.field9566;
                var6 = -arg1.field9581;
            } else {
                var4 = this.field9573 - arg1.field9573;
                var5 = this.field9566 - arg1.field9566;
                var6 = this.field9581 - arg1.field9581;
            }
        }
        if (this.field9567 != 0) {
            int var7 = -this.field9567 & 0x3FFF;
            int var8 = class453.field5810[var7];
            int var9 = class453.field5811[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field9579 != 0) {
            int var11 = -this.field9579 & 0x3FFF;
            int var12 = class453.field5810[var11];
            int var13 = class453.field5811[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method1054(1.0F);
        arg0.method994(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class474 var15 = arg0.method1019(var3, 2048, 0, 64, 768);
        int var16 = var15.method699() - var15.method758();
        int var17 = var15.method703() - var15.method757();
        int var18 = var15.method758() + var16 / 2;
        int var19 = var15.method757() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1048(var18, var19, var20, var20);
        arg0.method1058(arg0.method1087());
        class491 var21 = arg0.method995();
        var21.method914(0, 0, arg0.method974() - var15.method734());
        var15.method751(var21, null, arg0.method974(), 1);
        this.field9575 = arg0.method1053(0, 0, this.field9582, this.field9582, true);
        this.field9575.method158(0, 0, 3);
        arg0.method1083(field9578[0], field9578[1], field9578[2], field9578[3]);
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "()V", line = 306)
    public static void method3837() {
        field9572 = null;
        field9580 = null;
        field9569 = null;
        field9578 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIII)Z", line = 315)
    public final boolean method3838(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field9570) {
            this.field9571 = 1073741823;
            var8 = this.field9573;
            var9 = this.field9566;
            var10 = this.field9581;
        } else {
            int var5 = this.field9573 - arg0;
            int var6 = this.field9566 - arg1;
            int var7 = this.field9581 - arg2;
            this.field9571 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field9571 == 0) {
                this.field9571 = 1;
            }
            var8 = (var5 << 8) / this.field9571;
            var9 = (var6 << 8) / this.field9571;
            var10 = (var7 << 8) / this.field9571;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field9565 = this.field9574 * arg3 / (this.field9570 ? 1024 : this.field9571);
        } else {
            this.field9565 = 0;
        }
        if (this.field9565 < 8) {
            this.field9575 = null;
            return false;
        }
        int var12 = class391.method2101(this.field9565, 128);
        if (var12 > arg3) {
            var12 = class257.method1497((byte) 114, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field9582 != var12) {
            this.field9582 = var12;
        }
        this.field9567 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field9579 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field9575 = null;
        return true;
    }

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "(Lr;Lraa;)V", line = 373)
    private final void method3839(class566 arg0, class681 arg1) {
        method3832(arg0);
        method3831(arg0);
        arg0.method1060(field9578);
        arg0.method1083(0, 0, this.field9582, this.field9582);
        arg0.method1031();
        arg0.method1090(0, 0, this.field9582, this.field9582, this.field9576 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field9570) {
                var3 = -arg1.field9573;
                var4 = -arg1.field9566;
                var5 = -arg1.field9581;
            } else {
                var3 = arg1.field9573 - this.field9573;
                var4 = arg1.field9566 - this.field9566;
                var5 = arg1.field9581 - this.field9581;
            }
        }
        if (this.field9567 != 0) {
            int var6 = class453.field5810[this.field9567];
            int var7 = class453.field5811[this.field9567];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field9579 != 0) {
            int var9 = class453.field5810[this.field9579];
            int var10 = class453.field5811[this.field9579];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class474 var12 = field9572.method711((byte) 0, 51200, true);
        if (arg0.method1027()) {
            var12.method705((short) 0, (short) this.field9577);
        } else {
            var12.method694((short) 127, class177.field2288.method2486(this.field9577, (byte) 86).field247);
            var12.method705((short) 0, (short) -1);
        }
        arg0.method1054(1.0F);
        arg0.method994(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field9582 * 1024 / (var12.method699() - var12.method758());
        if (this.field9576 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1048(this.field9582 / 2, this.field9582 / 2, var13, var13);
        arg0.method1058(arg0.method1087());
        class491 var14 = arg0.method1087();
        var14.method914(0, 0, arg0.method974() - var12.method734());
        var12.method751(var14, null, 1024, 1);
        int var15 = this.field9582 * 13 / 16;
        int var16 = (this.field9582 - var15) / 2;
        field9580.method2901(var16, var16, var15, var15, 0, this.field9576 | 0xFF000000, 1);
        this.field9575 = arg0.method1053(0, 0, this.field9582, this.field9582, true);
        arg0.method1031();
        arg0.method1090(0, 0, this.field9582, this.field9582, 0, 0);
        field9569.method2901(0, 0, this.field9582, this.field9582, 1, 0, 0);
        this.field9575.method158(0, 0, 0);
        arg0.method1083(field9578[0], field9578[1], field9578[2], field9578[3]);
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "()V", line = 468)
    public final void method3840() {
        this.field9575 = null;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field9573 = arg2;
        this.field9566 = arg3;
        this.field9581 = arg4;
        this.field9570 = arg7;
        this.field9577 = arg1;
        this.field9576 = arg6;
        this.field9574 = arg5;
        this.field9568 = arg0;
    }
}
