import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class662 extends class56 {

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
    private int field9058 = 0;

    @OriginalMember(owner = "client!ica", name = "K", descriptor = "I")
    private int field9061 = 4096;

    @OriginalMember(owner = "client!ica", name = "M", descriptor = "Lqfa;")
    public static class98 field9063 = new class98(29, 10);

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!ica", name = "F", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!ica", name = "I", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!ica", name = "J", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!ica", name = "L", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!ica", name = "O", descriptor = "Lfp;")
    public static class323 field9065;

    @OriginalMember(owner = "client!ica", name = "N", descriptor = "[[I")
    public static int[][] field9064;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIII)Z", line = 6)
    public static final boolean method3629(int arg0, int arg1, int arg2, int arg3) {
        ++field9057;
        if (class734.field10226 && class377.field5290) {
            if (class744.field10348 < 100) {
                return false;
            } else {
                int var4 = class615.field8612[arg0][arg3][arg2];
                if (~(-class411.field5807) == ~var4) {
                    return false;
                } else if (~class411.field5807 == ~var4) {
                    return true;
                } else if (class459.field6474 == class135.field1969) {
                    return false;
                } else {
                    if (arg1 != 843095752) {
                        method3629(126, 19, 84, 12);
                    }
                    int var5 = arg3 << class660.field9038;
                    int var6 = arg2 << class660.field9038;
                    if (class553.method3203(var5 + 1, class459.field6474[arg0].method1816((byte) 123, arg2 + 1, arg3 + 1), var6 + -1 + class586.field8250, 0, var5 + 1, class459.field6474[arg0].method1816((byte) 126, arg2, arg3), class586.field8250 + var5 - 1, var6 - -1, class459.field6474[arg0].method1816((byte) 122, arg2 + 1, arg3), class586.field8250 + var6 + -1) && class553.method3203(var5 + 1, class459.field6474[arg0].method1816((byte) -21, arg2, arg3 - -1), class586.field8250 + var6 + -1, arg1 + -843095752, class586.field8250 + -1 + var5, class459.field6474[arg0].method1816((byte) 123, arg2, arg3), class586.field8250 + -1 + var5, var6 + 1, class459.field6474[arg0].method1816((byte) 122, arg2 - -1, arg3 - -1), var6 - -1)) {
                        ++class606.field8531;
                        class615.field8612[arg0][arg3][arg2] = class411.field5807;
                        return true;
                    } else {
                        class615.field8612[arg0][arg3][arg2] = -class411.field5807;
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)V", line = 53)
    public static void method3630(int arg0) {
        field9063 = null;
        field9064 = null;
        if (arg0 == -128) {
            field9065 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZIIBII)V", line = 67)
    public static final void method3631(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field9055;
        if (class553.field7776 == null) {
            class268.field3831.method417(-16777216, arg4, arg5, (byte) 56, arg1, arg2);
        } else if (class660.field9039.field1264 >= 0 && class660.field9039.field1264 < class336.field4683 * 512 && ~class660.field9039.field1250 <= -1 && ~(class700.field9768 * 512) < ~class660.field9039.field1250) {
            ++class82.field1033;
            if (class660.field9039 != null && ~(class660.field9039.field1264 - 256 * (-1 + class660.field9039.method1835((byte) 127)) >> 9) == ~class210.field2763 && class660.field9039.field1250 - class660.field9039.method1835((byte) 127) * 256 + 256 >> 9 == class656.field8997) {
                class656.field8997 = -1;
                class210.field2763 = -1;
                class180.method1135(125);
            }
            class380.method2422(-125);
            if (!arg0) {
                class739.method4129((byte) 121);
            }
            class341.method2201(103);
            class228.method1421(false, true, arg5, arg1, arg2, arg4);
            int var6 = class192.field2576;
            int var7 = class493.field7109;
            int var8 = class213.field2807;
            class516.field7361 = class516.field7359;
            int var9 = class466.field6610;
            if (class97.field1168 != 1) {
                if (class97.field1168 != 4) {
                    if (~class97.field1168 == -6) {
                        class293.method1909(var8, -128);
                    }
                } else {
                    int var10 = (int) class2.field19;
                    if (var10 < class336.field4682 >> 8) {
                        var10 = class336.field4682 >> 8;
                    }
                    if (class52.field596[4] && ~(class234.field3153[4] + 128) < ~var10) {
                        var10 = class234.field3153[4] + 128;
                    }
                    int var11 = 16383 & (int) class552.field7773;
                    class106.method756(class469.method2798(113, class354.field5059, class526.field7430, class711.field9884) - 200, (byte) -106, (var10 >> 3) * 3 + 600 << 2, class453.field6403, class191.field2552, var8, var11, var10);
                }
            } else {
                int var12 = (int) class2.field19;
                if (var12 < class336.field4682 >> 8) {
                    var12 = class336.field4682 >> 8;
                }
                if (class52.field596[4] && ~(class234.field3153[4] - -128) < ~var12) {
                    var12 = class234.field3153[4] + 128;
                }
                int var13 = 16383 & (int) class552.field7773 - -class399.field5635;
                class106.method756(class469.method2798(84, class660.field9039.field1250, class526.field7430, class660.field9039.field1264) - 200, (byte) -126, (var12 >> 3) * 3 + 600 << 2, class453.field6403, class191.field2552, var8, var13, var12);
            }
            int var14 = class511.field7303;
            if (arg3 >= -127) {
                method3632((String) null, 111);
            }
            int var15 = class155.field2169;
            int var16 = class32.field426;
            int var17 = class187.field2514;
            int var18 = class720.field9994;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class52.field596[var19]) {
                    int var22 = (int) (Math.random() * (double) (class758.field10531[var19] * 2 + 1) - (double) class758.field10531[var19] + Math.sin((double) class61.field745[var19] / 100.0D * (double) class281.field4001[var19]) * (double) class234.field3153[var19]);
                    if (~var19 == -4) {
                        class720.field9994 = 16383 & class720.field9994 + var22;
                    }
                    if (~var19 == -5) {
                        class187.field2514 += var22;
                        if (class187.field2514 >= 1024) {
                            if (~class187.field2514 < -3073) {
                                class187.field2514 = 3072;
                            }
                        } else {
                            class187.field2514 = 1024;
                        }
                    }
                    if (var19 == 2) {
                        class32.field426 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class155.field2169 += var22 << 2;
                    }
                    if (var19 == 0) {
                        class511.field7303 += var22 << 2;
                    }
                }
            }
            if (~class511.field7303 > -1) {
                class511.field7303 = 0;
            }
            if (class32.field426 < 0) {
                class32.field426 = 0;
            }
            if ((class492.field6939 << 9) + -1 < class511.field7303) {
                class511.field7303 = (class492.field6939 << 9) - 1;
            }
            if (~((class365.field5171 << 9) + -1) > ~class32.field426) {
                class32.field426 = (class365.field5171 << 9) + -1;
            }
            class123.method839((byte) 116);
            class692.method3888((byte) -68);
            class268.field3831.method469(var9, var6, var7 + var9, var6 + var8);
            class136.method966(true, (byte) -78);
            if (class589.field8295) {
                class175.method1115((byte) -87, class441.field6287);
                if (class516.field7361 != class424.field5972) {
                    class230.field3098 = true;
                }
                class424.field5972 = class516.field7361;
            } else {
                class268.field3831.method440();
                int var20 = class441.field6287;
                if (class745.field10351 != null) {
                    class745.field10351.method3582(var20, class720.field9994, var6, 5063, class175.field2360 << 3, class187.field2514, var9, var8, var7, class268.field3831);
                } else {
                    class268.field3831.method429(var20);
                }
            }
            class485.method2904((byte) 69);
            class631.field8724.method340(class511.field7303, class155.field2169, class32.field426, 16383 & -class187.field2514, 16383 & -class720.field9994, 16383 & -class707.field9813);
            class268.field3831.method483(class631.field8724);
            class268.field3831.method391(var9 - -(var7 / 2), var8 / 2 + var6, class328.field4550 << 1, class328.field4550 << 1);
            class600.method3369(class328.field4550 << 1, class328.field4550 << 1, 1, var8 / 2 + var6, var7 / 2 + var9);
            class321.method2072(-class720.field9994 & 16383, class511.field7303, 16383 & -class707.field9813, class155.field2169, 16383 & -class187.field2514, class32.field426, (byte) 106);
            byte var21 = class557.field7812.field6509.method3516(false) == 2 ? (byte) class82.field1033 : 1;
            if (class589.field8295) {
                class444.method2668(-class720.field9994 & 16383, 16383 & -class187.field2514, -class707.field9813 & 16383, -1);
                class343.method2220(class660.field9039.field1266 - -1, class741.field10305, class32.field426, class267.field3817, var21, class418.field5909, class402.field5702, class155.field2169, class511.field7303, class516.field7361, true, 0, class740.field10285, class660.field9039.field1250 >> 9, class394.field5582, class307.field4297, class557.field7812.field6512.method3355(false) == 0, class660.field9039.field1264 >> 9);
            } else {
                class614.method3435(class740.field10285, class511.field7303, class155.field2169, class32.field426, class741.field10305, class418.field5909, class402.field5702, class267.field3817, class307.field4297, class394.field5582, class660.field9039.field1266 + 1, var21, class660.field9039.field1264 >> 9, class660.field9039.field1250 >> 9, ~class557.field7812.field6512.method3355(false) == -1, true, class180.field2409 ? class516.field7361 : -1, 0, false);
            }
            class485.method2904((byte) -91);
            if (class222.field2897 == 10) {
                class89.method678(false, 256, var7, var8, var6, var9, 256);
                class144.method1002(var8, (byte) 10, var6, var7, 256, var9, 256);
                class524.method3063(256, var7, var9, var6, var8, (byte) -91, 256);
                class514.method3028(var9, (byte) 71, var7, var6, var8);
            }
            class340.method2197();
            class155.field2169 = var15;
            class32.field426 = var16;
            class511.field7303 = var14;
            class187.field2514 = var17;
            class720.field9994 = var18;
            if (class128.field1537 && class25.field349.method3411(true) == 0) {
                class128.field1537 = false;
            }
            if (class128.field1537) {
                class268.field3831.method417(-16777216, var9, var6, (byte) 103, var8, var7);
                class660.method3621(class455.field6428, class71.field908.method588((byte) 95, class549.field7669), false, 124, class478.field6780, class268.field3831);
            }
            class136.method966(false, (byte) 125);
        } else {
            class268.field3831.method417(-16777216, arg4, arg5, (byte) 66, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 286)
    public static final int method3632(String arg0, int arg1) {
        ++field9060;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = 0;
        if (arg1 != -27550) {
            return -90;
        } else {
            while (var2 > var4) {
                var3 = (var3 << 5) - (var3 - arg0.charAt(var4));
                ++var4;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IZ)[I", line = 310)
    public final int[] method24(int arg0, boolean arg1) {
        ++field9059;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            this.method24(88, true);
        }
        if (super.field673.field8073) {
            int[] var4 = this.method367(4463, 0, arg0);
            for (int var5 = 0; ~class328.field4576 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field9058) {
                    var3[var5] = this.field9058;
                } else if (var6 > this.field9061) {
                    var3[var5] = this.field9061;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "()V", line = 402)
    public class662() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILee;I)V", line = 359)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            field9063 = null;
        }
        ++field9056;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field674 = arg1.method3750((byte) 35) == 1;
                }
            } else {
                this.field9061 = arg1.method3757((byte) -65);
            }
        } else {
            this.field9058 = arg1.method3757((byte) -65);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)[[I", line = 406)
    public final int[][] method5(int arg0, int arg1) {
        ++field9062;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (arg1 != 1) {
            method3632((String) null, -85);
        }
        if (super.field668.field7292) {
            int[][] var4 = this.method369(arg0, -24, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class328.field4576 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field9058) {
                    if (this.field9061 < var12) {
                        var8[var11] = this.field9061;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field9058;
                }
                if (this.field9058 > var13) {
                    var9[var11] = this.field9058;
                } else if (var13 > this.field9061) {
                    var9[var11] = this.field9061;
                } else {
                    var9[var11] = var13;
                }
                if (var14 >= this.field9058) {
                    if (this.field9061 < var14) {
                        var10[var11] = this.field9061;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field9058;
                }
            }
        }
        return var3;
    }
}
