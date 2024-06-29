import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class49 {

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Z")
    public static boolean field711 = false;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    private int field722;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "J")
    private long field708;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "J")
    private long field713;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lpe;")
    public static class252 field719;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
    public boolean field720;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    private int[] field701;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[I")
    public int[] field715;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[[I")
    private int[][] field702;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BII)V")
    public final void method355(byte arg0, int arg1, int arg2) {
        field716++;
        this.field715[arg1] = arg2;
        this.method363(-94);
        if (arg0 <= 59) {
            this.field712 = -90;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method356(int arg0) {
        if (arg0 > -99) {
            method356(35);
        }
        field700++;
        if (class62.field1062 != null) {
            class275 var1 = class62.field1062;
            synchronized (class62.field1062) {
                class62.field1062 = null;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
    public final int method357(int arg0) {
        if (arg0 != 65535) {
            method369((byte) -61, -1, 64, 69, 29, 84, false, -59, -115, -58);
        }
        field718++;
        return this.field712 == -1 ? (this.field701[11] << 5) + (this.field715[0] << 25) + ((this.field701[8] << 10) + (this.field715[4] << 20) + (this.field701[0] << 15) - -this.field701[1]) : class62.method469(this.field712, arg0 ^ 0xFFA9).field990 + 305419896;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)V")
    public final void method358(int arg0, byte arg1, int arg2) {
        field714++;
        int var4 = class176.field2763[arg2];
        if (this.field701[var4] == 0 || class79.method565(arg1 + 130, arg0) == null) {
            return;
        }
        this.field701[var4] = class45.method330(arg0, Integer.MIN_VALUE);
        this.method363(arg1 + 246);
        if (arg1 != -127) {
            this.field701 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILfb;III)Lig;")
    public final class9 method359(int arg0, class30 arg1, int arg2, int arg3, int arg4) {
        field717++;
        if (this.field712 != -1) {
            return class62.method469(this.field712, 76).method448(arg2, arg3, -100, arg4, arg1);
        }
        int var6 = -42 / ((-arg0 - 32) / 34);
        class9 var7 = (class9) class112.field1835.method1887(0, this.field708);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < 12; var9++) {
                int var18 = this.field701[var9];
                if ((var18 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var18) != 0 && !class79.method565(3, var18 & 0x3FFFFFFF).method1441((byte) 112)) {
                        var8 = true;
                    }
                } else if (!class85.method602(false, var18 & 0x3FFFFFFF).method523(this.field720, 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            int var10 = 0;
            class234[] var11 = new class234[12];
            for (int var12 = 0; var12 < 12; var12++) {
                int var15 = this.field701[var12];
                if ((var15 & 0x40000000) != 0) {
                    class234 var17 = class85.method602(false, var15 & 0x3FFFFFFF).method514(0, this.field720);
                    if (var17 != null) {
                        var11[var10++] = var17;
                    }
                } else if ((Integer.MIN_VALUE & var15) != 0) {
                    class234 var16 = class79.method565(3, var15 & 0x3FFFFFFF).method1434(-23973);
                    if (var16 != null) {
                        var11[var10++] = var16;
                    }
                }
            }
            class234 var13 = new class234(var11, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field715[var14] < class114.field1859[var14].length) {
                    var13.method1565(class34.field508[var14], class114.field1859[var14][this.field715[var14]]);
                }
                if (class143.field2170[var14].length > this.field715[var14]) {
                    var13.method1565(class98.field1655[var14], class143.field2170[var14][this.field715[var14]]);
                }
            }
            var7 = var13.method1560(64, 768, -50, -10, -50);
            class112.field1835.method1886(-87, this.field708, var7);
        }
        if (arg1 != null) {
            var7 = arg1.method231(arg3, arg4, var7, arg2, (byte) -8);
        }
        return var7;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([I[IZIBI)V")
    public final void method360(int[] arg0, int[] arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (this.field722 != arg5) {
            this.field702 = null;
            this.field722 = arg5;
        }
        if (arg4 != 98) {
            this.method363(-70);
        }
        field707++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class141.field2148; var8++) {
                    class212 var9 = class79.method565(3, var8);
                    if (var9 != null && !var9.field3282 && var9.field3293 == (arg2 ? class103.field1725[var7] : class148.field2352[var7])) {
                        arg0[class176.field2763[var7]] = class45.method330(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field715 = arg1;
        this.field712 = arg3;
        this.field720 = arg2;
        this.field701 = arg0;
        this.method363(-34);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field706++;
        class29 var13 = new class29();
        var13.field416 = arg10;
        var13.field399 = arg7;
        var13.field414 = arg6;
        if (arg12 > -82) {
            return;
        }
        var13.field405 = arg9;
        var13.field398 = arg1;
        var13.field410 = arg11;
        var13.field417 = arg4;
        var13.field400 = arg3;
        var13.field413 = arg8;
        var13.field402 = arg5;
        var13.field411 = arg2;
        var13.field397 = arg0;
        class87.field1466.method1219(false, var13);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static final void method362(boolean arg0) {
        class33.field494.method1888(114);
        field705++;
        if (!arg0) {
            method356(106);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    private final void method363(int arg0) {
        long var2 = this.field708;
        this.field708 = -1L;
        field723++;
        long[] var4 = class72.field1152;
        this.field708 = this.field708 >>> 8 ^ var4[(int) (((long) (this.field722 >> 8) ^ this.field708) & 0xFFL)];
        this.field708 = this.field708 >>> 8 ^ var4[(int) ((this.field708 ^ (long) this.field722) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field708 = this.field708 >>> 8 ^ var4[(int) ((this.field708 ^ (long) (this.field701[var5] >> 24)) & 0xFFL)];
            this.field708 = var4[(int) (((long) (this.field701[var5] >> 16) ^ this.field708) & 0xFFL)] ^ this.field708 >>> 8;
            this.field708 = this.field708 >>> 8 ^ var4[(int) (((long) (this.field701[var5] >> 8) ^ this.field708) & 0xFFL)];
            this.field708 = var4[(int) (((long) this.field701[var5] ^ this.field708) & 0xFFL)] ^ this.field708 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field708 = this.field708 >>> 8 ^ var4[(int) (((long) this.field715[var6] ^ this.field708) & 0xFFL)];
        }
        int var7 = -95 % ((48 - arg0) / 47);
        this.field708 = var4[(int) ((this.field708 ^ (long) (this.field720 ? 1 : 0)) & 0xFFL)] ^ this.field708 >>> 8;
        if (var2 != 0L && this.field708 != var2) {
            class241.field3922.method1896((byte) -30, var2);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Ljf;ZLfb;BLfb;IIIII)Lig;")
    public final class9 method364(int arg0, class65[] arg1, boolean arg2, class30 arg3, byte arg4, class30 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field709++;
        if (this.field712 != -1) {
            return class62.method469(this.field712, 96).method449(arg3, arg5, arg6, arg0, arg1, arg8, arg9, (byte) 47, arg7, arg10);
        }
        long var12 = this.field708;
        int[] var14 = this.field701;
        if (arg3 != null && (arg3.field428 >= 0 || arg3.field443 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field701[var15];
            }
            if (arg3.field428 >= 0) {
                if (arg3.field428 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class45.method330(arg3.field428, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg3.field443 >= 0) {
                if (arg3.field443 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class45.method330(arg3.field443, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class9 var16 = (class9) class241.field3922.method1887(0, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((var43 & Integer.MIN_VALUE) != 0 && !class79.method565(3, var43 & 0x3FFFFFFF).method1439((byte) 102)) {
                        var17 = true;
                    }
                } else if (!class85.method602(false, var43 & 0x3FFFFFFF).method524(this.field720, -21647)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field713 != -1L) {
                    var16 = (class9) class241.field3922.method1887(0, this.field713);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class234[] var19 = new class234[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class234 var41 = class85.method602(false, var40 & 0x3FFFFFFF).method522(this.field720, (byte) 89);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class234 var42 = class79.method565(3, var40 & 0x3FFFFFFF).method1438(96);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class283 var21 = null;
                if (this.field722 != -1) {
                    var21 = class22.method200(-128, this.field722);
                }
                if (var21 != null && var21.field4474 != null) {
                    for (int var22 = 0; var22 < var21.field4474.length; var22++) {
                        if (var21.field4474[var22] != null && var19[var22] != null) {
                            int var23 = var21.field4474[var22][1];
                            int var24 = var21.field4474[var22][0];
                            int var25 = var21.field4474[var22][2];
                            int var26 = var21.field4474[var22][3];
                            int var27 = var21.field4474[var22][5];
                            int var28 = var21.field4474[var22][4];
                            if (this.field702 == null) {
                                this.field702 = new int[var21.field4474.length][];
                            }
                            if (this.field702[var22] == null) {
                                int[] var29 = this.field702[var22] = new int[15];
                                if (var26 == 0 && var28 == 0 && var27 == 0) {
                                    var29[12] = -var24;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[13] = -var23;
                                    var29[14] = -var25;
                                } else {
                                    int var30 = class195.field3089[var26] >> 1;
                                    int var31 = class195.field3091[var26] >> 1;
                                    int var32 = class195.field3089[var28] >> 1;
                                    int var33 = class195.field3091[var28] >> 1;
                                    int var34 = class195.field3089[var27] >> 1;
                                    int var35 = class195.field3091[var27] >> 1;
                                    int var36 = var31 * var34 + 16384 >> 15;
                                    var29[5] = -var31;
                                    var29[3] = var30 * var35 + 16384 >> 15;
                                    var29[1] = -var35 * var32 + var33 * var36 + 16384 >> 15;
                                    var29[7] = -var33 * -var35 + (var32 * var36) + 16384 >> 15;
                                    var29[8] = var30 * var32 + 16384 >> 15;
                                    int var37 = var31 * var35 + 16384 >> 15;
                                    var29[0] = var32 * var34 + var33 * var37 + 16384 >> 15;
                                    var29[2] = var30 * var33 + 16384 >> 15;
                                    var29[6] = -var33 * var34 + var32 * var37 + 16384 >> 15;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    var29[13] = var29[1] * -var24 - (-(var29[4] * -var23) - (var29[7] * -var25) - 16384) >> 15;
                                    var29[14] = var29[8] * -var25 + var29[5] * -var23 + var29[2] * -var24 + 16384 >> 15;
                                    var29[12] = var29[0] * -var24 + var29[3] * -var23 + var29[6] * -var25 + 16384 >> 15;
                                }
                                var29[11] = var25;
                                var29[10] = var23;
                                var29[9] = var24;
                            }
                            if (var26 != 0 || var28 != 0 || var27 != 0) {
                                var19[var22].method1573(var26, var28, var27);
                            }
                            if (var24 != 0 || var23 != 0 || var25 != 0) {
                                var19[var22].method1586(var24, var23, var25);
                            }
                        }
                    }
                }
                class234 var38 = new class234(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class114.field1859[var39].length > this.field715[var39]) {
                        var38.method1565(class34.field508[var39], class114.field1859[var39][this.field715[var39]]);
                    }
                    if (class143.field2170[var39].length > this.field715[var39]) {
                        var38.method1565(class98.field1655[var39], class143.field2170[var39][this.field715[var39]]);
                    }
                }
                var16 = var38.method1560(64, 850, -30, -50, -30);
                if (arg2) {
                    class241.field3922.method1886(-69, var12, var16);
                    this.field713 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg1 == null ? 0 : arg1.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg1[var49] != null) {
                class30 var73 = class148.method996(-77, arg1[var49].field1094);
                if (var73.field439 != null) {
                    var44 = true;
                    class81.field1373[var49] = var73;
                    int var74 = arg1[var49].field1095;
                    int var75 = var73.field439[var74];
                    int var76 = arg1[var49].field1087;
                    class212.field3286[var49] = class261.method1769(var75 >>> 16, (byte) -50);
                    int var77 = var75 & 0xFFFF;
                    class65.field1096[var49] = var77;
                    if (class212.field3286[var49] != null) {
                        var46 |= class212.field3286[var49].method10(var77, false);
                        var45 |= class212.field3286[var49].method11(var77, (byte) -108);
                        var47 |= var73.field455;
                    }
                    if ((var73.field421 || class240.field3909) && var76 != -1 && var76 < var73.field439.length) {
                        class241.field3924[var49] = var73.field423[var74];
                        class78.field1295[var49] = arg1[var49].field1088;
                        int var78 = var73.field439[var76];
                        class52.field763[var49] = class261.method1769(var78 >>> 16, (byte) 58);
                        int var79 = var78 & 0xFFFF;
                        class33.field503[var49] = var79;
                        if (class52.field763[var49] != null) {
                            var46 |= class52.field763[var49].method10(var79, false);
                            var45 |= class52.field763[var49].method11(var79, (byte) 65);
                        }
                    } else {
                        class241.field3924[var49] = 0;
                        class78.field1295[var49] = 0;
                        class52.field763[var49] = null;
                        class33.field503[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg3 == null && arg5 == null) {
            return var16;
        }
        int var50 = -1;
        class3 var51 = null;
        int var52 = -1;
        int var53 = 0;
        class3 var54 = null;
        if (arg3 != null) {
            int var55 = arg3.field439[arg9];
            int var56 = var55 >>> 16;
            var50 = var55 & 0xFFFF;
            var51 = class261.method1769(var56, (byte) -89);
            if (var51 != null) {
                var46 |= var51.method10(var50, false);
                var45 |= var51.method11(var50, (byte) -122);
                var47 |= arg3.field455;
            }
            if ((arg3.field421 || class240.field3909) && arg7 != -1 && arg3.field439.length > arg7) {
                var53 = arg3.field423[arg9];
                int var57 = arg3.field439[arg7];
                int var58 = var57 >>> 16;
                var52 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var54 = var51;
                } else {
                    var54 = class261.method1769(var52 >>> 16, (byte) 97);
                }
                if (var54 != null) {
                    var46 |= var54.method10(var52, false);
                    var45 |= var54.method11(var52, (byte) 71);
                }
            }
        }
        int var59 = -1;
        int var60 = 0;
        int var61 = -1;
        class3 var62 = null;
        class3 var63 = null;
        if (arg5 != null) {
            int var64 = arg5.field439[arg0];
            int var65 = var64 >>> 16;
            var62 = class261.method1769(var65, (byte) -96);
            var59 = var64 & 0xFFFF;
            if (var62 != null) {
                var46 |= var62.method10(var59, false);
                var45 |= var62.method11(var59, (byte) -113);
                var47 |= arg5.field455;
            }
            if ((arg5.field421 || class240.field3909) && arg10 != -1 && arg10 < arg5.field439.length) {
                int var66 = arg5.field439[arg10];
                int var67 = var66 >>> 16;
                var60 = arg5.field423[arg0];
                var61 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var63 = var62;
                } else {
                    var63 = class261.method1769(var61 >>> 16, (byte) -84);
                }
                if (var63 != null) {
                    var46 |= var63.method10(var61, false);
                    var45 |= var63.method11(var61, (byte) -84);
                }
            }
        }
        class9 var68 = var16.method81(!var45, !var46, !var47);
        int var69 = 0;
        int var70 = 1;
        while (var48 > var69) {
            if (class212.field3286[var69] != null) {
                var68.method97(class212.field3286[var69], class65.field1096[var69], class52.field763[var69], class33.field503[var69], class78.field1295[var69] - 1, class241.field3924[var69], var70, class81.field1373[var69].field455, this.field702[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var51 != null && var62 != null) {
            var68.method86(var51, var50, var54, var52, arg6 - 1, var53, var62, var59, var63, var61, arg8 - 1, var60, arg3.field434, arg5.field455 | arg3.field455);
        } else if (var51 != null) {
            var68.method77(var51, var50, var54, var52, arg6 - 1, var53, arg3.field455);
        } else if (var62 != null) {
            var68.method77(var62, var59, var63, var61, arg8 - 1, var60, arg5.field455);
        }
        int var71 = 0;
        int var72 = -86 % ((arg4 - 50) / 52);
        while (var48 > var71) {
            class212.field3286[var71] = null;
            class52.field763[var71] = null;
            class81.field1373[var71] = null;
            var71++;
        }
        return var68;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BIIII)V")
    public static final void method365(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field704++;
        if (class18.field272 != 0 && arg3 != 0 && class112.field1841 < 50 && arg4 != -1) {
            class122.field1956[class112.field1841] = arg4;
            class131.field2060[class112.field1841] = arg3;
            class165.field2591[class112.field1841] = arg1;
            class250.field4031[class112.field1841] = null;
            class121.field1944[class112.field1841] = 0;
            class296.field4682[class112.field1841] = arg2;
            class112.field1841++;
        }
        int var5 = -71 / ((arg0 - 54) / 34);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method366(int arg0, int arg1) {
        field725++;
        if (arg0 > 119) {
            class41 var2 = class221.method1492((byte) -42, arg1, 8);
            var2.method303(23981);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIILfb;)Lig;")
    public final class9 method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class30 arg7) {
        field721++;
        long var9 = (long) arg3 | (long) arg4 << 32 | (long) (arg1 << 16);
        int var11 = 38 % ((17 - arg2) / 34);
        class9 var12 = (class9) class112.field1835.method1887(0, var9);
        if (var12 == null) {
            class234[] var13 = new class234[3];
            int var14 = 0;
            if (!class79.method565(3, arg3).method1441((byte) 65) || !class79.method565(3, arg1).method1441((byte) 22) || !class79.method565(3, arg4).method1441((byte) 24)) {
                return null;
            }
            class234 var15 = class79.method565(3, arg3).method1434(-23973);
            if (var15 != null) {
                var13[var14++] = var15;
            }
            class234 var16 = class79.method565(3, arg1).method1434(-23973);
            if (var16 != null) {
                var13[var14++] = var16;
            }
            class234 var17 = class79.method565(3, arg4).method1434(-23973);
            if (var17 != null) {
                var13[var14++] = var17;
            }
            class234 var18 = new class234(var13, var14);
            for (int var19 = 0; var19 < 5; var19++) {
                if (class114.field1859[var19].length > this.field715[var19]) {
                    var18.method1565(class34.field508[var19], class114.field1859[var19][this.field715[var19]]);
                }
                if (this.field715[var19] < class143.field2170[var19].length) {
                    var18.method1565(class98.field1655[var19], class143.field2170[var19][this.field715[var19]]);
                }
            }
            var12 = var18.method1560(64, 768, -50, -10, -50);
            class112.field1835.method1886(-89, var9, var12);
        }
        if (arg7 != null) {
            var12 = arg7.method231(arg5, arg6, var12, arg0, (byte) -120);
        }
        return var12;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method368(byte arg0) {
        if (arg0 > 64) {
            field719 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BIIIIIZIII)V")
    public static final void method369(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field726++;
        int var10 = arg9 - arg3;
        int var11 = (arg5 - arg2 << 16) / var10;
        int var12 = arg8 - arg1;
        int var13 = (arg7 - arg4 << 16) / var12;
        if (arg0 <= -104) {
            class218.method1462(arg2, 0, arg3, var11, arg1, arg6, arg9, var13, false, 0, arg4, arg8);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V")
    public final void method370(boolean arg0, int arg1) {
        int var3 = -53 % ((83 - arg1) / 38);
        this.field720 = arg0;
        field710++;
        this.method363(105);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIZ)I")
    public static final int method371(int arg0, int arg1, int arg2, boolean arg3) {
        field703++;
        if (arg1 <= 28) {
            method361(-55, -14, -94, -26, 101, 111, -61, -50, 117, -45, 122, -23, -93);
        }
        class53 var4 = (class53) class291.field4590.method285((long) arg2, 13821);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field800.length; var6++) {
            if (var4.field800[var6] >= 0 && class31.field461 > var4.field800[var6]) {
                class72 var7 = class85.method602(false, var4.field800[var6]);
                if (var7.field1197 != null) {
                    class120 var8 = (class120) var7.field1197.method285((long) arg0, 13821);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field813[var6] * var8.field1932;
                        } else {
                            var5 += var8.field1932;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
