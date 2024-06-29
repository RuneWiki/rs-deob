import java.awt.Point;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class196 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lok;")
    public static class146 field3262 = class235.method1724(-12908, "niveau ");

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "[Lok;")
    public static class146[] field3270 = new class146[1000];

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lok;")
    public static class146 field3267 = class235.method1724(-12908, "; Expires=");

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lok;")
    public static class146 field3268 = class235.method1724(-12908, "(U5");

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lok;")
    public static class146 field3271 = class235.method1724(-12908, "gelb:");

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Loh;")
    public static class15 field3273;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 4)
    public static void method1512(byte arg0) {
        if (arg0 != -126) {
            method1517((byte) 52, -20);
        }
        field3262 = null;
        field3267 = null;
        field3270 = null;
        field3268 = null;
        field3271 = null;
        field3273 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I", line = 31)
    public static final int method1513(int arg0) {
        field3274++;
        try {
            if (class164.field2776 == 0) {
                if (class67.method501(-115) - 5000L < class320.field5468) {
                    return 0;
                }
                class78.field1248 = class232.field3876.method931(class180.field3019, (byte) 43, class147.field2490);
                class310.field5285 = class67.method501(-110);
                class164.field2776 = 1;
            }
            if (arg0 < 46) {
                field3265 = 100;
            }
            if (class310.field5285 + 30000L < class67.method501(-128)) {
                return class205.method1555(1000, false);
            }
            if (class164.field2776 == 1) {
                if (class78.field1248.field4265 == 2) {
                    return class205.method1555(1001, false);
                }
                if (class78.field1248.field4265 != 1) {
                    return -1;
                }
                int var1 = 0;
                class98.field1582 = new class40((Socket) class78.field1248.field4269, class232.field3876);
                if (class320.field5462) {
                    var1 = class96.field1554;
                }
                class47.field820.field857 = 0;
                class78.field1248 = null;
                class47.field820.method332(93, 103);
                class47.field820.method387(var1, 107);
                class98.field1582.method279(-99, 0, class47.field820.field857, class47.field820.field860);
                if (class142.field2369 != null) {
                    class142.field2369.method1483(true);
                }
                if (class138.field2303 != null) {
                    class138.field2303.method1483(true);
                }
                int var2 = class98.field1582.method280((byte) -36);
                if (class142.field2369 != null) {
                    class142.field2369.method1483(true);
                }
                if (class138.field2303 != null) {
                    class138.field2303.method1483(true);
                }
                if (var2 != 0) {
                    return class205.method1555(var2, false);
                }
                class164.field2776 = 2;
            }
            if (class164.field2776 == 2) {
                if (class98.field1582.method288(0) < 2) {
                    return -1;
                }
                class225.field3758 = class98.field1582.method280((byte) -36);
                class225.field3758 <<= 0x8;
                class225.field3758 += class98.field1582.method280((byte) -36);
                class214.field3537 = new byte[class225.field3758];
                class164.field2776 = 3;
                class14.field271 = 0;
            }
            if (class164.field2776 != 3) {
                return -1;
            }
            int var3 = class98.field1582.method288(0);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class225.field3758 - class14.field271)) {
                var3 = class225.field3758 - class14.field271;
            }
            class98.field1582.method277(class214.field3537, 78, var3, class14.field271);
            class14.field271 += var3;
            if (class14.field271 < class225.field3758) {
                return -1;
            } else if (class120.method820((byte) 124, class214.field3537)) {
                class288.field4927 = new class228[class157.field2649];
                int var4 = 0;
                for (int var5 = class71.field1167; var5 <= class39.field697; var5++) {
                    class228 var6 = class265.method1924(var5, (byte) -86);
                    if (var6 != null) {
                        class288.field4927[var4++] = var6;
                    }
                }
                class98.field1582.method284((byte) -16);
                class164.field2776 = 0;
                class297.field5059 = 0;
                class214.field3537 = null;
                class98.field1582 = null;
                class320.field5468 = class67.method501(-120);
                return 0;
            } else {
                return class205.method1555(1002, false);
            }
        } catch (IOException var8) {
            return class205.method1555(1003, false);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)V", line = 171)
    public static final void method1514(int arg0, byte arg1, int arg2) {
        if (arg1 != 76) {
            method1518((byte[]) null, (byte) 125);
        }
        field3261++;
        class158 var3 = class206.method1564(arg2, 6, -120);
        var3.method1236(-13730);
        var3.field2663 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJI[I)Lok;", line = 186)
    public static final class146 method1515(int arg0, long arg1, int arg2, int[] arg3) {
        field3264++;
        if (class117.field1873 != null) {
            class146 var5 = class117.field1873.method409(arg0 ^ 0xFFFFC802, arg1, arg3, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 == 8) {
            return arg2 == 5 ? class267.method1938(117, arg1).method1104((byte) -91) : class238.method1736((byte) 61, arg1);
        } else {
            return (class146) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V", line = 214)
    public static final void method1516(int arg0, boolean arg1) {
        field3272++;
        if (!class223.field3720) {
            arg0 = -1;
        }
        if (class140.field2341 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class35 var2 = class259.method1878(arg0, 33);
            class307 var3 = var2.method249(-118);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class232.field3876.method925(class75.field1228, var3.field1140, 4727, var3.field1144, var3.method2166(), new Point(var2.field645, var2.field649));
                class140.field2341 = arg0;
            }
        }
        if (arg1) {
            method1518((byte[]) null, (byte) 79);
        }
        if (arg0 == -1 && class140.field2341 != -1) {
            class232.field3876.method925(class75.field1228, -1, 4727, -1, (int[]) null, new Point());
            class140.field2341 = -1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Z", line = 285)
    public static final boolean method1517(byte arg0, int arg1) {
        if (arg0 != -111) {
            method1518((byte[]) null, (byte) 46);
        }
        field3269++;
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BB)V", line = 303)
    public static final void method1518(byte[] arg0, byte arg1) {
        field3263++;
        class47 var2 = new class47(arg0);
        var2.field857 = arg0.length - 2;
        class241.field4004 = var2.method379(-2);
        class226.field3776 = new int[class241.field4004];
        class150.field2562 = new int[class241.field4004];
        class23.field424 = new int[class241.field4004];
        if (arg1 != 18) {
            return;
        }
        class63.field1089 = new byte[class241.field4004][];
        class110.field1763 = new boolean[class241.field4004];
        class17.field353 = new byte[class241.field4004][];
        class238.field3967 = new int[class241.field4004];
        var2.field857 = arg0.length - class241.field4004 * 8 - 7;
        class177.field3006 = var2.method379(-2);
        class242.field4027 = var2.method379(arg1 ^ 0xFFFFFFEC);
        int var3 = (var2.method368(-115) & 0xFF) + 1;
        for (int var4 = 0; var4 < class241.field4004; var4++) {
            class226.field3776[var4] = var2.method379(-2);
        }
        for (int var5 = 0; var5 < class241.field4004; var5++) {
            class23.field424[var5] = var2.method379(-2);
        }
        for (int var6 = 0; var6 < class241.field4004; var6++) {
            class238.field3967[var6] = var2.method379(-2);
        }
        for (int var7 = 0; var7 < class241.field4004; var7++) {
            class150.field2562[var7] = var2.method379(-2);
        }
        var2.field857 = arg0.length - ((var3 - 1) * 3) - (class241.field4004 * 8) - 7;
        class94.field1514 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class94.field1514[var8] = var2.method389((byte) 55);
            if (class94.field1514[var8] == 0) {
                class94.field1514[var8] = 1;
            }
        }
        var2.field857 = 0;
        for (int var9 = 0; var9 < class241.field4004; var9++) {
            int var10 = class150.field2562[var9];
            int var11 = class238.field3967[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class17.field353[var9] = var13;
            byte[] var14 = new byte[var12];
            class63.field1089[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method368(-112);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method352(255);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method352(255);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label91: while (true) {
                    if (var11 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var11) {
                                break label91;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var14[var19 + (var11 * var20)] = var2.method352(255);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var13[var11 * var18 + var17] = var2.method352(255);
                    }
                    var17++;
                }
            }
            class110.field1763[var9] = var15;
        }
    }
}
