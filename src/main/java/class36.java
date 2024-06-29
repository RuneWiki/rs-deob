import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class36 extends class47 {

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "[I")
    public int[] field923 = new int[] { -1 };

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "[I")
    public int[] field917 = new int[1];

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Loc;")
    private static class99 field910 = class48.method402((byte) -104, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field916 = -1;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "Loc;")
    private static class99 field918 = class48.method402((byte) -104, ":tradereq:");

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "Loc;")
    private static class99 field915 = class48.method402((byte) -104, ":chalreq:");

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field909 = 0;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Loc;")
    public static class99 field911 = class48.method402((byte) -104, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Loc;")
    public static class99 field912 = class48.method402((byte) -104, "Schlie-8en");

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field922 = 0;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Loc;")
    public static class99 field927 = field910;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "[Loc;")
    public static class99[] field914 = new class99[100];

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Loc;")
    public static class99 field928 = class48.method402((byte) -104, "");

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Loe;")
    public static class102 field926;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Laf;")
    public static class7 field920;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "[I")
    public static int[] field924;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static void method313(boolean arg0) {
        field912 = null;
        field926 = null;
        field918 = null;
        field911 = null;
        field914 = null;
        field928 = null;
        field927 = null;
        field915 = null;
        field924 = null;
        field920 = null;
        field910 = null;
        if (!arg0) {
            field915 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Z")
    public static final boolean method314(int arg0) {
        field921++;
        if (class104.field2536 == null) {
            return false;
        }
        try {
            int var1 = class104.field2536.method1216(-12320);
            if (var1 == 0) {
                return false;
            }
            if (class148.field3670 == -1) {
                var1--;
                class104.field2536.method1218(0, class39.field965.field1469, arg0 ^ 0x2F32, 1);
                class39.field965.field1477 = 0;
                class148.field3670 = class39.field965.method873(arg0 + 392);
                class77.field1903 = class48.field1163[class148.field3670];
            }
            if (class77.field1903 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class104.field2536.method1218(0, class39.field965.field1469, arg0 ^ 0x2F32, 1);
                class77.field1903 = class39.field965.field1469[0] & 0xFF;
                var1--;
            }
            if (class77.field1903 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class104.field2536.method1218(0, class39.field965.field1469, arg0 - 12082, 2);
                var1 -= 2;
                class39.field965.field1477 = 0;
                class77.field1903 = class39.field965.method506(arg0 + 136);
            }
            if (var1 < class77.field1903) {
                return false;
            }
            class39.field965.field1477 = 0;
            class104.field2536.method1218(0, class39.field965.field1469, -12219, class77.field1903);
            class48.field1177 = 0;
            class39.field960 = class55.field1431;
            class55.field1431 = class149.field3696;
            class149.field3696 = class148.field3670;
            if (class148.field3670 == 230) {
                long var2 = class39.field965.method466(-2066);
                class99 var4 = class60.method534(true, class39.field965).method820(false);
                class48.method400(6, var4, -87, class74.method671(-118, var2).method849(arg0 ^ 0xE6));
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 91) {
                int var5 = class39.field965.method501(-81);
                if (var5 >= 0) {
                    class69.method601(var5, (byte) 125);
                }
                if (class42.field1015 != var5) {
                    class83.method719(class42.field1015, arg0 ^ 0xFFFFFF3A);
                    class42.field1015 = var5;
                }
                class34.method299((byte) 105, class42.field1015);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 87) {
                class99 var6 = class39.field965.method518(arg0 ^ 0xFFFFFE72);
                if (var6.method838(field918, true)) {
                    class99 var7 = var6.method840(0, 44, var6.method830(class97.field2340, 63));
                    long var8 = var7.method834(-97);
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field922; var11++) {
                        if (class9.field229[var11] == var8) {
                            var10 = true;
                            break;
                        }
                    }
                    if (!var10 && class121.field2954 == 0) {
                        class48.method400(4, class79.field1949, -60, var7);
                    }
                } else if (var6.method838(class149.field3694, true)) {
                    class99 var12 = var6.method840(0, -109, var6.method830(class97.field2340, arg0 ^ -184));
                    long var13 = var12.method834(-97);
                    boolean var15 = false;
                    for (int var16 = 0; var16 < field922; var16++) {
                        if (class9.field229[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                    if (!var15 && class121.field2954 == 0) {
                        class48.method400(8, class104.field2523, -99, var12);
                    }
                } else if (var6.method838(field915, true)) {
                    class99 var17 = var6.method840(0, -119, var6.method830(class97.field2340, arg0 ^ -184));
                    long var18 = var17.method834(-97);
                    boolean var20 = false;
                    for (int var21 = 0; var21 < field922; var21++) {
                        if (class9.field229[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                    if (!var20 && class121.field2954 == 0) {
                        class99 var22 = var6.method840(var6.method830(class97.field2340, arg0 + 200) + 1, arg0 ^ 0xFFFFFF16, var6.method810(arg0 ^ 0xB1) - 9);
                        class48.method400(8, var22, 117, var17);
                    }
                } else {
                    class48.method400(0, var6, -36, class137.field3407);
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 249) {
                class46.method393(class39.field965, false, class77.field1903, class43.field1058);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 59) {
                class33.field791 = class39.field965.method475(2);
                class93.field2267 = class39.field965.method489(arg0 ^ 0xFFFFFF77);
                for (int var23 = class33.field791; var23 < class33.field791 + 8; var23++) {
                    for (int var24 = class93.field2267; var24 < class93.field2267 + 8; var24++) {
                        if (class18.field476[class84.field2116][var23][var24] != null) {
                            class18.field476[class84.field2116][var23][var24] = null;
                            class89.method753(var23, (byte) 97, var24);
                        }
                    }
                }
                for (class148 var25 = (class148) class105.field2546.method722(122); var25 != null; var25 = (class148) class105.field2546.method716(true)) {
                    if (var25.field3655 >= class33.field791 && class33.field791 + 8 > var25.field3655 && var25.field3668 >= class93.field2267 && class93.field2267 + 8 > var25.field3668 && class84.field2116 == var25.field3676) {
                        var25.field3662 = 0;
                    }
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 42) {
                class74.field1889 = class39.field965.method510(-119);
                class82.field2043 = class101.field2444;
                class52.field1243 = true;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 194) {
                int var26 = class39.field965.method495(16711680);
                class79.field1948 = class43.field1058.method422((byte) 9, var26);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 199) {
                class77.field1923 = class39.field965.method489(0);
                class148.field3670 = -1;
                if (class77.field1923 == class57.field1473) {
                    if (class77.field1923 == 3) {
                        class57.field1473 = 1;
                    } else {
                        class57.field1473 = 3;
                    }
                    class52.field1243 = true;
                }
                return true;
            }
            if (class148.field3670 == 235) {
                int var27 = class39.field965.method478(false);
                if (var27 == 65535) {
                    var27 = -1;
                }
                int var28 = class39.field965.method489(0);
                if (class134.field3301[var28] == var27) {
                    class61.method539(class134.field3301[var28], true);
                } else {
                    class83.method719(class134.field3301[var28], 126);
                    class134.field3301[var28] = var27;
                }
                class130.field3190 = true;
                class52.field1243 = true;
                class34.method299((byte) 107, class134.field3301[var28]);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 104) {
                int var29 = class39.field965.method504((byte) 116);
                class4.method24(true, var29);
                class148.field3670 = -1;
                class111.field2771 = class101.field2444;
                return true;
            }
            if (class148.field3670 == 187) {
                long var30 = class39.field965.method466(-2066);
                int var32 = class39.field965.method506(-1);
                int var33 = class39.field965.method510(-111);
                class99 var34 = class74.method671(-119, var30).method849(-126);
                for (int var35 = 0; var35 < class9.field230; var35++) {
                    if (class88.field2185[var35] == var30) {
                        if (class59.field1589[var35] != var32) {
                            class59.field1589[var35] = var32;
                            class52.field1243 = true;
                            if (var32 > 0) {
                                class48.method400(5, class20.method189(new class99[] { var34, class150.field3725 }, 49), 94, class137.field3407);
                            }
                            if (var32 == 0) {
                                class48.method400(5, class20.method189(new class99[] { var34, class94.field2280 }, 72), -71, class137.field3407);
                            }
                        }
                        class137.field3431[var35] = var33;
                        var34 = null;
                        break;
                    }
                }
                if (var34 != null && class9.field230 < 200) {
                    class88.field2185[class9.field230] = var30;
                    class17.field463[class9.field230] = var34;
                    class59.field1589[class9.field230] = var32;
                    class137.field3431[class9.field230] = var33;
                    class9.field230++;
                    class52.field1243 = true;
                    class82.field2043 = class101.field2444;
                }
                boolean var36 = false;
                while (!var36) {
                    var36 = true;
                    for (int var37 = 0; var37 < class9.field230 - 1; var37++) {
                        if (class59.field1589[var37] != class137.field3418 && class59.field1589[var37 + 1] == class137.field3418 || class59.field1589[var37] == 0 && class59.field1589[var37 + 1] != 0) {
                            var36 = false;
                            int var38 = class59.field1589[var37];
                            class59.field1589[var37] = class59.field1589[var37 + 1];
                            class59.field1589[var37 + 1] = var38;
                            class99 var39 = class17.field463[var37];
                            class17.field463[var37] = class17.field463[var37 + 1];
                            class17.field463[var37 + 1] = var39;
                            long var40 = class88.field2185[var37];
                            class88.field2185[var37] = class88.field2185[var37 + 1];
                            class88.field2185[var37 + 1] = var40;
                            int var42 = class137.field3431[var37];
                            class137.field3431[var37] = class137.field3431[var37 + 1];
                            class137.field3431[var37 + 1] = var42;
                            class52.field1243 = true;
                        }
                    }
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 112) {
                if (class27.field679 != -1) {
                    class83.method719(class27.field679, 113);
                    class130.field3190 = true;
                    class52.field1243 = true;
                    class27.field679 = -1;
                }
                if (class87.field2162 != -1) {
                    class83.method719(class87.field2162, 101);
                    class113.field2832 = true;
                    class87.field2162 = -1;
                }
                if (class119.field2923 != -1) {
                    class83.method719(class119.field2923, 64);
                    class119.field2923 = -1;
                    class73.method663(30, (byte) 52);
                }
                if (field916 != -1) {
                    class83.method719(field916, 77);
                    field916 = -1;
                }
                if (class23.field555 != -1) {
                    class83.method719(class23.field555, 124);
                    class23.field555 = -1;
                }
                if (class3.field56 != 0) {
                    class3.field56 = 0;
                    class113.field2832 = true;
                }
                class148.field3670 = -1;
                class31.field731 = -1;
                return true;
            }
            if (class148.field3670 == 67) {
                int var43 = class39.field965.method506(-1);
                if (var43 == 65535) {
                    var43 = -1;
                }
                class55.method460((byte) -81, var43);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 209) {
                int var44 = class39.field965.method511(-16064);
                int var45 = class39.field965.method506(arg0 + 136);
                if (var45 == 65535) {
                    var45 = -1;
                }
                class4.method22(var44, 17774, var45);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 81) {
                int var46 = class39.field965.method478(false);
                class69.method601(var46, (byte) 127);
                if (class27.field679 != -1) {
                    class83.method719(class27.field679, 56);
                    class130.field3190 = true;
                    class52.field1243 = true;
                    class27.field679 = -1;
                }
                if (class87.field2162 != -1) {
                    class83.method719(class87.field2162, arg0 + 208);
                    class113.field2832 = true;
                    class87.field2162 = -1;
                }
                if (class119.field2923 != -1) {
                    class83.method719(class119.field2923, 91);
                    class119.field2923 = -1;
                    class73.method663(30, (byte) 52);
                }
                if (field916 != -1) {
                    class83.method719(field916, 110);
                    field916 = -1;
                }
                if (class23.field555 == var46) {
                    class61.method539(class23.field555, true);
                } else {
                    class83.method719(class23.field555, arg0 ^ 0xFFFFFF4A);
                    class23.field555 = var46;
                }
                if (class3.field56 != 0) {
                    class3.field56 = 0;
                    class113.field2832 = true;
                }
                class31.field731 = -1;
                class34.method299((byte) 118, class23.field555);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 228) {
                class52.field1243 = true;
                int var47 = class39.field965.method495(16711680);
                int var48 = class39.field965.method506(arg0 ^ 0x88);
                if (var47 < -70000) {
                    var48 += 32768;
                }
                class54 var49;
                if (var47 < 0) {
                    var49 = null;
                } else {
                    var49 = class63.method552(var47, (byte) 125);
                }
                while (class39.field965.field1477 < class77.field1903) {
                    int var50 = class39.field965.method470((byte) -97);
                    int var51 = class39.field965.method506(arg0 ^ 0x88);
                    int var52 = 0;
                    if (var51 != 0) {
                        var52 = class39.field965.method510(-117);
                        if (var52 == 255) {
                            var52 = class39.field965.method495(16711680);
                        }
                    }
                    if (var49 != null && var50 >= 0 && var49.field1368.length > var50) {
                        var49.field1368[var50] = var51;
                        var49.field1304[var50] = var52;
                    }
                    class70.method614(var48, (byte) 126, var50, var51 - 1, var52);
                }
                class111.field2771 = class101.field2444;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 18) {
                class74.method672((byte) -34);
                class148.field3670 = -1;
                return false;
            }
            if (class148.field3670 == 70) {
                int var53 = class39.field965.method505(252);
                int var54 = class39.field965.method478(false);
                class111.field2777[var54] = var53;
                if (class94.field2283[var54] != var53) {
                    class94.field2283[var54] = var53;
                    class81.method700(var54, 2);
                    class52.field1243 = true;
                    if (class127.field3110 != -1) {
                        class113.field2832 = true;
                    }
                }
                class82.field2043 = class101.field2444;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 74) {
                int var55 = class39.field965.method489(arg0 + 137);
                int var56 = class39.field965.method479(122);
                int var57 = class39.field965.method475(2);
                class84.field2116 = var55 >> 1;
                class69.field1770.method1038((var55 & 0x1) == 1, var56, 25363, var57);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 19) {
                for (int var58 = 0; var58 < class59.field1571.length; var58++) {
                    if (class59.field1571[var58] != null) {
                        class59.field1571[var58].field3132 = -1;
                    }
                }
                for (int var59 = 0; var59 < class149.field3691.length; var59++) {
                    if (class149.field3691[var59] != null) {
                        class149.field3691[var59].field3132 = -1;
                    }
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 146) {
                int var60 = class39.field965.method513(arg0 ^ 0x80000088);
                class54 var61 = class63.method552(var60, (byte) 125);
                var61.field1395 = 3;
                var61.field1290 = class69.field1770.field3020.method1076(-123);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 72) {
                if (class57.field1473 == 12) {
                    class52.field1243 = true;
                }
                class101.field2463 = class39.field965.method501(112);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 38) {
                int var62 = class39.field965.method506(-1);
                int var63 = class39.field965.method504((byte) 34);
                int var64 = class39.field965.method495(arg0 ^ 0xFF00FF77);
                int var65 = class39.field965.method478(false);
                class54 var66 = class63.method552(var64, (byte) 126);
                var66.field1288 = var63;
                var66.field1398 = var65;
                var66.field1396 = var62;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 35) {
                int var67 = class39.field965.method505(252);
                int var68 = class39.field965.method513(Integer.MAX_VALUE);
                int var69 = class39.field965.method504((byte) 47);
                if (var69 == 65535) {
                    var69 = -1;
                }
                long var70 = ((long) var67 << 32) + (long) var69;
                class47 var72 = class109.field2668.method1001(var70, (byte) -51);
                if (var72 != null) {
                    var72.method394((byte) -112);
                }
                class109.field2668.method1006(var70, new class73(var68), -113);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 156) {
                class52.field1243 = true;
                int var73 = class39.field965.method495(16711680);
                int var74 = class39.field965.method506(arg0 ^ 0x88);
                class54 var75;
                if (var73 < 0) {
                    var75 = null;
                } else {
                    var75 = class63.method552(var73, (byte) 127);
                }
                if (var73 < -70000) {
                    var74 += 32768;
                }
                if (var75 != null) {
                    for (int var76 = 0; var76 < var75.field1368.length; var76++) {
                        var75.field1368[var76] = 0;
                        var75.field1304[var76] = 0;
                    }
                }
                class72.method661(var74, arg0 + 25677);
                int var77 = class39.field965.method506(-1);
                for (int var78 = 0; var78 < var77; var78++) {
                    int var79 = class39.field965.method475(2);
                    if (var79 == 255) {
                        var79 = class39.field965.method482(-1);
                    }
                    int var80 = class39.field965.method504((byte) 53);
                    if (var75 != null && var75.field1368.length > var78) {
                        var75.field1368[var78] = var80;
                        var75.field1304[var78] = var79;
                    }
                    class70.method614(var74, (byte) 41, var78, var80 - 1, var79);
                }
                class148.field3670 = -1;
                class111.field2771 = class101.field2444;
                return true;
            }
            if (class148.field3670 == 227) {
                class121.field2963 = class39.field965.method510(-121);
                if (class121.field2963 == 1) {
                    class107.field2627 = class39.field965.method506(-1);
                }
                if (class121.field2963 >= 2 && class121.field2963 <= 6) {
                    if (class121.field2963 == 2) {
                        class107.field2625 = 64;
                        class114.field2852 = 64;
                    }
                    if (class121.field2963 == 3) {
                        class114.field2852 = 64;
                        class107.field2625 = 0;
                    }
                    if (class121.field2963 == 4) {
                        class107.field2625 = 128;
                        class114.field2852 = 64;
                    }
                    if (class121.field2963 == 5) {
                        class107.field2625 = 64;
                        class114.field2852 = 0;
                    }
                    if (class121.field2963 == 6) {
                        class114.field2852 = 128;
                        class107.field2625 = 64;
                    }
                    class121.field2963 = 2;
                    class126.field3046 = class39.field965.method506(-1);
                    class89.field2205 = class39.field965.method506(-1);
                    class113.field2830 = class39.field965.method510(-116);
                }
                if (class121.field2963 == 10) {
                    class130.field3188 = class39.field965.method506(-1);
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 163) {
                if (class87.field2162 != -1) {
                    class83.method719(class87.field2162, 104);
                    class87.field2162 = -1;
                }
                class148.field3670 = -1;
                class3.field56 = 2;
                class113.field2832 = true;
                class30.field712 = false;
                class137.field3425 = class137.field3407;
                return true;
            }
            if (class148.field3670 == 140) {
                class148.field3670 = -1;
                class69.field1765 = 0;
                return true;
            }
            if (class148.field3670 == 29) {
                int var81 = class39.field965.method510(-111);
                int var82 = class39.field965.method510(-115);
                int var83 = class39.field965.method510(-119);
                int var84 = class39.field965.method510(arg0 ^ 0xE7);
                class81.field2024[var81] = true;
                class48.field1173[var81] = var82;
                class7.field210[var81] = var83;
                class49.field1192[var81] = var84;
                class47.field1148[var81] = 0;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 10) {
                class112.field2804 = class39.field965.method510(-115);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 201) {
                class33.field791 = class39.field965.method479(118);
                class93.field2267 = class39.field965.method489(0);
                while (class39.field965.field1477 < class77.field1903) {
                    class148.field3670 = class39.field965.method510(-124);
                    class49.method409(104);
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 124) {
                class99 var85 = class39.field965.method518(arg0 + 398);
                int var86 = class39.field965.method513(Integer.MAX_VALUE);
                class54 var87 = class63.method552(var86, (byte) 127);
                var87.field1372 = var85;
                if (var86 >> 16 == class134.field3301[class57.field1473]) {
                    class52.field1243 = true;
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 30) {
                class122.field2982 = true;
                class7.field197 = class39.field965.method510(arg0 + 24);
                class35.field884 = class39.field965.method510(-123);
                class113.field2815 = class39.field965.method506(arg0 ^ 0x88);
                class105.field2543 = class39.field965.method510(arg0 ^ 0xF0);
                class15.field364 = class39.field965.method510(arg0 ^ 0xF1);
                if (class15.field364 >= 100) {
                    class94.field2290 = class35.field884 * 128 + 64;
                    class145.field3611 = class7.field197 * 128 + 64;
                    class12.field266 = class137.method1144(true, class145.field3611, class94.field2290, class84.field2116) - class113.field2815;
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 75) {
                for (int var88 = 0; var88 < class94.field2283.length; var88++) {
                    if (class94.field2283[var88] != class111.field2777[var88]) {
                        class94.field2283[var88] = class111.field2777[var88];
                        class81.method700(var88, 2);
                        class52.field1243 = true;
                    }
                }
                class148.field3670 = -1;
                class82.field2043 = class101.field2444;
                return true;
            }
            if (class148.field3670 == 173) {
                class137.field3427 = class39.field965.method518(261);
                if (class87.field2162 != -1) {
                    class83.method719(class87.field2162, 78);
                    class87.field2162 = -1;
                }
                class148.field3670 = -1;
                class3.field56 = 4;
                class113.field2832 = true;
                class30.field712 = false;
                class137.field3425 = class137.field3407;
                return true;
            }
            if (class148.field3670 == 58) {
                int var89 = class39.field965.method506(-1);
                int var90 = class39.field965.method513(arg0 - 2147483512);
                class54 var91 = class63.method552(var90, (byte) 127);
                class148.field3670 = -1;
                var91.field1395 = 1;
                var91.field1290 = var89;
                return true;
            }
            if (class148.field3670 == 2) {
                class99 var92 = class39.field965.method518(261);
                int var93 = class39.field965.method475(2);
                int var94 = class39.field965.method510(arg0 + 18);
                if (var93 >= 1 && var93 <= 5) {
                    if (var92.method845(class143.field3556, 63)) {
                        var92 = null;
                    }
                    class121.field2960[var93 - 1] = var92;
                    class125.field3011[var93 - 1] = var94 == 0;
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 14) {
                if (class57.field1473 == 12) {
                    class52.field1243 = true;
                }
                class150.field3714 = class39.field965.method510(arg0 + 13);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 141) {
                byte var95 = class39.field965.method486(-128);
                int var96 = class39.field965.method504((byte) 69);
                class111.field2777[var96] = var95;
                if (class94.field2283[var96] != var95) {
                    class94.field2283[var96] = var95;
                    class81.method700(var96, 2);
                    class52.field1243 = true;
                    if (class127.field3110 != -1) {
                        class113.field2832 = true;
                    }
                }
                class148.field3670 = -1;
                class82.field2043 = class101.field2444;
                return true;
            }
            if (class148.field3670 == 127) {
                int var97 = class39.field965.method478(false);
                int var98 = class39.field965.method482(-1);
                class54 var99 = class63.method552(var98, (byte) 126);
                if (var99 != null && var99.field1341 == 0) {
                    if (var97 > var99.field1300 - var99.field1403) {
                        var97 = var99.field1300 - var99.field1403;
                    }
                    if (var97 < 0) {
                        var97 = 0;
                    }
                    var99.field1378 = var97;
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 251) {
                int var100 = class39.field965.method504((byte) 16);
                int var101 = class39.field965.method482(-1);
                int var102 = var100 >> 5 & 0x1F;
                int var103 = var100 & 0x1F;
                class54 var104 = class63.method552(var101, (byte) 124);
                class148.field3670 = -1;
                int var105 = var100 >> 10 & 0x1F;
                var104.field1317 = (var105 << 19) + (var102 << 11) + (var103 << 3);
                return true;
            }
            if (class148.field3670 == 45) {
                int var106 = class39.field965.method506(-1);
                int var107 = class39.field965.method497(29);
                class69.method601(var107, (byte) 124);
                if (var106 != -1) {
                    class69.method601(var106, (byte) 109);
                }
                if (class23.field555 != -1) {
                    class83.method719(class23.field555, 108);
                    class23.field555 = -1;
                }
                if (class27.field679 != -1) {
                    class83.method719(class27.field679, 77);
                    class27.field679 = -1;
                }
                if (class87.field2162 != -1) {
                    class83.method719(class87.field2162, 88);
                    class87.field2162 = -1;
                }
                if (class119.field2923 == var107) {
                    class61.method539(class119.field2923, true);
                } else {
                    class83.method719(class119.field2923, 82);
                    class119.field2923 = var107;
                    class73.method663(35, (byte) 52);
                }
                if (field916 == var107) {
                    class61.method539(field916, true);
                } else {
                    class83.method719(field916, 81);
                    field916 = var106;
                }
                class3.field56 = 0;
                class31.field731 = -1;
                class34.method299((byte) -57, class119.field2923);
                class34.method299((byte) -21, field916);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 224) {
                int var108 = class39.field965.method505(252);
                class54 var109 = class63.method552(var108, (byte) 125);
                for (int var110 = 0; var110 < var109.field1368.length; var110++) {
                    var109.field1368[var110] = -1;
                    var109.field1368[var110] = 0;
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 96) {
                int var111 = class39.field965.method504((byte) 47);
                class69.method601(var111, (byte) 110);
                if (class87.field2162 != -1) {
                    class83.method719(class87.field2162, 63);
                    class113.field2832 = true;
                    class87.field2162 = -1;
                }
                if (class119.field2923 != -1) {
                    class83.method719(class119.field2923, 70);
                    class119.field2923 = -1;
                    class73.method663(30, (byte) 52);
                }
                if (field916 != -1) {
                    class83.method719(field916, 124);
                    field916 = -1;
                }
                if (class23.field555 != -1) {
                    class83.method719(class23.field555, arg0 + 198);
                    class23.field555 = -1;
                }
                if (class27.field679 == var111) {
                    class61.method539(class27.field679, true);
                } else {
                    class83.method719(class27.field679, 112);
                    class27.field679 = var111;
                }
                class130.field3190 = true;
                if (class3.field56 != 0) {
                    class113.field2832 = true;
                    class3.field56 = 0;
                }
                class31.field731 = -1;
                class52.field1243 = true;
                class34.method299((byte) 108, class27.field679);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 192) {
                class132.method1066(true, 4);
                class148.field3670 = -1;
                return true;
            }
            if (~class148.field3670 == arg0) {
                class132.field3214 = class39.field965.method510(-125);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 171) {
                int var112 = class39.field965.method504((byte) 85);
                int var113 = class39.field965.method497(29);
                if (class87.field2162 != -1) {
                    class83.method719(class87.field2162, 86);
                    class87.field2162 = -1;
                    class113.field2832 = true;
                }
                if (class119.field2923 != -1) {
                    class83.method719(class119.field2923, 105);
                    class119.field2923 = -1;
                    class73.method663(30, (byte) 52);
                }
                if (field916 != -1) {
                    class83.method719(field916, arg0 + 192);
                    field916 = -1;
                }
                if (class23.field555 == var112) {
                    class61.method539(class23.field555, true);
                } else {
                    class83.method719(class23.field555, 125);
                    class23.field555 = var112;
                }
                if (class27.field679 == var113) {
                    class61.method539(class27.field679, true);
                } else {
                    class83.method719(class27.field679, arg0 ^ 0xFFFFFF30);
                    class27.field679 = var113;
                }
                class130.field3190 = true;
                class52.field1243 = true;
                class31.field731 = -1;
                if (class3.field56 != 0) {
                    class113.field2832 = true;
                    class3.field56 = 0;
                }
                class34.method299((byte) -32, class23.field555);
                class34.method299((byte) 127, class27.field679);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 115) {
                int var114 = class39.field965.method504((byte) 94);
                int var115 = class39.field965.method495(16711680);
                class54 var116 = class63.method552(var115, (byte) 127);
                class148.field3670 = -1;
                var116.field1395 = 2;
                var116.field1290 = var114;
                return true;
            }
            if (class148.field3670 == 197) {
                class108.field2657 = class39.field965.method506(arg0 ^ 0x88);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 99) {
                for (int var117 = 0; var117 < class59.field1556; var117++) {
                    class49 var118 = class105.method899(arg0 + 237, var117);
                    if (var118 != null && var118.field1199 == 0) {
                        class111.field2777[var117] = 0;
                        class94.field2283[var117] = 0;
                    }
                }
                class148.field3670 = -1;
                if (class127.field3110 != -1) {
                    class113.field2832 = true;
                }
                class82.field2043 = class101.field2444;
                class52.field1243 = true;
                return true;
            }
            if (class148.field3670 == 240) {
                class107.method917(99);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 223) {
                int var119 = class39.field965.method495(16711680);
                int var120 = class39.field965.method501(87);
                class54 var121 = class63.method552(var119, (byte) 127);
                if (var121.field1321 != var120 || var120 == -1) {
                    var121.field1313 = 0;
                    var121.field1280 = 0;
                    var121.field1321 = var120;
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 215) {
                int var122 = class39.field965.method506(-1);
                int var123 = class39.field965.method510(-118);
                int var124 = class39.field965.method506(-1);
                class138.method1148(var122, var124, (byte) -22, var123);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 94) {
                int var125 = class39.field965.method473(arg0 ^ 0xFFFFFF19);
                if (class127.field3110 != var125) {
                    class83.method719(class127.field3110, arg0 ^ 0xFFFFFF08);
                    class127.field3110 = var125;
                }
                class113.field2832 = true;
                class34.method299((byte) -95, class127.field3110);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 214) {
                class99 var126 = class39.field965.method518(261);
                Object[] var127 = new Object[var126.method810(-58) + 1];
                for (int var128 = var126.method810(arg0 ^ 0xB1) - 1; var128 >= 0; var128--) {
                    if (var126.method825(var128, (byte) 98) == 115) {
                        var127[var128 + 1] = class39.field965.method518(arg0 + 398);
                    } else {
                        var127[var128 + 1] = Integer.valueOf(class39.field965.method495(16711680));
                    }
                }
                var127[0] = Integer.valueOf(class39.field965.method495(16711680));
                class39.method321(null, (byte) -54, 0, null, 0, var127, 0);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 130) {
                int var129 = class39.field965.method482(-1);
                int var130 = class39.field965.method481(arg0 - 16777079);
                int var131 = class39.field965.method473(44);
                class54 var132 = class63.method552(var129, (byte) 124);
                var132.field1356 = var132.field1370 + var131;
                var132.field1324 = var132.field1337 + var130;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 33) {
                class122.field2982 = true;
                class16.field380 = class39.field965.method510(arg0 ^ 0xF6);
                class141.field3498 = class39.field965.method510(-119);
                class72.field1823 = class39.field965.method506(-1);
                class68.field1752 = class39.field965.method510(arg0 ^ 0xFB);
                class30.field721 = class39.field965.method510(-116);
                if (class30.field721 >= 100) {
                    int var133 = class16.field380 * 128 + 64;
                    int var134 = class141.field3498 * 128 + 64;
                    int var135 = class137.method1144(true, var133, var134, class84.field2116) - class72.field1823;
                    int var136 = var135 - class12.field266;
                    int var137 = var133 - class145.field3611;
                    int var138 = var134 - class94.field2290;
                    int var139 = (int) Math.sqrt((double) (var137 * var137 + var138 * var138));
                    class32.field754 = (int) (Math.atan2((double) var136, (double) var139) * 325.949D) & 0x7FF;
                    class94.field2288 = (int) (-325.949D * Math.atan2((double) var137, (double) var138)) & 0x7FF;
                    if (class32.field754 < 128) {
                        class32.field754 = 128;
                    }
                    if (class32.field754 > 383) {
                        class32.field754 = 383;
                    }
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 186 || class148.field3670 == 103 || class148.field3670 == 195 || class148.field3670 == 51 || class148.field3670 == 241 || class148.field3670 == 6 || class148.field3670 == 128 || class148.field3670 == 149 || class148.field3670 == 167 || class148.field3670 == 178 || class148.field3670 == 153) {
                class49.method409(arg0 + 241);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 21) {
                long var140 = class39.field965.method466(-2066);
                byte var142 = class39.field965.method485(104);
                long var143 = class39.field965.method466(arg0 - 1929);
                long var145 = (long) class39.field965.method506(-1);
                long var147 = (long) class39.field965.method483(false);
                long var149 = (var145 << 32) + var147;
                int var151 = class39.field965.method510(-121);
                boolean var152 = false;
                for (int var153 = 0; var153 < 100; var153++) {
                    if (class46.field1118[var153] == var149) {
                        var152 = true;
                        break;
                    }
                }
                if (var151 <= 1) {
                    for (int var154 = 0; var154 < field922; var154++) {
                        if (class9.field229[var154] == var140) {
                            var152 = true;
                            break;
                        }
                    }
                }
                if (!var152 && class121.field2954 == 0) {
                    class46.field1118[class31.field742] = var149;
                    class31.field742 = (class31.field742 + 1) % 100;
                    class99 var155 = class60.method534(true, class39.field965).method820(false);
                    class99 var156 = class20.method189(new class99[] { class95.field2310, class74.method671(-122, var143), class94.field2278, class5.method31(var142, 10), class48.field1174 }, 111);
                    if (var151 == 2 || var151 == 3) {
                        class48.method400(7, var155, arg0 ^ 0xA3, class20.method189(new class99[] { var156, class95.field2311, class74.method671(-123, var140).method849(-121) }, arg0 + 162));
                    } else if (var151 == 1) {
                        class48.method400(7, var155, 96, class20.method189(new class99[] { var156, class33.field801, class74.method671(-119, var140).method849(-106) }, 100));
                    } else {
                        class48.method400(3, var155, arg0 ^ 0xF5, class20.method189(new class99[] { var156, class74.method671(-122, var140).method849(-127) }, 15));
                    }
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 142) {
                class33.field791 = class39.field965.method489(0);
                class93.field2267 = class39.field965.method510(-125);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 183) {
                int var157 = class39.field965.method482(-1);
                int var158 = class39.field965.method482(-1);
                int var159 = class39.field965.method506(arg0 ^ 0x88);
                class54 var160 = class63.method552(var158, (byte) 125);
                if (var159 == 65535) {
                    var159 = -1;
                }
                if (var160.field1374) {
                    var160.field1392 = var159;
                    var160.field1391 = var157;
                    class143 var161 = class1.method2((byte) 116, var159);
                    var160.field1381 = var161.field3565;
                    var160.field1399 = var161.field3526;
                    var160.field1396 = var161.field3532;
                    var160.field1288 = var161.field3528;
                    var160.field1357 = var161.field3564;
                    var160.field1398 = var161.field3576;
                    if (var160.field1383 > 0) {
                        var160.field1396 = var160.field1396 * 32 / var160.field1383;
                    }
                    class99.method843(var160, false);
                } else if (var159 == -1) {
                    class148.field3670 = -1;
                    var160.field1395 = 0;
                    return true;
                } else {
                    class143 var162 = class1.method2((byte) -59, var159);
                    var160.field1398 = var162.field3576;
                    var160.field1290 = var159;
                    var160.field1396 = var162.field3532 * 100 / var157;
                    var160.field1395 = 4;
                    var160.field1288 = var162.field3528;
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 47) {
                long var163 = class39.field965.method466(-2066);
                long var165 = (long) class39.field965.method506(-1);
                long var167 = (long) class39.field965.method483(false);
                long var169 = (var165 << 32) + var167;
                boolean var171 = false;
                int var172 = class39.field965.method510(arg0 ^ 0xF5);
                for (int var173 = 0; var173 < 100; var173++) {
                    if (class46.field1118[var173] == var169) {
                        var171 = true;
                        break;
                    }
                }
                if (var172 <= 1) {
                    for (int var174 = 0; var174 < field922; var174++) {
                        if (class9.field229[var174] == var163) {
                            var171 = true;
                            break;
                        }
                    }
                }
                if (!var171 && class121.field2954 == 0) {
                    class46.field1118[class31.field742] = var169;
                    class31.field742 = (class31.field742 + 1) % 100;
                    class99 var175 = class60.method534(true, class39.field965).method820(false);
                    if (var172 == 2 || var172 == 3) {
                        class48.method400(7, var175, -9, class20.method189(new class99[] { class95.field2311, class74.method671(-124, var163).method849(-127) }, 115));
                    } else if (var172 == 1) {
                        class48.method400(7, var175, -100, class20.method189(new class99[] { class33.field801, class74.method671(-122, var163).method849(arg0 + 13) }, 97));
                    } else {
                        class48.method400(3, var175, arg0 + 27, class74.method671(-115, var163).method849(-127));
                    }
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 31) {
                int var176 = class39.field965.method478(false);
                int var177 = class39.field965.method504((byte) 69);
                int var178 = class39.field965.method513(Integer.MAX_VALUE);
                class54 var179 = class63.method552(var178, (byte) 126);
                var179.field1402 = (var177 << 16) + var176;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 23) {
                class114.method962(31961);
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 27) {
                class122.field2982 = false;
                for (int var180 = 0; var180 < 5; var180++) {
                    class81.field2024[var180] = false;
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 53) {
                class67.field1719 = class39.field965.method478(false) * 30;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 161) {
                class113.field2826 = class39.field965.method510(-113);
                class84.field2096 = class39.field965.method510(-126);
                class55.field1414 = class39.field965.method510(-112);
                class34.field872 = true;
                class113.field2832 = true;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 15) {
                class52.field1243 = true;
                int var181 = class39.field965.method489(0);
                int var182 = class39.field965.method475(arg0 + 139);
                int var183 = class39.field965.method513(Integer.MAX_VALUE);
                class99.field2369[var182] = var183;
                class130.field3196[var182] = var181;
                class73.field1855[var182] = 1;
                for (int var184 = 0; var184 < 98; var184++) {
                    if (class100.field2434[var184] <= var183) {
                        class73.field1855[var182] = var184 + 2;
                    }
                }
                class148.field3670 = -1;
                class52.field1252 = class101.field2444;
                return true;
            }
            if (class148.field3670 == 147) {
                int var185 = class39.field965.method506(-1);
                class69.method601(var185, (byte) 111);
                if (class27.field679 != -1) {
                    class83.method719(class27.field679, 67);
                    class130.field3190 = true;
                    class52.field1243 = true;
                    class27.field679 = -1;
                }
                if (class119.field2923 != -1) {
                    class83.method719(class119.field2923, 72);
                    class119.field2923 = -1;
                    class73.method663(30, (byte) 52);
                }
                if (field916 != -1) {
                    class83.method719(field916, arg0 ^ 0xFFFFFF4F);
                    field916 = -1;
                }
                if (class23.field555 != -1) {
                    class83.method719(class23.field555, 70);
                    class23.field555 = -1;
                }
                if (class87.field2162 == var185) {
                    class61.method539(class87.field2162, true);
                } else {
                    class83.method719(class87.field2162, 94);
                    class87.field2162 = var185;
                }
                class31.field731 = -1;
                class34.method299((byte) -128, class87.field2162);
                class113.field2832 = true;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 254) {
                field922 = class77.field1903 / 8;
                for (int var186 = 0; var186 < field922; var186++) {
                    class9.field229[var186] = class39.field965.method466(-2066);
                }
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 188) {
                boolean var187 = class39.field965.method510(arg0 ^ 0xF8) == 1;
                int var188 = class39.field965.method505(arg0 + 389);
                class54 var189 = class63.method552(var188, (byte) 125);
                var189.field1311 = var187;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 125) {
                class57.field1473 = class39.field965.method475(2);
                class130.field3190 = true;
                class52.field1243 = true;
                class148.field3670 = -1;
                return true;
            }
            if (class148.field3670 == 41) {
                if (class87.field2162 != -1) {
                    class83.method719(class87.field2162, 107);
                    class87.field2162 = -1;
                }
                class113.field2832 = true;
                class3.field56 = 1;
                class148.field3670 = -1;
                class137.field3425 = class137.field3407;
                class30.field712 = false;
                return true;
            }
            if (class148.field3670 == 80) {
                class132.method1066(false, 4);
                class148.field3670 = -1;
                return true;
            }
            class72.method659(null, (byte) 125, "T1 - " + class148.field3670 + "," + class55.field1431 + "," + class39.field960 + " - " + class77.field1903);
            class74.method672((byte) -34);
        } catch (IOException var193) {
            class148.method1200((byte) 127);
        } catch (Exception var194) {
            String var191 = "T2 - " + class148.field3670 + "," + class55.field1431 + "," + class39.field960 + " - " + class77.field1903 + "," + (class69.field1770.field3100[0] + class67.field1712) + "," + (class69.field1770.field3096[0] + class5.field120) + " - ";
            for (int var192 = 0; class77.field1903 > var192 && var192 < 50; var192++) {
                var191 = var191 + class39.field965.field1469[var192] + ",";
            }
            class72.method659(var194, (byte) 118, var191);
            class74.method672((byte) -70);
        }
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
    public static final boolean method315(int arg0, int arg1) {
        if (arg1 != 20454) {
            field909 = -85;
        }
        field919++;
        return (arg0 >> 20 & 0x1) != 0;
    }
}
