import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class134 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2110 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2119 = "slide:";

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field2122 = 0;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[Lfk;")
    public static class262[] field2111 = new class262[8];

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field2128 = -1;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    private int field2114;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "J")
    private long field2130;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "J")
    private long field2131;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lra;")
    public static class38 field2121;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Z")
    public boolean field2116;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
    public int[] field2109;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    private int[] field2112;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "[[I")
    private int[][] field2132;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
    public static final int method900(int arg0, int arg1, int arg2) {
        if (arg1 < 52) {
            return -93;
        } else {
            int var3 = arg2 >> 31 & arg0 - 1;
            field2127++;
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIILq;II)Lwl;")
    public final class158 method901(int arg0, int arg1, int arg2, int arg3, int arg4, class165 arg5, int arg6, int arg7) {
        if (arg3 > -29) {
            this.method908((int[]) null, 69, false, -8, (int[]) null, false);
        }
        long var9 = (long) arg1 | (long) (arg4 << 16) | (long) arg2 << 32;
        class158 var11 = (class158) class123.field1915.method1693(var9, 124);
        field2126++;
        if (var11 == null) {
            class205[] var12 = new class205[3];
            int var13 = 0;
            if (!class17.method92(arg1, 570591392).method1257((byte) -21) || !class17.method92(arg4, 570591392).method1257((byte) -84) || !class17.method92(arg2, 570591392).method1257((byte) -9)) {
                return null;
            }
            class205 var14 = class17.method92(arg1, 570591392).method1251((byte) -18);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class205 var15 = class17.method92(arg4, 570591392).method1251((byte) -18);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class205 var16 = class17.method92(arg2, 570591392).method1251((byte) -18);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class205 var17 = new class205(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class201.field3186[var18].length > this.field2109[var18]) {
                    var17.method1438(class17.field206[var18], class201.field3186[var18][this.field2109[var18]]);
                }
                if (class184.field2950[var18].length > this.field2109[var18]) {
                    var17.method1438(class201.field3176[var18], class184.field2950[var18][this.field2109[var18]]);
                }
            }
            var11 = var17.method1421(64, 768, -50, -10, -50);
            class123.field1915.method1694(true, var9, var11);
        }
        if (arg5 != null) {
            var11 = arg5.method1147(arg7, arg6, false, var11, arg0);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method902(int arg0) {
        field2110 = null;
        field2121 = null;
        field2119 = null;
        field2111 = null;
        if (arg0 != -1) {
            method907(-125, 20, 60, 17, -32, 37, -69, 28);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V")
    public final void method903(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field2121 = null;
        }
        field2108++;
        this.field2116 = arg0;
        this.method906(12);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
    public final int method904(byte arg0) {
        int var2 = 5 / ((-arg0 - 53) / 59);
        field2125++;
        return this.field2118 == -1 ? (this.field2112[8] << 10) + (this.field2112[0] << 15) + (this.field2109[4] << 20) + (this.field2109[0] << 25) - (-(this.field2112[11] << 5) + -this.field2112[1]) : class130.method888(0, this.field2118).field3028 + 305419896;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V")
    public final void method905(int arg0, int arg1, byte arg2) {
        field2113++;
        int var4 = class276.field4406[arg1];
        if (this.field2112[var4] != 0 && arg2 < -120 && class17.method92(arg0, 570591392) != null) {
            this.field2112[var4] = class154.method1048(arg0, Integer.MIN_VALUE);
            this.method906(12);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    private final void method906(int arg0) {
        field2115++;
        long var2 = this.field2131;
        this.field2131 = -1L;
        long[] var4 = class252.field4111;
        this.field2131 = this.field2131 >>> 8 ^ var4[(int) (((long) (this.field2114 >> 8) ^ this.field2131) & 0xFFL)];
        this.field2131 = var4[(int) ((this.field2131 ^ (long) this.field2114) & 0xFFL)] ^ this.field2131 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2131 = var4[(int) ((this.field2131 ^ (long) (this.field2112[var5] >> 24)) & 0xFFL)] ^ this.field2131 >>> 8;
            this.field2131 = var4[(int) ((this.field2131 ^ (long) (this.field2112[var5] >> 16)) & 0xFFL)] ^ this.field2131 >>> 8;
            this.field2131 = this.field2131 >>> 8 ^ var4[(int) ((this.field2131 ^ (long) (this.field2112[var5] >> 8)) & 0xFFL)];
            this.field2131 = var4[(int) (((long) this.field2112[var5] ^ this.field2131) & 0xFFL)] ^ this.field2131 >>> 8;
        }
        int var6 = 0;
        if (arg0 != 12) {
            this.method901(70, 77, 115, 64, -42, (class165) null, -60, -49);
        }
        while (var6 < 5) {
            this.field2131 = var4[(int) ((this.field2131 ^ (long) this.field2109[var6]) & 0xFFL)] ^ this.field2131 >>> 8;
            var6++;
        }
        this.field2131 = this.field2131 >>> 8 ^ var4[(int) (((long) (this.field2116 ? 1 : 0) ^ this.field2131) & 0xFFL)];
        if (var2 != 0L && this.field2131 != var2) {
            class116.field1648.method1702(7, var2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2123++;
        if (class210.method1477((byte) 94, arg6)) {
            client.method730(class75.field937[arg6], arg5, arg4, arg2, arg1, arg0, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([IIZI[IZ)V")
    public final void method908(int[] arg0, int arg1, boolean arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg2) {
            return;
        }
        field2107++;
        if (this.field2114 != arg1) {
            this.field2114 = arg1;
            this.field2132 = null;
        }
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class20.field261; var8++) {
                    class180 var9 = class17.method92(var8, 570591392);
                    if (var9 != null && !var9.field2868 && var9.field2863 == (arg5 ? class280.field4440[var7] : class9.field105[var7])) {
                        arg0[class276.field4406[var7]] = class154.method1048(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field2109 = arg4;
        this.field2112 = arg0;
        this.field2118 = arg3;
        this.field2116 = arg5;
        this.method906(12);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
    public final void method909(int arg0, int arg1, int arg2) {
        this.field2109[arg1] = arg0;
        if (arg2 == -31773) {
            field2124++;
            this.method906(12);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILq;II)Lwl;")
    public final class158 method910(int arg0, int arg1, class165 arg2, int arg3, int arg4) {
        field2129++;
        if (this.field2118 != -1) {
            return class130.method888(0, this.field2118).method1308(arg0, arg4, arg2, 114, arg3);
        }
        int var6 = 56 % ((arg1 + 32) / 37);
        class158 var7 = (class158) class123.field1915.method1693(this.field2131, 97);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < 12; var9++) {
                int var18 = this.field2112[var9];
                if ((var18 & 0x40000000) == 0) {
                    if ((var18 & Integer.MIN_VALUE) != 0 && !class17.method92(var18 & 0x3FFFFFFF, 570591392).method1257((byte) 117)) {
                        var8 = true;
                    }
                } else if (!class256.method1753(-2, var18 & 0x3FFFFFFF).method658(this.field2116, 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            int var10 = 0;
            class205[] var11 = new class205[12];
            for (int var12 = 0; var12 < 12; var12++) {
                int var15 = this.field2112[var12];
                if ((var15 & 0x40000000) != 0) {
                    class205 var17 = class256.method1753(-2, var15 & 0x3FFFFFFF).method662(0, this.field2116);
                    if (var17 != null) {
                        var11[var10++] = var17;
                    }
                } else if ((var15 & Integer.MIN_VALUE) != 0) {
                    class205 var16 = class17.method92(var15 & 0x3FFFFFFF, 570591392).method1251((byte) -18);
                    if (var16 != null) {
                        var11[var10++] = var16;
                    }
                }
            }
            class205 var13 = new class205(var11, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field2109[var14] < class201.field3186[var14].length) {
                    var13.method1438(class17.field206[var14], class201.field3186[var14][this.field2109[var14]]);
                }
                if (class184.field2950[var14].length > this.field2109[var14]) {
                    var13.method1438(class201.field3176[var14], class184.field2950[var14][this.field2109[var14]]);
                }
            }
            var7 = var13.method1421(64, 768, -50, -10, -50);
            class123.field1915.method1694(true, this.field2131, var7);
        }
        if (arg2 != null) {
            var7 = arg2.method1147(arg3, arg0, false, var7, arg4);
        }
        return var7;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILq;ILq;IIZ[Lfd;)Lwl;")
    public final class158 method911(int arg0, int arg1, int arg2, int arg3, class165 arg4, int arg5, class165 arg6, int arg7, int arg8, boolean arg9, class201[] arg10) {
        field2120++;
        if (this.field2118 != -1) {
            return class130.method888(0, this.field2118).method1304(-1, arg0, arg7, arg5, arg2, arg1, arg8, arg4, arg6, arg10);
        }
        long var12 = this.field2131;
        int[] var14 = this.field2112;
        if (arg6 != null && (arg6.field2625 >= 0 || arg6.field2643 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field2112[var15];
            }
            if (arg6.field2625 >= 0) {
                if (arg6.field2625 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class154.method1048(arg6.field2625, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg6.field2643 >= 0) {
                if (arg6.field2643 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class154.method1048(arg6.field2643, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class158 var16 = (class158) class116.field1648.method1693(var12, 119);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class17.method92(var43 & 0x3FFFFFFF, 570591392).method1252((byte) 17)) {
                        var17 = true;
                    }
                } else if (!class256.method1753(-2, var43 & 0x3FFFFFFF).method671((byte) -126, this.field2116)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field2130 != -1L) {
                    var16 = (class158) class116.field1648.method1693(this.field2130, 89);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class205[] var19 = new class205[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class205 var41 = class256.method1753(-2, var40 & 0x3FFFFFFF).method652(990, this.field2116);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class205 var42 = class17.method92(var40 & 0x3FFFFFFF, 570591392).method1258(-101);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class154 var21 = null;
                if (this.field2114 != -1) {
                    var21 = class186.method1298(this.field2114, (byte) 119);
                }
                if (var21 != null && var21.field2415 != null) {
                    for (int var22 = 0; var22 < var21.field2415.length; var22++) {
                        if (var21.field2415[var22] != null && var19[var22] != null) {
                            int var23 = var21.field2415[var22][1];
                            int var24 = var21.field2415[var22][3];
                            int var25 = var21.field2415[var22][2];
                            int var26 = var21.field2415[var22][0];
                            int var27 = var21.field2415[var22][5];
                            int var28 = var21.field2415[var22][4];
                            if (this.field2132 == null) {
                                this.field2132 = new int[var21.field2415.length][];
                            }
                            if (this.field2132[var22] == null) {
                                int[] var29 = this.field2132[var22] = new int[15];
                                if (var24 == 0 && var28 == 0 && var27 == 0) {
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var25;
                                    var29[12] = -var26;
                                    var29[13] = -var23;
                                } else {
                                    int var30 = class174.field2753[var24] >> 1;
                                    int var31 = class174.field2759[var24] >> 1;
                                    int var32 = class174.field2759[var28] >> 1;
                                    int var33 = class174.field2753[var28] >> 1;
                                    int var34 = class174.field2753[var27] >> 1;
                                    int var35 = class174.field2759[var27] >> 1;
                                    var29[2] = var31 * var33 + 16384 >> 15;
                                    var29[4] = var31 * var35 + 16384 >> 15;
                                    var29[5] = -var30;
                                    int var36 = var30 * var34 + 16384 >> 15;
                                    var29[3] = var31 * var34 + 16384 >> 15;
                                    var29[8] = var31 * var32 + 16384 >> 15;
                                    var29[0] = var32 * var35 - (-(var33 * var36) - 16384) >> 15;
                                    var29[14] = var29[8] * -var25 + (var29[2] * -var26 + (var29[5] * -var23)) + 16384 >> 15;
                                    int var37 = var30 * var35 + 16384 >> 15;
                                    var29[1] = -var34 * var32 + (var33 * var37) + 16384 >> 15;
                                    var29[6] = -var33 * var35 - (-(var32 * var36) - 16384) >> 15;
                                    var29[12] = var29[0] * -var26 + var29[6] * -var25 + var29[3] * -var23 + 16384 >> 15;
                                    var29[7] = -var33 * -var34 + var32 * var37 + 16384 >> 15;
                                    var29[13] = var29[7] * -var25 + var29[4] * -var23 + var29[1] * -var26 + 16384 >> 15;
                                }
                                var29[9] = var26;
                                var29[11] = var25;
                                var29[10] = var23;
                            }
                            if (var24 != 0 || var28 != 0 || var27 != 0) {
                                var19[var22].method1448(var24, var28, var27);
                            }
                            if (var26 != 0 || var23 != 0 || var25 != 0) {
                                var19[var22].method1420(var26, var23, var25);
                            }
                        }
                    }
                }
                class205 var38 = new class205(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (this.field2109[var39] < class201.field3186[var39].length) {
                        var38.method1438(class17.field206[var39], class201.field3186[var39][this.field2109[var39]]);
                    }
                    if (class184.field2950[var39].length > this.field2109[var39]) {
                        var38.method1438(class201.field3176[var39], class184.field2950[var39][this.field2109[var39]]);
                    }
                }
                var16 = var38.method1421(64, 850, -30, -50, -30);
                if (arg9) {
                    class116.field1648.method1694(true, var12, var16);
                    this.field2130 = var12;
                }
            }
        }
        boolean var44 = false;
        if (arg3 <= 59) {
            return null;
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg10 == null ? 0 : arg10.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg10[var49] != null) {
                class165 var72 = class208.method1458((byte) -58, arg10[var49].field3180);
                if (var72.field2624 != null) {
                    class25.field344[var49] = var72;
                    var44 = true;
                    int var73 = arg10[var49].field3177;
                    int var74 = var72.field2624[var73];
                    int var75 = arg10[var49].field3184;
                    class105.field1407[var49] = class19.method105(var74 >>> 16, false);
                    int var76 = var74 & 0xFFFF;
                    class215.field3444[var49] = var76;
                    if (class105.field1407[var49] != null) {
                        var45 |= class105.field1407[var49].method213(70, var76);
                        var46 |= class105.field1407[var49].method215(var76, -22272);
                        var47 |= var72.field2623;
                    }
                    if ((var72.field2630 || class204.field3211) && var75 != -1 && var75 < var72.field2624.length) {
                        class280.field4441[var49] = var72.field2634[var73];
                        class23.field310[var49] = arg10[var49].field3187;
                        int var77 = var72.field2624[var75];
                        class156.field2518[var49] = class19.method105(var77 >>> 16, false);
                        int var78 = var77 & 0xFFFF;
                        class110.field1575[var49] = var78;
                        if (class156.field2518[var49] != null) {
                            var45 |= class156.field2518[var49].method213(22, var78);
                            var46 |= class156.field2518[var49].method215(var78, -22272);
                        }
                    } else {
                        class280.field4441[var49] = 0;
                        class23.field310[var49] = 0;
                        class156.field2518[var49] = null;
                        class110.field1575[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg6 == null && arg4 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 0;
        class39 var53 = null;
        class39 var54 = null;
        if (arg6 != null) {
            int var55 = arg6.field2624[arg2];
            int var56 = var55 >>> 16;
            var50 = var55 & 0xFFFF;
            var54 = class19.method105(var56, false);
            if (var54 != null) {
                var45 |= var54.method213(89, var50);
                var46 |= var54.method215(var50, -22272);
                var47 |= arg6.field2623;
            }
            if ((arg6.field2630 || class204.field3211) && arg0 != -1 && arg0 < arg6.field2624.length) {
                int var57 = arg6.field2624[arg0];
                int var58 = var57 >>> 16;
                var52 = arg6.field2634[arg2];
                var51 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var53 = var54;
                } else {
                    var53 = class19.method105(var51 >>> 16, false);
                }
                if (var53 != null) {
                    var45 |= var53.method213(50, var51);
                    var46 |= var53.method215(var51, -22272);
                }
            }
        }
        int var59 = -1;
        int var60 = 0;
        int var61 = -1;
        class39 var62 = null;
        class39 var63 = null;
        if (arg4 != null) {
            int var64 = arg4.field2624[arg1];
            int var65 = var64 >>> 16;
            var59 = var64 & 0xFFFF;
            var62 = class19.method105(var65, false);
            if (var62 != null) {
                var45 |= var62.method213(27, var59);
                var46 |= var62.method215(var59, -22272);
                var47 |= arg4.field2623;
            }
            if ((arg4.field2630 || class204.field3211) && arg8 != -1 && arg4.field2624.length > arg8) {
                var60 = arg4.field2634[arg1];
                int var66 = arg4.field2624[arg8];
                int var67 = var66 >>> 16;
                var61 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var63 = var62;
                } else {
                    var63 = class19.method105(var61 >>> 16, false);
                }
                if (var63 != null) {
                    var45 |= var63.method213(80, var61);
                    var46 |= var63.method215(var61, -22272);
                }
            }
        }
        class158 var68 = var16.method832(!var46, !var45, !var47);
        int var69 = 0;
        int var70 = 1;
        while (var69 < var48) {
            if (class105.field1407[var69] != null) {
                var68.method1108(class105.field1407[var69], class215.field3444[var69], class156.field2518[var69], class110.field1575[var69], class23.field310[var69] - 1, class280.field4441[var69], var70, class25.field344[var69].field2623, this.field2132[var69]);
            }
            var70 <<= 0x1;
            var69++;
        }
        if (var54 != null && var62 != null) {
            var68.method1107(var54, var50, var53, var51, arg7 - 1, var52, var62, var59, var63, var61, arg5 - 1, var60, arg6.field2636, arg6.field2623 | arg4.field2623);
        } else if (var54 != null) {
            var68.method1106(var54, var50, var53, var51, arg7 - 1, var52, arg6.field2623);
        } else if (var62 != null) {
            var68.method1106(var62, var59, var63, var61, arg5 - 1, var60, arg4.field2623);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class105.field1407[var71] = null;
            class156.field2518[var71] = null;
            class25.field344[var71] = null;
        }
        return var68;
    }
}
