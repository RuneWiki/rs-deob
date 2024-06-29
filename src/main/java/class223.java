import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class223 {

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    private int field3599;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    private int field3597;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Z")
    private boolean field3594;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    private int field3590;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    private int field3598;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
    private static int[] field3600 = new int[4];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    private int field3596;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lbf;")
    private static class205 field3593;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lnf;")
    private class227 field3589;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[B")
    private static byte[] field3588;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
    private final void method1572() {
        int var1 = this.field3595;
        int var2 = this.field3595;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class217.field3481 - var1;
        if (var2 > class217.field3482) {
            var2 -= var2 - class217.field3482;
        }
        if (class217.field3479 > 0) {
            int var9 = class217.field3479;
            var2 -= var9;
            var7 += class217.field3481 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class217.field3485) {
            int var10 = var1 - class217.field3485;
            var1 -= var10;
            var8 += var10;
        }
        if (class217.field3477 > 0) {
            int var11 = class217.field3477;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1582(class217.field3483, this.field3598, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method1573(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3588[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "()V")
    private static final void method1574() {
        if (field3588 != null) {
            return;
        }
        field3588 = new byte[16384];
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
                field3588[var4 + var6] = field3588[var4 + var9] = field3588[var5 + var6] = field3588[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "()V")
    private final void method1575() {
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)Z")
    public final boolean method1576(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3594) {
            this.field3585 = 1073741823;
            var8 = this.field3592;
            var9 = this.field3599;
            var10 = this.field3597;
        } else {
            int var5 = this.field3592 - arg0;
            int var6 = this.field3599 - arg1;
            int var7 = this.field3597 - arg2;
            this.field3585 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3585 == 0) {
                this.field3585 = 1;
            }
            var8 = (var5 << 8) / this.field3585;
            var9 = (var6 << 8) / this.field3585;
            var10 = (var7 << 8) / this.field3585;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3601 = this.field3591 * arg3 / (this.field3594 ? 1024 : this.field3585);
        } else {
            this.field3601 = 0;
        }
        if (this.field3601 < 8) {
            this.method1575();
            this.field3589 = null;
            return false;
        }
        int var12 = class77.method429(this.field3601, 1);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3595 != var12) {
            this.field3595 = var12;
        }
        this.field3596 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3586 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3589 = null;
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIILqi;)V")
    public final void method1577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class223 arg6) {
        int var8 = this.field3596 - arg4 & 0x7FF;
        int var9 = this.field3586 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3601) / 2 + var10;
        int var13 = (arg2 - this.field3601) / 2 + var11;
        if (var12 < arg3 && this.field3601 + var12 > 0 && var13 < arg2 && this.field3601 + var13 > 0 && this.method1583(arg6)) {
            this.field3589.method320(arg0 + var13, arg1 + var12, this.field3601, this.field3601);
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "()V")
    public static void method1578() {
        field3593 = null;
        field3588 = null;
        field3600 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lqi;)V")
    private final void method1579(class223 arg0) {
        method1580();
        method1574();
        this.field3589 = new class65(this.field3595, this.field3595);
        class217.method1522(field3600);
        this.field3589.method1614();
        class174.method1194();
        class217.method1526(0, 0, this.field3595, this.field3595, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3594) {
                var2 = -arg0.field3592;
                var3 = -arg0.field3599;
                var4 = -arg0.field3597;
            } else {
                var2 = this.field3592 - arg0.field3592;
                var3 = this.field3599 - arg0.field3599;
                var4 = this.field3597 - arg0.field3597;
            }
        }
        if (this.field3596 != 0) {
            int var5 = class174.field2753[this.field3596];
            int var6 = class174.field2759[this.field3596];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3586 != 0) {
            int var8 = this.field3586 - 1024 & 0x7FF;
            int var9 = class174.field2753[var8];
            int var10 = class174.field2759[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class72.method402(field3593.field3265, 0, field3593.field3260, (short) class174.field2756.method779(-7078, this.field3590));
        class125 var12 = field3593.method1430(64, 512, -var2, -var3, -var4);
        int var13 = var12.method836() - var12.method841();
        int var14 = var12.method842() - var12.method102();
        if (var13 > var14) {
            int var15 = this.field3598 == 0 ? (var13 << 9) / this.field3595 : (var13 * 16 << 9) / (this.field3595 * 13);
            var12.method848(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3598 == 0 ? (var14 << 9) / this.field3595 : (var14 * 16 << 9) / (this.field3595 * 13);
            var12.method848(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3598 == 0) {
            for (int var17 = 0; var17 < class217.field3483.length; var17++) {
                if (class217.field3483[var17] != 0) {
                    class217.field3483[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1584();
            this.method1572();
        }
        class52.field673.method1118(63);
        class217.method1534(field3600);
        class174.method1194();
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "()V")
    private static final void method1580() {
        if (field3593 != null) {
            return;
        }
        class205 var0 = field3593 = new class205(260, 480, 0);
        int[] var1 = var0.field3228;
        int[] var2 = var0.field3271;
        int[] var3 = var0.field3243;
        int[] var4 = var0.field3238;
        int[] var5 = var0.field3262;
        int[] var6 = var0.field3275;
        var0.field3230 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class174.field2753[var8] >> 1;
            int var10 = class174.field2759[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class174.field2759[var17] >> 9;
                int var19 = (class174.field2753[var17] >> 1) * var9 >> 23;
                int var20 = (class174.field2753[var17] >> 1) * var10 >> 23;
                var1[var0.field3230] = var20;
                var2[var0.field3230] = var18;
                var3[var0.field3230] = -var19;
                var0.field3230++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field3260] = 0;
                var5[var0.field3260] = var13;
                var6[var0.field3260] = var12;
                var0.field3260++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field3260] = var13;
                    var5[var0.field3260] = var15;
                    var6[var0.field3260] = var12;
                    var0.field3260++;
                    var4[var0.field3260] = var15;
                    var5[var0.field3260] = var16;
                    var6[var0.field3260] = var12;
                    var0.field3260++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field3260] = var12;
                var5[var0.field3260] = var13;
                var6[var0.field3260] = 1;
                var0.field3260++;
            }
        }
        var0.field3245 = var0.field3230;
        var0.field3253 = null;
        var0.field3255 = null;
        var0.field3274 = null;
        var0.field3269 = null;
        var0.field3232 = null;
    }

    @OriginalMember(owner = "client!qi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1575();
        super.finalize();
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Lqi;)V")
    private final void method1581(class223 arg0) {
        class205 var2 = class205.method1444(class257.field4173, this.field3590, 0);
        if (var2 == null) {
            return;
        }
        this.field3589 = new class227(this.field3595, this.field3595);
        class217.method1522(field3600);
        this.field3589.method1614();
        class174.method1194();
        class217.method1526(0, 0, this.field3595, this.field3595, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3594) {
                var3 = -arg0.field3592;
                var4 = -arg0.field3599;
                var5 = -arg0.field3597;
            } else {
                var3 = this.field3592 - arg0.field3592;
                var4 = this.field3599 - arg0.field3599;
                var5 = this.field3597 - arg0.field3597;
            }
        }
        if (this.field3596 != 0) {
            int var6 = class174.field2753[this.field3596];
            int var7 = class174.field2759[this.field3596];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3586 != 0) {
            int var9 = this.field3586 - 1024 & 0x7FF;
            int var10 = class174.field2753[var9];
            int var11 = class174.field2759[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class125 var13 = var2.method1430(64, 768, -var3, -var4, -var5);
        int var14 = var13.method836() - var13.method841();
        int var15 = var13.method842() - var13.method102();
        int var16 = var13.method841() + var14 / 2;
        int var17 = var13.method102() + var15 / 2;
        if (var14 > var15) {
            var13.method848(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field3595);
        } else {
            var13.method848(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field3595);
        }
        class52.field673.method1118(63);
        class217.method1534(field3600);
        class174.method1194();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method1582(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3588[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(Lqi;)Z")
    private final boolean method1583(class223 arg0) {
        if (this.field3589 == null) {
            if (this.field3587 == 0) {
                this.field3589 = class174.field2756.method769(this.field3590, class174.field2765, this.field3595, -4, true);
            } else if (this.field3587 == 2) {
                this.method1581(arg0);
            } else if (this.field3587 == 1) {
                this.method1579(arg0);
            }
        }
        return this.field3589 != null;
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "()V")
    private final void method1584() {
        int var1 = this.field3595 * 3 / 32;
        int var3 = this.field3595 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class217.field3481 * var1 + var1;
        int var8 = class217.field3481 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class217.field3482) {
            var4 = var3 - (var1 + var3 - class217.field3482);
        }
        if (var1 < class217.field3479) {
            int var11 = class217.field3479 - var1;
            var4 -= var11;
            var7 += class217.field3481 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class217.field3485) {
            int var12 = var1 + var3 - class217.field3485;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class217.field3477) {
            int var13 = class217.field3477 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1573(class217.field3483, 0, this.field3598, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3592 = arg2;
        this.field3599 = arg3;
        this.field3597 = arg4;
        this.field3594 = arg7;
        this.field3590 = arg1;
        this.field3598 = arg6;
        this.field3591 = arg5;
        this.field3587 = arg0;
    }
}
