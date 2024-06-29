import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class623 {

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    private int field8801;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    private int field8800;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    private int field8794;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Z")
    private boolean field8802;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    private int field8793;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    private int field8791;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    private int field8799;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    private int field8790;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[I")
    private static int[] field8788 = new int[4];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    private int field8787;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    private int field8795;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public int field8797;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    private int field8798;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    private int field8804;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lda;")
    private static class473 field8796;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lf;")
    private class534 field8789;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lf;")
    private static class534 field8792;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lf;")
    private static class534 field8803;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public static final void method3491() {
        field8796 = null;
        field8792 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public final void method3492() {
        this.field8789 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lr;Lka;)Z")
    private final boolean method3493(class564 arg0, class623 arg1) {
        if (this.field8789 == null) {
            if (this.field8790 == 0) {
                if (class93.field939.method144(8649, this.field8793)) {
                    int[] var3 = class93.field939.method141(false, this.field8793, this.field8787, 0.7F, 16944, this.field8787);
                    this.field8789 = arg0.method1017(var3, 0, this.field8787, this.field8787, this.field8787);
                }
            } else if (this.field8790 == 2) {
                this.method3496(arg0, arg1);
            } else if (this.field8790 == 1) {
                this.method3494(arg0, arg1);
            }
        }
        return this.field8789 != null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lr;Lka;)V")
    private final void method3494(class564 arg0, class623 arg1) {
        method3495(arg0);
        method3497(arg0);
        arg0.method963(field8788);
        arg0.method982(0, 0, this.field8787, this.field8787);
        arg0.method969();
        arg0.method1022(0, 0, this.field8787, this.field8787, this.field8791 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field8802) {
                var3 = -arg1.field8801;
                var4 = -arg1.field8800;
                var5 = -arg1.field8794;
            } else {
                var3 = arg1.field8801 - this.field8801;
                var4 = arg1.field8800 - this.field8800;
                var5 = arg1.field8794 - this.field8794;
            }
        }
        if (this.field8798 != 0) {
            int var6 = class435.field6134[this.field8798];
            int var7 = class435.field6135[this.field8798];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field8804 != 0) {
            int var9 = class435.field6134[this.field8804];
            int var10 = class435.field6135[this.field8804];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class473 var12 = field8796.method1877((byte) 0, 51200, true);
        if (arg0.method939()) {
            var12.method1906((short) 0, (short) this.field8793);
        } else {
            var12.method1882((short) 127, class93.field939.method140(this.field8793, 862).field3683);
            var12.method1906((short) 0, (short) -1);
        }
        arg0.method949(1.0F);
        arg0.method1032(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field8787 * 1024 / (var12.method1870() - var12.method1912());
        if (this.field8791 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method997(this.field8787 / 2, this.field8787 / 2, var13, var13);
        arg0.method992(arg0.method1035());
        class490 var14 = arg0.method1035();
        var14.method23(0, 0, arg0.method966() - var12.method1865());
        var12.method1875(var14, null, 1024, 1);
        int var15 = this.field8787 * 13 / 16;
        int var16 = (this.field8787 - var15) / 2;
        field8803.method2997(var16, var16, var15, var15, 0, this.field8791 | 0xFF000000, 1);
        this.field8789 = arg0.method951(0, 0, this.field8787, this.field8787, true);
        arg0.method969();
        arg0.method1022(0, 0, this.field8787, this.field8787, 0, 0);
        field8792.method2997(0, 0, this.field8787, this.field8787, 1, 0, 0);
        this.field8789.method488(0, 0, 0);
        arg0.method982(field8788[0], field8788[1], field8788[2], field8788[3]);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lr;)V")
    private static final void method3495(class564 arg0) {
        if (field8796 != null) {
            return;
        }
        class581 var1 = new class581(580, 1104, 1);
        var1.method3295((byte) 0, (byte) 0, (short) 1024, (short) 1024, (byte) 0, (short) 0, (short) 32767, (byte) 64, (short) 0, (short) 1024);
        var1.method3292(-89, 0, 0, 128);
        var1.method3292(-101, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class435.field6134[var3];
            int var5 = class435.field6135[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class435.field6135[var12] >> 7;
                int var14 = class435.field6134[var12] * var4 >> 21;
                int var15 = class435.field6134[var12] * var5 >> 21;
                var1.method3292(-57, -var14, var15, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3286(var7, (short) 127, (byte) 0, (byte) 107, (short) 0, (byte) 0, (byte) 0, 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3286(var7, (short) 127, (byte) 0, (byte) 3, (short) 0, (byte) 0, (byte) 0, var8, var10);
                    var1.method3286(var7, (short) 127, (byte) 0, (byte) 26, (short) 0, (byte) 0, (byte) 0, var10, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3286(1, (short) 127, (byte) 0, (byte) -93, (short) 0, (byte) 0, (byte) 0, var7, var8);
            }
        }
        var1.field8250 = var1.field8268;
        var1.field8218 = null;
        var1.field8216 = null;
        var1.field8228 = null;
        field8796 = arg0.method1051(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lr;Lka;)V")
    private final void method3496(class564 arg0, class623 arg1) {
        class581 var3 = class331.method1919(0, (byte) -43, class291.field3641, this.field8793);
        if (var3 == null) {
            return;
        }
        arg0.method963(field8788);
        arg0.method982(0, 0, this.field8787, this.field8787);
        arg0.method1022(0, 0, this.field8787, this.field8787, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field8802) {
                var4 = -arg1.field8801;
                var5 = -arg1.field8800;
                var6 = -arg1.field8794;
            } else {
                var4 = this.field8801 - arg1.field8801;
                var5 = this.field8800 - arg1.field8800;
                var6 = this.field8794 - arg1.field8794;
            }
        }
        if (this.field8798 != 0) {
            int var7 = -this.field8798 & 0x3FFF;
            int var8 = class435.field6134[var7];
            int var9 = class435.field6135[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field8804 != 0) {
            int var11 = -this.field8804 & 0x3FFF;
            int var12 = class435.field6134[var11];
            int var13 = class435.field6135[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method949(1.0F);
        arg0.method1032(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class473 var15 = arg0.method1051(var3, 2048, 0, 64, 768);
        int var16 = var15.method1870() - var15.method1912();
        int var17 = var15.method1853() - var15.method1869();
        int var18 = var15.method1912() + var16 / 2;
        int var19 = var15.method1869() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method997(var18, var19, var20, var20);
        arg0.method992(arg0.method1035());
        class490 var21 = arg0.method950();
        var21.method23(0, 0, arg0.method966() - var15.method1865());
        var15.method1875(var21, null, arg0.method966(), 1);
        this.field8789 = arg0.method951(0, 0, this.field8787, this.field8787, true);
        this.field8789.method488(0, 0, 3);
        arg0.method982(field8788[0], field8788[1], field8788[2], field8788[3]);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lr;)V")
    private static final void method3497(class564 arg0) {
        if (field8792 != null) {
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
        field8792 = arg0.method1017(var2, 0, 128, 128, 128);
        field8803 = arg0.method1017(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)Z")
    public final boolean method3498(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field8802) {
            this.field8797 = 1073741823;
            var8 = this.field8801;
            var9 = this.field8800;
            var10 = this.field8794;
        } else {
            int var5 = this.field8801 - arg0;
            int var6 = this.field8800 - arg1;
            int var7 = this.field8794 - arg2;
            this.field8797 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field8797 == 0) {
                this.field8797 = 1;
            }
            var8 = (var5 << 8) / this.field8797;
            var9 = (var6 << 8) / this.field8797;
            var10 = (var7 << 8) / this.field8797;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field8795 = this.field8799 * arg3 / (this.field8802 ? 1024 : this.field8797);
        } else {
            this.field8795 = 0;
        }
        if (this.field8795 < 8) {
            this.field8789 = null;
            return false;
        }
        int var12 = class553.method3138(1781323777, this.field8795);
        if (var12 > arg3) {
            var12 = class668.method3699(28069, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field8787 != var12) {
            this.field8787 = var12;
        }
        this.field8798 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field8804 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field8789 = null;
        return true;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(Lr;Lka;)Z")
    public final boolean method3499(class564 arg0, class623 arg1) {
        return this.field8789 != null || this.method3493(arg0, arg1);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lr;IIIIII)V")
    public final void method3500(class564 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8789 == null) {
            return;
        }
        int var8 = this.field8798 - arg5 & 0x3FFF;
        int var9 = this.field8804 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field8795) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field8795) / 2;
        if (var10 < arg4 && this.field8795 + var10 > 0 && var11 < arg3 && this.field8795 + var11 > 0) {
            this.field8789.method3002(arg1 + var11, arg2 + var10, this.field8795, this.field8795);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public static void method3501() {
        field8796 = null;
        field8803 = null;
        field8792 = null;
        field8788 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field8801 = arg2;
        this.field8800 = arg3;
        this.field8794 = arg4;
        this.field8802 = arg7;
        this.field8793 = arg1;
        this.field8791 = arg6;
        this.field8799 = arg5;
        this.field8790 = arg0;
    }
}
