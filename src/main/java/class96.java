import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class96 {

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Lmh;")
    public static class128 field1617 = class22.method156(126, "logo");

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lmh;")
    public static class128 field1626 = class22.method156(122, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Ldj;")
    public static class314 field1611;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Lfb;")
    public static class55 field1612;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "[Lvd;")
    public static class127[] field1610;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "[[[Le;")
    public static class150[][][] field1632;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[B)Lue;", line = 12)
    public static final class14 method601(int arg0, byte[] arg1) {
        field1638++;
        if (arg1 == null) {
            return null;
        } else {
            class14 var2 = new class14(arg1, class151.field2607, class266.field4603, class125.field2106, class178.field3128, class157.field2690);
            int var3 = -28 % ((-arg0 - 61) / 43);
            class15.method113(118);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 39)
    public static void method602(int arg0) {
        field1611 = null;
        field1617 = null;
        if (arg0 == -28977) {
            field1632 = (class150[][][]) null;
            field1626 = null;
            field1612 = null;
            field1610 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lql;IIIIII)V", line = 64)
    public static final void method603(class16 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 0) {
            field1632 = (class150[][][]) ((class150[][][]) null);
        }
        field1639++;
        class284.method1966(true, arg0.field418, arg0.field478, arg5, arg6, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(JI)V", line = 75)
    public static final void method604(long arg0, int arg1) {
        field1613++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class214.field3779 < 100 || class239.field4084) || class214.field3779 >= 200) {
            class212.method1456(class188.field3254, 1, class273.field4733, 0);
            return;
        }
        class128 var3 = class260.method1827(true, arg0).method850(arg1 - 143);
        for (int var4 = 0; var4 < class214.field3779; var4++) {
            if (class34.field738[var4] == arg0) {
                class212.method1456(class28.method177((byte) -72, new class128[] { var3, class173.field3026 }), 1, class273.field4733, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class218.field3847; var5++) {
            if (class208.field3646[var5] == arg0) {
                class212.method1456(class28.method177((byte) -74, new class128[] { class64.field1243, var3, class241.field4123 }), 1, class273.field4733, 0);
                return;
            }
        }
        if (var3.method855(class163.field2796.field2079, 255)) {
            class212.method1456(class278.field4792, arg1 - 197, class273.field4733, 0);
            return;
        }
        class313.field5284[class214.field3779] = var3;
        class34.field738[class214.field3779] = arg0;
        class171.field2996[class214.field3779] = 0;
        class6.field114[class214.field3779] = class273.field4733;
        class287.field4901++;
        class208.field3707[class214.field3779] = 0;
        class256.field4406[class214.field3779] = false;
        class208.field3708 = class104.field1788;
        class214.field3779++;
        class71.field1320.method570(arg1, -1);
        class71.field1320.method1344(86, arg0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILem;II)V", line = 162)
    public static final void method605(int arg0, class10 arg1, int arg2, int arg3) {
        if (arg1.field359 == 1) {
            class89.method559(0, arg1.field279, (short) 39, arg1.field230, class273.field4733, 1, 0L);
            class306.field5213++;
        }
        if (arg1.field359 == 2 && !class31.field685) {
            class128 var4 = class45.method302(arg2 - 10927, arg1);
            if (var4 != null) {
                class89.method559(-1, var4, (short) 21, arg1.field230, class28.method177((byte) -85, new class128[] { class90.field1534, arg1.field238 }), 1, 0L);
                class289.field4938++;
            }
        }
        field1637++;
        if (arg1.field359 == 3) {
            class105.field1796++;
            class89.method559(0, class81.field1448, (short) 47, arg1.field230, class273.field4733, 1, 0L);
        }
        if (arg1.field359 == 4) {
            class89.method559(0, arg1.field279, (short) 46, arg1.field230, class273.field4733, 1, 0L);
            class254.field4384++;
        }
        if (arg1.field359 == 5) {
            class89.method559(0, arg1.field279, (short) 5, arg1.field230, class273.field4733, 1, 0L);
            class167.field2875++;
        }
        if (arg1.field359 == 6 && class36.field739 == null) {
            class250.field4329++;
            class89.method559(-1, arg1.field279, (short) 25, arg1.field230, class273.field4733, 1, 0L);
        }
        if (arg1.field288 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field229; var6++) {
                for (int var7 = 0; var7 < arg1.field327; var7++) {
                    int var8 = (arg1.field364 + 32) * var7;
                    int var9 = (arg1.field223 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg1.field287[var5];
                        var9 += arg1.field337[var5];
                    }
                    if (arg3 >= var8 && arg0 >= var9 && var8 + 32 > arg3 && arg0 < var9 + 32) {
                        class129.field2263 = var5;
                        class185.field3223 = arg1;
                        if (arg1.field336[var5] > 0) {
                            class200 var10 = class180.method1226(false, arg1.field336[var5] - 1);
                            if (class28.field591 == 1 && class114.method687(client.method1657(arg1), (byte) -102)) {
                                if (class43.field872 != arg1.field230 || class176.field3106 != var5) {
                                    class233.field4018++;
                                    class89.method559(var5, class245.field4187, (short) 6, arg1.field230, class28.method177((byte) -101, new class128[] { class194.field3381, class92.field1571, var10.field3506 }), 1, (long) var10.field3542);
                                }
                            } else if (!class31.field685 || !class114.method687(client.method1657(arg1), (byte) -102)) {
                                class220.field3882++;
                                class128[] var11 = var10.field3521;
                                if (class161.field2738) {
                                    var11 = class253.method1795(var11, arg2 ^ 0x2AAA);
                                }
                                if (class114.method687(client.method1657(arg1), (byte) -102)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class132.field2287++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 35;
                                            } else {
                                                var13 = 32;
                                            }
                                            class89.method559(var5, var11[var12], var13, arg1.field230, class28.method177((byte) -89, new class128[] { class102.field1751, var10.field3506 }), 1, (long) var10.field3542);
                                        } else if (var12 == 4) {
                                            class89.method559(var5, class128.field2211, (short) 32, arg1.field230, class28.method177((byte) -77, new class128[] { class102.field1751, var10.field3506 }), arg2 ^ 0x2AAE, (long) var10.field3542);
                                            class221.field3891++;
                                        }
                                    }
                                }
                                if (class248.method1719(true, client.method1657(arg1))) {
                                    class89.method559(var5, class245.field4187, (short) 31, arg1.field230, class28.method177((byte) -112, new class128[] { class102.field1751, var10.field3506 }), 1, (long) var10.field3542);
                                    class222.field3898++;
                                }
                                if (class114.method687(client.method1657(arg1), (byte) -102) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class5.field102++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 30;
                                            }
                                            if (var14 == 1) {
                                                var15 = 49;
                                            }
                                            if (var14 == 2) {
                                                var15 = 57;
                                            }
                                            class89.method559(var5, var11[var14], var15, arg1.field230, class28.method177((byte) -86, new class128[] { class102.field1751, var10.field3506 }), 1, (long) var10.field3542);
                                        }
                                    }
                                }
                                class128[] var16 = arg1.field340;
                                if (class161.field2738) {
                                    var16 = class253.method1795(var16, arg2 ^ 0x2AAA);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 12;
                                            }
                                            if (var17 == 1) {
                                                var18 = 50;
                                            }
                                            if (var17 == 2) {
                                                var18 = 28;
                                            }
                                            if (var17 == 3) {
                                                var18 = 8;
                                            }
                                            if (var17 == 4) {
                                                var18 = 38;
                                            }
                                            class89.method559(var5, var16[var17], var18, arg1.field230, class28.method177((byte) -105, new class128[] { class102.field1751, var10.field3506 }), 1, (long) var10.field3542);
                                            class1.field3++;
                                        }
                                    }
                                }
                                class89.method559(var5, class74.field1395, (short) 1005, arg1.field230, class28.method177((byte) -61, new class128[] { class102.field1751, var10.field3506 }), 1, (long) var10.field3542);
                            } else if ((class284.field4879 & 0x10) == 16) {
                                class229.field3987++;
                                class89.method559(var5, class140.field2398, (short) 24, arg1.field230, class28.method177((byte) -96, new class128[] { class120.field2024, class92.field1571, var10.field3506 }), 1, (long) var10.field3542);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg1.field294) {
            if (!class31.field685) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class128 var20 = class236.method1617(arg1, (byte) 125, var19);
                    if (var20 != null) {
                        class89.method559(arg1.field259, var20, (short) 1006, arg1.field230, arg1.field334, 1, (long) (var19 + 1));
                        class267.field4627++;
                    }
                }
                class128 var21 = class45.method302(0, arg1);
                if (var21 != null) {
                    class289.field4938++;
                    class89.method559(arg1.field259, var21, (short) 21, arg1.field230, arg1.field334, 1, 0L);
                }
                for (int var22 = 4; var22 >= 0; var22--) {
                    class128 var23 = class236.method1617(arg1, (byte) 87, var22);
                    if (var23 != null) {
                        class267.field4627++;
                        class89.method559(arg1.field259, var23, (short) 34, arg1.field230, arg1.field334, 1, (long) (var22 + 1));
                    }
                }
                if (class278.method1943((byte) -98, client.method1657(arg1))) {
                    class250.field4329++;
                    class89.method559(arg1.field259, class194.field3391, (short) 25, arg1.field230, class273.field4733, arg2 - 10926, 0L);
                }
            } else if (class162.method1068(client.method1657(arg1), 211742934) && (class284.field4879 & 0x20) == 32) {
                class32.field704++;
                class89.method559(arg1.field259, class140.field2398, (short) 45, arg1.field230, class28.method177((byte) -64, new class128[] { class120.field2024, class33.field717, arg1.field334 }), 1, 0L);
            }
        }
        if (arg2 != 10927) {
            method604(-30L, 123);
        }
    }
}
