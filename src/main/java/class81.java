import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class81 extends class167 {

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    private int field1521 = 0;

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
    private int field1528 = 1;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    private int field1515 = 0;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "Lkh;")
    private static class117 field1517 = class224.method1450((byte) 115, "Tue");

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "Lkh;")
    private static class117 field1514 = class224.method1450((byte) 127, "Continue");

    @OriginalMember(owner = "client!hd", name = "mb", descriptor = "Lkh;")
    private static class117 field1530 = class224.method1450((byte) -89, "Fri");

    @OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lkh;")
    private static class117 field1532 = class224.method1450((byte) 125, "Thu");

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "[S")
    public static short[] field1524 = new short[] { 47, 32, 29, 6, 13, 48, 4, 16 };

    @OriginalMember(owner = "client!hd", name = "pb", descriptor = "Lkh;")
    private static class117 field1533 = class224.method1450((byte) -10, "Mon");

    @OriginalMember(owner = "client!hd", name = "sb", descriptor = "Lkh;")
    private static class117 field1536 = class224.method1450((byte) 18, "Wed");

    @OriginalMember(owner = "client!hd", name = "lb", descriptor = "Lkh;")
    private static class117 field1529 = class224.method1450((byte) -93, "Sat");

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lkh;")
    private static class117 field1518 = class224.method1450((byte) 113, "Sun");

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lkh;")
    public static class117 field1520 = field1514;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "[Lkh;")
    public static class117[] field1519 = new class117[] { field1518, field1533, field1517, field1536, field1532, field1530, field1529 };

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!hd", name = "qb", descriptor = "Lkh;")
    private static class117 field1534 = class224.method1450((byte) -75, "flash2:");

    @OriginalMember(owner = "client!hd", name = "ub", descriptor = "I")
    public static int field1538 = -1;

    @OriginalMember(owner = "client!hd", name = "rb", descriptor = "Lkh;")
    public static class117 field1535 = class224.method1450((byte) 106, "(U0a )2 via: ");

    @OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lkh;")
    public static class117 field1537 = field1534;

    @OriginalMember(owner = "client!hd", name = "vb", descriptor = "Lkh;")
    public static class117 field1539 = class224.method1450((byte) 109, "null");

    @OriginalMember(owner = "client!hd", name = "nb", descriptor = "Lkh;")
    public static class117 field1531 = field1534;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field1526;
        if (arg0 != -96) {
            field1530 = null;
        }
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int var4 = class143.field2583[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class115.field2146 < ~var6; ++var6) {
                int var7 = class70.field1350[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (~this.field1515 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1528 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field1528;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field1521 != 0) {
                    if (~this.field1521 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class128.field2361[255 & var12 >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)Lpj;")
    public static final class174 method555(int arg0, byte arg1) {
        ++field1523;
        class174 var2 = (class174) class130.field2386.method506(1, (long) arg0);
        int var3 = -46 % ((-31 - arg1) / 48);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var4 = class79.field1492.method104(-74, class157.method1117(arg0, -12192), class119.method833(arg0, -31184));
            class174 var5 = new class174();
            if (var4 != null) {
                var5.method1215(3521, new class145(var4));
            }
            var5.method1217(15);
            class130.field2386.method497((long) arg0, var5, -110);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLkh;Lkh;Lai;)[Lch;")
    public static final class31[] method556(byte arg0, class117 arg1, class117 arg2, class10 arg3) {
        ++field1522;
        int var4 = arg3.method84(arg2, arg0 + 1506);
        if (arg0 != -15) {
            method559(false);
        }
        int var5 = arg3.method102(false, arg1, var4);
        return class33.method285(var5, arg3, false, var4);
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public static final void method557(int arg0) {
        ++field1527;
        if (~class20.field554 >= -1) {
            if (~class232.field4178 < -1) {
                for (int var1 = 0; ~var1 > -257; ++var1) {
                    if (class232.field4178 > 768) {
                        class137.field2481[var1] = class199.method1322(-class232.field4178 + 1024, class80.field1510[var1], class194.field3458[var1], 256);
                    } else if (~class232.field4178 < -257) {
                        class137.field2481[var1] = class194.field3458[var1];
                    } else {
                        class137.field2481[var1] = class199.method1322(256 - class232.field4178, class194.field3458[var1], class80.field1510[var1], 256);
                    }
                }
            } else {
                for (int var2 = 0; ~var2 > -257; ++var2) {
                    class137.field2481[var2] = class80.field1510[var2];
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (class20.field554 <= 768) {
                    if (~class20.field554 < -257) {
                        class137.field2481[var3] = class182.field3287[var3];
                    } else {
                        class137.field2481[var3] = class199.method1322(-class20.field554 + 256, class182.field3287[var3], class80.field1510[var3], 256);
                    }
                } else {
                    class137.field2481[var3] = class199.method1322(-class20.field554 + 1024, class80.field1510[var3], class182.field3287[var3], 256);
                }
            }
        }
        short var4 = 256;
        int var5 = -74 % ((arg0 - 35) / 62);
        int var6 = class8.field139.field731 * 9;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 1; ~var9 > ~(var4 + -1); ++var9) {
            int var22 = (-var9 + var4) * class49.field1034[var9] / var4 + 22;
            if (var22 < 0) {
                var22 = 0;
            }
            var7 += var22;
            for (int var23 = var22; var23 < 128; ++var23) {
                int var25 = class8.field139.field2602[var6++];
                int var26 = class98.field1800[var7++];
                if (~var26 != -1) {
                    int var28 = 256 - var26;
                    int var29 = class137.field2481[var26];
                    class90.field1679.field2602[var8++] = class209.method1370(16711680, var26 * class209.method1370(var29, 65280) - -(var28 * class209.method1370(65280, var25))) + class209.method1370(var26 * class209.method1370(var29, 16711935) + class209.method1370(16711935, var25) * var28, -16711936) >> 8;
                } else {
                    class90.field1679.field2602[var8++] = var25;
                }
            }
            for (int var24 = 0; var22 > var24; ++var24) {
                class90.field1679.field2602[var8++] = class8.field139.field2602[var6++];
            }
            var6 += class8.field139.field731 + -128;
        }
        int var10 = 0;
        class90.field1679.method275(0, 9);
        int var11 = 0;
        int var12 = class8.field139.field731 * 9 + 128;
        for (int var13 = 1; var13 < var4 - 1; ++var13) {
            int var14 = (-var13 + var4) * class49.field1034[var13] / var4 + 22;
            if (~var14 > -1) {
                var14 = 0;
            }
            for (int var15 = 0; ~var14 < ~var15; ++var15) {
                int var10001 = var10++;
                --var12;
                class104.field1908.field2602[var10001] = class8.field139.field2602[var12];
            }
            for (int var16 = var14; ~var16 > -129; ++var16) {
                int var17 = class98.field1800[var11++];
                --var12;
                int var18 = class8.field139.field2602[var12];
                if (~var17 == -1) {
                    class104.field1908.field2602[var10++] = var18;
                } else {
                    int var20 = -var17 + 256;
                    int var21 = class137.field2481[var17];
                    class104.field1908.field2602[var10++] = class209.method1370(var17 * class209.method1370(65280, var21) - -(var20 * class209.method1370(var18, 65280)), 16711680) + class209.method1370(-16711936, var17 * class209.method1370(var21, 16711935) - -(var20 * class209.method1370(16711935, var18))) >> 8;
                }
            }
            var11 += var14;
            var12 += class8.field139.field731 + 128;
        }
        class104.field1908.method275(637, 9);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BI)Lgb;")
    public static final class69 method558(byte arg0, int arg1) {
        ++field1511;
        class69 var2 = (class69) class228.field4116.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class102.field1864.method104(arg0 ^ 28, 3, arg1);
            class69 var4 = new class69();
            if (var3 != null) {
                var4.method484(new class145(var3), -6398);
            }
            if (arg0 != -12) {
                field1530 = null;
            }
            class228.field4116.method497((long) arg1, var4, arg0 + -109);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static void method559(boolean arg0) {
        if (!arg0) {
            method556((byte) -63, (class117) null, (class117) null, (class10) null);
        }
        field1534 = null;
        field1539 = null;
        field1532 = null;
        field1517 = null;
        field1537 = null;
        field1520 = null;
        field1519 = null;
        field1529 = null;
        field1535 = null;
        field1536 = null;
        field1533 = null;
        field1524 = null;
        field1531 = null;
        field1530 = null;
        field1518 = null;
        field1514 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field1525;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field1528 = arg0.method998(67);
                }
            } else {
                this.field1521 = arg0.method998(57);
            }
        } else {
            this.field1515 = arg0.method998(88);
        }
        if (arg1) {
            method555(5, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        int var2 = 36 % ((-18 - arg0) / 59);
        ++field1513;
        class212.method1395((byte) 92);
    }
}
