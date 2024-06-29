import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class134 extends class137 {

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "Lab;")
    public class141 field2125;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "Z")
    public static boolean field2127 = true;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "Lbl;")
    public static class146 field2128;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Ltd;")
    public static class226 field2126;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Ldk;")
    public static class251 field2124;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field2129;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "(I)V")
    public static final void method944(int arg0) {
        if (arg0 != 21) {
            field2126 = null;
        }
        field2122++;
        try {
            Method var1 = (field2129 == null ? (field2129 = method947("java.lang.Runtime")) : field2129).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class313.field4991 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method945(byte arg0) {
        field2124 = null;
        field2128 = null;
        field2126 = null;
        if (arg0 <= 84) {
            field2128 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static final void method946(byte arg0) {
        field2123++;
        if (class162.field2612 == 0 || class162.field2612 == 5) {
            return;
        }
        try {
            if (++class55.field902 > 2000) {
                if (class208.field3298 != null) {
                    class208.field3298.method974((byte) 110);
                    class208.field3298 = null;
                }
                if (class167.field2726 >= 1) {
                    class162.field2612 = 0;
                    class311.field4973 = -5;
                    return;
                }
                class167.field2726++;
                if (class32.field483 == class245.field3903) {
                    class245.field3903 = class52.field870;
                } else {
                    class245.field3903 = class32.field483;
                }
                class162.field2612 = 1;
                class55.field902 = 0;
            }
            if (class162.field2612 == 1) {
                class230.field3720 = class268.field4323.method326(true, class145.field2289, class245.field3903);
                class162.field2612 = 2;
            }
            if (class162.field2612 == 2) {
                if (class230.field3720.field2814 == 2) {
                    throw new IOException();
                }
                if (class230.field3720.field2814 != 1) {
                    return;
                }
                class208.field3298 = new class139((Socket) class230.field3720.field2817, class268.field4323);
                class230.field3720 = null;
                long var1 = class62.field1027 = class178.method1303(class240.field3836, -128);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class314.field5061.field2568 = 0;
                class314.field5061.method1108(14, true);
                class314.field5061.method1108(var3, true);
                class208.field3298.method977(class314.field5061.field2573, 2, 0, -27241);
                if (class233.field3750 != null) {
                    class233.field3750.method1925(105);
                }
                if (class62.field1024 != null) {
                    class62.field1024.method1925(arg0 ^ 0x8);
                }
                int var4 = class208.field3298.method978(-110);
                if (class233.field3750 != null) {
                    class233.field3750.method1925(arg0 + 121);
                }
                if (class62.field1024 != null) {
                    class62.field1024.method1925(-38);
                }
                if (var4 != 0) {
                    class311.field4973 = var4;
                    class162.field2612 = 0;
                    class208.field3298.method974((byte) 123);
                    class208.field3298 = null;
                    return;
                }
                class162.field2612 = 3;
            }
            if (class162.field2612 == 3) {
                if (class208.field3298.method972(0) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class208.field3298.method979(class131.field2053.field2573, arg0 + 1, 0, 8);
                class131.field2053.field2568 = 0;
                class128.field2021 = class131.field2053.method1119(true);
                var5[3] = (int) class128.field2021;
                class314.field5061.field2568 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class128.field2021 >> 32);
                class314.field5061.method1108(10, true);
                class314.field5061.method1125(var5[0], 255);
                class314.field5061.method1125(var5[1], 255);
                class314.field5061.method1125(var5[2], 255);
                class314.field5061.method1125(var5[3], 255);
                class314.field5061.method1156(arg0 ^ 0x7C89, class178.method1303(class240.field3836, -128));
                class314.field5061.method1148((byte) -99, class69.field1146);
                class314.field5061.method1110(class104.field1663, (byte) 121, class309.field4937);
                class131.field2068.field2568 = 0;
                if (class153.field2385 == 40) {
                    class131.field2068.method1108(18, true);
                } else {
                    class131.field2068.method1108(16, true);
                }
                class131.field2068.method1120(class314.field5061.field2568 + (class230.method1551(class160.field2545, (byte) -87) + 163), true);
                class131.field2068.method1125(552, 255);
                class131.field2068.method1108(class60.field984, true);
                class131.field2068.method1108(class266.field4275 ? 1 : 0, true);
                class131.field2068.method1108(0, true);
                class131.field2068.method1108(class56.method383(false), true);
                class131.field2068.method1120(class294.field4709, true);
                class131.field2068.method1120(class310.field4964, true);
                class131.field2068.method1108(class265.field4273, true);
                class264.method1775(class131.field2068, (byte) -121);
                class131.field2068.method1148((byte) -99, class160.field2545);
                class131.field2068.method1125(class1.field17, arg0 ^ 0xFFFFFF01);
                class131.field2068.method1125(class50.method354(-32224), 255);
                field2127 = true;
                class131.field2068.method1120(class128.field2018, true);
                class131.field2068.method1125(class256.field4148.method1681(-8169), arg0 ^ 0xFFFFFF01);
                class131.field2068.method1125(class220.field3602.method1681(-8169), 255);
                class131.field2068.method1125(class269.field4342.method1681(-8169), 255);
                class131.field2068.method1125(class234.field3752.method1681(-8169), 255);
                class131.field2068.method1125(class229.field3690.method1681(-8169), 255);
                class131.field2068.method1125(class84.field1393.method1681(-8169), 255);
                class131.field2068.method1125(class50.field852.method1681(arg0 - 8167), 255);
                class131.field2068.method1125(class265.field4266.method1681(-8169), 255);
                class131.field2068.method1125(class160.field2541.method1681(-8169), arg0 + 257);
                class131.field2068.method1125(class267.field4303.method1681(arg0 - 8167), 255);
                class131.field2068.method1125(class247.field3938.method1681(-8169), arg0 + 257);
                class131.field2068.method1125(class216.field3566.method1681(-8169), 255);
                class131.field2068.method1125(class10.field105.method1681(arg0 - 8167), 255);
                class131.field2068.method1125(class72.field1213.method1681(-8169), 255);
                class131.field2068.method1125(class193.field3145.method1681(-8169), 255);
                class131.field2068.method1125(class216.field3570.method1681(arg0 ^ 0x1FE9), 255);
                class131.field2068.method1125(class223.field3624.method1681(-8169), arg0 + 257);
                class131.field2068.method1125(class98.field1579.method1681(-8169), 255);
                class131.field2068.method1125(class83.field1380.method1681(-8169), 255);
                class131.field2068.method1125(class44.field727.method1681(-8169), 255);
                class131.field2068.method1125(class236.field3782.method1681(arg0 - 8167), 255);
                class131.field2068.method1125(class189.field3061.method1681(-8169), 255);
                class131.field2068.method1125(class310.field4962.method1681(-8169), arg0 + 257);
                class131.field2068.method1125(class32.field496.method1681(-8169), 255);
                class131.field2068.method1125(class233.field3735.method1681(arg0 - 8167), arg0 ^ 0xFFFFFF01);
                class131.field2068.method1125(class48.field799.method1681(-8169), 255);
                class131.field2068.method1125(class137.field2171.method1681(-8169), 255);
                class131.field2068.method1125(class293.field4700.method1681(-8169), 255);
                class131.field2068.method1125(class241.field3846.method1681(-8169), 255);
                class131.field2068.method1131(class314.field5061.field2568, class314.field5061.field2573, 0, 2);
                class208.field3298.method977(class131.field2068.field2573, class131.field2068.field2568, 0, -27241);
                class314.field5061.method822(var5, (byte) 107);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class131.field2053.method822(var5, (byte) 107);
                class162.field2612 = 4;
            }
            if (class162.field2612 == 4) {
                if (class208.field3298.method972(0) < 1) {
                    return;
                }
                int var7 = class208.field3298.method978(-94);
                if (var7 == 21) {
                    class162.field2612 = 7;
                } else if (var7 == 29) {
                    class162.field2612 = 10;
                } else if (var7 == 1) {
                    class162.field2612 = 5;
                    class311.field4973 = var7;
                    return;
                } else if (var7 == 2) {
                    class162.field2612 = 8;
                } else if (var7 == 15) {
                    class162.field2612 = 0;
                    class311.field4973 = var7;
                    return;
                } else if (var7 == 23 && class167.field2726 < 1) {
                    class162.field2612 = 1;
                    class167.field2726++;
                    class55.field902 = 0;
                    class208.field3298.method974((byte) 106);
                    class208.field3298 = null;
                    return;
                } else {
                    class162.field2612 = 0;
                    class311.field4973 = var7;
                    class208.field3298.method974((byte) 125);
                    class208.field3298 = null;
                    return;
                }
            }
            if (class162.field2612 == 6) {
                class314.field5061.field2568 = 0;
                class314.field5061.method828(125, 17);
                class208.field3298.method977(class314.field5061.field2573, class314.field5061.field2568, 0, -27241);
                class162.field2612 = 4;
            } else if (class162.field2612 != 7) {
                if (arg0 != -2) {
                    field2127 = true;
                }
                if (class162.field2612 != 10) {
                    if (class162.field2612 == 8) {
                        if (class208.field3298.method972(0) < 14) {
                            return;
                        }
                        class208.field3298.method979(class131.field2053.field2573, -1, 0, 14);
                        class131.field2053.field2568 = 0;
                        class298.field4765 = class131.field2053.method1133((byte) 53);
                        class136.field2158 = class131.field2053.method1133((byte) 53);
                        class96.field1542 = class131.field2053.method1133((byte) 53) == 1;
                        class69.field1139 = class131.field2053.method1133((byte) 53) == 1;
                        class139.field2217 = class131.field2053.method1133((byte) 53) == 1;
                        class83.field1385 = class131.field2053.method1133((byte) 53) == 1;
                        class286.field4578 = class131.field2053.method1133((byte) 53) == 1;
                        class123.field1961 = class131.field2053.method1142(-18970);
                        class133.field2104 = class131.field2053.method1133((byte) 53) == 1;
                        class249.field3950 = class131.field2053.method1133((byte) 53) == 1;
                        class229.method1548(class249.field3950, (byte) -125);
                        class291.method1944(class249.field3950, -1);
                        class65.method457(class249.field3950, arg0 ^ 0xA7BC4672);
                        if (!class266.field4275) {
                            if ((!class96.field1542 || class139.field2217) && !class133.field2104) {
                                try {
                                    class297.method1967(false, "unzap", class268.field4323.field751);
                                } catch (Throwable var9) {
                                }
                            } else {
                                try {
                                    class297.method1967(false, "zap", class268.field4323.field751);
                                } catch (Throwable var10) {
                                }
                            }
                        }
                        try {
                            class297.method1967(false, "loggedin", class268.field4323.field751);
                        } catch (Throwable var8) {
                        }
                        class71.field1208 = class131.field2053.method826((byte) 79);
                        class47.field793 = class131.field2053.method1142(-18970);
                        class162.field2612 = 9;
                    }
                    if (class162.field2612 == 9 && class208.field3298.method972(0) >= class47.field793) {
                        class131.field2053.field2568 = 0;
                        class208.field3298.method979(class131.field2053.field2573, arg0 + 1, 0, class47.field793);
                        class162.field2612 = 0;
                        class311.field4973 = 2;
                        class92.method619((byte) -91);
                        class19.field226 = -1;
                        class150.method1039(4095, false);
                        class71.field1208 = -1;
                    }
                } else if (class208.field3298.method972(arg0 + 2) >= 1) {
                    class109.field1738 = class208.field3298.method978(-100);
                    class162.field2612 = 0;
                    class311.field4973 = 29;
                    class208.field3298.method974((byte) 125);
                    class208.field3298 = null;
                }
            } else if (class208.field3298.method972(0) >= 1) {
                class291.field4679 = class208.field3298.method978(-125) * 60 + 180;
                class162.field2612 = 0;
                class311.field4973 = 21;
                class208.field3298.method974((byte) 107);
                class208.field3298 = null;
            }
        } catch (IOException var11) {
            if (class208.field3298 != null) {
                class208.field3298.method974((byte) 113);
                class208.field3298 = null;
            }
            if (class167.field2726 >= 1) {
                class162.field2612 = 0;
                class311.field4973 = -4;
            } else {
                if (class32.field483 == class245.field3903) {
                    class245.field3903 = class52.field870;
                } else {
                    class245.field3903 = class32.field483;
                }
                class55.field902 = 0;
                class162.field2612 = 1;
                class167.field2726++;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lab;)V")
    public class134(class141 arg0) {
        this.field2125 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method947(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
