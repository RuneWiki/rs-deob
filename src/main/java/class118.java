import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class118 extends class240 {

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lcd;")
    public static class64 field2146 = class44.method335((byte) 71, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Lqd;")
    public static class40 field2147;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "[Lel;")
    public static class112[] field2153;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I", line = 23)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            field2147 = (class40) null;
        }
        int[] var3 = this.field4094.method179(arg1, true);
        field2148++;
        if (this.field4094.field344) {
            for (int var4 = 0; var4 < class169.field2936; var4++) {
                this.method840(var4, -2048, arg1);
                int[] var5 = this.method1745(class244.field4222, 0, (byte) 109);
                var3[var4] = var5[class164.field2889];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 63)
    public class118() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V", line = 67)
    public static void method836(byte arg0) {
        field2146 = null;
        field2153 = null;
        if (arg0 <= -114) {
            field2147 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILcd;)Z", line = 79)
    public static final boolean method837(int arg0, class64 arg1) {
        field2145++;
        int var2 = -98 / ((23 - arg0) / 41);
        if (arg1 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class202.field3453; var3++) {
            if (arg1.method515(-64, class29.field493[var3])) {
                return true;
            }
        }
        if (arg1.method515(-64, class139.field2472.field672)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILkh;)V", line = 109)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            field2146 = (class64) null;
        }
        field2144++;
        if (arg1 == 0) {
            this.field4113 = arg2.method152((byte) -110) == 1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V", line = 123)
    public static final void method838(int arg0) {
        field2149++;
        class190.method1342(class263.field4511, 0);
        class164.field2882++;
        if (class218.field3708 && class175.field2999) {
            int var1 = class281.field4835;
            int var2 = var1 - class234.field3957;
            int var3 = class263.field4511.field1099;
            if (var2 < class107.field1972) {
                var2 = class107.field1972;
            }
            if (class107.field1972 + class183.field3133.field1163 < class263.field4511.field1163 + var2) {
                var2 = class107.field1972 + class183.field3133.field1163 - class263.field4511.field1163;
            }
            int var4 = class183.field3133.field1175 + var2 - class107.field1972;
            int var5 = var2 - class60.field1150;
            int var6 = class188.field3213;
            int var7 = var6 - class115.field2116;
            if (var7 < class48.field801) {
                var7 = class48.field801;
            }
            if ((class48.field801 + class183.field3133.field1016) < (class263.field4511.field1016 + var7)) {
                var7 = class48.field801 + class183.field3133.field1016 - class263.field4511.field1016;
            }
            int var8 = var7 - class230.field3892;
            int var9 = class183.field3133.field1022 + var7 - class48.field801;
            if (arg0 >= 97) {
                if (class164.field2882 > class263.field4511.field1154 && (var3 < var5 || (-var3) > var5 || var8 > var3 || -var3 > var8)) {
                    class163.field2872 = true;
                }
                if (class263.field4511.field1046 != null && class163.field2872) {
                    class11 var10 = new class11();
                    var10.field225 = var4;
                    var10.field212 = class263.field4511;
                    var10.field226 = var9;
                    var10.field229 = class263.field4511.field1046;
                    class218.method1562((byte) 47, var10);
                }
                if (class260.field4472 == 0) {
                    if (class163.field2872) {
                        if (class263.field4511.field1124 != null) {
                            class11 var11 = new class11();
                            var11.field225 = var4;
                            var11.field226 = var9;
                            var11.field212 = class263.field4511;
                            var11.field214 = class188.field3239;
                            var11.field229 = class263.field4511.field1124;
                            class218.method1562((byte) 47, var11);
                        }
                        if (class188.field3239 != null && client.method1758(class263.field4511) != null) {
                            class93.field1734++;
                            class17.field353.method1214(-45, 200);
                            class17.field353.method122((byte) 66, class263.field4511.field1080);
                            class17.field353.method149(class263.field4511.field1167, true);
                            class17.field353.method162((byte) 58, class188.field3239.field1080);
                            class17.field353.method126(class188.field3239.field1167, true);
                        }
                    } else if ((class146.field2591 == 1 || class298.method2083(2047, class220.field3736 - 1)) && class220.field3736 > 2) {
                        class46.method343(0);
                    } else if (class220.field3736 > 0) {
                        class283.method1967(-21576);
                    }
                    class263.field4511 = null;
                }
            }
        } else if (class164.field2882 > 1) {
            class263.field4511 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILja;Lqd;II)V", line = 247)
    public static final void method839(int arg0, int arg1, int arg2, class60 arg3, class40 arg4, int arg5, int arg6) {
        field2154++;
        if (arg4 == null) {
            return;
        }
        int var7 = 96 / ((arg1 + 73) / 45);
        int var8 = class241.field4157 + class154.field2734 & 0x7FF;
        int var9 = Math.max(arg3.field1163 / 2, arg3.field1016 / 2) + 10;
        int var10 = arg2 * arg2 + arg6 * arg6;
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class50.field820[var8];
        int var12 = var11 * 256 / (class277.field4766 + 256);
        int var13 = class50.field826[var8];
        int var14 = var13 * 256 / (class277.field4766 + 256);
        int var15 = arg2 * var14 + arg6 * var12 >> 16;
        int var16 = arg2 * var12 - (arg6 * var14) >> 16;
        if (class123.field2216) {
            ((class136) arg4).method969(arg0 + arg3.field1163 / 2 + var15 - arg4.field632 / 2, arg3.field1016 / 2 + arg5 - var16 + -(arg4.field622 / 2), (class136) arg3.method463(false, 255));
        } else {
            ((class127) arg4).method921(arg0 + (arg3.field1163 / 2) + var15 - (arg4.field632 / 2), arg3.field1016 / 2 + arg5 + -(arg4.field622 / 2) + -var16, arg3.field1079, arg3.field1019);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)V", line = 292)
    private final void method840(int arg0, int arg1, int arg2) {
        field2150++;
        int var4 = class74.field1408[arg0];
        int var5 = class268.field4615[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (arg1 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class244.field4222 = arg2;
            class164.field2889 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class244.field4222 = arg0;
            class164.field2889 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class164.field2889 = class169.field2936 - arg2;
            class244.field4222 = arg0;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class164.field2889 = arg0;
            class244.field4222 = class131.field2320 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class244.field4222 = class131.field2320 - arg2;
            class164.field2889 = class169.field2936 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class164.field2889 = class169.field2936 - arg2;
            class244.field4222 = class131.field2320 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class244.field4222 = class131.field2320 - arg0;
            class164.field2889 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class244.field4222 = arg2;
            class164.field2889 = class169.field2936 - arg0;
        }
        class244.field4222 &= class74.field1407;
        class164.field2889 &= class132.field2356;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([BIZ)I", line = 366)
    public static final int method841(byte[] arg0, int arg1, boolean arg2) {
        field2151++;
        if (!arg2) {
            field2153 = (class112[]) null;
        }
        return class76.method604(0, arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[[I", line = 378)
    public final int[][] method286(byte arg0, int arg1) {
        if (arg0 < 34) {
            return (int[][]) ((int[][]) null);
        }
        field2155++;
        int[][] var3 = this.field4095.method1797(arg1, -37);
        if (this.field4095.field4355) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class169.field2936; var7++) {
                this.method840(var7, -2048, arg1);
                int[][] var8 = this.method1746(26, class244.field4222, 0);
                var4[var7] = var8[0][class164.field2889];
                var5[var7] = var8[1][class164.field2889];
                var6[var7] = var8[2][class164.field2889];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII[[[Lbd;Z)Z", line = 420)
    public static final boolean method842(int arg0, int arg1, int arg2, int arg3, class295[][][] arg4, boolean arg5) {
        field2152++;
        byte var6 = arg5 ? 1 : (byte) (class26.field426 & 0xFF);
        if (class264.field4528[class20.field364][arg2][arg0] == var6) {
            return false;
        } else if ((class82.field1508[class20.field364][arg2][arg0] & 0x4) == 0) {
            return false;
        } else if (arg1 == 4095) {
            int var7 = 0;
            byte var8 = 0;
            class228.field3873[var8] = arg2;
            int var31 = var8 + 1;
            class88.field1602[var8] = arg0;
            class264.field4528[class20.field364][arg2][arg0] = var6;
            while (var7 != var31) {
                int var9 = class228.field3873[var7] & 0xFFFF;
                int var10 = class228.field3873[var7] >> 24 & 0xFF;
                int var11 = class88.field1602[var7] & 0xFFFF;
                int var12 = (class88.field1602[var7] & 0xFF4862) >> 16;
                boolean var13 = false;
                boolean var14 = false;
                int var15 = class228.field3873[var7] >> 16 & 0xFF;
                if ((class82.field1508[class20.field364][var9][var11] & 0x4) == 0) {
                    var14 = true;
                }
                label243: for (int var16 = class20.field364 + 1; var16 <= 3; var16++) {
                    if ((class82.field1508[var16][var9][var11] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var11] != null) {
                            if (arg4[var16][var9][var11].field5092 != null) {
                                int var17 = class202.method1413(-2236, var15);
                                if (arg4[var16][var9][var11].field5092.field2851 == var17 || arg4[var16][var9][var11].field5092.field2840 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class202.method1413(-2236, var10);
                                    if (arg4[var16][var9][var11].field5092.field2851 == var18 || arg4[var16][var9][var11].field5092.field2840 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class202.method1413(arg1 ^ 0xFFFFF8BB, var12);
                                    if (arg4[var16][var9][var11].field5092.field2851 == var19 || arg4[var16][var9][var11].field5092.field2840 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var11].field5090 != null) {
                                for (int var20 = 0; var20 < arg4[var16][var9][var11].field5075; var20++) {
                                    int var21 = (int) (arg4[var16][var9][var11].field5090[var20].field3324 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg4[var16][var9][var11].field5090[var20].field3324 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var15 == var23 || var10 != 0 && var10 == var23 || var12 != 0 && var12 == var23) {
                                        continue label243;
                                    }
                                }
                            }
                        }
                        class295 var24 = arg4[var16][var9][var11];
                        if (var24 != null && var24.field5075 > 0) {
                            for (int var25 = 0; var25 < var24.field5075; var25++) {
                                class195 var26 = var24.field5090[var25];
                                if (var26.field3328 != var26.field3313 || var26.field3323 != var26.field3322) {
                                    for (int var27 = var26.field3313; var27 <= var26.field3328; var27++) {
                                        for (int var28 = var26.field3322; var28 <= var26.field3323; var28++) {
                                            class264.field4528[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class264.field4528[var16][var9][var11] = var6;
                        var13 = true;
                    }
                }
                if (var13) {
                    int var29 = var9 << 7;
                    if (class96.field1764[class20.field364 + 1][var9][var11] > class138.field2455[arg3]) {
                        class138.field2455[arg3] = class96.field1764[class20.field364 + 1][var9][var11];
                    }
                    int var30 = var11 << 7;
                    if (var29 < class159.field2809[arg3]) {
                        class159.field2809[arg3] = var29;
                    } else if (var29 > class103.field1869[arg3]) {
                        class103.field1869[arg3] = var29;
                    }
                    if (var30 < class211.field3568[arg3]) {
                        class211.field3568[arg3] = var30;
                    } else if (var30 > class114.field2104[arg3]) {
                        class114.field2104[arg3] = var30;
                    }
                }
                var7 = var7 + 1 & 0xFFF;
                if (!var14) {
                    if (var9 >= 1 && class264.field4528[class20.field364][var9 - 1][var11] != var6) {
                        class228.field3873[var31] = class11.method91(class11.method91(1179648, var9 - 1), -754974720);
                        class88.field1602[var31] = class11.method91(1245184, var11);
                        class264.field4528[class20.field364][var9 - 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var9 - 1 >= 0 && class264.field4528[class20.field364][var9 - 1][var11] != var6 && (class82.field1508[class20.field364][var9][var11] & 0x4) == 0 && (class82.field1508[class20.field364][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class228.field3873[var31] = class11.method91(1375731712, class11.method91(1179648, var9 - 1));
                            class88.field1602[var31] = class11.method91(var11, 1245184);
                            class264.field4528[class20.field364][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class264.field4528[class20.field364][var9][var11] != var6) {
                            class228.field3873[var31] = class11.method91(class11.method91(var9, 5373952), 318767104);
                            class88.field1602[var31] = class11.method91(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class264.field4528[class20.field364][var9][var11] = var6;
                        }
                        if ((var9 + 1) < 104 && class264.field4528[class20.field364][var9 + 1][var11] != var6 && (class82.field1508[class20.field364][var9][var11] & 0x4) == 0 && (class82.field1508[class20.field364][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class228.field3873[var31] = class11.method91(class11.method91(var9 + 1, 5373952), -1845493760);
                            class88.field1602[var31] = class11.method91(var11, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class264.field4528[class20.field364][var9 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if (var9 + 1 < 104 && class264.field4528[class20.field364][var9 + 1][var11] != var6) {
                        class228.field3873[var31] = class11.method91(class11.method91(9568256, var9 + 1), 1392508928);
                        class88.field1602[var31] = class11.method91(var11, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class264.field4528[class20.field364][var9 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if (var9 - 1 >= 0 && class264.field4528[class20.field364][var9 - 1][var11] != var6 && (class82.field1508[class20.field364][var9][var11] & 0x4) == 0 && (class82.field1508[class20.field364][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class228.field3873[var31] = class11.method91(301989888, class11.method91(13762560, var9 - 1));
                            class88.field1602[var31] = class11.method91(13828096, var11);
                            class264.field4528[class20.field364][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class264.field4528[class20.field364][var9][var11] != var6) {
                            class228.field3873[var31] = class11.method91(-1828716544, class11.method91(var9, 13762560));
                            class88.field1602[var31] = class11.method91(13828096, var11);
                            class264.field4528[class20.field364][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class264.field4528[class20.field364][var9 + 1][var11] != var6 && (class82.field1508[class20.field364][var9][var11] & 0x4) == 0 && (class82.field1508[class20.field364][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class228.field3873[var31] = class11.method91(-771751936, class11.method91(var9 + 1, 9568256));
                            class88.field1602[var31] = class11.method91(var11, 9633792);
                            class264.field4528[class20.field364][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class138.field2455[arg3] != -1000000) {
                class138.field2455[arg3] += 10;
                class159.field2809[arg3] -= 50;
                class103.field1869[arg3] += 50;
                class114.field2104[arg3] += 50;
                class211.field3568[arg3] -= 50;
            }
            return true;
        } else {
            return false;
        }
    }
}
