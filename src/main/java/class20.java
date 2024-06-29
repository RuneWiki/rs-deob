import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 {

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lli;")
    public static class277 field450 = new class277();

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Loh;")
    public static class263 field464 = class253.method1681(-123, " )2> ");

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Loh;")
    public static class263 field459 = class253.method1681(-123, "");

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Loh;")
    public static class263 field461 = field459;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Loh;")
    public static class263 field460 = field459;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Lji;")
    public static class40 field463 = new class40();

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Loh;")
    public static class263 field467 = class253.method1681(-121, ")0");

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field466 = -1;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "J")
    private long field447;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "J")
    private long field455;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Lue;")
    public static class86 field458;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Lue;")
    public static class86 field465;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Z")
    public boolean field439;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
    private int[] field443;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[I")
    private int[] field448;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
    public final int method138(int arg0) {
        field441++;
        if (arg0 != 8) {
            this.field449 = -88;
        }
        return this.field449 == -1 ? (this.field448[11] << 5) + (this.field443[0] << 25) + this.field448[1] - (-(this.field448[0] << 15) + -(this.field448[8] << 10) + -(this.field443[4] << 20)) : class219.method1492(this.field449, 8).field3668 + 305419896;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)V")
    public final void method139(int arg0, byte arg1, int arg2) {
        int var4 = class191.field3439[arg2];
        field451++;
        if (this.field448[var4] != 0 && arg1 == 123 && class59.method364(arg0, -128) != null) {
            this.field448[var4] = class160.method1052(Integer.MIN_VALUE, arg0);
            this.method149(false);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILfa;)Lph;")
    public final class76 method140(int arg0, int arg1, int arg2, int arg3, class240 arg4) {
        long var6 = (long) arg0 << 32 | (long) (arg1 << 16) | (long) arg0;
        int var8 = 68 % ((-arg2 - 22) / 51);
        class76 var9 = (class76) class93.field1835.method828(0, var6);
        field453++;
        if (var9 == null) {
            class242[] var10 = new class242[2];
            int var11 = 0;
            if (!class59.method364(arg0, -128).method499(false) || !class59.method364(arg1, -128).method499(false)) {
                return null;
            }
            class242 var12 = class59.method364(arg0, -128).method500((byte) -21);
            if (var12 != null) {
                var10[var11++] = var12;
            }
            class242 var13 = class59.method364(arg1, -128).method500((byte) -21);
            if (var13 != null) {
                var10[var11++] = var13;
            }
            class242 var14 = new class242(var10, var11);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field443[var15] < class178.field3264[var15].length) {
                    var14.method1633(class121.field2245[var15], class178.field3264[var15][this.field443[var15]]);
                }
                if (this.field443[var15] < class226.field3989[var15].length) {
                    var14.method1633(class142.field2598[var15], class226.field3989[var15][this.field443[var15]]);
                }
            }
            var9 = var14.method1621(64, 768, -50, -10, -50);
            class93.field1835.method826(var6, 9815, var9);
        }
        if (arg4 != null) {
            var9 = arg4.method1607(-128, arg3, var9);
        }
        return var9;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZZ)V")
    public static final void method141(boolean arg0, boolean arg1) {
        byte[][] var2 = class78.field1587;
        byte var3 = 4;
        if (arg1) {
            method141(false, false);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class61.method371((byte) 77);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class259.field4495[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0x3FFC) >> 3;
                            int var12 = (var8 & 0xFFD474) >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class128.field2370.length; var14++) {
                                if (class128.field2370[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class8.method56(var4, var6 * 8, var5 * 8, var9, (byte) -19, (var11 & 0x7) * 8, var10, var2[var14], (var12 & 0x7) * 8, arg0, class103.field1954);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class153.method1010((byte) -102, 8, var5 * 8, 8, var6 * 8, var4);
                    }
                }
            }
        }
        field444++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
    public final void method142(int arg0, boolean arg1) {
        field452++;
        this.field439 = arg1;
        if (arg0 == -29615) {
            this.method149(false);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lfa;ILfa;II)Lph;")
    public final class76 method143(class240 arg0, int arg1, class240 arg2, int arg3, int arg4) {
        field440++;
        if (this.field449 != -1) {
            return class219.method1492(this.field449, 8).method1415(arg2, false, arg0, arg4, arg1);
        }
        long var6 = this.field455;
        int var8 = 91 / ((-arg3 - 51) / 50);
        int[] var9 = this.field448;
        if (arg2 != null && (arg2.field4201 >= 0 || arg2.field4192 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field448[var10];
            }
            if (arg2.field4201 >= 0) {
                if (arg2.field4201 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var9[5] = 0;
                } else {
                    var9[5] = class160.method1052(1073741824, arg2.field4201);
                    var6 ^= (long) var9[5] << 32;
                }
            }
            if (arg2.field4192 >= 0) {
                if (arg2.field4192 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var9[3] = 0;
                } else {
                    var9[3] = class160.method1052(1073741824, arg2.field4192);
                    var6 ^= (long) var9[3];
                }
            }
        }
        class76 var11 = (class76) class122.field2258.method828(0, var6);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var31 = var9[var13];
                if ((var31 & 0x40000000) == 0) {
                    if ((var31 & Integer.MIN_VALUE) != 0 && !class59.method364(var31 & 0x3FFFFFFF, -128).method497(78)) {
                        var12 = true;
                    }
                } else if (!class92.method649(-32508, var31 & 0x3FFFFFFF).method464(-85, this.field439)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field447 != -1L) {
                    var11 = (class76) class122.field2258.method828(0, this.field447);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                int var14 = 0;
                class242[] var15 = new class242[12];
                for (int var16 = 0; var16 < 12; var16++) {
                    int var28 = var9[var16];
                    if ((var28 & 0x40000000) != 0) {
                        class242 var29 = class92.method649(-32508, var28 & 0x3FFFFFFF).method463(this.field439, 122);
                        if (var29 != null) {
                            var15[var14++] = var29;
                        }
                    } else if ((Integer.MIN_VALUE & var28) != 0) {
                        class242 var30 = class59.method364(var28 & 0x3FFFFFFF, -128).method492(-1);
                        if (var30 != null) {
                            var15[var14++] = var30;
                        }
                    }
                }
                int var17 = var9[0];
                if ((var17 & 0x40000000) != 0) {
                    class72 var18 = class92.method649(-32508, var17 & 0x3FFFFFFF);
                    if (var18.field1473 != null) {
                        for (int var19 = 0; var19 < var18.field1473.length; var19++) {
                            if (var18.field1473[var19] != null && var15[var19 + 1] != null) {
                                int var20 = var18.field1473[var19][0];
                                int var21 = var18.field1473[var19][2];
                                int var22 = var18.field1473[var19][1];
                                int var23 = var18.field1473[var19][4];
                                int var24 = var18.field1473[var19][3];
                                int var25 = var18.field1473[var19][5];
                                var15[var19 + 1].method1641(var20, var22, var21);
                                var15[var19 + 1].method1631(var24, var23, var25);
                            }
                        }
                    }
                }
                class242 var26 = new class242(var15, var14);
                for (int var27 = 0; var27 < 5; var27++) {
                    if (class178.field3264[var27].length > this.field443[var27]) {
                        var26.method1633(class121.field2245[var27], class178.field3264[var27][this.field443[var27]]);
                    }
                    if (class226.field3989[var27].length > this.field443[var27]) {
                        var26.method1633(class142.field2598[var27], class226.field3989[var27][this.field443[var27]]);
                    }
                }
                var11 = var26.method1621(64, 850, -30, -50, -30);
                class122.field2258.method826(var6, 9815, var11);
                this.field447 = var6;
            }
        }
        if (arg2 == null && arg0 == null) {
            return var11;
        }
        class76 var32;
        if (arg2 != null && arg0 != null) {
            var32 = arg2.method1611(arg1, arg4, (byte) 30, arg0, var11);
        } else if (arg2 == null) {
            var32 = arg0.method1612(-8037, var11, arg4);
        } else {
            var32 = arg2.method1612(-8037, var11, arg1);
        }
        return var32;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BILfa;)Lph;")
    public final class76 method144(byte arg0, int arg1, class240 arg2) {
        field457++;
        if (this.field449 != -1) {
            return class219.method1492(this.field449, 8).method1405(arg2, arg1, 0);
        }
        class76 var4 = (class76) class93.field1835.method828(0, this.field455);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field448[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class59.method364(var15 & 0x3FFFFFFF, -128).method499(false)) {
                        var5 = true;
                    }
                } else if (!class92.method649(-32508, var15 & 0x3FFFFFFF).method473(this.field439, 0)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class242[] var7 = new class242[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field448[var9];
                if ((var12 & 0x40000000) != 0) {
                    class242 var13 = class92.method649(-32508, var12 & 0x3FFFFFFF).method467(false, this.field439);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class242 var14 = class59.method364(var12 & 0x3FFFFFFF, -128).method500((byte) -21);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class242 var10 = new class242(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field443[var11] < class178.field3264[var11].length) {
                    var10.method1633(class121.field2245[var11], class178.field3264[var11][this.field443[var11]]);
                }
                if (class226.field3989[var11].length > this.field443[var11]) {
                    var10.method1633(class142.field2598[var11], class226.field3989[var11][this.field443[var11]]);
                }
            }
            var4 = var10.method1621(64, 768, -50, -10, -50);
            class93.field1835.method826(this.field455, 9815, var4);
        }
        if (arg2 != null) {
            var4 = arg2.method1607(-126, arg1, var4);
        }
        if (arg0 >= -80) {
            this.method138(-110);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IIZ[I)V")
    public final void method145(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class122.field2266; var7++) {
                    class75 var8 = class59.method364(var7, -128);
                    if (var8 != null && !var8.field1545 && var8.field1555 == (arg3 ? 7 : 0) + var6) {
                        arg4[class191.field3439[var6]] = class160.method1052(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field443 = arg1;
        if (arg0 > -51) {
            return;
        }
        this.field449 = arg2;
        this.field439 = arg3;
        field446++;
        this.field448 = arg4;
        this.method149(false);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLue;)Z")
    public static final boolean method146(byte arg0, class86 arg1) {
        field442++;
        if (arg1.method602(class57.field1203, arg0 + 115)) {
            return true;
        } else {
            return arg0 != -115;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public final void method147(int arg0, int arg1, int arg2) {
        field445++;
        if (arg0 != -19652) {
            this.field439 = false;
        }
        this.field443[arg2] = arg1;
        this.method149(false);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method148(byte arg0) {
        field450 = null;
        field463 = null;
        field459 = null;
        field461 = null;
        field460 = null;
        field458 = null;
        field465 = null;
        if (arg0 == -79) {
            field464 = null;
            field467 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    private final void method149(boolean arg0) {
        field456++;
        if (arg0) {
            method148((byte) -19);
        }
        long var2 = this.field455;
        long[] var4 = class275.field4814;
        this.field455 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field455 = this.field455 >>> 8 ^ var4[(int) ((this.field455 ^ (long) (this.field448[var5] >> 24)) & 0xFFL)];
            this.field455 = this.field455 >>> 8 ^ var4[(int) (((long) (this.field448[var5] >> 16) ^ this.field455) & 0xFFL)];
            this.field455 = this.field455 >>> 8 ^ var4[(int) ((this.field455 ^ (long) (this.field448[var5] >> 8)) & 0xFFL)];
            this.field455 = this.field455 >>> 8 ^ var4[(int) ((this.field455 ^ (long) this.field448[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field455 = this.field455 >>> 8 ^ var4[(int) ((this.field455 ^ (long) this.field443[var6]) & 0xFFL)];
        }
        this.field455 = var4[(int) ((this.field455 ^ (long) (this.field439 ? 1 : 0)) & 0xFFL)] ^ this.field455 >>> 8;
        if (var2 != 0L && this.field455 != var2) {
            class122.field2258.method824((byte) 87, var2);
        }
    }
}
