import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class235 {

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public static int field3639 = -1;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "[I")
    public static int[] field3640 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field3642 = 1337;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "Lsa;")
    public static class187 field3641;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oba", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field3646;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1610(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V", line = 14)
    public static void method1606(byte arg0) {
        if (arg0 > 109) {
            field3640 = null;
            field3641 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method1607(boolean arg0) {
        field3644++;
        if (arg0) {
            method1608(null, 83);
        }
        if (class368.field5267.field47) {
            class266.field4022 = 96;
            return;
        }
        try {
            Method var1 = (field3646 == null ? (field3646 = method1610("java.lang.Runtime")) : field3646).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class266.field4022 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Leca;I)I", line = 69)
    public static final int method1608(class704 arg0, int arg1) {
        field3645++;
        if (class190.field2740 == arg0) {
            return 7681;
        } else if (class153.field2209 == arg0) {
            return 8448;
        } else if (class203.field2875 == arg0) {
            return 34165;
        } else if (class413.field6010 == arg0) {
            return 260;
        } else if (class444.field6468 == arg0) {
            return 34023;
        } else if (arg1 >= -49) {
            return -9;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZII)V", line = 99)
    public static final void method1609(boolean arg0, int arg1, int arg2) {
        field3643++;
        class138 var3 = class642.method3576(arg1, (byte) -122, arg0);
        if (var3 != null) {
            for (int var4 = arg2; var4 < var3.field2009.length; var4++) {
                var3.field2009[var4] = -1;
                var3.field2008[var4] = 0;
            }
        }
    }
}
