import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class198 {

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field3079 = -1;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public int field3086 = 2;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public int field3077 = -1;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public int field3078 = -1;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Z")
    public boolean field3090 = false;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public int field3082 = 5;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public int field3095 = -1;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "Z")
    public boolean field3099 = false;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Z")
    public boolean field3083 = false;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public int field3097 = 99;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public int field3102 = -1;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "Z")
    public boolean field3104 = false;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "[I")
    public static int[] field3101 = new int[1000];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lvf;")
    public static class102 field3076 = new class102();

    @OriginalMember(owner = "client!si", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3110 = " more options";

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3111 = "cyan:";

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Ldl;")
    public static class123 field3085;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Ldl;")
    public static class123 field3096;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    public int[] field3080;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "[I")
    private int[] field3106;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "[I")
    public int[] field3107;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[Z")
    public boolean[] field3089;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "[[I")
    public int[][] field3100;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "[[[I")
    public static int[][][] field3108;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIILua;I)Lua;")
    public final class114 method1361(int arg0, int arg1, int arg2, class114 arg3, int arg4) {
        field3092++;
        int var6 = this.field3080[arg0];
        int var7 = this.field3107[arg0];
        class218 var8 = class262.method1800(var7 >> 16, arg2 ^ 0xFFFFAB15);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method743(true, true, true);
        }
        if (arg2 != 21688) {
            this.field3089 = null;
        }
        class218 var10 = null;
        if ((this.field3104 || class200.field3132) && arg1 != -1 && this.field3107.length > arg1) {
            int var11 = this.field3107[arg1];
            var10 = class262.method1800(var11 >> 16, arg2 - 21775);
            arg1 = var11 & 0xFFFF;
        }
        class114 var12;
        if (var10 == null) {
            var12 = arg3.method743(!var8.method1474(-108, var9), !var8.method1471(var9, 0), !this.field3099);
        } else {
            var12 = arg3.method743(!var8.method1474(-102, var9) & !var10.method1474(-107, arg1), !var8.method1471(var9, 0) & !var10.method1471(arg1, 0), !this.field3099);
        }
        var12.method760(var8, var9, var10, arg1, arg4 - 1, var6, this.field3099);
        return var12;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Llj;II)V")
    private final void method1362(class25 arg0, int arg1, int arg2) {
        field3084++;
        if (arg2 == 1) {
            int var4 = arg0.method190(-3);
            this.field3080 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3080[var5] = arg0.method190(-3);
            }
            this.field3107 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3107[var6] = arg0.method190(-3);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3107[var7] += arg0.method190(arg1 - 5) << 16;
            }
        } else if (arg2 == 2) {
            this.field3079 = arg0.method190(-3);
        } else if (arg2 == 3) {
            this.field3089 = new boolean[256];
            int var8 = arg0.method201(255);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3089[arg0.method201(255)] = true;
            }
        } else if (arg2 == 4) {
            this.field3090 = true;
        } else if (arg2 == 5) {
            this.field3082 = arg0.method201(255);
        } else if (arg2 == 6) {
            this.field3077 = arg0.method190(-3);
        } else if (arg2 == 7) {
            this.field3095 = arg0.method190(-3);
        } else if (arg2 == 8) {
            this.field3097 = arg0.method201(255);
        } else if (arg2 == 9) {
            this.field3102 = arg0.method201(255);
        } else if (arg2 == 10) {
            this.field3078 = arg0.method201(255);
        } else if (arg2 == 11) {
            this.field3086 = arg0.method201(255);
        } else if (arg2 == 12) {
            int var14 = arg0.method201(arg1 + 253);
            this.field3106 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field3106[var15] = arg0.method190(-3);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field3106[var16] += arg0.method190(-3) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method190(-3);
            this.field3100 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method201(arg1 ^ 0xFD);
                if (var12 > 0) {
                    this.field3100[var11] = new int[var12];
                    this.field3100[var11][0] = arg0.method215((byte) 107);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field3100[var11][var13] = arg0.method190(-3);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3099 = true;
        } else if (arg2 == 15) {
            this.field3104 = true;
        } else if (arg2 == 16) {
            this.field3083 = true;
        }
        if (arg1 != 2) {
            this.field3095 = 78;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1363(long arg0, int arg1) {
        field3105++;
        return arg1 == 65535 ? class98.method655(arg0, 0) : null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(JIII)Z")
    public static final boolean method1364(long arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1454410990) {
            method1364(47L, 111, -63, 48);
        }
        field3094++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class181 var8 = class25.method224(var7, 0);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field2829;
                var9 = var8.field2813;
            } else {
                var9 = var8.field2829;
                var10 = var8.field2813;
            }
            int var11 = var8.field2856;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class283.method1894((byte) 103, class149.field2227.field1272[0], true, 0, 2, 0, arg3, arg1, var11, var10, class149.field2227.field1257[0], var9);
        } else {
            class283.method1894((byte) 84, class149.field2227.field1272[0], true, var5 + 1, 2, var6, arg3, arg1, 0, 0, class149.field2227.field1257[0], 0);
        }
        class147.field2157 = 2;
        class272.field4322 = class145.field2140;
        class118.field1740 = 0;
        class38.field513 = class59.field836;
        return true;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILua;BI)Lua;")
    public final class114 method1365(int arg0, int arg1, class114 arg2, byte arg3, int arg4) {
        field3088++;
        int var6 = this.field3080[arg4];
        int var7 = this.field3107[arg4];
        class218 var8 = class262.method1800(var7 >> 16, -72);
        int var9 = var7 & 0xFFFF;
        int var10 = 118 % ((-arg3 - 78) / 44);
        if (var8 == null) {
            return arg2.method756(true, true, true);
        }
        class218 var11 = null;
        class218 var12 = null;
        if ((this.field3104 || class200.field3132) && arg1 != -1 && arg1 < this.field3107.length) {
            int var13 = this.field3107[arg1];
            var12 = class262.method1800(var13 >> 16, -125);
            arg1 = var13 & 0xFFFF;
        }
        class218 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field3106 != null) {
            if (this.field3106.length > arg4) {
                var16 = this.field3106[arg4];
                if (var16 != 65535) {
                    var11 = class262.method1800(var16 >> 16, -119);
                    var16 &= 0xFFFF;
                }
            }
            if ((this.field3104 || class200.field3132) && arg1 != -1 && arg1 < this.field3106.length) {
                var15 = this.field3106[arg1];
                if (var15 != 65535) {
                    var14 = class262.method1800(var15 >> 16, -66);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var17 = !var8.method1474(-102, var9);
        boolean var18 = !var8.method1471(var9, 0);
        if (var11 != null) {
            var17 &= !var11.method1474(-121, var16);
            var18 &= !var11.method1471(var16, 0);
        }
        if (var12 != null) {
            var17 &= !var12.method1474(-123, arg1);
            var18 &= !var12.method1471(arg1, 0);
        }
        if (var14 != null) {
            var17 &= !var14.method1474(-128, var15);
            var18 &= !var14.method1471(var15, 0);
        }
        class114 var19 = arg2.method756(var17, var18, !this.field3099);
        var19.method760(var8, var9, var12, arg1, arg0 - 1, var6, this.field3099);
        if (var11 != null) {
            var19.method760(var11, var16, var14, var15, arg0 - 1, var6, this.field3099);
        }
        return var19;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILua;IIII)Lua;")
    public final class114 method1366(int arg0, class114 arg1, int arg2, int arg3, int arg4, int arg5) {
        field3091++;
        int var7 = this.field3080[arg0];
        int var8 = this.field3107[arg0];
        class218 var9 = class262.method1800(var8 >> 16, -121);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method742(true, true, true);
        }
        int var11 = arg5 & 0x3;
        class218 var12 = null;
        if ((this.field3104 || class200.field3132) && arg4 != -1 && arg4 < this.field3107.length) {
            int var13 = this.field3107[arg4];
            var12 = class262.method1800(var13 >> 16, -97);
            arg4 = var13 & 0xFFFF;
        }
        class114 var14;
        if (var12 == null) {
            var14 = arg1.method742(!var9.method1474(-126, var10), !var9.method1471(var10, 0), !this.field3099);
        } else {
            var14 = arg1.method742(!var9.method1474(-112, var10) & !var12.method1474(-114, arg4), !var9.method1471(var10, arg3 ^ 0xFFFF9758) & !var12.method1471(arg4, arg3 ^ 0xFFFF9758), !this.field3099);
        }
        if (arg3 != -26792) {
            this.method1369((class25) null, 35);
        }
        if (var11 == 1) {
            var14.method751();
        } else if (var11 == 2) {
            var14.method746();
        } else if (var11 == 3) {
            var14.method752();
        }
        var14.method760(var9, var10, var12, arg4, arg2 - 1, var7, this.field3099);
        if (var11 == 1) {
            var14.method752();
        } else if (var11 == 2) {
            var14.method746();
        } else if (var11 == 3) {
            var14.method751();
        }
        return var14;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method1367(int arg0) {
        field3103++;
        if (class262.field4233 == 70) {
            int var1 = class235.field3766.method197(128);
            int var2 = (var1 >> 4 & 0x7) + class76.field1078;
            int var3 = (var1 & 0x7) + class231.field3717;
            int var4 = class235.field3766.method201(255);
            int var5 = var4 & 0x3;
            int var6 = var4 >> 2;
            int var7 = class47.field604[var6];
            int var8 = class235.field3766.method200((byte) -83);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class96.method645(0, var6, var8, var5, class276.field4398, var3, var7, 0, var2, -1);
            }
        } else if (class262.field4233 == 61) {
            int var9 = class235.field3766.method171(-1);
            int var10 = class235.field3766.method190(-3);
            int var11 = class235.field3766.method175(80);
            int var12 = (var11 & 0x7) + class231.field3717;
            int var13 = (var11 >> 4 & 0x7) + class76.field1078;
            if (var13 >= 0 && var12 >= 0 && var13 < 104 && var12 < 104) {
                class177 var14 = new class177();
                var14.field2761 = var10;
                var14.field2765 = var9;
                if (class243.field3891[class276.field4398][var13][var12] == null) {
                    class243.field3891[class276.field4398][var13][var12] = new class46();
                }
                class243.field3891[class276.field4398][var13][var12].method349(new class26(var14), true);
                class106.method695(1, var13, var12);
            }
        } else if (class262.field4233 == 29) {
            int var15 = class235.field3766.method190(-3);
            int var16 = class235.field3766.method200((byte) -83);
            int var17 = class235.field3766.method171(-1);
            int var18 = class235.field3766.method201(255);
            int var19 = (var18 & 0x7) + class231.field3717;
            int var20 = class76.field1078 + ((var18 & 0x76) >> 4);
            if (var20 >= 0 && var19 >= 0 && var20 < 104 && var19 < 104 && class45.field574 != var15) {
                class177 var21 = new class177();
                var21.field2761 = var16;
                var21.field2765 = var17;
                if (class243.field3891[class276.field4398][var20][var19] == null) {
                    class243.field3891[class276.field4398][var20][var19] = new class46();
                }
                class243.field3891[class276.field4398][var20][var19].method349(new class26(var21), true);
                class106.method695(1, var20, var19);
            }
        } else if (class262.field4233 == 132) {
            int var22 = class235.field3766.method201(255);
            int var23 = ((var22 & 0xF2) >> 4) + class76.field1078 * 2;
            int var24 = (var22 & 0xF) + class231.field3717 * 2;
            int var25 = var23 + class235.field3766.method188(-107);
            int var26 = class235.field3766.method188(103) + var24;
            int var27 = class235.field3766.method226(255);
            int var28 = class235.field3766.method226(255);
            int var29 = class235.field3766.method190(-3);
            int var30 = class235.field3766.method188(-98);
            int var31 = class235.field3766.method201(255) * 4;
            int var32 = class235.field3766.method190(-3);
            int var33 = class235.field3766.method190(-3);
            int var34 = class235.field3766.method201(255);
            int var35 = class235.field3766.method201(255);
            if (var34 == 255) {
                var34 = -1;
            }
            if (var23 >= 0 && var24 >= 0 && var23 < 208 && var24 < 208 && var25 >= 0 && var26 >= 0 && var25 < 208 && var26 < 208 && var29 != 65535) {
                int var36 = var25 * 64;
                int var37 = var23 * 64;
                int var38 = var26 * 64;
                int var39 = var24 * 64;
                if (var27 != 0) {
                    int var41;
                    class82 var43;
                    if (var27 >= 0) {
                        int var40 = var27 - 1;
                        var41 = var40 >> 11 & 0xF;
                        int var42 = var40 & 0x7FF;
                        var43 = class100.field1566[var42];
                    } else {
                        int var44 = -var27 - 1;
                        int var45 = var44 & 0x7FF;
                        if (class45.field574 == var45) {
                            var43 = class149.field2227;
                        } else {
                            var43 = class153.field2277[var45];
                        }
                        var41 = var44 >> 11 & 0xF;
                    }
                    if (var43 != null) {
                        class85 var46 = var43.method564(-119);
                        if (var46.field1351 != null && var46.field1351[var41] != null) {
                            var30 -= var46.field1351[var41][1];
                            int var47 = var46.field1351[var41][0];
                            int var48 = var46.field1351[var41][2];
                            int var49 = class171.field2675[var43.field1222];
                            int var50 = class171.field2680[var43.field1222];
                            int var51 = var47 * var50 + var48 * var49 >> 16;
                            int var52 = var48 * var50 - var47 * var49 >> 16;
                            var37 += var51;
                            var39 += var52;
                        }
                    }
                }
                class50 var54 = new class50(var29, class276.field4398, var37, var39, class99.method658(var39, class276.field4398, var37, -7185) - var30, class111.field1684 + var32, var33 + class111.field1684, var34, var35, var28, var31);
                var54.method372(class99.method658(var38, class276.field4398, var36, -7185) - var31, var38, var36, true, var32 + class111.field1684);
                class63.field867.method349(new class95(var54), true);
            }
        } else if (class262.field4233 == 98) {
            int var55 = class235.field3766.method201(255);
            int var56 = class76.field1078 * 2 + (var55 >> 4 & 0xF);
            int var57 = class231.field3717 * 2 + (var55 & 0xF);
            int var58 = var56 + class235.field3766.method188(-112);
            int var59 = var57 + class235.field3766.method188(-122);
            int var60 = class235.field3766.method226(255);
            int var61 = class235.field3766.method190(-3);
            int var62 = class235.field3766.method201(255) * 4;
            int var63 = class235.field3766.method201(255) * 4;
            int var64 = class235.field3766.method190(-3);
            int var65 = class235.field3766.method190(-3);
            int var66 = class235.field3766.method201(255);
            int var67 = class235.field3766.method201(255);
            if (var66 == 255) {
                var66 = -1;
            }
            if (var56 >= 0 && var57 >= 0 && var56 < 208 && var57 < 208 && var58 >= 0 && var59 >= 0 && var58 < 208 && var59 < 208 && var61 != 65535) {
                int var68 = var56 * 64;
                int var69 = var58 * 64;
                int var70 = var57 * 64;
                int var71 = var59 * 64;
                class50 var72 = new class50(var61, class276.field4398, var68, var70, class99.method658(var70, class276.field4398, var68, -7185) - var62, class111.field1684 + var64, class111.field1684 + var65, var66, var67, var60, var63);
                var72.method372(class99.method658(var71, class276.field4398, var69, -7185) - var63, var71, var69, true, class111.field1684 + var64);
                class63.field867.method349(new class95(var72), true);
            }
        } else if (class262.field4233 == 53) {
            int var73 = class235.field3766.method201(255);
            int var74 = (var73 >> 4 & 0x7) + class76.field1078;
            int var75 = (var73 & 0x7) + class231.field3717;
            int var76 = class235.field3766.method190(-3);
            int var77 = class235.field3766.method201(255);
            int var78 = var77 >> 4 & 0xF;
            if (var76 == 65535) {
                var76 = -1;
            }
            int var79 = var77 & 0x7;
            int var80 = class235.field3766.method201(255);
            if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                int var81 = var78 + 1;
                if ((var74 - var81) <= class149.field2227.field1257[0] && class149.field2227.field1257[0] <= var74 + var81 && var75 - var81 <= class149.field2227.field1272[0] && (var75 + var81) >= class149.field2227.field1272[0] && class60.field841 != 0 && var79 > 0 && class87.field1369 < 50 && var76 != -1) {
                    class100.field1556[class87.field1369] = var76;
                    class3.field29[class87.field1369] = var79;
                    class216.field3520[class87.field1369] = var80;
                    class71.field1000[class87.field1369] = null;
                    class6.field93[class87.field1369] = (var74 << 16) + (var75 << 8) + var78;
                    class87.field1369++;
                }
            }
        } else if (class262.field4233 == 210) {
            int var82 = class235.field3766.method201(255);
            int var83 = class231.field3717 + (var82 & 0x7);
            int var84 = ((var82 & 0x7A) >> 4) + class76.field1078;
            int var85 = class235.field3766.method190(-3);
            int var86 = class235.field3766.method201(255);
            int var87 = class235.field3766.method190(-3);
            if (var84 >= 0 && var83 >= 0 && var84 < 104 && var83 < 104) {
                int var88 = var84 * 128 + 64;
                int var89 = var83 * 128 + 64;
                class98 var90 = new class98(var85, class276.field4398, var88, var89, class99.method658(var89, class276.field4398, var88, -7185) - var86, var87, class111.field1684);
                class158.field2431.method349(new class34(var90), true);
            }
        } else if (class262.field4233 == 165) {
            int var91 = class235.field3766.method175(91);
            int var92 = (var91 >> 4 & 0x7) + class76.field1078;
            int var93 = (var91 & 0x7) + class231.field3717;
            int var94 = class235.field3766.method197(128);
            int var95 = var94 >> 2;
            int var96 = var94 & 0x3;
            int var97 = class47.field604[var95];
            if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                class96.method645(0, var95, -1, var96, class276.field4398, var93, var97, 0, var92, -1);
            }
        } else if (class262.field4233 == 88) {
            int var98 = class235.field3766.method175(83);
            int var99 = (var98 >> 4 & 0x7) + class76.field1078;
            int var100 = (var98 & 0x7) + class231.field3717;
            int var101 = class235.field3766.method171(-1);
            if (var101 == 65535) {
                var101 = -1;
            }
            int var102 = class235.field3766.method175(96);
            int var103 = var102 & 0x3;
            int var104 = var102 >> 2;
            int var105 = class47.field604[var104];
            class181.method1259(var99, class276.field4398, var101, var100, var103, (byte) -68, var104, var105);
        } else if (arg0 < -61) {
            if (class262.field4233 == 18) {
                int var106 = class235.field3766.method200((byte) -83);
                int var107 = class235.field3766.method197(128);
                int var108 = class76.field1078 + (var107 >> 4 & 0x7);
                int var109 = (var107 & 0x7) + class231.field3717;
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class46 var110 = class243.field3891[class276.field4398][var108][var109];
                    if (var110 != null) {
                        for (class26 var111 = (class26) var110.method350(8240); var111 != null; var111 = (class26) var110.method353((byte) -117)) {
                            if ((var106 & 0x7FFF) == var111.field365.field2761) {
                                var111.method784(false);
                                break;
                            }
                        }
                        if (var110.method350(8240) == null) {
                            class243.field3891[class276.field4398][var108][var109] = null;
                        }
                        class106.method695(1, var108, var109);
                    }
                }
            } else if (class262.field4233 == 101) {
                int var112 = class235.field3766.method201(255);
                int var113 = (var112 & 0x7) + class231.field3717;
                int var114 = (var112 >> 4 & 0x7) + class76.field1078;
                int var115 = class235.field3766.method188(62) + var114;
                int var116 = var113 + class235.field3766.method188(-113);
                int var117 = class235.field3766.method226(255);
                int var118 = class235.field3766.method190(-3);
                int var119 = class235.field3766.method201(255) * 4;
                int var120 = class235.field3766.method201(255) * 4;
                int var121 = class235.field3766.method190(-3);
                int var122 = class235.field3766.method190(-3);
                int var123 = class235.field3766.method201(255);
                if (var123 == 255) {
                    var123 = -1;
                }
                int var124 = class235.field3766.method201(255);
                if (var114 >= 0 && var113 >= 0 && var114 < 104 && var113 < 104 && var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104 && var118 != 65535) {
                    int var125 = var113 * 128 + 64;
                    int var126 = var115 * 128 + 64;
                    int var127 = var116 * 128 + 64;
                    int var128 = var114 * 128 + 64;
                    class50 var129 = new class50(var118, class276.field4398, var128, var125, class99.method658(var125, class276.field4398, var128, -7185) - var119, class111.field1684 + var121, class111.field1684 + var122, var123, var124, var117, var120);
                    var129.method372(class99.method658(var127, class276.field4398, var126, -7185) - var120, var127, var126, true, class111.field1684 + var121);
                    class63.field867.method349(new class95(var129), true);
                }
            } else if (class262.field4233 == 52) {
                int var130 = class235.field3766.method201(255);
                int var131 = ((var130 & 0x79) >> 4) + class76.field1078;
                int var132 = class231.field3717 + (var130 & 0x7);
                int var133 = class235.field3766.method190(-3);
                int var134 = class235.field3766.method190(-3);
                int var135 = class235.field3766.method190(-3);
                if (var131 >= 0 && var132 >= 0 && var131 < 104 && var132 < 104) {
                    class46 var136 = class243.field3891[class276.field4398][var131][var132];
                    if (var136 != null) {
                        for (class26 var137 = (class26) var136.method350(8240); var137 != null; var137 = (class26) var136.method353((byte) -123)) {
                            class177 var138 = var137.field365;
                            if ((var133 & 0x7FFF) == var138.field2761 && var138.field2765 == var134) {
                                var138.field2765 = var135;
                                break;
                            }
                        }
                        class106.method695(1, var131, var132);
                    }
                }
            } else if (class262.field4233 == 56) {
                int var139 = class235.field3766.method171(-1);
                int var140 = class235.field3766.method200((byte) -83);
                byte var141 = class235.field3766.method188(120);
                int var142 = class235.field3766.method198(3);
                int var143 = class235.field3766.method201(255);
                int var144 = class76.field1078 + (var143 >> 4 & 0x7);
                int var145 = (var143 & 0x7) + class231.field3717;
                byte var146 = class235.field3766.method188(-101);
                int var147 = class235.field3766.method226(255);
                byte var148 = class235.field3766.method207(-128);
                byte var149 = class235.field3766.method204(true);
                int var150 = class235.field3766.method173((byte) 44);
                int var151 = var150 >> 2;
                int var152 = var150 & 0x3;
                class205.method1400(var152, var144, var142, var148, var151, var139, var147, var145, var140, var149, var141, var146, 123);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static void method1368(int arg0) {
        field3108 = null;
        field3096 = null;
        field3076 = null;
        field3110 = null;
        field3101 = null;
        field3085 = null;
        int var1 = 78 / ((arg0 + 55) / 54);
        field3111 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Llj;I)V")
    public final void method1369(class25 arg0, int arg1) {
        field3098++;
        if (arg1 != -412836336) {
            this.field3090 = false;
        }
        while (true) {
            int var3 = arg0.method201(255);
            if (var3 == 0) {
                return;
            }
            this.method1362(arg0, 2, var3);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method1370(int arg0, int arg1) {
        field3081++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class76.field1076 += arg0 * 128;
        if (class111.field1685.length < class76.field1076) {
            class76.field1076 -= class111.field1685.length;
            int var3 = (int) (Math.random() * 12.0D);
            class28.method236(-91, class4.field64[var3]);
        }
        int var4 = arg1;
        int var5 = (var2 - arg0) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var26 = class229.field3711[var4 + var6] - (class111.field1685[class76.field1076 + var4 & class111.field1685.length + -1] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class229.field3711[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class229.field3711[var23 + var24] = 255;
                } else {
                    class229.field3711[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class8.field122[var9] = class8.field122[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class8.field122[var10] = (int) (Math.sin((double) class266.field4271 / 14.0D) * 16.0D + Math.sin((double) class266.field4271 / 15.0D) * 14.0D + Math.sin((double) class266.field4271 / 16.0D) * 12.0D);
            class266.field4271++;
        }
        int var11 = ((class111.field1684 & 0x1) + arg0) / 2;
        class19.field224 += arg0;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class19.field224; var12++) {
            int var21 = (int) (Math.random() * 128.0D) + 128;
            int var22 = (int) (Math.random() * 124.0D) + 2;
            class229.field3711[(var21 << 7) + var22] = 192;
        }
        class19.field224 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = var13 * 128;
            int var19 = 0;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var19 += class229.field3711[var20 + var11 + var18];
                }
                if (var20 - var11 - 1 >= 0) {
                    var19 -= class229.field3711[var20 + var18 - var11 - 1];
                }
                if (var20 >= 0) {
                    class71.field998[var20 + var18] = var19 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var16 + var11) {
                    var15 += class71.field998[var14 - (-(var11 * 128) - var17)];
                }
                if ((var16 - (var11 + 1)) >= 0) {
                    var15 -= class71.field998[var14 + var17 - ((var11 + 1) * 128)];
                }
                if (var16 >= 0) {
                    class229.field3711[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public final void method1371(byte arg0) {
        field3093++;
        if (arg0 != 75) {
            this.method1365(9, -86, (class114) null, (byte) -37, 88);
        }
        if (this.field3102 == -1) {
            if (this.field3089 == null) {
                this.field3102 = 0;
            } else {
                this.field3102 = 2;
            }
        }
        if (this.field3078 != -1) {
            return;
        }
        if (this.field3089 == null) {
            this.field3078 = 0;
        } else {
            this.field3078 = 2;
        }
    }
}
