import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class80 extends class130 {

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Lcd;")
    private class64 field1480 = class13.field298;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Lcd;")
    public static class64 field1471 = class44.method335((byte) 71, "compass");

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field1491 = 0;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Ldh;")
    private class159 field1479;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Ldh;")
    public class159 field1485;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Lqm;")
    public static class222 field1484;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "[Lqd;")
    public static class40[] field1478;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V", line = 4)
    private final void method618(int arg0) {
        this.field1479 = new class159(this.field1485.method1152((byte) -85));
        if (arg0 != -2) {
            return;
        }
        for (class84 var2 = (class84) this.field1485.method1143(0); var2 != null; var2 = (class84) this.field1485.method1147((byte) 18)) {
            class84 var3 = new class84((int) var2.field417);
            this.field1479.method1149(var3, (long) var2.field1552, -111);
        }
        field1487++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILkh;)V", line = 32)
    private final void method619(int arg0, int arg1, class13 arg2) {
        int var4 = 60 / ((39 - arg1) / 40);
        field1476++;
        if (arg0 == 1) {
            this.field1475 = arg2.method152((byte) -81);
        } else if (arg0 == 2) {
            this.field1489 = arg2.method152((byte) -96);
        } else if (arg0 == 3) {
            this.field1480 = arg2.method104((byte) 114);
        } else if (arg0 == 4) {
            this.field1474 = arg2.method105((byte) 111);
        } else if (arg0 == 5 || arg0 == 6) {
            int var5 = arg2.method112((byte) 92);
            this.field1485 = new class159(class143.method1013((byte) 44, var5));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method105((byte) 101);
                class25 var8;
                if (arg0 == 5) {
                    var8 = new class141(arg2.method104((byte) 12));
                } else {
                    var8 = new class84(arg2.method105((byte) 86));
                }
                this.field1485.method1149(var8, (long) var7, -108);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Z", line = 86)
    public final boolean method620(int arg0, byte arg1) {
        if (arg1 >= -125) {
            this.field1479 = (class159) null;
        }
        field1473++;
        if (this.field1485 == null) {
            return false;
        }
        if (this.field1479 == null) {
            this.method618(-2);
        }
        class84 var3 = (class84) this.field1479.method1151((long) arg0, 0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZZIIIIZ)Lqd;", line = 112)
    public static final class40 method621(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class92 var8 = class132.method949(arg3, false);
        if (arg0 > 1 && var8.field1652 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg0 >= var8.field1666[var10] && var8.field1666[var10] != 0) {
                    var9 = var8.field1652[var10];
                }
            }
            if (var9 != -1) {
                var8 = class132.method949(var9, false);
            }
        }
        class5 var11 = var8.method701(1);
        field1492++;
        if (var11 == null) {
            return null;
        }
        class127 var12 = null;
        if (var8.field1681 != -1) {
            var12 = (class127) method621(10, true, false, var8.field1703, 1, 0, -7026, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field1672 != -1) {
            var12 = (class127) method621(arg0, true, false, var8.field1706, arg4, arg5, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class210.field3529;
        int var14 = class210.field3537;
        int[] var15 = new int[4];
        int var16 = class210.field3533;
        class210.method1462(var15);
        class127 var17 = new class127(36, 32);
        class210.method1466(var17.field2274, 36, 32);
        class50.method362();
        class50.method365(16, 16);
        int var18 = var8.field1693;
        if (arg6 != -7026) {
            method628(21, -99);
        }
        if (arg7) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg4 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class50.field830 = false;
        int var19 = class50.field826[var8.field1655] * var18 >> 16;
        int var20 = class50.field820[var8.field1655] * var18 >> 16;
        var11.method22(0, var8.field1723, var8.field1680, var8.field1655, var8.field1705, var8.field1690 + var19 - (var11.method48() / 2), var8.field1690 + var20);
        if (arg4 >= 1) {
            var17.method927(1);
            if (arg4 >= 2) {
                var17.method927(16777215);
            }
            class210.method1466(var17.field2274, 36, 32);
        }
        if (arg5 != 0) {
            var17.method920(arg5);
        }
        if (var8.field1681 != -1) {
            var12.method306(0, 0);
        } else if (var8.field1672 != -1) {
            class210.method1466(var12.field2274, 36, 32);
            var17.method306(0, 0);
            var17 = var12;
        }
        if (arg2 && (var8.field1704 == 1 || arg0 != 1) && arg0 != -1) {
            class32.field532.method1269(class236.method1688(28471, arg0), 0, 9, 16776960, 1);
        }
        class210.method1466(var13, var14, var16);
        class210.method1479(var15);
        class50.method362();
        class50.field830 = true;
        return class123.field2216 && !arg1 ? new class136(var17) : var17;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V", line = 239)
    public static final void method622(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class180.field3098 && class201.field3444 >= arg3) {
            int var5 = class160.method1155(class153.field2714, class290.field4976, arg4 + 268435455, arg1);
            int var6 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg0);
            class24.method226(arg3, arg2, (byte) 104, var5, var6);
        }
        if (arg4 != 0) {
            method630(-112);
        }
        field1483++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILcd;)Z", line = 257)
    public final boolean method623(int arg0, class64 arg1) {
        field1493++;
        if (arg0 != 16) {
            return true;
        } else if (this.field1485 == null) {
            return false;
        } else {
            if (this.field1479 == null) {
                this.method627((byte) 111);
            }
            for (class315 var3 = (class315) this.field1479.method1151(arg1.method518(-703251387), arg0 - 16); var3 != null; var3 = (class315) this.field1479.method1140((byte) 127)) {
                if (var3.field5342.method519((byte) 125, arg1)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)Z", line = 289)
    public static final boolean method624(boolean arg0, int arg1) {
        field1488++;
        if (arg0) {
            method622(24, -82, 113, -43, 92);
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lkh;B)V", line = 303)
    public final void method625(class13 arg0, byte arg1) {
        int var3 = -102 / ((arg1 - 41) / 50);
        while (true) {
            int var4 = arg0.method152((byte) -98);
            if (var4 == 0) {
                field1486++;
                return;
            }
            this.method619(var4, -126, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I", line = 335)
    public final int method626(int arg0, int arg1) {
        field1490++;
        if (this.field1485 == null) {
            return this.field1474;
        }
        class84 var3 = (class84) this.field1485.method1151((long) arg1, 0);
        if (var3 == null) {
            return this.field1474;
        } else if (arg0 >= -113) {
            return 22;
        } else {
            return var3.field1552;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 355)
    private final void method627(byte arg0) {
        this.field1479 = new class159(this.field1485.method1152((byte) -85));
        for (class141 var2 = (class141) this.field1485.method1143(0); var2 != null; var2 = (class141) this.field1485.method1147((byte) 18)) {
            class315 var3 = new class315(var2.field2482, (int) var2.field417);
            this.field1479.method1149(var3, var2.field2482.method518(-703251387), -116);
        }
        if (arg0 <= 100) {
            this.field1475 = 36;
        }
        field1481++;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Lpf;", line = 382)
    public static final class78 method628(int arg0, int arg1) {
        if (arg1 != 0) {
            method628(88, 79);
        }
        field1472++;
        class78 var2 = (class78) class55.field924.method1194((long) arg0, (byte) -124);
        if (var2 != null) {
            return var2;
        }
        class78 var3 = class82.method637(false, class62.field1205, class60.field1182, arg0, -3696);
        if (var3 != null) {
            class55.field924.method1190(12669, var3, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Lcd;", line = 406)
    public final class64 method629(int arg0, boolean arg1) {
        if (!arg1) {
            return (class64) null;
        }
        field1477++;
        if (this.field1485 == null) {
            return this.field1480;
        } else {
            class141 var3 = (class141) this.field1485.method1151((long) arg0, 0);
            return var3 == null ? this.field1480 : var3.field2482;
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V", line = 429)
    public static void method630(int arg0) {
        field1484 = null;
        field1478 = null;
        field1471 = null;
        if (arg0 != 36) {
            method628(111, 56);
        }
    }
}
