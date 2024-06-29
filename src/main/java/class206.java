import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class206 extends class74 {

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    private int field3197 = 6;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[I")
    public static int[] field3199 = new int[50];

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "[Lqd;")
    public static class3[] field3204;

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class206() {
        super(2, false);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field3202;
        if (arg0 != -79) {
            this.method80((byte) -95, (class37) null, 12);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1245 = ~arg1.method333((byte) -59) == -2;
            }
        } else {
            this.field3197 = arg1.method333((byte) -59);
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    public static void method1377(int arg0) {
        if (arg0 != -30593) {
            field3205 = -80;
        }
        field3199 = null;
        field3204 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static final void method1378(byte arg0) {
        for (int var1 = 0; ~class17.field269 < ~var1; ++var1) {
            int var2 = class36.field576[var1];
            class32 var3 = class72.field1144[var2];
            int var4 = class239.field3692.method333((byte) -59);
            if ((8 & var4) != 0) {
                var4 += class239.field3692.method333((byte) -59) << 8;
            }
            if (~(128 & var4) != -1) {
                int var5 = class239.field3692.method309(255);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class239.field3692.method297((byte) -120);
                class172.method1136(var3, var6, var5, 9261);
            }
            if ((512 & var4) != 0) {
                var3.field4158 = class239.field3692.method293(arg0 ^ -97);
                var3.field4128 = class239.field3692.method293(-121);
            }
            if (~(var4 & 1) != -1) {
                int var7 = class239.field3692.method335(false);
                int var8 = class239.field3692.method325(255);
                var3.method1798(class267.field4256, var8, var7, 0);
            }
            if (~(64 & var4) != -1) {
                var3.field4131 = class239.field3692.method331(arg0 + 16298);
                var3.field4197 = 100;
            }
            if (~(var4 & 16) != -1) {
                var3.field4140 = class239.field3692.method309(arg0 + 241);
                if (var3.field4140 == 65535) {
                    var3.field4140 = -1;
                }
            }
            if (~(var4 & 4) != -1) {
                int var9 = class239.field3692.method325(255);
                int var10 = class239.field3692.method333((byte) -59);
                var3.method1798(class267.field4256, var10, var9, 0);
                var3.field4171 = class267.field4256 + 300;
                var3.field4146 = class239.field3692.method325(255);
            }
            if ((var4 & 32) != 0) {
                if (var3.field518.method1447(arg0 ^ 14)) {
                    class186.method1250(true, var3);
                }
                var3.method259(class253.method1689(class239.field3692.method313(arg0 + 103), -22396), -2308);
                var3.method1804((byte) -45, var3.field518.field3352);
                var3.field4167 = var3.field518.field3403;
                var3.field4203 = var3.field518.field3361;
                if (var3.field518.method1447(arg0 ^ 14)) {
                    class184.method1237((class28) null, 0, var3, 128, (class73) null, var3.field4143[0], var3.field4204[0], class274.field4318);
                }
            }
            if ((2 & var4) != 0) {
                int var11 = class239.field3692.method309(arg0 + 241);
                if (~var11 == -65536) {
                    var11 = -1;
                }
                int var12 = class239.field3692.method307(-75);
                boolean var13 = true;
                if (~var11 != 0 && var3.field4135 != -1 && ~class28.method224(class23.method189(var11, (byte) -114).field3963, 100).field3481 > ~class28.method224(class23.method189(var3.field4135, (byte) -125).field3963, 52).field3481) {
                    var13 = false;
                }
                if (var13) {
                    var3.field4174 = (65535 & var12) + class267.field4256;
                    var3.field4136 = 1;
                    var3.field4135 = var11;
                    var3.field4137 = var12 >> 16;
                    var3.field4206 = 0;
                    var3.field4188 = 0;
                    if (~class267.field4256 > ~var3.field4174) {
                        var3.field4188 = -1;
                    }
                    if (~var3.field4135 != 0 && ~class267.field4256 == ~var3.field4174) {
                        int var14 = class23.method189(var3.field4135, (byte) 99).field3963;
                        if (~var14 != 0) {
                            class223 var15 = class28.method224(var14, arg0 ^ 79);
                            if (var15 != null && var15.field3484 != null) {
                                class56.method452((byte) -49, 0, var3.field4176, var15, false, var3.field4123);
                            }
                        }
                    }
                }
            }
            if ((var4 & 256) != 0) {
                int var16 = class239.field3692.method333((byte) -59);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var16 > var20; ++var20) {
                    int var21 = class239.field3692.method309(255);
                    if (~var21 == -65536) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var18[var20] = class239.field3692.method333((byte) -59);
                    var19[var20] = class239.field3692.method283(arg0 + 241);
                }
                class220.method1474(var3, -17370, var18, var19, var17);
            }
        }
        ++field3198;
        if (arg0 != 14) {
            method1379(true, (byte) 14, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int[] var4 = this.method590(0, 0, arg1);
            int[] var5 = this.method590(0, 1, arg1);
            int var6 = this.field3197;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class178.field2662 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 - ((var8 * var9 >> 11) + -var9);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class178.field2662 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 >= ~var11 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class178.field2662 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 > ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class178.field2662; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class178.field2662; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class178.field2662; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class178.field2662; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; class178.field2662 > var25; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class178.field2662 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class178.field2662; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class178.field2662 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class178.field2662; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        if (arg0 != 4) {
            this.method448(-107, -85);
        }
        ++field3207;
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        int[][] var3 = super.field1248.method269(false, arg0);
        ++field3206;
        if (arg1 > -112) {
            field3199 = null;
        }
        if (super.field1248.field550) {
            int[][] var4 = this.method592(arg0, 0, 87);
            int[][] var5 = this.method592(arg0, 1, 95);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[1];
            int[] var12 = var5[0];
            int[] var13 = var4[2];
            int[] var14 = var5[2];
            int var15 = this.field3197;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class178.field2662 < ~var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = -(var21 * var22 >> 11) + var22 + var21;
                                                                var7[var16] = var17 + var19 + -(var17 * var19 >> 11);
                                                                var8[var16] = var18 - (var18 * var20 >> 11) + var20;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class178.field2662; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = ~var25 < ~var27 ? -var27 + var25 : var27 - var25;
                                                            var7[var23] = var29 <= var26 ? -var29 + var26 : -var26 + var29;
                                                            var8[var23] = var28 > var24 ? -var24 + var28 : var24 - var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class178.field2662; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var34 <= ~var31 ? var34 : var31;
                                                        var7[var30] = var35 > var32 ? var35 : var32;
                                                        var8[var30] = var36 <= var33 ? var33 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class178.field2662; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var39 < ~var43 ? var43 : var39;
                                                    var7[var37] = var38 <= var40 ? var38 : var40;
                                                    var8[var37] = var41 < var42 ? var41 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class178.field2662 > var44; ++var44) {
                                                int var45 = var13[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var46 == -1 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var46;
                                                var7[var44] = var47 != 0 ? 4096 - (-var11[var44] + 4096 << 12) / var47 : 0;
                                                var8[var44] = var45 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class178.field2662; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var13[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = var49 != 4096 ? (var11[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (4096 - var50) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class178.field2662 > var52; ++var52) {
                                        int var53 = var11[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((4096 - var9[var52]) * (-var54 + 4096) >> 11) : var9[var52] * var54 >> 11;
                                        var7[var52] = ~var53 <= -2049 ? 4096 - ((4096 - var53) * (-var10[var52] + 4096) >> 11) : var10[var52] * var53 >> 11;
                                        var8[var52] = var55 < 2048 ? var13[var52] * var55 >> 11 : -((-var13[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class178.field2662 < ~var56; ++var56) {
                                    var6[var56] = 4096 - ((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12);
                                    var7[var56] = -((-var10[var56] + 4096) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var13[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class178.field2662; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var11[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = var59 != 0 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = var60 == 0 ? 4096 : (var13[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class178.field2662; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var11[var61] >> 12;
                            var8[var61] = var13[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class178.field2662; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var11[var62];
                        var8[var62] = var13[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class178.field2662 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var11[var63];
                    var8[var63] = var13[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
    public static final Object method1379(boolean arg0, byte arg1, byte[] arg2) {
        ++field3201;
        if (arg1 != 5) {
            method1377(-93);
        }
        if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class130.field2020) {
                try {
                    class9 var3 = (class9) Class.forName("jg").newInstance();
                    var3.method107(false, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class130.field2020 = true;
                }
            }
            return !arg0 ? arg2 : class220.method1476((byte) 62, arg2);
        }
    }
}
