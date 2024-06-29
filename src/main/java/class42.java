import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class42 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[I")
    public static int[] field492 = new int[32];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field500;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[Z")
    public static boolean[] field499;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Llc;")
    public static class175 field501;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Ltb;")
    public class234 field497;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Len;")
    public class47 field496;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZIIIB)V", line = 6)
    public static final void method243(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5) {
        field498++;
        class262.field3962++;
        class310.method2179((byte) -83);
        if (arg1) {
            class80.method478(0, false, (byte) 119, false);
        } else {
            class295.method2091(27296, 0);
            class80.method478(0, false, (byte) 124, true);
            if (class214.field3003 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class80.method478(var6, false, (byte) 60, false);
                    class80.method478(var6, true, (byte) 95, false);
                    class295.method2091(27296, var6);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class295.method2091(27296, var7);
                    class80.method478(var7, false, (byte) 66, false);
                    class80.method478(var7, true, (byte) 118, false);
                }
            }
        }
        if (!arg1) {
            class229.method1615((byte) 71);
        }
        class154.method1026((byte) -126);
        if (class250.field3787) {
            class311.method2180(arg0, arg4, arg3, true, true, arg2);
            arg2 = class100.field1316;
            arg0 = class21.field265;
            arg3 = class308.field4763;
            arg4 = class100.field1318;
        }
        if (class118.field1671 == 1) {
            int var8 = (int) class280.field4344 + class238.field3501 & 0x7FF;
            int var9 = (int) class184.field2664;
            if (var9 < client.field4233 / 256) {
                var9 = client.field4233 / 256;
            }
            if (class74.field958[4] && var9 < (class98.field1282[4] + 128)) {
                var9 = class98.field1282[4] + 128;
            }
            class89.method524(class184.method1278(class138.field1940, -13660, class118.field1664.field2357, class118.field1664.field2392) - 50, class158.field2180, var9 * 3 + 600, var8, arg0, 17699, class231.field3370, var9);
        } else if (class118.field1671 == 5) {
            class23.method151(arg0, (byte) -78);
        }
        int var10 = class130.field1792;
        int var11 = class301.field4704;
        int var12 = class109.field1506;
        int var13 = class30.field380;
        int var14 = class323.field4975;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class74.field958[var15]) {
                int var16 = (int) ((double) (-class323.field4970[var15]) + (double) (class323.field4970[var15] * 2 + 1) * Math.random() + Math.sin((double) class232.field3385[var15] / 100.0D * (double) class242.field3650[var15]) * (double) class98.field1282[var15]);
                if (var15 == 4) {
                    class30.field380 += var16;
                    if (class30.field380 < 128) {
                        class30.field380 = 128;
                    }
                    if (class30.field380 > 383) {
                        class30.field380 = 383;
                    }
                }
                if (var15 == 3) {
                    class323.field4975 = class323.field4975 + var16 & 0x7FF;
                }
                if (var15 == 1) {
                    class301.field4704 += var16;
                }
                if (var15 == 2) {
                    class109.field1506 += var16;
                }
                if (var15 == 0) {
                    class130.field1792 += var16;
                }
            }
        }
        int var17 = 37 / ((54 - arg5) / 56);
        class198.method1362(-108);
        if (class250.field3787) {
            class306.method2149(arg3, arg2, arg3 + arg4, arg2 - -arg0);
            float var18 = (float) class323.field4975 * 0.17578125F;
            float var19 = (float) class30.field380 * 0.17578125F;
            boolean var20 = false;
            if (class118.field1671 == 3) {
                var18 = class198.field2828 * 360.0F / 6.2831855F;
                var19 = class283.field4438 * 360.0F / 6.2831855F;
            }
            int var21;
            if (class17.field236 == 10) {
                var21 = class175.method1174(class109.field1506 >> 10, false, class165.field2289, class130.field1792 >> 10, class322.field4939);
            } else {
                var21 = class175.method1174(class118.field1664.field2403[0] >> 3, false, class165.field2289, class118.field1664.field2359[0] >> 3, class322.field4939);
            }
            if (class289.field4528 >= 0) {
                class250.method1824();
                class344 var22 = class115.method784(class289.field4528, class74.field949, class179.field2603, -688365168, class220.field3097);
                var22.method2377(class337.field5200, arg3, arg2, arg4, arg0, class30.field380, class323.field4975, var21);
            } else {
                class250.method1793(var21);
            }
            class250.method1810(arg3, arg2, arg4, arg0, arg3 + (arg4 / 2), arg2 - -(arg0 / 2), var19, var18, class113.field1614, class113.field1614);
            class340.method2354(255, false);
            class250.method1800();
            class250.method1794(true);
            class250.method1815(true);
        } else {
            class144.method972(arg3, arg2, arg3 + arg4, arg0 + arg2);
            class215.method1485();
            if (class289.field4528 >= 0) {
                class344 var23 = class115.method784(class289.field4528, class74.field949, class179.field2603, -688365168, class220.field3097);
                var23.method2379(class337.field5200, arg3, arg2, arg4, arg0, class30.field380, class323.field4975, 0);
            } else {
                class144.method977(arg3, arg2, arg4, arg0, 0);
            }
        }
        if (class140.field1951 || arg3 > class49.field609 || class49.field609 >= arg3 + arg4 || class229.field3340 < arg2 || class229.field3340 >= (arg0 + arg2)) {
            class239.field3584 = 0;
            class31.field395 = false;
        } else {
            class239.field3584 = 0;
            int var24 = class295.field4604;
            class31.field395 = true;
            int var25 = class232.field3388;
            int var26 = class72.field918;
            int var27 = class310.field4792;
            class117.field1654 = (var26 - var25) * (class229.field3340 - arg2) / arg0 + var25;
            class3.field42 = (class49.field609 - arg3) * (var27 - var24) / arg4 + var24;
        }
        class239.method1713(31532);
        byte var28 = class286.method2045(72) == 2 ? (byte) class262.field3962 : 1;
        if (class250.field3787) {
            class193.method1339(class38.field463, !class321.field4926);
            class285.method2041(class109.field1506, class30.field380, 0, class323.field4975, class301.field4704, class130.field1792);
            class250.field3796 = class38.field463;
            class69.method429(class130.field1792, class301.field4704, class109.field1506, class30.field380, class323.field4975, class15.field215, class322.field4946, class158.field2178, class259.field3931, class309.field4785, class312.field4829, class138.field1940 + 1, var28, class118.field1664.field2392 >> 7, class118.field1664.field2357 >> 7);
            class100.field1319 = true;
            class193.method1344();
            class285.method2041(0, 0, 0, 0, 0, 0);
            class239.method1713(31532);
            class59.method343(class113.field1614, class113.field1614, 327680, arg4, arg2, arg3, arg0);
            class38.method228(arg4, false, arg0, class113.field1614, class113.field1614, arg3, arg2);
            class138.method920();
        } else {
            class69.method429(class130.field1792, class301.field4704, class109.field1506, class30.field380, class323.field4975, class15.field215, class322.field4946, class158.field2178, class259.field3931, class309.field4785, class312.field4829, class138.field1940 + 1, var28, class118.field1664.field2392 >> 7, class118.field1664.field2357 >> 7);
            class239.method1713(31532);
            class138.method920();
            class59.method343(256, 256, 327680, arg4, arg2, arg3, arg0);
            class38.method228(arg4, false, arg0, 256, 256, arg3, arg2);
        }
        ((class63) class215.field3020).method366(-3624, class322.field4939);
        class249.method1789(arg0, arg2, arg3, arg4, -88);
        class301.field4704 = var11;
        class323.field4975 = var14;
        class109.field1506 = var12;
        class130.field1792 = var10;
        class30.field380 = var13;
        if (class284.field4457 && class22.field283.method949(-110) == 0) {
            class284.field4457 = false;
        }
        if (class284.field4457) {
            if (class250.field3787) {
                class306.method2154(arg3, arg2, arg4, arg0, 0);
            } else {
                class144.method977(arg3, arg2, arg4, arg0, 0);
            }
            class23.method154((byte) -32, class163.field2251, false);
        }
        if (!arg1 && !class284.field4457 && !class140.field1951 && class49.field609 >= arg3 && class49.field609 < arg3 + arg4 && class229.field3340 >= arg2 && arg0 + arg2 > class229.field3340) {
            class236.method1679(arg0, arg2, class49.field609, -1, arg3, class229.field3340, arg4);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 270)
    public static void method244(int arg0) {
        if (arg0 <= 59) {
            field492 = (int[]) null;
        }
        field501 = null;
        field492 = null;
        field500 = null;
        field499 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 286)
    public static final void method245(String arg0, int arg1, Throwable arg2) {
        field491++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class238.method1694(arg2, false);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class253.method1841((byte) 115, var3);
            String var4 = class56.method333(0, var3, ":", "%3a");
            String var5 = class56.method333(0, var4, "@", "%40");
            String var6 = class56.method333(0, var5, "&", "%26");
            String var7 = class56.method333(0, var6, "#", "%23");
            if (class45.field536.field4179 == null) {
                return;
            }
            class18 var8 = class45.field536.method1922(new URL(class45.field536.field4179.getCodeBase(), "clienterror.ws?c=" + class205.field2877 + "&u=" + class267.field4208 + "&v1=" + class265.field4175 + "&v2=" + class265.field4170 + "&e=" + var7), (byte) 125);
            while (var8.field238 == 0) {
                class81.method485(1L, 1);
            }
            if (var8.field238 == arg1) {
                DataInputStream var9 = (DataInputStream) var8.field241;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field492[var1] = var0 - 1;
            var0 += var0;
        }
        field500 = "cyan:";
        field499 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIZI)V", line = 362)
    public static final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field495++;
        int var10 = arg4 - arg0;
        int var11 = arg5 - arg1;
        int var12 = (arg3 - arg6 << 16) / var10;
        int var13 = (arg9 - arg7 << 16) / var11;
        class224.method1543(arg4, 0, var12, arg1, arg2 + arg2, arg8, arg6, arg5, 0, var13, arg7, arg0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I", line = 390)
    public static final int method247(int arg0, int arg1, int arg2) {
        field493++;
        int var3 = arg0 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + arg1 & Integer.MAX_VALUE;
        return (var5 & 0x7F9058B) >> 19;
    }
}
