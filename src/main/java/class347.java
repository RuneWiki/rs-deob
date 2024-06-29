import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class347 extends class338 implements class323 {

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "Luc;")
    public class200 field4430;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "Z")
    private boolean field4425;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "[Lf;")
    public static class404[] field4436;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;B)V")
    public final void method421(class129 arg0, byte arg1) {
        this.field4430.method1282(arg0, (byte) 112);
        if (arg1 > -88) {
            method2044(21, -104, (class441) null, 74, false, -54);
        }
        ++field4422;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILqa;)Lc;")
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        ++field4431;
        return arg1 != -32039 ? null : this.field4430.method1280(false, 0, 0, 0, arg0, false, arg2);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLrn;ZIILqa;I)V")
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        if (arg0 != 91) {
            this.method418(60);
        }
        ++field4426;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
    public static void method2042(int arg0) {
        field4436 = null;
        if (arg0 != 0) {
            method2042(-54);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)I")
    public final int method414(int arg0) {
        if (arg0 != 17350) {
            method2042(2);
        }
        ++field4434;
        return this.field4430.field2597;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)I")
    public final int method413(int arg0) {
        ++field4420;
        if (arg0 != -30502) {
            field4436 = null;
        }
        return this.field4430.field2565;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
    public static final String method2043(byte arg0, int arg1, boolean arg2) {
        ++field4424;
        if (arg2 && ~arg1 <= -1) {
            return arg0 != 17 ? null : class357.method2089(10, true, arg1, arg2);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)I")
    public final int method415(int arg0) {
        ++field4427;
        if (arg0 != -15317) {
            field4436 = null;
        }
        return this.field4430.field2585;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;I)V")
    public final void method416(class129 arg0, int arg1) {
        this.field4430.method1278(-7278, arg0);
        if (arg1 == 16663) {
            ++field4419;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLqa;)V")
    public final void method175(byte arg0, class129 arg1) {
        if (arg0 != 91) {
            this.method414(-120);
        }
        ++field4432;
        class507 var3 = this.field4430.method1280(true, super.field4314, super.field4317, 0, 262144, true, arg1);
        if (var3 != null) {
            int var4 = super.field4317 >> 7;
            int var5 = super.field4314 >> 7;
            this.field4430.method1279(var4, arg1, var5, var3, var4, false, var5, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZILqa;)Z")
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field4421;
        class507 var5 = this.field4430.method1280(arg1, super.field4314, super.field4317, 0, 131072, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            class142 var6 = arg3.method847();
            var6.method982(super.field4317, super.field4310, super.field4314);
            return var5.method499(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILhs;IZI)Ljava/awt/Frame;")
    public static final Frame method2044(int arg0, int arg1, class441 arg2, int arg3, boolean arg4, int arg5) {
        ++field4433;
        if (!arg2.method2631(-127)) {
            return null;
        } else {
            if (~arg1 == -1) {
                class268[] var6 = class256.method1600(6863, arg2);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var8 < var6.length; ++var8) {
                    if (~var6[var8].field3395 == ~arg0 && ~var6[var8].field3393 == ~arg5 && (arg3 == 0 || var6[var8].field3394 == arg3) && (!var7 || ~var6[var8].field3391 < ~arg1)) {
                        arg1 = var6[var8].field3391;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            if (arg4) {
                method2042(77);
            }
            class277 var9 = arg2.method2624(arg1, arg5, arg0, (byte) -123, arg3);
            while (var9.field3542 == 0) {
                class463.method2773(10L, 44);
            }
            Frame var10 = (Frame) var9.field3541;
            if (var10 == null) {
                return null;
            } else if (var9.field3542 == 2) {
                class388.method2315(0, var10, arg2);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lqa;B)Lvs;")
    public final class465 method172(class129 arg0, byte arg1) {
        ++field4423;
        class507 var3 = this.field4430.method1280(false, super.field4314, super.field4317, 0, 2048, true, arg0);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 12 / ((48 - arg1) / 60);
            class142 var5 = arg0.method847();
            var5.method982(super.field4317, super.field4310, super.field4314);
            class465 var6 = null;
            if (this.field4425) {
                var6 = class92.method635(1, -16461);
            }
            if (this.field4430.field2572 != null) {
                class287 var7 = this.field4430.field2572.method1969();
                arg0.method824(var3, var7, var5, var6 == null ? null : var6.field6843[0], 0);
            } else {
                var3.method520(var5, var6 != null ? var6.field6843[0] : null, 0);
            }
            int var8 = super.field4317 >> 7;
            int var9 = super.field4314 >> 7;
            this.field4430.method1279(var8, arg0, var9, var3, var8, true, var9, (byte) 111);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lqa;Ljt;IIIIIZII)V")
    public class347(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field5368, arg1.field5415);
        this.field4430 = new class200(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field4425 = ~arg1.field5347 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        ++field4429;
        if (arg0 != 5) {
            this.field4430 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
    public final void method418(int arg0) {
        if (arg0 != -14924) {
            this.method416((class129) null, -58);
        }
        ++field4437;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)Z")
    public final boolean method417(boolean arg0) {
        ++field4435;
        if (arg0) {
            method2043((byte) 96, 123, true);
        }
        return this.field4430.method1290(97);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public final void method173(byte arg0) {
        if (arg0 != -32) {
            field4436 = null;
        }
        ++field4428;
        throw new IllegalStateException();
    }
}
