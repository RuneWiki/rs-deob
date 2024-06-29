import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class33 extends class95 {

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Led;")
    public class187 field419 = new class187();

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Ljj;")
    public class107 field426 = new class107();

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Ldc;")
    private class243 field412;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field425 = 0;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "[[[B")
    public static byte[][][] field417;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public static final void method242(int arg0, int arg1) {
        if (arg0 != 262144) {
            field417 = null;
        }
        field410++;
        class216.field3426.method1548(arg1, 0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILoe;)V")
    private final void method243(int arg0, int arg1, class145 arg2) {
        field424++;
        if ((this.field412.field3893[arg2.field2369] & 0x4) != 0 && arg2.field2373 < 0) {
            int var4 = this.field412.field3888[arg2.field2369] / class28.field329;
            int var5 = (var4 + 1048575 - arg2.field2366) / var4;
            arg2.field2366 = arg1 * var4 + arg2.field2366 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field412.field3885[arg2.field2369] == 0) {
                    arg2.field2357 = class89.method703(arg2.field2365, arg2.field2357.method691(), arg2.field2357.method675(), arg2.field2357.method701());
                } else {
                    arg2.field2357 = class89.method703(arg2.field2365, arg2.field2357.method691(), 0, arg2.field2357.method701());
                    this.field412.method1734(arg2.field2363.field1521[arg2.field2350] < 0, false, arg2);
                }
                if (arg2.field2363.field1521[arg2.field2350] < 0) {
                    arg2.field2357.method704(-1);
                }
                arg1 = arg2.field2366 / var4;
            }
        }
        if (arg0 != 1048575) {
            method242(56, 7);
        }
        arg2.field2357.method245(arg1);
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    public static void method244(int arg0) {
        field417 = null;
        if (arg0 != 64) {
            method247((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public final void method245(int arg0) {
        field408++;
        this.field426.method245(arg0);
        for (class145 var2 = (class145) this.field419.method1384(2); var2 != null; var2 = (class145) this.field419.method1388((byte) 98)) {
            if (!this.field412.method1721(var2, (byte) 58)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2362) {
                        this.method243(1048575, var3, var2);
                        var2.field2362 -= var3;
                        break;
                    }
                    this.method243(1048575, var2.field2362, var2);
                    var3 -= var2.field2362;
                } while (!this.field412.method1733(var2, (int[]) null, 0, var3, -5604));
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([ILbe;[II[I)V")
    public static final void method246(int[] arg0, class29 arg1, int[] arg2, int arg3, int[] arg4) {
        field427++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var6 != 0 && var9 < arg1.field1889.length; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field1889[var9] = null;
                    } else {
                        class141 var10 = class285.method1939(var7, 112);
                        int var11 = var10.field2273;
                        class124 var12 = arg1.field1889[var9];
                        if (var12 != null) {
                            if (var12.field1818 == var7) {
                                if (var11 == 0) {
                                    var12 = arg1.field1889[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1819 = var8;
                                    var12.field1808 = 1;
                                    var12.field1807 = 0;
                                    var12.field1809 = 0;
                                    var12.field1814 = 0;
                                    class263.method1845(0, arg1.field1910, class186.field2993 == arg1, arg1.field1979, (byte) -109, var10);
                                } else if (var11 == 2) {
                                    var12.field1814 = 0;
                                }
                            } else if (var10.field2278 >= class285.method1939(var12.field1818, 112).field2278) {
                                var12 = arg1.field1889[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class124 var13 = arg1.field1889[var9] = new class124();
                            var13.field1809 = 0;
                            var13.field1808 = 1;
                            var13.field1819 = var8;
                            var13.field1814 = 0;
                            var13.field1807 = 0;
                            var13.field1818 = var7;
                            class263.method1845(0, arg1.field1910, class186.field2993 == arg1, arg1.field1979, (byte) -91, var10);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
        if (arg3 < 123) {
            field425 = -112;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method247(byte arg0) {
        if (arg0 != 123) {
            return null;
        }
        String var1;
        if (class63.field941 == 1 && class243.field3890 < 2) {
            var1 = class146.field2391 + class180.field2900 + class297.field4709 + " ->";
        } else if (class131.field2131 && class243.field3890 < 2) {
            var1 = class293.field4659 + class180.field2900 + class77.field1117 + " ->";
        } else if (class171.field2761 && class285.field4512[81] && class243.field3890 > 2) {
            var1 = class188.method1401(2, class243.field3890 - 2);
        } else {
            var1 = class188.method1401(2, class243.field3890 - 1);
        }
        if (class243.field3890 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class243.field3890 - 2) + class12.field143;
        }
        field418++;
        return var1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([III)V")
    public final void method248(int[] arg0, int arg1, int arg2) {
        this.field426.method248(arg0, arg1, arg2);
        field420++;
        for (class145 var4 = (class145) this.field419.method1384(2); var4 != null; var4 = (class145) this.field419.method1388((byte) 98)) {
            if (!this.field412.method1721(var4, (byte) 58)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2362) {
                        this.method256(var4, var5, var6, arg0, -3, var5 + var6);
                        var4.field2362 -= var6;
                        break;
                    }
                    this.method256(var4, var5, var4.field2362, arg0, -3, var5 + var6);
                    var5 += var4.field2362;
                    var6 -= var4.field2362;
                } while (!this.field412.method1733(var4, arg0, var5, var6, -5604));
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()Lcf;")
    public final class95 method249() {
        field416++;
        class145 var1;
        do {
            var1 = (class145) this.field419.method1388((byte) 95);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2357 == null);
        return var1.field2357;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()Lcf;")
    public final class95 method250() {
        field411++;
        class145 var1 = (class145) this.field419.method1384(2);
        if (var1 == null) {
            return null;
        } else if (var1.field2357 == null) {
            return this.method249();
        } else {
            return var1.field2357;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
    public static final void method251(int arg0, int arg1, int arg2, int arg3) {
        class286 var4 = class220.field3525[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class156 var5 = var4.field4532;
        if (var5 != null) {
            var5.field2568 = var5.field2568 * arg3 / 16;
            var5.field2573 = var5.field2573 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
    public static final void method252(int arg0, byte arg1) {
        for (class280 var2 = class190.field3062.method1033(-9843); var2 != null; var2 = class190.field3062.method1031((byte) -7)) {
            if ((var2.field4459 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1922(-1);
            }
        }
        field421++;
        int var3 = 2 / ((-arg1 - 20) / 32);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()I")
    public final int method253() {
        field422++;
        return 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIBII)V")
    public static final void method254(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class272.field4374 <= arg3 - arg1 && arg1 + arg3 <= class211.field3386 && (arg0 - arg1) >= class207.field3328 && class228.field3657 >= arg0 + arg1) {
            class244.method1744(arg3, arg1, arg4, (byte) -28, arg0);
        } else {
            class266.method1854(arg4, arg3, false, arg0, arg1);
        }
        field413++;
        if (arg2 < 102) {
            field417 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
    public static final void method255(byte arg0) {
        int var1 = class200.field3214.length;
        if (arg0 != -19) {
            field417 = null;
        }
        field423++;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class200.field3214[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class110.field1587; var4++) {
                    if (class286.field4548[var2] == class24.field279[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class24.field279[class110.field1587] = class286.field4548[var2];
                    var3 = class110.field1587++;
                }
                class152 var5 = new class152(class200.field3214[var2]);
                int var6 = 0;
                while (class200.field3214[var2].length > var5.field2511 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1126(false);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = (class286.field4548[var2] & 0xFF) * 64 + var9 - class99.field1465;
                    int var12 = (class286.field4548[var2] >> 8) * 64 + var10 - class282.field4487;
                    int var13 = var8 >> 14;
                    class245 var14 = class234.method1657(0, var5.method1126(false));
                    if (class169.field2730[var7] == null && (var14.field3989 & 0x1) > 0 && class11.field134 == var13 && var12 >= 0 && var14.field3997 + var12 < 104 && var11 >= 0 && var14.field3997 + var11 < 104) {
                        class169.field2730[var7] = new class18();
                        class18 var15 = class169.field2730[var7];
                        class39.field556[class21.field235++] = var7;
                        var15.field1977 = class264.field4290;
                        var15.method122(-3662, var14);
                        var15.method923(var15.field205.field3997, false);
                        var15.field1928 = var15.field1893 = class63.field942[var15.field205.field4023];
                        var15.field1940 = var15.field205.field4015;
                        var15.field1927 = var15.field205.field4008;
                        if (var15.field1940 == 0) {
                            var15.field1893 = 0;
                        }
                        var15.method925(0, var12, var11, true, var15.method205(arg0 - 63));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ldc;)V")
    public class33(class243 arg0) {
        this.field412 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Loe;II[III)V")
    private final void method256(class145 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field415++;
        if ((this.field412.field3893[arg0.field2369] & 0x4) != 0 && arg0.field2373 < 0) {
            int var7 = this.field412.field3888[arg0.field2369] / class28.field329;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field2366) / var7;
                if (var8 > arg2) {
                    arg0.field2366 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg0.field2357.method248(arg3, arg1, var8);
                arg1 += var8;
                int var9 = class28.field329 / 100;
                arg0.field2366 += var7 * var8 - 1048576;
                class89 var10 = arg0.field2357;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field412.field3885[arg0.field2369] == 0) {
                    arg0.field2357 = class89.method703(arg0.field2365, var10.method691(), var10.method675(), var10.method701());
                } else {
                    arg0.field2357 = class89.method703(arg0.field2365, var10.method691(), 0, var10.method701());
                    this.field412.method1734(arg0.field2363.field1521[arg0.field2350] < 0, false, arg0);
                    arg0.field2357.method671(var9, var10.method675());
                }
                if (arg0.field2363.field1521[arg0.field2350] < 0) {
                    arg0.field2357.method704(-1);
                }
                var10.method709(var9);
                var10.method248(arg3, arg1, arg5 - arg1);
                if (var10.method689()) {
                    this.field426.method793(var10);
                }
            }
        }
        if (arg4 == -3) {
            arg0.field2357.method248(arg3, arg1, arg2);
        }
    }
}
