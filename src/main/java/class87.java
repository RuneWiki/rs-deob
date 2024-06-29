import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class87 {

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Llg;")
    public static class237 field985 = new class237(4);

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Z")
    public static boolean field990 = false;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "Lwq;")
    public static class92 field991 = new class92();

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field989;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field993;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "[[I")
    public static int[][] field992;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method474(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 3)
    public static final void method469(int arg0) {
        if (class185.field2686 == 2) {
            class268.field3812 = 96;
        } else {
            try {
                Method var1 = (field993 == null ? (field993 = method474("java.lang.Runtime")) : field993).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class268.field3812 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field988++;
        if (arg0 != -31) {
            method471(26);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZB)V", line = 38)
    public static final void method470(boolean arg0, byte arg1) {
        field989++;
        class356.method2270(false);
        if (class40.field475 != 30 && class40.field475 != 25) {
            return;
        }
        class433.field6231++;
        if (class433.field6231 < 50 && !arg0) {
            return;
        }
        class433.field6231 = 0;
        if (!class324.field4610 && class146.field1798 != null) {
            class49.field580++;
            class62.field718.method2143(243, -2);
            try {
                class146.field1798.method1337(class62.field718.field3320, (byte) 121, 0, class62.field718.field3364);
                class62.field718.field3320 = 0;
            } catch (IOException var3) {
                class324.field4610 = true;
            }
        }
        class356.method2270(false);
        int var2 = -94 % ((arg1 - 54) / 52);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 69)
    public static void method471(int arg0) {
        if (arg0 == 4) {
            field991 = null;
            field985 = null;
            field992 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLjava/lang/String;)I", line = 84)
    public static final int method472(int arg0, byte arg1, String arg2) {
        field986++;
        int var3 = -108 / ((27 - arg1) / 35);
        return class337.method2172(arg0, true, arg2, false);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V", line = 99)
    public static final void method473(int arg0, int arg1) {
        class273.field3873 = arg0;
        field987++;
        class237 var2 = class285.field4005;
        synchronized (class285.field4005) {
            class285.field4005.method1618(arg1 + arg1);
        }
    }
}
