import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class242 {

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lob;")
    public class418 field3397 = new class418();

    @OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
    public static int[] field3392 = new int[128];

    @OriginalMember(owner = "client!m", name = "x", descriptor = "Lbo;")
    public static class453 field3402 = new class453(8);

    @OriginalMember(owner = "client!m", name = "y", descriptor = "[I")
    public static int[] field3403 = new int[13];

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lsj;")
    public static class248 field3380;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Lob;")
    private class418 field3400;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "[Lpg;")
    public static class321[] field3396;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "[Lum;")
    public static class322[] field3401;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILob;)V", line = 4)
    public final void method1560(int arg0, class418 arg1) {
        if (arg0 >= -98) {
            this.field3400 = null;
        }
        if (arg1.field6090 != null) {
            arg1.method2632(true);
        }
        field3399++;
        arg1.field6094 = this.field3397;
        arg1.field6090 = this.field3397.field6090;
        arg1.field6090.field6094 = arg1;
        arg1.field6094.field6090 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[II)[I", line = 24)
    public static final int[] method1561(int arg0, int[] arg1, int arg2) {
        field3384++;
        int[] var3 = new int[1152];
        int var4 = 0;
        int var5 = 0;
        if (arg2 < 11) {
            return null;
        }
        while (var5 < 32) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg1[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg1[var4 - 1] != 0) {
                        var7 = arg0;
                    } else if (var5 > 0 && arg1[var4 - 36] != 0) {
                        var7 = arg0;
                    } else if (var6 < 35 && arg1[var4 + 1] != 0) {
                        var7 = arg0;
                    } else if (var5 < 31 && arg1[var4 + 36] != 0) {
                        var7 = arg0;
                    }
                }
                var3[var4++] = var7;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lob;", line = 77)
    public final class418 method1562(int arg0) {
        field3385++;
        class418 var2 = this.field3400;
        if (arg0 != 0) {
            return null;
        } else if (this.field3397 == var2) {
            this.field3400 = null;
            return null;
        } else {
            this.field3400 = var2.field6090;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Z", line = 97)
    public final boolean method1563(int arg0) {
        field3398++;
        if (arg0 == 11395) {
            return this.field3397.field6094 == this.field3397;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lob;", line = 108)
    public final class418 method1564(int arg0) {
        if (arg0 != -25594) {
            this.field3397 = null;
        }
        field3383++;
        class418 var2 = this.field3397.field6090;
        if (this.field3397 == var2) {
            this.field3400 = null;
            return null;
        } else {
            this.field3400 = var2.field6090;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([III[II)V", line = 129)
    public static final void method1565(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (arg3[var9] < (var7 + (var9 & 0x1))) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method1565(arg0, arg1, var6 - 1, arg3, 77);
            method1565(arg0, var6 + 1, arg2, arg3, 107);
        }
        field3386++;
        if (arg4 <= 71) {
            method1565((int[]) null, -91, 91, (int[]) null, 45);
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 188)
    public static void method1566(int arg0) {
        field3392 = null;
        field3402 = null;
        field3380 = null;
        field3401 = null;
        field3396 = null;
        if (arg0 == 19476) {
            field3403 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I", line = 208)
    public static final int method1567(int arg0, byte arg1) {
        if (arg1 >= -106) {
            return -64;
        } else {
            field3389++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILm;Lob;)V", line = 224)
    private final void method1568(int arg0, class242 arg1, class418 arg2) {
        field3390++;
        class418 var4 = this.field3397.field6090;
        this.field3397.field6090 = arg2.field6090;
        arg2.field6090.field6094 = this.field3397;
        if (this.field3397 != arg2) {
            arg2.field6090 = arg1.field3397.field6090;
            arg2.field6090.field6094 = arg2;
            var4.field6094 = arg1.field3397;
            arg1.field3397.field6090 = var4;
        }
        if (arg0 != 0) {
            field3401 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Lob;", line = 247)
    public final class418 method1569(int arg0) {
        field3395++;
        if (arg0 != 24502) {
            field3403 = null;
        }
        class418 var2 = this.field3397.field6094;
        if (this.field3397 == var2) {
            return null;
        } else {
            var2.method2632(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lm;I)V", line = 268)
    public final void method1570(class242 arg0, int arg1) {
        if (arg1 != 1) {
            this.method1576(false, (class418) null);
        }
        this.method1568(0, arg0, this.field3397.field6094);
        field3382++;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)I", line = 280)
    public final int method1571(int arg0) {
        if (arg0 != 7955) {
            field3396 = null;
        }
        field3391++;
        int var2 = 0;
        class418 var3 = this.field3397.field6094;
        while (this.field3397 != var3) {
            var3 = var3.field6094;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 303)
    public static final void method1572(byte arg0) {
        field3394++;
        if (class395.field5738 == 0 || class395.field5738 == 5) {
            return;
        }
        try {
            if (arg0 != 89) {
                method1565((int[]) null, 19, -75, (int[]) null, 15);
            }
            if (++class381.field5570 > 2000) {
                if (class290.field4380 != null) {
                    class290.field4380.method2360((byte) 83);
                    class290.field4380 = null;
                }
                if (class326.field4822 >= 1) {
                    class395.field5738 = 0;
                    class241.field3371 = -5;
                    return;
                }
                if (client.field842 == class64.field964) {
                    class64.field964 = class129.field1693;
                } else {
                    class64.field964 = client.field842;
                }
                class326.field4822++;
                class381.field5570 = 0;
                class395.field5738 = 1;
            }
            if (class395.field5738 == 1) {
                class184.field2477 = class63.field948.method2385(arg0 ^ 0x59, class64.field964, class415.field6005);
                class395.field5738 = 2;
            }
            if (class395.field5738 == 2) {
                if (class184.field2477.field3104 == 2) {
                    throw new IOException();
                }
                if (class184.field2477.field3104 != 1) {
                    return;
                }
                class290.field4380 = new class359((Socket) class184.field2477.field3105, class63.field948);
                class184.field2477 = null;
                long var1 = class39.field595 = class337.method2194(class427.field6216, arg0 ^ 0x58);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class140.field1797.field5049 = 0;
                class140.field1797.method2204(14, 8);
                class140.field1797.method2204(var3, 8);
                class290.field4380.method2365(class140.field1797.field5042, 2, 5000, 0);
                if (class78.field1088 != null) {
                    class78.field1088.method2536(0);
                }
                if (class261.field3836 != null) {
                    class261.field3836.method2536(arg0 ^ 0x59);
                }
                int var4 = class290.field4380.method2362(27648);
                if (class78.field1088 != null) {
                    class78.field1088.method2536(0);
                }
                if (class261.field3836 != null) {
                    class261.field3836.method2536(0);
                }
                if (var4 != 0) {
                    class395.field5738 = 0;
                    class241.field3371 = var4;
                    class290.field4380.method2360((byte) -59);
                    class290.field4380 = null;
                    return;
                }
                class395.field5738 = 3;
            }
            if (class395.field5738 == 3) {
                if (class290.field4380.method2359(true) < 8) {
                    return;
                }
                class290.field4380.method2366(class27.field471.field5042, arg0 ^ 0x59, 0, 8);
                class27.field471.field5049 = 0;
                class382.field5596 = class27.field471.method2231(126);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class382.field5596 >> 32), (int) class382.field5596 };
                class140.field1797.field5049 = 0;
                class140.field1797.method2204(10, 8);
                class140.field1797.method2240((byte) -88, var5[0]);
                class140.field1797.method2240((byte) -88, var5[1]);
                class140.field1797.method2240((byte) -88, var5[2]);
                class140.field1797.method2240((byte) -88, var5[3]);
                class140.field1797.method2258(25445, class337.method2194(class427.field6216, 1));
                class140.field1797.method2214(class425.field6207, -56);
                class140.field1797.method2216(false, class281.field4136, class36.field556);
                class144.field1844.field5049 = 0;
                if (class381.field5579 == 40) {
                    class144.field1844.method2204(18, 8);
                } else {
                    class144.field1844.method2204(16, 8);
                }
                class144.field1844.method2250(false, 161 - (-class140.field1797.field5049 - class9.method61((byte) -117, class129.field1697)));
                class144.field1844.method2240((byte) -88, 556);
                class144.field1844.method2204(class247.field3477, 8);
                class144.field1844.method2204(class340.method2203((byte) 72), 8);
                class144.field1844.method2250(false, class357.field5298);
                class144.field1844.method2250(false, class435.field6313);
                class144.field1844.method2204(class104.field1359, 8);
                class243.method1578(class144.field1844, (byte) -127);
                class144.field1844.method2214(class129.field1697, -97);
                class144.field1844.method2240((byte) -88, class430.field6250);
                class144.field1844.method2240((byte) -88, class277.method1821(false));
                class113.field1470 = true;
                class144.field1844.method2250(false, class416.field6024);
                class144.field1844.method2240((byte) -88, class277.field4061.method1199(arg0 - 186));
                class144.field1844.method2240((byte) -88, class58.field869.method1199(-112));
                class144.field1844.method2240((byte) -88, class90.field1225.method1199(-97));
                class144.field1844.method2240((byte) -88, class95.field1293.method1199(-127));
                class144.field1844.method2240((byte) -88, class14.field228.method1199(-122));
                class144.field1844.method2240((byte) -88, class68.field992.method1199(-124));
                class144.field1844.method2240((byte) -88, class388.field5677.method1199(arg0 - 187));
                class144.field1844.method2240((byte) -88, class115.field1497.method1199(-103));
                class144.field1844.method2240((byte) -88, class118.field1532.method1199(-97));
                class144.field1844.method2240((byte) -88, class273.field4007.method1199(-110));
                class144.field1844.method2240((byte) -88, class198.field2730.method1199(-118));
                class144.field1844.method2240((byte) -88, class394.field5733.method1199(-121));
                class144.field1844.method2240((byte) -88, class266.field3954.method1199(-101));
                class144.field1844.method2240((byte) -88, class341.field5043.method1199(-126));
                class144.field1844.method2240((byte) -88, class122.field1582.method1199(arg0 ^ 0xFFFFFFC7));
                class144.field1844.method2240((byte) -88, class107.field1408.method1199(arg0 - 213));
                class144.field1844.method2240((byte) -88, class132.field1733.method1199(-126));
                class144.field1844.method2240((byte) -88, class184.field2475.method1199(arg0 ^ 0xFFFFFFC8));
                class144.field1844.method2240((byte) -88, class289.field4332.method1199(-108));
                class144.field1844.method2240((byte) -88, class60.field924.method1199(-109));
                class144.field1844.method2240((byte) -88, class112.field1440.method1199(-124));
                class144.field1844.method2240((byte) -88, class100.field1323.method1199(-128));
                class144.field1844.method2240((byte) -88, class386.field5647.method1199(-120));
                class144.field1844.method2240((byte) -88, class299.field4523.method1199(arg0 - 202));
                class144.field1844.method2240((byte) -88, class198.field2737.method1199(arg0 - 192));
                class144.field1844.method2240((byte) -88, class350.field5206.method1199(-126));
                class144.field1844.method2240((byte) -88, class350.field5209.method1199(-116));
                class144.field1844.method2240((byte) -88, class107.field1412.method1199(-128));
                class144.field1844.method2240((byte) -88, class81.field1117.method1199(-103));
                class144.field1844.method2252(0, -847501448, class140.field1797.field5049, class140.field1797.field5042);
                class290.field4380.method2365(class144.field1844.field5042, class144.field1844.field5049, 5000, 0);
                class140.field1797.method1838(var5, false);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class27.field471.method1838(var5, false);
                class395.field5738 = 4;
            }
            if (class395.field5738 == 4) {
                if (class290.field4380.method2359(true) < 1) {
                    return;
                }
                int var7 = class290.field4380.method2362(arg0 ^ 0x6C59);
                if (var7 == 21) {
                    class395.field5738 = 7;
                } else if (var7 == 29) {
                    class395.field5738 = 10;
                } else if (var7 == 1) {
                    class395.field5738 = 5;
                    class241.field3371 = var7;
                    return;
                } else if (var7 == 2) {
                    class395.field5738 = 8;
                } else if (var7 == 15) {
                    class395.field5738 = 0;
                    class241.field3371 = var7;
                    return;
                } else if (var7 == 23 && class326.field4822 < 1) {
                    class326.field4822++;
                    class395.field5738 = 1;
                    class381.field5570 = 0;
                    class290.field4380.method2360((byte) -112);
                    class290.field4380 = null;
                    return;
                } else {
                    class395.field5738 = 0;
                    class241.field3371 = var7;
                    class290.field4380.method2360((byte) -77);
                    class290.field4380 = null;
                    return;
                }
            }
            if (class395.field5738 == 6) {
                class140.field1797.field5049 = 0;
                class140.field1797.method1833(-20379, 17);
                class290.field4380.method2365(class140.field1797.field5042, class140.field1797.field5049, 5000, 0);
                class395.field5738 = 4;
            } else if (class395.field5738 == 7) {
                if (class290.field4380.method2359(true) >= 1) {
                    class305.field4567 = class290.field4380.method2362(27648) * 60 + 180;
                    class395.field5738 = 0;
                    class241.field3371 = 21;
                    class290.field4380.method2360((byte) 74);
                    class290.field4380 = null;
                }
            } else if (class395.field5738 != 10) {
                if (class395.field5738 == 8) {
                    if (class290.field4380.method2359(true) < 14) {
                        return;
                    }
                    class290.field4380.method2366(class27.field471.field5042, 0, 0, 14);
                    class27.field471.field5049 = 0;
                    class7.field93 = class27.field471.method2233((byte) 104);
                    class352.field5222 = class27.field471.method2233((byte) 104);
                    class181.field2419 = class27.field471.method2233((byte) 104) == 1;
                    class379.field5553 = class27.field471.method2233((byte) 104) == 1;
                    class38.field575 = class27.field471.method2233((byte) 104) == 1;
                    class406.field5916 = class27.field471.method2233((byte) 104) == 1;
                    class342.field5105 = class27.field471.method2233((byte) 104) == 1;
                    class400.field5853 = class27.field471.method2239(arg0 - 1076228049);
                    class326.field4828 = class27.field471.method2233((byte) 104) == 1;
                    class190.field2652 = class27.field471.method2233((byte) 104) == 1;
                    class145.method998(class190.field2652, (byte) 98);
                    class15.method109(class190.field2652, 1);
                    class66.method566(false, class190.field2652);
                    if ((!class181.field2419 || class38.field575) && !class326.field4828) {
                        try {
                            class177.method1170(arg0 ^ 0x9, "unzap", class63.field948.field5381);
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class177.method1170(65, "zap", class63.field948.field5381);
                        } catch (Throwable var10) {
                        }
                    }
                    if (class72.field1026 == 0) {
                        try {
                            class177.method1170(59, "loggedin", class63.field948.field5381);
                        } catch (Throwable var8) {
                        }
                    }
                    class8.field112 = class27.field471.method1837(arg0 ^ 0xA6);
                    class20.field342 = class27.field471.method2239(-1076227960);
                    class395.field5738 = 9;
                }
                if (class395.field5738 == 9 && class290.field4380.method2359(true) >= class20.field342) {
                    class27.field471.field5049 = 0;
                    class290.field4380.method2366(class27.field471.field5042, 0, 0, class20.field342);
                    class241.field3371 = 2;
                    class395.field5738 = 0;
                    class188.method1250(0);
                    class359.field5314 = -1;
                    class430.method2685(false, false);
                    class8.field112 = -1;
                }
            } else if (class290.field4380.method2359(true) >= 1) {
                class370.field5465 = class290.field4380.method2362(27648);
                class395.field5738 = 0;
                class241.field3371 = 29;
                class290.field4380.method2360((byte) 88);
                class290.field4380 = null;
            }
        } catch (IOException var11) {
            if (class290.field4380 != null) {
                class290.field4380.method2360((byte) -57);
                class290.field4380 = null;
            }
            if (class326.field4822 < 1) {
                if (client.field842 == class64.field964) {
                    class64.field964 = class129.field1693;
                } else {
                    class64.field964 = client.field842;
                }
                class395.field5738 = 1;
                class326.field4822++;
                class381.field5570 = 0;
            } else {
                class241.field3371 = -4;
                class395.field5738 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)Lob;", line = 683)
    public final class418 method1573(byte arg0) {
        field3379++;
        class418 var2 = this.field3400;
        if (arg0 > -127) {
            return null;
        } else if (this.field3397 == var2) {
            this.field3400 = null;
            return null;
        } else {
            this.field3400 = var2.field6094;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V", line = 710)
    public final void method1574(int arg0) {
        while (true) {
            class418 var2 = this.field3397.field6094;
            if (this.field3397 == var2) {
                if (arg0 != -32166) {
                    return;
                }
                field3387++;
                this.field3400 = null;
                return;
            }
            var2.method2632(true);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 783)
    public class242() {
        this.field3397.field6090 = this.field3397;
        this.field3397.field6094 = this.field3397;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)Lob;", line = 741)
    public final class418 method1575(int arg0) {
        field3388++;
        if (arg0 != 0) {
            return null;
        }
        class418 var2 = this.field3397.field6094;
        if (this.field3397 == var2) {
            this.field3400 = null;
            return null;
        } else {
            this.field3400 = var2.field6094;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLob;)V", line = 766)
    public final void method1576(boolean arg0, class418 arg1) {
        if (arg1.field6090 != null) {
            arg1.method2632(!arg0);
        }
        field3381++;
        arg1.field6094 = this.field3397.field6094;
        arg1.field6090 = this.field3397;
        if (arg0) {
            this.method1564(-62);
        }
        arg1.field6090.field6094 = arg1;
        arg1.field6094.field6090 = arg1;
    }
}
