import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 extends class139 {

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    private int field447 = 32768;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "[Z")
    public static boolean[] field451 = new boolean[5];

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "[Lph;")
    public static class147[] field446 = new class147[16];

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lrf;")
    private static class163 field452 = class53.method392(-98, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "Lrf;")
    public static class163 field457 = class53.method392(50, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "Lrf;")
    public static class163 field459 = field452;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    public static int field458 = -8 + (int) (Math.random() * 17.0D);

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field445;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "[I")
    public static int[] field449;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "[I")
    public static int[] field460;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "[Lcb;")
    public static class23[] field454;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JB)V")
    public static final void method151(long arg0, byte arg1) {
        ++field444;
        if (arg1 == 0) {
            if (~arg0 < -1L) {
                if (~(arg0 % 10L) == -1L) {
                    class109.method760((byte) 93, arg0 + -1L);
                    class109.method760((byte) -60, 1L);
                } else {
                    class109.method760((byte) -77, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIZ)I")
    public static final int method152(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method154((byte) -88);
        }
        ++field456;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return (133761959 & var5) >> 19;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field448;
        if (arg1 != 7451) {
            return null;
        } else {
            int[] var3 = super.field2859.method1319(-108, arg0);
            if (super.field2859.field3966) {
                int[] var4 = this.method917(arg0, 1, true);
                int[] var5 = this.method917(arg0, 2, true);
                for (int var6 = 0; class23.field402 > var6; ++var6) {
                    int var7 = var4[var6] >> 4 & 255;
                    int var8 = var5[var6] * this.field447 >> 12;
                    int var9 = class210.field4094[var7] * var8 >> 12;
                    int var10 = class162.field3266[var7] * var8 >> 12;
                    int var11 = class29.field542 & (var9 >> 12) + var6;
                    int var12 = class15.field260 & (var10 >> 12) + arg0;
                    int[] var13 = this.method917(var12, 0, true);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static final void method153(int arg0) {
        class57.field1153 = arg0;
        for (int var1 = 0; var1 < class80.field1620; ++var1) {
            for (int var2 = 0; var2 < class92.field2007; ++var2) {
                if (class97.field2054[arg0][var1][var2] == null) {
                    class97.field2054[arg0][var1][var2] = new class111(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class25() {
        super(3, false);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 == 0) {
            ++field450;
            class137.method901(false);
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)V")
    public static void method154(byte arg0) {
        if (arg0 <= 16) {
            field458 = 28;
        }
        field449 = null;
        field446 = null;
        field457 = null;
        field459 = null;
        field460 = null;
        field452 = null;
        field445 = null;
        field454 = null;
        field451 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class152.field3124 = arg2;
        for (int var5 = -1; ~var5 > ~(class93.field2013 + class112.field2377); ++var5) {
            class36 var21;
            if (~var5 == 0) {
                var21 = class56.field1136;
            } else if (class112.field2377 > var5) {
                var21 = class121.field2553[class27.field504[var5]];
            } else {
                var21 = class187.field3723[class170.field3459[-class112.field2377 + var5]];
            }
            if (var21 != null && var21.method228(3)) {
                if (var21 instanceof class70) {
                    class129 var22 = ((class70) var21).field1482;
                    if (var22.field2682 != null) {
                        var22 = var22.method851(0);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class112.field2377) {
                    class129 var23 = ((class70) var21).field1482;
                    if (var23.field2682 != null) {
                        var23 = var23.method851(0);
                    }
                    if (~var23.field2683 <= -1 && ~class177.field3568.length < ~var23.field2683) {
                        class11.method84(var21, -25270, var21.method229((byte) 9) + 15);
                        if (~class168.field3405 < 0) {
                            class177.field3568[var23.field2683].method1106(class168.field3405 + -12 + arg4, class61.field1282 + arg0 - 30);
                        }
                    }
                    if (~class5.field106 == -2 && class170.field3459[var5 - class112.field2377] == class21.field368 && ~(class51.field1023 % 20) > -11) {
                        class11.method84(var21, -25270, var21.method229((byte) -107) + 15);
                        if (class168.field3405 > -1) {
                            class96.field2045[0].method1106(class168.field3405 + -12 + arg4, arg0 - (-class61.field1282 - -28));
                        }
                    }
                } else {
                    int var24 = 30;
                    class38 var25 = (class38) var21;
                    if (~var25.field778 != 0 || var25.field765 != -1) {
                        class11.method84(var21, -25270, 15 + var21.method229((byte) -121));
                        if (~class168.field3405 < 0) {
                            if (~var25.field778 != 0) {
                                class147.field3026[var25.field778].method1106(arg4 - -class168.field3405 - 12, -var24 + class61.field1282 + arg0);
                                var24 += 25;
                            }
                            if (var25.field765 != -1) {
                                class177.field3568[var25.field765].method1106(class168.field3405 + arg4 - 12, -var24 + class61.field1282 + arg0);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class5.field106 == 10 && ~class27.field504[var5] == ~class133.field2757) {
                        class11.method84(var21, -25270, 15 + var21.method229((byte) -113));
                        if (~class168.field3405 < 0) {
                            class96.field2045[1].method1106(class168.field3405 + arg4 + -12, class61.field1282 + arg0 + -var24);
                        }
                    }
                }
                if (var21.field686 != null && (~class112.field2377 >= ~var5 || class57.field1140 == 0 || ~class57.field1140 == -4 || class57.field1140 == 1 && class31.method206(arg2, ((class38) var21).field758))) {
                    class11.method84(var21, -25270, var21.method229((byte) 13));
                    if (class168.field3405 > -1 && class148.field3041 > class152.field3124) {
                        class148.field3059[class152.field3124] = class134.field2772.method560(var21.field686) / 2;
                        class148.field3040[class152.field3124] = class134.field2772.field1688;
                        class148.field3055[class152.field3124] = class168.field3405;
                        class148.field3052[class152.field3124] = class61.field1282;
                        class148.field3042[class152.field3124] = var21.field704;
                        class148.field3043[class152.field3124] = var21.field735;
                        class148.field3058[class152.field3124] = var21.field672;
                        class148.field3048[class152.field3124] = var21.field686;
                        ++class152.field3124;
                    }
                }
                if (~var21.field726 < ~class51.field1023) {
                    class11.method84(var21, arg2 + -25270, 15 + var21.method229((byte) 88));
                    if (~class168.field3405 < 0) {
                        class173.method1173(arg4 - -class168.field3405 + -15, class61.field1282 + -3 + arg0, var21.field680, 5, 65280);
                        class173.method1173(arg4 + -15 + class168.field3405 + var21.field680, class61.field1282 + -3 + arg0, -var21.field680 + 30, 5, 16711680);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var21.field736[var26] > class51.field1023) {
                        class11.method84(var21, arg2 + -25270, var21.method229((byte) 85) / 2);
                        if (~class168.field3405 < 0) {
                            if (~var26 == -2) {
                                class61.field1282 -= 20;
                            }
                            if (var26 == 2) {
                                class168.field3405 -= 15;
                                class61.field1282 -= 10;
                            }
                            if (var26 == 3) {
                                class61.field1282 -= 10;
                                class168.field3405 += 15;
                            }
                            class102.field2137[var21.field682[var26]].method1106(class168.field3405 + arg4 + -12, arg0 + -12 + class61.field1282);
                            class138.field2833.method583(class34.method217(var21.field688[var26], -66), arg4 - -class168.field3405 + -1, arg0 - (-class61.field1282 - 3), 16777215, 0);
                        }
                    }
                }
            }
        }
        ++field453;
        for (int var6 = 0; var6 < class152.field3124; ++var6) {
            int var7 = class148.field3055[var6];
            int var8 = class148.field3052[var6];
            int var9 = class148.field3059[var6];
            int var10 = class148.field3040[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; ++var20) {
                    if (~(var8 + 2) < ~(class148.field3052[var20] - class148.field3040[var20]) && ~(class148.field3052[var20] + 2) < ~(-var10 + var8) && ~(class148.field3059[var20] + class148.field3055[var20]) < ~(-var9 + var7) && var7 + var9 > class148.field3055[var20] + -class148.field3059[var20] && var8 > class148.field3052[var20] + -class148.field3040[var20]) {
                        var11 = true;
                        var8 = class148.field3052[var20] + -class148.field3040[var20];
                    }
                }
            }
            class168.field3405 = class148.field3055[var6];
            class61.field1282 = class148.field3052[var6] = var8;
            class163 var12 = class148.field3048[var6];
            if (class48.field936 == 0) {
                int var13 = 16776960;
                if (~class148.field3042[var6] > -7) {
                    var13 = class113.field2395[class148.field3042[var6]];
                }
                if (~class148.field3042[var6] == -7) {
                    var13 = ~(class161.field3257 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (class148.field3042[var6] == 7) {
                    var13 = class161.field3257 % 20 < 10 ? 255 : 65535;
                }
                if (class148.field3042[var6] == 8) {
                    var13 = ~(class161.field3257 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class148.field3042[var6] == 9) {
                    int var14 = -class148.field3058[var6] + 150;
                    if (~var14 > -51) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (~var14 <= -101) {
                        if (~var14 > -151) {
                            var13 = (var14 + -100) * 5 + 65280;
                        }
                    } else {
                        var13 = -((var14 + -50) * 327680) + 16776960;
                    }
                }
                if (class148.field3042[var6] == 10) {
                    int var15 = 150 - class148.field3058[var6];
                    if (~var15 <= -51) {
                        if (var15 >= 100) {
                            if (var15 < 150) {
                                var13 = (var15 + -100) * 327680 + (255 - (var15 + -100) * 5);
                            }
                        } else {
                            var13 = -(var15 * 327680) + 16384000 + 16711935;
                        }
                    } else {
                        var13 = var15 * 5 + 16711680;
                    }
                }
                if (class148.field3042[var6] == 11) {
                    int var16 = -class148.field3058[var6] + 150;
                    if (var16 < 50) {
                        var13 = -(var16 * 327685) + 16777215;
                    } else if (~var16 <= -101) {
                        if (var16 < 150) {
                            var13 = 32768000 - (var16 * 327680 - 16777215);
                        }
                    } else {
                        var13 = 65280 - -(var16 * 327685) + -16384250;
                    }
                }
                if (class148.field3043[var6] == 0) {
                    class134.field2772.method583(var12, class168.field3405 + arg4, class61.field1282 + arg0, var13, 0);
                }
                if (~class148.field3043[var6] == -2) {
                    class134.field2772.method585(var12, class168.field3405 + arg4, class61.field1282 + arg0, var13, 0, class161.field3257);
                }
                if (~class148.field3043[var6] == -3) {
                    class134.field2772.method558(var12, class168.field3405 + arg4, class61.field1282 + arg0, var13, 0, class161.field3257);
                }
                if (~class148.field3043[var6] == -4) {
                    class134.field2772.method579(var12, class168.field3405 + arg4, class61.field1282 + arg0, var13, 0, class161.field3257, 150 - class148.field3058[var6]);
                }
                if (~class148.field3043[var6] == -5) {
                    int var17 = (-class148.field3058[var6] + 150) * (class134.field2772.method560(var12) + 100) / 150;
                    class173.method1172(arg4 - 50 + class168.field3405, arg0, arg4 - (-class168.field3405 + -50), arg0 + arg3);
                    class134.field2772.method577(var12, class168.field3405 + arg4 + -var17 - -50, class61.field1282 + arg0, var13, 0);
                    class173.method1159(arg4, arg0, arg1 + arg4, arg0 + arg3);
                }
                if (~class148.field3043[var6] == -6) {
                    int var18 = -class148.field3058[var6] + 150;
                    class173.method1172(arg4, arg0 + -1 + class61.field1282 + -class134.field2772.field1688, arg1 + arg4, arg0 + 5 - -class61.field1282);
                    int var19 = 0;
                    if (var18 >= 25) {
                        if (var18 > 125) {
                            var19 = var18 - 125;
                        }
                    } else {
                        var19 = var18 + -25;
                    }
                    class134.field2772.method583(var12, class168.field3405 + arg4, class61.field1282 + arg0 + var19, var13, 0);
                    class173.method1159(arg4, arg0, arg1 + arg4, arg0 + arg3);
                }
            } else {
                class134.field2772.method583(var12, class168.field3405 + arg4, class61.field1282 + arg0, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int[] var4 = this.method917(arg1, 1, true);
            int[] var5 = this.method917(arg1, 2, true);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class23.field402; ++var9) {
                int var10 = (1046646 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field447 >> 12;
                int var12 = class162.field3266[var10] * var11 >> 12;
                int var13 = class15.field260 & (var12 >> 12) + arg1;
                int var14 = class210.field4094[var10] * var11 >> 12;
                int var15 = var9 - -(var14 >> 12) & class29.field542;
                int[][] var16 = this.method910((byte) -38, var13, 0);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        ++field455;
        if (arg0 < 53) {
            field452 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field2872 = arg2.method344(255) == 1;
            }
        } else {
            this.field447 = arg2.method390((byte) 120) << 4;
        }
        if (arg1 != 21) {
            field458 = -32;
        }
        ++field443;
    }
}
