import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class187 extends class99 {

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    private int field3230 = 3216;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    private int field3241 = 4096;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "[I")
    private int[] field3237 = new int[3];

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    private int field3235 = 3216;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "[I")
    public static int[] field3232;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (arg0 < -22) {
            this.method1232((byte) -23);
            ++field3236;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)V")
    public static final void method1231(int arg0, int arg1, boolean arg2) {
        if (class199.field3432 != arg0) {
            class10.field120 = new int[arg0];
            for (int var3 = 0; ~var3 > ~arg0; ++var3) {
                class10.field120[var3] = (var3 << 12) / arg0;
            }
            class212.field3638 = arg0 == 64 ? 2048 : 4096;
            class98.field1914 = arg0 + -1;
            class199.field3432 = arg0;
        }
        ++field3246;
        if (~class16.field223 != ~arg1) {
            if (~class199.field3432 != ~arg1) {
                class19.field261 = new int[arg1];
                for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                    class19.field261[var4] = (var4 << 12) / arg1;
                }
            } else {
                class19.field261 = class10.field120;
            }
            class45.field833 = arg1 - 1;
            class16.field223 = arg1;
        }
        if (!arg2) {
            method1234(81, 122, -111);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V")
    private final void method1232(byte arg0) {
        double var2 = Math.cos((double) ((float) this.field3230 / 4096.0F));
        ++field3243;
        this.field3237[0] = (int) (Math.sin((double) ((float) this.field3235 / 4096.0F)) * var2 * 4096.0D);
        this.field3237[1] = (int) (var2 * Math.cos((double) ((float) this.field3235 / 4096.0F)) * 4096.0D);
        this.field3237[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3230 / 4096.0F)));
        int var4 = this.field3237[1] * this.field3237[1] >> 12;
        int var5 = this.field3237[2] * this.field3237[2] >> 12;
        int var6 = this.field3237[0] * this.field3237[0] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (arg0 != -23) {
            method1233(3, -86L);
        }
        if (var7 != 0) {
            this.field3237[2] = (this.field3237[2] << 12) / var7;
            this.field3237[0] = (this.field3237[0] << 12) / var7;
            this.field3237[1] = (this.field3237[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IJ)V")
    public static final void method1233(int arg0, long arg1) {
        ++field3233;
        if (~arg1 != -1L) {
            int var3 = 0;
            if (arg0 != 23136) {
                method1237((byte) -1);
            }
            while (var3 < class173.field3058) {
                if (class176.field3104[var3] == arg1) {
                    ++class218.field3748;
                    --class173.field3058;
                    for (int var4 = var3; class173.field3058 > var4; ++var4) {
                        class233.field4077[var4] = class233.field4077[var4 + 1];
                        class245.field4279[var4] = class245.field4279[var4 - -1];
                        class16.field202[var4] = class16.field202[var4 - -1];
                        class176.field3104[var4] = class176.field3104[var4 - -1];
                        class17.field246[var4] = class17.field246[var4 + 1];
                        class223.field3805[var4] = class223.field3805[var4 + 1];
                    }
                    class252.field4434 = class15.field199;
                    class28.field412.method578(-105, 132);
                    class28.field412.method1651(true, arg1);
                    return;
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(III)V")
    public static final void method1234(int arg0, int arg1, int arg2) {
        class89.field1726[arg0] = arg1;
        ++field3238;
        class151 var3 = (class151) class60.field1017.method1381((long) arg0, -123);
        if (var3 != null) {
            var3.field2708 = 500L + class3.method13(17161);
        } else {
            class151 var4 = new class151(500L + class3.method13(17161));
            class60.field1017.method1380((byte) 126, var4, (long) arg0);
        }
        int var5 = 97 % ((34 - arg2) / 52);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3230 = arg0.method1674(1355769544);
                }
            } else {
                this.field3235 = arg0.method1674(1355769544);
            }
        } else {
            this.field3241 = arg0.method1674(1355769544);
        }
        if (arg2 != -1) {
            this.field3230 = 123;
        }
        ++field3231;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field3239;
        if (arg0 != -61) {
            this.field3241 = 7;
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = class212.field3638 * this.field3241 >> 12;
            int[] var5 = this.method682(0, class45.field833 & arg1 + -1, 29149);
            int[] var6 = this.method682(0, arg1, 29149);
            int[] var7 = this.method682(0, arg1 + 1 & class45.field833, 29149);
            for (int var8 = 0; ~class199.field3432 < ~var8; ++var8) {
                int var9 = (var6[var8 - 1 & class98.field1914] + -var6[var8 - -1 & class98.field1914]) * var4 >> 12;
                int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class216.field3712[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field3237[0] * var14 >> 12;
                int var17 = this.field3237[2] * var15 >> 12;
                int var18 = var10 * var13 >> 8;
                int var19 = this.field3237[1] * var18 >> 12;
                var3[var8] = var16 + var17 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZ)V")
    public static final void method1235(byte arg0, boolean arg1) {
        class3.field36 = arg1;
        if (!class3.field36) {
            int var2 = class84.field1627.method1642(arg0 ^ -15003);
            int var3 = class84.field1627.method1690((byte) -47);
            int var4 = class84.field1627.method1642(-15046);
            int var5 = (-class84.field1627.field4335 + class61.field1033) / 16;
            class77.field1533 = new int[var5][4];
            for (int var6 = 0; ~var5 < ~var6; ++var6) {
                for (int var14 = 0; ~var14 > -5; ++var14) {
                    class77.field1533[var6][var14] = class84.field1627.method1652(-5528);
                }
            }
            boolean var7 = false;
            int var8 = class84.field1627.method1688(126);
            int var9 = class84.field1627.method1674(arg0 + 1355769449);
            class202.field3469 = new int[var5];
            class76.field1503 = new byte[var5][];
            class206.field3516 = null;
            class162.field2910 = null;
            if ((~(var2 / 8) == -49 || var2 / 8 == 49) && var9 / 8 == 48) {
                var7 = true;
            }
            class223.field3806 = new int[var5];
            class57.field977 = new byte[var5][];
            if (var2 / 8 == 48 && var9 / 8 == 148) {
                var7 = true;
            }
            class170.field3025 = new int[var5];
            int var10 = 0;
            for (int var11 = (var2 + -6) / 8; ~((var2 + 6) / 8) <= ~var11; ++var11) {
                for (int var12 = (var9 + -6) / 8; (var9 - -6) / 8 >= var12; ++var12) {
                    int var13 = (var11 << 8) - -var12;
                    if (!var7 || var12 != 49 && ~var12 != -150 && var12 != 147 && var11 != 50 && (~var11 != -50 || var12 != 47)) {
                        class202.field3469[var10] = var13;
                        class170.field3025[var10] = class29.field427.method132(class212.method1372(2, new class66[] { class79.field1554, class144.method989(var11, 0), class26.field329, class144.method989(var12, 0) }), (byte) -82);
                        class223.field3806[var10] = class29.field427.method132(class212.method1372(2, new class66[] { class240.field4176, class144.method989(var11, 0), class26.field329, class144.method989(var12, arg0 + -95) }), (byte) -88);
                    } else {
                        class202.field3469[var10] = var13;
                        class170.field3025[var10] = -1;
                        class223.field3806[var10] = -1;
                    }
                    ++var10;
                }
            }
            class64.method432((byte) -12, var3, var8, false, var4, var2, var9);
        } else {
            int var15 = class84.field1627.method1676(arg0 + 24);
            int var16 = class84.field1627.method1674(arg0 + 1355769449);
            int var17 = class84.field1627.method1642(-15046);
            class84.field1627.method570(arg0 + 17);
            for (int var18 = 0; ~var18 > -5; ++var18) {
                for (int var35 = 0; ~var35 > -14; ++var35) {
                    for (int var36 = 0; ~var36 > -14; ++var36) {
                        int var37 = class84.field1627.method572((byte) 0, 1);
                        if (var37 == 1) {
                            class14.field180[var18][var35][var36] = class84.field1627.method572((byte) 0, 26);
                        } else {
                            class14.field180[var18][var35][var36] = -1;
                        }
                    }
                }
            }
            class84.field1627.method571((byte) -59);
            int var19 = (-class84.field1627.field4335 + class61.field1033) / 16;
            class77.field1533 = new int[var19][4];
            for (int var20 = 0; var20 < var19; ++var20) {
                for (int var34 = 0; ~var34 > -5; ++var34) {
                    class77.field1533[var20][var34] = class84.field1627.method1667((byte) 115);
                }
            }
            int var21 = class84.field1627.method1642(arg0 + -15141);
            int var22 = class84.field1627.method1642(arg0 ^ -15003);
            class57.field977 = new byte[var19][];
            class162.field2910 = null;
            class170.field3025 = new int[var19];
            class206.field3516 = null;
            class202.field3469 = new int[var19];
            class76.field1503 = new byte[var19][];
            class223.field3806 = new int[var19];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; ++var24) {
                for (int var25 = 0; ~var25 > -14; ++var25) {
                    for (int var26 = 0; var26 < 13; ++var26) {
                        int var27 = class14.field180[var24][var25][var26];
                        if (~var27 != 0) {
                            int var28 = 1023 & var27 >> 14;
                            int var29 = (var27 & 16383) >> 3;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < var23; ++var31) {
                                if (~class202.field3469[var31] == ~var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (~var30 != 0) {
                                int var32 = (var30 & 65282) >> 8;
                                int var33 = var30 & 255;
                                class202.field3469[var23] = var30;
                                class170.field3025[var23] = class29.field427.method132(class212.method1372(2, new class66[] { class79.field1554, class144.method989(var32, arg0 + -95), class26.field329, class144.method989(var33, class109.method741(arg0, 95)) }), (byte) -99);
                                class223.field3806[var23] = class29.field427.method132(class212.method1372(2, new class66[] { class240.field4176, class144.method989(var32, 0), class26.field329, class144.method989(var33, 0) }), (byte) -88);
                                ++var23;
                            }
                        }
                    }
                }
            }
            class64.method432((byte) -45, var21, var15, false, var17, var22, var16);
        }
        if (arg0 != 95) {
            field3234 = 18;
        }
        ++field3245;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(B)V")
    public static void method1236(byte arg0) {
        if (arg0 < 6) {
            field3232 = null;
        }
        field3232 = null;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(B)V")
    public static final void method1237(byte arg0) {
        if (class69.field1399 > class35.field527) {
            class35.field527 = (float) ((double) class35.field527 / 30.0D + (double) class35.field527);
            if (class69.field1399 < class35.field527) {
                class35.field527 = class69.field1399;
            }
            class167.method1130(-1);
        } else if (class69.field1399 < class35.field527) {
            class35.field527 = (float) ((double) class35.field527 - (double) class35.field527 / 30.0D);
            if (class69.field1399 > class35.field527) {
                class35.field527 = class69.field1399;
            }
            class167.method1130(-1);
        }
        ++field3244;
        if (~class214.field3684 != 0 && ~class15.field196 != 0) {
            int var1 = -class144.field2635 + class214.field3684;
            int var2 = class15.field196 - class192.field3323;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 4;
            }
            class144.field2635 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 4;
            }
            class192.field3323 += var2;
            if (~var1 == -1 && ~var2 == -1) {
                class214.field3684 = -1;
                class15.field196 = -1;
            }
            class167.method1130(-1);
        }
        if (arg0 >= -45) {
            method1231(72, -116, false);
        }
    }
}
