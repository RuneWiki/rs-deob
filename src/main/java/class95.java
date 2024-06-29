import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class95 {

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "Lok;")
    public static class146 field1521 = class235.method1724(-12908, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "Lok;")
    public static class146 field1531 = class235.method1724(-12908, "weiss:");

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field1530 = 0;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "[[Lim;")
    public static class175[][] field1529 = new class175[13][13];

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "Lok;")
    public static class146 field1538 = class235.method1724(-12908, "_labels");

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "J")
    private long field1519;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "J")
    private long field1528;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Z")
    public boolean field1526;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
    private int[] field1527;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "[I")
    private int[] field1537;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)I", line = 4)
    public final int method647(byte arg0) {
        if (arg0 <= 75) {
            field1538 = (class146) null;
        }
        field1534++;
        return this.field1539 == -1 ? (this.field1537[4] << 20) + ((this.field1537[0] << 25) + (this.field1527[0] << 15) - (-(this.field1527[8] << 10) - ((this.field1527[11] << 5) - -this.field1527[1]))) : class218.method1610(this.field1539, (byte) -33).field5126 + 305419896;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lgm;IZLgm;IB)Lfg;", line = 21)
    public final class208 method648(class287 arg0, int arg1, boolean arg2, class287 arg3, int arg4, byte arg5) {
        field1533++;
        if (arg5 > -93) {
            this.field1528 = -128L;
        }
        if (this.field1539 != -1) {
            return class218.method1610(this.field1539, (byte) -33).method2134(arg1, arg4, arg3, (byte) 125, arg0);
        }
        long var7 = this.field1519;
        int[] var9 = this.field1527;
        if (arg3 != null && (arg3.field4912 >= 0 || arg3.field4906 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field1527[var10];
            }
            if (arg3.field4912 >= 0) {
                if (arg3.field4912 == 65535) {
                    var9[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var9[5] = class138.method1013(arg3.field4912, 1073741824);
                    var7 ^= (long) var9[5] << 32;
                }
            }
            if (arg3.field4906 >= 0) {
                if (arg3.field4906 == 65535) {
                    var9[3] = 0;
                    var7 ^= 0xFFFFFFFFL;
                } else {
                    var9[3] = class138.method1013(arg3.field4906, 1073741824);
                    var7 ^= (long) var9[3];
                }
            }
        }
        class208 var11 = (class208) class280.field4809.method799((byte) 52, var7);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = var9[var13];
                if ((var14 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var14) != 0 && !class238.method1739(var14 & 0x3FFFFFFF, 3).method1640(13965)) {
                        var12 = true;
                    }
                } else if (!class84.method589(false, var14 & 0x3FFFFFFF).method1808(-50, this.field1526)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field1528 != -1L) {
                    var11 = (class208) class280.field4809.method799((byte) 52, this.field1528);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                int var15 = 0;
                class130[] var16 = new class130[12];
                for (int var17 = 0; var17 < 12; var17++) {
                    int var18 = var9[var17];
                    if ((var18 & 0x40000000) != 0) {
                        class130 var19 = class84.method589(false, var18 & 0x3FFFFFFF).method1817(this.field1526, true);
                        if (var19 != null) {
                            var16[var15++] = var19;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class130 var20 = class238.method1739(var18 & 0x3FFFFFFF, 3).method1642(-9442);
                        if (var20 != null) {
                            var16[var15++] = var20;
                        }
                    }
                }
                class130 var21 = new class130(var16, var15);
                for (int var22 = 0; var22 < 5; var22++) {
                    if (class296.field5044[var22].length > this.field1537[var22]) {
                        var21.method938(class313.field5332[var22], class296.field5044[var22][this.field1537[var22]]);
                    }
                    if (class275.field4726[var22].length > this.field1537[var22]) {
                        var21.method938(class245.field4045[var22], class275.field4726[var22][this.field1537[var22]]);
                    }
                }
                var11 = var21.method961(64, 850, -30, -50, -30);
                if (class271.field4640) {
                    ((class176) var11).method1389(false, false, true, true, false, false, true);
                }
                if (arg2) {
                    class280.field4809.method797(var11, 0, var7);
                    this.field1528 = var7;
                }
            }
        }
        if (arg3 == null && arg0 == null) {
            return var11;
        }
        class208 var23;
        if (arg3 != null && arg0 != null) {
            var23 = arg3.method2070(arg4, -12366, arg1, var11, arg0);
        } else if (arg3 == null) {
            var23 = arg0.method2068(true, var11, arg4);
        } else {
            var23 = arg3.method2068(true, var11, arg1);
        }
        return var23;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V", line = 217)
    public static final void method649(byte arg0) {
        field1532++;
        if (class148.field2508 < 0) {
            class138.field2299 = -1;
            class306.field5228 = -1;
            class148.field2508 = 0;
        }
        if (arg0 > -121) {
            return;
        }
        if (class148.field2508 > class118.field1916) {
            class148.field2508 = class118.field1916;
            class306.field5228 = -1;
            class138.field2299 = -1;
        }
        if (class236.field3937 < 0) {
            class236.field3937 = 0;
            class306.field5228 = -1;
            class138.field2299 = -1;
        }
        if (class236.field3937 > class33.field639) {
            class306.field5228 = -1;
            class236.field3937 = class33.field639;
            class138.field2299 = -1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BII)V", line = 258)
    public final void method650(byte arg0, int arg1, int arg2) {
        field1518++;
        int var4 = class17.field342[arg2];
        if (this.field1527[var4] == 0 || class238.method1739(arg1, 3) == null) {
            return;
        }
        this.field1527[var4] = class138.method1013(Integer.MIN_VALUE, arg1);
        this.method656((byte) -78);
        if (arg0 != 106) {
            this.field1537 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILgm;I)Lfg;", line = 280)
    public final class208 method651(int arg0, class287 arg1, int arg2) {
        field1536++;
        if (this.field1539 != -1) {
            return class218.method1610(this.field1539, (byte) -33).method2124((byte) 49, arg0, arg1);
        }
        class208 var4 = (class208) class122.field2001.method799((byte) 52, this.field1519);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field1527[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((var7 & Integer.MIN_VALUE) != 0 && !class238.method1739(var7 & 0x3FFFFFFF, 3).method1638(arg2 - 1073741900)) {
                        var5 = true;
                    }
                } else if (!class84.method589(false, var7 & 0x3FFFFFFF).method1806(this.field1526, -113)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class130[] var8 = new class130[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field1527[var10];
                if ((var11 & 0x40000000) != 0) {
                    class130 var13 = class84.method589(false, var11 & 0x3FFFFFFF).method1816(false, this.field1526);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class130 var12 = class238.method1739(var11 & 0x3FFFFFFF, 3).method1644((byte) -111);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                }
            }
            class130 var14 = new class130(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field1537[var15] < class296.field5044[var15].length) {
                    var14.method938(class313.field5332[var15], class296.field5044[var15][this.field1537[var15]]);
                }
                if (this.field1537[var15] < class275.field4726[var15].length) {
                    var14.method938(class245.field4045[var15], class275.field4726[var15][this.field1537[var15]]);
                }
            }
            var4 = var14.method961(64, 768, -50, -10, -50);
            class122.field2001.method797(var4, 0, this.field1519);
        }
        if (arg2 != 1073741824) {
            this.method659(31, -121, 58, 33, (class287) null);
        }
        if (arg1 != null) {
            var4 = arg1.method2061(var4, (byte) -105, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 395)
    public static final void method652(int arg0) {
        field1535++;
        if (!class194.field3228) {
            return;
        }
        class32.field622 = null;
        class194.field3228 = false;
        class119.field1939 = null;
        if (arg0 > -38) {
            method658(62);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V", line = 413)
    public final void method653(boolean arg0, int arg1) {
        int var3 = 54 % ((-arg1 - 85) / 35);
        field1540++;
        this.field1526 = arg0;
        this.method656((byte) -78);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI[I[II)V", line = 440)
    public final void method654(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field1522++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class25.field443; var7++) {
                    class222 var8 = class238.method1739(var7, 3);
                    if (var8 != null && !var8.field3694 && var8.field3704 == var6 + (arg0 ? 7 : 0)) {
                        arg2[class17.field342[var6]] = class138.method1013(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field1537 = arg3;
        this.field1527 = arg2;
        this.field1526 = arg0;
        this.field1539 = arg1;
        this.method656((byte) -78);
        if (arg4 > -69) {
            method658(104);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIZ)V", line = 485)
    public final void method655(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1530 = -27;
        }
        field1524++;
        this.field1537[arg1] = arg0;
        this.method656((byte) -78);
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V", line = 500)
    private final void method656(byte arg0) {
        long var2 = this.field1519;
        this.field1519 = -1L;
        if (arg0 != -78) {
            this.method650((byte) 45, 96, -64);
        }
        long[] var4 = class3.field16;
        field1520++;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1519 = this.field1519 >>> 8 ^ var4[(int) (((long) (this.field1527[var5] >> 24) ^ this.field1519) & 0xFFL)];
            this.field1519 = var4[(int) (((long) (this.field1527[var5] >> 16) ^ this.field1519) & 0xFFL)] ^ this.field1519 >>> 8;
            this.field1519 = this.field1519 >>> 8 ^ var4[(int) ((this.field1519 ^ (long) (this.field1527[var5] >> 8)) & 0xFFL)];
            this.field1519 = this.field1519 >>> 8 ^ var4[(int) (((long) this.field1527[var5] ^ this.field1519) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1519 = var4[(int) ((this.field1519 ^ (long) this.field1537[var6]) & 0xFFL)] ^ this.field1519 >>> 8;
        }
        this.field1519 = this.field1519 >>> 8 ^ var4[(int) (((long) (this.field1526 ? 1 : 0) ^ this.field1519) & 0xFFL)];
        if (var2 != 0L && this.field1519 != var2) {
            class280.field4809.method796(arg0 + 46, var2);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(BII)I", line = 541)
    public static final int method657(byte arg0, int arg1, int arg2) {
        int var3 = -90 / ((-arg0 - 2) / 46);
        field1523++;
        int var4 = arg2 >>> 31;
        return (arg2 + var4) / arg1 - var4;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 555)
    public static void method658(int arg0) {
        field1521 = null;
        field1538 = null;
        if (arg0 > -97) {
            method658(57);
        }
        field1531 = null;
        field1529 = (class175[][]) null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIILgm;)Lfg;", line = 570)
    public final class208 method659(int arg0, int arg1, int arg2, int arg3, class287 arg4) {
        field1525++;
        if (arg3 != 10717) {
            field1521 = (class146) null;
        }
        long var6 = (long) arg1 | (long) (arg2 << 16) | (long) arg1 << 32;
        class208 var8 = (class208) class122.field2001.method799((byte) 52, var6);
        if (var8 == null) {
            int var9 = 0;
            class130[] var10 = new class130[2];
            if (!class238.method1739(arg1, 3).method1638(arg3 ^ 0xFFFFD640) || !class238.method1739(arg2, 3).method1638(-110)) {
                return null;
            }
            class130 var11 = class238.method1739(arg1, arg3 - 10714).method1644((byte) -108);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class130 var12 = class238.method1739(arg2, 3).method1644((byte) -124);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class130 var13 = new class130(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class296.field5044[var14].length > this.field1537[var14]) {
                    var13.method938(class313.field5332[var14], class296.field5044[var14][this.field1537[var14]]);
                }
                if (class275.field4726[var14].length > this.field1537[var14]) {
                    var13.method938(class245.field4045[var14], class275.field4726[var14][this.field1537[var14]]);
                }
            }
            var8 = var13.method961(64, 768, -50, -10, -50);
            class122.field2001.method797(var8, 0, var6);
        }
        if (arg4 != null) {
            var8 = arg4.method2061(var8, (byte) -105, arg0);
        }
        return var8;
    }
}
