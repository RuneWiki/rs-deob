import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class420 {

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field5943 = 0;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static final void method2394(int arg0) {
        field5941++;
        if (class546.field7406 < arg0) {
            return;
        }
        long var1 = class680.method3756(-50);
        class546.field7406 = (int) ((long) class546.field7406 - (var1 - class550.field7449));
        if (class546.field7406 > 0) {
            int var3 = (class546.field7406 << 8) / class281.field3929;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class225.field3228 = ((class633.field8865 & 0xFF00FF) * var3 + (class334.field4896.field9388 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class633.field8865 & 0xFF00) * var3 + (class334.field4896.field9388 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            float var6 = 1.0F - var5;
            class326.field4814 = (class334.field4896.field9390 - class509.field6982) * var6 + class509.field6982;
            class624.field8697 = (class334.field4896.field9393 - class278.field3894) * var6 + class278.field3894;
            class506.field6931 = (class334.field4896.field9382 - class601.field8336) * var6 + class601.field8336;
            class269.field3826 = ((class26.field339 & 0xFF00) * var3 + (class334.field4896.field9387 & 0xFF00) * var4 & 0xFF0000) + ((class26.field339 & 0xFF00FF) * var3 + (class334.field4896.field9387 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class621.field8655 = (class334.field4896.field9394 - class64.field848) * var6 + class64.field848;
            class569.field7651 = (class334.field4896.field9389 - class121.field1677) * var6 + class121.field1677;
            class664.field9363 = (class334.field4896.field9385 - class622.field8664) * var6 + class622.field8664;
            class629.field8789 = class67.field888 * var3 + (class334.field4896.field9396 * var4) >> 8;
            if (class514.field7025 != class334.field4896.field9381) {
                class627.field8745 = class292.field4399.method317(class514.field7025, class334.field4896.field9381, var6, class627.field8745);
            }
        } else {
            class569.field7651 = class334.field4896.field9389;
            class506.field6931 = class334.field4896.field9382;
            class624.field8697 = class334.field4896.field9393;
            class269.field3826 = class334.field4896.field9387;
            class664.field9363 = class334.field4896.field9385;
            class225.field3228 = class334.field4896.field9388;
            class621.field8655 = class334.field4896.field9394;
            class326.field4814 = class334.field4896.field9390;
            class629.field8789 = class334.field4896.field9396;
            class627.field8745 = class334.field4896.field9381;
            class546.field7406 = -1;
        }
        class550.field7449 = var1;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZI)V")
    public static final void method2395(boolean arg0, int arg1) {
        field5942++;
        if (arg0) {
            if (class677.field9551 != -1) {
                class78.method611(class677.field9551, -18954);
            }
            for (class198 var2 = (class198) class368.field5262.method2066(false); var2 != null; var2 = (class198) class368.field5262.method2062(-19704)) {
                if (!var2.method2972(1)) {
                    var2 = (class198) class368.field5262.method2066(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class258.method1594(false, -102, true, var2);
            }
            class677.field9551 = -1;
            class368.field5262 = new class346(8);
            class561.method3109((byte) -110);
            class677.field9551 = class456.field6372;
            class22.method112(false, 47);
            class336.method2026(100);
            class523.method2894(class677.field9551);
        }
        class374.field5302 = "";
        class592.field8248 = "";
        class302.field4467 = false;
        class660.method3653((byte) -126);
        class130.field1787 = -1;
        class68.method557((byte) -128, class651.field9213);
        class253.field3576 = new class286();
        class253.field3576.field514 = class526.field7212 * 512 / 2;
        class253.field3576.field6483[0] = class86.field1185 / 2;
        if (arg1 < 19) {
            method2394(108);
        }
        class253.field3576.field509 = class86.field1185 * 512 / 2;
        class253.field3576.field6477[0] = class526.field7212 / 2;
        class117.field1563 = 0;
        class172.field2572 = 0;
        if (class670.field9445 == 2) {
            class172.field2572 = class663.field9356 << 9;
            class117.field1563 = class576.field7741 << 9;
        } else {
            class455.method2610(-126);
        }
        class353.method2098((byte) -101);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLql;I)V")
    public static final void method2396(boolean arg0, class674 arg1, int arg2) {
        field5944++;
        boolean var3 = arg1.method3726(1, 8) == 1;
        if (var3) {
            class93.field1229[class1.field11++] = arg2;
        }
        int var4 = arg1.method3726(2, 8);
        class286 var5 = class495.field6821[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field3961 = false;
            } else if (class27.field343 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class460 var6 = class471.field6572[arg2] = new class460();
                var6.field6506 = (var5.field6483[0] + class511.field6989 >> 6 << 14) + ((var5.field520 << 28) + (var5.field6477[0] + class124.field1726 >> 6));
                if (var5.field3994 == -1) {
                    var6.field6511 = var5.field6395.method3589(true);
                } else {
                    var6.field6511 = var5.field3994;
                }
                var6.field6503 = var5.field6391;
                var6.field6509 = var5.field3983;
                if (var5.field3979 > 0) {
                    class302.method1866(-27495, var5);
                }
                class495.field6821[arg2] = null;
                if (arg1.method3726(1, 8) != 0) {
                    class134.method956(arg1, arg2, (byte) -76);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method3726(3, 8);
            int var8 = var5.field6483[0];
            int var9 = var5.field6477[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field3971 = var8;
                var5.field3961 = true;
                var5.field3969 = var9;
            } else {
                var5.method1724(var8, class491.field6782[arg2], (byte) -81, var9);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method3726(4, 8);
            int var11 = var5.field6483[0];
            int var12 = var5.field6477[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field3969 = var12;
                var5.field3961 = true;
                var5.field3971 = var11;
            } else {
                var5.method1724(var11, class491.field6782[arg2], (byte) 103, var12);
            }
        } else {
            int var13 = arg1.method3726(1, 8);
            if (var13 == 0) {
                int var14 = arg1.method3726(12, 8);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field6483[0] + var16;
                int var19 = var5.field6477[0] + var17;
                if (var3) {
                    var5.field3961 = true;
                    var5.field3971 = var18;
                    var5.field3969 = var19;
                } else {
                    var5.method1724(var18, class491.field6782[arg2], (byte) 63, var19);
                }
                var5.field520 = (byte) (var5.field520 + var15 & 0x3);
                if (class27.field343 == arg2) {
                    class233.field3305 = var5.field520;
                }
            } else {
                int var20 = arg1.method3726(30, 8);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field6483[0] - (-class511.field6989 - var22) & 0x3FFF) - class511.field6989;
                int var25 = (var5.field6477[0] + var23 + class124.field1726 & 0x3FFF) - class124.field1726;
                if (!arg0) {
                    method2395(false, -71);
                }
                if (var3) {
                    var5.field3969 = var25;
                    var5.field3961 = true;
                    var5.field3971 = var24;
                } else {
                    var5.method1724(var24, class491.field6782[arg2], (byte) 60, var25);
                }
                var5.field520 = (byte) (var5.field520 + var21 & 0x3);
                if (class27.field343 == arg2) {
                    class233.field3305 = var5.field520;
                }
            }
        }
    }
}
