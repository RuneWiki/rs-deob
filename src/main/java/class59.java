import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class59 {

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Ljo;")
    private class382 field805 = new class382(64);

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Lok;")
    public class74 field808;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "Lok;")
    private class74 field811;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "Z")
    public static boolean field812 = true;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "Luv;")
    public static class2 field804 = new class2(16, 5);

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "[J")
    public static long[] field816 = new long[32];

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "Loo;")
    public static class31 field818 = new class31("WIP", 2);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Lqr;")
    public static class505 field817;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lmg;")
    public static class529 field813;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lbh;")
    public final class420 method419(int arg0, int arg1) {
        field806++;
        class382 var3 = this.field805;
        class420 var4;
        synchronized (this.field805) {
            var4 = (class420) this.field805.method2288((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field811;
        byte[] var6;
        synchronized (this.field811) {
            var6 = this.field811.method541(arg1, arg0, (byte) -122);
        }
        class420 var7 = new class420();
        var7.field6284 = this;
        if (var6 != null) {
            var7.method2508(new class468(var6), (byte) 76);
        }
        class382 var8 = this.field805;
        synchronized (this.field805) {
            this.field805.method2290((long) arg1, var7, 123);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
    public static final boolean method420(int arg0, int arg1, int arg2) {
        field807++;
        if (arg0 != -1) {
            method421(8, -102, 71, -118, 114, -100, -64, -115, -20, 93);
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 >= class297.field4427 && arg6 <= class102.field1544 && arg2 >= class297.field4427 && class102.field1544 >= arg2 && arg4 >= class297.field4427 && arg4 <= class102.field1544 && class297.field4427 <= arg1 && class102.field1544 >= arg1 && arg3 >= class305.field4555 && arg3 <= class286.field4290 && class305.field4555 <= arg0 && arg0 <= class286.field4290 && arg9 >= class305.field4555 && class286.field4290 >= arg9 && arg5 >= class305.field4555 && class286.field4290 >= arg5) {
            class390.method2341(arg4, arg1, arg6, arg2, arg5, arg0, arg9, arg3, (byte) 89, arg8);
        } else {
            class510.method3011(arg6, arg4, arg9, false, arg8, arg1, arg2, arg5, arg3, arg0);
        }
        if (arg7 != -1) {
            field818 = null;
        }
        field803++;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public final void method422(int arg0) {
        field809++;
        class382 var2 = this.field805;
        synchronized (this.field805) {
            this.field805.method2287(arg0 ^ 0x5B);
        }
        if (arg0 != 0) {
            field818 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
    public static void method423(int arg0) {
        field816 = null;
        field813 = null;
        if (arg0 <= 121) {
            method426(77, 35, 88, 119, 31, null, 72, 74, 100, -68, -79, 28);
        }
        field817 = null;
        field818 = null;
        field804 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static final void method424(byte arg0) {
        if (arg0 > -59) {
            field812 = true;
        }
        field814++;
        if (class62.field837) {
            return;
        }
        class62.field837 = true;
        class116.field1745 = true;
        if (class454.field6661.field969) {
            class311.field4836 = ((int) class311.field4836 - 65 & 0xFFFFFF80);
        } else {
            class78.field1085 += (-24.0F - class78.field1085) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
    public final void method425(byte arg0) {
        field802++;
        class382 var2 = this.field805;
        synchronized (this.field805) {
            this.field805.method2293(false);
            if (arg0 < 13) {
                method424((byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIILep;IIIIII)Z")
    public static final boolean method426(int arg0, int arg1, int arg2, int arg3, int arg4, class311 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field815++;
        int var12 = arg9;
        int var13 = arg8;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        class143.field2158[var14][var15] = 99;
        int var17 = arg8 - var15;
        class239.field3353[var14][var15] = arg11;
        byte var18 = 0;
        int var19 = 0;
        class491.field7326[var18] = arg9;
        int var35 = var18 + 1;
        class110.field1659[var18] = arg8;
        int[][] var20 = arg5.field4819;
        while (true) {
            label282: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label259: do {
                                if (var35 == var19) {
                                    class425.field6332 = var13;
                                    class227.field3203 = var12;
                                    return false;
                                }
                                var13 = class110.field1659[var19];
                                var12 = class491.field7326[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var23 = var12 - arg5.field4813;
                                var24 = var13 - arg5.field4820;
                                if (arg10 == -4) {
                                    if (arg3 == var12 && arg1 == var13) {
                                        class227.field3203 = var12;
                                        class425.field6332 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class482.method2882(var12, arg3, arg6, var13, arg4, -109, arg1, arg6, arg7)) {
                                        class227.field3203 = var12;
                                        class425.field6332 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg5.method1954(arg6, arg7, (byte) -104, var13, arg4, arg3, arg6, arg2, arg1, var12)) {
                                        class425.field6332 = var13;
                                        class227.field3203 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg5.method1951(var13, true, var12, arg6, arg7, arg4, arg2, arg1, arg3)) {
                                        class227.field3203 = var12;
                                        class425.field6332 = var13;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg5.method1955(var13, arg10, arg3, arg6, -3, arg0, var12, arg1)) {
                                        class227.field3203 = var12;
                                        class425.field6332 = var13;
                                        return true;
                                    }
                                } else if (arg5.method1952(arg3, arg0, arg1, (byte) 104, var12, var13, arg6, arg10)) {
                                    class227.field3203 = var12;
                                    class425.field6332 = var13;
                                    return true;
                                }
                                var26 = class239.field3353[var21][var22] + 1;
                                if (var21 > 0 && class143.field2158[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg6 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg6 - 1)) {
                                            class491.field7326[var35] = var12 - 1;
                                            class110.field1659[var35] = var13;
                                            class143.field2158[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class239.field3353[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < (128 - arg6) && class143.field2158[var21 + 1][var22] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[arg6 + var23][var24 + arg6 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg6 - 1)) {
                                            class491.field7326[var35] = var12 + 1;
                                            class110.field1659[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class143.field2158[var21 + 1][var22] = 8;
                                            class239.field3353[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class143.field2158[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg6 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg6 - 1 <= var29) {
                                            class491.field7326[var35] = var12;
                                            class110.field1659[var35] = var13 - 1;
                                            class143.field2158[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class239.field3353[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg6 > var22 && class143.field2158[var21][var22 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[var23 + arg6 - 1][var24 + arg6] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg6 - 1 <= var30) {
                                            class491.field7326[var35] = var12;
                                            class110.field1659[var35] = var13 + 1;
                                            class143.field2158[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class239.field3353[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg6 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class143.field2158[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg6 <= var31) {
                                            class491.field7326[var35] = var12 - 1;
                                            class110.field1659[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class143.field2158[var21 - 1][var22 - 1] = 3;
                                            class239.field3353[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg6) && var22 > 0 && class143.field2158[var21 + 1][var22 - 1] == 0 && (var20[var23 + arg6][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg6 <= var32) {
                                            class491.field7326[var35] = var12 + 1;
                                            class110.field1659[var35] = var13 - 1;
                                            class143.field2158[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class239.field3353[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && 128 - arg6 > var22 && class143.field2158[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg6 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg6 + var24] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class491.field7326[var35] = var12 - 1;
                                    class110.field1659[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class143.field2158[var21 - 1][var22 + 1] = 6;
                                    class239.field3353[var21 - 1][var22 + 1] = var26;
                                }
                            } while ((128 - arg6) <= var21);
                        } while (var22 >= (128 - arg6));
                    } while (class143.field2158[var21 + 1][var22 + 1] != 0);
                } while ((var20[var23 + arg6][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class491.field7326[var35] = var12 + 1;
                class110.field1659[var35] = var13 + 1;
                class143.field2158[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class239.field3353[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
    public final void method427(int arg0, int arg1) {
        class382 var3 = this.field805;
        synchronized (this.field805) {
            this.field805.method2294(arg0, true);
        }
        if (arg1 != -1) {
            field812 = false;
        }
        field810++;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lkr;ILok;Lok;)V")
    public class59(class262 arg0, int arg1, class74 arg2, class74 arg3) {
        this.field808 = arg3;
        this.field811 = arg2;
        this.field811.method536(false, 3);
    }
}
