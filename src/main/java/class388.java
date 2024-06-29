import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class388 {

    @OriginalMember(owner = "client!un", name = "d", descriptor = "F")
    public static float field6014;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field6015;

    // $FF: synthetic field
    @OriginalMember(owner = "client!un", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field6016;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z")
    public static final boolean method2521(Class arg0, int arg1, String arg2) {
        if (arg1 > -57) {
            return false;
        }
        field6015++;
        Class var3 = (Class) class116.field1804.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class191.field3162.get(arg2);
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class116.field1804.put(arg2, arg0);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class116.field1804.put(arg2, field6016 == null ? (field6016 = method2524("wl")) : field6016);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIBIZ)Z")
    public static final boolean method2522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, boolean arg8) {
        field6011++;
        if (arg6 != 31) {
            field6012 = 123;
        }
        int var9 = class567.field8141.field4264[0];
        int var10 = class567.field8141.field4265[0];
        if (var9 < 0 || class275.field4426 <= var9 || var10 < 0 || class417.field6374 <= var10) {
            return false;
        } else if (arg2 >= 0 && arg2 < class275.field4426 && arg0 >= 0 && class417.field6374 > arg0) {
            int var11 = class532.method3219(arg4, arg5, arg2, arg7, class399.field6176, arg3, class10.field172[class567.field8141.field9695], class156.field2677, var9, arg0, arg8, var10, (byte) -121, class567.field8141.method1841(20744), arg1);
            if (var11 < 1) {
                return false;
            }
            class43.field599 = class156.field2677[var11 - 1];
            class473.field7005 = class399.field6176[var11 - 1];
            class353.field5615 = false;
            class354.method2380(40);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)I")
    public static final int method2523(int arg0, int arg1, int arg2) {
        field6013++;
        if (arg1 == 1 || arg1 == 3) {
            return class224.field3608[arg2 & 0x3];
        } else {
            if (arg0 > -103) {
                field6014 = 0.83194005F;
            }
            return class75.field944[arg2 & 0x3];
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2524(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
