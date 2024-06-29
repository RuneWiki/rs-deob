import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class226 {

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Z")
    public static boolean field3947 = false;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "[I")
    public static int[] field3952 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field3954 = 0;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field3955 = 0;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field3943 = 0;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Lmh;")
    private static class128 field3953 = class22.method156(126, "purple:");

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lmh;")
    public static class128 field3945 = field3953;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Lmh;")
    public static class128 field3956 = field3953;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[I")
    public static int[] field3949;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)V", line = 6)
    public void method1553(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3944++;
        int var6 = 110 % ((-arg1 - 49) / 58);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[[[Le;IIIZ)Z", line = 17)
    public static final boolean method1554(int arg0, class150[][][] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3942++;
        if (arg0 != -1) {
            return false;
        }
        byte var6 = arg5 ? 1 : (byte) (class167.field2873 & 0xFF);
        if (class31.field684[class133.field2315][arg3][arg2] == var6) {
            return false;
        } else if ((class301.field5117[class133.field2315][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class103.field1770[var7] = arg3;
            int var31 = var7 + 1;
            class104.field1776[var7] = arg2;
            class31.field684[class133.field2315][arg3][arg2] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class103.field1770[var8] & 0xFFFF;
                int var10 = class103.field1770[var8] >> 16 & 0xFF;
                int var11 = class103.field1770[var8] >> 24 & 0xFF;
                int var12 = class104.field1776[var8] & 0xFFFF;
                boolean var13 = false;
                int var14 = (class104.field1776[var8] & 0xFFB2FB) >> 16;
                if ((class301.field5117[class133.field2315][var9][var12] & 0x4) == 0) {
                    var13 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                label238: for (int var16 = class133.field2315 + 1; var16 <= 3; var16++) {
                    if ((class301.field5117[var16][var9][var12] & 0x8) == 0) {
                        if (var13 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field2571 != null) {
                                int var17 = class266.method1862(var10, -1);
                                if (arg1[var16][var9][var12].field2571.field1254 == var17 || arg1[var16][var9][var12].field2571.field1262 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class266.method1862(var11, -1);
                                    if (arg1[var16][var9][var12].field2571.field1254 == var18 || arg1[var16][var9][var12].field2571.field1262 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class266.method1862(var14, -1);
                                    if (arg1[var16][var9][var12].field2571.field1254 == var19 || arg1[var16][var9][var12].field2571.field1262 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var9][var12].field2575 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var9][var12].field2576; var20++) {
                                    int var21 = (int) (arg1[var16][var9][var12].field2575[var20].field89 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg1[var16][var9][var12].field2575[var20].field89 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var14 != 0 && var14 == var23) {
                                        continue label238;
                                    }
                                }
                            }
                        }
                        class150 var24 = arg1[var16][var9][var12];
                        if (var24 != null && var24.field2576 > 0) {
                            for (int var25 = 0; var25 < var24.field2576; var25++) {
                                class5 var26 = var24.field2575[var25];
                                if (var26.field96 != var26.field92 || var26.field88 != var26.field86) {
                                    for (int var27 = var26.field92; var27 <= var26.field96; var27++) {
                                        for (int var28 = var26.field88; var28 <= var26.field86; var28++) {
                                            class31.field684[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class31.field684[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var29 = var9 << 7;
                    int var30 = var12 << 7;
                    if (class250.field4334[class133.field2315 + 1][var9][var12] > class151.field2608[arg4]) {
                        class151.field2608[arg4] = class250.field4334[class133.field2315 + 1][var9][var12];
                    }
                    if (var29 < class248.field4276[arg4]) {
                        class248.field4276[arg4] = var29;
                    } else if (class236.field4046[arg4] < var29) {
                        class236.field4046[arg4] = var29;
                    }
                    if (class242.field4143[arg4] > var30) {
                        class242.field4143[arg4] = var30;
                    } else if (var30 > class117.field1981[arg4]) {
                        class117.field1981[arg4] = var30;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class31.field684[class133.field2315][var9 - 1][var12] != var6) {
                        class103.field1770[var31] = class279.method1951(class279.method1951(1179648, var9 - 1), -754974720);
                        class104.field1776[var31] = class279.method1951(var12, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class31.field684[class133.field2315][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var9 - 1) >= 0 && class31.field684[class133.field2315][var9 - 1][var12] != var6 && (class301.field5117[class133.field2315][var9][var12] & 0x4) == 0 && (class301.field5117[class133.field2315][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class103.field1770[var31] = class279.method1951(class279.method1951(var9 - 1, 1179648), 1375731712);
                            class104.field1776[var31] = class279.method1951(var12, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class31.field684[class133.field2315][var9 - 1][var12] = var6;
                        }
                        if (class31.field684[class133.field2315][var9][var12] != var6) {
                            class103.field1770[var31] = class279.method1951(318767104, class279.method1951(var9, 5373952));
                            class104.field1776[var31] = class279.method1951(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class31.field684[class133.field2315][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class31.field684[class133.field2315][var9 + 1][var12] != var6 && (class301.field5117[class133.field2315][var9][var12] & 0x4) == 0 && (class301.field5117[class133.field2315][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class103.field1770[var31] = class279.method1951(-1845493760, class279.method1951(5373952, var9 + 1));
                            class104.field1776[var31] = class279.method1951(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class31.field684[class133.field2315][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class31.field684[class133.field2315][var9 + 1][var12] != var6) {
                        class103.field1770[var31] = class279.method1951(1392508928, class279.method1951(9568256, var9 + 1));
                        class104.field1776[var31] = class279.method1951(9633792, var12);
                        class31.field684[class133.field2315][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class31.field684[class133.field2315][var9 - 1][var12] != var6 && (class301.field5117[class133.field2315][var9][var12] & 0x4) == 0 && (class301.field5117[class133.field2315][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class103.field1770[var31] = class279.method1951(class279.method1951(13762560, var9 - 1), 301989888);
                            class104.field1776[var31] = class279.method1951(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class31.field684[class133.field2315][var9 - 1][var12] = var6;
                        }
                        if (class31.field684[class133.field2315][var9][var12] != var6) {
                            class103.field1770[var31] = class279.method1951(class279.method1951(var9, 13762560), -1828716544);
                            class104.field1776[var31] = class279.method1951(13828096, var12);
                            class31.field684[class133.field2315][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class31.field684[class133.field2315][var9 + 1][var12] != var6 && (class301.field5117[class133.field2315][var9][var12] & 0x4) == 0 && (class301.field5117[class133.field2315][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class103.field1770[var31] = class279.method1951(class279.method1951(var9 + 1, 9568256), -771751936);
                            class104.field1776[var31] = class279.method1951(var12, 9633792);
                            class31.field684[class133.field2315][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class151.field2608[arg4] != -1000000) {
                class151.field2608[arg4] += 10;
                class248.field4276[arg4] -= 50;
                class236.field4046[arg4] += 50;
                class117.field1981[arg4] += 50;
                class242.field4143[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Ljm;", line = 318)
    public class226 method780(int arg0, int arg1, int arg2) {
        field3950++;
        return this;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V", line = 327)
    public static final void method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -23989) {
            method1558(-48, (byte) 103, (class3) null, -43, 116, -42);
        }
        int var9 = arg5 + 1;
        class314.method2138(arg1, true, arg3, class219.field3850[arg5], arg4);
        int var8 = arg2 - 1;
        class314.method2138(arg1, true, arg3, class219.field3850[arg2], arg4);
        field3951++;
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class219.field3850[var6];
            var7[arg4] = var7[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()Z", line = 366)
    public boolean method771() {
        field3958++;
        return false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljm;IIIZ)V", line = 375)
    public void method779(class226 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3959++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 394)
    public static void method1556(int arg0) {
        field3953 = null;
        field3949 = null;
        field3945 = null;
        if (arg0 == 2488) {
            field3956 = null;
            field3952 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 408)
    public static final void method1557(int arg0) {
        field3948++;
        if (arg0 != 1) {
            method1558(-107, (byte) -125, (class3) null, -114, -7, -91);
        }
        class71.field1320.method570(118, -1);
        class299.field5094++;
        class71.field1320.method1344(69, 0L);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBLpd;III)V", line = 428)
    public static final void method1558(int arg0, byte arg1, class3 arg2, int arg3, int arg4, int arg5) {
        field3957++;
        if (arg2.field46 == -1 && arg2.field62 == null) {
            return;
        }
        int var6 = 101 / ((arg1 - 30) / 38);
        int var7 = 0;
        if (arg5 > arg2.field59) {
            var7 += arg5 - arg2.field59;
        } else if (arg5 < arg2.field40) {
            var7 += arg2.field40 - arg5;
        }
        if (arg2.field63 < arg4) {
            var7 += arg4 - arg2.field63;
        } else if (arg2.field67 > arg4) {
            var7 += arg2.field67 - arg4;
        }
        if (arg2.field70 == 0 || arg2.field70 < var7 - 64 || class158.field2699 == 0 || arg2.field65 != arg3) {
            if (arg2.field52 != null) {
                class188.field3260.method393(arg2.field52);
                arg2.field52 = null;
            }
            if (arg2.field47 != null) {
                class188.field3260.method393(arg2.field47);
                arg2.field47 = null;
            }
            return;
        }
        var7 -= 64;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = (arg2.field70 - var7) * class158.field2699 / arg2.field70;
        if (arg2.field52 != null) {
            arg2.field52.method1767(var8);
        } else if (arg2.field46 >= 0) {
            class25 var9 = class25.method164(class143.field2439, arg2.field46, 0);
            if (var9 != null) {
                class227 var10 = var9.method162().method1559(class15.field407);
                class251 var11 = class251.method1771(var10, 100, var8);
                var11.method1756(-1);
                class188.field3260.method389(var11);
                arg2.field52 = var11;
            }
        }
        if (arg2.field47 != null) {
            arg2.field47.method1767(var8);
            if (!arg2.field47.method1982(1955)) {
                arg2.field47 = null;
            }
        } else if (arg2.field62 != null && (arg2.field55 -= arg0) <= 0) {
            int var12 = (int) ((double) arg2.field62.length * Math.random());
            class25 var13 = class25.method164(class143.field2439, arg2.field62[var12], 0);
            if (var13 != null) {
                class227 var14 = var13.method162().method1559(class15.field407);
                class251 var15 = class251.method1771(var14, 100, var8);
                var15.method1756(0);
                class188.field3260.method389(var15);
                arg2.field55 = arg2.field48 + ((int) ((double) (arg2.field44 - arg2.field48) * Math.random()));
                arg2.field47 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()I")
    public abstract int method204();

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
