import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class32 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field468 = new String[500];

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[[S")
    public static short[][] field470 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Lki;")
    public static class180 field471;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method263(int arg0) {
        if (arg0 != 27261) {
            field464 = 115;
        }
        field474++;
        class73.field1202 = null;
        class48.field790 = null;
        class217.field3310 = null;
        class48.field782 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z", line = 24)
    public final boolean method264(boolean arg0) {
        field475++;
        if (!arg0) {
            this.method265(-75);
        }
        return (this.field462 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Z", line = 42)
    public final boolean method265(int arg0) {
        if (arg0 != 2) {
            this.method268((byte) 76);
        }
        field467++;
        return (this.field462 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)Z", line = 53)
    public final boolean method266(int arg0) {
        if (arg0 == 0) {
            field458++;
            return (this.field462 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 68)
    public static final void method267(byte arg0) {
        field465++;
        for (class61 var1 = (class61) class276.field4257.method1228(true); var1 != null; var1 = (class61) class276.field4257.method1223((byte) 13)) {
            int var2 = var1.field982;
            if (class321.method2189(var2, (byte) 79)) {
                class220[] var3 = class163.field2463[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field3445;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field758;
                    class220 var7 = class68.method524((byte) -126, var6);
                    if (var7 != null) {
                        class26.method241(3095, var7);
                    }
                }
            }
        }
        if (arg0 != -103) {
            field471 = (class180) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Z", line = 123)
    public final boolean method268(byte arg0) {
        if (arg0 == -79) {
            field469++;
            return (this.field462 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Lpb;", line = 139)
    public static final class2 method269(int arg0, int arg1, int arg2) {
        field466++;
        if (arg0 != 16474) {
            method271((byte) 124, (class166) null);
        }
        for (class2 var3 = (class2) class71.field1172.method1228(true); var3 != null; var3 = (class2) class71.field1172.method1223((byte) 13)) {
            if (var3.field41 && var3.method15(arg1, arg2, (byte) -106)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 165)
    public static void method270(int arg0) {
        if (arg0 == -15697) {
            field468 = null;
            field470 = (short[][]) null;
            field471 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLkh;)V", line = 179)
    public static final void method271(byte arg0, class166 arg1) {
        field473++;
        if (arg0 != 87) {
            field463 = 100;
        }
        while (true) {
            while (arg1.field2532 < arg1.field2500.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method1178(0) == 1) {
                    var3 = true;
                    var2 = arg1.method1178(0);
                    var4 = arg1.method1178(arg0 - 87);
                }
                int var5 = arg1.method1178(0);
                int var6 = arg1.method1178(0);
                int var7 = class333.field5202 + (class233.field3706 - 1) - (var6 * 64);
                int var8 = var5 * 64 - class84.field1311;
                if (var8 >= 0 && var7 - 63 >= 0 && (var8 + 63) < class313.field4863 && class233.field3706 > var7) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && (var2 * 8 + 8) > var11 && var12 >= (var4 * 8) && var4 * 8 + 8 > var12) {
                                int var13 = arg1.method1178(0);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1178(arg0 - 87);
                                        if (class150.field2268[var10][var9] == null) {
                                            class150.field2268[var10][var9] = new byte[4096];
                                        }
                                        class150.field2268[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1156((byte) 30);
                                        if (class188.field2808[var10][var9] == null) {
                                            class188.field2808[var10][var9] = new int[4096];
                                        }
                                        class188.field2808[var10][var9][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method1156((byte) 36);
                                        if (class270.field4210[var10][var9] == null) {
                                            class270.field4210[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class85 var17 = class201.method1431(-115, var16);
                                        if (var17.field1375 != null) {
                                            var17 = var17.method598((byte) -80);
                                            if (var17 == null || var17.field1326 == -1) {
                                                continue;
                                            }
                                        }
                                        class270.field4210[var10][var9][(63 - var12 << 6) + var11] = var17.field1321 + 1;
                                        class119 var18 = new class119();
                                        var18.field1819 = var8;
                                        var18.field1820 = var7;
                                        var18.field1818 = var17.field1326;
                                        class44.field705.method632(arg0 ^ 0xFFFFFFB2, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1178(arg0 ^ 0x57);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field2532++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field2532 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field2532 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
