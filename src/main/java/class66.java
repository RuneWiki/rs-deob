import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class66 {

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "Lwe;")
    private class24 field906 = new class24();

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "Lwe;")
    private class24 field914 = new class24();

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "Lwe;")
    private class24 field925 = new class24();

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "Lwe;")
    private class24 field927 = new class24();

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "Lrg;")
    private class366 field928 = new class366(4);

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "B")
    private byte field932 = 0;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public volatile int field933 = 0;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public volatile int field934 = 0;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "Lrg;")
    private class366 field935 = new class366(8);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Lhc;")
    public static class368 field904 = new class368("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "[I")
    public static int[] field924 = new int[2500];

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "J")
    public static long field926 = 0L;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "J")
    private long field931;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "Lcr;")
    private class191 field929;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "Ln;")
    private class25 field936;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "[I")
    public static int[] field923;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
    public final boolean method523(byte arg0) {
        field915++;
        int var2 = 6 / ((-arg0 - 6) / 56);
        return this.method534((byte) 51) >= 20;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
    public final int method524(int arg0) {
        if (arg0 >= -83) {
            return 56;
        } else {
            field911++;
            return this.field906.method149((byte) -116) + this.field914.method149((byte) -112);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    private final void method525(int arg0) {
        if (arg0 != 28450) {
            return;
        }
        field918++;
        if (this.field929 == null) {
            return;
        }
        try {
            this.field928.field5048 = 0;
            this.field928.method2280(6, 1537846408);
            this.field928.method2276(arg0 - 42279, 3);
            this.field929.method1328(0, this.field928.field5076, 4, 3);
        } catch (IOException var3) {
            try {
                this.field929.method1324(122);
            } catch (Exception var2) {
            }
            this.field933++;
            this.field934 = -2;
            this.field929 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V")
    public final void method526(int arg0) {
        field907++;
        try {
            if (arg0 > -34) {
                this.method523((byte) -76);
            }
            this.field929.method1324(113);
        } catch (Exception var2) {
        }
        this.field929 = null;
        this.field933++;
        this.field932 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field934 = -1;
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
    public final void method527(int arg0) {
        if (arg0 < 121) {
            this.method528((byte) 43);
        }
        if (this.field929 != null) {
            this.field929.method1323(-1);
        }
        field921++;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
    public final void method528(byte arg0) {
        if (arg0 != -107) {
            this.field929 = null;
        }
        if (this.field929 != null) {
            this.field929.method1324(108);
        }
        field919++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)Z")
    public final boolean method529(boolean arg0) {
        if (arg0) {
            field926 = -83L;
        }
        field908++;
        return this.method524(-85) >= 20;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLcr;B)V")
    public final void method530(boolean arg0, class191 arg1, byte arg2) {
        if (this.field929 != null) {
            try {
                this.field929.method1324(103);
            } catch (Exception var8) {
            }
            this.field929 = null;
        }
        field913++;
        if (arg2 < 38) {
            this.field928 = null;
        }
        this.field929 = arg1;
        this.method525(28450);
        this.method538(arg0, -75);
        this.field935.field5048 = 0;
        this.field936 = null;
        while (true) {
            class25 var4 = (class25) this.field914.method146((byte) 121);
            if (var4 == null) {
                while (true) {
                    class25 var5 = (class25) this.field927.method146((byte) 121);
                    if (var5 == null) {
                        if (this.field932 != 0) {
                            try {
                                this.field928.field5048 = 0;
                                this.field928.method2280(4, 1537846408);
                                this.field928.method2280(this.field932, 1537846408);
                                this.field928.method2275(-93, 0);
                                this.field929.method1328(0, this.field928.field5076, 4, 3);
                            } catch (IOException var7) {
                                try {
                                    this.field929.method1324(122);
                                } catch (Exception var6) {
                                }
                                this.field933++;
                                this.field934 = -2;
                                this.field929 = null;
                            }
                        }
                        this.field930 = 0;
                        this.field931 = class199.method1372(30938);
                        return;
                    }
                    this.field925.method145(var5, false);
                }
            }
            this.field906.method145(var4, false);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
    public static final void method531(boolean arg0) {
        field910++;
        if (class446.field6258 == 0 || class446.field6258 == 5) {
            return;
        }
        if (arg0) {
            method531(false);
        }
        try {
            if ((++class302.field4119) > 2000) {
                if (class398.field5513 != null) {
                    class398.field5513.method1324(102);
                    class398.field5513 = null;
                }
                if (class301.field4114 >= 1) {
                    class446.field6258 = 0;
                    class310.field4205 = -5;
                    return;
                }
                if (class418.field5780 == class111.field1704) {
                    class111.field1704 = class189.field2729;
                } else {
                    class111.field1704 = class418.field5780;
                }
                class302.field4119 = 0;
                class301.field4114++;
                class446.field6258 = 1;
            }
            if (class446.field6258 == 1) {
                class332.field4479 = class122.field1839.method588((byte) -47, class111.field1704, class403.field5562);
                class446.field6258 = 2;
            }
            if (class446.field6258 == 2) {
                if (class332.field4479.field3875 == 2) {
                    throw new IOException();
                }
                if (class332.field4479.field3875 != 1) {
                    return;
                }
                class398.field5513 = new class191((Socket) class332.field4479.field3871, class122.field1839);
                class332.field4479 = null;
                long var1 = class393.field5449 = class264.method1689(class129.field1952, (byte) 110);
                class88.field1232.field5048 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class88.field1232.method2280(14, 1537846408);
                class88.field1232.method2280(var3, 1537846408);
                class398.field5513.method1328(0, class88.field1232.field5076, 2, 3);
                if (class39.field513 != null) {
                    class39.field513.method1333(-19721);
                }
                if (class431.field6047 != null) {
                    class431.field6047.method1333(-19721);
                }
                int var4 = class398.field5513.method1329(-19824);
                if (class39.field513 != null) {
                    class39.field513.method1333(-19721);
                }
                if (class431.field6047 != null) {
                    class431.field6047.method1333(-19721);
                }
                if (var4 != 0) {
                    class310.field4205 = var4;
                    class446.field6258 = 0;
                    class398.field5513.method1324(122);
                    class398.field5513 = null;
                    return;
                }
                class446.field6258 = 3;
            }
            if (class446.field6258 == 3) {
                if (class398.field5513.method1325(0) < 8) {
                    return;
                }
                class398.field5513.method1326(class75.field1068.field5076, (byte) 120, 8, 0);
                class75.field1068.field5048 = 0;
                class319.field4358 = class75.field1068.method2290(-1083442040);
                int[] var5 = new int[4];
                class88.field1232.field5048 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class319.field4358;
                var5[2] = (int) (class319.field4358 >> 32);
                class88.field1232.method2280(10, 1537846408);
                class88.field1232.method2261(var5[0], -176);
                class88.field1232.method2261(var5[1], -176);
                class88.field1232.method2261(var5[2], -176);
                class88.field1232.method2261(var5[3], -176);
                class88.field1232.method2256(class264.method1689(class129.field1952, (byte) 110), -25);
                class88.field1232.method2285(class54.field689, (byte) -97);
                class88.field1232.method2269(class103.field1419, (byte) -110, class267.field3665);
                class371.field5142.field5048 = 0;
                if (class98.field1383 == 40) {
                    class371.field5142.method2280(18, 1537846408);
                } else {
                    class371.field5142.method2280(16, 1537846408);
                }
                class371.field5142.method2275(123, class88.field1232.field5048 + class82.method662(12189, class101.field1400) + 161);
                class371.field5142.method2261(565, -176);
                class371.field5142.method2280(class339.field4592, 1537846408);
                class371.field5142.method2280(class111.method846(-12334), 1537846408);
                class371.field5142.method2275(-101, class373.field5174);
                class371.field5142.method2275(121, class396.field5493);
                class371.field5142.method2280(class353.field4745, 1537846408);
                class359.method2217(0, class371.field5142);
                class371.field5142.method2285(class101.field1400, (byte) -97);
                class371.field5142.method2261(class47.field606, -176);
                class371.field5142.method2261(class49.method403((byte) -109), -176);
                class404.field5589 = true;
                class371.field5142.method2275(121, class230.field3244);
                class371.field5142.method2261(class334.field4529.method1911(0), -176);
                class371.field5142.method2261(class165.field2339.method1911(0), -176);
                class371.field5142.method2261(class453.field6506.method1911(0), -176);
                class371.field5142.method2261(class42.field561.method1911(0), -176);
                class371.field5142.method2261(class62.field841.method1911(0), -176);
                class371.field5142.method2261(class314.field4254.method1911(0), -176);
                class371.field5142.method2261(class2.field14.method1911(0), -176);
                class371.field5142.method2261(class294.field3986.method1911(0), -176);
                class371.field5142.method2261(class112.field1726.method1911(0), -176);
                class371.field5142.method2261(class392.field5444.method1911(0), -176);
                class371.field5142.method2261(class65.field888.method1911(0), -176);
                class371.field5142.method2261(class15.field210.method1911(0), -176);
                class371.field5142.method2261(class72.field1011.method1911(0), -176);
                class371.field5142.method2261(class170.field2406.method1911(0), -176);
                class371.field5142.method2261(class13.field118.method1911(0), -176);
                class371.field5142.method2261(class13.field114.method1911(0), -176);
                class371.field5142.method2261(class356.field4772.method1911(0), -176);
                class371.field5142.method2261(class263.field3618.method1911(0), -176);
                class371.field5142.method2261(class344.field4652.method1911(0), -176);
                class371.field5142.method2261(class337.field4557.method1911(0), -176);
                class371.field5142.method2261(class72.field1059.method1911(0), -176);
                class371.field5142.method2261(class452.field6501.method1911(0), -176);
                class371.field5142.method2261(class397.field5496.method1911(0), -176);
                class371.field5142.method2261(class399.field5534.method1911(0), -176);
                class371.field5142.method2261(class233.field3271.method1911(0), -176);
                class371.field5142.method2261(class163.field2328.method1911(0), -176);
                class371.field5142.method2261(class318.field4328.method1911(0), -176);
                class371.field5142.method2261(class430.field6023.method1911(0), -176);
                class371.field5142.method2261(class317.field4312.method1911(0), -176);
                class371.field5142.method2301(class88.field1232.field5048, class88.field1232.field5076, (byte) -82, 0);
                class398.field5513.method1328(0, class371.field5142.field5076, class371.field5142.field5048, 3);
                class88.field1232.method1144(-99, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class75.field1068.method1144(113, var5);
                class446.field6258 = 4;
            }
            if (class446.field6258 == 4) {
                if (class398.field5513.method1325(0) < 1) {
                    return;
                }
                int var7 = class398.field5513.method1329(-19824);
                if (var7 == 21) {
                    class446.field6258 = 7;
                } else if (var7 == 29) {
                    class446.field6258 = 10;
                } else if (var7 == 1) {
                    class446.field6258 = 5;
                    class310.field4205 = var7;
                    return;
                } else if (var7 == 2) {
                    class446.field6258 = 8;
                } else if (var7 == 15) {
                    class446.field6258 = 0;
                    class310.field4205 = var7;
                    return;
                } else if (var7 == 23 && class301.field4114 < 1) {
                    class302.field4119 = 0;
                    class301.field4114++;
                    class446.field6258 = 1;
                    class398.field5513.method1324(105);
                    class398.field5513 = null;
                    return;
                } else {
                    class310.field4205 = var7;
                    class446.field6258 = 0;
                    class398.field5513.method1324(126);
                    class398.field5513 = null;
                    return;
                }
            }
            if (class446.field6258 == 6) {
                class88.field1232.field5048 = 0;
                class88.field1232.method1151(17, (byte) -92);
                class398.field5513.method1328(0, class88.field1232.field5076, class88.field1232.field5048, 3);
                class446.field6258 = 4;
            } else if (class446.field6258 == 7) {
                if (class398.field5513.method1325(0) >= 1) {
                    class140.field2040 = class398.field5513.method1329(-19824) * 60 + 180;
                    class310.field4205 = 21;
                    class446.field6258 = 0;
                    class398.field5513.method1324(104);
                    class398.field5513 = null;
                }
            } else if (class446.field6258 != 10) {
                if (class446.field6258 == 8) {
                    if (class398.field5513.method1325(0) < 13) {
                        return;
                    }
                    class398.field5513.method1326(class75.field1068.field5076, (byte) 120, 13, 0);
                    class75.field1068.field5048 = 0;
                    class157.field2234 = class75.field1068.method2306((byte) 69);
                    class439.field6194 = class75.field1068.method2306((byte) 98);
                    class119.field1806 = class75.field1068.method2306((byte) 46) == 1;
                    class189.field2725 = class75.field1068.method2306((byte) 48) == 1;
                    class343.field4635 = class75.field1068.method2306((byte) 42) == 1;
                    class117.field1790 = class75.field1068.method2306((byte) 80) == 1;
                    class217.field3030 = class75.field1068.method2297(13352);
                    class311.field4221 = class75.field1068.method2306((byte) 29) == 1;
                    class55.field701 = class75.field1068.method2306((byte) 69) == 1;
                    class404.method2495((byte) 72, class55.field701);
                    class104.method792(-1, class55.field701);
                    class242.method1570(-104, class55.field701);
                    if ((!class119.field1806 || class343.field4635) && !class311.field4221) {
                        try {
                            class9.method49(class122.field1839.field1086, "unzap", -105);
                        } catch (Throwable var10) {
                        }
                    } else {
                        try {
                            class9.method49(class122.field1839.field1086, "zap", -127);
                        } catch (Throwable var9) {
                        }
                    }
                    if (class314.field4259 == 0) {
                        try {
                            class9.method49(class122.field1839.field1086, "loggedin", -118);
                        } catch (Throwable var8) {
                        }
                    }
                    class451.field6496 = class75.field1068.method1143((byte) 1);
                    class213.field2982 = class75.field1068.method2297(13352);
                    class446.field6258 = 9;
                }
                if (class446.field6258 == 9 && class398.field5513.method1325(0) >= class213.field2982) {
                    class75.field1068.field5048 = 0;
                    class398.field5513.method1326(class75.field1068.field5076, (byte) 120, class213.field2982, 0);
                    class310.field4205 = 2;
                    class446.field6258 = 0;
                    class200.method1373((byte) 39);
                    class26.field335 = -1;
                    class188.method1308(false, 26);
                    class451.field6496 = -1;
                }
            } else if (class398.field5513.method1325(0) >= 1) {
                class93.field1294 = class398.field5513.method1329(-19824);
                class310.field4205 = 29;
                class446.field6258 = 0;
                class398.field5513.method1324(109);
                class398.field5513 = null;
            }
        } catch (IOException var11) {
            if (class398.field5513 != null) {
                class398.field5513.method1324(127);
                class398.field5513 = null;
            }
            if (class301.field4114 < 1) {
                class302.field4119 = 0;
                class301.field4114++;
                if (class418.field5780 == class111.field1704) {
                    class111.field1704 = class189.field2729;
                } else {
                    class111.field1704 = class418.field5780;
                }
                class446.field6258 = 1;
            } else {
                class446.field6258 = 0;
                class310.field4205 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)Z")
    public final boolean method532(byte arg0) {
        if (this.field929 != null) {
            long var2 = class199.method1372(30938);
            int var4 = (int) (var2 - this.field931);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field931 = var2;
            this.field930 += var4;
            if (this.field930 > 30000) {
                try {
                    this.field929.method1324(121);
                } catch (Exception var27) {
                }
                this.field929 = null;
            }
        }
        field916++;
        if (this.field929 == null) {
            return this.method524(-84) == 0 && this.method534((byte) 101) == 0;
        }
        try {
            this.field929.method1322(-22670);
            for (class25 var5 = (class25) this.field906.method152(arg0 - 21); var5 != null; var5 = (class25) this.field906.method148(5)) {
                this.field928.field5048 = 0;
                this.field928.method2280(1, 1537846408);
                this.field928.method2276(-13829, (int) var5.field2411);
                this.field929.method1328(0, this.field928.field5076, 4, arg0 ^ 0x78);
                this.field914.method145(var5, false);
            }
            if (arg0 != 123) {
                this.method527(50);
            }
            for (class25 var6 = (class25) this.field925.method152(-51); var6 != null; var6 = (class25) this.field925.method148(arg0 ^ 0x7E)) {
                this.field928.field5048 = 0;
                this.field928.method2280(0, 1537846408);
                this.field928.method2276(arg0 ^ 0xFFFFC980, (int) var6.field2411);
                this.field929.method1328(0, this.field928.field5076, 4, 3);
                this.field927.method145(var6, false);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field929.method1325(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field930 = 0;
                byte var9 = 0;
                if (this.field936 == null) {
                    var9 = 8;
                } else if (this.field936.field319 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field936.field315.field5076.length - this.field936.field317;
                    int var11 = 512 - this.field936.field319;
                    if ((var10 - this.field936.field315.field5048) < var11) {
                        var11 = var10 - this.field936.field315.field5048;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field929.method1326(this.field936.field315.field5076, (byte) 120, var11, this.field936.field315.field5048);
                    if (this.field932 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field936.field315.field5076[this.field936.field315.field5048 + var12] = (byte) class267.method1701(this.field936.field315.field5076[this.field936.field315.field5048 + var12], this.field932);
                        }
                    }
                    this.field936.field319 += var11;
                    this.field936.field315.field5048 += var11;
                    if (this.field936.field315.field5048 == var10) {
                        this.field936.method1213((byte) 106);
                        this.field936.field484 = false;
                        this.field936 = null;
                    } else if (this.field936.field319 == 512) {
                        this.field936.field319 = 0;
                    }
                } else {
                    int var13 = var9 - this.field935.field5048;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field929.method1326(this.field935.field5076, (byte) 120, var13, this.field935.field5048);
                    if (this.field932 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field935.field5076[this.field935.field5048 + var14] = (byte) class267.method1701(this.field935.field5076[this.field935.field5048 + var14], this.field932);
                        }
                    }
                    this.field935.field5048 += var13;
                    if (var9 <= this.field935.field5048) {
                        if (this.field936 == null) {
                            this.field935.field5048 = 0;
                            int var15 = this.field935.method2306((byte) 76);
                            int var16 = this.field935.method2297(arg0 + 13229);
                            int var17 = this.field935.method2306((byte) 44);
                            int var18 = this.field935.method2258(arg0 + 1177515341);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class25 var24;
                            if (var20) {
                                for (var24 = (class25) this.field927.method152(44); var24 != null && var24.field2411 != var21; var24 = (class25) this.field927.method148(5)) {
                                }
                            } else {
                                for (var24 = (class25) this.field914.method152(-38); var24 != null && var24.field2411 != var21; var24 = (class25) this.field914.method148(5)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field936 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field936.field315 = new class366(this.field936.field317 + var25 + var18);
                            this.field936.field315.method2280(var19, 1537846408);
                            this.field936.field315.method2261(var18, -176);
                            this.field936.field319 = 8;
                            this.field935.field5048 = 0;
                        } else if (this.field936.field319 != 0) {
                            throw new IOException();
                        } else if (this.field935.field5076[0] == -1) {
                            this.field936.field319 = 1;
                            this.field935.field5048 = 0;
                        } else {
                            this.field936 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field929.method1324(121);
            } catch (Exception var26) {
            }
            this.field929 = null;
            this.field934 = -2;
            this.field933++;
            return this.method524(-122) == 0 && this.method534((byte) 62) == 0;
        }
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(B)V")
    public static void method533(byte arg0) {
        field924 = null;
        if (arg0 < 114) {
            field924 = null;
        }
        field923 = null;
        field904 = null;
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)I")
    private final int method534(byte arg0) {
        field912++;
        if (arg0 < 34) {
            this.method538(false, 35);
        }
        return this.field925.method149((byte) -116) + this.field927.method149((byte) -125);
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)I")
    public static final int method535(int arg0) {
        field922++;
        try {
            if (class112.field1727 == arg0) {
                if (class429.field5970 > (class199.method1372(30938) - 5000L)) {
                    return 0;
                }
                class368.field5104 = class122.field1839.method588((byte) -128, class166.field2340, class248.field3483);
                class17.field215 = class199.method1372(30938);
                class112.field1727 = 1;
            }
            if (class199.method1372(30938) > (class17.field215 + 30000L)) {
                return class399.method2474((byte) 22, 1000);
            }
            if (class112.field1727 == 1) {
                if (class368.field5104.field3875 == 2) {
                    return class399.method2474((byte) 22, 1001);
                }
                if (class368.field5104.field3875 != 1) {
                    return -1;
                }
                class398.field5513 = new class191((Socket) class368.field5104.field3871, class122.field1839);
                class368.field5104 = null;
                int var1 = 0;
                class88.field1232.field5048 = 0;
                if (class112.field1734) {
                    var1 = class373.field5177;
                }
                class88.field1232.method2280(23, 1537846408);
                class88.field1232.method2261(var1, arg0 - 176);
                class398.field5513.method1328(0, class88.field1232.field5076, class88.field1232.field5048, 3);
                if (class39.field513 != null) {
                    class39.field513.method1333(-19721);
                }
                if (class431.field6047 != null) {
                    class431.field6047.method1333(arg0 - 19721);
                }
                int var2 = class398.field5513.method1329(arg0 ^ 0xFFFFB290);
                if (class39.field513 != null) {
                    class39.field513.method1333(-19721);
                }
                if (class431.field6047 != null) {
                    class431.field6047.method1333(arg0 ^ 0xFFFFB2F7);
                }
                if (var2 != 0) {
                    return class399.method2474((byte) 22, var2);
                }
                class112.field1727 = 2;
            }
            if (class112.field1727 == 2) {
                if (class398.field5513.method1325(arg0) < 2) {
                    return -1;
                }
                class107.field1519 = class398.field5513.method1329(-19824);
                class107.field1519 <<= 0x8;
                class107.field1519 += class398.field5513.method1329(arg0 ^ 0xFFFFB290);
                class95.field1314 = new byte[class107.field1519];
                class112.field1727 = 3;
                class320.field4361 = 0;
            }
            if (class112.field1727 != 3) {
                return -1;
            }
            int var3 = class398.field5513.method1325(arg0);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class107.field1519 - class320.field4361) {
                var3 = class107.field1519 - class320.field4361;
            }
            class398.field5513.method1326(class95.field1314, (byte) 120, var3, class320.field4361);
            class320.field4361 += var3;
            if (class320.field4361 < class107.field1519) {
                return -1;
            } else if (class102.method779(class95.field1314, (byte) -8)) {
                class85.field1193 = new class277[class17.field231];
                int var4 = 0;
                for (int var5 = class193.field2799; var5 <= class200.field2874; var5++) {
                    class277 var6 = class117.method921(-123, var5);
                    if (var6 != null) {
                        class85.field1193[var4++] = var6;
                    }
                }
                class373.field5176 = 0;
                class422.field5841 = null;
                class398.field5513.method1324(113);
                class112.field1727 = 0;
                class419.field5806 = 0;
                class95.field1314 = null;
                class398.field5513 = null;
                class429.field5970 = class199.method1372(30938);
                return 0;
            } else {
                return class399.method2474((byte) 22, 1002);
            }
        } catch (IOException var7) {
            return class399.method2474((byte) 22, 1003);
        }
    }

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "(I)V")
    public final void method536(int arg0) {
        field909++;
        if (this.field929 == null) {
            return;
        }
        try {
            this.field928.field5048 = 0;
            this.field928.method2280(7, 1537846408);
            this.field928.method2276(arg0 ^ 0xFFFFC9FB, 0);
            this.field929.method1328(arg0, this.field928.field5076, 4, 3);
        } catch (IOException var3) {
            try {
                this.field929.method1324(arg0 ^ 0x79);
            } catch (Exception var2) {
            }
            this.field929 = null;
            this.field934 = -2;
            this.field933++;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BZIII)Ln;")
    public final class25 method537(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field905++;
        long var6 = (long) ((arg4 << 16) + arg2);
        int var8 = 75 % ((arg3 + 45) / 60);
        class25 var9 = new class25();
        var9.field317 = arg0;
        var9.field486 = arg1;
        var9.field2411 = var6;
        if (arg1) {
            if (this.method524(-88) >= 20) {
                throw new RuntimeException();
            }
            this.field906.method145(var9, false);
        } else if (this.method534((byte) 40) < 20) {
            this.field925.method145(var9, false);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)V")
    public final void method538(boolean arg0, int arg1) {
        if (arg1 >= -39) {
            return;
        }
        field920++;
        if (this.field929 == null) {
            return;
        }
        try {
            this.field928.field5048 = 0;
            this.field928.method2280(arg0 ? 2 : 3, 1537846408);
            this.field928.method2276(-13829, 0);
            this.field929.method1328(0, this.field928.field5076, 4, 3);
        } catch (IOException var4) {
            try {
                this.field929.method1324(125);
            } catch (Exception var3) {
            }
            this.field929 = null;
            this.field933++;
            this.field934 = -2;
        }
    }
}
