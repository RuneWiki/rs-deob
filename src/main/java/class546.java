import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class546 {

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "I")
    public static int field7630;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hha", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field7631;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Z")
    public static final boolean method3214(byte arg0, String arg1, Class arg2) {
        field7629++;
        Class var3 = (Class) class670.field9189.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        if (arg0 < 0) {
            method3214((byte) 99, null, null);
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class664.field9124.get(arg1);
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
                class670.field9189.put(arg1, arg2);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class670.field9189.put(arg1, field7631 == null ? (field7631 = method3217("jh")) : field7631);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
    public static final void method3215(int arg0) {
        if (arg0 > 58) {
            field7628++;
            if (class521.field7389.field9271 && class481.field6724.field4365 != -1) {
                class243.method1466(class481.field6724.field4365, (byte) 89, class481.field6724.field4362);
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V")
    public static final void method3216(int arg0) {
        field7630++;
        if (class382.field4860 != null) {
            for (int var1 = 0; var1 < class680.field9312; var1++) {
                class382.field4860[var1] = null;
            }
            class382.field4860 = null;
        }
        if (class141.field1767 != null) {
            for (int var2 = 0; var2 < class168.field2027; var2++) {
                class141.field1767[var2] = null;
            }
            class141.field1767 = null;
        }
        if (arg0 >= -74) {
            method3214((byte) 46, null, null);
        }
        if (class345.field4315 != null) {
            for (int var3 = 0; var3 < class513.field7243; var3++) {
                class345.field4315[var3] = null;
            }
            class345.field4315 = null;
        }
        class288.field3474 = null;
        class552.field7680 = null;
        class379.field4807 = null;
        class274.field3211 = -1;
        class594.field8079 = -1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3217(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
