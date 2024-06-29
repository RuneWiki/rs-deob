import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class124 {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    private int field2247 = 0;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public int field2251 = -1;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Z")
    public boolean field2257 = true;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public int field2255 = 128;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lud;")
    public static class279 field2246 = class130.method1024("Nehmen", 255);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "[I")
    public static int[] field2241 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Lud;")
    public static class279 field2258 = class130.method1024("Connexion au serveur de mise -9 jour en cours", 255);

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Lud;")
    public static class279 field2256 = class130.method1024("www", 255);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lpf;")
    public static class85 field2239 = class150.method1199(0);

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Lud;")
    public static class279 field2259 = class130.method1024(")1 ", 255);

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field2261 = 0;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Lud;")
    public static class279 field2260 = class130.method1024("brillant3:", 255);

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "S")
    public static short field2262 = 320;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lclient;")
    public static client field2252;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLvh;)V", line = 7)
    public static final void method986(byte arg0, class53 arg1) {
        int var2 = 108 / ((60 - arg0) / 41);
        field2248++;
        while (true) {
            while (arg1.field1168.length > arg1.field1142) {
                int var3 = 0;
                int var4 = 0;
                boolean var5 = false;
                if (arg1.method483(-105) == 1) {
                    var3 = arg1.method483(-120);
                    var5 = true;
                    var4 = arg1.method483(-111);
                }
                int var6 = arg1.method483(-103);
                int var7 = arg1.method483(-107);
                int var8 = class166.field3007 + class34.field777 - (var7 * 64) - 1;
                int var9 = var6 * 64 - class245.field4356;
                if (var9 >= 0 && (var8 - 63) >= 0 && class121.field2180 > var9 + 63 && class166.field3007 > var8) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var5 || var12 >= (var3 * 8) && var12 < var3 * 8 + 8 && (var4 * 8) <= var13 && var13 < (var4 * 8 + 8)) {
                                int var14 = arg1.method483(-119);
                                if (var14 != 0) {
                                    if ((var14 & 0x1) == 1) {
                                        int var15 = arg1.method483(-126);
                                        if (class231.field4048[var10][var11] == null) {
                                            class231.field4048[var10][var11] = new byte[4096];
                                        }
                                        class231.field4048[var10][var11][(63 - var13 << 6) + var12] = (byte) var15;
                                    }
                                    if ((var14 & 0x2) == 2) {
                                        int var16 = arg1.method461((byte) 117);
                                        if (class306.field5440[var10][var11] == null) {
                                            class306.field5440[var10][var11] = new int[4096];
                                        }
                                        class306.field5440[var10][var11][(63 - var13 << 6) + var12] = var16;
                                    }
                                    if ((var14 & 0x4) == 4) {
                                        int var17 = arg1.method461((byte) -106);
                                        if (class204.field3630[var10][var11] == null) {
                                            class204.field3630[var10][var11] = new int[4096];
                                        }
                                        var17--;
                                        class264 var18 = class252.method1808(var17, (byte) 4);
                                        if (var18.field4760 != null) {
                                            var18 = var18.method1896(125);
                                            if (var18 == null || var18.field4722 == -1) {
                                                continue;
                                            }
                                        }
                                        class204.field3630[var10][var11][(63 - var13 << 6) + var12] = var18.field4727 + 1;
                                        class215 var19 = new class215();
                                        var19.field3785 = var9;
                                        var19.field3782 = var8;
                                        var19.field3788 = var18.field4722;
                                        class310.field5491.method2246(true, var19);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var20 = 0; var20 < (var5 ? 64 : 4096); var20++) {
                        int var21 = arg1.method483(-104);
                        if (var21 != 0) {
                            if ((var21 & 0x1) == 1) {
                                arg1.field1142++;
                            }
                            if ((var21 & 0x2) == 2) {
                                arg1.field1142 += 2;
                            }
                            if ((var21 & 0x4) == 4) {
                                arg1.field1142 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILvh;)V", line = 163)
    public final void method987(int arg0, int arg1, class53 arg2) {
        field2249++;
        while (true) {
            int var4 = arg2.method483(-102);
            if (var4 == 0) {
                if (arg0 != 0) {
                    this.field2255 = -12;
                }
                return;
            }
            this.method989(83, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([BIB)I", line = 194)
    public static final int method988(byte[] arg0, int arg1, byte arg2) {
        int var3 = 13 / ((arg2 - 14) / 45);
        field2244++;
        return class44.method374(arg0, (byte) -55, arg1, 0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILvh;)V", line = 203)
    private final void method989(int arg0, int arg1, int arg2, class53 arg3) {
        if (arg1 == 1) {
            this.field2247 = arg3.method461((byte) 110);
            this.method990(15835, this.field2247);
        } else if (arg1 == 2) {
            this.field2251 = arg3.method468(28214);
            if (this.field2251 == 65535) {
                this.field2251 = -1;
            }
        } else if (arg1 == 3) {
            this.field2255 = arg3.method468(28214);
        } else if (arg1 == 4) {
            this.field2257 = false;
        }
        if (arg0 <= 0) {
            field2239 = (class85) null;
        }
        field2245++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V", line = 251)
    private final void method990(int arg0, int arg1) {
        field2243++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFFCC7) >> 16) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        if (arg0 != 15835) {
            this.field2240 = 10;
        }
        double var9 = var5;
        if (var3 < var5) {
            var9 = var3;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var5;
        if (var5 < var3) {
            var15 = var3;
        }
        if (var7 > var15) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        this.field2242 = (int) (var17 * 256.0D);
        if (this.field2242 < 0) {
            this.field2242 = 0;
        } else if (this.field2242 > 255) {
            this.field2242 = 255;
        }
        if (var9 != var15) {
            if (var5 == var15) {
                var11 = (var3 - var7) / (var15 - var9);
            } else if (var3 == var15) {
                var11 = (var7 - var5) / (var15 - var9) + 2.0D;
            } else if (var7 == var15) {
                var11 = (var5 - var3) / (var15 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var15 - var9) / (var9 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        double var19 = var11 / 6.0D;
        if (var17 > 0.5D) {
            this.field2250 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field2250 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field2250 < 1) {
            this.field2250 = 1;
        }
        this.field2240 = (int) (var13 * 256.0D);
        if (this.field2240 < 0) {
            this.field2240 = 0;
        } else if (this.field2240 > 255) {
            this.field2240 = 255;
        }
        this.field2253 = (int) ((double) this.field2250 * var19);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 343)
    public static void method991(byte arg0) {
        field2259 = null;
        field2252 = null;
        field2246 = null;
        if (arg0 < 29) {
            return;
        }
        field2241 = null;
        field2258 = null;
        field2260 = null;
        field2239 = null;
        field2256 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Z", line = 365)
    public static final boolean method992(int arg0) {
        field2254++;
        if (arg0 != -19320) {
            return false;
        }
        try {
            if (class181.field3310 == 2) {
                if (class214.field3759 == null) {
                    class214.field3759 = class4.method25(class204.field3633, class103.field1937, class284.field5069);
                    if (class214.field3759 == null) {
                        return false;
                    }
                }
                if (class185.field3399 == null) {
                    class185.field3399 = new class131(class14.field426, class216.field3823);
                }
                if (class17.field538.method111(28039, class185.field3399, 22050, class214.field3759, class274.field4869)) {
                    class17.field538.method134((byte) -30);
                    class17.field538.method130(108, class243.field4322);
                    class17.field538.method105((byte) -123, class70.field1382, class214.field3759);
                    class181.field3310 = 0;
                    class214.field3759 = null;
                    class185.field3399 = null;
                    class204.field3633 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class17.field538.method115(false);
            class214.field3759 = null;
            class181.field3310 = 0;
            class204.field3633 = null;
            class185.field3399 = null;
        }
        return false;
    }
}
