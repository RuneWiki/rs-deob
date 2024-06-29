import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class311 extends class172 implements class339 {

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "B")
    private byte field3981;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "Z")
    private boolean field3997;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "Z")
    private boolean field3999;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "Z")
    private boolean field3983;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "B")
    private byte field3974;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "S")
    private short field3984;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "Z")
    private boolean field3973;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Lha;")
    private class119 field3970;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lda;")
    public class474 field3975;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "Lrga;")
    public static class280 field3977 = new class280(8, 15);

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lsd;")
    private class362 field3976;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "[Lhv;")
    public static class199[] field3980;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)I")
    public final int method1796(int arg0) {
        if (arg0 < 15) {
            this.method83((byte) 72);
        }
        ++field3989;
        return this.field3975 == null ? 15 : this.field3975.method727() / 4;
    }

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)I")
    public static final int method1797(int arg0) {
        ++field3982;
        if (arg0 != -3) {
            return -5;
        } else {
            if (class358.field4562 == null) {
                if (!class84.field1188 && class463.field5904 > 0) {
                    if (class267.field3381 && class277.field3470.method448((byte) -68, 81) && ~class463.field5904 < -3) {
                        return ((class145) class1.field7.field541.field4196.field4196).field1870;
                    }
                    return ((class145) class1.field7.field541.field4196).field1870;
                }
                int var1 = class289.field3592.method944(arg0 ^ -2003);
                int var2 = class289.field3592.method941(104);
                int var3 = class219.field2680;
                int var4 = class88.field1231;
                int var5 = class672.field9461;
                if (var1 > var3 && var1 < var3 + var5) {
                    int var6 = -1;
                    for (int var7 = 0; ~var7 > ~class463.field5904; ++var7) {
                        if (!class9.field186) {
                            int var11 = var4 + 31 - -((class463.field5904 + -1 + -var7) * 16);
                            if (~(var11 + -13) > ~var2 && ~(var11 + 3) <= ~var2) {
                                var6 = var7;
                            }
                        } else {
                            int var12 = (class463.field5904 + -1 + -var7) * 16 + var4 - -33;
                            if (var2 > var12 - 13 && ~var2 >= ~(var12 + 3)) {
                                var6 = var7;
                            }
                        }
                    }
                    if (var6 != -1) {
                        int var8 = 0;
                        class486 var9 = new class486(class1.field7);
                        for (class145 var10 = (class145) var9.method2635(-96); var10 != null; var10 = (class145) var9.method2634(arg0 + -15837)) {
                            if (var6 == var8++) {
                                return var10.field1870;
                            }
                        }
                    }
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        if (arg3 != 9678) {
            return false;
        } else {
            ++field3985;
            class474 var5 = this.method1799(21915, 131072, arg2);
            if (var5 != null) {
                class491 var6 = arg2.method995();
                var6.method914(super.field6461, super.field6458, super.field6464);
                return class36.field498 ? var5.method738(arg0, arg1, var6, false, class432.field5406) : var5.method744(arg0, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLr;)V")
    public final void method70(byte arg0, class566 arg1) {
        ++field3979;
        int var3 = 29 % ((arg0 - -19) / 34);
        Object var4 = null;
        class119 var6;
        if (this.field3970 == null && this.field3973) {
            class275 var5 = this.method1800(43, 262144, true, arg1);
            var6 = var5 == null ? null : var5.field3457;
        } else {
            var6 = this.field3970;
            this.field3970 = null;
        }
        if (var6 != null) {
            class8.method63(var6, super.field6456, super.field6461, super.field6464, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZII)V")
    public static final void method1798(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field3998;
        if (arg0 == 4) {
            if (class525.method2860((byte) 108, arg3)) {
                class237.method1423(arg4, arg1, class103.field1390[arg3], -1, arg2, arg0 ^ -127);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(B)Z")
    public final boolean method79(byte arg0) {
        ++field3967;
        if (arg0 >= -26) {
            field3977 = null;
        }
        return this.field3983;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)I")
    public final int method71(int arg0) {
        int var2 = -39 % ((-43 - arg0) / 59);
        ++field3986;
        return this.field3975 == null ? 0 : this.field3975.method757();
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(BLr;)V")
    public final void method80(byte arg0, class566 arg1) {
        ++field3968;
        Object var3 = null;
        class119 var5;
        if (this.field3970 == null && this.field3973) {
            class275 var4 = this.method1800(arg0 + 209, 262144, true, arg1);
            var5 = var4 == null ? null : var4.field3457;
        } else {
            var5 = this.field3970;
            this.field3970 = null;
        }
        if (var5 != null) {
            class182.method1138(var5, super.field6456, super.field6461, super.field6464, (boolean[]) null);
        }
        if (arg0 != -114) {
            this.method78((byte) 30);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(ZLr;)V")
    public final void method67(boolean arg0, class566 arg1) {
        ++field3995;
        if (arg0) {
            this.field3976 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILr;)Lda;")
    private final class474 method1799(int arg0, int arg1, class566 arg2) {
        ++field3972;
        if (this.field3975 != null && arg2.method998(this.field3975.method764(), arg1) == 0) {
            return this.field3975;
        } else if (arg0 != 21915) {
            return null;
        } else {
            class275 var4 = this.method1800(119, arg1, false, arg2);
            return var4 != null ? var4.field3456 : null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIBLr;Llo;II)V")
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        ++field3992;
        int var8 = -58 / ((-50 - arg2) / 55);
        if (arg4 instanceof class639) {
            class639 var9 = (class639) arg4;
            if (this.field3975 != null && var9.field8962 != null) {
                this.field3975.method725(var9.field8962, arg1, arg5, arg6, arg0);
            }
        } else {
            if (arg4 instanceof class311) {
                class311 var10 = (class311) arg4;
                if (this.field3975 != null && var10.field3975 != null) {
                    this.field3975.method725(var10.field3975, arg1, arg5, arg6, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
    public final int method65(byte arg0) {
        if (arg0 < 126) {
            return 4;
        } else {
            ++field3966;
            return 65535 & this.field3984;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)I")
    public final int method78(byte arg0) {
        ++field3988;
        int var2 = 54 / ((arg0 - 12) / 48);
        return this.field3974;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lr;I)Lsd;")
    public final class362 method82(class566 arg0, int arg1) {
        if (arg1 != -1660704056) {
            field3980 = null;
        }
        if (this.field3976 == null) {
            this.field3976 = class286.method1606(-24294, super.field6458, this.method1799(21915, 0, arg0), super.field6464, super.field6461);
        }
        ++field3971;
        return this.field3976;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public final void method66(int arg0) {
        ++field3969;
        this.field3983 = false;
        if (arg0 != -1) {
            this.method82((class566) null, -29);
        }
        if (this.field3975 != null) {
            this.field3975.method761(-65537 & this.field3975.method764());
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
    public final int method74(byte arg0) {
        if (arg0 != 42) {
            this.method1799(55, -23, (class566) null);
        }
        ++field3993;
        return this.field3981;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLr;)Log;")
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field3991;
        if (this.field3975 == null) {
            return null;
        } else {
            class491 var3 = arg1.method995();
            var3.method914(super.field6461, super.field6458, super.field6464);
            class101 var4 = null;
            if (this.field3999) {
                var4 = class676.method3794(true, 1);
            }
            if (arg0) {
                this.field3970 = null;
            }
            if (class36.field498) {
                this.field3975.method751(var3, var4 == null ? null : var4.field1361[0], class432.field5406, 0);
            } else {
                this.field3975.method717(var3, var4 != null ? var4.field1361[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
    public final int method72(int arg0) {
        ++field3990;
        if (arg0 != -22496) {
            this.method65((byte) -127);
        }
        return this.field3975 != null ? this.field3975.method704() : 0;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        ++field3978;
        if (arg0 < 114) {
            this.field3975 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        if (arg0 != 3755) {
            this.field3974 = -104;
        }
        ++field3987;
        return this.field3973;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZLr;)Lkj;")
    private final class275 method1800(int arg0, int arg1, boolean arg2, class566 arg3) {
        ++field4000;
        class441 var5 = class428.field5352.method3138((byte) 92, this.field3984 & 65535);
        if (arg0 <= 34) {
            field3980 = null;
        }
        class272 var6;
        class272 var7;
        if (!this.field3997) {
            var6 = class256.field3127[super.field6456];
            if (super.field6456 >= 3) {
                var7 = null;
            } else {
                var7 = class256.field3127[super.field6456 + 1];
            }
        } else {
            var6 = class699.field9887[super.field6456];
            var7 = class256.field3127[0];
        }
        return var5.method2362(arg1, arg3, super.field6458, var6, super.field6461, -129, var7, super.field6464, arg2, this.field3981 != 11 ? this.field3981 : 10, this.field3981 == 11 ? 4 - -this.field3974 : this.field3974);
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(B)V")
    public static void method1801(byte arg0) {
        if (arg0 != -27) {
            field3980 = null;
        }
        field3977 = null;
        field3980 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        if (arg0) {
            this.method71(23);
        }
        if (this.field3975 != null) {
            this.field3975.method726();
        }
        ++field4001;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        if (arg0 != 23) {
            return true;
        } else {
            ++field3996;
            return this.field3975 != null ? this.field3975.method740() : false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Les;ZI)V")
    public static final void method1802(class630 arg0, boolean arg1, int arg2) {
        if (class546.field7273 != null) {
            try {
                class546.field7273.method3555(13755, 0L);
                class546.field7273.method3556(arg0.field8804, arg2, 24, 27895);
            } catch (Exception var3) {
            }
        }
        if (!arg1) {
            method1802((class630) null, false, -107);
        }
        ++field3994;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lr;Lbda;IIIIIZIIIIIIZ)V")
    public class311(class566 arg0, class441 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5507 == 1, class626.method3445(arg12, arg13, 99));
        super.field6456 = (byte) arg3;
        this.field3981 = (byte) arg12;
        this.field3997 = arg7;
        this.field3999 = ~arg1.field5560 != -1 && !arg7;
        this.field3983 = arg14;
        this.field3974 = (byte) arg13;
        this.field3984 = (short) arg1.field5504;
        this.field3973 = arg0.method975() && arg1.field5558 && !this.field3997 && ~class301.field3698.method2703(class651.field9191, -122) != -1;
        int var16 = 2048;
        if (this.field3983) {
            var16 |= 65536;
        }
        class275 var17 = this.method1800(72, var16, this.field3973, arg0);
        if (var17 != null) {
            this.field3970 = var17.field3457;
            this.field3975 = var17.field3456;
            if (this.field3983) {
                this.field3975 = this.field3975.method711((byte) 0, var16, false);
                return;
            }
        }
    }
}
