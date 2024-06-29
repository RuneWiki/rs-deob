import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class143 extends class240 {

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    private int field2513 = -1;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field2507 = 0;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "[J")
    public static long[] field2518 = new long[32];

    @OriginalMember(owner = "client!di", name = "O", descriptor = "Lcd;")
    private static class64 field2503 = class44.method335((byte) 71, "Connecting to update server");

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "I")
    public static int field2520 = 1;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Lcd;")
    public static class64 field2512 = field2503;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!di", name = "ib", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!di", name = "jb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "Lqm;")
    public static class222 field2504;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "Ll;")
    public static class284 field2516;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "[I")
    public int[] field2508;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILkh;)V", line = 6)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            field2512 = (class64) null;
        }
        if (arg1 == 0) {
            this.field2513 = arg2.method112((byte) 92);
        }
        field2523++;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V", line = 24)
    public final void method1012(byte arg0) {
        field2505++;
        if (arg0 >= -74) {
            field2503 = (class64) null;
        }
        super.method1012((byte) -87);
        this.field2508 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(BI)I", line = 36)
    public static final int method1013(byte arg0, int arg1) {
        if (arg0 < 15) {
            field2504 = (class222) null;
        }
        field2511++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(B)V", line = 54)
    public static final void method1014(byte arg0) {
        if (arg0 != -92) {
            return;
        }
        for (int var1 = -1; var1 < class163.field2862; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class194.field3307[var1];
            }
            class41 var3 = class284.field4888[var2];
            if (var3 != null) {
                class182.method1290((byte) 67, var3, var3.method325(-12808));
            }
        }
        field2521++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILcd;)V", line = 86)
    public static final void method1015(int arg0, class64 arg1) {
        field2517++;
        int var2 = class230.method1660(true, arg1);
        if (var2 == -1) {
            return;
        }
        class255.field4436 = field2516.field4878[var2] - class251.field4360;
        int var3 = (int) ((float) class47.field790.field1163 / class298.field5138) + class255.field4436;
        class189.field3257 = class232.field3923 + class233.field3934 - field2516.field4884[var2] - 1;
        int var4 = (int) ((float) class47.field790.field1016 / class298.field5138) + class189.field3257;
        int var5 = class189.field3257 - (int) ((float) class47.field790.field1016 / class298.field5138);
        int var6 = class255.field4436 - (int) ((float) class47.field790.field1163 / class298.field5138);
        if (var6 < 0) {
            class255.field4436 = (int) ((float) class47.field790.field1163 / class298.field5138);
        }
        if (class226.field3845 < var3) {
            class255.field4436 = class226.field3845 - ((int) ((float) class47.field790.field1163 / class298.field5138));
        }
        if (arg0 > var5) {
            class189.field3257 = (int) ((float) class47.field790.field1016 / class298.field5138);
        }
        if (var4 > class233.field3934) {
            class189.field3257 = class233.field3934 - ((int) ((float) class47.field790.field1016 / class298.field5138));
        }
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V", line = 121)
    public static void method1016(int arg0) {
        field2518 = null;
        field2504 = null;
        field2516 = null;
        field2512 = null;
        field2503 = null;
        if (arg0 <= 111) {
            field2512 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 139)
    public class143() {
        super(0, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(La;IIIII)V", line = 148)
    public static final void method1017(class262 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class183.field3140 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class146.field2588) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class314.field5327 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class295 var14 = class304.field5203[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class96.field1764[var11][var12 + 1][var13] + class96.field1764[var11][var12][var13] + class96.field1764[var11][var12][var13 + 1] + class96.field1764[var11][var12 + 1][var13 + 1]) / 4 - (class96.field1764[arg1][arg2 + 1][arg3] + class96.field1764[arg1][arg2][arg3] + class96.field1764[arg1][arg2][arg3 + 1] + class96.field1764[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class162 var16 = var14.field5092;
                                    if (var16 != null) {
                                        if (var16.field2852.method1069()) {
                                            arg0.method1071(var16.field2852, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2842 != null && var16.field2842.method1069()) {
                                            arg0.method1071(var16.field2842, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field5075; var17++) {
                                        class195 var18 = var14.field5090[var17];
                                        if (var18 != null && var18.field3330.method1069() && (var18.field3313 == var12 || var7 == var12) && (var18.field3322 == var13 || var9 == var13)) {
                                            int var19 = var18.field3328 + 1 - var18.field3313;
                                            int var20 = var18.field3323 + 1 - var18.field3322;
                                            arg0.method1071(var18.field3330, (var18.field3313 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3322 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V", line = 254)
    public static final void method1018(int arg0) {
        class62.field1209 = (int[][][]) null;
        class173.field2988 = (byte[][][]) null;
        class159.field2812 = (byte[][][]) null;
        class288.field4920 = null;
        class270.field4665 = (short[][][]) null;
        field2509++;
        class134.field2377 = (byte[][][]) null;
        class295.field5073 = (int[][][]) null;
        class276.field4745 = 0;
        class165.field2897 = null;
        class253.field4416 = (byte[][][]) null;
        class122.field2192 = (byte[][][]) null;
        class47.field790 = null;
        class117.field2134.method776((byte) 64);
        class270.field4657 = null;
        class295.field5068 = null;
        class199.field3410 = null;
        if (arg0 >= -75) {
            return;
        }
        class254.field4425 = null;
        field2516 = null;
        class255.field4429 = null;
        class118.field2147 = null;
        class163.field2864 = null;
        class41.field679 = null;
        class273.field4695 = null;
        class114.field2097 = null;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)I", line = 292)
    public final int method1019(byte arg0) {
        field2515++;
        return arg0 >= -126 ? -4 : this.field2513;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[[I", line = 311)
    public int[][] method286(byte arg0, int arg1) {
        int[][] var3 = this.field4095.method1797(arg1, -124);
        if (arg0 <= 34) {
            this.method1020(-54);
        }
        field2519++;
        if (this.field4095.field4355 && this.method1020(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (class131.field2320 == this.field2514 ? arg1 : this.field2514 * arg1 / class131.field2320) * this.field2506;
            int[] var7 = var3[2];
            if (class169.field2936 == this.field2506) {
                for (int var8 = 0; var8 < class169.field2936; var8++) {
                    int var9 = this.field2508[var6++];
                    var7[var8] = class224.method1614(4080, var9 << 4);
                    var5[var8] = class224.method1614(65280, var9) >> 4;
                    var4[var8] = class224.method1614(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class169.field2936; var10++) {
                    int var11 = this.field2506 * var10 / class169.field2936;
                    int var12 = this.field2508[var6 + var11];
                    var7[var10] = class224.method1614(4080, var12 << 4);
                    var5[var10] = class224.method1614(65280, var12) >> 4;
                    var4[var10] = class224.method1614(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(I)Z", line = 380)
    public final boolean method1020(int arg0) {
        field2522++;
        if (this.field2508 != null) {
            return true;
        } else if (arg0 < ~this.field2513) {
            return false;
        } else {
            class127 var2 = class78.method615(this.field2513, 1, class47.field773);
            var2.method925();
            this.field2514 = var2.field629;
            this.field2508 = var2.field2274;
            this.field2506 = var2.field627;
            return true;
        }
    }
}
