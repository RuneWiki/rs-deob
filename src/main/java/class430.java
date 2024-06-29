import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class430 extends class346 {

    @OriginalMember(owner = "client!va", name = "L", descriptor = "[I")
    public static int[] field6246 = new int[5];

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field6249 = 0;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field6250 = 0;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "Ll;")
    public static class315 field6247;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 6)
    public class430() {
        super(1, true);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IC)Z", line = 9)
    public static final boolean method2683(int arg0, char arg1) {
        ++field6245;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class204.method1352(-98, arg1)) {
            return true;
        } else {
            char[] var2 = class297.field4481;
            for (int var3 = 0; var2.length > var3; ++var3) {
                char var7 = var2[var3];
                if (~arg1 == ~var7) {
                    return true;
                }
            }
            char[] var4 = class372.field5492;
            for (int var5 = arg0; var4.length > var5; ++var5) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 51)
    public static void method2684(int arg0) {
        field6246 = null;
        if (arg0 > 67) {
            field6247 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZ)V", line = 62)
    public static final void method2685(boolean arg0, boolean arg1) {
        ++field6242;
        class48.field743 = arg1;
        if (!arg0) {
            if (!class48.field743) {
                int var2 = class27.field471.method2230(1939718792);
                int var3 = class27.field471.method2265(false);
                boolean var4 = class27.field471.method2233((byte) 104) == 1;
                int var5 = (-class27.field471.field5049 + class20.field342) / 16;
                class338.field4996 = new int[var5][4];
                for (int var6 = 0; var6 < var5; ++var6) {
                    for (int var16 = 0; var16 < 4; ++var16) {
                        class338.field4996[var6][var16] = class27.field471.method2226(-1);
                    }
                }
                int var7 = class27.field471.method2238(126);
                int var8 = class27.field471.method2228(-128);
                int var9 = class27.field471.method2265(false);
                int var10 = class27.field471.method2238(86);
                class361.method2375(true, var7);
                class166.field2249 = new int[var5];
                class9.field169 = null;
                class290.field4391 = null;
                class6.field81 = new byte[var5][];
                class312.field4601 = new byte[var5][];
                class184.field2464 = new int[var5];
                class238.field3324 = new byte[var5][];
                class436.field6331 = new int[var5];
                class51.field797 = new int[var5];
                class51.field791 = new int[var5];
                class243.field3411 = new byte[var5][];
                boolean var11 = false;
                if ((~(var8 / 8) == -49 || ~(var8 / 8) == -50) && ~(var2 / 8) == -49) {
                    var11 = true;
                }
                int var12 = 0;
                if (~(var8 / 8) == -49 && ~(var2 / 8) == -149) {
                    var11 = true;
                }
                for (int var13 = (-(class351.field5217 >> 4) + var8) / 8; ~((var8 - -(class351.field5217 >> 4)) / 8) <= ~var13; ++var13) {
                    for (int var14 = (-(class143.field1815 >> 4) + var2) / 8; ~(((class143.field1815 >> 4) + var2) / 8) <= ~var14; ++var14) {
                        int var15 = (var13 << 8) + var14;
                        if (!var11 || ~var14 != -50 && var14 != 149 && var14 != 147 && ~var13 != -51 && (~var13 != -50 || ~var14 != -48)) {
                            class166.field2249[var12] = var15;
                            class51.field791[var12] = class68.field992.method1220("m" + var13 + "_" + var14, 0);
                            class51.field797[var12] = class68.field992.method1220("l" + var13 + "_" + var14, 0);
                            class184.field2464[var12] = class68.field992.method1220("um" + var13 + "_" + var14, 0);
                            class436.field6331[var12] = class68.field992.method1220("ul" + var13 + "_" + var14, 0);
                        } else {
                            class166.field2249[var12] = var15;
                            class51.field791[var12] = -1;
                            class51.field797[var12] = -1;
                            class184.field2464[var12] = -1;
                            class436.field6331[var12] = -1;
                        }
                        ++var12;
                    }
                }
                class199.method1317(false, var9, var4, var10, var2, var8, var3, 118);
            } else {
                int var17 = class27.field471.method2233((byte) 104);
                boolean var18 = class27.field471.method2207(126) == 1;
                int var19 = class27.field471.method2265(arg0);
                int var20 = class27.field471.method2265(false);
                int var21 = class27.field471.method2239(-1076227960);
                int var22 = class27.field471.method2228(-128);
                int var23 = class27.field471.method2238(84);
                class361.method2375(true, var23);
                class27.field471.method1839((byte) 95);
                for (int var24 = 0; var24 < 4; ++var24) {
                    for (int var39 = 0; class351.field5217 >> 3 > var39; ++var39) {
                        for (int var40 = 0; class143.field1815 >> 3 > var40; ++var40) {
                            int var41 = class27.field471.method1832(1, (byte) -125);
                            if (~var41 != -2) {
                                class318.field4679[var24][var39][var40] = -1;
                            } else {
                                class318.field4679[var24][var39][var40] = class27.field471.method1832(26, (byte) -109);
                            }
                        }
                    }
                }
                class27.field471.method1831(-15939);
                int var25 = (-class27.field471.field5049 + class20.field342) / 16;
                class338.field4996 = new int[var25][4];
                for (int var26 = 0; var26 < var25; ++var26) {
                    for (int var38 = 0; var38 < 4; ++var38) {
                        class338.field4996[var26][var38] = class27.field471.method2232(-118);
                    }
                }
                class243.field3411 = new byte[var25][];
                class290.field4391 = null;
                class436.field6331 = new int[var25];
                class238.field3324 = new byte[var25][];
                class166.field2249 = new int[var25];
                class184.field2464 = new int[var25];
                class6.field81 = new byte[var25][];
                class9.field169 = null;
                class312.field4601 = new byte[var25][];
                class51.field791 = new int[var25];
                class51.field797 = new int[var25];
                int var27 = 0;
                for (int var28 = 0; ~var28 > -5; ++var28) {
                    for (int var29 = 0; class351.field5217 >> 3 > var29; ++var29) {
                        for (int var30 = 0; ~(class143.field1815 >> 3) < ~var30; ++var30) {
                            int var31 = class318.field4679[var28][var29][var30];
                            if (var31 != -1) {
                                int var32 = (var31 & 16769800) >> 14;
                                int var33 = 2047 & var31 >> 3;
                                int var34 = (var32 / 8 << 8) + var33 / 8;
                                for (int var35 = 0; ~var27 < ~var35; ++var35) {
                                    if (~class166.field2249[var35] == ~var34) {
                                        var34 = -1;
                                        break;
                                    }
                                }
                                if (var34 != -1) {
                                    class166.field2249[var27] = var34;
                                    int var36 = var34 >> 8 & 255;
                                    int var37 = 255 & var34;
                                    class51.field791[var27] = class68.field992.method1220("m" + var36 + "_" + var37, 0);
                                    class51.field797[var27] = class68.field992.method1220("l" + var36 + "_" + var37, 0);
                                    class184.field2464[var27] = class68.field992.method1220("um" + var36 + "_" + var37, 0);
                                    class436.field6331[var27] = class68.field992.method1220("ul" + var36 + "_" + var37, 0);
                                    ++var27;
                                }
                            }
                        }
                    }
                }
                class199.method1317(false, var21, var18, var17, var20, var19, var22, 106);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(II)I", line = 317)
    public static final int method2686(int arg0, int arg1) {
        ++field6244;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 16;
        }
        int var3 = -39 / ((arg0 - -1) / 61);
        if (~arg1 <= -257) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 2;
            var2 += 2;
        }
        if (~arg1 <= -2) {
            ++var2;
            arg1 >>>= 1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)[I", line = 364)
    public final int[] method45(int arg0, int arg1) {
        ++field6248;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (arg1 != 3) {
            field6249 = 31;
        }
        if (super.field5152.field3004) {
            int[][] var4 = this.method2293(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class134.field1753; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] - -var6[var8]) / 3;
            }
        }
        return var3;
    }
}
