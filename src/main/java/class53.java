import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class53 extends class523 {

    @OriginalMember(owner = "client!u", name = "Uc", descriptor = "I")
    public int field807 = -1;

    @OriginalMember(owner = "client!u", name = "ad", descriptor = "I")
    public int field813 = -1;

    @OriginalMember(owner = "client!u", name = "ed", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!u", name = "fd", descriptor = "Lvg;")
    public static class622 field818 = new class622(41, 3);

    @OriginalMember(owner = "client!u", name = "Pc", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!u", name = "Qc", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!u", name = "Rc", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!u", name = "Tc", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!u", name = "Vc", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!u", name = "Wc", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!u", name = "Xc", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!u", name = "Yc", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!u", name = "Zc", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!u", name = "bd", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!u", name = "cd", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!u", name = "dd", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!u", name = "gd", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!u", name = "hd", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!u", name = "id", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!u", name = "jd", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!u", name = "kd", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!u", name = "ld", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!u", name = "md", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!u", name = "Sc", descriptor = "Lrda;")
    public class76 field805;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZII)V", line = 3)
    public final void method307(boolean arg0, int arg1, int arg2) {
        ++field809;
        int var4 = super.field7430[0];
        int var5 = super.field7429[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
            ++var4;
        }
        if (arg0) {
            this.method309(false);
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (~arg1 == -4) {
            ++var4;
            --var5;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (~arg1 == -6) {
            --var4;
            --var5;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field7389 != 0 && ~class203.field2769.method2971(-119, super.field7389).field744 == -2) {
            super.field7389 = -1;
            super.field7328 = null;
        }
        if (super.field7360 != -1) {
            class525 var6 = class134.field1945.method3082((byte) 50, super.field7360);
            if (var6.field7470 && var6.field7457 != -1 && class203.field2769.method2971(-116, var6.field7457).field744 == 1) {
                super.field7360 = -1;
            }
        }
        if (super.field7353 != -1) {
            class525 var7 = class134.field1945.method3082((byte) 50, super.field7353);
            if (var7.field7470 && ~var7.field7457 != 0 && ~class203.field2769.method2971(-127, var7.field7457).field744 == -2) {
                super.field7353 = -1;
            }
        }
        if (~super.field7436 > -10) {
            ++super.field7436;
        }
        for (int var8 = super.field7436; ~var8 < -1; --var8) {
            super.field7430[var8] = super.field7430[var8 + -1];
            super.field7429[var8] = super.field7429[var8 + -1];
            super.field7439[var8] = super.field7439[var8 + -1];
        }
        super.field7430[0] = var4;
        super.field7439[0] = (byte) arg2;
        super.field7429[0] = var5;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(Lr;I)Lifa;", line = 102)
    public final class62 method268(class98 arg0, int arg1) {
        if (arg1 != 0) {
            this.method314(-79, -52, 96, -91, true, -3);
        }
        ++field804;
        return null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILr;I)Z", line = 113)
    private final boolean method308(int arg0, class98 arg1, int arg2) {
        ++field815;
        int var4 = arg0;
        class589 var5 = this.method2957(true);
        class47 var6 = ~super.field7389 != 0 && super.field7392 == 0 ? class203.field2769.method2971(arg2 + -52, super.field7389) : null;
        class47 var7 = super.field7334 == arg2 || super.field7404 && var6 != null ? null : class203.field2769.method2971(arg2 ^ 80, super.field7334);
        int var8 = var5.field8560;
        int var9 = var5.field8569;
        if (~var8 != -1 || ~var9 != -1 || var5.field8536 != 0 || var5.field8583 != 0) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field7332 != -1 && ~super.field7337 >= ~class45.field685 && ~super.field7421 < ~class45.field685;
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field7349.method2129(true);
        class395 var12 = super.field7431[0] = this.field805.method442(true, class203.field2769, super.field7338, arg0, var11, class547.field8070, super.field7419, class308.field4545, super.field7367, super.field7371, arg1, super.field7414, super.field7355, var7, super.field7344, var6, super.field7391);
        if (var12 == null) {
            return false;
        } else {
            super.field7383 = var12.method1007();
            super.field7370 = var12.method1018();
            this.method2962((byte) 120, var12);
            if (var8 == 0 && ~var9 == -1) {
                this.method2958(8192, 0, this.method422((byte) -113) << 9, var11, 0, this.method422((byte) -116) << 9);
            } else {
                this.method2958(arg2 ^ -8193, var5.field8564, var9, var11, var5.field8556, var8);
                if (super.field7424 != 0) {
                    super.field7431[0].method1048(super.field7424);
                }
                if (~super.field7374 != -1) {
                    super.field7431[0].method1044(super.field7374);
                }
                if (super.field7409 != 0) {
                    super.field7431[0].method1019(0, super.field7409, 0);
                }
            }
            if (var10) {
                var12.method1047(super.field7382, super.field7395, super.field7336, super.field7332 & 255);
            }
            if (super.field7360 != -1 && ~super.field7358 != 0) {
                class525 var13 = class134.field1945.method3082((byte) 50, super.field7360);
                boolean var14 = ~var13.field7474 == -4 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field7380 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field7347 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class395 var16 = super.field7431[1] = var13.method2979(super.field7402, (byte) -56, class203.field2769, super.field7407, var15, arg1, super.field7358);
                if (var16 != null) {
                    if (super.field7347 != 0) {
                        var16.method1019(0, -super.field7347 << 2, 0);
                    }
                    if (~super.field7380 != -1) {
                        var16.method1042(super.field7380 * 2048);
                    }
                    if (var14) {
                        if (~super.field7424 != -1) {
                            var16.method1048(super.field7424);
                        }
                        if (super.field7374 != 0) {
                            var16.method1044(super.field7374);
                        }
                        if (~super.field7409 != -1) {
                            var16.method1019(0, super.field7409, 0);
                        }
                    }
                }
            } else {
                super.field7431[1] = null;
            }
            if (super.field7353 != -1 && ~super.field7388 != 0) {
                class525 var17 = class134.field1945.method3082((byte) 50, super.field7353);
                boolean var18 = ~var17.field7474 == -4 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field7385 != -1) {
                        var19 = var4 | 5;
                    }
                    if (super.field7375 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class395 var20 = super.field7431[2] = var17.method2976(super.field7331, super.field7388, 126, class203.field2769, arg1, var19, super.field7393);
                if (var20 != null) {
                    if (~super.field7375 != -1) {
                        var20.method1019(0, -super.field7375 << 2, 0);
                    }
                    if (super.field7385 != 0) {
                        var20.method1042(super.field7385 * 2048);
                    }
                    if (var18) {
                        if (super.field7424 != 0) {
                            var20.method1048(super.field7424);
                        }
                        if (~super.field7374 != -1) {
                            var20.method1044(super.field7374);
                        }
                        if (~super.field7409 != -1) {
                            var20.method1019(0, super.field7409, 0);
                        }
                    }
                }
            } else {
                super.field7431[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(Z)Z", line = 283)
    public final boolean method309(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field820;
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I", line = 296)
    public final int method310(byte arg0) {
        if (arg0 != 4) {
            return -78;
        } else {
            ++field819;
            if (this.field805.field1212 != null) {
                class76 var2 = this.field805.method443(class308.field4545, (byte) 121);
                if (var2 != null && var2.field1185 != -1) {
                    return var2.field1185;
                }
            }
            return this.field805.field1185;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILr;ILcaa;ZII)V", line = 319)
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 < 24) {
            this.field805 = null;
        }
        ++field824;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(B)I", line = 342)
    public final int method312(byte arg0) {
        if (arg0 != -102) {
            this.method307(false, -24, 108);
        }
        ++field806;
        if (this.field805.field1212 != null) {
            class76 var2 = this.field805.method443(class308.field4545, (byte) 90);
            if (var2 != null && var2.field1190 != -1) {
                return var2.field1190;
            }
        }
        return this.field805.field1190 != -1 ? this.field805.field1190 : super.method312((byte) -102);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z", line = 363)
    public static final boolean method313(int arg0, int arg1, int arg2) {
        ++field814;
        if (arg0 < 107) {
            field817 = -49;
        }
        return (arg2 & 24) != 0 | ~(arg2 & 544) == -545;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIZI)V", line = 377)
    public final void method314(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field825;
        super.field7905 = super.field7900 = (byte) arg0;
        if (class125.method898(-102, arg5, arg2)) {
            ++super.field7900;
        }
        if (~super.field7389 != 0 && ~class203.field2769.method2971(-34, super.field7389).field744 == -2) {
            super.field7389 = -1;
            super.field7328 = null;
        }
        if (super.field7360 != -1) {
            class525 var7 = class134.field1945.method3082((byte) 50, super.field7360);
            if (var7.field7470 && ~var7.field7457 != 0 && ~class203.field2769.method2971(-77, var7.field7457).field744 == -2) {
                super.field7360 = -1;
            }
        }
        if (super.field7353 != -1) {
            class525 var8 = class134.field1945.method3082((byte) 50, super.field7353);
            if (var8.field7470 && ~var8.field7457 != 0 && ~class203.field2769.method2971(-70, var8.field7457).field744 == -2) {
                super.field7353 = -1;
            }
        }
        if (!arg4) {
            int var9 = arg5 - super.field7430[0];
            int var10 = -super.field7429[0] + arg2;
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field7436 > -10) {
                    ++super.field7436;
                }
                for (int var11 = super.field7436; ~var11 < -1; --var11) {
                    super.field7430[var11] = super.field7430[var11 + -1];
                    super.field7429[var11] = super.field7429[var11 + -1];
                    super.field7439[var11] = super.field7439[var11 + -1];
                }
                super.field7430[0] = arg5;
                super.field7439[0] = 1;
                super.field7429[0] = arg2;
                return;
            }
        }
        super.field7430[0] = arg5;
        super.field7436 = 0;
        if (arg3 <= 53) {
            this.method316((class76) null, (byte) -36);
        }
        super.field7434 = 0;
        super.field7432 = 0;
        super.field7429[0] = arg2;
        super.field7896 = (super.field7429[0] << 9) + (arg1 << 8);
        super.field7895 = (super.field7430[0] << 9) + (arg1 << 8);
        if (super.field7437 != null) {
            super.field7437.method114();
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Lr;I)V", line = 461)
    public final void method259(class98 arg0, int arg1) {
        ++field803;
        if (this.field805 != null) {
            if (super.field7435 || this.method308(0, arg0, -1)) {
                class151 var3 = arg0.method682();
                if (arg1 != 11771) {
                    this.method322(-89);
                }
                var3.method889(super.field7349.method2129(true));
                var3.method893(super.field7895, super.field7894 + -20, super.field7896);
                this.method2955(var3, arg0, super.field7435, super.field7431, arg1 + -11852);
                super.field7431[0] = super.field7431[1] = super.field7431[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lr;I)Lhr;", line = 490)
    public final class218 method272(class98 arg0, int arg1) {
        ++field802;
        if (this.field805 != null && this.method308(2048, arg0, -1)) {
            class151 var3 = arg0.method682();
            int var4 = super.field7349.method2129(true);
            var3.method889(var4);
            class44 var5 = class603.field8695[super.field7905][super.field7895 >> class125.field1831][super.field7896 >> class125.field1831];
            if (var5 != null && var5.field672 != null) {
                int var6 = super.field7352 - var5.field672.field7270;
                super.field7352 = (int) ((float) super.field7352 - (float) var6 / 10.0F);
            } else {
                super.field7352 = (int) ((float) super.field7352 - (float) super.field7352 / 10.0F);
            }
            var3.method893(super.field7895, super.field7894 - (20 - -super.field7352), super.field7896);
            class589 var7 = this.method2957(true);
            class76 var8 = this.field805.field1212 != null ? this.field805.method443(class308.field4545, (byte) 117) : this.field805;
            super.field7438 = false;
            if (class335.field4872.field9506 && var8.field1175 && var7.field8542) {
                class47 var9 = ~super.field7389 != 0 && super.field7392 == 0 ? class203.field2769.method2971(-126, super.field7389) : null;
                class47 var10 = super.field7334 == -1 || super.field7404 && var9 != null ? null : class203.field2769.method2971(-36, super.field7334);
                class395 var11 = class527.method2986(var10 == null ? super.field7419 : super.field7367, super.field7424, arg0, 255 & this.field805.field1199, var10 != null ? var10 : var9, this.field805.field1225 & 255, this.field805.field1239, super.field7431[0], this.field805.field1224 & 65535, super.field7374, var4, (byte) 91, 65535 & this.field805.field1171, super.field7409);
                if (var11 != null) {
                    super.field7438 = true;
                    arg0.method636(false);
                    if (!class384.field5767) {
                        var11.method1054(var3, (class67) null, 0);
                    } else {
                        var11.method1030(var3, (class67) null, class515.field7222, 0);
                    }
                    arg0.method636(true);
                }
            }
            var3.method889(var4);
            var3.method893(super.field7895, -super.field7352 + -5 + super.field7894, super.field7896);
            class218 var12 = null;
            if (this.method320((byte) 82)) {
                var12 = class187.method1237(super.field7431.length, (byte) 115);
            }
            this.method2955(var3, arg0, false, super.field7431, -114);
            if (class384.field5767) {
                for (int var13 = 0; ~super.field7431.length < ~var13; ++var13) {
                    if (super.field7431[var13] != null) {
                        super.field7431[var13].method1030(var3, var12 == null ? null : var12.field2902[var13], class515.field7222, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field7431.length < ~var14; ++var14) {
                    if (super.field7431[var14] != null) {
                        super.field7431[var14].method1054(var3, var12 != null ? var12.field2902[var14] : null, 0);
                    }
                }
            }
            if (super.field7437 != null) {
                class620 var15 = super.field7437.method112();
                if (!class384.field5767) {
                    arg0.method679(var15);
                } else {
                    arg0.method708(var15, class515.field7222);
                }
            }
            for (int var16 = 0; var16 < super.field7431.length; ++var16) {
                if (super.field7431[var16] != null) {
                    super.field7438 |= super.field7431[var16].method1024();
                }
            }
            if (arg1 != -1) {
                this.method318(72);
            }
            super.field7412 = class229.field3041;
            super.field7431[0] = super.field7431[1] = super.field7431[2] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V", line = 619)
    public final void method315(byte arg0) {
        if (arg0 < 101) {
            this.method314(95, -33, 22, -52, false, -51);
        }
        ++field812;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrda;B)V", line = 630)
    public final void method316(class76 arg0, byte arg1) {
        this.field805 = arg0;
        if (arg1 <= 31) {
            this.field813 = 77;
        }
        ++field823;
        if (super.field7437 != null) {
            super.field7437.method114();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIFIZII)[[I", line = 645)
    public static final int[][] method317(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, boolean arg6, int arg7, int arg8) {
        ++field816;
        int[][] var9 = new int[arg0][arg7];
        class68 var10 = new class68();
        var10.field1073 = arg1;
        var10.field1067 = (int) (arg4 * 4096.0F);
        var10.field1074 = arg5;
        if (arg3 >= -101) {
            method319(false);
        }
        var10.field1076 = arg6;
        var10.field1071 = arg8;
        var10.method2(6276);
        class435.method2586(0, arg7, arg0);
        for (int var11 = 0; ~arg0 < ~var11; ++var11) {
            var10.method401(var11, var9[var11], -87);
        }
        return var9;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I", line = 676)
    public final int method318(int arg0) {
        ++field810;
        if (this.field805.field1212 != null) {
            class76 var2 = this.field805.method443(class308.field4545, (byte) 114);
            if (var2 != null && ~var2.field1200 != 0) {
                return var2.field1200;
            }
        }
        if (arg0 != -1) {
            field817 = -36;
        }
        return this.field805.field1200;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZLr;)Z", line = 699)
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field822;
        if (this.field805 != null && this.method308(131072, arg3, -1)) {
            class151 var5 = arg3.method682();
            int var6 = super.field7349.method2129(true);
            var5.method889(var6);
            var5.method893(super.field7895, super.field7894, super.field7896);
            boolean var7 = arg2;
            for (int var8 = 0; super.field7431.length > var8; ++var8) {
                if (super.field7431[var8] != null) {
                    boolean var9 = this.field805.field1208 == -1 ? ~this.field805.field1239 == -2 : ~this.field805.field1208 == -2;
                    boolean var10;
                    if (class384.field5767) {
                        var10 = super.field7431[var8].method1022(arg0, arg1, var5, var9, class515.field7222);
                    } else {
                        var10 = super.field7431[var8].method1026(arg0, arg1, var5, var9);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field7431[0] = super.field7431[1] = super.field7431[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(Z)V", line = 752)
    public static void method319(boolean arg0) {
        if (!arg0) {
            field818 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(B)Z", line = 762)
    private final boolean method320(byte arg0) {
        if (arg0 != 82) {
            method317(-34, -55, 19, 74, -0.7202449F, 84, true, 81, -106);
        }
        ++field811;
        return this.field805.field1169;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lr;II)Lfo;", line = 773)
    public static final class606 method321(class98 arg0, int arg1, int arg2) {
        if (arg1 < 74) {
            field817 = 26;
        }
        ++field821;
        class374 var3 = class14.method96(4, arg2, arg0, true);
        return var3 == null ? null : var3.field5523;
    }

    @OriginalMember(owner = "client!u", name = "i", descriptor = "(I)Z", line = 803)
    public final boolean method322(int arg0) {
        ++field808;
        if (this.field805 == null) {
            return false;
        } else {
            return arg0 == -5658;
        }
    }
}
