import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class130 extends class441 {

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public int field1581 = -1;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field1576 = 0;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1584 = new Rectangle[100];

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "Lth;")
    public static class355 field1582;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Ljava/lang/String;")
    public String field1573;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "Ljava/lang/String;")
    public String field1586;

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field1584[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 7)
    public static final String method802(String arg0, int arg1, String arg2, String arg3) {
        if (arg1 >= -87) {
            method806((byte) 6);
        }
        ++field1583;
        for (int var4 = arg0.indexOf(arg3); ~var4 != 0; var4 = arg0.indexOf(arg3, arg2.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 - -arg3.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 27)
    public static void method803(int arg0) {
        field1582 = null;
        if (arg0 <= 26) {
            field1582 = null;
        }
        field1584 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)Llq;", line = 39)
    public final class329 method804(byte arg0) {
        if (arg0 >= -39) {
            return null;
        } else {
            ++field1574;
            return class441.field6328[super.field6323];
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIII)I", line = 53)
    public static final int method805(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            method807((String) null, false, 29);
        }
        ++field1585;
        if (~arg2 <= ~arg3) {
            return arg1 < arg2 ? arg1 : arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V", line = 65)
    public static final void method806(byte arg0) {
        ++field1578;
        if (class318.field4509 == null) {
            class318.field4509 = new int[65536];
            double var1 = -0.015D + Math.random() * 0.03D + 0.7D;
            int var3 = 0;
            if (arg0 != -95) {
                method806((byte) 58);
            }
            while (var3 < 65536) {
                double var4 = (double) ((65212 & var3) >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) ((var3 & 977) >> 7) / 8.0D + 0.0625D;
                double var8 = (double) (127 & var3) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 - var6 * var8;
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (var20 * 3.0D < 2.0D) {
                        var10 = (var16 - var18) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                    } else {
                        var10 = var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (!(var4 * 6.0D < 1.0D)) {
                        if (var4 * 2.0D < 1.0D) {
                            var12 = var16;
                        } else if (!(var4 * 3.0D < 2.0D)) {
                            var12 = var18;
                        } else {
                            var12 = (0.6666666666666666D - var4) * (-var18 + var16) * 6.0D + var18;
                        }
                    } else {
                        var12 = (-var18 + var16) * 6.0D * var4 + var18;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (!(var24 * 2.0D < 1.0D)) {
                            if (!(var24 * 3.0D < 2.0D)) {
                                var14 = var18;
                            } else {
                                var14 = (-var18 + var16) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                            }
                        } else {
                            var14 = var16;
                        }
                    } else {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + (var33 << 8) + var34;
                class318.field4509[var3] = var35;
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 179)
    public static final void method807(String arg0, boolean arg1, int arg2) {
        ++field1580;
        if (arg2 != 10) {
            field1584 = null;
        }
        if (class237.field3389 != 0 || class135.field1685 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class151.field1866 = true;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class151.field1866 = false;
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class345.field4888 = 0;
                    class101.field1235 = 0;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class158.field2062.method2508(arg2 ^ 126);
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class392.method2498(arg2 + -8);
                    for (int var3 = 0; ~var3 > -11; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() + -var4.freeMemory()) / 1024L);
                    class397.method2538(-123, "mem=" + var5 + "k");
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class392.method2498(2);
                    for (int var6 = 0; ~var6 > -11; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class397.method2538(-125, "Memory before cleanup=" + var8 + "k");
                    class327.method2120(-26);
                    class392.method2498(2);
                    for (int var9 = 0; var9 < 10; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class397.method2538(-113, "Memory after cleanup=" + var10 + "k");
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class397.method2538(-11, "Number of player models in cache:" + class297.method1956(30));
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    if (class40.field475 == 30) {
                        class236.method1591(arg2 ^ 1045632594);
                    } else if (~class40.field475 == -26) {
                        class324.field4610 = true;
                    }
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class73.field879.method2320(0);
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class73.field879.method2323(339);
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class14.field185.method1273(false);
                    class146.field1798.method1341(arg2 ^ 16629);
                    class73.field879.method2312(true);
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class159.method1017((byte) 61);
                    class193.method1307(false);
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class432.method2714(1, (byte) 96, false, -1, -1);
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class432.method2714(2, (byte) 97, false, -1, -1);
                }
                if (arg0.equalsIgnoreCase("::wm3")) {
                    class432.method2714(3, (byte) 114, false, 768, 1024);
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class377.method2441(0, (byte) -117);
                    class140.field1736 = 0;
                    class278.method1834(class14.field185, (byte) 97);
                    class101.field1218 = false;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class377.method2441(1, (byte) -117);
                    class140.field1736 = 1;
                    class278.method1834(class14.field185, (byte) 103);
                    class101.field1218 = false;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class377.method2441(2, (byte) -117);
                    class140.field1736 = 2;
                    class278.method1834(class14.field185, (byte) 93);
                    class101.field1218 = false;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class377.method2441(3, (byte) -117);
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class20.field265 = !class20.field265;
                    class278.method1834(class14.field185, (byte) 90);
                    class101.field1218 = false;
                    class159.method1017((byte) 99);
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class222.field3117 = !class222.field3117;
                    class278.method1834(class14.field185, (byte) 126);
                    class101.field1218 = false;
                    class159.method1017((byte) 86);
                }
                if (arg0.startsWith("shadows ")) {
                    class141.field1739 = class4.method29(arg0.substring(8), arg2);
                    class278.method1834(class14.field185, (byte) 107);
                    class101.field1218 = false;
                    class159.method1017((byte) 118);
                }
                if (arg0.startsWith("setba")) {
                    class433.field6227 = class4.method29(arg0.substring(6), 10);
                    class278.method1834(class14.field185, (byte) 114);
                    class101.field1218 = false;
                }
                if (arg0.startsWith("setparticles")) {
                    class366.method2339(class4.method29(arg0.substring(13), arg2), true);
                    class278.method1834(class14.field185, (byte) 114);
                    class101.field1218 = false;
                }
                if (arg0.startsWith("fps ") && class237.field3389 != 0) {
                    class86.method467(26029, class4.method29(arg0.substring(4), 10));
                }
                if (arg0.startsWith("rect_debug")) {
                    class159.field2068 = class4.method29(arg0.substring(10).trim(), 10);
                    class397.method2538(arg2 + -131, "rect_debug=" + class159.field2068);
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class367.field5204 = true;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class434.field6242 = !class434.field6242;
                    class397.method2538(arg2 ^ -120, "clipcomponents=" + class434.field6242);
                }
                if (arg0.startsWith("bloom")) {
                    boolean var11 = class151.field1873.method647();
                    if (class288.method1881(!var11, -13981)) {
                        if (var11) {
                            class397.method2538(99, "Bloom disabled");
                        } else {
                            class397.method2538(-112, "Bloom enabled");
                        }
                    } else {
                        class397.method2538(-117, "Failed to enable bloom");
                    }
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class404.field5818) {
                        class404.field5818 = true;
                        class397.method2538(arg2 + 110, "Forced tweening ENABLED!");
                    } else {
                        class404.field5818 = false;
                        class397.method2538(91, "Forced tweening disabled.");
                    }
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (!class247.field3530) {
                        class397.method2538(-119, "Shift-click ENABLED!");
                        class247.field3530 = true;
                    } else {
                        class397.method2538(arg2 + -131, "Shift-click disabled.");
                        class247.field3530 = false;
                    }
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class397.method2538(7, "x:" + (class384.field5422.field3284 >> 7) + " z:" + (class384.field5422.field3269 >> 7));
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class397.method2538(-122, "Height: " + class161.field2122[class129.field1570].method328(class384.field5422.field3284 >> 7, class384.field5422.field3269 >> 7));
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class298.field4178.method2417(0);
                    class298.field4178.method2404((byte) -98);
                    class253.method1708(arg2 ^ 28);
                    class193.method1307(false);
                }
                if (arg0.startsWith("mc")) {
                    if (class151.field1873.method598()) {
                        int var12 = Integer.parseInt(arg0.substring(3));
                        if (~var12 <= -2) {
                            if (var12 > 4) {
                                var12 = 4;
                            }
                        } else {
                            var12 = 1;
                        }
                        class216.field3052 = var12;
                        class151.field1873.method607(class216.field3052);
                        class151.field1873.method618(0);
                        class397.method2538(-120, "Render cores now: " + class216.field3052);
                    } else {
                        class397.method2538(34, "Current toolkit doesn't support multiple cores");
                    }
                }
                if (arg0.startsWith("cachespace")) {
                    class397.method2538(arg2 ^ -128, "I(s): " + class300.field4197.method1624(-128) + "/" + class300.field4197.method1620((byte) 76));
                    class397.method2538(28, "I(m): " + class444.field6373.method1624(arg2 + -127) + "/" + class444.field6373.method1620((byte) 46));
                    class397.method2538(75, "O(s): " + class26.field322.method562((byte) 89) + "/" + class26.field322.method563(false));
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class397.method2538(-122, "Pos: " + class129.field1570 + "," + ((class334.field4730 >> 7) + class114.field1403 >> 6) + "," + ((class265.field3774 >> 7) + class41.field496 >> 6) + "," + ((class334.field4730 >> 7) + class114.field1403 & 63) + "," + (63 & (class265.field3774 >> 7) + class41.field496) + " Height: " + (class114.method709(class129.field1570, class334.field4730, 0, class265.field3774) - class276.field3925));
                    class397.method2538(-122, "Look: " + class129.field1570 + "," + (class168.field2346 + class114.field1403 >> 6) + "," + (class41.field496 + class253.field3627 >> 6) + "," + (class168.field2346 + class114.field1403 & 63) + "," + (63 & class41.field496 + class253.field3627) + " Height: " + (class114.method709(class129.field1570, class168.field2346, 0, class253.field3627) - class371.field5229));
                }
                if (arg0.equals("showocc")) {
                    class34.field390 = !class34.field390;
                    class159.method1017((byte) 91);
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class356.field5017 = !class356.field5017;
                    class151.field1873.method637(class356.field5017);
                    class264.method1759(-101);
                }
                if (arg0.equals("nonpcs")) {
                    class158.field2058 = !class158.field2058;
                }
                if (arg0.equals("autoworld")) {
                    class229.method1528(0);
                }
                if (arg0.equals("heap")) {
                    class397.method2538(arg2 + -129, "Heap: " + class268.field3812 + "MB");
                }
                if (arg0.equals("savevarcs")) {
                    class88.method487(arg2 + 11658);
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var13 = 0; var13 < class158.field2064.length; ++var13) {
                        if (class134.field1621[var13]) {
                            class158.field2064[var13] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class158.field2064[var13] *= -1;
                            }
                        }
                    }
                    class88.method487(11668);
                }
                if (arg0.equals("showcolmap")) {
                    class237.field3388 = true;
                    class193.method1307(false);
                }
                if (arg0.equals("hidecolmap")) {
                    class237.field3388 = false;
                    class193.method1307(false);
                }
                if (arg0.equals("resetcache")) {
                    class440.method2744(-19093);
                }
                if (arg0.equals("profilecpu")) {
                    class397.method2538(16, class409.method2616((byte) 94) + "ms");
                }
                if (arg0.startsWith("cpuusage")) {
                    int var14 = Integer.parseInt(arg0.substring(9));
                    if (var14 >= 0 && ~var14 >= -5) {
                        class223.field3135 = var14;
                    }
                }
                if (~class40.field475 == -31) {
                    ++class230.field3252;
                    class62.field718.method2143(113, -2);
                    class62.field718.method1583(2 + arg0.length(), (byte) -100);
                    class62.field718.method1583(!arg1 ? 0 : 1, (byte) -108);
                    class62.field718.method1596(arg0, false);
                    return;
                }
            } catch (Exception var15) {
                class397.method2538(-15, "Whoops, something went wrong.");
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lqr;B)I", line = 615)
    public static final int method808(class40 arg0, byte arg1) {
        ++field1577;
        int var2 = arg0.field456;
        class306 var3 = arg0.method2526(4);
        if (arg1 != 72) {
            field1582 = null;
        }
        if (arg0.field5613) {
            var2 = arg0.field464;
        } else if (arg0.field5640 != var3.field4335 && ~arg0.field5640 != ~var3.field4320 && ~arg0.field5640 != ~var3.field4330 && arg0.field5640 != var3.field4342) {
            if (~arg0.field5640 == ~var3.field4290 || arg0.field5640 == var3.field4319 || ~arg0.field5640 == ~var3.field4311 || ~arg0.field5640 == ~var3.field4309) {
                var2 = arg0.field473;
            }
        } else {
            var2 = arg0.field468;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII)V", line = 662)
    public static final void method809(byte arg0, int arg1, int arg2) {
        ++field1579;
        class4.field61[arg1] = arg2;
        if (arg0 != 59) {
            method802((String) null, 61, (String) null, (String) null);
        }
        class164 var3 = (class164) class281.field3985.method1888((long) arg1, (byte) -30);
        if (var3 != null) {
            var3.field2315 = class175.method1195(arg0 ^ 77) - -500L;
        } else {
            class164 var4 = new class164(500L + class175.method1195(81));
            class281.field3985.method1886(var4, (long) arg1, arg0 + -58);
        }
    }
}
