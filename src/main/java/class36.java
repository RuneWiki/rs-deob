import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 extends class778 {

    @OriginalMember(owner = "client!tfa", name = "X", descriptor = "I")
    private int field463 = 0;

    @OriginalMember(owner = "client!tfa", name = "gb", descriptor = "Z")
    private boolean field472 = false;

    @OriginalMember(owner = "client!tfa", name = "Y", descriptor = "Z")
    private boolean field464 = false;

    @OriginalMember(owner = "client!tfa", name = "ab", descriptor = "I")
    private int field466 = 0;

    @OriginalMember(owner = "client!tfa", name = "Z", descriptor = "I")
    private int field465 = -1;

    @OriginalMember(owner = "client!tfa", name = "Bb", descriptor = "I")
    private int field493 = 0;

    @OriginalMember(owner = "client!tfa", name = "pb", descriptor = "I")
    private int field481 = 0;

    @OriginalMember(owner = "client!tfa", name = "yb", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!tfa", name = "lb", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!tfa", name = "U", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!tfa", name = "Kb", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!tfa", name = "qb", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!tfa", name = "S", descriptor = "Z")
    private boolean field458;

    @OriginalMember(owner = "client!tfa", name = "xb", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!tfa", name = "Nb", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!tfa", name = "R", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!tfa", name = "Fb", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!tfa", name = "rb", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!tfa", name = "jb", descriptor = "Lco;")
    private class129 field475;

    @OriginalMember(owner = "client!tfa", name = "cb", descriptor = "D")
    private double field468;

    @OriginalMember(owner = "client!tfa", name = "db", descriptor = "D")
    private double field469;

    @OriginalMember(owner = "client!tfa", name = "ib", descriptor = "D")
    private double field474;

    @OriginalMember(owner = "client!tfa", name = "nb", descriptor = "D")
    private double field479;

    @OriginalMember(owner = "client!tfa", name = "zb", descriptor = "D")
    private double field491;

    @OriginalMember(owner = "client!tfa", name = "Eb", descriptor = "D")
    private double field496;

    @OriginalMember(owner = "client!tfa", name = "Hb", descriptor = "D")
    private double field499;

    @OriginalMember(owner = "client!tfa", name = "Ib", descriptor = "D")
    private double field500;

    @OriginalMember(owner = "client!tfa", name = "T", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!tfa", name = "V", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!tfa", name = "W", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!tfa", name = "bb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!tfa", name = "eb", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!tfa", name = "fb", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!tfa", name = "hb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!tfa", name = "kb", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!tfa", name = "mb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!tfa", name = "ob", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!tfa", name = "sb", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!tfa", name = "tb", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!tfa", name = "ub", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!tfa", name = "vb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!tfa", name = "wb", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!tfa", name = "Ab", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!tfa", name = "Cb", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!tfa", name = "Db", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!tfa", name = "Gb", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!tfa", name = "Lb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!tfa", name = "Mb", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!tfa", name = "Ob", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!tfa", name = "Pb", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!tfa", name = "Jb", descriptor = "Lqo;")
    private class24 field501;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "(I)I")
    public final int method239(int arg0) {
        if (arg0 > -9) {
            this.field489 = 27;
        }
        ++field478;
        return this.field466;
    }

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "(I)V")
    public final void method240(int arg0) {
        if (arg0 == -1) {
            ++field506;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V")
    public final void method241(int arg0, int arg1) {
        this.field496 += (double) arg0 * this.field479;
        ++field503;
        if (arg1 != 27699) {
            this.method247(-70);
        }
        this.field499 += (double) arg0 * this.field500;
        this.field464 = true;
        if (!this.field458) {
            if (this.field457 != -1) {
                this.field468 += this.field491 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field469;
                this.field469 += (double) arg0 * this.field491;
            } else {
                this.field468 += (double) arg0 * this.field469;
            }
        } else {
            this.field468 = (double) (class580.method3366(super.field7710, (byte) -95, (int) this.field496, (int) this.field499) - this.field497);
        }
        this.field484 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field500, this.field479)) + 8192;
        this.field461 = 16383 & (int) (Math.atan2(this.field469, this.field474) * 2607.5945876176133D);
        if (this.field475 != null) {
            this.field463 += arg0;
            while (true) {
                do {
                    do {
                        if (~this.field475.field1668[this.field481] <= ~this.field463) {
                            return;
                        }
                        this.field463 -= this.field475.field1668[this.field481];
                        ++this.field481;
                        if (~this.field475.field1684.length >= ~this.field481) {
                            this.field481 -= this.field475.field1692;
                            if (this.field481 < 0 || ~this.field481 <= ~this.field475.field1684.length) {
                                this.field481 = 0;
                            }
                        }
                        this.field465 = this.field481 + 1;
                    } while (~this.field475.field1684.length < ~this.field465);
                    this.field465 -= this.field475.field1692;
                } while (this.field465 >= 0 && ~this.field465 > ~this.field475.field1684.length);
                this.field465 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILsf;Lha;BIIZ)V")
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        ++field476;
        if (arg3 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILft;)Ljava/lang/String;")
    public static final String method243(int arg0, class4 arg1) {
        if (arg0 != 30697) {
            method245(-116, 72, 61);
        }
        ++field492;
        return arg1.field48 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!tfa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field501 != null) {
            this.field501.method186();
        }
        ++field507;
    }

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "(I)Z")
    public final boolean method244(int arg0) {
        ++field485;
        int var2 = 26 % ((arg0 - -19) / 57);
        return false;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)I")
    public static final int method245(int arg0, int arg1, int arg2) {
        ++field462;
        int var3 = 100 / ((-27 - arg1) / 60);
        int var4 = class654.method3751((byte) 103, arg0 + -1, arg2 - 1) + (class654.method3751((byte) 105, arg0 + -1, arg2 + 1) - (-class654.method3751((byte) 110, arg0 + 1, arg2 + -1) - class654.method3751((byte) 82, arg0 + 1, arg2 + 1)));
        int var5 = class654.method3751((byte) 108, arg0, arg2 + -1) + class654.method3751((byte) 92, arg0, arg2 + 1) - -class654.method3751((byte) 89, arg0 - 1, arg2) - -class654.method3751((byte) 120, arg0 + 1, arg2);
        int var6 = class654.method3751((byte) 85, arg0, arg2);
        return var4 / 16 + var6 / 4 - -(var5 / 8);
    }

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "(I)I")
    public final int method246(int arg0) {
        ++field486;
        return arg0 >= -104 ? -119 : this.field493;
    }

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "(I)V")
    public final void method247(int arg0) {
        super.field10730 = super.field10736 = (short) ((int) (this.field496 / 512.0D));
        if (arg0 == 1449008457) {
            ++field488;
            super.field10733 = super.field10727 = (short) ((int) (this.field499 / 512.0D));
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Z")
    public final boolean method248(byte arg0) {
        if (arg0 != -55) {
            this.field474 = -0.5521334269495801D;
        }
        ++field470;
        return this.field472;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lka;Leh;ILha;)V")
    private final void method249(class495 arg0, class378 arg1, int arg2, class66 arg3) {
        ++field487;
        if (arg2 == -13492) {
            arg0.method63(arg1);
            class338[] var5 = arg0.method54();
            class92[] var6 = arg0.method116();
            if ((this.field501 == null || this.field501.field353) && (var5 != null || var6 != null)) {
                this.field501 = class24.method185(class673.field9441, true);
            }
            if (this.field501 != null) {
                this.field501.method190(arg3, (long) class673.field9441, var5, var6, false);
                this.field501.method176(super.field7710, super.field10733, super.field10727, super.field10730, super.field10736);
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)V")
    public final void method250(byte arg0) {
        ++field494;
        if (arg0 <= 46) {
            this.method256(-117, 93, false, -93, 17);
        }
        if (this.field501 != null) {
            this.field501.method186();
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lha;ZI)Lka;")
    private final class495 method251(class66 arg0, boolean arg1, int arg2) {
        ++field471;
        if (!arg1) {
            this.field472 = true;
        }
        class55 var4 = class87.field1131.method1548(64, this.field489);
        return var4.method351(arg0, true, this.field465, this.field481, arg2, class203.field2975, this.field463);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
    public final void method252(int arg0) {
        ++field467;
        if (arg0 <= -11) {
            if (!this.field464) {
                if (this.field477 != 0) {
                    class449 var2 = null;
                    if (this.field477 < 0) {
                        int var3 = -this.field477 + -1;
                        if (~class223.field3199 == ~var3) {
                            var2 = class251.field3549;
                        } else {
                            var2 = class581.field8250[var3];
                        }
                    } else {
                        int var4 = this.field477 - 1;
                        class14 var5 = (class14) class543.field7606.method380((byte) -3, (long) var4);
                        if (var5 != null) {
                            var2 = var5.field262;
                        }
                    }
                    if (var2 != null) {
                        super.field7719 = var2.field7719;
                        super.field7718 = var2.field7718;
                        super.field7723 = class580.method3366(super.field7710, (byte) -95, var2.field7719, var2.field7718) + -this.field497;
                        if (this.field460 >= 0) {
                            class607 var6 = var2.method2708(119);
                            int var7 = 0;
                            int var8 = 0;
                            if (var6.field8572 != null && var6.field8572[this.field460] != null) {
                                var7 += var6.field8572[this.field460][0];
                                var8 += var6.field8572[this.field460][2];
                            }
                            if (var6.field8540 != null && var6.field8540[this.field460] != null) {
                                var8 += var6.field8540[this.field460][2];
                                var7 += var6.field8540[this.field460][0];
                            }
                            if (var7 != 0 || ~var8 != -1) {
                                int var9 = var2.field6420.method224((byte) -108);
                                int var10 = var9;
                                if (var2.field6380 != null && ~var2.field6380[this.field460] != 0) {
                                    var10 = var2.field6380[this.field460];
                                }
                                int var11 = 16383 & -var9 + var10;
                                int var12 = class601.field8476[var11];
                                int var13 = class601.field8473[var11];
                                int var14 = var8 * var12 - -(var7 * var13) >> 14;
                                int var15 = var8 * var13 + -(var7 * var12) >> 14;
                                super.field7719 += var15;
                                super.field7718 += var14;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZLha;I)Z")
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        if (!arg1) {
            return false;
        } else {
            ++field495;
            return false;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)Z")
    public final boolean method254(byte arg0) {
        ++field504;
        if (arg0 != 104) {
            this.field469 = -0.2525848232410653D;
        }
        return false;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(Lha;B)Lpw;")
    public final class733 method255(class66 arg0, byte arg1) {
        ++field459;
        int var3 = 89 % ((arg1 - -45) / 63);
        return null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIZII)V")
    public final void method256(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field473;
        if (!this.field464) {
            double var6 = (double) (arg0 - super.field7718);
            double var8 = (double) (-super.field7719 + arg3);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field499 = (double) this.field505 * var6 / var10 + (double) super.field7718;
            this.field496 = (double) this.field505 * var8 / var10 + (double) super.field7719;
            if (!this.field458) {
                this.field468 = (double) super.field7723;
            } else {
                this.field468 = (double) (class580.method3366(super.field7710, (byte) -95, (int) this.field496, (int) this.field499) - this.field497);
            }
        }
        double var12 = (double) (this.field482 - -1 - arg1);
        this.field479 = ((double) arg3 - this.field496) / var12;
        this.field500 = ((double) arg0 - this.field499) / var12;
        if (arg2) {
            this.method244(122);
        }
        this.field474 = Math.sqrt(this.field500 * this.field500 + this.field479 * this.field479);
        if (~this.field457 != 0) {
            if (!this.field464) {
                this.field469 = -this.field474 * Math.tan((double) this.field457 * 0.02454369D);
            }
            this.field491 = ((double) arg4 + -this.field468 + -(this.field469 * var12)) * 2.0D / (var12 * var12);
        } else {
            this.field469 = ((double) arg4 - this.field468) / var12;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        super(arg1, arg2, arg3, -arg5 + class580.method3366(arg1, (byte) -95, arg4, arg3), arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field490 = arg12;
        this.field464 = false;
        this.field477 = arg10;
        this.field460 = arg14;
        this.field502 = arg6;
        this.field482 = arg7;
        this.field458 = arg13;
        this.field489 = arg0;
        this.field505 = arg9;
        this.field457 = arg8;
        this.field497 = arg5;
        this.field483 = arg11;
        int var16 = class87.field1131.method1548(64, this.field489).field753;
        if (~var16 == 0) {
            this.field475 = null;
        } else {
            this.field475 = class203.field2975.method1931((byte) -81, var16);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lha;I)V")
    public final void method257(class66 arg0, int arg1) {
        if (arg1 < 60) {
            this.method250((byte) -13);
        }
        ++field498;
        class495 var3 = this.method251(arg0, true, 0);
        if (var3 != null) {
            class378 var4 = arg0.method433();
            var4.method1966(this.field461);
            var4.method1937(this.field484);
            var4.method1952((int) this.field499, (int) this.field468, (int) this.field496);
            this.field493 = var3.method75();
            this.field466 = var3.method67();
            this.method249(var3, var4, -13492, arg0);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lha;B)Lhq;")
    public final class167 method258(class66 arg0, byte arg1) {
        ++field480;
        class495 var3 = this.method251(arg0, true, 2048);
        if (var3 == null) {
            return null;
        } else {
            class378 var4 = arg0.method433();
            var4.method1966(this.field461);
            var4.method1937(this.field484);
            if (arg1 != 10) {
                return null;
            } else {
                var4.method1952((int) this.field499, (int) this.field468, (int) this.field496);
                this.method249(var3, var4, -13492, arg0);
                class167 var5 = class653.method3739(arg1 ^ 10, 1, false);
                if (class475.field6760) {
                    var3.method91(var4, var5.field2426[0], class412.field5822, 0);
                } else {
                    var3.method108(var4, var5.field2426[0], 0);
                }
                if (this.field501 != null) {
                    class443 var6 = this.field501.method184();
                    if (class475.field6760) {
                        arg0.method464(var6, class412.field5822);
                    } else {
                        arg0.method437(var6);
                    }
                }
                this.field472 = var3.method88();
                this.field493 = var3.method75();
                this.field466 = var3.method67();
                return var5;
            }
        }
    }
}
