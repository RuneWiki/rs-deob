import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 {

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Z")
    private boolean field243;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[I")
    private static int[] field233 = new int[4];

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lk;")
    private static class183 field245;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "La;")
    private class49 field240;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[B")
    private static byte[] field231;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)Z")
    public final boolean method136(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field243) {
            this.field235 = 1073741823;
            var8 = this.field239;
            var9 = this.field238;
            var10 = this.field232;
        } else {
            int var5 = this.field239 - arg0;
            int var6 = this.field238 - arg1;
            int var7 = this.field232 - arg2;
            this.field235 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field235 == 0) {
                this.field235 = 1;
            }
            var8 = (var5 << 8) / this.field235;
            var9 = (var6 << 8) / this.field235;
            var10 = (var7 << 8) / this.field235;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field237 = this.field236 * arg3 / (this.field243 ? 1024 : this.field235);
        } else {
            this.field237 = 0;
        }
        if (this.field237 < 8) {
            this.method147();
            this.field240 = null;
            return false;
        }
        int var12 = class77.method618(this.field237, (byte) 119);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field242 != var12) {
            this.field242 = var12;
        }
        this.field246 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field244 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field240 = null;
        return true;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lfk;)V")
    private final void method137(class14 arg0) {
        method141();
        method144();
        this.field240 = new class213(this.field242, this.field242);
        class201.method1341(field233);
        this.field240.method415();
        class97.method765();
        class201.method1333(0, 0, this.field242, this.field242, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field243) {
                var2 = -arg0.field239;
                var3 = -arg0.field238;
                var4 = -arg0.field232;
            } else {
                var2 = this.field239 - arg0.field239;
                var3 = this.field238 - arg0.field238;
                var4 = this.field232 - arg0.field232;
            }
        }
        if (this.field246 != 0) {
            int var5 = class97.field1557[this.field246];
            int var6 = class97.field1556[this.field246];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field244 != 0) {
            int var8 = this.field244 - 1024 & 0x7FF;
            int var9 = class97.field1557[var8];
            int var10 = class97.field1556[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class236.method1586(field245.field2720, 0, field245.field2725, (short) class97.field1547.method1893(this.field241, -102));
        class281 var12 = field245.method1226(64, 512, -var2, -var3, -var4);
        int var13 = var12.method1535() - var12.method1550();
        int var14 = var12.method1878() - var12.method223();
        if (var13 > var14) {
            int var15 = this.field247 == 0 ? (var13 << 9) / this.field242 : (var13 * 16 << 9) / (this.field242 * 13);
            var12.method1883(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field247 == 0 ? (var14 << 9) / this.field242 : (var14 * 16 << 9) / (this.field242 * 13);
            var12.method1883(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field247 == 0) {
            for (int var17 = 0; var17 < class201.field3150.length; var17++) {
                if (class201.field3150[var17] != 0) {
                    class201.field3150[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method140();
            this.method145();
        }
        class223.field3508.method1710(18814);
        class201.method1349(field233);
        class97.method765();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method138(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field231[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method139(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field231[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()V")
    private final void method140() {
        int var1 = this.field242 * 3 / 32;
        int var3 = this.field242 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class201.field3146 * var1 + var1;
        int var8 = class201.field3146 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class201.field3143) {
            var4 = var3 - (var1 + var3 - class201.field3143);
        }
        if (var1 < class201.field3149) {
            int var11 = class201.field3149 - var1;
            var4 -= var11;
            var7 += class201.field3146 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class201.field3147) {
            int var12 = var1 + var3 - class201.field3147;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class201.field3142) {
            int var13 = class201.field3142 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method139(class201.field3150, 0, this.field247, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()V")
    private static final void method141() {
        if (field245 != null) {
            return;
        }
        class183 var0 = field245 = new class183(260, 480, 0);
        int[] var1 = var0.field2732;
        int[] var2 = var0.field2729;
        int[] var3 = var0.field2726;
        int[] var4 = var0.field2713;
        int[] var5 = var0.field2750;
        int[] var6 = var0.field2756;
        var0.field2741 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class97.field1557[var8] >> 1;
            int var10 = class97.field1556[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class97.field1556[var17] >> 9;
                int var19 = (class97.field1557[var17] >> 1) * var9 >> 23;
                int var20 = (class97.field1557[var17] >> 1) * var10 >> 23;
                var1[var0.field2741] = var20;
                var2[var0.field2741] = var18;
                var3[var0.field2741] = -var19;
                var0.field2741++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field2725] = 0;
                var5[var0.field2725] = var13;
                var6[var0.field2725] = var12;
                var0.field2725++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field2725] = var13;
                    var5[var0.field2725] = var15;
                    var6[var0.field2725] = var12;
                    var0.field2725++;
                    var4[var0.field2725] = var15;
                    var5[var0.field2725] = var16;
                    var6[var0.field2725] = var12;
                    var0.field2725++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field2725] = var12;
                var5[var0.field2725] = var13;
                var6[var0.field2725] = 1;
                var0.field2725++;
            }
        }
        var0.field2723 = var0.field2741;
        var0.field2736 = null;
        var0.field2715 = null;
        var0.field2754 = null;
        var0.field2735 = null;
        var0.field2734 = null;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "()V")
    public static void method142() {
        field245 = null;
        field231 = null;
        field233 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIILfk;)V")
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class14 arg6) {
        int var8 = this.field246 - arg4 & 0x7FF;
        int var9 = this.field244 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field237) / 2 + var10;
        int var13 = (arg2 - this.field237) / 2 + var11;
        if (var12 < arg3 && this.field237 + var12 > 0 && var13 < arg2 && this.field237 + var13 > 0 && this.method148(arg6)) {
            this.field240.method39(arg0 + var13, arg1 + var12, this.field237, this.field237);
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "()V")
    private static final void method144() {
        if (field231 != null) {
            return;
        }
        field231 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field231[var4 + var6] = field231[var4 + var9] = field231[var5 + var6] = field231[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "()V")
    private final void method145() {
        int var1 = this.field242;
        int var2 = this.field242;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class201.field3146 - var1;
        if (var2 > class201.field3143) {
            var2 -= var2 - class201.field3143;
        }
        if (class201.field3149 > 0) {
            int var9 = class201.field3149;
            var2 -= var9;
            var7 += class201.field3146 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class201.field3147) {
            int var10 = var1 - class201.field3147;
            var1 -= var10;
            var8 += var10;
        }
        if (class201.field3142 > 0) {
            int var11 = class201.field3142;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method138(class201.field3150, this.field247, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lfk;)V")
    private final void method146(class14 arg0) {
        class183 var2 = class183.method1225(class96.field1541, this.field241, 0);
        if (var2 == null) {
            return;
        }
        this.field240 = new class49(this.field242, this.field242);
        class201.method1341(field233);
        this.field240.method415();
        class97.method765();
        class201.method1333(0, 0, this.field242, this.field242, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field243) {
                var3 = -arg0.field239;
                var4 = -arg0.field238;
                var5 = -arg0.field232;
            } else {
                var3 = this.field239 - arg0.field239;
                var4 = this.field238 - arg0.field238;
                var5 = this.field232 - arg0.field232;
            }
        }
        if (this.field246 != 0) {
            int var6 = class97.field1557[this.field246];
            int var7 = class97.field1556[this.field246];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field244 != 0) {
            int var9 = this.field244 - 1024 & 0x7FF;
            int var10 = class97.field1557[var9];
            int var11 = class97.field1556[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class281 var13 = var2.method1226(64, 768, -var3, -var4, -var5);
        int var14 = var13.method1535() - var13.method1550();
        int var15 = var13.method1878() - var13.method223();
        int var16 = var13.method1550() + var14 / 2;
        int var17 = var13.method223() + var15 / 2;
        if (var14 > var15) {
            var13.method1883(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field242);
        } else {
            var13.method1883(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field242);
        }
        class223.field3508.method1710(18814);
        class201.method1349(field233);
        class97.method765();
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "()V")
    private final void method147() {
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(Lfk;)Z")
    private final boolean method148(class14 arg0) {
        if (this.field240 == null) {
            if (this.field234 == 0) {
                this.field240 = class97.field1547.method1896(this.field242, false, class97.field1549, this.field241, true);
            } else if (this.field234 == 2) {
                this.method146(arg0);
            } else if (this.field234 == 1) {
                this.method137(arg0);
            }
        }
        return this.field240 != null;
    }

    @OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method147();
        super.finalize();
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field239 = arg2;
        this.field238 = arg3;
        this.field232 = arg4;
        this.field243 = arg7;
        this.field241 = arg1;
        this.field247 = arg6;
        this.field236 = arg5;
        this.field234 = arg0;
    }
}
