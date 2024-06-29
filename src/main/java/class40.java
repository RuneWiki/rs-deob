import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class40 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lwj;IZII)V", line = 4)
    public static final void method328(class275 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field588++;
        if (!arg2) {
            method329(125, 16, -5, 118, 21, -90, -11, -61, 86, 25, -89, -114, 118, -43);
        }
        class485 var5 = arg0.method1759(-113);
        int var6 = arg0.field3887 - arg0.field3840.field2028 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg0.field3836 > 25) {
                arg0.field3829 = false;
                if (arg4 < 0 && var5.field7146 != -1) {
                    arg0.field3839 = var5.field7146;
                } else if (arg4 <= 0 || var5.field7150 == -1) {
                    arg0.field3839 = var5.field7149;
                } else {
                    arg0.field3839 = var5.field7150;
                }
            } else if (!arg0.field3829 || !var5.method2907(arg0.field3839, 0)) {
                arg0.field3839 = var5.method2906((byte) 107);
                arg0.field3829 = arg0.field3839 != -1;
            }
        } else if (arg0.field3833 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class52.field736[arg1] - arg0.field3840.field2028 & 0x3FFF;
            if (arg3 == 2 && var5.field7140 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field7144 != -1) {
                    arg0.field3839 = var5.field7144;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7182 != -1) {
                    arg0.field3839 = var5.field7182;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7172 == -1) {
                    arg0.field3839 = var5.field7140;
                } else {
                    arg0.field3839 = var5.field7172;
                }
            } else if (arg3 == 0 && var5.field7164 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field7171 != -1) {
                    arg0.field3839 = var5.field7171;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7186 != -1) {
                    arg0.field3839 = var5.field7186;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7166 == -1) {
                    arg0.field3839 = var5.field7164;
                } else {
                    arg0.field3839 = var5.field7166;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field7158 != -1) {
                arg0.field3839 = var5.field7158;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field7167 != -1) {
                arg0.field3839 = var5.field7167;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field7153 == -1) {
                arg0.field3839 = var5.field7149;
            } else {
                arg0.field3839 = var5.field7153;
            }
            arg0.field3829 = false;
        } else if (var6 == 0 && arg0.field3836 <= 25) {
            if (arg3 == 2 && var5.field7140 != -1) {
                arg0.field3839 = var5.field7140;
            } else if (arg3 == 0 && var5.field7164 != -1) {
                arg0.field3839 = var5.field7164;
            } else {
                arg0.field3839 = var5.field7149;
            }
            arg0.field3829 = false;
        } else {
            if (arg3 == 2 && var5.field7140 != -1) {
                if (arg4 < 0 && var5.field7151 != -1) {
                    arg0.field3839 = var5.field7151;
                } else if (arg4 <= 0 || var5.field7157 == -1) {
                    arg0.field3839 = var5.field7140;
                } else {
                    arg0.field3839 = var5.field7157;
                }
            } else if (arg3 == 0 && var5.field7164 != -1) {
                if (arg4 < 0 && var5.field7142 != -1) {
                    arg0.field3839 = var5.field7142;
                } else if (arg4 <= 0 || var5.field7161 == -1) {
                    arg0.field3839 = var5.field7164;
                } else {
                    arg0.field3839 = var5.field7161;
                }
            } else if (arg4 < 0 && var5.field7173 != -1) {
                arg0.field3839 = var5.field7173;
            } else if (arg4 <= 0 || var5.field7176 == -1) {
                arg0.field3839 = var5.field7149;
            } else {
                arg0.field3839 = var5.field7176;
            }
            arg0.field3829 = false;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 169)
    public static final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field589++;
        if (class306.field4447 == null) {
            return;
        }
        class275 var14 = null;
        if (arg5 >= 0) {
            int var15 = arg5 - 1;
            class24 var16 = (class24) class406.field6158.method1747((long) var15, false);
            if (var16 != null) {
                var14 = var16.field348;
            }
        } else {
            int var17 = -arg5 - 1;
            if (class350.field5400 == var17) {
                var14 = class56.field800;
            } else {
                var14 = class241.field3398[var17];
            }
        }
        if (var14 == null) {
            return;
        }
        class209 var18 = class432.field6575.method1872(arg9, false);
        int var19;
        int var20;
        if (arg1 == 1 || arg1 == 3) {
            var20 = var18.field2925;
            var19 = var18.field2928;
        } else {
            var19 = var18.field2925;
            var20 = var18.field2928;
        }
        int var21 = arg13 + (var20 >> 1);
        int var22 = (var20 + 1 >> 1) + arg13;
        int var23 = (var19 >> 1) + arg7;
        int var24 = (var19 + 1 >> 1) + arg7;
        class23 var25 = class306.field4447[arg11];
        int var26 = var25.method222(var21, var23) - (-var25.method222(var22, var23) - var25.method222(var21, var24) - var25.method222(var22, var24)) >> 2;
        class286 var27 = new class286();
        var27.field4180 = class393.field6017 + arg10;
        var27.field4182 = arg9;
        var27.field4177 = arg7;
        var27.field4187 = arg1;
        var27.field4184 = arg8;
        var27.field4188 = class393.field6017 + arg2;
        if (arg6 < arg4) {
            int var28 = arg4;
            arg4 = arg6;
            arg6 = var28;
        }
        var27.field4186 = arg13;
        var27.field4192 = var14.field1866;
        var27.field4181 = arg6 + arg13;
        if (arg12 < arg0) {
            int var29 = arg0;
            arg0 = arg12;
            arg12 = var29;
        }
        var27.field4183 = arg13 + arg4;
        if (arg3 != -32221) {
            method328(null, 3, true, 122, 96);
        }
        var27.field4185 = var26;
        var27.field4191 = (var27.field4186 << 7) + (var20 << 6);
        var27.field4194 = arg7 + arg12;
        var27.field4196 = (var27.field4177 << 7) + (var19 << 6);
        var27.field4190 = arg0 + arg7;
        class83.field1209.method453((byte) 109, var27);
        var14.field3909 = var27;
    }
}
