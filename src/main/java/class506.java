import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class506 extends class32 {

    @OriginalMember(owner = "client!ac", name = "Ec", descriptor = "I")
    public int field6324 = -1;

    @OriginalMember(owner = "client!ac", name = "Jc", descriptor = "I")
    public int field6329 = -1;

    @OriginalMember(owner = "client!ac", name = "Nc", descriptor = "Ldr;")
    public static class675 field6333 = new class675(79, 0);

    @OriginalMember(owner = "client!ac", name = "xc", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!ac", name = "yc", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!ac", name = "zc", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!ac", name = "Ac", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ac", name = "Bc", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!ac", name = "Cc", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!ac", name = "Dc", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!ac", name = "Fc", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!ac", name = "Hc", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!ac", name = "Ic", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!ac", name = "Kc", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!ac", name = "Lc", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!ac", name = "Mc", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!ac", name = "Pc", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!ac", name = "Qc", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!ac", name = "Rc", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!ac", name = "Sc", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!ac", name = "Oc", descriptor = "Laj;")
    public static class292 field6334;

    @OriginalMember(owner = "client!ac", name = "Gc", descriptor = "Lql;")
    public class689 field6326;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILql;)V", line = 4)
    public final void method2759(int arg0, class689 arg1) {
        if (arg0 != 0) {
            method2760(85);
        }
        ++field6319;
        this.field6326 = arg1;
        if (super.field504 != null) {
            super.field504.method113();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILoa;)Lww;", line = 21)
    public final class686 method11(int arg0, class650 arg1) {
        ++field6328;
        if (this.field6326 != null && this.method2764((byte) -85, arg1, 2048)) {
            class396 var3 = arg1.method470();
            if (arg0 >= -89) {
                this.method6((class650) null, 51);
            }
            int var4 = super.field477.method2388(-52);
            var3.method580(var4);
            var3.method588(super.field8018, super.field8013 + -20, super.field8011);
            class403 var5 = this.method209(2);
            class689 var6 = this.field6326.field9546 != null ? this.field6326.method3812(class327.field4084, -125) : this.field6326;
            if (class611.field8310.field8712 && var6.field9531 && var5.field5174) {
                class207 var7 = super.field447 != -1 && super.field472 == 0 ? class11.field110.method1141(super.field447, (byte) 125) : null;
                class207 var8 = ~super.field465 == 0 || super.field488 && var7 != null ? null : class11.field110.method1141(super.field465, (byte) 118);
                int var9 = 0;
                if (super.field435 != 0) {
                    var9 = this.method218(106);
                }
                class359 var10 = class237.method1427(true, this.field6326.field9495, 65535 & this.field6326.field9537, this.field6326.field9491 & 255, 65535 & this.field6326.field9557, super.field464, arg1, super.field473, super.field512[0], super.field467, var8 == null ? super.field478 : super.field487, var9, var4, 255 & this.field6326.field9513, var8 == null ? var7 : var8);
                if (var10 != null) {
                    arg1.method455(false);
                    var10.method2049(var3, (class524) null, 0);
                    arg1.method455(true);
                }
            }
            var3.method580(var4);
            var3.method588(super.field8018, super.field8013 - 5, super.field8011);
            class686 var11 = null;
            if (this.method2765(0)) {
                var11 = class458.method2520(0, super.field512.length);
            }
            this.method214(arg1, false, super.field512, var3, -124);
            if (super.field504 == null) {
                arg1.method491(super.field512, var3, var11 == null ? null : var11.field9361, 0);
            } else {
                class228 var12 = super.field504.method105();
                arg1.method480(super.field512, var12, var3, var11 == null ? null : var11.field9361, 0);
            }
            super.field512[0] = super.field512[1] = super.field512[2] = super.field512[3] = null;
            super.field425 = class197.field2318;
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I", line = 92)
    public final int method217(byte arg0) {
        ++field6337;
        if (this.field6326.field9546 != null) {
            class689 var2 = this.field6326.method3812(class327.field4084, -123);
            if (var2 != null && ~var2.field9488 != 0) {
                return var2.field9488;
            }
        }
        return arg0 != -34 ? -121 : this.field6326.field9488;
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)V", line = 115)
    public static void method2760(int arg0) {
        field6334 = null;
        field6333 = null;
        if (arg0 < 89) {
            method2760(91);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILoa;I)Z", line = 127)
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        ++field6317;
        if (this.field6326 != null && this.method2764((byte) -53, arg2, 131072)) {
            class396 var5 = arg2.method470();
            int var6 = 101 / ((77 - arg0) / 40);
            int var7 = super.field477.method2388(-97);
            var5.method580(var7);
            var5.method588(super.field8018, super.field8013, super.field8011);
            boolean var8 = false;
            for (int var9 = 0; ~super.field512.length < ~var9; ++var9) {
                if (super.field512[var9] != null) {
                    boolean var10 = this.field6326.field9501 == -1 ? this.field6326.field9495 == 1 : ~this.field6326.field9501 == -2;
                    boolean var11 = super.field512[var9].method2074(arg3, arg1, var5, var10);
                    if (var11) {
                        var8 = true;
                        break;
                    }
                }
            }
            super.field512[0] = super.field512[1] = super.field512[2] = super.field512[3] = null;
            return var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)I", line = 171)
    public final int method212(int arg0) {
        if (arg0 != 0) {
            field6334 = null;
        }
        ++field6321;
        if (this.field6326.field9546 != null) {
            class689 var2 = this.field6326.method3812(class327.field4084, arg0 + -127);
            if (var2 != null && var2.field9532 != -1) {
                return var2.field9532;
            }
        }
        return ~this.field6326.field9532 == 0 ? super.method212(arg0) : this.field6326.field9532;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)I", line = 191)
    public final int method2117(int arg0) {
        ++field6330;
        return arg0 != 9295 ? -9 : super.field458;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIZI)V", line = 203)
    public final void method2761(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field8010 = (byte) arg2;
        ++field6336;
        if (super.field447 != -1 && class11.field110.method1141(super.field447, (byte) -13).field2443 == 1) {
            super.field448 = null;
            super.field447 = -1;
        }
        if (super.field429 != -1) {
            class561 var7 = class339.field4336.method2158((byte) -25, super.field429);
            if (var7.field7006 && ~var7.field7016 != 0 && ~class11.field110.method1141(var7.field7016, (byte) 125).field2443 == -2) {
                super.field429 = -1;
            }
        }
        int var8 = 18 / ((arg0 - -67) / 54);
        if (~super.field492 != 0) {
            class561 var9 = class339.field4336.method2158((byte) -25, super.field492);
            if (var9.field7006 && ~var9.field7016 != 0 && ~class11.field110.method1141(var9.field7016, (byte) 115).field2443 == -2) {
                super.field492 = -1;
            }
        }
        if (!arg4) {
            int var10 = arg3 - super.field508[0];
            int var11 = -super.field511[0] + arg1;
            if (var10 >= -8 && var10 <= 8 && ~var11 <= 7 && var11 <= 8) {
                if (super.field503 < 9) {
                    ++super.field503;
                }
                for (int var12 = super.field503; var12 > 0; --var12) {
                    super.field508[var12] = super.field508[var12 + -1];
                    super.field511[var12] = super.field511[var12 + -1];
                    super.field505[var12] = super.field505[var12 - 1];
                }
                super.field508[0] = arg3;
                super.field505[0] = 1;
                super.field511[0] = arg1;
                return;
            }
        }
        super.field503 = 0;
        super.field509 = 0;
        super.field506 = 0;
        super.field508[0] = arg3;
        super.field511[0] = arg1;
        super.field8011 = (super.field511[0] << 9) + (arg5 << 8);
        super.field8018 = (super.field508[0] << 9) + (arg5 << 8);
        if (super.field504 != null) {
            super.field504.method113();
        }
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)I", line = 284)
    public final int method215(int arg0) {
        ++field6323;
        if (arg0 != 200) {
            field6334 = null;
        }
        if (this.field6326.field9546 != null) {
            class689 var2 = this.field6326.method3812(class327.field4084, -122);
            if (var2 != null && ~var2.field9522 != 0) {
                return var2.field9522;
            }
        }
        return this.field6326.field9522;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V", line = 306)
    public final void method140(byte arg0) {
        ++field6332;
        int var2 = -49 / ((-16 - arg0) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLoa;Lnt;IIII)V", line = 316)
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6320;
        if (arg6 == 12137) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Loa;B)V", line = 327)
    public final void method7(class650 arg0, byte arg1) {
        if (arg1 == 98) {
            ++field6325;
            if (this.field6326 != null) {
                if (super.field513 || this.method2764((byte) -58, arg0, 0)) {
                    class396 var3 = arg0.method470();
                    var3.method580(super.field477.method2388(-48));
                    var3.method588(super.field8018, super.field8013 + -20, super.field8011);
                    this.method214(arg0, super.field513, super.field512, var3, -121);
                    super.field512[0] = super.field512[1] = super.field512[2] = super.field512[3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)Z", line = 355)
    public final boolean method2762(byte arg0) {
        if (arg0 > -13) {
            return true;
        } else {
            ++field6335;
            return this.field6326 != null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Loa;I)Lqt;", line = 371)
    public final class595 method6(class650 arg0, int arg1) {
        if (arg1 != -7459) {
            field6334 = null;
        }
        ++field6327;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 382)
    public final void method2763(int arg0, int arg1, int arg2) {
        ++field6331;
        int var4 = super.field508[0];
        int var5 = super.field511[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var4;
            ++var5;
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (arg0 == 3) {
            --var5;
            ++var4;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var4;
            --var5;
        }
        if (arg1 < 12) {
            this.field6329 = 44;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~super.field447 != 0 && class11.field110.method1141(super.field447, (byte) 119).field2443 == 1) {
            super.field447 = -1;
            super.field448 = null;
        }
        if (arg0 == 7) {
            --var4;
            ++var5;
        }
        if (super.field429 != -1) {
            class561 var6 = class339.field4336.method2158((byte) -25, super.field429);
            if (var6.field7006 && var6.field7016 != -1 && class11.field110.method1141(var6.field7016, (byte) 16).field2443 == 1) {
                super.field429 = -1;
            }
        }
        if (~super.field492 != 0) {
            class561 var7 = class339.field4336.method2158((byte) -25, super.field492);
            if (var7.field7006 && ~var7.field7016 != 0 && ~class11.field110.method1141(var7.field7016, (byte) 119).field2443 == -2) {
                super.field492 = -1;
            }
        }
        if (super.field503 < 9) {
            ++super.field503;
        }
        for (int var8 = super.field503; ~var8 < -1; --var8) {
            super.field508[var8] = super.field508[var8 + -1];
            super.field511[var8] = super.field511[var8 + -1];
            super.field505[var8] = super.field505[var8 + -1];
        }
        super.field508[0] = var4;
        super.field511[0] = var5;
        super.field505[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLoa;I)Z", line = 483)
    private final boolean method2764(byte arg0, class650 arg1, int arg2) {
        ++field6338;
        int var4 = arg2;
        class403 var5 = this.method209(2);
        class207 var6 = ~super.field447 != 0 && super.field472 == 0 ? class11.field110.method1141(super.field447, (byte) -114) : null;
        class207 var7 = ~super.field465 == 0 || super.field488 && var6 != null ? null : class11.field110.method1141(super.field465, (byte) 108);
        int var8 = var5.field5198;
        int var9 = var5.field5176;
        if (~var8 != -1 || ~var9 != -1 || var5.field5175 != 0 || var5.field5182 != 0) {
            arg2 |= 7;
        }
        boolean var10 = super.field416 != 0 && ~super.field493 >= ~class665.field9027 && ~class665.field9027 > ~super.field439;
        if (var10) {
            arg2 |= 524288;
        }
        class359 var11 = super.field512[0] = this.field6326.method3813(class11.field110, super.field444, class510.field6389, super.field466, super.field418, super.field407, var6, var7, arg2, 125, class327.field4084, super.field478, arg1, super.field442, super.field487);
        if (var11 == null) {
            return false;
        } else {
            super.field458 = var11.method2084();
            this.method220(2, var11);
            int var12 = 126 % ((11 - arg0) / 55);
            int var13 = super.field477.method2388(-92);
            if (var8 == 0 && var9 == 0) {
                this.method211(this.method210(false) << 9, var13, this.method210(false) << 9, 0, 23314, 0);
            } else {
                this.method211(var8, var13, var9, var5.field5183, 23314, var5.field5187);
                if (~super.field473 != -1) {
                    super.field512[0].method2083(super.field473);
                }
                if (super.field464 != 0) {
                    super.field512[0].method2070(super.field464);
                }
                if (super.field467 != 0) {
                    super.field512[0].method2066(0, super.field467, 0);
                }
            }
            if (var10) {
                var11.method2060(super.field423, super.field412, super.field419, 255 & super.field416);
            }
            if (super.field429 != -1 && ~super.field451 != 0) {
                class561 var14 = class339.field4336.method2158((byte) -25, super.field429);
                boolean var15 = var14.field7021 == 3 && (var8 != 0 || ~var9 != -1);
                int var16 = var4;
                if (var15) {
                    var16 = var4 | 7;
                } else {
                    if (~super.field482 != -1) {
                        var16 = var4 | 5;
                    }
                    if (~super.field462 != -1) {
                        var16 |= 2;
                    }
                }
                class359 var17 = super.field512[1] = var14.method2988(var16, super.field457, class11.field110, super.field474, super.field451, arg1, (byte) -103);
                if (var17 != null) {
                    if (super.field462 != 0) {
                        var17.method2066(0, -super.field462 << 2, 0);
                    }
                    if (~super.field482 != -1) {
                        var17.method2053(super.field482 * 2048);
                    }
                    if (var15) {
                        if (super.field473 != 0) {
                            var17.method2083(super.field473);
                        }
                        if (super.field464 != 0) {
                            var17.method2070(super.field464);
                        }
                        if (super.field467 != 0) {
                            var17.method2066(0, super.field467, 0);
                        }
                    }
                }
            } else {
                super.field512[1] = null;
            }
            if (super.field492 != -1 && super.field438 != -1) {
                class561 var18 = class339.field4336.method2158((byte) -25, super.field492);
                boolean var19 = ~var18.field7021 == -4 && (var8 != 0 || var9 != 0);
                int var20 = var4;
                if (var19) {
                    var20 = var4 | 7;
                } else {
                    if (~super.field440 != -1) {
                        var20 = var4 | 5;
                    }
                    if (~super.field481 != -1) {
                        var20 |= 2;
                    }
                }
                class359 var21 = super.field512[3] = var18.method2986(var20, super.field438, super.field454, super.field452, class11.field110, arg1, 0);
                if (var21 != null) {
                    if (~super.field481 != -1) {
                        var21.method2066(0, -super.field481 << 2, 0);
                    }
                    if (super.field440 != 0) {
                        var21.method2053(super.field440 * 2048);
                    }
                    if (var19) {
                        if (~super.field473 != -1) {
                            var21.method2083(super.field473);
                        }
                        if (super.field464 != 0) {
                            var21.method2070(super.field464);
                        }
                        if (~super.field467 != -1) {
                            var21.method2066(0, super.field467, 0);
                        }
                    }
                }
            } else {
                super.field512[3] = null;
            }
            super.field512[2] = null;
            if (super.field507 != null) {
                if (super.field507.field8146 <= class665.field9027) {
                    super.field507 = null;
                } else if (super.field507.field8153 <= class665.field9027) {
                    class359 var22 = super.field507.method3357(-28298, 7 | var4, arg1);
                    if (var22 != null) {
                        var22.method2066(-super.field8018 + super.field507.field8142, super.field507.field8150 + 5 + -super.field8013, super.field507.field8156 - super.field8011);
                        if (var13 != 0) {
                            var22.method2053(var13);
                        }
                        super.field512[2] = var22;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Z", line = 682)
    public final boolean method137(int arg0) {
        if (arg0 > -30) {
            return false;
        } else {
            ++field6318;
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "(I)Z", line = 694)
    private final boolean method2765(int arg0) {
        ++field6322;
        return arg0 != 0 ? false : this.field6326.field9555;
    }
}
