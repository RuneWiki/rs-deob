import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class217 extends class104 {

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public int field3817;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Le;")
    private static class191 field3824 = class54.method368("wave:", 2047);

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "Le;")
    public static class191 field3822 = field3824;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "Le;")
    public static class191 field3828 = field3824;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lng;BLng;Lng;Lre;)Z")
    public static final boolean method1475(class121 arg0, byte arg1, class121 arg2, class121 arg3, class221 arg4) {
        class225.field4030 = arg3;
        class35.field647 = arg2;
        if (arg1 >= -79) {
            field3828 = null;
        }
        class141.field2359 = arg0;
        field3831++;
        class42.field733 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
    public static int method1476(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)Z")
    public final boolean method1477(int arg0, byte arg1, int arg2) {
        field3825++;
        if (arg1 == -92) {
            return this.field3829 <= arg2 && this.field3817 >= arg2 && this.field3819 <= arg0 && arg0 <= this.field3827;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lqb;IIII)V")
    public static final void method1478(class76 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3823++;
        if (class175.field2946 == arg0 || class167.field2824 >= 400) {
            return;
        }
        class191 var5;
        if (arg0.field1327 == 0) {
            var5 = class228.method1629(new class191[] { arg0.method494((byte) 106), class26.method189(arg0.field1330, false, class175.field2946.field1330), class43.field753, class239.field4245, class92.method563(-78, arg0.field1330), class190.field3335 }, (byte) -20);
        } else {
            var5 = class228.method1629(new class191[] { arg0.method494((byte) -53), class43.field753, class147.field2481, class92.method563(-101, arg0.field1327), class190.field3335 }, (byte) -119);
        }
        if (class192.field3446 == 1) {
            class211.field3742++;
            class223.method1549(class266.field4708, (long) arg4, 500, arg3, (short) 13, arg1, class228.method1629(new class191[] { class69.field1216, class27.field395, var5 }, (byte) -44));
        } else if (!class197.field3523) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class22.field312[var6] != null) {
                    short var8 = 0;
                    if (class83.field1394 == 0 && class22.field312[var6].method1351(-23098, class175.field2932)) {
                        if (arg0.field1330 > class175.field2946.field1330) {
                            var8 = 2000;
                        }
                        if (class175.field2946.field1310 != 0 && arg0.field1310 != 0) {
                            if (class175.field2946.field1310 == arg0.field1310) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class112.field1878[var6]) {
                        var8 = 2000;
                    }
                    class56.field1023++;
                    boolean var9 = false;
                    short var10 = client.field1745[var6];
                    short var11 = (short) (var8 + var10);
                    class223.method1549(class22.field312[var6], (long) arg4, 500, arg3, var11, arg1, class228.method1629(new class191[] { class223.field3980, var5 }, (byte) -63));
                }
            }
        } else if ((class147.field2482 & 0x8) == 8) {
            class223.method1549(class14.field171, (long) arg4, 500, arg3, (short) 34, arg1, class228.method1629(new class191[] { class45.field806, class27.field395, var5 }, (byte) -107));
            class261.field4620++;
        }
        for (int var7 = 0; var7 < class167.field2824; var7++) {
            if (class188.field3306[var7] == 9) {
                class33.field475[var7] = class228.method1629(new class191[] { class223.field3980, var5 }, (byte) -123);
                break;
            }
        }
        if (arg2 != 104) {
            field3828 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
    public static final void method1479(int arg0, int arg1) {
        field3826++;
        class241 var2 = class14.method97(arg0, arg1, -56);
        var2.method1691(0);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
    public static void method1480(int arg0) {
        field3824 = null;
        if (arg0 != 400) {
            field3822 = null;
        }
        field3828 = null;
        field3822 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILeg;)V")
    public static final void method1481(int arg0, class33 arg1) {
        if (arg0 != 150) {
            return;
        }
        field3818++;
        int var2 = arg1.field483;
        if (var2 == 324) {
            if (class250.field4454 == -1) {
                class192.field3427 = arg1.field532;
                class250.field4454 = arg1.field500;
            }
            if (class149.field2579.field3099) {
                arg1.field500 = class250.field4454;
            } else {
                arg1.field500 = class192.field3427;
            }
        } else if (var2 == 325) {
            if (class250.field4454 == -1) {
                class250.field4454 = arg1.field500;
                class192.field3427 = arg1.field532;
            }
            if (class149.field2579.field3099) {
                arg1.field500 = class192.field3427;
            } else {
                arg1.field500 = class250.field4454;
            }
        } else if (var2 == 327) {
            arg1.field603 = 150;
            arg1.field510 = (int) (Math.sin((double) class135.field2267 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field505 = 5;
            arg1.field518 = -1;
        } else if (var2 == 328) {
            if (class175.field2946.field1315 == null) {
                arg1.field518 = 0;
            } else {
                arg1.field603 = 150;
                arg1.field510 = (int) (Math.sin((double) class135.field2267 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field505 = 5;
                arg1.field518 = ((int) class175.field2946.field1315.method1352(65) << 11) + 2047;
                arg1.field514 = class175.field2946.field2977;
                arg1.field557 = class175.field2946.field2976;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
    public static final void method1482(boolean arg0, int arg1) {
        class33.field481 = new int[104];
        class176.field2991 = new int[104];
        class138.field2331 = new int[104];
        class132.field2225 = new int[104];
        field3820++;
        class149.field2567 = new int[104];
        class65.field1141 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        if (arg1 < 36) {
            field3821 = -87;
        }
        class79.field1342 = new byte[var2][104][104];
        class40.field722 = new byte[var2][104][104];
        class226.field4066 = new byte[var2][104][104];
        class14.field175 = new byte[var2][104][104];
        class59.field1075 = new byte[var2][105][105];
        class129.field2140 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIII)V")
    public class217(int arg0, int arg1, int arg2, int arg3) {
        this.field3829 = arg0;
        this.field3827 = arg3;
        this.field3819 = arg1;
        this.field3817 = arg2;
    }
}
