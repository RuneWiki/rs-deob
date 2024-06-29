import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class172 extends class142 {

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
    private int field3329 = -1;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "[I")
    public static int[] field3319 = new int[25];

    @OriginalMember(owner = "client!t", name = "T", descriptor = "Z")
    public static boolean field3322 = false;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field3324 = 0;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "[Z")
    public static boolean[] field3336 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!t", name = "db", descriptor = "Z")
    public static boolean field3332;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "[I")
    public int[] field3325;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)[[I")
    public int[][] method86(int arg0, boolean arg1) {
        ++field3333;
        int[][] var3 = super.field2666.method956(arg0, -127);
        if (super.field2666.field2664 && this.method1128(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class13.field219 == ~this.field3328 ? arg0 : this.field3328 * arg0 / class13.field219) * this.field3327;
            if (class133.field2499 != this.field3327) {
                for (int var8 = 0; class133.field2499 > var8; ++var8) {
                    int var9 = this.field3327 * var8 / class133.field2499;
                    int var10 = this.field3325[var7 - -var9];
                    var6[var8] = class123.method861(var10, 255) << 4;
                    var5[var8] = class123.method861(4080, var10 >> 4);
                    var4[var8] = class123.method861(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class133.field2499; ++var11) {
                    int var12 = this.field3325[var7++];
                    var6[var11] = class123.method861(255, var12) << 4;
                    var5[var11] = class123.method861(65280, var12) >> 4;
                    var4[var11] = class123.method861(4080, var12 >> 12);
                }
            }
        }
        return arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)Z")
    public final boolean method1128(int arg0) {
        ++field3326;
        if (this.field3325 != null) {
            return true;
        } else if (~this.field3329 <= -1) {
            class17 var2 = class66.method435(this.field3329, class56.field986, arg0 + 16259);
            var2.method113();
            this.field3327 = var2.field257;
            this.field3325 = var2.field258;
            this.field3328 = var2.field261;
            return true;
        } else {
            if (arg0 != 0) {
                this.field3325 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)I")
    public final int method966(byte arg0) {
        if (arg0 <= 70) {
            field3319 = null;
        }
        ++field3331;
        return this.field3329;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public static final void method1129(int arg0) {
        ++field3321;
        int var1 = 49 % ((-57 - arg0) / 32);
        for (int var2 = 0; ~class34.field532 < ~var2; ++var2) {
            int var3 = class160.field3076[var2];
            class38 var4 = class2.field10[var3];
            int var5 = class74.field1273.method767(true);
            if (~(16 & var5) != -1) {
                var5 += class74.field1273.method767(true) << 8;
            }
            class125.method867(var5, var4, var3, 4);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field3334;
        if (arg2 < -34) {
            if (arg1 == 0) {
                this.field3329 = arg0.method762((byte) 93);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(JB)V")
    public static final void method1130(long arg0, byte arg1) {
        ++field3335;
        if (arg1 != -79) {
            method1133((byte) 127);
        }
        if (arg0 > 0L) {
            if (~(arg0 % 10L) == -1L) {
                class75.method463(arg0 + -1L, (byte) 69);
                class75.method463(1L, (byte) 69);
            } else {
                class75.method463(arg0, (byte) 69);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
    public static void method1131(int arg0) {
        field3319 = null;
        if (arg0 >= -126) {
            field3332 = true;
        }
        field3336 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class172() {
        super(0, false);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BZ)V")
    public static final void method1132(byte arg0, boolean arg1) {
        class35.field554 = arg1;
        if (arg0 != -78) {
            method1132((byte) 87, false);
        }
        ++field3320;
        if (!class35.field554) {
            int var2 = class74.field1273.method780(10664);
            int var3 = class74.field1273.method795(-1);
            int var4 = class74.field1273.method762((byte) 80);
            int var5 = (-class74.field1273.field2170 + class154.field2972) / 16;
            class142.field2682 = new int[var5][4];
            for (int var6 = 0; var5 > var6; ++var6) {
                for (int var14 = 0; var14 < 4; ++var14) {
                    class142.field2682[var6][var14] = class74.field1273.method760(-258911864);
                }
            }
            int var7 = class74.field1273.method775(-77);
            int var8 = class74.field1273.method801(arg0 + -51);
            class203.field3961 = new int[var5];
            class140.field2638 = new int[var5];
            boolean var9 = false;
            if ((var4 / 8 == 48 || ~(var4 / 8) == -50) && var3 / 8 == 48) {
                var9 = true;
            }
            class67.field1169 = new byte[var5][];
            class30.field472 = new int[var5];
            class24.field371 = new byte[var5][];
            int var10 = 0;
            if (~(var4 / 8) == -49 && ~(var3 / 8) == -149) {
                var9 = true;
            }
            for (int var11 = (var4 + -6) / 8; (var4 + 6) / 8 >= var11; ++var11) {
                for (int var12 = (var3 + -6) / 8; (var3 + 6) / 8 >= var12; ++var12) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && ~var12 != -150 && var12 != 147 && var11 != 50 && (~var11 != -50 || var12 != 47)) {
                        class140.field2638[var10] = var13;
                        class203.field3961[var10] = class186.field3538.method156(0, class67.method440(0, new class10[] { class47.field820, class119.method846(arg0 + 78, var11), class121.field2336, class119.method846(0, var12) }));
                        class30.field472[var10] = class186.field3538.method156(0, class67.method440(0, new class10[] { class73.field1248, class119.method846(0, var11), class121.field2336, class119.method846(0, var12) }));
                        ++var10;
                    }
                }
            }
            class30.method199(var7, true, var2, var8, var3, var4);
        } else {
            int var15 = class74.field1273.method780(10664);
            int var16 = class74.field1273.method780(10664);
            int var17 = class74.field1273.method762((byte) 94);
            int var18 = class74.field1273.method762((byte) 95);
            int var19 = class74.field1273.method806(0);
            class74.field1273.method634(true);
            for (int var20 = 0; ~var20 > -5; ++var20) {
                for (int var35 = 0; ~var35 > -14; ++var35) {
                    for (int var36 = 0; var36 < 13; ++var36) {
                        int var37 = class74.field1273.method638(1, (byte) -126);
                        if (var37 != 1) {
                            class49.field853[var20][var35][var36] = -1;
                        } else {
                            class49.field853[var20][var35][var36] = class74.field1273.method638(26, (byte) -124);
                        }
                    }
                }
            }
            class74.field1273.method637(true);
            int var21 = (-class74.field1273.field2170 + class154.field2972) / 16;
            class142.field2682 = new int[var21][4];
            for (int var22 = 0; var21 > var22; ++var22) {
                for (int var34 = 0; var34 < 4; ++var34) {
                    class142.field2682[var22][var34] = class74.field1273.method790(8);
                }
            }
            class140.field2638 = new int[var21];
            class67.field1169 = new byte[var21][];
            class203.field3961 = new int[var21];
            class24.field371 = new byte[var21][];
            class30.field472 = new int[var21];
            int var23 = 0;
            for (int var24 = 0; ~var24 > -5; ++var24) {
                for (int var25 = 0; var25 < 13; ++var25) {
                    for (int var26 = 0; ~var26 > -14; ++var26) {
                        int var27 = class49.field853[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = 1023 & var27 >> 14;
                            int var29 = var27 >> 3 & 2047;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; ~var31 > ~var23; ++var31) {
                                if (class140.field2638[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class140.field2638[var23] = var30;
                                int var32 = (65295 & var30) >> 8;
                                int var33 = 255 & var30;
                                class203.field3961[var23] = class186.field3538.method156(0, class67.method440(0, new class10[] { class47.field820, class119.method846(0, var32), class121.field2336, class119.method846(0, var33) }));
                                class30.field472[var23] = class186.field3538.method156(0, class67.method440(0, new class10[] { class73.field1248, class119.method846(0, var32), class121.field2336, class119.method846(arg0 + 78, var33) }));
                                ++var23;
                            }
                        }
                    }
                }
            }
            class30.method199(var18, true, var15, var19, var16, var17);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)I")
    public static final int method1133(byte arg0) {
        if (arg0 != 108) {
            field3324 = -34;
        }
        ++field3323;
        return class102.field1912++;
    }
}
