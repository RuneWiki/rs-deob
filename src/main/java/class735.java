import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class735 {

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field10206;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field10208;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field10209;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4065(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z", line = 9)
    public static final boolean method4062(Class arg0, String arg1, int arg2) {
        field10206++;
        Class var3 = (Class) class488.field6709.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        int var4 = 38 % ((25 - arg2) / 57);
        File var5 = null;
        if (var5 == null) {
            var5 = (File) class156.field2453.get(arg1);
        }
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg0, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class488.field6709.put(arg1, arg0);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class488.field6709.put(arg1, field10209 == null ? (field10209 = method4065("sw")) : field10209);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lol;Z)Lvba;", line = 79)
    public static final class417 method4063(class431 arg0, boolean arg1) {
        if (!arg1) {
            method4064(-7, -95, 15);
        }
        field10208++;
        int var2 = arg0.method2565((byte) -87);
        return new class417(var2);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)Ljava/lang/String;", line = 92)
    public static final String method4064(int arg0, int arg1, int arg2) {
        field10207++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else {
            int var4 = 83 / ((arg0 - 20) / 39);
            if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }
}
