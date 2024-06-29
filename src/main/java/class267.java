import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class267 extends class557 {

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    private int field3914 = -1;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3915 = 0;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Ltq;")
    public static class654 field3913 = new class654("", 17);

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3916;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[Lpj;")
    public static class157[] field3910;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1782(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class422.field6068[var1] = false;
        }
        field3912++;
        class550.field7591 = -1;
        class697.field9252 = 1;
        class430.field6225 = 0;
        class143.field1916 = 0;
        class609.field8242 = -1;
        class702.field9303 = -1;
        class577.field7864 = -1;
        if (arg0) {
            field3910 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ltn;I)V", line = 30)
    public final void method32(class95 arg0, int arg1) {
        field3918++;
        if (arg1 == -29265) {
            arg0.method750(-2, this.field3914);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V", line = 42)
    public static final void method1783(int arg0, int arg1) {
        class195 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class295 var4 = class648.field8748[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class247.field3229; var5++) {
                    for (int var6 = 0; var6 < class196.field2540; var6++) {
                        var2 = var4.method190(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class478.field6717;
                            int var8 = var5 << class478.field6717;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class295 var10 = class648.field8748[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1898(var5, var6, (byte) -28) - var10.method1898(var5, var6, (byte) -70);
                                    int var12 = var4.method1898(var5, var6 + 1, (byte) -8) - var10.method1898(var5, var6 + 1, (byte) -117);
                                    int var13 = var4.method1898(var5 + 1, var6 + 1, (byte) -112) - var10.method1898(var5 + 1, var6 + 1, (byte) -26);
                                    int var14 = var4.method1898(var5 + 1, var6, (byte) -40) - var10.method1898(var5 + 1, var6, (byte) -98);
                                    var10.method202(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V", line = 107)
    public static void method1784(boolean arg0) {
        field3913 = null;
        if (!arg0) {
            field3910 = null;
            field3916 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLdt;)V", line = 120)
    public final void method30(byte arg0, class254 arg1) {
        field3919++;
        if (arg0 == 110) {
            this.field3914 = arg1.method1728((byte) 40);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([Ljava/lang/String;[II)V", line = 132)
    public static final void method1785(String[] arg0, int[] arg1, int arg2) {
        field3917++;
        class315.method2013(arg0.length - 1, arg1, arg0, 0, (byte) -52);
        if (arg2 != 3) {
            field3916 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BILha;Loq;)V", line = 152)
    public static final void method1786(byte arg0, int arg1, class66 arg2, class378 arg3) {
        field3911++;
        if (arg0 != -46) {
            field3910 = null;
        }
        if (class75.field1020 != null && arg3.field5521 >= arg1) {
            for (int var4 = 0; var4 < class75.field1020.length; var4++) {
                if (class75.field1020[var4] != -1000000 && (arg3.field5515[0] <= class75.field1020[var4] || arg3.field5515[1] <= class75.field1020[var4] || arg3.field5515[2] <= class75.field1020[var4] || class75.field1020[var4] >= arg3.field5515[3]) && (class29.field284[var4] >= arg3.field5517[0] || class29.field284[var4] >= arg3.field5517[1] || class29.field284[var4] >= arg3.field5517[2] || class29.field284[var4] >= arg3.field5517[3]) && (class708.field9676[var4] <= arg3.field5517[0] || arg3.field5517[1] >= class708.field9676[var4] || class708.field9676[var4] <= arg3.field5517[2] || arg3.field5517[3] >= class708.field9676[var4]) && (class483.field6764[var4] >= arg3.field5516[0] || class483.field6764[var4] >= arg3.field5516[1] || class483.field6764[var4] >= arg3.field5516[2] || class483.field6764[var4] >= arg3.field5516[3]) && (class217.field2837[var4] <= arg3.field5516[0] || arg3.field5516[1] >= class217.field2837[var4] || arg3.field5516[2] >= class217.field2837[var4] || arg3.field5516[3] >= class217.field2837[var4])) {
                    return;
                }
            }
        }
        if (arg3.field5524 == 1) {
            int var5 = class278.field4025 + arg3.field5522 - class130.field1787;
            if (var5 >= 0 && class278.field4025 + class278.field4025 >= var5) {
                int var6 = arg3.field5513 + class278.field4025 - class468.field6610;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > class278.field4025 + class278.field4025) {
                    return;
                }
                int var7 = arg3.field5512 + class278.field4025 - class468.field6610;
                if (class278.field4025 + class278.field4025 < var7) {
                    var7 = class278.field4025 + class278.field4025;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var7 >= var6) {
                    if (class408.field5778[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class194.field2524 - arg3.field5517[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class693.field9225 > var9) && class247.method1532(1, 0, arg3) && class247.method1532(1, 1, arg3) && class247.method1532(1, 2, arg3) && class247.method1532(arg0 + 47, 3, arg3)) {
                        class561.field7690[class346.field4859++] = arg3;
                    }
                }
            }
        } else if (arg3.field5524 == 2) {
            int var10 = arg3.field5513 + class278.field4025 - class468.field6610;
            if (var10 >= 0 && var10 <= class278.field4025 + class278.field4025) {
                int var11 = class278.field4025 + arg3.field5522 - class130.field1787;
                if (var11 < 0) {
                    var11 = 0;
                } else if ((class278.field4025 + class278.field4025) < var11) {
                    return;
                }
                int var12 = arg3.field5518 + class278.field4025 - class130.field1787;
                if (class278.field4025 + class278.field4025 < var12) {
                    var12 = class278.field4025 + class278.field4025;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class408.field5778[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class511.field7121 - arg3.field5516[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class693.field9225) && class247.method1532(1, 0, arg3) && class247.method1532(1, 1, arg3) && class247.method1532(arg0 + 47, 2, arg3) && class247.method1532(1, 3, arg3)) {
                        class561.field7690[class346.field4859++] = arg3;
                    }
                }
            }
        } else if (arg3.field5524 == 16 || arg3.field5524 == 8) {
            int var23 = arg3.field5522 + class278.field4025 - class130.field1787;
            if (var23 >= 0 && var23 <= (class278.field4025 + class278.field4025)) {
                int var24 = arg3.field5513 + class278.field4025 - class468.field6610;
                if (var24 >= 0 && (class278.field4025 + class278.field4025) >= var24 && class408.field5778[var23][var24]) {
                    float var25 = (float) (class194.field2524 - arg3.field5517[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class511.field7121 - arg3.field5516[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!(var25 < (float) class693.field9225) || !(var26 < (float) class693.field9225) && class247.method1532(1, 0, arg3) && class247.method1532(1, 1, arg3) && class247.method1532(arg0 ^ 0xFFFFFFD3, 2, arg3) && class247.method1532(arg0 ^ 0xFFFFFFD3, 3, arg3)) {
                        class561.field7690[class346.field4859++] = arg3;
                    }
                }
            }
        } else if (arg3.field5524 == 4) {
            float var15 = (float) (arg3.field5515[0] - class49.field497);
            if (!((float) class350.field5104 >= var15)) {
                int var16 = arg3.field5513 - (class468.field6610 - class278.field4025);
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > (class278.field4025 + class278.field4025)) {
                    return;
                }
                int var17 = arg3.field5512 + class278.field4025 - class468.field6610;
                if (class278.field4025 + class278.field4025 < var17) {
                    var17 = class278.field4025 + class278.field4025;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = arg3.field5522 + class278.field4025 - class130.field1787;
                if (var18 < 0) {
                    var18 = 0;
                } else if (class278.field4025 + class278.field4025 < var18) {
                    return;
                }
                int var19 = arg3.field5518 + class278.field4025 - class130.field1787;
                if ((class278.field4025 + class278.field4025) < var19) {
                    var19 = class278.field4025 + class278.field4025;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label295: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class408.field5778[var21][var22]) {
                            var20 = true;
                            break label295;
                        }
                    }
                }
                if (var20 && class247.method1532(arg0 ^ 0xFFFFFFD3, 0, arg3) && class247.method1532(1, 1, arg3) && class247.method1532(1, 2, arg3) && class247.method1532(1, 3, arg3)) {
                    class561.field7690[class346.field4859++] = arg3;
                }
            }
        }
    }
}
