import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class92 extends class8 {

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    private int field1509 = 0;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    private int field1514 = 0;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    private int field1524 = 0;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "Z")
    public static boolean field1519 = false;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "Lqh;")
    public static class201 field1520;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "[I")
    public static int[] field1521;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIII)V")
    private final void method690(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            method697(-28, false);
        }
        ++field1526;
        int var5 = arg2 > 2048 ? arg1 + arg2 - (arg1 * arg2 >> 12) : (arg1 + 4096) * arg2 >> 12;
        if (~var5 >= -1) {
            this.field1511 = this.field1517 = this.field1508 = arg2;
        } else {
            int var6 = -var5 + arg2 + arg2;
            int var7 = arg3 * 6;
            int var8 = (var5 - var6 << 12) / var5;
            int var9 = var7 >> 12;
            int var10 = var7 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var6 + var13;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field1511 = var5;
                                    this.field1508 = var14;
                                    this.field1517 = var6;
                                }
                            } else {
                                this.field1508 = var5;
                                this.field1511 = var15;
                                this.field1517 = var6;
                            }
                        } else {
                            this.field1511 = var6;
                            this.field1508 = var5;
                            this.field1517 = var14;
                        }
                    } else {
                        this.field1511 = var6;
                        this.field1508 = var15;
                        this.field1517 = var5;
                    }
                } else {
                    this.field1511 = var14;
                    this.field1508 = var6;
                    this.field1517 = var5;
                }
            } else {
                this.field1517 = var15;
                this.field1508 = var6;
                this.field1511 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int[][] var3 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[][] var4 = this.method60(arg0, 0, 99);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class231.field3798 < ~var11; ++var11) {
                this.method698(var7[var11], 12288, var5[var11], var6[var11]);
                this.field1525 += this.field1524;
                for (this.field1527 += this.field1514; ~this.field1527 > -1; this.field1527 += 4096) {
                }
                this.field1529 += this.field1509;
                while (~this.field1527 < -4097) {
                    this.field1527 -= 4096;
                }
                if (this.field1525 < 0) {
                    this.field1525 = 0;
                }
                if (~this.field1529 > -1) {
                    this.field1529 = 0;
                }
                if (~this.field1525 < -4097) {
                    this.field1525 = 4096;
                }
                if (~this.field1529 < -4097) {
                    this.field1529 = 4096;
                }
                this.method690(true, this.field1525, this.field1529, this.field1527);
                var9[var11] = this.field1511;
                var10[var11] = this.field1517;
                var8[var11] = this.field1508;
            }
        }
        ++field1528;
        int var12 = -125 / ((arg1 - -48) / 46);
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILf;III)V")
    public static final void method691(int arg0, int arg1, int arg2, class36 arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 256) {
            field1519 = false;
        }
        int var7 = arg1 * arg1 + arg6 * arg6;
        ++field1510;
        if (var7 <= 360000) {
            int var8 = Math.min(arg3.field642 / 2, arg3.field676 / 2);
            if (var7 > var8 * var8) {
                int var9 = 2047 & class122.field1985 + class120.field1956;
                var8 -= 10;
                int var10 = class69.field1147[var9];
                int var11 = var10 * 256 / (class87.field1385 + 256);
                int var12 = class69.field1137[var9];
                int var13 = var12 * 256 / (class87.field1385 - -256);
                int var14 = arg1 * var11 - -(arg6 * var13) >> 16;
                int var15 = arg1 * var13 + -(arg6 * var11) >> 16;
                double var16 = Math.atan2((double) var14, (double) var15);
                int var18 = (int) (Math.sin(var16) * (double) var8);
                int var19 = (int) (Math.cos(var16) * (double) var8);
                ((class37) class76.field1227[arg0]).method318(arg4 - -(arg3.field642 / 2) - 10 + var18, arg3.field676 / 2 + arg2 + -var19 + -10, 20, 20, 15, 15, var16, 256);
            } else {
                class101.method745((byte) -2, arg2, arg6, class97.field1597[arg0], arg4, arg1, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)I")
    public static final int method692(byte arg0) {
        ++field1522;
        try {
            if (class162.field2587 == 0) {
                if (class276.method1861((byte) 122) - 5000L < class14.field246) {
                    return 0;
                }
                class16.field282 = class105.field1684.method1135(-126, class121.field1972, class143.field2308);
                class255.field4047 = class276.method1861((byte) 122);
                class162.field2587 = 1;
            }
            if (~class276.method1861((byte) 122) < ~(class255.field4047 + 30000L)) {
                return class52.method397(true, 1000);
            } else {
                if (class162.field2587 == 1) {
                    if (class16.field282.field2589 == 2) {
                        return class52.method397(true, 1001);
                    }
                    if (class16.field282.field2589 != 1) {
                        return -1;
                    }
                    class5.field69 = new class1((Socket) class16.field282.field2594, class105.field1684);
                    int var1 = 0;
                    if (class142.field2301) {
                        var1 = class226.field3747;
                    }
                    class68.field1113.field3655 = 0;
                    class16.field282 = null;
                    class68.field1113.method1548(-494964184, 23);
                    class68.field1113.method1529((byte) 117, var1);
                    class5.field69.method2(0, class68.field1113.field3653, -115, class68.field1113.field3655);
                    if (class74.field1203 != null) {
                        class74.field1203.method1191(2);
                    }
                    if (class13.field243 != null) {
                        class13.field243.method1191(2);
                    }
                    int var2 = class5.field69.method9(17335);
                    if (class74.field1203 != null) {
                        class74.field1203.method1191(2);
                    }
                    if (class13.field243 != null) {
                        class13.field243.method1191(2);
                    }
                    if (~var2 != -1) {
                        return class52.method397(true, var2);
                    }
                    class162.field2587 = 2;
                }
                if (class162.field2587 == 2) {
                    if (~class5.field69.method6(-127) > -3) {
                        return -1;
                    }
                    class233.field3816 = class5.field69.method9(17335);
                    class233.field3816 <<= 8;
                    class233.field3816 += class5.field69.method9(17335);
                    class162.field2587 = 3;
                    class13.field242 = 0;
                    class144.field2311 = new byte[class233.field3816];
                }
                int var3 = -30 % ((arg0 - -50) / 50);
                if (~class162.field2587 == -4) {
                    int var4 = class5.field69.method6(-127);
                    if (~var4 > -2) {
                        return -1;
                    } else {
                        if (var4 > -class13.field242 + class233.field3816) {
                            var4 = -class13.field242 + class233.field3816;
                        }
                        class5.field69.method4(var4, (byte) 68, class13.field242, class144.field2311);
                        class13.field242 += var4;
                        if (class233.field3816 > class13.field242) {
                            return -1;
                        } else if (!class82.method592(class144.field2311, (byte) 76)) {
                            return class52.method397(true, 1002);
                        } else {
                            class286.field4527 = new class78[class205.field3288];
                            int var5 = 0;
                            for (int var6 = class263.field4206; ~var6 >= ~class125.field2021; ++var6) {
                                class78 var7 = class136.method958(17771, var6);
                                if (var7 != null) {
                                    class286.field4527[var5++] = var7;
                                }
                            }
                            class5.field69.method7((byte) 18);
                            class144.field2311 = null;
                            class124.field2014 = 0;
                            class5.field69 = null;
                            class162.field2587 = 0;
                            class14.field246 = class276.method1861((byte) 122);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var8) {
            return class52.method397(true, 1003);
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)J")
    public static final long method693(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field2151; ++var4) {
                class289 var5 = var3.field2153[var4];
                if ((var5.field4574 >> 29 & 3L) == 2L && var5.field4567 == arg1 && var5.field4575 == arg2) {
                    return var5.field4574;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
    public static final void method694(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1516;
        if (~class252.field4019 == -2) {
            class40.field753[class39.field732 / 100].method332(class41.field771 + -8, class184.field2903 + -8);
        }
        if (~class252.field4019 == -3) {
            class40.field753[4 - -(class39.field732 / 100)].method332(class41.field771 + -8, class184.field2903 + -8);
        }
        class10.method77((byte) -125);
        if (arg0 != 100) {
            method695((byte) 87);
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)V")
    public static void method695(byte arg0) {
        if (arg0 < 41) {
            method695((byte) -13);
        }
        field1521 = null;
        field1520 = null;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
    public static final void method696(byte arg0) {
        ++field1513;
        int var1 = 0;
        int var2 = 0;
        if (arg0 != -112) {
            field1523 = 45;
        }
        while (~var2 > -105) {
            for (int var3 = 0; var3 < 104; ++var3) {
                if (class275.method1855(5373952, var2, class288.field4563, var3, true, var1)) {
                    ++var1;
                }
                if (~var1 <= -513) {
                    return;
                }
            }
            ++var2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1509 = (arg1.method1535((byte) -58) << 12) / 100;
                }
            } else {
                this.field1524 = (arg1.method1535((byte) -108) << 12) / 100;
            }
        } else {
            this.field1514 = arg1.method1550(47);
        }
        if (arg0 >= 62) {
            ++field1507;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method697(int arg0, boolean arg1) {
        ++field1515;
        if (~arg0 > -100001) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            if (!arg1) {
                method696((byte) -104);
            }
            return ~arg0 > -10000001 ? "<col=ffffff>" + arg0 / 1000 + class41.field756 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class34.field536 + "</col>";
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
    private final void method698(int arg0, int arg1, int arg2, int arg3) {
        ++field1512;
        int var5 = arg2 > arg0 ? arg0 : arg2;
        int var6 = arg3 < var5 ? arg3 : var5;
        if (arg1 == 12288) {
            int var7 = ~arg2 > ~arg0 ? arg0 : arg2;
            int var8 = arg3 > var7 ? arg3 : var7;
            int var9 = -var6 + var8;
            this.field1529 = (var6 + var8) / 2;
            if (this.field1529 > 0 && this.field1529 < 4096) {
                this.field1525 = (var9 << 12) / (this.field1529 <= 2048 ? this.field1529 * 2 : -(this.field1529 * 2) + 8192);
            } else {
                this.field1525 = 0;
            }
            if (var9 > 0) {
                int var10 = (-arg2 + var8 << 12) / var9;
                int var11 = (-arg0 + var8 << 12) / var9;
                int var12 = (-arg3 + var8 << 12) / var9;
                if (arg0 != var8) {
                    if (~arg2 == ~var8) {
                        this.field1527 = ~arg3 != ~var6 ? 12288 - var12 : var11 + 4096;
                    } else {
                        this.field1527 = ~arg0 == ~var6 ? var10 + 12288 : -var11 + 20480;
                    }
                } else {
                    this.field1527 = arg2 == var6 ? 20480 - -var12 : -var10 + 4096;
                }
                this.field1527 /= 6;
            } else {
                this.field1527 = 0;
            }
        }
    }
}
