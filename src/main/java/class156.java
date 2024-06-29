import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class156 extends class174 {

    @OriginalMember(owner = "client!j", name = "E", descriptor = "Lci;")
    public static class327 field2468 = new class327();

    @OriginalMember(owner = "client!j", name = "I", descriptor = "[I")
    public static int[] field2472 = new int[128];

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field2473 = -1;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Z")
    public static boolean field2471 = false;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Lml;")
    public static class17 field2469;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "Lth;")
    public static class57 field2474;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "[Lwf;")
    public static class250[] field2470;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lwf;III)V", line = 11)
    public static final void method1215(class250 arg0, int arg1, int arg2, int arg3) {
        field2467++;
        if (arg0.field4162 == 1) {
            class13.field143++;
            class55.method434(arg0.field4167, -1, false, 0L, "", 0, arg0.field4180, (short) 6);
        }
        if (arg0.field4162 == 2 && !class227.field3789) {
            String var4 = class55.method432(arg0, (byte) -108);
            if (var4 != null) {
                class334.field5296++;
                class55.method434(arg0.field4167, -1, false, 0L, "<col=00ff00>" + arg0.field4094, -1, var4, (short) 24);
            }
        }
        if (arg0.field4162 == 3) {
            class55.method434(arg0.field4167, -1, false, 0L, "", 0, class318.field5067, (short) 9);
            class271.field4502++;
        }
        if (arg0.field4162 == 4) {
            class327.field5208++;
            class55.method434(arg0.field4167, -1, false, 0L, "", 0, arg0.field4180, (short) 14);
        }
        if (arg0.field4162 == 5) {
            class343.field5460++;
            class55.method434(arg0.field4167, -1, false, 0L, "", 0, arg0.field4180, (short) 47);
        }
        if (arg3 != 20863) {
            return;
        }
        if (arg0.field4162 == 6 && class187.field3005 == null) {
            class55.method434(arg0.field4167, -1, false, 0L, "", -1, arg0.field4180, (short) 31);
            class104.field1677++;
        }
        if (arg0.field4078 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field4113; var6++) {
                for (int var7 = 0; var7 < arg0.field4200; var7++) {
                    int var8 = (arg0.field4196 + 32) * var6;
                    int var9 = (arg0.field4169 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg0.field4075[var5];
                        var9 += arg0.field4110[var5];
                    }
                    if (arg1 >= var9 && arg2 >= var8 && (var9 + 32) > arg1 && arg2 < (var8 + 32)) {
                        class170.field2694 = var5;
                        class14.field149 = arg0;
                        if (arg0.field4233[var5] > 0) {
                            class105 var10 = client.method336(arg0);
                            class52 var11 = class6.method22(arg0.field4233[var5] - 1, 16430);
                            if (class16.field186 == 1 && var10.method809(-2142398602)) {
                                if (class77.field1345 != arg0.field4167 || class17.field202 != var5) {
                                    class55.method434(arg0.field4167, -1, false, (long) var11.field823, class233.field3881 + " -> <col=ff9040>" + var11.field871, var5, class117.field1953, (short) 11);
                                    class314.field5010++;
                                }
                            } else if (class227.field3789 && var10.method809(-2142398602)) {
                                class350 var12 = class245.field4015 == -1 ? null : class113.method861((byte) 115, class245.field4015);
                                if ((class6.field48 & 0x10) != 0 && (var12 == null || var11.method402(var12.field5554, class245.field4015, (byte) -2) != var12.field5554)) {
                                    class131.field2208++;
                                    class55.method434(arg0.field4167, class104.field1690, false, (long) var11.field823, class178.field2851 + " -> <col=ff9040>" + var11.field871, var5, class324.field5160, (short) 20);
                                }
                            } else {
                                class313.field4979++;
                                String[] var13 = var11.field845;
                                if (class348.field5530) {
                                    var13 = class356.method2515(1, var13);
                                }
                                if (var10.method809(-2142398602)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 60;
                                            } else {
                                                var15 = 57;
                                            }
                                            class288.field4682++;
                                            class55.method434(arg0.field4167, -1, false, (long) var11.field823, "<col=ff9040>" + var11.field871, var5, var13[var14], var15);
                                        }
                                    }
                                }
                                if (var10.method815(true)) {
                                    class55.method434(arg0.field4167, class129.field2193, false, (long) var11.field823, "<col=ff9040>" + var11.field871, var5, class117.field1953, (short) 33);
                                    class180.field2880++;
                                }
                                if (var10.method809(arg3 ^ 0x804DC609) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class352.field5580++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 38;
                                            }
                                            if (var16 == 1) {
                                                var17 = 42;
                                            }
                                            if (var16 == 2) {
                                                var17 = 25;
                                            }
                                            class55.method434(arg0.field4167, -1, false, (long) var11.field823, "<col=ff9040>" + var11.field871, var5, var13[var16], var17);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field4098;
                                if (class348.field5530) {
                                    var18 = class356.method2515(1, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class46.field740++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 21;
                                            }
                                            if (var19 == 1) {
                                                var20 = 17;
                                            }
                                            if (var19 == 2) {
                                                var20 = 22;
                                            }
                                            if (var19 == 3) {
                                                var20 = 41;
                                            }
                                            if (var19 == 4) {
                                                var20 = 4;
                                            }
                                            class55.method434(arg0.field4167, -1, false, (long) var11.field823, "<col=ff9040>" + var11.field871, var5, var18[var19], var20);
                                        }
                                    }
                                }
                                class55.method434(arg0.field4167, class121.field2082, false, (long) var11.field823, "<col=ff9040>" + var11.field871, var5, class327.field5198, (short) 1001);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field4205) {
            return;
        }
        if (!class227.field3789) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class358.method2520(arg0, var21, (byte) -114);
                if (var22 != null) {
                    class55.method434(arg0.field4167, class322.method2273(var21, arg0, (byte) 59), false, (long) (var21 + 1), arg0.field4074, arg0.field4229, var22, (short) 1010);
                    class184.field2961++;
                }
            }
            String var23 = class55.method432(arg0, (byte) -99);
            if (var23 != null) {
                class55.method434(arg0.field4167, -1, false, 0L, arg0.field4074, arg0.field4229, var23, (short) 24);
                class334.field5296++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class358.method2520(arg0, var24, (byte) -117);
                if (var25 != null) {
                    class55.method434(arg0.field4167, class322.method2273(var24, arg0, (byte) 84), false, (long) (var24 + 1), arg0.field4074, arg0.field4229, var25, (short) 43);
                    class184.field2961++;
                }
            }
            if (client.method336(arg0).method816(90)) {
                if (arg0.field4191 == null) {
                    class55.method434(arg0.field4167, -1, false, 0L, "", arg0.field4229, class272.field4519, (short) 31);
                } else {
                    class55.method434(arg0.field4167, -1, false, 0L, "", arg0.field4229, arg0.field4191, (short) 31);
                }
                class104.field1677++;
            }
        } else if (client.method336(arg0).method813((byte) -64) && (class6.field48 & 0x20) != 0) {
            class55.method434(arg0.field4167, class104.field1690, false, 0L, class178.field2851 + " -> " + arg0.field4074, arg0.field4229, class324.field5160, (short) 16);
            class105.field1713++;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 345)
    public static void method1216(int arg0) {
        field2474 = null;
        field2468 = null;
        field2469 = null;
        if (arg0 == -444) {
            field2470 = null;
            field2472 = null;
        }
    }
}
