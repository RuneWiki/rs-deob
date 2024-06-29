import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class500 extends class136 {

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    private int field7417 = 32768;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "Lgk;")
    public static class331 field7411 = new class331("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "Z")
    public static boolean field7415 = false;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "Lbg;")
    public static class324 field7419;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "F")
    public static float field7421;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "Lqd;")
    public static class312 field7422;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field7416;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = 42 % ((arg0 - 67) / 50);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1, 1, 0);
            int[] var6 = this.method1033(arg1, 2, 0);
            for (int var7 = 0; ~var7 > ~class467.field6889; ++var7) {
                int var8 = (4081 & var5[var7]) >> 4;
                int var9 = var6[var7] * this.field7417 >> 12;
                int var10 = class25.field297[var8] * var9 >> 12;
                int var11 = class489.field7187[var8] * var9 >> 12;
                int var12 = (var10 >> 12) + var7 & class166.field2356;
                int var13 = class519.field7637 & (var11 >> 12) + arg1;
                int[] var14 = this.method1033(var13, 0, 0);
                var3[var7] = var14[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field1966 = arg2.method577(255) == 1;
            }
        } else {
            this.field7417 = arg2.method623((byte) 84) << 4;
        }
        if (arg0 != 4) {
            this.method272((byte) 85, -90);
        }
        ++field7412;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
    public class500() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIILsd;IIIIII)Z")
    public static final boolean method2995(int arg0, int arg1, int arg2, int arg3, int arg4, class62 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field7410;
        int var12 = arg4;
        int var13 = arg7;
        if (arg0 != -1) {
            field7411 = null;
        }
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        int var17 = -var15 + arg7;
        class106.field1467[var14][var15] = 99;
        class445.field6584[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class424.field6262[var18] = arg4;
        int var35 = var18 + 1;
        class342.field4737[var18] = arg7;
        int[][] var20 = arg5.field721;
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
                                    class370.field5493 = var12;
                                    class474.field6988 = var13;
                                    return false;
                                }
                                var12 = class424.field6262[var19];
                                var13 = class342.field4737[var19];
                                var21 = var13 - var17;
                                var22 = -var16 + var12;
                                var19 = var19 - -1 & 4095;
                                var23 = -arg5.field728 + var12;
                                var24 = -arg5.field733 + var13;
                                if (~arg11 != 3) {
                                    if (arg11 != -3) {
                                        if (~arg11 != 1) {
                                            if (~arg11 != 0) {
                                                if (arg11 != 0 && ~arg11 != -2 && arg11 != 2 && ~arg11 != -4 && arg11 != 9) {
                                                    if (arg5.method564(arg10, var12, false, arg11, arg1, var13, arg6, arg9)) {
                                                        class370.field5493 = var12;
                                                        class474.field6988 = var13;
                                                        return true;
                                                    }
                                                } else if (arg5.method557(var13, arg10, arg6, arg9, var12, false, arg1, arg11)) {
                                                    class474.field6988 = var13;
                                                    class370.field5493 = var12;
                                                    return true;
                                                }
                                            } else if (arg5.method555(arg8, arg9, arg1, arg3, arg2, arg6, var12, arg0 ^ -125, var13)) {
                                                class474.field6988 = var13;
                                                class370.field5493 = var12;
                                                return true;
                                            }
                                        } else if (arg5.method559(arg1, arg0 + 1, arg9, arg2, var12, arg3, arg6, var13, arg8, arg9)) {
                                            class370.field5493 = var12;
                                            class474.field6988 = var13;
                                            return true;
                                        }
                                    } else if (class38.method385(arg9, arg6, arg9, arg2, arg8, var13, var12, arg1, (byte) 119)) {
                                        class370.field5493 = var12;
                                        class474.field6988 = var13;
                                        return true;
                                    }
                                } else if (~arg1 == ~var12 && arg6 == var13) {
                                    class474.field6988 = var13;
                                    class370.field5493 = var12;
                                    return true;
                                }
                                var26 = class445.field6584[var22][var21] - -1;
                                if (var22 > 0 && ~class106.field1467[var22 + -1][var21] == -1 && (1134821376 & var20[var23 - 1][var24]) == 0 && ~(1310982144 & var20[var23 - 1][var24 + -1 + arg9]) == -1) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg9 + -1) {
                                            class424.field6262[var35] = var12 - 1;
                                            class342.field4737[var35] = var13;
                                            class106.field1467[var22 + -1][var21] = 2;
                                            var35 = var35 + 1 & 4095;
                                            class445.field6584[var22 + -1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + -1][var24 - -var27] & 1336147968) != 0) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (var22 < -arg9 + 128 && class106.field1467[var22 - -1][var21] == 0 && (var20[arg9 + var23][var24] & 1625554944) == 0 && ~(var20[arg9 + var23][var24 - (-arg9 - -1)] & 2015625216) == -1) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg9 + -1) {
                                            class424.field6262[var35] = var12 - -1;
                                            class342.field4737[var35] = var13;
                                            class106.field1467[var22 + 1][var21] = 8;
                                            var35 = 4095 & var35 + 1;
                                            class445.field6584[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - -arg9][var24 + var28] & 2028208128) != 0) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (~var21 < -1 && ~class106.field1467[var22][var21 + -1] == -1 && (var20[var23][var24 - 1] & 1134821376) == 0 && (1625554944 & var20[arg9 + var23 + -1][var24 + -1]) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var29) {
                                            class424.field6262[var35] = var12;
                                            class342.field4737[var35] = var13 - 1;
                                            class106.field1467[var22][var21 + -1] = 1;
                                            var35 = var35 + 1 & 4095;
                                            class445.field6584[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((1675886592 & var20[var23 + var29][var24 + -1]) != 0) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~var21 > ~(-arg9 + 128) && class106.field1467[var22][var21 + 1] == 0 && (var20[var23][arg9 + var24] & 1310982144) == 0 && ~(var20[arg9 + var23 + -1][arg9 + var24] & 2015625216) == -1) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var30) {
                                            class424.field6262[var35] = var12;
                                            class342.field4737[var35] = var13 - -1;
                                            class106.field1467[var22][var21 + 1] = 4;
                                            var35 = 4095 & var35 + 1;
                                            class445.field6584[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if (~(2116288512 & var20[var23 + var30][arg9 + var24]) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (~var22 < -1 && ~var21 < -1 && class106.field1467[var22 + -1][var21 + -1] == 0 && ~(var20[var23 - 1][var24 - 1] & 1134821376) == -1) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg9 <= var31) {
                                            class424.field6262[var35] = var12 + -1;
                                            class342.field4737[var35] = var13 + -1;
                                            class106.field1467[var22 + -1][var21 + -1] = 3;
                                            var35 = 4095 & var35 + 1;
                                            class445.field6584[var22 + -1][var21 + -1] = var26;
                                            break;
                                        }
                                        if ((1336147968 & var20[var23 + -1][var24 + -1 - -var31]) != 0 || (var20[var23 + -1 - -var31][var24 - 1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (~var22 > ~(-arg9 + 128) && ~var21 < -1 && class106.field1467[var22 + 1][var21 + -1] == 0 && ~(var20[var23 - -arg9][var24 - 1] & 1625554944) == -1) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg9 <= var32) {
                                            class424.field6262[var35] = var12 - -1;
                                            class342.field4737[var35] = var13 + -1;
                                            var35 = 4095 & var35 + 1;
                                            class106.field1467[var22 + 1][var21 + -1] = 9;
                                            class445.field6584[var22 + 1][var21 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - -arg9][var24 + -1 + var32] & 2028208128) != 0 || (var20[var23 - -var32][var24 + -1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (~var22 < -1 && -arg9 + 128 > var21 && ~class106.field1467[var22 + -1][var21 - -1] == -1 && (1310982144 & var20[var23 + -1][var24 - -arg9]) == 0) {
                                    for (int var33 = 1; ~arg9 < ~var33; ++var33) {
                                        if (~(1336147968 & var20[var23 + -1][var24 + var33]) != -1 || (2116288512 & var20[var23 + -1 - -var33][arg9 + var24]) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class424.field6262[var35] = var12 + -1;
                                    class342.field4737[var35] = var13 + 1;
                                    var35 = var35 - -1 & 4095;
                                    class106.field1467[var22 - 1][var21 - -1] = 6;
                                    class445.field6584[var22 + -1][var21 - -1] = var26;
                                }
                            } while (-arg9 + 128 <= var22);
                        } while (-arg9 + 128 <= var21);
                    } while (~class106.field1467[var22 + 1][var21 + 1] != -1);
                } while ((var20[arg9 + var23][arg9 + var24] & 2015625216) != 0);
                for (int var34 = 1; ~var34 > ~arg9; ++var34) {
                    if ((2116288512 & var20[var23 + var34][arg9 + var24]) != 0 || (var20[arg9 + var23][var24 - -var34] & 2028208128) != 0) {
                        continue label286;
                    }
                }
                class424.field6262[var35] = var12 - -1;
                class342.field4737[var35] = var13 + 1;
                class106.field1467[var22 + 1][var21 + 1] = 12;
                var35 = 4095 & var35 + 1;
                class445.field6584[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        if (!arg0) {
            ++field7413;
            class156.method1112(true);
        }
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V")
    public static void method2996(int arg0) {
        field7411 = null;
        field7419 = null;
        field7422 = null;
        if (arg0 != 1675886592) {
            field7415 = false;
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)V")
    public static final void method2997(byte arg0) {
        ++field7420;
        class380.field5611.method1119(75);
        class93.field1272.method1119(99);
        class229.field3358.method1119(119);
        class452.field6648.method1119(107);
        if (arg0 <= 7) {
            method2996(49);
        }
        class358.field4979.method1119(91);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        ++field7414;
        int[][] var3 = super.field1952.method3127((byte) 126, arg1);
        if (super.field1952.field7770) {
            int[] var4 = this.method1033(arg1, 1, 0);
            int[] var5 = this.method1033(arg1, 2, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class467.field6889; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field7417 >> 12;
                int var12 = class25.field297[var10] * var11 >> 12;
                int var13 = class489.field7187[var10] * var11 >> 12;
                int var14 = class166.field2356 & (var12 >> 12) + var9;
                int var15 = class519.field7637 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1036(3, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 < 33) {
            method2995(5, -16, -89, 35, 67, (class62) null, 31, 94, -60, -10, -34, 98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IB)V")
    public static final void method2998(int arg0, byte arg1) {
        ++field7418;
        class215 var2 = class171.method1208(arg0, (byte) 118, 14);
        if (arg1 == -5) {
            var2.method1469((byte) -118);
        }
    }

    static {
        new class331(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field7419 = new class324(19, 6);
        new class331("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }
}
