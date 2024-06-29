import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class560 extends class137 implements class339 {

    @OriginalMember(owner = "client!kga", name = "T", descriptor = "B")
    private byte field7768;

    @OriginalMember(owner = "client!kga", name = "eb", descriptor = "B")
    private byte field7779;

    @OriginalMember(owner = "client!kga", name = "ib", descriptor = "Z")
    private boolean field7783;

    @OriginalMember(owner = "client!kga", name = "O", descriptor = "Z")
    private boolean field7763;

    @OriginalMember(owner = "client!kga", name = "I", descriptor = "S")
    private short field7757;

    @OriginalMember(owner = "client!kga", name = "X", descriptor = "Z")
    private boolean field7772;

    @OriginalMember(owner = "client!kga", name = "hb", descriptor = "Lha;")
    private class119 field7782;

    @OriginalMember(owner = "client!kga", name = "V", descriptor = "Lda;")
    private class474 field7770;

    @OriginalMember(owner = "client!kga", name = "jb", descriptor = "Lrga;")
    public static class280 field7784 = new class280(55, -1);

    @OriginalMember(owner = "client!kga", name = "H", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!kga", name = "J", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!kga", name = "K", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!kga", name = "L", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!kga", name = "M", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!kga", name = "N", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!kga", name = "P", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!kga", name = "Q", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!kga", name = "R", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!kga", name = "S", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!kga", name = "U", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!kga", name = "W", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!kga", name = "Y", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!kga", name = "Z", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!kga", name = "ab", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!kga", name = "bb", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!kga", name = "cb", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!kga", name = "db", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!kga", name = "fb", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!kga", name = "kb", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!kga", name = "nb", descriptor = "J")
    public static long field7788;

    @OriginalMember(owner = "client!kga", name = "gb", descriptor = "Lsd;")
    private class362 field7781;

    @OriginalMember(owner = "client!kga", name = "lb", descriptor = "Lrj;")
    public static class648 field7786;

    @OriginalMember(owner = "client!kga", name = "mb", descriptor = "[[[Z")
    public static boolean[][][] field7787;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        ++field7774;
        class474 var5 = this.method3078(131072, arg2, 113);
        if (arg3 != 9678) {
            return true;
        } else if (var5 != null) {
            class491 var6 = arg2.method995();
            var6.method914(super.field6461, super.field6458, super.field6464);
            return !class36.field498 ? var5.method744(arg0, arg1, var6, false) : var5.method738(arg0, arg1, var6, false, class432.field5406);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        ++field7758;
        if (this.field7770 != null) {
            this.field7770.method726();
        }
        if (arg0) {
            field7788 = -97L;
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)I")
    public final int method65(byte arg0) {
        ++field7759;
        return arg0 < 126 ? 94 : this.field7757 & 65535;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(BLr;)V")
    public final void method80(byte arg0, class566 arg1) {
        ++field7778;
        if (arg0 != -114) {
            this.field7783 = true;
        }
        Object var3 = null;
        class119 var5;
        if (this.field7782 == null && this.field7772) {
            class275 var4 = this.method3077(arg1, 262144, true, -1);
            var5 = var4 == null ? null : var4.field3457;
        } else {
            var5 = this.field7782;
            this.field7782 = null;
        }
        if (var5 != null) {
            class182.method1138(var5, super.field6456, super.field6461, super.field6464, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        if (arg0 <= 114) {
            field7787 = null;
        }
        ++field7762;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lr;I)Lsd;")
    public final class362 method82(class566 arg0, int arg1) {
        ++field7766;
        if (this.field7781 == null) {
            this.field7781 = class286.method1606(-24294, super.field6458, this.method3078(0, arg0, 70), super.field6464, super.field6461);
        }
        return arg1 != -1660704056 ? null : this.field7781;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)Z")
    public static final boolean method3073(int arg0, int arg1, int arg2) {
        ++field7767;
        if (arg0 != 262144) {
            method3075(53, 31, true, -83, -59);
        }
        return ~(262144 & arg1) != -1 | class627.method3446(arg2, arg1, 0) || class512.method2762(arg1, arg0 ^ 262199, arg2);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(III)V")
    public static final void method3074(int arg0, int arg1, int arg2) {
        if (~class19.field287 == -2) {
            class161.method929(0, arg2, class480.field6386, arg0);
        } else if (~class19.field287 == -3) {
            class419.method2230(arg0, arg2, -11387);
        }
        ++field7785;
        class19.field287 = 0;
        if (arg1 <= 74) {
            field7784 = null;
        }
        class480.field6386 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZLr;)Log;")
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field7765;
        if (this.field7770 == null) {
            return null;
        } else {
            class491 var3 = arg1.method995();
            var3.method914(super.field1783 + super.field6461, super.field6458, super.field1776 + super.field6464);
            if (arg0) {
                this.method70((byte) 16, (class566) null);
            }
            class101 var4 = null;
            if (this.field7763) {
                var4 = class676.method3794(!arg0, 1);
            }
            if (class36.field498) {
                this.field7770.method751(var3, var4 != null ? var4.field1361[0] : null, class432.field5406, 0);
            } else {
                this.field7770.method717(var3, var4 != null ? var4.field1361[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        if (arg0 != 23) {
            this.field7757 = 45;
        }
        ++field7775;
        return this.field7770 == null ? false : this.field7770.method740();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLr;)V")
    public final void method70(byte arg0, class566 arg1) {
        ++field7764;
        Object var3 = null;
        int var4 = -21 % ((arg0 - -19) / 34);
        class119 var6;
        if (this.field7782 == null && this.field7772) {
            class275 var5 = this.method3077(arg1, 262144, true, -1);
            var6 = var5 == null ? null : var5.field3457;
        } else {
            var6 = this.field7782;
            this.field7782 = null;
        }
        if (var6 != null) {
            class8.method63(var6, super.field6456, super.field6461, super.field6464, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIZII)V")
    public static final void method3075(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field7769;
        if (arg2 || class313.field4036 != arg3 || ~class285.field3532 != ~arg4 || ~class667.field9402 != ~class476.field6039 && !class301.field3698.method135(class651.field9191, 109)) {
            class313.field4036 = arg3;
            class667.field9402 = class476.field6039;
            class285.field3532 = arg4;
            if (class301.field3698.method135(class651.field9191, arg1 ^ 626)) {
                class667.field9402 = 0;
            }
            class361.method1987(arg0, -117);
            class112.method627(true, class32.field452, true, class689.field9771, class133.field1729, class83.field1120.method476((byte) -103, class250.field3068));
            int var5 = class145.field1879;
            class145.field1879 = (-(class431.field5395 >> 4) + class313.field4036) * 8;
            int var6 = class630.field8817;
            class630.field8817 = (-(class452.field5802 >> 4) + class285.field3532) * 8;
            class142.field1837 = class656.method3691(class313.field4036 * 8, class285.field3532 * 8);
            class61.field827 = null;
            int var7 = -var5 + class145.field1879;
            int var8 = -var6 + class630.field8817;
            if (arg0 != 11) {
                class470.field5974 = 0;
                boolean var9 = false;
                int var10 = class431.field5395 * 512 + -512;
                int var11 = (class452.field5802 - 1) * 512;
                for (int var12 = 0; ~class441.field5585 < ~var12; ++var12) {
                    class206 var13 = class518.field7076[var12];
                    if (var13 != null) {
                        class307 var14 = var13.field2618;
                        var14.field6464 -= var8 * 512;
                        var14.field6461 -= var7 * 512;
                        if (~var14.field6461 <= -1 && ~var10 <= ~var14.field6461 && ~var14.field6464 <= -1 && ~var11 <= ~var14.field6464) {
                            boolean var15 = true;
                            for (int var16 = 0; ~var16 > -11; ++var16) {
                                var14.field9758[var16] -= var7;
                                var14.field9754[var16] -= var8;
                                if (~var14.field9758[var16] > -1 || class431.field5395 <= var14.field9758[var16] || ~var14.field9754[var16] > -1 || ~var14.field9754[var16] <= ~class452.field5802) {
                                    var15 = false;
                                }
                            }
                            if (!var15) {
                                var14.method1781((class586) null, 0);
                                var13.method1871(-32);
                                var9 = true;
                            } else {
                                class153.field1958[class470.field5974++] = var14.field9676;
                            }
                        } else {
                            var14.method1781((class586) null, arg1 ^ 512);
                            var13.method1871(-94);
                            var9 = true;
                        }
                    }
                }
                if (var9) {
                    class441.field5585 = class180.field2318.method404((byte) -26);
                    class180.field2318.method400(class518.field7076, (byte) -95);
                }
            } else {
                for (int var17 = 0; class441.field5585 > var17; ++var17) {
                    class206 var30 = class518.field7076[var17];
                    if (var30 != null) {
                        class307 var31 = var30.field2618;
                        for (int var32 = 0; ~var32 > -11; ++var32) {
                            var31.field9758[var32] -= var7;
                            var31.field9754[var32] -= var8;
                        }
                        var31.field6461 -= var7 * 512;
                        var31.field6464 -= var8 * 512;
                    }
                }
            }
            int var18 = 0;
            if (arg1 == 512) {
                while (~var18 > -2049) {
                    class514 var28 = class351.field4490[var18];
                    if (var28 != null) {
                        for (int var29 = 0; var29 < 10; ++var29) {
                            var28.field9758[var29] -= var7;
                            var28.field9754[var29] -= var8;
                        }
                        var28.field6464 -= var8 * 512;
                        var28.field6461 -= var7 * 512;
                    }
                    ++var18;
                }
                class651[] var19 = class52.field784;
                for (int var20 = 0; var19.length > var20; ++var20) {
                    class651 var27 = var19[var20];
                    if (var27 != null) {
                        var27.field9189 -= var8 * 512;
                        var27.field9194 -= var7 * 512;
                    }
                }
                for (class62 var21 = (class62) class467.field5934.method237(106); var21 != null; var21 = (class62) class467.field5934.method245((byte) 56)) {
                    var21.field835 -= var8;
                    var21.field845 -= var7;
                    if (class360.field4584 != 4 && (var21.field845 < 0 || var21.field835 < 0 || ~var21.field845 <= ~class431.field5395 || class452.field5802 <= var21.field835)) {
                        var21.method1871(-18);
                    }
                }
                if (class360.field4584 != 4) {
                    for (class650 var22 = (class650) class533.field7185.method407((byte) 124); var22 != null; var22 = (class650) class533.field7185.method403(12561)) {
                        int var23 = (int) (16383L & var22.field4199);
                        int var24 = -class145.field1879 + var23;
                        int var25 = (int) (16383L & var22.field4199 >> 14);
                        int var26 = -class630.field8817 + var25;
                        if (var24 < 0 || ~var26 > -1 || var24 >= class431.field5395 || class452.field5802 <= var26) {
                            var22.method1871(arg1 ^ -584);
                        }
                    }
                }
                if (~class309.field3946 != -1) {
                    class309.field3946 -= var7;
                    class436.field5446 -= var8;
                }
                class511.method2758(50);
                if (~arg0 == -12) {
                    if (~class296.field3661 != -5) {
                        class296.field3661 = 1;
                        class196.field2471 = -1;
                        class306.field3890 = -1;
                    } else {
                        class263.field3256 -= var7 * 512;
                        class91.field1278 -= var8 * 512;
                        class493.field6499 -= var7 * 512;
                        class214.field2661 -= var8 * 512;
                    }
                } else {
                    class20.field292 -= var7 * 512;
                    class400.field5020 -= var7;
                    class72.field971 -= var8;
                    class257.field3130 -= var7;
                    class277.field3471 -= var8;
                    class276.field3464 -= var8 * 512;
                    if (Math.abs(var7) > class431.field5395 || Math.abs(var8) > class452.field5802) {
                        class19.method122(2);
                    }
                }
                class362.method1989(10);
                class687.method3870((byte) -108);
                class310.field3952.method247(arg1 ^ 514);
                class201.field2540.method247(2);
                class580.field8120.method799(128);
                class524.method2857(arg1 ^ -595);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(ZLr;)V")
    public final void method67(boolean arg0, class566 arg1) {
        if (arg0) {
            field7787 = null;
        }
        ++field7776;
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(B)I")
    public final int method78(byte arg0) {
        int var2 = -15 / ((12 - arg0) / 48);
        ++field7761;
        return this.field7779;
    }

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "(B)V")
    public static void method3076(byte arg0) {
        field7786 = null;
        if (arg0 <= 80) {
            method3074(-112, -16, -106);
        }
        field7784 = null;
        field7787 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lr;IZI)Lkj;")
    private final class275 method3077(class566 arg0, int arg1, boolean arg2, int arg3) {
        ++field7777;
        class441 var5 = class428.field5352.method3138((byte) 41, 65535 & this.field7757);
        if (arg3 != -1) {
            this.method74((byte) 51);
        }
        class272 var6;
        class272 var7;
        if (!this.field7783) {
            if (super.field6456 >= 3) {
                var6 = null;
            } else {
                var6 = class256.field3127[super.field6456 - -1];
            }
            var7 = class256.field3127[super.field6456];
        } else {
            var6 = class256.field3127[0];
            var7 = class699.field9887[super.field6456];
        }
        return var5.method2362(arg1, arg0, super.field6458, var7, super.field6461, -129, var6, super.field6464, arg2, this.field7768, this.field7779);
    }

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "(I)I")
    public final int method71(int arg0) {
        ++field7756;
        int var2 = 9 % ((-43 - arg0) / 59);
        return this.field7770 != null ? this.field7770.method757() : 0;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)I")
    public final int method74(byte arg0) {
        ++field7773;
        if (arg0 != 42) {
            this.method65((byte) 54);
        }
        return this.field7768;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lr;Lbda;IIIIIZIIII)V")
    public class560(class566 arg0, class441 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field7768 = (byte) arg10;
        this.field7779 = (byte) arg11;
        super.field6464 = arg6;
        super.field6461 = arg4;
        this.field7783 = arg7;
        this.field7763 = arg1.field5560 != 0 && !arg7;
        this.field7757 = (short) arg1.field5504;
        this.field7772 = arg0.method975() && arg1.field5558 && !this.field7783 && ~class301.field3698.method2703(class651.field9191, -124) != -1;
        class275 var13 = this.method3077(arg0, 2048, this.field7772, -1);
        if (var13 != null) {
            this.field7782 = var13.field3457;
            this.field7770 = var13.field3456;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        if (arg0 != 3755) {
            field7787 = null;
        }
        ++field7760;
        return this.field7772;
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)I")
    public final int method72(int arg0) {
        if (arg0 != -22496) {
            this.field7781 = null;
        }
        ++field7771;
        return this.field7770 == null ? 0 : this.field7770.method704();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILr;I)Lda;")
    private final class474 method3078(int arg0, class566 arg1, int arg2) {
        ++field7780;
        if (arg2 < 21) {
            this.method75(-29, -42, (class566) null, 45);
        }
        if (this.field7770 != null && ~arg1.method998(this.field7770.method764(), arg0) == -1) {
            return this.field7770;
        } else {
            class275 var4 = this.method3077(arg1, arg0, false, -1);
            return var4 == null ? null : var4.field3456;
        }
    }
}
