import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lkd;")
    public static class73 field904 = class126.method1070((byte) -66, "(X100(U(Y");

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field910 = 1;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lkd;")
    private static class73 field903 = class126.method1070((byte) -66, "Bad session id)3");

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
    public static boolean field915 = false;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lkd;")
    public static class73 field906 = field903;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lkd;")
    public static class73 field914 = class126.method1070((byte) -66, "Name eingeben:");

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lua;")
    public static class137 field905;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljc;")
    public static class65 field902;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "[Lde;")
    public static class27[] field907;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Lkd;")
    public static final class73 method261(int arg0, boolean arg1) {
        class73 var2 = class78.method676(arg0, -57);
        field908++;
        if (!arg1) {
            field905 = null;
        }
        for (int var3 = var2.method632((byte) -119) - 3; var3 > 0; var3 -= 3) {
            var2 = class32.method258(-123, new class73[] { var2.method630(var3, 0, -24023), class31.field878, var2.method638(var3, 8) });
        }
        if (var2.method632((byte) -110) > 8) {
            var2 = class32.method258(-118, new class73[] { class84.field2126, var2.method630(var2.method632((byte) -93) - 8, 0, -24023), class13.field418, class22.field633, var2, class60.field1585 });
        } else if (var2.method632((byte) -117) > 4) {
            var2 = class32.method258(-111, new class73[] { class143.field3565, var2.method630(var2.method632((byte) -106) - 4, 0, -24023), class145.field3580, class22.field633, var2, class60.field1585 });
        }
        return class32.method258(-91, new class73[] { class133.field3334, var2 });
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method262(byte arg0) {
        field904 = null;
        field907 = null;
        if (arg0 != -106) {
            method264((byte) 116);
        }
        field906 = null;
        field903 = null;
        field902 = null;
        field905 = null;
        field914 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILpb;)V")
    public static final void method263(int arg0, int arg1, int arg2, class106 arg3) {
        field913++;
        if (arg3 == null) {
            return;
        }
        int var4 = arg1 * arg1 + arg2 * arg2;
        if (arg0 != -621557776) {
            method262((byte) 70);
        }
        int var5 = class84.field2123 + class55.field1490 & 0x7FF;
        if (var4 > 6400) {
            return;
        }
        int var6 = class29.field833[var5];
        int var7 = var6 * 256 / (class43.field1156 + 256);
        int var8 = class29.field848[var5];
        int var9 = var8 * 256 / (class43.field1156 + 256);
        int var10 = arg1 * var9 + arg2 * var7 >> 16;
        int var11 = arg2 * var9 - arg1 * var7 >> 16;
        if (var4 > 2500) {
            arg3.method857(class79.field2010, var10 + 4 + 94 - arg3.field2628 / 2, -(arg3.field2631 / 2) + -var11 + -4 + 83);
        } else {
            arg3.method860(var10 + 94 + 4 - arg3.field2628 / 2, -(arg3.field2631 / 2) + 83 - (var11 + 4));
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static final void method264(byte arg0) {
        field911++;
        class122.field3123 = 0;
        for (int var1 = -1; var1 < client.field618 + class63.field1661; var1++) {
            class89 var18;
            if (var1 == -1) {
                var18 = class73.field1901;
            } else if (var1 < class63.field1661) {
                var18 = class42.field1141[class14.field435[var1]];
            } else {
                var18 = class133.field3345[class55.field1455[var1 - class63.field1661]];
            }
            if (var18 != null && var18.method87((byte) -23)) {
                if (var18 instanceof class9) {
                    class28 var19 = ((class9) var18).field301;
                    if (var19.field801 != null) {
                        var19 = var19.method216(-1);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class63.field1661 <= var1) {
                    class28 var20 = ((class9) var18).field301;
                    if (var20.field801 != null) {
                        var20 = var20.method216(-1);
                    }
                    if (var20.field815 >= 0 && var20.field815 < class84.field2125.length) {
                        class37.method296(var18, var18.field2236 + 15, 101);
                        if (class11.field324 > -1) {
                            class84.field2125[var20.field815].method860(class11.field324 - 12, class42.field1136 + -30);
                        }
                    }
                    if (class64.field1685 == 1 && class55.field1455[var1 - class63.field1661] == class118.field3006 && class49.field1308 % 20 < 10) {
                        class37.method296(var18, var18.field2236 + 15, 94);
                        if (class11.field324 > -1) {
                            class31.field865[0].method860(class11.field324 - 12, class42.field1136 - 28);
                        }
                    }
                } else {
                    class118 var21 = (class118) var18;
                    int var22 = 30;
                    if (var21.field2996 != -1 || var21.field2990 != -1) {
                        class37.method296(var18, var18.field2236 + 15, 62);
                        if (class11.field324 > -1) {
                            if (var21.field2996 != -1) {
                                class115.field2891[var21.field2996].method860(class11.field324 - 12, -var22 + class42.field1136);
                                var22 += 25;
                            }
                            if (var21.field2990 != -1) {
                                class84.field2125[var21.field2990].method860(class11.field324 - 12, -var22 + class42.field1136);
                                var22 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class64.field1685 == 10 && class14.field435[var1] == class132.field3317) {
                        class37.method296(var18, var18.field2236 + 15, 85);
                        if (class11.field324 > -1) {
                            class31.field865[1].method860(class11.field324 - 12, -var22 + class42.field1136);
                        }
                    }
                }
                if (var18.field2285 != null && (var1 >= class63.field1661 || class133.field3342 == 0 || class133.field3342 == 3 || class133.field3342 == 1 && class115.method978(97, ((class118) var18).field3025))) {
                    class37.method296(var18, var18.field2236, 103);
                    if (class11.field324 > -1 && class112.field2802 > class122.field3123) {
                        class112.field2798[class122.field3123] = class58.field1553.method357(var18.field2285) / 2;
                        class112.field2794[class122.field3123] = class58.field1553.field1201;
                        class112.field2795[class122.field3123] = class11.field324;
                        class112.field2804[class122.field3123] = class42.field1136;
                        class112.field2805[class122.field3123] = var18.field2256;
                        class112.field2799[class122.field3123] = var18.field2269;
                        class112.field2803[class122.field3123] = var18.field2250;
                        class112.field2797[class122.field3123] = var18.field2285;
                        class122.field3123++;
                    }
                }
                if (var18.field2222 > class49.field1308) {
                    class37.method296(var18, var18.field2236 + 15, 51);
                    if (class11.field324 > -1) {
                        int var23 = var18.field2230 * 30 / var18.field2221;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class17.method133(class11.field324 - 15, class42.field1136 + -3, var23, 5, 65280);
                        class17.method133(class11.field324 + var23 - 15, class42.field1136 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field2278[var24] > class49.field1308) {
                        class37.method296(var18, var18.field2236 / 2, 63);
                        if (class11.field324 > -1) {
                            if (var24 == 1) {
                                class42.field1136 -= 20;
                            }
                            if (var24 == 2) {
                                class11.field324 -= 15;
                                class42.field1136 -= 10;
                            }
                            if (var24 == 3) {
                                class11.field324 += 15;
                                class42.field1136 -= 10;
                            }
                            class82.field2079[var18.field2303[var24]].method860(class11.field324 - 12, class42.field1136 + -12);
                            class114.field2860.method343(class78.method676(var18.field2259[var24], -128), class11.field324 - 1, class42.field1136 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var2 = 0;
        if (arg0 < 6) {
            return;
        }
        while (var2 < class122.field3123) {
            int var3 = class112.field2795[var2];
            int var4 = class112.field2804[var2];
            int var5 = class112.field2798[var2];
            int var6 = class112.field2794[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class112.field2804[var17] - class112.field2794[var17] < var4 + 2 && class112.field2804[var17] + 2 > -var6 + var4 && class112.field2795[var17] + class112.field2798[var17] > -var5 + var3 && var3 + var5 > class112.field2795[var17] + -class112.field2798[var17] && var4 > class112.field2804[var17] - class112.field2794[var17]) {
                        var4 = class112.field2804[var17] - class112.field2794[var17];
                        var7 = true;
                    }
                }
            }
            class11.field324 = class112.field2795[var2];
            class42.field1136 = class112.field2804[var2] = var4;
            class73 var8 = class112.field2797[var2];
            if (class142.field3544 == 0) {
                int var9 = 16776960;
                if (class112.field2805[var2] < 6) {
                    var9 = class109.field2680[class112.field2805[var2]];
                }
                if (class112.field2805[var2] == 6) {
                    var9 = class42.field1139 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class112.field2805[var2] == 7) {
                    var9 = class42.field1139 % 20 >= 10 ? 65535 : 255;
                }
                if (class112.field2805[var2] == 8) {
                    var9 = class42.field1139 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class112.field2805[var2] == 9) {
                    int var10 = 150 - class112.field2803[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class112.field2805[var2] == 10) {
                    int var11 = 150 - class112.field2803[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16384000 + 16711935 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 + 255 - (var11 - 100) * 5 - 32768000;
                    }
                }
                if (class112.field2805[var2] == 11) {
                    int var12 = 150 - class112.field2803[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 16777215 + 32768000 - var12 * 327680;
                    }
                }
                if (class112.field2799[var2] == 0) {
                    class58.field1553.method343(var8, class11.field324, class42.field1136, var9, 0);
                }
                if (class112.field2799[var2] == 1) {
                    class58.field1553.method340(var8, class11.field324, class42.field1136, var9, 0, class42.field1139);
                }
                if (class112.field2799[var2] == 2) {
                    class58.field1553.method344(var8, class11.field324, class42.field1136, var9, 0, class42.field1139);
                }
                if (class112.field2799[var2] == 3) {
                    class58.field1553.method350(var8, class11.field324, class42.field1136, var9, 0, class42.field1139, 150 - class112.field2803[var2]);
                }
                if (class112.field2799[var2] == 4) {
                    int var13 = class58.field1553.method357(var8);
                    int var14 = (150 - class112.field2803[var2]) * (var13 + 100) / 150;
                    class17.method143(class11.field324 - 50, 0, class11.field324 + 50, 334);
                    class58.field1553.method355(var8, class11.field324 + 50 - var14, class42.field1136, var9, 0);
                    class17.method135();
                }
                if (class112.field2799[var2] == 5) {
                    int var15 = 150 - class112.field2803[var2];
                    class17.method143(0, class42.field1136 - class58.field1553.field1201 - 1, 512, class42.field1136 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class58.field1553.method343(var8, class11.field324, class42.field1136 + var16, var9, 0);
                    class17.method135();
                }
            } else {
                class58.field1553.method343(var8, class11.field324, class42.field1136, 16776960, 0);
            }
            var2++;
        }
    }
}
