import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class502 extends class77 {

    @OriginalMember(owner = "client!dw", name = "Bc", descriptor = "I")
    public int field7389 = -1;

    @OriginalMember(owner = "client!dw", name = "Pc", descriptor = "I")
    public int field7403 = -1;

    @OriginalMember(owner = "client!dw", name = "yc", descriptor = "[I")
    public static int[] field7386 = new int[50];

    @OriginalMember(owner = "client!dw", name = "Jc", descriptor = "[I")
    public static int[] field7397 = new int[32];

    @OriginalMember(owner = "client!dw", name = "tc", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!dw", name = "uc", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!dw", name = "vc", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!dw", name = "wc", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!dw", name = "xc", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!dw", name = "Ac", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!dw", name = "Cc", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!dw", name = "Dc", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!dw", name = "Ec", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!dw", name = "Fc", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!dw", name = "Gc", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!dw", name = "Hc", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!dw", name = "Ic", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!dw", name = "Kc", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!dw", name = "Lc", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!dw", name = "Mc", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!dw", name = "Nc", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!dw", name = "Oc", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!dw", name = "Rc", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!dw", name = "Sc", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!dw", name = "zc", descriptor = "Lej;")
    public class79 field7387;

    @OriginalMember(owner = "client!dw", name = "Qc", descriptor = "Lju;")
    public static class82 field7404;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dw", name = "Tc", descriptor = "Ljava/lang/Class;")
    public static Class field7407;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2948(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field7397[var1] = var0 + -1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lya;B)Lmf;", line = 3)
    public final class289 method484(class38 arg0, byte arg1) {
        ++field7405;
        if (this.field7387 != null && this.method2943(true, arg0, 2048)) {
            if (arg1 <= 111) {
                this.field7387 = null;
            }
            class122 var3 = arg0.method280();
            int var4 = super.field1085.method701((byte) 17);
            var3.method191(var4);
            var3.method188(super.field1732, super.field1734, super.field1735);
            class93 var5 = this.method616((byte) -83);
            class79 var6 = this.field7387.field1143 != null ? this.field7387.method646(0, class421.field6166) : this.field7387;
            if (class20.field269.field7664 && var6.field1151 && var5.field1326) {
                class104 var7 = super.field1064 != -1 && ~super.field1037 == -1 ? class222.field3168.method126(-119, super.field1064) : null;
                class104 var8 = super.field1083 == -1 || super.field1099 && var7 != null ? null : class222.field3168.method126(-127, super.field1083);
                class471 var9 = class172.method1118(this.field7387.field1160 & 65535, var8 != null ? var8 : var7, 255 & this.field7387.field1170, super.field1126[0], var8 != null ? super.field1098 : super.field1048, arg0, this.field7387.field1197 & 65535, 255 & this.field7387.field1182, super.field1051, super.field1101, 97, super.field1112, var4, this.field7387.field1168, super.field1066);
                if (var9 != null) {
                    float var10 = arg0.method259();
                    float var11 = arg0.method271();
                    arg0.method235(false);
                    arg0.method245(var10, var11 - 150.0F);
                    var9.method397(var3, (class387) null, 0);
                    arg0.method245(var10, var11);
                    arg0.method235(true);
                }
            }
            class289 var12 = null;
            if (this.method2940(-10171)) {
                var12 = class165.method1099(true, super.field1126.length);
            }
            if (super.field1124 == null) {
                arg0.method226(super.field1126, var3, var12 == null ? null : var12.field4009, 0);
            } else {
                class523 var13 = super.field1124.method1193();
                arg0.method242(super.field1126, var13, var3, var12 != null ? var12.field4009 : null, 0);
            }
            this.method609(super.field1126, (byte) -12, false, arg0);
            if (super.field1126[2] != null) {
                if (~var4 != -1) {
                    super.field1126[2].method393(var4);
                }
                super.field1126[2].method392(-super.field1125.field6141 + super.field1732, -super.field1125.field6135 + super.field1734, super.field1735 - super.field1125.field6139);
            }
            super.field1126[0] = super.field1126[1] = super.field1126[2] = super.field1126[3] = null;
            super.field1096 = class168.field2517;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)Z", line = 86)
    public final boolean method492(int arg0) {
        ++field7401;
        if (arg0 != -1) {
            field7402 = -40;
        }
        return false;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILej;)V", line = 97)
    public final void method2939(int arg0, class79 arg1) {
        this.field7387 = arg1;
        ++field7396;
        if (super.field1124 != null) {
            super.field1124.method1192();
        }
        if (arg0 < 55) {
            field7386 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZILya;I)Z", line = 112)
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field7394;
        if (this.field7387 != null && this.method2943(true, arg2, 131072)) {
            class122 var5 = arg2.method280();
            if (!arg0) {
                field7397 = null;
            }
            int var6 = super.field1085.method701((byte) 17);
            var5.method191(var6);
            var5.method188(super.field1732, super.field1734, super.field1735);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field1126.length; ++var8) {
                if (super.field1126[var8] != null && super.field1126[var8].method391(arg3, arg1, var5, ~this.field7387.field1168 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field1126[0] = super.field1126[1] = super.field1126[2] = super.field1126[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)Z", line = 150)
    private final boolean method2940(int arg0) {
        ++field7406;
        if (arg0 != -10171) {
            field7386 = null;
        }
        return this.field7387.field1148;
    }

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "(B)V", line = 161)
    public static void method2941(byte arg0) {
        int var1 = -28 / ((arg0 - 24) / 58);
        field7386 = null;
        field7404 = null;
        field7397 = null;
    }

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "(B)Z", line = 173)
    public final boolean method2942(byte arg0) {
        if (arg0 != -123) {
            return false;
        } else {
            ++field7400;
            return this.field7387 != null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZLya;I)Z", line = 193)
    private final boolean method2943(boolean arg0, class38 arg1, int arg2) {
        ++field7399;
        int var4 = arg2;
        class93 var5 = this.method616((byte) -83);
        class104 var6 = super.field1064 != -1 && super.field1037 == 0 ? class222.field3168.method126(-121, super.field1064) : null;
        class104 var7 = ~super.field1083 == 0 || super.field1099 && var6 != null ? null : class222.field3168.method126(-116, super.field1083);
        int var8 = var5.field1365;
        int var9 = var5.field1342;
        if (~var8 != -1 || var9 != 0 || var5.field1370 != 0 || var5.field1364 != 0) {
            arg2 |= 7;
        }
        boolean var10 = super.field1103 != 0 && ~class441.field6516 <= ~super.field1047 && ~class441.field6516 > ~super.field1030;
        if (var10) {
            arg2 |= 524288;
        }
        class471 var11 = super.field1126[0] = this.field7387.method636(class421.field6166, super.field1087, super.field1102, super.field1058, class501.field7375, super.field1084, arg1, arg2, class222.field3168, super.field1048, super.field1098, var7, (byte) -47, super.field1072, var6);
        if (var11 == null) {
            return false;
        } else {
            super.field1105 = var11.method380();
            this.method618(var11, 40);
            int var12 = super.field1085.method701((byte) 17);
            if (~var8 == -1 && var9 == 0) {
                this.method614(var12, 0, (byte) 76, 0, this.method626((byte) 120) << 7, this.method626((byte) 120) << 7);
            } else {
                this.method614(var12, var5.field1336, (byte) 94, var5.field1352, var9, var8);
                if (super.field1112 != 0) {
                    super.field1126[0].method396(super.field1112);
                }
                if (~super.field1101 != -1) {
                    super.field1126[0].method409(super.field1101);
                }
                if (super.field1066 != 0) {
                    super.field1126[0].method392(0, super.field1066, 0);
                }
            }
            if (!arg0) {
                this.method2942((byte) 59);
            }
            if (var10) {
                var11.method390(super.field1068, super.field1092, super.field1075, super.field1103 & 255);
            }
            if (super.field1049 != -1 && ~super.field1065 != 0) {
                class398 var13 = class27.field357.method1479(super.field1049, (byte) -124);
                boolean var14 = var13.field5821 == 3 && (~var8 != -1 || ~var9 != -1);
                int var15 = var4;
                if (!var14) {
                    if (super.field1059 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field1111 != 0) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class471 var16 = super.field1126[1] = var13.method2391(super.field1074, class222.field3168, var15, super.field1065, super.field1081, arg1, 10061);
                if (var16 != null) {
                    if (super.field1111 != 0) {
                        var16.method392(0, -super.field1111 << 0, 0);
                    }
                    if (super.field1059 != 0) {
                        var16.method393(super.field1059 * 2048);
                    }
                    if (var14) {
                        if (~super.field1112 != -1) {
                            var16.method396(super.field1112);
                        }
                        if (~super.field1101 != -1) {
                            var16.method409(super.field1101);
                        }
                        if (super.field1066 != 0) {
                            var16.method392(0, super.field1066, 0);
                        }
                    }
                }
            } else {
                super.field1126[1] = null;
            }
            if (~super.field1023 != 0 && ~super.field1093 != 0) {
                class398 var17 = class27.field357.method1479(super.field1023, (byte) -121);
                boolean var18 = var17.field5821 == 3 && (~var8 != -1 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (super.field1052 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field1031 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class471 var20 = super.field1126[3] = var17.method2392(arg1, super.field1093, var19, true, super.field1067, super.field1034, class222.field3168);
                if (var20 != null) {
                    if (super.field1031 != 0) {
                        var20.method392(0, -super.field1031 << 0, 0);
                    }
                    if (~super.field1052 != -1) {
                        var20.method393(super.field1052 * 2048);
                    }
                    if (var18) {
                        if (super.field1112 != 0) {
                            var20.method396(super.field1112);
                        }
                        if (super.field1101 != 0) {
                            var20.method409(super.field1101);
                        }
                        if (super.field1066 != 0) {
                            var20.method392(0, super.field1066, 0);
                        }
                    }
                }
            } else {
                super.field1126[3] = null;
            }
            super.field1126[2] = null;
            if (super.field1125 != null) {
                if (~class441.field6516 > ~super.field1125.field6143) {
                    if (~class441.field6516 <= ~super.field1125.field6140) {
                        class471 var21 = super.field1125.method2505(arg1, 7 | var4, (byte) -115);
                        if (var21 != null) {
                            var21.method392(super.field1125.field6141 - super.field1732, -super.field1734 + super.field1125.field6135, -super.field1735 + super.field1125.field6139);
                            if (var12 != 0) {
                                var21.method393(var12);
                            }
                            super.field1126[2] = var21;
                        }
                    }
                } else {
                    super.field1125 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(III)V", line = 399)
    public final void method2944(int arg0, int arg1, int arg2) {
        ++field7385;
        int var4 = super.field1127[0];
        int var5 = super.field1117[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (~arg2 == -2) {
            ++var5;
            ++var4;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (arg2 == 3) {
            --var5;
            ++var4;
        }
        if (arg2 == 4) {
            --var5;
        }
        if (arg2 == 5) {
            --var5;
            --var4;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (~arg2 == -8) {
            ++var5;
            --var4;
        }
        if (super.field1064 != -1 && ~class222.field3168.method126(-94, super.field1064).field1574 == -2) {
            super.field1064 = -1;
        }
        if (~super.field1049 != 0) {
            class398 var6 = class27.field357.method1479(super.field1049, (byte) -123);
            if (var6.field5820 && ~var6.field5824 != 0 && class222.field3168.method126(-97, var6.field5824).field1574 == 1) {
                super.field1049 = -1;
            }
        }
        if (~super.field1023 != 0) {
            class398 var7 = class27.field357.method1479(super.field1023, (byte) -123);
            if (var7.field5820 && ~var7.field5824 != 0 && class222.field3168.method126(-116, var7.field5824).field1574 == 1) {
                super.field1023 = -1;
            }
        }
        int var8 = -27 % ((arg0 - -2) / 51);
        if (super.field1123 < 9) {
            ++super.field1123;
        }
        for (int var9 = super.field1123; var9 > 0; --var9) {
            super.field1127[var9] = super.field1127[var9 + -1];
            super.field1117[var9] = super.field1117[var9 + -1];
            super.field1121[var9] = super.field1121[var9 - 1];
        }
        super.field1127[0] = var4;
        super.field1117[0] = var5;
        super.field1121[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "(B)V", line = 495)
    public static final void method2945(byte arg0) {
        if (arg0 == 20) {
            ++field7382;
            if (~class504.field7417 == -3) {
                class261.field3627 = 96;
            } else {
                try {
                    Method var1 = (field7407 != null ? field7407 : (field7407 = method2948("java.lang.Runtime"))).getMethod("maxMemory");
                    if (var1 != null) {
                        try {
                            Runtime var2 = Runtime.getRuntime();
                            Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                            class261.field3627 = 1 + (int) (var3 / 1048576L);
                        } catch (Throwable var4) {
                        }
                    }
                } catch (Exception var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIZIII)V", line = 528)
    public final void method2946(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        super.field1738 = (byte) arg3;
        ++field7393;
        if (super.field1064 != -1 && class222.field3168.method126(-109, super.field1064).field1574 == 1) {
            super.field1064 = -1;
        }
        if (~super.field1049 != 0) {
            class398 var7 = class27.field357.method1479(super.field1049, (byte) -116);
            if (var7.field5820 && var7.field5824 != -1 && ~class222.field3168.method126(-69, var7.field5824).field1574 == -2) {
                super.field1049 = -1;
            }
        }
        if (~super.field1023 != 0) {
            class398 var8 = class27.field357.method1479(super.field1023, (byte) -126);
            if (var8.field5820 && var8.field5824 != -1 && class222.field3168.method126(-120, var8.field5824).field1574 == 1) {
                super.field1023 = -1;
            }
        }
        if (!arg2) {
            int var9 = -super.field1127[0] + arg0;
            int var10 = -super.field1117[0] + arg1;
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && var10 <= 8) {
                if (super.field1123 < 9) {
                    ++super.field1123;
                }
                for (int var11 = super.field1123; ~var11 < -1; --var11) {
                    super.field1127[var11] = super.field1127[var11 - 1];
                    super.field1117[var11] = super.field1117[var11 + -1];
                    super.field1121[var11] = super.field1121[var11 + -1];
                }
                super.field1127[0] = arg0;
                super.field1117[0] = arg1;
                super.field1121[0] = 1;
                return;
            }
        }
        super.field1127[0] = arg0;
        super.field1118 = 0;
        super.field1119 = 0;
        super.field1123 = 0;
        super.field1117[0] = arg1;
        super.field1735 = (super.field1117[0] << 7) + (arg4 << 6);
        super.field1732 = (super.field1127[0] << 7) + (arg4 << 6);
        if (arg5 >= -109) {
            this.field7387 = null;
        }
        if (super.field1124 != null) {
            super.field1124.method1192();
        }
    }

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "(I)V", line = 605)
    public final void method495(int arg0) {
        ++field7395;
        if (arg0 >= -104) {
            this.method617((byte) -13);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)I", line = 616)
    public final int method623(byte arg0) {
        if (arg0 < 100) {
            this.field7387 = null;
        }
        ++field7398;
        if (this.field7387.field1143 != null) {
            class79 var2 = this.field7387.method646(0, class421.field6166);
            if (var2 != null && var2.field1150 != -1) {
                return var2.field1150;
            }
        }
        return this.field7387.field1150;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)I", line = 641)
    public final int method621(int arg0) {
        if (arg0 != -1) {
            this.method498((class38) null, -122, true, (class291) null, 42, -49, -77);
        }
        ++field7384;
        if (this.field7387.field1143 != null) {
            class79 var2 = this.field7387.method646(0, class421.field6166);
            if (var2 != null && var2.field1154 != -1) {
                return var2.field1154;
            }
        }
        return ~this.field7387.field1154 == 0 ? super.method621(-1) : this.field7387.field1154;
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V", line = 666)
    public static final void method2947(int arg0) {
        if (arg0 != -32177) {
            method2947(-101);
        }
        ++field7383;
        int var1 = 0;
        for (int var2 = 0; ~class527.field7799 < ~var2; ++var2) {
            for (int var3 = 0; ~var3 > ~class422.field6182; ++var3) {
                if (class201.method1252((byte) -123, var1, true, var3, var2, class89.field1305)) {
                    ++var1;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(ILya;)V", line = 700)
    public final void method493(int arg0, class38 arg1) {
        ++field7392;
        if (this.field7387 != null) {
            if (arg0 <= -114) {
                if (super.field1120 || this.method2943(true, arg1, 0)) {
                    this.method609(super.field1126, (byte) -12, super.field1120, arg1);
                    super.field1126[0] = super.field1126[1] = super.field1126[2] = super.field1126[3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(B)I", line = 743)
    public final int method617(byte arg0) {
        int var2 = 17 % ((53 - arg0) / 36);
        ++field7381;
        if (this.field7387.field1143 != null) {
            class79 var3 = this.field7387.method646(0, class421.field6166);
            if (var3 != null && var3.field1149 != -1) {
                return var3.field1149;
            }
        }
        return this.field7387.field1149;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)I", line = 766)
    public final int method792(boolean arg0) {
        if (!arg0) {
            field7386 = null;
        }
        ++field7388;
        return super.field1105;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lya;IZLij;III)V", line = 782)
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            this.method500(true, 109, (class38) null, -38);
        }
        ++field7390;
        throw new IllegalStateException();
    }
}
