import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class486 {

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Z")
    public static boolean field6856 = false;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field6857 = 0;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "Ljava/lang/String;")
    public String field6854;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static final void method2856(int arg0) {
        field6853++;
        class39.field666 = new class363[class255.field3576.method2027(29)][];
        if (arg0 == -14255) {
            class460.field6482 = new boolean[class255.field3576.method2027(arg0 ^ 0xFFFFC820)];
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static final void method2857(byte arg0) {
        field6858++;
        if (class228.field3230 == 0 || class228.field3230 == 5) {
            return;
        }
        try {
            if (++class299.field4114 > 2000) {
                if (class237.field3339 != null) {
                    class237.field3339.method2632(32214);
                    class237.field3339 = null;
                }
                if (class184.field2669 >= 1) {
                    class228.field3230 = 0;
                    class353.field4917 = -5;
                    return;
                }
                class184.field2669++;
                if (class381.field5400 == class363.field5157) {
                    class363.field5157 = class230.field3247;
                } else {
                    class363.field5157 = class381.field5400;
                }
                class228.field3230 = 1;
                class299.field4114 = 0;
            }
            if (class228.field3230 == 1) {
                class15.field247 = class343.field4703.method125((byte) 37, class267.field3718, class363.field5157);
                class228.field3230 = 2;
            }
            if (class228.field3230 == 2) {
                if (class15.field247.field5789 == 2) {
                    throw new IOException();
                }
                if (class15.field247.field5789 != 1) {
                    return;
                }
                class237.field3339 = new class456((Socket) class15.field247.field5791, class343.field4703);
                class15.field247 = null;
                long var1 = class79.field1203 = class54.method421(class383.field5440, -16583);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class366.field5214.field5830 = 0;
                class366.field5214.method2470((byte) -74, class430.field5930.field6474);
                class366.field5214.method2470((byte) -74, var3);
                class237.field3339.method2635(0, 2, class366.field5214.field5886, -15109);
                if (class36.field622 != null) {
                    class36.field622.method1035((byte) -59);
                }
                if (class2.field22 != null) {
                    class2.field22.method1035((byte) -80);
                }
                int var4 = class237.field3339.method2630((byte) 78);
                if (class36.field622 != null) {
                    class36.field622.method1035((byte) -103);
                }
                if (class2.field22 != null) {
                    class2.field22.method1035((byte) -74);
                }
                if (var4 != 0) {
                    class353.field4917 = var4;
                    class228.field3230 = 0;
                    class237.field3339.method2632(32214);
                    class237.field3339 = null;
                    return;
                }
                class228.field3230 = 3;
            }
            if (class228.field3230 == 3) {
                if (class237.field3339.method2634(-57) < 8) {
                    return;
                }
                class237.field3339.method2638(class388.field5458.field5886, 8, 0, 421464188);
                class388.field5458.field5830 = 0;
                class59.field926 = class388.field5458.method2494(-19827);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class59.field926 >> 32), (int) class59.field926 };
                class366.field5214.field5830 = 0;
                class366.field5214.method2470((byte) -74, 10);
                class366.field5214.method2481(var5[0], true);
                class366.field5214.method2481(var5[1], true);
                class366.field5214.method2481(var5[2], true);
                class366.field5214.method2481(var5[3], true);
                class366.field5214.method2471(26505, class54.method421(class383.field5440, -16583));
                class366.field5214.method2493((byte) -121, class181.field2623);
                class366.field5214.method2496(0, client.field5496, class417.field5742);
                class117.field1639.field5830 = 0;
                if (class478.field6764 == 40) {
                    class117.field1639.method2470((byte) -74, class430.field5934.field6474);
                } else {
                    class117.field1639.method2470((byte) -74, class430.field5932.field6474);
                }
                class117.field1639.method2462(class366.field5214.field5830 + class42.method349(class172.field2556, 1) + 161, (byte) -123);
                class117.field1639.method2481(572, true);
                class117.field1639.method2470((byte) -74, class323.field4438);
                class117.field1639.method2470((byte) -74, class18.method156((byte) 44));
                class117.field1639.method2462(class67.field987, (byte) -123);
                class117.field1639.method2462(class371.field5248, (byte) -123);
                class117.field1639.method2470((byte) -74, class211.field2977);
                class323.method1947(class117.field1639, 1024);
                class117.field1639.method2493((byte) -120, class172.field2556);
                class117.field1639.method2481(class303.field4156, true);
                class117.field1639.method2481(class464.method2738(-109), true);
                class443.field6118 = true;
                class117.field1639.method2462(class421.field5795, (byte) -123);
                class117.field1639.method2481(class204.field2930.method2040(true), true);
                class117.field1639.method2481(class440.field6035.method2040(true), true);
                class117.field1639.method2481(class63.field969.method2040(true), true);
                class117.field1639.method2481(class346.field4729.method2040(true), true);
                class117.field1639.method2481(class464.field6523.method2040(true), true);
                class117.field1639.method2481(class336.field4611.method2040(true), true);
                class117.field1639.method2481(class101.field1440.method2040(true), true);
                class117.field1639.method2481(class160.field2302.method2040(true), true);
                class117.field1639.method2481(class120.field1685.method2040(true), true);
                class117.field1639.method2481(class341.field4651.method2040(true), true);
                class117.field1639.method2481(class85.field1283.method2040(true), true);
                class117.field1639.method2481(class172.field2548.method2040(true), true);
                class117.field1639.method2481(class451.field6193.method2040(true), true);
                class117.field1639.method2481(class441.field6048.method2040(true), true);
                class117.field1639.method2481(class182.field2641.method2040(true), true);
                class117.field1639.method2481(class432.field5954.method2040(true), true);
                class117.field1639.method2481(class454.field6275.method2040(true), true);
                class117.field1639.method2481(class475.field6725.method2040(true), true);
                class117.field1639.method2481(class357.field4988.method2040(true), true);
                class117.field1639.method2481(class47.field763.method2040(true), true);
                class117.field1639.method2481(class460.field6480.method2040(true), true);
                class117.field1639.method2481(class254.field3551.method2040(true), true);
                class117.field1639.method2481(class330.field4544.method2040(true), true);
                class117.field1639.method2481(class183.field2667.method2040(true), true);
                class117.field1639.method2481(class228.field3227.method2040(true), true);
                class117.field1639.method2481(class370.field5237.method2040(true), true);
                class117.field1639.method2481(class440.field6040.method2040(true), true);
                class117.field1639.method2481(class106.field1530.method2040(true), true);
                class117.field1639.method2481(class126.field1721.method2040(true), true);
                class117.field1639.method2454(false, class366.field5214.field5830, class366.field5214.field5886, 0);
                class237.field3339.method2635(0, class117.field1639.field5830, class117.field1639.field5886, -15109);
                class366.field5214.method805(55, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class388.field5458.method805(126, var5);
                class228.field3230 = 4;
            }
            if (class228.field3230 == 4) {
                if (class237.field3339.method2634(-48) < 1) {
                    return;
                }
                int var7 = class237.field3339.method2630((byte) 79);
                if (var7 == 21) {
                    class228.field3230 = 7;
                } else if (var7 == 29) {
                    class228.field3230 = 11;
                } else if (var7 == 1) {
                    class228.field3230 = 5;
                    class353.field4917 = var7;
                    return;
                } else if (var7 == 2) {
                    class228.field3230 = 8;
                } else if (var7 == 15) {
                    class228.field3230 = 12;
                    class7.field136 = -2;
                } else if (var7 == 23 && class184.field2669 < 1) {
                    class184.field2669++;
                    class299.field4114 = 0;
                    class228.field3230 = 1;
                    class237.field3339.method2632(32214);
                    class237.field3339 = null;
                    return;
                } else {
                    class353.field4917 = var7;
                    class228.field3230 = 0;
                    class237.field3339.method2632(32214);
                    class237.field3339 = null;
                    return;
                }
            }
            if (class228.field3230 == 6) {
                class366.field5214.field5830 = 0;
                class366.field5214.method797(class430.field5933.field6474, (byte) 88);
                class237.field3339.method2635(0, class366.field5214.field5830, class366.field5214.field5886, -15109);
                class228.field3230 = 4;
            } else if (class228.field3230 == 7) {
                if (class237.field3339.method2634(-56) >= 1) {
                    class48.field783 = (class237.field3339.method2630((byte) 117) + 3) * 60;
                    class353.field4917 = 21;
                    class228.field3230 = 0;
                    class237.field3339.method2632(32214);
                    class237.field3339 = null;
                }
            } else if (class228.field3230 != 11) {
                if (class228.field3230 == 8) {
                    if (class237.field3339.method2634(-105) < 13) {
                        return;
                    }
                    class237.field3339.method2638(class388.field5458.field5886, 13, 0, 421464188);
                    class388.field5458.field5830 = 0;
                    class159.field2292 = class388.field5458.method2503(true);
                    class285.field3902 = class388.field5458.method2503(true);
                    class205.field2942 = class388.field5458.method2503(true) == 1;
                    class78.field1185 = class388.field5458.method2503(true) == 1;
                    class349.field4767 = class388.field5458.method2503(true) == 1;
                    class42.field719 = class388.field5458.method2503(true) == 1;
                    class327.field4523 = class388.field5458.method2508(true);
                    class9.field185 = class388.field5458.method2503(true) == 1;
                    class319.field4371 = class388.field5458.method2503(true) == 1;
                    class304.field4160.method2072(-124, class319.field4371);
                    class58.field918.method336(95, class319.field4371);
                    class467.field6550.method1356(class319.field4371, 16);
                    if ((!class205.field2942 || class349.field4767) && !class9.field185) {
                        try {
                            class207.method1299(class343.field4703.field234, 19639, "unzap");
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class207.method1299(class343.field4703.field234, 19639, "zap");
                        } catch (Throwable var14) {
                            if (class289.field3974) {
                                try {
                                    class343.field4703.field234.getAppletContext().showDocument(new URL(class343.field4703.field234.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var13) {
                                }
                            }
                        }
                    }
                    if (class96.field1373 == class396.field5558) {
                        try {
                            class207.method1299(class343.field4703.field234, 19639, "loggedin");
                        } catch (Throwable var11) {
                        }
                    }
                    class228.field3230 = 10;
                }
                if (class228.field3230 == 10) {
                    if (class388.field5458.method808((byte) -110)) {
                        if (class237.field3339.method2634(-79) < 1) {
                            return;
                        }
                        class237.field3339.method2638(class388.field5458.field5886, 1, class388.field5458.field5830 + 2, 421464188);
                    }
                    class255.field3570 = class400.method2371(7126)[class388.field5458.method804((byte) -125)];
                    class7.field136 = class388.field5458.method2508(true);
                    class228.field3230 = 9;
                }
                if (class228.field3230 == 9) {
                    if (class237.field3339.method2634(-115) >= class7.field136) {
                        class237.field3339.method2638(class388.field5458.field5886, class7.field136, 0, 421464188);
                        class388.field5458.field5830 = 0;
                        class353.field4917 = 2;
                        class228.field3230 = 0;
                        int var8 = class7.field136;
                        class172.method1157((byte) 120);
                        class234.method1475(64, class388.field5458);
                        class182.field2643 = -1;
                        class33.method253((byte) 64, false);
                        if (class388.field5458.field5830 != var8) {
                            throw new RuntimeException("lswp pos:" + class388.field5458.field5830 + " psize:" + var8);
                        }
                        class255.field3570 = null;
                    }
                } else if (class228.field3230 == 12) {
                    if (class7.field136 == -2) {
                        if (class237.field3339.method2634(-98) < 2) {
                            return;
                        }
                        class237.field3339.method2638(class388.field5458.field5886, 2, 0, 421464188);
                        class388.field5458.field5830 = 0;
                        class7.field136 = class388.field5458.method2508(true);
                    }
                    if (class237.field3339.method2634(-60) >= class7.field136) {
                        class237.field3339.method2638(class388.field5458.field5886, class7.field136, 0, 421464188);
                        class388.field5458.field5830 = 0;
                        int var9 = class7.field136;
                        class228.field3230 = 0;
                        class353.field4917 = 15;
                        class71.method496((byte) -46);
                        class234.method1475(64, class388.field5458);
                        if (class388.field5458.field5830 != var9) {
                            throw new RuntimeException("lswpr pos:" + class388.field5458.field5830 + " psize:" + var9);
                        }
                        class255.field3570 = null;
                    }
                } else {
                    int var10 = -66 % ((17 - arg0) / 35);
                }
            } else if (class237.field3339.method2634(-122) >= 1) {
                class180.field2612 = class237.field3339.method2630((byte) 73);
                class353.field4917 = 29;
                class228.field3230 = 0;
                class237.field3339.method2632(32214);
                class237.field3339 = null;
            }
        } catch (IOException var15) {
            if (class237.field3339 != null) {
                class237.field3339.method2632(32214);
                class237.field3339 = null;
            }
            if (class184.field2669 >= 1) {
                class353.field4917 = -4;
                class228.field3230 = 0;
            } else {
                class184.field2669++;
                class228.field3230 = 1;
                if (class381.field5400 == class363.field5157) {
                    class363.field5157 = class230.field3247;
                } else {
                    class363.field5157 = class381.field5400;
                }
                class299.field4114 = 0;
            }
        }
    }
}
