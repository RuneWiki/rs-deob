import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class674 {

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "Llga;")
    private class711 field9133;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Lms;")
    public static class758 field9135 = new class758();

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field9142 = 0;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field9141 = 0;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field9143 = -1;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "Lkha;")
    private class583 field9134;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static final void method3681(int arg0) {
        field9138++;
        class650.method3580((byte) 65, false);
        class164.field2261 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class499.field7164.length; var2++) {
            if (class539.field7560[var2] != -1 && class499.field7164[var2] == null) {
                class499.field7164[var2] = class299.field4218.method2100(0, (byte) 112, class539.field7560[var2]);
                if (class499.field7164[var2] == null) {
                    class164.field2261++;
                    var1 = false;
                }
            }
            if (class46.field546[var2] != -1 && class500.field7181[var2] == null) {
                class500.field7181[var2] = class299.field4218.method2103(class46.field546[var2], class268.field3822[var2], (byte) 105, 0);
                if (class500.field7181[var2] == null) {
                    class164.field2261++;
                    var1 = false;
                }
            }
            if (class401.field5698[var2] != -1 && class604.field8481[var2] == null) {
                class604.field8481[var2] = class299.field4218.method2100(0, (byte) 112, class401.field5698[var2]);
                if (class604.field8481[var2] == null) {
                    class164.field2261++;
                    var1 = false;
                }
            }
            if (class61.field753[var2] != -1 && class636.field8763[var2] == null) {
                class636.field8763[var2] = class299.field4218.method2100(0, (byte) 112, class61.field753[var2]);
                if (class636.field8763[var2] == null) {
                    var1 = false;
                    class164.field2261++;
                }
            }
            if (class179.field2396 != null && class376.field5273[var2] == null && class179.field2396[var2] != -1) {
                class376.field5273[var2] = class299.field4218.method2103(class179.field2396[var2], class268.field3822[var2], (byte) 105, 0);
                if (class376.field5273[var2] == null) {
                    class164.field2261++;
                    var1 = false;
                }
            }
        }
        if (class124.field1501 == null) {
            if (class342.field4780 == null || !class662.field9065.method2093((byte) 117, class342.field4780.field581 + "_staticelements")) {
                class124.field1501 = new class38(0);
            } else if (class662.field9065.method2091(class342.field4780.field581 + "_staticelements", -2)) {
                class124.field1501 = class638.method3539(class192.field2572, class662.field9065, (byte) -68, class342.field4780.field581 + "_staticelements");
            } else {
                var1 = false;
                class164.field2261++;
            }
        }
        if (!var1) {
            class697.field9607 = 1;
            return;
        }
        boolean var3 = true;
        class166.field2281 = 0;
        if (arg0 > -22) {
            field9141 = -22;
        }
        for (int var4 = 0; var4 < class499.field7164.length; var4++) {
            byte[] var21 = class500.field7181[var4];
            if (var21 != null) {
                int var22 = (class207.field2720[var4] >> 8) * 64 - class228.field3063;
                int var23 = (class207.field2720[var4] & 0xFF) * 64 - class3.field30;
                if (class650.field8937 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class230.method1490(class336.field4683, var21, class700.field9768, var23, (byte) -78, var22);
            }
            byte[] var24 = class636.field8763[var4];
            if (var24 != null) {
                int var25 = (class207.field2720[var4] >> 8) * 64 - class228.field3063;
                int var26 = (class207.field2720[var4] & 0xFF) * 64 - class3.field30;
                if (class650.field8937 != 0) {
                    var25 = 10;
                    var26 = 10;
                }
                var3 &= class230.method1490(class336.field4683, var24, class700.field9768, var26, (byte) -82, var25);
            }
        }
        if (!var3) {
            class697.field9607 = 2;
            return;
        }
        if (class697.field9607 != 0) {
            class660.method3621(class455.field6428, class71.field908.method588((byte) 90, class549.field7669) + "<br>(100%)", true, 123, class478.field6780, class268.field3831);
        }
        class485.method2904((byte) -117);
        class184.method1167((byte) -73);
        class682.method3818(-5685);
        boolean var5 = false;
        if (class268.field3831.method396() && class557.field7812.field6520.method77(false) == 2) {
            for (int var6 = 0; var6 < class499.field7164.length; var6++) {
                if (class636.field8763[var6] != null || class604.field8481[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class557.field7812.field6557.method3237(false) == 1) {
            var7 = class252.field3688[class404.field5716];
        } else {
            var7 = class587.field8273[class404.field5716];
        }
        if (class268.field3831.method462()) {
            var7++;
        }
        class79.method623(class268.field3831, class509.field7281, 9, 4, class336.field4683, class700.field9768, var7, var5, class268.field3831.method404() > 0);
        class439.method2652(class353.field5025);
        if (class353.field5025 == 0) {
            class546.method3161(null);
        } else {
            class546.method3161(class352.field4974);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class147.field2114[var8].method1871((byte) 83);
        }
        class234.method1504(109);
        class344.method2225(false, -257);
        class614.method3436(-125);
        class745.field10351 = null;
        class3.field27 = false;
        class485.method2904((byte) -106);
        System.gc();
        class650.method3580((byte) 78, true);
        class189.method1188((byte) -73);
        class138.field2004 = class557.field7812.field6542.method1222(false);
        class454.field6419 = class698.field9627 >= 96;
        class534.field7517 = class557.field7812.field6520.method77(false) == 2;
        class106.field1275 = class557.field7812.field6548.method20(false) == 1;
        class349.field4945 = class557.field7812.field6532.method1419(false) == 1 ? -1 : class310.field4320;
        class299.field4222 = class557.field7812.field6546.method1308(false) == 1;
        class195.field2596 = class557.field7812.field6522.method2865(false) == 1;
        class403.field5705 = new class735(4, class336.field4683, class700.field9768, false);
        if (class650.field8937 == 0) {
            class752.method4182((byte) 99, class499.field7164, class403.field5705);
        } else {
            class588.method3331(-1, class403.field5705, class499.field7164);
        }
        class288.method1888(class336.field4683 >> 4, class700.field9768 >> 4, false);
        class692.method3888((byte) -116);
        if (var5) {
            class695.method3920(true);
            class199.field2626 = new class735(1, class336.field4683, class700.field9768, true);
            if (class650.field8937 == 0) {
                class752.method4182((byte) 108, class604.field8481, class199.field2626);
                class650.method3580((byte) 126, true);
            } else {
                class588.method3331(-1, class199.field2626, class604.field8481);
                class650.method3580((byte) 63, true);
            }
            class199.field2626.method2676(class403.field5705.field6352[0], true, 0);
            class199.field2626.method2682(null, null, class268.field3831, 127);
            class695.method3920(false);
        }
        class403.field5705.method2682(class147.field2114, var5 ? class199.field2626.field6352 : null, class268.field3831, -111);
        if (class650.field8937 == 0) {
            class650.method3580((byte) 87, true);
            class9.method57(class403.field5705, -1754610264, class500.field7181);
            if (class376.field5273 != null) {
                class295.method1918((byte) -77);
            }
        } else {
            class650.method3580((byte) 101, true);
            class463.method2754(class500.field7181, class403.field5705, 9454);
        }
        class184.method1167((byte) -73);
        if (class698.field9627 < 96) {
            class162.method1065(false);
        }
        class650.method3580((byte) 111, true);
        class403.field5705.method2684(var5 ? class135.field1969[0] : null, -1, class268.field3831, null);
        class403.field5705.method4113(class268.field3831, false, (byte) -105);
        class650.method3580((byte) 92, true);
        if (var5) {
            class695.method3920(true);
            class650.method3580((byte) 53, true);
            if (class650.field8937 == 0) {
                class9.method57(class199.field2626, -1754610264, class636.field8763);
            } else {
                class463.method2754(class636.field8763, class199.field2626, 9454);
            }
            class184.method1167((byte) -73);
            class650.method3580((byte) 83, true);
            class199.field2626.method2684(null, -1, class268.field3831, class588.field8292[0]);
            class199.field2626.method4113(class268.field3831, true, (byte) -80);
            class650.method3580((byte) 79, true);
            class695.method3920(false);
        }
        class289.method1890(true);
        int var9 = class403.field5705.field10246;
        if (var9 > class526.field7430) {
            var9 = class526.field7430;
        }
        if (var9 < (class526.field7430 - 1)) {
            var9 = class526.field7430 - 1;
        }
        if (class557.field7812.field6532.method1419(false) == 0) {
            class638.method3542(var9);
        } else {
            class638.method3542(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class336.field4683; var19++) {
                for (int var20 = 0; var20 < class700.field9768; var20++) {
                    class64.method541(var20, var19, -10615, var10);
                }
            }
        }
        class405.method2515(-124);
        class485.method2904((byte) 118);
        class2.method7(-126);
        class184.method1167((byte) -73);
        class711.method3998(27920);
        if (class387.field5484 != null && class333.field4663 != null && class222.field2897 == 11) {
            class633.field8735++;
            class519 var11 = class357.method2293(class427.field5994, class335.field4669, (byte) 111);
            var11.field7384.method3733(-49, 1057001181);
            class151.method1027(var11, -65);
        }
        if (class650.field8937 == 0) {
            int var12 = (class186.field2513 - (class336.field4683 >> 4)) / 8;
            int var13 = (class186.field2513 + (class336.field4683 >> 4)) / 8;
            int var14 = (class557.field7832 - (class700.field9768 >> 4)) / 8;
            int var15 = ((class700.field9768 >> 4) + class557.field7832) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var16 > var13 || var14 > var17 || var17 > var15) {
                        class299.field4218.method2106((byte) -95, "m" + var16 + "_" + var17);
                        class299.field4218.method2106((byte) -17, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class222.field2897 == 4) {
            class60.method514(false, 3);
        } else if (class222.field2897 == 8) {
            class60.method514(false, 7);
        } else {
            class60.method514(false, 10);
            if (class333.field4663 != null) {
                class519 var18 = class357.method2293(class427.field5994, class443.field6307, (byte) -76);
                class151.method1027(var18, -20);
            }
        }
        class444.method2670(true);
        class485.method2904((byte) -91);
        class701.method3948((byte) 92);
        class230.field3098 = true;
        if (class609.field8572) {
            class559.method3221("Took: " + (class479.method2864((byte) -66) - class690.field9424) + "ms", (byte) 77);
            class609.field8572 = false;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
    public static final void method3682(int arg0, int arg1) {
        field9131++;
        int var2 = -7 / ((arg0 - 81) / 45);
        class106.method758(-64);
        int var3 = class472.field6696.method4042(arg1, (byte) 108).field539;
        if (var3 == 0) {
            return;
        }
        int var4 = class101.field1201.field4275[arg1];
        if (var3 == 6) {
            class692.field9542 = var4;
        }
        if (var3 == 5) {
            class499.field7167 = var4;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public static void method3683(int arg0) {
        if (arg0 != 0) {
            method3687(-54, 19);
        }
        field9135 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Lkha;")
    public final class583 method3684(byte arg0) {
        if (arg0 != 106) {
            method3682(11, 61);
        }
        field9132++;
        class583 var2 = this.field9134;
        if (this.field9133.field9891 == var2) {
            this.field9134 = null;
            return null;
        } else {
            this.field9134 = var2.field8206;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
    public class674() {
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)Lkha;")
    public final class583 method3685(boolean arg0) {
        field9139++;
        class583 var2 = this.field9133.field9891.field8206;
        if (this.field9133.field9891 == var2) {
            this.field9134 = null;
            return null;
        }
        this.field9134 = var2.field8206;
        if (!arg0) {
            this.field9133 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILfp;I)Loia;")
    public static final class88 method3686(int arg0, class323 arg1, int arg2) {
        if (arg0 != -20770) {
            field9144 = -26;
        }
        field9137++;
        class88 var3 = (class88) class600.field8425.method4022((long) arg2, (byte) 98);
        if (var3 == null) {
            if (class453.field6401) {
                var3 = class268.field3831.method484(class204.method1247(arg1, arg2), true);
            } else {
                var3 = class86.method649(arg1.method2108(arg2, arg0 + 20770), 111);
            }
            class600.field8425.method4018((byte) 127, var3, (long) arg2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Llga;)V")
    public class674(class711 arg0) {
        this.field9133 = arg0;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)Z")
    public static final boolean method3687(int arg0, int arg1) {
        if (arg0 == 0) {
            field9136++;
            return arg1 == 3 || arg1 == 4;
        } else {
            return false;
        }
    }
}
