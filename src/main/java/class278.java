import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class278 extends class430 implements class161 {

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "Lob;")
    public class438 field3760;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "Z")
    private boolean field3756;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!qq", name = "V", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "Lqj;")
    public static class296 field3753;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V")
    public static void method1697(int arg0) {
        if (arg0 != -12688) {
            method1697(-76);
        }
        field3753 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Laa;I)Lcn;")
    public final class300 method131(class281 arg0, int arg1) {
        ++field3757;
        class75 var3 = this.field3760.method2747(arg0, super.field6192, super.field6197, false, true, 1024, true);
        if (var3 == null) {
            return null;
        } else {
            class261 var4 = arg0.method1769();
            if (arg1 < 72) {
                field3758 = 85;
            }
            var4.method882(super.field6197, super.field6191, super.field6192);
            class300 var5 = null;
            if (this.field3756) {
                var5 = class8.method54((byte) -114, 1);
            }
            if (this.field3760.field6318 != null) {
                class260 var6 = this.field3760.field6318.method1014();
                arg0.method1721(var3, var6, var4, var5 != null ? var5.field4152[0] : null, 0);
            } else {
                var3.method514(var4, var5 == null ? null : var5.field4152[0], 0);
            }
            this.field3760.method2744(super.field6185, super.field6195, var3, true, arg0, super.field6182, super.field6186, (byte) -96);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Laa;B)V")
    public final void method122(class281 arg0, byte arg1) {
        this.field3760.method2751(arg0, (byte) 57);
        if (arg1 >= 16) {
            ++field3751;
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)V")
    public final void method135(byte arg0) {
        if (arg0 != -123) {
            this.field3760 = null;
        }
        ++field3755;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I")
    public final int method124(int arg0) {
        if (arg0 != -11197) {
            this.method131((class281) null, 18);
        }
        ++field3754;
        return this.field3760.field6324;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Laa;Z)V")
    public final void method128(class281 arg0, boolean arg1) {
        ++field3769;
        class75 var3 = this.field3760.method2747(arg0, super.field6192, super.field6197, true, true, 131072, arg1);
        if (var3 != null) {
            this.field3760.method2744(super.field6185, super.field6195, var3, false, arg0, super.field6182, super.field6186, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
    public final void method138(int arg0) {
        ++field3752;
        if (arg0 != -4728) {
            method1697(27);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Laa;IB)Lhc;")
    public final class75 method134(class281 arg0, int arg1, byte arg2) {
        ++field3770;
        if (arg2 >= -25) {
            this.method122((class281) null, (byte) 66);
        }
        return this.field3760.method2747(arg0, 0, 0, false, false, arg1, true);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
    public final int method123(byte arg0) {
        ++field3759;
        return arg0 < 108 ? -123 : this.field3760.field6316;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
    public final int method126(int arg0) {
        if (arg0 != -13482) {
            return -67;
        } else {
            ++field3764;
            return this.field3760.field6297;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Laa;Lsk;IIIIIIIZIIIII)V")
    public class278(class281 arg0, class369 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.field5177 == 1, class423.method2671(arg3, true, arg2));
        this.field3760 = new class438(arg0, arg1, arg2, arg3, super.field6198, arg5, arg6, arg8, arg9, arg14);
        this.field3756 = ~arg1.field5221 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)I")
    public final int method600(boolean arg0) {
        ++field3768;
        if (!arg0) {
            method1697(-22);
        }
        return this.field3760.method2740((byte) 86);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Z")
    public final boolean method127(byte arg0) {
        ++field3762;
        int var2 = 118 / ((arg0 - -52) / 33);
        return this.field3760.method2743((byte) 115);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILaa;)Z")
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field3761;
        class75 var5 = this.field3760.method2747(arg3, super.field6192, super.field6197, false, false, 65536, true);
        if (var5 == null) {
            return false;
        } else {
            class261 var6 = arg3.method1769();
            var6.method882(super.field6197, super.field6191, super.field6192);
            if (arg0 != 0) {
                this.field3756 = true;
            }
            return var5.method516(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Laa;B)V")
    public final void method133(class281 arg0, byte arg1) {
        if (arg1 == -102) {
            ++field3763;
            this.field3760.method2753(arg0, -7608);
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        ++field3766;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZIILaa;ILqh;)V")
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        ++field3767;
        if (arg0 != 0) {
            this.method600(false);
        }
        throw new IllegalStateException();
    }
}
