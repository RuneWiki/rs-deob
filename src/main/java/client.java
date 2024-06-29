import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class154 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2386 = 2;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
    public static int[] field2388 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!client", name = "U", descriptor = "S")
    public static short field2385 = 1;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field2404;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[[[B")
    public static byte[][][] field2390;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLub;Lub;Lub;Lub;)V")
    private static final void method1143(boolean arg0, class92 arg1, class92 arg2, class92 arg3, class92 arg4) {
        class215.field3300 = arg1;
        field2395++;
        class199.field3095 = arg3;
        class18.field244 = arg4;
        class125.field1878 = arg2;
        class8.field144 = new class222[class125.field1878.method704(0)][];
        if (!arg0) {
            field2385 = -2;
        }
        class153.field2257 = new boolean[class125.field1878.method704(0)];
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lcc;)Lcc;")
    public static final class222 method1144(class222 arg0) {
        int var1 = method1159(arg0).method239(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class169.method1217(arg0.field3392, 12180);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method1145(int arg0, int arg1) {
        if (arg0 <= 74) {
            field2388 = null;
        }
        field2400++;
        class69 var2 = class255.method1723((byte) 32, arg1, 5);
        var2.method554(2009563296);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lcc;)Z")
    public static final boolean method1146(class222 arg0) {
        if (class136.field2057) {
            if (method1159(arg0).field477 != 0) {
                return false;
            }
            if (arg0.field3552 == 0) {
                return false;
            }
        }
        return arg0.field3535;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method1147(byte arg0) {
        if (arg0 != -54) {
            field2390 = null;
        }
        field2401++;
        boolean var2 = class210.field3249.method826(124);
        if (!var2) {
            this.method1154(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lcc;IIIIIII)V")
    public static final void method1148(class222[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class222 var9 = arg0[var8];
            if (var9 != null && var9.field3392 == arg1 && (!var9.field3441 || var9.field3552 == 0 || var9.field3513 || method1159(var9).field477 != 0 || class244.field3894 == var9 || var9.field3388 == 1338) && (!var9.field3441 || !method1146(var9))) {
                int var10 = var9.field3515 + arg6;
                int var11 = var9.field3401 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3552 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3408 + var10;
                    int var17 = var9.field3561 + var11;
                    if (var9.field3552 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class113.field1747 == var9) {
                    class201.field3111 = true;
                    class160.field2405 = var10;
                    class226.field3628 = var11;
                }
                if (!var9.field3441 || var12 < var14 && var13 < var15) {
                    if (var9.field3552 == 0) {
                        if (!var9.field3441 && method1146(var9) && class43.field729 != var9) {
                            continue;
                        }
                        if (var9.field3469 && class171.field2587 >= var12 && class157.field2340 >= var13 && class171.field2587 < var14 && class157.field2340 < var15) {
                            for (class26 var18 = (class26) class49.field801.method6(-122); var18 != null; var18 = (class26) class49.field801.method11((byte) 41)) {
                                if (var18.field452) {
                                    var18.method995((byte) -92);
                                    var18.field453.field3412 = false;
                                }
                            }
                            if (class173.field2674 == 0) {
                                class113.field1747 = null;
                                class244.field3894 = null;
                            }
                            class299.field4814 = 0;
                        }
                    }
                    if (var9.field3441) {
                        boolean var19;
                        if (class171.field2587 >= var12 && class157.field2340 >= var13 && class171.field2587 < var14 && class157.field2340 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class155.field2312 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class68.field1075 == 1 && class73.field1126 >= var12 && class240.field3829 >= var13 && class73.field1126 < var14 && class240.field3829 < var15) {
                            var21 = true;
                        }
                        if (var9.field3439 != null) {
                            for (int var22 = 0; var22 < var9.field3439.length; var22++) {
                                if (class292.field4537[var9.field3439[var22]]) {
                                    if (var9.field3541 == null || class41.field686 >= var9.field3541[var22]) {
                                        byte var23 = var9.field3494[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class292.field4537[86] && !class292.field4537[82] && !class292.field4537[81]) && ((var23 & 0x2) == 0 || class292.field4537[86]) && ((var23 & 0x1) == 0 || class292.field4537[82]) && ((var23 & 0x4) == 0 || class292.field4537[81])) {
                                            class70.method563(var22 + 1, var9.field3554, (byte) 14, "", -1);
                                            int var24 = var9.field3438[var22];
                                            if (var9.field3541 == null) {
                                                var9.field3541 = new int[var9.field3439.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3541[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3541[var22] = class41.field686 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3541 != null) {
                                    var9.field3541[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class208.method1452(0, var9, class73.field1126 - var10, class240.field3829 - var11);
                        }
                        if (class113.field1747 != null && class113.field1747 != var9 && var19 && method1159(var9).method233((byte) 16)) {
                            class244.field3896 = var9;
                        }
                        if (class244.field3894 == var9) {
                            class91.field1425 = true;
                            class82.field1238 = var10;
                            class8.field129 = var11;
                        }
                        if (var9.field3513 || var9.field3388 != 0) {
                            if (var19 && class8.field133 != 0 && var9.field3506 != null) {
                                class26 var25 = new class26();
                                var25.field452 = true;
                                var25.field453 = var9;
                                var25.field449 = class8.field133;
                                var25.field450 = var9.field3506;
                                class49.field801.method12(var25, 12);
                            }
                            if (class113.field1747 != null || class106.field1666 != null || class207.field3185 || var9.field3388 != 1400 && class299.field4814 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3388 != 0) {
                                if (var9.field3388 == 1337) {
                                    class308.field4938 = var9;
                                    continue;
                                }
                                if (var9.field3388 == 1338) {
                                    if (var21) {
                                        class236.field3729 = class73.field1126 - var10;
                                        class180.field2826 = class240.field3829 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3388 == 1400) {
                                    class131.field1949 = var9;
                                    if (var21) {
                                        if (class292.field4537[82] && class53.field835 > 0) {
                                            int var26 = (int) ((double) (class73.field1126 - var10 - var9.field3408 / 2) * 2.0D / (double) class247.field3932);
                                            int var27 = (int) ((double) (class240.field3829 - var11 - var9.field3561 / 2) * 2.0D / (double) class247.field3932);
                                            int var28 = class129.field1920 + var26;
                                            int var29 = class175.field2698 + var27;
                                            int var30 = class147.field2165 + var28;
                                            int var31 = class92.field1475 + class141.field2107 - var29 - 1;
                                            class303 var32 = method1149(-3);
                                            int[] var33 = var32.method2028(var30, (byte) -24, var31);
                                            if (var33 != null) {
                                                class203.method1430(var33[2], (byte) 53, var33[0], var33[1]);
                                                class78.method610((byte) 91);
                                            }
                                            continue;
                                        }
                                        class299.field4814 = 1;
                                        class171.field2586 = class171.field2587;
                                        class237.field3748 = class157.field2340;
                                        continue;
                                    }
                                    if (var20 && class299.field4814 > 0) {
                                        if (class299.field4814 == 1 && (class171.field2587 != class171.field2586 || class237.field3748 != class157.field2340)) {
                                            class170.field2569 = class129.field1920;
                                            class37.field626 = class175.field2698;
                                            class299.field4814 = 2;
                                        }
                                        if (class299.field4814 == 2) {
                                            class78.method611(109, (int) ((double) (class171.field2586 - class171.field2587) * 2.0D / (double) class238.field3757) + class170.field2569);
                                            class122.method921(119, (int) ((double) (class237.field3748 - class157.field2340) * 2.0D / (double) class238.field3757) + class37.field626);
                                        }
                                        continue;
                                    }
                                    class299.field4814 = 0;
                                    continue;
                                }
                                if (var9.field3388 == 1401) {
                                    if (var20) {
                                        class89.method684(35, class157.field2340 - var11, var9.field3561, var9.field3408, class171.field2587 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field3388 == 1402) {
                                    class80.method628((byte) -68, var9);
                                    continue;
                                }
                            }
                            if (!var9.field3517 && var21) {
                                var9.field3517 = true;
                                if (var9.field3514 != null) {
                                    class26 var34 = new class26();
                                    var34.field452 = true;
                                    var34.field453 = var9;
                                    var34.field442 = class73.field1126 - var10;
                                    var34.field449 = class240.field3829 - var11;
                                    var34.field450 = var9.field3514;
                                    class49.field801.method12(var34, 12);
                                }
                            }
                            if (var9.field3517 && var20 && var9.field3396 != null) {
                                class26 var35 = new class26();
                                var35.field452 = true;
                                var35.field453 = var9;
                                var35.field442 = class171.field2587 - var10;
                                var35.field449 = class157.field2340 - var11;
                                var35.field450 = var9.field3396;
                                class49.field801.method12(var35, 12);
                            }
                            if (var9.field3517 && !var20) {
                                var9.field3517 = false;
                                if (var9.field3475 != null) {
                                    class26 var36 = new class26();
                                    var36.field452 = true;
                                    var36.field453 = var9;
                                    var36.field442 = class171.field2587 - var10;
                                    var36.field449 = class157.field2340 - var11;
                                    var36.field450 = var9.field3475;
                                    class154.field2306.method12(var36, 12);
                                }
                            }
                            if (var20 && var9.field3533 != null) {
                                class26 var37 = new class26();
                                var37.field452 = true;
                                var37.field453 = var9;
                                var37.field442 = class171.field2587 - var10;
                                var37.field449 = class157.field2340 - var11;
                                var37.field450 = var9.field3533;
                                class49.field801.method12(var37, 12);
                            }
                            if (!var9.field3412 && var19) {
                                var9.field3412 = true;
                                if (var9.field3395 != null) {
                                    class26 var38 = new class26();
                                    var38.field452 = true;
                                    var38.field453 = var9;
                                    var38.field442 = class171.field2587 - var10;
                                    var38.field449 = class157.field2340 - var11;
                                    var38.field450 = var9.field3395;
                                    class49.field801.method12(var38, 12);
                                }
                            }
                            if (var9.field3412 && var19 && var9.field3434 != null) {
                                class26 var39 = new class26();
                                var39.field452 = true;
                                var39.field453 = var9;
                                var39.field442 = class171.field2587 - var10;
                                var39.field449 = class157.field2340 - var11;
                                var39.field450 = var9.field3434;
                                class49.field801.method12(var39, 12);
                            }
                            if (var9.field3412 && !var19) {
                                var9.field3412 = false;
                                if (var9.field3491 != null) {
                                    class26 var40 = new class26();
                                    var40.field452 = true;
                                    var40.field453 = var9;
                                    var40.field442 = class171.field2587 - var10;
                                    var40.field449 = class157.field2340 - var11;
                                    var40.field450 = var9.field3491;
                                    class154.field2306.method12(var40, 12);
                                }
                            }
                            if (var9.field3464 != null) {
                                class26 var41 = new class26();
                                var41.field453 = var9;
                                var41.field450 = var9.field3464;
                                class49.field802.method12(var41, 12);
                            }
                            if (var9.field3446 != null && class98.field1576 > var9.field3542) {
                                if (var9.field3484 == null || class98.field1576 - var9.field3542 > 32) {
                                    class26 var46 = new class26();
                                    var46.field453 = var9;
                                    var46.field450 = var9.field3446;
                                    class49.field801.method12(var46, 12);
                                } else {
                                    label572: for (int var42 = var9.field3542; var42 < class98.field1576; var42++) {
                                        int var43 = class215.field3297[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3484.length; var44++) {
                                            if (var9.field3484[var44] == var43) {
                                                class26 var45 = new class26();
                                                var45.field453 = var9;
                                                var45.field450 = var9.field3446;
                                                class49.field801.method12(var45, 12);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field3542 = class98.field1576;
                            }
                            if (var9.field3413 != null && class247.field3929 > var9.field3557) {
                                if (var9.field3447 == null || class247.field3929 - var9.field3557 > 32) {
                                    class26 var51 = new class26();
                                    var51.field453 = var9;
                                    var51.field450 = var9.field3413;
                                    class49.field801.method12(var51, 12);
                                } else {
                                    label548: for (int var47 = var9.field3557; var47 < class247.field3929; var47++) {
                                        int var48 = class195.field3065[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3447.length; var49++) {
                                            if (var9.field3447[var49] == var48) {
                                                class26 var50 = new class26();
                                                var50.field453 = var9;
                                                var50.field450 = var9.field3413;
                                                class49.field801.method12(var50, 12);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field3557 = class247.field3929;
                            }
                            if (var9.field3548 != null && class59.field939 > var9.field3539) {
                                if (var9.field3444 == null || class59.field939 - var9.field3539 > 32) {
                                    class26 var56 = new class26();
                                    var56.field453 = var9;
                                    var56.field450 = var9.field3548;
                                    class49.field801.method12(var56, 12);
                                } else {
                                    label524: for (int var52 = var9.field3539; var52 < class59.field939; var52++) {
                                        int var53 = class260.field4113[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3444.length; var54++) {
                                            if (var9.field3444[var54] == var53) {
                                                class26 var55 = new class26();
                                                var55.field453 = var9;
                                                var55.field450 = var9.field3548;
                                                class49.field801.method12(var55, 12);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field3539 = class59.field939;
                            }
                            if (var9.field3440 != null && class73.field1120 > var9.field3556) {
                                if (var9.field3507 == null || class73.field1120 - var9.field3556 > 32) {
                                    class26 var61 = new class26();
                                    var61.field453 = var9;
                                    var61.field450 = var9.field3440;
                                    class49.field801.method12(var61, 12);
                                } else {
                                    label500: for (int var57 = var9.field3556; var57 < class73.field1120; var57++) {
                                        int var58 = class223.field3574[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3507.length; var59++) {
                                            if (var9.field3507[var59] == var58) {
                                                class26 var60 = new class26();
                                                var60.field453 = var9;
                                                var60.field450 = var9.field3440;
                                                class49.field801.method12(var60, 12);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field3556 = class73.field1120;
                            }
                            if (var9.field3466 != null && class106.field1654 > var9.field3536) {
                                if (var9.field3504 == null || class106.field1654 - var9.field3536 > 32) {
                                    class26 var66 = new class26();
                                    var66.field453 = var9;
                                    var66.field450 = var9.field3466;
                                    class49.field801.method12(var66, 12);
                                } else {
                                    label476: for (int var62 = var9.field3536; var62 < class106.field1654; var62++) {
                                        int var63 = class198.field3085[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3504.length; var64++) {
                                            if (var9.field3504[var64] == var63) {
                                                class26 var65 = new class26();
                                                var65.field453 = var9;
                                                var65.field450 = var9.field3466;
                                                class49.field801.method12(var65, 12);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field3536 = class106.field1654;
                            }
                            if (class179.field2779 > var9.field3429 && var9.field3474 != null) {
                                class26 var67 = new class26();
                                var67.field453 = var9;
                                var67.field450 = var9.field3474;
                                class49.field801.method12(var67, 12);
                            }
                            if (class178.field2737 > var9.field3429 && var9.field3501 != null) {
                                class26 var68 = new class26();
                                var68.field453 = var9;
                                var68.field450 = var9.field3501;
                                class49.field801.method12(var68, 12);
                            }
                            if (class204.field3139 > var9.field3429 && var9.field3481 != null) {
                                class26 var69 = new class26();
                                var69.field453 = var9;
                                var69.field450 = var9.field3481;
                                class49.field801.method12(var69, 12);
                            }
                            if (class173.field2671 > var9.field3429 && var9.field3389 != null) {
                                class26 var70 = new class26();
                                var70.field453 = var9;
                                var70.field450 = var9.field3389;
                                class49.field801.method12(var70, 12);
                            }
                            if (class255.field4082 > var9.field3429 && var9.field3415 != null) {
                                class26 var71 = new class26();
                                var71.field453 = var9;
                                var71.field450 = var9.field3415;
                                class49.field801.method12(var71, 12);
                            }
                            var9.field3429 = class216.field3305;
                            if (var9.field3461 != null) {
                                for (int var72 = 0; var72 < class98.field1573; var72++) {
                                    class26 var73 = new class26();
                                    var73.field453 = var9;
                                    var73.field448 = class9.field150[var72];
                                    var73.field456 = class26.field445[var72];
                                    var73.field450 = var9.field3461;
                                    class49.field801.method12(var73, 12);
                                }
                            }
                            if (class53.field840 && var9.field3565 != null) {
                                class26 var74 = new class26();
                                var74.field453 = var9;
                                var74.field450 = var9.field3565;
                                class49.field801.method12(var74, 12);
                            }
                        }
                    }
                    if (!var9.field3441 && class113.field1747 == null && class106.field1666 == null && !class207.field3185) {
                        if ((var9.field3477 >= 0 || var9.field3540 != 0) && class171.field2587 >= var12 && class157.field2340 >= var13 && class171.field2587 < var14 && class157.field2340 < var15) {
                            if (var9.field3477 >= 0) {
                                class43.field729 = arg0[var9.field3477];
                            } else {
                                class43.field729 = var9;
                            }
                        }
                        if (var9.field3552 == 8 && class171.field2587 >= var12 && class157.field2340 >= var13 && class171.field2587 < var14 && class157.field2340 < var15) {
                            class101.field1581 = var9;
                        }
                        if (var9.field3460 > var9.field3561) {
                            class206.method1445(class157.field2340, class171.field2587, (byte) 113, var9, var9.field3460, var9.field3408 + var10, var9.field3561, var11);
                        }
                    }
                    if (var9.field3552 == 0) {
                        method1148(arg0, var9.field3554, var12, var13, var14, var15, var10 - var9.field3563, var11 - var9.field3569);
                        if (var9.field3526 != null) {
                            method1148(var9.field3526, var9.field3554, var12, var13, var14, var15, var10 - var9.field3563, var11 - var9.field3569);
                        }
                        class288 var75 = (class288) class48.field787.method2043((long) var9.field3554, -1);
                        if (var75 != null) {
                            class223.method1530((byte) -63, var15, var11, var10, var14, var13, var12, var75.field4505);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Lp;")
    public static final class303 method1149(int arg0) {
        if (arg0 != -3) {
            field2390 = null;
        }
        field2384++;
        return class92.field1467;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method1150(byte arg0, byte[] arg1) {
        field2403++;
        class31 var3 = new class31(arg1);
        if (arg0 <= 30) {
            return;
        }
        while (true) {
            int var4 = var3.method265(-116);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                var3.method260((byte) -67);
                var3.method260((byte) -67);
                var3.method260((byte) -67);
                var3.method260((byte) -67);
                var3.method260((byte) -67);
                var3.method260((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static void method1151(byte arg0) {
        field2390 = null;
        field2388 = null;
        if (arg0 >= -85) {
            method1149(88);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2387++;
        if (!this.method1108(89)) {
            return;
        }
        class127.field1908 = Integer.parseInt(this.getParameter("worldid"));
        class110.field1709 = Integer.parseInt(this.getParameter("modewhere"));
        if (class110.field1709 < 0 || class110.field1709 > 1) {
            class110.field1709 = 0;
        }
        class149.field2214 = Integer.parseInt(this.getParameter("modewhat"));
        if (class149.field2214 < 0 || class149.field2214 > 2) {
            class149.field2214 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class240.field3815 = true;
        } else {
            class240.field3815 = false;
        }
        try {
            class130.field1939 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class130.field1939 = 0;
        }
        class118.method859(class130.field1939, -4);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class298.field4809 = true;
        } else {
            class298.field4809 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class62.field983 = true;
        } else {
            class62.field983 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class152.field2248 = 1;
        } else {
            class152.field2248 = 0;
        }
        try {
            class178.field2734 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class178.field2734 = 0;
        }
        class253.field4038 = this.getParameter("settings");
        if (class253.field4038 == null) {
            class253.field4038 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class210.field3245 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class210.field3245 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class60.field958 = true;
        } else {
            class60.field958 = false;
        }
        class214.field3283 = this;
        this.method1119(0, 546, 503, 765, class149.field2214 + 32);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1117(int arg0) {
        field2383++;
        if (class23.field382 == 1000) {
            return;
        }
        if (arg0 != 11432) {
            method1145(-122, 76);
        }
        long var2 = class105.method796(arg0 ^ 0x2C93) / 1000000L - class105.field1634;
        class105.field1634 = class105.method796(arg0 ^ 0x2C93) / 1000000L;
        boolean var4 = class121.method918((byte) -18);
        if (var4 && class41.field697 && class304.field4889 != null) {
            class304.field4889.method578(256);
        }
        if ((class23.field382 == 30 || class23.field382 == 10) && (class128.field1917 || class154.field2307 != 0L && class242.method1650(80) > class154.field2307)) {
            class74.method581(class296.field4688, class128.field1917, class164.field2472, -4, class194.method1382(true));
        }
        if (class103.field1599 == null) {
            Container var5;
            if (class103.field1599 != null) {
                var5 = class103.field1599;
            } else if (class170.field2582 == null) {
                var5 = class123.field1863.field63;
            } else {
                var5 = class170.field2582;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class170.field2582 == var5) {
                Insets var8 = class170.field2582.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class305.field4898 != var6 || class15.field196 != var7) {
                if (class4.field59.startsWith("mac")) {
                    class15.field196 = var7;
                    class305.field4898 = var6;
                } else {
                    class31.method271(0);
                }
                class154.field2307 = class242.method1650(arg0 - 11352) + 500L;
            }
        }
        boolean var9 = false;
        if (class268.field4252) {
            var9 = true;
            class268.field4252 = false;
        }
        if (var9) {
            class33.method326(arg0 ^ 0xFFFFC9C6);
        }
        if (class23.field382 == 0) {
            class300.method2008(class79.field1208, (Color) null, class116.field1775, var9, true);
        } else if (class23.field382 == 5) {
            class191.method1360(false, class73.field1118, (byte) 71);
        } else if (class23.field382 == 10) {
            class194.method1386(true);
        } else if (class23.field382 == 25 || class23.field382 == 28) {
            if (class269.field4262 == 1) {
                if (class273.field4362 > class123.field1864) {
                    class123.field1864 = class273.field4362;
                }
                int var10 = (class123.field1864 - class273.field4362) * 50 / class123.field1864;
                class56.method469((byte) -97, false, class166.field2515 + "<br>(" + var10 + "%)");
            } else if (class269.field4262 == 2) {
                if (class3.field54 > class272.field4353) {
                    class272.field4353 = class3.field54;
                }
                int var11 = ((class272.field4353 - class3.field54) * 50 / class272.field4353) + 50;
                class56.method469((byte) -116, false, class166.field2515 + "<br>(" + var11 + "%)");
            } else {
                class56.method469((byte) -118, false, class166.field2515);
            }
        } else if (class23.field382 == 30) {
            class149.method1082((byte) 99, var2);
        } else if (class23.field382 == 40) {
            class56.method469((byte) -17, false, class285.field4485 + "<br>" + class142.field2120);
        }
        if ((class23.field382 == 30 || class23.field382 == 10) && class5.field79 == 0 && !var9) {
            try {
                Graphics var14 = class105.field1651.getGraphics();
                for (int var15 = 0; var15 < class126.field1895; var15++) {
                    if (class112.field1729[var15]) {
                        class143.field2140.method1460(class108.field1680[var15], arg0 ^ 0xFFFFD212, class281.field4437[var15], class185.field2917[var15], var14, class86.field1281[var15]);
                        class112.field1729[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class105.field1651.repaint();
            }
        } else if (class23.field382 != 0) {
            try {
                Graphics var12 = class105.field1651.getGraphics();
                class143.field2140.method1457(0, var12, (byte) 113, 0);
                for (int var13 = 0; var13 < class126.field1895; var13++) {
                    class112.field1729[var13] = false;
                }
            } catch (Exception var17) {
                class105.field1651.repaint();
            }
        }
        if (class95.field1532) {
            class150.method1085((byte) -121);
        }
        if (class57.field897 && class23.field382 == 10 && class298.field4803 != -1) {
            class57.field897 = false;
            class67.method543(class123.field1863, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1152(int arg0, int arg1) {
        class210.field3249.field1743++;
        field2381++;
        class23.field399 = null;
        int var3 = -60 % ((arg1 - 59) / 55);
        class210.field3249.field1744 = arg0;
        class18.field243 = null;
        class30.field507 = 0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1110(int arg0) {
        field2399++;
        if (class182.field2858 != null) {
            class182.field2858.field4528 = false;
        }
        class182.field2858 = null;
        if (class301.field4848 != null) {
            class301.field4848.method1306((byte) -115);
            class301.field4848 = null;
        }
        class223.method1535(28468, class105.field1651);
        class27.method222(true, class105.field1651);
        if (arg0 >= -24) {
            field2388 = null;
        }
        if (class104.field1622 != null) {
            class104.field1622.method615(class105.field1651, 0);
        }
        class60.method493((byte) -101);
        class222.method1526(123);
        class104.field1622 = null;
        if (class304.field4889 != null) {
            class304.field4889.method585(8);
        }
        if (class67.field1058 != null) {
            class67.field1058.method585(8);
        }
        class210.field3249.method832((byte) 9);
        class273.field4358.method359(-3);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1153(int arg0) {
        field2394++;
        if (!class57.field897) {
            label237: while (true) {
                do {
                    if (!class2.method7(-19877)) {
                        break label237;
                    }
                } while (class92.field1471 != 's' && class92.field1471 != 'S');
                class57.field897 = true;
            }
        }
        if (class178.field2733 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class242.method1650(53);
            if (class179.field2757 == 0L) {
                class179.field2757 = var4;
            }
            if (var3 > 16384 && (var4 - class179.field2757) < 5000L) {
                if (var4 - class69.field1085 > 1000L) {
                    System.gc();
                    class69.field1085 = var4;
                }
                class116.field1775 = class3.field47;
                class79.field1208 = 5;
            } else {
                class178.field2733 = 10;
                class79.field1208 = 5;
                class116.field1775 = class107.field1669;
            }
        } else if (class178.field2733 == arg0) {
            for (int var6 = 0; var6 < 4; var6++) {
                class80.field1236[var6] = new class89(104, 104);
            }
            class79.field1208 = 10;
            class116.field1775 = class83.field1253;
            class178.field2733 = 30;
        } else if (class178.field2733 == 30) {
            if (class35.field615 == null) {
                class35.field615 = new class201(class210.field3249, class273.field4358);
            }
            if (class35.field615.method1419((byte) -99)) {
                class104.field1631 = class296.method1977(true, 1000000, true, false, 0);
                class115.field1765 = class296.method1977(true, arg0 + 999990, true, false, 1);
                class221.field3383 = class296.method1977(false, 1000000, true, true, 2);
                class264.field4184 = class296.method1977(true, 1000000, true, false, 3);
                class150.field2231 = class296.method1977(true, 1000000, true, false, 4);
                class274.field4369 = class296.method1977(true, 1000000, true, true, 5);
                class205.field3153 = class296.method1977(true, 1000000, false, true, 6);
                class233.field3687 = class296.method1977(true, 1000000, true, false, 7);
                class246.field3910 = class296.method1977(true, 1000000, true, false, 8);
                class68.field1076 = class296.method1977(true, 1000000, true, false, 9);
                class77.field1176 = class296.method1977(true, 1000000, true, false, 10);
                class155.field2318 = class296.method1977(true, 1000000, true, false, 11);
                class114.field1750 = class296.method1977(true, 1000000, true, false, 12);
                class180.field2818 = class296.method1977(true, arg0 + 999990, true, false, 13);
                class162.field2423 = class296.method1977(true, 1000000, false, false, 14);
                class173.field2657 = class296.method1977(true, 1000000, true, false, 15);
                class33.field587 = class296.method1977(true, 1000000, true, false, 16);
                class123.field1856 = class296.method1977(true, 1000000, true, false, 17);
                class162.field2430 = class296.method1977(true, 1000000, true, false, 18);
                class112.field1725 = class296.method1977(true, 1000000, true, false, 19);
                class246.field3911 = class296.method1977(true, 1000000, true, false, 20);
                class104.field1625 = class296.method1977(true, 1000000, true, false, 21);
                class27.field460 = class296.method1977(true, 1000000, true, false, 22);
                class265.field4196 = class296.method1977(true, 1000000, true, true, 23);
                class126.field1899 = class296.method1977(true, 1000000, true, false, 24);
                class202.field3122 = class296.method1977(true, 1000000, true, false, 25);
                class252.field4020 = class296.method1977(true, arg0 ^ 0xF424A, true, true, 26);
                class142.field2130 = class296.method1977(true, 1000000, true, false, 27);
                class122.field1843 = class296.method1977(true, 1000000, true, true, 28);
                class79.field1208 = 15;
                class116.field1775 = class67.field1039;
                class178.field2733 = 40;
            } else {
                class79.field1208 = 12;
                class116.field1775 = class79.field1209;
            }
        } else if (class178.field2733 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class94.field1478[var8].method1756((byte) 126) * class30.field502[var8] / 100;
            }
            if (var7 == 100) {
                class79.field1208 = 20;
                class116.field1775 = class73.field1125;
                class30.method255(class246.field3910, false);
                class286.method1919(class246.field3910, (byte) -79);
                class63.method508(-103, class246.field3910);
                class178.field2733 = 41;
            } else {
                class79.field1208 = 20;
                if (var7 != 0) {
                    class116.field1775 = class259.field4104 + var7 + "%";
                }
            }
        } else if (class178.field2733 == 41) {
            if (class122.field1843.method718(-106)) {
                this.method1150((byte) 87, class122.field1843.method722(arg0 ^ 0x294A, 1));
                class79.field1208 = 25;
                class178.field2733 = 45;
                class116.field1775 = class162.field2436;
            } else {
                class116.field1775 = class283.field4462 + class122.field1843.method709((byte) 95) + "%";
                class79.field1208 = 25;
            }
        } else if (class178.field2733 == 45) {
            class43.method376((byte) 99, class189.field2971, 22050, 2);
            class69.field1087 = new class20();
            class69.field1087.method143(false, 128, 9);
            class304.field4889 = class109.method816(class123.field1863, 22050, 52, class105.field1651, 0);
            class304.field4889.method583(-16385, class69.field1087);
            class252.method1707(class173.field2657, class162.field2423, class150.field2231, -5606, class69.field1087);
            class67.field1058 = class109.method816(class123.field1863, 2048, 104, class105.field1651, 1);
            class83.field1251 = new class29();
            class67.field1058.method583(-16385, class83.field1251);
            class182.field2875 = new class125(22050, class174.field2695);
            class174.field2694 = class205.field3153.method717(104, "scape main");
            class79.field1208 = 30;
            class116.field1775 = class172.field2589;
            class178.field2733 = 50;
        } else if (class178.field2733 == 50) {
            int var9 = class8.method54(class180.field2818, class246.field3910, (byte) -39);
            int var10 = class110.method820((byte) 26);
            if (var9 < var10) {
                class116.field1775 = class26.field446 + var9 * 100 / var10 + "%";
                class79.field1208 = 35;
            } else {
                class116.field1775 = class31.field549;
                class178.field2733 = 60;
                class79.field1208 = 35;
            }
        } else if (class178.field2733 == 60) {
            int var11 = class214.method1477(class246.field3910, 85);
            int var12 = class107.method807(arg0 + 116);
            if (var12 > var11) {
                class79.field1208 = 40;
                class116.field1775 = class114.field1758 + var11 * 100 / var12 + "%";
            } else {
                class116.field1775 = class104.field1623;
                class79.field1208 = 40;
                class178.field2733 = 65;
            }
        } else if (class178.field2733 == 65) {
            class181.method1298((byte) -97, class246.field3910, class180.field2818);
            class79.field1208 = 45;
            class116.field1775 = class8.field135;
            class248.method1679(5, 2);
            class178.field2733 = 70;
        } else if (class178.field2733 == 70) {
            byte var13 = 0;
            class221.field3383.method718(-88);
            int var14 = var13 + class221.field3383.method709((byte) 95);
            class33.field587.method718(-112);
            int var15 = var14 + class33.field587.method709((byte) 95);
            class123.field1856.method718(arg0 - 114);
            int var16 = var15 + class123.field1856.method709((byte) 95);
            class162.field2430.method718(-80);
            int var17 = var16 + class162.field2430.method709((byte) 95);
            class112.field1725.method718(-87);
            int var18 = var17 + class112.field1725.method709((byte) 95);
            class246.field3911.method718(-96);
            int var19 = var18 + class246.field3911.method709((byte) 95);
            class104.field1625.method718(-83);
            int var20 = var19 + class104.field1625.method709((byte) 95);
            class27.field460.method718(-126);
            int var21 = var20 + class27.field460.method709((byte) 95);
            class126.field1899.method718(-87);
            int var22 = var21 + class126.field1899.method709((byte) 95);
            class202.field3122.method718(-120);
            int var23 = var22 + class202.field3122.method709((byte) 95);
            class142.field2130.method718(-102);
            int var24 = var23 + class142.field2130.method709((byte) 95);
            if (var24 < 1100) {
                class79.field1208 = 50;
                class116.field1775 = class75.field1170 + var24 / 11 + "%";
            } else {
                class166.method1211(class221.field3383, -121);
                class116.method854(arg0 - 7, class221.field3383);
                class237.method1622(class221.field3383, 106);
                class37.method343(class221.field3383, class233.field3687, arg0 ^ 0xFFFF9CE2);
                class147.method1059(class33.field587, true, 0, class233.field3687);
                class195.method1396(arg0 - 6, class162.field2430, class233.field3687);
                class46.method391(126, class112.field1725, class233.field3687, true, class168.field2528);
                class300.method2014((byte) -110, class221.field3383);
                class192.method1362(class104.field1631, 90, class246.field3911, class115.field1765);
                class70.method560(class221.field3383, false);
                class194.method1376(class104.field1625, class233.field3687, 57);
                class295.method1957(class27.field460, (byte) 2);
                class194.method1387(class221.field3383, -123);
                method1143(true, class233.field3687, class264.field4184, class180.field2818, class246.field3910);
                class151.method1095((byte) 69, class221.field3383);
                class291.method1933(class123.field1856, 1954);
                class167.method1212(class202.field3122, class126.field1899, arg0 ^ 0xB, new class155());
                class74.method577(class202.field3122, 96, class126.field1899);
                class250.method1704(5969, class221.field3383);
                class190.method1355((byte) -126, class221.field3383);
                class126.method944((byte) 124, class221.field3383);
                class199.method1408(class221.field3383, (byte) -8, class246.field3910);
                class247.method1670(class221.field3383, class246.field3910, 123);
                class79.field1208 = 50;
                class116.field1775 = class296.field4746;
                class3.method15(-20827);
                class178.field2733 = 80;
            }
        } else if (class178.field2733 == 80) {
            int var25 = class47.method398(0, class246.field3910);
            int var26 = class174.method1242((byte) 101);
            if (var25 < var26) {
                class79.field1208 = 60;
                class116.field1775 = class22.field372 + var25 * 100 / var26 + "%";
            } else {
                class52.method446(class246.field3910, 41);
                class178.field2733 = 90;
                class116.field1775 = class297.field4790;
                class79.field1208 = 60;
            }
        } else if (class178.field2733 == 90) {
            if (class252.field4020.method718(-91)) {
                class293 var27 = new class293(class68.field1076, class252.field4020, class246.field3910, 20, !class201.field3105);
                class224.method1551(var27);
                if (class150.field2228 == 1) {
                    class224.method1555(0.9F);
                }
                if (class150.field2228 == 2) {
                    class224.method1555(0.8F);
                }
                if (class150.field2228 == 3) {
                    class224.method1555(0.7F);
                }
                if (class150.field2228 == 4) {
                    class224.method1555(0.6F);
                }
                class79.field1208 = 70;
                class178.field2733 = 100;
                class116.field1775 = class291.field4523;
            } else {
                class116.field1775 = class164.field2485 + class252.field4020.method709((byte) 95) + "%";
                class79.field1208 = 70;
            }
        } else if (class178.field2733 == 100) {
            if (class250.method1698(class246.field3910, 2)) {
                class178.field2733 = 110;
            }
        } else if (class178.field2733 == 110) {
            class182.field2858 = new class292();
            class123.field1863.method25(false, class182.field2858, 10);
            class178.field2733 = 120;
            class79.field1208 = 75;
            class116.field1775 = class151.field2233;
        } else if (class178.field2733 == 120) {
            if (class77.field1176.method711("huffman", -4786, "")) {
                class53 var28 = new class53(class77.field1176.method703("huffman", "", true));
                class286.method1920((byte) -46, var28);
                class79.field1208 = 80;
                class116.field1775 = class265.field4187;
                class178.field2733 = 130;
            } else {
                class79.field1208 = 80;
                class116.field1775 = class262.field4134 + "0%";
            }
        } else if (class178.field2733 == 130) {
            if (!class264.field4184.method718(-127)) {
                class116.field1775 = class64.field1021 + class264.field4184.method709((byte) 95) * 3 / 4 + "%";
                class79.field1208 = 85;
            } else if (!class114.field1750.method718(-82)) {
                class116.field1775 = class64.field1021 + (class114.field1750.method709((byte) 95) / 10 + 75) + "%";
                class79.field1208 = 85;
            } else if (!class180.field2818.method718(-110)) {
                class116.field1775 = class64.field1021 + (class180.field2818.method709((byte) 95) / 20 + 85) + "%";
                class79.field1208 = 85;
            } else if (class265.field4196.method705("details", (byte) 127)) {
                class95.method743(class265.field4196, class18.field251, (byte) -42);
                class249.method1682(class142.field2130);
                class146.method1054(class233.field3687);
                class116.field1775 = class131.field1945;
                class79.field1208 = 95;
                class178.field2733 = 135;
            } else {
                class116.field1775 = class64.field1021 + ((class265.field4196.method719((byte) 113, "details") / 10) + 90) + "%";
                class79.field1208 = 85;
            }
        } else if (class178.field2733 == 135) {
            int var29 = class127.method951((byte) 39);
            if (var29 == -1) {
                class79.field1208 = 95;
                class116.field1775 = class290.field4512;
            } else if (var29 == 7 || var29 == 9) {
                this.method1115("worldlistfull", true);
                class248.method1679(1000, 2);
            } else if (class179.field2759) {
                class116.field1775 = class159.field2377;
                class178.field2733 = 140;
                class79.field1208 = 96;
            } else {
                this.method1115("worldlistio_" + var29, true);
                class248.method1679(1000, 2);
            }
        } else if (class178.field2733 == 140) {
            class184.field2903 = class264.field4184.method717(arg0 + 94, "loginscreen");
            class274.field4369.method706(false, true, true);
            class205.field3153.method706(true, true, true);
            class246.field3910.method706(true, true, true);
            class180.field2818.method706(true, true, true);
            class77.field1176.method706(true, true, true);
            class264.field4184.method706(true, true, true);
            class116.field1775 = class84.field1260;
            class178.field2733 = 150;
            class79.field1208 = 97;
            class95.field1532 = true;
        } else if (class178.field2733 == 150) {
            if (class57.field897) {
                class42.field709 = 0;
                class52.field825 = 0;
                class84.field1259 = 0;
                class94.field1483 = 0;
            }
            class57.field897 = true;
            class67.method543(class123.field1863, (byte) -33);
            class74.method581(-1, false, -1, -4, class42.field709);
            class116.field1775 = class156.field2331;
            class178.field2733 = 160;
            class79.field1208 = 100;
        } else if (class178.field2733 == 160) {
            class120.method912(-3, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1123(byte arg0) {
        method1151((byte) -118);
        class249.method1697();
        class248.method1678(9);
        field2391++;
        class172.method1235(-1);
        class178.method1263((byte) 117);
        class303.method2032(18);
        class297.method1996(true);
        class145.method1052((byte) -24);
        class196.method1399(0);
        class261.method1751(-46);
        class47.method395(arg0 - 209);
        class154.method1109((byte) -128);
        class113.method842(121);
        class272.method1865((byte) -12);
        class292.method1937(false);
        class173.method1239(arg0 - 14441);
        class31.method297(false);
        class182.method1307((byte) 38);
        class112.method830(true);
        class41.method363(true);
        class201.method1422(157);
        class262.method1752(arg0 ^ 0xFFFFE11C);
        class92.method726(123);
        class23.method208((byte) -125);
        class54.method457(arg0 + 64905);
        class162.method1177(0);
        class161.method1163((byte) 19);
        class263.method1767((byte) 58);
        class89.method682(false);
        class222.method1512((byte) -51);
        class136.method1007(true);
        class2.method3(0);
        class213.method1475((byte) -110);
        class78.method612(arg0 - 214);
        class156.method1130((byte) -85);
        class204.method1435(false);
        class20.method176((byte) 127);
        class74.method589((byte) -101);
        class125.method939(arg0 - 27);
        class186.method1326((byte) -75);
        class103.method785(arg0 - 95);
        class296.method1971((byte) 53);
        class22.method194(0);
        class295.method1959(false);
        class221.method1511((byte) -128);
        class95.method746(6642);
        class288.method1924(false);
        class28.method228(67);
        class134.method996(arg0 - 222);
        class79.method618(-1942);
        class24.method212(arg0 + 8971);
        class151.method1094((byte) 122);
        class50.method417((byte) -122);
        class234.method1606((byte) -125);
        class185.method1320(100);
        class299.method2007((byte) -121);
        class304.method2040((byte) -123);
        class143.method1045(19);
        class215.method1484(16761);
        class131.method969(0);
        class269.method1821(1);
        class203.method1431((byte) -128);
        class137.method1018(false);
        if (arg0 != 95) {
            field2385 = -56;
        }
        class102.method777(arg0 + 9);
        class30.method250((byte) 49);
        class232.method1597(-1);
        class294.method1948(arg0 ^ 0xFFFFF456);
        class170.method1226(-123);
        class274.method1872(false);
        class5.method36((byte) 118);
        class271.method1837();
        class27.method224(false);
        class179.method1282((byte) -15);
        class87.method661();
        class214.method1478(true);
        class255.method1725(1);
        class246.method1667(101);
        class104.method795(false);
        class52.method444(21);
        class115.method848((byte) -20);
        class9.method58(arg0 - 95);
        class267.method1806();
        class70.method561(-111);
        class45.method386(1);
        class165.method1201();
        class39.method350(0);
        class42.method368(-88);
        class94.method735((byte) 92);
        class227.method1568();
        class76.method596((byte) 63);
        class85.method652(-1);
        class75.method593((byte) -13);
        class66.method536();
        class40.method353(arg0 - 14);
        class180.method1287((byte) 127);
        class238.method1629(-101);
        class192.method1364((byte) -83);
        class226.method1559(false);
        class129.method957(128);
        class194.method1383(29);
        class157.method1137(true);
        class150.method1089(0);
        class36.method337(-2918);
        class202.method1427((byte) 90);
        class241.method1645((byte) 85);
        class206.method1447(-34);
        class250.method1702(2);
        class127.method947(-1);
        class146.method1055();
        class237.method1624(31953);
        class231.method1592(85);
        class147.method1072((byte) -110);
        class155.method1125(-8412);
        class308.method2065(63);
        class175.method1252((byte) 48);
        class275.method1880();
        class123.method927(0);
        class205.method1438(arg0 - 64);
        class130.method959((byte) -99);
        class35.method334(100);
        class293.method1944(0);
        class189.method1352(true);
        class181.method1291((byte) -118);
        class176.method1259((byte) -63);
        class32.method318();
        class224.method1537();
        class168.method1215(2);
        class73.method574(63);
        class260.method1744((byte) 88);
        class98.method762(33);
        class265.method1778(-740574905);
        class107.method809(-99);
        class284.method1916((byte) 88);
        class121.method913(false);
        class26.method219(arg0 + 1953);
        class55.method466(true);
        class58.method477(false);
        class19.method142((byte) -5);
        class207.method1448((byte) 112);
        class163.method1181(255);
        class56.method468(68);
        class106.method804(arg0 - 70);
        class153.method1104((byte) -5);
        class122.method923(0);
        class1.method1();
        class8.method53((byte) -64);
        class276.method1886(arg0 - 31);
        class117.method858(-1526);
        class158.method1138();
        class44.method380((byte) -65);
        class264.method1773((byte) 110);
        class290.method1929(arg0 ^ 0x60);
        class140.method1024(104);
        class69.method552(0);
        class198.method1406(false);
        class80.method631(true);
        class91.method693((byte) -116);
        class219.method1503(-1);
        class16.method126();
        class280.method1899(127);
        class49.method411(-1);
        class46.method389(-104);
        class236.method1616(-20708);
        class240.method1641((byte) 116);
        class167.method1214(true);
        class244.method1657(false);
        class220.method1506(arg0 - 215);
        class67.method541(128);
        class273.method1869((byte) -35);
        class43.method375(-125);
        class190.method1356((byte) 126);
        class283.method1911((byte) 115);
        class15.method120(1);
        class191.method1359((byte) -64);
        class208.method1455((byte) 59);
        class291.method1932(true);
        class184.method1319(false);
        class286.method1921(-51);
        class188.method1343(true);
        class101.method776(-5508);
        class97.method755();
        class169.method1220((byte) -90);
        class230.method1584(1504);
        class306.method2052(true);
        class229.method1580((byte) -67);
        class247.method1675((byte) -79);
        class7.method46(64);
        class21.method190();
        class124.method934();
        class63.method507(14145);
        class109.method814(true);
        class218.method1500(40);
        class108.method812((byte) 52);
        class132.method985();
        class187.method1339();
        class77.method603(-113);
        class148.method1076(15);
        class279.method1895(255);
        class223.method1532(false);
        class268.method1814((byte) 121);
        class235.method1609(-93);
        class171.method1231(62);
        class298.method2001(true);
        class105.method801(true);
        class48.method408((byte) -49);
        class133.method994(arg0 - 95);
        class197.method1401((byte) 12);
        class183.method1315(arg0 + 22);
        class118.method864(true);
        class33.method324(-83);
        class149.method1080(arg0 + 24210);
        class216.method1490((byte) 88);
        class6.method42(arg0 ^ 0x6978);
        class193.method1374((byte) -120);
        class257.method1737((byte) 65);
        class278.method1892(-1938190068);
        class142.method1039((byte) -3);
        class68.method549((byte) -117);
        class195.method1392(false);
        class18.method139(arg0 ^ 0x5F);
        class270.method1828((byte) 125);
        class152.method1101((byte) 11);
        class61.method494((byte) -23);
        class164.method1185(arg0 ^ 0x5F00);
        class114.method844(true);
        class64.method512(arg0 ^ 0x1A0);
        class259.method1740(0);
        class116.method852(0);
        class166.method1208((byte) 107);
        class233.method1601((byte) -117);
        class138.method1020((byte) 62);
        class120.method908(-122);
        class254.method1716(2);
        class277.method1891(false);
        class86.method653((byte) 68);
        class60.method492(false);
        class141.method1028(-31269);
        class174.method1243((byte) -31);
        class285.method1917(-68);
        class252.method1706(8679);
        class88.method669(arg0 ^ 0xFFFFC4B1);
        class301.method2022(-1);
        class126.method943(63);
        class281.method1906(arg0 ^ 0x1308BEB3);
        class253.method1711((byte) -116);
        class82.method640(-8);
        class14.method111((byte) -121);
        class200.method1415(-6);
        class3.method14(125);
        class128.method953((byte) -63);
        class57.method476(0);
        class282.method1908(true);
        class307.method2056((byte) 104);
        class135.method1002(false);
        class266.method1783(106);
        class159.method1139(arg0 - 94);
        class83.method644(false);
        class199.method1409((byte) -16);
        class84.method647(0);
        class210.method1466(true);
        class211.method1468((byte) 72);
        class62.method500((byte) -97);
        class110.method818(1878896812);
        class300.method2010((byte) -55);
        if (class154.field2308) {
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method1154(int arg0) {
        field2398++;
        if (class210.field3249.field1743 > class37.field638) {
            if (class270.field4283 == class153.field2259) {
                class153.field2259 = class235.field3707;
            } else {
                class153.field2259 = class270.field4283;
            }
            class75.field1166 = (class210.field3249.field1743 * 50 - 50) * 5;
            if (class75.field1166 > 3000) {
                class75.field1166 = 3000;
            }
            if (class210.field3249.field1743 >= 2 && class210.field3249.field1744 == 6) {
                this.method1115("js5connect_outofdate", true);
                class23.field382 = 1000;
                return;
            }
            if (class210.field3249.field1743 >= 4 && class210.field3249.field1744 == -1) {
                this.method1115("js5crc", true);
                class23.field382 = 1000;
                return;
            }
            if (class210.field3249.field1743 >= 4 && (class23.field382 == 0 || class23.field382 == 5)) {
                if (class210.field3249.field1744 == 7 || class210.field3249.field1744 == 9) {
                    this.method1115("js5connect_full", true);
                } else if (class210.field3249.field1744 > 0) {
                    this.method1115("js5connect", true);
                } else {
                    this.method1115("js5io", true);
                }
                class23.field382 = 1000;
                return;
            }
        }
        class37.field638 = class210.field3249.field1743;
        if (arg0 < class75.field1166) {
            class75.field1166--;
            return;
        }
        try {
            if (class30.field507 == 0) {
                class23.field399 = class123.field1863.method30(class214.field3286, class153.field2259, (byte) 3);
                class30.field507++;
            }
            if (class30.field507 == 1) {
                if (class23.field399.field2082 == 2) {
                    this.method1152(1000, -31);
                    return;
                }
                if (class23.field399.field2082 == 1) {
                    class30.field507++;
                }
            }
            if (class30.field507 == 2) {
                class18.field243 = new class182((Socket) class23.field399.field2080, class123.field1863);
                class31 var2 = new class31(5);
                var2.method305(15, true);
                var2.method258(546, -1527329320);
                class18.field243.method1299(0, 5, var2.field560, (byte) 125);
                class30.field507++;
                class261.field4125 = class242.method1650(119);
            }
            if (class30.field507 == 3) {
                if (class23.field382 == 0 || class23.field382 == 5 || class18.field243.method1302(arg0 - 90) > 0) {
                    int var3 = class18.field243.method1309((byte) -123);
                    if (var3 != 0) {
                        this.method1152(var3, -19);
                        return;
                    }
                    class30.field507++;
                } else if ((class242.method1650(arg0 ^ 0x1B) - class261.field4125) > 30000L) {
                    this.method1152(1001, 120);
                    return;
                }
            }
            if (class30.field507 == 4) {
                boolean var4 = class23.field382 == 5 || class23.field382 == 10 || class23.field382 == 28;
                class210.field3249.method827(94, class18.field243, !var4);
                class18.field243 = null;
                class23.field399 = null;
                class30.field507 = 0;
            }
        } catch (IOException var5) {
            this.method1152(1002, 115);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILub;)Z")
    public static final boolean method1155(int arg0, int arg1, class92 arg2) {
        if (arg1 != 9) {
            main((String[]) null);
        }
        field2393++;
        byte[] var3 = arg2.method722(10560, arg0);
        if (var3 == null) {
            return false;
        } else {
            class6.method41(var3, 125);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1113(int arg0) {
        field2402++;
        class31.method271(arg0 ^ arg0);
        class273.field4358 = new class41();
        class210.field3249 = new class112();
        if (class149.field2214 != 0) {
            class6.field83 = new byte[50][];
        }
        class116.method855(false, class123.field1863);
        if (class110.field1709 == 0) {
            class211.field3250 = this.getCodeBase().getHost();
            class211.field3256 = 443;
            class95.field1498 = 43594;
        } else if (class110.field1709 == 1) {
            class211.field3250 = this.getCodeBase().getHost();
            class211.field3256 = class127.field1908 + 50000;
            class95.field1498 = class127.field1908 + 40000;
        } else if (class110.field1709 == 2) {
            class211.field3250 = "127.0.0.1";
            class211.field3256 = class127.field1908 + 50000;
            class95.field1498 = class127.field1908 + 40000;
        }
        class197.field3075 = class62.field970 = class307.field4927 = class193.field3025 = new short[256];
        class235.field3707 = class211.field3256;
        if (class4.field60 == 3 && class110.field1709 != 2) {
            class49.field807 = class127.field1908;
        }
        if (class152.field2248 == 1) {
            class127.field1912 = class208.field3216;
            class101.field1582 = true;
            class163.field2467 = class83.field1247;
            class107.field1673 = class118.field1790;
            class74.field1145 = class215.field3292;
        } else {
            class107.field1673 = class210.field3248;
            class163.field2467 = class292.field4539;
            class74.field1145 = class266.field4200;
            class127.field1912 = class105.field1647;
        }
        class154.field2300 = class95.field1498;
        class153.field2259 = class154.field2300;
        class270.field4283 = class95.field1498;
        class214.field3286 = class211.field3250;
        class105.method800(false);
        class297.method1989((byte) 80, class105.field1651);
        class133.method986(class105.field1651, false);
        class104.field1622 = class3.method16(-112);
        if (class104.field1622 != null) {
            class104.field1622.method608(class105.field1651, 17148);
        }
        class123.field1853 = class4.field60;
        try {
            if (class123.field1863.field69 != null) {
                class64.field1016 = new class23(class123.field1863.field69, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class109.field1687[var2] = new class23(class123.field1863.field57[var2], 6000, 0);
                }
                class62.field971 = new class23(class123.field1863.field66, 6000, 0);
                class15.field182 = new class54(255, class64.field1016, class62.field971, 500000);
                class75.field1169 = new class23(class123.field1863.field72, 24, 0);
                class123.field1863.field72 = null;
                class123.field1863.field69 = null;
                class123.field1863.field57 = null;
                class123.field1863.field66 = null;
            }
        } catch (IOException var3) {
            class75.field1169 = null;
            class15.field182 = null;
            class62.field971 = null;
            class64.field1016 = null;
        }
        if (class110.field1709 != 0) {
            class86.field1276 = true;
        }
        if (class152.field2248 == 0) {
            class95.field1545 = class183.field2884;
        } else if (class152.field2248 == 1) {
            class95.field1545 = class3.field50;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)I")
    public static final int method1156(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -33) {
            method1149(68);
        }
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        field2392++;
        return (arg3 >> 1) + ((arg0 >> 2 << 10) + (arg2 >> 5 << 7));
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method1157(int arg0) {
        if (arg0 != -5) {
            return;
        }
        field2389++;
        for (class98.field1573 = 0; class2.method7(-19877) && class98.field1573 < 128; class98.field1573++) {
            class9.field150[class98.field1573] = class172.field2628;
            class26.field445[class98.field1573] = class92.field1471;
        }
        class209.field3230++;
        if (class298.field4803 != -1) {
            class223.method1530((byte) -63, class163.field2449, 0, 0, class179.field2816, 0, 0, class298.field4803);
        }
        class216.field3305++;
        if (class152.field2248 == 0) {
            class46.method388(arg0 + 89);
        } else if (class278.field4411 == 0 && class128.field1918 == 0) {
            if (class175.field2704 == 2) {
                class188.method1344(0);
            } else {
                class114.method846(false);
            }
            if ((class226.field3616 >> 7) < 14 || class226.field3616 >> 7 >= 90 || class118.field1787 >> 7 < 14 || class118.field1787 >> 7 >= 90) {
                class233.method1600((byte) 116);
            }
        }
        while (true) {
            class26 var2;
            class222 var3;
            class222 var4;
            do {
                var2 = (class26) class49.field802.method8(arg0 ^ 0xFFFFFFFC);
                if (var2 == null) {
                    while (true) {
                        class26 var5;
                        class222 var6;
                        class222 var7;
                        do {
                            var5 = (class26) class154.field2306.method8(7);
                            if (var5 == null) {
                                while (true) {
                                    class26 var8;
                                    class222 var9;
                                    class222 var10;
                                    do {
                                        var8 = (class26) class49.field801.method8(7);
                                        if (var8 == null) {
                                            if (class113.field1747 != null) {
                                                class199.method1410(0);
                                            }
                                            if (class82.field1239 != null && class82.field1239.field2082 == 1) {
                                                if (class82.field1239.field2080 != null) {
                                                    class118.method865(47, class58.field937, class290.field4514);
                                                }
                                                class82.field1239 = null;
                                                class58.field937 = null;
                                                class290.field4514 = false;
                                            }
                                            if ((class41.field686 % 1500) == 0) {
                                                class56.method472(-3);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field453;
                                        if (var9.field3411 < 0) {
                                            break;
                                        }
                                        var10 = class169.method1217(var9.field3392, 12180);
                                    } while (var10 == null || var10.field3526 == null || var9.field3411 >= var10.field3526.length || var10.field3526[var9.field3411] != var9);
                                    class15.method116(arg0 ^ 0xFFFFFFF3, var8);
                                }
                            }
                            var6 = var5.field453;
                            if (var6.field3411 < 0) {
                                break;
                            }
                            var7 = class169.method1217(var6.field3392, 12180);
                        } while (var7 == null || var7.field3526 == null || var7.field3526.length <= var6.field3411 || var7.field3526[var6.field3411] != var6);
                        class15.method116(arg0 + 13, var5);
                    }
                }
                var3 = var2.field453;
                if (var3.field3411 < 0) {
                    break;
                }
                var4 = class169.method1217(var3.field3392, 12180);
            } while (var4 == null || var4.field3526 == null || var4.field3526.length <= var3.field3411 || var4.field3526[var3.field3411] != var3);
            class15.method116(8, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1158(int arg0, Throwable arg1) throws IOException {
        if (arg0 != 25169) {
            method1149(-15);
        }
        String var2;
        if ((arg1 instanceof class59)) {
            class59 var3 = (class59) arg1;
            var2 = var3.field945 + " | ";
            arg1 = var3.field944;
        } else {
            var2 = "";
        }
        field2382++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lcc;)Lcd;")
    public static final class28 method1159(class222 arg0) {
        class28 var1 = (class28) class45.field760.method2043(((long) arg0.field3554 << 32) + (long) arg0.field3411, -1);
        return var1 == null ? arg0.field3424 : var1;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class109.method817((byte) 88, "argument count");
            }
            class127.field1908 = Integer.parseInt(arg0[0]);
            class110.field1709 = 2;
            if (arg0[1].equals("live")) {
                class149.field2214 = 0;
            } else if (arg0[1].equals("rc")) {
                class149.field2214 = 1;
            } else if (arg0[1].equals("wip")) {
                class149.field2214 = 2;
            } else {
                class109.method817((byte) 116, "modewhat");
            }
            class240.field3815 = false;
            class130.field1939 = class284.method1915(arg0[2], 50);
            if (class130.field1939 == -1) {
                if (arg0[2].equals("english")) {
                    class130.field1939 = 0;
                } else if (arg0[2].equals("german")) {
                    class130.field1939 = 1;
                } else {
                    class109.method817((byte) 78, "language");
                }
            }
            class118.method859(class130.field1939, -4);
            class62.field983 = false;
            class298.field4809 = false;
            if (arg0[3].equals("game0")) {
                class152.field2248 = 0;
            } else if (arg0[3].equals("game1")) {
                class152.field2248 = 1;
            } else {
                class109.method817((byte) 87, "game");
            }
            class60.field958 = false;
            class178.field2734 = 0;
            class253.field4038 = "";
            class210.field3245 = 0;
            client var1 = new client();
            class214.field3283 = var1;
            var1.method1121(class152.field2248 == 1 ? "mechscape" : "runescape", 768, 1024, 1, false, class149.field2214 + 32, 546, 29);
            class170.field2582.setLocation(40, 40);
        } catch (Exception var3) {
            class79.method624((String) null, var3, 0);
        }
        field2396++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1107(int arg0) {
        field2397++;
        if (class23.field382 == 1000) {
            return;
        }
        class41.field686++;
        if (arg0 != -26) {
            return;
        }
        if ((class41.field686 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class272.field4352 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class230.field3644.setSeed((long) class272.field4352);
        }
        this.method1147((byte) -54);
        if (class35.field615 != null) {
            class35.field615.method1421(0);
        }
        class308.method2062((byte) 104);
        class102.method778(-9546);
        class45.method384(54);
        class188.method1342((byte) -54);
        if (class104.field1622 != null) {
            int var3 = class104.field1622.method609(120);
            class8.field133 = var3;
        }
        if (class23.field382 == 0) {
            this.method1153(10);
            class301.method2018(4096);
        } else if (class23.field382 == 5) {
            this.method1153(10);
            class301.method2018(4096);
        } else if (class23.field382 == 25 || class23.field382 == 28) {
            class92.method713(true);
        }
        if (class23.field382 == 10) {
            this.method1157(-5);
            class44.method378(-102);
            class276.method1888(-126);
            class134.method998((byte) 85);
        } else if (class23.field382 == 30) {
            class153.method1105(3248);
        } else if (class23.field382 == 40) {
            class134.method998((byte) 104);
            if (class129.field1921 != -3) {
                if (class129.field1921 == 15) {
                    class273.method1867((byte) -1);
                } else if (class129.field1921 != 2) {
                    class252.method1710(0);
                    return;
                }
                return;
            }
        }
    }
}
