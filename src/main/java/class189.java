import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class189 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2824 = null;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field2846 = -1;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private int field2829;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "J")
    private long field2839;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "J")
    private long field2842;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Ll;")
    public static class133 field2836;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lsf;")
    public static class197 field2832;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Z")
    public boolean field2827;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
    private int[] field2830;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "[I")
    public int[] field2844;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[[I")
    private int[][] field2834;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLl;I)Lwj;", line = 17)
    public static final class270 method1346(byte arg0, class133 arg1, int arg2) {
        if (arg0 > -13) {
            return (class270) null;
        } else {
            field2828++;
            return class125.method907(arg1, -4956, arg2) ? class289.method1987(0) : null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIILwb;IZJ)Z", line = 33)
    public static final boolean method1347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class253 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class218.field3321 == class119.field1816;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class50.field817 || var16 >= class267.field4171) {
                    return false;
                }
                class142 var17 = class256.field4013[arg0][var15][var16];
                if (var17 != null && var17.field2204 >= 5) {
                    return false;
                }
            }
        }
        class26 var18 = new class26();
        var18.field402 = arg11;
        var18.field400 = arg0;
        var18.field407 = arg5;
        var18.field395 = arg6;
        var18.field408 = arg7;
        var18.field406 = arg8;
        var18.field401 = arg9;
        var18.field411 = arg1;
        var18.field410 = arg2;
        var18.field405 = arg1 + arg3 - 1;
        var18.field396 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class256.field4013[var22][var19][var20] == null) {
                        class256.field4013[var22][var19][var20] = new class142(var22, var19, var20);
                    }
                }
                class142 var23 = class256.field4013[arg0][var19][var20];
                var23.field2197[var23.field2204] = var18;
                var23.field2193[var23.field2204] = var21;
                var23.field2208 |= var21;
                var23.field2204++;
                if (var13 && class121.field1848[var19][var20] != 0) {
                    var14 = class121.field1848[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class121.field1848[var24][var25] == 0) {
                        class121.field1848[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class51.field840[class65.field1018++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZILoh;IIIII[Lch;Loh;)Lwi;", line = 157)
    public final class221 method1348(int arg0, boolean arg1, int arg2, class281 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class111[] arg9, class281 arg10) {
        field2843++;
        if (this.field2845 != -1) {
            return class231.method1630(-96, this.field2845).method1461(arg7, arg6, true, arg8, arg2, arg5, arg0, arg3, arg10, arg9);
        }
        long var12 = this.field2839;
        int[] var14 = this.field2830;
        if (arg3 != null && (arg3.field4329 >= 0 || arg3.field4333 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field2830[var15];
            }
            if (arg3.field4329 >= 0) {
                if (arg3.field4329 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class222.method1577(arg3.field4329, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg3.field4333 >= 0) {
                if (arg3.field4333 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class222.method1577(arg3.field4333, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class221 var16 = (class221) class73.field1193.method2179(false, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class132.method945(var19 & 0x3FFFFFFF, (byte) -102).method1418(-122)) {
                        var17 = true;
                    }
                } else if (!class237.method1657(arg4 ^ 0xFFFF9EEA, var19 & 0x3FFFFFFF).method2034((byte) -117, this.field2827)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field2842 != -1L) {
                    var16 = (class221) class73.field1193.method2179(false, this.field2842);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class42[] var20 = new class42[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class42 var23 = class237.method1657(2, var22 & 0x3FFFFFFF).method2041(this.field2827, -119);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    } else if ((Integer.MIN_VALUE & var22) != 0) {
                        class42 var24 = class132.method945(var22 & 0x3FFFFFFF, (byte) -126).method1424(-13969);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    }
                }
                class333 var25 = null;
                if (this.field2829 != -1) {
                    var25 = class44.method377(this.field2829, arg4 ^ 0x77BB);
                }
                if (var25 != null && var25.field5211 != null) {
                    for (int var26 = 0; var26 < var25.field5211.length; var26++) {
                        if (var25.field5211[var26] != null && var20[var26] != null) {
                            int var27 = var25.field5211[var26][0];
                            int var28 = var25.field5211[var26][2];
                            int var29 = var25.field5211[var26][1];
                            int var30 = var25.field5211[var26][4];
                            int var31 = var25.field5211[var26][3];
                            int var32 = var25.field5211[var26][5];
                            if (this.field2834 == null) {
                                this.field2834 = new int[var25.field5211.length][];
                            }
                            if (this.field2834[var26] == null) {
                                int[] var33 = this.field2834[var26] = new int[15];
                                if (var31 == 0 && var30 == 0 && var32 == 0) {
                                    var33[12] = -var27;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[13] = -var29;
                                    var33[14] = -var28;
                                } else {
                                    int var34 = class15.field216[var31] >> 1;
                                    int var35 = class15.field216[var30] >> 1;
                                    int var36 = class15.field204[var30] >> 1;
                                    int var37 = class15.field216[var32] >> 1;
                                    int var38 = class15.field204[var32] >> 1;
                                    int var39 = class15.field204[var31] >> 1;
                                    var33[2] = var34 * var36 + 16384 >> 15;
                                    var33[3] = var34 * var38 + 16384 >> 15;
                                    var33[8] = var34 * var35 + 16384 >> 15;
                                    var33[5] = -var39;
                                    var33[4] = var34 * var37 + 16384 >> 15;
                                    int var40 = var37 * var39 + 16384 >> 15;
                                    var33[14] = var33[2] * -var27 + (var33[5] * -var29) + var33[8] * -var28 + 16384 >> 15;
                                    var33[7] = -var36 * -var38 + var35 * var40 + 16384 >> 15;
                                    var33[1] = var36 * var40 + -var38 * var35 + 16384 >> 15;
                                    int var41 = var38 * var39 + 16384 >> 15;
                                    var33[0] = var35 * var37 + var36 * var41 + 16384 >> 15;
                                    var33[13] = var33[4] * -var29 + var33[1] * -var27 + var33[7] * -var28 + 16384 >> 15;
                                    var33[6] = var35 * var41 + -var36 * var37 + 16384 >> 15;
                                    var33[12] = var33[3] * -var29 + (var33[0] * -var27 + (var33[6] * -var28)) + 16384 >> 15;
                                }
                                var33[11] = var28;
                                var33[9] = var27;
                                var33[10] = var29;
                            }
                            if (var31 != 0 || var30 != 0 || var32 != 0) {
                                var20[var26].method335(var31, var30, var32);
                            }
                            if (var27 != 0 || var29 != 0 || var28 != 0) {
                                var20[var26].method352(var27, var29, var28);
                            }
                        }
                    }
                }
                class42 var42 = new class42(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class83.field1302[var43].length > this.field2844[var43]) {
                        var42.method353(class46.field761[var43], class83.field1302[var43][this.field2844[var43]]);
                    }
                    if (this.field2844[var43] < class290.field4515[var43].length) {
                        var42.method353(class130.field2041[var43], class290.field4515[var43][this.field2844[var43]]);
                    }
                }
                var16 = var42.method341(64, 850, -30, -50, -30);
                if (class94.field1516) {
                    ((class21) var16).method182(false, false, true, true, false, false, true);
                }
                if (arg1) {
                    class73.field1193.method2173(var16, true, var12);
                    this.field2842 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg9 == null ? 0 : arg9.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg9[var49] != null) {
                class281 var50 = class133.method948(arg9[var49].field1733, (byte) 33);
                if (var50.field4326 != null) {
                    class39.field602[var49] = var50;
                    int var51 = arg9[var49].field1731;
                    var44 = true;
                    int var52 = arg9[var49].field1725;
                    int var53 = var50.field4326[var52];
                    class256.field4018[var49] = class268.method1850(var53 >>> 16, true);
                    int var54 = var53 & 0xFFFF;
                    class142.field2191[var49] = var54;
                    if (class256.field4018[var49] != null) {
                        var46 |= class256.field4018[var49].method549(var54, arg4 + 24856);
                        var45 |= class256.field4018[var49].method551(var54, (byte) -99);
                        var48 |= var50.field4341;
                    }
                    if ((var50.field4345 || class244.field3904) && var51 != -1 && var50.field4326.length > var51) {
                        class238.field3791[var49] = var50.field4322[var52];
                        class297.field4596[var49] = arg9[var49].field1729;
                        int var55 = var50.field4326[var51];
                        class139.field2172[var49] = class268.method1850(var55 >>> 16, true);
                        int var56 = var55 & 0xFFFF;
                        class219.field3338[var49] = var56;
                        if (class139.field2172[var49] != null) {
                            var46 |= class139.field2172[var49].method549(var56, 0);
                            var45 |= class139.field2172[var49].method551(var56, (byte) -90);
                        }
                    } else {
                        class238.field3791[var49] = 0;
                        class297.field4596[var49] = 0;
                        class139.field2172[var49] = null;
                        class219.field3338[var49] = -1;
                    }
                }
            }
        }
        if (arg4 != -24856) {
            this.method1357((byte) 14);
        }
        if (!var44 && arg3 == null && arg10 == null) {
            return var16;
        }
        int var57 = -1;
        int var58 = -1;
        int var59 = 0;
        class75 var60 = null;
        class75 var61 = null;
        if (arg3 != null) {
            int var62 = arg3.field4326[arg6];
            int var63 = var62 >>> 16;
            var57 = var62 & 0xFFFF;
            var60 = class268.method1850(var63, true);
            if (var60 != null) {
                var46 |= var60.method549(var57, 0);
                var45 |= var60.method551(var57, (byte) -109);
                var48 |= arg3.field4341;
            }
            if ((arg3.field4345 || class244.field3904) && arg5 != -1 && arg5 < arg3.field4326.length) {
                var59 = arg3.field4322[arg6];
                int var64 = arg3.field4326[arg5];
                int var65 = var64 >>> 16;
                var58 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var61 = var60;
                } else {
                    var61 = class268.method1850(var58 >>> 16, true);
                }
                if (var61 != null) {
                    var46 |= var61.method549(var58, arg4 ^ 0xFFFF9EE8);
                    var45 |= var61.method551(var58, (byte) -87);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        int var68 = 0;
        class75 var69 = null;
        class75 var70 = null;
        if (arg10 != null) {
            int var71 = arg10.field4326[arg8];
            int var72 = var71 >>> 16;
            var66 = var71 & 0xFFFF;
            var69 = class268.method1850(var72, true);
            if (var69 != null) {
                var46 |= var69.method549(var66, arg4 ^ 0xFFFF9EE8);
                var45 |= var69.method551(var66, (byte) -79);
                var48 |= arg10.field4341;
            }
            if ((arg10.field4345 || class244.field3904) && arg0 != -1 && arg0 < arg10.field4326.length) {
                int var73 = arg10.field4326[arg0];
                int var74 = var73 >>> 16;
                var68 = arg10.field4322[arg8];
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var70 = var69;
                } else {
                    var70 = class268.method1850(var67 >>> 16, true);
                }
                if (var70 != null) {
                    var46 |= var70.method549(var67, arg4 ^ 0xFFFF9EE8);
                    var45 |= var70.method551(var67, (byte) -87);
                }
            }
        }
        class221 var75 = var16.method194(!var45, !var46, !var48);
        int var76 = 0;
        int var77 = 1;
        while (var76 < var47) {
            if (class256.field4018[var76] != null) {
                var75.method1570(class256.field4018[var76], class142.field2191[var76], class139.field2172[var76], class219.field3338[var76], class297.field4596[var76] - 1, class238.field3791[var76], var77, class39.field602[var76].field4341, this.field2834[var76]);
            }
            var77 <<= 0x1;
            var76++;
        }
        if (var60 != null && var69 != null) {
            var75.method1575(var60, var57, var61, var58, arg2 - 1, var59, var69, var66, var70, var67, arg7 - 1, var68, arg3.field4318, arg3.field4341 | arg10.field4341);
        } else if (var60 != null) {
            var75.method1576(var60, var57, var61, var58, arg2 - 1, var59, arg3.field4341);
        } else if (var69 != null) {
            var75.method1576(var69, var66, var70, var67, arg7 - 1, var68, arg10.field4341);
        }
        for (int var78 = 0; var78 < var47; var78++) {
            class256.field4018[var78] = null;
            class139.field2172[var78] = null;
            class39.field602[var78] = null;
        }
        return var75;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V", line = 631)
    public static void method1349(boolean arg0) {
        if (arg0) {
            field2824 = null;
            field2836 = null;
            field2832 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLoh;III)Lwi;", line = 643)
    public final class221 method1350(byte arg0, class281 arg1, int arg2, int arg3, int arg4) {
        field2831++;
        if (this.field2845 != -1) {
            return class231.method1630(-34, this.field2845).method1464(arg2, true, arg3, arg1, arg4);
        }
        if (arg0 <= 110) {
            this.field2829 = 62;
        }
        class221 var6 = (class221) class152.field2284.method2179(false, this.field2839);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field2830[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var9) != 0 && !class132.method945(var9 & 0x3FFFFFFF, (byte) -108).method1422(-61)) {
                        var7 = true;
                    }
                } else if (!class237.method1657(2, var9 & 0x3FFFFFFF).method2038((byte) 105, this.field2827)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class42[] var10 = new class42[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field2830[var12];
                if ((var13 & 0x40000000) != 0) {
                    class42 var15 = class237.method1657(2, var13 & 0x3FFFFFFF).method2033(this.field2827, 255);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                } else if ((var13 & Integer.MIN_VALUE) != 0) {
                    class42 var14 = class132.method945(var13 & 0x3FFFFFFF, (byte) -124).method1419(-6);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                }
            }
            class42 var16 = new class42(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class83.field1302[var17].length > this.field2844[var17]) {
                    var16.method353(class46.field761[var17], class83.field1302[var17][this.field2844[var17]]);
                }
                if (class290.field4515[var17].length > this.field2844[var17]) {
                    var16.method353(class130.field2041[var17], class290.field4515[var17][this.field2844[var17]]);
                }
            }
            var6 = var16.method341(64, 768, -50, -10, -50);
            class152.field2284.method2173(var6, true, this.field2839);
        }
        if (arg1 != null) {
            var6 = arg1.method1921(var6, (byte) 70, arg2, arg3, arg4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZI)V", line = 762)
    public final void method1351(int arg0, boolean arg1, int arg2) {
        field2840++;
        if (!arg1) {
            field2824 = (String) null;
        }
        this.field2844[arg0] = arg2;
        this.method1357((byte) -1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I", line = 774)
    public final int method1352(int arg0) {
        field2826++;
        if (arg0 <= 97) {
            return 57;
        } else if (this.field2845 == -1) {
            return (this.field2830[11] << 5) + (this.field2844[4] << 20) + (this.field2830[0] << 15) + (this.field2844[0] << 25) + (this.field2830[8] << 10) + this.field2830[1];
        } else {
            return class231.method1630(-49, this.field2845).field3146 + 305419896;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 791)
    public final void method1353(int arg0, int arg1, int arg2) {
        field2825++;
        int var4 = class101.field1586[arg0];
        if (this.field2830[var4] == 0 || class132.method945(arg2, (byte) -111) == null) {
            return;
        }
        this.field2830[var4] = class222.method1577(Integer.MIN_VALUE, arg2);
        if (arg1 != 2) {
            method1347(-89, 56, 92, 16, -53, 57, 79, -29, (class253) null, -9, true, -72L);
        }
        this.method1357((byte) -1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ[II[I)V", line = 813)
    public final void method1354(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int[] arg5) {
        field2841++;
        if (this.field2829 != arg4) {
            this.field2834 = (int[][]) null;
            this.field2829 = arg4;
        }
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class32.field463; var8++) {
                    class200 var9 = class132.method945(var8, (byte) -103);
                    if (var9 != null && !var9.field2996 && var9.field2986 == (arg2 ? class223.field3548[var7] : class282.field4360[var7])) {
                        arg5[class101.field1586[var7]] = class222.method1577(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field2830 = arg5;
        this.field2845 = arg0;
        if (arg1 >= -114) {
            this.method1351(39, true, 38);
        }
        this.field2844 = arg3;
        this.field2827 = arg2;
        this.method1357((byte) -1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V", line = 866)
    public final void method1355(int arg0, boolean arg1) {
        this.field2827 = arg1;
        if (arg0 != -390770907) {
            this.method1353(54, -113, -2);
        }
        field2837++;
        this.method1357((byte) -1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIILoh;B)Lwi;", line = 881)
    public final class221 method1356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class281 arg6, byte arg7) {
        field2838++;
        int var9 = -94 % ((52 - arg7) / 61);
        long var10 = (long) arg2 | (long) (arg0 << 16) | (long) arg5 << 32;
        class221 var12 = (class221) class152.field2284.method2179(false, var10);
        if (var12 == null) {
            int var13 = 0;
            class42[] var14 = new class42[3];
            if (!class132.method945(arg2, (byte) -103).method1422(-61) || !class132.method945(arg0, (byte) -119).method1422(-61) || !class132.method945(arg5, (byte) -128).method1422(-61)) {
                return null;
            }
            class42 var15 = class132.method945(arg2, (byte) -103).method1419(-6);
            if (var15 != null) {
                var14[var13++] = var15;
            }
            class42 var16 = class132.method945(arg0, (byte) -121).method1419(-6);
            if (var16 != null) {
                var14[var13++] = var16;
            }
            class42 var17 = class132.method945(arg5, (byte) -115).method1419(-6);
            if (var17 != null) {
                var14[var13++] = var17;
            }
            class42 var18 = new class42(var14, var13);
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2844[var19] < class83.field1302[var19].length) {
                    var18.method353(class46.field761[var19], class83.field1302[var19][this.field2844[var19]]);
                }
                if (class290.field4515[var19].length > this.field2844[var19]) {
                    var18.method353(class130.field2041[var19], class290.field4515[var19][this.field2844[var19]]);
                }
            }
            var12 = var18.method341(64, 768, -50, -10, -50);
            class152.field2284.method2173(var12, true, var10);
        }
        if (arg6 != null) {
            var12 = arg6.method1921(var12, (byte) 89, arg4, arg1, arg3);
        }
        return var12;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 950)
    private final void method1357(byte arg0) {
        field2835++;
        long var2 = this.field2839;
        long[] var4 = class218.field3317;
        this.field2839 = -1L;
        this.field2839 = this.field2839 >>> 8 ^ var4[(int) (((long) (this.field2829 >> 8) ^ this.field2839) & 0xFFL)];
        this.field2839 = var4[(int) ((this.field2839 ^ (long) this.field2829) & 0xFFL)] ^ this.field2839 >>> 8;
        if (arg0 != -1) {
            this.field2834 = (int[][]) ((int[][]) null);
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2839 = var4[(int) ((this.field2839 ^ (long) (this.field2830[var5] >> 24)) & 0xFFL)] ^ this.field2839 >>> 8;
            this.field2839 = this.field2839 >>> 8 ^ var4[(int) ((this.field2839 ^ (long) (this.field2830[var5] >> 16)) & 0xFFL)];
            this.field2839 = var4[(int) ((this.field2839 ^ (long) (this.field2830[var5] >> 8)) & 0xFFL)] ^ this.field2839 >>> 8;
            this.field2839 = this.field2839 >>> 8 ^ var4[(int) ((this.field2839 ^ (long) this.field2830[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2839 = this.field2839 >>> 8 ^ var4[(int) (((long) this.field2844[var6] ^ this.field2839) & 0xFFL)];
        }
        this.field2839 = var4[(int) (((long) (this.field2827 ? 1 : 0) ^ this.field2839) & 0xFFL)] ^ this.field2839 >>> 8;
        if (var2 != 0L && this.field2839 != var2) {
            class73.field1193.method2183(var2, -92);
        }
    }
}
