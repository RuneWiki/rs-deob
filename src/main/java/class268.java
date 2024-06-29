import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class268 extends class199 {

    @OriginalMember(owner = "client!km", name = "Z", descriptor = "Lcc;")
    public static class327 field3861 = new class327(128);

    @OriginalMember(owner = "client!km", name = "db", descriptor = "I")
    public static int field3865 = 0;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!km", name = "V", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!km", name = "W", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!km", name = "X", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!km", name = "Y", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!km", name = "ab", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!km", name = "bb", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!km", name = "cb", descriptor = "[I")
    public static int[] field3864;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "[Llc;")
    private class351[] field3855;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V", line = 5)
    public static final void method1830(int arg0) {
        field3859++;
        if (class16.field203 || class145.field2021 == 2) {
            return;
        }
        try {
            class200.method1469(class277.field3969, -18278, "tbrefresh");
            int var1 = -69 / ((61 - arg0) / 32);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I", line = 26)
    public final int[] method190(int arg0, int arg1) {
        field3856++;
        int[] var3 = this.field2802.method2502(arg1, -108);
        if (arg0 != -1735) {
            field3865 = -64;
        }
        if (this.field2802.field5637) {
            this.method1834((byte) 52, this.field2802.method2501(arg0 ^ 0x6C6));
        }
        return var3;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[[I", line = 47)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            method1831(-27, 98);
        }
        int[][] var3 = this.field2796.method2187(arg0, arg1 ^ 0x74FA);
        field3862++;
        if (this.field2796.field4667) {
            int var4 = class95.field1235;
            int var5 = class224.field3233;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field2796.method2185(0);
            this.method1834((byte) 126, var6);
            for (int var8 = 0; var8 < class224.field3233; var8++) {
                int[][] var9 = var7[var8];
                int[] var10 = var9[1];
                int[] var11 = var9[2];
                int[] var12 = var6[var8];
                int[] var13 = var9[0];
                for (int var14 = 0; var14 < class95.field1235; var14++) {
                    int var15 = var12[var14];
                    var11[var14] = class335.method2339(var15 << 4, 4080);
                    var10[var14] = class335.method2339(var15 >> 4, 4080);
                    var13[var14] = class335.method2339(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V", line = 113)
    public static final void method1831(int arg0, int arg1) {
        field3863++;
        int var2 = class112.field1441;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class239 var4;
            if (arg0 == 0) {
                var4 = class359.field5616;
            } else {
                var4 = class311.field4574[class288.field4157[var3]];
            }
            if (var4 != null && var4.method1251(0)) {
                int var5 = var4.method1699(-1);
                if (arg0 == 0 || arg0 == var5) {
                    if (var5 == 1) {
                        if ((var4.field4855 & 0x7F) == 64 && (var4.field4893 & 0x7F) == 64) {
                            int var12 = var4.field4855 >> 7;
                            int var13 = var4.field4893 >> 7;
                            if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                                var10002 = class254.field3712[var12][var13]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field4855 & 0x7F) == 0 && (var4.field4893 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field4855 & 0x7F) == 64 && (var4.field4893 & 0x7F) == 64)) {
                        int var6 = var4.field4855 - var5 * 64 >> 7;
                        int var7 = var4.field4893 - var5 * 64 >> 7;
                        int var8 = var4.method1699(-1) + var6;
                        if (var8 > 104) {
                            var8 = 104;
                        }
                        if (var6 < 0) {
                            var6 = 0;
                        }
                        int var9 = var7 + var4.method1699(-1);
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        if (var9 > 104) {
                            var9 = 104;
                        }
                        for (int var10 = var6; var10 < var8; var10++) {
                            for (int var11 = var7; var11 < var9; var11++) {
                                var10002 = class254.field3712[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
        label219: for (int var14 = 0; var14 < var2; var14++) {
            long var15;
            class239 var17;
            if (arg0 == 0) {
                var15 = 8791798054912L;
                var17 = class359.field5616;
            } else {
                var17 = class311.field4574[class288.field4157[var14]];
                var15 = (long) class288.field4157[var14] << 32;
            }
            if (var17 != null && var17.method1251(0)) {
                int var18 = var17.method1699(-1);
                if (arg0 == 0 || arg0 == var18) {
                    var17.field3470 = false;
                    var17.field4884 = true;
                    if ((class343.field5340 && class112.field1441 > 200 || class112.field1441 > 50) && arg0 != 0 && var17.field4897 == var17.method2300((byte) 63).field1182) {
                        var17.field3470 = true;
                    }
                    if (var18 == 1) {
                        if ((var17.field4855 & 0x7F) == 64 && (var17.field4893 & 0x7F) == 64) {
                            int var19 = var17.field4855 >> 7;
                            int var20 = var17.field4893 >> 7;
                            if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                                continue;
                            }
                            if (class254.field3712[var19][var20] > 1) {
                                var10002 = class254.field3712[var19][var20]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var17.field4855 & 0x7F) == 0 && (var17.field4893 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var17.field4855 & 0x7F) == 64 && (var17.field4893 & 0x7F) == 0) {
                        int var21 = var17.field4893 - (var18 * 64) >> 7;
                        int var22 = var17.field4855 - (var18 * 64) >> 7;
                        int var23 = var18 + var22;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        boolean var24 = true;
                        int var25 = var18 + var21;
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        for (int var26 = var22; var26 < var23; var26++) {
                            for (int var27 = var21; var27 < var25; var27++) {
                                if (class254.field3712[var26][var27] <= 1) {
                                    var24 = false;
                                    break;
                                }
                            }
                        }
                        if (var24) {
                            int var28 = var22;
                            while (true) {
                                if (var23 <= var28) {
                                    continue label219;
                                }
                                for (int var29 = var21; var29 < var25; var29++) {
                                    var10002 = class254.field3712[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var17.field4943 == null || class313.field4603 < var17.field4938 || var17.field4905 <= class313.field4603) {
                        var17.field4884 = false;
                        var17.field4898 = class271.method1847(var17.field4893, true, var17.field4855, class56.field724);
                        class192.method1392(class56.field724, var17.field4855, var17.field4893, var17.field4898, (var18 - 1) * 64 + 60, var17, var17.field4926, var15, var17.field4894);
                    } else {
                        var17.field3470 = false;
                        var17.field4884 = false;
                        var17.field4898 = class271.method1847(var17.field4893, true, var17.field4855, class56.field724);
                        class100.method713(class56.field724, var17.field4855, var17.field4893, var17.field4898, var17, var17.field4926, var15, var17.field4939, var17.field4913, var17.field4937, var17.field4933);
                    }
                }
            }
        }
        int var30 = -106 % ((arg1 + 36) / 59);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLfd;I)V", line = 374)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3855 = new class351[arg1.method2096((byte) -122)];
            for (int var4 = 0; var4 < this.field3855.length; var4++) {
                int var5 = arg1.method2096((byte) -122);
                if (var5 == 0) {
                    this.field3855[var4] = class328.method2273(arg1, 116);
                } else if (var5 == 1) {
                    this.field3855[var4] = class167.method1247(true, arg1);
                } else if (var5 == 2) {
                    this.field3855[var4] = class328.method2272(arg1, 0);
                } else if (var5 == 3) {
                    this.field3855[var4] = class102.method722(arg1, true);
                }
            }
        } else if (arg2 == 1) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
        field3860++;
        if (arg0 != -43) {
            method1831(-117, -44);
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 448)
    public class268() {
        super(0, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([[[I[[B[[F[[I[[I[[F[[B[[I[[BI[[F[[I[[[B[[BZ[[I)[Lih;", line = 454)
    public static final class70[] method1832(int[][][] arg0, byte[][] arg1, float[][] arg2, int[][] arg3, int[][] arg4, float[][] arg5, byte[][] arg6, int[][] arg7, byte[][] arg8, int arg9, float[][] arg10, int[][] arg11, byte[][][] arg12, byte[][] arg13, boolean arg14, int[][] arg15) {
        field3858++;
        int[][] var16 = new int[105][105];
        int var17 = 1;
        if (arg14) {
            return (class70[]) null;
        }
        while (var17 <= 103) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg0 != null) {
                    int var20 = arg0[arg9][var17 >> 3][var18 >> 3];
                    var19 = var20 >> 1 & 0x3;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg13[var17][var18];
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg13[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg13[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg13[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg13[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17][var18];
                    }
                } else {
                    var22 = arg13[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg13[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg13[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class94 var23 = class307.method2145((var22 & 0xFF) - 1, true);
                    var16[var17][var18] = (var23.field1230 + 1 << 16) + var23.field1224;
                }
            }
            var17++;
        }
        class329 var24 = new class329(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg13[var25][var26] != 0) {
                    int[] var27;
                    if (arg1[var25][var26] == 0) {
                        var27 = class33.field411[0];
                    } else {
                        var27 = class42.field529[arg6[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = var16[var25][var26];
                    int var29 = var16[var25 + 1][var26];
                    int var30 = 0;
                    if (arg3 != null) {
                        var30 = arg3[var25][var26] & 0xFFFFFF;
                    }
                    int var31 = var16[var25 + 1][var26 + 1];
                    long var32 = (long) var28 << 32 | (long) var30;
                    long var34 = (long) var29 << 32 | (long) var30;
                    int var36 = var16[var25][var26 + 1];
                    long var37 = (long) var36 << 32 | (long) var30;
                    long var39 = (long) var31 << 32 | (long) var30;
                    int var41 = var27.length / 2;
                    class70 var42 = (class70) var24.method2279(var32, 94);
                    if (var42 == null) {
                        var42 = new class70((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg11 != null, var30);
                        var24.method2275(var42, 96, var32);
                    }
                    var42.field900 += var41;
                    var42.field912++;
                    if (var32 != var34) {
                        class70 var43 = (class70) var24.method2279(var34, 80);
                        if (var43 == null) {
                            var43 = new class70((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg11 != null, var30);
                            var24.method2275(var43, 107, var34);
                        }
                        var43.field900 += var41;
                        var43.field912++;
                    }
                    if (var32 != var39 && var34 != var39) {
                        class70 var44 = (class70) var24.method2279(var39, 47);
                        if (var44 == null) {
                            var44 = new class70((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg11 != null, var30);
                            var24.method2275(var44, 112, var39);
                        }
                        var44.field912++;
                        var44.field900 += var41;
                    }
                    if (var32 != var37 && var34 != var37 && var37 != var39) {
                        class70 var45 = (class70) var24.method2279(var37, 126);
                        if (var45 == null) {
                            var45 = new class70((var36 >> 16) - 1, (float) (var36 & 0xFFFF), false, arg11 != null, var30);
                            var24.method2275(var45, 109, var37);
                        }
                        var45.field900 += var41;
                        var45.field912++;
                    }
                }
            }
        }
        for (class70 var46 = (class70) var24.method2277(13292); var46 != null; var46 = (class70) var24.method2278((byte) -120)) {
            var46.method520();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg13[var47][var48];
                if (var49 != 0) {
                    int var50 = 0;
                    int var51;
                    if ((arg12[arg9][var47][var48] & 0x8) != 0) {
                        var51 = 0;
                    } else if ((arg12[1][var47][var48] & 0x2) == 2 && arg9 > 0) {
                        var51 = arg9 - 1;
                    } else {
                        var51 = arg9;
                    }
                    int var52 = 128;
                    if (arg3 != null) {
                        var50 = arg3[var47][var48] & 0xFFFFFF;
                        var52 = arg3[var47][var48] >>> 24 << 3;
                    }
                    boolean[] var53 = null;
                    int[] var55;
                    byte var65;
                    if (arg1[var47][var48] == 0) {
                        byte var54 = 0;
                        var55 = class33.field411[0];
                        int var56 = var54 + (arg13[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var57 = 0;
                        byte var58 = 0;
                        int var59 = var58 + (arg13[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        byte var60 = 0;
                        int var61 = var60 + (arg13[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg13[var47][var48 - 1] == var49) {
                            var56++;
                            var59++;
                        } else {
                            var59--;
                            var56--;
                        }
                        int var62 = var57 + (arg13[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg13[var47 + 1][var48] == var49) {
                            var59++;
                            var62++;
                        } else {
                            var59--;
                            var62--;
                        }
                        if (arg13[var47][var48 + 1] == var49) {
                            var62++;
                            var61++;
                        } else {
                            var61--;
                            var62--;
                        }
                        if (arg13[var47 - 1][var48] == var49) {
                            var61++;
                            var56++;
                        } else {
                            var61--;
                            var56--;
                        }
                        int var63 = var56 - var62;
                        int var64 = var59 - var61;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        if (var63 < 0) {
                            var63 = -var63;
                        }
                        var65 = (byte) (var63 >= var64 ? 0 : 1);
                        arg8[var47][var48] = var65;
                    } else {
                        var55 = class42.field529[arg6[var47][var48]];
                        var65 = arg8[var47][var48];
                        var53 = class282.field4023[arg6[var47][var48]];
                        if (var55.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48];
                    int var68 = var16[var47 + 1][var48 + 1];
                    int var69 = var16[var47][var48 + 1];
                    long var70 = (long) var50 | (long) var66 << 32;
                    long var72 = (long) var50 | (long) var68 << 32;
                    long var74 = (long) var69 << 32 | (long) var50;
                    long var76 = (long) var50 | (long) var67 << 32;
                    int var78 = arg4[var47][var48];
                    int var79 = arg4[var47 + 1][var48];
                    int var80 = arg4[var47 + 1][var48 + 1];
                    int var81 = arg7[var47][var48];
                    int var82 = arg4[var47][var48 + 1];
                    int var83 = arg7[var47 + 1][var48];
                    int var84 = arg7[var47 + 1][var48 + 1];
                    int var85 = arg7[var47][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var69 >> 16) - 1;
                    int var88 = (var68 >> 16) - 1;
                    class70 var89 = (class70) var24.method2279(var70, -32);
                    int var90 = (var67 >> 16) - 1;
                    class308.method2148(var66 <= var69, var48, var66 <= var67, arg5, arg10, var89, (byte) -39, arg15, class179.method1316(var85, var86, 13080, var82), class179.method1316(var84, var86, 13080, var80), var65, var51, var66 <= var68, var52, arg2, class179.method1316(var83, var86, 13080, var79), var47, var53, arg11, class179.method1316(var81, var86, 13080, var78), var55, var66 <= var66);
                    if (var70 != var76) {
                        class70 var91 = (class70) var24.method2279(var76, -27);
                        class308.method2148(var69 >= var67, var48, var67 >= var67, arg5, arg10, var91, (byte) -39, arg15, class179.method1316(var85, var90, 13080, var82), class179.method1316(var84, var90, 13080, var80), var65, var51, var67 <= var68, var52, arg2, class179.method1316(var83, var90, 13080, var79), var47, var53, arg11, class179.method1316(var81, var90, 13080, var78), var55, var67 <= var66);
                    }
                    if (var70 != var72 && var72 != var76) {
                        class70 var92 = (class70) var24.method2279(var72, 115);
                        class308.method2148(var68 <= var69, var48, var68 <= var67, arg5, arg10, var92, (byte) -39, arg15, class179.method1316(var85, var88, 13080, var82), class179.method1316(var84, var88, 13080, var80), var65, var51, var68 <= var68, var52, arg2, class179.method1316(var83, var88, 13080, var79), var47, var53, arg11, class179.method1316(var81, var88, 13080, var78), var55, var68 <= var66);
                    }
                    if (var70 != var74 && var74 != var76 && var72 != var74) {
                        class70 var93 = (class70) var24.method2279(var74, -117);
                        class308.method2148(var69 <= var69, var48, var67 >= var69, arg5, arg10, var93, (byte) -39, arg15, class179.method1316(var85, var87, 13080, var82), class179.method1316(var84, var87, 13080, var80), var65, var51, var69 <= var68, var52, arg2, class179.method1316(var83, var87, 13080, var79), var47, var53, arg11, class179.method1316(var81, var87, 13080, var78), var55, var69 <= var66);
                    }
                }
            }
        }
        for (class70 var94 = (class70) var24.method2277(13292); var94 != null; var94 = (class70) var24.method2278((byte) -122)) {
            if (var94.field920 == 0) {
                var94.method179((byte) 51);
            } else {
                var94.method514();
            }
        }
        int var95 = var24.method2276(0);
        class70[] var96 = new class70[var95];
        var24.method2280(0, var96);
        long[] var97 = new long[var95];
        for (int var98 = 0; var98 < var95; var98++) {
            var97[var98] = var96[var98].field304;
        }
        class161.method1230(-4391, var97, var96);
        return var96;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(II)Lpe;", line = 912)
    public static final class204 method1833(int arg0, int arg1) {
        int var2 = 41 % ((61 - arg0) / 59);
        class204 var3 = (class204) class247.field3603.method2265((long) arg1, (byte) -127);
        field3854++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class345.field5369.method1089(33, (byte) 111, arg1);
        class204 var5 = new class204();
        if (var4 != null) {
            var5.method1484(-24927, arg1, new class299(var4));
        }
        class247.field3603.method2257(-128, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B[[I)V", line = 935)
    private final void method1834(byte arg0, int[][] arg1) {
        field3857++;
        int var3 = 113 % ((91 - arg0) / 33);
        int var4 = class95.field1235;
        int var5 = class224.field3233;
        class105.method742(arg1, (byte) 79);
        class233.method1661(-116, 0, 0, class156.field2165, class245.field3573);
        if (this.field3855 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3855.length; var6++) {
            class351 var7 = this.field3855[var6];
            int var8 = var7.field5486;
            int var9 = var7.field5481;
            if (var9 < 0) {
                if (var8 >= 0) {
                    var7.method1295(var4, var5, true);
                }
            } else if (var8 < 0) {
                var7.method1297(1380163464, var4, var5);
            } else {
                var7.method1294(var4, var5, (byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(I)V", line = 1004)
    public static void method1835(int arg0) {
        field3864 = null;
        field3861 = null;
        if (arg0 != 1) {
            method1835(-45);
        }
    }
}
