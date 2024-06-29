import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class287 extends class157 {

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public int field4064 = -1;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "Lpca;")
    public static class714 field4061 = new class714(4);

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lqfa;")
    public static class98 field4065 = new class98(103, 1);

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "Ljava/lang/String;")
    public String field4062;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "Ljava/lang/String;")
    public String field4068;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIILdia;I)V", line = 5)
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, class231 arg4, int arg5) {
        ++field4063;
        if (~arg4.field3135 != 0 || arg4.field3109 != null) {
            int var6 = 0;
            int var7 = arg4.field3129 * class557.field7812.field6550.method3029(false) >> 8;
            if (arg2 != 11908) {
                field4061 = null;
            }
            if (~arg5 >= ~arg4.field3112) {
                if (~arg4.field3121 < ~arg5) {
                    var6 += -arg5 + arg4.field3121;
                }
            } else {
                var6 += -arg4.field3112 + arg5;
            }
            if (arg4.field3125 < arg0) {
                var6 += arg0 - arg4.field3125;
            } else if (~arg4.field3107 < ~arg0) {
                var6 += arg4.field3107 - arg0;
            }
            if (~arg4.field3114 != -1 && var6 + -256 <= arg4.field3114 && class557.field7812.field6550.method3029(false) != 0 && arg4.field3116 == arg1) {
                var6 -= 256;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg4.field3114) * var7 / arg4.field3114;
                class660.field9039.method1835((byte) 127);
                int var9 = 8192;
                int var10 = (arg4.field3121 + arg4.field3112) / 2 - arg5;
                int var11 = (arg4.field3125 + arg4.field3107) / 2 + -arg0;
                if (~var10 != -1 || var11 != 0) {
                    int var12 = -class720.field9994 + -((int) (2607.5945876176133D * Math.atan2((double) var10, (double) var11))) - 4096 & 16383;
                    if (var12 > 8192) {
                        var12 = 16384 - var12;
                    }
                    int var13;
                    if (var6 <= 0) {
                        var13 = 8192;
                    } else if (var6 < 4096) {
                        var13 = 8192 - -(var6 * 8192 / 4096);
                    } else {
                        var13 = 16384;
                    }
                    var9 = (-var13 + 16384 >> 1) + var12 * var13 / 8192;
                }
                if (arg4.field3123 != null) {
                    arg4.field3123.method2392(var8);
                    arg4.field3123.method2394(var9);
                } else if (~arg4.field3135 <= -1) {
                    int var14 = ~arg4.field3119 == -257 && arg4.field3128 == 256 ? 256 : class8.method50(arg2 ^ -11995, arg4.field3119, arg4.field3128);
                    if (!arg4.field3127) {
                        class214 var15 = class214.method1314(class727.field10173, arg4.field3135, 0);
                        if (var15 != null) {
                            class490 var16 = var15.method1312().method2923(class712.field9905);
                            class379 var17 = class379.method2389(var16, var14, var8 << 6, var9);
                            var17.method2383(-1);
                            class192.field2560.method1728(var17);
                            arg4.field3123 = var17;
                        }
                    } else {
                        if (arg4.field3118 == null) {
                            arg4.field3118 = class163.method1068(class530.field7473, arg4.field3135);
                        }
                        if (arg4.field3118 != null) {
                            if (arg4.field3117 == null) {
                                arg4.field3117 = arg4.field3118.method1078(new int[] { 22050 });
                            }
                            if (arg4.field3117 != null) {
                                class379 var18 = class379.method2389(arg4.field3117, var14, var8 << 6, var9);
                                var18.method2383(-1);
                                class192.field2560.method1728(var18);
                                arg4.field3123 = var18;
                            }
                        }
                    }
                }
                if (arg4.field3131 == null) {
                    if (arg4.field3109 != null && (arg4.field3120 -= arg3) <= 0) {
                        int var19 = arg4.field3119 == 256 && arg4.field3128 == 256 ? 256 : arg4.field3128 + (int) (Math.random() * (double) (-arg4.field3128 + arg4.field3119));
                        if (!arg4.field3126) {
                            int var20 = (int) (Math.random() * (double) arg4.field3109.length);
                            class214 var21 = class214.method1314(class727.field10173, arg4.field3109[var20], 0);
                            if (var21 != null) {
                                class490 var22 = var21.method1312().method2923(class712.field9905);
                                class379 var23 = class379.method2389(var22, var19, var8 << 6, var9);
                                var23.method2383(0);
                                class192.field2560.method1728(var23);
                                arg4.field3131 = var23;
                                arg4.field3120 = (int) (Math.random() * (double) (-arg4.field3113 + arg4.field3115)) + arg4.field3113;
                                return;
                            }
                            return;
                        }
                        if (arg4.field3130 == null) {
                            int var24 = (int) (Math.random() * (double) arg4.field3109.length);
                            arg4.field3130 = class163.method1068(class530.field7473, arg4.field3109[var24]);
                        }
                        if (arg4.field3130 != null) {
                            if (arg4.field3106 == null) {
                                arg4.field3106 = arg4.field3130.method1078(new int[] { 22050 });
                            }
                            if (arg4.field3106 != null) {
                                class379 var25 = class379.method2389(arg4.field3106, var19, var8 << 6, var9);
                                var25.method2383(0);
                                class192.field2560.method1728(var25);
                                arg4.field3120 = arg4.field3113 - -((int) (Math.random() * (double) (-arg4.field3113 + arg4.field3115)));
                                arg4.field3131 = var25;
                                return;
                            }
                        }
                    }
                } else {
                    arg4.field3131.method2392(var8);
                    arg4.field3131.method2394(var9);
                    if (arg4.field3131.method1187(0)) {
                        return;
                    }
                    arg4.field3131 = null;
                    arg4.field3130 = null;
                    arg4.field3106 = null;
                }
            } else {
                if (arg4.field3123 != null) {
                    class192.field2560.method1733(arg4.field3123);
                    arg4.field3117 = null;
                    arg4.field3118 = null;
                    arg4.field3123 = null;
                }
                if (arg4.field3131 != null) {
                    class192.field2560.method1733(arg4.field3131);
                    arg4.field3130 = null;
                    arg4.field3106 = null;
                    arg4.field3131 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)Ljc;", line = 273)
    public final class439 method1880(byte arg0) {
        ++field4066;
        return arg0 != 111 ? null : class62.field762[super.field2186];
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)V", line = 284)
    public static final void method1881(int arg0) {
        ++field4069;
        class650.field8937 = 0;
        int var1 = class89.field1072.method3717(25651);
        int var2 = class89.field1072.method3734(126);
        boolean var3 = class89.field1072.method3688(7925) == 1;
        int var4 = class89.field1072.method3688(7925);
        class513.method3024(-125);
        class262.method1717(var4, false);
        int var5 = (class398.field5617 - class89.field1072.field9146) / 16;
        class268.field3822 = new int[var5][4];
        for (int var6 = 0; var6 < var5; ++var6) {
            for (int var10 = 0; var10 < 4; ++var10) {
                class268.field3822[var6][var10] = class89.field1072.method3703(117);
            }
        }
        class207.field2720 = new int[var5];
        class46.field546 = new int[var5];
        class179.field2396 = null;
        class636.field8763 = new byte[var5][];
        class539.field7560 = new int[var5];
        class376.field5273 = null;
        class500.field7181 = new byte[var5][];
        class604.field8481 = new byte[var5][];
        class401.field5698 = new int[var5];
        if (arg0 != 28123) {
            method1879(-29, 111, 123, 13, (class231) null, -114);
        }
        class499.field7164 = new byte[var5][];
        class61.field753 = new int[var5];
        int var7 = 0;
        for (int var8 = (-(class336.field4683 >> 4) + var2) / 8; (var2 - -(class336.field4683 >> 4)) / 8 >= var8; ++var8) {
            for (int var9 = (var1 - (class700.field9768 >> 4)) / 8; ~var9 >= ~(((class700.field9768 >> 4) + var1) / 8); ++var9) {
                class207.field2720[var7] = (var8 << 8) + var9;
                class539.field7560[var7] = class299.field4218.method2090(115, "m" + var8 + "_" + var9);
                class46.field546[var7] = class299.field4218.method2090(110, "l" + var8 + "_" + var9);
                class401.field5698[var7] = class299.field4218.method2090(118, "um" + var8 + "_" + var9);
                class61.field753[var7] = class299.field4218.method2090(111, "ul" + var8 + "_" + var9);
                ++var7;
            }
        }
        class657.method3610(11, var3, var2, var1, false);
    }

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)V", line = 372)
    public static void method1882(int arg0) {
        if (arg0 != -3759) {
            field4061 = null;
        }
        field4061 = null;
        field4065 = null;
    }
}
