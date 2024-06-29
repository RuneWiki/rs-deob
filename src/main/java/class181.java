import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class181 extends class139 {

    @OriginalMember(owner = "client!am", name = "y", descriptor = "[I")
    private int[] field2909;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "[I")
    private int[] field2908;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "Llk;")
    private class84 field2911;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "Llk;")
    private class84 field2910;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "Llk;")
    private class84 field2912;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "[Llk;")
    private class84[] field2920;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "[[I")
    public static int[][] field2921 = new int[5][5000];

    @OriginalMember(owner = "client!am", name = "F", descriptor = "Lcc;")
    public static class216 field2915 = new class216(64);

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "[I")
    public static int[] field2923;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZBDLlc;ZLhc;II)[I")
    public final int[] method1344(boolean arg0, byte arg1, double arg2, class86 arg3, boolean arg4, class236 arg5, int arg6, int arg7) {
        if (arg1 <= 13) {
            field2915 = null;
        }
        field2924++;
        int[] var10 = new int[arg6 * arg7];
        class96.method745(arg2, 256);
        class168.field2714 = arg5;
        class164.field2658 = arg3;
        class134.method969(arg6, (byte) -94, arg7);
        for (int var11 = 0; var11 < this.field2920.length; var11++) {
            this.field2920[var11].method610(arg7, 22879, arg6);
        }
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var12 = arg7 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var14 = 1;
            var13 = arg7;
            var12 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2910.field1217) {
                int[] var18 = this.field2910.method91((byte) -128, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field2910.method30(var16, (byte) -18);
                var21 = var22[1];
                var19 = var22[2];
                var20 = var22[0];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var20[var23] >> 4;
                int var26 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class101.field1477[var25];
                int var28 = class101.field1477[var24];
                int var29 = class101.field1477[var26];
                var10[var15++] = (var28 << 8) + (var27 << 16) + var29;
                if (arg0) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2920.length; var17++) {
            this.field2920[var17].method32(0);
        }
        return var10;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)I")
    public static final int method1345(int arg0, int arg1, int arg2) {
        field2919++;
        class83 var3 = (class83) class67.field991.method1034((long) arg1, (byte) 21);
        if (var3 == null) {
            return -1;
        } else {
            int var4 = 32 / ((arg0 - 18) / 57);
            return arg2 >= 0 && arg2 < var3.field1206.length ? var3.field1206[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Llc;IDILhc;ZI)Lak;")
    public final class140 method1346(class86 arg0, int arg1, double arg2, int arg3, class236 arg4, boolean arg5, int arg6) {
        field2914++;
        class96.method745(arg2, 256);
        class164.field2658 = arg0;
        class168.field2714 = arg4;
        class134.method969(arg1, (byte) -90, arg6);
        class140 var9 = new class140(arg6, arg1);
        for (int var10 = 0; var10 < this.field2920.length; var10++) {
            this.field2920[var10].method610(arg6, 22879, arg1);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg5) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2910.field1217) {
                int[] var18 = this.field2910.method91((byte) -127, var12);
                var16 = var18;
                var17 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field2910.method30(var12, (byte) -18);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            for (int var19 = 0; var19 != arg6; var19++) {
                int var20 = var16[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class101.field1477[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                int var23 = var17[var19] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class101.field1477[var23];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var25 = class101.field1477[var21];
                var9.field2251[var11++] = (var22 << 16) + var24 + (var25 << 8);
                if (arg5) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = arg3; var13 < this.field2920.length; var13++) {
            this.field2920[var13].method32(0);
        }
        return var9;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(DILlc;ILhc;IZ)Lig;")
    public final class9 method1347(double arg0, int arg1, class86 arg2, int arg3, class236 arg4, int arg5, boolean arg6) {
        if (arg3 != 10) {
            this.method1349((class86) null, (class236) null, false);
        }
        field2922++;
        class96.method745(arg0, arg3 + 246);
        class168.field2714 = arg4;
        class164.field2658 = arg2;
        class134.method969(arg5, (byte) -116, arg1);
        class9 var9 = new class9(arg1, arg5);
        for (int var10 = 0; var10 < this.field2920.length; var10++) {
            this.field2920[var10].method610(arg1, arg3 + 22869, arg5);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2910.field1217) {
                int[] var14 = this.field2910.method91((byte) -128, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2910.method30(var12, (byte) -18);
                var15 = var18[0];
                var16 = var18[1];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field2912.field1217) {
                var19 = this.field2912.method91((byte) -127, var12);
            } else {
                var19 = this.field2912.method30(var12, (byte) -18)[0];
            }
            if (arg6) {
                var11 = var12 << 2;
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var24 = class101.field1477[var22];
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class101.field1477[var23];
                int var26 = class101.field1477[var21];
                int var27;
                if (var26 == 0 && var24 == 0 && var25 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field2251[var11++] = (var24 << 8) + var25 + (var26 << 16) + (var27 << 24);
                if (arg6) {
                    var11 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2920.length; var13++) {
            this.field2920[var13].method32(0);
        }
        return var9;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)I")
    public static final int method1348(int arg0, byte arg1) {
        if (arg1 < 108) {
            method1350((byte) 114);
        }
        field2918++;
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Llc;Lhc;Z)Z")
    public final boolean method1349(class86 arg0, class236 arg1, boolean arg2) {
        field2917++;
        if (class149.field2426 <= 0) {
            for (int var4 = 0; var4 < this.field2909.length; var4++) {
                if (!arg0.method634(this.field2909[var4], 0)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2909.length; var5++) {
                if (!arg0.method650(this.field2909[var5], class149.field2426, -90)) {
                    return false;
                }
            }
        }
        if (arg2) {
            this.method1346((class86) null, -9, -1.554151543918601D, 45, (class236) null, true, 104);
        }
        for (int var6 = 0; var6 < this.field2908.length; var6++) {
            if (!arg1.method1512((byte) -113, this.field2908[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class181() {
        this.field2909 = new int[0];
        this.field2908 = new int[0];
        this.field2911 = new class268(0);
        this.field2911.field1229 = 1;
        this.field2910 = new class268();
        this.field2910.field1229 = 1;
        this.field2912 = new class268();
        this.field2912.field1229 = 1;
        this.field2920 = new class84[] { this.field2910, this.field2912, this.field2911 };
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    public static void method1350(byte arg0) {
        if (arg0 > 91) {
            field2915 = null;
            field2921 = null;
            field2923 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lv;)V")
    public class181(class152 arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = arg0.method1111(255);
        int[][] var5 = new int[var4][];
        this.field2920 = new class84[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            class84 var16 = class151.method1067(arg0, false);
            if (var16.method37(7952) >= 0) {
                var3++;
            }
            if (var16.method136(-1) >= 0) {
                var2++;
            }
            int var17 = var16.field1231.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1111(255);
            }
            this.field2920[var6] = var16;
        }
        this.field2909 = new int[var3];
        int var7 = 0;
        this.field2908 = new int[var2];
        int var8 = 0;
        for (int var9 = 0; var9 < var4; var9++) {
            class84 var11 = this.field2920[var9];
            int var12 = var11.field1231.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1231[var13] = this.field2920[var5[var9][var13]];
            }
            int var14 = var11.method37(7952);
            int var15 = var11.method136(-1);
            if (var14 > 0) {
                this.field2909[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2908[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field2910 = this.field2920[arg0.method1111(255)];
        this.field2912 = this.field2920[arg0.method1111(255)];
        this.field2911 = this.field2920[arg0.method1111(255)];
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIII[Lqi;I)V")
    public static final void method1351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class131[] arg8, int arg9) {
        class70.method500(arg4, arg3, arg5, arg2);
        class47.method357();
        field2913++;
        int var10 = 0;
        if (arg1 <= 5) {
            return;
        }
        while (var10 < arg8.length) {
            class131 var11 = arg8[var10];
            if (var11 != null && (var11.field2054 == arg6 || arg6 == -1412584499 && class16.field184 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class10.field93[class115.field1664] = var11.field2001 + arg9;
                    class188.field3047[class115.field1664] = var11.field2121 + arg7;
                    class55.field783[class115.field1664] = var11.field2102;
                    class138.field2240[class115.field1664] = var11.field2167;
                    var12 = class115.field1664++;
                } else {
                    var12 = arg0;
                }
                var11.field2037 = var12;
                var11.field2160 = class264.field4290;
                if (!var11.field2077 || !client.method1172(var11)) {
                    label881: {
                        if (var11.field2005 > 0) {
                            class131.method942(var11, true);
                        }
                        int var13 = var11.field2001 + arg9;
                        int var14 = var11.field2093;
                        int var15 = var11.field2121 + arg7;
                        if (class36.field447 && (client.method1168(var11).field1063 != 0 || var11.field2150 == 0) && var14 > 127) {
                            var14 = 127;
                        }
                        if (class16.field184 == var11) {
                            if (arg6 != -1412584499 && !var11.field2165) {
                                class73.field1062 = arg7;
                                class217.field3442 = arg8;
                                class49.field728 = arg9;
                                break label881;
                            }
                            if (class290.field4594 && class196.field3187) {
                                int var16 = class169.field2731;
                                int var17 = var16 - class58.field829;
                                if (var17 < class62.field893) {
                                    var17 = class62.field893;
                                }
                                if (class62.field893 + class294.field4674.field2102 < var17 - -var11.field2102) {
                                    var17 = class62.field893 + class294.field4674.field2102 - var11.field2102;
                                }
                                int var18 = class296.field4680;
                                var13 = var17;
                                int var19 = var18 - class209.field3356;
                                if (var19 < class145.field2358) {
                                    var19 = class145.field2358;
                                }
                                if ((class145.field2358 + class294.field4674.field2167) < (var19 + var11.field2167)) {
                                    var19 = class145.field2358 + class294.field4674.field2167 - var11.field2167;
                                }
                                var15 = var19;
                            }
                            if (!var11.field2165) {
                                var14 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field2150 == 2) {
                            var20 = arg3;
                            var21 = arg4;
                            var22 = arg5;
                            var23 = arg2;
                        } else {
                            var21 = arg4 < var13 ? var13 : arg4;
                            int var24 = var11.field2102 + var13;
                            var20 = arg3 < var15 ? var15 : arg3;
                            int var25 = var15 + var11.field2167;
                            if (var11.field2150 == 9) {
                                var24++;
                                var25++;
                            }
                            var23 = arg2 > var25 ? var25 : arg2;
                            var22 = arg5 <= var24 ? arg5 : var24;
                        }
                        if (!var11.field2077 || var21 < var22 && var20 < var23) {
                            label898: {
                                if (var11.field2005 != 0) {
                                    if (var11.field2005 == 1337 || var11.field2005 == 1403) {
                                        class264.field4291 = var11;
                                        class97.field1432 = var15;
                                        class105.field1535 = var13;
                                        class64.method465(var15, var11.field2005 == 1403, var11.field2102, var11.field2167, -45, var13);
                                        class190.field3070[var12] = true;
                                        class70.method500(arg4, arg3, arg5, arg2);
                                        break label898;
                                    }
                                    if (var11.field2005 == 1338) {
                                        if (!var11.method946(true)) {
                                            break label898;
                                        }
                                        class161.method1205(var11, var13, var12, var15, (byte) 120);
                                        class70.method500(arg4, arg3, arg5, arg2);
                                        if (class205.field3280 != 0 && class205.field3280 != 3 || class206.field3315 || class272.field4378 < var21 || class52.field767 < var20 || class272.field4378 >= var22 || class52.field767 >= var23) {
                                            break label898;
                                        }
                                        int var26 = class272.field4378 - var13;
                                        int var27 = class52.field767 - var15;
                                        int var28 = var11.field2068[var27];
                                        if (var28 > var26 || (var28 + var11.field2062[var27]) < var26) {
                                            break label898;
                                        }
                                        int var29 = (int) class190.field3068 + class61.field855 & 0x7FF;
                                        int var30 = var26 - var11.field2102 / 2;
                                        int var31 = class47.field679[var29];
                                        int var32 = (class53.field776 + 256) * var31 >> 8;
                                        int var33 = var27 - var11.field2167 / 2;
                                        int var34 = class47.field695[var29];
                                        int var35 = (class53.field776 + 256) * var34 >> 8;
                                        int var36 = var33 * var35 - (var30 * var32) >> 11;
                                        int var37 = var30 * var35 + var32 * var33 >> 11;
                                        int var38 = class186.field2993.field1979 + var37 - ((class186.field2993.method205(107) + -1) * 64) >> 7;
                                        int var39 = class186.field2993.field1910 - var36 - (class186.field2993.method205(-112) + -1) * 64 >> 7;
                                        if (class131.field2131 && (class111.field1599 & 0x40) != 0) {
                                            class131 var40 = class161.method1200((byte) 74, class126.field1862, class34.field436);
                                            if (var40 == null) {
                                                class243.method1723(-1);
                                            } else {
                                                class42.method321(class293.field4659, (byte) 72, class161.field2636, var39, (short) 4, 1L, " ->", var38);
                                            }
                                            break label898;
                                        }
                                        if (class175.field2850 == 1) {
                                            class42.method321(class166.field2694, (byte) 72, -1, var39, (short) 48, 1L, "", var38);
                                        }
                                        class42.method321(class178.field2887, (byte) 72, -1, var39, (short) 49, 1L, "", var38);
                                        break label898;
                                    }
                                    if (var11.field2005 == 1339) {
                                        if (var11.method946(true)) {
                                            class155.method1148(var12, -13979, var13, var15, var11);
                                            class70.method500(arg4, arg3, arg5, arg2);
                                        }
                                        break label898;
                                    }
                                    if (var11.field2005 == 1400) {
                                        class186.method1378(var15, var11.field2102, true, var13, var11.field2167);
                                        class190.field3070[var12] = true;
                                        class294.field4673[var12] = true;
                                        class70.method500(arg4, arg3, arg5, arg2);
                                        break label898;
                                    }
                                    if (var11.field2005 == 1401) {
                                        class145.method1043(var13, false, var11.field2102, var11.field2167, var15);
                                        class190.field3070[var12] = true;
                                        class294.field4673[var12] = true;
                                        class70.method500(arg4, arg3, arg5, arg2);
                                        break label898;
                                    }
                                    if (var11.field2005 == 1402) {
                                        class67.method479(var15, var13, 26404);
                                        class190.field3070[var12] = true;
                                        class294.field4673[var12] = true;
                                        break label898;
                                    }
                                    if (var11.field2005 == 1405) {
                                        if (!class159.field2605) {
                                            break label898;
                                        }
                                        int var41 = var11.field2102 + var13;
                                        int var42 = var15 + 15;
                                        class12.field139.method1247("Fps:" + class275.field4417, var41, var42, 16776960, -1);
                                        int var131 = var42 + 15;
                                        Runtime var43 = Runtime.getRuntime();
                                        int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                        int var45 = 16776960;
                                        int var46 = 0;
                                        if (var44 > 65536) {
                                            var45 = 16711680;
                                        }
                                        int var47 = 0;
                                        class12.field139.method1247("Mem:" + var44 + "k", var41, var131, var45, -1);
                                        int var48 = 0;
                                        var42 = var131 + 15;
                                        int var49 = 16776960;
                                        for (int var50 = 0; var50 < 29; var50++) {
                                            var46 += class172.field2766[var50].method876((byte) 90);
                                            var48 += class172.field2766[var50].method882(false);
                                            var47 += class172.field2766[var50].method884(false);
                                        }
                                        int var51 = var47 * 100 / var46;
                                        int var52 = var48 * 10000 / var46;
                                        String var53 = "Cache:" + class171.method1275((long) var52, 2, -78, 0, true) + "% (" + var51 + "%)";
                                        class238.field3808.method1247(var53, var41, var42, var49, -1);
                                        class190.field3070[var12] = true;
                                        class294.field4673[var12] = true;
                                        var42 += 12;
                                        break label898;
                                    }
                                    if (var11.field2005 == 1406) {
                                        class286.field4543 = var15;
                                        class109.field1571 = var13;
                                        class195.field3137 = var11;
                                        break label898;
                                    }
                                }
                                if (!class206.field3315) {
                                    if (var11.field2150 == 0 && var11.field2110 && class272.field4378 >= var21 && class52.field767 >= var20 && var22 > class272.field4378 && var23 > class52.field767 && !class36.field447) {
                                        class207.field3318[0] = 1001;
                                        class226.field3632[0] = class269.field4341;
                                        class243.field3890 = 1;
                                        class243.field3927[0] = "";
                                        class82.field1186[0] = class221.field3536;
                                    }
                                    if (class272.field4378 >= var21 && class52.field767 >= var20 && var22 > class272.field4378 && var23 > class52.field767) {
                                        class36.method278(class52.field767 - var15, -var13 + class272.field4378, var11, (byte) -99);
                                    }
                                }
                                if (var11.field2150 == 0) {
                                    if (!var11.field2077 && client.method1172(var11) && class260.field4250 != var11) {
                                        break label898;
                                    }
                                    if (!var11.field2077) {
                                        if (var11.field2025 - var11.field2167 < var11.field1995) {
                                            var11.field1995 = var11.field2025 - var11.field2167;
                                        }
                                        if (var11.field1995 < 0) {
                                            var11.field1995 = 0;
                                        }
                                    }
                                    method1351(var12, 12, var23, var20, var21, var22, var11.field2073, var15 - var11.field1995, arg8, var13 - var11.field2065);
                                    if (var11.field2052 != null) {
                                        method1351(var12, 40, var23, var20, var21, var22, var11.field2073, var15 - var11.field1995, var11.field2052, var13 - var11.field2065);
                                    }
                                    class17 var54 = (class17) class124.field1806.method1034((long) var11.field2073, (byte) 21);
                                    if (var54 != null) {
                                        if (var54.field188 == 0 && !class206.field3315 && var21 <= class272.field4378 && class52.field767 >= var20 && class272.field4378 < var22 && class52.field767 < var23 && !class36.field447) {
                                            class207.field3318[0] = 1001;
                                            class226.field3632[0] = class269.field4341;
                                            class243.field3890 = 1;
                                            class243.field3927[0] = "";
                                            class82.field1186[0] = class221.field3536;
                                        }
                                        class134.method966(0, var13, var15, var21, var20, var12, var54.field191, var23, var22);
                                    }
                                    class70.method500(arg4, arg3, arg5, arg2);
                                    class47.method357();
                                }
                                if (class225.field3616[var12] || class93.field1389 > 1) {
                                    if (var11.field2150 == 0 && !var11.field2077 && var11.field2025 > var11.field2167) {
                                        class275.method1901(var11.field2025, var11.field1995, var11.field2167, (byte) 127, var11.field2102 + var13, var15);
                                    }
                                    if (var11.field2150 != 1) {
                                        if (var11.field2150 == 2) {
                                            int var55 = 0;
                                            for (int var56 = 0; var56 < var11.field2072; var56++) {
                                                for (int var57 = 0; var57 < var11.field2153; var57++) {
                                                    int var58 = (var11.field2064 + 32) * var57 + var13;
                                                    int var59 = (var11.field2163 + 32) * var56 + var15;
                                                    if (var55 < 20) {
                                                        var58 += var11.field2074[var55];
                                                        var59 += var11.field2028[var55];
                                                    }
                                                    if (var11.field2101[var55] > 0) {
                                                        boolean var61 = false;
                                                        boolean var62 = false;
                                                        int var63 = var11.field2101[var55] - 1;
                                                        if (arg4 < var58 + 32 && var58 < arg5 && (var59 + 32) > arg3 && arg2 > var59 || class82.field1187 == var11 && class2.field21 == var55) {
                                                            class204 var64;
                                                            if (class63.field941 == 1 && class155.field2548 == var55 && class264.field4288 == var11.field2073) {
                                                                var64 = class106.method788(false, var63, var11.field2113[var55], var11.field2027, 2, (class10) null, 0);
                                                            } else {
                                                                var64 = class106.method788(false, var63, var11.field2113[var55], var11.field2027, 1, (class10) null, 3153952);
                                                            }
                                                            if (class47.field682) {
                                                                class190.field3070[var12] = true;
                                                            }
                                                            if (var64 == null) {
                                                                class274.method1896(var11, 10);
                                                            } else if (class82.field1187 == var11 && class2.field21 == var55) {
                                                                int var65 = class169.field2731 - class10.field109;
                                                                int var66 = class296.field4680 - class280.field4468;
                                                                if (var66 < 5 && var66 > -5) {
                                                                    var66 = 0;
                                                                }
                                                                if (var65 < 5 && var65 > -5) {
                                                                    var65 = 0;
                                                                }
                                                                if (class259.field4249 < 5) {
                                                                    var66 = 0;
                                                                    var65 = 0;
                                                                }
                                                                var64.method66(var58 + var65, var59 + var66, 128);
                                                                if (arg6 != -1) {
                                                                    class131 var67 = arg8[arg6 & 0xFFFF];
                                                                    int var68 = class70.field1035;
                                                                    int var69 = class70.field1027;
                                                                    if (var59 + var66 < var69 && var67.field1995 > 0) {
                                                                        int var70 = (var69 - var59 - var66) * class161.field2628 / 3;
                                                                        if (var70 > class161.field2628 * 10) {
                                                                            var70 = class161.field2628 * 10;
                                                                        }
                                                                        if (var67.field1995 < var70) {
                                                                            var70 = var67.field1995;
                                                                        }
                                                                        var67.field1995 -= var70;
                                                                        class280.field4468 += var70;
                                                                        class274.method1896(var67, 10);
                                                                    }
                                                                    if (var66 + var59 + 32 > var68 && var67.field1995 < (var67.field2025 - var67.field2167)) {
                                                                        int var71 = (var66 + var59 - (var68 - 32)) * class161.field2628 / 3;
                                                                        if (class161.field2628 * 10 < var71) {
                                                                            var71 = class161.field2628 * 10;
                                                                        }
                                                                        if (var67.field2025 - var67.field2167 - var67.field1995 < var71) {
                                                                            var71 = var67.field2025 - var67.field2167 - var67.field1995;
                                                                        }
                                                                        var67.field1995 += var71;
                                                                        class280.field4468 -= var71;
                                                                        class274.method1896(var67, 10);
                                                                    }
                                                                }
                                                            } else if (class110.field1588 == var11 && class163.field2650 == var55) {
                                                                var64.method66(var58, var59, 128);
                                                            } else {
                                                                var64.method60(var58, var59);
                                                            }
                                                        }
                                                    } else if (var11.field2036 != null && var55 < 20) {
                                                        class204 var60 = var11.method954((byte) 108, var55);
                                                        if (var60 != null) {
                                                            var60.method60(var58, var59);
                                                        } else if (class97.field1431) {
                                                            class274.method1896(var11, 10);
                                                        }
                                                    }
                                                    var55++;
                                                }
                                            }
                                        } else if (var11.field2150 == 3) {
                                            int var72;
                                            if (class144.method1038(19490, var11)) {
                                                var72 = var11.field2104;
                                                if (class260.field4250 == var11 && var11.field2127 != 0) {
                                                    var72 = var11.field2127;
                                                }
                                            } else {
                                                var72 = var11.field2015;
                                                if (class260.field4250 == var11 && var11.field2090 != 0) {
                                                    var72 = var11.field2090;
                                                }
                                            }
                                            if (var14 == 0) {
                                                if (var11.field2058) {
                                                    class70.method508(var13, var15, var11.field2102, var11.field2167, var72);
                                                } else {
                                                    class70.method505(var13, var15, var11.field2102, var11.field2167, var72);
                                                }
                                            } else if (var11.field2058) {
                                                class70.method515(var13, var15, var11.field2102, var11.field2167, var72, 256 - (var14 & 0xFF));
                                            } else {
                                                class70.method509(var13, var15, var11.field2102, var11.field2167, var72, 256 - (var14 & 0xFF));
                                            }
                                        } else if (var11.field2150 == 4) {
                                            class170 var73 = var11.method949(26122, class92.field1384);
                                            if (var73 != null) {
                                                String var74 = var11.field2128;
                                                int var75;
                                                if (class144.method1038(19490, var11)) {
                                                    var75 = var11.field2104;
                                                    if (class260.field4250 == var11 && var11.field2127 != 0) {
                                                        var75 = var11.field2127;
                                                    }
                                                    if (var11.field2136.length() > 0) {
                                                        var74 = var11.field2136;
                                                    }
                                                } else {
                                                    var75 = var11.field2015;
                                                    if (class260.field4250 == var11 && var11.field2090 != 0) {
                                                        var75 = var11.field2090;
                                                    }
                                                }
                                                if (var11.field2077 && var11.field2170 != -1) {
                                                    class62 var76 = class254.method1800(var11.field2170, 15017);
                                                    var74 = var76.field910;
                                                    if (var74 == null) {
                                                        var74 = "null";
                                                    }
                                                    if ((var76.field909 == 1 || var11.field2012 != 1) && var11.field2012 != -1) {
                                                        var74 = "<col=ff9040>" + var74 + "</col> x" + class32.method231((byte) -42, var11.field2012);
                                                    }
                                                }
                                                if (class211.field3390 == var11) {
                                                    var74 = class245.field4025;
                                                    var75 = var11.field2015;
                                                }
                                                if (!var11.field2077) {
                                                    var74 = class218.method1566(var74, var11, 117);
                                                }
                                                var73.method1265(var74, var13, var15, var11.field2102, var11.field2167, var75, var11.field2057 ? 0 : -1, var11.field2123, var11.field2120, var11.field2031);
                                            } else if (class97.field1431) {
                                                class274.method1896(var11, 10);
                                            }
                                        } else if (var11.field2150 == 5) {
                                            if (!var11.field2077) {
                                                class204 var77 = var11.method940(class144.method1038(19490, var11), (byte) 124);
                                                if (var77 != null) {
                                                    var77.method60(var13, var15);
                                                } else if (class97.field1431) {
                                                    class274.method1896(var11, 10);
                                                }
                                            } else if (var11.field2096 >= 0) {
                                                class219 var78 = var11.method950((byte) 25);
                                                var78.method1573(0, var13, var15, var11.field2102, var11.field2167, var11.field2063, var11.field2041, 0);
                                            } else {
                                                class204 var79;
                                                if (var11.field2170 == -1) {
                                                    var79 = var11.method940(false, (byte) 124);
                                                } else if (var11.field2152 && class186.field2993.field346 != null) {
                                                    var79 = class106.method788(false, var11.field2170, var11.field2012, var11.field2027, var11.field2122, class186.field2993.field346, var11.field2011);
                                                } else {
                                                    var79 = class106.method788(false, var11.field2170, var11.field2012, var11.field2027, var11.field2122, (class10) null, var11.field2011);
                                                }
                                                if (var79 != null) {
                                                    int var80 = var79.field3266;
                                                    int var81 = var79.field3274;
                                                    if (var11.field1998) {
                                                        int var82 = (var80 + var11.field2102 - 1) / var80;
                                                        int var83 = (var81 - (1 - var11.field2167)) / var81;
                                                        class70.method504(var13, var15, var13 + var11.field2102, var15 - -var11.field2167);
                                                        for (int var84 = 0; var84 < var82; var84++) {
                                                            for (int var85 = 0; var85 < var83; var85++) {
                                                                if (var11.field2140 != 0) {
                                                                    var79.method1491(4096, var15 + (var81 * var85) + (var81 / 2), 15, var80 / 2 + var80 * var84 + var13, var11.field2140);
                                                                } else if (var14 == 0) {
                                                                    var79.method60(var80 * var84 + var13, var15 - -(var81 * var85));
                                                                } else {
                                                                    var79.method66(var13 + (var80 * var84), var81 * var85 + var15, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                        class70.method500(arg4, arg3, arg5, arg2);
                                                    } else {
                                                        int var86 = var11.field2102 * 4096 / var80;
                                                        if (var11.field2140 != 0) {
                                                            var79.method1491(var86, var15 + (var11.field2167 / 2), 15, var11.field2102 / 2 + var13, var11.field2140);
                                                        } else if (var14 != 0) {
                                                            var79.method65(var13, var15, var11.field2102, var11.field2167, 256 - (var14 & 0xFF));
                                                        } else if (var11.field2102 == var80 && var11.field2167 == var81) {
                                                            var79.method60(var13, var15);
                                                        } else {
                                                            var79.method74(var13, var15, var11.field2102, var11.field2167);
                                                        }
                                                    }
                                                } else if (class97.field1431) {
                                                    class274.method1896(var11, 10);
                                                }
                                            }
                                        } else if (var11.field2150 == 6) {
                                            boolean var87 = class144.method1038(19490, var11);
                                            int var88;
                                            if (var87) {
                                                var88 = var11.field2023;
                                            } else {
                                                var88 = var11.field2171;
                                            }
                                            class22 var89 = null;
                                            int var90 = 0;
                                            if (var11.field2170 != -1) {
                                                class62 var95 = class254.method1800(var11.field2170, 15017);
                                                if (var95 != null) {
                                                    class62 var96 = var95.method449(var11.field2012, -1);
                                                    class141 var97 = var88 == -1 ? null : class285.method1939(var88, 112);
                                                    if (var11.field2152 && class186.field2993.field346 != null) {
                                                        var89 = var96.method444(var97, var11.field2079, var11.field1994, var11.field2097, 1, 32457, class186.field2993.field346);
                                                    } else {
                                                        var89 = var96.method444(var97, var11.field2079, var11.field1994, var11.field2097, 1, 32457, (class10) null);
                                                    }
                                                    if (var89 == null) {
                                                        class274.method1896(var11, 10);
                                                    } else {
                                                        var90 = -var89.method3() / 2;
                                                    }
                                                }
                                            } else if (var11.field2071 == 5) {
                                                if (var11.field2034 == -1) {
                                                    var89 = class20.field224.method88(-1, 0, (class141) null, 0, (class141) null, -1, true, -1, -1, (class124[]) null, 64);
                                                } else {
                                                    int var91 = var11.field2034 & 0x7FF;
                                                    if (class40.field569 == var91) {
                                                        var91 = 2047;
                                                    }
                                                    class29 var92 = class92.field1374[var91];
                                                    class141 var93 = var88 == -1 ? null : class285.method1939(var88, 112);
                                                    if (var92 != null && (int) class193.method1431(var92.field344, false) << 11 == (var11.field2034 & 0xFFFFF800)) {
                                                        var89 = var92.field346.method88(-1, 0, var93, 0, (class141) null, -1, true, var11.field2079, 0, (class124[]) null, 64);
                                                    }
                                                }
                                            } else if (var88 == -1) {
                                                var89 = var11.method955(class186.field2993.field346, 0, -1, -1, var87, false, (class141) null);
                                                if (var89 == null && class97.field1431) {
                                                    class274.method1896(var11, 10);
                                                }
                                            } else {
                                                class141 var94 = class285.method1939(var88, 112);
                                                var89 = var11.method955(class186.field2993.field346, var11.field1994, var11.field2079, var11.field2097, var87, false, var94);
                                                if (var89 == null && class97.field1431) {
                                                    class274.method1896(var11, 10);
                                                }
                                            }
                                            if (var89 != null) {
                                                int var98;
                                                if (var11.field2157 > 0) {
                                                    var98 = (var11.field2102 << 8) / var11.field2157;
                                                } else {
                                                    var98 = 256;
                                                }
                                                int var99;
                                                if (var11.field2155 <= 0) {
                                                    var99 = 256;
                                                } else {
                                                    var99 = (var11.field2167 << 8) / var11.field2155;
                                                }
                                                int var100 = (var11.field2119 * var98 >> 8) + var11.field2102 / 2 + var13;
                                                int var101 = var11.field2167 / 2 + var15 + (var11.field2112 * var99 >> 8);
                                                class47.method356(var100, var101);
                                                int var102 = class47.field679[var11.field2145] * var11.field2030 >> 16;
                                                int var103 = class47.field695[var11.field2145] * var11.field2030 >> 16;
                                                if (!var11.field2077) {
                                                    var89.method154(0, var11.field2149, 0, var11.field2145, 0, var102, var103, -1L);
                                                } else if (var11.field2174) {
                                                    ((class246) var89).method1775(0, var11.field2149, var11.field2139, var11.field2145, var11.field2176, var11.field2040 + var90 + var102, var11.field2040 + var103, var11.field2030);
                                                } else {
                                                    var89.method154(0, var11.field2149, var11.field2139, var11.field2145, var11.field2176, var90 + var102 + var11.field2040, var11.field2040 + var103, -1L);
                                                }
                                                class47.method368();
                                            }
                                        } else {
                                            if (var11.field2150 == 7) {
                                                class170 var104 = var11.method949(26122, class92.field1384);
                                                if (var104 == null) {
                                                    if (class97.field1431) {
                                                        class274.method1896(var11, 10);
                                                    }
                                                    break label898;
                                                }
                                                int var105 = 0;
                                                for (int var106 = 0; var106 < var11.field2072; var106++) {
                                                    for (int var107 = 0; var107 < var11.field2153; var107++) {
                                                        if (var11.field2101[var105] > 0) {
                                                            class62 var108 = class254.method1800(var11.field2101[var105] - 1, 15017);
                                                            String var109;
                                                            if (var108.field909 != 1 && var11.field2113[var105] == 1) {
                                                                var109 = "<col=ff9040>" + var108.field910 + "</col>";
                                                            } else {
                                                                var109 = "<col=ff9040>" + var108.field910 + "</col> x" + class32.method231((byte) -42, var11.field2113[var105]);
                                                            }
                                                            int var110 = (var11.field2064 + 115) * var107 + var13;
                                                            int var111 = (var11.field2163 + 12) * var106 + var15;
                                                            if (var11.field2123 == 0) {
                                                                var104.method1254(var109, var110, var111, var11.field2015, var11.field2057 ? 0 : -1);
                                                            } else if (var11.field2123 == 1) {
                                                                var104.method1260(var109, var110 + 57, var111, var11.field2015, var11.field2057 ? 0 : -1);
                                                            } else {
                                                                var104.method1247(var109, var110 + 115 - 1, var111, var11.field2015, var11.field2057 ? 0 : -1);
                                                            }
                                                        }
                                                        var105++;
                                                    }
                                                }
                                            }
                                            if (var11.field2150 == 8 && class272.field4373 == var11 && class275.field4418 == class257.field4229) {
                                                int var112 = 0;
                                                class170 var113 = class12.field139;
                                                int var114 = 0;
                                                String var115 = var11.field2128;
                                                String var116 = class218.method1566(var115, var11, 107);
                                                while (var116.length() > 0) {
                                                    int var124 = var116.indexOf("<br>");
                                                    String var125;
                                                    if (var124 == -1) {
                                                        var125 = var116;
                                                        var116 = "";
                                                    } else {
                                                        var125 = var116.substring(0, var124);
                                                        var116 = var116.substring(var124 + 4);
                                                    }
                                                    int var126 = var113.method1257(var125);
                                                    var114 += var113.field2750 + 1;
                                                    if (var126 > var112) {
                                                        var112 = var126;
                                                    }
                                                }
                                                var114 += 7;
                                                int var117 = var11.field2167 + var15 + 5;
                                                var112 += 6;
                                                int var118 = var11.field2102 + var13 - var112 - 5;
                                                if (arg2 < (var114 + var117)) {
                                                    var117 = arg2 - var114;
                                                }
                                                if (var118 < (var13 + 5)) {
                                                    var118 = var13 + 5;
                                                }
                                                if (arg5 < var112 + var118) {
                                                    var118 = arg5 - var112;
                                                }
                                                class70.method508(var118, var117, var112, var114, 16777120);
                                                class70.method505(var118, var117, var112, var114, 0);
                                                String var119 = var11.field2128;
                                                int var120 = var113.field2750 + var117 + 2;
                                                String var121 = class218.method1566(var119, var11, 106);
                                                while (var121.length() > 0) {
                                                    int var122 = var121.indexOf("<br>");
                                                    String var123;
                                                    if (var122 == -1) {
                                                        var123 = var121;
                                                        var121 = "";
                                                    } else {
                                                        var123 = var121.substring(0, var122);
                                                        var121 = var121.substring(var122 + 4);
                                                    }
                                                    var113.method1254(var123, var118 + 3, var120, 0, -1);
                                                    var120 += var113.field2750 + 1;
                                                }
                                            }
                                            if (var11.field2150 == 9) {
                                                int var127;
                                                int var128;
                                                int var129;
                                                int var130;
                                                if (var11.field2108) {
                                                    var127 = var15 + var11.field2167;
                                                    var128 = var13;
                                                    var129 = var11.field2102 + var13;
                                                    var130 = var15;
                                                } else {
                                                    var127 = var15;
                                                    var129 = var11.field2102 + var13;
                                                    var130 = var11.field2167 + var15;
                                                    var128 = var13;
                                                }
                                                if (var11.field2137 == 1) {
                                                    class70.method501(var128, var127, var129, var130, var11.field2015);
                                                } else {
                                                    class70.method513(var128, var127, var129, var130, var11.field2015, var11.field2137);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }
}
