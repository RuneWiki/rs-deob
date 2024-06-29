import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class256 extends class7 {

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4074 = "Please remove ";

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "[I")
    public static int[] field4076 = new int[25];

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4077 = "flash3:";

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4080 = "yellow:";

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field4081 = 0;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
    public static boolean field4075;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
    public static final void method1710(int arg0, boolean arg1) {
        if (arg1) {
            if (class223.field3558 != -1) {
                class164.method1185(class223.field3558, arg0 + 16451);
            }
            for (class167 var2 = (class167) class91.field1434.method1062(arg0 ^ 0xFFFFBFFF); var2 != null; var2 = (class167) class91.field1434.method1059(-14608)) {
                class164.method1184((byte) 66, true, var2);
            }
            class223.field3558 = -1;
            class91.field1434 = new class144(8);
            class297.method1991((byte) -126);
            class223.field3558 = class250.field3984;
            class190.method1313(false, 115);
            class161.method1164(true);
            class65.method504(class223.field3558, 149);
        }
        field4073++;
        class96.field1494 = -1;
        class70.method547((byte) 84, class205.field3306);
        class48.field878 = new class213();
        class48.field878.field2849 = 3000;
        if (arg0 != -16454) {
            method1711(92, -46, 102);
        }
        class48.field878.field2887 = 3000;
        if (class238.field3752 == 0) {
            class228.method1521(class35.field594, -1094328408);
            class274.method1856(10, arg0 + 16459);
            return;
        }
        if (class184.field3033 == 2) {
            class148.field2434 = class67.field1146 << 7;
            class31.field527 = class11.field147 << 7;
        } else {
            class223.method1502((byte) 101);
        }
        class201.method1357(-40);
        class274.method1856(28, 5);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Lta;")
    public static final class190 method1711(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2142; var4++) {
            class190 var5 = var3.field2131[var4];
            if ((var5.field3118 >> 29 & 0x3L) == 2L && var5.field3115 == arg1 && var5.field3110 == arg2) {
                class76.method604(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IZ)I")
    public static final int method1712(int arg0, boolean arg1) {
        if (!arg1) {
            field4074 = null;
        }
        field4072++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public static void method1713(int arg0) {
        field4077 = null;
        field4074 = null;
        field4080 = null;
        if (arg0 > -82) {
            field4081 = -96;
        }
        field4076 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILkj;II)V")
    public static final void method1714(int arg0, class114 arg1, int arg2, int arg3) {
        if (arg1.field1797 == 1) {
            class36.field609++;
            class107.method798(0L, false, -1, (short) 2, arg1.field1789, "", arg1.field1786, 0);
        }
        if (arg1.field1797 == 2 && !class239.field3761) {
            String var4 = class186.method1293(arg1, -1);
            if (var4 != null) {
                class38.field644++;
                class107.method798(0L, false, -1, (short) 39, arg1.field1789, "<col=00ff00>" + arg1.field1887, var4, -1);
            }
        }
        if (arg1.field1797 == 3) {
            class228.field3621++;
            class107.method798(0L, false, -1, (short) 40, arg1.field1789, "", class138.field2314, 0);
        }
        field4078++;
        if (arg1.field1797 == 4) {
            class107.method798(0L, false, -1, (short) 16, arg1.field1789, "", arg1.field1786, 0);
            class9.field111++;
        }
        if (arg1.field1797 == 5) {
            class107.method798(0L, false, -1, (short) 35, arg1.field1789, "", arg1.field1786, 0);
            class251.field3999++;
        }
        int var5 = 71 % ((-arg3 - 50) / 59);
        if (arg1.field1797 == 6 && class295.field4677 == null) {
            class153.field2490++;
            class107.method798(0L, false, -1, (short) 42, arg1.field1789, "", arg1.field1786, -1);
        }
        if (arg1.field1898 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.field1902; var7++) {
                for (int var8 = 0; var8 < arg1.field1752; var8++) {
                    int var9 = (arg1.field1793 + 32) * var7;
                    int var10 = (arg1.field1829 + 32) * var8;
                    if (var6 < 20) {
                        var10 += arg1.field1877[var6];
                        var9 += arg1.field1761[var6];
                    }
                    if (arg2 >= var10 && var9 <= arg0 && var10 + 32 > arg2 && arg0 < var9 + 32) {
                        class206.field3309 = arg1;
                        class152.field2487 = var6;
                        if (arg1.field1785[var6] > 0) {
                            class253 var11 = client.method1916(arg1);
                            class67 var12 = class190.method1314(arg1.field1785[var6] - 1, (byte) 68);
                            if (class219.field3514 == 1 && var11.method1682(2001259446)) {
                                if (class258.field4106 != arg1.field1789 || class189.field3104 != var6) {
                                    class40.field681++;
                                    class107.method798((long) var12.field1136, false, -1, (short) 8, arg1.field1789, class236.field3730 + " -> <col=ff9040>" + var12.field1155, class131.field2169, var6);
                                }
                            } else if (class239.field3761 && var11.method1682(2001259446)) {
                                class70 var13 = class172.field2912 == -1 ? null : class57.method455(class172.field2912, false);
                                if ((class111.field1708 & 0x10) != 0 && (var13 == null || var12.method524(var13.field1177, class172.field2912, 61) != var13.field1177)) {
                                    class107.method798((long) var12.field1136, false, class110.field1702, (short) 44, arg1.field1789, class20.field314 + " -> <col=ff9040>" + var12.field1155, class135.field2226, var6);
                                    class61.field1041++;
                                }
                            } else {
                                class285.field4544++;
                                String[] var14 = var12.field1160;
                                if (class11.field156) {
                                    var14 = class56.method449((byte) -30, var14);
                                }
                                if (var11.method1682(2001259446)) {
                                    for (int var15 = 4; var15 >= 3; var15--) {
                                        if (var14 != null && var14[var15] != null) {
                                            class94.field1465++;
                                            byte var16;
                                            if (var15 == 3) {
                                                var16 = 10;
                                            } else {
                                                var16 = 4;
                                            }
                                            class107.method798((long) var12.field1136, false, -1, var16, arg1.field1789, "<col=ff9040>" + var12.field1155, var14[var15], var6);
                                        }
                                    }
                                }
                                if (var11.method1685((byte) 94)) {
                                    class107.method798((long) var12.field1136, false, class286.field4556, (short) 17, arg1.field1789, "<col=ff9040>" + var12.field1155, class131.field2169, var6);
                                    class154.field2504++;
                                }
                                if (var11.method1682(2001259446) && var14 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var14[var17] != null) {
                                            class46.field834++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 58;
                                            }
                                            if (var17 == 1) {
                                                var18 = 51;
                                            }
                                            if (var17 == 2) {
                                                var18 = 57;
                                            }
                                            class107.method798((long) var12.field1136, false, -1, var18, arg1.field1789, "<col=ff9040>" + var12.field1155, var14[var17], var6);
                                        }
                                    }
                                }
                                String[] var19 = arg1.field1864;
                                if (class11.field156) {
                                    var19 = class56.method449((byte) -30, var19);
                                }
                                if (var19 != null) {
                                    for (int var20 = 4; var20 >= 0; var20--) {
                                        if (var19[var20] != null) {
                                            class268.field4289++;
                                            byte var21 = 0;
                                            if (var20 == 0) {
                                                var21 = 41;
                                            }
                                            if (var20 == 1) {
                                                var21 = 22;
                                            }
                                            if (var20 == 2) {
                                                var21 = 25;
                                            }
                                            if (var20 == 3) {
                                                var21 = 37;
                                            }
                                            if (var20 == 4) {
                                                var21 = 29;
                                            }
                                            class107.method798((long) var12.field1136, false, -1, var21, arg1.field1789, "<col=ff9040>" + var12.field1155, var19[var20], var6);
                                        }
                                    }
                                }
                                class107.method798((long) var12.field1136, false, class107.field1633, (short) 1003, arg1.field1789, "<col=ff9040>" + var12.field1155, class32.field529, var6);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg1.field1765) {
            return;
        }
        if (!class239.field3761) {
            for (int var22 = 9; var22 >= 5; var22--) {
                String var26 = class3.method18(arg1, var22, -5978);
                if (var26 != null) {
                    class252.field4007++;
                    class107.method798((long) (var22 + 1), false, class97.method740(arg1, var22, (byte) 113), (short) 1004, arg1.field1789, arg1.field1897, var26, arg1.field1916);
                }
            }
            String var23 = class186.method1293(arg1, -1);
            if (var23 != null) {
                class38.field644++;
                class107.method798(0L, false, -1, (short) 39, arg1.field1789, arg1.field1897, var23, arg1.field1916);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class3.method18(arg1, var24, -5978);
                if (var25 != null) {
                    class252.field4007++;
                    class107.method798((long) (var24 + 1), false, class97.method740(arg1, var24, (byte) -91), (short) 6, arg1.field1789, arg1.field1897, var25, arg1.field1916);
                }
            }
            if (client.method1916(arg1).method1687(true)) {
                class153.field2490++;
                if (arg1.field1891 != null) {
                    class107.method798(0L, false, -1, (short) 42, arg1.field1789, "", arg1.field1891, arg1.field1916);
                    return;
                }
                class107.method798(0L, false, -1, (short) 42, arg1.field1789, "", class57.field1000, arg1.field1916);
                return;
            }
            return;
        }
        if (client.method1916(arg1).method1681(false) && (class111.field1708 & 0x20) != 0) {
            class148.field2429++;
            class107.method798(0L, false, class110.field1702, (short) 12, arg1.field1789, class20.field314 + " -> " + arg1.field1897, class135.field2226, arg1.field1916);
            return;
        }
    }
}
