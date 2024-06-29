import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class173 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    private int field3066 = -1;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    private int field3072 = 0;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lij;")
    private class175 field3068 = new class175();

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Z")
    public boolean field3081 = false;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "[[I")
    private int[][] field3078;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    private int field3065;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[Lmk;")
    private class25[] field3067;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lke;")
    public static class256 field3070 = class316.method2202("Votre liste noire est pleine (X100 noms maximum(Y)3", 27626);

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lke;")
    public static class256 field3073 = class316.method2202("3D)2Softwarebibliothek gestartet)3", 27626);

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field3077 = 0;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIILkd;ZIBLha;IIIII)Lha;", line = 20)
    public static final class26 method1254(int arg0, int arg1, int arg2, int arg3, class117 arg4, boolean arg5, int arg6, byte arg7, class26 arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3071++;
        long var14 = ((long) arg6 << 32) + ((long) arg11 << 48) + (long) ((arg1 << 24) + (arg3 << 16) + arg9);
        class26 var16 = (class26) class274.field4740.method2077(-13408, var14);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg9 == 1) {
                var18 = 9;
            } else if (arg9 == 2) {
                var18 = 12;
            } else if (arg9 == 3) {
                var18 = 15;
            } else if (arg9 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            int[] var19 = new int[] { 64, 96, 128 };
            int[][] var20 = new int[var17][var18];
            class315 var21 = new class315((var17 * var18) + 1, var17 * var18 * 2 - var18, 0);
            int var22 = var21.method2182(0, 0, 0);
            for (int var23 = 0; var23 < var17; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var18; var26++) {
                    int var27 = (var26 << 11) / var18;
                    int var28 = class136.field2366[var27] * var24 + arg12 >> 16;
                    int var29 = class136.field2372[var27] * var25 + arg0 >> 16;
                    var20[var23][var26] = var21.method2182(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var17; var30++) {
                int var31 = (var30 * 256 + 128) / var17;
                int var32 = 256 - var31;
                short var33 = (short) (((arg6 & 0xFC00) * var32 + (arg11 & 0xFC00) * var31 & 0xFC0000) + ((arg6 & 0x7F) * var32 + (arg11 & 0x7F) * var31 & 0x7F00) + ((arg6 & 0x380) * var32 + (arg11 & 0x380) * var31 & 0x38000) >> 8);
                byte var34 = (byte) (arg1 * var31 + arg3 * var32 >> 8);
                for (int var35 = 0; var35 < var18; var35++) {
                    if (var30 == 0) {
                        var21.method2194(var22, var20[0][(var35 + 1) % var18], var20[0][var35], (byte) 1, var33, var34);
                    } else {
                        var21.method2194(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var18], var20[var30][(var35 + 1) % var18], (byte) 1, var33, var34);
                        var21.method2194(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var18], var20[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var21.method2195(64, 768, -50, -10, -50);
            class274.field4740.method2074(var16, var14, -1);
        }
        int var36 = arg9 * 64 - 1;
        int var37 = -var36;
        int var38 = arg8.method168();
        int var39 = var36;
        int var40 = -var36;
        if (arg7 != -26) {
            return (class26) null;
        }
        int var41 = arg8.method178();
        int var42 = arg8.method179();
        int var43 = arg8.method167();
        int var44 = var36;
        class172 var45 = null;
        if (arg5) {
            if (arg10 > 128 && arg10 < 896) {
                var40 -= 128;
            }
            if (arg10 > 640 && arg10 < 1408) {
                var39 = var36 + 128;
            }
            if (arg10 > 1664 || arg10 < 384) {
                var37 -= 128;
            }
            if (arg10 > 1152 && arg10 < 1920) {
                var44 = var36 + 128;
            }
        }
        if (arg4 != null) {
            int var46 = arg4.field2040[arg2];
            var45 = class132.method901(-1, var46 >> 16);
            arg2 = var46 & 0xFFFF;
        }
        if (var37 > var42) {
            var42 = var37;
        }
        if (var39 < var43) {
            var43 = var39;
        }
        if (var40 > var38) {
            var38 = var40;
        }
        if (var44 < var41) {
            var41 = var44;
        }
        class26 var47;
        if (var45 == null) {
            var47 = var16.method175(true, true);
            var47.method170((var41 - var38) / 2, 128, (var43 - var42) / 2);
            var47.method166((var38 + var41) / 2, 0, (var42 + var43) / 2);
        } else {
            var47 = var16.method175(!var45.method1249(arg2, (byte) 70), true);
            var47.method170((var41 - var38) / 2, 128, (var43 - var42) / 2);
            var47.method166((var38 + var41) / 2, 0, (var42 + var43) / 2);
            var47.method169(var45, arg2);
        }
        if (arg10 != 0) {
            var47.method164(arg10);
        }
        if (class253.field4323) {
            class149 var50 = (class149) var47;
            if (class297.method2080(arg12 + var38, 103, class255.field4377, arg0 + var42) != arg13 || class297.method2080(arg12 + var41, arg7 ^ 0xFFFFFF93, class255.field4377, arg0 + var43) != arg13) {
                for (int var51 = 0; var51 < var50.field2624; var51++) {
                    var50.field2630[var51] += class297.method2080(var50.field2639[var51] + arg12, 105, class255.field4377, var50.field2636[var51] + arg0) - arg13;
                }
                var50.field2644.field276 = false;
                var50.field2618.field815 = false;
            }
        } else {
            class89 var48 = (class89) var47;
            if (class297.method2080(arg12 + var38, arg7 + 129, class255.field4377, arg0 + var42) != arg13 || arg13 != class297.method2080(arg12 + var41, 125, class255.field4377, arg0 + var43)) {
                for (int var49 = 0; var49 < var48.field1614; var49++) {
                    var48.field1602[var49] += class297.method2080(var48.field1603[var49] + arg12, 112, class255.field4377, var48.field1586[var49] + arg0) - arg13;
                }
                var48.field1597 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 246)
    public final void method1255(int arg0) {
        for (int var2 = 0; var2 < this.field3080; var2++) {
            this.field3078[var2] = null;
        }
        this.field3067 = null;
        field3075++;
        this.field3078 = (int[][]) null;
        this.field3068.method1275((byte) -89);
        this.field3068 = null;
        if (arg0 > -51) {
            this.method1258(92, -77);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(III)V", line = 406)
    public class173(int arg0, int arg1, int arg2) {
        this.field3080 = arg0;
        this.field3078 = new int[this.field3080][arg2];
        this.field3065 = arg1;
        this.field3067 = new class25[this.field3065];
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 269)
    public static void method1256(byte arg0) {
        field3070 = null;
        field3073 = null;
        int var1 = -95 % ((arg0 - 8) / 55);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)[[I", line = 289)
    public final int[][] method1257(boolean arg0) {
        field3064++;
        if (this.field3080 != this.field3065) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (!arg0) {
            this.field3066 = -33;
        }
        for (int var2 = 0; var2 < this.field3080; var2++) {
            this.field3067[var2] = class222.field3877;
        }
        return this.field3078;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I", line = 326)
    public final int[] method1258(int arg0, int arg1) {
        field3076++;
        if (arg0 >= -34) {
            field3073 = (class256) null;
        }
        if (this.field3080 == this.field3065) {
            this.field3081 = this.field3067[arg1] == null;
            this.field3067[arg1] = class222.field3877;
            return this.field3078[arg1];
        } else if (this.field3080 == 1) {
            this.field3081 = this.field3066 != arg1;
            this.field3066 = arg1;
            return this.field3078[0];
        } else {
            class25 var3 = this.field3067[arg1];
            if (var3 == null) {
                this.field3081 = true;
                if (this.field3080 > this.field3072) {
                    var3 = new class25(arg1, this.field3072);
                    this.field3072++;
                } else {
                    class25 var4 = (class25) this.field3068.method1272(true);
                    var3 = new class25(arg1, var4.field321);
                    this.field3067[var4.field320] = null;
                    var4.method1199(21966);
                }
                this.field3067[arg1] = var3;
            } else {
                this.field3081 = false;
            }
            this.field3068.method1273(19402, var3);
            return this.field3078[var3.field321];
        }
    }
}
