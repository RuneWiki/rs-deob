import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class83 {

    @OriginalMember(owner = "client!ib", name = "cc", descriptor = "[Lhe;")
    public static class54[] field1458 = new class54[1000];

    @OriginalMember(owner = "client!ib", name = "gc", descriptor = "I")
    public static int field1462 = 1;

    @OriginalMember(owner = "client!ib", name = "ac", descriptor = "[Lhe;")
    public static class54[] field1456 = new class54[1000];

    @OriginalMember(owner = "client!ib", name = "mc", descriptor = "Lhe;")
    private static class54 field1468 = class6.method58("shake:", false);

    @OriginalMember(owner = "client!ib", name = "Yb", descriptor = "Lhe;")
    public static class54 field1454 = field1468;

    @OriginalMember(owner = "client!ib", name = "ic", descriptor = "Lhe;")
    public static class54 field1464 = class6.method58("Die Adresse dieses Computers wurde gesperrt)1", false);

    @OriginalMember(owner = "client!ib", name = "lc", descriptor = "I")
    public static int field1467 = 0;

    @OriginalMember(owner = "client!ib", name = "fc", descriptor = "Lhe;")
    public static class54 field1461 = field1468;

    @OriginalMember(owner = "client!ib", name = "hc", descriptor = "Lhe;")
    public static class54 field1463 = class6.method58("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", false);

    @OriginalMember(owner = "client!ib", name = "vc", descriptor = "Lhe;")
    public static class54 field1477 = class6.method58("Gegenstand f-Ur Mitglieder", false);

    @OriginalMember(owner = "client!ib", name = "rc", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1473 = new CRC32();

    @OriginalMember(owner = "client!ib", name = "yc", descriptor = "[I")
    public static int[] field1480 = new int[32768];

    @OriginalMember(owner = "client!ib", name = "wc", descriptor = "Lhe;")
    public static class54 field1478 = class6.method58(" <col=00ff80>", false);

    @OriginalMember(owner = "client!ib", name = "xc", descriptor = "Lhe;")
    public static class54 field1479 = class6.method58("Fehler bei der Verbindung zum Server)3", false);

    @OriginalMember(owner = "client!ib", name = "Ub", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client!ib", name = "Vb", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ib", name = "Wb", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ib", name = "Xb", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ib", name = "Zb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ib", name = "bc", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ib", name = "dc", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ib", name = "ec", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ib", name = "jc", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ib", name = "kc", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ib", name = "nc", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ib", name = "pc", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ib", name = "qc", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ib", name = "sc", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ib", name = "tc", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ib", name = "uc", descriptor = "Lef;")
    public static class35 field1476;

    @OriginalMember(owner = "client!ib", name = "oc", descriptor = "Ljc;")
    private class65 field1470;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(BI)I")
    public final int method452(byte arg0, int arg1) {
        ++field1452;
        if (arg0 != 24) {
            this.method461((byte) -101);
        }
        return arg1 * 8 + -this.field1450;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)V")
    public static final void method453(long arg0, int arg1) {
        ++field1475;
        if (~arg0 != -1L) {
            if ((~class158.field3609 > -101 || ~class5.field166 == -2) && class158.field3609 < 200) {
                if (arg1 != -314) {
                    field1478 = null;
                }
                class54 var3 = class135.method1011(arg1 + 309, arg0).method418(80);
                for (int var4 = 0; class158.field3609 > var4; ++var4) {
                    if (~class129.field2920[var4] == ~arg0) {
                        class80.method612(class143.method1105(new class54[] { var3, class50.field1205 }, -842), class24.field671, (byte) 113, 0);
                        return;
                    }
                }
                for (int var5 = 0; ~class54.field1347 < ~var5; ++var5) {
                    if (class15.field464[var5] == arg0) {
                        class80.method612(class143.method1105(new class54[] { class103.field2572, var3, class72.field1804 }, arg1 + -528), class24.field671, (byte) 126, 0);
                        return;
                    }
                }
                if (var3.method381(arg1 + 315, class108.field2639.field626)) {
                    class80.method612(class135.field3066, class24.field671, (byte) 112, 0);
                } else {
                    class40.field1054[class158.field3609] = var3;
                    ++class31.field782;
                    class129.field2920[class158.field3609] = arg0;
                    class94.field2368[class158.field3609] = 0;
                    class66.field1583[class158.field3609] = 0;
                    ++class158.field3609;
                    class3.field60 = class84.field2084;
                    class131.field2969.method454(197, -102);
                    class131.field2969.method677(189354448, arg0);
                }
            } else {
                class80.method612(class57.field1442, class24.field671, (byte) 109, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "(II)V")
    public final void method454(int arg0, int arg1) {
        int var3 = 59 / ((58 - arg1) / 49);
        super.field2055[super.field2076++] = (byte) (arg0 + this.field1470.method503(6));
        ++field1459;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(Z)I")
    public final int method455(boolean arg0) {
        ++field1474;
        if (!arg0) {
            field1467 = 25;
        }
        return 255 & super.field2055[super.field2076++] + -this.field1470.method503(6);
    }

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "(II)I")
    public final int method456(int arg0, int arg1) {
        ++field1466;
        if (arg0 != -1432215741) {
            this.method454(-109, 111);
        }
        int var3 = this.field1450 >> 3;
        int var4 = 0;
        int var5 = 8 - (this.field1450 & 7);
        this.field1450 += arg1;
        while (arg1 > var5) {
            var4 += (super.field2055[var3++] & class6.field193[var5]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg1 == ~var5) {
            var6 = (class6.field193[var5] & super.field2055[var3]) + var4;
        } else {
            var6 = (super.field2055[var3] >> -arg1 + var5 & class6.field193[arg1]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
    public class58(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILef;Lef;Lef;Lef;)V")
    public static final void method457(int arg0, class35 arg1, class35 arg2, class35 arg3, class35 arg4) {
        class144.field3287 = arg2;
        class15.field455 = arg3;
        class12.field340 = arg1;
        ++field1460;
        class115.field2731 = arg4;
        class59.field1481 = new class93[class15.field455.method278(108)][];
        class140.field3197 = new boolean[class15.field455.method278(38)];
        if (arg0 < 12) {
            field1468 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "(I)V")
    public static final void method458(int arg0) {
        ++field1472;
        class24.field658.method992(arg0 ^ 28317);
        class66.field1598.method992(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1479 = null;
        field1473 = null;
        field1464 = null;
        field1476 = null;
        field1480 = null;
        field1461 = null;
        field1458 = null;
        field1477 = null;
        field1454 = null;
        field1478 = null;
        field1468 = null;
        if (arg0 != 1) {
            method465((byte) -68, 109);
        }
        field1456 = null;
        field1463 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lm;ILhe;)I")
    public static final int method460(class83 arg0, int arg1, class54 arg2) {
        int var3 = arg0.field2076;
        arg0.method665(13952, arg2.field1325);
        arg0.field2076 += class17.field507.method701(arg0.field2055, arg2.field1323, arg0.field2076, arg2.field1325, 0, arg1 ^ -7550);
        if (arg1 != -7547) {
            method465((byte) -38, 54);
        }
        ++field1457;
        return -var3 + arg0.field2076;
    }

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "(B)V")
    public final void method461(byte arg0) {
        this.field1450 = super.field2076 * 8;
        if (arg0 >= -17) {
            field1464 = null;
        }
        ++field1469;
    }

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "(I)V")
    public static final void method462(int arg0) {
        ++field1465;
        Object var1 = class19.field568;
        synchronized (class19.field568) {
            if (~class17.field509 != -1) {
                class17.field509 = 1;
                try {
                    class19.field568.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 != -1432215741) {
            method465((byte) -108, 86);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([IB)V")
    public final void method463(int[] arg0, byte arg1) {
        ++field1453;
        if (arg1 != -104) {
            method453(113L, -7);
        }
        this.field1470 = new class65(arg0);
    }

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "(B)V")
    public final void method464(byte arg0) {
        int var2 = -106 % ((arg0 - -11) / 36);
        ++field1451;
        super.field2076 = (this.field1450 - -7) / 8;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(BI)V")
    public static final void method465(byte arg0, int arg1) {
        ++field1455;
        if (arg1 == -1 && !class52.field1236) {
            class133.method997(25651);
        } else if (~arg1 != 0 && ~class4.field140 != ~arg1 && ~class67.field1682 != -1 && !class52.field1236) {
            class150.method1141(0, false, class105.field2602, 2, class67.field1682, arg1, 0);
        }
        class4.field140 = arg1;
        if (arg0 <= 26) {
            method453(-23L, 81);
        }
    }
}
