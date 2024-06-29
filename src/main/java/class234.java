import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class234 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field3830 = 0;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field3836 = 2048;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field3829 = 2048;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public int field3841 = 0;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lwm;")
    public static class152 field3832 = class157.method1048("m-Ochte mit Ihnen handeln)3", 121);

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lwm;")
    public static class152 field3837 = class157.method1048(": ", 127);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lbg;")
    public static class203 field3834;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lah;")
    public static class205 field3838;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[[[B")
    public static byte[][][] field3839;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZLhi;)V", line = 6)
    private final void method1603(int arg0, int arg1, boolean arg2, class291 arg3) {
        if (arg1 == 1) {
            this.field3841 = arg3.method2011(-108);
        } else if (arg1 == 2) {
            this.field3829 = arg3.method2021((byte) 74);
        } else if (arg1 == 3) {
            this.field3836 = arg3.method2021((byte) 74);
        } else if (arg1 == 4) {
            this.field3830 = arg3.method1986(true);
        }
        field3831++;
        if (arg2) {
            method1609(20);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 40)
    public static void method1604(int arg0) {
        field3837 = null;
        field3839 = (byte[][][]) null;
        if (arg0 != 0) {
            method1606(-124);
        }
        field3832 = null;
        field3838 = null;
        field3834 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILwm;)V", line = 55)
    public static final void method1605(int arg0, class152 arg1) {
        if (arg0 <= 83) {
            method1604(-117);
        }
        field3840++;
        int var2 = class63.method408(-121, arg1);
        if (var2 != -1) {
            class3.method13(class194.field3086.field4774[var2], class194.field3086.field4768[var2], true);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 77)
    public static final void method1606(int arg0) {
        field3843++;
        if (class277.field4738 > 0) {
            class211.method1418(arg0 ^ 0x5EB1);
            return;
        }
        class84.field1167 = class265.field4477;
        if (arg0 != 22243) {
            field3832 = (class152) null;
        }
        class265.field4477 = null;
        class232.method1597((byte) 127, 40);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lhi;IB)V", line = 98)
    public final void method1607(class291 arg0, int arg1, byte arg2) {
        if (arg2 != 3) {
            return;
        }
        field3833++;
        while (true) {
            int var4 = arg0.method2011(-101);
            if (var4 == 0) {
                return;
            }
            this.method1603(arg1, var4, false, arg0);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIIBIII)V", line = 136)
    public static final void method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg10;
        int var12 = 983040 / arg4;
        field3842++;
        int var13 = -70 % ((-arg7 - 23) / 39);
        int var14 = 983040 / arg6;
        int var15 = arg3 - arg1;
        int var16 = -1;
        if (class302.field5206 > 0) {
            if (class41.field665 > 10) {
                var16 = 50 - ((class41.field665 - 10) * 5);
            } else {
                var16 = class41.field665 * 5;
            }
        }
        for (int var17 = -var14; var17 < var11 + var14; var17++) {
            int var18 = arg6 * var17 + arg5 >> 16;
            int var19 = arg5 + ((var17 + 1) * arg6) >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg9 + var19;
                int var22 = arg9 + var18;
                int var23 = arg10 + var17 >> 6;
                if (var23 >= 0 && var23 <= (class39.field643.length - 1)) {
                    int[][] var24 = class39.field643[var23];
                    for (int var25 = -var12; var25 < (var12 + var15); var25++) {
                        int var26 = (var25 + 1) * arg4 + arg2 >> 16;
                        int var27 = arg4 * var25 + arg2 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            var10000 = arg0 + var26;
                            int var30 = arg0 + var27;
                            int var31 = arg1 + var25 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = ((var25 + arg1 & 0x3F) << 6) + (arg10 + var17 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class270 var34 = class242.method1656(var33 - 1, true);
                                    if (!class3.field48[var34.field4606]) {
                                        if (var16 != -1 && class197.field3154 == var34.field4606) {
                                            class89 var35 = new class89();
                                            var35.field1249 = var30;
                                            var35.field1247 = var34.field4606;
                                            var35.field1245 = var22;
                                            class58.field888.method1214(false, var35);
                                        } else {
                                            class316.field5492[var34.field4606].method429(var22 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class89 var36 = (class89) class58.field888.method1221((byte) 75); var36 != null; var36 = (class89) class58.field888.method1223(127)) {
            class96.method641(var36.field1245, var36.field1249, 15, 16776960, var16);
            class96.method641(var36.field1245, var36.field1249, 13, 16776960, var16);
            class96.method641(var36.field1245, var36.field1249, 11, 16776960, var16);
            class96.method641(var36.field1245, var36.field1249, 9, 16776960, var16);
            class316.field5492[var36.field1247].method429(var36.field1245 - 7, var36.field1249 + -7);
        }
        class58.field888.method1224((byte) 56);
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 262)
    public static final void method1609(int arg0) {
        if (arg0 > -127) {
            field3834 = (class203) null;
        }
        if (class224.field3646 != null) {
            class224.field3646.method1680(-15389);
        }
        field3835++;
        if (class270.field4629 != null) {
            class270.field4629.method1680(-15389);
        }
    }
}
