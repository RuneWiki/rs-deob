import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class177 {

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lsc;")
    private class166 field2511 = new class166();

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lsc;")
    private class166 field2512 = new class166();

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Lsc;")
    private class166 field2514 = new class166();

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Lsc;")
    private class166 field2515 = new class166();

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Lbj;")
    private class215 field2519 = new class215(4);

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public volatile int field2522 = 0;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public volatile int field2520 = 0;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "B")
    private byte field2523 = 0;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lbj;")
    private class215 field2521 = new class215(8);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2491 = 1;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "J")
    private long field2518;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Lul;")
    private class191 field2516;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lnh;")
    public static class305 field2499;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Lkm;")
    private class54 field2524;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[Lbf;")
    public static class108[] field2504;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)I")
    public static final int method1106(byte arg0, int arg1) {
        int var2 = arg1 & 0x3F;
        field2509++;
        int var3 = (arg1 & 0xF9) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg0 != -102) {
            field2491 = -44;
        }
        return 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Z")
    public final boolean method1107(int arg0) {
        if (arg0 < 60) {
            return true;
        } else {
            field2513++;
            return this.method1117((byte) 56) >= 20;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public final void method1108(int arg0) {
        try {
            this.field2516.method1211((byte) -18);
        } catch (Exception var3) {
        }
        this.field2520 = -1;
        this.field2516 = null;
        this.field2523 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        int var2 = -120 % ((arg0 + 86) / 39);
        this.field2522++;
        field2502++;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I")
    public final int method1109(int arg0) {
        if (arg0 == -30176) {
            field2503++;
            return this.field2511.method1056(arg0 + 939367340) + this.field2512.method1056(939337164);
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Z")
    public final boolean method1110(byte arg0) {
        if (this.field2516 != null) {
            long var2 = class299.method2006(arg0 ^ 0x251C);
            int var4 = (int) (var2 - this.field2518);
            this.field2518 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2517 += var4;
            if (this.field2517 > 30000) {
                try {
                    this.field2516.method1211((byte) -120);
                } catch (Exception var27) {
                }
                this.field2516 = null;
            }
        }
        field2505++;
        if (this.field2516 == null) {
            return this.method1109(arg0 - 30278) == 0 && this.method1117((byte) 24) == 0;
        }
        try {
            this.field2516.method1210((byte) -124);
            if (arg0 != 102) {
                return true;
            }
            for (class54 var5 = (class54) this.field2511.method1059((byte) -106); var5 != null; var5 = (class54) this.field2511.method1064((byte) -116)) {
                this.field2519.field3280 = 0;
                this.field2519.method1363(1, -43);
                this.field2519.method1405((int) var5.field1793, 7827);
                this.field2516.method1202((byte) -125, 0, 4, this.field2519.field3287);
                this.field2512.method1068(var5, (byte) -45);
            }
            for (class54 var6 = (class54) this.field2514.method1059((byte) -106); var6 != null; var6 = (class54) this.field2514.method1064((byte) -61)) {
                this.field2519.field3280 = 0;
                this.field2519.method1363(0, -125);
                this.field2519.method1405((int) var6.field1793, 7827);
                this.field2516.method1202((byte) -62, 0, 4, this.field2519.field3287);
                this.field2515.method1068(var6, (byte) -45);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2516.method1213((byte) -112);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2517 = 0;
                byte var9 = 0;
                if (this.field2524 == null) {
                    var9 = 8;
                } else if (this.field2524.field778 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = 512 - this.field2524.field778;
                    int var11 = this.field2524.field768.field3287.length - this.field2524.field774;
                    if (var11 - this.field2524.field768.field3280 < var10) {
                        var10 = var11 - this.field2524.field768.field3280;
                    }
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field2516.method1212(arg0 ^ 0x66, this.field2524.field768.field3280, this.field2524.field768.field3287, var10);
                    if (this.field2523 != 0) {
                        for (int var12 = 0; var12 < var10; var12++) {
                            this.field2524.field768.field3287[this.field2524.field768.field3280 + var12] = (byte) class207.method1290(this.field2524.field768.field3287[this.field2524.field768.field3280 + var12], this.field2523);
                        }
                    }
                    this.field2524.field768.field3280 += var10;
                    this.field2524.field778 += var10;
                    if (this.field2524.field768.field3280 == var11) {
                        this.field2524.method819((byte) -12);
                        this.field2524.field1712 = false;
                        this.field2524 = null;
                    } else if (this.field2524.field778 == 512) {
                        this.field2524.field778 = 0;
                    }
                } else {
                    int var13 = var9 - this.field2521.field3280;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field2516.method1212(arg0 ^ 0x66, this.field2521.field3280, this.field2521.field3287, var13);
                    if (this.field2523 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field2521.field3287[this.field2521.field3280 + var14] = (byte) class207.method1290(this.field2521.field3287[this.field2521.field3280 + var14], this.field2523);
                        }
                    }
                    this.field2521.field3280 += var13;
                    if (this.field2521.field3280 >= var9) {
                        if (this.field2524 == null) {
                            this.field2521.field3280 = 0;
                            int var15 = this.field2521.method1374((byte) -60);
                            int var16 = this.field2521.method1379(-75);
                            int var17 = this.field2521.method1374((byte) -60);
                            int var18 = this.field2521.method1383((byte) -106);
                            boolean var19 = (var17 & 0x80) != 0;
                            long var20 = (long) ((var15 << 16) + var16);
                            Object var22 = null;
                            int var23 = var17 & 0x7F;
                            class54 var24;
                            if (var19) {
                                for (var24 = (class54) this.field2515.method1059((byte) -106); var24 != null && var24.field1793 != var20; var24 = (class54) this.field2515.method1064((byte) -64)) {
                                }
                            } else {
                                for (var24 = (class54) this.field2512.method1059((byte) -106); var24 != null && var24.field1793 != var20; var24 = (class54) this.field2512.method1064((byte) -84)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field2524 = var24;
                            int var25 = var23 == 0 ? 5 : 9;
                            this.field2524.field768 = new class215(var18 + var25 + this.field2524.field774);
                            this.field2524.field768.method1363(var23, arg0 + 13);
                            this.field2524.field768.method1398(true, var18);
                            this.field2524.field778 = 8;
                            this.field2521.field3280 = 0;
                        } else if (this.field2524.field778 != 0) {
                            throw new IOException();
                        } else if (this.field2521.field3287[0] == -1) {
                            this.field2524.field778 = 1;
                            this.field2521.field3280 = 0;
                        } else {
                            this.field2524 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2516.method1211((byte) 103);
            } catch (Exception var26) {
            }
            this.field2520 = -2;
            this.field2516 = null;
            this.field2522++;
            return this.method1109(-30176) == 0 && this.method1117((byte) 14) == 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public final void method1111(boolean arg0) {
        field2498++;
        if (this.field2516 != null) {
            this.field2516.method1209(-92);
        }
        if (!arg0) {
            this.method1118(-33);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZILul;)V")
    public final void method1112(boolean arg0, int arg1, class191 arg2) {
        if (this.field2516 != null) {
            try {
                this.field2516.method1211((byte) -107);
            } catch (Exception var8) {
            }
            this.field2516 = null;
        }
        this.field2516 = arg2;
        field2506++;
        this.method1115(arg1 - 83);
        this.method1113(arg0, (byte) 127);
        this.field2521.field3280 = arg1;
        this.field2524 = null;
        while (true) {
            class54 var4 = (class54) this.field2512.method1063((byte) -121);
            if (var4 == null) {
                while (true) {
                    class54 var5 = (class54) this.field2515.method1063((byte) -113);
                    if (var5 == null) {
                        if (this.field2523 != 0) {
                            try {
                                this.field2519.field3280 = 0;
                                this.field2519.method1363(4, -87);
                                this.field2519.method1363(this.field2523, -41);
                                this.field2519.method1385(0, true);
                                this.field2516.method1202((byte) -128, 0, 4, this.field2519.field3287);
                            } catch (IOException var7) {
                                try {
                                    this.field2516.method1211((byte) -57);
                                } catch (Exception var6) {
                                }
                                this.field2516 = null;
                                this.field2520 = -2;
                                this.field2522++;
                            }
                        }
                        this.field2517 = 0;
                        this.field2518 = class299.method2006(9594);
                        return;
                    }
                    this.field2514.method1068(var5, (byte) -45);
                }
            }
            this.field2511.method1068(var4, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZB)V")
    public final void method1113(boolean arg0, byte arg1) {
        field2508++;
        if (this.field2516 == null) {
            return;
        }
        try {
            this.field2519.field3280 = 0;
            this.field2519.method1363(arg0 ? 2 : 3, 104);
            this.field2519.method1405(0, 7827);
            int var3 = -18 / ((-arg1 - 46) / 59);
            this.field2516.method1202((byte) -87, 0, 4, this.field2519.field3287);
        } catch (IOException var5) {
            try {
                this.field2516.method1211((byte) 102);
            } catch (Exception var4) {
            }
            this.field2522++;
            this.field2516 = null;
            this.field2520 = -2;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lqe;")
    public static final class295 method1114(int arg0, int arg1) {
        field2494++;
        class295 var2 = (class295) class233.field3646.method950((long) arg1, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class43.field641.method2050(90, arg0, arg1);
        class295 var4 = new class295();
        var4.field4706 = arg1;
        if (var3 != null) {
            var4.method1980((byte) -60, new class215(var3));
        }
        var4.method1981((byte) 18);
        if (var4.field4699 == 2 && class47.field682.method1453(true, (long) arg1) == null) {
            class47.field682.method1452((long) arg1, new class313(class182.field2767), arg0 ^ 0x1);
            class190.field2884[class182.field2767++] = var4;
        }
        class233.field3646.method942((long) arg1, (byte) 29, var4);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    private final void method1115(int arg0) {
        field2510++;
        if (this.field2516 == null) {
            return;
        }
        try {
            if (arg0 <= -32) {
                this.field2519.field3280 = 0;
                this.field2519.method1363(6, 126);
                this.field2519.method1405(3, 7827);
                this.field2516.method1202((byte) -82, 0, 4, this.field2519.field3287);
            }
        } catch (IOException var3) {
            try {
                this.field2516.method1211((byte) -48);
            } catch (Exception var2) {
            }
            this.field2522++;
            this.field2516 = null;
            this.field2520 = -2;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I")
    public static final int method1116(int arg0, int arg1) {
        field2501++;
        if (arg0 != -1019628630) {
            field2499 = null;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)I")
    private final int method1117(byte arg0) {
        field2492++;
        if (arg0 < 13) {
            this.method1111(true);
        }
        return this.field2514.method1056(939337164) + this.field2515.method1056(939337164);
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public final void method1118(int arg0) {
        field2497++;
        if (this.field2516 == null) {
            return;
        }
        try {
            if (arg0 < -51) {
                this.field2519.field3280 = 0;
                this.field2519.method1363(7, 101);
                this.field2519.method1405(0, 7827);
                this.field2516.method1202((byte) -69, 0, 4, this.field2519.field3287);
            }
        } catch (IOException var3) {
            try {
                this.field2516.method1211((byte) -124);
            } catch (Exception var2) {
            }
            this.field2516 = null;
            this.field2522++;
            this.field2520 = -2;
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public final void method1119(int arg0) {
        if (arg0 != -3741) {
            this.method1108(67);
        }
        field2496++;
        if (this.field2516 != null) {
            this.field2516.method1211((byte) -125);
        }
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)[Lbf;")
    public static final class108[] method1120(int arg0) {
        int var1 = -99 % ((-arg0 - 41) / 61);
        class108[] var2 = new class108[class56.field784];
        for (int var3 = 0; var3 < class56.field784; var3++) {
            int var4 = class137.field1869[var3] * class112.field1613[var3];
            byte[] var5 = class134.field1847[var3];
            if (class180.field2728[var3]) {
                int[] var6 = new int[var4];
                byte[] var7 = class252.field3945[var3];
                for (int var8 = 0; var8 < var4; var8++) {
                    var6[var8] = class161.method1003(class32.method199(255, var7[var8]) << 24, class298.field4748[class32.method199(255, var5[var8])]);
                }
                var2[var3] = new class269(class242.field3805, class70.field1021, class275.field4376[var3], class96.field1381[var3], class137.field1869[var3], class112.field1613[var3], var6);
            } else {
                int[] var9 = new int[var4];
                for (int var10 = 0; var10 < var4; var10++) {
                    var9[var10] = class298.field4748[class32.method199(var5[var10], 255)];
                }
                var2[var3] = new class203(class242.field3805, class70.field1021, class275.field4376[var3], class96.field1381[var3], class137.field1869[var3], class112.field1613[var3], var9);
            }
        }
        class282.method1840(true);
        field2500++;
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZBI)Lkm;")
    public final class54 method1121(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field2493++;
        long var6 = (long) ((arg4 << 16) + arg1);
        class54 var8 = new class54();
        int var9 = 74 % ((-arg0 - 86) / 35);
        var8.field1793 = var6;
        var8.field1719 = arg2;
        var8.field774 = arg3;
        if (arg2) {
            if (this.method1109(-30176) >= 20) {
                throw new RuntimeException();
            }
            this.field2511.method1068(var8, (byte) -45);
        } else if (this.method1117((byte) 108) < 20) {
            this.field2514.method1068(var8, (byte) -45);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)Z")
    public final boolean method1122(byte arg0) {
        int var2 = -4 / ((69 - arg0) / 48);
        field2507++;
        return this.method1109(-30176) >= 20;
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V")
    public static void method1123(int arg0) {
        if (arg0 == 16) {
            field2499 = null;
            field2504 = null;
        }
    }
}
