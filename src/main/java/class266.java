import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class266 extends class137 {

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    private int field4250;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    private int field4254;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    private int field4241;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    private int field4248;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "[Ljb;")
    public static class276[] field4240 = new class276[29];

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "[I")
    public static int[] field4246 = new int[32];

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4253 = "Loaded wordpack";

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "[I")
    public static int[] field4251;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Lkk;")
    public static final class239 method1810(byte arg0, int arg1) {
        ++field4247;
        class239 var2 = (class239) class45.field714.method1701(false, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 <= 112) {
                field4245 = 107;
            }
            byte[] var3;
            if (~arg1 > -32769) {
                var3 = class289.field4555.method1163(1, arg1, 48);
            } else {
                var3 = class130.field2021.method1163(1, 32767 & arg1, 48);
            }
            class239 var4 = new class239();
            if (var3 != null) {
                var4.method1615(false, new class37(var3));
            }
            if (arg1 >= 32768) {
                var4.method1618(-16299);
            }
            class45.field714.method1704((long) arg1, var4, true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static void method1811(int arg0) {
        field4253 = null;
        if (arg0 != 10) {
            method1813(-39);
        }
        field4251 = null;
        field4240 = null;
        field4246 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)[La;")
    public static final class49[] method1812(byte arg0) {
        ++field4244;
        if (arg0 <= 67) {
            field4246 = null;
        }
        class49[] var1 = new class49[class163.field2489];
        for (int var2 = 0; var2 < class163.field2489; ++var2) {
            int var3 = class270.field4281[var2] * class107.field1717[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class289.field4554[var2];
            for (int var6 = 0; var3 > var6; ++var6) {
                var4[var6] = class35.field560[class3.method48(255, var5[var6])];
            }
            var1[var2] = new class49(class205.field3187, class174.field2581, class184.field2764[var2], class239.field3698[var2], class270.field4281[var2], class107.field1717[var2], var4);
        }
        class239.method1619(65306);
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)Lf;")
    public static final class37 method1813(int arg0) {
        class37 var1 = new class37(34);
        if (arg0 != 0) {
            method1817(81, -1, -98, -85, 14);
        }
        ++field4243;
        var1.method287(440742616, 11);
        var1.method287(arg0 + 440742616, class250.field3847);
        var1.method287(440742616, !class121.field1859 ? 0 : 1);
        var1.method287(440742616, !class51.field813 ? 0 : 1);
        var1.method287(440742616, class1.field16 ? 1 : 0);
        var1.method287(440742616, class196.field3083 ? 1 : 0);
        var1.method287(440742616, class242.field3760 ? 1 : 0);
        var1.method287(440742616, !class21.field320 ? 0 : 1);
        var1.method287(440742616, class155.field2366 ? 1 : 0);
        var1.method287(440742616, class272.field4299 ? 1 : 0);
        var1.method287(440742616, class270.field4279);
        var1.method287(440742616, class30.field486 ? 1 : 0);
        var1.method287(440742616, !class56.field862 ? 0 : 1);
        var1.method287(440742616, class144.field2246 ? 1 : 0);
        var1.method287(arg0 + 440742616, class39.field662);
        var1.method287(440742616, class43.field688 ? 1 : 0);
        var1.method287(440742616, class63.field1011);
        var1.method287(arg0 ^ 440742616, class259.field3985);
        var1.method287(440742616, class253.field3896);
        var1.method312(1489253544, class5.field96);
        var1.method312(arg0 + 1489253544, class8.field140);
        var1.method287(440742616, class240.method1622());
        var1.method289(class184.field2785, -127);
        var1.method287(440742616, class148.field2287);
        var1.method287(440742616, class198.field3107 ? 1 : 0);
        var1.method287(440742616, !class195.field3070 ? 0 : 1);
        var1.method287(arg0 + 440742616, class144.field2230);
        var1.method287(440742616, !class66.field1047 ? 0 : 1);
        var1.method287(440742616, class210.field3261 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZII)V")
    public final void method542(boolean arg0, int arg1, int arg2) {
        int var4 = this.field4250 * arg2 >> 12;
        ++field4239;
        int var5 = this.field4254 * arg2 >> 12;
        int var6 = this.field4248 * arg1 >> 12;
        int var7 = this.field4241 * arg1 >> 12;
        class10.method115(var7, super.field2123, var4, 693266594, super.field2124, super.field2126, var6, var5);
        if (!arg0) {
            this.method549(-58, -104, 48);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBI)I")
    public static final int method1814(int arg0, byte arg1, int arg2) {
        ++field4237;
        int var3 = class93.method729(arg0 + 45365, arg2 - -91923, 20026, 4) - 128 + (-128 + class93.method729(arg0 + 10294, arg2 - -37821, 20026, 2) >> 1) + (-128 + class93.method729(arg0, arg2, arg1 ^ 20065, 1) >> 2);
        if (arg1 != 91) {
            return 60;
        } else {
            int var4 = (int) ((double) var3 * 0.3D) + 35;
            if (~var4 <= -11) {
                if (var4 > 60) {
                    var4 = 60;
                }
            } else {
                var4 = 10;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIIII)V")
    public class266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4250 = arg0;
        this.field4254 = arg2;
        this.field4241 = arg3;
        this.field4248 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public final void method550(int arg0, int arg1, int arg2) {
        ++field4236;
        int var4 = this.field4250 * arg2 >> 12;
        if (arg0 != 0) {
            field4246 = null;
        }
        int var5 = this.field4254 * arg2 >> 12;
        int var6 = this.field4248 * arg1 >> 12;
        int var7 = this.field4241 * arg1 >> 12;
        class207.method1386(var5, super.field2126, var7, var4, arg0 ^ 1, var6);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLuf;IIII)V")
    public static final void method1815(boolean arg0, class176 arg1, int arg2, int arg3, int arg4, int arg5) {
        class32.field516 = arg3;
        class13.field223 = arg2;
        class295.field4641 = 1;
        class297.field4700 = arg5;
        class72.field1140 = arg0;
        class174.field2583 = arg4;
        ++field4252;
        class219.field3420 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)V")
    public final void method549(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field4242;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([IIIIII)V")
    public static final void method1816(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class23 var6 = class255.field3907[arg3][arg4][arg5];
        if (var6 != null) {
            class243 var7 = var6.field347;
            if (var7 == null) {
                class199 var10 = var6.field342;
                if (var10 != null) {
                    int var11 = var10.field3129;
                    int var12 = var10.field3127;
                    int var13 = var10.field3140;
                    int var14 = var10.field3137;
                    int[] var15 = class290.field4574[var11];
                    int[] var16 = class164.field2497[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
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
                }
            } else {
                int var8 = var7.field3772;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    public static final void method1817(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 == -11443) {
            ++field4238;
            if (~class75.field1265 >= ~(-arg0 + arg2) && ~class261.field4025 <= ~(arg2 - -arg0) && class271.field4289 <= arg1 - arg0 && class113.field1779 >= arg0 + arg1) {
                class13.method130(arg0, arg1, arg2, 83, arg4);
            } else {
                class34.method267(arg0, arg2, arg4, arg3 ^ -11444, arg1);
            }
        }
    }
}
