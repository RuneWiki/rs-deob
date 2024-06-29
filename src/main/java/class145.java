import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class145 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "Z")
    public static boolean field2122 = false;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "[Lcu;")
    public static class199[] field2123 = new class199[6];

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Ldh;")
    public static class290 field2120;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method1033(int arg0) {
        if (arg0 == -1684) {
            field2120 = null;
            field2123 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1034(int arg0, String arg1) {
        field2124++;
        if (!class363.field5182.field49) {
            return -1;
        } else if (class336.field4959.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class347.method2146(-2, arg1);
            if (var2 == null) {
                return -1;
            }
            String var3 = class374.field5333 + var2;
            if (!class451.field6502.method2978("", (byte) -128, var3)) {
                return -1;
            } else if (class451.field6502.method3001(var3, false)) {
                int var4 = -94 / ((arg0 - 23) / 42);
                byte[] var5 = class451.field6502.method3009("", var3, 0);
                Object var6 = null;
                File var7;
                try {
                    var7 = class154.method1077(false, var2);
                } catch (RuntimeException var11) {
                    return -1;
                }
                if (var5 == null || var7 == null) {
                    return -1;
                }
                boolean var8 = true;
                byte[] var9 = class389.method2400((byte) -71, var7);
                if (var9 != null && var5.length == var9.length) {
                    for (int var10 = 0; var10 < var9.length; var10++) {
                        if (var5[var10] != var9[var10]) {
                            var8 = false;
                            break;
                        }
                    }
                } else {
                    var8 = false;
                }
                try {
                    if (!var8) {
                        class363.field5182.method21(var5, (byte) 67, var7);
                    }
                } catch (Throwable var12) {
                    return -1;
                }
                class650.method3598(-20878, arg1, var7);
                return 100;
            } else {
                return class451.field6502.method2996(var3, (byte) -80);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)I")
    public static final int method1035(int arg0, int arg1) {
        field2121++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == arg1 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
