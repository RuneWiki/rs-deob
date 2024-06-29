import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class299 {

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field4189 = -1;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "Z")
    public static boolean field4192;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public int field4182;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public int field4188;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "[I")
    public static int[] field4191;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method1974(int arg0) {
        if (arg0 != 14) {
            field4190 = 92;
        }
        field4191 = null;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
    public static final void method1975(int arg0) {
        field4184++;
        if (class176.field2396 == 0 || class176.field2396 == 5) {
            return;
        }
        try {
            if ((++class311.field4397) > 2000) {
                if (class146.field1798 != null) {
                    class146.field1798.method1343((byte) -120);
                    class146.field1798 = null;
                }
                if (class40.field463 >= 1) {
                    class346.field4890 = -5;
                    class176.field2396 = 0;
                    return;
                }
                class176.field2396 = 1;
                class40.field463++;
                class311.field4397 = 0;
                if (class297.field4149 == class154.field1904) {
                    class297.field4149 = class276.field3917;
                } else {
                    class297.field4149 = class154.field1904;
                }
            }
            if (class176.field2396 == 1) {
                class358.field5087 = class14.field185.method1268(class310.field4384, (byte) -89, class297.field4149);
                class176.field2396 = 2;
            }
            if (class176.field2396 == 2) {
                if (class358.field5087.field4498 == 2) {
                    throw new IOException();
                }
                if (class358.field5087.field4498 != 1) {
                    return;
                }
                class146.field1798 = new class202((Socket) class358.field5087.field4497, class14.field185);
                class358.field5087 = null;
                long var1 = class284.field3996 = class193.method1310(class78.field924, (byte) 122);
                class62.field718.field3320 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class62.field718.method1583(14, (byte) -107);
                class62.field718.method1583(var3, (byte) -101);
                class146.field1798.method1337(2, (byte) -38, 0, class62.field718.field3364);
                if (class81.field942 != null) {
                    class81.field942.method137(arg0 + 14498);
                }
                if (class230.field3255 != null) {
                    class230.field3255.method137(-15326);
                }
                int var4 = class146.field1798.method1344((byte) -103);
                if (class81.field942 != null) {
                    class81.field942.method137(-15326);
                }
                if (class230.field3255 != null) {
                    class230.field3255.method137(-15326);
                }
                if (var4 != 0) {
                    class346.field4890 = var4;
                    class176.field2396 = 0;
                    class146.field1798.method1343((byte) -87);
                    class146.field1798 = null;
                    return;
                }
                class176.field2396 = 3;
            }
            if (arg0 != -29824) {
                field4191 = null;
            }
            if (class176.field2396 == 3) {
                if (class146.field1798.method1340(arg0 ^ 0xFFFF8B80) < 8) {
                    return;
                }
                class146.field1798.method1336((byte) 125, class359.field5120.field3364, 0, 8);
                class359.field5120.field3320 = 0;
                class85.field970 = class359.field5120.method1600(-1);
                int[] var5 = new int[4];
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class62.field718.field3320 = 0;
                var5[2] = (int) (class85.field970 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class85.field970;
                class62.field718.method1583(10, (byte) -66);
                class62.field718.method1603(var5[0], 871);
                class62.field718.method1603(var5[1], arg0 ^ 0xFFFF88E7);
                class62.field718.method1603(var5[2], arg0 + 30695);
                class62.field718.method1603(var5[3], 871);
                class62.field718.method1615(class193.method1310(class78.field924, (byte) 124), 116);
                class62.field718.method1596(class143.field1754, false);
                class62.field718.method1558(true, class125.field1530, class158.field2063);
                class168.field2342.field3320 = 0;
                if (class40.field475 == 40) {
                    class168.field2342.method1583(18, (byte) -109);
                } else {
                    class168.field2342.method1583(16, (byte) -92);
                }
                class168.field2342.method1605(class62.field718.field3320 + class81.method457(class292.field4086, (byte) -49) + 161, false);
                class168.field2342.method1603(569, 871);
                class168.field2342.method1583(class451.field6459, (byte) -52);
                class168.field2342.method1583(class26.method180(-71), (byte) -70);
                class168.field2342.method1605(class330.field4671, false);
                class168.field2342.method1605(class105.field1259, false);
                class168.field2342.method1583(class408.field5877, (byte) -99);
                class62.method357(class168.field2342, (byte) -116);
                class168.field2342.method1596(class292.field4086, false);
                class168.field2342.method1603(class303.field4269, arg0 ^ 0xFFFF88E7);
                class168.field2342.method1603(class359.method2302((byte) 42), 871);
                class101.field1218 = true;
                class168.field2342.method1605(class336.field4771, false);
                class168.field2342.method1603(class341.field4839.method2425((byte) -96), arg0 ^ 0xFFFF88E7);
                class168.field2342.method1603(class250.field3566.method2425((byte) 122), 871);
                class168.field2342.method1603(class158.field2060.method2425((byte) 23), arg0 + 30695);
                class168.field2342.method1603(class262.field3742.method2425((byte) 7), arg0 ^ 0xFFFF88E7);
                class168.field2342.method1603(class263.field3751.method2425((byte) -55), 871);
                class168.field2342.method1603(class311.field4389.method2425((byte) -26), 871);
                class168.field2342.method1603(class393.field5553.method2425((byte) -84), 871);
                class168.field2342.method1603(class33.field384.method2425((byte) 26), 871);
                class168.field2342.method1603(class298.field4178.method2425((byte) 125), 871);
                class168.field2342.method1603(class212.field3017.method2425((byte) 2), 871);
                class168.field2342.method1603(class397.field5686.method2425((byte) -19), 871);
                class168.field2342.method1603(class105.field1253.method2425((byte) -40), 871);
                class168.field2342.method1603(class406.field5866.method2425((byte) -13), 871);
                class168.field2342.method1603(class335.field4752.method2425((byte) -18), 871);
                class168.field2342.method1603(class41.field501.method2425((byte) 123), arg0 ^ 0xFFFF88E7);
                class168.field2342.method1603(class97.field1173.method2425((byte) -122), arg0 + 30695);
                class168.field2342.method1603(class309.field4378.method2425((byte) 122), arg0 ^ 0xFFFF88E7);
                class168.field2342.method1603(class184.field2587.method2425((byte) -120), 871);
                class168.field2342.method1603(class310.field4385.method2425((byte) 123), 871);
                class168.field2342.method1603(class128.field1548.method2425((byte) 125), 871);
                class168.field2342.method1603(class153.field1886.method2425((byte) 26), 871);
                class168.field2342.method1603(class241.field3435.method2425((byte) 127), 871);
                class168.field2342.method1603(class296.field4120.method2425((byte) 124), arg0 ^ 0xFFFF88E7);
                class168.field2342.method1603(class4.field32.method2425((byte) 127), 871);
                class168.field2342.method1603(class14.field178.method2425((byte) 123), 871);
                class168.field2342.method1603(class322.field4587.method2425((byte) 125), 871);
                class168.field2342.method1603(class432.field6221.method2425((byte) 124), 871);
                class168.field2342.method1603(class351.field4966.method2425((byte) -24), 871);
                class168.field2342.method1603(class346.field4898.method2425((byte) 125), arg0 ^ 0xFFFF88E7);
                class168.field2342.method1571(class62.field718.field3364, 116, class62.field718.field3320, 0);
                class146.field1798.method1337(class168.field2342.field3320, (byte) -20, 0, class168.field2342.field3364);
                class62.field718.method2147(0, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class359.field5120.method2147(0, var5);
                class176.field2396 = 4;
            }
            if (class176.field2396 == 4) {
                if (class146.field1798.method1340(0) < 1) {
                    return;
                }
                int var7 = class146.field1798.method1344((byte) -103);
                if (var7 == 21) {
                    class176.field2396 = 7;
                } else if (var7 == 29) {
                    class176.field2396 = 10;
                } else if (var7 == 1) {
                    class346.field4890 = var7;
                    class176.field2396 = 5;
                    return;
                } else if (var7 == 2) {
                    class176.field2396 = 8;
                } else if (var7 == 15) {
                    class176.field2396 = 0;
                    class346.field4890 = var7;
                    return;
                } else if (var7 == 23 && class40.field463 < 1) {
                    class176.field2396 = 1;
                    class311.field4397 = 0;
                    class40.field463++;
                    class146.field1798.method1343((byte) -51);
                    class146.field1798 = null;
                    return;
                } else {
                    class346.field4890 = var7;
                    class176.field2396 = 0;
                    class146.field1798.method1343((byte) -71);
                    class146.field1798 = null;
                    return;
                }
            }
            if (class176.field2396 == 6) {
                class62.field718.field3320 = 0;
                class62.field718.method2143(17, -2);
                class146.field1798.method1337(class62.field718.field3320, (byte) 122, 0, class62.field718.field3364);
                class176.field2396 = 4;
            } else if (class176.field2396 == 7) {
                if (class146.field1798.method1340(arg0 ^ 0xFFFF8B80) >= 1) {
                    class89.field1088 = class146.field1798.method1344((byte) -103) * 60 + 180;
                    class346.field4890 = 21;
                    class176.field2396 = 0;
                    class146.field1798.method1343((byte) 89);
                    class146.field1798 = null;
                }
            } else if (class176.field2396 != 10) {
                if (class176.field2396 == 8) {
                    if (class146.field1798.method1340(0) < 13) {
                        return;
                    }
                    class146.field1798.method1336((byte) 125, class359.field5120.field3364, 0, 13);
                    class359.field5120.field3320 = 0;
                    class135.field1685 = class359.field5120.method1574(-100);
                    class367.field5209 = class359.field5120.method1574(arg0 ^ 0x7431);
                    class452.field6472 = class359.field5120.method1574(-22) == 1;
                    class331.field4681 = class359.field5120.method1574(arg0 + 29741) == 1;
                    class18.field214 = class359.field5120.method1574(-61) == 1;
                    class400.field5721 = class359.field5120.method1574(arg0 + 29747) == 1;
                    class414.field5948 = class359.field5120.method1617((byte) 48);
                    class429.field6198 = class359.field5120.method1574(-49) == 1;
                    class190.field2742 = class359.field5120.method1574(-119) == 1;
                    class242.method1652(arg0 ^ 0xFFFF8B80, class190.field2742);
                    class68.method381(class190.field2742, true);
                    class288.method1891(class190.field2742, (byte) 106);
                    if ((!class452.field6472 || class18.field214) && !class429.field6198) {
                        try {
                            class368.method2348(class14.field185.field2685, 14, "unzap");
                        } catch (Throwable var10) {
                        }
                    } else {
                        try {
                            class368.method2348(class14.field185.field2685, 29, "zap");
                        } catch (Throwable var9) {
                        }
                    }
                    if (class237.field3389 == 0) {
                        try {
                            class368.method2348(class14.field185.field2685, -93, "loggedin");
                        } catch (Throwable var8) {
                        }
                    }
                    class188.field2717 = class359.field5120.method2142((byte) 84);
                    class55.field658 = class359.field5120.method1617((byte) 48);
                    class176.field2396 = 9;
                }
                if (class176.field2396 == 9 && class146.field1798.method1340(0) >= class55.field658) {
                    class359.field5120.field3320 = 0;
                    class146.field1798.method1336((byte) 125, class359.field5120.field3364, 0, class55.field658);
                    class176.field2396 = 0;
                    class346.field4890 = 2;
                    class435.method2726(true);
                    class153.field1896 = -1;
                    class433.method2716(3, false);
                    class188.field2717 = -1;
                }
            } else if (class146.field1798.method1340(0) >= 1) {
                class229.field3246 = class146.field1798.method1344((byte) -103);
                class176.field2396 = 0;
                class346.field4890 = 29;
                class146.field1798.method1343((byte) -71);
                class146.field1798 = null;
            }
        } catch (IOException var11) {
            if (class146.field1798 != null) {
                class146.field1798.method1343((byte) 106);
                class146.field1798 = null;
            }
            if (class40.field463 >= 1) {
                class346.field4890 = -4;
                class176.field2396 = 0;
            } else {
                class176.field2396 = 1;
                if (class297.field4149 == class154.field1904) {
                    class297.field4149 = class276.field3917;
                } else {
                    class297.field4149 = class154.field1904;
                }
                class311.field4397 = 0;
                class40.field463++;
            }
        }
    }

    static {
        new class362("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field4192 = false;
    }
}
