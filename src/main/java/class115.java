import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class115 extends class178 {

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public int field2045 = -1;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public int field2055 = -1;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "Z")
    public boolean field2060 = false;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public int field2047 = 2;

    @OriginalMember(owner = "client!kg", name = "nb", descriptor = "I")
    public int field2068 = -1;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
    public int field2061 = 5;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public int field2054 = 99;

    @OriginalMember(owner = "client!kg", name = "pb", descriptor = "I")
    public int field2070 = -1;

    @OriginalMember(owner = "client!kg", name = "sb", descriptor = "I")
    public int field2073 = -1;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "[I")
    public static int[] field2041 = new int[500];

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field2052 = 0;

    @OriginalMember(owner = "client!kg", name = "ob", descriptor = "Loc;")
    private static class151 field2069 = class137.method873(2, "Could not complete login)3");

    @OriginalMember(owner = "client!kg", name = "qb", descriptor = "Loc;")
    private static class151 field2071 = class137.method873(2, "Create a free account");

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "Loc;")
    public static class151 field2062 = class137.method873(2, "M");

    @OriginalMember(owner = "client!kg", name = "tb", descriptor = "Loc;")
    public static class151 field2074 = field2069;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "Loc;")
    public static class151 field2049 = field2071;

    @OriginalMember(owner = "client!kg", name = "ub", descriptor = "Loc;")
    private static class151 field2075 = class137.method873(2, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "Loc;")
    public static class151 field2039 = field2075;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!kg", name = "jb", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!kg", name = "kb", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!kg", name = "lb", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!kg", name = "rb", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "[I")
    private int[] field2050;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "[I")
    public int[] field2051;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "[I")
    public int[] field2053;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "[I")
    public int[] field2056;

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "[I")
    private int[] field2063;

    @OriginalMember(owner = "client!kg", name = "mb", descriptor = "[[Lwd;")
    public static class232[][] field2067;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V")
    public final void method687(byte arg0) {
        field2043++;
        if (arg0 >= -119) {
            this.method700((byte) 106, null);
        }
        if (this.field2045 == -1) {
            if (this.field2063 == null) {
                this.field2045 = 0;
            } else {
                this.field2045 = 2;
            }
        }
        if (this.field2073 != -1) {
            return;
        }
        if (this.field2063 == null) {
            this.field2073 = 0;
        } else {
            this.field2073 = 2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    public static final void method688(int arg0, int arg1, int arg2) {
        class138.field2510 = true;
        class9.field136 = arg0;
        class2.field70 = arg1;
        class15.field358 = arg2;
        class124.field2234 = -1;
        class11.field209 = -1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BILbf;)Lbf;")
    public final class18 method689(byte arg0, int arg1, class18 arg2) {
        field2040++;
        int var4 = this.field2056[arg1];
        class195 var5 = class137.method870(255, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method161(true);
        }
        class195 var7 = null;
        int var8 = 0;
        int var9 = 29 / ((48 - arg0) / 55);
        if (this.field2050 != null && this.field2050.length > arg1) {
            int var10 = this.field2050[arg1];
            var7 = class137.method870(255, var10 >> 16);
            var8 = var10 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class18 var12 = arg2.method161(!var5.method1221(-120, var6));
            var12.method151(var5, var6);
            return var12;
        } else {
            class18 var11 = arg2.method161(!var5.method1221(-117, var6) & !var7.method1221(-77, var8));
            var11.method151(var5, var6);
            var11.method151(var7, var8);
            return var11;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBLbf;)Lbf;")
    public final class18 method690(int arg0, byte arg1, class18 arg2) {
        int var4 = this.field2056[arg0];
        field2072++;
        class195 var5 = class137.method870(255, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg1 <= 81) {
            field2049 = null;
        }
        if (var5 == null) {
            return arg2.method147(true);
        } else {
            class18 var7 = arg2.method147(!var5.method1221(-83, var6));
            var7.method151(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BILwa;)V")
    private final void method691(byte arg0, int arg1, class229 arg2) {
        if (arg0 <= 61) {
            method693(true);
        }
        if (arg1 == 1) {
            int var11 = arg2.method1490((byte) 73);
            this.field2051 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2051[var12] = arg2.method1490((byte) 73);
            }
            this.field2056 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field2056[var13] = arg2.method1490((byte) 73);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field2056[var14] = (arg2.method1490((byte) 73) << 16) + this.field2056[var14];
            }
        } else if (arg1 == 2) {
            this.field2055 = arg2.method1490((byte) 73);
        } else if (arg1 == 3) {
            int var4 = arg2.method1475(255);
            this.field2063 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2063[var5] = arg2.method1475(255);
            }
            this.field2063[var4] = 9999999;
        } else if (arg1 == 4) {
            this.field2060 = true;
        } else if (arg1 == 5) {
            this.field2061 = arg2.method1475(255);
        } else if (arg1 == 6) {
            this.field2068 = arg2.method1490((byte) 73);
        } else if (arg1 == 7) {
            this.field2070 = arg2.method1490((byte) 73);
        } else if (arg1 == 8) {
            this.field2054 = arg2.method1475(255);
        } else if (arg1 == 9) {
            this.field2073 = arg2.method1475(255);
        } else if (arg1 == 10) {
            this.field2045 = arg2.method1475(255);
        } else if (arg1 == 11) {
            this.field2047 = arg2.method1475(255);
        } else if (arg1 == 12) {
            int var8 = arg2.method1475(255);
            this.field2050 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2050[var9] = arg2.method1490((byte) 73);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2050[var10] = (arg2.method1490((byte) 73) << 16) + this.field2050[var10];
            }
        } else if (arg1 == 13) {
            int var6 = arg2.method1475(255);
            this.field2053 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2053[var7] = arg2.method1450(-23209);
            }
        }
        field2046++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lbf;BILkg;I)Lbf;")
    public final class18 method692(class18 arg0, byte arg1, int arg2, class115 arg3, int arg4) {
        int var6 = this.field2056[arg2];
        class195 var7 = class137.method870(255, var6 >> 16);
        field2058++;
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method694(arg0, 1, arg4);
        }
        if (arg1 >= -4) {
            field2062 = null;
        }
        int var9 = arg3.field2056[arg4];
        class195 var10 = class137.method870(255, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class18 var12 = arg0.method161(!var7.method1221(-105, var8));
            var12.method151(var7, var8);
            return var12;
        } else {
            class18 var13 = arg0.method161(!var7.method1221(-121, var8) & !var10.method1221(-117, var11));
            var13.method157(var7, var8, var10, var11, this.field2063);
            return var13;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V")
    public static final void method693(boolean arg0) {
        field2048++;
        int var1 = class55.field1109;
        int var2 = class79.field1522;
        int var3 = class224.field3908;
        int var4 = class222.field3856;
        int var5 = 6116423;
        if (!arg0) {
            field2039 = null;
        }
        class221.method1375(var1, var3, var2, var4, var5);
        class221.method1375(var1 + 1, var3 + 1, var2 - 2, 16, 0);
        class221.method1374(var1 + 1, var3 + 18, var2 - 2, var4 + -19, 0);
        class19.field403.method1256(class170.field3094, var1 + 3, var3 + 14, var5, -1);
        int var6 = class57.field1149;
        int var7 = class41.field857;
        for (int var8 = 0; var8 < class117.field2108; var8++) {
            int var9 = 16777215;
            int var10 = (class117.field2108 - var8 - 1) * 15 + var3 + 31;
            if (var1 < var6 && var6 < var1 + var2 && var10 - 13 < var7 && var10 + 3 > var7) {
                var9 = 16776960;
            }
            class19.field403.method1256(class149.method947(var8, true), var1 + 3, var10, var9, 0);
        }
        class155.method1015(class55.field1109, class79.field1522, 29138, class224.field3908, class222.field3856);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lbf;II)Lbf;")
    public final class18 method694(class18 arg0, int arg1, int arg2) {
        field2066++;
        int var4 = this.field2056[arg2];
        class195 var5 = class137.method870(255, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method161(true);
        }
        class18 var7 = arg0.method161(!var5.method1221(-86, var6));
        if (arg1 == 1) {
            var7.method151(var5, var6);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(B)V")
    public static void method695(byte arg0) {
        field2039 = null;
        field2041 = null;
        field2071 = null;
        if (arg0 > -20) {
            field2041 = null;
        }
        field2075 = null;
        field2049 = null;
        field2067 = null;
        field2074 = null;
        field2062 = null;
        field2069 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lbf;IIB)Lbf;")
    public final class18 method696(class18 arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field2056[arg1];
        field2065++;
        class195 var6 = class137.method870(255, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method161(true);
        }
        int var8 = arg2 & 0x3;
        class18 var9 = arg0.method161(!var6.method1221(-61, var7));
        if (var8 == 1) {
            var9.method156();
        } else if (var8 == 2) {
            var9.method152();
        } else if (var8 == 3) {
            var9.method155();
        }
        var9.method151(var6, var7);
        if (var8 == 1) {
            var9.method155();
        } else if (var8 == 2) {
            var9.method152();
        } else if (var8 == 3) {
            var9.method156();
        }
        if (arg3 != -122) {
            method701(false);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIIIII)V")
    public static final void method697(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class72 var6 = class95.field1776[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class225 var7 = var6.field1415;
        if (var7 != null) {
            int var8 = var7.field3922;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class173 var10 = var6.field1403;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3136;
        int var12 = var10.field3131;
        int var13 = var10.field3132;
        int var14 = var10.field3142;
        int[] var15 = class85.field1600[var11];
        int[] var16 = class150.field2682[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(B)V")
    public static final void method698(byte arg0) {
        field2064++;
        if (!class159.field2859) {
            return;
        }
        class232 var1 = class197.method1235(-19, class58.field1162, class95.field1771);
        if (arg0 >= -78) {
            method693(true);
        }
        if (var1 != null && var1.field4159 != null) {
            class224 var2 = new class224();
            var2.field3895 = var1.field4159;
            var2.field3905 = var1;
            class110.method664(1785261985, var2);
        }
        class159.field2859 = false;
        class27.method208(true, var1);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(II)Loc;")
    public static final class151 method699(int arg0, int arg1) {
        class151 var2 = class137.method874(arg1, false);
        for (int var3 = var2.method988(-1) - 3; var3 > 0; var3 -= 3) {
            var2 = class126.method761(new class151[] { var2.method987((byte) 121, var3, 0), class227.field3965, var2.method989(var3, (byte) -62) }, 10260);
        }
        field2044++;
        if (~var2.method988(arg0 ^ 0x9) < arg0) {
            return class126.method761(new class151[] { class210.field3686, var2.method987((byte) 124, var2.method988(arg0 ^ 0x9) - 8, 0), class54.field1100, class228.field3982, var2, class138.field2535 }, arg0 ^ 0xFFFFD7E2);
        } else if (var2.method988(-1) > 6) {
            return class126.method761(new class151[] { class160.field2889, var2.method987((byte) 124, var2.method988(-1) - 4, 0), class27.field582, class228.field3982, var2, class138.field2535 }, 10260);
        } else {
            return class126.method761(new class151[] { class4.field81, var2, class8.field132 }, 10260);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLwa;)V")
    public final void method700(byte arg0, class229 arg1) {
        while (true) {
            int var3 = arg1.method1475(255);
            if (var3 == 0) {
                if (arg0 > -15) {
                    field2074 = null;
                }
                field2059++;
                return;
            }
            this.method691((byte) 106, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(Z)V")
    public static final void method701(boolean arg0) {
        if (class131.field2415 > 0) {
            class131.field2415--;
        }
        field2057++;
        if (class55.field1123 > 1) {
            class55.field1123--;
        }
        if (class217.field3786) {
            class217.field3786 = false;
            class16.method137(3);
            return;
        }
        for (int var1 = 0; var1 < 100 && class177.method1127((byte) 99); var1++) {
        }
        if (class200.field3534 != 30) {
            return;
        }
        class67.method451(arg0, class48.field984, 47);
        Object var2 = class39.field793.field2662;
        synchronized (class39.field793.field2662) {
            if (!class3.field73) {
                class39.field793.field2676 = 0;
            } else if (class112.field1987 != 0 || class39.field793.field2676 >= 40) {
                class4.field83++;
                class48.field984.method650(-13721, 10);
                class48.field984.method1447(-1, 0);
                int var3 = class48.field984.field4101;
                int var4 = 0;
                for (int var5 = 0; var5 < class39.field793.field2676 && class48.field984.field4101 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class39.field793.field2675[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = class39.field793.field2674[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = var7 * 765 + var6;
                    if (class39.field793.field2674[var5] == -1 && class39.field793.field2675[var5] == -1) {
                        var8 = 524287;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class228.field3972 != var6 || class123.field2210 != var7) {
                        int var9 = var7 - class123.field2210;
                        class123.field2210 = var7;
                        int var10 = var6 - class228.field3972;
                        class228.field3972 = var6;
                        if (class226.field3941 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class48.field984.method1463(-80, (class226.field3941 << 12) + (var10 << 6) + var9);
                            class226.field3941 = 0;
                        } else if (class226.field3941 < 8) {
                            class48.field984.method1483((byte) -76, (class226.field3941 << 19) + var8 + 8388608);
                            class226.field3941 = 0;
                        } else {
                            class48.field984.method1461((class226.field3941 << 19) + var8 - 1073741824, (byte) 39);
                            class226.field3941 = 0;
                        }
                    } else if (class226.field3941 < 2047) {
                        class226.field3941++;
                    }
                }
                class48.field984.method1434(-100, class48.field984.field4101 - var3);
                if (var4 >= class39.field793.field2676) {
                    class39.field793.field2676 = 0;
                } else {
                    class39.field793.field2676 -= var4;
                    for (int var11 = 0; var11 < class39.field793.field2676; var11++) {
                        class39.field793.field2675[var11] = class39.field793.field2675[var4 + var11];
                        class39.field793.field2674[var11] = class39.field793.field2674[var4 + var11];
                    }
                }
            }
        }
        if (class112.field1987 != 0) {
            class20.field446++;
            long var12 = (class27.field566 - class174.field3145) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            class174.field3145 = class27.field566;
            int var14 = class209.field3677;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class2.field61;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            if (class112.field1987 == 2) {
                var16 = 1;
            }
            class48.field984.method650(-13721, 157);
            int var17 = var14 * 765 + var15;
            int var18 = (int) var12;
            class48.field984.method1455(-12974, (var18 << 20) + ((var16 << 19) + var17));
        }
        if (class231.field4125[96] || class231.field4125[97] || class231.field4125[98] || class231.field4125[99]) {
            class74.field1437 = true;
        }
        if (class22.field490 > 0) {
            class22.field490--;
        }
        if (class74.field1437 && class22.field490 <= 0) {
            class22.field490 = 20;
            class74.field1437 = false;
            class48.field984.method650(-13721, 22);
            class220.field3830++;
            class48.field984.method1485(class94.field1761, (byte) 120);
            class48.field984.method1478(true, class58.field1157);
        }
        if (class43.field879 && !class25.field551) {
            class25.field551 = true;
            class154.field2796++;
            class48.field984.method650(-13721, 25);
            class48.field984.method1447(-1, 1);
        }
        if (!class43.field879 && class25.field551) {
            class25.field551 = false;
            class154.field2796++;
            class48.field984.method650(-13721, 25);
            class48.field984.method1447(-1, 0);
        }
        class142.method907((byte) 43);
        if (class200.field3534 != 30) {
            return;
        }
        class79.method511((byte) -80);
        class21.method179((byte) -46);
        class144.field2603++;
        if (class144.field2603 > 750) {
            class16.method137(3);
            return;
        }
        class163.method1054(!arg0);
        class219.method1365(-37);
        class52.method362((byte) -123);
        class227.method1421(!arg0);
        if (class28.field600 != 0) {
            class211.field3692 += 20;
            if (class211.field3692 >= 400) {
                class28.field600 = 0;
            }
        }
        class181.field3273++;
        if (class164.field2962 != null) {
            class11.field207++;
            if (class11.field207 >= 15) {
                class27.method208(true, class164.field2962);
                class164.field2962 = null;
            }
        }
        if (class151.field2700 != null) {
            class27.method208(true, class151.field2700);
            class21.field459++;
            if (class57.field1149 > class8.field129 + 5 || class8.field129 - 5 > class57.field1149 || class58.field1156 + 5 < class41.field857 || class41.field857 < class58.field1156 - 5) {
                class94.field1756 = true;
            }
            if (class141.field2553 == 0) {
                if (class94.field1756 && class21.field459 >= 5) {
                    if (class194.field3464 == class151.field2700 && class66.field1267 != class182.field3287) {
                        class122.field2186++;
                        class232 var19 = class151.field2700;
                        byte var20 = 0;
                        if (class133.field2426 == 1 && var19.field4148 == 206) {
                            var20 = 1;
                        }
                        if (var19.field4248[class182.field3287] <= 0) {
                            var20 = 0;
                        }
                        if (class151.method985(class174.method1110(true, var19), (byte) 89)) {
                            int var21 = class66.field1267;
                            int var22 = class182.field3287;
                            var19.field4248[var22] = var19.field4248[var21];
                            var19.field4199[var22] = var19.field4199[var21];
                            var19.field4248[var21] = -1;
                            var19.field4199[var21] = 0;
                        } else if (var20 == 1) {
                            int var23 = class66.field1267;
                            int var24 = class182.field3287;
                            while (var23 != var24) {
                                if (var23 > var24) {
                                    var19.method1522(var23 - 1, 115, var23);
                                    var23--;
                                } else if (var24 > var23) {
                                    var19.method1522(var23 + 1, -56, var23);
                                    var23++;
                                }
                            }
                        } else {
                            var19.method1522(class182.field3287, -44, class66.field1267);
                        }
                        class48.field984.method650(-13721, 147);
                        class48.field984.method1463(-93, class66.field1267);
                        class48.field984.method1477(126, class151.field2700.field4261);
                        class48.field984.method1478(arg0, class182.field3287);
                        class48.field984.method1435((byte) -104, var20);
                    }
                } else if ((class228.field3987 == 1 || class117.method716(122, class117.field2108 - 1)) && class117.field2108 > 2) {
                    class195.method1226(123);
                } else if (class117.field2108 > 0) {
                    class111.method671(class117.field2108 - 1, 78);
                }
                class11.field207 = 10;
                class151.field2700 = null;
                class112.field1987 = 0;
            }
        }
        if (!arg0) {
            return;
        }
        class123.field2192 = false;
        class66.field1274 = 0;
        class232 var25 = class231.field4116;
        class73.field1422 = null;
        class232 var26 = class79.field1524;
        class79.field1524 = null;
        class222.field3844 = false;
        class231.field4116 = null;
        while (class78.method504(-104) && class66.field1274 < 128) {
            class36.field753[class66.field1274] = class38.field782;
            class53.field1075[class66.field1274] = class41.field855;
            class66.field1274++;
        }
        class153.field2778 = null;
        if (class31.field652 != -1) {
            class179.method1136(0, 0, class36.field751, class202.field3602, class31.field652, 0, 120, 0);
        }
        class1.field35++;
        while (true) {
            class224 var27;
            class232 var28;
            class232 var29;
            do {
                var27 = (class224) class129.field2345.method1355(-12348);
                if (var27 == null) {
                    while (true) {
                        class224 var30;
                        class232 var31;
                        class232 var32;
                        do {
                            var30 = (class224) class177.field3197.method1355(-12348);
                            if (var30 == null) {
                                while (true) {
                                    class224 var33;
                                    class232 var34;
                                    class232 var35;
                                    do {
                                        var33 = (class224) class179.field3241.method1355(-12348);
                                        if (var33 == null) {
                                            if (class196.field3499 && class153.field2778 == null) {
                                                class196.field3499 = false;
                                            }
                                            if (class222.field3860 != null) {
                                                class108.method652(127);
                                            }
                                            if (class124.field2234 != -1) {
                                                int var36 = class124.field2234;
                                                int var37 = class11.field209;
                                                boolean var38 = class225.method1414(-13, 0, 0, var37, true, 0, 0, 0, var36, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
                                                class124.field2234 = -1;
                                                if (var38) {
                                                    class28.field600 = 1;
                                                    class33.field668 = class209.field3677;
                                                    class109.field1938 = class2.field61;
                                                    class211.field3692 = 0;
                                                }
                                            }
                                            class223.method1401(111);
                                            if (class231.field4116 != var25) {
                                                if (var25 != null) {
                                                    class27.method208(true, var25);
                                                }
                                                if (class231.field4116 != null) {
                                                    class27.method208(true, class231.field4116);
                                                }
                                            }
                                            if (class79.field1524 != var26 && class114.field2033 == class101.field1838) {
                                                if (var26 != null) {
                                                    class27.method208(true, var26);
                                                }
                                                if (class79.field1524 != null) {
                                                    class27.method208(true, class79.field1524);
                                                }
                                            }
                                            if (class79.field1524 == null) {
                                                if (class101.field1838 > 0) {
                                                    class101.field1838--;
                                                }
                                            } else if (class114.field2033 > class101.field1838) {
                                                class101.field1838++;
                                                if (class114.field2033 == class101.field1838) {
                                                    class27.method208(true, class79.field1524);
                                                }
                                            }
                                            class179.method1135(-103);
                                            if (class89.field1622) {
                                                class45.method322(120);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class113.field2023[var39]++;
                                            }
                                            int var40 = class213.method1333(-128);
                                            int var41 = class197.method1238(27557);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class28.field592++;
                                                class131.field2415 = 250;
                                                class124.method748(4000, 8);
                                                class48.field984.method650(-13721, 30);
                                            }
                                            class124.field2242++;
                                            class203.field3612++;
                                            class202.field3605++;
                                            if (class202.field3605 > 500) {
                                                class202.field3605 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x2) == 2) {
                                                    class212.field3731 += class56.field1131;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class178.field3222 += class130.field2389;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class8.field120 += class117.field2119;
                                                }
                                            }
                                            if (class178.field3222 < -40) {
                                                class130.field2389 = 1;
                                            }
                                            if (class8.field120 < -50) {
                                                class117.field2119 = 2;
                                            }
                                            if (class178.field3222 > 40) {
                                                class130.field2389 = -1;
                                            }
                                            if (class8.field120 > 50) {
                                                class117.field2119 = -2;
                                            }
                                            if (class212.field3731 < -55) {
                                                class56.field1131 = 2;
                                            }
                                            if (class124.field2242 > 500) {
                                                class124.field2242 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class121.field2178 += class36.field744;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class151.field2693 += class152.field2752;
                                                }
                                            }
                                            if (class212.field3731 > 55) {
                                                class56.field1131 = -2;
                                            }
                                            if (class121.field2178 < -60) {
                                                class36.field744 = 2;
                                            }
                                            if (class121.field2178 > 60) {
                                                class36.field744 = -2;
                                            }
                                            if (class151.field2693 < -20) {
                                                class152.field2752 = 1;
                                            }
                                            if (class151.field2693 > 10) {
                                                class152.field2752 = -1;
                                            }
                                            if (class203.field3612 > 50) {
                                                class48.field984.method650(-13721, 213);
                                                class229.field4086++;
                                            }
                                            try {
                                                if (class142.field2588 != null && class48.field984.field4101 > 0) {
                                                    class142.field2588.method331(30, class48.field984.field4101, class48.field984.field4087, 0);
                                                    class48.field984.field4101 = 0;
                                                    class203.field3612 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class16.method137(3);
                                                return;
                                            }
                                        }
                                        var34 = var33.field3905;
                                        if (var34.field4174 < 0) {
                                            break;
                                        }
                                        var35 = class175.method1115(-22192, var34.field4156);
                                    } while (var35 == null || var35.field4239 == null || var35.field4239.length <= var34.field4174 || var35.field4239[var34.field4174] != var34);
                                    class110.method664(1785261985, var33);
                                }
                            }
                            var31 = var30.field3905;
                            if (var31.field4174 < 0) {
                                break;
                            }
                            var32 = class175.method1115(-22192, var31.field4156);
                        } while (var32 == null || var32.field4239 == null || var31.field4174 >= var32.field4239.length || var32.field4239[var31.field4174] != var31);
                        class110.method664(1785261985, var30);
                    }
                }
                var28 = var27.field3905;
                if (var28.field4174 < 0) {
                    break;
                }
                var29 = class175.method1115(-22192, var28.field4156);
            } while (var29 == null || var29.field4239 == null || var29.field4239.length <= var28.field4174 || var29.field4239[var28.field4174] != var28);
            class110.method664(1785261985, var27);
        }
    }
}
