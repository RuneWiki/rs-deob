import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class740 extends class512 {

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "Lpaa;")
    public static class712 field10315 = null;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field10320;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(JI)V")
    public static final void method4124(long arg0, int arg1) {
        ++field10320;
        if (arg0 > 0L) {
            if (~(arg0 % 10L) != -1L) {
                class468.method2789(arg0, 119);
            } else {
                class468.method2789(arg0 + -1L, 121);
                class468.method2789(1L, 109);
            }
            if (arg1 <= 41) {
                field10315 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        if (arg0 != 6) {
            field10315 = null;
        }
        ++field10316;
        super.field7153.method2882((byte) -103, false);
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lpga;)V")
    public class740(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZ)V")
    public final void method33(boolean arg0, boolean arg1) {
        ++field10321;
        if (!arg0) {
            field10315 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)V")
    public static void method4125(int arg0) {
        field10315 = null;
        if (arg0 != 0) {
            method4127(-27, (class120) null, (byte) -88, 102, -72);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V")
    public static final void method4126(int arg0, int arg1) {
        ++field10322;
        class230.field3201 = 1000000000L / (long) arg1;
        if (arg0 < 27) {
            field10315 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILrea;BII)V")
    public static final void method4127(int arg0, class120 arg1, byte arg2, int arg3, int arg4) {
        arg1.field1653.method199(true, arg4);
        ++field10314;
        arg1.field1653.method175(arg0, -16904);
        int var5 = -52 / ((arg2 - 62) / 50);
        arg1.field1653.method154(false, arg3);
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        ++field10323;
        int var2 = -112 / ((arg0 - -72) / 37);
        return true;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILlo;)V")
    public final void method40(int arg0, int arg1, class117 arg2) {
        super.field7153.method2933((byte) -106, arg2);
        ++field10318;
        if (arg1 != -37) {
            field10315 = null;
        }
        super.field7153.method2881(arg0, arg1 + 36);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZ)V")
    public final void method38(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field10319;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)V")
    public final void method36(int arg0, boolean arg1) {
        if (arg0 > -62) {
            field10315 = null;
        }
        super.field7153.method2882((byte) -61, true);
        ++field10317;
    }
}
