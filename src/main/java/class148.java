import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class148 extends class398 {

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "[I")
    private int[] field2024 = new int[3];

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private int field2025 = 409;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    private int field2020 = 4096;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    private int field2033 = 4096;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    private int field2023 = 4096;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "Lhe;")
    public static class30 field2032 = new class30(0, 0);

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "Ljava/lang/String;")
    public static String field2034 = "Loaded fonts";

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field2037 = new String[200];

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "Llm;")
    public static class347 field2035;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Ljava/lang/String;")
    public static final String method936(byte arg0) {
        ++field2021;
        String var1 = "www";
        if (class61.field803 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (arg0 != -110) {
            return null;
        } else {
            if (class174.field2328 != null) {
                var2 = "/p=" + class174.field2328;
            }
            return ~class71.field1017 == -2 ? "http://" + var1 + ".stellardawn.com/l=" + class177.field2337 + "/a=" + class223.field2944 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class177.field2337 + "/a=" + class223.field2944 + var2 + "/";
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field2028;
        if (arg2 != -13132) {
            method938(117, -107, (class394) null);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method1333((byte) -122);
                            this.field2024[2] = class183.method1117(var5, 255) >> 12;
                            this.field2024[1] = class183.method1117(65280, var5) >> 4;
                            this.field2024[0] = class183.method1117(267386880, var5 << 4);
                        }
                    } else {
                        this.field2020 = arg0.method1343(arg2 + 13387);
                    }
                } else {
                    this.field2033 = arg0.method1343(255);
                }
            } else {
                this.field2023 = arg0.method1343(arg2 + 13387);
            }
        } else {
            this.field2025 = arg0.method1343(arg2 ^ -13237);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field2032 = null;
        field2034 = null;
        field2037 = null;
        if (arg0 > -2) {
            field2034 = null;
        }
        field2035 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILps;)I")
    public static final int method938(int arg0, int arg1, class394 arg2) {
        ++field2030;
        if (arg2.field5761 != null && ~arg1 > ~arg2.field5761.length) {
            try {
                int[] var3 = arg2.field5761[arg1];
                int var4 = 0;
                int var5 = 0;
                if (arg0 != -8) {
                    return -11;
                } else {
                    byte var6 = 0;
                    while (true) {
                        int var7 = var3[var5++];
                        int var8 = 0;
                        byte var9 = 0;
                        if (~var7 == -1) {
                            return var4;
                        }
                        if (var7 == 1) {
                            var8 = class75.field1074[var3[var5++]];
                        }
                        if (var7 == 2) {
                            var8 = class16.field219[var3[var5++]];
                        }
                        if (~var7 == -4) {
                            var8 = class138.field1906[var3[var5++]];
                        }
                        if (var7 == 4) {
                            int var10 = var3[var5++] << 16;
                            int var11 = var10 + var3[var5++];
                            class394 var12 = class196.method1168((byte) -115, var11);
                            int var13 = var3[var5++];
                            if (~var13 != 0 && (!class9.method74(var13, (byte) 61).field1166 || class390.field5614)) {
                                for (int var14 = 0; var12.field5777.length > var14; ++var14) {
                                    if (~(var13 + 1) == ~var12.field5777[var14]) {
                                        var8 += var12.field5776[var14];
                                    }
                                }
                            }
                        }
                        if (~var7 == -6) {
                            var8 = class191.field2561[var3[var5++]];
                        }
                        if (var7 == 6) {
                            var8 = class416.field6103[class16.field219[var3[var5++]] - 1];
                        }
                        if (~var7 == -8) {
                            var8 = class191.field2561[var3[var5++]] * 100 / 46875;
                        }
                        if (var7 == 8) {
                            var8 = class227.field2988.field343;
                        }
                        if (~var7 == -10) {
                            for (int var15 = 0; var15 < 25; ++var15) {
                                if (class23.field301[var15]) {
                                    var8 += class16.field219[var15];
                                }
                            }
                        }
                        if (var7 == 10) {
                            int var16 = var3[var5++] << 16;
                            int var17 = var16 + var3[var5++];
                            class394 var18 = class196.method1168((byte) -90, var17);
                            int var19 = var3[var5++];
                            if (~var19 != 0 && (!class9.method74(var19, (byte) -98).field1166 || class390.field5614)) {
                                for (int var20 = 0; var18.field5777.length > var20; ++var20) {
                                    if (var19 + 1 == var18.field5777[var20]) {
                                        var8 = 999999999;
                                        break;
                                    }
                                }
                            }
                        }
                        if (~var7 == -12) {
                            var8 = class131.field1808;
                        }
                        if (~var7 == -13) {
                            var8 = class115.field1610;
                        }
                        if (var7 == 13) {
                            int var21 = class191.field2561[var3[var5++]];
                            int var22 = var3[var5++];
                            var8 = (1 << var22 & var21) != 0 ? 1 : 0;
                        }
                        if (~var7 == -16) {
                            var9 = 1;
                        }
                        if (~var7 == -15) {
                            int var23 = var3[var5++];
                            var8 = class317.method2138(65536, var23);
                        }
                        if (~var7 == -17) {
                            var9 = 2;
                        }
                        if (~var7 == -19) {
                            var8 = (class227.field2988.field740 >> 7) + class7.field138;
                        }
                        if (var7 == 17) {
                            var9 = 3;
                        }
                        if (var7 == 19) {
                            var8 = (class227.field2988.field734 >> 7) + class200.field2660;
                        }
                        if (var7 == 20) {
                            var8 = var3[var5++];
                        }
                        if (var9 != 0) {
                            var6 = var9;
                        } else {
                            if (~var6 == -1) {
                                var4 += var8;
                            }
                            if (var6 == 1) {
                                var4 -= var8;
                            }
                            if (~var6 == -3 && ~var8 != -1) {
                                var4 /= var8;
                            }
                            if (~var6 == -4) {
                                var4 *= var8;
                            }
                            var6 = 0;
                        }
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[II)[I")
    public static final int[] method939(int arg0, int[] arg1, int arg2) {
        ++field2029;
        int[] var3 = new int[1152];
        int var4 = 0;
        int var5 = -24 % ((arg2 - 60) / 59);
        for (int var6 = 0; ~var6 > -33; ++var6) {
            for (int var7 = 0; ~var7 > -37; ++var7) {
                int var8 = arg1[var4];
                if (~var8 == -1) {
                    if (~var7 < -1 && ~arg1[var4 + -1] != -1) {
                        var8 = arg0;
                    } else if (var6 > 0 && arg1[var4 + -36] != 0) {
                        var8 = arg0;
                    } else if (~var7 > -36 && arg1[var4 + 1] != 0) {
                        var8 = arg0;
                    } else if (var6 < 31 && ~arg1[var4 + 36] != -1) {
                        var8 = arg0;
                    }
                }
                var3[var4++] = var8;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)V")
    public static final void method940(int arg0, boolean arg1) {
        ++field2026;
        class263 var2 = class47.method337(3, 0, arg0);
        if (arg1) {
            var2.method1806(!arg1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILii;)V")
    public static final void method941(int arg0, int arg1, class405 arg2) {
        ++field2022;
        class17.method113(arg2);
        if (~arg1 < -2) {
            for (int var3 = 0; ~var3 > ~class192.field2574; ++var3) {
                for (int var4 = 0; ~var4 > ~class364.field5262; ++var4) {
                    if (~(2 & class103.field1430[1][var3][var4]) == -3) {
                        class99.method675(var3, var4);
                    }
                }
            }
        }
        if (arg0 != 1) {
            field2037 = null;
        }
        for (int var5 = 0; ~arg1 < ~var5; ++var5) {
            for (int var6 = 0; ~var6 >= ~class364.field5262; ++var6) {
                for (int var7 = 0; class192.field2574 >= var7; ++var7) {
                    if (~(1 & class248.field3341[var5][var7][var6]) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (~class364.field5262 < ~var9 && ~(1 & class248.field3341[var5][var7][var9 + 1]) != -1) {
                            ++var9;
                        }
                        while (~var8 < -1 && (class248.field3341[var5][var7][var8 - 1] & 1) != 0) {
                            --var8;
                        }
                        label170: while (~var10 < -1) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if (~(class248.field3341[var10 - 1][var7][var12] & 1) == -1) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (~var11 > -4) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if (~(1 & class248.field3341[var11 + 1][var7][var13]) == -1) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var11 - -1 - var10) * (-var8 + var9 - -1);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = class331.field4817[var11][var7][var8] + -var15;
                            int var17 = class331.field4817[var10][var7][var8];
                            class28.method200(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 - -128, var16, var17);
                            for (int var18 = var10; var18 <= var11; ++var18) {
                                for (int var19 = var8; var9 >= var19; ++var19) {
                                    class248.field3341[var18][var7][var19] = (byte) class183.method1117(class248.field3341[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & class248.field3341[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && ~(class248.field3341[var5][var20 + -1][var6] & 2) != -1) {
                            --var20;
                        }
                        while (class192.field2574 > var21 && (2 & class248.field3341[var5][var21 - -1][var6]) != 0) {
                            ++var21;
                        }
                        int var23 = var5;
                        label223: while (var22 > 0) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if (~(class248.field3341[var22 + -1][var24][var6] & 2) == -1) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if (~(2 & class248.field3341[var23 - -1][var25][var6]) == -1) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 + 1 - var22) * (var21 - -1 + -var20);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class331.field4817[var23][var20][var6] + -var27;
                            int var29 = class331.field4817[var22][var20][var6];
                            class28.method200(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; var31 <= var21; ++var31) {
                                    class248.field3341[var30][var31][var6] = (byte) class183.method1117(class248.field3341[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class248.field3341[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && ~(4 & class248.field3341[var5][var7][var34 + -1]) != -1) {
                            --var34;
                        }
                        while (class364.field5262 > var35 && ~(class248.field3341[var5][var7][var35 + 1] & 4) != -1) {
                            ++var35;
                        }
                        label277: while (~var32 < -1) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if ((class248.field3341[var5][var32 + -1][var36] & 4) == 0) {
                                    break label277;
                                }
                            }
                            --var32;
                        }
                        label266: while (~class192.field2574 < ~var33) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if (~(class248.field3341[var5][var33 + 1][var37] & 4) == -1) {
                                    break label266;
                                }
                            }
                            ++var33;
                        }
                        if ((var33 + 1 - var32) * (var35 - -1 + -var34) >= 4) {
                            int var38 = class331.field4817[var5][var32][var34];
                            class28.method200(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                for (int var40 = var34; var35 >= var40; ++var40) {
                                    class248.field3341[var5][var39][var40] = (byte) class183.method1117(class248.field3341[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)[[I")
    public final int[][] method99(int arg0, int arg1) {
        ++field2027;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (arg1 != 2) {
            return null;
        } else {
            if (super.field5933.field4847) {
                int[][] var4 = this.method2561(arg0, (byte) -58, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class140.field1922 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field2024[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var13 > this.field2025) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field2024[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field2025) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field2024[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field2025) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field2020 * var12 >> 12;
                                var9[var11] = this.field2033 * var14 >> 12;
                                var10[var11] = this.field2023 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }
}
