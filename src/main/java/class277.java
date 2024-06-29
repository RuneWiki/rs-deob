import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class277 extends class275 {

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
    public static boolean field4318 = false;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Llb;")
    public static class224 field4315 = new class224(512);

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4320 = -1;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1991(byte arg0) {
        field4316++;
        if (class90.field1122 > 1) {
            class229.field3341 = class331.field5060;
            class90.field1122--;
        }
        if (class161.field2221 > 0) {
            class161.field2221--;
        }
        if (class113.field1612) {
            class113.field1612 = false;
            class282.method2017(arg0 - 118);
            return;
        }
        for (int var1 = 0; var1 < 100 && class286.method2043((byte) 127); var1++) {
        }
        if (class17.field236 != 30) {
            return;
        }
        class79.method474(167, (byte) -117, class140.field1954);
        Object var2 = class331.field5062.field318;
        synchronized (class331.field5062.field318) {
            if (!class220.field3100) {
                class331.field5062.field323 = 0;
            } else if (class196.field2814 != 0 || class331.field5062.field323 >= 40) {
                class140.field1954.method573(120, 48);
                class140.field1954.method648(0, (byte) 38);
                class321.field4933++;
                int var3 = 0;
                int var4 = class140.field1954.field1400;
                for (int var5 = 0; class331.field5062.field323 > var5 && (class140.field1954.field1400 - var4) < 240; var5++) {
                    int var6 = class331.field5062.field321[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class331.field5062.field322[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    var3++;
                    boolean var8 = false;
                    if (class331.field5062.field321[var5] == -1 && class331.field5062.field322[var5] == -1) {
                        var7 = -1;
                        var8 = true;
                        var6 = -1;
                    }
                    if (class342.field5315 != var7 || class331.field5064 != var6) {
                        int var9 = var7 - class342.field5315;
                        class342.field5315 = var7;
                        int var10 = var6 - class331.field5064;
                        class331.field5064 = var6;
                        if (class236.field3451 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class140.field1954.method662(true, (class236.field3451 << 12) + (var9 << 6) + var10);
                            class236.field3451 = 0;
                        } else if (class236.field3451 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class140.field1954.method648(class236.field3451 + 128, (byte) 38);
                            var10 += 128;
                            var9 += 128;
                            class140.field1954.method662(true, (var9 << 8) + var10);
                            class236.field3451 = 0;
                        } else if (class236.field3451 >= 32) {
                            class140.field1954.method662(true, class236.field3451 + 57344);
                            if (var8) {
                                class140.field1954.method641(1773202520, Integer.MIN_VALUE);
                            } else {
                                class140.field1954.method641(arg0 ^ 0x69B0EC34, var7 | var6 << 16);
                            }
                            class236.field3451 = 0;
                        } else {
                            class140.field1954.method648(class236.field3451 + 192, (byte) 38);
                            if (var8) {
                                class140.field1954.method641(1773202520, Integer.MIN_VALUE);
                            } else {
                                class140.field1954.method641(1773202520, var7 | var6 << 16);
                            }
                            class236.field3451 = 0;
                        }
                    } else if (class236.field3451 < 2047) {
                        class236.field3451++;
                    }
                }
                class140.field1954.method654(class140.field1954.field1400 - var4, 38102816);
                if (var3 >= class331.field5062.field323) {
                    class331.field5062.field323 = 0;
                } else {
                    class331.field5062.field323 -= var3;
                    for (int var11 = 0; var11 < class331.field5062.field323; var11++) {
                        class331.field5062.field322[var11] = class331.field5062.field322[var3 + var11];
                        class331.field5062.field321[var11] = class331.field5062.field321[var3 + var11];
                    }
                }
            }
        }
        if (class196.field2814 != 0) {
            class299.field4660++;
            long var13 = (class330.field5036 - class240.field3614) / 50L;
            class240.field3614 = class330.field5036;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class148.field2055;
            int var16 = class224.field3184;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var13;
            byte var18 = 0;
            if (class196.field2814 == 2) {
                var18 = 1;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class140.field1954.method573(119, 87);
            class140.field1954.method680(var15 | var16 << 16, (byte) -115);
            class140.field1954.method642(39, var17 | var18 << 15);
        }
        if (class253.field3844 > 0) {
            class253.field3844--;
        }
        if (class90.field1125 && class253.field3844 <= 0) {
            class90.field1125 = false;
            class253.field3844 = 20;
            class140.field1954.method573(118, 122);
            class106.field1357++;
            class140.field1954.method663((int) class184.field2664, 128);
            class140.field1954.method642(-127, (int) class280.field4344);
        }
        if (class54.field658 && !class238.field3530) {
            class134.field1844++;
            class238.field3530 = true;
            class140.field1954.method573(123, 0);
            class140.field1954.method648(1, (byte) 38);
        }
        if (!class54.field658 && class238.field3530) {
            class238.field3530 = false;
            class134.field1844++;
            class140.field1954.method573(120, 0);
            class140.field1954.method648(0, (byte) 38);
        }
        if (!class136.field1881) {
            class216.field3030++;
            class140.field1954.method573(127, 36);
            class140.field1954.method639((byte) -128, class10.method49(0));
            class136.field1881 = true;
        }
        if (class162.field2236) {
            class162.field2236 = false;
        } else {
            class163.field2261 /= 2.0F;
        }
        if (class147.field2042) {
            class147.field2042 = false;
        } else {
            class272.field4271 /= 2.0F;
        }
        class240.method1723((byte) 86);
        if (class17.field236 != 30) {
            return;
        }
        class10.method52(true);
        class166.method1086((byte) 69);
        class263.method1889(-1);
        class291.field4571++;
        if (class291.field4571 > 750) {
            class282.method2017(arg0 ^ 0xFFFFFFC3);
            return;
        }
        class235.method1670(0);
        class80.method476(1397417249);
        class117.method798((byte) 61);
        if (class16.field223 != null) {
            class170.method1114(false);
        }
        for (int var19 = class225.method1548(true, -1); var19 != -1; var19 = class225.method1548(false, -1)) {
            class319.method2227(var19, -2708);
            class319.field4908[class229.method1613(31, class68.field889++)] = var19;
        }
        for (class96 var20 = class145.method984(true); var20 != null; var20 = class145.method984(true)) {
            int var21 = var20.method580((byte) 126);
            int var22 = var20.method583((byte) -110);
            if (var21 == 1) {
                class259.field3936[var22] = var20.field1243;
                class337.field5199[class229.method1613(31, class56.field675++)] = var22;
            } else if (var21 == 2) {
                class30.field382[var22] = var20.field1249;
                class195.field2806[class229.method1613(31, class231.field3369++)] = var22;
            } else if (var21 == 3) {
                class263 var23 = class91.method530(var22, arg0 + 10989220);
                if (!var20.field1249.equals(var23.field3999)) {
                    var23.field3999 = var20.field1249;
                    class239.method1712(0, var23);
                }
            } else if (var21 == 4) {
                class263 var40 = class91.method530(var22, 10989328);
                int var41 = var20.field1243;
                int var42 = var20.field1246;
                int var43 = var20.field1254;
                if (var40.field4142 != var41 || var40.field4034 != var42 || var40.field4030 != var43) {
                    var40.field4034 = var42;
                    var40.field4030 = var43;
                    var40.field4142 = var41;
                    class239.method1712(0, var40);
                }
            } else if (var21 == 5) {
                class263 var39 = class91.method530(var22, 10989328);
                if (var20.field1243 != var39.field4134 || var20.field1243 == -1) {
                    var39.field4042 = 1;
                    var39.field4153 = 0;
                    var39.field4050 = 0;
                    var39.field4134 = var20.field1243;
                    class239.method1712(arg0 - 108, var39);
                }
            } else if (var21 == 6) {
                int var33 = var20.field1243;
                int var34 = (var33 & 0x7EF2) >> 10;
                int var35 = var33 >> 5 & 0x1F;
                int var36 = var33 & 0x1F;
                int var37 = (var34 << 19) + (var35 << 11) + (var36 << 3);
                class263 var38 = class91.method530(var22, 10989328);
                if (var38.field4063 != var37) {
                    var38.field4063 = var37;
                    class239.method1712(0, var38);
                }
            } else if (var21 == 7) {
                class263 var24 = class91.method530(var22, 10989328);
                boolean var25 = var20.field1243 == 1;
                if (var25 != var24.field4001) {
                    var24.field4001 = var25;
                    class239.method1712(0, var24);
                }
            } else if (var21 == 8) {
                class263 var26 = class91.method530(var22, arg0 + 10989220);
                if (var20.field1243 != var26.field4131 || var20.field1246 != var26.field4120 || var20.field1254 != var26.field4136) {
                    var26.field4136 = var20.field1254;
                    if (var26.field4000 != -1) {
                        if (var26.field4028 > 0) {
                            var26.field4136 = var26.field4136 * 32 / var26.field4028;
                        } else if (var26.field4092 > 0) {
                            var26.field4136 = var26.field4136 * 32 / var26.field4092;
                        }
                    }
                    var26.field4131 = var20.field1243;
                    var26.field4120 = var20.field1246;
                    class239.method1712(0, var26);
                }
            } else if (var21 == 9) {
                class263 var32 = class91.method530(var22, 10989328);
                if (var20.field1243 != var32.field4000 || var20.field1246 != var32.field4022) {
                    var32.field4022 = var20.field1246;
                    var32.field4000 = var20.field1243;
                    class239.method1712(0, var32);
                }
            } else if (var21 == 10) {
                class263 var31 = class91.method530(var22, 10989328);
                if (var20.field1243 != var31.field4115 || var20.field1246 != var31.field4061 || var20.field1254 != var31.field4021) {
                    var31.field4021 = var20.field1254;
                    var31.field4061 = var20.field1246;
                    var31.field4115 = var20.field1243;
                    class239.method1712(0, var31);
                }
            } else if (var21 == 11) {
                class263 var30 = class91.method530(var22, 10989328);
                var30.field4074 = var30.field4105 = var20.field1246;
                var30.field4045 = 0;
                var30.field4118 = 0;
                var30.field4027 = var30.field3974 = var20.field1243;
                class239.method1712(0, var30);
            } else if (var21 == 12) {
                class263 var27 = class91.method530(var22, arg0 ^ 0xA7AF7C);
                int var28 = var20.field1243;
                if (var27 != null && var27.field3981 == 0) {
                    if (var27.field4059 - var27.field4096 < var28) {
                        var28 = var27.field4059 - var27.field4096;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field3990 != var28) {
                        var27.field3990 = var28;
                        class239.method1712(0, var27);
                    }
                }
            } else if (var21 == 13) {
                class263 var29 = class91.method530(var22, 10989328);
                var29.field4039 = var20.field1243;
            }
        }
        if (class158.field2179 != 0) {
            class113.field1609 += 20;
            if (class113.field1609 >= 400) {
                class158.field2179 = 0;
            }
        }
        class322.field4939++;
        if (class89.field1114 != null) {
            class121.field1703++;
            if (class121.field1703 >= 15) {
                class239.method1712(0, class89.field1114);
                class89.field1114 = null;
            }
        }
        if (class326.field4995 != null) {
            class239.method1712(0, class326.field4995);
            class48.field594++;
            if (class211.field2987 > (class213.field2999 + 5) || class211.field2987 < (class213.field2999 - 5) || class161.field2216 > class75.field961 + 5 || class75.field961 - 5 > class161.field2216) {
                class248.field3765 = true;
            }
            if (class261.field3953 == 0) {
                if (class248.field3765 && class48.field594 >= 5) {
                    if (class80.field1037 == class326.field4995 && class59.field725 != class208.field2955) {
                        class166.field2300++;
                        byte var44 = 0;
                        class263 var45 = class326.field4995;
                        if (class165.field2277 == 1 && var45.field4113 == 206) {
                            var44 = 1;
                        }
                        if (var45.field4132[class59.field725] <= 0) {
                            var44 = 0;
                        }
                        if (client.method1952(var45).method1121(127)) {
                            int var46 = class208.field2955;
                            int var47 = class59.field725;
                            var45.field4132[var47] = var45.field4132[var46];
                            var45.field4047[var47] = var45.field4047[var46];
                            var45.field4132[var46] = -1;
                            var45.field4047[var46] = 0;
                        } else if (var44 == 1) {
                            int var48 = class208.field2955;
                            int var49 = class59.field725;
                            while (var48 != var49) {
                                if (var48 > var49) {
                                    var45.method1900(-21564, var48 - 1, var48);
                                    var48--;
                                } else if (var49 > var48) {
                                    var45.method1900(arg0 ^ 0xFFFFABA8, var48 + 1, var48);
                                    var48++;
                                }
                            }
                        } else {
                            var45.method1900(-21564, class59.field725, class208.field2955);
                        }
                        class140.field1954.method573(117, 11);
                        class140.field1954.method684(class208.field2955, false);
                        class140.field1954.method680(class326.field4995.field4083, (byte) -110);
                        class140.field1954.method648(var44, (byte) 38);
                        class140.field1954.method662(true, class59.field725);
                    }
                } else if ((class58.field698 == 1 || class9.method43(class310.field4794 - 1, 109)) && class310.field4794 > 2) {
                    class311.method2183((byte) 108);
                } else if (class310.field4794 > 0) {
                    class312.method2190(-3);
                }
                class196.field2814 = 0;
                class326.field4995 = null;
                class121.field1703 = 10;
            }
        }
        class121.field1697 = false;
        class162.field2242 = 0;
        class263 var50 = class113.field1611;
        class127.field1745 = null;
        class62.field762 = false;
        class263 var51 = class204.field2868;
        class204.field2868 = null;
        class113.field1611 = null;
        while (class220.method1508(false) && class162.field2242 < 128) {
            class254.field3856[class162.field2242] = class320.field4912;
            class237.field3482[class162.field2242] = class12.field167;
            class162.field2242++;
        }
        class16.field223 = null;
        if (class146.field2031 != -1) {
            class31.method187(0, 0, class146.field2031, arg0 ^ 0xFFFFFF93, class188.field2712, 0, 0, class314.field4847);
        }
        class331.field5060++;
        while (true) {
            class176 var52;
            class263 var53;
            class263 var54;
            do {
                var52 = (class176) class107.field1367.method2323((byte) -65);
                if (var52 == null) {
                    while (true) {
                        class176 var55;
                        class263 var56;
                        class263 var57;
                        do {
                            var55 = (class176) class328.field5006.method2323((byte) -47);
                            if (var55 == null) {
                                while (true) {
                                    class176 var58;
                                    class263 var59;
                                    class263 var60;
                                    do {
                                        var58 = (class176) class115.field1627.method2323((byte) -56);
                                        if (var58 == null) {
                                            if (class16.field223 == null) {
                                                class60.field732 = 0;
                                            }
                                            if (class116.field1649 != null) {
                                                class138.method921((byte) 99);
                                            }
                                            if (class154.field2151 > 0 && class184.field2650[82] && class184.field2650[81] && class196.field2817 != 0) {
                                                int var61 = class138.field1940 - class196.field2817;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class198.method1373(class118.field1664.field2403[0] + class118.field1668, class118.field1664.field2359[0] + class142.field1992, true, var61);
                                            }
                                            if (class154.field2151 > 0 && class184.field2650[82] && class184.field2650[81]) {
                                                if (class298.field4658 != -1) {
                                                    class198.method1373(class118.field1668 + class62.field785, class298.field4658 + class142.field1992, true, class138.field1940);
                                                }
                                                class48.field583 = 0;
                                                class221.field3117 = 0;
                                            } else if (class221.field3117 == 2) {
                                                if (class298.field4658 != -1) {
                                                    class140.field1954.method573(127, 251);
                                                    class140.field1954.method662(true, class298.field4658 + class142.field1992);
                                                    class140.field1954.method684(class112.field1595, false);
                                                    class37.field443++;
                                                    class140.field1954.method663(class62.field785 + class118.field1668, 128);
                                                    class140.field1954.method680(class225.field3194, (byte) -121);
                                                    class287.field4511 = class148.field2055;
                                                    class311.field4821 = class224.field3184;
                                                    class158.field2179 = 1;
                                                    class113.field1609 = 0;
                                                }
                                                class221.field3117 = 0;
                                            } else if (class48.field583 == 2) {
                                                if (class298.field4658 != -1) {
                                                    class140.field1954.method573(123, 232);
                                                    class140.field1954.method684(class62.field785 + class118.field1668, false);
                                                    class42.field494++;
                                                    class140.field1954.method663(class142.field1992 + class298.field4658, 128);
                                                    class311.field4821 = class224.field3184;
                                                    class113.field1609 = 0;
                                                    class158.field2179 = 1;
                                                    class287.field4511 = class148.field2055;
                                                }
                                                class48.field583 = 0;
                                            } else if (class298.field4658 != -1 && class221.field3117 == 0 && class48.field583 == 0) {
                                                class318.method2220((class298.field4658 << 1) - (class118.field1664.method748(false) - 1) >> 1, false, 0, (class62.field785 << 1) + 1 - class118.field1664.method748(false) >> 1);
                                                class158.field2179 = 1;
                                                class311.field4821 = class224.field3184;
                                                class287.field4511 = class148.field2055;
                                                class113.field1609 = 0;
                                            }
                                            class298.field4658 = -1;
                                            class154.method1024(arg0 ^ 0x7684);
                                            if (class113.field1611 != var50) {
                                                if (var50 != null) {
                                                    class239.method1712(arg0 - 108, var50);
                                                }
                                                if (class113.field1611 != null) {
                                                    class239.method1712(0, class113.field1611);
                                                }
                                            }
                                            if (class204.field2868 != var51 && class98.field1285 == class282.field4384) {
                                                if (var51 != null) {
                                                    class239.method1712(0, var51);
                                                }
                                                if (class204.field2868 != null) {
                                                    class239.method1712(0, class204.field2868);
                                                }
                                            }
                                            if (class204.field2868 == null) {
                                                if (class282.field4384 > 0) {
                                                    class282.field4384--;
                                                }
                                            } else if (class282.field4384 < class98.field1285) {
                                                class282.field4384++;
                                                if (class98.field1285 == class282.field4384) {
                                                    class239.method1712(0, class204.field2868);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class242.field3650[var62]++;
                                            }
                                            int var63 = class305.method2133((byte) -61);
                                            int var64 = class61.method358(false);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class313.field4840++;
                                                class161.field2221 = 250;
                                                class96.method584(14500, -18573);
                                                class140.field1954.method573(115, 229);
                                            }
                                            if (class32.field408 != null && class32.field408.field238 == 1) {
                                                if (class32.field408.field241 != null) {
                                                    class15.method108((byte) -93, class163.field2257, class243.field3662);
                                                }
                                                class32.field408 = null;
                                                class163.field2257 = null;
                                                class243.field3662 = false;
                                            }
                                            class211.field2980++;
                                            class242.field3644++;
                                            class237.field3481++;
                                            if (class211.field2980 > 500) {
                                                class211.field2980 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x4) == 4) {
                                                    class238.field3501 += class320.field4919;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class262.field3956 += class21.field267;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class253.field3854 += class23.field315;
                                                }
                                            }
                                            if (class253.field3854 < -50) {
                                                class23.field315 = 2;
                                            }
                                            if (class237.field3481 > 500) {
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class227.field3248 += class1.field12;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class196.field2807 += class248.field3762;
                                                }
                                                class237.field3481 = 0;
                                            }
                                            if (class196.field2807 < -20) {
                                                class248.field3762 = 1;
                                            }
                                            if (class196.field2807 > 10) {
                                                class248.field3762 = -1;
                                            }
                                            if (class238.field3501 < -40) {
                                                class320.field4919 = 1;
                                            }
                                            if (class227.field3248 < -60) {
                                                class1.field12 = 2;
                                            }
                                            if (class262.field3956 < -55) {
                                                class21.field267 = 2;
                                            }
                                            if (arg0 != 108) {
                                                field4318 = false;
                                            }
                                            if (class238.field3501 > 40) {
                                                class320.field4919 = -1;
                                            }
                                            if (class262.field3956 > 55) {
                                                class21.field267 = -2;
                                            }
                                            if (class253.field3854 > 50) {
                                                class23.field315 = -2;
                                            }
                                            if (class227.field3248 > 60) {
                                                class1.field12 = -2;
                                            }
                                            if (class242.field3644 > 50) {
                                                class140.field1954.method573(121, 6);
                                                class311.field4800++;
                                            }
                                            if (class152.field2090) {
                                                class181.method1251(-15566);
                                                class152.field2090 = false;
                                            }
                                            try {
                                                if (class236.field3463 != null && class140.field1954.field1400 > 0) {
                                                    class236.field3463.method1097(class140.field1954.field1388, 0, true, class140.field1954.field1400);
                                                    class242.field3644 = 0;
                                                    class140.field1954.field1400 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class282.method2017(-80);
                                            }
                                            return;
                                        }
                                        var59 = var58.field2552;
                                        if (var59.field4012 < 0) {
                                            break;
                                        }
                                        var60 = class91.method530(var59.field4065, arg0 + 10989220);
                                    } while (var60 == null || var60.field3975 == null || var59.field4012 >= var60.field3975.length || var60.field3975[var59.field4012] != var59);
                                    class283.method2027(200000, var58);
                                }
                            }
                            var56 = var55.field2552;
                            if (var56.field4012 < 0) {
                                break;
                            }
                            var57 = class91.method530(var56.field4065, 10989328);
                        } while (var57 == null || var57.field3975 == null || var57.field3975.length <= var56.field4012 || var57.field3975[var56.field4012] != var56);
                        class283.method2027(200000, var55);
                    }
                }
                var53 = var52.field2552;
                if (var53.field4012 < 0) {
                    break;
                }
                var54 = class91.method530(var53.field4065, 10989328);
            } while (var54 == null || var54.field3975 == null || var54.field3975.length <= var53.field4012 || var54.field3975[var53.field4012] != var53);
            class283.method2027(200000, var52);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;)I", line = 1008)
    public static final int method1992(int arg0, String arg1) {
        field4317++;
        if (arg0 != -1) {
            return -29;
        }
        for (int var2 = 0; var2 < class254.field3864.length; var2++) {
            if (class254.field3864[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V", line = 1029)
    public static void method1993(byte arg0) {
        if (arg0 == -75) {
            field4315 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 1040)
    public static final void method1994(int arg0) {
        field4314++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 < 46) {
            return;
        }
        while (var2 < 104) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class243.method1753(true, class158.field2184, var2, var1, 22290, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }
}
