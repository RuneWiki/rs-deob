import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class49 {

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lqk;")
    public static class207 field961 = class24.method212(255, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Lqk;")
    public static class207 field969 = null;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Lqk;")
    public static class207 field973 = class24.method212(255, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "J")
    private long field954;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "J")
    private long field972;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Z")
    public boolean field974;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "[I")
    private int[] field957;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "[I")
    private int[] field958;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "[[I")
    private int[][] field962;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    private final void method363(int arg0) {
        field960++;
        long[] var2 = class116.field2011;
        long var3 = this.field972;
        this.field972 = -1L;
        this.field972 = this.field972 >>> 8 ^ var2[(int) ((this.field972 ^ (long) (this.field965 >> 8)) & 0xFFL)];
        this.field972 = var2[(int) ((this.field972 ^ (long) this.field965) & 0xFFL)] ^ this.field972 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field972 = var2[(int) (((long) (this.field958[var5] >> 24) ^ this.field972) & 0xFFL)] ^ this.field972 >>> 8;
            this.field972 = var2[(int) ((this.field972 ^ (long) (this.field958[var5] >> 16)) & 0xFFL)] ^ this.field972 >>> 8;
            this.field972 = this.field972 >>> 8 ^ var2[(int) ((this.field972 ^ (long) (this.field958[var5] >> 8)) & 0xFFL)];
            this.field972 = var2[(int) (((long) this.field958[var5] ^ this.field972) & 0xFFL)] ^ this.field972 >>> 8;
        }
        if (arg0 > -31) {
            this.method368(27, -53, -61, (byte) 87, 60, 62, 75, (class65) null);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field972 = this.field972 >>> 8 ^ var2[(int) ((this.field972 ^ (long) this.field957[var6]) & 0xFFL)];
        }
        this.field972 = var2[(int) ((this.field972 ^ (long) (this.field974 ? 1 : 0)) & 0xFFL)] ^ this.field972 >>> 8;
        if (var3 != 0L && this.field972 != var3) {
            class282.field4958.method1378(19666, var3);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    public final void method364(int arg0, int arg1, int arg2) {
        field976++;
        if (arg1 > 57) {
            this.field957[arg2] = arg0;
            this.method363(-73);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[I[IZI)V")
    public final void method365(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4, int arg5) {
        field970++;
        if (this.field965 != arg0) {
            this.field965 = arg0;
            this.field962 = null;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class12.field171; var8++) {
                    class43 var9 = class100.method738(false, var8);
                    if (var9 != null && !var9.field851 && (arg4 ? class192.field3390[var7] : class159.field2812[var7]) == var9.field842) {
                        arg3[class249.field4516[var7]] = class281.method1906(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        int var10 = 71 / ((-arg1 - 67) / 59);
        this.field974 = arg4;
        this.field958 = arg3;
        this.field957 = arg2;
        this.field966 = arg5;
        this.method363(-87);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZLri;I[Lmc;IIIILri;)Lba;")
    public final class166 method366(int arg0, int arg1, boolean arg2, class65 arg3, int arg4, class195[] arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
        field959++;
        if (this.field966 != -1) {
            return class212.method1513(this.field966, (byte) 10).method519((byte) -104, arg7, arg8, arg0, arg5, arg4, arg6, arg1, arg3, arg10);
        }
        long var12 = this.field972;
        int[] var14 = this.field958;
        if (arg10 != null && (arg10.field1156 >= 0 || arg10.field1173 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field958[var15];
            }
            if (arg10.field1156 >= 0) {
                if (arg10.field1156 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class281.method1906(1073741824, arg10.field1156);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg10.field1173 >= 0) {
                if (arg10.field1173 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class281.method1906(1073741824, arg10.field1173);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class166 var16 = (class166) class282.field4958.method1387(var12, 120);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((var43 & Integer.MIN_VALUE) != 0 && !class100.method738(false, var43 & 0x3FFFFFFF).method329(arg9 ^ 0xF3EBCCB6)) {
                        var17 = true;
                    }
                } else if (!class117.method829(var43 & 0x3FFFFFFF, (byte) 64).method1235(true, this.field974)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field954 != -1L) {
                    var16 = (class166) class282.field4958.method1387(this.field954, 123);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class210[] var19 = new class210[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class210 var41 = class117.method829(var40 & 0x3FFFFFFF, (byte) 115).method1232(this.field974, 0);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class210 var42 = class100.method738(false, var40 & 0x3FFFFFFF).method330(arg9 - 202668016);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class200 var21 = null;
                if (this.field965 != -1) {
                    var21 = class281.method1907(true, this.field965);
                }
                if (var21 != null && var21.field3516 != null) {
                    for (int var22 = 0; var22 < var21.field3516.length; var22++) {
                        if (var21.field3516[var22] != null && var19[var22] != null) {
                            int var23 = var21.field3516[var22][1];
                            int var24 = var21.field3516[var22][0];
                            int var25 = var21.field3516[var22][2];
                            int var26 = var21.field3516[var22][4];
                            int var27 = var21.field3516[var22][3];
                            int var28 = var21.field3516[var22][5];
                            if (this.field962 == null) {
                                this.field962 = new int[var21.field3516.length][];
                            }
                            if (this.field962[var22] == null) {
                                int[] var29 = this.field962[var22] = new int[15];
                                if (var27 == 0 && var26 == 0 && var28 == 0) {
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[12] = -var24;
                                    var29[14] = -var25;
                                    var29[13] = -var23;
                                } else {
                                    int var30 = class257.field4597[var27] >> 1;
                                    int var31 = class257.field4598[var27] >> 1;
                                    int var32 = class257.field4598[var26] >> 1;
                                    int var33 = class257.field4597[var26] >> 1;
                                    int var34 = class257.field4598[var28] >> 1;
                                    int var35 = class257.field4597[var28] >> 1;
                                    var29[4] = var30 * var35 + 16384 >> 15;
                                    var29[5] = -var31;
                                    int var36 = var31 * var35 + 16384 >> 15;
                                    var29[7] = var33 * var36 + (-var32 * -var34 + 16384) >> 15;
                                    var29[3] = var30 * var34 + 16384 >> 15;
                                    int var37 = var31 * var34 + 16384 >> 15;
                                    var29[8] = var30 * var33 + 16384 >> 15;
                                    var29[1] = -var34 * var33 + var32 * var36 + 16384 >> 15;
                                    var29[6] = -var32 * var35 + (var33 * var37 + 16384) >> 15;
                                    var29[0] = var32 * var37 + var33 * var35 + 16384 >> 15;
                                    var29[12] = var29[3] * -var23 + var29[0] * -var24 + (var29[6] * -var25) + 16384 >> 15;
                                    var29[2] = var30 * var32 + 16384 >> 15;
                                    var29[13] = var29[7] * -var25 + var29[1] * -var24 + var29[4] * -var23 + 16384 >> 15;
                                    var29[14] = var29[8] * -var25 + var29[2] * -var24 + var29[5] * -var23 + 16384 >> 15;
                                }
                                var29[11] = var25;
                                var29[10] = var23;
                                var29[9] = var24;
                            }
                            if (var27 != 0 || var26 != 0 || var28 != 0) {
                                var19[var22].method1487(var27, var26, var28);
                            }
                            if (var24 != 0 || var23 != 0 || var25 != 0) {
                                var19[var22].method1484(var24, var23, var25);
                            }
                        }
                    }
                }
                class210 var38 = new class210(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class106.field1887[var39].length > this.field957[var39]) {
                        var38.method1485(class98.field1739[var39], class106.field1887[var39][this.field957[var39]]);
                    }
                    if (class81.field1477[var39].length > this.field957[var39]) {
                        var38.method1485(class161.field2855[var39], class81.field1477[var39][this.field957[var39]]);
                    }
                }
                var16 = var38.method1498(64, 850, -30, -50, -30);
                if (arg2) {
                    class282.field4958.method1385(var12, var16, (byte) -126);
                    this.field954 = var12;
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
                class65 var72 = class16.method101((byte) 70, arg5[var49].field3424);
                if (var72.field1180 != null) {
                    class204.field3588[var49] = var72;
                    var44 = true;
                    int var73 = arg5[var49].field3429;
                    int var74 = arg5[var49].field3421;
                    int var75 = var72.field1180[var74];
                    class245.field4440[var49] = class83.method620((byte) -84, var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class68.field1218[var49] = var76;
                    if (class245.field4440[var49] != null) {
                        var46 |= class245.field4440[var49].method1956(var76, -88);
                        var45 |= class245.field4440[var49].method1959((byte) -48, var76);
                        var47 |= var72.field1151;
                    }
                    if ((var72.field1160 || class99.field1762) && var73 != -1 && var72.field1180.length > var73) {
                        class128.field2222[var49] = var72.field1150[var74];
                        class47.field944[var49] = arg5[var49].field3433;
                        int var77 = var72.field1180[var73];
                        class187.field3310[var49] = class83.method620((byte) -84, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        client.field2676[var49] = var78;
                        if (class187.field3310[var49] != null) {
                            var46 |= class187.field3310[var49].method1956(var78, -75);
                            var45 |= class187.field3310[var49].method1959((byte) -48, var78);
                        }
                    } else {
                        class128.field2222[var49] = 0;
                        class47.field944[var49] = 0;
                        class187.field3310[var49] = null;
                        client.field2676[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg10 == null && arg3 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        if (arg9 != 202667960) {
            return null;
        }
        class287 var52 = null;
        int var53 = 0;
        class287 var54 = null;
        if (arg10 != null) {
            int var55 = arg10.field1180[arg7];
            int var56 = var55 >>> 16;
            var54 = class83.method620((byte) -84, var56);
            var50 = var55 & 0xFFFF;
            if (var54 != null) {
                var46 |= var54.method1956(var50, -79);
                var45 |= var54.method1959((byte) -48, var50);
                var47 |= arg10.field1151;
            }
            if ((arg10.field1160 || class99.field1762) && arg1 != -1 && arg10.field1180.length > arg1) {
                int var57 = arg10.field1180[arg1];
                var53 = arg10.field1150[arg7];
                int var58 = var57 >>> 16;
                var51 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var52 = var54;
                } else {
                    var52 = class83.method620((byte) -84, var51 >>> 16);
                }
                if (var52 != null) {
                    var46 |= var52.method1956(var51, arg9 - 202668050);
                    var45 |= var52.method1959((byte) -48, var51);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        int var61 = 0;
        class287 var62 = null;
        class287 var63 = null;
        if (arg3 != null) {
            int var64 = arg3.field1180[arg4];
            int var65 = var64 >>> 16;
            var63 = class83.method620((byte) -84, var65);
            var59 = var64 & 0xFFFF;
            if (var63 != null) {
                var46 |= var63.method1956(var59, -125);
                var45 |= var63.method1959((byte) -48, var59);
                var47 |= arg3.field1151;
            }
            if ((arg3.field1160 || class99.field1762) && arg8 != -1 && arg3.field1180.length > arg8) {
                int var66 = arg3.field1180[arg8];
                int var67 = var66 >>> 16;
                var61 = arg3.field1150[arg4];
                var60 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var62 = var63;
                } else {
                    var62 = class83.method620((byte) -84, var60 >>> 16);
                }
                if (var62 != null) {
                    var46 |= var62.method1956(var60, -105);
                    var45 |= var62.method1959((byte) -48, var60);
                }
            }
        }
        class166 var68 = var16.method275(!var45, !var46, !var47);
        int var69 = 0;
        int var70 = 1;
        while (var48 > var69) {
            if (class245.field4440[var69] != null) {
                var68.method1202(class245.field4440[var69], class68.field1218[var69], class187.field3310[var69], client.field2676[var69], class47.field944[var69] - 1, class128.field2222[var69], var70, class204.field3588[var69].field1151, this.field962[var69]);
            }
            var70 <<= 0x1;
            var69++;
        }
        if (var54 != null && var63 != null) {
            var68.method1201(var54, var50, var52, var51, arg6 - 1, var53, var63, var59, var62, var60, arg0 - 1, var61, arg10.field1154, arg3.field1151 | arg10.field1151);
        } else if (var54 != null) {
            var68.method1199(var54, var50, var52, var51, arg6 - 1, var53, arg10.field1151);
        } else if (var63 != null) {
            var68.method1199(var63, var59, var62, var60, arg0 - 1, var61, arg3.field1151);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class245.field4440[var71] = null;
            class187.field3310[var71] = null;
            class204.field3588[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BZ)V")
    public final void method367(byte arg0, boolean arg1) {
        field975++;
        if (arg0 == -92) {
            this.field974 = arg1;
            this.method363(arg0 ^ 0x61);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBIIILri;)Lba;")
    public final class166 method368(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class65 arg7) {
        field956++;
        long var9 = (long) arg4 << 32 | (long) (arg0 << 16) | (long) arg1;
        class166 var11 = (class166) class182.field3245.method1387(var9, 123);
        if (var11 == null) {
            class210[] var12 = new class210[3];
            int var13 = 0;
            if (!class100.method738(false, arg1).method328(120) || !class100.method738(false, arg0).method328(124) || !class100.method738(false, arg4).method328(125)) {
                return null;
            }
            class210 var14 = class100.method738(false, arg1).method327((byte) -80);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class210 var15 = class100.method738(false, arg0).method327((byte) -80);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class210 var16 = class100.method738(false, arg4).method327((byte) -80);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class210 var17 = new class210(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field957[var18] < class106.field1887[var18].length) {
                    var17.method1485(class98.field1739[var18], class106.field1887[var18][this.field957[var18]]);
                }
                if (class81.field1477[var18].length > this.field957[var18]) {
                    var17.method1485(class161.field2855[var18], class81.field1477[var18][this.field957[var18]]);
                }
            }
            var11 = var17.method1498(64, 768, -50, -10, -50);
            class182.field3245.method1385(var9, var11, (byte) -123);
        }
        if (arg7 != null) {
            var11 = arg7.method467(arg2, arg6, true, arg5, var11);
        }
        if (arg3 <= 67) {
            this.field962 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILri;I)Lba;")
    public final class166 method369(int arg0, int arg1, int arg2, class65 arg3, int arg4) {
        field971++;
        if (~this.field966 != arg2) {
            return class212.method1513(this.field966, (byte) 10).method522(arg1, arg2, arg4, arg0, arg3);
        }
        class166 var6 = (class166) class182.field3245.method1387(this.field972, 121);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field958[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class100.method738(false, var17 & 0x3FFFFFFF).method328(125)) {
                        var7 = true;
                    }
                } else if (!class117.method829(var17 & 0x3FFFFFFF, (byte) 110).method1247(-1, this.field974)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class210[] var9 = new class210[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field958[var11];
                if ((var14 & 0x40000000) != 0) {
                    class210 var16 = class117.method829(var14 & 0x3FFFFFFF, (byte) 72).method1236(true, this.field974);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class210 var15 = class100.method738(false, var14 & 0x3FFFFFFF).method327((byte) -80);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                }
            }
            class210 var12 = new class210(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (class106.field1887[var13].length > this.field957[var13]) {
                    var12.method1485(class98.field1739[var13], class106.field1887[var13][this.field957[var13]]);
                }
                if (class81.field1477[var13].length > this.field957[var13]) {
                    var12.method1485(class161.field2855[var13], class81.field1477[var13][this.field957[var13]]);
                }
            }
            var6 = var12.method1498(64, 768, -50, -10, -50);
            class182.field3245.method1385(this.field972, var6, (byte) -125);
        }
        if (arg3 != null) {
            var6 = arg3.method467(arg1, arg4, true, arg0, var6);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)V")
    public final void method370(int arg0, int arg1, int arg2) {
        field953++;
        int var4 = class249.field4516[arg2];
        if (this.field958[var4] == 0 || class100.method738(false, arg0) == null) {
            return;
        }
        this.field958[var4] = class281.method1906(Integer.MIN_VALUE, arg0);
        this.method363(-98);
        if (arg1 != 0) {
            field973 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)I")
    public final int method371(int arg0) {
        field964++;
        if (arg0 != 305419896) {
            this.method368(-33, -102, -102, (byte) -47, -31, -41, -91, (class65) null);
        }
        return this.field966 == -1 ? (this.field957[0] << 25) + (this.field958[11] << 5) + (this.field958[8] << 10) - (-(this.field957[4] << 20) - (this.field958[0] << 15) - this.field958[1]) : 305419896 - -class212.method1513(this.field966, (byte) 10).field1336;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILmd;IIIII)V")
    public static final void method372(int arg0, int arg1, class220 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class32.field648) {
            class266.field4720 = 32;
        } else {
            class266.field4720 = 0;
        }
        field963++;
        class32.field648 = false;
        if (class247.field4479 != arg7) {
            if (arg6 >= arg5 && arg5 + 16 > arg6 && arg3 >= arg0 && (arg0 + 16) > arg3) {
                arg2.field4059 -= 4;
                class82.method614((byte) 58, arg2);
            } else if (arg6 >= arg5 && arg5 + 16 > arg6 && arg3 >= (arg1 + arg0 - 16) && arg0 + arg1 > arg3) {
                arg2.field4059 += 4;
                class82.method614((byte) 124, arg2);
            } else if (arg6 >= (arg5 - class266.field4720) && arg6 < (arg5 + class266.field4720 + 16) && (arg0 + 16) <= arg3 && arg3 < arg0 + arg1 - 16) {
                int var8 = (arg1 - 32) * arg1 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - (var8 / 2) - arg0 - 16;
                int var10 = arg1 - var8 - 32;
                arg2.field4059 = (arg4 - arg1) * var9 / var10;
                class82.method614((byte) 108, arg2);
                class32.field648 = true;
            }
        }
        if (class249.field4514 == 0) {
            return;
        }
        int var11 = arg2.field4037;
        if ((arg5 - var11) <= arg6 && arg0 <= arg3 && arg5 + 16 > arg6 && arg3 <= (arg0 + arg1)) {
            arg2.field4059 += class249.field4514 * 45;
            class82.method614((byte) 116, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public static void method373(int arg0) {
        field969 = null;
        if (arg0 != -10877) {
            method373(-16);
        }
        field961 = null;
        field973 = null;
    }
}
