import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class48 extends class223 {

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    private int field795 = -1;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "[I")
    public static int[] field792 = new int[50];

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field793 = 0;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
    public static volatile int field794 = -1;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "Lpf;")
    public static class305 field787 = new class305(8);

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field797 = "glow2:";

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "[I")
    private int[] field785;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)Z")
    public static final boolean method401(int arg0, int arg1) {
        ++field779;
        if (class153.field2257[arg1]) {
            return true;
        } else if (!class125.field1878.method727(arg1, -56)) {
            return false;
        } else {
            int var2 = class125.field1878.method700((byte) -126, arg1);
            if (var2 == 0) {
                class153.field2257[arg1] = true;
                return true;
            } else {
                if (class8.field144[arg1] == null) {
                    class8.field144[arg1] = new class222[var2];
                }
                for (int var3 = 0; var2 > var3; ++var3) {
                    if (class8.field144[arg1][var3] == null) {
                        byte[] var4 = class125.field1878.method721((byte) -117, arg1, var3);
                        if (var4 != null) {
                            class222 var5 = class8.field144[arg1][var3] = new class222();
                            var5.field3554 = (arg1 << 16) - -var3;
                            if (~var4[0] == 0) {
                                var5.method1517(new class31(var4), 1);
                            } else {
                                var5.method1522(0, new class31(var4));
                            }
                        }
                    }
                }
                if (arg0 < 101) {
                    field797 = null;
                }
                class153.field2257[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)I")
    public static final int method402(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBIII)V")
    public static final void method403(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field796;
        if (~class298.field4807 > -101) {
            class113.method841(arg1 + 17799);
        }
        class66.method524(arg0, arg4, arg0 + arg2, arg3 + arg4);
        if (~class298.field4807 > -101) {
            byte var5 = 20;
            int var6 = arg2 / 2 + arg0;
            int var7 = arg3 / 2 + arg4 + -18 + -var5;
            class66.method532(arg0, arg4, arg2, arg3, 0);
            class66.method533(var6 - 152, var7, 304, 34, 9179409);
            class66.method533(var6 + -151, var7 - -1, 302, 32, 0);
            class66.method532(var6 - 150, var7 - -2, class298.field4807 * 3, 30, 9179409);
            class66.method532(class298.field4807 * 3 + var6 + -150, var7 + 2, -(class298.field4807 * 3) + 300, 30, 0);
            class73.field1118.method1808(class180.field2828, var6, var5 + var7, 16777215, -1);
        } else {
            class293.field4540 = -((int) ((float) arg2 / class247.field3932)) + class129.field1920;
            class104.field1619 = -((int) ((float) arg3 / class247.field3932)) + class175.field2698;
            class117.field1784 = (int) ((float) (arg3 * 2) / class247.field3932);
            int var8 = class129.field1920 - (int) ((float) arg2 / class247.field3932);
            class266.field4203 = (int) ((float) (arg2 * 2) / class247.field3932);
            int var9 = (int) ((float) arg3 / class247.field3932) + class175.field2698;
            int var10 = (int) ((float) arg2 / class247.field3932) + class129.field1920;
            int var11 = class175.field2698 - (int) ((float) arg3 / class247.field3932);
            class78.method614(arg0, arg3 + arg4, arg4, (byte) -19, var11, var10, arg0 - -arg2, var9, var8);
            class290.method1930(arg4 - -arg3, var11, arg0, var8, arg0 - -arg2, var10, class272.field4344, arg4, arg1 + -34, var9);
            class133.method987(arg0, -10531, var9, arg4, var8, var11, arg0 - -arg2, var10, arg4 - -arg3);
            if (arg1 != 34) {
                method404(-82, (byte) -122);
            }
            if (~class105.field1644 < -1) {
                --class308.field4935;
                if (class308.field4935 == 0) {
                    --class105.field1644;
                    class308.field4935 = 20;
                }
            }
            if (class86.field1276) {
                int var12 = arg0 + -5 + arg2;
                int var13 = arg3 + arg4 + -8;
                class276.field4391.method1794("Fps:" + class202.field3124, var12, var13, 16776960, -1);
                int var17 = var13 - 15;
                Runtime var14 = Runtime.getRuntime();
                int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
                int var16 = 16776960;
                if (~var15 < -65537) {
                    var16 = 16711680;
                }
                class276.field4391.method1794("Mem:" + var15 + "k", var12, var17, var16, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)Z")
    public static final boolean method404(int arg0, byte arg1) {
        ++field782;
        class98 var2 = class41.method358(arg0, (byte) 124);
        if (arg1 < 118) {
            method404(-22, (byte) -77);
        }
        if (var2 == null) {
            return false;
        } else if (~class4.field60 != -2 && class4.field60 != 2 && class110.field1709 != 2) {
            String var3 = "";
            if (~class110.field1709 != -1) {
                var3 = ":" + (var2.field1565 + 7000);
            }
            String var4 = "";
            if (class253.field4038 != null) {
                var4 = "/p=" + class253.field4038;
            }
            String var5 = "http://" + var2.field1562 + var3 + "/l=" + class130.field1939 + "/a=" + class178.field2734 + var4 + "/j" + (!class62.field983 ? "0" : "1") + ",o" + (class298.field4809 ? "1" : "0") + ",a2,m" + (class240.field3815 ? "1" : "0");
            try {
                class214.field3283.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class49.field807 = var2.field1565;
            class214.field3286 = var2.field1562;
            if (class110.field1709 != 0) {
                class270.field4283 = class49.field807 + 40000;
                class235.field3707 = class49.field807 + 50000;
                class153.field2259 = class270.field4283;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)I")
    public final int method405(byte arg0) {
        if (arg0 != -90) {
            this.method135(24, 60);
        }
        ++field788;
        return this.field795;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(II)V")
    public static final void method406(int arg0, int arg1) {
        ++field791;
        if (arg1 >= 0) {
            int var2 = class49.field803[arg1];
            int var3 = (int) class266.field4210[arg1];
            int var4 = class86.field1282[arg1];
            int var5 = class240.field3812[arg1];
            long var6 = class266.field4210[arg1];
            if (~var4 <= -2001) {
                var4 -= 2000;
            }
            if (var4 == 1) {
                class259.field4106 = 2;
                class26.field447 = class240.field3829;
                class274.field4368 = 0;
                ++class62.field968;
                class207.field3206 = class73.field1126;
                class240.field3826.method1762(109, true);
                class240.field3826.method305(class292.field4537[82] ? 1 : 0, true);
                class240.field3826.method274(27071, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class240.field3826.method274(27071, class159.field2379 + var5);
                class240.field3826.method264(-127, class138.field2072 + var2);
            }
            if (var4 == 49 || ~var4 == -1004) {
                class70.method563(var3, var5, (byte) 14, class148.field2196[arg1], var2);
            }
            if (var4 == 50) {
                class136 var8 = class233.field3682[var3];
                if (var8 != null) {
                    class26.field447 = class240.field3829;
                    class274.field4368 = 0;
                    ++class30.field500;
                    class259.field4106 = 2;
                    class207.field3206 = class73.field1126;
                    class240.field3826.method1762(79, true);
                    class240.field3826.method281((byte) -126, class293.field4549);
                    class240.field3826.method311((byte) -95, !class292.field4537[82] ? 0 : 1);
                    class240.field3826.method274(27071, class116.field1779);
                    class240.field3826.method269(class268.field4249, 1925320920);
                    class240.field3826.method274(27071, var3);
                }
            }
            if (var4 == 18) {
                class136 var9 = class233.field3682[var3];
                if (var9 != null) {
                    class207.field3206 = class73.field1126;
                    class274.field4368 = 0;
                    class26.field447 = class240.field3829;
                    class259.field4106 = 2;
                    ++class163.field2465;
                    class240.field3826.method1762(99, true);
                    class240.field3826.method307(class292.field4537[82] ? 1 : 0, -129);
                    class240.field3826.method264(-101, var3);
                }
            }
            if (~var4 == -16) {
                class240.field3826.method1762(172, true);
                class240.field3826.method301(128, var3);
                class240.field3826.method274(27071, var2);
                ++class178.field2731;
                class240.field3826.method257(770601592, var5);
                class72.field1111 = 0;
                class149.field2217 = class169.method1217(var5, 12180);
                class9.field163 = var2;
            }
            if (arg0 < 108) {
                method403(34, (byte) 73, 23, 95, 99);
            }
            if (var4 == 48) {
                class240.field3826.method1762(43, true);
                ++class130.field1940;
                class240.field3826.method281((byte) -128, var2);
                class240.field3826.method264(-103, var3);
                class240.field3826.method257(770601592, var5);
                class72.field1111 = 0;
                class149.field2217 = class169.method1217(var5, 12180);
                class9.field163 = var2;
            }
            if (~var4 == -3) {
                class26.field447 = class240.field3829;
                class259.field4106 = 2;
                class274.field4368 = 0;
                class207.field3206 = class73.field1126;
                class240.field3826.method1762(187, true);
                ++class270.field4287;
                class240.field3826.method301(128, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class240.field3826.method283(class292.field4537[82] ? 1 : 0, 24836);
                class240.field3826.method281((byte) -114, class159.field2379 + var5);
                class240.field3826.method274(27071, class138.field2072 + var2);
            }
            if (~var4 == -1008) {
                ++class301.field4852;
                class259.field4106 = 2;
                class207.field3206 = class73.field1126;
                class26.field447 = class240.field3829;
                class274.field4368 = 0;
                class240.field3826.method1762(113, true);
                class240.field3826.method305(class292.field4537[82] ? 1 : 0, true);
                class240.field3826.method264(-99, var5 - -class159.field2379);
                class240.field3826.method301(128, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class240.field3826.method301(128, class138.field2072 + var2);
            }
            if (var4 == 12) {
                if (var3 == 0) {
                    class126.field1889 = 1;
                    class241.method1649(class130.field1941, var2, var5);
                } else if (class53.field835 > 0 && class292.field4537[82] && class292.field4537[81]) {
                    class203.method1430(class159.field2379 + var5, (byte) -58, class130.field1941, class138.field2072 - -var2);
                } else {
                    class240.field3826.method1762(10, true);
                    class240.field3826.method264(-109, class159.field2379 + var5);
                    class240.field3826.method301(128, class138.field2072 - -var2);
                    ++class284.field4470;
                }
            }
            if (var4 == 44) {
                class161 var10 = class116.field1781[var3];
                if (var10 != null) {
                    class259.field4106 = 2;
                    class207.field3206 = class73.field1126;
                    ++class49.field798;
                    class274.field4368 = 0;
                    class26.field447 = class240.field3829;
                    class240.field3826.method1762(201, true);
                    class240.field3826.method307(class292.field4537[82] ? 1 : 0, -129);
                    class240.field3826.method274(27071, var3);
                }
            }
            if (~var4 == -35) {
                class136 var11 = class233.field3682[var3];
                if (var11 != null) {
                    class26.field447 = class240.field3829;
                    class207.field3206 = class73.field1126;
                    class274.field4368 = 0;
                    class259.field4106 = 2;
                    class240.field3826.method1762(94, true);
                    ++class237.field3744;
                    class240.field3826.method283(!class292.field4537[82] ? 0 : 1, 24836);
                    class240.field3826.method281((byte) -111, var3);
                }
            }
            if (var4 == 1006) {
                class274.field4368 = 0;
                class259.field4106 = 2;
                class26.field447 = class240.field3829;
                class207.field3206 = class73.field1126;
                class161 var12 = class116.field1781[var3];
                if (var12 != null) {
                    class95 var13 = var12.field2421;
                    if (var13.field1547 != null) {
                        var13 = var13.method741(94);
                    }
                    if (var13 != null) {
                        ++class277.field4405;
                        class240.field3826.method1762(143, true);
                        class240.field3826.method274(27071, var13.field1512);
                    }
                }
            }
            if (~var4 == -52) {
                ++class109.field1688;
                class207.field3206 = class73.field1126;
                class26.field447 = class240.field3829;
                class274.field4368 = 0;
                class259.field4106 = 2;
                class240.field3826.method1762(132, true);
                class240.field3826.method301(128, var2 - -class138.field2072);
                class240.field3826.method274(27071, var3);
                class240.field3826.method283(class292.field4537[82] ? 1 : 0, 24836);
                class240.field3826.method274(27071, class159.field2379 + var5);
            }
            if (var4 == 25) {
                if (var3 != 0) {
                    if (var3 == 1) {
                        ++class203.field3130;
                        class240.field3826.method1762(118, true);
                        class240.field3826.method257(770601592, class84.field1258);
                        class240.field3826.method301(128, class305.field4894);
                        class240.field3826.method301(128, class138.field2072 + var2);
                        class240.field3826.method301(128, class159.field2379 + var5);
                    }
                } else {
                    class55.field866 = 1;
                    class241.method1649(class130.field1941, var2, var5);
                }
            }
            if (~var4 == -27) {
                ++class269.field4267;
                class240.field3826.method1762(80, true);
                class240.field3826.method274(27071, var2);
                class240.field3826.method258(var5, -1527329320);
                class240.field3826.method274(27071, var3);
                class72.field1111 = 0;
                class149.field2217 = class169.method1217(var5, 12180);
                class9.field163 = var2;
            }
            if (var4 == 13) {
                class222 var14 = class77.method605(var2, var5, (byte) -32);
                if (var14 != null) {
                    class184.method1316((byte) 126);
                    class28 var15 = client.method1159(var14);
                    class235.method1613(var14.field3550, (byte) -124, var15.method232(112), var5, var2, var15.field487, var14.field3545);
                    class173.field2658 = 0;
                    class201.field3104 = class296.method1984(-1, var14);
                    if (class201.field3104 == null) {
                        class201.field3104 = "Null";
                    }
                    if (!var14.field3441) {
                        class202.field3119 = "<col=00ff00>" + var14.field3558 + "<col=ffffff>";
                        return;
                    }
                    class202.field3119 = var14.field3537 + "<col=ffffff>";
                }
            } else {
                if (~var4 == -37) {
                    class26.field447 = class240.field3829;
                    class259.field4106 = 2;
                    ++class155.field2315;
                    class207.field3206 = class73.field1126;
                    class274.field4368 = 0;
                    class240.field3826.method1762(139, true);
                    class240.field3826.method281((byte) -117, class138.field2072 + var2);
                    class240.field3826.method274(27071, class159.field2379 + var5);
                    class240.field3826.method307(!class292.field4537[82] ? 0 : 1, -129);
                    class240.field3826.method264(-99, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                }
                if (var4 == 1004) {
                    class207.field3206 = class73.field1126;
                    class26.field447 = class240.field3829;
                    class259.field4106 = 2;
                    ++class288.field4501;
                    class274.field4368 = 0;
                    class240.field3826.method1762(41, true);
                    class240.field3826.method281((byte) -108, var3);
                }
                if (~var4 == -10) {
                    class161 var16 = class116.field1781[var3];
                    if (var16 != null) {
                        class26.field447 = class240.field3829;
                        class259.field4106 = 2;
                        class274.field4368 = 0;
                        ++class45.field747;
                        class207.field3206 = class73.field1126;
                        class240.field3826.method1762(53, true);
                        class240.field3826.method281((byte) -114, var3);
                        class240.field3826.method305(!class292.field4537[82] ? 0 : 1, true);
                    }
                }
                if (var4 == 7) {
                    class78.method610((byte) 91);
                }
                if (~var4 == -22) {
                    ++class159.field2375;
                    class26.field447 = class240.field3829;
                    class259.field4106 = 2;
                    class274.field4368 = 0;
                    class207.field3206 = class73.field1126;
                    class240.field3826.method1762(226, true);
                    class240.field3826.method301(128, var3);
                    class240.field3826.method305(class292.field4537[82] ? 1 : 0, true);
                    class240.field3826.method281((byte) -123, class159.field2379 + var5);
                    class240.field3826.method274(27071, class138.field2072 + var2);
                }
                if (var4 == 30) {
                    class26.field447 = class240.field3829;
                    ++class173.field2663;
                    class207.field3206 = class73.field1126;
                    class259.field4106 = 2;
                    class274.field4368 = 0;
                    class240.field3826.method1762(90, true);
                    class240.field3826.method264(-117, var5 - -class159.field2379);
                    class240.field3826.method281((byte) -128, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class240.field3826.method264(-122, class138.field2072 + var2);
                    class240.field3826.method283(class292.field4537[82] ? 1 : 0, 24836);
                }
                if (~var4 == -25) {
                    class161 var17 = class116.field1781[var3];
                    if (var17 != null) {
                        class274.field4368 = 0;
                        ++class68.field1073;
                        class259.field4106 = 2;
                        class26.field447 = class240.field3829;
                        class207.field3206 = class73.field1126;
                        class240.field3826.method1762(97, true);
                        class240.field3826.method283(!class292.field4537[82] ? 0 : 1, 24836);
                        class240.field3826.method264(-122, var3);
                    }
                }
                if (~var4 == -59) {
                    class184.method1316((byte) 126);
                    class222 var18 = class169.method1217(var5, 12180);
                    class116.field1779 = var2;
                    class268.field4249 = var5;
                    class173.field2658 = 1;
                    class293.field4549 = var3;
                    class80.method628((byte) -114, var18);
                    class202.field3120 = "<col=ff9040>" + class123.method929(22497, var3).field2778 + "<col=ffffff>";
                    if (class202.field3120 == null) {
                        class202.field3120 = "null";
                    }
                } else {
                    if (var4 == 32) {
                        class274.field4368 = 0;
                        class207.field3206 = class73.field1126;
                        ++class283.field4465;
                        class259.field4106 = 2;
                        class26.field447 = class240.field3829;
                        class240.field3826.method1762(72, true);
                        class240.field3826.method264(-109, class116.field1779);
                        class240.field3826.method307(!class292.field4537[82] ? 0 : 1, -129);
                        class240.field3826.method264(-101, class159.field2379 + var5);
                        class240.field3826.method281((byte) -128, var2 - -class138.field2072);
                        class240.field3826.method274(27071, class293.field4549);
                        class240.field3826.method258(class268.field4249, -1527329320);
                        class240.field3826.method281((byte) -109, var3);
                    }
                    if (var4 == 35) {
                        class240.field3826.method1762(149, true);
                        ++class195.field3052;
                        class240.field3826.method274(27071, var3);
                        class240.field3826.method303((byte) -109, var5);
                        class240.field3826.method301(128, class116.field1779);
                        class240.field3826.method281((byte) -112, class293.field4549);
                        class240.field3826.method258(class268.field4249, -1527329320);
                        class240.field3826.method281((byte) -120, var2);
                        class72.field1111 = 0;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (var4 == 14) {
                        class136 var19 = class233.field3682[var3];
                        if (var19 != null) {
                            ++class62.field969;
                            class274.field4368 = 0;
                            class26.field447 = class240.field3829;
                            class259.field4106 = 2;
                            class207.field3206 = class73.field1126;
                            class240.field3826.method1762(93, true);
                            class240.field3826.method264(-115, var3);
                            class240.field3826.method311((byte) -112, !class292.field4537[82] ? 0 : 1);
                        }
                    }
                    if (~var4 == -61) {
                        class136 var20 = class233.field3682[var3];
                        if (var20 != null) {
                            class259.field4106 = 2;
                            ++class134.field2012;
                            class26.field447 = class240.field3829;
                            class274.field4368 = 0;
                            class207.field3206 = class73.field1126;
                            class240.field3826.method1762(104, true);
                            class240.field3826.method301(128, var3);
                            class240.field3826.method311((byte) -114, class292.field4537[82] ? 1 : 0);
                        }
                    }
                    if (~var4 == -44) {
                        class161 var21 = class116.field1781[var3];
                        if (var21 != null) {
                            class26.field447 = class240.field3829;
                            class274.field4368 = 0;
                            class259.field4106 = 2;
                            class207.field3206 = class73.field1126;
                            class240.field3826.method1762(199, true);
                            ++class304.field4893;
                            class240.field3826.method301(128, var3);
                            class240.field3826.method264(-124, class293.field4549);
                            class240.field3826.method281((byte) -114, class116.field1779);
                            class240.field3826.method283(!class292.field4537[82] ? 0 : 1, 24836);
                            class240.field3826.method258(class268.field4249, -1527329320);
                        }
                    }
                    if (var4 == 42) {
                        class26.field447 = class240.field3829;
                        ++class282.field4455;
                        class274.field4368 = 0;
                        class207.field3206 = class73.field1126;
                        class259.field4106 = 2;
                        class240.field3826.method1762(211, true);
                        class240.field3826.method274(27071, var2 - -class138.field2072);
                        class240.field3826.method281((byte) -115, class159.field2379 + var5);
                        class240.field3826.method281((byte) -117, var3);
                        class240.field3826.method311((byte) -114, class292.field4537[82] ? 1 : 0);
                    }
                    if (var4 == 3) {
                        ++class147.field2184;
                        class240.field3826.method1762(246, true);
                        class240.field3826.method303((byte) -93, var5);
                        class240.field3826.method301(128, var2);
                        class240.field3826.method264(-122, var3);
                        class72.field1111 = 0;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (var4 == 33) {
                        class161 var22 = class116.field1781[var3];
                        if (var22 != null) {
                            class207.field3206 = class73.field1126;
                            class259.field4106 = 2;
                            ++class88.field1390;
                            class26.field447 = class240.field3829;
                            class274.field4368 = 0;
                            class240.field3826.method1762(28, true);
                            class240.field3826.method264(-126, var3);
                            class240.field3826.method307(class292.field4537[82] ? 1 : 0, -129);
                        }
                    }
                    if (var4 == 40) {
                        class136 var23 = class233.field3682[var3];
                        if (var23 != null) {
                            ++class303.field4883;
                            class274.field4368 = 0;
                            class207.field3206 = class73.field1126;
                            class26.field447 = class240.field3829;
                            class259.field4106 = 2;
                            class240.field3826.method1762(111, true);
                            class240.field3826.method269(class84.field1258, 1925320920);
                            class240.field3826.method281((byte) -114, class305.field4894);
                            class240.field3826.method305(!class292.field4537[82] ? 0 : 1, true);
                            class240.field3826.method301(128, var3);
                        }
                    }
                    if (~var4 == -32) {
                        class259.field4106 = 2;
                        class207.field3206 = class73.field1126;
                        ++class268.field4255;
                        class26.field447 = class240.field3829;
                        class274.field4368 = 0;
                        class240.field3826.method1762(13, true);
                        class240.field3826.method281((byte) -111, var3);
                        class240.field3826.method305(!class292.field4537[82] ? 0 : 1, true);
                        class240.field3826.method274(27071, var5 - -class159.field2379);
                        class240.field3826.method301(128, class138.field2072 + var2);
                        class240.field3826.method269(class84.field1258, 1925320920);
                        class240.field3826.method264(-113, class305.field4894);
                    }
                    if (~var4 == -40) {
                        class240.field3826.method1762(174, true);
                        class240.field3826.method264(-127, var3);
                        ++class255.field4070;
                        class240.field3826.method281((byte) -112, var2);
                        class240.field3826.method258(var5, -1527329320);
                        class72.field1111 = 0;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (var4 == 22) {
                        ++class36.field623;
                        class240.field3826.method1762(47, true);
                        class240.field3826.method281((byte) -127, var3);
                        class240.field3826.method281((byte) -109, var2);
                        class240.field3826.method257(770601592, var5);
                        class72.field1111 = 0;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (~var4 == -21) {
                        ++class163.field2464;
                        class240.field3826.method1762(213, true);
                        class240.field3826.method281((byte) -112, var2);
                        class240.field3826.method301(128, var3);
                        class240.field3826.method258(var5, -1527329320);
                        class72.field1111 = 0;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (var4 == 23) {
                        class259.field4106 = 2;
                        class274.field4368 = 0;
                        ++class98.field1566;
                        class26.field447 = class240.field3829;
                        class207.field3206 = class73.field1126;
                        class240.field3826.method1762(95, true);
                        class240.field3826.method305(!class292.field4537[82] ? 0 : 1, true);
                        class240.field3826.method274(27071, class159.field2379 + var5);
                        class240.field3826.method281((byte) -118, class138.field2072 + var2);
                        class240.field3826.method257(770601592, class84.field1258);
                        class240.field3826.method274(27071, class305.field4894);
                        class240.field3826.method264(-112, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    }
                    if (var4 == 28) {
                        class136 var24 = class233.field3682[var3];
                        if (var24 != null) {
                            class274.field4368 = 0;
                            ++class173.field2666;
                            class207.field3206 = class73.field1126;
                            class259.field4106 = 2;
                            class26.field447 = class240.field3829;
                            class240.field3826.method1762(66, true);
                            class240.field3826.method311((byte) -127, class292.field4537[82] ? 1 : 0);
                            class240.field3826.method274(27071, var3);
                        }
                    }
                    if (var4 == 11) {
                        class136 var25 = class233.field3682[var3];
                        if (var25 != null) {
                            class274.field4368 = 0;
                            class259.field4106 = 2;
                            class207.field3206 = class73.field1126;
                            ++class35.field610;
                            class26.field447 = class240.field3829;
                            class240.field3826.method1762(121, true);
                            class240.field3826.method305(class292.field4537[82] ? 1 : 0, true);
                            class240.field3826.method281((byte) -121, var3);
                        }
                    }
                    if (var4 == 19) {
                        class222 var26 = class169.method1217(var5, 12180);
                        boolean var27 = true;
                        if (~var26.field3388 < -1) {
                            var27 = class15.method117(-1, var26);
                        }
                        if (var27) {
                            ++class159.field2371;
                            class240.field3826.method1762(25, true);
                            class240.field3826.method258(var5, -1527329320);
                        }
                    }
                    if (~var4 == -7) {
                        ++class195.field3060;
                        class240.field3826.method1762(214, true);
                        class240.field3826.method264(-113, var3);
                        class240.field3826.method269(var5, 1925320920);
                        class240.field3826.method301(128, var2);
                        class72.field1111 = 0;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (~var4 == -48) {
                        class240.field3826.method1762(137, true);
                        class240.field3826.method281((byte) -128, var2);
                        class240.field3826.method303((byte) -102, var5);
                        class240.field3826.method301(128, var3);
                        class72.field1111 = 0;
                        ++class8.field137;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (~var4 == -46) {
                        class161 var28 = class116.field1781[var3];
                        if (var28 != null) {
                            class26.field447 = class240.field3829;
                            class207.field3206 = class73.field1126;
                            class274.field4368 = 0;
                            ++class33.field597;
                            class259.field4106 = 2;
                            class240.field3826.method1762(63, true);
                            class240.field3826.method264(-106, var3);
                            class240.field3826.method305(class292.field4537[82] ? 1 : 0, true);
                        }
                    }
                    if (~var4 == -47) {
                        class240.field3826.method1762(25, true);
                        ++class159.field2371;
                        class240.field3826.method258(var5, -1527329320);
                        class222 var29 = class169.method1217(var5, 12180);
                        if (var29.field3566 != null && ~var29.field3566[0][0] == -6) {
                            int var30 = var29.field3566[0][1];
                            if (class257.field4090[var30] != var29.field3521[0]) {
                                class257.field4090[var30] = var29.field3521[0];
                                class170.method1227(var30, -7);
                            }
                        }
                    }
                    if (var4 == 4) {
                        class136 var31 = class233.field3682[var3];
                        if (var31 != null) {
                            class259.field4106 = 2;
                            class207.field3206 = class73.field1126;
                            class26.field447 = class240.field3829;
                            class274.field4368 = 0;
                            class240.field3826.method1762(73, true);
                            class240.field3826.method311((byte) -126, class292.field4537[82] ? 1 : 0);
                            class240.field3826.method281((byte) -120, var3);
                            ++class200.field3101;
                        }
                    }
                    if (~var4 == -42) {
                        class161 var32 = class116.field1781[var3];
                        if (var32 != null) {
                            class26.field447 = class240.field3829;
                            class274.field4368 = 0;
                            class259.field4106 = 2;
                            class207.field3206 = class73.field1126;
                            ++class26.field440;
                            class240.field3826.method1762(78, true);
                            class240.field3826.method257(770601592, class84.field1258);
                            class240.field3826.method264(-107, class305.field4894);
                            class240.field3826.method301(128, var3);
                            class240.field3826.method283(!class292.field4537[82] ? 0 : 1, 24836);
                        }
                    }
                    if (~var4 == -38) {
                        class240.field3826.method1762(196, true);
                        class240.field3826.method269(var5, 1925320920);
                        class240.field3826.method281((byte) -110, var3);
                        class240.field3826.method281((byte) -122, var2);
                        class72.field1111 = 0;
                        ++class194.field3037;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (~var4 == -11 && class260.field4115 == null) {
                        class46.method393(9255, var2, var5);
                        class260.field4115 = class77.method605(var2, var5, (byte) -32);
                        class80.method628((byte) -79, class260.field4115);
                    }
                    if (~var4 == -39) {
                        ++class91.field1423;
                        class240.field3826.method1762(153, true);
                        class240.field3826.method257(770601592, var5);
                        class240.field3826.method301(128, var2);
                        class240.field3826.method264(-108, class305.field4894);
                        class240.field3826.method303((byte) -126, class84.field1258);
                    }
                    if (~var4 == -60) {
                        class136 var33 = class233.field3682[var3];
                        if (var33 != null) {
                            class207.field3206 = class73.field1126;
                            ++class73.field1123;
                            class274.field4368 = 0;
                            class26.field447 = class240.field3829;
                            class259.field4106 = 2;
                            class240.field3826.method1762(238, true);
                            class240.field3826.method264(-104, var3);
                            class240.field3826.method305(class292.field4537[82] ? 1 : 0, true);
                        }
                    }
                    if (var4 == 5) {
                        if (var3 != 0) {
                            if (var3 == 1) {
                                if (~class53.field835 < -1 && class292.field4537[82] && class292.field4537[81]) {
                                    class203.method1430(class159.field2379 + var5, (byte) -103, class130.field1941, class138.field2072 + var2);
                                } else {
                                    class33.method329(1, 0, var5, var2);
                                    class240.field3826.method305(class236.field3729, true);
                                    class240.field3826.method305(class180.field2826, true);
                                    class240.field3826.method281((byte) -128, (int) class50.field818);
                                    class240.field3826.method305(57, true);
                                    class240.field3826.method305(class67.field1057, true);
                                    class240.field3826.method305(class285.field4487, true);
                                    class240.field3826.method305(89, true);
                                    class240.field3826.method281((byte) -111, class263.field4168.field4725);
                                    class240.field3826.method281((byte) -122, class263.field4168.field4709);
                                    class240.field3826.method305(class153.field2252, true);
                                    class240.field3826.method305(63, true);
                                }
                            }
                        } else {
                            class241.method1649(class130.field1941, var2, var5);
                        }
                    }
                    if (~var4 == -30) {
                        class259.field4106 = 2;
                        ++class54.field857;
                        class274.field4368 = 0;
                        class207.field3206 = class73.field1126;
                        class26.field447 = class240.field3829;
                        class240.field3826.method1762(167, true);
                        class240.field3826.method283(class292.field4537[82] ? 1 : 0, 24836);
                        class240.field3826.method258(class268.field4249, -1527329320);
                        class240.field3826.method301(128, class293.field4549);
                        class240.field3826.method301(128, class159.field2379 + var5);
                        class240.field3826.method264(-100, Integer.MAX_VALUE & (int) (var6 >>> 32));
                        class240.field3826.method274(27071, class138.field2072 + var2);
                        class240.field3826.method264(-119, class116.field1779);
                    }
                    if (~var4 == -1003) {
                        class26.field447 = class240.field3829;
                        ++class37.field627;
                        class207.field3206 = class73.field1126;
                        class274.field4368 = 0;
                        class259.field4106 = 2;
                        class240.field3826.method1762(102, true);
                        class240.field3826.method301(128, var3);
                    }
                    if (var4 == 1001) {
                        class222 var34 = class169.method1217(var5, 12180);
                        if (var34 != null && ~var34.field3567[var2] <= -100001) {
                            class247.method1671(0, var34.field3567[var2] + " x " + class123.method929(22497, var3).field2778, -1, "");
                        } else {
                            class240.field3826.method1762(41, true);
                            class240.field3826.method281((byte) -110, var3);
                            ++class288.field4501;
                        }
                        class72.field1111 = 0;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (var4 == 16) {
                        class26.field447 = class240.field3829;
                        class274.field4368 = 0;
                        class259.field4106 = 2;
                        class207.field3206 = class73.field1126;
                        class240.field3826.method1762(35, true);
                        class240.field3826.method281((byte) -124, class138.field2072 + var2);
                        class240.field3826.method274(27071, var3);
                        ++class15.field192;
                        class240.field3826.method307(!class292.field4537[82] ? 0 : 1, -129);
                        class240.field3826.method274(27071, var5 - -class159.field2379);
                    }
                    if (~var4 == -18) {
                        ++class159.field2371;
                        class240.field3826.method1762(25, true);
                        class240.field3826.method258(var5, -1527329320);
                        class222 var35 = class169.method1217(var5, 12180);
                        if (var35.field3566 != null && var35.field3566[0][0] == 5) {
                            int var36 = var35.field3566[0][1];
                            class257.field4090[var36] = 1 - class257.field4090[var36];
                            class170.method1227(var36, -7);
                        }
                    }
                    if (var4 == 8) {
                        ++class205.field3157;
                        class240.field3826.method1762(122, true);
                        class240.field3826.method269(var5, 1925320920);
                        class240.field3826.method264(-116, var3);
                        class240.field3826.method274(27071, var2);
                        class240.field3826.method269(class84.field1258, 1925320920);
                        class240.field3826.method274(27071, class305.field4894);
                        class72.field1111 = 0;
                        class149.field2217 = class169.method1217(var5, 12180);
                        class9.field163 = var2;
                    }
                    if (var4 == 57) {
                        class274.field4368 = 0;
                        class26.field447 = class240.field3829;
                        ++class91.field1427;
                        class259.field4106 = 2;
                        class207.field3206 = class73.field1126;
                        class240.field3826.method1762(254, true);
                        class240.field3826.method274(27071, var3);
                        class240.field3826.method264(-126, var2 - -class138.field2072);
                        class240.field3826.method264(-122, class159.field2379 + var5);
                        class240.field3826.method283(class292.field4537[82] ? 1 : 0, 24836);
                    }
                    if (~class173.field2658 != -1) {
                        class173.field2658 = 0;
                        class80.method628((byte) -81, class169.method1217(class268.field4249, 12180));
                    }
                    if (class162.field2438) {
                        class184.method1316((byte) 126);
                    }
                    if (class149.field2217 != null && ~class72.field1111 == -1) {
                        class80.method628((byte) -120, class149.field2217);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)V")
    public static final void method407(int arg0) {
        ++field781;
        class19.field265.method1172((byte) 122);
        if (arg0 > -37) {
            field793 = -102;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V")
    public static void method408(byte arg0) {
        field787 = null;
        int var1 = -36 / ((arg0 - 67) / 47);
        field797 = null;
        field792 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        if (arg0 < 0) {
            field792 = null;
        }
        ++field784;
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257 && this.method410(1)) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int var6 = (class172.field2654 == this.field790 ? arg1 : this.field790 * arg1 / class172.field2654) * this.field786;
            int[] var7 = var3[1];
            if (class250.field4008 == this.field786) {
                for (int var8 = 0; ~class250.field4008 < ~var8; ++var8) {
                    int var9 = this.field785[var6++];
                    var4[var8] = class118.method863(255, var9) << 4;
                    var7[var8] = class118.method863(var9 >> 4, 4080);
                    var5[var8] = class118.method863(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class250.field4008; ++var10) {
                    int var11 = this.field786 * var10 / class250.field4008;
                    int var12 = this.field785[var6 - -var11];
                    var4[var10] = class118.method863(var12, 255) << 4;
                    var7[var10] = class118.method863(var12 >> 4, 4080);
                    var5[var10] = class118.method863(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field795 = arg0.method260((byte) -67);
        }
        ++field783;
        if (arg2 != 102) {
            field793 = -91;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class48() {
        super(0, false);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V")
    public final void method409(int arg0) {
        if (arg0 < 64) {
            field792 = null;
        }
        ++field789;
        super.method409(71);
        this.field785 = null;
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)Z")
    private final boolean method410(int arg0) {
        ++field780;
        if (arg0 != 1) {
            method407(77);
        }
        if (this.field785 != null) {
            return true;
        } else if (~this.field795 <= -1) {
            int var2 = class172.field2654;
            int var3 = class250.field4008;
            int var4 = class9.field155.method1348(this.field795, arg0 ^ -32427).field2835 ? 64 : 128;
            this.field785 = class9.field155.method1353(false, (byte) -96, 1.0F, this.field795, var4, var4);
            this.field790 = var4;
            this.field786 = var4;
            class18.method136(1, var3, var2);
            return this.field785 != null;
        } else {
            return false;
        }
    }
}
