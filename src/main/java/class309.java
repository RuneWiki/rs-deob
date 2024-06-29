import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class309 extends class283 {

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    private int field5320 = 6;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "Lna;")
    public static class26 field5311 = class69.method505("null", (byte) -125);

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "[Lna;")
    public static class26[] field5316 = new class26[100];

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "J")
    public static long field5310 = 0L;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "Lna;")
    public static class26 field5322 = class69.method505("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) -126);

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lna;BI)V", line = 5)
    public static final void method2158(class26 arg0, byte arg1, int arg2) {
        field5312++;
        class120 var3 = class293.method2059(arg1 - 36, 2, arg2);
        if (arg1 != 40) {
            method2162(82, 22, -104);
        }
        var3.method833((byte) 33);
        var3.field1878 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[I", line = 26)
    public final int[] method8(int arg0, byte arg1) {
        field5317++;
        int[] var3 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int[] var4 = this.method1990(0, arg0, 32755);
            int[] var5 = this.method1990(1, arg0, 32755);
            int var6 = this.field5320;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class101.field1632; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class101.field1632; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class101.field1632; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class101.field1632; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var8 = 0; var8 < class101.field1632; var8++) {
                    var3[var8] = 4096 - ((4096 - var4[var8]) * (4096 - var5[var8]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var25 = 0; var25 < class101.field1632; var25++) {
                    int var26 = var5[var25];
                    var3[var25] = var26 >= 2048 ? 4096 - ((4096 - var4[var25]) * (4096 - var26) >> 11) : var4[var25] * var26 >> 11;
                }
            } else if (var6 == 7) {
                for (int var23 = 0; var23 < class101.field1632; var23++) {
                    int var24 = var4[var23];
                    var3[var23] = var24 == 4096 ? 4096 : (var5[var23] << 12) / (4096 - var24);
                }
            } else if (var6 == 8) {
                for (int var21 = 0; var21 < class101.field1632; var21++) {
                    int var22 = var4[var21];
                    var3[var21] = var22 == 0 ? 0 : 4096 - (4096 - var5[var21] << 12) / var22;
                }
            } else if (var6 == 9) {
                for (int var9 = 0; var9 < class101.field1632; var9++) {
                    int var10 = var5[var9];
                    int var11 = var4[var9];
                    var3[var9] = var11 < var10 ? var11 : var10;
                }
            } else if (var6 == 10) {
                for (int var12 = 0; var12 < class101.field1632; var12++) {
                    int var13 = var5[var12];
                    int var14 = var4[var12];
                    var3[var12] = var14 > var13 ? var14 : var13;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class101.field1632; var18++) {
                    int var19 = var4[var18];
                    int var20 = var5[var18];
                    var3[var18] = var20 < var19 ? var19 - var20 : var20 - var19;
                }
            } else if (var6 == 12) {
                for (int var15 = 0; var15 < class101.field1632; var15++) {
                    int var16 = var4[var15];
                    int var17 = var5[var15];
                    var3[var15] = var16 + var17 - (var16 * var17 >> 11);
                }
            }
        }
        int var31 = -73 / ((30 - arg1) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(B)V", line = 273)
    public static void method2159(byte arg0) {
        field5316 = null;
        if (arg0 >= -56) {
            field5315 = 30;
        }
        field5322 = null;
        field5311 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)[[I", line = 288)
    public final int[][] method3(int arg0, int arg1) {
        field5321++;
        if (arg0 != -1) {
            this.method1(-8, (class82) null, false);
        }
        int[][] var3 = this.field4719.method2182((byte) -125, arg1);
        if (this.field4719.field5381) {
            int[][] var4 = this.method1994(arg1, 0, (byte) -87);
            int[][] var5 = this.method1994(arg1, 1, (byte) -73);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5320;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class101.field1632; var16++) {
                    var6[var16] = var9[var16] + var12[var16];
                    var7[var16] = var10[var16] + var13[var16];
                    var8[var16] = var11[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class101.field1632; var17++) {
                    var6[var17] = var9[var17] - var12[var17];
                    var7[var17] = var10[var17] - var13[var17];
                    var8[var17] = var11[var17] - var14[var17];
                }
            } else if (var15 == 3) {
                for (int var63 = 0; var63 < class101.field1632; var63++) {
                    var6[var63] = var9[var63] * var12[var63] >> 12;
                    var7[var63] = var10[var63] * var13[var63] >> 12;
                    var8[var63] = var11[var63] * var14[var63] >> 12;
                }
            } else if (var15 == 4) {
                for (int var18 = 0; var18 < class101.field1632; var18++) {
                    int var19 = var14[var18];
                    int var20 = var13[var18];
                    int var21 = var12[var18];
                    var6[var18] = var21 == 0 ? 4096 : (var9[var18] << 12) / var21;
                    var7[var18] = var20 == 0 ? 4096 : (var10[var18] << 12) / var20;
                    var8[var18] = var19 == 0 ? 4096 : (var11[var18] << 12) / var19;
                }
            } else if (var15 == 5) {
                for (int var22 = 0; var22 < class101.field1632; var22++) {
                    var6[var22] = 4096 - ((4096 - var9[var22]) * (4096 - var12[var22]) >> 12);
                    var7[var22] = 4096 - ((4096 - var10[var22]) * (4096 - var13[var22]) >> 12);
                    var8[var22] = 4096 - ((4096 - var11[var22]) * (4096 - var14[var22]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var23 = 0; var23 < class101.field1632; var23++) {
                    int var24 = var14[var23];
                    int var25 = var12[var23];
                    int var26 = var13[var23];
                    var6[var23] = var25 >= 2048 ? 4096 - ((4096 - var9[var23]) * (4096 - var25) >> 11) : var9[var23] * var25 >> 11;
                    var7[var23] = var26 < 2048 ? var10[var23] * var26 >> 11 : 4096 - ((4096 - var10[var23]) * (4096 - var26) >> 11);
                    var8[var23] = var24 >= 2048 ? 4096 - ((4096 - var11[var23]) * (4096 - var24) >> 11) : var11[var23] * var24 >> 11;
                }
            } else if (var15 == 7) {
                for (int var27 = 0; var27 < class101.field1632; var27++) {
                    int var28 = var11[var27];
                    int var29 = var9[var27];
                    int var30 = var10[var27];
                    var6[var27] = var29 == 4096 ? 4096 : (var12[var27] << 12) / (4096 - var29);
                    var7[var27] = var30 == 4096 ? 4096 : (var13[var27] << 12) / (4096 - var30);
                    var8[var27] = var28 == 4096 ? 4096 : (var14[var27] << 12) / (4096 - var28);
                }
            } else if (var15 == 8) {
                for (int var31 = 0; var31 < class101.field1632; var31++) {
                    int var32 = var9[var31];
                    int var33 = var10[var31];
                    int var34 = var11[var31];
                    var6[var31] = var32 == 0 ? 0 : 4096 - ((4096 - var12[var31] << 12) / var32);
                    var7[var31] = var33 == 0 ? 0 : 4096 - ((4096 - var13[var31] << 12) / var33);
                    var8[var31] = var34 == 0 ? 0 : 4096 - (4096 - var14[var31] << 12) / var34;
                }
            } else if (var15 == 9) {
                for (int var56 = 0; var56 < class101.field1632; var56++) {
                    int var57 = var11[var56];
                    int var58 = var14[var56];
                    int var59 = var13[var56];
                    int var60 = var10[var56];
                    int var61 = var12[var56];
                    int var62 = var9[var56];
                    var6[var56] = var62 >= var61 ? var61 : var62;
                    var7[var56] = var60 >= var59 ? var59 : var60;
                    var8[var56] = var57 < var58 ? var57 : var58;
                }
            } else if (var15 == 10) {
                for (int var49 = 0; var49 < class101.field1632; var49++) {
                    int var50 = var14[var49];
                    int var51 = var11[var49];
                    int var52 = var13[var49];
                    int var53 = var9[var49];
                    int var54 = var10[var49];
                    int var55 = var12[var49];
                    var6[var49] = var55 < var53 ? var53 : var55;
                    var7[var49] = var54 > var52 ? var54 : var52;
                    var8[var49] = var50 < var51 ? var51 : var50;
                }
            } else if (var15 == 11) {
                for (int var35 = 0; var35 < class101.field1632; var35++) {
                    int var36 = var13[var35];
                    int var37 = var12[var35];
                    int var38 = var10[var35];
                    int var39 = var9[var35];
                    int var40 = var11[var35];
                    int var41 = var14[var35];
                    var6[var35] = var39 > var37 ? var39 - var37 : -var39 + var37;
                    var7[var35] = var38 > var36 ? var38 - var36 : -var38 + var36;
                    var8[var35] = var41 < var40 ? var40 - var41 : -var40 + var41;
                }
            } else if (var15 == 12) {
                for (int var42 = 0; var42 < class101.field1632; var42++) {
                    int var43 = var9[var42];
                    int var44 = var14[var42];
                    int var45 = var12[var42];
                    int var46 = var13[var42];
                    int var47 = var11[var42];
                    int var48 = var10[var42];
                    var6[var42] = var43 + var45 - (var43 * var45 >> 11);
                    var7[var42] = var46 + var48 - (var46 * var48 >> 11);
                    var8[var42] = var47 + var44 - (var44 * var47 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(JI)V", line = 600)
    public static final void method2160(long arg0, int arg1) {
        field5314++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class321.field5520; var3++) {
            if (class121.field1890[var3] == arg0) {
                class123.field1917++;
                class321.field5520--;
                for (int var4 = var3; var4 < class321.field5520; var4++) {
                    class267.field4406[var4] = class267.field4406[var4 + 1];
                    class208.field3226[var4] = class208.field3226[var4 + 1];
                    class96.field1560[var4] = class96.field1560[var4 + 1];
                    class121.field1890[var4] = class121.field1890[var4 + 1];
                    class117.field1842[var4] = class117.field1842[var4 + 1];
                    class147.field2295[var4] = class147.field2295[var4 + 1];
                }
                class100.field1611 = class74.field1144;
                class114.field1789.method1431(0, 57);
                class114.field1789.method579(arg0, -2037491440);
                break;
            }
        }
        if (arg1 != 1) {
            field5316 = (class26[]) null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([[[B[[B[[B[[I[[F[[I[[B[[B[[FI[[F[[I[[I[[II)[Lhg;", line = 667)
    public static final class172[] method2161(byte[][][] arg0, byte[][] arg1, byte[][] arg2, int[][] arg3, float[][] arg4, int[][] arg5, byte[][] arg6, byte[][] arg7, float[][] arg8, int arg9, float[][] arg10, int[][] arg11, int[][] arg12, int[][] arg13, int arg14) {
        field5318++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg2[var16][var17];
                if (var18 == 0) {
                    var18 = arg2[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg2[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg2[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class24 var19 = class4.method19(true, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field349 + 1 << 16) + var19.field351;
                }
            }
        }
        class259 var20 = new class259(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg2[var21][var22] != 0) {
                    int[] var23;
                    if (arg6[var21][var22] == 0) {
                        var23 = class287.field4804[0];
                    } else {
                        var23 = class39.field657[arg1[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22];
                    if (arg5 != null) {
                        var24 = arg5[var21][var22] & 0xFFFFFF;
                    }
                    long var27 = (long) var24 | (long) var26 << 32;
                    int var29 = var15[var21][var22 + 1];
                    int var30 = var15[var21 + 1][var22 + 1];
                    long var31 = (long) var29 << 32 | (long) var24;
                    int var33 = var23.length / 2;
                    long var34 = (long) var24 | (long) var25 << 32;
                    class172 var36 = (class172) var20.method1827(var34, 0);
                    if (var36 == null) {
                        var36 = new class172((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg13 != null, var24);
                        var20.method1826(1, var36, var34);
                    }
                    var36.field2679++;
                    var36.field2677 += var33;
                    if (var27 != var34) {
                        class172 var37 = (class172) var20.method1827(var27, 0);
                        if (var37 == null) {
                            var37 = new class172((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1826(arg14 - 4095, var37, var27);
                        }
                        var37.field2679++;
                        var37.field2677 += var33;
                    }
                    long var38 = (long) var30 << 32 | (long) var24;
                    if (var34 != var38 && var27 != var38) {
                        class172 var40 = (class172) var20.method1827(var38, arg14 ^ 0x1000);
                        if (var40 == null) {
                            var40 = new class172((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1826(1, var40, var38);
                        }
                        var40.field2677 += var33;
                        var40.field2679++;
                    }
                    if (var31 != var34 && var27 != var31 && var31 != var38) {
                        class172 var41 = (class172) var20.method1827(var31, 0);
                        if (var41 == null) {
                            var41 = new class172((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1826(arg14 ^ 0x1001, var41, var31);
                        }
                        var41.field2679++;
                        var41.field2677 += var33;
                    }
                }
            }
        }
        if (arg14 != 4096) {
            method2160(-10L, 48);
        }
        for (class172 var42 = (class172) var20.method1823(92); var42 != null; var42 = (class172) var20.method1825(-102)) {
            var42.method1179();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg2[var43][var44];
                if (var45 != 0) {
                    int var46;
                    if ((arg0[arg9][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg0[1][var43][var44] & 0x2) == 2 && arg9 > 0) {
                        var46 = arg9 - 1;
                    } else {
                        var46 = arg9;
                    }
                    int var47 = 0;
                    boolean[] var48 = null;
                    int var49 = 128;
                    if (arg5 != null) {
                        var49 = arg5[var43][var44] >>> 24 << 3;
                        var47 = arg5[var43][var44] & 0xFFFFFF;
                    }
                    int[] var50;
                    byte var51;
                    if (arg6[var43][var44] == 0) {
                        byte var52 = 0;
                        int var53 = var52 + (arg2[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        byte var54 = 0;
                        var50 = class287.field4804[0];
                        int var55 = var54 + (arg2[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        if (arg2[var43][var44 - 1] == var45) {
                            var55++;
                            var53++;
                        } else {
                            var53--;
                            var55--;
                        }
                        byte var56 = 0;
                        int var57 = var56 + (arg2[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        byte var58 = 0;
                        if (arg2[var43 + 1][var44] == var45) {
                            var57++;
                            var55++;
                        } else {
                            var55--;
                            var57--;
                        }
                        int var59 = var58 + (arg2[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg2[var43][var44 + 1] == var45) {
                            var59++;
                            var57++;
                        } else {
                            var57--;
                            var59--;
                        }
                        if (arg2[var43 - 1][var44] == var45) {
                            var59++;
                            var53++;
                        } else {
                            var59--;
                            var53--;
                        }
                        int var60 = var53 - var57;
                        int var61 = var55 - var59;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        var51 = (byte) (var61 <= var60 ? 0 : 1);
                        arg7[var43][var44] = var51;
                    } else {
                        var50 = class39.field657[arg1[var43][var44]];
                        var48 = class198.field3071[arg1[var43][var44]];
                        var51 = arg7[var43][var44];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44];
                    int var63 = var15[var43 + 1][var44];
                    int var64 = var15[var43 + 1][var44 + 1];
                    long var65 = (long) var62 << 32 | (long) var47;
                    long var67 = (long) var63 << 32 | (long) var47;
                    long var69 = (long) var64 << 32 | (long) var47;
                    int var71 = arg11[var43][var44];
                    int var72 = var15[var43][var44 + 1];
                    int var73 = arg11[var43 + 1][var44 + 1];
                    int var74 = arg11[var43 + 1][var44];
                    long var75 = (long) var47 | (long) var72 << 32;
                    int var77 = arg11[var43][var44 + 1];
                    int var78 = arg3[var43][var44];
                    int var79 = arg3[var43 + 1][var44];
                    int var80 = arg3[var43 + 1][var44 + 1];
                    int var81 = arg3[var43][var44 + 1];
                    int var82 = (var63 >> 16) - 1;
                    int var83 = (var62 >> 16) - 1;
                    int var84 = (var64 >> 16) - 1;
                    class172 var85 = (class172) var20.method1827(var65, 0);
                    class39.method318(arg13, var62 <= var62, class84.method655(var83, var71, (byte) -92, var78), var85, var50, var44, var46, var43, var62 <= var64, arg8, var72 >= var62, 2, arg4, var49, class84.method655(var83, var77, (byte) -80, var81), class84.method655(var83, var73, (byte) -103, var80), var62 <= var63, arg12, arg10, var51, class84.method655(var83, var74, (byte) -118, var79), var48);
                    int var86 = (var72 >> 16) - 1;
                    if (var65 != var67) {
                        class172 var87 = (class172) var20.method1827(var67, arg14 ^ 0x1000);
                        class39.method318(arg13, var63 <= var62, class84.method655(var82, var71, (byte) 88, var78), var87, var50, var44, var46, var43, var64 >= var63, arg8, var63 <= var72, 2, arg4, var49, class84.method655(var82, var77, (byte) -82, var81), class84.method655(var82, var73, (byte) -113, var80), var63 <= var63, arg12, arg10, var51, class84.method655(var82, var74, (byte) 113, var79), var48);
                    }
                    if (var65 != var69 && var67 != var69) {
                        class172 var88 = (class172) var20.method1827(var69, 0);
                        class39.method318(arg13, var62 >= var64, class84.method655(var84, var71, (byte) 59, var78), var88, var50, var44, var46, var43, var64 <= var64, arg8, var64 <= var72, arg14 ^ 0x1002, arg4, var49, class84.method655(var84, var77, (byte) 54, var81), class84.method655(var84, var73, (byte) -87, var80), var63 >= var64, arg12, arg10, var51, class84.method655(var84, var74, (byte) -77, var79), var48);
                    }
                    if (var65 != var75 && var67 != var75 && var69 != var75) {
                        class172 var89 = (class172) var20.method1827(var75, 0);
                        class39.method318(arg13, var72 <= var62, class84.method655(var86, var71, (byte) -118, var78), var89, var50, var44, var46, var43, var72 <= var64, arg8, var72 >= var72, arg14 ^ 0x1002, arg4, var49, class84.method655(var86, var77, (byte) -96, var81), class84.method655(var86, var73, (byte) 115, var80), var63 >= var72, arg12, arg10, var51, class84.method655(var86, var74, (byte) 58, var79), var48);
                    }
                }
            }
        }
        for (class172 var90 = (class172) var20.method1823(54); var90 != null; var90 = (class172) var20.method1825(-62)) {
            if (var90.field2678 == 0) {
                var90.method1006(-1024);
            } else {
                var90.method1182();
            }
        }
        int var91 = var20.method1828(83);
        class172[] var92 = new class172[var91];
        var20.method1829(var92, arg14 ^ 0x1056);
        long[] var93 = new long[var91];
        for (int var94 = 0; var94 < var91; var94++) {
            var93[var94] = var92[var94].field2293;
        }
        class163.method1111(var93, var92, -86);
        return var92;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 1063)
    public class309() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(III)V", line = 1071)
    public static final void method2162(int arg0, int arg1, int arg2) {
        if (arg0 <= 92) {
            method2160(-6L, -85);
        }
        field5323++;
        int var3 = arg1;
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        int var4 = class190.field2988[arg1];
        int var5 = class7.field79[arg1];
        if (arg2 == 0) {
            class114.field1789.method1431(0, 215);
            class114.field1789.method591((byte) -25, var3 + var3 + 3);
            class38.field619++;
        }
        if (arg2 == 1) {
            class114.field1789.method1431(0, 39);
            class114.field1789.method591((byte) -111, var3 + 3 - (-var3 - 14));
            class279.field4653++;
        }
        if (arg2 == 2) {
            class207.field3215++;
            class114.field1789.method1431(0, 77);
            class114.field1789.method591((byte) -70, var3 + var3 + 3);
        }
        class114.field1789.method629(class78.field1183[82] ? 1 : 0, -13071);
        class114.field1789.method643(-20037, class12.field157 + var4);
        class114.field1789.method622(class165.field2568 + var5, -268435456);
        class7.field84 = class7.field79[0];
        class64.field1020 = class190.field2988[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class114.field1789.method629(class190.field2988[arg1] - var4, -13071);
            class114.field1789.method582(10213, class7.field79[arg1] - var5);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILwa;Z)V", line = 1137)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field5320 = arg1.method642((byte) -104);
        } else if (arg0 == 1) {
            this.field4715 = arg1.method642((byte) -98) == 1;
        }
        if (!arg2) {
            field5311 = (class26) null;
        }
        field5313++;
    }
}
