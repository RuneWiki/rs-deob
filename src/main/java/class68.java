import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class68 extends class72 {

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "[I")
    public static int[] field1230 = new int[25];

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "Ltaa;")
    public static class405 field1225 = new class405();

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "[I")
    public static int[] field1233;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZIIII)V", line = 3)
    public static final void method709(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == -1) {
            ++field1228;
            if (arg0 || class440.field6143 != arg1 || class544.field7683 != arg4 || ~class569.field8104 != ~class312.field4409 && ~class471.field6781.field6704.method2015(27669) != -2) {
                class569.field8104 = class312.field4409;
                class544.field7683 = arg4;
                class440.field6143 = arg1;
                if (class471.field6781.field6704.method2015(arg2 + 27670) == 1) {
                    class569.field8104 = 0;
                }
                class19.method122(1, arg3);
                class379.method2375(class359.field5046, true, class281.field3953.method1839((byte) 45, class744.field10426), (byte) 126, class722.field10090, class436.field6100);
                int var5 = class115.field1845;
                int var6 = class64.field1160;
                class115.field1845 = (-(class174.field2540 >> 4) + class440.field6143) * 8;
                class64.field1160 = (-(class716.field9999 >> 4) + class544.field7683) * 8;
                class717.field10034 = class542.method3209(class440.field6143 * 8, class544.field7683 * 8);
                class609.field8826 = null;
                int var7 = -var5 + class115.field1845;
                int var8 = -var6 + class64.field1160;
                if (arg3 != 11) {
                    boolean var9 = false;
                    class152.field2290 = 0;
                    int var10 = class174.field2540 * 512 - 512;
                    int var11 = class716.field9999 * 512 - 512;
                    for (int var12 = 0; ~var12 > ~class130.field1948; ++var12) {
                        class272 var13 = class379.field5284[var12];
                        if (var13 != null) {
                            class84 var14 = var13.field3885;
                            var14.field644 -= var7 * 512;
                            var14.field648 -= var8 * 512;
                            if (~var14.field644 <= -1 && ~var10 <= ~var14.field644 && ~var14.field648 <= -1 && var14.field648 <= var11) {
                                boolean var15 = true;
                                for (int var16 = 0; ~var16 > -11; ++var16) {
                                    var14.field991[var16] -= var7;
                                    var14.field995[var16] -= var8;
                                    if (~var14.field991[var16] > -1 || var14.field991[var16] >= class174.field2540 || var14.field995[var16] < 0 || class716.field9999 <= var14.field995[var16]) {
                                        var15 = false;
                                    }
                                }
                                if (var15) {
                                    class323.field4590[class152.field2290++] = var14.field931;
                                } else {
                                    var14.method809((class488) null, -1);
                                    var13.method3617(arg2 ^ -2);
                                    var9 = true;
                                }
                            } else {
                                var14.method809((class488) null, -1);
                                var13.method3617(1);
                                var9 = true;
                            }
                        }
                    }
                    if (var9) {
                        class130.field1948 = class758.field10539.method4208(false);
                        class758.field10539.method4201(125, class379.field5284);
                    }
                } else {
                    for (int var17 = 0; ~var17 > ~class130.field1948; ++var17) {
                        class272 var30 = class379.field5284[var17];
                        if (var30 != null) {
                            class84 var31 = var30.field3885;
                            for (int var32 = 0; ~var32 > -11; ++var32) {
                                var31.field991[var32] -= var7;
                                var31.field995[var32] -= var8;
                            }
                            var31.field644 -= var7 * 512;
                            var31.field648 -= var8 * 512;
                        }
                    }
                }
                for (int var18 = 0; ~var18 > -2049; ++var18) {
                    class349 var28 = class165.field2442[var18];
                    if (var28 != null) {
                        for (int var29 = 0; var29 < 10; ++var29) {
                            var28.field991[var29] -= var7;
                            var28.field995[var29] -= var8;
                        }
                        var28.field644 -= var7 * 512;
                        var28.field648 -= var8 * 512;
                    }
                }
                class340[] var19 = class220.field3146;
                for (int var20 = 0; var19.length > var20; ++var20) {
                    class340 var27 = var19[var20];
                    if (var27 != null) {
                        var27.field4785 -= var7 * 512;
                        var27.field4783 -= var8 * 512;
                    }
                }
                for (class226 var21 = (class226) class476.field6811.method1522(true); var21 != null; var21 = (class226) class476.field6811.method1527((byte) 99)) {
                    var21.field3237 -= var7;
                    var21.field3225 -= var8;
                    if (~class564.field7978 != -5 && (var21.field3237 < 0 || var21.field3225 < 0 || ~class174.field2540 >= ~var21.field3237 || ~class716.field9999 >= ~var21.field3225)) {
                        var21.method3617(1);
                    }
                }
                if (class564.field7978 != 4) {
                    for (class694 var22 = (class694) class136.field2123.method4209(false); var22 != null; var22 = (class694) class136.field2123.method4207(9356)) {
                        int var23 = (int) (16383L & var22.field8991);
                        int var24 = -class115.field1845 + var23;
                        int var25 = (int) (16383L & var22.field8991 >> 14);
                        int var26 = -class64.field1160 + var25;
                        if (var24 < 0 || ~var26 > -1 || class174.field2540 <= var24 || class716.field9999 <= var26) {
                            var22.method3617(arg2 ^ -2);
                        }
                    }
                }
                if (class318.field4513 != 0) {
                    class334.field4722 -= var8;
                    class318.field4513 -= var7;
                }
                class511.method3056(0);
                if (arg3 != 11) {
                    class435.field6080 -= var7;
                    class348.field4891 -= var7;
                    class260.field3810 -= var8 * 512;
                    class268.field3874 -= var8;
                    class685.field9660 -= var7 * 512;
                    class668.field9370 -= var8;
                    if (Math.abs(var7) > class174.field2540 || Math.abs(var8) > class716.field9999) {
                        class246.method1631(false);
                    }
                } else if (~class666.field9338 != -5) {
                    class411.field5689 = -1;
                    class679.field9569 = -1;
                    class666.field9338 = 1;
                } else {
                    class211.field3044 -= var8 * 512;
                    class218.field3100 -= var7 * 512;
                    class246.field3437 -= var8 * 512;
                    class701.field9841 -= var7 * 512;
                }
                class27.method196(31939);
                class615.method3536((byte) 88);
                class567.field8051.method1530((byte) 84);
                class562.field7965.method1530((byte) 90);
                class99.field1678.method4160((byte) -77);
                class330.method2102(0);
            }
        }
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lcq;)V", line = 275)
    public class68(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)I", line = 279)
    public final int method710(int arg0) {
        ++field1224;
        return arg0 != 27669 ? 107 : super.field1282;
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(II)Z", line = 291)
    public static final boolean method711(int arg0, int arg1) {
        if (arg1 >= -72) {
            method711(54, 115);
        }
        ++field1231;
        return arg0 >= 0 && ~arg0 >= -4 || ~arg0 == -10;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V", line = 303)
    public static void method712(byte arg0) {
        if (arg0 != -96) {
            field1225 = null;
        }
        field1225 = null;
        field1233 = null;
        field1230 = null;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)I", line = 316)
    public final int method60(int arg0) {
        ++field1229;
        if (arg0 != -3271) {
            field1230 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)V", line = 327)
    public final void method59(int arg0, int arg1) {
        if (arg1 != 3) {
            field1233 = null;
        }
        super.field1282 = arg0;
        ++field1227;
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(ILcq;)V", line = 339)
    public class68(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V", line = 345)
    public final void method55(int arg0) {
        if (~super.field1282 != -2 && super.field1282 != 0) {
            super.field1282 = this.method60(-3271);
        }
        if (arg0 <= 30) {
            method712((byte) -94);
        }
        ++field1232;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(II)I", line = 359)
    public final int method58(int arg0, int arg1) {
        ++field1226;
        if (arg1 != 11260) {
            field1230 = null;
        }
        return 1;
    }
}
