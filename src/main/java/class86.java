import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class86 {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lpu;")
    public static class559 field1556 = new class559(9, 4);

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Z")
    public static boolean field1558 = true;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lqaa;")
    public static class27 field1557 = new class27(60, 7);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Leq;")
    public static class209 field1559;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1560;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method817(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Z", line = 4)
    public static final boolean method815(int arg0, String arg1, Class arg2) {
        field1555++;
        Class var3 = (Class) class54.field1029.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        File var4 = null;
        if (arg0 != 7) {
            return false;
        }
        if (var4 == null) {
            var4 = (File) class13.field158.get(arg1);
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg2, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class54.field1029.put(arg1, arg2);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class54.field1029.put(arg1, field1560 == null ? (field1560 = method817("dca")) : field1560);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 73)
    public static void method816(int arg0) {
        field1559 = null;
        field1557 = null;
        if (arg0 == -19292) {
            field1556 = null;
        }
    }
}
