import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class130 extends class698 {

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public int field1467 = -1;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "Ljava/lang/String;")
    public String field1461;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "Ljava/lang/String;")
    public String field1466;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "[Lf;")
    public static class534[] field1465;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 4)
    public static final String method736(boolean arg0, int arg1, int arg2, int arg3) {
        ++field1469;
        if (arg3 >= 2 && ~arg3 >= -37) {
            if (arg0 && ~arg2 <= -1) {
                int var4 = 2;
                int var5 = arg2 / arg3;
                while (~var5 != -1) {
                    var5 /= arg3;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                if (arg1 != 6178) {
                    field1465 = null;
                }
                for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                    int var8 = arg2;
                    arg2 /= arg3;
                    int var9 = -(arg2 * arg3) + var8;
                    if (var9 < 10) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg2, arg3);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB[B)I", line = 53)
    public static final int method737(int arg0, byte arg1, byte[] arg2) {
        int var3 = -98 % ((arg1 - 21) / 37);
        ++field1463;
        return class271.method1593(arg0, arg2, (byte) 124, 0);
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 64)
    public static void method738(int arg0) {
        field1465 = null;
        if (arg0 != -1) {
            method737(67, (byte) -45, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)Ljo;", line = 76)
    public final class504 method739(byte arg0) {
        if (arg0 != 96) {
            this.field1466 = null;
        }
        ++field1470;
        return class212.field2574[super.field9798];
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIIIIB)V", line = 90)
    public static final void method740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        ++field1462;
        if (arg8 != 4) {
            method740(-109, -82, -48, 78, 108, -56, -72, 17, (byte) 78);
        }
        class372.method2165(arg0, arg6, -116, arg5, arg7, arg1, arg3, arg2, arg4, 0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lwp;I)V", line = 106)
    public static final void method741(class452 arg0, int arg1) {
        if (~class386.field5212 == ~arg0.field6436) {
            class313.field3894[arg0.field6317] = true;
        }
        ++field1464;
        if (arg1 != 26034) {
            method738(-42);
        }
    }
}
