import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class166 {

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Leb;")
    public static class395 field2188 = new class395();

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Lhj;")
    public static class109 field2191 = new class109("stellardawn", 1);

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "Ljm;")
    public static class167 field2192 = new class167("", 10);

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "[[I")
    public static int[][] field2193 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2195 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field2194;

    static {
        new class409("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field2196 = -1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1094(byte arg0) {
        int var1 = -43 % (arg0 / 62);
        if (class74.field942.method113()) {
            class393.method2468(21770);
            class74.field942.method157(class270.field4004);
            class51.method400(-116);
        } else {
            class358.method2280(class118.field1594, true);
        }
        field2190++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZ)V", line = 24)
    public static final void method1095(boolean arg0, boolean arg1) {
        while (true) {
            if (class22.field306.method768(true, class35.field496) >= 15) {
                int var2 = class22.field306.method773(15, (byte) -119);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (class364.field5260[var2] == null) {
                        class364.field5260[var2] = new class26();
                        var3 = true;
                        class364.field5260[var2].field777 = var2;
                    }
                    class26 var4 = class364.field5260[var2];
                    class301.field4380[class14.field231++] = var2;
                    var4.field720 = class388.field5665;
                    if (var4.field369 != null && var4.field369.method2142(0)) {
                        class373.method2371(var4, (byte) -126);
                    }
                    int var5 = class22.field306.method773(1, (byte) 25);
                    int var6 = class22.field306.method773(1, (byte) -105);
                    if (var6 == 1) {
                        class189.field2649[class319.field4713++] = var2;
                    }
                    int var7 = (class22.field306.method773(3, (byte) -120) + 4 & 0x5000007) << 11;
                    int var8 = class22.field306.method773(2, (byte) 17);
                    var4.method273(class295.method1963(116, class22.field306.method773(14, (byte) 93)), -27397);
                    int var9;
                    if (arg1) {
                        var9 = class22.field306.method773(8, (byte) -110);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = class22.field306.method773(5, (byte) 26);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    int var10;
                    if (arg1) {
                        var10 = class22.field306.method773(8, (byte) -113);
                        if (var10 > 127) {
                            var10 -= 256;
                        }
                    } else {
                        var10 = class22.field306.method773(5, (byte) -115);
                        if (var10 > 15) {
                            var10 -= 32;
                        }
                    }
                    var4.method445(var4.field369.field4819, 10);
                    var4.field769 = var4.field369.field4843 << 3;
                    if (var4.field769 == 0) {
                        var4.method437(0, 10);
                    } else if (var3) {
                        var4.method437(var7, 10);
                    }
                    var4.method274(var8, class187.field2619.field784[0] + var10, (byte) -35, class187.field2619.field793[0] + var9, var5 == 1, var4.method446(10));
                    if (var4.field369.method2142(0)) {
                        class71.method518(0, (class380) null, (byte) -105, var4, var4.field784[0], var4.field4960, (class178) null, var4.field793[0]);
                    }
                    continue;
                }
            }
            field2183++;
            class22.field306.method771((byte) 102);
            if (arg0) {
                field2194 = 6;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 127)
    public static final void method1096(int arg0) {
        class440.field6409.method2313(93);
        if (arg0 <= -51) {
            field2185++;
            class347.field5110.method2313(120);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 141)
    public static final void method1097(boolean arg0) {
        field2189++;
        if (class299.field4355 == 0) {
            return;
        }
        try {
            if (++class210.field2966 > 1500) {
                if (class72.field933 != null) {
                    class72.field933.method2695(0);
                    class72.field933 = null;
                }
                if (class247.field3641 >= 1) {
                    class92.field1150 = -5;
                    class299.field4355 = 0;
                    return;
                }
                class299.field4355 = 1;
                class247.field3641++;
                class210.field2966 = 0;
                if (class369.field5320 == class332.field4929) {
                    class369.field5320 = class30.field419;
                } else {
                    class369.field5320 = class332.field4929;
                }
            }
            if (class299.field4355 == 1) {
                class199.field2818 = class267.field3963.method2206(class304.field4462, class369.field5320, true);
                class299.field4355 = 2;
            }
            if (class299.field4355 == 2) {
                if (class199.field2818.field5134 == 2) {
                    throw new IOException();
                }
                if (class199.field2818.field5134 != 1) {
                    return;
                }
                class72.field933 = new class440((Socket) class199.field2818.field5129, class267.field3963);
                class199.field2818 = null;
                class72.field933.method2694(class159.field2132.field3762, 1, class159.field2132.field3764, 0);
                if (class423.field6115 != null) {
                    class423.field6115.method752(-65);
                }
                if (class182.field2565 != null) {
                    class182.field2565.method752(-30);
                }
                int var1 = class72.field933.method2697(-98);
                if (class423.field6115 != null) {
                    class423.field6115.method752(-20);
                }
                if (class182.field2565 != null) {
                    class182.field2565.method752(-29);
                }
                if (var1 != 101) {
                    class299.field4355 = 0;
                    class92.field1150 = var1;
                    class72.field933.method2695(0);
                    class72.field933 = null;
                    return;
                }
                class299.field4355 = 3;
            }
            if (class299.field4355 == 3) {
                if (class72.field933.method2705(-55) < 2) {
                    return;
                }
                int var2 = class72.field933.method2697(-119) << 8 | class72.field933.method2697(-120);
                class104.method729((byte) 78, var2);
                if (class403.field5825 == -1) {
                    class92.field1150 = 6;
                    class299.field4355 = 0;
                    class72.field933.method2695(0);
                    class72.field933 = null;
                    return;
                }
                class299.field4355 = 0;
                class72.field933.method2695(0);
                class72.field933 = null;
                class67.method502(0);
                return;
            }
        } catch (IOException var3) {
            if (class72.field933 != null) {
                class72.field933.method2695(0);
                class72.field933 = null;
            }
            if (class247.field3641 < 1) {
                class299.field4355 = 1;
                if (class369.field5320 == class332.field4929) {
                    class369.field5320 = class30.field419;
                } else {
                    class369.field5320 = class332.field4929;
                }
                class247.field3641++;
                class210.field2966 = 0;
            } else {
                class92.field1150 = -4;
                class299.field4355 = 0;
            }
        }
        if (!arg0) {
            field2193 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V", line = 291)
    public static final void method1098(boolean arg0) {
        field2187++;
        if (class369.method2346(0) != 2) {
            return;
        }
        byte var1 = (byte) (class253.field3713 - 4 & 0xFF);
        int var2 = class253.field3713 % class195.field2745;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class78.field984; var16++) {
                class444.field6472[var3][var2][var16] = var1;
            }
        }
        if (class423.field6117 == 3) {
            return;
        }
        if (!arg0) {
            method1098(false);
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class421.field6095[var4] = -1000000;
            class433.field6313[var4] = 1000000;
            class345.field5078[var4] = 0;
            class456.field6751[var4] = 1000000;
            class436.field6369[var4] = 0;
        }
        if (class28.field402 != 1) {
            int var5 = class133.method889(class423.field6117, class298.field4343, class345.field5077, !arg0);
            if (var5 - class164.field2171 < 800 && (class131.field1790[class423.field6117][class298.field4343 >> 7][class345.field5077 >> 7] & 0x4) != 0) {
                class10.method172(1, class298.field4343 >> 7, class345.field5077 >> 7, 1, false, class178.field2530);
                return;
            }
            return;
        }
        if ((class131.field1790[class423.field6117][class187.field2619.field4954 >> 7][class187.field2619.field4951 >> 7] & 0x4) != 0) {
            class10.method172(1, class187.field2619.field4954 >> 7, class187.field2619.field4951 >> 7, 0, false, class178.field2530);
        }
        if (class103.field1341 >= 2560) {
            return;
        }
        int var6 = class298.field4343 >> 7;
        int var7 = class345.field5077 >> 7;
        int var8 = class187.field2619.field4954 >> 7;
        int var9 = class187.field2619.field4951 >> 7;
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var9 <= var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var10 == 0 && var11 == 0 || var10 <= (-class195.field2745) || class195.field2745 <= var10 || var11 <= (-class78.field984) || var11 >= class78.field984) {
            class365.method2331("RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class28.field399 + "," + class134.field1846, (Throwable) null, 28692);
            return;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class131.field1790[class423.field6117][var6][var7] & 0x4) != 0) {
                    class10.method172(1, var6, var7, 1, false, class178.field2530);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    var13 -= 65536;
                    if ((class131.field1790[class423.field6117][var6][var7] & 0x4) != 0) {
                        class10.method172(1, var6, var7, 1, false, class178.field2530);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class131.field1790[class423.field6117][var6][var7] & 0x4) != 0) {
                class10.method172(1, var6, var7, 1, false, class178.field2530);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                if (var9 > var7) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                var15 -= 65536;
                if ((class131.field1790[class423.field6117][var6][var7] & 0x4) != 0) {
                    class10.method172(1, var6, var7, 1, false, class178.field2530);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([BIIIZLfp;[Lth;IIIII)V", line = 484)
    public static final void method1099(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4, class9 arg5, class175[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2186++;
        class256 var12 = new class256(arg0);
        int var13 = -1;
        if (arg2 != 63) {
            return;
        }
        while (true) {
            int var14 = var12.method1758((byte) -94);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1740(128);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method1738((byte) -72);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg3 == var19 && var18 >= arg8 && arg8 + 8 > var18 && var17 >= arg1 && arg1 + 8 > var17) {
                    class178 var23 = class450.method2785(var13, (byte) 110);
                    int var24 = arg10 + class99.method656(arg11, var22, var18 & 0x7, arg2 + 41, var23.field2533, var23.field2476, var17 & 0x7);
                    int var25 = arg7 + class212.method1455(arg11, var18 & 0x7, 7, var22, var23.field2533, var23.field2476, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && class195.field2745 - 1 > var24 && var25 < (class78.field984 - 1)) {
                        class175 var26 = null;
                        if (!arg4) {
                            int var27 = arg9;
                            if ((class131.field1790[1][var24][var25] & 0x2) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg6[var27];
                            }
                        }
                        class464.method2865(var24, arg9, var13, var25, var26, true, arg9, -1, arg5, arg4, arg11 + var22 & 0x3, var21, (byte) -106);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 566)
    public static void method1100(byte arg0) {
        field2191 = null;
        field2195 = null;
        field2192 = null;
        field2188 = null;
        if (arg0 == -2) {
            field2193 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 581)
    public static final void method1101(int arg0) {
        if (arg0 != 8407) {
            return;
        }
        field2184++;
        for (class265 var1 = (class265) class276.field4087.method2478(1603); var1 != null; var1 = (class265) class276.field4087.method2486((byte) -82)) {
            if (var1.field3934 > 0) {
                var1.field3934--;
            }
            if (var1.field3934 != 0) {
                if (var1.field3926 > 0) {
                    var1.field3926--;
                }
                if (var1.field3926 == 0 && var1.field3937 >= 1 && var1.field3915 >= 1 && var1.field3937 <= (class195.field2745 - 2) && class78.field984 - 2 >= var1.field3915 && (var1.field3917 < 0 || class402.method2510(var1.field3938, (byte) 98, var1.field3917))) {
                    class359.method2284(var1.field3927, var1.field3915, var1.field3917, var1.field3937, (byte) -12, var1.field3929, -1, var1.field3928, var1.field3938);
                    var1.field3926 = -1;
                    if (var1.field3922 == var1.field3917 && var1.field3922 == -1) {
                        var1.method1820(-25246);
                    } else if (var1.field3922 == var1.field3917 && var1.field3932 == var1.field3928 && var1.field3938 == var1.field3920) {
                        var1.method1820(-25246);
                    }
                }
            } else if (var1.field3922 < 0 || class402.method2510(var1.field3920, (byte) 98, var1.field3922)) {
                class359.method2284(var1.field3927, var1.field3915, var1.field3922, var1.field3937, (byte) -12, var1.field3929, -1, var1.field3932, var1.field3920);
                var1.method1820(-25246);
            }
        }
    }
}
