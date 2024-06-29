import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class275 extends class161 {

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[I")
    public static int[] field4397 = new int[128];

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field4398;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ka", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field4399;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "[Llf;")
    public static class129[] field4396;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsd;B)I")
    public static final int method1854(class50 arg0, byte arg1) {
        field4398++;
        class226 var2 = arg0.field615;
        if (var2.field3771 != null) {
            var2 = var2.method1619(-124);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 <= 83) {
            return -59;
        }
        int var3 = var2.field3808;
        class349 var4 = arg0.method912(-5);
        if (arg0.field1831) {
            var3 = var2.field3757;
        } else if (arg0.field1851 == var4.field5413 || arg0.field1851 == var4.field5370 || arg0.field1851 == var4.field5379 || arg0.field1851 == var4.field5391) {
            var3 = var2.field3778;
        } else if (arg0.field1851 == var4.field5406 || arg0.field1851 == var4.field5362 || arg0.field1851 == var4.field5398 || arg0.field1851 == var4.field5389) {
            var3 = var2.field3795;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    public static final void method1855(byte arg0) {
        try {
            Method var1 = (field4399 == null ? (field4399 = method1858("java.lang.Runtime")) : field4399).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class452.field6587 = var3;
                } catch (Throwable var5) {
                }
            }
            int var4 = 99 % ((-arg0 - 65) / 47);
        } catch (Exception var6) {
        }
        field4395++;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    public static final void method1856(int arg0) {
        field4394++;
        class52 var1 = class234.field3912;
        synchronized (class234.field3912) {
            int var2 = -114 / ((arg0 + 65) / 37);
            class234.field3912.method336(-85);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static void method1857(byte arg0) {
        field4396 = null;
        if (arg0 > 78) {
            field4397 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1858(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
