import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class496 {

    @OriginalMember(owner = "client!qs", name = "O", descriptor = "Lma;")
    private class449 field7275 = null;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "Lvg;")
    private class470 field7242;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Z")
    private boolean field7256;

    @OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
    public int field7274;

    @OriginalMember(owner = "client!qs", name = "L", descriptor = "[F")
    public static float[] field7272 = new float[4];

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "[I")
    public static int[] field7271 = new int[4096];

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!qs", name = "H", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!qs", name = "M", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!qs", name = "P", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "[Lo;")
    public static class138[] field7257;

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "[Ljava/lang/Object;")
    private Object[] field7270;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "[[B")
    public static byte[][] field7243;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field7241;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method2913(byte arg0) {
        if (arg0 != -11) {
            return true;
        }
        field7259++;
        if (!this.method2914(true)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field7275.field6696.length; var3++) {
            int var4 = this.field7275.field6696[var3];
            if (this.field7270[var4] == null) {
                this.method2939(var4, 73);
                if (this.field7270[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)Z", line = 40)
    private final boolean method2914(boolean arg0) {
        field7255++;
        if (!arg0) {
            return false;
        }
        if (this.field7275 == null) {
            this.field7275 = this.field7242.method657(-117);
            if (this.field7275 == null) {
                return false;
            }
            this.field7241 = new Object[this.field7275.field6698][];
            this.field7270 = new Object[this.field7275.field6698];
        }
        return true;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 65)
    public final boolean method2915(String arg0, int arg1) {
        int var3 = -127 / ((66 - arg1) / 55);
        field7245++;
        if (this.method2914(true)) {
            String var4 = arg0.toLowerCase();
            int var5 = this.field7275.field6694.method1260(316610721, class408.method2528(var4, false));
            return this.method2925(0, var5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Z", line = 83)
    private final boolean method2916(int arg0, int arg1) {
        field7273++;
        if (!this.method2914(true)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field7275.field6686.length && this.field7275.field6686[arg1] != 0) {
            if (arg0 != -21730) {
                this.method2913((byte) -109);
            }
            return true;
        } else if (class130.field2231) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 111)
    public final byte[] method2917(int arg0, String arg1, String arg2) {
        field7276++;
        if (!this.method2914(true)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field7275.field6694.method1260(316610721, class408.method2528(var4, false));
        if (!this.method2916(arg0 - 3074, var6)) {
            return null;
        } else if (arg0 == -18656) {
            int var7 = this.field7275.field6689[var6].method1260(316610721, class408.method2528(var5, false));
            return this.method2926(var7, arg0 + 18599, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)I", line = 136)
    public final int method2918(byte arg0) {
        field7249++;
        if (arg0 != 1) {
            this.method2913((byte) -25);
        }
        if (!this.method2914(true)) {
            throw new IllegalStateException("");
        }
        return this.field7275.field6691;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)I", line = 151)
    public final int method2919(byte arg0) {
        field7236++;
        if (this.method2914(true)) {
            int var2 = -15 % ((arg0 - 14) / 46);
            return this.field7275.field6686.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)I", line = 165)
    private final int method2920(int arg0, int arg1) {
        field7251++;
        if (!this.method2916(arg0 ^ 0xFFFFAB1E, arg1)) {
            return 0;
        } else if (this.field7270[arg1] == null) {
            return arg0 == 0 ? this.field7242.method656((byte) -86, arg1) : 38;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(II)V", line = 187)
    public final void method2921(int arg0, int arg1) {
        field7263++;
        if (this.method2916(-21730, arg0)) {
            if (this.field7241 != null) {
                this.field7241[arg0] = null;
            }
            int var3 = 73 / ((-arg1 - 42) / 50);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZIZ)V", line = 205)
    public final void method2922(boolean arg0, int arg1, boolean arg2) {
        field7246++;
        if (arg1 != -14575) {
            this.field7256 = true;
        }
        if (!this.method2914(true)) {
            return;
        }
        if (arg0) {
            this.field7275.field6699 = null;
            this.field7275.field6689 = null;
        }
        if (arg2) {
            this.field7275.field6695 = null;
            this.field7275.field6694 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(II)[I", line = 231)
    public final int[] method2923(int arg0, int arg1) {
        field7237++;
        if (arg1 >= -60) {
            field7267 = -114;
        }
        if (!this.method2916(-21730, arg0)) {
            return null;
        }
        int[] var3 = this.field7275.field6700[arg0];
        if (var3 == null) {
            var3 = new int[this.field7275.field6693[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(B)I", line = 262)
    public final int method2924(byte arg0) {
        field7244++;
        if (!this.method2914(true)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -106) {
            this.method2924((byte) -125);
        }
        while (var4 < this.field7270.length) {
            if (this.field7275.field6693[var4] > 0) {
                var2 += 100;
                var3 += this.method2920(0, var4);
            }
            var4++;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(II)Z", line = 303)
    public final boolean method2925(int arg0, int arg1) {
        field7253++;
        if (arg0 != 0) {
            return true;
        } else if (!this.method2916(-21730, arg1)) {
            return false;
        } else if (this.field7270[arg1] == null) {
            this.method2939(arg1, 124);
            return this.field7270[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)[B", line = 327)
    public final byte[] method2926(int arg0, int arg1, int arg2) {
        field7239++;
        return arg1 >= -51 ? null : this.method2938(-35, null, arg0, arg2);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 344)
    public final int method2927(String arg0, int arg1) {
        field7248++;
        if (!this.method2914(true)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field7275.field6694.method1260(316610721, class408.method2528(var3, false));
        if (this.method2916(-21730, var4)) {
            return arg1 >= -13 ? 1 : var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZI)Z", line = 368)
    public final boolean method2928(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        }
        field7238++;
        if (!this.method2936(arg2, arg0, -27968)) {
            return false;
        } else if (this.field7241[arg0] != null && this.field7241[arg0][arg2] != null) {
            return true;
        } else if (this.field7270[arg0] == null) {
            this.method2939(arg0, 125);
            return this.field7270[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "(II)Z", line = 397)
    public final boolean method2929(int arg0, int arg1) {
        field7269++;
        if (!this.method2914(true)) {
            return false;
        } else if (this.field7275.field6686.length == 1) {
            return this.method2928(0, false, arg0);
        } else if (!this.method2916(-21730, arg0)) {
            return false;
        } else if (this.field7275.field6686[arg0] == 1) {
            return this.method2928(arg0, false, 0);
        } else {
            if (arg1 > -52) {
                this.method2924((byte) 88);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III[I)Z", line = 423)
    private final boolean method2930(int arg0, int arg1, int arg2, int[] arg3) {
        field7264++;
        if (!this.method2916(-21730, arg0)) {
            return false;
        } else if (this.field7270[arg0] == null) {
            return false;
        } else {
            int var5 = this.field7275.field6693[arg0];
            int[] var6 = this.field7275.field6700[arg0];
            if (this.field7241[arg0] == null) {
                this.field7241[arg0] = new Object[this.field7275.field6686[arg0]];
            }
            Object[] var7 = this.field7241[arg0];
            if (arg2 < 7) {
                this.method2913((byte) -98);
            }
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class378.method2398(this.field7270[arg0], false, -7350);
            } else {
                var11 = class378.method2398(this.field7270[arg0], true, -7350);
                class23 var12 = new class23(var11);
                var12.method150(arg3, 83, 5, var12.field302.length);
            }
            byte[] var13;
            try {
                var13 = class314.method1990(var11, 0);
            } catch (RuntimeException var49) {
                throw class216.method1494(var49, "T3 - " + (arg3 != null) + "," + arg0 + "," + var11.length + "," + class388.method2430(false, var11, var11.length) + "," + class388.method2430(false, var11, var11.length - 2) + "," + this.field7275.field6690[arg0] + "," + this.field7275.field6691);
            }
            if (this.field7256) {
                this.field7270[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field7274 == 0) {
                    var7[var15] = class411.method2537(false, var13, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field7274 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class23 var19 = new class23(var13);
                int var20 = 0;
                int var21 = 0;
                var19.field301 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method143(-3230);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg1 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field301 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method143(-3230);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg1 == var32) {
                            class85.method613(var13, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var13.length;
                int var51 = var33 - 1;
                int var34 = var13[var51] & 0xFF;
                int var35 = var51 - var5 * var34 * 4;
                class23 var36 = new class23(var13);
                int[] var37 = new int[var5];
                var36.field301 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method143(-3230);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field301 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method143(-3230);
                        class85.method613(var13, var43, var41[var46], var37[var46], var45);
                        var43 += var45;
                        var37[var46] += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field7274 == 0) {
                        var7[var48] = class411.method2537(false, var41[var47], false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 710)
    public final void method2931(boolean arg0, String arg1) {
        field7266++;
        if (!this.method2914(true)) {
            return;
        }
        if (arg0) {
            this.method2928(-1, true, 50);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field7275.field6694.method1260(316610721, class408.method2528(var3, arg0));
        this.method2941(0, var4);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 734)
    public final void method2932(int arg0) {
        field7265++;
        if (this.field7241 != null) {
            for (int var2 = 0; var2 < this.field7241.length; var2++) {
                this.field7241[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.method2934(-24);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 756)
    public final boolean method2933(String arg0, String arg1, int arg2) {
        field7262++;
        if (!this.method2914(true)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field7275.field6694.method1260(arg2 ^ 0x12DF18A1, class408.method2528(var4, false));
        if (!this.method2916(arg2 - 21730, var6)) {
            return false;
        }
        if (arg2 != 0) {
            this.field7274 = -9;
        }
        int var7 = this.field7275.field6689[var6].method1260(316610721, class408.method2528(var5, false));
        return this.method2928(var6, false, var7);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 784)
    public final void method2934(int arg0) {
        field7261++;
        if (arg0 != 28963) {
            this.method2938(-99, null, 51, 118);
        }
        if (this.field7270 != null) {
            for (int var2 = 0; var2 < this.field7270.length; var2++) {
                this.field7270[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(B)V", line = 807)
    public static void method2935(byte arg0) {
        field7272 = null;
        field7271 = null;
        field7243 = null;
        field7257 = null;
        int var1 = -116 / ((-arg0 - 25) / 33);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)Z", line = 827)
    private final boolean method2936(int arg0, int arg1, int arg2) {
        field7260++;
        if (arg2 != -27968) {
            field7257 = null;
        }
        if (!this.method2914(true)) {
            return false;
        } else if (arg1 >= 0 && arg0 >= 0 && this.field7275.field6686.length > arg1 && arg0 < this.field7275.field6686[arg1]) {
            return true;
        } else if (class130.field2231) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)I", line = 851)
    public final int method2937(int arg0, boolean arg1) {
        field7235++;
        if (this.method2914(arg1)) {
            int var3 = this.field7275.field6694.method1260(316610721, arg0);
            return this.method2916(-21730, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I[III)[B", line = 870)
    public final byte[] method2938(int arg0, int[] arg1, int arg2, int arg3) {
        field7252++;
        if (!this.method2936(arg2, arg3, -27968)) {
            return null;
        }
        int var5 = 20 % ((arg0 - 13) / 39);
        if (this.field7241[arg3] == null || this.field7241[arg3][arg2] == null) {
            boolean var6 = this.method2930(arg3, arg2, 70, arg1);
            if (!var6) {
                this.method2939(arg3, 56);
                boolean var7 = this.method2930(arg3, arg2, 84, arg1);
                if (!var7) {
                    return null;
                }
            }
        }
        byte[] var8 = class378.method2398(this.field7241[arg3][arg2], false, -7350);
        if (this.field7274 == 1) {
            this.field7241[arg3][arg2] = null;
            if (this.field7275.field6686[arg3] == 1) {
                this.field7241[arg3] = null;
            }
        } else if (this.field7274 == 2) {
            this.field7241[arg3] = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "(II)V", line = 916)
    private final void method2939(int arg0, int arg1) {
        if (arg1 <= 26) {
            field7271 = null;
        }
        if (this.field7256) {
            this.field7270[arg0] = this.field7242.method663((byte) -31, arg0);
        } else {
            this.field7270[arg0] = class411.method2537(false, this.field7242.method663((byte) -119, arg0), false);
        }
        field7258++;
    }

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "(II)I", line = 933)
    public final int method2940(int arg0, int arg1) {
        if (arg1 == -10511) {
            field7247++;
            return this.method2916(-21730, arg0) ? this.field7275.field6686[arg0] : 0;
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "(II)V", line = 949)
    private final void method2941(int arg0, int arg1) {
        this.field7242.method651(arg1, (byte) -118);
        if (arg0 != 0) {
            field7243 = null;
        }
        field7254++;
    }

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "(II)[B", line = 960)
    public final byte[] method2942(int arg0, int arg1) {
        field7268++;
        if (!this.method2914(true)) {
            return null;
        } else if (this.field7275.field6686.length == 1) {
            return this.method2926(arg0, -122, 0);
        } else if (!this.method2916(-21730, arg0)) {
            return null;
        } else if (this.field7275.field6686[arg0] == 1) {
            return this.method2926(0, -67, arg0);
        } else if (arg1 == -10365) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/String;)I", line = 987)
    public final int method2943(int arg0, String arg1) {
        field7240++;
        if (this.method2914(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field7275.field6694.method1260(316610721, class408.method2528(var3, false));
            return arg0 < 5 ? 60 : this.method2920(0, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 1018)
    public final boolean method2944(int arg0, String arg1) {
        field7250++;
        if (!this.method2914(true)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 >= -33) {
            return true;
        } else {
            int var4 = this.field7275.field6694.method1260(316610721, class408.method2528(var3, false));
            return var4 >= 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lvg;ZI)V", line = 1049)
    public class496(class470 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field7242 = arg0;
        this.field7256 = arg1;
        this.field7274 = arg2;
    }
}
