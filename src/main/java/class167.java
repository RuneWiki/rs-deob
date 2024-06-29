import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class167 extends class168 {

    @OriginalMember(owner = "client!pha", name = "n", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!pha", name = "m", descriptor = "I")
    public int field2321;

    @OriginalMember(owner = "client!pha", name = "p", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!pha", name = "j", descriptor = "Z")
    public boolean field2318;

    @OriginalMember(owner = "client!pha", name = "q", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!pha", name = "l", descriptor = "I")
    public int field2320;

    @OriginalMember(owner = "client!pha", name = "k", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!pha", name = "o", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!pha", name = "r", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!pha", name = "s", descriptor = "I")
    public static int field2327;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pha", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field2328;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z")
    public static final boolean method1168(Class arg0, String arg1, int arg2) {
        field2327++;
        Class var3 = (Class) class593.field8293.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        if (arg2 != 0) {
            field2323 = 29;
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class551.field7694.get(arg1);
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
                class593.field8293.put(arg1, arg0);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class593.field8293.put(arg1, field2328 == null ? (field2328 = method1171("fha")) : field2328);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIIII)V")
    public static final void method1169(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 16184) {
            return;
        }
        for (int var5 = 0; var5 < class654.field9100; var5++) {
            Rectangle var6 = class694.field9642[var5];
            if (var6.x + var6.width > arg4 && arg1 + arg4 > var6.x && (var6.y + var6.height) > arg0 && var6.y < (arg0 + arg2)) {
                class559.field7782[var5] = true;
            }
        }
        field2319++;
        class236.method1478(arg3 ^ 0xFFFFC0BB, arg0, arg1 + arg4, arg4, arg0 + arg2);
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(IIIII)V")
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2326++;
        class37 var5 = class636.method3571(10, arg2, arg1 ^ 0xFFFFFAF7);
        var5.method232(arg1 ^ 0xFFFFFACA);
        if (arg1 != 1335) {
            method1169(-20, -86, 86, -39, 9);
        }
        var5.field582 = arg0;
        var5.field579 = arg3;
        var5.field585 = arg4;
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(IIIIIZ)V")
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2322 = arg1;
        this.field2321 = arg4;
        this.field2324 = arg2;
        this.field2318 = arg5;
        this.field2325 = arg3;
        this.field2320 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1171(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
