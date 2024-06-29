import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class24 extends class649 {

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field237 = -1;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "[J")
    public static long[] field241;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "[Lov;")
    public static class668[] field240;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)V", line = 6)
    public final void method129(int arg0, byte arg1) {
        if (arg1 >= -120) {
            field240 = null;
        }
        ++field244;
        super.field9223 = arg0;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(ILhs;)V", line = 19)
    public class24(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V", line = 23)
    public static final void method130(int arg0) {
        ++class188.field3138;
        if (arg0 != 1) {
            method131(-7, 51, -33, 38, 93, 53, -36, -118, 74, -114, -49, -73);
        }
        ++field242;
        class540 var1 = class257.method1732(true, class674.field9527, class655.field9332);
        var1.field7707.method1926(class347.method2215(-21383), 65280);
        var1.field7707.method1939(class660.field9408, 1134947720);
        var1.field7707.method1939(class412.field6066, 1134947720);
        var1.field7707.method1926(class654.field9289.field5417.method2495(3), 65280);
        class756.method4211(var1, 115);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIIIIII)V", line = 41)
    public static final void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field239;
        if (class118.method934(arg9, 21)) {
            if (arg8 != -1) {
                field241 = null;
            }
            if (class114.field1763[arg9] == null) {
                client.method2744(class158.field2453[arg9], -1, arg6, arg11, arg7, arg5, arg10, arg4, arg3, arg0, arg2, arg1);
            } else {
                client.method2744(class114.field1763[arg9], -1, arg6, arg11, arg7, arg5, arg10, arg4, arg3, arg0, arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V", line = 59)
    public static void method132(byte arg0) {
        field241 = null;
        if (arg0 > 120) {
            field240 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)I", line = 78)
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            field240 = null;
        }
        ++field246;
        return 1;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V", line = 89)
    public final void method134(int arg0) {
        ++field245;
        if (super.field9224.field5405.method3054(0) && ~super.field9223 == -3) {
            super.field9223 = 1;
        }
        if (~super.field9223 > -1 || super.field9223 > 2) {
            super.field9223 = this.method135(-91);
        }
        if (arg0 != 1) {
            method132((byte) 29);
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lhs;)V", line = 108)
    public class24(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I", line = 111)
    public final int method135(int arg0) {
        ++field238;
        int var2 = 13 % ((-18 - arg0) / 50);
        return 2;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)I", line = 122)
    public final int method136(int arg0) {
        ++field243;
        if (arg0 != 3) {
            this.method135(94);
        }
        return super.field9223;
    }
}
