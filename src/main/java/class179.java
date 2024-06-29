import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class179 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lhi;")
    public static class25 field2543 = null;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method1163(int arg0) {
        class59.field703.method67((byte) 113);
        field2545++;
        class227.field3199.method67((byte) -127);
        class110.field1471.method67((byte) -125);
        if (arg0 != -13869) {
            method1165(-92);
        }
        class118.field1667.method67((byte) -128);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIIZIIII)V")
    public static final void method1164(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field2544++;
        if (!arg3 && class181.field2575 == arg7 && class88.field1196 == arg2 && class251.field3626 == arg1 || class176.method1141(1)) {
            return;
        }
        if (arg6 > -123) {
            method1163(-40);
        }
        class181.field2575 = arg7;
        class88.field1196 = arg2;
        class251.field3626 = arg1;
        if (class176.method1141(1)) {
            class251.field3626 = 0;
        }
        if (arg0) {
            class17.method105(28, (byte) -45);
        } else {
            class17.method105(25, (byte) 65);
        }
        class117.method755(16777215, true, class168.field2418);
        int var8 = class166.field2383;
        class166.field2383 = arg2 * 8 - 48;
        int var9 = class110.field1473;
        class110.field1473 = (arg7 - 6) * 8;
        class214.field2990 = class11.method77((byte) 122, class88.field1196 * 8, class181.field2575 * 8);
        int var10 = class110.field1473 - var9;
        class258.field3757 = null;
        int var11 = class166.field2383 - var8;
        int var12 = class166.field2383;
        int var13 = class110.field1473;
        if (arg0) {
            class294.field4642 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class54 var33 = class20.field244[var17];
                if (var33 != null) {
                    var33.field4563 -= var10 * 128;
                    var33.field4553 -= var11 * 128;
                    if (var33.field4563 >= 0 && var33.field4563 <= 13184 && var33.field4553 >= 0 && var33.field4553 <= 13184) {
                        for (int var34 = 0; var34 < 10; var34++) {
                            var33.field4597[var34] -= var10;
                            var33.field4585[var34] -= var11;
                        }
                        class14.field176[class294.field4642++] = var17;
                    } else {
                        class20.field244[var17].method322((class267) null, 100);
                        class20.field244[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class54 var15 = class20.field244[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field4597[var16] -= var10;
                        var15.field4585[var16] -= var11;
                    }
                    var15.field4563 -= var10 * 128;
                    var15.field4553 -= var11 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class240 var31 = class253.field3656[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field4597[var32] -= var10;
                    var31.field4585[var32] -= var11;
                }
                var31.field4563 -= var10 * 128;
                var31.field4553 -= var11 * 128;
            }
        }
        class199.field2833 = arg1;
        class177.field2507.method1561(false, arg4, (byte) -38, arg5);
        byte var19 = 0;
        byte var20 = 104;
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var10 < 0) {
            var20 = -1;
            var19 = 103;
            var23 = -1;
        }
        byte var24 = 1;
        if (var11 < 0) {
            var21 = 103;
            var22 = -1;
            var24 = -1;
        }
        for (int var25 = var19; var25 != var20; var25 += var23) {
            for (int var27 = var21; var27 != var22; var27 += var24) {
                int var28 = var10 + var25;
                int var29 = var11 + var27;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class80.field943[var30][var25][var27] = class80.field943[var30][var28][var29];
                    } else {
                        class80.field943[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class206 var26 = (class206) class51.field578.method1532(-105); var26 != null; var26 = (class206) class51.field578.method1523(-71)) {
            var26.field2925 -= var10;
            var26.field2924 -= var11;
            if (var26.field2925 < 0 || var26.field2924 < 0 || var26.field2925 >= 104 || var26.field2924 >= 104) {
                var26.method1935(110);
            }
        }
        class37.field432 = 0;
        if (class292.field4626 != 0) {
            class27.field325 -= var11;
            class292.field4626 -= var10;
        }
        class115.field1586 = -1;
        if (arg0) {
            class293.field4637 -= var11;
            class245.field3560 -= var10 * 128;
            class133.field1929 -= var10;
            class129.field1858 -= var10;
            class204.field2902 -= var11 * 128;
            class26.field302 -= var11;
        } else {
            class4.field61 = 1;
        }
        class130.field1883.method1528(false);
        class71.field831.method1528(false);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method1165(int arg0) {
        if (arg0 < 46) {
            method1165(76);
        }
        field2543 = null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Z")
    public static final boolean method1166(int arg0) {
        if (arg0 <= 80) {
            return true;
        }
        field2542++;
        try {
            if (class296.field4676 == 2) {
                if (class58.field689 == null) {
                    class58.field689 = class10.method74(class117.field1645, class99.field1331, class188.field2692);
                    if (class58.field689 == null) {
                        return false;
                    }
                }
                if (class74.field886 == null) {
                    class74.field886 = new class74(class122.field1756, class77.field932);
                }
                if (class296.field4684.method941(22050, class74.field886, class58.field689, class153.field2213, (byte) -118)) {
                    class296.field4684.method954((byte) 23);
                    class296.field4684.method961(class110.field1475, 32632);
                    class296.field4684.method959(class177.field2517, class58.field689, (byte) -98);
                    class74.field886 = null;
                    class117.field1645 = null;
                    class58.field689 = null;
                    class296.field4676 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class296.field4684.method942(-18874);
            class58.field689 = null;
            class117.field1645 = null;
            class296.field4676 = 0;
            class74.field886 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(JI)V")
    public static final void method1167(long arg0, int arg1) {
        field2547++;
        if ((long) arg1 != arg0) {
            class151.field2197++;
            class94.field1259.method592(76, false);
            class94.field1259.method1379(-106, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1168(byte arg0, String arg1) {
        if (arg0 >= 17) {
            field2540++;
            System.out.println("Error: " + class282.method1867(arg1, "%0a", "\n", -115));
        }
    }
}
