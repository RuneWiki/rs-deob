import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class104 {

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    private int field1497 = 128;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "Z")
    public boolean field1499 = false;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    private int field1501 = -1;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    private int field1498 = 0;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    private int field1493 = 128;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    private int field1507 = 0;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "B")
    public byte field1508 = 0;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public int field1505 = -1;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "I")
    private int field1517 = 0;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Lki;")
    public static class498 field1490 = new class498(75, 2);

    @OriginalMember(owner = "client!as", name = "z", descriptor = "Z")
    public static boolean field1515 = false;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "Lph;")
    public class454 field1491;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "[S")
    private short[] field1492;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "[S")
    private short[] field1500;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "[S")
    private short[] field1511;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "[S")
    private short[] field1514;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lna;IIZILrh;IIILqa;ILna;I)Lc;")
    public final class121 method640(class35 arg0, int arg1, int arg2, boolean arg3, int arg4, class172 arg5, int arg6, int arg7, int arg8, class162 arg9, int arg10, class35 arg11, int arg12) {
        if (arg1 != 9849) {
            method642(-6);
        }
        field1495++;
        return this.method646(arg0, true, arg7, arg6, arg2, arg12, arg10, (byte) 2, arg8, arg3, arg4, arg9, arg11, arg5);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILqa;IILrh;IB)Lc;")
    public final class121 method641(int arg0, class162 arg1, int arg2, int arg3, class172 arg4, int arg5, byte arg6) {
        field1512++;
        int var8 = 37 / ((-arg6 - 55) / 53);
        return this.method646(null, true, arg5, 0, 0, arg3, arg0, (byte) 2, 0, false, arg2, arg1, null, arg4);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static final void method642(int arg0) {
        class439.field6563 = 0;
        class80.field1217 = -3;
        class242.field3573 = arg0;
        field1503++;
        class445.field6627 = false;
        class118.field1789 = 0;
        class376.field5736 = -1;
        class28.field292 = 0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLdh;I)V")
    private final void method643(byte arg0, class209 arg1, int arg2) {
        int var4 = 112 % ((25 - arg0) / 57);
        field1504++;
        if (arg2 == 1) {
            this.field1496 = arg1.method1450((byte) 73);
        } else if (arg2 == 2) {
            this.field1505 = arg1.method1450((byte) 41);
        } else if (arg2 == 4) {
            this.field1497 = arg1.method1450((byte) 61);
        } else if (arg2 == 5) {
            this.field1493 = arg1.method1450((byte) 101);
        } else if (arg2 == 6) {
            this.field1517 = arg1.method1450((byte) 94);
        } else if (arg2 == 7) {
            this.field1498 = arg1.method1428(32122);
        } else if (arg2 == 8) {
            this.field1507 = arg1.method1428(32122);
        } else if (arg2 == 9) {
            this.field1508 = 3;
            this.field1501 = 8224;
        } else if (arg2 == 10) {
            this.field1499 = true;
        } else if (arg2 == 11) {
            this.field1508 = 1;
        } else if (arg2 == 12) {
            this.field1508 = 4;
        } else if (arg2 == 13) {
            this.field1508 = 5;
        } else if (arg2 == 14) {
            this.field1508 = 2;
            this.field1501 = arg1.method1428(32122) * 256;
        } else if (arg2 == 15) {
            this.field1508 = 3;
            this.field1501 = arg1.method1450((byte) 53);
        } else if (arg2 == 16) {
            this.field1508 = 3;
            this.field1501 = arg1.method1452(65280);
        } else if (arg2 == 40) {
            int var7 = arg1.method1428(32122);
            this.field1511 = new short[var7];
            this.field1492 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1511[var8] = (short) arg1.method1450((byte) 122);
                this.field1492[var8] = (short) arg1.method1450((byte) 98);
            }
        } else if (arg2 == 41) {
            int var5 = arg1.method1428(32122);
            this.field1514 = new short[var5];
            this.field1500 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1500[var6] = (short) arg1.method1450((byte) 94);
                this.field1514[var6] = (short) arg1.method1450((byte) 112);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILmv;)I")
    public static final int method644(int arg0, class252 arg1) {
        field1506++;
        int var2 = arg1.method1690((byte) 1, 2);
        int var3;
        if (~var2 == arg0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method1690((byte) 1, 5);
        } else if (var2 == 2) {
            var3 = arg1.method1690((byte) 1, 8);
        } else {
            var3 = arg1.method1690((byte) 1, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
    public static final void method645(int arg0) {
        field1510++;
        if (class242.field3573 == 0 || class242.field3573 == 5) {
            return;
        }
        try {
            if ((++class118.field1789) > 2000) {
                if (class90.field1361 != null) {
                    class90.field1361.method2312(false);
                    class90.field1361 = null;
                }
                if (class439.field6563 >= 1) {
                    class80.field1217 = -5;
                    class242.field3573 = 0;
                    return;
                }
                class118.field1789 = 0;
                if (class64.field965 == class499.field7358) {
                    class499.field7358 = class241.field3566;
                } else {
                    class499.field7358 = class64.field965;
                }
                class242.field3573 = 1;
                class439.field6563++;
            }
            if (class242.field3573 == 1) {
                class166.field2450 = class483.field7077.method2598(class285.field4101, class499.field7358, (byte) 110);
                class242.field3573 = 2;
            }
            if (class242.field3573 == 2) {
                if (class166.field2450.field4032 == 2) {
                    throw new IOException();
                }
                if (class166.field2450.field4032 != 1) {
                    return;
                }
                class90.field1361 = new class376((Socket) class166.field2450.field4030, class483.field7077);
                class166.field2450 = null;
                long var1 = class422.field6346 = class439.method2649((byte) 70, class474.field6983);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class356.field5471.field3037 = 0;
                class356.field5471.method1410(class46.field734.field4730, -27645);
                class356.field5471.method1410(var3, -27645);
                class90.field1361.method2311(2, class356.field5471.field3036, 4900, 0);
                class107.method664(128);
                int var4 = class90.field1361.method2306((byte) -87);
                class107.method664(arg0 + 121);
                if (var4 != 0) {
                    class80.field1217 = var4;
                    class242.field3573 = 0;
                    class90.field1361.method2312(false);
                    class90.field1361 = null;
                    return;
                }
                class242.field3573 = 3;
            }
            if (class242.field3573 == 3) {
                if (class90.field1361.method2310(97) < 8) {
                    return;
                }
                class90.field1361.method2308(class66.field1009.field3036, 0, 8, arg0 ^ 0x51);
                class66.field1009.field3037 = 0;
                class167.field2458 = class66.field1009.method1425(arg0 + 21978);
                class209 var5 = new class209(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class167.field2458 >> 32), (int) class167.field2458 };
                var5.method1410(10, -27645);
                var5.method1415(var6[0], (byte) -92);
                var5.method1415(var6[1], (byte) -125);
                var5.method1415(var6[2], (byte) -105);
                var5.method1415(var6[3], (byte) -115);
                var5.method1411(2144512464, class439.method2649((byte) -7, class474.field6983));
                var5.method1418(true, class69.field1050);
                var5.method1420(class244.field3600, class338.field4759, 127);
                class356.field5471.field3037 = 0;
                if (class193.field2832 == 40) {
                    class356.field5471.method1410(class46.field738.field4730, -27645);
                } else {
                    class356.field5471.method1410(class46.field736.field4730, -27645);
                }
                class356.field5471.method1413(arg0 ^ 0xFFFFFF8F, 0);
                int var7 = class356.field5471.field3037;
                class356.field5471.method1415(589, (byte) -59);
                class356.field5471.method1410(class310.field4453, -27645);
                class356.field5471.method1410(class14.method89(false), -27645);
                class356.field5471.method1413(-119, class4.field57);
                class356.field5471.method1413(-121, class116.field1743);
                class356.field5471.method1410(class426.field6401.field982, -27645);
                class139.method923(false, class356.field5471);
                class356.field5471.method1418(true, class465.field6885);
                class356.field5471.method1415(class159.field2357, (byte) -116);
                class209 var8 = class426.field6401.method2525(arg0 ^ 0x5);
                class356.field5471.method1410(var8.field3037, arg0 - 27652);
                class356.field5471.method1445(var8.field3036, var8.field3037, (byte) 93, 0);
                class526.field7788 = true;
                class356.field5471.method1413(-118, class483.field7081);
                class356.field5471.method1415(class150.field2234.method2937(true), (byte) -95);
                class356.field5471.method1415(class244.field3601.method2937(true), (byte) -90);
                class356.field5471.method1415(class434.field6497.method2937(true), (byte) -97);
                class356.field5471.method1415(class251.field3735.method2937(true), (byte) -93);
                class356.field5471.method1415(class65.field976.method2937(true), (byte) -121);
                class356.field5471.method1415(class132.field2035.method2937(true), (byte) -87);
                class356.field5471.method1415(class465.field6881.method2937(true), (byte) -57);
                class356.field5471.method1415(class195.field2835.method2937(true), (byte) -123);
                class356.field5471.method1415(class6.field81.method2937(true), (byte) -75);
                class356.field5471.method1415(class8.field117.method2937(true), (byte) -92);
                class356.field5471.method1415(class523.field7740.method2937(true), (byte) -67);
                class356.field5471.method1415(class151.field2253.method2937(true), (byte) -80);
                class356.field5471.method1415(class297.field4228.method2937(true), (byte) -72);
                class356.field5471.method1415(class105.field1522.method2937(true), (byte) -111);
                class356.field5471.method1415(class157.field2296.method2937(true), (byte) -74);
                class356.field5471.method1415(class6.field80.method2937(true), (byte) -117);
                class356.field5471.method1415(class267.field3907.method2937(true), (byte) -92);
                class356.field5471.method1415(class434.field6498.method2937(true), (byte) -114);
                class356.field5471.method1415(class159.field2353.method2937(true), (byte) -104);
                class356.field5471.method1415(class423.field6356.method2937(true), (byte) -82);
                class356.field5471.method1415(class495.field7325.method2937(true), (byte) -127);
                class356.field5471.method1415(client.field2847.method2937(true), (byte) -116);
                class356.field5471.method1415(class226.field3325.method2937(true), (byte) -108);
                class356.field5471.method1415(class277.field3994.method2937(true), (byte) -82);
                class356.field5471.method1415(class119.field1795.method2937(true), (byte) -102);
                class356.field5471.method1415(class148.field2203.method2937(true), (byte) -93);
                class356.field5471.method1415(class331.field4690.method2937(true), (byte) -79);
                class356.field5471.method1415(class354.field5453.method2937(true), (byte) -68);
                class356.field5471.method1415(class456.field6749.method2937(true), (byte) -83);
                class356.field5471.method1415(class37.field396.method2937(true), (byte) -120);
                class356.field5471.method1445(var5.field3036, var5.field3037, (byte) 93, 0);
                class356.field5471.method1431(-2, class356.field5471.field3037 - var7);
                class90.field1361.method2311(class356.field5471.field3037, class356.field5471.field3036, 4900, 0);
                class356.field5471.method1692(var6, arg0 ^ 0x7E);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class66.field1009.method1692(var6, 119);
                class242.field3573 = 4;
            }
            if (class242.field3573 == 4) {
                if (class90.field1361.method2310(-108) < 1) {
                    return;
                }
                int var10 = class90.field1361.method2306((byte) -81);
                if (var10 == 21) {
                    class242.field3573 = 7;
                } else if (var10 == 29) {
                    class242.field3573 = 11;
                } else if (var10 == 1) {
                    class80.field1217 = var10;
                    class242.field3573 = 5;
                    return;
                } else if (var10 == 2) {
                    class242.field3573 = 8;
                } else if (var10 == 15) {
                    class352.field5395 = -2;
                    class242.field3573 = 12;
                } else if (var10 == 23 && class439.field6563 < 1) {
                    class242.field3573 = 1;
                    class439.field6563++;
                    class118.field1789 = 0;
                    class90.field1361.method2312(false);
                    class90.field1361 = null;
                    return;
                } else {
                    class242.field3573 = 0;
                    class80.field1217 = var10;
                    class90.field1361.method2312(false);
                    class90.field1361 = null;
                    return;
                }
            }
            if (class242.field3573 == 6) {
                class356.field5471.field3037 = 0;
                class356.field5471.method1686(arg0 - 11, class46.field737.field4730);
                class90.field1361.method2311(class356.field5471.field3037, class356.field5471.field3036, 4900, 0);
                class242.field3573 = 4;
            } else if (class242.field3573 == 7) {
                if (class90.field1361.method2310(-53) >= 1) {
                    class28.field292 = class90.field1361.method2306((byte) -91) * 60 + 180;
                    class80.field1217 = 21;
                    class242.field3573 = 0;
                    class90.field1361.method2312(false);
                    class90.field1361 = null;
                }
            } else if (class242.field3573 != 11) {
                if (class242.field3573 == 8) {
                    if (class90.field1361.method2310(arg0 + 115) < 13) {
                        return;
                    }
                    class90.field1361.method2308(class66.field1009.field3036, 0, 13, arg0 + 78);
                    class66.field1009.field3037 = 0;
                    class402.field6053 = class66.field1009.method1428(arg0 + 32115);
                    class435.field6514 = class66.field1009.method1428(32122);
                    class56.field871 = class66.field1009.method1428(32122) == 1;
                    class447.field6665 = class66.field1009.method1428(32122) == 1;
                    class182.field2658 = class66.field1009.method1428(arg0 ^ 0x7D7D) == 1;
                    class214.field3124 = class66.field1009.method1428(32122) == 1;
                    class172.field2546 = class66.field1009.method1450((byte) 112);
                    class31.field341 = class66.field1009.method1428(arg0 ^ 0x7D7D) == 1;
                    class410.field6174 = class66.field1009.method1428(32122) == 1;
                    class252.field3743.method2684(class410.field6174, -29125);
                    class294.field4196.method462(class410.field6174, 74);
                    class431.field6451.method1731(class410.field6174, false);
                    if ((!class56.field871 || class182.field2658) && !class31.field341) {
                        try {
                            class501.method2995("unzap", (byte) 99, class483.field7077.field6462);
                        } catch (Throwable var15) {
                        }
                    } else {
                        try {
                            class501.method2995("zap", (byte) 116, class483.field7077.field6462);
                        } catch (Throwable var16) {
                            if (class3.field43) {
                                try {
                                    class483.field7077.field6462.getAppletContext().showDocument(new URL(class483.field7077.field6462.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var14) {
                                }
                            }
                        }
                    }
                    if (class447.field6662 == class125.field1890) {
                        try {
                            class501.method2995("loggedin", (byte) -57, class483.field7077.field6462);
                        } catch (Throwable var13) {
                        }
                    }
                    class242.field3573 = 10;
                }
                if (arg0 != 7) {
                    field1490 = null;
                }
                if (class242.field3573 == 10) {
                    if (class66.field1009.method1694(true)) {
                        if (class90.field1361.method2310(-110) < 1) {
                            return;
                        }
                        class90.field1361.method2308(class66.field1009.field3036, class66.field1009.field3037 + 2, 1, arg0 ^ 0x2C);
                    }
                    class59.field883 = client.method1336((byte) 89)[class66.field1009.method1693((byte) -110)];
                    class352.field5395 = class66.field1009.method1450((byte) 119);
                    class242.field3573 = 9;
                }
                if (class242.field3573 == 9) {
                    if (class90.field1361.method2310(-65) >= class352.field5395) {
                        class90.field1361.method2308(class66.field1009.field3036, 0, class352.field5395, 71);
                        class66.field1009.field3037 = 0;
                        int var11 = class352.field5395;
                        class80.field1217 = 2;
                        class242.field3573 = 0;
                        class90.method526(0);
                        class185.method1275(false, class66.field1009);
                        class116.field1744 = -1;
                        class470.method2818(-84);
                        if (class66.field1009.field3037 != var11) {
                            throw new RuntimeException("lswp pos:" + class66.field1009.field3037 + " psize:" + var11);
                        }
                        class59.field883 = null;
                    }
                } else if (class242.field3573 == 12) {
                    if (class352.field5395 == -2) {
                        if (class90.field1361.method2310(-100) < 2) {
                            return;
                        }
                        class90.field1361.method2308(class66.field1009.field3036, 0, 2, 108);
                        class66.field1009.field3037 = 0;
                        class352.field5395 = class66.field1009.method1450((byte) 76);
                    }
                    if (class90.field1361.method2310(arg0 ^ 0xFFFFFF8A) >= class352.field5395) {
                        class90.field1361.method2308(class66.field1009.field3036, 0, class352.field5395, 82);
                        class66.field1009.field3037 = 0;
                        int var12 = class352.field5395;
                        class80.field1217 = 15;
                        class242.field3573 = 0;
                        class42.method254(126);
                        class185.method1275(false, class66.field1009);
                        if (class66.field1009.field3037 != var12) {
                            throw new RuntimeException("lswpr pos:" + class66.field1009.field3037 + " psize:" + var12);
                        }
                        class59.field883 = null;
                    }
                }
            } else if (class90.field1361.method2310(-89) >= 1) {
                class376.field5736 = class90.field1361.method2306((byte) -89);
                class80.field1217 = 29;
                class242.field3573 = 0;
                class90.field1361.method2312(false);
                class90.field1361 = null;
            }
        } catch (IOException var17) {
            if (class90.field1361 != null) {
                class90.field1361.method2312(false);
                class90.field1361 = null;
            }
            if (class439.field6563 < 1) {
                class242.field3573 = 1;
                class439.field6563++;
                if (class64.field965 == class499.field7358) {
                    class499.field7358 = class241.field3566;
                } else {
                    class499.field7358 = class64.field965;
                }
                class118.field1789 = 0;
            } else {
                class80.field1217 = -4;
                class242.field3573 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lna;ZIIIIIBIZILqa;Lna;Lrh;)Lc;")
    private final class121 method646(class35 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, boolean arg9, int arg10, class162 arg11, class35 arg12, class172 arg13) {
        field1516++;
        int var15 = arg2;
        class329 var16 = this.field1505 == -1 || arg6 == -1 ? null : arg13.method1182(this.field1505, 8);
        boolean var17 = arg9 & this.field1508 != 0;
        if (var16 != null) {
            var15 = arg2 | var16.method2019(arg6, arg5, false, -65536);
        }
        if (var17) {
            var15 |= this.field1508 == 3 ? 7 : 2;
        }
        if (this.field1493 != 128) {
            var15 |= 0x2;
        }
        if (this.field1497 != 128 || this.field1517 != 0) {
            var15 |= 0x5;
        }
        class226 var18 = this.field1491.field6732;
        class121 var19;
        synchronized (this.field1491.field6732) {
            var19 = (class121) this.field1491.field6732.method1536((long) (this.field1502 |= arg11.field2371 << 29), 0);
        }
        if (var19 == null || arg11.method1122(var19.method738(), var15) != 0) {
            if (var19 != null) {
                var15 = arg11.method1051(var15, var19.method738());
            }
            int var20 = var15;
            if (this.field1511 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field1500 != null) {
                var20 |= 0x8000;
            }
            class521 var21 = class99.method612(this.field1491.field6727, 0, this.field1496, (byte) 106);
            if (var21 == null) {
                return null;
            }
            if (var21.field7677 < 13) {
                var21.method3091(-2, 0);
            }
            var19 = arg11.method1118(var21, var20, this.field1491.field6737, this.field1498 + 64, this.field1507 + 850);
            if (this.field1511 != null) {
                for (int var22 = 0; var22 < this.field1511.length; var22++) {
                    var19.method713(this.field1511[var22], this.field1492[var22]);
                }
            }
            if (this.field1500 != null) {
                for (int var23 = 0; var23 < this.field1500.length; var23++) {
                    var19.method744(this.field1500[var23], this.field1514[var23]);
                }
            }
            var19.method719(var15);
            class226 var24 = this.field1491.field6732;
            synchronized (this.field1491.field6732) {
                this.field1491.field6732.method1542(var19, (byte) 112, (long) (this.field1502 |= arg11.field2371 << 29));
            }
        }
        class121 var25 = var16 == null ? var19.method723(arg7, var15, true) : var16.method2022(arg5, var15, -128, arg7, 0, arg10, var19, arg6);
        if (this.field1497 != 128 || this.field1493 != 128) {
            var25.method705(this.field1497, this.field1493, this.field1497);
        }
        if (this.field1517 != 0) {
            if (this.field1517 == 90) {
                var25.method685(4096);
            }
            if (this.field1517 == 180) {
                var25.method685(8192);
            }
            if (this.field1517 == 270) {
                var25.method685(12288);
            }
        }
        if (!arg1) {
            return null;
        }
        if (var17) {
            var25.method687(this.field1508, this.field1501, arg0, arg12, arg8, arg3, arg4);
        }
        var25.method719(arg2);
        return var25;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
    public static void method647(int arg0) {
        field1490 = null;
        if (arg0 != -1092) {
            field1490 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ldh;B)V")
    public final void method648(class209 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                int var4 = -79 / ((5 - arg1) / 55);
                field1509++;
                return;
            }
            this.method643((byte) -76, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILrh;Lqa;III)Lc;")
    public final class121 method649(int arg0, int arg1, class172 arg2, class162 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 0) {
            method645(53);
        }
        field1513++;
        return this.method646(null, true, arg4, 0, 0, arg0, arg5, (byte) 5, 0, false, arg1, arg3, null, arg2);
    }
}
