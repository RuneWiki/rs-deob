import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class641 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field9292 = 0;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "[Lnda;")
    public static class537[] field9293 = new class537[2048];

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
    public static boolean field9295;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1951(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1949(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([BI)V")
    public abstract void method1950(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Z")
    public static final boolean method3694(int arg0) {
        field9294++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class601.field8522.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class601.field8522.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            if (arg0 != 0) {
                method3694(-112);
            }
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class601.field8522.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class401.field6000.get(var9);
                        Class var11 = (Class) class601.field8522.get(var9);
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
        class601.field8522 = var1;
        return class601.field8522.isEmpty();
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
    public static void method3695(int arg0) {
        field9293 = null;
        if (arg0 != -23543) {
            method3695(52);
        }
    }
}
