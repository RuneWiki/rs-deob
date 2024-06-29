import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class214 extends class648 {

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "F")
    public static float field3193 = 1.0F;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "Lqe;")
    public static class469 field3195 = new class469(95, 1);

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI)V")
    public final void method1448(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field3195 = null;
        }
        ++field3196;
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)Z")
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            this.method1451(true, true);
        }
        ++field3203;
        return false;
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "(I)V")
    public final void method1450(int arg0) {
        if (arg0 >= -67) {
            field3195 = null;
        }
        ++field3198;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZZ)V")
    public final void method1451(boolean arg0, boolean arg1) {
        ++field3194;
        if (arg0) {
            this.method1449(12);
        }
    }

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)V")
    public static void method1452(int arg0) {
        field3195 = null;
        if (arg0 != -13222) {
            method1454(true, -55);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BII)V")
    public final void method1453(byte arg0, int arg1, int arg2) {
        ++field3197;
        if (arg0 <= 33) {
            this.method1451(true, true);
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(ZI)Lbh;")
    public static final class37 method1454(boolean arg0, int arg1) {
        ++field3192;
        if (!arg0) {
            return null;
        } else {
            class37[] var2 = class748.method4179(arg0);
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class37 var4 = var2[var3];
                if (~var4.field374 == ~arg1) {
                    return var4;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lbca;II)V")
    public final void method1455(class663 arg0, int arg1, int arg2) {
        super.field9139.method2294(arg0, -2);
        ++field3200;
        if (arg1 != 12885) {
            field3195 = null;
        }
        super.field9139.method2353((byte) -81, arg2);
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lwu;)V")
    public class214(class373 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
    public static final int method1456(int arg0, int arg1) {
        if (arg0 != 95) {
            method1456(92, -25);
        }
        ++field3199;
        return arg1 >>> 8;
    }
}
