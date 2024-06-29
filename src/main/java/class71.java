import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class71 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field1491 = 0;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field1504 = 3353893;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Lo;")
    public static class84 field1506 = class15.method124("Your ignore list is full)3 Max of 100 hit", 255);

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Lo;")
    public static class84 field1508 = class15.method124("headicons_prayer", 255);

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Lo;")
    public static class84 field1509 = class15.method124("Loading title screen )2 ", 255);

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Lo;")
    public static class84 field1510 = class15.method124("Icons redrawn", 255);

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lo;")
    public static class84 field1493 = class15.method124("@bla@ from: @red@", 255);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "J")
    private long field1486;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "J")
    private long field1490;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Z")
    public boolean field1511;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[I")
    private int[] field1494;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "[I")
    private int[] field1500;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[[[B")
    public static byte[][][] field1495;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 5)
    public static final void method523(int arg0) {
        field1503++;
        class64.field1342++;
        class97.field2070.method979(1, 255);
        if (class78.field1657 != -1) {
            class101.method762(256, class78.field1657);
            class39.field798 = true;
            class25.field438 = false;
            class27.field522 = true;
            class78.field1657 = -1;
        }
        if (class104.field2202 != -1) {
            class101.method762(256, class104.field2202);
            class25.field438 = false;
            class104.field2202 = -1;
            class85.field1927 = true;
        }
        if (class103.field2165 != -1) {
            class101.method762(256, class103.field2165);
            class103.field2165 = -1;
            class8.method63(30, false);
        }
        if (class112.field2422 != -1) {
            class101.method762(256, class112.field2422);
            class112.field2422 = -1;
        }
        if (class27.field528 != -1) {
            class101.method762(256, class27.field528);
            class27.field528 = -1;
        }
        int var1 = -71 / ((-arg0 - 8) / 53);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)Lne;", line = 59)
    public final class83 method524(int arg0) {
        field1489++;
        if (this.field1505 != arg0) {
            return class42.method366(111, this.field1505).method351(-2);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1500[var3];
            if (var12 >= 256 && var12 < 512 && !class110.method855(true, var12 - 256).method930(124)) {
                var2 = true;
            }
            if (var12 >= 512 && !class126.method970(-77, var12 - 512).method375(this.field1511, arg0)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        int var4 = 0;
        class83[] var5 = new class83[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1500[var6];
            if (var9 >= 256 && var9 < 512) {
                class83 var10 = class110.method855(true, var9 - 256).method931(arg0 ^ 0x27);
                if (var10 != null) {
                    var5[var4++] = var10;
                }
            }
            if (var9 >= 512) {
                class83 var11 = class126.method970(120, var9 - 512).method379(this.field1511, 124);
                if (var11 != null) {
                    var5[var4++] = var11;
                }
            }
        }
        class83 var7 = new class83(var5, var4);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1494[var8] != 0) {
                var7.method610(class11.field218[var8][0], class11.field218[var8][this.field1494[var8]]);
                if (var8 == 1) {
                    var7.method610(class116.field2532[0], class116.field2532[this.field1494[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)Lvb;", line = 159)
    public static final class121 method525(int arg0, int arg1, int arg2, int arg3) {
        field1496++;
        if (arg0 == 0) {
            class121 var4 = (class121) class31.field623.method737((long) arg2, (byte) -96);
            if (var4 != null && var4.field2706 != arg1 && var4.field2706 != -1) {
                var4.method333(arg3 + 27287);
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        class44 var5 = class126.method970(56, arg2);
        if (var5.field929 == null) {
            arg1 = -1;
        }
        if (arg3 != -27287) {
            return null;
        }
        if (arg1 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg1 >= var5.field893[var7] && var5.field893[var7] != 0) {
                    var6 = var5.field929[var7];
                }
            }
            if (var6 != -1) {
                var5 = class126.method970(96, var6);
            }
        }
        class83 var8 = var5.method378(-10, 1, true);
        if (var8 == null) {
            return null;
        }
        class121 var9 = null;
        if (var5.field895 != -1) {
            var9 = method525(-1, 10, var5.field927, -27287);
            if (var9 == null) {
                return null;
            }
        }
        int[] var10 = class7.method43();
        int var11 = class32.field638;
        int[] var12 = class32.field639;
        int var13 = class32.field633;
        int var14 = class32.field635;
        int var15 = class32.field637;
        int var16 = class32.field634;
        int var17 = class32.field636;
        class121 var18 = new class121(32, 32);
        class32.method282(var18.field2705, 32, 32);
        class55.field1140 = class7.method51(class55.field1140);
        class32.method290(0, 0, 32, 32, 0);
        class7.field127 = false;
        int var19 = var5.field885;
        if (arg0 == -1) {
            var19 = (int) ((double) var19 * 1.5D);
        }
        if (arg0 > 0) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class7.field124[var5.field918] * var19 >> 16;
        int var21 = class7.field128[var5.field918] * var19 >> 16;
        var8.method605();
        var8.method621(0, var5.field873, var5.field901, var5.field918, var5.field912, var8.field1207 / 2 + var5.field932 + var21, var5.field932 + var20);
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var29 = 31; var29 >= 0; var29--) {
                if (var18.field2705[var29 * 32 + var22] == 0) {
                    if (var22 > 0 && var18.field2705[var29 * 32 + var22 - 1] > 1) {
                        var18.field2705[var29 * 32 + var22] = 1;
                    } else if (var29 > 0 && var18.field2705[var29 * 32 + var22 - 32] > 1) {
                        var18.field2705[var29 * 32 + var22] = 1;
                    } else if (var22 < 31 && var18.field2705[var22 + var29 * 32 + 1] > 1) {
                        var18.field2705[var29 * 32 + var22] = 1;
                    } else if (var29 < 31 && var18.field2705[var29 * 32 + var22 + 32] > 1) {
                        var18.field2705[var29 * 32 + var22] = 1;
                    }
                }
            }
        }
        if (arg0 > 0) {
            for (int var23 = 31; var23 >= 0; var23--) {
                for (int var24 = 31; var24 >= 0; var24--) {
                    if (var18.field2705[var24 * 32 + var23] == 0) {
                        if (var23 > 0 && var18.field2705[var24 * 32 + var23 - 1] == 1) {
                            var18.field2705[var24 * 32 + var23] = arg0;
                        } else if (var24 > 0 && var18.field2705[(var24 - 1) * 32 + var23] == 1) {
                            var18.field2705[var24 * 32 + var23] = arg0;
                        } else if (var23 < 31 && var18.field2705[var24 * 32 + var23 + 1] == 1) {
                            var18.field2705[var24 * 32 + var23] = arg0;
                        } else if (var24 < 31 && var18.field2705[var24 * 32 + var23 + 32] == 1) {
                            var18.field2705[var24 * 32 + var23] = arg0;
                        }
                    }
                }
            }
        } else if (arg0 == 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var18.field2705[var26 * 32 + var25] == 0 && var25 > 0 && var26 > 0 && var18.field2705[var26 * 32 + var25 - 32 - 1] > 0) {
                        var18.field2705[var26 * 32 + var25] = 3153952;
                    }
                }
            }
        }
        if (var5.field895 != -1) {
            int var27 = var9.field2708;
            int var28 = var9.field2706;
            var9.field2706 = 32;
            var9.field2708 = 32;
            var9.method947(0, 0);
            var9.field2706 = var28;
            var9.field2708 = var27;
        }
        if (arg0 == 0) {
            class31.field623.method744(arg3 + 27165, (long) arg2, var18);
        }
        class32.method282(var12, var11, var13);
        class32.method291(var14, var15, var16, var17);
        class7.method51(var10);
        class7.field127 = true;
        if (var5.field920) {
            var18.field2708 = 33;
        } else {
            var18.field2708 = 32;
        }
        var18.field2706 = arg1;
        return var18;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z[II[IB)V", line = 397)
    public final void method526(boolean arg0, int[] arg1, int arg2, int[] arg3, byte arg4) {
        field1499++;
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class123.field2760; var7++) {
                    class119 var8 = class110.method855(true, var7);
                    if (var8 != null && !var8.field2636 && var8.field2632 == var6 + (arg0 ? 7 : 0)) {
                        arg3[class41.field829[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1511 = arg0;
        this.field1494 = arg1;
        this.field1505 = arg2;
        if (arg4 != 86) {
            this.field1494 = null;
        }
        this.field1500 = arg3;
        this.method533(0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)V", line = 443)
    public final void method527(boolean arg0, boolean arg1) {
        if (arg1) {
            field1495 = null;
        }
        field1498++;
        if (this.field1511 != arg0) {
            this.method526(arg0, this.field1494, -1, null, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 461)
    public static void method528(int arg0) {
        field1493 = null;
        field1495 = null;
        field1509 = null;
        int var1 = 99 % ((-arg0 - 47) / 54);
        field1510 = null;
        field1506 = null;
        field1508 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII)V", line = 477)
    public final void method529(boolean arg0, int arg1, int arg2) {
        field1507++;
        if (arg1 == 1 && this.field1511) {
            return;
        }
        int var4 = this.field1500[class41.field829[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class119 var5;
        do {
            if (arg0) {
                var4++;
                if (class123.field2760 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class123.field2760 - 1;
                }
            }
            var5 = class110.method855(true, var4);
        } while (var5 == null || var5.field2636 || (this.field1511 ? 7 : 0) + arg1 != var5.field2632);
        this.field1500[class41.field829[arg1]] = var4 + 256;
        this.method533(0);
        int var6 = 36 / ((arg2 - 53) / 51);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIBLf;Lf;)Lne;", line = 528)
    public final class83 method530(int arg0, int arg1, byte arg2, class31 arg3, class31 arg4) {
        field1488++;
        if (this.field1505 != -1) {
            return class42.method366(arg2 ^ 0xFFFFFFA4, this.field1505).method341(arg3, arg4, arg2 ^ 0x65, arg0, arg1);
        }
        int[] var6 = this.field1500;
        if (arg2 != 101) {
            field1508 = null;
        }
        long var7 = this.field1490;
        if (arg3 != null && (arg3.field619 >= 0 || arg3.field613 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field1500[var9];
            }
            if (arg3.field619 >= 0) {
                var7 += arg3.field619 - this.field1500[5] << 8;
                var6[5] = arg3.field619;
            }
            if (arg3.field613 >= 0) {
                var7 += arg3.field613 - this.field1500[3] << 16;
                var6[3] = arg3.field613;
            }
        }
        class83 var10 = (class83) class109.field2362.method737(var7, (byte) -123);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var6[var12];
                if (var20 >= 256 && var20 < 512 && !class110.method855(true, var20 - 256).method927(-1000000000)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class126.method970(-83, var20 - 512).method374((byte) 18, this.field1511)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1486 != -1L) {
                    var10 = (class83) class109.field2362.method737(this.field1486, (byte) -121);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class83[] var13 = new class83[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var6[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class83 var18 = class110.method855(true, var17 - 256).method924((byte) 73);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class83 var19 = class126.method970(108, var17 - 512).method383((byte) 107, this.field1511);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class83(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field1494[var16] != 0) {
                        var10.method610(class11.field218[var16][0], class11.field218[var16][this.field1494[var16]]);
                        if (var16 == 1) {
                            var10.method610(class116.field2532[0], class116.field2532[this.field1494[var16]]);
                        }
                    }
                }
                var10.method630();
                var10.method623(64, 850, -30, -50, -30, true);
                class109.field2362.method744(-121, var7, var10);
                this.field1486 = var7;
            }
        }
        if (arg3 == null && arg4 == null) {
            return var10;
        }
        class83 var21;
        if (arg3 != null && arg4 != null) {
            var21 = arg3.method273(arg4, arg1, var10, arg0, false);
        } else if (arg3 == null) {
            var21 = arg4.method280((byte) 119, var10, arg1);
        } else {
            var21 = arg3.method280((byte) -84, var10, arg0);
        }
        return var21;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I", line = 706)
    public final int method531(byte arg0) {
        if (arg0 > -119) {
            method523(93);
        }
        field1492++;
        return this.field1505 == -1 ? (this.field1494[0] << 25) + (this.field1500[11] << 5) + (this.field1500[8] << 10) + (this.field1494[4] << 20) + (this.field1500[0] << 15) + this.field1500[1] : 305419896 - -class42.method366(-77, this.field1505).field759;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Leb;I)V", line = 732)
    public final void method532(class27 arg0, int arg1) {
        field1501++;
        arg0.method226(arg1 ^ 0x25AD, this.field1511 ? 1 : 0);
        if (arg1 != -1) {
            return;
        }
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1500[class41.field829[var3]];
            if (var5 == 0) {
                arg0.method226(-9646, -1);
            } else {
                arg0.method226(-9646, var5 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method226(-9646, this.field1494[var4]);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 797)
    private final void method533(int arg0) {
        field1502++;
        long var2 = this.field1490;
        int var4 = this.field1500[5];
        int var5 = this.field1500[9];
        this.field1500[5] = var5;
        this.field1500[9] = var4;
        this.field1490 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1490 <<= 0x4;
            if (this.field1500[var6] >= 256) {
                this.field1490 += this.field1500[var6] - 256;
            }
        }
        if (this.field1500[0] >= 256) {
            this.field1490 += this.field1500[0] - 256 >> 4;
        }
        if (this.field1500[1] >= 256) {
            this.field1490 += this.field1500[1] - 256 >> 8;
        }
        for (int var7 = arg0; var7 < 5; var7++) {
            this.field1490 <<= 0x3;
            this.field1490 += this.field1494[var7];
        }
        this.field1490 <<= 0x1;
        this.field1490 += this.field1511 ? 1 : 0;
        this.field1500[5] = var4;
        this.field1500[9] = var5;
        if (var2 != 0L && this.field1490 != var2) {
            class109.field2362.method739(arg0 + 1, var2);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)V", line = 854)
    public final void method534(int arg0, int arg1, boolean arg2) {
        field1487++;
        if (arg0 != 0) {
            return;
        }
        int var4 = this.field1494[arg1];
        if (arg2) {
            var4++;
            if (var4 >= class11.field218[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class11.field218[arg1].length - 1;
            }
        }
        this.field1494[arg1] = var4;
        this.method533(0);
    }
}
