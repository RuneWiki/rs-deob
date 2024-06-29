import java.awt.Frame;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class170 {

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field2573 = -1;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lud;")
    public static class2 field2575 = new class2();

    @OriginalMember(owner = "client!j", name = "m", descriptor = "[I")
    public static int[] field2580 = new int[128];

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field2581 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lub;")
    public static class92 field2571;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lub;")
    public static class92 field2578;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field2582;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field2584;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[I")
    public static int[] field2583;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static final void method1222(int arg0) {
        field2574++;
        try {
            Method var1 = (field2584 == null ? (field2584 = method1229("java.lang.Runtime")) : field2584).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class49.field805 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 != 1) {
            method1224(92, (byte) -106, -40, 64, 9);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method1223(boolean arg0, String arg1) {
        field2579++;
        long var2 = 0L;
        if (!arg0) {
            method1227(-8, -123);
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBIII)V")
    public static final void method1224(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg0 > arg4) {
            for (int var5 = arg4; var5 < arg0; var5++) {
                class55.field872[var5][arg3] = arg2;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; var6++) {
                class55.field872[var6][arg3] = arg2;
            }
        }
        if (arg1 > -7) {
            field2573 = -6;
        }
        field2576++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method1225(int arg0, int arg1) {
        class198 var2 = (class198) class94.field1480.method2043((long) arg1, arg0);
        field2570++;
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field3086.length; var3++) {
                var2.field3086[var3] = -1;
                var2.field3078[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method1226(int arg0) {
        field2575 = null;
        field2582 = null;
        field2571 = null;
        field2578 = null;
        field2583 = null;
        field2580 = null;
        if (arg0 != -123) {
            field2582 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
    public static final void method1227(int arg0, int arg1) {
        field2577++;
        class303.method2026(false);
        class279.method1897(-10755);
        int var2 = class206.method1439(-124, arg0).field1907;
        if (var2 == 0) {
            return;
        }
        int var3 = class257.field4090[arg0];
        if (~var2 == arg1) {
            class62.field975 = var3;
        }
        if (var2 == 9) {
            class135.field2016 = var3;
        }
        if (var2 == 5) {
            class291.field4524 = var3;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2568++;
        if (arg0 >= 1 && arg4 >= 1 && arg0 <= 102 && arg4 <= 102) {
            if (!class110.method819(false) && (client.field2390[0][arg0][arg4] & 0x2) == 0) {
                int var8 = arg3;
                if ((client.field2390[arg3][arg0][arg4] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class230.field3649 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (client.field2390[1][arg0][arg4] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class57.method475(arg0, false, arg5, arg4, var9, arg3, class80.field1236[arg3]);
            if (arg6 >= 0) {
                boolean var10 = class292.field4536;
                class292.field4536 = true;
                class219.method1505(class80.field1236[arg3], arg6, arg0, false, arg4, arg1, (byte) -81, arg3, arg7, var9, false);
                class292.field4536 = var10;
            }
        }
        int var11 = -49 / ((arg2 + 14) / 37);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1229(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
