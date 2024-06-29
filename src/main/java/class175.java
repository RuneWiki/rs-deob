import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class175 extends class217 {

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2583 = 0;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Lvj;")
    public static class106 field2584 = new class106(128);

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Z")
    public static boolean field2589 = true;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "B")
    public byte field2590;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "F")
    public static float field2588;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field2591;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Ljava/lang/String;")
    public String field2586;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ljava/lang/String;")
    public String field2587;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B[[I)V", line = 5)
    public static final void method1269(byte arg0, int[][] arg1) {
        if (arg0 > -36) {
            field2589 = true;
        }
        class320.field4990 = arg1;
        field2592++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 22)
    public static void method1270(boolean arg0) {
        field2584 = null;
        if (arg0) {
            field2583 = -81;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lp;Z)V", line = 37)
    public static final void method1271(class99 arg0, boolean arg1) {
        class241.field3626.method977(4, arg0);
        while (true) {
            class99 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class99[][] var7;
            class99 var78;
            do {
                class99 var77;
                do {
                    class99 var76;
                    do {
                        class99 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class99) class241.field3626.method979(49);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1466);
                                            var3 = var2.field1487;
                                            var4 = var2.field1484;
                                            var5 = var2.field1469;
                                            var6 = var2.field1479;
                                            var7 = class250.field3746[var5];
                                            float var8 = 0.0F;
                                            if (class36.field534) {
                                                if (class41.field612 == class308.field4797) {
                                                    int var9 = class118.field1871[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class176.field2630 != var10) {
                                                        class176.field2630 = var10;
                                                        class7.method61(var10, -71);
                                                        class264.method1819(class257.method1786((byte) -14));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class110.field1741 != var11) {
                                                        class110.field1741 = var11;
                                                        class144.method1082(var11, (byte) 32);
                                                    }
                                                    int var12 = class258.field3844[0][var3 + 1][var4] + class258.field3844[0][var3][var4] + class258.field3844[0][var3][var4 + 1] + class258.field3844[0][var3 + 1][var4 + 1] >> 2;
                                                    class309.method2143(-var12, -126, 3);
                                                    var8 = 201.5F;
                                                    class36.method330(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class36.method330(var8);
                                                }
                                            }
                                            if (!var2.field1485) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class99 var13 = class250.field3746[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field1466) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class310.field4837 && var3 > class117.field1841) {
                                                    class99 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field1466 && (var14.field1485 || (var2.field1483 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class310.field4837 && var3 < class90.field1311 - 1) {
                                                    class99 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field1466 && (var15.field1485 || (var2.field1483 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class58.field865 && var4 > class102.field1580) {
                                                    class99 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field1466 && (var16.field1485 || (var2.field1483 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class58.field865 && var4 < class29.field335 - 1) {
                                                    class99 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field1466 && (var17.field1485 || (var2.field1483 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1485 = false;
                                            if (var2.field1476 != null) {
                                                class99 var18 = var2.field1476;
                                                if (class36.field534) {
                                                    class36.method330(201.5F - (float) (var18.field1479 + 1) * 50.0F);
                                                }
                                                if (var18.field1489 == null) {
                                                    if (var18.field1490 != null) {
                                                        if (class73.method600(0, var3, var4)) {
                                                            class188.method1355(var18.field1490, class235.field3598, class10.field103, class304.field4758, class325.field5057, var3, var4, true);
                                                        } else {
                                                            class188.method1355(var18.field1490, class235.field3598, class10.field103, class304.field4758, class325.field5057, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class73.method600(0, var3, var4)) {
                                                    class87.method715(var18.field1489, 0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var3, var4, true);
                                                } else {
                                                    class87.method715(var18.field1489, 0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var3, var4, false);
                                                }
                                                class10 var19 = var18.field1486;
                                                if (var19 != null) {
                                                    if (class36.field534) {
                                                        if ((var19.field90 & var2.field1480) == 0) {
                                                            class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                        } else {
                                                            class286.method2008(var19.field90, class163.field2430, class6.field57, class35.field444, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field98.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var19.field92 - class163.field2430, var19.field99 - class6.field57, var19.field96 - class35.field444, var19.field91, var5, (class254) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field1488; var20++) {
                                                    class91 var21 = var18.field1471[var20];
                                                    if (var21 != null) {
                                                        if (class36.field534) {
                                                            class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                        }
                                                        var21.field1326.method1(var21.field1316, class235.field3598, class10.field103, class304.field4758, class325.field5057, var21.field1324 - class163.field2430, var21.field1328 - class6.field57, var21.field1322 - class35.field444, var21.field1327, var5, (class254) null);
                                                    }
                                                }
                                                if (class36.field534) {
                                                    class36.method330(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field1489 == null) {
                                                if (var2.field1490 != null) {
                                                    if (class73.method600(var6, var3, var4)) {
                                                        class188.method1355(var2.field1490, class235.field3598, class10.field103, class304.field4758, class325.field5057, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class188.method1355(var2.field1490, class235.field3598, class10.field103, class304.field4758, class325.field5057, var3, var4, false);
                                                    }
                                                }
                                            } else if (class73.method600(var6, var3, var4)) {
                                                class87.method715(var2.field1489, var6, class235.field3598, class10.field103, class304.field4758, class325.field5057, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field1489.field1638 != 12345678 || class244.field3682 && var5 <= class116.field1817) {
                                                    class87.method715(var2.field1489, var6, class235.field3598, class10.field103, class304.field4758, class325.field5057, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class173 var23 = var2.field1472;
                                                if (var23 != null && (var23.field2568 & 0x80000000L) != 0L) {
                                                    if (class36.field534 && var23.field2562) {
                                                        class36.method330(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class36.field534) {
                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                    }
                                                    var23.field2560.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var23.field2565 - class163.field2430, var23.field2564 - class6.field57, var23.field2555 - class35.field444, var23.field2568, var5, (class254) null);
                                                    if (class36.field534 && var23.field2562) {
                                                        class36.method330(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class10 var26 = var2.field1486;
                                            class290 var27 = var2.field1474;
                                            if (var26 != null || var27 != null) {
                                                if (class310.field4837 == var3) {
                                                    var24++;
                                                } else if (class310.field4837 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class58.field865 == var4) {
                                                    var24 += 3;
                                                } else if (class58.field865 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class199.field3152[var24];
                                                var2.field1480 = class220.field3458[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field90 & class304.field4767[var24]) == 0) {
                                                    var2.field1482 = 0;
                                                } else if (var26.field90 == 16) {
                                                    var2.field1482 = 3;
                                                    var2.field1475 = class212.field3368[var24];
                                                    var2.field1491 = 3 - var2.field1475;
                                                } else if (var26.field90 == 32) {
                                                    var2.field1482 = 6;
                                                    var2.field1475 = class75.field1062[var24];
                                                    var2.field1491 = 6 - var2.field1475;
                                                } else if (var26.field90 == 64) {
                                                    var2.field1482 = 12;
                                                    var2.field1475 = class293.field4598[var24];
                                                    var2.field1491 = 12 - var2.field1475;
                                                } else {
                                                    var2.field1482 = 9;
                                                    var2.field1475 = class231.field3575[var24];
                                                    var2.field1491 = 9 - var2.field1475;
                                                }
                                                if ((var26.field90 & var25) != 0 && !class28.method196(var6, var3, var4, var26.field90)) {
                                                    if (class36.field534) {
                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                    }
                                                    var26.field98.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var26.field92 - class163.field2430, var26.field99 - class6.field57, var26.field96 - class35.field444, var26.field91, var5, (class254) null);
                                                }
                                                if ((var26.field101 & var25) != 0 && !class28.method196(var6, var3, var4, var26.field101)) {
                                                    if (class36.field534) {
                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                    }
                                                    var26.field94.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var26.field92 - class163.field2430, var26.field99 - class6.field57, var26.field96 - class35.field444, var26.field91, var5, (class254) null);
                                                }
                                            }
                                            if (var27 != null && !class217.method1555(var6, var3, var4, var27.field4563.method19())) {
                                                if (class36.field534) {
                                                    class36.method330(var8 - 0.5F);
                                                }
                                                if ((var27.field4564 & var25) != 0) {
                                                    if (class36.field534) {
                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                    }
                                                    var27.field4563.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var27.field4551 + var27.field4556 - class163.field2430, var27.field4559 - class6.field57, var27.field4548 + var27.field4552 - class35.field444, var27.field4550, var5, (class254) null);
                                                } else if (var27.field4564 == 256) {
                                                    int var28 = var27.field4551 - class163.field2430;
                                                    int var29 = var27.field4559 - class6.field57;
                                                    int var30 = var27.field4548 - class35.field444;
                                                    int var31 = var27.field4557;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class36.field534) {
                                                            class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                        }
                                                        var27.field4563.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var27.field4556 + var28, var29, var27.field4552 + var30, var27.field4550, var5, (class254) null);
                                                    } else if (var27.field4549 != null) {
                                                        if (class36.field534) {
                                                            class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                        }
                                                        var27.field4549.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var28, var29, var30, var27.field4550, var5, (class254) null);
                                                    }
                                                }
                                                if (class36.field534) {
                                                    class36.method330(var8);
                                                }
                                            }
                                            if (var22) {
                                                class173 var34 = var2.field1472;
                                                if (var34 != null && (var34.field2568 & 0x80000000L) == 0L) {
                                                    if (class36.field534 && var34.field2562) {
                                                        class36.method330(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class36.field534) {
                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                    }
                                                    var34.field2560.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var34.field2565 - class163.field2430, var34.field2564 - class6.field57, var34.field2555 - class35.field444, var34.field2568, var5, (class254) null);
                                                    if (class36.field534 && var34.field2562) {
                                                        class36.method330(var8);
                                                    }
                                                }
                                                class189 var35 = var2.field1478;
                                                if (var35 != null && var35.field3006 == 0) {
                                                    if (class36.field534) {
                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                    }
                                                    if (var35.field3007 != null) {
                                                        var35.field3007.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var35.field3013 - class163.field2430, var35.field3009 - class6.field57, var35.field3008 - class35.field444, var35.field3012, var5, (class254) null);
                                                    }
                                                    if (var35.field3004 != null) {
                                                        var35.field3004.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var35.field3013 - class163.field2430, var35.field3009 - class6.field57, var35.field3008 - class35.field444, var35.field3012, var5, (class254) null);
                                                    }
                                                    if (var35.field3005 != null) {
                                                        var35.field3005.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var35.field3013 - class163.field2430, var35.field3009 - class6.field57, var35.field3008 - class35.field444, var35.field3012, var5, (class254) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field1483;
                                            if (var36 != 0) {
                                                if (var3 < class310.field4837 && (var36 & 0x4) != 0) {
                                                    class99 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field1466) {
                                                        class241.field3626.method977(4, var37);
                                                    }
                                                }
                                                if (var4 < class58.field865 && (var36 & 0x2) != 0) {
                                                    class99 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field1466) {
                                                        class241.field3626.method977(4, var38);
                                                    }
                                                }
                                                if (var3 > class310.field4837 && (var36 & 0x1) != 0) {
                                                    class99 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field1466) {
                                                        class241.field3626.method977(4, var39);
                                                    }
                                                }
                                                if (var4 > class58.field865 && (var36 & 0x8) != 0) {
                                                    class99 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field1466) {
                                                        class241.field3626.method977(4, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1482 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field1488; var42++) {
                                                if (class63.field949 != var2.field1471[var42].field1320 && (var2.field1477[var42] & var2.field1482) == var2.field1475) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class10 var43 = var2.field1486;
                                                if (!class28.method196(var6, var3, var4, var43.field90)) {
                                                    if (class36.field534) {
                                                        label882: {
                                                            if ((var43.field91 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field92 - class163.field2430;
                                                                int var45 = var43.field96 - class35.field444;
                                                                int var46 = (int) (var43.field91 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class210.field3312 - 1) {
                                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class39.field589 - 1 && var4 < class210.field3312 - 1) {
                                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class39.field589 - 1 && var4 > 0) {
                                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field98.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var43.field92 - class163.field2430, var43.field99 - class6.field57, var43.field96 - class35.field444, var43.field91, var5, (class254) null);
                                                }
                                                var2.field1482 = 0;
                                            }
                                        }
                                        if (!var2.field1481) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field1488;
                                            var2.field1481 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class91 var50 = var2.field1471[var49];
                                                if (class63.field949 != var50.field1320) {
                                                    for (int var51 = var50.field1329; var51 <= var50.field1317; var51++) {
                                                        for (int var52 = var50.field1323; var52 <= var50.field1319; var52++) {
                                                            class99 var53 = var7[var51][var52];
                                                            if (var53.field1485) {
                                                                var2.field1481 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field1482 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field1329) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field1317) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field1323) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field1319) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field1482) == var2.field1491) {
                                                                    var2.field1481 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class271.field4095[var48++] = var50;
                                                    int var55 = class310.field4837 - var50.field1329;
                                                    int var56 = var50.field1317 - class310.field4837;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class58.field865 - var50.field1323;
                                                    int var58 = var50.field1319 - class58.field865;
                                                    if (var58 > var57) {
                                                        var50.field1330 = var55 + var58;
                                                    } else {
                                                        var50.field1330 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class91 var62 = class271.field4095[var61];
                                                    if (class63.field949 != var62.field1320) {
                                                        if (var62.field1330 > var59) {
                                                            var59 = var62.field1330;
                                                            var60 = var61;
                                                        } else if (var62.field1330 == var59) {
                                                            int var63 = var62.field1324 - class163.field2430;
                                                            int var64 = var62.field1322 - class35.field444;
                                                            int var65 = class271.field4095[var60].field1324 - class163.field2430;
                                                            int var66 = class271.field4095[var60].field1322 - class35.field444;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class91 var67 = class271.field4095[var60];
                                                var67.field1320 = class63.field949;
                                                if (!class38.method348(var6, var67.field1329, var67.field1317, var67.field1323, var67.field1319, var67.field1326.method19())) {
                                                    if (class36.field534) {
                                                        if ((var67.field1327 & 0xFC000L) == 147456L) {
                                                            class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                                                            int var68 = var67.field1324 - class163.field2430;
                                                            int var69 = var67.field1322 - class35.field444;
                                                            int var70 = (int) (var67.field1327 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class286.method2012(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class286.method2012(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class286.method2012(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class286.method2012(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class286.method2007(class163.field2430, class6.field57, class35.field444, var5, var67.field1329, var67.field1323, var67.field1317, var67.field1319);
                                                        }
                                                    }
                                                    var67.field1326.method1(var67.field1316, class235.field3598, class10.field103, class304.field4758, class325.field5057, var67.field1324 - class163.field2430, var67.field1328 - class6.field57, var67.field1322 - class35.field444, var67.field1327, var5, (class254) null);
                                                }
                                                for (int var71 = var67.field1329; var71 <= var67.field1317; var71++) {
                                                    for (int var72 = var67.field1323; var72 <= var67.field1319; var72++) {
                                                        class99 var73 = var7[var71][var72];
                                                        if (var73.field1482 != 0) {
                                                            class241.field3626.method977(4, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field1466) {
                                                            class241.field3626.method977(4, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1481) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field1481 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1466);
                            } while (var2.field1482 != 0);
                            if (var3 > class310.field4837 || var3 <= class117.field1841) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field1466);
                        if (var3 < class310.field4837 || var3 >= class90.field1311 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field1466);
                    if (var4 > class58.field865 || var4 <= class102.field1580) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field1466);
                if (var4 < class58.field865 || var4 >= class29.field335 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field1466);
            var2.field1466 = false;
            class178.field2669--;
            class189 var79 = var2.field1478;
            if (var79 != null && var79.field3006 != 0) {
                if (class36.field534) {
                    class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                }
                if (var79.field3007 != null) {
                    var79.field3007.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var79.field3013 - class163.field2430, var79.field3009 - class6.field57 - var79.field3006, var79.field3008 - class35.field444, var79.field3012, var5, (class254) null);
                }
                if (var79.field3004 != null) {
                    var79.field3004.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var79.field3013 - class163.field2430, var79.field3009 - class6.field57 - var79.field3006, var79.field3008 - class35.field444, var79.field3012, var5, (class254) null);
                }
                if (var79.field3005 != null) {
                    var79.field3005.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var79.field3013 - class163.field2430, var79.field3009 - class6.field57 - var79.field3006, var79.field3008 - class35.field444, var79.field3012, var5, (class254) null);
                }
            }
            if (var2.field1480 != 0) {
                class290 var80 = var2.field1474;
                if (var80 != null && !class217.method1555(var6, var3, var4, var80.field4563.method19())) {
                    if ((var80.field4564 & var2.field1480) != 0) {
                        if (class36.field534) {
                            class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                        }
                        var80.field4563.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var80.field4551 + var80.field4556 - class163.field2430, var80.field4559 - class6.field57, var80.field4548 + var80.field4552 - class35.field444, var80.field4550, var5, (class254) null);
                    } else if (var80.field4564 == 256) {
                        int var81 = var80.field4551 - class163.field2430;
                        int var82 = var80.field4559 - class6.field57;
                        int var83 = var80.field4548 - class35.field444;
                        int var84 = var80.field4557;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class36.field534) {
                                class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                            }
                            var80.field4563.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var80.field4556 + var81, var82, var80.field4552 + var83, var80.field4550, var5, (class254) null);
                        } else if (var80.field4549 != null) {
                            if (class36.field534) {
                                class286.method2004(class163.field2430, class6.field57, class35.field444, var5, var3, var4);
                            }
                            var80.field4549.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var81, var82, var83, var80.field4550, var5, (class254) null);
                        }
                    }
                }
                class10 var87 = var2.field1486;
                if (var87 != null) {
                    if ((var87.field101 & var2.field1480) != 0 && !class28.method196(var6, var3, var4, var87.field101)) {
                        if (class36.field534) {
                            class286.method2008(var87.field101, class163.field2430, class6.field57, class35.field444, var6, var3, var4);
                        }
                        var87.field94.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var87.field92 - class163.field2430, var87.field99 - class6.field57, var87.field96 - class35.field444, var87.field91, var5, (class254) null);
                    }
                    if ((var87.field90 & var2.field1480) != 0 && !class28.method196(var6, var3, var4, var87.field90)) {
                        if (class36.field534) {
                            class286.method2008(var87.field90, class163.field2430, class6.field57, class35.field444, var6, var3, var4);
                        }
                        var87.field98.method1(0, class235.field3598, class10.field103, class304.field4758, class325.field5057, var87.field92 - class163.field2430, var87.field99 - class6.field57, var87.field96 - class35.field444, var87.field91, var5, (class254) null);
                    }
                }
            }
            if (var5 < class136.field2126 - 1) {
                class99 var88 = class250.field3746[var5 + 1][var3][var4];
                if (var88 != null && var88.field1466) {
                    class241.field3626.method977(4, var88);
                }
            }
            if (var3 < class310.field4837) {
                class99 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field1466) {
                    class241.field3626.method977(4, var89);
                }
            }
            if (var4 < class58.field865) {
                class99 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field1466) {
                    class241.field3626.method977(4, var90);
                }
            }
            if (var3 > class310.field4837) {
                class99 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field1466) {
                    class241.field3626.method977(4, var91);
                }
            }
            if (var4 > class58.field865) {
                class99 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field1466) {
                    class241.field3626.method977(4, var92);
                }
            }
        }
    }
}
