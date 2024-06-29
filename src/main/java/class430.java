import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class430 extends class334 {

    @OriginalMember(owner = "client!eka", name = "J", descriptor = "Lcp;")
    public static class271 field5949 = new class271();

    @OriginalMember(owner = "client!eka", name = "K", descriptor = "Ljava/util/Random;")
    public static Random field5950 = new Random();

    @OriginalMember(owner = "client!eka", name = "E", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!eka", name = "F", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!eka", name = "H", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!eka", name = "I", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!eka", name = "L", descriptor = "Z")
    public static boolean field5951;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIZ)I", line = 3)
    public static final int method2510(int arg0, int arg1, boolean arg2) {
        ++field5945;
        if (arg2) {
            return 0;
        } else {
            class393 var3 = class275.method1745(arg2, (byte) -124, arg1);
            if (arg0 >= -77) {
                method2510(-88, -69, true);
            }
            if (var3 == null) {
                return class510.field7010.method2903(arg1, (byte) 106).field9022;
            } else {
                int var4 = 0;
                for (int var5 = 0; var3.field5458.length > var5; ++var5) {
                    if (~var3.field5458[var5] == 0) {
                        ++var4;
                    }
                }
                return var4 + class510.field7010.method2903(arg1, (byte) 87).field9022 + -var3.field5458.length;
            }
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(ZLha;I)Lrt;", line = 38)
    public static final class470 method2511(boolean arg0, class475 arg1, int arg2) {
        ++field5948;
        class406 var3 = class504.method2948(arg0, arg1, arg2, -1);
        return var3 == null ? null : var3.field5593;
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "()V", line = 51)
    public class430() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eka", name = "g", descriptor = "(I)V", line = 54)
    public static void method2512(int arg0) {
        field5949 = null;
        field5950 = null;
        if (arg0 != 0) {
            field5951 = true;
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lfm;Z)V", line = 69)
    public static final void method2513(class281 arg0, boolean arg1) {
        ++field5947;
        if (!arg1) {
            method2512(-2);
        }
        boolean var2 = false;
        if (~class594.field8494 != ~arg0.field4060 && ~arg0.field4064 != 0 && ~arg0.field4124 == -1) {
            class98 var3 = class168.field2552.method3287(71, arg0.field4064);
            if (var3.field1418 || arg0.field4132 + 1 > var3.field1388[arg0.field4114]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg0.field4099 + arg0.field4060;
            int var5 = -arg0.field4099 + class594.field8494;
            int var6 = arg0.field4079 * 512 + arg0.method209(true) * 256;
            int var7 = arg0.field4070 * 512 + 256 * arg0.method209(true);
            int var8 = arg0.field4105 * 512 + arg0.method209(true) * 256;
            int var9 = arg0.field4058 * 512 - -(256 * arg0.method209(true));
            arg0.field10347 = ((-var5 + var4) * var6 + var5 * var8) / var4;
            arg0.field10350 = ((-var5 + var4) * var7 + var5 * var9) / var4;
        }
        arg0.field4144 = 0;
        if (arg0.field4042 == 0) {
            arg0.method1795(8192, 0, false);
        }
        if (~arg0.field4042 == -2) {
            arg0.method1795(12288, 0, false);
        }
        if (~arg0.field4042 == -3) {
            arg0.method1795(0, 0, false);
        }
        if (arg0.field4042 == 3) {
            arg0.method1795(4096, 0, false);
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(II)[I", line = 125)
    public final int[] method28(int arg0, int arg1) {
        if (arg1 != -22563988) {
            field5950 = null;
        }
        ++field5946;
        int[] var3 = super.field4743.method1027((byte) -128, arg0);
        if (super.field4743.field1993) {
            class171.method1264(var3, 0, class439.field6099, class527.field7361[arg0]);
        }
        return var3;
    }
}
