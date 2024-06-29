import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class246 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    private int field3993;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    private int field4003;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    private int field3995;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Z")
    private boolean field3998;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    private int field4000;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    private int field3999;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    private int field4004;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
    private static int[] field3991 = new int[4];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    private int field3989;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    private int field3994;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    private int field4001;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    private int field4002;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lui;")
    private static class234 field3990;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Ljb;")
    private class276 field3992;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[B")
    private static byte[] field3996;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
    public static void method1689() {
        field3990 = null;
        field3996 = null;
        field3991 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljc;)V")
    private final void method1690(class246 arg0) {
        method1700();
        method1694();
        this.field3992 = new class123(this.field4001, this.field4001);
        class211.method1428(field3991);
        this.field3992.method1863();
        class195.method1331();
        class211.method1424(0, 0, this.field4001, this.field4001, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3998) {
                var2 = -arg0.field3993;
                var3 = -arg0.field4003;
                var4 = -arg0.field3995;
            } else {
                var2 = this.field3993 - arg0.field3993;
                var3 = this.field4003 - arg0.field4003;
                var4 = this.field3995 - arg0.field3995;
            }
        }
        if (this.field4002 != 0) {
            int var5 = class195.field3091[this.field4002];
            int var6 = class195.field3089[this.field4002];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3994 != 0) {
            int var8 = this.field3994 - 1024 & 0x7FF;
            int var9 = class195.field3091[var8];
            int var10 = class195.field3089[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class175.method1190(field3990.field3714, 0, field3990.field3752, (short) class195.field3087.method497(this.field4000, (byte) -74));
        class54 var12 = field3990.method1585(64, 512, -var2, -var3, -var4);
        int var13 = var12.method94() - var12.method80();
        int var14 = var12.method413() - var12.method102();
        if (var13 > var14) {
            int var15 = this.field3999 == 0 ? (var13 << 9) / this.field4001 : (var13 * 16 << 9) / (this.field4001 * 13);
            var12.method401(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3999 == 0 ? (var14 << 9) / this.field4001 : (var14 * 16 << 9) / (this.field4001 * 13);
            var12.method401(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3999 == 0) {
            for (int var17 = 0; var17 < class211.field3275.length; var17++) {
                if (class211.field3275[var17] != 0) {
                    class211.field3275[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1696();
            this.method1701();
        }
        class249.field4023.method176((byte) 64);
        class211.method1430(field3991);
        class195.method1331();
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()V")
    private final void method1691() {
    }

    @OriginalMember(owner = "client!jc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1691();
        super.finalize();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method1692(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3996[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)Z")
    public final boolean method1693(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3998) {
            this.field4005 = 1073741823;
            var8 = this.field3993;
            var9 = this.field4003;
            var10 = this.field3995;
        } else {
            int var5 = this.field3993 - arg0;
            int var6 = this.field4003 - arg1;
            int var7 = this.field3995 - arg2;
            this.field4005 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4005 == 0) {
                this.field4005 = 1;
            }
            var8 = (var5 << 8) / this.field4005;
            var9 = (var6 << 8) / this.field4005;
            var10 = (var7 << 8) / this.field4005;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3989 = this.field3997 * arg3 / (this.field3998 ? 1024 : this.field4005);
        } else {
            this.field3989 = 0;
        }
        if (this.field3989 < 8) {
            this.method1691();
            this.field3992 = null;
            return false;
        }
        int var12 = class199.method1350(this.field3989, -120);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4001 != var12) {
            this.field4001 = var12;
        }
        this.field4002 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3994 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3992 = null;
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()V")
    private static final void method1694() {
        if (field3996 != null) {
            return;
        }
        field3996 = new byte[16384];
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
                field3996[var4 + var6] = field3996[var4 + var9] = field3996[var5 + var6] = field3996[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Ljc;)V")
    private final void method1695(class246 arg0) {
        class234 var2 = class234.method1575(class119.field1930, this.field4000, 0);
        if (var2 == null) {
            return;
        }
        this.field3992 = new class276(this.field4001, this.field4001);
        class211.method1428(field3991);
        this.field3992.method1863();
        class195.method1331();
        class211.method1424(0, 0, this.field4001, this.field4001, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3998) {
                var3 = -arg0.field3993;
                var4 = -arg0.field4003;
                var5 = -arg0.field3995;
            } else {
                var3 = this.field3993 - arg0.field3993;
                var4 = this.field4003 - arg0.field4003;
                var5 = this.field3995 - arg0.field3995;
            }
        }
        if (this.field4002 != 0) {
            int var6 = class195.field3091[this.field4002];
            int var7 = class195.field3089[this.field4002];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3994 != 0) {
            int var9 = this.field3994 - 1024 & 0x7FF;
            int var10 = class195.field3091[var9];
            int var11 = class195.field3089[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class54 var13 = var2.method1585(64, 768, -var3, -var4, -var5);
        int var14 = var13.method94() - var13.method80();
        int var15 = var13.method413() - var13.method102();
        int var16 = var13.method80() + var14 / 2;
        int var17 = var13.method102() + var15 / 2;
        if (var14 > var15) {
            var13.method401(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field4001);
        } else {
            var13.method401(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field4001);
        }
        class249.field4023.method176((byte) 64);
        class211.method1430(field3991);
        class195.method1331();
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()V")
    private final void method1696() {
        int var1 = this.field4001 * 3 / 32;
        int var3 = this.field4001 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class211.field3279 * var1 + var1;
        int var8 = class211.field3279 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class211.field3272) {
            var4 = var3 - (var1 + var3 - class211.field3272);
        }
        if (var1 < class211.field3280) {
            int var11 = class211.field3280 - var1;
            var4 -= var11;
            var7 += class211.field3279 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class211.field3276) {
            int var12 = var1 + var3 - class211.field3276;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class211.field3274) {
            int var13 = class211.field3274 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1699(class211.field3275, 0, this.field3999, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Ljc;)Z")
    private final boolean method1697(class246 arg0) {
        if (this.field3992 == null) {
            if (this.field4004 == 0) {
                this.field3992 = class195.field3087.method498(this.field4000, true, -124, this.field4001, class195.field3090);
            } else if (this.field4004 == 2) {
                this.method1695(arg0);
            } else if (this.field4004 == 1) {
                this.method1690(arg0);
            }
        }
        return this.field3992 != null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIILjc;)V")
    public final void method1698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class246 arg6) {
        int var8 = this.field4002 - arg4 & 0x7FF;
        int var9 = this.field3994 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3989) / 2 + var10;
        int var13 = (arg2 - this.field3989) / 2 + var11;
        if (var12 < arg3 && this.field3989 + var12 > 0 && var13 < arg2 && this.field3989 + var13 > 0 && this.method1697(arg6)) {
            this.field3992.method845(arg0 + var13, arg1 + var12, this.field3989, this.field3989);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method1699(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3996[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "()V")
    private static final void method1700() {
        if (field3990 != null) {
            return;
        }
        class234 var0 = field3990 = new class234(260, 480, 0);
        int[] var1 = var0.field3726;
        int[] var2 = var0.field3706;
        int[] var3 = var0.field3738;
        int[] var4 = var0.field3713;
        int[] var5 = var0.field3711;
        int[] var6 = var0.field3732;
        var0.field3717 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class195.field3091[var8] >> 1;
            int var10 = class195.field3089[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class195.field3089[var17] >> 9;
                int var19 = (class195.field3091[var17] >> 1) * var9 >> 23;
                int var20 = (class195.field3091[var17] >> 1) * var10 >> 23;
                var1[var0.field3717] = var20;
                var2[var0.field3717] = var18;
                var3[var0.field3717] = -var19;
                var0.field3717++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field3752] = 0;
                var5[var0.field3752] = var13;
                var6[var0.field3752] = var12;
                var0.field3752++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field3752] = var13;
                    var5[var0.field3752] = var15;
                    var6[var0.field3752] = var12;
                    var0.field3752++;
                    var4[var0.field3752] = var15;
                    var5[var0.field3752] = var16;
                    var6[var0.field3752] = var12;
                    var0.field3752++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field3752] = var12;
                var5[var0.field3752] = var13;
                var6[var0.field3752] = 1;
                var0.field3752++;
            }
        }
        var0.field3750 = var0.field3717;
        var0.field3730 = null;
        var0.field3718 = null;
        var0.field3755 = null;
        var0.field3746 = null;
        var0.field3712 = null;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "()V")
    private final void method1701() {
        int var1 = this.field4001;
        int var2 = this.field4001;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class211.field3279 - var1;
        if (var2 > class211.field3272) {
            var2 -= var2 - class211.field3272;
        }
        if (class211.field3280 > 0) {
            int var9 = class211.field3280;
            var2 -= var9;
            var7 += class211.field3279 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class211.field3276) {
            int var10 = var1 - class211.field3276;
            var1 -= var10;
            var8 += var10;
        }
        if (class211.field3274 > 0) {
            int var11 = class211.field3274;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1692(class211.field3275, this.field3999, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3993 = arg2;
        this.field4003 = arg3;
        this.field3995 = arg4;
        this.field3998 = arg7;
        this.field4000 = arg1;
        this.field3999 = arg6;
        this.field3997 = arg5;
        this.field4004 = arg0;
    }
}
