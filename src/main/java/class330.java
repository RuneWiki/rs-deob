import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class330 extends class185 {

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
    public int[] field4837;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
    public int[] field4833;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4834 = -1;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field4836 = 0;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "F")
    public static float field4838;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)I")
    public static final int method2116(int arg0) {
        field4839++;
        if (arg0 != -1) {
            field4834 = 20;
        }
        return class353.field5149;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(II[I[I)V")
    public class330(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4837 = arg2;
        this.field4833 = arg3;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)Z")
    public static final boolean method2117(int arg0) {
        if (arg0 != 0) {
            method2117(83);
        }
        field4835++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class355.field5166.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class355.field5166.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class355.field5166.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class285.field3858.get(var9);
                        Class var11 = (Class) class355.field5166.get(var9);
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
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class355.field5166 = var1;
        return class355.field5166.isEmpty();
    }
}
