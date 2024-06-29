import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 extends class38 {

    @OriginalMember(owner = "client!d", name = "Wc", descriptor = "I")
    public int field619 = 0;

    @OriginalMember(owner = "client!d", name = "ad", descriptor = "I")
    public int field623 = 0;

    @OriginalMember(owner = "client!d", name = "Vc", descriptor = "I")
    public int field618 = -1;

    @OriginalMember(owner = "client!d", name = "hd", descriptor = "I")
    public int field630 = -1;

    @OriginalMember(owner = "client!d", name = "ed", descriptor = "Z")
    public boolean field627 = false;

    @OriginalMember(owner = "client!d", name = "ld", descriptor = "I")
    public int field634 = 0;

    @OriginalMember(owner = "client!d", name = "sd", descriptor = "I")
    public int field641 = 0;

    @OriginalMember(owner = "client!d", name = "Uc", descriptor = "I")
    public int field617 = 0;

    @OriginalMember(owner = "client!d", name = "Xc", descriptor = "I")
    public static int field620 = 0;

    @OriginalMember(owner = "client!d", name = "fd", descriptor = "Lhe;")
    private static class54 field628 = class6.method58("Close", false);

    @OriginalMember(owner = "client!d", name = "nd", descriptor = "Lhe;")
    private static class54 field636 = class6.method58("Loading interfaces )2 ", false);

    @OriginalMember(owner = "client!d", name = "qd", descriptor = "Lhe;")
    private static class54 field639 = class6.method58("wave:", false);

    @OriginalMember(owner = "client!d", name = "kd", descriptor = "Lhe;")
    public static class54 field633 = field639;

    @OriginalMember(owner = "client!d", name = "Rc", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!d", name = "ud", descriptor = "Lhe;")
    public static class54 field643 = field636;

    @OriginalMember(owner = "client!d", name = "Zc", descriptor = "Lhe;")
    public static class54 field622 = field639;

    @OriginalMember(owner = "client!d", name = "cd", descriptor = "Lhe;")
    public static class54 field625 = field628;

    @OriginalMember(owner = "client!d", name = "Qc", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!d", name = "Sc", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!d", name = "Tc", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!d", name = "Yc", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!d", name = "bd", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!d", name = "id", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!d", name = "jd", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!d", name = "md", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!d", name = "od", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!d", name = "pd", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!d", name = "rd", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!d", name = "vd", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!d", name = "wd", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!d", name = "xd", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!d", name = "dd", descriptor = "Lhe;")
    public class54 field626;

    @OriginalMember(owner = "client!d", name = "td", descriptor = "Ljf;")
    public class68 field642;

    @OriginalMember(owner = "client!d", name = "gd", descriptor = "Loa;")
    public class98 field629;

    @OriginalMember(owner = "client!d", name = "Pc", descriptor = "[Lc;")
    public static class15[] field612;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
    public static final void method178(int arg0, int arg1) {
        ++field613;
        if (arg1 != -20339) {
            field622 = null;
        }
        if (class86.method691((byte) 110, arg0)) {
            class24.method187(-1, arg1 ^ -20334, class59.field1481[arg0]);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILm;)V")
    public final void method179(int arg0, class83 arg1) {
        arg1.field2076 = 0;
        ++field621;
        int var3 = arg1.method638(arg0 + -1);
        this.field630 = arg1.method651(arg0 ^ -124);
        this.field618 = arg1.method651(78);
        this.field623 = 0;
        int var4 = -1;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg1.method638(arg0 + -1);
            if (~var7 == -1) {
                var5[var6] = 0;
            } else {
                int var8 = arg1.method638(0);
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && ~var5[0] == -65536) {
                    var4 = arg1.method631((byte) -113);
                    break;
                }
                if (var5[var6] >= 512) {
                    int var12 = class141.method1088(var5[var6] + -512, (byte) -118).field1661;
                    if (var12 != 0) {
                        this.field623 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method638(0);
            if (var11 < 0 || class56.field1408[var10].length <= var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field969 = arg1.method631((byte) -115);
        if (super.field969 == 65535) {
            super.field969 = -1;
        }
        super.field954 = arg1.method631((byte) -101);
        if (super.field954 == 65535) {
            super.field954 = -1;
        }
        super.field950 = super.field954;
        super.field976 = arg1.method631((byte) -117);
        if (~super.field976 == -65536) {
            super.field976 = -1;
        }
        super.field973 = arg1.method631((byte) -128);
        if (~super.field973 == -65536) {
            super.field973 = -1;
        }
        super.field967 = arg1.method631((byte) -111);
        if (super.field967 == 65535) {
            super.field967 = -1;
        }
        super.field955 = arg1.method631((byte) -105);
        if (super.field955 == 65535) {
            super.field955 = -1;
        }
        super.field978 = arg1.method631((byte) -109);
        if (super.field978 == 65535) {
            super.field978 = -1;
        }
        this.field626 = class135.method1011(-5, arg1.method637((byte) 33)).method418(arg0 ^ 93);
        this.field617 = arg1.method638(arg0 ^ arg0);
        this.field619 = arg1.method631((byte) -123);
        if (this.field642 == null) {
            this.field642 = new class68();
        }
        this.field642.method536(var9, var5, var4, (byte) -79, var3 == 1);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
    public static final int method180(int arg0, int arg1, int arg2) {
        ++field632;
        if (arg2 != 32315) {
            return 123;
        } else {
            int var3 = arg1 * 57 + arg0;
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 - -1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 255;
        }
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
    public static void method181(int arg0) {
        field612 = null;
        field625 = null;
        field628 = null;
        if (arg0 != 65535) {
            field612 = null;
        }
        field636 = null;
        field633 = null;
        field622 = null;
        field639 = null;
        field643 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILm;Z)Lhe;")
    public static final class54 method182(int arg0, class83 arg1, boolean arg2) {
        ++field615;
        if (arg2) {
            return null;
        } else {
            try {
                class54 var3 = new class54();
                var3.field1325 = arg1.method636((byte) -50);
                if (var3.field1325 > arg0) {
                    var3.field1325 = arg0;
                }
                var3.field1323 = new byte[var3.field1325];
                arg1.field2076 += class17.field507.method702(arg1.field2055, var3.field1325, arg1.field2076, var3.field1323, arg2, 0);
                return var3;
            } catch (Exception var4) {
                return class53.field1277;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)Z")
    public final boolean method183(int arg0) {
        ++field640;
        if (this.field642 == null) {
            return false;
        } else {
            if (arg0 != -19456) {
                field622 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(Z)Loa;")
    public final class98 method184(boolean arg0) {
        if (arg0) {
            method182(-3, (class83) null, true);
        }
        ++field646;
        if (this.field642 == null) {
            return null;
        } else {
            class142 var2 = ~super.field981 != 0 && ~super.field926 == -1 ? class135.method1010(super.field981, (byte) -121) : null;
            class142 var3 = ~super.field961 == 0 || this.field627 || ~super.field969 == ~super.field961 && var2 != null ? null : class135.method1010(super.field961, (byte) -117);
            class98 var4 = this.field642.method539(super.field962, var2, super.field943, 850, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method777();
                super.field986 = var4.field1279;
                if (!this.field627 && super.field930 != -1 && super.field946 != -1) {
                    class98 var5 = class107.method813(-23222, super.field930).method371(124, super.field946);
                    if (var5 != null) {
                        class98[] var6 = new class98[] { var4, var5 };
                        var5.method776(0, -super.field933, 0);
                        var4 = new class98(var6, 2);
                    }
                }
                if (!this.field627 && this.field629 != null) {
                    if (this.field634 <= class4.field138) {
                        this.field629 = null;
                    }
                    if (class4.field138 >= this.field641 && this.field634 > class4.field138) {
                        class98 var7 = this.field629;
                        var7.method776(this.field635 - super.field974, -this.field637 + this.field616, -super.field971 + this.field631);
                        class98[] var8 = new class98[] { var4, var7 };
                        if (~super.field921 != -513) {
                            if (super.field921 != 1024) {
                                if (~super.field921 == -1537) {
                                    var7.method775();
                                }
                            } else {
                                var7.method775();
                                var7.method775();
                            }
                        } else {
                            var7.method775();
                            var7.method775();
                            var7.method775();
                        }
                        var4 = new class98(var8, 2);
                        if (super.field921 != 512) {
                            if (super.field921 != 1024) {
                                if (~super.field921 == -1537) {
                                    var7.method775();
                                    var7.method775();
                                    var7.method775();
                                }
                            } else {
                                var7.method775();
                                var7.method775();
                            }
                        } else {
                            var7.method775();
                        }
                        var7.method776(-this.field635 + super.field974, this.field637 - this.field616, -this.field631 + super.field971);
                    }
                }
                var4.field2454 = true;
                return var4;
            }
        }
    }
}
