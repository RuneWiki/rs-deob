import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class59 {

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Lr;")
    private class301 field1160 = new class301();

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lea;")
    private class227 field1162 = new class227();

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Ll;")
    private class328 field1163;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1153 = "white:";

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Ll;")
    public static class328 field1156 = new class328(16);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Lla;")
    public static class157 field1164;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Lqk;", line = 12)
    public final class70 method485(int arg0) {
        field1157++;
        if (arg0 != 2) {
            field1153 = (String) null;
        }
        return this.field1163.method2345((byte) -110);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 29)
    public final void method486(int arg0) {
        field1159++;
        this.field1162.method1582(arg0 - 81);
        if (arg0 != -1) {
            this.method488((byte) 68);
        }
        this.field1163.method2346((byte) -99);
        this.field1160 = new class301();
        this.field1161 = this.field1165;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)Lr;", line = 44)
    public final class301 method487(int arg0, long arg1) {
        if (arg0 < 76) {
            return (class301) null;
        }
        field1158++;
        class301 var4 = (class301) this.field1163.method2344(-1, arg1);
        if (var4 != null) {
            this.field1162.method1585(var4, (byte) -12);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Lqk;", line = 69)
    public final class70 method488(byte arg0) {
        if (arg0 < 54) {
            this.field1160 = (class301) null;
        }
        field1154++;
        return this.field1163.method2336(-101);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([I[ILcb;B[I)V", line = 84)
    public static final void method489(int[] arg0, int[] arg1, class314 arg2, byte arg3, int[] arg4) {
        field1152++;
        if (arg3 >= -85) {
            method489((int[]) null, (int[]) null, (class314) null, (byte) -16, (int[]) null);
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var6 != 0 && arg2.field167.length > var9; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg2.field167[var9] = null;
                    } else {
                        class300 var10 = class258.method1807(var7, 127);
                        class242 var11 = arg2.field167[var9];
                        int var12 = var10.field4872;
                        if (var11 != null) {
                            if (var11.field4045 == var7) {
                                if (var12 == 0) {
                                    var11 = arg2.field167[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field4044 = 1;
                                    var11.field4046 = 0;
                                    var11.field4042 = 0;
                                    var11.field4043 = var8;
                                    var11.field4041 = 0;
                                    class347.method2479(false, (byte) -54, var10, 0, arg2.field199, arg2.field213);
                                } else if (var12 == 2) {
                                    var11.field4042 = 0;
                                }
                            } else if (var10.field4892 >= class258.method1807(var11.field4045, 107).field4892) {
                                var11 = arg2.field167[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class242 var13 = arg2.field167[var9] = new class242();
                            var13.field4043 = var8;
                            var13.field4044 = 1;
                            var13.field4046 = 0;
                            var13.field4045 = var7;
                            var13.field4042 = 0;
                            var13.field4041 = 0;
                            class347.method2479(false, (byte) -124, var10, 0, arg2.field199, arg2.field213);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 183)
    public static void method490(int arg0) {
        field1164 = null;
        field1153 = null;
        if (arg0 <= -71) {
            field1156 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JILr;)V", line = 202)
    public final void method491(long arg0, int arg1, class301 arg2) {
        field1155++;
        if (~this.field1161 == arg1) {
            class301 var5 = this.field1162.method1587(~arg1);
            var5.method535(arg1 - 2800);
            var5.method2152((byte) 93);
            if (this.field1160 == var5) {
                class301 var6 = this.field1162.method1587(0);
                var6.method535(-2801);
                var6.method2152((byte) 55);
            }
        } else {
            this.field1161--;
        }
        this.field1163.method2337(arg2, arg1 + 710, arg0);
        this.field1162.method1585(arg2, (byte) -12);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIII)V", line = 235)
    public static final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1151++;
        class192.field3252 = 0;
        int var7 = -89 % ((-arg1 - 13) / 32);
        for (int var8 = -1; var8 < (class255.field4184 + class252.field4144); var8++) {
            class88 var9 = null;
            class6 var10;
            if (var8 < 0) {
                var10 = class96.field1750;
            } else if (var8 >= class252.field4144) {
                var10 = class149.field2533[class23.field570[var8 - class252.field4144]];
                var9 = ((class314) var10).field5107;
                if (var9.field1552 != null) {
                    var9 = var9.method681((byte) 15);
                    if (var9 == null) {
                        continue;
                    }
                }
            } else {
                var10 = class182.field3151[class22.field556[var8]];
            }
            if (var10.method45((byte) -95)) {
                class231.method1614(arg4 >> 1, var10, arg0, arg3, 0, var10.method55((byte) 91), arg2 >> 1);
                if (class104.field1907 >= 0) {
                    if (var10.field122 != null && (class252.field4144 <= var8 || class68.field1269 == 0 || class68.field1269 == 3 || class68.field1269 == 1 && class253.method1782(((class98) var10).field1779, (byte) -116)) && class192.field3252 < class79.field1395) {
                        class79.field1405[class192.field3252] = class332.field5297.method636(var10.field122) / 2;
                        class79.field1391[class192.field3252] = class332.field5297.field1450;
                        class79.field1402[class192.field3252] = class104.field1907;
                        class79.field1396[class192.field3252] = class266.field4355;
                        class79.field1401[class192.field3252] = var10.field126;
                        class79.field1390[class192.field3252] = var10.field145;
                        class79.field1397[class192.field3252] = var10.field217;
                        class79.field1392[class192.field3252] = var10.field122;
                        class192.field3252++;
                    }
                    class75 var11 = class263.field4320[0];
                    int var12 = class266.field4355 + (arg5 - Math.max(class332.field5297.field1446, var11.field1356));
                    if (!var10.field193 && var10.field137 > class267.field4371) {
                        class75 var13 = class263.field4320[1];
                        if (var10 instanceof class314) {
                            class314 var14 = (class314) var10;
                            class75[] var15 = (class75[]) ((class75[]) class7.field228.method893((long) var14.field5107.field1570, 63));
                            if (var15 == null) {
                                var15 = class173.method1227(9773, class99.field1828, var14.field5107.field1570, 0);
                                if (var15 != null) {
                                    class7.field228.method888((long) var14.field5107.field1570, var15, 63);
                                }
                            }
                            if (var15 != null && var15.length == 2) {
                                var13 = var15[1];
                                var11 = var15[0];
                            }
                        }
                        int var16 = class104.field1907 + arg6 - (var11.field1353 >> 1);
                        var11.method568(var16, var12);
                        int var17 = var10.field174 * var11.field1353 / 255;
                        if (class241.field4016) {
                            class337.method2370(var16, var12, var16 + var17, var12 - -var11.field1356);
                        } else {
                            class270.method1902(var16, var12, var16 + var17, var12 - -var11.field1356);
                        }
                        var13.method568(var16, var12);
                        if (class241.field4016) {
                            class337.method2385(arg6, arg5, arg2 + arg6, arg4 + arg5);
                        } else {
                            class270.method1891(arg6, arg5, arg2 + arg6, arg4 + arg5);
                        }
                    }
                    var12 -= 2;
                    if (!var10.field193) {
                        if (class252.field4144 > var8) {
                            class98 var18 = (class98) var10;
                            if (var18.field1780 != -1) {
                                var12 -= 25;
                                class201.field3382[var18.field1780].method568(class104.field1907 + arg6 - 12, var12);
                                var12 -= 2;
                            }
                            if (var18.field1792 != -1) {
                                var12 -= 25;
                                class308.field5035[var18.field1792].method568(class104.field1907 + arg6 - 12, var12);
                                var12 -= 2;
                            }
                        } else if (var9.field1579 >= 0 && var9.field1579 < class308.field5035.length) {
                            var12 -= 25;
                            class75 var19 = class308.field5035[var9.field1579];
                            var19.method568(class104.field1907 + arg6 - (var19.field1353 >> 1), var12);
                            var12 -= 2;
                        }
                    }
                    int var10000;
                    if (!var10 instanceof class98) {
                        int var26 = 0;
                        class68[] var27 = class120.field2140;
                        for (int var28 = 0; var28 < var27.length; var28++) {
                            class68 var29 = var27[var28];
                            if (var29 != null && var29.field1253 == 1 && class23.field570[var8 - class252.field4144] == var29.field1264) {
                                class75 var30 = class138.field2351[var29.field1274];
                                if (var26 < var30.field1356) {
                                    var26 = var30.field1356;
                                }
                                if (class267.field4371 % 20 < 10) {
                                    var30.method568(class104.field1907 + arg6 - 12, -var30.field1356 + var12);
                                }
                            }
                        }
                        if (var26 > 0) {
                            var10000 = var12 - (var26 + 2);
                        }
                    } else if (var8 >= 0) {
                        int var20 = 0;
                        class68[] var21 = class120.field2140;
                        for (int var22 = 0; var22 < var21.length; var22++) {
                            class68 var23 = var21[var22];
                            if (var23 != null && var23.field1253 == 10 && class22.field556[var8] == var23.field1264) {
                                class75 var24 = class138.field2351[var23.field1274];
                                if (var24.field1356 > var20) {
                                    var20 = var24.field1356;
                                }
                                var24.method568(class104.field1907 + arg6 - 12, -var24.field1356 + var12);
                            }
                        }
                        if (var20 > 0) {
                            var10000 = var12 - (var20 + 2);
                        }
                    }
                    for (int var32 = 0; var32 < 4; var32++) {
                        if (var10.field168[var32] > class267.field4371) {
                            int var33 = var10.method55((byte) 56) / 2;
                            class231.method1614(arg4 >> 1, var10, arg0, arg3, 0, var33, arg2 >> 1);
                            if (class104.field1907 > -1) {
                                if (var32 == 1) {
                                    class266.field4355 -= 20;
                                }
                                if (var32 == 2) {
                                    class104.field1907 -= 15;
                                    class266.field4355 -= 10;
                                }
                                if (var32 == 3) {
                                    class104.field1907 += 15;
                                    class266.field4355 -= 10;
                                }
                                class235.field3854[var10.field196[var32]].method568(class104.field1907 + arg6 - 12, arg5 + -12 + class266.field4355);
                                class173.field2877.method629(Integer.toString(var10.field134[var32]), class104.field1907 + arg6 - 1, class266.field4355 + 3 + arg5, 16777215, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var34 = 0; var34 < class336.field5346; var34++) {
            int var35 = class141.field2379[var34];
            class6 var36;
            if (var35 < 2048) {
                var36 = class182.field3151[var35];
            } else {
                var35 -= 2048;
                var36 = class149.field2533[var35];
            }
            int var37 = class363.field5747[var34];
            class6 var38;
            if (var37 < 2048) {
                var38 = class182.field3151[var37];
            } else {
                var37 -= 2048;
                var38 = class149.field2533[var37];
            }
            int var39 = var38.method56(116);
            if (var39 != -1) {
                Object var40 = null;
                class75 var41 = (class75) class23.field573.method893((long) var39, 126);
                if (var41 == null) {
                    class75[] var42 = class173.method1227(9773, class99.field1828, var39, 0);
                    if (var42 != null) {
                        var41 = var42[0];
                        class23.field573.method888((long) var39, var41, 93);
                    }
                }
                if (var41 != null) {
                    int var43 = var36.field222++;
                    class223.method1563(var36.field199, 0, arg0, arg2 >> 1, arg4 >> 1, var36.method49((byte) -103) * 64, var36.field213, arg3, -13663);
                    int var44 = arg6 + class104.field1907 - 18;
                    int var45 = var43 / 4 * 18 + var44;
                    int var46 = class266.field4355 - 16 - 54;
                    int var47 = var43 % 4 * 18 + var46;
                    var41.method568(var45, var47);
                    if (var36 == var38) {
                        if (class241.field4016) {
                            class337.method2387(var45 - 1, var47 + -1, 18, 18, 16776960);
                        } else {
                            class270.method1904(var45 - 1, var47 + -1, 18, 18, 16776960);
                        }
                    }
                    if (var45 <= class57.field1135 && (var45 + var41.field1353) > class57.field1135 && class250.field4111 >= var47 && (var41.field1356 + var47) > class250.field4111) {
                        if (var38 instanceof class98) {
                            class5.field111[0] = (long) var37 << 32;
                        } else {
                            class5.field111[0] = class345.method2431(536870912L, (long) var37 << 32);
                        }
                        class162.field2721 = false;
                        class99.field1817 = 1;
                    }
                }
            }
        }
        for (int var48 = 0; var48 < class192.field3252; var48++) {
            int var49 = class79.field1402[var48];
            int var50 = class79.field1396[var48];
            int var51 = class79.field1405[var48];
            int var52 = class79.field1391[var48];
            boolean var53 = true;
            while (var53) {
                var53 = false;
                for (int var54 = 0; var54 < var48; var54++) {
                    if (class79.field1396[var54] - class79.field1391[var54] < var50 - -2 && class79.field1396[var54] + 2 > -var52 + var50 && (class79.field1405[var54] + class79.field1402[var54]) > (var49 - var51) && (var49 + var51) > (class79.field1402[var54] - class79.field1405[var54]) && class79.field1396[var54] - class79.field1391[var54] < var50) {
                        var50 = class79.field1396[var54] - class79.field1391[var54];
                        var53 = true;
                    }
                }
            }
            class104.field1907 = class79.field1402[var48];
            class266.field4355 = class79.field1396[var48] = var50;
            String var55 = class79.field1392[var48];
            if (class49.field1024 == 0) {
                int var56 = 16776960;
                if (class79.field1401[var48] < 6) {
                    var56 = class96.field1751[class79.field1401[var48]];
                }
                if (class79.field1401[var48] == 6) {
                    var56 = (class223.field3692 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class79.field1401[var48] == 7) {
                    var56 = (class223.field3692 % 20) >= 10 ? 65535 : 255;
                }
                if (class79.field1401[var48] == 8) {
                    var56 = class223.field3692 % 20 < 10 ? 45056 : 8454016;
                }
                if (class79.field1401[var48] == 9) {
                    int var57 = 150 - class79.field1397[var48];
                    if (var57 < 50) {
                        var56 = (var57 * 1280) + 16711680;
                    } else if (var57 < 100) {
                        var56 = 16776960 - ((var57 - 50) * 327680);
                    } else if (var57 < 150) {
                        var56 = var57 * 5 + 65280 - 500;
                    }
                }
                if (class79.field1401[var48] == 10) {
                    int var58 = 150 - class79.field1397[var48];
                    if (var58 < 50) {
                        var56 = (var58 * 5) + 16711680;
                    } else if (var58 < 100) {
                        var56 = 16384000 + 16711935 - var58 * 327680;
                    } else if (var58 < 150) {
                        var56 = ((var58 - 100) * 327680) + 255 + 500 - (var58 * 5);
                    }
                }
                if (class79.field1401[var48] == 11) {
                    int var59 = 150 - class79.field1397[var48];
                    if (var59 < 50) {
                        var56 = 16777215 - var59 * 327685;
                    } else if (var59 < 100) {
                        var56 = (var59 * 327685) - 16318970;
                    } else if (var59 < 150) {
                        var56 = 32768000 + 16777215 - (var59 * 327680);
                    }
                }
                if (class79.field1390[var48] == 0) {
                    class332.field5297.method629(var55, arg6 + class104.field1907, class266.field4355 + arg5, var56, 0);
                }
                if (class79.field1390[var48] == 1) {
                    class332.field5297.method640(var55, class104.field1907 + arg6, class266.field4355 + arg5, var56, 0, class223.field3692);
                }
                if (class79.field1390[var48] == 2) {
                    class332.field5297.method644(var55, class104.field1907 + arg6, class266.field4355 + arg5, var56, 0, class223.field3692);
                }
                if (class79.field1390[var48] == 3) {
                    class332.field5297.method628(var55, class104.field1907 + arg6, class266.field4355 + arg5, var56, 0, class223.field3692, 150 - class79.field1397[var48]);
                }
                if (class79.field1390[var48] == 4) {
                    int var60 = (150 - class79.field1397[var48]) * (class332.field5297.method636(var55) + 100) / 150;
                    if (class241.field4016) {
                        class337.method2370(arg6 + class104.field1907 - 50, arg5, class104.field1907 + arg6 + 50, arg4 + arg5);
                    } else {
                        class270.method1902(class104.field1907 + arg6 - 50, arg5, arg6 + class104.field1907 + 50, arg4 + arg5);
                    }
                    class332.field5297.method619(var55, arg6 + class104.field1907 + 50 - var60, class266.field4355 + arg5, var56, 0);
                    if (class241.field4016) {
                        class337.method2385(arg6, arg5, arg6 + arg2, arg5 - -arg4);
                    } else {
                        class270.method1891(arg6, arg5, arg2 + arg6, arg4 + arg5);
                    }
                }
                if (class79.field1390[var48] == 5) {
                    int var61 = 150 - class79.field1397[var48];
                    if (class241.field4016) {
                        class337.method2370(arg6, arg5 + class266.field4355 - class332.field5297.field1450 - 1, arg2 + arg6, class266.field4355 + arg5 + 5);
                    } else {
                        class270.method1902(arg6, arg5 + class266.field4355 - class332.field5297.field1450 - 1, arg6 - -arg2, class266.field4355 + arg5 + 5);
                    }
                    int var62 = 0;
                    if (var61 < 25) {
                        var62 = var61 - 25;
                    } else if (var61 > 125) {
                        var62 = var61 - 125;
                    }
                    class332.field5297.method629(var55, class104.field1907 + arg6, arg5 - -var62 + class266.field4355, var56, 0);
                    if (class241.field4016) {
                        class337.method2385(arg6, arg5, arg2 + arg6, arg5 - -arg4);
                    } else {
                        class270.method1891(arg6, arg5, arg6 + arg2, arg4 + arg5);
                    }
                }
            } else {
                class332.field5297.method629(var55, class104.field1907 + arg6, class266.field4355 + arg5, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I)V", line = 789)
    public class59(int arg0) {
        this.field1161 = arg0;
        this.field1165 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1163 = new class328(var2);
    }
}
