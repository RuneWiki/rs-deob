import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class163 extends class456 {

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    private int field2254 = 6;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Lct;")
    public static class285 field2257 = new class285(71, 3);

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2260 = new String[100];

    @OriginalMember(owner = "client!he", name = "S", descriptor = "Lct;")
    public static class285 field2262 = new class285(63, -1);

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Lsh;")
    public static class472 field2263 = new class472(11, -1);

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field2264 = 1;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field2266 = 0;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field2267 = new String[8];

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "Lmu;")
    public static class315 field2269;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "Lui;")
    public static class451 field2261;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "Lcp;")
    public static class481 field2268;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "[Ldp;")
    public static class319[] field2265;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZB)V", line = 4)
    public static final void method1104(boolean arg0, byte arg1) {
        ++field2253;
        while (~class220.field3246.method379((byte) -104, class95.field1342) <= -16) {
            int var2 = class220.field3246.method369((byte) 126, 15);
            if (~var2 == -32768) {
                break;
            }
            boolean var3 = false;
            if (class18.field241[var2] == null) {
                class18.field241[var2] = new class349();
                class18.field241[var2].field4609 = var2;
                var3 = true;
            }
            class349 var4 = class18.field241[var2];
            class236.field3441[class256.field3797++] = var2;
            var4.field4595 = class452.field6418;
            if (var4.field5309 != null && var4.field5309.method1779(112)) {
                class439.method2556(false, var4);
            }
            int var5 = class220.field3246.method369((byte) 126, 1);
            int var6;
            if (!arg0) {
                var6 = class220.field3246.method369((byte) 126, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
            } else {
                var6 = class220.field3246.method369((byte) 126, 8);
                if (var6 > 127) {
                    var6 -= 256;
                }
            }
            int var7 = class220.field3246.method369((byte) 126, 2);
            int var8;
            if (arg0) {
                var8 = class220.field3246.method369((byte) 126, 8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = class220.field3246.method369((byte) 126, 5);
                if (~var8 < -16) {
                    var8 -= 32;
                }
            }
            var4.method2154(class448.field6339.method334(class220.field3246.method369((byte) 126, 14), (byte) 104), (byte) 48);
            int var9 = 15457 & 4 + class220.field3246.method369((byte) 126, 3) << 11;
            int var10 = class220.field3246.method369((byte) 126, 1);
            if (~var10 == -2) {
                class381.field5651[class345.field5250++] = var2;
            }
            var4.method1919(var4.field5309.field4147, (byte) -121);
            var4.field4621 = var4.field5309.field4131 << 3;
            if (~var4.field4621 == -1) {
                var4.method1926(0, 120);
            } else if (var3) {
                var4.method1926(var9, 103);
            }
            var4.method2155(var7, class472.field6622.field4674[0] + var8, 8877, var4.method1705((byte) 65), var5 == 1, class472.field6622.field4675[0] + var6);
            if (var4.field5309.method1779(124)) {
                class356.method2192((class271) null, (class257) null, var4.field4545, var4, 0, var4.field4674[0], var4.field4675[0], (byte) -78);
            }
        }
        if (arg1 > -92) {
            field2260 = null;
        }
        class220.field3246.method371(true);
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V", line = 110)
    public static void method1105(int arg0) {
        if (arg0 == -16) {
            field2257 = null;
            field2263 = null;
            field2269 = null;
            field2267 = null;
            field2260 = null;
            field2262 = null;
            field2265 = null;
            field2268 = null;
            field2261 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIZ)Lqr;", line = 129)
    public static final class468 method1106(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2259;
        class468 var5 = new class468();
        var5.field6584 = arg1;
        var5.field6587 = arg2;
        class466.field6564.method2307((long) arg0, var5, (byte) 122);
        if (arg3 != 2121095184) {
            return null;
        } else {
            class392.method2376(arg1, (byte) 127);
            class178 var6 = class493.method2885(arg0, arg3 ^ 2121115631);
            if (var6 != null) {
                class205.method1396(arg3 + -2121095100, var6);
            }
            if (class232.field3403 != null) {
                class205.method1396(arg3 + -2121095093, class232.field3403);
                class232.field3403 = null;
            }
            class410.method2446(arg3 + -2121095168);
            if (var6 != null) {
                class426.method2508(!arg4, var6, arg3 + -2121095185);
            }
            if (!arg4) {
                class477.method2795(arg1);
            }
            if (!arg4 && class279.field4220 != -1) {
                class231.method1517(class279.field4220, 1, arg3 ^ -2121095185);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lui;Lui;Lom;I)V", line = 172)
    public static final void method1107(class451 arg0, class451 arg1, class249 arg2, int arg3) {
        class257.field3827 = arg1;
        ++field2256;
        class260.field3871 = arg2;
        class251.field3616 = arg0;
        if (arg3 == 1) {
            if (class257.field3827 != null) {
                class187.field2850 = class257.field3827.method2662(1, (byte) -7);
            }
            if (class251.field3616 != null) {
                class115.field1605 = class251.field3616.method2662(1, (byte) -7);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILsl;)Lbu;", line = 194)
    public static final class99 method1108(int arg0, int arg1, int arg2, class422 arg3) {
        ++field2258;
        int var4 = arg3.field6041 | arg0 << 8;
        class99 var5 = (class99) class427.field6095.method1896((long) var4 << 16, (byte) -109);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class119.field1664.method2667((byte) -122, class119.field1664.method2688(var4, arg1 + -16784712));
            if (var6 != null) {
                if (var6.length <= 1) {
                    return null;
                } else {
                    class99 var7 = class485.method2838(var6, -2);
                    var7.field1404 = arg3;
                    class427.field6095.method1898((long) var4 << 16, var7, (byte) 6);
                    return var7;
                }
            } else {
                int var8 = arg3.field6041 | arg2 + 65536 << 8;
                class99 var9 = (class99) class427.field6095.method1896((long) var8 << 16, (byte) -60);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class119.field1664.method2667((byte) -118, class119.field1664.method2688(var8, arg1 ^ -16769352));
                    if (var10 != null) {
                        if (var10.length <= 1) {
                            return null;
                        } else {
                            class99 var11 = class485.method2838(var10, -2);
                            var11.field1404 = arg3;
                            class427.field6095.method1898((long) var8 << 16, var11, (byte) 6);
                            return var11;
                        }
                    } else {
                        int var12 = arg1 | arg3.field6041;
                        class99 var13 = (class99) class427.field6095.method1896((long) var12 << 16, (byte) 95);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class119.field1664.method2667((byte) -118, class119.field1664.method2688(var12, arg1 + -16784712));
                            if (var14 != null) {
                                if (var14.length <= 1) {
                                    return null;
                                } else {
                                    class99 var15 = class485.method2838(var14, -2);
                                    var15.field1404 = arg3;
                                    class427.field6095.method1898((long) var12 << 16, var15, (byte) 6);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[I", line = 261)
    public final int[] method33(int arg0, int arg1) {
        ++field2251;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            field2262 = null;
        }
        if (super.field6466.field6153) {
            int[] var4 = this.method2707(arg1, -31797, 0);
            int[] var5 = this.method2707(arg1, -31797, 1);
            int var6 = this.field2254;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class156.field2169 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class156.field2169 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 > var12 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class156.field2169 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 <= var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class156.field2169; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 <= var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class156.field2169; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class156.field2169 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class156.field2169; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (4096 - var24) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class156.field2169; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (4096 - var5[var25]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class156.field2169 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class156.field2169; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class156.field2169 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class156.field2169 > var30; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[[I", line = 510)
    public final int[][] method212(int arg0, int arg1) {
        ++field2252;
        if (arg0 != 0) {
            field2269 = null;
        }
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (super.field6468.field2227) {
            int[][] var4 = this.method2709(false, arg1, 0);
            int[][] var5 = this.method2709(false, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field2254;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class156.field2169; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = -(var19 * var21 >> 11) + var21 + var19;
                                                                var7[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                                var8[var16] = var18 + var22 + -(var18 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class156.field2169; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = var25 > var29 ? -var29 + var25 : -var25 + var29;
                                                            var7[var23] = var27 < var24 ? -var27 + var24 : -var24 + var27;
                                                            var8[var23] = var28 > var26 ? -var26 + var28 : -var28 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class156.field2169 < ~var30; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = var34 <= var33 ? var33 : var34;
                                                        var7[var30] = var36 >= var31 ? var36 : var31;
                                                        var8[var30] = ~var32 >= ~var35 ? var35 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class156.field2169; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var39 <= var43 ? var39 : var43;
                                                    var7[var37] = var38 < var40 ? var38 : var40;
                                                    var8[var37] = ~var42 <= ~var41 ? var41 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class156.field2169 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var45 == 0 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var45;
                                                var7[var44] = var46 == 0 ? 0 : 4096 - (-var13[var44] + 4096 << 12) / var46;
                                                var8[var44] = ~var47 != -1 ? -((-var14[var44] + 4096 << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class156.field2169 > var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var51);
                                            var8[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class156.field2169; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var53 >= 2048 ? 4096 - ((-var9[var52] + 4096) * (-var53 + 4096) >> 11) : var9[var52] * var53 >> 11;
                                        var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((4096 - var10[var52]) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 <= -2049 ? -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class156.field2169 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class156.field2169; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = var59 != 0 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class156.field2169; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class156.field2169; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class156.field2169 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLre;)V", line = 828)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field2255;
        if (arg1 != 55) {
            this.method210(-54, (byte) -100, (class446) null);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field6486 = arg2.method2628(arg1 ^ 49207) == 1;
            }
        } else {
            this.field2254 = arg2.method2628(49152);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 874)
    public class163() {
        super(2, false);
    }
}
