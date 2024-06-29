import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class311 extends class197 {

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    private int field5262 = 32768;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Loh;")
    private static class258 field5263 = class153.method1046("Feb", 115);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "Loh;")
    private static class258 field5264 = class153.method1046("Oct", 91);

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Loh;")
    private static class258 field5273 = class153.method1046("Jan", 88);

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Loh;")
    private static class258 field5270 = class153.method1046("Jun", 120);

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "Loh;")
    private static class258 field5280 = class153.method1046("Sep", 91);

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Loh;")
    private static class258 field5267 = class153.method1046("Apr", 94);

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Loh;")
    private static class258 field5269 = class153.method1046("Jul", 93);

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Loh;")
    private static class258 field5268 = class153.method1046("Mar", 107);

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "[I")
    public static int[] field5276 = new int[32];

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "Loh;")
    public static class258 field5279 = class153.method1046("<br>(X100(U(Y", 111);

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "Loh;")
    private static class258 field5275 = class153.method1046("Dec", 115);

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "Loh;")
    public static class258 field5283 = class153.method1046("n", 110);

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
    public static int field5289 = 0;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "Loh;")
    private static class258 field5287 = class153.method1046("Aug", 108);

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "Loh;")
    private static class258 field5288 = class153.method1046("Nov", 98);

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "Z")
    public static volatile boolean field5265 = false;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "Loh;")
    private static class258 field5290 = class153.method1046("May", 97);

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "[Loh;")
    public static class258[] field5261 = new class258[] { field5273, field5263, field5268, field5267, field5290, field5270, field5269, field5287, field5280, field5264, field5288, field5275 };

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ls;IZZI)V", line = 5)
    public static final void method2156(class171 arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field5284++;
        int var5 = arg0.field3054;
        int var6 = arg0.field3002;
        if (arg0.field3022 == 0) {
            arg0.field3054 = arg0.field3046;
        } else if (arg0.field3022 == 1) {
            arg0.field3054 = arg1 - arg0.field3046;
        } else if (arg0.field3022 == 2) {
            arg0.field3054 = arg0.field3046 * arg1 >> 14;
        } else if (arg0.field3022 == 3) {
            if (arg0.field2936 == 2) {
                arg0.field3054 = arg0.field3046 * 32 + ((arg0.field3046 - 1) * arg0.field2911);
            } else if (arg0.field2936 == 7) {
                arg0.field3054 = arg0.field3046 * 12 + ((arg0.field3046 - 1) * arg0.field2911);
            }
        }
        if (arg0.field3023 == 0) {
            arg0.field3002 = arg0.field3067;
        } else if (arg0.field3023 == 1) {
            arg0.field3002 = arg4 - arg0.field3067;
        } else if (arg0.field3023 == 2) {
            arg0.field3002 = arg0.field3067 * arg4 >> 14;
        } else if (arg0.field3023 == 3) {
            if (arg0.field2936 == 2) {
                arg0.field3002 = (arg0.field3067 - 1) * arg0.field2934 + arg0.field3067 * 32;
            } else if (arg0.field2936 == 7) {
                arg0.field3002 = arg0.field3067 * 115 + ((arg0.field3067 - 1) * arg0.field2934);
            }
        }
        if (arg0.field3023 == 4) {
            arg0.field3002 = arg0.field3054 * arg0.field3035 / arg0.field3053;
        }
        if (arg0.field3022 == 4) {
            arg0.field3054 = arg0.field3053 * arg0.field3002 / arg0.field3035;
        }
        if (arg3) {
            field5261 = (class258[]) null;
        }
        if (class166.field2823 && (client.method354(arg0) != 0 || arg0.field2936 == 0)) {
            if (arg0.field3054 < 5 && arg0.field3002 < 5) {
                arg0.field3002 = 5;
                arg0.field3054 = 5;
            } else {
                if (arg0.field3002 <= 0) {
                    arg0.field3002 = 5;
                }
                if (arg0.field3054 <= 0) {
                    arg0.field3054 = 5;
                }
            }
        }
        if (arg0.field2924 == 1337) {
            class250.field4314 = arg0;
        }
        if (arg2 && arg0.field2960 != null && (arg0.field3002 != var6 || arg0.field3054 != var5)) {
            class42 var7 = new class42();
            var7.field600 = arg0.field2960;
            var7.field598 = arg0;
            class87.field1484.method82(var7, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 110)
    public static void method2157(int arg0) {
        field5275 = null;
        if (arg0 != -13810) {
            field5267 = (class258) null;
        }
        field5290 = null;
        field5273 = null;
        field5279 = null;
        field5280 = null;
        field5268 = null;
        field5263 = null;
        field5288 = null;
        field5269 = null;
        field5283 = null;
        field5267 = null;
        field5264 = null;
        field5261 = null;
        field5276 = null;
        field5270 = null;
        field5287 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILva;I)V", line = 136)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            return;
        }
        if (arg2 == 0) {
            this.field5262 = arg1.method1615(-127) << 4;
        } else if (arg2 == 1) {
            this.field3462 = arg1.method1589(arg0 ^ 0x1F26) == 1;
        }
        field5272++;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I", line = 174)
    public static final int method2158(int arg0, int arg1) {
        field5278++;
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        if (arg1 != -1161) {
            return 125;
        }
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)V", line = 201)
    public static final void method2159(int arg0, int arg1) {
        field5281++;
        if (arg1 != -26132) {
            method2164((byte) 93, 84, 57, -52, 83, -29, -72, -51, 56, -16);
        }
        if (class292.field5027 == 0) {
            class224.field3844.method858((byte) -119, arg0);
        } else {
            class284.field4895 = arg0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(B)I", line = 218)
    public static final int method2160(byte arg0) {
        field5274++;
        if (arg0 != 117) {
            field5289 = 116;
        }
        return class164.field2769;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 237)
    public final void method223(int arg0) {
        if (arg0 != 11135) {
            method2157(84);
        }
        field5285++;
        class72.method540((byte) -124);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[[I", line = 255)
    public final int[][] method101(int arg0, byte arg1) {
        field5260++;
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        int var4 = 55 / ((arg1 - 1) / 37);
        if (this.field3461.field4765) {
            int[] var5 = this.method1327(1, -126, arg0);
            int[] var6 = this.method1327(2, -121, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class190.field3362; var10++) {
                int var11 = (var5[var10] * 255 & 0xFF698) >> 12;
                int var12 = var6[var10] * this.field5262 >> 12;
                int var13 = class193.field3405[var11] * var12 >> 12;
                int var14 = var10 + (var13 >> 12) & class48.field723;
                int var15 = class72.field1278[var11] * var12 >> 12;
                int var16 = arg0 + (var15 >> 12) & class155.field2662;
                int[][] var17 = this.method1322(0, var16, 0);
                var7[var10] = var17[0][var14];
                var8[var10] = var17[1][var14];
                var9[var10] = var17[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILrk;JLrk;Lrk;)V", line = 318)
    public static final void method2161(int arg0, int arg1, int arg2, int arg3, class123 arg4, long arg5, class123 arg6, class123 arg7) {
        class90 var9 = new class90();
        var9.field1579 = arg4;
        var9.field1583 = arg1 * 128 + 64;
        var9.field1588 = arg2 * 128 + 64;
        var9.field1580 = arg3;
        var9.field1575 = arg5;
        var9.field1584 = arg6;
        var9.field1573 = arg7;
        int var10 = 0;
        class228 var11 = class178.field3180[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3950; var12++) {
                class219 var13 = var11.field3932[var12];
                if ((var13.field3795 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3801.method361();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1581 = -var10;
        if (class178.field3180[arg0][arg1][arg2] == null) {
            class178.field3180[arg0][arg1][arg2] = new class228(arg0, arg1, arg2);
        }
        class178.field3180[arg0][arg1][arg2].field3947 = var9;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 399)
    public class311() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLgb;)V", line = 378)
    public static final void method2162(byte arg0, class213 arg1) {
        class306.field5197 = arg1;
        if (arg0 != 17) {
            field5265 = false;
        }
        field5282++;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 403)
    public static final void method2163(int arg0) {
        field5286++;
        if (class140.field2386 == 0 || class140.field2386 == 5) {
            return;
        }
        try {
            if (++class128.field2278 > 2000) {
                if (class73.field1289 != null) {
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                }
                if (class114.field2019 >= 1) {
                    class265.field4608 = -5;
                    class140.field2386 = 0;
                    return;
                }
                class114.field2019++;
                class128.field2278 = 0;
                class140.field2386 = 1;
                if (class193.field3413 == class130.field2294) {
                    class193.field3413 = class118.field2090;
                } else {
                    class193.field3413 = class130.field2294;
                }
            }
            if (class140.field2386 == 1) {
                class15.field199 = class297.field5086.method2073(class120.field2112, -30885, class193.field3413);
                class140.field2386 = 2;
            }
            if (class140.field2386 == 2) {
                if (class15.field199.field2067 == 2) {
                    throw new IOException();
                }
                if (class15.field199.field2067 != 1) {
                    return;
                }
                class73.field1289 = new class169((Socket) class15.field199.field2063, class297.field5086);
                class15.field199 = null;
                long var1 = class52.field839 = class235.field4103.method1769(16);
                class159.field2710.field4051 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class159.field2710.method1598(14, 27052);
                class159.field2710.method1598(var3, 27052);
                class73.field1289.method1123(4900, 0, 2, class159.field2710.field4066);
                if (class76.field1322 != null) {
                    class76.field1322.method1007((byte) -13);
                }
                if (class152.field2602 != null) {
                    class152.field2602.method1007((byte) -13);
                }
                int var4 = class73.field1289.method1117(0);
                if (class76.field1322 != null) {
                    class76.field1322.method1007((byte) -13);
                }
                if (class152.field2602 != null) {
                    class152.field2602.method1007((byte) -13);
                }
                if (var4 != 0) {
                    class265.field4608 = var4;
                    class140.field2386 = 0;
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                    return;
                }
                class140.field2386 = 3;
            }
            if (class140.field2386 == 3) {
                if (class73.field1289.method1124(true) < 8) {
                    return;
                }
                class73.field1289.method1120(false, 0, 8, class293.field5036.field4066);
                class293.field5036.field4051 = 0;
                class87.field1486 = class293.field5036.method1593(106);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), 0, 0 };
                class159.field2710.field4051 = 0;
                var5[3] = (int) class87.field1486;
                var5[2] = (int) (class87.field1486 >> 32);
                class159.field2710.method1598(10, 27052);
                class159.field2710.method1577(true, var5[0]);
                class159.field2710.method1577(true, var5[1]);
                class159.field2710.method1577(true, var5[2]);
                class159.field2710.method1577(true, var5[3]);
                class159.field2710.method1603(class235.field4103.method1769(16), -1649350304);
                class159.field2710.method1590(class235.field4110, (byte) -88);
                class159.field2710.method1566(26220, class301.field5143, class162.field2727);
                class202.field3492.field4051 = 0;
                if (class280.field4818 == 40) {
                    class202.field3492.method1598(18, 27052);
                } else {
                    class202.field3492.method1598(16, 27052);
                }
                class202.field3492.method1605(class159.field2710.field4051 + (class61.method463(3790, class70.field1210) + 154), (byte) 45);
                class202.field3492.method1577(true, 518);
                class202.field3492.method1598(class188.field3324, 27052);
                class202.field3492.method1598(class173.field3098 ? 1 : 0, 27052);
                class202.field3492.method1598(1, 27052);
                class202.field3492.method1598(class185.method1253((byte) 127), 27052);
                class202.field3492.method1605(class218.field3773, (byte) 96);
                class202.field3492.method1605(class42.field577, (byte) 41);
                class125.method910(class202.field3492, false);
                class202.field3492.method1590(class70.field1210, (byte) -88);
                class202.field3492.method1577(true, class62.field1097);
                class202.field3492.method1577(true, class86.method618((byte) 71));
                class210.field3625 = true;
                class202.field3492.method1605(class301.field5145, (byte) 104);
                class202.field3492.method1577(true, class308.field5221.method1438(false));
                class202.field3492.method1577(true, class64.field1123.method1438(false));
                class202.field3492.method1577(true, class208.field3584.method1438(false));
                class202.field3492.method1577(true, class123.field2182.method1438(false));
                class202.field3492.method1577(true, class300.field5132.method1438(false));
                class202.field3492.method1577(true, class114.field2011.method1438(false));
                class202.field3492.method1577(true, class95.field1667.method1438(false));
                class202.field3492.method1577(true, class282.field4840.method1438(false));
                class202.field3492.method1577(true, class34.field395.method1438(false));
                class202.field3492.method1577(true, class127.field2260.method1438(false));
                class202.field3492.method1577(true, class233.field4042.method1438(false));
                class202.field3492.method1577(true, class56.field877.method1438(false));
                class202.field3492.method1577(true, class153.field2628.method1438(false));
                class202.field3492.method1577(true, class234.field4044.method1438(false));
                class202.field3492.method1577(true, class170.field2902.method1438(false));
                class202.field3492.method1577(true, class102.field1863.method1438(false));
                class202.field3492.method1577(true, class125.field2243.method1438(false));
                class202.field3492.method1577(true, class47.field716.method1438(false));
                class202.field3492.method1577(true, class215.field3730.method1438(false));
                class202.field3492.method1577(true, class191.field3384.method1438(false));
                class202.field3492.method1577(true, class144.field2423.method1438(false));
                class202.field3492.method1577(true, class312.field5300.method1438(false));
                class202.field3492.method1577(true, class10.field123.method1438(false));
                class202.field3492.method1577(true, class312.field5297.method1438(false));
                class202.field3492.method1577(true, class73.field1284.method1438(false));
                class202.field3492.method1577(true, class260.field4526.method1438(false));
                class202.field3492.method1577(true, class64.field1115.method1438(false));
                class202.field3492.method1565(class159.field2710.field4051, class159.field2710.field4066, 0, 111);
                class73.field1289.method1123(4900, 0, class202.field3492.field4051, class202.field3492.field4066);
                class159.field2710.method886((byte) -120, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class293.field5036.method886((byte) 40, var5);
                class140.field2386 = 4;
            }
            if (class140.field2386 == 4) {
                if (class73.field1289.method1124(true) < 1) {
                    return;
                }
                int var7 = class73.field1289.method1117(0);
                if (var7 == 21) {
                    class140.field2386 = 7;
                } else if (var7 == 29) {
                    class140.field2386 = 10;
                } else if (var7 == 1) {
                    class265.field4608 = var7;
                    class140.field2386 = 5;
                    return;
                } else if (var7 == 2) {
                    class140.field2386 = 8;
                } else if (var7 == 15) {
                    class140.field2386 = 0;
                    class265.field4608 = var7;
                    return;
                } else if (var7 == 23 && class114.field2019 < 1) {
                    class140.field2386 = 1;
                    class128.field2278 = 0;
                    class114.field2019++;
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                    return;
                } else {
                    class140.field2386 = 0;
                    class265.field4608 = var7;
                    class73.field1289.method1122(-1);
                    class73.field1289 = null;
                    return;
                }
            }
            if (class140.field2386 == 6) {
                class159.field2710.field4051 = 0;
                class159.field2710.method885(17, -119);
                class73.field1289.method1123(4900, 0, class159.field2710.field4051, class159.field2710.field4066);
                class140.field2386 = 4;
                return;
            }
            if (class140.field2386 == 7) {
                if (class73.field1289.method1124(true) < 1) {
                    return;
                }
                class242.field4202 = class73.field1289.method1117(0) * 60 + 180;
                class140.field2386 = 0;
                class265.field4608 = 21;
                class73.field1289.method1122(-1);
                class73.field1289 = null;
                return;
            }
            if (class140.field2386 == 10) {
                if (class73.field1289.method1124(true) < 1) {
                    return;
                }
                class86.field1456 = class73.field1289.method1117(0);
                class140.field2386 = 0;
                class265.field4608 = 29;
                class73.field1289.method1122(-1);
                class73.field1289 = null;
                return;
            }
            if (class140.field2386 == 8) {
                if (class73.field1289.method1124(true) < 12) {
                    return;
                }
                class73.field1289.method1120(false, 0, 12, class293.field5036.field4066);
                class293.field5036.field4051 = 0;
                class70.field1212 = class293.field5036.method1589(116);
                class284.field4891 = class293.field5036.method1589(76);
                class57.field902 = class293.field5036.method1589(94);
                class162.field2762 = class293.field5036.method1589(53);
                class201.field3481 = class293.field5036.method1589(65) == 1;
                class47.field698 = class293.field5036.method1615(99);
                class231.field4006 = class293.field5036.method1589(106) == 1;
                class268.field4674 = class293.field5036.method1589(64) == 1;
                class178.method1217(true, class268.field4674);
                class235.method1578(100, class268.field4674);
                if (!class173.field3098) {
                    if (class57.field902 == 1 || class231.field4006) {
                        try {
                            class301.field5155.method1779((byte) 4, class297.field5086.field5061);
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class1.field7.method1779((byte) 4, class297.field5086.field5061);
                        } catch (Throwable var11) {
                        }
                    }
                }
                class48.field725 = class293.field5036.method880((byte) -86);
                class241.field4184 = class293.field5036.method1615(31);
                class140.field2386 = 9;
            }
            if (arg0 <= 49) {
                return;
            }
            if (class140.field2386 == 9) {
                if (class73.field1289.method1124(true) < class241.field4184) {
                    return;
                }
                class293.field5036.field4051 = 0;
                class73.field1289.method1120(false, 0, class241.field4184, class293.field5036.field4066);
                class140.field2386 = 0;
                class265.field4608 = 2;
                class182.method1244(92);
                class264.field4598 = -1;
                class117.method864(false, true);
                class48.field725 = -1;
                return;
            }
        } catch (IOException var13) {
            if (class73.field1289 != null) {
                class73.field1289.method1122(-1);
                class73.field1289 = null;
            }
            if (class114.field2019 >= 1) {
                class140.field2386 = 0;
                class265.field4608 = -4;
            } else {
                if (class193.field3413 == class130.field2294) {
                    class193.field3413 = class118.field2090;
                } else {
                    class193.field3413 = class130.field2294;
                }
                class114.field2019++;
                class128.field2278 = 0;
                class140.field2386 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BIIIIIIIII)V", line = 774)
    public static final void method2164(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5277++;
        if (arg3 == arg7 && arg2 == arg8 && arg1 == arg5 && arg4 == arg6) {
            class4.method26((byte) 75, arg9, arg1, arg8, arg4, arg7);
        } else {
            int var10 = arg7;
            int var11 = arg7 * 3;
            int var12 = arg8 * 3;
            int var13 = arg8;
            int var14 = arg3 * 3;
            int var15 = arg2 * 3;
            int var16 = arg5 * 3;
            int var17 = arg6 * 3;
            int var18 = var14 + arg1 - var16 - arg7;
            int var19 = var16 + var11 - var14 - var14;
            int var20 = var17 - var15 - (-var12 + var15);
            int var21 = var14 - var11;
            int var22 = arg4 + var15 - (arg8 + var17);
            int var23 = var15 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var22 * var26;
                int var29 = var19 * var25;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = arg8 + (var28 + var30 + var31 >> 12);
                int var33 = var21 * var24;
                int var34 = (var29 + var33 + var27 >> 12) + arg7;
                class4.method26((byte) 81, arg9, var34, var13, var32, var10);
                var10 = var34;
                var13 = var32;
            }
        }
        if (arg0 != 111) {
            field5267 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I", line = 869)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            return (int[]) null;
        }
        field5266++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(1, -122, arg1);
            int[] var5 = this.method1327(2, -126, arg1);
            for (int var6 = 0; var6 < class190.field3362; var6++) {
                int var7 = (var4[var6] & 0xFFA) >> 4;
                int var8 = var5[var6] * this.field5262 >> 12;
                int var9 = class193.field3405[var7] * var8 >> 12;
                int var10 = class48.field723 & (var9 >> 12) + var6;
                int var11 = class72.field1278[var7] * var8 >> 12;
                int var12 = class155.field2662 & arg1 + (var11 >> 12);
                int[] var13 = this.method1327(0, arg0 ^ 0x3F2A, var12);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }
}
