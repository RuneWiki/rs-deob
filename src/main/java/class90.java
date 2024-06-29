import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 {

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    private int field1956;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    private int field1957;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[[I")
    private int[][] field1969;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Llc;")
    public static class69 field1950 = class69.method470((byte) -97, "flash1:");

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Llc;")
    public static class69 field1951 = class69.method470((byte) -127, "Existing User");

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Llc;")
    public static class69 field1973 = class69.method470((byte) -121, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field1971 = 99;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lua;")
    public static class116 field1949;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lkc;")
    public static class63 field1967;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Loa;")
    public static class85 field1948;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Loa;")
    public static class85 field1964;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Loa;")
    public static class85 field1966;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    public static int[] field1952;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[[[I")
    public static int[][][] field1958;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1951 = null;
        field1950 = null;
        field1948 = null;
        field1952 = null;
        field1973 = null;
        if (arg0 != 16756) {
            method636(null, -19);
        }
        field1964 = null;
        field1966 = null;
        field1967 = null;
        field1958 = null;
        field1949 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static final void method634(int arg0) {
        field1972++;
        if (arg0 != 18911) {
            method636(null, -126);
        }
        if (class57.field1198 != 0) {
            return;
        }
        int var1 = class62.field1278;
        if (class60.field1248 == 1 && class127.field2733 >= 516 && class19.field417 >= 160 && class127.field2733 <= 765 && class19.field417 <= 205) {
            var1 = 0;
        }
        if (!class127.field2738) {
            if (var1 == 1 && class72.field1604 > 0) {
                int var2 = class76.field1700[class72.field1604 - 1];
                if (var2 == 55 || var2 == 22 || var2 == 15 || var2 == 21 || var2 == 18 || var2 == 36 || var2 == 51 || var2 == 5 || var2 == 19 || var2 == 29 || var2 == 33 || var2 == 1005) {
                    int var3 = class77.field1740[class72.field1604 - 1];
                    int var4 = class68.field1474[class72.field1604 - 1];
                    class9 var5 = class9.method56(true, var3);
                    if (var5.field151 || var5.field179) {
                        class72.field1597 = var4;
                        class29.field603 = false;
                        class57.field1198 = 2;
                        class93.field2022 = class19.field417;
                        class27.field575 = class127.field2733;
                        class80.field1823 = var3;
                        if (var3 >> 16 == class53.field1144) {
                            class57.field1198 = 1;
                        }
                        class16.field301 = 0;
                        if (var3 >> 16 == class60.field1244) {
                            class57.field1198 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (client.field399 == 1 || class64.method411(27516, class72.field1604 - 1)) && class72.field1604 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class72.field1604 > 0) {
                class72.method510(0, class72.field1604 - 1);
            }
            if (var1 == 2 && class72.field1604 > 0) {
                class112.method826(-8116);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class101.field2193;
            int var7 = class74.field1666;
            if (class77.field1718 == 0) {
                var6 -= 4;
                var7 -= 4;
            }
            if (class77.field1718 == 1) {
                var7 -= 205;
                var6 -= 553;
            }
            if (class77.field1718 == 2) {
                var7 -= 357;
                var6 -= 17;
            }
            if (var6 < class33.field656 - 10 || class33.field656 + class19.field419 + 10 < var6 || class121.field2600 - 10 > var7 || var7 > class121.field2600 + class112.field2430 + 10) {
                if (class77.field1718 == 1) {
                    class110.field2418 = true;
                }
                class127.field2738 = false;
                if (class77.field1718 == 2) {
                    class35.field709 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class33.field656;
        int var9 = class121.field2600;
        int var10 = class19.field419;
        int var11 = class127.field2733;
        int var12 = class19.field417;
        if (class77.field1718 == 0) {
            var11 -= 4;
            var12 -= 4;
        }
        if (class77.field1718 == 1) {
            var11 -= 553;
            var12 -= 205;
        }
        if (class77.field1718 == 2) {
            var11 -= 17;
            var12 -= 357;
        }
        int var13 = -1;
        for (int var14 = 0; var14 < class72.field1604; var14++) {
            int var15 = (class72.field1604 - var14 - 1) * 15 + var9 + 31;
            if (var11 > var8 && var8 + var10 > var11 && var15 - 13 < var12 && var12 < var15 + 3) {
                var13 = var14;
            }
        }
        if (var13 != -1) {
            class72.method510(0, var13);
        }
        class127.field2738 = false;
        if (class77.field1718 == 1) {
            class110.field2418 = true;
        }
        if (class77.field1718 != 2) {
            return;
        }
        class35.field709 = true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
    public final int method635(int arg0, int arg1) {
        field1962++;
        int var3 = 68 / ((-arg0 - 60) / 40);
        if (this.field1969 != null) {
            arg1 = this.field1956 * arg1 / this.field1957;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lib;I)V")
    public static final void method636(class50 arg0, int arg1) {
        field1968++;
        if (arg0.field1087 == 0) {
            return;
        }
        if (arg0.field1076 != -1 && arg0.field1076 < 32768) {
            class72 var2 = class112.field2434[arg0.field1076];
            if (var2 != null) {
                int var3 = arg0.field1058 - var2.field1058;
                int var4 = arg0.field1065 - var2.field1065;
                if (var3 != 0 || var4 != 0) {
                    arg0.field1080 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1076 >= 32768) {
            int var5 = arg0.field1076 - 32768;
            if (class2.field10 == var5) {
                var5 = 2047;
            }
            class60 var6 = class123.field2682[var5];
            if (var6 != null) {
                int var7 = arg0.field1058 - var6.field1058;
                int var8 = arg0.field1065 - var6.field1065;
                if (var7 != 0 || var8 != 0) {
                    arg0.field1080 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1098 != 0 || arg0.field1030 != 0) && (arg0.field1048 == 0 || arg0.field1035 > 0)) {
            int var9 = arg0.field1058 - (arg0.field1098 - class33.field648 - class33.field648) * 64;
            int var10 = arg0.field1065 - (arg0.field1030 - class60.field1234 - class60.field1234) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field1080 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field1098 = 0;
            arg0.field1030 = 0;
        }
        int var11 = arg0.field1080 - arg0.field1037 & arg1;
        if (var11 == 0) {
            return;
        }
        if (var11 < arg0.field1087 || 2048 - arg0.field1087 < var11) {
            arg0.field1037 = arg0.field1080;
        } else if (var11 > 1024) {
            arg0.field1037 -= arg0.field1087;
        } else {
            arg0.field1037 += arg0.field1087;
        }
        arg0.field1037 &= 0x7FF;
        if (arg0.field1060 != arg0.field1034 || arg0.field1080 == arg0.field1037) {
            return;
        }
        if (arg0.field1051 == -1) {
            arg0.field1034 = arg0.field1053;
            return;
        }
        arg0.field1034 = arg0.field1051;
        return;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)I")
    public final int method637(int arg0, byte arg1) {
        if (this.field1969 != null) {
            arg0 = this.field1956 * arg0 / this.field1957 + 7;
        }
        field1954++;
        int var3 = -106 % ((arg1 + 32) / 48);
        return arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;ILkc;)V")
    public static final void method638(Component arg0, int arg1, class63 arg2) {
        field1961++;
        if (class24.field506) {
            return;
        }
        class112.field2444 = class10.method57((byte) 77, class127.field2739, arg2, class82.field1860);
        class83.field1870 = class10.method57((byte) 77, class33.field664, arg2, class82.field1860);
        class81.field1844 = class10.method57((byte) 77, class87.field1923, arg2, class82.field1860);
        class106.field2311 = class10.method57((byte) 77, class81.field1839, arg2, class82.field1860);
        class108.field2398 = class10.method57((byte) 77, class29.field599, arg2, class82.field1860);
        class60.field1247 = class10.method57((byte) 77, class36.field714, arg2, class82.field1860);
        class93.field2020 = class55.method345((byte) 108, arg0, 96, 479);
        class83.field1870.method80(0, 0);
        class39.field769 = class55.method345((byte) 108, arg0, 156, 172);
        class95.method729();
        class81.field1844.method80(0, 0);
        field1948 = class55.method345((byte) 108, arg0, 261, 190);
        class112.field2444.method80(0, 0);
        class36.field720 = class55.method345((byte) 108, arg0, 334, 512);
        class95.method729();
        class75.field1690 = class55.method345((byte) 108, arg0, 50, 496);
        class63.field1333 = class55.method345((byte) 108, arg0, 37, 269);
        class107.field2317 = class55.method345((byte) 108, arg0, 45, 249);
        class20 var3 = class56.method349(arg2, (byte) 38, class30.field635, class82.field1860);
        class29.field609 = class55.method345((byte) 108, arg0, var3.field433, var3.field437);
        var3.method138(0, 0);
        class20 var4 = class56.method349(arg2, (byte) 38, class60.field1211, class82.field1860);
        class82.field1858 = class55.method345((byte) 108, arg0, var4.field433, var4.field437);
        var4.method138(0, 0);
        class20 var5 = class56.method349(arg2, (byte) 38, class42.field823, class82.field1860);
        class3.field47 = class55.method345((byte) 108, arg0, var5.field433, var5.field437);
        var5.method138(0, 0);
        class20 var6 = class56.method349(arg2, (byte) 38, class50.field1100, class82.field1860);
        class30.field612 = class55.method345((byte) 108, arg0, var6.field433, var6.field437);
        var6.method138(0, 0);
        class20 var7 = class56.method349(arg2, (byte) 38, class92.field2009, class82.field1860);
        if (arg1 != -11508) {
            method633(103);
        }
        class16.field283 = class55.method345((byte) 108, arg0, var7.field433, var7.field437);
        var7.method138(0, 0);
        class20 var8 = class56.method349(arg2, (byte) 38, class94.field2074, class82.field1860);
        field1966 = class55.method345((byte) 108, arg0, var8.field433, var8.field437);
        var8.method138(0, 0);
        class20 var9 = class56.method349(arg2, (byte) 38, class67.field1391, class82.field1860);
        class68.field1447 = class55.method345((byte) 108, arg0, var9.field433, var9.field437);
        var9.method138(0, 0);
        class20 var10 = class56.method349(arg2, (byte) 38, class74.field1651, class82.field1860);
        class98.field2155 = class55.method345((byte) 108, arg0, var10.field433, var10.field437);
        var10.method138(0, 0);
        class20 var11 = class56.method349(arg2, (byte) 38, class69.field1536, class82.field1860);
        class80.field1824 = class55.method345((byte) 108, arg0, var11.field433, var11.field437);
        var11.method138(0, 0);
        class119.field2542 = class10.method57((byte) 77, class17.field340, arg2, class82.field1860);
        class121.field2601 = class10.method57((byte) 77, class49.field1006, arg2, class82.field1860);
        class82.field1859 = class10.method57((byte) 77, class123.field2671, arg2, class82.field1860);
        class115.field2494 = class119.field2542.method82();
        class115.field2494.method77();
        class112.field2449 = class121.field2601.method82();
        class112.field2449.method77();
        class36.field737 = class119.field2542.method82();
        class36.field737.method78();
        class13.field267 = class121.field2601.method82();
        class13.field267.method78();
        class18.field381 = class82.field1859.method82();
        class18.field381.method78();
        class47.field981 = class119.field2542.method82();
        class47.field981.method77();
        class47.field981.method78();
        class60.field1245 = class121.field2601.method82();
        class60.field1245.method77();
        class60.field1245.method78();
        class29.field605 = class63.method393(class82.field1860, true, class121.field2587, arg2);
        class63.field1331 = new int[151];
        class24.field500 = new int[151];
        class81.field1842 = new int[33];
        class76.field1701 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class81.field1844.field273[class81.field1844.field275 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class76.field1701[var12] = var17;
            class81.field1842[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class81.field1844.field273[class81.field1844.field275 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class63.field1331[var13 - 5] = var14 - 25;
            class24.field500[var13 - 5] = var15 - var14;
        }
        class24.field506 = true;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(II)V")
    public class90(int arg0, int arg1) {
        int var3 = class22.method148(-1284878009, arg1, arg0);
        int var4 = arg0 / var3;
        int var5 = arg1 / var3;
        this.field1956 = var5;
        this.field1957 = var4;
        if (var4 != var5) {
            this.field1969 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1969[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BI)[B")
    public final byte[] method639(byte[] arg0, int arg1) {
        int var3 = 114 % ((-arg1 - 60) / 48);
        if (this.field1969 != null) {
            int var4 = arg0.length * this.field1956 / this.field1957 + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                byte var11 = arg0[var8];
                int[] var12 = this.field1969[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field1956 + var7;
                int var15 = var14 / this.field1957;
                var7 = var14 - this.field1957 * var15;
                var6 += var15;
            }
            arg0 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg0[var9] = -128;
                } else if (var10 > 127) {
                    arg0[var9] = 127;
                } else {
                    arg0[var9] = (byte) var10;
                }
            }
        }
        field1965++;
        return arg0;
    }
}
