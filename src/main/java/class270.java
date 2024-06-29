import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class270 extends class255 {

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "Lsg;")
    private static class30 field4741 = class167.method1221((byte) 33, "Loading textures )2 ");

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "Lsg;")
    public static class30 field4744 = field4741;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "Lub;")
    public static class17 field4752 = new class17(128);

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "Lsg;")
    public static class30 field4754 = class167.method1221((byte) 33, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "J")
    public static long field4753 = 0L;

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "Lsg;")
    public static class30 field4757 = class167.method1221((byte) 33, "<col=ffffff>");

    @OriginalMember(owner = "client!dg", name = "nb", descriptor = "Lsg;")
    public static class30 field4759 = class167.method1221((byte) 33, "Benutzen");

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "Llk;")
    public static class232 field4758 = new class232(30);

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "B")
    public byte field4743;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!dg", name = "ob", descriptor = "Lsg;")
    public static class30 field4760;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "Laa;")
    public class8 field4756;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method1846(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class143.field2768 = arg2;
        class71.field1599 = arg4;
        ++field4749;
        class77.field1685 = arg1;
        class183.field3354 = arg6;
        class98.field1981 = arg3;
        if (arg0 && class98.field1981 >= 100) {
            class207.field3725 = class71.field1599 * 128 + 64;
            class150.field2849 = class77.field1685 * 128 + 64;
            class64.field1419 = class31.method303(class207.field3725, class150.field2849, class159.field2998, arg5 ^ -4) + -class183.field3354;
        }
        class215.field3931 = 2;
        if (arg5 != 0) {
            method1846(true, 66, 41, -110, 98, 30, -128);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILaa;IIIIZI)V")
    public static final void method1847(int arg0, int arg1, class8 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        int var9 = -15 / ((66 - arg1) / 39);
        if (~arg4 <= -1 && ~arg4 > -105 && ~arg5 <= -1 && ~arg5 > -105) {
            if (!arg7) {
                class272.field4771[arg6][arg4][arg5] = 0;
            }
            while (true) {
                int var10 = arg2.method63((byte) 101);
                if (var10 == 0) {
                    if (arg7) {
                        class242.field4333[0][arg4][arg5] = class177.field3289[0][arg4][arg5];
                    } else if (~arg6 != -1) {
                        class242.field4333[arg6][arg4][arg5] = class242.field4333[arg6 + -1][arg4][arg5] - 240;
                    } else {
                        class242.field4333[0][arg4][arg5] = 8 * -class62.method560((byte) 4, arg4 + 932731 + arg8, 556238 - -arg5 + arg3);
                    }
                    break;
                }
                if (var10 == 1) {
                    int var11 = arg2.method63((byte) 107);
                    if (!arg7) {
                        if (var11 == 1) {
                            var11 = 0;
                        }
                        if (~arg6 == -1) {
                            class242.field4333[0][arg4][arg5] = -var11 * 8;
                        } else {
                            class242.field4333[arg6][arg4][arg5] = class242.field4333[arg6 + -1][arg4][arg5] + -(var11 * 8);
                        }
                    } else {
                        class242.field4333[0][arg4][arg5] = class177.field3289[0][arg4][arg5] - -(var11 * 8);
                    }
                    break;
                }
                if (var10 <= 49) {
                    class244.field4367[arg6][arg4][arg5] = arg2.method98(1);
                    class231.field4111[arg6][arg4][arg5] = (byte) ((var10 + -2) / 4);
                    class16.field329[arg6][arg4][arg5] = (byte) class68.method612(3, var10 - 2 + arg0);
                } else if (var10 <= 81) {
                    if (!arg7) {
                        class272.field4771[arg6][arg4][arg5] = (byte) (var10 - 49);
                    }
                } else {
                    class180.field3330[arg6][arg4][arg5] = (byte) (var10 + -81);
                }
            }
        } else {
            while (true) {
                int var12 = arg2.method63((byte) 91);
                if (~var12 == -1) {
                    break;
                }
                if (var12 == 1) {
                    arg2.method63((byte) 127);
                    break;
                }
                if (~var12 >= -50) {
                    arg2.method63((byte) 104);
                }
            }
        }
        ++field4755;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method1848(byte arg0) {
        field4744 = null;
        field4741 = null;
        field4752 = null;
        field4758 = null;
        field4759 = null;
        field4760 = null;
        field4757 = null;
        if (arg0 == 63) {
            field4754 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[BIIIIZ[Lue;II)V")
    public static final void method1849(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class13[] arg8, int arg9, int arg10) {
        ++field4742;
        if (arg6 == -23597) {
            class8 var11 = new class8(arg2);
            int var12 = -1;
            while (true) {
                int var13 = var11.method55((byte) -86);
                if (var13 == 0) {
                    return;
                }
                var12 += var13;
                int var14 = 0;
                while (true) {
                    int var15 = var11.method45(false);
                    if (var15 == 0) {
                        break;
                    }
                    var14 += var15 - 1;
                    int var16 = 63 & var14;
                    int var17 = (var14 & 4073) >> 6;
                    int var18 = var11.method63((byte) 58);
                    int var19 = var14 >> 12;
                    int var20 = var18 >> 2;
                    int var21 = 3 & var18;
                    if (arg4 == var19 && var17 >= arg0 && var17 < arg0 + 8 && ~arg9 >= ~var16 && ~var16 > ~(arg9 - -8)) {
                        class40 var22 = class195.method1415(arg6 ^ 23637, var12);
                        int var23 = class110.method872(var21, arg3, var17 & 7, var22.field955, var16 & 7, var22.field937, arg6 + 23596) + arg5;
                        int var24 = arg1 - -class249.method1745(arg3, var16 & 7, arg6 + 23555, var21, var22.field955, var17 & 7, var22.field937);
                        if (var23 > 0 && ~var24 < -1 && ~var23 > -104 && var24 < 103) {
                            class13 var25 = null;
                            if (!arg7) {
                                int var26 = arg10;
                                if (~(2 & class272.field4771[1][var23][var24]) == -3) {
                                    var26 = arg10 - 1;
                                }
                                if (var26 >= 0) {
                                    var25 = arg8[var26];
                                }
                            }
                            class255.method1774(var25, arg3 + var21 & 3, arg10, var23, !arg7, true, var12, arg7, var20, var24, arg10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)I")
    public final int method113(int arg0) {
        ++field4740;
        if (this.field4756 == null) {
            return 0;
        } else {
            return arg0 != 0 ? 64 : this.field4756.field146 * 100 / (this.field4756.field124.length + -this.field4743);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([IIIIII)V")
    public static final void method1850(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class195 var6 = class71.field1613[arg3][arg4][arg5];
        if (var6 != null) {
            class231 var7 = var6.field3535;
            if (var7 == null) {
                class10 var10 = var6.field3521;
                if (var10 != null) {
                    int var11 = var10.field178;
                    int var12 = var10.field188;
                    int var13 = var10.field190;
                    int var14 = var10.field181;
                    int[] var15 = class35.field861[var11];
                    int[] var16 = class147.field2819[var12];
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
                int var8 = var7.field4115;
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

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4748;
        int var6 = class68.method609(class275.field4804, 22050, class167.field3064, arg1);
        int var7 = class68.method609(class275.field4804, 22050, class167.field3064, arg3);
        int var8 = -28 / ((arg0 - 14) / 57);
        int var9 = class68.method609(class48.field1096, 22050, class252.field4458, arg2);
        int var10 = class68.method609(class48.field1096, 22050, class252.field4458, arg5);
        for (int var11 = var6; var11 <= var7; ++var11) {
            class194.method1405(true, class121.field2390[var11], var10, var9, arg4);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)[B")
    public final byte[] method109(boolean arg0) {
        ++field4747;
        if (!arg0) {
            return null;
        } else if (!super.field4506 && this.field4756.field124.length + -this.field4743 <= this.field4756.field146) {
            return this.field4756.field124;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BZIIIIZ)V")
    public static final void method1852(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field4746;
        if (arg0 != 5) {
            field4753 = -15L;
        }
        if (arg3 == 3) {
            method1852((byte) 5, true, -1, class40.field998, arg4, -1, true);
        } else {
            Container var7;
            if (class259.field4569 != null) {
                var7 = class259.field4569;
            } else if (class261.field4614 == null) {
                var7 = class190.field3452.field1449;
            } else {
                var7 = class261.field4614;
            }
            class222.field3988 = var7.getSize().width;
            class93.field1885 = var7.getSize().height;
            if (class261.field4614 == var7) {
                Insets var8 = class261.field4614.getInsets();
                class222.field3988 -= var8.right + var8.left;
                class93.field1885 -= var8.top + var8.bottom;
            }
            if (~arg3 > -3) {
                class238.field4238 = 503;
                class40.field1005 = 0;
                class80.field1724 = (class222.field3988 + -765) / 2;
                class15.field324 = 765;
            } else {
                class40.field1005 = 0;
                class80.field1724 = 0;
                class15.field324 = class222.field3988;
                class238.field4238 = class93.field1885;
            }
            if (arg6) {
                class65.method580(class224.field4021, (byte) -85);
                class178.method1296((byte) 42, class224.field4021);
                if (class220.field3978 != null) {
                    class220.field3978.method1345(class224.field4021, false);
                }
                class224.field4013.method140((byte) 36);
                class243.method1716(class224.field4021, 256);
                class246.method1732(false, class224.field4021);
                if (class220.field3978 != null) {
                    class220.field3978.method1347(123, class224.field4021);
                }
            } else {
                class224.field4021.setSize(class15.field324, class238.field4238);
                if (class261.field4614 != var7) {
                    class224.field4021.setLocation(class80.field1724, class40.field1005);
                } else {
                    Insets var9 = class261.field4614.getInsets();
                    class224.field4021.setLocation(class80.field1724 + var9.left, class40.field1005 + var9.top);
                }
            }
            if (~arg3 < -1) {
                method1852((byte) 5, true, -1, 0, arg4, -1, true);
            } else {
                class115.field2275 = !class81.method703(-15861);
                if (class196.field3548 != -1) {
                    class73.method671(arg0 ^ 76, true);
                }
                if (class175.field3261 != null && (class193.field3485 == 30 || ~class193.field3485 == -26)) {
                    class31.method320(63);
                }
                for (int var10 = 0; var10 < 100; ++var10) {
                    class14.field288[var10] = true;
                }
                class164.field3043 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method1853(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class80.field1731; ++var5) {
            if (arg3 < class9.field170[var5] + class256.field4509[var5] && class9.field170[var5] < arg2 + arg3 && ~(class14.field296[var5] + class110.field2211[var5]) < ~arg0 && arg0 - -arg1 > class14.field296[var5]) {
                class210.field3769[var5] = true;
            }
        }
        ++field4751;
        if (arg4 <= 121) {
            method1851(75, 50, -11, 42, -35, -124);
        }
    }
}
