import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class267 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lkk;")
    public static class114 field2455 = new class114("WTWIP", 3);

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2460 = 0;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2462 = 0;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
    public static boolean field2463;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 6)
    public static final void method1035() {
        for (int var0 = 0; var0 < class295.field3947; var0++) {
            int[] var1 = class405.field5568[var0];
            for (int var2 = 0; var2 < class39.field567; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 24)
    public static final void main(String[] arg0) {
        field2456++;
        try {
            if (arg0.length != 4) {
                class486.method2819("argument count", (byte) 123);
            }
            class390.field5406 = Integer.parseInt(arg0[0]);
            class377.field5197 = class374.field5160;
            if (arg0[1].equals("live")) {
                class357.field4940 = class208.field2812;
            } else if (arg0[1].equals("rc")) {
                class357.field4940 = class77.field1042;
            } else if (arg0[1].equals("wip")) {
                class357.field4940 = class1.field24;
            } else {
                class486.method2819("modewhat", (byte) 121);
            }
            class110.field1676 = class309.method1705(arg0[2], 3685);
            if (class110.field1676 == -1) {
                if (arg0[2].equals("english")) {
                    class110.field1676 = 0;
                } else if (arg0[2].equals("german")) {
                    class110.field1676 = 1;
                } else {
                    class486.method2819("language", (byte) 118);
                }
            }
            class356.field4911 = false;
            class284.field3842 = false;
            if (arg0[3].equals("game0")) {
                class343.field4601 = class404.field5538;
            } else if (arg0[3].equals("game1")) {
                class343.field4601 = class243.field3233;
            } else {
                class486.method2819("game", (byte) 122);
            }
            class171.field2353 = 0;
            class239.field3191 = true;
            class164.field2275 = true;
            class441.field5949 = "";
            class448.field6099 = 0;
            class3.field44 = class343.field4601.field4375;
            client var1 = new client();
            class6.field81 = var1;
            var1.method1508(-4078, 1024, false, 29, 768, class343.field4601.field4374, 578, class357.field4940.method826((byte) -125) + 32);
            class492.field6883.setLocation(40, 40);
        } catch (Exception var3) {
            class228.method1278(var3, (String) null, -30116);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 91)
    private final void method1036(int arg0, byte arg1) {
        class477.field6599.field3278 = arg0;
        class412.field5640 = null;
        class260.field3448 = null;
        field2451++;
        int var3 = 69 % ((-arg1 - 63) / 41);
        class428.field5790 = 0;
        class477.field6599.field3280++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 105)
    public final void method1037(int arg0) {
        field2452++;
        if (class18.field258 == 1000) {
            return;
        }
        long var2 = class213.method1206(false) / 1000000L - class318.field4199;
        if (arg0 > -64) {
            field2455 = null;
        }
        class318.field4199 = class213.method1206(false) / 1000000L;
        boolean var4 = class336.method1922(-45);
        if (var4 && class219.field2925 && class259.field3433 != null) {
            class259.field3433.method846(-30243);
        }
        if (class18.field258 == 30 || class18.field258 == 10) {
            if (class403.field5530 != 0L && class403.field5530 < class440.method2583(25267)) {
                class96.method597(class488.field6789.field6693, class6.method41((byte) -121), (byte) 114, false, class488.field6789.field6677);
            } else if (class98.field1432.method1951() && class434.field5906) {
                class138.method832(121);
            }
        }
        if (class94.field1398 == null) {
            Container var5;
            if (class492.field6883 == null) {
                var5 = class251.field3359.field3209;
            } else {
                var5 = class492.field6883;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class492.field6883 == var5) {
                Insets var8 = class492.field6883.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class383.field5274 != var6 || class152.field2139 != var7) {
                if (class98.field1432 == null || class98.field1432.method2085()) {
                    class103.method626(-12504);
                } else {
                    class383.field5274 = var6;
                    class152.field2139 = var7;
                }
                class403.field5530 = class440.method2583(25267) + 500L;
            }
        }
        if (class94.field1398 != null && !class39.field569 && (class18.field258 == 30 || class18.field258 == 10)) {
            class96.method597(-1, class488.field6789.field6695, (byte) 101, false, -1);
        }
        boolean var9 = false;
        if (class251.field3346) {
            class251.field3346 = false;
            var9 = true;
        }
        if (var9) {
            class112.method718(-88);
        }
        if (class98.field1432 != null && class98.field1432.method2079() || class6.method41((byte) -121) != 1) {
            class480.method2803((byte) -80);
        }
        if (class18.field258 == 0) {
            class72.method470(class306.field4052[class3.field44], -27474, var9, class30.field397, class458.field6215, class14.field204[class3.field44], class449.field6107[class3.field44]);
        } else if (class18.field258 == 5) {
            class288.method1627(class14.field204[class3.field44].getRGB(), class98.field1432, class93.field1366, class98.field1432.method2079() | var9, 2, class306.field4052[class3.field44].getRGB(), class449.field6107[class3.field44].getRGB());
        } else if (class18.field258 == 10) {
            class210.method1197(-9962);
        } else if (class18.field258 == 25 || class18.field258 == 28) {
            if (class123.field1802 == 1) {
                if (class453.field6150 < class6.field74) {
                    class453.field6150 = class6.field74;
                }
                int var10 = (class453.field6150 - class6.field74) * 50 / class453.field6150;
                class363.method2212(class284.field3828, true, class230.field3051.method1176(class110.field1676, (byte) -126) + "<br>(" + var10 + "%)", (byte) 114);
            } else if (class123.field1802 == 2) {
                if (class98.field1433 < class2.field39) {
                    class98.field1433 = class2.field39;
                }
                int var11 = ((class98.field1433 - class2.field39) * 50 / class98.field1433) + 50;
                class363.method2212(class284.field3828, true, class230.field3051.method1176(class110.field1676, (byte) -119) + "<br>(" + var11 + "%)", (byte) 79);
            } else {
                class363.method2212(class284.field3828, true, class230.field3051.method1176(class110.field1676, (byte) -111), (byte) 118);
            }
        } else if (class18.field258 == 30) {
            class338.method1929((byte) -127, var2);
        } else if (class18.field258 == 40) {
            class363.method2212(class284.field3828, true, class102.field1466.method1176(class110.field1676, (byte) -108) + "<br>" + class178.field2414.method1176(class110.field1676, (byte) -99), (byte) 68);
        }
        if (class318.field4197 == 3) {
            for (int var12 = 0; var12 < class318.field4195; var12++) {
                Rectangle var13 = class341.field4560[var12];
                if (class42.field595[var12]) {
                    class98.field1432.method2222(var13.height, var13.x, var13.y, -1996553985, 93, var13.width);
                } else if (class385.field5327[var12]) {
                    class98.field1432.method2222(var13.height, var13.x, var13.y, -1996554240, 120, var13.width);
                }
            }
        }
        if (class140.method847((byte) -75)) {
            class483.method2813(-21358, class98.field1432);
        }
        if ((class18.field258 == 30 || class18.field258 == 10) && class318.field4197 == 0 && class6.method41((byte) -121) == 1 && !var9 && class241.field3216.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class318.field4195; var15++) {
                if (class385.field5327[var15]) {
                    class385.field5327[var15] = false;
                    class443.field6021[var14++] = class341.field4560[var15];
                }
            }
            class98.field1432.method1952(class443.field6021, var14);
        } else if (class18.field258 != 0) {
            class98.field1432.method1966();
            for (int var16 = 0; var16 < class318.field4195; var16++) {
                class385.field5327[var16] = false;
            }
        }
        if (class488.field6789.field6669 == 0) {
            class374.method2298(-28114, 15L);
        } else if (class488.field6789.field6669 == 1) {
            class374.method2298(-28114, 10L);
        } else if (class488.field6789.field6669 == 2) {
            class374.method2298(-28114, 5L);
        } else if (class488.field6789.field6669 == 3) {
            class374.method2298(-28114, 2L);
        }
        if (class103.field1499) {
            class310.method1708(109);
        }
        if (class488.field6789.field6689 && class18.field258 == 10 && class196.field2674 != -1) {
            class488.field6789.field6689 = false;
            class488.field6789.method2417(35, class251.field3359);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 343)
    public static final void method1038() {
        int var0 = class239.field3187;
        int[] var1 = class265.field3502;
        boolean var2 = class488.field6789.field6697 == 1 && var0 > 200 || class488.field6789.field6697 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class487 var12 = class413.field5644[var1[var3]];
            if (var12.method2828(0)) {
                var12.method538((byte) 127);
                if (var12.field6500 >= 0 && var12.field6491 >= 0 && var12.field6505 < class295.field3947 && var12.field6497 < class39.field567) {
                    var12.field6766 = var12.field1111 ? var2 : false;
                    if (class233.field3103 == var12) {
                        var12.field1189 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field1170) {
                            var13++;
                        }
                        if (var12.field1149 > class70.field968) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method545(false) << 2);
                        if (class70.field963 == 0) {
                            var14 += 32;
                        } else {
                            var14 += 128;
                        }
                        var14 += 256;
                        var12.field1189 = var14 + 1;
                    }
                } else {
                    var12.field1189 = -1;
                }
            } else {
                var12.field1189 = -1;
            }
        }
        for (int var4 = 0; var4 < class202.field2734; var4++) {
            class121 var9 = class221.field2941[class412.field5638[var4]];
            if (var9.method751(0) && var9.field1780.method2529(class38.field562, -92)) {
                var9.method538((byte) 127);
                if (var9.field6500 >= 0 && var9.field6491 >= 0 && var9.field6505 < class295.field3947 && var9.field6497 < class39.field567) {
                    int var10 = 0;
                    if (!var9.field1170) {
                        var10++;
                    }
                    if (var9.field1149 > class70.field968) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method545(false) << 2);
                    if (class70.field963 == 0) {
                        if (var9.field1780.field5852) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class70.field963 == 1) {
                        if (var9.field1780.field5852) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field1780.field5866) {
                        var11 += 1024;
                    } else if (!var9.field1780.field5827) {
                        var11 += 256;
                    }
                    var9.field1189 = var11 + 1;
                } else {
                    var9.field1189 = -1;
                }
            } else {
                var9.field1189 = -1;
            }
        }
        for (int var5 = 0; var5 < class88.field1295.length; var5++) {
            class409 var6 = class88.field1295[var5];
            if (var6 != null) {
                if (var6.field5598 == 1) {
                    class121 var7 = class221.field2941[var6.field5597];
                    if (var7 != null && var7.field1189 >= 0) {
                        var7.field1189 += 2048;
                    }
                } else if (var6.field5598 == 10) {
                    class487 var8 = class413.field5644[var6.field5597];
                    if (var8 != null && class233.field3103 != var8 && var8.field1189 >= 0) {
                        var8.field1189 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 500)
    public static void method1039(int arg0) {
        if (arg0 != 31) {
            field2460 = 70;
        }
        field2455 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lnk;IIIIIIIII)V", line = 512)
    public static final void method1040(class464[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class464 var11 = arg0[var10];
            if (var11 != null && var11.field6362 == arg1) {
                int var12 = var11.field6412 + arg6;
                int var13 = var11.field6323 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6358 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6308 + var12;
                    int var19 = var11.field6340 + var13;
                    if (var11.field6358 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6358 == 0 || var11.field6446 || method1046(var11).field2954 != 0 || class65.field858 == var11 || class92.field1352 == var11.field6359) {
                    if (!method1045(var11)) {
                        if (class385.field5314 == var11) {
                            class65.field866 = true;
                            class326.field4349 = var12;
                            class437.field5934 = var13;
                        }
                        if (var11.field6309 || var14 < var16 && var15 < var17) {
                            if (var11.field6358 == 0 && var11.field6442 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class82 var20 = (class82) class245.field3272.method652((byte) 37); var20 != null; var20 = (class82) class245.field3272.method653(37)) {
                                    if (var20.field1097) {
                                        var20.method2614((byte) -79);
                                        var20.field1086.field6437 = false;
                                    }
                                }
                                if (class450.field6115 == 0) {
                                    class385.field5314 = null;
                                    class65.field858 = null;
                                }
                                class23.field308 = 0;
                                class158.field2175 = false;
                                class177.field2407 = false;
                                if (!class385.field5334) {
                                    class358.method2193((byte) 115);
                                }
                            }
                            boolean var21;
                            if (class34.field523.method1916((byte) -21) >= var14 && class34.field523.method1925(50) >= var15 && class34.field523.method1916((byte) -21) < var16 && class34.field523.method1925(50) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class385.field5334 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class150.method890(var11, arg9 - var13, 30, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class34.field523.method1923(100) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class187.field2569 != null && class187.field2569.method1546(true) == 0 && class187.field2569.method1551(128) >= var14 && class187.field2569.method1549((byte) 108) >= var15 && class187.field2569.method1551(128) < var16 && class187.field2569.method1549((byte) 108) < var17) {
                                var23 = true;
                            }
                            if (var11.field6304 != null) {
                                for (int var24 = 0; var24 < var11.field6304.length; var24++) {
                                    if (class449.field6111.method882((byte) 110, var11.field6304[var24])) {
                                        if (var11.field6332 == null || class70.field968 >= var11.field6332[var24]) {
                                            byte var25 = var11.field6374[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class449.field6111.method882((byte) -59, 86) && !class449.field6111.method882((byte) 89, 82) && !class449.field6111.method882((byte) -123, 81)) && ((var25 & 0x2) == 0 || class449.field6111.method882((byte) -74, 86)) && ((var25 & 0x1) == 0 || class449.field6111.method882((byte) -114, 82)) && ((var25 & 0x4) == 0 || class449.field6111.method882((byte) -81, 81))) {
                                                class270.method1534(var11.field6440, var24 + 1, -1, "", -1);
                                                int var26 = var11.field6339[var24];
                                                if (var11.field6332 == null) {
                                                    var11.field6332 = new int[var11.field6304.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field6332[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6332[var24] = class70.field968 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field6332 != null) {
                                        var11.field6332[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class46.method330(true, class187.field2569.method1551(128) - var12, class187.field2569.method1549((byte) 108) - var13, var11);
                            }
                            if (class385.field5314 != null && class385.field5314 != var11 && var21 && method1046(var11).method1257(104)) {
                                class114.field1719 = var11;
                            }
                            if (class65.field858 == var11) {
                                class135.field1970 = true;
                                class348.field4797 = var12;
                                class82.field1084 = var13;
                            }
                            if (var11.field6446 || var11.field6359 != 0) {
                                if (var21 && class416.field5659 != 0 && var11.field6373 != null) {
                                    class82 var27 = new class82();
                                    var27.field1097 = true;
                                    var27.field1086 = var11;
                                    var27.field1092 = class416.field5659;
                                    var27.field1085 = var11.field6373;
                                    class245.field3272.method641(var27, (byte) -93);
                                }
                                if (class385.field5314 != null || class385.field5334 || class491.field6865 != var11.field6359 && class23.field308 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6359 != 0) {
                                    if (class317.field4182 == var11.field6359 || class358.field4943 == var11.field6359) {
                                        class42.field601 = var11;
                                        if (class11.field147 != null) {
                                            class11.field147.method2696((byte) -91, var11.field6340, class98.field1432);
                                        }
                                        if (class317.field4182 == var11.field6359) {
                                            if (!class385.field5334 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class128.method786(class98.field1432, arg9, 64, arg8);
                                                for (class408 var28 = (class408) class165.field2281.method2764((byte) -85); var28 != null; var28 = (class408) class165.field2281.method2769(true)) {
                                                    if (arg8 >= var28.field5589 && arg8 < var28.field5591 && arg9 >= var28.field5587 && arg9 < var28.field5586) {
                                                        class358.method2193((byte) 115);
                                                        class232.method1297(var28.field5584, 28567);
                                                    }
                                                }
                                            }
                                            class80.method524(var13, var11, var12, 0);
                                            continue;
                                        }
                                    }
                                    if (class92.field1352 == var11.field6359) {
                                        if (var11.method2738((byte) 118, class98.field1432) == null || class455.field6170 != 0 && class455.field6170 != 3 || class385.field5334 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field6435[var30];
                                        if (var29 < var31 || var29 > var11.field6408[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field6308 / 2;
                                        int var33 = var30 - var11.field6340 / 2;
                                        int var34;
                                        if (class56.field772 == 4) {
                                            var34 = (int) class270.field3610 & 0x3FFF;
                                        } else {
                                            var34 = (int) class270.field3610 + class150.field2119 & 0x3FFF;
                                        }
                                        int var35 = class364.field4994[var34];
                                        int var36 = class364.field4992[var34];
                                        if (class56.field772 != 4) {
                                            var35 = (class429.field5795 + 256) * var35 >> 8;
                                            var36 = (class429.field5795 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class56.field772 == 4) {
                                            var39 = (class186.field2560 >> 7) + (var37 >> 2);
                                            var40 = (class23.field306 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class233.field3103.method545(false) - 1) * 64;
                                            var39 = (class233.field3103.field6501 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class233.field3103.field6507 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class289.field3899 && (class456.field6187 & 0x40) != 0) {
                                            class464 var42 = class78.method519(class210.field2841, class38.field559, (byte) -72);
                                            if (var42 == null) {
                                                class78.method513(-1);
                                            } else {
                                                class402.method2436(var11.field6402, true, var40, false, (byte) 111, class491.field6867, var39, 51, " ->", class297.field3974, 1L);
                                            }
                                            continue;
                                        }
                                        if (class343.field4601 == class243.field3233) {
                                            class402.method2436(-1, true, var40, false, (byte) 91, class257.field3423.method1176(class110.field1676, (byte) -115), var39, 59, "", -1, 1L);
                                        }
                                        class402.method2436(-1, true, var40, false, (byte) 118, class289.field3900, var39, 22, "", -1, 1L);
                                        continue;
                                    }
                                    if (class491.field6865 == var11.field6359) {
                                        class181.field2492 = var11;
                                        if (var21) {
                                            class158.field2175 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class187.field2569.method1551(128) - var12 - var11.field6308 / 2) * 2.0D / (double) class55.field739);
                                            int var44 = (int) (-((double) (class187.field2569.method1549((byte) 108) - var13 - var11.field6340 / 2) * 2.0D / (double) class55.field739));
                                            int var45 = class370.field5065 + var43 + class55.field757;
                                            int var46 = class432.field5889 + var44 + class55.field754;
                                            class281 var47 = class400.method2424(-112);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method1591(var48, var46, var45, 12800);
                                            if (var48 != null) {
                                                if (class449.field6111.method882((byte) 89, 82) && class348.field4799 > 0) {
                                                    class150.method889(var48[0], (byte) 100, var48[2], var48[1]);
                                                    continue;
                                                }
                                                class177.field2407 = true;
                                                class47.field634 = var48[0];
                                                class296.field3958 = var48[1];
                                                class348.field4798 = var48[2];
                                            }
                                            class23.field308 = 1;
                                            class304.field4047 = false;
                                            class200.field2714 = class34.field523.method1916((byte) -21);
                                            class291.field3910 = class34.field523.method1925(50);
                                            continue;
                                        }
                                        if (var22 && class23.field308 > 0) {
                                            if (class23.field308 == 1 && (class200.field2714 != class34.field523.method1916((byte) -21) || class291.field3910 != class34.field523.method1925(50))) {
                                                class389.field5370 = class370.field5065;
                                                class453.field6155 = class432.field5889;
                                                class23.field308 = 2;
                                            }
                                            if (class23.field308 == 2) {
                                                class304.field4047 = true;
                                                class175.method1007(true, class389.field5370 + (int) ((double) (class200.field2714 - class34.field523.method1916((byte) -21)) * 2.0D / (double) class55.field744));
                                                class107.method660((byte) 29, class453.field6155 - (int) ((double) (class291.field3910 - class34.field523.method1925(50)) * 2.0D / (double) class55.field744));
                                            }
                                            continue;
                                        }
                                        if (class23.field308 > 0 && !class304.field4047) {
                                            if ((class208.field2811 == 1 || class351.method2174(-1)) && class475.field6540 > 2) {
                                                class96.method599(class291.field3910, class200.field2714, (byte) -47);
                                            } else if (class316.method1735(0)) {
                                                class96.method599(class291.field3910, class200.field2714, (byte) -76);
                                            }
                                        }
                                        class23.field308 = 0;
                                        continue;
                                    }
                                    if (class458.field6220 == var11.field6359) {
                                        if (var22) {
                                            class490.method2855(class34.field523.method1925(50) - var13, var11.field6308, (byte) -127, class34.field523.method1916((byte) -21) - var12, var11.field6340);
                                        }
                                        continue;
                                    }
                                    if (class338.field4550 == var11.field6359) {
                                        class453.method2659(var12, 82, var11, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field6388 && var23) {
                                    var11.field6388 = true;
                                    if (var11.field6331 != null) {
                                        class82 var49 = new class82();
                                        var49.field1097 = true;
                                        var49.field1086 = var11;
                                        var49.field1091 = class187.field2569.method1551(128) - var12;
                                        var49.field1092 = class187.field2569.method1549((byte) 108) - var13;
                                        var49.field1085 = var11.field6331;
                                        class245.field3272.method641(var49, (byte) -93);
                                    }
                                }
                                if (var11.field6388 && var22 && var11.field6403 != null) {
                                    class82 var50 = new class82();
                                    var50.field1097 = true;
                                    var50.field1086 = var11;
                                    var50.field1091 = class34.field523.method1916((byte) -21) - var12;
                                    var50.field1092 = class34.field523.method1925(50) - var13;
                                    var50.field1085 = var11.field6403;
                                    class245.field3272.method641(var50, (byte) -93);
                                }
                                if (var11.field6388 && !var22) {
                                    var11.field6388 = false;
                                    if (var11.field6415 != null) {
                                        class82 var51 = new class82();
                                        var51.field1097 = true;
                                        var51.field1086 = var11;
                                        var51.field1091 = class34.field523.method1916((byte) -21) - var12;
                                        var51.field1092 = class34.field523.method1925(50) - var13;
                                        var51.field1085 = var11.field6415;
                                        class78.field1050.method641(var51, (byte) -93);
                                    }
                                }
                                if (var22 && var11.field6337 != null) {
                                    class82 var52 = new class82();
                                    var52.field1097 = true;
                                    var52.field1086 = var11;
                                    var52.field1091 = class34.field523.method1916((byte) -21) - var12;
                                    var52.field1092 = class34.field523.method1925(50) - var13;
                                    var52.field1085 = var11.field6337;
                                    class245.field3272.method641(var52, (byte) -93);
                                }
                                if (!var11.field6437 && var21) {
                                    var11.field6437 = true;
                                    if (var11.field6326 != null) {
                                        class82 var53 = new class82();
                                        var53.field1097 = true;
                                        var53.field1086 = var11;
                                        var53.field1091 = class34.field523.method1916((byte) -21) - var12;
                                        var53.field1092 = class34.field523.method1925(50) - var13;
                                        var53.field1085 = var11.field6326;
                                        class245.field3272.method641(var53, (byte) -93);
                                    }
                                }
                                if (var11.field6437 && var21 && var11.field6325 != null) {
                                    class82 var54 = new class82();
                                    var54.field1097 = true;
                                    var54.field1086 = var11;
                                    var54.field1091 = class34.field523.method1916((byte) -21) - var12;
                                    var54.field1092 = class34.field523.method1925(50) - var13;
                                    var54.field1085 = var11.field6325;
                                    class245.field3272.method641(var54, (byte) -93);
                                }
                                if (var11.field6437 && !var21) {
                                    var11.field6437 = false;
                                    if (var11.field6313 != null) {
                                        class82 var55 = new class82();
                                        var55.field1097 = true;
                                        var55.field1086 = var11;
                                        var55.field1091 = class34.field523.method1916((byte) -21) - var12;
                                        var55.field1092 = class34.field523.method1925(50) - var13;
                                        var55.field1085 = var11.field6313;
                                        class78.field1050.method641(var55, (byte) -93);
                                    }
                                }
                                if (var11.field6383 != null) {
                                    class82 var56 = new class82();
                                    var56.field1086 = var11;
                                    var56.field1085 = var11.field6383;
                                    class400.field5500.method641(var56, (byte) -93);
                                }
                                if (var11.field6354 != null && class226.field2977 > var11.field6345) {
                                    if (var11.field6385 == null || class226.field2977 - var11.field6345 > 32) {
                                        class82 var61 = new class82();
                                        var61.field1086 = var11;
                                        var61.field1085 = var11.field6354;
                                        class245.field3272.method641(var61, (byte) -93);
                                    } else {
                                        label672: for (int var57 = var11.field6345; var57 < class226.field2977; var57++) {
                                            int var58 = class76.field1032[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field6385.length; var59++) {
                                                if (var11.field6385[var59] == var58) {
                                                    class82 var60 = new class82();
                                                    var60.field1086 = var11;
                                                    var60.field1085 = var11.field6354;
                                                    class245.field3272.method641(var60, (byte) -93);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6345 = class226.field2977;
                                }
                                if (var11.field6296 != null && class261.field3468 > var11.field6302) {
                                    if (var11.field6376 == null || class261.field3468 - var11.field6302 > 32) {
                                        class82 var66 = new class82();
                                        var66.field1086 = var11;
                                        var66.field1085 = var11.field6296;
                                        class245.field3272.method641(var66, (byte) -93);
                                    } else {
                                        label648: for (int var62 = var11.field6302; var62 < class261.field3468; var62++) {
                                            int var63 = class26.field343[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field6376.length; var64++) {
                                                if (var11.field6376[var64] == var63) {
                                                    class82 var65 = new class82();
                                                    var65.field1086 = var11;
                                                    var65.field1085 = var11.field6296;
                                                    class245.field3272.method641(var65, (byte) -93);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6302 = class261.field3468;
                                }
                                if (var11.field6315 != null && class413.field5651 > var11.field6369) {
                                    if (var11.field6301 == null || class413.field5651 - var11.field6369 > 32) {
                                        class82 var71 = new class82();
                                        var71.field1086 = var11;
                                        var71.field1085 = var11.field6315;
                                        class245.field3272.method641(var71, (byte) -93);
                                    } else {
                                        label624: for (int var67 = var11.field6369; var67 < class413.field5651; var67++) {
                                            int var68 = class297.field3981[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field6301.length; var69++) {
                                                if (var11.field6301[var69] == var68) {
                                                    class82 var70 = new class82();
                                                    var70.field1086 = var11;
                                                    var70.field1085 = var11.field6315;
                                                    class245.field3272.method641(var70, (byte) -93);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6369 = class413.field5651;
                                }
                                if (var11.field6413 != null && class194.field2620 > var11.field6411) {
                                    if (var11.field6433 == null || class194.field2620 - var11.field6411 > 32) {
                                        class82 var76 = new class82();
                                        var76.field1086 = var11;
                                        var76.field1085 = var11.field6413;
                                        class245.field3272.method641(var76, (byte) -93);
                                    } else {
                                        label600: for (int var72 = var11.field6411; var72 < class194.field2620; var72++) {
                                            int var73 = class243.field3240[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field6433.length; var74++) {
                                                if (var11.field6433[var74] == var73) {
                                                    class82 var75 = new class82();
                                                    var75.field1086 = var11;
                                                    var75.field1085 = var11.field6413;
                                                    class245.field3272.method641(var75, (byte) -93);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6411 = class194.field2620;
                                }
                                if (var11.field6288 != null && class164.field2273 > var11.field6429) {
                                    if (var11.field6316 == null || class164.field2273 - var11.field6429 > 32) {
                                        class82 var81 = new class82();
                                        var81.field1086 = var11;
                                        var81.field1085 = var11.field6288;
                                        class245.field3272.method641(var81, (byte) -93);
                                    } else {
                                        label576: for (int var77 = var11.field6429; var77 < class164.field2273; var77++) {
                                            int var78 = class351.field4866[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field6316.length; var79++) {
                                                if (var11.field6316[var79] == var78) {
                                                    class82 var80 = new class82();
                                                    var80.field1086 = var11;
                                                    var80.field1085 = var11.field6288;
                                                    class245.field3272.method641(var80, (byte) -93);
                                                    break label576;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6429 = class164.field2273;
                                }
                                if (class28.field370 > var11.field6432 && var11.field6394 != null) {
                                    class82 var82 = new class82();
                                    var82.field1086 = var11;
                                    var82.field1085 = var11.field6394;
                                    class245.field3272.method641(var82, (byte) -93);
                                }
                                if (class41.field587 > var11.field6432 && var11.field6389 != null) {
                                    class82 var83 = new class82();
                                    var83.field1086 = var11;
                                    var83.field1085 = var11.field6389;
                                    class245.field3272.method641(var83, (byte) -93);
                                }
                                if (class324.field4320 > var11.field6432 && var11.field6353 != null) {
                                    class82 var84 = new class82();
                                    var84.field1086 = var11;
                                    var84.field1085 = var11.field6353;
                                    class245.field3272.method641(var84, (byte) -93);
                                }
                                if (class390.field5417 > var11.field6432 && var11.field6424 != null) {
                                    class82 var85 = new class82();
                                    var85.field1086 = var11;
                                    var85.field1085 = var11.field6424;
                                    class245.field3272.method641(var85, (byte) -93);
                                }
                                if (class369.field5062 > var11.field6432 && var11.field6384 != null) {
                                    class82 var86 = new class82();
                                    var86.field1086 = var11;
                                    var86.field1085 = var11.field6384;
                                    class245.field3272.method641(var86, (byte) -93);
                                }
                                var11.field6432 = class236.field3123;
                                if (var11.field6351 != null) {
                                    for (int var87 = 0; var87 < class150.field2120; var87++) {
                                        class82 var88 = new class82();
                                        var88.field1086 = var11;
                                        var88.field1089 = class375.field5173[var87].method148(-26944);
                                        var88.field1090 = class375.field5173[var87].method143(12088);
                                        var88.field1085 = var11.field6351;
                                        class245.field3272.method641(var88, (byte) -93);
                                    }
                                }
                                if (class51.field682 && var11.field6355 != null) {
                                    class82 var89 = new class82();
                                    var89.field1086 = var11;
                                    var89.field1085 = var11.field6355;
                                    class245.field3272.method641(var89, (byte) -93);
                                }
                            }
                            if (var11.field6358 == 5 && var11.field6367 != -1) {
                                var11.method2740(1, class391.field5430, class135.field1973).method2696((byte) 106, var11.field6340, class98.field1432);
                            }
                            class27.method156(-128, var11);
                            if (var11.field6358 == 0) {
                                method1040(arg0, var11.field6440, var14, var15, var16, var17, var12 - var11.field6330, var13 - var11.field6333, arg8, arg9);
                                if (var11.field6360 != null) {
                                    method1040(var11.field6360, var11.field6440, var14, var15, var16, var17, var12 - var11.field6330, var13 - var11.field6333, arg8, arg9);
                                }
                                class132 var90 = (class132) class214.field2883.method1528((long) var11.field6440, 59);
                                if (var90 != null) {
                                    if (class404.field5538 == class343.field4601 && var90.field1942 == 0 && !class385.field5334 && var21 && !class200.field2704) {
                                        class358.method2193((byte) 115);
                                    }
                                    class203.method1158(var12, var17, var16, var15, var13, arg8, var90.field1939, (byte) 127, arg9, var14);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class27.method156(-126, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1389)
    public final void init() {
        field2459++;
        if (!this.method1509(-123)) {
            return;
        }
        class390.field5406 = Integer.parseInt(this.getParameter("worldid"));
        class377.field5197 = class304.method1693(Integer.parseInt(this.getParameter("modewhere")), 5537);
        if (!class245.method1369(20672, class377.field5197) && class377.field5197 != class278.field3682) {
            class377.field5197 = class278.field3682;
        }
        class357.field4940 = class59.method418(Integer.parseInt(this.getParameter("modewhat")), (byte) 101);
        if (class357.field4940 != class1.field24 && class77.field1042 != class357.field4940 && class357.field4940 != class208.field2812) {
            class357.field4940 = class208.field2812;
        }
        try {
            class110.field1676 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class110.field1676 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class356.field4911 = true;
        } else {
            class356.field4911 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class284.field3842 = true;
        } else {
            class284.field3842 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class59.field792 = true;
        } else {
            class59.field792 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class343.field4601 = class243.field3233;
        } else {
            class343.field4601 = class404.field5538;
        }
        try {
            class448.field6099 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class448.field6099 = 0;
        }
        class213.field2870 = this.getParameter("quiturl");
        class441.field5949 = this.getParameter("settings");
        if (class441.field5949 == null) {
            class441.field5949 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class171.field2353 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class171.field2353 = 0;
            }
        }
        class3.field44 = Integer.parseInt(this.getParameter("colourid"));
        if (class3.field44 < 0 || class3.field44 >= class449.field6107.length) {
            class3.field44 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class239.field3191 = true;
            class164.field2275 = true;
        }
        class6.field81 = this;
        if (class404.field5538 == class343.field4601) {
            class431.field5877 = 503;
            class153.field2153 = 765;
        } else if (class343.field4601 == class243.field3233) {
            class431.field5877 = 480;
            class153.field2153 = 640;
        }
        this.method1514(class153.field2153, 578, class357.field4940.method826((byte) -127) + 32, 68, class431.field5877);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1491)
    public final void method1041(boolean arg0) {
        field2446++;
        if (class18.field258 == 1000) {
            return;
        }
        class70.field968++;
        if (class70.field968 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class47.field636 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class209.field2831.setSeed((long) class47.field636);
        }
        if (class70.field968 % 50 == 0) {
            class78.field1057 = class77.field1035;
            class346.field4769 = class65.field862;
            class77.field1035 = 0;
            class65.field862 = 0;
        }
        this.method1055((byte) -87);
        if (class194.field2625 != null) {
            class194.field2625.method1798((byte) -51);
        }
        class469.method2755(true);
        class183.method1073(-1);
        class449.field6111.method876(83);
        class34.field523.method1919(-31663);
        if (class210.field2840 != null) {
            int var3 = class210.field2840.method732(0);
            class416.field5659 = var3;
        }
        if (class98.field1432 != null) {
            class98.field1432.method2002((int) class440.method2583(25267));
        }
        class458.method2693(2);
        class150.field2120 = 0;
        if (arg0) {
            method1039(61);
        }
        for (class25 var4 = class449.field6111.method881(true); var4 != null && class150.field2120 < 128; var4 = class449.field6111.method881(true)) {
            if (var4.method147((byte) 126) != 1) {
                char var5 = var4.method143(12088);
                if (!class373.method2295(1323) || var5 != '`' && var5 != '§') {
                    class375.field5173[class150.field2120] = var4;
                    class150.field2120++;
                } else if (class140.method847((byte) -95)) {
                    class411.method2467(-39);
                } else {
                    class450.method2651(-18461);
                }
            }
        }
        class187.field2569 = null;
        for (class317 var6 = class34.field523.method1920(100); var6 != null; var6 = class34.field523.method1920(100)) {
            int var7 = var6.method1546(true);
            if (var7 == -1) {
                class270.field3601.method641(var6, (byte) -93);
            } else if (class289.method1631(var7, (byte) 124)) {
                class187.field2569 = var6;
            }
        }
        if (class140.method847((byte) -125)) {
            class4.method32((byte) 85);
        }
        if (class18.field258 == 0) {
            this.method1054(100);
            class383.method2351((byte) 123);
        } else if (class18.field258 == 5) {
            this.method1054(100);
            class383.method2351((byte) 123);
        } else if (class18.field258 == 25 || class18.field258 == 28) {
            class302.method1690(58);
        }
        if (class18.field258 == 10) {
            this.method1047(0);
            class383.method2352(0);
            class162.method953(-31847);
            class491.method2862((byte) 88);
        } else if (class18.field258 == 30) {
            class99.method608(4680);
        } else if (class18.field258 == 40) {
            class491.method2862((byte) 88);
            if (class297.field3976 != -3 && class297.field3976 != 2 && class297.field3976 != 15) {
                class476.method2779(0);
            }
        }
        class293.method1648(-2, class98.field1432);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z", line = 1632)
    public static final boolean method1042(int arg0, int arg1, int arg2, int arg3) {
        if (!class17.method110(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class302.field4025;
        int var5 = arg2 << class302.field4025;
        int var6 = class221.field2945[arg0].method371(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 == 1) {
            if (var4 > class138.field2003) {
                if (!class472.method2772(var4, var6, var5)) {
                    return false;
                }
                if (!class472.method2772(var4, var6, class230.field3020 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class472.method2772(var4, var7, var5)) {
                    return false;
                }
                if (!class472.method2772(var4, var7, class230.field3020 + var5)) {
                    return false;
                }
            }
            if (class472.method2772(var4, var8, var5)) {
                return class472.method2772(var4, var8, class230.field3020 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class1.field6) {
                if (!class472.method2772(var4, var6, class230.field3020 + var5)) {
                    return false;
                }
                if (!class472.method2772(class230.field3020 + var4, var6, class230.field3020 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class472.method2772(var4, var7, class230.field3020 + var5)) {
                    return false;
                }
                if (!class472.method2772(class230.field3020 + var4, var7, class230.field3020 + var5)) {
                    return false;
                }
            }
            if (class472.method2772(var4, var8, class230.field3020 + var5)) {
                return class472.method2772(class230.field3020 + var4, var8, class230.field3020 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class138.field2003) {
                if (!class472.method2772(class230.field3020 + var4, var6, var5)) {
                    return false;
                }
                if (!class472.method2772(class230.field3020 + var4, var6, class230.field3020 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class472.method2772(class230.field3020 + var4, var7, var5)) {
                    return false;
                }
                if (!class472.method2772(class230.field3020 + var4, var7, class230.field3020 + var5)) {
                    return false;
                }
            }
            if (class472.method2772(class230.field3020 + var4, var8, var5)) {
                return class472.method2772(class230.field3020 + var4, var8, class230.field3020 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class1.field6) {
                if (!class472.method2772(var4, var6, var5)) {
                    return false;
                }
                if (!class472.method2772(class230.field3020 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class472.method2772(var4, var7, var5)) {
                    return false;
                }
                if (!class472.method2772(class230.field3020 + var4, var7, var5)) {
                    return false;
                }
            }
            if (class472.method2772(var4, var8, var5)) {
                return class472.method2772(class230.field3020 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class472.method2772(class235.field3119 + var4, var9, class235.field3119 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class472.method2772(var4, var8, class230.field3020 + var5);
        } else if (arg3 == 32) {
            return class472.method2772(class230.field3020 + var4, var8, class230.field3020 + var5);
        } else if (arg3 == 64) {
            return class472.method2772(class230.field3020 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class472.method2772(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1813)
    public final void method1043(byte arg0) {
        field2461++;
        method1039(31);
        class433.method2554((byte) 29);
        class236.method1313(54);
        class106.method657(false);
        class206.method1175(39);
        class148.method875(0);
        class336.method1918(arg0 + 59);
        class488.method2846((byte) -63);
        class445.method2617(false);
        class46.method335(27336);
        class268.method1516(114);
        class267.method1505((byte) -120);
        class95.method595(0);
        class137.method829((byte) -53);
        class114.method729(108);
        class203.method1157((byte) -108);
        class364.method2223((byte) 118);
        class398.method2411(22);
        class409.method2457(0);
        class343.method1945((byte) -75);
        class105.method640((byte) 83);
        class312.method1712(-21512);
        class375.method2305(-31103);
        class245.method1365((byte) 127);
        class2.method20((byte) 85);
        class323.method1794((byte) 61);
        class110.method706((byte) -40);
        class161.method949(0);
        class213.method1207((byte) 58);
        class76.method509(arg0 + 148);
        class212.method1198(false);
        class314.method1732(arg0 ^ 0xFFFFFFF8);
        class318.method1744(0);
        class480.method2802((byte) 82);
        class295.method1659((byte) -56);
        class341.method1933(true);
        class3.method26(arg0 + 64);
        class367.method2240(99);
        class159.method928(true);
        class461.method2705(-25279);
        class358.method2191(-127);
        class128.method789(479);
        class277.method1564((byte) -121);
        class28.method161(arg0 + 59);
        class138.method835(168);
        class35.method260((byte) -108);
        class208.method1187(true);
        class250.method1396((byte) 64);
        class278.method1571(true);
        class19.method123((byte) -128);
        class252.method1414(127);
        class216.method1228((byte) -93);
        class215.method1217(true);
        class121.method752(0);
        class296.method1668(arg0 ^ 0x332E);
        class434.method2558(124);
        class356.method2184(35);
        class40.method281(arg0 ^ 0x1533);
        class261.method1474(2883872);
        class17.method106(arg0 ^ 0x4);
        class281.method1590(0);
        class455.method2675((byte) 67);
        class458.method2694(true);
        class464.method2729((byte) 56);
        class49.method349(111);
        class487.method2825(8574);
        class235.method1310(-62);
        class405.method2449((byte) -60);
        class270.method1531((byte) 5);
        class321.method1758(true);
        class140.method848(0);
        class109.method678(true);
        class32.method233(127);
        class181.method1064((byte) 85);
        class86.method543((byte) -128);
        class345.method2123(arg0 ^ 0xFFFF9304);
        class491.method2866(-114);
        class169.method995(0);
        class363.method2213(false);
        class132.method809(-27868);
        class78.method515(-1);
        class152.method896(arg0 ^ 0xFFFFFFC7);
        class163.method955(3);
        class347.method2147(31208);
        class284.method1608(10494);
        class456.method2683(arg0 ^ 0xFFFFFFC5);
        class177.method1014(-10487);
        class342.method1938(194);
        class404.method2444(1);
        class346.method2134((byte) 60);
        class308.method1700(false);
        class265.method1498((byte) -64);
        class108.method667(true);
        class272.method1540((byte) -106);
        class62.method425((byte) 75);
        class59.method417(3);
        class142.method862(18);
        class289.method1629(true);
        class67.method445(768);
        class484.method2816(255);
        class202.method1147((byte) -122);
        class134.method815(5384);
        class298.method1677(30);
        class402.method2434(-1);
        class27.method159((byte) -106);
        class460.method2701((byte) -59);
        class88.method558(32207);
        class266.method1503(arg0 ^ 0xFFFFFFC2);
        class429.method2530((byte) 24);
        class443.method2586((byte) 31);
        class33.method253(false);
        class231.method1288(arg0 ^ 0xFFFFE041);
        class136.method824(100);
        class441.method2584(2);
        class481.method2809(-126);
        class182.method1068(arg0 ^ 0xFFFFFFB2);
        class192.method1097(1);
        class244.method1359(-29301);
        class69.method457(8);
        class217.method1235();
        class9.method54(arg0 ^ 0xFFFFFFB9);
        class191.method1093(true);
        class369.method2277(arg0 ^ 0xC1E);
        class63.method429(1);
        class450.method2652(102);
        class73.method476(arg0 ^ 0xFFFFFFBC);
        class416.method2480((byte) -67);
        class382.method2338();
        class55.method398();
        class249.method1393(arg0 ^ 0xFFFFBBFB);
        class205.method1171((byte) 124);
        class253.method1418();
        class260.method1464(arg0 - 69);
        class80.method526(15799);
        class71.method461((byte) 74);
        class383.method2354(false);
        class448.method2634((byte) 101);
        class23.method139(0);
        class87.method555(arg0 ^ 0xFFFF98C9);
        class151.method892((byte) -96);
        class112.method723((byte) 120);
        class280.method1582(false);
        class401.method2432(0);
        class12.method74((byte) 114);
        class91.method582((byte) 12);
        class410.method2464(-17939);
        class462.method2717((byte) -88);
        class338.method1926((byte) -120);
        class387.method2377(-101);
        class351.method2171((byte) 124);
        class196.method1126(arg0 + 58);
        class26.method153(true);
        class400.method2425(arg0 ^ 0x39);
        class6.method42((byte) -105);
        class248.method1388(-46);
        class419.method2491(arg0 ^ 0xFFFFFFC5);
        class372.method2287(arg0 + 59);
        class288.method1628(arg0 ^ 0xFFFFFF9C);
        class153.method903(-1);
        class251.method1402((byte) -18);
        class70.method458(-7710);
        class171.method999(true);
        class190.method1087(true);
        class100.method615(true);
        class167.method983();
        class168.method991((byte) -126);
        class490.method2858(3);
        class302.method1691((byte) -99);
        class47.method340(false);
        class348.method2151(65535);
        class111.method716(false);
        class13.method81((byte) 126);
        class330.method1833((byte) 119);
        class172.method1000((byte) 103);
        class274.method1542((byte) 116);
        class225.method1267((byte) 78);
        class199.method1138((byte) -109);
        class471.method2762((byte) 40);
        class197.method1134(-118);
        class374.method2301(8473);
        class469.method2761(false);
        class256.method1443();
        class160.method939((byte) 126);
        class232.method1296(-69);
        class143.method863(false);
        class263.method1494(true);
        class354.method2180(-29584);
        class327.method1830((byte) 75);
        class451.method2654(arg0 ^ 0xFFFFFFAF);
        class309.method1704((byte) -128);
        class84.method531(32744);
        class449.method2644(arg0 ^ 0x4E);
        class467.method2746((byte) 100);
        class306.method1697(arg0 ^ 0x423B);
        class257.method1452((byte) -3);
        class146.method872((byte) -29);
        class117.method735(arg0 ^ 0xFFFFEFC5);
        class473.method2774((byte) 51);
        class412.method2472((byte) -75);
        class279.method1576((byte) -84);
        class373.method2296(true);
        class239.method1323(-84);
        class97.method601((byte) 2);
        class210.method1196(-27084);
        class421.method2496();
        class316.method1734(true);
        class77.method510(1);
        class408.method2453((byte) -61);
        class230.method1284(114);
        class103.method624((byte) 66);
        class64.method433(-121);
        class422.method2498(-27473);
        class193.method1102(-124);
        class223.method1263(-115);
        class15.method96(arg0 ^ 0x3A);
        class477.method2792(arg0 + 10731);
        class8.method52(true);
        class1.method11(arg0 + 60);
        class357.method2189(-120);
        class291.method1635((byte) -1);
        class424.method2506((byte) 63);
        class96.method598((byte) -62);
        class352.method2176();
        class130.method794(116);
        class304.method1695(arg0 ^ 0x4E);
        class262.method1488((byte) -2);
        class390.method2396(-99);
        class365.method2229((byte) -64);
        class483.method2812(arg0);
        class432.method2551(-27340);
        class158.method926(false);
        class16.method102((byte) -118);
        class123.method760(-31);
        class48.method345(17685);
        class430.method2546();
        class384.method2355(77);
        class165.method960(arg0 + 60);
        class125.method764(-127);
        class294.method1652((byte) -47);
        class297.method1673(512);
        class183.method1072(false);
        class94.method592((byte) -80);
        class486.method2823((byte) -125);
        class173.method1004(-8488);
        class332.method1904((byte) 121);
        class127.method780(0);
        class417.method2486(2);
        class299.method1680(3);
        class42.method285(arg0 ^ 0xFFFFFFC5);
        class198.method1136();
        class438.method2578();
        class300.method1683(-59);
        class324.method1802(4);
        class447.method2628(arg0 ^ 0xFFFFFFE4);
        class221.method1253((byte) -101);
        class37.method275((byte) -12);
        class379.method2326();
        class29.method173();
        class178.method1015((byte) -128);
        class394.method2401();
        class141.method858((byte) -109);
        class51.method359(102);
        class326.method1827(-1);
        class413.method2476((byte) -22);
        class150.method887(true);
        class385.method2357(arg0 ^ 0xFFFFFFC6);
        class322.method1789(false);
        class18.method118(arg0 ^ 0xFFFFFF45);
        class89.method576(-1);
        class247.method1387(arg0 ^ 0x4F);
        class233.method1299(arg0 ^ 0xFFFFFF0D);
        class389.method2384((byte) -95);
        class93.method591(-26229);
        class194.method1110(arg0 - 57);
        class200.method1143(arg0 ^ 0x67);
        class79.method522(arg0 + 74);
        class176.method1013(6);
        class104.method633(false);
        class310.method1707(5);
        class92.method587(-30710);
        class120.method748(83);
        class444.method2604(arg0 ^ 0xFFFFFFB0);
        class30.method174((byte) -60);
        class65.method435((byte) -60);
        class186.method1079(true);
        class391.method2397(arg0 ^ 0xFFFFFF9D);
        class98.method607(-5);
        class34.method259((byte) -81);
        class162.method951((byte) 79);
        class271.method1537((byte) 96);
        class135.method820(-123);
        class60.method421(-56);
        class175.method1008(4096);
        class52.method361((byte) -85);
        class102.method620(1);
        class124.method763(60);
        class187.method1081(true);
        class7.method45(false);
        class453.method2657(true);
        class466.method2744(-120);
        class475.method2776(arg0 + 60);
        class335.method1914((byte) 82);
        class243.method1358((byte) -102);
        class56.method407(16);
        class11.method66(0);
        class446.method2621((byte) -66);
        class214.method1213(true);
        class4.method34(102);
        class72.method467(0);
        class246.method1381(0);
        class188.method1082((byte) -17);
        class14.method89(83);
        class209.method1190((byte) -101);
        class331.method1891();
        class254.method1425();
        class129.method792(false);
        class492.method2871(arg0 + 1059);
        class195.method1113(4096);
        class428.method2523((byte) 120);
        class36.method273(false);
        class107.method663(-1);
        class377.method2317((byte) 38);
        class45.method328((byte) 84);
        class119.method745(-14625);
        class482.method2811(73);
        class311.method1710(false);
        class370.method2283((byte) 10);
        class437.method2576(0);
        class25.method142(200);
        class317.method1737(16383);
        class38.method277((byte) -111);
        class39.method280(123);
        class99.method610(arg0 ^ 0xFFFFFFBB);
        class392.method2399(-8256);
        class395.method2410(arg0 ^ 0xFFFFFF8C);
        class68.method451((byte) -11);
        class276.method1548(0);
        class411.method2469(arg0 ^ 0xFFFFEFC5);
        class90.method579(0);
        class228.method1280(119);
        class220.method1251((byte) -94);
        class31.method183(false);
        class259.method1456((byte) -96);
        class155.method909(false);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2165)
    private final void method1044(int arg0) {
        field2450++;
        if (class367.field5055 < class477.field6599.field3280) {
            class169.field2339 = (class477.field6599.field3280 - 1) * 50 * 5;
            if (class95.field1403 == class265.field3503) {
                class265.field3503 = class289.field3890;
            } else {
                class265.field3503 = class95.field1403;
            }
            if (class169.field2339 > 3000) {
                class169.field2339 = 3000;
            }
            if (class477.field6599.field3280 >= 2 && class477.field6599.field3278 == 6) {
                this.method1512(arg0 + 1, "js5connect_outofdate");
                class18.field258 = 1000;
                return;
            }
            if (class477.field6599.field3280 >= 4 && class477.field6599.field3278 == -1) {
                this.method1512(1, "js5crc");
                class18.field258 = 1000;
                return;
            }
            if (class477.field6599.field3280 >= 4 && (class18.field258 == 0 || class18.field258 == 5)) {
                if (class477.field6599.field3278 == 7 || class477.field6599.field3278 == 9) {
                    this.method1512(arg0 + 1, "js5connect_full");
                } else if (class477.field6599.field3278 > 0) {
                    this.method1512(1, "js5connect");
                } else {
                    this.method1512(1, "js5io");
                }
                class18.field258 = 1000;
                return;
            }
        }
        class367.field5055 = class477.field6599.field3280;
        if (class169.field2339 > arg0) {
            class169.field2339--;
            return;
        }
        try {
            if (class428.field5790 == 0) {
                class412.field5640 = class251.field3359.method1333(class168.field2325, class265.field3503, arg0 + 1);
                class428.field5790++;
            }
            if (class428.field5790 == 1) {
                if (class412.field5640.field6534 == 2) {
                    this.method1036(1000, (byte) -127);
                    return;
                }
                if (class412.field5640.field6534 == 1) {
                    class428.field5790++;
                }
            }
            if (class428.field5790 == 2) {
                class260.field3448 = new class375((Socket) class412.field5640.field6529, class251.field3359);
                class32 var2 = new class32(5);
                var2.method228(class419.field5690.field1076, 32);
                var2.method199((byte) -117, 578);
                class260.field3448.method2308(false, 0, 5, var2.field472);
                class428.field5790++;
                class31.field426 = class440.method2583(25267);
            }
            if (class428.field5790 == 3) {
                if (class18.field258 == 0 || class18.field258 == 5 || class260.field3448.method2306(arg0 + 1) > 0) {
                    int var3 = class260.field3448.method2311(1);
                    if (var3 != 0) {
                        this.method1036(var3, (byte) -106);
                        return;
                    }
                    class428.field5790++;
                } else if ((class440.method2583(25267) - class31.field426) > 30000L) {
                    this.method1036(1001, (byte) -112);
                    return;
                }
            }
            if (class428.field5790 == 4) {
                boolean var4 = class18.field258 == 5 || class18.field258 == 10 || class18.field258 == 28;
                class477.field6599.method1370(class260.field3448, !var4, 0);
                class412.field5640 = null;
                class428.field5790 = 0;
                class260.field3448 = null;
            }
        } catch (IOException var5) {
            this.method1036(1002, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lnk;)Z", line = 2309)
    public static final boolean method1045(class464 arg0) {
        if (class200.field2704) {
            if (method1046(arg0).field2954 != 0) {
                return false;
            }
            if (arg0.field6358 == 0) {
                return false;
            }
        }
        return arg0.field6348;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lnk;)Leh;", line = 2327)
    public static final class222 method1046(class464 arg0) {
        class222 var1 = (class222) class128.field1876.method1528(((long) arg0.field6440 << 32) + (long) arg0.field6397, 87);
        return var1 == null ? arg0.field6317 : var1;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2331)
    private final void method1047(int arg0) {
        field2458++;
        class448.field6098++;
        class80.method524(-1, (class464) null, -1, 0);
        class453.method2659(-1, 82, (class464) null, -1);
        class428.method2520(-126);
        class236.field3123++;
        for (int var2 = arg0; var2 < 32768; var2++) {
            class121 var12 = class221.field2941[var2];
            if (var12 != null) {
                byte var13 = var12.field1780.field5815;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method545(false);
                    if ((var13 & 0x2) != 0 && var12.field1203 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field1193[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (class295.field3947 - var14 - 1 < var17) {
                                var17 = class295.field3947 - var14 - 1;
                            }
                            int var18 = var12.field1197[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (class39.field567 - var14 - 1 < var18) {
                                var18 = class39.field567 - var14 - 1;
                            }
                            int var19 = class30.method175(true, class93.field1361, var14, -1, arg0 ^ 0x1, 0, 0, class60.field805[var12.field6502], var12.field1193[0], var14, var17, class193.field2613, var14, var18, var12.field1197[0]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field1193[var20] = class93.field1361[var19 - var20 - 1];
                                    var12.field1197[var20] = class193.field2613[var19 - var20 - 1];
                                    var12.field1195[var20] = 1;
                                }
                                var12.field1203 = var19;
                            }
                        }
                    }
                    class48.method343(var12, (byte) -1, true);
                    int var21 = class407.method2451(true, var12);
                    class82.method528(var21, class95.field1401, class199.field2695, var12, -20491);
                    class365.method2226((byte) -42, var12);
                }
            }
        }
        if (class18.field256 == 0 && class30.field400 == 0) {
            if (class56.field772 == 2) {
                class492.method2868(-13161);
            } else {
                class317.method1740((byte) 85);
            }
            if (class197.field2680 >> 7 < 14 || (class197.field2680 >> 7) >= (class295.field3947 - 14) || class412.field5637 >> 7 < 14 || class412.field5637 >> 7 >= class39.field567 - 14) {
                class228.method1279(false);
            }
        }
        while (true) {
            class82 var3;
            class464 var4;
            class464 var5;
            do {
                var3 = (class82) class400.field5500.method650((byte) -3);
                if (var3 == null) {
                    while (true) {
                        class82 var6;
                        class464 var7;
                        class464 var8;
                        do {
                            var6 = (class82) class78.field1050.method650((byte) -3);
                            if (var6 == null) {
                                while (true) {
                                    class82 var9;
                                    class464 var10;
                                    class464 var11;
                                    do {
                                        var9 = (class82) class245.field3272.method650((byte) -3);
                                        if (var9 == null) {
                                            if (class385.field5314 != null) {
                                                class434.method2559((byte) -123);
                                            }
                                            if (class70.field968 % 1500 == 0) {
                                                class302.method1692(31534);
                                            }
                                            class220.method1249(-2);
                                            if (class485.field6703 && class385.field5329 < (class440.method2583(25267) - 60000L)) {
                                                class342.method1940(false);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field1086;
                                        if (var10.field6397 < 0) {
                                            break;
                                        }
                                        var11 = class150.method888((byte) -115, var10.field6362);
                                    } while (var11 == null || var11.field6360 == null || var10.field6397 >= var11.field6360.length || var11.field6360[var10.field6397] != var10);
                                    class382.method2340(var9);
                                }
                            }
                            var7 = var6.field1086;
                            if (var7.field6397 < 0) {
                                break;
                            }
                            var8 = class150.method888((byte) -115, var7.field6362);
                        } while (var8 == null || var8.field6360 == null || var7.field6397 >= var8.field6360.length || var8.field6360[var7.field6397] != var7);
                        class382.method2340(var6);
                    }
                }
                var4 = var3.field1086;
                if (var4.field6397 < 0) {
                    break;
                }
                var5 = class150.method888((byte) -115, var4.field6362);
            } while (var5 == null || var5.field6360 == null || var4.field6397 >= var5.field6360.length || var5.field6360[var4.field6397] != var4);
            class382.method2340(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V", line = 2536)
    private final void method1048(byte arg0, byte[] arg1) {
        field2448++;
        if (arg0 != -39) {
            return;
        }
        class32 var3 = new class32(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method201((byte) -109);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class117.field1731 = new int[6];
                        var9[0] = var3.method215((byte) 119);
                        var9[1] = var3.method215((byte) 104);
                        var9[2] = var3.method215((byte) 125);
                        var9[3] = var3.method215((byte) 126);
                        var9[4] = var3.method215((byte) 121);
                        var9[5] = var3.method215((byte) 109);
                    } else if (var4 == 4) {
                        int var5 = var3.method201((byte) -115);
                        class35.field537 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class35.field537[var6] = var3.method215((byte) 104);
                            if (class35.field537[var6] == 65535) {
                                class35.field537[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method201((byte) -113);
                        class108.field1626 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class108.field1626[var8] = var3.method215((byte) 93);
                            if (class108.field1626[var8] == 65535) {
                                class108.field1626[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2616)
    public static final void method1049() {
        class132.field1938 = 0;
        for (int var0 = 0; var0 < class202.field2734; var0++) {
            class121 var1 = class221.field2941[class412.field5638[var0]];
            if (var1.field1170 && var1.method541(true) != -1) {
                int var2 = (var1.method545(false) - 1) * 64 + 60;
                int var3 = var1.field6501 - var2 >> 7;
                int var4 = var1.field6507 - var2 >> 7;
                class86 var5 = class21.method131(var1.field6502, var3, -115, var4);
                if (var5 != null) {
                    int var6 = var5.field1163;
                    if (var5 instanceof class121) {
                        var6 += 2048;
                    }
                    if (var5.field1171 == 0 && var5.method541(true) != -1) {
                        class7.field93[class132.field1938] = var6;
                        class130.field1919[class132.field1938] = var6;
                        class132.field1938++;
                        var5.field1171++;
                    }
                    class7.field93[class132.field1938] = var6;
                    class130.field1919[class132.field1938] = var1.field1163 + 2048;
                    class132.field1938++;
                    var5.field1171++;
                }
            }
        }
        class84.method530(class130.field1919, class132.field1938 - 1, 0, class7.field93, 1);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2668)
    public static final void method1050(int arg0) {
        int var1 = class239.field3187;
        int[] var2 = class265.field3502;
        for (int var3 = 0; var3 < class202.field2734 + var1; var3++) {
            class86 var4;
            if (var3 < var1) {
                var4 = class413.field5644[var2[var3]];
            } else {
                var4 = class221.field2941[class412.field5638[var3 - var1]];
            }
            if (var4.field6502 == arg0 && var4.field1189 >= 0) {
                int var5 = var4.method545(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6501 & 0x7F) != 0 || (var4.field6507 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6501 & 0x7F) != 64 || (var4.field6507 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6501 >> 7;
                    int var7 = var4.field6507 >> 7;
                    if (var4.field1189 > class405.field5568[var6][var7]) {
                        class405.field5568[var6][var7] = var4.field1189;
                        class65.field868[var6][var7] = 1;
                    } else if (class405.field5568[var6][var7] == var4.field1189) {
                        var10002 = class65.field868[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6501 - var8 >> 7;
                    int var10 = var4.field6507 - var8 >> 7;
                    int var11 = var4.field6501 + var8 >> 7;
                    int var12 = var4.field6507 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1189 > class405.field5568[var13][var14]) {
                                class405.field5568[var13][var14] = var4.field1189;
                                class65.field868[var13][var14] = 1;
                            } else if (class405.field5568[var13][var14] == var4.field1189) {
                                var10002 = class65.field868[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2770)
    public static final void method1051(int arg0) {
        int var1 = class239.field3187;
        int[] var2 = class265.field3502;
        int var3 = class68.field931 ? var1 : class202.field2734 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class86 var5;
            if (var4 < var1) {
                var5 = class413.field5644[var2[var4]];
            } else {
                var5 = class221.field2941[class412.field5638[var4 - var1]];
            }
            if (var5.field6502 == arg0) {
                var5.field1171 = 0;
                if (var5.field1189 < 0) {
                    var5.field1170 = false;
                } else {
                    int var6 = var5.method545(false);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6501 & 0x7F) != 0 || (var5.field6507 & 0x7F) != 0) {
                            var5.field1170 = false;
                            continue;
                        }
                    } else if ((var5.field6501 & 0x7F) != 64 || (var5.field6507 & 0x7F) != 64) {
                        var5.field1170 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6501 >> 7;
                        int var8 = var5.field6507 >> 7;
                        if (class405.field5568[var7][var8] != var5.field1189) {
                            var5.field1170 = true;
                            continue;
                        }
                        if (class65.field868[var7][var8] > 1) {
                            var10002 = class65.field868[var7][var8]--;
                            var5.field1170 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6501 - var9 >> 7;
                        int var11 = var5.field6507 - var9 >> 7;
                        int var12 = var5.field6501 + var9 >> 7;
                        int var13 = var5.field6507 + var9 >> 7;
                        if (!class71.method463(var5.field1189, var11, var13, (byte) 67, var12, var10)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class405.field5568[var14][var15] == var5.field1189) {
                                        var10002 = class65.field868[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1170 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class487 && var5.field1201 != null && class70.field968 >= var5.field1201.field2205 && class70.field968 < var5.field1201.field2224) {
                        ((class487) var5).field6766 = false;
                    }
                    var5.field1170 = false;
                    var5.field6503 = class247.method1385(-39, var5.field6501, var5.field6507, var5.field6502);
                    class214.method1212(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 2887)
    public final void method1052(byte arg0) {
        field2453++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class103.method626(-12504);
        class402.field5526 = new class2(class251.field3359);
        class477.field6599 = new class245();
        if (class377.field5197 != class278.field3682) {
            class146.field2098 = new byte[50][];
        }
        class488.field6789 = new class398(class251.field3359);
        if (class377.field5197 == class278.field3682) {
            class209.field2832 = this.getCodeBase().getHost();
            class291.field3906 = 43594;
            class17.field237 = 443;
        } else if (class245.method1369(20672, class377.field5197)) {
            class209.field2832 = this.getCodeBase().getHost();
            class291.field3906 = class390.field5406 + 40000;
            class17.field237 = class390.field5406 + 50000;
        } else if (class377.field5197 == class374.field5160) {
            class291.field3906 = class390.field5406 + 40000;
            class17.field237 = class390.field5406 + 50000;
            class209.field2832 = "127.0.0.1";
        }
        class95.field1403 = class291.field3906;
        class168.field2325 = class209.field2832;
        class135.field1966 = class291.field3906;
        class289.field3890 = class17.field237;
        if (arg0 > -64) {
            return;
        }
        class203.field2753 = class249.field3324 = class408.field5588 = class358.field4953 = new short[256];
        class265.field3503 = class135.field1966;
        if (class241.field3211 == 3) {
            class33.field506 = class390.field5406;
        }
        if (class343.field4601 == class243.field3233) {
            class312.field4111 = class473.field6523;
            class425.field5768 = 16777215;
            class266.field3517 = true;
            class419.field5689 = class392.field5445;
            class483.field6661 = 0;
            class188.field2577 = class309.field4085;
            class138.field2004 = class244.field3249;
        } else {
            class419.field5689 = class125.field1821;
            class188.field2577 = class107.field1604;
            class138.field2004 = class309.field4090;
            class312.field4111 = class247.field3294;
        }
        class449.field6111 = class200.method1144(0, class28.field378);
        class34.field523 = class239.method1325(true, class28.field378, 97);
        class210.field2840 = class329.method1831(true);
        if (class210.field2840 != null) {
            class210.field2840.method730((byte) 108, class28.field378);
        }
        class281.field3789 = class241.field3211;
        try {
            if (class251.field3359.field3214 != null) {
                class206.field2794 = new class161(class251.field3359.field3214, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class481.field6648[var3] = new class161(class251.field3359.field3220[var3], 6000, 0);
                }
                class7.field94 = new class161(class251.field3359.field3217, 6000, 0);
                class200.field2713 = new class213(255, class206.field2794, class7.field94, 500000);
                class48.field644 = new class161(class251.field3359.field3206, 24, 0);
                class251.field3359.field3206 = null;
                class251.field3359.field3217 = null;
                class251.field3359.field3220 = null;
                class251.field3359.field3214 = null;
            }
        } catch (IOException var4) {
            class7.field94 = null;
            class206.field2794 = null;
            class48.field644 = null;
            class200.field2713 = null;
        }
        if (class377.field5197 != class278.field3682) {
            class165.field2286 = true;
        }
        class433.field5898 = (class404.field5538 == class343.field4601 ? class86.field1179 : class86.field1129).method1176(class110.field1676, (byte) -118);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3004)
    public static final void method1053() {
        int var0 = class239.field3187;
        int[] var1 = class265.field3502;
        int var2 = class68.field931 ? var0 : class202.field2734 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class86 var4;
            if (var3 < var0) {
                var4 = class413.field5644[var1[var3]];
            } else {
                var4 = class221.field2941[class412.field5638[var3 - var0]];
            }
            if (var4.field1189 >= 0) {
                int var5 = var4.method545(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6501 & 0x7F) == 0 && (var4.field6507 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6501 & 0x7F) == 64 && (var4.field6507 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class487 && var4.field1201 != null && class70.field968 >= var4.field1201.field2205 && class70.field968 < var4.field1201.field2224) {
                    ((class487) var4).field6766 = false;
                }
                var4.field6503 = class247.method1385(-112, var4.field6501, var4.field6507, var4.field6502);
                class214.method1212(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3049)
    private final void method1054(int arg0) {
        if (!class488.field6789.field6689) {
            for (int var2 = 0; var2 < class150.field2120; var2++) {
                if (class375.field5173[var2].method143(arg0 + 11988) == 's' || class375.field5173[var2].method143(12088) == 'S') {
                    class488.field6789.field6689 = true;
                    break;
                }
            }
        }
        field2454++;
        if (class428.field5791 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class440.method2583(arg0 + 25167);
            if (class268.field3575 == 0L) {
                class268.field3575 = var5;
            }
            if (var4 > 16384 && (var5 - class268.field3575) < 5000L) {
                if (var5 - class66.field898 > 1000L) {
                    System.gc();
                    class66.field898 = var5;
                }
                class458.field6215 = class169.field2337.method1176(class110.field1676, (byte) -101);
                class30.field397 = 5;
            } else {
                class458.field6215 = class455.field6166.method1176(class110.field1676, (byte) -120);
                class30.field397 = 5;
                class428.field5791 = 10;
            }
        } else if (class428.field5791 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class60.field805[var7] = class27.method157(class39.field567, (byte) -127, class295.field3947);
            }
            class458.field6215 = class129.field1895.method1176(class110.field1676, (byte) -128);
            class428.field5791 = 20;
            class30.field397 = 10;
        } else if (class428.field5791 == 20) {
            if (class194.field2625 == null) {
                class194.field2625 = new class323(class477.field6599, class402.field5526);
            }
            if (class194.field2625.method1793((byte) -128)) {
                class176.field2400 = class67.method443(1, true, (byte) -92, 0, false);
                class32.field441 = class67.method443(1, true, (byte) -121, 1, false);
                class19.field262 = class67.method443(1, true, (byte) -119, 2, false);
                class267.field3552 = class67.method443(1, true, (byte) -86, 3, false);
                class265.field3506 = class67.method443(1, true, (byte) -95, 4, false);
                class87.field1219 = class67.method443(1, true, (byte) -114, 5, true);
                class330.field4383 = class67.method443(1, false, (byte) -111, 6, true);
                class356.field4916 = class67.method443(1, true, (byte) -87, 7, false);
                class473.field6525 = class67.method443(1, true, (byte) -105, 8, false);
                class108.field1627 = class67.method443(1, true, (byte) -107, 9, false);
                class311.field4106 = class67.method443(1, true, (byte) -113, 10, false);
                class168.field2331 = class67.method443(1, true, (byte) -91, 11, false);
                class262.field3477 = class67.method443(1, true, (byte) -112, 12, false);
                class172.field2358 = class67.method443(1, true, (byte) -90, 13, false);
                class338.field4543 = class67.method443(1, false, (byte) -108, 14, false);
                class33.field511 = class67.method443(1, true, (byte) -114, 15, false);
                class104.field1514 = class67.method443(1, true, (byte) -108, 16, false);
                class34.field519 = class67.method443(1, true, (byte) -118, 17, false);
                class168.field2323 = class67.method443(1, true, (byte) -100, 18, false);
                class209.field2834 = class67.method443(1, true, (byte) -116, 19, false);
                class196.field2673 = class67.method443(1, true, (byte) -105, 20, false);
                class365.field5028 = class67.method443(1, true, (byte) -104, 21, false);
                class417.field5663 = class67.method443(1, true, (byte) -127, 22, false);
                class484.field6701 = class67.method443(1, true, (byte) -120, 23, true);
                class299.field4004 = class67.method443(1, true, (byte) -108, 24, false);
                class196.field2671 = class67.method443(1, true, (byte) -98, 25, false);
                class148.field2110 = class67.method443(1, true, (byte) -91, 26, true);
                class209.field2833 = class67.method443(1, true, (byte) -126, 27, false);
                class265.field3504 = class67.method443(1, true, (byte) -98, 28, true);
                class458.field6215 = class327.field4365.method1176(class110.field1676, (byte) -126);
                class428.field5791 = 30;
                class30.field397 = 15;
            } else {
                class458.field6215 = class288.field3880.method1176(class110.field1676, (byte) -99);
                class30.field397 = 12;
            }
        } else if (class428.field5791 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class80.field1074[var9].method2512(true) * class135.field1974[var9] / 100;
            }
            if (var8 == 100) {
                class458.field6215 = class34.field522.method1176(class110.field1676, (byte) -115);
                class30.field397 = 20;
                class36.method271((byte) -101, class473.field6525);
                class160.method937(class473.field6525, -112);
                class428.field5791 = 40;
            } else {
                if (var8 != 0) {
                    class458.field6215 = class35.field527.method1176(class110.field1676, (byte) -124) + var8 + "%";
                }
                class30.field397 = 20;
            }
        } else if (class428.field5791 == 40) {
            if (class265.field3504.method686(-72)) {
                this.method1048((byte) -39, class265.field3504.method695(1, 14));
                class458.field6215 = class35.field539.method1176(class110.field1676, (byte) -108);
                class30.field397 = 25;
                class428.field5791 = 50;
            } else {
                class458.field6215 = class146.field2096.method1176(class110.field1676, (byte) -90) + class265.field3504.method704((byte) 118) + "%";
                class30.field397 = 25;
            }
        } else if (class428.field5791 == 50) {
            class178.method1017(true, 2, 22050, class488.field6789.field6672);
            class299.field3997 = new class321();
            class299.field3997.method1774(9, 128, (byte) 43);
            class259.field3433 = class164.method958((byte) -72, 0, class251.field3359, class28.field378, 22050);
            class259.field3433.method854(0, class299.field3997);
            class13.method84(class338.field4543, class33.field511, class265.field3506, class299.field3997, -120);
            class98.field1434 = class164.method958((byte) -72, 1, class251.field3359, class28.field378, 2048);
            class181.field2494 = new class360();
            class98.field1434.method854(0, class181.field2494);
            class159.field2197 = new class109(22050, class165.field2290);
            class429.field5868 = class330.field4383.method688((byte) 87, "scape main");
            class458.field6215 = class446.field6067.method1176(class110.field1676, (byte) -98);
            class30.field397 = 30;
            class428.field5791 = 60;
        } else if (class428.field5791 == 60) {
            int var10 = class3.method28(-13590, class172.field2358, class473.field6525);
            int var11 = class488.method2842(false);
            if (var11 > var10) {
                class458.field6215 = class284.field3824.method1176(class110.field1676, (byte) -107) + var10 * 100 / var11 + "%";
                class30.field397 = 35;
            } else {
                class458.field6215 = class377.field5195.method1176(class110.field1676, (byte) -105);
                class428.field5791 = 70;
                class30.field397 = 35;
            }
        } else if (class428.field5791 == 70) {
            int var12 = class140.method856(0, class473.field6525);
            int var13 = class246.method1380(true);
            if (var12 < var13) {
                class458.field6215 = class483.field6656.method1176(class110.field1676, (byte) -120) + var12 * 100 / var13 + "%";
                class30.field397 = 40;
            } else {
                class458.field6215 = class244.field3247.method1176(class110.field1676, (byte) -90);
                class428.field5791 = 80;
                class30.field397 = 40;
            }
        } else if (class428.field5791 == 80) {
            if (class148.field2110.method686(arg0 ^ 0xFFFFFFA9)) {
                class248.field3300 = new class383(class148.field2110, class108.field1627, class473.field6525);
                class458.field6215 = class124.field1810.method1176(class110.field1676, (byte) -102);
                class30.field397 = 45;
                class428.field5791 = 90;
            } else {
                class458.field6215 = class327.field4367.method1176(class110.field1676, (byte) -115) + class148.field2110.method704((byte) 110) + "%";
                class30.field397 = 45;
            }
        } else if (class428.field5791 == 90) {
            class458.field6215 = class49.field654.method1176(class110.field1676, (byte) -110);
            class428.field5791 = 95;
            class30.field397 = 50;
        } else if (class428.field5791 == 95) {
            if (class488.field6789.field6689) {
                class488.field6789.field6695 = 1;
                class488.field6789.field6663 = 0;
                class488.field6789.field6678 = 0;
                class488.field6789.field6674 = 0;
                class488.field6789.field6691 = 0;
            }
            class488.field6789.field6689 = true;
            class488.field6789.method2417(arg0 ^ 0x11, class251.field3359);
            class49.method350(false, arg0 ^ 0x9600064, class488.field6789.field6663);
            class458.field6215 = class102.field1469.method1176(class110.field1676, (byte) -98);
            class30.field397 = 55;
            class428.field5791 = 100;
        } else if (class428.field5791 == arg0) {
            class464.method2731(class473.field6525, class172.field2358, class98.field1432, 300);
            class458.field6215 = class163.field2268.method1176(class110.field1676, (byte) -128);
            class30.field397 = 60;
            class119.method746(5, (byte) 108);
            class428.field5791 = 110;
        } else if (class428.field5791 == 110) {
            class19.field262.method686(-87);
            byte var14 = 0;
            int var15 = var14 + class19.field262.method704((byte) -35);
            class104.field1514.method686(arg0 - 209);
            int var16 = var15 + class104.field1514.method704((byte) -19);
            class34.field519.method686(-80);
            int var17 = var16 + class34.field519.method704((byte) 123);
            class168.field2323.method686(-70);
            int var18 = var17 + class168.field2323.method704((byte) 111);
            class209.field2834.method686(-89);
            int var19 = var18 + class209.field2834.method704((byte) 110);
            class196.field2673.method686(-89);
            int var20 = var19 + class196.field2673.method704((byte) -97);
            class365.field5028.method686(arg0 ^ 0xFFFFFFFD);
            int var21 = var20 + class365.field5028.method704((byte) 125);
            class417.field5663.method686(-120);
            int var22 = var21 + class417.field5663.method704((byte) -81);
            class299.field4004.method686(-83);
            int var23 = var22 + class299.field4004.method704((byte) -14);
            class196.field2671.method686(-105);
            int var24 = var23 + class196.field2671.method704((byte) 121);
            class209.field2833.method686(-104);
            int var25 = var24 + class209.field2833.method704((byte) 1);
            if (var25 < 1100) {
                class458.field6215 = class111.field1690.method1176(class110.field1676, (byte) -110) + var25 / 11 + "%";
                class30.field397 = 65;
            } else {
                class94.field1387 = new class28(class343.field4601, class110.field1676, class19.field262);
                class193.field2611 = new class212(class343.field4601, class110.field1676, class19.field262);
                class86.field1146 = new class314(class343.field4601, class110.field1676, class19.field262, class473.field6525);
                class76.field1028 = new class318(class343.field4601, class110.field1676, class34.field519);
                class395.field5481 = new class480(class343.field4601, class110.field1676, class19.field262);
                class119.field1742 = new class295(class343.field4601, class110.field1676, class19.field262);
                class28.field366 = new class341(class343.field4601, class110.field1676, class19.field262, class356.field4916);
                class152.field2141 = new class3(class343.field4601, class110.field1676, class19.field262);
                class308.field4078 = new class367(class343.field4601, class110.field1676, class19.field262);
                class1.field23 = new class159(class343.field4601, class110.field1676, true, class104.field1514, class356.field4916);
                class464.field6319 = new class461(class343.field4601, class110.field1676, class19.field262, class473.field6525);
                class171.field2351 = new class358(class343.field4601, class110.field1676, class19.field262, class473.field6525);
                class150.field2121 = new class128(class343.field4601, class110.field1676, true, class168.field2323, class356.field4916);
                class175.field2385 = new class277(class343.field4601, class110.field1676, true, class94.field1387, class209.field2834, class356.field4916);
                class477.field6580 = new class138(class343.field4601, class110.field1676, class19.field262);
                class395.field5477 = new class35(class343.field4601, class110.field1676, class196.field2673, class176.field2400, class32.field441);
                class391.field5430 = new class293(class343.field4601, class110.field1676, class19.field262);
                class135.field1973 = new class208(class343.field4601, class110.field1676, class19.field262);
                class302.field4030 = new class250(class343.field4601, class110.field1676, class365.field5028, class356.field4916);
                class281.field3787 = new class278(class343.field4601, class110.field1676, class19.field262);
                class51.field679 = new class19(class343.field4601, class110.field1676, class19.field262);
                class100.field1462 = new class252(class343.field4601, class110.field1676, class19.field262);
                class302.field4021 = new class216(class343.field4601, class110.field1676, class417.field5663);
                class458.field6219 = new class215(class343.field4601, class110.field1676, class19.field262);
                class482.method2810(class172.field2358, (byte) -40, class356.field4916, class267.field3552, class473.field6525);
                class151.method893(new class70(), class299.field4004, class196.field2671, (byte) -20);
                class35.method261(class299.field4004, class196.field2671, false);
                class458.field6215 = class119.field1743.method1176(class110.field1676, (byte) -91);
                class30.field397 = 65;
                class375.method2309((byte) 84);
                class1.field23.method932(0, !class488.field6789.method2415(-4, class222.field2958));
                class38.field562 = new class343();
                class449.method2640(-99);
                class257.method1448(class209.field2833, 0);
                class45.method329(class248.field3300, (byte) 100, class356.field4916);
                class428.field5791 = 120;
            }
        } else if (class428.field5791 == 120) {
            int var26 = class467.method2747((byte) -102, class473.field6525);
            int var27 = class153.method905(16);
            if (var27 > var26) {
                class458.field6215 = class35.field543.method1176(class110.field1676, (byte) -119) + var26 * 100 / var27 + "%";
                class30.field397 = 70;
            } else {
                class160.method936(class98.field1432, (byte) 127, class473.field6525);
                class6.method40(class471.field6498, -128);
                class458.field6215 = class148.field2112.method1176(class110.field1676, (byte) -120);
                class428.field5791 = 130;
                class30.field397 = 70;
            }
        } else if (class428.field5791 == 130) {
            if (class311.field4106.method711("huffman", "", false)) {
                class490 var28 = new class490(class311.field4106.method697("huffman", "", -1));
                class389.method2386(-1, var28);
                class458.field6215 = class467.field6464.method1176(class110.field1676, (byte) -117);
                class428.field5791 = 140;
                class30.field397 = 75;
            } else {
                class458.field6215 = class213.field2869.method1176(class110.field1676, (byte) -91) + "0%";
                class30.field397 = 75;
            }
        } else if (class428.field5791 == 140) {
            if (class267.field3552.method686(-80)) {
                class458.field6215 = class107.field1605.method1176(class110.field1676, (byte) -123);
                class428.field5791 = 150;
                class30.field397 = 80;
            } else {
                class458.field6215 = class181.field2491.method1176(class110.field1676, (byte) -127) + class267.field3552.method704((byte) 103) + "%";
                class30.field397 = 80;
            }
        } else if (class428.field5791 == 150) {
            if (class262.field3477.method686(arg0 - 160)) {
                class458.field6215 = class18.field249.method1176(class110.field1676, (byte) -92);
                class30.field397 = 82;
                class428.field5791 = 160;
            } else {
                class458.field6215 = class12.field164.method1176(class110.field1676, (byte) -102) + class262.field3477.method704((byte) 6) + "%";
                class30.field397 = 82;
            }
        } else if (class428.field5791 == 160) {
            if (class172.field2358.method686(arg0 - 188)) {
                class458.field6215 = class151.field2129.method1176(class110.field1676, (byte) -120);
                class30.field397 = 85;
                class428.field5791 = 170;
            } else {
                class458.field6215 = class151.field2129.method1176(class110.field1676, (byte) -96) + class172.field2358.method704((byte) -113) + "%";
                class30.field397 = 85;
            }
        } else if (class428.field5791 == 170) {
            if (class484.field6701.method685("details", (byte) 126)) {
                class55.method387(class484.field6701, class395.field5481, class119.field1742, class1.field23, class464.field6319, class171.field2351, class38.field562);
                class458.field6215 = class159.field2181.method1176(class110.field1676, (byte) -113);
                class428.field5791 = 180;
                class30.field397 = 89;
            } else {
                class458.field6215 = class67.field906.method1176(class110.field1676, (byte) -107) + class484.field6701.method698("details", (byte) 93) + "%";
                class30.field397 = 87;
            }
        } else if (class428.field5791 == 180) {
            int var29 = class405.method2445((byte) 120);
            if (var29 == -1) {
                class458.field6215 = class417.field5662.method1176(class110.field1676, (byte) -124);
                class30.field397 = 90;
            } else if (var29 == 7 || var29 == 9) {
                this.method1512(1, "worldlistfull");
                class119.method746(1000, (byte) -124);
            } else if (class341.field4562) {
                class458.field6215 = class342.field4573.method1176(class110.field1676, (byte) -115);
                class30.field397 = 90;
                class428.field5791 = 190;
            } else {
                this.method1512(1, "worldlistio_" + var29);
                class119.method746(1000, (byte) -35);
            }
        } else if (class428.field5791 == 190) {
            class387.field5359 = new boolean[class100.field1462.field3363];
            class311.field4098 = new String[class51.field679.field265];
            class311.field4102 = new int[class100.field1462.field3363];
            for (int var30 = 0; var30 < class100.field1462.field3363; var30++) {
                if (class100.field1462.method1416(true, var30).field5073 == 0) {
                    class387.field5359[var30] = true;
                    class106.field1597++;
                }
                class311.field4102[var30] = -1;
            }
            class293.method1644(0);
            class104.field1504 = class267.field3552.method688((byte) 87, "loginscreen");
            class87.field1219.method683(true, arg0 ^ 0x65, false);
            class330.field4383.method683(true, 1, true);
            class473.field6525.method683(true, 1, true);
            class172.field2358.method683(true, 1, true);
            class311.field4106.method683(true, 1, true);
            class267.field3552.method683(true, 1, true);
            class103.field1499 = true;
            class19.field262.field1651 = 2;
            class34.field519.field1651 = 2;
            class104.field1514.field1651 = 2;
            class168.field2323.field1651 = 2;
            class209.field2834.field1651 = 2;
            class196.field2673.field1651 = 2;
            class365.field5028.field1651 = 2;
            class96.method597(-1, class488.field6789.field6695, (byte) 118, false, -1);
            class458.field6215 = class341.field4569.method1176(class110.field1676, (byte) -116);
            class428.field5791 = 200;
            class30.field397 = 95;
        } else if (class428.field5791 == 200) {
            class88.method566(true, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 3616)
    private final void method1055(byte arg0) {
        field2447++;
        if (arg0 != -87) {
            method1040((class464[]) null, 122, 38, 43, 114, -79, -54, -112, 5, 43);
        }
        boolean var2 = class477.field6599.method1371(false);
        if (!var2) {
            this.method1044(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 3637)
    public final void method1056(int arg0) {
        field2457++;
        if (class485.field6703) {
            class342.method1940(false);
        }
        if (class98.field1432 != null) {
            class98.field1432.method2217(16384);
        }
        if (class94.field1398 != null) {
            class233.method1305(class94.field1398, 15, class251.field3359);
            class94.field1398 = null;
        }
        if (class280.field3743 != null) {
            class280.field3743.method2310(-128);
            class280.field3743 = null;
        }
        if (class210.field2840 != null) {
            class210.field2840.method731(-547, class28.field378);
        }
        class210.field2840 = null;
        if (class259.field3433 != null) {
            class259.field3433.method852(-48);
        }
        if (class98.field1434 != null) {
            class98.field1434.method852(64);
        }
        class477.field6599.method1376(4);
        class402.field5526.method23(false);
        int var2 = 4 % ((arg0 + 42) / 56);
        if (class348.field4795 != null) {
            class348.field4795.method2183(-1);
            class348.field4795 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lnk;)Lnk;", line = 3692)
    public static final class464 method1057(class464 arg0) {
        int var1 = method1046(arg0).method1254((byte) -60);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class150.method888((byte) -115, arg0.field6362);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}
