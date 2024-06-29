import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class46 {

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public int field2126 = 0;

    @OriginalMember(owner = "client!nc", name = "sb", descriptor = "Lsc;")
    public class128 field2140 = class135.field3187;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "[I")
    public static int[] field2118 = new int[5];

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "Lsc;")
    public static class128 field2130 = class129.method1017(false, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!nc", name = "pb", descriptor = "Lsc;")
    public static class128 field2137 = class129.method1017(false, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "Z")
    public static boolean field2119 = true;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "[Lcb;")
    public static class17[] field2132 = new class17[50];

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "Lsc;")
    public static class128 field2128 = class129.method1017(false, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!nc", name = "ub", descriptor = "Lsc;")
    private static class128 field2142 = class129.method1017(false, "Ok");

    @OriginalMember(owner = "client!nc", name = "mb", descriptor = "Lsc;")
    public static class128 field2134 = field2142;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lsb;")
    public static class127 field2124 = new class127(32);

    @OriginalMember(owner = "client!nc", name = "zb", descriptor = "[I")
    public static int[] field2147 = new int[5];

    @OriginalMember(owner = "client!nc", name = "yb", descriptor = "I")
    public static int field2146 = 99;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!nc", name = "qb", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!nc", name = "rb", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!nc", name = "tb", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!nc", name = "vb", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "Lsf;")
    public static class131 field2129;

    @OriginalMember(owner = "client!nc", name = "Ab", descriptor = "Lsf;")
    public static class131 field2148;

    @OriginalMember(owner = "client!nc", name = "xb", descriptor = "Lga;")
    public static class44 field2145;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "[I")
    public int[] field2125;

    @OriginalMember(owner = "client!nc", name = "wb", descriptor = "[I")
    public int[] field2144;

    @OriginalMember(owner = "client!nc", name = "nb", descriptor = "[Lsc;")
    public class128[] field2135;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBLtb;)V")
    public static final void method724(int arg0, int arg1, int arg2, byte arg3, class134 arg4) {
        field2127++;
        if (class55.field1232 >= 50 || class143.field3348 == 0 || (arg4.field3174 == null || arg4.field3174.length <= arg2)) {
            return;
        }
        int var5 = arg4.field3174[arg2];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        if (arg3 < 62) {
            method728(-113, -103, -113, 14);
        }
        class144.field3362[class55.field1232] = var6;
        int var7 = var5 >> 4 & 0x7;
        class60.field1301[class55.field1232] = var7;
        class64.field1401[class55.field1232] = 0;
        int var8 = (arg0 - 64) / 128;
        field2132[class55.field1232] = null;
        int var9 = var5 & 0xF;
        int var10 = (arg1 - 64) / 128;
        class110.field2490[class55.field1232] = (var8 << 16) + ((var10 << 8) + var9);
        class55.field1232++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLmc;)V")
    private final void method725(int arg0, byte arg1, class86 arg2) {
        if (arg1 != -51) {
            method726(-13);
        }
        field2123++;
        if (arg0 == 1) {
            this.field2122 = arg2.method646(-15447);
        } else if (arg0 == 2) {
            this.field2141 = arg2.method646(-15447);
        } else if (arg0 == 3) {
            this.field2140 = arg2.method670(arg1 ^ 0x32);
        } else if (arg0 == 4) {
            this.field2143 = arg2.method666(arg1 + 1183700475);
        } else if (arg0 == 5) {
            this.field2126 = arg2.method632((byte) -80);
            this.field2135 = new class128[this.field2126];
            this.field2144 = new int[this.field2126];
            for (int var5 = 0; var5 < this.field2126; var5++) {
                this.field2144[var5] = arg2.method666(1183700424);
                this.field2135[var5] = arg2.method670(-1);
            }
        } else if (arg0 == 6) {
            this.field2126 = arg2.method632((byte) -80);
            this.field2144 = new int[this.field2126];
            this.field2125 = new int[this.field2126];
            for (int var4 = 0; var4 < this.field2126; var4++) {
                this.field2144[var4] = arg2.method666(1183700424);
                this.field2125[var4] = arg2.method666(1183700424);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static void method726(int arg0) {
        field2130 = null;
        field2137 = null;
        if (arg0 >= -67) {
            method728(-73, 89, 17, 70);
        }
        field2124 = null;
        field2147 = null;
        field2142 = null;
        field2128 = null;
        field2134 = null;
        field2118 = null;
        field2148 = null;
        field2132 = null;
        field2145 = null;
        field2129 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lmc;I)V")
    public final void method727(class86 arg0, int arg1) {
        field2133++;
        while (true) {
            int var3 = arg0.method646(-15447);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    this.field2126 = -75;
                    return;
                }
            }
            this.method725(var3, (byte) -51, arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
    public static final void method728(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return;
        }
        field2136++;
        class7.method31((byte) 0);
        class138.method1125(arg1, arg0, arg1 + class115.field2600.field1237, class115.field2600.field1234 + arg0);
        if (class150.field3449 == 2 || class150.field3449 == 5) {
            class138.method1139(arg1 + 25, arg0 - -5, 0, class62.field1332, class53.field1069);
        } else {
            int var4 = class94.field2184 + class46.field857 & 0x7FF;
            int var5 = class151.field3473.field975 / 32 + 48;
            int var6 = 464 - class151.field3473.field987 / 32;
            class156.field3581.method51(arg1 + 25, arg0 + 5, 146, 151, var5, var6, var4, class89.field2042 + 256, class62.field1332, class53.field1069);
            for (int var7 = 0; var7 < class34.field644; var7++) {
                int var37 = class141.field3312[var7] * 4 + 2 - class151.field3473.field987 / 32;
                int var38 = class34.field640[var7] * 4 + 2 - class151.field3473.field975 / 32;
                class94.method733(var37, arg0, var38, arg1, (byte) 53, class100.field2319[var7]);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class121 var34 = class124.field2796[class29.field553][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class151.field3473.field975 / 32;
                        int var36 = var33 * 4 + 2 - class151.field3473.field987 / 32;
                        class94.method733(var36, arg0, var35, arg1, (byte) 53, class21.field404[0]);
                    }
                }
            }
            for (int var9 = 0; var9 < class41.field767; var9++) {
                class51 var29 = class92.field2104[class68.field1528[var9]];
                if (var29 != null && var29.method391(arg2 ^ 0xFFFF8AAC)) {
                    class60 var30 = var29.field1028;
                    if (var30 != null && var30.field1270 != null) {
                        var30 = var30.method452(-56);
                    }
                    if (var30 != null && var30.field1272 && var30.field1268) {
                        int var31 = var29.field975 / 32 - class151.field3473.field975 / 32;
                        int var32 = var29.field987 / 32 - class151.field3473.field987 / 32;
                        class94.method733(var32, arg0, var31, arg1, (byte) 53, class21.field404[1]);
                    }
                }
            }
            for (int var10 = 0; var10 < class134.field3151; var10++) {
                class53 var21 = class106.field2421[class65.field1441[var10]];
                if (var21 != null && var21.method391(-30036)) {
                    int var22 = var21.field975 / 32 - class151.field3473.field975 / 32;
                    int var23 = var21.field987 / 32 - class151.field3473.field987 / 32;
                    boolean var24 = false;
                    long var25 = var21.field1050.method973(-91);
                    for (int var27 = 0; var27 < class35.field675; var27++) {
                        if (class54.field1106[var27] == var25 && class12.field200[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class151.field3473.field1060 != 0 && var21.field1060 != 0 && class151.field3473.field1060 == var21.field1060) {
                        var28 = true;
                    }
                    if (var24) {
                        class94.method733(var23, arg0, var22, arg1, (byte) 53, class21.field404[3]);
                    } else if (var28) {
                        class94.method733(var23, arg0, var22, arg1, (byte) 53, class21.field404[4]);
                    } else {
                        class94.method733(var23, arg0, var22, arg1, (byte) 53, class21.field404[2]);
                    }
                }
            }
            if (class36.field685 != 0 && class29.field554 % 20 < 10) {
                if (class36.field685 == 1 && class159.field3657 >= 0 && class92.field2104.length > class159.field3657) {
                    class51 var11 = class92.field2104[class159.field3657];
                    if (var11 != null) {
                        int var12 = var11.field987 / 32 - class151.field3473.field987 / 32;
                        int var13 = var11.field975 / 32 - class151.field3473.field975 / 32;
                        class43.method307(arg0, class105.field2402[1], arg1, 6093, var13, var12);
                    }
                }
                if (class36.field685 == 2) {
                    int var14 = (class113.field2545 - class66.field1482) * 4 + 2 - class151.field3473.field987 / 32;
                    int var15 = (class6.field80 - class62.field1325) * 4 + 2 - class151.field3473.field975 / 32;
                    class43.method307(arg0, class105.field2402[1], arg1, 6093, var15, var14);
                }
                if (class36.field685 == 10 && class97.field2254 >= 0 && class97.field2254 < class106.field2421.length) {
                    class53 var16 = class106.field2421[class97.field2254];
                    if (var16 != null) {
                        int var17 = var16.field987 / 32 - class151.field3473.field987 / 32;
                        int var18 = var16.field975 / 32 - class151.field3473.field975 / 32;
                        class43.method307(arg0, class105.field2402[1], arg1, arg2 + 6093, var18, var17);
                    }
                }
            }
            if (class66.field1490 != 0) {
                int var19 = class66.field1490 * 4 + 2 - class151.field3473.field975 / 32;
                int var20 = class18.field312 * 4 + 2 - class151.field3473.field987 / 32;
                class94.method733(var20, arg0, var19, arg1, (byte) 53, class105.field2402[0]);
            }
            class138.method1136(arg1 + 97, arg0 - -82 + -4, 3, 3, 16777215);
        }
        if (class150.field3449 < 3) {
            class122.field2778.method51(arg1, arg0, 33, 33, 25, 25, class94.field2184, 256, class118.field2682, class20.field386);
        } else {
            class138.method1139(arg1, arg0, 0, class118.field2682, class20.field386);
        }
        if (class12.field194[arg3]) {
            class115.field2600.method430(arg1, arg0);
        }
        class7.field111[arg3] = true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2139++;
        if (arg4 >= 1 && arg3 >= 1 && arg4 <= 102 && arg3 <= 102) {
            if (class110.field2487 && class29.field553 != arg5) {
                return;
            }
            int var8 = 0;
            if (arg1 == 0) {
                var8 = class154.field3553.method128(arg5, arg4, arg3);
            }
            if (arg1 == 1) {
                var8 = class154.field3553.method97(arg5, arg4, arg3);
            }
            boolean var9 = true;
            if (arg1 == 2) {
                var8 = class154.field3553.method114(arg5, arg4, arg3);
            }
            boolean var10 = false;
            if (arg1 == 3) {
                var8 = class154.field3553.method143(arg5, arg4, arg3);
            }
            boolean var11 = false;
            if (var8 != 0) {
                int var12 = var8 >> 14 & 0x7FFF;
                int var13 = class154.field3553.method102(arg5, arg4, arg3, var8);
                int var14 = var13 >> 6 & 0x3;
                int var15 = var13 & 0x1F;
                if (arg1 == 0) {
                    class154.field3553.method100(arg5, arg4, arg3);
                    class94 var16 = class147.method1185(-2, var12);
                    if (var16.field2196 != 0) {
                        class104.field2359[arg5].method205(arg4, (byte) 93, var15, var16.field2191, var14, arg3);
                    }
                }
                if (arg1 == 1) {
                    class154.field3553.method132(arg5, arg4, arg3);
                }
                if (arg1 == 2) {
                    class154.field3553.method123(arg5, arg4, arg3);
                    class94 var17 = class147.method1185(-2, var12);
                    if (var17.field2166 + arg4 > 103 || var17.field2166 + arg3 > 103 || var17.field2195 + arg4 > 103 || arg3 + var17.field2195 > 103) {
                        return;
                    }
                    if (var17.field2196 != 0) {
                        class104.field2359[arg5].method215(var17.field2191, arg4, 0, var17.field2195, arg3, var17.field2166, var14);
                    }
                }
                if (arg1 == 3) {
                    class154.field3553.method134(arg5, arg4, arg3);
                    class94 var18 = class147.method1185(-2, var12);
                    if (var18.field2196 == 1) {
                        class104.field2359[arg5].method204((byte) 41, arg3, arg4);
                    }
                }
            }
            if (arg2 >= 0) {
                int var19 = arg5;
                if (arg5 < 3 && (class110.field2485[1][arg4][arg3] & 0x2) == 2) {
                    var19 = arg5 + 1;
                }
                class23.method203(arg6 + 95, arg5, var19, arg4, arg2, arg7, class154.field3553, arg3, class104.field2359[arg5], arg0);
            }
        }
        if (arg6 != 3) {
            field2118 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Lsc;")
    public static final class128 method730(int arg0, int arg1) {
        field2121++;
        return arg1 > arg0 ? class111.method857(arg0, (byte) -47) : class141.field3314;
    }
}
