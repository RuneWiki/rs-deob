import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class209 {

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field3491 = 52;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Lcb;")
    public static class631 field3493 = new class631(15, 3);

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Laia;")
    public static class257 field3494;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field3495;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1522(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Z", line = 25)
    public static final boolean method1520(String arg0, boolean arg1, Class arg2) {
        if (!arg1) {
            field3491 = 29;
        }
        field3492++;
        Class var3 = (Class) class679.field9565.get(arg0);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class602.field8515.get(arg0);
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
                class679.field9565.put(arg0, arg2);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class679.field9565.put(arg0, field3495 == null ? (field3495 = method1522("lha")) : field3495);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 96)
    public static void method1521(int arg0) {
        field3494 = null;
        int var1 = 76 % ((-arg0 - 24) / 32);
        field3493 = null;
    }
}
