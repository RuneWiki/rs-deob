import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 extends class13 {

    @OriginalMember(owner = "client!jf", name = "Tb", descriptor = "Lpe;")
    public static class109 field1369 = class141.method1120("Ihr Spielkonto wurde deaktiviert)3", 0);

    @OriginalMember(owner = "client!jf", name = "cc", descriptor = "[Z")
    public static boolean[] field1378 = new boolean[8];

    @OriginalMember(owner = "client!jf", name = "Sb", descriptor = "I")
    public static int field1368 = 0;

    @OriginalMember(owner = "client!jf", name = "bc", descriptor = "Lcd;")
    public static class19 field1377 = new class19();

    @OriginalMember(owner = "client!jf", name = "fc", descriptor = "I")
    public static int field1381 = 0;

    @OriginalMember(owner = "client!jf", name = "ec", descriptor = "Lpe;")
    public static class109 field1380 = class141.method1120("mapfunction", 0);

    @OriginalMember(owner = "client!jf", name = "Mb", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!jf", name = "Nb", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!jf", name = "Ob", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!jf", name = "Pb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!jf", name = "Qb", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!jf", name = "Rb", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client!jf", name = "Ub", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!jf", name = "Vb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!jf", name = "Wb", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!jf", name = "Xb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!jf", name = "Yb", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!jf", name = "ac", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!jf", name = "dc", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!jf", name = "Zb", descriptor = "Lab;")
    private class3 field1375;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(Z)I")
    public final int method524(boolean arg0) {
        if (!arg0) {
            return -62;
        } else {
            ++field1376;
            return 255 & super.field279[super.field309++] + -this.field1375.method25(-108);
        }
    }

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "(I)V")
    public static final void method525(int arg0) {
        ++field1365;
        if (class153.field3363 != null) {
            class153.field3363.method83((byte) -114);
            class153.field3363 = null;
        }
        class131.method1060(-25390);
        class147.field3201.method682();
        for (int var1 = 0; var1 < 4; ++var1) {
            class109.field2318[var1].method607((byte) 28);
        }
        if (arg0 != 1001) {
            field1380 = null;
        }
        System.gc();
        class79.method634(-1, 2);
        class125.field2770 = -1;
        class120.field2664 = false;
        class11.method90(-127);
        class118.method958(false, 10);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(BI)I")
    public final int method526(byte arg0, int arg1) {
        ++field1362;
        int var3 = this.field1367 >> 3;
        if (arg0 != 127) {
            this.method535(-44, -34);
        }
        int var4 = 0;
        int var5 = -(this.field1367 & 7) + 8;
        this.field1367 += arg1;
        while (~arg1 < ~var5) {
            var4 += (class35.field778[var5] & super.field279[var3++]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg1 != ~var5) {
            var6 = (super.field279[var3] >> -arg1 + var5 & class35.field778[arg1]) + var4;
        } else {
            var6 = (super.field279[var3] & class35.field778[var5]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
    public class68(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(B)V")
    public final void method527(byte arg0) {
        if (arg0 >= -19) {
            this.method527((byte) -14);
        }
        ++field1372;
        this.field1367 = super.field309 * 8;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(B)V")
    public static void method528(byte arg0) {
        field1377 = null;
        field1378 = null;
        field1380 = null;
        field1369 = null;
        if (arg0 >= -117) {
            field1377 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
    public static final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class66.field1335[0].method539(arg2, arg5);
        int var6 = (arg1 + -32) * arg1 / arg3;
        if (~var6 > -9) {
            var6 = 8;
        }
        class66.field1335[1].method539(arg2, arg1 + arg5 + -16);
        class140.method1118(arg2, arg5 + 16, 16, arg1 - 32, class128.field2845);
        ++field1363;
        int var7 = (-32 - var6 + arg1) * arg4 / (-arg1 + arg3);
        class140.method1118(arg2, arg5 + 16 - -var7, 16, var6, class157.field3625);
        class140.method1114(arg2, arg5 + 16 + var7, var6, class78.field1630);
        class140.method1114(arg2 + 1, arg5 + 16 + var7, var6, class78.field1630);
        class140.method1104(arg2, arg5 + 16 - -var7, 16, class78.field1630);
        class140.method1104(arg2, arg5 + 17 + var7, 16, class78.field1630);
        if (arg0 != 5347) {
            method529(-72, 56, 26, 6, 80, -114);
        }
        class140.method1114(arg2 - -15, arg5 - (-16 - var7), var6, class44.field942);
        class140.method1114(arg2 + 14, arg5 + 17 + var7, var6 + -1, class44.field942);
        class140.method1104(arg2, arg5 + var7 + var6 + 15, 16, class44.field942);
        class140.method1104(arg2 + 1, arg5 - -var7 + 14 + var6, 15, class44.field942);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)Z")
    public static final boolean method530(int arg0, int arg1, int arg2) {
        if (arg2 < 13) {
            return true;
        } else {
            ++field1366;
            if (arg0 == 11) {
                arg0 = 10;
            }
            class148 var3 = class89.method736(arg1, 11893);
            if (arg0 >= 5 && arg0 <= 8) {
                arg0 = 4;
            }
            return var3.method1151(arg0, false);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[I)V")
    public final void method531(int arg0, int[] arg1) {
        if (arg0 != 7225) {
            this.method536((byte) 51);
        }
        ++field1374;
        this.field1375 = new class3(arg1);
    }

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "(I)V")
    public static final void method532(int arg0) {
        if (arg0 != -32) {
            method528((byte) 84);
        }
        ++field1370;
        if (class114.field2526 == null) {
            if (class66.field1334 == null) {
                int var1 = class19.field484;
                if (class3.field64) {
                    if (~var1 != -2) {
                        int var6 = class82.field1754;
                        int var7 = class48.field992;
                        if (var6 < class71.field1430 - 10 || var6 > class71.field1430 + class57.field1147 + 10 || ~(class91.field1945 - 10) < ~var7 || ~(class17.field435 - -10 + class91.field1945) > ~var7) {
                            class3.field64 = false;
                            class8.method76(class17.field435, class57.field1147, (byte) 105, class71.field1430, class91.field1945);
                        }
                    }
                    if (var1 != 1) {
                        return;
                    }
                    int var8 = class71.field1430;
                    int var9 = class57.field1147;
                    int var10 = class91.field1945;
                    int var11 = class115.field2538;
                    int var12 = -1;
                    int var13 = class120.field2671;
                    for (int var14 = 0; var14 < class63.field1302; ++var14) {
                        int var15 = (class63.field1302 - var14 + -1) * 15 + var10 + 31;
                        if (~var11 < ~var8 && ~var11 > ~(var8 + var9) && ~(var15 - 13) > ~var13 && var15 + 3 > var13) {
                            var12 = var14;
                        }
                    }
                    if (~var12 != 0) {
                        class92.method767((byte) -98, var12);
                    }
                    class3.field64 = false;
                    class8.method76(class17.field435, class57.field1147, (byte) 105, class71.field1430, class91.field1945);
                } else {
                    if (~var1 == -2 && ~class63.field1302 < -1) {
                        int var2 = class149.field3285[class63.field1302 + -1];
                        if (~var2 == -2 || var2 == 15 || ~var2 == -21 || var2 == 26 || var2 == 33 || var2 == 35 || ~var2 == -31 || ~var2 == -11 || var2 == 46 || ~var2 == -4 || var2 == 19 || var2 == 1001) {
                            int var3 = class135.field2947[class63.field1302 + -1];
                            int var4 = class102.field2148[class63.field1302 + -1];
                            class154 var5 = class44.method403(var3, true);
                            if (class35.method356(class136.method1084(0, var5), arg0 + 2106045244) || class78.method628((byte) -51, class136.method1084(0, var5))) {
                                class146.field3194 = false;
                                class24.field565 = 0;
                                if (class114.field2526 != null) {
                                    class138.method1092(0, class114.field2526);
                                }
                                class114.field2526 = class44.method403(var3, true);
                                class88.field1866 = var4;
                                class60.field1178 = class120.field2671;
                                class133.field2898 = class115.field2538;
                                class138.method1092(arg0 + 32, class114.field2526);
                                return;
                            }
                        }
                    }
                    if (var1 == 1 && (class127.field2827 == 1 && class63.field1302 > 2 || class23.method221(arg0 + 2032, class63.field1302 + -1))) {
                        var1 = 2;
                    }
                    if (~var1 == -2 && ~class63.field1302 < -1) {
                        class92.method767((byte) -33, class63.field1302 + -1);
                    }
                    if (var1 == 2 && class63.field1302 > 0) {
                        class42.method389(0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "(II)I")
    public final int method533(int arg0, int arg1) {
        ++field1371;
        if (arg1 != 31) {
            field1368 = -98;
        }
        return arg0 * 8 + -this.field1367;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(III)V")
    public static final void method534(int arg0, int arg1, int arg2) {
        ++field1379;
        class19 var3 = class92.field1987[class75.field1513][arg0][arg1];
        if (var3 == null) {
            class147.field3201.method666(class75.field1513, arg0, arg1);
        } else {
            int var4 = -99999999;
            class131 var5 = (class131) var3.method195((byte) 116);
            class131 var6 = null;
            while (var5 != null) {
                class112 var11 = class4.method43((byte) 94, var5.field2882);
                int var12 = var11.field2432;
                if (~var11.field2399 == -2) {
                    var12 = (var5.field2870 - -1) * var12;
                }
                if (var4 < var12) {
                    var6 = var5;
                    var4 = var12;
                }
                var5 = (class131) var3.method198((byte) -105);
            }
            if (var6 == null) {
                class147.field3201.method666(class75.field1513, arg0, arg1);
            } else {
                var3.method194(22, var6);
                class131 var7 = (class131) var3.method195((byte) 115);
                class131 var8 = null;
                class131 var9 = null;
                while (var7 != null) {
                    if (~var6.field2882 != ~var7.field2882) {
                        if (var9 == null) {
                            var9 = var7;
                        }
                        if (var7.field2882 != var9.field2882 && var8 == null) {
                            var8 = var7;
                        }
                    }
                    var7 = (class131) var3.method198((byte) -98);
                }
                int var10 = (arg1 << 7) + arg0 - arg2;
                class147.field3201.method667(class75.field1513, arg0, arg1, class126.method1019(arg1 * 128 + 64, arg0 * 128 + 64, 1, class75.field1513), var6, var10, var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(II)V")
    public final void method535(int arg0, int arg1) {
        ++field1364;
        if (arg1 != -25013) {
            field1378 = null;
        }
        super.field279[super.field309++] = (byte) (this.field1375.method25(arg1 + 24905) + arg0);
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "(B)V")
    public final void method536(byte arg0) {
        int var2 = -98 % ((-13 - arg0) / 40);
        ++field1373;
        super.field309 = (this.field1367 + 7) / 8;
    }
}
