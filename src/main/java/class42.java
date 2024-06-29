import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class42 extends class177 {

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "[Lfk;")
    public class41[] field588;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "[I")
    public static int[] field586 = new int[200];

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "Z")
    public static boolean field587 = false;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field589 = 0;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "Lbe;")
    public static class283 field592 = class153.method941(127, "mapfunction");

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "F")
    public static float field590;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(IIII)I", line = 4)
    public static final int method254(int arg0, int arg1, int arg2, int arg3) {
        field593++;
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class252.field4282[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = (128 - var7) * class65.field890[var6][var4][var5] + class65.field890[var6][var4 + 1][var5] * var7 >> 7;
        int var9 = (128 - var7) * class65.field890[var6][var4][var5 + 1] + class65.field890[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = arg1 & 0x7F;
        if (arg3 != -20341) {
            method254(-97, -49, 80, -111);
        }
        return (128 - var10) * var8 + (var9 * var10) >> 7;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 45)
    public static final void method255(int arg0, int arg1) {
        class290.method1981(arg1 + 127);
        class104.method698(0);
        int var2 = class7.method47(arg0, -119).field803;
        field597++;
        if (var2 == 0) {
            return;
        }
        int var3 = class6.field63[arg0];
        if (~var2 == arg1) {
            class298.field5051 = var3;
        }
        if (var2 == 6) {
            class68.field954 = var3;
        }
        if (var2 == 5) {
            class61.field856 = var3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(B)V", line = 76)
    public static void method256(byte arg0) {
        field592 = null;
        field586 = null;
        if (arg0 != 53) {
            method254(22, 25, -86, 9);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Z", line = 89)
    public final boolean method257(int arg0, int arg1) {
        field594++;
        return arg0 == 12 ? this.field588[arg1].field576 : false;
    }

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "(I)V", line = 106)
    public static final void method258(int arg0) {
        int var1 = class85.field1443.length;
        if (arg0 != -105) {
            method254(75, -33, 100, -34);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class85.field1443[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class275.field4614; var4++) {
                    if (class202.field3448[var4] == class177.field3039[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class202.field3448[class275.field4614] = class177.field3039[var2];
                    var3 = class275.field4614++;
                }
                class229 var5 = new class229(class85.field1443[var2]);
                int var6 = 0;
                while (class85.field1443[var2].length > var5.field3905 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1496(true);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 >> 14;
                    int var12 = (class177.field3039[var2] & 0xFF) * 64 + var9 - class107.field1833;
                    int var13 = (class177.field3039[var2] >> 8) * 64 + var10 - class214.field3637;
                    class129 var14 = class207.method1379(arg0 + 42, var5.method1496(true));
                    if (class33.field493[var7] == null && (var14.field2198 & 0x1) > 0 && class83.field1405 == var11 && var13 >= 0 && (var14.field2157 + var13) < 104 && var12 >= 0 && var14.field2157 + var12 < 104) {
                        class33.field493[var7] = new class60();
                        class60 var15 = class33.field493[var7];
                        class219.field3698[class242.field4078++] = var7;
                        var15.field822 = var14;
                        var15.field1186 = class75.field1309;
                        var15.method458(var15.field822.field2157, 18072);
                        var15.field1207 = var15.field822.field2160;
                        var15.field1203 = var15.field822.field2200;
                        var15.field1152 = var15.field822.field2146;
                        var15.field1204 = var15.field822.field2158;
                        var15.field1169 = var15.field822.field2201;
                        var15.field1151 = var15.field822.field2178;
                        var15.field1184 = var15.field822.field2168;
                        var15.field1202 = var15.field822.field2173;
                        if (var15.field1202 == 0) {
                            var15.field1160 = 0;
                        }
                        var15.method457(true, var12, var15.method460((byte) 34), (byte) -17, var13);
                    }
                }
            }
        }
        field595++;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lek;Lek;IZ)V", line = 211)
    public class42(class172 arg0, class172 arg1, int arg2, boolean arg3) {
        class269 var5 = new class269();
        int var6 = arg0.method1108(arg2, -123);
        this.field588 = new class41[var6];
        int[] var7 = arg0.method1118(arg2, false);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1107(arg2, var7[var8], 120);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class66 var11 = (class66) var5.method1812((byte) -90);
            class66 var12 = null;
            while (var11 != null) {
                if (var11.field913 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class66) var5.method1813((byte) 83);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1094(var10, 0, -87);
                } else {
                    var13 = arg1.method1094(0, var10, -23);
                }
                var12 = new class66(var10, var13);
                var5.method1809(var12, (byte) -126);
            }
            this.field588[var7[var8]] = new class41(var9, var12);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILkg;I)V", line = 276)
    public static final void method259(int arg0, int arg1, class69 arg2, int arg3) {
        field596++;
        if (arg2.field1024 == arg0) {
            class275.method1848(0, arg2.field1058, 0L, (byte) -60, arg2.field1079, class213.field3616, (short) 5);
            class112.field1890++;
        }
        if (arg2.field1024 == 2 && !class103.field1760) {
            class283 var4 = class210.method1386(arg2, 0);
            if (var4 != null) {
                class295.field4983++;
                class275.method1848(-1, var4, 0L, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class142.field2362, arg2.field982 }, (byte) 111), (short) 45);
            }
        }
        if (arg2.field1024 == 3) {
            class275.field4609++;
            class275.method1848(0, class174.field3010, 0L, (byte) -60, arg2.field1079, class213.field3616, (short) 47);
        }
        if (arg2.field1024 == 4) {
            class275.method1848(0, arg2.field1058, 0L, (byte) -60, arg2.field1079, class213.field3616, (short) 22);
            class222.field3726++;
        }
        if (arg2.field1024 == 5) {
            class254.field4293++;
            class275.method1848(0, arg2.field1058, 0L, (byte) -60, arg2.field1079, class213.field3616, (short) 39);
        }
        if (arg2.field1024 == 6 && class69.field1034 == null) {
            class247.field4209++;
            class275.method1848(-1, arg2.field1058, 0L, (byte) -60, arg2.field1079, class213.field3616, (short) 14);
        }
        if (arg2.field1143 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field996; var6++) {
                for (int var7 = 0; var7 < arg2.field1087; var7++) {
                    int var8 = (arg2.field1037 + 32) * var6;
                    int var9 = (arg2.field1000 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg2.field1136[var5];
                        var9 += arg2.field1047[var5];
                    }
                    if (arg3 >= var9 && var8 <= arg1 && arg3 < (var9 + 32) && arg1 < var8 + 32) {
                        class62.field867 = arg2;
                        class57.field781 = var5;
                        if (arg2.field1073[var5] > 0) {
                            class304 var10 = class103.method676(arg2.field1073[var5] - 1, -1);
                            if (class222.field3727 == 1 && class219.method1441(client.method1601(arg2), arg0 ^ 0x1C)) {
                                if (class99.field1685 != arg2.field1079 || class70.field1191 != var5) {
                                    class163.field2670++;
                                    class275.method1848(var5, class40.field562, (long) var10.field5197, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class222.field3745, class168.field2816, var10.field5155 }, (byte) 31), (short) 51);
                                }
                            } else if (!class103.field1760 || !class219.method1441(client.method1601(arg2), 76)) {
                                class71.field1239++;
                                class283[] var11 = var10.field5129;
                                if (class164.field2707) {
                                    var11 = class71.method468(var11, (byte) 53);
                                }
                                if (class219.method1441(client.method1601(arg2), 75)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class265.field4501++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 32;
                                            } else {
                                                var13 = 23;
                                            }
                                            class275.method1848(var5, var11[var12], (long) var10.field5197, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class245.field4163, var10.field5155 }, (byte) 71), var13);
                                        } else if (var12 == 4) {
                                            class57.field779++;
                                            class275.method1848(var5, class74.field1289, (long) var10.field5197, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class245.field4163, var10.field5155 }, (byte) 37), (short) 23);
                                        }
                                    }
                                }
                                if (class26.method179(client.method1601(arg2), true)) {
                                    class193.field3303++;
                                    class275.method1848(var5, class40.field562, (long) var10.field5197, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class245.field4163, var10.field5155 }, (byte) 80), (short) 29);
                                }
                                if (class219.method1441(client.method1601(arg2), 92) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class252.field4279++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 50;
                                            }
                                            if (var14 == 1) {
                                                var15 = 12;
                                            }
                                            if (var14 == 2) {
                                                var15 = 16;
                                            }
                                            class275.method1848(var5, var11[var14], (long) var10.field5197, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class245.field4163, var10.field5155 }, (byte) 37), var15);
                                        }
                                    }
                                }
                                class283[] var16 = arg2.field993;
                                if (class164.field2707) {
                                    var16 = class71.method468(var16, (byte) -123);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class96.field1607++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 58;
                                            }
                                            if (var17 == 1) {
                                                var18 = 8;
                                            }
                                            if (var17 == 2) {
                                                var18 = 15;
                                            }
                                            if (var17 == 3) {
                                                var18 = 40;
                                            }
                                            if (var17 == 4) {
                                                var18 = 11;
                                            }
                                            class275.method1848(var5, var16[var17], (long) var10.field5197, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class245.field4163, var10.field5155 }, (byte) 83), var18);
                                        }
                                    }
                                }
                                class275.method1848(var5, class298.field5042, (long) var10.field5197, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class245.field4163, var10.field5155 }, (byte) 94), (short) 1001);
                            } else if ((class12.field112 & 0x10) == 16) {
                                class46.field619++;
                                class275.method1848(var5, class89.field1514, (long) var10.field5197, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class135.field2272, class168.field2816, var10.field5155 }, (byte) 127), (short) 31);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field1121) {
            return;
        }
        if (!class103.field1760) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class283 var20 = class277.method1854(arg2, 0, var19);
                if (var20 != null) {
                    class275.method1848(arg2.field1126, var20, (long) (var19 + 1), (byte) -60, arg2.field1079, arg2.field1008, (short) 1005);
                    class134.field2245++;
                }
            }
            class283 var21 = class210.method1386(arg2, 0);
            if (var21 != null) {
                class295.field4983++;
                class275.method1848(arg2.field1126, var21, 0L, (byte) -60, arg2.field1079, arg2.field1008, (short) 45);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class283 var23 = class277.method1854(arg2, arg0 - 1, var22);
                if (var23 != null) {
                    class134.field2245++;
                    class275.method1848(arg2.field1126, var23, (long) (var22 + 1), (byte) -60, arg2.field1079, arg2.field1008, (short) 43);
                }
            }
            if (class305.method2075(false, client.method1601(arg2))) {
                class275.method1848(arg2.field1126, class22.field337, 0L, (byte) -60, arg2.field1079, class213.field3616, (short) 14);
                class247.field4209++;
            }
        } else if (class122.method771(client.method1601(arg2), (byte) -97) && (class12.field112 & 0x20) == 32) {
            class288.field4904++;
            class275.method1848(arg2.field1126, class89.field1514, 0L, (byte) -60, arg2.field1079, class299.method2022(new class283[] { class135.field2272, class228.field3840, arg2.field1008 }, (byte) 5), (short) 17);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILea;)V", line = 585)
    public static final void method260(int arg0, class191 arg1) {
        field591++;
        class183 var2 = (class183) class172.field2899.method1612(arg1.field3274.method1929((byte) -24), arg0 + 106);
        if (var2 == null) {
            class134.method832(0, (class281) null, arg1, arg1.field1150[0], (class60) null, -4, class61.field850, arg1.field1178[0]);
        } else {
            var2.method1208(arg0 - 24750);
        }
        if (arg0 != 0) {
            field592 = (class283) null;
        }
    }
}
