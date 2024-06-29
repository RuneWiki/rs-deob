import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class31 extends class145 {

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
    private int field517 = 6;

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "I")
    public static int field519 = -1;

    @OriginalMember(owner = "client!mq", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field522 = new String[100];

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "(I)V")
    public static void method346(int arg0) {
        if (arg0 != 114417036) {
            field522 = null;
        }
        field522 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field515;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[][] var4 = this.method1121(arg1, 0, 2);
            int[][] var5 = this.method1121(arg1, 1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field517;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class156.field2364; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var17 - -var22 - (var17 * var22 >> 11);
                                                                var7[var16] = var18 - (var18 * var19 >> 11) + var19;
                                                                var8[var16] = var20 + var21 - (var20 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class156.field2364; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = var28 > var26 ? -var26 + var28 : var26 - var28;
                                                            var7[var23] = var25 < var29 ? -var25 + var29 : -var29 + var25;
                                                            var8[var23] = ~var27 <= ~var24 ? -var24 + var27 : -var27 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class156.field2364; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = ~var32 > ~var36 ? var36 : var32;
                                                        var7[var30] = ~var34 >= ~var33 ? var33 : var34;
                                                        var8[var30] = var35 > var31 ? var35 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class156.field2364; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = ~var43 >= ~var38 ? var43 : var38;
                                                    var7[var37] = ~var40 >= ~var42 ? var40 : var42;
                                                    var8[var37] = ~var39 < ~var41 ? var41 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class156.field2364; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                var7[var44] = ~var46 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var8[var44] = var45 != 0 ? -((4096 - var14[var44] << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class156.field2364 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = ~var50 == -4097 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class156.field2364; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((4096 - var10[var52]) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 <= -2049 ? 4096 - ((-var11[var52] + 4096) * (-var55 + 4096) >> 11) : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class156.field2364; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class156.field2364 > var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = var60 != 0 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = ~var58 != -1 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class156.field2364; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class156.field2364; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class156.field2364; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
    public class31() {
        super(2, false);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field513;
        int var4 = -87 % ((arg1 - 11) / 52);
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field2205 = arg0.method1861((byte) -72) == 1;
            }
        } else {
            this.field517 = arg0.method1861((byte) -72);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field520;
        int[] var3 = super.field2218.method1614(127, arg0);
        if (super.field2218.field3396) {
            int[] var4 = this.method1119(0, 0, arg0);
            int[] var5 = this.method1119(1, 0, arg0);
            int var6 = this.field517;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class156.field2364; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 - -var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class156.field2364 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 <= var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class156.field2364 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class156.field2364; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class156.field2364 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class156.field2364; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class156.field2364; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class156.field2364 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class156.field2364 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class156.field2364 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class156.field2364 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class156.field2364 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        int var31 = -31 / ((arg1 - 16) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "(I)V")
    public static final void method347(int arg0) {
        class10.method52(class305.field4133, (byte) -89);
        ++field512;
        ++class167.field2486;
        if (arg0 != 2) {
            field522 = null;
        }
        if (class127.field1801 && class395.field5525) {
            int var1 = class391.field5490;
            int var2 = class312.field4220;
            int var3 = var1 - class69.field1050;
            if (class134.field1908 > var3) {
                var3 = class134.field1908;
            }
            int var4 = var2 - class380.field5338;
            if (~class88.field1307 < ~var4) {
                var4 = class88.field1307;
            }
            if (~(var3 - -class305.field4133.field2027) < ~(class134.field1908 + class291.field3953.field2027)) {
                var3 = class134.field1908 + class291.field3953.field2027 + -class305.field4133.field2027;
            }
            if (var4 - -class305.field4133.field2011 > class88.field1307 + class291.field3953.field2011) {
                var4 = class88.field1307 + class291.field3953.field2011 - class305.field4133.field2011;
            }
            int var5 = var3 - class413.field5778;
            int var6 = var4 - class35.field537;
            int var7 = class305.field4133.field1991;
            if (~class305.field4133.field2029 > ~class167.field2486 && (~var5 < ~var7 || -var7 > var5 || ~var6 < ~var7 || ~(-var7) < ~var6)) {
                class442.field6363 = true;
            }
            int var8 = var3 - -class291.field3953.field2055 + -class134.field1908;
            int var9 = class291.field3953.field1983 + var4 + -class88.field1307;
            if (class305.field4133.field2084 != null && class442.field6363) {
                class361 var10 = new class361();
                var10.field4903 = class305.field4133;
                var10.field4905 = class305.field4133.field2084;
                var10.field4901 = var8;
                var10.field4904 = var9;
                class18.method267(var10);
            }
            if (class262.field3525 == 0) {
                if (!class442.field6363) {
                    if ((class258.field3482 == 1 || class380.method2366((byte) -61)) && class415.field5808 > 2) {
                        class234.method1561(2, (byte) 127);
                    } else if (class95.method809((byte) 55)) {
                        class234.method1561(1, (byte) 121);
                    }
                } else {
                    if (class305.field4133.field1967 != null) {
                        class361 var11 = new class361();
                        var11.field4901 = var8;
                        var11.field4903 = class305.field4133;
                        var11.field4904 = var9;
                        var11.field4905 = class305.field4133.field1967;
                        var11.field4907 = class268.field3611;
                        class18.method267(var11);
                    }
                    if (class268.field3611 != null && client.method1641(class305.field4133) != null) {
                        class355.field4828.method1801(65, (byte) -110);
                        ++class60.field940;
                        class355.field4828.method1854(class305.field4133.field1968, true);
                        class355.field4828.method1877(true, class305.field4133.field2094);
                        class355.field4828.method1822(false, class268.field3611.field1968);
                        class355.field4828.method1869((byte) 105, class268.field3611.field2094);
                    }
                }
                class305.field4133 = null;
            }
        } else {
            if (~class167.field2486 < -2) {
                class305.field4133 = null;
            }
        }
    }
}
