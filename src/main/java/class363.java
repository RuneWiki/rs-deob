import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class363 extends class31 {

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
    private int field4688;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
    public static int[] field4682 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public static int field4685 = 0;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "Lin;")
    public static class166 field4684;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIZIII)V")
    public static final void method2132(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field4686;
        if (class470.field6877 == null) {
            class512.field7538.method866(arg0, -5152, arg3, arg1, arg5, -16777216);
        } else if (class37.field573.field6239 >= 0 && class200.field2594 * 128 > class37.field573.field6239 && class37.field573.field6241 >= 0 && class37.field573.field6241 < class118.field1647 * 128) {
            ++class398.field5291;
            if (class37.field573 != null && class37.field573.field6239 + 64 + -(64 * class37.field573.method2342(10804)) >> 7 == class429.field5919 && ~(class37.field573.field6241 + 64 + -(64 * class37.field573.method2342(10804)) >> 7) == ~class138.field1847) {
                class138.field1847 = -1;
                class429.field5919 = -1;
                class167.method1119(true);
            }
            class314.method1867(true);
            if (!arg2) {
                class37.method239(-3614);
            }
            class214.method1364((byte) 43);
            class340.method2001(arg0, true, arg1, arg3, arg5, 1);
            int var6 = class111.field1538;
            int var7 = class281.field3593;
            int var8 = class225.field2917;
            int var9 = class139.field1856;
            if (~class396.field5271 == -2) {
                int var10 = (int) class163.field2110;
                if (~var10 > ~(class21.field393 >> 8)) {
                    var10 = class21.field393 >> 8;
                }
                if (class102.field1396[4] && ~var10 > ~(class301.field3905[4] + 128)) {
                    var10 = class301.field3905[4] + 128;
                }
                int var11 = (int) class244.field3138 - -class82.field1021 & 16383;
                class30.method206(class293.field3801, var8, var11, (var10 >> 3) * 3 + 600 << 0, -50 + class366.method2145(class366.field4715, (byte) 59, class37.field573.field6239, class37.field573.field6241), class73.field926, var10, (byte) -128);
            } else if (~class396.field5271 == -5) {
                int var12 = (int) class163.field2110;
                if (~var12 > ~(class21.field393 >> 8)) {
                    var12 = class21.field393 >> 8;
                }
                if (class102.field1396[4] && class301.field3905[4] + 128 > var12) {
                    var12 = class301.field3905[4] + 128;
                }
                int var13 = (int) class244.field3138 & 16383;
                class30.method206(class293.field3801, var8, var13, (var12 >> 3) * 3 + 600 << 0, -50 + class366.method2145(class366.field4715, (byte) -121, class157.field2069, class265.field3369), class73.field926, var12, (byte) -123);
            } else if (~class396.field5271 == -6) {
                class203.method1328(-9469, var8);
            }
            int var14 = class299.field3885;
            int var15 = class53.field730;
            int var16 = class291.field3724;
            int var17 = class430.field5935;
            if (arg4 < 85) {
                method2133(-93);
            }
            int var18 = class261.field3319;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class102.field1396[var19]) {
                    int var22 = (int) ((double) (-class234.field3056[var19]) + Math.random() * (double) (class234.field3056[var19] * 2 + 1) + Math.sin((double) class88.field1203[var19] / 100.0D * (double) class372.field4832[var19]) * (double) class301.field3905[var19]);
                    if (var19 == 1) {
                        class53.field730 += var22;
                    }
                    if (~var19 == -5) {
                        class430.field5935 += var22;
                        if (~class430.field5935 > -1025) {
                            class430.field5935 = 1024;
                        } else if (~class430.field5935 < -3073) {
                            class430.field5935 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class291.field3724 += var22;
                    }
                    if (~var19 == -1) {
                        class299.field3885 += var22;
                    }
                    if (var19 == 3) {
                        class261.field3319 = class261.field3319 + var22 & 16383;
                    }
                }
            }
            if (~class299.field3885 > -1) {
                class299.field3885 = 0;
            }
            if (class291.field3724 < 0) {
                class291.field3724 = 0;
            }
            if ((class166.field2155 << 7) - 1 < class299.field3885) {
                class299.field3885 = (class166.field2155 << 7) - 1;
            }
            if (~class291.field3724 < ~((class13.field230 << 7) + -1)) {
                class291.field3724 = (class13.field230 << 7) + -1;
            }
            class412.method2435(22084);
            class163.method1084(true);
            class512.field7538.method925(var7, var6, var7 + var9, var6 + var8);
            class512.field7538.method822();
            int var20 = class166.field2153;
            if (class11.field190 == null) {
                class512.field7538.method900(var20);
            } else {
                class11.field190.method2817(var6, var7, var9, var8, class430.field5935, class261.field3319, var20, class103.field1418 << 3, class512.field7538, true);
            }
            class100.method679(16384);
            class168.field2199.method978(class299.field3885, class53.field730, class291.field3724, -class430.field5935 & 16383, 16383 & -class261.field3319, -class74.field927 & 16383);
            class512.field7538.method829(class168.field2199);
            class512.field7538.method821(var7 - -(var9 / 2), var8 / 2 + var6, class183.field2406 << 1, class183.field2406 << 1);
            class327.method1944(class183.field2406 << 1, 11617, var8 / 2 + var6, class183.field2406 << 1, var9 / 2 + var7);
            class6.method35(class291.field3724, 16383 & -class261.field3319, class53.field730, true, 16383 & -class430.field5935, class299.field3885, 16383 & -class74.field927);
            byte var21 = class421.field5647.method651(true, class520.field7690) == 2 ? (byte) class398.field5291 : 1;
            class436.method2575(class512.field7538, class264.field3353, class388.field5098, class168.field2199, class299.field3885, class53.field730, class291.field3724, class478.field6978, class138.field1840, class63.field808, class78.field998, class261.field3306, class438.field6106, class37.field573.field6220 + 1, var21, class37.field573.field6239 >> 7, class37.field573.field6241 >> 7, !class421.field5647.field7720);
            class100.method679(16384);
            if (~class65.field821 == -31) {
                class177.method1146(var8, 34336, var6, 256, var7, var9, 256);
                class168.method1123(256, var7, var6, var9, var8, 256, -93);
                class388.method2310(var6, var7, var9, 256, var8, 256, (byte) -45);
                class510.method3026(var7, var8, 89, var9, var6);
            }
            class90.method622();
            class53.field730 = var15;
            class299.field3885 = var14;
            class430.field5935 = var17;
            class261.field3319 = var18;
            class291.field3724 = var16;
            if (class334.field4283 && ~class187.field2441.method2101(-24034) == -1) {
                class334.field4283 = false;
            }
            if (class334.field4283) {
                class512.field7538.method866(var8, -5152, var7, var9, var6, -16777216);
                class322.method1923(class43.field635, false, class331.field4251.method1127(class379.field4920, false), -110);
            }
        } else {
            class512.field7538.method866(arg0, -5152, arg3, arg1, arg5, -16777216);
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lgk;II[BI)V")
    public class363(class463 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4688 = arg2;
        super.field512.method2771(this, -16785);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field521, 0, super.field519, this.field4688, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method210(true, (byte) -84);
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)V")
    public static void method2133(int arg0) {
        field4682 = null;
        if (arg0 != 0) {
            method2133(20);
        }
        field4684 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Loh;Z)Z")
    public static final boolean method2134(class448 arg0, boolean arg1) {
        boolean var2 = class92.field1285 == class283.field3620;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method1428(31867);
        if (arg0.field6238 >= 0 && arg0.field6228 >= 0 && arg0.field6229 < class166.field2155 && arg0.field6221 < class13.field230) {
            for (int var6 = arg0.field6238; var6 <= arg0.field6229; ++var6) {
                for (int var9 = arg0.field6228; var9 <= arg0.field6221; ++var9) {
                    class510 var10 = class478.method2870(arg0.field6220, var6, var9);
                    if (var10 != null) {
                        int var11 = 0;
                        if (var6 > arg0.field6238) {
                            ++var11;
                        }
                        if (var6 < arg0.field6229) {
                            var11 += 4;
                        }
                        if (var9 > arg0.field6228) {
                            var11 += 8;
                        }
                        if (var9 < arg0.field6221) {
                            var11 += 2;
                        }
                        class319 var12 = class175.method1139((byte) -124, arg0, var11);
                        class319 var13 = var10.field7494;
                        if (var13 == null) {
                            var10.field7494 = var12;
                        } else {
                            while (var13.field4102 != null) {
                                var13 = var13.field4102;
                            }
                            var13.field4102 = var12;
                        }
                        var10.field7489 = (byte) (var10.field7489 | var11);
                        if (var2 && (class203.field2667[var6][var9] & -16777216) != 0) {
                            var3 = class203.field2667[var6][var9];
                            var4 = class187.field2443[var6][var9];
                            var5 = class507.field7443[var6][var9];
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var7 = arg0.field6238; var7 <= arg0.field6229; ++var7) {
                    for (int var8 = arg0.field6228; var8 <= arg0.field6221; ++var8) {
                        if ((class203.field2667[var7][var8] & -16777216) == 0) {
                            class203.field2667[var7][var8] = var3;
                            class187.field2443[var7][var8] = var4;
                            class507.field7443[var7][var8] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class179.field2305[class171.field2218++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Z")
    public static final boolean method2135(int arg0, int arg1, int arg2) {
        ++field4683;
        if (arg1 != 16383) {
            field4684 = null;
        }
        return class365.method2144((byte) 121, arg2, arg0) & class449.method2664(arg0, -1, arg2);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V")
    public final void method2136(int arg0, boolean arg1) {
        super.field512.method2771(this, arg0 + -48712);
        ++field4689;
        OpenGL.glTexParameteri(super.field521, 10242, arg1 ? 10497 : 33071);
        if (arg0 != 31927) {
            this.field4688 = 31;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public final void method220(int arg0) {
        if (arg0 != 0) {
            this.method2136(-3, true);
        }
        ++field4687;
    }
}
