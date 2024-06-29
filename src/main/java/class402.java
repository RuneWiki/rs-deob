import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class402 extends class466 {

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    private int field5727;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "Lit;")
    public static class555 field5723 = new class555();

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIILhv;)V")
    public static final void method2403(byte arg0, int arg1, int arg2, class442 arg3) {
        ++field5724;
        if (arg3 != null && class448.field6352.field892 != arg3) {
            int var4 = arg3.field6293;
            int var5 = arg3.field6291;
            int var6 = arg3.field6298;
            int var7 = (int) arg3.field6297;
            long var8 = arg3.field6297;
            if (var6 >= 2000) {
                var6 -= 2000;
            }
            if (~var6 == -3) {
                class342.field4608 = 0;
                class341.field4590 = 2;
                class96.field1461 = arg1;
                ++class316.field4250;
                class16.field210 = arg2;
                class351.method2108(class324.field4370, -10511);
                class479.field6754.method91((byte) 88, class461.field6472);
                class479.field6754.method84(class6.field80 + var5, (byte) -116);
                class479.field6754.method109(var4 - -class519.field7304, arg0 + 195);
                class479.field6754.method91((byte) 88, class103.field1566);
                class479.field6754.method68(102, class608.field8768);
                class479.field6754.method91((byte) 88, var7);
                class479.field6754.method72(-1875, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                class349.method2098(var4, var5, (byte) 116);
            }
            if (var6 == 15) {
                class188 var10 = class349.field4696[var7];
                if (var10 != null) {
                    class342.field4608 = 0;
                    class96.field1461 = arg1;
                    class341.field4590 = 2;
                    ++class587.field8410;
                    class16.field210 = arg2;
                    class351.method2108(class586.field8385, -10511);
                    class479.field6754.method91((byte) 88, var7);
                    class479.field6754.method108((byte) -128, class316.field4245.method2691(82, 19521) ? 1 : 0);
                    class45.method433(var10.method337(0), var10.field616[0], -2, var10.field618[0], 0, -124, true, 0, var10.method337(arg0 + -60));
                }
            }
            if (var6 == 1007) {
                ++class186.field2612;
                class16.field210 = arg2;
                class341.field4590 = 2;
                class342.field4608 = 0;
                class96.field1461 = arg1;
                class351.method2108(class181.field2569, -10511);
                class479.field6754.method84(var7, (byte) -107);
            }
            if (~var6 == -50) {
                if (class258.field3599 > 0 && class316.field4245.method2691(82, 19521) && class316.field4245.method2691(81, 19521)) {
                    class166.method1064(class519.field7304 + var4, -1601088218, class6.field80 - -var5, class645.field9372.field6035);
                } else {
                    class96.field1461 = arg1;
                    class341.field4590 = 1;
                    class342.field4608 = 0;
                    class16.field210 = arg2;
                    ++class367.field4990;
                    class351.method2108(class600.field8646, -10511);
                    class479.field6754.method84(class6.field80 + var5, (byte) -95);
                    class479.field6754.method109(class519.field7304 + var4, 255);
                }
            }
            if (var6 == 48) {
                class16.field210 = arg2;
                class96.field1461 = arg1;
                class342.field4608 = 0;
                ++class205.field2876;
                class341.field4590 = 2;
                class351.method2108(class92.field1426, -10511);
                class479.field6754.method76(class6.field80 + var5, (byte) 114);
                class479.field6754.method76(class519.field7304 + var4, (byte) 51);
                class479.field6754.method91((byte) 88, var7);
                class479.field6754.method72(-1875, class316.field4245.method2691(82, 19521) ? 1 : 0);
                class349.method2098(var4, var5, (byte) 116);
            }
            if (~var6 == -59) {
                class16.field210 = arg2;
                class342.field4608 = 0;
                class96.field1461 = arg1;
                ++class91.field1414;
                class341.field4590 = 2;
                class351.method2108(class350.field4702, -10511);
                class479.field6754.method109(class461.field6472, 255);
                class479.field6754.method108((byte) -128, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                class479.field6754.method117(77, class608.field8768);
                class479.field6754.method109(class519.field7304 + var4, 255);
                class479.field6754.method91((byte) 88, class103.field1566);
                class479.field6754.method76(class6.field80 + var5, (byte) 59);
                class479.field6754.method91((byte) 88, Integer.MAX_VALUE & (int) (var8 >>> 32));
                class263.method1722((byte) -81, var4, var5, var8);
            }
            if (~var6 == -6) {
                if (class258.field3599 > 0 && class316.field4245.method2691(82, 19521) && class316.field4245.method2691(81, 19521)) {
                    class166.method1064(class519.field7304 + var4, -1601088218, class6.field80 + var5, class645.field9372.field6035);
                } else {
                    class541.method3104(var5, var7, (byte) 98, var4);
                    if (~var7 == -2) {
                        class479.field6754.method108((byte) -128, -1);
                        class479.field6754.method108((byte) -128, -1);
                        class479.field6754.method84((int) class1.field13, (byte) -123);
                        class479.field6754.method108((byte) -128, 57);
                        class479.field6754.method108((byte) -128, class2.field27);
                        class479.field6754.method108((byte) -128, class353.field4779);
                        class479.field6754.method108((byte) -128, 89);
                        class479.field6754.method84(class645.field9372.field6037, (byte) -107);
                        class479.field6754.method84(class645.field9372.field6029, (byte) -103);
                        class479.field6754.method108((byte) -128, 63);
                    } else {
                        class341.field4590 = 1;
                        class96.field1461 = arg1;
                        class16.field210 = arg2;
                        class342.field4608 = 0;
                    }
                    class45.method433(1, var4, -4, var5, 0, 34, true, 0, 1);
                }
            }
            if (var6 == 1008) {
                ++class365.field4965;
                class341.field4590 = 2;
                class16.field210 = arg2;
                class342.field4608 = 0;
                class96.field1461 = arg1;
                class351.method2108(class47.field902, -10511);
                class479.field6754.method84(var7, (byte) -121);
            }
            if (~var6 == -47) {
                class188 var11 = class349.field4696[var7];
                if (var11 != null) {
                    ++class586.field8373;
                    class96.field1461 = arg1;
                    class16.field210 = arg2;
                    class341.field4590 = 2;
                    class342.field4608 = 0;
                    class351.method2108(class131.field2102, -10511);
                    class479.field6754.method124(!class316.field4245.method2691(82, 19521) ? 0 : 1, 106);
                    class479.field6754.method84(var7, (byte) -124);
                    class45.method433(var11.method337(arg0 ^ 60), var11.field616[0], -2, var11.field618[0], 0, -116, true, 0, var11.method337(0));
                }
            }
            if (~var6 == -1004 || ~var6 == -1013 || var6 == 1001 || ~var6 == -1007 || var6 == 1004) {
                class253.method1574(var4, 102, var6, var7);
            }
            if (~var6 == -9) {
                class341.field4590 = 2;
                ++class502.field6994;
                class16.field210 = arg2;
                class342.field4608 = 0;
                class96.field1461 = arg1;
                class351.method2108(class85.field1371, -10511);
                class479.field6754.method91((byte) 88, class519.field7304 + var4);
                class479.field6754.method61((byte) 82, !class316.field4245.method2691(82, arg0 ^ 19581) ? 0 : 1);
                class479.field6754.method76(class6.field80 + var5, (byte) 68);
                class479.field6754.method76(var7, (byte) 64);
                class349.method2098(var4, var5, (byte) 120);
            }
            if (var6 == 57) {
                class342.field4608 = 0;
                ++class323.field4349;
                class16.field210 = arg2;
                class96.field1461 = arg1;
                class341.field4590 = 2;
                class351.method2108(class75.field1190, -10511);
                class479.field6754.method91((byte) 88, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                class479.field6754.method84(class519.field7304 + var4, (byte) -92);
                class479.field6754.method84(var5 - -class6.field80, (byte) -111);
                class479.field6754.method108((byte) -128, class316.field4245.method2691(82, 19521) ? 1 : 0);
                class263.method1722((byte) -81, var4, var5, var8);
            }
            if (var6 == 22) {
                ++class457.field6439;
                class342.field4608 = 0;
                class341.field4590 = 2;
                class16.field210 = arg2;
                class96.field1461 = arg1;
                class351.method2108(class101.field1542, arg0 ^ -10547);
                class479.field6754.method76(class519.field7304 + var4, (byte) 108);
                class479.field6754.method76(class6.field80 + var5, (byte) 99);
                class479.field6754.method76(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 109);
                class479.field6754.method72(-1875, class316.field4245.method2691(82, 19521) ? 1 : 0);
                class263.method1722((byte) -81, var4, var5, var8);
            }
            if (~var6 == -52) {
                class114 var12 = class512.method2969(var5, var4, (byte) 100);
                if (var12 != null) {
                    class379.method2240(true, var12);
                }
            }
            if (~var6 == -60) {
                class96.field1461 = arg1;
                class342.field4608 = 0;
                ++class76.field1209;
                class16.field210 = arg2;
                class341.field4590 = 2;
                class351.method2108(class43.field816, arg0 + -10571);
                class479.field6754.method91((byte) 88, class6.field80 + var5);
                class479.field6754.method91((byte) 88, var4 - -class519.field7304);
                class479.field6754.method61((byte) 47, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                class479.field6754.method109(Integer.MAX_VALUE & (int) (var8 >>> 32), 255);
                class263.method1722((byte) -81, var4, var5, var8);
            }
            if (~var6 == -22) {
                class576 var13 = (class576) class278.field3837.method1242(0, (long) var7);
                if (var13 != null) {
                    class109 var14 = var13.field7929;
                    class342.field4608 = 0;
                    class96.field1461 = arg1;
                    class16.field210 = arg2;
                    class341.field4590 = 2;
                    ++class453.field6403;
                    class351.method2108(class589.field8421, -10511);
                    class479.field6754.method84(var7, (byte) -122);
                    class479.field6754.method77(class608.field8768, 866399271);
                    class479.field6754.method108((byte) -128, class316.field4245.method2691(82, arg0 + 19461) ? 1 : 0);
                    class479.field6754.method91((byte) 88, class461.field6472);
                    class479.field6754.method91((byte) 88, class103.field1566);
                    class45.method433(var14.method337(0), var14.field616[0], -2, var14.field618[0], 0, 81, true, 0, var14.method337(0));
                }
            }
            if (var6 == 25 || ~var6 == -1010) {
                class229.method1458(var4, arg3.field6295, var5, var7, false);
            }
            if (~var6 == -7) {
                class188 var15 = class349.field4696[var7];
                if (var15 != null) {
                    class16.field210 = arg2;
                    class341.field4590 = 2;
                    class96.field1461 = arg1;
                    class342.field4608 = 0;
                    ++class276.field3820;
                    class351.method2108(class22.field319, arg0 ^ -10547);
                    class479.field6754.method108((byte) -128, !class316.field4245.method2691(82, arg0 ^ 19581) ? 0 : 1);
                    class479.field6754.method84(var7, (byte) -109);
                    class45.method433(var15.method337(0), var15.field616[0], -2, var15.field618[0], 0, 6, true, 0, var15.method337(0));
                }
            }
            if (~var6 == -11) {
                class341.field4590 = 2;
                class342.field4608 = 0;
                class96.field1461 = arg1;
                class16.field210 = arg2;
                ++class580.field7976;
                class351.method2108(class537.field7514, -10511);
                class479.field6754.method109(class6.field80 + var5, 255);
                class479.field6754.method91((byte) 88, class519.field7304 + var4);
                class479.field6754.method109((int) (var8 >>> 32) & Integer.MAX_VALUE, 255);
                class479.field6754.method61((byte) 98, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                class263.method1722((byte) -81, var4, var5, var8);
            }
            if (~var6 == -46) {
                class341.field4590 = 1;
                class96.field1461 = arg1;
                ++class489.field6858;
                class342.field4608 = 0;
                class16.field210 = arg2;
                class351.method2108(class329.field4402, -10511);
                class479.field6754.method68(96, class608.field8768);
                class479.field6754.method76(class461.field6472, (byte) 63);
                class479.field6754.method84(class6.field80 - -var5, (byte) -117);
                class479.field6754.method84(class519.field7304 + var4, (byte) -91);
                class479.field6754.method109(class103.field1566, arg0 ^ 195);
                class45.method433(1, var4, -4, var5, 0, -108, true, 0, 1);
            }
            if (var6 == 47 && class615.field8838 == null) {
                class489.method2837(6, var5, var4);
                class615.field8838 = class512.method2969(var5, var4, (byte) 100);
                class403.method2407(class615.field8838, -9130);
            }
            if (~var6 == -18) {
                class188 var16 = class349.field4696[var7];
                if (var16 != null) {
                    class342.field4608 = 0;
                    class341.field4590 = 2;
                    class96.field1461 = arg1;
                    class16.field210 = arg2;
                    ++class299.field4081;
                    class351.method2108(class515.field7245, -10511);
                    class479.field6754.method76(var7, (byte) 78);
                    class479.field6754.method72(-1875, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                    class45.method433(var16.method337(0), var16.field616[0], -2, var16.field618[0], 0, -119, true, 0, var16.method337(0));
                }
            }
            if (var6 == 11) {
                class188 var17 = class349.field4696[var7];
                if (var17 != null) {
                    class96.field1461 = arg1;
                    class16.field210 = arg2;
                    class342.field4608 = 0;
                    class341.field4590 = 2;
                    ++class378.field5081;
                    class351.method2108(class391.field5531, -10511);
                    class479.field6754.method109(var7, 255);
                    class479.field6754.method61((byte) 27, class316.field4245.method2691(82, 19521) ? 1 : 0);
                    class45.method433(var17.method337(arg0 + -60), var17.field616[0], -2, var17.field618[0], 0, -104, true, 0, var17.method337(0));
                }
            }
            if (~var6 == -4) {
                class114 var18 = class512.method2969(var5, var4, (byte) 120);
                if (var18 != null) {
                    class339.method2057((byte) -75);
                    class500 var19 = client.method1534(var18);
                    class412.method2454(var18, var19.field6969, var19.method2897((byte) 113), -2);
                    class412.field5799 = class293.method1879(var18, 50);
                    if (class412.field5799 == null) {
                        class412.field5799 = "Null";
                    }
                    class494.field6922 = var18.field1824 + "<col=ffffff>";
                }
            } else {
                if (~var6 == -51) {
                    class188 var20 = class349.field4696[var7];
                    if (var20 != null) {
                        class96.field1461 = arg1;
                        class342.field4608 = 0;
                        class16.field210 = arg2;
                        ++class583.field8044;
                        class341.field4590 = 2;
                        class351.method2108(class490.field6863, -10511);
                        class479.field6754.method124(!class316.field4245.method2691(82, 19521) ? 0 : 1, 113);
                        class479.field6754.method76(var7, (byte) 126);
                        class45.method433(var20.method337(arg0 + -60), var20.field616[0], -2, var20.field618[0], 0, -111, true, 0, var20.method337(0));
                    }
                }
                if (~var6 == -24) {
                    class576 var21 = (class576) class278.field3837.method1242(0, (long) var7);
                    if (var21 != null) {
                        class109 var22 = var21.field7929;
                        class342.field4608 = 0;
                        class341.field4590 = 2;
                        ++class108.field1664;
                        class96.field1461 = arg1;
                        class16.field210 = arg2;
                        class351.method2108(class611.field8785, -10511);
                        class479.field6754.method124(!class316.field4245.method2691(82, 19521) ? 0 : 1, arg0 ^ 67);
                        class479.field6754.method91((byte) 88, var7);
                        class45.method433(var22.method337(arg0 ^ 60), var22.field616[0], -2, var22.field618[0], 0, -114, true, 0, var22.method337(0));
                    }
                }
                if (arg0 == 60) {
                    if (var6 == 1011) {
                        ++class376.field5064;
                        class341.field4590 = 2;
                        class16.field210 = arg2;
                        class96.field1461 = arg1;
                        class342.field4608 = 0;
                        class351.method2108(class141.field2193, arg0 ^ -10547);
                        class479.field6754.method76(var4 - -class519.field7304, (byte) 64);
                        class479.field6754.method109(class6.field80 + var5, 255);
                        class479.field6754.method76(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 62);
                        class479.field6754.method108((byte) -128, class316.field4245.method2691(82, 19521) ? 1 : 0);
                        class263.method1722((byte) -81, var4, var5, var8);
                    }
                    if (~var6 == -31) {
                        class576 var23 = (class576) class278.field3837.method1242(arg0 + -60, (long) var7);
                        if (var23 != null) {
                            class342.field4608 = 0;
                            class16.field210 = arg2;
                            class109 var24 = var23.field7929;
                            class341.field4590 = 2;
                            class96.field1461 = arg1;
                            ++class258.field3589;
                            class351.method2108(class636.field9279, -10511);
                            class479.field6754.method124(class316.field4245.method2691(82, 19521) ? 1 : 0, 121);
                            class479.field6754.method109(var7, arg0 + 195);
                            class45.method433(var24.method337(0), var24.field616[0], -2, var24.field618[0], 0, arg0 + -3, true, 0, var24.method337(0));
                        }
                    }
                    if (var6 == 44) {
                        class188 var25 = class349.field4696[var7];
                        if (var25 != null) {
                            class96.field1461 = arg1;
                            class342.field4608 = 0;
                            ++class442.field6288;
                            class341.field4590 = 2;
                            class16.field210 = arg2;
                            class351.method2108(class560.field7756, arg0 ^ -10547);
                            class479.field6754.method68(126, class608.field8768);
                            class479.field6754.method61((byte) 40, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                            class479.field6754.method109(class103.field1566, 255);
                            class479.field6754.method91((byte) 88, class461.field6472);
                            class479.field6754.method109(var7, 255);
                            class45.method433(var25.method337(0), var25.field616[0], -2, var25.field618[0], 0, -118, true, 0, var25.method337(0));
                        }
                    }
                    if (var6 == 19) {
                        ++class505.field7043;
                        class16.field210 = arg2;
                        class342.field4608 = 0;
                        class96.field1461 = arg1;
                        class341.field4590 = 2;
                        class351.method2108(class18.field222, -10511);
                        class479.field6754.method61((byte) 59, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                        class479.field6754.method91((byte) 88, class519.field7304 + var4);
                        class479.field6754.method76(var7, (byte) 63);
                        class479.field6754.method91((byte) 88, var5 - -class6.field80);
                        class349.method2098(var4, var5, (byte) 121);
                    }
                    if (~var6 == -61) {
                        class342.field4608 = 0;
                        class96.field1461 = arg1;
                        class341.field4590 = 2;
                        ++class442.field6288;
                        class16.field210 = arg2;
                        class351.method2108(class560.field7756, -10511);
                        class479.field6754.method68(119, class608.field8768);
                        class479.field6754.method61((byte) 39, !class316.field4245.method2691(82, arg0 ^ 19581) ? 0 : 1);
                        class479.field6754.method109(class103.field1566, 255);
                        class479.field6754.method91((byte) 88, class461.field6472);
                        class479.field6754.method109(class645.field9372.field607, 255);
                    }
                    if (~var6 == -1011) {
                        class342.field4608 = 0;
                        class96.field1461 = arg1;
                        class341.field4590 = 2;
                        class16.field210 = arg2;
                        class576 var26 = (class576) class278.field3837.method1242(arg0 ^ 60, (long) var7);
                        if (var26 != null) {
                            class109 var27 = var26.field7929;
                            class593 var28 = var27.field1669;
                            if (var28.field8532 != null) {
                                var28 = var28.method3516(class189.field2681, 118);
                            }
                            if (var28 != null) {
                                class351.method2108(class294.field4048, arg0 + -10571);
                                ++class436.field6198;
                                class479.field6754.method84(var28.field8593, (byte) -111);
                            }
                        }
                    }
                    if (~var6 == -21) {
                        class188 var29 = class349.field4696[var7];
                        if (var29 != null) {
                            ++class305.field4157;
                            class96.field1461 = arg1;
                            class16.field210 = arg2;
                            class342.field4608 = 0;
                            class341.field4590 = 2;
                            class351.method2108(class453.field6406, -10511);
                            class479.field6754.method76(var7, (byte) 74);
                            class479.field6754.method108((byte) -128, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                            class45.method433(var29.method337(0), var29.field616[0], -2, var29.field618[0], 0, arg0 ^ -88, true, 0, var29.method337(0));
                        }
                    }
                    if (~var6 == -19) {
                        ++class438.field6210;
                        class96.field1461 = arg1;
                        class342.field4608 = 0;
                        class341.field4590 = 2;
                        class16.field210 = arg2;
                        class351.method2108(class76.field1208, -10511);
                        class479.field6754.method91((byte) 88, var5 - -class6.field80);
                        class479.field6754.method72(-1875, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                        class479.field6754.method84(var7, (byte) -118);
                        class479.field6754.method84(class519.field7304 + var4, (byte) -94);
                        class349.method2098(var4, var5, (byte) 117);
                    }
                    if (~var6 == -14) {
                        class576 var30 = (class576) class278.field3837.method1242(0, (long) var7);
                        if (var30 != null) {
                            class341.field4590 = 2;
                            class96.field1461 = arg1;
                            class16.field210 = arg2;
                            class109 var31 = var30.field7929;
                            ++class436.field6199;
                            class342.field4608 = 0;
                            class351.method2108(class490.field6865, arg0 + -10571);
                            class479.field6754.method72(-1875, class316.field4245.method2691(82, arg0 ^ 19581) ? 1 : 0);
                            class479.field6754.method76(var7, (byte) 97);
                            class45.method433(var31.method337(arg0 + -60), var31.field616[0], -2, var31.field618[0], 0, -109, true, 0, var31.method337(0));
                        }
                    }
                    if (~var6 == -13) {
                        class576 var32 = (class576) class278.field3837.method1242(arg0 + -60, (long) var7);
                        if (var32 != null) {
                            ++class204.field2867;
                            class96.field1461 = arg1;
                            class109 var33 = var32.field7929;
                            class341.field4590 = 2;
                            class16.field210 = arg2;
                            class342.field4608 = 0;
                            class351.method2108(class194.field2753, -10511);
                            class479.field6754.method61((byte) 88, !class316.field4245.method2691(82, arg0 ^ 19581) ? 0 : 1);
                            class479.field6754.method109(var7, 255);
                            class45.method433(var33.method337(0), var33.field616[0], -2, var33.field618[0], 0, -125, true, 0, var33.method337(arg0 + -60));
                        }
                    }
                    if (var6 == 16) {
                        class576 var34 = (class576) class278.field3837.method1242(arg0 ^ 60, (long) var7);
                        if (var34 != null) {
                            class16.field210 = arg2;
                            class341.field4590 = 2;
                            class96.field1461 = arg1;
                            ++class369.field5011;
                            class109 var35 = var34.field7929;
                            class342.field4608 = 0;
                            class351.method2108(class242.field3389, -10511);
                            class479.field6754.method72(-1875, !class316.field4245.method2691(82, 19521) ? 0 : 1);
                            class479.field6754.method76(var7, (byte) 75);
                            class45.method433(var35.method337(0), var35.field616[0], -2, var35.field618[0], 0, -101, true, 0, var35.method337(arg0 + -60));
                        }
                    }
                    if (~var6 == -10) {
                        class341.field4590 = 2;
                        class96.field1461 = arg1;
                        class342.field4608 = 0;
                        class16.field210 = arg2;
                        ++class582.field7986;
                        class351.method2108(class163.field2364, -10511);
                        class479.field6754.method72(arg0 + -1935, class316.field4245.method2691(82, 19521) ? 1 : 0);
                        class479.field6754.method91((byte) 88, class6.field80 + var5);
                        class479.field6754.method109(var7, 255);
                        class479.field6754.method109(var4 - -class519.field7304, 255);
                        class349.method2098(var4, var5, (byte) 115);
                    }
                    if (var6 == 4) {
                        class188 var36 = class349.field4696[var7];
                        if (var36 != null) {
                            class341.field4590 = 2;
                            ++class600.field8649;
                            class342.field4608 = 0;
                            class96.field1461 = arg1;
                            class16.field210 = arg2;
                            class351.method2108(class533.field7457, -10511);
                            class479.field6754.method91((byte) 88, var7);
                            class479.field6754.method61((byte) 69, class316.field4245.method2691(82, arg0 + 19461) ? 1 : 0);
                            class45.method433(var36.method337(0), var36.field616[0], -2, var36.field618[0], 0, 62, true, 0, var36.method337(arg0 + -60));
                        }
                    }
                    if (class493.field6904) {
                        class339.method2057((byte) -46);
                    }
                    if (class40.field804 != null && class331.field4423 == 0) {
                        class403.method2407(class40.field804, -9130);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    public static void method2404(int arg0) {
        field5723 = null;
        if (arg0 != 0) {
            field5723 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            this.method6((class11) null, -69, 19);
        }
        if (~arg2 == -1) {
            this.field5727 = (arg0.method110((byte) 72) << 12) / 255;
        }
        ++field5725;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class402() {
        this(4096);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field5726;
        if (arg1 != 0) {
            return null;
        } else {
            int[] var3 = super.field6557.method565(arg0, -24728);
            if (super.field6557.field1163) {
                class416.method2495(var3, 0, class312.field4207, this.field5727);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
    public class402(int arg0) {
        super(0, true);
        this.field5727 = 4096;
        this.field5727 = arg0;
    }
}
