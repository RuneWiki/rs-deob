import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class40 extends class396 {

    @OriginalMember(owner = "client!qr", name = "Dc", descriptor = "Z")
    public boolean field448 = false;

    @OriginalMember(owner = "client!qr", name = "Lc", descriptor = "I")
    public int field456 = -1;

    @OriginalMember(owner = "client!qr", name = "Xc", descriptor = "I")
    public int field468 = -1;

    @OriginalMember(owner = "client!qr", name = "Gc", descriptor = "I")
    public int field451 = -1;

    @OriginalMember(owner = "client!qr", name = "Uc", descriptor = "I")
    public int field465 = 0;

    @OriginalMember(owner = "client!qr", name = "Yc", descriptor = "I")
    public int field469 = 255;

    @OriginalMember(owner = "client!qr", name = "Nc", descriptor = "I")
    public int field458 = 0;

    @OriginalMember(owner = "client!qr", name = "Zc", descriptor = "B")
    private byte field470 = 0;

    @OriginalMember(owner = "client!qr", name = "nd", descriptor = "I")
    public int field484 = -1;

    @OriginalMember(owner = "client!qr", name = "ad", descriptor = "I")
    public int field471 = 0;

    @OriginalMember(owner = "client!qr", name = "Tc", descriptor = "I")
    public int field464 = -1;

    @OriginalMember(owner = "client!qr", name = "ld", descriptor = "I")
    public int field482 = 0;

    @OriginalMember(owner = "client!qr", name = "hd", descriptor = "I")
    public int field478 = 0;

    @OriginalMember(owner = "client!qr", name = "cd", descriptor = "I")
    public int field473 = -1;

    @OriginalMember(owner = "client!qr", name = "Mc", descriptor = "B")
    private byte field457 = 0;

    @OriginalMember(owner = "client!qr", name = "Fc", descriptor = "I")
    public int field450 = -1;

    @OriginalMember(owner = "client!qr", name = "ud", descriptor = "B")
    private byte field491 = 0;

    @OriginalMember(owner = "client!qr", name = "ed", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "client!qr", name = "Sc", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!qr", name = "Ec", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!qr", name = "Hc", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!qr", name = "Jc", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!qr", name = "Kc", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!qr", name = "Oc", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!qr", name = "Pc", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!qr", name = "Qc", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!qr", name = "Vc", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!qr", name = "Wc", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!qr", name = "bd", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!qr", name = "dd", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!qr", name = "fd", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!qr", name = "gd", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!qr", name = "id", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!qr", name = "jd", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!qr", name = "kd", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!qr", name = "md", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!qr", name = "od", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!qr", name = "pd", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!qr", name = "rd", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!qr", name = "sd", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!qr", name = "td", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!qr", name = "vd", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!qr", name = "Ic", descriptor = "Lqe;")
    public class274 field453;

    @OriginalMember(owner = "client!qr", name = "Rc", descriptor = "Ljava/lang/String;")
    public String field462;

    @OriginalMember(owner = "client!qr", name = "qd", descriptor = "Ljava/lang/String;")
    public String field487;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILnc;Lae;IILbk;IB)V", line = 4)
    private final void method237(int arg0, class18 arg1, class134 arg2, int arg3, int arg4, class210 arg5, int arg6, byte arg7) {
        ++field485;
        int var9 = arg6 * arg6 - -(arg3 * arg3);
        if (var9 >= 16 && arg4 >= var9) {
            if (arg7 != -54) {
                this.method60(true, (byte) 32, -108, 20, (class29) null, -117, (class134) null);
            }
            int var10 = (int) (2607.5945876176133D * Math.atan2((double) arg6, (double) arg3)) & 16383;
            class210 var11 = class162.method1081(var10, super.field5598, super.field5589, super.field3284, arg5, false, arg0, arg2, super.field5601, super.field3269, super.field3287);
            if (var11 != null) {
                arg2.method617(false);
                var11.method1416(arg1, (class136) null, 0);
                arg2.method617(true);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ldg;I)V", line = 43)
    public final void method238(class236 arg0, int arg1) {
        ++field480;
        arg0.field3320 = 0;
        int var3 = arg0.method1574(-111);
        this.field491 = (byte) (var3 & 1);
        boolean var4 = (var3 & 2) != 0;
        boolean var5 = ~(4 & var3) != -1;
        int var6 = super.method242(arg1 + -9964);
        this.method2532(0, (7 & var3 >> 3) + 1);
        this.field470 = (byte) ((var3 & 201) >> 6);
        super.field3284 += (-var6 + this.method242(arg1 + -9964)) * 64;
        super.field3269 += 64 * (-var6 + this.method242(-30129));
        this.field457 = arg0.method1589(false);
        this.field451 = arg0.method1589(false);
        this.field450 = arg0.method1589(false);
        int var7 = -1;
        this.field458 = 0;
        if (arg1 != -20165) {
            this.field468 = 6;
        }
        int[] var8 = new int[12];
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg0.method1574(-47);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method1574(-119);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method1617((byte) 48);
                    this.field458 = arg0.method1574(-6);
                    break;
                }
                if (~var12 <= -32769) {
                    int var26 = class376.field5269[var12 + -32768];
                    var8[var9] = class429.method2704(1073741824, var26);
                    int var27 = class50.method288(arg1 + 20165, var26).field2294;
                    if (var27 != 0) {
                        this.field458 = var27;
                    }
                } else {
                    var8[var9] = class429.method2704(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var25 = arg0.method1574(-91);
            if (~var25 > -1 || ~var25 <= ~class50.field601[var14].length) {
                var25 = 0;
            }
            var13[var14] = var25;
        }
        this.field454 = arg0.method1617((byte) 48);
        this.field462 = arg0.method1562(false);
        if (!var4) {
            this.field487 = this.field462;
        } else {
            this.field487 = arg0.method1562(false);
        }
        this.field465 = arg0.method1574(arg1 + 20115);
        if (!var5) {
            this.field482 = 0;
            this.field478 = arg0.method1574(arg1 ^ 20119);
            this.field484 = arg0.method1574(-80);
            if (this.field484 == 255) {
                this.field484 = -1;
            }
        } else {
            this.field482 = arg0.method1617((byte) 48);
            this.field484 = -1;
            this.field478 = this.field465;
        }
        int var15 = this.field471;
        this.field471 = arg0.method1574(arg1 ^ 20121);
        if (this.field471 == 0) {
            class405.method2590(this, -3);
        } else {
            int var16 = this.field464;
            int var17 = this.field473;
            int var18 = this.field456;
            int var19 = this.field468;
            int var20 = this.field469;
            this.field464 = arg0.method1617((byte) 48);
            this.field473 = arg0.method1617((byte) 48);
            this.field456 = arg0.method1617((byte) 48);
            this.field468 = arg0.method1617((byte) 48);
            this.field469 = arg0.method1574(-26);
            if (~this.field471 != ~var15 || ~this.field464 != ~var16 || this.field473 != var17 || this.field456 != var18 || ~this.field468 != ~var19 || ~this.field469 != ~var20) {
                class138.method854(this, (byte) -125);
            }
        }
        if (this.field453 == null) {
            this.field453 = new class274();
        }
        int var21 = this.field453.field3888;
        int[] var22 = this.field453.field3885;
        this.field453.method1812(var8, (byte) -70, this.method248(-1), var7, var13, this.field491 == 1);
        if (~var7 != ~var21) {
            super.field3284 = super.field5677[0] * 128 + this.method242(-30129) * 64;
            super.field3269 = super.field5664[0] * 128 - -(64 * this.method242(arg1 + -9964));
        }
        if (~super.field5620 == -2048 && var22 != null) {
            for (int var23 = 0; var23 < var13.length; ++var23) {
                if (var13[var23] != var22[var23]) {
                    class432.method2713((byte) -16);
                    break;
                }
            }
        }
        if (super.field5665 != null) {
            super.field5665.method1364();
        }
        if (super.field5640 != -1 && super.field5613) {
            class306 var24 = this.method2526(4);
            if (!var24.method2019((byte) 17, super.field5640)) {
                super.field5613 = false;
                super.field5640 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIILae;)V", line = 240)
    public static final void method239(int arg0, int arg1, int arg2, class134 arg3) {
        class311.field4398 = new class180[arg0][arg1];
        ++field452;
        class305.field4288 = arg3;
        if (class91.field1095 != null) {
            class335.field4740 = class274.method1808(class91.field1095[4], class91.field1095[3], class91.field1095[5], class91.field1095[1], class91.field1095[0], 255, class91.field1095[2]);
        }
        class82.field951 = new class180();
        int var4 = 59 % ((-8 - arg2) / 40);
        class66.method373(true);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIII)Z", line = 256)
    public static final boolean method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field479;
        if (arg4 != 0) {
            method240(2, 105, -67, 110, 110, -40, -106, 65, 104);
        }
        if (~(arg0 + arg3) < ~arg7 && ~arg3 > ~(arg7 - -arg2)) {
            return arg1 < arg5 + arg8 && arg1 + arg6 > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLae;)Ljg;", line = 275)
    public final class186 method52(byte arg0, class134 arg1) {
        ++field481;
        if (this.field453 != null && this.method249(1024, arg1, arg0 ^ -55)) {
            class18 var3 = arg1.method649();
            int var4 = super.field5602.method2177((byte) -127);
            var3.method123(var4);
            var3.method125(super.field3284, super.field3287, super.field3269);
            float var5 = arg1.method674();
            float var6 = arg1.method662();
            if (class33.field381) {
                class306 var7 = this.method2526(4);
                if (var7.field4329 && (this.field453.field3888 == -1 || class403.method2568(this.field453.field3888, (byte) 99).field1684)) {
                    class412 var8 = super.field5612 != -1 && super.field5638 == 0 ? class189.method1288(-8192, super.field5612) : null;
                    class412 var9 = super.field5640 == -1 || this.field448 || super.field5613 && var8 != null ? null : class189.method1288(-8192, super.field5640);
                    class210 var10 = class249.method1696(0, arg1, var4, 240, super.field5671[0], super.field5598, var9 != null ? super.field5643 : super.field5591, 0, 0, 160, super.field5583, var9 != null ? var9 : var8, super.field5601, super.field5589, 1);
                    if (var10 != null) {
                        arg1.method691(var5, var6 + -128.0F);
                        arg1.method617(false);
                        var10.method1416(var3, (class136) null, 0);
                        arg1.method617(true);
                    }
                }
            }
            if (class384.field5422 == this) {
                arg1.method691(var5, var6 - 144.0F);
                var3.method116(super.field3284, super.field3287, super.field3269);
                for (int var11 = class360.field5138.length + -1; ~var11 <= -1; --var11) {
                    class219 var12 = class360.field5138[var11];
                    if (var12 != null && var12.field3090 != -1) {
                        if (~var12.field3092 == -2 && var12.field3085 >= 0 && var12.field3085 < class167.field2335.length) {
                            class77 var13 = class167.field2335[var12.field3085];
                            if (var13 != null) {
                                int var14 = var13.field3284 / 32 - class384.field5422.field3284 / 32;
                                int var15 = var13.field3269 / 32 - class384.field5422.field3269 / 32;
                                this.method237(var12.field3090, var3, arg1, var15, 360000, super.field5671[0], var14, (byte) -54);
                            }
                        }
                        if (var12.field3092 == 2) {
                            int var16 = (-class114.field1403 + var12.field3088) * 4 + -(class384.field5422.field3284 / 32) + 2;
                            int var17 = (-class41.field496 + var12.field3094) * 4 + -(class384.field5422.field3269 / 32) + 2;
                            int var18 = var12.field3086 * 4;
                            int var19 = var18 * var18;
                            this.method237(var12.field3090, var3, arg1, var17, var19, super.field5671[0], var16, (byte) -54);
                        }
                        if (var12.field3092 == 10 && ~var12.field3085 <= -1 && ~var12.field3085 > ~class26.field314.length) {
                            class40 var20 = class26.field314[var12.field3085];
                            if (var20 != null) {
                                int var21 = var20.field3284 / 32 + -(class384.field5422.field3284 / 32);
                                int var22 = var20.field3269 / 32 - class384.field5422.field3269 / 32;
                                this.method237(var12.field3090, var3, arg1, var22, 360000, super.field5671[0], var21, (byte) -54);
                            }
                        }
                    }
                }
                var3.method123(var4);
                var3.method125(super.field3284, super.field3287, super.field3269);
            }
            arg1.method691(var5, var6);
            if (arg0 != -120) {
                return null;
            } else {
                class186 var23 = class348.method2229(super.field5671.length, 21534);
                if (super.field5665 != null) {
                    class63 var24 = super.field5665.method1371();
                    arg1.method642(super.field5671, var24, var3, var23.field2704, class384.field5422 != this ? 0 : 1);
                } else {
                    arg1.method682(super.field5671, var3, var23.field2704, class384.field5422 == this ? 1 : 0);
                }
                this.method2531(false, super.field5671, arg1, -7);
                if (super.field5671[2] != null) {
                    if (~var4 != -1) {
                        super.field5671[2].method1413(var4);
                    }
                    super.field5671[2].method1388(-super.field5661 + super.field3284, -super.field5673 + super.field3287, -super.field5659 + super.field3269);
                }
                return var23;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V", line = 414)
    public final void method241(int arg0, int arg1, int arg2) {
        ++field486;
        int var4 = super.field5677[0];
        if (arg0 != -30274) {
            this.method56(-123, (class134) null, 106, -115);
        }
        int var5 = super.field5664[0];
        if (~arg1 == -1) {
            ++var5;
            --var4;
        }
        if (~arg1 == -2) {
            ++var5;
        }
        if (arg1 == 2) {
            ++var4;
            ++var5;
        }
        if (~arg1 == -4) {
            --var4;
        }
        if (arg1 == 4) {
            ++var4;
        }
        if (arg1 == 5) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var5;
        }
        if (~arg1 == -8) {
            ++var4;
            --var5;
        }
        if (~super.field5612 != 0 && class189.method1288(arg0 ^ 27070, super.field5612).field5920 == 1) {
            super.field5612 = -1;
        }
        if (super.field5611 != -1) {
            class97 var6 = class434.method2721(super.field5611, arg0 ^ -26178);
            if (var6.field1158 && var6.field1166 != -1 && class189.method1288(-8192, var6.field1166).field5920 == 1) {
                super.field5611 = -1;
            }
        }
        if (super.field5674 < 9) {
            ++super.field5674;
        }
        for (int var7 = super.field5674; var7 > 0; --var7) {
            super.field5677[var7] = super.field5677[var7 + -1];
            super.field5664[var7] = super.field5664[var7 - 1];
            super.field5668[var7] = super.field5668[var7 - 1];
        }
        super.field5677[0] = var4;
        super.field5668[0] = (byte) arg2;
        super.field5664[0] = var5;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lae;B)V", line = 505)
    public final void method64(class134 arg0, byte arg1) {
        ++field467;
        if (arg1 >= -50) {
            this.field453 = null;
        }
        if (this.field453 != null) {
            if (super.field5675 || this.method249(0, arg0, 84)) {
                this.method2531(super.field5675, super.field5671, arg0, -45);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "(I)I", line = 527)
    public final int method242(int arg0) {
        ++field455;
        if (this.field453 != null && this.field453.field3888 != -1) {
            return class403.method2568(this.field453.field3888, (byte) -92).field1697;
        } else {
            if (arg0 != -30129) {
                this.field468 = 0;
            }
            return super.method242(arg0);
        }
    }

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)V", line = 546)
    public final void method51(int arg0) {
        if (arg0 == 6) {
            ++field472;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 561)
    public final String method243(int arg0, boolean arg1) {
        ++field489;
        String var3 = "";
        if (arg0 != -13458) {
            field475 = -107;
        }
        if (class311.field4395 != null) {
            var3 = var3 + class311.field4395[this.field470];
        }
        int[] var4;
        if (~this.field491 == -2 && class10.field134 != null) {
            var4 = class10.field134;
        } else {
            var4 = class249.field3560;
        }
        if (var4 != null && var4[this.field470] != -1) {
            class150 var5 = class8.method62(arg0 + 13450, var4[this.field470]);
            if (~var5.field1834 == -116) {
                var3 = var3 + var5.method912(255 & this.field457, (byte) 120);
            } else {
                class422.method2663("gdn1", new Throwable(), -37);
                var4[this.field470] = -1;
            }
        }
        String var6;
        if (!arg1) {
            var6 = var3 + this.field487;
        } else {
            var6 = var3 + this.field462;
        }
        if (class22.field282 != null) {
            var6 = var6 + class22.field282[this.field470];
        }
        return var6;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILae;II)Z", line = 611)
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field492;
        if (this.field453 != null && this.method249(65536, arg1, arg2 + -4745)) {
            if (arg2 != 4835) {
                this.method249(14, (class134) null, 17);
            }
            class18 var5 = arg1.method649();
            int var6 = super.field5602.method2177((byte) -128);
            var5.method123(var6);
            var5.method125(super.field3284, super.field3287, super.field3269);
            for (int var7 = 0; ~var7 > ~super.field5671.length; ++var7) {
                if (super.field5671[var7] != null && super.field5671[var7].method1382(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Z", line = 642)
    public final boolean method54(boolean arg0) {
        ++field490;
        if (!arg0) {
            field463 = -36;
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZBIILna;ILae;)V", line = 656)
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        int var8 = -114 / ((-16 - arg1) / 62);
        ++field474;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "(I)Z", line = 668)
    public final boolean method244(int arg0) {
        ++field461;
        if (arg0 != -27076) {
            return false;
        } else {
            return this.field453 != null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)I", line = 683)
    public final int method245(int arg0) {
        if (arg0 != -1) {
            return 105;
        } else {
            ++field477;
            return -1;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(IZ)Ljava/lang/String;", line = 702)
    public final String method246(int arg0, boolean arg1) {
        ++field459;
        if (arg0 > -8) {
            this.field464 = -84;
        }
        return !arg1 ? this.field487 : this.field462;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZII)V", line = 720)
    public final void method247(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field488;
        super.method2522(arg0, this.method242(-30129), arg1, arg3, arg2, (byte) 127);
        int var6 = -126 / ((48 - arg4) / 32);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I", line = 732)
    public final int method248(int arg0) {
        if (arg0 != -1) {
            field475 = 113;
        }
        ++field449;
        return this.field454;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILae;I)Z", line = 744)
    private final boolean method249(int arg0, class134 arg1, int arg2) {
        ++field466;
        int var4 = arg0;
        class306 var5 = this.method2526(4);
        class412 var6 = super.field5612 != -1 && ~super.field5638 == -1 ? class189.method1288(-8192, super.field5612) : null;
        class412 var7 = ~super.field5640 == 0 || this.field448 || super.field5613 && var6 != null ? null : class189.method1288(-8192, super.field5640);
        int var8 = var5.field4310;
        int var9 = var5.field4299;
        if (var8 != 0 || ~var9 != -1 || ~var5.field4301 != -1 || ~var5.field4337 != -1) {
            arg0 |= 7;
        }
        super.field5671[0] = this.field453.method1809(1, var7, arg1, super.field5634, super.field5596, var6, true, super.field5630, super.field5643, super.field5623, arg0, super.field5609, super.field5591);
        int var10 = class297.method1956(30);
        if (arg2 <= 62) {
            this.field470 = 95;
        }
        if (class268.field3812 < 96 && var10 > 50) {
            class327.method2120(-26);
        }
        if (class411.field5900 != 0 && ~var10 > -51) {
            int var11 = 50 - var10;
            while (~class310.field4387 > ~var11) {
                class50.field602[class310.field4387] = new byte[102400];
                ++class310.field4387;
            }
            while (~var11 > ~class310.field4387) {
                --class310.field4387;
                class50.field602[class310.field4387] = null;
            }
        } else if (~class411.field5900 != -1) {
            class50.field602 = new byte[50][];
            class310.field4387 = 0;
        }
        if (super.field5671[0] == null) {
            return false;
        } else {
            super.field5628 = super.field5671[0].method1405();
            this.method2529((byte) -124, super.field5671[0]);
            int var12 = super.field5602.method2177((byte) -122);
            super.field5601 = 0;
            super.field5598 = 0;
            super.field5589 = 0;
            if (var8 == 0 && ~var9 == -1) {
                this.method2521(this.method242(-30129) << 7, (byte) -33, this.method242(-30129) << 7, var12);
            } else {
                this.method2521(var9, (byte) -33, var8, var12);
                if (super.field5601 != 0) {
                    super.field5671[0].method1403(super.field5601);
                }
                if (~super.field5598 != -1) {
                    super.field5671[0].method1407(super.field5598);
                }
                if (super.field5589 != 0) {
                    super.field5671[0].method1388(0, super.field5589, 0);
                }
            }
            super.field5671[1] = null;
            if (!this.field448 && ~super.field5611 != 0 && super.field5649 != -1) {
                class97 var13 = class434.method2721(super.field5611, 4096);
                class210 var14 = var13.method535(var4 | (!var13.field1154 ? 2 : 7), arg1, super.field5649, (byte) -32, super.field5593, super.field5606);
                if (var14 != null) {
                    var14.method1388(0, -super.field5605, 0);
                    if (var13.field1154 && (var8 != 0 || var9 != 0)) {
                        if (super.field5601 != 0) {
                            var14.method1403(super.field5601);
                        }
                        if (super.field5598 != 0) {
                            var14.method1407(super.field5598);
                        }
                        if (~super.field5589 != -1) {
                            var14.method1388(0, super.field5589, 0);
                        }
                    }
                    super.field5671[1] = var14;
                }
            }
            super.field5671[2] = null;
            if (!this.field448 && super.field5658 != null) {
                if (super.field5669 <= class189.field2726) {
                    super.field5658 = null;
                }
                if (class189.field2726 >= super.field5662 && class189.field2726 < super.field5669) {
                    class210 var15 = super.field5658.method70(arg1, true, var4 | 7);
                    if (var15 != null) {
                        var15.method1388(-super.field3284 + super.field5661, super.field5673 - super.field3287, -super.field3269 + super.field5659);
                        if (var12 != 0) {
                            var15.method1413(16383 & -var12);
                        }
                        super.field5671[2] = var15;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(CB)C", line = 884)
    public static final char method250(char arg0, byte arg1) {
        if (arg1 != -26) {
            field475 = -102;
        }
        ++field476;
        if (~arg0 != -33 && arg0 != 160 && ~arg0 != -96 && arg0 != '-') {
            if (arg0 != '[' && ~arg0 != -94 && arg0 != '#') {
                if (arg0 != 224 && ~arg0 != -226 && ~arg0 != -227 && ~arg0 != -229 && ~arg0 != -228 && ~arg0 != -193 && arg0 != 193 && arg0 != 194 && ~arg0 != -197 && arg0 != 195) {
                    if (arg0 != 232 && ~arg0 != -234 && ~arg0 != -235 && ~arg0 != -236 && ~arg0 != -201 && ~arg0 != -202 && arg0 != 202 && arg0 != 203) {
                        if (arg0 != 237 && ~arg0 != -239 && ~arg0 != -240 && arg0 != 205 && arg0 != 206 && ~arg0 != -208) {
                            if (arg0 != 242 && arg0 != 243 && ~arg0 != -245 && ~arg0 != -247 && ~arg0 != -246 && ~arg0 != -211 && arg0 != 211 && arg0 != 212 && arg0 != 214 && arg0 != 213) {
                                if (arg0 != 249 && ~arg0 != -251 && arg0 != 251 && ~arg0 != -253 && arg0 != 217 && arg0 != 218 && arg0 != 219 && ~arg0 != -221) {
                                    if (arg0 != 231 && arg0 != 199) {
                                        if (arg0 != 255 && ~arg0 != -377) {
                                            if (~arg0 != -242 && arg0 != 209) {
                                                return arg0 == 223 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "(I)I", line = 1299)
    public final int method61(int arg0) {
        if (arg0 != 131910471) {
            this.field450 = -99;
        }
        ++field460;
        return super.field5628;
    }
}
