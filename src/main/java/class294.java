import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class294 {

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Ljj;")
    public static class237 field4105 = new class237();

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 6)
    public static void method1797(byte arg0) {
        int var1 = 124 / ((arg0 + 57) / 38);
        field4105 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 15)
    public static final long method1798(boolean arg0, String arg1) {
        field4108++;
        if (!arg0) {
            method1799(-24);
        }
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Z", line = 68)
    public static final boolean method1799(int arg0) {
        field4103++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class372.field5157.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class372.field5157.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class372.field5157.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class31.field456.get(var9);
                        Class var11 = (Class) class372.field5157.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var12.size() > var13; var13++) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, Integer.valueOf(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class372.field5157 = var1;
        if (arg0 != -29458) {
            method1798(false, null);
        }
        return class372.field5157.isEmpty();
    }
}
