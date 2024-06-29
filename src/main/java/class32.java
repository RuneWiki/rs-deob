import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class32 extends class34 {

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
    private int field571 = -1;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "Ljava/lang/String;")
    public static String field568 = "Loading sprites - ";

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field575 = "Please remove ";

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!fj", name = "cb", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!fj", name = "db", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!fj", name = "eb", descriptor = "[I")
    public int[] field580;

    @OriginalMember(owner = "client!fj", name = "fb", descriptor = "[[I")
    public static int[][] field581;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)Z")
    public final boolean method215(boolean arg0) {
        ++field576;
        if (this.field580 != null) {
            return true;
        } else {
            if (arg0) {
                method221(-1, -126, (class78[]) null, -121, true, (byte[]) null, 3, 85);
            }
            if (~this.field571 <= -1) {
                class289 var2 = class178.field2606 >= 0 ? class150.method1021(class64.field1072, class178.field2606, 27030, this.field571) : class293.method1935(class64.field1072, this.field571, (byte) -29);
                var2.method1914();
                this.field580 = var2.field4397;
                this.field579 = var2.field3948;
                this.field569 = var2.field3936;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method216(int arg0, String arg1, int arg2) {
        ++field566;
        class105 var3 = class9.method72(3, -1, arg2);
        var3.method763(false);
        int var4 = 22 % ((arg0 - -69) / 33);
        var3.field1550 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[[I")
    public int[][] method52(byte arg0, int arg1) {
        int var3 = 33 % ((-54 - arg0) / 44);
        ++field578;
        int[][] var4 = super.field618.method91(115, arg1);
        if (super.field618.field211 && this.method215(false)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = (class259.field3965 == this.field569 ? arg1 : this.field569 * arg1 / class259.field3965) * this.field579;
            if (~class226.field3527 != ~this.field579) {
                for (int var9 = 0; ~class226.field3527 < ~var9; ++var9) {
                    int var10 = this.field579 * var9 / class226.field3527;
                    int var11 = this.field580[var8 - -var10];
                    var7[var9] = class131.method904(var11, 255) << 4;
                    var6[var9] = class131.method904(var11 >> 4, 4080);
                    var5[var9] = class131.method904(4080, var11 >> 12);
                }
            } else {
                for (int var12 = 0; class226.field3527 > var12; ++var12) {
                    int var13 = this.field580[var8++];
                    var7[var12] = class131.method904(255, var13) << 4;
                    var6[var12] = class131.method904(var13, 65280) >> 4;
                    var5[var12] = class131.method904(16711680, var13) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (~arg1 == -1) {
            this.field571 = arg2.method423(arg0 + 43);
        }
        ++field573;
        if (arg0 != 6) {
            this.method220(true);
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public final void method217(int arg0) {
        super.method217(arg0 + arg0);
        ++field567;
        this.field580 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILpk;)V")
    public static final void method218(int arg0, class237 arg1) {
        if (arg0 != 16711680) {
            method218(-106, (class237) null);
        }
        ++field577;
        class101.field1483 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
    public static void method219(int arg0) {
        field568 = null;
        field581 = null;
        if (arg0 != 0) {
            field568 = null;
        }
        field575 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
    public final int method220(boolean arg0) {
        if (arg0) {
            this.method220(false);
        }
        ++field572;
        return this.field571;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[Lql;IZ[BII)[I")
    public static final int[] method221(int arg0, int arg1, class78[] arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        ++field565;
        byte var8;
        if (!arg4) {
            var8 = 4;
        } else {
            var8 = 1;
        }
        if (!arg4) {
            for (int var9 = 0; ~var9 > -5; ++var9) {
                for (int var10 = 0; ~var10 > -65; ++var10) {
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        if (~(arg7 + var10) < -1 && ~(arg7 - -var10) > -104 && arg0 + var11 > 0 && arg0 + var11 < 103) {
                            arg2[var9].field1223[arg7 - -var10][arg0 - -var11] = class131.method904(arg2[var9].field1223[arg7 - -var10][arg0 - -var11], -2097153);
                        }
                    }
                }
            }
        }
        class54 var12 = new class54(arg5);
        int var13 = arg1 - -arg7;
        int var14 = arg0 + arg6;
        if (arg3 >= -109) {
            field568 = null;
        }
        for (int var15 = 0; var15 < var8; ++var15) {
            for (int var39 = 0; ~var39 > -65; ++var39) {
                for (int var40 = 0; ~var40 > -65; ++var40) {
                    class90.method687(var15, var12, 0, arg0 + var40, 0, false, -8439, var39 - -arg7, arg4, var14 + var40, 0, var13 + var39);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (~var12.field887 > ~var12.field848.length) {
            int var18 = var12.method407(255);
            if (var18 == 128) {
                class175.field2555[0] = var12.method423(-98);
                var17 = true;
                class175.field2555[1] = var12.method457((byte) 95);
                class175.field2555[2] = var12.method457((byte) 46);
                class175.field2555[3] = var12.method457((byte) 77);
                class175.field2555[4] = var12.method423(-121);
            } else {
                if (var18 != 129) {
                    --var12.field887;
                    break;
                }
                var16 = true;
                for (int var19 = 0; ~var19 > -5; ++var19) {
                    byte var20 = var12.method459(false);
                    if (~var20 != -1) {
                        if (var20 == 1) {
                            for (int var21 = 0; ~var21 > -65; var21 += 4) {
                                for (int var22 = 0; var22 < 64; var22 += 4) {
                                    byte var23 = var12.method459(false);
                                    for (int var24 = var21 - -arg7; var24 < arg7 - -4 + var21; ++var24) {
                                        for (int var25 = arg0 + var22; ~var25 > ~(arg0 + var22 + 4); ++var25) {
                                            if (~var24 <= -1 && var24 < 104 && var25 >= 0 && ~var25 > -105) {
                                                class23.field383[var19][var24][var25] = var23;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (~var20 == -3 && var19 > 0) {
                            int var26 = arg7 + 64;
                            int var27 = arg7;
                            int var28 = arg0;
                            int var29 = arg0 + 64;
                            if (var26 >= 0) {
                                if (var26 >= 104) {
                                    var26 = 104;
                                }
                            } else {
                                var26 = 0;
                            }
                            if (~arg0 > -1) {
                                var28 = 0;
                            } else if (~arg0 <= -105) {
                                var28 = 104;
                            }
                            if (~arg7 > -1) {
                                var27 = 0;
                            } else if (arg7 >= 104) {
                                var27 = 104;
                            }
                            if (~var29 <= -1) {
                                if (var29 >= 104) {
                                    var29 = 104;
                                }
                            } else {
                                var29 = 0;
                            }
                            while (~var27 > ~var26) {
                                while (~var28 > ~var29) {
                                    class23.field383[var19][var27][var28] = class23.field383[var19 + -1][var27][var28];
                                    ++var28;
                                }
                                ++var27;
                            }
                        }
                    } else {
                        int var30 = arg7 - -64;
                        int var31 = arg7;
                        if (arg7 >= 0) {
                            if (~arg7 <= -105) {
                                var31 = 104;
                            }
                        } else {
                            var31 = 0;
                        }
                        int var32 = arg0;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (~var30 <= -105) {
                            var30 = 104;
                        }
                        int var33 = arg0 + 64;
                        if (arg0 < 0) {
                            var32 = 0;
                        } else if (arg0 >= 104) {
                            var32 = 104;
                        }
                        if (~var33 <= -1) {
                            if (~var33 <= -105) {
                                var33 = 104;
                            }
                        } else {
                            var33 = 0;
                        }
                        while (var31 < var30) {
                            while (~var33 < ~var32) {
                                class23.field383[var19][var31][var32] = 0;
                                ++var32;
                            }
                            ++var31;
                        }
                    }
                }
            }
        }
        if (!var16) {
            for (int var34 = 0; var34 < 4; ++var34) {
                for (int var35 = 0; var35 < 16; ++var35) {
                    for (int var36 = 0; var36 < 16; ++var36) {
                        int var37 = (arg7 >> 2) + var35;
                        int var38 = (arg0 >> 2) + var36;
                        if (~var37 <= -1 && var37 < 26 && var38 >= 0 && var38 < 26) {
                            class23.field383[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        if (!var17) {
            return null;
        } else {
            return class175.field2555;
        }
    }
}
