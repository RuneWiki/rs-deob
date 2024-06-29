import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class92 {

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Lrd;")
    public static class114 field2157 = class84.method656("Geben Sie Ihren Benutzernamen", (byte) 114);

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Lrd;")
    public static class114 field2162 = class84.method656(" )2> @cya@", (byte) 127);

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field2166 = 0;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Lrd;")
    private static class114 field2167 = class84.method656("Login server offline)3", (byte) 127);

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lrd;")
    public static class114 field2143 = field2167;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    private int field2153;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "J")
    private long field2142;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "J")
    private long field2165;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Z")
    public boolean field2161;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "[I")
    public static int[] field2145;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[I")
    private int[] field2151;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "[I")
    private int[] field2163;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[[[B")
    public static byte[][][] field2144;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    private final void method705(int arg0) {
        field2150++;
        long var2 = this.field2165;
        int var4 = this.field2151[5];
        this.field2165 = 0L;
        int var5 = this.field2151[9];
        this.field2151[5] = var5;
        this.field2151[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2165 <<= 0x4;
            if (this.field2151[var6] >= 256) {
                this.field2165 += this.field2151[var6] - 256;
            }
        }
        if (arg0 != -28241) {
            method719((byte) 11, 81, -67);
        }
        if (this.field2151[0] >= 256) {
            this.field2165 += this.field2151[0] - 256 >> 4;
        }
        if (this.field2151[1] >= 256) {
            this.field2165 += this.field2151[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field2165 <<= 0x3;
            this.field2165 += this.field2163[var7];
        }
        this.field2151[5] = var4;
        this.field2151[9] = var5;
        this.field2165 <<= 0x1;
        this.field2165 += this.field2161 ? 1 : 0;
        if (var2 != 0L && this.field2165 != var2) {
            class110.field2561.method203(var2, 2);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Lkc;")
    public final class71 method706(byte arg0) {
        field2158++;
        if (this.field2153 != -1) {
            return class51.method361(this.field2153, (byte) 48).method969(0);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field2151[var3];
            if (var12 >= 256 && var12 < 512 && !class106.method809(var12 - 256, -1).method1125(0)) {
                var2 = true;
            }
            if (var12 >= 512 && !class128.method988(var12 - 512, false).method365(108, this.field2161)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        int var4 = 0;
        class71[] var5 = new class71[12];
        if (arg0 <= 43) {
            field2159 = 29;
        }
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field2151[var6];
            if (var9 >= 256 && var9 < 512) {
                class71 var10 = class106.method809(var9 - 256, -1).method1130(-128);
                if (var10 != null) {
                    var5[var4++] = var10;
                }
            }
            if (var9 >= 512) {
                class71 var11 = class128.method988(var9 - 512, false).method370(100, this.field2161);
                if (var11 != null) {
                    var5[var4++] = var11;
                }
            }
        }
        class71 var7 = new class71(var5, var4);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field2163[var8] != 0) {
                var7.method580(class102.field2372[var8][0], class102.field2372[var8][this.field2163[var8]]);
                if (var8 == 1) {
                    var7.method580(client.field397[0], client.field397[this.field2163[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public static final void method707(byte arg0) {
        try {
            Graphics var1 = class114.field2678.getGraphics();
            class58.field1207.method526(0, 553, 205, var1);
        } catch (Exception var2) {
            class114.field2678.repaint();
        }
        field2141++;
        if (arg0 != -7) {
            field2159 = -107;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lid;B)V")
    public final void method708(class60 arg0, byte arg1) {
        field2140++;
        arg0.method478((byte) 118, this.field2161 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field2151[class117.field2736[var3]];
            if (var5 == 0) {
                arg0.method478((byte) 115, -1);
            } else {
                arg0.method478((byte) 120, var5 - 256);
            }
        }
        int var4 = 0;
        if (arg1 <= 102) {
            this.method708(null, (byte) -86);
        }
        while (var4 < 5) {
            arg0.method478((byte) 104, this.field2163[var4]);
            var4++;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public static void method709(byte arg0) {
        field2144 = null;
        field2167 = null;
        field2157 = null;
        if (arg0 != -69) {
            field2162 = null;
        }
        field2162 = null;
        field2145 = null;
        field2143 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIB[I[I)V")
    public final void method710(boolean arg0, int arg1, byte arg2, int[] arg3, int[] arg4) {
        field2139++;
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class114.field2648; var7++) {
                    class141 var8 = class106.method809(var7, -1);
                    if (var8 != null && !var8.field3370 && var8.field3351 == (arg0 ? 7 : 0) + var6) {
                        arg4[class117.field2736[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2153 = arg1;
        this.field2161 = arg0;
        this.field2163 = arg3;
        this.field2151 = arg4;
        if (arg2 == -34) {
            this.method705(-28241);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZII)V")
    public final void method711(boolean arg0, int arg1, int arg2) {
        if (arg1 < 93) {
            this.method713(109);
        }
        field2164++;
        int var4 = this.field2163[arg2];
        if (arg0) {
            var4++;
            if (var4 >= class102.field2372[arg2].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class102.field2372[arg2].length - 1;
            }
        }
        this.field2163[arg2] = var4;
        this.method705(-28241);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB[B)I")
    public static final int method712(int arg0, byte arg1, byte[] arg2) {
        field2149++;
        return arg1 <= 57 ? 127 : class25.method192(arg2, 0, -23173, arg0);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I")
    public final int method713(int arg0) {
        int var2 = 74 % ((arg0 + 9) / 41);
        field2155++;
        return this.field2153 == -1 ? (this.field2151[8] << 10) + (this.field2163[0] << 25) + (this.field2163[4] << 20) + (this.field2151[0] << 15) + (this.field2151[11] << 5) + this.field2151[1] : class51.method361(this.field2153, (byte) 48).field2933 + 305419896;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)I")
    public static final int method714(byte arg0, int arg1) {
        field2148++;
        if (arg0 < 16) {
            return 54;
        }
        class116 var2 = class100.method771(arg1, false);
        int var3 = var2.field2696;
        int var4 = var2.field2700;
        int var5 = class69.field1515[var4 - var3];
        int var6 = var2.field2706;
        return var5 & class123.field2896[var6] >> var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIB)V")
    public final void method715(boolean arg0, int arg1, byte arg2) {
        field2138++;
        if (arg1 == 1 && this.field2161) {
            return;
        }
        int var4 = this.field2151[class117.field2736[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class141 var5;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class114.field2648) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class114.field2648 - 1;
                }
            }
            var5 = class106.method809(var4, -1);
        } while (var5 == null || var5.field3370 || var5.field3351 != (this.field2161 ? 7 : 0) + arg1);
        this.field2151[class117.field2736[arg1]] = var4 + 256;
        this.method705(-28241);
        int var6 = -117 % ((arg2 + 17) / 44);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)V")
    public final void method716(boolean arg0, int arg1) {
        field2156++;
        if (this.field2161 != arg0) {
            if (arg1 != -1) {
                method709((byte) 65);
            }
            this.method710(arg0, -1, (byte) -34, this.field2163, null);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILe;IILe;)Lue;")
    public final class133 method717(int arg0, class29 arg1, int arg2, int arg3, class29 arg4) {
        field2147++;
        if (~this.field2153 != arg2) {
            return class51.method361(this.field2153, (byte) 48).method964(arg0, arg1, arg3, (byte) 24, arg4);
        }
        int[] var6 = this.field2151;
        long var7 = this.field2165;
        if (arg1 != null && (arg1.field576 >= 0 || arg1.field603 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field2151[var9];
            }
            if (arg1.field576 >= 0) {
                var7 += arg1.field576 - this.field2151[5] << 8;
                var6[5] = arg1.field576;
            }
            if (arg1.field603 >= 0) {
                var7 += arg1.field603 - this.field2151[3] << 16;
                var6[3] = arg1.field603;
            }
        }
        class133 var10 = (class133) class110.field2561.method194((byte) -109, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if (var21 >= 256 && var21 < 512 && !class106.method809(var21 - 256, arg2 + -1).method1121(false)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class128.method988(var21 - 512, false).method364(this.field2161, (byte) 40)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2142 != -1L) {
                    var10 = (class133) class110.field2561.method194((byte) -92, this.field2142);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class71[] var13 = new class71[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class71 var19 = class106.method809(var18 - 256, ~arg2).method1124(31811);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class71 var20 = class128.method988(var18 - 512, false).method373(arg2, this.field2161);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class71 var16 = new class71(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field2163[var17] != 0) {
                        var16.method580(class102.field2372[var17][0], class102.field2372[var17][this.field2163[var17]]);
                        if (var17 == 1) {
                            var16.method580(client.field397[0], client.field397[this.field2163[var17]]);
                        }
                    }
                }
                var10 = var16.method569(64, 850, -30, -50, -30);
                class110.field2561.method193(arg2 ^ 0xFFFFFFA4, var10, var7);
                this.field2142 = var7;
            }
        }
        if (arg1 == null && arg4 == null) {
            return var10;
        }
        class133 var22;
        if (arg1 != null && arg4 != null) {
            var22 = arg1.method213(arg0, arg3, arg4, arg2 ^ 0xFFFFFFA4, var10);
        } else if (arg1 == null) {
            var22 = arg4.method219(var10, arg0, (byte) -43);
        } else {
            var22 = arg1.method219(var10, arg3, (byte) -43);
        }
        return var22;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static final void method718(int arg0) {
        field2137++;
        if (arg0 != 357) {
            method718(106);
        }
        try {
            Graphics var1 = class114.field2678.getGraphics();
            class132.field3199.method526(0, 17, 357, var1);
        } catch (Exception var2) {
            class114.field2678.repaint();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)Lnd;")
    public static final class90 method719(byte arg0, int arg1, int arg2) {
        class90 var3 = class14.method115(65535, arg1);
        field2160++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field2031 == null || arg2 >= var3.field2031.length) {
            return null;
        } else {
            if (arg0 > -56) {
                method719((byte) -2, 69, 100);
            }
            return var3.field2031[arg2];
        }
    }
}
