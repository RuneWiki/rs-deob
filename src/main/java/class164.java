import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class164 extends class103 {

    @OriginalMember(owner = "client!a", name = "y", descriptor = "B")
    public byte field2861;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lma;")
    public static class105 field2859;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Lma;")
    public static class105 field2864;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lda;")
    public class275 field2858;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lda;")
    public class275 field2860;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lwg;Lma;Lma;Lma;Z)Z")
    public static final boolean method1133(class238 arg0, class105 arg1, class105 arg2, class105 arg3, boolean arg4) {
        class6.field92 = arg0;
        if (!arg4) {
            field2859 = null;
        }
        field2852++;
        class41.field703 = arg3;
        class19.field277 = arg2;
        class181.field3103 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method1134(byte arg0) {
        field2862++;
        if (class89.field1501 == 0 || class89.field1501 == 5) {
            return;
        }
        try {
            if ((++class155.field2701) > 2000) {
                if (class52.field866 != null) {
                    class52.field866.method1402(1);
                    class52.field866 = null;
                }
                if (class120.field2149 >= 1) {
                    class89.field1501 = 0;
                    class119.field2140 = -5;
                    return;
                }
                class120.field2149++;
                if (class80.field1312 == class37.field605) {
                    class80.field1312 = class224.field3779;
                } else {
                    class80.field1312 = class37.field605;
                }
                class89.field1501 = 1;
                class155.field2701 = 0;
            }
            if (class89.field1501 == 1) {
                class162.field2838 = class3.field24.method373(0, class80.field1312, class226.field3827);
                class89.field1501 = 2;
            }
            if (class89.field1501 == 2) {
                if (class162.field2838.field4623 == 2) {
                    throw new IOException();
                }
                if (class162.field2838.field4623 != 1) {
                    return;
                }
                class52.field866 = new class219((Socket) class162.field2838.field4625, class3.field24);
                class162.field2838 = null;
                long var1 = class46.field769 = class79.field1299.method1833(0);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class149.field2597.field1392 = 0;
                class149.field2597.method575((byte) 127, 14);
                class149.field2597.method575((byte) 126, var3);
                class52.field866.method1400(class149.field2597.field1381, 0, 5000, 2);
                if (class72.field1166 != null) {
                    class72.field1166.method880(120);
                }
                if (class120.field2160 != null) {
                    class120.field2160.method880(63);
                }
                int var4 = class52.field866.method1399(false);
                if (class72.field1166 != null) {
                    class72.field1166.method880(119);
                }
                if (class120.field2160 != null) {
                    class120.field2160.method880(29);
                }
                if (var4 != 0) {
                    class119.field2140 = var4;
                    class89.field1501 = 0;
                    class52.field866.method1402(1);
                    class52.field866 = null;
                    return;
                }
                class89.field1501 = 3;
            }
            if (class89.field1501 == 3) {
                if (class52.field866.method1404(-1048) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class52.field866.method1406(0, class196.field3351.field1381, 8, -125);
                class196.field3351.field1392 = 0;
                class227.field3845 = class196.field3351.method610(false);
                var5[3] = (int) class227.field3845;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class149.field2597.field1392 = 0;
                var5[2] = (int) (class227.field3845 >> 32);
                class149.field2597.method575((byte) 125, 10);
                class149.field2597.method586(-85, var5[0]);
                class149.field2597.method586(40, var5[1]);
                class149.field2597.method586(-92, var5[2]);
                class149.field2597.method586(111, var5[3]);
                class149.field2597.method560(class79.field1299.method1833(0), -126);
                class149.field2597.method584((byte) 100, class79.field1296);
                class149.field2597.method612(class106.field1836, 101, class185.field3168);
                class273.field4720.field1392 = 0;
                if (class200.field3427 == 40) {
                    class273.field4720.method575((byte) 124, 18);
                } else {
                    class273.field4720.method575((byte) 125, 16);
                }
                class273.field4720.method600(class149.field2597.field1392 + class75.method493(class199.field3394, -33) + 154, (byte) 36);
                class273.field4720.method586(97, 517);
                class273.field4720.method575((byte) 124, class273.field4726);
                class273.field4720.method575((byte) 127, class214.field3652 ? 1 : 0);
                class273.field4720.method575((byte) 127, 0);
                class273.field4720.method575((byte) 124, class56.method353(true));
                class273.field4720.method600(class249.field4391, (byte) 90);
                class273.field4720.method600(class212.field3587, (byte) 26);
                class3.method10(class273.field4720, 3);
                class273.field4720.method584((byte) 126, class199.field3394);
                class273.field4720.method586(119, class160.field2813);
                class273.field4720.method586(106, class70.method461((byte) 112));
                class45.field760 = true;
                class273.field4720.method600(class256.field4512, (byte) 54);
                class273.field4720.method586(19, class240.field4216.method772(1048575));
                class273.field4720.method586(-128, class185.field3175.method772(1048575));
                class273.field4720.method586(-122, class270.field4702.method772(1048575));
                class273.field4720.method586(44, class170.field2950.method772(1048575));
                class273.field4720.method586(63, class106.field1838.method772(1048575));
                class273.field4720.method586(-106, class188.field3251.method772(1048575));
                class273.field4720.method586(79, field2859.method772(1048575));
                class273.field4720.method586(-108, class105.field1800.method772(1048575));
                class273.field4720.method586(96, class229.field3994.method772(1048575));
                class273.field4720.method586(-121, class48.field813.method772(1048575));
                class273.field4720.method586(118, class30.field463.method772(1048575));
                class273.field4720.method586(-85, class213.field3621.method772(1048575));
                class273.field4720.method586(49, class147.field2574.method772(1048575));
                class273.field4720.method586(-116, class220.field3742.method772(1048575));
                class273.field4720.method586(-102, class26.field429.method772(1048575));
                class273.field4720.method586(92, class142.field2501.method772(1048575));
                class273.field4720.method586(80, class114.field2028.method772(1048575));
                class273.field4720.method586(-111, class29.field436.method772(1048575));
                class273.field4720.method586(-80, class224.field3778.method772(1048575));
                class273.field4720.method586(52, class212.field3589.method772(1048575));
                class273.field4720.method586(45, class110.field1943.method772(1048575));
                class273.field4720.method586(-86, class96.field1634.method772(1048575));
                class273.field4720.method586(103, class255.field4499.method772(1048575));
                class273.field4720.method586(107, class271.field4707.method772(1048575));
                class273.field4720.method586(27, class13.field207.method772(1048575));
                class273.field4720.method586(-95, class166.field2888.method772(1048575));
                class273.field4720.method586(118, field2864.method772(1048575));
                class273.field4720.method563(class149.field2597.field1392, (byte) 127, class149.field2597.field1381, 0);
                class52.field866.method1400(class273.field4720.field1381, 0, 5000, class273.field4720.field1392);
                class149.field2597.method521(-119, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class196.field3351.method521(-124, var5);
                class89.field1501 = 4;
            }
            if (class89.field1501 == 4) {
                if (class52.field866.method1404(-1048) < 1) {
                    return;
                }
                int var7 = class52.field866.method1399(false);
                if (var7 == 21) {
                    class89.field1501 = 7;
                } else if (var7 == 29) {
                    class89.field1501 = 10;
                } else if (var7 == 1) {
                    class119.field2140 = var7;
                    class89.field1501 = 5;
                    return;
                } else if (var7 == 2) {
                    class89.field1501 = 8;
                } else if (var7 == 15) {
                    class119.field2140 = var7;
                    class89.field1501 = 0;
                    return;
                } else if (var7 == 23 && class120.field2149 < 1) {
                    class120.field2149++;
                    class89.field1501 = 1;
                    class155.field2701 = 0;
                    class52.field866.method1402(1);
                    class52.field866 = null;
                    return;
                } else {
                    class119.field2140 = var7;
                    class89.field1501 = 0;
                    class52.field866.method1402(1);
                    class52.field866 = null;
                    return;
                }
            }
            if (class89.field1501 == 6) {
                class149.field2597.field1392 = 0;
                class149.field2597.method526((byte) -64, 17);
                class52.field866.method1400(class149.field2597.field1381, 0, 5000, class149.field2597.field1392);
                class89.field1501 = 4;
            } else if (arg0 >= 22) {
                if (class89.field1501 == 7) {
                    if (class52.field866.method1404(-1048) >= 1) {
                        class153.field2682 = class52.field866.method1399(false) * 60 + 180;
                        class119.field2140 = 21;
                        class89.field1501 = 0;
                        class52.field866.method1402(1);
                        class52.field866 = null;
                    }
                } else if (class89.field1501 != 10) {
                    if (class89.field1501 == 8) {
                        if (class52.field866.method1404(-1048) < 12) {
                            return;
                        }
                        class52.field866.method1406(0, class196.field3351.field1381, 12, -100);
                        class196.field3351.field1392 = 0;
                        class277.field4838 = class196.field3351.method564((byte) 111);
                        class155.field2694 = class196.field3351.method564((byte) 90);
                        class255.field4490 = class196.field3351.method564((byte) 90);
                        class131.field2343 = class196.field3351.method564((byte) 62);
                        class26.field426 = class196.field3351.method564((byte) 70) == 1;
                        class11.field167 = class196.field3351.method608(25);
                        class196.field3358 = class196.field3351.method564((byte) 103) == 1;
                        class167.field2911 = class196.field3351.method564((byte) 89) == 1;
                        class158.method1109(class167.field2911, 2301979);
                        class46.method274(class167.field2911, 70);
                        if (!class214.field3652) {
                            if (class255.field4490 == 1 || class196.field3358) {
                                try {
                                    class233.field4076.method1816((byte) 10, class3.field24.field970);
                                } catch (Throwable var9) {
                                }
                            } else {
                                try {
                                    class171.field2986.method1816((byte) 10, class3.field24.field970);
                                } catch (Throwable var8) {
                                }
                            }
                        }
                        class268.field4650 = class196.field3351.method517((byte) -78);
                        class59.field1000 = class196.field3351.method608(57);
                        class89.field1501 = 9;
                    }
                    if (class89.field1501 == 9 && class52.field866.method1404(-1048) >= class59.field1000) {
                        class196.field3351.field1392 = 0;
                        class52.field866.method1406(0, class196.field3351.field1381, class59.field1000, -106);
                        class89.field1501 = 0;
                        class119.field2140 = 2;
                        class29.method169(-71);
                        class54.field921 = -1;
                        class228.method1472((byte) 125, false);
                        class268.field4650 = -1;
                    }
                } else if (class52.field866.method1404(-1048) >= 1) {
                    class36.field599 = class52.field866.method1399(false);
                    class119.field2140 = 29;
                    class89.field1501 = 0;
                    class52.field866.method1402(1);
                    class52.field866 = null;
                }
            }
        } catch (IOException var10) {
            if (class52.field866 != null) {
                class52.field866.method1402(1);
                class52.field866 = null;
            }
            if (class120.field2149 >= 1) {
                class89.field1501 = 0;
                class119.field2140 = -4;
            } else {
                class89.field1501 = 1;
                class155.field2701 = 0;
                class120.field2149++;
                if (class80.field1312 == class37.field605) {
                    class80.field1312 = class224.field3779;
                } else {
                    class80.field1312 = class37.field605;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBIII)V")
    public static final void method1135(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2856++;
        class248 var5 = (class248) class118.field2125.method1871(0, (long) arg2);
        if (var5 == null) {
            var5 = new class248();
            class118.field2125.method1867(true, (long) arg2, var5);
        }
        if (var5.field4372.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field4372.length; var8++) {
                var6[var8] = var5.field4372[var8];
                var7[var8] = var5.field4365[var8];
            }
            for (int var9 = var5.field4372.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4372 = var6;
            var5.field4365 = var7;
        }
        var5.field4372[arg4] = arg3;
        if (arg1 >= -52) {
            method1136((class105) null, -36);
        }
        var5.field4365[arg4] = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lma;I)V")
    public static final void method1136(class105 arg0, int arg1) {
        field2854++;
        if (class219.field3734) {
            return;
        }
        class47.method287();
        class218.field3701 = class145.method1037(arg0, arg1 ^ 0xFFFFAA9B, class5.field64);
        int var2 = class212.field3587;
        int var3 = var2 * 956 / 503;
        class218.field3701.method1205((class249.field4391 - var3) / 2, arg1, var3, var2);
        class124.field2217 = class276.method1860(arg1 ^ 0xFFFF8870, class262.field4550, arg0);
        class124.field2217.method62(class249.field4391 / 2 - (class124.field2217.field210 / 2), 18);
        class219.field3734 = true;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static final void method1137(byte arg0) {
        class225.field3823.method993(110);
        if (arg0 > -74) {
            field2864 = null;
        }
        field2857++;
        class268.field4648.method993(106);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public static void method1138(int arg0) {
        field2864 = null;
        field2859 = null;
        if (arg0 != 27686) {
            field2864 = null;
        }
    }
}
