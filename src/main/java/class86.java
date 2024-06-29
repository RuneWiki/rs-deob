import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class86 extends RuntimeException {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1612;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Ljava/lang/String;")
    public String field1610;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[Lnc;")
    public static class83[] field1614 = new class83[6];

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lpa;")
    public static class204 field1609 = new class204(16);

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1616 = 0;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Ljd;")
    public static class85 field1617 = class221.method1499("blinken1:", (byte) 88);

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljd;")
    public static class85 field1619 = class221.method1499("leuchten3:", (byte) 127);

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lpj;")
    public static class235 field1618 = new class235();

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Ljd;")
    private static class85 field1620 = class221.method1499(" has logged out)3", (byte) 88);

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljd;")
    public static class85 field1621 = field1620;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lge;BLge;)V")
    public static final void method641(class68 arg0, byte arg1, class68 arg2) {
        class218.field3836 = arg0;
        field1611++;
        class172.field2980 = arg2;
        if (arg1 != -38) {
            method643((byte) -18, -116, (class255) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)V")
    public static final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -84 / ((40 - arg4) / 58);
        field1608++;
        if (arg1 == arg2) {
            class190.method1302(arg2, arg3, (byte) 99, arg5, arg0);
        } else if (class217.field3802 <= arg3 - arg2 && class83.field1513 >= arg2 + arg3 && (arg5 - arg1) >= class34.field522 && class1.field6 >= (arg1 + arg5)) {
            class43.method301(31030, arg3, arg2, arg1, arg0, arg5);
        } else {
            class116.method820(arg0, arg5, arg1, -21732, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BILjb;)I")
    public static final int method643(byte arg0, int arg1, class255 arg2) {
        field1615++;
        if (arg2.field4539 == null || arg2.field4539.length <= arg1) {
            return -2;
        }
        try {
            int var3 = 0;
            int var4 = 0;
            int[] var5 = arg2.field4539[arg1];
            if (arg0 <= 79) {
                return -106;
            }
            byte var6 = 0;
            while (true) {
                int var7 = var5[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 1) {
                    var8 = class20.field279[var5[var4++]];
                }
                if (var7 == 2) {
                    var8 = class71.field1323[var5[var4++]];
                }
                if (var7 == 3) {
                    var8 = class227.field3941[var5[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var5[var4++] << 16;
                    int var11 = var10 + var5[var4++];
                    class255 var12 = class72.method506(var11, 0);
                    int var13 = var5[var4++];
                    if (var13 != -1 && (!class32.method221(11649, var13).field1152 || class217.field3814)) {
                        for (int var14 = 0; var14 < var12.field4417.length; var14++) {
                            if (var13 + 1 == var12.field4417[var14]) {
                                var8 += var12.field4395[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class256.field4563[var5[var4++]];
                }
                if (var7 == 6) {
                    var8 = class237.field4095[class71.field1323[var5[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class256.field4563[var5[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class22.field308.field760;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class247.field4275[var15]) {
                            var8 += class71.field1323[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var5[var4++] << 16;
                    int var17 = var16 + var5[var4++];
                    class255 var18 = class72.method506(var17, 0);
                    int var19 = var5[var4++];
                    if (var19 != -1 && (!class32.method221(11649, var19).field1152 || class217.field3814)) {
                        for (int var20 = 0; var20 < var18.field4417.length; var20++) {
                            if (var19 + 1 == var18.field4417[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class93.field1706;
                }
                if (var7 == 12) {
                    var8 = class15.field226;
                }
                if (var7 == 13) {
                    int var21 = class256.field4563[var5[var4++]];
                    int var22 = var5[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var5[var4++];
                    var8 = class82.method566(var23, (byte) 127);
                }
                if (var7 == 18) {
                    var8 = (class22.field308.field1042 >> 7) + class244.field4172;
                }
                if (var7 == 19) {
                    var8 = (class22.field308.field1027 >> 7) + class213.field3742;
                }
                if (var7 == 20) {
                    var8 = var5[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method644(byte arg0) {
        field1609 = null;
        field1618 = null;
        field1619 = null;
        field1614 = null;
        field1617 = null;
        if (arg0 <= 59) {
            field1616 = 64;
        }
        field1621 = null;
        field1620 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class86(Throwable arg0, String arg1) {
        this.field1612 = arg0;
        this.field1610 = arg1;
    }
}
