import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class136 {

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public int field1549 = -1;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "Lvw;")
    public static class274 field1555 = new class274();

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Lnk;")
    public class654 field1548;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "[I")
    public int[] field1550;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "[I")
    public static int[] field1556;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field1552;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lrt;III)V", line = 6)
    public static final void method760(class208 arg0, int arg1, int arg2, int arg3) {
        field1546++;
        if (arg0 == null || class530.field7597.field7992 == arg0) {
            return;
        }
        int var4 = arg0.field2533;
        int var5 = arg0.field2523;
        int var6 = arg0.field2527;
        int var7 = (int) arg0.field2524;
        long var8 = arg0.field2524;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 50) {
            class382 var10 = class657.method3708(var4, (byte) -57, var5);
            if (var10 != null) {
                class420.method2278(5580);
                class264 var11 = client.method1530(var10);
                class396.method2168(var11.field3336, var11.method1495((byte) 116), (byte) 91, var10);
                class419.field5567 = class236.method1370(-1, var10);
                if (class419.field5567 == null) {
                    class419.field5567 = "Null";
                }
                class182.field2231 = var10.field5007 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 59) {
            class232.field2956 = 2;
            class329.field4268 = 0;
            class517.field7392++;
            class568.field8060 = arg1;
            class519.field7418 = arg2;
            class480.method2802(class679.field9618, 16751);
            class334.field4314.method2540(var7, 114);
            class334.field4314.method2570(class653.field9339.method1805((byte) -59, 82) ? 1 : 0, (byte) -70);
            class334.field4314.method2537(18244, var4 + class682.field9685);
            class334.field4314.method2566(class146.field1642 + var5, true);
            class689.method3825(var4, var5, (byte) 5);
        }
        if (var6 == 5) {
            class232.field2956 = 2;
            class329.field4268 = 0;
            class519.field7418 = arg2;
            class433.field5711++;
            class568.field8060 = arg1;
            class480.method2802(class377.field4900, 16751);
            class334.field4314.method2566(class146.field1642 + var5, true);
            class334.field4314.method2537(18244, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class334.field4314.method2530(class653.field9339.method1805((byte) -88, 82) ? 1 : 0, -932621016);
            class334.field4314.method2537(18244, class682.field9685 + var4);
            class389.method2128(-120, var5, var4, var8);
        }
        if (var6 == 16) {
            class455 var12 = class362.field4726[var7];
            if (var12 != null) {
                class232.field2956 = 2;
                class488.field7086++;
                class568.field8060 = arg1;
                class329.field4268 = 0;
                class519.field7418 = arg2;
                class480.method2802(class679.field9617, 16751);
                class334.field4314.method2521(-1531903640, var7);
                class334.field4314.method2570(class653.field9339.method1805((byte) -59, 82) ? 1 : 0, (byte) -101);
                class671.method3764(var12.method1656(true), var12.method1656(true), var12.field3839[0], 0, 0, -2, var12.field3841[0], true, (byte) -123);
            }
        }
        if (var6 == 9) {
            if (class295.field3874 > 0 && class653.field9339.method1805((byte) -123, 82) && class653.field9339.method1805((byte) -114, 81)) {
                class195.method1126(class377.field4914.field4638, 26735, class682.field9685 + var4, class146.field1642 + var5);
            } else {
                class424.method2292(var7, var4, (byte) -59, var5);
                if (var7 == 1) {
                    class334.field4314.method2525(-1, -81849);
                    class334.field4314.method2525(-1, -81849);
                    class334.field4314.method2537(18244, (int) class90.field1041);
                    class334.field4314.method2525(57, -81849);
                    class334.field4314.method2525(class628.field8908, -81849);
                    class334.field4314.method2525(class599.field8520, -81849);
                    class334.field4314.method2525(89, -81849);
                    class334.field4314.method2537(18244, class377.field4914.field4641);
                    class334.field4314.method2537(18244, class377.field4914.field4647);
                    class334.field4314.method2525(63, -81849);
                } else {
                    class568.field8060 = arg1;
                    class329.field4268 = 0;
                    class232.field2956 = 1;
                    class519.field7418 = arg2;
                }
                class671.method3764(1, 1, var4, 0, 0, -4, var5, true, (byte) -37);
            }
        }
        if (var6 == 18) {
            class402.field5358++;
            class232.field2956 = 1;
            class568.field8060 = arg1;
            class329.field4268 = 0;
            class519.field7418 = arg2;
            class480.method2802(class209.field2537, 16751);
            class334.field4314.method2521(-1531903640, class682.field9685 + var4);
            class334.field4314.method2566(class292.field3767, true);
            class334.field4314.method2537(18244, class146.field1642 + var5);
            class334.field4314.method2566(class420.field5591, true);
            class334.field4314.method2511(class411.field5451, true);
            class671.method3764(1, 1, var4, 0, 0, -4, var5, true, (byte) -80);
        }
        if (var6 == 10) {
            class443 var13 = (class443) class392.field5223.method3234((byte) -91, (long) var7);
            if (var13 != null) {
                class250.field3206++;
                class232.field2956 = 2;
                class329.field4268 = 0;
                class568.field8060 = arg1;
                class625 var14 = var13.field6107;
                class519.field7418 = arg2;
                class480.method2802(class133.field1496, 16751);
                class334.field4314.method2530(class653.field9339.method1805((byte) -62, 82) ? 1 : 0, -932621016);
                class334.field4314.method2521(-1531903640, var7);
                class671.method3764(var14.method1656(true), var14.method1656(true), var14.field3839[0], 0, 0, -2, var14.field3841[0], true, (byte) -109);
            }
        }
        if (var6 == 4) {
            class455 var15 = class362.field4726[var7];
            if (var15 != null) {
                class329.field4268 = 0;
                class344.field4475++;
                class232.field2956 = 2;
                class568.field8060 = arg1;
                class519.field7418 = arg2;
                class480.method2802(class379.field4918, 16751);
                class334.field4314.method2546(true, class653.field9339.method1805((byte) -71, 82) ? 1 : 0);
                class334.field4314.method2537(18244, class420.field5591);
                class334.field4314.method2566(class292.field3767, true);
                class334.field4314.method2566(var7, true);
                class334.field4314.method2523(class411.field5451, (byte) 47);
                class671.method3764(var15.method1656(true), var15.method1656(true), var15.field3839[0], 0, 0, -2, var15.field3841[0], true, (byte) -126);
            }
        }
        if (var6 == 17) {
            class455 var16 = class362.field4726[var7];
            if (var16 != null) {
                class443.field6108++;
                class232.field2956 = 2;
                class329.field4268 = 0;
                class519.field7418 = arg2;
                class568.field8060 = arg1;
                class480.method2802(class469.field6546, 16751);
                class334.field4314.method2570(class653.field9339.method1805((byte) -72, 82) ? 1 : 0, (byte) -86);
                class334.field4314.method2566(var7, true);
                class671.method3764(var16.method1656(true), var16.method1656(true), var16.field3839[0], 0, 0, -2, var16.field3841[0], true, (byte) -126);
            }
        }
        if (var6 == 3) {
            class568.field8060 = arg1;
            class304.field3980++;
            class329.field4268 = 0;
            class232.field2956 = 2;
            class519.field7418 = arg2;
            class480.method2802(class23.field278, 16751);
            class334.field4314.method2566(Integer.MAX_VALUE & (int) (var8 >>> 32), true);
            class334.field4314.method2521(-1531903640, var5 + class146.field1642);
            class334.field4314.method2540(class682.field9685 + var4, 87);
            class334.field4314.method2525(class653.field9339.method1805((byte) -71, 82) ? 1 : 0, -81849);
            class389.method2128(70, var5, var4, var8);
        }
        if (var6 == 22) {
            class443 var17 = (class443) class392.field5223.method3234((byte) -39, (long) var7);
            if (var17 != null) {
                class519.field7418 = arg2;
                class568.field8060 = arg1;
                class232.field2956 = 2;
                class137.field1565++;
                class625 var18 = var17.field6107;
                class329.field4268 = 0;
                class480.method2802(class88.field934, 16751);
                class334.field4314.method2525(class653.field9339.method1805((byte) -126, 82) ? 1 : 0, -81849);
                class334.field4314.method2521(-1531903640, var7);
                class671.method3764(var18.method1656(true), var18.method1656(true), var18.field3839[0], 0, 0, -2, var18.field3841[0], true, (byte) -59);
            }
        }
        if (var6 == 48) {
            class455 var19 = class362.field4726[var7];
            if (var19 != null) {
                class232.field2956 = 2;
                class535.field7648++;
                class329.field4268 = 0;
                class568.field8060 = arg1;
                class519.field7418 = arg2;
                class480.method2802(class67.field724, 16751);
                class334.field4314.method2537(18244, var7);
                class334.field4314.method2546(true, class653.field9339.method1805((byte) -97, 82) ? 1 : 0);
                class671.method3764(var19.method1656(true), var19.method1656(true), var19.field3839[0], 0, 0, -2, var19.field3841[0], true, (byte) -107);
            }
        }
        if (var6 == 57) {
            class455 var20 = class362.field4726[var7];
            if (var20 != null) {
                class568.field8060 = arg1;
                class406.field5408++;
                class329.field4268 = 0;
                class519.field7418 = arg2;
                class232.field2956 = 2;
                class480.method2802(class286.field3666, 16751);
                class334.field4314.method2546(true, class653.field9339.method1805((byte) -98, 82) ? 1 : 0);
                class334.field4314.method2540(var7, 124);
                class671.method3764(var20.method1656(true), var20.method1656(true), var20.field3839[0], 0, 0, -2, var20.field3841[0], true, (byte) -104);
            }
        }
        if (var6 == 6) {
            class433.field5710++;
            class519.field7418 = arg2;
            class232.field2956 = 2;
            class568.field8060 = arg1;
            class329.field4268 = 0;
            class480.method2802(class36.field408, 16751);
            class334.field4314.method2521(-1531903640, class146.field1642 + var5);
            class334.field4314.method2540(class682.field9685 + var4, -47);
            class334.field4314.method2570(class653.field9339.method1805((byte) -84, 82) ? 1 : 0, (byte) -63);
            class334.field4314.method2540(var7, 101);
            class689.method3825(var4, var5, (byte) 5);
        }
        if (var6 == 25) {
            class443 var21 = (class443) class392.field5223.method3234((byte) -66, (long) var7);
            if (var21 != null) {
                class330.field4275++;
                class568.field8060 = arg1;
                class232.field2956 = 2;
                class329.field4268 = 0;
                class625 var22 = var21.field6107;
                class519.field7418 = arg2;
                class480.method2802(class35.field395, 16751);
                class334.field4314.method2521(-1531903640, var7);
                class334.field4314.method2530(class653.field9339.method1805((byte) -82, 82) ? 1 : 0, -932621016);
                class671.method3764(var22.method1656(true), var22.method1656(true), var22.field3839[0], 0, 0, -2, var22.field3841[0], true, (byte) -36);
            }
        }
        if (var6 == 23) {
            class443 var23 = (class443) class392.field5223.method3234((byte) -35, (long) var7);
            if (var23 != null) {
                class625 var24 = var23.field6107;
                class63.field676++;
                class329.field4268 = 0;
                class568.field8060 = arg1;
                class519.field7418 = arg2;
                class232.field2956 = 2;
                class480.method2802(class525.field7508, 16751);
                class334.field4314.method2570(class653.field9339.method1805((byte) -114, 82) ? 1 : 0, (byte) -112);
                class334.field4314.method2540(var7, -35);
                class334.field4314.method2535(class411.field5451, true);
                class334.field4314.method2521(-1531903640, class420.field5591);
                class334.field4314.method2537(18244, class292.field3767);
                class671.method3764(var24.method1656(true), var24.method1656(true), var24.field3839[0], 0, 0, -2, var24.field3841[0], true, (byte) -100);
            }
        }
        if (var6 == 60) {
            class455 var25 = class362.field4726[var7];
            if (var25 != null) {
                class232.field2956 = 2;
                class568.field8060 = arg1;
                class477.field6944++;
                class519.field7418 = arg2;
                class329.field4268 = 0;
                class480.method2802(class169.field2026, 16751);
                class334.field4314.method2566(var7, true);
                class334.field4314.method2525(class653.field9339.method1805((byte) -61, 82) ? 1 : 0, -81849);
                class671.method3764(var25.method1656(true), var25.method1656(true), var25.field3839[0], 0, 0, -2, var25.field3841[0], true, (byte) -68);
            }
        }
        if (var6 == 51) {
            class232.field2956 = 2;
            class568.field8060 = arg1;
            class36.field406++;
            class329.field4268 = 0;
            class519.field7418 = arg2;
            class480.method2802(class550.field7858, 16751);
            class334.field4314.method2566(var5 + class146.field1642, true);
            class334.field4314.method2521(-1531903640, var7);
            class334.field4314.method2566(var4 + class682.field9685, true);
            class334.field4314.method2546(true, class653.field9339.method1805((byte) -121, 82) ? 1 : 0);
            class689.method3825(var4, var5, (byte) 5);
        }
        if (var6 == 58) {
            class306.field3997++;
            class329.field4268 = 0;
            class519.field7418 = arg2;
            class568.field8060 = arg1;
            class232.field2956 = 2;
            class480.method2802(class323.field4198, 16751);
            class334.field4314.method2521(-1531903640, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class334.field4314.method2537(18244, class146.field1642 + var5);
            class334.field4314.method2525(class653.field9339.method1805((byte) -81, 82) ? 1 : 0, -81849);
            class334.field4314.method2521(-1531903640, var4 + class682.field9685);
            class389.method2128(-103, var5, var4, var8);
        }
        if (var6 == 1011) {
            class568.field8060 = arg1;
            class329.field4268 = 0;
            class132.field1472++;
            class232.field2956 = 2;
            class519.field7418 = arg2;
            class480.method2802(class542.field7774, 16751);
            class334.field4314.method2540((int) (var8 >>> 32) & Integer.MAX_VALUE, -27);
            class334.field4314.method2530(class653.field9339.method1805((byte) -59, 82) ? 1 : 0, -932621016);
            class334.field4314.method2537(18244, class682.field9685 + var4);
            class334.field4314.method2521(-1531903640, class146.field1642 + var5);
            class389.method2128(-79, var5, var4, var8);
        }
        if (var6 == 1009) {
            class568.field8060 = arg1;
            class185.field2255++;
            class519.field7418 = arg2;
            class232.field2956 = 2;
            class329.field4268 = 0;
            class480.method2802(class462.field6422, 16751);
            class334.field4314.method2537(18244, var7);
        }
        if (var6 == 8) {
            class455 var26 = class362.field4726[var7];
            if (var26 != null) {
                class329.field4268 = 0;
                class519.field7418 = arg2;
                class232.field2956 = 2;
                class568.field8060 = arg1;
                class15.field136++;
                class480.method2802(class54.field557, 16751);
                class334.field4314.method2530(class653.field9339.method1805((byte) -127, 82) ? 1 : 0, -932621016);
                class334.field4314.method2566(var7, true);
                class671.method3764(var26.method1656(true), var26.method1656(true), var26.field3839[0], 0, 0, -2, var26.field3841[0], true, (byte) -117);
            }
        }
        if (var6 == 15) {
            class443 var27 = (class443) class392.field5223.method3234((byte) -86, (long) var7);
            if (var27 != null) {
                class625 var28 = var27.field6107;
                class249.field3196++;
                class329.field4268 = 0;
                class568.field8060 = arg1;
                class519.field7418 = arg2;
                class232.field2956 = 2;
                class480.method2802(class507.field7296, 16751);
                class334.field4314.method2540(var7, 115);
                class334.field4314.method2525(class653.field9339.method1805((byte) -128, 82) ? 1 : 0, -81849);
                class671.method3764(var28.method1656(true), var28.method1656(true), var28.field3839[0], 0, 0, -2, var28.field3841[0], true, (byte) -47);
            }
        }
        int var29 = -20 % ((65 - arg3) / 43);
        if (var6 == 20) {
            class382 var30 = class657.method3708(var4, (byte) -110, var5);
            if (var30 != null) {
                class365.method2011(var30, (byte) 126);
            }
        }
        if (var6 == 44) {
            class232.field2956 = 2;
            class568.field8060 = arg1;
            class329.field4268 = 0;
            class86.field920++;
            class519.field7418 = arg2;
            class480.method2802(class507.field7295, 16751);
            class334.field4314.method2540(class292.field3767, 96);
            class334.field4314.method2566(var7, true);
            class334.field4314.method2537(18244, var5 + class146.field1642);
            class334.field4314.method2511(class411.field5451, true);
            class334.field4314.method2546(true, class653.field9339.method1805((byte) -53, 82) ? 1 : 0);
            class334.field4314.method2537(18244, class420.field5591);
            class334.field4314.method2540(var4 + class682.field9685, 126);
            class689.method3825(var4, var5, (byte) 5);
        }
        if (var6 == 46) {
            if (class295.field3874 > 0 && class653.field9339.method1805((byte) -107, 82) && class653.field9339.method1805((byte) -63, 81)) {
                class195.method1126(class377.field4914.field4638, 26735, class682.field9685 + var4, class146.field1642 - -var5);
            } else {
                class519.field7418 = arg2;
                class232.field2956 = 1;
                class568.field8060 = arg1;
                class58.field600++;
                class329.field4268 = 0;
                class480.method2802(class16.field143, 16751);
                class334.field4314.method2521(-1531903640, class682.field9685 + var4);
                class334.field4314.method2521(-1531903640, class146.field1642 + var5);
            }
        }
        if (var6 == 11) {
            class329.field4268 = 0;
            class519.field7418 = arg2;
            class683.field9688++;
            class568.field8060 = arg1;
            class232.field2956 = 2;
            class480.method2802(class111.field1287, 16751);
            class334.field4314.method2540(class146.field1642 + var5, -92);
            class334.field4314.method2537(18244, var7);
            class334.field4314.method2570(class653.field9339.method1805((byte) -124, 82) ? 1 : 0, (byte) -115);
            class334.field4314.method2566(class682.field9685 + var4, true);
            class689.method3825(var4, var5, (byte) 5);
        }
        if (var6 == 2 || var6 == 1002) {
            class343.method1906(var5, var7, arg0.field2525, 1, var4);
        }
        if (var6 == 49) {
            class568.field8060 = arg1;
            class519.field7418 = arg2;
            class344.field4475++;
            class232.field2956 = 2;
            class329.field4268 = 0;
            class480.method2802(class379.field4918, 16751);
            class334.field4314.method2546(true, class653.field9339.method1805((byte) -78, 82) ? 1 : 0);
            class334.field4314.method2537(18244, class420.field5591);
            class334.field4314.method2566(class292.field3767, true);
            class334.field4314.method2566(class377.field4914.field3784, true);
            class334.field4314.method2523(class411.field5451, (byte) 47);
        }
        if (var6 == 1007 || var6 == 1001 || var6 == 1010 || var6 == 1006 || var6 == 1003) {
            class67.method439(var6, (byte) 112, var4, var7);
        }
        if (var6 == 1004) {
            class568.field8060 = arg1;
            class519.field7418 = arg2;
            class329.field4268 = 0;
            class232.field2956 = 2;
            class50.field528++;
            class480.method2802(class55.field566, 16751);
            class334.field4314.method2537(18244, var7);
        }
        if (var6 == 47) {
            class568.field8060 = arg1;
            class232.field2956 = 2;
            class117.field1349++;
            class329.field4268 = 0;
            class519.field7418 = arg2;
            class480.method2802(class504.field7249, 16751);
            class334.field4314.method2566(var7, true);
            class334.field4314.method2537(18244, class682.field9685 + var4);
            class334.field4314.method2530(class653.field9339.method1805((byte) -61, 82) ? 1 : 0, -932621016);
            class334.field4314.method2521(-1531903640, var5 + class146.field1642);
            class689.method3825(var4, var5, (byte) 5);
        }
        if (var6 == 19 && class418.field5557 == null) {
            class281.method1603(var5, (byte) 5, var4);
            class418.field5557 = class657.method3708(var4, (byte) -128, var5);
            class567.method3207((byte) -69, class418.field5557);
        }
        if (var6 == 21) {
            class455 var31 = class362.field4726[var7];
            if (var31 != null) {
                class519.field7418 = arg2;
                class568.field8060 = arg1;
                class232.field2956 = 2;
                class436.field6079++;
                class329.field4268 = 0;
                class480.method2802(class468.field6515, 16751);
                class334.field4314.method2537(18244, var7);
                class334.field4314.method2525(class653.field9339.method1805((byte) -51, 82) ? 1 : 0, -81849);
                class671.method3764(var31.method1656(true), var31.method1656(true), var31.field3839[0], 0, 0, -2, var31.field3841[0], true, (byte) -31);
            }
        }
        if (var6 == 45) {
            class329.field4268 = 0;
            class519.field7418 = arg2;
            class568.field8060 = arg1;
            class507.field7293++;
            class232.field2956 = 2;
            class480.method2802(class635.field8982, 16751);
            class334.field4314.method2537(18244, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class334.field4314.method2537(18244, class146.field1642 + var5);
            class334.field4314.method2540(class682.field9685 + var4, 120);
            class334.field4314.method2570(class653.field9339.method1805((byte) -111, 82) ? 1 : 0, (byte) -116);
            class389.method2128(93, var5, var4, var8);
        }
        if (var6 == 12) {
            class443 var32 = (class443) class392.field5223.method3234((byte) -109, (long) var7);
            if (var32 != null) {
                class519.field7418 = arg2;
                class329.field4268 = 0;
                class568.field8060 = arg1;
                class232.field2956 = 2;
                class625 var33 = var32.field6107;
                class625.field8847++;
                class480.method2802(class445.field6123, 16751);
                class334.field4314.method2537(18244, var7);
                class334.field4314.method2530(class653.field9339.method1805((byte) -88, 82) ? 1 : 0, -932621016);
                class671.method3764(var33.method1656(true), var33.method1656(true), var33.field3839[0], 0, 0, -2, var33.field3841[0], true, (byte) -90);
            }
        }
        if (var6 == 1012) {
            class329.field4268 = 0;
            class519.field7418 = arg2;
            class568.field8060 = arg1;
            class232.field2956 = 2;
            class443 var34 = (class443) class392.field5223.method3234((byte) -91, (long) var7);
            if (var34 != null) {
                class625 var35 = var34.field6107;
                class23 var36 = var35.field8855;
                if (var36.field229 != null) {
                    var36 = var36.method108(0, class491.field7127);
                }
                if (var36 != null) {
                    class480.method2802(class215.field2611, 16751);
                    class111.field1285++;
                    class334.field4314.method2537(18244, var36.field220);
                }
            }
        }
        if (var6 == 13) {
            class455 var37 = class362.field4726[var7];
            if (var37 != null) {
                class329.field4268 = 0;
                class568.field8060 = arg1;
                class232.field2956 = 2;
                class519.field7418 = arg2;
                class28.field342++;
                class480.method2802(class344.field4479, 16751);
                class334.field4314.method2566(var7, true);
                class334.field4314.method2525(class653.field9339.method1805((byte) -85, 82) ? 1 : 0, -81849);
                class671.method3764(var37.method1656(true), var37.method1656(true), var37.field3839[0], 0, 0, -2, var37.field3841[0], true, (byte) -94);
            }
        }
        if (var6 == 30) {
            class568.field8060 = arg1;
            class329.field4268 = 0;
            class232.field2956 = 2;
            class519.field7418 = arg2;
            class533.field7622++;
            class480.method2802(class65.field692, 16751);
            class334.field4314.method2566(class682.field9685 + var4, true);
            class334.field4314.method2570(class653.field9339.method1805((byte) -85, 82) ? 1 : 0, (byte) -93);
            class334.field4314.method2521(-1531903640, class292.field3767);
            class334.field4314.method2540(class146.field1642 + var5, 86);
            class334.field4314.method2521(-1531903640, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class334.field4314.method2511(class411.field5451, true);
            class334.field4314.method2540(class420.field5591, -26);
            class389.method2128(-67, var5, var4, var8);
        }
        if (class477.field6938) {
            class420.method2278(5580);
        }
        if (class81.field862 != null && class164.field1972 == 0) {
            class567.method3207((byte) -69, class81.field862);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIIII)V", line = 751)
    public static final void method761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1545++;
        if (class315.method1784(arg6, 4269)) {
            if (arg0 == -29365) {
                if (class461.field6408[arg6] == null) {
                    class351.method1947(class271.field3434[arg6], arg3, arg2, arg1, arg7, arg8, -1, arg5, (byte) 87, arg4);
                } else {
                    class351.method1947(class461.field6408[arg6], arg3, arg2, arg1, arg7, arg8, -1, arg5, (byte) 119, arg4);
                }
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class406.field5409[var9] = true;
            }
        } else {
            class406.field5409[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V", line = 789)
    public static final void method762(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class601.field8530.field2866 * arg2 >> 8;
        field1551++;
        if (arg1 != var4 && arg0 != -1) {
            class613.method3424(-78, class674.field9566, false, 0, var4, arg0);
            class548.field7834 = true;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljg;Z)V", line = 809)
    public static final void method763(class307 arg0, boolean arg1) {
        if (arg1) {
            field1553++;
            class312.field4030.method1752(13901);
            class312.field4030 = arg0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 821)
    public static void method764(byte arg0) {
        if (arg0 != -92) {
            method762(127, 81, -45, -7);
        }
        field1555 = null;
        field1556 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BII)Z", line = 836)
    public static final boolean method765(byte arg0, int arg1, int arg2) {
        if (arg0 != 98) {
            field1555 = null;
        }
        field1547++;
        return (arg1 & 0x800) != 0;
    }
}
