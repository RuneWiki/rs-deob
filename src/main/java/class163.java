import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class163 extends class535 {

    @OriginalMember(owner = "client!ig", name = "Cc", descriptor = "I")
    public int field2604 = -1;

    @OriginalMember(owner = "client!ig", name = "Nc", descriptor = "I")
    public int field2615 = -1;

    @OriginalMember(owner = "client!ig", name = "Qc", descriptor = "[Ljava/lang/String;")
    public static String[] field2618;

    @OriginalMember(owner = "client!ig", name = "yc", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ig", name = "zc", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ig", name = "Ac", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ig", name = "Bc", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ig", name = "Dc", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ig", name = "Ec", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ig", name = "Fc", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ig", name = "Gc", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ig", name = "Hc", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ig", name = "Ic", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ig", name = "Jc", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ig", name = "Kc", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ig", name = "Mc", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ig", name = "Oc", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ig", name = "Pc", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ig", name = "Rc", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ig", name = "Sc", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ig", name = "Lc", descriptor = "Lsh;")
    public class51 field2613;

    static {
        new class309("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field2618 = new String[100];
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lza;I)Lnd;", line = 5)
    public final class385 method15(class288 arg0, int arg1) {
        ++field2619;
        if (this.field2613 != null && this.method1160((byte) 124, 2048, arg0)) {
            class124 var3 = arg0.method364();
            int var4 = super.field7814.method3100((byte) -101);
            var3.method832(var4);
            var3.method834(super.field6073, super.field6083, super.field6078);
            class166 var5 = this.method3169((byte) 23);
            class51 var6 = this.field2613.field1038 == null ? this.field2613 : this.field2613.method475(class402.field6080, arg1 ^ -3);
            if (class186.field2990.field2540 && var6.field1044 && var5.field2657) {
                class57 var7 = ~super.field7768 != 0 && ~super.field7815 == -1 ? class422.field6355.method236(super.field7768, (byte) 120) : null;
                class57 var8 = super.field7800 == -1 || super.field7781 && var7 != null ? null : class422.field6355.method236(super.field7800, (byte) 111);
                int var9 = 0;
                if (~super.field7822 != -1) {
                    var9 = this.method3165((byte) 123);
                }
                class374 var10 = class264.method1688(this.field2613.field1029 & 255, this.field2613.field1061 & 255, var8 == null ? var7 : var8, this.field2613.field1050, super.field7785, var4, arg0, false, super.field7867[0], super.field7857, 65535 & this.field2613.field1067, var9, var8 != null ? super.field7826 : super.field7793, 65535 & this.field2613.field1054, super.field7850);
                if (var10 != null) {
                    float var11 = arg0.method431();
                    float var12 = arg0.method417();
                    arg0.method273(false);
                    arg0.method385(var11, var12 + -150.0F);
                    var10.method723(var3, (class313) null, 0);
                    arg0.method385(var11, var12);
                    arg0.method273(true);
                }
            }
            class385 var13 = null;
            if (this.method1162(false)) {
                var13 = class497.method3001(super.field7867.length, false);
            }
            if (super.field7865 != null) {
                class502 var14 = super.field7865.method490();
                arg0.method393(super.field7867, var14, var3, var13 == null ? null : var13.field5620, 0);
            } else {
                arg0.method389(super.field7867, var3, var13 == null ? null : var13.field5620, 0);
            }
            this.method3163(0, false, super.field7867, arg0);
            if (super.field7867[arg1] != null) {
                if (~var4 != -1) {
                    super.field7867[2].method769(var4);
                }
                super.field7867[2].method730(-super.field7868.field6491 + super.field6073, -super.field7868.field6482 + super.field6083, -super.field7868.field6478 + super.field6078);
            }
            super.field7867[0] = super.field7867[1] = super.field7867[2] = super.field7867[3] = null;
            super.field7775 = class184.field2958;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZBIIII)V", line = 86)
    public final void method1153(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field6084 = (byte) arg5;
        ++field2600;
        if (~super.field7768 != 0 && ~class422.field6355.method236(super.field7768, (byte) 101).field1200 == -2) {
            super.field7768 = -1;
        }
        if (~super.field7843 != 0) {
            class533 var7 = class514.field7469.method595(-12186, super.field7843);
            if (var7.field7738 && ~var7.field7734 != 0 && class422.field6355.method236(var7.field7734, (byte) -127).field1200 == 1) {
                super.field7843 = -1;
            }
        }
        if (~super.field7836 != 0) {
            class533 var8 = class514.field7469.method595(-12186, super.field7836);
            if (var8.field7738 && var8.field7734 != -1 && ~class422.field6355.method236(var8.field7734, (byte) 119).field1200 == -2) {
                super.field7836 = -1;
            }
        }
        if (!arg0) {
            int var9 = -super.field7866[0] + arg2;
            int var10 = -super.field7870[0] + arg4;
            if (var9 >= -8 && ~var9 >= -9 && ~var10 <= 7 && var10 <= 8) {
                if (~super.field7863 > -10) {
                    ++super.field7863;
                }
                for (int var11 = super.field7863; ~var11 < -1; --var11) {
                    super.field7866[var11] = super.field7866[var11 + -1];
                    super.field7870[var11] = super.field7870[var11 + -1];
                    super.field7864[var11] = super.field7864[var11 + -1];
                }
                super.field7866[0] = arg2;
                super.field7870[0] = arg4;
                super.field7864[0] = 1;
                return;
            }
        }
        super.field7872 = 0;
        super.field7866[0] = arg2;
        super.field7863 = 0;
        super.field7873 = 0;
        super.field7870[0] = arg4;
        if (arg1 > 1) {
            super.field6078 = (super.field7870[0] << 7) + (arg3 << 6);
            super.field6073 = (super.field7866[0] << 7) - -(arg3 << 6);
            if (super.field7865 != null) {
                super.field7865.method495();
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I", line = 167)
    public final int method1154(int arg0) {
        ++field2601;
        if (this.field2613.field1038 != null) {
            class51 var2 = this.field2613.method475(class402.field6080, -1);
            if (var2 != null && var2.field1079 != -1) {
                return var2.field1079;
            }
        }
        if (arg0 < 124) {
            field2618 = null;
        }
        return this.field2613.field1079;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I", line = 187)
    public final int method1155(int arg0) {
        ++field2603;
        if (this.field2613.field1038 != null) {
            class51 var2 = this.field2613.method475(class402.field6080, -1);
            if (var2 != null && ~var2.field1082 != 0) {
                return var2.field1082;
            }
        }
        if (arg0 > -82) {
            this.method18(-45, (byte) 66, 25, (class421) null, (class288) null, true, 39);
        }
        return this.field2613.field1082;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)I", line = 207)
    public final int method1156(byte arg0) {
        ++field2620;
        if (arg0 > -51) {
            this.method8(35);
        }
        if (this.field2613.field1038 != null) {
            class51 var2 = this.field2613.method475(class402.field6080, -1);
            if (var2 != null && var2.field1066 != -1) {
                return var2.field1066;
            }
        }
        return this.field2613.field1066 != -1 ? this.field2613.field1066 : super.method1156((byte) -104);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLza;II)Z", line = 228)
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        ++field2609;
        if (this.field2613 != null && this.method1160((byte) 109, 131072, arg1)) {
            class124 var5 = arg1.method364();
            int var6 = super.field7814.method3100((byte) -115);
            var5.method832(var6);
            var5.method834(super.field6073, super.field6083, super.field6078);
            boolean var7 = arg0;
            for (int var8 = 0; ~var8 > ~super.field7867.length; ++var8) {
                if (super.field7867[var8] != null && super.field7867[var8].method763(arg3, arg2, var5, this.field2613.field1050 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field7867[0] = super.field7867[1] = super.field7867[2] = super.field7867[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "(I)Z", line = 263)
    public final boolean method1157(int arg0) {
        if (arg0 <= 85) {
            field2618 = null;
        }
        ++field2608;
        return this.field2613 != null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBILvs;Lza;ZI)V", line = 284)
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        if (arg1 == 93) {
            ++field2605;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)I", line = 299)
    public final int method8(int arg0) {
        if (arg0 != 0) {
            method1158(0);
        }
        ++field2610;
        return super.field7812;
    }

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "(I)V", line = 310)
    public static void method1158(int arg0) {
        field2618 = null;
        if (arg0 != 0) {
            field2618 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z", line = 320)
    public final boolean method19(byte arg0) {
        ++field2616;
        if (arg0 <= 121) {
            this.method1154(-109);
        }
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILsh;)V", line = 331)
    public final void method1159(int arg0, class51 arg1) {
        ++field2602;
        this.field2613 = arg1;
        if (super.field7865 != null) {
            super.field7865.method495();
        }
        if (arg0 != 0) {
            this.method1156((byte) -13);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BILza;)Z", line = 355)
    private final boolean method1160(byte arg0, int arg1, class288 arg2) {
        ++field2606;
        int var4 = arg1;
        class166 var5 = this.method3169((byte) 23);
        class57 var6 = super.field7768 != -1 && ~super.field7815 == -1 ? class422.field6355.method236(super.field7768, (byte) -99) : null;
        class57 var7 = super.field7800 == -1 || super.field7781 && var6 != null ? null : class422.field6355.method236(super.field7800, (byte) 67);
        if (arg0 <= 108) {
            this.method1160((byte) 119, 74, (class288) null);
        }
        int var8 = var5.field2672;
        int var9 = var5.field2641;
        if (var8 != 0 || var9 != 0 || ~var5.field2661 != -1 || var5.field2679 != 0) {
            arg1 |= 7;
        }
        boolean var10 = super.field7851 != 0 && super.field7776 <= class62.field1268 && ~class62.field1268 > ~super.field7828;
        if (var10) {
            arg1 |= 524288;
        }
        class374 var11 = super.field7867[0] = this.field2613.method473(arg1, super.field7793, var6, class402.field6080, super.field7772, var7, class452.field6708, class422.field6355, super.field7783, arg2, super.field7802, super.field7837, -119, super.field7770, super.field7826);
        if (var11 == null) {
            return false;
        } else {
            super.field7812 = var11.method736();
            this.method3168(var11, 159411303);
            int var12 = super.field7814.method3100((byte) -106);
            if (var8 == 0 && var9 == 0) {
                this.method3159(var12, this.method2241(-108) << 7, -72, 0, 0, this.method2241(-41) << 7);
            } else {
                this.method3159(var12, var9, -89, var5.field2669, var5.field2655, var8);
                if (~super.field7857 != -1) {
                    super.field7867[0].method725(super.field7857);
                }
                if (super.field7785 != 0) {
                    super.field7867[0].method754(super.field7785);
                }
                if (~super.field7850 != -1) {
                    super.field7867[0].method730(0, super.field7850, 0);
                }
            }
            if (var10) {
                var11.method756(super.field7838, super.field7820, super.field7791, 255 & super.field7851);
            }
            if (~super.field7843 != 0 && super.field7767 != -1) {
                class533 var13 = class514.field7469.method595(-12186, super.field7843);
                boolean var14 = ~var13.field7743 == -4 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field7797 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field7790 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class374 var16 = super.field7867[1] = var13.method3143(super.field7784, class422.field6355, (byte) 98, var15, super.field7795, super.field7767, arg2);
                if (var16 != null) {
                    if (super.field7790 != 0) {
                        var16.method730(0, -super.field7790 << 0, 0);
                    }
                    if (~super.field7797 != -1) {
                        var16.method769(super.field7797 * 2048);
                    }
                    if (var14) {
                        if (super.field7857 != 0) {
                            var16.method725(super.field7857);
                        }
                        if (super.field7785 != 0) {
                            var16.method754(super.field7785);
                        }
                        if (~super.field7850 != -1) {
                            var16.method730(0, super.field7850, 0);
                        }
                    }
                }
            } else {
                super.field7867[1] = null;
            }
            if (~super.field7836 != 0 && ~super.field7799 != 0) {
                class533 var17 = class514.field7469.method595(-12186, super.field7836);
                boolean var18 = var17.field7743 == 3 && (~var8 != -1 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (super.field7849 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field7808 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class374 var20 = super.field7867[3] = var17.method3148(var19, -2539, arg2, super.field7774, super.field7799, super.field7842, class422.field6355);
                if (var20 != null) {
                    if (super.field7808 != 0) {
                        var20.method730(0, -super.field7808 << 0, 0);
                    }
                    if (~super.field7849 != -1) {
                        var20.method769(super.field7849 * 2048);
                    }
                    if (var18) {
                        if (~super.field7857 != -1) {
                            var20.method725(super.field7857);
                        }
                        if (super.field7785 != 0) {
                            var20.method754(super.field7785);
                        }
                        if (~super.field7850 != -1) {
                            var20.method730(0, super.field7850, 0);
                        }
                    }
                }
            } else {
                super.field7867[3] = null;
            }
            super.field7867[2] = null;
            if (super.field7868 != null) {
                if (~super.field7868.field6486 >= ~class62.field1268) {
                    super.field7868 = null;
                } else if (~super.field7868.field6479 >= ~class62.field1268) {
                    class374 var21 = super.field7868.method2610((byte) 101, 7 | var4, arg2);
                    if (var21 != null) {
                        var21.method730(super.field7868.field6491 - super.field6073, -super.field6083 + super.field7868.field6482, -super.field6078 + super.field7868.field6478);
                        if (var12 != 0) {
                            var21.method769(var12);
                        }
                        super.field7867[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lnn;B)Lbb;", line = 551)
    public static final class220 method1161(class289 arg0, byte arg1) {
        if (arg1 > -75) {
            method1161((class289) null, (byte) -28);
        }
        ++field2617;
        return new class220(arg0.method1848((byte) 126), arg0.method1848((byte) 109), arg0.method1848((byte) 109), arg0.method1848((byte) 124), arg0.method1863(109), arg0.method1863(-96), arg0.method1858(-3256));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Z", line = 563)
    private final boolean method1162(boolean arg0) {
        ++field2607;
        if (arg0) {
            this.method1156((byte) -52);
        }
        return this.field2613.field1062;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V", line = 575)
    public final void method12(int arg0) {
        ++field2611;
        int var2 = -23 % ((arg0 - -35) / 44);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLza;)V", line = 585)
    public final void method9(byte arg0, class288 arg1) {
        ++field2614;
        if (this.field2613 != null) {
            if (super.field7871 || this.method1160((byte) 115, 0, arg1)) {
                this.method3163(0, super.field7871, super.field7867, arg1);
                if (arg0 > -98) {
                    this.method1157(-100);
                }
                super.field7867[0] = super.field7867[1] = super.field7867[2] = super.field7867[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(ZII)V", line = 607)
    public final void method1163(boolean arg0, int arg1, int arg2) {
        ++field2612;
        int var4 = super.field7866[0];
        int var5 = super.field7870[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var5;
            ++var4;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (arg0) {
            if (~arg1 == -4) {
                ++var4;
                --var5;
            }
            if (arg1 == 4) {
                --var5;
            }
            if (arg1 == 5) {
                --var5;
                --var4;
            }
            if (~arg1 == -7) {
                --var4;
            }
            if (~arg1 == -8) {
                --var4;
                ++var5;
            }
            if (super.field7768 != -1 && class422.field6355.method236(super.field7768, (byte) -92).field1200 == 1) {
                super.field7768 = -1;
            }
            if (~super.field7843 != 0) {
                class533 var6 = class514.field7469.method595(-12186, super.field7843);
                if (var6.field7738 && ~var6.field7734 != 0 && class422.field6355.method236(var6.field7734, (byte) -99).field1200 == 1) {
                    super.field7843 = -1;
                }
            }
            if (super.field7836 != -1) {
                class533 var7 = class514.field7469.method595(-12186, super.field7836);
                if (var7.field7738 && var7.field7734 != -1 && ~class422.field6355.method236(var7.field7734, (byte) -81).field1200 == -2) {
                    super.field7836 = -1;
                }
            }
            if (super.field7863 < 9) {
                ++super.field7863;
            }
            for (int var8 = super.field7863; ~var8 < -1; --var8) {
                super.field7866[var8] = super.field7866[var8 + -1];
                super.field7870[var8] = super.field7870[var8 + -1];
                super.field7864[var8] = super.field7864[var8 + -1];
            }
            super.field7866[0] = var4;
            super.field7870[0] = var5;
            super.field7864[0] = (byte) arg2;
        }
    }
}
