import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class287 {

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[I")
    private int[] field4428;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
    private int[] field4425;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4414 = "Unable to find ";

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4426 = null;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field4422 = -1;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field4421 = 0;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Z")
    public static boolean field4433 = false;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Z")
    public static boolean field4432 = true;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    private int field4416;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    private int field4417;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    private int field4418;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    private int field4431;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[[Ljn;")
    public static class123[][] field4423;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 15)
    private final void method2020(int arg0) {
        if (arg0 < 46) {
            return;
        }
        this.field4417 += ++this.field4431;
        field4429++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4425[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4418 ^= this.field4418 << 13;
                } else {
                    this.field4418 ^= this.field4418 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4418 ^= this.field4418 << 2;
            } else {
                this.field4418 ^= this.field4418 >>> 16;
            }
            this.field4418 += this.field4425[var2 + 128 & 0xFF];
            int var4;
            this.field4425[var2] = var4 = this.field4425[class142.method1078(var3 >> 2, 255)] - (-this.field4418 - this.field4417);
            this.field4428[var2] = this.field4417 = var3 + this.field4425[class142.method1078(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 65)
    public static void method2021(boolean arg0) {
        if (!arg0) {
            field4423 = (class123[][]) ((class123[][]) null);
        }
        field4426 = null;
        field4423 = (class123[][]) null;
        field4414 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILek;III)V", line = 97)
    public static final void method2022(int arg0, class184 arg1, int arg2, int arg3, int arg4) {
        if (class36.field534) {
            class194.method1416(arg2, arg0, arg1.field2890 + arg2, arg1.field2904 + arg0);
        }
        if (class3.field14 >= 3) {
            if (class36.field534) {
                class27 var5 = arg1.method1342(1, false);
                if (var5 != null) {
                    var5.method186(arg2, arg0);
                }
            } else {
                class168.method1223(arg2, arg0, 0, arg1.field2929, arg1.field2836);
            }
        } else if (class36.field534) {
            ((class221) class126.field1999).method1579(arg2, arg0, arg1.field2890, arg1.field2904, class126.field1999.field312 / 2, class126.field1999.field315 / 2, class136.field2125, 256, (class221) arg1.method1342(1, false));
        } else {
            ((class134) class126.field1999).method1014(arg2, arg0, arg1.field2890, arg1.field2904, class126.field1999.field312 / 2, class126.field1999.field315 / 2, class136.field2125, 256, arg1.field2929, arg1.field2836);
        }
        field4419++;
        if (arg4 != 10254) {
            field4423 = (class123[][]) ((class123[][]) null);
        }
        class238.field3621[arg3] = true;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 135)
    public static final void method2023(int arg0) {
        if (class32.field406 > 1) {
            class199.field3153 = class319.field4980;
            class32.field406--;
        }
        if (class218.field3427 > 0) {
            class218.field3427--;
        }
        field4430++;
        if (class314.field4875) {
            class314.field4875 = false;
            class198.method1440((byte) 22);
            return;
        }
        for (int var1 = 0; var1 < 100 && class31.method218((byte) 49); var1++) {
        }
        if (class305.field4771 != 30) {
            return;
        }
        class290.method2053(-21, class159.field2372, 133);
        Object var2 = class109.field1719.field3691;
        synchronized (class109.field1719.field3691) {
            if (!class117.field1829) {
                class109.field1719.field3697 = 0;
            } else if (class292.field4593 != 0 || class109.field1719.field3697 >= 40) {
                int var3 = 0;
                class159.field2372.method59(33, (byte) 73);
                class159.field2372.method262((byte) 81, 0);
                class246.field3708++;
                int var4 = class159.field2372.field455;
                for (int var5 = 0; var5 < class109.field1719.field3697 && class159.field2372.field455 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class109.field1719.field3695[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class109.field1719.field3694[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class109.field1719.field3695[var5] == -1 && class109.field1719.field3694[var5] == -1) {
                        var6 = -1;
                        var8 = -1;
                        var7 = true;
                    }
                    if (class50.field770 != var8 || class158.field2360 != var6) {
                        int var9 = var6 - class158.field2360;
                        int var10 = var8 - class50.field770;
                        class158.field2360 = var6;
                        class50.field770 = var8;
                        if (class80.field1122 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class159.field2372.method263((class80.field1122 << 12) + (var10 << 6) + var9, (byte) 112);
                            class80.field1122 = 0;
                        } else if (class80.field1122 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class159.field2372.method262((byte) 81, class80.field1122 + 128);
                            var9 += 128;
                            var10 += 128;
                            class159.field2372.method263((var10 << 8) + var9, (byte) 113);
                            class80.field1122 = 0;
                        } else if (class80.field1122 < 32) {
                            class159.field2372.method262((byte) 81, class80.field1122 + 192);
                            if (var7) {
                                class159.field2372.method259(-15195, Integer.MIN_VALUE);
                            } else {
                                class159.field2372.method259(-15195, var8 | var6 << 16);
                            }
                            class80.field1122 = 0;
                        } else {
                            class159.field2372.method263(class80.field1122 + 57344, (byte) 122);
                            if (var7) {
                                class159.field2372.method259(-15195, Integer.MIN_VALUE);
                            } else {
                                class159.field2372.method259(-15195, var6 << 16 | var8);
                            }
                            class80.field1122 = 0;
                        }
                    } else if (class80.field1122 < 2047) {
                        class80.field1122++;
                    }
                }
                class159.field2372.method284(class159.field2372.field455 - var4, false);
                if (class109.field1719.field3697 <= var3) {
                    class109.field1719.field3697 = 0;
                } else {
                    class109.field1719.field3697 -= var3;
                    for (int var11 = 0; var11 < class109.field1719.field3697; var11++) {
                        class109.field1719.field3694[var11] = class109.field1719.field3694[var3 + var11];
                        class109.field1719.field3695[var11] = class109.field1719.field3695[var11 + var3];
                    }
                }
            }
        }
        if (class292.field4593 != 0) {
            class328.field5080++;
            long var13 = (class155.field2337 - class88.field1289) / 50L;
            int var15 = class38.field573;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var17 = class97.field1446;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            int var18 = (int) var13;
            class88.field1289 = class155.field2337;
            if (class292.field4593 == 2) {
                var16 = 1;
            }
            class159.field2372.method59(27, (byte) 73);
            class159.field2372.method280(var16 << 15 | var18, (byte) 122);
            class159.field2372.method281(var17 | var15 << 16, 16104);
        }
        if (class75.field1066 > 0) {
            class75.field1066--;
        }
        if (class304.field4766) {
            for (int var19 = 0; var19 < class179.field2681; var19++) {
                int var20 = class320.field4985[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class298.field4674 = true;
                    break;
                }
            }
        } else if (class50.field768[96] || class50.field768[97] || class50.field768[98] || class50.field768[99]) {
            class298.field4674 = true;
        }
        if (class298.field4674 && class75.field1066 <= 0) {
            class298.field4674 = false;
            class171.field2549++;
            class75.field1066 = 20;
            class159.field2372.method59(3, (byte) 73);
            class159.field2372.method263(class80.field1125, (byte) 121);
            class159.field2372.method263(class136.field2125, (byte) 125);
        }
        if (class28.field321 && !class154.field2333) {
            class154.field2333 = true;
            class159.field2372.method59(202, (byte) 73);
            class92.field1332++;
            class159.field2372.method262((byte) 81, 1);
        }
        if (!class28.field321 && class154.field2333) {
            class154.field2333 = false;
            class92.field1332++;
            class159.field2372.method59(202, (byte) 73);
            class159.field2372.method262((byte) 81, 0);
        }
        if (!class253.field3771) {
            class39.field588++;
            class159.field2372.method59(67, (byte) 73);
            class159.field2372.method259(-15195, class51.method471(false));
            class253.field3771 = true;
        }
        class289.method2046(99);
        if (class305.field4771 != 30) {
            return;
        }
        class238.method1661((byte) -128);
        class41.method370((byte) 79);
        class272.method1896(1645664360);
        class109.field1705++;
        if (class109.field1705 > 750) {
            class198.method1440((byte) 22);
            return;
        }
        class107.method828((byte) -101);
        class326.method2234((byte) 106);
        class156.method1137((byte) 66);
        if (class253.field3774 != null) {
            class49.method454((byte) 126);
        }
        for (int var21 = class324.method2222(true, (byte) -34); var21 != -1; var21 = class324.method2222(false, (byte) -16)) {
            class268.method1864(var21, 373310787);
            class58.field866[class142.method1078(class297.field4663++, 31)] = var21;
        }
        for (class147 var22 = class271.method1887((byte) 126); var22 != null; var22 = class271.method1887((byte) 63)) {
            int var23 = var22.method1093(2128688288);
            int var24 = var22.method1092(9279);
            if (var23 == 1) {
                class302.field4722[var24] = var22.field2240;
                class167.field2517[class142.method1078(class99.field1464++, 31)] = var24;
            } else if (var23 == 2) {
                class230.field3546[var24] = var22.field2244;
                class290.field4568[class142.method1078(class64.field954++, 31)] = var24;
            } else if (var23 == 3) {
                class184 var25 = class100.method781((byte) 48, var24);
                if (!var22.field2244.equals(var25.field2840)) {
                    var25.field2840 = var22.field2244;
                    class133.method1007(var25, 106);
                }
            } else if (var23 == 4) {
                class184 var42 = class100.method781((byte) 48, var24);
                int var43 = var22.field2240;
                int var44 = var22.field2241;
                int var45 = var22.field2249;
                if (var42.field2930 != var43 || var42.field2798 != var45 || var42.field2813 != var44) {
                    var42.field2798 = var45;
                    var42.field2813 = var44;
                    var42.field2930 = var43;
                    class133.method1007(var42, 74);
                }
            } else if (var23 == 5) {
                class184 var26 = class100.method781((byte) 48, var24);
                if (var22.field2240 != var26.field2950 || var22.field2240 == -1) {
                    var26.field2925 = 0;
                    var26.field2950 = var22.field2240;
                    var26.field2905 = 1;
                    var26.field2892 = 0;
                    class133.method1007(var26, arg0 + 107);
                }
            } else if (var23 == 6) {
                int var27 = var22.field2240;
                int var28 = (var27 & 0x7EC6) >> 10;
                int var29 = var27 >> 5 & 0x1F;
                int var30 = var27 & 0x1F;
                int var31 = (var28 << 19) + (var30 << 3) + (var29 << 11);
                class184 var32 = class100.method781((byte) 48, var24);
                if (var32.field2942 != var31) {
                    var32.field2942 = var31;
                    class133.method1007(var32, arg0 + 109);
                }
            } else if (var23 == 7) {
                class184 var33 = class100.method781((byte) 48, var24);
                boolean var34 = var22.field2240 == 1;
                if (var33.field2939 != var34) {
                    var33.field2939 = var34;
                    class133.method1007(var33, arg0 + 61);
                }
            } else if (var23 == 8) {
                class184 var35 = class100.method781((byte) 48, var24);
                if (var22.field2240 != var35.field2941 || var22.field2249 != var35.field2878 || var22.field2241 != var35.field2879) {
                    var35.field2879 = var22.field2241;
                    var35.field2941 = var22.field2240;
                    if (var35.field2885 != -1) {
                        if (var35.field2901 > 0) {
                            var35.field2879 = var35.field2879 * 32 / var35.field2901;
                        } else if (var35.field2936 > 0) {
                            var35.field2879 = var35.field2879 * 32 / var35.field2936;
                        }
                    }
                    var35.field2878 = var22.field2249;
                    class133.method1007(var35, arg0 + 114);
                }
            } else if (var23 == 9) {
                class184 var41 = class100.method781((byte) 48, var24);
                if (var22.field2240 != var41.field2885 || var22.field2249 != var41.field2908) {
                    var41.field2908 = var22.field2249;
                    var41.field2885 = var22.field2240;
                    class133.method1007(var41, 96);
                }
            } else if (var23 == 10) {
                class184 var36 = class100.method781((byte) 48, var24);
                if (var22.field2240 != var36.field2911 || var22.field2249 != var36.field2933 || var22.field2241 != var36.field2896) {
                    var36.field2896 = var22.field2241;
                    var36.field2911 = var22.field2240;
                    var36.field2933 = var22.field2249;
                    class133.method1007(var36, arg0 ^ 0xFFFFFFBE);
                }
            } else if (var23 == 11) {
                class184 var40 = class100.method781((byte) 48, var24);
                var40.field2887 = var40.field2816 = var22.field2249;
                var40.field2910 = 0;
                var40.field2831 = 0;
                var40.field2948 = var40.field2897 = var22.field2240;
                class133.method1007(var40, 81);
            } else if (var23 == 12) {
                class184 var38 = class100.method781((byte) 48, var24);
                int var39 = var22.field2240;
                if (var38 != null && var38.field2945 == 0) {
                    if (var38.field2882 - var38.field2904 < var39) {
                        var39 = var38.field2882 - var38.field2904;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var38.field2808 != var39) {
                        var38.field2808 = var39;
                        class133.method1007(var38, 84);
                    }
                }
            } else if (var23 == 13) {
                class184 var37 = class100.method781((byte) 48, var24);
                var37.field2866 = var22.field2240;
            }
        }
        class88.field1297++;
        if (class3.field11 != 0) {
            class113.field1783 += 20;
            if (class113.field1783 >= 400) {
                class3.field11 = 0;
            }
        }
        if (class309.field4819 != null) {
            class128.field2020++;
            if (class128.field2020 >= 15) {
                class133.method1007(class309.field4819, arg0 ^ 0xFFFFFFC9);
                class309.field4819 = null;
            }
        }
        if (class66.field976 != null) {
            class133.method1007(class66.field976, 108);
            class72.field1041++;
            if ((class263.field3932 + 5) < class273.field4129 || class273.field4129 < (class263.field3932 - 5) || class295.field4646 > (class203.field3220 + 5) || class295.field4646 < class203.field3220 - 5) {
                class196.field3108 = true;
            }
            if (class31.field400 == 0) {
                if (class196.field3108 && class72.field1041 >= 5) {
                    if (class73.field1047 == class66.field976 && class51.field784 != class122.field1920) {
                        class184 var46 = class66.field976;
                        class196.field3100++;
                        byte var47 = 0;
                        if (class111.field1758 == 1 && var46.field2881 == 206) {
                            var47 = 1;
                        }
                        if (var46.field2903[class122.field1920] <= 0) {
                            var47 = 0;
                        }
                        if (client.method1764(var46).method1941(0)) {
                            int var50 = class51.field784;
                            int var51 = class122.field1920;
                            var46.field2903[var51] = var46.field2903[var50];
                            var46.field2856[var51] = var46.field2856[var50];
                            var46.field2903[var50] = -1;
                            var46.field2856[var50] = 0;
                        } else if (var47 == 1) {
                            int var48 = class51.field784;
                            int var49 = class122.field1920;
                            while (var48 != var49) {
                                if (var48 > var49) {
                                    var46.method1340((byte) -14, var48 - 1, var48);
                                    var48--;
                                } else if (var48 < var49) {
                                    var46.method1340((byte) -14, var48 + 1, var48);
                                    var48++;
                                }
                            }
                        } else {
                            var46.method1340((byte) -14, class122.field1920, class51.field784);
                        }
                        class159.field2372.method59(230, (byte) 73);
                        class159.field2372.method263(class122.field1920, (byte) 91);
                        class159.field2372.method257(class51.field784, true);
                        class159.field2372.method249(class66.field976.field2806, false);
                        class159.field2372.method262((byte) 81, var47);
                    }
                } else if ((class328.field5084 == 1 || class190.method1372(class6.field62 - 1, (byte) 117)) && class6.field62 > 2) {
                    class266.method1845(arg0 + 51);
                } else if (class6.field62 > 0) {
                    class29.method201((byte) -101);
                }
                class128.field2020 = 10;
                class66.field976 = null;
                class292.field4593 = 0;
            }
        }
        class227.field3514 = null;
        class205.field3248 = false;
        class106.field1621 = false;
        class179.field2681 = 0;
        class184 var52 = class322.field5012;
        class322.field5012 = null;
        class184 var53 = class299.field4707;
        class299.field4707 = null;
        while (class325.method2231((byte) -4) && class179.field2681 < 128) {
            class320.field4985[class179.field2681] = class170.field2532;
            class31.field399[class179.field2681] = class60.field896;
            class179.field2681++;
        }
        class253.field3774 = null;
        if (class319.field4972 != -1) {
            class146.method1090(0, class319.field4972, arg0 ^ 0x4, 0, class125.field1972, 0, 0, class210.field3314);
        }
        class319.field4980++;
        while (true) {
            class167 var54;
            class184 var55;
            class184 var56;
            do {
                var54 = (class167) class109.field1672.method979(49);
                if (var54 == null) {
                    while (true) {
                        class167 var57;
                        class184 var58;
                        class184 var59;
                        do {
                            var57 = (class167) class271.field4085.method979(49);
                            if (var57 == null) {
                                while (true) {
                                    class167 var60;
                                    class184 var61;
                                    class184 var62;
                                    do {
                                        var60 = (class167) class35.field473.method979(49);
                                        if (var60 == null) {
                                            if (class253.field3774 == null) {
                                                class250.field3752 = 0;
                                            }
                                            if (class152.field2290 != null) {
                                                class33.method231(110);
                                            }
                                            if (field4421 > 0 && class50.field768[82] && class50.field768[81] && class109.field1715 != 0) {
                                                int var63 = class50.field775 - class109.field1715;
                                                if (var63 < 0) {
                                                    var63 = 0;
                                                } else if (var63 > 3) {
                                                    var63 = 3;
                                                }
                                                class11.method88(class302.field4735 + class235.field3602.field4477[0], 24179, var63, class235.field3602.field4470[0] + class110.field1744);
                                            }
                                            if (field4421 > 0 && class50.field768[82] && class50.field768[81]) {
                                                if (class207.field3265 != -1) {
                                                    class11.method88(class302.field4735 + class207.field3265, 24179, class50.field775, class110.field1744 + class160.field2385);
                                                }
                                                class180.field2703 = 0;
                                                class238.field3625 = 0;
                                            } else if (class238.field3625 == 2) {
                                                if (class207.field3265 != -1) {
                                                    class159.field2372.method59(162, (byte) 73);
                                                    class159.field2372.method257(class302.field4735 + class207.field3265, true);
                                                    class159.field2372.method295(class90.field1313, arg0 + 66);
                                                    class232.field3578++;
                                                    class159.field2372.method263(class249.field3742, (byte) 126);
                                                    class159.field2372.method303(class110.field1744 + class160.field2385, (byte) 32);
                                                    class99.field1462 = class38.field573;
                                                    class113.field1783 = 0;
                                                    class128.field2027 = class97.field1446;
                                                    class3.field11 = 1;
                                                }
                                                class238.field3625 = 0;
                                            } else if (class180.field2703 == 2) {
                                                if (class207.field3265 != -1) {
                                                    class159.field2372.method59(215, (byte) 73);
                                                    class277.field4254++;
                                                    class159.field2372.method263(class110.field1744 + class160.field2385, (byte) 123);
                                                    class159.field2372.method280(class302.field4735 + class207.field3265, (byte) 111);
                                                    class113.field1783 = 0;
                                                    class99.field1462 = class38.field573;
                                                    class128.field2027 = class97.field1446;
                                                    class3.field11 = 1;
                                                }
                                                class180.field2703 = 0;
                                            } else if (class207.field3265 != -1 && class238.field3625 == 0 && class180.field2703 == 0) {
                                                boolean var64 = class328.method2241(0, class235.field3602.field4470[0], 0, 0, (byte) 12, true, class235.field3602.field4477[0], 0, 0, 0, class160.field2385, class207.field3265);
                                                if (var64) {
                                                    class113.field1783 = 0;
                                                    class128.field2027 = class97.field1446;
                                                    class99.field1462 = class38.field573;
                                                    class3.field11 = 1;
                                                }
                                            }
                                            class207.field3265 = -1;
                                            class106.method818(-13);
                                            if (class322.field5012 != var52) {
                                                if (var52 != null) {
                                                    class133.method1007(var52, 60);
                                                }
                                                if (class322.field5012 != null) {
                                                    class133.method1007(class322.field5012, 92);
                                                }
                                            }
                                            if (class299.field4707 != var53 && class33.field415 == class30.field386) {
                                                if (var53 != null) {
                                                    class133.method1007(var53, arg0 ^ 0xFFFFFF8F);
                                                }
                                                if (class299.field4707 != null) {
                                                    class133.method1007(class299.field4707, 105);
                                                }
                                            }
                                            if (class299.field4707 == null) {
                                                if (class33.field415 > 0) {
                                                    class33.field415--;
                                                }
                                            } else if (class33.field415 < class30.field386) {
                                                class33.field415++;
                                                if (class33.field415 == class30.field386) {
                                                    class133.method1007(class299.field4707, 63);
                                                }
                                            }
                                            if (class78.field1104 == 1) {
                                                class79.method628(true);
                                            } else if (class78.field1104 == 2) {
                                                class171.method1253(true);
                                            } else {
                                                class171.method1255(arg0 ^ 0xFFFFFFAF);
                                            }
                                            if (arg0 != -5) {
                                                return;
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class71.field1033[var65]++;
                                            }
                                            int var66 = class208.method1486(0);
                                            int var67 = class235.method1653((byte) 100);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class95.field1385++;
                                                class218.field3427 = 250;
                                                class142.method1071(120, 14500);
                                                class159.field2372.method59(53, (byte) 73);
                                            }
                                            if (class138.field2159 != null && class138.field2159.field3585 == 1) {
                                                if (class138.field2159.field3590 != null) {
                                                    class80.method631(class137.field2134, class45.field700, (byte) 118);
                                                }
                                                class45.field700 = false;
                                                class138.field2159 = null;
                                                class137.field2134 = null;
                                            }
                                            class132.field2085++;
                                            class124.field1965++;
                                            class271.field4098++;
                                            if (class124.field1965 > 500) {
                                                class124.field1965 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class299.field4710 += class50.field779;
                                                }
                                                if ((var68 & 0x4) == 4) {
                                                    class315.field4906 += class39.field591;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class174.field2574 += class224.field3489;
                                                }
                                            }
                                            if (class271.field4098 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                class271.field4098 = 0;
                                                if ((var69 & 0x2) == 2) {
                                                    class317.field4929 += class41.field613;
                                                }
                                                if ((var69 & 0x1) == 1) {
                                                    class99.field1459 += class142.field2193;
                                                }
                                            }
                                            if (class99.field1459 < -60) {
                                                class142.field2193 = 2;
                                            }
                                            if (class99.field1459 > 60) {
                                                class142.field2193 = -2;
                                            }
                                            if (class174.field2574 < -50) {
                                                class224.field3489 = 2;
                                            }
                                            if (class317.field4929 < -20) {
                                                class41.field613 = 1;
                                            }
                                            if (class315.field4906 < -40) {
                                                class39.field591 = 1;
                                            }
                                            if (class315.field4906 > 40) {
                                                class39.field591 = -1;
                                            }
                                            if (class299.field4710 < -55) {
                                                class50.field779 = 2;
                                            }
                                            if (class317.field4929 > 10) {
                                                class41.field613 = -1;
                                            }
                                            if (class174.field2574 > 50) {
                                                class224.field3489 = -2;
                                            }
                                            if (class299.field4710 > 55) {
                                                class50.field779 = -2;
                                            }
                                            if (class132.field2085 > 50) {
                                                class159.field2372.method59(40, (byte) 73);
                                                class310.field4834++;
                                            }
                                            if (class87.field1282) {
                                                class104.method805(false);
                                                class87.field1282 = false;
                                            }
                                            try {
                                                if (class297.field4661 != null && class159.field2372.field455 > 0) {
                                                    class297.field4661.method920((byte) -76, class159.field2372.field437, 0, class159.field2372.field455);
                                                    class132.field2085 = 0;
                                                    class159.field2372.field455 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class198.method1440((byte) 22);
                                            }
                                            return;
                                        }
                                        var61 = var60.field2518;
                                        if (var61.field2893 < 0) {
                                            break;
                                        }
                                        var62 = class100.method781((byte) 48, var61.field2974);
                                    } while (var62 == null || var62.field2946 == null || var61.field2893 >= var62.field2946.length || var62.field2946[var61.field2893] != var61);
                                    class272.method1889(1, var60);
                                }
                            }
                            var58 = var57.field2518;
                            if (var58.field2893 < 0) {
                                break;
                            }
                            var59 = class100.method781((byte) 48, var58.field2974);
                        } while (var59 == null || var59.field2946 == null || var59.field2946.length <= var58.field2893 || var59.field2946[var58.field2893] != var58);
                        class272.method1889(1, var57);
                    }
                }
                var55 = var54.field2518;
                if (var55.field2893 < 0) {
                    break;
                }
                var56 = class100.method781((byte) 48, var55.field2974);
            } while (var56 == null || var56.field2946 == null || var55.field2893 >= var56.field2946.length || var56.field2946[var55.field2893] != var55);
            class272.method1889(1, var54);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Ljava/lang/String;", line = 1171)
    public static final String method2024(int arg0, int arg1) {
        field4424++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class90.field1315 + "</col>";
        } else {
            if (arg0 != -21883) {
                field4422 = 123;
            }
            return "<col=00ff80>" + arg1 / 1000000 + class256.field3821 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 1190)
    private final void method2025(int arg0) {
        field4434++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = arg0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var12 ^ var7 >>> 2;
            int var14 = var5 + var13;
            int var15 = var6 + var11;
            int var16 = var7 + var15;
            int var17 = var16 ^ var15 << 8;
            int var18 = var4 + var17;
            int var19 = var14 + var15;
            var6 = var19 ^ var14 >>> 16;
            int var20 = var14 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var22 << 8;
            var8 = var3 + var13;
            int var26 = var22 + var24;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field4428[var27 + 1] + var8;
            int var29 = this.field4428[var27 + 7] + var2;
            int var30 = this.field4428[var27 + 2] + var7;
            int var31 = this.field4428[var27] + var9;
            int var32 = var31 ^ var28 << 11;
            int var33 = this.field4428[var27 + 3] + var6;
            int var34 = this.field4428[var27 + 4] + var5;
            int var35 = var32 + var33;
            int var36 = this.field4428[var27 + 6] + var3;
            int var37 = this.field4428[var27 + 5] + var4;
            int var38 = var28 + var30;
            int var39 = var38 ^ var30 >>> 2;
            int var40 = var30 + var35;
            int var41 = var40 ^ var35 << 8;
            int var42 = var37 + var41;
            int var43 = var34 + var39;
            int var44 = var35 + var43;
            var6 = var44 ^ var43 >>> 16;
            int var45 = var6 + var36;
            int var46 = var42 + var43;
            var5 = var46 ^ var42 << 10;
            int var47 = var5 + var29;
            int var48 = var42 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var4 + var32;
            int var50 = var45 + var47;
            var3 = var50 ^ var47 << 8;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var41;
            var8 = var3 + var39;
            var9 = var8 + var49;
            this.field4425[var27] = var9;
            this.field4425[var27 + 1] = var8;
            this.field4425[var27 + 2] = var7;
            this.field4425[var27 + 3] = var6;
            this.field4425[var27 + 4] = var5;
            this.field4425[var27 + 5] = var4;
            this.field4425[var27 + 6] = var3;
            this.field4425[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field4425[var52 + 4] + var5;
            int var54 = this.field4425[var52 + 3] + var6;
            int var55 = this.field4425[var52] + var9;
            int var56 = this.field4425[var52 + 5] + var4;
            int var57 = this.field4425[var52 + 7] + var2;
            int var58 = this.field4425[var52 + 1] + var8;
            int var59 = this.field4425[var52 + 6] + var3;
            int var60 = var55 ^ var58 << 11;
            int var61 = var54 + var60;
            int var62 = this.field4425[var52 + 2] + var7;
            int var63 = var58 + var62;
            int var64 = var63 ^ var62 >>> 2;
            int var65 = var61 + var62;
            int var66 = var65 ^ var61 << 8;
            int var67 = var56 + var66;
            int var68 = var53 + var64;
            int var69 = var61 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var6 + var59;
            int var71 = var67 + var68;
            var5 = var71 ^ var67 << 10;
            int var72 = var5 + var57;
            int var73 = var67 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var60;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var66;
            this.field4425[var52] = var9;
            this.field4425[var52 + 1] = var8;
            this.field4425[var52 + 2] = var7;
            this.field4425[var52 + 3] = var6;
            this.field4425[var52 + 4] = var5;
            this.field4425[var52 + 5] = var4;
            this.field4425[var52 + 6] = var3;
            this.field4425[var52 + 7] = var2;
        }
        this.method2020(64);
        this.field4416 = 256;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)I", line = 1336)
    public final int method2026(byte arg0) {
        if ((this.field4416--) == 0) {
            this.method2020(70);
            this.field4416 = 255;
        }
        field4420++;
        if (arg0 < 118) {
            this.field4425 = (int[]) null;
        }
        return this.field4428[this.field4416];
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 1353)
    private class287() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([I)V", line = 1356)
    public class287(int[] arg0) {
        this.field4428 = new int[256];
        this.field4425 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4428[var2] = arg0[var2];
        }
        this.method2025(0);
    }
}
