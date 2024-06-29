import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class23 {

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "J")
    public static long field355 = 0L;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "[I")
    public static int[] field364 = new int[100];

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field358 = 1;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "[Z")
    public static boolean[] field367 = new boolean[100];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "J")
    private long field345;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "J")
    private long field359;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Z")
    public boolean field352;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "[I")
    private int[] field347;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[I")
    public int[] field353;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "[[I")
    private int[][] field362;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILpb;IIILpb;ZI[Lsi;II)Lba;")
    public final class279 method151(int arg0, class167 arg1, int arg2, int arg3, int arg4, class167 arg5, boolean arg6, int arg7, class56[] arg8, int arg9, int arg10) {
        field350++;
        if (this.field357 != -1) {
            return class12.method73((byte) 57, this.field357).method1400(arg2, arg8, arg10, true, arg0, arg1, arg3, arg5, arg9, arg7);
        }
        long var12 = this.field359;
        int[] var14 = this.field347;
        if (arg5 != null && (arg5.field2729 >= 0 || arg5.field2737 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field347[var15];
            }
            if (arg5.field2729 >= 0) {
                if (arg5.field2729 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class112.method789(arg5.field2729, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg5.field2737 >= 0) {
                if (arg5.field2737 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class112.method789(1073741824, arg5.field2737);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class279 var16 = (class279) class252.field4130.method57(var12, -109);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class56.method348((byte) 53, var43 & 0x3FFFFFFF).method141(0)) {
                        var17 = true;
                    }
                } else if (!class203.method1346(-1, var43 & 0x3FFFFFFF).method1330(this.field352, (byte) -78)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field345 != -1L) {
                    var16 = (class279) class252.field4130.method57(this.field345, -97);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class221[] var19 = new class221[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class221 var41 = class203.method1346(-1, var40 & 0x3FFFFFFF).method1322(125, this.field352);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class221 var42 = class56.method348((byte) 79, var40 & 0x3FFFFFFF).method139(38);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class37 var21 = null;
                if (this.field349 != -1) {
                    var21 = class142.method993(this.field349, 118);
                }
                if (var21 != null && var21.field522 != null) {
                    for (int var22 = 0; var22 < var21.field522.length; var22++) {
                        if (var21.field522[var22] != null && var19[var22] != null) {
                            int var23 = var21.field522[var22][2];
                            int var24 = var21.field522[var22][0];
                            int var25 = var21.field522[var22][1];
                            int var26 = var21.field522[var22][3];
                            int var27 = var21.field522[var22][4];
                            int var28 = var21.field522[var22][5];
                            if (this.field362 == null) {
                                this.field362 = new int[var21.field522.length][];
                            }
                            if (this.field362[var22] == null) {
                                int[] var29 = this.field362[var22] = new int[15];
                                if (var26 == 0 && var27 == 0 && var28 == 0) {
                                    var29[13] = -var25;
                                    var29[14] = -var23;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[12] = -var24;
                                } else {
                                    int var30 = class287.field4562[var26] >> 1;
                                    int var31 = class287.field4567[var27] >> 1;
                                    int var32 = class287.field4562[var28] >> 1;
                                    int var33 = class287.field4567[var26] >> 1;
                                    int var34 = class287.field4567[var28] >> 1;
                                    int var35 = class287.field4562[var27] >> 1;
                                    var29[2] = var30 * var31 + 16384 >> 15;
                                    int var36 = var32 * var33 + 16384 >> 15;
                                    var29[7] = -var31 * -var34 + var35 * var36 + 16384 >> 15;
                                    var29[3] = var30 * var34 + 16384 >> 15;
                                    var29[8] = var30 * var35 + 16384 >> 15;
                                    var29[1] = var31 * var36 + -var34 * var35 + 16384 >> 15;
                                    var29[5] = -var33;
                                    var29[14] = var29[8] * -var23 + var29[5] * -var25 + var29[2] * -var24 + 16384 >> 15;
                                    var29[4] = var30 * var32 + 16384 >> 15;
                                    var29[13] = var29[1] * -var24 + var29[7] * -var23 + var29[4] * -var25 + 16384 >> 15;
                                    int var37 = var33 * var34 + 16384 >> 15;
                                    var29[0] = var32 * var35 + (var31 * var37) + 16384 >> 15;
                                    var29[6] = -var31 * var32 + var35 * var37 + 16384 >> 15;
                                    var29[12] = var29[0] * -var24 + var29[6] * -var23 + (var29[3] * -var25) + 16384 >> 15;
                                }
                                var29[9] = var24;
                                var29[10] = var25;
                                var29[11] = var23;
                            }
                            if (var26 != 0 || var27 != 0 || var28 != 0) {
                                var19[var22].method1475(var26, var27, var28);
                            }
                            if (var24 != 0 || var25 != 0 || var23 != 0) {
                                var19[var22].method1485(var24, var25, var23);
                            }
                        }
                    }
                }
                class221 var38 = new class221(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class228.field3845[var39].length > this.field353[var39]) {
                        var38.method1465(class215.field3630[var39], class228.field3845[var39][this.field353[var39]]);
                    }
                    if (class30.field452[var39].length > this.field353[var39]) {
                        var38.method1465(class84.field1527[var39], class30.field452[var39][this.field353[var39]]);
                    }
                }
                var16 = var38.method1474(64, 850, -30, -50, -30);
                if (arg6) {
                    class252.field4130.method62(0, var16, var12);
                    this.field345 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg8 == null ? 0 : arg8.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg8[var49] != null) {
                class167 var72 = class105.method714(arg8[var49].field977, (byte) 72);
                if (var72.field2736 != null) {
                    var45 = true;
                    class272.field4369[var49] = var72;
                    int var73 = arg8[var49].field969;
                    int var74 = var72.field2736[var73];
                    int var75 = arg8[var49].field967;
                    class183.field2984[var49] = class89.method579(87, var74 >>> 16);
                    int var76 = var74 & 0xFFFF;
                    class85.field1533[var49] = var76;
                    if (class183.field2984[var49] != null) {
                        var46 |= class183.field2984[var49].method1719(var76, 0);
                        var44 |= class183.field2984[var49].method1718(15693, var76);
                        var47 |= var72.field2750;
                    }
                    if ((var72.field2727 || class261.field4255) && var75 != -1 && var75 < var72.field2736.length) {
                        class286.field4519[var49] = var72.field2751[var73];
                        class6.field84[var49] = arg8[var49].field971;
                        int var77 = var72.field2736[var75];
                        class129.field2266[var49] = class89.method579(87, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class96.field1650[var49] = var78;
                        if (class129.field2266[var49] != null) {
                            var46 |= class129.field2266[var49].method1719(var78, 0);
                            var44 |= class129.field2266[var49].method1718(15693, var78);
                        }
                    } else {
                        class286.field4519[var49] = 0;
                        class6.field84[var49] = 0;
                        class129.field2266[var49] = null;
                        class96.field1650[var49] = -1;
                    }
                }
            }
        }
        if (!var45 && arg5 == null && arg1 == null) {
            return var16;
        }
        if (arg4 <= 119) {
            method163((String) null, (byte) 68);
        }
        int var50 = -1;
        int var51 = -1;
        class259 var52 = null;
        class259 var53 = null;
        int var54 = 0;
        if (arg5 != null) {
            int var55 = arg5.field2736[arg2];
            int var56 = var55 >>> 16;
            var51 = var55 & 0xFFFF;
            var52 = class89.method579(87, var56);
            if (var52 != null) {
                var46 |= var52.method1719(var51, 0);
                var44 |= var52.method1718(15693, var51);
                var47 |= arg5.field2750;
            }
            if ((arg5.field2727 || class261.field4255) && arg0 != -1 && arg0 < arg5.field2736.length) {
                var54 = arg5.field2751[arg2];
                int var57 = arg5.field2736[arg0];
                int var58 = var57 >>> 16;
                var50 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var53 = var52;
                } else {
                    var53 = class89.method579(87, var50 >>> 16);
                }
                if (var53 != null) {
                    var46 |= var53.method1719(var50, 0);
                    var44 |= var53.method1718(15693, var50);
                }
            }
        }
        int var59 = -1;
        class259 var60 = null;
        int var61 = 0;
        int var62 = -1;
        class259 var63 = null;
        if (arg1 != null) {
            int var64 = arg1.field2736[arg9];
            int var65 = var64 >>> 16;
            var60 = class89.method579(87, var65);
            var59 = var64 & 0xFFFF;
            if (var60 != null) {
                var46 |= var60.method1719(var59, 0);
                var44 |= var60.method1718(15693, var59);
                var47 |= arg1.field2750;
            }
            if ((arg1.field2727 || class261.field4255) && arg3 != -1 && arg3 < arg1.field2736.length) {
                var61 = arg1.field2751[arg9];
                int var66 = arg1.field2736[arg3];
                int var67 = var66 >>> 16;
                var62 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var63 = var60;
                } else {
                    var63 = class89.method579(87, var62 >>> 16);
                }
                if (var63 != null) {
                    var46 |= var63.method1719(var62, 0);
                    var44 |= var63.method1718(15693, var62);
                }
            }
        }
        class279 var68 = var16.method121(!var44, !var46, !var47);
        int var69 = 1;
        int var70 = 0;
        while (var70 < var48) {
            if (class183.field2984[var70] != null) {
                var68.method1825(class183.field2984[var70], class85.field1533[var70], class129.field2266[var70], class96.field1650[var70], class6.field84[var70] - 1, class286.field4519[var70], var69, class272.field4369[var70].field2750, this.field362[var70]);
            }
            var70++;
            var69 <<= 0x1;
        }
        if (var52 != null && var60 != null) {
            var68.method1824(var52, var51, var53, var50, arg7 - 1, var54, var60, var59, var63, var62, arg10 - 1, var61, arg5.field2730, arg5.field2750 | arg1.field2750);
        } else if (var52 != null) {
            var68.method1827(var52, var51, var53, var50, arg7 - 1, var54, arg5.field2750);
        } else if (var60 != null) {
            var68.method1827(var60, var59, var63, var62, arg10 - 1, var61, arg1.field2750);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class183.field2984[var71] = null;
            class129.field2266[var71] = null;
            class272.field4369[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)I")
    public static final int method152(int arg0, int arg1, int arg2) {
        if (arg0 > -78) {
            method164((class101) null, false);
        }
        field344++;
        class144 var3 = (class144) class53.field923.method779(127, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field2464.length) {
            return var3.field2464[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
    public final int method153(int arg0) {
        if (arg0 < 74) {
            this.field357 = 102;
        }
        field342++;
        return this.field357 == -1 ? (this.field353[4] << 20) + (this.field347[11] << 5) + (this.field353[0] << 25) + (this.field347[8] << 10) + (this.field347[0] << 15) + this.field347[1] : class12.method73((byte) 57, this.field357).field3500 + 305419896;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIILpb;)Lba;")
    public final class279 method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class167 arg7) {
        if (arg6 != -50) {
            this.method159(48, (byte) 14, -98, (class167) null, 126);
        }
        field356++;
        long var9 = (long) arg2 | (long) (arg1 << 16) | (long) arg3 << 32;
        class279 var11 = (class279) class188.field3047.method57(var9, -87);
        if (var11 == null) {
            class221[] var12 = new class221[3];
            int var13 = 0;
            if (!class56.method348((byte) 63, arg2).method140(-67) || !class56.method348((byte) 100, arg1).method140(-100) || !class56.method348((byte) 60, arg3).method140(-61)) {
                return null;
            }
            class221 var14 = class56.method348((byte) 58, arg2).method135(false);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class221 var15 = class56.method348((byte) 28, arg1).method135(false);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class221 var16 = class56.method348((byte) 104, arg3).method135(false);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class221 var17 = new class221(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field353[var18] < class228.field3845[var18].length) {
                    var17.method1465(class215.field3630[var18], class228.field3845[var18][this.field353[var18]]);
                }
                if (class30.field452[var18].length > this.field353[var18]) {
                    var17.method1465(class84.field1527[var18], class30.field452[var18][this.field353[var18]]);
                }
            }
            var11 = var17.method1474(64, 768, -50, -10, -50);
            class188.field3047.method62(arg6 ^ 0xFFFFFFCE, var11, var9);
        }
        if (arg7 != null) {
            var11 = arg7.method1124(arg5, (byte) -123, arg0, var11, arg4);
        }
        return var11;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V")
    public final void method155(int arg0, int arg1, int arg2) {
        field360++;
        int var4 = class269.field4343[arg1];
        if (this.field347[var4] == 0 || class56.method348((byte) 61, arg2) == null) {
            return;
        }
        this.field347[var4] = class112.method789(Integer.MIN_VALUE, arg2);
        this.method162((byte) 71);
        if (arg0 != 31791) {
            this.field359 = -107L;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(III)V")
    public final void method156(int arg0, int arg1, int arg2) {
        if (arg2 < 100) {
            this.method153(-78);
        }
        this.field353[arg0] = arg1;
        this.method162((byte) 127);
        field351++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIBJI)Ljava/lang/String;")
    public static final String method157(boolean arg0, int arg1, byte arg2, long arg3, int arg4) {
        field343++;
        char var6 = ',';
        char var7 = '.';
        boolean var8 = false;
        if (arg1 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 < 0L) {
            arg3 = -arg3;
            var8 = true;
        }
        if (arg2 >= -90) {
            return null;
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg3 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static void method158(boolean arg0) {
        field364 = null;
        field367 = null;
        if (!arg0) {
            field367 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBILpb;I)Lba;")
    public final class279 method159(int arg0, byte arg1, int arg2, class167 arg3, int arg4) {
        field346++;
        if (this.field357 != -1) {
            return class12.method73((byte) 57, this.field357).method1398(arg3, arg2, 53, arg0, arg4);
        }
        if (arg1 != 17) {
            this.field345 = 18L;
        }
        class279 var6 = (class279) class188.field3047.method57(this.field359, arg1 ^ 0xFFFFFF92);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field347[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class56.method348((byte) 124, var17 & 0x3FFFFFFF).method140(-114)) {
                        var7 = true;
                    }
                } else if (!class203.method1346(-1, var17 & 0x3FFFFFFF).method1318(arg1 - 17, this.field352)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            int var9 = 0;
            class221[] var10 = new class221[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field347[var11];
                if ((var14 & 0x40000000) != 0) {
                    class221 var16 = class203.method1346(-1, var14 & 0x3FFFFFFF).method1334(this.field352, (byte) 127);
                    if (var16 != null) {
                        var10[var9++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class221 var15 = class56.method348((byte) 58, var14 & 0x3FFFFFFF).method135(false);
                    if (var15 != null) {
                        var10[var9++] = var15;
                    }
                }
            }
            class221 var12 = new class221(var10, var9);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field353[var13] < class228.field3845[var13].length) {
                    var12.method1465(class215.field3630[var13], class228.field3845[var13][this.field353[var13]]);
                }
                if (this.field353[var13] < class30.field452[var13].length) {
                    var12.method1465(class84.field1527[var13], class30.field452[var13][this.field353[var13]]);
                }
            }
            var6 = var12.method1474(64, 768, -50, -10, -50);
            class188.field3047.method62(arg1 ^ 0x11, var6, this.field359);
        }
        if (arg3 != null) {
            var6 = arg3.method1124(arg2, (byte) -127, arg4, var6, arg0);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
    public final void method160(int arg0, boolean arg1) {
        field348++;
        int var3 = 94 % ((arg0 - 67) / 43);
        this.field352 = arg1;
        this.method162((byte) 117);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIBZ[II)V")
    public final void method161(int[] arg0, int arg1, byte arg2, boolean arg3, int[] arg4, int arg5) {
        field363++;
        if (arg2 != 124) {
            return;
        }
        if (this.field349 != arg1) {
            this.field362 = null;
            this.field349 = arg1;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class201.field3312; var8++) {
                    class19 var9 = class56.method348((byte) 52, var8);
                    if (var9 != null && !var9.field300 && (arg3 ? class173.field2853[var7] : class272.field4373[var7]) == var9.field310) {
                        arg4[class269.field4343[var7]] = class112.method789(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field357 = arg5;
        this.field352 = arg3;
        this.field353 = arg0;
        this.field347 = arg4;
        this.method162((byte) 114);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    private final void method162(byte arg0) {
        long var2 = this.field359;
        long[] var4 = class166.field2719;
        this.field359 = -1L;
        field366++;
        this.field359 = this.field359 >>> 8 ^ var4[(int) ((this.field359 ^ (long) (this.field349 >> 8)) & 0xFFL)];
        this.field359 = var4[(int) ((this.field359 ^ (long) this.field349) & 0xFFL)] ^ this.field359 >>> 8;
        if (arg0 < 66) {
            return;
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field359 = var4[(int) (((long) (this.field347[var5] >> 24) ^ this.field359) & 0xFFL)] ^ this.field359 >>> 8;
            this.field359 = this.field359 >>> 8 ^ var4[(int) (((long) (this.field347[var5] >> 16) ^ this.field359) & 0xFFL)];
            this.field359 = this.field359 >>> 8 ^ var4[(int) ((this.field359 ^ (long) (this.field347[var5] >> 8)) & 0xFFL)];
            this.field359 = this.field359 >>> 8 ^ var4[(int) ((this.field359 ^ (long) this.field347[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field359 = this.field359 >>> 8 ^ var4[(int) ((this.field359 ^ (long) this.field353[var6]) & 0xFFL)];
        }
        this.field359 = var4[(int) ((this.field359 ^ (long) (this.field352 ? 1 : 0)) & 0xFFL)] ^ this.field359 >>> 8;
        if (var2 != 0L && this.field359 != var2) {
            class252.field4130.method54(true, var2);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method163(String arg0, byte arg1) {
        field365++;
        if (arg1 < 29) {
            method158(true);
        }
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Leh;Z)V")
    public static final void method164(class101 arg0, boolean arg1) {
        field361++;
        if (arg1) {
            return;
        }
        while (true) {
            while (arg0.field1762 < arg0.field1730.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method669((byte) 36) == 1) {
                    var2 = true;
                    var4 = arg0.method669((byte) 36);
                    var3 = arg0.method669((byte) 36);
                }
                int var5 = arg0.method669((byte) 36);
                int var6 = arg0.method669((byte) 36);
                int var7 = var5 * 64 - class124.field2184;
                int var8 = class83.field1514 - (var6 * 64 + -class193.field3114) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class203.field3318 > var7 + 63 && class83.field1514 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var4 * 8) && var11 < (var4 * 8 + 8) && (var3 * 8) <= var12 && var3 * 8 + 8 > var12) {
                                int var13 = arg0.method669((byte) 36);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method669((byte) 36);
                                        if (class259.field4244[var9][var10] == null) {
                                            class259.field4244[var9][var10] = new byte[4096];
                                        }
                                        class259.field4244[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method658(22292);
                                        if (class171.field2810[var9][var10] == null) {
                                            class171.field2810[var9][var10] = new int[4096];
                                        }
                                        class171.field2810[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method658(22292);
                                        if (class30.field447[var9][var10] == null) {
                                            class30.field447[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class206 var17 = class10.method64(64, var16);
                                        if (var17.field3373 != null) {
                                            var17 = var17.method1375((byte) 93);
                                            if (var17 == null || var17.field3393 == -1) {
                                                continue;
                                            }
                                        }
                                        class30.field447[var9][var10][(63 - var12 << 6) + var11] = var17.field3384 + 1;
                                        class25 var18 = new class25();
                                        var18.field385 = var17.field3393;
                                        var18.field389 = var8;
                                        var18.field390 = var7;
                                        class179.field2948.method374(-1, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method669((byte) 36);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field1762++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field1762 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field1762 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(III)Z")
    public static final boolean method165(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class153.field2571; var3++) {
            class158 var4 = class140.field2415[var3];
            if (var4.field2655 == 1) {
                int var5 = var4.field2657 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2641 * var5 >> 8) + var4.field2658;
                    int var7 = (var4.field2646 * var5 >> 8) + var4.field2651;
                    int var8 = (var4.field2643 * var5 >> 8) + var4.field2635;
                    int var9 = (var4.field2654 * var5 >> 8) + var4.field2644;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2655 == 2) {
                int var10 = arg0 - var4.field2657;
                if (var10 > 0) {
                    int var11 = (var4.field2641 * var10 >> 8) + var4.field2658;
                    int var12 = (var4.field2646 * var10 >> 8) + var4.field2651;
                    int var13 = (var4.field2643 * var10 >> 8) + var4.field2635;
                    int var14 = (var4.field2654 * var10 >> 8) + var4.field2644;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2655 == 3) {
                int var15 = var4.field2658 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2645 * var15 >> 8) + var4.field2657;
                    int var17 = (var4.field2632 * var15 >> 8) + var4.field2647;
                    int var18 = (var4.field2643 * var15 >> 8) + var4.field2635;
                    int var19 = (var4.field2654 * var15 >> 8) + var4.field2644;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2655 == 4) {
                int var20 = arg2 - var4.field2658;
                if (var20 > 0) {
                    int var21 = (var4.field2645 * var20 >> 8) + var4.field2657;
                    int var22 = (var4.field2632 * var20 >> 8) + var4.field2647;
                    int var23 = (var4.field2643 * var20 >> 8) + var4.field2635;
                    int var24 = (var4.field2654 * var20 >> 8) + var4.field2644;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2655 == 5) {
                int var25 = arg1 - var4.field2635;
                if (var25 > 0) {
                    int var26 = (var4.field2645 * var25 >> 8) + var4.field2657;
                    int var27 = (var4.field2632 * var25 >> 8) + var4.field2647;
                    int var28 = (var4.field2641 * var25 >> 8) + var4.field2658;
                    int var29 = (var4.field2646 * var25 >> 8) + var4.field2651;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
