import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 extends class235 {

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    private int field271 = 0;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    private int field279 = -32768;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    private int field291 = 0;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    private int field289 = -1;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "Z")
    private boolean field312 = false;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "Lri;")
    private class65 field285;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "[I")
    public static int[] field280 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lqk;")
    private static class207 field297 = class24.method212(255, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "Lqk;")
    public static class207 field292 = class24.method212(255, "null");

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "Lqk;")
    public static class207 field298 = field297;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field276 = 0;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lqk;")
    public static class207 field308 = class24.method212(255, "event_opbase");

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "D")
    private double field275;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "D")
    private double field277;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "D")
    public double field281;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "D")
    private double field288;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "D")
    private double field295;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "D")
    public double field304;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "D")
    private double field305;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "D")
    public double field306;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Le;")
    private class64 field293;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "[Lli;")
    public static class288[] field270;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Lba;")
    private final class166 method105(int arg0) {
        field303++;
        class234 var2 = class165.method1192(this.field284, -108);
        class166 var3 = var2.method1673(this.field271, 107, this.field289, this.field291);
        if (var3 == null) {
            return null;
        }
        if (arg0 != 25263) {
            this.field282 = 84;
        }
        var3.method281(this.field302);
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public static final int method106(int arg0, int arg1) {
        field296++;
        if (arg1 != -32) {
            return -5;
        } else if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field309++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
    public final void method107(int arg0, byte arg1) {
        this.field304 += (double) arg0 * this.field305;
        if (this.field286 == -1) {
            this.field281 += (double) arg0 * this.field288;
        } else {
            this.field281 += this.field277 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field288;
            this.field288 += (double) arg0 * this.field277;
        }
        this.field312 = true;
        field278++;
        this.field306 += (double) arg0 * this.field275;
        if (arg1 >= -45) {
            this.method105(65);
        }
        this.field287 = (int) (Math.atan2(this.field305, this.field275) * 325.949D) + 1024 & 0x7FF;
        this.field302 = (int) (Math.atan2(this.field288, this.field295) * 325.949D) & 0x7FF;
        if (this.field285 == null) {
            return;
        }
        this.field291 += arg0;
        while (true) {
            do {
                do {
                    if (this.field291 <= this.field285.field1150[this.field271]) {
                        return;
                    }
                    this.field291 -= this.field285.field1150[this.field271];
                    this.field271++;
                    if (this.field285.field1180.length <= this.field271) {
                        this.field271 -= this.field285.field1158;
                        if (this.field271 < 0 || this.field271 >= this.field285.field1180.length) {
                            this.field271 = 0;
                        }
                    }
                    this.field289 = this.field271 + 1;
                } while (this.field285.field1180.length > this.field289);
                this.field289 -= this.field285.field1158;
            } while (this.field289 >= 0 && this.field285.field1180.length > this.field289);
            this.field289 = -1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIBII)V")
    public final void method108(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -39) {
            this.method80();
        }
        if (!this.field312) {
            double var6 = (double) (arg0 - this.field310);
            double var8 = (double) (arg1 - this.field294);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field281 = (double) this.field299;
            this.field304 = (double) this.field307 * var8 / var10 + (double) this.field294;
            this.field306 = (double) this.field307 * var6 / var10 + (double) this.field310;
        }
        field272++;
        double var12 = (double) (this.field282 + 1 - arg4);
        this.field275 = ((double) arg0 - this.field306) / var12;
        this.field305 = ((double) arg1 - this.field304) / var12;
        this.field295 = Math.sqrt(this.field305 * this.field305 + this.field275 * this.field275);
        if (this.field286 == -1) {
            this.field288 = ((double) arg3 - this.field281) / var12;
        } else {
            if (!this.field312) {
                this.field288 = -this.field295 * Math.tan((double) this.field286 * 0.02454369D);
            }
            this.field277 = ((double) arg3 - this.field281 - (this.field288 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
    public static final void method109(int arg0, int arg1, int arg2) {
        field311++;
        int var3 = -38 % ((arg2 - 4) / 58);
        class90 var4 = class221.method1575(12, arg1, 1651481952);
        var4.method648((byte) -88);
        var4.field1621 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()I")
    public final int method80() {
        field273++;
        return this.field279;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public static void method110(int arg0) {
        field292 = null;
        field308 = null;
        field298 = null;
        if (arg0 == 128) {
            field270 = null;
            field280 = null;
            field297 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIJILe;)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        field301++;
        class166 var13 = this.method105(25263);
        if (var13 != null) {
            var13.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field293);
            this.field279 = var13.method80();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)Z")
    public static final boolean method111(int arg0, int arg1, int arg2, int arg3) {
        if (!class88.method642(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class163.field2881[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class207.field3676) {
                    if (!class4.method27(var4, var6, var5)) {
                        return false;
                    }
                    if (!class4.method27(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class4.method27(var4, var7, var5)) {
                        return false;
                    }
                    if (!class4.method27(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class4.method27(var4, var8, var5)) {
                    return false;
                }
                if (!class4.method27(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class59.field1084) {
                    if (!class4.method27(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class4.method27(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class4.method27(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class4.method27(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class4.method27(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class4.method27(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class207.field3676) {
                    if (!class4.method27(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class4.method27(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class4.method27(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class4.method27(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class4.method27(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class4.method27(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class59.field1084) {
                    if (!class4.method27(var4, var6, var5)) {
                        return false;
                    }
                    if (!class4.method27(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class4.method27(var4, var7, var5)) {
                        return false;
                    }
                    if (!class4.method27(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class4.method27(var4, var8, var5)) {
                    return false;
                }
                if (!class4.method27(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class4.method27(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class4.method27(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class4.method27(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class4.method27(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class4.method27(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field300 = arg10;
        this.field274 = arg5;
        this.field284 = arg0;
        this.field310 = arg3;
        this.field290 = arg9;
        this.field294 = arg2;
        this.field307 = arg8;
        this.field299 = arg4;
        this.field312 = false;
        this.field283 = arg1;
        this.field282 = arg6;
        this.field286 = arg7;
        int var12 = class165.method1192(this.field284, -119).field4332;
        if (var12 == -1) {
            this.field285 = null;
        } else {
            this.field285 = class16.method101((byte) 80, var12);
        }
    }
}
