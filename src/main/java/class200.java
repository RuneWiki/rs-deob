import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class200 extends class183 {

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Ldj;")
    public static class44 field3528 = class89.method650(255, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Ldj;")
    public static class44 field3532 = class89.method650(255, "::noclip");

    @OriginalMember(owner = "client!t", name = "E", descriptor = "Lrh;")
    public static class188 field3542 = new class188(5000);

    @OriginalMember(owner = "client!t", name = "F", descriptor = "Ldj;")
    public static class44 field3543 = class89.method650(255, "Hier wechseln");

    @OriginalMember(owner = "client!t", name = "H", descriptor = "[J")
    public static long[] field3545 = new long[1000];

    @OriginalMember(owner = "client!t", name = "G", descriptor = "Ll;")
    public static class120 field3544 = new class120(32);

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "Lnf;")
    public static class147 field3540;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lt;")
    public class200 field3529;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lt;")
    public class200 field3531;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Lwc;")
    public static class233 field3538;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Lc;")
    public static class23 field3537;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "Lac;")
    public static class4 field3547;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public final void method1288(boolean arg0) {
        field3533++;
        if (this.field3531 == null) {
            return;
        }
        this.field3531.field3529 = this.field3529;
        if (!arg0) {
            this.field3529.field3531 = this.field3531;
            this.field3531 = null;
            this.field3529 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static final void method1289(byte arg0) {
        class116.field2070 = new int[104];
        class130.field2331 = new int[104];
        class221.field4005 = new byte[4][104][104];
        if (arg0 > -36) {
            field3538 = null;
        }
        class88.field1683 = 99;
        field3535++;
        class216.field3928 = new int[4][105][105];
        class94.field1740 = new int[104];
        class165.field2845 = new byte[4][104][104];
        class201.field3564 = new byte[4][104][104];
        class156.field2706 = new byte[4][105][105];
        class214.field3893 = new int[104];
        class78.field1514 = new int[104];
        class30.field526 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)Z")
    public static final boolean method1290(int arg0, int arg1) {
        if (arg1 != 104) {
            field3538 = null;
        }
        field3536++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
    public static final void method1291(byte arg0, int arg1) {
        class157.field2731 = arg1;
        if (arg0 > -50) {
            method1293(-114, 92, -52, 23, 78);
        }
        field3534++;
        class77.field1493 = 50;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field3547 = null;
        field3537 = null;
        field3532 = null;
        field3543 = null;
        field3544 = null;
        field3528 = null;
        field3545 = null;
        field3540 = null;
        field3538 = null;
        if (arg0 != 4996) {
            field3542 = null;
        }
        field3542 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3530++;
        int var5 = 0;
        int var6 = -arg4;
        if (arg0 != 14) {
            return;
        }
        int var7 = arg4;
        int var8 = class201.method1296(class70.field1337, -128, arg1 + arg4, class70.field1321);
        int var9 = -1;
        int var10 = class201.method1296(class70.field1337, -125, arg1 - arg4, class70.field1321);
        class42.method290(class108.field1979[arg2], -7, var10, var8, arg3);
        while (var7 > var5) {
            var9 += 2;
            var6 += var9;
            if (var6 > 0) {
                var7--;
                int var11 = arg2 - var7;
                var6 -= var7 << 1;
                int var12 = arg2 + var7;
                if (var12 >= class14.field267 && class57.field1068 >= var11) {
                    int var13 = class201.method1296(class70.field1337, -128, arg1 + var5, class70.field1321);
                    int var14 = class201.method1296(class70.field1337, -128, arg1 - var5, class70.field1321);
                    if (var12 <= class57.field1068) {
                        class42.method290(class108.field1979[var12], arg0 ^ 0xFFFFFFF7, var14, var13, arg3);
                    }
                    if (class14.field267 <= var11) {
                        class42.method290(class108.field1979[var11], -7, var14, var13, arg3);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class14.field267 && var15 <= class57.field1068) {
                int var17 = class201.method1296(class70.field1337, -128, arg1 + var7, class70.field1321);
                int var18 = class201.method1296(class70.field1337, -125, arg1 - var7, class70.field1321);
                if (class57.field1068 >= var16) {
                    class42.method290(class108.field1979[var16], -7, var18, var17, arg3);
                }
                if (class14.field267 <= var15) {
                    class42.method290(class108.field1979[var15], -7, var18, var17, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
    public static final void method1294(int arg0, int arg1) {
        field3541++;
        if (arg1 == -3) {
            class191.method1198(class76.field1464, -704657370, class201.field3548, class2.field36);
        } else if (arg1 == -2) {
            class191.method1198(class76.field1488, -704657370, class7.field138, class76.field1461);
        } else if (arg1 == -1) {
            class191.method1198(class76.field1444, -704657370, class201.field3557, class9.field199);
        } else if (arg1 == 3) {
            class191.method1198(class76.field1450, -704657370, class45.field852, class76.field1471);
        } else if (arg1 == 4) {
            class191.method1198(class76.field1447, -704657370, class53.field951, class124.field2234);
        } else if (arg1 == 5) {
            class191.method1198(class76.field1452, -704657370, class81.field1583, class194.field3389);
        } else if (arg1 == 6) {
            class191.method1198(class76.field1457, arg0 - 704653690, class21.field362, class201.field3569);
        } else if (arg1 == 7) {
            class191.method1198(class76.field1449, -704657370, class21.field363, class79.field1519);
        } else if (arg1 == 8) {
            class191.method1198(class76.field1473, -704657370, class114.field2033, class210.field3755);
        } else if (arg1 == 9) {
            class191.method1198(class76.field1463, -704657370, class139.field2499, class115.field2049);
        } else if (arg1 == 10) {
            class191.method1198(class76.field1479, -704657370, class156.field2708, class210.field3750);
        } else if (arg1 == 11) {
            class191.method1198(class76.field1443, -704657370, class215.field3923, class202.field3603);
        } else if (arg1 == 12) {
            class191.method1198(class76.field1459, -704657370, class46.field867, class112.field2017);
        } else if (arg1 == 13) {
            class191.method1198(class76.field1475, -704657370, class201.field3553, class63.field1175);
        } else if (arg1 == 14) {
            class191.method1198(class76.field1477, -704657370, class197.field3500, class179.field3102);
        } else if (arg1 == 16) {
            class191.method1198(class76.field1465, -704657370, class157.field2738, class32.field559);
        } else if (arg1 == 17) {
            class191.method1198(class76.field1476, -704657370, class108.field1988, class151.field2637);
        } else if (arg1 == 18) {
            class191.method1198(class76.field1482, -704657370, class44.field844, class66.field1243);
        } else if (arg1 == 19) {
            class191.method1198(class21.field361, -704657370, class77.field1491, class239.field4416);
        } else if (arg1 == 20) {
            class191.method1198(class76.field1478, arg0 - 704653690, class201.field3563, class165.field2830);
        } else if (arg1 == 22) {
            class191.method1198(class76.field1468, -704657370, class186.field3214, class169.field2920);
        } else if (arg1 == 23) {
            class191.method1198(class76.field1446, arg0 - 704653690, class197.field3493, class198.field3508);
        } else if (arg1 == 24) {
            class191.method1198(class76.field1453, -704657370, class211.field3760, class235.field4370);
        } else if (arg1 == 25) {
            class191.method1198(class76.field1467, -704657370, class201.field3551, class48.field882);
        } else if (arg1 == 26) {
            class191.method1198(class76.field1481, -704657370, class19.field329, class49.field915);
        } else if (arg1 == 27) {
            class191.method1198(class76.field1460, -704657370, class216.field3925, class76.field1487);
        } else {
            class191.method1198(class76.field1484, arg0 - 704653690, class201.field3556, class115.field2051);
        }
        class62.method467(10, (byte) 57);
        if (arg0 != -3680) {
            field3545 = null;
        }
    }
}
