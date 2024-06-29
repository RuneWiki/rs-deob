import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class81 {

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lmj;")
    public static class144 field1337 = new class144(16);

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "J")
    private long field1334;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "J")
    private long field1354;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Ld;")
    public static class141 field1344;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lph;")
    public static class203 field1343;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Z")
    public boolean field1347;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[I")
    private int[] field1345;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[I")
    public static int[] field1351;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "[I")
    public int[] field1353;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "[[I")
    private int[][] field1341;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[[[B")
    public static byte[][][] field1333;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IIII[IZ)V")
    public final void method646(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        if (this.field1348 != arg3) {
            this.field1341 = null;
            this.field1348 = arg3;
        }
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class244.field3859; var8++) {
                    class9 var9 = class128.method935(var8, -88);
                    if (var9 != null && !var9.field106 && (arg5 ? class185.field3046[var7] : class183.field3024[var7]) == var9.field121) {
                        arg0[class271.field4344[var7]] = class140.method1045(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field1353 = arg4;
        field1339++;
        this.field1345 = arg0;
        int var10 = 112 / ((17 - arg2) / 51);
        this.field1350 = arg1;
        this.field1347 = arg5;
        this.method652(-237);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIZLel;Lel;ZI[Lbg;I)Lpb;")
    public final class168 method647(int arg0, int arg1, int arg2, int arg3, boolean arg4, class77 arg5, class77 arg6, boolean arg7, int arg8, class161[] arg9, int arg10) {
        field1349++;
        if (this.field1350 != -1) {
            return class128.method932(115, this.field1350).method1195(arg5, arg0, arg10, arg1, arg9, arg3, arg8, arg2, arg6, (byte) 43);
        }
        int[] var12 = this.field1345;
        long var13 = this.field1334;
        if (arg6 != null && (arg6.field1272 >= 0 || arg6.field1280 >= 0)) {
            var12 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var12[var15] = this.field1345[var15];
            }
            if (arg6.field1272 >= 0) {
                if (arg6.field1272 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var12[5] = 0;
                } else {
                    var12[5] = class140.method1045(1073741824, arg6.field1272);
                    var13 ^= (long) var12[5] << 32;
                }
            }
            if (arg6.field1280 >= 0) {
                if (arg6.field1280 == 65535) {
                    var12[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var12[3] = class140.method1045(1073741824, arg6.field1280);
                    var13 ^= (long) var12[3];
                }
            }
        }
        class168 var16 = (class168) class248.field3962.method1155(var13, arg4);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var12[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class128.method935(var43 & 0x3FFFFFFF, 34).method55(0)) {
                        var17 = true;
                    }
                } else if (!class190.method1314(var43 & 0x3FFFFFFF, (byte) 68).method528(this.field1347, -113)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field1354 != -1L) {
                    var16 = (class168) class248.field3962.method1155(this.field1354, true);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class264[] var19 = new class264[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var12[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class264 var42 = class190.method1314(var40 & 0x3FFFFFFF, (byte) 68).method525(this.field1347, (byte) -88);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class264 var41 = class128.method935(var40 & 0x3FFFFFFF, -47).method52((byte) 6);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    }
                }
                class38 var21 = null;
                if (this.field1348 != -1) {
                    var21 = class140.method1044(this.field1348, true);
                }
                if (var21 != null && var21.field669 != null) {
                    for (int var22 = 0; var22 < var21.field669.length; var22++) {
                        if (var21.field669[var22] != null && var19[var22] != null) {
                            int var23 = var21.field669[var22][1];
                            int var24 = var21.field669[var22][0];
                            int var25 = var21.field669[var22][3];
                            int var26 = var21.field669[var22][2];
                            int var27 = var21.field669[var22][4];
                            int var28 = var21.field669[var22][5];
                            if (this.field1341 == null) {
                                this.field1341 = new int[var21.field669.length][];
                            }
                            if (this.field1341[var22] == null) {
                                int[] var29 = this.field1341[var22] = new int[15];
                                if (var25 == 0 && var27 == 0 && var28 == 0) {
                                    var29[12] = -var24;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var26;
                                    var29[13] = -var23;
                                } else {
                                    int var30 = class95.field1475[var25] >> 1;
                                    int var31 = class95.field1475[var27] >> 1;
                                    int var32 = class95.field1482[var25] >> 1;
                                    int var33 = class95.field1482[var27] >> 1;
                                    int var34 = class95.field1475[var28] >> 1;
                                    int var35 = class95.field1482[var28] >> 1;
                                    var29[5] = -var32;
                                    var29[8] = var30 * var31 + 16384 >> 15;
                                    var29[2] = var30 * var33 + 16384 >> 15;
                                    var29[3] = var30 * var35 + 16384 >> 15;
                                    var29[14] = var29[2] * -var24 + var29[8] * -var26 + var29[5] * -var23 + 16384 >> 15;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    int var36 = var32 * var35 + 16384 >> 15;
                                    int var37 = var32 * var34 + 16384 >> 15;
                                    var29[7] = -var33 * -var35 + var31 * var37 + 16384 >> 15;
                                    var29[0] = var31 * var34 + var33 * var36 + 16384 >> 15;
                                    var29[6] = -var33 * var34 + var31 * var36 + 16384 >> 15;
                                    var29[12] = var29[0] * -var24 + (var29[3] * -var23 + (var29[6] * -var26) + 16384) >> 15;
                                    var29[1] = -var35 * var31 + var33 * var37 + 16384 >> 15;
                                    var29[13] = var29[7] * -var26 + var29[4] * -var23 + var29[1] * -var24 + 16384 >> 15;
                                }
                                var29[10] = var23;
                                var29[9] = var24;
                                var29[11] = var26;
                            }
                            if (var25 != 0 || var27 != 0 || var28 != 0) {
                                var19[var22].method1784(var25, var27, var28);
                            }
                            if (var24 != 0 || var23 != 0 || var26 != 0) {
                                var19[var22].method1790(var24, var23, var26);
                            }
                        }
                    }
                }
                class264 var38 = new class264(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (this.field1353[var39] < class113.field1747[var39].length) {
                        var38.method1803(class212.field3397[var39], class113.field1747[var39][this.field1353[var39]]);
                    }
                    if (class77.field1288[var39].length > this.field1353[var39]) {
                        var38.method1803(class110.field1697[var39], class77.field1288[var39][this.field1353[var39]]);
                    }
                }
                var16 = var38.method1786(64, 850, -30, -50, -30);
                if (arg7) {
                    class248.field3962.method1161(var16, (byte) -127, var13);
                    this.field1354 = var13;
                }
            }
        }
        if (!arg4) {
            this.method651(17, -30, 81);
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg9 == null ? 0 : arg9.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg9[var49] != null) {
                class77 var72 = class28.method246(113, arg9[var49].field2633);
                if (var72.field1256 != null) {
                    var44 = true;
                    class138.field2316[var49] = var72;
                    int var73 = arg9[var49].field2623;
                    int var74 = arg9[var49].field2624;
                    int var75 = var72.field1256[var73];
                    class101.field1548[var49] = class257.method1716((byte) -96, var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class161.field2635[var49] = var76;
                    if (class101.field1548[var49] != null) {
                        var48 |= class101.field1548[var49].method1214(var76, 96);
                        var46 |= class101.field1548[var49].method1213(var76, (byte) 14);
                        var45 |= var72.field1261;
                    }
                    if ((var72.field1258 || class294.field4671) && var74 != -1 && var74 < var72.field1256.length) {
                        class75.field1233[var49] = var72.field1282[var73];
                        class219.field3516[var49] = arg9[var49].field2639;
                        int var77 = var72.field1256[var74];
                        class160.field2602[var49] = class257.method1716((byte) -98, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class265.field4233[var49] = var78;
                        if (class160.field2602[var49] != null) {
                            var48 |= class160.field2602[var49].method1214(var78, 96);
                            var46 |= class160.field2602[var49].method1213(var78, (byte) 14);
                        }
                    } else {
                        class75.field1233[var49] = 0;
                        class219.field3516[var49] = 0;
                        class160.field2602[var49] = null;
                        class265.field4233[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg6 == null && arg5 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 0;
        class169 var53 = null;
        class169 var54 = null;
        if (arg6 != null) {
            int var55 = arg6.field1256[arg1];
            int var56 = var55 >>> 16;
            var51 = var55 & 0xFFFF;
            var53 = class257.method1716((byte) -36, var56);
            if (var53 != null) {
                var48 |= var53.method1214(var51, 111);
                var46 |= var53.method1213(var51, (byte) 14);
                var45 |= arg6.field1261;
            }
            if ((arg6.field1258 || class294.field4671) && arg0 != -1 && arg6.field1256.length > arg0) {
                var52 = arg6.field1282[arg1];
                int var57 = arg6.field1256[arg0];
                int var58 = var57 >>> 16;
                var50 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var54 = var53;
                } else {
                    var54 = class257.method1716((byte) -92, var50 >>> 16);
                }
                if (var54 != null) {
                    var48 |= var54.method1214(var50, 103);
                    var46 |= var54.method1213(var50, (byte) 14);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        class169 var61 = null;
        int var62 = 0;
        class169 var63 = null;
        if (arg5 != null) {
            int var64 = arg5.field1256[arg10];
            int var65 = var64 >>> 16;
            var61 = class257.method1716((byte) -32, var65);
            var59 = var64 & 0xFFFF;
            if (var61 != null) {
                var48 |= var61.method1214(var59, 110);
                var46 |= var61.method1213(var59, (byte) 14);
                var45 |= arg5.field1261;
            }
            if ((arg5.field1258 || class294.field4671) && arg8 != -1 && arg8 < arg5.field1256.length) {
                var62 = arg5.field1282[arg10];
                int var66 = arg5.field1256[arg8];
                int var67 = var66 >>> 16;
                var60 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var63 = var61;
                } else {
                    var63 = class257.method1716((byte) -61, var60 >>> 16);
                }
                if (var63 != null) {
                    var48 |= var63.method1214(var60, 126);
                    var46 |= var63.method1213(var60, (byte) 14);
                }
            }
        }
        class168 var68 = var16.method354(!var46, !var48, !var45);
        int var69 = 0;
        int var70 = 1;
        while (var69 < var47) {
            if (class101.field1548[var69] != null) {
                var68.method1207(class101.field1548[var69], class161.field2635[var69], class160.field2602[var69], class265.field4233[var69], class219.field3516[var69] - 1, class75.field1233[var69], var70, class138.field2316[var69].field1261, this.field1341[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var53 != null && var61 != null) {
            var68.method1211(var53, var51, var54, var50, arg2 - 1, var52, var61, var59, var63, var60, arg3 - 1, var62, arg6.field1262, arg5.field1261 | arg6.field1261);
        } else if (var53 != null) {
            var68.method1209(var53, var51, var54, var50, arg2 - 1, var52, arg6.field1261);
        } else if (var61 != null) {
            var68.method1209(var61, var59, var63, var60, arg3 - 1, var62, arg5.field1261);
        }
        for (int var71 = 0; var71 < var47; var71++) {
            class101.field1548[var71] = null;
            class160.field2602[var71] = null;
            class138.field2316[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V")
    public final void method648(int arg0, boolean arg1) {
        if (arg0 < -21) {
            this.field1347 = arg1;
            this.method652(-237);
            field1346++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZI)V")
    public final void method649(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1343 = null;
        }
        this.field1353[arg0] = arg2;
        this.method652(-237);
        field1335++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILel;I)Lpb;")
    public final class168 method650(int arg0, int arg1, int arg2, class77 arg3, int arg4) {
        field1342++;
        if (this.field1350 != -1) {
            return class128.method932(10, this.field1350).method1198(-9, arg0, arg4, arg3, arg2);
        } else if (arg1 > -70) {
            return null;
        } else {
            class168 var6 = (class168) class44.field805.method1155(this.field1334, true);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < 12; var8++) {
                    int var17 = this.field1345[var8];
                    if ((var17 & 0x40000000) == 0) {
                        if ((var17 & Integer.MIN_VALUE) != 0 && !class128.method935(var17 & 0x3FFFFFFF, -48).method48(false)) {
                            var7 = true;
                        }
                    } else if (!class190.method1314(var17 & 0x3FFFFFFF, (byte) 68).method522(this.field1347, 0)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class264[] var9 = new class264[12];
                int var10 = 0;
                for (int var11 = 0; var11 < 12; var11++) {
                    int var14 = this.field1345[var11];
                    if ((var14 & 0x40000000) != 0) {
                        class264 var15 = class190.method1314(var14 & 0x3FFFFFFF, (byte) 68).method515(this.field1347, (byte) -45);
                        if (var15 != null) {
                            var9[var10++] = var15;
                        }
                    } else if ((var14 & Integer.MIN_VALUE) != 0) {
                        class264 var16 = class128.method935(var14 & 0x3FFFFFFF, -46).method57(4096);
                        if (var16 != null) {
                            var9[var10++] = var16;
                        }
                    }
                }
                class264 var12 = new class264(var9, var10);
                for (int var13 = 0; var13 < 5; var13++) {
                    if (this.field1353[var13] < class113.field1747[var13].length) {
                        var12.method1803(class212.field3397[var13], class113.field1747[var13][this.field1353[var13]]);
                    }
                    if (class77.field1288[var13].length > this.field1353[var13]) {
                        var12.method1803(class110.field1697[var13], class77.field1288[var13][this.field1353[var13]]);
                    }
                }
                var6 = var12.method1786(64, 768, -50, -10, -50);
                class44.field805.method1161(var6, (byte) -125, this.field1334);
            }
            if (arg3 != null) {
                var6 = arg3.method623(-65536, var6, arg4, arg2, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
    public final void method651(int arg0, int arg1, int arg2) {
        field1352++;
        int var4 = class271.field4344[arg0];
        if (~this.field1345[var4] != arg2 && class128.method935(arg1, 118) != null) {
            this.field1345[var4] = class140.method1045(Integer.MIN_VALUE, arg1);
            this.method652(-237);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    private final void method652(int arg0) {
        if (arg0 != -237) {
            field1351 = null;
        }
        long[] var2 = class260.field4135;
        field1336++;
        long var3 = this.field1334;
        this.field1334 = -1L;
        this.field1334 = this.field1334 >>> 8 ^ var2[(int) ((this.field1334 ^ (long) (this.field1348 >> 8)) & 0xFFL)];
        this.field1334 = this.field1334 >>> 8 ^ var2[(int) ((this.field1334 ^ (long) this.field1348) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1334 = this.field1334 >>> 8 ^ var2[(int) (((long) (this.field1345[var5] >> 24) ^ this.field1334) & 0xFFL)];
            this.field1334 = this.field1334 >>> 8 ^ var2[(int) (((long) (this.field1345[var5] >> 16) ^ this.field1334) & 0xFFL)];
            this.field1334 = this.field1334 >>> 8 ^ var2[(int) ((this.field1334 ^ (long) (this.field1345[var5] >> 8)) & 0xFFL)];
            this.field1334 = this.field1334 >>> 8 ^ var2[(int) (((long) this.field1345[var5] ^ this.field1334) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1334 = var2[(int) ((this.field1334 ^ (long) this.field1353[var6]) & 0xFFL)] ^ this.field1334 >>> 8;
        }
        this.field1334 = this.field1334 >>> 8 ^ var2[(int) (((long) (this.field1347 ? 1 : 0) ^ this.field1334) & 0xFFL)];
        if (var3 != 0L && this.field1334 != var3) {
            class248.field3962.method1154((byte) -61, var3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method653(byte arg0) {
        field1337 = null;
        if (arg0 >= -26) {
            field1333 = null;
        }
        field1344 = null;
        field1343 = null;
        field1333 = null;
        field1351 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)I")
    public final int method654(int arg0) {
        if (arg0 != -6) {
            this.field1341 = null;
        }
        field1340++;
        return this.field1350 == -1 ? (this.field1353[0] << 25) + (this.field1353[4] << 20) + (this.field1345[0] << 15) - (-(this.field1345[8] << 10) - (this.field1345[11] << 5) - this.field1345[1]) : class128.method932(119, this.field1350).field2703 + 305419896;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIILel;II)Lpb;")
    public final class168 method655(int arg0, int arg1, int arg2, int arg3, int arg4, class77 arg5, int arg6, int arg7) {
        field1338++;
        long var9 = (long) (arg3 << 16) | (long) arg4 << 32 | (long) arg7;
        if (arg1 != 0) {
            method653((byte) -58);
        }
        class168 var11 = (class168) class44.field805.method1155(var9, true);
        if (var11 == null) {
            class264[] var12 = new class264[3];
            int var13 = 0;
            if (!class128.method935(arg7, 118).method48(false) || !class128.method935(arg3, 123).method48(false) || !class128.method935(arg4, 118).method48(false)) {
                return null;
            }
            class264 var14 = class128.method935(arg7, 121).method57(arg1 + 4096);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class264 var15 = class128.method935(arg3, -28).method57(4096);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class264 var16 = class128.method935(arg4, -107).method57(4096);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class264 var17 = new class264(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class113.field1747[var18].length > this.field1353[var18]) {
                    var17.method1803(class212.field3397[var18], class113.field1747[var18][this.field1353[var18]]);
                }
                if (class77.field1288[var18].length > this.field1353[var18]) {
                    var17.method1803(class110.field1697[var18], class77.field1288[var18][this.field1353[var18]]);
                }
            }
            var11 = var17.method1786(64, 768, -50, -10, -50);
            class44.field805.method1161(var11, (byte) -121, var9);
        }
        if (arg5 != null) {
            var11 = arg5.method623(-65536, var11, arg6, arg0, arg2);
        }
        return var11;
    }
}
