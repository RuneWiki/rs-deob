import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 extends class181 {

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "Ljava/lang/Object;")
    private Object field96;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "Lqd;")
    public static class40 field98 = class147.method1106("", (byte) -121);

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "Lqd;")
    private static class40 field99 = class147.method1106("Close", (byte) -112);

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "Lqd;")
    public static class40 field106 = class147.method1106("Spieler kann nicht gefunden werden: ", (byte) -98);

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "Lqd;")
    public static class40 field104 = field99;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "Lo;")
    public static class199 field100 = new class199(16);

    @OriginalMember(owner = "client!gf", name = "mb", descriptor = "I")
    public static int field111 = -1;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!gf", name = "kb", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!gf", name = "lb", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "Lba;")
    public static class159 field105;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "Lce;")
    public static class239 field97;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Z", line = 21)
    public final boolean method33(boolean arg0) {
        field109++;
        if (arg0) {
            method35(72);
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)V", line = 33)
    public static final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field108++;
        class249.field4127 = 0;
        if (arg4 != 150) {
            return;
        }
        for (int var7 = -1; var7 < class177.field2923 + class159.field2663; var7++) {
            class86 var8;
            if (var7 == -1) {
                var8 = class255.field4233;
            } else if (var7 < class159.field2663) {
                var8 = class298.field4979[class212.field3390[var7]];
            } else {
                var8 = class91.field1656[class65.field1229[var7 - class159.field2663]];
            }
            if (var8 != null && var8.method386(64)) {
                if (var8 instanceof class42) {
                    class121 var9 = ((class42) var8).field796;
                    if (var9.field2098 != null) {
                        var9 = var9.method918(-1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class159.field2663 <= var7) {
                    class121 var15 = ((class42) var8).field796;
                    if (var15.field2098 != null) {
                        var15 = var15.method918(arg4 - 151);
                    }
                    if (var15.field2070 >= 0 && class108.field1898.length > var15.field2070) {
                        int var16;
                        if (var15.field2076 == -1) {
                            var16 = var8.method661(true) + 15;
                        } else {
                            var16 = var15.field2076 + 15;
                        }
                        class221.method1552(arg3 >> 1, arg6 >> 1, var16, var8, arg4 ^ 0x96, arg2, arg0);
                        if (class280.field4715 > -1) {
                            class108.field1898[var15.field2070].method744(arg1 - (12 - class280.field4715), class46.field891 + arg5 + -30);
                        }
                    }
                    int var17 = 0;
                    class189[] var18 = class276.field4608;
                    while (var18.length > var17) {
                        class189 var19 = var18[var17];
                        if (var19 != null && var19.field3064 == 1 && class65.field1229[var7 - class159.field2663] == var19.field3078 && (class256.field4266 % 20) < 10) {
                            int var20;
                            if (var15.field2076 == -1) {
                                var20 = var8.method661(true) + 15;
                            } else {
                                var20 = var15.field2076 + 15;
                            }
                            class221.method1552(arg3 >> 1, arg6 >> 1, var20, var8, 0, arg2, arg0);
                            if (class280.field4715 > -1) {
                                class112.field1941[var19.field3073].method744(class280.field4715 + arg1 - 12, class46.field891 + arg5 - 28);
                            }
                        }
                        var17++;
                    }
                } else {
                    class258 var10 = (class258) var8;
                    int var11 = 30;
                    if (var10.field4306 != -1 || var10.field4291 != -1) {
                        class221.method1552(arg3 >> 1, arg6 >> 1, var8.method661(true) + 15, var8, 0, arg2, arg0);
                        if (class280.field4715 > -1) {
                            if (var10.field4306 != -1) {
                                class102.field1797[var10.field4306].method744(class280.field4715 + arg1 - 12, class46.field891 - var11 + arg5);
                                var11 += 25;
                            }
                            if (var10.field4291 != -1) {
                                class108.field1898[var10.field4291].method744(class280.field4715 + arg1 - 12, -var11 + class46.field891 + arg5);
                                var11 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class189[] var12 = class276.field4608;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class189 var14 = var12[var13];
                            if (var14 != null && var14.field3064 == 10 && class212.field3390[var7] == var14.field3078) {
                                class221.method1552(arg3 >> 1, arg6 >> 1, var8.method661(true) + 15, var8, arg4 ^ 0x96, arg2, arg0);
                                if (class280.field4715 > -1) {
                                    class112.field1941[var14.field3073].method744(arg1 + class280.field4715 - 12, class46.field891 + arg5 - var11);
                                }
                            }
                        }
                    }
                }
                if (var8.field1501 != null && (class159.field2663 <= var7 || class165.field2729 == 0 || class165.field2729 == 3 || class165.field2729 == 1 && class208.method1475(true, ((class258) var8).field4319))) {
                    class221.method1552(arg3 >> 1, arg6 >> 1, var8.method661(true), var8, 0, arg2, arg0);
                    if (class280.field4715 > -1 && class249.field4127 < class65.field1216) {
                        class65.field1223[class249.field4127] = class230.field3789.method1830(var8.field1501) / 2;
                        class65.field1214[class249.field4127] = class230.field3789.field4361;
                        class65.field1209[class249.field4127] = class280.field4715;
                        class65.field1218[class249.field4127] = class46.field891;
                        class65.field1226[class249.field4127] = var8.field1477;
                        class65.field1204[class249.field4127] = var8.field1480;
                        class65.field1221[class249.field4127] = var8.field1496;
                        class65.field1225[class249.field4127] = var8.field1501;
                        class249.field4127++;
                    }
                }
                if (var8.field1517 > class256.field4266) {
                    class185 var21 = class169.field2789[1];
                    class185 var22 = class169.field2789[0];
                    int var26;
                    if (var8 instanceof class42) {
                        class42 var23 = (class42) var8;
                        class185[] var24 = (class185[]) ((class185[]) class293.field4905.method1345((long) var23.field796.field2091, arg4 ^ 0x6D60));
                        if (var24 == null) {
                            var24 = class239.method1667(11, 0, var23.field796.field2091, class120.field2030);
                            if (var24 != null) {
                                class293.field4905.method1350(var24, (long) var23.field796.field2091, 93);
                            }
                        }
                        class121 var25 = var23.field796;
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[0];
                            var21 = var24[1];
                        }
                        if (var25.field2076 == -1) {
                            var26 = var8.method661(true);
                        } else {
                            var26 = var25.field2076;
                        }
                    } else {
                        var26 = var8.method661(true);
                    }
                    class221.method1552(arg3 >> 1, arg6 >> 1, var26 + var22.field2981 + 10, var8, 0, arg2, arg0);
                    if (class280.field4715 > -1) {
                        int var27 = class280.field4715 + arg1 - (var22.field2976 >> 1);
                        int var28 = arg5 + class46.field891 - 3;
                        var22.method744(var27, var28);
                        int var29 = var8.field1504 * var22.field2976 / 255;
                        int var30 = var22.field2981;
                        if (class21.field350) {
                            class111.method838(var27, var28, var27 + var29, var28 - -var30);
                        } else {
                            class115.method863(var27, var28, var27 + var29, var28 + var30);
                        }
                        var21.method744(var27, var28);
                        if (class21.field350) {
                            class111.method847(arg1, arg5, arg1 + arg6, arg3 + arg5);
                        } else {
                            class115.method870(arg1, arg5, arg1 + arg6, arg5 - -arg3);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field1483[var31] > class256.field4266) {
                        int var34;
                        if (var8 instanceof class42) {
                            class42 var32 = (class42) var8;
                            class121 var33 = var32.field796;
                            if (var33.field2076 == -1) {
                                var34 = var8.method661(true) / 2;
                            } else {
                                var34 = var33.field2076 / 2;
                            }
                        } else {
                            var34 = var8.method661(true) / 2;
                        }
                        class221.method1552(arg3 >> 1, arg6 >> 1, var34, var8, arg4 - 150, arg2, arg0);
                        if (class280.field4715 > -1) {
                            if (var31 == 1) {
                                class46.field891 -= 20;
                            }
                            if (var31 == 2) {
                                class280.field4715 -= 15;
                                class46.field891 -= 10;
                            }
                            if (var31 == 3) {
                                class46.field891 -= 10;
                                class280.field4715 += 15;
                            }
                            class240.field3978[var8.field1486[var31]].method744(class280.field4715 + arg1 - 12, arg5 - 12 + class46.field891);
                            class49.field945.method1825(class276.method1927((byte) -119, var8.field1535[var31]), arg1 + class280.field4715 - 1, class46.field891 + arg5 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class249.field4127; var35++) {
            int var36 = class65.field1209[var35];
            int var37 = class65.field1218[var35];
            int var38 = class65.field1223[var35];
            boolean var39 = true;
            int var40 = class65.field1214[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((var37 + 2) > (class65.field1218[var41] - class65.field1214[var41]) && var37 - var40 < class65.field1218[var41] + 2 && (class65.field1223[var41] + class65.field1209[var41]) > (var36 - var38) && class65.field1209[var41] - class65.field1223[var41] < var36 - -var38 && var37 > (class65.field1218[var41] - class65.field1214[var41])) {
                        var37 = class65.field1218[var41] - class65.field1214[var41];
                        var39 = true;
                    }
                }
            }
            class280.field4715 = class65.field1209[var35];
            class46.field891 = class65.field1218[var35] = var37;
            class40 var42 = class65.field1225[var35];
            if (class163.field2706 == 0) {
                int var43 = 16776960;
                if (class65.field1226[var35] < 6) {
                    var43 = class313.field5273[class65.field1226[var35]];
                }
                if (class65.field1226[var35] == 6) {
                    var43 = (class55.field1069 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class65.field1226[var35] == 7) {
                    var43 = class55.field1069 % 20 < 10 ? 255 : 65535;
                }
                if (class65.field1226[var35] == 8) {
                    var43 = class55.field1069 % 20 < 10 ? 45056 : 8454016;
                }
                if (class65.field1226[var35] == 9) {
                    int var44 = 150 - class65.field1221[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 33160960 - var44 * 327680;
                    } else if (var44 < 150) {
                        var43 = ((var44 - 100) * 5) + 65280;
                    }
                }
                if (class65.field1226[var35] == 10) {
                    int var45 = 150 - class65.field1221[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 + 16384000 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 500 + 255 - (var45 * 5);
                    }
                }
                if (class65.field1226[var35] == 11) {
                    int var46 = 150 - class65.field1221[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 * 327680 - 32768000);
                    }
                }
                if (class65.field1204[var35] == 0) {
                    class230.field3789.method1825(var42, class280.field4715 + arg1, class46.field891 + arg5, var43, 0);
                }
                if (class65.field1204[var35] == 1) {
                    class230.field3789.method1827(var42, class280.field4715 + arg1, class46.field891 + arg5, var43, 0, class55.field1069);
                }
                if (class65.field1204[var35] == 2) {
                    class230.field3789.method1841(var42, class280.field4715 + arg1, class46.field891 + arg5, var43, 0, class55.field1069);
                }
                if (class65.field1204[var35] == 3) {
                    class230.field3789.method1839(var42, class280.field4715 + arg1, arg5 - -class46.field891, var43, 0, class55.field1069, 150 - class65.field1221[var35]);
                }
                if (class65.field1204[var35] == 4) {
                    int var47 = (150 - class65.field1221[var35]) * (class230.field3789.method1830(var42) + 100) / 150;
                    if (class21.field350) {
                        class111.method838(class280.field4715 + arg1 - 50, arg5, arg1 - (-class280.field4715 - 50), arg3 + arg5);
                    } else {
                        class115.method863(arg1 + class280.field4715 - 50, arg5, arg1 + class280.field4715 + 50, arg3 + arg5);
                    }
                    class230.field3789.method1831(var42, class280.field4715 + arg1 + 50 - var47, class46.field891 + arg5, var43, 0);
                    if (class21.field350) {
                        class111.method847(arg1, arg5, arg1 + arg6, arg5 - -arg3);
                    } else {
                        class115.method870(arg1, arg5, arg1 + arg6, arg5 - -arg3);
                    }
                }
                if (class65.field1204[var35] == 5) {
                    int var48 = 150 - class65.field1221[var35];
                    int var49 = 0;
                    if (class21.field350) {
                        class111.method838(arg1, class46.field891 + arg5 - class230.field3789.field4361 - 1, arg1 - -arg6, class46.field891 + arg5 + 5);
                    } else {
                        class115.method863(arg1, class46.field891 + arg5 - class230.field3789.field4361 - 1, arg1 + arg6, arg5 + class46.field891 + 5);
                    }
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class230.field3789.method1825(var42, class280.field4715 + arg1, class46.field891 + arg5 + var49, var43, 0);
                    if (class21.field350) {
                        class111.method847(arg1, arg5, arg1 + arg6, arg3 + arg5);
                    } else {
                        class115.method870(arg1, arg5, arg1 + arg6, arg3 + arg5);
                    }
                }
            } else {
                class230.field3789.method1825(var42, arg1 + class280.field4715, class46.field891 + arg5, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 520)
    public class7(Object arg0) {
        this.field96 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)Z", line = 536)
    public static final boolean method35(int arg0) {
        field103++;
        if (arg0 != 15) {
            method34(-100, -38, 82, 119, 60, -124, 62);
        }
        if (class315.field5319) {
            try {
                class61.field1167.method368(class275.field4573.field1876, (byte) -118);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V", line = 564)
    public static void method36(byte arg0) {
        field106 = null;
        field100 = null;
        field104 = null;
        field97 = null;
        field98 = null;
        field99 = null;
        if (arg0 != 120) {
            method36((byte) 37);
        }
        field105 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 584)
    public final Object method37(byte arg0) {
        if (arg0 <= 36) {
            method36((byte) -25);
        }
        field101++;
        return this.field96;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(III)V", line = 600)
    public static final void method38(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class286.field4821; var3++) {
            class50 var4 = class285.method1986(2402, var3);
            if (var4 != null) {
                int var5 = var4.field954;
                if (var5 >= 0 && !class203.field3217.method568(var5, 104)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field968 >= 0) {
                    int var10 = var4.field968;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class203.field3212[class135.method999(96, 59, var12)];
                } else if (var5 >= 0) {
                    var6 = class203.field3212[class135.method999(96, 116, class203.field3217.method566(-89, var5))];
                } else if (var4.field973 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field973;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (var7 & 0x380) + (var7 + arg2 & 0xFC00) + var8;
                    var6 = class203.field3212[class135.method999(96, 123, var9)];
                }
                class119.field2018[var3 + 1] = var6;
            }
        }
        if (arg0 < 63) {
            field97 = (class239) null;
        }
        field107++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lhf;)V", line = 676)
    public static final void method39(class193 arg0) {
        for (int var1 = arg0.field3107; var1 <= arg0.field3112; var1++) {
            for (int var2 = arg0.field3108; var2 <= arg0.field3115; var2++) {
                class14 var3 = class93.field1690[arg0.field3104][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field216; var4++) {
                        if (var3.field230[var4] == arg0) {
                            var3.field216--;
                            for (int var5 = var4; var5 < var3.field216; var5++) {
                                var3.field230[var5] = var3.field230[var5 + 1];
                                var3.field219[var5] = var3.field219[var5 + 1];
                            }
                            var3.field230[var3.field216] = null;
                            break;
                        }
                    }
                    var3.field221 = 0;
                    for (int var6 = 0; var6 < var3.field216; var6++) {
                        var3.field221 |= var3.field219[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(II)I", line = 733)
    public static final int method40(int arg0, int arg1) {
        field102++;
        if (arg1 >= -1) {
            field105 = (class159) null;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZJ)Lqd;", line = 748)
    public static final class40 method41(int arg0, int arg1, boolean arg2, long arg3) {
        field95++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var5 = 1;
        long var6 = arg3 / (long) arg1;
        while (var6 != 0L) {
            var6 /= (long) arg1;
            var5++;
        }
        int var8 = var5;
        if (arg3 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if ((long) arg0 > arg3) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg3 % (long) arg1);
            arg3 /= (long) arg1;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - (var10 + 1)] = (byte) (var11 + 48);
        }
        class40 var12 = new class40();
        var12.field766 = var8;
        var12.field745 = var9;
        return var12;
    }
}
