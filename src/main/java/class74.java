import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class74 extends class86 {

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    private int field1100 = 1024;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    private int field1104 = 3072;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    private int field1099 = 2048;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field1091 = 0;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public static int field1101 = -1;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "Luh;")
    public static class95 field1097;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "[[[I")
    public static int[][][] field1090;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V", line = 8)
    public final void method476(int arg0) {
        field1093++;
        this.field1099 = this.field1104 - this.field1100;
        if (arg0 != 0) {
            this.method157(-47, true, (class25) null);
        }
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V", line = 26)
    public static void method690(int arg0) {
        field1097 = null;
        field1090 = (int[][][]) null;
        if (arg0 != 9129) {
            method692(10, (char) 65471);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILrg;IIII)V", line = 38)
    public static final void method691(int arg0, int arg1, class342 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1092++;
        class181 var7 = class334.method2351(arg3, (byte) 103);
        if (arg6 != -25135) {
            field1090 = (int[][][]) ((int[][][]) null);
        }
        if (var7 == null || !var7.field2838 || !var7.method1403(true)) {
            return;
        }
        if (var7.field2835 != null) {
            int[] var8 = new int[var7.field2835.length];
            for (int var9 = 0; var9 < var8.length / 2; var9++) {
                int var10;
                if (class314.field4858 == 4) {
                    var10 = (int) class313.field4846 & 0x7FF;
                } else {
                    var10 = (int) class313.field4846 + class290.field4513 & 0x7FF;
                }
                int var11 = class107.field1605[var10];
                int var12 = class107.field1604[var10];
                if (class314.field4858 != 4) {
                    var11 = var11 * 256 / (class236.field3676 + 256);
                    var12 = var12 * 256 / (class236.field3676 + 256);
                }
                var8[var9 * 2] = arg2.field5374 / 2 + ((arg0 + (var7.field2835[var9 * 2] * 4)) * var11 + (var7.field2835[var9 * 2 + 1] * 4 + arg5) * var12 >> 16) + arg4;
                var8[var9 * 2 + 1] = arg2.field5339 / 2 + arg1 - ((var7.field2835[var9 * 2 + 1] * 4 + arg5) * var11 + -((var7.field2835[var9 * 2] * 4 + arg0) * var12) >> 16);
            }
            if (class240.field3737) {
                class88.method795(var8, var7.field2839, var7.field2839 >>> 24, arg2.field5272, arg2.field5428);
            } else {
                class241.method1826(var8, var7.field2839, var7.field2839 >>> 24, arg2.field5272, arg2.field5428);
            }
            for (int var13 = 0; var13 < (var8.length / 2 - 1); var13++) {
                if (class240.field3737) {
                    class213.method1591(var8[var13 * 2], var8[var13 * 2 + 1], var8[(var13 + 1) * 2], var8[(var13 + 1) * 2 + 1], var7.field2862, var7.field2862 >>> 24, (class2) arg2.method2399(false, 0));
                } else {
                    class60.method596(var8[var13 * 2], var8[var13 * 2 + 1], var8[(var13 + 1) * 2], var8[(var13 + 1) * 2 + 1], var7.field2862, var7.field2862 >>> 24, arg2.field5272, arg2.field5428);
                }
            }
            if (class240.field3737) {
                class213.method1591(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field2862, var7.field2862 >>> 24, (class2) arg2.method2399(false, 0));
            } else {
                class60.method596(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field2862, var7.field2862 >>> 24, arg2.field5272, arg2.field5428);
            }
        }
        class246 var14 = null;
        if (var7.field2863 != -1) {
            var14 = var7.method1406(false, false, 67);
            if (var14 != null) {
                class261.method1921(var14, arg0, (byte) -121, arg1, arg5, arg2, arg4);
            }
        }
        if (var7.field2841 == null) {
            return;
        }
        int var15 = 0;
        if (var14 != null) {
            var15 = var14.field3826;
        }
        class145 var16 = class314.field4853;
        if (var7.field2831 == 1) {
            var16 = class346.field5506;
        }
        if (var7.field2831 == 2) {
            var16 = class64.field988;
        }
        class277.method2033(var7.field2868, var7.field2841, var15, arg4, arg1, var16, arg5, arg2, 256, arg0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IC)B", line = 146)
    public static final byte method692(int arg0, char arg1) {
        int var2 = 97 % ((-arg0) / 40);
        field1106++;
        byte var3;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var3 = (byte) arg1;
        } else if (arg1 == '€') {
            var3 = -128;
        } else if (arg1 == '‚') {
            var3 = -126;
        } else if (arg1 == 'ƒ') {
            var3 = -125;
        } else if (arg1 == '„') {
            var3 = -124;
        } else if (arg1 == '…') {
            var3 = -123;
        } else if (arg1 == '†') {
            var3 = -122;
        } else if (arg1 == '‡') {
            var3 = -121;
        } else if (arg1 == 'ˆ') {
            var3 = -120;
        } else if (arg1 == '‰') {
            var3 = -119;
        } else if (arg1 == 'Š') {
            var3 = -118;
        } else if (arg1 == '‹') {
            var3 = -117;
        } else if (arg1 == 'Œ') {
            var3 = -116;
        } else if (arg1 == 'Ž') {
            var3 = -114;
        } else if (arg1 == '‘') {
            var3 = -111;
        } else if (arg1 == '’') {
            var3 = -110;
        } else if (arg1 == '“') {
            var3 = -109;
        } else if (arg1 == '”') {
            var3 = -108;
        } else if (arg1 == '•') {
            var3 = -107;
        } else if (arg1 == '–') {
            var3 = -106;
        } else if (arg1 == '—') {
            var3 = -105;
        } else if (arg1 == '˜') {
            var3 = -104;
        } else if (arg1 == '™') {
            var3 = -103;
        } else if (arg1 == 'š') {
            var3 = -102;
        } else if (arg1 == '›') {
            var3 = -101;
        } else if (arg1 == 'œ') {
            var3 = -100;
        } else if (arg1 == 'ž') {
            var3 = -98;
        } else if (arg1 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)[[I", line = 269)
    public final int[][] method156(int arg0, byte arg1) {
        field1095++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (arg1 > -126) {
            this.field1104 = -31;
        }
        if (this.field1227.field4277) {
            int[][] var4 = this.method782(arg0, 0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class93.field1424; var11++) {
                var8[var11] = this.field1100 + (var5[var11] * this.field1099 >> 12);
                var9[var11] = (var6[var11] * this.field1099 >> 12) + this.field1100;
                var10[var11] = (var7[var11] * this.field1099 >> 12) + this.field1100;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLug;)V", line = 319)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg1) {
            this.field1099 = 88;
        }
        if (arg0 == 0) {
            this.field1100 = arg2.method314((byte) 29);
        } else if (arg0 == 1) {
            this.field1104 = arg2.method314((byte) 104);
        } else if (arg0 == 2) {
            this.field1228 = arg2.method281(9) == 1;
        }
        field1094++;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 384)
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V", line = 370)
    public static final void method693(int arg0, boolean arg1) {
        class270.field4167[1] = (float) class301.method2169(arg0 >> 8, 255) / 255.0F;
        class270.field4167[2] = (float) class301.method2169(255, arg0) / 255.0F;
        class270.field4167[0] = (float) (class301.method2169(16724576, arg0) >> 16) / 255.0F;
        class254.method1886(!arg1, 3);
        field1103++;
        class254.method1886(true, 4);
        if (arg1) {
            field1091 = 3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILrn;)V", line = 395)
    public static final void method694(int arg0, class18 arg1) {
        if (arg0 == -12459) {
            field1098++;
            class297.field4610 = arg1.method186(false, "titlebg");
            class185.field2895 = arg1.method186(false, "logo");
        }
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)V", line = 413)
    public static final void method695(int arg0) {
        class233.field3627 = arg0;
        for (int var1 = 0; var1 < class154.field2492; var1++) {
            for (int var2 = 0; var2 < class166.field2642; var2++) {
                if (class170.field2689[arg0][var1][var2] == null) {
                    class170.field2689[arg0][var1][var2] = new class329(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)[I", line = 436)
    public final int[] method158(int arg0, int arg1) {
        field1102++;
        if (arg1 <= 7) {
            field1101 = -110;
        }
        int[] var3 = this.field1225.method1914(arg0, 86);
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0, 0);
            for (int var5 = 0; var5 < class93.field1424; var5++) {
                var3[var5] = this.field1100 + (var4[var5] * this.field1099 >> 12);
            }
        }
        return var3;
    }
}
