import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class442 {

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field6345 = -1;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[F")
    public static float[] field6340 = new float[4];

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lud;")
    public static class27 field6351 = new class27(12, 0, 1, 0);

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Ldq;")
    public static class493 field6352 = new class493(106, 6);

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lap;")
    public static class335 field6353 = new class335("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    private int field6347;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "J")
    private long field6334;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "J")
    private long field6349;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lkq;")
    public static class421 field6333;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Z")
    public boolean field6332;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    public int[] field6336;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "[I")
    private int[] field6350;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[[I")
    private int[][] field6339;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 9)
    public static final void method2605(int arg0) {
        int var1 = -48 / ((arg0 - 69) / 53);
        field6335++;
        class505.field7276 = true;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILgq;IILya;ZLeg;Lid;Lvg;ILin;Lhp;)Lt;", line = 21)
    public final class474 method2606(int arg0, class357 arg1, int arg2, int arg3, class38 arg4, boolean arg5, class70 arg6, class415 arg7, class39 arg8, int arg9, class60 arg10, class216 arg11) {
        field6343++;
        if (this.field6345 != -1) {
            return arg11.method1327(this.field6345, (byte) -128).method2899(arg10, arg3, arg4, (byte) 123, arg0, arg9, arg7, arg8, arg2);
        }
        int var13 = arg9;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg7.field5927[arg0];
            var13 = arg9 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class513 var25 = arg10.method551(var23, 23968);
            if (var25 != null) {
                var15 |= var25.method3066(var24, (byte) 35);
                var14 |= var25.method3064(-113, var24);
                var17 |= var25.method3063(-12216, var24);
                var16 |= arg7.field5914;
            }
            if ((arg7.field5916 || class279.field3533) && arg3 != -1 && arg3 < arg7.field5927.length) {
                int var26 = arg7.field5927[arg3];
                int var27 = var26 >>> 16;
                class513 var28 = var23 == var27 ? var25 : arg10.method551(var27, 23968);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method3066(var29, (byte) 35);
                    var14 |= var28.method3064(-116, var29);
                    var17 |= var28.method3063(-12216, var29);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class449 var30 = class363.field4723;
        class474 var31;
        synchronized (class363.field4723) {
            var31 = (class474) class363.field4723.method2647(-103, this.field6334);
        }
        if (var31 == null || arg4.method307(var31.method422(), var13) != 0) {
            if (var31 != null) {
                var13 = arg4.method370(var13, var31.method422());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6350[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg1.method2044(var35 & 0x3FFFFFFF, (byte) -128).method1808((byte) -96)) {
                        var33 = true;
                    }
                } else if (!arg6.method624((byte) -125, var35 & 0x3FFFFFFF).method61(false, this.field6332)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class173[] var36 = new class173[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6350[var38];
                if ((var39 & 0x40000000) != 0) {
                    class173 var41 = arg6.method624((byte) -128, var39 & 0x3FFFFFFF).method62(this.field6332, 57);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class173 var40 = arg1.method2044(var39 & 0x3FFFFFFF, (byte) -116).method1805((byte) 55);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class173 var43 = new class173(var36, var37);
            var31 = arg4.method361(var43, var42, class180.field2387, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field6336[var44] < class343.field4394[var44].length) {
                    var31.method425(class24.field353[var44], class343.field4394[var44][this.field6336[var44]]);
                }
                if (this.field6336[var44] < class102.field1241[var44].length) {
                    var31.method425(class75.field970[var44], class102.field1241[var44][this.field6336[var44]]);
                }
            }
            var31.method442(var13);
            class449 var45 = class363.field4723;
            synchronized (class363.field4723) {
                class363.field4723.method2635(this.field6334, -26591, var31);
            }
        }
        if (arg7 == null) {
            return var31;
        } else {
            var31.method416((byte) 4, var13, arg5);
            return arg7.method2450(arg3, var31, arg2, 1024, arg0, arg9);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[Lce;Lid;ILya;ZILid;ILvg;Lhp;ILa;Lin;Leg;ZLgq;)Lt;", line = 211)
    public final class474 method2607(int arg0, int arg1, int arg2, class203[] arg3, class415 arg4, int arg5, class38 arg6, boolean arg7, int arg8, class415 arg9, int arg10, class39 arg11, class216 arg12, int arg13, class438 arg14, class60 arg15, class70 arg16, boolean arg17, class357 arg18) {
        field6344++;
        if (this.field6345 != -1) {
            return arg12.method1327(this.field6345, (byte) -127).method2904(arg4, arg2, arg6, arg10, arg8, arg15, arg13, arg14, arg1, arg3, arg0, arg5, arg9, -4739, arg11);
        }
        int var20 = arg2;
        long var21 = this.field6334;
        int[] var23 = this.field6350;
        if (arg9 != null && (arg9.field5923 >= 0 || arg9.field5910 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field6350[var24];
            }
            if (arg9.field5923 >= 0) {
                if (arg9.field5923 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class215.method1323(arg9.field5923, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg9.field5910 >= 0) {
                if (arg9.field5910 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class215.method1323(arg9.field5910, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = arg17;
        boolean var28 = arg9 != null || arg4 != null;
        int var29 = arg3 == null ? 0 : arg3.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class470.field6831[var30] = null;
            if (arg3[var30] != null) {
                class415 var31 = arg15.method557(arg3[var30].field2638, 15);
                if (var31.field5927 != null) {
                    var28 = true;
                    class422.field5984[var30] = var31;
                    int var32 = arg3[var30].field2640;
                    int var33 = arg3[var30].field2645;
                    int var34 = var31.field5927[var32];
                    class470.field6831[var30] = arg15.method551(var34 >>> 16, 23968);
                    int var35 = var34 & 0xFFFF;
                    class534.field7860[var30] = var35;
                    if (class470.field6831[var30] != null) {
                        var26 |= class470.field6831[var30].method3066(var35, (byte) 35);
                        var25 |= class470.field6831[var30].method3064(-104, var35);
                        var27 |= class470.field6831[var30].method3063(-12216, var35);
                    }
                    if ((var31.field5916 || class279.field3533) && var33 != -1 && var33 < var31.field5927.length) {
                        class521.field7548[var30] = var31.field5915[var32];
                        class62.field815[var30] = arg3[var30].field2642;
                        int var36 = var31.field5927[var33];
                        class370.field4791[var30] = arg15.method551(var36 >>> 16, 23968);
                        int var37 = var36 & 0xFFFF;
                        class469.field6778[var30] = var37;
                        if (class370.field4791[var30] != null) {
                            var26 |= class370.field4791[var30].method3066(var37, (byte) 35);
                            var25 |= class370.field4791[var30].method3064(-82, var37);
                            var27 |= class370.field4791[var30].method3063(-12216, var37);
                        }
                    } else {
                        class521.field7548[var30] = 0;
                        class62.field815[var30] = 0;
                        class370.field4791[var30] = null;
                        class469.field6778[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class513 var41 = null;
        class513 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class513 var46 = null;
        class513 var47 = null;
        if (var28) {
            var20 = arg2 | 0x20;
            if (arg9 != null) {
                int var48 = arg9.field5927[arg1];
                int var49 = var48 >>> 16;
                var41 = arg15.method551(var49, 23968);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method3066(var38, (byte) 35);
                    var25 |= var41.method3064(-58, var38);
                    var27 |= var41.method3063(-12216, var38);
                }
                if ((arg9.field5916 || class279.field3533) && arg5 != -1 && arg5 < arg9.field5927.length) {
                    int var50 = arg9.field5927[arg5];
                    var40 = arg9.field5915[arg1];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg15.method551(var51, 23968);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method3066(var39, (byte) 35);
                        var25 |= var42.method3064(-61, var39);
                        var27 |= var42.method3063(-12216, var39);
                    }
                }
            }
            if (arg4 != null) {
                int var52 = arg4.field5927[arg10];
                int var53 = var52 >>> 16;
                var46 = arg15.method551(var53, 23968);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method3066(var43, (byte) 35);
                    var25 |= var46.method3064(-75, var43);
                    var27 |= var46.method3063(-12216, var43);
                }
                if ((arg4.field5916 || class279.field3533) && arg0 != -1 && arg0 < arg4.field5927.length) {
                    int var54 = arg4.field5927[arg0];
                    var45 = arg4.field5915[arg10];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg15.method551(var55, 23968);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method3066(var44, (byte) 35);
                        var25 |= var47.method3064(-88, var44);
                        var27 |= var47.method3063(-12216, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class449 var56 = class512.field7423;
        class474 var57;
        synchronized (class512.field7423) {
            var57 = (class474) class512.field7423.method2647(-107, var21);
        }
        class511 var58 = null;
        if (this.field6347 != -1) {
            var58 = arg14.method2573(this.field6347, (byte) 14);
        }
        if (var57 == null || arg6.method307(var57.method422(), var20) != 0 || var58 != null && var58.field7392 != null && this.field6339 == null) {
            if (var57 != null) {
                var20 = arg6.method370(var20, var57.method422());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field6349 != -1L) {
                            class449 var63 = class512.field7423;
                            synchronized (class512.field7423) {
                                var57 = (class474) class512.field7423.method2647(-117, this.field6349);
                            }
                        }
                        if (var57 == null || arg6.method307(var57.method422(), var20) != 0 || var58 != null && var58.field7392 != null && this.field6339 == null) {
                            return null;
                        }
                    } else {
                        class173[] var64 = new class173[12];
                        for (int var65 = 0; var65 < 12; var65++) {
                            int var66 = var23[var65];
                            if ((var66 & 0x40000000) != 0) {
                                class173 var68 = arg16.method624((byte) -122, var66 & 0x3FFFFFFF).method68(this.field6332, (byte) -125);
                                if (var68 != null) {
                                    var64[var65] = var68;
                                }
                            } else if ((var66 & Integer.MIN_VALUE) != 0) {
                                class173 var67 = arg18.method2044(var66 & 0x3FFFFFFF, (byte) -124).method1801(-123);
                                if (var67 != null) {
                                    var64[var65] = var67;
                                }
                            }
                        }
                        if (var58 != null && var58.field7392 != null) {
                            for (int var69 = 0; var69 < var58.field7392.length; var69++) {
                                if (var58.field7392[var69] != null && var64[var69] != null) {
                                    int var70 = var58.field7392[var69][0];
                                    int var71 = var58.field7392[var69][1];
                                    int var72 = var58.field7392[var69][2];
                                    int var73 = var58.field7392[var69][3] << 3;
                                    int var74 = var58.field7392[var69][4] << 3;
                                    int var75 = var58.field7392[var69][5] << 3;
                                    if (this.field6339 == null) {
                                        this.field6339 = new int[var58.field7392.length][];
                                    }
                                    if (this.field6339[var69] == null) {
                                        int[] var76 = this.field6339[var69] = new int[15];
                                        if (var73 == 0 && var74 == 0 && var75 == 0) {
                                            var76[14] = -var72;
                                            var76[0] = var76[4] = var76[8] = 32768;
                                            var76[12] = -var70;
                                            var76[13] = -var71;
                                        } else {
                                            int var77 = class36.field478[var73];
                                            int var78 = class36.field443[var73];
                                            int var79 = class36.field478[var74];
                                            int var80 = class36.field443[var74];
                                            int var81 = class36.field478[var75];
                                            int var82 = class36.field443[var75];
                                            int var83 = var78 * var81 + 16384 >> 15;
                                            int var84 = var78 * var82 + 16384 >> 15;
                                            var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                            var76[8] = var77 * var79 + 16384 >> 15;
                                            var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                            var76[4] = var77 * var81 + 16384 >> 15;
                                            var76[2] = var77 * var80 + 16384 >> 15;
                                            var76[3] = var77 * var82 + 16384 >> 15;
                                            var76[1] = -var82 * var79 + var80 * var83 + 16384 >> 15;
                                            var76[7] = -var80 * -var82 - (-(var79 * var83) - 16384) >> 15;
                                            var76[5] = -var78;
                                            var76[14] = var76[8] * -var72 + var76[5] * -var71 + var76[2] * -var70 + 16384 >> 15;
                                            var76[12] = var76[6] * -var72 + var76[0] * -var70 + (var76[3] * -var71) + 16384 >> 15;
                                            var76[13] = var76[7] * -var72 + var76[4] * -var71 + var76[1] * -var70 + 16384 >> 15;
                                        }
                                        var76[9] = var70;
                                        var76[10] = var71;
                                        var76[11] = var72;
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var64[var69].method1105(var74, var73, var75, (byte) 122);
                                    }
                                    if (var70 != 0 || var71 != 0 || var72 != 0) {
                                        var64[var69].method1112(var72, 0, var70, var71);
                                    }
                                }
                            }
                        }
                        class173 var85 = new class173(var64, var64.length);
                        int var86 = var20 | 0x4000;
                        var57 = arg6.method361(var85, var86, class180.field2387, 64, 850);
                        for (int var87 = 0; var87 < 5; var87++) {
                            if (this.field6336[var87] < class343.field4394[var87].length) {
                                var57.method425(class24.field353[var87], class343.field4394[var87][this.field6336[var87]]);
                            }
                            if (this.field6336[var87] < class102.field1241[var87].length) {
                                var57.method425(class75.field970[var87], class102.field1241[var87][this.field6336[var87]]);
                            }
                        }
                        if (arg7) {
                            var57.method442(var20);
                            class449 var88 = class512.field7423;
                            synchronized (class512.field7423) {
                                class512.field7423.method2635(var21, -26591, var57);
                            }
                            this.field6349 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg18.method2044(var62 & 0x3FFFFFFF, (byte) 113).method1804(true)) {
                        var60 = true;
                    }
                } else if (!arg16.method624((byte) -125, var62 & 0x3FFFFFFF).method70(this.field6332, -32217)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class474 var89 = var57.method416((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class470.field6831[var90] != null) {
                var89.method2858(this.field6339 == null ? null : this.field6339[var90], class534.field7860[var90], false, 125, class370.field4791[var90], class521.field7548[var90], var91, class62.field815[var90] - 1, class470.field6831[var90], 0, class469.field6778[var90]);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method2862((byte) -19, arg9.field5906, var39, var45, false, var40, arg8 - 1, var44, var38, var47, var43, var46, arg13 - 1, var42, var41);
        } else if (var41 != null) {
            var89.method2855(false, var41, arg13 - 1, 65535, var42, var39, 0, var38, var40);
        } else if (var46 != null) {
            var89.method2855(false, var46, arg8 - 1, 65535, var47, var44, 0, var43, var45);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class470.field6831[var92] = null;
            class370.field4791[var92] = null;
            class422.field5984[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V", line = 709)
    public final void method2608(int arg0, boolean arg1) {
        if (arg0 == 17866) {
            this.field6332 = arg1;
            field6346++;
            this.method2615((byte) 121);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lvh;IIIII)V", line = 722)
    public static final void method2609(class242 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3134 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3137[var6] != null) {
                arg0.field3134++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3134; var7++) {
            long var8 = class470.field6828[arg1][arg2][arg3];
            while (var8 != 0L) {
                class177 var14 = class187.field2441[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3137[var7] == var14.field2337) {
                    continue label50;
                }
            }
            long var10 = class470.field6828[arg1][arg4][arg5];
            while (var10 != 0L) {
                class177 var13 = class187.field2441[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3137[var7] == var13.field2337) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3134 - 1; var12++) {
                arg0.field3137[var12] = arg0.field3137[var12 + 1];
            }
            arg0.field3134--;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILgq;IILid;ILya;IIILin;I)Lt;", line = 776)
    public final class474 method2610(int arg0, class357 arg1, int arg2, int arg3, class415 arg4, int arg5, class38 arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11) {
        field6338++;
        int var13 = arg5;
        if (arg8 != 7170) {
            return null;
        }
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg5 | 0x20;
            int var21 = arg4.field5927[arg11];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class513 var25 = arg10.method551(var23, arg8 + 16798);
            if (var25 != null) {
                var15 |= var25.method3066(var24, (byte) 35);
                var14 |= var25.method3064(arg8 ^ 0xFFFFE3C2, var24);
                var17 |= var25.method3063(-12216, var24);
                var16 |= arg4.field5914;
            }
            if ((arg4.field5916 || class279.field3533) && arg2 != -1 && arg2 < arg4.field5927.length) {
                int var26 = arg4.field5927[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class513 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg10.method551(var28 >>> 16, 23968);
                }
                if (var29 != null) {
                    var15 |= var29.method3066(var28, (byte) 35);
                    var14 |= var29.method3064(arg8 - 7232, var28);
                    var17 |= var29.method3063(-12216, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg3 | (long) arg7 << 32 | (long) (arg0 << 16);
        class449 var32 = class363.field4723;
        class474 var33;
        synchronized (class363.field4723) {
            var33 = (class474) class363.field4723.method2647(-104, var30);
        }
        if (var33 == null || arg6.method307(var33.method422(), var13) != 0) {
            if (var33 != null) {
                var13 = arg6.method370(var13, var33.method422());
            }
            class173[] var35 = new class173[3];
            int var36 = 0;
            if (!arg1.method2044(arg3, (byte) -124).method1808((byte) -75) || !arg1.method2044(arg0, (byte) -121).method1808((byte) -50) || !arg1.method2044(arg7, (byte) 82).method1808((byte) -107)) {
                return null;
            }
            class173 var37 = arg1.method2044(arg3, (byte) 108).method1805((byte) 51);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class173 var38 = arg1.method2044(arg0, (byte) -113).method1805((byte) 44);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class173 var39 = arg1.method2044(arg7, (byte) 37).method1805((byte) -74);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class173 var41 = new class173(var35, var36);
            var33 = arg6.method361(var41, var40, class180.field2387, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field6336[var42] < class343.field4394[var42].length) {
                    var33.method425(class24.field353[var42], class343.field4394[var42][this.field6336[var42]]);
                }
                if (class102.field1241[var42].length > this.field6336[var42]) {
                    var33.method425(class75.field970[var42], class102.field1241[var42][this.field6336[var42]]);
                }
            }
            var33.method442(var13);
            class449 var43 = class363.field4723;
            synchronized (class363.field4723) {
                class363.field4723.method2635(var30, -26591, var33);
            }
        }
        if (arg4 == null) {
            return var33;
        } else {
            class474 var44 = var33.method416((byte) 4, var13, true);
            return arg4.method2450(arg2, var44, arg9, 1024, arg11, arg5);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 928)
    public static void method2611(int arg0) {
        field6352 = null;
        field6351 = null;
        field6353 = null;
        if (arg0 != 0) {
            field6340 = null;
        }
        field6333 = null;
        field6340 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 944)
    public final void method2612(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field6340 = null;
        }
        this.field6336[arg0] = arg1;
        field6341++;
        this.method2615((byte) 124);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBIZ[I[I)V", line = 956)
    public final void method2613(int arg0, byte arg1, int arg2, boolean arg3, int[] arg4, int[] arg5) {
        this.field6345 = arg0;
        this.field6332 = arg3;
        this.field6350 = arg5;
        if (arg1 >= -72) {
            this.method2614(-31, -98, null, (byte) 14);
        }
        this.field6336 = arg4;
        if (this.field6347 != arg2) {
            this.field6339 = null;
            this.field6347 = arg2;
        }
        field6342++;
        this.method2615((byte) 123);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILgq;B)V", line = 981)
    public final void method2614(int arg0, int arg1, class357 arg2, byte arg3) {
        field6348++;
        int var5 = class392.field5266[arg1];
        if (this.field6350[var5] == 0 || arg2.method2044(arg0, (byte) 44) == null) {
            return;
        }
        if (arg3 > -102) {
            field6351 = null;
        }
        this.field6350[var5] = class215.method1323(Integer.MIN_VALUE, arg0);
        this.method2615((byte) 123);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 1019)
    private final void method2615(byte arg0) {
        field6337++;
        if (arg0 <= 120) {
            return;
        }
        this.field6334 = -1L;
        long[] var2 = class329.field4158;
        this.field6334 = this.field6334 >>> 8 ^ var2[(int) ((this.field6334 ^ (long) (this.field6347 >> 8)) & 0xFFL)];
        this.field6334 = var2[(int) (((long) this.field6347 ^ this.field6334) & 0xFFL)] ^ this.field6334 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6334 = var2[(int) (((long) (this.field6350[var3] >> 24) ^ this.field6334) & 0xFFL)] ^ this.field6334 >>> 8;
            this.field6334 = var2[(int) (((long) (this.field6350[var3] >> 16) ^ this.field6334) & 0xFFL)] ^ this.field6334 >>> 8;
            this.field6334 = this.field6334 >>> 8 ^ var2[(int) (((long) (this.field6350[var3] >> 8) ^ this.field6334) & 0xFFL)];
            this.field6334 = var2[(int) ((this.field6334 ^ (long) this.field6350[var3]) & 0xFFL)] ^ this.field6334 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6334 = var2[(int) ((this.field6334 ^ (long) this.field6336[var4]) & 0xFFL)] ^ this.field6334 >>> 8;
        }
        this.field6334 = this.field6334 >>> 8 ^ var2[(int) ((this.field6334 ^ (long) (this.field6332 ? 1 : 0)) & 0xFFL)];
    }
}
