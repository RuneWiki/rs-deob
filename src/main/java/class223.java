import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class223 extends class337 implements class559 {

    @OriginalMember(owner = "client!to", name = "ab", descriptor = "Z")
    private boolean field2932 = false;

    @OriginalMember(owner = "client!to", name = "X", descriptor = "Lvt;")
    public class736 field2929;

    @OriginalMember(owner = "client!to", name = "ib", descriptor = "Z")
    private boolean field2940;

    @OriginalMember(owner = "client!to", name = "cb", descriptor = "[Ljava/lang/String;")
    public static String[] field2934 = new String[100];

    @OriginalMember(owner = "client!to", name = "jb", descriptor = "Lus;")
    public static class328 field2941 = new class328(80, 0);

    @OriginalMember(owner = "client!to", name = "kb", descriptor = "Lgaa;")
    public static class460 field2942 = null;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!to", name = "N", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!to", name = "U", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!to", name = "V", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!to", name = "W", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!to", name = "Z", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!to", name = "bb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!to", name = "db", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!to", name = "eb", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!to", name = "fb", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!to", name = "gb", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!to", name = "hb", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!to", name = "lb", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!to", name = "nb", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!to", name = "ob", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!to", name = "pb", descriptor = "Lufa;")
    private class152 field2947;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "Lvn;")
    public static class200 field2925;

    @OriginalMember(owner = "client!to", name = "mb", descriptor = "Lts;")
    public static class41 field2944;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I", line = 4)
    public final int method731(int arg0) {
        ++field2922;
        int var2 = 85 % ((arg0 - 36) / 42);
        return this.field2929.field10296;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILgba;IZLqca;Lha;)Z", line = 14)
    public static final boolean method1442(int arg0, class499 arg1, int arg2, boolean arg3, class351 arg4, class454 arg5) {
        ++field2927;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field4614 != null) {
            var7 = class341.field4428 - -((arg4.field4623 - class341.field4433 + arg1.field7059) * (-class341.field4428 + class341.field4444) / (-class341.field4433 + class341.field4429));
            var6 = (-class341.field4433 + arg1.field7059 + arg4.field4585) * (-class341.field4428 + class341.field4444) / (-class341.field4433 + class341.field4429) + class341.field4428;
            var9 = class341.field4438 - (class341.field4438 - class341.field4430) * (arg1.field7047 + arg4.field4611 + -class341.field4435) / (-class341.field4435 + class341.field4432);
            var8 = class341.field4438 - (arg1.field7047 + arg4.field4589 - class341.field4435) * (-class341.field4430 + class341.field4438) / (-class341.field4435 + class341.field4432);
        }
        class712 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (!arg3) {
            field2941 = null;
        }
        int var14 = 0;
        if (~arg4.field4593 != 0) {
            if (arg1.field7052 && ~arg4.field4620 != 0) {
                var10 = arg4.method2067(true, arg5, -11446);
            } else {
                var10 = arg4.method2067(false, arg5, -11446);
            }
            if (var10 != null) {
                var11 = arg1.field7050 + -(1 + var10.method1892() >> 1);
                var12 = arg1.field7050 + (1 + var10.method1892() >> 1);
                if (~var6 < ~var11) {
                    var6 = var11;
                }
                var13 = arg1.field7046 + -(var10.method1882() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg1.field7046 + (1 + var10.method1882() >> 1);
                if (~var13 > ~var8) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class429 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg4.field4599 != null) {
            var15 = class18.method211(!arg3, arg4.field4590);
            if (var15 != null) {
                var16 = class324.field4132.method454((byte) -105, (class712[]) null, (int[]) null, class405.field5714, arg4.field4599);
                var17 = (-class341.field4428 + class341.field4444) * arg4.field4609 / (class341.field4429 - class341.field4433) + arg1.field7050;
                int var24 = -((-class341.field4430 + class341.field4438) * arg4.field4622 / (-class341.field4435 + class341.field4432)) + arg1.field7046;
                if (var10 == null) {
                    var18 = var24 - var15.method2560() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method1882() >> 1) + var15.method2558() * var16);
                }
                for (int var25 = 0; ~var16 < ~var25; ++var25) {
                    String var26 = class405.field5714[var25];
                    if (~var25 > ~(var16 - 1)) {
                        var26 = var26.substring(0, -4 + var26.length());
                    }
                    int var27 = var15.method2557(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = -(var19 / 2) + arg2 + var17;
                if (~var6 < ~var20) {
                    var6 = var20;
                }
                var21 = var19 / 2 + var17 - -arg2;
                if (~var7 > ~var21) {
                    var7 = var21;
                }
                var22 = arg0 + var18;
                if (var22 < var8) {
                    var8 = var22;
                }
                var23 = arg0 + var18 - -(var16 * var15.method2558());
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (~var7 <= ~class341.field4428 && ~class341.field4444 <= ~var6 && var9 >= class341.field4430 && ~class341.field4438 <= ~var8) {
            class341.method2016(arg5, arg1, arg4);
            if (var10 != null) {
                if (~class383.field5336 < -1 && (~class610.field8449 != 0 && ~class610.field8449 == ~arg1.field7056 || class718.field10122 != -1 && class718.field10122 == arg4.field4608)) {
                    int var28;
                    if (class488.field6949 > 50) {
                        var28 = (-class488.field6949 + 100) * 2;
                    } else {
                        var28 = class488.field6949 * 2;
                    }
                    int var29 = var28 << 24 | 16776960;
                    arg5.method2669(arg1.field7046, arg3, var29, arg1.field7050, var10.method1895() / 2 - -7);
                    arg5.method2669(arg1.field7046, true, var29, arg1.field7050, 5 + var10.method1895() / 2);
                    arg5.method2669(arg1.field7046, true, var29, arg1.field7050, var10.method1895() / 2 - -3);
                    arg5.method2669(arg1.field7046, arg3, var29, arg1.field7050, var10.method1895() / 2 - -1);
                    arg5.method2669(arg1.field7046, arg3, var29, arg1.field7050, var10.method1895() / 2);
                }
                var10.method3929(arg1.field7050 + -(var10.method1892() >> 1), arg1.field7046 - (var10.method1882() >> 1));
            }
            if (arg4.field4599 != null && var15 != null) {
                class6.method29((byte) -59, arg1, var16, var15, var18, var19, var17, arg4, arg5);
            }
            if (~arg4.field4593 != 0 || arg4.field4599 != null) {
                class110 var30 = new class110(arg1);
                var30.field1348 = var21;
                var30.field1353 = var14;
                var30.field1352 = var23;
                var30.field1355 = var20;
                var30.field1358 = var11;
                var30.field1350 = var22;
                var30.field1349 = var12;
                var30.field1347 = var13;
                class419.field5962.method3110(var30, 1);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lha;Lqg;IIIIIZII)V", line = 206)
    public class223(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field3745);
        this.field2929 = new class736(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field2940 = ~arg1.field3738 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!to", name = "g", descriptor = "(B)V", line = 215)
    public static final void method1443(byte arg0) {
        class247.field3157 = 0;
        if (arg0 != -28) {
            method1442(21, (class499) null, -85, true, (class351) null, (class454) null);
        }
        ++field2924;
        int var1 = (class339.field4374.field5790 >> 9) + class63.field851;
        int var2 = (class339.field4374.field5784 >> 9) + class753.field10509;
        if (~var1 <= -3054 && var1 <= 3156 && ~var2 <= -3057 && var2 <= 3136) {
            class247.field3157 = 1;
        }
        if (~var1 <= -3073 && ~var1 >= -3119 && ~var2 <= -9493 && ~var2 >= -9536) {
            class247.field3157 = 1;
        }
        if (class247.field3157 == 1 && var1 >= 3139 && ~var1 >= -3200 && var2 >= 3008 && ~var2 >= -3063) {
            class247.field3157 = 0;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZILmb;Lha;III)V", line = 239)
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        if (arg1 == 12473) {
            ++field2916;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(B)Z", line = 253)
    public final boolean method265(byte arg0) {
        ++field2920;
        int var2 = -102 % ((61 - arg0) / 45);
        return false;
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V", line = 265)
    public final void method523(int arg0) {
        ++field2923;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)Z", line = 277)
    public final boolean method516(byte arg0) {
        if (arg0 > -67) {
            return true;
        } else {
            ++field2936;
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLha;)V", line = 288)
    public final void method522(boolean arg0, class454 arg1) {
        ++field2917;
        if (!arg0) {
            class219 var3 = this.field2929.method4126(true, arg1, 262144, true, (byte) -112);
            if (var3 != null) {
                int var4 = super.field5790 >> 9;
                int var5 = super.field5784 >> 9;
                class376 var6 = arg1.method114();
                var6.method1963(super.field5790, super.field5791, super.field5784);
                this.field2929.method4122(arg1, var4, var5, var5, false, var3, var6, var4, false);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(I)I", line = 318)
    public final int method247(int arg0) {
        ++field2939;
        return arg0 != 0 ? 77 : this.field2929.method4127((byte) -123);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lha;I)Lie;", line = 330)
    public final class607 method509(class454 arg0, int arg1) {
        ++field2928;
        class219 var3 = this.field2929.method4126(true, arg0, 2048, false, (byte) -119);
        if (var3 == null) {
            return null;
        } else {
            class376 var4 = arg0.method114();
            var4.method1963(super.field5790, super.field5791, super.field5784);
            if (arg1 != -8964) {
                field2934 = null;
            }
            class607 var5 = class311.method1814(-124, 1, this.field2940);
            int var6 = super.field5790 >> 9;
            int var7 = super.field5784 >> 9;
            this.field2929.method4122(arg0, var6, var7, var7, true, var3, var4, var6, false);
            if (class306.field3936) {
                var3.method1375(var4, var5.field8425[0], class468.field6738, 0);
            } else {
                var3.method1351(var4, var5.field8425[0], 0);
            }
            if (this.field2929.field10289 != null) {
                class603 var8 = this.field2929.field10289.method2540();
                if (!class306.field3936) {
                    arg0.method102(var8);
                } else {
                    arg0.method155(var8, class468.field6738);
                }
            }
            this.field2932 = var3.method1338() || this.field2929.field10289 != null;
            if (this.field2947 == null) {
                this.field2947 = class517.method2966(super.field5790, var3, super.field5784, arg1 ^ -9080, super.field5791);
            } else {
                class465.method2750(super.field5791, this.field2947, super.field5790, var3, (byte) -123, super.field5784);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILha;)V", line = 382)
    public final void method732(int arg0, class454 arg1) {
        ++field2921;
        if (arg0 != -10891) {
            this.method520((class454) null, (byte) -119);
        }
        this.field2929.method4125(262144, arg1);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 393)
    public final void method736(byte arg0) {
        ++field2938;
        if (arg0 >= -123) {
            field2934 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I", line = 403)
    public final int method741(int arg0) {
        ++field2926;
        if (arg0 < 65) {
            field2946 = 0;
        }
        return this.field2929.field10318;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I", line = 414)
    public final int method735(int arg0) {
        ++field2935;
        return arg0 != 24123 ? -79 : this.field2929.field10297;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z", line = 427)
    public final boolean method739(byte arg0) {
        ++field2919;
        int var2 = 80 % (-arg0 / 32);
        return this.field2929.method4123((byte) -38);
    }

    @OriginalMember(owner = "client!to", name = "k", descriptor = "(I)V", line = 438)
    public static void method1444(int arg0) {
        field2944 = null;
        field2941 = null;
        field2925 = null;
        field2934 = null;
        field2942 = null;
        if (arg0 > -19) {
            method1444(-23);
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lha;B)Lufa;", line = 453)
    public final class152 method520(class454 arg0, byte arg1) {
        if (arg1 < 114) {
            this.method514(true, -62, (class410) null, (class454) null, 122, 41, 85);
        }
        ++field2931;
        return this.field2947;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIBLha;)Z", line = 465)
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field2918;
        class219 var5 = this.field2929.method4126(false, arg3, 131072, false, (byte) -123);
        if (var5 == null) {
            return false;
        } else {
            class376 var6 = arg3.method114();
            var6.method1963(super.field5790, super.field5791, super.field5784);
            if (arg2 != -4) {
                field2925 = null;
            }
            return !class306.field3936 ? var5.method1378(arg0, arg1, var6, false, 0) : var5.method1357(arg0, arg1, var6, false, 0, class468.field6738);
        }
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(B)Z", line = 488)
    public final boolean method256(byte arg0) {
        ++field2937;
        int var2 = -26 % ((-1 - arg0) / 36);
        return this.field2932;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lha;B)V", line = 498)
    public final void method740(class454 arg0, byte arg1) {
        if (arg1 < 16) {
            field2942 = null;
        }
        this.field2929.method4128(18119, arg0);
        ++field2933;
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(B)I", line = 509)
    public final int method269(byte arg0) {
        ++field2930;
        if (arg0 != 30) {
            this.method523(-29);
        }
        return this.field2929.method4124((byte) 103);
    }
}
