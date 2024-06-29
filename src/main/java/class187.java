import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class187 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[[Z")
    public static boolean[][] field2610 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2612 = new String[100];

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
    public static int[] field2615 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lih;")
    public static class339 field2613;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lwc;")
    public static class380 field2619;

    // $FF: synthetic field
    @OriginalMember(owner = "client!m", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field2620;

    // $FF: synthetic field
    @OriginalMember(owner = "client!m", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field2621;

    // $FF: synthetic field
    @OriginalMember(owner = "client!m", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field2622;

    // $FF: synthetic method
    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1283(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1277(int arg0) {
        class31.field430 = new class33(8);
        field2614++;
        class86.field1065 = arg0;
        for (class314 var1 = (class314) class343.field5049.method2026(100); var1 != null; var1 = (class314) class343.field5049.method2022(10)) {
            var1.method2071();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BIIZLkg;)V", line = 24)
    public static final void method1278(byte arg0, int arg1, int arg2, boolean arg3, class223 arg4) {
        field2618++;
        int var5 = arg4.field3233;
        if (arg4.field3325 == 0) {
            arg4.field3233 = arg4.field3358;
        } else if (arg4.field3325 == 1) {
            arg4.field3233 = arg2 - arg4.field3358;
        } else if (arg4.field3325 == 2) {
            arg4.field3233 = arg4.field3358 * arg2 >> 14;
        }
        int var6 = arg4.field3352;
        if (arg4.field3244 == 0) {
            arg4.field3352 = arg4.field3251;
        } else if (arg4.field3244 == 1) {
            arg4.field3352 = arg1 - arg4.field3251;
        } else if (arg4.field3244 == 2) {
            arg4.field3352 = arg4.field3251 * arg1 >> 14;
        }
        if (arg4.field3325 == 4) {
            arg4.field3233 = arg4.field3352 * arg4.field3298 / arg4.field3351;
        }
        if (arg4.field3244 == 4) {
            arg4.field3352 = arg4.field3351 * arg4.field3233 / arg4.field3298;
        }
        if (class159.field2133 && (client.method1811(arg4).field4926 != 0 || arg4.field3216 == 0)) {
            if (arg4.field3352 < 5 && arg4.field3233 < 5) {
                arg4.field3233 = 5;
                arg4.field3352 = 5;
            } else {
                if (arg4.field3233 <= 0) {
                    arg4.field3233 = 5;
                }
                if (arg4.field3352 <= 0) {
                    arg4.field3352 = 5;
                }
            }
        }
        if (arg0 <= 94) {
            method1281((String) null, 109);
        }
        if (class135.field1850 == arg4.field3357) {
            class163.field2162 = arg4;
        }
        if (arg3 && arg4.field3274 != null && arg4.field3233 != var5 || arg4.field3352 != var6) {
            class288 var7 = new class288();
            var7.field4218 = arg4.field3274;
            var7.field4217 = arg4;
            class166.field2188.method2484(0, var7);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/awt/Canvas;IILgt;BLic;)Lfp;", line = 104)
    public static final class9 method1279(Canvas arg0, int arg1, int arg2, class341 arg3, byte arg4, class235 arg5) {
        field2617++;
        try {
            if (arg4 != 51) {
                field2612 = null;
            }
            Class var6 = Class.forName("ks");
            Constructor var7 = var6.getConstructor(field2620 == null ? (field2620 = method1283("java.awt.Canvas")) : field2620, field2621 == null ? (field2621 = method1283("ic")) : field2621, Integer.TYPE, Integer.TYPE, field2622 == null ? (field2622 = method1283("gt")) : field2622);
            return (class9) var7.newInstance(arg0, arg5, Integer.valueOf(arg1), new Integer(arg2), arg3);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)V", line = 133)
    public static final void method1280(byte arg0, String arg1) {
        class180.field2554 = arg1;
        field2611++;
        if (class267.field3963.field5023 == null) {
            return;
        }
        try {
            String var2 = class267.field3963.field5023.getParameter("cookieprefix");
            String var3 = class267.field3963.field5023.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class138.method918(class43.method364(-16756) + 94608000000L, (byte) 115) + "; Max-Age=" + 94608000L;
            }
            class73.method520(114, "document.cookie=\"" + var5 + "\"", class267.field3963.field5023);
        } catch (Throwable var7) {
        }
        int var6 = 12 / ((-arg0 - 19) / 46);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 182)
    public static final String method1281(String arg0, int arg1) {
        if (arg1 != 19990) {
            field2615 = null;
        }
        field2616++;
        String var2 = class239.method1606(class91.method619(-58, arg0), (byte) -105);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 204)
    public static void method1282(byte arg0) {
        field2612 = null;
        field2613 = null;
        if (arg0 == -80) {
            field2619 = null;
            field2615 = null;
            field2610 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[I)V")
    public abstract void method829(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public abstract void method831(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V")
    public abstract void method823(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public abstract void method833(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
    public abstract void method827();

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V")
    public abstract void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public abstract void method830(int arg0);

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public abstract void method821(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lm;)V")
    public abstract void method832(class187 arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([I)V")
    public abstract void method825(int[] arg0);

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public abstract void method828(int arg0);

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public abstract void method826(int arg0);
}
