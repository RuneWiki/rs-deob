import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[[I")
    private int[][] field248;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
    public static int[] field262 = new int[50];

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lr;")
    public static class118 field252 = class153.method1136(120, "Abbrechen");

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lr;")
    public static class118 field264 = class153.method1136(86, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lr;")
    private static class118 field265 = class153.method1136(125, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Lr;")
    public static class118 field253 = field265;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
    public static final void method81(int arg0, boolean arg1) {
        field261++;
        int var2 = class105.field2425;
        if (class89.field2150.field760 >> 7 == class110.field2561 && class89.field2150.field712 >> 7 == class122.field2823) {
            class110.field2561 = 0;
        }
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = arg0; var3 < var2; var3++) {
            int var4;
            class132 var5;
            if (arg1) {
                var5 = class89.field2150;
                var4 = 33538048;
            } else {
                var4 = class73.field1685[var3] << 14;
                var5 = class108.field2526[class73.field1685[var3]];
            }
            if (var5 != null && var5.method253(-3)) {
                int var6 = var5.field760 >> 7;
                var5.field3016 = false;
                int var7 = var5.field712 >> 7;
                if ((class68.field1582 && class105.field2425 > 50 || class105.field2425 > 200) && !arg1 && var5.field766 == var5.field765) {
                    var5.field3016 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field3013 == null || class65.field1479 < var5.field3004 || class65.field1479 >= var5.field3002) {
                        if ((var5.field760 & 0x7F) == 64 && (var5.field712 & 0x7F) == 64) {
                            if (class51.field1229[var6][var7] == class159.field3660) {
                                continue;
                            }
                            class51.field1229[var6][var7] = class159.field3660;
                        }
                        var5.field3010 = class46.method386(-15186, class106.field2468, var5.field760, var5.field712);
                        class68.field1583.method1191(class106.field2468, var5.field760, var5.field712, var5.field3010, 60, var5, var5.field768, var4, var5.field752);
                    } else {
                        var5.field3016 = false;
                        var5.field3010 = class46.method386(-15186, class106.field2468, var5.field760, var5.field712);
                        class68.field1583.method1158(class106.field2468, var5.field760, var5.field712, var5.field3010, 60, var5, var5.field768, var4, var5.field3015, var5.field3020, var5.field2997, var5.field3001);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lff;I)V")
    public static final void method82(class42 arg0, int arg1) {
        if (arg1 == 1652903458) {
            field257++;
            class128.field2932 = arg0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
    private static final int method83(int arg0, int arg1, int arg2) {
        field258++;
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 != 0) {
            return -83;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
    public static final boolean method84(int arg0, int arg1) {
        if (arg0 != 18014) {
            method86(-82);
        }
        field251++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)I")
    public final int method85(byte arg0, int arg1) {
        if (arg0 > -126) {
            return -77;
        }
        field256++;
        if (this.field248 != null) {
            arg1 = (int) ((long) this.field259 * (long) arg1 / (long) this.field263) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method86(int arg0) {
        field250++;
        int var1 = class115.field2699.method33(class53.field1266);
        for (int var2 = 0; var2 < class39.field950; var2++) {
            int var6 = class115.field2699.method33(class95.method747((byte) -114, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class71.field1651 = class39.field950 * 15 + 22;
        var1 += 8;
        class138.field3144 = true;
        class151.field3418 = var1;
        int var3 = class39.field950 * 15 + 21;
        int var4 = class14.field317;
        int var5 = class29.field701 - var1 / 2;
        if (var1 + var5 > 765) {
            var5 = 765 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var3 + var4 > arg0) {
            var4 = 503 - var3;
        }
        class138.field3157 = var5;
        if (var4 < 0) {
            var4 = 0;
        }
        class89.field2141 = var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[Lsc;[BIII)V")
    public static final void method87(int arg0, int arg1, class128[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        for (int var7 = arg6; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg4 + var13 > 0 && arg4 + var13 < 103) {
                        arg2[var7].field2958[arg1 + var12][arg4 + var13] = class79.method669(arg2[var7].field2958[arg1 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        field260++;
        class105 var8 = new class105(arg3);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class140.method1049(var8, 0, arg5, var9, arg1 + var10, arg4 + var11, 29571, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method88(byte arg0) {
        field265 = null;
        field252 = null;
        if (arg0 == 59) {
            field262 = null;
            field253 = null;
            field264 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)I")
    public final int method89(int arg0, byte arg1) {
        if (this.field248 != null) {
            arg0 = (int) ((long) this.field259 * (long) arg0 / (long) this.field263);
        }
        if (arg1 > -70) {
            field253 = null;
        }
        field255++;
        return arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BI)[B")
    public final byte[] method90(byte[] arg0, int arg1) {
        if (this.field248 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field259 / (long) this.field263) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field248[var6];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var10[var12] * var11;
                }
                int var13 = this.field259 + var6;
                int var14 = var13 / this.field263;
                var6 = var13 - this.field263 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field249++;
        int var15 = -20 % ((-arg1 - 23) / 44);
        return arg0;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V")
    public class11(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = method83(arg0, 0, arg1);
            int var4 = arg1 / var3;
            this.field259 = var4;
            int var5 = arg0 / var3;
            this.field248 = new int[var5][14];
            this.field263 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field248[var6];
                double var8 = (double) var4 / (double) var5;
                double var10 = (double) var6 / (double) var5 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var10) * 3.141592653589793D;
                    double var16 = var8;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var8 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
