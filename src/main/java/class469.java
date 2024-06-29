import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class469 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field6605 = 1339;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lef;")
    public static class311 field6604 = new class311(5, 3);

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Lhk;")
    public abstract class59 method2708(int arg0);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLnp;Lwp;)V")
    public static final void method2757(byte arg0, class313 arg1, class109 arg2) {
        field6606++;
        if (class395.field5606 == null) {
            return;
        }
        if (class482.field6790 < 10) {
            if (!class395.field5607.method1253(22473, class395.field5606.field2571)) {
                class482.field6790 = class120.field1512.method1255(arg0 - 27, class395.field5606.field2571) / 10;
                return;
            }
            class89.method499((byte) 85);
            class482.field6790 = 10;
        }
        if (class482.field6790 == 10) {
            class395.field5638 = class395.field5606.field2562 >> 6 << 6;
            class395.field5623 = class395.field5606.field2570 >> 6 << 6;
            class395.field5625 = (class395.field5606.field2560 >> 6 << 6) + 64 - class395.field5638;
            class395.field5628 = (class395.field5606.field2561 >> 6 << 6) - (class395.field5623 - 64);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class395.field5606.method1098(var3, class360.field5180 + (class492.field6935.field4317 >> 7), (class492.field6935.field4331 >> 7) + class240.field3602, class492.field6935.field4319, 5)) {
                var4 = var3[1] - class395.field5638;
                var5 = var3[2] - class395.field5623;
            }
            if (!class398.field5649 && var4 >= 0 && class395.field5625 > var4 && var5 >= 0 && var5 < class395.field5628) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class128.field1666 = var7;
                class220.field3280 = var6;
            } else if (class459.field6432 == -1 || class7.field67 == -1) {
                class395.field5606.method1091(class395.field5606.field2566 & 0x3FFF, var3, (class395.field5606.field2566 & 0xFFFC5B6) >> 14, -45);
                class220.field3280 = var3[2] - class395.field5623;
                class128.field1666 = var3[1] - class395.field5638;
            } else {
                class395.field5606.method1091(class7.field67, var3, class459.field6432, arg0 - 143);
                class7.field67 = -1;
                class459.field6432 = -1;
                class398.field5649 = false;
                if (var3 != null) {
                    class128.field1666 = var3[1] - class395.field5638;
                    class220.field3280 = var3[2] - class395.field5623;
                }
            }
            if (class395.field5606.field2564 == 37) {
                class395.field5614 = 3.0F;
                class395.field5615 = 3.0F;
            } else if (class395.field5606.field2564 == 50) {
                class395.field5614 = 4.0F;
                class395.field5615 = 4.0F;
            } else if (class395.field5606.field2564 == 75) {
                class395.field5614 = 6.0F;
                class395.field5615 = 6.0F;
            } else if (class395.field5606.field2564 == 100) {
                class395.field5614 = 8.0F;
                class395.field5615 = 8.0F;
            } else if (class395.field5606.field2564 == 200) {
                class395.field5614 = 16.0F;
                class395.field5615 = 16.0F;
            } else {
                class395.field5614 = 8.0F;
                class395.field5615 = 8.0F;
            }
            class395.field5617 = (int) class395.field5614 >> 1;
            class395.field5616 = class168.method1041(class395.field5617, 3);
            class81.method459((byte) -96);
            class395.method2356();
            class65.field839 = new class486();
            class395.field5611 += (int) (Math.random() * 5.0D) - 2;
            if (class395.field5611 < -8) {
                class395.field5611 = -8;
            }
            class395.field5612 += (int) (Math.random() * 5.0D) - 2;
            if (class395.field5611 > 8) {
                class395.field5611 = 8;
            }
            if (class395.field5612 < -16) {
                class395.field5612 = -16;
            }
            if (class395.field5612 > 16) {
                class395.field5612 = 16;
            }
            class395.method2373(arg2, class395.field5611 >> 2 << 10, class395.field5612 >> 1);
            class395.field5604.method487(arg0 ^ 0x6CD8, 1024, 256);
            class395.field5608.method202(true, 256, 256);
            class395.field5605.method807(4096, -55);
            class467.field6582.method1104(256, -203);
            class482.field6790 = 20;
        } else if (class482.field6790 == 20) {
            class22.method152(-31, true);
            class395.method2366(arg1, class395.field5611, class395.field5612);
            class482.field6790 = 60;
            class22.method152(-31, true);
            class232.method1474((byte) 80);
        } else if (class482.field6790 == 60) {
            if (class395.field5607.method1250(117, class395.field5606.field2571 + "_staticelements")) {
                if (!class395.field5607.method1253(22473, class395.field5606.field2571 + "_staticelements")) {
                    return;
                }
                class395.field5610 = class427.method2511(class39.field514, class395.field5607, class395.field5606.field2571 + "_staticelements", (byte) 75);
            } else {
                class395.field5610 = new class39(0);
            }
            class395.method2364();
            class482.field6790 = 70;
            class22.method152(-31, true);
            class232.method1474((byte) 80);
        } else if (class482.field6790 == 70) {
            class460.field6458 = new class358(arg1, 11, true, class465.field6503);
            class482.field6790 = 73;
            class22.method152(-31, true);
            class232.method1474((byte) 80);
        } else if (class482.field6790 == 73) {
            class40.field519 = new class358(arg1, 12, true, class465.field6503);
            class482.field6790 = 76;
            class22.method152(-31, true);
            class232.method1474((byte) 80);
        } else if (class482.field6790 == 76) {
            class338.field4931 = new class358(arg1, 14, true, class465.field6503);
            class482.field6790 = 79;
            class22.method152(arg0 - 58, true);
            class232.method1474((byte) 80);
        } else if (class482.field6790 == 79) {
            class307.field4374 = new class358(arg1, 17, true, class465.field6503);
            class482.field6790 = 82;
            class22.method152(-31, true);
            class232.method1474((byte) 80);
        } else if (class482.field6790 == 82) {
            class394.field5597 = new class358(arg1, 19, true, class465.field6503);
            class482.field6790 = 85;
            class22.method152(arg0 ^ 0xFFFFFFFA, true);
            class232.method1474((byte) 80);
        } else if (class482.field6790 == 85) {
            class462.field6466 = new class358(arg1, 22, true, class465.field6503);
            class482.field6790 = 88;
            class22.method152(arg0 - 58, true);
            class232.method1474((byte) 80);
        } else if (class482.field6790 == 88) {
            class476.field6689 = new class358(arg1, 26, true, class465.field6503);
            class482.field6790 = 91;
            class22.method152(arg0 - 58, true);
            class232.method1474((byte) 80);
        } else {
            class208.field3171 = new class358(arg1, 30, true, class465.field6503);
            class482.field6790 = 100;
            class22.method152(arg0 ^ 0xFFFFFFFA, true);
            class232.method1474((byte) 80);
            if (arg0 == 27) {
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
    public abstract void method2703(boolean arg0);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
    public static void method2758(byte arg0) {
        field6604 = null;
        if (arg0 != 100) {
            field6604 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
    public static final void method2759(int arg0) {
        int var1 = -43 / ((arg0 + 52) / 54);
        class472.field6645.method2838((byte) 14);
        field6608++;
        for (class451 var2 = (class451) class160.field2365.method2843(1123227612); var2 != null; var2 = (class451) class160.field2365.method2842(1673506446)) {
            if (var2.field6245 < 1000) {
                var2.method1510((byte) -13);
                class472.field6645.method2845(var2, (byte) 37);
            }
        }
        class472.field6645.method2840(class160.field2365, 64);
        int var3 = -1;
        if (class419.field5854 != null) {
            var3 = class419.field5854.method2157(126);
        }
        if (!class19.field260) {
            if (var3 == 0 && (class26.field339 == 1 && class476.field6690 > 2 || class253.method1577((byte) -109))) {
                var3 = 2;
            }
            if (var3 == 2 && class476.field6690 > 0 && class419.field5854 != null) {
                if (class250.field3695 == null && class81.field990 == 0) {
                    class325.method2058(7756, class419.field5854.method2162(true), class419.field5854.method2159(-84));
                } else {
                    class404.field5694 = 2;
                }
            }
            if (var3 == 0 && class476.field6690 > 0) {
                class96.method547(1);
            }
            if (class250.field3695 == null && class81.field990 == 0) {
                class404.field5694 = 0;
                class63.field831 = null;
                return;
            }
            return;
        }
        if (var3 == -1) {
            int var4 = class262.field3832.method175(-60);
            int var5 = class262.field3832.method177(-60);
            if ((class142.field1888 - 10) > var4 || var4 > class142.field1888 + class104.field1324 + 10 || class151.field2246 - 10 > var5 || class151.field2246 - (-class467.field6587 - 10) < var5) {
                class19.field260 = false;
                class382.method2306(class151.field2246, 0, class142.field1888, class104.field1324, class467.field6587);
            }
        }
        if (var3 != 0) {
            return;
        }
        int var6 = class142.field1888;
        int var7 = class151.field2246;
        int var8 = class104.field1324;
        int var9 = class419.field5854.method2162(true);
        int var10 = class419.field5854.method2159(-92);
        int var11 = -1;
        for (int var12 = 0; var12 < class476.field6690; var12++) {
            if (class103.field1317) {
                int var16 = (class476.field6690 - var12 - 1) * 16 + (var7 + 33);
                if (var9 > var6 && var9 < (var6 + var8) && var10 > (var16 - 13) && var10 < (var16 + 4)) {
                    var11 = var12;
                }
            } else {
                int var17 = (class476.field6690 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < (var6 + var8) && var17 - 13 < var10 && var10 < (var17 + 3)) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class449 var14 = new class449(class160.field2365);
            for (class451 var15 = (class451) var14.method2621(1); var15 != null; var15 = (class451) var14.method2619((byte) 60)) {
                if (var11 == var13) {
                    class142.method891(var15, var9, (byte) -86, var10);
                }
                var13++;
            }
        }
        class19.field260 = false;
        class382.method2306(class151.field2246, 0, class142.field1888, class104.field1324, class467.field6587);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)Z")
    public abstract boolean method2712(int arg0, int arg1);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Z")
    public static final boolean method2760(byte arg0) {
        field6607++;
        try {
            if (class327.field4741 == 2) {
                if (class24.field311 == null) {
                    class24.field311 = class340.method2146(client.field2623, class206.field3157, class405.field5701);
                    if (class24.field311 == null) {
                        return false;
                    }
                }
                if (class132.field1744 == null) {
                    class132.field1744 = new class138(class216.field3252, class75.field916);
                }
                if (class330.field4781.method782(class132.field1744, -1, class24.field311, class325.field4692, 22050)) {
                    class330.field4781.method777(-222632121);
                    class330.field4781.method776(class222.field3376, false);
                    class330.field4781.method761(class24.field311, class256.field3761, 29882);
                    client.field2623 = null;
                    class132.field1744 = null;
                    class24.field311 = null;
                    class327.field4741 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class330.field4781.method766((byte) -120);
            class132.field1744 = null;
            client.field2623 = null;
            class327.field4741 = 0;
            class24.field311 = null;
        }
        if (arg0 >= -13) {
            field6605 = 83;
        }
        return false;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
    public abstract void method2702(int arg0);
}
