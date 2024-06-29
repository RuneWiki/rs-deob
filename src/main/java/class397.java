import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class397 extends class450 {

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Lkaa;")
    public static class47 field5532 = new class47(55, -1);

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field5539 = 0;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "Lkg;")
    public static class275 field5538 = new class275(14, 0, 4, 1);

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "Lqj;")
    public static class512 field5535;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BII)V")
    public static final void method2331(byte arg0, int arg1, int arg2) {
        ++field5536;
        class127 var3 = class760.method4231(arg1, -874792672, 13);
        var3.method1010(614);
        if (arg0 > 7) {
            var3.field2099 = arg2;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (arg0 != 98) {
            field5538 = null;
        }
        ++field5527;
        if (this.method2333(2)) {
            if (super.field6171.field3913.method3277((byte) 76) && !class33.method280(super.field6171.field3913.method3282(true), true)) {
                super.field6170 = 1;
            }
            if (~super.field6171.field3909.method2537(true) == -2) {
                super.field6170 = 1;
            }
        }
        if (~super.field6170 == -4) {
            super.field6170 = 2;
        }
        if (super.field6170 < 0 || ~super.field6170 < -4) {
            super.field6170 = this.method68(false);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        if (arg0) {
            this.method2332(-71);
        }
        ++field5528;
        return 0;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)Z")
    public final boolean method2332(int arg0) {
        if (arg0 != 260) {
            method2331((byte) -42, 56, 111);
        }
        ++field5541;
        return true;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)Z")
    public final boolean method2333(int arg0) {
        ++field5529;
        return arg0 != 2 ? false : class327.method1975(super.field6170, -120);
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lup;)V")
    public class397(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field5530;
        if (class327.method1975(arg1, -125)) {
            if (super.field6171.field3913.method3277((byte) -122) && !class33.method280(super.field6171.field3913.method3282(true), true)) {
                return 3;
            }
            if (~super.field6171.field3909.method2537(true) == -2) {
                return 3;
            }
        }
        if (~arg1 == -4) {
            return 3;
        } else {
            if (arg0 != 0) {
                field5539 = -120;
            }
            return class327.method1975(arg1, -124) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/io/File;B)[B")
    public static final byte[] method2334(File arg0, byte arg1) {
        ++field5540;
        if (arg1 > -92) {
            field5535 = null;
        }
        return class93.method697(9233, (int) arg0.length(), arg0);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)I")
    public final int method2335(boolean arg0) {
        ++field5533;
        if (!arg0) {
            field5537 = -46;
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V")
    public static void method2336(int arg0) {
        field5535 = null;
        field5532 = null;
        field5538 = null;
        int var1 = 5 % ((-34 - arg0) / 59);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2337(byte arg0, String arg1) {
        ++field5534;
        if (arg0 >= -107) {
            field5532 = null;
        }
        return class565.method3124(10, true, 25744, arg1);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        if (!arg0) {
            method2331((byte) 14, -103, -53);
        }
        super.field6170 = arg1;
        ++field5531;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(ILup;)V")
    public class397(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZBI)Lww;")
    public static final class733 method2338(boolean arg0, byte arg1, int arg2) {
        ++field5526;
        if (arg1 <= 111) {
            field5539 = 119;
        }
        class687[] var3 = class690.field9596;
        synchronized (class690.field9596) {
            class733 var4;
            if (~class690.field9596.length < ~arg2 && !class690.field9596[arg2].method3871(false)) {
                var4 = (class733) class690.field9596[arg2].method3869(true);
                var4.method2815(-127);
                int var10002 = class596.field7752[arg2]--;
            } else {
                var4 = new class733();
                var4.field10150 = new class364[arg2];
                for (int var5 = 0; ~var5 > ~arg2; ++var5) {
                    var4.field10150[var5] = new class364();
                }
            }
            var4.field10149 = arg0;
            return var4;
        }
    }
}
