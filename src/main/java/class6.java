import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lte;")
    public class560 field49 = null;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[Lae;")
    private class228[] field48 = null;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[Lae;")
    public class228[] field53 = null;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
    public boolean field50;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field52;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field54;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Z")
    public static final boolean method27(Class arg0, String arg1, byte arg2) {
        if (arg2 <= 31) {
            method27(null, null, (byte) -31);
        }
        field51++;
        Class var3 = (Class) class351.field4598.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        Object var4 = null;
        File var5 = (File) class168.field2012.get(arg1);
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
                class351.field4598.put(arg1, arg0);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class351.field4598.put(arg1, field54 == null ? (field54 = method29("hw")) : field54);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Z")
    public final boolean method28(boolean arg0) {
        if (arg0) {
            method27(null, null, (byte) 15);
        }
        field52++;
        if (this.field50) {
            return this.field49 != null;
        } else {
            return this.field53 != null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lfo;)V")
    public class6(class473 arg0) {
        this.field50 = arg0.field6799;
        if (this.field50 && !arg0.method1192(class234.field2984, class271.field3429, 104)) {
            this.field50 = false;
        }
        if (this.field50 || arg0.method1169(class234.field2984, class271.field3429, (byte) 124)) {
            class587.method3293((byte) -86);
            if (this.field50) {
                byte[] var2 = class548.method3100(false, (byte) 33, class69.field747);
                this.field49 = arg0.method1187(var2, 16, class234.field2984, (byte) -53, 128, 128);
                byte[] var3 = class548.method3100(false, (byte) 74, class263.field3328);
                arg0.method1187(var3, 16, class234.field2984, (byte) -107, 128, 128);
            } else {
                this.field53 = new class228[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class386.method2116(32768, class69.field747, var4 * 32768, (byte) -65);
                    this.field53[var4] = arg0.method2741(class234.field2984, true, var7, 128, (byte) 126, 128);
                }
                this.field48 = new class228[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class386.method2116(32768, class263.field3328, var5 * 32768, (byte) 96);
                    this.field48[var5] = arg0.method2741(class234.field2984, true, var6, 128, (byte) 122, 128);
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method29(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
