import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class86 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1072 = -1;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method622(byte arg0) {
        class340.field4928.method416(arg0 - 13, 5);
        field1073++;
        class211.field3058.method2909(5, (byte) -82);
        class539.field7885.method3001(5, true);
        class377.field5338.method1903(5, 0);
        class106.field1400.method2582(-120, 5);
        class344.field5000.method994(5, -16964);
        class62.field784.method2570(-113, 5);
        class125.field1688.method2461(5, true);
        class181.field2596.method2794(5, -93);
        class385.field5412.method1953((byte) 77, 5);
        if (arg0 != 14) {
            method623(-71, (byte) 44);
        }
        class498.field7049.method2066(-64, 5);
        class69.field876.method1319(5, (byte) -119);
        class412.field5829.method1859(5, 64);
        class454.field6365.method1999(5, true);
        class373.field5309.method1631(-267592222, 5);
        class361.field5163.method1243(5, (byte) -37);
        class39.field423.method1184(5, (byte) -29);
        class52.field628.method2144(5, arg0 ^ 0x73);
        class344.field5004.method2787(5, -8614);
        class473.field6588.method2767(5, (byte) 122);
        class342.method2040(5, false);
        class542.method3186(50, 127);
        class85.method618(83, 5);
        class56.method464((byte) -125, 5);
        class20.field238.method1087(1, 5);
        class455.field6389.method1087(arg0 - 13, 5);
        class168.field2443.method1087(1, 5);
        class92.field1178.method1087(arg0 ^ 0xF, 5);
        class495.field7021.method1087(1, 5);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
    public static final void method623(int arg0, byte arg1) {
        field1075++;
        if (class488.field6832 == arg0) {
            return;
        }
        if (class488.field6832 == 0) {
            class357.method2113(-101);
        }
        int var2 = -97 / ((arg1 - 29) / 59);
        if (arg0 == 12) {
            class114.method766((byte) -71, class449.field6287, class153.field2198, class170.field2476);
        }
        if (arg0 != 12 && class251.field3742 != null) {
            class251.field3742.method1360((byte) -89);
            class251.field3742 = null;
        }
        if (arg0 == 2) {
            class4.method29(-7952, class472.field6578 != class358.field5133);
        }
        if (arg0 == 6) {
            class202.method1298((byte) 63, class472.field6578 != class10.field142);
        }
        if (arg0 == 4) {
            class520.method3078(class153.field2198, class449.field6287, (byte) 38);
        } else if (arg0 == 5) {
            class114.method766((byte) -71, class449.field6287, class153.field2198, class170.field2476);
        } else if (arg0 == 8) {
            class114.method766((byte) -71, class449.field6287, class153.field2198, class170.field2476);
        } else if (arg0 == 11) {
            class520.method3078(class153.field2198, class449.field6287, (byte) 38);
        }
        if (class181.method1130(false, class488.field6832)) {
            class390.field5478.field662 = 2;
            class147.field1966.field662 = 2;
            class342.field4972.field662 = 2;
            class184.field2663.field662 = 2;
            class382.field5384.field662 = 2;
            class474.field6602.field662 = 2;
            class276.field4102.field662 = 2;
        }
        if (class181.method1130(false, arg0)) {
            class312.field4542 = 1;
            class460.field6443 = 1;
            class120.field1660 = 0;
            class284.field4163 = 0;
            class369.field5270 = 0;
            class315.method1896(true, 64);
            class390.field5478.field662 = 1;
            class147.field1966.field662 = 1;
            class342.field4972.field662 = 1;
            class184.field2663.field662 = 1;
            class382.field5384.field662 = 1;
            class474.field6602.field662 = 1;
            class276.field4102.field662 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class273.method1723(1);
        }
        if (arg0 == 1) {
            class300.method1835(class61.field761, class385.field5414, 2);
        } else {
            class507.method3025(-124);
        }
        boolean var3 = arg0 == 1 || class430.method2546(false, arg0) || class311.method1886(-25866, arg0);
        boolean var4 = class488.field6832 == 1 || class430.method2546(false, class488.field6832) || class311.method1886(-25866, class488.field6832);
        if (var3 != var4) {
            if (var3) {
                class467.field6521 = class487.field6798;
                if (class4.field81.field1422 == 0) {
                    class511.method3048(2, 16012);
                } else {
                    class532.method3133(class487.field6798, 2, 0, 91, false, class4.field81.field1422, class75.field927);
                }
                class15.field192.method1161((byte) -59, false);
            } else {
                class511.method3048(2, 16012);
                class15.field192.method1161((byte) -35, true);
            }
        }
        if (class181.method1130(false, arg0) || arg0 == 12) {
            class385.field5414.method303();
        }
        class488.field6832 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lnt;IILjava/awt/Component;I)Lvn;")
    public static final class208 method624(class151 arg0, int arg1, int arg2, Component arg3, int arg4) {
        field1074++;
        if (class289.field4225 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class208 var5 = (class208) Class.forName("sg").getDeclaredConstructor().newInstance();
                var5.field3025 = arg1;
                var5.field3005 = new int[(class366.field5230 ? 2 : 1) * 256];
                var5.method801(arg3);
                var5.field3033 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field3033 > 16384) {
                    var5.field3033 = 16384;
                }
                var5.method797(var5.field3033);
                if (class75.field940 > 0 && class75.field948 == null) {
                    class75.field948 = new class344();
                    class75.field948.field4993 = arg0;
                    arg0.method958((byte) 86, class75.field948, class75.field940);
                }
                if (class75.field948 != null) {
                    if (class75.field948.field5001[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class75.field948.field5001[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (arg2 != 8950) {
                        method624(null, 17, -122, null, -27);
                    }
                    class118 var6 = new class118(arg0, arg4);
                    var6.field3025 = arg1;
                    var6.field3005 = new int[(class366.field5230 ? 2 : 1) * 256];
                    var6.method801(arg3);
                    var6.field3033 = 16384;
                    var6.method797(var6.field3033);
                    if (class75.field940 > 0 && class75.field948 == null) {
                        class75.field948 = new class344();
                        class75.field948.field4993 = arg0;
                        arg0.method958((byte) 112, class75.field948, class75.field940);
                    }
                    if (class75.field948 != null) {
                        if (class75.field948.field5001[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class75.field948.field5001[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class208();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
