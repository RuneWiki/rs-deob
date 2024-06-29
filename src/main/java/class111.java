import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class111 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    public static int[] field1831 = new int[25];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field1830 = 0;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1835 = "";

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
    public static int[] field1829;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[[B")
    public static byte[][] field1832;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method829(int arg0) {
        field1831 = null;
        field1829 = null;
        field1835 = null;
        field1832 = null;
        int var1 = 95 % ((-arg0 - 32) / 43);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILhg;I)V")
    public static final void method830(int arg0, int arg1, class207 arg2, int arg3) {
        if (arg2.field3385 == 1) {
            class76.field1300++;
            class289.method2009(0, "", true, 0L, arg2.field3405, -1, arg2.field3505, (short) 50);
        }
        field1833++;
        if (arg2.field3385 == 2 && !class302.field4918) {
            String var4 = class264.method1867(arg2, 3998);
            if (var4 != null) {
                class289.method2009(-1, "<col=00ff00>" + arg2.field3430, true, 0L, arg2.field3405, -1, var4, (short) 42);
                class236.field3979++;
            }
        }
        if (arg2.field3385 == 3) {
            class261.field4380++;
            class289.method2009(0, "", true, 0L, arg2.field3405, -1, class136.field2237, (short) 58);
        }
        if (arg2.field3385 == 4) {
            class161.field2618++;
            class289.method2009(0, "", true, 0L, arg2.field3405, -1, arg2.field3505, (short) 40);
        }
        if (arg2.field3385 == 5) {
            class289.method2009(0, "", true, 0L, arg2.field3405, -1, arg2.field3505, (short) 35);
            class206.field3330++;
        }
        if (arg2.field3385 == 6 && class6.field133 == null) {
            class55.field973++;
            class289.method2009(-1, "", true, 0L, arg2.field3405, -1, arg2.field3505, (short) 43);
        }
        if (arg2.field3376 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3386; var6++) {
                for (int var7 = 0; var7 < arg2.field3480; var7++) {
                    int var8 = (arg2.field3466 + 32) * var6;
                    int var9 = (arg2.field3457 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg2.field3463[var5];
                        var9 += arg2.field3361[var5];
                    }
                    if (arg1 >= var9 && arg0 >= var8 && arg1 < var9 + 32 && var8 + 32 > arg0) {
                        class268.field4454 = arg2;
                        class259.field4359 = var5;
                        if (arg2.field3421[var5] > 0) {
                            class20 var10 = client.method732(arg2);
                            class71 var11 = class13.method75(false, arg2.field3421[var5] - 1);
                            if (class272.field4554 == 1 && var10.method124(0)) {
                                if (class170.field2751 != arg2.field3405 || class10.field189 != var5) {
                                    class289.method2009(var5, class46.field813 + " -> <col=ff9040>" + var11.field1209, true, (long) var11.field1237, arg2.field3405, -1, class245.field4116, (short) 28);
                                    class97.field1568++;
                                }
                            } else if (class302.field4918 && var10.method124(0)) {
                                class86 var12 = class91.field1515 == -1 ? null : class69.method471(class91.field1515, (byte) 28);
                                if ((class30.field497 & 0x10) != 0 && (var12 == null || var11.method506(var12.field1423, class91.field1515, 11773) != var12.field1423)) {
                                    class141.field2340++;
                                    class289.method2009(var5, class93.field1517 + " -> <col=ff9040>" + var11.field1209, true, (long) var11.field1237, arg2.field3405, class169.field2741, class238.field4011, (short) 1);
                                }
                            } else {
                                class25.field440++;
                                String[] var13 = var11.field1200;
                                if (class73.field1282) {
                                    var13 = class248.method1760((byte) 124, var13);
                                }
                                if (var10.method124(0)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class253.field4297++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 31;
                                            } else {
                                                var15 = 41;
                                            }
                                            class289.method2009(var5, "<col=ff9040>" + var11.field1209, true, (long) var11.field1237, arg2.field3405, -1, var13[var14], var15);
                                        }
                                    }
                                }
                                if (var10.method127(arg3 + 16190)) {
                                    class289.method2009(var5, "<col=ff9040>" + var11.field1209, true, (long) var11.field1237, arg2.field3405, class135.field2222, class245.field4116, (short) 60);
                                    class239.field4036++;
                                }
                                if (var10.method124(0) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class226.field3814++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 19;
                                            }
                                            if (var16 == 1) {
                                                var17 = 32;
                                            }
                                            if (var16 == 2) {
                                                var17 = 15;
                                            }
                                            class289.method2009(var5, "<col=ff9040>" + var11.field1209, true, (long) var11.field1237, arg2.field3405, -1, var13[var16], var17);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field3349;
                                if (class73.field1282) {
                                    var18 = class248.method1760((byte) 121, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class65.field1102++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 2;
                                            }
                                            if (var19 == 1) {
                                                var20 = 37;
                                            }
                                            if (var19 == 2) {
                                                var20 = 51;
                                            }
                                            if (var19 == 3) {
                                                var20 = 46;
                                            }
                                            if (var19 == 4) {
                                                var20 = 24;
                                            }
                                            class289.method2009(var5, "<col=ff9040>" + var11.field1209, true, (long) var11.field1237, arg2.field3405, -1, var18[var19], var20);
                                        }
                                    }
                                }
                                class289.method2009(var5, "<col=ff9040>" + var11.field1209, true, (long) var11.field1237, arg2.field3405, class256.field4327, class113.field1925, (short) 1010);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg2.field3446) {
            if (!class302.field4918) {
                for (int var21 = 9; var21 >= 5; var21--) {
                    String var25 = class63.method430(var21, arg2, (byte) -121);
                    if (var25 != null) {
                        class284.field4721++;
                        class289.method2009(arg2.field3369, arg2.field3399, true, (long) (var21 + 1), arg2.field3405, class19.method116(arg2, false, var21), var25, (short) 1003);
                    }
                }
                String var22 = class264.method1867(arg2, 3998);
                if (var22 != null) {
                    class236.field3979++;
                    class289.method2009(arg2.field3369, arg2.field3399, true, 0L, arg2.field3405, -1, var22, (short) 42);
                }
                for (int var23 = 4; var23 >= 0; var23--) {
                    String var24 = class63.method430(var23, arg2, (byte) -112);
                    if (var24 != null) {
                        class284.field4721++;
                        class289.method2009(arg2.field3369, arg2.field3399, true, (long) (var23 + 1), arg2.field3405, class19.method116(arg2, false, var23), var24, (short) 25);
                    }
                }
                if (client.method732(arg2).method135((byte) -48)) {
                    if (arg2.field3476 == null) {
                        class289.method2009(arg2.field3369, "", true, 0L, arg2.field3405, -1, class241.field4064, (short) 43);
                    } else {
                        class289.method2009(arg2.field3369, "", true, 0L, arg2.field3405, -1, arg2.field3476, (short) 43);
                    }
                    class55.field973++;
                }
            } else if (client.method732(arg2).method122(-78) && (class30.field497 & 0x20) != 0) {
                class313.field5044++;
                class289.method2009(arg2.field3369, class93.field1517 + " -> " + arg2.field3399, true, 0L, arg2.field3405, class169.field2741, class238.field4011, (short) 20);
            }
        }
        if (arg3 != -16190) {
            field1835 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method831(int arg0, String arg1, String arg2, int arg3) {
        class36.field578 = arg3;
        class33.field532 = arg1;
        field1834++;
        field1835 = arg2;
        if (class33.field532.equals("") || field1835.equals("")) {
            class295.field4839 = 3;
        } else if (class251.field4250 == -1) {
            class145.field2389 = 0;
            class116.field1981 = 1;
            class210.field3549 = 0;
            class295.field4839 = -3;
            class249 var4 = new class249(128);
            var4.method1780(10, arg0 ^ 0x5A74);
            var4.method1811((int) (Math.random() * 9.9999999E7D), (byte) 51);
            var4.method1795(class180.method1309(class33.field532, arg0 - 43783), (byte) -59);
            var4.method1811((int) (Math.random() * 9.9999999E7D), (byte) 51);
            var4.method1786(arg0 - 48236, field1835);
            var4.method1811((int) (Math.random() * 9.9999999E7D), (byte) 51);
            var4.method1775((byte) 35, class100.field1585, class219.field3691);
            class236.field3980.field4160 = 0;
            class236.field3980.method1780(24, 68);
            if (arg0 == 23087) {
                class236.field3980.method1780(var4.field4160 + 2, 92);
                class236.field3980.method1771(554, (byte) 30);
                class236.field3980.method1784(var4.field4182, false, var4.field4160, 0);
            }
        } else {
            class279.method1958(arg0 ^ 0x5A2C);
        }
    }
}
