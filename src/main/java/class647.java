import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class647 extends class751 {

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "F")
    public static float field9107;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static final void method3696(int arg0) {
        ++field9110;
        if (!class422.field5962) {
            class102.field1282 = ~class17.field274 != 0 && class543.field7608 >= class17.field274 || (class102.field1283 ? 26 : 22) + class543.field7608 * 16 > class512.field7325;
        }
        class163.field2388.method2503(10);
        class64.field858.method2503(10);
        for (class312 var1 = (class312) class551.field7826.method2508((byte) 120); var1 != null; var1 = (class312) class551.field7826.method2505((byte) -55)) {
            int var38 = var1.field4640;
            if (~var38 > -1001) {
                var1.method3117((byte) -15);
                if (var38 != 12 && ~var38 != -26 && ~var38 != -24 && ~var38 != -4 && var38 != 45 && var38 != 13 && ~var38 != -58) {
                    class163.field2388.method2510(var1, false);
                } else {
                    class64.field858.method2510(var1, false);
                }
            }
        }
        class163.field2388.method2511(class551.field7826, true);
        class64.field858.method2511(class551.field7826, true);
        if (arg0 != 11410) {
            method3696(-4);
        }
        if (~class543.field7608 < -2) {
            if (class733.field10233 && class311.field4630.method2733(arg0 + -11328, 81) && ~class543.field7608 < -3) {
                class50.field723 = (class312) class551.field7826.field5911.field7583.field7583;
            } else {
                class50.field723 = (class312) class551.field7826.field5911.field7583;
            }
            class324.field4852 = (class312) class551.field7826.field5911.field7583;
        } else {
            class324.field4852 = null;
            class50.field723 = null;
        }
        int var2 = -1;
        class218 var3 = (class218) class585.field8267.method2508((byte) 120);
        if (var3 != null) {
            var2 = var3.method1511((byte) 110);
        }
        if (class422.field5962) {
            if (var2 == -1) {
                int var4 = class694.field9812.method3201((byte) 81);
                int var5 = class694.field9812.method3197((byte) -122);
                boolean var6 = false;
                if (class569.field8059 != null) {
                    if (class209.field3041 + -10 <= var4 && var4 <= class209.field3041 + 10 - -class126.field1652 && class149.field1906 + -10 <= var5 && var5 <= class149.field1906 + 10 + class204.field2992) {
                        var6 = true;
                    } else {
                        class762.method4197((byte) -94);
                    }
                }
                if (!var6) {
                    if (class505.field7233 + -10 <= var4 && class505.field7233 + 10 - -class611.field8627 >= var4 && ~(class761.field10487 + -10) >= ~var5 && var5 <= class407.field5748 + 10 + class761.field10487) {
                        if (class102.field1282) {
                            int var7 = -1;
                            int var8 = -1;
                            for (int var9 = 0; var9 < class27.field394; ++var9) {
                                if (class102.field1283) {
                                    int var10 = class761.field10487 - -(var9 * 16) + 33;
                                    if (~var5 < ~(var10 - 13) && ~(var10 + 4) < ~var5) {
                                        var7 = var9;
                                        var8 = var10 + -13;
                                        break;
                                    }
                                } else {
                                    int var11 = class761.field10487 - (-31 - var9 * 16);
                                    if (~var5 < ~(var11 + -13) && ~var5 > ~(var11 + 3)) {
                                        var7 = var9;
                                        var8 = var11 + -13;
                                        break;
                                    }
                                }
                            }
                            if (~var7 != 0) {
                                int var12 = 0;
                                class775 var13 = new class775(class174.field2456);
                                for (class4 var14 = (class4) var13.method4250(10581); var14 != null; var14 = (class4) var13.method4249((byte) 112)) {
                                    if (var7 == var12) {
                                        if (var14.field49 > 1) {
                                            class218.method1510(var8, var5, (byte) -4, var14);
                                        }
                                        break;
                                    }
                                    ++var12;
                                }
                            }
                        }
                    } else {
                        class486.method2837(-106);
                    }
                }
            }
            if (var2 == 0) {
                int var15 = var3.method1508((byte) -88);
                int var16 = var3.method1506((byte) -128);
                if (class569.field8059 != null && var15 >= class209.field3041 && class209.field3041 - -class126.field1652 >= var15 && class149.field1906 <= var16 && var16 <= class204.field2992 + class149.field1906) {
                    int var17 = -1;
                    for (int var18 = 0; var18 < class569.field8059.field49; ++var18) {
                        if (class102.field1283) {
                            int var22 = var18 * 16 + (class149.field1906 - -33);
                            if (~(var22 - 13) > ~var16 && ~var16 > ~(var22 - -4)) {
                                var17 = var18;
                            }
                        } else {
                            int var23 = class149.field1906 - (-31 - var18 * 16);
                            if (var16 > var23 + -13 && var23 + 3 > var16) {
                                var17 = var18;
                            }
                        }
                    }
                    if (~var17 != 0) {
                        int var19 = 0;
                        class775 var20 = new class775(class569.field8059.field46);
                        for (class312 var21 = (class312) var20.method4250(10581); var21 != null; var21 = (class312) var20.method4249((byte) 112)) {
                            if (var17 == var19) {
                                class416.method2496(var15, (byte) -126, var16, var21);
                                break;
                            }
                            ++var19;
                        }
                    }
                    class486.method2837(-88);
                    return;
                }
                if (var15 >= class505.field7233 && class611.field8627 + class505.field7233 >= var15 && var16 >= class761.field10487 && class761.field10487 + class407.field5748 >= var16) {
                    if (!class102.field1282) {
                        int var24 = -1;
                        for (int var25 = 0; class543.field7608 > var25; ++var25) {
                            if (class102.field1283) {
                                int var29 = (-var25 + class543.field7608 + -1) * 16 + class761.field10487 + 33;
                                if (var16 > var29 + -13 && var29 - -4 > var16) {
                                    var24 = var25;
                                }
                            } else {
                                int var30 = (class543.field7608 - var25 + -1) * 16 + class761.field10487 + 31;
                                if (var16 > var30 - 13 && var30 + 3 > var16) {
                                    var24 = var25;
                                }
                            }
                        }
                        if (~var24 != 0) {
                            int var26 = 0;
                            class221 var27 = new class221(class551.field7826);
                            for (class312 var28 = (class312) var27.method1527(true); var28 != null; var28 = (class312) var27.method1525(7064)) {
                                if (~var24 == ~var26) {
                                    class416.method2496(var15, (byte) -127, var16, var28);
                                    break;
                                }
                                ++var26;
                            }
                        }
                        class486.method2837(arg0 ^ -11467);
                        return;
                    }
                    int var31 = -1;
                    for (int var32 = 0; ~class27.field394 < ~var32; ++var32) {
                        if (class102.field1283) {
                            int var33 = var32 * 16 + class761.field10487 + 33;
                            if (~var16 < ~(var33 + -13) && var33 - -4 > var16) {
                                var31 = var32;
                                break;
                            }
                        } else {
                            int var34 = var32 * 16 + 31 + class761.field10487;
                            if (var16 > var34 + -13 && var16 < var34 + 3) {
                                var31 = var32;
                                break;
                            }
                        }
                    }
                    if (~var31 != 0) {
                        int var35 = 0;
                        class775 var36 = new class775(class174.field2456);
                        for (class4 var37 = (class4) var36.method4250(10581); var37 != null; var37 = (class4) var36.method4249((byte) 111)) {
                            if (~var31 == ~var35) {
                                class416.method2496(var15, (byte) -127, var16, (class312) var37.field46.field5842.field3126);
                                class486.method2837(-68);
                                return;
                            }
                            ++var35;
                        }
                        return;
                    }
                }
            }
        } else {
            if (var2 == 0 && (class4.field56 == 1 && ~class543.field7608 < -3 || class204.method1468((byte) -108))) {
                var2 = 2;
            }
            if (var2 == 2 && class543.field7608 > 0 && var3 != null) {
                if (class169.field2433 == null && ~class391.field5549 == -1) {
                    class90.method641(1, var3.method1508((byte) 114), var3.method1506((byte) 90));
                } else {
                    class553.field7875 = 2;
                }
            }
            if (var2 == 0) {
                if (class50.field723 == null) {
                    if (class26.field382) {
                        class272.method1770(arg0 ^ -11411);
                    }
                } else {
                    class76.method594(0);
                }
            }
            if (class169.field2433 != null || class391.field5549 != 0) {
                return;
            }
            class359.field5223 = null;
            class553.field7875 = 0;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class647() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)V")
    public static final void method3697(int arg0, int arg1) {
        ++field9111;
        if (arg0 == 0) {
            class678 var2 = class630.method3597(29636, 16, (long) arg1);
            var2.method3836((byte) -108);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILmja;IIIIIIIII)Z")
    public static final boolean method3698(int arg0, class438 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field9108;
        int var11 = arg4;
        int var12 = arg8;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg4;
        if (arg9 != 14552) {
            field9107 = -2.2128305F;
        }
        int var16 = -var14 + arg8;
        class614.field8676[var13][var14] = 99;
        class298.field4492[var13][var14] = 0;
        byte var17 = 0;
        class696.field9832[var17] = arg4;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class58.field822[var10001] = arg8;
        int[][] var19 = arg1.field6279;
        while (var26 != var18) {
            var11 = class696.field9832[var18];
            var12 = class58.field822[var18];
            int var20 = -var16 + var12;
            int var21 = -var15 + var11;
            var18 = var18 - -1 & 4095;
            int var22 = var11 - arg1.field6269;
            int var23 = var12 - arg1.field6262;
            if (arg3 != -4) {
                if (~arg3 != 2) {
                    if (arg3 != -2) {
                        if (~arg3 != 0) {
                            if (~arg3 != -1 && arg3 != 1 && ~arg3 != -3 && ~arg3 != -4 && arg3 != 9) {
                                if (arg1.method2644(arg5, arg3, arg10, arg7, arg9 + -26906, 2, var11, var12)) {
                                    class767.field10596 = var11;
                                    class689.field9749 = var12;
                                    return true;
                                }
                            } else if (arg1.method2653(arg9 ^ 14529, 2, arg3, arg5, var11, var12, arg7, arg10)) {
                                class689.field9749 = var12;
                                class767.field10596 = var11;
                                return true;
                            }
                        } else if (arg1.method2655(arg10, (byte) -111, arg6, var12, 2, arg2, arg0, arg7, var11)) {
                            class689.field9749 = var12;
                            class767.field10596 = var11;
                            return true;
                        }
                    } else if (arg1.method2640(arg7, arg6, 2, -123, var11, arg0, arg10, 2, arg2, var12)) {
                        class767.field10596 = var11;
                        class689.field9749 = var12;
                        return true;
                    }
                } else if (class509.method2977(2, 2, arg6, var12, arg0, arg7, false, arg10, var11)) {
                    class689.field9749 = var12;
                    class767.field10596 = var11;
                    return true;
                }
            } else if (~arg7 == ~var11 && ~arg10 == ~var12) {
                class689.field9749 = var12;
                class767.field10596 = var11;
                return true;
            }
            int var25 = class298.field4492[var21][var20] + 1;
            if (var21 > 0 && class614.field8676[var21 + -1][var20] == 0 && (1134821376 & var19[var22 + -1][var23]) == 0 && (var19[var22 - 1][var23 - -1] & 1310982144) == 0) {
                class696.field9832[var26] = var11 + -1;
                class58.field822[var26] = var12;
                class614.field8676[var21 + -1][var20] = 2;
                var26 = 4095 & var26 + 1;
                class298.field4492[var21 - 1][var20] = var25;
            }
            if (~var21 > -127 && class614.field8676[var21 + 1][var20] == 0 && ~(1625554944 & var19[var22 + 2][var23]) == -1 && (var19[var22 + 2][var23 + 1] & 2015625216) == 0) {
                class696.field9832[var26] = var11 + 1;
                class58.field822[var26] = var12;
                var26 = 4095 & var26 + 1;
                class614.field8676[var21 - -1][var20] = 8;
                class298.field4492[var21 - -1][var20] = var25;
            }
            if (var20 > 0 && ~class614.field8676[var21][var20 + -1] == -1 && (1134821376 & var19[var22][var23 + -1]) == 0 && ~(1625554944 & var19[var22 - -1][var23 + -1]) == -1) {
                class696.field9832[var26] = var11;
                class58.field822[var26] = var12 + -1;
                class614.field8676[var21][var20 + -1] = 1;
                var26 = var26 - -1 & 4095;
                class298.field4492[var21][var20 + -1] = var25;
            }
            if (~var20 > -127 && ~class614.field8676[var21][var20 - -1] == -1 && ~(var19[var22][var23 - -2] & 1310982144) == -1 && (var19[var22 - -1][var23 - -2] & 2015625216) == 0) {
                class696.field9832[var26] = var11;
                class58.field822[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class614.field8676[var21][var20 + 1] = 4;
                class298.field4492[var21][var20 + 1] = var25;
            }
            if (~var21 < -1 && ~var20 < -1 && ~class614.field8676[var21 - 1][var20 - 1] == -1 && (var19[var22 + -1][var23] & 1336147968) == 0 && ~(var19[var22 + -1][var23 - 1] & 1134821376) == -1 && ~(1675886592 & var19[var22][var23 + -1]) == -1) {
                class696.field9832[var26] = var11 - 1;
                class58.field822[var26] = var12 - 1;
                class614.field8676[var21 + -1][var20 - 1] = 3;
                var26 = var26 + 1 & 4095;
                class298.field4492[var21 + -1][var20 + -1] = var25;
            }
            if (~var21 > -127 && var20 > 0 && class614.field8676[var21 + 1][var20 + -1] == 0 && (1675886592 & var19[var22 + 1][var23 + -1]) == 0 && (1625554944 & var19[var22 + 2][var23 + -1]) == 0 && ~(2028208128 & var19[var22 + 2][var23]) == -1) {
                class696.field9832[var26] = var11 + 1;
                class58.field822[var26] = var12 + -1;
                class614.field8676[var21 - -1][var20 + -1] = 9;
                var26 = var26 - -1 & 4095;
                class298.field4492[var21 + 1][var20 + -1] = var25;
            }
            if (~var21 < -1 && var20 < 126 && ~class614.field8676[var21 + -1][var20 + 1] == -1 && (var19[var22 + -1][var23 + 1] & 1336147968) == 0 && ~(1310982144 & var19[var22 + -1][var23 + 2]) == -1 && (var19[var22][var23 + 2] & 2116288512) == 0) {
                class696.field9832[var26] = var11 + -1;
                class58.field822[var26] = var12 + 1;
                var26 = 4095 & var26 - -1;
                class614.field8676[var21 - 1][var20 + 1] = 6;
                class298.field4492[var21 + -1][var20 + 1] = var25;
            }
            if (~var21 > -127 && var20 < 126 && ~class614.field8676[var21 + 1][var20 + 1] == -1 && (2116288512 & var19[var22 + 1][var23 + 2]) == 0 && ~(2015625216 & var19[var22 + 2][var23 + 2]) == -1 && (2028208128 & var19[var22 + 2][var23 - -1]) == 0) {
                class696.field9832[var26] = var11 - -1;
                class58.field822[var26] = var12 - -1;
                class614.field8676[var21 - -1][var20 + 1] = 12;
                var26 = 4095 & var26 - -1;
                class298.field4492[var21 - -1][var20 - -1] = var25;
            }
        }
        class767.field10596 = var11;
        class689.field9749 = var12;
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZI)I")
    private final int method3699(int arg0, boolean arg1, int arg2) {
        ++field9113;
        int var4 = arg0 - -(arg2 * 57);
        if (!arg1) {
            return 16;
        } else {
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field9109;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (arg1 != 4095) {
            method3696(77);
        }
        if (super.field10405.field8923) {
            int var4 = class619.field8728[arg0];
            for (int var5 = 0; class673.field9452 > var5; ++var5) {
                var3[var5] = this.method3699(class179.field2708[var5], true, var4) % 4096;
            }
        }
        return var3;
    }
}
