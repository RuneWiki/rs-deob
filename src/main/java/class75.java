import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class75 extends class172 {

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "Lid;")
    public static class149 field1345 = class60.method382("M", (byte) 103);

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "Lid;")
    public static class149 field1354 = class60.method382("rouge:", (byte) 102);

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "[I")
    public static int[] field1359 = new int[14];

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "Lid;")
    private static class149 field1349 = class60.method382("Allocated memory", (byte) 28);

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "Lid;")
    public static class149 field1344 = field1349;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "Lid;")
    public static class149 field1357 = class60.method382("::noclip", (byte) 22);

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "Lid;")
    public class149 field1364;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1362;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "[I")
    public int[] field1350;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "[I")
    public int[] field1352;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "[I")
    public int[] field1358;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "[I")
    public int[] field1361;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public final void method536(int arg0) {
        if (this.field1361 != null) {
            for (int var2 = 0; var2 < this.field1361.length; var2++) {
                this.field1361[var2] = class40.method238(this.field1361[var2], 32768);
            }
        }
        if (arg0 != -24414) {
            return;
        }
        if (this.field1358 != null) {
            for (int var3 = 0; var3 < this.field1358.length; var3++) {
                this.field1358[var3] = class40.method238(this.field1358[var3], 32768);
            }
        }
        field1363++;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static final void method537(int arg0) {
        class287.field5096.method1291(0);
        if (arg0 != -1) {
            method539(-5, 122, -25, -77, 81, -51, -9);
        }
        field1367++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method538(int arg0, Component arg1) {
        if (arg0 != 0) {
            method539(84, 11, -28, 36, -1, -18, 12);
        }
        arg1.addMouseListener(class86.field1570);
        arg1.addMouseMotionListener(class86.field1570);
        arg1.addFocusListener(class86.field1570);
        field1366++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class43.field657 == 0) {
            int var7 = class159.field2926;
            int var8 = class284.field5023;
            int var9 = class102.field1800;
            int var10 = class240.field4198;
            int var11 = (arg5 - arg0) * (var10 - var8) / arg4 + var8;
            int var12 = (arg1 - arg6) * (var9 - var7) / arg3 + var7;
            if (class40.field621 && (class247.field4332 & 0x40) != 0) {
                class47 var13 = class247.method1720(class24.field368, 18062, class97.field1717);
                if (var13 == null) {
                    class261.method1816(5197);
                } else {
                    class69.method434((byte) 109, class197.field3586, (short) 41, class197.field3581, var12, var11, 0L, class216.field3805);
                }
            } else {
                class96.field1695++;
                if (class245.field4306 == 1) {
                    class69.method434((byte) 114, class171.field3158, (short) 5, class198.field3599, var12, var11, 0L, -1);
                }
                class69.method434((byte) 118, class171.field3158, (short) 57, class54.field981, var12, var11, 0L, -1);
            }
        }
        field1360++;
        long var14 = -1L;
        if (arg2 > -112) {
            field1348 = 2;
        }
        for (int var16 = 0; var16 < class133.field2429; var16++) {
            long var17 = class285.field5074[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3F87) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class183.method1269(class277.field4948, var19, var20, var17)) {
                    class268 var23 = class108.method755(11525, var22);
                    if (var23.field4767 != null) {
                        var23 = var23.method1863((byte) -84);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class43.field657 == 1) {
                        class69.method434((byte) 118, class237.method1603(new class149[] { class70.field1237, class236.field4142, var23.field4780 }, -110), (short) 48, class43.field660, var19, var20, var17, class210.field3751);
                        class164.field3050++;
                    } else if (class40.field621) {
                        class49 var24 = class273.field4901 == -1 ? null : class138.method964(-96, class273.field4901);
                        if ((class247.field4332 & 0x4) != 0 && (var24 == null || var23.method1865(false, var24.field882, class273.field4901) != var24.field882)) {
                            class138.field2527++;
                            class69.method434((byte) 122, class237.method1603(new class149[] { class230.field4017, class236.field4142, var23.field4780 }, -96), (short) 28, class197.field3581, var19, var20, var17, class216.field3805);
                        }
                    } else {
                        class107.field1847++;
                        class149[] var25 = var23.field4825;
                        if (class261.field4601) {
                            var25 = class240.method1650(var25, 0);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class48.field876++;
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 20;
                                    }
                                    int var28 = -1;
                                    if (var23.field4813 == var26) {
                                        var28 = var23.field4783;
                                    }
                                    if (var26 == 1) {
                                        var27 = 11;
                                    }
                                    if (var26 == 2) {
                                        var27 = 58;
                                    }
                                    if (var26 == 3) {
                                        var27 = 45;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1003;
                                    }
                                    if (var23.field4819 == var26) {
                                        var28 = var23.field4770;
                                    }
                                    class69.method434((byte) 123, class237.method1603(new class149[] { class11.field164, var23.field4780 }, -95), var27, var25[var26], var19, var20, var17, var28);
                                }
                            }
                        }
                        class69.method434((byte) 123, class237.method1603(new class149[] { class11.field164, var23.field4780 }, -91), (short) 1004, class278.field4968, var19, var20, (long) var23.field4773, class222.field3919);
                    }
                }
                if (var21 == 1) {
                    class20 var29 = class38.field572[var22];
                    if ((var29.field296.field1049 & 0x1) == 0 && (var29.field2347 & 0x7F) == 0 && (var29.field2340 & 0x7F) == 0 || (var29.field296.field1049 & 0x1) == 1 && (var29.field2347 & 0x7F) == 64 && (var29.field2340 & 0x7F) == 64) {
                        int var30 = var29.field2340 + 64 - (var29.field296.field1049 * 64);
                        int var31 = var29.field2347 - ((var29.field296.field1049 - 1) * 64);
                        for (int var32 = 0; var32 < class182.field3281; var32++) {
                            class20 var37 = class38.field572[class110.field1906[var32]];
                            int var38 = var37.field2347 + 64 - var37.field296.field1049 * 64;
                            int var39 = var37.field2340 - (var37.field296.field1049 * 64 - 64);
                            if (var37 != null && var29 != var37 && var38 >= var31 && var37.field296.field1049 <= var29.field296.field1049 - (var38 - var31 >> 7) && var39 >= var30 && var37.field296.field1049 <= var29.field296.field1049 - (var39 - var30 >> 7)) {
                                class155.method1102(var19, var20, (byte) -115, class110.field1906[var32], var37.field296);
                            }
                        }
                        for (int var33 = 0; var33 < class253.field4432; var33++) {
                            class127 var34 = class107.field1851[class251.field4407[var33]];
                            int var35 = var34.field2347 - (var34.method885((byte) -66) * 64 - 64);
                            int var36 = var34.field2340 - (var34.method885((byte) -38) - 1) * 64;
                            if (var34 != null && var35 >= var31 && var34.method885((byte) -117) <= (var29.field296.field1049 - (var35 - var31 >> 7)) && var36 >= var30 && var34.method885((byte) -49) <= (var29.field296.field1049 - (var36 - var30 >> 7))) {
                                class140.method978(var20, var19, 10455, class251.field4407[var33], var34);
                            }
                        }
                    }
                    class155.method1102(var19, var20, (byte) -118, var22, var29.field296);
                }
                if (var21 == 0) {
                    class127 var40 = class107.field1851[var22];
                    if ((var40.field2347 & 0x7F) == 64 && (var40.field2340 & 0x7F) == 64) {
                        int var41 = var40.field2347 - (var40.method885((byte) -63) * 64 - 64);
                        int var42 = var40.field2340 - ((var40.method885((byte) -85) - 1) * 64);
                        for (int var43 = 0; var43 < class182.field3281; var43++) {
                            class20 var48 = class38.field572[class110.field1906[var43]];
                            int var49 = var48.field2347 - ((var48.field296.field1049 - 1) * 64);
                            int var50 = var48.field2340 - ((var48.field296.field1049 - 1) * 64);
                            if (var48 != null && var41 <= var49 && var48.field296.field1049 <= var40.method885((byte) -88) - (var49 - var41 >> 7) && var42 <= var50 && var48.field296.field1049 <= var40.method885((byte) -30) - (var50 - var42 >> 7)) {
                                class155.method1102(var19, var20, (byte) -115, class110.field1906[var43], var48.field296);
                            }
                        }
                        for (int var44 = 0; var44 < class253.field4432; var44++) {
                            class127 var45 = class107.field1851[class251.field4407[var44]];
                            int var46 = var45.field2347 + 64 - var45.method885((byte) -98) * 64;
                            int var47 = var45.field2340 + 64 - (var45.method885((byte) -21) * 64);
                            if (var45 != null && var40 != var45 && var41 <= var46 && var45.method885((byte) -104) <= var40.method885((byte) -81) - (var46 - var41 >> 7) && var47 >= var42 && var45.method885((byte) -127) <= var40.method885((byte) -23) - (var47 - var42 >> 7)) {
                                class140.method978(var20, var19, 10455, class251.field4407[var44], var45);
                            }
                        }
                    }
                    class140.method978(var20, var19, 10455, var22, var40);
                }
                if (var21 == 3) {
                    class157 var51 = class83.field1515[class277.field4948][var19][var20];
                    if (var51 != null) {
                        for (class83 var52 = (class83) var51.method1128((byte) -84); var52 != null; var52 = (class83) var51.method1138(-114)) {
                            int var53 = var52.field1526.field117;
                            class261 var54 = class226.method1516(var53, -28322);
                            if (class43.field657 == 1) {
                                class69.method434((byte) 116, class237.method1603(new class149[] { class70.field1237, class60.field1090, var54.field4604 }, -127), (short) 36, class43.field660, var19, var20, (long) var53, class210.field3751);
                                class257.field4497++;
                            } else if (class40.field621) {
                                class49 var55 = class273.field4901 == -1 ? null : class138.method964(-86, class273.field4901);
                                if ((class247.field4332 & 0x1) != 0 && (var55 == null || var54.method1808(var55.field882, class273.field4901, (byte) -123) != var55.field882)) {
                                    class69.method434((byte) 124, class237.method1603(new class149[] { class230.field4017, class60.field1090, var54.field4604 }, -124), (short) 24, class197.field3581, var19, var20, (long) var53, class216.field3805);
                                    class5.field64++;
                                }
                            } else {
                                class149[] var56 = var54.field4614;
                                if (class261.field4601) {
                                    var56 = class240.method1650(var56, 0);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class163.field3026++;
                                        byte var58 = 0;
                                        if (var57 == 0) {
                                            var58 = 21;
                                        }
                                        if (var57 == 1) {
                                            var58 = 25;
                                        }
                                        int var59 = -1;
                                        if (var54.field4595 == var57) {
                                            var59 = var54.field4589;
                                        }
                                        if (var57 == 2) {
                                            var58 = 7;
                                        }
                                        if (var54.field4642 == var57) {
                                            var59 = var54.field4640;
                                        }
                                        if (var57 == 3) {
                                            var58 = 35;
                                        }
                                        if (var57 == 4) {
                                            var58 = 43;
                                        }
                                        class69.method434((byte) 125, class237.method1603(new class149[] { class36.field541, var54.field4604 }, -99), var58, var56[var57], var19, var20, (long) var53, var59);
                                    }
                                }
                                class171.field3159++;
                                class69.method434((byte) 109, class237.method1603(new class149[] { class36.field541, var54.field4604 }, -118), (short) 1006, class278.field4968, var19, var20, (long) var53, class222.field3919);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljf;Ljf;I)V")
    public static final void method540(class64 arg0, class64 arg1, int arg2) {
        if (arg0.field1153 != null) {
            arg0.method401((byte) -118);
        }
        arg0.field1153 = arg1.field1153;
        field1356++;
        arg0.field1144 = arg1;
        arg0.field1153.field1144 = arg0;
        arg0.field1144.field1153 = arg0;
        if (arg2 != 27578) {
            field1344 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
    public final int method541(int arg0, int arg1) {
        field1355++;
        if (this.field1358 == null) {
            return -1;
        } else if (arg0 == 64) {
            for (int var3 = 0; var3 < this.field1358.length; var3++) {
                if (this.field1352[var3] == arg1) {
                    return this.field1358[var3];
                }
            }
            return -1;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILgd;)V")
    public final void method542(int arg0, class74 arg1) {
        if (arg0 < 37) {
            field1351 = -11;
        }
        while (true) {
            int var3 = arg1.method489((byte) -36);
            if (var3 == 0) {
                field1353++;
                return;
            }
            this.method545(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)I")
    public final int method543(int arg0, int arg1) {
        field1346++;
        if (this.field1361 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1361.length; var3++) {
            if (this.field1350[var3] == arg0) {
                return this.field1361[var3];
            }
        }
        return arg1 == -64 ? -1 : -65;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Lpk;")
    public static final class100 method544(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        return var3 == null || var3.field4048 == null ? null : var3.field4048;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lgd;IZ)V")
    private final void method545(class74 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field1364 = arg0.method529(-1);
        } else if (arg1 == 2) {
            int var6 = arg0.method489((byte) -127);
            this.field1352 = new int[var6];
            this.field1358 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1358[var7] = arg0.method485(-2386);
                this.field1352[var7] = class169.method1220(arg0.method514((byte) 1), 255);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method489((byte) -100);
            this.field1361 = new int[var4];
            this.field1350 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1361[var5] = arg0.method485(-2386);
                this.field1350[var5] = class169.method1220(arg0.method514((byte) 1), 255);
            }
        }
        if (arg2) {
            field1347++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
    public static void method546(byte arg0) {
        if (arg0 != -3) {
            return;
        }
        field1359 = null;
        field1357 = null;
        field1354 = null;
        field1345 = null;
        field1349 = null;
        field1362 = null;
        field1344 = null;
    }
}
