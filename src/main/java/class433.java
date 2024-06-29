import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class433 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field6015 = 2;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Llk;")
    public static class638 field6018 = new class638(16);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z", line = 7)
    public static final boolean method2598(byte arg0) {
        field6017++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class644.field9022.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class644.field9022.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class644.field9022.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class722.field9959.get(var9);
                        Class var11 = (Class) class644.field9022.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); var13++) {
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
            if (arg0 != -94) {
                return true;
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class644.field9022 = var1;
        return class644.field9022.isEmpty();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 112)
    public static void method2599(int arg0) {
        if (arg0 != 0) {
            method2599(98);
        }
        field6018 = null;
    }
}
