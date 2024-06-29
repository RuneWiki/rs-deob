import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class320 extends class73 {

    @OriginalMember(owner = "client!uea", name = "S", descriptor = "[I")
    public static int[] field4131 = new int[8];

    @OriginalMember(owner = "client!uea", name = "P", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!uea", name = "R", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!uea", name = "T", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!uea", name = "U", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!uea", name = "V", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!uea", name = "Q", descriptor = "Lqg;")
    public static class465 field4129;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IB)Z", line = 12)
    public static final boolean method1881(int arg0, byte arg1) {
        field4130++;
        if (arg1 <= 92) {
            return false;
        } else {
            return arg0 == 1 || arg0 == 3 || arg0 == 5;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIBIII)V", line = 24)
    public static final void method1882(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4132++;
        if (arg4 != -41) {
            return;
        }
        class729 var8 = null;
        for (class729 var9 = (class729) class757.field10565.method3672(-1); var9 != null; var9 = (class729) class757.field10565.method3662(arg4 + 40)) {
            if (var9.field10147 == arg6 && var9.field10154 == arg2 && var9.field10139 == arg3 && var9.field10140 == arg5) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class729();
            var8.field10154 = arg2;
            var8.field10147 = arg6;
            var8.field10139 = arg3;
            var8.field10140 = arg5;
            if (arg2 >= 0 && arg3 >= 0 && class409.field5183 > arg2 && class543.field7597 > arg3) {
                class126.method949((byte) -115, var8);
            }
            class757.field10565.method3671(var8, false);
        }
        var8.field10146 = true;
        var8.field10149 = false;
        var8.field10138 = arg0;
        var8.field10137 = arg1;
        var8.field10148 = arg7;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;)V", line = 69)
    public static final void method1883(byte arg0, String arg1) {
        field4133++;
        if (class404.field5114 == null) {
            class130.method967(2);
        }
        class180.field2519.setTime(new Date(class446.method2525(500)));
        if (arg0 != -60) {
            method1884(-58);
        }
        int var2 = class180.field2519.get(11);
        int var3 = class180.field2519.get(12);
        int var4 = class180.field2519.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class249.method1538('\n', 0, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class5.field47; var8 > 0; var8--) {
                class404.field5114[var8] = class404.field5114[var8 - 1];
            }
            class404.field5114[0] = var5 + ": " + var6[var7];
            if (class505.field7122 != null) {
                try {
                    class505.field7122.write(class692.method3881(arg0 ^ 0x59, class404.field5114[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if (class404.field5114.length - 1 > class5.field47) {
                if (class71.field997 > 0) {
                    class71.field997++;
                }
                class5.field47++;
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "(I)V", line = 134)
    public static void method1884(int arg0) {
        field4129 = null;
        field4131 = null;
        if (arg0 != 0) {
            method1883((byte) 99, null);
        }
    }
}
