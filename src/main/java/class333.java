import java.awt.Canvas;
import java.awt.Graphics;
import java.io.File;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class class333 extends class401 {

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4488 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public int field4493;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "Ltm;")
    public static class355 field4490;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ll", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field4496;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[I")
    public int[] field4492;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1968(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1965(boolean arg0) {
        if (arg0) {
            method1966(-27, -100, -51, null, 2);
        }
        field4490 = null;
        field4488 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIILda;I)Lcr;", line = 17)
    public static final class533 method1966(int arg0, int arg1, int arg2, class55 arg3, int arg4) {
        if (arg1 == 16) {
            field4491++;
            return arg3 == null ? null : new class533(arg0, arg2, arg4, arg3.method450(), arg3.method424(), arg3.method415(), arg3.method463(), arg3.method464(), arg3.method420(), arg3.method466());
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Z", line = 38)
    public static final boolean method1967(boolean arg0, String arg1, Class arg2) {
        field4495++;
        Class var3 = (Class) class310.field4287.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        File var4 = null;
        if (!arg0) {
            return true;
        }
        if (var4 == null) {
            var4 = (File) class206.field2875.get(arg1);
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
                class310.field4287.put(arg1, arg2);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class310.field4287.put(arg1, field4496 == null ? (field4496 = method1968("fw")) : field4496);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method864(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method860(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public abstract void method862(Graphics arg0, boolean arg1, int arg2, int arg3);
}
