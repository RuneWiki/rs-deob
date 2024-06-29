import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class288 extends class55 {

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Lcf;")
    public static class93 field5141 = class147.method1066("gleiten:", -48);

    @OriginalMember(owner = "client!li", name = "z", descriptor = "Lcf;")
    public static class93 field5145 = class147.method1066("Monde de jeu cr-B-B", -48);

    @OriginalMember(owner = "client!li", name = "D", descriptor = "[I")
    public static int[] field5149 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Lcf;")
    public static class93 field5150 = class147.method1066("<img=0>", -48);

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Lcf;")
    public static class93 field5142 = class147.method1066("Cach-B", -48);

    @OriginalMember(owner = "client!li", name = "H", descriptor = "Lcf;")
    public static class93 field5153 = class147.method1066("hitmarks", -48);

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "Lcf;")
    public class93 field5147;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Lcf;")
    public class93 field5152;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "[[B")
    public static byte[][] field5148;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)Lsj;")
    public final class49 method1970(boolean arg0) {
        if (arg0) {
            method1973(-98);
        }
        ++field5143;
        return class121.field2162[super.field925];
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V")
    public static final void method1971(int arg0) {
        class145.method1055(false, (byte) -72);
        if (arg0 == 32) {
            class181.field3359 = 0;
            boolean var1 = true;
            for (int var2 = 0; ~class204.field3675.length < ~var2; ++var2) {
                if (class72.field1292[var2] != -1 && class204.field3675[var2] == null) {
                    class204.field3675[var2] = class1.field11.method1271(class72.field1292[var2], -2154, 0);
                    if (class204.field3675[var2] == null) {
                        var1 = false;
                        ++class181.field3359;
                    }
                }
                if (class251.field4526[var2] != -1 && class50.field827[var2] == null) {
                    class50.field827[var2] = class1.field11.method1261(class39.field597[var2], class251.field4526[var2], 0, (byte) -85);
                    if (class50.field827[var2] == null) {
                        var1 = false;
                        ++class181.field3359;
                    }
                }
                if (class183.field3381 != null && field5148[var2] == null && ~class183.field3381[var2] != 0) {
                    field5148[var2] = class1.field11.method1261(class39.field597[var2], class183.field3381[var2], 0, (byte) -110);
                    if (field5148[var2] == null) {
                        var1 = false;
                        ++class181.field3359;
                    }
                }
            }
            ++field5146;
            if (class51.field837 == null) {
                if (class53.field873 != null && class148.field2609.method1275((byte) -85, class130.method949((byte) -77, new class93[] { class53.field873.field2773, class163.field2881 }))) {
                    if (!class148.field2609.method1286((byte) 81, class130.method949((byte) -77, new class93[] { class53.field873.field2773, class163.field2881 }))) {
                        var1 = false;
                        ++class181.field3359;
                    } else {
                        class51.field837 = class139.method1013(66, class130.method949((byte) -77, new class93[] { class53.field873.field2773, class163.field2881 }), class148.field2609);
                    }
                } else {
                    class51.field837 = new class129(0);
                }
            }
            if (!var1) {
                class8.field111 = 1;
            } else {
                boolean var3 = true;
                class72.field1302 = 0;
                for (int var4 = 0; var4 < class204.field3675.length; ++var4) {
                    byte[] var20 = class50.field827[var4];
                    if (var20 != null) {
                        int var21 = (class149.field2614[var4] >> 8) * 64 - class229.field4111;
                        int var22 = (255 & class149.field2614[var4]) * 64 - class4.field52;
                        if (class141.field2453) {
                            var22 = 10;
                            var21 = 10;
                        }
                        var3 &= class280.method1899(var21, var20, false, var22);
                    }
                }
                if (!var3) {
                    class8.field111 = 2;
                } else {
                    if (class8.field111 != 0) {
                        class30.method175((byte) 1, true, class130.method949((byte) -77, new class93[] { class200.field3635, class190.field3479 }));
                    }
                    class226.method1559(false);
                    class90.method626(-60);
                    boolean var5 = false;
                    class282.method1938(4, 104, 104, 25, var5);
                    for (int var6 = 0; var6 < 4; ++var6) {
                        class148.field2605[var6].method748(false);
                    }
                    for (int var7 = 0; var7 < 4; ++var7) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            for (int var19 = 0; var19 < 104; ++var19) {
                                class4.field53[var7][var18][var19] = 0;
                            }
                        }
                    }
                    class94.method696(0, false);
                    class226.method1559(false);
                    System.gc();
                    class145.method1055(true, (byte) -64);
                    class220.method1533(false, true);
                    if (!class141.field2453) {
                        class264.method1768(false, 0);
                        class145.method1055(true, (byte) -94);
                        class134.method977(8, false);
                        if (field5148 != null) {
                            class233.method1591(arg0 ^ 31);
                        }
                    }
                    if (class141.field2453) {
                        class220.method1534(14387, false);
                        class145.method1055(true, (byte) -125);
                        class109.method781(false, (byte) -23);
                    }
                    class90.method626(56);
                    class145.method1055(true, (byte) -89);
                    class60.method380(class148.field2605, -1, false);
                    class145.method1055(true, (byte) -54);
                    int var8 = class174.field3036;
                    if (class138.field2405 < var8) {
                        var8 = class138.field2405;
                    }
                    if (~(class138.field2405 + -1) < ~var8) {
                        int var9 = class138.field2405 + -1;
                    }
                    if (!class13.method57(2357)) {
                        class26.method143(class174.field3036);
                    } else {
                        class26.method143(0);
                    }
                    class55.method308((byte) -113);
                    for (int var10 = 0; var10 < 104; ++var10) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            class50.method279(var10, var17, -28234);
                        }
                    }
                    class119.method886(-13858);
                    class226.method1559(false);
                    class212.method1498(-68);
                    class90.method626(-42);
                    if (class246.field4432 != null && class92.field1625 != null && ~class199.field3609 == -26) {
                        class285.field5105.method1568(148, (byte) 109);
                        class285.field5105.method1886(1057001181, 2);
                        ++class43.field695;
                    }
                    if (!class141.field2453) {
                        int var11 = (class212.field3894 + -6) / 8;
                        int var12 = (class212.field3894 - -6) / 8;
                        int var13 = (class15.field188 - -6) / 8;
                        int var14 = (class15.field188 - 6) / 8;
                        for (int var15 = var11 - 1; ~(var12 + 1) <= ~var15; ++var15) {
                            for (int var16 = var14 + -1; ~var16 >= ~(var13 + 1); ++var16) {
                                if (~var11 < ~var15 || ~var12 > ~var15 || ~var14 < ~var16 || ~var13 > ~var16) {
                                    class1.field11.method1285(class130.method949((byte) -77, new class93[] { class188.field3454, class148.method1067(-7015, var15), class15.field197, class148.method1067(-7015, var16) }), (byte) 37);
                                    class1.field11.method1285(class130.method949((byte) -77, new class93[] { class87.field1563, class148.method1067(arg0 + -7047, var15), class15.field197, class148.method1067(-7015, var16) }), (byte) 37);
                                }
                            }
                        }
                    }
                    if (class199.field3609 != 28) {
                        class19.method88(30, false);
                        if (class92.field1625 != null) {
                            class285.field5105.method1568(32, (byte) 96);
                        }
                    } else {
                        class19.method88(10, false);
                    }
                    class217.method1525(84);
                    class226.method1559(false);
                    class110.method788((byte) 34);
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
    public static void method1972(int arg0) {
        field5148 = null;
        if (arg0 == 2) {
            field5141 = null;
            field5153 = null;
            field5145 = null;
            field5142 = null;
            field5150 = null;
            field5149 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "h", descriptor = "(I)V")
    public static final void method1973(int arg0) {
        if (arg0 != 28156) {
            field5141 = null;
        }
        ++class52.field850;
        class285.field5105.method1568(125, (byte) 120);
        ++field5151;
        class285.field5105.method1882(0L, (byte) -126);
    }
}
