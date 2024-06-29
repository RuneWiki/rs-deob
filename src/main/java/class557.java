import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class557 extends class741 {

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Z")
    private boolean field7824 = false;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "[F")
    private float[] field7827 = new float[4];

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "Leca;")
    private class356 field7837;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Leca;")
    private class356 field7819;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "Leca;")
    private class356 field7832;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "Leca;")
    private class356 field7831;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Z")
    private boolean field7818;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lbw;")
    private class28 field7821;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "Lwd;")
    public static class179 field7839 = new class179();

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "Z")
    private boolean field7834;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Z")
    private boolean field7835;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZIIIILsn;IIII)Z", line = 3)
    public static final boolean method3278(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class739 arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field7828;
        int var12 = arg6;
        int var13 = arg10;
        byte var14 = 64;
        if (!arg2) {
            field7839 = null;
        }
        byte var15 = 64;
        int var16 = arg6 - var14;
        class135.field1727[var14][var15] = 99;
        int var17 = arg10 - var15;
        class666.field9358[var14][var15] = 0;
        byte var18 = 0;
        class723.field10017[var18] = arg6;
        int var19 = 0;
        int var35 = var18 + 1;
        class663.field9330[var18] = arg10;
        int[][] var20 = arg7.field10184;
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
                                if (~var35 == ~var19) {
                                    class730.field10104 = var12;
                                    class386.field5509 = var13;
                                    return false;
                                }
                                var13 = class663.field9330[var19];
                                var12 = class723.field10017[var19];
                                var21 = -var16 + var12;
                                var22 = -var17 + var13;
                                var19 = 4095 & var19 + 1;
                                var23 = var12 - arg7.field10176;
                                var24 = -arg7.field10196 + var13;
                                if (~arg1 != 3) {
                                    if (arg1 != -3) {
                                        if (~arg1 != 1) {
                                            if (arg1 != -1) {
                                                if (~arg1 != -1 && arg1 != 1 && ~arg1 != -3 && arg1 != 3 && ~arg1 != -10) {
                                                    if (arg7.method4087(arg8, var12, arg1, arg0, var13, arg9, (byte) 104, arg3)) {
                                                        class730.field10104 = var12;
                                                        class386.field5509 = var13;
                                                        return true;
                                                    }
                                                } else if (arg7.method4090(arg3, var13, arg9, arg8, arg1, 32768, var12, arg0)) {
                                                    class386.field5509 = var13;
                                                    class730.field10104 = var12;
                                                    return true;
                                                }
                                            } else if (arg7.method4097(var13, var12, arg11, arg8, arg3, 87, arg4, arg5, arg0)) {
                                                class386.field5509 = var13;
                                                class730.field10104 = var12;
                                                return true;
                                            }
                                        } else if (arg7.method4093(arg3, arg4, arg8, var12, arg5, arg8, (byte) -33, arg0, arg11, var13)) {
                                            class730.field10104 = var12;
                                            class386.field5509 = var13;
                                            return true;
                                        }
                                    } else if (class615.method3550(arg8, var13, arg3, 116, arg11, arg8, arg0, arg4, var12)) {
                                        class386.field5509 = var13;
                                        class730.field10104 = var12;
                                        return true;
                                    }
                                } else if (arg0 == var12 && arg3 == var13) {
                                    class386.field5509 = var13;
                                    class730.field10104 = var12;
                                    return true;
                                }
                                var26 = class666.field9358[var21][var22] + 1;
                                if (~var21 < -1 && ~class135.field1727[var21 - 1][var22] == -1 && ~(var20[var23 + -1][var24] & 1134821376) == -1 && (1310982144 & var20[var23 + -1][arg8 + var24 - 1]) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (~var27 <= ~(arg8 + -1)) {
                                            class723.field10017[var35] = var12 - 1;
                                            class663.field9330[var35] = var13;
                                            var35 = 4095 & var35 + 1;
                                            class135.field1727[var21 + -1][var22] = 2;
                                            class666.field9358[var21 + -1][var22] = var26;
                                            break;
                                        }
                                        if (~(1336147968 & var20[var23 + -1][var24 + var27]) != -1) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (128 - arg8 > var21 && class135.field1727[var21 - -1][var22] == 0 && (1625554944 & var20[var23 - -arg8][var24]) == 0 && (var20[arg8 + var23][arg8 + var24 - 1] & 2015625216) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg8 + -1 <= var28) {
                                            class723.field10017[var35] = var12 + 1;
                                            class663.field9330[var35] = var13;
                                            var35 = 4095 & var35 - -1;
                                            class135.field1727[var21 + 1][var22] = 8;
                                            class666.field9358[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((2028208128 & var20[var23 - -arg8][var24 - -var28]) != 0) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (var22 > 0 && class135.field1727[var21][var22 - 1] == 0 && ~(1134821376 & var20[var23][var24 + -1]) == -1 && (1625554944 & var20[arg8 + -1 + var23][var24 + -1]) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (~var29 <= ~(arg8 + -1)) {
                                            class723.field10017[var35] = var12;
                                            class663.field9330[var35] = var13 + -1;
                                            class135.field1727[var21][var22 + -1] = 1;
                                            var35 = var35 + 1 & 4095;
                                            class666.field9358[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if (~(1675886592 & var20[var23 + var29][var24 + -1]) != -1) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~var22 > ~(-arg8 + 128) && ~class135.field1727[var21][var22 + 1] == -1 && ~(var20[var23][arg8 + var24] & 1310982144) == -1 && (var20[var23 + -1 + arg8][var24 - -arg8] & 2015625216) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg8 + -1) {
                                            class723.field10017[var35] = var12;
                                            class663.field9330[var35] = var13 + 1;
                                            var35 = 4095 & var35 + 1;
                                            class135.field1727[var21][var22 - -1] = 4;
                                            class666.field9358[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if (~(2116288512 & var20[var23 + var30][arg8 + var24]) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (~var21 < -1 && var22 > 0 && class135.field1727[var21 + -1][var22 + -1] == 0 && (1134821376 & var20[var23 + -1][var24 + -1]) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (~var31 <= ~arg8) {
                                            class723.field10017[var35] = var12 + -1;
                                            class663.field9330[var35] = var13 + -1;
                                            var35 = var35 + 1 & 4095;
                                            class135.field1727[var21 + -1][var22 + -1] = 3;
                                            class666.field9358[var21 + -1][var22 + -1] = var26;
                                            break;
                                        }
                                        if (~(1336147968 & var20[var23 + -1][var24 + -1 - -var31]) != -1 || ~(var20[var23 + -1 + var31][var24 + -1] & 1675886592) != -1) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (~var21 > ~(-arg8 + 128) && var22 > 0 && ~class135.field1727[var21 - -1][var22 + -1] == -1 && (var20[arg8 + var23][var24 + -1] & 1625554944) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg8 <= var32) {
                                            class723.field10017[var35] = var12 + 1;
                                            class663.field9330[var35] = var13 - 1;
                                            class135.field1727[var21 + 1][var22 + -1] = 9;
                                            var35 = var35 + 1 & 4095;
                                            class666.field9358[var21 + 1][var22 + -1] = var26;
                                            break;
                                        }
                                        if ((2028208128 & var20[arg8 + var23][var24 + var32 - 1]) != 0 || (1675886592 & var20[var23 + var32][var24 + -1]) != 0) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (~var21 < -1 && var22 < -arg8 + 128 && class135.field1727[var21 - 1][var22 + 1] == 0 && (var20[var23 + -1][arg8 + var24] & 1310982144) == 0) {
                                    for (int var33 = 1; ~var33 > ~arg8; ++var33) {
                                        if (~(1336147968 & var20[var23 + -1][var24 + var33]) != -1 || ~(var20[var23 + -1 + var33][arg8 + var24] & 2116288512) != -1) {
                                            continue label263;
                                        }
                                    }
                                    class723.field10017[var35] = var12 + -1;
                                    class663.field9330[var35] = var13 - -1;
                                    var35 = 4095 & var35 + 1;
                                    class135.field1727[var21 + -1][var22 + 1] = 6;
                                    class666.field9358[var21 + -1][var22 + 1] = var26;
                                }
                            } while (~var21 <= ~(-arg8 + 128));
                        } while (var22 >= -arg8 + 128);
                    } while (~class135.field1727[var21 + 1][var22 - -1] != -1);
                } while (~(var20[arg8 + var23][arg8 + var24] & 2015625216) != -1);
                for (int var34 = 1; ~arg8 < ~var34; ++var34) {
                    if ((var20[var23 + var34][var24 - -arg8] & 2116288512) != 0 || (var20[arg8 + var23][var24 + var34] & 2028208128) != 0) {
                        continue label286;
                    }
                }
                class723.field10017[var35] = var12 + 1;
                class663.field9330[var35] = var13 - -1;
                var35 = var35 + 1 & 4095;
                class135.field1727[var21 + 1][var22 + 1] = 12;
                class666.field9358[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V", line = 434)
    public final void method434(int arg0) {
        super.field10209.method1473(1, (byte) 112);
        ++field7838;
        super.field10209.method1492((class34) null, 2);
        super.field10209.method1494(class785.field10763, 775, class785.field10763);
        super.field10209.method1409(class157.field2039, 0, -124);
        super.field10209.method1409(class41.field423, 2, -109);
        int var2 = 106 / ((10 - arg0) / 44);
        super.field10209.method1455(0, -3, class157.field2039);
        super.field10209.method1473(0, (byte) 32);
        if (this.field7824) {
            super.field10209.method1409(class157.field2039, 0, -111);
            super.field10209.method1455(0, -3, class157.field2039);
            this.field7824 = false;
        }
        if (this.field7834) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field7834 = false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V", line = 466)
    public static void method3279(int arg0) {
        if (arg0 != 34336) {
            field7839 = null;
        }
        field7839 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILml;)V", line = 480)
    public final void method433(int arg0, int arg1, class34 arg2) {
        ++field7820;
        if (arg0 != -1) {
            this.field7835 = true;
        }
        if (arg2 != null) {
            if (this.field7824) {
                super.field10209.method1409(class157.field2039, 0, -107);
                super.field10209.method1455(0, -3, class157.field2039);
                this.field7824 = false;
            }
            super.field10209.method1492(arg2, 2);
            super.field10209.method1509(arg0 ^ -5, arg1);
        } else if (!this.field7824) {
            super.field10209.method1492(super.field10209.field3346, 2);
            super.field10209.method1509(4, 1);
            super.field10209.method1409(class224.field3416, 0, -110);
            super.field10209.method1455(0, -3, class224.field3416);
            this.field7824 = true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V", line = 518)
    public final void method430(int arg0, boolean arg1) {
        if (arg0 <= 96) {
            field7839 = null;
        }
        ++field7822;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z", line = 532)
    public final boolean method425(byte arg0) {
        ++field7823;
        if (arg0 >= -37) {
            this.field7832 = null;
        }
        return this.field7818;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BZ)V", line = 544)
    public final void method429(byte arg0, boolean arg1) {
        this.field7835 = arg1;
        ++field7826;
        super.field10209.method1473(1, (byte) 16);
        super.field10209.method1492(this.field7821, 2);
        if (arg0 > 15) {
            super.field10209.method1494(class495.field6817, 775, class92.field1073);
            super.field10209.method1409(class41.field423, 0, -123);
            super.field10209.method1469(false, 2, false, class157.field2039, true);
            super.field10209.method1455(0, -3, class224.field3416);
            super.field10209.method1473(0, (byte) 50);
            this.method1950((byte) 122);
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V", line = 564)
    public final void method1950(byte arg0) {
        ++field7833;
        int var2 = super.field10209.method1457(1);
        class517 var3 = super.field10209.method1399(0);
        if (this.field7835) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field7819.field5135 : this.field7831.field5135);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field7837.field5135 : this.field7832.field5135);
        }
        OpenGL.glEnable(34336);
        if (arg0 >= 104) {
            this.field7834 = true;
            var3.method3076(0.0F, 0.0F, -1.0F, true, this.field7827, (float) var2);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field7827[0], this.field7827[1], this.field7827[2], this.field7827[3]);
            this.method424(-122);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V", line = 593)
    public final void method432(int arg0, int arg1, int arg2) {
        int var4 = 32 / ((-18 - arg2) / 51);
        ++field7836;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 602)
    public static final void method3280(String arg0, String arg1, int arg2) {
        if (arg2 != -25400) {
            method3281(40, -50);
        }
        class284.field4094 = -1;
        ++field7829;
        class531.field7316 = 1;
        class115.method837(arg1, false, arg0, -3);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Loaa;Lae;)V", line = 618)
    public class557(class556 arg0, class283 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field7812) {
            this.field7837 = class363.method2285(arg0, 34336, arg1.method1861(true, "gl", "uw_ground_unlit"), -750);
            this.field7819 = class363.method2285(arg0, 34336, arg1.method1861(true, "gl", "uw_ground_lit"), -750);
            this.field7832 = class363.method2285(arg0, 34336, arg1.method1861(true, "gl", "uw_model_unlit"), -750);
            this.field7831 = class363.method2285(arg0, 34336, arg1.method1861(true, "gl", "uw_model_lit"), -750);
            if (!(this.field7832 != null & this.field7837 != null & this.field7819 != null & this.field7831 != null)) {
                this.field7818 = false;
            } else {
                this.field7821 = super.field10209.method1447((byte) -60, 1, 2, false, new int[] { 0, -1 });
                this.field7821.method129(false, true, false);
                this.field7818 = true;
            }
        } else {
            this.field7818 = false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 648)
    public final void method424(int arg0) {
        ++field7830;
        if (arg0 > -3) {
            this.field7824 = true;
        }
        if (this.field7834) {
            int var2 = super.field10209.method177();
            int var3 = super.field10209.method241();
            float var4 = (float) var2 - (float) (var2 - var3) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field10209.method1454(0), (float) super.field10209.method1387(-58) / 255.0F);
            super.field10209.method1473(1, (byte) 36);
            super.field10209.method1468((byte) 67, super.field10209.method1439(3));
            super.field10209.method1473(0, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z", line = 679)
    public static final boolean method3281(int arg0, int arg1) {
        ++field7825;
        if (arg0 != 18 && arg0 != 10 && arg0 != 16 && ~arg0 != -22 && arg0 != 9) {
            if (arg0 != 46 && arg0 != 1011) {
                int var2 = 97 % ((arg1 - -52) / 47);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
