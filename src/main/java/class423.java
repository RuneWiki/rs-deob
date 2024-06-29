import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class423 extends class206 implements class285 {

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Lie;")
    public class53 field6210;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "Z")
    private boolean field6209;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Ljava/lang/String;")
    public static String field6196 = "Loading wordpack - ";

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Lvl;")
    public static class374 field6195 = class123.method665(70);

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field6203 = 0;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIIILai;ILvm;)V")
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        if (arg1 >= 36) {
            ++field6197;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lvm;Lds;IIIIIIZI)V")
    public class423(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field3067, arg1.field3043);
        this.field6210 = new class53(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field6209 = arg1.field3027 != 0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lam;B)V")
    public static final void method2632(class286 arg0, byte arg1) {
        if (arg1 != 99) {
            method2633(-28, (byte) 10, -72, -119);
        }
        class356.field5038 = arg0;
        ++field6205;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLvm;)V")
    public final void method347(byte arg0, class322 arg1) {
        this.field6210.method260(false, arg1);
        ++field6214;
        if (arg0 != -108) {
            this.method353(false, -66, -38, -104, (class128) null, -23, (class322) null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)I")
    public final int method351(byte arg0) {
        if (arg0 != 103) {
            return 32;
        } else {
            ++field6204;
            return this.field6210.field532;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)Z")
    public final boolean method345(byte arg0) {
        ++field6215;
        if (arg0 != -72) {
            this.method357(false, (class322) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I")
    public final int method356(int arg0) {
        ++field6206;
        if (arg0 != 10397) {
            method2634((byte) 101);
        }
        return this.field6210.field539;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public final void method346(int arg0) {
        ++field6208;
        if (arg0 < -13) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)I")
    public final int method339(int arg0) {
        ++field6213;
        int var2 = -27 % ((arg0 - 19) / 32);
        return this.field6210.field516;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
    public final boolean method358(byte arg0) {
        if (arg0 != 24) {
            this.field6210 = null;
        }
        ++field6207;
        return this.field6210.method256(15842);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBII)I")
    public static final int method2633(int arg0, byte arg1, int arg2, int arg3) {
        ++field6202;
        if ((8 & class282.field3872[arg0][arg3][arg2]) != 0) {
            return 0;
        } else if (arg1 != -99) {
            return 61;
        } else {
            return arg0 > 0 && ~(2 & class282.field3872[1][arg3][arg2]) != -1 ? arg0 + -1 : arg0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lvm;Z)Ldn;")
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field6211;
        class396 var3 = this.field6210.method258(arg0, super.field2776, 1024, super.field2775, -1, true, false);
        if (var3 == null) {
            return null;
        } else {
            class247 var4 = arg0.method1650();
            var4.method747(super.field2775, super.field2780, super.field2776);
            class321 var5 = null;
            if (this.field6209) {
                var5 = class204.method1110(258, 1);
            }
            if (this.field6210.field546 == null) {
                var3.method2284(var4, var5 == null ? null : var5.field4293[0], 0);
            } else {
                class366 var6 = this.field6210.field546.method917();
                arg0.method1622(var3, var6, var4, var5 == null ? null : var5.field4293[0], 0);
            }
            this.field6210.method262(super.field2776 >> 7, arg0, super.field2775 >> 7, super.field2776 >> 7, arg1, true, var3, super.field2775 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILvm;)Z")
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field6201;
        class396 var5 = this.field6210.method258(arg3, super.field2776, 65536, super.field2775, -1, false, false);
        if (arg0 != -23563) {
            this.field6209 = false;
        }
        if (var5 == null) {
            return false;
        } else {
            class247 var6 = arg3.method1650();
            var6.method747(super.field2775, super.field2780, super.field2776);
            return var5.method2300(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLvm;)V")
    public final void method357(boolean arg0, class322 arg1) {
        this.field6210.method261(-46, arg1);
        if (!arg0) {
            ++field6199;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public final void method350(byte arg0) {
        ++field6216;
        if (arg0 <= 114) {
            this.method355((class322) null, true);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lvm;I)V")
    public final void method352(class322 arg0, int arg1) {
        if (arg1 == 0) {
            ++field6198;
            class396 var3 = this.field6210.method258(arg0, super.field2776, 131072, super.field2775, -1, true, true);
            if (var3 != null) {
                this.field6210.method262(super.field2776 >> 7, arg0, super.field2775 >> 7, super.field2776 >> 7, false, false, var3, super.field2775 >> 7);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "(B)V")
    public static void method2634(byte arg0) {
        field6196 = null;
        field6195 = null;
        if (arg0 != 86) {
            field6196 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lvm;II)Ljn;")
    public final class396 method349(class322 arg0, int arg1, int arg2) {
        ++field6212;
        if (arg1 != -24206) {
            method2635(-15, (byte) -72);
        }
        return this.field6210.method258(arg0, 0, arg2, 0, -1, false, false);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
    public static final void method2635(int arg0, byte arg1) {
        if (arg1 != 97) {
            method2633(-66, (byte) 55, -112, 29);
        }
        class250.field3434 = 1000 / arg0;
        ++field6200;
    }
}
