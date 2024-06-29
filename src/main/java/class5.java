import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class389 {

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    private int field40 = -1;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    private int field37 = 0;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    private int field49 = 0;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    private int field54 = 0;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    private int field51 = -32768;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "Z")
    public boolean field61 = false;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lsm;")
    private class189 field34;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field55 = 1;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lak;")
    public static class234 field58 = new class234("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "J")
    public static long field48;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Lmq;")
    private class354 field42;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lul;")
    public static class406 field44;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        if (arg0 != 13651334) {
            return true;
        } else {
            ++field35;
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method18(int arg0) {
        field44 = null;
        field58 = null;
        if (arg0 != 25411) {
            field48 = -48L;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    public final void method19(int arg0, int arg1) {
        ++field50;
        if (!this.field61) {
            this.field54 += arg1;
            if (arg0 != 0) {
                this.method21(false);
            }
            while (~this.field54 < ~this.field34.field3204[this.field37]) {
                this.field54 -= this.field34.field3204[this.field37];
                ++this.field37;
                if (~this.field34.field3181.length >= ~this.field37) {
                    this.field61 = true;
                    break;
                }
            }
            if (!this.field61) {
                class501.method2969(this.field34, super.field5837, false, this.field37, -99, super.field5826, super.field5833);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public final void method20(int arg0) {
        if (arg0 != 2920) {
            this.method26(-25, 58, (class38) null, -71);
        }
        if (this.field42 != null) {
            this.field42.method2220();
        }
        ++field52;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public final void method21(boolean arg0) {
        if (arg0) {
            this.method19(-126, -85);
        }
        ++field46;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field42 != null) {
            this.field42.method2220();
        }
        ++field47;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lt;Lya;B)V")
    private final void method22(class475 arg0, class38 arg1, byte arg2) {
        ++field36;
        if (arg2 == 103) {
            class262[] var4 = arg0.method431();
            class471[] var5 = arg0.method456();
            if ((this.field42 == null || this.field42.field5241) && (var4 != null || var5 != null)) {
                this.field42 = new class354(class475.field6854);
            }
            if (this.field42 != null) {
                this.field42.method2223(arg1, (long) class475.field6854, var4, var5, false);
                this.field42.method2228(super.field5826, super.field5836, super.field5827, super.field5830, super.field5829);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILya;ILor;IZ)V")
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        ++field43;
        if (arg0 == 3) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)I")
    public final int method24(int arg0) {
        ++field45;
        if (arg0 != -867749273) {
            this.field60 = 74;
        }
        return this.field51;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lya;Z)V")
    public final void method25(class38 arg0, boolean arg1) {
        ++field39;
        class475 var3 = this.method26(this.field60, -1, arg0, 0);
        if (var3 != null) {
            this.method22(var3, arg0, (byte) 103);
        }
        if (arg1) {
            this.method25((class38) null, true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILya;I)Lt;")
    private final class475 method26(int arg0, int arg1, class38 arg2, int arg3) {
        ++field38;
        if (arg1 != -1) {
            this.method24(115);
        }
        class316 var5 = class123.field1839.method1490(arg0, true);
        class145 var6 = class289.field4358[super.field5826];
        class145 var7 = ~this.field57 <= -4 ? null : class289.field4358[this.field57 + 1];
        return !this.field61 ? var5.method2021(class242.field3846, arg3, super.field5833, 120, var7, super.field5831, true, this.field37, this.field54, super.field5837, var6, arg2, this.field40) : var5.method2021(class242.field3846, arg3, super.field5833, -93, var7, super.field5831, true, -1, 0, super.field5837, var6, arg2, -1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLya;II)Z")
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        ++field53;
        if (arg0 > -119) {
            this.field49 = -98;
        }
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field59 = arg1 + arg2;
        this.field60 = arg0;
        this.field49 = arg12;
        this.field57 = arg4;
        class316 var14 = class123.field1839.method1490(this.field60, true);
        int var15 = var14.field4775;
        if (var15 != -1) {
            this.field34 = class242.field3846.method2238(var15, (byte) 78);
            this.field61 = false;
        } else {
            this.field61 = true;
        }
        if (this.field59 == arg2) {
            class501.method2969(this.field34, super.field5837, false, this.field37, -76, super.field5826, super.field5833);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([[BILjs;)V")
    public static final void method28(byte[][] arg0, int arg1, class219 arg2) {
        if (arg1 <= -82) {
            ++field41;
            int var3 = class60.field719.length;
            for (int var4 = 0; ~var3 < ~var4; ++var4) {
                byte[] var5 = arg0[var4];
                if (var5 != null) {
                    int var6 = (class505.field7380[var4] >> 8) * 64 + -class390.field5842;
                    int var7 = (255 & class505.field7380[var4]) * 64 + -class176.field2613;
                    class92.method746(980099212);
                    arg2.method1579(var5, var6, class184.field2758, class377.field5692, -1, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lya;I)Lag;")
    public final class484 method29(class38 arg0, int arg1) {
        ++field56;
        class475 var3 = this.method26(this.field60, -1, arg0, 2048 | (this.field49 == 0 ? 0 : 5));
        if (var3 == null) {
            return null;
        } else {
            if (this.field49 != 0) {
                var3.method438(this.field49 * 2048);
            }
            class125 var4 = arg0.method296();
            var4.method206(super.field5837, super.field5831, super.field5833);
            if (this.field42 != null) {
                class341 var5 = this.field42.method2221();
                arg0.method311(var3, var5, var4, (class83) null, 0);
            } else {
                var3.method439(var4, (class83) null, 0);
            }
            this.field51 = var3.method427();
            if (arg1 <= 22) {
                field48 = 86L;
            }
            this.method22(var3, arg0, (byte) 103);
            return null;
        }
    }
}
