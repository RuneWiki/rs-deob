import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class190 extends class38 {

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    private int field3382 = 0;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    private int field3375 = -32768;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "Z")
    private boolean field3388 = false;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    private int field3394 = 0;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    private int field3366;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    private int field3369;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    private int field3373;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    private int field3367;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    private int field3389;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "Lpj;")
    private class174 field3363;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Lkh;")
    public static class117 field3378 = class224.method1450((byte) 126, ")3)3)3");

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "[Lkh;")
    public static class117[] field3384 = new class117[200];

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "Lkh;")
    private static class117 field3401 = class224.method1450((byte) 116, "shake:");

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "Lkh;")
    public static class117 field3392 = field3401;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Lkh;")
    public static class117 field3381 = field3401;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "D")
    public double field3360;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "D")
    private double field3370;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "D")
    private double field3379;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "D")
    public double field3390;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "D")
    private double field3393;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "D")
    public double field3398;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "D")
    private double field3399;

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "D")
    private double field3400;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    private int field3377;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3396++;
        class29 var11 = this.method1276(1);
        if (var11 != null) {
            var11.method158(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3375 = var11.method134();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1270(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg4 - arg3;
        int var9 = arg1 + arg3;
        int var10 = arg0 - arg3;
        int var11 = arg3 + arg5;
        for (int var12 = arg1; var12 < var9; var12++) {
            class114.method762(arg5, arg2 + 114, arg0, arg7, class167.field3030[var12]);
        }
        for (int var13 = arg4; var13 > var8; var13--) {
            class114.method762(arg5, 125, arg0, arg7, class167.field3030[var13]);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class167.field3030[var14];
            class114.method762(arg5, 108, var11, arg7, var15);
            class114.method762(var11, 106, var10, arg6, var15);
            class114.method762(var10, arg2 ^ 0xFFFFFFA8, arg0, arg7, var15);
        }
        if (arg2 != -12) {
            field3392 = null;
        }
        field3397++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -30945) {
            field3392 = null;
        }
        field3374++;
        if (arg4 < 1 || arg7 < 1 || arg4 > 102 || arg7 > 102) {
            return;
        }
        if (class167.field3021 && (class233.field4200[0][arg4][arg7] & 0x2) == 0) {
            int var8 = arg6;
            if ((class233.field4200[arg6][arg4][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class228.field4104 != var8) {
                return;
            }
        }
        int var9 = arg6;
        if (arg6 < 3 && (class233.field4200[1][arg4][arg7] & 0x2) == 2) {
            var9 = arg6 + 1;
        }
        class99.method671(arg4, true, arg7, class173.field3123[arg6], arg1, arg6, var9);
        if (arg5 >= 0) {
            class54.method417(class173.field3123[arg6], -27121, var9, arg3, false, arg6, arg4, false, arg5, false, arg2, arg7);
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)I")
    public static final int method1272(int arg0, int arg1, byte arg2) {
        int var3 = class57.method433(arg0 - 1, arg1 + -1, 47) + class57.method433(arg0 + 1, arg1 - 1, 118) + class57.method433(arg0 + -1, arg1 + 1, 40) + class57.method433(arg0 + 1, arg1 + 1, 21);
        int var4 = class57.method433(arg0 - 1, arg1, 113) + class57.method433(arg0 + 1, arg1, 35) + class57.method433(arg0, arg1 - 1, 87) + class57.method433(arg0, arg1 + 1, 28);
        field3387++;
        int var5 = 86 / ((arg2 + 40) / 61);
        int var6 = class57.method433(arg0, arg1, 25);
        return var3 / 16 + var4 / 8 + var6 / 4;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public static void method1273(byte arg0) {
        field3392 = null;
        field3401 = null;
        field3384 = null;
        if (arg0 != 127) {
            method1272(19, -63, (byte) 62);
        }
        field3381 = null;
        field3378 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[BI)I")
    public static final int method1274(byte arg0, byte[] arg1, int arg2) {
        field3386++;
        if (arg0 >= -89) {
            method1273((byte) 74);
        }
        return class215.method1411(arg1, 0, arg2, 4874);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
    public final void method1275(byte arg0, int arg1) {
        this.field3390 += this.field3379 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3399;
        this.field3398 += (double) arg1 * this.field3393;
        field3361++;
        this.field3399 += (double) arg1 * this.field3379;
        this.field3388 = true;
        this.field3360 += (double) arg1 * this.field3400;
        this.field3383 = (int) (Math.atan2(this.field3400, this.field3393) * 325.949D) + 1024 & 0x7FF;
        if (arg0 <= 15) {
            return;
        }
        this.field3377 = (int) (Math.atan2(this.field3399, this.field3370) * 325.949D) & 0x7FF;
        if (this.field3363 == null) {
            return;
        }
        this.field3382 += arg1;
        while (true) {
            do {
                do {
                    if (this.field3382 <= this.field3363.field3148[this.field3394]) {
                        return;
                    }
                    this.field3382 -= this.field3363.field3148[this.field3394];
                    this.field3394++;
                } while (this.field3363.field3144.length > this.field3394);
                this.field3394 -= this.field3363.field3137;
            } while (this.field3394 >= 0 && this.field3363.field3144.length > this.field3394);
            this.field3394 = 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()I")
    public final int method134() {
        field3371++;
        return this.field3375;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)Lcf;")
    private final class29 method1276(int arg0) {
        field3391++;
        class20 var2 = class214.method1406(arg0, this.field3389);
        class29 var3 = var2.method177(this.field3394, 90);
        if (var3 == null) {
            return null;
        } else {
            var3.method249(this.field3377);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
    public final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field3388) {
            double var6 = (double) (arg1 - this.field3367);
            double var8 = (double) (arg0 - this.field3366);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3398 = (double) this.field3369 * var6 / var10 + (double) this.field3367;
            this.field3390 = this.field3395;
            this.field3360 = (double) this.field3369 * var8 / var10 + (double) this.field3366;
        }
        field3362++;
        double var12 = (double) (this.field3365 + 1 - arg2);
        this.field3400 = ((double) arg0 - this.field3360) / var12;
        this.field3393 = ((double) arg1 - this.field3398) / var12;
        this.field3370 = Math.sqrt(this.field3400 * this.field3400 + this.field3393 * this.field3393);
        if (arg4 != -1) {
            method1274((byte) -77, null, 83);
        }
        if (!this.field3388) {
            this.field3399 = -this.field3370 * Math.tan((double) this.field3373 * 0.02454369D);
        }
        this.field3379 = ((double) arg3 - this.field3390 - this.field3399 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3388 = false;
        this.field3380 = arg1;
        this.field3366 = arg2;
        this.field3365 = arg6;
        this.field3372 = arg9;
        this.field3369 = arg8;
        this.field3373 = arg7;
        this.field3368 = arg10;
        this.field3367 = arg3;
        this.field3395 = arg4;
        this.field3389 = arg0;
        this.field3385 = arg5;
        int var12 = class214.method1406(1, this.field3389).field544;
        if (var12 == -1) {
            this.field3363 = null;
        } else {
            this.field3363 = class81.method555(var12, (byte) 48);
        }
    }
}
