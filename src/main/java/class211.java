import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class211 extends class63 {

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3560 = "Attack";

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3562 = "Loaded world list data";

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3564 = 0;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3561 = 0;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Llk;")
    public static class174 field3559;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "[[[B")
    public static byte[][][] field3567;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V")
    public static final void method1411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 16 % ((35 - arg0) / 53);
        for (int var7 = arg3; var7 <= arg2 + arg3; var7++) {
            for (int var12 = arg1; var12 <= (arg1 + arg5); var12++) {
                if (var12 >= 0 && var12 < 104 && var7 >= 0 && var7 < 104) {
                    class177.field2912[arg4][var12][var7] = 127;
                }
            }
        }
        for (int var8 = arg3; var8 < arg2 + arg3; var8++) {
            for (int var11 = arg1; var11 < (arg1 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var8 >= 0 && var8 < 104) {
                    class95.field1642[arg4][var11][var8] = arg4 > 0 ? class95.field1642[arg4 - 1][var11][var8] : 0;
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg3 + 1; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class95.field1642[arg4][arg1][var9] = class95.field1642[arg4][arg1 - 1][var9];
                }
            }
        }
        field3558++;
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg1 + 1; var10 < (arg1 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class95.field1642[arg4][var10][arg3] = class95.field1642[arg4][var10][arg3 - 1];
                }
            }
        }
        if (arg1 < 0 || arg3 < 0 || arg1 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 > 0 && class95.field1642[arg4][arg1 - 1][arg3] != 0) {
                class95.field1642[arg4][arg1][arg3] = class95.field1642[arg4][arg1 - 1][arg3];
                return;
            }
            if (arg3 <= 0 || class95.field1642[arg4][arg1][arg3 - 1] == 0) {
                if (arg1 > 0 && arg3 > 0 && class95.field1642[arg4][arg1 - 1][arg3 - 1] != 0) {
                    class95.field1642[arg4][arg1][arg3] = class95.field1642[arg4][arg1 - 1][arg3 - 1];
                    return;
                }
                return;
            }
            class95.field1642[arg4][arg1][arg3] = class95.field1642[arg4][arg1][arg3 - 1];
        } else if (arg1 <= 0 || class95.field1642[arg4 - 1][arg1 - 1][arg3] == class95.field1642[arg4][arg1 - 1][arg3]) {
            if (arg3 > 0 && class95.field1642[arg4 - 1][arg1][arg3 - 1] != class95.field1642[arg4][arg1][arg3 - 1]) {
                class95.field1642[arg4][arg1][arg3] = class95.field1642[arg4][arg1][arg3 - 1];
                return;
            }
            if (arg1 > 0 && arg3 > 0 && class95.field1642[arg4 - 1][arg1 - 1][arg3 - 1] != class95.field1642[arg4][arg1 - 1][arg3 - 1]) {
                class95.field1642[arg4][arg1][arg3] = class95.field1642[arg4][arg1 - 1][arg3 - 1];
                return;
            }
        } else {
            class95.field1642[arg4][arg1][arg3] = class95.field1642[arg4][arg1 - 1][arg3];
            return;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1412(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class142.field2447++;
        class201.field3309 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class73.field1201; var12 < class193.field3126; var12++) {
            class109[][] var38 = class79.field1367[var12];
            for (int var39 = class90.field1601; var39 < class37.field546; var39++) {
                for (int var40 = class153.field2564; var40 < class229.field3860; var40++) {
                    class109 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class176.field2892[var39 + class151.field2536 - class184.field2994][var40 + class151.field2536 - class102.field1795] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1955 = true;
                            var41.field1963 = true;
                            if (var41.field1968 > 0) {
                                var41.field1964 = true;
                            } else {
                                var41.field1964 = false;
                            }
                            class201.field3309++;
                        } else {
                            var41.field1955 = false;
                            var41.field1963 = false;
                            var41.field1967 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1957 != null) {
                                    class212 var42 = var41.field1957;
                                    var42.field3572.method226(0, var12, var42.field3573, var42.field3581, var42.field3574);
                                    if (var42.field3575 != null) {
                                        var42.field3575.method226(0, var12, var42.field3573, var42.field3581, var42.field3574);
                                    }
                                }
                                if (var41.field1976 != null) {
                                    class223 var43 = var41.field1976;
                                    var43.field3764.method226(var43.field3762, var12, var43.field3763, var43.field3766, var43.field3760);
                                    if (var43.field3753 != null) {
                                        var43.field3753.method226(var43.field3762, var12, var43.field3763, var43.field3766, var43.field3760);
                                    }
                                }
                                if (var41.field1978 != null) {
                                    class11 var44 = var41.field1978;
                                    var44.field158.method226(0, var12, var44.field163, var44.field161, var44.field154);
                                }
                                if (var41.field1961 != null) {
                                    for (int var45 = 0; var45 < var41.field1968; var45++) {
                                        class173 var46 = var41.field1961[var45];
                                        var46.field2842.method226(var46.field2847, var12, var46.field2835, var46.field2846, var46.field2845);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class95.field1642 == class31.field464;
        for (int var14 = class73.field1201; var14 < class193.field3126; var14++) {
            class109[][] var27 = class79.field1367[var14];
            for (int var28 = -class151.field2536; var28 <= 0; var28++) {
                int var29 = class184.field2994 + var28;
                int var30 = class184.field2994 - var28;
                if (var29 >= class90.field1601 || var30 < class37.field546) {
                    for (int var31 = -class151.field2536; var31 <= 0; var31++) {
                        int var32 = class102.field1795 + var31;
                        int var33 = class102.field1795 - var31;
                        if (var29 >= class90.field1601) {
                            if (var32 >= class153.field2564) {
                                class109 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1955) {
                                    class26.method177(var34, true);
                                }
                            }
                            if (var33 < class229.field3860) {
                                class109 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1955) {
                                    class26.method177(var35, true);
                                }
                            }
                        }
                        if (var30 < class37.field546) {
                            if (var32 >= class153.field2564) {
                                class109 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1955) {
                                    class26.method177(var36, true);
                                }
                            }
                            if (var33 < class229.field3860) {
                                class109 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1955) {
                                    class26.method177(var37, true);
                                }
                            }
                        }
                        if (class201.field3309 == 0) {
                            if (!var13) {
                                class125.field2202 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class73.field1201; var15 < class193.field3126; var15++) {
            class109[][] var16 = class79.field1367[var15];
            for (int var17 = -class151.field2536; var17 <= 0; var17++) {
                int var18 = class184.field2994 + var17;
                int var19 = class184.field2994 - var17;
                if (var18 >= class90.field1601 || var19 < class37.field546) {
                    for (int var20 = -class151.field2536; var20 <= 0; var20++) {
                        int var21 = class102.field1795 + var20;
                        int var22 = class102.field1795 - var20;
                        if (var18 >= class90.field1601) {
                            if (var21 >= class153.field2564) {
                                class109 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1955) {
                                    class26.method177(var23, false);
                                }
                            }
                            if (var22 < class229.field3860) {
                                class109 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1955) {
                                    class26.method177(var24, false);
                                }
                            }
                        }
                        if (var19 < class37.field546) {
                            if (var21 >= class153.field2564) {
                                class109 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1955) {
                                    class26.method177(var25, false);
                                }
                            }
                            if (var22 < class229.field3860) {
                                class109 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1955) {
                                    class26.method177(var26, false);
                                }
                            }
                        }
                        if (class201.field3309 == 0) {
                            if (!var13) {
                                class125.field2202 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class125.field2202 = false;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static final void method1413(int arg0) {
        field3557++;
        class100.field1714.method58(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static final void method1414(int arg0) {
        class198.field3198.method58(0);
        field3565++;
        class30.field442.method58(0);
        if (arg0 != -1) {
            method1414(90);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIBZI[[[Lhj;)Z")
    public static final boolean method1415(int arg0, int arg1, byte arg2, boolean arg3, int arg4, class109[][][] arg5) {
        byte var6 = arg3 ? 1 : (byte) (class71.field1166 & 0xFF);
        if (arg2 <= 118) {
            field3562 = null;
        }
        field3566++;
        if (class158.field2648[class176.field2886][arg1][arg0] == var6) {
            return false;
        } else if ((class229.field3862[class176.field2886][arg1][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class69.field1137[var7] = arg1;
            int var31 = var7 + 1;
            class192.field3099[var7] = arg0;
            class158.field2648[class176.field2886][arg1][arg0] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class69.field1137[var8] & 0xFFFF;
                int var10 = (class69.field1137[var8] & 0xFFA932) >> 16;
                int var11 = class69.field1137[var8] >> 24 & 0xFF;
                int var12 = class192.field3099[var8] & 0xFFFF;
                int var13 = (class192.field3099[var8] & 0xFF2262) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class229.field3862[class176.field2886][var9][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label229: for (int var16 = class176.field2886 + 1; var16 <= 3; var16++) {
                    if ((class229.field3862[var16][var9][var12] & 0x8) == 0) {
                        if (var15 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field1957 != null) {
                                int var19 = class168.method1142(6607, var10);
                                if (arg5[var16][var9][var12].field1957.field3571 == var19 || arg5[var16][var9][var12].field1957.field3570 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class168.method1142(6607, var11);
                                    if (arg5[var16][var9][var12].field1957.field3571 == var20 || arg5[var16][var9][var12].field1957.field3570 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class168.method1142(6607, var13);
                                    if (arg5[var16][var9][var12].field1957.field3571 == var21 || arg5[var16][var9][var12].field1957.field3570 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var16][var9][var12].field1961 != null) {
                                for (int var22 = 0; var22 < arg5[var16][var9][var12].field1968; var22++) {
                                    int var23 = (int) (arg5[var16][var9][var12].field1961[var22].field2850 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg5[var16][var9][var12].field1961[var22].field2850 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var10 == var25 || var11 != 0 && var11 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class109 var26 = arg5[var16][var9][var12];
                        var14 = true;
                        if (var26 != null && var26.field1968 > 0) {
                            for (int var27 = 0; var27 < var26.field1968; var27++) {
                                class173 var28 = var26.field1961[var27];
                                if (var28.field2855 != var28.field2840 || var28.field2843 != var28.field2839) {
                                    for (int var29 = var28.field2840; var29 <= var28.field2855; var29++) {
                                        for (int var30 = var28.field2839; var30 <= var28.field2843; var30++) {
                                            class158.field2648[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class158.field2648[var16][var9][var12] = var6;
                    }
                }
                if (var14) {
                    int var17 = var9 << 7;
                    if (class95.field1642[class176.field2886 + 1][var9][var12] > class78.field1337[arg4]) {
                        class78.field1337[arg4] = class95.field1642[class176.field2886 + 1][var9][var12];
                    }
                    if (class201.field3307[arg4] > var17) {
                        class201.field3307[arg4] = var17;
                    } else if (class4.field46[arg4] < var17) {
                        class4.field46[arg4] = var17;
                    }
                    int var18 = var12 << 7;
                    if (class196.field3176[arg4] > var18) {
                        class196.field3176[arg4] = var18;
                    } else if (var18 > class217.field3665[arg4]) {
                        class217.field3665[arg4] = var18;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class158.field2648[class176.field2886][var9 - 1][var12] != var6) {
                        class69.field1137[var31] = class112.method789(class112.method789(1179648, var9 - 1), -754974720);
                        class192.field3099[var31] = class112.method789(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class158.field2648[class176.field2886][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var9 - 1) >= 0 && class158.field2648[class176.field2886][var9 - 1][var12] != var6 && (class229.field3862[class176.field2886][var9][var12] & 0x4) == 0 && (class229.field3862[class176.field2886][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class69.field1137[var31] = class112.method789(class112.method789(1179648, var9 - 1), 1375731712);
                            class192.field3099[var31] = class112.method789(1245184, var12);
                            class158.field2648[class176.field2886][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class158.field2648[class176.field2886][var9][var12] != var6) {
                            class69.field1137[var31] = class112.method789(318767104, class112.method789(var9, 5373952));
                            class192.field3099[var31] = class112.method789(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class158.field2648[class176.field2886][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class158.field2648[class176.field2886][var9 + 1][var12] != var6 && (class229.field3862[class176.field2886][var9][var12] & 0x4) == 0 && (class229.field3862[class176.field2886][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class69.field1137[var31] = class112.method789(-1845493760, class112.method789(5373952, var9 + 1));
                            class192.field3099[var31] = class112.method789(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class158.field2648[class176.field2886][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class158.field2648[class176.field2886][var9 + 1][var12] != var6) {
                        class69.field1137[var31] = class112.method789(class112.method789(var9 + 1, 9568256), 1392508928);
                        class192.field3099[var31] = class112.method789(9633792, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class158.field2648[class176.field2886][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class158.field2648[class176.field2886][var9 - 1][var12] != var6 && (class229.field3862[class176.field2886][var9][var12] & 0x4) == 0 && (class229.field3862[class176.field2886][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class69.field1137[var31] = class112.method789(class112.method789(var9 - 1, 13762560), 301989888);
                            class192.field3099[var31] = class112.method789(13828096, var12);
                            class158.field2648[class176.field2886][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class158.field2648[class176.field2886][var9][var12] != var6) {
                            class69.field1137[var31] = class112.method789(-1828716544, class112.method789(13762560, var9));
                            class192.field3099[var31] = class112.method789(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class158.field2648[class176.field2886][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && class158.field2648[class176.field2886][var9 + 1][var12] != var6 && (class229.field3862[class176.field2886][var9][var12] & 0x4) == 0 && (class229.field3862[class176.field2886][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class69.field1137[var31] = class112.method789(class112.method789(var9 + 1, 9568256), -771751936);
                            class192.field3099[var31] = class112.method789(9633792, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class158.field2648[class176.field2886][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class78.field1337[arg4] != -1000000) {
                class78.field1337[arg4] += 10;
                class201.field3307[arg4] -= 50;
                class4.field46[arg4] += 50;
                class217.field3665[arg4] += 50;
                class196.field3176[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
    public static void method1416(byte arg0) {
        field3562 = null;
        field3560 = null;
        if (arg0 != -64) {
            field3561 = 2;
        }
        field3567 = null;
        field3559 = null;
    }
}
