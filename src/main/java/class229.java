import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class229 extends Canvas {

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field3956;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lhi;")
    public static class82 field3954 = class95.method664((byte) -127, "0(U");

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIZIIBIIII)Z", line = 7)
    public static final boolean method1628(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg7 != -56) {
            method1628(127, -3, 61, 51, false, 43, -68, (byte) -105, -31, -40, -42, -2);
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class163.field2852[var12][var13] = 0;
                class202.field3485[var12][var13] = 99999999;
            }
        }
        field3948++;
        class163.field2852[arg6][arg10] = 99;
        int var14 = arg6;
        int var15 = arg10;
        byte var16 = 0;
        class202.field3485[arg6][arg10] = 0;
        int var17 = 0;
        class286.field4809[var16] = arg6;
        int var32 = var16 + 1;
        class79.field1342[var16] = arg10;
        boolean var18 = false;
        int[][] var19 = class180.field3071[class297.field5058].field3159;
        while (var32 != var17) {
            var15 = class79.field1342[var17];
            var14 = class286.field4809[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg1 == var14 && arg11 == var15) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class180.field3071[class297.field5058].method1311(arg3 - 1, var15, arg1, arg9, 1, var14, (byte) 28, arg11)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class180.field3071[class297.field5058].method1316(1, var14, var15, arg3 - 1, arg1, arg9, -1, arg11)) {
                    var18 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg5 != 0 && class180.field3071[class297.field5058].method1302(arg5, 0, arg1, var14, var15, arg8, arg11, 1, arg2)) {
                var18 = true;
                break;
            }
            int var20 = class202.field3485[var14][var15] + 1;
            if (var14 > 0 && class163.field2852[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class286.field4809[var32] = var14 - 1;
                class79.field1342[var32] = var15;
                class163.field2852[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class202.field3485[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class163.field2852[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class286.field4809[var32] = var14 + 1;
                class79.field1342[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class163.field2852[var14 + 1][var15] = 8;
                class202.field3485[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class163.field2852[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class286.field4809[var32] = var14;
                class79.field1342[var32] = var15 - 1;
                class163.field2852[var14][var15 - 1] = 1;
                class202.field3485[var14][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 103 && class163.field2852[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class286.field4809[var32] = var14;
                class79.field1342[var32] = var15 + 1;
                class163.field2852[var14][var15 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class202.field3485[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class163.field2852[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class286.field4809[var32] = var14 - 1;
                class79.field1342[var32] = var15 - 1;
                class163.field2852[var14 - 1][var15 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class202.field3485[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 103 && var15 > 0 && class163.field2852[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class286.field4809[var32] = var14 + 1;
                class79.field1342[var32] = var15 - 1;
                class163.field2852[var14 + 1][var15 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class202.field3485[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 103 && class163.field2852[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class286.field4809[var32] = var14 - 1;
                class79.field1342[var32] = var15 + 1;
                class163.field2852[var14 - 1][var15 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class202.field3485[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 103 && var15 < 103 && class163.field2852[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class286.field4809[var32] = var14 + 1;
                class79.field1342[var32] = var15 + 1;
                class163.field2852[var14 + 1][var15 + 1] = 12;
                class202.field3485[var14 + 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class166.field2907 = 0;
        if (!var18) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= arg1 + var23; var24++) {
                for (int var25 = arg11 - var23; var25 <= (arg11 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class202.field3485[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg1) {
                            var26 = arg1 - var24;
                        } else if (var24 > (arg1 - (1 - arg8))) {
                            var26 = (var24 - arg1) + 1 - arg8;
                        }
                        int var27 = 0;
                        if (var25 < arg11) {
                            var27 = arg11 - var25;
                        } else if (arg5 + arg11 - 1 < var25) {
                            var27 = 1 - arg11 - (arg5 - var25);
                        }
                        int var28 = var26 * var26 + (var27 * var27);
                        if (var28 < var21 || var21 == var28 && class202.field3485[var24][var25] < var22) {
                            var22 = class202.field3485[var24][var25];
                            var15 = var25;
                            var21 = var28;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg6 == var14 && arg10 == var15) {
                return false;
            }
            class166.field2907 = 1;
        }
        byte var29 = 0;
        class286.field4809[var29] = var14;
        int var33 = var29 + 1;
        class79.field1342[var29] = var15;
        int var30;
        int var31 = var30 = class163.field2852[var14][var15];
        while (arg6 != var14 || arg10 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class286.field4809[var33] = var14;
                class79.field1342[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class163.field2852[var14][var15];
        }
        if (var33 > 0) {
            class193.method1342(var33, arg0, -123);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIB)V", line = 302)
    public static final void method1629(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -40) {
            field3953 = 59;
        }
        if (class193.field3277 == 1) {
            class160.field2802[class233.field4049 / 100].method600(class43.field758 - 8, class45.field774 + -8);
        }
        if (class193.field3277 == 2) {
            class160.field2802[(class233.field4049 / 100) + 4].method600(class43.field758 - 8, class45.field774 + -8);
        }
        class271.method1898(1);
        field3951++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 331)
    public static final void method1630(byte arg0) {
        class74.field1135 = class219.field3805;
        class198.field3387 = class281.field4732;
        class293.field4921 = class124.field2173;
        class280.field4700 = class241.field4188;
        class19.field238 = class167.field2913;
        class308.field5256 = class308.field5248;
        class114.field2042 = class317.field5449;
        class159.field2767 = class201.field3457;
        class286.field4815 = class222.field3848;
        class275.field4629 = class9.field77;
        class259.field4435 = class232.field4015;
        class28.field386 = class256.field4404;
        class84.field1513 = class26.field347;
        class289.field4847 = class250.field4310;
        class50.field811 = class296.field5029;
        class307.field5231 = class35.field564;
        class93.field1682 = class140.field2395;
        class181.field3086 = class160.field2778;
        class217.field3775 = class61.field955;
        class60.field952 = class279.field4692;
        class218.field3787 = class54.field873;
        class224.field3894 = class205.field3591;
        class165.field2889 = class139.field2381;
        class279.field4682 = class78.field1326;
        if (arg0 < 18) {
            field3953 = -59;
        }
        class80.field1365 = class167.field2915;
        class254.field4377 = class327.field5591;
        class23.field323 = class78.field1328;
        class112.field2014 = class150.field2563;
        class152.field2569 = class214.field3734;
        class36.field596 = class79.field1340;
        class242.field4216 = class144.field2459;
        class227.field3928 = class226.field3904;
        class330.field5629 = class267.field4540;
        class87.field1550 = class171.field2963;
        class105.field1864 = class280.field4699;
        class112.field2030 = class60.field951;
        class237.field4119 = class269.field4555;
        class196.field3335 = class131.field2279;
        class253.field4356 = class296.field5047;
        class287.field4831 = class286.field4819;
        class281.field4716 = class293.field4910;
        class112.field2034 = class60.field951;
        class294.field4929 = class209.field3664;
        class177.field3054 = class217.field3777;
        class298.field5071 = class181.field3096;
        class119.field2102 = class52.field837;
        class43.field752 = class130.field2261;
        field3955++;
        class164.field2869 = class114.field2045;
        class95.field1733 = class165.field2882;
        class279.field4673 = class175.field3036;
        class193.field3275 = class311.field5307;
        class224.field3896 = class314.field5410;
        class23.field312 = class78.field1328;
        class290.field4869 = class215.field3750;
        class308.field5257 = class308.field5248;
        class249.field4302 = class215.field3759;
        class307.field5235 = class208.field3654;
        class129.field2253 = class33.field494;
        class25.field344 = class55.field891;
        class126.field2217 = class237.field4130;
        class92.field1644 = class79.field1360;
        class288.field4846 = class153.field2639;
        class84.field1503 = class315.field5419;
        class19.field249 = class47.field785;
        class214.field3727 = class82.field1440;
        class198.field3396 = class302.field5132;
        class136.field2350 = class14.field118;
        class193.field3262 = class168.field2936;
        class241.field4182 = class243.field4228;
        class157.field2673 = class220.field3821;
        class232.field4014 = class144.field2463;
        class52.field842 = class43.field754;
        class264.field4507 = class9.field70;
        class33.field486 = class247.field4273;
        class209.field3675 = class284.field4775;
        class68.field1058 = class114.field2044;
        class253.field4360 = class198.field3388;
        class133.field2292 = class157.field2692;
        class198.field3382 = class64.field996;
        class133.field2302 = class311.field5310;
        class159.field2750 = class40.field697;
        class312.field5393 = class331.field5640;
        class4.field33 = class36.field599;
        class221.field3831 = class285.field4792;
        class27.field356 = class216.field3763;
        class24.field330 = class92.field1649;
        class19.field232 = class33.field488;
        class281.field4725 = class286.field4806;
        class142.field2429 = class72.field1111;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 663)
    public static final void method1631(int arg0) {
        if (class238.field4134 > 1) {
            class131.field2271 = class157.field2726;
            class238.field4134--;
        }
        field3950++;
        if (class309.field5277 > 0) {
            class309.field5277--;
        }
        if (class36.field602) {
            class36.field602 = false;
            class171.method1207(arg0 - 176);
            return;
        }
        for (int var1 = 0; var1 < 100 && class98.method676((byte) -67); var1++) {
        }
        if (class61.field959 != 30) {
            return;
        }
        class53.method375(class61.field957, (byte) 93, 132);
        Object var2 = class187.field3154.field913;
        synchronized (class187.field3154.field913) {
            if (!class288.field4838) {
                class187.field3154.field917 = 0;
            } else if (field3953 != 0 || class187.field3154.field917 >= 40) {
                class293.field4914++;
                class61.field957.method1504(227, arg0 - 101);
                class61.field957.method1075(0, -1);
                int var3 = class61.field957.field2611;
                int var4 = 0;
                for (int var5 = 0; class187.field3154.field917 > var5 && (class61.field957.field2611 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class187.field3154.field918[var5];
                    boolean var7 = false;
                    int var8 = class187.field3154.field916[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class187.field3154.field916[var5] == -1 && class187.field3154.field918[var5] == -1) {
                        var6 = -1;
                        var8 = -1;
                        var7 = true;
                    }
                    if (class105.field1865 != var6 || class208.field3633 != var8) {
                        int var9 = var6 - class105.field1865;
                        int var10 = var8 - class208.field3633;
                        class105.field1865 = var6;
                        class208.field3633 = var8;
                        if (class66.field1028 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class61.field957.method1102((byte) -113, (class66.field1028 << 12) - (-(var9 << 6) - var10));
                            class66.field1028 = 0;
                        } else if (class66.field1028 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class61.field957.method1075(class66.field1028 + 128, arg0 ^ 0xFFFFFF9B);
                            var10 += 128;
                            var9 += 128;
                            class61.field957.method1102((byte) -121, (var9 << 8) + var10);
                            class66.field1028 = 0;
                        } else if (class66.field1028 >= 32) {
                            class61.field957.method1102((byte) -75, class66.field1028 + 57344);
                            if (var7) {
                                class61.field957.method1065(178808912, Integer.MIN_VALUE);
                            } else {
                                class61.field957.method1065(178808912, var8 << 16 | var6);
                            }
                            class66.field1028 = 0;
                        } else {
                            class61.field957.method1075(class66.field1028 + 192, -1);
                            if (var7) {
                                class61.field957.method1065(178808912, Integer.MIN_VALUE);
                            } else {
                                class61.field957.method1065(178808912, var8 << 16 | var6);
                            }
                            class66.field1028 = 0;
                        }
                    } else if (class66.field1028 < 2047) {
                        class66.field1028++;
                    }
                }
                class61.field957.method1073(arg0 - 101, -var3 + class61.field957.field2611);
                if (var4 < class187.field3154.field917) {
                    class187.field3154.field917 -= var4;
                    for (int var11 = 0; var11 < class187.field3154.field917; var11++) {
                        class187.field3154.field918[var11] = class187.field3154.field918[var4 + var11];
                        class187.field3154.field916[var11] = class187.field3154.field916[var11 + var4];
                    }
                } else {
                    class187.field3154.field917 = 0;
                }
            }
        }
        if (field3953 != 0) {
            long var13 = (class179.field3063 - class79.field1353) / 50L;
            class79.field1353 = class179.field3063;
            int var15 = class166.field2904;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class255.field4394;
            byte var17 = 0;
            int var18 = (int) var13;
            if (field3953 == 2) {
                var17 = 1;
            }
            class15.field121++;
            class61.field957.method1504(4, -1);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            class61.field957.method1046(var15 | var16 << 16, -64);
            class61.field957.method1071(-28182, var18 | var17 << 15);
        }
        if (class166.field2906 > 0) {
            class166.field2906--;
        }
        if (class300.field5098) {
            for (int var19 = 0; var19 < class180.field3074; var19++) {
                int var20 = class101.field1803[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class242.field4203 = true;
                    break;
                }
            }
        } else if (class19.field235[96] || class19.field235[97] || class19.field235[98] || class19.field235[99]) {
            class242.field4203 = true;
        }
        if (class242.field4203 && class166.field2906 <= 0) {
            class166.field2906 = 20;
            class242.field4203 = false;
            class84.field1508++;
            class61.field957.method1504(238, -1);
            class61.field957.method1102((byte) -51, class219.field3804);
            class61.field957.method1071(-28182, class226.field3915);
        }
        if (class214.field3738 && !class249.field4301) {
            class135.field2330++;
            class249.field4301 = true;
            class61.field957.method1504(34, -1);
            class61.field957.method1075(1, -1);
        }
        if (!class214.field3738 && class249.field4301) {
            class135.field2330++;
            class249.field4301 = false;
            class61.field957.method1504(34, -1);
            class61.field957.method1075(0, -1);
        }
        if (!class16.field149) {
            class61.field957.method1504(76, -1);
            class61.field957.method1065(178808912, class56.method387(arg0 - 28334));
            class67.field1042++;
            class16.field149 = true;
        }
        class241.method1727(false);
        if (class61.field959 != 30) {
            return;
        }
        class291.method2006(-24736);
        class184.method1274(1);
        class302.field5152++;
        if (class302.field5152 > 750) {
            class171.method1207(arg0 ^ 0xFFFFFFCE);
            return;
        }
        class110.method765((byte) 81);
        class28.method176(23553);
        class312.method2138(false);
        if (class293.field4917 != null) {
            class68.method426(arg0 - 169);
        }
        for (int var21 = class21.method143((byte) -25, true); var21 != -1; var21 = class21.method143((byte) -25, false)) {
            class181.method1265(var21, (byte) 123);
            class29.field395[class277.method1935(31, class44.field766++)] = var21;
        }
        class227 var22 = class255.method1824(0);
        if (arg0 != 100) {
            return;
        }
        while (var22 != null) {
            int var23 = var22.method1622(true);
            int var24 = var22.method1620((byte) 126);
            if (var23 == 1) {
                class247.field4282[var24] = var22.field3923;
                class236.field4101[class277.method1935(class42.field746++, 31)] = var24;
            } else if (var23 == 2) {
                class123.field2149[var24] = var22.field3931;
                class249.field4299[class277.method1935(class53.field851++, 31)] = var24;
            } else if (var23 == 3) {
                class75 var25 = class282.method1965(var24, (byte) 6);
                if (!var22.field3931.method534(-128, var25.field1276)) {
                    var25.field1276 = var22.field3931;
                    class138.method937(var25, 16);
                }
            } else if (var23 == 4) {
                class75 var26 = class282.method1965(var24, (byte) 6);
                int var27 = var22.field3923;
                int var28 = var22.field3929;
                if (var26.field1180 != var27 || var26.field1164 != var28) {
                    var26.field1180 = var27;
                    var26.field1164 = var28;
                    class138.method937(var26, arg0 ^ 0x74);
                }
            } else if (var23 == 5) {
                class75 var29 = class282.method1965(var24, (byte) 6);
                if (var22.field3923 != var29.field1235 || var22.field3923 == -1) {
                    var29.field1235 = var22.field3923;
                    var29.field1139 = 0;
                    var29.field1202 = 0;
                    class138.method937(var29, 16);
                }
            } else if (var23 == 6) {
                int var39 = var22.field3923;
                int var40 = (var39 & 0x7DDA) >> 10;
                int var41 = var39 >> 5 & 0x1F;
                int var42 = var39 & 0x1F;
                int var43 = (var42 << 3) + (var40 << 19) + (var41 << 11);
                class75 var44 = class282.method1965(var24, (byte) 6);
                if (var44.field1288 != var43) {
                    var44.field1288 = var43;
                    class138.method937(var44, 16);
                }
            } else if (var23 == 7) {
                class75 var37 = class282.method1965(var24, (byte) 6);
                boolean var38 = var22.field3923 == 1;
                if (var37.field1281 != var38) {
                    var37.field1281 = var38;
                    class138.method937(var37, arg0 ^ 0x74);
                }
            } else if (var23 == 8) {
                class75 var36 = class282.method1965(var24, (byte) 6);
                if (var22.field3923 != var36.field1299 || var22.field3929 != var36.field1167 || var22.field3927 != var36.field1186) {
                    var36.field1167 = var22.field3929;
                    var36.field1186 = var22.field3927;
                    if (var36.field1262 != -1) {
                        if (var36.field1257 > 0) {
                            var36.field1186 = var36.field1186 * 32 / var36.field1257;
                        } else if (var36.field1298 > 0) {
                            var36.field1186 = var36.field1186 * 32 / var36.field1298;
                        }
                    }
                    var36.field1299 = var22.field3923;
                    class138.method937(var36, 16);
                }
            } else if (var23 == 9) {
                class75 var35 = class282.method1965(var24, (byte) 6);
                if (var22.field3923 != var35.field1262 || var22.field3929 != var35.field1244) {
                    var35.field1244 = var22.field3929;
                    var35.field1262 = var22.field3923;
                    class138.method937(var35, 16);
                }
            } else if (var23 == 10) {
                class75 var34 = class282.method1965(var24, (byte) 6);
                if (var22.field3923 != var34.field1249 || var22.field3929 != var34.field1171 || var22.field3927 != var34.field1286) {
                    var34.field1286 = var22.field3927;
                    var34.field1249 = var22.field3923;
                    var34.field1171 = var22.field3929;
                    class138.method937(var34, 16);
                }
            } else if (var23 == 11) {
                class75 var30 = class282.method1965(var24, (byte) 6);
                var30.field1294 = var30.field1290 = var22.field3929;
                var30.field1151 = var30.field1240 = var22.field3923;
                var30.field1273 = 0;
                var30.field1193 = 0;
                class138.method937(var30, 16);
            } else if (var23 == 12) {
                class75 var32 = class282.method1965(var24, (byte) 6);
                int var33 = var22.field3923;
                if (var32 != null && var32.field1184 == 0) {
                    if (var32.field1224 - var32.field1205 < var33) {
                        var33 = var32.field1224 - var32.field1205;
                    }
                    if (var33 < 0) {
                        var33 = 0;
                    }
                    if (var32.field1188 != var33) {
                        var32.field1188 = var33;
                        class138.method937(var32, arg0 - 84);
                    }
                }
            } else if (var23 == 13) {
                class75 var31 = class282.method1965(var24, (byte) 6);
                var31.field1267 = var22.field3923;
            }
            var22 = class255.method1824(0);
        }
        if (class193.field3277 != 0) {
            class233.field4049 += 20;
            if (class233.field4049 >= 400) {
                class193.field3277 = 0;
            }
        }
        class243.field4229++;
        if (class328.field5603 != null) {
            class327.field5587++;
            if (class327.field5587 >= 15) {
                class138.method937(class328.field5603, 16);
                class328.field5603 = null;
            }
        }
        if (class62.field977 != null) {
            class138.method937(class62.field977, 16);
            class130.field2263++;
            if (class211.field3702 > (class40.field695 + 5) || class40.field695 - 5 > class211.field3702 || class161.field2809 + 5 < class202.field3471 || class202.field3471 < (class161.field2809 - 5)) {
                class105.field1863 = true;
            }
            if (class272.field4579 == 0) {
                if (class105.field1863 && class130.field2263 >= 5) {
                    if (class62.field977 == class279.field4685 && class34.field507 != class302.field5139) {
                        class180.field3070++;
                        class75 var45 = class62.field977;
                        byte var46 = 0;
                        if (class61.field961 == 1 && var45.field1210 == 206) {
                            var46 = 1;
                        }
                        if (var45.field1170[class302.field5139] <= 0) {
                            var46 = 0;
                        }
                        if (class48.method347((byte) 59, client.method871(var45))) {
                            int var49 = class34.field507;
                            int var50 = class302.field5139;
                            var45.field1170[var50] = var45.field1170[var49];
                            var45.field1144[var50] = var45.field1144[var49];
                            var45.field1170[var49] = -1;
                            var45.field1144[var49] = 0;
                        } else if (var46 == 1) {
                            int var47 = class34.field507;
                            int var48 = class302.field5139;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var45.method473(var47, var47 - 1, true);
                                    var47--;
                                } else if (var47 < var48) {
                                    var45.method473(var47, var47 + 1, true);
                                    var47++;
                                }
                            }
                        } else {
                            var45.method473(class34.field507, class302.field5139, true);
                        }
                        class61.field957.method1504(37, arg0 - 101);
                        class61.field957.method1075(var46, -1);
                        class61.field957.method1065(arg0 + 178808812, class62.field977.field1172);
                        class61.field957.method1069(class34.field507, 877369544);
                        class61.field957.method1102((byte) -117, class302.field5139);
                    }
                } else if ((class245.field4256 == 1 || class24.method157((byte) -111, class309.field5262 - 1)) && class309.field5262 > 2) {
                    class250.method1795(5);
                } else if (class309.field5262 > 0) {
                    class144.method980(arg0 - 103);
                }
                class327.field5587 = 10;
                class62.field977 = null;
                field3953 = 0;
            }
        }
        class180.field3074 = 0;
        class36.field573 = false;
        class325.field5575 = false;
        class166.field2911 = null;
        class75 var51 = class157.field2730;
        class75 var52 = class302.field5154;
        class157.field2730 = null;
        class302.field5154 = null;
        while (class25.method166(true) && class180.field3074 < 128) {
            class101.field1803[class180.field3074] = class124.field2180;
            class99.field1785[class180.field3074] = class199.field3414;
            class180.field3074++;
        }
        class293.field4917 = null;
        if (class255.field4382 != -1) {
            class279.method1944(0, class180.field3078, 0, class255.field4382, (byte) 38, 0, 0, class260.field4462);
        }
        class157.field2726++;
        while (true) {
            class331 var53;
            class75 var54;
            class75 var55;
            do {
                var53 = (class331) class215.field3743.method1932(arg0 ^ 0xFFFFFF9B);
                if (var53 == null) {
                    while (true) {
                        class331 var56;
                        class75 var57;
                        class75 var58;
                        do {
                            var56 = (class331) class212.field3706.method1932(-1);
                            if (var56 == null) {
                                while (true) {
                                    class331 var59;
                                    class75 var60;
                                    class75 var61;
                                    do {
                                        var59 = (class331) class197.field3366.method1932(-1);
                                        if (var59 == null) {
                                            if (class267.field4536 && class293.field4917 == null) {
                                                class267.field4536 = false;
                                            }
                                            if (class194.field3290 != null) {
                                                class231.method1640((byte) 75);
                                            }
                                            if (class323.field5545 > 0 && class19.field235[82] && class19.field235[81] && class4.field39 != 0) {
                                                int var62 = class297.field5058 - class4.field39;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class100.method683(class168.field2932.field1723[0] + class230.field3976, var62, class226.field3916 + class168.field2932.field1720[0], true);
                                            }
                                            if (class100.field1799 != -1) {
                                                int var63 = class100.field1799;
                                                int var64 = class257.field4419;
                                                if (class323.field5545 > 0 && class19.field235[82] && class19.field235[81]) {
                                                    class100.method683(class230.field3976 + var63, class297.field5058, class226.field3916 + var64, true);
                                                } else if (class207.field3610) {
                                                    class61.field957.method1504(229, -1);
                                                    class61.field957.method1070(class15.field133, (byte) -119);
                                                    class61.field957.method1070(class230.field3976 + var63, (byte) 88);
                                                    class140.field2403++;
                                                    class61.field957.method1069(class226.field3916 + var64, 877369544);
                                                    class61.field957.method1065(arg0 + 178808812, class65.field1016);
                                                    class43.field758 = class166.field2904;
                                                    class193.field3277 = 1;
                                                    class45.field774 = class255.field4394;
                                                    class233.field4049 = 0;
                                                } else if (class66.field1029) {
                                                    class47.field783++;
                                                    class61.field957.method1504(36, -1);
                                                    class61.field957.method1070(class230.field3976 + var63, (byte) 100);
                                                    class61.field957.method1069(class226.field3916 + var64, arg0 + 877369444);
                                                    class43.field758 = class166.field2904;
                                                    class193.field3277 = 1;
                                                    class45.field774 = class255.field4394;
                                                    class233.field4049 = 0;
                                                } else {
                                                    boolean var65 = class55.method384(0, 0, 0, true, 0, var64, (byte) -103, 0, var63, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
                                                    if (var65) {
                                                        class43.field758 = class166.field2904;
                                                        class193.field3277 = 1;
                                                        class45.field774 = class255.field4394;
                                                        class233.field4049 = 0;
                                                    }
                                                }
                                                class100.field1799 = -1;
                                                class66.field1029 = false;
                                                class207.field3610 = false;
                                            }
                                            client.method854((byte) 54);
                                            if (class302.field5154 != var52) {
                                                if (var52 != null) {
                                                    class138.method937(var52, arg0 - 84);
                                                }
                                                if (class302.field5154 != null) {
                                                    class138.method937(class302.field5154, 16);
                                                }
                                            }
                                            if (class157.field2730 != var51 && class314.field5407 == class181.field3080) {
                                                if (var51 != null) {
                                                    class138.method937(var51, 16);
                                                }
                                                if (class157.field2730 != null) {
                                                    class138.method937(class157.field2730, 16);
                                                }
                                            }
                                            if (class157.field2730 == null) {
                                                if (class314.field5407 > 0) {
                                                    class314.field5407--;
                                                }
                                            } else if (class314.field5407 < class181.field3080) {
                                                class314.field5407++;
                                                if (class314.field5407 == class181.field3080) {
                                                    class138.method937(class157.field2730, arg0 ^ 0x74);
                                                }
                                            }
                                            if (class273.field4602 == 1) {
                                                class310.method2134((byte) -83);
                                            } else if (class273.field4602 == 2) {
                                                class54.method381(arg0 ^ 0x77E9);
                                            } else {
                                                class272.method1902(false);
                                            }
                                            for (int var66 = 0; var66 < 5; var66++) {
                                                int var10002 = class133.field2309[var66]++;
                                            }
                                            int var67 = class84.method587(arg0 ^ 0x50);
                                            int var68 = class164.method1185(10960);
                                            if (var67 > 4500 && var68 > 4500) {
                                                class309.field5277 = 250;
                                                class269.field4548++;
                                                class136.method931((byte) 127, 4000);
                                                class61.field957.method1504(160, -1);
                                            }
                                            if (class300.field5099 != null && class300.field5099.field5121 == 1) {
                                                if (class300.field5099.field5122 != null) {
                                                    client.method867(class15.field127, arg0 ^ 0xFFFFF26C, class207.field3619);
                                                }
                                                class300.field5099 = null;
                                                class15.field127 = null;
                                                class207.field3619 = false;
                                            }
                                            class325.field5574++;
                                            class247.field4269++;
                                            if (class247.field4269 > 500) {
                                                class247.field4269 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class28.field382 += class135.field2327;
                                                }
                                                if ((var69 & 0x4) == 4) {
                                                    class200.field3444 += class264.field4497;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class40.field690 += class242.field4204;
                                                }
                                            }
                                            if (class28.field382 < -50) {
                                                class135.field2327 = 2;
                                            }
                                            if (class28.field382 > 50) {
                                                class135.field2327 = -2;
                                            }
                                            class137.field2357++;
                                            if (class137.field2357 > 500) {
                                                class137.field2357 = 0;
                                                int var70 = (int) (Math.random() * 8.0D);
                                                if ((var70 & 0x1) == 1) {
                                                    class62.field970 += class255.field4390;
                                                }
                                                if ((var70 & 0x2) == 2) {
                                                    class5.field41 += class275.field4631;
                                                }
                                            }
                                            if (class62.field970 < -60) {
                                                class255.field4390 = 2;
                                            }
                                            if (class200.field3444 < -40) {
                                                class264.field4497 = 1;
                                            }
                                            if (class62.field970 > 60) {
                                                class255.field4390 = -2;
                                            }
                                            if (class40.field690 < -55) {
                                                class242.field4204 = 2;
                                            }
                                            if (class5.field41 < -20) {
                                                class275.field4631 = 1;
                                            }
                                            if (class5.field41 > 10) {
                                                class275.field4631 = -1;
                                            }
                                            if (class200.field3444 > 40) {
                                                class264.field4497 = -1;
                                            }
                                            if (class40.field690 > 55) {
                                                class242.field4204 = -2;
                                            }
                                            if (class325.field5574 > 50) {
                                                class14.field107++;
                                                class61.field957.method1504(120, -1);
                                            }
                                            if (class104.field1844) {
                                                class256.method1828((byte) -13);
                                                class104.field1844 = false;
                                            }
                                            try {
                                                if (class66.field1036 != null && class61.field957.field2611 > 0) {
                                                    class66.field1036.method2083(true, class61.field957.field2611, class61.field957.field2598, 0);
                                                    class325.field5574 = 0;
                                                    class61.field957.field2611 = 0;
                                                }
                                            } catch (IOException var72) {
                                                class171.method1207(-101);
                                            }
                                            return;
                                        }
                                        var60 = var59.field5649;
                                        if (var60.field1238 < 0) {
                                            break;
                                        }
                                        var61 = class282.method1965(var60.field1280, (byte) 6);
                                    } while (var61 == null || var61.field1274 == null || var61.field1274.length <= var60.field1238 || var61.field1274[var60.field1238] != var60);
                                    class15.method92(var59, 101);
                                }
                            }
                            var57 = var56.field5649;
                            if (var57.field1238 < 0) {
                                break;
                            }
                            var58 = class282.method1965(var57.field1280, (byte) 6);
                        } while (var58 == null || var58.field1274 == null || var58.field1274.length <= var57.field1238 || var58.field1274[var57.field1238] != var57);
                        class15.method92(var56, -56);
                    }
                }
                var54 = var53.field5649;
                if (var54.field1238 < 0) {
                    break;
                }
                var55 = class282.method1965(var54.field1280, (byte) 6);
            } while (var55 == null || var55.field1274 == null || var55.field1274.length <= var54.field1238 || var55.field1274[var54.field1238] != var54);
            class15.method92(var53, -39);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 1683)
    public static void method1632(int arg0) {
        int var1 = -94 % ((arg0 + 24) / 43);
        field3954 = null;
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 1692)
    public final void paint(Graphics arg0) {
        field3949++;
        this.field3956.paint(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1703)
    public final void update(Graphics arg0) {
        this.field3956.update(arg0);
        field3952++;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 1714)
    public class229(Component arg0) {
        this.field3956 = arg0;
    }
}
