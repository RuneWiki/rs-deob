import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class134 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lf;")
    public static class37 field2399 = new class37(new byte[5000]);

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Luf;")
    public static class176 field2408;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
    public static boolean field2407;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field2409;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lag;)Lag;")
    public static final class188 method1052(class188 arg0) {
        int var1 = method1063(arg0).method1465(116);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class5.method57((byte) -110, arg0.field2870);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1053(int arg0, int arg1) {
        field2391++;
        String var2 = Integer.toString(arg1);
        if (arg0 != -16950) {
            field2399 = null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class148.field2294 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class126.field1984 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lag;IIIIIII)V")
    public static final void method1054(class188[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class188 var9 = arg0[var8];
            if (var9 != null && var9.field2870 == arg1 && (!var9.field2852 || var9.field2937 == 0 || var9.field2985 || method1063(var9).field3429 != 0 || class53.field822 == var9 || var9.field2950 == 1338) && (!var9.field2852 || !method1062(var9))) {
                int var10 = var9.field3003 + arg6;
                int var11 = var9.field2961 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2937 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2922 + var10;
                    int var17 = var9.field2928 + var11;
                    if (var9.field2937 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class292.field4606 == var9) {
                    class166.field2516 = true;
                    class227.field3555 = var10;
                    class126.field1983 = var11;
                }
                if (!var9.field2852 || var12 < var14 && var13 < var15) {
                    if (var9.field2937 == 0) {
                        if (!var9.field2852 && method1062(var9) && class260.field3988 != var9) {
                            continue;
                        }
                        if (var9.field2910 && class188.field3012 >= var12 && class108.field1719 >= var13 && class188.field3012 < var14 && class108.field1719 < var15) {
                            for (class39 var18 = (class39) class131.field2030.method1010(119); var18 != null; var18 = (class39) class131.field2030.method1008((byte) 88)) {
                                if (var18.field646) {
                                    var18.method693(-50);
                                    var18.field657.field2913 = false;
                                }
                            }
                            if (class205.field3192 == 0) {
                                class292.field4606 = null;
                                class53.field822 = null;
                            }
                            class56.field873 = 0;
                        }
                    }
                    if (var9.field2852) {
                        boolean var19;
                        if (class188.field3012 >= var12 && class108.field1719 >= var13 && class188.field3012 < var14 && class108.field1719 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class3.field50 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class71.field1137 == 1 && class78.field1317 >= var12 && class126.field1985 >= var13 && class78.field1317 < var14 && class126.field1985 < var15) {
                            var21 = true;
                        }
                        if (var9.field3002 != null) {
                            for (int var22 = 0; var22 < var9.field3002.length; var22++) {
                                if (class145.field2256[var9.field3002[var22]]) {
                                    if (var9.field2871 == null || class267.field4256 >= var9.field2871[var22]) {
                                        byte var23 = var9.field2840[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class145.field2256[86] && !class145.field2256[82] && !class145.field2256[81]) && ((var23 & 0x2) == 0 || class145.field2256[86]) && ((var23 & 0x1) == 0 || class145.field2256[82]) && ((var23 & 0x4) == 0 || class145.field2256[81])) {
                                            class74.method589(var9.field2977, "", 191, -1, var22 + 1);
                                            int var24 = var9.field2943[var22];
                                            if (var9.field2871 == null) {
                                                var9.field2871 = new int[var9.field3002.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field2871[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field2871[var22] = class267.field4256 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field2871 != null) {
                                    var9.field2871[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class75.method594(0, class78.field1317 - var10, var9, class126.field1985 - var11);
                        }
                        if (class292.field4606 != null && class292.field4606 != var9 && var19 && method1063(var9).method1466((byte) 82)) {
                            class71.field1136 = var9;
                        }
                        if (class53.field822 == var9) {
                            class224.field3521 = true;
                            class8.field179 = var10;
                            class21.field319 = var11;
                        }
                        if (var9.field2985 || var9.field2950 != 0) {
                            if (var19 && class77.field1307 != 0 && var9.field2992 != null) {
                                class39 var25 = new class39();
                                var25.field646 = true;
                                var25.field657 = var9;
                                var25.field652 = class77.field1307;
                                var25.field647 = var9.field2992;
                                class131.field2030.method1013(312991604, var25);
                            }
                            if (class292.field4606 != null || class28.field438 != null || class64.field1025 || var9.field2950 != 1400 && class56.field873 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2950 != 0) {
                                if (var9.field2950 == 1337) {
                                    class79.field1320 = var9;
                                    continue;
                                }
                                if (var9.field2950 == 1338) {
                                    if (var21) {
                                        class109.field1736 = class78.field1317 - var10;
                                        class139.field2143 = class126.field1985 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2950 == 1400) {
                                    class242.field3750 = var9;
                                    if (var21) {
                                        if (class145.field2256[82] && class259.field3968 > 0) {
                                            int var26 = (int) ((double) (class78.field1317 - var10 - var9.field2922 / 2) * 2.0D / (double) class134.field2075);
                                            int var27 = (int) ((double) (class126.field1985 - var11 - var9.field2928 / 2) * 2.0D / (double) class134.field2075);
                                            int var28 = class140.field2155 + var26;
                                            int var29 = class250.field3848 + var27;
                                            int var30 = class76.field1275 + var28;
                                            int var31 = class221.field3453 + class197.field3093 - var29 - 1;
                                            class297 var32 = class3.method50((byte) -41);
                                            int[] var33 = var32.method1990(var31, -1, var30);
                                            if (var33 != null) {
                                                class45.method375(var33[0], true, var33[1], var33[2]);
                                                class19.method171((byte) 12);
                                            }
                                            continue;
                                        }
                                        class56.field873 = 1;
                                        class184.field2781 = class188.field3012;
                                        class210.field3255 = class108.field1719;
                                        continue;
                                    }
                                    if (var20 && class56.field873 > 0) {
                                        if (class56.field873 == 1 && (class188.field3012 != class184.field2781 || class210.field3255 != class108.field1719)) {
                                            class252.field3877 = class140.field2155;
                                            class55.field844 = class250.field3848;
                                            class56.field873 = 2;
                                        }
                                        if (class56.field873 == 2) {
                                            class155.method1043((int) ((double) (class184.field2781 - class188.field3012) * 2.0D / (double) class62.field1003) + class252.field3877, (byte) -105);
                                            class23.method190((int) ((double) (class210.field3255 - class108.field1719) * 2.0D / (double) class62.field1003) + class55.field844, false);
                                        }
                                        continue;
                                    }
                                    class56.field873 = 0;
                                    continue;
                                }
                                if (var9.field2950 == 1401) {
                                    if (var20) {
                                        class131.method924(-1, var9.field2928, class108.field1719 - var11, var9.field2922, class188.field3012 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field2950 == 1402) {
                                    class246.method1663(255, var9);
                                    continue;
                                }
                            }
                            if (!var9.field2967 && var21) {
                                var9.field2967 = true;
                                if (var9.field2884 != null) {
                                    class39 var34 = new class39();
                                    var34.field646 = true;
                                    var34.field657 = var9;
                                    var34.field656 = class78.field1317 - var10;
                                    var34.field652 = class126.field1985 - var11;
                                    var34.field647 = var9.field2884;
                                    class131.field2030.method1013(312991604, var34);
                                }
                            }
                            if (var9.field2967 && var20 && var9.field2935 != null) {
                                class39 var35 = new class39();
                                var35.field646 = true;
                                var35.field657 = var9;
                                var35.field656 = class188.field3012 - var10;
                                var35.field652 = class108.field1719 - var11;
                                var35.field647 = var9.field2935;
                                class131.field2030.method1013(312991604, var35);
                            }
                            if (var9.field2967 && !var20) {
                                var9.field2967 = false;
                                if (var9.field2917 != null) {
                                    class39 var36 = new class39();
                                    var36.field646 = true;
                                    var36.field657 = var9;
                                    var36.field656 = class188.field3012 - var10;
                                    var36.field652 = class108.field1719 - var11;
                                    var36.field647 = var9.field2917;
                                    class292.field4594.method1013(312991604, var36);
                                }
                            }
                            if (var20 && var9.field2951 != null) {
                                class39 var37 = new class39();
                                var37.field646 = true;
                                var37.field657 = var9;
                                var37.field656 = class188.field3012 - var10;
                                var37.field652 = class108.field1719 - var11;
                                var37.field647 = var9.field2951;
                                class131.field2030.method1013(312991604, var37);
                            }
                            if (!var9.field2913 && var19) {
                                var9.field2913 = true;
                                if (var9.field2980 != null) {
                                    class39 var38 = new class39();
                                    var38.field646 = true;
                                    var38.field657 = var9;
                                    var38.field656 = class188.field3012 - var10;
                                    var38.field652 = class108.field1719 - var11;
                                    var38.field647 = var9.field2980;
                                    class131.field2030.method1013(312991604, var38);
                                }
                            }
                            if (var9.field2913 && var19 && var9.field2865 != null) {
                                class39 var39 = new class39();
                                var39.field646 = true;
                                var39.field657 = var9;
                                var39.field656 = class188.field3012 - var10;
                                var39.field652 = class108.field1719 - var11;
                                var39.field647 = var9.field2865;
                                class131.field2030.method1013(312991604, var39);
                            }
                            if (var9.field2913 && !var19) {
                                var9.field2913 = false;
                                if (var9.field2931 != null) {
                                    class39 var40 = new class39();
                                    var40.field646 = true;
                                    var40.field657 = var9;
                                    var40.field656 = class188.field3012 - var10;
                                    var40.field652 = class108.field1719 - var11;
                                    var40.field647 = var9.field2931;
                                    class292.field4594.method1013(312991604, var40);
                                }
                            }
                            if (var9.field2827 != null) {
                                class39 var41 = new class39();
                                var41.field657 = var9;
                                var41.field647 = var9.field2827;
                                class165.field2499.method1013(312991604, var41);
                            }
                            if (var9.field2979 != null && class53.field820 > var9.field2875) {
                                if (var9.field2899 == null || class53.field820 - var9.field2875 > 32) {
                                    class39 var46 = new class39();
                                    var46.field657 = var9;
                                    var46.field647 = var9.field2979;
                                    class131.field2030.method1013(312991604, var46);
                                } else {
                                    label572: for (int var42 = var9.field2875; var42 < class53.field820; var42++) {
                                        int var43 = class258.field3953[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2899.length; var44++) {
                                            if (var9.field2899[var44] == var43) {
                                                class39 var45 = new class39();
                                                var45.field657 = var9;
                                                var45.field647 = var9.field2979;
                                                class131.field2030.method1013(312991604, var45);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field2875 = class53.field820;
                            }
                            if (var9.field2885 != null && class241.field3731 > var9.field2932) {
                                if (var9.field2912 == null || class241.field3731 - var9.field2932 > 32) {
                                    class39 var51 = new class39();
                                    var51.field657 = var9;
                                    var51.field647 = var9.field2885;
                                    class131.field2030.method1013(312991604, var51);
                                } else {
                                    label548: for (int var47 = var9.field2932; var47 < class241.field3731; var47++) {
                                        int var48 = class57.field888[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2912.length; var49++) {
                                            if (var9.field2912[var49] == var48) {
                                                class39 var50 = new class39();
                                                var50.field657 = var9;
                                                var50.field647 = var9.field2885;
                                                class131.field2030.method1013(312991604, var50);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field2932 = class241.field3731;
                            }
                            if (var9.field2962 != null && class90.field1450 > var9.field2948) {
                                if (var9.field2949 == null || class90.field1450 - var9.field2948 > 32) {
                                    class39 var56 = new class39();
                                    var56.field657 = var9;
                                    var56.field647 = var9.field2962;
                                    class131.field2030.method1013(312991604, var56);
                                } else {
                                    label524: for (int var52 = var9.field2948; var52 < class90.field1450; var52++) {
                                        int var53 = class266.field4246[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2949.length; var54++) {
                                            if (var9.field2949[var54] == var53) {
                                                class39 var55 = new class39();
                                                var55.field657 = var9;
                                                var55.field647 = var9.field2962;
                                                class131.field2030.method1013(312991604, var55);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field2948 = class90.field1450;
                            }
                            if (var9.field2987 != null && class13.field221 > var9.field2996) {
                                if (var9.field2971 == null || class13.field221 - var9.field2996 > 32) {
                                    class39 var61 = new class39();
                                    var61.field657 = var9;
                                    var61.field647 = var9.field2987;
                                    class131.field2030.method1013(312991604, var61);
                                } else {
                                    label500: for (int var57 = var9.field2996; var57 < class13.field221; var57++) {
                                        int var58 = class294.field4624[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2971.length; var59++) {
                                            if (var9.field2971[var59] == var58) {
                                                class39 var60 = new class39();
                                                var60.field657 = var9;
                                                var60.field647 = var9.field2987;
                                                class131.field2030.method1013(312991604, var60);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field2996 = class13.field221;
                            }
                            if (var9.field2942 != null && class120.field1855 > var9.field2842) {
                                if (var9.field2973 == null || class120.field1855 - var9.field2842 > 32) {
                                    class39 var66 = new class39();
                                    var66.field657 = var9;
                                    var66.field647 = var9.field2942;
                                    class131.field2030.method1013(312991604, var66);
                                } else {
                                    label476: for (int var62 = var9.field2842; var62 < class120.field1855; var62++) {
                                        int var63 = class181.field2694[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field2973.length; var64++) {
                                            if (var9.field2973[var64] == var63) {
                                                class39 var65 = new class39();
                                                var65.field657 = var9;
                                                var65.field647 = var9.field2942;
                                                class131.field2030.method1013(312991604, var65);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field2842 = class120.field1855;
                            }
                            if (class77.field1303 > var9.field2915 && var9.field2940 != null) {
                                class39 var67 = new class39();
                                var67.field657 = var9;
                                var67.field647 = var9.field2940;
                                class131.field2030.method1013(312991604, var67);
                            }
                            if (class65.field1027 > var9.field2915 && var9.field2890 != null) {
                                class39 var68 = new class39();
                                var68.field657 = var9;
                                var68.field647 = var9.field2890;
                                class131.field2030.method1013(312991604, var68);
                            }
                            if (class55.field846 > var9.field2915 && var9.field2905 != null) {
                                class39 var69 = new class39();
                                var69.field657 = var9;
                                var69.field647 = var9.field2905;
                                class131.field2030.method1013(312991604, var69);
                            }
                            if (class37.field589 > var9.field2915 && var9.field2895 != null) {
                                class39 var70 = new class39();
                                var70.field657 = var9;
                                var70.field647 = var9.field2895;
                                class131.field2030.method1013(312991604, var70);
                            }
                            if (class259.field3967 > var9.field2915 && var9.field2936 != null) {
                                class39 var71 = new class39();
                                var71.field657 = var9;
                                var71.field647 = var9.field2936;
                                class131.field2030.method1013(312991604, var71);
                            }
                            var9.field2915 = class141.field2178;
                            if (var9.field2896 != null) {
                                for (int var72 = 0; var72 < class148.field2289; var72++) {
                                    class39 var73 = new class39();
                                    var73.field657 = var9;
                                    var73.field645 = class53.field819[var72];
                                    var73.field655 = class276.field4352[var72];
                                    var73.field647 = var9.field2896;
                                    class131.field2030.method1013(312991604, var73);
                                }
                            }
                            if (class66.field1048 && var9.field2923 != null) {
                                class39 var74 = new class39();
                                var74.field657 = var9;
                                var74.field647 = var9.field2923;
                                class131.field2030.method1013(312991604, var74);
                            }
                        }
                    }
                    if (!var9.field2852 && class292.field4606 == null && class28.field438 == null && !class64.field1025) {
                        if ((var9.field2874 >= 0 || var9.field2946 != 0) && class188.field3012 >= var12 && class108.field1719 >= var13 && class188.field3012 < var14 && class108.field1719 < var15) {
                            if (var9.field2874 >= 0) {
                                class260.field3988 = arg0[var9.field2874];
                            } else {
                                class260.field3988 = var9;
                            }
                        }
                        if (var9.field2937 == 8 && class188.field3012 >= var12 && class108.field1719 >= var13 && class188.field3012 < var14 && class108.field1719 < var15) {
                            class56.field878 = var9;
                        }
                        if (var9.field2900 > var9.field2928) {
                            class50.method420(class188.field3012, var11, class108.field1719, var9, var9.field2928, 0, var9.field2922 + var10, var9.field2900);
                        }
                    }
                    if (var9.field2937 == 0) {
                        method1054(arg0, var9.field2977, var12, var13, var14, var15, var10 - var9.field3008, var11 - var9.field2887);
                        if (var9.field2968 != null) {
                            method1054(var9.field2968, var9.field2977, var12, var13, var14, var15, var10 - var9.field3008, var11 - var9.field2887);
                        }
                        class120 var75 = (class120) class13.field230.method1414(true, (long) var9.field2977);
                        if (var75 != null) {
                            class140.method968(var13, var10, (byte) -120, var12, var14, var15, var11, var75.field1852);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method944(byte arg0) {
        field2397++;
        method1056((byte) 51);
        class260.method1725((byte) 101);
        class297.method1994(6);
        class288.method1935(-26681);
        class142.method979(49);
        class93.method730(123);
        class273.method1842(95);
        class130.method919(-95);
        class134.method933(-109);
        class212.method1420(0);
        class257.method1708(true);
        class265.method1809(0);
        class25.method206(-61);
        class37.method334((byte) -67);
        class184.method1235(-29513);
        class234.method1557((byte) -79);
        class112.method830(false);
        class251.method1677(99);
        class143.method987((byte) -15);
        class176.method1171(1);
        class276.method1850(92);
        class252.method1687(0);
        class262.method1779((byte) -102);
        class32.method256(true);
        class186.method1247(true);
        class77.method606(-105);
        class188.method1265(-1);
        class28.method228(-993017304);
        if (arg0 > -111) {
            return;
        }
        class149.method1014((byte) -50);
        class3.method44(false);
        class211.method1408(-1);
        class169.method1128((byte) 100);
        class83.method678((byte) 122);
        class207.method1383(103);
        class261.method1756(0);
        class5.method58(-123);
        class10.method112((byte) 4);
        class242.method1642((byte) 89);
        class223.method1493(-20654);
        class264.method1799((byte) 61);
        class23.method192(0);
        class73.method583(0);
        class46.method378((byte) -87);
        class217.method1445(false);
        class120.method858((byte) -23);
        class219.method1464(false);
        class86.method692(15156);
        class157.method1065(256);
        class267.method1818(false);
        class286.method1925(0);
        class85.method689(0);
        class221.method1481(-3);
        class19.method170(true);
        class171.method1134(-30277);
        class78.method620(13830);
        class246.method1665(false);
        class164.method1092((byte) 127);
        class181.method1196(-116);
        class45.method374(false);
        class250.method1675(114);
        class80.method633(106);
        class65.method510((byte) -65);
        class294.method1973(1024);
        class285.method1918(121);
        class189.method1280(true);
        class183.method1229();
        class249.method1669(100);
        class123.method882((byte) -94);
        class281.method1881();
        class253.method1690(54);
        class270.method1825(5404);
        class41.method348(true);
        class72.method563(89);
        class113.method836(-2058002824);
        class179.method1191(false);
        class2.method11();
        class218.method1455((byte) 115);
        class58.method465(81);
        class284.method1914();
        class31.method253(1048575);
        class43.method363(false);
        class56.method451(871429573);
        class52.method428();
        class141.method972(0);
        class116.method844(-7);
        class156.method1046((byte) 105);
        class203.method1364(Integer.MAX_VALUE);
        class201.method1336();
        class191.method1290(-27958);
        class190.method1285(-14642);
        class289.method1951(-116);
        class292.method1965((byte) -115);
        class256.method1698((byte) -42);
        class202.method1358((byte) -74);
        class131.method921(true);
        class216.method1437(false);
        class30.method240(0);
        class235.method1582((byte) -55);
        class197.method1318((byte) -126);
        class102.method782(-115);
        class8.method100(-1);
        class259.method1720((byte) -96);
        class241.method1628(-97);
        class64.method509(0);
        class96.method744();
        class135.method949((byte) 103);
        class239.method1621(-1);
        class147.method1003((byte) 91);
        class35.method275(-121);
        class76.method603((byte) -71);
        class14.method142();
        class75.method596(3);
        class117.method849((byte) -86);
        class1.method8((byte) -110);
        class159.method1076(true);
        class287.method1932(true);
        class255.method1697(0);
        class101.method779();
        class97.method757();
        class163.method1087((byte) -102);
        class258.method1712(true);
        class280.method1877((byte) 86);
        class195.method1308((byte) 107);
        class209.method1396(true);
        class238.method1603(4096);
        class63.method501((byte) -105);
        class17.method160(-117);
        class18.method164(true);
        class39.method342(-124);
        class205.method1376(1);
        class172.method1140(-3);
        class100.method776(5248);
        class228.method1516(true);
        class247.method1666(48);
        class180.method1195(true);
        class175.method1145((byte) -54);
        class243.method1650((byte) 87);
        class199.method1329();
        class121.method864(512);
        class139.method963(20);
        class13.method131(true);
        class150.method1019();
        class87.method695(18967);
        class204.method1368(-101);
        class293.method1970(-2);
        class6.method75(903);
        class295.method1976(-99);
        class127.method902(65535);
        class144.method997(-71);
        class90.method713((byte) -112);
        class226.method1506((byte) -126);
        class60.method484();
        class160.method1078(-1);
        class48.method394(126);
        class173.method1141((byte) 44);
        class47.method386(-3724);
        class133.method930((byte) 93);
        class33.method264(109);
        class222.method1484((byte) -101);
        class146.method1000(0);
        class296.method1988(-10002);
        class124.method890((byte) 126);
        class229.method1519(-24068);
        class244.method1651(104);
        class53.method435(27171);
        class4.method52(0);
        class29.method231(4707);
        class227.method1508((byte) -50);
        class208.method1389(-73);
        class224.method1503((byte) -72);
        class263.method1787(88);
        class9.method103(93);
        class279.method1868();
        class92.method726(-59);
        class42.method355(false);
        class231.method1526((byte) 97);
        class166.method1099(2048);
        class118.method852(0);
        class119.method855((byte) 121);
        class95.method741();
        class194.method1301();
        class145.method999(0);
        class11.method118((byte) -125);
        class57.method458(24762);
        class71.method558(13053);
        class104.method795();
        class54.method441();
        class94.method738(-59);
        class98.method768(-1);
        class74.method584(true);
        class34.method265(1);
        class198.method1326(false);
        class167.method1105(4);
        class136.method955(5);
        class55.method447(true);
        class7.method81(false);
        class155.method1040(-59);
        class22.method188(true);
        class215.method1433(11492);
        class230.method1522(17950);
        class220.method1472(22009);
        class79.method622(true);
        class140.method966(false);
        class99.method771(false);
        class158.method1070(1);
        class206.method1377(-30593);
        class61.method485(1);
        class196.method1312(8424);
        class277.method1859((byte) 94);
        class16.method156(59);
        class81.method637(2048);
        class254.method1691((byte) -33);
        class122.method868(2048);
        class66.method522(true);
        class111.method822(true);
        class68.method532((byte) -111);
        class210.method1405((byte) 122);
        class214.method1430(100);
        class148.method1005(-1);
        class129.method913((byte) -105);
        class69.method537(0);
        class290.method1956(-125);
        class107.method809(4096);
        class237.method1598((byte) 50);
        class88.method708(-4);
        class126.method898(false);
        class187.method1258(120);
        class109.method820(-123);
        class278.method1863(0);
        class177.method1183(-30105);
        class161.method1082(false);
        class105.method804((byte) 70);
        class274.method1843((byte) -119);
        class108.method814(0);
        class154.method1036(-125);
        class283.method1901((byte) 32);
        class51.method422(0);
        class44.method369(true);
        class50.method417((byte) -128);
        class245.method1660(64);
        class15.method149((byte) 93);
        class26.method211(true);
        class151.method1023(true);
        class165.method1097(1003);
        class178.method1188((byte) -108);
        class272.method1834(-123);
        class36.method279(1);
        class137.method958(-51);
        class174.method1144(121);
        class70.method552(-11811);
        class291.method1959(6743);
        class266.method1811(10);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method1055(int arg0) {
        field2393++;
        for (class148.field2289 = 0; class249.method1671(127) && class148.field2289 < 128; class148.field2289++) {
            class53.field819[class148.field2289] = class229.field3584;
            class276.field4352[class148.field2289] = class256.field3932;
        }
        class127.field1996++;
        if (class34.field544 != -1) {
            class140.method968(0, 0, (byte) 17, 0, class35.field573, class277.field4369, 0, class34.field544);
        }
        class141.field2178++;
        if (arg0 <= 47) {
            return;
        }
        class25.method205((byte) -101);
        while (true) {
            class39 var2;
            class188 var3;
            class188 var4;
            do {
                var2 = (class39) class165.field2499.method1011(-36);
                if (var2 == null) {
                    while (true) {
                        class39 var5;
                        class188 var6;
                        class188 var7;
                        do {
                            var5 = (class39) class292.field4594.method1011(37);
                            if (var5 == null) {
                                while (true) {
                                    class39 var8;
                                    class188 var9;
                                    class188 var10;
                                    do {
                                        var8 = (class39) class131.field2030.method1011(103);
                                        if (var8 == null) {
                                            if (class292.field4606 != null) {
                                                class151.method1025(32);
                                            }
                                            if (class10.field196 != null && class10.field196.field3828 == 1) {
                                                if (class10.field196.field3831 != null) {
                                                    class61.method492(class35.field561, class140.field2154, (byte) 43);
                                                }
                                                class10.field196 = null;
                                                class35.field561 = null;
                                                class140.field2154 = false;
                                            }
                                            if (class267.field4256 % 1500 == 0) {
                                                class119.method854(-2736);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field657;
                                        if (var9.field2856 < 0) {
                                            break;
                                        }
                                        var10 = class5.method57((byte) -122, var9.field2870);
                                    } while (var10 == null || var10.field2968 == null || var9.field2856 >= var10.field2968.length || var10.field2968[var9.field2856] != var9);
                                    class243.method1648((byte) 104, var8);
                                }
                            }
                            var6 = var5.field657;
                            if (var6.field2856 < 0) {
                                break;
                            }
                            var7 = class5.method57((byte) -97, var6.field2870);
                        } while (var7 == null || var7.field2968 == null || var7.field2968.length <= var6.field2856 || var7.field2968[var6.field2856] != var6);
                        class243.method1648((byte) 47, var5);
                    }
                }
                var3 = var2.field657;
                if (var3.field2856 < 0) {
                    break;
                }
                var4 = class5.method57((byte) -114, var3.field2870);
            } while (var4 == null || var4.field2968 == null || var4.field2968.length <= var3.field2856 || var4.field2968[var3.field2856] != var3);
            class243.method1648((byte) 97, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method942(byte arg0) {
        field2403++;
        if (class239.field3715 == 1000) {
            return;
        }
        if (arg0 <= 109) {
            field2407 = false;
        }
        long var2 = class53.method438(23913) / 1000000L - class68.field1084;
        class68.field1084 = class53.method438(23913) / 1000000L;
        boolean var4 = class131.method923((byte) 126);
        if (var4 && class28.field421 && class33.field531 != null) {
            class33.field531.method61(2000);
        }
        if ((class239.field3715 == 30 || class239.field3715 == 10) && (class30.field478 || class100.field1593 != 0L && class100.field1593 < class269.method1823(-126))) {
            class271.method1832(class30.field478, (byte) -64, class8.field140, class5.field96, class245.method1659(115));
        }
        if (class6.field114 == null) {
            Container var5;
            if (class6.field114 != null) {
                var5 = class6.field114;
            } else if (class239.field3716 == null) {
                var5 = class22.field329.field934;
            } else {
                var5 = class239.field3716;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class239.field3716 == var5) {
                Insets var8 = class239.field3716.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class237.field3656 != var6 || class205.field3183 != var7) {
                if (class59.field939.startsWith("mac")) {
                    class237.field3656 = var6;
                    class205.field3183 = var7;
                } else {
                    class98.method767(-21);
                }
                class100.field1593 = class269.method1823(-75) + 500L;
            }
        }
        boolean var9 = false;
        if (class126.field1987) {
            var9 = true;
            class126.field1987 = false;
        }
        if (var9) {
            class184.method1244(-102);
        }
        if (class239.field3715 == 0) {
            class288.method1939(24687, class139.field2137, class33.field526, var9, (Color) null);
        } else if (class239.field3715 == 5) {
            class28.method230(false, 2332, class123.field1925);
        } else if (class239.field3715 == 10) {
            class13.method132(111);
        } else if (class239.field3715 == 25 || class239.field3715 == 28) {
            if (class261.field4048 == 1) {
                if (class57.field889 > class161.field2455) {
                    class161.field2455 = class57.field889;
                }
                int var11 = (class161.field2455 - class57.field889) * 50 / class161.field2455;
                class263.method1789((byte) 64, false, class55.field848 + "<br>(" + var11 + "%)");
            } else if (class261.field4048 == 2) {
                if (class129.field2009 < class244.field3788) {
                    class129.field2009 = class244.field3788;
                }
                int var10 = (class129.field2009 - class244.field3788) * 50 / class129.field2009 + 50;
                class263.method1789((byte) 64, false, class55.field848 + "<br>(" + var10 + "%)");
            } else {
                class263.method1789((byte) 64, false, class55.field848);
            }
        } else if (class239.field3715 == 30) {
            class129.method910(var2, 0);
        } else if (class239.field3715 == 40) {
            class263.method1789((byte) 64, false, class267.field4255 + "<br>" + class160.field2451);
        }
        if ((class239.field3715 == 30 || class239.field3715 == 10) && class181.field2699 == 0 && !var9) {
            try {
                Graphics var14 = class189.field3021.getGraphics();
                for (int var15 = 0; var15 < class145.field2254; var15++) {
                    if (class222.field3476[var15]) {
                        class223.field3508.method235(class237.field3675[var15], var14, class228.field3568[var15], class148.field2291[var15], class249.field3841[var15], (byte) -104);
                        class222.field3476[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class189.field3021.repaint();
            }
        } else if (class239.field3715 != 0) {
            try {
                Graphics var12 = class189.field3021.getGraphics();
                class223.field3508.method232(27378, 0, 0, var12);
                for (int var13 = 0; var13 < class145.field2254; var13++) {
                    class222.field3476[var13] = false;
                }
            } catch (Exception var17) {
                class189.field3021.repaint();
            }
        }
        if (class81.field1353) {
            class217.method1448(-23);
        }
        if (class198.field3107 && class239.field3715 == 10 && class34.field544 != -1) {
            class198.field3107 = false;
            class220.method1477(class22.field329, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method940(byte arg0) {
        field2396++;
        if (class239.field3715 == 1000) {
            return;
        }
        class267.field4256++;
        if (class267.field4256 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class222.field3469 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class71.field1133.setSeed((long) class222.field3469);
        }
        this.method1064((byte) 84);
        if (class55.field856 != null) {
            class55.field856.method1679((byte) -104);
        }
        class73.method568(124);
        class130.method916(-113);
        class184.method1241(0);
        class184.method1238(124);
        int var3 = -56 / ((arg0 + 29) / 58);
        if (class145.field2255 != null) {
            int var4 = class145.field2255.method1130(2);
            class77.field1307 = var4;
        }
        if (class239.field3715 == 0) {
            this.method1059(-17819);
            class151.method1022((byte) 119);
        } else if (class239.field3715 == 5) {
            this.method1059(-17819);
            class151.method1022((byte) 68);
        } else if (class239.field3715 == 25 || class239.field3715 == 28) {
            class285.method1920(120);
        }
        if (class239.field3715 == 10) {
            this.method1055(97);
            class42.method362(-3142);
            class45.method376((byte) -94);
            class8.method93((byte) -126);
        } else if (class239.field3715 == 30) {
            class87.method697(-6);
        } else if (class239.field3715 == 40) {
            class8.method93((byte) -119);
            if (class35.field572 != -3) {
                if (class35.field572 == 15) {
                    class229.method1517(false);
                    return;
                }
                if (class35.field572 != 2) {
                    class118.method850((byte) -127);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2395++;
        if (!this.method943(-119)) {
            return;
        }
        class17.field281 = Integer.parseInt(this.getParameter("worldid"));
        class238.field3689 = Integer.parseInt(this.getParameter("modewhere"));
        if (class238.field3689 < 0 || class238.field3689 > 1) {
            class238.field3689 = 0;
        }
        class210.field3258 = Integer.parseInt(this.getParameter("modewhat"));
        if (class210.field3258 < 0 || class210.field3258 > 2) {
            class210.field3258 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class191.field3038 = true;
        } else {
            class191.field3038 = false;
        }
        try {
            class226.field3542 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class226.field3542 = 0;
        }
        class155.method1041(class226.field3542, (byte) 17);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class119.field1850 = true;
        } else {
            class119.field1850 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class76.field1278 = true;
        } else {
            class76.field1278 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class154.field2352 = 1;
        } else {
            class154.field2352 = 0;
        }
        try {
            class274.field4315 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class274.field4315 = 0;
        }
        class174.field2588 = this.getParameter("settings");
        if (class174.field2588 == null) {
            class174.field2588 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class28.field445 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class28.field445 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class157.field2416 = true;
        } else {
            class157.field2416 = false;
        }
        class272.field4303 = this;
        this.method939(542, 503, -93, class210.field3258 + 32, 765);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static void method1056(byte arg0) {
        field2408 = null;
        field2399 = null;
        int var1 = 35 % ((arg0 - 11) / 39);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1057(int arg0, byte arg1) {
        class120.field1854 = null;
        class133.field2056 = 0;
        class9.field190.field3636 = arg0;
        field2394++;
        if (arg1 == -67) {
            class205.field3194 = null;
            class9.field190.field3637++;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method941(int arg0) {
        if (class35.field552 != null) {
            class35.field552.field4230 = false;
        }
        class35.field552 = null;
        field2401++;
        if (class118.field1829 != null) {
            class118.field1829.method1242((byte) 113);
            class118.field1829 = null;
        }
        class167.method1111(class189.field3021, 77);
        class1.method5(true, class189.field3021);
        if (class145.field2255 != null) {
            class145.field2255.method1127(0, class189.field3021);
        }
        class103.method787(false);
        class25.method200(128);
        class145.field2255 = null;
        if (class33.field531 != null) {
            class33.field531.method70(50);
        }
        if (class46.field737 != null) {
            class46.field737.method70(50);
        }
        int var2 = -7 % ((arg0 - 23) / 44);
        class9.field190.method1558(-104);
        class10.field199.method828(-7230);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method1058(byte arg0, byte[] arg1) {
        class37 var3 = new class37(arg1);
        while (true) {
            int var4 = var3.method333((byte) -59);
            if (var4 == 0) {
                field2398++;
                int var5 = -105 / ((arg0 + 35) / 51);
                return;
            }
            if (var4 == 1) {
                var3.method293(108);
                var3.method293(100);
                var3.method293(110);
                var3.method293(110);
                var3.method293(-45);
                var3.method293(7);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method945(boolean arg0) {
        field2402++;
        class98.method767(-90);
        class10.field199 = new class112();
        if (!arg0) {
            field2399 = null;
        }
        class9.field190 = new class234();
        if (class210.field3258 != 0) {
            class136.field2114 = new byte[50][];
        }
        class205.method1372(class22.field329, (byte) 116);
        if (class238.field3689 == 0) {
            class76.field1279 = this.getCodeBase().getHost();
            class174.field2582 = 443;
            class286.field4498 = 43594;
        } else if (class238.field3689 == 1) {
            class76.field1279 = this.getCodeBase().getHost();
            class286.field4498 = class17.field281 + 40000;
            class174.field2582 = class17.field281 + 50000;
        } else if (class238.field3689 == 2) {
            class174.field2582 = class17.field281 + 50000;
            class286.field4498 = class17.field281 + 40000;
            class76.field1279 = "127.0.0.1";
        }
        class217.field3374 = class76.field1279;
        if (class154.field2352 == 1) {
            class237.field3665 = class51.field811;
            class247.field3817 = class29.field450;
            class56.field863 = class81.field1343;
            class181.field2697 = true;
            class55.field852 = class143.field2206;
        } else {
            class55.field852 = class175.field2599;
            class56.field863 = class48.field788;
            class237.field3665 = class51.field807;
            class247.field3817 = class261.field4046;
        }
        class153.field2341 = class286.field4498;
        class6.field104 = class153.field2341;
        if (class59.field927 == 3 && class238.field3689 != 2) {
            class155.field2358 = class17.field281;
        }
        class18.field290 = class113.field1776 = class25.field391 = class80.field1335 = new short[256];
        class51.field810 = class286.field4498;
        class88.field1446 = class174.field2582;
        class58.method463((byte) 68);
        class208.method1393(class189.field3021, (byte) -67);
        class6.method77(class189.field3021, 81);
        class145.field2255 = class180.method1194((byte) -56);
        if (class145.field2255 != null) {
            class145.field2255.method1125(class189.field3021, false);
        }
        class226.field3541 = class59.field927;
        try {
            if (class22.field329.field936 != null) {
                class212.field3285 = new class276(class22.field329.field936, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class266.field4240[var2] = new class276(class22.field329.field930[var2], 6000, 0);
                }
                class255.field3912 = new class276(class22.field329.field925, 6000, 0);
                class39.field659 = new class252(255, class212.field3285, class255.field3912, 500000);
                class243.field3763 = new class276(class22.field329.field926, 24, 0);
                class22.field329.field926 = null;
                class22.field329.field925 = null;
                class22.field329.field930 = null;
                class22.field329.field936 = null;
            }
        } catch (IOException var3) {
            class243.field3763 = null;
            class212.field3285 = null;
            class39.field659 = null;
            class255.field3912 = null;
        }
        class63.field1009 = class297.field4692;
        if (class238.field3689 != 0) {
            class186.field2799 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1059(int arg0) {
        if (!class198.field3107) {
            label241: while (true) {
                do {
                    if (!class249.method1671(127)) {
                        break label241;
                    }
                } while (class256.field3932 != 's' && class256.field3932 != 'S');
                class198.field3107 = true;
            }
        }
        field2405++;
        if (class296.field4668 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class269.method1823(arg0 + 17733);
            if (class74.field1253 == 0L) {
                class74.field1253 = var4;
            }
            if (var3 > 16384 && (var4 - class74.field1253) < 5000L) {
                if ((var4 - class9.field183) > 1000L) {
                    System.gc();
                    class9.field183 = var4;
                }
                class139.field2137 = 5;
                class33.field526 = class216.field3331;
            } else {
                class296.field4668 = 10;
                class33.field526 = class247.field3819;
                class139.field2137 = 5;
            }
        } else if (arg0 == -17819) {
            if (class296.field4668 == 10) {
                for (int var6 = 0; var6 < 4; var6++) {
                    class72.field1142[var6] = new class77(104, 104);
                }
                class139.field2137 = 10;
                class296.field4668 = 30;
                class33.field526 = class124.field1954;
            } else if (class296.field4668 == 30) {
                if (class55.field856 == null) {
                    class55.field856 = new class251(class9.field190, class10.field199);
                }
                if (class55.field856.method1678((byte) 4)) {
                    class221.field3461 = class70.method548(true, false, 0, 0, true);
                    class99.field1584 = class70.method548(true, false, 0, 1, true);
                    class285.field4487 = class70.method548(false, true, 0, 2, true);
                    class190.field3029 = class70.method548(true, false, 0, 3, true);
                    class72.field1152 = class70.method548(true, false, 0, 4, true);
                    field2408 = class70.method548(true, true, 0, 5, true);
                    class158.field2427 = class70.method548(true, true, 0, 6, false);
                    class259.field3983 = class70.method548(true, false, 0, 7, true);
                    class90.field1459 = class70.method548(true, false, 0, 8, true);
                    class214.field3304 = class70.method548(true, false, 0, 9, true);
                    class203.field3163 = class70.method548(true, false, 0, 10, true);
                    class146.field2273 = class70.method548(true, false, 0, 11, true);
                    class111.field1747 = class70.method548(true, false, 0, 12, true);
                    class230.field3591 = class70.method548(true, false, 0, 13, true);
                    class78.field1313 = class70.method548(true, false, 0, 14, false);
                    class289.field4558 = class70.method548(true, false, 0, 15, true);
                    class51.field806 = class70.method548(true, false, 0, 16, true);
                    class237.field3674 = class70.method548(true, false, 0, 17, true);
                    class215.field3313 = class70.method548(true, false, arg0 ^ 0xFFFFBA65, 18, true);
                    class204.field3182 = class70.method548(true, false, 0, 19, true);
                    class251.field3855 = class70.method548(true, false, 0, 20, true);
                    class188.field3007 = class70.method548(true, false, 0, 21, true);
                    class133.field2055 = class70.method548(true, false, 0, 22, true);
                    class211.field3271 = class70.method548(true, true, 0, 23, true);
                    class228.field3566 = class70.method548(true, false, 0, 24, true);
                    class23.field361 = class70.method548(true, false, 0, 25, true);
                    class207.field3209 = class70.method548(true, true, 0, 26, true);
                    class71.field1130 = class70.method548(true, false, 0, 27, true);
                    class260.field4000 = class70.method548(true, true, 0, 28, true);
                    class296.field4668 = 40;
                    class139.field2137 = 15;
                    class33.field526 = class19.field294;
                } else {
                    class139.field2137 = 12;
                    class33.field526 = class87.field1428;
                }
            } else if (class296.field4668 == 40) {
                int var7 = 0;
                for (int var8 = 0; var8 < 29; var8++) {
                    var7 += class295.field4627[var8].method990(-113) * class176.field2614[var8] / 100;
                }
                if (var7 == 100) {
                    class139.field2137 = 20;
                    class33.field526 = class102.field1629;
                    class139.method961((byte) -124, class90.field1459);
                    class41.method351((byte) -122, class90.field1459);
                    class120.method860(0, class90.field1459);
                    class296.field4668 = 41;
                } else {
                    if (var7 != 0) {
                        class33.field526 = class34.field546 + var7 + "%";
                    }
                    class139.field2137 = 20;
                }
            } else if (class296.field4668 == 41) {
                if (class260.field4000.method1176((byte) 118)) {
                    this.method1058((byte) -92, class260.field4000.method1152(-4897, 1));
                    class296.field4668 = 45;
                    class139.field2137 = 25;
                    class33.field526 = class202.field3154;
                } else {
                    class33.field526 = class28.field448 + class260.field4000.method1172(103) + "%";
                    class139.field2137 = 25;
                }
            } else if (class296.field4668 == 45) {
                class153.method1030(class43.field688, 22050, 2, 1729);
                class102.field1631 = new class261();
                class102.field1631.method1770(9, (byte) 107, 128);
                class33.field531 = class47.method385(0, -126, class22.field329, class189.field3021, 22050);
                class33.field531.method55((byte) -109, class102.field1631);
                class216.method1435(84, class289.field4558, class78.field1313, class72.field1152, class102.field1631);
                class46.field737 = class47.method385(1, -125, class22.field329, class189.field3021, 2048);
                class39.field661 = new class91();
                class46.field737.method55((byte) -123, class39.field661);
                class140.field2156 = new class10(22050, class234.field3622);
                class173.field2575 = class158.field2427.method1168(20345, "scape main");
                class33.field526 = class26.field403;
                class296.field4668 = 50;
                class139.field2137 = 30;
            } else if (class296.field4668 == 50) {
                int var9 = class136.method953(class230.field3591, class90.field1459, -15272);
                int var10 = class145.method998(6);
                if (var10 > var9) {
                    class139.field2137 = 35;
                    class33.field526 = class246.field3805 + var9 * 100 / var10 + "%";
                } else {
                    class296.field4668 = 60;
                    class33.field526 = class149.field2307;
                    class139.field2137 = 35;
                }
            } else if (class296.field4668 == 60) {
                int var11 = class32.method254(arg0 + 17939, class90.field1459);
                int var12 = class93.method731((byte) 49);
                if (var12 > var11) {
                    class33.field526 = class280.field4385 + var11 * 100 / var12 + "%";
                    class139.field2137 = 40;
                } else {
                    class296.field4668 = 65;
                    class139.field2137 = 40;
                    class33.field526 = class55.field847;
                }
            } else if (class296.field4668 == 65) {
                class141.method977(class90.field1459, 127, class230.field3591);
                class139.field2137 = 45;
                class33.field526 = class28.field435;
                class77.method609(10, 5);
                class296.field4668 = 70;
            } else if (class296.field4668 == 70) {
                class285.field4487.method1176((byte) 99);
                byte var13 = 0;
                int var14 = var13 + class285.field4487.method1172(arg0 + 17892);
                class51.field806.method1176((byte) 55);
                int var15 = var14 + class51.field806.method1172(5);
                class237.field3674.method1176((byte) 79);
                int var16 = var15 + class237.field3674.method1172(92);
                class215.field3313.method1176((byte) -95);
                int var17 = var16 + class215.field3313.method1172(36);
                class204.field3182.method1176((byte) -51);
                int var18 = var17 + class204.field3182.method1172(23);
                class251.field3855.method1176((byte) -50);
                int var19 = var18 + class251.field3855.method1172(34);
                class188.field3007.method1176((byte) -45);
                int var20 = var19 + class188.field3007.method1172(arg0 + 17898);
                class133.field2055.method1176((byte) 70);
                int var21 = var20 + class133.field2055.method1172(77);
                class228.field3566.method1176((byte) 86);
                int var22 = var21 + class228.field3566.method1172(arg0 + 17838);
                class23.field361.method1176((byte) 78);
                int var23 = var22 + class23.field361.method1172(arg0 + 17904);
                class71.field1130.method1176((byte) 55);
                int var24 = var23 + class71.field1130.method1172(60);
                if (var24 < 1100) {
                    class139.field2137 = 50;
                    class33.field526 = class8.field177 + var24 / 11 + "%";
                } else {
                    class156.method1048(class285.field4487, 31);
                    class275.method1846(false, class285.field4487);
                    class197.method1321(0, class285.field4487);
                    class155.method1042(class285.field4487, class259.field3983, 122);
                    class16.method155(class51.field806, -118, class259.field3983, true);
                    class70.method541(class215.field3313, class259.field3983, -115);
                    class69.method539(class204.field3182, class249.field3835, true, -123, class259.field3983);
                    class43.method365(-31450, class285.field4487);
                    class198.method1327(class99.field1584, class251.field3855, class221.field3461, 0);
                    class79.method626((byte) -85, class285.field4487);
                    class48.method393(class259.field3983, arg0 ^ 0xFFFFBA65, class188.field3007);
                    class32.method262(class133.field2055, -29708);
                    class238.method1605(class285.field4487, (byte) 98);
                    class42.method359(class90.field1459, class190.field3029, class259.field3983, (byte) -110, class230.field3591);
                    class167.method1109(class285.field4487, -384);
                    class64.method503(arg0 + 17713, class237.field3674);
                    class36.method280(class23.field361, false, new class147(), class228.field3566);
                    class291.method1958(class228.field3566, (byte) -40, class23.field361);
                    class153.method1031(class285.field4487, (byte) 5);
                    class146.method1001(class285.field4487, (byte) 38);
                    class81.method636(class285.field4487, 27626);
                    class126.method899(class90.field1459, (byte) -115, class285.field4487);
                    class262.method1777(126, class90.field1459, class285.field4487);
                    class139.field2137 = 50;
                    class33.field526 = class203.field3165;
                    class262.method1785((byte) -109);
                    class296.field4668 = 80;
                }
            } else if (class296.field4668 == 80) {
                int var25 = class130.method920(true, class90.field1459);
                int var26 = class288.method1945((byte) -16);
                if (var26 > var25) {
                    class139.field2137 = 60;
                    class33.field526 = class65.field1037 + var25 * 100 / var26 + "%";
                } else {
                    class188.method1271(21, class90.field1459);
                    class296.field4668 = 90;
                    class33.field526 = class235.field3644;
                    class139.field2137 = 60;
                }
            } else if (class296.field4668 == 90) {
                if (class207.field3209.method1176((byte) -77)) {
                    class287 var27 = new class287(class214.field3304, class207.field3209, class90.field1459, 20, !class196.field3083);
                    class97.method760(var27);
                    if (class250.field3847 == 1) {
                        class97.method755(0.9F);
                    }
                    if (class250.field3847 == 2) {
                        class97.method755(0.8F);
                    }
                    if (class250.field3847 == 3) {
                        class97.method755(0.7F);
                    }
                    if (class250.field3847 == 4) {
                        class97.method755(0.6F);
                    }
                    class296.field4668 = 100;
                    class139.field2137 = 70;
                    class33.field526 = class151.field2340;
                } else {
                    class33.field526 = class28.field411 + class207.field3209.method1172(122) + "%";
                    class139.field2137 = 70;
                }
            } else if (class296.field4668 == 100) {
                if (class13.method135((byte) -113, class90.field1459)) {
                    class296.field4668 = 110;
                }
            } else if (class296.field4668 == 110) {
                class35.field552 = new class265();
                class22.field329.method467(10, class35.field552, true);
                class139.field2137 = 75;
                class296.field4668 = 120;
                class33.field526 = class148.field2292;
            } else if (class296.field4668 == 120) {
                if (class203.field3163.method1162((byte) 123, "huffman", "")) {
                    class163 var28 = new class163(class203.field3163.method1160("", true, "huffman"));
                    class115.method837(var28, -16657);
                    class139.field2137 = 80;
                    class296.field4668 = 130;
                    class33.field526 = class266.field4253;
                } else {
                    class139.field2137 = 80;
                    class33.field526 = class140.field2162 + "0%";
                }
            } else if (class296.field4668 == 130) {
                if (!class190.field3029.method1176((byte) 61)) {
                    class33.field526 = class98.field1572 + class190.field3029.method1172(60) * 3 / 4 + "%";
                    class139.field2137 = 85;
                } else if (!class111.field1747.method1176((byte) -32)) {
                    class33.field526 = class98.field1572 + (class111.field1747.method1172(arg0 ^ 0xFFFFBA5C) / 10 + 75) + "%";
                    class139.field2137 = 85;
                } else if (!class230.field3591.method1176((byte) 106)) {
                    class33.field526 = class98.field1572 + (class230.field3591.method1172(30) / 20 + 85) + "%";
                    class139.field2137 = 85;
                } else if (class211.field3271.method1158(arg0 + 45591, "details")) {
                    class191.method1292(class211.field3271, class191.field3031, (byte) 126);
                    class96.method742(class259.field3983);
                    class33.field526 = class273.field4311;
                    class296.field4668 = 135;
                    class139.field2137 = 95;
                } else {
                    class33.field526 = class98.field1572 + (class211.field3271.method1155("details", arg0 ^ 0xFFFFE804) / 10 + 90) + "%";
                    class139.field2137 = 85;
                }
            } else if (class296.field4668 == 135) {
                int var29 = class220.method1473(-74);
                if (var29 == -1) {
                    class33.field526 = class229.field3583;
                    class139.field2137 = 95;
                } else if (var29 == 7 || var29 == 9) {
                    this.method947(23681, "worldlistfull");
                    class77.method609(arg0 ^ 0xFFFFBA6F, 1000);
                } else if (class244.field3791) {
                    class139.field2137 = 96;
                    class33.field526 = class70.field1124;
                    class296.field4668 = 140;
                } else {
                    this.method947(23681, "worldlistio_" + var29);
                    class77.method609(10, 1000);
                }
            } else if (class296.field4668 == 140) {
                class16.field264 = class190.field3029.method1168(20345, "loginscreen");
                field2408.method1164(true, true, false);
                class158.field2427.method1164(true, true, true);
                class90.field1459.method1164(true, true, true);
                class230.field3591.method1164(true, true, true);
                class203.field3163.method1164(true, true, true);
                class190.field3029.method1164(true, true, true);
                class81.field1353 = true;
                class33.field526 = class175.field2605;
                class296.field4668 = 150;
                class139.field2137 = 97;
            } else if (class296.field4668 == 150) {
                if (class198.field3107) {
                    class39.field662 = 0;
                    class144.field2230 = 0;
                    class30.field474 = 0;
                    class148.field2287 = 0;
                }
                class198.field3107 = true;
                class220.method1477(class22.field329, 0);
                class271.method1832(false, (byte) -69, -1, -1, class148.field2287);
                class296.field4668 = 160;
                class33.field526 = class100.field1615;
                class139.field2137 = 100;
            } else if (class296.field4668 == 160) {
                class3.method47(true, (byte) -44);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2406++;
        try {
            if (arg0.length != 4) {
                class127.method903((byte) -94, "argument count");
            }
            class17.field281 = Integer.parseInt(arg0[0]);
            class238.field3689 = 2;
            if (arg0[1].equals("live")) {
                class210.field3258 = 0;
            } else if (arg0[1].equals("rc")) {
                class210.field3258 = 1;
            } else if (arg0[1].equals("wip")) {
                class210.field3258 = 2;
            } else {
                class127.method903((byte) -108, "modewhat");
            }
            class191.field3038 = false;
            class226.field3542 = class164.method1091(arg0[2], (byte) -109);
            if (class226.field3542 == -1) {
                if (arg0[2].equals("english")) {
                    class226.field3542 = 0;
                } else if (arg0[2].equals("german")) {
                    class226.field3542 = 1;
                } else {
                    class127.method903((byte) -104, "language");
                }
            }
            class155.method1041(class226.field3542, (byte) 17);
            class76.field1278 = false;
            class119.field1850 = false;
            if (arg0[3].equals("game0")) {
                class154.field2352 = 0;
            } else if (arg0[3].equals("game1")) {
                class154.field2352 = 1;
            } else {
                class127.method903((byte) -96, "game");
            }
            class274.field4315 = 0;
            class174.field2588 = "";
            class157.field2416 = false;
            class28.field445 = 0;
            client var1 = new client();
            class272.field4303 = var1;
            var1.method946(-125, false, 29, "runescape", 768, class210.field3258 + 32, 1024, 542);
            class239.field3716.setLocation(40, 40);
        } catch (Exception var3) {
            class223.method1490(var3, (String) null, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1060(int arg0) {
        field2392++;
        if (class9.field190.field3637 > class74.field1256) {
            if (class6.field104 == class51.field810) {
                class6.field104 = class88.field1446;
            } else {
                class6.field104 = class51.field810;
            }
            class239.field3695 = (class9.field190.field3637 - 1) * 250;
            if (class239.field3695 > 3000) {
                class239.field3695 = 3000;
            }
            if (class9.field190.field3637 >= 2 && class9.field190.field3636 == 6) {
                this.method947(arg0 + 46230, "js5connect_outofdate");
                class239.field3715 = 1000;
                return;
            }
            if (class9.field190.field3637 >= 4 && class9.field190.field3636 == -1) {
                this.method947(23681, "js5crc");
                class239.field3715 = 1000;
                return;
            }
            if (class9.field190.field3637 >= 4 && (class239.field3715 == 0 || class239.field3715 == 5)) {
                if (class9.field190.field3636 == 7 || class9.field190.field3636 == 9) {
                    this.method947(23681, "js5connect_full");
                } else if (class9.field190.field3636 > 0) {
                    this.method947(23681, "js5connect");
                } else {
                    this.method947(arg0 + 46230, "js5io");
                }
                class239.field3715 = 1000;
                return;
            }
        }
        class74.field1256 = class9.field190.field3637;
        if (class239.field3695 > 0) {
            class239.field3695--;
            return;
        }
        if (arg0 != -22549) {
            field2407 = false;
        }
        try {
            if (class133.field2056 == 0) {
                class205.field3194 = class22.field329.method480(class6.field104, (byte) -77, class217.field3374);
                class133.field2056++;
            }
            if (class133.field2056 == 1) {
                if (class205.field3194.field3828 == 2) {
                    this.method1057(1000, (byte) -67);
                    return;
                }
                if (class205.field3194.field3828 == 1) {
                    class133.field2056++;
                }
            }
            if (class133.field2056 == 2) {
                class120.field1854 = new class184((Socket) class205.field3194.field3831, class22.field329);
                class37 var2 = new class37(5);
                var2.method287(440742616, 15);
                var2.method289(542, -128);
                class120.field1854.method1243(0, var2.field583, 5, (byte) -119);
                class133.field2056++;
                class285.field4488 = class269.method1823(-103);
            }
            if (class133.field2056 == 3) {
                if (class239.field3715 == 0 || class239.field3715 == 5 || class120.field1854.method1240((byte) 105) > 0) {
                    int var3 = class120.field1854.method1232(22221);
                    if (var3 != 0) {
                        this.method1057(var3, (byte) -67);
                        return;
                    }
                    class133.field2056++;
                } else if (class269.method1823(arg0 ^ 0x585E) - class285.field4488 > 30000L) {
                    this.method1057(1001, (byte) -67);
                    return;
                }
            }
            if (class133.field2056 == 4) {
                boolean var4 = class239.field3715 == 5 || class239.field3715 == 10 || class239.field3715 == 28;
                class9.field190.method1572(!var4, 113, class120.field1854);
                class120.field1854 = null;
                class133.field2056 = 0;
                class205.field3194 = null;
            }
        } catch (IOException var5) {
            this.method1057(1002, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public static final void method1061(boolean arg0) {
        if (arg0) {
            method1061(true);
        }
        field2404++;
        class35.field565.method1782(112);
        class220.field3438.method1782(-90);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lag;)Z")
    public static final boolean method1062(class188 arg0) {
        if (class102.field1626) {
            if (method1063(arg0).field3429 != 0) {
                return false;
            }
            if (arg0.field2937 == 0) {
                return false;
            }
        }
        return arg0.field3009;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lag;)Lpa;")
    public static final class219 method1063(class188 arg0) {
        class219 var1 = (class219) class90.field1454.method1414(true, ((long) arg0.field2977 << 32) + (long) arg0.field2856);
        return var1 == null ? arg0.field2848 : var1;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1064(byte arg0) {
        field2400++;
        boolean var2 = class9.field190.method1566(23180);
        if (arg0 >= 71 && !var2) {
            this.method1060(-22549);
        }
    }
}
