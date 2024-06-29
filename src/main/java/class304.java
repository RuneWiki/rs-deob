import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class304 extends class206 {

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public int field5206;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public int field5205;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public int field5196;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Lwa;")
    public static class75 field5198 = class66.method560("Freie Welt", false);

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lwa;")
    public static class75 field5195 = class66.method560("Clientscript error )2 check log for details", false);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Lwa;")
    private static class75 field5199 = class66.method560("FULL", false);

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "J")
    public static volatile long field5201 = 0L;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Lwa;")
    public static class75 field5200 = field5199;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field5203 = 0;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 9)
    public static void method2090(byte arg0) {
        field5195 = null;
        if (arg0 != 1) {
            field5201 = -90L;
        }
        field5198 = null;
        field5199 = null;
        field5200 = null;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 25)
    public static final void method2091(int arg0) {
        field5193++;
        if (class207.field3498 == 0 || class207.field3498 == 5) {
            return;
        }
        if (arg0 != 0) {
            method2091(85);
        }
        try {
            if (++class229.field3899 > 2000) {
                if (class35.field513 != null) {
                    class35.field513.method2048((byte) -51);
                    class35.field513 = null;
                }
                if (class186.field3102 >= 1) {
                    class207.field3498 = 0;
                    class69.field1183 = -5;
                    return;
                }
                class229.field3899 = 0;
                class186.field3102++;
                class207.field3498 = 1;
                if (class311.field5304 == class155.field2663) {
                    class311.field5304 = class117.field1992;
                } else {
                    class311.field5304 = class155.field2663;
                }
            }
            if (class207.field3498 == 1) {
                class96.field1572 = class210.field3585.method937(arg0 + 1, class311.field5305, class311.field5304);
                class207.field3498 = 2;
            }
            if (class207.field3498 == 2) {
                if (class96.field1572.field1330 == 2) {
                    throw new IOException();
                }
                if (class96.field1572.field1330 != 1) {
                    return;
                }
                class35.field513 = new class294((Socket) class96.field1572.field1329, class210.field3585);
                class96.field1572 = null;
                long var1 = class166.field2792 = class121.field2044.method630(-39);
                class89.field1470.field1012 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class89.field1470.method518(102, 14);
                class89.field1470.method518(119, var3);
                class35.field513.method2043(class89.field1470.field997, 2, 0, -31544);
                if (class64.field1112 != null) {
                    class64.field1112.method1484(-109);
                }
                if (class176.field2965 != null) {
                    class176.field2965.method1484(-92);
                }
                int var4 = class35.field513.method2045(69);
                if (class64.field1112 != null) {
                    class64.field1112.method1484(-71);
                }
                if (class176.field2965 != null) {
                    class176.field2965.method1484(86);
                }
                if (var4 != 0) {
                    class69.field1183 = var4;
                    class207.field3498 = 0;
                    class35.field513.method2048((byte) -124);
                    class35.field513 = null;
                    return;
                }
                class207.field3498 = 3;
            }
            if (class207.field3498 == 3) {
                if (class35.field513.method2042(-83) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class35.field513.method2047(class136.field2328.field997, 0, 8, arg0 - 3532);
                class136.field2328.field1012 = 0;
                class167.field2817 = class136.field2328.method499((byte) -54);
                var5[2] = (int) (class167.field2817 >> 32);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class167.field2817;
                class89.field1470.field1012 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class89.field1470.method518(112, 10);
                class89.field1470.method510(var5[0], -37);
                class89.field1470.method510(var5[1], 69);
                class89.field1470.method510(var5[2], 77);
                class89.field1470.method510(var5[3], 81);
                class89.field1470.method514(30009, class121.field2044.method630(-98));
                class89.field1470.method516((byte) -20, class121.field2046);
                class89.field1470.method524(class269.field4650, class229.field3872, arg0 ^ 0x0);
                class255.field4276.field1012 = 0;
                if (class118.field2003 == 40) {
                    class255.field4276.method518(112, 18);
                } else {
                    class255.field4276.method518(113, 16);
                }
                class255.field4276.method503(arg0 ^ 0xDC5D1AC8, class89.field1470.field1012 + class199.method1488((byte) -84, class310.field5287) + 153);
                class255.field4276.method510(512, 96);
                class255.field4276.method518(arg0 ^ 0x76, class117.field1991);
                class255.field4276.method518(124, 1);
                class255.field4276.method518(119, class301.method2071((byte) 69));
                class255.field4276.method503(arg0 - 597878072, class188.field3141);
                class255.field4276.method503(arg0 ^ 0xDC5D1AC8, class244.field4111);
                class285.method2009(class255.field4276, 115);
                class255.field4276.method516((byte) -20, class310.field5287);
                class255.field4276.method510(class98.field1612, arg0 ^ 0xFFFFFF9D);
                class255.field4276.method510(class242.method1760(-1150223675), arg0 + 75);
                class120.field2014 = true;
                class255.field4276.method503(-597878072, class260.field4354);
                class255.field4276.method510(class109.field1877.field4603, -86);
                class255.field4276.method510(class42.field698.field4603, 119);
                class255.field4276.method510(class140.field2427.field4603, -71);
                class255.field4276.method510(class168.field2831.field4603, -90);
                class255.field4276.method510(class126.field2187.field4603, arg0 ^ 0xFFFFFFCC);
                class255.field4276.method510(class121.field2039.field4603, 77);
                class255.field4276.method510(class302.field5172.field4603, -86);
                class255.field4276.method510(class236.field3983.field4603, -114);
                class255.field4276.method510(class136.field2333.field4603, arg0 - 74);
                class255.field4276.method510(class311.field5303.field4603, arg0 + 101);
                class255.field4276.method510(class163.field2778.field4603, -123);
                class255.field4276.method510(class66.field1150.field4603, -116);
                class255.field4276.method510(class294.field5063.field4603, 68);
                class255.field4276.method510(class118.field1995.field4603, arg0 ^ 0x51);
                class255.field4276.method510(class140.field2424.field4603, 89);
                class255.field4276.method510(class136.field2339.field4603, -109);
                class255.field4276.method510(class19.field263.field4603, -55);
                class255.field4276.method510(class249.field4192.field4603, -88);
                class255.field4276.method510(class202.field3412.field4603, 118);
                class255.field4276.method510(class66.field1136.field4603, 99);
                class255.field4276.method510(class162.field2761.field4603, arg0 - 42);
                class255.field4276.method510(class100.field1660.field4603, -84);
                class255.field4276.method510(class78.field1345.field4603, 65);
                class255.field4276.method510(class249.field4199.field4603, 125);
                class255.field4276.method510(class138.field2363.field4603, 54);
                class255.field4276.method510(class211.field3598.field4603, 96);
                class255.field4276.method510(class283.field4884.field4603, arg0 - 71);
                class255.field4276.method494(class89.field1470.field997, (byte) -97, 0, class89.field1470.field1012);
                class35.field513.method2043(class255.field4276.field997, class255.field4276.field1012, 0, -31544);
                class89.field1470.method86((byte) 81, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class136.field2328.method86((byte) 81, var5);
                class207.field3498 = 4;
            }
            if (class207.field3498 == 4) {
                if (class35.field513.method2042(-85) < 1) {
                    return;
                }
                int var7 = class35.field513.method2045(98);
                if (var7 == 21) {
                    class207.field3498 = 7;
                } else if (var7 == 29) {
                    class207.field3498 = 10;
                } else if (var7 == 1) {
                    class207.field3498 = 5;
                    class69.field1183 = var7;
                    return;
                } else if (var7 == 2) {
                    class207.field3498 = 8;
                } else if (var7 == 15) {
                    class207.field3498 = 0;
                    class69.field1183 = var7;
                    return;
                } else if (var7 == 23 && class186.field3102 < 1) {
                    class207.field3498 = 1;
                    class186.field3102++;
                    class229.field3899 = 0;
                    class35.field513.method2048((byte) -73);
                    class35.field513 = null;
                    return;
                } else {
                    class207.field3498 = 0;
                    class69.field1183 = var7;
                    class35.field513.method2048((byte) -107);
                    class35.field513 = null;
                    return;
                }
            }
            if (class207.field3498 == 6) {
                class89.field1470.field1012 = 0;
                class89.field1470.method87(65280, 17);
                class35.field513.method2043(class89.field1470.field997, class89.field1470.field1012, 0, -31544);
                class207.field3498 = 4;
                return;
            }
            if (class207.field3498 == 7) {
                if (class35.field513.method2042(-103) >= 1) {
                    class296.field5075 = class35.field513.method2045(122) * 60 + 180;
                    class207.field3498 = 0;
                    class69.field1183 = 21;
                    class35.field513.method2048((byte) -91);
                    class35.field513 = null;
                    return;
                }
                return;
            }
            if (class207.field3498 == 10) {
                if (class35.field513.method2042(-45) >= 1) {
                    class118.field1997 = class35.field513.method2045(52);
                    class69.field1183 = 29;
                    class207.field3498 = 0;
                    class35.field513.method2048((byte) -95);
                    class35.field513 = null;
                    return;
                }
                return;
            }
            if (class207.field3498 == 8) {
                if (class35.field513.method2042(-76) < 11) {
                    return;
                }
                class35.field513.method2047(class136.field2328.field997, 0, 11, -3532);
                class136.field2328.field1012 = 0;
                class250.field4201 = class136.field2328.method501(0);
                class72.field1215 = class136.field2328.method501(0);
                class188.field3140 = class136.field2328.method501(0);
                if (class188.field3140 == 1) {
                    try {
                        class60.field1059.method662(0, class210.field3585.field2072);
                    } catch (Throwable var11) {
                    }
                } else {
                    try {
                        class99.field1645.method662(0, class210.field3585.field2072);
                    } catch (Throwable var12) {
                    }
                }
                class213.field3627 = class136.field2328.method501(0);
                class75.field1277 = class136.field2328.method501(0) == 1;
                class88.field1460 = class136.field2328.method485((byte) -2);
                class212.field3606 = class136.field2328.method501(0);
                client.field4016 = class136.field2328.method94(-126);
                class299.field5105 = class136.field2328.method485((byte) -2);
                class207.field3498 = 9;
            }
            if (class207.field3498 == 9) {
                if (class35.field513.method2042(arg0 - 89) >= class299.field5105) {
                    class136.field2328.field1012 = 0;
                    class35.field513.method2047(class136.field2328.field997, 0, class299.field5105, -3532);
                    class207.field3498 = 0;
                    class69.field1183 = 2;
                    class90.method715(true);
                    class59.field984 = -1;
                    class223.method1648(false, (byte) 115);
                    client.field4016 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class35.field513 != null) {
                class35.field513.method2048((byte) -52);
                class35.field513 = null;
            }
            if (class186.field3102 >= 1) {
                class207.field3498 = 0;
                class69.field1183 = -4;
            } else {
                class186.field3102++;
                if (class311.field5304 == class155.field2663) {
                    class311.field5304 = class117.field1992;
                } else {
                    class311.field5304 = class155.field2663;
                }
                class229.field3899 = 0;
                class207.field3498 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 400)
    public static final void method2092(byte arg0) {
        field5207++;
        class274.field4730.method1200(false);
        if (arg0 <= 125) {
            field5203 = 13;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)Z", line = 419)
    public final boolean method2093(int arg0, int arg1, int arg2) {
        if (arg0 >= -38) {
            field5199 = (class75) null;
        }
        field5192++;
        return arg2 >= this.field5202 && this.field5196 >= arg2 && arg1 >= this.field5206 && arg1 <= this.field5205;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILcb;)[Lbh;", line = 444)
    public static final class258[] method2094(int arg0, int arg1, int arg2, class267 arg3) {
        field5197++;
        if (class281.method1994(arg1, (byte) -7, arg2, arg3)) {
            if (arg0 != -7865) {
                field5203 = 52;
            }
            return class167.method1239(arg0 ^ 0xFFFFE145);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIII)V", line = 460)
    public class304(int arg0, int arg1, int arg2, int arg3) {
        this.field5202 = arg0;
        this.field5206 = arg1;
        this.field5205 = arg3;
        this.field5196 = arg2;
    }
}
