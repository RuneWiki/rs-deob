import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class242 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3838 = 1;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Z")
    public static boolean field3846 = false;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Z")
    public static boolean field3844 = false;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3847 = "Loading interfaces - ";

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lok;")
    public static class160 field3840;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[[B")
    public static byte[][] field3843;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 13)
    public static void method1710(int arg0) {
        if (arg0 == 4) {
            field3847 = null;
            field3843 = (byte[][]) null;
            field3840 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 30)
    public static final void method1711(byte arg0) {
        field3842++;
        if (class105.field1585 == 0 || class105.field1585 == 5) {
            return;
        }
        try {
            if (++class21.field311 > 2000) {
                if (class69.field901 != null) {
                    class69.field901.method2095(8737);
                    class69.field901 = null;
                }
                if (class170.field2730 >= 1) {
                    class105.field1585 = 0;
                    class80.field1205 = -5;
                    return;
                }
                class21.field311 = 0;
                if (class206.field3366 == class127.field1890) {
                    class206.field3366 = class130.field1920;
                } else {
                    class206.field3366 = class127.field1890;
                }
                class170.field2730++;
                class105.field1585 = 1;
            }
            if (arg0 >= -65) {
                field3847 = (String) null;
            }
            if (class105.field1585 == 1) {
                class142.field2128 = class264.field4183.method41(class206.field3366, class246.field3908, -1);
                class105.field1585 = 2;
            }
            if (class105.field1585 == 2) {
                if (class142.field2128.field3488 == 2) {
                    throw new IOException();
                }
                if (class142.field2128.field3488 != 1) {
                    return;
                }
                class69.field901 = new class300((Socket) class142.field2128.field3490, class264.field4183);
                class142.field2128 = null;
                long var1 = class140.field2085 = class232.method1669(37, client.field4228);
                class21.field313.field3129 = 0;
                class21.field313.method1365(-32769, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class21.field313.method1365(-32769, var3);
                class69.field901.method2101(class21.field313.field3128, (byte) 18, 0, 2);
                if (class154.field2355 != null) {
                    class154.field2355.method656((byte) 10);
                }
                if (class296.field4640 != null) {
                    class296.field4640.method656((byte) 10);
                }
                int var4 = class69.field901.method2099(0);
                if (class154.field2355 != null) {
                    class154.field2355.method656((byte) 10);
                }
                if (class296.field4640 != null) {
                    class296.field4640.method656((byte) 10);
                }
                if (var4 != 0) {
                    class80.field1205 = var4;
                    class105.field1585 = 0;
                    class69.field901.method2095(8737);
                    class69.field901 = null;
                    return;
                }
                class105.field1585 = 3;
            }
            if (class105.field1585 == 3) {
                if (class69.field901.method2100(0) < 8) {
                    return;
                }
                class69.field901.method2092(8, 15167, class336.field5213.field3128, 0);
                int[] var5 = new int[4];
                class336.field5213.field3129 = 0;
                class155.field2385 = class336.field5213.method1346(2);
                var5[3] = (int) class155.field2385;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class155.field2385 >> 32);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class21.field313.field3129 = 0;
                class21.field313.method1365(-32769, 10);
                class21.field313.method1350(var5[0], -121);
                class21.field313.method1350(var5[1], -79);
                class21.field313.method1350(var5[2], -104);
                class21.field313.method1350(var5[3], -53);
                class21.field313.method1375(class232.method1669(37, client.field4228), 127);
                class21.field313.method1374(class287.field4524, (byte) -103);
                class21.field313.method1348(class151.field2315, (byte) 106, class39.field547);
                class41.field572.field3129 = 0;
                if (class144.field2159 == 40) {
                    class41.field572.method1365(-32769, 18);
                } else {
                    class41.field572.method1365(-32769, 16);
                }
                class41.field572.method1368(163 - (-class21.field313.field3129 - class342.method2361(class147.field2204, 23126)), 4796);
                class41.field572.method1350(545, -127);
                class41.field572.method1365(-32769, class81.field1227);
                class41.field572.method1365(-32769, class152.field2329 ? 1 : 0);
                class41.field572.method1365(-32769, 1);
                class41.field572.method1365(-32769, class60.method416(-51));
                class41.field572.method1368(class160.field2601, 4796);
                class41.field572.method1368(class210.field3432, 4796);
                class41.field572.method1365(-32769, class330.field5138);
                class126.method868(-18581, class41.field572);
                class41.field572.method1374(class147.field2204, (byte) -101);
                class41.field572.method1350(class240.field3807, -90);
                class41.field572.method1350(class38.method239((byte) 119), -81);
                class201.field3294 = true;
                class41.field572.method1368(class331.field5159, 4796);
                class41.field572.method1350(class261.field4158.method259((byte) 86), -103);
                class41.field572.method1350(class66.field865.method259((byte) 86), -47);
                class41.field572.method1350(class8.field89.method259((byte) 86), -99);
                class41.field572.method1350(class189.field3077.method259((byte) 86), -63);
                class41.field572.method1350(class35.field469.method259((byte) 86), -93);
                class41.field572.method1350(class239.field3775.method259((byte) 86), -44);
                class41.field572.method1350(class139.field2077.method259((byte) 86), -98);
                class41.field572.method1350(class182.field2946.method259((byte) 86), -107);
                class41.field572.method1350(class149.field2248.method259((byte) 86), -58);
                class41.field572.method1350(class337.field5236.method259((byte) 86), -120);
                class41.field572.method1350(class283.field4465.method259((byte) 86), -122);
                class41.field572.method1350(class187.field3043.method259((byte) 86), -94);
                class41.field572.method1350(class305.field4757.method259((byte) 86), -74);
                class41.field572.method1350(class121.field1841.method259((byte) 86), -45);
                class41.field572.method1350(class204.field3328.method259((byte) 86), -48);
                class41.field572.method1350(class107.field1618.method259((byte) 86), -88);
                class41.field572.method1350(class63.field832.method259((byte) 86), -44);
                class41.field572.method1350(class256.field4062.method259((byte) 86), -42);
                class41.field572.method1350(class40.field558.method259((byte) 86), -126);
                class41.field572.method1350(class314.field4898.method259((byte) 86), -90);
                class41.field572.method1350(class34.field458.method259((byte) 86), -50);
                class41.field572.method1350(class62.field820.method259((byte) 86), -124);
                class41.field572.method1350(class5.field57.method259((byte) 86), -117);
                class41.field572.method1350(class42.field588.method259((byte) 86), -83);
                class41.field572.method1350(class20.field295.method259((byte) 86), -72);
                class41.field572.method1350(class17.field234.method259((byte) 86), -119);
                class41.field572.method1350(class204.field3333.method259((byte) 86), -74);
                class41.field572.method1350(class163.field2660.method259((byte) 86), -95);
                class41.field572.method1350(class215.field3477.method259((byte) 86), -88);
                class41.field572.method1367(class21.field313.field3129, 0, class21.field313.field3128, 504526352);
                class69.field901.method2101(class41.field572.field3128, (byte) 18, 0, class41.field572.field3129);
                class21.field313.method1538(var5, false);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class336.field5213.method1538(var5, false);
                class105.field1585 = 4;
            }
            if (class105.field1585 == 4) {
                if (class69.field901.method2100(0) < 1) {
                    return;
                }
                int var7 = class69.field901.method2099(0);
                if (var7 == 21) {
                    class105.field1585 = 7;
                } else if (var7 == 29) {
                    class105.field1585 = 10;
                } else if (var7 == 1) {
                    class80.field1205 = var7;
                    class105.field1585 = 5;
                    return;
                } else if (var7 == 2) {
                    class105.field1585 = 8;
                } else if (var7 == 15) {
                    class80.field1205 = var7;
                    class105.field1585 = 0;
                    return;
                } else if (var7 == 23 && class170.field2730 < 1) {
                    class21.field311 = 0;
                    class105.field1585 = 1;
                    class170.field2730++;
                    class69.field901.method2095(8737);
                    class69.field901 = null;
                    return;
                } else {
                    class80.field1205 = var7;
                    class105.field1585 = 0;
                    class69.field901.method2095(8737);
                    class69.field901 = null;
                    return;
                }
            }
            if (class105.field1585 == 6) {
                class21.field313.field3129 = 0;
                class21.field313.method1541(115, 17);
                class69.field901.method2101(class21.field313.field3128, (byte) 18, 0, class21.field313.field3129);
                class105.field1585 = 4;
                return;
            }
            if (class105.field1585 == 7) {
                if (class69.field901.method2100(0) < 1) {
                    return;
                }
                class113.field1694 = (class69.field901.method2099(0) + 3) * 60;
                class80.field1205 = 21;
                class105.field1585 = 0;
                class69.field901.method2095(8737);
                class69.field901 = null;
                return;
            }
            if (class105.field1585 == 10) {
                if (class69.field901.method2100(0) >= 1) {
                    class50.field687 = class69.field901.method2099(0);
                    class105.field1585 = 0;
                    class80.field1205 = 29;
                    class69.field901.method2095(8737);
                    class69.field901 = null;
                    return;
                }
                return;
            }
            if (class105.field1585 == 8) {
                if (class69.field901.method2100(0) < 14) {
                    return;
                }
                class69.field901.method2092(14, 15167, class336.field5213.field3128, 0);
                class336.field5213.field3129 = 0;
                class254.field4033 = class336.field5213.method1399(-1172389784);
                class206.field3346 = class336.field5213.method1399(-1172389784);
                class288.field4549 = class336.field5213.method1399(-1172389784) == 1;
                class112.field1675 = class336.field5213.method1399(-1172389784) == 1;
                class154.field2359 = class336.field5213.method1399(-1172389784) == 1;
                class210.field3446 = class336.field5213.method1399(-1172389784) == 1;
                class105.field1586 = class336.field5213.method1399(-1172389784) == 1;
                class254.field4032 = class336.field5213.method1396(-127);
                class185.field2977 = class336.field5213.method1399(-1172389784) == 1;
                class255.field4057 = class336.field5213.method1399(-1172389784) == 1;
                class99.method697((byte) 43, class255.field4057);
                class271.method1937(class255.field4057, true);
                if (!class152.field2329) {
                    if ((!class288.field4549 || class154.field2359) && !class185.field2977) {
                        try {
                            class72.method470("unzap", (byte) -122, class264.field4183.field68);
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class72.method470("zap", (byte) -122, class264.field4183.field68);
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class72.method470("loggedin", (byte) -122, class264.field4183.field68);
                } catch (Throwable var12) {
                }
                class35.field459 = class336.field5213.method1537(255);
                class138.field2063 = class336.field5213.method1396(-64);
                class105.field1585 = 9;
            }
            if (class105.field1585 == 9) {
                if (class69.field901.method2100(0) < class138.field2063) {
                    return;
                }
                class336.field5213.field3129 = 0;
                class69.field901.method2092(class138.field2063, 15167, class336.field5213.field3128, 0);
                class105.field1585 = 0;
                class80.field1205 = 2;
                class175.method1223(0);
                class31.field437 = -1;
                class175.method1208(false, -109);
                class35.field459 = -1;
                return;
            }
        } catch (IOException var15) {
            if (class69.field901 != null) {
                class69.field901.method2095(8737);
                class69.field901 = null;
            }
            if (class170.field2730 < 1) {
                class21.field311 = 0;
                class105.field1585 = 1;
                if (class206.field3366 == class127.field1890) {
                    class206.field3366 = class130.field1920;
                } else {
                    class206.field3366 = class127.field1890;
                }
                class170.field2730++;
            } else {
                class80.field1205 = -4;
                class105.field1585 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lkb;B)V", line = 412)
    public static final void method1712(class39 arg0, byte arg1) {
        class44.field606 = arg0;
        class284.field4487 = class44.field606.method261(-124, 16);
        field3848++;
        if (arg1 != -120) {
            field3847 = (String) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V", line = 433)
    public static final void method1713(boolean arg0, int arg1) {
        class116.method805(arg0, class210.field3432, class160.field2601, -1, class246.field3904);
        if (arg1 < 43) {
            method1711((byte) 19);
        }
        field3839++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)[Lug;", line = 449)
    public static final class321[] method1714(boolean arg0) {
        if (arg0) {
            field3841 = -75;
        }
        field3845++;
        class321[] var1 = new class321[class56.field740];
        for (int var2 = 0; var2 < class56.field740; var2++) {
            int var3 = class244.field3885[var2] * class21.field316[var2];
            byte[] var4 = class3.field20[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class305.field4754[class200.method1465(var4[var6], 255)];
            }
            if (class186.field2991) {
                var1[var2] = new class14(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], var5);
            } else {
                var1[var2] = new class298(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], var5);
            }
        }
        class17.method115((byte) -78);
        return var1;
    }
}
