import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class194 {

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lid;")
    public static class149 field3470 = class60.method382("Continuer", (byte) 70);

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "[I")
    public static int[] field3487 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "J")
    private long field3478;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "J")
    private long field3483;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Z")
    public boolean field3476;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
    private int[] field3465;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "[I")
    private int[] field3489;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "[[I")
    private int[][] field3488;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V")
    public static final void method1313(int arg0, boolean arg1) {
        if (arg1) {
            field3482++;
            class115.field1957.method1289(arg0, 86);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILek;IZ[Lci;IIZLek;I)Lnd;")
    public final class262 method1314(int arg0, int arg1, class164 arg2, int arg3, boolean arg4, class242[] arg5, int arg6, int arg7, boolean arg8, class164 arg9, int arg10) {
        field3467++;
        if (this.field3474 != -1) {
            return class98.method712(this.field3474, -36).method366(arg5, arg3, arg2, arg6, arg1, arg7, (byte) -90, arg10, arg0, arg9);
        }
        int[] var12 = this.field3465;
        long var13 = this.field3478;
        if (arg2 != null && (arg2.field3063 >= 0 || arg2.field3046 >= 0)) {
            var12 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var12[var15] = this.field3465[var15];
            }
            if (arg2.field3063 >= 0) {
                if (arg2.field3063 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var12[5] = 0;
                } else {
                    var12[5] = class40.method238(1073741824, arg2.field3063);
                    var13 ^= (long) var12[5] << 32;
                }
            }
            if (arg2.field3046 >= 0) {
                if (arg2.field3046 == 65535) {
                    var13 ^= 0xFFFFFFFFL;
                    var12[3] = 0;
                } else {
                    var12[3] = class40.method238(arg2.field3046, 1073741824);
                    var13 ^= (long) var12[3];
                }
            }
        }
        class262 var16 = (class262) class35.field505.method1293(var13, false);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var12[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class125.method878(var43 & 0x3FFFFFFF, 8629).method780(arg4)) {
                        var17 = true;
                    }
                } else if (!class226.method1516(var43 & 0x3FFFFFFF, -28322).method1810(this.field3476, 0)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3483 != -1L) {
                    var16 = (class262) class35.field505.method1293(this.field3483, false);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class241[] var19 = new class241[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var12[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class241 var42 = class226.method1516(var40 & 0x3FFFFFFF, -28322).method1800(false, this.field3476);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class241 var41 = class125.method878(var40 & 0x3FFFFFFF, 8629).method781(71);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    }
                }
                class264 var21 = null;
                if (this.field3472 != -1) {
                    var21 = class68.method418(false, this.field3472);
                }
                if (var21 != null && var21.field4717 != null) {
                    for (int var22 = 0; var22 < var21.field4717.length; var22++) {
                        if (var21.field4717[var22] != null && var19[var22] != null) {
                            int var23 = var21.field4717[var22][0];
                            int var24 = var21.field4717[var22][2];
                            int var25 = var21.field4717[var22][3];
                            int var26 = var21.field4717[var22][4];
                            int var27 = var21.field4717[var22][1];
                            int var28 = var21.field4717[var22][5];
                            if (this.field3488 == null) {
                                this.field3488 = new int[var21.field4717.length][];
                            }
                            if (this.field3488[var22] == null) {
                                int[] var29 = this.field3488[var22] = new int[15];
                                if (var25 == 0 && var26 == 0 && var28 == 0) {
                                    var29[12] = -var23;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var24;
                                    var29[13] = -var27;
                                } else {
                                    int var30 = class235.field4118[var26] >> 1;
                                    int var31 = class235.field4123[var25] >> 1;
                                    int var32 = class235.field4118[var25] >> 1;
                                    int var33 = class235.field4123[var26] >> 1;
                                    int var34 = class235.field4123[var28] >> 1;
                                    int var35 = class235.field4118[var28] >> 1;
                                    var29[2] = var32 * var33 + 16384 >> 15;
                                    var29[8] = var30 * var32 + 16384 >> 15;
                                    int var36 = var31 * var35 + 16384 >> 15;
                                    var29[1] = var33 * var36 + -var34 * var30 + 16384 >> 15;
                                    var29[7] = var30 * var36 + -var33 * -var34 + 16384 >> 15;
                                    var29[3] = var32 * var34 + 16384 >> 15;
                                    int var37 = var31 * var34 + 16384 >> 15;
                                    var29[6] = -var33 * var35 + var30 * var37 + 16384 >> 15;
                                    var29[5] = -var31;
                                    var29[4] = var32 * var35 + 16384 >> 15;
                                    var29[14] = var29[5] * -var27 + (var29[2] * -var23 + (var29[8] * -var24)) + 16384 >> 15;
                                    var29[13] = var29[7] * -var24 + var29[1] * -var23 + var29[4] * -var27 + 16384 >> 15;
                                    var29[0] = var30 * var35 + (var33 * var37) + 16384 >> 15;
                                    var29[12] = var29[0] * -var23 - (-(var29[6] * -var24) - (var29[3] * -var27) - 16384) >> 15;
                                }
                                var29[11] = var24;
                                var29[10] = var27;
                                var29[9] = var23;
                            }
                            if (var25 != 0 || var26 != 0 || var28 != 0) {
                                var19[var22].method1680(var25, var26, var28);
                            }
                            if (var23 != 0 || var27 != 0 || var24 != 0) {
                                var19[var22].method1679(var23, var27, var24);
                            }
                        }
                    }
                }
                class241 var38 = new class241(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (this.field3489[var39] < class116.field1975[var39].length) {
                        var38.method1677(class260.field4579[var39], class116.field1975[var39][this.field3489[var39]]);
                    }
                    if (this.field3489[var39] < class195.field3500[var39].length) {
                        var38.method1677(class174.field3202[var39], class195.field3500[var39][this.field3489[var39]]);
                    }
                }
                var16 = var38.method1668(64, 850, -30, -50, -30);
                if (arg8) {
                    class35.field505.method1295(var13, var16, (byte) -71);
                    this.field3483 = var13;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg5 == null ? 0 : arg5.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg5[var49] != null) {
                class164 var72 = class69.method436(arg5[var49].field4254, -32);
                if (var72.field3035 != null) {
                    var45 = true;
                    class93.field1646[var49] = var72;
                    int var73 = arg5[var49].field4250;
                    int var74 = arg5[var49].field4263;
                    int var75 = var72.field3035[var74];
                    class271.field4866[var49] = class148.method1014(88, var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class23.field341[var49] = var76;
                    if (class271.field4866[var49] != null) {
                        var46 |= class271.field4866[var49].method959(1, var76);
                        var44 |= class271.field4866[var49].method961((byte) -38, var76);
                        var47 |= var72.field3065;
                    }
                    if ((var72.field3057 || class243.field4265) && var73 != -1 && var73 < var72.field3035.length) {
                        class252.field4410[var49] = var72.field3060[var74];
                        class147.field2641[var49] = arg5[var49].field4253;
                        int var77 = var72.field3035[var73];
                        class145.field2623[var49] = class148.method1014(115, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class131.field2381[var49] = var78;
                        if (class145.field2623[var49] != null) {
                            var46 |= class145.field2623[var49].method959(1, var78);
                            var44 |= class145.field2623[var49].method961((byte) 110, var78);
                        }
                    } else {
                        class252.field4410[var49] = 0;
                        class147.field2641[var49] = 0;
                        class145.field2623[var49] = null;
                        class131.field2381[var49] = -1;
                    }
                }
            }
        }
        if (!var45 && arg2 == null && arg9 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = 0;
        int var52 = -1;
        class137 var53 = null;
        class137 var54 = null;
        if (!arg4) {
            method1320(-48, (class149) null);
        }
        if (arg2 != null) {
            int var55 = arg2.field3035[arg3];
            int var56 = var55 >>> 16;
            var53 = class148.method1014(117, var56);
            var50 = var55 & 0xFFFF;
            if (var53 != null) {
                var46 |= var53.method959(1, var50);
                var44 |= var53.method961((byte) -82, var50);
                var47 |= arg2.field3065;
            }
            if ((arg2.field3057 || class243.field4265) && arg1 != -1 && arg1 < arg2.field3035.length) {
                var51 = arg2.field3060[arg3];
                int var57 = arg2.field3035[arg1];
                int var58 = var57 >>> 16;
                var52 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var54 = var53;
                } else {
                    var54 = class148.method1014(120, var52 >>> 16);
                }
                if (var54 != null) {
                    var46 |= var54.method959(1, var52);
                    var44 |= var54.method961((byte) 113, var52);
                }
            }
        }
        class137 var59 = null;
        int var60 = 0;
        int var61 = -1;
        int var62 = -1;
        class137 var63 = null;
        if (arg9 != null) {
            int var64 = arg9.field3035[arg0];
            int var65 = var64 >>> 16;
            var61 = var64 & 0xFFFF;
            var59 = class148.method1014(98, var65);
            if (var59 != null) {
                var46 |= var59.method959(1, var61);
                var44 |= var59.method961((byte) -7, var61);
                var47 |= arg9.field3065;
            }
            if ((arg9.field3057 || class243.field4265) && arg10 != -1 && arg10 < arg9.field3035.length) {
                var60 = arg9.field3060[arg0];
                int var66 = arg9.field3035[arg10];
                int var67 = var66 >>> 16;
                var62 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var63 = var59;
                } else {
                    var63 = class148.method1014(82, var62 >>> 16);
                }
                if (var63 != null) {
                    var46 |= var63.method959(1, var62);
                    var44 |= var63.method961((byte) -120, var62);
                }
            }
        }
        class262 var68 = var16.method846(!var44, !var46, !var47);
        int var69 = 0;
        int var70 = 1;
        while (var48 > var69) {
            if (class271.field4866[var69] != null) {
                var68.method1825(class271.field4866[var69], class23.field341[var69], class145.field2623[var69], class131.field2381[var69], class147.field2641[var69] - 1, class252.field4410[var69], var70, class93.field1646[var69].field3065, this.field3488[var69]);
            }
            var70 <<= 0x1;
            var69++;
        }
        if (var53 != null && var59 != null) {
            var68.method1824(var53, var50, var54, var52, arg7 - 1, var51, var59, var61, var63, var62, arg6 - 1, var60, arg2.field3055, arg9.field3065 | arg2.field3065);
        } else if (var53 != null) {
            var68.method1822(var53, var50, var54, var52, arg7 - 1, var51, arg2.field3065);
        } else if (var59 != null) {
            var68.method1822(var59, var61, var63, var62, arg6 - 1, var60, arg9.field3065);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class271.field4866[var71] = null;
            class145.field2623[var71] = null;
            class93.field1646[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public final void method1315(int arg0, int arg1, int arg2) {
        if (arg0 != 8418) {
            this.field3483 = -13L;
        }
        int var4 = class267.field4759[arg1];
        field3479++;
        if (this.field3465[var4] != 0 && class125.method878(arg2, 8629) != null) {
            this.field3465[var4] = class40.method238(arg2, Integer.MIN_VALUE);
            this.method1321(1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V")
    public final void method1316(int arg0, int arg1, int arg2) {
        field3477++;
        this.field3489[arg1] = arg2;
        this.method1321(arg0);
        if (arg0 != 1) {
            method1322((class259) null, -72, 118, -11, -106, -25);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method1317(int arg0) {
        field3487 = null;
        if (arg0 == 17158) {
            field3470 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z[II[III)V")
    public final void method1318(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field3481++;
        if (this.field3472 != arg2) {
            this.field3488 = null;
            this.field3472 = arg2;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class287.field5094; var8++) {
                    class110 var9 = class125.method878(var8, arg4 + 8638);
                    if (var9 != null && !var9.field1896 && (arg0 ? class180.field3254[var7] : class78.field1462[var7]) == var9.field1914) {
                        arg3[class267.field4759[var7]] = class40.method238(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field3474 = arg5;
        this.field3489 = arg1;
        this.field3465 = arg3;
        this.field3476 = arg0;
        this.method1321(1);
        if (arg4 != -9) {
            this.method1324(-91, -122, (class164) null, -55, -46);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
    public final int method1319(int arg0) {
        if (arg0 != 28544) {
            this.method1314(27, -123, (class164) null, 118, false, (class242[]) null, 30, 1, false, (class164) null, 67);
        }
        field3490++;
        return this.field3474 == -1 ? (this.field3489[0] << 25) + (this.field3465[11] << 5) + (this.field3489[4] << 20) + (this.field3465[0] << 15) + (this.field3465[8] << 10) + this.field3465[1] : class98.method712(this.field3474, arg0 ^ 0x6FFD).field1043 + 305419896;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILid;)Z")
    public static final boolean method1320(int arg0, class149 arg1) {
        field3485++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class16.field229; var2++) {
            if (arg1.method1048(93, class31.field457[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    private final void method1321(int arg0) {
        field3471++;
        long var2 = this.field3478;
        long[] var4 = class59.field1017;
        this.field3478 = -1L;
        if (arg0 != 1) {
            return;
        }
        this.field3478 = this.field3478 >>> 8 ^ var4[(int) (((long) (this.field3472 >> 8) ^ this.field3478) & 0xFFL)];
        this.field3478 = var4[(int) ((this.field3478 ^ (long) this.field3472) & 0xFFL)] ^ this.field3478 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3478 = this.field3478 >>> 8 ^ var4[(int) (((long) (this.field3465[var5] >> 24) ^ this.field3478) & 0xFFL)];
            this.field3478 = this.field3478 >>> 8 ^ var4[(int) (((long) (this.field3465[var5] >> 16) ^ this.field3478) & 0xFFL)];
            this.field3478 = this.field3478 >>> 8 ^ var4[(int) (((long) (this.field3465[var5] >> 8) ^ this.field3478) & 0xFFL)];
            this.field3478 = this.field3478 >>> 8 ^ var4[(int) ((this.field3478 ^ (long) this.field3465[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3478 = this.field3478 >>> 8 ^ var4[(int) (((long) this.field3489[var6] ^ this.field3478) & 0xFFL)];
        }
        this.field3478 = var4[(int) (((long) (this.field3476 ? 1 : 0) ^ this.field3478) & 0xFFL)] ^ this.field3478 >>> 8;
        if (var2 != 0L && this.field3478 != var2) {
            class35.field505.method1288(var2, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lik;IIIII)V")
    public static final void method1322(class259 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3484++;
        if (arg0.field4545 == -1 && arg0.field4522 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg0.field4533) {
            var6 += arg1 - arg0.field4533;
        } else if (arg0.field4534 > arg1) {
            var6 += arg0.field4534 - arg1;
        }
        if (arg0.field4536 < arg3) {
            var6 += arg3 - arg0.field4536;
        } else if (arg3 < arg0.field4544) {
            var6 += arg0.field4544 - arg3;
        }
        if (arg0.field4532 == arg4 || arg0.field4532 < (var6 - 64) || class133.field2432 == 0 || arg0.field4543 != arg5) {
            if (arg0.field4531 != null) {
                class246.field4318.method814(arg0.field4531);
                arg0.field4531 = null;
            }
            if (arg0.field4541 != null) {
                class246.field4318.method814(arg0.field4541);
                arg0.field4541 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg0.field4532 - var6) * class133.field2432 / arg0.field4532;
        if (arg0.field4531 != null) {
            arg0.field4531.method1630(var7);
        } else if (arg0.field4545 >= 0) {
            class4 var8 = class4.method21(class226.field3964, arg0.field4545, 0);
            if (var8 != null) {
                class42 var9 = var8.method19().method244(class167.field3097);
                class238 var10 = class238.method1611(var9, 100, var7);
                var10.method1606(-1);
                class246.field4318.method813(var10);
                arg0.field4531 = var10;
            }
        }
        if (arg0.field4541 != null) {
            arg0.field4541.method1630(var7);
            if (!arg0.field4541.method400((byte) -96)) {
                arg0.field4541 = null;
                return;
            }
            return;
        }
        if (arg0.field4522 == null || (arg0.field4525 -= arg2) > 0) {
            return;
        }
        int var11 = (int) (Math.random() * (double) arg0.field4522.length);
        class4 var12 = class4.method21(class226.field3964, arg0.field4522[var11], 0);
        if (var12 == null) {
            return;
        }
        class42 var13 = var12.method19().method244(class167.field3097);
        class238 var14 = class238.method1611(var13, 100, var7);
        var14.method1606(0);
        class246.field4318.method813(var14);
        arg0.field4541 = var14;
        arg0.field4525 = (int) (Math.random() * (double) (arg0.field4527 - arg0.field4526)) + arg0.field4526;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lek;IIIIIBI)Lnd;")
    public final class262 method1323(class164 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        long var9 = (long) arg5 | (long) (arg4 << 16) | (long) arg2 << 32;
        class262 var11 = (class262) class210.field3743.method1293(var9, false);
        field3469++;
        if (arg6 > -102) {
            this.method1318(false, (int[]) null, 54, (int[]) null, 63, 38);
        }
        if (var11 == null) {
            class241[] var12 = new class241[3];
            int var13 = 0;
            if (!class125.method878(arg5, 8629).method775((byte) -83) || !class125.method878(arg4, 8629).method775((byte) -103) || !class125.method878(arg2, 8629).method775((byte) -98)) {
                return null;
            }
            class241 var14 = class125.method878(arg5, 8629).method774(9961);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class241 var15 = class125.method878(arg4, 8629).method774(9961);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class241 var16 = class125.method878(arg2, 8629).method774(9961);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class241 var17 = new class241(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field3489[var18] < class116.field1975[var18].length) {
                    var17.method1677(class260.field4579[var18], class116.field1975[var18][this.field3489[var18]]);
                }
                if (class195.field3500[var18].length > this.field3489[var18]) {
                    var17.method1677(class174.field3202[var18], class195.field3500[var18][this.field3489[var18]]);
                }
            }
            var11 = var17.method1668(64, 768, -50, -10, -50);
            class210.field3743.method1295(var9, var11, (byte) -71);
        }
        if (arg0 != null) {
            var11 = arg0.method1203(arg3, arg7, var11, -20002, arg1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILek;II)Lnd;")
    public final class262 method1324(int arg0, int arg1, class164 arg2, int arg3, int arg4) {
        field3480++;
        if (this.field3474 != -1) {
            return class98.method712(this.field3474, 123).method369(arg2, arg0, 82, arg3, arg1);
        }
        class262 var6 = (class262) class210.field3743.method1293(this.field3478, false);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field3465[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class125.method878(var17 & 0x3FFFFFFF, 8629).method775((byte) -85)) {
                        var7 = true;
                    }
                } else if (!class226.method1516(var17 & 0x3FFFFFFF, -28322).method1813(-13617, this.field3476)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class241[] var9 = new class241[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field3465[var11];
                if ((var14 & 0x40000000) != 0) {
                    class241 var15 = class226.method1516(var14 & 0x3FFFFFFF, -28322).method1806(this.field3476, 0);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class241 var16 = class125.method878(var14 & 0x3FFFFFFF, 8629).method774(9961);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                }
            }
            class241 var12 = new class241(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field3489[var13] < class116.field1975[var13].length) {
                    var12.method1677(class260.field4579[var13], class116.field1975[var13][this.field3489[var13]]);
                }
                if (this.field3489[var13] < class195.field3500[var13].length) {
                    var12.method1677(class174.field3202[var13], class195.field3500[var13][this.field3489[var13]]);
                }
            }
            var6 = var12.method1668(64, 768, -50, -10, -50);
            class210.field3743.method1295(this.field3478, var6, (byte) -71);
        }
        int var18 = 54 % ((1 - arg4) / 39);
        if (arg2 != null) {
            var6 = arg2.method1203(arg3, arg0, var6, -20002, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZB)V")
    public final void method1325(boolean arg0, byte arg1) {
        field3466++;
        if (arg1 >= -3) {
            field3487 = null;
        }
        this.field3476 = arg0;
        this.method1321(1);
    }
}
