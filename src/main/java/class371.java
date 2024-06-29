import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class371 {

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "Lkh;")
    private class13 field5527 = new class13(64);

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lul;")
    private class406 field5519;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "Lul;")
    private class406 field5528;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field5520 = -1;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "[I")
    public static int[] field5522 = new int[8];

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
    public static int[] field5531 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "Lgu;")
    public static class412 field5530 = new class412(32);

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Lrc;")
    public final class378 method2325(byte arg0, int arg1) {
        field5525++;
        if (arg0 >= -122) {
            return null;
        }
        class378 var3 = (class378) this.field5527.method87((long) arg1, -2062335807);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field5528.method2536(0, 0, arg1);
        } else {
            var4 = this.field5519.method2536(0, 0, arg1 & 0x7FFF);
        }
        class378 var5 = new class378();
        if (var4 != null) {
            var5.method2377(new class217(var4), (byte) -18);
        }
        if (arg1 >= 32768) {
            var5.method2375((byte) 115);
        }
        this.field5527.method84((long) arg1, var5, (byte) 27);
        return var5;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[[BLjs;)V")
    private static final void method2326(int arg0, byte[][] arg1, class219 arg2) {
        field5526++;
        int var3 = 0;
        if (arg0 != 7) {
            field5522 = null;
        }
        while (var3 < arg2.field3959) {
            class92.method746(980099212);
            for (int var4 = 0; var4 < (class69.field976 >> 3); var4++) {
                for (int var5 = 0; var5 < class285.field4328 >> 3; var5++) {
                    int var6 = class294.field4484[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field3957 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFC112) >> 14;
                            int var10 = (var6 & 0x3FF8) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class505.field7380.length; var12++) {
                                if (class505.field7380[var12] == var11 && arg1[var12] != null) {
                                    arg2.method1571(var7, true, class377.field5692, (var10 & 0x7) * 8, var3, var4 * 8, var5 * 8, (var9 & 0x7) * 8, class184.field2758, var8, arg1[var12]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIBI)I")
    public static final int method2327(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 > -16) {
            method2328(true, 95, false);
        }
        field5521++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZIZ)V")
    public static final void method2328(boolean arg0, int arg1, boolean arg2) {
        field5529++;
        if (arg1 == 0) {
            class377.field5692 = class38.method303(class475.field6861, arg1, class360.field5349, class111.field1557, (byte) 54, class193.field3258.field7248 * 2);
        } else {
            if (arg0) {
                class377.field5692 = class38.method303(class475.field6861, 0, class360.field5349, class111.field1557, (byte) 40, 0);
                class377.field5692.method360(0);
                class348 var3 = class33.method230(21108, class309.field4661, class152.field2264, 0);
                class317 var4 = class377.field5692.method366(var3, class84.method698(class176.field2627, class309.field4661, 0), true);
                class258.method1730(true, class59.field709.method1635(class224.field3673, (byte) 122), true, var4);
                class377.field5692.method357();
                class456.method2771(0);
                class377.field5692.method305(-26760);
            }
            try {
                class377.field5692 = class38.method303(class475.field6861, arg1, class360.field5349, class111.field1557, (byte) 99, class193.field3258.field7248 * 2);
                if (class377.field5692.method348()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class54 var6;
                    if (var5) {
                        var6 = class377.field5692.method337(146800640);
                    } else {
                        var6 = class377.field5692.method337(104857600);
                    }
                    class377.field5692.method281(var6);
                }
            } catch (Throwable var8) {
                arg1 = 0;
                class377.field5692 = class38.method303(class475.field6861, 0, class360.field5349, class111.field1557, (byte) 67, 0);
            }
        }
        class96.field1384 = arg1;
        class38.method332((byte) -88);
        if (!class377.field5692.method307()) {
            class421.field6276 = 1;
        }
        class377.field5692.method334(class421.field6276);
        class377.field5692.method318(0);
        class377.field5692.method321(8);
        class210.field3431 = class377.field5692.method291();
        class94.field1324 = class377.field5692.method291();
        class336.method2118(4905);
        class377.field5692.method289(!class193.field3258.field7216);
        if (class377.field5692.method355()) {
            class224.method1597(class193.field3258.field7228, 106);
        }
        if (arg2) {
            class154.method1058(class377.field5692, 64, class69.field976 >> 3, class285.field4328 >> 3);
            class245.method1666(0);
            class360.field5348 = false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static final void method2329(int arg0) {
        class293.method1907(0, false);
        field5523++;
        class232.field3753 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class60.field719.length; var2++) {
            if (class464.field6723[var2] != -1 && class60.field719[var2] == null) {
                class60.field719[var2] = class430.field6378.method2536(class464.field6723[var2], 0, 0);
                if (class60.field719[var2] == null) {
                    var1 = false;
                    class232.field3753++;
                }
            }
            if (class485.field6975[var2] != -1 && class155.field2311[var2] == null) {
                class155.field2311[var2] = class430.field6378.method2554(class485.field6975[var2], (byte) -57, 0, class487.field7011[var2]);
                if (class155.field2311[var2] == null) {
                    var1 = false;
                    class232.field3753++;
                }
            }
            if (class258.field3971[var2] != -1 && class301.field4569[var2] == null) {
                class301.field4569[var2] = class430.field6378.method2536(class258.field3971[var2], 0, 0);
                if (class301.field4569[var2] == null) {
                    var1 = false;
                    class232.field3753++;
                }
            }
            if (class147.field2229[var2] != -1 && class349.field5163[var2] == null) {
                class349.field5163[var2] = class430.field6378.method2536(class147.field2229[var2], 0, 0);
                if (class349.field5163[var2] == null) {
                    var1 = false;
                    class232.field3753++;
                }
            }
            if (class71.field1021 != null && class286.field4337[var2] == null && class71.field1021[var2] != -1) {
                class286.field4337[var2] = class430.field6378.method2554(class71.field1021[var2], (byte) -57, 0, class487.field7011[var2]);
                if (class286.field4337[var2] == null) {
                    var1 = false;
                    class232.field3753++;
                }
            }
        }
        if (class130.field1992 == null) {
            if (class407.field6063 == null || !class373.field5555.method2547(5, class407.field6063.field606 + "_staticelements")) {
                class130.field1992 = new class149(0);
            } else if (class373.field5555.method2559(class407.field6063.field606 + "_staticelements", -116)) {
                class130.field1992 = class183.method1219(class373.field5555, class407.field6063.field606 + "_staticelements", class531.field7753, 0);
            } else {
                class232.field3753++;
                var1 = false;
            }
        }
        if (!var1) {
            class155.field2312 = 1;
            return;
        }
        class475.field6863 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class60.field719.length; var4++) {
            byte[] var20 = class155.field2311[var4];
            if (var20 != null) {
                int var21 = (class505.field7380[var4] >> 8) * 64 - class390.field5842;
                int var22 = (class505.field7380[var4] & 0xFF) * 64 - class176.field2613;
                if (class265.field4073 != 0) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class384.method2398(var20, var21, var22, class69.field976, class285.field4328, -27);
            }
            byte[] var23 = class349.field5163[var4];
            if (var23 != null) {
                int var24 = (class505.field7380[var4] >> 8) * 64 - class390.field5842;
                int var25 = (class505.field7380[var4] & 0xFF) * 64 - class176.field2613;
                if (class265.field4073 != 0) {
                    var25 = 10;
                    var24 = 10;
                }
                var3 &= class384.method2398(var23, var24, var25, class69.field976, class285.field4328, -67);
            }
        }
        if (!var3) {
            class155.field2312 = 2;
            return;
        }
        if (class155.field2312 != 0) {
            class258.method1730(true, class59.field709.method1635(class224.field3673, (byte) 119) + "<br>(100%)", true, class313.field4722);
        }
        class92.method746(980099212);
        class123.method912(true);
        boolean var5 = false;
        if (class377.field5692.method333() && class193.field3258.field7245) {
            for (int var6 = 0; var6 < class60.field719.length; var6++) {
                if (class349.field5163[var6] != null || class301.field4569[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class193.field3258.field7237) {
            var7 = class155.field2293[class424.field6319];
        } else {
            var7 = class165.field2431[class424.field6319];
        }
        if (class377.field5692.method358()) {
            var7++;
        }
        class201.method1407(7, 4, class69.field976, class285.field4328, var7, var5, class377.field5692.method301() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class184.field2758[var8].method1161(-126);
        }
        class304.method1950((byte) 117);
        class345.method2154(false, (byte) -65);
        class516.method3060((byte) 88);
        class32.field377 = null;
        class92.method746(980099212);
        System.gc();
        class293.method1907(0, true);
        int var9 = -91 % ((arg0 - 26) / 59);
        class13.method97((byte) -83);
        class13.field188 = class193.field3258.method2986(28721, class96.field1384);
        class263.field4048 = class494.field7129 >= 96;
        class444.field6527 = class193.field3258.field7245;
        class533.field7845 = class193.field3258.method2987(false, class96.field1384);
        class34.field393 = !class193.field3258.field7220;
        class334.field4991 = class193.field3258.method938(class96.field1384, -39) ? -1 : class61.field726;
        class171.field2539 = class96.field1384 == 1 || class193.field3258.field7227;
        class497.field7151 = class193.field3258.field7226;
        class356.field5279 = new class219(4, class69.field976, class285.field4328, false);
        if (class265.field4073 == 0) {
            class409.method2572(class356.field5279, -99, class60.field719);
        } else {
            class433.method2685(class356.field5279, 1, class60.field719);
        }
        class220.method1586(class69.field976 >> 4, class285.field4328 >> 4, (byte) -119);
        class239.method1649(false);
        if (var5) {
            class528.method3119(true);
            class129.field1906 = new class219(1, class69.field976, class285.field4328, true);
            if (class265.field4073 == 0) {
                class409.method2572(class129.field1906, -99, class301.field4569);
                class293.method1907(0, true);
            } else {
                class433.method2685(class129.field1906, 1, class301.field4569);
                class293.method1907(0, true);
            }
            class129.field1906.method1719(0, class356.field5279.field3946[0], 27571);
            class129.field1906.method1728((byte) 93, null, class377.field5692, null);
            class528.method3119(false);
        }
        class356.field5279.method1728((byte) 74, class184.field2758, class377.field5692, var5 ? class129.field1906.field3946 : null);
        if (class265.field4073 == 0) {
            class293.method1907(0, true);
            class5.method28(class155.field2311, -118, class356.field5279);
            if (class286.field4337 != null) {
                class407.method2568(30472);
            }
        } else {
            class293.method1907(0, true);
            method2326(7, class155.field2311, class356.field5279);
        }
        class123.method912(true);
        class293.method1907(0, true);
        class356.field5279.method1725(false, null, class377.field5692, var5 ? class290.field4367[0] : null);
        class356.field5279.method1573(class377.field5692, (byte) -122);
        class293.method1907(0, true);
        if (var5) {
            class528.method3119(true);
            class293.method1907(0, true);
            if (class265.field4073 == 0) {
                class5.method28(class349.field5163, -109, class129.field1906);
            } else {
                method2326(7, class349.field5163, class129.field1906);
            }
            class123.method912(true);
            class293.method1907(0, true);
            class129.field1906.method1725(false, class289.field4358[0], class377.field5692, null);
            class129.field1906.method1573(class377.field5692, (byte) -124);
            class293.method1907(0, true);
            class528.method3119(false);
        }
        class524.method3115(-1);
        int var10 = class356.field5279.field3597;
        if (var10 > class154.field2286) {
            var10 = class154.field2286;
        }
        if (var10 < class154.field2286 - 1) {
            var10 = class154.field2286 - 1;
        }
        if (class193.field3258.method938(class96.field1384, -74)) {
            class411.method2580(0);
        } else {
            class411.method2580(var10);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class69.field976; var18++) {
                for (int var19 = 0; var19 < class285.field4328; var19++) {
                    class68.method580((byte) -80, var19, var11, var18);
                }
            }
        }
        class211.method1465(true);
        class92.method746(980099212);
        class58.method519(118);
        class123.method912(true);
        class69.field955 = false;
        class64.method554(13413);
        if (class281.field4281 != null && class162.field2413 != null && class429.field6373 == 10) {
            class74.method640(-29627, class281.field4280);
            class313.field4701++;
            class71.field1020.method1566(true, 1057001181);
        }
        if (class265.field4073 == 0) {
            int var12 = (class136.field2073 - (class69.field976 >> 4)) / 8;
            int var13 = (class136.field2073 + (class69.field976 >> 4)) / 8;
            int var14 = (class517.field7520 - (class285.field4328 >> 4)) / 8;
            int var15 = ((class285.field4328 >> 4) + class517.field7520) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var16 > var13 || var17 < var14 || var17 > var15) {
                        class430.field6378.method2541("m" + var16 + "_" + var17, -125);
                        class430.field6378.method2541("l" + var16 + "_" + var17, -121);
                    }
                }
            }
        }
        if (class429.field6373 == 3) {
            class74.method643(2, (byte) -30);
        } else if (class429.field6373 == 7) {
            class74.method643(6, (byte) -123);
        } else {
            class74.method643(9, (byte) -98);
            if (class162.field2413 != null) {
                class74.method640(-29627, class307.field4632);
            }
        }
        class189.method1327((byte) 66);
        class92.method746(980099212);
        class525.method3117((byte) -110);
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
    public static void method2330(int arg0) {
        field5531 = null;
        field5530 = null;
        if (arg0 != 3898) {
            field5532 = -127;
        }
        field5522 = null;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(ILul;Lul;)V")
    public class371(int arg0, class406 arg1, class406 arg2) {
        this.field5519 = arg2;
        this.field5528 = arg1;
        if (this.field5528 != null) {
            this.field5528.method2551(0, -26070);
        }
        if (this.field5519 != null) {
            this.field5519.method2551(0, -26070);
        }
    }

    static {
        new class234("From", "Von:", "De", "De");
    }
}
