import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class135 extends class120 {

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field1964 = 0;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
    public static int[] field1963 = new int[25];

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "J")
    public long field1958;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lac;")
    public class135 field1955;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lac;")
    public class135 field1959;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Ljg;")
    public static class168 field1965;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lml;")
    public static class289 field1961;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[[S")
    public static short[][] field1956;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method912(int arg0) {
        field1962++;
        if (this.field1959 == null) {
            return;
        }
        int var2 = 104 / ((arg0 + 81) / 34);
        this.field1959.field1955 = this.field1955;
        this.field1955.field1959 = this.field1959;
        this.field1955 = null;
        this.field1959 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIBLef;I)V")
    public static final void method913(int arg0, int arg1, byte arg2, class214 arg3, int arg4) {
        class10.method63(arg2 + 13450);
        class127.method861(arg0, arg1, arg3.field3473 + arg0, arg3.field3369 + arg1);
        if (class10.field138 == 2 || class10.field138 == 5 || class72.field1028 == null) {
            class127.method877(arg0, arg1, 0, arg3.field3394, arg3.field3496);
        } else {
            int var5 = class68.field957 + class29.field392 & 0x7FF;
            int var6 = class149.field2227.field1226 / 32 + 48;
            int var7 = 464 - (class149.field2227.field1273 / 32);
            ((class12) class72.field1028).method70(arg0, arg1, arg3.field3473, arg3.field3369, var6, var7, var5, class116.field1721 + 256, arg3.field3394, arg3.field3496);
            if (class141.field2065 != null) {
                for (int var8 = 0; var8 < class141.field2065.field1110; var8++) {
                    if (class141.field2065.method529(66, var8)) {
                        int var9 = (class141.field2065.field1105[var8] - class126.field1869) * 4 + 2 - (class149.field2227.field1226 / 32);
                        int var10 = (class141.field2065.field1096[var8] - class246.field3943) * 4 + 2 - (class149.field2227.field1273 / 32);
                        int var11 = class171.field2675[var5];
                        int var12 = class171.field2680[var5];
                        int var13 = var12 * 256 / (class116.field1721 + 256);
                        int var14 = var11 * 256 / (class116.field1721 + 256);
                        int var15 = var10 * var14 + (var9 * var13) >> 16;
                        int var16 = var10 * var13 - (var9 * var14) >> 16;
                        class188 var17 = class144.field2118;
                        if (class141.field2065.method523(var8, 25488) == 1) {
                            var17 = class279.field4433;
                        }
                        if (class141.field2065.method523(var8, 25488) == 2) {
                            var17 = class232.field3734;
                        }
                        int var18 = var17.method1305(class141.field2065.field1112[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg3.field3473 <= var19 && arg3.field3473 >= var19 && -arg3.field3369 <= var16 && arg3.field3369 >= var16) {
                            int var20 = 16777215;
                            if (class141.field2065.field1095[var8] != -1) {
                                var20 = class141.field2065.field1095[var8];
                            }
                            class127.method868(arg3.field3394, arg3.field3496);
                            var17.method1327(class141.field2065.field1112[var8], arg0 + (arg3.field3473 / 2) + var19, arg3.field3369 / 2 + arg1 - var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            class127.method858();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class194.field3057; var21++) {
                int var56 = class26.field362[var21] * 4 + 2 - (class149.field2227.field1226 / 32);
                int var57 = class257.field4152[var21] * 4 + 2 - class149.field2227.field1273 / 32;
                class181 var58 = class25.method224(class249.field3991[var21], 0);
                if (var58.field2803 != null) {
                    var58 = var58.method1268(256);
                    if (var58 == null || var58.field2847 == -1) {
                        continue;
                    }
                }
                class45.method339(var57, 99, class25.field309[var58.field2847], arg0, arg3, arg1, var56);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class46 var53 = class243.field3891[class276.field4398][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class149.field2227.field1226 / 32);
                        int var55 = var52 * 4 + 2 - (class149.field2227.field1273 / 32);
                        class45.method339(var55, 94, class96.field1483[0], arg0, arg3, arg1, var54);
                    }
                }
            }
            for (int var23 = 0; var23 < class236.field3774; var23++) {
                class56 var48 = class100.field1566[class248.field3967[var23]];
                if (var48 != null && var48.method409(0)) {
                    class136 var49 = var48.field793;
                    if (var49 != null && var49.field1987 != null) {
                        var49 = var49.method928(arg2 ^ 0xFFFFFFBD);
                    }
                    if (var49 != null && var49.field2023 && var49.field2010) {
                        int var50 = var48.field1226 / 32 - (class149.field2227.field1226 / 32);
                        int var51 = var48.field1273 / 32 - (class149.field2227.field1273 / 32);
                        if (var49.field1973 == -1) {
                            class45.method339(var51, 104, class96.field1483[1], arg0, arg3, arg1, var50);
                        } else {
                            class45.method339(var51, 97, class25.field309[var49.field1973], arg0, arg3, arg1, var50);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class73.field1040; var24++) {
                class186 var38 = class153.field2277[class8.field117[var24]];
                if (var38 != null && var38.method409(0)) {
                    int var39 = var38.field1226 / 32 - (class149.field2227.field1226 / 32);
                    int var40 = var38.field1273 / 32 - (class149.field2227.field1273 / 32);
                    long var41 = class162.method1116(var38.field2912, (byte) 60);
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class228.field3692; var44++) {
                        if (class143.field2101[var44] == var41 && class143.field2096[var44] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class172.field2693; var46++) {
                        if (client.field2329[var46].field1750 == var41) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class149.field2227.field2936 != 0 && var38.field2936 != 0 && class149.field2227.field2936 == var38.field2936) {
                        var47 = true;
                    }
                    if (var43) {
                        class45.method339(var40, 119, class96.field1483[3], arg0, arg3, arg1, var39);
                    } else if (var45) {
                        class45.method339(var40, arg2 ^ 0xFFFFFFD0, class96.field1483[5], arg0, arg3, arg1, var39);
                    } else if (var47) {
                        class45.method339(var40, 52, class96.field1483[4], arg0, arg3, arg1, var39);
                    } else {
                        class45.method339(var40, 61, class96.field1483[2], arg0, arg3, arg1, var39);
                    }
                }
            }
            int var25 = 0;
            class194[] var26 = class144.field2129;
            while (var26.length > var25) {
                class194 var29 = var26[var25];
                if (var29 != null && var29.field3050 != 0 && class111.field1684 % 20 < 10) {
                    if (var29.field3050 == 1 && var29.field3045 >= 0 && class100.field1566.length > var29.field3045) {
                        class56 var30 = class100.field1566[var29.field3045];
                        if (var30 != null) {
                            int var31 = var30.field1273 / 32 - (class149.field2227.field1273 / 32);
                            int var32 = var30.field1226 / 32 - (class149.field2227.field1226 / 32);
                            class59.method424(var32, arg1, arg3, var31, false, arg0, var29.field3053);
                        }
                    }
                    if (var29.field3050 == 2) {
                        int var33 = (var29.field3054 - class126.field1869) * 4 + 2 - (class149.field2227.field1226 / 32);
                        int var34 = (var29.field3047 - class246.field3943) * 4 + 2 - (class149.field2227.field1273 / 32);
                        class59.method424(var33, arg1, arg3, var34, false, arg0, var29.field3053);
                    }
                    if (var29.field3050 == 10 && var29.field3045 >= 0 && class153.field2277.length > var29.field3045) {
                        class186 var35 = class153.field2277[var29.field3045];
                        if (var35 != null) {
                            int var36 = var35.field1226 / 32 - class149.field2227.field1226 / 32;
                            int var37 = var35.field1273 / 32 - class149.field2227.field1273 / 32;
                            class59.method424(var36, arg1, arg3, var37, false, arg0, var29.field3053);
                        }
                    }
                }
                var25++;
            }
            if (class79.field1142 != 0) {
                int var27 = class203.field3171 * 4 + 2 - (class149.field2227.field1273 / 32);
                int var28 = class79.field1142 * 4 + 2 - class149.field2227.field1226 / 32;
                class45.method339(var27, 59, class190.field3011, arg0, arg3, arg1, var28);
            }
            class127.method876(arg3.field3473 / 2 + arg0 - 1, arg3.field3369 / 2 + arg1 + -1, 3, 3, 16777215);
        }
        field1954++;
        if (arg2 != -79) {
            field1960 = -27;
        }
        class80.field1162[arg4] = true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method914(byte arg0) {
        if (arg0 > -99) {
            field1963 = null;
        }
        field1961 = null;
        field1956 = null;
        field1965 = null;
        field1963 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[B)I")
    public static final int method915(int arg0, int arg1, int arg2, byte[] arg3) {
        field1966++;
        int var4 = -1;
        if (arg1 >= -110) {
            field1963 = null;
        }
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class234.field3753[(arg3[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
    public static final void method916(int arg0, byte arg1, int arg2) {
        class13.field165.method892(251, (byte) -97);
        field1957++;
        class175.field2737++;
        class13.field165.method166(arg0, arg1 ^ 0xFFFFFFF5);
        if (arg1 != 8) {
            method916(31, (byte) 4, 74);
        }
        class13.field165.method223(-1720191288, arg2);
    }
}
