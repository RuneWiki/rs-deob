import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class710 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field9837;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 6)
    public static void method3988(int arg0) {
        field9837 = null;
        if (arg0 != -3602) {
            field9837 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZB)V", line = 21)
    public static final void method3989(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field9839++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg2 - 334;
        if (arg5 != -72) {
            method3991(null, (byte) 67);
        }
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class42.field557 - class438.field6047) * var6 / 100 + class438.field6047;
        if (class277.field3859 > var7) {
            var7 = class277.field3859;
        } else if (var7 > class247.field3435) {
            var7 = class247.field3435;
        }
        int var8 = arg2 * 512 * var7 / (arg0 * 334);
        if (var8 < class360.field5074) {
            short var12 = class360.field5074;
            var7 = arg0 * 334 * var12 / (arg2 * 512);
            if (var7 > class247.field3435) {
                var7 = class247.field3435;
                int var13 = arg2 * var7 * 512 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg4) {
                    class341.field4807.method435();
                    class341.field4807.method489(var14, arg5 + 140, arg2, arg1, arg3, -16777216);
                    class341.field4807.method489(var14, arg5 + 177, arg2, arg1, arg3 + arg0 - var14, -16777216);
                }
                arg3 += var14;
                arg0 -= var14 * 2;
            }
        } else if (var8 > class270.field3778) {
            short var9 = class270.field3778;
            var7 = arg0 * var9 * 334 / (arg2 * 512);
            if (class277.field3859 > var7) {
                var7 = class277.field3859;
                int var10 = arg0 * var9 * 334 / (var7 * 512);
                int var11 = (arg2 - var10) / 2;
                if (arg4) {
                    class341.field4807.method435();
                    class341.field4807.method489(arg0, 24, var11, arg1, arg3, -16777216);
                    class341.field4807.method489(arg0, arg5 + 162, var11, arg1 + arg2 - var11, arg3, -16777216);
                }
                arg1 += var11;
                arg2 -= var11 * 2;
            }
        }
        class298.field4234 = (short) arg0;
        class274.field3807 = (short) arg2;
        class420.field5783 = arg3;
        class43.field564 = arg2 * var7 / 334;
        class622.field8289 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZZZLff;)V", line = 118)
    public static final void method3990(boolean arg0, boolean arg1, boolean arg2, class8 arg3) {
        field9840++;
        int var4 = arg3.field161;
        int var5 = (int) arg3.field8680;
        arg3.method3564(!arg0);
        if (arg2) {
            class439.method2532(-118, var4);
        }
        class307.method1898(var4, 28986);
        if (arg0) {
            return;
        }
        class672 var6 = class21.method225(65535, var5);
        if (var6 != null) {
            class399.method2347(var6, 2260);
        }
        class653.method3556(-107);
        if (!arg1 && class443.field6101 != -1) {
            class2.method18(1, class443.field6101, (byte) 126);
        }
        class425 var7 = new class425(class350.field4925);
        for (class8 var8 = (class8) var7.method2454((byte) -46); var8 != null; var8 = (class8) var7.method2453(20322)) {
            if (!var8.method3566((byte) 78)) {
                var8 = (class8) var7.method2454((byte) 59);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field157 == 3) {
                int var9 = (int) var8.field8680;
                if ((var9 >>> 16) == var4) {
                    method3990(false, arg1, true, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 175)
    public static final void method3991(String arg0, byte arg1) {
        field9838++;
        if (class475.field6519 == null) {
            class561.method3113((byte) 23);
        }
        class84.field1019.setTime(new Date(class375.method2193(116)));
        if (arg1 <= 73) {
            field9837 = null;
        }
        int var2 = class84.field1019.get(11);
        int var3 = class84.field1019.get(12);
        int var4 = class84.field1019.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class323.method1958(123, arg0, '\n');
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class723.field10069; var8 > 0; var8--) {
                class475.field6519[var8] = class475.field6519[var8 - 1];
            }
            class475.field6519[0] = var5 + ": " + var6[var7];
            if (class260.field3626 != null) {
                try {
                    class260.field3626.write(class136.method1061(true, class475.field6519[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if (class723.field10069 < (class475.field6519.length - 1)) {
                class723.field10069++;
                if (class313.field4476 > 0) {
                    class313.field4476++;
                }
            }
        }
    }
}
