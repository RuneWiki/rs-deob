import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class352 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5609 = 0;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lvh;")
    public static class62 field5612 = new class62(64);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
    public static int[] field5615;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lui;", line = 4)
    public static final class293 method2437(int arg0, int arg1) {
        field5614++;
        class293 var2 = (class293) class119.field1648.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class293 var3 = class283.method2047(class139.field2079, false, class208.field3150, arg1, arg0 ^ arg0);
        if (var3 != null) {
            class119.field1648.method377((long) arg1, var3, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 38)
    public static void method2438(byte arg0) {
        field5615 = null;
        if (arg0 >= -114) {
            method2437(51, -63);
        }
        field5612 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V", line = 67)
    public static final void method2439(int arg0, byte arg1) {
        if (arg1 != -54) {
            field5615 = (int[]) null;
        }
        field5613++;
        class187.field2808.method387(arg0, false);
        class303.field4715.method387(arg0, false);
        class90.field1185.method387(arg0, false);
        class139.field2078.method387(arg0, false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lhi;III)V", line = 88)
    public static final void method2440(class323 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field5037 == 1) {
            class236.field3630++;
            class67.method413(0, 0, -1, "", arg0.field5165, (short) 19, 0L, arg0.field5073);
        }
        if (arg0.field5037 == 2 && !class101.field1371) {
            String var4 = class313.method2211(arg0, 107);
            if (var4 != null) {
                class67.method413(-1, 0, -1, "<col=00ff00>" + arg0.field5046, var4, (short) 11, 0L, arg0.field5073);
                class197.field3005++;
            }
        }
        field5610++;
        if (arg0.field5037 == 3) {
            class316.field4952++;
            class67.method413(0, 0, -1, "", class309.field4808, (short) 43, 0L, arg0.field5073);
        }
        if (arg2 < 115) {
            method2438((byte) 99);
        }
        if (arg0.field5037 == 4) {
            class75.field967++;
            class67.method413(0, 0, -1, "", arg0.field5165, (short) 2, 0L, arg0.field5073);
        }
        if (arg0.field5037 == 5) {
            client.field4437++;
            class67.method413(0, 0, -1, "", arg0.field5165, (short) 37, 0L, arg0.field5073);
        }
        if (arg0.field5037 == 6 && class13.field126 == null) {
            class67.method413(-1, 0, -1, "", arg0.field5165, (short) 45, 0L, arg0.field5073);
            class73.field916++;
        }
        if (arg0.field5107 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field5131; var6++) {
                for (int var7 = 0; var7 < arg0.field5095; var7++) {
                    int var8 = (arg0.field5061 + 32) * var6;
                    int var9 = (arg0.field5071 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg0.field5050[var5];
                        var8 += arg0.field5055[var5];
                    }
                    if (var9 <= arg1 && var8 <= arg3 && var9 + 32 > arg1 && arg3 < (var8 + 32)) {
                        class360.field5696 = var5;
                        class54.field623 = arg0;
                        if (arg0.field5143[var5] > 0) {
                            class76 var10 = client.method2013(arg0);
                            class309 var11 = class190.method1302(arg0.field5143[var5] - 1, (byte) -114);
                            if (class119.field1662 == 1 && var10.method481(-289675939)) {
                                if (class119.field1663 != arg0.field5073 || class230.field3483 != var5) {
                                    class32.field372++;
                                    class67.method413(var5, 0, -1, class201.field3074 + " -> <col=ff9040>" + var11.field4868, class50.field576, (short) 7, (long) var11.field4799, arg0.field5073);
                                }
                            } else if (class101.field1371 && var10.method481(-289675939)) {
                                class303 var12 = class283.field4515 == -1 ? null : class113.method733(class283.field4515, true);
                                if ((class139.field2088 & 0x10) != 0 && (var12 == null || var11.method2180(var12.field4714, class283.field4515, false) != var12.field4714)) {
                                    class67.method413(var5, 0, class5.field48, class191.field2868 + " -> <col=ff9040>" + var11.field4868, class260.field4110, (short) 30, (long) var11.field4799, arg0.field5073);
                                    class212.field3219++;
                                }
                            } else {
                                class80.field1066++;
                                String[] var13 = var11.field4824;
                                if (class91.field1198) {
                                    var13 = class130.method894(var13, (byte) 51);
                                }
                                if (var10.method481(-289675939)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class309.field4805++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 51;
                                            } else {
                                                var15 = 16;
                                            }
                                            class67.method413(var5, 0, -1, "<col=ff9040>" + var11.field4868, var13[var14], var15, (long) var11.field4799, arg0.field5073);
                                        }
                                    }
                                }
                                if (var10.method482((byte) -42)) {
                                    class187.field2824++;
                                    class67.method413(var5, 0, class212.field3224, "<col=ff9040>" + var11.field4868, class50.field576, (short) 50, (long) var11.field4799, arg0.field5073);
                                }
                                if (var10.method481(-289675939) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class122.field1675++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 35;
                                            }
                                            if (var16 == 1) {
                                                var17 = 34;
                                            }
                                            if (var16 == 2) {
                                                var17 = 31;
                                            }
                                            class67.method413(var5, 0, -1, "<col=ff9040>" + var11.field4868, var13[var16], var17, (long) var11.field4799, arg0.field5073);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field5138;
                                if (class91.field1198) {
                                    var18 = class130.method894(var18, (byte) 118);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class165.field2556++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 26;
                                            }
                                            if (var19 == 1) {
                                                var20 = 12;
                                            }
                                            if (var19 == 2) {
                                                var20 = 38;
                                            }
                                            if (var19 == 3) {
                                                var20 = 23;
                                            }
                                            if (var19 == 4) {
                                                var20 = 47;
                                            }
                                            class67.method413(var5, 0, -1, "<col=ff9040>" + var11.field4868, var18[var19], var20, (long) var11.field4799, arg0.field5073);
                                        }
                                    }
                                }
                                class67.method413(var5, 0, class109.field1503, "<col=ff9040>" + var11.field4868, class291.field4584, (short) 1001, (long) var11.field4799, arg0.field5073);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field5172) {
            return;
        }
        if (!class101.field1371) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class115.method749(true, arg0, var21);
                if (var22 != null) {
                    class67.method413(arg0.field5112, 0, class349.method2420(arg0, var21, (byte) -106), arg0.field5105, var22, (short) 1006, (long) (var21 + 1), arg0.field5073);
                    class331.field5302++;
                }
            }
            String var23 = class313.method2211(arg0, 119);
            if (var23 != null) {
                class67.method413(arg0.field5112, 0, -1, arg0.field5105, var23, (short) 11, 0L, arg0.field5073);
                class197.field3005++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class115.method749(true, arg0, var24);
                if (var25 != null) {
                    class67.method413(arg0.field5112, 0, class349.method2420(arg0, var24, (byte) -106), arg0.field5105, var25, (short) 29, (long) (var24 + 1), arg0.field5073);
                    class331.field5302++;
                }
            }
            if (client.method2013(arg0).method480((byte) 84)) {
                class73.field916++;
                if (arg0.field5148 == null) {
                    class67.method413(arg0.field5112, 0, -1, "", class290.field4571, (short) 45, 0L, arg0.field5073);
                } else {
                    class67.method413(arg0.field5112, 0, -1, "", arg0.field5148, (short) 45, 0L, arg0.field5073);
                }
            }
        } else if (client.method2013(arg0).method491(-109) && (class139.field2088 & 0x20) != 0) {
            class291.field4575++;
            class67.method413(arg0.field5112, 0, class5.field48, class191.field2868 + " -> " + arg0.field5105, class260.field4110, (short) 32, 0L, arg0.field5073);
        }
    }
}
