import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class669 {

    @OriginalMember(owner = "client!us", name = "t", descriptor = "F")
    public static float field8;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        ++field9;
        return arg0 != 9567;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lej;)V")
    public class1(class111 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BII)V")
    public final void method2(byte arg0, int arg1, int arg2) {
        ++field1;
        if (arg0 <= 77) {
            field8 = -0.33671162F;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lkca;IIILoa;Lub;Lee;B)V")
    public static final void method3(class76 arg0, int arg1, int arg2, int arg3, class651 arg4, class20 arg5, class634 arg6, byte arg7) {
        ++field5;
        if (arg7 != 72) {
            method3((class76) null, -65, -72, 16, (class651) null, (class20) null, (class634) null, (byte) 41);
        }
        int var8 = arg5.field322 - arg2 / 2 - 5;
        int var9 = arg3 + 2;
        if (arg6.field8555 != 0) {
            arg4.method3567(arg2 - -10, var8, arg3 + 1 - (-(arg0.method596() * arg1) + var9), var9, arg6.field8555, (byte) 122);
        }
        if (~arg6.field8530 != -1) {
            arg4.method3572((byte) -33, var8, arg6.field8530, -var9 + arg3 + arg1 * arg0.method596() + 1, var9, arg2 - -10);
        }
        int var10 = arg6.field8546;
        if (arg5.field318 && arg6.field8539 != -1) {
            var10 = arg6.field8539;
        }
        for (int var11 = 0; ~var11 > ~arg1; ++var11) {
            String var12 = class161.field2546[var11];
            if (var11 < arg1 + -1) {
                var12 = var12.substring(0, -4 + var12.length());
            }
            arg0.method597(arg4, var12, arg5.field322, arg3, var10, true);
            arg3 += arg0.method596();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
    public final void method4(boolean arg0, int arg1) {
        ++field4;
        if (arg1 != 9512) {
            this.method4(true, 77);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZZ)V")
    public final void method5(boolean arg0, boolean arg1) {
        ++field2;
        if (arg1) {
            this.method6(-74);
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V")
    public final void method6(int arg0) {
        if (arg0 != -21106) {
            this.method2((byte) -75, -88, 23);
        }
        ++field3;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILnq;)V")
    public final void method7(int arg0, int arg1, class430 arg2) {
        if (arg1 == -21254) {
            super.field9490.method897(arg2, true);
            ++field6;
            super.field9490.method858(arg0, 25681);
        }
    }
}
