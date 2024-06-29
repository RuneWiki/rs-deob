import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 extends class194 {

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "[I")
    public int[] field804 = new int[1];

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "[I")
    public int[] field810 = new int[] { -1 };

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "Lqk;")
    private static class207 field802 = class24.method212(255, "Members object");

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Lqk;")
    public static class207 field803 = class24.method212(255, "classement ");

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "Lqk;")
    public static class207 field801 = class24.method212(255, "<col=c0ff00>");

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Lqk;")
    public static class207 field798 = field802;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "[Lqk;")
    public static class207[] field797 = new class207[1000];

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "[Lqk;")
    public static class207[] field808 = new class207[8];

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field806 = 0;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "[I")
    public static int[] field809;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public static final void method302(byte arg0) {
        if (arg0 == -108) {
            field795++;
            class176.field3180.method1382(31346);
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)Z")
    public static final boolean method303(int arg0) {
        if (arg0 != 24006) {
            method305(-88, (byte) -90, (class220[]) null);
        }
        field794++;
        try {
            return class68.method489(-98);
        } catch (IOException var4) {
            class60.method445(arg0 ^ 0x321A);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class280.field4915 + "," + class249.field4515 + "," + class245.field4443 + " - " + class245.field4437 + "," + (class202.field3565.field5022[0] + class21.field349) + "," + (class202.field3565.field5074[0] + class180.field3231) + " - ";
            for (int var3 = 0; class245.field4437 > var3 && var3 < 50; var3++) {
                var2 = var2 + class17.field262.field2568[var3] + ",";
            }
            class202.method1402(var2, 32701, var5);
            class97.method687(arg0 - 46461);
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method304(int arg0, int arg1, int arg2, long arg3) {
        class174 var5 = class82.field1498[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3136 != null && var5.field3136.field3710 == arg3) {
            return true;
        } else if (var5.field3142 != null && var5.field3142.field560 == arg3) {
            return true;
        } else if (var5.field3152 != null && var5.field3152.field4464 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3138; var6++) {
                if (var5.field3140[var6].field5129 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB[Lmd;)V")
    public static final void method305(int arg0, byte arg1, class220[] arg2) {
        if (arg1 > -36) {
            method305(119, (byte) -4, (class220[]) null);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class220 var4 = arg2[var3];
            if (var4 != null && var4.field4045 == arg0 && (!var4.field4010 || !client.method1116(var4))) {
                if (var4.field3988 == 0) {
                    if (!var4.field4010 && client.method1116(var4) && class204.field3597 != var4) {
                        continue;
                    }
                    method305(var4.field3933, (byte) -60, arg2);
                    if (var4.field3959 != null) {
                        method305(var4.field3933, (byte) -103, var4.field3959);
                    }
                    class47 var5 = (class47) class171.field3028.method1867((long) var4.field3933, true);
                    if (var5 != null) {
                        class24.method182(var5.field934, (byte) -105);
                    }
                }
                if (var4.field3988 == 6) {
                    if (var4.field3882 != -1 || var4.field3924 != -1) {
                        boolean var6 = class107.method780(19684, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3924;
                        } else {
                            var7 = var4.field3882;
                        }
                        if (var7 != -1) {
                            class65 var8 = class16.method101((byte) -97, var7);
                            if (var8 != null) {
                                var4.field4033 += class20.field325;
                                while (var8.field1150[var4.field4017] < var4.field4033) {
                                    var4.field4033 -= var8.field1150[var4.field4017];
                                    var4.field4017++;
                                    if (var8.field1180.length <= var4.field4017) {
                                        var4.field4017 -= var8.field1158;
                                        if (var4.field4017 < 0 || var4.field4017 >= var8.field1180.length) {
                                            var4.field4017 = 0;
                                        }
                                    }
                                    var4.field4012 = var4.field4017 + 1;
                                    if (var4.field4012 >= var8.field1180.length) {
                                        var4.field4012 -= var8.field1158;
                                        if (var4.field4012 < 0 || var8.field1180.length <= var4.field4012) {
                                            var4.field4012 = -1;
                                        }
                                    }
                                    class82.method614((byte) 61, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4020 != 0 && !var4.field4010) {
                        int var9 = var4.field4020 >> 16;
                        int var10 = var4.field4020 << 16 >> 16;
                        int var11 = class20.field325 * var10;
                        int var12 = class20.field325 * var9;
                        var4.field3875 = var4.field3875 + var11 & 0x7FF;
                        var4.field3987 = var4.field3987 + var12 & 0x7FF;
                        class82.method614((byte) 66, var4);
                    }
                }
            }
        }
        field799++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public static final void method306(int arg0, int arg1) {
        field796++;
        class90 var2 = class221.method1575(5, arg1, arg0 ^ 0x626F9D60);
        var2.method651(-27655);
        if (arg0 != 0) {
            field808 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILv;)V")
    public static final void method307(int arg0, class149 arg1) {
        field805++;
        int var2 = -81 % ((arg0 + 52) / 51);
        while (true) {
            while (arg1.field2568.length > arg1.field2593) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method1045((byte) 79) == 1) {
                    var4 = arg1.method1045((byte) -105);
                    var3 = true;
                    var5 = arg1.method1045((byte) 90);
                }
                int var6 = arg1.method1045((byte) -127);
                int var7 = arg1.method1045((byte) -89);
                int var8 = class111.field1932 + class70.field1253 - var7 * 64 - 1;
                int var9 = var6 * 64 - class198.field3473;
                if (var9 >= 0 && (var8 - 63) >= 0 && var9 + 63 < class197.field3463 && var8 < class70.field1253) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var4 * 8 <= var12 && var12 < (var4 * 8 + 8) && var13 >= var5 * 8 && var13 < var5 * 8 + 8) {
                                int var14 = arg1.method1045((byte) -102);
                                if (var14 != 0) {
                                    if ((var14 & 0x1) == 1) {
                                        int var15 = arg1.method1045((byte) 97);
                                        if (class75.field1388[var10][var11] == null) {
                                            class75.field1388[var10][var11] = new byte[4096];
                                        }
                                        class75.field1388[var10][var11][(63 - var13 << 6) + var12] = (byte) var15;
                                    }
                                    if ((var14 & 0x2) == 2) {
                                        int var16 = arg1.method1065((byte) 91);
                                        if (class236.field4351[var10][var11] == null) {
                                            class236.field4351[var10][var11] = new int[4096];
                                        }
                                        class236.field4351[var10][var11][(63 - var13 << 6) + var12] = var16;
                                    }
                                    if ((var14 & 0x4) == 4) {
                                        int var17 = arg1.method1065((byte) 121);
                                        if (class127.field2221[var10][var11] == null) {
                                            class127.field2221[var10][var11] = new int[4096];
                                        }
                                        var17--;
                                        class22 var18 = class33.method251(0, var17);
                                        if (var18.field428 != null) {
                                            var18 = var18.method141(false);
                                            if (var18 == null || var18.field362 == -1) {
                                                continue;
                                            }
                                        }
                                        class127.field2221[var10][var11][(63 - var13 << 6) + var12] = var18.field375 + 1;
                                        class73 var19 = new class73();
                                        var19.field1343 = var8;
                                        var19.field1352 = var9;
                                        var19.field1339 = var18.field362;
                                        class14.field234.method931(var19, 115);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var20 = 0; var20 < (var3 ? 64 : 4096); var20++) {
                        int var21 = arg1.method1045((byte) 114);
                        if (var21 != 0) {
                            if ((var21 & 0x1) == 1) {
                                arg1.field2593++;
                            }
                            if ((var21 & 0x2) == 2) {
                                arg1.field2593 += 2;
                            }
                            if ((var21 & 0x4) == 4) {
                                arg1.field2593 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public static void method308(int arg0) {
        if (arg0 != 2047) {
            method303(-84);
        }
        field808 = null;
        field802 = null;
        field801 = null;
        field803 = null;
        field797 = null;
        field798 = null;
        field809 = null;
    }
}
