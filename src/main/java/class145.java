import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class145 {

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lmh;")
    private static class128 field2496 = class22.method156(122, "Select");

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Lmh;")
    public static class128 field2497 = field2496;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2489 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "F")
    public static float field2498;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 11)
    public static final void method967(int arg0) {
        int var1 = 8 % ((arg0 + 6) / 58);
        field2477++;
        class276.field4774.method1832((byte) 97);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)Lwe;", line = 21)
    public static final class47 method968(boolean arg0, int arg1) {
        field2479++;
        class47 var2 = (class47) class26.field575.method1443((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class57.field1094.method2155(arg1, 1, (byte) 70);
        } else {
            var3 = class39.field826.method2155(arg1 & 0x7FFF, 1, (byte) 70);
        }
        class47 var4 = new class47();
        if (var3 != null) {
            var4.method333(new class194(var3), (byte) 93);
        }
        if (arg1 >= 32768) {
            var4.method331((byte) -65);
        }
        class26.field575.method1442(-1, (long) arg1, var4);
        if (!arg0) {
            field2496 = (class128) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLbg;)V", line = 58)
    public static final void method969(byte arg0, class194 arg1) {
        int var2 = -5 % ((arg0 + 44) / 50);
        field2495++;
        while (true) {
            while (arg1.field3417.length > arg1.field3380) {
                int var3 = 0;
                boolean var4 = false;
                int var5 = 0;
                if (arg1.method1325(7627) == 1) {
                    var5 = arg1.method1325(7627);
                    var4 = true;
                    var3 = arg1.method1325(7627);
                }
                int var6 = arg1.method1325(7627);
                int var7 = arg1.method1325(7627);
                int var8 = var6 * 64 - class212.field3754;
                int var9 = class155.field2671 - (var7 * 64 + -class39.field836) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && class5.field110 > var8 + 63 && class155.field2671 > var9) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var4 || var12 >= var5 * 8 && (var5 * 8 + 8) > var12 && (var3 * 8) <= var13 && (var3 * 8 + 8) > var13) {
                                byte var14 = arg1.method1326((byte) 125);
                                if (var14 != 0) {
                                    if (class36.field740[var10][var11] == null) {
                                        class36.field740[var10][var11] = new byte[4096];
                                    }
                                    class36.field740[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method1326((byte) 115);
                                    if (class217.field3818[var10][var11] == null) {
                                        class217.field3818[var10][var11] = new byte[4096];
                                    }
                                    class217.field3818[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var4 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method1326((byte) 116);
                        if (var17 != 0) {
                            arg1.field3380++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Z", line = 158)
    public final boolean method970(boolean arg0) {
        field2485++;
        if (!arg0) {
            field2497 = (class128) null;
        }
        return (this.field2493 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lbg;B)V", line = 169)
    public static final void method971(class194 arg0, byte arg1) {
        field2482++;
        byte[] var2 = new byte[24];
        if (arg1 != -19) {
            return;
        }
        if (class310.field5257 != null) {
            try {
                class310.field5257.method348(0L, 0);
                class310.field5257.method350(126, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1303((byte) -117, 24, 0, var2);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z", line = 216)
    public final boolean method972(byte arg0) {
        if (arg0 < 102) {
            method971((class194) null, (byte) -41);
        }
        field2486++;
        return (this.field2493 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIB)V", line = 227)
    public static final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2483++;
        int var6 = 52 % ((-arg5 - 40) / 56);
        if (arg1 == arg2) {
            class159.method1049(arg0, arg4, 14804, arg2, arg3);
        } else if (arg0 - arg2 >= class193.field3335 && (arg0 + arg2) <= class43.field875 && class70.field1315 <= (arg4 - arg1) && arg1 + arg4 <= class181.field3173) {
            class199.method1381(arg1, -104, arg0, arg2, arg3, arg4);
        } else {
            class301.method2051(arg4, arg3, arg2, arg1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILbg;)Lpe;", line = 255)
    public static final class94 method974(int arg0, class194 arg1) {
        class94 var2 = new class94();
        field2491++;
        var2.field1592 = arg1.method1308(-123);
        int var3 = 75 / ((arg0 + 46) / 60);
        var2.field1590 = method968(true, var2.field1592);
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ldj;BI)Lqg;", line = 268)
    public static final class231 method975(class314 arg0, byte arg1, int arg2) {
        field2481++;
        if (arg1 <= 121) {
            method971((class194) null, (byte) 19);
        }
        return class285.method1972(arg2, arg0, -128) ? class118.method712(255) : null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLdj;Ldj;)V", line = 288)
    public static final void method976(byte arg0, class314 arg1, class314 arg2) {
        class34.field724 = class133.method889(arg2, arg1, 6, class281.field4859, 0);
        if (arg0 <= 5) {
            method971((class194) null, (byte) -125);
        }
        field2478++;
        if (class247.field4247) {
            class234.field4036 = class121.method738(0, arg1, -17875, arg2, class281.field4859);
        } else {
            class234.field4036 = (class14) class34.field724;
        }
        class132.field2292 = class133.method889(arg2, arg1, 6, class91.field1554, 0);
        client.field4159 = class133.method889(arg2, arg1, 6, class256.field4399, 0);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Z", line = 307)
    public final boolean method977(byte arg0) {
        if (arg0 <= 104) {
            method976((byte) 103, (class314) null, (class314) null);
        }
        field2490++;
        return (this.field2493 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 318)
    public static void method978(int arg0) {
        field2497 = null;
        if (arg0 != 8) {
            field2489 = (Calendar) null;
        }
        field2496 = null;
        field2489 = null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)Z", line = 330)
    public final boolean method979(boolean arg0) {
        field2484++;
        if (!arg0) {
            field2489 = (Calendar) null;
        }
        return (this.field2493 & 0x4) != 0;
    }
}
