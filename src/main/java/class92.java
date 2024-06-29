import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class92 extends class89 {

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
    public int field1305 = -1;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "I")
    public static int field1296 = 0;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1295 = "cyan:";

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
    public static int field1301 = 0;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "[I")
    public static int[] field1298 = new int[5];

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
    public static int field1304 = 1;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "Ljava/lang/String;")
    public String field1297;

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "Ljava/lang/String;")
    public String field1302;

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "[[[Lgk;")
    public static class254[][][] field1299;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIZZ)V")
    public static final void method641(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class104.field1436 = arg1;
        class214.field2858 = arg2;
        class264.field3838 = arg3;
        field1299 = new class254[arg0][class104.field1436][class214.field2858];
        class265.field3846 = new class351[arg0];
        if (arg4) {
            class99.field1387 = new class254[1][class104.field1436][class214.field2858];
            class282.field4111 = new int[class104.field1436][class214.field2858];
            class191.field2557 = new class351[1];
        } else {
            class99.field1387 = null;
            class282.field4111 = null;
            class191.field2557 = null;
        }
        if (arg5) {
            class23.field304 = new int[arg0][arg1][arg2];
            class75.field1078 = new class227[255];
            class177.field2338 = new boolean[255];
            class339.field4888 = 0;
        } else {
            class23.field304 = null;
            class75.field1078 = null;
            class177.field2338 = null;
            class339.field4888 = 0;
        }
        class78.method566(false);
        class194.field2604 = new class432[500];
        class395.field5826 = 0;
        class411.field6073 = new class432[500];
        class307.field4522 = 0;
        class246.field3324 = new int[arg0][class104.field1436 + 1][class214.field2858 + 1];
        class163.field2183 = new class55[5000];
        class397.field5914 = 0;
        class211.field2799 = new boolean[class264.field3838 + class264.field3838 + 1][class264.field3838 + class264.field3838 + 1];
        class5.field67 = new boolean[class264.field3838 + class264.field3838 + 2][class264.field3838 + class264.field3838 + 2];
        class328.field4782 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([SI)[S")
    public static final short[] method642(short[] arg0, int arg1) {
        ++field1293;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            if (arg1 >= -61) {
                method646(false);
            }
            class60.method417(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([[[Lgk;IIIIZ)Z")
    public static final boolean method643(class254[][][] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1303;
        byte var6 = arg5 ? 1 : (byte) (255 & class236.field3139);
        int var7 = 83 % ((-12 - arg1) / 39);
        if (~class12.field184[class227.field2981][arg2][arg4] == ~var6) {
            return false;
        } else if (~(class103.field1430[class227.field2981][arg2][arg4] & 4) == -1) {
            return false;
        } else {
            byte var8 = 0;
            class382.field5550[var8] = arg2;
            int var9 = 0;
            int var36 = var8 + 1;
            class315.field4602[var8] = arg4;
            class12.field184[class227.field2981][arg2][arg4] = var6;
            while (~var36 != ~var9) {
                int var10 = 65535 & class382.field5550[var9];
                int var11 = (16756116 & class382.field5550[var9]) >> 16;
                int var12 = class382.field5550[var9] >> 24 & 255;
                int var13 = class315.field4602[var9] & 65535;
                int var14 = class315.field4602[var9] >> 16 & 255;
                var9 = 4095 & var9 + 1;
                boolean var15 = false;
                if ((4 & class103.field1430[class227.field2981][var10][var13]) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                label233: for (int var17 = class227.field2981 + 1; ~var17 >= -4; ++var17) {
                    if (~(8 & class103.field1430[var17][var10][var13]) == -1) {
                        if (var15 && arg0[var17][var10][var13] != null) {
                            if (arg0[var17][var10][var13].field3510 != null) {
                                int var21 = class310.method2104(var11, (byte) 125);
                                if (~arg0[var17][var10][var13].field3510.field1365 == ~var21 || arg0[var17][var10][var13].field3512 != null && ~arg0[var17][var10][var13].field3512.field1365 == ~var21) {
                                    continue;
                                }
                                if (~var12 != -1) {
                                    int var22 = class310.method2104(var12, (byte) 125);
                                    if (arg0[var17][var10][var13].field3510.field1365 == var22 || arg0[var17][var10][var13].field3512 != null && arg0[var17][var10][var13].field3512.field1365 == var22) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var23 = class310.method2104(var14, (byte) 125);
                                    if (arg0[var17][var10][var13].field3510.field1365 == var23 || arg0[var17][var10][var13].field3512 != null && arg0[var17][var10][var13].field3512.field1365 == var23) {
                                        continue;
                                    }
                                }
                            }
                            class254 var24 = arg0[var17][var10][var13];
                            if (var24.field3515 != null) {
                                for (class328 var25 = var24.field3515; var25 != null; var25 = var25.field4783) {
                                    class55 var26 = var25.field4785;
                                    if (var26 instanceof class425) {
                                        class425 var27 = (class425) var26;
                                        int var28 = var27.method105(-28);
                                        int var29 = var27.method120(25940);
                                        if (var28 == 21) {
                                            var28 = 19;
                                        }
                                        int var30 = var28 | var29 << 6;
                                        if (var11 == var30 || var12 != 0 && ~var12 == ~var30 || ~var14 != -1 && var14 == var30) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class254 var31 = arg0[var17][var10][var13];
                        if (var31 != null && var31.field3515 != null) {
                            for (class328 var32 = var31.field3515; var32 != null; var32 = var32.field4783) {
                                class55 var33 = var32.field4785;
                                if (var33.field743 != var33.field742 || var33.field737 != var33.field726) {
                                    for (int var34 = var33.field743; var33.field742 >= var34; ++var34) {
                                        for (int var35 = var33.field726; var33.field737 >= var35; ++var35) {
                                            class12.field184[var17][var34][var35] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class12.field184[var17][var10][var13] = var6;
                        var16 = true;
                    }
                }
                if (var16) {
                    int var18 = class12.field205[class227.field2981 + 1].method742(var10, var13);
                    if (class11.field169[arg3] < var18) {
                        class11.field169[arg3] = var18;
                    }
                    int var19 = var10 << 7;
                    if (~var19 <= ~class205.field2772[arg3]) {
                        if (var19 > class363.field5235[arg3]) {
                            class363.field5235[arg3] = var19;
                        }
                    } else {
                        class205.field2772[arg3] = var19;
                    }
                    int var20 = var13 << 7;
                    if (~var20 <= ~class156.field2118[arg3]) {
                        if (~var20 < ~class17.field246[arg3]) {
                            class17.field246[arg3] = var20;
                        }
                    } else {
                        class156.field2118[arg3] = var20;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class12.field184[class227.field2981][var10 + -1][var13] != var6) {
                        class382.field5550[var36] = class351.method2313(-754974720, class351.method2313(var10 + -1, 1179648));
                        class315.field4602[var36] = class351.method2313(1245184, var13);
                        class12.field184[class227.field2981][var10 + -1][var13] = var6;
                        var36 = var36 + 1 & 4095;
                    }
                    ++var13;
                    if (~var13 > ~class364.field5262) {
                        if (var10 + -1 >= 0 && ~class12.field184[class227.field2981][var10 + -1][var13] != ~var6 && ~(class103.field1430[class227.field2981][var10][var13] & 4) == -1 && ~(class103.field1430[class227.field2981][var10 + -1][var13 - 1] & 4) == -1) {
                            class382.field5550[var36] = class351.method2313(class351.method2313(1179648, var10 + -1), 1375731712);
                            class315.field4602[var36] = class351.method2313(var13, 1245184);
                            class12.field184[class227.field2981][var10 - 1][var13] = var6;
                            var36 = 4095 & var36 - -1;
                        }
                        if (~class12.field184[class227.field2981][var10][var13] != ~var6) {
                            class382.field5550[var36] = class351.method2313(318767104, class351.method2313(var10, 5373952));
                            class315.field4602[var36] = class351.method2313(var13, 5439488);
                            var36 = var36 - -1 & 4095;
                            class12.field184[class227.field2981][var10][var13] = var6;
                        }
                        if (class192.field2574 > var10 + 1 && ~class12.field184[class227.field2981][var10 + 1][var13] != ~var6 && ~(4 & class103.field1430[class227.field2981][var10][var13]) == -1 && ~(class103.field1430[class227.field2981][var10 + 1][var13 + -1] & 4) == -1) {
                            class382.field5550[var36] = class351.method2313(class351.method2313(var10 + 1, 5373952), -1845493760);
                            class315.field4602[var36] = class351.method2313(var13, 5439488);
                            var36 = var36 + 1 & 4095;
                            class12.field184[class227.field2981][var10 - -1][var13] = var6;
                        }
                    }
                    --var13;
                    if (var10 + 1 < class192.field2574 && class12.field184[class227.field2981][var10 + 1][var13] != var6) {
                        class382.field5550[var36] = class351.method2313(class351.method2313(var10 + 1, 9568256), 1392508928);
                        class315.field4602[var36] = class351.method2313(9633792, var13);
                        class12.field184[class227.field2981][var10 + 1][var13] = var6;
                        var36 = 4095 & var36 + 1;
                    }
                    --var13;
                    if (~var13 <= -1) {
                        if (var10 + -1 >= 0 && ~class12.field184[class227.field2981][var10 + -1][var13] != ~var6 && (4 & class103.field1430[class227.field2981][var10][var13]) == 0 && ~(4 & class103.field1430[class227.field2981][var10 + -1][var13 - -1]) == -1) {
                            class382.field5550[var36] = class351.method2313(301989888, class351.method2313(13762560, var10 + -1));
                            class315.field4602[var36] = class351.method2313(13828096, var13);
                            var36 = var36 - -1 & 4095;
                            class12.field184[class227.field2981][var10 - 1][var13] = var6;
                        }
                        if (class12.field184[class227.field2981][var10][var13] != var6) {
                            class382.field5550[var36] = class351.method2313(class351.method2313(13762560, var10), -1828716544);
                            class315.field4602[var36] = class351.method2313(var13, 13828096);
                            var36 = var36 - -1 & 4095;
                            class12.field184[class227.field2981][var10][var13] = var6;
                        }
                        if (class192.field2574 > var10 + 1 && ~class12.field184[class227.field2981][var10 + 1][var13] != ~var6 && (class103.field1430[class227.field2981][var10][var13] & 4) == 0 && (4 & class103.field1430[class227.field2981][var10 + 1][var13 + 1]) == 0) {
                            class382.field5550[var36] = class351.method2313(class351.method2313(var10 - -1, 9568256), -771751936);
                            class315.field4602[var36] = class351.method2313(9633792, var13);
                            class12.field184[class227.field2981][var10 + 1][var13] = var6;
                            var36 = var36 + 1 & 4095;
                        }
                    }
                }
            }
            if (~class11.field169[arg3] != 999999) {
                class11.field169[arg3] += 10;
                class205.field2772[arg3] -= 50;
                class363.field5235[arg3] += 50;
                class17.field246[arg3] += 50;
                class156.field2118[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
    public static final void method644(int arg0, int arg1) {
        ++field1291;
        class263 var2 = class47.method337(arg0, 0, arg1);
        var2.method1806(false);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)Lpj;")
    public final class393 method645(int arg0) {
        ++field1292;
        if (arg0 != -25881) {
            field1296 = 118;
        }
        return class144.field1969[super.field1255];
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V")
    public static void method646(boolean arg0) {
        field1295 = null;
        if (arg0) {
            field1304 = -56;
        }
        field1298 = null;
        field1299 = null;
    }
}
