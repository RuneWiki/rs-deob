import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class619 {

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[[F")
    public float[][] field8719;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
    public int[] field8725;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[I")
    public int[] field8723;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "[I")
    public int[] field8716;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Ljo;")
    public static class351 field8717 = new class351(75, 3);

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Leo;")
    public static class310 field8724 = new class310();

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Leb;")
    public static class650 field8727;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Leb;")
    public static class650 field8726 = field8727 = new class650(false);

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "[I")
    public static int[] field8728;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 4)
    public static void method3536(byte arg0) {
        field8727 = null;
        field8717 = null;
        field8728 = null;
        field8724 = null;
        field8726 = null;
        if (arg0 <= 28) {
            method3536((byte) 86);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)V", line = 20)
    public static final void method3537(int arg0, boolean arg1) {
        if (arg1) {
            if (class251.field3546 != -1) {
                class34.method233((byte) -22, class251.field3546);
            }
            for (class329 var2 = (class329) class251.field3547.method382(arg0 - 2028208128); var2 != null; var2 = (class329) class251.field3547.method391(37)) {
                if (!var2.method3114(-65)) {
                    var2 = (class329) class251.field3547.method382(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class224.method1551((byte) 26, var2, false, true);
            }
            class251.field3546 = -1;
            class251.field3547 = new class64(8);
            class723.method4073(1);
            class251.field3546 = class730.field10207;
            class126.method924(false, (byte) 102);
            class149.method1028(arg0 - 2028227504);
            class353.method2223(class251.field3546);
        }
        field8720++;
        class676.field9624 = "";
        class336.field4992 = "";
        if (arg0 != 2028208128) {
            return;
        }
        class585.field8273 = false;
        class718.method4050(false);
        class303.field4540 = -1;
        class759.method4189(class733.field10240, true);
        class251.field3549 = new class559();
        class251.field3549.field7719 = class760.field10479 * 512 / 2;
        class251.field3549.field6448[0] = class109.field1314 / 2;
        class251.field3549.field7718 = class109.field1314 * 512 / 2;
        class251.field3549.field6445[0] = class760.field10479 / 2;
        class359.field5216 = 0;
        class277.field3866 = 0;
        if (class763.field10510 == 2) {
            class277.field3866 = class2.field21 << 9;
            class359.field5216 = class717.field10088 << 9;
        } else {
            class437.method2636(1);
        }
        class696.method3921((byte) -21);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIIIILmja;II)Z", line = 86)
    public static final boolean method3538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class438 arg9, int arg10, int arg11) {
        field8722++;
        int var12 = arg5;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg5 - var14;
        class614.field8676[var14][var15] = 99;
        int var17 = arg4 - var15;
        class298.field4492[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class696.field9832[var18] = arg5;
        int var35 = var18 + 1;
        class58.field822[var18] = arg4;
        int[][] var20 = arg9.field6279;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class767.field10596 = var12;
                                    class689.field9749 = var13;
                                    if (arg0 != -1) {
                                        method3539((byte) 76, -70);
                                    }
                                    return false;
                                }
                                var13 = class58.field822[var19];
                                var12 = class696.field9832[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg9.field6269;
                                var24 = var13 - arg9.field6262;
                                if (arg3 == -4) {
                                    if (arg8 == var12 && arg10 == var13) {
                                        class767.field10596 = var12;
                                        class689.field9749 = var13;
                                        return true;
                                    }
                                } else if (arg3 == -3) {
                                    if (class509.method2977(arg2, arg2, arg6, var13, arg7, arg8, false, arg10, var12)) {
                                        class689.field9749 = var13;
                                        class767.field10596 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -2) {
                                    if (arg9.method2640(arg8, arg6, arg2, -109, var12, arg7, arg10, arg2, arg1, var13)) {
                                        class767.field10596 = var12;
                                        class689.field9749 = var13;
                                        return true;
                                    }
                                } else if (arg3 == -1) {
                                    if (arg9.method2655(arg10, (byte) -113, arg6, var13, arg2, arg1, arg7, arg8, var12)) {
                                        class689.field9749 = var13;
                                        class767.field10596 = var12;
                                        return true;
                                    }
                                } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                                    if (arg9.method2653(arg0 - 100, arg2, arg3, arg11, var12, var13, arg8, arg10)) {
                                        class689.field9749 = var13;
                                        class767.field10596 = var12;
                                        return true;
                                    }
                                } else if (arg9.method2644(arg11, arg3, arg10, arg8, -12354, arg2, var12, var13)) {
                                    class767.field10596 = var12;
                                    class689.field9749 = var13;
                                    return true;
                                }
                                var26 = class298.field4492[var22][var21] + 1;
                                if (var22 > 0 && class614.field8676[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 - (1 - arg2)] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var27) {
                                            class696.field9832[var35] = var12 - 1;
                                            class58.field822[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class614.field8676[var22 - 1][var21] = 2;
                                            class298.field4492[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < (128 - arg2) && class614.field8676[var22 + 1][var21] == 0 && (var20[var23 + arg2][var24] & 0x60E40000) == 0 && (var20[var23 + arg2][var24 + arg2 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg2 - 1)) {
                                            class696.field9832[var35] = var12 + 1;
                                            class58.field822[var35] = var13;
                                            class614.field8676[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class298.field4492[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class614.field8676[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg2 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg2 - 1)) {
                                            class696.field9832[var35] = var12;
                                            class58.field822[var35] = var13 - 1;
                                            class614.field8676[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class298.field4492[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg2) > var21 && class614.field8676[var22][var21 + 1] == 0 && (var20[var23][arg2 + var24] & 0x4E240000) == 0 && (var20[var23 + arg2 - 1][var24 + arg2] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg2 - 1 <= var30) {
                                            class696.field9832[var35] = var12;
                                            class58.field822[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class614.field8676[var22][var21 + 1] = 4;
                                            class298.field4492[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg2 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class614.field8676[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg2 <= var31) {
                                            class696.field9832[var35] = var12 - 1;
                                            class58.field822[var35] = var13 - 1;
                                            class614.field8676[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class298.field4492[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg2) > var22 && var21 > 0 && class614.field8676[var22 + 1][var21 - 1] == 0 && (var20[arg2 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg2 <= var32) {
                                            class696.field9832[var35] = var12 + 1;
                                            class58.field822[var35] = var13 - 1;
                                            class614.field8676[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class298.field4492[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg2) && class614.field8676[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg2 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg2 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class696.field9832[var35] = var12 - 1;
                                    class58.field822[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class614.field8676[var22 - 1][var21 + 1] = 6;
                                    class298.field4492[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg2 <= var22);
                        } while (var21 >= 128 - arg2);
                    } while (class614.field8676[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg2 + var23][arg2 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var20[var23 + var34][arg2 + var24] & 0x7E240000) != 0 || (var20[var23 + arg2][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class696.field9832[var35] = var12 + 1;
                class58.field822[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class614.field8676[var22 + 1][var21 + 1] = 12;
                class298.field4492[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)Lep;", line = 525)
    public static final class440 method3539(byte arg0, int arg1) {
        field8718++;
        class440[] var2 = class422.method2519(-6411);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class440 var5 = var2[var3];
            if (var5.field6293 == arg1) {
                return var5;
            }
        }
        int var4 = -91 / ((-arg0 - 2) / 52);
        return null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([I[I[I[[F)V", line = 555)
    public class619(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field8719 = arg3;
        this.field8725 = arg2;
        this.field8723 = arg1;
        this.field8716 = arg0;
    }
}
