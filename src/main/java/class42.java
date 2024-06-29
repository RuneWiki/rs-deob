import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class42 extends class143 {

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "S")
    public static short field888 = 32767;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Z")
    public static boolean field881 = false;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "Lok;")
    public static class149 field887;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Lud;")
    public class279 field882;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Lud;")
    public class279 field883;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)Lve;", line = 9)
    public final class265 method358(byte arg0) {
        field880++;
        return arg0 > -126 ? (class265) null : class229.field3983[this.field2594];
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V", line = 22)
    public static void method359(int arg0) {
        if (arg0 != 0) {
            method362(-57, 100, (class23) null);
        }
        field887 = null;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)[Lof;", line = 40)
    private static final class236[] method360(byte arg0) {
        field889++;
        if (arg0 <= 33) {
            return (class236[]) null;
        }
        if (class282.field5039 == null) {
            class236[] var1 = class260.method1863(class110.field2022, (byte) 124);
            class236[] var2 = new class236[var1.length];
            int var3 = 0;
            label56: for (int var4 = 0; var4 < var1.length; var4++) {
                class236 var5 = var1[var4];
                if ((var5.field4113 <= 0 || var5.field4113 >= 24) && var5.field4112 >= 800 && var5.field4117 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class236 var7 = var2[var6];
                        if (var5.field4112 == var7.field4112 && var5.field4117 == var7.field4117) {
                            if (var5.field4113 > var7.field4113) {
                                var2[var6] = var5;
                            }
                            continue label56;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class282.field5039 = new class236[var3];
            class25.method218(var2, 0, class282.field5039, 0, var3);
            int[] var8 = new int[class282.field5039.length];
            for (int var9 = 0; var9 < class282.field5039.length; var9++) {
                class236 var10 = class282.field5039[var9];
                var8[var9] = var10.field4117 * var10.field4112;
            }
            class138.method1067((byte) -4, var8, class282.field5039);
        }
        return class282.field5039;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z", line = 119)
    public static final boolean method361(int arg0, int arg1, int arg2) {
        int var3 = class250.field4458[arg0][arg1][arg2];
        if (-class182.field3328 == var3) {
            return false;
        } else if (class182.field3328 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class213.method1564(var4 + 1, class165.field2970[arg0][arg1][arg2], var5 + 1) && class213.method1564(var4 + 128 - 1, class165.field2970[arg0][arg1 + 1][arg2], var5 + 1) && class213.method1564(var4 + 128 - 1, class165.field2970[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class213.method1564(var4 + 1, class165.field2970[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class250.field4458[arg0][arg1][arg2] = class182.field3328;
                return true;
            } else {
                class250.field4458[arg0][arg1][arg2] = -class182.field3328;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILlh;)V", line = 146)
    public static final void method362(int arg0, int arg1, class23 arg2) {
        field885++;
        Object[] var3 = arg2.field608;
        int var4 = (Integer) var3[0];
        class35 var5 = class243.method1742((byte) -110, var4);
        if (var5 == null) {
            return;
        }
        class77.field1490 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field792;
        byte var10 = -1;
        int[] var11 = var5.field794;
        int var12 = -35 % ((-arg1 - 52) / 59);
        try {
            class298.field5286 = new int[var5.field795];
            class68.field1334 = new class279[var5.field801];
            int var13 = 0;
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if ((var3[var15] instanceof Integer)) {
                    int var17 = (Integer) var3[var15];
                    if (var17 == -2147483647) {
                        var17 = arg2.field604;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg2.field600;
                    }
                    if (var17 == -2147483645) {
                        var17 = arg2.field596 == null ? -1 : arg2.field596.field299;
                    }
                    if (var17 == -2147483644) {
                        var17 = arg2.field595;
                    }
                    if (var17 == -2147483643) {
                        var17 = arg2.field596 == null ? -1 : arg2.field596.field261;
                    }
                    if (var17 == -2147483642) {
                        var17 = arg2.field603 == null ? -1 : arg2.field603.field299;
                    }
                    if (var17 == -2147483641) {
                        var17 = arg2.field603 == null ? -1 : arg2.field603.field261;
                    }
                    if (var17 == -2147483640) {
                        var17 = arg2.field594;
                    }
                    if (var17 == -2147483639) {
                        var17 = arg2.field606;
                    }
                    class298.field5286[var13++] = var17;
                } else if (var3[var15] instanceof class279) {
                    class279 var16 = (class279) var3[var15];
                    if (var16.method1990((byte) 65, class121.field2181)) {
                        var16 = arg2.field607;
                    }
                    class68.field1334[var14++] = var16;
                }
            }
            int var18 = 0;
            label4272: while (true) {
                var18++;
                if (var18 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var510 = var9[var8];
                if (var510 < 100) {
                    if (var510 == 0) {
                        class94.field1769[var6++] = var11[var8];
                        continue;
                    }
                    if (var510 == 1) {
                        int var19 = var11[var8];
                        class94.field1769[var6++] = class326.field5679[var19];
                        continue;
                    }
                    if (var510 == 2) {
                        int var20 = var11[var8];
                        var6--;
                        class77.method652(var20, class94.field1769[var6], 0);
                        continue;
                    }
                    if (var510 == 3) {
                        class310.field5505[var7++] = var5.field803[var8];
                        continue;
                    }
                    if (var510 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var510 == 7) {
                        var6 -= 2;
                        if (class94.field1769[var6 + 1] != class94.field1769[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var510 == 8) {
                        var6 -= 2;
                        if (class94.field1769[var6 + 1] == class94.field1769[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var510 == 9) {
                        var6 -= 2;
                        if (class94.field1769[var6] < class94.field1769[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var510 == 10) {
                        var6 -= 2;
                        if (class94.field1769[var6 + 1] < class94.field1769[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var510 == 21) {
                        if (class77.field1490 == 0) {
                            return;
                        }
                        class248 var21 = class323.field5647[--class77.field1490];
                        var8 = var21.field4411;
                        class298.field5286 = var21.field4413;
                        class68.field1334 = var21.field4404;
                        var5 = var21.field4410;
                        var9 = var5.field792;
                        var11 = var5.field794;
                        continue;
                    }
                    if (var510 == 25) {
                        int var22 = var11[var8];
                        class94.field1769[var6++] = class196.method1463(var22, (byte) 117);
                        continue;
                    }
                    if (var510 == 27) {
                        int var23 = var11[var8];
                        var6--;
                        class236.method1696(class94.field1769[var6], -122, var23);
                        continue;
                    }
                    if (var510 == 31) {
                        var6 -= 2;
                        if (class94.field1769[var6 + 1] >= class94.field1769[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var510 == 32) {
                        var6 -= 2;
                        if (class94.field1769[var6] >= class94.field1769[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var510 == 33) {
                        class94.field1769[var6++] = class298.field5286[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var510 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class298.field5286[var10001] = class94.field1769[var6];
                        continue;
                    }
                    if (var510 == 35) {
                        class310.field5505[var7++] = class68.field1334[var11[var8]];
                        continue;
                    }
                    if (var510 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class68.field1334[var10001] = class310.field5505[var7];
                        continue;
                    }
                    if (var510 == 37) {
                        int var24 = var11[var8];
                        var7 -= var24;
                        class279 var25 = class161.method1272(65, class310.field5505, var7, var24);
                        class310.field5505[var7++] = var25;
                        continue;
                    }
                    if (var510 == 38) {
                        var6--;
                        continue;
                    }
                    if (var510 == 39) {
                        var7--;
                        continue;
                    }
                    if (var510 == 40) {
                        int var26 = var11[var8];
                        class35 var27 = class243.method1742((byte) 18, var26);
                        int[] var28 = new int[var27.field795];
                        class279[] var29 = new class279[var27.field801];
                        for (int var30 = 0; var30 < var27.field798; var30++) {
                            var28[var30] = class94.field1769[var30 + var6 - var27.field798];
                        }
                        for (int var31 = 0; var31 < var27.field787; var31++) {
                            var29[var31] = class310.field5505[var31 + var7 - var27.field787];
                        }
                        var7 -= var27.field787;
                        var6 -= var27.field798;
                        class248 var32 = new class248();
                        var32.field4410 = var5;
                        var32.field4404 = class68.field1334;
                        var32.field4413 = class298.field5286;
                        var32.field4411 = var8;
                        if (class323.field5647.length <= class77.field1490) {
                            throw new RuntimeException();
                        }
                        var5 = var27;
                        class323.field5647[class77.field1490++] = var32;
                        var9 = var27.field792;
                        var11 = var27.field794;
                        var8 = -1;
                        class298.field5286 = var28;
                        class68.field1334 = var29;
                        continue;
                    }
                    if (var510 == 42) {
                        class94.field1769[var6++] = class121.field2185[var11[var8]];
                        continue;
                    }
                    if (var510 == 43) {
                        int var33 = var11[var8];
                        var6--;
                        class121.field2185[var33] = class94.field1769[var6];
                        class33.method300(var33, (byte) 120);
                        continue;
                    }
                    if (var510 == 44) {
                        int var34 = var11[var8] & 0xFFFF;
                        int var35 = var11[var8] >> 16;
                        var6--;
                        int var36 = class94.field1769[var6];
                        if (var36 >= 0 && var36 <= 5000) {
                            byte var37 = -1;
                            if (var34 == 105) {
                                var37 = 0;
                            }
                            class174.field3140[var35] = var36;
                            int var38 = 0;
                            while (true) {
                                if (var38 >= var36) {
                                    continue label4272;
                                }
                                class79.field1511[var35][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var510 == 45) {
                        int var39 = var11[var8];
                        var6--;
                        int var40 = class94.field1769[var6];
                        if (var40 >= 0 && class174.field3140[var39] > var40) {
                            class94.field1769[var6++] = class79.field1511[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var510 == 46) {
                        var6 -= 2;
                        int var41 = var11[var8];
                        int var42 = class94.field1769[var6];
                        if (var42 >= 0 && class174.field3140[var41] > var42) {
                            class79.field1511[var41][var42] = class94.field1769[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var510 == 47) {
                        class279 var43 = class287.field5124[var11[var8]];
                        if (var43 == null) {
                            var43 = class96.field1778;
                        }
                        class310.field5505[var7++] = var43;
                        continue;
                    }
                    if (var510 == 48) {
                        int var44 = var11[var8];
                        var7--;
                        class287.field5124[var44] = class310.field5505[var7];
                        class71.method622(var44, (byte) 24);
                        continue;
                    }
                    if (var510 == 51) {
                        class69 var45 = var5.field789[var11[var8]];
                        var6--;
                        class91 var46 = (class91) var45.method610((long) class94.field1769[var6], -1);
                        if (var46 != null) {
                            var8 += var46.field1714;
                        }
                        continue;
                    }
                }
                boolean var47;
                if (var11[var8] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var510 < 300) {
                    if (var510 == 100) {
                        var6 -= 3;
                        int var48 = class94.field1769[var6];
                        int var49 = class94.field1769[var6 + 1];
                        int var50 = class94.field1769[var6 + 2];
                        if (var49 != 0) {
                            class8 var51 = class273.method1940(var48, 110);
                            if (var51.field159 == null) {
                                var51.field159 = new class8[var50 + 1];
                            }
                            if (var50 >= var51.field159.length) {
                                class8[] var52 = new class8[var50 + 1];
                                for (int var53 = 0; var53 < var51.field159.length; var53++) {
                                    var52[var53] = var51.field159[var53];
                                }
                                var51.field159 = var52;
                            }
                            if (var50 > 0 && var51.field159[var50 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var50 - 1));
                            }
                            class8 var54 = new class8();
                            var54.field324 = var54.field299 = var51.field299;
                            var54.field201 = var49;
                            var54.field223 = true;
                            var54.field261 = var50;
                            var51.field159[var50] = var54;
                            if (var47) {
                                class1.field45 = var54;
                            } else {
                                class297.field5269 = var54;
                            }
                            class50.method426(var51, false);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var510 == 101) {
                        class8 var55 = var47 ? class1.field45 : class297.field5269;
                        if (var55.field261 == -1) {
                            if (!var47) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class8 var56 = class273.method1940(var55.field299, 111);
                        var56.field159[var55.field261] = null;
                        class50.method426(var56, false);
                        continue;
                    }
                    if (var510 == 102) {
                        var6--;
                        class8 var57 = class273.method1940(class94.field1769[var6], 106);
                        var57.field159 = null;
                        class50.method426(var57, false);
                        continue;
                    }
                    if (var510 == 200) {
                        var6 -= 2;
                        int var58 = class94.field1769[var6];
                        int var59 = class94.field1769[var6 + 1];
                        class8 var60 = class103.method868(250, var59, var58);
                        if (var60 != null && var59 != -1) {
                            class94.field1769[var6++] = 1;
                            if (var47) {
                                class1.field45 = var60;
                            } else {
                                class297.field5269 = var60;
                            }
                            continue;
                        }
                        class94.field1769[var6++] = 0;
                        continue;
                    }
                    if (var510 == 201) {
                        var6--;
                        int var61 = class94.field1769[var6];
                        class8 var62 = class273.method1940(var61, 124);
                        if (var62 == null) {
                            class94.field1769[var6++] = 0;
                        } else {
                            class94.field1769[var6++] = 1;
                            if (var47) {
                                class1.field45 = var62;
                            } else {
                                class297.field5269 = var62;
                            }
                        }
                        continue;
                    }
                } else if (var510 < 500) {
                    if (var510 == 403) {
                        var6 -= 2;
                        int var63 = class94.field1769[var6 + 1];
                        int var64 = class94.field1769[var6];
                        for (int var65 = 0; var65 < class218.field3853.length; var65++) {
                            if (class218.field3853[var65] == var64) {
                                class72.field1420.field4189.method375(var63, (byte) 87, var65);
                                continue label4272;
                            }
                        }
                        int var66 = 0;
                        while (true) {
                            if (var66 >= class323.field5643.length) {
                                continue label4272;
                            }
                            if (class323.field5643[var66] == var64) {
                                class72.field1420.field4189.method375(var63, (byte) 114, var66);
                                continue label4272;
                            }
                            var66++;
                        }
                    }
                    if (var510 == 404) {
                        var6 -= 2;
                        int var67 = class94.field1769[var6 + 1];
                        int var68 = class94.field1769[var6];
                        class72.field1420.field4189.method378(11, var68, var67);
                        continue;
                    }
                    if (var510 == 410) {
                        var6--;
                        boolean var69 = class94.field1769[var6] != 0;
                        class72.field1420.field4189.method379(var69, 16771);
                        continue;
                    }
                } else if (var510 >= 1000 && var510 < 1100 || var510 >= 2000 && var510 < 2100) {
                    class8 var498;
                    if (var510 < 2000) {
                        var498 = var47 ? class1.field45 : class297.field5269;
                    } else {
                        var510 -= 1000;
                        var6--;
                        var498 = class273.method1940(class94.field1769[var6], 118);
                    }
                    if (var510 == 1000) {
                        var6 -= 4;
                        var498.field158 = class94.field1769[var6];
                        var498.field327 = class94.field1769[var6 + 1];
                        int var499 = class94.field1769[var6 + 3];
                        int var500 = class94.field1769[var6 + 2];
                        if (var499 < 0) {
                            var499 = 0;
                        } else if (var499 > 5) {
                            var499 = 5;
                        }
                        var498.field259 = (byte) var499;
                        if (var500 < 0) {
                            var500 = 0;
                        } else if (var500 > 5) {
                            var500 = 5;
                        }
                        var498.field197 = (byte) var500;
                        class50.method426(var498, false);
                        class207.method1526(95, var498);
                        if (var498.field261 == -1) {
                            class72.method632(var498.field299, 18529);
                        }
                        continue;
                    }
                    if (var510 == 1001) {
                        var6 -= 4;
                        var498.field218 = class94.field1769[var6];
                        var498.field204 = class94.field1769[var6 + 1];
                        var498.field229 = 0;
                        var498.field249 = 0;
                        int var501 = class94.field1769[var6 + 3];
                        int var502 = class94.field1769[var6 + 2];
                        if (var502 < 0) {
                            var502 = 0;
                        } else if (var502 > 4) {
                            var502 = 4;
                        }
                        var498.field241 = (byte) var502;
                        if (var501 < 0) {
                            var501 = 0;
                        } else if (var501 > 4) {
                            var501 = 4;
                        }
                        var498.field162 = (byte) var501;
                        class50.method426(var498, false);
                        class207.method1526(58, var498);
                        if (var498.field201 == 0) {
                            class50.method424(var498, false, -1);
                        }
                        continue;
                    }
                    if (var510 == 1003) {
                        var6--;
                        boolean var503 = class94.field1769[var6] == 1;
                        if (var498.field277 != var503) {
                            var498.field277 = var503;
                            class50.method426(var498, false);
                        }
                        if (var498.field261 == -1) {
                            class289.method2065(104, var498.field299);
                        }
                        continue;
                    }
                    if (var510 == 1004) {
                        var6 -= 2;
                        var498.field196 = class94.field1769[var6];
                        var498.field296 = class94.field1769[var6 + 1];
                        class50.method426(var498, false);
                        class207.method1526(-86, var498);
                        if (var498.field201 == 0) {
                            class50.method424(var498, false, -1);
                        }
                        continue;
                    }
                    if (var510 == 1005) {
                        var6--;
                        var498.field262 = class94.field1769[var6] == 1;
                        continue;
                    }
                } else if (!(var510 < 1100 || var510 >= 1200) || !(var510 < 2100 || var510 >= 2200)) {
                    class8 var70;
                    if (var510 >= 2000) {
                        var510 -= 1000;
                        var6--;
                        var70 = class273.method1940(class94.field1769[var6], -74);
                    } else {
                        var70 = var47 ? class1.field45 : class297.field5269;
                    }
                    if (var510 == 1100) {
                        var6 -= 2;
                        var70.field212 = class94.field1769[var6];
                        if (var70.field212 > (var70.field168 - var70.field220)) {
                            var70.field212 = var70.field168 - var70.field220;
                        }
                        if (var70.field212 < 0) {
                            var70.field212 = 0;
                        }
                        var70.field243 = class94.field1769[var6 + 1];
                        if (var70.field243 > (var70.field267 - var70.field297)) {
                            var70.field243 = var70.field267 - var70.field297;
                        }
                        if (var70.field243 < 0) {
                            var70.field243 = 0;
                        }
                        class50.method426(var70, false);
                        if (var70.field261 == -1) {
                            class96.method797(var70.field299, -22296);
                        }
                        continue;
                    }
                    if (var510 == 1101) {
                        var6--;
                        var70.field248 = class94.field1769[var6];
                        class50.method426(var70, false);
                        if (var70.field261 == -1) {
                            class223.method1640(255, var70.field299);
                        }
                        continue;
                    }
                    if (var510 == 1102) {
                        var6--;
                        var70.field169 = class94.field1769[var6] == 1;
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1103) {
                        var6--;
                        var70.field265 = class94.field1769[var6];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1104) {
                        var6--;
                        var70.field321 = class94.field1769[var6];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1105) {
                        var6--;
                        var70.field286 = class94.field1769[var6];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1106) {
                        var6--;
                        var70.field283 = class94.field1769[var6];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1107) {
                        var6--;
                        var70.field157 = class94.field1769[var6] == 1;
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1108) {
                        var70.field238 = 1;
                        var6--;
                        var70.field274 = class94.field1769[var6];
                        class50.method426(var70, false);
                        if (var70.field261 == -1) {
                            class32.method292((byte) 80, var70.field299);
                        }
                        continue;
                    }
                    if (var510 == 1109) {
                        var6 -= 6;
                        var70.field254 = class94.field1769[var6];
                        var70.field291 = class94.field1769[var6 + 1];
                        var70.field237 = class94.field1769[var6 + 2];
                        var70.field227 = class94.field1769[var6 + 3];
                        var70.field242 = class94.field1769[var6 + 4];
                        var70.field225 = class94.field1769[var6 + 5];
                        class50.method426(var70, false);
                        if (var70.field261 == -1) {
                            class311.method2213(-20600, var70.field299);
                            class138.method1072(-25, var70.field299);
                        }
                        continue;
                    }
                    if (var510 == 1110) {
                        var6--;
                        int var71 = class94.field1769[var6];
                        if (var70.field191 != var71) {
                            var70.field217 = 0;
                            var70.field191 = var71;
                            var70.field298 = 1;
                            var70.field222 = 0;
                            class50.method426(var70, false);
                        }
                        if (var70.field261 == -1) {
                            class266.method1902(var70.field299, (byte) -65);
                        }
                        continue;
                    }
                    if (var510 == 1111) {
                        var6--;
                        var70.field282 = class94.field1769[var6] == 1;
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1112) {
                        var7--;
                        class279 var72 = class310.field5505[var7];
                        if (!var72.method1990((byte) 108, var70.field181)) {
                            var70.field181 = var72;
                            class50.method426(var70, false);
                        }
                        if (var70.field261 == -1) {
                            class289.method2060(101, var70.field299);
                        }
                        continue;
                    }
                    if (var510 == 1113) {
                        var6--;
                        var70.field215 = class94.field1769[var6];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1114) {
                        var6 -= 3;
                        var70.field275 = class94.field1769[var6];
                        var70.field186 = class94.field1769[var6 + 1];
                        var70.field174 = class94.field1769[var6 + 2];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1115) {
                        var6--;
                        var70.field221 = class94.field1769[var6] == 1;
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1116) {
                        var6--;
                        var70.field310 = class94.field1769[var6];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1117) {
                        var6--;
                        var70.field235 = class94.field1769[var6];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1118) {
                        var6--;
                        var70.field182 = class94.field1769[var6] == 1;
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1119) {
                        var6--;
                        var70.field317 = class94.field1769[var6] == 1;
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1120) {
                        var6 -= 2;
                        var70.field168 = class94.field1769[var6];
                        var70.field267 = class94.field1769[var6 + 1];
                        class50.method426(var70, false);
                        if (var70.field201 == 0) {
                            class50.method424(var70, false, -1);
                        }
                        continue;
                    }
                    if (var510 == 1121) {
                        var6 -= 2;
                        var70.field184 = (short) class94.field1769[var6];
                        var70.field194 = (short) class94.field1769[var6 + 1];
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1122) {
                        var6--;
                        var70.field206 = class94.field1769[var6] == 1;
                        class50.method426(var70, false);
                        continue;
                    }
                    if (var510 == 1123) {
                        var6--;
                        var70.field225 = class94.field1769[var6];
                        class50.method426(var70, false);
                        if (var70.field261 == -1) {
                            class311.method2213(-20600, var70.field299);
                        }
                        continue;
                    }
                } else if (!(var510 < 1200 || var510 >= 1300) || !(var510 < 2200 || var510 >= 2300)) {
                    class8 var73;
                    if (var510 >= 2000) {
                        var6--;
                        var73 = class273.method1940(class94.field1769[var6], 119);
                        var510 -= 1000;
                    } else {
                        var73 = var47 ? class1.field45 : class297.field5269;
                    }
                    class50.method426(var73, false);
                    if (var510 == 1200 || var510 == 1205) {
                        var6 -= 2;
                        int var74 = class94.field1769[var6];
                        int var75 = class94.field1769[var6 + 1];
                        if (var73.field261 == -1) {
                            class52.method437(9, var73.field299);
                            class311.method2213(-20600, var73.field299);
                            class138.method1072(-87, var73.field299);
                        }
                        if (var74 == -1) {
                            var73.field238 = 1;
                            var73.field173 = -1;
                            var73.field274 = -1;
                        } else {
                            var73.field234 = var75;
                            var73.field173 = var74;
                            class157 var76 = class220.method1612(-2254, var74);
                            var73.field291 = var76.field2879;
                            if (var510 == 1205) {
                                var73.field301 = false;
                            } else {
                                var73.field301 = true;
                            }
                            var73.field254 = var76.field2882;
                            var73.field237 = var76.field2833;
                            var73.field242 = var76.field2864;
                            var73.field225 = var76.field2821;
                            if (var73.field249 > 0) {
                                var73.field225 = var73.field225 * 32 / var73.field249;
                            } else if (var73.field218 > 0) {
                                var73.field225 = var73.field225 * 32 / var73.field218;
                            }
                            var73.field227 = var76.field2888;
                        }
                        continue;
                    }
                    if (var510 == 1201) {
                        var73.field238 = 2;
                        var6--;
                        var73.field274 = class94.field1769[var6];
                        if (var73.field261 == -1) {
                            class32.method292((byte) 115, var73.field299);
                        }
                        continue;
                    }
                    if (var510 == 1202) {
                        var73.field238 = 3;
                        var73.field274 = class72.field1420.field4189.method371(-97);
                        if (var73.field261 == -1) {
                            class32.method292((byte) -122, var73.field299);
                        }
                        continue;
                    }
                    if (var510 == 1203) {
                        var73.field238 = 6;
                        var6--;
                        var73.field274 = class94.field1769[var6];
                        if (var73.field261 == -1) {
                            class32.method292((byte) 116, var73.field299);
                        }
                        continue;
                    }
                    if (var510 == 1204) {
                        var73.field238 = 5;
                        var6--;
                        var73.field274 = class94.field1769[var6];
                        if (var73.field261 == -1) {
                            class32.method292((byte) 79, var73.field299);
                        }
                        continue;
                    }
                } else if (var510 >= 1300 && var510 < 1400 || var510 >= 2300 && var510 < 2400) {
                    class8 var77;
                    if (var510 >= 2000) {
                        var6--;
                        var77 = class273.method1940(class94.field1769[var6], 122);
                        var510 -= 1000;
                    } else {
                        var77 = var47 ? class1.field45 : class297.field5269;
                    }
                    if (var510 == 1300) {
                        var6--;
                        int var78 = class94.field1769[var6] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var7--;
                            var77.method52(class310.field5505[var7], (byte) -94, var78);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var510 == 1301) {
                        var6 -= 2;
                        int var79 = class94.field1769[var6 + 1];
                        int var80 = class94.field1769[var6];
                        var77.field180 = class103.method868(250, var79, var80);
                        continue;
                    }
                    if (var510 == 1302) {
                        var6--;
                        var77.field318 = class94.field1769[var6] == 1;
                        continue;
                    }
                    if (var510 == 1303) {
                        var6--;
                        var77.field292 = class94.field1769[var6];
                        continue;
                    }
                    if (var510 == 1304) {
                        var6--;
                        var77.field311 = class94.field1769[var6];
                        continue;
                    }
                    if (var510 == 1305) {
                        var7--;
                        var77.field272 = class310.field5505[var7];
                        continue;
                    }
                    if (var510 == 1306) {
                        var7--;
                        var77.field178 = class310.field5505[var7];
                        continue;
                    }
                    if (var510 == 1307) {
                        var77.field273 = null;
                        continue;
                    }
                    if (var510 == 1308) {
                        var6--;
                        var77.field285 = class94.field1769[var6];
                        var6--;
                        var77.field294 = class94.field1769[var6];
                        continue;
                    }
                    if (var510 == 1309) {
                        var6--;
                        int var81 = class94.field1769[var6];
                        var6--;
                        int var82 = class94.field1769[var6];
                        if (var82 >= 1 && var82 <= 10) {
                            var77.method63(var81, var82 - 1, 0);
                        }
                        continue;
                    }
                } else {
                    if (var510 >= 1400 && var510 < 1500 || var510 >= 2400 && var510 < 2500) {
                        class8 var491;
                        if (var510 < 2000) {
                            var491 = var47 ? class1.field45 : class297.field5269;
                        } else {
                            var510 -= 1000;
                            var6--;
                            var491 = class273.method1940(class94.field1769[var6], -71);
                        }
                        var7--;
                        class279 var492 = class310.field5505[var7];
                        int[] var493 = null;
                        if (var492.method1984(8) > 0 && var492.method1973(true, var492.method1984(8) - 1) == 89) {
                            var6--;
                            int var494 = class94.field1769[var6];
                            if (var494 > 0) {
                                var493 = new int[var494];
                                while ((var494--) > 0) {
                                    var6--;
                                    var493[var494] = class94.field1769[var6];
                                }
                            }
                            var492 = var492.method2009((byte) -84, 0, var492.method1984(8) - 1);
                        }
                        Object[] var495 = new Object[var492.method1984(8) + 1];
                        for (int var496 = var495.length - 1; var496 >= 1; var496--) {
                            if (var492.method1973(true, var496 - 1) == 115) {
                                var7--;
                                var495[var496] = class310.field5505[var7];
                            } else {
                                var6--;
                                var495[var496] = Integer.valueOf(class94.field1769[var6]);
                            }
                        }
                        var6--;
                        int var497 = class94.field1769[var6];
                        if (var497 == -1) {
                            var495 = null;
                        } else {
                            var495[0] = Integer.valueOf(var497);
                        }
                        if (var510 == 1400) {
                            var491.field288 = var495;
                        } else if (var510 == 1401) {
                            var491.field165 = var495;
                        } else if (var510 == 1402) {
                            var491.field203 = var495;
                        } else if (var510 == 1403) {
                            var491.field331 = var495;
                        } else if (var510 == 1404) {
                            var491.field271 = var495;
                        } else if (var510 == 1405) {
                            var491.field309 = var495;
                        } else if (var510 == 1406) {
                            var491.field278 = var495;
                        } else if (var510 == 1407) {
                            var491.field250 = var493;
                            var491.field224 = var495;
                        } else if (var510 == 1408) {
                            var491.field328 = var495;
                        } else if (var510 == 1409) {
                            var491.field233 = var495;
                        } else if (var510 == 1410) {
                            var491.field330 = var495;
                        } else if (var510 == 1411) {
                            var491.field188 = var495;
                        } else if (var510 == 1412) {
                            var491.field307 = var495;
                        } else if (var510 == 1414) {
                            var491.field316 = var493;
                            var491.field175 = var495;
                        } else if (var510 == 1415) {
                            var491.field312 = var493;
                            var491.field256 = var495;
                        } else if (var510 == 1416) {
                            var491.field156 = var495;
                        } else if (var510 == 1417) {
                            var491.field211 = var495;
                        } else if (var510 == 1418) {
                            var491.field268 = var495;
                        } else if (var510 == 1419) {
                            var491.field266 = var495;
                        } else if (var510 == 1420) {
                            var491.field245 = var495;
                        } else if (var510 == 1421) {
                            var491.field287 = var495;
                        } else if (var510 == 1422) {
                            var491.field257 = var495;
                        } else if (var510 == 1423) {
                            var491.field219 = var495;
                        } else if (var510 == 1424) {
                            var491.field210 = var495;
                        } else if (var510 == 1425) {
                            var491.field185 = var495;
                        } else if (var510 == 1426) {
                            var491.field228 = var495;
                        } else if (var510 == 1427) {
                            var491.field270 = var495;
                        } else if (var510 == 1428) {
                            var491.field284 = var495;
                            var491.field199 = var493;
                        } else if (var510 == 1429) {
                            var491.field166 = var493;
                            var491.field172 = var495;
                        }
                        var491.field164 = true;
                        continue;
                    }
                    if (var510 < 1600) {
                        class8 var490 = var47 ? class1.field45 : class297.field5269;
                        if (var510 == 1500) {
                            class94.field1769[var6++] = var490.field167;
                            continue;
                        }
                        if (var510 == 1501) {
                            class94.field1769[var6++] = var490.field264;
                            continue;
                        }
                        if (var510 == 1502) {
                            class94.field1769[var6++] = var490.field220;
                            continue;
                        }
                        if (var510 == 1503) {
                            class94.field1769[var6++] = var490.field297;
                            continue;
                        }
                        if (var510 == 1504) {
                            class94.field1769[var6++] = var490.field277 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 1505) {
                            class94.field1769[var6++] = var490.field324;
                            continue;
                        }
                    } else if (var510 < 1700) {
                        class8 var83 = var47 ? class1.field45 : class297.field5269;
                        if (var510 == 1600) {
                            class94.field1769[var6++] = var83.field212;
                            continue;
                        }
                        if (var510 == 1601) {
                            class94.field1769[var6++] = var83.field243;
                            continue;
                        }
                        if (var510 == 1602) {
                            class310.field5505[var7++] = var83.field181;
                            continue;
                        }
                        if (var510 == 1603) {
                            class94.field1769[var6++] = var83.field168;
                            continue;
                        }
                        if (var510 == 1604) {
                            class94.field1769[var6++] = var83.field267;
                            continue;
                        }
                        if (var510 == 1605) {
                            class94.field1769[var6++] = var83.field225;
                            continue;
                        }
                        if (var510 == 1606) {
                            class94.field1769[var6++] = var83.field237;
                            continue;
                        }
                        if (var510 == 1607) {
                            class94.field1769[var6++] = var83.field242;
                            continue;
                        }
                        if (var510 == 1608) {
                            class94.field1769[var6++] = var83.field227;
                            continue;
                        }
                        if (var510 == 1609) {
                            class94.field1769[var6++] = var83.field265;
                            continue;
                        }
                        if (var510 == 1610) {
                            class94.field1769[var6++] = var83.field254;
                            continue;
                        }
                        if (var510 == 1611) {
                            class94.field1769[var6++] = var83.field291;
                            continue;
                        }
                        if (var510 == 1612) {
                            class94.field1769[var6++] = var83.field286;
                            continue;
                        }
                    } else if (var510 < 1800) {
                        class8 var489 = var47 ? class1.field45 : class297.field5269;
                        if (var510 == 1700) {
                            class94.field1769[var6++] = var489.field173;
                            continue;
                        }
                        if (var510 == 1701) {
                            if (var489.field173 == -1) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var489.field234;
                            }
                            continue;
                        }
                        if (var510 == 1702) {
                            class94.field1769[var6++] = var489.field261;
                            continue;
                        }
                    } else if (var510 < 1900) {
                        class8 var487 = var47 ? class1.field45 : class297.field5269;
                        if (var510 == 1800) {
                            class94.field1769[var6++] = client.method1798(var487).method1751((byte) 64);
                            continue;
                        }
                        if (var510 == 1801) {
                            var6--;
                            int var488 = class94.field1769[var6];
                            int var512 = var488 - 1;
                            if (var487.field273 != null && var512 < var487.field273.length && var487.field273[var512] != null) {
                                class310.field5505[var7++] = var487.field273[var512];
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 1802) {
                            if (var487.field272 == null) {
                                class310.field5505[var7++] = class247.field4384;
                            } else {
                                class310.field5505[var7++] = var487.field272;
                            }
                            continue;
                        }
                    } else if (var510 < 2600) {
                        var6--;
                        class8 var486 = class273.method1940(class94.field1769[var6], 123);
                        if (var510 == 2500) {
                            class94.field1769[var6++] = var486.field167;
                            continue;
                        }
                        if (var510 == 2501) {
                            class94.field1769[var6++] = var486.field264;
                            continue;
                        }
                        if (var510 == 2502) {
                            class94.field1769[var6++] = var486.field220;
                            continue;
                        }
                        if (var510 == 2503) {
                            class94.field1769[var6++] = var486.field297;
                            continue;
                        }
                        if (var510 == 2504) {
                            class94.field1769[var6++] = var486.field277 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 2505) {
                            class94.field1769[var6++] = var486.field324;
                            continue;
                        }
                    } else if (var510 < 2700) {
                        var6--;
                        class8 var84 = class273.method1940(class94.field1769[var6], 109);
                        if (var510 == 2600) {
                            class94.field1769[var6++] = var84.field212;
                            continue;
                        }
                        if (var510 == 2601) {
                            class94.field1769[var6++] = var84.field243;
                            continue;
                        }
                        if (var510 == 2602) {
                            class310.field5505[var7++] = var84.field181;
                            continue;
                        }
                        if (var510 == 2603) {
                            class94.field1769[var6++] = var84.field168;
                            continue;
                        }
                        if (var510 == 2604) {
                            class94.field1769[var6++] = var84.field267;
                            continue;
                        }
                        if (var510 == 2605) {
                            class94.field1769[var6++] = var84.field225;
                            continue;
                        }
                        if (var510 == 2606) {
                            class94.field1769[var6++] = var84.field237;
                            continue;
                        }
                        if (var510 == 2607) {
                            class94.field1769[var6++] = var84.field242;
                            continue;
                        }
                        if (var510 == 2608) {
                            class94.field1769[var6++] = var84.field227;
                            continue;
                        }
                        if (var510 == 2609) {
                            class94.field1769[var6++] = var84.field265;
                            continue;
                        }
                        if (var510 == 2610) {
                            class94.field1769[var6++] = var84.field254;
                            continue;
                        }
                        if (var510 == 2611) {
                            class94.field1769[var6++] = var84.field291;
                            continue;
                        }
                        if (var510 == 2612) {
                            class94.field1769[var6++] = var84.field286;
                            continue;
                        }
                    } else if (var510 < 2800) {
                        if (var510 == 2700) {
                            var6--;
                            class8 var476 = class273.method1940(class94.field1769[var6], -60);
                            class94.field1769[var6++] = var476.field173;
                            continue;
                        }
                        if (var510 == 2701) {
                            var6--;
                            class8 var477 = class273.method1940(class94.field1769[var6], -38);
                            if (var477.field173 == -1) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var477.field234;
                            }
                            continue;
                        }
                        if (var510 == 2702) {
                            var6--;
                            int var478 = class94.field1769[var6];
                            class176 var479 = (class176) class226.field3977.method610((long) var478, -1);
                            if (var479 == null) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = 1;
                            }
                            continue;
                        }
                        if (var510 == 2703) {
                            var6--;
                            class8 var480 = class273.method1940(class94.field1769[var6], 106);
                            if (var480.field159 == null) {
                                class94.field1769[var6++] = 0;
                                continue;
                            }
                            int var481 = var480.field159.length;
                            for (int var482 = 0; var482 < var480.field159.length; var482++) {
                                if (var480.field159[var482] == null) {
                                    var481 = var482;
                                    break;
                                }
                            }
                            class94.field1769[var6++] = var481;
                            continue;
                        }
                        if (var510 == 2704 || var510 == 2705) {
                            var6 -= 2;
                            int var483 = class94.field1769[var6];
                            int var484 = class94.field1769[var6 + 1];
                            class176 var485 = (class176) class226.field3977.method610((long) var483, -1);
                            if (var485 != null && var485.field3165 == var484) {
                                class94.field1769[var6++] = 1;
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                    } else if (var510 < 2900) {
                        var6--;
                        class8 var474 = class273.method1940(class94.field1769[var6], 126);
                        if (var510 == 2800) {
                            class94.field1769[var6++] = client.method1798(var474).method1751((byte) 72);
                            continue;
                        }
                        if (var510 == 2801) {
                            var6--;
                            int var475 = class94.field1769[var6];
                            int var511 = var475 - 1;
                            if (var474.field273 != null && var511 < var474.field273.length && var474.field273[var511] != null) {
                                class310.field5505[var7++] = var474.field273[var511];
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 2802) {
                            if (var474.field272 == null) {
                                class310.field5505[var7++] = class247.field4384;
                            } else {
                                class310.field5505[var7++] = var474.field272;
                            }
                            continue;
                        }
                    } else if (var510 < 3200) {
                        if (var510 == 3100) {
                            var7--;
                            class279 var85 = class310.field5505[var7];
                            class59.method532(var85, class247.field4384, 0, 29437);
                            continue;
                        }
                        if (var510 == 3101) {
                            var6 -= 2;
                            class86.method755(class94.field1769[var6], class72.field1420, class94.field1769[var6 + 1], -5815);
                            continue;
                        }
                        if (var510 == 3103) {
                            class138.method1069(-101);
                            continue;
                        }
                        if (var510 == 3104) {
                            class320.field5598++;
                            var7--;
                            class279 var86 = class310.field5505[var7];
                            int var87 = 0;
                            if (var86.method2015(28444)) {
                                var87 = var86.method2011(10);
                            }
                            class314.field5534.method1634(237, 0);
                            class314.field5534.method444((byte) 46, var87);
                            continue;
                        }
                        if (var510 == 3105) {
                            var7--;
                            class279 var88 = class310.field5505[var7];
                            class294.field5256++;
                            class314.field5534.method1634(184, 0);
                            class314.field5534.method490(var88.method2013(118), 14886);
                            continue;
                        }
                        if (var510 == 3106) {
                            class91.field1713++;
                            var7--;
                            class279 var89 = class310.field5505[var7];
                            class314.field5534.method1634(242, 0);
                            class314.field5534.method464(var89.method1984(8) + 1, false);
                            class314.field5534.method481(var89, (byte) 115);
                            continue;
                        }
                        if (var510 == 3107) {
                            var6--;
                            int var90 = class94.field1769[var6];
                            var7--;
                            class279 var91 = class310.field5505[var7];
                            class143.method1097(var91, var90, -2);
                            continue;
                        }
                        if (var510 == 3108) {
                            var6 -= 3;
                            int var92 = class94.field1769[var6];
                            int var93 = class94.field1769[var6 + 1];
                            int var94 = class94.field1769[var6 + 2];
                            class8 var95 = class273.method1940(var94, -124);
                            class285.method2041(var92, (byte) 24, var93, var95);
                            continue;
                        }
                        if (var510 == 3109) {
                            var6 -= 2;
                            int var96 = class94.field1769[var6 + 1];
                            int var97 = class94.field1769[var6];
                            class8 var98 = var47 ? class1.field45 : class297.field5269;
                            class285.method2041(var97, (byte) 24, var96, var98);
                            continue;
                        }
                        if (var510 == 3110) {
                            class63.field1298++;
                            var6--;
                            int var99 = class94.field1769[var6];
                            class314.field5534.method1634(167, 0);
                            class314.field5534.method505(var99, (byte) 7);
                            continue;
                        }
                    } else if (var510 < 3300) {
                        if (var510 == 3200) {
                            var6 -= 3;
                            class167.method1306(class94.field1769[var6 + 2], class94.field1769[var6], (byte) 41, class94.field1769[var6 + 1]);
                            continue;
                        }
                        if (var510 == 3201) {
                            var6--;
                            class167.method1307(class94.field1769[var6], -1);
                            continue;
                        }
                        if (var510 == 3202) {
                            var6 -= 2;
                            class315.method2226(class94.field1769[var6 + 1], -1068, class94.field1769[var6]);
                            continue;
                        }
                    } else if (var510 < 3400) {
                        if (var510 == 3300) {
                            class94.field1769[var6++] = class8.field279;
                            continue;
                        }
                        if (var510 == 3301) {
                            var6 -= 2;
                            int var440 = class94.field1769[var6 + 1];
                            int var441 = class94.field1769[var6];
                            class94.field1769[var6++] = class301.method2138(var440, (byte) -115, var441);
                            continue;
                        }
                        if (var510 == 3302) {
                            var6 -= 2;
                            int var442 = class94.field1769[var6];
                            int var443 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class295.method2094(var443, var442, 0);
                            continue;
                        }
                        if (var510 == 3303) {
                            var6 -= 2;
                            int var444 = class94.field1769[var6 + 1];
                            int var445 = class94.field1769[var6];
                            class94.field1769[var6++] = class155.method1220(var445, -123, var444);
                            continue;
                        }
                        if (var510 == 3304) {
                            var6--;
                            int var446 = class94.field1769[var6];
                            class94.field1769[var6++] = class111.method907(var446, 68).field2451;
                            continue;
                        }
                        if (var510 == 3305) {
                            var6--;
                            int var447 = class94.field1769[var6];
                            class94.field1769[var6++] = class200.field3576[var447];
                            continue;
                        }
                        if (var510 == 3306) {
                            var6--;
                            int var448 = class94.field1769[var6];
                            class94.field1769[var6++] = class104.field1955[var448];
                            continue;
                        }
                        if (var510 == 3307) {
                            var6--;
                            int var449 = class94.field1769[var6];
                            class94.field1769[var6++] = class48.field972[var449];
                            continue;
                        }
                        if (var510 == 3308) {
                            int var450 = class287.field5134;
                            int var451 = (class72.field1420.field86 >> 7) + class112.field2058;
                            int var452 = (class72.field1420.field79 >> 7) + class12.field396;
                            class94.field1769[var6++] = (var450 << 28) + var452 + (var451 << 14);
                            continue;
                        }
                        if (var510 == 3309) {
                            var6--;
                            int var453 = class94.field1769[var6];
                            class94.field1769[var6++] = class52.method442(268421348, var453) >> 14;
                            continue;
                        }
                        if (var510 == 3310) {
                            var6--;
                            int var454 = class94.field1769[var6];
                            class94.field1769[var6++] = var454 >> 28;
                            continue;
                        }
                        if (var510 == 3311) {
                            var6--;
                            int var455 = class94.field1769[var6];
                            class94.field1769[var6++] = class52.method442(16383, var455);
                            continue;
                        }
                        if (var510 == 3312) {
                            class94.field1769[var6++] = class221.field3894 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3313) {
                            var6 -= 2;
                            int var456 = class94.field1769[var6] + 32768;
                            int var457 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class301.method2138(var457, (byte) -119, var456);
                            continue;
                        }
                        if (var510 == 3314) {
                            var6 -= 2;
                            int var458 = class94.field1769[var6] + 32768;
                            int var459 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class295.method2094(var459, var458, 0);
                            continue;
                        }
                        if (var510 == 3315) {
                            var6 -= 2;
                            int var460 = class94.field1769[var6] + 32768;
                            int var461 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class155.method1220(var460, -125, var461);
                            continue;
                        }
                        if (var510 == 3316) {
                            if (class145.field2623 < 2) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = class145.field2623;
                            }
                            continue;
                        }
                        if (var510 == 3317) {
                            class94.field1769[var6++] = class33.field748;
                            continue;
                        }
                        if (var510 == 3318) {
                            class94.field1769[var6++] = class12.field386;
                            continue;
                        }
                        if (var510 == 3321) {
                            class94.field1769[var6++] = class90.field1707;
                            continue;
                        }
                        if (var510 == 3322) {
                            class94.field1769[var6++] = class322.field5628;
                            continue;
                        }
                        if (var510 == 3323) {
                            if (class18.field551 >= 5 && class18.field551 <= 9) {
                                class94.field1769[var6++] = 1;
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 3324) {
                            if (class18.field551 >= 5 && class18.field551 <= 9) {
                                class94.field1769[var6++] = class18.field551;
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 3325) {
                            class94.field1769[var6++] = class165.field2982 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3326) {
                            class94.field1769[var6++] = class72.field1420.field4196;
                            continue;
                        }
                        if (var510 == 3327) {
                            class94.field1769[var6++] = class72.field1420.field4189.field932 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3328) {
                            class94.field1769[var6++] = class179.field3242 && !class196.field3533 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3329) {
                            class94.field1769[var6++] = class248.field4408 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3330) {
                            var6--;
                            int var462 = class94.field1769[var6];
                            class94.field1769[var6++] = class220.method1613((byte) 119, var462);
                            continue;
                        }
                        if (var510 == 3331) {
                            var6 -= 2;
                            int var463 = class94.field1769[var6];
                            int var464 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class226.method1650(false, var464, 120, var463);
                            continue;
                        }
                        if (var510 == 3332) {
                            var6 -= 2;
                            int var465 = class94.field1769[var6 + 1];
                            int var466 = class94.field1769[var6];
                            class94.field1769[var6++] = class226.method1650(true, var465, 39, var466);
                            continue;
                        }
                        if (var510 == 3333) {
                            class94.field1769[var6++] = class162.field2928;
                            continue;
                        }
                        if (var510 == 3335) {
                            class94.field1769[var6++] = class265.field4778;
                            continue;
                        }
                        if (var510 == 3336) {
                            var6 -= 4;
                            int var467 = class94.field1769[var6 + 2];
                            int var468 = class94.field1769[var6 + 1];
                            int var469 = class94.field1769[var6 + 3];
                            int var470 = class94.field1769[var6];
                            int var471 = (var468 << 14) + var470;
                            int var472 = (var467 << 28) + var471;
                            int var473 = var469 + var472;
                            class94.field1769[var6++] = var473;
                            continue;
                        }
                        if (var510 == 3337) {
                            class94.field1769[var6++] = class52.field1077;
                            continue;
                        }
                    } else if (var510 < 3500) {
                        if (var510 == 3400) {
                            var6 -= 2;
                            int var100 = class94.field1769[var6 + 1];
                            int var101 = class94.field1769[var6];
                            class199 var102 = class202.method1496(var101, -121);
                            if (var102.field3563 != 115) {
                            }
                            class310.field5505[var7++] = var102.method1484(var100, (byte) -118);
                            continue;
                        }
                        if (var510 == 3408) {
                            var6 -= 4;
                            int var103 = class94.field1769[var6];
                            int var104 = class94.field1769[var6 + 2];
                            int var105 = class94.field1769[var6 + 1];
                            int var106 = class94.field1769[var6 + 3];
                            class199 var107 = class202.method1496(var104, -124);
                            if (var107.field3556 == var103 && var107.field3563 == var105) {
                                if (var105 == 115) {
                                    class310.field5505[var7++] = var107.method1484(var106, (byte) -118);
                                } else {
                                    class94.field1769[var6++] = var107.method1482(91, var106);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var510 == 3409) {
                            var6 -= 3;
                            int var108 = class94.field1769[var6 + 1];
                            int var109 = class94.field1769[var6 + 2];
                            int var110 = class94.field1769[var6];
                            if (var108 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class199 var111 = class202.method1496(var108, -124);
                            if (var111.field3563 != var110) {
                                throw new RuntimeException("C3409-1");
                            }
                            class94.field1769[var6++] = var111.method1485((byte) -25, var109) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3410) {
                            var6--;
                            int var112 = class94.field1769[var6];
                            var7--;
                            class279 var113 = class310.field5505[var7];
                            if (var112 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class199 var114 = class202.method1496(var112, -120);
                            if (var114.field3563 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class94.field1769[var6++] = var114.method1477(true, var113) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3411) {
                            var6--;
                            int var115 = class94.field1769[var6];
                            class199 var116 = class202.method1496(var115, -127);
                            class94.field1769[var6++] = var116.field3549.method608(false);
                            continue;
                        }
                    } else if (var510 < 3700) {
                        if (var510 == 3600) {
                            if (class92.field1743 == 0) {
                                class94.field1769[var6++] = -2;
                            } else if (class92.field1743 == 1) {
                                class94.field1769[var6++] = -1;
                            } else {
                                class94.field1769[var6++] = class167.field3011;
                            }
                            continue;
                        }
                        if (var510 == 3601) {
                            var6--;
                            int var117 = class94.field1769[var6];
                            if (class92.field1743 == 2 && class167.field3011 > var117) {
                                class310.field5505[var7++] = class100.field1861[var117];
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 3602) {
                            var6--;
                            int var118 = class94.field1769[var6];
                            if (class92.field1743 == 2 && var118 < class167.field3011) {
                                class94.field1769[var6++] = class247.field4383[var118];
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 3603) {
                            var6--;
                            int var119 = class94.field1769[var6];
                            if (class92.field1743 == 2 && class167.field3011 > var119) {
                                class94.field1769[var6++] = class26.field624[var119];
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 3604) {
                            var7--;
                            class279 var120 = class310.field5505[var7];
                            var6--;
                            int var121 = class94.field1769[var6];
                            class202.method1498(var120, (byte) -27, var121);
                            continue;
                        }
                        if (var510 == 3605) {
                            var7--;
                            class279 var122 = class310.field5505[var7];
                            class317.method2241(var122.method2013(119), false);
                            continue;
                        }
                        if (var510 == 3606) {
                            var7--;
                            class279 var123 = class310.field5505[var7];
                            class315.method2231(63, var123.method2013(116));
                            continue;
                        }
                        if (var510 == 3607) {
                            var7--;
                            class279 var124 = class310.field5505[var7];
                            class7.method39(var124.method2013(100), (byte) 15);
                            continue;
                        }
                        if (var510 == 3608) {
                            var7--;
                            class279 var125 = class310.field5505[var7];
                            class63.method557(var125.method2013(121), (byte) 62);
                            continue;
                        }
                        if (var510 == 3609) {
                            var7--;
                            class279 var126 = class310.field5505[var7];
                            if (var126.method1999(class304.field5395, 66) || var126.method1999(class134.field2452, 35)) {
                                var126 = var126.method1988((byte) -125, 7);
                            }
                            class94.field1769[var6++] = class171.method1329(var126, 127) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3610) {
                            var6--;
                            int var127 = class94.field1769[var6];
                            if (class92.field1743 == 2 && var127 < class167.field3011) {
                                class310.field5505[var7++] = class179.field3250[var127];
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 3611) {
                            if (class304.field5394 == null) {
                                class310.field5505[var7++] = class247.field4384;
                            } else {
                                class310.field5505[var7++] = class304.field5394.method2016(-32);
                            }
                            continue;
                        }
                        if (var510 == 3612) {
                            if (class304.field5394 == null) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = class59.field1243;
                            }
                            continue;
                        }
                        if (var510 == 3613) {
                            var6--;
                            int var128 = class94.field1769[var6];
                            if (class304.field5394 != null && var128 < class59.field1243) {
                                class310.field5505[var7++] = class306.field5437[var128].field2410.method2016(-32);
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 3614) {
                            var6--;
                            int var129 = class94.field1769[var6];
                            if (class304.field5394 != null && var129 < class59.field1243) {
                                class94.field1769[var6++] = class306.field5437[var129].field2413;
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 3615) {
                            var6--;
                            int var130 = class94.field1769[var6];
                            if (class304.field5394 != null && var130 < class59.field1243) {
                                class94.field1769[var6++] = class306.field5437[var130].field2411;
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 3616) {
                            class94.field1769[var6++] = class273.field4862;
                            continue;
                        }
                        if (var510 == 3617) {
                            var7--;
                            class279 var131 = class310.field5505[var7];
                            class115.method928((byte) 7, var131);
                            continue;
                        }
                        if (var510 == 3618) {
                            class94.field1769[var6++] = class102.field1901;
                            continue;
                        }
                        if (var510 == 3619) {
                            var7--;
                            class279 var132 = class310.field5505[var7];
                            class172.method1341(-112, var132.method2013(100));
                            continue;
                        }
                        if (var510 == 3620) {
                            class252.method1809((byte) -76);
                            continue;
                        }
                        if (var510 == 3621) {
                            if (class92.field1743 == 0) {
                                class94.field1769[var6++] = -1;
                            } else {
                                class94.field1769[var6++] = class194.field3498;
                            }
                            continue;
                        }
                        if (var510 == 3622) {
                            var6--;
                            int var133 = class94.field1769[var6];
                            if (class92.field1743 != 0 && var133 < class194.field3498) {
                                class310.field5505[var7++] = class72.method631(class59.field1250[var133], 5702).method2016(-32);
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 3623) {
                            var7--;
                            class279 var134 = class310.field5505[var7];
                            if (var134.method1999(class304.field5395, 88) || var134.method1999(class134.field2452, 115)) {
                                var134 = var134.method1988((byte) -94, 7);
                            }
                            class94.field1769[var6++] = class43.method367(var134, false) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3624) {
                            var6--;
                            int var135 = class94.field1769[var6];
                            if (class306.field5437 != null && var135 < class59.field1243 && class306.field5437[var135].field2410.method2010(class72.field1420.field4197, (byte) 102)) {
                                class94.field1769[var6++] = 1;
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 3625) {
                            if (class67.field1324 == null) {
                                class310.field5505[var7++] = class247.field4384;
                            } else {
                                class310.field5505[var7++] = class67.field1324.method2016(-32);
                            }
                            continue;
                        }
                        if (var510 == 3626) {
                            var6--;
                            int var136 = class94.field1769[var6];
                            if (class304.field5394 != null && var136 < class59.field1243) {
                                class310.field5505[var7++] = class306.field5437[var136].field2407;
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 3627) {
                            var6--;
                            int var137 = class94.field1769[var6];
                            if (class92.field1743 == 2 && var137 >= 0 && class167.field3011 > var137) {
                                class94.field1769[var6++] = class87.field1677[var137] ? 1 : 0;
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 3628) {
                            var7--;
                            class279 var138 = class310.field5505[var7];
                            if (var138.method1999(class304.field5395, 99) || var138.method1999(class134.field2452, 24)) {
                                var138 = var138.method1988((byte) -52, 7);
                            }
                            class94.field1769[var6++] = class222.method1629(126, var138);
                            continue;
                        }
                        if (var510 == 3629) {
                            class94.field1769[var6++] = class32.field734;
                            continue;
                        }
                    } else if (var510 < 4000) {
                        if (var510 == 3903) {
                            var6--;
                            int var139 = class94.field1769[var6];
                            class94.field1769[var6++] = class221.field3900[var139].method1206((byte) -101);
                            continue;
                        }
                        if (var510 == 3904) {
                            var6--;
                            int var140 = class94.field1769[var6];
                            class94.field1769[var6++] = class221.field3900[var140].field2760;
                            continue;
                        }
                        if (var510 == 3905) {
                            var6--;
                            int var141 = class94.field1769[var6];
                            class94.field1769[var6++] = class221.field3900[var141].field2765;
                            continue;
                        }
                        if (var510 == 3906) {
                            var6--;
                            int var142 = class94.field1769[var6];
                            class94.field1769[var6++] = class221.field3900[var142].field2768;
                            continue;
                        }
                        if (var510 == 3907) {
                            var6--;
                            int var143 = class94.field1769[var6];
                            class94.field1769[var6++] = class221.field3900[var143].field2762;
                            continue;
                        }
                        if (var510 == 3908) {
                            var6--;
                            int var144 = class94.field1769[var6];
                            class94.field1769[var6++] = class221.field3900[var144].field2756;
                            continue;
                        }
                        if (var510 == 3910) {
                            var6--;
                            int var145 = class94.field1769[var6];
                            int var146 = class221.field3900[var145].method1207(-124);
                            class94.field1769[var6++] = var146 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3911) {
                            var6--;
                            int var147 = class94.field1769[var6];
                            int var148 = class221.field3900[var147].method1207(67);
                            class94.field1769[var6++] = var148 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3912) {
                            var6--;
                            int var149 = class94.field1769[var6];
                            int var150 = class221.field3900[var149].method1207(95);
                            class94.field1769[var6++] = var150 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 3913) {
                            var6--;
                            int var151 = class94.field1769[var6];
                            int var152 = class221.field3900[var151].method1207(93);
                            class94.field1769[var6++] = var152 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var510 < 4100) {
                        if (var510 == 4000) {
                            var6 -= 2;
                            int var153 = class94.field1769[var6 + 1];
                            int var154 = class94.field1769[var6];
                            class94.field1769[var6++] = var153 + var154;
                            continue;
                        }
                        if (var510 == 4001) {
                            var6 -= 2;
                            int var155 = class94.field1769[var6 + 1];
                            int var156 = class94.field1769[var6];
                            class94.field1769[var6++] = var156 - var155;
                            continue;
                        }
                        if (var510 == 4002) {
                            var6 -= 2;
                            int var157 = class94.field1769[var6];
                            int var158 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = var157 * var158;
                            continue;
                        }
                        if (var510 == 4003) {
                            var6 -= 2;
                            int var159 = class94.field1769[var6 + 1];
                            int var160 = class94.field1769[var6];
                            class94.field1769[var6++] = var160 / var159;
                            continue;
                        }
                        if (var510 == 4004) {
                            var6--;
                            int var161 = class94.field1769[var6];
                            class94.field1769[var6++] = (int) (Math.random() * (double) var161);
                            continue;
                        }
                        if (var510 == 4005) {
                            var6--;
                            int var162 = class94.field1769[var6];
                            class94.field1769[var6++] = (int) ((double) (var162 + 1) * Math.random());
                            continue;
                        }
                        if (var510 == 4006) {
                            var6 -= 5;
                            int var163 = class94.field1769[var6];
                            int var164 = class94.field1769[var6 + 1];
                            int var165 = class94.field1769[var6 + 3];
                            int var166 = class94.field1769[var6 + 2];
                            int var167 = class94.field1769[var6 + 4];
                            class94.field1769[var6++] = (var164 - var163) * (var167 - var166) / (var165 - var166) + var163;
                            continue;
                        }
                        if (var510 == 4007) {
                            var6 -= 2;
                            long var168 = (long) class94.field1769[var6];
                            long var170 = (long) class94.field1769[var6 + 1];
                            class94.field1769[var6++] = (int) (var168 * var170 / 100L + var168);
                            continue;
                        }
                        if (var510 == 4008) {
                            var6 -= 2;
                            int var172 = class94.field1769[var6 + 1];
                            int var173 = class94.field1769[var6];
                            class94.field1769[var6++] = class301.method2139(0x1 << var172, var173);
                            continue;
                        }
                        if (var510 == 4009) {
                            var6 -= 2;
                            int var174 = class94.field1769[var6];
                            int var175 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class52.method442(var174, -(0x1 << var175) - 1);
                            continue;
                        }
                        if (var510 == 4010) {
                            var6 -= 2;
                            int var176 = class94.field1769[var6];
                            int var177 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class52.method442(var176, 0x1 << var177) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var510 == 4011) {
                            var6 -= 2;
                            int var178 = class94.field1769[var6 + 1];
                            int var179 = class94.field1769[var6];
                            class94.field1769[var6++] = var179 % var178;
                            continue;
                        }
                        if (var510 == 4012) {
                            var6 -= 2;
                            int var180 = class94.field1769[var6 + 1];
                            int var181 = class94.field1769[var6];
                            if (var181 == 0) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = (int) Math.pow((double) var181, (double) var180);
                            }
                            continue;
                        }
                        if (var510 == 4013) {
                            var6 -= 2;
                            int var182 = class94.field1769[var6];
                            int var183 = class94.field1769[var6 + 1];
                            if (var182 == 0) {
                                class94.field1769[var6++] = 0;
                            } else if (var183 == 0) {
                                class94.field1769[var6++] = Integer.MAX_VALUE;
                            } else {
                                class94.field1769[var6++] = (int) Math.pow((double) var182, 1.0D / (double) var183);
                            }
                            continue;
                        }
                        if (var510 == 4014) {
                            var6 -= 2;
                            int var184 = class94.field1769[var6];
                            int var185 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class52.method442(var184, var185);
                            continue;
                        }
                        if (var510 == 4015) {
                            var6 -= 2;
                            int var186 = class94.field1769[var6];
                            int var187 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class301.method2139(var186, var187);
                            continue;
                        }
                        if (var510 == 4016) {
                            var6 -= 2;
                            int var188 = class94.field1769[var6];
                            int var189 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = var189 <= var188 ? var189 : var188;
                            continue;
                        }
                        if (var510 == 4017) {
                            var6 -= 2;
                            int var190 = class94.field1769[var6];
                            int var191 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = var190 <= var191 ? var191 : var190;
                            continue;
                        }
                        if (var510 == 4018) {
                            var6 -= 3;
                            long var192 = (long) class94.field1769[var6];
                            long var194 = (long) class94.field1769[var6 + 1];
                            long var196 = (long) class94.field1769[var6 + 2];
                            class94.field1769[var6++] = (int) (var192 * var196 / var194);
                            continue;
                        }
                    } else if (var510 < 4200) {
                        if (var510 == 4100) {
                            var7--;
                            class279 var198 = class310.field5505[var7];
                            var6--;
                            int var199 = class94.field1769[var6];
                            class310.field5505[var7++] = class115.method929(new class279[] { var198, class191.method1447(5, var199) }, (byte) 60);
                            continue;
                        }
                        if (var510 == 4101) {
                            var7 -= 2;
                            class279 var200 = class310.field5505[var7];
                            class279 var201 = class310.field5505[var7 + 1];
                            class310.field5505[var7++] = class115.method929(new class279[] { var200, var201 }, (byte) 60);
                            continue;
                        }
                        if (var510 == 4102) {
                            var7--;
                            class279 var202 = class310.field5505[var7];
                            var6--;
                            int var203 = class94.field1769[var6];
                            class310.field5505[var7++] = class115.method929(new class279[] { var202, class54.method509(false, var203, true) }, (byte) 60);
                            continue;
                        }
                        if (var510 == 4103) {
                            var7--;
                            class279 var204 = class310.field5505[var7];
                            class310.field5505[var7++] = var204.method2002((byte) -94);
                            continue;
                        }
                        if (var510 == 4104) {
                            var6--;
                            int var205 = class94.field1769[var6];
                            long var206 = ((long) var205 + 11745L) * 86400000L;
                            class321.field5606.setTime(new Date(var206));
                            int var208 = class321.field5606.get(5);
                            int var209 = class321.field5606.get(2);
                            int var210 = class321.field5606.get(1);
                            class310.field5505[var7++] = class115.method929(new class279[] { class191.method1447(5, var208), class194.field3496, class86.field1654[var209], class194.field3496, class191.method1447(5, var210) }, (byte) 60);
                            continue;
                        }
                        if (var510 == 4105) {
                            var7 -= 2;
                            class279 var211 = class310.field5505[var7 + 1];
                            class279 var212 = class310.field5505[var7];
                            if (class72.field1420.field4189 != null && class72.field1420.field4189.field932) {
                                class310.field5505[var7++] = var211;
                                continue;
                            }
                            class310.field5505[var7++] = var212;
                            continue;
                        }
                        if (var510 == 4106) {
                            var6--;
                            int var213 = class94.field1769[var6];
                            class310.field5505[var7++] = class191.method1447(5, var213);
                            continue;
                        }
                        if (var510 == 4107) {
                            var7 -= 2;
                            class94.field1769[var6++] = class310.field5505[var7].method1968(82, class310.field5505[var7 + 1]);
                            continue;
                        }
                        if (var510 == 4108) {
                            var6 -= 2;
                            var7--;
                            class279 var214 = class310.field5505[var7];
                            int var215 = class94.field1769[var6];
                            int var216 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class55.method515(1, var216).method413(var214, var215);
                            continue;
                        }
                        if (var510 == 4109) {
                            var6 -= 2;
                            int var217 = class94.field1769[var6 + 1];
                            var7--;
                            class279 var218 = class310.field5505[var7];
                            int var219 = class94.field1769[var6];
                            class94.field1769[var6++] = class55.method515(1, var217).method405(var218, var219);
                            continue;
                        }
                        if (var510 == 4110) {
                            var7 -= 2;
                            class279 var220 = class310.field5505[var7];
                            class279 var221 = class310.field5505[var7 + 1];
                            var6--;
                            if (class94.field1769[var6] == 1) {
                                class310.field5505[var7++] = var220;
                            } else {
                                class310.field5505[var7++] = var221;
                            }
                            continue;
                        }
                        if (var510 == 4111) {
                            var7--;
                            class279 var222 = class310.field5505[var7];
                            class310.field5505[var7++] = class49.method414(var222);
                            continue;
                        }
                        if (var510 == 4112) {
                            var7--;
                            class279 var223 = class310.field5505[var7];
                            var6--;
                            int var224 = class94.field1769[var6];
                            if (var224 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class310.field5505[var7++] = var223.method1986(-102, var224);
                            continue;
                        }
                        if (var510 == 4113) {
                            var6--;
                            int var225 = class94.field1769[var6];
                            class94.field1769[var6++] = class326.method2285((byte) -117, var225) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 4114) {
                            var6--;
                            int var226 = class94.field1769[var6];
                            class94.field1769[var6++] = class119.method948(-102, var226) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 4115) {
                            var6--;
                            int var227 = class94.field1769[var6];
                            class94.field1769[var6++] = class135.method1057((byte) -80, var227) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 4116) {
                            var6--;
                            int var228 = class94.field1769[var6];
                            class94.field1769[var6++] = class211.method1548(var228, -21732) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 4117) {
                            var7--;
                            class279 var229 = class310.field5505[var7];
                            if (var229 == null) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var229.method1984(8);
                            }
                            continue;
                        }
                        if (var510 == 4118) {
                            var7--;
                            class279 var230 = class310.field5505[var7];
                            var6 -= 2;
                            int var231 = class94.field1769[var6 + 1];
                            int var232 = class94.field1769[var6];
                            class310.field5505[var7++] = var230.method2009((byte) -84, var232, var231);
                            continue;
                        }
                        if (var510 == 4119) {
                            var7--;
                            class279 var233 = class310.field5505[var7];
                            class279 var234 = class247.method1774(var233.method1984(8), 4);
                            boolean var235 = false;
                            for (int var236 = 0; var233.method1984(8) > var236; var236++) {
                                int var237 = var233.method1973(true, var236);
                                if (var237 == 60) {
                                    var235 = true;
                                } else if (var237 == 62) {
                                    var235 = false;
                                } else if (!var235) {
                                    var234.method1985((byte) 7, var237);
                                }
                            }
                            var234.method1992(-107);
                            class310.field5505[var7++] = var234;
                            continue;
                        }
                        if (var510 == 4120) {
                            var7--;
                            class279 var238 = class310.field5505[var7];
                            var6 -= 2;
                            int var239 = class94.field1769[var6];
                            int var240 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = var238.method2014(var239, var240, (byte) -124);
                            continue;
                        }
                        if (var510 == 4121) {
                            var7 -= 2;
                            class279 var241 = class310.field5505[var7];
                            var6--;
                            int var242 = class94.field1769[var6];
                            class279 var243 = class310.field5505[var7 + 1];
                            class94.field1769[var6++] = var241.method1979(var243, 31726, var242);
                            continue;
                        }
                        if (var510 == 4122) {
                            var6--;
                            int var244 = class94.field1769[var6];
                            class94.field1769[var6++] = class117.method941(102, var244);
                            continue;
                        }
                        if (var510 == 4123) {
                            var6--;
                            int var245 = class94.field1769[var6];
                            class94.field1769[var6++] = class252.method1806(var245, -124);
                            continue;
                        }
                        if (var510 == 4124) {
                            var6--;
                            boolean var246 = class94.field1769[var6] != 0;
                            var6--;
                            int var247 = class94.field1769[var6];
                            class310.field5505[var7++] = class90.method778(var246, (long) var247, class265.field4778, 0, (byte) -49);
                            continue;
                        }
                    } else if (var510 < 4300) {
                        if (var510 == 4200) {
                            var6--;
                            int var248 = class94.field1769[var6];
                            class310.field5505[var7++] = class220.method1612(-2254, var248).field2861;
                            continue;
                        }
                        if (var510 == 4201) {
                            var6 -= 2;
                            int var249 = class94.field1769[var6 + 1];
                            int var250 = class94.field1769[var6];
                            class157 var251 = class220.method1612(-2254, var250);
                            if (var249 >= 1 && var249 <= 5 && var251.field2846[var249 - 1] != null) {
                                class310.field5505[var7++] = var251.field2846[var249 - 1];
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 4202) {
                            var6 -= 2;
                            int var252 = class94.field1769[var6 + 1];
                            int var253 = class94.field1769[var6];
                            class157 var254 = class220.method1612(-2254, var253);
                            if (var252 >= 1 && var252 <= 5 && var254.field2886[var252 - 1] != null) {
                                class310.field5505[var7++] = var254.field2886[var252 - 1];
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 4203) {
                            var6--;
                            int var255 = class94.field1769[var6];
                            class94.field1769[var6++] = class220.method1612(-2254, var255).field2831;
                            continue;
                        }
                        if (var510 == 4204) {
                            var6--;
                            int var256 = class94.field1769[var6];
                            class94.field1769[var6++] = class220.method1612(-2254, var256).field2848 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 4205) {
                            var6--;
                            int var257 = class94.field1769[var6];
                            class157 var258 = class220.method1612(-2254, var257);
                            if (var258.field2884 == -1 && var258.field2855 >= 0) {
                                class94.field1769[var6++] = var258.field2855;
                                continue;
                            }
                            class94.field1769[var6++] = var257;
                            continue;
                        }
                        if (var510 == 4206) {
                            var6--;
                            int var259 = class94.field1769[var6];
                            class157 var260 = class220.method1612(-2254, var259);
                            if (var260.field2884 >= 0 && var260.field2855 >= 0) {
                                class94.field1769[var6++] = var260.field2855;
                                continue;
                            }
                            class94.field1769[var6++] = var259;
                            continue;
                        }
                        if (var510 == 4207) {
                            var6--;
                            int var261 = class94.field1769[var6];
                            class94.field1769[var6++] = class220.method1612(-2254, var261).field2843 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 4208) {
                            var6 -= 2;
                            int var262 = class94.field1769[var6 + 1];
                            int var263 = class94.field1769[var6];
                            class205 var264 = class247.method1768(var262, (byte) 119);
                            if (var264.method1518(8)) {
                                class310.field5505[var7++] = class220.method1612(-2254, var263).method1236(var264.field3640, 0, var262);
                            } else {
                                class94.field1769[var6++] = class220.method1612(-2254, var263).method1238((byte) -8, var262, var264.field3651);
                            }
                            continue;
                        }
                        if (var510 == 4210) {
                            var7--;
                            class279 var265 = class310.field5505[var7];
                            var6--;
                            int var266 = class94.field1769[var6];
                            class44.method381(2, var266 == 1, var265);
                            class94.field1769[var6++] = class309.field5484;
                            continue;
                        }
                        if (var510 == 4211) {
                            if (class84.field1602 != null && class309.field5484 > class280.field5004) {
                                class94.field1769[var6++] = class52.method442(class84.field1602[class280.field5004++], 65535);
                                continue;
                            }
                            class94.field1769[var6++] = -1;
                            continue;
                        }
                        if (var510 == 4212) {
                            class280.field5004 = 0;
                            continue;
                        }
                    } else if (var510 < 4400) {
                        if (var510 == 4300) {
                            var6 -= 2;
                            int var267 = class94.field1769[var6 + 1];
                            int var268 = class94.field1769[var6];
                            class205 var269 = class247.method1768(var267, (byte) 41);
                            if (var269.method1518(8)) {
                                class310.field5505[var7++] = class150.method1198(var268, 70).method1000(var269.field3640, (byte) -120, var267);
                            } else {
                                class94.field1769[var6++] = class150.method1198(var268, 59).method996(-5017, var267, var269.field3651);
                            }
                            continue;
                        }
                    } else if (var510 < 4500) {
                        if (var510 == 4400) {
                            var6 -= 2;
                            int var270 = class94.field1769[var6];
                            int var271 = class94.field1769[var6 + 1];
                            class205 var272 = class247.method1768(var271, (byte) 106);
                            if (var272.method1518(8)) {
                                class310.field5505[var7++] = class252.method1808(var270, (byte) 4).method1898(var271, var272.field3640, 0);
                            } else {
                                class94.field1769[var6++] = class252.method1808(var270, (byte) 4).method1900(var271, 119, var272.field3651);
                            }
                            continue;
                        }
                    } else if (var510 < 4600) {
                        if (var510 == 4500) {
                            var6 -= 2;
                            int var273 = class94.field1769[var6];
                            int var274 = class94.field1769[var6 + 1];
                            class205 var275 = class247.method1768(var274, (byte) 122);
                            if (var275.method1518(8)) {
                                class310.field5505[var7++] = class92.method787((byte) 58, var273).method1061(500, var275.field3640, var274);
                            } else {
                                class94.field1769[var6++] = class92.method787((byte) 58, var273).method1055(0, var274, var275.field3651);
                            }
                            continue;
                        }
                    } else if (var510 < 5100) {
                        if (var510 == 5000) {
                            class94.field1769[var6++] = class314.field5536;
                            continue;
                        }
                        if (var510 == 5001) {
                            class101.field1886++;
                            var6 -= 3;
                            class314.field5536 = class94.field1769[var6];
                            class139.field2534 = class94.field1769[var6 + 1];
                            class174.field3137 = class94.field1769[var6 + 2];
                            class314.field5534.method1634(72, 0);
                            class314.field5534.method464(class314.field5536, false);
                            class314.field5534.method464(class139.field2534, false);
                            class314.field5534.method464(class174.field3137, false);
                            continue;
                        }
                        if (var510 == 5002) {
                            class16.field515++;
                            var6 -= 2;
                            int var375 = class94.field1769[var6];
                            var7--;
                            class279 var376 = class310.field5505[var7];
                            int var377 = class94.field1769[var6 + 1];
                            class314.field5534.method1634(146, 0);
                            class314.field5534.method490(var376.method2013(114), 14886);
                            class314.field5534.method464(var375 - 1, false);
                            class314.field5534.method464(var377, false);
                            continue;
                        }
                        if (var510 == 5003) {
                            var6--;
                            int var378 = class94.field1769[var6];
                            class279 var379 = null;
                            if (var378 < 100) {
                                var379 = class57.field1216[var378];
                            }
                            if (var379 == null) {
                                var379 = class247.field4384;
                            }
                            class310.field5505[var7++] = var379;
                            continue;
                        }
                        if (var510 == 5004) {
                            var6--;
                            int var380 = class94.field1769[var6];
                            int var381 = -1;
                            if (var380 < 100 && class57.field1216[var380] != null) {
                                var381 = class48.field977[var380];
                            }
                            class94.field1769[var6++] = var381;
                            continue;
                        }
                        if (var510 == 5005) {
                            class94.field1769[var6++] = class139.field2534;
                            continue;
                        }
                        if (var510 == 5008) {
                            var7--;
                            class279 var382 = class310.field5505[var7];
                            if (var382.method1999(class84.field1596, 92)) {
                                class52.method438(var382, -204);
                                continue;
                            }
                            if (class145.field2623 == 0 && (class179.field3242 && !class196.field3533 || class248.field4408)) {
                                continue;
                            }
                            class279 var383 = var382.method2002((byte) -94);
                            class125.field2302++;
                            byte var384 = 0;
                            if (var383.method1999(class67.field1328, 58)) {
                                var384 = 0;
                                var382 = var382.method1988((byte) -45, class67.field1328.method1984(8));
                            } else if (var383.method1999(class191.field3462, 88)) {
                                var382 = var382.method1988((byte) -99, class191.field3462.method1984(8));
                                var384 = 1;
                            } else if (var383.method1999(class7.field134, 45)) {
                                var384 = 2;
                                var382 = var382.method1988((byte) -62, class7.field134.method1984(8));
                            } else if (var383.method1999(class310.field5501, 109)) {
                                var382 = var382.method1988((byte) -60, class310.field5501.method1984(8));
                                var384 = 3;
                            } else if (var383.method1999(class163.field2938, 61)) {
                                var382 = var382.method1988((byte) -45, class163.field2938.method1984(8));
                                var384 = 4;
                            } else if (var383.method1999(class7.field135, 59)) {
                                var384 = 5;
                                var382 = var382.method1988((byte) -98, class7.field135.method1984(8));
                            } else if (var383.method1999(class254.field4543, 79)) {
                                var382 = var382.method1988((byte) -58, class254.field4543.method1984(8));
                                var384 = 6;
                            } else if (var383.method1999(class283.field5065, 62)) {
                                var384 = 7;
                                var382 = var382.method1988((byte) -106, class283.field5065.method1984(8));
                            } else if (var383.method1999(class111.field2047, 68)) {
                                var384 = 8;
                                var382 = var382.method1988((byte) -93, class111.field2047.method1984(8));
                            } else if (var383.method1999(class54.field1172, 116)) {
                                var382 = var382.method1988((byte) -85, class54.field1172.method1984(8));
                                var384 = 9;
                            } else if (var383.method1999(class5.field120, 74)) {
                                var382 = var382.method1988((byte) -39, class5.field120.method1984(8));
                                var384 = 10;
                            } else if (var383.method1999(class110.field2033, 49)) {
                                var382 = var382.method1988((byte) -86, class110.field2033.method1984(8));
                                var384 = 11;
                            } else if (class265.field4778 != 0) {
                                if (var383.method1999(class67.field1327, 66)) {
                                    var384 = 0;
                                    var382 = var382.method1988((byte) -54, class67.field1327.method1984(8));
                                } else if (var383.method1999(class191.field3431, 120)) {
                                    var382 = var382.method1988((byte) -115, class191.field3431.method1984(8));
                                    var384 = 1;
                                } else if (var383.method1999(class7.field140, 124)) {
                                    var384 = 2;
                                    var382 = var382.method1988((byte) -48, class7.field140.method1984(8));
                                } else if (var383.method1999(class310.field5494, 123)) {
                                    var382 = var382.method1988((byte) -101, class310.field5494.method1984(8));
                                    var384 = 3;
                                } else if (var383.method1999(class163.field2933, 79)) {
                                    var382 = var382.method1988((byte) -58, class163.field2933.method1984(8));
                                    var384 = 4;
                                } else if (var383.method1999(class7.field145, 34)) {
                                    var382 = var382.method1988((byte) -108, class7.field145.method1984(8));
                                    var384 = 5;
                                } else if (var383.method1999(class254.field4541, 50)) {
                                    var384 = 6;
                                    var382 = var382.method1988((byte) -53, class254.field4541.method1984(8));
                                } else if (var383.method1999(class283.field5067, 33)) {
                                    var382 = var382.method1988((byte) -39, class283.field5067.method1984(8));
                                    var384 = 7;
                                } else if (var383.method1999(class111.field2052, 118)) {
                                    var382 = var382.method1988((byte) -116, class111.field2052.method1984(8));
                                    var384 = 8;
                                } else if (var383.method1999(class54.field1175, 65)) {
                                    var382 = var382.method1988((byte) -99, class54.field1175.method1984(8));
                                    var384 = 9;
                                } else if (var383.method1999(class5.field113, 70)) {
                                    var384 = 10;
                                    var382 = var382.method1988((byte) -45, class5.field113.method1984(8));
                                } else if (var383.method1999(class110.field2026, 93)) {
                                    var382 = var382.method1988((byte) -96, class110.field2026.method1984(8));
                                    var384 = 11;
                                }
                            }
                            class279 var385 = var382.method2002((byte) -94);
                            byte var386 = 0;
                            if (var385.method1999(class74.field1465, 24)) {
                                var386 = 1;
                                var382 = var382.method1988((byte) -109, class74.field1465.method1984(8));
                            } else if (var385.method1999(class261.field4654, 86)) {
                                var382 = var382.method1988((byte) -60, class261.field4654.method1984(8));
                                var386 = 2;
                            } else if (var385.method1999(class231.field4049, 27)) {
                                var386 = 3;
                                var382 = var382.method1988((byte) -57, class231.field4049.method1984(8));
                            } else if (var385.method1999(class252.field4497, 84)) {
                                var386 = 4;
                                var382 = var382.method1988((byte) -46, class252.field4497.method1984(8));
                            } else if (var385.method1999(class98.field1838, 93)) {
                                var382 = var382.method1988((byte) -77, class98.field1838.method1984(8));
                                var386 = 5;
                            } else if (class265.field4778 != 0) {
                                if (var385.method1999(class74.field1457, 26)) {
                                    var382 = var382.method1988((byte) -66, class74.field1457.method1984(8));
                                    var386 = 1;
                                } else if (var385.method1999(class261.field4637, 29)) {
                                    var386 = 2;
                                    var382 = var382.method1988((byte) -75, class261.field4637.method1984(8));
                                } else if (var385.method1999(class231.field4050, 102)) {
                                    var386 = 3;
                                    var382 = var382.method1988((byte) -46, class231.field4050.method1984(8));
                                } else if (var385.method1999(class252.field4502, 111)) {
                                    var382 = var382.method1988((byte) -125, class252.field4502.method1984(8));
                                    var386 = 4;
                                } else if (var385.method1999(class98.field1842, 113)) {
                                    var382 = var382.method1988((byte) -76, class98.field1842.method1984(8));
                                    var386 = 5;
                                }
                            }
                            class314.field5534.method1634(235, 0);
                            class314.field5534.method464(0, false);
                            int var387 = class314.field5534.field1142;
                            class314.field5534.method464(var384, false);
                            class314.field5534.method464(var386, false);
                            class320.method2256(var382, class314.field5534, 14);
                            class314.field5534.method503((byte) 116, class314.field5534.field1142 - var387);
                            continue;
                        }
                        if (var510 == 5009) {
                            var7 -= 2;
                            class279 var388 = class310.field5505[var7 + 1];
                            class279 var389 = class310.field5505[var7];
                            if (class145.field2623 != 0 || (!class179.field3242 || class196.field3533) && !class248.field4408) {
                                class189.field3413++;
                                class314.field5534.method1634(47, 0);
                                class314.field5534.method464(0, false);
                                int var390 = class314.field5534.field1142;
                                class314.field5534.method490(var389.method2013(127), 14886);
                                class320.method2256(var388, class314.field5534, 14);
                                class314.field5534.method503((byte) 123, class314.field5534.field1142 - var390);
                            }
                            continue;
                        }
                        if (var510 == 5010) {
                            class279 var391 = null;
                            var6--;
                            int var392 = class94.field1769[var6];
                            if (var392 < 100) {
                                var391 = class275.field4886[var392];
                            }
                            if (var391 == null) {
                                var391 = class247.field4384;
                            }
                            class310.field5505[var7++] = var391;
                            continue;
                        }
                        if (var510 == 5011) {
                            var6--;
                            int var393 = class94.field1769[var6];
                            class279 var394 = null;
                            if (var393 < 100) {
                                var394 = class88.field1682[var393];
                            }
                            if (var394 == null) {
                                var394 = class247.field4384;
                            }
                            class310.field5505[var7++] = var394;
                            continue;
                        }
                        if (var510 == 5012) {
                            var6--;
                            int var395 = class94.field1769[var6];
                            int var396 = -1;
                            if (var395 < 100) {
                                var396 = class217.field3835[var395];
                            }
                            class94.field1769[var6++] = var396;
                            continue;
                        }
                        if (var510 == 5015) {
                            class279 var397;
                            if (class72.field1420 == null || class72.field1420.field4197 == null) {
                                var397 = class60.field1264;
                            } else {
                                var397 = class72.field1420.method1718(4);
                            }
                            class310.field5505[var7++] = var397;
                            continue;
                        }
                        if (var510 == 5016) {
                            class94.field1769[var6++] = class174.field3137;
                            continue;
                        }
                        if (var510 == 5017) {
                            class94.field1769[var6++] = class170.field3067;
                            continue;
                        }
                        if (var510 == 5050) {
                            var6--;
                            int var398 = class94.field1769[var6];
                            class310.field5505[var7++] = class120.method955(false, var398).field5139;
                            continue;
                        }
                        if (var510 == 5051) {
                            var6--;
                            int var399 = class94.field1769[var6];
                            class289 var400 = class120.method955(false, var399);
                            if (var400.field5151 == null) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var400.field5151.length;
                            }
                            continue;
                        }
                        if (var510 == 5052) {
                            var6 -= 2;
                            int var401 = class94.field1769[var6];
                            int var402 = class94.field1769[var6 + 1];
                            class289 var403 = class120.method955(false, var401);
                            int var404 = var403.field5151[var402];
                            class94.field1769[var6++] = var404;
                            continue;
                        }
                        if (var510 == 5053) {
                            var6--;
                            int var405 = class94.field1769[var6];
                            class289 var406 = class120.method955(false, var405);
                            if (var406.field5153 == null) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var406.field5153.length;
                            }
                            continue;
                        }
                        if (var510 == 5054) {
                            var6 -= 2;
                            int var407 = class94.field1769[var6 + 1];
                            int var408 = class94.field1769[var6];
                            class94.field1769[var6++] = class120.method955(false, var408).field5153[var407];
                            continue;
                        }
                        if (var510 == 5055) {
                            var6--;
                            int var409 = class94.field1769[var6];
                            class310.field5505[var7++] = class230.method1666((byte) -19, var409).method2180(68);
                            continue;
                        }
                        if (var510 == 5056) {
                            var6--;
                            int var410 = class94.field1769[var6];
                            class307 var411 = class230.method1666((byte) -19, var410);
                            if (var411.field5467 == null) {
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var411.field5467.length;
                            }
                            continue;
                        }
                        if (var510 == 5057) {
                            var6 -= 2;
                            int var412 = class94.field1769[var6];
                            int var413 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class230.method1666((byte) -19, var412).field5467[var413];
                            continue;
                        }
                        if (var510 == 5058) {
                            class20.field576 = new class282();
                            var6--;
                            class20.field576.field5038 = class94.field1769[var6];
                            class20.field576.field5033 = class230.method1666((byte) -19, class20.field576.field5038);
                            class20.field576.field5041 = new int[class20.field576.field5033.method2179(0)];
                            continue;
                        }
                        if (var510 == 5059) {
                            class314.field5534.method1634(22, 0);
                            class121.field2174++;
                            class314.field5534.method464(0, false);
                            int var414 = class314.field5534.field1142;
                            class314.field5534.method464(0, false);
                            class314.field5534.method505(class20.field576.field5038, (byte) 7);
                            class20.field576.field5033.method2184(class20.field576.field5041, class314.field5534, -24557);
                            class314.field5534.method503((byte) 127, class314.field5534.field1142 - var414);
                            continue;
                        }
                        if (var510 == 5060) {
                            var7--;
                            class279 var415 = class310.field5505[var7];
                            class314.field5534.method1634(239, 0);
                            class314.field5534.method464(0, false);
                            class173.field3119++;
                            int var416 = class314.field5534.field1142;
                            class314.field5534.method490(var415.method2013(116), 14886);
                            class314.field5534.method505(class20.field576.field5038, (byte) 7);
                            class20.field576.field5033.method2184(class20.field576.field5041, class314.field5534, -24557);
                            class314.field5534.method503((byte) -76, class314.field5534.field1142 - var416);
                            continue;
                        }
                        if (var510 == 5061) {
                            class314.field5534.method1634(22, 0);
                            class121.field2174++;
                            class314.field5534.method464(0, false);
                            int var417 = class314.field5534.field1142;
                            class314.field5534.method464(1, false);
                            class314.field5534.method505(class20.field576.field5038, (byte) 7);
                            class20.field576.field5033.method2184(class20.field576.field5041, class314.field5534, -24557);
                            class314.field5534.method503((byte) -15, class314.field5534.field1142 - var417);
                            continue;
                        }
                        if (var510 == 5062) {
                            var6 -= 2;
                            int var418 = class94.field1769[var6];
                            int var419 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class120.method955(false, var418).field5144[var419];
                            continue;
                        }
                        if (var510 == 5063) {
                            var6 -= 2;
                            int var420 = class94.field1769[var6];
                            int var421 = class94.field1769[var6 + 1];
                            class94.field1769[var6++] = class120.method955(false, var420).field5140[var421];
                            continue;
                        }
                        if (var510 == 5064) {
                            var6 -= 2;
                            int var422 = class94.field1769[var6];
                            int var423 = class94.field1769[var6 + 1];
                            if (var423 == -1) {
                                class94.field1769[var6++] = -1;
                            } else {
                                class94.field1769[var6++] = class120.method955(false, var422).method2068(false, var423);
                            }
                            continue;
                        }
                        if (var510 == 5065) {
                            var6 -= 2;
                            int var424 = class94.field1769[var6];
                            int var425 = class94.field1769[var6 + 1];
                            if (var425 == -1) {
                                class94.field1769[var6++] = -1;
                            } else {
                                class94.field1769[var6++] = class120.method955(false, var424).method2066(var425, false);
                            }
                            continue;
                        }
                        if (var510 == 5066) {
                            var6--;
                            int var426 = class94.field1769[var6];
                            class94.field1769[var6++] = class230.method1666((byte) -19, var426).method2179(0);
                            continue;
                        }
                        if (var510 == 5067) {
                            var6 -= 2;
                            int var427 = class94.field1769[var6];
                            int var428 = class94.field1769[var6 + 1];
                            int var429 = class230.method1666((byte) -19, var427).method2183(var428, 118);
                            class94.field1769[var6++] = var429;
                            continue;
                        }
                        if (var510 == 5068) {
                            var6 -= 2;
                            int var430 = class94.field1769[var6];
                            int var431 = class94.field1769[var6 + 1];
                            class20.field576.field5041[var430] = var431;
                            continue;
                        }
                        if (var510 == 5069) {
                            var6 -= 2;
                            int var432 = class94.field1769[var6 + 1];
                            int var433 = class94.field1769[var6];
                            class20.field576.field5041[var433] = var432;
                            continue;
                        }
                        if (var510 == 5070) {
                            var6 -= 3;
                            int var434 = class94.field1769[var6];
                            int var435 = class94.field1769[var6 + 2];
                            int var436 = class94.field1769[var6 + 1];
                            class307 var437 = class230.method1666((byte) -19, var434);
                            if (var437.method2183(var436, 48) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class94.field1769[var6++] = var437.method2178(-116, var436, var435);
                            continue;
                        }
                        if (var510 == 5071) {
                            var7--;
                            class279 var438 = class310.field5505[var7];
                            var6--;
                            boolean var439 = class94.field1769[var6] == 1;
                            class98.method843((byte) 124, var439, var438);
                            class94.field1769[var6++] = class309.field5484;
                            continue;
                        }
                        if (var510 == 5072) {
                            if (class84.field1602 != null && class280.field5004 < class309.field5484) {
                                class94.field1769[var6++] = class52.method442(65535, class84.field1602[class280.field5004++]);
                                continue;
                            }
                            class94.field1769[var6++] = -1;
                            continue;
                        }
                        if (var510 == 5073) {
                            class280.field5004 = 0;
                            continue;
                        }
                    } else if (var510 < 5200) {
                        if (var510 == 5100) {
                            if (class284.field5075[86]) {
                                class94.field1769[var6++] = 1;
                            } else {
                                class94.field1769[var6++] = 0;
                            }
                            continue;
                        }
                        if (var510 == 5101) {
                            if (class284.field5075[82]) {
                                class94.field1769[var6++] = 1;
                            } else {
                                class94.field1769[var6++] = 0;
                            }
                            continue;
                        }
                        if (var510 == 5102) {
                            if (class284.field5075[81]) {
                                class94.field1769[var6++] = 1;
                            } else {
                                class94.field1769[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var510 < 5300) {
                        if (var510 == 5200) {
                            var6--;
                            class120.method950((byte) -115, class94.field1769[var6]);
                            continue;
                        }
                        if (var510 == 5201) {
                            class94.field1769[var6++] = class140.method1083(255);
                            continue;
                        }
                        if (var510 == 5202) {
                            var6--;
                            class174.method1352(3, class94.field1769[var6]);
                            continue;
                        }
                        if (var510 == 5203) {
                            var7--;
                            class279.method1977(class310.field5505[var7], (byte) 62);
                            continue;
                        }
                        if (var510 == 5204) {
                            class310.field5505[var7 - 1] = class77.method651(class310.field5505[var7 - 1], -50);
                            continue;
                        }
                        if (var510 == 5205) {
                            var7--;
                            class41.method352(class310.field5505[var7], 30922);
                            continue;
                        }
                        if (var510 == 5206) {
                            var6--;
                            int var353 = class94.field1769[var6];
                            class43 var354 = class248.method1775(false, var353 & 0x3FFF, var353 >> 14 & 0x3FFF);
                            if (var354 == null) {
                                class310.field5505[var7++] = class247.field4384;
                            } else {
                                class310.field5505[var7++] = var354.field896;
                            }
                            continue;
                        }
                        if (var510 == 5207) {
                            var7--;
                            class43 var355 = class70.method614((byte) -102, class310.field5505[var7]);
                            if (var355 != null && var355.field901 != null) {
                                class310.field5505[var7++] = var355.field901;
                                continue;
                            }
                            class310.field5505[var7++] = class247.field4384;
                            continue;
                        }
                        if (var510 == 5208) {
                            class94.field1769[var6++] = class301.field5360;
                            class94.field1769[var6++] = class104.field1953;
                            continue;
                        }
                        if (var510 == 5209) {
                            class94.field1769[var6++] = class265.field4776 + class245.field4356;
                            class94.field1769[var6++] = class166.field3007 + class34.field777 - class298.field5282 - 1;
                            continue;
                        }
                        if (var510 == 5210) {
                            class43 var356 = class260.method1858((byte) -103);
                            if (var356 == null) {
                                class94.field1769[var6++] = 0;
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var356.field895 * 64;
                                class94.field1769[var6++] = var356.field910 * 64;
                            }
                            continue;
                        }
                        if (var510 == 5211) {
                            class43 var357 = class260.method1858((byte) -87);
                            if (var357 == null) {
                                class94.field1769[var6++] = 0;
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var357.field903 - var357.field899;
                                class94.field1769[var6++] = var357.field902 - var357.field900;
                            }
                            continue;
                        }
                        if (var510 == 5212) {
                            int var358 = class232.method1676((byte) -125);
                            int var359 = 0;
                            class279 var360;
                            if (var358 == -1) {
                                var360 = class247.field4384;
                            } else {
                                var360 = class62.field1274.field2438[var358];
                                var359 = class62.field1274.method1040(var358, (byte) 118);
                            }
                            class279 var361 = var360.method2007((byte) -123, class251.field4483, class102.field1917);
                            class310.field5505[var7++] = var361;
                            class94.field1769[var6++] = var359;
                            continue;
                        }
                        if (var510 == 5213) {
                            int var362 = class83.method725(-102);
                            int var363 = 0;
                            class279 var364;
                            if (var362 == -1) {
                                var364 = class247.field4384;
                            } else {
                                var364 = class62.field1274.field2438[var362];
                                var363 = class62.field1274.method1040(var362, (byte) 122);
                            }
                            class279 var365 = var364.method2007((byte) -126, class251.field4483, class102.field1917);
                            class310.field5505[var7++] = var365;
                            class94.field1769[var6++] = var363;
                            continue;
                        }
                        if (var510 == 5214) {
                            var6--;
                            int var366 = class94.field1769[var6];
                            class13.method89(var366 >> 14 & 0x3FFF, var366 & 0x3FFF, false);
                            continue;
                        }
                        if (var510 == 5215) {
                            var6--;
                            int var367 = class94.field1769[var6];
                            boolean var368 = false;
                            var7--;
                            class279 var369 = class310.field5505[var7];
                            class204 var370 = class70.method618(var367 & 0x3FFF, (byte) 14, (var367 & 0xFFFF010) >> 14);
                            for (class43 var371 = (class43) var370.method1511((byte) 87); var371 != null; var371 = (class43) var370.method1515(-119)) {
                                if (var371.field896.method2010(var369, (byte) 81)) {
                                    var368 = true;
                                    break;
                                }
                            }
                            if (var368) {
                                class94.field1769[var6++] = 1;
                            } else {
                                class94.field1769[var6++] = 0;
                            }
                            continue;
                        }
                        if (var510 == 5216) {
                            var6--;
                            int var372 = class94.field1769[var6];
                            class153.method1213(var372, (byte) 26);
                            continue;
                        }
                        if (var510 == 5217) {
                            var6--;
                            int var373 = class94.field1769[var6];
                            if (class41.method354(var373, 113)) {
                                class94.field1769[var6++] = 1;
                            } else {
                                class94.field1769[var6++] = 0;
                            }
                            continue;
                        }
                        if (var510 == 5218) {
                            class43 var374 = class260.method1858((byte) -124);
                            if (var374 == null) {
                                class94.field1769[var6++] = -1;
                            } else {
                                class94.field1769[var6++] = var374.field904;
                            }
                            continue;
                        }
                        if (var510 == 5219) {
                            var7--;
                            class53.method486((byte) 1, class310.field5505[var7]);
                            continue;
                        }
                        if (var510 == 5220) {
                            class94.field1769[var6++] = class302.field5374 == 100 ? 1 : 0;
                            continue;
                        }
                    } else if (var510 < 5400) {
                        if (var510 == 5300) {
                            var6 -= 2;
                            int var276 = class94.field1769[var6];
                            int var277 = class94.field1769[var6 + 1];
                            class103.method867(var277, 110, false, var276, 3);
                            class94.field1769[var6++] = class120.field2159 == null ? 0 : 1;
                            continue;
                        }
                        if (var510 == 5301) {
                            if (class120.field2159 != null) {
                                class103.method867(-1, -106, false, -1, class283.field5062);
                            }
                            continue;
                        }
                        if (var510 == 5302) {
                            class236[] var278 = method360((byte) 48);
                            class94.field1769[var6++] = var278.length;
                            continue;
                        }
                        if (var510 == 5303) {
                            var6--;
                            int var279 = class94.field1769[var6];
                            class236[] var280 = method360((byte) 41);
                            class94.field1769[var6++] = var280[var279].field4112;
                            class94.field1769[var6++] = var280[var279].field4117;
                            continue;
                        }
                        if (var510 == 5305) {
                            int var281 = class236.field4121;
                            int var282 = class239.field4218;
                            int var283 = -1;
                            class236[] var284 = method360((byte) 41);
                            for (int var285 = 0; var285 < var284.length; var285++) {
                                class236 var286 = var284[var285];
                                if (var286.field4112 == var281 && var286.field4117 == var282) {
                                    var283 = var285;
                                    break;
                                }
                            }
                            class94.field1769[var6++] = var283;
                            continue;
                        }
                        if (var510 == 5306) {
                            class94.field1769[var6++] = class20.method196(3);
                            continue;
                        }
                        if (var510 == 5307) {
                            var6--;
                            int var287 = class94.field1769[var6];
                            if (var287 < 0 || var287 > 2) {
                                var287 = 0;
                            }
                            class103.method867(-1, -95, false, -1, var287);
                            continue;
                        }
                        if (var510 == 5308) {
                            class94.field1769[var6++] = class283.field5062;
                            continue;
                        }
                        if (var510 == 5309) {
                            var6--;
                            int var288 = class94.field1769[var6];
                            if (var288 < 0 || var288 > 2) {
                                var288 = 0;
                            }
                            class283.field5062 = var288;
                            class54.method507(class110.field2022, -6);
                            continue;
                        }
                    } else if (var510 < 5500) {
                        if (var510 == 5400) {
                            class167.field3018++;
                            var7 -= 2;
                            class279 var331 = class310.field5505[var7];
                            class279 var332 = class310.field5505[var7 + 1];
                            var6--;
                            int var333 = class94.field1769[var6];
                            class314.field5534.method1634(39, 0);
                            class314.field5534.method464((class20.method193(-73, var331) + class20.method193(-45, var332)) + 1, false);
                            class314.field5534.method481(var331, (byte) 99);
                            class314.field5534.method481(var332, (byte) 109);
                            class314.field5534.method464(var333, false);
                            continue;
                        }
                        if (var510 == 5401) {
                            var6 -= 2;
                            class33.field745[class94.field1769[var6]] = (short) class169.method1318((byte) 110, class94.field1769[var6 + 1]);
                            class107.method891((byte) -120);
                            class112.method915((byte) -92);
                            class159.method1251(-115);
                            class173.method1348((byte) -75);
                            class37.method327(0);
                            continue;
                        }
                        if (var510 == 5405) {
                            var6 -= 2;
                            int var334 = class94.field1769[var6 + 1];
                            int var335 = class94.field1769[var6];
                            if (var335 >= 0 && var335 < 2) {
                                class91.field1717[var335] = new int[var334 << 1][4];
                            }
                            continue;
                        }
                        if (var510 == 5406) {
                            var6 -= 7;
                            int var336 = class94.field1769[var6];
                            int var337 = class94.field1769[var6 + 1] << 1;
                            int var338 = class94.field1769[var6 + 3];
                            int var339 = class94.field1769[var6 + 2];
                            int var340 = class94.field1769[var6 + 4];
                            int var341 = class94.field1769[var6 + 5];
                            int var342 = class94.field1769[var6 + 6];
                            if (var336 >= 0 && var336 < 2 && class91.field1717[var336] != null && var337 >= 0 && class91.field1717[var336].length > var337) {
                                class91.field1717[var336][var337] = new int[] { (class52.method442(268431133, var339) >> 14) * 128, var338, class52.method442(16383, var339) * 128, var342 };
                                class91.field1717[var336][var337 + 1] = new int[] { class52.method442(16383, var340 >> 14) * 128, var341, class52.method442(16383, var340) * 128 };
                            }
                            continue;
                        }
                        if (var510 == 5407) {
                            var6--;
                            int var343 = class91.field1717[class94.field1769[var6]].length >> 1;
                            class94.field1769[var6++] = var343;
                            continue;
                        }
                        if (var510 == 5411) {
                            if (class120.field2159 != null) {
                                class103.method867(-1, -118, false, -1, class283.field5062);
                            }
                            if (class5.field115 == null) {
                                class112.method914((byte) -124, false, class204.method1507((byte) -16));
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var510 == 5419) {
                            class279 var344 = class247.field4384;
                            if (class178.field3226 != null) {
                                var344 = class220.method1615(class178.field3226.field3658, 255);
                                try {
                                    if (class178.field3226.field3657 != null) {
                                        byte[] var345 = ((String) class178.field3226.field3657).getBytes("ISO-8859-1");
                                        var344 = class194.method1457(0, var345.length, var345, false);
                                    }
                                } catch (UnsupportedEncodingException var508) {
                                }
                            }
                            class310.field5505[var7++] = var344;
                            continue;
                        }
                        if (var510 == 5420) {
                            class94.field1769[var6++] = class305.field5415 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 5421) {
                            if (class120.field2159 != null) {
                                class103.method867(-1, -123, false, -1, class283.field5062);
                            }
                            var6--;
                            boolean var347 = class94.field1769[var6] == 1;
                            var7--;
                            class279 var348 = class310.field5505[var7];
                            class279 var349 = class115.method929(new class279[] { class204.method1507((byte) -16), var348 }, (byte) 60);
                            if (class5.field115 == null && (!var347 || class305.field5415 == 3 || !class305.field5416.startsWith("win") || class278.field4915)) {
                                class112.method914((byte) -124, var347, var349);
                                continue;
                            }
                            class324.field5662 = var347;
                            class32.field733 = var349;
                            class249.field4444 = class110.field2022.method2157((byte) -87, new String(var349.method2008((byte) 126), "ISO-8859-1"));
                            continue;
                        }
                        if (var510 == 5422) {
                            var7 -= 2;
                            class279 var350 = class310.field5505[var7 + 1];
                            class279 var351 = class310.field5505[var7];
                            var6--;
                            int var352 = class94.field1769[var6];
                            if (var351.method1984(8) > 0) {
                                if (class103.field1929 == null) {
                                    class103.field1929 = new class279[class1.field47[class214.field3764]];
                                }
                                class103.field1929[var352] = var351;
                            }
                            if (var350.method1984(8) > 0) {
                                if (class172.field3110 == null) {
                                    class172.field3110 = new class279[class1.field47[class214.field3764]];
                                }
                                class172.field3110[var352] = var350;
                            }
                            continue;
                        }
                        if (var510 == 5423) {
                            var7--;
                            class310.field5505[var7].method2012((byte) -101);
                            continue;
                        }
                        if (var510 == 5424) {
                            var6 -= 11;
                            class279.field4947 = class94.field1769[var6];
                            class132.field2417 = class94.field1769[var6 + 1];
                            class210.field3698 = class94.field1769[var6 + 2];
                            class266.field4797 = class94.field1769[var6 + 3];
                            class240.field4222 = class94.field1769[var6 + 4];
                            class307.field5461 = class94.field1769[var6 + 5];
                            class132.field2408 = class94.field1769[var6 + 6];
                            class237.field4123 = class94.field1769[var6 + 7];
                            class154.field2793 = class94.field1769[var6 + 8];
                            class212.field3715 = class94.field1769[var6 + 9];
                            class133.field2427 = class94.field1769[var6 + 10];
                            class266.field4799.method1186(class240.field4222, -22698);
                            class266.field4799.method1186(class307.field5461, -22698);
                            class266.field4799.method1186(class132.field2408, -22698);
                            class266.field4799.method1186(class237.field4123, -22698);
                            class266.field4799.method1186(class154.field2793, -22698);
                            class152.field2766 = true;
                            continue;
                        }
                        if (var510 == 5425) {
                            class17.method152(false);
                            class152.field2766 = false;
                            continue;
                        }
                        if (var510 == 5426) {
                            var6--;
                            class150.field2745 = class94.field1769[var6];
                            continue;
                        }
                        if (var510 == 5427) {
                            var6 -= 2;
                            class94.field1770 = class94.field1769[var6];
                            class233.field4089 = class94.field1769[var6 + 1];
                            continue;
                        }
                    } else if (var510 < 5600) {
                        if (var510 == 5500) {
                            var6 -= 4;
                            int var289 = class94.field1769[var6 + 1];
                            int var290 = class94.field1769[var6 + 2];
                            int var291 = class94.field1769[var6];
                            int var292 = class94.field1769[var6 + 3];
                            class297.method2103(var290, (var291 >> 14 & 0x3FFF) - class112.field2058, 0, (var291 & 0x3FFF) - class12.field396, var289, false, var292);
                            continue;
                        }
                        if (var510 == 5501) {
                            var6 -= 4;
                            int var293 = class94.field1769[var6 + 1];
                            int var294 = class94.field1769[var6];
                            int var295 = class94.field1769[var6 + 2];
                            int var296 = class94.field1769[var6 + 3];
                            class238.method1713(var295, false, var296, var293, (var294 >> 14 & 0x3FFF) - class112.field2058, (var294 & 0x3FFF) + -class12.field396);
                            continue;
                        }
                        if (var510 == 5502) {
                            var6 -= 6;
                            int var297 = class94.field1769[var6];
                            if (var297 >= 2) {
                                throw new RuntimeException();
                            }
                            class8.field338 = var297;
                            int var298 = class94.field1769[var6 + 1];
                            if ((var298 + 1) >= (class91.field1717[class8.field338].length >> 1)) {
                                throw new RuntimeException();
                            }
                            class130.field2361 = var298;
                            class215.field3783 = 0;
                            class102.field1906 = class94.field1769[var6 + 2];
                            class101.field1893 = class94.field1769[var6 + 3];
                            int var299 = class94.field1769[var6 + 4];
                            if (var299 >= 2) {
                                throw new RuntimeException();
                            }
                            class318.field5583 = var299;
                            int var300 = class94.field1769[var6 + 5];
                            if (var300 + 1 >= class91.field1717[class318.field5583].length >> 1) {
                                throw new RuntimeException();
                            }
                            class122.field2191 = 3;
                            class287.field5127 = var300;
                            continue;
                        }
                        if (var510 == 5503) {
                            class84.method727(17);
                            continue;
                        }
                        if (var510 == 5504) {
                            var6 -= 2;
                            class172.field3107 = class94.field1769[var6];
                            class126.field2349 = class94.field1769[var6 + 1];
                            if (class122.field2191 == 2) {
                                class62.field1278 = class172.field3107;
                                class5.field124 = class126.field2349;
                            }
                            class159.method1250(-19267);
                            continue;
                        }
                        if (var510 == 5505) {
                            class94.field1769[var6++] = class172.field3107;
                            continue;
                        }
                        if (var510 == 5506) {
                            class94.field1769[var6++] = class126.field2349;
                            continue;
                        }
                    } else if (var510 < 5700) {
                        if (var510 == 5600) {
                            var7 -= 2;
                            class279 var327 = class310.field5505[var7];
                            class279 var328 = class310.field5505[var7 + 1];
                            var6--;
                            int var329 = class94.field1769[var6];
                            if (class53.field1111 == 10 && class252.field4504 == 0 && class141.field2557 == 0 && class139.field2516 == 0 && class173.field3121 == 0) {
                                class59.method530(var329, var327, var328, (byte) 51);
                            }
                            continue;
                        }
                        if (var510 == 5601) {
                            class13.method96(false);
                            continue;
                        }
                        if (var510 == 5602) {
                            if (class141.field2557 == 0) {
                                class279.field4943 = -2;
                            }
                            continue;
                        }
                        if (var510 == 5603) {
                            var6 -= 4;
                            if (class53.field1111 == 10 && class252.field4504 == 0 && class141.field2557 == 0 && class139.field2516 == 0 && class173.field3121 == 0) {
                                class185.method1428(class94.field1769[var6], class94.field1769[var6 + 3], 0, class94.field1769[var6 + 1], class94.field1769[var6 + 2]);
                            }
                            continue;
                        }
                        if (var510 == 5604) {
                            var7--;
                            if (class53.field1111 == 10 && class252.field4504 == 0 && class141.field2557 == 0 && class139.field2516 == 0 && class173.field3121 == 0) {
                                class90.method781(class310.field5505[var7].method2013(126), 117);
                            }
                            continue;
                        }
                        if (var510 == 5605) {
                            var6 -= 4;
                            var7 -= 2;
                            if (class53.field1111 == 10 && class252.field4504 == 0 && class141.field2557 == 0 && class139.field2516 == 0 && class173.field3121 == 0) {
                                class62.method547(class94.field1769[var6 + 1], class94.field1769[var6 + 3], (byte) 52, class310.field5505[var7 + 1], class94.field1769[var6], class94.field1769[var6 + 2], class310.field5505[var7].method2013(122));
                            }
                            continue;
                        }
                        if (var510 == 5606) {
                            if (class139.field2516 == 0) {
                                class73.field1435 = -2;
                            }
                            continue;
                        }
                        if (var510 == 5607) {
                            class94.field1769[var6++] = class279.field4943;
                            continue;
                        }
                        if (var510 == 5608) {
                            class94.field1769[var6++] = class7.field150;
                            continue;
                        }
                        if (var510 == 5609) {
                            class94.field1769[var6++] = class73.field1435;
                            continue;
                        }
                        if (var510 == 5610) {
                            for (int var330 = 0; var330 < 5; var330++) {
                                class310.field5505[var7++] = class250.field4457.length > var330 ? class250.field4457[var330].method2016(-32) : class247.field4384;
                            }
                            class250.field4457 = null;
                            continue;
                        }
                        if (var510 == 5611) {
                            class94.field1769[var6++] = class286.field5091;
                            continue;
                        }
                    } else if (var510 < 6100) {
                        if (var510 == 6001) {
                            var6--;
                            int var318 = class94.field1769[var6];
                            if (var318 < 1) {
                                var318 = 1;
                            }
                            if (var318 > 4) {
                                var318 = 4;
                            }
                            class253.field4519 = var318;
                            if (!class97.field1824 || !class126.field2340) {
                                if (class253.field4519 == 1) {
                                    class27.method250(0.9F);
                                }
                                if (class253.field4519 == 2) {
                                    class27.method250(0.8F);
                                }
                                if (class253.field4519 == 3) {
                                    class27.method250(0.7F);
                                }
                                if (class253.field4519 == 4) {
                                    class27.method250(0.6F);
                                }
                            }
                            if (class97.field1824) {
                                class29.method266(-122);
                                if (!class126.field2340) {
                                    class255.method1822(28);
                                }
                            }
                            class112.method915((byte) -92);
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6002) {
                            var6--;
                            class70.method616((byte) 91, class94.field1769[var6] == 1);
                            class134.method1052((byte) -127);
                            class255.method1822(28);
                            class74.method641(-122);
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6003) {
                            var6--;
                            class289.field5158 = class94.field1769[var6] == 1;
                            class74.method641(-117);
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6005) {
                            var6--;
                            class202.field3608 = class94.field1769[var6] == 1;
                            class255.method1822(28);
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6006) {
                            var6--;
                            class29.field685 = class94.field1769[var6] == 1;
                            ((class237) class27.field656).method1705(-23923, !class29.field685);
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6007) {
                            var6--;
                            class86.field1614 = class94.field1769[var6] == 1;
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6008) {
                            var6--;
                            class221.field3901 = class94.field1769[var6] == 1;
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6009) {
                            var6--;
                            class198.field3536 = class94.field1769[var6] == 1;
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6010) {
                            var6--;
                            class220.field3883 = class94.field1769[var6] == 1;
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6011) {
                            var6--;
                            int var319 = class94.field1769[var6];
                            if (var319 < 0 || var319 > 2) {
                                var319 = 0;
                            }
                            class171.field3086 = var319;
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6012) {
                            if (class97.field1824) {
                                class162.method1279(0, 0, 0);
                            }
                            var6--;
                            class126.field2340 = class94.field1769[var6] == 1;
                            if (class97.field1824 && class126.field2340) {
                                class27.method250(0.7F);
                            } else {
                                if (class253.field4519 == 1) {
                                    class27.method250(0.9F);
                                }
                                if (class253.field4519 == 2) {
                                    class27.method250(0.8F);
                                }
                                if (class253.field4519 == 3) {
                                    class27.method250(0.7F);
                                }
                                if (class253.field4519 == 4) {
                                    class27.method250(0.6F);
                                }
                            }
                            class255.method1822(28);
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6014) {
                            var6--;
                            class162.field2929 = class94.field1769[var6] == 1;
                            if (class97.field1824) {
                                class255.method1822(28);
                            }
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6015) {
                            var6--;
                            class68.field1335 = class94.field1769[var6] == 1;
                            if (class97.field1824) {
                                class29.method266(35);
                            }
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6016) {
                            var6--;
                            int var320 = class94.field1769[var6];
                            if (class97.field1824) {
                                class43.field897 = true;
                            }
                            if (var320 < 0 || var320 > 2) {
                                var320 = 0;
                            }
                            class232.field4062 = var320;
                            continue;
                        }
                        if (var510 == 6017) {
                            var6--;
                            class80.field1525 = class94.field1769[var6] == 1;
                            class183.method1416(23);
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6018) {
                            var6--;
                            int var321 = class94.field1769[var6];
                            if (var321 < 0) {
                                var321 = 0;
                            }
                            if (var321 > 127) {
                                var321 = 127;
                            }
                            class41.field875 = var321;
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6019) {
                            var6--;
                            int var322 = class94.field1769[var6];
                            if (var322 < 0) {
                                var322 = 0;
                            }
                            if (var322 > 255) {
                                var322 = 255;
                            }
                            if (class113.field2073 != var322) {
                                if (class113.field2073 == 0 && class125.field2292 != -1) {
                                    class87.method758(false, (byte) -118, 0, class125.field2292, var322, class33.field742);
                                    class204.field3634 = false;
                                } else if (var322 == 0) {
                                    class53.method480(true);
                                    class204.field3634 = false;
                                } else {
                                    class163.method1282(-1, var322);
                                }
                                class113.field2073 = var322;
                            }
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6020) {
                            var6--;
                            int var323 = class94.field1769[var6];
                            if (var323 < 0) {
                                var323 = 0;
                            }
                            if (var323 > 127) {
                                var323 = 127;
                            }
                            class3.field105 = var323;
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            continue;
                        }
                        if (var510 == 6021) {
                            var6--;
                            class138.field2493 = class94.field1769[var6] == 1;
                            class74.method641(-74);
                            continue;
                        }
                        if (var510 == 6023) {
                            boolean var324 = false;
                            var6--;
                            int var325 = class94.field1769[var6];
                            if (var325 < 0) {
                                var325 = 0;
                            }
                            if (var325 > 2) {
                                var325 = 2;
                            }
                            if (class274.field4867 < 96) {
                                var325 = 0;
                                var324 = true;
                            }
                            class208.method1530(var325);
                            class54.method507(class110.field2022, -6);
                            class113.field2077 = false;
                            class94.field1769[var6++] = var324 ? 0 : 1;
                            continue;
                        }
                        if (var510 == 6024) {
                            var6--;
                            int var326 = class94.field1769[var6];
                            if (var326 < 0 || var326 > 2) {
                                var326 = 0;
                            }
                            class141.field2566 = var326;
                            class54.method507(class110.field2022, -6);
                            continue;
                        }
                        if (var510 == 6028) {
                            var6--;
                            class307.field5448 = class94.field1769[var6] != 0;
                            class54.method507(class110.field2022, -6);
                            continue;
                        }
                    } else if (var510 < 6200) {
                        if (var510 == 6101) {
                            class94.field1769[var6++] = class253.field4519;
                            continue;
                        }
                        if (var510 == 6102) {
                            class94.field1769[var6++] = class221.method1617((byte) 29) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6103) {
                            class94.field1769[var6++] = class289.field5158 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6105) {
                            class94.field1769[var6++] = class202.field3608 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6106) {
                            class94.field1769[var6++] = class29.field685 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6107) {
                            class94.field1769[var6++] = class86.field1614 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6108) {
                            class94.field1769[var6++] = class221.field3901 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6109) {
                            class94.field1769[var6++] = class198.field3536 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6110) {
                            class94.field1769[var6++] = class220.field3883 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6111) {
                            class94.field1769[var6++] = class171.field3086;
                            continue;
                        }
                        if (var510 == 6112) {
                            class94.field1769[var6++] = class126.field2340 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6114) {
                            class94.field1769[var6++] = class162.field2929 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6115) {
                            class94.field1769[var6++] = class68.field1335 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6116) {
                            class94.field1769[var6++] = class232.field4062;
                            continue;
                        }
                        if (var510 == 6117) {
                            class94.field1769[var6++] = class80.field1525 ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6118) {
                            class94.field1769[var6++] = class41.field875;
                            continue;
                        }
                        if (var510 == 6119) {
                            class94.field1769[var6++] = class113.field2073;
                            continue;
                        }
                        if (var510 == 6120) {
                            class94.field1769[var6++] = class3.field105;
                            continue;
                        }
                        if (var510 == 6121) {
                            if (class97.field1824) {
                                class94.field1769[var6++] = class97.field1811 ? 1 : 0;
                            } else {
                                class94.field1769[var6++] = 0;
                            }
                            continue;
                        }
                        if (var510 == 6123) {
                            class94.field1769[var6++] = class208.method1533();
                            continue;
                        }
                        if (var510 == 6124) {
                            class94.field1769[var6++] = class141.field2566;
                            continue;
                        }
                        if (var510 == 6128) {
                            class94.field1769[var6++] = class307.field5448 ? 1 : 0;
                            continue;
                        }
                    } else if (var510 < 6300) {
                        if (var510 == 6200) {
                            var6 -= 2;
                            class117.field2124 = (short) class94.field1769[var6];
                            if (class117.field2124 <= 0) {
                                class117.field2124 = 256;
                            }
                            class178.field3212 = (short) class94.field1769[var6 + 1];
                            if (class178.field3212 <= 0) {
                                class178.field3212 = 205;
                            }
                            continue;
                        }
                        if (var510 == 6201) {
                            var6 -= 2;
                            class105.field1982 = (short) class94.field1769[var6];
                            if (class105.field1982 <= 0) {
                                class105.field1982 = 256;
                            }
                            class124.field2262 = (short) class94.field1769[var6 + 1];
                            if (class124.field2262 <= 0) {
                                class124.field2262 = 320;
                            }
                            continue;
                        }
                        if (var510 == 6202) {
                            var6 -= 4;
                            class190.field3427 = (short) class94.field1769[var6];
                            if (class190.field3427 <= 0) {
                                class190.field3427 = 1;
                            }
                            field888 = (short) class94.field1769[var6 + 1];
                            if (field888 <= 0) {
                                field888 = 32767;
                            } else if (field888 < class190.field3427) {
                                field888 = class190.field3427;
                            }
                            class240.field4220 = (short) class94.field1769[var6 + 2];
                            if (class240.field4220 <= 0) {
                                class240.field4220 = 1;
                            }
                            class222.field3937 = (short) class94.field1769[var6 + 3];
                            if (class222.field3937 <= 0) {
                                class222.field3937 = 32767;
                            } else if (class240.field4220 > class222.field3937) {
                                class222.field3937 = class240.field4220;
                            }
                            continue;
                        }
                        if (var510 == 6203) {
                            class261.method1871(class23.field597.field297, false, 0, 0, class23.field597.field220, (byte) 111);
                            class94.field1769[var6++] = class11.field363;
                            class94.field1769[var6++] = class130.field2382;
                            continue;
                        }
                        if (var510 == 6204) {
                            class94.field1769[var6++] = class105.field1982;
                            class94.field1769[var6++] = class124.field2262;
                            continue;
                        }
                        if (var510 == 6205) {
                            class94.field1769[var6++] = class117.field2124;
                            class94.field1769[var6++] = class178.field3212;
                            continue;
                        }
                    } else if (var510 < 6400) {
                        if (var510 == 6300) {
                            class94.field1769[var6++] = (int) (class127.method1015(21504) / 60000L);
                            continue;
                        }
                        if (var510 == 6301) {
                            class94.field1769[var6++] = (int) (class127.method1015(21504) / 86400000L) - 11745;
                            continue;
                        }
                        if (var510 == 6302) {
                            var6 -= 3;
                            int var301 = class94.field1769[var6 + 1];
                            int var302 = class94.field1769[var6];
                            int var303 = class94.field1769[var6 + 2];
                            class321.field5606.clear();
                            class321.field5606.set(11, 12);
                            class321.field5606.set(var303, var301, var302);
                            class94.field1769[var6++] = (int) (class321.field5606.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var510 == 6303) {
                            class321.field5606.clear();
                            class321.field5606.setTime(new Date(class127.method1015(21504)));
                            class94.field1769[var6++] = class321.field5606.get(1);
                            continue;
                        }
                        if (var510 == 6304) {
                            boolean var304 = true;
                            var6--;
                            int var305 = class94.field1769[var6];
                            if (var305 < 0) {
                                var304 = (var305 + 1) % 4 == 0;
                            } else if (var305 < 1582) {
                                var304 = var305 % 4 == 0;
                            } else if (var305 % 4 != 0) {
                                var304 = false;
                            } else if ((var305 % 100) != 0) {
                                var304 = true;
                            } else if ((var305 % 400) != 0) {
                                var304 = false;
                            }
                            class94.field1769[var6++] = var304 ? 1 : 0;
                            continue;
                        }
                    } else if (var510 < 6500) {
                        if (var510 == 6405) {
                            class94.field1769[var6++] = class72.method633(-1) ? 1 : 0;
                            continue;
                        }
                        if (var510 == 6406) {
                            class94.field1769[var6++] = class33.method299(5799) ? 1 : 0;
                            continue;
                        }
                    } else if (var510 < 6600) {
                        if (var510 == 6500) {
                            if (class53.field1111 == 10 && class252.field4504 == 0 && class141.field2557 == 0 && class139.field2516 == 0) {
                                class94.field1769[var6++] = class269.method1917(-25169) == -1 ? 0 : 1;
                                continue;
                            }
                            class94.field1769[var6++] = 1;
                            continue;
                        }
                        if (var510 == 6501) {
                            class42 var306 = class231.method1673(23293);
                            if (var306 == null) {
                                class94.field1769[var6++] = -1;
                                class94.field1769[var6++] = 0;
                                class310.field5505[var7++] = class247.field4384;
                                class94.field1769[var6++] = 0;
                                class310.field5505[var7++] = class247.field4384;
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var306.field884;
                                class94.field1769[var6++] = var306.field2591;
                                class310.field5505[var7++] = var306.field882;
                                class265 var307 = var306.method358((byte) -128);
                                class94.field1769[var6++] = var307.field4769;
                                class310.field5505[var7++] = var307.field4768;
                                class94.field1769[var6++] = var306.field2585;
                            }
                            continue;
                        }
                        if (var510 == 6502) {
                            class42 var308 = class233.method1682(-96);
                            if (var308 == null) {
                                class94.field1769[var6++] = -1;
                                class94.field1769[var6++] = 0;
                                class310.field5505[var7++] = class247.field4384;
                                class94.field1769[var6++] = 0;
                                class310.field5505[var7++] = class247.field4384;
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var308.field884;
                                class94.field1769[var6++] = var308.field2591;
                                class310.field5505[var7++] = var308.field882;
                                class265 var309 = var308.method358((byte) -128);
                                class94.field1769[var6++] = var309.field4769;
                                class310.field5505[var7++] = var309.field4768;
                                class94.field1769[var6++] = var308.field2585;
                            }
                            continue;
                        }
                        if (var510 == 6503) {
                            var6--;
                            int var310 = class94.field1769[var6];
                            if (class53.field1111 == 10 && class252.field4504 == 0 && class141.field2557 == 0 && class139.field2516 == 0) {
                                class94.field1769[var6++] = class86.method754(78, var310) ? 1 : 0;
                                continue;
                            }
                            class94.field1769[var6++] = 0;
                            continue;
                        }
                        if (var510 == 6504) {
                            var6--;
                            class293.field5224 = class94.field1769[var6];
                            class54.method507(class110.field2022, -6);
                            continue;
                        }
                        if (var510 == 6505) {
                            class94.field1769[var6++] = class293.field5224;
                            continue;
                        }
                        if (var510 == 6506) {
                            var6--;
                            int var311 = class94.field1769[var6];
                            class42 var312 = class149.method1190(var311, 2635);
                            if (var312 == null) {
                                class94.field1769[var6++] = -1;
                                class310.field5505[var7++] = class247.field4384;
                                class94.field1769[var6++] = 0;
                                class310.field5505[var7++] = class247.field4384;
                                class94.field1769[var6++] = 0;
                            } else {
                                class94.field1769[var6++] = var312.field2591;
                                class310.field5505[var7++] = var312.field882;
                                class265 var313 = var312.method358((byte) -128);
                                class94.field1769[var6++] = var313.field4769;
                                class310.field5505[var7++] = var313.field4768;
                                class94.field1769[var6++] = var312.field2585;
                            }
                            continue;
                        }
                        if (var510 == 6507) {
                            var6 -= 4;
                            int var314 = class94.field1769[var6 + 2];
                            int var315 = class94.field1769[var6];
                            boolean var316 = class94.field1769[var6 + 3] == 1;
                            boolean var317 = class94.field1769[var6 + 1] == 1;
                            class48.method392(-27555, var315, var317, var316, var314);
                            continue;
                        }
                    } else if (var510 < 6700) {
                        if (var510 == 6600) {
                            var6--;
                            class292.field5204 = class94.field1769[var6] == 1;
                            class54.method507(class110.field2022, -6);
                            continue;
                        }
                        if (var510 == 6601) {
                            class94.field1769[var6++] = class292.field5204 ? 1 : 0;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var509) {
            if (var5.field799 == null) {
                if (class124.field2261 != 0) {
                    class59.method532(class105.field1969, class247.field4384, 0, 29437);
                }
                class94.method792(var509, (byte) -115, "CS2 - scr:" + var5.field5539 + " op:" + var10);
            } else {
                class279 var505 = class247.method1774(30, 4);
                var505.method1971(class191.field3437, true).method1971(var5.field799, true);
                for (int var506 = class77.field1490 - 1; var506 >= 0; var506--) {
                    var505.method1971(class7.field148, true).method1971(class323.field5647[var506].field4410.field799, true);
                }
                if (var10 == 40) {
                    int var507 = var11[var8];
                    var505.method1971(class210.field3694, true).method1971(class191.method1447(5, var507), true);
                }
                if (class124.field2261 != 0) {
                    class59.method532(class115.method929(new class279[] { class297.field5275, var5.field799 }, (byte) 60), class247.field4384, 0, 29437);
                }
                class94.method792(var509, (byte) -115, "CS2 - scr:" + var5.field5539 + " op:" + var10 + new String(var505.method2008((byte) 71)));
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V", line = 6415)
    public static final void method363(byte arg0) {
        class246.field4376.method1338((byte) -113);
        field886++;
        class132.field2409.method1338((byte) -119);
        if (arg0 > -73) {
            method360((byte) 12);
        }
    }
}
