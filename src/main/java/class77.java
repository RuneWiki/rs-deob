import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class77 extends class151 {

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lmb;")
    private static class132 field1314 = class166.method1092("cyan:", 127);

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lmb;")
    public static class132 field1313 = field1314;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lmb;")
    public static class132 field1316 = field1314;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "Lmb;")
    public static class132 field1328 = class166.method1092(" <col=ffffff>", 124);

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
    public static int[] field1321 = new int[4000];

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
    public static int[] field1315 = new int[2000];

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Lmb;")
    private static class132 field1334 = class166.method1092("Close", 126);

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Lmb;")
    public static class132 field1317 = field1334;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Lmb;")
    public static class132 field1318 = class166.method1092("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 126);

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Loc;")
    public static class155 field1323;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lui;")
    public class223 field1308;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lui;")
    public class223 field1310;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Lhg;")
    public class84 field1327;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "[I")
    public int[] field1330;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBLii;I)V")
    public static final void method478(int arg0, byte arg1, class96 arg2, int arg3) {
        if (arg1 < 91) {
            field1314 = null;
        }
        field1322++;
        if (arg2.field1719 == 1) {
            class108.method693(class75.field1247, arg2.field1702, -501, 0L, (short) 14, arg2.field1794, 0);
            class55.field925++;
        }
        if (arg2.field1719 == 2 && !class10.field116) {
            class132 var4 = class26.method191(20532, arg2);
            if (var4 != null) {
                class24.field331++;
                class108.method693(class187.method1197(new class132[] { class196.field3639, arg2.field1828 }, -119), var4, -501, 0L, (short) 31, arg2.field1794, -1);
            }
        }
        if (arg2.field1719 == 3) {
            class108.method693(class75.field1247, field1317, -501, 0L, (short) 11, arg2.field1794, 0);
            class49.field830++;
        }
        if (arg2.field1719 == 4) {
            class69.field1157++;
            class108.method693(class75.field1247, arg2.field1702, -501, 0L, (short) 36, arg2.field1794, 0);
        }
        if (arg2.field1719 == 5) {
            class108.method693(class75.field1247, arg2.field1702, -501, 0L, (short) 58, arg2.field1794, 0);
            class213.field3901++;
        }
        if (arg2.field1719 == 6 && class169.field3115 == null) {
            class108.method693(class75.field1247, arg2.field1702, -501, 0L, (short) 3, arg2.field1794, -1);
            class194.field3599++;
        }
        if (arg2.field1760 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field1697; var6++) {
                for (int var7 = 0; var7 < arg2.field1715; var7++) {
                    int var8 = (arg2.field1820 + 32) * var6;
                    int var9 = (arg2.field1712 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg2.field1716[var5];
                        var9 += arg2.field1696[var5];
                    }
                    if (var9 <= arg3 && arg0 >= var8 && var9 + 32 > arg3 && arg0 < var8 + 32) {
                        class111.field2101 = arg2;
                        class48.field823 = var5;
                        if (arg2.field1753[var5] > 0) {
                            class243 var10 = class58.method389(0, arg2.field1753[var5] - 1);
                            if (class106.field1984 == 1 && class137.method931(0, class170.method1113(arg2, (byte) -50))) {
                                if (class112.field2179 != arg2.field1794 || class67.field1111 != var5) {
                                    class26.field424++;
                                    class108.method693(class187.method1197(new class132[] { class170.field3177, class69.field1146, var10.field4399 }, -89), class187.field3465, -501, (long) var10.field4402, (short) 28, arg2.field1794, var5);
                                }
                            } else if (!class10.field116 || !class137.method931(0, class170.method1113(arg2, (byte) -50))) {
                                class132[] var11 = var10.field4448;
                                if (class202.field3716) {
                                    var11 = class19.method126(101, var11);
                                }
                                if (class137.method931(0, class170.method1113(arg2, (byte) -50))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class1.field1++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 5;
                                            } else {
                                                var13 = 34;
                                            }
                                            class108.method693(class187.method1197(new class132[] { class236.field4259, var10.field4399 }, -83), var11[var12], -501, (long) var10.field4402, var13, arg2.field1794, var5);
                                        } else if (var12 == 4) {
                                            class108.method693(class187.method1197(new class132[] { class236.field4259, var10.field4399 }, -73), class148.field2726, -501, (long) var10.field4402, (short) 34, arg2.field1794, var5);
                                            class10.field113++;
                                        }
                                    }
                                }
                                if (class13.method65(class170.method1113(arg2, (byte) -50), 0)) {
                                    class167.field3036++;
                                    class108.method693(class187.method1197(new class132[] { class236.field4259, var10.field4399 }, -76), class187.field3465, -501, (long) var10.field4402, (short) 42, arg2.field1794, var5);
                                }
                                class128.field2373++;
                                if (class137.method931(0, class170.method1113(arg2, (byte) -50)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            class203.field3727++;
                                            if (var14 == 0) {
                                                var15 = 19;
                                            }
                                            if (var14 == 1) {
                                                var15 = 6;
                                            }
                                            if (var14 == 2) {
                                                var15 = 1;
                                            }
                                            class108.method693(class187.method1197(new class132[] { class236.field4259, var10.field4399 }, -110), var11[var14], -501, (long) var10.field4402, var15, arg2.field1794, var5);
                                        }
                                    }
                                }
                                class132[] var16 = arg2.field1701;
                                if (class202.field3716) {
                                    var16 = class19.method126(-119, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class150.field2752++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 57;
                                            }
                                            if (var17 == 1) {
                                                var18 = 4;
                                            }
                                            if (var17 == 2) {
                                                var18 = 9;
                                            }
                                            if (var17 == 3) {
                                                var18 = 35;
                                            }
                                            if (var17 == 4) {
                                                var18 = 25;
                                            }
                                            class108.method693(class187.method1197(new class132[] { class236.field4259, var10.field4399 }, -86), var16[var17], -501, (long) var10.field4402, var18, arg2.field1794, var5);
                                        }
                                    }
                                }
                                class108.method693(class187.method1197(new class132[] { class236.field4259, var10.field4399 }, -93), class84.field1472, -501, (long) var10.field4402, (short) 1001, arg2.field1794, var5);
                            } else if ((class38.field621 & 0x10) == 16) {
                                class183.field3372++;
                                class108.method693(class187.method1197(new class132[] { class160.field2914, class69.field1146, var10.field4399 }, -102), class138.field2589, -501, (long) var10.field4402, (short) 23, arg2.field1794, var5);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field1766) {
            return;
        }
        if (!class10.field116) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class132 var23 = class149.method990(false, arg2, var19);
                if (var23 != null) {
                    class190.field3519++;
                    class108.method693(arg2.field1738, var23, -501, (long) (var19 + 1), (short) 1003, arg2.field1794, arg2.field1743);
                }
            }
            class132 var20 = class26.method191(20532, arg2);
            if (var20 != null) {
                class108.method693(arg2.field1738, var20, -501, 0L, (short) 31, arg2.field1794, arg2.field1743);
                class24.field331++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class132 var22 = class149.method990(false, arg2, var21);
                if (var22 != null) {
                    class108.method693(arg2.field1738, var22, -501, (long) (var21 + 1), (short) 22, arg2.field1794, arg2.field1743);
                    class190.field3519++;
                }
            }
            if (class26.method193(-86, class170.method1113(arg2, (byte) -50))) {
                class108.method693(class75.field1247, class37.field618, -501, 0L, (short) 3, arg2.field1794, arg2.field1743);
                class194.field3599++;
                return;
            }
            return;
        }
        if (class129.method851(0, class170.method1113(arg2, (byte) -50)) && (class38.field621 & 0x20) == 32) {
            class113.field2192++;
            class108.method693(class187.method1197(new class132[] { class160.field2914, class141.field2643, arg2.field1738 }, -109), class138.field2589, -501, 0L, (short) 17, arg2.field1794, arg2.field1743);
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static void method479(int arg0) {
        field1313 = null;
        if (arg0 != -7448) {
            return;
        }
        field1316 = null;
        field1314 = null;
        field1317 = null;
        field1318 = null;
        field1315 = null;
        field1321 = null;
        field1328 = null;
        field1334 = null;
        field1323 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field1320++;
        int var9 = 0;
        int var10 = arg4;
        int var11 = arg5 - arg0;
        int var12 = arg4 - arg0;
        int var13 = arg5 * arg5;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg4 << 1;
        if (arg1 != -2357) {
            method479(10);
        }
        int var22 = var12 << 1;
        int var23 = var14 - (var21 - 1) * var18;
        int var24 = (1 - var21) * var13 + var17;
        int var25 = (1 - var22) * var15 + var20;
        int var26 = var16 - (var22 - 1) * var19;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var16 << 2;
        int var30 = var14 << 2;
        int var31 = var17 * 3;
        int var32 = var20 * 3;
        int var33 = (var22 - 3) * var19;
        int var34 = (var21 - 3) * var18;
        int var35 = (arg4 - 1) * var27;
        int var36 = var30;
        int var37 = var29;
        if (class169.field3161 <= arg2 && class17.field254 >= arg2) {
            int[] var38 = class61.field1033[arg2];
            int var39 = class159.method1034(arg7 - arg5, (byte) 76, class135.field2542, class168.field3083);
            int var40 = class159.method1034(arg7 + arg5, (byte) 114, class135.field2542, class168.field3083);
            int var41 = class159.method1034(arg7 - var11, (byte) 63, class135.field2542, class168.field3083);
            int var42 = class159.method1034(arg7 + var11, (byte) 51, class135.field2542, class168.field3083);
            class23.method153(arg6, var38, true, var39, var41);
            class23.method153(arg3, var38, true, var41, var42);
            class23.method153(arg6, var38, true, var42, var40);
        }
        int var43 = (var12 - 1) * var28;
        while (var10 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var23 += var36;
                    var8++;
                    var24 += var31;
                    var36 += var30;
                    var31 += var30;
                }
            }
            if (var23 < 0) {
                var24 += var31;
                var23 += var36;
                var36 += var30;
                var31 += var30;
                var8++;
            }
            boolean var44 = var10 <= var12;
            var24 += -var35;
            var10--;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var32 += var29;
                        var9++;
                        var26 += var37;
                        var37 += var29;
                    }
                }
                if (var26 < 0) {
                    var25 += var32;
                    var26 += var37;
                    var9++;
                    var37 += var29;
                    var32 += var29;
                }
                var25 += -var43;
                var43 -= var28;
                var26 += -var33;
                var33 -= var28;
            }
            var23 += -var34;
            var34 -= var27;
            var35 -= var27;
            int var45 = arg2 - var10;
            int var46 = arg2 + var10;
            if (class169.field3161 <= var46 && var45 <= class17.field254) {
                int var47 = class159.method1034(arg7 + var8, (byte) 33, class135.field2542, class168.field3083);
                int var48 = class159.method1034(arg7 - var8, (byte) 31, class135.field2542, class168.field3083);
                if (var44) {
                    int var49 = class159.method1034(arg7 + var9, (byte) 123, class135.field2542, class168.field3083);
                    int var50 = class159.method1034(arg7 - var9, (byte) 30, class135.field2542, class168.field3083);
                    if (class169.field3161 <= var45) {
                        int[] var51 = class61.field1033[var45];
                        class23.method153(arg6, var51, true, var48, var50);
                        class23.method153(arg3, var51, true, var50, var49);
                        class23.method153(arg6, var51, true, var49, var47);
                    }
                    if (var46 <= class17.field254) {
                        int[] var52 = class61.field1033[var46];
                        class23.method153(arg6, var52, true, var48, var50);
                        class23.method153(arg3, var52, true, var50, var49);
                        class23.method153(arg6, var52, true, var49, var47);
                    }
                } else {
                    if (class169.field3161 <= var45) {
                        class23.method153(arg6, class61.field1033[var45], true, var48, var47);
                    }
                    if (var46 <= class17.field254) {
                        class23.method153(arg6, class61.field1033[var46], true, var48, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)I")
    public static final int method481(int arg0, int arg1, int arg2, int arg3) {
        field1326++;
        if ((class148.field2722[arg1][arg0][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class148.field2722[1][arg0][arg2] & 0x2) == 0) {
            if (arg3 >= -81) {
                field1333 = -26;
            }
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public final void method482(int arg0) {
        field1309++;
        if (arg0 > -78) {
            return;
        }
        int var2 = this.field1329;
        class84 var3 = this.field1327.method515(-45);
        if (var3 == null) {
            this.field1312 = 0;
            this.field1329 = -1;
            this.field1325 = 0;
            this.field1335 = 0;
            this.field1330 = null;
        } else {
            this.field1330 = var3.field1407;
            this.field1312 = var3.field1410 * 128;
            this.field1329 = var3.field1464;
            this.field1325 = var3.field1412;
            this.field1335 = var3.field1429;
        }
        if (this.field1329 != var2 && this.field1308 != null) {
            class36.field586.method1268(this.field1308);
            this.field1308 = null;
        }
    }
}
