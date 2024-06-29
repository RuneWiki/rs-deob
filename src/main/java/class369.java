import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class369 extends class649 {

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (super.field9224.method2294((byte) -128)) {
            super.field9223 = 0;
        }
        ++field5613;
        if (super.field9223 != arg0 && ~super.field9223 != -1) {
            super.field9223 = this.method135(78);
        }
    }

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)Z")
    public final boolean method2360(int arg0) {
        if (arg0 != -16181) {
            return true;
        } else {
            ++field5611;
            return !super.field9224.method2294((byte) -106);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            this.method129(69, (byte) -101);
        }
        ++field5615;
        return super.field9224.method2294((byte) -124) ? 3 : 1;
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lhs;)V")
    public class369(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 < -120) {
            super.field9223 = arg0;
            ++field5619;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5616;
        if (arg0 != 256) {
            field5618 = -124;
        }
        for (class31 var7 = (class31) class383.field5749.method3272(-127); var7 != null; var7 = (class31) class383.field5749.method3274(false)) {
            if (var7.field294 <= class199.field3403) {
                var7.method3610(arg0 ^ -24801);
            } else {
                class165.method1233(arg1, (var7.field295 << 9) + 256, var7.field299, arg2, (var7.field289 << 9) - -256, (byte) -117, arg3 >> 1, var7.field298 * 2, arg4 >> 1);
                class257.field4034.method2473(false, 0, var7.field292, class457.field6635[1] + arg5, -16777216 | var7.field290, class457.field6635[0] + arg6);
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field5612;
        int var2 = 53 % ((arg0 - -18) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(ILhs;)V")
    public class369(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)I")
    public final int method2362(int arg0) {
        if (arg0 != 3) {
            field5618 = 104;
        }
        ++field5614;
        return super.field9223;
    }
}
