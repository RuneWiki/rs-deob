import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class138 extends Canvas {

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field2350;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lcf;")
    public static class149 field2346 = class170.method1210(3933);

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[S")
    public static short[] field2353 = new short[] { 38, 34, 45, 17, 57, 14, 43, 30 };

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[Lbn;")
    public static class75[] field2351;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class316.method2275(112, arg0);
        field2349++;
        int var7 = arg6;
        int var8 = arg0 - arg4;
        int var9 = arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -arg0;
        int var11 = -var8;
        if (arg3 >= class87.field1520 && class177.field2930 >= arg3) {
            int[] var12 = class232.field3799[arg3];
            int var13 = class114.method842(class190.field3224, (byte) -58, arg2 - arg0, class289.field4704);
            int var14 = class114.method842(class190.field3224, (byte) -36, arg0 + arg2, class289.field4704);
            int var15 = class114.method842(class190.field3224, (byte) -100, arg2 - var8, class289.field4704);
            int var16 = class114.method842(class190.field3224, (byte) -100, arg2 + var8, class289.field4704);
            class344.method2417(var12, var13, var15, arg5, (byte) -122);
            class344.method2417(var12, var15, var16, arg1, (byte) -121);
            class344.method2417(var12, var16, var14, arg5, (byte) -121);
        }
        int var17 = -1;
        int var18 = var8;
        int var19 = -1;
        while (var9 > var7) {
            var19 += 2;
            var17 += 2;
            var11 += var17;
            if (var11 >= 0 && var18 >= 1) {
                var18--;
                var11 -= var18 << 1;
                class182.field3159[var18] = var7;
            }
            var7++;
            var10 += var19;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg3 - var9;
                int var21 = arg3 + var9;
                if (var21 >= class87.field1520 && var20 <= class177.field2930) {
                    if (var9 >= var8) {
                        int var22 = class114.method842(class190.field3224, (byte) -125, arg2 + var7, class289.field4704);
                        int var23 = class114.method842(class190.field3224, (byte) -116, arg2 - var7, class289.field4704);
                        if (class177.field2930 >= var21) {
                            class344.method2417(class232.field3799[var21], var23, var22, arg5, (byte) -121);
                        }
                        if (var20 >= class87.field1520) {
                            class344.method2417(class232.field3799[var20], var23, var22, arg5, (byte) -127);
                        }
                    } else {
                        int var24 = class182.field3159[var9];
                        int var25 = class114.method842(class190.field3224, (byte) -55, arg2 + var7, class289.field4704);
                        int var26 = class114.method842(class190.field3224, (byte) -105, arg2 - var7, class289.field4704);
                        int var27 = class114.method842(class190.field3224, (byte) -66, arg2 + var24, class289.field4704);
                        int var28 = class114.method842(class190.field3224, (byte) -78, arg2 - var24, class289.field4704);
                        if (class177.field2930 >= var21) {
                            int[] var29 = class232.field3799[var21];
                            class344.method2417(var29, var26, var28, arg5, (byte) -122);
                            class344.method2417(var29, var28, var27, arg1, (byte) -121);
                            class344.method2417(var29, var27, var25, arg5, (byte) -127);
                        }
                        if (var20 >= class87.field1520) {
                            int[] var30 = class232.field3799[var20];
                            class344.method2417(var30, var26, var28, arg5, (byte) -127);
                            class344.method2417(var30, var28, var27, arg1, (byte) -127);
                            class344.method2417(var30, var27, var25, arg5, (byte) -121);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (class87.field1520 <= var32 && var31 <= class177.field2930) {
                int var33 = arg2 - var9;
                int var34 = arg2 + var9;
                if (var34 >= class190.field3224 && var33 <= class289.field4704) {
                    int var35 = class114.method842(class190.field3224, (byte) -31, var34, class289.field4704);
                    int var36 = class114.method842(class190.field3224, (byte) -50, var33, class289.field4704);
                    if (var8 <= var7) {
                        if (var32 <= class177.field2930) {
                            class344.method2417(class232.field3799[var32], var36, var35, arg5, (byte) -125);
                        }
                        if (class87.field1520 <= var31) {
                            class344.method2417(class232.field3799[var31], var36, var35, arg5, (byte) -122);
                        }
                    } else {
                        int var37 = var18 >= var7 ? var18 : class182.field3159[var7];
                        int var38 = class114.method842(class190.field3224, (byte) -106, arg2 + var37, class289.field4704);
                        int var39 = class114.method842(class190.field3224, (byte) -99, arg2 - var37, class289.field4704);
                        if (class177.field2930 >= var32) {
                            int[] var40 = class232.field3799[var32];
                            class344.method2417(var40, var36, var39, arg5, (byte) -125);
                            class344.method2417(var40, var39, var38, arg1, (byte) -128);
                            class344.method2417(var40, var38, var35, arg5, (byte) -120);
                        }
                        if (class87.field1520 <= var31) {
                            int[] var41 = class232.field3799[var31];
                            class344.method2417(var41, var36, var39, arg5, (byte) -124);
                            class344.method2417(var41, var39, var38, arg1, (byte) -120);
                            class344.method2417(var41, var38, var35, arg5, (byte) -119);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 194)
    public final void update(Graphics arg0) {
        field2348++;
        this.field2350.update(arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 203)
    public static final void method959(byte arg0) {
        field2354++;
        if (class6.field124 == 0 || class6.field124 == 5) {
            return;
        }
        int var1 = 91 / ((arg0 - 65) / 42);
        try {
            if ((++class110.field2013) > 2000) {
                if (class127.field2224 != null) {
                    class127.field2224.method1646((byte) 122);
                    class127.field2224 = null;
                }
                if (class212.field3516 >= 1) {
                    class6.field124 = 0;
                    class11.field363 = -5;
                    return;
                }
                class6.field124 = 1;
                class212.field3516++;
                class110.field2013 = 0;
                if (class65.field1239 == class177.field2934) {
                    class177.field2934 = class160.field2714;
                } else {
                    class177.field2934 = class65.field1239;
                }
            }
            if (class6.field124 == 1) {
                class41.field877 = class59.field1164.method1120(class177.field2934, class199.field3348, -31246);
                class6.field124 = 2;
            }
            if (class6.field124 == 2) {
                if (class41.field877.field3504 == 2) {
                    throw new IOException();
                }
                if (class41.field877.field3504 != 1) {
                    return;
                }
                class127.field2224 = new class237((Socket) class41.field877.field3501, class59.field1164);
                class41.field877 = null;
                long var2 = class334.field5325 = class167.method1189(0, class306.field4983);
                class51.field1038.field2435 = 0;
                class51.field1038.method1027(14, -20374);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class51.field1038.method1027(var4, -20374);
                class127.field2224.method1645(class51.field1038.field2496, 2, -20326, 0);
                if (class125.field2205 != null) {
                    class125.field2205.method140(-74);
                }
                if (class96.field1746 != null) {
                    class96.field1746.method140(-99);
                }
                int var5 = class127.field2224.method1639((byte) 125);
                if (class125.field2205 != null) {
                    class125.field2205.method140(-70);
                }
                if (class96.field1746 != null) {
                    class96.field1746.method140(-82);
                }
                if (var5 != 0) {
                    class6.field124 = 0;
                    class11.field363 = var5;
                    class127.field2224.method1646((byte) 82);
                    class127.field2224 = null;
                    return;
                }
                class6.field124 = 3;
            }
            if (class6.field124 == 3) {
                if (class127.field2224.method1642((byte) -89) < 8) {
                    return;
                }
                int[] var6 = new int[4];
                class127.field2224.method1643(0, 8, (byte) -97, class342.field5413.field2496);
                class342.field5413.field2435 = 0;
                class171.field2833 = class342.field5413.method991((byte) -84);
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                var6[2] = (int) (class171.field2833 >> 32);
                var6[3] = (int) class171.field2833;
                class51.field1038.field2435 = 0;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                class51.field1038.method1027(10, -20374);
                class51.field1038.method1045((byte) 125, var6[0]);
                class51.field1038.method1045((byte) 126, var6[1]);
                class51.field1038.method1045((byte) 115, var6[2]);
                class51.field1038.method1045((byte) -19, var6[3]);
                class51.field1038.method1003((byte) -15, class167.method1189(0, class306.field4983));
                class51.field1038.method1012(class206.field3456, (byte) 116);
                class51.field1038.method995(-1, class135.field2317, class81.field1413);
                class320.field5204.field2435 = 0;
                if (class334.field5326 == 40) {
                    class320.field5204.method1027(18, -20374);
                } else {
                    class320.field5204.method1027(16, -20374);
                }
                class320.field5204.method1002((byte) -95, class51.field1038.field2435 + (class148.method1066(class200.field3359, (byte) 57) + 163));
                class320.field5204.method1045((byte) 120, 553);
                class320.field5204.method1027(class88.field1532, -20374);
                class320.field5204.method1027(class295.field4812 ? 1 : 0, -20374);
                class320.field5204.method1027(1, -20374);
                class320.field5204.method1027(class292.method2078(16), -20374);
                class320.field5204.method1002((byte) -97, class133.field2287);
                class320.field5204.method1002((byte) -96, class287.field4696);
                class320.field5204.method1027(class117.field2083, -20374);
                class264.method1854(24, class320.field5204);
                class320.field5204.method1012(class200.field3359, (byte) 91);
                class320.field5204.method1045((byte) -121, class363.field5745);
                class320.field5204.method1045((byte) -69, class235.method1636(-25475));
                class224.field3696 = true;
                class320.field5204.method1002((byte) -80, class26.field677);
                class320.field5204.method1045((byte) 122, class244.field4051.method1406(60));
                class320.field5204.method1045((byte) -44, class26.field664.method1406(90));
                class320.field5204.method1045((byte) 121, class143.field2409.method1406(110));
                class320.field5204.method1045((byte) 121, class284.field4651.method1406(110));
                class320.field5204.method1045((byte) -76, class349.field5582.method1406(40));
                class320.field5204.method1045((byte) -112, class162.field2727.method1406(126));
                class320.field5204.method1045((byte) 121, class112.field2043.method1406(38));
                class320.field5204.method1045((byte) -52, class107.field1946.method1406(80));
                class320.field5204.method1045((byte) -8, class99.field1828.method1406(46));
                class320.field5204.method1045((byte) 126, class49.field1014.method1406(82));
                class320.field5204.method1045((byte) 115, class278.field4543.method1406(78));
                class320.field5204.method1045((byte) -5, class103.field1902.method1406(50));
                class320.field5204.method1045((byte) 115, class318.field5177.method1406(42));
                class320.field5204.method1045((byte) 2, class124.field2186.method1406(60));
                class320.field5204.method1045((byte) 124, class136.field2332.method1406(24));
                class320.field5204.method1045((byte) 114, class348.field5574.method1406(56));
                class320.field5204.method1045((byte) -35, class132.field2276.method1406(107));
                class320.field5204.method1045((byte) -69, class160.field2704.method1406(52));
                class320.field5204.method1045((byte) -63, class323.field5226.method1406(10));
                class320.field5204.method1045((byte) 116, class260.field4265.method1406(26));
                class320.field5204.method1045((byte) -6, class18.field494.method1406(69));
                class320.field5204.method1045((byte) -106, class334.field5321.method1406(43));
                class320.field5204.method1045((byte) 125, class13.field400.method1406(30));
                class320.field5204.method1045((byte) 120, class25.field652.method1406(126));
                class320.field5204.method1045((byte) -57, class354.field5655.method1406(32));
                class320.field5204.method1045((byte) 123, class351.field5606.method1406(91));
                class320.field5204.method1045((byte) -95, class46.field934.method1406(27));
                class320.field5204.method1045((byte) 117, class331.field5286.method1406(113));
                class320.field5204.method1045((byte) -74, class21.field544.method1406(72));
                class320.field5204.method1037(class51.field1038.field2496, 0, 90, class51.field1038.field2435);
                class127.field2224.method1645(class320.field5204.field2496, class320.field5204.field2435, -20326, 0);
                class51.field1038.method299(var6, 25900);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class342.field5413.method299(var6, 25900);
                class6.field124 = 4;
            }
            if (class6.field124 == 4) {
                if (class127.field2224.method1642((byte) -89) < 1) {
                    return;
                }
                int var8 = class127.field2224.method1639((byte) 125);
                if (var8 == 21) {
                    class6.field124 = 7;
                } else if (var8 == 29) {
                    class6.field124 = 10;
                } else if (var8 == 1) {
                    class11.field363 = var8;
                    class6.field124 = 5;
                    return;
                } else if (var8 == 2) {
                    class6.field124 = 8;
                } else if (var8 == 15) {
                    class6.field124 = 0;
                    class11.field363 = var8;
                    return;
                } else if (var8 == 23 && class212.field3516 < 1) {
                    class6.field124 = 1;
                    class110.field2013 = 0;
                    class212.field3516++;
                    class127.field2224.method1646((byte) 103);
                    class127.field2224 = null;
                    return;
                } else {
                    class6.field124 = 0;
                    class11.field363 = var8;
                    class127.field2224.method1646((byte) 86);
                    class127.field2224 = null;
                    return;
                }
            }
            if (class6.field124 == 6) {
                class51.field1038.field2435 = 0;
                class51.field1038.method291((byte) -91, 17);
                class127.field2224.method1645(class51.field1038.field2496, class51.field1038.field2435, -20326, 0);
                class6.field124 = 4;
                return;
            }
            label301: {
                if (class6.field124 != 7) {
                    if (class6.field124 == 10) {
                        if (class127.field2224.method1642((byte) -89) >= 1) {
                            class52.field1047 = class127.field2224.method1639((byte) 125);
                            class11.field363 = 29;
                            class6.field124 = 0;
                            class127.field2224.method1646((byte) 106);
                            class127.field2224 = null;
                            return;
                        }
                        return;
                    }
                    if (class6.field124 != 8) {
                        break label301;
                    }
                    if (class127.field2224.method1642((byte) -89) >= 14) {
                        class127.field2224.method1643(0, 14, (byte) -65, class342.field5413.field2496);
                        class342.field5413.field2435 = 0;
                        class300.field4883 = class342.field5413.method1005((byte) 122);
                        class132.field2267 = class342.field5413.method1005((byte) 122);
                        class153.field2612 = class342.field5413.method1005((byte) 122) == 1;
                        class345.field5452 = class342.field5413.method1005((byte) 122) == 1;
                        class47.field946 = class342.field5413.method1005((byte) 122) == 1;
                        class312.field5088 = class342.field5413.method1005((byte) 122) == 1;
                        class233.field3817 = class342.field5413.method1005((byte) 122) == 1;
                        class96.field1752 = class342.field5413.method989(94);
                        class151.field2571 = class342.field5413.method1005((byte) 122) == 1;
                        class235.field3852 = class342.field5413.method1005((byte) 122) == 1;
                        class56.method475(class235.field3852, -16529);
                        class336.method2366(true, class235.field3852);
                        class212.method1461((byte) 117, class235.field3852);
                        if (!class295.field4812) {
                            if ((!class153.field2612 || class47.field946) && !class151.field2571) {
                                try {
                                    class186.method1305(class59.field1164.field2658, false, "unzap");
                                } catch (Throwable var15) {
                                }
                            } else {
                                try {
                                    class186.method1305(class59.field1164.field2658, false, "zap");
                                } catch (Throwable var14) {
                                }
                            }
                        }
                        try {
                            class186.method1305(class59.field1164.field2658, false, "loggedin");
                        } catch (Throwable var13) {
                        }
                        class65.field1240 = class342.field5413.method293((byte) -127);
                        class205.field3414 = class342.field5413.method989(94);
                        class6.field124 = 9;
                        break label301;
                    }
                    return;
                }
                if (class127.field2224.method1642((byte) -89) < 1) {
                    return;
                }
                class308.field5026 = (class127.field2224.method1639((byte) 125) + 3) * 60;
                class11.field363 = 21;
                class6.field124 = 0;
                class127.field2224.method1646((byte) 98);
                class127.field2224 = null;
                return;
            }
            if (class6.field124 == 9) {
                if (class127.field2224.method1642((byte) -89) >= class205.field3414) {
                    class342.field5413.field2435 = 0;
                    class127.field2224.method1643(0, class205.field3414, (byte) -100, class342.field5413.field2496);
                    class11.field363 = 2;
                    class6.field124 = 0;
                    class207.method1432(0);
                    class174.field2886 = -1;
                    class293.method2081(-11542, false);
                    class65.field1240 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var16) {
            if (class127.field2224 != null) {
                class127.field2224.method1646((byte) 113);
                class127.field2224 = null;
            }
            if (class212.field3516 >= 1) {
                class11.field363 = -4;
                class6.field124 = 0;
            } else {
                class212.field3516++;
                if (class65.field1239 == class177.field2934) {
                    class177.field2934 = class160.field2714;
                } else {
                    class177.field2934 = class65.field1239;
                }
                class6.field124 = 1;
                class110.field2013 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lpo;", line = 589)
    public static final class91 method960(int arg0, int arg1) {
        if (arg0 < 96) {
            method959((byte) -107);
        }
        class91 var2 = (class91) class341.field5402.method893((long) arg1, 63);
        field2347++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field3272.method1404(34, arg1, (byte) -111);
        class91 var4 = new class91();
        if (var3 != null) {
            var4.method698(-14782, new class146(var3), arg1);
        }
        class341.field5402.method888((long) arg1, var4, 13);
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([JI[I)V", line = 615)
    public static final void method961(long[] arg0, int arg1, int[] arg2) {
        field2352++;
        class217.method1512(arg1, false, arg0, arg0.length - 1, arg2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 623)
    public static void method962(int arg0) {
        if (arg0 != 31757) {
            method961((long[]) null, -18, (int[]) null);
        }
        field2346 = null;
        field2351 = null;
        field2353 = null;
    }

    @OriginalMember(owner = "client!da", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 641)
    public final void paint(Graphics arg0) {
        field2344++;
        this.field2350.paint(arg0);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 652)
    public class138(Component arg0) {
        this.field2350 = arg0;
    }
}
