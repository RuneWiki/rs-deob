import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class143 extends class444 {

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lpi;")
    public static class340 field1887 = new class340(60, -2);

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Loi;")
    public static class169 field1891 = new class169("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "[I")
    public static int[] field1892 = new int[2048];

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "[B")
    private byte[] field1886;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILqa;II)V")
    public static final void method994(int arg0, class129 arg1, int arg2, int arg3) {
        field1890++;
        if (arg0 != 0) {
            method998((byte) 90);
        }
        class521.field7736 = new class17[arg3][arg2];
        class91.field1263 = arg1;
        if (class314.field4047 != null) {
            class200.field2584 = class261.method1633(class314.field4047[2], class314.field4047[0], class314.field4047[4], class314.field4047[3], class314.field4047[5], class314.field4047[1], arg0);
        }
        class380.field4952 = new class17();
        class511.method3050((byte) -30);
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static final void method995(int arg0) {
        field1889++;
        if (class35.field542 == arg0 || class35.field542 == 5) {
            return;
        }
        try {
            if ((++class297.field3857) > 2000) {
                if (class286.field3643 != null) {
                    class286.field3643.method1003(1);
                    class286.field3643 = null;
                }
                if (class302.field3918 >= 1) {
                    class35.field542 = 0;
                    class169.field2211 = -5;
                    return;
                }
                class302.field3918++;
                class297.field3857 = 0;
                if (class531.field7821 == class116.field1631) {
                    class116.field1631 = class385.field5067;
                } else {
                    class116.field1631 = class531.field7821;
                }
                class35.field542 = 1;
            }
            if (class35.field542 == 1) {
                class265.field3367 = class172.field2221.method2622(class385.field5066, class116.field1631, -1727);
                class35.field542 = 2;
            }
            if (class35.field542 == 2) {
                if (class265.field3367.field3542 == 2) {
                    throw new IOException();
                }
                if (class265.field3367.field3542 != 1) {
                    return;
                }
                class286.field3643 = new class144((Socket) class265.field3367.field3541, class172.field2221);
                class265.field3367 = null;
                long var1 = class192.field2491 = class216.method1386(arg0 ^ 0xFFFF8745, class99.field1388);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class319.field4112.field1176 = 0;
                class319.field4112.method565(-68, class275.field3510.field195);
                class319.field4112.method565(arg0 ^ 0xFFFFFF93, var3);
                class286.field3643.method1001(0, (byte) -126, class319.field4112.field1223, 2);
                class114.method741((byte) -124);
                int var4 = class286.field3643.method1000((byte) 29);
                class114.method741((byte) -119);
                if (var4 != 0) {
                    class169.field2211 = var4;
                    class35.field542 = 0;
                    class286.field3643.method1003(1);
                    class286.field3643 = null;
                    return;
                }
                class35.field542 = 3;
            }
            if (class35.field542 == 3) {
                if (class286.field3643.method1004(arg0 ^ 0x3) < 8) {
                    return;
                }
                class286.field3643.method1006(class109.field1514.field1223, 8, -27, 0);
                class109.field1514.field1176 = 0;
                class463.field6647 = class109.field1514.method611(false);
                class88 var5 = new class88(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class463.field6647 >> 32), (int) class463.field6647 };
                var5.method565(126, 10);
                var5.method572(-121, var6[0]);
                var5.method572(-115, var6[1]);
                var5.method572(-104, var6[2]);
                var5.method572(arg0 - 107, var6[3]);
                var5.method554(class216.method1386(-30907, class99.field1388), -290082784);
                var5.method597(-127, class422.field5655);
                var5.method600(class518.field7667, class411.field5489, 0);
                class319.field4112.field1176 = 0;
                if (class65.field821 == 40) {
                    class319.field4112.method565(66, class275.field3517.field195);
                } else {
                    class319.field4112.method565(-95, class275.field3515.field195);
                }
                class319.field4112.method609(0, -65);
                int var7 = class319.field4112.field1176;
                class319.field4112.method572(arg0 ^ 0xFFFFFF93, 583);
                class319.field4112.method565(arg0 + 123, class166.field2156);
                class319.field4112.method565(-87, class144.method1008((byte) 109));
                class319.field4112.method609(class23.field419, -121);
                class319.field4112.method609(class92.field1281, -128);
                class319.field4112.method565(-112, class421.field5647.field7728);
                class115.method748((byte) -1, class319.field4112);
                class319.field4112.method597(arg0 - 127, class297.field3851);
                class319.field4112.method572(-119, class326.field4189);
                class88 var8 = class421.field5647.method650(true);
                class319.field4112.method565(-117, var8.field1176);
                class319.field4112.method590(var8.field1176, -1, var8.field1223, 0);
                class461.field6449 = true;
                class319.field4112.method609(class504.field7414, -118);
                class319.field4112.method572(-123, class65.field823.method1312(56));
                class319.field4112.method572(-104, class120.field1676.method1312(-98));
                class319.field4112.method572(-118, class523.field7751.method1312(-122));
                class319.field4112.method572(-117, class257.field3251.method1312(arg0 ^ -97));
                class319.field4112.method572(arg0 ^ 0xFFFFFF83, class135.field1829.method1312(-94));
                class319.field4112.method572(-126, class354.field4551.method1312(92));
                class319.field4112.method572(-115, class288.field3685.method1312(arg0 ^ 0x7D));
                class319.field4112.method572(arg0 - 118, class83.field1031.method1312(-120));
                class319.field4112.method572(-118, class391.field5121.method1312(-109));
                class319.field4112.method572(-104, class271.field3430.method1312(-122));
                class319.field4112.method572(-124, class29.field499.method1312(106));
                class319.field4112.method572(-117, class6.field53.method1312(-108));
                class319.field4112.method572(-106, class491.field7174.method1312(-104));
                class319.field4112.method572(-127, class256.field3245.method1312(arg0 - 105));
                class319.field4112.method572(-117, class351.field4485.method1312(arg0 + 110));
                class319.field4112.method572(-111, class235.field3059.method1312(74));
                class319.field4112.method572(arg0 ^ 0xFFFFFF91, class270.field3423.method1312(-94));
                class319.field4112.method572(-113, class138.field1848.method1312(arg0 ^ -107));
                class319.field4112.method572(-108, class197.field2545.method1312(-104));
                class319.field4112.method572(-103, class114.field1565.method1312(59));
                class319.field4112.method572(-111, class511.field7533.method1312(-112));
                class319.field4112.method572(arg0 ^ 0xFFFFFF86, class11.field179.method1312(71));
                class319.field4112.method572(-118, class9.field93.method1312(22));
                class319.field4112.method572(-126, class236.field3075.method1312(91));
                class319.field4112.method572(-128, class522.field7745.method1312(-128));
                class319.field4112.method572(-112, class221.field2851.method1312(-93));
                class319.field4112.method572(-120, class352.field4500.method1312(21));
                class319.field4112.method572(arg0 ^ 0xFFFFFF8F, class7.field59.method1312(44));
                class319.field4112.method572(-111, class494.field7224.method1312(arg0 - 94));
                class319.field4112.method572(arg0 - 110, class168.field2189.method1312(108));
                class319.field4112.method590(var5.field1176, -1, var5.field1223, 0);
                class319.field4112.method582(1973063568, class319.field4112.field1176 - var7);
                class286.field3643.method1001(0, (byte) -107, class319.field4112.field1223, class319.field4112.field1176);
                class319.field4112.method105(false, var6);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class109.field1514.method105(false, var6);
                class35.field542 = 4;
            }
            if (class35.field542 == 4) {
                if (class286.field3643.method1004(3) < 1) {
                    return;
                }
                int var10 = class286.field3643.method1000((byte) 29);
                if (var10 == 21) {
                    class35.field542 = 7;
                } else if (var10 == 29) {
                    class35.field542 = 11;
                } else if (var10 == 1) {
                    class169.field2211 = var10;
                    class35.field542 = 5;
                    return;
                } else if (var10 == 2) {
                    class35.field542 = 8;
                } else if (var10 == 15) {
                    class37.field574 = -2;
                    class35.field542 = 12;
                } else if (var10 == 23 && class302.field3918 < 1) {
                    class35.field542 = 1;
                    class302.field3918++;
                    class297.field3857 = 0;
                    class286.field3643.method1003(1);
                    class286.field3643 = null;
                    return;
                } else {
                    class35.field542 = 0;
                    class169.field2211 = var10;
                    class286.field3643.method1003(arg0 + 1);
                    class286.field3643 = null;
                    return;
                }
            }
            if (class35.field542 == 6) {
                class319.field4112.field1176 = 0;
                class319.field4112.method101(false, class275.field3516.field195);
                class286.field3643.method1001(0, (byte) 35, class319.field4112.field1223, class319.field4112.field1176);
                class35.field542 = 4;
            } else if (class35.field542 == 7) {
                if (class286.field3643.method1004(arg0 ^ 0x3) >= 1) {
                    class60.field787 = (class286.field3643.method1000((byte) 29) + 3) * 60;
                    class169.field2211 = 21;
                    class35.field542 = 0;
                    class286.field3643.method1003(arg0 ^ 0x1);
                    class286.field3643 = null;
                }
            } else if (class35.field542 != 11) {
                if (class35.field542 == 8) {
                    if (class286.field3643.method1004(arg0 + 3) < 13) {
                        return;
                    }
                    class286.field3643.method1006(class109.field1514.field1223, 13, 118, 0);
                    class109.field1514.field1176 = 0;
                    class363.field4685 = class109.field1514.method617(2);
                    class235.field3067 = class109.field1514.method617(2);
                    class437.field5998 = class109.field1514.method617(2) == 1;
                    class306.field3943 = class109.field1514.method617(2) == 1;
                    class327.field4209 = class109.field1514.method617(arg0 + 2) == 1;
                    class428.field5874 = class109.field1514.method617(2) == 1;
                    class166.field2149 = class109.field1514.method568((byte) 110);
                    class28.field478 = class109.field1514.method617(2) == 1;
                    class459.field6421 = class109.field1514.method617(arg0 ^ 0x2) == 1;
                    class52.field715.method1158(true, class459.field6421);
                    class89.field1238.method114((byte) -60, class459.field6421);
                    class192.field2495.method1871(class459.field6421, arg0 ^ 0x40);
                    if ((!class437.field5998 || class327.field4209) && !class28.field478) {
                        try {
                            class425.method2515(class172.field2221.field6139, "unzap", -27401);
                        } catch (Throwable var15) {
                        }
                    } else {
                        try {
                            class425.method2515(class172.field2221.field6139, "zap", -27401);
                        } catch (Throwable var16) {
                            if (class470.field6878) {
                                try {
                                    class172.field2221.field6139.getAppletContext().showDocument(new URL(class172.field2221.field6139.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var14) {
                                }
                            }
                        }
                    }
                    if (class246.field3151 == class222.field2867) {
                        try {
                            class425.method2515(class172.field2221.field6139, "loggedin", -27401);
                        } catch (Throwable var13) {
                        }
                    }
                    class35.field542 = 10;
                }
                if (class35.field542 == 10) {
                    if (class109.field1514.method107(-89)) {
                        if (class286.field3643.method1004(3) < 1) {
                            return;
                        }
                        class286.field3643.method1006(class109.field1514.field1223, 1, -44, class109.field1514.field1176 + 2);
                    }
                    class353.field4526 = class189.method1246(116)[class109.field1514.method104((byte) 101)];
                    class37.field574 = class109.field1514.method568((byte) 110);
                    class35.field542 = 9;
                }
                if (class35.field542 == 9) {
                    if (class286.field3643.method1004(3) >= class37.field574) {
                        class286.field3643.method1006(class109.field1514.field1223, class37.field574, 112, 0);
                        class109.field1514.field1176 = 0;
                        class169.field2211 = 2;
                        class35.field542 = 0;
                        int var11 = class37.field574;
                        class202.method1324(arg0);
                        class141.method973(true, class109.field1514);
                        class53.field719 = -1;
                        class28.method192(-10902);
                        if (class109.field1514.field1176 != var11) {
                            throw new RuntimeException("lswp pos:" + class109.field1514.field1176 + " psize:" + var11);
                        }
                        class353.field4526 = null;
                    }
                } else if (class35.field542 == 12) {
                    if (class37.field574 == -2) {
                        if (class286.field3643.method1004(3) < 2) {
                            return;
                        }
                        class286.field3643.method1006(class109.field1514.field1223, 2, -83, 0);
                        class109.field1514.field1176 = 0;
                        class37.field574 = class109.field1514.method568((byte) 110);
                    }
                    if (class286.field3643.method1004(arg0 ^ 0x3) >= class37.field574) {
                        class286.field3643.method1006(class109.field1514.field1223, class37.field574, -120, 0);
                        class109.field1514.field1176 = 0;
                        class35.field542 = 0;
                        class169.field2211 = 15;
                        int var12 = class37.field574;
                        class31.method212(false);
                        class141.method973(true, class109.field1514);
                        if (class109.field1514.field1176 != var12) {
                            throw new RuntimeException("lswpr pos:" + class109.field1514.field1176 + " psize:" + var12);
                        }
                        class353.field4526 = null;
                    }
                }
            } else if (class286.field3643.method1004(3) >= 1) {
                class112.field1544 = class286.field3643.method1000((byte) 29);
                class169.field2211 = 29;
                class35.field542 = 0;
                class286.field3643.method1003(1);
                class286.field3643 = null;
            }
        } catch (IOException var17) {
            if (class286.field3643 != null) {
                class286.field3643.method1003(1);
                class286.field3643 = null;
            }
            if (class302.field3918 < 1) {
                if (class531.field7821 == class116.field1631) {
                    class116.field1631 = class385.field5067;
                } else {
                    class116.field1631 = class531.field7821;
                }
                class302.field3918++;
                class297.field3857 = 0;
                class35.field542 = 1;
            } else {
                class169.field2211 = -4;
                class35.field542 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class143() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)[B")
    public final byte[] method996(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -2122510324) {
            method995(113);
        }
        field1888++;
        this.field1886 = new byte[arg0 * arg1 * arg3 * 2];
        this.method1926(false, arg0, arg1, arg3);
        return this.field1886;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)V")
    public final void method997(byte arg0, int arg1, int arg2) {
        field1884++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field1886[var10001] = (byte) (var5 * 3 >> 5);
        if (arg2 <= 99) {
            this.field1886 = null;
        }
        this.field1886[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public static void method998(byte arg0) {
        if (arg0 < -24) {
            field1891 = null;
            field1887 = null;
            field1892 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)I")
    public static final int method999(int arg0, int arg1, int arg2) {
        field1885++;
        int var3 = arg1 * 57 + arg0;
        if (arg2 != -5) {
            method998((byte) -28);
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }
}
