import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class244 extends class4 {

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public int field3919 = 0;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3914 = "Hidden";

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "Lqh;")
    public static class201 field3917;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lf;IIB)V")
    public static final void method1676(class36 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 96) {
            return;
        }
        field3920++;
        if (arg0.field707 == 1) {
            class40.method348(arg0.field648, 0L, (short) 18, arg0.field558, 0, -1, "", true);
            class128.field2072++;
        }
        if (arg0.field707 == 2 && !class288.field4560) {
            String var4 = class47.method378(arg0, (byte) 121);
            if (var4 != null) {
                class260.field4136++;
                class40.method348(arg0.field648, 0L, (short) 17, var4, -1, -1, "<col=00ff00>" + arg0.field590, true);
            }
        }
        if (arg0.field707 == 3) {
            class106.field1694++;
            class40.method348(arg0.field648, 0L, (short) 47, class42.field782, 0, -1, "", true);
        }
        if (arg0.field707 == 4) {
            class40.method348(arg0.field648, 0L, (short) 45, arg0.field558, 0, -1, "", true);
            class199.field3176++;
        }
        if (arg0.field707 == 5) {
            class43.field797++;
            class40.method348(arg0.field648, 0L, (short) 19, arg0.field558, 0, -1, "", true);
        }
        if (arg0.field707 == 6 && class207.field3333 == null) {
            class50.field877++;
            class40.method348(arg0.field648, 0L, (short) 36, arg0.field558, -1, -1, "", true);
        }
        if (arg0.field709 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field556; var6++) {
                for (int var7 = 0; var7 < arg0.field711; var7++) {
                    int var8 = (arg0.field653 + 32) * var7;
                    int var9 = (arg0.field641 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field594[var5];
                        var8 += arg0.field690[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && var9 + 32 > arg2) {
                        class67.field1105 = arg0;
                        class178.field2804 = var5;
                        if (arg0.field638[var5] > 0) {
                            class84 var10 = client.method1093(arg0);
                            class12 var11 = class83.method595(arg0.field638[var5] - 1, -73);
                            if (class51.field894 == 1 && var10.method611((byte) 127)) {
                                if (class86.field1375 != arg0.field648 || class45.field823 != var5) {
                                    class40.method348(arg0.field648, (long) var11.field196, (short) 10, class200.field3193, var5, -1, class197.field3152 + " -> <col=ff9040>" + var11.field174, true);
                                    class107.field1744++;
                                }
                            } else if (class288.field4560 && var10.method611((byte) 127)) {
                                class39 var12 = class35.field543 == -1 ? null : class87.method632(class35.field543, 95);
                                if ((class212.field3473 & 0x10) != 0 && (var12 == null || var11.method94(var12.field735, (byte) -118, class35.field543) != var12.field735)) {
                                    class110.field1830++;
                                    class40.method348(arg0.field648, (long) var11.field196, (short) 57, class154.field2496, var5, class138.field2268, class149.field2403 + " -> <col=ff9040>" + var11.field174, true);
                                }
                            } else {
                                String[] var13 = var11.field222;
                                class76.field1233++;
                                if (class266.field4218) {
                                    var13 = class176.method1204(var13, 5);
                                }
                                if (var10.method611((byte) -64)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class161.field2572++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 37;
                                            } else {
                                                var15 = 1;
                                            }
                                            class40.method348(arg0.field648, (long) var11.field196, var15, var13[var14], var5, -1, "<col=ff9040>" + var11.field174, true);
                                        }
                                    }
                                }
                                if (var10.method600((byte) -18)) {
                                    class40.method348(arg0.field648, (long) var11.field196, (short) 15, class200.field3193, var5, class89.field1414, "<col=ff9040>" + var11.field174, true);
                                    class258.field4110++;
                                }
                                if (var10.method611((byte) 127) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class74.field1199++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 22;
                                            }
                                            if (var16 == 1) {
                                                var17 = 9;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            class40.method348(arg0.field648, (long) var11.field196, var17, var13[var16], var5, -1, "<col=ff9040>" + var11.field174, true);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field670;
                                if (class266.field4218) {
                                    var18 = class176.method1204(var18, 5);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class177.field2797++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 24;
                                            }
                                            if (var19 == 1) {
                                                var20 = 58;
                                            }
                                            if (var19 == 2) {
                                                var20 = 23;
                                            }
                                            if (var19 == 3) {
                                                var20 = 29;
                                            }
                                            if (var19 == 4) {
                                                var20 = 12;
                                            }
                                            class40.method348(arg0.field648, (long) var11.field196, var20, var18[var19], var5, -1, "<col=ff9040>" + var11.field174, true);
                                        }
                                    }
                                }
                                class40.method348(arg0.field648, (long) var11.field196, (short) 1001, class288.field4561, var5, class24.field397, "<col=ff9040>" + var11.field174, true);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field597) {
            return;
        }
        if (!class288.field4560) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class193.method1315(var21, true, arg0);
                if (var25 != null) {
                    class40.method348(arg0.field648, (long) (var21 + 1), (short) 1005, var25, arg0.field661, class262.method1785(arg0, var21, -20959), arg0.field671, true);
                    class6.field77++;
                }
            }
            String var22 = class47.method378(arg0, (byte) -109);
            if (var22 != null) {
                class260.field4136++;
                class40.method348(arg0.field648, 0L, (short) 17, var22, arg0.field661, -1, arg0.field671, true);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class193.method1315(var23, true, arg0);
                if (var24 != null) {
                    class40.method348(arg0.field648, (long) (var23 + 1), (short) 31, var24, arg0.field661, class262.method1785(arg0, var23, -20959), arg0.field671, true);
                    class6.field77++;
                }
            }
            if (client.method1093(arg0).method609((byte) 118)) {
                class50.field877++;
                class40.method348(arg0.field648, 0L, (short) 36, class284.field4483, arg0.field661, -1, "", true);
                return;
            }
            return;
        }
        if (client.method1093(arg0).method607(false) && (class212.field3473 & 0x20) != 0) {
            class205.field3280++;
            class40.method348(arg0.field648, 0L, (short) 11, class154.field2496, arg0.field661, class138.field2268, class149.field2403 + " -> " + arg0.field671, true);
            return;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1677(String arg0, int arg1) {
        field3910++;
        int var2 = class177.method1209(arg0, -1);
        int var3 = 27 % ((arg1 + 20) / 38);
        if (var2 != -1) {
            class167.method1154(class153.field2479.field276[var2], (byte) 93, class153.field2479.field264[var2]);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Log;B)V")
    public final void method1678(class221 arg0, byte arg1) {
        int var3 = -35 / ((arg1 - 92) / 32);
        while (true) {
            int var4 = arg0.method1517((byte) -96);
            if (var4 == 0) {
                field3907++;
                return;
            }
            this.method1682(arg0, -3, var4);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IS)Z")
    public static final boolean method1679(int arg0, short arg1) {
        field3913++;
        if (arg1 == 22 || arg1 == 9 || arg1 == 41 || arg1 == 37 || arg1 == 1 || arg1 == 15 || arg1 == 10 || arg1 == 57) {
            return true;
        } else if (arg1 == 31 || arg1 == 11 || arg1 == 1001 || arg1 == 1005) {
            return true;
        } else if (arg1 == 24 || arg1 == 58 || arg1 == 23 || arg1 == 29 || arg1 == 12) {
            return true;
        } else if (arg1 == 18 || arg1 == 17 || arg1 == 47 || arg1 == 45 || arg1 == 19 || arg1 == 36) {
            return true;
        } else {
            if (arg0 != 31) {
                field3917 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method1680(byte arg0) {
        field3914 = null;
        if (arg0 == -64) {
            field3917 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Leg;")
    public static final class227 method1681(int arg0, int arg1) {
        field3915++;
        class227 var2 = (class227) class96.field1569.method480((long) arg1, 75);
        if (arg0 != 19) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class199.field3185.method1357(arg1, 34, -1);
            class227 var4 = new class227();
            if (var3 != null) {
                var4.method1596(new class221(var3), arg1, -1);
            }
            class96.field1569.method474((long) arg1, (byte) 70, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Log;II)V")
    private final void method1682(class221 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field3919 = arg0.method1521((byte) 113);
        }
        field3912++;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)Loa;")
    public static final class99 method1683(int arg0, int arg1) {
        field3916++;
        if (arg1 >= -74) {
            method1681(-11, 120);
        }
        class99 var2 = (class99) class85.field1331.method480((long) arg0, 103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class36.field694.method1357(arg0, 33, -1);
        class99 var4 = new class99();
        if (var3 != null) {
            var4.method731(new class221(var3), 106, arg0);
        }
        class85.field1331.method474((long) arg0, (byte) 38, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
    public static final void method1684(int arg0) {
        field3909++;
        class96.field1569.method481(false);
        if (arg0 < 49) {
            field3917 = null;
        }
        class15.field260.method481(false);
    }
}
