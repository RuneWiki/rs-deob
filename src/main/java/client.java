import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class50 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field4016 = 0;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
    public static int[] field4022 = new int[100];

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[Lll;")
    public static class146[] field4023 = new class146[4];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "D")
    public static double field4031 = -1.0D;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 18)
    public final void method356(byte arg0) {
        class238.field4008 = new class100();
        class242.field4072 = new class5();
        field4021++;
        if (class48.field780 == 0) {
        }
        class199.method1477(false, class283.field4890, class210.field3585);
        class117.field1992 = class265.field4574 == 0 ? 443 : class246.field4160 + 50000;
        if (class230.field3907 == 1) {
            class82.field1373 = class73.field1229;
            class262.field4513 = class249.field4196;
            class239.field4037 = 16777215;
            class239.field4044 = 0;
            class240.field4057 = class138.field2365;
            class69.field1184 = class61.field1073;
        } else {
            class262.field4513 = class211.field3599;
            class240.field4057 = class197.field3309;
            class82.field1373 = class196.field3292;
            class69.field1184 = class194.field3272;
        }
        class11.field146 = class262.field4485 = class203.field3437 = class112.field1904 = new short[256];
        class155.field2663 = class265.field4574 == 0 ? 43594 : class246.field4160 + 40000;
        class311.field5304 = class155.field2663;
        class176.method1294(-76);
        class87.method700(class237.field3991, 16);
        class281.method1993((byte) -51, class237.field3991);
        class205.field3473 = class286.method2010(false);
        if (class205.field3473 != null) {
            class205.field3473.method864(126, class237.field3991);
        }
        class226.field3813 = class124.field2065;
        try {
            if (class210.field3585.field2074 != null) {
                class245.field4119 = new class39(class210.field3585.field2074, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class10.field126[var2] = new class39(class210.field3585.field2081[var2], 6000, 0);
                }
                class134.field2313 = new class39(class210.field3585.field2078, 6000, 0);
                class111.field1900 = new class188(255, class245.field4119, class134.field2313, 500000);
                class34.field493 = new class39(class210.field3585.field2082, 24, 0);
                class210.field3585.field2082 = null;
                class210.field3585.field2081 = null;
                class210.field3585.field2074 = null;
                class210.field3585.field2078 = null;
            }
            int var3 = 125 % ((arg0 - 39) / 39);
        } catch (IOException var5) {
            class245.field4119 = null;
            class134.field2313 = null;
            class34.field493 = null;
            class111.field1900 = null;
        }
        if (class265.field4574 != 0) {
            class73.field1228 = true;
        }
        class97.field1598 = class161.field2732;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 109)
    private final void method1727(byte arg0) {
        field4029++;
        boolean var2 = class242.field4072.method32(false);
        if (!var2) {
            this.method1736(-64);
        }
        if (arg0 != 96) {
            this.method364((byte) 52);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lre;IIIIIII)V", line = 139)
    public static final void method1728(class262[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class262 var9 = arg0[var8];
            if (var9 != null && var9.field4446 == arg1 && (!var9.field4540 || var9.field4441 == 0 || var9.field4448 || method1734(var9) != 0 || class126.field2175 == var9 || var9.field4462 == 1338) && (!var9.field4540 || !method1737(var9))) {
                int var10 = var9.field4521 + arg6;
                int var11 = var9.field4439 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4441 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4531 + var10;
                    int var17 = var9.field4517 + var11;
                    if (var9.field4441 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class270.field4675 == var9) {
                    class235.field3966 = true;
                    class113.field1930 = var10;
                    class32.field462 = var11;
                }
                if (!var9.field4540 || var12 < var14 && var13 < var15) {
                    if (var9.field4441 == 0) {
                        if (!var9.field4540 && method1737(var9) && class61.field1065 != var9) {
                            continue;
                        }
                        if (var9.field4456 && class66.field1135 >= var12 && class26.field351 >= var13 && class66.field1135 < var14 && class26.field351 < var15) {
                            for (class24 var18 = (class24) class237.field3992.method1250(true); var18 != null; var18 = (class24) class237.field3992.method1256((byte) -123)) {
                                if (var18.field303) {
                                    var18.method1527(38);
                                }
                            }
                            if (class113.field1915 == 0) {
                                class270.field4675 = null;
                                class126.field2175 = null;
                            }
                            class120.field2025 = false;
                        }
                    }
                    if (var9.field4540) {
                        boolean var19;
                        if (class66.field1135 >= var12 && class26.field351 >= var13 && class66.field1135 < var14 && class26.field351 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class61.field1066 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class87.field1435 == 1 && class39.field595 >= var12 && class271.field4685 >= var13 && class39.field595 < var14 && class271.field4685 < var15) {
                            var21 = true;
                        }
                        if (class66.field1154 > 0 && var9.field4516 != null) {
                            for (int var22 = 0; var22 < var9.field4516.length; var22++) {
                                for (int var23 = 0; var23 < class66.field1154; var23++) {
                                    int var24 = var9.field4516[var22] & 0xFF;
                                    if (class230.field3911[var23] == var24) {
                                        if (var9.field4466 != null) {
                                            byte var25 = var9.field4466[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class163.field2767[86] || (var25 & 0x1) != 0 && !class163.field2767[82] || (var25 & 0x4) != 0 && !class163.field2767[81])) {
                                                continue;
                                            }
                                        }
                                        class31.method209(var22 + 1, class121.field2037, 25014, -1, var9.field4418);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class48.method349(class271.field4685 - var11, class39.field595 - var10, (byte) 84, var9);
                        }
                        if (class270.field4675 != null && class270.field4675 != var9 && var19 && class14.method72(false, method1734(var9))) {
                            class171.field2879 = var9;
                        }
                        if (class126.field2175 == var9) {
                            class260.field4356 = true;
                            class93.field1516 = var10;
                            class9.field118 = var11;
                        }
                        if (var9.field4448 || var9.field4462 != 0) {
                            if (var19 && class127.field2200 != 0 && var9.field4519 != null) {
                                class24 var26 = new class24();
                                var26.field303 = true;
                                var26.field301 = var9;
                                var26.field308 = class127.field2200;
                                var26.field302 = var9.field4519;
                                class237.field3992.method1251(var26, -121);
                            }
                            if (class270.field4675 != null || class299.field5120 != null || class153.field2625 || var9.field4462 != 1400 && class120.field2025) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4462 != 0) {
                                if (var9.field4462 == 1337) {
                                    class176.field2960 = var9;
                                    class291.method2027(var9, 14580);
                                    continue;
                                }
                                if (var9.field4462 == 1338) {
                                    if (var21) {
                                        class232.method1697(3, class39.field595 - var10, var9, class271.field4685 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field4462 == 1400) {
                                    class175.field2935 = var9;
                                    if (var21) {
                                        if (class163.field2767[82] && class250.field4201 > 0) {
                                            int var27 = (int) ((double) (class39.field595 - var10 - var9.field4531 / 2) * 2.0D / (double) class205.field3468);
                                            int var28 = (int) ((double) (class271.field4685 - var11 - var9.field4517 / 2) * 2.0D / (double) class205.field3468);
                                            int var29 = class76.field1320 + var27;
                                            int var30 = class215.field3666 + var28;
                                            int var31 = class82.field1374 + var29;
                                            int var32 = class215.field3668 + class130.field2252 - var30 - 1;
                                            class178.method1315(0, var32, var31, 1);
                                            class274.method1955(83);
                                            continue;
                                        }
                                        class120.field2025 = true;
                                        class25.field328 = class66.field1135;
                                        class87.field1438 = class26.field351;
                                        class91.field1503 = class76.field1320;
                                        class11.field139 = class215.field3666;
                                        continue;
                                    }
                                    if (var20 && class120.field2025) {
                                        class153.method1170(-107, (int) ((double) (class25.field328 - class66.field1135) * 2.0D / (double) class7.field102) + class91.field1503);
                                        class111.method866((byte) 93, (int) ((double) (class87.field1438 - class26.field351) * 2.0D / (double) class7.field102) + class11.field139);
                                        continue;
                                    }
                                    class120.field2025 = false;
                                    continue;
                                }
                                if (var9.field4462 == 1401) {
                                    if (var20) {
                                        class40.method277(var9.field4517, class66.field1135 - var10, class26.field351 - var11, var9.field4531, 1723);
                                    }
                                    continue;
                                }
                                if (var9.field4462 == 1402 || var9.field4462 == 1404) {
                                    continue;
                                }
                            }
                            if (!var9.field4405 && var21) {
                                var9.field4405 = true;
                                if (var9.field4450 != null) {
                                    class24 var33 = new class24();
                                    var33.field303 = true;
                                    var33.field301 = var9;
                                    var33.field309 = class39.field595 - var10;
                                    var33.field308 = class271.field4685 - var11;
                                    var33.field302 = var9.field4450;
                                    class237.field3992.method1251(var33, -126);
                                }
                            }
                            if (var9.field4405 && var20 && var9.field4460 != null) {
                                class24 var34 = new class24();
                                var34.field303 = true;
                                var34.field301 = var9;
                                var34.field309 = class66.field1135 - var10;
                                var34.field308 = class26.field351 - var11;
                                var34.field302 = var9.field4460;
                                class237.field3992.method1251(var34, -127);
                            }
                            if (var9.field4405 && !var20) {
                                var9.field4405 = false;
                                if (var9.field4512 != null) {
                                    class24 var35 = new class24();
                                    var35.field303 = true;
                                    var35.field301 = var9;
                                    var35.field309 = class66.field1135 - var10;
                                    var35.field308 = class26.field351 - var11;
                                    var35.field302 = var9.field4512;
                                    class60.field1006.method1251(var35, -119);
                                }
                            }
                            if (var20 && var9.field4478 != null) {
                                class24 var36 = new class24();
                                var36.field303 = true;
                                var36.field301 = var9;
                                var36.field309 = class66.field1135 - var10;
                                var36.field308 = class26.field351 - var11;
                                var36.field302 = var9.field4478;
                                class237.field3992.method1251(var36, -124);
                            }
                            if (!var9.field4541 && var19) {
                                var9.field4541 = true;
                                if (var9.field4494 != null) {
                                    class24 var37 = new class24();
                                    var37.field303 = true;
                                    var37.field301 = var9;
                                    var37.field309 = class66.field1135 - var10;
                                    var37.field308 = class26.field351 - var11;
                                    var37.field302 = var9.field4494;
                                    class237.field3992.method1251(var37, -126);
                                }
                            }
                            if (var9.field4541 && var19 && var9.field4407 != null) {
                                class24 var38 = new class24();
                                var38.field303 = true;
                                var38.field301 = var9;
                                var38.field309 = class66.field1135 - var10;
                                var38.field308 = class26.field351 - var11;
                                var38.field302 = var9.field4407;
                                class237.field3992.method1251(var38, -128);
                            }
                            if (var9.field4541 && !var19) {
                                var9.field4541 = false;
                                if (var9.field4534 != null) {
                                    class24 var39 = new class24();
                                    var39.field303 = true;
                                    var39.field301 = var9;
                                    var39.field309 = class66.field1135 - var10;
                                    var39.field308 = class26.field351 - var11;
                                    var39.field302 = var9.field4534;
                                    class60.field1006.method1251(var39, -121);
                                }
                            }
                            if (var9.field4507 != null) {
                                class24 var40 = new class24();
                                var40.field301 = var9;
                                var40.field302 = var9.field4507;
                                class172.field2902.method1251(var40, -127);
                            }
                            if (var9.field4401 != null && class17.field233 > var9.field4433) {
                                if (var9.field4515 == null || class17.field233 - var9.field4433 > 32) {
                                    class24 var45 = new class24();
                                    var45.field301 = var9;
                                    var45.field302 = var9.field4401;
                                    class237.field3992.method1251(var45, -121);
                                } else {
                                    label550: for (int var41 = var9.field4433; var41 < class17.field233; var41++) {
                                        int var42 = class59.field993[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field4515.length; var43++) {
                                            if (var9.field4515[var43] == var42) {
                                                class24 var44 = new class24();
                                                var44.field301 = var9;
                                                var44.field302 = var9.field4401;
                                                class237.field3992.method1251(var44, -125);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field4433 = class17.field233;
                            }
                            if (var9.field4483 != null && class78.field1339 > var9.field4468) {
                                if (var9.field4415 == null || class78.field1339 - var9.field4468 > 32) {
                                    class24 var50 = new class24();
                                    var50.field301 = var9;
                                    var50.field302 = var9.field4483;
                                    class237.field3992.method1251(var50, -117);
                                } else {
                                    label526: for (int var46 = var9.field4468; var46 < class78.field1339; var46++) {
                                        int var47 = class152.field2610[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field4415.length; var48++) {
                                            if (var9.field4415[var48] == var47) {
                                                class24 var49 = new class24();
                                                var49.field301 = var9;
                                                var49.field302 = var9.field4483;
                                                class237.field3992.method1251(var49, -128);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field4468 = class78.field1339;
                            }
                            if (var9.field4437 != null && class11.field144 > var9.field4487) {
                                if (var9.field4538 == null || class11.field144 - var9.field4487 > 32) {
                                    class24 var55 = new class24();
                                    var55.field301 = var9;
                                    var55.field302 = var9.field4437;
                                    class237.field3992.method1251(var55, -116);
                                } else {
                                    label502: for (int var51 = var9.field4487; var51 < class11.field144; var51++) {
                                        int var52 = class133.field2287[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field4538.length; var53++) {
                                            if (var9.field4538[var53] == var52) {
                                                class24 var54 = new class24();
                                                var54.field301 = var9;
                                                var54.field302 = var9.field4437;
                                                class237.field3992.method1251(var54, -116);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field4487 = class11.field144;
                            }
                            if (var9.field4526 != null && class237.field3989 > var9.field4481) {
                                if (var9.field4427 == null || class237.field3989 - var9.field4481 > 32) {
                                    class24 var60 = new class24();
                                    var60.field301 = var9;
                                    var60.field302 = var9.field4526;
                                    class237.field3992.method1251(var60, -124);
                                } else {
                                    label478: for (int var56 = var9.field4481; var56 < class237.field3989; var56++) {
                                        int var57 = class64.field1109[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field4427.length; var58++) {
                                            if (var9.field4427[var58] == var57) {
                                                class24 var59 = new class24();
                                                var59.field301 = var9;
                                                var59.field302 = var9.field4526;
                                                class237.field3992.method1251(var59, -117);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field4481 = class237.field3989;
                            }
                            if (var9.field4482 != null && class185.field3079 > var9.field4459) {
                                if (var9.field4423 == null || class185.field3079 - var9.field4459 > 32) {
                                    class24 var65 = new class24();
                                    var65.field301 = var9;
                                    var65.field302 = var9.field4482;
                                    class237.field3992.method1251(var65, -118);
                                } else {
                                    label454: for (int var61 = var9.field4459; var61 < class185.field3079; var61++) {
                                        int var62 = class158.field2717[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field4423.length; var63++) {
                                            if (var9.field4423[var63] == var62) {
                                                class24 var64 = new class24();
                                                var64.field301 = var9;
                                                var64.field302 = var9.field4482;
                                                class237.field3992.method1251(var64, -124);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field4459 = class185.field3079;
                            }
                            if (class241.field4069 > var9.field4530 && var9.field4435 != null) {
                                class24 var66 = new class24();
                                var66.field301 = var9;
                                var66.field302 = var9.field4435;
                                class237.field3992.method1251(var66, -128);
                            }
                            if (class166.field2793 > var9.field4530 && var9.field4484 != null) {
                                class24 var67 = new class24();
                                var67.field301 = var9;
                                var67.field302 = var9.field4484;
                                class237.field3992.method1251(var67, -127);
                            }
                            if (class127.field2198 > var9.field4530 && var9.field4472 != null) {
                                class24 var68 = new class24();
                                var68.field301 = var9;
                                var68.field302 = var9.field4472;
                                class237.field3992.method1251(var68, -124);
                            }
                            if (class299.field5118 > var9.field4530 && var9.field4525 != null) {
                                class24 var69 = new class24();
                                var69.field301 = var9;
                                var69.field302 = var9.field4525;
                                class237.field3992.method1251(var69, -126);
                            }
                            if (class66.field1155 > var9.field4530 && var9.field4378 != null) {
                                class24 var70 = new class24();
                                var70.field301 = var9;
                                var70.field302 = var9.field4378;
                                class237.field3992.method1251(var70, -120);
                            }
                            var9.field4530 = class187.field3128;
                            if (var9.field4399 != null) {
                                for (int var71 = 0; var71 < class66.field1154; var71++) {
                                    class24 var72 = new class24();
                                    var72.field301 = var9;
                                    var72.field313 = class230.field3911[var71];
                                    var72.field310 = class104.field1776[var71];
                                    var72.field302 = var9.field4399;
                                    class237.field3992.method1251(var72, -127);
                                }
                            }
                            if (class120.field2021 && var9.field4442 != null) {
                                class24 var73 = new class24();
                                var73.field301 = var9;
                                var73.field302 = var9.field4442;
                                class237.field3992.method1251(var73, -126);
                            }
                        }
                    }
                    if (!var9.field4540 && class270.field4675 == null && class299.field5120 == null && !class153.field2625) {
                        if ((var9.field4383 >= 0 || var9.field4420 != 0) && class66.field1135 >= var12 && class26.field351 >= var13 && class66.field1135 < var14 && class26.field351 < var15) {
                            if (var9.field4383 >= 0) {
                                class61.field1065 = arg0[var9.field4383];
                            } else {
                                class61.field1065 = var9;
                            }
                        }
                        if (var9.field4441 == 8 && class66.field1135 >= var12 && class26.field351 >= var13 && class66.field1135 < var14 && class26.field351 < var15) {
                            class168.field2835 = var9;
                        }
                        if (var9.field4384 > var9.field4517) {
                            class7.method37(16, var9.field4531 + var10, class66.field1135, var9, var9.field4384, var9.field4517, class26.field351, var11);
                        }
                    }
                    if (var9.field4441 == 0) {
                        method1728(arg0, var9.field4418, var12, var13, var14, var15, var10 - var9.field4430, var11 - var9.field4501);
                        if (var9.field4532 != null) {
                            method1728(var9.field4532, var9.field4418, var12, var13, var14, var15, var10 - var9.field4430, var11 - var9.field4501);
                        }
                        class93 var74 = (class93) class73.field1224.method1007((long) var9.field4418, -17004);
                        if (var74 != null) {
                            class283.method2006(var12, var74.field1518, var13, var14, var11, var15, var10, (byte) -92);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 902)
    private final void method1729(int arg0) {
        field4019++;
        class155.method1179(this, -98);
        for (class66.field1154 = 0; class50.method370((byte) -23) && class66.field1154 < 128; class66.field1154++) {
            class230.field3911[class66.field1154] = class152.field2617;
            class104.field1776[class66.field1154] = class78.field1340;
        }
        class250.field4208++;
        if (class81.field1361 != -1) {
            class283.method2006(0, class81.field1361, 0, class188.field3141, 0, class244.field4111, 0, (byte) 106);
        }
        class187.field3128++;
        if (arg0 < 40) {
            this.method1736(51);
        }
        int var2 = 19137023;
        label183: for (int var3 = 0; var3 < 32768; var3++) {
            class295 var4 = class35.field521[var3];
            if (var4 != null) {
                byte var5 = var4.field5070.field3853;
                if ((var5 & 0x2) > 0 && var4.field3246 == 0 && Math.random() * 1000.0D < 10.0D) {
                    int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                    if (var6 != 0 || var7 != 0) {
                        var4.field3236[0] = (var4.field3259 >> 7) + var6;
                        var4.field3205[0] = (var4.field3218 >> 7) + var7;
                        class286.field4931[class67.field1174].method824(false, -65, var4.field3259 >> 7, var4.field3218 >> 7, 0, var4.method739(0), var4.method739(0));
                        if (var4.field3236[0] >= 0 && var4.field3236[0] <= (104 - var4.method739(0)) && var4.field3205[0] >= 0 && var4.field3205[0] <= (104 - var4.method739(0)) && class286.field4931[class67.field1174].method814(var4.field3259 >> 7, true, var4.field3236[0], var4.field3218 >> 7, var4.field3205[0])) {
                            if (var4.method739(0) > 1) {
                                for (int var8 = var4.field3236[0]; (var4.field3236[0] + var4.method739(0)) > var8; var8++) {
                                    for (int var9 = var4.field3205[0]; var4.field3205[0] + var4.method739(0) > var9; var9++) {
                                        if ((var2 & class286.field4931[class67.field1174].field1766[var8][var9]) != 0) {
                                            continue label183;
                                        }
                                    }
                                }
                            }
                            var4.field3246 = 1;
                        }
                    }
                }
                class180.method1323(6987, var4);
                class238.method1725(2048, var4);
                class63.method547(var4, 99);
                class286.field4931[class67.field1174].method822(2, var4.method739(0), false, var4.field3218 >> 7, var4.field3259 >> 7, var4.method739(0));
            }
        }
        if (class207.field3498 == 0 && class252.field4225 == 0) {
            if (class163.field2777 == 2) {
                class78.method670(-109);
            } else {
                class70.method590(17020);
            }
            if ((class245.field4120 >> 7) < 14 || class245.field4120 >> 7 >= 90 || (class9.field121 >> 7) < 14 || class9.field121 >> 7 >= 90) {
                class34.method227(true);
            }
        }
        while (true) {
            class24 var10;
            class262 var17;
            class262 var18;
            do {
                var10 = (class24) class172.field2902.method1258(50);
                if (var10 == null) {
                    while (true) {
                        class24 var11;
                        class262 var12;
                        class262 var13;
                        do {
                            var11 = (class24) class60.field1006.method1258(50);
                            if (var11 == null) {
                                while (true) {
                                    class24 var14;
                                    class262 var15;
                                    class262 var16;
                                    do {
                                        var14 = (class24) class237.field3992.method1258(50);
                                        if (var14 == null) {
                                            if (class270.field4675 != null) {
                                                class286.method2012((byte) 113);
                                            }
                                            if (class151.field2604 != null && class151.field2604.field1330 == 1) {
                                                if (class151.field2604.field1329 != null) {
                                                    class302.method2078(-117, class298.field5096, class187.field3122);
                                                }
                                                class298.field5096 = null;
                                                class187.field3122 = false;
                                                class151.field2604 = null;
                                            }
                                            return;
                                        }
                                        var15 = var14.field301;
                                        if (var15.field4382 < 0) {
                                            break;
                                        }
                                        var16 = class51.method374(98, var15.field4446);
                                    } while (var16 == null || var16.field4532 == null || var15.field4382 >= var16.field4532.length || var16.field4532[var15.field4382] != var15);
                                    class204.method1515(var14, (byte) 9);
                                }
                            }
                            var12 = var11.field301;
                            if (var12.field4382 < 0) {
                                break;
                            }
                            var13 = class51.method374(122, var12.field4446);
                        } while (var13 == null || var13.field4532 == null || var13.field4532.length <= var12.field4382 || var13.field4532[var12.field4382] != var12);
                        class204.method1515(var11, (byte) 9);
                    }
                }
                var17 = var10.field301;
                if (var17.field4382 < 0) {
                    break;
                }
                var18 = class51.method374(-29, var17.field4446);
            } while (var18 == null || var18.field4532 == null || var17.field4382 >= var18.field4532.length || var18.field4532[var17.field4382] != var17);
            class204.method1515(var10, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 1116)
    private final void method1730(byte arg0) {
        field4013++;
        if (class97.field1601 == 0) {
            Runtime var34 = Runtime.getRuntime();
            int var35 = (int) ((var34.totalMemory() - var34.freeMemory()) / 1024L);
            long var36 = class78.method669(2047);
            if (class94.field1533 == 0L) {
                class94.field1533 = var36;
            }
            if (var35 > 16384 && var36 - class94.field1533 < 5000L) {
                if (var36 - class54.field899 > 1000L) {
                    System.gc();
                    class54.field899 = var36;
                }
                class74.field1234 = class133.field2294;
                class90.field1487 = 5;
            } else {
                class97.field1601 = 10;
                class74.field1234 = class300.field5133;
                class90.field1487 = 5;
            }
        } else if (class97.field1601 == 10) {
            class228.method1667(4, 104, 104, 28);
            class209.method1552(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class286.field4931[var2] = new class104(104, 104);
            }
            class90.field1487 = 10;
            class97.field1601 = 30;
            class74.field1234 = class108.field1824;
        } else if (class97.field1601 == 30) {
            if (class83.field1389 == null) {
                class83.field1389 = new class273(class242.field4072, class238.field4008);
            }
            if (class83.field1389.method1948(67)) {
                class109.field1877 = class196.method1466(true, 69051521, false, true, 0);
                class42.field698 = class196.method1466(true, 69051521, false, true, 1);
                class140.field2427 = class196.method1466(false, 69051521, true, true, 2);
                class168.field2831 = class196.method1466(true, 69051521, false, true, 3);
                class126.field2187 = class196.method1466(true, 69051521, false, true, 4);
                class121.field2039 = class196.method1466(true, 69051521, true, true, 5);
                class302.field5172 = class196.method1466(true, 69051521, true, false, 6);
                class236.field3983 = class196.method1466(true, 69051521, false, true, 7);
                class136.field2333 = class196.method1466(true, 69051521, false, true, 8);
                class311.field5303 = class196.method1466(true, 69051521, false, true, 9);
                class163.field2778 = class196.method1466(true, 69051521, false, true, 10);
                class66.field1150 = class196.method1466(true, 69051521, false, true, 11);
                class294.field5063 = class196.method1466(true, 69051521, false, true, 12);
                class118.field1995 = class196.method1466(true, 69051521, false, true, 13);
                class140.field2424 = class196.method1466(true, 69051521, false, false, 14);
                class136.field2339 = class196.method1466(true, 69051521, false, true, 15);
                class19.field263 = class196.method1466(true, 69051521, false, true, 16);
                class249.field4192 = class196.method1466(true, 69051521, false, true, 17);
                class202.field3412 = class196.method1466(true, 69051521, false, true, 18);
                class66.field1136 = class196.method1466(true, 69051521, false, true, 19);
                class162.field2761 = class196.method1466(true, 69051521, false, true, 20);
                class100.field1660 = class196.method1466(true, 69051521, false, true, 21);
                class78.field1345 = class196.method1466(true, 69051521, false, true, 22);
                class249.field4199 = class196.method1466(true, 69051521, true, true, 23);
                class138.field2363 = class196.method1466(true, 69051521, false, true, 24);
                class211.field3598 = class196.method1466(true, 69051521, false, true, 25);
                class283.field4884 = class196.method1466(true, 69051521, true, true, 26);
                class90.field1487 = 15;
                class97.field1601 = 40;
                class74.field1234 = class305.field5211;
            } else {
                class74.field1234 = class40.field625;
                class90.field1487 = 12;
            }
        } else if (class97.field1601 == 40) {
            int var32 = 0;
            for (int var33 = 0; var33 < 27; var33++) {
                var32 += class175.field2940[var33].method1406(false) * class19.field253[var33] / 100;
            }
            if (var32 == 100) {
                class90.field1487 = 20;
                class74.field1234 = class112.field1911;
                class39.method273(class136.field2333, true);
                class221.method1625(class136.field2333, (byte) 127);
                class2.method11(class136.field2333, -127);
                class98.method753(class136.field2333, 15);
                class97.field1601 = 45;
            } else {
                if (var32 != 0) {
                    class74.field1234 = class66.method562((byte) -46, new class75[] { class285.field4897, class67.method565(35, var32), class226.field3816 });
                }
                class90.field1487 = 20;
            }
        } else if (class97.field1601 == 45) {
            class279.method1989(class151.field2599, 2, 0, 22050);
            class89.field1465 = new class125();
            class89.field1465.method957(6, 128, 9);
            class64.field1112 = class89.method705(27095, class210.field3585, 0, 22050, class237.field3991);
            class64.field1112.method1486(-25077, class89.field1465);
            class190.method1436(class140.field2424, class136.field2339, (byte) 119, class126.field2187, class89.field1465);
            class176.field2965 = class89.method705(27095, class210.field3585, 1, 2048, class237.field3991);
            class94.field1527 = new class248();
            class176.field2965.method1486(-25077, class94.field1527);
            class252.field4232 = new class259(22050, class99.field1644);
            class274.field4726 = class302.field5172.method1915(-15621, class187.field3118);
            class74.field1234 = class106.field1782;
            class90.field1487 = 30;
            class97.field1601 = 50;
        } else if (class97.field1601 == 50) {
            int var30 = class52.method383((byte) 119, class136.field2333, class118.field1995);
            int var31 = class185.method1394(92);
            if (var31 > var30) {
                class74.field1234 = class66.method562((byte) 117, new class75[] { class279.field4830, class67.method565(31, var30 * 100 / var31), class226.field3816 });
                class90.field1487 = 35;
            } else {
                class74.field1234 = class104.field1752;
                class90.field1487 = 35;
                class97.field1601 = 60;
            }
        } else if (class97.field1601 == 60) {
            int var28 = class214.method1577(class136.field2333, 0);
            int var29 = class132.method1026(-8457);
            if (var28 >= var29) {
                class74.field1234 = class251.field4213;
                class90.field1487 = 40;
                class97.field1601 = 65;
            } else {
                class74.field1234 = class66.method562((byte) -106, new class75[] { class95.field1544, class67.method565(81, var28 * 100 / var29), class226.field3816 });
                class90.field1487 = 40;
            }
        } else if (class97.field1601 == 65) {
            for (int var19 = 0; var19 < 6; var19++) {
                class77 var20 = class210.field3585.method948((byte) 102, this.getClass());
                while (var20.field1330 == 0) {
                    class235.method1708(64, 100L);
                }
                if (var20.field1330 == 1) {
                    break;
                }
                if (var19 == 5) {
                    this.method365(false, "dll");
                    class118.field2003 = 1000;
                    return;
                }
                class235.method1708(115, 1000L);
            }
            int var21 = class47.method336(class237.field3991, class274.field4727 * 2);
            if (var21 == 0) {
                class18.method120(104, 104);
                class301.field5152 = false;
                class125.method991(class136.field2333, (byte) -51, class118.field1995);
                class90.field1487 = 45;
                class74.field1234 = class291.field5003;
                class52.method380(54, 5);
                class97.field1601 = 70;
            } else {
                String var22 = class47.field744;
                String var23 = "unknown";
                String var24 = class47.field759;
                String var25 = var24.toLowerCase();
                if (var25.indexOf("microsoft") != -1) {
                    var23 = "vesa";
                } else if (var25.indexOf("nvidia") != -1) {
                    var23 = "nvidia";
                } else if (var25.indexOf("intel") != -1) {
                    var23 = "intel";
                } else if (var25.indexOf("s3") == -1) {
                    if (var25.indexOf("ati") != -1) {
                        var23 = "ati";
                    }
                } else if (var22.toLowerCase().indexOf("unichrome") == -1) {
                    var23 = "s3";
                } else {
                    var23 = "via_s3";
                }
                String var26 = this.method1732(class124.field2071 + " " + class124.field2076 + " " + class124.field2069, -91);
                String var27 = this.method1732(var24 + " " + var22, -91);
                this.method357("os=" + var26 + "&gcard=" + var27 + "&error_code=" + var21, 5000, "caps_" + var23);
                class118.field2003 = 1000;
            }
        } else {
            int var3 = 54 / ((arg0 + 21) / 45);
            if (class97.field1601 == 70) {
                class140.field2427.method1913(false);
                byte var8 = 0;
                int var9 = var8 + class140.field2427.method1921(95);
                class19.field263.method1913(false);
                int var10 = var9 + class19.field263.method1921(-39);
                class249.field4192.method1913(false);
                int var11 = var10 + class249.field4192.method1921(97);
                class202.field3412.method1913(false);
                int var12 = var11 + class202.field3412.method1921(63);
                class66.field1136.method1913(false);
                int var13 = var12 + class66.field1136.method1921(-42);
                class162.field2761.method1913(false);
                int var14 = var13 + class162.field2761.method1921(-125);
                class100.field1660.method1913(false);
                int var15 = var14 + class100.field1660.method1921(-46);
                class78.field1345.method1913(false);
                int var16 = var15 + class78.field1345.method1921(-61);
                class138.field2363.method1913(false);
                int var17 = var16 + class138.field2363.method1921(-61);
                class211.field3598.method1913(false);
                int var18 = var17 + class211.field3598.method1921(-63);
                if (var18 >= 1000) {
                    class185.method1398(17472, class140.field2427);
                    class34.method222(class140.field2427, (byte) 85);
                    class259.method1853(class140.field2427, -15);
                    class51.method377(class236.field3983, class140.field2427, 112);
                    class250.method1802(class19.field263, class236.field3983, (byte) -65, class120.field2016);
                    class241.method1757(class202.field3412, class236.field3983, 118);
                    class61.method542(class66.field1136, class51.field842, -2070355540, class120.field2016, class236.field3983);
                    class53.method390(class140.field2427, -9814);
                    class251.method1810(false, class42.field698, class162.field2761, class109.field1877);
                    class249.method1795((byte) -61, class236.field3983, class100.field1660);
                    class93.method724(false, class78.field1345);
                    class274.method1957(-1, class140.field2427);
                    class251.method1807(class168.field2831, class136.field2333, class236.field3983, class118.field1995, -6);
                    class72.method597(class140.field2427, true);
                    class270.method1933((byte) -101, class249.field4192);
                    class10.method49(new class69(), 841, class138.field2363, class211.field3598);
                    class30.method204(class211.field3598, true, class138.field2363);
                    class90.field1487 = 50;
                    class74.field1234 = class173.field2920;
                    class93.method725(106);
                    class97.field1601 = 80;
                } else {
                    class74.field1234 = class66.method562((byte) 119, new class75[] { class279.field4835, class67.method565(76, var18 / 10), class226.field3816 });
                    class90.field1487 = 50;
                }
            } else if (class97.field1601 == 80) {
                int var4 = class31.method210(class136.field2333, 113);
                int var5 = class66.method561(-366);
                if (var4 < var5) {
                    class74.field1234 = class66.method562((byte) 124, new class75[] { class19.field262, class67.method565(50, var4 * 100 / var5), class226.field3816 });
                    class90.field1487 = 60;
                } else {
                    class12.method61(class136.field2333, false);
                    class97.field1601 = 90;
                    class74.field1234 = class279.field4837;
                    class90.field1487 = 60;
                }
            } else if (class97.field1601 == 90) {
                if (class283.field4884.method1913(false)) {
                    class139 var7 = new class139(class311.field5303, class283.field4884, class136.field2333, 200, !class273.field4709);
                    class21.method132(var7);
                    if (class116.field1970) {
                        class21.method149(0.7F);
                    } else {
                        if (class253.field4256 == 1) {
                            class21.method149(0.9F);
                        }
                        if (class253.field4256 == 2) {
                            class21.method149(0.8F);
                        }
                        if (class253.field4256 == 3) {
                            class21.method149(0.7F);
                        }
                        if (class253.field4256 == 4) {
                            class21.method149(0.6F);
                        }
                    }
                    class97.field1601 = 100;
                    class74.field1234 = class117.field1988;
                    class90.field1487 = 70;
                } else {
                    class74.field1234 = class66.method562((byte) -86, new class75[] { class310.field5289, class67.method565(115, class283.field4884.method1921(117)), class226.field3816 });
                    class90.field1487 = 70;
                }
            } else if (class97.field1601 == 100) {
                class97.field1601 = 110;
            } else if (class97.field1601 == 110) {
                class287.field4939 = new class288();
                class210.field3585.method947(0, class287.field4939, 10);
                class90.field1487 = 75;
                class97.field1601 = 120;
                class74.field1234 = class299.field5126;
            } else if (class97.field1601 == 120) {
                if (class163.field2778.method1916(class121.field2037, class29.field412, (byte) 119)) {
                    class185 var6 = new class185(class163.field2778.method1906(-1, class29.field412, class121.field2037));
                    class229.method1679(var6, (byte) -10);
                    class74.field1234 = class95.field1538;
                    class97.field1601 = 130;
                    class90.field1487 = 80;
                } else {
                    class74.field1234 = class66.method562((byte) -119, new class75[] { class63.field1102, class90.field1485 });
                    class90.field1487 = 80;
                }
            } else if (class97.field1601 == 130) {
                if (!class168.field2831.method1913(false)) {
                    class74.field1234 = class66.method562((byte) -62, new class75[] { class204.field3452, class67.method565(109, class168.field2831.method1921(97) * 3 / 4), class226.field3816 });
                    class90.field1487 = 85;
                } else if (!class294.field5063.method1913(false)) {
                    class74.field1234 = class66.method562((byte) -81, new class75[] { class204.field3452, class67.method565(120, class294.field5063.method1921(-81) / 10 + 75), class226.field3816 });
                    class90.field1487 = 85;
                } else if (!class118.field1995.method1913(false)) {
                    class74.field1234 = class66.method562((byte) -54, new class75[] { class204.field3452, class67.method565(105, class118.field1995.method1921(-71) / 20 + 85), class226.field3816 });
                    class90.field1487 = 85;
                } else if (class249.field4199.method1896(class149.field2570, -4570)) {
                    class140.method1091(class116.field1957, class272.field4698, (byte) 118, class37.field544, class205.field3476, class301.field5144, class249.field4199);
                    class74.field1234 = class31.field449;
                    class90.field1487 = 100;
                    class97.field1601 = 140;
                } else {
                    class74.field1234 = class66.method562((byte) 120, new class75[] { class204.field3452, class67.method565(72, class249.field4199.method1904(class149.field2570, 4979) / 10 + 90), class226.field3816 });
                    class90.field1487 = 85;
                }
            } else if (class97.field1601 == 140) {
                class161.field2725 = class168.field2831.method1915(-15621, class230.field3913);
                class121.field2039.method1902(false, true, 0);
                class302.field5172.method1902(true, true, 0);
                class136.field2333.method1902(true, true, 0);
                class118.field1995.method1902(true, true, 0);
                class163.field2778.method1902(true, true, 0);
                class168.field2831.method1902(true, true, 0);
                class86.field1414 = true;
                class199.method1489(-1914002714);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 1638)
    public static void method1731(byte arg0) {
        if (arg0 != -41) {
            field4016 = -14;
        }
        field4022 = null;
        field4023 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 1653)
    private final String method1732(String arg0, int arg1) {
        field4026++;
        StringBuffer var3 = new StringBuffer();
        for (int var4 = 0; arg0.length() > var4; var4++) {
            char var5 = arg0.charAt(var4);
            if ((var5 < '0' || var5 > '9') && (var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z')) {
                var3.append('%');
                int var6 = var5 >> 4 & 0xF;
                if (var6 >= 0 && var6 <= 9) {
                    var3.append((char) (var6 + 48));
                } else if (var6 >= 10 && var6 <= 15) {
                    var3.append((char) (-(-var6 - 65) - 10));
                }
                int var7 = var5 & 0xF;
                if (var7 >= 0 && var7 <= 9) {
                    var3.append((char) (var7 + 48));
                } else if (var7 >= 10 && var7 <= 15) {
                    var3.append((char) (var7 + 55));
                }
            } else {
                var3.append(var5);
            }
        }
        if (arg1 == -91) {
            return var3.toString();
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1702)
    public final void method360(byte arg0) {
        if (arg0 != 8) {
            method1734((class262) null);
        }
        field4027++;
        if (class118.field2003 == 1000) {
            return;
        }
        class143.field2463++;
        if ((class143.field2463 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class149.field2566 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class26.field342.setSeed((long) class149.field2566);
        }
        this.method1727((byte) 96);
        if (class83.field1389 != null) {
            class83.field1389.method1947((byte) 52);
        }
        class123.method930(0);
        class54.method393((byte) 43);
        class143.method1107(76);
        class85.method688(arg0 - 8);
        class119.method906();
        if (class205.field3473 != null) {
            int var3 = class205.field3473.method861(90);
            class127.field2200 = var3;
        }
        if (class118.field2003 == 0) {
            this.method1730((byte) 88);
            class259.method1850(14);
        } else if (class118.field2003 == 5) {
            this.method1730((byte) 56);
            class259.method1850(14);
        } else if (class118.field2003 == 25 || class118.field2003 == 28) {
            class226.method1661((byte) 50);
        }
        if (class118.field2003 == 10) {
            this.method1729(96);
            class232.method1693((byte) 17);
            class304.method2091(0);
        } else if (class118.field2003 == 30) {
            class151.method1156((byte) -29);
        } else if (class118.field2003 == 40) {
            class304.method2091(0);
            if (class69.field1183 != -3) {
                if (class69.field1183 == 15) {
                    class253.method1817(-82);
                } else if (class69.field1183 != 2) {
                    class199.method1489(-1914002714);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1809)
    public final void method362(int arg0) {
        field4014++;
        class47.method346();
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class299.field5117 != null) {
            class39.method264(class210.field3585, class299.field5117, (byte) 16);
            class299.field5117 = null;
        }
        if (class210.field3585 != null) {
            class210.field3585.method942(4, this.getClass());
        }
        if (class287.field4939 != null) {
            class287.field4939.field4949 = false;
        }
        class287.field4939 = null;
        if (arg0 <= 11) {
            return;
        }
        if (class35.field513 != null) {
            class35.field513.method2048((byte) -55);
            class35.field513 = null;
        }
        class72.method598((byte) -59, class237.field3991);
        class157.method1191(class237.field3991, (byte) 117);
        if (class205.field3473 != null) {
            class205.field3473.method862(class237.field3991, -1706);
        }
        class28.method181(-37);
        class196.method1465(3);
        class205.field3473 = null;
        if (class64.field1112 != null) {
            class64.field1112.method1476(false);
        }
        if (class176.field2965 != null) {
            class176.field2965.method1476(false);
        }
        class242.field4072.method26((byte) -114);
        class238.field4008.method765(-1);
        try {
            if (class245.field4119 != null) {
                class245.field4119.method268(12516);
            }
            if (class10.field126 != null) {
                for (int var2 = 0; var2 < class10.field126.length; var2++) {
                    if (class10.field126[var2] != null) {
                        class10.field126[var2].method268(12516);
                    }
                }
            }
            if (class134.field2313 != null) {
                class134.field2313.method268(12516);
            }
            if (class34.field493 != null) {
                class34.field493.method268(12516);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1899)
    public final void init() {
        field4030++;
        if (!this.method368(1)) {
            return;
        }
        class246.field4160 = Integer.parseInt(this.getParameter("worldid"));
        class48.field780 = Integer.parseInt(this.getParameter("modewhat"));
        class265.field4574 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class283.field4890 = true;
        } else {
            class283.field4890 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class120.field2016 = true;
        } else {
            class120.field2016 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null) {
            try {
                class151.field2592 = Integer.parseInt(var3);
            } catch (Exception var14) {
            }
        }
        class252.method1811((byte) -121, class151.field2592);
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class230.field3907 = 1;
        } else {
            class230.field3907 = 0;
        }
        try {
            class13.field168 = Integer.parseInt(this.getParameter("js"));
            class177.field2975 = Integer.parseInt(this.getParameter("plug"));
            class98.field1612 = Integer.parseInt(this.getParameter("affid"));
            class87.field1441 = Integer.parseInt(this.getParameter("haveie6")) == 1;
        } catch (Exception var13) {
        }
        class310.field5287 = class116.field1964.method644((byte) -25, this);
        if (class310.field5287 == null) {
            class310.field5287 = class121.field2037;
        }
        String var7 = this.getParameter("advert");
        if (var7 != null) {
            byte[] var8;
            try {
                var8 = var7.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var12) {
                var8 = var7.getBytes();
            }
            class75 var10 = class191.method1442(var8.length, (byte) 84, 0, var8);
            boolean var11 = class28.method182(-10353, var10);
            if (var11) {
                class263.field4559 = var10;
            }
        }
        class311.field5305 = this.getCodeBase().getHost();
        this.method363(765, 106, 512, class48.field780 + 32, 503);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Z", line = 1988)
    public static final boolean method1733(int arg0) throws IOException {
        field4012++;
        if (class35.field513 == null) {
            return false;
        }
        int var1 = class35.field513.method2042(-64);
        if (var1 == 0) {
            return false;
        }
        if (field4016 == -1) {
            var1--;
            class35.field513.method2047(class136.field2328.field997, 0, 1, -3532);
            class136.field2328.field1012 = 0;
            field4016 = class136.field2328.method94(-122);
            class299.field5105 = class28.field399[field4016];
        }
        if (class299.field5105 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class35.field513.method2047(class136.field2328.field997, 0, 1, -3532);
            class299.field5105 = class136.field2328.field997[0] & 0xFF;
        }
        if (class299.field5105 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class35.field513.method2047(class136.field2328.field997, 0, 2, arg0 ^ 0xDC3);
            class136.field2328.field1012 = 0;
            class299.field5105 = class136.field2328.method485((byte) -2);
        }
        if (var1 < class299.field5105) {
            return false;
        }
        class136.field2328.field1012 = 0;
        class35.field513.method2047(class136.field2328.field997, 0, class299.field5105, -3532);
        class143.field2471 = class61.field1070;
        class61.field1070 = class55.field905;
        class111.field1895 = 0;
        class55.field905 = field4016;
        if (field4016 == 17) {
            if (class81.field1361 != -1) {
                class176.method1296(28, 0, class81.field1361);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 98) {
            class189.method1425((byte) 24, class136.field2328.method532(-1));
            field4016 = -1;
            return true;
        } else if (field4016 == 30) {
            int var349 = class136.field2328.method485((byte) -2);
            int var350 = class136.field2328.method505(255);
            if (class140.method1086(var349, arg0 - 117)) {
                class93 var351 = (class93) class73.field1224.method1007((long) var350, -17004);
                if (var351 != null) {
                    class97.method746(arg0 + 32687, true, var351);
                }
                if (class286.field4929 != null) {
                    class291.method2027(class286.field4929, 14580);
                    class286.field4929 = null;
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 164) {
            class205.field3472 = class299.field5105 / 8;
            for (int var2 = 0; var2 < class205.field3472; var2++) {
                class66.field1152[var2] = class136.field2328.method499((byte) -54);
                class244.field4114[var2] = class260.method1855(class66.field1152[var2], false);
            }
            class166.field2793 = class187.field3128;
            field4016 = -1;
            return true;
        } else if (field4016 == 156) {
            int var3 = class136.field2328.method474((byte) 104);
            int var4 = class136.field2328.method491(8);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class136.field2328.method483((byte) 47);
            if (class140.method1086(var3, -5)) {
                class189.method1432(2, var4, var5, arg0 ^ 0xFFFFFFF3);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 109) {
            int var344 = class136.field2328.method501(arg0 + 9);
            int var345 = class136.field2328.method501(0);
            int var346 = class136.field2328.method485((byte) -2);
            int var347 = class136.field2328.method501(0);
            int var348 = class136.field2328.method501(0);
            class100.method766((byte) 119, var348, var344, var345, var347, var346, true);
            field4016 = -1;
            return true;
        } else if (field4016 == 226) {
            int var6 = class136.field2328.method474((byte) 104);
            class261.method1862(var6, (byte) -52);
            class64.field1109[class235.method1710(class237.field3989++, 31)] = class235.method1710(var6, 32767);
            field4016 = -1;
            return true;
        } else if (field4016 == 115) {
            int var7 = class136.field2328.method507(-125);
            int var8 = class136.field2328.method481((byte) 113);
            int var9 = class136.field2328.method474((byte) 104);
            if (class140.method1086(var9, 6)) {
                class176.method1297(var7, var8, arg0 + 35);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 180) {
            int var10 = class136.field2328.method501(0);
            if (class136.field2328.method501(0) == 0) {
                class194.field3273[var10] = new class191();
            } else {
                class136.field2328.field1012--;
                class194.field3273[var10] = new class191(class136.field2328);
            }
            class299.field5118 = class187.field3128;
            field4016 = -1;
            return true;
        } else if (field4016 == 229) {
            int var341 = class136.field2328.method505(255);
            int var342 = class136.field2328.method481((byte) 126);
            int var343 = class136.field2328.method497((byte) 51);
            if (class140.method1086(var342, arg0 ^ 0xFFFFFF83)) {
                class190.method1434(-18571, var341, var343);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 15) {
            long var327 = class136.field2328.method499((byte) -54);
            long var329 = (long) class136.field2328.method485((byte) -2);
            long var331 = (long) class136.field2328.method489(arg0 - 101);
            int var333 = class136.field2328.method501(0);
            int var334 = class136.field2328.method485((byte) -2);
            boolean var335 = false;
            long var336 = (var329 << 32) + var331;
            int var338 = 0;
            label1573: while (true) {
                if (var338 < 100) {
                    if (class255.field4274[var338] != var336) {
                        var338++;
                        continue;
                    }
                    var335 = true;
                    break;
                }
                if (var333 <= 1) {
                    for (int var339 = 0; var339 < class205.field3472; var339++) {
                        if (class66.field1152[var339] == var327) {
                            var335 = true;
                            break label1573;
                        }
                    }
                }
                break;
            }
            if (!var335 && class211.field3603 == 0) {
                class255.field4274[class194.field3223] = var336;
                class194.field3223 = (class194.field3223 + 1) % 100;
                class75 var340 = class303.method2087(1, var334).method1283(class136.field2328, (byte) -84);
                if (var333 == 2) {
                    class63.method545((class75) null, 18, var340, arg0 ^ 0xFFFFFFF6, var334, class66.method562((byte) -83, new class75[] { class134.field2312, class260.method1855(var327, false).method613(122) }));
                } else if (var333 == 1) {
                    class63.method545((class75) null, 18, var340, arg0 + 10, var334, class66.method562((byte) 126, new class75[] { class211.field3602, class260.method1855(var327, false).method613(122) }));
                } else {
                    class63.method545((class75) null, 18, var340, 1, var334, class260.method1855(var327, false).method613(122));
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 216) {
            class238.field4001 = class136.field2328.method507(-116);
            class296.field5077 = class136.field2328.method488(0);
            while (class136.field2328.field1012 < class299.field5105) {
                field4016 = class136.field2328.method501(0);
                class113.method878(3);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 76) {
            long var308 = class136.field2328.method499((byte) -54);
            int var310 = class136.field2328.method485((byte) -2);
            int var311 = class136.field2328.method501(arg0 + 9);
            class75 var312 = class121.field2037;
            if (var310 > 0) {
                var312 = class136.field2328.method532(-1);
            }
            boolean var313 = true;
            if (var308 < 0L) {
                var313 = false;
                var308 &= Long.MAX_VALUE;
            }
            class75 var314 = class260.method1855(var308, false).method613(122);
            for (int var315 = 0; var315 < class40.field628; var315++) {
                if (class120.field2026[var315] == var308) {
                    if (class173.field2930[var315] != var310) {
                        class173.field2930[var315] = var310;
                        if (var310 > 0) {
                            class162.method1216((byte) 38, 5, class66.method562((byte) -104, new class75[] { var314, class202.field3429 }), class121.field2037);
                        }
                        if (var310 == 0) {
                            class162.method1216((byte) 38, 5, class66.method562((byte) -127, new class75[] { var314, class11.field152 }), class121.field2037);
                        }
                    }
                    var314 = null;
                    class120.field2020[var315] = var312;
                    class112.field1910[var315] = var311;
                    class111.field1898[var315] = var313;
                    break;
                }
            }
            boolean var316 = false;
            if (var314 != null && class40.field628 < 200) {
                class120.field2026[class40.field628] = var308;
                class106.field1779[class40.field628] = var314;
                class173.field2930[class40.field628] = var310;
                class120.field2020[class40.field628] = var312;
                class112.field1910[class40.field628] = var311;
                class111.field1898[class40.field628] = var313;
                class40.field628++;
            }
            class166.field2793 = class187.field3128;
            int var317 = class40.field628;
            while (var317 > 0) {
                boolean var318 = true;
                var317--;
                for (int var319 = 0; var319 < var317; var319++) {
                    if (class173.field2930[var319] != class246.field4160 && class173.field2930[var319 + 1] == class246.field4160 || class173.field2930[var319] == 0 && class173.field2930[var319 + 1] != 0) {
                        int var320 = class173.field2930[var319];
                        class173.field2930[var319] = class173.field2930[var319 + 1];
                        var318 = false;
                        class173.field2930[var319 + 1] = var320;
                        class75 var321 = class120.field2020[var319];
                        class120.field2020[var319] = class120.field2020[var319 + 1];
                        class120.field2020[var319 + 1] = var321;
                        class75 var322 = class106.field1779[var319];
                        class106.field1779[var319] = class106.field1779[var319 + 1];
                        class106.field1779[var319 + 1] = var322;
                        long var323 = class120.field2026[var319];
                        class120.field2026[var319] = class120.field2026[var319 + 1];
                        class120.field2026[var319 + 1] = var323;
                        int var325 = class112.field1910[var319];
                        class112.field1910[var319] = class112.field1910[var319 + 1];
                        class112.field1910[var319 + 1] = var325;
                        boolean var326 = class111.field1898[var319];
                        class111.field1898[var319] = class111.field1898[var319 + 1];
                        class111.field1898[var319 + 1] = var326;
                    }
                }
                if (var318) {
                    break;
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 78) {
            int var297 = class136.field2328.method481((byte) -122);
            int var298 = class136.field2328.method476(arg0 ^ 0x23);
            int var299 = (var298 & 0xFFFFE22) >> 14;
            if (var297 == 65535) {
                var297 = -1;
            }
            int var300 = var298 >> 28 & 0x3;
            int var301 = var298 & 0x3FFF;
            int var302 = class136.field2328.method507(-120);
            int var303 = var302 & 0x3;
            int var304 = var301 - class175.field2939;
            int var305 = var299 - class275.field4737;
            int var306 = var302 >> 2;
            int var307 = class143.field2464[var306];
            class291.method2032(var297, var306, var307, var303, var304, var300, var305, 111);
            field4016 = -1;
            return true;
        } else if (field4016 == 85) {
            class276.method1962((byte) -107);
            class187.method1416(2);
            field4016 = -1;
            class11.field144 += 32;
            return true;
        } else if (field4016 == 100) {
            class75 var11 = class136.field2328.method532(arg0 ^ 0x8);
            if (var11.method632(class139.field2393, arg0 ^ 0x708B)) {
                class75 var47 = var11.method661(83, 0, var11.method657((byte) -20, class295.field5073));
                long var48 = var47.method630(arg0 ^ 0x34);
                boolean var50 = false;
                for (int var51 = 0; var51 < class205.field3472; var51++) {
                    if (class66.field1152[var51] == var48) {
                        var50 = true;
                        break;
                    }
                }
                if (!var50 && class211.field3603 == 0) {
                    class162.method1216((byte) 38, 4, class161.field2741, var47);
                }
            } else if (var11.method632(class154.field2645, -28804)) {
                class75 var41 = var11.method661(115, 0, var11.method657((byte) -97, class295.field5073));
                long var42 = var41.method630(-61);
                boolean var44 = false;
                for (int var45 = 0; var45 < class205.field3472; var45++) {
                    if (class66.field1152[var45] == var42) {
                        var44 = true;
                        break;
                    }
                }
                if (!var44 && class211.field3603 == 0) {
                    class75 var46 = var11.method661(88, var11.method657((byte) -81, class295.field5073) + 1, var11.method640(1) + -9);
                    class162.method1216((byte) 38, 8, var46, var41);
                }
            } else if (var11.method632(class130.field2254, -28804)) {
                class75 var12 = var11.method661(90, 0, var11.method657((byte) -22, class295.field5073));
                boolean var13 = false;
                long var14 = var12.method630(arg0 ^ 0x4C);
                for (int var16 = 0; var16 < class205.field3472; var16++) {
                    if (class66.field1152[var16] == var14) {
                        var13 = true;
                        break;
                    }
                }
                if (!var13 && class211.field3603 == 0) {
                    class162.method1216((byte) 38, 10, class121.field2037, var12);
                }
            } else if (var11.method632(class91.field1499, -28804)) {
                class75 var40 = var11.method661(arg0 ^ 0xFFFFFF80, 0, var11.method657((byte) -16, class91.field1499));
                class162.method1216((byte) 38, 11, var40, class121.field2037);
            } else if (var11.method632(class153.field2626, arg0 - 28795)) {
                class75 var17 = var11.method661(arg0 + 122, 0, var11.method657((byte) -57, class153.field2626));
                if (class211.field3603 == 0) {
                    class162.method1216((byte) 38, 12, var17, class121.field2037);
                }
            } else if (var11.method632(class204.field3465, -28804)) {
                class75 var39 = var11.method661(106, 0, var11.method657((byte) -42, class204.field3465));
                if (class211.field3603 == 0) {
                    class162.method1216((byte) 38, 13, var39, class121.field2037);
                }
            } else if (var11.method632(class143.field2462, -28804)) {
                class75 var18 = var11.method661(112, 0, var11.method657((byte) -37, class295.field5073));
                boolean var19 = false;
                long var20 = var18.method630(-72);
                for (int var22 = 0; var22 < class205.field3472; var22++) {
                    if (class66.field1152[var22] == var20) {
                        var19 = true;
                        break;
                    }
                }
                if (!var19 && class211.field3603 == 0) {
                    class162.method1216((byte) 38, 14, class121.field2037, var18);
                }
            } else if (var11.method632(class88.field1462, arg0 ^ 0x708B)) {
                class75 var23 = var11.method661(82, 0, var11.method657((byte) -24, class295.field5073));
                long var24 = var23.method630(arg0 - 89);
                boolean var26 = false;
                for (int var27 = 0; var27 < class205.field3472; var27++) {
                    if (class66.field1152[var27] == var24) {
                        var26 = true;
                        break;
                    }
                }
                if (!var26 && class211.field3603 == 0) {
                    class162.method1216((byte) 38, 15, class121.field2037, var23);
                }
            } else if (var11.method632(class16.field204, -28804)) {
                class75 var28 = var11.method661(arg0 + 109, 0, var11.method657((byte) -44, class295.field5073));
                boolean var29 = false;
                long var30 = var28.method630(-62);
                for (int var32 = 0; var32 < class205.field3472; var32++) {
                    if (class66.field1152[var32] == var30) {
                        var29 = true;
                        break;
                    }
                }
                if (!var29 && class211.field3603 == 0) {
                    class162.method1216((byte) 38, 16, class121.field2037, var28);
                }
            } else if (var11.method632(class83.field1385, -28804)) {
                class75 var33 = var11.method661(114, 0, var11.method657((byte) -36, class295.field5073));
                boolean var34 = false;
                long var35 = var33.method630(-103);
                for (int var37 = 0; var37 < class205.field3472; var37++) {
                    if (class66.field1152[var37] == var35) {
                        var34 = true;
                        break;
                    }
                }
                if (!var34 && class211.field3603 == 0) {
                    class75 var38 = var11.method661(103, var11.method657((byte) -34, class295.field5073) + 1, var11.method640(arg0 + 10) - 9);
                    class162.method1216((byte) 38, 21, var38, var33);
                }
            } else {
                class162.method1216((byte) 38, 0, var11, class121.field2037);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 83) {
            class117.method896(class136.field2328, 109);
            field4016 = -1;
            return true;
        } else if (field4016 == 49) {
            int var293 = class136.field2328.method485((byte) -2);
            int var294 = class136.field2328.method507(-122);
            int var295 = class136.field2328.method481((byte) 33);
            class295 var296 = class35.field521[var293];
            if (var296 != null) {
                class158.method1198(var295, var296, var294, -101);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 103) {
            long var52 = class136.field2328.method499((byte) -54);
            int var54 = class136.field2328.method485((byte) -2);
            byte var55 = class136.field2328.method511(-122);
            boolean var56 = false;
            if ((var52 & Long.MIN_VALUE) != 0L) {
                var56 = true;
            }
            if (var56) {
                if (class205.field3477 == 0) {
                    field4016 = -1;
                    return true;
                }
                long var57 = var52 & Long.MAX_VALUE;
                boolean var59 = false;
                int var60;
                for (var60 = 0; class205.field3477 > var60 && (class311.field5295[var60].field3488 != var57 || class311.field5295[var60].field3152 != var54); var60++) {
                }
                if (var60 < class205.field3477) {
                    while (var60 < (class205.field3477 - 1)) {
                        class311.field5295[var60] = class311.field5295[var60 + 1];
                        var60++;
                    }
                    class205.field3477--;
                    class311.field5295[class205.field3477] = null;
                }
            } else {
                class75 var61 = class136.field2328.method532(-1);
                class189 var62 = new class189();
                var62.field3488 = var52;
                var62.field3149 = class260.method1855(var62.field3488, false);
                var62.field3152 = var54;
                var62.field3158 = var61;
                var62.field3160 = var55;
                int var63;
                for (var63 = class205.field3477 - 1; var63 >= 0; var63--) {
                    int var64 = class311.field5295[var63].field3149.method609(-125, var62.field3149);
                    if (var64 == 0) {
                        class311.field5295[var63].field3152 = var54;
                        class311.field5295[var63].field3160 = var55;
                        class311.field5295[var63].field3158 = var61;
                        class127.field2198 = class187.field3128;
                        field4016 = -1;
                        if (class166.field2792 == var52) {
                            class16.field213 = var55;
                        }
                        return true;
                    }
                    if (var64 < 0) {
                        break;
                    }
                }
                if (class205.field3477 >= class311.field5295.length) {
                    field4016 = -1;
                    return true;
                }
                for (int var65 = class205.field3477 - 1; var65 > var63; var65--) {
                    class311.field5295[var65 + 1] = class311.field5295[var65];
                }
                if (class205.field3477 == 0) {
                    class311.field5295 = new class189[100];
                }
                class311.field5295[var63 + 1] = var62;
                if (class166.field2792 == var52) {
                    class16.field213 = var55;
                }
                class205.field3477++;
            }
            field4016 = -1;
            class127.field2198 = class187.field3128;
            return true;
        } else if (field4016 == 206) {
            long var277 = class136.field2328.method499((byte) -54);
            class136.field2328.method511(-126);
            long var279 = class136.field2328.method499((byte) -54);
            long var281 = (long) class136.field2328.method485((byte) -2);
            long var283 = (long) class136.field2328.method489(-111);
            int var285 = class136.field2328.method501(arg0 + 9);
            int var286 = class136.field2328.method485((byte) -2);
            boolean var287 = false;
            long var288 = (var281 << 32) + var283;
            int var290 = 0;
            label1494: while (true) {
                if (var290 < 100) {
                    if (class255.field4274[var290] != var288) {
                        var290++;
                        continue;
                    }
                    var287 = true;
                    break;
                }
                if (var285 <= 1) {
                    for (int var291 = 0; var291 < class205.field3472; var291++) {
                        if (class66.field1152[var291] == var277) {
                            var287 = true;
                            break label1494;
                        }
                    }
                }
                break;
            }
            if (!var287 && class211.field3603 == 0) {
                class255.field4274[class194.field3223] = var288;
                class194.field3223 = (class194.field3223 + 1) % 100;
                class75 var292 = class303.method2087(1, var286).method1283(class136.field2328, (byte) 114);
                if (var285 == 2 || var285 == 3) {
                    class63.method545(class260.method1855(var279, false).method613(122), 20, var292, 1, var286, class66.method562((byte) -116, new class75[] { class134.field2312, class260.method1855(var277, false).method613(122) }));
                } else if (var285 == 1) {
                    class63.method545(class260.method1855(var279, false).method613(122), 20, var292, 1, var286, class66.method562((byte) -73, new class75[] { class211.field3602, class260.method1855(var277, false).method613(122) }));
                } else {
                    class63.method545(class260.method1855(var279, false).method613(122), 20, var292, 1, var286, class260.method1855(var277, false).method613(122));
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 228) {
            class296.field5077 = class136.field2328.method501(arg0 ^ 0xFFFFFFF7);
            class238.field4001 = class136.field2328.method479(96);
            for (int var66 = class238.field4001; var66 < (class238.field4001 + 8); var66++) {
                for (int var67 = class296.field5077; var67 < (class296.field5077 + 8); var67++) {
                    if (class130.field2245[class67.field1174][var66][var67] != null) {
                        class130.field2245[class67.field1174][var66][var67] = null;
                        class90.method712(var66, 128, var67);
                    }
                }
            }
            for (class85 var68 = (class85) class216.field3701.method1250(true); var68 != null; var68 = (class85) class216.field3701.method1256((byte) -128)) {
                if (var68.field1396 >= class238.field4001 && (class238.field4001 + 8) > var68.field1396 && var68.field1406 >= class296.field5077 && (class296.field5077 + 8) > var68.field1406 && class67.field1174 == var68.field1411) {
                    var68.field1399 = 0;
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 116) {
            int var270 = class136.field2328.method505(arg0 ^ 0xFFFFFF08);
            int var271 = class136.field2328.method474((byte) 104);
            int var272 = class136.field2328.method491(arg0 + 17);
            int var273 = class136.field2328.method492(65629128);
            if (var272 == 65535) {
                var272 = -1;
            }
            if (class140.method1086(var271, -25)) {
                class262 var274 = class51.method374(-14, var273);
                if (var274.field4540) {
                    class199.method1479(var272, 20142, var270, var273);
                    class278 var275 = class199.method1475(var272, (byte) 111);
                    class176.method1300(var275.field4808, -7987, var273, var275.field4820, var275.field4762);
                    class78.method667(var273, var275.field4802, var275.field4780, (byte) -83, var275.field4761);
                } else if (var272 == -1) {
                    field4016 = -1;
                    var274.field4467 = 0;
                    return true;
                } else {
                    class278 var276 = class199.method1475(var272, (byte) -79);
                    var274.field4535 = var272;
                    var274.field4477 = var276.field4808;
                    var274.field4463 = var276.field4820 * 100 / var270;
                    var274.field4467 = 4;
                    var274.field4390 = var276.field4762;
                    class291.method2027(var274, 14580);
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 243) {
            int var265 = class136.field2328.method485((byte) -2);
            class75 var266 = class136.field2328.method532(-1);
            Object[] var267 = new Object[var266.method640(1) + 1];
            for (int var268 = var266.method640(1) - 1; var268 >= 0; var268--) {
                if (var266.method626(160, var268) == 115) {
                    var267[var268 + 1] = class136.field2328.method532(-1);
                } else {
                    var267[var268 + 1] = Integer.valueOf(class136.field2328.method505(255));
                }
            }
            var267[0] = Integer.valueOf(class136.field2328.method505(255));
            if (class140.method1086(var265, 104)) {
                class24 var269 = new class24();
                var269.field302 = var267;
                class204.method1515(var269, (byte) 9);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 182) {
            int var69 = class136.field2328.method481((byte) -125);
            int var70 = class136.field2328.method476(-91);
            class162.method1212(false, var70, var69);
            field4016 = -1;
            return true;
        } else if (field4016 == 111) {
            field4016 = -1;
            class158.field2719 = 0;
            return true;
        } else if (field4016 == 58) {
            class89.method707(16384);
            field4016 = -1;
            return true;
        } else if (~field4016 == arg0) {
            class263.method1878(class136.field2328, class299.field5105, (byte) -94, class210.field3585);
            field4016 = -1;
            return true;
        } else if (field4016 == 62) {
            int var71 = class136.field2328.method492(arg0 + 65629137);
            class75.field1306 = class210.field3585.method949(var71, (byte) -99);
            field4016 = -1;
            return true;
        } else if (field4016 == 26) {
            class187.method1416(arg0 ^ 0xFFFFFFF5);
            class194.field3233 = class136.field2328.method501(0);
            class66.field1155 = class187.field3128;
            field4016 = -1;
            return true;
        } else if (field4016 == 251) {
            int var72 = class136.field2328.method491(8);
            int var73 = class136.field2328.method474((byte) 104);
            int var74 = class136.field2328.method483((byte) 47);
            int var75 = class136.field2328.method474((byte) 104);
            if (class140.method1086(var72, -125)) {
                class250.method1801(4056, var74, (var73 << 16) + var75);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 63) {
            int var256 = class136.field2328.method483((byte) 47);
            int var257 = class136.field2328.method481((byte) 124);
            int var258 = class136.field2328.method476(-57);
            int var259 = class136.field2328.method485((byte) -2);
            int var260 = class136.field2328.method491(arg0 + 17);
            if (var260 == 65535) {
                var260 = -1;
            }
            if (var259 == 65535) {
                var259 = -1;
            }
            if (class140.method1086(var257, -12)) {
                for (int var261 = var259; var261 <= var260; var261++) {
                    long var262 = ((long) var258 << 32) + (long) var261;
                    class206 var264 = class278.field4799.method1007(var262, arg0 ^ 0x4263);
                    if (var264 != null) {
                        var264.method1527(66);
                    }
                    class278.field4799.method1004((byte) 73, var262, new class8(var256));
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 210) {
            class259.method1845((byte) 95);
            field4016 = -1;
            return true;
        } else if (field4016 == 108) {
            int var76 = class136.field2328.method492(65629128);
            int var77 = class136.field2328.method481((byte) -116);
            int var78 = class136.field2328.method481((byte) -121);
            if (class140.method1086(var77, -121)) {
                class291.method2031(var76, 6, var78);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 81) {
            if (class299.field5117 != null) {
                class28.method183((byte) 115);
            }
            byte[] var79 = new byte[class299.field5105];
            class136.field2328.method95(0, 0, var79, class299.field5105);
            class75 var80 = class191.method1442(class299.field5105, (byte) 74, 0, var79);
            if (class211.field3601 == null && class177.field2975 == 2 || !class124.field2070.startsWith("win") || class87.field1441) {
                class302.method2078(arg0 - 89, var80, true);
            } else {
                class298.field5096 = var80;
                class187.field3122 = true;
                class151.field2604 = class210.field3585.method952(true, new String(var80.method659(false), "ISO-8859-1"));
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 199) {
            int var81 = class136.field2328.method491(8);
            if (var81 == 65535) {
                var81 = -1;
            }
            int var82 = class136.field2328.method481((byte) -125);
            int var83 = class136.field2328.method476(-121);
            if (class140.method1086(var82, -126)) {
                class189.method1432(1, var81, var83, 4);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 221) {
            int var84 = class136.field2328.method507(-122);
            int var85 = class136.field2328.method491(arg0 + 17);
            int var86 = class136.field2328.method474((byte) 104);
            if (class140.method1086(var85, 76)) {
                if (var84 == 2) {
                    class139.method1075((byte) -26);
                }
                class81.field1361 = var86;
                class162.method1214(var86, true);
                class45.method306(false, (byte) 79);
                class72.method596(1, class81.field1361);
                for (int var87 = 0; var87 < 100; var87++) {
                    class226.field3815[var87] = true;
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 3) {
            class187.method1416(2);
            int var252 = class136.field2328.method507(-121);
            int var253 = class136.field2328.method483((byte) 47);
            int var254 = class136.field2328.method479(arg0 + 133);
            class267.field4596[var254] = var253;
            class187.field3124[var254] = var252;
            class127.field2206[var254] = 1;
            for (int var255 = 0; var255 < 98; var255++) {
                if (class292.field5014[var255] <= var253) {
                    class127.field2206[var254] = var255 + 2;
                }
            }
            class158.field2717[class235.method1710(class185.field3079++, 31)] = var254;
            field4016 = -1;
            return true;
        } else if (field4016 == 231) {
            class185.field3065 = class136.field2328.method501(0);
            class258.field4333 = class136.field2328.method501(arg0 ^ 0xFFFFFFF7);
            class28.field364 = class136.field2328.method501(arg0 + 9);
            field4016 = -1;
            return true;
        } else if (field4016 == 207) {
            class154.field2647 = class136.field2328.method485((byte) -2) * 30;
            class66.field1155 = class187.field3128;
            field4016 = -1;
            return true;
        } else if (field4016 == 4) {
            long var88 = class136.field2328.method499((byte) -54);
            class75 var90 = class101.method787(class238.method1724(class136.field2328, 92).method641(-8450));
            class162.method1216((byte) 38, 6, var90, class260.method1855(var88, false).method613(122));
            field4016 = -1;
            return true;
        } else if (field4016 == 22) {
            int var91 = class136.field2328.method492(arg0 + 65629137);
            int var92 = class136.field2328.method474((byte) 104);
            int var93 = class136.field2328.method491(arg0 + 17);
            int var94 = class136.field2328.method491(~arg0);
            int var95 = class136.field2328.method491(~arg0);
            if (class140.method1086(var92, 85)) {
                class176.method1300(var94, arg0 - 7978, var91, var93, var95);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 110) {
            for (int var250 = 0; var250 < class169.field2842.length; var250++) {
                if (class169.field2842[var250] != null) {
                    class169.field2842[var250].field3204 = -1;
                }
            }
            for (int var251 = 0; var251 < class35.field521.length; var251++) {
                if (class35.field521[var251] != null) {
                    class35.field521[var251].field3204 = -1;
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 34) {
            int var245 = class136.field2328.method501(arg0 + 9);
            int var246 = class136.field2328.method501(0);
            int var247 = class136.field2328.method485((byte) -2);
            int var248 = class136.field2328.method501(0);
            int var249 = class136.field2328.method501(arg0 + 9);
            class113.method877(var245, -1, var248, var247, var249, var246);
            field4016 = -1;
            return true;
        } else if (field4016 == 139) {
            if (class299.field5105 == 0) {
                class9.field114 = class126.field2174;
            } else {
                class9.field114 = class136.field2328.method532(-1);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 128) {
            class272.field4699 = class136.field2328.method501(0);
            field4016 = -1;
            class166.field2793 = class187.field3128;
            return true;
        } else if (field4016 == 101) {
            class223.method1648(true, (byte) 88);
            field4016 = -1;
            return true;
        } else if (field4016 == 179) {
            int var96 = class136.field2328.method491(8);
            int var97 = class136.field2328.method481((byte) -109);
            class290.field4981 = var97;
            class95.field1547 = var96;
            class17.method103((byte) -127);
            field4016 = -1;
            return true;
        } else if (field4016 == 48) {
            int var98 = class136.field2328.method476(-86);
            int var99 = class136.field2328.method491(8);
            class182.method1347(var98, (byte) 124, var99);
            field4016 = -1;
            return true;
        } else if (field4016 == 39) {
            int var100 = class136.field2328.method501(arg0 + 9);
            int var101 = var100 >> 6;
            class51 var102 = new class51();
            var102.field839 = var100 & 0x3F;
            var102.field846 = class136.field2328.method501(0);
            if (var102.field846 >= 0 && class63.field1101.length > var102.field846) {
                if (var102.field839 == 1 || var102.field839 == 10) {
                    var102.field851 = class136.field2328.method485((byte) -2);
                    class136.field2328.field1012 += 3;
                } else if (var102.field839 >= 2 && var102.field839 <= 6) {
                    if (var102.field839 == 2) {
                        var102.field848 = 64;
                        var102.field855 = 64;
                    }
                    if (var102.field839 == 3) {
                        var102.field855 = 64;
                        var102.field848 = 0;
                    }
                    if (var102.field839 == 4) {
                        var102.field848 = 128;
                        var102.field855 = 64;
                    }
                    if (var102.field839 == 5) {
                        var102.field848 = 64;
                        var102.field855 = 0;
                    }
                    if (var102.field839 == 6) {
                        var102.field848 = 64;
                        var102.field855 = 128;
                    }
                    var102.field839 = 2;
                    var102.field835 = class136.field2328.method485((byte) -2);
                    var102.field831 = class136.field2328.method485((byte) -2);
                    var102.field838 = class136.field2328.method501(0);
                }
                var102.field845 = class136.field2328.method485((byte) -2);
                if (var102.field845 == 65535) {
                    var102.field845 = -1;
                }
                class219.field3747[var101] = var102;
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 232) {
            class67.method574((byte) 124);
            field4016 = -1;
            return false;
        } else if (field4016 == 237) {
            int var242 = class136.field2328.method483((byte) 47);
            class262 var243 = class51.method374(121, var242);
            for (int var244 = 0; var244 < var243.field4410.length; var244++) {
                var243.field4410[var244] = -1;
                var243.field4410[var244] = 0;
            }
            class291.method2027(var243, 14580);
            field4016 = -1;
            return true;
        } else if (field4016 == 129) {
            int var103 = class136.field2328.method491(8);
            int var104 = class136.field2328.method492(65629128);
            int var105 = class136.field2328.method492(arg0 ^ 0xFC16943F);
            if (class140.method1086(var103, arg0 + 113)) {
                class93 var106 = (class93) class73.field1224.method1007((long) var104, -17004);
                class93 var107 = (class93) class73.field1224.method1007((long) var105, arg0 ^ 0x4263);
                if (var107 != null) {
                    class97.method746(32678, var106 == null || var106.field1518 != var107.field1518, var107);
                }
                if (var106 != null) {
                    var106.method1527(-121);
                    class73.field1224.method1004((byte) 73, (long) var105, var106);
                }
                class262 var108 = class51.method374(-95, var104);
                if (var108 != null) {
                    class291.method2027(var108, 14580);
                }
                class262 var109 = class51.method374(-26, var105);
                if (var109 != null) {
                    class291.method2027(var109, arg0 ^ 0xFFFFC703);
                    class180.method1324(true, var109, true);
                }
                if (class81.field1361 != -1) {
                    class176.method1296(28, 1, class81.field1361);
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 249) {
            int var110 = class136.field2328.method505(255);
            int var111 = class136.field2328.method485((byte) -2);
            class262 var112;
            if (var110 >= 0) {
                var112 = class51.method374(103, var110);
            } else {
                var112 = null;
            }
            if (var110 < -70000) {
                var111 += 32768;
            }
            while (class299.field5105 > class136.field2328.field1012) {
                int var113 = class136.field2328.method504(-99);
                int var114 = class136.field2328.method485((byte) -2);
                int var115 = 0;
                if (var114 != 0) {
                    var115 = class136.field2328.method501(0);
                    if (var115 == 255) {
                        var115 = class136.field2328.method505(255);
                    }
                }
                if (var112 != null && var113 >= 0 && var112.field4410.length > var113) {
                    var112.field4410[var113] = var114;
                    var112.field4496[var113] = var115;
                }
                class305.method2095(var113, var114 - 1, 22075, var115, var111);
            }
            if (var112 != null) {
                class291.method2027(var112, 14580);
            }
            class187.method1416(2);
            class64.field1109[class235.method1710(31, class237.field3989++)] = class235.method1710(32767, var111);
            field4016 = -1;
            return true;
        } else if (field4016 == 150) {
            class173.method1284(126);
            field4016 = -1;
            return true;
        } else if (field4016 == 104) {
            class75 var239 = class136.field2328.method532(-1);
            int var240 = class136.field2328.method474((byte) 104);
            int var241 = class136.field2328.method491(8);
            if (class140.method1086(var240, -125)) {
                class206.method1526(-3, var239, var241);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 209) {
            long var116 = class136.field2328.method499((byte) -54);
            long var118 = (long) class136.field2328.method485((byte) -2);
            long var120 = (long) class136.field2328.method489(-109);
            boolean var122 = false;
            long var123 = (var118 << 32) + var120;
            int var125 = class136.field2328.method501(0);
            int var126 = 0;
            label1293: while (true) {
                if (var126 < 100) {
                    if (class255.field4274[var126] != var123) {
                        var126++;
                        continue;
                    }
                    var122 = true;
                    break;
                }
                if (var125 <= 1) {
                    if (class188.field3140 == 1 || class213.field3627 == 1) {
                        var122 = true;
                    } else {
                        for (int var127 = 0; var127 < class205.field3472; var127++) {
                            if (class66.field1152[var127] == var116) {
                                var122 = true;
                                break label1293;
                            }
                        }
                    }
                }
                break;
            }
            if (!var122 && class211.field3603 == 0) {
                class255.field4274[class194.field3223] = var123;
                class194.field3223 = (class194.field3223 + 1) % 100;
                class75 var128 = class101.method787(class238.method1724(class136.field2328, 83).method641(-8450));
                if (var125 == 2 || var125 == 3) {
                    class162.method1216((byte) 38, 7, var128, class66.method562((byte) -64, new class75[] { class134.field2312, class260.method1855(var116, false).method613(122) }));
                } else if (var125 == 1) {
                    class162.method1216((byte) 38, 7, var128, class66.method562((byte) 120, new class75[] { class211.field3602, class260.method1855(var116, false).method613(arg0 + 131) }));
                } else {
                    class162.method1216((byte) 38, 3, var128, class260.method1855(var116, false).method613(arg0 + 131));
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 95) {
            int var234 = class136.field2328.method501(arg0 ^ 0xFFFFFFF7);
            int var235 = class136.field2328.method501(0);
            int var236 = class136.field2328.method501(0);
            int var237 = class136.field2328.method501(0);
            int var238 = class136.field2328.method485((byte) -2);
            class169.field2841[var234] = true;
            class180.field3028[var234] = var235;
            class31.field453[var234] = var236;
            class232.field3922[var234] = var237;
            class270.field4655[var234] = var238;
            field4016 = -1;
            return true;
        } else if (field4016 == 59) {
            int var232 = class136.field2328.method485((byte) -2);
            int var233 = class136.field2328.method501(0);
            class182.method1347(var233, (byte) 125, var232);
            field4016 = -1;
            return true;
        } else if (field4016 == 45) {
            class75 var229 = class136.field2328.method532(-1);
            int var230 = class136.field2328.method507(-117);
            int var231 = class136.field2328.method501(0);
            if (var230 >= 1 && var230 <= 8) {
                if (var229.method614(class290.field4976, -66)) {
                    var229 = null;
                }
                class134.field2308[var230 - 1] = var229;
                class218.field3723[var230 - 1] = var231 == 0;
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 1) {
            int var129 = class136.field2328.method485((byte) -2);
            int var130 = class136.field2328.method501(0);
            if (var129 == 65535) {
                var129 = -1;
            }
            int var131 = class136.field2328.method485((byte) -2);
            class20.method130(var129, var130, var131, 71);
            field4016 = -1;
            return true;
        } else if (field4016 == 214) {
            class217.field3718 = class136.field2328.method501(0);
            field4016 = -1;
            return true;
        } else if (field4016 == 223) {
            int var225 = class136.field2328.method485((byte) -2);
            int var226 = class136.field2328.method481((byte) -119);
            int var227 = class136.field2328.method485((byte) -2);
            int var228 = class136.field2328.method492(arg0 ^ 0xFC16943F);
            if (class140.method1086(var227, -5)) {
                class189.method1432(7, var226 << 16 | var225, var228, 4);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 219) {
            class223.method1648(false, (byte) 120);
            field4016 = -1;
            return true;
        } else if (field4016 == 82) {
            int var132 = class136.field2328.method485((byte) -2);
            int var133 = class136.field2328.method485((byte) -2);
            int var134 = class136.field2328.method483((byte) 47);
            if (class140.method1086(var132, arg0 + 119)) {
                class299.method2065(var134, var133, arg0 + 7613);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 247) {
            int var222 = class136.field2328.method492(65629128);
            int var223 = class136.field2328.method474((byte) 104);
            int var224 = class136.field2328.method491(8);
            if (class140.method1086(var224, -127)) {
                class176.method1297(var222, var223, 26);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 52) {
            long var218 = class136.field2328.method499((byte) -54);
            int var220 = class136.field2328.method485((byte) -2);
            class75 var221 = class303.method2087(1, var220).method1283(class136.field2328, (byte) -98);
            class63.method545((class75) null, 19, var221, arg0 ^ 0xFFFFFFF6, var220, class260.method1855(var218, false).method613(122));
            field4016 = -1;
            return true;
        } else if (field4016 == 208) {
            int var215 = class136.field2328.method492(arg0 ^ 0xFC16943F);
            int var216 = class136.field2328.method491(8);
            if (class140.method1086(var216, 101)) {
                int var217 = 0;
                if (class279.field4831.field1564 != null) {
                    var217 = class279.field4831.field1564.method1644(arg0 - 23632);
                }
                class189.method1432(3, var217, var215, 4);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 239) {
            class238.field4001 = class136.field2328.method501(0);
            class296.field5077 = class136.field2328.method479(88);
            field4016 = -1;
            return true;
        } else if (field4016 == 5) {
            int var212 = class136.field2328.method476(-53);
            class75 var213 = class136.field2328.method532(-1);
            int var214 = class136.field2328.method485((byte) -2);
            if (class140.method1086(var214, -125)) {
                class126.method1006(arg0 ^ 0xFFFFFFEC, var212, var213);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 71) {
            int var135 = class136.field2328.method492(65629128);
            int var136 = class136.field2328.method506(125);
            int var137 = class136.field2328.method497((byte) 51);
            int var138 = class136.field2328.method491(8);
            if (class140.method1086(var138, 49)) {
                class241.method1759(var135, var136, -22323, var137);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 149) {
            int var209 = class136.field2328.method474((byte) 104);
            class75 var210 = class136.field2328.method532(-1);
            int var211 = class136.field2328.method485((byte) -2);
            if (class140.method1086(var211, 15)) {
                class206.method1526(-3, var210, var209);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 75) {
            int var139 = class136.field2328.method488(0);
            int var140 = class136.field2328.method488(0);
            int var141 = class136.field2328.method479(116);
            class67.field1174 = var140 >> 1;
            class279.field4831.method741(var139, var141, true, (var140 & 0x1) == 1);
            field4016 = -1;
            return true;
        } else if (field4016 == 106) {
            class127.field2198 = class187.field3128;
            long var142 = class136.field2328.method499((byte) -54);
            if (var142 == 0L) {
                class28.field378 = null;
                class205.field3477 = 0;
                class253.field4253 = null;
                class311.field5295 = null;
                field4016 = -1;
                return true;
            }
            long var144 = class136.field2328.method499((byte) -54);
            class253.field4253 = class260.method1855(var144, false);
            class28.field378 = class260.method1855(var142, false);
            class42.field697 = class136.field2328.method511(arg0 ^ 0x73);
            int var146 = class136.field2328.method501(0);
            if (var146 == 255) {
                field4016 = -1;
                return true;
            }
            class205.field3477 = var146;
            class189[] var147 = new class189[100];
            for (int var148 = 0; var148 < class205.field3477; var148++) {
                var147[var148] = new class189();
                var147[var148].field3488 = class136.field2328.method499((byte) -54);
                var147[var148].field3149 = class260.method1855(var147[var148].field3488, false);
                var147[var148].field3152 = class136.field2328.method485((byte) -2);
                var147[var148].field3160 = class136.field2328.method511(arg0 ^ 0x7D);
                var147[var148].field3158 = class136.field2328.method532(-1);
                if (class166.field2792 == var147[var148].field3488) {
                    class16.field213 = var147[var148].field3160;
                }
            }
            boolean var149 = false;
            int var150 = class205.field3477;
            while (var150 > 0) {
                var150--;
                boolean var151 = true;
                for (int var152 = 0; var152 < var150; var152++) {
                    if (var147[var152].field3149.method609(arg0 ^ 0xFFFFFFB5, var147[var152 + 1].field3149) > 0) {
                        class189 var153 = var147[var152];
                        var147[var152] = var147[var152 + 1];
                        var147[var152 + 1] = var153;
                        var151 = false;
                    }
                }
                if (var151) {
                    break;
                }
            }
            field4016 = -1;
            class311.field5295 = var147;
            return true;
        } else if (field4016 == 244 || field4016 == 126 || field4016 == 135 || field4016 == 32 || field4016 == 50 || field4016 == 222 || field4016 == 240 || field4016 == 194 || field4016 == 220 || field4016 == 88 || field4016 == 168 || field4016 == 175) {
            class113.method878(3);
            field4016 = -1;
            return true;
        } else if (field4016 == 31) {
            int var191 = class136.field2328.method481((byte) -111);
            int var192 = class136.field2328.method505(255);
            int var193 = class136.field2328.method491(8);
            int var194 = class136.field2328.method485((byte) -2);
            if (var192 >> 30 != 0) {
                int var195 = (var192 & 0x3D6B09FB) >> 28;
                int var196 = (var192 & 0x3FFF) - class175.field2939;
                int var197 = ((var192 & 0xFFFC9C5) >> 14) - class275.field4737;
                if (var197 >= 0 && var196 >= 0 && var197 < 104 && var196 < 104) {
                    int var198 = var197 * 128 + 64;
                    int var199 = var196 * 128 + 64;
                    class172 var200 = new class172(var194, var195, var198, var199, class32.method217(var198, var199, true, var195) - var191, var193, class143.field2463);
                    class5.field52.method1251(new class218(var200), -117);
                }
            } else if ((var192 >> 29) != 0) {
                int var205 = var192 & 0xFFFF;
                class295 var206 = class35.field521[var205];
                if (var206 != null) {
                    var206.field3247 = var191;
                    var206.field3224 = class143.field2463 + var193;
                    var206.field3261 = var194;
                    var206.field3210 = 0;
                    if (var206.field3261 == 65535) {
                        var206.field3261 = -1;
                    }
                    var206.field3255 = 0;
                    if (class143.field2463 < var206.field3224) {
                        var206.field3255 = -1;
                    }
                    if (var206.field3261 != -1 && class143.field2463 == var206.field3224) {
                        int var207 = class65.method556(var206.field3261, -106).field4550;
                        if (var207 != -1) {
                            class28 var208 = class302.method2082(var207, 120);
                            if (var208 != null && var208.field368 != null) {
                                class292.method2034(0, false, var206.field3259, var208, 42, var206.field3218);
                            }
                        }
                    }
                }
            } else if (var192 >> 28 != 0) {
                int var201 = var192 & 0xFFFF;
                class96 var202;
                if (class88.field1460 == var201) {
                    var202 = class279.field4831;
                } else {
                    var202 = class169.field2842[var201];
                }
                if (var202 != null) {
                    var202.field3261 = var194;
                    if (var202.field3261 == 65535) {
                        var202.field3261 = -1;
                    }
                    var202.field3255 = 0;
                    var202.field3247 = var191;
                    var202.field3210 = 0;
                    var202.field3224 = class143.field2463 + var193;
                    if (class143.field2463 < var202.field3224) {
                        var202.field3255 = -1;
                    }
                    if (var202.field3261 != -1 && class143.field2463 == var202.field3224) {
                        int var203 = class65.method556(var202.field3261, arg0 ^ 0x41).field4550;
                        if (var203 != -1) {
                            class28 var204 = class302.method2082(var203, 66);
                            if (var204 != null && var204.field368 != null) {
                                class292.method2034(0, class279.field4831 == var202, var202.field3259, var204, 84, var202.field3218);
                            }
                        }
                    }
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 91) {
            int var189 = class136.field2328.method485((byte) -2);
            byte var190 = class136.field2328.method511(arg0 - 105);
            class162.method1212(false, var190, var189);
            field4016 = -1;
            return true;
        } else if (field4016 == 212) {
            long var154 = class136.field2328.method499((byte) -54);
            class136.field2328.method511(-126);
            long var156 = class136.field2328.method499((byte) -54);
            long var158 = (long) class136.field2328.method485((byte) -2);
            long var160 = (long) class136.field2328.method489(-108);
            boolean var162 = false;
            int var163 = class136.field2328.method501(0);
            long var164 = (var158 << 32) + var160;
            int var166 = 0;
            label1343: while (true) {
                if (var166 >= 100) {
                    if (var163 <= 1) {
                        if (class188.field3140 == 1 || class213.field3627 == 1) {
                            var162 = true;
                        } else {
                            for (int var167 = 0; var167 < class205.field3472; var167++) {
                                if (class66.field1152[var167] == var154) {
                                    var162 = true;
                                    break label1343;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class255.field4274[var166] == var164) {
                    var162 = true;
                    break;
                }
                var166++;
            }
            if (!var162 && class211.field3603 == 0) {
                class255.field4274[class194.field3223] = var164;
                class194.field3223 = (class194.field3223 + 1) % 100;
                class75 var168 = class101.method787(class238.method1724(class136.field2328, 95).method641(arg0 ^ 0x2109));
                if (var163 == 2 || var163 == 3) {
                    class216.method1591((byte) 113, 9, var168, class66.method562((byte) 116, new class75[] { class134.field2312, class260.method1855(var154, false).method613(122) }), class260.method1855(var156, false).method613(122));
                } else if (var163 == 1) {
                    class216.method1591((byte) 111, 9, var168, class66.method562((byte) 120, new class75[] { class211.field3602, class260.method1855(var154, false).method613(122) }), class260.method1855(var156, false).method613(122));
                } else {
                    class216.method1591((byte) 100, 9, var168, class260.method1855(var154, false).method613(arg0 + 131), class260.method1855(var156, false).method613(122));
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 73) {
            int var181 = class136.field2328.method505(255);
            int var182 = class136.field2328.method485((byte) -2);
            class262 var183;
            if (var181 < 0) {
                var183 = null;
            } else {
                var183 = class51.method374(-60, var181);
            }
            if (var183 != null) {
                for (int var184 = 0; var184 < var183.field4410.length; var184++) {
                    var183.field4410[var184] = 0;
                    var183.field4496[var184] = 0;
                }
            }
            if (var181 < -70000) {
                var182 += 32768;
            }
            class75.method624(-6234, var182);
            int var185 = class136.field2328.method485((byte) -2);
            for (int var186 = 0; var186 < var185; var186++) {
                int var187 = class136.field2328.method474((byte) 104);
                int var188 = class136.field2328.method479(115);
                if (var188 == 255) {
                    var188 = class136.field2328.method505(255);
                }
                if (var183 != null && var186 < var183.field4410.length) {
                    var183.field4410[var186] = var187;
                    var183.field4496[var186] = var188;
                }
                class305.method2095(var186, var187 - 1, 22075, var188, var182);
            }
            if (var183 != null) {
                class291.method2027(var183, arg0 + 14589);
            }
            class187.method1416(2);
            class64.field1109[class235.method1710(31, class237.field3989++)] = class235.method1710(32767, var182);
            field4016 = -1;
            return true;
        } else if (field4016 == 125) {
            int var178 = class136.field2328.method476(arg0 - 81);
            int var179 = class136.field2328.method507(-127);
            int var180 = class136.field2328.method474((byte) 104);
            if (class140.method1086(var180, arg0 + 4)) {
                class202.method1498(125, var179, var178);
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 107) {
            for (int var169 = 0; var169 < class286.field4920.length; var169++) {
                if (class6.field77[var169] != class286.field4920[var169]) {
                    class286.field4920[var169] = class6.field77[var169];
                    class17.method98(var169, (byte) 108);
                    class133.field2287[class235.method1710(class11.field144++, 31)] = var169;
                }
            }
            field4016 = -1;
            return true;
        } else if (field4016 == 151) {
            int var177 = class136.field2328.method485((byte) -2);
            if (var177 == 65535) {
                var177 = -1;
            }
            class154.method1175(var177, 1);
            field4016 = -1;
            return true;
        } else if (field4016 == 170) {
            int var170 = class136.field2328.method523(arg0 ^ 0xFFFFFF08);
            int var171 = class136.field2328.method491(8);
            if (var171 == 65535) {
                var171 = -1;
            }
            class48.method350(var171, var170, 2157);
            field4016 = -1;
            return true;
        } else if (field4016 == 10) {
            class187.method1416(2);
            class154.field2648 = class136.field2328.method487((byte) -92);
            field4016 = -1;
            class66.field1155 = class187.field3128;
            return true;
        } else if (field4016 == 190) {
            int var172 = class136.field2328.method483((byte) 47);
            int var173 = class136.field2328.method488(0);
            int var174 = class136.field2328.method485((byte) -2);
            int var175 = class136.field2328.method481((byte) 83);
            if (class140.method1086(var174, -128)) {
                class93 var176 = (class93) class73.field1224.method1007((long) var172, -17004);
                if (var176 != null) {
                    class97.method746(arg0 ^ 0xFFFF8051, var176.field1518 != var175, var176);
                }
                class130.method1023(var175, 3, var173, var172);
            }
            field4016 = -1;
            return true;
        } else {
            class17.method100((Throwable) null, -14020, "T1 - " + field4016 + "," + class61.field1070 + "," + class143.field2471 + " - " + class299.field5105);
            class67.method574((byte) 120);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lre;)I", line = 4626)
    public static final int method1734(class262 arg0) {
        class8 var1 = (class8) class278.field4799.method1007(((long) arg0.field4418 << 32) + (long) arg0.field4382, -17004);
        return var1 == null ? arg0.field4542 : var1.field109;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 4635)
    private final void method1735(int arg0, int arg1) {
        if (class311.field5304 == class155.field2663) {
            class311.field5304 = class117.field1992;
        } else {
            class311.field5304 = class155.field2663;
        }
        class151.field2597 = null;
        field4017++;
        class304.field5203++;
        class35.field517 = null;
        class41.field645 = 0;
        if (class304.field5203 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class118.field2003 == 0 || class118.field2003 == 5) {
                this.method365(false, "js5connect_full");
                class118.field2003 = 1000;
            } else {
                class83.field1390 = 3000;
            }
        } else if (class304.field5203 >= 2 && arg1 == 6) {
            this.method365(false, "js5connect_outofdate");
            class118.field2003 = 1000;
        } else if (class304.field5203 >= 4) {
            if (class118.field2003 == 0 || class118.field2003 == 5) {
                this.method365(false, "js5connect");
                class118.field2003 = 1000;
            } else {
                class83.field1390 = 3000;
            }
        }
        if (arg0 != 24761) {
            field4016 = -98;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 4695)
    private final void method1736(int arg0) {
        field4020++;
        if (class242.field4072.field70 >= 4) {
            this.method365(false, "js5crc");
            class118.field2003 = 1000;
            return;
        }
        if (class242.field4072.field71 >= 4) {
            if (class118.field2003 == 0 || class118.field2003 == 5) {
                this.method365(false, "js5io");
                class118.field2003 = 1000;
                return;
            }
            class242.field4072.field71 = 3;
            class83.field1390 = 3000;
        }
        if ((class83.field1390--) > 0) {
            return;
        }
        try {
            if (class41.field645 == 0) {
                class151.field2597 = class210.field3585.method937(1, class311.field5305, class311.field5304);
                class41.field645++;
            }
            if (class41.field645 == 1) {
                if (class151.field2597.field1330 == 2) {
                    this.method1735(24761, -1);
                    return;
                }
                if (class151.field2597.field1330 == 1) {
                    class41.field645++;
                }
            }
            if (class41.field645 == 2) {
                class35.field517 = new class294((Socket) class151.field2597.field1329, class210.field3585);
                class60 var2 = new class60(5);
                var2.method518(123, 15);
                var2.method510(512, 127);
                class35.field517.method2043(var2.field997, 5, 0, -31544);
                class41.field645++;
                class206.field3484 = class78.method669(2047);
            }
            if (class41.field645 == 3) {
                if (class118.field2003 == 0 || class118.field2003 == 5 || class35.field517.method2042(-68) > 0) {
                    int var3 = class35.field517.method2045(96);
                    if (var3 != 0) {
                        this.method1735(24761, var3);
                        return;
                    }
                    class41.field645++;
                } else if (class78.method669(2047) - class206.field3484 > 30000L) {
                    this.method1735(24761, -2);
                    return;
                }
            }
            if (class41.field645 == 4) {
                boolean var4 = class118.field2003 == 5 || class118.field2003 == 10 || class118.field2003 == 28;
                class242.field4072.method27(class35.field517, !var4, false);
                class304.field5203 = 0;
                class151.field2597 = null;
                class41.field645 = 0;
                class35.field517 = null;
            }
            if (arg0 >= -54) {
                this.method364((byte) -86);
            }
        } catch (IOException var6) {
            this.method1735(24761, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 4827)
    public final void method367(int arg0) {
        field4015++;
        method1731((byte) -41);
        class75.method651((byte) -106);
        class106.method828(-8878);
        class177.method1303((byte) -106);
        class137.method1050((byte) 74);
        class50.method371(11420);
        class47.method313();
        class211.method1562(false);
        class149.method1148((byte) 115);
        class288.method2022(-19345);
        class51.method379(-111);
        class60.method515(-3);
        class294.method2044(-76);
        class5.method33((byte) 69);
        class100.method764((byte) -49);
        class273.method1944(-124);
        class267.method1898(-1);
        if (arg0 <= 123) {
            return;
        }
        class39.method269((byte) 96);
        class158.method1197((byte) -79);
        class295.method2052(-124);
        class16.method96((byte) 117);
        class104.method809(17448960);
        class262.method1867(-77);
        class89.method706(-1);
        class96.method745(true);
        class170.method1263(0);
        class126.method1003(22567);
        class110.method863(false);
        class189.method1433(12345678);
        class191.method1441((byte) -9);
        class258.method1835((byte) -62);
        class125.method996(-93);
        class199.method1483((byte) -95);
        class259.method1851(116);
        class223.method1645(true);
        class28.method180((byte) -45);
        class194.method1456((byte) 102);
        class242.method1764((byte) 95);
        class85.method690((byte) -106);
        class229.method1674(-104);
        class93.method727((byte) 122);
        class206.method1523(1);
        class109.method852(-5346);
        class97.method751(-86);
        class237.method1717(-10056);
        class164.method1225(-24536);
        class286.method2011(99);
        class25.method170((byte) -112);
        class70.method591(21368);
        class283.method2003((byte) 96);
        class240.method1754(361);
        class187.method1415(true);
        class297.method2056((byte) -64);
        class108.method842(-57);
        class274.method1954(62);
        class239.method1743();
        class134.method1038((byte) -34);
        class146.method1128();
        class121.method922(true);
        class57.method444();
        class278.method1984(121);
        class208.method1536();
        class32.method215(127);
        class310.method2111((byte) 59);
        class78.method671(1000);
        class147.method1132(-12787);
        class55.method396((byte) 29);
        class119.method910();
        class303.method2088(5969);
        class238.method1726((byte) -107);
        class101.method773();
        class63.method546(-125);
        class38.method256();
        class285.method2008((byte) -106);
        class202.method1500(17470);
        class171.method1265(0);
        class167.method1240(9544);
        class235.method1711(-52);
        class217.method1593(-1);
        class282.method1998(-19081);
        class236.method1716(-2925);
        class129.method1017();
        class254.method1818();
        class271.method1938(-115);
        class203.method1503(-1);
        class139.method1065(-22);
        class21.method141();
        class44.method300();
        class37.method250(-83);
        class35.method231((byte) 125);
        class209.method1553();
        class176.method1295(true);
        class252.method1812(0);
        class18.method117();
        class141.method1096();
        class31.method208((byte) 75);
        class222.method1626();
        class138.method1053(true);
        class205.method1519((byte) 92);
        class15.method82();
        class261.method1860(-85);
        class30.method205((byte) 119);
        class220.method1605();
        class270.method1931((byte) -54);
        class17.method104(116);
        class95.method733(0);
        class19.method125((byte) 119);
        class265.method1886((byte) -127);
        class216.method1587(103);
        class52.method381(1);
        class281.method1995(20451);
        class247.method1785(0);
        class87.method701(87);
        class59.method473(-62);
        class215.method1583((byte) -125);
        class117.method891(49);
        class136.method1048(20754);
        class268.method1926(-160);
        class226.method1663(false);
        class263.method1883(-128);
        class233.method1703((byte) 84);
        class12.method63((byte) -97);
        class302.method2079(-2);
        class173.method1276(-53);
        class69.method588((byte) 9);
        class140.method1081(-107);
        class185.method1392(true);
        class88.method704((byte) -9);
        class72.method602(1854581702);
        class287.method2020(122);
        class200.method1491(false);
        class24.method167(14787);
        class230.method1682((byte) 93);
        class6.method34(-101);
        class120.method916(124);
        class161.method1209((byte) -55);
        class272.method1940(1376312589);
        class156.method1181((byte) -25);
        class118.method902(-20);
        class290.method2024(-9962);
        class20.method131((byte) -86);
        class3.method19((byte) 103);
        class221.method1623(117);
        class309.method2104();
        class154.method1174((byte) -109);
        class90.method716((byte) -124);
        class279.method1990(false);
        class155.method1178(-18);
        class246.method1780(-32768);
        class172.method1271(false);
        class8.method42(-1);
        class123.method932(1309);
        class214.method1578(51);
        class168.method1244((byte) 119);
        class166.method1236(1);
        class298.method2059((byte) -113);
        class111.method867(0);
        class196.method1461((byte) 85);
        class304.method2090((byte) 1);
        class99.method758((byte) -111);
        class241.method1758((byte) 112);
        class198.method1472(0);
        class244.method1768(91);
        class213.method1569((byte) -59);
        class115.method885((byte) -118);
        class112.method868(30507);
        class148.method1143();
        class41.method279(false);
        class152.method1163((byte) -109);
        class81.method681(true);
        class73.method604(38);
        class54.method392(11122);
        class7.method38((byte) -58);
        class62.method543();
        class201.method1492();
        class293.method2040();
        class91.method717(false);
        class250.method1799((byte) 96);
        class210.method1558(1000);
        class116.method888(-101);
        class256.method1824();
        class142.method1098();
        class251.method1808(-118);
        class53.method384((byte) -91);
        class42.method284(false);
        class43.method289(256);
        class151.method1159(true);
        class113.method872(1913);
        class219.method1601((byte) 81);
        class10.method52((byte) 114);
        class190.method1439(16605);
        class150.method1153(18316);
        class311.method2113((byte) -113);
        class82.method683(73);
        class225.method1653();
        class23.method160();
        class107.method832();
        class83.method685(64);
        class269.method1927(-1);
        class45.method307(-91);
        class98.method756(true);
        class13.method69(-24995);
        class180.method1321(-20857);
        class79.method673(35);
        class299.method2062((byte) 105);
        class143.method1105(-1);
        class34.method226(28);
        class65.method555((byte) -123);
        class26.method176(-16907);
        class144.method1109(0);
        class178.method1314(2);
        class204.method1518((byte) -127);
        class86.method694(-5530);
        class245.method1771((byte) 69);
        class157.method1189(-105);
        class232.method1698(-31595);
        class48.method347(-117);
        class169.method1248(true);
        class249.method1796(-70);
        class301.method2072(-1);
        class133.method1031(-10);
        class40.method276(true);
        class182.method1346((byte) 43);
        class94.method731(-16535);
        class255.method1821(-2);
        class207.method1529(true);
        class61.method540(0);
        class175.method1291(-126);
        class74.method606(105);
        class305.method2096((byte) -26);
        class127.method1016((byte) 28);
        class195.method1458(4646);
        class132.method1029((byte) -116);
        class11.method53((byte) 54);
        class253.method1816(-18752);
        class67.method563((byte) -12);
        class9.method45(false);
        class163.method1224((byte) 37);
        class197.method1469(1);
        class130.method1021(13);
        class64.method548((byte) 87);
        class276.method1963(0);
        class306.method2102(18854);
        class212.method1564(16118);
        class218.method1596((byte) -102);
        class153.method1168(50);
        class29.method195((byte) -122);
        class145.method1111(1);
        class292.method2037((byte) 118);
        class300.method2066(true);
        class14.method73((byte) -96);
        class162.method1218(true);
        class2.method5(1502962924);
        class291.method2026((byte) 82);
        class66.method558(255);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 5108)
    public final void method364(byte arg0) {
        field4018++;
        if (class118.field2003 == 1000) {
            return;
        }
        boolean var2 = class42.method286(-1710);
        if (var2 && class283.field4886 && class64.field1112 != null) {
            class64.field1112.method1474(false);
        }
        if (class118.field2003 == 30 || class118.field2003 == 10) {
            if (class17.field220) {
                class278.method1972(108);
            } else if (class61.field1089 != 0L && class61.field1089 < class78.method669(2047)) {
                class278.method1972(93);
            }
        }
        if (class168.field2830 != 0L && class78.method669(2047) > class168.field2830 && class35.field513 != null && (class118.field2003 == 30 || class118.field2003 == 25)) {
            class202.method1499(-54);
        }
        if (class299.field5117 == null) {
            Container var3;
            if (class299.field5117 != null) {
                var3 = class299.field5117;
            } else if (class211.field3601 == null) {
                var3 = class210.field3585.field2072;
            } else {
                var3 = class211.field3601;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class211.field3601 == var3) {
                Insets var6 = class211.field3601.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class275.field4739 != var4 || class113.field1924 != var5) {
                class29.method198(500, 765);
            }
        }
        if (class299.field5117 != null && !class310.field5294 && (class118.field2003 == 30 || class118.field2003 == 10)) {
            class28.method183((byte) 118);
        }
        boolean var7 = false;
        if (class233.field3944) {
            class233.field3944 = false;
            var7 = true;
        }
        if (var7) {
            class127.method1015(-107);
        }
        if (arg0 >= -104) {
            field4023 = (class146[]) null;
        }
        for (int var8 = 0; var8 < 100; var8++) {
            class226.field3815[var8] = true;
        }
        if (class118.field2003 == 0) {
            class185.method1395(var7, (Color) null, (byte) -30, class74.field1234, class90.field1487);
        } else if (class118.field2003 == 5) {
            class271.method1936(class3.field28, 126);
        } else if (class118.field2003 == 10) {
            class205.method1520(true);
        } else if (class118.field2003 == 25 || class118.field2003 == 28) {
            if (class65.field1129 == 1) {
                if (class228.field3828 < class282.field4867) {
                    class228.field3828 = class282.field4867;
                }
                int var9 = (class228.field3828 - class282.field4867) * 50 / class228.field3828;
                class145.method1110(class66.method562((byte) -68, new class75[] { class282.field4861, class200.field3380, class67.method565(90, var9), class258.field4321 }), -1, false);
            } else if (class65.field1129 == 2) {
                if (class55.field916 > class139.field2409) {
                    class139.field2409 = class55.field916;
                }
                int var10 = (class139.field2409 - class55.field916) * 50 / class139.field2409 + 50;
                class145.method1110(class66.method562((byte) 127, new class75[] { class282.field4861, class200.field3380, class67.method565(98, var10), class258.field4321 }), -1, false);
            } else {
                class145.method1110(class282.field4861, -1, false);
            }
        } else if (class118.field2003 == 30) {
            class150.method1152(-2392);
        } else if (class118.field2003 == 40) {
            class145.method1110(class66.method562((byte) 127, new class75[] { class204.field3456, class195.field3276, class88.field1461 }), -1, false);
        }
        if (class118.field2003 != 0) {
            class47.method311();
            for (int var17 = 0; var17 < class273.field4720; var17++) {
                class219.field3743[var17] = false;
            }
        } else if ((class118.field2003 == 30 || class118.field2003 == 10) && class85.field1392 == 0 && !var7) {
            try {
                Graphics var14 = class237.field3991.getGraphics();
                for (int var15 = 0; var15 < class273.field4720; var15++) {
                    if (class219.field3743[var15]) {
                        class226.field3817.method1145(class120.field2024[var15], class217.field3716[var15], 32767, class157.field2698[var15], var14, class172.field2909[var15]);
                        class219.field3743[var15] = false;
                    }
                }
            } catch (Exception var22) {
                class237.field3991.repaint();
            }
        } else if (class118.field2003 != 0) {
            try {
                Graphics var11 = class237.field3991.getGraphics();
                class226.field3817.method1144((byte) -42, 0, var11, 0);
                for (int var12 = 0; var12 < class273.field4720; var12++) {
                    class219.field3743[var12] = false;
                }
            } catch (Exception var23) {
                class237.field3991.repaint();
            }
        }
        if (class86.field1414) {
            class65.method557(-11953);
        }
        if (!browsercontrol.iscreated() || class240.field4061 == 0) {
            return;
        }
        try {
            Point var18 = class237.field3991.getLocationOnScreen();
            Dimension var19 = class237.field3991.getSize();
            browsercontrol.set_position(var18.x, var18.y - class240.field4061, var19.width, class240.field4061);
        } catch (Exception var21) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 5343)
    public static final void main(String[] arg0) {
        try {
            int var1 = -1;
            if (arg0.length < 7 || arg0.length > 8) {
                class60.method534(false);
            }
            class246.field4160 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class265.field4574 = 0;
            } else if (arg0[1].equals("office")) {
                class265.field4574 = 1;
            } else if (arg0[1].equals("local")) {
                class265.field4574 = 2;
            } else {
                class60.method534(false);
            }
            if (arg0[2].equals("live")) {
                class48.field780 = 0;
            } else if (arg0[2].equals("rc")) {
                class48.field780 = 1;
            } else if (arg0[2].equals("wip")) {
                class48.field780 = 2;
            } else {
                class60.method534(false);
            }
            if (arg0[4].equals("free")) {
                class120.field2016 = false;
            } else if (arg0[4].equals("members")) {
                class120.field2016 = true;
            } else {
                class60.method534(false);
            }
            try {
                byte[] var2 = arg0[5].getBytes("ISO-8859-1");
                var1 = class103.method805(-78, class191.method1442(var2.length, (byte) 31, 0, var2));
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class151.field2592 = var1;
            } else if (arg0[5].equals("english")) {
                class151.field2592 = 0;
            } else if (arg0[5].equals("german")) {
                class151.field2592 = 1;
            } else {
                class60.method534(false);
            }
            class252.method1811((byte) 99, class151.field2592);
            if (arg0[6].equals("game0")) {
                class230.field3907 = 0;
            } else if (arg0[6].equals("game1")) {
                class230.field3907 = 1;
            } else {
                class60.method534(false);
            }
            if (arg0.length != 8) {
                class283.field4890 = false;
            } else if (arg0[7].equals("safemode")) {
                class283.field4890 = true;
            } else {
                class60.method534(false);
            }
            class98.field1612 = 0;
            class310.field5287 = class121.field2037;
            class311.field5305 = "127.0.0.1";
            client var4 = new client();
            var4.method361(-128, 1024, 512, 27, 768, class48.field780 + 32, "runescape");
            class211.field3601.setLocation(40, 40);
        } catch (Exception var7) {
            class17.method100(var7, -14020, (String) null);
        }
        field4025++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lre;)Z", line = 5444)
    public static final boolean method1737(class262 arg0) {
        if (class214.field3662) {
            if (method1734(arg0) != 0) {
                return false;
            }
            if (arg0.field4441 == 0) {
                return false;
            }
        }
        return arg0.field4491;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lre;)Lre;", line = 5463)
    public static final class262 method1738(class262 arg0) {
        int var1 = class61.method541(method1734(arg0), 14866);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class51.method374(111, arg0.field4446);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIII)V", line = 5486)
    public static final void method1739(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -125) {
            field4023 = (class146[]) null;
        }
        class288.field4956 = arg0;
        class294.field5041 = arg3;
        field4024++;
        class153.field2635 = arg2;
        class90.field1495 = arg4;
    }
}
