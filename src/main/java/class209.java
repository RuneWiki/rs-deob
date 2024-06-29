import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class209 extends class16 {

    @OriginalMember(owner = "client!jm", name = "Pc", descriptor = "I")
    public int field2979 = -1;

    @OriginalMember(owner = "client!jm", name = "Tc", descriptor = "I")
    public int field2983 = -1;

    @OriginalMember(owner = "client!jm", name = "gd", descriptor = "[I")
    public static int[] field2996;

    @OriginalMember(owner = "client!jm", name = "fd", descriptor = "Z")
    public static boolean field2995;

    @OriginalMember(owner = "client!jm", name = "ed", descriptor = "Lsn;")
    public static class205 field2994;

    @OriginalMember(owner = "client!jm", name = "Jc", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!jm", name = "Kc", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!jm", name = "Lc", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!jm", name = "Nc", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!jm", name = "Oc", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!jm", name = "Qc", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!jm", name = "Rc", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!jm", name = "Sc", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!jm", name = "Uc", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!jm", name = "Vc", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!jm", name = "Wc", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!jm", name = "Xc", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!jm", name = "Yc", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!jm", name = "Zc", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!jm", name = "ad", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!jm", name = "bd", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!jm", name = "cd", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!jm", name = "dd", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!jm", name = "Mc", descriptor = "Lum;")
    public class83 field2976;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Z")
    public final boolean method169(int arg0) {
        if (arg0 != -28206) {
            field2996 = null;
        }
        ++field2993;
        return false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLza;)Lql;")
    public final class121 method171(byte arg0, class295 arg1) {
        ++field2973;
        if (this.field2976 != null && this.method1328((byte) -71, 2048, arg1)) {
            if (arg0 != -96) {
                this.method1328((byte) 3, -47, (class295) null);
            }
            class512 var3 = arg1.method541();
            int var4 = super.field163.method1744(false);
            var3.method953(var4);
            var3.method948(super.field6284, super.field6281, super.field6287);
            class495 var5 = this.method108(true);
            class83 var6 = this.field2976.field1272 != null ? this.field2976.method655(class309.field4200, (byte) 117) : this.field2976;
            if (class76.field1075.field3669 && var6.field1223 && var5.field7205) {
                class55 var7 = ~super.field166 != 0 && ~super.field226 == -1 ? class50.field716.method831(super.field166, (byte) 54) : null;
                class55 var8 = ~super.field186 == 0 || super.field247 && var7 != null ? null : class50.field716.method831(super.field186, (byte) 54);
                int var9 = 0;
                if (~super.field172 != -1) {
                    var9 = this.method104(57);
                }
                class285 var10 = class321.method1907(this.field2976.field1274 & 255, this.field2976.field1264 & 65535, super.field235, var8 != null ? super.field240 : super.field194, arg1, (byte) -93, var9, 255 & this.field2976.field1235, this.field2976.field1270 & 65535, var4, super.field261[0], super.field230, this.field2976.field1228, var8 != null ? var8 : var7, super.field249);
                if (var10 != null) {
                    float var11 = arg1.method461();
                    float var12 = arg1.method472();
                    arg1.method528(false);
                    arg1.method462(var11, var12 + -150.0F);
                    var10.method701(var3, (class305) null, 0);
                    arg1.method462(var11, var12);
                    arg1.method528(true);
                }
            }
            class121 var13 = null;
            if (this.method1335(true)) {
                var13 = class399.method2364(super.field261.length, -29752);
            }
            if (super.field256 == null) {
                arg1.method457(super.field261, var3, var13 == null ? null : var13.field1878, 0);
            } else {
                class334 var14 = super.field256.method2731();
                arg1.method499(super.field261, var14, var3, var13 != null ? var13.field1878 : null, 0);
            }
            this.method113(arg1, super.field261, 3, false);
            if (super.field261[2] != null) {
                if (var4 != 0) {
                    super.field261[2].method704(var4);
                }
                super.field261[2].method675(-super.field259.field4287 + super.field6284, super.field6281 - super.field259.field4284, -super.field259.field4302 + super.field6287);
            }
            super.field201 = class367.field5267;
            super.field261[0] = super.field261[1] = super.field261[2] = super.field261[3] = null;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIZ)V")
    public final void method1327(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        super.field6279 = (byte) arg1;
        ++field2974;
        if (~super.field166 != 0 && class50.field716.method831(super.field166, (byte) 54).field814 == 1) {
            super.field166 = -1;
        }
        if (~super.field237 != 0) {
            class350 var7 = class316.field4288.method2651((byte) 59, super.field237);
            if (var7.field5086 && var7.field5089 != -1 && ~class50.field716.method831(var7.field5089, (byte) 54).field814 == -2) {
                super.field237 = -1;
            }
        }
        if (super.field175 != -1) {
            class350 var8 = class316.field4288.method2651((byte) 59, super.field175);
            if (var8.field5086 && ~var8.field5089 != 0 && class50.field716.method831(var8.field5089, (byte) 54).field814 == 1) {
                super.field175 = -1;
            }
        }
        if (!arg5) {
            int var9 = -super.field263[0] + arg4;
            int var10 = -super.field257[0] + arg2;
            if (var9 >= -8 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field265 > -10) {
                    ++super.field265;
                }
                for (int var11 = super.field265; ~var11 < -1; --var11) {
                    super.field263[var11] = super.field263[var11 + -1];
                    super.field257[var11] = super.field257[var11 + -1];
                    super.field258[var11] = super.field258[var11 + -1];
                }
                super.field263[0] = arg4;
                super.field258[0] = 1;
                super.field257[0] = arg2;
                return;
            }
        }
        super.field263[0] = arg4;
        super.field264 = 0;
        super.field265 = 0;
        super.field266 = 0;
        super.field257[0] = arg2;
        super.field6287 = (super.field257[0] << 7) - -(arg3 << 6);
        super.field6284 = (super.field263[0] << 7) + (arg3 << 6);
        if (super.field256 != null) {
            super.field256.method2735();
        }
        if (arg0 != 30) {
            this.method158(-98, (byte) -104, -109, (class295) null);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBILza;)Z")
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field2977;
        if (this.field2976 != null && this.method1328((byte) -57, 131072, arg3)) {
            class512 var5 = arg3.method541();
            int var6 = super.field163.method1744(false);
            var5.method953(var6);
            if (arg1 <= 58) {
                return false;
            } else {
                var5.method948(super.field6284, super.field6281, super.field6287);
                boolean var7 = false;
                for (int var8 = 0; ~super.field261.length < ~var8; ++var8) {
                    if (super.field261[var8] != null && super.field261[var8].method684(arg2, arg0, var5, ~this.field2976.field1228 == -2)) {
                        var7 = true;
                        break;
                    }
                }
                super.field261[0] = super.field261[1] = super.field261[2] = super.field261[3] = null;
                return var7;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BILza;)Z")
    private final boolean method1328(byte arg0, int arg1, class295 arg2) {
        ++field2991;
        int var4 = arg1;
        class495 var5 = this.method108(true);
        class55 var6 = ~super.field166 != 0 && ~super.field226 == -1 ? class50.field716.method831(super.field166, (byte) 54) : null;
        class55 var7 = ~super.field186 == 0 || super.field247 && var6 != null ? null : class50.field716.method831(super.field186, (byte) 54);
        int var8 = var5.field7174;
        int var9 = var5.field7162;
        if (~var8 != -1 || var9 != 0 || ~var5.field7179 != -1 || var5.field7164 != 0) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field156 != -1 && ~class28.field417 <= ~super.field241 && ~class28.field417 > ~super.field185;
        if (var10) {
            arg1 |= 524288;
        }
        class285 var11 = super.field261[0] = this.field2976.method648((byte) -60, var7, class438.field6318, super.field210, super.field212, class309.field4200, super.field236, class50.field716, super.field191, var6, super.field246, super.field194, arg2, super.field240, arg1);
        if (var11 == null) {
            return false;
        } else {
            super.field165 = var11.method670();
            this.method102((byte) -104, var11);
            int var12 = super.field163.method1744(false);
            if (var8 == 0 && ~var9 == -1) {
                this.method114(0, this.method116(8569) << 7, var12, -119, this.method116(8569) << 7, 0);
            } else {
                this.method114(var5.field7183, var9, var12, -116, var8, var5.field7188);
                if (super.field235 != 0) {
                    super.field261[0].method690(super.field235);
                }
                if (~super.field230 != -1) {
                    super.field261[0].method692(super.field230);
                }
                if (super.field249 != 0) {
                    super.field261[0].method675(0, super.field249, 0);
                }
            }
            int var13 = 62 / ((arg0 - 58) / 32);
            if (var10) {
                var11.method707(super.field177, super.field158, super.field209, super.field156 & 255);
            }
            if (~super.field237 != 0 && ~super.field222 != 0) {
                class350 var14 = class316.field4288.method2651((byte) 59, super.field237);
                boolean var15 = var14.field5097 == 3 && (var8 != 0 || ~var9 != -1);
                int var16 = var4;
                if (var15) {
                    var16 = var4 | 7;
                } else {
                    if (~super.field188 != -1) {
                        var16 = var4 | 5;
                    }
                    if (~super.field159 != -1) {
                        var16 |= 2;
                    }
                }
                class285 var17 = super.field261[1] = var14.method2102(super.field204, super.field222, var16, arg2, class50.field716, 98, super.field227);
                if (var17 != null) {
                    if (super.field159 != 0) {
                        var17.method675(0, -super.field159 << 0, 0);
                    }
                    if (super.field188 != 0) {
                        var17.method704(super.field188 * 2048);
                    }
                    if (var15) {
                        if (super.field235 != 0) {
                            var17.method690(super.field235);
                        }
                        if (super.field230 != 0) {
                            var17.method692(super.field230);
                        }
                        if (~super.field249 != -1) {
                            var17.method675(0, super.field249, 0);
                        }
                    }
                }
            } else {
                super.field261[1] = null;
            }
            if (~super.field175 != 0 && ~super.field242 != 0) {
                class350 var18 = class316.field4288.method2651((byte) 59, super.field175);
                boolean var19 = ~var18.field5097 == -4 && (~var8 != -1 || ~var9 != -1);
                int var20 = var4;
                if (var19) {
                    var20 = var4 | 7;
                } else {
                    if (~super.field176 != -1) {
                        var20 = var4 | 5;
                    }
                    if (super.field174 != 0) {
                        var20 |= 2;
                    }
                }
                class285 var21 = super.field261[3] = var18.method2096(class50.field716, arg2, super.field187, super.field203, super.field242, (byte) 17, var20);
                if (var21 != null) {
                    if (super.field174 != 0) {
                        var21.method675(0, -super.field174 << 0, 0);
                    }
                    if (super.field176 != 0) {
                        var21.method704(super.field176 * 2048);
                    }
                    if (var19) {
                        if (~super.field235 != -1) {
                            var21.method690(super.field235);
                        }
                        if (super.field230 != 0) {
                            var21.method692(super.field230);
                        }
                        if (super.field249 != 0) {
                            var21.method675(0, super.field249, 0);
                        }
                    }
                }
            } else {
                super.field261[3] = null;
            }
            super.field261[2] = null;
            if (super.field259 != null) {
                if (class28.field417 < super.field259.field4281) {
                    if (class28.field417 >= super.field259.field4297) {
                        class285 var22 = super.field259.method1821(-79, 7 | var4, arg2);
                        if (var22 != null) {
                            var22.method675(super.field259.field4287 - super.field6284, -super.field6281 + super.field259.field4284, -super.field6287 + super.field259.field4302);
                            if (~var12 != -1) {
                                var22.method704(var12);
                            }
                            super.field261[2] = var22;
                        }
                    }
                } else {
                    super.field259 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Llb;IZIBILza;)V")
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        ++field2987;
        if (arg4 < 54) {
            method1331(7);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IZI)I")
    public static final int method1329(int arg0, boolean arg1, int arg2) {
        ++field2988;
        int var3 = class28.method195(-31334, arg0 + -1, arg2 + -1) - -class28.method195(-31334, arg0 - 1, arg2 + 1) + (class28.method195(-31334, arg0 - -1, arg2 + -1) - -class28.method195(-31334, arg0 + 1, arg2 + 1));
        if (arg1) {
            return -126;
        } else {
            int var4 = class28.method195(-31334, arg0, arg2 - 1) - (-class28.method195(-31334, arg0, arg2 + 1) + (-class28.method195(-31334, arg0 + -1, arg2) - class28.method195(-31334, arg0 + 1, arg2)));
            int var5 = class28.method195(-31334, arg0, arg2);
            return var3 / 16 + var4 / 8 - -(var5 / 4);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lum;Z)V")
    public final void method1330(class83 arg0, boolean arg1) {
        this.field2976 = arg0;
        ++field2984;
        if (arg1) {
            this.method169(60);
        }
        if (super.field256 != null) {
            super.field256.method2735();
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)I")
    public final int method101(byte arg0) {
        ++field2975;
        if (this.field2976.field1272 != null) {
            class83 var2 = this.field2976.method655(class309.field4200, (byte) 116);
            if (var2 != null && var2.field1281 != -1) {
                return var2.field1281;
            }
        }
        int var3 = -63 / ((arg0 - -80) / 45);
        return this.field2976.field1281;
    }

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "(I)V")
    public static void method1331(int arg0) {
        field2996 = null;
        if (arg0 != 8) {
            method1329(96, false, -124);
        }
        field2994 = null;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)I")
    public static final int method1332(byte arg0) {
        ++field2978;
        int var1 = 58 / ((37 - arg0) / 38);
        return class330.field4488;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)I")
    public final int method836(int arg0) {
        ++field2986;
        if (arg0 != -32768) {
            method1329(-64, false, 112);
        }
        return super.field165;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)I")
    public final int method105(boolean arg0) {
        ++field2980;
        if (arg0) {
            this.method119(-7);
        }
        if (this.field2976.field1272 != null) {
            class83 var2 = this.field2976.method655(class309.field4200, (byte) 127);
            if (var2 != null && ~var2.field1221 != 0) {
                return var2.field1221;
            }
        }
        return this.field2976.field1221;
    }

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "(I)I")
    public final int method119(int arg0) {
        if (arg0 != 14336) {
            this.field2983 = 1;
        }
        ++field2992;
        if (this.field2976.field1272 != null) {
            class83 var2 = this.field2976.method655(class309.field4200, (byte) 115);
            if (var2 != null && var2.field1266 != -1) {
                return var2.field1266;
            }
        }
        return ~this.field2976.field1266 == 0 ? super.method119(14336) : this.field2976.field1266;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(Lza;I)V")
    public final void method166(class295 arg0, int arg1) {
        ++field2981;
        if (arg1 <= 7) {
            method1331(54);
        }
        if (this.field2976 != null) {
            if (super.field260 || this.method1328((byte) -2, 0, arg0)) {
                this.method113(arg0, super.field261, 3, super.field260);
                super.field261[0] = super.field261[1] = super.field261[2] = super.field261[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
    public final void method1333(int arg0, int arg1, int arg2) {
        ++field2989;
        int var4 = super.field263[0];
        int var5 = super.field257[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (~arg0 == -4) {
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
        if (~arg0 == -7) {
            --var4;
        }
        if (super.field166 != -1 && class50.field716.method831(super.field166, (byte) 54).field814 == 1) {
            super.field166 = -1;
        }
        if (arg0 == 7) {
            ++var5;
            --var4;
        }
        if (super.field237 != -1) {
            class350 var6 = class316.field4288.method2651((byte) 59, super.field237);
            if (var6.field5086 && ~var6.field5089 != 0 && class50.field716.method831(var6.field5089, (byte) 54).field814 == 1) {
                super.field237 = -1;
            }
        }
        if (super.field175 != arg1) {
            class350 var7 = class316.field4288.method2651((byte) 59, super.field175);
            if (var7.field5086 && ~var7.field5089 != 0 && ~class50.field716.method831(var7.field5089, (byte) 54).field814 == -2) {
                super.field175 = -1;
            }
        }
        if (~super.field265 > -10) {
            ++super.field265;
        }
        for (int var8 = super.field265; var8 > 0; --var8) {
            super.field263[var8] = super.field263[var8 + -1];
            super.field257[var8] = super.field257[var8 + -1];
            super.field258[var8] = super.field258[var8 + -1];
        }
        super.field263[0] = var4;
        super.field258[0] = (byte) arg2;
        super.field257[0] = var5;
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)V")
    public final void method168(int arg0) {
        int var2 = 116 / ((43 - arg0) / 56);
        ++field2982;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(B)Z")
    public final boolean method1334(byte arg0) {
        ++field2985;
        if (arg0 > -73) {
            field2995 = true;
        }
        return this.field2976 != null;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(Z)Z")
    private final boolean method1335(boolean arg0) {
        if (!arg0) {
            this.method836(-82);
        }
        ++field2990;
        return this.field2976.field1277;
    }

    static {
        new class157("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field2996 = new int[] { 2047, 16383, 65535 };
        field2995 = false;
        field2994 = new class205(11, 4);
    }
}
