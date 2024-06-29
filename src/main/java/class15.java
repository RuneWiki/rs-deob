import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class15 {

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    private int field275 = 0;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[I")
    private int[] field279 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    private int field286 = 100;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
    private int[] field291 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field284 = 0;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field276 = 500;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "[I")
    private int[] field292 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[I")
    private static int[] field270 = new int[32768];

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    private static int[] field273;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
    private static int[] field278;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[I")
    private static int[] field283;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "[I")
    private static int[] field287;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
    private static int[] field285;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
    private static int[] field289;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "[I")
    private static int[] field293;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Le;")
    private class161 field269;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Le;")
    private class161 field271;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Le;")
    private class161 field274;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Le;")
    private class161 field277;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Le;")
    private class161 field280;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Le;")
    private class161 field281;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Le;")
    private class161 field282;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Le;")
    private class161 field288;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Le;")
    private class161 field290;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Ltf;")
    private class257 field272;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method126(int arg0, int arg1) {
        class271.method1954(field278, 0, arg0);
        if (arg1 < 10) {
            return field278;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field274.method1196();
        this.field282.method1196();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field271 != null) {
            this.field271.method1196();
            this.field290.method1196();
            var5 = (int) ((double) (this.field271.field2529 - this.field271.field2530) * 32.768D / var3);
            var6 = (int) ((double) this.field271.field2530 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field288 != null) {
            this.field288.method1196();
            this.field269.method1196();
            var8 = (int) ((double) (this.field288.field2529 - this.field288.field2530) * 32.768D / var3);
            var9 = (int) ((double) this.field288.field2530 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field291[var11] != 0) {
                field289[var11] = 0;
                field293[var11] = (int) ((double) this.field279[var11] * var3);
                field283[var11] = (this.field291[var11] << 14) / 100;
                field287[var11] = (int) ((double) (this.field274.field2529 - this.field274.field2530) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field292[var11]) / var3);
                field285[var11] = (int) ((double) this.field274.field2530 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field274.method1199(arg0);
            int var14 = this.field282.method1199(arg0);
            if (this.field271 != null) {
                int var15 = this.field271.method1199(arg0);
                int var16 = this.field290.method1199(arg0);
                var13 += this.method128(var7, var16, this.field271.field2532) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field288 != null) {
                int var17 = this.field288.method1199(arg0);
                int var18 = this.field269.method1199(arg0);
                var14 = var14 * ((this.method128(var10, var18, this.field288.field2532) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field291[var19] != 0) {
                    int var20 = field293[var19] + var12;
                    if (var20 < arg0) {
                        field278[var20] += this.method128(field289[var19], field283[var19] * var14 >> 15, this.field274.field2532);
                        field289[var19] += (field287[var19] * var13 >> 16) + field285[var19];
                    }
                }
            }
        }
        if (this.field280 != null) {
            this.field280.method1196();
            this.field277.method1196();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field280.method1199(arg0);
                int var26 = this.field277.method1199(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field280.field2529 - this.field280.field2530) * var25 >> 8) + this.field280.field2530;
                } else {
                    var27 = ((this.field280.field2529 - this.field280.field2530) * var26 >> 8) + this.field280.field2530;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field278[var24] = 0;
                }
            }
        }
        if (this.field275 > 0 && this.field286 > 0) {
            int var28 = (int) ((double) this.field275 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field278[var29] += field278[var29 - var28] * this.field286 / 100;
            }
        }
        if (this.field272.field3971[0] > 0 || this.field272.field3971[1] > 0) {
            this.field281.method1196();
            int var30 = this.field281.method1199(arg0 + 1);
            int var31 = this.field272.method1819(0, (float) var30 / 65536.0F);
            int var32 = this.field272.method1819(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field278[var31 + var33] * (long) class257.field3968 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field278[var31 + var33 - var36 - 1] * (long) class257.field3967[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field278[var33 - var37 - 1] * (long) class257.field3967[1][var37] >> 16);
                    }
                    field278[var33] = var35;
                    var30 = this.field281.method1199(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field278[var31 + var33] * (long) class257.field3968 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field278[var31 + var33 - var40 - 1] * (long) class257.field3967[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field278[var33 - var41 - 1] * (long) class257.field3967[1][var41] >> 16);
                        }
                        field278[var33] = var39;
                        var30 = this.field281.method1199(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field278[var31 + var33 - var43 - 1] * (long) class257.field3967[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field278[var33 - var44 - 1] * (long) class257.field3967[1][var44] >> 16);
                            }
                            field278[var33] = var42;
                            this.field281.method1199(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field272.method1819(0, (float) var30 / 65536.0F);
                    var32 = this.field272.method1819(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field278[var46] < -32768) {
                field278[var46] = -32768;
            }
            if (field278[var46] > 32767) {
                field278[var46] = 32767;
            }
        }
        return field278;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V", line = 294)
    public static void method127() {
        field278 = null;
        field270 = null;
        field273 = null;
        field289 = null;
        field293 = null;
        field283 = null;
        field287 = null;
        field285 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field270[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field273 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field273[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field278 = new int[220500];
        field283 = new int[5];
        field287 = new int[5];
        field285 = new int[5];
        field289 = new int[5];
        field293 = new int[5];
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I", line = 340)
    private final int method128(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field273[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field270[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lpe;)V", line = 391)
    public final void method129(class101 arg0) {
        this.field274 = new class161();
        this.field274.method1198(arg0);
        this.field282 = new class161();
        this.field282.method1198(arg0);
        int var2 = arg0.method741(104);
        if (var2 != 0) {
            arg0.field1667--;
            this.field271 = new class161();
            this.field271.method1198(arg0);
            this.field290 = new class161();
            this.field290.method1198(arg0);
        }
        int var3 = arg0.method741(30);
        if (var3 != 0) {
            arg0.field1667--;
            this.field288 = new class161();
            this.field288.method1198(arg0);
            this.field269 = new class161();
            this.field269.method1198(arg0);
        }
        int var4 = arg0.method741(74);
        if (var4 != 0) {
            arg0.field1667--;
            this.field280 = new class161();
            this.field280.method1198(arg0);
            this.field277 = new class161();
            this.field277.method1198(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method738(-957401312);
            if (var6 == 0) {
                break;
            }
            this.field291[var5] = var6;
            this.field292[var5] = arg0.method779((byte) -39);
            this.field279[var5] = arg0.method738(-957401312);
        }
        this.field275 = arg0.method738(-957401312);
        this.field286 = arg0.method738(-957401312);
        this.field276 = arg0.method731(false);
        this.field284 = arg0.method731(false);
        this.field272 = new class257();
        this.field281 = new class161();
        this.field272.method1816(arg0, this.field281);
    }
}
