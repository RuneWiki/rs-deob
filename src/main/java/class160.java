import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class160 extends class331 {

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "Lnga;")
    public static class256 field2049;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "[[Z")
    public static boolean[][] field2047;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
    public static void method988(byte arg0) {
        field2049 = null;
        if (arg0 != -75) {
            method989((byte) -16);
        }
        field2047 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field2046;
        if (arg0 != -1959) {
            field2049 = null;
        }
        if (super.field4202 < 0 || ~super.field4202 < -5) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return -113;
        } else {
            ++field2053;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)V")
    public static final void method989(byte arg0) {
        if (!class322.field4113) {
            class44.field664 = ~class653.field8993 != 0 && class653.field8993 <= class573.field8011 || class84.field1083 < (!class95.field1206 ? 22 : 26) + class573.field8011 * 16;
        }
        ++field2051;
        class327.field4175.method3114(true);
        class8.field88.method3114(true);
        for (class718 var1 = (class718) class565.field7906.method3111(96); var1 != null; var1 = (class718) class565.field7906.method3116(-40)) {
            int var38 = var1.field10134;
            if (~var38 > -1001) {
                var1.method3426((byte) -63);
                if (var38 != 10 && ~var38 != -6 && ~var38 != -59 && var38 != 25 && ~var38 != -47 && ~var38 != -48 && ~var38 != -12) {
                    class327.field4175.method3110(var1, 1);
                } else {
                    class8.field88.method3110(var1, arg0 ^ -35);
                }
            }
        }
        class327.field4175.method3108(class565.field7906, -90);
        class8.field88.method3108(class565.field7906, arg0 + -74);
        if (arg0 != -36) {
            field2049 = null;
        }
        if (class573.field8011 <= 1) {
            class750.field10502 = null;
            class730.field10214 = null;
        } else {
            if (class20.field259 && class333.field4297.method2924(-30303, 81) && class573.field8011 > 2) {
                class750.field10502 = (class718) class565.field7906.field7718.field8742.field8742;
            } else {
                class750.field10502 = (class718) class565.field7906.field7718.field8742;
            }
            class730.field10214 = (class718) class565.field7906.field7718.field8742;
        }
        int var2 = -1;
        class283 var3 = (class283) class679.field9210.method3111(104);
        if (var3 != null) {
            var2 = var3.method1701(114);
        }
        if (!class322.field4113) {
            if (var2 == 0 && (~class548.field7734 == -2 && ~class573.field8011 < -3 || class292.method1751((byte) 71))) {
                var2 = 2;
            }
            if (~var2 == -3 && class573.field8011 > 0 && var3 != null) {
                if (class85.field1090 == null && class598.field8294 == 0) {
                    class595.method3294(false, var3.method1706(true), var3.method1702((byte) -29));
                } else {
                    class128.field1555 = 2;
                }
            }
            if (~var2 == -1) {
                if (class750.field10502 == null) {
                    if (class138.field1656) {
                        class463.method2742((byte) 88);
                    }
                } else {
                    class449.method2644((byte) 68);
                }
            }
            if (class85.field1090 == null && class598.field8294 == 0) {
                class128.field1555 = 0;
                class115.field1415 = null;
            }
        } else {
            if (var2 == -1) {
                int var4 = class402.field5566.method2337(-124);
                int var5 = class402.field5566.method2336((byte) 122);
                boolean var6 = false;
                if (class691.field9807 != null) {
                    if (~(class471.field6767 + -10) >= ~var4 && ~(class471.field6767 - (-class713.field10038 + -10)) <= ~var4 && var5 >= class475.field6798 + -10 && ~(class475.field6798 + 10 + class200.field2558) <= ~var5) {
                        var6 = true;
                    } else {
                        class521.method2994(123);
                    }
                }
                if (!var6) {
                    if (~(class333.field4301 - 10) >= ~var4 && ~(class333.field4301 - (-class521.field7340 - 10)) <= ~var4 && class649.field8919 - 10 <= var5 && class649.field8919 - -class382.field5329 + 10 >= var5) {
                        if (class44.field664) {
                            int var7 = -1;
                            int var8 = -1;
                            for (int var9 = 0; class1.field1 > var9; ++var9) {
                                if (class95.field1206) {
                                    int var10 = class649.field8919 - (-33 - var9 * 16);
                                    if (~var5 < ~(var10 - 13) && ~var5 > ~(var10 + 4)) {
                                        var8 = var10 + -13;
                                        var7 = var9;
                                        break;
                                    }
                                } else {
                                    int var11 = class649.field8919 - -(var9 * 16) + 31;
                                    if (var11 + -13 < var5 && var11 + 3 > var5) {
                                        var7 = var9;
                                        var8 = var11 + -13;
                                        break;
                                    }
                                }
                            }
                            if (var7 != -1) {
                                int var12 = 0;
                                class260 var13 = new class260(class681.field9283);
                                for (class359 var14 = (class359) var13.method1577(1); var14 != null; var14 = (class359) var13.method1578((byte) 30)) {
                                    if (~var7 == ~var12) {
                                        if (~var14.field5121 < -2) {
                                            class155.method971(var5, var8, (byte) -7, var14);
                                        }
                                        break;
                                    }
                                    ++var12;
                                }
                            }
                        }
                    } else {
                        class266.method1602((byte) -99);
                    }
                }
            }
            if (var2 == 0) {
                int var15 = var3.method1702((byte) -110);
                int var16 = var3.method1706(true);
                if (class691.field9807 != null && ~class471.field6767 >= ~var15 && ~(class713.field10038 + class471.field6767) <= ~var15 && ~class475.field6798 >= ~var16 && ~(class475.field6798 + class200.field2558) <= ~var16) {
                    int var17 = -1;
                    for (int var18 = 0; class691.field9807.field5121 > var18; ++var18) {
                        if (!class95.field1206) {
                            int var22 = class475.field6798 - -31 - -(var18 * 16);
                            if (var16 > var22 + -13 && var22 + 3 > var16) {
                                var17 = var18;
                            }
                        } else {
                            int var23 = class475.field6798 - -33 - -(var18 * 16);
                            if (var16 > var23 + -13 && var16 < var23 + 4) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class260 var20 = new class260(class691.field9807.field5117);
                        for (class718 var21 = (class718) var20.method1577(arg0 ^ -35); var21 != null; var21 = (class718) var20.method1578((byte) 30)) {
                            if (var17 == var19) {
                                class268.method1607((byte) -16, var15, var21, var16);
                                break;
                            }
                            ++var19;
                        }
                    }
                    class266.method1602((byte) -87);
                    return;
                }
                if (var15 >= class333.field4301 && ~var15 >= ~(class333.field4301 - -class521.field7340) && ~class649.field8919 >= ~var16 && ~var16 >= ~(class649.field8919 - -class382.field5329)) {
                    if (!class44.field664) {
                        int var24 = -1;
                        for (int var25 = 0; var25 < class573.field8011; ++var25) {
                            if (class95.field1206) {
                                int var29 = (-var25 + class573.field8011 + -1) * 16 + class649.field8919 + 33;
                                if (~var16 < ~(var29 + -13) && ~(var29 + 4) < ~var16) {
                                    var24 = var25;
                                }
                            } else {
                                int var30 = (-var25 + class573.field8011 + -1) * 16 + class649.field8919 + 31;
                                if (~var16 < ~(var30 + -13) && ~(var30 + 3) < ~var16) {
                                    var24 = var25;
                                }
                            }
                        }
                        if (var24 != -1) {
                            int var26 = 0;
                            class371 var27 = new class371(class565.field7906);
                            for (class718 var28 = (class718) var27.method2266((byte) 123); var28 != null; var28 = (class718) var27.method2267((byte) 70)) {
                                if (~var24 == ~var26) {
                                    class268.method1607((byte) -16, var15, var28, var16);
                                    break;
                                }
                                ++var26;
                            }
                        }
                        class266.method1602((byte) -27);
                        return;
                    }
                    int var31 = -1;
                    for (int var32 = 0; ~var32 > ~class1.field1; ++var32) {
                        if (!class95.field1206) {
                            int var33 = var32 * 16 + class649.field8919 + 31;
                            if (var16 > var33 - 13 && ~var16 > ~(var33 - -3)) {
                                var31 = var32;
                                break;
                            }
                        } else {
                            int var34 = class649.field8919 + 33 - -(var32 * 16);
                            if (~(var34 + -13) > ~var16 && ~(var34 - -4) < ~var16) {
                                var31 = var32;
                                break;
                            }
                        }
                    }
                    if (var31 != -1) {
                        int var35 = 0;
                        class260 var36 = new class260(class681.field9283);
                        for (class359 var37 = (class359) var36.method1577(arg0 ^ -35); var37 != null; var37 = (class359) var36.method1578((byte) 30)) {
                            if (var31 == var35) {
                                class268.method1607((byte) -16, var15, (class718) var37.field5117.field6099.field8705, var16);
                                class266.method1602((byte) -123);
                                return;
                            }
                            ++var35;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
    public static final void method990(int arg0) {
        if (!class374.method2276(false, class668.field9150) && !class189.method1198(class668.field9150, arg0 + 1087940447)) {
            int var1 = class339.field4374.field435[0] >> 3;
            int var2 = class339.field4374.field426[0] >> 3;
            if (~var1 <= -1 && ~var1 > ~(class613.field8591 >> 3) && var2 >= 0 && class1.field3 >> 3 > var2) {
                class635.method3451(5000, -12989, var2, var1);
            } else {
                class635.method3451(0, -12989, class1.field3 >> 4, class613.field8591 >> 4);
            }
        } else {
            class635.method3451(5000, -12989, class407.field5744 >> 12, class505.field7134 >> 12);
        }
        ++field2052;
        if (arg0 != -1087940572) {
            method990(-68);
        }
        class379.method2296(arg0 ^ -1087935530);
        class153.method948((byte) 117);
        class284.method1707(true);
        class713.method3951(arg0 ^ 1087940570);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lts;)V")
    public class160(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(ILts;)V")
    public class160(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        ++field2054;
        if (arg0 <= 113) {
            field2049 = null;
        }
        super.field4202 = arg1;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)[Lan;")
    public static final class182[] method991(int arg0) {
        ++field2055;
        if (arg0 != 4) {
            method990(31);
        }
        return new class182[] { class513.field7231, class468.field6735, class754.field10516, class384.field5342, class685.field9701, class271.field3432, class250.field3174, class527.field7442, class635.field8796, class302.field3887, class571.field7962, class507.field7167, class510.field7198, class573.field8005 };
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        if (arg1 != 1) {
            method990(-52);
        }
        ++field2050;
        return 1;
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)I")
    public final int method992(byte arg0) {
        if (arg0 > -119) {
            return 42;
        } else {
            ++field2048;
            return super.field4202;
        }
    }
}
