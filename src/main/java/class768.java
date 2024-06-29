import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class768 {

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Z")
    public static boolean field10591 = true;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field10593 = new String[100];

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Z")
    public static boolean field10595 = true;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field10590;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Lvr;")
    public static class147 field10592;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lqn;IIIII)Ljava/awt/Frame;", line = 3)
    public static final Frame method4252(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10590++;
        if (!arg0.method620((byte) -10)) {
            return null;
        }
        if (~arg3 == arg1) {
            class103[] var6 = class722.method4027(-128, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1420 == arg2 && var6[var8].field1419 == arg4 && (arg5 == 0 || var6[var8].field1427 == arg5) && (!var7 || arg3 < var6[var8].field1418)) {
                    var7 = true;
                    arg3 = var6[var8].field1418;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class615 var9 = arg0.method613(arg2, arg5, false, arg3, arg4);
        while (var9.field8321 == 0) {
            class438.method2636(true, 10L);
        }
        Frame var10 = (Frame) var9.field8318;
        if (var10 == null) {
            return null;
        } else if (var9.field8321 == 2) {
            class668.method3694(arg0, 119, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z", line = 83)
    public static final boolean method4253(int arg0, int arg1) {
        field10589++;
        if (class634.field8855[arg1]) {
            return true;
        } else if (class777.field10678.method2087(arg1, 0)) {
            int var2 = class777.field10678.method2090(arg1, false);
            if (var2 == 0) {
                class634.field8855[arg1] = true;
                return true;
            }
            if (class111.field1528[arg1] == null) {
                class111.field1528[arg1] = new class668[var2];
            }
            if (arg0 != -3) {
                field10595 = true;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class111.field1528[arg1][var3] == null) {
                    byte[] var4 = class777.field10678.method2095(var3, arg1, 1);
                    if (var4 != null) {
                        class668 var5 = class111.field1528[arg1][var3] = new class668();
                        var5.field9221 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method3699(true, new class376(var4));
                    }
                }
            }
            class634.field8855[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 148)
    public static void method4254(int arg0) {
        field10593 = null;
        if (arg0 != 0) {
            field10592 = null;
        }
        field10592 = null;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)I", line = 163)
    public static final int method4255(int arg0) {
        if (arg0 < 125) {
            return 116;
        } else {
            field10594++;
            return class563.field7551;
        }
    }
}
