import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class586 extends class82 {

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field8506 = new String[100];

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field8508;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int[][] var4 = this.method488(0, arg0, arg1 + -12217);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class629.field9033 > var8; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] - -var6[var8]) / 3;
            }
        }
        if (arg1 != 12218) {
            field8506 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ldn;III)Loda;")
    public static final class98 method3403(class438 arg0, int arg1, int arg2, int arg3) {
        ++field8507;
        class374 var4 = new class374(arg0.method2558(100, arg2, arg1));
        class98 var5 = new class98(arg2, var4.method2133(false), var4.method2133(false), var4.method2123(false), var4.method2123(false), ~var4.method2129(-69) == -2, var4.method2129(-77), var4.method2129(-105));
        int var6 = var4.method2129(-70);
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            var5.field1202.method1040(new class80(var4.method2129(-108), var4.method2136(false), var4.method2136(false), var4.method2136(false), var4.method2136(false), var4.method2136(false), var4.method2136(false), var4.method2136(false), var4.method2136(false)), -115);
        }
        if (arg3 > -71) {
            return null;
        } else {
            var5.method604((byte) 123);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBZI)Ljava/lang/String;")
    public static final String method3404(int arg0, byte arg1, boolean arg2, int arg3) {
        ++field8509;
        if (arg3 >= 2 && arg3 <= 36) {
            if (arg2 && arg0 >= 0) {
                int var4 = 2;
                for (int var5 = arg0 / arg3; ~var5 != -1; var5 /= arg3) {
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                if (arg1 != -3) {
                    method3405(90);
                }
                for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                    int var8 = arg0;
                    arg0 /= arg3;
                    int var9 = -(arg0 * arg3) + var8;
                    if (~var9 > -11) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg0, arg3);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class586() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "(I)V")
    public static void method3405(int arg0) {
        field8506 = null;
        if (arg0 <= 73) {
            method3404(-32, (byte) 115, true, 1);
        }
    }
}
