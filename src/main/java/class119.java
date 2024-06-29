import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class119 extends class42 {

    @OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
    private int field2334;

    @OriginalMember(owner = "client!nb", name = "gb", descriptor = "I")
    private int field2332;

    @OriginalMember(owner = "client!nb", name = "rb", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    private int field2327;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "I")
    private int field2330;

    @OriginalMember(owner = "client!nb", name = "qb", descriptor = "Lgg;")
    private class62 field2342;

    @OriginalMember(owner = "client!nb", name = "ob", descriptor = "I")
    private int field2340;

    @OriginalMember(owner = "client!nb", name = "hb", descriptor = "I")
    private int field2333;

    @OriginalMember(owner = "client!nb", name = "jb", descriptor = "I")
    public static int field2335 = 7759444;

    @OriginalMember(owner = "client!nb", name = "nb", descriptor = "Lsd;")
    public static class166 field2339 = class135.method935("rect_debug=", 0);

    @OriginalMember(owner = "client!nb", name = "pb", descriptor = "Lsd;")
    private static class166 field2341 = class135.method935("RuneScape has been updated(Q", 0);

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "Lsd;")
    public static class166 field2331 = field2341;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "Lsc;")
    public static class165 field2329 = new class165();

    @OriginalMember(owner = "client!nb", name = "sb", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!nb", name = "tb", descriptor = "Lsd;")
    public static class166 field2345 = class135.method935("auf einer freien Welt zu spielen)3", 0);

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!nb", name = "kb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!nb", name = "lb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!nb", name = "mb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)Lo;")
    public final class126 method111(int arg0) {
        if (this.field2342 != null) {
            int var2 = class49.field910 - this.field2333;
            if (var2 > 100 && this.field2342.field1267 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (this.field2342.field1268[this.field2340] >= var2) {
                            break label51;
                        }
                        var2 -= this.field2342.field1268[this.field2340];
                        this.field2340++;
                    } while (this.field2340 < this.field2342.field1279.length);
                    this.field2340 -= this.field2342.field1267;
                } while (this.field2340 >= 0 && this.field2342.field1279.length > this.field2340);
                this.field2342 = null;
            }
            this.field2333 = class49.field910 - var2;
        }
        field2336++;
        class145 var3 = class170.method1185((byte) 112, this.field2343);
        if (var3.field2813 != null) {
            var3 = var3.method993(-11016);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field2332 == 1 || this.field2332 == 3) {
            var5 = var3.field2825;
            var4 = var3.field2832;
        } else {
            var4 = var3.field2825;
            var5 = var3.field2832;
        }
        int var6 = (var4 >> 1) + this.field2334;
        int var7 = (var5 >> 1) + this.field2327;
        int var8 = (var5 + 1 >> 1) + this.field2327;
        int var9 = (this.field2334 << 7) + (var4 << 6);
        int var10 = (var4 + 1 >> 1) + this.field2334;
        if (arg0 <= 8) {
            method863(35, (byte) 107);
        }
        int[][] var11 = class74.field1511[this.field2330];
        int var12 = (this.field2327 << 7) + (var5 << 6);
        int var13 = var11[var6][var7] + var11[var10][var7] + var11[var6][var8] + var11[var10][var8] >> 2;
        return var3.method1001(var9, var12, this.field2340, this.field2342, var11, this.field2328, var13, 4011, this.field2332);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public static void method861(byte arg0) {
        field2339 = null;
        if (arg0 > 104) {
            field2331 = null;
            field2345 = null;
            field2341 = null;
            field2329 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILud;)V")
    public static final void method862(int arg0, class184 arg1) {
        field2326++;
        if (arg1.field3528 == 0) {
            return;
        }
        if (arg1.field3497 != -1 && arg1.field3497 < 32768) {
            class154 var2 = class124.field2434[arg1.field3497];
            if (var2 != null) {
                int var3 = arg1.field3526 - var2.field3526;
                int var4 = arg1.field3513 - var2.field3513;
                if (var3 != 0 || var4 != 0) {
                    arg1.field3489 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3497 >= 32768) {
            int var5 = arg1.field3497 - 32768;
            if (class69.field1397 == var5) {
                var5 = 2047;
            }
            class123 var6 = class182.field3451[var5];
            if (var6 != null) {
                int var7 = arg1.field3526 - var6.field3526;
                int var8 = arg1.field3513 - var6.field3513;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3489 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3500 != 0 || arg1.field3484 != 0) && (arg1.field3514 == 0 || arg1.field3540 > 0)) {
            int var9 = arg1.field3526 - (arg1.field3500 - class170.field3279 - class170.field3279) * 64;
            int var10 = arg1.field3513 - (arg1.field3484 - class147.field2901 - class147.field2901) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field3489 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field3500 = 0;
            arg1.field3484 = 0;
        }
        if (arg0 != 13959) {
            return;
        }
        int var11 = arg1.field3489 - arg1.field3488 & 0x7FF;
        if (var11 == 0) {
            arg1.field3505 = 0;
            return;
        }
        arg1.field3505++;
        if (var11 > 1024) {
            arg1.field3488 -= arg1.field3528;
            boolean var12 = true;
            if (var11 < arg1.field3528 || var11 > 2048 - arg1.field3528) {
                arg1.field3488 = arg1.field3489;
                var12 = false;
            }
            if (arg1.field3507 == arg1.field3491 && (arg1.field3505 > 25 || var12)) {
                if (arg1.field3525 == -1) {
                    arg1.field3491 = arg1.field3508;
                } else {
                    arg1.field3491 = arg1.field3525;
                }
            }
        } else {
            arg1.field3488 += arg1.field3528;
            boolean var13 = true;
            if (var11 < arg1.field3528 || 2048 - arg1.field3528 < var11) {
                var13 = false;
                arg1.field3488 = arg1.field3489;
            }
            if (arg1.field3507 == arg1.field3491 && (arg1.field3505 > 25 || var13)) {
                if (arg1.field3492 == -1) {
                    arg1.field3491 = arg1.field3508;
                } else {
                    arg1.field3491 = arg1.field3492;
                }
            }
        }
        arg1.field3488 &= 0x7FF;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Lsd;")
    public static final class166 method863(int arg0, byte arg1) {
        field2337++;
        class166 var2 = class174.method1192(false, arg0);
        if (arg1 != 80) {
            method861((byte) 121);
        }
        for (int var3 = var2.method1143(true) - 3; var3 > 0; var3 -= 3) {
            var2 = class22.method148(new class166[] { var2.method1121(10876, var3, 0), class92.field1810, var2.method1155(var3, (byte) -72) }, 0);
        }
        if (var2.method1143(true) > 9) {
            return class22.method148(new class166[] { class202.field3996, var2.method1121(10876, var2.method1143(true) - 8, 0), class139.field2697, class51.field930, var2, class84.field1693 }, 0);
        } else if (var2.method1143(true) > 6) {
            return class22.method148(new class166[] { class4.field87, var2.method1121(10876, var2.method1143(true) - 4, 0), class100.field1910, class51.field930, var2, class84.field1693 }, arg1 - 80);
        } else {
            return class22.method148(new class166[] { class180.field3396, var2, class105.field2057 }, 0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIZ)I")
    public static final int method864(int arg0, int arg1, int arg2, boolean arg3) {
        field2338++;
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class122.field2387[1][var5][var4] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        if (!arg3) {
            field2339 = null;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var8) * class74.field1511[var6][var5][var4] + class74.field1511[var6][var5 + 1][var4] * var8 >> 7;
        int var10 = (128 - var8) * class74.field1511[var6][var5][var4 + 1] + class74.field1511[var6][var5 + 1][var4 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIZLed;)V")
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class42 arg8) {
        this.field2334 = arg4;
        this.field2332 = arg2;
        this.field2343 = arg0;
        this.field2327 = arg5;
        this.field2328 = arg1;
        this.field2330 = arg3;
        if (arg6 != -1) {
            this.field2342 = class110.method798(arg6, 12);
            this.field2340 = 0;
            this.field2333 = class49.field910 - 1;
            if (this.field2342.field1276 == 0 && arg8 != null && arg8 instanceof class119) {
                class119 var10 = (class119) arg8;
                if (this.field2342 == var10.field2342) {
                    this.field2340 = var10.field2340;
                    this.field2333 = var10.field2333;
                    return;
                }
            }
            if (arg7 && this.field2342.field1267 != -1) {
                this.field2340 = (int) ((double) this.field2342.field1279.length * Math.random());
                this.field2333 -= (int) ((double) this.field2342.field1268[this.field2340] * Math.random());
                return;
            }
        }
    }
}
