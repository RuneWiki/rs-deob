import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class255 extends class76 {

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "I")
    private int field4373 = 6;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
    public static int field4371 = 100;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public static int field4365 = 0;

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "Lia;")
    private static class257 field4374 = class28.method234(-14, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "Lia;")
    public static class257 field4370 = field4374;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "[Lte;")
    public static class184[] field4364;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "[Z")
    public static boolean[] field4363;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "(I)V")
    public static void method1661(int arg0) {
        if (arg0 != -5468) {
            method1661(-90);
        }
        field4374 = null;
        field4364 = null;
        field4370 = null;
        field4363 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
    public static final void method1662(int arg0, boolean arg1) {
        if (arg0 <= -83) {
            for (class103 var2 = (class103) class174.field2979.method288(26111); var2 != null; var2 = (class103) class174.field2979.method277(1)) {
                if (var2.field1913 != null) {
                    class78.field1504.method459(var2.field1913);
                    var2.field1913 = null;
                }
                if (var2.field1925 != null) {
                    class78.field1504.method459(var2.field1925);
                    var2.field1925 = null;
                }
                var2.method254(1);
            }
            if (arg1) {
                for (class103 var3 = (class103) class233.field3974.method288(26111); var3 != null; var3 = (class103) class233.field3974.method277(1)) {
                    if (var3.field1913 != null) {
                        class78.field1504.method459(var3.field1913);
                        var3.field1913 = null;
                    }
                    var3.method254(1);
                }
                for (class103 var4 = (class103) class79.field1553.method427((byte) 58); var4 != null; var4 = (class103) class79.field1553.method428(false)) {
                    if (var4.field1913 != null) {
                        class78.field1504.method459(var4.field1913);
                        var4.field1913 = null;
                    }
                    var4.method254(1);
                }
            }
            ++field4361;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        if (arg1 < 2) {
            this.method157(-13, (byte) 21);
        }
        ++field4367;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[][] var4 = this.method565((byte) -20, 0, arg0);
            int[][] var5 = this.method565((byte) -20, 1, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field4373;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class96.field1807 < ~var16; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var12[var16];
                                                                var8[var16] = -(var18 * var20 >> 11) + var20 + var18;
                                                                var6[var16] = -(var17 * var21 >> 11) + var21 + var17;
                                                                var7[var16] = var22 - -var19 + -(var19 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class96.field1807; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var12[var23];
                                                            var8[var23] = ~var25 <= ~var26 ? -var26 + var25 : -var25 + var26;
                                                            var6[var23] = var28 < var24 ? -var28 + var24 : -var24 + var28;
                                                            var7[var23] = var29 > var27 ? -var27 + var29 : -var29 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class96.field1807; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var12[var30];
                                                        var8[var30] = var33 <= var35 ? var35 : var33;
                                                        var6[var30] = var34 <= var32 ? var32 : var34;
                                                        var7[var30] = ~var36 >= ~var31 ? var31 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class96.field1807 > var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var12[var37];
                                                    var8[var37] = var42 > var38 ? var38 : var42;
                                                    var6[var37] = ~var40 >= ~var39 ? var40 : var39;
                                                    var7[var37] = var43 >= var41 ? var41 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class96.field1807 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var12[var44];
                                                var8[var44] = var45 == 0 ? 0 : -((-var11[var44] + 4096 << 12) / var45) + 4096;
                                                var6[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class96.field1807 > var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var12[var48];
                                            var8[var48] = ~var49 != -4097 ? (var11[var48] << 12) / (-var49 + 4096) : 4096;
                                            var6[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class96.field1807; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var11[var52];
                                        int var55 = var14[var52];
                                        var8[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var6[var52] = ~var55 <= -2049 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var7[var52] = var53 < 2048 ? var12[var52] * var53 >> 11 : 4096 - ((4096 - var12[var52]) * (-var53 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class96.field1807 < ~var56; ++var56) {
                                    var8[var56] = 4096 - ((-var9[var56] + 4096) * (-var11[var56] + 4096) >> 12);
                                    var6[var56] = -((4096 - var10[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var12[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class96.field1807 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var11[var57];
                                int var60 = var13[var57];
                                var8[var57] = var59 == 0 ? 4096 : (var9[var57] << 12) / var59;
                                var6[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var7[var57] = ~var60 != -1 ? (var12[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class96.field1807 > var61; ++var61) {
                            var8[var61] = var9[var61] * var11[var61] >> 12;
                            var6[var61] = var10[var61] * var14[var61] >> 12;
                            var7[var61] = var12[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class96.field1807 < ~var62; ++var62) {
                        var8[var62] = var9[var62] - var11[var62];
                        var6[var62] = var10[var62] + -var14[var62];
                        var7[var62] = var12[var62] + -var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class96.field1807; ++var63) {
                    var8[var63] = var9[var63] + var11[var63];
                    var6[var63] = var10[var63] - -var14[var63];
                    var7[var63] = var12[var63] - -var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "j", descriptor = "(I)Lik;")
    public static final class202 method1663(int arg0) {
        ++field4369;
        class202 var1 = (class202) class203.field3486.method984(arg0 + -7553);
        if (var1 != null) {
            var1.method254(1);
            var1.method815((byte) 16);
            return var1;
        } else if (arg0 != 0) {
            return null;
        } else {
            class202 var2;
            do {
                var2 = (class202) class80.field1562.method984(-7553);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method1356(68) < ~class80.method600(-114)) {
                    return null;
                }
                var2.method254(1);
                var2.method815((byte) 120);
            } while (~(var2.field2055 & Long.MIN_VALUE) == -1L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class255() {
        super(2, false);
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field4362;
        if (arg0 != -9351) {
            field4371 = 104;
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1, 0, (byte) -104);
            int[] var5 = this.method562(arg1, 1, (byte) -104);
            int var6 = this.field4373;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~var7 > ~class96.field1807; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class96.field1807 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var12 > ~var11 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class96.field1807; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class96.field1807 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class96.field1807 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class96.field1807 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class96.field1807; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class96.field1807 > var25; ++var25) {
                                    var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class96.field1807; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class96.field1807 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class96.field1807; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class96.field1807 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field4372;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field1477 = arg0.method1051((byte) -117) == 1;
            }
        } else {
            this.field4373 = arg0.method1051((byte) 123);
        }
        if (arg1 >= -86) {
            this.method158((class152) null, (byte) -111, 41);
        }
    }
}
