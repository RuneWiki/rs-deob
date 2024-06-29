import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class42 extends class199 {

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field609 = 0;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "Z")
    public static boolean field610 = true;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "[Lhg;")
    public static class220[] field611;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([Lpk;I[BIZIII)[I")
    public static final int[] method274(class44[] arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field615;
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
                        if (arg7 - -var10 > 0 && ~(arg7 + var10) > -104 && arg1 + var11 > 0 && arg1 + var11 < 103) {
                            arg0[var9].field728[arg7 + var10][arg1 + var11] = class51.method359(arg0[var9].field728[arg7 + var10][arg1 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class162 var12 = new class162(arg2);
        int var13 = arg6 - -arg7;
        int var14 = arg1 + arg3;
        for (int var15 = 0; var15 < var8; ++var15) {
            for (int var39 = 0; var39 < 64; ++var39) {
                for (int var40 = 0; ~var40 > -65; ++var40) {
                    class310.method2076(arg1 + var40, 0, 0, var13 + var39, var14 + var40, arg7 + var39, (byte) -98, var12, 0, arg4, var15, false);
                }
            }
        }
        if (arg5 != 103) {
            field609 = -88;
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field2568 < var12.field2573.length) {
            int var18 = var12.method1133((byte) 53);
            if (var18 == 128) {
                var16 = true;
                class184.field3019[0] = var12.method1142(-18970);
                class184.field3019[1] = var12.method1146(2);
                class184.field3019[2] = var12.method1146(2);
                class184.field3019[3] = var12.method1146(2);
                class184.field3019[4] = var12.method1142(-18970);
            } else {
                if (var18 != 129) {
                    --var12.field2568;
                    break;
                }
                var17 = true;
                for (int var19 = 0; var19 < 4; ++var19) {
                    byte var20 = var12.method1107((byte) -105);
                    if (var20 != 0) {
                        if (~var20 == -2) {
                            for (int var21 = 0; ~var21 > -65; var21 += 4) {
                                for (int var22 = 0; var22 < 64; var22 += 4) {
                                    byte var23 = var12.method1107((byte) -103);
                                    for (int var24 = var21 - -arg7; arg7 + 4 + var21 > var24; ++var24) {
                                        for (int var25 = arg1 + var22; ~var25 > ~(arg1 - -4 + var22); ++var25) {
                                            if (~var24 <= -1 && var24 < 104 && ~var25 <= -1 && ~var25 > -105) {
                                                class107.field1702[var19][var24][var25] = var23;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var20 == 2 && ~var19 < -1) {
                            int var26 = arg7;
                            int var27 = arg7 + 64;
                            if (~var27 > -1) {
                                var27 = 0;
                            } else if (var27 >= 104) {
                                var27 = 104;
                            }
                            if (arg7 >= 0) {
                                if (arg7 >= 104) {
                                    var26 = 104;
                                }
                            } else {
                                var26 = 0;
                            }
                            int var28 = arg1 + 64;
                            int var29 = arg1;
                            if (var28 < 0) {
                                var28 = 0;
                            } else if (~var28 <= -105) {
                                var28 = 104;
                            }
                            if (~arg1 <= -1) {
                                if (arg1 >= 104) {
                                    var29 = 104;
                                }
                            } else {
                                var29 = 0;
                            }
                            while (~var27 < ~var26) {
                                while (var28 > var29) {
                                    class107.field1702[var19][var26][var29] = class107.field1702[var19 + -1][var26][var29];
                                    ++var29;
                                }
                                ++var26;
                            }
                        }
                    } else {
                        int var30 = arg1 + 64;
                        int var31 = arg7 + 64;
                        int var32 = arg7;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (~var30 <= -105) {
                            var30 = 104;
                        }
                        if (arg7 >= 0) {
                            if (arg7 >= 104) {
                                var32 = 104;
                            }
                        } else {
                            var32 = 0;
                        }
                        if (~var31 <= -1) {
                            if (~var31 <= -105) {
                                var31 = 104;
                            }
                        } else {
                            var31 = 0;
                        }
                        int var33 = arg1;
                        if (~arg1 > -1) {
                            var33 = 0;
                        } else if (arg1 >= 104) {
                            var33 = 104;
                        }
                        while (var32 < var31) {
                            while (~var33 > ~var30) {
                                class107.field1702[var19][var32][var33] = 0;
                                ++var33;
                            }
                            ++var32;
                        }
                    }
                }
            }
        }
        if (!var17) {
            for (int var34 = 0; var34 < 4; ++var34) {
                for (int var35 = 0; ~var35 > -17; ++var35) {
                    for (int var36 = 0; var36 < 16; ++var36) {
                        int var37 = (arg7 >> 2) + var35;
                        int var38 = (arg1 >> 2) + var36;
                        if (~var37 <= -1 && var37 < 26 && var38 >= 0 && ~var38 > -27) {
                            class107.field1702[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class184.field3019;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        ++field613;
        int var3 = 92 / ((arg1 - 37) / 38);
        int[][] var4 = super.field1886.method419(arg0, (byte) 2);
        if (super.field1886.field1022 && this.method1386(-107)) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int var8 = arg0 % super.field3206 * super.field3206;
            for (int var9 = 0; var9 < class168.field2737; ++var9) {
                int var10 = super.field3202[var9 % super.field3208 + var8];
                var6[var9] = class51.method359(var10 << 4, 4080);
                var7[var9] = class51.method359(65280, var10) >> 4;
                var5[var9] = class51.method359(var10, 16711680) >> 12;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    public static void method275(byte arg0) {
        field611 = null;
        if (arg0 != -73) {
            method277((class162) null, -39, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)V")
    public static final void method276(int arg0, int arg1) {
        if (class22.field272 == arg0) {
            class84.field1392.method2099(arg1, (byte) -103);
        } else {
            class236.field3800 = arg1;
        }
        ++field616;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lwd;IB)V")
    public static final void method277(class162 arg0, int arg1, byte arg2) {
        if (class87.field1433 != null) {
            try {
                class87.field1433.method580(false, 0L);
                class87.field1433.method579((byte) -101, arg0.field2573, 24, arg1);
            } catch (Exception var3) {
            }
        }
        ++field614;
        if (arg2 != 11) {
            method275((byte) 54);
        }
    }
}
