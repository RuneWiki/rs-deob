import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class458 extends class324 {

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field6840 = 0;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field6842 = 0;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field6841;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6843;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I")
    public abstract int method227(int arg0);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
    public abstract int method230(byte arg0);

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)J")
    public abstract long method229(int arg0);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Lmf;")
    public static final class356 method2824(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1175;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Z")
    public static final boolean method2825(String arg0, boolean arg1, Class arg2) {
        field6841++;
        Class var3 = (Class) class304.field4472.get(arg0);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        Object var4 = null;
        File var5 = (File) class463.field6891.get(arg0);
        if (arg1) {
            method2825(null, true, null);
        }
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg2, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class304.field4472.put(arg0, arg2);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class304.field4472.put(arg0, field6843 == null ? (field6843 = method2826("mi")) : field6843);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)I")
    public abstract int method231(int arg0);

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)I")
    public abstract int method228(int arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2826(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
