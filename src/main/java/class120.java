import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class120 {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Loa;")
    public static class98 field2693 = class38.method349(255, " x ");

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Loa;")
    private static class98 field2698 = class38.method349(255, "Select");

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Loa;")
    public static class98 field2689 = field2698;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lcc;")
    private static class18 field2697 = new class18(5000);

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Loa;")
    private static class98 field2700 = class38.method349(255, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2702 = 0;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Loa;")
    public static class98 field2703 = field2700;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lbc;")
    public static class11 field2701;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lgb;")
    public static class45 field2694;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method952(int arg0) {
        field2690++;
        try {
            if (class114.field2577 == 0) {
                if (class139.field3394 != null) {
                    class139.field3394.method283(-30232);
                    class139.field3394 = null;
                }
                class20.field443 = false;
                class36.field886 = null;
                class114.field2577 = 1;
                class115.field2591 = 0;
            }
            if (class114.field2577 == 1) {
                if (class36.field886 == null) {
                    class36.field886 = class10.field203.method578(class11.field229, class129.field2979, -13550);
                }
                if (class36.field886.field2134 == 2) {
                    throw new IOException();
                }
                if (class36.field886.field2134 == 1) {
                    class139.field3394 = new class27((Socket) class36.field886.field2130, class10.field203);
                    class114.field2577 = 2;
                    class36.field886 = null;
                }
            }
            if (class114.field2577 == 2) {
                long var1 = class112.field2503 = class80.field1744.method809(0);
                class132.field3116.field182 = 0;
                class132.field3116.method95(14, true);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class132.field3116.method95(var3, true);
                class139.field3394.method278(class132.field3116.field132, (byte) -98, 2, 0);
                class114.field2577 = 3;
                class36.field890.field182 = 0;
            }
            if (class114.field2577 == 3) {
                if (class84.field1965 != null) {
                    class84.field1965.method649((byte) -64);
                }
                if (class41.field971 != null) {
                    class41.field971.method649((byte) -76);
                }
                int var4 = class139.field3394.method281((byte) 70);
                if (class84.field1965 != null) {
                    class84.field1965.method649((byte) -68);
                }
                if (class41.field971 != null) {
                    class41.field971.method649((byte) -83);
                }
                if (var4 != 0) {
                    class44.method374(arg0 + 2, var4);
                    return;
                }
                class114.field2577 = 4;
                class36.field890.field182 = 0;
            }
            if (class114.field2577 == 4) {
                if (class36.field890.field182 < 8) {
                    int var5 = class139.field3394.method284(0);
                    if (8 - class36.field890.field182 < var5) {
                        var5 = 8 - class36.field890.field182;
                    }
                    if (var5 > 0) {
                        class139.field3394.method285(class36.field890.field182, var5, class36.field890.field132, 5000);
                        class36.field890.field182 += var5;
                    }
                }
                if (class36.field890.field182 == 8) {
                    class36.field890.field182 = 0;
                    class117.field2608 = class36.field890.method58(-12271);
                    class114.field2577 = 5;
                }
            }
            if (class114.field2577 == 5) {
                int[] var6 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), (int) (class117.field2608 >> 32), (int) class117.field2608 };
                class132.field3116.field182 = 0;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                class132.field3116.method95(10, true);
                class132.field3116.method72((byte) -46, var6[0]);
                class132.field3116.method72((byte) -101, var6[1]);
                class132.field3116.method72((byte) 78, var6[2]);
                class132.field3116.method72((byte) 76, var6[3]);
                class132.field3116.method72((byte) 107, class10.field203.field1502);
                class132.field3116.method92(true, class80.field1744.method809(0));
                class132.field3116.method85(class80.field1777, false);
                class132.field3116.method99(class147.field3576, arg0 ^ 0x57, class130.field3033);
                field2697.field182 = 0;
                if (class52.field1148 == 40) {
                    field2697.method95(18, true);
                } else {
                    field2697.method95(16, true);
                }
                field2697.method95(class132.field3116.field182 + 69, true);
                field2697.method72((byte) 79, 455);
                field2697.method95(class94.field2151 ? 1 : 0, true);
                field2697.method72((byte) -77, class132.field3172.field3031);
                field2697.method72((byte) -84, class127.field2845.field3031);
                field2697.method72((byte) -42, client.field504.field3031);
                field2697.method72((byte) -104, class14.field298.field3031);
                field2697.method72((byte) -32, class15.field310.field3031);
                field2697.method72((byte) 95, class3.field41.field3031);
                field2697.method72((byte) -70, class121.field2714.field3031);
                field2697.method72((byte) -34, class24.field589.field3031);
                field2697.method72((byte) 70, class135.field3290.field3031);
                field2697.method72((byte) 76, class57.field1270.field3031);
                field2697.method72((byte) 125, class132.field3170.field3031);
                field2697.method72((byte) 123, class3.field29.field3031);
                field2697.method72((byte) 120, class123.field2748.field3031);
                field2697.method72((byte) -92, class15.field305.field3031);
                field2697.method72((byte) -69, class94.field2142.field3031);
                field2697.method72((byte) -76, class98.field2299.field3031);
                field2697.method64((byte) -85, 0, class132.field3116.field182, class132.field3116.field132);
                class139.field3394.method278(field2697.field132, (byte) 126, field2697.field182, 0);
                class132.field3116.method176(46, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class36.field890.method176(104, var6);
                class114.field2577 = 6;
            }
            if (class114.field2577 == 6 && class139.field3394.method284(0) > 0) {
                int var8 = class139.field3394.method281((byte) 70);
                if (var8 == 21 && class52.field1148 == 20) {
                    class114.field2577 = 7;
                } else if (var8 == 2) {
                    class114.field2577 = 9;
                } else if (var8 == 15 && class52.field1148 == 40) {
                    class17.method165(256);
                    return;
                } else if (var8 == 23 && class83.field1931 < 1) {
                    class114.field2577 = 0;
                    class83.field1931++;
                } else {
                    class44.method374(-8, var8);
                    return;
                }
            }
            if (class114.field2577 == 7 && class139.field3394.method284(0) > 0) {
                class30.field702 = class139.field3394.method281((byte) 70) * 60 + 180;
                class114.field2577 = 8;
            }
            if (class114.field2577 == 8) {
                class115.field2591 = 0;
                class73.method600(class102.method840(new class98[] { class132.method1074(class30.field702 / 60, (byte) 47), class56.field1238 }, 10), true, class10.field208, class52.field1154);
                if (--class30.field702 <= 0) {
                    class114.field2577 = 0;
                }
            } else {
                if (~class114.field2577 == arg0 && class139.field3394.method284(0) >= 8) {
                    class33.field823 = class139.field3394.method281((byte) 70);
                    class31.field732 = class139.field3394.method281((byte) 70) == 1;
                    class8.field191 = class139.field3394.method281((byte) 70);
                    class8.field191 <<= 0x8;
                    class8.field191 += class139.field3394.method281((byte) 70);
                    class56.field1256 = class139.field3394.method281((byte) 70);
                    class139.field3394.method285(0, 1, class36.field890.field132, 5000);
                    class36.field890.field182 = 0;
                    class51.field1120 = class36.field890.method171((byte) 108);
                    class139.field3394.method285(0, 2, class36.field890.field132, arg0 ^ 0xFFFFEC7E);
                    class36.field890.field182 = 0;
                    class88.field2028 = class36.field890.method68(-2);
                    class114.field2577 = 10;
                }
                if (class114.field2577 != 10) {
                    class115.field2591++;
                    if (class115.field2591 > 2000) {
                        if (class83.field1931 < 1) {
                            if (class11.field229 == class105.field2416) {
                                class11.field229 = class10.field202;
                            } else {
                                class11.field229 = class105.field2416;
                            }
                            class114.field2577 = 0;
                            class83.field1931++;
                        } else {
                            class44.method374(-8, -3);
                        }
                    }
                } else if (class139.field3394.method284(0) >= class88.field2028) {
                    class36.field890.field182 = 0;
                    class139.field3394.method285(0, class88.field2028, class36.field890.field132, 5000);
                    class134.method1088((byte) 121);
                    class138.field3379 = -1;
                    class21.method194((byte) -124, false);
                    class51.field1120 = -1;
                }
            }
        } catch (IOException var9) {
            if (class83.field1931 < 1) {
                if (class11.field229 == class105.field2416) {
                    class11.field229 = class10.field202;
                } else {
                    class11.field229 = class105.field2416;
                }
                class83.field1931++;
                class114.field2577 = 0;
            } else {
                class44.method374(-8, -2);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method333(Component arg0, int arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static final void method953(boolean arg0) {
        try {
            Graphics var1 = class73.field1506.getGraphics();
            if (arg0) {
                field2703 = null;
            }
            class126.field2792.method406(32, 357, 17, var1);
        } catch (Exception var2) {
            class73.field1506.repaint();
        }
        field2691++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I")
    private static final int method954(int arg0, int arg1, int arg2, int arg3) {
        field2696++;
        int var4 = 256 - arg0;
        if (arg2 >= -83) {
            method957((byte) 49);
        }
        return ((arg1 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg0 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static final void method955(int arg0) {
        short var1 = 256;
        field2699++;
        if (class5.field71 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class5.field71 > 768) {
                    class58.field1280[var2] = method954(1024 - class5.field71, class48.field1092[var2], -95, class88.field2018[var2]);
                } else if (class5.field71 <= 256) {
                    class58.field1280[var2] = method954(256 - class5.field71, class88.field2018[var2], -110, class48.field1092[var2]);
                } else {
                    class58.field1280[var2] = class88.field2018[var2];
                }
            }
        } else if (class49.field1098 <= 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                class58.field1280[var3] = class48.field1092[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class49.field1098 > 768) {
                    class58.field1280[var4] = method954(1024 - class49.field1098, class48.field1092[var4], -123, class90.field2060[var4]);
                } else if (class49.field1098 <= 256) {
                    class58.field1280[var4] = method954(256 - class49.field1098, class90.field2060[var4], -91, class48.field1092[var4]);
                } else {
                    class58.field1280[var4] = class90.field2060[var4];
                }
            }
        }
        if (arg0 >= -94) {
            method952(116);
        }
        class7.method52(0, 9, 128, var1 + 7);
        class118.field2637.method486(0, 0);
        int var5 = 0;
        class7.method39();
        int var6 = 6885;
        for (int var7 = 1; var7 < var1 - 1; var7++) {
            int var20 = (var1 - var7) * class98.field2251[var7] / var1;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class57.field1261[var5++];
                if (var23 == 0) {
                    var6++;
                } else {
                    int var25 = 256 - var23;
                    int var26 = class58.field1280[var23];
                    int var27 = class58.field1303.field1994[var6];
                    class58.field1303.field1994[var6++] = class150.method1211(-16711936, class150.method1211(var26, 16711935) * var23 + class150.method1211(16711935, var27) * var25) + class150.method1211(16711680, class150.method1211(65280, var26) * var23 + var25 * class150.method1211(var27, 65280)) >> 8;
                }
            }
            var6 += var21 + 765 - 128;
        }
        int var8 = 7546;
        class7.method52(637, 9, 765, var1 + 7);
        int var9 = 0;
        client.field508.method486(382, 0);
        class7.method39();
        for (int var10 = 1; var10 < var1 - 1; var10++) {
            int var11 = (var1 - var10) * class98.field2251[var10] / var1;
            int var12 = var8 + var11;
            int var13 = 103 - var11;
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = class57.field1261[var9++];
                if (var15 == 0) {
                    var12++;
                } else {
                    int var16 = 256 - var15;
                    int var18 = class58.field1280[var15];
                    int var19 = class58.field1303.field1994[var12];
                    class58.field1303.field1994[var12++] = class150.method1211(class150.method1211(16711935, var18) * var15 + var16 * class150.method1211(16711935, var19), -16711936) + class150.method1211(var15 * class150.method1211(var18, 65280) + class150.method1211(65280, var19) * var16, 16711680) >> 8;
                }
            }
            var8 = var12 + 765 - var13 - var11;
            var9 += 128 - var13;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)I")
    public static final int method956(int arg0, int arg1, byte arg2) {
        field2692++;
        int var3 = class146.method1174(4, arg1 + 45365, 0, arg0 + 91923) + (class146.method1174(2, arg1 + 10294, 0, arg0 + 37821) - 128 >> 1) + (class146.method1174(1, arg1, 0, arg0) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        int var5 = -125 / ((arg2 - 28) / 42);
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method957(byte arg0) {
        int var1 = 35 / ((arg0 + 7) / 63);
        field2698 = null;
        field2694 = null;
        field2700 = null;
        field2689 = null;
        field2697 = null;
        field2701 = null;
        field2693 = null;
        field2703 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)I")
    public abstract int method332(boolean arg0);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    public static final void method958(int arg0, int arg1, int arg2) {
        if (arg1 != -16711936) {
            method957((byte) 102);
        }
        if (class27.field660 != 0 && arg2 != -1) {
            class98.method794(10000, arg2, 0, false, class27.field660, class3.field29);
            class8.field193 = true;
        }
        field2695++;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method331(Component arg0, int arg1);
}
