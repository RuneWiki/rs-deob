import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class107 extends class451 implements class559 {

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "Z")
    private boolean field1304 = false;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "Lvt;")
    public class736 field1313;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "Z")
    private boolean field1320;

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "Z")
    public static boolean field1323 = false;

    @OriginalMember(owner = "client!mj", name = "kb", descriptor = "Lnha;")
    public static class501 field1325 = new class501("", 12);

    @OriginalMember(owner = "client!mj", name = "nb", descriptor = "I")
    public static int field1328 = 0;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!mj", name = "lb", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "Lufa;")
    private class152 field1322;

    @OriginalMember(owner = "client!mj", name = "mb", descriptor = "Lkha;")
    public static class687 field1327;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILrj;Lmb;I)V", line = 5)
    public static final void method729(int arg0, class747 arg1, class410 arg2, int arg3) {
        ++field1318;
        if (class111.field1370 < 50) {
            if (arg1 != null && arg1.field10451 != null && ~arg0 > ~arg1.field10451.length && arg1.field10451[arg0] != null) {
                int var4 = arg1.field10451[arg0][0];
                int var5 = var4 >> 8;
                int var6 = (245 & var4) >> 5;
                int var7 = var4 & 31;
                if (arg1.field10451[arg0].length > 1) {
                    int var8 = (int) (Math.random() * (double) arg1.field10451[arg0].length);
                    if (var8 > 0) {
                        var5 = arg1.field10451[arg0][var8];
                    }
                }
                int var9 = 256;
                if (arg1.field10435 != null && arg1.field10457 != null) {
                    var9 = arg1.field10435[arg0] + (int) (Math.random() * (double) (arg1.field10457[arg0] - arg1.field10435[arg0]));
                }
                int var10 = arg1.field10438 != null ? arg1.field10438[arg0] : 255;
                if (arg3 != -4855) {
                    field1328 = -47;
                }
                if (~var7 == -1) {
                    if (class339.field4374 == arg2) {
                        if (arg1.field10434) {
                            class487.method2846(0, var10, (byte) -121, var5, var9, false, var6);
                            return;
                        }
                        class140.method869(var10, var5, var9, var6, (byte) 42, 0);
                    }
                } else if (class223.field2944.field605.method3601((byte) -120) != 0) {
                    int var11 = arg2.field5790 + -256 >> 9;
                    int var12 = arg2.field5784 + -256 >> 9;
                    int var13 = class339.field4374 != arg2 ? (arg2.field5779 << 24) - (-(var11 << 16) + -(var12 << 8)) + var7 : 0;
                    class552.field7756[class111.field1370++] = new class310((byte) (arg1.field10434 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)V", line = 75)
    public static final void method730(int arg0) {
        ++field1316;
        class491.field6967.method781((byte) 47);
        if (arg0 >= -94) {
            method738(-49, 63, -90, (String) null, 118);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lha;B)Lufa;", line = 86)
    public final class152 method520(class454 arg0, byte arg1) {
        if (arg1 <= 114) {
            this.field1304 = true;
        }
        ++field1309;
        return this.field1322;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lha;I)Lie;", line = 98)
    public final class607 method509(class454 arg0, int arg1) {
        ++field1302;
        class219 var3 = this.field1313.method4126(true, arg0, 2048, false, (byte) -121);
        if (arg1 != -8964) {
            this.field1320 = false;
        }
        if (var3 == null) {
            return null;
        } else {
            class376 var4 = arg0.method114();
            var4.method1963(super.field5790, super.field5791, super.field5784);
            class607 var5 = class311.method1814(arg1 ^ -8978, 1, this.field1320);
            this.field1313.method4122(arg0, super.field6322, super.field6328, super.field6324, true, var3, var4, super.field6321, false);
            if (!class306.field3936) {
                var3.method1351(var4, var5.field8425[0], 0);
            } else {
                var3.method1375(var4, var5.field8425[0], class468.field6738, 0);
            }
            if (this.field1313.field10289 != null) {
                class603 var6 = this.field1313.field10289.method2540();
                if (!class306.field3936) {
                    arg0.method102(var6);
                } else {
                    arg0.method155(var6, class468.field6738);
                }
            }
            this.field1304 = var3.method1338() || this.field1313.field10289 != null;
            if (this.field1322 != null) {
                class465.method2750(super.field5791, this.field1322, super.field5790, var3, (byte) -123, super.field5784);
            } else {
                this.field1322 = class517.method2966(super.field5790, var3, super.field5784, 102, super.field5791);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZILmb;Lha;III)V", line = 146)
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 12473) {
            method738(95, -70, -52, (String) null, -72);
        }
        ++field1307;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z", line = 159)
    public final boolean method516(byte arg0) {
        ++field1305;
        if (arg0 > -67) {
            method730(54);
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V", line = 170)
    public final void method523(int arg0) {
        if (arg0 != 0) {
            this.field1320 = true;
        }
        ++field1317;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I", line = 181)
    public final int method731(int arg0) {
        ++field1308;
        int var2 = 44 / ((36 - arg0) / 42);
        return this.field1313.field10296;
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)Z", line = 192)
    public final boolean method256(byte arg0) {
        int var2 = 77 % ((arg0 - -1) / 36);
        ++field1303;
        return this.field1304;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lha;Lqg;IIIIIZIIIIIII)V", line = 203)
    public class107(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field3777 == -2, class468.method2761(arg13, 57, arg12));
        this.field1313 = new class736(arg0, arg1, arg12, arg13, super.field5779, arg3, this, arg7, arg14);
        this.field1320 = arg1.field3738 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)I", line = 212)
    public final int method247(int arg0) {
        if (arg0 != 0) {
            field1327 = null;
        }
        ++field1300;
        return this.field1313.method4127((byte) -128);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILha;)V", line = 224)
    public final void method732(int arg0, class454 arg1) {
        ++field1306;
        this.field1313.method4125(arg0 + 273035, arg1);
        if (arg0 != -10891) {
            this.method739((byte) -6);
        }
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(I)V", line = 236)
    public static void method733(int arg0) {
        field1325 = null;
        if (arg0 != 5) {
            field1327 = null;
        }
        field1327 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[BIII)Z", line = 247)
    public static final boolean method734(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        ++field1315;
        int var7 = arg1 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = -var7 + arg6;
        }
        int var9 = -((arg4 + arg6 + -1) / arg6);
        if (arg5 <= 110) {
            method737(92, -124);
        }
        int var10 = -((arg1 + arg6 + -1) / arg6);
        for (int var11 = var9; var11 < 0; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (~arg3[arg2] == -1) {
                    return true;
                }
                arg2 += arg6;
            }
            int var13 = arg2 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)I", line = 296)
    public final int method735(int arg0) {
        if (arg0 != 24123) {
            field1328 = 45;
        }
        ++field1319;
        return this.field1313.field10297;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBLha;)Z", line = 308)
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field1311;
        if (arg2 != -4) {
            return true;
        } else {
            class219 var5 = this.field1313.method4126(false, arg3, 131072, false, (byte) -118);
            if (var5 == null) {
                return false;
            } else {
                class376 var6 = arg3.method114();
                var6.method1963(super.field5790, super.field5791, super.field5784);
                return !class306.field3936 ? var5.method1378(arg0, arg1, var6, false, 0) : var5.method1357(arg0, arg1, var6, false, 0, class468.field6738);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 328)
    public final void method736(byte arg0) {
        if (arg0 < -123) {
            ++field1299;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 339)
    public static final void method737(int arg0, int arg1) {
        class73 var2 = class495.field7002[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class73 var4 = class495.field7002[var3][arg0][arg1] = class495.field7002[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class456 var5 = var4.field969; var5 != null; var5 = var5.field6389) {
                    class451 var6 = var5.field6384;
                    if (var6.field6321 == arg0 && var6.field6328 == arg1) {
                        --var6.field5779;
                    }
                }
                if (var4.field966 != null) {
                    --var4.field966.field5779;
                }
                if (var4.field973 != null) {
                    --var4.field973.field5779;
                }
                if (var4.field961 != null) {
                    --var4.field961.field5779;
                }
                if (var4.field964 != null) {
                    --var4.field964.field5779;
                }
                if (var4.field971 != null) {
                    --var4.field971.field5779;
                }
            }
        }
        if (class495.field7002[0][arg0][arg1] == null) {
            class495.field7002[0][arg0][arg1] = new class73(0);
            class495.field7002[0][arg0][arg1].field963 = 1;
        }
        class495.field7002[0][arg0][arg1].field962 = var2;
        class495.field7002[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)Z", line = 392)
    public final boolean method265(byte arg0) {
        ++field1314;
        int var2 = 6 % ((61 - arg0) / 45);
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)I", line = 409)
    public final int method269(byte arg0) {
        if (arg0 != 30) {
            field1327 = null;
        }
        ++field1301;
        return this.field1313.method4124((byte) 103);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 420)
    public static final void method738(int arg0, int arg1, int arg2, String arg3, int arg4) {
        ++field1310;
        class460 var5 = class611.method3340(arg4, arg0, -78);
        if (var5 != null) {
            if (var5.field6580 != null) {
                class575 var6 = new class575();
                var6.field8028 = var5;
                var6.field8024 = arg3;
                var6.field8025 = arg1;
                var6.field8027 = var5.field6580;
                class445.method2625(var6);
            }
            if (~class668.field9150 == -11) {
                if (client.method715(var5).method288(arg1 - 1, -109)) {
                    if (~arg1 == -2) {
                        ++class488.field6941;
                        class650 var7 = class314.method1837(class53.field779, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var7, arg0, arg4);
                        class108.method745(var7, -50);
                    }
                    if (~arg1 == -3) {
                        ++class357.field4860;
                        class650 var8 = class314.method1837(class708.field9964, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var8, arg0, arg4);
                        class108.method745(var8, -84);
                    }
                    int var9 = 1 / ((arg2 - 61) / 57);
                    if (~arg1 == -4) {
                        ++class169.field2230;
                        class650 var10 = class314.method1837(class455.field6379, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var10, arg0, arg4);
                        class108.method745(var10, -12);
                    }
                    if (~arg1 == -5) {
                        ++class337.field4353;
                        class650 var11 = class314.method1837(class303.field3895, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var11, arg0, arg4);
                        class108.method745(var11, -22);
                    }
                    if (arg1 == 5) {
                        ++class267.field3384;
                        class650 var12 = class314.method1837(class301.field3886, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var12, arg0, arg4);
                        class108.method745(var12, -40);
                    }
                    if (arg1 == 6) {
                        ++class554.field7784;
                        class650 var13 = class314.method1837(class761.field10598, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var13, arg0, arg4);
                        class108.method745(var13, -71);
                    }
                    if (arg1 == 7) {
                        ++class711.field10004;
                        class650 var14 = class314.method1837(class721.field10158, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var14, arg0, arg4);
                        class108.method745(var14, -56);
                    }
                    if (arg1 == 8) {
                        ++class517.field7284;
                        class650 var15 = class314.method1837(class553.field7768, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var15, arg0, arg4);
                        class108.method745(var15, -44);
                    }
                    if (~arg1 == -10) {
                        ++class499.field7055;
                        class650 var16 = class314.method1837(class625.field8725, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var16, arg0, arg4);
                        class108.method745(var16, -27);
                    }
                    if (arg1 == 10) {
                        ++class37.field548;
                        class650 var17 = class314.method1837(class657.field9033, true, class625.field8727);
                        class475.method2784(0, var5.field6556, var17, arg0, arg4);
                        class108.method745(var17, -60);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)Z", line = 555)
    public final boolean method739(byte arg0) {
        ++field1321;
        int var2 = 48 % (-arg0 / 32);
        return this.field1313.method4123((byte) -38);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLha;)V", line = 568)
    public final void method522(boolean arg0, class454 arg1) {
        ++field1324;
        class219 var3 = this.field1313.method4126(true, arg1, 262144, true, (byte) -116);
        if (!arg0) {
            if (var3 != null) {
                class376 var4 = arg1.method114();
                var4.method1963(super.field5790, super.field5791, super.field5784);
                this.field1313.method4122(arg1, super.field6322, super.field6328, super.field6324, false, var3, var4, super.field6321, false);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lha;B)V", line = 589)
    public final void method740(class454 arg0, byte arg1) {
        ++field1326;
        this.field1313.method4128(18119, arg0);
        if (arg1 <= 16) {
            this.method265((byte) -69);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)I", line = 605)
    public final int method741(int arg0) {
        if (arg0 < 65) {
            this.method247(-6);
        }
        ++field1312;
        return this.field1313.field10318;
    }
}
