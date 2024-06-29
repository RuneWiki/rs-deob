import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class565 {

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Lmha;")
    public static class419 field7433 = new class419(9, 2);

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Lkaa;")
    public static class47 field7439 = new class47(40, 2);

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field7440 = 0;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "[I")
    public static int[] field7441 = new int[1000];

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field7430;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field7431;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public int field7432;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field7438;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Lon;")
    public static class340 field7435;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method3122(int arg0, byte arg1) {
        field7437++;
        class127 var2 = class760.method4231(arg0, -874792672, 10);
        if (arg1 <= 92) {
            method3122(81, (byte) -11);
        }
        var2.method1002(-117);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method3123(boolean arg0) {
        field7429++;
        if (class200.field3012 != null) {
            return;
        }
        int var1 = class348.field4882;
        int var2 = class733.field10148;
        int var3 = class201.field3018 - class228.field3251 - var1;
        int var4 = class749.field10428 - class199.field2993 - var2;
        if (arg0) {
            method3122(-60, (byte) -100);
        }
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class218.field3143 != null) {
                var5 = class218.field3143;
            } else if (class514.field6818 == null) {
                var5 = class670.field9145;
            } else {
                var5 = class514.field6818;
            }
            int var6 = 0;
            int var7 = 0;
            if (class218.field3143 == var5) {
                Insets var8 = class218.field3143.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class749.field10428);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class201.field3018, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class201.field3018 - var3, var7, var3, class749.field10428);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class749.field10428 + var7 - var4, class201.field3018, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZILjava/lang/String;)I", line = 94)
    public static final int method3124(int arg0, boolean arg1, int arg2, String arg3) {
        if (arg2 != 25744) {
            method3126(-28, 116, 11, (byte) 45, 125);
        }
        field7434++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 173)
    public static void method3125(int arg0) {
        field7441 = null;
        field7435 = null;
        field7439 = null;
        field7433 = null;
        if (arg0 >= -65) {
            field7435 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIBI)V", line = 194)
    public static final void method3126(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field7436++;
        float var5 = (float) class744.field10359 / (float) class744.field10367;
        int var6 = arg1;
        int var7 = arg0;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg2 - (arg0 - var7) / 2;
        int var9 = arg4 - (arg1 - var6) / 2;
        if (arg3 > -125) {
            return;
        }
        class347.field4871 = -1;
        class432.field5949 = class744.field10359 - (class744.field10359 * var8 / var7);
        class194.field2929 = class744.field10367 * var9 / var6;
        class663.field8853 = -1;
        class229.method1457((byte) -7);
    }
}
