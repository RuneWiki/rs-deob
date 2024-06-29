import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class135 extends class73 {

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    private int field2075 = -32768;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "[Luf;")
    public static class22[] field2076 = new class22[4];

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "[I")
    public static int[] field2082 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "[I")
    public static int[] field2078;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method858(int arg0, int arg1) {
        field2077++;
        if (arg1 == -17597) {
            return (-arg0 & arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 19)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field2081++;
        class271 var13 = class189.method1253((byte) 116, this.field2071).method2169(-1, this.field2074, (class141) null, 128, 0, 0);
        if (var13 != null) {
            var13.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2075 = var13.method22();
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 35)
    public static void method859(int arg0) {
        field2076 = null;
        field2082 = null;
        if (arg0 <= -28) {
            field2078 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()I", line = 53)
    public final int method22() {
        field2079++;
        return this.field2075;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V", line = 67)
    public static final void method860(int arg0) {
        field2072++;
        if (class37.field618 == 0 || class37.field618 == 5) {
            return;
        }
        try {
            if (++class179.field2852 > 2000) {
                if (class265.field4477 != null) {
                    class265.field4477.method1239((byte) -63);
                    class265.field4477 = null;
                }
                if (class4.field60 >= 1) {
                    class184.field2930 = -5;
                    class37.field618 = 0;
                    return;
                }
                class179.field2852 = 0;
                class37.field618 = 1;
                class4.field60++;
                if (class86.field1205 == class203.field3289) {
                    class86.field1205 = class100.field1461;
                } else {
                    class86.field1205 = class203.field3289;
                }
            }
            if (class37.field618 == arg0) {
                class11.field142 = class34.field572.method962(class86.field1205, class25.field425, (byte) -71);
                class37.field618 = 2;
            }
            if (class37.field618 == 2) {
                if (class11.field142.field2980 == 2) {
                    throw new IOException();
                }
                if (class11.field142.field2980 != 1) {
                    return;
                }
                class265.field4477 = new class186((Socket) class11.field142.field2977, class34.field572);
                class11.field142 = null;
                long var1 = class321.field5605 = class201.field3241.method1013(arg0 - 18675);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class245.field4102.field4946 = 0;
                class245.field4102.method1980(false, 14);
                class245.field4102.method1980(false, var3);
                class265.field4477.method1237(true, 0, 2, class245.field4102.field4950);
                if (class270.field4629 != null) {
                    class270.field4629.method1676(arg0 - 3092);
                }
                if (class224.field3646 != null) {
                    class224.field3646.method1676(-3091);
                }
                int var4 = class265.field4477.method1235(-109);
                if (class270.field4629 != null) {
                    class270.field4629.method1676(arg0 ^ 0xFFFFF3EC);
                }
                if (class224.field3646 != null) {
                    class224.field3646.method1676(arg0 ^ 0xFFFFF3EC);
                }
                if (var4 != 0) {
                    class37.field618 = 0;
                    class184.field2930 = var4;
                    class265.field4477.method1239((byte) -55);
                    class265.field4477 = null;
                    return;
                }
                class37.field618 = 3;
            }
            if (class37.field618 == 3) {
                if (class265.field4477.method1238(1) < 8) {
                    return;
                }
                class265.field4477.method1240(class73.field1058.field4950, 0, 8, -124);
                class73.field1058.field4946 = 0;
                class2.field40 = class73.field1058.method1968(112);
                int[] var5 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), (int) (class2.field40 >> 32), (int) class2.field40 };
                class245.field4102.field4946 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class245.field4102.method1980(false, 10);
                class245.field4102.method1967(var5[0], arg0 ^ 0xB24B41D9);
                class245.field4102.method1967(var5[1], -1303690792);
                class245.field4102.method1967(var5[2], arg0 - 1303690793);
                class245.field4102.method1967(var5[3], -1303690792);
                class245.field4102.method1988(class201.field3241.method1013(-18674), arg0 + 98);
                class245.field4102.method2015(arg0 ^ 0xFFFFAC72, class201.field3237);
                class245.field4102.method2006(class54.field847, false, class116.field1635);
                class87.field1217.field4946 = 0;
                if (class232.field3814 == 40) {
                    class87.field1217.method1980(false, 18);
                } else {
                    class87.field1217.method1980(false, 16);
                }
                class87.field1217.method1994(class245.field4102.field4946 + class162.method1086(-1, class106.field1514) + 159, 2921);
                class87.field1217.method1967(531, arg0 ^ 0xB24B41D9);
                class87.field1217.method1980(false, class90.field1265);
                class87.field1217.method1980(false, class86.field1207 ? 1 : 0);
                class87.field1217.method1980(false, 1);
                class87.field1217.method1980(false, class89.method586(1));
                class87.field1217.method1994(class172.field2757, 2921);
                class87.field1217.method1994(class227.field3709, 2921);
                class87.field1217.method1980(false, class225.field3657);
                class289.method1946(arg0 ^ 0xFFFFFFA1, class87.field1217);
                class87.field1217.method2015(arg0 - 21390, class106.field1514);
                class87.field1217.method1967(class45.field726, -1303690792);
                class87.field1217.method1967(class324.method2279(-12940), -1303690792);
                class254.field4391 = true;
                class87.field1217.method1994(class270.field4628, 2921);
                class87.field1217.method1967(class61.field922.method1357(true), -1303690792);
                class87.field1217.method1967(class205.field3351.method1357(true), arg0 - 1303690793);
                class87.field1217.method1967(class122.field1721.method1357(true), arg0 - 1303690793);
                class87.field1217.method1967(class3.field55.method1357(true), -1303690792);
                class87.field1217.method1967(class256.field4407.method1357(true), arg0 - 1303690793);
                class87.field1217.method1967(class73.field1063.method1357(true), -1303690792);
                class87.field1217.method1967(class280.field4783.method1357(true), -1303690792);
                class87.field1217.method1967(class201.field3236.method1357(true), -1303690792);
                class87.field1217.method1967(class224.field3650.method1357(true), -1303690792);
                class87.field1217.method1967(class251.field4298.method1357(true), -1303690792);
                class87.field1217.method1967(class206.field3380.method1357(true), arg0 - 1303690793);
                class87.field1217.method1967(class112.field1589.method1357(true), -1303690792);
                class87.field1217.method1967(class94.field1343.method1357(true), arg0 - 1303690793);
                class87.field1217.method1967(class164.field2600.method1357(true), -1303690792);
                class87.field1217.method1967(class88.field1236.method1357(true), arg0 ^ 0xB24B41D9);
                class87.field1217.method1967(class132.field2022.method1357(true), -1303690792);
                class87.field1217.method1967(class140.field2132.method1357(true), -1303690792);
                class87.field1217.method1967(class172.field2732.method1357(true), arg0 - 1303690793);
                class87.field1217.method1967(class164.field2602.method1357(true), -1303690792);
                class87.field1217.method1967(class130.field1986.method1357(true), -1303690792);
                class87.field1217.method1967(class142.field2179.method1357(true), arg0 ^ 0xB24B41D9);
                class87.field1217.method1967(class154.field2454.method1357(true), -1303690792);
                class87.field1217.method1967(class200.field3229.method1357(true), -1303690792);
                class87.field1217.method1967(class141.field2172.method1357(true), -1303690792);
                class87.field1217.method1967(class157.field2500.method1357(true), -1303690792);
                class87.field1217.method1967(class89.field1251.method1357(true), arg0 ^ 0xB24B41D9);
                class87.field1217.method1967(class245.field4124.method1357(true), -1303690792);
                class87.field1217.method1967(class72.field1049.method1357(true), -1303690792);
                class87.field1217.method1989(class245.field4102.field4950, 0, (byte) 127, class245.field4102.field4946);
                class265.field4477.method1237(true, 0, class87.field1217.field4946, class87.field1217.field4950);
                class245.field4102.method1072(false, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class73.field1058.method1072(false, var5);
                class37.field618 = 4;
            }
            if (class37.field618 == 4) {
                if (class265.field4477.method1238(arg0 ^ 0x0) < 1) {
                    return;
                }
                int var7 = class265.field4477.method1235(-95);
                if (var7 == 21) {
                    class37.field618 = 7;
                } else if (var7 == 29) {
                    class37.field618 = 10;
                } else if (var7 == 1) {
                    class37.field618 = 5;
                    class184.field2930 = var7;
                    return;
                } else if (var7 == 2) {
                    class37.field618 = 8;
                } else if (var7 == 15) {
                    class37.field618 = 0;
                    class184.field2930 = var7;
                    return;
                } else if (var7 == 23 && class4.field60 < 1) {
                    class179.field2852 = 0;
                    class4.field60++;
                    class37.field618 = 1;
                    class265.field4477.method1239((byte) -115);
                    class265.field4477 = null;
                    return;
                } else {
                    class184.field2930 = var7;
                    class37.field618 = 0;
                    class265.field4477.method1239((byte) -128);
                    class265.field4477 = null;
                    return;
                }
            }
            if (class37.field618 == 6) {
                class245.field4102.field4946 = 0;
                class245.field4102.method1065(17, arg0 + 123);
                class265.field4477.method1237(true, 0, class245.field4102.field4946, class245.field4102.field4950);
                class37.field618 = 4;
                return;
            }
            if (class37.field618 == 7) {
                if (class265.field4477.method1238(1) < 1) {
                    return;
                }
                class296.field5055 = class265.field4477.method1235(-115) * 60 + 180;
                class184.field2930 = 21;
                class37.field618 = 0;
                class265.field4477.method1239((byte) -124);
                class265.field4477 = null;
                return;
            }
            if (class37.field618 == 10) {
                if (class265.field4477.method1238(arg0) < 1) {
                    return;
                }
                class192.field3021 = class265.field4477.method1235(-95);
                class184.field2930 = 29;
                class37.field618 = 0;
                class265.field4477.method1239((byte) -106);
                class265.field4477 = null;
                return;
            }
            if (class37.field618 == 8) {
                if (class265.field4477.method1238(1) < 14) {
                    return;
                }
                class265.field4477.method1240(class73.field1058.field4950, 0, 14, -82);
                class73.field1058.field4946 = 0;
                class148.field2263 = class73.field1058.method2011(arg0 ^ 0xFFFFFFE5);
                class49.field771 = class73.field1058.method2011(-34);
                class252.field4348 = class73.field1058.method2011(arg0 - 85) == 1;
                class277.field4735 = class73.field1058.method2011(-50) == 1;
                class44.field702 = class73.field1058.method2011(-94) == 1;
                class205.field3346 = class73.field1058.method2011(-27) == 1;
                class296.field5061 = class73.field1058.method2011(-76) == 1;
                class27.field466 = class73.field1058.method2021((byte) 74);
                class27.field458 = class73.field1058.method2011(arg0 ^ -71) == 1;
                class23.field407 = class73.field1058.method2011(-31) == 1;
                class242.method1645(1803021639, class23.field407);
                class324.method2281(class23.field407, true);
                if (!class86.field1207) {
                    if ((!class252.field4348 || class44.field702) && !class27.field458) {
                        try {
                            class273.field4692.method1019(98, class34.field572.field2359);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class137.field2109.method1019(arg0 ^ 0x56, class34.field572.field2359);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class294.field5034 = class73.field1058.method1076((byte) 113);
                class288.field4882 = class73.field1058.method2021((byte) 74);
                class37.field618 = 9;
            }
            if (class37.field618 == 9) {
                if (class265.field4477.method1238(1) >= class288.field4882) {
                    class73.field1058.field4946 = 0;
                    class265.field4477.method1240(class73.field1058.field4950, 0, class288.field4882, arg0 ^ 0x6A);
                    class184.field2930 = 2;
                    class37.field618 = 0;
                    class290.method1950(0);
                    class121.field1713 = -1;
                    class252.method1746((byte) 126, false);
                    class294.field5034 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class265.field4477 != null) {
                class265.field4477.method1239((byte) -114);
                class265.field4477 = null;
            }
            if (class4.field60 < 1) {
                if (class86.field1205 == class203.field3289) {
                    class86.field1205 = class100.field1461;
                } else {
                    class86.field1205 = class203.field3289;
                }
                class37.field618 = 1;
                class179.field2852 = 0;
                class4.field60++;
            } else {
                class37.field618 = 0;
                class184.field2930 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V", line = 463)
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2083++;
    }
}
