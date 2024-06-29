import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class213 {

    @OriginalMember(owner = "client!me", name = "h", descriptor = "J")
    public long field3728 = 0L;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lwe;")
    public static class15 field3738 = new class15();

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Ljd;")
    public static class85 field3743 = class221.method1499("Musik)2Engine vorbereitet)3", (byte) -101);

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Ljd;")
    private static class85 field3745 = class221.method1499("Attack", (byte) 95);

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field3748 = -1;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Ljd;")
    private static class85 field3747 = class221.method1499(" is already on your friend list)3", (byte) -97);

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Ljd;")
    public static class85 field3741 = field3747;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "Ljd;")
    public static class85 field3749 = field3745;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field3750 = 0;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "Lm;")
    public static class113 field3746;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lqb;")
    public class56 field3724;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Lge;")
    public static class68 field3744;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method1459(int arg0) {
        field3747 = null;
        field3746 = null;
        if (arg0 != -1000000) {
            method1462(11);
        }
        field3745 = null;
        field3744 = null;
        field3743 = null;
        field3738 = null;
        field3741 = null;
        field3749 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([Lkc;III[BIZIIII)V")
    public static final void method1460(class264[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field3732++;
        byte var11;
        if (arg6) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg6) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg8 + var13 > 0 && arg8 + var13 < 103) {
                        arg0[arg5].field4719[arg1 + var12][arg8 + var13] = class135.method899(arg0[arg5].field4719[arg1 + var12][arg8 + var13], -16777217);
                    }
                }
            }
        }
        class247 var14 = new class247(arg4);
        int var15 = 0;
        int var16 = 60 % ((-arg7 - 45) / 59);
        while (var15 < var11) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    if (arg3 == var15 && arg2 <= var17 && (arg2 + 8) > var17 && var18 >= arg9 && (arg9 + 8) > var18) {
                        class144.method941(0, 0, var14, arg10, arg6, class206.method1406(arg10, var17 & 0x7, var18 & 0x7, true) + arg1, class140.method922(var18 & 0x7, (byte) 99, arg10, var17 & 0x7) + arg8, arg5, false);
                    } else {
                        class144.method941(0, 0, var14, 0, arg6, -1, -1, 0, false);
                    }
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static final void method1461(byte arg0) {
        field3730++;
        if (class1.field4 == 30) {
            class169.method1136(true, 25);
        }
        if (arg0 > -2) {
            method1462(90);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method1462(int arg0) {
        field3726++;
        if (class226.method1526(arg0 + 4215) != 2) {
            return;
        }
        if (arg0 != -4137) {
            field3738 = null;
        }
        byte var1 = (byte) (class50.field873 - 4 & 0xFF);
        int var2 = class50.field873 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class99.field1782[var3][var2][var16] = var1;
            }
        }
        if (class116.field2066 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class215.field3775[var4] = -1000000;
            class142.field2454[var4] = 1000000;
            class182.field3107[var4] = 0;
            class5.field60[var4] = 1000000;
            class114.field2051[var4] = 0;
        }
        if (class273.field4825 != 1) {
            int var5 = class246.method1660(arg0 + 604128688, class267.field4762, class116.field2066, class272.field4809);
            if (var5 - class231.field3987 < 800 && (class228.field3952[class116.field2066][class267.field4762 >> 7][class272.field4809 >> 7] & 0x4) != 0) {
                class8.method37(false, class272.field4809 >> 7, class267.field4762 >> 7, class99.field1780, 1, arg0 ^ 0x1058);
                return;
            }
            return;
        }
        if ((class228.field3952[class116.field2066][class22.field308.field1042 >> 7][class22.field308.field1027 >> 7] & 0x4) != 0) {
            class8.method37(false, class22.field308.field1027 >> 7, class22.field308.field1042 >> 7, class99.field1780, 0, 117);
        }
        if (class252.field4347 >= 310) {
            return;
        }
        int var6 = class272.field4809 >> 7;
        int var7 = class267.field4762 >> 7;
        int var8 = class22.field308.field1042 >> 7;
        int var9 = class22.field308.field1027 >> 7;
        int var10;
        if (var7 < var8) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        int var11;
        if (var6 < var9) {
            var11 = var9 - var6;
        } else {
            var11 = var6 - var9;
        }
        if (var11 >= var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var6 != var9) {
                if (var6 < var9) {
                    var6++;
                } else if (var6 > var9) {
                    var6--;
                }
                if ((class228.field3952[class116.field2066][var7][var6] & 0x4) != 0) {
                    class8.method37(false, var6, var7, class99.field1780, 1, -106);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var8 > var7) {
                        var7++;
                    } else if (var7 > var8) {
                        var7--;
                    }
                    var13 -= 65536;
                    if ((class228.field3952[class116.field2066][var7][var6] & 0x4) != 0) {
                        class8.method37(false, var6, var7, class99.field1780, 1, 75);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var7 != var8) {
            if (var7 < var8) {
                var7++;
            } else if (var7 > var8) {
                var7--;
            }
            if ((class228.field3952[class116.field2066][var7][var6] & 0x4) != 0) {
                class8.method37(false, var6, var7, class99.field1780, 1, arg0 ^ 0x1057);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var6 < var9) {
                    var6++;
                } else if (var6 > var9) {
                    var6--;
                }
                var15 -= 65536;
                if ((class228.field3952[class116.field2066][var7][var6] & 0x4) != 0) {
                    class8.method37(false, var6, var7, class99.field1780, 1, 108);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Z")
    public static final boolean method1463(int arg0, int arg1) {
        field3734++;
        int var2 = -77 % ((arg0 - 61) / 40);
        return (arg1 & 0x3B2F8E) >> 21 != 0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (class217.field3802 <= arg5 && arg1 <= class83.field1513 && class34.field522 <= arg0 && class1.field6 >= arg3) {
            class225.method1518(arg5, 8048, arg3, arg1, arg2, arg0);
        } else {
            class240.method1633(arg1, arg3, arg2, (byte) 99, arg0, arg5);
        }
        if (arg4) {
            field3741 = null;
        }
        field3740++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Z")
    public static final boolean method1465(int arg0, byte arg1) {
        field3733++;
        if (arg1 > -124) {
            return false;
        } else {
            return (arg0 >> 31 & 0x1) != 0;
        }
    }
}
