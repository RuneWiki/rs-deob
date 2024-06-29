import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 extends class96 {

    @OriginalMember(owner = "client!ir", name = "Nc", descriptor = "I")
    public int field206 = -1;

    @OriginalMember(owner = "client!ir", name = "gd", descriptor = "I")
    public int field225 = -1;

    @OriginalMember(owner = "client!ir", name = "Tc", descriptor = "I")
    public static int field212 = -1;

    @OriginalMember(owner = "client!ir", name = "Mc", descriptor = "Lho;")
    public static class103 field205 = new class103(45, -1);

    @OriginalMember(owner = "client!ir", name = "Lc", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ir", name = "Oc", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ir", name = "Pc", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ir", name = "Qc", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ir", name = "Rc", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ir", name = "Sc", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ir", name = "Uc", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ir", name = "Vc", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ir", name = "Wc", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ir", name = "Xc", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ir", name = "Yc", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ir", name = "Zc", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ir", name = "ad", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ir", name = "cd", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ir", name = "dd", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ir", name = "ed", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ir", name = "fd", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ir", name = "bd", descriptor = "Ldh;")
    public class212 field220;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(BLza;)Luc;", line = 3)
    public final class23 method50(byte arg0, class287 arg1) {
        ++field215;
        if (this.field220 != null && this.method131(arg1, 126, 2048)) {
            if (arg0 != -112) {
                this.method132(25);
            }
            class124 var3 = arg1.method1183();
            int var4 = super.field1231.method615(arg0 + 111);
            var3.method749(var4);
            var3.method757(super.field3704, super.field3700, super.field3694);
            class306 var5 = this.method547((byte) 117);
            class212 var6 = this.field220.field2903 == null ? this.field220 : this.field220.method1350(class52.field606, -1);
            if (class319.field4256.field4669 && var6.field2887 && var5.field4067) {
                class260 var7 = ~super.field1196 != 0 && super.field1152 == 0 ? class7.field97.method2951(super.field1196, -13765) : null;
                class260 var8 = ~super.field1216 == 0 || super.field1176 && var7 != null ? null : class7.field97.method2951(super.field1216, arg0 + -13653);
                int var9 = 0;
                if (~super.field1228 != -1) {
                    var9 = this.method552(arg0 ^ 29788);
                }
                class373 var10 = class33.method183(this.field220.field2904, this.field220.field2866 & 65535, var8 == null ? var7 : var8, 68, super.field1161, super.field1168, arg1, var9, super.field1178, super.field1259[0], var8 == null ? super.field1233 : super.field1159, 255 & this.field220.field2883, this.field220.field2863 & 255, var4, this.field220.field2906 & 65535);
                if (var10 != null) {
                    float var11 = arg1.method1223();
                    float var12 = arg1.method1155();
                    arg1.method1175(false);
                    arg1.method1140(var11, var12 - 150.0F);
                    var10.method2051(var3, (class82) null, 0);
                    arg1.method1140(var11, var12);
                    arg1.method1175(true);
                }
            }
            class23 var13 = null;
            if (this.method127(2)) {
                var13 = class117.method703(super.field1259.length, -124);
            }
            if (super.field1253 == null) {
                arg1.method1170(super.field1259, var3, var13 == null ? null : var13.field226, 0);
            } else {
                class336 var14 = super.field1253.method257();
                arg1.method1156(super.field1259, var14, var3, var13 != null ? var13.field226 : null, 0);
            }
            this.method541(false, true, arg1, super.field1259);
            if (super.field1259[2] != null) {
                if (~var4 != -1) {
                    super.field1259[2].method2014(var4);
                }
                super.field1259[2].method2044(-super.field1252.field2821 + super.field3704, super.field3700 - super.field1252.field2816, -super.field1252.field2830 + super.field3694);
            }
            super.field1259[0] = super.field1259[1] = super.field1259[2] = super.field1259[3] = null;
            super.field1242 = class431.field6268;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(B)V", line = 84)
    public final void method42(byte arg0) {
        ++field216;
        if (arg0 != 92) {
            this.method42((byte) -104);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIZILot;Lza;)V", line = 95)
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        int var8 = 9 % ((arg0 - 61) / 47);
        ++field214;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "(B)I", line = 105)
    public final int method123(byte arg0) {
        ++field224;
        int var2 = -50 % ((arg0 - -60) / 32);
        if (this.field220.field2903 != null) {
            class212 var3 = this.field220.method1350(class52.field606, -1);
            if (var3 != null && var3.field2871 != -1) {
                return var3.field2871;
            }
        }
        return ~this.field220.field2871 == 0 ? super.method123((byte) -124) : this.field220.field2871;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZLdh;)V", line = 126)
    public final void method124(boolean arg0, class212 arg1) {
        this.field220 = arg1;
        if (arg0) {
            ++field217;
            if (super.field1253 != null) {
                super.field1253.method263();
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZIIII)V", line = 141)
    public final void method125(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field3695 = (byte) arg4;
        ++field219;
        if (~super.field1196 != 0 && ~class7.field97.method2951(super.field1196, -13765).field3473 == -2) {
            super.field1196 = -1;
        }
        if (~super.field1210 != 0) {
            class88 var7 = class71.field914.method1608((byte) 82, super.field1210);
            if (var7.field1051 && ~var7.field1047 != 0 && class7.field97.method2951(var7.field1047, arg2 + -13765).field3473 == 1) {
                super.field1210 = -1;
            }
        }
        if (~super.field1193 != 0) {
            class88 var8 = class71.field914.method1608((byte) 82, super.field1193);
            if (var8.field1051 && var8.field1047 != -1 && class7.field97.method2951(var8.field1047, arg2 + -13765).field3473 == 1) {
                super.field1193 = -1;
            }
        }
        if (!arg1) {
            int var9 = arg5 - super.field1249[0];
            int var10 = -super.field1251[0] + arg3;
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && var10 <= 8) {
                if (super.field1254 < 9) {
                    ++super.field1254;
                }
                for (int var11 = super.field1254; ~var11 < -1; --var11) {
                    super.field1249[var11] = super.field1249[var11 + -1];
                    super.field1251[var11] = super.field1251[var11 - 1];
                    super.field1255[var11] = super.field1255[var11 + -1];
                }
                super.field1249[0] = arg5;
                super.field1251[0] = arg3;
                super.field1255[0] = 1;
                return;
            }
        }
        super.field1256 = 0;
        super.field1257 = 0;
        super.field1249[0] = arg5;
        super.field1254 = 0;
        super.field1251[arg2] = arg3;
        super.field3704 = (super.field1249[0] << 7) + (arg0 << 6);
        super.field3694 = (super.field1251[0] << 7) + (arg0 << 6);
        if (super.field1253 != null) {
            super.field1253.method263();
        }
    }

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)V", line = 215)
    public static void method126(int arg0) {
        field205 = null;
        if (arg0 != 0) {
            method126(7);
        }
    }

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)Z", line = 225)
    private final boolean method127(int arg0) {
        ++field211;
        if (arg0 != 2) {
            this.method36((byte) -36, (class287) null);
        }
        return this.field220.field2847;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILza;BI)Z", line = 238)
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        ++field221;
        if (this.field220 != null && this.method131(arg1, 126, 131072)) {
            class124 var5 = arg1.method1183();
            int var6 = super.field1231.method615(-1);
            var5.method749(var6);
            var5.method757(super.field3704, super.field3700, super.field3694);
            boolean var7 = false;
            if (arg2 >= -64) {
                return true;
            } else {
                for (int var8 = 0; super.field1259.length > var8; ++var8) {
                    if (super.field1259[var8] != null && super.field1259[var8].method2026(arg3, arg0, var5, this.field220.field2904 == 1)) {
                        var7 = true;
                        break;
                    }
                }
                super.field1259[0] = super.field1259[1] = super.field1259[2] = super.field1259[3] = null;
                return var7;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)Z", line = 276)
    public final boolean method41(byte arg0) {
        if (arg0 != -62) {
            this.field220 = null;
        }
        ++field208;
        return false;
    }

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "(B)Z", line = 290)
    public final boolean method128(byte arg0) {
        if (arg0 != -65) {
            this.method124(true, (class212) null);
        }
        ++field218;
        return this.field220 != null;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(BLza;)V", line = 305)
    public final void method36(byte arg0, class287 arg1) {
        ++field209;
        if (this.field220 != null) {
            if (super.field1258 || this.method131(arg1, 126, 0)) {
                this.method541(super.field1258, true, arg1, super.field1259);
                if (arg0 >= -120) {
                    this.field225 = -77;
                }
                super.field1259[0] = super.field1259[1] = super.field1259[2] = super.field1259[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V", line = 328)
    public final void method129(int arg0, int arg1, int arg2) {
        ++field204;
        int var4 = super.field1249[0];
        int var5 = super.field1251[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var5;
            ++var4;
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (arg0 == 4) {
            --var5;
        }
        if (~arg0 == -6) {
            --var4;
            --var5;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (arg0 == 7) {
            ++var5;
            --var4;
        }
        if (super.field1196 != -1 && ~class7.field97.method2951(super.field1196, -13765).field3473 == -2) {
            super.field1196 = -1;
        }
        if (super.field1210 != arg1) {
            class88 var6 = class71.field914.method1608((byte) 82, super.field1210);
            if (var6.field1051 && var6.field1047 != -1 && ~class7.field97.method2951(var6.field1047, arg1 + -13764).field3473 == -2) {
                super.field1210 = -1;
            }
        }
        if (super.field1193 != -1) {
            class88 var7 = class71.field914.method1608((byte) 82, super.field1193);
            if (var7.field1051 && ~var7.field1047 != 0 && class7.field97.method2951(var7.field1047, -13765).field3473 == 1) {
                super.field1193 = -1;
            }
        }
        if (super.field1254 < 9) {
            ++super.field1254;
        }
        for (int var8 = super.field1254; var8 > 0; --var8) {
            super.field1249[var8] = super.field1249[var8 - 1];
            super.field1251[var8] = super.field1251[var8 + -1];
            super.field1255[var8] = super.field1255[var8 + -1];
        }
        super.field1249[0] = var4;
        super.field1251[0] = var5;
        super.field1255[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I", line = 420)
    public final int method130(int arg0) {
        ++field222;
        if (this.field220.field2903 != null) {
            class212 var2 = this.field220.method1350(class52.field606, -1);
            if (var2 != null && ~var2.field2838 != 0) {
                return var2.field2838;
            }
        }
        if (arg0 != 12150) {
            this.field206 = 125;
        }
        return this.field220.field2838;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lza;II)Z", line = 441)
    private final boolean method131(class287 arg0, int arg1, int arg2) {
        ++field207;
        int var4 = arg2;
        class306 var5 = this.method547((byte) 117);
        if (arg1 <= 125) {
            this.field206 = 121;
        }
        class260 var6 = super.field1196 != -1 && ~super.field1152 == -1 ? class7.field97.method2951(super.field1196, -13765) : null;
        class260 var7 = ~super.field1216 == 0 || super.field1176 && var6 != null ? null : class7.field97.method2951(super.field1216, -13765);
        int var8 = var5.field4079;
        int var9 = var5.field4105;
        if (var8 != 0 || ~var9 != -1 || var5.field4099 != 0 || var5.field4104 != 0) {
            arg2 |= 7;
        }
        boolean var10 = super.field1167 != 0 && ~class532.field7836 <= ~super.field1173 && super.field1238 > class532.field7836;
        if (var10) {
            arg2 |= 524288;
        }
        class373 var11 = super.field1259[0] = this.field220.method1358(super.field1159, var7, arg2, super.field1218, super.field1197, super.field1245, class254.field3381, arg0, -99, super.field1182, var6, class7.field97, super.field1233, class52.field606, super.field1186);
        if (var11 == null) {
            return false;
        } else {
            super.field1190 = var11.method2041();
            this.method544(var11, -129);
            int var12 = super.field1231.method615(-1);
            if (~var8 == -1 && ~var9 == -1) {
                this.method539(0, this.method546(24273) << 7, this.method546(24273) << 7, (byte) -84, 0, var12);
            } else {
                this.method539(var5.field4094, var8, var9, (byte) -102, var5.field4092, var12);
                if (super.field1161 != 0) {
                    super.field1259[0].method2022(super.field1161);
                }
                if (~super.field1168 != -1) {
                    super.field1259[0].method2039(super.field1168);
                }
                if (super.field1178 != 0) {
                    super.field1259[0].method2044(0, super.field1178, 0);
                }
            }
            if (var10) {
                var11.method2030(super.field1239, super.field1185, super.field1164, 255 & super.field1167);
            }
            if (super.field1210 != -1 && super.field1174 != -1) {
                class88 var13 = class71.field914.method1608((byte) 82, super.field1210);
                boolean var14 = ~var13.field1055 == -4 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (~super.field1191 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field1202 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class373 var16 = super.field1259[1] = var13.method488(class7.field97, var15, super.field1180, super.field1232, arg0, -30852, super.field1174);
                if (var16 != null) {
                    if (super.field1202 != 0) {
                        var16.method2044(0, -super.field1202 << 0, 0);
                    }
                    if (super.field1191 != 0) {
                        var16.method2014(super.field1191 * 2048);
                    }
                    if (var14) {
                        if (~super.field1161 != -1) {
                            var16.method2022(super.field1161);
                        }
                        if (~super.field1168 != -1) {
                            var16.method2039(super.field1168);
                        }
                        if (~super.field1178 != -1) {
                            var16.method2044(0, super.field1178, 0);
                        }
                    }
                }
            } else {
                super.field1259[1] = null;
            }
            if (super.field1193 != -1 && ~super.field1181 != 0) {
                class88 var17 = class71.field914.method1608((byte) 82, super.field1193);
                boolean var18 = ~var17.field1055 == -4 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (super.field1234 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field1162 != 0) {
                        var19 |= 2;
                    }
                }
                class373 var20 = super.field1259[3] = var17.method483(super.field1240, var19, class7.field97, super.field1220, super.field1181, arg0, 0);
                if (var20 != null) {
                    if (~super.field1162 != -1) {
                        var20.method2044(0, -super.field1162 << 0, 0);
                    }
                    if (~super.field1234 != -1) {
                        var20.method2014(super.field1234 * 2048);
                    }
                    if (var18) {
                        if (super.field1161 != 0) {
                            var20.method2022(super.field1161);
                        }
                        if (~super.field1168 != -1) {
                            var20.method2039(super.field1168);
                        }
                        if (~super.field1178 != -1) {
                            var20.method2044(0, super.field1178, 0);
                        }
                    }
                }
            } else {
                super.field1259[3] = null;
            }
            super.field1259[2] = null;
            if (super.field1252 != null) {
                if (super.field1252.field2817 <= class532.field7836) {
                    super.field1252 = null;
                } else if (~super.field1252.field2822 >= ~class532.field7836) {
                    class373 var21 = super.field1252.method1345(-117, arg0, var4 | 7);
                    if (var21 != null) {
                        var21.method2044(-super.field3704 + super.field1252.field2821, super.field1252.field2816 - super.field3700, -super.field3694 + super.field1252.field2830);
                        if (~var12 != -1) {
                            var21.method2014(var12);
                        }
                        super.field1259[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)I", line = 642)
    public final int method132(int arg0) {
        if (arg0 >= -103) {
            return -86;
        } else {
            ++field223;
            return super.field1190;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I", line = 662)
    public final int method133(int arg0) {
        ++field213;
        if (arg0 != 7) {
            this.field225 = -35;
        }
        if (this.field220.field2903 != null) {
            class212 var2 = this.field220.method1350(class52.field606, -1);
            if (var2 != null && var2.field2902 != -1) {
                return var2.field2902;
            }
        }
        return this.field220.field2902;
    }
}
