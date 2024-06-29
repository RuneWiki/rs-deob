import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class226 {

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "Lvd;")
    public static class222 field4229 = class212.method1357("Lade Sprites )2 ", 10731);

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Lvd;")
    private static class222 field4230 = class212.method1357("Connecting to server)3)3)3", 10731);

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lvd;")
    public static class222 field4233 = field4230;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lph;")
    private static class166 field4221 = new class166(5);

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "[I")
    public static int[] field4239 = new int[128];

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "Lvd;")
    public static class222 field4237 = class212.method1357(" )2> ", 10731);

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "Lvd;")
    public static class222 field4240 = class212.method1357("<br>(X", 10731);

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "[I")
    public static int[] field4241 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    private int field4227;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "J")
    private long field4214;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "J")
    private long field4216;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Z")
    public boolean field4228;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "Z")
    public static boolean field4236;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
    private int[] field4218;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
    private int[] field4222;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lab;II)Lbg;")
    public static final class19 method1474(class3 arg0, int arg1, int arg2) {
        field4232++;
        if (arg1 <= 108) {
            method1479(true, 108, null);
        }
        return class184.method1158(true, arg0, arg2) ? class68.method465(false) : null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIBII)V")
    public static final void method1475(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class121.field2314 = -1;
        if (arg2 != -128) {
            method1479(true, -98, null);
        }
        class218.field4052 = -1;
        class175.field3287 = class99.field1862 * arg1 / arg3;
        field4226++;
        class122.field2334 = class38.field852 * arg0 / arg4;
        class21.method207(-1);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
    public final void method1476(boolean arg0, int arg1) {
        field4234++;
        this.field4228 = arg0;
        if (arg1 != 64) {
            this.field4218 = null;
        }
        this.method1485((byte) 120);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILre;Lre;I)Lee;")
    public final class49 method1477(int arg0, int arg1, class183 arg2, class183 arg3, int arg4) {
        field4231++;
        if (this.field4227 != -1) {
            return class31.method254((byte) -115, this.field4227).method741(arg1, arg3, arg2, arg4, (byte) -114);
        }
        long var6 = this.field4216;
        int[] var8 = this.field4222;
        if (arg3 != null && (arg3.field3402 >= 0 || arg3.field3383 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field4222[var9];
            }
            if (arg3.field3402 >= 0) {
                if (arg3.field3402 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class213.method1361(1073741824, arg3.field3402);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field3383 >= 0) {
                if (arg3.field3383 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class213.method1361(arg3.field3383, 1073741824);
                    var6 ^= var8[3];
                }
            }
        }
        class49 var10 = (class49) class121.field2281.method1071(var6, (byte) 122);
        if (arg0 != -4806) {
            this.method1485((byte) 45);
        }
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var21) != 0 && !class134.method846(var21 & 0x3FFFFFFF, 9988).method843(true)) {
                        var11 = true;
                    }
                } else if (!class112.method728(var21 & 0x3FFFFFFF, (byte) 29).method1304(this.field4228, (byte) 105)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field4214 != -1L) {
                    var10 = (class49) class121.field2281.method1071(this.field4214, (byte) 122);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class148[] var14 = new class148[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class148 var19 = class112.method728(var18 & 0x3FFFFFFF, (byte) 76).method1319(5, this.field4228);
                        if (var19 != null) {
                            var14[var13++] = var19;
                        }
                    } else if ((Integer.MIN_VALUE & var18) != 0) {
                        class148 var20 = class134.method846(var18 & 0x3FFFFFFF, 9988).method840((byte) -126);
                        if (var20 != null) {
                            var14[var13++] = var20;
                        }
                    }
                }
                class148 var16 = new class148(var14, var13);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field4218[var17] < class211.field3930[var17].length) {
                        var16.method948(class140.field2708[var17], class211.field3930[var17][this.field4218[var17]]);
                    }
                    if (this.field4218[var17] < class221.field4089[var17].length) {
                        var16.method948(class99.field1857[var17], class221.field4089[var17][this.field4218[var17]]);
                    }
                }
                var10 = var16.method949(64, 850, -30, -50, -30);
                class121.field2281.method1069(var10, var6, arg0 + 4867);
                this.field4214 = var6;
            }
        }
        if (arg3 == null && arg2 == null) {
            return var10;
        }
        class49 var22;
        if (arg3 != null && arg2 != null) {
            var22 = arg3.method1143(arg4, var10, arg2, arg0 + 4800, arg1);
        } else if (arg3 == null) {
            var22 = arg2.method1152(arg1, var10, 92);
        } else {
            var22 = arg3.method1152(arg4, var10, 103);
        }
        return var22;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)V")
    public final void method1478(int arg0, byte arg1, int arg2) {
        if (arg1 > -55) {
            this.field4228 = true;
        }
        this.field4218[arg2] = arg0;
        field4225++;
        this.method1485((byte) -108);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI[Lba;)V")
    public static final void method1479(boolean arg0, int arg1, class13[] arg2) {
        if (!arg0) {
            field4221 = null;
        }
        field4215++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class13 var4 = arg2[var3];
            if (var4 != null && var4.field238 == arg1 && (!var4.field323 || !class155.method992(0, var4))) {
                if (var4.field365 == 0) {
                    if (!var4.field323 && class155.method992(0, var4) && class152.field2935 != var4) {
                        continue;
                    }
                    method1479(arg0, var4.field269, arg2);
                    if (var4.field307 != null) {
                        method1479(true, var4.field269, var4.field307);
                    }
                    class21 var5 = (class21) class208.field3863.method1520((long) var4.field269, 56);
                    if (var5 != null) {
                        class66.method455(0, var5.field493);
                    }
                }
                if (var4.field365 == 6) {
                    if (var4.field340 != -1 || var4.field277 != -1) {
                        boolean var6 = class54.method404((byte) -16, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field277;
                        } else {
                            var7 = var4.field340;
                        }
                        if (var7 != -1) {
                            class183 var8 = class93.method599((byte) -73, var7);
                            if (var8 != null) {
                                var4.field262 += class121.field2305;
                                while (var4.field262 > var8.field3396[var4.field270]) {
                                    var4.field262 -= var8.field3396[var4.field270];
                                    var4.field270++;
                                    if (var4.field270 >= var8.field3404.length) {
                                        var4.field270 -= var8.field3385;
                                        if (var4.field270 < 0 || var4.field270 >= var8.field3404.length) {
                                            var4.field270 = 0;
                                        }
                                    }
                                    class80.method527(var4, 31702);
                                }
                            }
                        }
                    }
                    if (var4.field243 != 0 && !var4.field323) {
                        int var9 = var4.field243 >> 16;
                        int var10 = class121.field2305 * var9;
                        int var11 = var4.field243 << 16 >> 16;
                        var4.field240 = var4.field240 + var10 & 0x7FF;
                        int var12 = class121.field2305 * var11;
                        var4.field353 = var4.field353 + var12 & 0x7FF;
                        class80.method527(var4, 31702);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static final void method1480(int arg0) {
        field4220++;
        if (class114.field2175 == null) {
            return;
        }
        if (arg0 != 3633) {
            field4241 = null;
        }
        if (class143.field2773 < 10) {
            if (!class6.field94.method23(class114.field2175, 0)) {
                class143.field2773 = class6.field94.method18(class114.field2175, (byte) 60) / 10;
                return;
            }
            class143.field2773 = 10;
        }
        if (class143.field2773 == 10) {
            class109 var1 = new class109(class6.field94.method20(16148, class173.field3261, class114.field2175));
            int var2 = var1.method675(2);
            int var3 = var1.method675(2);
            int var4 = var1.method675(arg0 - 3631);
            int var5 = var1.method675(2);
            int var6 = var1.method675(2);
            int var7 = var1.method675(arg0 ^ 0xE33);
            class38.field852 = (var5 - var3) * 64 + 64;
            class229.field4313 = 8.0D;
            class104.field1929 = 8.0D;
            class99.field1862 = (var4 - var2) * 64 + 64;
            class84.field1608 = new int[class95.field1779 + 1];
            class59.field1107 = var3 * 64;
            int var8 = class99.field1862 >> 6;
            int var9 = (class17.field432.field1360 >> 7) + class151.field2931 - class59.field1107;
            int var10 = var9 + (int) (Math.random() * 10.0D) - 5;
            int var11 = class229.field4314 >> 2 << 10;
            class167.field3184 = var2 * 64;
            int var12 = class110.field2064 + (class17.field432.field1353 >> 7) - class167.field3184;
            int var13 = class38.field852 >> 6;
            int var14 = var12 + (int) (Math.random() * 10.0D) - 5;
            class179.field3319 = new byte[var8][var13][];
            class130.field2532 = new byte[var8][var13][];
            class114.field2182 = new int[var8][var13][];
            class177.field3311 = new int[var8][var13][];
            int var15 = class68.field1275 >> 1;
            if (var14 >= 0 && var14 < class99.field1862 && var10 >= 0 && class38.field852 > var10) {
                class122.field2334 = class38.field852 - var10;
                class175.field3287 = var14;
            } else {
                class122.field2334 = class59.field1107 + class38.field852 - var7 * 64;
                class175.field3287 = var6 * 64 - class167.field3184;
            }
            class69.field1296 = new byte[var8][var13][];
            class71.field1379 = new byte[var8][var13][];
            class185.field3428 = new byte[var8][var13][];
            class205.field3808 = new byte[var8][var13][];
            for (int var16 = 0; var16 < class95.field1779; var16++) {
                class105 var17 = class200.method1281(var16, 95);
                if (var17 != null) {
                    int var18 = var17.field1950;
                    if (var18 >= 0 && !class199.field3629.method1171(var18, (byte) 10)) {
                        var18 = -1;
                    }
                    int var19;
                    if (var17.field1944 >= 0) {
                        int var23 = var17.field1944;
                        int var24 = (var23 & 0x7F) + var15;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > 127) {
                            var24 = 127;
                        }
                        int var25 = (var23 & 0x380) + (var11 + var23 & 0xFC00) + var24;
                        var19 = class199.field3634[class212.method1356(var25, 96, 16853)];
                    } else if (var18 >= 0) {
                        var19 = class199.field3634[class212.method1356(class199.field3629.method1180(-11217, var18), 96, 16853)];
                    } else if (var17.field1952 == -1) {
                        var19 = -1;
                    } else {
                        int var20 = var17.field1952;
                        int var21 = (var20 & 0x7F) + var15;
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 > 127) {
                            var21 = 127;
                        }
                        int var22 = (var11 + var20 & 0xFC00) + (var20 & 0x380) + var21;
                        var19 = class199.field3634[class212.method1356(var22, 96, 16853)];
                    }
                    class84.field1608[var16 + 1] = var19;
                }
            }
            class143.field2773 = 20;
        } else if (class143.field2773 == 20) {
            class193.method1203(127, class6.field94.method20(16148, class151.field2929, class114.field2175));
            class143.field2773 = 30;
            class97.method610(arg0 + 8004);
        } else if (class143.field2773 == 30) {
            class43.method320(class6.field94.method20(16148, class3.field51, class114.field2175), (byte) 126);
            class143.field2773 = 50;
            class97.method610(11637);
        } else if (class143.field2773 == 50) {
            class196.method1208(false, class6.field94.method20(16148, class221.field4093, class114.field2175));
            class143.field2773 = 70;
            class97.method610(11637);
        } else if (class143.field2773 == 70) {
            class10.method98(class6.field94.method20(arg0 + 12515, class31.field648, class114.field2175), 21964);
            class143.field2773 = 90;
            class97.method610(11637);
        } else {
            class161.method1015(class6.field94.method20(16148, class200.field3660, class114.field2175), -52);
            if (class143.field2773 == 90) {
                class209.field3884 = new class133(11, true, class130.field2523);
                class135.field2608 = new class133(12, true, class130.field2523);
                class188.field3480 = new class133(14, true, class130.field2523);
                class103.field1907 = new class133(17, true, class130.field2523);
                class20.field466 = new class133(19, true, class130.field2523);
                class197.field3593 = new class133(22, true, class130.field2523);
                class93.field1738 = new class133(26, true, class130.field2523);
                class134.field2593 = new class133(30, true, class130.field2523);
                class143.field2773 = 100;
            }
            class143.field2773 = 100;
            class121.field2314 = -1;
            class218.field4052 = -1;
            class97.method610(11637);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
    public final int method1481(byte arg0) {
        if (arg0 != 39) {
            method1479(true, -76, null);
        }
        field4219++;
        return this.field4227 == -1 ? (this.field4222[8] << 10) + (this.field4218[4] << 20) + (this.field4218[0] << 25) + this.field4222[1] + (this.field4222[11] << 5) + (this.field4222[0] << 15) : 305419896 - -class31.method254((byte) 24, this.field4227).field2174;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z[II[II)V")
    public final void method1482(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class197.field3589; var7++) {
                    class134 var8 = class134.method846(var7, 9988);
                    if (var8 != null && !var8.field2573 && (arg0 ? 7 : 0) + var6 == var8.field2574) {
                        arg1[class83.field1586[var6]] = class213.method1361(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        field4224++;
        this.field4218 = arg3;
        this.field4227 = arg2;
        this.field4228 = arg0;
        if (arg4 != -8) {
            this.method1476(false, -29);
        }
        this.field4222 = arg1;
        this.method1485((byte) -118);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static void method1483(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field4237 = null;
        field4230 = null;
        field4241 = null;
        field4221 = null;
        field4240 = null;
        field4233 = null;
        field4229 = null;
        field4239 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIB)V")
    public final void method1484(int arg0, int arg1, byte arg2) {
        int var4 = class83.field1586[arg1];
        if (arg2 >= -124) {
            return;
        }
        field4213++;
        if (this.field4222[var4] != 0 && class134.method846(arg0, 9988) != null) {
            this.field4222[var4] = class213.method1361(arg0, Integer.MIN_VALUE);
            this.method1485((byte) 124);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    private final void method1485(byte arg0) {
        field4217++;
        long[] var2 = class6.field92;
        long var3 = this.field4216;
        this.field4216 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4216 = this.field4216 >>> 8 ^ var2[(int) (((long) (this.field4222[var5] >> 24) ^ this.field4216) & 0xFFL)];
            this.field4216 = var2[(int) ((this.field4216 ^ (long) (this.field4222[var5] >> 16)) & 0xFFL)] ^ this.field4216 >>> 8;
            this.field4216 = this.field4216 >>> 8 ^ var2[(int) (((long) (this.field4222[var5] >> 8) ^ this.field4216) & 0xFFL)];
            this.field4216 = this.field4216 >>> 8 ^ var2[(int) (((long) this.field4222[var5] ^ this.field4216) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4216 = this.field4216 >>> 8 ^ var2[(int) ((this.field4216 ^ (long) this.field4218[var6]) & 0xFFL)];
        }
        this.field4216 = var2[(int) ((this.field4216 ^ (long) (this.field4228 ? 1 : 0)) & 0xFFL)] ^ this.field4216 >>> 8;
        if (var3 != 0L && this.field4216 != var3) {
            class121.field2281.method1076(-1, var3);
        }
        int var7 = 73 % ((arg0 + 39) / 63);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)I")
    public static final int method1486(int arg0, int arg1, int arg2) {
        field4235++;
        if (arg1 > -94) {
            method1474(null, 15, 32);
        }
        class208 var3 = (class208) class78.field1505.method1520((long) arg2, 48);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field3865.length) {
            return var3.field3865[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lre;II)Lee;")
    public final class49 method1487(class183 arg0, int arg1, int arg2) {
        field4223++;
        if (this.field4227 != -1) {
            return class31.method254((byte) 100, this.field4227).method736(arg1, (byte) 92, arg0);
        }
        class49 var4 = (class49) field4221.method1071(this.field4216, (byte) 122);
        if (arg2 != -9589) {
            field4241 = null;
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field4222[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class134.method846(var15 & 0x3FFFFFFF, arg2 ^ 0xFFFFFD8F).method845(0)) {
                        var5 = true;
                    }
                } else if (!class112.method728(var15 & 0x3FFFFFFF, (byte) 28).method1307(this.field4228, -102)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class148[] var7 = new class148[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field4222[var9];
                if ((var12 & 0x40000000) != 0) {
                    class148 var14 = class112.method728(var12 & 0x3FFFFFFF, (byte) -126).method1315(this.field4228, false);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class148 var13 = class134.method846(var12 & 0x3FFFFFFF, 9988).method839(-119);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class148 var10 = new class148(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field4218[var11] < class211.field3930[var11].length) {
                    var10.method948(class140.field2708[var11], class211.field3930[var11][this.field4218[var11]]);
                }
                if (this.field4218[var11] < class221.field4089[var11].length) {
                    var10.method948(class99.field1857[var11], class221.field4089[var11][this.field4218[var11]]);
                }
            }
            var4 = var10.method949(64, 768, -50, -10, -50);
            field4221.method1069(var4, this.field4216, 61);
        }
        if (arg0 != null) {
            var4 = arg0.method1151((byte) 63, arg1, var4);
        }
        return var4;
    }
}
