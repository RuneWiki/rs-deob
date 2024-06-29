import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class313 {

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public int field5315;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Loh;")
    public static class258 field5320 = class153.method1046("Konfig geladen)3", 116);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "F")
    public static float field5302;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public int field5311;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Ljc;")
    public class214 field5308;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public int[] field5301;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
    public int[] field5304;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
    public int[] field5305;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
    public int[] field5309;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "[I")
    public int[] field5310;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "[I")
    public int[] field5319;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "[Ljc;")
    public class214[] field5312;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[[I")
    public int[][] field5306;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[[I")
    public int[][] field5316;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIII)V", line = 22)
    public static final void method2167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 > -112) {
            method2171(-25);
        }
        for (int var9 = 0; var9 < class65.field1144.field3856; var9++) {
            int var10 = class65.field1144.field3853[var9] - class49.field735;
            int var11 = class317.field5348 + class225.field3870 - class65.field1144.field3854[var9] - 1;
            int var12 = arg7 + ((var11 - arg6) * (arg3 - arg7) / (arg2 - arg6));
            int var13 = class65.field1144.method1514(var9, 500);
            class112 var14 = null;
            int var15 = arg4 + ((arg8 - arg4) * (var10 - arg0) / (arg5 - arg0));
            int var16 = 16777215;
            if (var13 == 0) {
                if ((double) class121.field2139 == 3.0D) {
                    var14 = class209.field3603;
                }
                if ((double) class121.field2139 == 4.0D) {
                    var14 = class123.field2175;
                }
                if ((double) class121.field2139 == 6.0D) {
                    var14 = class62.field1093;
                }
                if ((double) class121.field2139 == 8.0D) {
                    var14 = class62.field1095;
                }
            }
            if (var13 == 1) {
                if ((double) class121.field2139 == 3.0D) {
                    var14 = class62.field1093;
                }
                if ((double) class121.field2139 == 4.0D) {
                    var14 = class62.field1095;
                }
                if ((double) class121.field2139 == 6.0D) {
                    var14 = class300.field5136;
                }
                if ((double) class121.field2139 == 8.0D) {
                    var14 = class218.field3755;
                }
            }
            if (var13 == 2) {
                if ((double) class121.field2139 == 3.0D) {
                    var14 = class300.field5136;
                }
                if ((double) class121.field2139 == 4.0D) {
                    var14 = class218.field3755;
                }
                var16 = 16755200;
                if ((double) class121.field2139 == 6.0D) {
                    var14 = class105.field1893;
                }
                if ((double) class121.field2139 == 8.0D) {
                    var14 = class138.field2354;
                }
            }
            if (class65.field1144.field3858[var9] != -1) {
                var16 = class65.field1144.field3858[var9];
            }
            if (var14 != null) {
                class258[] var17 = new class258[class65.field1144.field3851[var9].method1789((byte) -122, 60) + 1];
                class79.field1355.method266(class65.field1144.field3851[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var12 - var14.method815() * (var18 - 1) / 2;
                int var20 = var19 + var14.method816() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class258 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method1813(var17[var21].method1816(false) - 4, 0, true);
                    var14.method808(var22, var15, var20, var16, true);
                    var20 += var14.method815();
                }
            }
        }
        field5303++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BB)V", line = 138)
    private final void method2168(byte[] arg0, byte arg1) {
        field5317++;
        class235 var3 = new class235(class308.method2144(arg0, -11508));
        int var4 = var3.method1589(90);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field5307 = 0;
        } else {
            this.field5307 = var3.method1611(-109);
        }
        int var5 = var3.method1589(80);
        this.field5318 = var3.method1615(118);
        this.field5309 = new int[this.field5318];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field5318; var8++) {
            this.field5309[var8] = var6 += var3.method1615(-127);
            if (this.field5309[var8] > var7) {
                var7 = this.field5309[var8];
            }
        }
        this.field5311 = var7 + 1;
        this.field5310 = new int[this.field5311];
        this.field5304 = new int[this.field5311];
        this.field5306 = new int[this.field5311][];
        this.field5305 = new int[this.field5311];
        this.field5319 = new int[this.field5311];
        if (arg1 <= 64) {
            this.field5304 = (int[]) null;
        }
        if (var5 != 0) {
            this.field5301 = new int[this.field5311];
            for (int var9 = 0; var9 < this.field5311; var9++) {
                this.field5301[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field5318; var10++) {
                this.field5301[this.field5309[var10]] = var3.method1611(91);
            }
            this.field5308 = new class214(this.field5301);
        }
        for (int var11 = 0; var11 < this.field5318; var11++) {
            this.field5319[this.field5309[var11]] = var3.method1611(-93);
        }
        for (int var12 = 0; var12 < this.field5318; var12++) {
            this.field5310[this.field5309[var12]] = var3.method1611(109);
        }
        for (int var13 = 0; var13 < this.field5318; var13++) {
            this.field5304[this.field5309[var13]] = var3.method1615(54);
        }
        for (int var14 = 0; var14 < this.field5318; var14++) {
            int var15 = this.field5309[var14];
            int var16 = 0;
            int var17 = -1;
            int var18 = this.field5304[var15];
            this.field5306[var15] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field5306[var15][var19] = var16 += var3.method1615(-123);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field5305[var15] = var17 + 1;
            if ((var17 + 1) == var18) {
                this.field5306[var15] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5316 = new int[var7 + 1][];
        this.field5312 = new class214[var7 + 1];
        for (int var21 = 0; var21 < this.field5318; var21++) {
            int var22 = this.field5309[var21];
            int var23 = this.field5304[var22];
            this.field5316[var22] = new int[this.field5305[var22]];
            for (int var24 = 0; var24 < this.field5305[var22]; var24++) {
                this.field5316[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field5306[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field5306[var22][var25];
                }
                this.field5316[var22][var26] = var3.method1611(-128);
            }
            this.field5312[var22] = new class214(this.field5316[var22]);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZIIBIIIIII)Z", line = 320)
    public static final boolean method2169(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class29.field347[var12][var13] = 0;
                class105.field1885[var12][var13] = 99999999;
            }
        }
        class29.field347[arg10][arg4] = 99;
        class105.field1885[arg10][arg4] = 0;
        if (arg5 > -96) {
            return false;
        }
        field5313++;
        int var14 = arg4;
        int var15 = arg10;
        byte var16 = 0;
        class8.field109[var16] = arg10;
        int var32 = var16 + 1;
        class185.field3296[var16] = arg4;
        int var17 = 0;
        int[][] var18 = class243.field4216[class272.field4704].field4255;
        boolean var19 = false;
        while (var32 != var17) {
            var14 = class185.field3296[var17];
            var15 = class8.field109[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg9 == var15 && arg0 == var14) {
                var19 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class243.field4216[class272.field4704].method1663(arg9, var15, arg0, arg1, 1, arg6 - 1, 2, var14)) {
                    var19 = true;
                    break;
                }
                if (arg6 < 10 && class243.field4216[class272.field4704].method1666(0, arg9, 2, arg0, var15, arg6 - 1, var14, arg1)) {
                    var19 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg8 != 0 && class243.field4216[class272.field4704].method1679(arg9, arg3, var15, arg8, arg7, arg0, var14, 2, 8)) {
                var19 = true;
                break;
            }
            int var20 = class105.field1885[var15][var14] + 1;
            if (var15 > 0 && class29.field347[var15 - 1][var14] == 0 && (var18[var15 - 1][var14] & 0x12C010E) == 0 && (var18[var15 - 1][var14 + 1] & 0x12C0138) == 0) {
                class8.field109[var32] = var15 - 1;
                class185.field3296[var32] = var14;
                class29.field347[var15 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class105.field1885[var15 - 1][var14] = var20;
            }
            if (var15 < 102 && class29.field347[var15 + 1][var14] == 0 && (var18[var15 + 2][var14] & 0x12C0183) == 0 && (var18[var15 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class8.field109[var32] = var15 + 1;
                class185.field3296[var32] = var14;
                class29.field347[var15 + 1][var14] = 8;
                var32 = var32 + 1 & 0xFFF;
                class105.field1885[var15 + 1][var14] = var20;
            }
            if (var14 > 0 && class29.field347[var15][var14 - 1] == 0 && (var18[var15][var14 - 1] & 0x12C010E) == 0 && (var18[var15 + 1][var14 - 1] & 0x12C0183) == 0) {
                class8.field109[var32] = var15;
                class185.field3296[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class29.field347[var15][var14 - 1] = 1;
                class105.field1885[var15][var14 - 1] = var20;
            }
            if (var14 < 102 && class29.field347[var15][var14 + 1] == 0 && (var18[var15][var14 + 2] & 0x12C0138) == 0 && (var18[var15 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class8.field109[var32] = var15;
                class185.field3296[var32] = var14 + 1;
                class29.field347[var15][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class105.field1885[var15][var14 + 1] = var20;
            }
            if (var15 > 0 && var14 > 0 && class29.field347[var15 - 1][var14 - 1] == 0 && (var18[var15 - 1][var14] & 0x12C0138) == 0 && (var18[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var15][var14 - 1] & 0x12C0183) == 0) {
                class8.field109[var32] = var15 - 1;
                class185.field3296[var32] = var14 - 1;
                class29.field347[var15 - 1][var14 - 1] = 3;
                class105.field1885[var15 - 1][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && var14 > 0 && class29.field347[var15 + 1][var14 - 1] == 0 && (var18[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var15 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var15 + 2][var14] & 0x12C01E0) == 0) {
                class8.field109[var32] = var15 + 1;
                class185.field3296[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class29.field347[var15 + 1][var14 - 1] = 9;
                class105.field1885[var15 + 1][var14 - 1] = var20;
            }
            if (var15 > 0 && var14 < 102 && class29.field347[var15 - 1][var14 + 1] == 0 && (var18[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var15 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var15][var14 + 2] & 0x12C01E0) == 0) {
                class8.field109[var32] = var15 - 1;
                class185.field3296[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class29.field347[var15 - 1][var14 + 1] = 6;
                class105.field1885[var15 - 1][var14 + 1] = var20;
            }
            if (var15 < 102 && var14 < 102 && class29.field347[var15 + 1][var14 + 1] == 0 && (var18[var15 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var15 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var15 + 2][var14 + 1] & 0x12C0183) == 0) {
                class8.field109[var32] = var15 + 1;
                class185.field3296[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class29.field347[var15 + 1][var14 + 1] = 12;
                class105.field1885[var15 + 1][var14 + 1] = var20;
            }
        }
        class301.field5156 = 0;
        if (!var19) {
            if (!arg2) {
                return false;
            }
            int var21 = 100;
            int var22 = 1000;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= arg9 + var23; var24++) {
                for (int var25 = arg0 - var23; var25 <= arg0 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class105.field1885[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if (var24 > (arg3 + arg9 - 1)) {
                            var26 = var24 + 1 - arg3 - arg9;
                        }
                        if (arg0 > var25) {
                            var27 = arg0 - var25;
                        } else if (arg0 + arg8 - 1 < var25) {
                            var27 = var25 + 1 - arg0 - arg8;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var22 || var22 == var28 && var21 > class105.field1885[var24][var25]) {
                            var14 = var25;
                            var15 = var24;
                            var22 = var28;
                            var21 = class105.field1885[var24][var25];
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg10 == var15 && arg4 == var14) {
                return false;
            }
            class301.field5156 = 1;
        }
        byte var29 = 0;
        class8.field109[var29] = var15;
        int var33 = var29 + 1;
        class185.field3296[var29] = var14;
        int var30;
        int var31 = var30 = class29.field347[var15][var14];
        while (arg10 != var15 || arg4 != var14) {
            if (var30 != var31) {
                class8.field109[var33] = var15;
                class185.field3296[var33++] = var14;
                var30 = var31;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            var31 = class29.field347[var15][var14];
        }
        if (var33 > 0) {
            class64.method496(arg11, var33, (byte) 112);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 714)
    public static void method2170(byte arg0) {
        int var1 = 78 / ((arg0 + 83) / 40);
        field5320 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 723)
    public static final void method2171(int arg0) {
        field5314++;
        if (arg0 == 0) {
            class91.field1596.method1161(-107);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([BI)V", line = 736)
    public class313(byte[] arg0, int arg1) {
        this.field5315 = class13.method94(arg0.length, arg0, 17365);
        if (this.field5315 != arg1) {
            throw new RuntimeException();
        }
        this.method2168(arg0, (byte) 91);
    }
}
