import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class133 {

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3171 = 0;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "[I")
    public static int[] field3167 = new int[50];

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Lkc;")
    public static class67 field3185 = class19.method144("b12_full", 104);

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lkc;")
    private static class67 field3161 = class19.method144("Please wait)3)3)3", 109);

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lkc;")
    public static class67 field3156 = field3161;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3179 = 0;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lkc;")
    public static class67 field3163 = field3161;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    private int field3187;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "J")
    private long field3169;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "J")
    private long field3177;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lta;")
    public static class119 field3165;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Lje;")
    public static class63 field3173;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Lpc;")
    public static class97 field3181;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Z")
    public boolean field3182;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    private int[] field3154;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[I")
    private int[] field3178;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "[Lnd;")
    public static class86[] field3176;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[[[B")
    public static byte[][][] field3157;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZI[I[I)V", line = 8)
    public final void method1021(int arg0, boolean arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class33.field774; var7++) {
                    class31 var8 = class108.method825(true, var7);
                    if (var8 != null && !var8.field652 && var8.field662 == var6 + (arg1 ? 7 : 0)) {
                        arg3[class66.field1544[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field3154 = arg3;
        this.field3178 = arg4;
        this.field3187 = arg0;
        this.field3182 = arg1;
        this.method1023(false);
        field3168++;
        if (arg2 <= 72) {
            method1028(true);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ls;Ls;ZII)Lfd;", line = 57)
    public final class39 method1022(class112 arg0, class112 arg1, boolean arg2, int arg3, int arg4) {
        field3155++;
        if (!arg2) {
            return null;
        } else if (this.field3187 == -1) {
            long var6 = this.field3169;
            int[] var8 = this.field3154;
            if (arg0 != null && (arg0.field2585 >= 0 || arg0.field2560 >= 0)) {
                var8 = new int[12];
                for (int var9 = 0; var9 < 12; var9++) {
                    var8[var9] = this.field3154[var9];
                }
                if (arg0.field2585 >= 0) {
                    var6 += arg0.field2585 - this.field3154[5] << 8;
                    var8[5] = arg0.field2585;
                }
                if (arg0.field2560 >= 0) {
                    var6 += arg0.field2560 - this.field3154[3] << 16;
                    var8[3] = arg0.field2560;
                }
            }
            class39 var10 = (class39) class33.field756.method373((byte) 111, var6);
            if (var10 == null) {
                boolean var11 = false;
                for (int var12 = 0; var12 < 12; var12++) {
                    int var20 = var8[var12];
                    if (var20 >= 256 && var20 < 512 && !class108.method825(true, var20 - 256).method266(1745596848)) {
                        var11 = true;
                    }
                    if (var20 >= 512 && !class55.method440(var20 - 512, 21467).method1013((byte) -105, this.field3182)) {
                        var11 = true;
                    }
                }
                if (var11) {
                    if (this.field3177 != -1L) {
                        var10 = (class39) class33.field756.method373((byte) 116, this.field3177);
                    }
                    if (var10 == null) {
                        return null;
                    }
                }
                if (var10 == null) {
                    class39[] var13 = new class39[12];
                    int var14 = 0;
                    for (int var15 = 0; var15 < 12; var15++) {
                        int var17 = var8[var15];
                        if (var17 >= 256 && var17 < 512) {
                            class39 var18 = class108.method825(arg2, var17 - 256).method265(0);
                            if (var18 != null) {
                                var13[var14++] = var18;
                            }
                        }
                        if (var17 >= 512) {
                            class39 var19 = class55.method440(var17 - 512, 21467).method1016(this.field3182, 0);
                            if (var19 != null) {
                                var13[var14++] = var19;
                            }
                        }
                    }
                    var10 = new class39(var13, var14);
                    for (int var16 = 0; var16 < 5; var16++) {
                        if (this.field3178[var16] != 0) {
                            var10.method337(class78.field1855[var16][0], class78.field1855[var16][this.field3178[var16]]);
                            if (var16 == 1) {
                                var10.method337(class60.field1430[0], class60.field1430[this.field3178[var16]]);
                            }
                        }
                    }
                    var10.method344();
                    var10.method318(64, 850, -30, -50, -30, true);
                    class33.field756.method374(0, var10, var6);
                    this.field3177 = var6;
                }
            }
            if (arg0 == null && arg1 == null) {
                return var10;
            }
            class39 var21;
            if (arg0 != null && arg1 != null) {
                var21 = arg0.method848(arg3, (byte) -58, arg1, var10, arg4);
            } else if (arg0 == null) {
                var21 = arg1.method849(arg4, var10, (byte) -34);
            } else {
                var21 = arg0.method849(arg3, var10, (byte) -107);
            }
            return var21;
        } else {
            return class63.method483(this.field3187, true).method588(arg3, arg0, arg1, arg4, -8880);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 237)
    private final void method1023(boolean arg0) {
        field3170++;
        long var2 = this.field3169;
        if (arg0) {
            this.method1032(-86, null);
        }
        int var4 = this.field3154[9];
        this.field3169 = 0L;
        int var5 = this.field3154[5];
        this.field3154[9] = var5;
        this.field3154[5] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field3169 <<= 0x4;
            if (this.field3154[var6] >= 256) {
                this.field3169 += this.field3154[var6] - 256;
            }
        }
        if (this.field3154[0] >= 256) {
            this.field3169 += this.field3154[0] - 256 >> 4;
        }
        if (this.field3154[1] >= 256) {
            this.field3169 += this.field3154[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field3169 <<= 0x3;
            this.field3169 += this.field3178[var7];
        }
        this.field3154[9] = var4;
        this.field3154[5] = var5;
        this.field3169 <<= 0x1;
        this.field3169 += this.field3182 ? 1 : 0;
        if (var2 != 0L && this.field3169 != var2) {
            class33.field756.method375(-89, var2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BZI)V", line = 293)
    public final void method1024(byte arg0, boolean arg1, int arg2) {
        field3153++;
        if (arg2 == 1 && this.field3182) {
            return;
        }
        int var4 = this.field3154[class66.field1544[arg2]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class31 var5;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class33.field774) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class33.field774 - 1;
                }
            }
            var5 = class108.method825(true, var4);
        } while (var5 == null || var5.field652 || var5.field662 != (this.field3182 ? 7 : 0) + arg2);
        this.field3154[class66.field1544[arg2]] = var4 + 256;
        this.method1023(false);
        if (arg0 >= -44) {
            method1025((byte) 76);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 341)
    public static final void method1025(byte arg0) {
        field3188++;
        class132.field3119 = true;
        class94.method744(2);
        if (arg0 != 9) {
            return;
        }
        if (class114.field2671 != -1) {
            boolean var1 = class99.method762(0, 261, 190, 0, 1, false, class114.field2671);
            if (!var1) {
                class121.field2849 = true;
            }
        } else if (class122.field2894[class131.field3089] != -1) {
            boolean var2 = class99.method762(0, 261, 190, 0, 1, false, class122.field2894[class131.field3089]);
            if (!var2) {
                class121.field2849 = true;
            }
        }
        if (class90.field2066 && class31.field663 == 1) {
            if (class122.field2867 == 1) {
                class25.method192(arg0 - 10);
            } else {
                class115.method921(-1);
            }
        }
        class103.method786(0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZII)V", line = 384)
    public final void method1026(boolean arg0, int arg1, int arg2) {
        field3152++;
        int var4 = this.field3178[arg2];
        if (arg0) {
            var4++;
            if (var4 >= class78.field1855[arg2].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class78.field1855[arg2].length - 1;
            }
        }
        this.field3178[arg2] = var4;
        this.method1023(false);
        if (arg1 < 71) {
            field3157 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBIILed;III)V", line = 416)
    public static final void method1027(int arg0, int arg1, byte arg2, int arg3, int arg4, class33 arg5, int arg6, int arg7, int arg8) {
        field3175++;
        if (class21.field427) {
            class85.field2012 = 32;
        } else {
            class85.field2012 = 0;
        }
        class21.field427 = false;
        int var9 = 93 / ((-arg2 - 29) / 43);
        if (arg3 <= arg1 && arg3 + 16 > arg1 && arg8 <= arg0 && arg8 + 16 > arg0) {
            if (arg4 == 1) {
                class121.field2849 = true;
            }
            arg5.field806 -= class24.field512 * 4;
            if (arg4 == 2 || arg4 == 3) {
                class138.field3304 = true;
            }
        } else if (arg3 <= arg1 && arg1 < arg3 + 16 && arg0 >= arg6 + arg8 - 16 && arg0 < arg6 + arg8) {
            if (arg4 == 1) {
                class121.field2849 = true;
            }
            arg5.field806 += class24.field512 * 4;
            if (arg4 == 2 || arg4 == 3) {
                class138.field3304 = true;
            }
        } else if (arg3 - class85.field2012 <= arg1 && arg3 + class85.field2012 + 16 > arg1 && arg0 >= arg8 + 16 && arg0 < arg8 + arg6 - 16 && class24.field512 > 0) {
            if (arg4 == 1) {
                class121.field2849 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class138.field3304 = true;
            }
            class21.field427 = true;
            int var10 = (arg6 - 32) * arg6 / arg7;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg0 - var10 / 2 - arg8 - 16;
            int var12 = arg6 - var10 - 32;
            arg5.field806 = (arg7 - arg6) * var11 / var12;
        }
        if (field3171 == 0) {
            return;
        }
        int var13 = arg5.field733;
        if (arg4 == -1) {
            var13 = 479;
        }
        if (arg1 < arg3 - var13 || arg0 < arg8 || arg3 + 16 <= arg1 || arg6 + arg8 < arg0) {
            return;
        }
        arg5.field806 += field3171 * 45;
        if (arg4 == 2 || arg4 == 3) {
            class138.field3304 = true;
        }
        if (arg4 == 1) {
            class121.field2849 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V", line = 516)
    public static final void method1028(boolean arg0) {
        field3162++;
        int var1 = class112.field2558.method709(8, (byte) 86);
        if (var1 < class81.field1948) {
            for (int var2 = var1; var2 < class81.field1948; var2++) {
                class60.field1435[class34.field834++] = class119.field2820[var2];
            }
        }
        if (class81.field1948 < var1) {
            throw new RuntimeException("gppov1");
        }
        class81.field1948 = 0;
        int var3 = 0;
        if (!arg0) {
            field3176 = null;
        }
        while (var1 > var3) {
            int var4 = class119.field2820[var3];
            class103 var5 = class44.field1067[var4];
            int var6 = class112.field2558.method709(1, (byte) 86);
            if (var6 == 0) {
                class119.field2820[class81.field1948++] = var4;
                var5.field1217 = class135.field3243;
            } else {
                int var7 = class112.field2558.method709(2, (byte) 86);
                if (var7 == 0) {
                    class119.field2820[class81.field1948++] = var4;
                    var5.field1217 = class135.field3243;
                    class138.field3308[class69.field1649++] = var4;
                } else if (var7 == 1) {
                    class119.field2820[class81.field1948++] = var4;
                    var5.field1217 = class135.field3243;
                    int var8 = class112.field2558.method709(3, (byte) 86);
                    var5.method418(true, var8, false);
                    int var9 = class112.field2558.method709(1, (byte) 86);
                    if (var9 == 1) {
                        class138.field3308[class69.field1649++] = var4;
                    }
                } else if (var7 == 2) {
                    class119.field2820[class81.field1948++] = var4;
                    var5.field1217 = class135.field3243;
                    int var10 = class112.field2558.method709(3, (byte) 86);
                    var5.method418(arg0, var10, true);
                    int var11 = class112.field2558.method709(3, (byte) 86);
                    var5.method418(true, var11, true);
                    int var12 = class112.field2558.method709(1, (byte) 86);
                    if (var12 == 1) {
                        class138.field3308[class69.field1649++] = var4;
                    }
                } else if (var7 == 3) {
                    class60.field1435[class34.field834++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIB)V", line = 634)
    public static final void method1029(int arg0, int arg1, int arg2, byte arg3) {
        if (arg0 == 1) {
            class54.field1295.method713(503, 245);
            class48.field1153++;
            class54.field1295.method1100(arg2, (byte) 125);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg3 > -75) {
            return;
        }
        field3183++;
        if (arg0 == 2) {
            class117.field2757++;
            class54.field1295.method713(503, 30);
            class54.field1295.method1100(arg2, (byte) -50);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg0 == 3) {
            class64.field1515++;
            class54.field1295.method713(503, 244);
            class54.field1295.method1100(arg2, (byte) -49);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg0 == 4) {
            class25.field534++;
            class54.field1295.method713(503, 164);
            class54.field1295.method1100(arg2, (byte) 92);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg0 == 5) {
            class54.field1295.method713(503, 57);
            class45.field1099++;
            class54.field1295.method1100(arg2, (byte) -25);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg0 == 6) {
            class54.field1295.method713(503, 174);
            class10.field204++;
            class54.field1295.method1100(arg2, (byte) 127);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg0 == 7) {
            class12.field272++;
            class54.field1295.method713(503, 28);
            class54.field1295.method1100(arg2, (byte) 114);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg0 == 8) {
            class14.field294++;
            class54.field1295.method713(503, 171);
            class54.field1295.method1100(arg2, (byte) -24);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg0 == 9) {
            class100.field2244++;
            class54.field1295.method713(503, 33);
            class54.field1295.method1100(arg2, (byte) 0);
            class54.field1295.method1079(-106701336, arg1);
        }
        if (arg0 == 10) {
            class21.field430++;
            class54.field1295.method713(503, 36);
            class54.field1295.method1100(arg2, (byte) -97);
            class54.field1295.method1079(-106701336, arg1);
        }
        class33 var4 = class93.method738(1, arg1, arg2);
        if (var4 != null && var4.field757 != null) {
            class112.method853(var4, var4.field757, false, 0, arg0, 0, null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lfd;", line = 733)
    public final class39 method1030(byte arg0) {
        field3159++;
        if (this.field3187 != -1) {
            return class63.method483(this.field3187, true).method590(-119);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field3154[var3];
            if (var12 >= 256 && var12 < 512 && !class108.method825(true, var12 - 256).method269(0)) {
                var2 = true;
            }
            if (var12 >= 512 && !class55.method440(var12 - 512, 21467).method1008(this.field3182, -15360)) {
                var2 = true;
            }
        }
        if (arg0 < 89) {
            this.field3187 = -106;
        }
        if (var2) {
            return null;
        }
        class39[] var4 = new class39[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field3154[var6];
            if (var9 >= 256 && var9 < 512) {
                class39 var10 = class108.method825(true, var9 - 256).method264((byte) 127);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class39 var11 = class55.method440(var9 - 512, 21467).method1006(this.field3182, (byte) 17);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class39 var7 = new class39(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field3178[var8] != 0) {
                var7.method337(class78.field1855[var8][0], class78.field1855[var8][this.field3178[var8]]);
                if (var8 == 1) {
                    var7.method337(class60.field1430[0], class60.field1430[this.field3178[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 845)
    public static void method1031(int arg0) {
        field3163 = null;
        field3173 = null;
        field3157 = null;
        field3185 = null;
        field3165 = null;
        field3167 = null;
        if (arg0 != 1026) {
            method1027(41, -105, (byte) 75, 43, 122, null, 48, -11, 78);
        }
        field3176 = null;
        field3181 = null;
        field3156 = null;
        field3161 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILwd;)V", line = 876)
    public final void method1032(int arg0, class140 arg1) {
        int var3 = 71 / ((35 - arg0) / 59);
        field3184++;
        arg1.method1115((byte) 49, this.field3182 ? 1 : 0);
        for (int var4 = 0; var4 < 7; var4++) {
            int var6 = this.field3154[class66.field1544[var4]];
            if (var6 == 0) {
                arg1.method1115((byte) 49, -1);
            } else {
                arg1.method1115((byte) 49, var6 - 256);
            }
        }
        for (int var5 = 0; var5 < 5; var5++) {
            arg1.method1115((byte) 49, this.field3178[var5]);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I", line = 908)
    public final int method1033(int arg0) {
        if (arg0 != -1157636529) {
            field3173 = null;
        }
        field3160++;
        return this.field3187 == -1 ? (this.field3178[0] << 25) + (this.field3154[0] << 15) + (this.field3154[11] << 5) + (this.field3178[4] << 20) + (this.field3154[8] << 10) + this.field3154[1] : class63.method483(this.field3187, true).field1740 + 305419896;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBIIII)I", line = 930)
    public static final int method1034(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg1;
            arg1 = var7;
        }
        if (arg2 >= -125) {
            field3185 = null;
        }
        int var8 = arg5 & 0x3;
        field3172++;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg0;
        } else {
            return 7 + 1 - arg1 - arg4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BZ)V", line = 968)
    public final void method1035(byte arg0, boolean arg1) {
        field3180++;
        if (this.field3182 != arg1) {
            this.method1021(-1, arg1, 113, null, this.field3178);
            if (arg0 >= -51) {
                field3164 = 93;
            }
        }
    }
}
