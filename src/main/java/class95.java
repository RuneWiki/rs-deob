import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class95 extends class153 {

    @OriginalMember(owner = "client!ch", name = "Kb", descriptor = "Luf;")
    private static class168 field1514 = class148.method1019(-1720, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!ch", name = "Lb", descriptor = "I")
    public static int field1515 = 0;

    @OriginalMember(owner = "client!ch", name = "Rb", descriptor = "I")
    public static int field1521 = -1;

    @OriginalMember(owner = "client!ch", name = "Nb", descriptor = "Luf;")
    public static class168 field1517 = class148.method1019(-1720, ":");

    @OriginalMember(owner = "client!ch", name = "Tb", descriptor = "I")
    public static int field1523 = -1;

    @OriginalMember(owner = "client!ch", name = "Yb", descriptor = "Luf;")
    public static class168 field1528 = field1514;

    @OriginalMember(owner = "client!ch", name = "Fb", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ch", name = "Gb", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ch", name = "Hb", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ch", name = "Ib", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ch", name = "Jb", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ch", name = "Ob", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ch", name = "Pb", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!ch", name = "Qb", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client!ch", name = "Sb", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!ch", name = "Ub", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ch", name = "Vb", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ch", name = "Wb", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ch", name = "Xb", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!ch", name = "Zb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ch", name = "Mb", descriptor = "Lpe;")
    private class68 field1516;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "(I)I", line = 8)
    public final int method715(int arg0) {
        field1522++;
        return arg0 == 0 ? this.field2359[this.field2367++] - this.field1516.method384(-11164) & 0xFF : -8;
    }

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "(B)V", line = 21)
    public final void method716(byte arg0) {
        this.field2367 = (this.field1520 + 7) / 8;
        field1524++;
        if (arg0 >= -2) {
            method721(-99, 31, -94, 120, -89, 35, (class231) null, -36, 68L);
        }
    }

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "(II)I", line = 36)
    public final int method717(int arg0, int arg1) {
        if (arg0 != 11154) {
            this.method728(31, 109);
        }
        field1529++;
        return arg1 * 8 - this.field1520;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V", line = 51)
    public final void method718(boolean arg0) {
        this.field1520 = this.field2367 * 8;
        if (arg0) {
            field1521 = 74;
        }
        field1519++;
    }

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "(B)V", line = 66)
    public static final void method719(byte arg0) {
        field1512++;
        if (!class121.field1888) {
            class61.field804[0] = 1006;
            class224.field3625[0] = class122.field1896;
            class274.field4606[0] = class182.field2934;
            class22.field275 = 1;
            if (class211.field3471 != 0) {
                class166.field2661 = class25.field310;
                class301.field5093 = class187.field2955;
            } else if (class106.field1634 == 0) {
                class301.field5093 = class262.field4442;
                class166.field2661 = class155.field2457;
            } else {
                class166.field2661 = class83.field1244;
                class301.field5093 = class206.field3384;
            }
        }
        if (class19.field221 != -1) {
            class12.method45(-1, class19.field221);
        }
        for (int var1 = 0; var1 < class227.field3685; var1++) {
            if (class214.field3495[var1]) {
                class131.field2028[var1] = true;
            }
            class216.field3518[var1] = class214.field3495[var1];
            class214.field3495[var1] = false;
        }
        class72.field962 = null;
        class99.field1551 = -1;
        class183.field2940 = -1;
        class226.field3677 = true;
        class127.field1976 = class203.field3335;
        if (class19.field221 != -1) {
            class227.field3685 = 0;
            class183.method1301(class14.field142, 0, -1, class299.field5069, 0, class19.field221, 0, (byte) 80, 0);
        }
        class228.method1559();
        int var2 = -55 / ((arg0 + 52) / 53);
        class117.method846(false);
        if (class121.field1888) {
            class79.method487(false);
        } else if (class183.field2940 != -1) {
            class44.method241(-31476, class99.field1551, class183.field2940);
        }
        if (class254.field4348 == 3) {
            for (int var3 = 0; var3 < class227.field3685; var3++) {
                if (class216.field3518[var3]) {
                    class228.method1554(class204.field3346[var3], class256.field4357[var3], class69.field915[var3], class82.field1168[var3], 16711935, 128);
                } else if (class131.field2028[var3]) {
                    class228.method1554(class204.field3346[var3], class256.field4357[var3], class69.field915[var3], class82.field1168[var3], 16711680, 128);
                }
            }
        }
        class238.method1616(class266.field4489.field3021, class274.field4619, class79.field1127, (byte) 104, class266.field4489.field3027);
        class274.field4619 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "(II)I", line = 179)
    public static final int method720(int arg0, int arg1) {
        double var2 = (double) (arg0 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF7AC8) >> 16) / 256.0D;
        field1526++;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = var4;
        double var10 = var4;
        if (var6 < var4) {
            var10 = var6;
        }
        double var12 = 0.0D;
        if (var4 < var6) {
            var8 = var6;
        }
        if (var2 > var8) {
            var8 = var2;
        }
        double var14 = (double) arg1;
        if (var10 > var2) {
            var10 = var2;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var4 == var8) {
                var12 = (var6 - var2) / (var8 - var10);
            } else if (var6 == var8) {
                var12 = (var2 - var4) / (var8 - var10) + 2.0D;
            } else if (var2 == var8) {
                var12 = (var4 - var6) / (var8 - var10) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var8 - var10) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        int var18 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var19 = (int) (var14 * 256.0D);
        double var20 = var12 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        return (var18 >> 1) + ((var22 >> 2 << 10) + (var19 >> 5 << 7));
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V", line = 281)
    public class95(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIILf;IJ)Z", line = 298)
    public static final boolean method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class231 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class150.method1033(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "(I)V", line = 314)
    public static final void method722(int arg0) {
        if (arg0 != 255) {
            field1517 = (class168) null;
        }
        field1513++;
        if (!class111.field1740) {
            return;
        }
        class242 var1 = class263.method1834(class280.field4710, 2, class156.field2466);
        if (var1 != null && var1.field4088 != null) {
            class182 var2 = new class182();
            var2.field2928 = var1;
            var2.field2919 = var1.field4088;
            class177.method1270(var2, (byte) -11);
        }
        class111.field1740 = false;
        client.method2011((byte) -59, var1);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([IB)V", line = 342)
    public final void method723(int[] arg0, byte arg1) {
        if (arg1 == 0) {
            this.field1516 = new class68(arg0);
            field1518++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "(I)V", line = 354)
    public static void method724(int arg0) {
        field1528 = null;
        if (arg0 != 4) {
            method720(-5, 72);
        }
        field1517 = null;
        field1514 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[B)V", line = 375)
    public final void method725(int arg0, int arg1, int arg2, byte[] arg3) {
        field1527++;
        for (int var5 = arg1; var5 < arg0; var5++) {
            arg3[arg2 + var5] = (byte) (this.field2359[this.field2367++] - this.field1516.method384(-11164));
        }
    }

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "(II)V", line = 389)
    public final void method726(int arg0, int arg1) {
        if (arg1 == 2138389379) {
            this.field2359[this.field2367++] = (byte) (this.field1516.method384(-11164) + arg0);
            field1511++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(BI)V", line = 400)
    public static final void method727(byte arg0, int arg1) {
        field1509++;
        if (arg0 > 45) {
            class53.field656.method1428(arg1, 29946);
        }
    }

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "(II)I", line = 415)
    public final int method728(int arg0, int arg1) {
        field1510++;
        if (arg1 != 20544) {
            return 28;
        }
        int var3 = 8 - (this.field1520 & 0x7);
        int var4 = 0;
        int var5 = this.field1520 >> 3;
        this.field1520 += arg0;
        while (var3 < arg0) {
            var4 += (class271.field4557[var3] & this.field2359[var5++]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (class271.field4557[var3] & this.field2359[var5]) + var4;
        } else {
            var6 = (this.field2359[var5] >> var3 - arg0 & class271.field4557[arg0]) + var4;
        }
        return var6;
    }
}
