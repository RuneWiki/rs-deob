import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class335 extends class394 implements class9 {

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "Z")
    private boolean field4747;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "S")
    private short field4756;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Z")
    private boolean field4745;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "B")
    private byte field4742;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "B")
    private byte field4757;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "B")
    private byte field4749;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "Z")
    private boolean field4762;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Z")
    private boolean field4735;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Lbk;")
    public class210 field4737;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "Lmm;")
    private class152 field4755;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "Liq;")
    public static class362 field4739 = new class362("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "Ltq;")
    public static class376 field4752;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "Lbm;")
    public static class59 field4740;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILae;I)Lbk;", line = 7)
    private final class210 method2165(int arg0, class134 arg1, int arg2) {
        ++field4743;
        if (this.field4737 != null && arg1.method689(this.field4737.method1410(), arg2) == 0) {
            return this.field4737;
        } else {
            if (arg0 != 0) {
                this.field4742 = 58;
            }
            class371 var4 = this.method2168(arg2, false, arg1, 131072);
            return var4 != null ? var4.field5233 : null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLae;)Ljg;", line = 30)
    public final class186 method52(byte arg0, class134 arg1) {
        ++field4754;
        if (this.field4737 == null) {
            return null;
        } else {
            class18 var3 = arg1.method649();
            var3.method116(super.field5555, super.field5554, super.field5566);
            class186 var4 = null;
            if (arg0 != -120) {
                this.method67(34);
            }
            if (this.field4762) {
                var4 = class348.method2229(1, arg0 ^ -21610);
            }
            this.field4737.method1416(var3, var4 != null ? var4.field2704[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILae;)V", line = 57)
    public final void method72(int arg0, class134 arg1) {
        ++field4746;
        Object var3 = null;
        int var4 = 31 / (arg0 / 55);
        class152 var6;
        if (this.field4755 == null && this.field4735) {
            class371 var5 = this.method2168(131072, true, arg1, 131072);
            var6 = var5 == null ? null : var5.field5235;
        } else {
            var6 = this.field4755;
            this.field4755 = null;
        }
        if (var6 != null) {
            class258.method1733(var6, this.field4742, super.field5555, super.field5566, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I", line = 84)
    public final int method71(byte arg0) {
        ++field4760;
        return arg0 > -36 ? 108 : 65535 & this.field4756;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lae;B)V", line = 105)
    public final void method64(class134 arg0, byte arg1) {
        if (arg1 < -50) {
            ++field4759;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILae;II)Z", line = 115)
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field4734;
        if (arg2 != 4835) {
            return true;
        } else {
            class210 var5 = this.method2165(0, arg1, 65536);
            if (var5 != null) {
                class18 var6 = arg1.method649();
                var6.method116(super.field5555, super.field5554, super.field5566);
                return var5.method1382(arg0, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V", line = 138)
    public static final void method2166(int arg0, int arg1) {
        class230.field3251.method1629(arg1, arg0 + 29147);
        if (arg0 != -29082) {
            method2166(-106, 20);
        }
        ++field4763;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Z", line = 150)
    public final boolean method67(int arg0) {
        ++field4758;
        if (arg0 != -3673) {
            this.method52((byte) -98, (class134) null);
        }
        return this.field4735;
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V", line = 162)
    public final void method51(int arg0) {
        if (arg0 != 6) {
            this.method52((byte) 124, (class134) null);
        }
        ++field4753;
        this.field4745 = false;
        if (this.field4737 != null) {
            this.field4737.method1387(-32769 & this.field4737.method1410());
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 184)
    public final void method65(int arg0) {
        if (this.field4737 != null) {
            this.field4737.method1409();
        }
        ++field4741;
        if (arg0 != 17184) {
            this.method60(false, (byte) 25, 37, -79, (class29) null, 60, (class134) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lae;Ljh;IIIIZIIZ)V", line = 199)
    public class335(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class302.method1990(arg7, (byte) -17, arg8));
        this.field4747 = arg6;
        this.field4756 = (short) arg1.field1026;
        this.field4745 = arg9;
        super.field5566 = (short) arg5;
        this.field4742 = (byte) arg2;
        super.field5555 = (short) arg3;
        this.field4757 = (byte) arg8;
        this.field4749 = (byte) arg7;
        this.field4762 = arg1.field998 != 0 && !arg6;
        this.field4735 = arg0.method615() && arg1.field995 && !this.field4747 && ~class141.field1739 != -1;
        int var11 = 1024;
        if (this.field4745) {
            var11 |= 32768;
        }
        class371 var12 = this.method2168(var11, this.field4735, arg0, 131072);
        if (var12 != null) {
            this.field4737 = var12.field5233;
            this.field4755 = var12.field5235;
            if (this.field4745) {
                this.field4737 = this.field4737.method1411((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lae;I)V", line = 233)
    public final void method66(class134 arg0, int arg1) {
        if (arg1 != 4257) {
            this.field4756 = -26;
        }
        ++field4738;
        Object var3 = null;
        class152 var5;
        if (this.field4755 == null && this.field4735) {
            class371 var4 = this.method2168(131072, true, arg0, 131072);
            var5 = var4 != null ? var4.field5235 : null;
        } else {
            var5 = this.field4755;
            this.field4755 = null;
        }
        if (var5 != null) {
            class122.method778(var5, this.field4742, super.field5555, super.field5566, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Z", line = 261)
    public final boolean method54(boolean arg0) {
        ++field4744;
        return !arg0 ? false : this.field4745;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I", line = 273)
    public final int method68(int arg0) {
        if (arg0 < 118) {
            this.method72(75, (class134) null);
        }
        ++field4748;
        return this.field4757;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I", line = 288)
    public final int method69(int arg0) {
        ++field4764;
        if (arg0 != -5944) {
            this.method65(-33);
        }
        return this.field4749;
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)V", line = 299)
    public static void method2167(int arg0) {
        field4752 = null;
        field4739 = null;
        field4740 = null;
        if (arg0 != 1024) {
            method2167(32);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZBIILna;ILae;)V", line = 311)
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        int var8 = -85 % ((-16 - arg1) / 62);
        ++field4750;
        if (!(arg4 instanceof class335)) {
            if (arg4 instanceof class444) {
                class444 var9 = (class444) arg4;
                if (this.field4737 != null && var9.field6358 != null) {
                    this.field4737.method1421(var9.field6358, arg3, arg2, arg5, arg0);
                    return;
                }
            }
        } else {
            class335 var10 = (class335) arg4;
            if (this.field4737 == null || var10.field4737 == null) {
                return;
            }
            this.field4737.method1421(var10.field4737, arg3, arg2, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lae;ZI)Lbk;", line = 346)
    public final class210 method70(class134 arg0, boolean arg1, int arg2) {
        ++field4736;
        if (!arg1) {
            this.field4745 = false;
        }
        return this.method2165(0, arg0, arg2);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZLae;I)Lsk;", line = 358)
    private final class371 method2168(int arg0, boolean arg1, class134 arg2, int arg3) {
        ++field4761;
        class88 var5 = class374.method2382(this.field4756 & 65535, false);
        class327 var6;
        class327 var7;
        if (this.field4747) {
            var6 = class98.field1191[0];
            var7 = class399.field5693[this.field4742];
        } else {
            if (~this.field4742 <= -4) {
                var6 = null;
            } else {
                var6 = class98.field1191[this.field4742 + 1];
            }
            var7 = class98.field1191[this.field4742];
        }
        return arg3 != 131072 ? null : var5.method482(this.field4757, arg1, var7, arg2, this.field4749, super.field5555, super.field5566, super.field5554, -110, arg0, var6);
    }
}
