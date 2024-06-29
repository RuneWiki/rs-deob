import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class82 {

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field2002 = 500;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Lbd;")
    public static class12 field1998 = new class12(128);

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Lae;")
    public static class6 field2010 = class64.method474(111, "System)2Update in: ");

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[I")
    public static int[] field2007 = new int[5];

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Z")
    public static boolean field2012 = false;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "Z")
    public static volatile boolean field2011 = true;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Lae;")
    private static class6 field2013 = class64.method474(109, "Enter amount:");

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Lae;")
    private static class6 field2008 = class64.method474(113, "Offline");

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lae;")
    public static class6 field2009 = field2013;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field2018 = 0;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "Z")
    public static boolean field2017 = false;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lae;")
    public static class6 field2014 = field2008;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "Lae;")
    private static class6 field2021 = class64.method474(123, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Lae;")
    public static class6 field2015 = field2021;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    private int field1992;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "J")
    private long field1985;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "J")
    private long field1986;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "Lva;")
    public static class128 field2016;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Lvb;")
    public static class129 field2020;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Z")
    public boolean field1999;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
    private int[] field1984;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
    private int[] field1991;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V", line = 9)
    public static final void method695(int arg0, int arg1) {
        field2003++;
        if (arg0 == -1 && class21.field519 == 0) {
            class70.method511((byte) 94);
        } else if (arg0 != -1 && class138.field3360 != arg0 && class76.field1795 != 0 && class21.field519 == 0) {
            class70.method513(class41.field913, arg0, 0, false, 10, 0, -75, class76.field1795);
        }
        class138.field3360 = arg0;
        int var2 = -56 / ((arg1 - 44) / 33);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)V", line = 41)
    public static final void method696(int arg0, long arg1) {
        if (arg0 != 3) {
            field1998 = null;
        }
        field2001++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class93.method778(arg1 - 1L, (byte) -44);
            class93.method778(1L, (byte) -44);
        } else {
            class93.method778(arg1, (byte) -44);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V", line = 65)
    public final void method697(int arg0, boolean arg1) {
        if (arg0 == -22411) {
            field1988++;
            if (this.field1999 != arg1) {
                this.method704(null, arg1, this.field1991, 91, -1);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI)V", line = 80)
    public final void method698(int arg0, boolean arg1, int arg2) {
        field1987++;
        if (arg2 == 1 && this.field1999) {
            return;
        }
        int var4 = this.field1984[class15.field306[arg2]];
        if (arg0 == var4) {
            return;
        }
        var4 -= 256;
        class51 var5;
        do {
            if (arg1) {
                var4++;
                if (class92.field2203 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class92.field2203 - 1;
                }
            }
            var5 = class129.method1042(var4, 3);
        } while (var5 == null || var5.field1136 || arg2 + (this.field1999 ? 7 : 0) != var5.field1141);
        this.field1984[class15.field306[arg2]] = var4 + 256;
        this.method705(true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 129)
    public static void method699(int arg0) {
        field2021 = null;
        if (arg0 != 0) {
            method708(3, -53, 28);
        }
        field2020 = null;
        field2010 = null;
        field1998 = null;
        field2013 = null;
        field2015 = null;
        field2007 = null;
        field2014 = null;
        field2009 = null;
        field2016 = null;
        field2008 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lm;I)V", line = 149)
    public final void method700(class77 arg0, int arg1) {
        field1995++;
        arg0.method641((byte) -28, this.field1999 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var6 = this.field1984[class15.field306[var3]];
            if (var6 == 0) {
                arg0.method641((byte) -28, -1);
            } else {
                arg0.method641((byte) -28, var6 - 256);
            }
        }
        int var4 = 0;
        int var5 = 55 % ((arg1 - 83) / 39);
        while (var4 < 5) {
            arg0.method641((byte) -28, this.field1991[var4]);
            var4++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILne;Lne;II)Lv;", line = 182)
    public final class131 method701(int arg0, class85 arg1, class85 arg2, int arg3, int arg4) {
        field2000++;
        if (this.field1992 != -1) {
            return class138.method1117(arg0 ^ 0x350E, this.field1992).method846(arg3, 65535, arg1, arg2, arg4);
        }
        long var6 = this.field1985;
        int[] var8 = this.field1984;
        if (arg0 != -27537) {
            this.method703(53);
        }
        if (arg2 != null && (arg2.field2033 >= 0 || arg2.field2053 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1984[var9];
            }
            if (arg2.field2033 >= 0) {
                var6 += arg2.field2033 - this.field1984[5] << 8;
                var8[5] = arg2.field2033;
            }
            if (arg2.field2053 >= 0) {
                var6 += arg2.field2053 - this.field1984[3] << 16;
                var8[3] = arg2.field2053;
            }
        }
        class131 var10 = (class131) class25.field632.method128((byte) -93, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var8[var12];
                if (var20 >= 256 && var20 < 512 && !class129.method1042(var20 - 256, 3).method405(0)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class43.method356(-90, var20 - 512).method212(this.field1999, -2583)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1986 != -1L) {
                    var10 = (class131) class25.field632.method128((byte) 127, this.field1986);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class131[] var13 = new class131[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var8[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class131 var18 = class129.method1042(var17 - 256, 3).method408(114);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class131 var19 = class43.method356(-17, var17 - 512).method223(this.field1999, arg0 ^ 0xFFFF9405);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class131(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field1991[var16] != 0) {
                        var10.method1083(class49.field1083[var16][0], class49.field1083[var16][this.field1991[var16]]);
                        if (var16 == 1) {
                            var10.method1083(class58.field1259[0], class58.field1259[this.field1991[var16]]);
                        }
                    }
                }
                var10.method1073();
                var10.method1068(64, 850, -30, -50, -30, true);
                class25.field632.method130(var10, var6, (byte) -9);
                this.field1986 = var6;
            }
        }
        if (arg2 == null && arg1 == null) {
            return var10;
        }
        class131 var21;
        if (arg2 != null && arg1 != null) {
            var21 = arg2.method724(arg3, var10, arg1, arg0 - 248981919, arg4);
        } else if (arg2 == null) {
            var21 = arg1.method726(var10, arg4, true);
        } else {
            var21 = arg2.method726(var10, arg3, true);
        }
        return var21;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lbf;IIZ)Lq;", line = 349)
    public static final class101 method702(class14 arg0, int arg1, int arg2, boolean arg3) {
        field2004++;
        if (arg3) {
            method702(null, -91, -12, true);
        }
        return client.method197(arg2, arg1, (byte) 29, arg0) ? class75.method595(!arg3) : null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Lv;", line = 367)
    public final class131 method703(int arg0) {
        field1997++;
        if (this.field1992 != -1) {
            return class138.method1117(-24223, this.field1992).method839(0);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1984[var3];
            if (var12 >= 256 && var12 < 512 && !class129.method1042(var12 - 256, 3).method409((byte) -21)) {
                var2 = true;
            }
            if (var12 >= 512 && !class43.method356(-71, var12 - 512).method215(111, this.field1999)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        if (arg0 != 1) {
            field2017 = false;
        }
        int var4 = 0;
        class131[] var5 = new class131[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1984[var6];
            if (var9 >= 256 && var9 < 512) {
                class131 var10 = class129.method1042(var9 - 256, 3).method404(arg0 ^ 0xFFFFFFFE);
                if (var10 != null) {
                    var5[var4++] = var10;
                }
            }
            if (var9 >= 512) {
                class131 var11 = class43.method356(-21, var9 - 512).method218((byte) 117, this.field1999);
                if (var11 != null) {
                    var5[var4++] = var11;
                }
            }
        }
        class131 var7 = new class131(var5, var4);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1991[var8] != 0) {
                var7.method1083(class49.field1083[var8][0], class49.field1083[var8][this.field1991[var8]]);
                if (var8 == 1) {
                    var7.method1083(class58.field1259[0], class58.field1259[this.field1991[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IZ[III)V", line = 472)
    public final void method704(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        field2006++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class92.field2203; var7++) {
                    class51 var8 = class129.method1042(var7, 3);
                    if (var8 != null && !var8.field1136 && var8.field1141 == (arg1 ? 7 : 0) + var6) {
                        arg0[class15.field306[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1999 = arg1;
        this.field1991 = arg2;
        this.field1984 = arg0;
        if (arg3 < 54) {
            field1998 = null;
        }
        this.field1992 = arg4;
        this.method705(true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 518)
    private final void method705(boolean arg0) {
        long var2 = this.field1985;
        field1996++;
        this.field1985 = 0L;
        int var4 = this.field1984[5];
        int var5 = this.field1984[9];
        this.field1984[5] = var5;
        this.field1984[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1985 <<= 0x4;
            if (this.field1984[var6] >= 256) {
                this.field1985 += this.field1984[var6] - 256;
            }
        }
        if (this.field1984[0] >= 256) {
            this.field1985 += this.field1984[0] - 256 >> 4;
        }
        if (!arg0) {
            field2013 = null;
        }
        if (this.field1984[1] >= 256) {
            this.field1985 += this.field1984[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1985 <<= 0x3;
            this.field1985 += this.field1991[var7];
        }
        this.field1984[9] = var5;
        this.field1985 <<= 0x1;
        this.field1985 += this.field1999 ? 1 : 0;
        this.field1984[5] = var4;
        if (var2 != 0L && this.field1985 != var2) {
            class25.field632.method126(var2, -123);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIB)I", line = 575)
    public static final int method706(int arg0, int arg1, int arg2, byte arg3) {
        field1993++;
        if ((class108.field2582[arg2][arg1][arg0] & 0x8) == 0) {
            if (arg3 != 23) {
                method699(-6);
            }
            return arg2 <= 0 || (class108.field2582[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I", line = 597)
    public final int method707(int arg0) {
        field1983++;
        if (arg0 <= 50) {
            method696(18, 110L);
        }
        return this.field1992 == -1 ? (this.field1991[0] << 25) + (this.field1991[4] << 20) + (this.field1984[11] << 5) + (this.field1984[8] << 10) + (this.field1984[0] << 15) + this.field1984[1] : class138.method1117(-24223, this.field1992).field2357 + 305419896;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V", line = 612)
    public static final void method708(int arg0, int arg1, int arg2) {
        field1994++;
        class63 var3 = class40.method341(arg2, (byte) -109);
        int var4 = var3.field1376;
        int var5 = var3.field1372;
        int var6 = var3.field1379;
        int var7 = class32.field799[var6 - var4];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        if (arg1 > -77) {
            method708(-111, -123, -128);
        }
        class133.field3245[var5] = class105.method885(class60.method451(~var8, class133.field3245[var5]), class60.method451(var8, arg0 << var4));
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ldd;", line = 639)
    public static final class25 method709(Throwable arg0, String arg1) {
        class25 var2;
        if (arg0 instanceof class25) {
            var2 = (class25) arg0;
            var2.field626 = var2.field626 + ' ' + arg1;
        } else {
            var2 = new class25(arg0, arg1);
        }
        field1990++;
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZII)V", line = 663)
    public final void method710(boolean arg0, int arg1, int arg2) {
        field1989++;
        int var4 = this.field1991[arg2];
        if (arg0) {
            var4++;
            if (class49.field1083[arg2].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class49.field1083[arg2].length - 1;
            }
        }
        this.field1991[arg2] = var4;
        if (arg1 != 7961) {
            this.method703(-40);
        }
        this.method705(true);
    }
}
