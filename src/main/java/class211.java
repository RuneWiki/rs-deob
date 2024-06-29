import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class211 extends class222 {

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    private int field3204;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    private int field3205;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lom;")
    public static class156 field3202 = new class156();

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3209 = " is already on your friend list.";

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3214 = "white:";

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Lom;")
    public static class156 field3208 = new class156();

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3216 = "Face here";

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lhb;")
    public static class318 field3215 = new class318(4);

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "[I")
    public static int[] field3217;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V", line = 7)
    public static void method1466(byte arg0) {
        if (arg0 >= -77) {
            method1470((byte) 74);
        }
        field3208 = null;
        field3209 = null;
        field3202 = null;
        field3217 = null;
        field3216 = null;
        field3214 = null;
        field3215 = null;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V", line = 25)
    public static final void method1467(int arg0) {
        field3207++;
        class207.field3137.method25((byte) 7);
        int var1 = class207.field3137.method24((byte) -122, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class207.field3137.method24((byte) -122, 2);
        int var3 = -25 / ((arg0 - 57) / 39);
        if (var2 == 0) {
            class278.field4234[class230.field3476++] = 2047;
        } else if (var2 == 1) {
            int var12 = class207.field3137.method24((byte) -122, 3);
            class114.field1750.method693(1, -4, var12);
            int var13 = class207.field3137.method24((byte) -122, 1);
            if (var13 == 1) {
                class278.field4234[class230.field3476++] = 2047;
            }
        } else if (var2 == 2) {
            if (class207.field3137.method24((byte) -122, 1) == 1) {
                int var8 = class207.field3137.method24((byte) -122, 3);
                class114.field1750.method693(2, -4, var8);
                int var9 = class207.field3137.method24((byte) -122, 3);
                class114.field1750.method693(2, -4, var9);
            } else {
                int var10 = class207.field3137.method24((byte) -122, 3);
                class114.field1750.method693(0, -4, var10);
            }
            int var11 = class207.field3137.method24((byte) -122, 1);
            if (var11 == 1) {
                class278.field4234[class230.field3476++] = 2047;
            }
        } else if (var2 == 3) {
            int var4 = class207.field3137.method24((byte) -122, 1);
            if (var4 == 1) {
                class278.field4234[class230.field3476++] = 2047;
            }
            class180.field2697 = class207.field3137.method24((byte) -122, 2);
            int var5 = class207.field3137.method24((byte) -122, 7);
            int var6 = class207.field3137.method24((byte) -122, 7);
            int var7 = class207.field3137.method24((byte) -122, 1);
            class114.field1750.method1348(var5, var6, (byte) 109, var7 == 1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIII)V", line = 107)
    public class211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3201 = arg0;
        this.field3204 = arg3;
        this.field3205 = arg1;
        this.field3213 = arg2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)V", line = 119)
    public final void method1042(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3202 = (class156) null;
        }
        field3200++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V", line = 139)
    public static final void method1468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg3) {
            class315.method2160(class40.field488[arg2], arg0, arg3, arg1, 7);
        } else {
            class315.method2160(class40.field488[arg2], arg0, arg1, arg3, 7);
        }
        field3212++;
        int var5 = 98 % ((-arg4 - 3) / 50);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)V", line = 157)
    public final void method1037(int arg0, int arg1, int arg2) {
        field3203++;
        if (arg2 > -66) {
            field3217 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V", line = 168)
    public static final void method1469(int arg0) {
        field3211++;
        int var1 = 56 % ((arg0 + 61) / 58);
        while (true) {
            class164 var2;
            class98 var4;
            do {
                var2 = (class164) class12.field131.method1114(-13454);
                if (var2 == null) {
                    return;
                }
                if (var2.field2479 < 0) {
                    int var3 = -var2.field2479 - 1;
                    if (class234.field3516 == var3) {
                        var4 = class114.field1750;
                    } else {
                        var4 = class241.field3592[var3];
                    }
                } else {
                    int var5 = var2.field2479 - 1;
                    var4 = class187.field2788[var5];
                }
            } while (var4 == null);
            class22 var6 = class284.method1980(var2.field2475, (byte) 96);
            if (class180.field2697 < 3) {
            }
            int var7;
            int var8;
            if (var2.field2483 == 1 || var2.field2483 == 3) {
                var7 = var6.field293;
                var8 = var6.field330;
            } else {
                var7 = var6.field330;
                var8 = var6.field293;
            }
            int var9 = (var7 + 1 >> 1) + var2.field2476;
            int var10 = (var7 >> 1) + var2.field2476;
            int var11 = (var8 >> 1) + var2.field2469;
            int[][] var12 = class294.field4502[class180.field2697];
            int var13 = (var8 + 1 >> 1) + var2.field2469;
            int var14 = var12[var9][var11] + var12[var10][var13] + var12[var10][var11] + var12[var9][var13] >> 2;
            int var15 = class44.field561[var2.field2485];
            class233 var16 = null;
            if (var15 == 0) {
                class163 var17 = class300.method2091(class180.field2697, var2.field2476, var2.field2469);
                if (var17 != null) {
                    var16 = var17.field2451;
                }
            } else if (var15 == 1) {
                class226 var20 = class8.method30(class180.field2697, var2.field2476, var2.field2469);
                if (var20 != null) {
                    var16 = var20.field3450;
                }
            } else if (var15 == 2) {
                class311 var19 = class187.method1283(class180.field2697, var2.field2476, var2.field2469);
                if (var19 != null) {
                    var16 = var19.field4728;
                }
            } else if (var15 == 3) {
                class187 var18 = class179.method1235(class180.field2697, var2.field2476, var2.field2469);
                if (var18 != null) {
                    var16 = var18.field2781;
                }
            }
            if (var16 != null) {
                class38.method261(var2.field2470 + 1, var2.field2482 + 1, 0, -1, var2.field2476, 0, var15, -849, var2.field2469, class180.field2697);
                var4.field1517 = var16;
                var4.field1476 = var2.field2469 * 128 + var8 * 64;
                var4.field1512 = var14;
                var4.field1524 = var2.field2476 * 128 + var7 * 64;
                int var21 = var2.field2477;
                var4.field1542 = var2.field2482 + class304.field4641;
                int var22 = var2.field2478;
                var4.field1528 = class304.field4641 + var2.field2470;
                if (var21 > var22) {
                    int var23 = var21;
                    var21 = var22;
                    var22 = var23;
                }
                int var24 = var2.field2472;
                int var25 = var2.field2471;
                var4.field1544 = var2.field2476 + var21;
                if (var25 < var24) {
                    int var26 = var24;
                    var24 = var25;
                    var25 = var26;
                }
                var4.field1560 = var2.field2469 + var24;
                var4.field1564 = var2.field2476 + var22;
                var4.field1479 = var2.field2469 + var25;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 331)
    public final void method1035(int arg0, int arg1, int arg2) {
        field3210++;
        int var4 = this.field3201 * arg1 >> 12;
        if (arg2 != 0) {
            this.method1035(114, -86, -79);
        }
        int var5 = this.field3213 * arg1 >> 12;
        int var6 = this.field3205 * arg0 >> 12;
        int var7 = this.field3204 * arg0 >> 12;
        class116.method796(var4, var7, this.field3381, (byte) 31, var6, var5);
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V", line = 359)
    public static final void method1470(byte arg0) {
        class97.field1452.method2176((byte) -22);
        field3206++;
        int var1 = -11 / ((arg0 + 62) / 53);
        class274.field4203.method2176((byte) -67);
        class29.field391.method2176((byte) -40);
    }
}
