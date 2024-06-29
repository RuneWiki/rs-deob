import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class256 extends class117 {

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public static int field4147 = 0;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public static int field4149 = 0;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field4143 = 0;

    @OriginalMember(owner = "client!cm", name = "W", descriptor = "[J")
    public static long[] field4151 = new long[32];

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "Lbg;")
    public static class172 field4150;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "Ldk;")
    public static class251 field4148;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "[Lgd;")
    private class118[] field4142;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B[[I)V")
    private final void method1722(byte arg0, int[][] arg1) {
        int var3 = class168.field2737;
        ++field4145;
        int var4 = class149.field2335;
        if (arg0 > 42) {
            class111.method781(arg1, (byte) 74);
            class175.method1282(class234.field3769, 0, (byte) 97, class293.field4689, 0);
            if (this.field4142 != null) {
                for (int var5 = 0; ~this.field4142.length < ~var5; ++var5) {
                    class118 var6 = this.field4142[var5];
                    int var7 = var6.field1900;
                    int var8 = var6.field1898;
                    if (~var7 <= -1) {
                        if (~var8 <= -1) {
                            var6.method1(var3, -125, var4);
                        } else {
                            var6.method2(var3, var4, -6211);
                        }
                    } else if (var8 >= 0) {
                        var6.method4(1207757217, var4, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "(I)V")
    public static void method1723(int arg0) {
        field4150 = null;
        field4148 = null;
        if (arg0 != 13706) {
            method1724(true, 65, -86, -48, (class151[][][]) null, (byte) 106);
        }
        field4151 = null;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        ++field4140;
        int[][] var3 = super.field1886.method419(arg0, (byte) 14);
        int var4 = -64 % ((arg1 - 37) / 38);
        if (super.field1886.field1022) {
            int var5 = class149.field2335;
            int var6 = class168.field2737;
            int[][] var7 = new int[var5][var6];
            int[][][] var8 = super.field1886.method421(false);
            this.method1722((byte) 72, var7);
            for (int var9 = 0; var9 < class149.field2335; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[1];
                int[] var13 = var11[0];
                int[] var14 = var11[2];
                for (int var15 = 0; ~var15 > ~class168.field2737; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class51.method359(4080, var16 << 4);
                    var12[var15] = class51.method359(var16, 65280) >> 4;
                    var13[var15] = class51.method359(4080, var16 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field4141;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1885 = arg0.method1133((byte) 53) == 1;
            }
        } else {
            this.field4142 = new class118[arg0.method1133((byte) 53)];
            for (int var4 = 0; ~var4 > ~this.field4142.length; ++var4) {
                int var5 = arg0.method1133((byte) 53);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field4142[var4] = class291.method1939(arg0, (byte) 111);
                            }
                        } else {
                            this.field4142[var4] = class163.method1169(arg1 + -25302, arg0);
                        }
                    } else {
                        this.field4142[var4] = class28.method155(arg0, 0);
                    }
                } else {
                    this.field4142[var4] = class269.method1807(class98.method672(arg1, -171), arg0);
                }
            }
        }
        if (arg1 != 255) {
            this.method46(-66, -81);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field4138;
        if (arg0 != 2) {
            this.method1722((byte) -98, (int[][]) null);
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 80);
        if (super.field1883.field1313) {
            this.method1722((byte) 81, super.field1883.method532((byte) -10));
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class256() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZIII[[[Llm;B)Z")
    public static final boolean method1724(boolean arg0, int arg1, int arg2, int arg3, class151[][][] arg4, byte arg5) {
        ++field4144;
        byte var6 = !arg0 ? (byte) (255 & class286.field4575) : 1;
        if (~class151.field2369[class56.field941][arg3][arg2] == ~var6) {
            return false;
        } else if ((4 & class301.field4818[class56.field941][arg3][arg2]) == 0) {
            return false;
        } else if (arg5 != 73) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class163.field2645[var7] = arg3;
            int var31 = var7 + 1;
            class155.field2425[var7] = arg2;
            class151.field2369[class56.field941][arg3][arg2] = var6;
            while (~var31 != ~var8) {
                int var9 = (16747099 & class163.field2645[var8]) >> 16;
                int var10 = class163.field2645[var8] & 65535;
                int var11 = 65535 & class155.field2425[var8];
                boolean var12 = false;
                int var13 = class163.field2645[var8] >> 24 & 255;
                int var14 = class155.field2425[var8] >> 16 & 255;
                var8 = var8 + 1 & 4095;
                boolean var15 = false;
                if (~(4 & class301.field4818[class56.field941][var10][var11]) == -1) {
                    var12 = true;
                }
                label229: for (int var16 = class56.field941 + 1; ~var16 >= -4; ++var16) {
                    if ((class301.field4818[var16][var10][var11] & 8) == 0) {
                        if (var12 && arg4[var16][var10][var11] != null) {
                            if (arg4[var16][var10][var11].field2352 != null) {
                                int var19 = class70.method485(var9, -123);
                                if (~arg4[var16][var10][var11].field2352.field3310 == ~var19 || ~arg4[var16][var10][var11].field2352.field3311 == ~var19) {
                                    continue;
                                }
                                if (~var13 != -1) {
                                    int var20 = class70.method485(var13, arg5 ^ -63);
                                    if (arg4[var16][var10][var11].field2352.field3310 == var20 || ~arg4[var16][var10][var11].field2352.field3311 == ~var20) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var21 = class70.method485(var14, -125);
                                    if (arg4[var16][var10][var11].field2352.field3310 == var21 || arg4[var16][var10][var11].field2352.field3311 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var10][var11].field2347 != null) {
                                for (int var22 = 0; arg4[var16][var10][var11].field2357 > var22; ++var22) {
                                    int var23 = (int) (63L & arg4[var16][var10][var11].field2347[var22].field2933 >> 14);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg4[var16][var10][var11].field2347[var22].field2933 >> 20 & 3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var9 == var25 || var13 != 0 && ~var13 == ~var25 || ~var14 != -1 && var14 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class151 var26 = arg4[var16][var10][var11];
                        var15 = true;
                        if (var26 != null && ~var26.field2357 < -1) {
                            for (int var27 = 0; ~var27 > ~var26.field2357; ++var27) {
                                class179 var28 = var26.field2347[var27];
                                if (var28.field2931 != var28.field2918 || var28.field2925 != var28.field2915) {
                                    for (int var29 = var28.field2931; ~var28.field2918 <= ~var29; ++var29) {
                                        for (int var30 = var28.field2915; var30 <= var28.field2925; ++var30) {
                                            class151.field2369[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class151.field2369[var16][var10][var11] = var6;
                    }
                }
                if (var15) {
                    if (~class25.field307[arg1] > ~class267.field4304[class56.field941 + 1][var10][var11]) {
                        class25.field307[arg1] = class267.field4304[class56.field941 + 1][var10][var11];
                    }
                    int var17 = var10 << 7;
                    int var18 = var11 << 7;
                    if (var17 >= class56.field927[arg1]) {
                        if (class155.field2420[arg1] < var17) {
                            class155.field2420[arg1] = var17;
                        }
                    } else {
                        class56.field927[arg1] = var17;
                    }
                    if (class96.field1550[arg1] > var18) {
                        class96.field1550[arg1] = var18;
                    } else if (~class92.field1480[arg1] > ~var18) {
                        class92.field1480[arg1] = var18;
                    }
                }
                if (!var12) {
                    if (~var10 <= -2 && class151.field2369[class56.field941][var10 + -1][var11] != var6) {
                        class163.field2645[var31] = class173.method1263(-754974720, class173.method1263(var10 + -1, 1179648));
                        class155.field2425[var31] = class173.method1263(var11, 1245184);
                        class151.field2369[class56.field941][var10 + -1][var11] = var6;
                        var31 = 4095 & var31 + 1;
                    }
                    ++var11;
                    if (var11 < 104) {
                        if (var10 + -1 >= 0 && class151.field2369[class56.field941][var10 + -1][var11] != var6 && (class301.field4818[class56.field941][var10][var11] & 4) == 0 && ~(4 & class301.field4818[class56.field941][var10 + -1][var11 + -1]) == -1) {
                            class163.field2645[var31] = class173.method1263(class173.method1263(var10 + -1, 1179648), 1375731712);
                            class155.field2425[var31] = class173.method1263(1245184, var11);
                            class151.field2369[class56.field941][var10 + -1][var11] = var6;
                            var31 = var31 - -1 & 4095;
                        }
                        if (class151.field2369[class56.field941][var10][var11] != var6) {
                            class163.field2645[var31] = class173.method1263(318767104, class173.method1263(var10, 5373952));
                            class155.field2425[var31] = class173.method1263(var11, 5439488);
                            var31 = 4095 & var31 + 1;
                            class151.field2369[class56.field941][var10][var11] = var6;
                        }
                        if (var10 + 1 < 104 && class151.field2369[class56.field941][var10 + 1][var11] != var6 && (4 & class301.field4818[class56.field941][var10][var11]) == 0 && ~(class301.field4818[class56.field941][var10 + 1][var11 + -1] & 4) == -1) {
                            class163.field2645[var31] = class173.method1263(class173.method1263(5373952, var10 - -1), -1845493760);
                            class155.field2425[var31] = class173.method1263(var11, 5439488);
                            class151.field2369[class56.field941][var10 - -1][var11] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                    }
                    --var11;
                    if (~(var10 + 1) > -105 && class151.field2369[class56.field941][var10 + 1][var11] != var6) {
                        class163.field2645[var31] = class173.method1263(1392508928, class173.method1263(9568256, var10 + 1));
                        class155.field2425[var31] = class173.method1263(9633792, var11);
                        var31 = 4095 & var31 + 1;
                        class151.field2369[class56.field941][var10 - -1][var11] = var6;
                    }
                    --var11;
                    if (~var11 <= -1) {
                        if (~(var10 + -1) <= -1 && ~class151.field2369[class56.field941][var10 - 1][var11] != ~var6 && (class301.field4818[class56.field941][var10][var11] & 4) == 0 && (class301.field4818[class56.field941][var10 + -1][var11 - -1] & 4) == 0) {
                            class163.field2645[var31] = class173.method1263(301989888, class173.method1263(13762560, var10 + -1));
                            class155.field2425[var31] = class173.method1263(var11, 13828096);
                            class151.field2369[class56.field941][var10 + -1][var11] = var6;
                            var31 = 4095 & var31 + 1;
                        }
                        if (class151.field2369[class56.field941][var10][var11] != var6) {
                            class163.field2645[var31] = class173.method1263(-1828716544, class173.method1263(var10, 13762560));
                            class155.field2425[var31] = class173.method1263(13828096, var11);
                            class151.field2369[class56.field941][var10][var11] = var6;
                            var31 = 4095 & var31 + 1;
                        }
                        if (var10 + 1 < 104 && ~class151.field2369[class56.field941][var10 + 1][var11] != ~var6 && (class301.field4818[class56.field941][var10][var11] & 4) == 0 && (4 & class301.field4818[class56.field941][var10 + 1][var11 + 1]) == 0) {
                            class163.field2645[var31] = class173.method1263(-771751936, class173.method1263(9568256, var10 + 1));
                            class155.field2425[var31] = class173.method1263(var11, 9633792);
                            var31 = 4095 & var31 + 1;
                            class151.field2369[class56.field941][var10 - -1][var11] = var6;
                        }
                    }
                }
            }
            if (~class25.field307[arg1] != 999999) {
                class25.field307[arg1] += 10;
                class56.field927[arg1] -= 50;
                class155.field2420[arg1] += 50;
                class92.field1480[arg1] += 50;
                class96.field1550[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)I")
    public static final int method1725(boolean arg0, int arg1) {
        if (!arg0) {
            field4150 = null;
        }
        ++field4139;
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZIII)V")
    public static final void method1726(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            method1726(-86, false, 65, 3, 114);
        }
        if (~arg2 <= ~arg4) {
            for (int var5 = arg4; ~var5 > ~arg2; ++var5) {
                class204.field3253[var5][arg0] = arg3;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; ++var6) {
                class204.field3253[var6][arg0] = arg3;
            }
        }
        ++field4146;
    }
}
