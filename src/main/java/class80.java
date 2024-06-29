import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class80 {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "[[I")
    private int[][] field1422;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field1413 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "[Lsb;")
    public static class98[] field1419;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)I")
    public final int method595(byte arg0, int arg1) {
        field1417++;
        if (this.field1422 != null) {
            arg1 = (int) ((long) this.field1411 * (long) arg1 / (long) this.field1420) + 6;
        }
        if (arg0 != -28) {
            method599(false, -84, -108, (class75) null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    public static final int method596(int arg0, int arg1) {
        field1409++;
        if (arg0 <= arg1 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    public static final void method597() {
        class44.field732 = 0;
        label191: for (int var0 = 0; var0 < class75.field1327; var0++) {
            class74 var1 = class131.field2334[var0];
            if (class61.field1029 != null) {
                for (int var2 = 0; var2 < class61.field1029.length; var2++) {
                    if (class61.field1029[var2] != -1000000 && (var1.field1254 <= class61.field1029[var2] || var1.field1261 <= class61.field1029[var2]) && (var1.field1258 <= class11.field225[var2] || var1.field1263 <= class11.field225[var2]) && (var1.field1258 >= class93.field1639[var2] || var1.field1263 >= class93.field1639[var2]) && (var1.field1249 <= class62.field1038[var2] || var1.field1260 <= class62.field1038[var2]) && (var1.field1249 >= class243.field4217[var2] || var1.field1260 >= class243.field4217[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field1251 == 1) {
                int var3 = var1.field1246 + class171.field3012 - class101.field1786;
                if (var3 >= 0 && var3 <= class171.field3012 + class171.field3012) {
                    int var4 = var1.field1262 + class171.field3012 - class82.field1455;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1253 + class171.field3012 - class82.field1455;
                    if (var5 > class171.field3012 + class171.field3012) {
                        var5 = class171.field3012 + class171.field3012;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class171.field3020[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class120.field2196 - var1.field1258;
                        if (var7 > 32) {
                            var1.field1243 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1243 = 2;
                            var7 = -var7;
                        }
                        var1.field1256 = (var1.field1249 - class154.field2810 << 8) / var7;
                        var1.field1257 = (var1.field1260 - class154.field2810 << 8) / var7;
                        var1.field1248 = (var1.field1254 - class239.field4112 << 8) / var7;
                        var1.field1252 = (var1.field1261 - class239.field4112 << 8) / var7;
                        class54.field872[class44.field732++] = var1;
                    }
                }
            } else if (var1.field1251 == 2) {
                int var8 = var1.field1262 + class171.field3012 - class82.field1455;
                if (var8 >= 0 && var8 <= class171.field3012 + class171.field3012) {
                    int var9 = var1.field1246 + class171.field3012 - class101.field1786;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1269 + class171.field3012 - class101.field1786;
                    if (var10 > class171.field3012 + class171.field3012) {
                        var10 = class171.field3012 + class171.field3012;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class171.field3020[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class154.field2810 - var1.field1249;
                        if (var12 > 32) {
                            var1.field1243 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1243 = 4;
                            var12 = -var12;
                        }
                        var1.field1255 = (var1.field1258 - class120.field2196 << 8) / var12;
                        var1.field1247 = (var1.field1263 - class120.field2196 << 8) / var12;
                        var1.field1248 = (var1.field1254 - class239.field4112 << 8) / var12;
                        var1.field1252 = (var1.field1261 - class239.field4112 << 8) / var12;
                        class54.field872[class44.field732++] = var1;
                    }
                }
            } else if (var1.field1251 == 4) {
                int var13 = var1.field1254 - class239.field4112;
                if (var13 > 128) {
                    int var14 = var1.field1262 + class171.field3012 - class82.field1455;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1253 + class171.field3012 - class82.field1455;
                    if (var15 > class171.field3012 + class171.field3012) {
                        var15 = class171.field3012 + class171.field3012;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1246 + class171.field3012 - class101.field1786;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1269 + class171.field3012 - class101.field1786;
                        if (var17 > class171.field3012 + class171.field3012) {
                            var17 = class171.field3012 + class171.field3012;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class171.field3020[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1243 = 5;
                            var1.field1255 = (var1.field1258 - class120.field2196 << 8) / var13;
                            var1.field1247 = (var1.field1263 - class120.field2196 << 8) / var13;
                            var1.field1256 = (var1.field1249 - class154.field2810 << 8) / var13;
                            var1.field1257 = (var1.field1260 - class154.field2810 << 8) / var13;
                            class54.field872[class44.field732++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method598(int arg0) {
        if (arg0 != -20876) {
            field1413 = 88;
        }
        field1419 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIILtg;)[Lqh;")
    public static final class24[] method599(boolean arg0, int arg1, int arg2, class75 arg3) {
        field1414++;
        if (arg0) {
            field1412 = -24;
        }
        return class43.method341(arg3, -1, arg2, arg1) ? class134.method1008(false) : null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(BI)I")
    public static final int method600(byte arg0, int arg1) {
        int var2 = -17 % ((arg0 + 40) / 50);
        field1421++;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = arg1 * 6 - 61440;
        int var5 = (arg1 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)I")
    public final int method601(int arg0, byte arg1) {
        if (this.field1422 != null) {
            arg0 = (int) ((long) this.field1411 * (long) arg0 / (long) this.field1420);
        }
        int var3 = -109 % ((arg1 - 62) / 49);
        field1415++;
        return arg0;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(II)V")
    public class80(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class76.method585(arg0, arg1, 0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1411 = var5;
            this.field1420 = var4;
            this.field1422 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1422[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B[B)[B")
    public final byte[] method602(byte arg0, byte[] arg1) {
        if (arg0 < 10) {
            this.method601(-77, (byte) -77);
        }
        if (this.field1422 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1411 / (long) this.field1420) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1422[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1411 + var5;
                int var14 = var13 / this.field1420;
                var6 += var14;
                var5 = var13 - this.field1420 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field1416++;
        return arg1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIBZI)V")
    public static final void method603(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        class202.field3444++;
        field1418++;
        if (!arg4) {
            class83.method622(true, (byte) 40);
            class238.method1627(-128, true);
            class83.method622(false, (byte) 40);
        }
        class238.method1627(-103, false);
        if (!arg4) {
            class54.method399((byte) 86);
        }
        class182.method1254((byte) -112);
        if (class207.field3549 == 1) {
            int var6 = class113.field2002;
            int var7 = class243.field4219 + class115.field2067 & 0x7FF;
            if (class64.field1051 / 256 > var6) {
                var6 = class64.field1051 / 256;
            }
            if (class137.field2429[4] && (class222.field3839[4] + 128) > var6) {
                var6 = class222.field3839[4] + 128;
            }
            class217.method1494(var7, arg2, class83.field1464, false, class114.field2043, var6, class70.method480(class265.field4640, (byte) 126, class163.field2943.field4492, class163.field2943.field4466) - 50, 600 - -(var6 * 3));
        }
        int var8 = class122.field2239;
        int var9 = class6.field86;
        int var10 = class224.field3864;
        int var11 = class81.field1430;
        int var12 = class20.field361;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class137.field2429[var13]) {
                int var19 = (int) ((double) (-class115.field2051[var13]) + Math.random() * (double) (class115.field2051[var13] * 2 + 1) + Math.sin((double) class108.field1929[var13] / 100.0D * (double) class190.field3281[var13]) * (double) class222.field3839[var13]);
                if (var13 == 2) {
                    class20.field361 += var19;
                }
                if (var13 == 4) {
                    class224.field3864 += var19;
                    if (class224.field3864 < 128) {
                        class224.field3864 = 128;
                    }
                    if (class224.field3864 > 383) {
                        class224.field3864 = 383;
                    }
                }
                if (var13 == 3) {
                    class81.field1430 = class81.field1430 + var19 & 0x7FF;
                }
                if (var13 == 0) {
                    class6.field86 += var19;
                }
                if (var13 == 1) {
                    class122.field2239 += var19;
                }
            }
        }
        class158.method1141(16);
        class128.method964(arg1, arg5, arg0 + arg1, arg2 + arg5);
        class160.method1152();
        if (class97.field1672 || class189.field3267 < arg1 || class189.field3267 >= arg1 + arg0 || class200.field3430 < arg5 || class200.field3430 >= arg5 + arg2) {
            class115.field2061 = 0;
            class230.field3980 = false;
        } else {
            int var14 = class170.field2996;
            int var15 = class47.field786;
            class14.field269 = (class189.field3267 - arg1) * (var15 - var14) / arg0 + var14;
            int var16 = class107.field1922;
            class115.field2061 = 0;
            class230.field3980 = true;
            int var17 = class47.field790;
            class68.field1087 = (var17 - var16) * (class200.field3430 - arg5) / arg2 + var16;
        }
        class115.method867(88);
        byte var18 = class90.method661(26483) == 2 ? (byte) class202.field3444 : 1;
        class128.method967(arg1, arg5, arg0, arg2, 0);
        class18.method173(class6.field86, class122.field2239, class20.field361, class224.field3864, class81.field1430, class205.field3493, class237.field4092, class23.field472, class194.field3371, class166.field2967, class103.field1824, class265.field4640 + 1, var18, class163.field2943.field4492 >> 7, class163.field2943.field4466 >> 7);
        class115.method867(112);
        class88.method656();
        class245.method1693((byte) -74, 256, 256, arg1, arg2, arg5, arg0);
        class23.method246(arg0, arg1, 256, 256, arg2, arg5, 111);
        if (arg3 >= -103) {
            return;
        }
        ((class16) class160.field2897).method140((byte) -32, class199.field3418);
        class221.method1525(arg5, arg2, arg1, arg0, 100);
        class20.field361 = var12;
        class224.field3864 = var10;
        class81.field1430 = var11;
        class6.field86 = var9;
        class122.field2239 = var8;
        if (class173.field3032 && class18.method171(true, false, -928) == 0) {
            class173.field3032 = false;
        }
        if (class173.field3032) {
            class128.method967(arg1, arg5, arg0, arg2, 0);
            class92.method680(false, class106.field1909, true);
        }
        if (!arg4 && !class173.field3032 && !class97.field1672 && class189.field3267 >= arg1 && arg0 + arg1 > class189.field3267 && arg5 <= class200.field3430 && arg2 + arg5 > class200.field3430) {
            class199.method1355(class189.field3267, class200.field3430, arg1, arg0, 587, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)Lba;")
    public static final class132 method604(int arg0, int arg1) {
        field1423++;
        class132 var2 = (class132) class230.field3977.method1307((byte) -69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class143.field2518.method571(class155.method1128(arg1, -100), class88.method655(arg1, arg0 ^ arg0), -79);
        class132 var4 = new class132();
        if (var3 != null) {
            var4.method991(0, new class216(var3));
        }
        class230.field3977.method1312(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIB)Laf;")
    public static final class150 method605(int arg0, int arg1, byte arg2) {
        field1410++;
        class150 var3 = (class150) class93.field1623.method371((byte) 61);
        int var4 = -80 % ((arg2 + 28) / 63);
        while (var3 != null) {
            if (var3.field2774 && var3.method1112(arg1, (byte) 118, arg0)) {
                return var3;
            }
            var3 = (class150) class93.field1623.method370(true);
        }
        return null;
    }
}
