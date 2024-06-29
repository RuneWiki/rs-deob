import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field2162 = -1;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Loc;")
    public static class99 field2165 = class48.method402((byte) -104, "cross");

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Loc;")
    public static class99 field2167 = class48.method402((byte) -104, "VOLL");

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Loc;")
    public static class99 field2163 = class48.method402((byte) -104, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Loc;")
    private static class99 field2174 = class48.method402((byte) -104, "scroll:");

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Loc;")
    public static class99 field2176 = class48.method402((byte) -104, "@red@");

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Loc;")
    public static class99 field2177 = class48.method402((byte) -104, "huffman");

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
    public static int[] field2173 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Loc;")
    private static class99 field2166 = class48.method402((byte) -104, "Enter name of player to add to list");

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Loc;")
    private static class99 field2169 = field2174;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Loc;")
    public static class99 field2175 = field2174;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Loc;")
    public static class99 field2178 = field2166;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Loe;")
    public static class102 field2170;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Z")
    public static boolean field2168;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -48 % ((arg0 - 32) / 41);
        field2171++;
        if (arg5 < 1 || arg2 < 1 || arg5 > 102 || arg2 > 102) {
            return;
        }
        if (class27.field684 && class84.field2116 != arg3) {
            return;
        }
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = false;
        boolean var12 = false;
        if (arg4 == 0) {
            var10 = class68.field1757.method85(arg3, arg5, arg2);
        }
        if (arg4 == 1) {
            var10 = class68.field1757.method71(arg3, arg5, arg2);
        }
        if (arg4 == 2) {
            var10 = class68.field1757.method39(arg3, arg5, arg2);
        }
        if (arg4 == 3) {
            var10 = class68.field1757.method76(arg3, arg5, arg2);
        }
        if (var10 != 0) {
            int var13 = var10 >> 14 & 0x7FFF;
            int var14 = class68.field1757.method50(arg3, arg5, arg2, var10);
            int var15 = var14 & 0x1F;
            int var16 = var14 >> 6 & 0x3;
            if (arg4 == 0) {
                class68.field1757.method54(arg3, arg5, arg2);
                class16 var17 = class83.method717(6, var13);
                if (var17.field403) {
                    class86.field2143[arg3].method284(var16, var15, arg2, arg5, var17.field441, (byte) 88);
                }
            }
            if (arg4 == 1) {
                class68.field1757.method47(arg3, arg5, arg2);
            }
            if (arg4 == 2) {
                class68.field1757.method72(arg3, arg5, arg2);
                class16 var18 = class83.method717(6, var13);
                if (var18.field425 + arg5 > 103 || var18.field425 + arg2 > 103 || arg5 + var18.field376 > 103 || var18.field376 + arg2 > 103) {
                    return;
                }
                if (var18.field403) {
                    class86.field2143[arg3].method292(var18.field376, var18.field441, var18.field425, arg2, -50, var16, arg5);
                }
            }
            if (arg4 == 3) {
                class68.field1757.method79(arg3, arg5, arg2);
                class16 var19 = class83.method717(6, var13);
                if (var19.field403 && var19.field395 == 1) {
                    class86.field2143[arg3].method286(arg2, false, arg5);
                }
            }
        }
        if (arg7 < 0) {
            return;
        }
        int var20 = arg3;
        if (arg3 < 3 && (class81.field2028[1][arg5][arg2] & 0x2) == 2) {
            var20 = arg3 + 1;
        }
        class99.method816(arg3, arg5, arg2, var20, class86.field2143[arg3], arg7, class68.field1757, arg1, 127, arg6);
        return;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method740(byte arg0) {
        field2169 = null;
        field2177 = null;
        field2163 = null;
        field2167 = null;
        if (arg0 != 71) {
            return;
        }
        field2173 = null;
        field2174 = null;
        field2170 = null;
        field2166 = null;
        field2175 = null;
        field2178 = null;
        field2176 = null;
        field2165 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method741(int arg0) {
        field2164++;
        if (arg0 != 0) {
            field2176 = null;
        }
        while (true) {
            label392: do {
                while (class144.method1184((byte) 61)) {
                    if (class23.field555 != -1 && class55.field1419 == class23.field555) {
                        if (class68.field1756 == 85 && class137.field3434.method810(-58) > 0) {
                            class137.field3434 = class137.field3434.method840(0, arg0 + 61, class137.field3434.method810(-58) + -1);
                        }
                        continue label392;
                    }
                    if (class30.field712) {
                        if (class68.field1756 == 85 && class137.field3412.method810(-58) > 0) {
                            class137.field3412 = class137.field3412.method840(0, -121, class137.field3412.method810(-58) - 1);
                            class113.field2832 = true;
                        }
                        if (class70.method613(false, class11.field261) && class137.field3412.method810(-58) < 80) {
                            class137.field3412 = class137.field3412.method831(arg0 ^ 0x64, class11.field261);
                            class113.field2832 = true;
                        }
                        if (class68.field1756 == 84) {
                            class30.field712 = false;
                            class113.field2832 = true;
                            if (class126.field3052 == 1) {
                                long var10 = class137.field3412.method834(-97);
                                class143.method1172(125, var10);
                            }
                            if (class126.field3052 == 2 && class9.field230 > 0) {
                                long var12 = class137.field3412.method834(-97);
                                class104.method882(105, var12);
                            }
                            if (class126.field3052 == 3 && class137.field3412.method810(arg0 - 58) > 0) {
                                class86.field2149++;
                                class134.field3276.method869((byte) 11, 49);
                                class134.field3276.method514((byte) 73, 0);
                                int var14 = class134.field3276.field1477;
                                class134.field3276.method490(true, class114.field2851);
                                class150.method1213(true, class134.field3276, class137.field3412);
                                class134.field3276.method512(122, class134.field3276.field1477 - var14);
                                if (class84.field2096 == 2) {
                                    class34.field872 = true;
                                    class150.field3728++;
                                    class84.field2096 = 1;
                                    class134.field3276.method869((byte) 11, 220);
                                    class134.field3276.method514((byte) 73, class113.field2826);
                                    class134.field3276.method514((byte) 73, class84.field2096);
                                    class134.field3276.method514((byte) 73, class55.field1414);
                                }
                            }
                            if (class126.field3052 == 4 && class36.field922 < 100) {
                                long var15 = class137.field3412.method834(arg0 - 97);
                                class82.method711(98, var15);
                            }
                            if (class126.field3052 == 5 && class36.field922 > 0) {
                                long var17 = class137.field3412.method834(-97);
                                class66.method590(var17, (byte) -20);
                            }
                        }
                    } else if (class3.field56 == 1) {
                        if (class68.field1756 == 85 && class137.field3425.method810(-58) > 0) {
                            class137.field3425 = class137.field3425.method840(0, -125, class137.field3425.method810(-58) - 1);
                            class113.field2832 = true;
                        }
                        if (class53.method441(class11.field261, (byte) -128) && class137.field3425.method810(-58) < 10) {
                            class137.field3425 = class137.field3425.method831(125, class11.field261);
                            class113.field2832 = true;
                        }
                        if (class68.field1756 == 84) {
                            if (class137.field3425.method810(-58) > 0) {
                                class33.field804++;
                                int var1 = 0;
                                if (class137.field3425.method854((byte) 42)) {
                                    var1 = class137.field3425.method837((byte) 94);
                                }
                                class134.field3276.method869((byte) 11, 130);
                                class134.field3276.method507(arg0 ^ 0x622F, var1);
                            }
                            class3.field56 = 0;
                            class113.field2832 = true;
                        }
                    } else if (class3.field56 == 2) {
                        if (class68.field1756 == 85 && class137.field3425.method810(-58) > 0) {
                            class137.field3425 = class137.field3425.method840(0, -106, class137.field3425.method810(arg0 - 58) - 1);
                            class113.field2832 = true;
                        }
                        if ((class69.method605((byte) -47, class11.field261) || class11.field261 == 32) && class137.field3425.method810(-58) < 12) {
                            class137.field3425 = class137.field3425.method831(122, class11.field261);
                            class113.field2832 = true;
                        }
                        if (class68.field1756 == 84) {
                            if (class137.field3425.method810(-58) > 0) {
                                class134.field3276.method869((byte) 11, 132);
                                class112.field2795++;
                                class134.field3276.method490(true, class137.field3425.method834(-97));
                            }
                            class3.field56 = 0;
                            class113.field2832 = true;
                        }
                    } else if (class3.field56 == 3) {
                        if (class68.field1756 == 85 && class137.field3425.method810(arg0 - 58) > 0) {
                            class137.field3425 = class137.field3425.method840(0, -94, class137.field3425.method810(-58) - 1);
                            class113.field2832 = true;
                        }
                        if (class70.method613(false, class11.field261) && class137.field3425.method810(-58) < 40) {
                            class137.field3425 = class137.field3425.method831(arg0 ^ 0x77, class11.field261);
                            class113.field2832 = true;
                        }
                    } else if (class3.field56 == 4) {
                        if (class68.field1756 == 85 && class137.field3425.method810(arg0 ^ 0xFFFFFFC6) > 0) {
                            class137.field3425 = class137.field3425.method840(0, 81, class137.field3425.method810(arg0 - 58) - 1);
                            class113.field2832 = true;
                        }
                        if ((class70.method613(false, class11.field261) || class11.field261 == 32) && class137.field3425.method810(-58) < 80) {
                            class137.field3425 = class137.field3425.method831(arg0 + 103, class11.field261);
                            class113.field2832 = true;
                        }
                        if (class68.field1756 == 84) {
                            if (class137.field3425.method810(-58) > 0) {
                                class134.field3276.method869((byte) 11, 131);
                                class134.field3276.method514((byte) 73, class137.field3425.method810(-58) + 1);
                                class72.field1832++;
                                class134.field3276.method498(class137.field3425, 32478);
                            }
                            class113.field2832 = true;
                            class3.field56 = 0;
                        }
                    } else if (field2162 == -1 && class119.field2923 == -1) {
                        if (class133.field3248 != 0 || class57.field1483 > 1) {
                            class149.method1208((byte) -125);
                        }
                        if (class68.field1756 == 85 && class137.field3419.method810(arg0 ^ 0xFFFFFFC6) > 0) {
                            class137.field3419 = class137.field3419.method840(0, 45, class137.field3419.method810(-58) - 1);
                            class113.field2832 = true;
                        }
                        if (class70.method613(false, class11.field261) && class137.field3419.method810(arg0 - 58) < 80) {
                            class137.field3419 = class137.field3419.method831(114, class11.field261);
                            class113.field2832 = true;
                        }
                        if (class68.field1756 == 84 && class137.field3419.method810(-58) > 0) {
                            if (class133.field3248 != 0 || class57.field1483 > 1) {
                                class105.field2573[class77.field1907++] = class137.field3419;
                                if (class77.field1907 >= 20) {
                                    class77.field1907 = 0;
                                }
                                class25.field583 = -1;
                            }
                            if (class57.field1483 == 2) {
                                if (class137.field3419.method829(class77.field1913, 4)) {
                                    System.gc();
                                }
                                if (class137.field3419.method829(class58.field1515, arg0 ^ 0x4)) {
                                    class148.method1200((byte) 126);
                                }
                                if (class137.field3419.method829(class112.field2806, 4)) {
                                    class100.field2427 = true;
                                }
                                if (class137.field3419.method829(class111.field2749, 4)) {
                                    class100.field2427 = false;
                                }
                                if (class137.field3419.method829(class114.field2838, 4)) {
                                    for (int var2 = 0; var2 < 4; var2++) {
                                        for (int var3 = 1; var3 < 103; var3++) {
                                            for (int var4 = 1; var4 < 103; var4++) {
                                                class86.field2143[var2].field820[var3][var4] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class137.field3419.method829(class110.field2735, 4) && class133.field3248 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class137.field3419.method829(class133.field3255, 4)) {
                                    class54.field1367 = true;
                                }
                            }
                            if (class137.field3419.method851(0, class95.field2310)) {
                                class134.field3276.method869((byte) 11, 216);
                                class52.field1247++;
                                class134.field3276.method514((byte) 73, class137.field3419.method810(-58) - 1);
                                class134.field3276.method498(class137.field3419.method813(2, (byte) 87), arg0 + 32478);
                            } else {
                                class125.field3000++;
                                class99 var5 = class137.field3419.method823(0);
                                byte var6 = 0;
                                if (var5.method851(0, class5.field116)) {
                                    class137.field3419 = class137.field3419.method813(class5.field116.method810(arg0 - 58), (byte) 119);
                                    var6 = 0;
                                } else if (var5.method851(0, class141.field3485)) {
                                    class137.field3419 = class137.field3419.method813(class141.field3485.method810(arg0 - 58), (byte) 89);
                                    var6 = 1;
                                } else if (var5.method851(0, class15.field359)) {
                                    class137.field3419 = class137.field3419.method813(class15.field359.method810(-58), (byte) 120);
                                    var6 = 2;
                                } else if (var5.method851(arg0, class47.field1147)) {
                                    class137.field3419 = class137.field3419.method813(class47.field1147.method810(-58), (byte) 117);
                                    var6 = 3;
                                } else if (var5.method851(0, class134.field3303)) {
                                    class137.field3419 = class137.field3419.method813(class134.field3303.method810(-58), (byte) -64);
                                    var6 = 4;
                                } else if (var5.method851(0, class67.field1724)) {
                                    var6 = 5;
                                    class137.field3419 = class137.field3419.method813(class67.field1724.method810(arg0 ^ 0xFFFFFFC6), (byte) -121);
                                } else if (var5.method851(0, class43.field1056)) {
                                    class137.field3419 = class137.field3419.method813(class43.field1056.method810(-58), (byte) 123);
                                    var6 = 6;
                                } else if (var5.method851(0, class114.field2856)) {
                                    var6 = 7;
                                    class137.field3419 = class137.field3419.method813(class114.field2856.method810(-58), (byte) 93);
                                } else if (var5.method851(0, class31.field737)) {
                                    class137.field3419 = class137.field3419.method813(class31.field737.method810(-58), (byte) -97);
                                    var6 = 8;
                                } else if (var5.method851(0, class122.field2979)) {
                                    var6 = 9;
                                    class137.field3419 = class137.field3419.method813(class122.field2979.method810(arg0 ^ 0xFFFFFFC6), (byte) 106);
                                } else if (var5.method851(0, class142.field3504)) {
                                    var6 = 10;
                                    class137.field3419 = class137.field3419.method813(class142.field3504.method810(-58), (byte) 103);
                                } else if (var5.method851(0, class95.field2317)) {
                                    var6 = 11;
                                    class137.field3419 = class137.field3419.method813(class95.field2317.method810(-58), (byte) -27);
                                } else if (class77.field1921 != 0) {
                                    if (var5.method851(0, class5.field123)) {
                                        class137.field3419 = class137.field3419.method813(class5.field123.method810(-58), (byte) -102);
                                        var6 = 0;
                                    } else if (var5.method851(0, class141.field3495)) {
                                        var6 = 1;
                                        class137.field3419 = class137.field3419.method813(class141.field3495.method810(-58), (byte) 113);
                                    } else if (var5.method851(0, class15.field372)) {
                                        var6 = 2;
                                        class137.field3419 = class137.field3419.method813(class15.field372.method810(-58), (byte) 115);
                                    } else if (var5.method851(0, class47.field1140)) {
                                        class137.field3419 = class137.field3419.method813(class47.field1140.method810(-58), (byte) -67);
                                        var6 = 3;
                                    } else if (var5.method851(arg0, class134.field3299)) {
                                        class137.field3419 = class137.field3419.method813(class134.field3299.method810(-58), (byte) -108);
                                        var6 = 4;
                                    } else if (var5.method851(arg0, class67.field1728)) {
                                        var6 = 5;
                                        class137.field3419 = class137.field3419.method813(class67.field1728.method810(-58), (byte) -121);
                                    } else if (var5.method851(arg0, class43.field1059)) {
                                        var6 = 6;
                                        class137.field3419 = class137.field3419.method813(class43.field1059.method810(-58), (byte) -52);
                                    } else if (var5.method851(0, class114.field2854)) {
                                        var6 = 7;
                                        class137.field3419 = class137.field3419.method813(class114.field2854.method810(-58), (byte) 114);
                                    } else if (var5.method851(arg0, class31.field739)) {
                                        var6 = 8;
                                        class137.field3419 = class137.field3419.method813(class31.field739.method810(arg0 ^ 0xFFFFFFC6), (byte) 106);
                                    } else if (var5.method851(0, class122.field2984)) {
                                        var6 = 9;
                                        class137.field3419 = class137.field3419.method813(class122.field2984.method810(-58), (byte) 84);
                                    } else if (var5.method851(arg0, class142.field3508)) {
                                        var6 = 10;
                                        class137.field3419 = class137.field3419.method813(class142.field3508.method810(-58), (byte) -71);
                                    } else if (var5.method851(arg0, class95.field2313)) {
                                        class137.field3419 = class137.field3419.method813(class95.field2313.method810(-58), (byte) -36);
                                        var6 = 11;
                                    }
                                }
                                class99 var7 = class137.field3419.method823(0);
                                byte var8 = 0;
                                if (var7.method851(arg0, class67.field1722)) {
                                    var8 = 1;
                                    class137.field3419 = class137.field3419.method813(class67.field1722.method810(-58), (byte) -38);
                                } else if (var7.method851(0, class72.field1827)) {
                                    var8 = 2;
                                    class137.field3419 = class137.field3419.method813(class72.field1827.method810(-58), (byte) -88);
                                } else if (var7.method851(0, class27.field661)) {
                                    class137.field3419 = class137.field3419.method813(class27.field661.method810(arg0 - 58), (byte) 111);
                                    var8 = 3;
                                } else if (var7.method851(0, field2169)) {
                                    var8 = 4;
                                    class137.field3419 = class137.field3419.method813(field2169.method810(-58), (byte) 123);
                                } else if (var7.method851(arg0, class105.field2561)) {
                                    class137.field3419 = class137.field3419.method813(class105.field2561.method810(arg0 ^ 0xFFFFFFC6), (byte) -42);
                                    var8 = 5;
                                } else if (class77.field1921 != 0) {
                                    if (var7.method851(0, class67.field1732)) {
                                        class137.field3419 = class137.field3419.method813(class67.field1732.method810(-58), (byte) -95);
                                        var8 = 1;
                                    } else if (var7.method851(0, class72.field1828)) {
                                        var8 = 2;
                                        class137.field3419 = class137.field3419.method813(class72.field1828.method810(arg0 - 58), (byte) 107);
                                    } else if (var7.method851(0, class27.field664)) {
                                        class137.field3419 = class137.field3419.method813(class27.field664.method810(-58), (byte) -124);
                                        var8 = 3;
                                    } else if (var7.method851(0, field2175)) {
                                        class137.field3419 = class137.field3419.method813(field2175.method810(-58), (byte) 122);
                                        var8 = 4;
                                    } else if (var7.method851(0, class105.field2575)) {
                                        class137.field3419 = class137.field3419.method813(class105.field2575.method810(arg0 - 58), (byte) 94);
                                        var8 = 5;
                                    }
                                }
                                class134.field3276.method869((byte) 11, 206);
                                class134.field3276.method514((byte) 73, 0);
                                int var9 = class134.field3276.field1477;
                                class134.field3276.method514((byte) 73, var6);
                                class134.field3276.method514((byte) 73, var8);
                                class150.method1213(true, class134.field3276, class137.field3419);
                                class134.field3276.method512(83, class134.field3276.field1477 - var9);
                                if (class113.field2826 == 2) {
                                    class34.field872 = true;
                                    class113.field2826 = 3;
                                    class134.field3276.method869((byte) 11, 220);
                                    class134.field3276.method514((byte) 73, class113.field2826);
                                    class134.field3276.method514((byte) 73, class84.field2096);
                                    class134.field3276.method514((byte) 73, class55.field1414);
                                    class150.field3728++;
                                }
                            }
                            class137.field3419 = class137.field3407;
                            class113.field2832 = true;
                        }
                    }
                }
                return;
            } while (!class69.method605((byte) -18, class11.field261) && class11.field261 != 32);
            if (class137.field3434.method810(arg0 ^ 0xFFFFFFC6) < 12) {
                class137.field3434 = class137.field3434.method831(108, class11.field261);
            }
        }
    }
}
